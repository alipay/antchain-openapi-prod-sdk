// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerKnowledgebaseinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户基础信息
    // 
    @NameInMap("merchant_base_info")
    public MerchantBaseInfo merchantBaseInfo;

    public static QueryInnerKnowledgebaseinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerKnowledgebaseinfoResponse self = new QueryInnerKnowledgebaseinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerKnowledgebaseinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerKnowledgebaseinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerKnowledgebaseinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerKnowledgebaseinfoResponse setMerchantBaseInfo(MerchantBaseInfo merchantBaseInfo) {
        this.merchantBaseInfo = merchantBaseInfo;
        return this;
    }
    public MerchantBaseInfo getMerchantBaseInfo() {
        return this.merchantBaseInfo;
    }

}
