// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateDataauthorizationCustomParticipantRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 区块链ID
        [NameInMap("blockchain_id")]
        [Validation(Required=false)]
        public string BlockchainId { get; set; }

        // 扩展参数
        [NameInMap("extension_info")]
        [Validation(Required=false)]
        public string ExtensionInfo { get; set; }

        // 参与方名字
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 服务地址
        [NameInMap("notification_service")]
        [Validation(Required=false)]
        public string NotificationService { get; set; }

        // 参与方ID，全局唯一
        [NameInMap("participant_id")]
        [Validation(Required=true)]
        public string ParticipantId { get; set; }

        // 公钥
        [NameInMap("public_key")]
        [Validation(Required=true)]
        public string PublicKey { get; set; }

        // 恢复公钥
        [NameInMap("recover_key")]
        [Validation(Required=true)]
        public string RecoverKey { get; set; }

        // 参与方角色列表
        [NameInMap("role")]
        [Validation(Required=true)]
        public List<string> Role { get; set; }

        // 信用代码，证件号等
        [NameInMap("credit_number")]
        [Validation(Required=false)]
        public string CreditNumber { get; set; }

        // 空间ID
        [NameInMap("space_id")]
        [Validation(Required=false)]
        public string SpaceId { get; set; }

    }

}
