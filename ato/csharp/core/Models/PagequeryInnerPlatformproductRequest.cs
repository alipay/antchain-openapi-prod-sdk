// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class PagequeryInnerPlatformproductRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 分页参数
        [NameInMap("page_info")]
        [Validation(Required=false)]
        public PageQuery PageInfo { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 商品名称
        [NameInMap("product_name")]
        [Validation(Required=false)]
        public string ProductName { get; set; }

        // 一级分类
        [NameInMap("primary_category")]
        [Validation(Required=false)]
        public string PrimaryCategory { get; set; }

        // 二级分类
        [NameInMap("secondary_category")]
        [Validation(Required=false)]
        public string SecondaryCategory { get; set; }

        // 是否只展示已申请的通品
        [NameInMap("only_show_applied")]
        [Validation(Required=false)]
        public bool? OnlyShowApplied { get; set; }

    }

}
