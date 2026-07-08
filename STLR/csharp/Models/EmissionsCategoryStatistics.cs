// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 分类碳排放量
    public class EmissionsCategoryStatistics : TeaModel {
        // 排放类型编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>000001</para>
        /// </summary>
        [NameInMap("emission_dategory_no")]
        [Validation(Required=true)]
        public string EmissionDategoryNo { get; set; }

        // 排放类型名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>间接排放</para>
        /// </summary>
        [NameInMap("emission_category_name")]
        [Validation(Required=true)]
        public string EmissionCategoryName { get; set; }

        // 排放量
        /// <summary>
        /// <b>Example:</b>
        /// <para>11.22</para>
        /// </summary>
        [NameInMap("emission")]
        [Validation(Required=true)]
        public string Emission { get; set; }

        // 排放占比，可直接换算成百分数即为百分占比
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.56</para>
        /// </summary>
        [NameInMap("rate")]
        [Validation(Required=true)]
        public string Rate { get; set; }

        // 排放量单位
        /// <summary>
        /// <b>Example:</b>
        /// <para>tCO2e</para>
        /// </summary>
        [NameInMap("unit")]
        [Validation(Required=true)]
        public string Unit { get; set; }

    }

}
