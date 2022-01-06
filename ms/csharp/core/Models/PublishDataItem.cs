// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 推送数据记录，每个 cell 对应一个值
    public class PublishDataItem : TeaModel {
        // 推送目标 cell
        [NameInMap("cell")]
        [Validation(Required=false)]
        public string Cell { get; set; }

        // 推送值
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

    }

}
