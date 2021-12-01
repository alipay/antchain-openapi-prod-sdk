// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryTlsnotaryTaskResponse : TeaModel {
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

        // 唯一的业务 tlsnotary 任务 id
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

        // tlsnotary任务执行状态
        [NameInMap("state")]
        [Validation(Required=false)]
        public long? State { get; set; }

        // 上传文件oss链接
        [NameInMap("upload_oss_links")]
        [Validation(Required=false)]
        public TlsnotaryUploadOssLinks UploadOssLinks { get; set; }

        // 业务错误码
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public long? ErrorCode { get; set; }

        // 业务错误信息
        [NameInMap("error_msg")]
        [Validation(Required=false)]
        public string ErrorMsg { get; set; }

    }

}
