// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class CreateAutoGenerateCodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 必填参数
    @NameInMap("string_1")
    @Validation(required = true)
    public String string1;

    // 非必填参数
    @NameInMap("string_2")
    public String string2;

    // 长度限制2~5位
    @NameInMap("string_3")
    @Validation(required = true, maxLength = 5, minLength = 2)
    public String string3;

    // 长度限制3~5位
    @NameInMap("string_4")
    @Validation(maxLength = 5, minLength = 3)
    public String string4;

    // 数值必填
    @NameInMap("number_1")
    @Validation(required = true)
    public Long number1;

    // 数值非必填
    @NameInMap("number_2")
    public Long number2;

    // 最小2，最大10
    @NameInMap("number_3")
    @Validation(required = true, maximum = 10, minimum = 2)
    public Long number3;

    // 最小1，最大5
    @NameInMap("number_4")
    @Validation(maximum = 5, minimum = 1)
    public Long number4;

    // boolean必填
    @NameInMap("boolean_1")
    @Validation(required = true)
    public Boolean boolean1;

    // boolean非必填
    @NameInMap("boolean_2")
    public Boolean boolean2;

    // 必填日期
    @NameInMap("date_1")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String date1;

    // 非必填日期
    @NameInMap("date_2")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String date2;

    // 必填array
    @NameInMap("array_1")
    @Validation(required = true)
    public java.util.List<Long> array1;

    // 非必填array
    @NameInMap("array_2")
    public java.util.List<Long> array2;

    // 必填struct
    @NameInMap("struct_1")
    @Validation(required = true)
    public GroupAClass struct1;

    // 非必填struct
    @NameInMap("struct_2")
    @Validation(required = true)
    public GroupAClass struct2;

    public static CreateAutoGenerateCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoGenerateCodeRequest self = new CreateAutoGenerateCodeRequest();
        return TeaModel.build(map, self);
    }

    public CreateAutoGenerateCodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAutoGenerateCodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAutoGenerateCodeRequest setString1(String string1) {
        this.string1 = string1;
        return this;
    }
    public String getString1() {
        return this.string1;
    }

    public CreateAutoGenerateCodeRequest setString2(String string2) {
        this.string2 = string2;
        return this;
    }
    public String getString2() {
        return this.string2;
    }

    public CreateAutoGenerateCodeRequest setString3(String string3) {
        this.string3 = string3;
        return this;
    }
    public String getString3() {
        return this.string3;
    }

    public CreateAutoGenerateCodeRequest setString4(String string4) {
        this.string4 = string4;
        return this;
    }
    public String getString4() {
        return this.string4;
    }

    public CreateAutoGenerateCodeRequest setNumber1(Long number1) {
        this.number1 = number1;
        return this;
    }
    public Long getNumber1() {
        return this.number1;
    }

    public CreateAutoGenerateCodeRequest setNumber2(Long number2) {
        this.number2 = number2;
        return this;
    }
    public Long getNumber2() {
        return this.number2;
    }

    public CreateAutoGenerateCodeRequest setNumber3(Long number3) {
        this.number3 = number3;
        return this;
    }
    public Long getNumber3() {
        return this.number3;
    }

    public CreateAutoGenerateCodeRequest setNumber4(Long number4) {
        this.number4 = number4;
        return this;
    }
    public Long getNumber4() {
        return this.number4;
    }

    public CreateAutoGenerateCodeRequest setBoolean1(Boolean boolean1) {
        this.boolean1 = boolean1;
        return this;
    }
    public Boolean getBoolean1() {
        return this.boolean1;
    }

    public CreateAutoGenerateCodeRequest setBoolean2(Boolean boolean2) {
        this.boolean2 = boolean2;
        return this;
    }
    public Boolean getBoolean2() {
        return this.boolean2;
    }

    public CreateAutoGenerateCodeRequest setDate1(String date1) {
        this.date1 = date1;
        return this;
    }
    public String getDate1() {
        return this.date1;
    }

    public CreateAutoGenerateCodeRequest setDate2(String date2) {
        this.date2 = date2;
        return this;
    }
    public String getDate2() {
        return this.date2;
    }

    public CreateAutoGenerateCodeRequest setArray1(java.util.List<Long> array1) {
        this.array1 = array1;
        return this;
    }
    public java.util.List<Long> getArray1() {
        return this.array1;
    }

    public CreateAutoGenerateCodeRequest setArray2(java.util.List<Long> array2) {
        this.array2 = array2;
        return this;
    }
    public java.util.List<Long> getArray2() {
        return this.array2;
    }

    public CreateAutoGenerateCodeRequest setStruct1(GroupAClass struct1) {
        this.struct1 = struct1;
        return this;
    }
    public GroupAClass getStruct1() {
        return this.struct1;
    }

    public CreateAutoGenerateCodeRequest setStruct2(GroupAClass struct2) {
        this.struct2 = struct2;
        return this;
    }
    public GroupAClass getStruct2() {
        return this.struct2;
    }

}
