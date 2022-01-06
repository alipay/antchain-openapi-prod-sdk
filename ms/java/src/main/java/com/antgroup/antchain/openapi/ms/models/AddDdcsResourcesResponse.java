// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class AddDdcsResourcesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 创建成功的资源信息
    @NameInMap("resource")
    public Resource resource;

    public static AddDdcsResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDdcsResourcesResponse self = new AddDdcsResourcesResponse();
        return TeaModel.build(map, self);
    }

    public AddDdcsResourcesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AddDdcsResourcesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddDdcsResourcesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AddDdcsResourcesResponse setResource(Resource resource) {
        this.resource = resource;
        return this;
    }
    public Resource getResource() {
        return this.resource;
    }

}
