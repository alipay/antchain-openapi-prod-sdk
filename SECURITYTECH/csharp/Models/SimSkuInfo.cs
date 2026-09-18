// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 二轮车一体机车辆SKU
    public class SimSkuInfo : TeaModel {
        // sku对外id
        /// <summary>
        /// <b>Example:</b>
        /// 
        /// </summary>
        [NameInMap("sku_id")]
        [Validation(Required=true)]
        public string SkuId { get; set; }

        // sku名称
        /// <summary>
        /// <b>Example:</b>
        /// 
        /// </summary>
        [NameInMap("sku_name")]
        [Validation(Required=true)]
        public string SkuName { get; set; }

        // sku官方指导价：单位为元
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000.00</para>
        /// </summary>
        [NameInMap("price")]
        [Validation(Required=true)]
        public string Price { get; set; }

        // sku门店优惠价：单位为元
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000.00</para>
        /// </summary>
        [NameInMap("store_price")]
        [Validation(Required=true)]
        public string StorePrice { get; set; }

        // 车型
        /// <summary>
        /// <b>Example:</b>
        /// 
        /// </summary>
        [NameInMap("vehicle_model")]
        [Validation(Required=true)]
        public string VehicleModel { get; set; }

        // 续航里程
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("range_km")]
        [Validation(Required=true)]
        public string RangeKm { get; set; }

        // 关键词，逗号分隔
        /// <summary>
        /// <b>Example:</b>
        /// <para>A,B,C</para>
        /// </summary>
        [NameInMap("keywords")]
        [Validation(Required=true)]
        public string Keywords { get; set; }

        // 颜色，逗号分隔
        /// <summary>
        /// <b>Example:</b>
        /// <para>A,B,C</para>
        /// </summary>
        [NameInMap("colors")]
        [Validation(Required=true)]
        public string Colors { get; set; }

        // 配件信息，逗号分隔
        /// <summary>
        /// <b>Example:</b>
        /// <para>A,B,C</para>
        /// </summary>
        [NameInMap("accessories")]
        [Validation(Required=true)]
        public string Accessories { get; set; }

        // 图片url json
        /// <summary>
        /// <b>Example:</b>
        /// <para>{}</para>
        /// </summary>
        [NameInMap("images")]
        [Validation(Required=true)]
        public string Images { get; set; }

        // 门店id
        /// <summary>
        /// <b>Example:</b>
        /// 
        /// </summary>
        [NameInMap("store_id")]
        [Validation(Required=true)]
        public string StoreId { get; set; }

        // 车型描述
        /// <summary>
        /// <b>Example:</b>
        /// 
        /// </summary>
        [NameInMap("sku_description")]
        [Validation(Required=false)]
        public string SkuDescription { get; set; }

        // sku价格配置开关 true开/false关
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("price_switch")]
        [Validation(Required=true)]
        public bool? PriceSwitch { get; set; }

        // sku价格配置范围 上限：单位元
        /// <summary>
        /// <b>Example:</b>
        /// 
        /// </summary>
        [NameInMap("price_max")]
        [Validation(Required=false)]
        public string PriceMax { get; set; }

        // sku价格配置范围 下限：单位元
        /// <summary>
        /// <b>Example:</b>
        /// 
        /// </summary>
        [NameInMap("price_min")]
        [Validation(Required=false)]
        public string PriceMin { get; set; }

    }

}
