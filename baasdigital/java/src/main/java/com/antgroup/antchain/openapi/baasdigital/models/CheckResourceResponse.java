// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class CheckResourceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 可公开访问的资源地址。为空则表示暂时无法访问
    @NameInMap("access_url")
    public String accessUrl;

    // upload：文件已上传
    // check：内容检测中
    // invalid：图片不可访问
    // pass：可公开访问
    // publish：已绑定至某个项目
    @NameInMap("status")
    public String status;

    public static CheckResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckResourceResponse self = new CheckResourceResponse();
        return TeaModel.build(map, self);
    }

    public CheckResourceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckResourceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckResourceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckResourceResponse setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
        return this;
    }
    public String getAccessUrl() {
        return this.accessUrl;
    }

    public CheckResourceResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
