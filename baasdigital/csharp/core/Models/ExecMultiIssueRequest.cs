// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDIGITAL.Models
{
    public class ExecMultiIssueRequest : TeaModel {
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

        // 业务方请求唯一标识，可用于异步查询交易情况
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

        // 发行批次ID，线下生成，保证唯一，asset_id长度限制为64，只支持英文字符和数字
        [NameInMap("asset_id")]
        [Validation(Required=true)]
        public string AssetId { get; set; }

        // 数字权证标准URI协议文件，权证信息。
        // 首次发行时必填，后续发行(增发)时可不用输入
        [NameInMap("asset_uri")]
        [Validation(Required=false)]
        public string AssetUri { get; set; }

        // 该批次权证发行的目标账户
        [NameInMap("to_account")]
        [Validation(Required=true)]
        public string ToAccount { get; set; }

        // 该批次中包含的资产个数
        [NameInMap("amount")]
        [Validation(Required=true)]
        public long? Amount { get; set; }

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
