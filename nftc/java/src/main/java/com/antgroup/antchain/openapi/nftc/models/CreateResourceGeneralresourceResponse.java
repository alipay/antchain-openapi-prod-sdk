// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class CreateResourceGeneralresourceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 资源ID
    @NameInMap("resource_id")
    public String resourceId;

    // 文件上传地址
    @NameInMap("url")
    public String url;

    // 资源上传的授权token，上传文件时需要将该值放入header中进行鉴权
    @NameInMap("maas_token")
    public String maasToken;

    public static CreateResourceGeneralresourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceGeneralresourceResponse self = new CreateResourceGeneralresourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateResourceGeneralresourceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateResourceGeneralresourceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateResourceGeneralresourceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateResourceGeneralresourceResponse setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public CreateResourceGeneralresourceResponse setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public CreateResourceGeneralresourceResponse setMaasToken(String maasToken) {
        this.maasToken = maasToken;
        return this;
    }
    public String getMaasToken() {
        return this.maasToken;
    }

}
