// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    public class UploadAuthAgreementResponse : TeaModel {
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

        // 访问id
        [NameInMap("access_id")]
        [Validation(Required=false)]
        public string AccessId { get; set; }

        // 策略
        [NameInMap("policy")]
        [Validation(Required=false)]
        public string Policy { get; set; }

        // 签名
        [NameInMap("signature")]
        [Validation(Required=false)]
        public string Signature { get; set; }

        // 目录
        [NameInMap("dir")]
        [Validation(Required=false)]
        public string Dir { get; set; }

        // 主机
        [NameInMap("host")]
        [Validation(Required=false)]
        public string Host { get; set; }

        // 过期时间
        [NameInMap("expire")]
        [Validation(Required=false)]
        public string Expire { get; set; }

        // 回调地址
        [NameInMap("callback")]
        [Validation(Required=false)]
        public string Callback { get; set; }

    }

}
