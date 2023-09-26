// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightContractInterface extends TeaModel {
    // 展示的函数名称
    @NameInMap("name")
    public String name;

    // 接口中使用的函数名称标识符
    @NameInMap("name_sig")
    @Validation(required = true)
    public String nameSig;

    // 接口的类型，枚举：function, event, deposit
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 对应的标准 ERC 事件/方法 的名称
    @NameInMap("standard_erc_name")
    public String standardErcName;

    // 参数列表
    @NameInMap("args")
    public java.util.List<ChainInsightContractInterfaceArgument> args;

    public static ChainInsightContractInterface build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightContractInterface self = new ChainInsightContractInterface();
        return TeaModel.build(map, self);
    }

    public ChainInsightContractInterface setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ChainInsightContractInterface setNameSig(String nameSig) {
        this.nameSig = nameSig;
        return this;
    }
    public String getNameSig() {
        return this.nameSig;
    }

    public ChainInsightContractInterface setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ChainInsightContractInterface setStandardErcName(String standardErcName) {
        this.standardErcName = standardErcName;
        return this;
    }
    public String getStandardErcName() {
        return this.standardErcName;
    }

    public ChainInsightContractInterface setArgs(java.util.List<ChainInsightContractInterfaceArgument> args) {
        this.args = args;
        return this;
    }
    public java.util.List<ChainInsightContractInterfaceArgument> getArgs() {
        return this.args;
    }

}
