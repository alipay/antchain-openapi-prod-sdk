// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class TypeMcpResponseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // string类型入参
    @NameInMap("string_parameter")
    public String stringParameter;

    // number类型入参
    @NameInMap("number_parameter")
    public Long numberParameter;

    // boolean类型入参
    @NameInMap("boolean_parameter")
    public Boolean booleanParameter;

    // date类型入参
    @NameInMap("date_parameter")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String dateParameter;

    // list_struct类型入参
    @NameInMap("list_parameter")
    public java.util.List<McpTestStruct> listParameter;

    // struct类型入参
    @NameInMap("struct_parameter")
    public McpTestStruct structParameter;

    // 超时时间
    @NameInMap("timeout")
    @Validation(required = true)
    public String timeout;

    public static TypeMcpResponseRequest build(java.util.Map<String, ?> map) throws Exception {
        TypeMcpResponseRequest self = new TypeMcpResponseRequest();
        return TeaModel.build(map, self);
    }

    public TypeMcpResponseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public TypeMcpResponseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public TypeMcpResponseRequest setStringParameter(String stringParameter) {
        this.stringParameter = stringParameter;
        return this;
    }
    public String getStringParameter() {
        return this.stringParameter;
    }

    public TypeMcpResponseRequest setNumberParameter(Long numberParameter) {
        this.numberParameter = numberParameter;
        return this;
    }
    public Long getNumberParameter() {
        return this.numberParameter;
    }

    public TypeMcpResponseRequest setBooleanParameter(Boolean booleanParameter) {
        this.booleanParameter = booleanParameter;
        return this;
    }
    public Boolean getBooleanParameter() {
        return this.booleanParameter;
    }

    public TypeMcpResponseRequest setDateParameter(String dateParameter) {
        this.dateParameter = dateParameter;
        return this;
    }
    public String getDateParameter() {
        return this.dateParameter;
    }

    public TypeMcpResponseRequest setListParameter(java.util.List<McpTestStruct> listParameter) {
        this.listParameter = listParameter;
        return this;
    }
    public java.util.List<McpTestStruct> getListParameter() {
        return this.listParameter;
    }

    public TypeMcpResponseRequest setStructParameter(McpTestStruct structParameter) {
        this.structParameter = structParameter;
        return this;
    }
    public McpTestStruct getStructParameter() {
        return this.structParameter;
    }

    public TypeMcpResponseRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

}
