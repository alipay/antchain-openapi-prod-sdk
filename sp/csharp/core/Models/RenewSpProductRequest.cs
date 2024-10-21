// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SP.Models
{
    public class RenewSpProductRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        [NameInMap("product_access_code")]
        [Validation(Required=false)]
        public string ProductAccessCode { get; set; }

        // 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
        [NameInMap("order_no")]
        [Validation(Required=true, MaxLength=64)]
        public string OrderNo { get; set; }

        // 产品码 全局唯一
        [NameInMap("product_code")]
        [Validation(Required=true, MaxLength=20)]
        public string ProductCode { get; set; }

        // 产品实例ID
        [NameInMap("instance_id")]
        [Validation(Required=true, MaxLength=50)]
        public string InstanceId { get; set; }

        // 服务接入码，商品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址。
        [NameInMap("access_code")]
        [Validation(Required=true, MaxLength=24)]
        public string AccessCode { get; set; }

        // 续签后，新的实例开始时间。时间使用UTC时间
        [NameInMap("renew_start_time")]
        [Validation(Required=false)]
        public string RenewStartTime { get; set; }

        // 续签后，新的实例结束时间。时间使用UTC时间
        [NameInMap("renew_end_time")]
        [Validation(Required=true)]
        public string RenewEndTime { get; set; }

    }

}
