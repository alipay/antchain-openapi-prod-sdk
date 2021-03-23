// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    public class CreateObjectRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 区块链身份
        // 
        // 
        [NameInMap("user_did")]
        [Validation(Required=true)]
        public string UserDid { get; set; }

        // 联盟标识（联盟码）	
        [NameInMap("union_id")]
        [Validation(Required=true)]
        public string UnionId { get; set; }

        // 归属权要流转的表单ID
        // 
        // 
        [NameInMap("form_id")]
        [Validation(Required=true)]
        public string FormId { get; set; }

        // 物的信息
        // 
        // 
        [NameInMap("form_body")]
        [Validation(Required=true)]
        public string FormBody { get; set; }

    }

}
