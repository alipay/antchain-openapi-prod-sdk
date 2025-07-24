// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class CommonResponse extends TeaModel {
    // 结果码
    /**
     * <strong>example:</strong>
     * <p>100001</p>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 返回码描述
    /**
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("msg")
    @Validation(required = true)
    public String msg;

    // 业务处理结果码
    // 
    /**
     * <strong>example:</strong>
     * <p>fail</p>
     */
    @NameInMap("sub_code")
    public String subCode;

    // 返回的提示信息
    /**
     * <strong>example:</strong>
     * <p>失败</p>
     */
    @NameInMap("sub_msg")
    public String subMsg;

    // 可否重试
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("retry")
    public Boolean retry;

    public static CommonResponse build(java.util.Map<String, ?> map) throws Exception {
        CommonResponse self = new CommonResponse();
        return TeaModel.build(map, self);
    }

    public CommonResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CommonResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public CommonResponse setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public CommonResponse setSubMsg(String subMsg) {
        this.subMsg = subMsg;
        return this;
    }
    public String getSubMsg() {
        return this.subMsg;
    }

    public CommonResponse setRetry(Boolean retry) {
        this.retry = retry;
        return this;
    }
    public Boolean getRetry() {
        return this.retry;
    }

}
