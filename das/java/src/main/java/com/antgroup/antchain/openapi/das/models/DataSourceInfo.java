// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class DataSourceInfo extends TeaModel {
    // 数据源ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 数据源名称
    @NameInMap("name")
    @Validation(required = true, maxLength = 20)
    public String name;

    // 数据提供方
    @NameInMap("provider")
    @Validation(required = true, maxLength = 30)
    public String provider;

    // 枚举值：ENTERPRISE、INDIVIDUAL
    @NameInMap("data_owner_type")
    @Validation(required = true)
    public String dataOwnerType;

    // 数据源接口信息
    @NameInMap("data_source_interface_info")
    @Validation(required = true)
    public DataSourceInterface dataSourceInterfaceInfo;

    public static DataSourceInfo build(java.util.Map<String, ?> map) throws Exception {
        DataSourceInfo self = new DataSourceInfo();
        return TeaModel.build(map, self);
    }

    public DataSourceInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DataSourceInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DataSourceInfo setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public DataSourceInfo setDataOwnerType(String dataOwnerType) {
        this.dataOwnerType = dataOwnerType;
        return this;
    }
    public String getDataOwnerType() {
        return this.dataOwnerType;
    }

    public DataSourceInfo setDataSourceInterfaceInfo(DataSourceInterface dataSourceInterfaceInfo) {
        this.dataSourceInterfaceInfo = dataSourceInterfaceInfo;
        return this;
    }
    public DataSourceInterface getDataSourceInterfaceInfo() {
        return this.dataSourceInterfaceInfo;
    }

}
