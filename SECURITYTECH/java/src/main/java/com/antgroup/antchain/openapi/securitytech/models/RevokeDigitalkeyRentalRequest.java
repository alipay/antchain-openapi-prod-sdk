// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class RevokeDigitalkeyRentalRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租赁钥匙收回接口
    @NameInMap("tuid")
    @Validation(required = true)
    public String tuid;

    // 租车人手机号
    @NameInMap("renter_mobile")
    @Validation(required = true)
    public String renterMobile;

    public static RevokeDigitalkeyRentalRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeDigitalkeyRentalRequest self = new RevokeDigitalkeyRentalRequest();
        return TeaModel.build(map, self);
    }

    public RevokeDigitalkeyRentalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RevokeDigitalkeyRentalRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RevokeDigitalkeyRentalRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public RevokeDigitalkeyRentalRequest setRenterMobile(String renterMobile) {
        this.renterMobile = renterMobile;
        return this;
    }
    public String getRenterMobile() {
        return this.renterMobile;
    }

}
