// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.abc.models;

import com.aliyun.tea.*;

public class TestPark extends TeaModel {
    // 请求时间
    @NameInMap("time")
    @Validation(required = true)
    public String time;

    // 请求人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 请求编号
    @NameInMap("count")
    @Validation(required = true)
    public Long count;

    public static TestPark build(java.util.Map<String, ?> map) throws Exception {
        TestPark self = new TestPark();
        return TeaModel.build(map, self);
    }

    public TestPark setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public TestPark setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public TestPark setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

}
