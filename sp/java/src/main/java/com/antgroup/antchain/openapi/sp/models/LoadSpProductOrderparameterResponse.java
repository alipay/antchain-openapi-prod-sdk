// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sp.models;

import com.aliyun.tea.*;

public class LoadSpProductOrderparameterResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 首页页面产品自定义展示内容加载结果
    @NameInMap("discrete_values")
    public java.util.List<DiscreteValue> discreteValues;

    public static LoadSpProductOrderparameterResponse build(java.util.Map<String, ?> map) throws Exception {
        LoadSpProductOrderparameterResponse self = new LoadSpProductOrderparameterResponse();
        return TeaModel.build(map, self);
    }

    public LoadSpProductOrderparameterResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public LoadSpProductOrderparameterResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public LoadSpProductOrderparameterResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public LoadSpProductOrderparameterResponse setDiscreteValues(java.util.List<DiscreteValue> discreteValues) {
        this.discreteValues = discreteValues;
        return this;
    }
    public java.util.List<DiscreteValue> getDiscreteValues() {
        return this.discreteValues;
    }

}
