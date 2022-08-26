// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_122342269ba34053ab6e5304d82e7358.Models
{
    // 返回的解析后的yaml信息
    public class ConfigYamlInfo : TeaModel {
        // 通道列表
        [NameInMap("channel_name_list")]
        [Validation(Required=false)]
        public List<string> ChannelNameList { get; set; }

        // 验证节点名称列表
        [NameInMap("validator_peer_name_list")]
        [Validation(Required=false)]
        public List<string> ValidatorPeerNameList { get; set; }

    }

}
