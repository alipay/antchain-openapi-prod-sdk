// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class RelatedEntity extends TeaModel {
    // 所关联实体的类型
    /**
     * <strong>example:</strong>
     * <p>COSTOMER_ENETITY</p>
     */
    @NameInMap("entity_type")
    @Validation(required = true)
    public String entityType;

    // 所关联实体的trustiot唯一ID
    /**
     * <strong>example:</strong>
     * <p>7006071575276187649</p>
     */
    @NameInMap("related_entity_trustiot_id")
    @Validation(required = true)
    public Long relatedEntityTrustiotId;

    public static RelatedEntity build(java.util.Map<String, ?> map) throws Exception {
        RelatedEntity self = new RelatedEntity();
        return TeaModel.build(map, self);
    }

    public RelatedEntity setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public RelatedEntity setRelatedEntityTrustiotId(Long relatedEntityTrustiotId) {
        this.relatedEntityTrustiotId = relatedEntityTrustiotId;
        return this;
    }
    public Long getRelatedEntityTrustiotId() {
        return this.relatedEntityTrustiotId;
    }

}
