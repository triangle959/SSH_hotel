<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>My JSP 'menuList.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<jsp:include page="../meta.jsp" flush="true"></jsp:include>

<style type="text/css">
.share_category_wp{width:480px; padding:20px; background-color:#fff; margin-left:auto; margin-right:auto; margin-top:20px;-khtml-border-radius:10px;-ms-border-radius:10px;-o-border-radius:10px;-moz-border-radius:10px;-webkit-border-radius:10px;border-radius:10px;behavior: url(../../../ext/1401031623/ie-css3.htc);}
.count_txt{color: #B5B5B5;text-align: right;}
.count_txt strong {font-family: georgia;font-size: 24px; padding: 0 2px;}
.inputstyle {height: 75px;line-height: 18px;overflow-x: hidden;overflow-y: auto;width: 472px;}
</style>

</head>
<body>
	<nav class="breadcrumb"> 
		<i class="Hui-iconfont">&#xe67f;</i> 首页
		<span class="c-gray en">&gt;</span> 房间管理
		<span class="c-gray en">&gt;</span>查看所有房间
		<a class="btn btn-success radius r"style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新">
			<i class="Hui-iconfont">&#xe68f;</i>
		</a>
	</nav>
	<div class="page-container">
		<div class="text-c">
			<form class="Huiform" method="post" action="" target="_self">
				<input type="text" placeholder="分类名称" value="" class="input-text" style="width:120px"> 
				<span class="btn-upload form-group">
					<input class="input-text upload-url" type="text" name="uploadfile-2" id="uploadfile-2" readonly style="width:200px">
					<a href="javascript:void();" class="btn btn-primary upload-btn">
						<i class="Hui-iconfont">&#xe642;</i> 上传房间图片
					</a> 
					<input type="file" multiple name="menuImgFile" class="input-file">					
				</span> 
				房间号:<input type="text" name="room.roomcode">
				房间类型:<input type="text" name="room.roomname">
				<button type="button" class="btn btn-success" id="" name="" onClick="picture_colume_add(this);">
					<i class="Hui-iconfont">&#xe600;</i> 添加
				</button>
			</form>
		</div>
		<div class="mt-20">
			
			<table class="table table-border table-bordered table-bg table-sort">
				<thead>
					<tr class="text-c">
						<th width="70">房间号</th>
						<th width="70">房间类型</th>
						<th>状态</th>
						<th width="100">操作</th>
					</tr>
				</thead>
				<tbody>
					<s:if test="#session.roomlist!=null">
						<s:iterator value="#session.roomlist" var="roomInfos" status="st">
							<s:set value="#roomInfos[0]" name="rooms"/>
							<tr class="text-c">
								<td>
									<span id="roomcode"><s:property value="#rooms.roomcode"/></span>
								</td>
								
								<td>
									<span id="roomname"><s:property value="#rooms.roomname"/></span>
									<div id="roomnameInputDiv" style="display:none;" ><input id="roomnameInputVal" type="text" ></div>
								</td>
								
								<td>
									<span id="roomstate"><s:property value="#rooms.roomstate"/></span>
									<select id="roomstateSelect" name="roomstate" style="display:none;">
										<option><s:property value="#rooms.roomstate"/></option>
										<s:iterator value="#session.roomlist" var="c">
											<s:if test="#c.roomstate!=#rooms.roomstate">
												<option value='<s:property value="#c.roomstate" />'><s:property value="#c.roomstate"/></option>
											</s:if>
										</s:iterator>
									</select>
								</td>
								
								<td class="f-14 product-brand-manage">
									<a style="text-decoration:none" id="edit" onClick="changeMenu(this)" href="javascript:;" title="编辑">
										<i class="Hui-iconfont">&#xe6df;</i>
									</a>
									<a style="text-decoration:none;display:none;" id="submitt" onClick="submitMenu(this)"  href="javascript:;" title="提交">提交</a>
									<a style="text-decoration:none" class="ml-5" onClick="active_del(this,'10001')" href="javascript:;" title="删除">
										<i class="Hui-iconfont">&#xe6e2;</i>
									</a>
								</td>
							</tr>
						</s:iterator>
					</s:if>
				</tbody>
			</table>
		</div>
	</div>

	<jsp:include page="../footer.jsp" flush="true"></jsp:include>
	<!--请在下方写此页面业务相关的脚本-->
	<script type="text/javascript" src="<%=path %>/admin/lib/My97DatePicker/4.8/WdatePicker.js"></script>
	<script type="text/javascript" src="<%=path %>/admin/lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="<%=path %>/admin/lib/laypage/1.2/laypage.js"></script>
	<script type="text/javascript" src="<%=path %>/admin/jsp/menu/js/menu.js"></script>
	<script type="text/javascript">
		$('.table-sort').dataTable({
			"aaSorting" : [ [ 0, "src" ] ],//默认第几个排序
			"bStateSave" : true,//状态保存
			"aoColumnDefs" : [{"orderable" : false,"aTargets" : [5 ]}] // 制定列不参与排序			
		});
		
function room_edit(title,url,w,h){
	if (title == null || title == '') {
		title = false;
	};
	if (url == null || url == '') {
		url = "404.html";
	};
	if (w == null || w == '') {
		w = 800;
	};
	if (h == null || h == '') {
		h = ($(window).height() - 50);
	};	
	layer.open({
		type: 2,
		area : [ w + 'px', h + 'px' ],
		//offset : '5%',// 快捷设置顶部坐标
		fix : false, // 不固定
		move : true,// 拖拽
		maxmin: true,
		shade : 0.4,
		title: title,
		content: url,
	});
	//layer.full(index);
}

/*修改类别*/

function changeRoom(obj){
	var o=$(obj).parents("tr");
	
	//显示房间名输入框
    var spanValue = o.find("#roomname").text();
    o.find("#roomnameInputVal").val(spanValue);
    o.find("#roomnameInputDiv").show();
    
    //显示状态选择框
    o.find("#roomstateSelect").show();
   
      
    o.find("#roomcode").hide();  //隐藏类名
    o.find("#roomname").hide();		//隐藏菜名
    
    o.find("#edit").hide();
    o.find("#submitt").show();
}

function submitRoom(obj){
	var o=$(obj).parents("tr");
	
	var roomcode = o.find("#roomcode").val();
	var roomname = o.find("#roomnameInputVal").val();
	var roomstate = o.find("#roomstateSelect").val();

	
	//category_change(inputValue,id);   
	 
	o.find("#roomcode").text(roomcode);  //更新新类名
    o.find("#roomname").text(roomname);  //更新新菜名
    o.find("#roomstate").text(roomstate);	//更新 新简介

	o.find("roomnameInputDiv").hide();
	o.find("roomstateSelect").hide();
    
	o.find("roomname").show();
	o.find("roomstate").show();

    o.find("#edit").show();
    o.find("#submitt").hide();
    
    
}

function category_change(name,id){
	layer.confirm('确认更改吗？', {
		btn: ['确认','取消'], 
		shade: false,
		closeBtn: 0
	},
	function(){
			$.ajax({
			type: 'POST',
			url: 'categoryAjaxAtion!updateCategoryById',
			data:{'name':name,'id':id },
			dataType: 'json',
			success: function(data){
			console.debug("data="+data);
				layer.msg('更新成功!', {icon:6,time:1000});
			},
			error:function(data) {
				console.debug(data);
				layer.msg('更新失败，稍后再试试吧!',{icon: 5,time:1000});
			},
		});
		
	});	
}

</script>
</body>
</html>
