<%--
  Created by IntelliJ IDEA.
  User: 11701
  Date: 2019/3/5
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SuperiorTask</title>
</head>
<body>
<table id="log-table" class="log-table">
    <caption id="log-inf" class="log-inf">下发任务</caption>
    <thead>
    <tr>
        <th>任务编号</th>
        <th>任务名称</th>
        <th>发起设备名称</th>
        <th>目标设备名称</th>
        <th>下发路径</th>
        <th>任务类型</th>
        <th>任务进度</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody id="superiortaskInfo_body">
    </tbody>
</table>
</body>
<script>
    $(function () {
        //去首页
        to_superiortaskpage(1);
    });

    function to_superiortaskpage(pn) {
        $.ajax({
            url: "superiortask",
            data: "pn=" + pn,
            type: "get",
            success: function (result) {
                build_superiortaskInfo_table(result, to_superiortaskpage);
                console.log(result.extend.superiorTask.list);
                // build_superiortaskpage_info(result,to_superiortaskpage);
                // build_superiortaskpage_nav(result,to_superiortaskpage);
                // build_superiortaskdrop_down_box(result);
            }
        });
    }

    //管理代理信息的获取
    function build_superiortaskInfo_table(result) {
        //清空table表
        $("#superiortaskInfo_body").empty();
        var items = result.extend.superiorTask.list;
        $.each(items, function (index, item) {
            var obj = {
                initiatingId: item.initiatingid,
                initiatingDevice: item.initiatingdevice,
                targetDevice: item.targetdevice,
                issuedPath: item.issuedpath,
                taskType: item.tasktype,
                taskName: item.taskname,
                taskDetails: item.taskdetails
            }
            createElement(obj);
        });
    }
</script>
</html>
