/**

 @Name：layuiAdmin 工单系统
 @Author：star1029
 @Site：http://www.layui.com/admin/
 @License：GPL-2
    
 */


layui.define(['table', 'form', 'element'], function(exports){
  var $ = layui.$
  ,admin = layui.admin
  ,view = layui.view
  ,table = layui.table
  ,form = layui.form
  ,element = layui.element;

  table.render({
    elem: '#LAY-app-workorder'
    ,url: 'json/workorder/demo.js' //模拟接口
    ,cols: [[
      {type: 'numbers', fixed: 'left'}

      ,{field: 'equipName',  title: '设备名'}
      ,{field: 'equipClass', title: '设备类别'}
      ,{field: 'checkTime', title: '点检时间'}
      ,{field: 'workerName', title: '点检人'}
      ,{field: 'workerPhone', title: '点检人电话'}
      ,{field: 'note', title: '备注'}
      ,{field: 'detailId', hide:true, width: 150, title: '详情'}

      ,{title: '详情', width: 150, align: 'center', fixed: 'right', toolbar: '#table-system-order'}
    ]]
    ,page: true
    ,limit: 10
    ,limits: [10, 15, 20, 25, 30]
    ,text: '对不起，加载出现异常！'
    ,done: function(){
      element.render('progress');
    }
  });

  //监听工具条
  table.on('tool(LAY-app-workorder)', function(obj){
    var data = obj.data;
    console.log(data);
    if(obj.event === 'edit'){
      admin.popup({
        title: '编辑工单'
        ,area: ['450px', '450px']
        ,id: 'LAY-popup-workorder-add'
        ,success: function(layero, index){
          view(this.id).render('./check/listform').done(function(){
            form.render(null, 'layuiadmin-form-workorder');
            
            //监听提交
            form.on('submit(LAY-app-workorder-submit)', function(data){
              var field = data.field; //获取提交的字段

              //提交 Ajax 成功后，关闭当前弹层并重载表格
              //$.ajax({});
              layui.table.reload('LAY-app-workorder'); //重载表格
              layer.close(index); //执行关闭 
            });
          });
        }
      });
    }
  });

  exports('workorder', {})
});