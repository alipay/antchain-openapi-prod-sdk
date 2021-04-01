// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class UpdateMydidcommunWorkergroupTappRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // TAPP部署实例ID
        [NameInMap("tapp_instance_id")]
        [Validation(Required=true)]
        public long? TappInstanceId { get; set; }

        // TAPP部署公钥
        [NameInMap("public_key")]
        [Validation(Required=true)]
        public string PublicKey { get; set; }

        // TAPP部署在mytf中的版本号
        [NameInMap("tapp_version")]
        [Validation(Required=true)]
        public long? TappVersion { get; set; }

        // mytf部署后返回的TAPP哈希
        [NameInMap("hash")]
        [Validation(Required=true)]
        public string Hash { get; set; }

    }

}
