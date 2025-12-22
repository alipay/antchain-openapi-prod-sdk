// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ApplyTechintegrationSkushipemptymodelbyuidRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码
        [NameInMap("vendor_id")]
        [Validation(Required=true)]
        public string VendorId { get; set; }

        // 设备型号
        [NameInMap("product_id")]
        [Validation(Required=true)]
        public string ProductId { get; set; }

        // 设备SN号
        [NameInMap("device_id")]
        [Validation(Required=true)]
        public string DeviceId { get; set; }

        // 产品类型
        [NameInMap("product_type")]
        [Validation(Required=false)]
        public long? ProductType { get; set; }

        // 凭证种类，高八位表示是否下发凭证，低八位表示安全方案
        [NameInMap("cert_type")]
        [Validation(Required=false)]
        public long? CertType { get; set; }

        // id2 authCode
        [NameInMap("id2")]
        [Validation(Required=false)]
        public string Id2 { get; set; }

    }

}
