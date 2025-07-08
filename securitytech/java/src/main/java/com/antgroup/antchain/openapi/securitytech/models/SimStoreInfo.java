// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class SimStoreInfo extends TeaModel {
    // 门店对外业务id
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("store_id")
    @Validation(required = true)
    public String storeId;

    // 门店名称
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("store_name")
    @Validation(required = true)
    public String storeName;

    // 是否签约 true已签约/false未签约
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("is_sign")
    @Validation(required = true)
    public Boolean isSign;

    // 支付宝H5签约链接 未签约时非空
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("sign_url")
    public String signUrl;

    public static SimStoreInfo build(java.util.Map<String, ?> map) throws Exception {
        SimStoreInfo self = new SimStoreInfo();
        return TeaModel.build(map, self);
    }

    public SimStoreInfo setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public SimStoreInfo setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public SimStoreInfo setIsSign(Boolean isSign) {
        this.isSign = isSign;
        return this;
    }
    public Boolean getIsSign() {
        return this.isSign;
    }

    public SimStoreInfo setSignUrl(String signUrl) {
        this.signUrl = signUrl;
        return this;
    }
    public String getSignUrl() {
        return this.signUrl;
    }

}
