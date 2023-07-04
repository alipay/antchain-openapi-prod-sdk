// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ApplicationMeta extends TeaModel {
    // 产品名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 应用code
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 应用版本
    @NameInMap("version")
    @Validation(required = true)
    public String version;

    // 所属产品code
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 应用之间的依赖
    @NameInMap("dependencies")
    public java.util.List<String> dependencies;

    // 应用类型    STANDARD("standard"),
    //     JOB("job"),
    //     SIDECAR("sidecar"),
    //     DAEMON("daemon");
    @NameInMap("kind")
    @Validation(required = true)
    public String kind;

    public static ApplicationMeta build(java.util.Map<String, ?> map) throws Exception {
        ApplicationMeta self = new ApplicationMeta();
        return TeaModel.build(map, self);
    }

    public ApplicationMeta setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ApplicationMeta setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ApplicationMeta setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public ApplicationMeta setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ApplicationMeta setDependencies(java.util.List<String> dependencies) {
        this.dependencies = dependencies;
        return this;
    }
    public java.util.List<String> getDependencies() {
        return this.dependencies;
    }

    public ApplicationMeta setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

}
