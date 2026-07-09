// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarOtaupgradecheckResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 未完成 OTA 任务列表
    @NameInMap("tasks")
    public java.util.List<UnfinishedUpgradeTaskVO> tasks;

    // Hub 通道查询是否失败
    @NameInMap("hub_query_failed")
    public Boolean hubQueryFailed;

    // 本地通道查询是否失败
    @NameInMap("local_query_failed")
    public Boolean localQueryFailed;

    // 上报版本并查询升级场景下，版本上报是否失败
    @NameInMap("version_report_failed")
    public Boolean versionReportFailed;

    public static QueryElectrocarOtaupgradecheckResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarOtaupgradecheckResponse self = new QueryElectrocarOtaupgradecheckResponse();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarOtaupgradecheckResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryElectrocarOtaupgradecheckResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryElectrocarOtaupgradecheckResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryElectrocarOtaupgradecheckResponse setTasks(java.util.List<UnfinishedUpgradeTaskVO> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<UnfinishedUpgradeTaskVO> getTasks() {
        return this.tasks;
    }

    public QueryElectrocarOtaupgradecheckResponse setHubQueryFailed(Boolean hubQueryFailed) {
        this.hubQueryFailed = hubQueryFailed;
        return this;
    }
    public Boolean getHubQueryFailed() {
        return this.hubQueryFailed;
    }

    public QueryElectrocarOtaupgradecheckResponse setLocalQueryFailed(Boolean localQueryFailed) {
        this.localQueryFailed = localQueryFailed;
        return this;
    }
    public Boolean getLocalQueryFailed() {
        return this.localQueryFailed;
    }

    public QueryElectrocarOtaupgradecheckResponse setVersionReportFailed(Boolean versionReportFailed) {
        this.versionReportFailed = versionReportFailed;
        return this;
    }
    public Boolean getVersionReportFailed() {
        return this.versionReportFailed;
    }

}
