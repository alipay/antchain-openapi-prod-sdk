// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.integration_machine.models;

import com.aliyun.tea.*;

public class StatisticsExtendArg extends TeaModel {
    // 字段key
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 数量
    @NameInMap("number")
    @Validation(required = true)
    public Long number;

    public static StatisticsExtendArg build(java.util.Map<String, ?> map) throws Exception {
        StatisticsExtendArg self = new StatisticsExtendArg();
        return TeaModel.build(map, self);
    }

    public StatisticsExtendArg setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public StatisticsExtendArg setNumber(Long number) {
        this.number = number;
        return this;
    }
    public Long getNumber() {
        return this.number;
    }

}
