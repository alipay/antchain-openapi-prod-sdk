// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // AlarmTypeStatsVO
    public class AlarmTypeStatsVO : TeaModel {
        // custom_plugin
        [NameInMap("custom_plugin")]
        [Validation(Required=true)]
        public long? CustomPlugin { get; set; }

        // meta_group
        [NameInMap("meta_group")]
        [Validation(Required=true)]
        public long? MetaGroup { get; set; }

        // stack_universal_table
        [NameInMap("stack_universal_table")]
        [Validation(Required=true)]
        public long? StackUniversalTable { get; set; }

    }

}
