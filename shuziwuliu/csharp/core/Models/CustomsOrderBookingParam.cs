// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 订舱单号
    public class CustomsOrderBookingParam : TeaModel {
        // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        [NameInMap("action")]
        [Validation(Required=false)]
        public string Action { get; set; }

        // 订舱单号
        [NameInMap("booking_no")]
        [Validation(Required=true)]
        public string BookingNo { get; set; }

    }

}
