// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class Sidecar extends TeaModel {
    // sidecar描述内容
    @NameInMap("description")
    public String description;

    // 创建时间
    @NameInMap("gmt_created")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String gmtCreated;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")
    public String gmtModified;

    // sidecar名称
    @NameInMap("sidecar_name")
    @Validation(required = true)
    public String sidecarName;

    // scope生效范围详情
    @NameInMap("scope_detail")
    @Validation(required = true)
    public SidecarScopeDetail scopeDetail;

    public static Sidecar build(java.util.Map<String, ?> map) throws Exception {
        Sidecar self = new Sidecar();
        return TeaModel.build(map, self);
    }

    public Sidecar setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Sidecar setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public Sidecar setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public Sidecar setSidecarName(String sidecarName) {
        this.sidecarName = sidecarName;
        return this;
    }
    public String getSidecarName() {
        return this.sidecarName;
    }

    public Sidecar setScopeDetail(SidecarScopeDetail scopeDetail) {
        this.scopeDetail = scopeDetail;
        return this;
    }
    public SidecarScopeDetail getScopeDetail() {
        return this.scopeDetail;
    }

}
