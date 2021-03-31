// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 运单号-司机运费
    public class WaybillAmount : TeaModel {
        // 运单金额（2位小数）
        [NameInMap("amount")]
        [Validation(Required=true)]
        public string Amount { get; set; }

        // 运单号
        [NameInMap("waybill_id")]
        [Validation(Required=true)]
        public string WaybillId { get; set; }

    }

}
