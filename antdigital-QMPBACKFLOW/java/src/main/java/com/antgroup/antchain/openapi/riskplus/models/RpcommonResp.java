// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RpcommonResp extends TeaModel {
    // 调用是否成功
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    // 结果描述
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("result_msg")
    @Validation(required = true)
    public String resultMsg;

    // 结果码
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("response_code")
    @Validation(required = true)
    public String responseCode;

    // 具体返回值.jsonString形式
    /**
     * <strong>example:</strong>
     * <p>{&quot;a&quot;:1}</p>
     */
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    public static RpcommonResp build(java.util.Map<String, ?> map) throws Exception {
        RpcommonResp self = new RpcommonResp();
        return TeaModel.build(map, self);
    }

    public RpcommonResp setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RpcommonResp setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RpcommonResp setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public RpcommonResp setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
