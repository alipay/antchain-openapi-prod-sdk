// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateFileIntegrationResponse : TeaModel {
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

        // 存储的文件名称，完成存证阶段需传入
        [NameInMap("object_name")]
        [Validation(Required=false)]
        public string ObjectName { get; set; }

        // 文件上传的地址
        [NameInMap("upload_link")]
        [Validation(Required=false)]
        public string UploadLink { get; set; }

    }

}
