// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 链上资产元信息
    public class ChainInsightAssetMeta : TeaModel {
        // 资产元信息链接
        [NameInMap("uri")]
        [Validation(Required=false)]
        public string Uri { get; set; }

        // 资产元信息
        [NameInMap("meta_data")]
        [Validation(Required=false)]
        public string MetaData { get; set; }

        // 资源类型：Image / Audio / Video / Unknown
        [NameInMap("resource_type")]
        [Validation(Required=true)]
        public string ResourceType { get; set; }

        // 资源详细数据，如图片、视频的链接
        [NameInMap("resource_data")]
        [Validation(Required=false)]
        public string ResourceData { get; set; }

    }

}
