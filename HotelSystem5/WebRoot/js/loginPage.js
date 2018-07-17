$(function(){

    /*账号和密码框得失焦点时的相关操作*/
    $('.type-text').focus(function(){
	console.debug("testtt");
        $(this).css('borderColor','#6a71b0').siblings('i').hide();
    }).blur(function(){	
        $(this).css('borderColor','#c9cce7');
        if($(this).val()==''){
 		$('#errorPrompt').text("不能为空");
            $('#errorPrompt').show();
        }
	else{
  		$('#errorPrompt').hide();
	}
    });

    /*提交表单时验证表单*/
    $('#loginForm').submit(function(){
        var bool=true;
        
        $('#loginSubmit').val('登陆中...');
        
        $('.type-text').each(function(index){
            if($(this).val()==''){
                bool=false;
            }
        });

        if(bool){
            $('#errorPrompt').hide();         
        }
        else{
		$('#errorPrompt').text("用户名密码不能为空");
            $('#errorPrompt').show();      //若有输入框为空，则显示错误提示消息
        }

        return bool;
    });

    /*给自动登录复选框添加点击事件*/
    $('#autoLogin').click(function(){
        if($('#remenber').prop('checked')){
            $('#autoSelect').css('background','#686ea4');
        }
        else{
            $('#autoSelect').css('background','#fff');
        }
    });
});
