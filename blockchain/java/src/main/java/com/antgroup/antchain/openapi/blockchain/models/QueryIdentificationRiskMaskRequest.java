// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryIdentificationRiskMaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 被核验人身份证号码后四位
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 被核验人手机号码
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 被核验人姓名的一部分
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static QueryIdentificationRiskMaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIdentificationRiskMaskRequest self = new QueryIdentificationRiskMaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryIdentificationRiskMaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIdentificationRiskMaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIdentificationRiskMaskRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public QueryIdentificationRiskMaskRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryIdentificationRiskMaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
