// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class OperateIotbasicUserResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 操作结果
    @NameInMap("success")
    public Boolean success;

    // 操作失败集合
    @NameInMap("fail_list")
    public java.util.List<IotBasicUserRequest> failList;

    // 用户信息
    @NameInMap("query_list")
    public java.util.List<IotBasicUserInfo> queryList;

    public static OperateIotbasicUserResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateIotbasicUserResponse self = new OperateIotbasicUserResponse();
        return TeaModel.build(map, self);
    }

    public OperateIotbasicUserResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public OperateIotbasicUserResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public OperateIotbasicUserResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public OperateIotbasicUserResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public OperateIotbasicUserResponse setFailList(java.util.List<IotBasicUserRequest> failList) {
        this.failList = failList;
        return this;
    }
    public java.util.List<IotBasicUserRequest> getFailList() {
        return this.failList;
    }

    public OperateIotbasicUserResponse setQueryList(java.util.List<IotBasicUserInfo> queryList) {
        this.queryList = queryList;
        return this;
    }
    public java.util.List<IotBasicUserInfo> getQueryList() {
        return this.queryList;
    }

}
