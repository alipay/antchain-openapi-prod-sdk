// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryIdentificationRiskTwometaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 被核验人身份证号码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 被核验人姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static QueryIdentificationRiskTwometaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIdentificationRiskTwometaRequest self = new QueryIdentificationRiskTwometaRequest();
        return TeaModel.build(map, self);
    }

    public QueryIdentificationRiskTwometaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIdentificationRiskTwometaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIdentificationRiskTwometaRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public QueryIdentificationRiskTwometaRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
