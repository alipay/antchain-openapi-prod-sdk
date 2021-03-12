// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class SyncMydidcommunWorkergroupGroupResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 是否成功
    @NameInMap("data")
    public String data;

    public static SyncMydidcommunWorkergroupGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncMydidcommunWorkergroupGroupResponse self = new SyncMydidcommunWorkergroupGroupResponse();
        return TeaModel.build(map, self);
    }

    public SyncMydidcommunWorkergroupGroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SyncMydidcommunWorkergroupGroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SyncMydidcommunWorkergroupGroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SyncMydidcommunWorkergroupGroupResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
