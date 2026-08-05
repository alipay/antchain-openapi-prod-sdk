// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryTrustiotMiniappRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 友宝跳转流水号
        [NameInMap("trace_no")]
        [Validation(Required=true)]
        public string TraceNo { get; set; }

        // 本次授权设备清单，可包含多个 scene
        [NameInMap("device_scope")]
        [Validation(Required=true)]
        public List<DeviceScopeItem> DeviceScope { get; set; }

    }

}
