// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class PlatJumpUrl extends TeaModel {
    // 确认跳转URL，确认后回跳平台地址
    /**
     * <strong>example:</strong>
     * <p><a href="http://platform.com/confirm/ca">http://platform.com/confirm/ca</a></p>
     */
    @NameInMap("confirm_url")
    @Validation(required = true)
    public String confirmUrl;

    // 取消跳转URL，取消后回跳平台地址，失效也是这个链接
    /**
     * <strong>example:</strong>
     * <p><a href="http://platform.com/confirm/ca">http://platform.com/confirm/ca</a></p>
     */
    @NameInMap("cancel_url")
    @Validation(required = true)
    public String cancelUrl;

    public static PlatJumpUrl build(java.util.Map<String, ?> map) throws Exception {
        PlatJumpUrl self = new PlatJumpUrl();
        return TeaModel.build(map, self);
    }

    public PlatJumpUrl setConfirmUrl(String confirmUrl) {
        this.confirmUrl = confirmUrl;
        return this;
    }
    public String getConfirmUrl() {
        return this.confirmUrl;
    }

    public PlatJumpUrl setCancelUrl(String cancelUrl) {
        this.cancelUrl = cancelUrl;
        return this;
    }
    public String getCancelUrl() {
        return this.cancelUrl;
    }

}
