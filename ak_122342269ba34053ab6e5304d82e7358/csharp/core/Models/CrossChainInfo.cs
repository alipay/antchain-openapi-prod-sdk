// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_122342269ba34053ab6e5304d82e7358.Models
{
    // 跨链信息结构体
    public class CrossChainInfo : TeaModel {
        // 授权映射关系id
        [NameInMap("acl_id")]
        [Validation(Required=true)]
        public string AclId { get; set; }

        // 详细描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 授权关系创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public string GmtCreate { get; set; }

        // 授权链的链域名
        [NameInMap("grant_domain")]
        [Validation(Required=true)]
        public string GrantDomain { get; set; }

        // 授权合约在授权链上地址
        [NameInMap("grant_identity")]
        [Validation(Required=true)]
        public string GrantIdentity { get; set; }

        // 自有链链域名
        [NameInMap("owner_domain")]
        [Validation(Required=true)]
        public string OwnerDomain { get; set; }

        // 自有合约在链上地址
        [NameInMap("owner_identity")]
        [Validation(Required=true)]
        public string OwnerIdentity { get; set; }

    }

}
