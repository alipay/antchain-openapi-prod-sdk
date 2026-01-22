// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS_DE.Models
{
    // 货物明细
    public class CargoDetails : TeaModel {
        // 货物序号
        [NameInMap("cargo_sequence_no")]
        [Validation(Required=true, MaxLength=10)]
        public string CargoSequenceNo { get; set; }

        // 货物名称
        [NameInMap("cargo_name")]
        [Validation(Required=true, MaxLength=50)]
        public string CargoName { get; set; }

        // 货物规格
        [NameInMap("cargo_specification")]
        [Validation(Required=true, MaxLength=50)]
        public string CargoSpecification { get; set; }

        // 货物数量
        [NameInMap("cargo_quantity")]
        [Validation(Required=true, MaxLength=100)]
        public string CargoQuantity { get; set; }

        // 货物单价，小数位只支持2位
        [NameInMap("cargo_unit_price")]
        [Validation(Required=true, MaxLength=20)]
        public string CargoUnitPrice { get; set; }

    }

}
