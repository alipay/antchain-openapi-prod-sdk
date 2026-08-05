// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryElectrocarDeviceotamoduleversionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备定位基准：TUID / TRUST_DEVICE_ID / TRUST_PRODUCT_DEVICE
        [NameInMap("locator_type")]
        [Validation(Required=true)]
        public string LocatorType { get; set; }

        // EKYT 全局唯一设备 ID
        [NameInMap("tuid")]
        [Validation(Required=false)]
        public string Tuid { get; set; }

        // 可信设备唯一id
        [NameInMap("trust_device_id")]
        [Validation(Required=false)]
        public string TrustDeviceId { get; set; }

        // 可信唯一产品标识
        [NameInMap("trust_product_key")]
        [Validation(Required=false)]
        public string TrustProductKey { get; set; }

        // 设备名称
        [NameInMap("device_name")]
        [Validation(Required=false)]
        public string DeviceName { get; set; }

    }

}
