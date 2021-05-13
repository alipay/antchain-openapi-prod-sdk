// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class SaveSolutionFastnotaryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用did
    // 
    @NameInMap("app_did")
    @Validation(required = true)
    public String appDid;

    // 表名
    @NameInMap("schema_name")
    @Validation(required = true)
    public String schemaName;

    // 存证数据
    @NameInMap("attributes")
    @Validation(required = true)
    public java.util.List<NameValuePair> attributes;

    public static SaveSolutionFastnotaryRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSolutionFastnotaryRequest self = new SaveSolutionFastnotaryRequest();
        return TeaModel.build(map, self);
    }

    public SaveSolutionFastnotaryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveSolutionFastnotaryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveSolutionFastnotaryRequest setAppDid(String appDid) {
        this.appDid = appDid;
        return this;
    }
    public String getAppDid() {
        return this.appDid;
    }

    public SaveSolutionFastnotaryRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public SaveSolutionFastnotaryRequest setAttributes(java.util.List<NameValuePair> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.List<NameValuePair> getAttributes() {
        return this.attributes;
    }

}
