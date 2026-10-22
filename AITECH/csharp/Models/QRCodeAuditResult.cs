// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    // QRCode审核结果
    public class QRCodeAuditResult : TeaModel {
        // 检测到二维码个数
        [NameInMap("detect_num")]
        [Validation(Required=true)]
        public long? DetectNum { get; set; }

        // 二维码详情
        [NameInMap("details")]
        [Validation(Required=true)]
        public List<QRCodeDetail> Details { get; set; }

    }

}
