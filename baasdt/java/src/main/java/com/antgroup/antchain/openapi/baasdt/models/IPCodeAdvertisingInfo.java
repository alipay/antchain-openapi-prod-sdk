// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IPCodeAdvertisingInfo extends TeaModel {
    // 资源位头图
    @NameInMap("ad_image")
    public String adImage;

    // 资源位链接
    @NameInMap("ad_url")
    public String adUrl;

    // 资源商品名称
    @NameInMap("ad_name")
    public String adName;

    public static IPCodeAdvertisingInfo build(java.util.Map<String, ?> map) throws Exception {
        IPCodeAdvertisingInfo self = new IPCodeAdvertisingInfo();
        return TeaModel.build(map, self);
    }

    public IPCodeAdvertisingInfo setAdImage(String adImage) {
        this.adImage = adImage;
        return this;
    }
    public String getAdImage() {
        return this.adImage;
    }

    public IPCodeAdvertisingInfo setAdUrl(String adUrl) {
        this.adUrl = adUrl;
        return this;
    }
    public String getAdUrl() {
        return this.adUrl;
    }

    public IPCodeAdvertisingInfo setAdName(String adName) {
        this.adName = adName;
        return this;
    }
    public String getAdName() {
        return this.adName;
    }

}
