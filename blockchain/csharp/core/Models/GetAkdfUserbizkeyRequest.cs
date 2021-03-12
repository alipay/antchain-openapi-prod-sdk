// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class GetAkdfUserbizkeyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 区块链id
        [NameInMap("bizid")]
        [Validation(Required=true)]
        public string Bizid { get; set; }

        // 密钥名称
        [NameInMap("key_name")]
        [Validation(Required=true)]
        public string KeyName { get; set; }

    }

}
