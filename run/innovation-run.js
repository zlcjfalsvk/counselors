$(document).ready(function() {
	tabFix();//탭_상단고정
	$('.scene_wrap').addClass("hidden").viewportChecker({
		 classToAdd: 'visible animated fadeInUp',
		 offset: 250
		});
});

$(window).on("scroll", function() {
	var scrTop = $(window).scrollTop(),
		scrTarget = [600, 1000, 1200 ];
	$('.tab_style2 .tab_nav li').removeClass('on');
	if(scrTop < scrTarget[0]){
		$('.tab_style2 .tab_nav li').eq(0).addClass('on')
	}else if(scrTop > scrTarget[0] && scrTop <= scrTarget[1] ){
		$('.tab_style2 .tab_nav li').eq(1).addClass('on')
	}else if(scrTop > scrTarget[1] && scrTop <= scrTarget[2]){
		$('.tab_style2 .tab_nav li').eq(2).addClass('on')
	}
});
