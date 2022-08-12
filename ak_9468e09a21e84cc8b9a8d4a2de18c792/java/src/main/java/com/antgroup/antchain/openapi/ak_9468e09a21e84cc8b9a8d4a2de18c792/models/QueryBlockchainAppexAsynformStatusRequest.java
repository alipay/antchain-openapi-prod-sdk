// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_9468e09a21e84cc8b9a8d4a2de18c792.models;

import com.aliyun.tea.*;

public class QueryBlockchainAppexAsynformStatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 发起方账户
    // 
    @NameInMap("user_did")
    @Validation(required = true)
    public String userDid;

    // 联盟ID
    // 
    @NameInMap("union_id")
    @Validation(required = true)
    public Long unionId;

    // 业务单据ID
    // 
    @NameInMap("form_id")
    @Validation(required = true)
    public String formId;

    // 业务单据类型
    // 
    @NameInMap("form_type")
    @Validation(required = true)
    public String formType;

    public static QueryBlockchainAppexAsynformStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainAppexAsynformStatusRequest self = new QueryBlockchainAppexAsynformStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainAppexAsynformStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBlockchainAppexAsynformStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBlockchainAppexAsynformStatusRequest setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

    public QueryBlockchainAppexAsynformStatusRequest setUnionId(Long unionId) {
        this.unionId = unionId;
        return this;
    }
    public Long getUnionId() {
        return this.unionId;
    }

    public QueryBlockchainAppexAsynformStatusRequest setFormId(String formId) {
        this.formId = formId;
        return this;
    }
    public String getFormId() {
        return this.formId;
    }

    public QueryBlockchainAppexAsynformStatusRequest setFormType(String formType) {
        this.formType = formType;
        return this;
    }
    public String getFormType() {
        return this.formType;
    }

}
