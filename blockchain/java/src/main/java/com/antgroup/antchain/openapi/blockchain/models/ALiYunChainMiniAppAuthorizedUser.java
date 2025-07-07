// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunChainMiniAppAuthorizedUser extends TeaModel {
    // phone
    /**
     * <strong>example:</strong>
     * <p>phone</p>
     */
    @NameInMap("phone")
    public String phone;

    // gmt_authorized
    /**
     * <strong>example:</strong>
     * <p>gmt_authorized</p>
     */
    @NameInMap("gmt_authorized")
    public String gmtAuthorized;

    // 记录id
    /**
     * <strong>example:</strong>
     * <p>112</p>
     */
    @NameInMap("user_id")
    public Long userId;

    public static ALiYunChainMiniAppAuthorizedUser build(java.util.Map<String, ?> map) throws Exception {
        ALiYunChainMiniAppAuthorizedUser self = new ALiYunChainMiniAppAuthorizedUser();
        return TeaModel.build(map, self);
    }

    public ALiYunChainMiniAppAuthorizedUser setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public ALiYunChainMiniAppAuthorizedUser setGmtAuthorized(String gmtAuthorized) {
        this.gmtAuthorized = gmtAuthorized;
        return this;
    }
    public String getGmtAuthorized() {
        return this.gmtAuthorized;
    }

    public ALiYunChainMiniAppAuthorizedUser setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
