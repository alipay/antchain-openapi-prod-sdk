// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class UpdateInnerKnowledgecategoryRequest : TeaModel {
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

        // 主键id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 	
        // 类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 问题
        [NameInMap("question")]
        [Validation(Required=true)]
        public string Question { get; set; }

        // 	
        // 答案
        [NameInMap("answer")]
        [Validation(Required=true)]
        public string Answer { get; set; }

        // 是否选择订单
        // 
        [NameInMap("has_order")]
        [Validation(Required=false)]
        public bool? HasOrder { get; set; }

        // 是否带小程序跳转链接
        // 
        [NameInMap("has_app_link")]
        [Validation(Required=false)]
        public bool? HasAppLink { get; set; }

        // 是否选择人工
        [NameInMap("has_manual")]
        [Validation(Required=false)]
        public bool? HasManual { get; set; }

    }

}
