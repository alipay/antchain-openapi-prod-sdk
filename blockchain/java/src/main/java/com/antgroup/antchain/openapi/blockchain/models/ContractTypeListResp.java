// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ContractTypeListResp extends TeaModel {
    // 名称
    /**
     * <strong>example:</strong>
     * <p>存证合约</p>
     */
    @NameInMap("name")
    public String name;

    // 值
    /**
     * <strong>example:</strong>
     * <p>DEPOSITE</p>
     */
    @NameInMap("value")
    public String value;

    public static ContractTypeListResp build(java.util.Map<String, ?> map) throws Exception {
        ContractTypeListResp self = new ContractTypeListResp();
        return TeaModel.build(map, self);
    }

    public ContractTypeListResp setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ContractTypeListResp setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
