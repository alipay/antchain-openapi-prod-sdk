// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 航运订舱单号信息
    public class BookingNoInfo : TeaModel {
        // 订舱单唯一标识
        [NameInMap("booking_no")]
        [Validation(Required=false)]
        public string BookingNo { get; set; }

        // 订舱号
        [NameInMap("bkg_no")]
        [Validation(Required=false)]
        public string BkgNo { get; set; }

    }

}
