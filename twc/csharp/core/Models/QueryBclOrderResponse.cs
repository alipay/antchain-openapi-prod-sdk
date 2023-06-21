// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryBclOrderResponse : TeaModel {
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

        // 订单信息
        [NameInMap("order_info")]
        [Validation(Required=false)]
        public BclOrderInfo OrderInfo { get; set; }

        // 实人信息
        [NameInMap("certify_info")]
        [Validation(Required=false)]
        public BclCertifyInfo CertifyInfo { get; set; }

        // 风控 决策分数
        [NameInMap("risk_score")]
        [Validation(Required=false)]
        public string RiskScore { get; set; }

        // 用户身份信息和支付宝id的核验
        // 匹配，PASS
        // 不匹配，UN_PASS
        [NameInMap("identity_verification")]
        [Validation(Required=false)]
        public string IdentityVerification { get; set; }

        // 合同信息
        [NameInMap("contract_info")]
        [Validation(Required=false)]
        public BclContractInfo ContractInfo { get; set; }

        // 承诺信息
        [NameInMap("promise_info")]
        [Validation(Required=false)]
        public BclPromiseInfo PromiseInfo { get; set; }

        // 履约详情
        [NameInMap("rental_infos")]
        [Validation(Required=false)]
        public List<BclRentalInfo> RentalInfos { get; set; }

        // 物流信息
        [NameInMap("logistics_infos")]
        [Validation(Required=false)]
        public List<BclLogisticsInfo> LogisticsInfos { get; set; }

        // 存证信息
        [NameInMap("notary_infos")]
        [Validation(Required=false)]
        public List<BclNotaryInfo> NotaryInfos { get; set; }

    }

}
