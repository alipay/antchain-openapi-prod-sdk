// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class QueryPromotionActivityResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 活动基本信息
    @NameInMap("activity_base_info")
    public ActivityBaseInfo activityBaseInfo;

    // 关联奖品列表
    @NameInMap("prize_list")
    public PrizeList prizeList;

    public static QueryPromotionActivityResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPromotionActivityResponse self = new QueryPromotionActivityResponse();
        return TeaModel.build(map, self);
    }

    public QueryPromotionActivityResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPromotionActivityResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPromotionActivityResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPromotionActivityResponse setActivityBaseInfo(ActivityBaseInfo activityBaseInfo) {
        this.activityBaseInfo = activityBaseInfo;
        return this;
    }
    public ActivityBaseInfo getActivityBaseInfo() {
        return this.activityBaseInfo;
    }

    public QueryPromotionActivityResponse setPrizeList(PrizeList prizeList) {
        this.prizeList = prizeList;
        return this;
    }
    public PrizeList getPrizeList() {
        return this.prizeList;
    }

}
