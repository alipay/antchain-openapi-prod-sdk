// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 应用PreviewTask
    public class AppPreviewTask : TeaModel {
        // app name
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 是否需要部署
        [NameInMap("need_deploy")]
        [Validation(Required=true)]
        public bool? NeedDeploy { get; set; }

    }

}
