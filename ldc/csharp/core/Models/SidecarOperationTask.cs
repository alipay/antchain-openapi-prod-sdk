// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // sidecar运维任务
    public class SidecarOperationTask : TeaModel {
        // 业务流水号
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 名称
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // sidecar运维内容上下文信息
        [NameInMap("context")]
        [Validation(Required=true)]
        public SidecarOperationTaskContext Context { get; set; }

    }

}
