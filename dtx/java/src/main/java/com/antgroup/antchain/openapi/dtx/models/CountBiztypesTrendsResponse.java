// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class CountBiztypesTrendsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 趋势图
    @NameInMap("data")
    public Trend data;

    // 接口返回码
    @NameInMap("success")
    public Boolean success;

    public static CountBiztypesTrendsResponse build(java.util.Map<String, ?> map) throws Exception {
        CountBiztypesTrendsResponse self = new CountBiztypesTrendsResponse();
        return TeaModel.build(map, self);
    }

    public CountBiztypesTrendsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CountBiztypesTrendsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CountBiztypesTrendsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CountBiztypesTrendsResponse setData(Trend data) {
        this.data = data;
        return this;
    }
    public Trend getData() {
        return this.data;
    }

    public CountBiztypesTrendsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
