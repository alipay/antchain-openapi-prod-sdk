// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 经营地址
    public class AddressInfo : TeaModel {
        // 城市编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>371000</para>
        /// </summary>
        [NameInMap("city_code")]
        [Validation(Required=true)]
        public string CityCode { get; set; }

        // 区县编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>371002</para>
        /// </summary>
        [NameInMap("district_code")]
        [Validation(Required=true)]
        public string DistrictCode { get; set; }

        // 地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>万塘路18号黄龙时代广场B座</para>
        /// </summary>
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

        // 省份编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>370000</para>
        /// </summary>
        [NameInMap("province_code")]
        [Validation(Required=true)]
        public string ProvinceCode { get; set; }

        // 高德 poiid
        /// <summary>
        /// <b>Example:</b>
        /// <para>B0FFIVU189</para>
        /// </summary>
        [NameInMap("poiid")]
        [Validation(Required=false)]
        public string Poiid { get; set; }

        // 经度
        /// <summary>
        /// <b>Example:</b>
        /// <para>120.760001</para>
        /// </summary>
        [NameInMap("longitude")]
        [Validation(Required=false)]
        public string Longitude { get; set; }

        // 纬度
        /// <summary>
        /// <b>Example:</b>
        /// <para>60.270001</para>
        /// </summary>
        [NameInMap("latitude")]
        [Validation(Required=false)]
        public string Latitude { get; set; }

        // 地址类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>BUSINESS_ADDRESS</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
