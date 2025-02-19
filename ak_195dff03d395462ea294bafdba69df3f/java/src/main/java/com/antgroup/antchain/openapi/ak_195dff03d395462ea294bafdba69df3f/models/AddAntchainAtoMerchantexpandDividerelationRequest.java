// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class AddAntchainAtoMerchantexpandDividerelationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 被分账方社会统一信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 分账方信息，最多支持10组
    @NameInMap("divide_binding_trans_in_info_list")
    @Validation(required = true)
    public java.util.List<DivideBindingTransInInfo> divideBindingTransInInfoList;

    // 分账比例上限
    @NameInMap("divide_radio")
    public String divideRadio;

    public static AddAntchainAtoMerchantexpandDividerelationRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAntchainAtoMerchantexpandDividerelationRequest self = new AddAntchainAtoMerchantexpandDividerelationRequest();
        return TeaModel.build(map, self);
    }

    public AddAntchainAtoMerchantexpandDividerelationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddAntchainAtoMerchantexpandDividerelationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddAntchainAtoMerchantexpandDividerelationRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public AddAntchainAtoMerchantexpandDividerelationRequest setDivideBindingTransInInfoList(java.util.List<DivideBindingTransInInfo> divideBindingTransInInfoList) {
        this.divideBindingTransInInfoList = divideBindingTransInInfoList;
        return this;
    }
    public java.util.List<DivideBindingTransInInfo> getDivideBindingTransInInfoList() {
        return this.divideBindingTransInInfoList;
    }

    public AddAntchainAtoMerchantexpandDividerelationRequest setDivideRadio(String divideRadio) {
        this.divideRadio = divideRadio;
        return this;
    }
    public String getDivideRadio() {
        return this.divideRadio;
    }

}
