
$(document).ready(function() {


	$('#social').hover(function(){
       console.log("yo");
        $('.socialMedia').fadeIn(400)
},
           function(){
console.log('out of here')
        $('.socialMedia').fadeOut(400)

             }
);
	$('#myWork').hover(function(){
		console.log('yoyo');
		$('.myWork').fadeIn(400)},
		function(){
		$('.myWork').fadeOut(400),

			console.log('out of here')

		}

	);

	

			$("#socialMedia").hover(function(){
			console.log("animate");
			$("#socialMedia").animate({rotate:90}, 0)
		});




});
