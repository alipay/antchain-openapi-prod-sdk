// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiosproduct.models;

import com.aliyun.tea.*;

public class SaveGwchildinsuranceRecommendationplanadjustResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 业务数据 JSON 字符串
    @NameInMap("data")
    public String data;

    // 成功时允许为 null，失败时返回可理解原因
    @NameInMap("message")
    public String message;

    // 业务处理是否成功
    @NameInMap("success")
    public Boolean success;

    public static SaveGwchildinsuranceRecommendationplanadjustResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveGwchildinsuranceRecommendationplanadjustResponse self = new SaveGwchildinsuranceRecommendationplanadjustResponse();
        return TeaModel.build(map, self);
    }

    public SaveGwchildinsuranceRecommendationplanadjustResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SaveGwchildinsuranceRecommendationplanadjustResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SaveGwchildinsuranceRecommendationplanadjustResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SaveGwchildinsuranceRecommendationplanadjustResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SaveGwchildinsuranceRecommendationplanadjustResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SaveGwchildinsuranceRecommendationplanadjustResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
