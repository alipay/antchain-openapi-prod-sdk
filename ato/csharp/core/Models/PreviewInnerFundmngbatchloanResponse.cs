// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class PreviewInnerFundmngbatchloanResponse : TeaModel {
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

        //  同意放款数量
        [NameInMap("agree_loan_count")]
        [Validation(Required=false)]
        public long? AgreeLoanCount { get; set; }

        // 拒绝放款数量
        [NameInMap("reject_loan_count")]
        [Validation(Required=false)]
        public long? RejectLoanCount { get; set; }

        // 导入失败数量
        [NameInMap("import_fail_count")]
        [Validation(Required=false)]
        public long? ImportFailCount { get; set; }

        // 预览结果文件
        [NameInMap("file_url")]
        [Validation(Required=false)]
        public string FileUrl { get; set; }

    }

}
