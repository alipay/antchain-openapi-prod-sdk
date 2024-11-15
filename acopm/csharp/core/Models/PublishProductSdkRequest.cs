// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    public class PublishProductSdkRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 产品码
        [NameInMap("prod_code")]
        [Validation(Required=true)]
        public string ProdCode { get; set; }

        // 版本号。生成的sdk的最终版本号格式为<publish_version>.<platform_origin>
        [NameInMap("publish_version")]
        [Validation(Required=true)]
        public string PublishVersion { get; set; }

        // sdk发布请求来源。生成的sdk的最终版本号格式为<publish_version>.<platform_origin>。
        [NameInMap("platform_origin")]
        [Validation(Required=true)]
        public string PlatformOrigin { get; set; }

    }

}
