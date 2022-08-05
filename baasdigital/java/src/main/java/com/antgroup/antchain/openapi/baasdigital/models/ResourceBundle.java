// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class ResourceBundle extends TeaModel {
    // 可公开访问的资源地址
    @NameInMap("uri")
    @Validation(required = true, minLength = 1)
    public String uri;

    // 上传资源时指定的资源类型
    @NameInMap("type")
    @Validation(required = true, minLength = 1)
    public String type;

    // 资源描述
    @NameInMap("description")
    public String description;

    public static ResourceBundle build(java.util.Map<String, ?> map) throws Exception {
        ResourceBundle self = new ResourceBundle();
        return TeaModel.build(map, self);
    }

    public ResourceBundle setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

    public ResourceBundle setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ResourceBundle setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
