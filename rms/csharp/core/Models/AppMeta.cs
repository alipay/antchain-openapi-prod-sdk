// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // app详情
    public class AppMeta : TeaModel {
        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public long? WorkspaceId { get; set; }

        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // app_id
        [NameInMap("app_id")]
        [Validation(Required=true)]
        public long? AppId { get; set; }

    }

}
