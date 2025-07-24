// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class RightsGrantResultVO extends TeaModel {
    // 过期时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("expire_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String expireTime;

    // 生效时间
    @NameInMap("effect_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String effectTime;

    // 发放状态：
    // GRANTING：发放处理中 GRANT_SUCCESS：发放成功 GRANT_FAIL：发放失败
    /**
     * <strong>example:</strong>
     * <p>GRANTING</p>
     */
    @NameInMap("grant_status")
    @Validation(required = true)
    public String grantStatus;

    // 订单详情列表
    @NameInMap("order_details")
    public java.util.List<OrderDetail> orderDetails;

    public static RightsGrantResultVO build(java.util.Map<String, ?> map) throws Exception {
        RightsGrantResultVO self = new RightsGrantResultVO();
        return TeaModel.build(map, self);
    }

    public RightsGrantResultVO setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public RightsGrantResultVO setEffectTime(String effectTime) {
        this.effectTime = effectTime;
        return this;
    }
    public String getEffectTime() {
        return this.effectTime;
    }

    public RightsGrantResultVO setGrantStatus(String grantStatus) {
        this.grantStatus = grantStatus;
        return this;
    }
    public String getGrantStatus() {
        return this.grantStatus;
    }

    public RightsGrantResultVO setOrderDetails(java.util.List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
        return this;
    }
    public java.util.List<OrderDetail> getOrderDetails() {
        return this.orderDetails;
    }

}
