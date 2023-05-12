// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // 分库分表规则
    public class SplitRule : TeaModel {
        // db_split_rule
        [NameInMap("db_split_rule")]
        [Validation(Required=true)]
        public long? DbSplitRule { get; set; }

        // db_split_template
        [NameInMap("db_split_template")]
        [Validation(Required=false)]
        public string DbSplitTemplate { get; set; }

        // table_split_rule
        [NameInMap("table_split_rule")]
        [Validation(Required=true)]
        public long? TableSplitRule { get; set; }

        // table_split_template
        [NameInMap("table_split_template")]
        [Validation(Required=false)]
        public string TableSplitTemplate { get; set; }

    }

}
