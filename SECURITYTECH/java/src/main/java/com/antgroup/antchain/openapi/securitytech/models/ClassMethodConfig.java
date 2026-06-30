// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class ClassMethodConfig extends TeaModel {
    // 加固类名
    /**
     * <strong>example:</strong>
     * <p>class_name</p>
     */
    @NameInMap("class_name")
    @Validation(required = true)
    public String className;

    // 方法集合，使用英文逗号分隔
    /**
     * <strong>example:</strong>
     * <p>methods</p>
     */
    @NameInMap("methods")
    @Validation(required = true)
    public String methods;

    public static ClassMethodConfig build(java.util.Map<String, ?> map) throws Exception {
        ClassMethodConfig self = new ClassMethodConfig();
        return TeaModel.build(map, self);
    }

    public ClassMethodConfig setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public ClassMethodConfig setMethods(String methods) {
        this.methods = methods;
        return this;
    }
    public String getMethods() {
        return this.methods;
    }

}
