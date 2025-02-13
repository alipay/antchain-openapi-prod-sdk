// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QuerySimLoginResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 登录结果
    // NO_RESULT：暂无登录结果
    // EXPIRED：token过期
    // ACTIVATE_OK：激活成功，店长首次登录成功
    // LOGIN_OK：登录成功
    // USER_NOT_EXIST：用户不存在
    // STORE_NOT_ACTIVATED：门店未激活
    @NameInMap("login_result")
    public String loginResult;

    // 登录结果中文信息
    @NameInMap("login_msg")
    public String loginMsg;

    // 是否已经激活
    @NameInMap("activated")
    public Boolean activated;

    // 登录/激活时间，格式yyyy-MM-dd HH:mm:ss
    @NameInMap("login_time")
    public String loginTime;

    // 当前登录的门店信息
    @NameInMap("store_info")
    public SimStoreInfo storeInfo;

    // 当前登录的销售信息
    @NameInMap("sales_info")
    public SimSalesInfo salesInfo;

    public static QuerySimLoginResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySimLoginResponse self = new QuerySimLoginResponse();
        return TeaModel.build(map, self);
    }

    public QuerySimLoginResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QuerySimLoginResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QuerySimLoginResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QuerySimLoginResponse setLoginResult(String loginResult) {
        this.loginResult = loginResult;
        return this;
    }
    public String getLoginResult() {
        return this.loginResult;
    }

    public QuerySimLoginResponse setLoginMsg(String loginMsg) {
        this.loginMsg = loginMsg;
        return this;
    }
    public String getLoginMsg() {
        return this.loginMsg;
    }

    public QuerySimLoginResponse setActivated(Boolean activated) {
        this.activated = activated;
        return this;
    }
    public Boolean getActivated() {
        return this.activated;
    }

    public QuerySimLoginResponse setLoginTime(String loginTime) {
        this.loginTime = loginTime;
        return this;
    }
    public String getLoginTime() {
        return this.loginTime;
    }

    public QuerySimLoginResponse setStoreInfo(SimStoreInfo storeInfo) {
        this.storeInfo = storeInfo;
        return this;
    }
    public SimStoreInfo getStoreInfo() {
        return this.storeInfo;
    }

    public QuerySimLoginResponse setSalesInfo(SimSalesInfo salesInfo) {
        this.salesInfo = salesInfo;
        return this;
    }
    public SimSalesInfo getSalesInfo() {
        return this.salesInfo;
    }

}
