// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketingagent.models;

import com.aliyun.tea.*;

public class DataPart extends TeaModel {
    // A JSON object containing arbitrary data.
    /**
     * <strong>example:</strong>
     * <p>data</p>
     */
    @NameInMap("data")
    public String data;

    public static DataPart build(java.util.Map<String, ?> map) throws Exception {
        DataPart self = new DataPart();
        return TeaModel.build(map, self);
    }

    public DataPart setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
