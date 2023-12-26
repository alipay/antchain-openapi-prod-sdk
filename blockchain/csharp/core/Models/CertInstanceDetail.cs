// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 证书实例详情
    public class CertInstanceDetail : TeaModel {
        // 主键
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 实例名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 版发者
        [NameInMap("issuer")]
        [Validation(Required=true)]
        public string Issuer { get; set; }

        // 实例内容
        [NameInMap("claim_content")]
        [Validation(Required=true)]
        public string ClaimContent { get; set; }

        // 状态；-1：已删除 0：审核未通过, 1：审核通过, 2：待审核, 3：编辑中
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 审核建议
        [NameInMap("verify_comment")]
        [Validation(Required=true)]
        public string VerifyComment { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public string GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public string GmtModified { get; set; }

    }

}
