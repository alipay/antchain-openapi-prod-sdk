// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ListSofamqRoomResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // room
    @NameInMap("data")
    public java.util.List<RoomDO> data;

    public static ListSofamqRoomResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSofamqRoomResponse self = new ListSofamqRoomResponse();
        return TeaModel.build(map, self);
    }

    public ListSofamqRoomResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSofamqRoomResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSofamqRoomResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSofamqRoomResponse setData(java.util.List<RoomDO> data) {
        this.data = data;
        return this;
    }
    public java.util.List<RoomDO> getData() {
        return this.data;
    }

}
