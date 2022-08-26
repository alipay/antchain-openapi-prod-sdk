// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_b08c548e3a88469c89fe27adc3d0b925.models;

import com.aliyun.tea.*;

public class QueryBlockchainAppexSolutionFastnotaryRequest extends TeaModel {
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

    // 索引字段的值
    // 
    @NameInMap("biz_index_key_value")
    @Validation(required = true)
    public String bizIndexKeyValue;

    // 名称
    @NameInMap("schema_name")
    @Validation(required = true)
    public String schemaName;

    public static QueryBlockchainAppexSolutionFastnotaryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainAppexSolutionFastnotaryRequest self = new QueryBlockchainAppexSolutionFastnotaryRequest();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainAppexSolutionFastnotaryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBlockchainAppexSolutionFastnotaryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBlockchainAppexSolutionFastnotaryRequest setAppDid(String appDid) {
        this.appDid = appDid;
        return this;
    }
    public String getAppDid() {
        return this.appDid;
    }

    public QueryBlockchainAppexSolutionFastnotaryRequest setBizIndexKeyValue(String bizIndexKeyValue) {
        this.bizIndexKeyValue = bizIndexKeyValue;
        return this;
    }
    public String getBizIndexKeyValue() {
        return this.bizIndexKeyValue;
    }

    public QueryBlockchainAppexSolutionFastnotaryRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

}
