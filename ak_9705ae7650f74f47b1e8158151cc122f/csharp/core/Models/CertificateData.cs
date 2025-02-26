// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_9705ae7650f74f47b1e8158151cc122f.Models
{
    // 证书信息
    public class CertificateData : TeaModel {
        // 任务ID
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // 版权用户UID
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // DCI码
        [NameInMap("dci_code")]
        [Validation(Required=true)]
        public string DciCode { get; set; }

        // 证书下载的链接地址
        [NameInMap("certificate_url")]
        [Validation(Required=true)]
        public string CertificateUrl { get; set; }

    }

}
