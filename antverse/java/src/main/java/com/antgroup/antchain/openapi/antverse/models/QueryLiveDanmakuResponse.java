// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.antverse.models;

import com.aliyun.tea.*;

public class QueryLiveDanmakuResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // LRXXXXXXXXXXXXXXXXX
    @NameInMap("instance_id")
    public String instanceId;

    // 当前开播的直播项目id,格式参考:LPXXXXXXXXXXX
    @NameInMap("project_id")
    public String projectId;

    // 弹幕数据
    @NameInMap("danmaku_list")
    public java.util.List<DanmakuListBO> danmakuList;

    // 当前租户id
    @NameInMap("tenant_id")
    public String tenantId;

    public static QueryLiveDanmakuResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLiveDanmakuResponse self = new QueryLiveDanmakuResponse();
        return TeaModel.build(map, self);
    }

    public QueryLiveDanmakuResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryLiveDanmakuResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLiveDanmakuResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryLiveDanmakuResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryLiveDanmakuResponse setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryLiveDanmakuResponse setDanmakuList(java.util.List<DanmakuListBO> danmakuList) {
        this.danmakuList = danmakuList;
        return this;
    }
    public java.util.List<DanmakuListBO> getDanmakuList() {
        return this.danmakuList;
    }

    public QueryLiveDanmakuResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
