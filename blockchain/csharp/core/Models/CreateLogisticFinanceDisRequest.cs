// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateLogisticFinanceDisRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 扩展字段
        [NameInMap("extend")]
        [Validation(Required=false)]
        public string Extend { get; set; }

        // 是否为他人代理申请分布式数字身份,缺省时为自己创建分布式数字身份
        [NameInMap("is_agent")]
        [Validation(Required=false)]
        public bool? IsAgent { get; set; }

        // 用户（企业）名称
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

    }

}
