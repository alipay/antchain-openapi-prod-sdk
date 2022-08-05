// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDIGITAL.Models
{
    // AssetUri中多组资源信息
    public class ResourceBundle : TeaModel {
        // 可公开访问的资源地址
        [NameInMap("uri")]
        [Validation(Required=true)]
        public string Uri { get; set; }

        // 上传资源时指定的资源类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 资源描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

    }

}
