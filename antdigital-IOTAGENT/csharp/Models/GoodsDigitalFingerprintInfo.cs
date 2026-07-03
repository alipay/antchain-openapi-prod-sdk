// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 商品数字指纹信息
    public class GoodsDigitalFingerprintInfo : TeaModel {
        // 品类
        /// <summary>
        /// <b>Example:</b>
        /// <para>奢侈品</para>
        /// </summary>
        [NameInMap("category")]
        [Validation(Required=true)]
        public string Category { get; set; }

        // 品牌
        /// <summary>
        /// <b>Example:</b>
        /// <para>GUCCI</para>
        /// </summary>
        [NameInMap("brand")]
        [Validation(Required=true)]
        public string Brand { get; set; }

        // 款式
        /// <summary>
        /// <b>Example:</b>
        /// <para>Gucci Diana</para>
        /// </summary>
        [NameInMap("style")]
        [Validation(Required=true)]
        public string Style { get; set; }

        // 商品数字指纹鉴定点列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>[{&quot;sub_point_name&quot;:&quot;正面&quot;,&quot;image_url&quot;:&quot;<a href="http://xxxx1001%22%7D,%7B%22sub_point_name%22:%22%E8%83%8C%E9%9D%A2%22,%22image_url%22:%22http://xxxx1002%22%7D%5D">http://xxxx1001&quot;},{&quot;sub_point_name&quot;:&quot;背面&quot;,&quot;image_url&quot;:&quot;http://xxxx1002&quot;}]</a></para>
        /// </summary>
        [NameInMap("goods_points")]
        [Validation(Required=true)]
        public List<GoodsDigitalFingerprintPoint> GoodsPoints { get; set; }

        // 商品id
        /// <summary>
        /// <b>Example:</b>
        /// <para>goodsId</para>
        /// </summary>
        [NameInMap("goods_id")]
        [Validation(Required=true, MaxLength=128)]
        public string GoodsId { get; set; }

    }

}
