// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OP.Models
{
    public class QueryApiserviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 产品码
        [NameInMap("provider")]
        [Validation(Required=true)]
        public string Provider { get; set; }

        // 套件
        [NameInMap("suite")]
        [Validation(Required=true)]
        public string Suite { get; set; }

        // api名字
        [NameInMap("api_name")]
        [Validation(Required=true)]
        public string ApiName { get; set; }

    }

}
