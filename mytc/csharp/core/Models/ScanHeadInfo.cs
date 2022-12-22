// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYTC.Models
{
    // 首次扫描信息
    public class ScanHeadInfo : TeaModel {
        // 扫描时间
        [NameInMap("scan_time")]
        [Validation(Required=true)]
        public long? ScanTime { get; set; }

        // 扫码次数
        [NameInMap("scan_count")]
        [Validation(Required=true)]
        public long? ScanCount { get; set; }

        // 扫码地址
        [NameInMap("scan_addr")]
        [Validation(Required=true)]
        public string ScanAddr { get; set; }

    }

}
