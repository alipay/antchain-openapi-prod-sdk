// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRbbObtsZsearchRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 索引名称
    @NameInMap("index")
    @Validation(required = true)
    public String index;

    // 类型名称
    @NameInMap("type")
    public String type;

    // 操作方法
    @NameInMap("operation_method")
    public String operationMethod;

    // 查询语句
    @NameInMap("entity_string")
    public String entityString;

    public static QueryRbbObtsZsearchRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRbbObtsZsearchRequest self = new QueryRbbObtsZsearchRequest();
        return TeaModel.build(map, self);
    }

    public QueryRbbObtsZsearchRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRbbObtsZsearchRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRbbObtsZsearchRequest setIndex(String index) {
        this.index = index;
        return this;
    }
    public String getIndex() {
        return this.index;
    }

    public QueryRbbObtsZsearchRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryRbbObtsZsearchRequest setOperationMethod(String operationMethod) {
        this.operationMethod = operationMethod;
        return this;
    }
    public String getOperationMethod() {
        return this.operationMethod;
    }

    public QueryRbbObtsZsearchRequest setEntityString(String entityString) {
        this.entityString = entityString;
        return this;
    }
    public String getEntityString() {
        return this.entityString;
    }

}
