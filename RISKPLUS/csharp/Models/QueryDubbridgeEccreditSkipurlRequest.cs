// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeEccreditSkipurlRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务场景码
        [NameInMap("business_scene")]
        [Validation(Required=true)]
        public string BusinessScene { get; set; }

        // 交易流水号
        [NameInMap("transaction_no")]
        [Validation(Required=true)]
        public string TransactionNo { get; set; }

        // 客户申请提交后，该笔申请对应的银行内部流水号，一直到客户签约完成都是这个流水号。
        [NameInMap("apply_no")]
        [Validation(Required=false)]
        public string ApplyNo { get; set; }

        // 企业信息
        [NameInMap("enterprise_info")]
        [Validation(Required=false)]
        public EcEnterpriseInfo EnterpriseInfo { get; set; }

        // 申请人信息
        [NameInMap("applicant_person_info")]
        [Validation(Required=false)]
        public EcApplicantPersonInfo ApplicantPersonInfo { get; set; }

        // 操作类型
        [NameInMap("operate_type")]
        [Validation(Required=true)]
        public string OperateType { get; set; }

    }

}
