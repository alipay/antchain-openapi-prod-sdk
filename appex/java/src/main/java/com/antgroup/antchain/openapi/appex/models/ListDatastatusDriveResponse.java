// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class ListDatastatusDriveResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 数据状态流转
    // 
    @NameInMap("data_status_drive_list")
    public java.util.List<StatusDrive> dataStatusDriveList;

    public static ListDatastatusDriveResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDatastatusDriveResponse self = new ListDatastatusDriveResponse();
        return TeaModel.build(map, self);
    }

    public ListDatastatusDriveResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListDatastatusDriveResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListDatastatusDriveResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListDatastatusDriveResponse setDataStatusDriveList(java.util.List<StatusDrive> dataStatusDriveList) {
        this.dataStatusDriveList = dataStatusDriveList;
        return this;
    }
    public java.util.List<StatusDrive> getDataStatusDriveList() {
        return this.dataStatusDriveList;
    }

}
