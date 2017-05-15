var dataTeam;
$(document).ready(function(){
    getAllTeam();

})

function getAllTeam(){
    var jqxhr = $.get( "/teams", function(data) {
        dataTeam = data;
        getmatchesbypage(0);
    }).done(function() {
            console.log( "second success" );
        })
        .fail(function() {
            alert( "failed to get data team" );
        });

    ;
}

function getTeamNameById(id){
    for(var i=0;i<dataTeam.length;i++){
        if(dataTeam[i].id===id)return dataTeam[i].name;
    }
    return "unknown";
}

function getmatchesbypage(page) {
    $("table#matches_table").hide();
    $(".loader").show();
    var jqxhr = $.get( "/players?page="+page+"&size=10", function(data) {
            console.log(data);
            $("table#matches_table").find("tbody").html("");
            for(var i=0;i<data.content.length;i++) {
                var str = "<tr>";
                str+="<td>"+data.content[i].id+"</td>";
                str+="<td>"+data.content[i].name+"</td>";
                str+="<td><object data='/images/"+data.content[i].teamId+".png' type='image/png' class='imgintable'><img class='imgintable' src='/images/3326728.jpg'/></object><br/>"+getTeamNameById(data.content[i].teamId)+"</td>";
                $("table#matches_table").find("tbody").append(str);
                $("table#matches_table").show();
                $(".loader").hide();
            }

            var str_pagination = "<ul class='pagination'>";
            if(page>5){
                str_pagination +="<li><a href='#' onclick='getmatchesbypage(0)'>1</a></li>";
                str_pagination +="<li class='disabled'><a>...</a></li>";

            }

            for(var i=(page-5);i<page+5;i++){
                if(i<0)continue;
                if(i>=data.totalPages)continue;

                if(i===page){
                    str_pagination += "<li class='active'><a href='#' onclick='getmatchesbypage(" + i + ")'>" + (i + 1) + "</a></li>";
                }else {
                    str_pagination += "<li><a href='#' onclick='getmatchesbypage(" + i + ")'>" + (i + 1) + "</a></li>";
                }
            }

            if(page<data.totalPages-5){
                str_pagination +="<li class='disabled'><a>...</a></li>";
                str_pagination +="<li><a href='#' onclick='getmatchesbypage("+(data.totalPages-1)+"'>"+(data.totalPages)+"</a></li>";
            }
            str_pagination+="</ul>";
            $("#pagination").html(str_pagination);
        })
        .done(function() {
            console.log( "second success" );
        })
        .fail(function() {
            console.log( "error" );
        });
}
