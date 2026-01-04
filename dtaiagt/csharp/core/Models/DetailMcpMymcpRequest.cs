// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    public class DetailMcpMymcpRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 空间id
        [NameInMap("space_id")]
        [Validation(Required=true)]
        public string SpaceId { get; set; }

        // 平台serverId
        [NameInMap("server_id")]
        [Validation(Required=true)]
        public string ServerId { get; set; }

    }

}
