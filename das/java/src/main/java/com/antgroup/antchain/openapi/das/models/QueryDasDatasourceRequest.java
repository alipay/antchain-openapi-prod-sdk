// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class QueryDasDatasourceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据源名称
    @NameInMap("name")
    @Validation(required = true, maxLength = 20)
    public String name;

    // 数据源提供方
    @NameInMap("provider")
    @Validation(maxLength = 30)
    public String provider;

    // 枚举值：ENTERPRISE、INDIVIDUAL
    @NameInMap("data_owner_type")
    public String dataOwnerType;

    // 数据源接口访问地址
    @NameInMap("address")
    @Validation(maxLength = 100)
    public String address;

    public static QueryDasDatasourceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDasDatasourceRequest self = new QueryDasDatasourceRequest();
        return TeaModel.build(map, self);
    }

    public QueryDasDatasourceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDasDatasourceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDasDatasourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryDasDatasourceRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public QueryDasDatasourceRequest setDataOwnerType(String dataOwnerType) {
        this.dataOwnerType = dataOwnerType;
        return this;
    }
    public String getDataOwnerType() {
        return this.dataOwnerType;
    }

    public QueryDasDatasourceRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

}
