// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class UserPrice extends TeaModel {
    // 具体价格
    @NameInMap("price")
    @Validation(required = true)
    public String price;

    // 相对比例
    @NameInMap("ratio")
    @Validation(required = true)
    public String ratio;

    // 对租户价格(需要和当前生效价格匹配)
    @NameInMap("snapshot_tenant_price")
    @Validation(required = true)
    public String snapshotTenantPrice;

    // 价格类型(数值/比例)
    @NameInMap("user_price_type")
    @Validation(required = true)
    public Long userPriceType;

    // 租户用户价格包括费率
    @NameInMap("user_price_with_commission")
    @Validation(required = true)
    public String userPriceWithCommission;

    public static UserPrice build(java.util.Map<String, ?> map) throws Exception {
        UserPrice self = new UserPrice();
        return TeaModel.build(map, self);
    }

    public UserPrice setPrice(String price) {
        this.price = price;
        return this;
    }
    public String getPrice() {
        return this.price;
    }

    public UserPrice setRatio(String ratio) {
        this.ratio = ratio;
        return this;
    }
    public String getRatio() {
        return this.ratio;
    }

    public UserPrice setSnapshotTenantPrice(String snapshotTenantPrice) {
        this.snapshotTenantPrice = snapshotTenantPrice;
        return this;
    }
    public String getSnapshotTenantPrice() {
        return this.snapshotTenantPrice;
    }

    public UserPrice setUserPriceType(Long userPriceType) {
        this.userPriceType = userPriceType;
        return this;
    }
    public Long getUserPriceType() {
        return this.userPriceType;
    }

    public UserPrice setUserPriceWithCommission(String userPriceWithCommission) {
        this.userPriceWithCommission = userPriceWithCommission;
        return this;
    }
    public String getUserPriceWithCommission() {
        return this.userPriceWithCommission;
    }

}
