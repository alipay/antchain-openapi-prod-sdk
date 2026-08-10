// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class ExecEsgVerifytokenResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前操作员全部去重后的角色编码
    @NameInMap("role_nos")
    public java.util.List<String> roleNos;

    // 当前碳矩阵操作员 ID。
    @NameInMap("user_id")
    public String userId;

    // 当前碳矩阵登录账号名称。
    @NameInMap("user_name")
    public String userName;

    // 操作员昵称
    @NameInMap("nick_name")
    public String nickName;

    // 操作员真实姓名
    @NameInMap("real_name")
    public String realName;

    // 操作员手机号
    @NameInMap("phone_number")
    public String phoneNumber;

    // 企业编码
    @NameInMap("enterprise_no")
    public String enterpriseNo;

    public static ExecEsgVerifytokenResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecEsgVerifytokenResponse self = new ExecEsgVerifytokenResponse();
        return TeaModel.build(map, self);
    }

    public ExecEsgVerifytokenResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecEsgVerifytokenResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecEsgVerifytokenResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecEsgVerifytokenResponse setRoleNos(java.util.List<String> roleNos) {
        this.roleNos = roleNos;
        return this;
    }
    public java.util.List<String> getRoleNos() {
        return this.roleNos;
    }

    public ExecEsgVerifytokenResponse setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ExecEsgVerifytokenResponse setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public ExecEsgVerifytokenResponse setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public ExecEsgVerifytokenResponse setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public ExecEsgVerifytokenResponse setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public ExecEsgVerifytokenResponse setEnterpriseNo(String enterpriseNo) {
        this.enterpriseNo = enterpriseNo;
        return this;
    }
    public String getEnterpriseNo() {
        return this.enterpriseNo;
    }

}
