// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 采购订单信息
    public class ApplySupplierOrderProductOutput : TeaModel {
        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 链上采购单id
        [NameInMap("pur_order_id")]
        [Validation(Required=true)]
        public string PurOrderId { get; set; }

        // 待采购：READY_DELIVER
        // 已采购：DELIVERED
        // 已拒发：REJECTED
        // 已退货：RETURNED
        // 已取消：CANCELED
        [NameInMap("pur_order_status")]
        [Validation(Required=true)]
        public string PurOrderStatus { get; set; }

        // 供应商id
        [NameInMap("supplier_id")]
        [Validation(Required=false)]
        public string SupplierId { get; set; }

    }

}
