// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class ApiTest extends TeaModel {
    // 测试String
    @NameInMap("test_string")
    @Validation(required = true, maxLength = 100)
    public String testString;

    // 测试Int
    @NameInMap("test_int")
    @Validation(required = true, maximum = 100)
    public Long testInt;

    // 测试Integer
    @NameInMap("test_integer")
    @Validation(required = true, maximum = 100)
    public Long testInteger;

    // 测试Long
    @NameInMap("test_long")
    @Validation(required = true, maximum = 100)
    public Long testLong;

    // 测试Boolean
    @NameInMap("test_boolean")
    @Validation(required = true)
    public Boolean testBoolean;

    // 测试Date
    @NameInMap("test_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String testDate;

    // 凭证列表_stringList
    @NameInMap("string_list")
    @Validation(required = true)
    public java.util.List<String> stringList;

    // 凭证列表_ints
    @NameInMap("ints")
    @Validation(required = true)
    public java.util.List<Long> ints;

    // 凭证列表_longs
    @NameInMap("longs")
    @Validation(required = true)
    public java.util.List<Long> longs;

    // 凭证列表_integerList
    @NameInMap("integer_list")
    @Validation(required = true)
    public java.util.List<Long> integerList;

    // 凭证列表_longList
    @NameInMap("long_list")
    @Validation(required = true)
    public java.util.List<Long> longList;

    // 凭证列表_booleanList
    @NameInMap("boolean_list")
    @Validation(required = true)
    public java.util.List<Boolean> booleanList;

    // 凭证列表_dateList
    @NameInMap("date_list")
    @Validation(required = true)
    public java.util.List<String> dateList;

    // 凭证列表_apiTestList
    @NameInMap("api_test_list")
    @Validation(required = true)
    public java.util.List<ApiTestInfo> apiTestList;

    // 测试apiTestInfo
    @NameInMap("api_test_info")
    @Validation(required = true)
    public ApiTest apiTestInfo;

    public static ApiTest build(java.util.Map<String, ?> map) throws Exception {
        ApiTest self = new ApiTest();
        return TeaModel.build(map, self);
    }

    public ApiTest setTestString(String testString) {
        this.testString = testString;
        return this;
    }
    public String getTestString() {
        return this.testString;
    }

    public ApiTest setTestInt(Long testInt) {
        this.testInt = testInt;
        return this;
    }
    public Long getTestInt() {
        return this.testInt;
    }

    public ApiTest setTestInteger(Long testInteger) {
        this.testInteger = testInteger;
        return this;
    }
    public Long getTestInteger() {
        return this.testInteger;
    }

    public ApiTest setTestLong(Long testLong) {
        this.testLong = testLong;
        return this;
    }
    public Long getTestLong() {
        return this.testLong;
    }

    public ApiTest setTestBoolean(Boolean testBoolean) {
        this.testBoolean = testBoolean;
        return this;
    }
    public Boolean getTestBoolean() {
        return this.testBoolean;
    }

    public ApiTest setTestDate(String testDate) {
        this.testDate = testDate;
        return this;
    }
    public String getTestDate() {
        return this.testDate;
    }

    public ApiTest setStringList(java.util.List<String> stringList) {
        this.stringList = stringList;
        return this;
    }
    public java.util.List<String> getStringList() {
        return this.stringList;
    }

    public ApiTest setInts(java.util.List<Long> ints) {
        this.ints = ints;
        return this;
    }
    public java.util.List<Long> getInts() {
        return this.ints;
    }

    public ApiTest setLongs(java.util.List<Long> longs) {
        this.longs = longs;
        return this;
    }
    public java.util.List<Long> getLongs() {
        return this.longs;
    }

    public ApiTest setIntegerList(java.util.List<Long> integerList) {
        this.integerList = integerList;
        return this;
    }
    public java.util.List<Long> getIntegerList() {
        return this.integerList;
    }

    public ApiTest setLongList(java.util.List<Long> longList) {
        this.longList = longList;
        return this;
    }
    public java.util.List<Long> getLongList() {
        return this.longList;
    }

    public ApiTest setBooleanList(java.util.List<Boolean> booleanList) {
        this.booleanList = booleanList;
        return this;
    }
    public java.util.List<Boolean> getBooleanList() {
        return this.booleanList;
    }

    public ApiTest setDateList(java.util.List<String> dateList) {
        this.dateList = dateList;
        return this;
    }
    public java.util.List<String> getDateList() {
        return this.dateList;
    }

    public ApiTest setApiTestList(java.util.List<ApiTestInfo> apiTestList) {
        this.apiTestList = apiTestList;
        return this;
    }
    public java.util.List<ApiTestInfo> getApiTestList() {
        return this.apiTestList;
    }

    public ApiTest setApiTestInfo(ApiTest apiTestInfo) {
        this.apiTestInfo = apiTestInfo;
        return this;
    }
    public ApiTest getApiTestInfo() {
        return this.apiTestInfo;
    }

}
