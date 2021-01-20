// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 重试信息
    public class RetryInfo : TeaModel {
        // action
        [NameInMap("action")]
        [Validation(Required=false)]
        public string Action { get; set; }

        // check_interval
        [NameInMap("check_interval")]
        [Validation(Required=false)]
        public long? CheckInterval { get; set; }

        // retry_failed_only
        [NameInMap("retry_failed_only")]
        [Validation(Required=false)]
        public bool? RetryFailedOnly { get; set; }

        // retry_times
        [NameInMap("retry_times")]
        [Validation(Required=false)]
        public long? RetryTimes { get; set; }

        // timeout
        [NameInMap("timeout")]
        [Validation(Required=false)]
        public long? Timeout { get; set; }

    }

}
