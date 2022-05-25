// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ZOLOZFACEVERIFY.Models
{
    public class InitFaceauthZimRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务参数
        [NameInMap("biz_data")]
        [Validation(Required=false)]
        public string BizData { get; set; }

        // 渠道
        [NameInMap("channel")]
        [Validation(Required=false)]
        public string Channel { get; set; }

        // 商户
        [NameInMap("merchant")]
        [Validation(Required=false)]
        public string Merchant { get; set; }

        // 环境参数
        [NameInMap("meta_info")]
        [Validation(Required=true)]
        public string MetaInfo { get; set; }

        // 产品节点
        [NameInMap("produce_node")]
        [Validation(Required=false)]
        public string ProduceNode { get; set; }

        // 产品名称
        [NameInMap("product_name")]
        [Validation(Required=false)]
        public string ProductName { get; set; }

        // 实人认证id
        [NameInMap("zim_id")]
        [Validation(Required=true)]
        public string ZimId { get; set; }

        // 身份信息参数
        [NameInMap("zim_principal")]
        [Validation(Required=false)]
        public string ZimPrincipal { get; set; }

    }

}
