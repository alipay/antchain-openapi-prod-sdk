// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DidZKPInfo extends TeaModel {
    // 需要生成证明的路径
    /**
     * <strong>example:</strong>
     * <p>&quot;$./path&quot;</p>
     */
    @NameInMap("path")
    @Validation(required = true)
    public String path;

    // 生成ZKP证明的公共信息
    /**
     * <strong>example:</strong>
     * <p>json array string</p>
     */
    @NameInMap("public_inputs")
    @Validation(required = true)
    public String publicInputs;

    // zkp方法
    /**
     * <strong>example:</strong>
     * <p>more,less,contain</p>
     */
    @NameInMap("zkp_type")
    @Validation(required = true)
    public String zkpType;

    public static DidZKPInfo build(java.util.Map<String, ?> map) throws Exception {
        DidZKPInfo self = new DidZKPInfo();
        return TeaModel.build(map, self);
    }

    public DidZKPInfo setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public DidZKPInfo setPublicInputs(String publicInputs) {
        this.publicInputs = publicInputs;
        return this;
    }
    public String getPublicInputs() {
        return this.publicInputs;
    }

    public DidZKPInfo setZkpType(String zkpType) {
        this.zkpType = zkpType;
        return this;
    }
    public String getZkpType() {
        return this.zkpType;
    }

}
