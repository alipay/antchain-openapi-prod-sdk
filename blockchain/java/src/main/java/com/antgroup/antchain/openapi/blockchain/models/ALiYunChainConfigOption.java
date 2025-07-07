// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunChainConfigOption extends TeaModel {
    // config_option
    /**
     * <strong>example:</strong>
     * <p>config_option</p>
     */
    @NameInMap("config_option")
    public String configOption;

    // show_name
    /**
     * <strong>example:</strong>
     * <p>show_name</p>
     */
    @NameInMap("show_name")
    public String showName;

    // enable
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    public static ALiYunChainConfigOption build(java.util.Map<String, ?> map) throws Exception {
        ALiYunChainConfigOption self = new ALiYunChainConfigOption();
        return TeaModel.build(map, self);
    }

    public ALiYunChainConfigOption setConfigOption(String configOption) {
        this.configOption = configOption;
        return this;
    }
    public String getConfigOption() {
        return this.configOption;
    }

    public ALiYunChainConfigOption setShowName(String showName) {
        this.showName = showName;
        return this;
    }
    public String getShowName() {
        return this.showName;
    }

    public ALiYunChainConfigOption setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

}
