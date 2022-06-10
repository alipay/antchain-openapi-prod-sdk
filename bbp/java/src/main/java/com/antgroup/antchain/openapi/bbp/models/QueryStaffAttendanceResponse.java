// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class QueryStaffAttendanceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 考勤信息查询
    @NameInMap("attendance")
    public java.util.List<Attendance> attendance;

    public static QueryStaffAttendanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStaffAttendanceResponse self = new QueryStaffAttendanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryStaffAttendanceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryStaffAttendanceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryStaffAttendanceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryStaffAttendanceResponse setAttendance(java.util.List<Attendance> attendance) {
        this.attendance = attendance;
        return this;
    }
    public java.util.List<Attendance> getAttendance() {
        return this.attendance;
    }

}
