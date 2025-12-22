// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class BclFileInfo extends TeaModel {
    // 文件名称 包含后缀
    /**
     * <strong>example:</strong>
     * <p>asasd物流.jpg</p>
     */
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 文件下载链接
    /**
     * <strong>example:</strong>
     * <p><a href="https://oss.com/asdqwe">https://oss.com/asdqwe</a></p>
     */
    @NameInMap("file_url")
    @Validation(required = true)
    public String fileUrl;

    public static BclFileInfo build(java.util.Map<String, ?> map) throws Exception {
        BclFileInfo self = new BclFileInfo();
        return TeaModel.build(map, self);
    }

    public BclFileInfo setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public BclFileInfo setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

}
