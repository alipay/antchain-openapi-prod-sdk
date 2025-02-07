// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    public class CreateIssuerProjectRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 项目名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 项目名称
        [NameInMap("info")]
        [Validation(Required=true)]
        public string Info { get; set; }

        // 代币名称
        [NameInMap("token_name")]
        [Validation(Required=true)]
        public string TokenName { get; set; }

        // 最大供应量
        [NameInMap("capacity")]
        [Validation(Required=true)]
        public string Capacity { get; set; }

        // 净值
        [NameInMap("net_value")]
        [Validation(Required=false)]
        public string NetValue { get; set; }

        // 币种(目前支持USD、HKD、CNY)
        [NameInMap("currency")]
        [Validation(Required=true)]
        public string Currency { get; set; }

        // 项目参与者列表(代销机构，最多3个)
        [NameInMap("participants")]
        [Validation(Required=true)]
        public List<ParticipantInfo> Participants { get; set; }

        // 发行密钥ID列表(最多3个)
        [NameInMap("mint_keys")]
        [Validation(Required=true)]
        public List<string> MintKeys { get; set; }

        // 赎回密钥ID列表(最多3个)
        [NameInMap("burn_keys")]
        [Validation(Required=true)]
        public List<string> BurnKeys { get; set; }

        // 转账密钥ID列表(最多3个)
        [NameInMap("transfer_keys")]
        [Validation(Required=true)]
        public List<string> TransferKeys { get; set; }

        // 管理密钥ID列表(最多3个)
        [NameInMap("manager_keys")]
        [Validation(Required=true)]
        public List<string> ManagerKeys { get; set; }

    }

}
