// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 库存货物
    public class InventoryCargo : TeaModel {
        // 序号，在同一次库存申报请求中，序号保持不重复，不能小于等于0
        [NameInMap("inventory_index")]
        [Validation(Required=true)]
        public long? InventoryIndex { get; set; }

        // sku品名
        [NameInMap("sku")]
        [Validation(Required=true, MaxLength=200)]
        public string Sku { get; set; }

        // 商品名称
        // 
        [NameInMap("cargo_name")]
        [Validation(Required=false, MaxLength=200)]
        public string CargoName { get; set; }

        // 商品单品重量(kg)
        [NameInMap("cargo_weight")]
        [Validation(Required=false, MaxLength=50)]
        public string CargoWeight { get; set; }

        // 商品外扩长宽高(cm)
        [NameInMap("cargo_dimensions")]
        [Validation(Required=false, MaxLength=200)]
        public string CargoDimensions { get; set; }

        // 商品单品货物价值(元),最多支持2位小数
        [NameInMap("cargo_worth")]
        [Validation(Required=false, MaxLength=30)]
        public string CargoWorth { get; set; }

        // 当前库存货物数量
        [NameInMap("current_inventory_cargo_num")]
        [Validation(Required=true)]
        public long? CurrentInventoryCargoNum { get; set; }

        // 客户代码
        // 
        [NameInMap("customer_code")]
        [Validation(Required=true, MaxLength=50)]
        public string CustomerCode { get; set; }

        // 关联保单号,需要仓储CP做拆分计算
        [NameInMap("policy_no")]
        [Validation(Required=false, MaxLength=64)]
        public string PolicyNo { get; set; }

        // 入库时间, yyyy-MM-dd HH:mm:ss，需要仓储CP做拆分计算
        // 
        [NameInMap("stockin_date")]
        [Validation(Required=false)]
        public string StockinDate { get; set; }

        // 时区,仓储CP上报入库时间所属的时区
        [NameInMap("timezone")]
        [Validation(Required=false, MaxLength=16)]
        public string Timezone { get; set; }

    }

}
