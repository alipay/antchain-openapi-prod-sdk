// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class UpdateDasDatasourceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 要修改的数据源ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

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

    public static UpdateDasDatasourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDasDatasourceRequest self = new UpdateDasDatasourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDasDatasourceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDasDatasourceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDasDatasourceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateDasDatasourceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDasDatasourceRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public UpdateDasDatasourceRequest setDataOwnerType(String dataOwnerType) {
        this.dataOwnerType = dataOwnerType;
        return this;
    }
    public String getDataOwnerType() {
        return this.dataOwnerType;
    }

    public UpdateDasDatasourceRequest set_interface(DataSourceInterface _interface) {
        this._interface = _interface;
        return this;
    }
    public DataSourceInterface get_interface() {
        return this._interface;
    }

}
