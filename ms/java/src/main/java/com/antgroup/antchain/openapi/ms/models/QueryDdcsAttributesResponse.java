// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryDdcsAttributesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 属性信息
    @NameInMap("attribute")
    public Attribute attribute;

    public static QueryDdcsAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDdcsAttributesResponse self = new QueryDdcsAttributesResponse();
        return TeaModel.build(map, self);
    }

    public QueryDdcsAttributesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDdcsAttributesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDdcsAttributesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDdcsAttributesResponse setAttribute(Attribute attribute) {
        this.attribute = attribute;
        return this;
    }
    public Attribute getAttribute() {
        return this.attribute;
    }

}
