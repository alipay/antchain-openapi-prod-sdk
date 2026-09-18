// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class MaoQualification extends TeaModel {
    // 资质类型码
    /**
     * <strong>example:</strong>
     * <p>资质类型码</p>
     */
    @NameInMap("key")
    public String key;

    // 资质图片地址
    /**
     * <strong>example:</strong>
     * <p>资质图片地址</p>
     */
    @NameInMap("url")
    public String url;

    public static MaoQualification build(java.util.Map<String, ?> map) throws Exception {
        MaoQualification self = new MaoQualification();
        return TeaModel.build(map, self);
    }

    public MaoQualification setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public MaoQualification setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
