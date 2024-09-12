// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.UNITYCS.Models
{
    public class CreateDepositRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 元数据编码
        [NameInMap("metadata_code")]
        [Validation(Required=true)]
        public string MetadataCode { get; set; }

        // 基础信息json
        [NameInMap("base_info_json")]
        [Validation(Required=true)]
        public string BaseInfoJson { get; set; }

    }

}
