// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class FarmingQueryModel extends TeaModel {
    // 支付宝外部交易号
    @NameInMap("out_order_no")
    @Validation(maxLength = 128, minLength = 1)
    public String outOrderNo;

    // 支付宝内部交易号
    @NameInMap("order_no")
    @Validation(maxLength = 128, minLength = 1)
    public String orderNo;

    // 金额，用户购买或使用服务时产生的具体金额，单位：分
    @NameInMap("sales_amount")
    @Validation(maximum = 10000000, minimum = 1)
    public Long salesAmount;

    // 银行卡号
    @NameInMap("bank_card_no")
    @Validation(maxLength = 128, minLength = 1)
    public String bankCardNo;

    // 服务商 pid
    @NameInMap("isv_pid")
    @Validation(maxLength = 128, minLength = 1)
    public String isvPid;

    // 门店行业类目，枚举值：CATERING - 餐饮；LEISURE - 休闲；MEDICAL - 医疗
    @NameInMap("store_mcc_desc")
    @Validation(maxLength = 30, minLength = 1)
    public String storeMccDesc;

    // 门店地址；不需要传城市和行政区
    @NameInMap("outlet_address")
    @Validation(maxLength = 128, minLength = 1)
    public String outletAddress;

    // 公司名称
    @NameInMap("company_name")
    @Validation(maxLength = 128, minLength = 1)
    public String companyName;

    // 店铺名称
    @NameInMap("store_name")
    @Validation(maxLength = 128, minLength = 1)
    public String storeName;

    public static FarmingQueryModel build(java.util.Map<String, ?> map) throws Exception {
        FarmingQueryModel self = new FarmingQueryModel();
        return TeaModel.build(map, self);
    }

    public FarmingQueryModel setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
        return this;
    }
    public String getOutOrderNo() {
        return this.outOrderNo;
    }

    public FarmingQueryModel setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public FarmingQueryModel setSalesAmount(Long salesAmount) {
        this.salesAmount = salesAmount;
        return this;
    }
    public Long getSalesAmount() {
        return this.salesAmount;
    }

    public FarmingQueryModel setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
        return this;
    }
    public String getBankCardNo() {
        return this.bankCardNo;
    }

    public FarmingQueryModel setIsvPid(String isvPid) {
        this.isvPid = isvPid;
        return this;
    }
    public String getIsvPid() {
        return this.isvPid;
    }

    public FarmingQueryModel setStoreMccDesc(String storeMccDesc) {
        this.storeMccDesc = storeMccDesc;
        return this;
    }
    public String getStoreMccDesc() {
        return this.storeMccDesc;
    }

    public FarmingQueryModel setOutletAddress(String outletAddress) {
        this.outletAddress = outletAddress;
        return this;
    }
    public String getOutletAddress() {
        return this.outletAddress;
    }

    public FarmingQueryModel setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public FarmingQueryModel setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

}
