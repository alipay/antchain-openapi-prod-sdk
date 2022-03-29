// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class GetLogBrowserRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 扫描根目录
        [NameInMap("scan_dirs")]
        [Validation(Required=true)]
        public List<string> ScanDirs { get; set; }

        // preferHost
        [NameInMap("prefer_host")]
        [Validation(Required=false)]
        public string PreferHost { get; set; }

    }

}
