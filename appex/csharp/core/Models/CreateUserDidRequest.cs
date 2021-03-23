// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    public class CreateUserDidRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 联盟标识（联盟ID）
        [NameInMap("union_id")]
        [Validation(Required=true)]
        public long? UnionId { get; set; }

        // 参与方的业务类型，如仓库WMS, 电商平台PSP，银行BANK
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
