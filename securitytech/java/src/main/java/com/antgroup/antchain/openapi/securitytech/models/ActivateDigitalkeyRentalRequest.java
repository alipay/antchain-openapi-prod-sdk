// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class ActivateDigitalkeyRentalRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备TUID（中控编号）
    @NameInMap("tuid")
    @Validation(required = true)
    public String tuid;

    // 经销商法人手机号
    @NameInMap("distributor_mobile")
    @Validation(required = true)
    public String distributorMobile;

    public static ActivateDigitalkeyRentalRequest build(java.util.Map<String, ?> map) throws Exception {
        ActivateDigitalkeyRentalRequest self = new ActivateDigitalkeyRentalRequest();
        return TeaModel.build(map, self);
    }

    public ActivateDigitalkeyRentalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ActivateDigitalkeyRentalRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ActivateDigitalkeyRentalRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public ActivateDigitalkeyRentalRequest setDistributorMobile(String distributorMobile) {
        this.distributorMobile = distributorMobile;
        return this;
    }
    public String getDistributorMobile() {
        return this.distributorMobile;
    }

}
