// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class ExecPromotionCouponResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 活动ID
    @NameInMap("activity_id")
    public String activityId;

    // 活动名称
    @NameInMap("activity_name")
    public String activityName;

    // 活动状态
    @NameInMap("activity_status")
    public String activityStatus;

    // 子错误码
    @NameInMap("sub_code")
    public String subCode;

    // 子错误描述
    @NameInMap("sub_message")
    public String subMessage;

    public static ExecPromotionCouponResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecPromotionCouponResponse self = new ExecPromotionCouponResponse();
        return TeaModel.build(map, self);
    }

    public ExecPromotionCouponResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecPromotionCouponResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecPromotionCouponResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecPromotionCouponResponse setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

    public ExecPromotionCouponResponse setActivityName(String activityName) {
        this.activityName = activityName;
        return this;
    }
    public String getActivityName() {
        return this.activityName;
    }

    public ExecPromotionCouponResponse setActivityStatus(String activityStatus) {
        this.activityStatus = activityStatus;
        return this;
    }
    public String getActivityStatus() {
        return this.activityStatus;
    }

    public ExecPromotionCouponResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public ExecPromotionCouponResponse setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

}
