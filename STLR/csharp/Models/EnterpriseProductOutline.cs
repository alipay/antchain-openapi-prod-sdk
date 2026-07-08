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
        /// <summary>
        /// <b>Example:</b>
        /// <para>23123121</para>
        /// </summary>
        [NameInMap("enterprise_custom_code")]
        [Validation(Required=true)]
        public string EnterpriseCustomCode { get; set; }

        // 产品名称
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>石墨</para>
        /// </summary>
        [NameInMap("product_name")]
        [Validation(Required=true)]
        public string ProductName { get; set; }

        // 规格型号
        /// <summary>
        /// <b>Example:</b>
        /// <para>DDD-1212</para>
        /// </summary>
        [NameInMap("specification")]
        [Validation(Required=true)]
        public string Specification { get; set; }

        // 产品描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>产品描述</para>
        /// </summary>
        [NameInMap("product_description")]
        [Validation(Required=false)]
        public string ProductDescription { get; set; }

        // 产品分类名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>产品分类名</para>
        /// </summary>
        [NameInMap("product_category_name")]
        [Validation(Required=true)]
        public string ProductCategoryName { get; set; }

        // 品牌信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>Adidas</para>
        /// </summary>
        [NameInMap("brand_information")]
        [Validation(Required=false)]
        public string BrandInformation { get; set; }

    }

}
