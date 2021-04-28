// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateLeaseZftagreementsignRequest : TeaModel {
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

        // 网商直付通代扣协议号
        [NameInMap("agreement_no")]
        [Validation(Required=true)]
        public string AgreementNo { get; set; }

        // 实际签署协议的用户支付宝uid
        [NameInMap("alipay_user_id")]
        [Validation(Required=false)]
        public string AlipayUserId { get; set; }

        // 签署时间
        [NameInMap("sign_time")]
        [Validation(Required=false)]
        public string SignTime { get; set; }

        // 协议生效时间
        [NameInMap("valid_time")]
        [Validation(Required=false)]
        public string ValidTime { get; set; }

        // 协议失效时间
        [NameInMap("invalid_time")]
        [Validation(Required=false)]
        public string InvalidTime { get; set; }

        // 租赁方金融科技租户id
        [NameInMap("lease_id")]
        [Validation(Required=true)]
        public string LeaseId { get; set; }

        // 核验结果，1表示通过，-1表示不通过
        [NameInMap("agreement_status")]
        [Validation(Required=true)]
        public long? AgreementStatus { get; set; }

        // 租赁机构支付宝uid
        [NameInMap("lease_corp_alipay_uid")]
        [Validation(Required=false)]
        public string LeaseCorpAlipayUid { get; set; }

        // 直付通代扣协议核验结果说明
        [NameInMap("fail_message")]
        [Validation(Required=false)]
        public string FailMessage { get; set; }

    }

}
