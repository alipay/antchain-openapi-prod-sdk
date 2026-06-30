// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class InitEkytTrustsignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求头
    @NameInMap("head")
    @Validation(required = true)
    public RequestHead head;

    // 签约用户信息
    @NameInMap("sign_user")
    @Validation(required = true)
    public String signUser;

    // 控件key-value
    @NameInMap("rect_id")
    public String rectId;

    // 签约方案码
    @NameInMap("solution_code")
    @Validation(required = true)
    public String solutionCode;

    // 发起签约的外部流水号
    @NameInMap("out_order_no")
    @Validation(required = true)
    public String outOrderNo;

    // 小程序appId
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 用户授权标识
    @NameInMap("user_authorization")
    @Validation(required = true)
    public String userAuthorization;

    // 扩展信息
    @NameInMap("ext_info")
    public String extInfo;

    public static InitEkytTrustsignRequest build(java.util.Map<String, ?> map) throws Exception {
        InitEkytTrustsignRequest self = new InitEkytTrustsignRequest();
        return TeaModel.build(map, self);
    }

    public InitEkytTrustsignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public InitEkytTrustsignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public InitEkytTrustsignRequest setHead(RequestHead head) {
        this.head = head;
        return this;
    }
    public RequestHead getHead() {
        return this.head;
    }

    public InitEkytTrustsignRequest setSignUser(String signUser) {
        this.signUser = signUser;
        return this;
    }
    public String getSignUser() {
        return this.signUser;
    }

    public InitEkytTrustsignRequest setRectId(String rectId) {
        this.rectId = rectId;
        return this;
    }
    public String getRectId() {
        return this.rectId;
    }

    public InitEkytTrustsignRequest setSolutionCode(String solutionCode) {
        this.solutionCode = solutionCode;
        return this;
    }
    public String getSolutionCode() {
        return this.solutionCode;
    }

    public InitEkytTrustsignRequest setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
        return this;
    }
    public String getOutOrderNo() {
        return this.outOrderNo;
    }

    public InitEkytTrustsignRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public InitEkytTrustsignRequest setUserAuthorization(String userAuthorization) {
        this.userAuthorization = userAuthorization;
        return this;
    }
    public String getUserAuthorization() {
        return this.userAuthorization;
    }

    public InitEkytTrustsignRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
