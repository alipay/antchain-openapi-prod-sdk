// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class PagequeryInnerPromotionsceneRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 查询场景
        [NameInMap("page_info")]
        [Validation(Required=false)]
        public PageQuery PageInfo { get; set; }

        // 场景名称
        [NameInMap("scene_name")]
        [Validation(Required=false)]
        public string SceneName { get; set; }

    }

}
