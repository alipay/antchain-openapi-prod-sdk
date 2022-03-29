// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 工单详情
    public class ProcessDTO : TeaModel {
        // 工单名称
        [NameInMap("process_name")]
        [Validation(Required=true)]
        public string ProcessName { get; set; }

        // 状态
        [NameInMap("process_status")]
        [Validation(Required=true)]
        public string ProcessStatus { get; set; }

        // 工单链接
        [NameInMap("process_url")]
        [Validation(Required=true)]
        public string ProcessUrl { get; set; }

    }

}
