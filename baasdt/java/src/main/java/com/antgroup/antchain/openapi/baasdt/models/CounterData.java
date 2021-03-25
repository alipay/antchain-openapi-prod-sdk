// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CounterData extends TeaModel {
    // 成交总额
    @NameInMap("gmv")
    @Validation(required = true)
    public String gmv;

    // 公认标准收入
    @NameInMap("gaap")
    @Validation(required = true)
    public String gaap;

    // 笔数
    @NameInMap("counter")
    @Validation(required = true)
    public String counter;

    public static CounterData build(java.util.Map<String, ?> map) throws Exception {
        CounterData self = new CounterData();
        return TeaModel.build(map, self);
    }

    public CounterData setGmv(String gmv) {
        this.gmv = gmv;
        return this;
    }
    public String getGmv() {
        return this.gmv;
    }

    public CounterData setGaap(String gaap) {
        this.gaap = gaap;
        return this;
    }
    public String getGaap() {
        return this.gaap;
    }

    public CounterData setCounter(String counter) {
        this.counter = counter;
        return this;
    }
    public String getCounter() {
        return this.counter;
    }

}
