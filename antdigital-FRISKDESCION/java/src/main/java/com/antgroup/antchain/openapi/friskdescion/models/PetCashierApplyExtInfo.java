// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.friskdescion.models;

import com.aliyun.tea.*;

public class PetCashierApplyExtInfo extends TeaModel {
    // 门店名称
    @NameInMap("store_name")
    public String storeName;

    // 门店id
    @NameInMap("store_id")
    public String storeId;

    // 门店社会统一信用代码
    @NameInMap("store_social_code")
    public String storeSocialCode;

    // 门店地址
    @NameInMap("store_address")
    public String storeAddress;

    // 门店地址省
    @NameInMap("store_addr_prov")
    public String storeAddrProv;

    // 门店地址市
    @NameInMap("store_addr_city")
    public String storeAddrCity;

    // 门店地址区
    @NameInMap("store_addr_dstc")
    public String storeAddrDstc;

    // 厂商社会信用代码
    @NameInMap("vendor_social_code")
    @Validation(required = true)
    public String vendorSocialCode;

    // 厂商名称
    @NameInMap("vendor_name")
    @Validation(required = true)
    public String vendorName;

    // 商品型号
    @NameInMap("comm_model")
    @Validation(required = true)
    public String commModel;

    // 商品总价(包含定金)	String
    @NameInMap("total_price")
    public String totalPrice;

    // 已付定金
    @NameInMap("first_pay_amount")
    public String firstPayAmount;

    // 已付货款
    @NameInMap("order_paid_amount")
    public String orderPaidAmount;

    // 客户历史交易信息
    @NameInMap("his_tran_info")
    public java.util.List<HisTranInfo> hisTranInfo;

    public static PetCashierApplyExtInfo build(java.util.Map<String, ?> map) throws Exception {
        PetCashierApplyExtInfo self = new PetCashierApplyExtInfo();
        return TeaModel.build(map, self);
    }

    public PetCashierApplyExtInfo setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public PetCashierApplyExtInfo setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public PetCashierApplyExtInfo setStoreSocialCode(String storeSocialCode) {
        this.storeSocialCode = storeSocialCode;
        return this;
    }
    public String getStoreSocialCode() {
        return this.storeSocialCode;
    }

    public PetCashierApplyExtInfo setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
        return this;
    }
    public String getStoreAddress() {
        return this.storeAddress;
    }

    public PetCashierApplyExtInfo setStoreAddrProv(String storeAddrProv) {
        this.storeAddrProv = storeAddrProv;
        return this;
    }
    public String getStoreAddrProv() {
        return this.storeAddrProv;
    }

    public PetCashierApplyExtInfo setStoreAddrCity(String storeAddrCity) {
        this.storeAddrCity = storeAddrCity;
        return this;
    }
    public String getStoreAddrCity() {
        return this.storeAddrCity;
    }

    public PetCashierApplyExtInfo setStoreAddrDstc(String storeAddrDstc) {
        this.storeAddrDstc = storeAddrDstc;
        return this;
    }
    public String getStoreAddrDstc() {
        return this.storeAddrDstc;
    }

    public PetCashierApplyExtInfo setVendorSocialCode(String vendorSocialCode) {
        this.vendorSocialCode = vendorSocialCode;
        return this;
    }
    public String getVendorSocialCode() {
        return this.vendorSocialCode;
    }

    public PetCashierApplyExtInfo setVendorName(String vendorName) {
        this.vendorName = vendorName;
        return this;
    }
    public String getVendorName() {
        return this.vendorName;
    }

    public PetCashierApplyExtInfo setCommModel(String commModel) {
        this.commModel = commModel;
        return this;
    }
    public String getCommModel() {
        return this.commModel;
    }

    public PetCashierApplyExtInfo setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }
    public String getTotalPrice() {
        return this.totalPrice;
    }

    public PetCashierApplyExtInfo setFirstPayAmount(String firstPayAmount) {
        this.firstPayAmount = firstPayAmount;
        return this;
    }
    public String getFirstPayAmount() {
        return this.firstPayAmount;
    }

    public PetCashierApplyExtInfo setOrderPaidAmount(String orderPaidAmount) {
        this.orderPaidAmount = orderPaidAmount;
        return this;
    }
    public String getOrderPaidAmount() {
        return this.orderPaidAmount;
    }

    public PetCashierApplyExtInfo setHisTranInfo(java.util.List<HisTranInfo> hisTranInfo) {
        this.hisTranInfo = hisTranInfo;
        return this;
    }
    public java.util.List<HisTranInfo> getHisTranInfo() {
        return this.hisTranInfo;
    }

}
