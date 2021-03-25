// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class RemoveGroupMemberRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 成员组ID
        [NameInMap("group_id")]
        [Validation(Required=true)]
        public string GroupId { get; set; }

        // 操作员ID
        [NameInMap("operator_ids")]
        [Validation(Required=true)]
        public List<string> OperatorIds { get; set; }

    }

}
