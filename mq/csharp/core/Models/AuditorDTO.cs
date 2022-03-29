// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // sofamq 审计
    public class AuditorDTO : TeaModel {
        // 操作名
        [NameInMap("action")]
        [Validation(Required=true)]
        public string Action { get; set; }

        // 资源名
        [NameInMap("resource")]
        [Validation(Required=true)]
        public string Resource { get; set; }

        // 操作详情
        [NameInMap("detail")]
        [Validation(Required=true)]
        public string Detail { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 时间戳
        [NameInMap("timestamp")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string Timestamp { get; set; }

    }

}
