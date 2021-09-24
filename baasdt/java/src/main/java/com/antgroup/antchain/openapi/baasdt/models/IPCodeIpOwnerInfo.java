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

    // ip描述
    @NameInMap("ip_description")
    public String ipDescription;

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

    public IPCodeIpOwnerInfo setIpDescription(String ipDescription) {
        this.ipDescription = ipDescription;
        return this;
    }
    public String getIpDescription() {
        return this.ipDescription;
    }

}
