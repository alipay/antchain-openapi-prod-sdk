// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.benchtwocreate.models;

import com.aliyun.tea.*;

public class BenchtwocreateStructC extends TeaModel {
    // 【姓名】
    /**
     * <strong>example:</strong>
     * <p>{&quot;first_name&quot;:&quot;建国&quot;,&quot;last_name&quot;:&quot;张&quot;}</p>
     */
    @NameInMap("name")
    public BenchtwocreateStructA name;

    // 【年龄&性别】
    /**
     * <strong>example:</strong>
     * <p>{&quot;age&quot;:&quot;20&quot;,&quot;gender&quot;:&quot;男&quot;}</p>
     */
    @NameInMap("message")
    public BenchtwocreateStructB message;

    // 【天气】
    /**
     * <strong>example:</strong>
     * <p>晴天</p>
     */
    @NameInMap("weather")
    public String weather;

    public static BenchtwocreateStructC build(java.util.Map<String, ?> map) throws Exception {
        BenchtwocreateStructC self = new BenchtwocreateStructC();
        return TeaModel.build(map, self);
    }

    public BenchtwocreateStructC setName(BenchtwocreateStructA name) {
        this.name = name;
        return this;
    }
    public BenchtwocreateStructA getName() {
        return this.name;
    }

    public BenchtwocreateStructC setMessage(BenchtwocreateStructB message) {
        this.message = message;
        return this;
    }
    public BenchtwocreateStructB getMessage() {
        return this.message;
    }

    public BenchtwocreateStructC setWeather(String weather) {
        this.weather = weather;
        return this;
    }
    public String getWeather() {
        return this.weather;
    }

}
