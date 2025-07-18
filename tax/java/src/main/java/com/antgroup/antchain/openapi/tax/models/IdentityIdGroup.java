// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class IdentityIdGroup extends TeaModel {
    // 数据源
    /**
     * <strong>example:</strong>
     * <p>SHANDONG</p>
     */
    @NameInMap("channel")
    @Validation(required = true)
    public String channel;

    // 上传的文件
    /**
     * <strong>example:</strong>
     * <p>jklsdjfl</p>
     */
    @NameInMap("file_url")
    @Validation(required = true)
    public String fileUrl;

    public static IdentityIdGroup build(java.util.Map<String, ?> map) throws Exception {
        IdentityIdGroup self = new IdentityIdGroup();
        return TeaModel.build(map, self);
    }

    public IdentityIdGroup setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public IdentityIdGroup setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

}
