// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 产品和供应商信息
    public class ProductProviderInfo : TeaModel {
        // 数据产品标识
        [NameInMap("product_identity_id")]
        [Validation(Required=true)]
        public string ProductIdentityId { get; set; }

        // 数据源企业code
        [NameInMap("source_enterprise_code")]
        [Validation(Required=true)]
        public string SourceEnterpriseCode { get; set; }

        // 数据源企业名称
        [NameInMap("source_enterprise_name")]
        [Validation(Required=true)]
        public string SourceEnterpriseName { get; set; }

    }

}
