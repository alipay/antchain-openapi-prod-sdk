// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class UpdateOcpProductRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 产品实例Id 
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 产品码 全局唯一
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 增量规格信息（JSON格式）会按照key进行排序
        [NameInMap("specification")]
        [Validation(Required=true)]
        public string Specification { get; set; }

    }

}
