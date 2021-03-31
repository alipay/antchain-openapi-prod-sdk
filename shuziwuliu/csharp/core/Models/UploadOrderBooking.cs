// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 上传booking信息
    public class UploadOrderBooking : TeaModel {
        // 订舱单号
        [NameInMap("booking_no")]
        [Validation(Required=true)]
        public string BookingNo { get; set; }

        // 集装箱号  json字符串上传
        [NameInMap("container_nos")]
        [Validation(Required=true)]
        public string ContainerNos { get; set; }

    }

}
