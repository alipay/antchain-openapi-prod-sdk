// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class QuerySimSkuRequest : TeaModel {
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

        // 车辆SN，与skuId二选一
        [NameInMap("sn")]
        [Validation(Required=false)]
        public string Sn { get; set; }

        // sku对外id列表，与sn二选一
        [NameInMap("sku_id_list")]
        [Validation(Required=false)]
        public List<string> SkuIdList { get; set; }

        // 登录态token
        [NameInMap("token")]
        [Validation(Required=true)]
        public string Token { get; set; }

    }

}
