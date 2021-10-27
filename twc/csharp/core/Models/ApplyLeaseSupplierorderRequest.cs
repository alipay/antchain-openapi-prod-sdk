// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class ApplyLeaseSupplierorderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 供应商id
        [NameInMap("supplier_id")]
        [Validation(Required=true)]
        public string SupplierId { get; set; }

        // 商品信息
        [NameInMap("product_infos")]
        [Validation(Required=true)]
        public List<ApplySupplierOrderProductInput> ProductInfos { get; set; }

        // isv代理模式
        [NameInMap("mode")]
        [Validation(Required=false)]
        public string Mode { get; set; }

        // 被代理的租户id
        [NameInMap("agent_lease_id")]
        [Validation(Required=false)]
        public string AgentLeaseId { get; set; }

    }

}
