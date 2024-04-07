// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class StartAutomaticallyGenerateScriptsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 入参1
    @NameInMap("string_1")
    @Validation(required = true)
    public String string1;

    // 1
    @NameInMap("number_1")
    @Validation(required = true)
    public Long number1;

    // boolean
    @NameInMap("boolean_1")
    public Boolean boolean1;

    // date
    @NameInMap("date_1")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String date1;

    // 1
    @NameInMap("array_1")
    public java.util.List<String> array1;

    // struct
    @NameInMap("struct_1")
    @Validation(required = true)
    public GroupAClass struct1;

    public static StartAutomaticallyGenerateScriptsRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAutomaticallyGenerateScriptsRequest self = new StartAutomaticallyGenerateScriptsRequest();
        return TeaModel.build(map, self);
    }

    public StartAutomaticallyGenerateScriptsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartAutomaticallyGenerateScriptsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartAutomaticallyGenerateScriptsRequest setString1(String string1) {
        this.string1 = string1;
        return this;
    }
    public String getString1() {
        return this.string1;
    }

    public StartAutomaticallyGenerateScriptsRequest setNumber1(Long number1) {
        this.number1 = number1;
        return this;
    }
    public Long getNumber1() {
        return this.number1;
    }

    public StartAutomaticallyGenerateScriptsRequest setBoolean1(Boolean boolean1) {
        this.boolean1 = boolean1;
        return this;
    }
    public Boolean getBoolean1() {
        return this.boolean1;
    }

    public StartAutomaticallyGenerateScriptsRequest setDate1(String date1) {
        this.date1 = date1;
        return this;
    }
    public String getDate1() {
        return this.date1;
    }

    public StartAutomaticallyGenerateScriptsRequest setArray1(java.util.List<String> array1) {
        this.array1 = array1;
        return this;
    }
    public java.util.List<String> getArray1() {
        return this.array1;
    }

    public StartAutomaticallyGenerateScriptsRequest setStruct1(GroupAClass struct1) {
        this.struct1 = struct1;
        return this;
    }
    public GroupAClass getStruct1() {
        return this.struct1;
    }

}
