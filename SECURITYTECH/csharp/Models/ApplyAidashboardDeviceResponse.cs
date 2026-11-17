// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class ApplyAidashboardDeviceResponse : TeaModel {
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

        // 设备唯一ID
        [NameInMap("uuid")]
        [Validation(Required=false)]
        public string Uuid { get; set; }

        // 服务端公钥
        [NameInMap("server_pub_key")]
        [Validation(Required=false)]
        public string ServerPubKey { get; set; }

        // 证书信息
        [NameInMap("cert_data")]
        [Validation(Required=false)]
        public string CertData { get; set; }

        // 证书签名
        [NameInMap("cert_sign")]
        [Validation(Required=false)]
        public string CertSign { get; set; }

        // 响应签名
        [NameInMap("response_sign")]
        [Validation(Required=false)]
        public string ResponseSign { get; set; }

    }

}
