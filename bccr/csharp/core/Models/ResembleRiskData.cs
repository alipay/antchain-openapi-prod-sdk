// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 作品相似识别结果
    public class ResembleRiskData : TeaModel {
        // 识别结果
        [NameInMap("code")]
        [Validation(Required=true)]
        public long? Code { get; set; }

        // 重复作品ID
        [NameInMap("work_id")]
        [Validation(Required=true)]
        public string WorkId { get; set; }

        // 相似值百分比
        [NameInMap("resemble")]
        [Validation(Required=true)]
        public string Resemble { get; set; }

        // 相似作品下载链接
        [NameInMap("work_download_url")]
        [Validation(Required=true)]
        public string WorkDownloadUrl { get; set; }

        // 风险等级
        [NameInMap("risk_level")]
        [Validation(Required=true)]
        public long? RiskLevel { get; set; }

    }

}
