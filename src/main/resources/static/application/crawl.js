/**
 * Created by sinichiKuda on 5/10/2017.
 */
$(document).ready(function(){
    getCrawlData(0);
})

function getCrawlData(){
    getMatchCrawled();
    getMatchDetailCrawled();
    getPlayerCrawled();
    getTeamCrawled();
    getMatchCount();
    getActiveTeamStat();
}
function getMatchCrawled(){
    var jqxhr = $.get( "/matches?page=0&size=1", function(data) {
            $("#match_crawled").html(data.totalElements);
        })
        .done(function() {
            console.log( "second success" );
        })
        .fail(function() {
            console.log( "error" );
        });
}
function getMatchDetailCrawled(){
    var jqxhr = $.get( "/matchdetail?page=0&size=1", function(data) {
            $("#match_detail_crawled").html(data.totalElements);
        })
        .done(function() {
            console.log( "second success" );
        })
        .fail(function() {
            console.log( "error" );
        });
}
function getPlayerCrawled(){
    var jqxhr = $.get( "/players?page=0&size=1", function(data) {
            $("#player_crawled").html(data.totalElements);
        })
        .done(function() {
            console.log( "second success" );
        })
        .fail(function() {
            console.log( "error" );
        });
}
function getTeamCrawled(){
    var jqxhr = $.get( "/teams?page=0&size=1", function(data) {
            $("#team_crawled").html(data.totalElements);
        })
        .done(function() {
            console.log( "second success" );
        })
        .fail(function() {
            console.log( "error" );
        });
}

function getActiveTeamStat(){
    var jqxhr = $.get( "/activeteams?page=0&size=1", function(data) {
            var label = [];
            var ser = [];
            for(var i=0;i<data.length;i++){
                label.push(data[i].teamname);
                ser.push(data[i].count1);
            }

            new Chartist.Bar('#activeteamstat', {
                labels: label,
                series: [
                    ser,
                ]
            }, {
                seriesBarDistance: 40,
                reverseData: true,
                horizontalBars: true,
                axisY: {
                    offset: 70
                }
            });
        })
        .done(function() {
            console.log( "second success" );
        })
        .fail(function() {
            console.log( "error" );
        });



}

function getMatchCount(){
    var jqxhr = $.get( "/matchescount?page=0&size=1", function(data) {
            //var line1=[['2008-08-12 4:00PM',4], ['2008-09-12 4:00PM',6.5], ['2008-10-12 4:00PM',5.7], ['2008-11-12 4:00PM',9], ['2008-12-12 4:00PM',8.2]];
            var line1 = [];
            for(var i=0;i<data.length;i++){
                var data1 = [];
                data1.push(data[i].date1+" 0:00AM");
                data1.push(data[i].count1);
                line1.push(data1);
            }
            console.log(line1);

            var plot1 = $.jqplot('matchcountstat', [line1], {
                title:'Match Count / day',
                axes:{
                    xaxis:{
                        renderer:$.jqplot.DateAxisRenderer
                    }
                },
                series:[{lineWidth:2, markerOptions:{style:'square',size:2}}]
            });
        })
        .done(function() {
            console.log( "second success" );
        })
        .fail(function() {
            console.log( "error" );
        });
}