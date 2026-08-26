// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // ABC产品结构体C
    public class AbcCreateStructC : TeaModel {
        // 【个人信息】
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;name&quot;:&quot;张三&quot;,&quot;age&quot;:&quot;18&quot;}</para>
        /// </summary>
        [NameInMap("personal_information")]
        [Validation(Required=false)]
        public AbcCreateStructA PersonalInformation { get; set; }

        // 【地区信息】
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;info&quot;:&quot;xxxxx&quot;,&quot;region&quot;:&quot;浙江省杭州市西湖区xx街道xxx-xx幢-xx号&quot;}</para>
        /// </summary>
        [NameInMap("regional_information")]
        [Validation(Required=false)]
        public AbcCreateStructB RegionalInformation { get; set; }

        // 【用例类型】
        /// <summary>
        /// <b>Example:</b>
        /// <para>caseType</para>
        /// </summary>
        [NameInMap("case_name")]
        [Validation(Required=false)]
        public string CaseName { get; set; }

    }

}
