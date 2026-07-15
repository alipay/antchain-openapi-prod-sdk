// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateFileIntegrationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 存储的文件名称，完成存证阶段需传入
    @NameInMap("object_name")
    public String objectName;

    // 文件上传的地址
    @NameInMap("upload_link")
    public String uploadLink;

    public static CreateFileIntegrationResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFileIntegrationResponse self = new CreateFileIntegrationResponse();
        return TeaModel.build(map, self);
    }

    public CreateFileIntegrationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateFileIntegrationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateFileIntegrationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateFileIntegrationResponse setObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }
    public String getObjectName() {
        return this.objectName;
    }

    public CreateFileIntegrationResponse setUploadLink(String uploadLink) {
        this.uploadLink = uploadLink;
        return this;
    }
    public String getUploadLink() {
        return this.uploadLink;
    }

}
