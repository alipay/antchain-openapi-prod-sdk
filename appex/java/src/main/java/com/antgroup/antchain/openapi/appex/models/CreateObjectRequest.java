// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class CreateObjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 区块链身份
    // 
    // 
    @NameInMap("user_did")
    @Validation(required = true)
    public String userDid;

    // 联盟标识（联盟码）	
    @NameInMap("union_id")
    @Validation(required = true)
    public String unionId;

    // 归属权要流转的表单ID
    // 
    // 
    @NameInMap("form_id")
    @Validation(required = true)
    public String formId;

    // 物的信息
    // 
    // 
    @NameInMap("form_body")
    @Validation(required = true)
    public String formBody;

    public static CreateObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateObjectRequest self = new CreateObjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateObjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateObjectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateObjectRequest setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

    public CreateObjectRequest setUnionId(String unionId) {
        this.unionId = unionId;
        return this;
    }
    public String getUnionId() {
        return this.unionId;
    }

    public CreateObjectRequest setFormId(String formId) {
        this.formId = formId;
        return this;
    }
    public String getFormId() {
        return this.formId;
    }

    public CreateObjectRequest setFormBody(String formBody) {
        this.formBody = formBody;
        return this;
    }
    public String getFormBody() {
        return this.formBody;
    }

}
