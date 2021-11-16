// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class InitPrivatecontractIntanceResponse : TeaModel {
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

        // 私有化服务实例ID
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 签名私钥的base64格式字符串
        [NameInMap("private_key")]
        [Validation(Required=false)]
        public string PrivateKey { get; set; }

        // 验签公钥的base64格式字符串
        [NameInMap("public_key")]
        [Validation(Required=false)]
        public string PublicKey { get; set; }

        // 回调使用的签名私钥
        [NameInMap("private_key_callback")]
        [Validation(Required=false)]
        public string PrivateKeyCallback { get; set; }

        // 回调使用的验签公钥
        [NameInMap("public_key_callback")]
        [Validation(Required=false)]
        public string PublicKeyCallback { get; set; }

    }

}
