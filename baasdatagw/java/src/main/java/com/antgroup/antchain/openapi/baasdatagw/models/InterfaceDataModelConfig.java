// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class InterfaceDataModelConfig extends TeaModel {
    // 接口名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 接口签名，SOLIDITY 合约必填
    @NameInMap("name_sig")
    public String nameSig;

    // 接口类型，当前 event 暂不支持。
    // function / deposit / event
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 接口参数配置列表，保序传递。
    @NameInMap("arg_configs")
    public java.util.List<DataModelConfig> argConfigs;

    public static InterfaceDataModelConfig build(java.util.Map<String, ?> map) throws Exception {
        InterfaceDataModelConfig self = new InterfaceDataModelConfig();
        return TeaModel.build(map, self);
    }

    public InterfaceDataModelConfig setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public InterfaceDataModelConfig setNameSig(String nameSig) {
        this.nameSig = nameSig;
        return this;
    }
    public String getNameSig() {
        return this.nameSig;
    }

    public InterfaceDataModelConfig setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public InterfaceDataModelConfig setArgConfigs(java.util.List<DataModelConfig> argConfigs) {
        this.argConfigs = argConfigs;
        return this;
    }
    public java.util.List<DataModelConfig> getArgConfigs() {
        return this.argConfigs;
    }

}
