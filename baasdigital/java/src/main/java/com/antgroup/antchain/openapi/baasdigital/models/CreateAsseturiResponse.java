// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class CreateAsseturiResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 可公开访问的asseturi地址。
    @NameInMap("access_uri")
    public String accessUri;

    // assetUri文件内容
    @NameInMap("json_info")
    public String jsonInfo;

    public static CreateAsseturiResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAsseturiResponse self = new CreateAsseturiResponse();
        return TeaModel.build(map, self);
    }

    public CreateAsseturiResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateAsseturiResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateAsseturiResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateAsseturiResponse setAccessUri(String accessUri) {
        this.accessUri = accessUri;
        return this;
    }
    public String getAccessUri() {
        return this.accessUri;
    }

    public CreateAsseturiResponse setJsonInfo(String jsonInfo) {
        this.jsonInfo = jsonInfo;
        return this;
    }
    public String getJsonInfo() {
        return this.jsonInfo;
    }

}
