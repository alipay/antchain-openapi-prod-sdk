// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 线下取证水印结果
    public class OfflineEvidenceWatermarkResult : TeaModel {
        // 取证编号
        [NameInMap("evidence_no")]
        [Validation(Required=true)]
        public string EvidenceNo { get; set; }

        // 水印链接
        [NameInMap("watermark_url")]
        [Validation(Required=false)]
        public string WatermarkUrl { get; set; }

        // 封面链接
        [NameInMap("cover_url")]
        [Validation(Required=false)]
        public string CoverUrl { get; set; }

        // 失败原因
        [NameInMap("fail_reason")]
        [Validation(Required=false)]
        public string FailReason { get; set; }

    }

}
