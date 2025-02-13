// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class SimStoreInfo extends TeaModel {
    // 门店对外业务id
    @NameInMap("store_id")
    @Validation(required = true)
    public String storeId;

    // 门店名称
    @NameInMap("store_name")
    @Validation(required = true)
    public String storeName;

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

}
