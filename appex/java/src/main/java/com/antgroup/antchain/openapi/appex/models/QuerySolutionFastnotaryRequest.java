// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class QuerySolutionFastnotaryRequest extends TeaModel {
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

    public static QuerySolutionFastnotaryRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySolutionFastnotaryRequest self = new QuerySolutionFastnotaryRequest();
        return TeaModel.build(map, self);
    }

    public QuerySolutionFastnotaryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySolutionFastnotaryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySolutionFastnotaryRequest setAppDid(String appDid) {
        this.appDid = appDid;
        return this;
    }
    public String getAppDid() {
        return this.appDid;
    }

    public QuerySolutionFastnotaryRequest setBizIndexKeyValue(String bizIndexKeyValue) {
        this.bizIndexKeyValue = bizIndexKeyValue;
        return this;
    }
    public String getBizIndexKeyValue() {
        return this.bizIndexKeyValue;
    }

    public QuerySolutionFastnotaryRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

}
