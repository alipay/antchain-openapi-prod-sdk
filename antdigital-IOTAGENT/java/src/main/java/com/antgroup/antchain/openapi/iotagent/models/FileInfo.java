// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class FileInfo extends TeaModel {
    // 文件名称
    /**
     * <strong>example:</strong>
     * <p>文件名称</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 文件类型
    /**
     * <strong>example:</strong>
     * <p>文件类型</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // oss地址
    /**
     * <strong>example:</strong>
     * <p>oss地址</p>
     */
    @NameInMap("url")
    @Validation(required = true)
    public String url;

    public static FileInfo build(java.util.Map<String, ?> map) throws Exception {
        FileInfo self = new FileInfo();
        return TeaModel.build(map, self);
    }

    public FileInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FileInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public FileInfo setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
