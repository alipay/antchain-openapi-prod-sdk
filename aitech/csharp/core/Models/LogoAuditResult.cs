// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    // logo审核结果
    public class LogoAuditResult : TeaModel {
        // 检测到LOGO个数
        [NameInMap("detect_num")]
        [Validation(Required=true)]
        public long? DetectNum { get; set; }

        // LOGO详情
        [NameInMap("details")]
        [Validation(Required=true)]
        public List<LogoDetail> Details { get; set; }

    }

}
