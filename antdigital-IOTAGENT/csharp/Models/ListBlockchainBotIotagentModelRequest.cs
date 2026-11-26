// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class ListBlockchainBotIotagentModelRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 可选能力位过滤（如 TEXT）；缺省返回全部启用模型，非法值 PARAM_INVALID 拒绝
        [NameInMap("capability")]
        [Validation(Required=false)]
        public string Capability { get; set; }

    }

}
