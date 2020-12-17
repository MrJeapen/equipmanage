/**

 @Name：layuiAdmin 用户管理 管理员管理 角色管理
 @Author：star1029
 @Site：http://www.layui.com/admin/
 @License：LPPL
    
 */


layui.define(['table', 'form'], function(exports){
  var $ = layui.$
  ,admin = layui.admin
  ,view = layui.view
  ,table = layui.table
  ,form = layui.form;

  //作业记录
  table.render({
    elem: '#LAY-user-manage'
    ,url: '/allprocesslog' //模拟接口   用户数据请求接口
    ,cols: [[
      {type: 'checkbox', fixed: 'left'}
      ,{field: 'oriderId', title: '任务编号', sort: true}
      ,{field: 'equipName', title: '设备名'}
      ,{field: 'workName',  title: '理货员'}
      ,{field: 'note', title: '工作内容'}
      ,{field: 'startTime', title: '开始时间'}
      ,{field: 'endTime', title: '结束时间'}
      ,{title: '操作', width: 150, align:'center', fixed: 'right', toolbar: '#table-useradmin-webuser'}
    ]]
    ,page: true
    ,limit: 30
    ,height: 'full-320'
    ,text: '对不起，加载出现异常！'
  });
  
  //监听工具条   删除修改用户
  table.on('tool(LAY-user-manage)', function(obj){
    var data = obj.data;
    if(obj.event === 'del'){
      layer.prompt({
        formType: 1
        ,title: '敏感操作，请验证口令'
      }, function(value, index){
        layer.close(index);
        
        layer.confirm('真的删除行么', function(index){
          obj.del();
          layer.close(index);
        });
      });
    } else if(obj.event === 'edit'){
      admin.popup({
        title: '编辑用户'
        ,area: ['500px', '450px']
        ,id: 'LAY-popup-user-add'
        ,success: function(layero, index){
          view(this.id).render('user/user/userform', data).done(function(){
            form.render(null, 'layuiadmin-form-useradmin');
            
            //监听提交
            form.on('submit(LAY-user-front-submit)', function(data){
              var field = data.field; //获取提交的字段

              //提交 Ajax 成功后，关闭当前弹层并重载表格
              //$.ajax({});
              layui.table.reload('LAY-user-manage'); //重载表格
              layer.close(index); //执行关闭 
            });
          });
        }
      });
    }
  });

  //作业发布
  table.render({
    elem: '#LAY-order-publish'
    ,url: '/allorder' //模拟接口
    ,cols: [[
      {field: 'orderId',  title: '任务编号', sort: true}
      ,{field: 'theInitTime', title: '时间'}
      ,{field: 'workClass', title: '班次'}
      ,{field: 'workerName', title: '理货员'}
      ,{field: 'publisher', title: '任务发布者'}
      ,{field: 'status', title: '任务状态'}
      ,{field: 'instruction', title:'任务内容'}
      ,{title: '操作', width: 150, align: 'center', fixed: 'right', toolbar: '#table-useradmin-admin'}
    ]]
    ,page: true
    ,limit: 30
    ,height: 'full-320'

    ,text: '对不起，加载出现异常！'
  });
  
  //监听工具条
  table.on('tool(LAY-user-back-manage)', function(obj){
    var data = obj.data;
    if(obj.event === 'del'){
      layer.prompt({
        formType: 1
        ,title: '敏感操作，请验证口令'
      }, function(value, index){
        layer.close(index);
        layer.confirm('确定删除此管理员？', function(index){
          console.log(obj)
          obj.del();
          layer.close(index);
        });
      });
    }else if(obj.event === 'edit'){
      admin.popup({
        title: '编辑管理员'
        ,area: ['420px', '450px']
        ,id: 'LAY-popup-user-add'
        ,success: function(layero, index){
          view(this.id).render('user/administrators/adminform', data).done(function(){
            form.render(null, 'layuiadmin-form-admin');
            
            //监听提交
            form.on('submit(LAY-user-back-submit)', function(data){
              var field = data.field; //获取提交的字段

              //提交 Ajax 成功后，关闭当前弹层并重载表格
              //$.ajax({});
              layui.table.reload('LAY-user-back-manage'); //重载表格
              layer.close(index); //执行关闭 
            });
          });
        }
      });
    }
  });

  //角色管理
  table.render({
    elem: '#LAY-user-back-role'
    ,url: './json/useradmin/role.js' //模拟接口
    ,cols: [[
      {type: 'checkbox', fixed: 'left'}
      ,{field: 'id', width: 80, title: 'ID', sort: true}
      ,{field: 'rolename', title: '角色名'}
      ,{field: 'limits', title: '拥有权限'}
      ,{field: 'descr', title: '具体描述'}
      ,{title: '操作', width: 150, align: 'center', fixed: 'right', toolbar: '#table-useradmin-admin'}
    ]]
    ,text: '对不起，加载出现异常！'
  });
  
  //监听工具条
  table.on('tool(LAY-user-back-role)', function(obj){
    var data = obj.data;
    if(obj.event === 'del'){
      layer.confirm('确定删除此角色？', function(index){
        obj.del();
        layer.close(index);
      });
    }else if(obj.event === 'edit'){
      admin.popup({
        title: '添加新角色'
        ,area: ['500px', '480px']
        ,id: 'LAY-popup-user-add'
        ,success: function(layero, index){
          view(this.id).render('user/administrators/roleform', data).done(function(){
            form.render(null, 'layuiadmin-form-role');
            
            //监听提交
            form.on('submit(LAY-user-role-submit)', function(data){
              var field = data.field; //获取提交的字段

              //提交 Ajax 成功后，关闭当前弹层并重载表格
              //$.ajax({});
              layui.table.reload('LAY-user-back-role'); //重载表格
              layer.close(index); //执行关闭 
            });
          });
        }
      });
    }
  });

  exports('useradmin', {})
});