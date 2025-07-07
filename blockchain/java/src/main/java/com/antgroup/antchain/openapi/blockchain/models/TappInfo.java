// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class TappInfo extends TeaModel {
    // C3S可信计算TAPP应用标识
    /**
     * <strong>example:</strong>
     * <p>fafafafaf</p>
     */
    @NameInMap("taap_id")
    @Validation(required = true)
    public String taapId;

    // C3S可信计算TAPP版本
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("tapp_version")
    @Validation(required = true)
    public Long tappVersion;

    public static TappInfo build(java.util.Map<String, ?> map) throws Exception {
        TappInfo self = new TappInfo();
        return TeaModel.build(map, self);
    }

    public TappInfo setTaapId(String taapId) {
        this.taapId = taapId;
        return this;
    }
    public String getTaapId() {
        return this.taapId;
    }

    public TappInfo setTappVersion(Long tappVersion) {
        this.tappVersion = tappVersion;
        return this;
    }
    public Long getTappVersion() {
        return this.tappVersion;
    }

}
