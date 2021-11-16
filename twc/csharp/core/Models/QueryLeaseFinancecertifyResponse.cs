// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryLeaseFinancecertifyResponse : TeaModel {
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

        // 核验结果
        [NameInMap("certify_result")]
        [Validation(Required=false)]
        public string CertifyResult { get; set; }

        // 1636600547
        [NameInMap("certify_time")]
        [Validation(Required=false)]
        public long? CertifyTime { get; set; }

        // 还款信息详情
        [NameInMap("rental_infos")]
        [Validation(Required=false)]
        public List<FinanceCertifyRentalInfo> RentalInfos { get; set; }

        // 错误码
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 错误码描述
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

    }

}
