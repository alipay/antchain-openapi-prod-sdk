// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class JudgeAuthorityRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 操作点id
        [NameInMap("action_id")]
        [Validation(Required=true)]
        public string ActionId { get; set; }

        // 鉴权条件
        [NameInMap("conditions")]
        [Validation(Required=false)]
        public List<Condition> Conditions { get; set; }

        // 鉴权对象id
        [NameInMap("operator_id")]
        [Validation(Required=true)]
        public string OperatorId { get; set; }

    }

}
