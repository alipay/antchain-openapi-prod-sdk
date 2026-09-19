// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 商品明细数组
    public class ProductItem : TeaModel {
        // 订单商品类型，PET-活体、GOODS-商品、POINT_PACKAGE-积分包（积分商品订单专用，区分普通实物商品）、MEMBER-会员订阅
        /// <summary>
        /// <b>Example:</b>
        /// <para>PET</para>
        /// </summary>
        [NameInMap("product_type")]
        [Validation(Required=true)]
        public string ProductType { get; set; }

        // 商品名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("product_name")]
        [Validation(Required=true)]
        public string ProductName { get; set; }

        // 商品金额，单位元，两位小数
        /// <summary>
        /// <b>Example:</b>
        /// <para>99.22</para>
        /// </summary>
        [NameInMap("product_amount")]
        [Validation(Required=true)]
        public string ProductAmount { get; set; }

        // 该行商品收款主体
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

    }

}
