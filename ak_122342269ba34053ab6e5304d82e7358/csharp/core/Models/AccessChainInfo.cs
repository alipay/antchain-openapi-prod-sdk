// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_122342269ba34053ab6e5304d82e7358.Models
{
    // 可访问数据关系信息
    public class AccessChainInfo : TeaModel {
        // 授权访问链关系ID
        [NameInMap("acl_id")]
        [Validation(Required=true)]
        public string AclId { get; set; }

        // 详细描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 关系创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public string GmtCreate { get; set; }

        // 被授权的链的链域名
        [NameInMap("grant_domain")]
        [Validation(Required=true)]
        public string GrantDomain { get; set; }

        // 授权链链域名
        [NameInMap("owner_domain")]
        [Validation(Required=true)]
        public string OwnerDomain { get; set; }

        // 授权可以访问的数据类型
        [NameInMap("resource_type")]
        [Validation(Required=true)]
        public string ResourceType { get; set; }

    }

}
