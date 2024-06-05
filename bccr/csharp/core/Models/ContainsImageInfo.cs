// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 作品是否包含图片
    public class ContainsImageInfo : TeaModel {
        // 是否包含图片
        [NameInMap("contains_image")]
        [Validation(Required=false)]
        public bool? ContainsImage { get; set; }

        // 包含图片，处理后的图片副件
        [NameInMap("resolved_file_url")]
        [Validation(Required=false)]
        public string ResolvedFileUrl { get; set; }

    }

}
