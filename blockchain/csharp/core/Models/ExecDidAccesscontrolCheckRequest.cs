// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class ExecDidAccesscontrolCheckRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 发起鉴权请求的did
        [NameInMap("fromdid")]
        [Validation(Required=true)]
        public string Fromdid { get; set; }

        // 发起者用私钥对请求其他字段的签名
        [NameInMap("request_signature")]
        [Validation(Required=true)]
        public string RequestSignature { get; set; }

        // 被鉴定权限的did
        [NameInMap("todid")]
        [Validation(Required=true)]
        public string Todid { get; set; }

        // 鉴定的权限类别
        [NameInMap("type")]
        [Validation(Required=true)]
        public List<string> Type { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}
