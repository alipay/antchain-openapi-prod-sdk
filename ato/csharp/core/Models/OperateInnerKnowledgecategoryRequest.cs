// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class OperateInnerKnowledgecategoryRequest : TeaModel {
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

        // 知识点数据库主键ids
        [NameInMap("ids")]
        [Validation(Required=true)]
        public List<long?> Ids { get; set; }

        // 提交(submit)、上线(online)、下线(offline)、撤回(withdraw)
        [NameInMap("operation")]
        [Validation(Required=true)]
        public string Operation { get; set; }

    }

}
