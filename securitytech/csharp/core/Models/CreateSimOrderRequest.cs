// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class CreateSimOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备编号
        [NameInMap("device_id")]
        [Validation(Required=true)]
        public string DeviceId { get; set; }

        // sku id
        [NameInMap("sku_id")]
        [Validation(Required=true)]
        public string SkuId { get; set; }

        // 车辆sn号
        [NameInMap("sn")]
        [Validation(Required=false)]
        public string Sn { get; set; }

        // 颜色
        [NameInMap("color")]
        [Validation(Required=true)]
        public string Color { get; set; }

        // 登录态token
        [NameInMap("token")]
        [Validation(Required=true)]
        public string Token { get; set; }

    }

}
