// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IPCodeIpOwnerInfo extends TeaModel {
    // 版权所有者名称
    @NameInMap("ip_owner_name")
    public String ipOwnerName;

    // 版权方头像oss地址
    @NameInMap("ip_owner_image")
    public String ipOwnerImage;

    // 版权方头像，临时访问地址，可直接访问
    @NameInMap("ip_owner_image_tmp")
    public String ipOwnerImageTmp;

    // ip描述
    @NameInMap("ip_description")
    public String ipDescription;

    // 默认为空或者0是版权信息；1是著作信息；2是创作信息；3是联名信息；4是自定义
    @NameInMap("ip_owner_type")
    public Long ipOwnerType;

    // 自定义资质信息类型
    @NameInMap("ip_owner_custom")
    public String ipOwnerCustom;

    public static IPCodeIpOwnerInfo build(java.util.Map<String, ?> map) throws Exception {
        IPCodeIpOwnerInfo self = new IPCodeIpOwnerInfo();
        return TeaModel.build(map, self);
    }

    public IPCodeIpOwnerInfo setIpOwnerName(String ipOwnerName) {
        this.ipOwnerName = ipOwnerName;
        return this;
    }
    public String getIpOwnerName() {
        return this.ipOwnerName;
    }

    public IPCodeIpOwnerInfo setIpOwnerImage(String ipOwnerImage) {
        this.ipOwnerImage = ipOwnerImage;
        return this;
    }
    public String getIpOwnerImage() {
        return this.ipOwnerImage;
    }

    public IPCodeIpOwnerInfo setIpOwnerImageTmp(String ipOwnerImageTmp) {
        this.ipOwnerImageTmp = ipOwnerImageTmp;
        return this;
    }
    public String getIpOwnerImageTmp() {
        return this.ipOwnerImageTmp;
    }

    public IPCodeIpOwnerInfo setIpDescription(String ipDescription) {
        this.ipDescription = ipDescription;
        return this;
    }
    public String getIpDescription() {
        return this.ipDescription;
    }

    public IPCodeIpOwnerInfo setIpOwnerType(Long ipOwnerType) {
        this.ipOwnerType = ipOwnerType;
        return this;
    }
    public Long getIpOwnerType() {
        return this.ipOwnerType;
    }

    public IPCodeIpOwnerInfo setIpOwnerCustom(String ipOwnerCustom) {
        this.ipOwnerCustom = ipOwnerCustom;
        return this;
    }
    public String getIpOwnerCustom() {
        return this.ipOwnerCustom;
    }

}
