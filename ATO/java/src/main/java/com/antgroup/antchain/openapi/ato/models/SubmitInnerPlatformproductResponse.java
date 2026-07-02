// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SubmitInnerPlatformproductResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 平台商品Id
    @NameInMap("platform_product_id")
    public String platformProductId;

    // 商户商品spuId
    @NameInMap("merchant_product_id")
    public String merchantProductId;

    public static SubmitInnerPlatformproductResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitInnerPlatformproductResponse self = new SubmitInnerPlatformproductResponse();
        return TeaModel.build(map, self);
    }

    public SubmitInnerPlatformproductResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SubmitInnerPlatformproductResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SubmitInnerPlatformproductResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SubmitInnerPlatformproductResponse setPlatformProductId(String platformProductId) {
        this.platformProductId = platformProductId;
        return this;
    }
    public String getPlatformProductId() {
        return this.platformProductId;
    }

    public SubmitInnerPlatformproductResponse setMerchantProductId(String merchantProductId) {
        this.merchantProductId = merchantProductId;
        return this;
    }
    public String getMerchantProductId() {
        return this.merchantProductId;
    }

}
