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

    // 触发时间
    /**
     * <strong>example:</strong>
     * <p>2026-04-29 10:19:23</p>
     */
    @NameInMap("send_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String sendTime;

    // 发券结果
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("send_status")
    public String sendStatus;

    // 错误码
    /**
     * <strong>example:</strong>
     * <p>10000911</p>
     */
    @NameInMap("error_code")
    public String errorCode;

    // 错误描述
    /**
     * <strong>example:</strong>
     * <p>[10000911]指定奖品指定金额决策参数检查异常</p>
     */
    @NameInMap("error_msg")
    public String errorMsg;

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

    public OrderList setSendTime(String sendTime) {
        this.sendTime = sendTime;
        return this;
    }
    public String getSendTime() {
        return this.sendTime;
    }

    public OrderList setSendStatus(String sendStatus) {
        this.sendStatus = sendStatus;
        return this;
    }
    public String getSendStatus() {
        return this.sendStatus;
    }

    public OrderList setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public OrderList setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

}
