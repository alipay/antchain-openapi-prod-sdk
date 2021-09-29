// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class SyncLeaseSupplierorderstatusRequest : TeaModel {
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

        // 订单采购状态，已取消[CANCEL，已拒收REFUSE_DELIVER，待发货TOBE_DELIVER，已退货RETURN_BACK]
        [NameInMap("supplier_status")]
        [Validation(Required=true)]
        public string SupplierStatus { get; set; }

        // 租赁商家金融科技租户id
        [NameInMap("lease_id")]
        [Validation(Required=true)]
        public string LeaseId { get; set; }

    }

}
