// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class AntdigitalWithHoldResponse extends TeaModel {
    // 网关返回码
    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 网关返回码描述
    /**
     * <strong>example:</strong>
     * <p>Business Failed</p>
     */
    @NameInMap("msg")
    @Validation(required = true)
    public String msg;

    // 务返回码
    /**
     * <strong>example:</strong>
     * <p>ACQ.TRADE_HAS_SUCCESS</p>
     */
    @NameInMap("sub_code")
    @Validation(required = true)
    public String subCode;

    // 业务返回码描述
    /**
     * <strong>example:</strong>
     * <p>交易已被支付</p>
     */
    @NameInMap("sub_msg")
    @Validation(required = true)
    public String subMsg;

    // 结果返回内容
    /**
     * <strong>example:</strong>
     * <p>{__}</p>
     */
    @NameInMap("data")
    public String data;

    // 响应签名
    /**
     * <strong>example:</strong>
     * <p>DZXh8eeTuAHoYE3w1J+POiPhfDxOYBfUNn1lkeT/V7P4zJdyojWEa6IZs6Hz0yDW5Cp/viufUb5I0/V5WENS3OYR8zRedqo6D+fUTdLHdc+EFyCkiQhBxIzgngPdPdfp1PIS7BdhhzrsZHbRqb7o4k3Dxc+AAnFauu4V6Zdwczo=</p>
     */
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
