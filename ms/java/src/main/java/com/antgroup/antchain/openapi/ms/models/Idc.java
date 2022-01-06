// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class Idc extends TeaModel {
    // 机房对应配置中心域名
    @NameInMap("domain_name")
    public String domainName;

    // 机房id
    @NameInMap("id")
    public String id;

    // 机房名称
    @NameInMap("name")
    public String name;

    // 是否为预发环境
    @NameInMap("preprod")
    public Boolean preprod;

    public static Idc build(java.util.Map<String, ?> map) throws Exception {
        Idc self = new Idc();
        return TeaModel.build(map, self);
    }

    public Idc setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public Idc setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Idc setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Idc setPreprod(Boolean preprod) {
        this.preprod = preprod;
        return this;
    }
    public Boolean getPreprod() {
        return this.preprod;
    }

}
