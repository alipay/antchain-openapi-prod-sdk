// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // AlarmHistoryListKeySet
    public class AlarmHistoryListKeySet : TeaModel {
        // key
        [NameInMap("key")]
        [Validation(Required=false)]
        public string Key { get; set; }

        // AlarmHistoryListKeySet
        [NameInMap("value")]
        [Validation(Required=false)]
        public List<AlarmHistory> Value { get; set; }

    }

}
