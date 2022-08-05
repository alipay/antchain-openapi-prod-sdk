// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDIGITAL.Models
{
    public class CreateResourcePolicyResponse : TeaModel {
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

        // 最终上传至服务端的实际文件名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 用户请求的AccessKey ID
        [NameInMap("accessid")]
        [Validation(Required=false)]
        public string Accessid { get; set; }

        // 用户发送上传请求的域名。
        [NameInMap("host")]
        [Validation(Required=false)]
        public string Host { get; set; }

        // 用户表单上传的策略（Policy），Policy为经过Ba...
        [NameInMap("policy")]
        [Validation(Required=false)]
        public string Policy { get; set; }

        // 对Policy签名后的字符串
        [NameInMap("signature")]
        [Validation(Required=false)]
        public string Signature { get; set; }

        // 由服务器端指定的Policy过期时间，格式为Unix时间戳
        [NameInMap("expire")]
        [Validation(Required=false)]
        public string Expire { get; set; }

        // 文件类型
        [NameInMap("mime_type")]
        [Validation(Required=false)]
        public string MimeType { get; set; }

        // 	
        // 限制上传的文件名称
        [NameInMap("dir")]
        [Validation(Required=false)]
        public string Dir { get; set; }

    }

}
