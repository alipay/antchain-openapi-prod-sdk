// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class QueryCreditIssuebyidRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 信用流转发行批次号
        [NameInMap("batch_id")]
        [Validation(Required=true)]
        public string BatchId { get; set; }

        // 集团平台方分布式数字身份
        [NameInMap("group_platform_did")]
        [Validation(Required=true)]
        public string GroupPlatformDid { get; set; }

        // 是否只返回已发行凭证信息
        [NameInMap("issued_only")]
        [Validation(Required=true)]
        public bool? IssuedOnly { get; set; }

        // 信用流转发行凭证Id
        [NameInMap("issue_id")]
        [Validation(Required=false)]
        public string IssueId { get; set; }

        // 页数 从1开始
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 每页显示数量 不超过100
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 业务发起方分布式数字身份
        [NameInMap("platform_did")]
        [Validation(Required=true)]
        public string PlatformDid { get; set; }

        // 产品id 
        // A模式：PRODUCT_MYBANK，
        // A+模式：PRODUCT_MYBANK_A_PLUS，
        // B模式：PRODUCT_MYBANK_B
        [NameInMap("product_id")]
        [Validation(Required=true)]
        public string ProductId { get; set; }

    }

}
