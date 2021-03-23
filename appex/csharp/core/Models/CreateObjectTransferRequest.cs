// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    public class CreateObjectTransferRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 区块链身份
        [NameInMap("user_did")]
        [Validation(Required=true)]
        public string UserDid { get; set; }

        // 联盟标识（联盟码）	
        [NameInMap("union_id")]
        [Validation(Required=true)]
        public string UnionId { get; set; }

        // 链上物体的身份，即物体（物权）上链接口返回的交易哈希
        [NameInMap("object_hash")]
        [Validation(Required=true)]
        public string ObjectHash { get; set; }

        // 流转备注信息
        [NameInMap("form_body")]
        [Validation(Required=false)]
        public string FormBody { get; set; }

        // 数据归属权流转到的Did
        [NameInMap("to_did")]
        [Validation(Required=true)]
        public string ToDid { get; set; }

    }

}
