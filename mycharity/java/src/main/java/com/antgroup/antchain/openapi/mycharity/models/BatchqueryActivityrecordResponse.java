// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mycharity.models;

import com.aliyun.tea.*;

public class BatchqueryActivityrecordResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户活动徽章捐赠记录集合
    @NameInMap("activity_record_list")
    public java.util.List<ActivityRecordVO> activityRecordList;

    public static BatchqueryActivityrecordResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryActivityrecordResponse self = new BatchqueryActivityrecordResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryActivityrecordResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryActivityrecordResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryActivityrecordResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryActivityrecordResponse setActivityRecordList(java.util.List<ActivityRecordVO> activityRecordList) {
        this.activityRecordList = activityRecordList;
        return this;
    }
    public java.util.List<ActivityRecordVO> getActivityRecordList() {
        return this.activityRecordList;
    }

}
