// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class ComboCommodityOrder extends TeaModel {
    // 商品编码
    /**
     * <strong>example:</strong>
     * <p>KXSFFM00264687</p>
     */
    @NameInMap("commodity_code")
    @Validation(required = true)
    public String commodityCode;

    // 状态
    /**
     * <strong>example:</strong>
     * <p>COMPLETE</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 实例ID列表
    /**
     * <strong>example:</strong>
     * <p>A0BLOCKCHAINAXAXVZSE1ZXEMO6HM2S</p>
     */
    @NameInMap("instance_ids")
    @Validation(required = true)
    public java.util.List<String> instanceIds;

    public static ComboCommodityOrder build(java.util.Map<String, ?> map) throws Exception {
        ComboCommodityOrder self = new ComboCommodityOrder();
        return TeaModel.build(map, self);
    }

    public ComboCommodityOrder setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public ComboCommodityOrder setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ComboCommodityOrder setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

}
