// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class UploadIotsuccessProductSkillRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

        // 解码不超过10MiB（评审初值），不得包含目录穿越
        [NameInMap("content_base64")]
        [Validation(Required=true)]
        public string ContentBase64 { get; set; }

        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

    }

}
