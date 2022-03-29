// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 告警统计信息
    public class AlarmCountInfo : TeaModel {
        // 自定义监控告警数量
        [NameInMap("custom_plugin_count")]
        [Validation(Required=true)]
        public long? CustomPluginCount { get; set; }

        // 应用组告警数量
        [NameInMap("app_group_count")]
        [Validation(Required=true)]
        public long? AppGroupCount { get; set; }

        // 应用监控告警数量
        [NameInMap("app_count")]
        [Validation(Required=true)]
        public long? AppCount { get; set; }

    }

}
