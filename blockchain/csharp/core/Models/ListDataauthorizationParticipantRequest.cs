// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class ListDataauthorizationParticipantRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 空间ID
        [NameInMap("space_id")]
        [Validation(Required=false)]
        public string SpaceId { get; set; }

        // 用户角色
        [NameInMap("role")]
        [Validation(Required=true)]
        public string Role { get; set; }

    }

}
