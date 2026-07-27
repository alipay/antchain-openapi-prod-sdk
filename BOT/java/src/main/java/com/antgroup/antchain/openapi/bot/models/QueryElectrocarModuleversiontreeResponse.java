// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarModuleversiontreeResponse extends TeaModel {
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
    public String success;

    // 响应编码
    @NameInMap("code")
    public String code;

    // 响应内容
    @NameInMap("message")
    public String message;

    // 列表数据
    @NameInMap("data")
    public java.util.List<ModuleVersionTreeNode> data;

    public static QueryElectrocarModuleversiontreeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarModuleversiontreeResponse self = new QueryElectrocarModuleversiontreeResponse();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarModuleversiontreeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryElectrocarModuleversiontreeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryElectrocarModuleversiontreeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryElectrocarModuleversiontreeResponse setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public QueryElectrocarModuleversiontreeResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryElectrocarModuleversiontreeResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryElectrocarModuleversiontreeResponse setData(java.util.List<ModuleVersionTreeNode> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ModuleVersionTreeNode> getData() {
        return this.data;
    }

}
