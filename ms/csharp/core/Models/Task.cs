// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 调度任务
    public class Task : TeaModel {
        [NameInMap("cronexp")]
        [Validation(Required=false)]
        public string Cronexp { get; set; }

        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        [NameInMap("system")]
        [Validation(Required=false)]
        public string System { get; set; }

    }

}
