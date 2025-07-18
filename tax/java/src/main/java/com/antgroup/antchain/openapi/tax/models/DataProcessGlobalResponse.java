// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class DataProcessGlobalResponse extends TeaModel {
    // 处理结果数据
    /**
     * <strong>example:</strong>
     * <p>{&quot;aa&quot;:&quot;aa&quot;}</p>
     */
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    public static DataProcessGlobalResponse build(java.util.Map<String, ?> map) throws Exception {
        DataProcessGlobalResponse self = new DataProcessGlobalResponse();
        return TeaModel.build(map, self);
    }

    public DataProcessGlobalResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
