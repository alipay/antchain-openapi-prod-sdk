// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 国家信息
    public class CountryCnEnItem : TeaModel {
        // 国家字母编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>CN</para>
        /// </summary>
        [NameInMap("country_code")]
        [Validation(Required=true)]
        public string CountryCode { get; set; }

        // 国家中文名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>中国</para>
        /// </summary>
        [NameInMap("country_cn")]
        [Validation(Required=true)]
        public string CountryCn { get; set; }

        // 国家英文名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>China</para>
        /// </summary>
        [NameInMap("country_en")]
        [Validation(Required=true)]
        public string CountryEn { get; set; }

    }

}
