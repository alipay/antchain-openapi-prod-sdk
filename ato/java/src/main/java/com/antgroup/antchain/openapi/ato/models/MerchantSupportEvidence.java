// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class MerchantSupportEvidence extends TeaModel {
    // 商家操作(拒绝)时间
    /**
     * <strong>example:</strong>
     * <p>2025-01-01 12:00:00</p>
     */
    @NameInMap("merchant_operate_time")
    public String merchantOperateTime;

    // 商家拒绝原因
    /**
     * <strong>example:</strong>
     * <p>理由</p>
     */
    @NameInMap("merchant_refuse_reason")
    public String merchantRefuseReason;

    // 商家拒绝举证材料
    /**
     * <strong>example:</strong>
     * <p>[&quot;fileKey&quot;]</p>
     */
    @NameInMap("merchant_refuse_evidences")
    public java.util.List<String> merchantRefuseEvidences;

    public static MerchantSupportEvidence build(java.util.Map<String, ?> map) throws Exception {
        MerchantSupportEvidence self = new MerchantSupportEvidence();
        return TeaModel.build(map, self);
    }

    public MerchantSupportEvidence setMerchantOperateTime(String merchantOperateTime) {
        this.merchantOperateTime = merchantOperateTime;
        return this;
    }
    public String getMerchantOperateTime() {
        return this.merchantOperateTime;
    }

    public MerchantSupportEvidence setMerchantRefuseReason(String merchantRefuseReason) {
        this.merchantRefuseReason = merchantRefuseReason;
        return this;
    }
    public String getMerchantRefuseReason() {
        return this.merchantRefuseReason;
    }

    public MerchantSupportEvidence setMerchantRefuseEvidences(java.util.List<String> merchantRefuseEvidences) {
        this.merchantRefuseEvidences = merchantRefuseEvidences;
        return this;
    }
    public java.util.List<String> getMerchantRefuseEvidences() {
        return this.merchantRefuseEvidences;
    }

}
