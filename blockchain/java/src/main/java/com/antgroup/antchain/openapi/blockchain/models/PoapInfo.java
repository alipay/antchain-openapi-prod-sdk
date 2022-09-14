// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class PoapInfo extends TeaModel {
    // 徽章ID，具有唯一性
    @NameInMap("poap_id")
    @Validation(required = true)
    public String poapId;

    // 徽章名字
    @NameInMap("poap_name")
    @Validation(required = true)
    public String poapName;

    // 徽章HASH
    @NameInMap("uni_hash")
    @Validation(required = true)
    public String uniHash;

    // 状态，枚举值
    @NameInMap("status")
    public String status;

    // 徽章资源 URL
    @NameInMap("poap_url")
    @Validation(required = true)
    public String poapUrl;

    // 枚举值，2D_IMAGE--2D图片渲染；3D_OASISENGINE--3D模型渲染
    @NameInMap("render_type")
    @Validation(required = true)
    public String renderType;

    // 3D模型降级使用的资源URL
    @NameInMap("fault_tolerance_url")
    public String faultToleranceUrl;

    public static PoapInfo build(java.util.Map<String, ?> map) throws Exception {
        PoapInfo self = new PoapInfo();
        return TeaModel.build(map, self);
    }

    public PoapInfo setPoapId(String poapId) {
        this.poapId = poapId;
        return this;
    }
    public String getPoapId() {
        return this.poapId;
    }

    public PoapInfo setPoapName(String poapName) {
        this.poapName = poapName;
        return this;
    }
    public String getPoapName() {
        return this.poapName;
    }

    public PoapInfo setUniHash(String uniHash) {
        this.uniHash = uniHash;
        return this;
    }
    public String getUniHash() {
        return this.uniHash;
    }

    public PoapInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PoapInfo setPoapUrl(String poapUrl) {
        this.poapUrl = poapUrl;
        return this;
    }
    public String getPoapUrl() {
        return this.poapUrl;
    }

    public PoapInfo setRenderType(String renderType) {
        this.renderType = renderType;
        return this;
    }
    public String getRenderType() {
        return this.renderType;
    }

    public PoapInfo setFaultToleranceUrl(String faultToleranceUrl) {
        this.faultToleranceUrl = faultToleranceUrl;
        return this;
    }
    public String getFaultToleranceUrl() {
        return this.faultToleranceUrl;
    }

}
