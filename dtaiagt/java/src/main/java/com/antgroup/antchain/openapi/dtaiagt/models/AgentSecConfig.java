// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class AgentSecConfig extends TeaModel {
    // 是否打开安全审核
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("enable_sec_check")
    @Validation(required = true)
    public Boolean enableSecCheck;

    // 安全提供方:平台配置 大安全、天鉴等
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("sec_provider")
    @Validation(required = true)
    public String secProvider;

    public static AgentSecConfig build(java.util.Map<String, ?> map) throws Exception {
        AgentSecConfig self = new AgentSecConfig();
        return TeaModel.build(map, self);
    }

    public AgentSecConfig setEnableSecCheck(Boolean enableSecCheck) {
        this.enableSecCheck = enableSecCheck;
        return this;
    }
    public Boolean getEnableSecCheck() {
        return this.enableSecCheck;
    }

    public AgentSecConfig setSecProvider(String secProvider) {
        this.secProvider = secProvider;
        return this;
    }
    public String getSecProvider() {
        return this.secProvider;
    }

}
