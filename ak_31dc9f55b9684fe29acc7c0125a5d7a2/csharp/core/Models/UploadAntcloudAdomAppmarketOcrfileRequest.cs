// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_31dc9f55b9684fe29acc7c0125a5d7a2.Models
{
    public class UploadAntcloudAdomAppmarketOcrfileRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 所购商品实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 文件名
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

    }

}
