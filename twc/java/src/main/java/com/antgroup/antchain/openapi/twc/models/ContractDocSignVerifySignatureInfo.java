// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractDocSignVerifySignatureInfo extends TeaModel {
    // 是否篡改
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("is_modify")
    public Boolean isModify;

    // 签署时间来源
    /**
     * <strong>example:</strong>
     * <p>tsr</p>
     */
    @NameInMap("time_from")
    public String timeFrom;

    // 签署时间
    /**
     * <strong>example:</strong>
     * <p>2020-11-18 20:30:41</p>
     */
    @NameInMap("sign_date")
    public String signDate;

    public static ContractDocSignVerifySignatureInfo build(java.util.Map<String, ?> map) throws Exception {
        ContractDocSignVerifySignatureInfo self = new ContractDocSignVerifySignatureInfo();
        return TeaModel.build(map, self);
    }

    public ContractDocSignVerifySignatureInfo setIsModify(Boolean isModify) {
        this.isModify = isModify;
        return this;
    }
    public Boolean getIsModify() {
        return this.isModify;
    }

    public ContractDocSignVerifySignatureInfo setTimeFrom(String timeFrom) {
        this.timeFrom = timeFrom;
        return this;
    }
    public String getTimeFrom() {
        return this.timeFrom;
    }

    public ContractDocSignVerifySignatureInfo setSignDate(String signDate) {
        this.signDate = signDate;
        return this;
    }
    public String getSignDate() {
        return this.signDate;
    }

}
