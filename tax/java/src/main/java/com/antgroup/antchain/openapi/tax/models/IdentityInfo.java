// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class IdentityInfo extends TeaModel {
    // 需要打标的税号
    /**
     * <strong>example:</strong>
     * <p>税号</p>
     */
    @NameInMap("identity_id")
    @Validation(required = true)
    public String identityId;

    // 授权编号
    /**
     * <strong>example:</strong>
     * <p>授权编号</p>
     */
    @NameInMap("auth_code")
    @Validation(required = true)
    public String authCode;

    // 授权开始时间
    /**
     * <strong>example:</strong>
     * <p>YYYY-MM-DD HH:MM:SS</p>
     */
    @NameInMap("auth_start_time")
    public String authStartTime;

    // 授权截止时间
    /**
     * <strong>example:</strong>
     * <p>YYYY-MM-DD HH:MM:SS</p>
     */
    @NameInMap("auth_end_time")
    public String authEndTime;

    // 授权书url
    /**
     * <strong>example:</strong>
     * <p><a href="https://mass.alipay.com/credit_zmepconnector/afts/file/A*mNBcT6AvV5YAAAAAAAAAAAAADTp5AA?t=xIcb2AUdCcOajPNowepVTTooDnSqmrPtbbAnl4fgurADAAAAZAAAeTplRGus">https://mass.alipay.com/credit_zmepconnector/afts/file/A*mNBcT6AvV5YAAAAAAAAAAAAADTp5AA?t=xIcb2AUdCcOajPNowepVTTooDnSqmrPtbbAnl4fgurADAAAAZAAAeTplRGus</a></p>
     */
    @NameInMap("auth_url")
    public String authUrl;

    public static IdentityInfo build(java.util.Map<String, ?> map) throws Exception {
        IdentityInfo self = new IdentityInfo();
        return TeaModel.build(map, self);
    }

    public IdentityInfo setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public IdentityInfo setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public IdentityInfo setAuthStartTime(String authStartTime) {
        this.authStartTime = authStartTime;
        return this;
    }
    public String getAuthStartTime() {
        return this.authStartTime;
    }

    public IdentityInfo setAuthEndTime(String authEndTime) {
        this.authEndTime = authEndTime;
        return this;
    }
    public String getAuthEndTime() {
        return this.authEndTime;
    }

    public IdentityInfo setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
        return this;
    }
    public String getAuthUrl() {
        return this.authUrl;
    }

}
