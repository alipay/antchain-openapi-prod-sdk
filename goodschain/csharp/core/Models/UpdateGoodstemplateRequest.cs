// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GOODSCHAIN.Models
{
    public class UpdateGoodstemplateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 模板id
        [NameInMap("template_id")]
        [Validation(Required=true)]
        public string TemplateId { get; set; }

        // 商品定义描述，格式如示例
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

    }

}
