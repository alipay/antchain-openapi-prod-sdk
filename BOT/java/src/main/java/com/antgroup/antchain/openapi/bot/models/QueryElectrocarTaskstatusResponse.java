// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarTaskstatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 聚合后的待处理 OTA 任务列表，已按状态优先级和创建时间排序
    @NameInMap("tasks")
    public java.util.List<UnfinishedUpgradeTaskVO> tasks;

    // 是否存在 Hub 通道查询失败；true 表示返回结果可能缺少 4G 任务
    @NameInMap("hub_query_failed")
    public Boolean hubQueryFailed;

    // 是否存在本地通道查询失败；true 表示返回结果可能缺少 BLE/本地任务
    @NameInMap("local_query_failed")
    public Boolean localQueryFailed;

    // 上报版本并查询升级场景下，版本上报是否失败
    @NameInMap("version_report_failed")
    public Boolean versionReportFailed;

    public static QueryElectrocarTaskstatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarTaskstatusResponse self = new QueryElectrocarTaskstatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarTaskstatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryElectrocarTaskstatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryElectrocarTaskstatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryElectrocarTaskstatusResponse setTasks(java.util.List<UnfinishedUpgradeTaskVO> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<UnfinishedUpgradeTaskVO> getTasks() {
        return this.tasks;
    }

    public QueryElectrocarTaskstatusResponse setHubQueryFailed(Boolean hubQueryFailed) {
        this.hubQueryFailed = hubQueryFailed;
        return this;
    }
    public Boolean getHubQueryFailed() {
        return this.hubQueryFailed;
    }

    public QueryElectrocarTaskstatusResponse setLocalQueryFailed(Boolean localQueryFailed) {
        this.localQueryFailed = localQueryFailed;
        return this;
    }
    public Boolean getLocalQueryFailed() {
        return this.localQueryFailed;
    }

    public QueryElectrocarTaskstatusResponse setVersionReportFailed(Boolean versionReportFailed) {
        this.versionReportFailed = versionReportFailed;
        return this;
    }
    public Boolean getVersionReportFailed() {
        return this.versionReportFailed;
    }

}
