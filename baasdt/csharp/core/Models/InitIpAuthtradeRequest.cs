// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class InitIpAuthtradeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础请求参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // 采购者的链上账户Id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // IP授权交易时传入IP ID；增值服务交易时传入服务ID
        [NameInMap("ip_id")]
        [Validation(Required=true)]
        public string IpId { get; set; }

        // 0 IP交易，1 增值服务交易
        [NameInMap("goods_type")]
        [Validation(Required=false)]
        public long? GoodsType { get; set; }

        // 申请授权合作的备注信息
        [NameInMap("apply_info")]
        [Validation(Required=true)]
        public IPOrderApplyInfo ApplyInfo { get; set; }

    }

}
