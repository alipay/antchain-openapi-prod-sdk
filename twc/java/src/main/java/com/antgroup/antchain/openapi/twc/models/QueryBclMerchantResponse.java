// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryBclMerchantResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 入驻状态：入驻中：EXEC（表示等待商家去支付宝平台签约）；SUCCESS：入驻成功；FAIL：入驻失败
    @NameInMap("status")
    public String status;

    // 是否需要使用租赁代扣
    @NameInMap("need_proxy_withholding")
    public Boolean needProxyWithholding;

    // 入驻失败的原因，在入驻失败时才会有值
    @NameInMap("reason")
    public String reason;

    public static QueryBclMerchantResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBclMerchantResponse self = new QueryBclMerchantResponse();
        return TeaModel.build(map, self);
    }

    public QueryBclMerchantResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBclMerchantResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBclMerchantResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBclMerchantResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryBclMerchantResponse setNeedProxyWithholding(Boolean needProxyWithholding) {
        this.needProxyWithholding = needProxyWithholding;
        return this;
    }
    public Boolean getNeedProxyWithholding() {
        return this.needProxyWithholding;
    }

    public QueryBclMerchantResponse setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

}
