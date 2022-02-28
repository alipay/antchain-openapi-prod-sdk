// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SP.Models
{
    public class UpdateAbilityChainAccountRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        [NameInMap("product_access_code")]
        [Validation(Required=false)]
        public string ProductAccessCode { get; set; }

        // 业务流水，请求幂等号
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 链id，每个合约独立的标识
        [NameInMap("chain_id")]
        [Validation(Required=true)]
        public string ChainId { get; set; }

        // 租户名。目前理解 chain_id + tenant_id + chain_user_id 能唯一标识某个合约上的某个账号
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 链上账号。链上唯一账号。某些特定场景（比如某个租户可以在一个合约上不同平台方参与分润），会需要合约账户id
        [NameInMap("chain_user_id")]
        [Validation(Required=false)]
        public string ChainUserId { get; set; }

        // decrease 减少 increase 增加
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 金额，单位：分。
        [NameInMap("value")]
        [Validation(Required=true)]
        public long? Value { get; set; }

        // 扩展字段，json格式
        [NameInMap("extend_params")]
        [Validation(Required=false)]
        public string ExtendParams { get; set; }

    }

}
