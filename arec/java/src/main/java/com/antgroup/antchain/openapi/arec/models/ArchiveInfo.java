// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class ArchiveInfo extends TeaModel {
    // 附件存储OSS路径
    @NameInMap("oss_key")
    public String ossKey;

    // 附件材料类型，比如：AT_SUOYOUQUANZHENG=房屋所有权证
    @NameInMap("type")
    public String type;

    // 附件内容摘要
    @NameInMap("hash")
    public String hash;

    public static ArchiveInfo build(java.util.Map<String, ?> map) throws Exception {
        ArchiveInfo self = new ArchiveInfo();
        return TeaModel.build(map, self);
    }

    public ArchiveInfo setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

    public ArchiveInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ArchiveInfo setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

}
