// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // Agent对话-上传文件 Result
    public class UploadAttachmentFileResult : TeaModel {
        // success
        [NameInMap("success")]
        [Validation(Required=true)]
        public bool? Success { get; set; }

        // code
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // msg
        [NameInMap("msg")]
        [Validation(Required=true)]
        public string Msg { get; set; }

        // trace_id
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

        // req_id
        [NameInMap("req_id")]
        [Validation(Required=true)]
        public string ReqId { get; set; }

        // 上传解析结果
        // 
        [NameInMap("result")]
        [Validation(Required=true)]
        public UploadAttachmentFileVO Result { get; set; }

    }

}
