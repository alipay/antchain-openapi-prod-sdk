// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class ChargeInnerAgreementterminateevidenceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 订单 id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 解约申请 id
        [NameInMap("terminate_apply_id")]
        [Validation(Required=true)]
        public string TerminateApplyId { get; set; }

        // 支付宝系统中用以唯一标识用户签约记录的编号
        [NameInMap("agreement_no")]
        [Validation(Required=false)]
        public string AgreementNo { get; set; }

        // 代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）
        [NameInMap("external_agreement_no")]
        [Validation(Required=false)]
        public string ExternalAgreementNo { get; set; }

        // 商家补充拒绝原因
        [NameInMap("merchant_refuse_reason")]
        [Validation(Required=false)]
        public string MerchantRefuseReason { get; set; }

        // 商家补充拒绝举证材料
        [NameInMap("merchant_refuse_evidences")]
        [Validation(Required=false)]
        public List<string> MerchantRefuseEvidences { get; set; }

    }

}
