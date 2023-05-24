// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class PushDigitalcontentUsageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 内容id
        [NameInMap("content_id")]
        [Validation(Required=true)]
        public string ContentId { get; set; }

        // 设备id
        [NameInMap("device_id")]
        [Validation(Required=true)]
        public string DeviceId { get; set; }

        // 使用量，按次使用需要为数字
        [NameInMap("usage")]
        [Validation(Required=true)]
        public string Usage { get; set; }

        // 客户端幂等token
        [NameInMap("client_token")]
        [Validation(Required=true)]
        public string ClientToken { get; set; }

    }

}
