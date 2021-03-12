// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartAmlCorporationJoinprepareRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 企业加入BaaS创建的反洗钱联盟时使用的邮箱地址
        [NameInMap("email")]
        [Validation(Required=true)]
        public string Email { get; set; }

        // 扩展信息字段
        [NameInMap("extension")]
        [Validation(Required=false)]
        public string Extension { get; set; }

        // 目前支持ECDSA K1公私密钥对
        [NameInMap("public_key")]
        [Validation(Required=true)]
        public string PublicKey { get; set; }

        // 数字身份恢复密钥，支持ECDSA K1曲线的公私密钥对
        [NameInMap("recovery_key")]
        [Validation(Required=false)]
        public string RecoveryKey { get; set; }

    }

}
