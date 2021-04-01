// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateLogisticFinanceAccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 指定的分布式数字身份，缺省时默认为自己的分布式数字身份
    @NameInMap("did")
    public String did;

    // 纳税人识别号
    @NameInMap("drawee_tax_no")
    @Validation(required = true)
    public String draweeTaxNo;

    // 业务方企业id
    @NameInMap("org_id")
    @Validation(required = true)
    public String orgId;

    // 业务方用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static CreateLogisticFinanceAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLogisticFinanceAccountRequest self = new CreateLogisticFinanceAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateLogisticFinanceAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLogisticFinanceAccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLogisticFinanceAccountRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public CreateLogisticFinanceAccountRequest setDraweeTaxNo(String draweeTaxNo) {
        this.draweeTaxNo = draweeTaxNo;
        return this;
    }
    public String getDraweeTaxNo() {
        return this.draweeTaxNo;
    }

    public CreateLogisticFinanceAccountRequest setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public CreateLogisticFinanceAccountRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
