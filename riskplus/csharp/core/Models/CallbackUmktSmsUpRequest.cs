// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class CallbackUmktSmsUpRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 回执类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 手机号码
        [NameInMap("phone_number")]
        [Validation(Required=true)]
        public string PhoneNumber { get; set; }

        // 发送时间
        [NameInMap("send_time")]
        [Validation(Required=true)]
        public string SendTime { get; set; }

        // 发送内容
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 签名信息
        [NameInMap("sign_name")]
        [Validation(Required=true)]
        public string SignName { get; set; }

        // 签名对应的客户ak
        [NameInMap("app_key")]
        [Validation(Required=true)]
        public string AppKey { get; set; }

        // 上行短信扩展号码
        [NameInMap("dest_code")]
        [Validation(Required=false)]
        public string DestCode { get; set; }

        // 学历噩耗
        [NameInMap("sequence_id")]
        [Validation(Required=true)]
        public long? SequenceId { get; set; }

    }

}
