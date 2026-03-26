// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class QueryNewcarQczjResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 0代表成功，其余代表失败
    @NameInMap("returncode")
    public String returncode;

    // 失败时错误消息
    @NameInMap("message")
    public String message;

    // 城市结果结构体
    @NameInMap("city_result")
    public java.util.List<CityResult> cityResult;

    // 车型结果结构体
    @NameInMap("spec_result")
    public java.util.List<SpecList> specResult;

    public static QueryNewcarQczjResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryNewcarQczjResponse self = new QueryNewcarQczjResponse();
        return TeaModel.build(map, self);
    }

    public QueryNewcarQczjResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryNewcarQczjResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryNewcarQczjResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryNewcarQczjResponse setReturncode(String returncode) {
        this.returncode = returncode;
        return this;
    }
    public String getReturncode() {
        return this.returncode;
    }

    public QueryNewcarQczjResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryNewcarQczjResponse setCityResult(java.util.List<CityResult> cityResult) {
        this.cityResult = cityResult;
        return this;
    }
    public java.util.List<CityResult> getCityResult() {
        return this.cityResult;
    }

    public QueryNewcarQczjResponse setSpecResult(java.util.List<SpecList> specResult) {
        this.specResult = specResult;
        return this;
    }
    public java.util.List<SpecList> getSpecResult() {
        return this.specResult;
    }

}
