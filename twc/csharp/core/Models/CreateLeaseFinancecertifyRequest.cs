// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateLeaseFinancecertifyRequest : TeaModel {
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

        // 融资租赁合约id
        [NameInMap("application_id")]
        [Validation(Required=true)]
        public string ApplicationId { get; set; }

        // 直付通代扣协议号
        [NameInMap("agreement_no")]
        [Validation(Required=true)]
        public string AgreementNo { get; set; }

        // 还款类型
        [NameInMap("rental_return_type")]
        [Validation(Required=true)]
        public string RentalReturnType { get; set; }

        // 认证类型
        [NameInMap("certify_way")]
        [Validation(Required=true)]
        public string CertifyWay { get; set; }

        // 承租人姓名
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 承租人身份证
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 人脸识别认证id
        [NameInMap("certify_id")]
        [Validation(Required=true)]
        public string CertifyId { get; set; }

        // 承租人支付宝uid
        [NameInMap("alipay_uid")]
        [Validation(Required=true)]
        public string AlipayUid { get; set; }

        // 提前还款信息
        [NameInMap("rental_infos")]
        [Validation(Required=true)]
        public List<FinanceCertifyRentalInfo> RentalInfos { get; set; }

    }

}
