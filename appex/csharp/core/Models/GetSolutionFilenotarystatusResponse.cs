// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    public class GetSolutionFilenotarystatusResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 存证是否接受
        // 
        [NameInMap("accepted")]
        [Validation(Required=false)]
        public bool? Accepted { get; set; }

        // 存证拒绝原因
        // 
        [NameInMap("denied_reason")]
        [Validation(Required=false)]
        public string DeniedReason { get; set; }

        // 文件存证id
        // 
        [NameInMap("file_notary_id")]
        [Validation(Required=false)]
        public string FileNotaryId { get; set; }

        // 存证是否完成
        [NameInMap("finished")]
        [Validation(Required=false)]
        public bool? Finished { get; set; }

        // 存证哈希，存证未完成时为空
        // 
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

    }

}
