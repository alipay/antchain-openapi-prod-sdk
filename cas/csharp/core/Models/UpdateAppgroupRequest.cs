// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class UpdateAppgroupRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 更新内容
        [NameInMap("domain")]
        [Validation(Required=true)]
        public AppDomainFlatten Domain { get; set; }

        // 应用分组id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

    }

}
