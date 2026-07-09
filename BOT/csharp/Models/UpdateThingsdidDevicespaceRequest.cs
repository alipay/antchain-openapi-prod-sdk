// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class UpdateThingsdidDevicespaceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 参考结构体定义
        [NameInMap("update_device_space_req")]
        [Validation(Required=true)]
        public UpdateDeviceSpaceReq UpdateDeviceSpaceReq { get; set; }

        // 交易唯一ID
        [NameInMap("nonce")]
        [Validation(Required=true)]
        public string Nonce { get; set; }

    }

}
