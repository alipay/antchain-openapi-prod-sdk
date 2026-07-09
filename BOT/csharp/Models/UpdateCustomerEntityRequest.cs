// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class UpdateCustomerEntityRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码，由蚂蚁提供
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 实体ID
        // 
        [NameInMap("entity_id")]
        [Validation(Required=true)]
        public string EntityId { get; set; }

        // 实体名称, 例如：服务区A地理围栏
        [NameInMap("entity_name")]
        [Validation(Required=true)]
        public string EntityName { get; set; }

        // 实体内容 , 类型为字符串
        // 
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

    }

}
