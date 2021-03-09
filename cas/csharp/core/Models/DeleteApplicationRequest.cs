// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class DeleteApplicationRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 欲删除的应用 id
        [NameInMap("application_ids")]
        [Validation(Required=false)]
        public List<string> ApplicationIds { get; set; }

        // 是否删除绑定的代码库。默认为 false
        [NameInMap("delete_code_repo")]
        [Validation(Required=false)]
        public bool? DeleteCodeRepo { get; set; }

    }

}
