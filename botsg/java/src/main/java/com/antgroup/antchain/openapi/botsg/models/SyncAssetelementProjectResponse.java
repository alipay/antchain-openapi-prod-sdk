// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.botsg.models;

import com.aliyun.tea.*;

public class SyncAssetelementProjectResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 同步结果
    @NameInMap("sync_status")
    public String syncStatus;

    public static SyncAssetelementProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncAssetelementProjectResponse self = new SyncAssetelementProjectResponse();
        return TeaModel.build(map, self);
    }

    public SyncAssetelementProjectResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SyncAssetelementProjectResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SyncAssetelementProjectResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SyncAssetelementProjectResponse setSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }
    public String getSyncStatus() {
        return this.syncStatus;
    }

}
