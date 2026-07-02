// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class OrderWithholdContractInfo extends TeaModel {
    // 支付宝外部代扣协议号
    /**
     * <strong>example:</strong>
     * <p>ATO_P007_0_0_11</p>
     */
    @NameInMap("withholding_contract_id")
    public String withholdingContractId;

    // 用户代扣协议状态
    /**
     * <strong>example:</strong>
     * <p>TERMINATION</p>
     */
    @NameInMap("contract_status")
    public String contractStatus;

    public static OrderWithholdContractInfo build(java.util.Map<String, ?> map) throws Exception {
        OrderWithholdContractInfo self = new OrderWithholdContractInfo();
        return TeaModel.build(map, self);
    }

    public OrderWithholdContractInfo setWithholdingContractId(String withholdingContractId) {
        this.withholdingContractId = withholdingContractId;
        return this;
    }
    public String getWithholdingContractId() {
        return this.withholdingContractId;
    }

    public OrderWithholdContractInfo setContractStatus(String contractStatus) {
        this.contractStatus = contractStatus;
        return this;
    }
    public String getContractStatus() {
        return this.contractStatus;
    }

}
