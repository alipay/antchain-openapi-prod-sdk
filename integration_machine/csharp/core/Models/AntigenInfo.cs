// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTEGRATION_MACHINE.Models
{
    // 抗原信息
    public class AntigenInfo : TeaModel {
        // 抗原检测状态
        [NameInMap("antigen_result")]
        [Validation(Required=false)]
        public string AntigenResult { get; set; }

        // 抗原检测时间戳
        [NameInMap("antigen_timestamp")]
        [Validation(Required=false)]
        public long? AntigenTimestamp { get; set; }

    }

}
