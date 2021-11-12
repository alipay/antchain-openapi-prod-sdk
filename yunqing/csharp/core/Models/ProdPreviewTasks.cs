// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 产品预览任务
    public class ProdPreviewTasks : TeaModel {
        // 应用是否需要部署
        [NameInMap("app_preview_tasks")]
        [Validation(Required=true)]
        public List<AppPreviewTask> AppPreviewTasks { get; set; }

    }

}
