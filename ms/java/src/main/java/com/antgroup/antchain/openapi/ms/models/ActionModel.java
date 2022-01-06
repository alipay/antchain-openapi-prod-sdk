// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ActionModel extends TeaModel {
    // 拓展信息
    @NameInMap("extension")
    public String extension;

    // REJECT/PASS
    @NameInMap("type")
    public String type;

    public static ActionModel build(java.util.Map<String, ?> map) throws Exception {
        ActionModel self = new ActionModel();
        return TeaModel.build(map, self);
    }

    public ActionModel setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public ActionModel setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
