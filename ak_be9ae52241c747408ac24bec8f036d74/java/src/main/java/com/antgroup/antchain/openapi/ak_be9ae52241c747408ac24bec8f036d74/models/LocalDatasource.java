// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class LocalDatasource extends TeaModel {
    // 数据源id
    @NameInMap("id")
    public String id;

    // 数据源名称
    @NameInMap("name")
    public String name;

    // 数据源描述信息
    @NameInMap("description")
    public String description;

    // 当前数据源是否支持写入
    @NameInMap("writable")
    public Boolean writable;

    // 用于描述数据源类型的枚举。
    // 示例如下：
    // MYSQL,
    // DB2,
    // SQLSERVER,
    // ORACLE,
    // HIVE2,
    // ODPS
    // 
    @NameInMap("type")
    public String type;

    // 用于描述数据源的连接信息，为描述连接信息的数据对象转化为的json字符串，与type指定的数据源类型必须一一对应。
    // 该参数请参考如下对应结构体，定义好后需转成jsonString，对应关系展示如下：
    // MYSQL -> MysqlConnConfig,
    // ORACLE -> OracleConnConfig,
    // SQLSERVER -> SqlServerConnConfig,
    // DB2 -> DbTwoConnConfig,
    // HIVE2 -> HiveTwoConnConfig,
    // ODPS -> OdpsConnConfig
    @NameInMap("conn_config")
    public String connConfig;

    public static LocalDatasource build(java.util.Map<String, ?> map) throws Exception {
        LocalDatasource self = new LocalDatasource();
        return TeaModel.build(map, self);
    }

    public LocalDatasource setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public LocalDatasource setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public LocalDatasource setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public LocalDatasource setWritable(Boolean writable) {
        this.writable = writable;
        return this;
    }
    public Boolean getWritable() {
        return this.writable;
    }

    public LocalDatasource setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public LocalDatasource setConnConfig(String connConfig) {
        this.connConfig = connConfig;
        return this;
    }
    public String getConnConfig() {
        return this.connConfig;
    }

}
