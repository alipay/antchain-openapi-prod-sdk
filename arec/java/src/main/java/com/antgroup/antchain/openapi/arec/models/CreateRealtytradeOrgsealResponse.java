// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class CreateRealtytradeOrgsealResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 企业印章 ID
    @NameInMap("org_seal_id")
    public String orgSealId;

    // 印章图片下载URL地址，1个小时内有效
    @NameInMap("url")
    public String url;

    public static CreateRealtytradeOrgsealResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRealtytradeOrgsealResponse self = new CreateRealtytradeOrgsealResponse();
        return TeaModel.build(map, self);
    }

    public CreateRealtytradeOrgsealResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateRealtytradeOrgsealResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateRealtytradeOrgsealResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateRealtytradeOrgsealResponse setOrgSealId(String orgSealId) {
        this.orgSealId = orgSealId;
        return this;
    }
    public String getOrgSealId() {
        return this.orgSealId;
    }

    public CreateRealtytradeOrgsealResponse setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
