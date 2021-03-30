// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryStandardVoucherRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据标识
    @NameInMap("business_code")
    @Validation(required = true)
    public String businessCode;

    // 所属账户
    @NameInMap("voucher_owner")
    @Validation(required = true)
    public String voucherOwner;

    public static QueryStandardVoucherRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryStandardVoucherRequest self = new QueryStandardVoucherRequest();
        return TeaModel.build(map, self);
    }

    public QueryStandardVoucherRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryStandardVoucherRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryStandardVoucherRequest setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }
    public String getBusinessCode() {
        return this.businessCode;
    }

    public QueryStandardVoucherRequest setVoucherOwner(String voucherOwner) {
        this.voucherOwner = voucherOwner;
        return this;
    }
    public String getVoucherOwner() {
        return this.voucherOwner;
    }

}
