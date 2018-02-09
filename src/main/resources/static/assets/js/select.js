function cascade(selector,parentCode){
    var url = "area/loadAreasByParentCode.do";
    url = parentCode?(url+"?parentCode="+parentCode):url;
    $.getJSON(url, function(data){
        var letterStr = '<ul class="letter-group">';
        var dataStr = '<ul class="data-group">';
        var letter;
        for(var i=0;i<data.length;i++){
            var nletter = data[i].pinyin.substr(0,1);
            if(letter==undefined||letter!=nletter){
                letter = nletter;
                letterStr+='<li><a href="javascript:void(0);">'+letter+'</a></li>';
                dataStr+='<li class="group '+letter+'">'+letter+'</li>';
            }
            dataStr+='<li class="'+letter+'" data-code="'+data[i].code+'"><a href="javascript:void(0);">'+data[i].abbreviation+'</a></li>';
        }
        letterStr+='</ul>';
        dataStr+='</ul>';
        $(selector+" dd").html(letterStr+dataStr);
    });
}
$(function(){
    var $cascades = $(".cascade-box");
    $cascades.on('mouseleave',function(){
        $(this).find(".selector").slideUp();
    });
    $cascades.find(".text").on('click',function(){
        $(this).nextAll(".selector").slideToggle();
    });
    cascade('.province',0);
    $(".cascade-box .selector dl dd").on('click','.letter-group li a',function(){
        $(this).parents(".letter-group").next().find("li").hide().filter("."+$(this).text()).show();
    });
    $(".cascade-box .selector dl dd").on('click','.data-group li',function(){
        var code = $(this).data('code');
        var $next = $(this).parents("dl").next();
        if($next.length==1){
            cascade('.'+$next.get(0).className,code);
        }else{
            code&&$(this).parents(".cascade-box").find("[type=hidden]").val(code).prev().val($(this).text());
        }
    });
});