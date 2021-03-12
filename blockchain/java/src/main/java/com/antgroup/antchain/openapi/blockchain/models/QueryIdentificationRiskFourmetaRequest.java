// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryIdentificationRiskFourmetaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 被核验人银行卡号
    @NameInMap("bank_card_no")
    @Validation(required = true)
    public String bankCardNo;

    // 被核验人身份证号码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 被核验人手机号码
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 被核验人姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static QueryIdentificationRiskFourmetaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIdentificationRiskFourmetaRequest self = new QueryIdentificationRiskFourmetaRequest();
        return TeaModel.build(map, self);
    }

    public QueryIdentificationRiskFourmetaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIdentificationRiskFourmetaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIdentificationRiskFourmetaRequest setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
        return this;
    }
    public String getBankCardNo() {
        return this.bankCardNo;
    }

    public QueryIdentificationRiskFourmetaRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public QueryIdentificationRiskFourmetaRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryIdentificationRiskFourmetaRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
