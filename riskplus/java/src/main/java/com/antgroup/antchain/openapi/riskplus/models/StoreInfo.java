// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class StoreInfo extends TeaModel {
    // 门店ID
    @NameInMap("store_id")
    @Validation(required = true)
    public String storeId;

    // 蚂蚁数科入驻账号
    @NameInMap("login_tenant")
    @Validation(required = true)
    public String loginTenant;

    // 收款账号
    @NameInMap("payee_bank_card")
    @Validation(required = true)
    public String payeeBankCard;

    // 收款人
    @NameInMap("payee_name")
    @Validation(required = true)
    public String payeeName;

    // 门店名称
    @NameInMap("store_name")
    @Validation(required = true)
    public String storeName;

    // 销售ID
    @NameInMap("salesman")
    public String salesman;

    // 销售设备编号
    @NameInMap("device")
    public String device;

    public static StoreInfo build(java.util.Map<String, ?> map) throws Exception {
        StoreInfo self = new StoreInfo();
        return TeaModel.build(map, self);
    }

    public StoreInfo setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public StoreInfo setLoginTenant(String loginTenant) {
        this.loginTenant = loginTenant;
        return this;
    }
    public String getLoginTenant() {
        return this.loginTenant;
    }

    public StoreInfo setPayeeBankCard(String payeeBankCard) {
        this.payeeBankCard = payeeBankCard;
        return this;
    }
    public String getPayeeBankCard() {
        return this.payeeBankCard;
    }

    public StoreInfo setPayeeName(String payeeName) {
        this.payeeName = payeeName;
        return this;
    }
    public String getPayeeName() {
        return this.payeeName;
    }

    public StoreInfo setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public StoreInfo setSalesman(String salesman) {
        this.salesman = salesman;
        return this;
    }
    public String getSalesman() {
        return this.salesman;
    }

    public StoreInfo setDevice(String device) {
        this.device = device;
        return this;
    }
    public String getDevice() {
        return this.device;
    }

}
