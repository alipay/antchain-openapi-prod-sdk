// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVE.Models
{
    // 生图任务， 图片 URL 列表
    public class ImageUrlsList : TeaModel {
        // 图片 URL 列表
        [NameInMap("image_urls")]
        [Validation(Required=false)]
        public List<string> ImageUrls { get; set; }

    }

}
