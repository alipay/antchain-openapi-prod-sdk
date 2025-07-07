// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ChoiceTappInfo extends TeaModel {
    // 选择的tapp的名字
    /**
     * <strong>example:</strong>
     * <p>erpDataReader-1</p>
     */
    @NameInMap("tapp_name")
    @Validation(required = true)
    public String tappName;

    // 版本号，如果不填就选择最新的版本
    @NameInMap("tapp_version")
    public Long tappVersion;

    // 该tapp将被声明在did doc中的id
    /**
     * <strong>example:</strong>
     * <p>erpDataReader-1</p>
     */
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    public static ChoiceTappInfo build(java.util.Map<String, ?> map) throws Exception {
        ChoiceTappInfo self = new ChoiceTappInfo();
        return TeaModel.build(map, self);
    }

    public ChoiceTappInfo setTappName(String tappName) {
        this.tappName = tappName;
        return this;
    }
    public String getTappName() {
        return this.tappName;
    }

    public ChoiceTappInfo setTappVersion(Long tappVersion) {
        this.tappVersion = tappVersion;
        return this;
    }
    public Long getTappVersion() {
        return this.tappVersion;
    }

    public ChoiceTappInfo setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

}
