// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class GetRbbTaxinvoiceDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 流水号
    @NameInMap("serial_number")
    @Validation(required = true)
    public String serialNumber;

    // 社会新信用代码
    @NameInMap("taxpayer_id")
    @Validation(required = true)
    public String taxpayerId;

    public static GetRbbTaxinvoiceDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRbbTaxinvoiceDataRequest self = new GetRbbTaxinvoiceDataRequest();
        return TeaModel.build(map, self);
    }

    public GetRbbTaxinvoiceDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetRbbTaxinvoiceDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetRbbTaxinvoiceDataRequest setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public GetRbbTaxinvoiceDataRequest setTaxpayerId(String taxpayerId) {
        this.taxpayerId = taxpayerId;
        return this;
    }
    public String getTaxpayerId() {
        return this.taxpayerId;
    }

}
