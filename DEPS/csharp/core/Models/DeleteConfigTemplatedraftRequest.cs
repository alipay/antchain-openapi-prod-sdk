// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class DeleteConfigTemplatedraftRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 要删除的应用参数模板 id
        [NameInMap("tpl_id")]
        [Validation(Required=false)]
        public string TplId { get; set; }

    }

}
