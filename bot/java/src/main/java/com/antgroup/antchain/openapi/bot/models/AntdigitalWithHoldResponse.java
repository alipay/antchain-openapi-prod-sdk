// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class AntdigitalWithHoldResponse extends TeaModel {
    // 网关返回码
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 网关返回码描述
    @NameInMap("msg")
    @Validation(required = true)
    public String msg;

    // 务返回码
    @NameInMap("sub_code")
    @Validation(required = true)
    public String subCode;

    // 业务返回码描述
    @NameInMap("sub_msg")
    @Validation(required = true)
    public String subMsg;

    // 结果返回内容
    @NameInMap("data")
    public String data;

    // 响应签名
    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    public static AntdigitalWithHoldResponse build(java.util.Map<String, ?> map) throws Exception {
        AntdigitalWithHoldResponse self = new AntdigitalWithHoldResponse();
        return TeaModel.build(map, self);
    }

    public AntdigitalWithHoldResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AntdigitalWithHoldResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public AntdigitalWithHoldResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public AntdigitalWithHoldResponse setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

    public AntdigitalWithHoldResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public AntdigitalWithHoldResponse setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
