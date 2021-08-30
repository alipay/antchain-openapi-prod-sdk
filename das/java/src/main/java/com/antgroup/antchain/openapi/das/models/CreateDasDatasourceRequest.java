// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class CreateDasDatasourceRequest extends TeaModel {
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
    @Validation(required = true, maxLength = 30)
    public String provider;

    // 枚举值：ENTERPRISE、INDIVIDUAL
    @NameInMap("data_owner_type")
    @Validation(required = true)
    public String dataOwnerType;

    // 数据源接口定义
    @NameInMap("interface")
    @Validation(required = true)
    public DataSourceInterface _interface;

    public static CreateDasDatasourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDasDatasourceRequest self = new CreateDasDatasourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDasDatasourceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDasDatasourceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDasDatasourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDasDatasourceRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public CreateDasDatasourceRequest setDataOwnerType(String dataOwnerType) {
        this.dataOwnerType = dataOwnerType;
        return this;
    }
    public String getDataOwnerType() {
        return this.dataOwnerType;
    }

    public CreateDasDatasourceRequest set_interface(DataSourceInterface _interface) {
        this._interface = _interface;
        return this;
    }
    public DataSourceInterface get_interface() {
        return this._interface;
    }

}
