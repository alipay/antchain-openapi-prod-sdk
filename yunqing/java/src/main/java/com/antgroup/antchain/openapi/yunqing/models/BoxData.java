// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class BoxData extends TeaModel {
    // 装箱数据类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 装箱的json数据
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // 装箱数据版本
    @NameInMap("version")
    @Validation(required = true)
    public String version;

    public static BoxData build(java.util.Map<String, ?> map) throws Exception {
        BoxData self = new BoxData();
        return TeaModel.build(map, self);
    }

    public BoxData setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public BoxData setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public BoxData setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
