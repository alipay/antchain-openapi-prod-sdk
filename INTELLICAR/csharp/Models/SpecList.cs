// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 城市列表
    public class SpecList : TeaModel {
        // 品牌Id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("brand_id")]
        [Validation(Required=true)]
        public string BrandId { get; set; }

        // 品牌名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>宝马</para>
        /// </summary>
        [NameInMap("brand_name")]
        [Validation(Required=true)]
        public string BrandName { get; set; }

        // 厂商id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("factory_id")]
        [Validation(Required=true)]
        public string FactoryId { get; set; }

        // 厂商名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>华晨宝马</para>
        /// </summary>
        [NameInMap("factory_name")]
        [Validation(Required=true)]
        public string FactoryName { get; set; }

        // 车系id
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("series_id")]
        [Validation(Required=true)]
        public string SeriesId { get; set; }

        // 车系名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>宝马X5</para>
        /// </summary>
        [NameInMap("series_name")]
        [Validation(Required=true)]
        public string SeriesName { get; set; }

        // 车型Id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1001</para>
        /// </summary>
        [NameInMap("spec_id")]
        [Validation(Required=true)]
        public string SpecId { get; set; }

        // 车型名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026款 改款 xDrive 40Li M运动曜夜套装</para>
        /// </summary>
        [NameInMap("spec_name")]
        [Validation(Required=true)]
        public string SpecName { get; set; }

    }

}
