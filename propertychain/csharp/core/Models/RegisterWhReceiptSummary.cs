// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 注册仓单申请单
    public class RegisterWhReceiptSummary : TeaModel {
        // 注册仓单申请单ID
        [NameInMap("register_wh_receipt_id")]
        [Validation(Required=false)]
        public string RegisterWhReceiptId { get; set; }

        // 仓单ID
        [NameInMap("warehouse_receipt_id")]
        [Validation(Required=false)]
        public string WarehouseReceiptId { get; set; }

        // 注册仓单申请单状态【 NONE：无效状态，WAITING：待审核，AGREED：审核同意，REJECTED：审核拒绝，CANCELED：已取消，WAITING_PRE_ALLOC_POSITION：待预分配仓位，WAITING_TRANSACTION_IN：待入库，TRANSACTION_IN：入库中，FINISHED_TRANSACTION_IN：已入库/待确认，CONFIRMED_TRANSACTION_IN：完成入库，INTERRUPTION：已中断，ALL：所有状态】
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 申请时间，单位：ms
        [NameInMap("apply_time")]
        [Validation(Required=false)]
        public long? ApplyTime { get; set; }

        // 货物品类
        [NameInMap("commodity_category")]
        [Validation(Required=false)]
        public string CommodityCategory { get; set; }

        // 数量 + 单位
        [NameInMap("quantity")]
        [Validation(Required=false)]
        public string Quantity { get; set; }

        // 重量 + 单位
        [NameInMap("weight")]
        [Validation(Required=false)]
        public string Weight { get; set; }

        // 存货人名称
        [NameInMap("customer_name")]
        [Validation(Required=false)]
        public string CustomerName { get; set; }

        // 保管人名称
        [NameInMap("custodian_name")]
        [Validation(Required=false)]
        public string CustodianName { get; set; }

    }

}
