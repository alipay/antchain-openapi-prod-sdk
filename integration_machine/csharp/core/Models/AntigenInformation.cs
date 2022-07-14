// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTEGRATION_MACHINE.Models
{
    // 抗原信息
    public class AntigenInformation : TeaModel {
        // 抗原结果
        [NameInMap("antigen_result")]
        [Validation(Required=true)]
        public string AntigenResult { get; set; }

        // 抗原时间
        [NameInMap("antigen_time")]
        [Validation(Required=true)]
        public string AntigenTime { get; set; }

    }

}
