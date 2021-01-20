// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryFolderPathRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 自定义监控 ID 
        [NameInMap("custom_plugin_id")]
        [Validation(Required=false)]
        public long? CustomPluginId { get; set; }

        // 文件夹 ID
        [NameInMap("folder_id")]
        [Validation(Required=false)]
        public long? FolderId { get; set; }

        // 是否包含插件名
        [NameInMap("include_plugin_name")]
        [Validation(Required=false)]
        public bool? IncludePluginName { get; set; }

    }

}
