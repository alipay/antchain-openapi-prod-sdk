// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryLeaseUserResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订单id
    @NameInMap("order_id")
    public String orderId;

    // 用户登录名，租赁平台会员ID/若支付宝ID必传 长度不可超过50
    @NameInMap("login_id")
    public String loginId;

    // 用户登录名类型 1.商户会员2.支付宝3.其他
    @NameInMap("login_type")
    public String loginType;

    // 用户登录时间 格式为2019-8-31 12:00:00
    @NameInMap("login_time")
    public String loginTime;

    // 承租人姓名，加密返回
    @NameInMap("user_name")
    public String userName;

    // 承租人身份证号，加密返回
    @NameInMap("user_id")
    public String userId;

    // 承租人手机号
    @NameInMap("user_phone_number")
    public String userPhoneNumber;

    // 身份认证类型 1支付宝实人，2芝麻实人，3非蚂蚁实人
    @NameInMap("user_type")
    public String userType;

    // 承租人支付宝账号信息
    @NameInMap("alipay_uid")
    public String alipayUid;

    // 出租企业名称
    @NameInMap("lease_corp_name")
    public String leaseCorpName;

    // 出租企业法人名称
    @NameInMap("lease_corp_owner_name")
    public String leaseCorpOwnerName;

    // 承租企业统一社会信用代码 长度不可超过50
    @NameInMap("lease_corp_id")
    public String leaseCorpId;

    // 错误码
    @NameInMap("code")
    public String code;

    // 错误信息描述
    @NameInMap("message")
    public String message;

    public static QueryLeaseUserResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLeaseUserResponse self = new QueryLeaseUserResponse();
        return TeaModel.build(map, self);
    }

    public QueryLeaseUserResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryLeaseUserResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLeaseUserResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryLeaseUserResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryLeaseUserResponse setLoginId(String loginId) {
        this.loginId = loginId;
        return this;
    }
    public String getLoginId() {
        return this.loginId;
    }

    public QueryLeaseUserResponse setLoginType(String loginType) {
        this.loginType = loginType;
        return this;
    }
    public String getLoginType() {
        return this.loginType;
    }

    public QueryLeaseUserResponse setLoginTime(String loginTime) {
        this.loginTime = loginTime;
        return this;
    }
    public String getLoginTime() {
        return this.loginTime;
    }

    public QueryLeaseUserResponse setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public QueryLeaseUserResponse setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryLeaseUserResponse setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
        return this;
    }
    public String getUserPhoneNumber() {
        return this.userPhoneNumber;
    }

    public QueryLeaseUserResponse setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public QueryLeaseUserResponse setAlipayUid(String alipayUid) {
        this.alipayUid = alipayUid;
        return this;
    }
    public String getAlipayUid() {
        return this.alipayUid;
    }

    public QueryLeaseUserResponse setLeaseCorpName(String leaseCorpName) {
        this.leaseCorpName = leaseCorpName;
        return this;
    }
    public String getLeaseCorpName() {
        return this.leaseCorpName;
    }

    public QueryLeaseUserResponse setLeaseCorpOwnerName(String leaseCorpOwnerName) {
        this.leaseCorpOwnerName = leaseCorpOwnerName;
        return this;
    }
    public String getLeaseCorpOwnerName() {
        return this.leaseCorpOwnerName;
    }

    public QueryLeaseUserResponse setLeaseCorpId(String leaseCorpId) {
        this.leaseCorpId = leaseCorpId;
        return this;
    }
    public String getLeaseCorpId() {
        return this.leaseCorpId;
    }

    public QueryLeaseUserResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryLeaseUserResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
