// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class QueryPromoteActivityResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 助力活动的活动规则编码
    @NameInMap("promote_id")
    public String promoteId;

    // 活动状态：
    // ENABLE（进行中）
    // END（活动结束）
    @NameInMap("status")
    public String status;

    // 助力活动类型
    // ONCE（生命周期内一次）
    // DAILY（每日一次）
    @NameInMap("type")
    public String type;

    // 活动开始时间
    @NameInMap("start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    // 活动结束时间
    @NameInMap("end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    // 最大助力人数
    @NameInMap("max_num")
    public Long maxNum;

    // 当前助力成功人数
    @NameInMap("cur_num")
    public Long curNum;

    // 参与助力的唯一编码，供三方幂等记录并唯一发奖
    @NameInMap("promote_list")
    public java.util.List<String> promoteList;

    public static QueryPromoteActivityResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPromoteActivityResponse self = new QueryPromoteActivityResponse();
        return TeaModel.build(map, self);
    }

    public QueryPromoteActivityResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPromoteActivityResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPromoteActivityResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPromoteActivityResponse setPromoteId(String promoteId) {
        this.promoteId = promoteId;
        return this;
    }
    public String getPromoteId() {
        return this.promoteId;
    }

    public QueryPromoteActivityResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryPromoteActivityResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public QueryPromoteActivityResponse setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public QueryPromoteActivityResponse setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public QueryPromoteActivityResponse setMaxNum(Long maxNum) {
        this.maxNum = maxNum;
        return this;
    }
    public Long getMaxNum() {
        return this.maxNum;
    }

    public QueryPromoteActivityResponse setCurNum(Long curNum) {
        this.curNum = curNum;
        return this;
    }
    public Long getCurNum() {
        return this.curNum;
    }

    public QueryPromoteActivityResponse setPromoteList(java.util.List<String> promoteList) {
        this.promoteList = promoteList;
        return this;
    }
    public java.util.List<String> getPromoteList() {
        return this.promoteList;
    }

}
