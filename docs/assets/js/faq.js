$(document).ready(function(){
	$('.acc h3').click(function(){
		$(this).next('.help-content').slideToggle();
		$(this).parent().toggleClass('active');
		$(this).parent().siblings().children('.help-content').slideUp();
		$(this).parent().siblings().removeClass('active');
	});
});