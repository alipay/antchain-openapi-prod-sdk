// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYTC.Models
{
    public class DeleteCodeRelationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务类型
        [NameInMap("biz_type")]
        [Validation(Required=true, MaxLength=32)]
        public string BizType { get; set; }

        // 溯源码，代表该账户的唯一资源标识
        [NameInMap("code")]
        [Validation(Required=false, MaxLength=160)]
        public string Code { get; set; }

        // 关联信息记录唯一标识
        // 
        [NameInMap("unique_id")]
        [Validation(Required=true, MaxLength=64)]
        public string UniqueId { get; set; }

    }

}
