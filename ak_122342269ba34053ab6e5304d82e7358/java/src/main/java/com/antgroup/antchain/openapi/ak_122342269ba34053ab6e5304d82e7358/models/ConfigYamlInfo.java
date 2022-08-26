// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_122342269ba34053ab6e5304d82e7358.models;

import com.aliyun.tea.*;

public class ConfigYamlInfo extends TeaModel {
    // 通道列表
    @NameInMap("channel_name_list")
    public java.util.List<String> channelNameList;

    // 验证节点名称列表
    @NameInMap("validator_peer_name_list")
    public java.util.List<String> validatorPeerNameList;

    public static ConfigYamlInfo build(java.util.Map<String, ?> map) throws Exception {
        ConfigYamlInfo self = new ConfigYamlInfo();
        return TeaModel.build(map, self);
    }

    public ConfigYamlInfo setChannelNameList(java.util.List<String> channelNameList) {
        this.channelNameList = channelNameList;
        return this;
    }
    public java.util.List<String> getChannelNameList() {
        return this.channelNameList;
    }

    public ConfigYamlInfo setValidatorPeerNameList(java.util.List<String> validatorPeerNameList) {
        this.validatorPeerNameList = validatorPeerNameList;
        return this;
    }
    public java.util.List<String> getValidatorPeerNameList() {
        return this.validatorPeerNameList;
    }

}
