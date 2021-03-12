// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryAuthVcContentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 如果此字段为空，则默认使用当前请求租户在授权宝配置的did来进行查询(此did需授权有权限)，此外情况都需要指定目标vc_id的owner_did
        [NameInMap("owner_did")]
        [Validation(Required=false)]
        public string OwnerDid { get; set; }

        // 查询目标可验证声明的ID
        [NameInMap("vc_id")]
        [Validation(Required=true)]
        public string VcId { get; set; }

    }

}
