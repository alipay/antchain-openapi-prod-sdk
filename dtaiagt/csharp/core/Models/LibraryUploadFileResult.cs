// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // 知识库文件上传响应Result
    public class LibraryUploadFileResult : TeaModel {
        // 请求处理结果标识
        [NameInMap("success")]
        [Validation(Required=true)]
        public bool? Success { get; set; }

        // 业务状态码
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 返回消息
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

        // 请求链路追踪ID
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

        // 文件上传响应对象
        [NameInMap("result")]
        [Validation(Required=true)]
        public UploadAttachmentFileVO Result { get; set; }

    }

}
