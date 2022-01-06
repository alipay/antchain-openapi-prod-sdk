// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class BaseActionModel extends TeaModel {
    // 行为类型REJECT/PASS
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 扩展字段
    @NameInMap("extension")
    public String extension;

    // 开启状态
    @NameInMap("enabled")
    public Boolean enabled;

    public static BaseActionModel build(java.util.Map<String, ?> map) throws Exception {
        BaseActionModel self = new BaseActionModel();
        return TeaModel.build(map, self);
    }

    public BaseActionModel setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public BaseActionModel setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public BaseActionModel setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

}
