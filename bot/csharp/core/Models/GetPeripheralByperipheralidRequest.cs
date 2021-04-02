// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class GetPeripheralByperipheralidRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 外围设备ID
        [NameInMap("peripheral_id")]
        [Validation(Required=true)]
        public string PeripheralId { get; set; }

        // 场景码
        // 
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

    }

}
