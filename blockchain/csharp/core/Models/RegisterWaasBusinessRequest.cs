// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class RegisterWaasBusinessRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务场景名称
        [NameInMap("biz_name")]
        [Validation(Required=true)]
        public string BizName { get; set; }

        // 业务场景公钥
        [NameInMap("public_key")]
        [Validation(Required=true)]
        public string PublicKey { get; set; }

        // 业务场景运行dcep合约的链id
        [NameInMap("chain_id")]
        [Validation(Required=true)]
        public string ChainId { get; set; }

        // 数据资产展示首页
        [NameInMap("index_url")]
        [Validation(Required=true)]
        public string IndexUrl { get; set; }

        // 与waas交互地址，waas服务会推送相关消息至该链接
        [NameInMap("interaction_url")]
        [Validation(Required=true)]
        public string InteractionUrl { get; set; }

        // 业务场景描述
        [NameInMap("business_desc")]
        [Validation(Required=true)]
        public string BusinessDesc { get; set; }

        // 扩展字段
        [NameInMap("extension")]
        [Validation(Required=false)]
        public string Extension { get; set; }

    }

}
