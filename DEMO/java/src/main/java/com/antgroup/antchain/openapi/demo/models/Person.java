// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class Person extends TeaModel {
    // 12
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("idcard")
    public NameValuePair idcard;

    // 12
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // test
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("info")
    @Validation(required = true)
    public Cmd info;

    public static Person build(java.util.Map<String, ?> map) throws Exception {
        Person self = new Person();
        return TeaModel.build(map, self);
    }

    public Person setIdcard(NameValuePair idcard) {
        this.idcard = idcard;
        return this;
    }
    public NameValuePair getIdcard() {
        return this.idcard;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Person setInfo(Cmd info) {
        this.info = info;
        return this;
    }
    public Cmd getInfo() {
        return this.info;
    }

}
