// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarDeviceotamoduleversionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否请求成功
    @NameInMap("success")
    public Boolean success;

    // 响应编码
    @NameInMap("code")
    public String code;

    // 响应内容
    @NameInMap("message")
    public String message;

    // 按模块名称排序的模块版本列表
    @NameInMap("items")
    public java.util.List<OtaModuleVersionItemResponse> items;

    public static QueryElectrocarDeviceotamoduleversionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarDeviceotamoduleversionResponse self = new QueryElectrocarDeviceotamoduleversionResponse();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarDeviceotamoduleversionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryElectrocarDeviceotamoduleversionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryElectrocarDeviceotamoduleversionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryElectrocarDeviceotamoduleversionResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryElectrocarDeviceotamoduleversionResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryElectrocarDeviceotamoduleversionResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryElectrocarDeviceotamoduleversionResponse setItems(java.util.List<OtaModuleVersionItemResponse> items) {
        this.items = items;
        return this;
    }
    public java.util.List<OtaModuleVersionItemResponse> getItems() {
        return this.items;
    }

}
