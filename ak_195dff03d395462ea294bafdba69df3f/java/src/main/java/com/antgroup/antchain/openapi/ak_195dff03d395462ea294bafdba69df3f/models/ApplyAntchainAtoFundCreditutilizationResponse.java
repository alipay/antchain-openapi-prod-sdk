// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class ApplyAntchainAtoFundCreditutilizationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用信Id
    @NameInMap("utilization_id")
    public String utilizationId;

    // 用信授权id
    @NameInMap("utilization_auth_id")
    public String utilizationAuthId;

    // 资产包id
    @NameInMap("asset_package_id")
    public String assetPackageId;

    // 商户授权链接
    @NameInMap("merchant_auth_url")
    public String merchantAuthUrl;

    public static ApplyAntchainAtoFundCreditutilizationResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyAntchainAtoFundCreditutilizationResponse self = new ApplyAntchainAtoFundCreditutilizationResponse();
        return TeaModel.build(map, self);
    }

    public ApplyAntchainAtoFundCreditutilizationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyAntchainAtoFundCreditutilizationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyAntchainAtoFundCreditutilizationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyAntchainAtoFundCreditutilizationResponse setUtilizationId(String utilizationId) {
        this.utilizationId = utilizationId;
        return this;
    }
    public String getUtilizationId() {
        return this.utilizationId;
    }

    public ApplyAntchainAtoFundCreditutilizationResponse setUtilizationAuthId(String utilizationAuthId) {
        this.utilizationAuthId = utilizationAuthId;
        return this;
    }
    public String getUtilizationAuthId() {
        return this.utilizationAuthId;
    }

    public ApplyAntchainAtoFundCreditutilizationResponse setAssetPackageId(String assetPackageId) {
        this.assetPackageId = assetPackageId;
        return this;
    }
    public String getAssetPackageId() {
        return this.assetPackageId;
    }

    public ApplyAntchainAtoFundCreditutilizationResponse setMerchantAuthUrl(String merchantAuthUrl) {
        this.merchantAuthUrl = merchantAuthUrl;
        return this;
    }
    public String getMerchantAuthUrl() {
        return this.merchantAuthUrl;
    }

}
