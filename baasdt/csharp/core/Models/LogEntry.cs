// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 交易日志
    public class LogEntry : TeaModel {
        // 交易发起方
        [NameInMap("from")]
        [Validation(Required=true)]
        public string From { get; set; }

        // log信息
        [NameInMap("log_data")]
        [Validation(Required=true)]
        public string LogData { get; set; }

        // 交易接受方
        [NameInMap("to")]
        [Validation(Required=true)]
        public string To { get; set; }

        // 交易topic
        [NameInMap("topics")]
        [Validation(Required=true)]
        public List<string> Topics { get; set; }

    }

}
