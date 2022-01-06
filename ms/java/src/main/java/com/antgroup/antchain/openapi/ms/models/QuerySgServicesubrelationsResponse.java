// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QuerySgServicesubrelationsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 服务订阅者数据
    @NameInMap("service_relations")
    public java.util.List<ServiceRelation> serviceRelations;

    public static QuerySgServicesubrelationsResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySgServicesubrelationsResponse self = new QuerySgServicesubrelationsResponse();
        return TeaModel.build(map, self);
    }

    public QuerySgServicesubrelationsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySgServicesubrelationsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySgServicesubrelationsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySgServicesubrelationsResponse setServiceRelations(java.util.List<ServiceRelation> serviceRelations) {
        this.serviceRelations = serviceRelations;
        return this;
    }
    public java.util.List<ServiceRelation> getServiceRelations() {
        return this.serviceRelations;
    }

}
