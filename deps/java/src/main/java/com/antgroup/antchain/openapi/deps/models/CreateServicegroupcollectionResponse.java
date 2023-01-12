// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateServicegroupcollectionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 集合信息
    @NameInMap("collection")
    public String collection;

    public static CreateServicegroupcollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServicegroupcollectionResponse self = new CreateServicegroupcollectionResponse();
        return TeaModel.build(map, self);
    }

    public CreateServicegroupcollectionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateServicegroupcollectionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateServicegroupcollectionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateServicegroupcollectionResponse setCollection(String collection) {
        this.collection = collection;
        return this;
    }
    public String getCollection() {
        return this.collection;
    }

}
