// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class QueryAsynformStatusRequest extends TeaModel {
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

    public static QueryAsynformStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAsynformStatusRequest self = new QueryAsynformStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryAsynformStatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAsynformStatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAsynformStatusRequest setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

    public QueryAsynformStatusRequest setUnionId(Long unionId) {
        this.unionId = unionId;
        return this;
    }
    public Long getUnionId() {
        return this.unionId;
    }

    public QueryAsynformStatusRequest setFormId(String formId) {
        this.formId = formId;
        return this;
    }
    public String getFormId() {
        return this.formId;
    }

    public QueryAsynformStatusRequest setFormType(String formType) {
        this.formType = formType;
        return this;
    }
    public String getFormType() {
        return this.formType;
    }

}
