// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qmbrain.models;

import com.aliyun.tea.*;

public class ResponseFormat extends TeaModel {
    // 格式化类型
    /**
     * <strong>example:</strong>
     * <p>json_object</p>
     */
    @NameInMap("type")
    public String type;

    public static ResponseFormat build(java.util.Map<String, ?> map) throws Exception {
        ResponseFormat self = new ResponseFormat();
        return TeaModel.build(map, self);
    }

    public ResponseFormat setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
