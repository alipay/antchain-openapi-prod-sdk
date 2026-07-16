// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryInnerInsuresignResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 商户社会统一信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

        // 保司社会统一信用代码
        [NameInMap("insure_merchant_id")]
        [Validation(Required=false)]
        public string InsureMerchantId { get; set; }

        // 外部代扣协议号
        [NameInMap("external_agreement_no")]
        [Validation(Required=false)]
        public string ExternalAgreementNo { get; set; }

        // 合同未签署：CONTRACT_UN_SIGNED
        // 合同已签署：CONTRACT_SIGNED
        // 代扣已签署：WITHHOLD_SIGNED
        // 代扣已解约：WITHHOLD_UN_SIGNED
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
