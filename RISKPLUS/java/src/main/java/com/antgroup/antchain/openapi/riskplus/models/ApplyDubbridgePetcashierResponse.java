// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ApplyDubbridgePetcashierResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 跳转url（短链）/小程序场景为支付宝侧单号
    @NameInMap("page_redirection_data")
    public String pageRedirectionData;

    // 原始跳转url
    @NameInMap("origin_url")
    public String originUrl;

    // 交易单号
    @NameInMap("trade_no")
    public String tradeNo;

    public static ApplyDubbridgePetcashierResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyDubbridgePetcashierResponse self = new ApplyDubbridgePetcashierResponse();
        return TeaModel.build(map, self);
    }

    public ApplyDubbridgePetcashierResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyDubbridgePetcashierResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyDubbridgePetcashierResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyDubbridgePetcashierResponse setPageRedirectionData(String pageRedirectionData) {
        this.pageRedirectionData = pageRedirectionData;
        return this;
    }
    public String getPageRedirectionData() {
        return this.pageRedirectionData;
    }

    public ApplyDubbridgePetcashierResponse setOriginUrl(String originUrl) {
        this.originUrl = originUrl;
        return this;
    }
    public String getOriginUrl() {
        return this.originUrl;
    }

    public ApplyDubbridgePetcashierResponse setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
        return this;
    }
    public String getTradeNo() {
        return this.tradeNo;
    }

}
