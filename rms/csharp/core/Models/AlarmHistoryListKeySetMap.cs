// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // AlarmHistoryListKeySetMap
    public class AlarmHistoryListKeySetMap : TeaModel {
        // key
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // value
        [NameInMap("entity")]
        [Validation(Required=true)]
        public List<AlarmHistoryListKeySet> Entity { get; set; }

    }

}
