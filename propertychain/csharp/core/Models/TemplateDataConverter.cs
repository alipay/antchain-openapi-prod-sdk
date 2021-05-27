// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 字典信息
    public class TemplateDataConverter : TeaModel {
        // 货物品类
        [NameInMap("commodity_category")]
        [Validation(Required=true)]
        public string CommodityCategory { get; set; }

        // 仓单的生成时间
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // 仓储方名称或ID，提交的时候使用ID，展示使用名称
        [NameInMap("custodian_corp")]
        [Validation(Required=false)]
        public string CustodianCorp { get; set; }

        // 存货人名称或ID，提交的时候使用ID，展示使用名称
        [NameInMap("customer_corp")]
        [Validation(Required=false)]
        public string CustomerCorp { get; set; }

        // 其他字典定制信息
        [NameInMap("custom_data")]
        [Validation(Required=false)]
        public string CustomData { get; set; }

        // 是否补仓
        [NameInMap("is_supplement")]
        [Validation(Required=true)]
        public bool? IsSupplement { get; set; }

        // 联盟ID
        [NameInMap("league_id")]
        [Validation(Required=true)]
        public string LeagueId { get; set; }

        // 联盟名称
        [NameInMap("league_name")]
        [Validation(Required=true)]
        public string LeagueName { get; set; }

        // 资金方名称或ID，提交的时候使用ID，展示使用名称
        [NameInMap("lender_corp")]
        [Validation(Required=false)]
        public string LenderCorp { get; set; }

        // 仓位ID列表
        [NameInMap("position")]
        [Validation(Required=false)]
        public List<string> Position { get; set; }

        // 预分配仓位ID列表
        [NameInMap("pre_position")]
        [Validation(Required=false)]
        public List<string> PrePosition { get; set; }

        // 预分配仓库名称或ID，提交的时候使用ID，展示使用名称
        [NameInMap("pre_warehouse_name")]
        [Validation(Required=false)]
        public string PreWarehouseName { get; set; }

        // 数量
        [NameInMap("quantity")]
        [Validation(Required=true)]
        public long? Quantity { get; set; }

        // 数量单位
        [NameInMap("quantity_unit")]
        [Validation(Required=true)]
        public string QuantityUnit { get; set; }

        // 物权方
        [NameInMap("real_right_name")]
        [Validation(Required=false)]
        public string RealRightName { get; set; }

        // 仓单状态
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

        // 补仓仓单ID
        [NameInMap("supplement_warehouse_receipt_id")]
        [Validation(Required=false)]
        public string SupplementWarehouseReceiptId { get; set; }

        // 仓单更新时间
        [NameInMap("update_time")]
        [Validation(Required=false)]
        public long? UpdateTime { get; set; }

        // 仓库名称或ID，提交的时候使用ID，展示使用名称
        [NameInMap("warehouse_name")]
        [Validation(Required=false)]
        public string WarehouseName { get; set; }

        // 仓单ID
        [NameInMap("warehouse_receipt_id")]
        [Validation(Required=false)]
        public string WarehouseReceiptId { get; set; }

        // 重量
        [NameInMap("weight")]
        [Validation(Required=true)]
        public string Weight { get; set; }

        // 重量单位
        [NameInMap("weight_unit")]
        [Validation(Required=true)]
        public string WeightUnit { get; set; }

    }

}
