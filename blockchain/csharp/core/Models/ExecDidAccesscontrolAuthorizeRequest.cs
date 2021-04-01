// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class ExecDidAccesscontrolAuthorizeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 发起授权的did
        [NameInMap("fromdid")]
        [Validation(Required=true)]
        public string Fromdid { get; set; }

        // 对其他字段的签名
        [NameInMap("request_signature")]
        [Validation(Required=true)]
        public string RequestSignature { get; set; }

        // 被授权的did
        [NameInMap("todid")]
        [Validation(Required=true)]
        public string Todid { get; set; }

        // 授权的权限类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public List<string> Type { get; set; }

        // 场景码，找dis工作人员进行分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}
