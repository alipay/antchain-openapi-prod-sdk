// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryConfigDelegaterelationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 代理授权关系信息
    @NameInMap("delegate_relation_infos")
    public java.util.List<DelegateRelationInfo> delegateRelationInfos;

    public static QueryConfigDelegaterelationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConfigDelegaterelationResponse self = new QueryConfigDelegaterelationResponse();
        return TeaModel.build(map, self);
    }

    public QueryConfigDelegaterelationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryConfigDelegaterelationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryConfigDelegaterelationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryConfigDelegaterelationResponse setDelegateRelationInfos(java.util.List<DelegateRelationInfo> delegateRelationInfos) {
        this.delegateRelationInfos = delegateRelationInfos;
        return this;
    }
    public java.util.List<DelegateRelationInfo> getDelegateRelationInfos() {
        return this.delegateRelationInfos;
    }

}
