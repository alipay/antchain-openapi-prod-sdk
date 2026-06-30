// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class FileNode extends TeaModel {
    // 可访问的文件链接
    /**
     * <strong>example:</strong>
     * <p><a href="http://xxxx">http://xxxx</a></p>
     */
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    // 文件名
    /**
     * <strong>example:</strong>
     * <p>xxxxx.pdf</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static FileNode build(java.util.Map<String, ?> map) throws Exception {
        FileNode self = new FileNode();
        return TeaModel.build(map, self);
    }

    public FileNode setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public FileNode setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
