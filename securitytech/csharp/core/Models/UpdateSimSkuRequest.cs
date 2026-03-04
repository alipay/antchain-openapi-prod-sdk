// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class UpdateSimSkuRequest : TeaModel {
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

        // 登录态token
        [NameInMap("token")]
        [Validation(Required=true)]
        public string Token { get; set; }

        // 更改价格的skuId
        [NameInMap("sku_id")]
        [Validation(Required=true)]
        public string SkuId { get; set; }

        // sku门店价格，单位元
        [NameInMap("store_amount")]
        [Validation(Required=true)]
        public string StoreAmount { get; set; }

    }

}
