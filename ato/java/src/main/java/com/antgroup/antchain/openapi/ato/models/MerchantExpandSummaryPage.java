// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class MerchantExpandSummaryPage extends TeaModel {
    // 进件id
    /**
     * <strong>example:</strong>
     * <p>1231234343423423</p>
     */
    @NameInMap("pay_expand_id")
    @Validation(required = true)
    public String payExpandId;

    // 支付渠道
    // JDPAY
    // ALIPAY
    /**
     * <strong>example:</strong>
     * <p>JDPAY</p>
     */
    @NameInMap("pay_channel")
    @Validation(required = true)
    public String payChannel;

    // 进件审核状态
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>2025-12-22 10:00:00</p>
     */
    @NameInMap("create_time")
    @Validation(required = true)
    public String createTime;

    // 最后修改时间
    /**
     * <strong>example:</strong>
     * <p>2025-12-25 10:00:00</p>
     */
    @NameInMap("update_time")
    @Validation(required = true)
    public String updateTime;

    public static MerchantExpandSummaryPage build(java.util.Map<String, ?> map) throws Exception {
        MerchantExpandSummaryPage self = new MerchantExpandSummaryPage();
        return TeaModel.build(map, self);
    }

    public MerchantExpandSummaryPage setPayExpandId(String payExpandId) {
        this.payExpandId = payExpandId;
        return this;
    }
    public String getPayExpandId() {
        return this.payExpandId;
    }

    public MerchantExpandSummaryPage setPayChannel(String payChannel) {
        this.payChannel = payChannel;
        return this;
    }
    public String getPayChannel() {
        return this.payChannel;
    }

    public MerchantExpandSummaryPage setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public MerchantExpandSummaryPage setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public MerchantExpandSummaryPage setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
