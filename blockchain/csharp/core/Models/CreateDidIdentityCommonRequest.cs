// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateDidIdentityCommonRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

        // 扩展字段
        [NameInMap("extension_info")]
        [Validation(Required=false)]
        public string ExtensionInfo { get; set; }

        // 公钥
        [NameInMap("public_key")]
        [Validation(Required=true)]
        public string PublicKey { get; set; }

        // 恢复公钥
        [NameInMap("recovery_key")]
        [Validation(Required=true)]
        public string RecoveryKey { get; set; }

        // user_id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 名称
        [NameInMap("user_name")]
        [Validation(Required=false)]
        public string UserName { get; set; }

        // 通用DID类型 Person Corporate Devices Data Common
        [NameInMap("entity_type")]
        [Validation(Required=false)]
        public string EntityType { get; set; }

    }

}
