// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class GeneralResourcePatch extends TeaModel {
    // 差量包文件下载地址
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    // 差量包的旧版本号
    @NameInMap("old_version")
    @Validation(required = true)
    public Long oldVersion;

    // md5摘要值
    @NameInMap("md5")
    @Validation(required = true)
    public String md5;

    // 差量包文件大小
    @NameInMap("size")
    @Validation(required = true)
    public Long size;

    public static GeneralResourcePatch build(java.util.Map<String, ?> map) throws Exception {
        GeneralResourcePatch self = new GeneralResourcePatch();
        return TeaModel.build(map, self);
    }

    public GeneralResourcePatch setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public GeneralResourcePatch setOldVersion(Long oldVersion) {
        this.oldVersion = oldVersion;
        return this;
    }
    public Long getOldVersion() {
        return this.oldVersion;
    }

    public GeneralResourcePatch setMd5(String md5) {
        this.md5 = md5;
        return this;
    }
    public String getMd5() {
        return this.md5;
    }

    public GeneralResourcePatch setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
