// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CreateStandardVoucherRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 账户是否存在
    @NameInMap("exist")
    @Validation(required = true)
    public Boolean exist;

    // 签署方
    @NameInMap("voucher_test_one")
    @Validation(required = true)
    public VoucherTestTwo voucherTestOne;

    // 数据标识
    @NameInMap("business_code")
    @Validation(required = true, maxLength = 10)
    public String businessCode;

    // 凭证列表_apiTestList
    @NameInMap("voucher_test_three")
    @Validation(required = true)
    public java.util.List<VoucherTestTwo> voucherTestThree;

    // 发行时间
    @NameInMap("issue_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String issueTime;

    // 凭证列表_voucherList
    @NameInMap("voucher_list")
    @Validation(required = true)
    public java.util.List<String> voucherList;

    // 发行金额_Long
    @NameInMap("amount_long")
    @Validation(required = true, maximum = 10)
    public Long amountLong;

    // 发行金额_Integer
    @NameInMap("amount_int")
    @Validation(required = true, maximum = 10)
    public Long amountInt;

    // 签署方
    @NameInMap("voucher_test_two")
    @Validation(required = true)
    public VoucherTestTwo voucherTestTwo;

    // 凭证列表_booleanList
    @NameInMap("boolean_list")
    @Validation(required = true)
    public java.util.List<Boolean> booleanList;

    // 凭证列表_dateList
    @NameInMap("date_list")
    @Validation(required = true)
    public java.util.List<String> dateList;

    // 资产类型
    @NameInMap("asset_type")
    @Validation(required = true, maxLength = 10)
    public String assetType;

    public static CreateStandardVoucherRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStandardVoucherRequest self = new CreateStandardVoucherRequest();
        return TeaModel.build(map, self);
    }

    public CreateStandardVoucherRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateStandardVoucherRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateStandardVoucherRequest setExist(Boolean exist) {
        this.exist = exist;
        return this;
    }
    public Boolean getExist() {
        return this.exist;
    }

    public CreateStandardVoucherRequest setVoucherTestOne(VoucherTestTwo voucherTestOne) {
        this.voucherTestOne = voucherTestOne;
        return this;
    }
    public VoucherTestTwo getVoucherTestOne() {
        return this.voucherTestOne;
    }

    public CreateStandardVoucherRequest setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }
    public String getBusinessCode() {
        return this.businessCode;
    }

    public CreateStandardVoucherRequest setVoucherTestThree(java.util.List<VoucherTestTwo> voucherTestThree) {
        this.voucherTestThree = voucherTestThree;
        return this;
    }
    public java.util.List<VoucherTestTwo> getVoucherTestThree() {
        return this.voucherTestThree;
    }

    public CreateStandardVoucherRequest setIssueTime(String issueTime) {
        this.issueTime = issueTime;
        return this;
    }
    public String getIssueTime() {
        return this.issueTime;
    }

    public CreateStandardVoucherRequest setVoucherList(java.util.List<String> voucherList) {
        this.voucherList = voucherList;
        return this;
    }
    public java.util.List<String> getVoucherList() {
        return this.voucherList;
    }

    public CreateStandardVoucherRequest setAmountLong(Long amountLong) {
        this.amountLong = amountLong;
        return this;
    }
    public Long getAmountLong() {
        return this.amountLong;
    }

    public CreateStandardVoucherRequest setAmountInt(Long amountInt) {
        this.amountInt = amountInt;
        return this;
    }
    public Long getAmountInt() {
        return this.amountInt;
    }

    public CreateStandardVoucherRequest setVoucherTestTwo(VoucherTestTwo voucherTestTwo) {
        this.voucherTestTwo = voucherTestTwo;
        return this;
    }
    public VoucherTestTwo getVoucherTestTwo() {
        return this.voucherTestTwo;
    }

    public CreateStandardVoucherRequest setBooleanList(java.util.List<Boolean> booleanList) {
        this.booleanList = booleanList;
        return this;
    }
    public java.util.List<Boolean> getBooleanList() {
        return this.booleanList;
    }

    public CreateStandardVoucherRequest setDateList(java.util.List<String> dateList) {
        this.dateList = dateList;
        return this;
    }
    public java.util.List<String> getDateList() {
        return this.dateList;
    }

    public CreateStandardVoucherRequest setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
    }

}
