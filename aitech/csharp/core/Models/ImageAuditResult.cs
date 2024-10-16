// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    // 图片审核结果
    public class ImageAuditResult : TeaModel {
        // 任务ID
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // 数据ID
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

        // LOGO审核结果
        [NameInMap("logo_audit_result")]
        [Validation(Required=true)]
        public LogoAuditResult LogoAuditResult { get; set; }

        // QRCode审核结果
        [NameInMap("qr_code_audit_result")]
        [Validation(Required=true)]
        public QRCodeAuditResult QrCodeAuditResult { get; set; }

    }

}
