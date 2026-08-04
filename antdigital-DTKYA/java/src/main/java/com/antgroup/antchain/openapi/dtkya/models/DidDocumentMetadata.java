// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class DidDocumentMetadata extends TeaModel {
    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>2026-07-31T02:35:00Z</p>
     */
    @NameInMap("created")
    @Validation(required = true)
    public String created;

    // 更新时间
    /**
     * <strong>example:</strong>
     * <p>2026-07-31T02:35:00Z</p>
     */
    @NameInMap("updated")
    @Validation(required = true)
    public String updated;

    // 版本号
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("version_id")
    @Validation(required = true)
    public String versionId;

    // false代表正常可用，true代表不可用
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("deactivated")
    @Validation(required = true)
    public Boolean deactivated;

    public static DidDocumentMetadata build(java.util.Map<String, ?> map) throws Exception {
        DidDocumentMetadata self = new DidDocumentMetadata();
        return TeaModel.build(map, self);
    }

    public DidDocumentMetadata setCreated(String created) {
        this.created = created;
        return this;
    }
    public String getCreated() {
        return this.created;
    }

    public DidDocumentMetadata setUpdated(String updated) {
        this.updated = updated;
        return this;
    }
    public String getUpdated() {
        return this.updated;
    }

    public DidDocumentMetadata setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public DidDocumentMetadata setDeactivated(Boolean deactivated) {
        this.deactivated = deactivated;
        return this;
    }
    public Boolean getDeactivated() {
        return this.deactivated;
    }

}
