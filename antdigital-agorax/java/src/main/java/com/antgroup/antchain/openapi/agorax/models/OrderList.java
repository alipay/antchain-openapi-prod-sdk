// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class OrderList extends TeaModel {
    // 活动ID
    /**
     * <strong>example:</strong>
     * <p>0zgNdId0nxi95b5lsNpazWYoCo5</p>
     */
    @NameInMap("activity_id")
    public String activityId;

    // 记录ID
    /**
     * <strong>example:</strong>
     * <p>110000199001011234</p>
     */
    @NameInMap("id")
    public String id;

    // 业务ID
    /**
     * <strong>example:</strong>
     * <p>b5lsNpazWYoCo5</p>
     */
    @NameInMap("biz_id")
    public String bizId;

    // 奖品id
    /**
     * <strong>example:</strong>
     * <p>110000199001011234</p>
     */
    @NameInMap("prize_id")
    public String prizeId;

    public static OrderList build(java.util.Map<String, ?> map) throws Exception {
        OrderList self = new OrderList();
        return TeaModel.build(map, self);
    }

    public OrderList setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

    public OrderList setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public OrderList setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public OrderList setPrizeId(String prizeId) {
        this.prizeId = prizeId;
        return this;
    }
    public String getPrizeId() {
        return this.prizeId;
    }

}
