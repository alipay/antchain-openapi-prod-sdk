// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AIIDENTIFY.Models
{
    public class QueryIdentifypointRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 品类名称
        [NameInMap("category_name")]
        [Validation(Required=true)]
        public string CategoryName { get; set; }

        // 品牌名称
        [NameInMap("brand_name")]
        [Validation(Required=true)]
        public string BrandName { get; set; }

        // 款式名称
        [NameInMap("style_name")]
        [Validation(Required=true)]
        public string StyleName { get; set; }

    }

}
