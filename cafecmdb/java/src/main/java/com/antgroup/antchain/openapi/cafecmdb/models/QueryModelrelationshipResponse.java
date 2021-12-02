// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb.models;

import com.aliyun.tea.*;

public class QueryModelrelationshipResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 查询到的模型关联列表
    @NameInMap("data")
    public java.util.List<ModelRelationship> data;

    public static QueryModelrelationshipResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryModelrelationshipResponse self = new QueryModelrelationshipResponse();
        return TeaModel.build(map, self);
    }

    public QueryModelrelationshipResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryModelrelationshipResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryModelrelationshipResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryModelrelationshipResponse setData(java.util.List<ModelRelationship> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ModelRelationship> getData() {
        return this.data;
    }

}
