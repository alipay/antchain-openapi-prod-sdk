// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    // updateScopeValue
    public class UpdateScopeValue : TeaModel {
        // CN-HANGZHOU-FINANCE
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

        // 限流值
        [NameInMap("limit")]
        [Validation(Required=true)]
        public long? Limit { get; set; }

        // 生效与否
        [NameInMap("enabled")]
        [Validation(Required=true)]
        public bool? Enabled { get; set; }

        // 时间单位
        [NameInMap("time_duration")]
        [Validation(Required=true)]
        public string TimeDuration { get; set; }

    }

}
