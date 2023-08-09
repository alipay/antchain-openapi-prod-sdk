// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SAAS.Models
{
    public class QueryAbilityWithapinameRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // api名称列表
        [NameInMap("api_name_list")]
        [Validation(Required=true)]
        public List<string> ApiNameList { get; set; }

    }

}
