// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 货源单号-货主运费
    public class CargoAmount : TeaModel {
        // 货运单对应金额（2位小数）
        [NameInMap("amount")]
        [Validation(Required=true)]
        public string Amount { get; set; }

        // 货源单号
        [NameInMap("cargo_order")]
        [Validation(Required=true)]
        public string CargoOrder { get; set; }

    }

}
