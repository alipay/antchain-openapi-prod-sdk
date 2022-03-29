// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // AlarmHistoryStatsVO
    public class AlarmHistoryStatsVO : TeaModel {
        // trends
        [NameInMap("trends")]
        [Validation(Required=true)]
        public List<AlarmHistoryStatsDTOsKeySet> Trends { get; set; }

    }

}
