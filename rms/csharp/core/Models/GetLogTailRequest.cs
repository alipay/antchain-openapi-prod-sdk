// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class GetLogTailRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间名称
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // the preferHost
        [NameInMap("prefer_host")]
        [Validation(Required=false)]
        public string PreferHost { get; set; }

        // 日志完整路径
        [NameInMap("full_path")]
        [Validation(Required=false)]
        public string FullPath { get; set; }

        // 扫描路径
        [NameInMap("scan_dirs")]
        [Validation(Required=false)]
        public List<string> ScanDirs { get; set; }

    }

}
