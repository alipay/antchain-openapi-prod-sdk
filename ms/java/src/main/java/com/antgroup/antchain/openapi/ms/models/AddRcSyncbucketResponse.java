// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddRcSyncbucketResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 一键创建集群同步任务结果
    @NameInMap("data")
    public SyncBucketAddResult data;

    public static AddRcSyncbucketResponse build(java.util.Map<String, ?> map) throws Exception {
        AddRcSyncbucketResponse self = new AddRcSyncbucketResponse();
        return TeaModel.build(map, self);
    }

    public AddRcSyncbucketResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AddRcSyncbucketResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddRcSyncbucketResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AddRcSyncbucketResponse setData(SyncBucketAddResult data) {
        this.data = data;
        return this;
    }
    public SyncBucketAddResult getData() {
        return this.data;
    }

}
