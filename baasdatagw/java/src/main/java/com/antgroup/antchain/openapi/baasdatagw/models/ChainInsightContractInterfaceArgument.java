// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightContractInterfaceArgument extends TeaModel {
    // 参数名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 参数类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 参数位置，枚举：input，output，deposit
    @NameInMap("location")
    @Validation(required = true)
    public String location;

    // 参数的业务名称
    @NameInMap("comment")
    public String comment;

    public static ChainInsightContractInterfaceArgument build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightContractInterfaceArgument self = new ChainInsightContractInterfaceArgument();
        return TeaModel.build(map, self);
    }

    public ChainInsightContractInterfaceArgument setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ChainInsightContractInterfaceArgument setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ChainInsightContractInterfaceArgument setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public ChainInsightContractInterfaceArgument setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

}
