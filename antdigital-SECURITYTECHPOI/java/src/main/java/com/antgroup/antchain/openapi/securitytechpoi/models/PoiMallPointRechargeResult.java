// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytechpoi.models;

import com.aliyun.tea.*;

public class PoiMallPointRechargeResult extends TeaModel {
    // 充值成功的ID列表
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("succeed_recharge_ids")
    public java.util.List<String> succeedRechargeIds;

    // 充值失败的ID列表（全部成功时为空）
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("failed_recharge_ids")
    public java.util.List<String> failedRechargeIds;

    public static PoiMallPointRechargeResult build(java.util.Map<String, ?> map) throws Exception {
        PoiMallPointRechargeResult self = new PoiMallPointRechargeResult();
        return TeaModel.build(map, self);
    }

    public PoiMallPointRechargeResult setSucceedRechargeIds(java.util.List<String> succeedRechargeIds) {
        this.succeedRechargeIds = succeedRechargeIds;
        return this;
    }
    public java.util.List<String> getSucceedRechargeIds() {
        return this.succeedRechargeIds;
    }

    public PoiMallPointRechargeResult setFailedRechargeIds(java.util.List<String> failedRechargeIds) {
        this.failedRechargeIds = failedRechargeIds;
        return this;
    }
    public java.util.List<String> getFailedRechargeIds() {
        return this.failedRechargeIds;
    }

}
