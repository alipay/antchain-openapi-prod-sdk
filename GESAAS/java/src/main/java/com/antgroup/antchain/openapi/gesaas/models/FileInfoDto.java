// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class FileInfoDto extends TeaModel {
    // 文件url
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxx.alipay.com/paths/xx.png">https://xxx.alipay.com/paths/xx.png</a></p>
     */
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    public static FileInfoDto build(java.util.Map<String, ?> map) throws Exception {
        FileInfoDto self = new FileInfoDto();
        return TeaModel.build(map, self);
    }

    public FileInfoDto setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
