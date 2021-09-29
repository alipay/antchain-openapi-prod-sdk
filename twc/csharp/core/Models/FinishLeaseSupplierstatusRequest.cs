// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class FinishLeaseSupplierstatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 采购订单id，由采购平台生成
        [NameInMap("supplier_order_no")]
        [Validation(Required=true)]
        public string SupplierOrderNo { get; set; }

        // 租赁订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 租赁方id，非采购平台
        [NameInMap("lease_id")]
        [Validation(Required=true)]
        public string LeaseId { get; set; }

        // 当前的采购状态
        [NameInMap("supplier_order_status")]
        [Validation(Required=true)]
        public string SupplierOrderStatus { get; set; }

        // 物流订单id
        [NameInMap("supplier_logistic_info")]
        [Validation(Required=true)]
        public SupplierLogisticInfo SupplierLogisticInfo { get; set; }

        // 采购平台回传的商品订单信息
        [NameInMap("supplier_order_product_infos")]
        [Validation(Required=true)]
        public List<SupplierOrderProductInfo> SupplierOrderProductInfos { get; set; }

        // 供应商id
        [NameInMap("supplier_id")]
        [Validation(Required=true)]
        public string SupplierId { get; set; }

    }

}
