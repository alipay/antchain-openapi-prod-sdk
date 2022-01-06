// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class RollbackDdcsDataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 当前租户 instanceId
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 回滚的属性的id
        [NameInMap("attribute_id")]
        [Validation(Required=true)]
        public long? AttributeId { get; set; }

        // 再需要强制回滚的时候，需要通过指定 uniqueId 来强制回滚哪一次推送
        [NameInMap("unique_id")]
        [Validation(Required=false)]
        public string UniqueId { get; set; }

        // 默认情况下，只能回滚最后一次推送。
        // 
        // 但是通过 force_rollback + unique_id 可以强制指定回滚某一次推送。风险较高，不建议使用。
        [NameInMap("force_rollback")]
        [Validation(Required=false)]
        public bool? ForceRollback { get; set; }

        // 回滚操作人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

    }

}
