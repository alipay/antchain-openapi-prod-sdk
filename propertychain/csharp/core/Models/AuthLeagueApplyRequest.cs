// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    public class AuthLeagueApplyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 申请Id
        [NameInMap("apply_id")]
        [Validation(Required=true)]
        public string ApplyId { get; set; }

        // 申请类型【NONE,JOIN,CREATE,ALL】
        [NameInMap("apply_type")]
        [Validation(Required=true)]
        public string ApplyType { get; set; }

        // 备注
        [NameInMap("comment")]
        [Validation(Required=false)]
        public string Comment { get; set; }

        // 审核结果
        [NameInMap("pass")]
        [Validation(Required=true)]
        public bool? Pass { get; set; }

    }

}
