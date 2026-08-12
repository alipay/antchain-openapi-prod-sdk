// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryEsgOperatordetailResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 操作员 ID。
    @NameInMap("user_id")
    public String userId;

    // 登录账号
    @NameInMap("user_name")
    public String userName;

    // 企业编码
    @NameInMap("enterprise_no")
    public String enterpriseNo;

    // 昵称
    @NameInMap("nick_name")
    public String nickName;

    // 真实姓名
    @NameInMap("real_name")
    public String realName;

    // 手机号
    @NameInMap("phone_number")
    public String phoneNumber;

    // 角色列表
    @NameInMap("role_list")
    public java.util.List<RoleDetailList> roleList;

    public static QueryEsgOperatordetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEsgOperatordetailResponse self = new QueryEsgOperatordetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryEsgOperatordetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEsgOperatordetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEsgOperatordetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEsgOperatordetailResponse setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryEsgOperatordetailResponse setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public QueryEsgOperatordetailResponse setEnterpriseNo(String enterpriseNo) {
        this.enterpriseNo = enterpriseNo;
        return this;
    }
    public String getEnterpriseNo() {
        return this.enterpriseNo;
    }

    public QueryEsgOperatordetailResponse setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public QueryEsgOperatordetailResponse setRealName(String realName) {
        this.realName = realName;
        return this;
    }
    public String getRealName() {
        return this.realName;
    }

    public QueryEsgOperatordetailResponse setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public QueryEsgOperatordetailResponse setRoleList(java.util.List<RoleDetailList> roleList) {
        this.roleList = roleList;
        return this;
    }
    public java.util.List<RoleDetailList> getRoleList() {
        return this.roleList;
    }

}
