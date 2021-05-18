// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 入库货物
    public class StockinCargo : TeaModel {
        // 入库序号，在同一次入库请求中，入库序号保持不重复，不能小于0
        [NameInMap("stockin_index")]
        [Validation(Required=true)]
        public long? StockinIndex { get; set; }

        // sku品名
        // 
        [NameInMap("sku")]
        [Validation(Required=true)]
        public string Sku { get; set; }

        // 商品名称
        [NameInMap("cargo_name")]
        [Validation(Required=false)]
        public string CargoName { get; set; }

        // 商品单品重量(kg)
        [NameInMap("cargo_weight")]
        [Validation(Required=false)]
        public string CargoWeight { get; set; }

        // 商品外扩长宽高(cm)
        [NameInMap("cargo_dimensions")]
        [Validation(Required=false)]
        public string CargoDimensions { get; set; }

        // 商品单品货物价值(元),，最多支持2位小数
        [NameInMap("cargo_worth")]
        [Validation(Required=false)]
        public string CargoWorth { get; set; }

        // 箱号
        [NameInMap("container_no")]
        [Validation(Required=false)]
        public string ContainerNo { get; set; }

        // 实际入库件数
        [NameInMap("actual_stockin_num")]
        [Validation(Required=true)]
        public long? ActualStockinNum { get; set; }

    }

}
