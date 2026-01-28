// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class DataTypeInfo extends TeaModel {
    // 数据类型编码
    /**
     * <strong>example:</strong>
     * <p>dataTypeNo</p>
     */
    @NameInMap("data_type_no")
    @Validation(required = true)
    public String dataTypeNo;

    // 数据类型名称
    /**
     * <strong>example:</strong>
     * <p>data_type_name</p>
     */
    @NameInMap("data_type_name")
    @Validation(required = true)
    public String dataTypeName;

    // 数据类型配置
    /**
     * <strong>example:</strong>
     * <p>data_type_config</p>
     */
    @NameInMap("data_type_config")
    @Validation(required = true)
    public String dataTypeConfig;

    // 数据JSON格式检查
    /**
     * <strong>example:</strong>
     * <p>data_json_schema</p>
     */
    @NameInMap("data_json_schema")
    @Validation(required = true)
    public String dataJsonSchema;

    public static DataTypeInfo build(java.util.Map<String, ?> map) throws Exception {
        DataTypeInfo self = new DataTypeInfo();
        return TeaModel.build(map, self);
    }

    public DataTypeInfo setDataTypeNo(String dataTypeNo) {
        this.dataTypeNo = dataTypeNo;
        return this;
    }
    public String getDataTypeNo() {
        return this.dataTypeNo;
    }

    public DataTypeInfo setDataTypeName(String dataTypeName) {
        this.dataTypeName = dataTypeName;
        return this;
    }
    public String getDataTypeName() {
        return this.dataTypeName;
    }

    public DataTypeInfo setDataTypeConfig(String dataTypeConfig) {
        this.dataTypeConfig = dataTypeConfig;
        return this;
    }
    public String getDataTypeConfig() {
        return this.dataTypeConfig;
    }

    public DataTypeInfo setDataJsonSchema(String dataJsonSchema) {
        this.dataJsonSchema = dataJsonSchema;
        return this;
    }
    public String getDataJsonSchema() {
        return this.dataJsonSchema;
    }

}
