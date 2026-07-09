// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class UpdateThingsdidStatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 交易唯一ID
        [NameInMap("nonce")]
        [Validation(Required=true)]
        public string Nonce { get; set; }

        // 状态取如下状态，注册设备身份，默认处于STATUS_REGISTERED，
        // 要更新为STATUS_COMMAND_STOP的设备必须处于STATUS_COMMAND_START，
        // 更新为STATUS_COMMAND_UNREGISTER后，无法更新为其他状态。
        // STATUS_COMMAND_UNREGISTER(注销),
        // STATUS_COMMAND_START(启用),
        // STATUS_COMMAND_STOP(),
        // STATUS_REGISTERED(3),
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 需要更新的实体did
        [NameInMap("thing_did")]
        [Validation(Required=true)]
        public string ThingDid { get; set; }

    }

}
