// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class RpcommonResp extends TeaModel {
    // 调用是否成功
    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    // 结果描述
    @NameInMap("result_msg")
    @Validation(required = true)
    public String resultMsg;

    // 结果码
    @NameInMap("response_code")
    @Validation(required = true)
    public String responseCode;

    // 具体返回值.jsonString形式
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
