// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class BatchqueryQmpTenantActionplaninfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 触达策略信息
    @NameInMap("query_result")
    public java.util.List<ActionPlanDetailInfo> queryResult;

    // 总数
    @NameInMap("total_count")
    public Long totalCount;

    public static BatchqueryQmpTenantActionplaninfoResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryQmpTenantActionplaninfoResponse self = new BatchqueryQmpTenantActionplaninfoResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryQmpTenantActionplaninfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryQmpTenantActionplaninfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryQmpTenantActionplaninfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryQmpTenantActionplaninfoResponse setQueryResult(java.util.List<ActionPlanDetailInfo> queryResult) {
        this.queryResult = queryResult;
        return this;
    }
    public java.util.List<ActionPlanDetailInfo> getQueryResult() {
        return this.queryResult;
    }

    public BatchqueryQmpTenantActionplaninfoResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
