// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COLLABINV.Models
{
    public class QueryIndexresearchBrandindexRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 品牌码
        [NameInMap("brand_code")]
        [Validation(Required=false)]
        public string BrandCode { get; set; }

        // 店铺标签
        [NameInMap("shop_tag")]
        [Validation(Required=false)]
        public string ShopTag { get; set; }

        // 月份
        [NameInMap("month")]
        [Validation(Required=false)]
        public List<string> Month { get; set; }

        // 字段排序方式
        [NameInMap("sort")]
        [Validation(Required=false)]
        public List<string> Sort { get; set; }

        // page_info
        [NameInMap("page_info")]
        [Validation(Required=true)]
        public PageInfo PageInfo { get; set; }

    }

}
