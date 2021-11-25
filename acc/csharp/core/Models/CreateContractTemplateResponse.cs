// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class CreateContractTemplateResponse : TeaModel {
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

        // 业务码，0表示成功
        // 
        [NameInMap("code")]
        [Validation(Required=false)]
        public long? Code { get; set; }

        // 业务码信息
        // 
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 模板ID
        // 
        [NameInMap("template_id")]
        [Validation(Required=false)]
        public string TemplateId { get; set; }

        // 文件直传地址，需要用此上传地址使用put方式上传文件，只有文件上传后模板才可用
        // 
        [NameInMap("upload_url")]
        [Validation(Required=false)]
        public string UploadUrl { get; set; }

    }

}
