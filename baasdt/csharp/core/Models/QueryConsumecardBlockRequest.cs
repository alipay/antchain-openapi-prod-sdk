// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryConsumecardBlockRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 区块高度
        [NameInMap("block_number")]
        [Validation(Required=true)]
        public long? BlockNumber { get; set; }

        // 链ID，指定要获取的
        [NameInMap("chain_id")]
        [Validation(Required=true)]
        public string ChainId { get; set; }

        // 代理查询区块信息，传入代理租户需有代理权限。接口会返回调用者和被代理租户能查看的所有交易信息。
        [NameInMap("delegated_tenant_ids")]
        [Validation(Required=false)]
        public List<string> DelegatedTenantIds { get; set; }

    }

}
