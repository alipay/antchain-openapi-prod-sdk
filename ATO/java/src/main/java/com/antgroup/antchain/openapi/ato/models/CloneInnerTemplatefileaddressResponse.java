// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CloneInnerTemplatefileaddressResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 拷贝后的文件key
    @NameInMap("file_key")
    public String fileKey;

    public static CloneInnerTemplatefileaddressResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneInnerTemplatefileaddressResponse self = new CloneInnerTemplatefileaddressResponse();
        return TeaModel.build(map, self);
    }

    public CloneInnerTemplatefileaddressResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CloneInnerTemplatefileaddressResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CloneInnerTemplatefileaddressResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CloneInnerTemplatefileaddressResponse setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

}
