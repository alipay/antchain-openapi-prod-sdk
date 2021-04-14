// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateLeaseZftagreementunsignRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 合约id
        [NameInMap("application_id")]
        [Validation(Required=true)]
        public string ApplicationId { get; set; }

        // 租赁方金融科技租户id
        [NameInMap("lease_id")]
        [Validation(Required=true)]
        public string LeaseId { get; set; }

        // 直付通网商模式代扣协议号
        [NameInMap("agreement_no")]
        [Validation(Required=true)]
        public string AgreementNo { get; set; }

        // 直付通代扣协议解约时间
        [NameInMap("unsign_time")]
        [Validation(Required=true)]
        public string UnsignTime { get; set; }

    }

}
