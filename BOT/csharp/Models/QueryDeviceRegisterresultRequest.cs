// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryDeviceRegisterresultRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备SN，可以传deviceSn和corpName，或者deviceDid，都传的以deviceDid为准
        [NameInMap("device_sn")]
        [Validation(Required=false)]
        public string DeviceSn { get; set; }

        // 设备厂商名称，可以传deviceSn和corpName，或者deviceDid，都传的以deviceDid为准
        [NameInMap("corp_name")]
        [Validation(Required=false)]
        public string CorpName { get; set; }

        // 设备did，可以传deviceSn和corpName，或者deviceDid，都传的以deviceDid为准
        [NameInMap("device_did")]
        [Validation(Required=false)]
        public string DeviceDid { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

    }

}
