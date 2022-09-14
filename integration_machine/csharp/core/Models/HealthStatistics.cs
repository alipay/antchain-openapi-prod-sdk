// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTEGRATION_MACHINE.Models
{
    // 通行日结统计
    public class HealthStatistics : TeaModel {
        // 统计日期
        [NameInMap("statistics_date")]
        [Validation(Required=true)]
        public string StatisticsDate { get; set; }

        // 通行总数
        [NameInMap("total_count")]
        [Validation(Required=true)]
        public long? TotalCount { get; set; }

        // 刷证数
        [NameInMap("cert_count")]
        [Validation(Required=true)]
        public long? CertCount { get; set; }

        // 刷脸数
        [NameInMap("face_count")]
        [Validation(Required=true)]
        public long? FaceCount { get; set; }

        // 二维码反扫数
        [NameInMap("inverse_count")]
        [Validation(Required=true)]
        public long? InverseCount { get; set; }

        // 正常通行数
        [NameInMap("pass_count")]
        [Validation(Required=true)]
        public long? PassCount { get; set; }

        // 禁止通行数
        [NameInMap("stop_count")]
        [Validation(Required=true)]
        public long? StopCount { get; set; }

    }

}
