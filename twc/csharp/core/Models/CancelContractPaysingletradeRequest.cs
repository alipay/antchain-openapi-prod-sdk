// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CancelContractPaysingletradeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 智能合同id
        [NameInMap("flow_id")]
        [Validation(Required=true)]
        public string FlowId { get; set; }

        // 被取消的某一期的代扣id
        [NameInMap("cancel_out_order_no")]
        [Validation(Required=true)]
        public string CancelOutOrderNo { get; set; }

        // 租赁宝租赁订单号
        [NameInMap("bcl_order_id")]
        [Validation(Required=false)]
        public string BclOrderId { get; set; }

        // 租赁订单对应的租户id
        [NameInMap("bcl_tenant_id")]
        [Validation(Required=false)]
        public string BclTenantId { get; set; }

    }

}
