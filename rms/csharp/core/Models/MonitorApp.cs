// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 应用监控 - 单个应用
    public class MonitorApp : TeaModel {
        // 应用 ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 应用展示名称
        [NameInMap("display_name")]
        [Validation(Required=true)]
        public string DisplayName { get; set; }

        // 来源
        [NameInMap("source_from")]
        [Validation(Required=true)]
        public string SourceFrom { get; set; }

        // 应用描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 拼接好的stack_universal_table_id
        [NameInMap("stack_universal_table_id")]
        [Validation(Required=false)]
        public string StackUniversalTableId { get; set; }

    }

}
