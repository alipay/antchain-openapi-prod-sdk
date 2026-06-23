// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class DomainSls extends TeaModel {
    // 拉取sql
    /**
     * <strong>example:</strong>
     * <p>select from</p>
     */
    @NameInMap("sql")
    public String sql;

    // 拉取SLS间隔
    /**
     * <strong>example:</strong>
     * <p>1_h</p>
     */
    @NameInMap("interval")
    public String interval;

    // 属性项
    /**
     * <strong>example:</strong>
     * <p>{&quot;code&quot;:&quot;code&quot;}</p>
     */
    @NameInMap("memo")
    public String memo;

    public static DomainSls build(java.util.Map<String, ?> map) throws Exception {
        DomainSls self = new DomainSls();
        return TeaModel.build(map, self);
    }

    public DomainSls setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

    public DomainSls setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DomainSls setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

}
