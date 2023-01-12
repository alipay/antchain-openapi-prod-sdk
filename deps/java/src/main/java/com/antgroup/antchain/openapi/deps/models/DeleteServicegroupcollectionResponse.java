// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class DeleteServicegroupcollectionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 集合
    @NameInMap("collections")
    public java.util.List<String> collections;

    public static DeleteServicegroupcollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServicegroupcollectionResponse self = new DeleteServicegroupcollectionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteServicegroupcollectionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DeleteServicegroupcollectionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteServicegroupcollectionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DeleteServicegroupcollectionResponse setCollections(java.util.List<String> collections) {
        this.collections = collections;
        return this;
    }
    public java.util.List<String> getCollections() {
        return this.collections;
    }

}
