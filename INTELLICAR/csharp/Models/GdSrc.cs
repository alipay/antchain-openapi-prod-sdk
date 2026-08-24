// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 高德潜客record流入指数
    public class GdSrc : TeaModel {
        // 流入指数uv指数
        [NameInMap("uv")]
        [Validation(Required=true)]
        public GdCustomerUv Uv { get; set; }

        // 流入指数pv指数
        [NameInMap("pv")]
        [Validation(Required=true)]
        public GdCustomerPv Pv { get; set; }

        // 流入品牌id
        /// <summary>
        /// <b>Example:</b>
        /// <para>106</para>
        /// </summary>
        [NameInMap("brand_id")]
        [Validation(Required=true)]
        public string BrandId { get; set; }

        // 流入店铺id，数据类型为店铺时返回该属性与值
        /// <summary>
        /// <b>Example:</b>
        /// <para>26mMw8duxn</para>
        /// </summary>
        [NameInMap("shop_id")]
        [Validation(Required=false)]
        public string ShopId { get; set; }

        // 流入城市编码，数据类型为店铺或者城市时返回该属性与值
        /// <summary>
        /// <b>Example:</b>
        /// <para>021</para>
        /// </summary>
        [NameInMap("citycode")]
        [Validation(Required=false)]
        public string Citycode { get; set; }

        // 省份编码，数据类型为省份时返回该属性与值
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("pcode")]
        [Validation(Required=false)]
        public string Pcode { get; set; }

        // 数据类型为全国时返回该属性与值
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("countrycode")]
        [Validation(Required=false)]
        public string Countrycode { get; set; }

    }

}
