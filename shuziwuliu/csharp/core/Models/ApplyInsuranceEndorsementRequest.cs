// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class ApplyInsuranceEndorsementRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 批单申请号
        [NameInMap("endorsement_apply_no")]
        [Validation(Required=true)]
        public string EndorsementApplyNo { get; set; }

        // 申请时间
        [NameInMap("endorsement_apply_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndorsementApplyDate { get; set; }

        // 保单号
        [NameInMap("insurance_number")]
        [Validation(Required=true)]
        public string InsuranceNumber { get; set; }

        // 保司编码
        [NameInMap("insurance_code")]
        [Validation(Required=true)]
        public string InsuranceCode { get; set; }

        // 批单保额，单位：元，最多两位小数
        [NameInMap("endorsement_apply_amount")]
        [Validation(Required=true)]
        public string EndorsementApplyAmount { get; set; }

        // [{"contentType":"INSURED_OBJECT","operateType":"ADD","content":{"insuranceObjectCode":"md00000003(标的类型:包裹)","objNo":"标的编号","logisticsNo":"物流单号","sellerID":"卖家ID","objName":"货物名称","objType":"货物类型","objAmount":"货物金额(元)","buyerID":"买家ID"}},{"contentType":"INSURED_OBJECT","operateType":"ADD","content":{"insuranceObjectCode":"md00000002(标的类型:入库单)","objNo":"标的编号","pkgInNo":"入库编号","merchantName":"商家","objName":"货物","objType":"货物类型","objCount":"货物数量","objAmount":"货物金额(元)","buyerID":""}}]
        [NameInMap("endorsement_apply_contents")]
        [Validation(Required=true)]
        public List<string> EndorsementApplyContents { get; set; }

    }

}
