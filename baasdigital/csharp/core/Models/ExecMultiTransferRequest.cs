// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDIGITAL.Models
{
    public class ExecMultiTransferRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 链id
        [NameInMap("bizid")]
        [Validation(Required=true)]
        public string Bizid { get; set; }

        // 数字权证项目ID
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 业务方请求唯一标识，用于异步查询交易情况
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

        // 权证所有者账户
        [NameInMap("from")]
        [Validation(Required=true)]
        public string From { get; set; }

        // 转移的目标账户
        [NameInMap("to")]
        [Validation(Required=true)]
        public string To { get; set; }

        // 转移的目标权证批次
        [NameInMap("asset_id")]
        [Validation(Required=true)]
        public string AssetId { get; set; }

        // 该批次中的资产的唯一编号，客户端不传递则系统采用随机UUID，并从结果返回
        [NameInMap("shard_id")]
        [Validation(Required=false)]
        public string ShardId { get; set; }

        // 预留
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

        // 托管账户信息(推荐)，托管和非拖管必选一种
        [NameInMap("account_info")]
        [Validation(Required=true)]
        public AccountInfo AccountInfo { get; set; }

    }

}
