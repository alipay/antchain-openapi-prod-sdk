// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 客户自定义实体
    public class CustomEntityInfo : TeaModel {
        // 客户自定义实体类型，默认为JSSDK_ACCOUNT
        [NameInMap("customer_entity_type")]
        [Validation(Required=true)]
        public string CustomerEntityType { get; set; }

        // 客户自定义实体内容
        [NameInMap("customer_entity_content")]
        [Validation(Required=true)]
        public string CustomerEntityContent { get; set; }

    }

}
