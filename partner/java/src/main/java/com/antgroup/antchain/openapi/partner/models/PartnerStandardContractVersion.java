// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class PartnerStandardContractVersion extends TeaModel {
    // 协议名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 协议可预览地址
    @NameInMap("preview_url")
    @Validation(required = true)
    public String previewUrl;

    // 协议版本
    @NameInMap("version")
    @Validation(required = true)
    public String version;

    public static PartnerStandardContractVersion build(java.util.Map<String, ?> map) throws Exception {
        PartnerStandardContractVersion self = new PartnerStandardContractVersion();
        return TeaModel.build(map, self);
    }

    public PartnerStandardContractVersion setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PartnerStandardContractVersion setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
        return this;
    }
    public String getPreviewUrl() {
        return this.previewUrl;
    }

    public PartnerStandardContractVersion setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
