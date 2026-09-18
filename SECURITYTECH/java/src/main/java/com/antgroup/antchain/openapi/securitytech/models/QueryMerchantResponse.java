// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryMerchantResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商户入驻查询结果
    @NameInMap("merchant_result")
    public MaoQueryMerchantResult merchantResult;

    public static QueryMerchantResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMerchantResponse self = new QueryMerchantResponse();
        return TeaModel.build(map, self);
    }

    public QueryMerchantResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMerchantResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMerchantResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMerchantResponse setMerchantResult(MaoQueryMerchantResult merchantResult) {
        this.merchantResult = merchantResult;
        return this;
    }
    public MaoQueryMerchantResult getMerchantResult() {
        return this.merchantResult;
    }

}
