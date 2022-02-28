// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SP.Models
{
    public class UpdateAbilityChainAssetRequest : TeaModel {
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

        // 流水号
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 链id，链上合约id
        [NameInMap("chain_id")]
        [Validation(Required=true)]
        public string ChainId { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 链上用户id
        [NameInMap("chain_user_id")]
        [Validation(Required=false)]
        public string ChainUserId { get; set; }

        // 链上token金额，价值现金。单元：分
        [NameInMap("token_amount")]
        [Validation(Required=true)]
        public long? TokenAmount { get; set; }

        // token链上数量。与现金有一定的兑换率。
        [NameInMap("token_number")]
        [Validation(Required=true)]
        public string TokenNumber { get; set; }

        // 扩展字段，json格式
        [NameInMap("extend_params")]
        [Validation(Required=false)]
        public string ExtendParams { get; set; }

    }

}
