// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 二手车
    public class UsedCarInfo : TeaModel {
        // 渠道方线索业务id
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("lead_id")]
        [Validation(Required=true)]
        public string LeadId { get; set; }

        // 城市名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("city_name")]
        [Validation(Required=true)]
        public string CityName { get; set; }

        // 城市id
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("cid")]
        [Validation(Required=true)]
        public string Cid { get; set; }

        // 品牌名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("brand_name")]
        [Validation(Required=false)]
        public string BrandName { get; set; }

        // 车系名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("series_name")]
        [Validation(Required=false)]
        public string SeriesName { get; set; }

        // 车型名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("spec_name")]
        [Validation(Required=false)]
        public string SpecName { get; set; }

        // 首次上牌时间格式 yyyy/MM/dd
        /// <summary>
        /// <b>Example:</b>
        /// <para>2020/01/01</para>
        /// </summary>
        [NameInMap("first_reg_time")]
        [Validation(Required=true)]
        public string FirstRegTime { get; set; }

        // 行驶公里数(km)
        /// <summary>
        /// <b>Example:</b>
        /// <para>12345.67</para>
        /// </summary>
        [NameInMap("mileage")]
        [Validation(Required=true)]
        public string Mileage { get; set; }

        // 省份id
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("pid")]
        [Validation(Required=true)]
        public string Pid { get; set; }

        // 汽车之家车型id
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("specid")]
        [Validation(Required=true)]
        public string Specid { get; set; }

    }

}
