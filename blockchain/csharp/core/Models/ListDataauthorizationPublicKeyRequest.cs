// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class ListDataauthorizationPublicKeyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 生成公钥时的关联关系
        [NameInMap("public_key_relations")]
        [Validation(Required=true)]
        public List<PublicKeyRelation> PublicKeyRelations { get; set; }

    }

}
