// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class Curve extends TeaModel {
    // 分布以day为单位的日期
    /**
     * <strong>example:</strong>
     * <p>2021-03-19</p>
     */
    @NameInMap("date")
    @Validation(required = true)
    public String date;

    // 以day为单位的一天凭证颁发的数据量统计。
    /**
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static Curve build(java.util.Map<String, ?> map) throws Exception {
        Curve self = new Curve();
        return TeaModel.build(map, self);
    }

    public Curve setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public Curve setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
