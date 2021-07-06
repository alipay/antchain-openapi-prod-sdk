// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryEpayauthBranchbankRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 银行名称，支持全称，或部分名称
    // bank_name和district_code至少有一个不为空
    @NameInMap("bank_name")
    public String bankName;

    // 行政地区编码
    // bank_name和district_code至少有一个不为空
    @NameInMap("district_code")
    public String districtCode;

    // 总行联行号
    @NameInMap("root_bank_code")
    @Validation(required = true)
    public String rootBankCode;

    public static QueryEpayauthBranchbankRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEpayauthBranchbankRequest self = new QueryEpayauthBranchbankRequest();
        return TeaModel.build(map, self);
    }

    public QueryEpayauthBranchbankRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEpayauthBranchbankRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEpayauthBranchbankRequest setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }
    public String getBankName() {
        return this.bankName;
    }

    public QueryEpayauthBranchbankRequest setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
        return this;
    }
    public String getDistrictCode() {
        return this.districtCode;
    }

    public QueryEpayauthBranchbankRequest setRootBankCode(String rootBankCode) {
        this.rootBankCode = rootBankCode;
        return this;
    }
    public String getRootBankCode() {
        return this.rootBankCode;
    }

}
