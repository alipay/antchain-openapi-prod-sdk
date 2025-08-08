// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class TxDto extends TeaModel {
    // 链上凭证
    /**
     * <strong>example:</strong>
     * <p>d4648b331839616b6ad76ed74b5fabf9c188add347da55aef3caccfa471d9f66 </p>
     */
    @NameInMap("tx_code")
    @Validation(required = true)
    public String txCode;

    // 链上存储结构对应类型
    /**
     * <strong>example:</strong>
     * <p>ORDER</p>
     */
    @NameInMap("data_type")
    @Validation(required = true)
    public String dataType;

    public static TxDto build(java.util.Map<String, ?> map) throws Exception {
        TxDto self = new TxDto();
        return TeaModel.build(map, self);
    }

    public TxDto setTxCode(String txCode) {
        this.txCode = txCode;
        return this;
    }
    public String getTxCode() {
        return this.txCode;
    }

    public TxDto setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

}
