// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 货物标的列表
    public class CargoInfo : TeaModel {
        // 货物类型，货物类型的大类
        [NameInMap("cargo_type")]
        [Validation(Required=true)]
        public string CargoType { get; set; }

        // 货物名称，实际的货物名称
        [NameInMap("cargo_name")]
        [Validation(Required=true)]
        public string CargoName { get; set; }

        // 货物数量
        [NameInMap("cargo_quantity")]
        [Validation(Required=true)]
        public string CargoQuantity { get; set; }

        // 货物申报价值，单位（元），最多支持2位小数，超过2位拒绝
        [NameInMap("cargo_worth")]
        [Validation(Required=true)]
        public string CargoWorth { get; set; }

    }

}
