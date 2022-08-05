// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BBP.Models
{
    public class QueryInsuranceChainResponse : TeaModel {
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

        // 保司编码
        [NameInMap("merchanism_code")]
        [Validation(Required=false)]
        public string MerchanismCode { get; set; }

        // 订单来源 TIANMAO
        [NameInMap("source")]
        [Validation(Required=false)]
        public string Source { get; set; }

        // 保险类型
        [NameInMap("insurace_type")]
        [Validation(Required=false)]
        public string InsuraceType { get; set; }

        // 保单加密信息（加密数据，由保司持有密钥）
        [NameInMap("insurance_context")]
        [Validation(Required=false)]
        public string InsuranceContext { get; set; }

        // 退保保单信息（加密数据，由保司持有密钥）
        [NameInMap("insurance_claim_context")]
        [Validation(Required=false)]
        public string InsuranceClaimContext { get; set; }

        // 保单理赔信息（加密数据，由保司持有密钥）
        [NameInMap("insurance_surrender_context")]
        [Validation(Required=false)]
        public string InsuranceSurrenderContext { get; set; }

    }

}
