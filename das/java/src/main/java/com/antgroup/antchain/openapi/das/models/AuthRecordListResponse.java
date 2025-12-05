// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class AuthRecordListResponse extends TeaModel {
    // 授权请求id
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 授权用户did
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("user_did")
    @Validation(required = true)
    public String userDid;

    // 授权用户信息
    /**
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:&quot;zhangsan&quot;,&quot;certNo&quot;:&quot;42xx1234&quot;}</p>
     */
    @NameInMap("user_info")
    @Validation(required = true)
    public String userInfo;

    // 授权内容
    /**
     * <strong>example:</strong>
     * <p>社保</p>
     */
    @NameInMap("auth_content")
    @Validation(required = true)
    public AuthContent authContent;

    // 授权结果
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("auth_result")
    @Validation(required = true)
    public Boolean authResult;

    // 授权请求时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("request_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String requestTime;

    // 协议列表
    @NameInMap("agreement_list")
    @Validation(required = true)
    public java.util.List<Agreement> agreementList;

    public static AuthRecordListResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthRecordListResponse self = new AuthRecordListResponse();
        return TeaModel.build(map, self);
    }

    public AuthRecordListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AuthRecordListResponse setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

    public AuthRecordListResponse setUserInfo(String userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public String getUserInfo() {
        return this.userInfo;
    }

    public AuthRecordListResponse setAuthContent(AuthContent authContent) {
        this.authContent = authContent;
        return this;
    }
    public AuthContent getAuthContent() {
        return this.authContent;
    }

    public AuthRecordListResponse setAuthResult(Boolean authResult) {
        this.authResult = authResult;
        return this;
    }
    public Boolean getAuthResult() {
        return this.authResult;
    }

    public AuthRecordListResponse setRequestTime(String requestTime) {
        this.requestTime = requestTime;
        return this;
    }
    public String getRequestTime() {
        return this.requestTime;
    }

    public AuthRecordListResponse setAgreementList(java.util.List<Agreement> agreementList) {
        this.agreementList = agreementList;
        return this;
    }
    public java.util.List<Agreement> getAgreementList() {
        return this.agreementList;
    }

}
