// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class PagequeryInnerNoticeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商户租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 分页
        [NameInMap("page_info")]
        [Validation(Required=true)]
        public PageQuery PageInfo { get; set; }

        // 是否未读
        [NameInMap("unread")]
        [Validation(Required=false)]
        public bool? Unread { get; set; }

    }

}
