// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class PartnerSignFile extends TeaModel {
    // 文件类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 文件名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 可预览地址
    @NameInMap("oss_url")
    @Validation(required = true)
    public String ossUrl;

    public static PartnerSignFile build(java.util.Map<String, ?> map) throws Exception {
        PartnerSignFile self = new PartnerSignFile();
        return TeaModel.build(map, self);
    }

    public PartnerSignFile setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public PartnerSignFile setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PartnerSignFile setOssUrl(String ossUrl) {
        this.ossUrl = ossUrl;
        return this;
    }
    public String getOssUrl() {
        return this.ossUrl;
    }

}
