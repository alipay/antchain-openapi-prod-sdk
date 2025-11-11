// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class DataSource extends TeaModel {
    // 数据源ID
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 数据源接口地址
    /**
     * <strong>example:</strong>
     * <p>https://******</p>
     */
    @NameInMap("address")
    @Validation(required = true)
    public String address;

    public static DataSource build(java.util.Map<String, ?> map) throws Exception {
        DataSource self = new DataSource();
        return TeaModel.build(map, self);
    }

    public DataSource setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DataSource setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

}
