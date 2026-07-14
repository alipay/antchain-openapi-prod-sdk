// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class QueryConfigMaterialRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // OU
    @NameInMap("ou")
    @Validation(required = true)
    public String ou;

    // 纳税人资格种类, 01: 一般纳税人(专票); 02: 小规模纳税人(普票)
    @NameInMap("tax_payer_qualification")
    @Validation(required = true)
    public String taxPayerQualification;

    // 系统来源
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    public static QueryConfigMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryConfigMaterialRequest self = new QueryConfigMaterialRequest();
        return TeaModel.build(map, self);
    }

    public QueryConfigMaterialRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryConfigMaterialRequest setOu(String ou) {
        this.ou = ou;
        return this;
    }
    public String getOu() {
        return this.ou;
    }

    public QueryConfigMaterialRequest setTaxPayerQualification(String taxPayerQualification) {
        this.taxPayerQualification = taxPayerQualification;
        return this;
    }
    public String getTaxPayerQualification() {
        return this.taxPayerQualification;
    }

    public QueryConfigMaterialRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
