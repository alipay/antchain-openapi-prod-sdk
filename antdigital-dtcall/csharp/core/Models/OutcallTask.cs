// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTCALL.Models
{
    // 外呼任务简单对象
    public class OutcallTask : TeaModel {
        // 任务编码
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 任务名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
