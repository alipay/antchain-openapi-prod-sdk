// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intlcommoncenter.models;

import com.aliyun.tea.*;

public class UpdateOfferMeterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 国际商品内部编码
    @NameInMap("offer_code")
    @Validation(required = true)
    public String offerCode;

    // 计量对接状态，FINISH标识以完成计量对接
    @NameInMap("meter_access_status")
    @Validation(required = true)
    public String meterAccessStatus;

    public static UpdateOfferMeterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOfferMeterRequest self = new UpdateOfferMeterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOfferMeterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateOfferMeterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateOfferMeterRequest setOfferCode(String offerCode) {
        this.offerCode = offerCode;
        return this;
    }
    public String getOfferCode() {
        return this.offerCode;
    }

    public UpdateOfferMeterRequest setMeterAccessStatus(String meterAccessStatus) {
        this.meterAccessStatus = meterAccessStatus;
        return this;
    }
    public String getMeterAccessStatus() {
        return this.meterAccessStatus;
    }

}
