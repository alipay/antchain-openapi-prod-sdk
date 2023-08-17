// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bc907d13969a4eb68852866122b96ffd.models;

import com.aliyun.tea.*;

public class AddItagAntitagUserTntResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // TntInstId
    @NameInMap("tntinstid")
    public String tntinstid;

    // 角色，枚举值：ADMIN|SUPER_ADMIN|ADMINISTRATOR|LEADER|OPERATOR, 默认OPERATOR",
    @NameInMap("role")
    public String role;

    // 用户信息
    @NameInMap("result")
    public User result;

    public static AddItagAntitagUserTntResponse build(java.util.Map<String, ?> map) throws Exception {
        AddItagAntitagUserTntResponse self = new AddItagAntitagUserTntResponse();
        return TeaModel.build(map, self);
    }

    public AddItagAntitagUserTntResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AddItagAntitagUserTntResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddItagAntitagUserTntResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AddItagAntitagUserTntResponse setTntinstid(String tntinstid) {
        this.tntinstid = tntinstid;
        return this;
    }
    public String getTntinstid() {
        return this.tntinstid;
    }

    public AddItagAntitagUserTntResponse setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public AddItagAntitagUserTntResponse setResult(User result) {
        this.result = result;
        return this;
    }
    public User getResult() {
        return this.result;
    }

}
