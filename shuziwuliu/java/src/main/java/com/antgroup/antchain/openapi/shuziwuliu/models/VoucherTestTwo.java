// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class VoucherTestTwo extends TeaModel {
    // 测试Boolean
    @NameInMap("voucher_test_two_boolean")
    @Validation(required = true)
    public Boolean voucherTestTwoBoolean;

    // 凭证列表_apiTestList
    @NameInMap("voucher_test_two_api_test_list")
    @Validation(required = true)
    public java.util.List<VoucherTestOne> voucherTestTwoApiTestList;

    // 测试Int
    @NameInMap("voucher_test_two_int")
    @Validation(required = true)
    public Long voucherTestTwoInt;

    // 测试Integer
    @NameInMap("voucher_test_two_integer")
    @Validation(required = true, maximum = 10)
    public Long voucherTestTwoInteger;

    // 凭证列表_dateList
    @NameInMap("voucher_test_two_date_list")
    @Validation(required = true)
    public java.util.List<String> voucherTestTwoDateList;

    // 测试String
    @NameInMap("voucher_test_two_string")
    @Validation(required = true, maxLength = 10)
    public String voucherTestTwoString;

    // 测试Date
    @NameInMap("voucher_test_two_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String voucherTestTwoDate;

    // 凭证列表_integerList
    @NameInMap("voucher_test_two_integer_list")
    @Validation(required = true)
    public java.util.List<Long> voucherTestTwoIntegerList;

    // 测试Long
    @NameInMap("voucher_test_two_long")
    @Validation(required = true, maximum = 10)
    public Long voucherTestTwoLong;

    // 凭证列表_longList
    @NameInMap("voucher_test_two_long_list")
    @Validation(required = true)
    public java.util.List<Long> voucherTestTwoLongList;

    // 凭证列表_stringList
    @NameInMap("voucher_test_two_string_list")
    @Validation(required = true)
    public java.util.List<String> voucherTestTwoStringList;

    // 测试apiTestInfo
    @NameInMap("voucher_test_two_api_test_info")
    @Validation(required = true)
    public VoucherTestOne voucherTestTwoApiTestInfo;

    // 凭证列表_booleanList
    @NameInMap("voucher_test_two_boolean_list")
    @Validation(required = true)
    public java.util.List<Boolean> voucherTestTwoBooleanList;

    public static VoucherTestTwo build(java.util.Map<String, ?> map) throws Exception {
        VoucherTestTwo self = new VoucherTestTwo();
        return TeaModel.build(map, self);
    }

    public VoucherTestTwo setVoucherTestTwoBoolean(Boolean voucherTestTwoBoolean) {
        this.voucherTestTwoBoolean = voucherTestTwoBoolean;
        return this;
    }
    public Boolean getVoucherTestTwoBoolean() {
        return this.voucherTestTwoBoolean;
    }

    public VoucherTestTwo setVoucherTestTwoApiTestList(java.util.List<VoucherTestOne> voucherTestTwoApiTestList) {
        this.voucherTestTwoApiTestList = voucherTestTwoApiTestList;
        return this;
    }
    public java.util.List<VoucherTestOne> getVoucherTestTwoApiTestList() {
        return this.voucherTestTwoApiTestList;
    }

    public VoucherTestTwo setVoucherTestTwoInt(Long voucherTestTwoInt) {
        this.voucherTestTwoInt = voucherTestTwoInt;
        return this;
    }
    public Long getVoucherTestTwoInt() {
        return this.voucherTestTwoInt;
    }

    public VoucherTestTwo setVoucherTestTwoInteger(Long voucherTestTwoInteger) {
        this.voucherTestTwoInteger = voucherTestTwoInteger;
        return this;
    }
    public Long getVoucherTestTwoInteger() {
        return this.voucherTestTwoInteger;
    }

    public VoucherTestTwo setVoucherTestTwoDateList(java.util.List<String> voucherTestTwoDateList) {
        this.voucherTestTwoDateList = voucherTestTwoDateList;
        return this;
    }
    public java.util.List<String> getVoucherTestTwoDateList() {
        return this.voucherTestTwoDateList;
    }

    public VoucherTestTwo setVoucherTestTwoString(String voucherTestTwoString) {
        this.voucherTestTwoString = voucherTestTwoString;
        return this;
    }
    public String getVoucherTestTwoString() {
        return this.voucherTestTwoString;
    }

    public VoucherTestTwo setVoucherTestTwoDate(String voucherTestTwoDate) {
        this.voucherTestTwoDate = voucherTestTwoDate;
        return this;
    }
    public String getVoucherTestTwoDate() {
        return this.voucherTestTwoDate;
    }

    public VoucherTestTwo setVoucherTestTwoIntegerList(java.util.List<Long> voucherTestTwoIntegerList) {
        this.voucherTestTwoIntegerList = voucherTestTwoIntegerList;
        return this;
    }
    public java.util.List<Long> getVoucherTestTwoIntegerList() {
        return this.voucherTestTwoIntegerList;
    }

    public VoucherTestTwo setVoucherTestTwoLong(Long voucherTestTwoLong) {
        this.voucherTestTwoLong = voucherTestTwoLong;
        return this;
    }
    public Long getVoucherTestTwoLong() {
        return this.voucherTestTwoLong;
    }

    public VoucherTestTwo setVoucherTestTwoLongList(java.util.List<Long> voucherTestTwoLongList) {
        this.voucherTestTwoLongList = voucherTestTwoLongList;
        return this;
    }
    public java.util.List<Long> getVoucherTestTwoLongList() {
        return this.voucherTestTwoLongList;
    }

    public VoucherTestTwo setVoucherTestTwoStringList(java.util.List<String> voucherTestTwoStringList) {
        this.voucherTestTwoStringList = voucherTestTwoStringList;
        return this;
    }
    public java.util.List<String> getVoucherTestTwoStringList() {
        return this.voucherTestTwoStringList;
    }

    public VoucherTestTwo setVoucherTestTwoApiTestInfo(VoucherTestOne voucherTestTwoApiTestInfo) {
        this.voucherTestTwoApiTestInfo = voucherTestTwoApiTestInfo;
        return this;
    }
    public VoucherTestOne getVoucherTestTwoApiTestInfo() {
        return this.voucherTestTwoApiTestInfo;
    }

    public VoucherTestTwo setVoucherTestTwoBooleanList(java.util.List<Boolean> voucherTestTwoBooleanList) {
        this.voucherTestTwoBooleanList = voucherTestTwoBooleanList;
        return this;
    }
    public java.util.List<Boolean> getVoucherTestTwoBooleanList() {
        return this.voucherTestTwoBooleanList;
    }

}
