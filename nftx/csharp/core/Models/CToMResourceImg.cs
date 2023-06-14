// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTX.Models
{
    // 资源图片
    public class CToMResourceImg : TeaModel {
        // 预览图
        [NameInMap("thumbnail_url")]
        [Validation(Required=true)]
        public string ThumbnailUrl { get; set; }

        // 高清图
        [NameInMap("high_definition_url")]
        [Validation(Required=true)]
        public string HighDefinitionUrl { get; set; }

        // key
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

    }

}
