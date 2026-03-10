// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeCertificateLxRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 放款请求流水号
        [NameInMap("loan_req_no")]
        [Validation(Required=true)]
        public string LoanReqNo { get; set; }

        // 请求方代码
        [NameInMap("source_code")]
        [Validation(Required=false)]
        public string SourceCode { get; set; }

        // 文件类型，0结清证明
        // 1代偿凭证
        // 2放款凭证
        [NameInMap("file_type")]
        [Validation(Required=true)]
        public long? FileType { get; set; }

        // 申请日期，yyyy-MM-dd
        [NameInMap("apply_date")]
        [Validation(Required=true)]
        public string ApplyDate { get; set; }

        // 业务类型，
        // 1非乐花卡
        // 2乐花卡
        [NameInMap("business_type")]
        [Validation(Required=true)]
        public long? BusinessType { get; set; }

    }

}
