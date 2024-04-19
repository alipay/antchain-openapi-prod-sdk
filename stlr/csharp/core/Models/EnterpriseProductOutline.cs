// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 产品概要信息
    public class EnterpriseProductOutline : TeaModel {
        // 产品自定义编码
        // 
        [NameInMap("enterprise_custom_code")]
        [Validation(Required=true)]
        public string EnterpriseCustomCode { get; set; }

        // 产品名称
        // 
        [NameInMap("product_name")]
        [Validation(Required=true)]
        public string ProductName { get; set; }

        // 规格型号
        [NameInMap("specification")]
        [Validation(Required=true)]
        public string Specification { get; set; }

        // 产品描述
        [NameInMap("product_description")]
        [Validation(Required=false)]
        public string ProductDescription { get; set; }

        // 产品分类名称
        [NameInMap("product_category_name")]
        [Validation(Required=true)]
        public string ProductCategoryName { get; set; }

        // 品牌信息
        [NameInMap("brand_information")]
        [Validation(Required=false)]
        public string BrandInformation { get; set; }

    }

}
