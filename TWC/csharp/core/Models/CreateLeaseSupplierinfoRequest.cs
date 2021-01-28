// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateLeaseSupplierinfoRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租赁方及资方定义的合约id
        [NameInMap("application_id")]
        [Validation(Required=true)]
        public string ApplicationId { get; set; }

        // 额外字段定义
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 供应商发货的物流单号
        [NameInMap("logistics_order_id")]
        [Validation(Required=true)]
        public string LogisticsOrderId { get; set; }

        // 用户的租赁订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 额外字段定义对应的阶段，请咨询对应的资方
        [NameInMap("phase")]
        [Validation(Required=true)]
        public string Phase { get; set; }

        // 采购订单id
        [NameInMap("purchase_order_id")]
        [Validation(Required=true)]
        public string PurchaseOrderId { get; set; }

        // 产品详细信息
        [NameInMap("supplier_product_list")]
        [Validation(Required=true)]
        public List<SupplierProductInfo> SupplierProductList { get; set; }

        // 1自有物流 2顺丰
        [NameInMap("maintained_by_supplier")]
        [Validation(Required=true)]
        public long? MaintainedBySupplier { get; set; }

        // 发货时间
        [NameInMap("deliver_time")]
        [Validation(Required=true)]
        public string DeliverTime { get; set; }

    }

}
