// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class AddDataassetTypeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据类型编码
    @NameInMap("data_type_no")
    @Validation(required = true)
    public String dataTypeNo;

    // 数据类型名称
    @NameInMap("data_type_name")
    @Validation(required = true)
    public String dataTypeName;

    // 数据类型配置
    @NameInMap("data_type_config")
    @Validation(required = true)
    public String dataTypeConfig;

    // 数据JSON格式检查
    @NameInMap("data_json_schema")
    @Validation(required = true)
    public String dataJsonSchema;

    public static AddDataassetTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDataassetTypeRequest self = new AddDataassetTypeRequest();
        return TeaModel.build(map, self);
    }

    public AddDataassetTypeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddDataassetTypeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddDataassetTypeRequest setDataTypeNo(String dataTypeNo) {
        this.dataTypeNo = dataTypeNo;
        return this;
    }
    public String getDataTypeNo() {
        return this.dataTypeNo;
    }

    public AddDataassetTypeRequest setDataTypeName(String dataTypeName) {
        this.dataTypeName = dataTypeName;
        return this;
    }
    public String getDataTypeName() {
        return this.dataTypeName;
    }

    public AddDataassetTypeRequest setDataTypeConfig(String dataTypeConfig) {
        this.dataTypeConfig = dataTypeConfig;
        return this;
    }
    public String getDataTypeConfig() {
        return this.dataTypeConfig;
    }

    public AddDataassetTypeRequest setDataJsonSchema(String dataJsonSchema) {
        this.dataJsonSchema = dataJsonSchema;
        return this;
    }
    public String getDataJsonSchema() {
        return this.dataJsonSchema;
    }

}
