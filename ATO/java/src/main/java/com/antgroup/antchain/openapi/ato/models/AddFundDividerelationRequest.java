// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class AddFundDividerelationRequest extends TeaModel {
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

    public static AddFundDividerelationRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFundDividerelationRequest self = new AddFundDividerelationRequest();
        return TeaModel.build(map, self);
    }

    public AddFundDividerelationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddFundDividerelationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddFundDividerelationRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public AddFundDividerelationRequest setDivideBindingTransInInfoList(java.util.List<DivideBindingTransInInfo> divideBindingTransInInfoList) {
        this.divideBindingTransInInfoList = divideBindingTransInInfoList;
        return this;
    }
    public java.util.List<DivideBindingTransInInfo> getDivideBindingTransInInfoList() {
        return this.divideBindingTransInInfoList;
    }

    public AddFundDividerelationRequest setDivideRadio(String divideRadio) {
        this.divideRadio = divideRadio;
        return this;
    }
    public String getDivideRadio() {
        return this.divideRadio;
    }

}
