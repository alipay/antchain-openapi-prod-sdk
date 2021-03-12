// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class InitOcpProductRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 加载业务的场景
        [NameInMap("business_action")]
        [Validation(Required=true)]
        public string BusinessAction { get; set; }

        // 用于加载对应场景数据的上下文（JSON格式具体同产品方定义）
        [NameInMap("business_context")]
        [Validation(Required=true)]
        public string BusinessContext { get; set; }

        // 流水号用于业务串联，以及幂等
        [NameInMap("order_no")]
        [Validation(Required=false)]
        public string OrderNo { get; set; }

        // 产品码 全局唯一
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 区域
        [NameInMap("region")]
        [Validation(Required=false)]
        public string Region { get; set; }

    }

}
