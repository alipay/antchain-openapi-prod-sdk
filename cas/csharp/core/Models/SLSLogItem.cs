// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 阿里云日志服务(SLS) - 日志结果数组
    public class SLSLogItem : TeaModel {
        // 日志的时间戳（精度为秒，从 1970-1-1 00:00:00 UTC 计算起的秒数）。
        [NameInMap("log_time")]
        [Validation(Required=true)]
        public long? LogTime { get; set; }

        // 日志的来源，写入日志时指定。
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 日志原始内容
        [NameInMap("contents")]
        [Validation(Required=true)]
        public List<SLSLogContent> Contents { get; set; }

    }

}
