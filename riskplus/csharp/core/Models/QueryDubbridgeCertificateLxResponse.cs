// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeCertificateLxResponse : TeaModel {
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

        // 返回码
        // 0：成功
        // 1：失败
        // 2：处理中
        // 99：系统异常
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 申请结果描述，失败原因，失败时必传
        [NameInMap("msg")]
        [Validation(Required=false)]
        public string Msg { get; set; }

        // 文件路径
        // 实时返回文件路径给到乐信，乐信去对应sftp路径上取，路径命名规则：download/2602/loanReqNo_文件类型.pdf
        // 若失败则返回失败原因到msg字段
        [NameInMap("file_path")]
        [Validation(Required=false)]
        public string FilePath { get; set; }

    }

}
