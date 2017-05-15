/**
 * Created by sinichiKuda on 5/9/2017.
 */
$(document).ready(function(){
    getTeams(0);
});

function getTeams(){
    $("table#matches_table").hide();
    $(".loader").show();
    var jqxhr = $.get( "/teams", function(data) {
            console.log(data);
            for(var i=0;i<data.length;i++) {
                var str = "<tr>";
                str+="<td>"+data[i].id+"</td>";
                str+="<td><object data='/images/"+data[i].id+".png' type='image/png' class='imgintable'><img class='imgintable' src='/images/3326728.jpg'/></object></td>";
                str+="<td>"+data[i].name+"</td>";

                $("table#matches_table").find("tbody").append(str);
                $("table#matches_table").show();
                $(".loader").hide();
            }
        })
        .done(function() {
            console.log( "second success" );
        })
        .fail(function(e,a,c) {
            console.log(e);
            console.log(a);
            console.log(c);
        });
}