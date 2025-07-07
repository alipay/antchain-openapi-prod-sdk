// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class RakeBackInfo extends TeaModel {
    // 推广层级
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("level")
    @Validation(required = true)
    public Long level;

    // 上级推广订单id
    /**
     * <strong>example:</strong>
     * <p>test id</p>
     */
    @NameInMap("parent_id")
    @Validation(required = true)
    public String parentId;

    // 推广人id
    /**
     * <strong>example:</strong>
     * <p>test id</p>
     */
    @NameInMap("promoter_id")
    @Validation(required = true)
    public String promoterId;

    // 返佣额度
    /**
     * <strong>example:</strong>
     * <p>10.5</p>
     */
    @NameInMap("quota")
    @Validation(required = true)
    public String quota;

    // 返佣比例 10表示10%
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("rate")
    @Validation(required = true)
    public String rate;

    public static RakeBackInfo build(java.util.Map<String, ?> map) throws Exception {
        RakeBackInfo self = new RakeBackInfo();
        return TeaModel.build(map, self);
    }

    public RakeBackInfo setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public RakeBackInfo setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public RakeBackInfo setPromoterId(String promoterId) {
        this.promoterId = promoterId;
        return this;
    }
    public String getPromoterId() {
        return this.promoterId;
    }

    public RakeBackInfo setQuota(String quota) {
        this.quota = quota;
        return this;
    }
    public String getQuota() {
        return this.quota;
    }

    public RakeBackInfo setRate(String rate) {
        this.rate = rate;
        return this;
    }
    public String getRate() {
        return this.rate;
    }

}
