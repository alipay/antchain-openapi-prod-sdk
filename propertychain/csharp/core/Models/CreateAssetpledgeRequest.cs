// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    public class CreateAssetpledgeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 物权id
        [NameInMap("asset_id")]
        [Validation(Required=true)]
        public string AssetId { get; set; }

        // 资金方的id
        [NameInMap("lender_id")]
        [Validation(Required=true)]
        public string LenderId { get; set; }

        // 申请方的id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 融资协议
        [NameInMap("financial_protocol_id")]
        [Validation(Required=false)]
        public string FinancialProtocolId { get; set; }

        // 质押金额
        [NameInMap("value")]
        [Validation(Required=true)]
        public long? Value { get; set; }

        // 质押时长
        [NameInMap("duration")]
        [Validation(Required=true)]
        public long? Duration { get; set; }

    }

}
