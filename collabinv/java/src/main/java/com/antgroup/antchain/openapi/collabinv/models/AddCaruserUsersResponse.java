// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class AddCaruserUsersResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 处理结果
    @NameInMap("process_result")
    public String processResult;

    public static AddCaruserUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCaruserUsersResponse self = new AddCaruserUsersResponse();
        return TeaModel.build(map, self);
    }

    public AddCaruserUsersResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AddCaruserUsersResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddCaruserUsersResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AddCaruserUsersResponse setProcessResult(String processResult) {
        this.processResult = processResult;
        return this;
    }
    public String getProcessResult() {
        return this.processResult;
    }

}
