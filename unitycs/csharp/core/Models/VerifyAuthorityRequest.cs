// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.UNITYCS.Models
{
    public class VerifyAuthorityRequest : TeaModel {
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

        // 用户id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 用户权限，默认值为USAGE_RIGHT
        [NameInMap("privilege")]
        [Validation(Required=false)]
        public string Privilege { get; set; }

    }

}
