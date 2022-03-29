// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class ListCustompluginRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间名称
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 插件类型
        [NameInMap("plugin_type")]
        [Validation(Required=false)]
        public string PluginType { get; set; }

        // 过滤类型
        [NameInMap("filter_type")]
        [Validation(Required=false)]
        public string FilterType { get; set; }

        // 过滤条件，如app名称
        [NameInMap("filter")]
        [Validation(Required=false)]
        public string Filter { get; set; }

    }

}
