// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 标签图片
    public class RtopTagImage : TeaModel {
        // 标签图片表主键
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 图片
        [NameInMap("image")]
        [Validation(Required=false)]
        public string Image { get; set; }

    }

}
