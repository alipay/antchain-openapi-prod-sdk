// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas_spi.models;

import com.aliyun.tea.*;

public class QueryRightsprodVoucherRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 供应商权益编码
    @NameInMap("supply_rights_code")
    @Validation(required = true)
    public String supplyRightsCode;

    // 权益实例
    @NameInMap("voucher_code")
    @Validation(required = true)
    public String voucherCode;

    public static QueryRightsprodVoucherRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRightsprodVoucherRequest self = new QueryRightsprodVoucherRequest();
        return TeaModel.build(map, self);
    }

    public QueryRightsprodVoucherRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRightsprodVoucherRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRightsprodVoucherRequest setSupplyRightsCode(String supplyRightsCode) {
        this.supplyRightsCode = supplyRightsCode;
        return this;
    }
    public String getSupplyRightsCode() {
        return this.supplyRightsCode;
    }

    public QueryRightsprodVoucherRequest setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode;
        return this;
    }
    public String getVoucherCode() {
        return this.voucherCode;
    }

}
