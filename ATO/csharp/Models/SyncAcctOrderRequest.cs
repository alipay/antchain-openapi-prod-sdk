// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SyncAcctOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 平台传入的签约单号
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 平台商统一社会信用代码
        [NameInMap("platform_id")]
        [Validation(Required=true)]
        public string PlatformId { get; set; }

        // 平台商名称
        [NameInMap("platform_name")]
        [Validation(Required=true)]
        public string PlatformName { get; set; }

        // 签约单信息，JSON字符串，参考后文 OrderInfoRequest 定义
        [NameInMap("order_info")]
        [Validation(Required=true)]
        public string OrderInfo { get; set; }

        // 卖家信息，JSON字符串，参考后文 UserInfoRequest 定义
        [NameInMap("user_info")]
        [Validation(Required=true)]
        public string UserInfo { get; set; }

    }

}
