// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class CreateAutoTestCodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 111
    @NameInMap("string_param_1")
    @Validation(required = true)
    public String stringParam1;

    // 222
    @NameInMap("string_param_2")
    public String stringParam2;

    // 111
    @NameInMap("number_param_1")
    @Validation(required = true)
    public Long numberParam1;

    // 222
    @NameInMap("number_param_2")
    public Long numberParam2;

    // 111
    @NameInMap("bool_param_1")
    @Validation(required = true)
    public Boolean boolParam1;

    // 222
    @NameInMap("bool_param_2")
    public Boolean boolParam2;

    // 111
    @NameInMap("date_param_1")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String dateParam1;

    // 222
    @NameInMap("date_param_2")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String dateParam2;

    // 111
    @NameInMap("array_param_1")
    @Validation(required = true)
    public java.util.List<String> arrayParam1;

    // 222
    @NameInMap("array_param_2")
    public java.util.List<String> arrayParam2;

    // 111
    @NameInMap("struct_param_1")
    @Validation(required = true)
    public AutoCodeModel structParam1;

    // 222
    @NameInMap("struct_param_2")
    public AutoCodeModel structParam2;

    public static CreateAutoTestCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoTestCodeRequest self = new CreateAutoTestCodeRequest();
        return TeaModel.build(map, self);
    }

    public CreateAutoTestCodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAutoTestCodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAutoTestCodeRequest setStringParam1(String stringParam1) {
        this.stringParam1 = stringParam1;
        return this;
    }
    public String getStringParam1() {
        return this.stringParam1;
    }

    public CreateAutoTestCodeRequest setStringParam2(String stringParam2) {
        this.stringParam2 = stringParam2;
        return this;
    }
    public String getStringParam2() {
        return this.stringParam2;
    }

    public CreateAutoTestCodeRequest setNumberParam1(Long numberParam1) {
        this.numberParam1 = numberParam1;
        return this;
    }
    public Long getNumberParam1() {
        return this.numberParam1;
    }

    public CreateAutoTestCodeRequest setNumberParam2(Long numberParam2) {
        this.numberParam2 = numberParam2;
        return this;
    }
    public Long getNumberParam2() {
        return this.numberParam2;
    }

    public CreateAutoTestCodeRequest setBoolParam1(Boolean boolParam1) {
        this.boolParam1 = boolParam1;
        return this;
    }
    public Boolean getBoolParam1() {
        return this.boolParam1;
    }

    public CreateAutoTestCodeRequest setBoolParam2(Boolean boolParam2) {
        this.boolParam2 = boolParam2;
        return this;
    }
    public Boolean getBoolParam2() {
        return this.boolParam2;
    }

    public CreateAutoTestCodeRequest setDateParam1(String dateParam1) {
        this.dateParam1 = dateParam1;
        return this;
    }
    public String getDateParam1() {
        return this.dateParam1;
    }

    public CreateAutoTestCodeRequest setDateParam2(String dateParam2) {
        this.dateParam2 = dateParam2;
        return this;
    }
    public String getDateParam2() {
        return this.dateParam2;
    }

    public CreateAutoTestCodeRequest setArrayParam1(java.util.List<String> arrayParam1) {
        this.arrayParam1 = arrayParam1;
        return this;
    }
    public java.util.List<String> getArrayParam1() {
        return this.arrayParam1;
    }

    public CreateAutoTestCodeRequest setArrayParam2(java.util.List<String> arrayParam2) {
        this.arrayParam2 = arrayParam2;
        return this;
    }
    public java.util.List<String> getArrayParam2() {
        return this.arrayParam2;
    }

    public CreateAutoTestCodeRequest setStructParam1(AutoCodeModel structParam1) {
        this.structParam1 = structParam1;
        return this;
    }
    public AutoCodeModel getStructParam1() {
        return this.structParam1;
    }

    public CreateAutoTestCodeRequest setStructParam2(AutoCodeModel structParam2) {
        this.structParam2 = structParam2;
        return this;
    }
    public AutoCodeModel getStructParam2() {
        return this.structParam2;
    }

}
