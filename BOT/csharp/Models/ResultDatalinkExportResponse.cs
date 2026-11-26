// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ResultDatalinkExportResponse : TeaModel {
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

        // excel oss 地址
        [NameInMap("file_url")]
        [Validation(Required=false)]
        public string FileUrl { get; set; }

        // 返回数量列表
        [NameInMap("row_count")]
        [Validation(Required=false)]
        public long? RowCount { get; set; }

        // 是否截段
        [NameInMap("truncated")]
        [Validation(Required=false)]
        public bool? Truncated { get; set; }

        // 文件大小
        [NameInMap("file_size")]
        [Validation(Required=false)]
        public long? FileSize { get; set; }

        // 过期时刻
        [NameInMap("expire_time")]
        [Validation(Required=false)]
        public long? ExpireTime { get; set; }

        // sql 执行耗时 耗秒
        [NameInMap("sql_elapsed_ms")]
        [Validation(Required=false)]
        public long? SqlElapsedMs { get; set; }

        // 上传OSS耗时 耗秒
        [NameInMap("upload_elapsed_ms")]
        [Validation(Required=false)]
        public long? UploadElapsedMs { get; set; }

        // 运行状态 RUNNING： 运行中，SUCCESS： 成功，FAILED：失败
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 失败错误编码
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

        // 错误原因
        [NameInMap("error_message")]
        [Validation(Required=false)]
        public string ErrorMessage { get; set; }

    }

}
