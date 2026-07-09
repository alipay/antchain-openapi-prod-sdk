// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class RegisterCarkeyscorpCustomerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 对应客户企业名称缩写
        [NameInMap("corp_value")]
        [Validation(Required=true)]
        public string CorpValue { get; set; }

        // 企业全称
        [NameInMap("customer_name")]
        [Validation(Required=true)]
        public string CustomerName { get; set; }

        // 接入场景码 内部分配给客户
        [NameInMap("access_scene")]
        [Validation(Required=true)]
        public string AccessScene { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

    }

}
