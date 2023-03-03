// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDIGITAL.Models
{
    public class QueryContractStatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 链ID
        [NameInMap("bizid")]
        [Validation(Required=true)]
        public string Bizid { get; set; }

        // 数字权证项目ID
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 业务方请求唯一标识
        [NameInMap("trace_id")]
        [Validation(Required=false)]
        public string TraceId { get; set; }

        // 资产ID，如果是1155标准资产，则对应批次id
        [NameInMap("asset_id")]
        [Validation(Required=true)]
        public string AssetId { get; set; }

        // 1155标准下，需要填入批次内具体的资产碎片id
        [NameInMap("shard_id")]
        [Validation(Required=false)]
        public string ShardId { get; set; }

        // 托管账户信息(推荐)，托管和非拖管必选一种
        [NameInMap("account_info")]
        [Validation(Required=true)]
        public AccountInfo AccountInfo { get; set; }

    }

}
