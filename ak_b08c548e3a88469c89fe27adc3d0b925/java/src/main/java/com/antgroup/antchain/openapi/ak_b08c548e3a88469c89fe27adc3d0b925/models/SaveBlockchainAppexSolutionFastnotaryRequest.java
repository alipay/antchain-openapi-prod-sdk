// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_b08c548e3a88469c89fe27adc3d0b925.models;

import com.aliyun.tea.*;

public class SaveBlockchainAppexSolutionFastnotaryRequest extends TeaModel {
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

    public static SaveBlockchainAppexSolutionFastnotaryRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBlockchainAppexSolutionFastnotaryRequest self = new SaveBlockchainAppexSolutionFastnotaryRequest();
        return TeaModel.build(map, self);
    }

    public SaveBlockchainAppexSolutionFastnotaryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveBlockchainAppexSolutionFastnotaryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveBlockchainAppexSolutionFastnotaryRequest setAppDid(String appDid) {
        this.appDid = appDid;
        return this;
    }
    public String getAppDid() {
        return this.appDid;
    }

    public SaveBlockchainAppexSolutionFastnotaryRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public SaveBlockchainAppexSolutionFastnotaryRequest setAttributes(java.util.List<NameValuePair> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.List<NameValuePair> getAttributes() {
        return this.attributes;
    }

}
