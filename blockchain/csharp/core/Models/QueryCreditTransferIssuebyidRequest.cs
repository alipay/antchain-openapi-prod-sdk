// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryCreditTransferIssuebyidRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 信用流转发行批次号，与issueId信用流转发行结果查询号不可同时为空
        [NameInMap("batch_id")]
        [Validation(Required=false)]
        public string BatchId { get; set; }

        // 货主分布式数字身份
        [NameInMap("consignor_did")]
        [Validation(Required=true)]
        public string ConsignorDid { get; set; }

        // 信用流转发行凭证Id，与batchId信用流转发行批次号不可同时为空
        [NameInMap("issue_id")]
        [Validation(Required=false)]
        public string IssueId { get; set; }

        // 是否只返回已发行凭证信息
        [NameInMap("issue_only")]
        [Validation(Required=true)]
        public bool? IssueOnly { get; set; }

        // 页数 从1开始
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 每页显示数量
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 业务发起方分布式数字身份
        [NameInMap("platform_did")]
        [Validation(Required=true)]
        public string PlatformDid { get; set; }

    }

}
