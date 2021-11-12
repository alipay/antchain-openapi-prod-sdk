// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IPCodeIpGoodInfo extends TeaModel {
    // IP名称
    @NameInMap("ip_name")
    @Validation(required = true)
    public String ipName;

    // IP描述
    @NameInMap("ip_description")
    @Validation(required = true)
    public String ipDescription;

    // IP主图oss地址
    @NameInMap("ip_img_url")
    @Validation(required = true)
    public String ipImgUrl;

    // IP主图，非oss地址，可直接访问的图片地址
    @NameInMap("ip_img_url_tmp")
    public String ipImgUrlTmp;

    public static IPCodeIpGoodInfo build(java.util.Map<String, ?> map) throws Exception {
        IPCodeIpGoodInfo self = new IPCodeIpGoodInfo();
        return TeaModel.build(map, self);
    }

    public IPCodeIpGoodInfo setIpName(String ipName) {
        this.ipName = ipName;
        return this;
    }
    public String getIpName() {
        return this.ipName;
    }

    public IPCodeIpGoodInfo setIpDescription(String ipDescription) {
        this.ipDescription = ipDescription;
        return this;
    }
    public String getIpDescription() {
        return this.ipDescription;
    }

    public IPCodeIpGoodInfo setIpImgUrl(String ipImgUrl) {
        this.ipImgUrl = ipImgUrl;
        return this;
    }
    public String getIpImgUrl() {
        return this.ipImgUrl;
    }

    public IPCodeIpGoodInfo setIpImgUrlTmp(String ipImgUrlTmp) {
        this.ipImgUrlTmp = ipImgUrlTmp;
        return this;
    }
    public String getIpImgUrlTmp() {
        return this.ipImgUrlTmp;
    }

}
