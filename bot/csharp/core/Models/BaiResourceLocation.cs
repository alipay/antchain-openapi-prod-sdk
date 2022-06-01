// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 资源定位信息
    public class BaiResourceLocation : TeaModel {
        // 资源定位类型
        // HTTP_URL：资源url
        // STRING_BASE64：资源base64字符串（不带base64头部）
        [NameInMap("location_type")]
        [Validation(Required=true)]
        public string LocationType { get; set; }

        // 资源定位值
        [NameInMap("location_value")]
        [Validation(Required=true)]
        public string LocationValue { get; set; }

    }

}
