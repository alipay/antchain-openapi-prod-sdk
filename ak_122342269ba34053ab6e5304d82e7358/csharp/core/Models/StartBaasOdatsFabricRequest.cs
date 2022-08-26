// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_122342269ba34053ab6e5304d82e7358.Models
{
    public class StartBaasOdatsFabricRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 通道名
        [NameInMap("channel_name")]
        [Validation(Required=true)]
        public string ChannelName { get; set; }

        // fabric yaml 配置文件
        [NameInMap("config_yaml")]
        [Validation(Required=true)]
        public string ConfigYaml { get; set; }

        // 详细描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 链域名
        [NameInMap("domain")]
        [Validation(Required=true)]
        public string Domain { get; set; }

        // fabric 密码
        [NameInMap("secret")]
        [Validation(Required=false)]
        public string Secret { get; set; }

        // fabir链接用户名
        [NameInMap("username")]
        [Validation(Required=false)]
        public string Username { get; set; }

        // fabric用户证书
        [NameInMap("user_cert")]
        [Validation(Required=false)]
        public string UserCert { get; set; }

        // fabric用户密钥
        [NameInMap("user_key")]
        [Validation(Required=false)]
        public string UserKey { get; set; }

        // 验证节点列表
        [NameInMap("validator_peer_name_list")]
        [Validation(Required=true)]
        public List<string> ValidatorPeerNameList { get; set; }

    }

}
