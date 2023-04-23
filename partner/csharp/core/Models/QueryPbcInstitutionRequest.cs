// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    public class QueryPbcInstitutionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 机构名称关键字
        [NameInMap("inst_name")]
        [Validation(Required=true)]
        public string InstName { get; set; }

    }

}
