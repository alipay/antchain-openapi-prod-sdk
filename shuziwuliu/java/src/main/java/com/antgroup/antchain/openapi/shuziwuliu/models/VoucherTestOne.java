// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class VoucherTestOne extends TeaModel {
    // 测试Long
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("voucher_test_one_long")
    @Validation(required = true, maximum = 10)
    public Long voucherTestOneLong;

    // 测试String
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("voucher_test_one_string")
    @Validation(required = true, maxLength = 10)
    public String voucherTestOneString;

    // 测试Int
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("voucher_test_one_int")
    @Validation(required = true)
    public Long voucherTestOneInt;

    // 测试Date
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("voucher_test_one_date")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String voucherTestOneDate;

    // 测试Integer
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("voucher_test_one_integer")
    @Validation(required = true, maximum = 10)
    public Long voucherTestOneInteger;

    // 测试Boolean
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("voucher_test_one_boolean")
    @Validation(required = true)
    public Boolean voucherTestOneBoolean;

    public static VoucherTestOne build(java.util.Map<String, ?> map) throws Exception {
        VoucherTestOne self = new VoucherTestOne();
        return TeaModel.build(map, self);
    }

    public VoucherTestOne setVoucherTestOneLong(Long voucherTestOneLong) {
        this.voucherTestOneLong = voucherTestOneLong;
        return this;
    }
    public Long getVoucherTestOneLong() {
        return this.voucherTestOneLong;
    }

    public VoucherTestOne setVoucherTestOneString(String voucherTestOneString) {
        this.voucherTestOneString = voucherTestOneString;
        return this;
    }
    public String getVoucherTestOneString() {
        return this.voucherTestOneString;
    }

    public VoucherTestOne setVoucherTestOneInt(Long voucherTestOneInt) {
        this.voucherTestOneInt = voucherTestOneInt;
        return this;
    }
    public Long getVoucherTestOneInt() {
        return this.voucherTestOneInt;
    }

    public VoucherTestOne setVoucherTestOneDate(String voucherTestOneDate) {
        this.voucherTestOneDate = voucherTestOneDate;
        return this;
    }
    public String getVoucherTestOneDate() {
        return this.voucherTestOneDate;
    }

    public VoucherTestOne setVoucherTestOneInteger(Long voucherTestOneInteger) {
        this.voucherTestOneInteger = voucherTestOneInteger;
        return this;
    }
    public Long getVoucherTestOneInteger() {
        return this.voucherTestOneInteger;
    }

    public VoucherTestOne setVoucherTestOneBoolean(Boolean voucherTestOneBoolean) {
        this.voucherTestOneBoolean = voucherTestOneBoolean;
        return this;
    }
    public Boolean getVoucherTestOneBoolean() {
        return this.voucherTestOneBoolean;
    }

}
