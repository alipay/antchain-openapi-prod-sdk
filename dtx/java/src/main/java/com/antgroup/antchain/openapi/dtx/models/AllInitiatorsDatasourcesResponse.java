// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class AllInitiatorsDatasourcesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数据源名列表
    @NameInMap("data")
    public java.util.List<DsNameInfo> data;

    // 接口返回码
    @NameInMap("success")
    public Boolean success;

    public static AllInitiatorsDatasourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        AllInitiatorsDatasourcesResponse self = new AllInitiatorsDatasourcesResponse();
        return TeaModel.build(map, self);
    }

    public AllInitiatorsDatasourcesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AllInitiatorsDatasourcesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AllInitiatorsDatasourcesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AllInitiatorsDatasourcesResponse setData(java.util.List<DsNameInfo> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DsNameInfo> getData() {
        return this.data;
    }

    public AllInitiatorsDatasourcesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
