// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateBuildpackGeneratesignurlResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // url
    @NameInMap("url")
    public String url;

    public static CreateBuildpackGeneratesignurlResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBuildpackGeneratesignurlResponse self = new CreateBuildpackGeneratesignurlResponse();
        return TeaModel.build(map, self);
    }

    public CreateBuildpackGeneratesignurlResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateBuildpackGeneratesignurlResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateBuildpackGeneratesignurlResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateBuildpackGeneratesignurlResponse setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
