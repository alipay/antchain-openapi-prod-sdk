// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartAuthDataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 调用方生成的请求id，需保证唯一
        [NameInMap("auth_id")]
        [Validation(Required=true)]
        public string AuthId { get; set; }

        // 调用方请求的数据类型
        [NameInMap("data_type")]
        [Validation(Required=true)]
        public string DataType { get; set; }

        // 授权结果通知调用方的方式
        [NameInMap("callback_type")]
        [Validation(Required=true)]
        public string CallbackType { get; set; }

        // 授权结果通知调用方的地址
        [NameInMap("callback_url")]
        [Validation(Required=true)]
        public string CallbackUrl { get; set; }

    }

}
