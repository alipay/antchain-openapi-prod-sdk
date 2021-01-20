// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class GetCustompluginRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间
        [NameInMap("workspace_name")]
        [Validation(Required=false)]
        public string WorkspaceName { get; set; }

        // 自定义监控指标 ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 类型
        [NameInMap("plugin_type")]
        [Validation(Required=false)]
        public string PluginType { get; set; }

    }

}
