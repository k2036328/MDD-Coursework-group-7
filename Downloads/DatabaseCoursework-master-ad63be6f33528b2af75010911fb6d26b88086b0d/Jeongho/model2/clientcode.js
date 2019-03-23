$(document).ready(initialisePage);

function initialisePage()
{
    $("div#niceajaxsearch input").keyup(handleNiceAutoComplete);
}

function handleNiceAutoComplete()
{
    var search = $("div#niceajaxsearch input").val().trim();
    if(search != "")
    {
        $.get("getSelectedBus_service.php?bus="+search,niceAutoCompleteCallback);
    }
    else // if search IS empty
    {
        $("div#niceajaxsearch div.results").hide();
    }
}

function niceAutoCompleteCallback(results)
{
    console.log(results);

    $("div#niceajaxsearch div.results").empty();
    for(var i = 0; i < results.length; i++)
    {
        var result = $('<div class="result">'+results[i]+'</div>');
        result.click(function(){
            $("div#niceajaxsearch div.results").hide();
            $("input[name=bus]").val($(this).text());
            $("form").get(0).submit();
        });
        $("div#niceajaxsearch div.results").append(result);
    }
    if (results.length == 0)
    {
      $("div#niceajaxsearch div.results").hide();
    }
    else {
      $("div#niceajaxsearch div.results").show();
    }
}