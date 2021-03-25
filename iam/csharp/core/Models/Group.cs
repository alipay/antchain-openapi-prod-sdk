// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    // 成员组
    public class Group : TeaModel {
        // 成员组ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 成员组名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 成员组描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

    }

}
