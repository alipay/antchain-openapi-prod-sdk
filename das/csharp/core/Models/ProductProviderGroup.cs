// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 服务产品供应商组
    public class ProductProviderGroup : TeaModel {
        // 产品供应商信息
        [NameInMap("product_provider_list")]
        [Validation(Required=true)]
        public List<ProductProviderInfo> ProductProviderList { get; set; }

        // 数据产品入参,JSON数组
        [NameInMap("product_param")]
        [Validation(Required=true)]
        public string ProductParam { get; set; }

        // C端展示授权内容code
        [NameInMap("auth_content_code")]
        [Validation(Required=true)]
        public string AuthContentCode { get; set; }

    }

}
