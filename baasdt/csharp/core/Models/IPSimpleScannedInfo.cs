// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 简要扫码信息
    public class IPSimpleScannedInfo : TeaModel {
        // 扫码人
        [NameInMap("user_name")]
        [Validation(Required=false)]
        public string UserName { get; set; }

        // 扫码时间
        [NameInMap("scanned_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ScannedTime { get; set; }

        // 扫码地址
        [NameInMap("gps")]
        [Validation(Required=false)]
        public string Gps { get; set; }

    }

}
