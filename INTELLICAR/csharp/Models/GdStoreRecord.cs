// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 高德店铺基本系返回record
    public class GdStoreRecord : TeaModel {
        // 店铺ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>01cc5d1cc0</para>
        /// </summary>
        [NameInMap("shop_id")]
        [Validation(Required=true)]
        public string ShopId { get; set; }

        // 店铺名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 店铺地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

        // 店铺所在省份
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("pname")]
        [Validation(Required=true)]
        public string Pname { get; set; }

        // 店铺所在城市
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("cityname")]
        [Validation(Required=true)]
        public string Cityname { get; set; }

        // 品牌id
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("brand_id")]
        [Validation(Required=true)]
        public string BrandId { get; set; }

        // 品牌名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("brand_name")]
        [Validation(Required=true)]
        public string BrandName { get; set; }

        // 经销商代码
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("office_code")]
        [Validation(Required=true)]
        public string OfficeCode { get; set; }

        // 经度
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("lon")]
        [Validation(Required=true)]
        public string Lon { get; set; }

        // 纬度
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("lat")]
        [Validation(Required=true)]
        public string Lat { get; set; }

        // 店铺数据版本集合
        [NameInMap("version_list")]
        [Validation(Required=true)]
        public List<string> VersionList { get; set; }

    }

}
