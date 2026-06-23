// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 收费项模型VO
    public class ChargeItemVO : TeaModel {
        // 收费项对应的枚举编码@ProductConstraintEnum 
        /// <summary>
        /// <b>Example:</b>
        /// <para>a</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 收费项对应的云产品条件code@ProductConstraintEnum
        /// <summary>
        /// <b>Example:</b>
        /// <para>a</para>
        /// </summary>
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 使用量
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

        // 度量单位
        /// <summary>
        /// <b>Example:</b>
        /// <para>m</para>
        /// </summary>
        [NameInMap("unit")]
        [Validation(Required=false)]
        public string Unit { get; set; }

        // 计费项类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>type</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 计费项名称-前端显示
        /// <summary>
        /// <b>Example:</b>
        /// <para>display_name</para>
        /// </summary>
        [NameInMap("display_name")]
        [Validation(Required=false)]
        public string DisplayName { get; set; }

        // 计费项单位-前端显示 
        /// <summary>
        /// <b>Example:</b>
        /// <para>displayUnit</para>
        /// </summary>
        [NameInMap("display_unit")]
        [Validation(Required=false)]
        public string DisplayUnit { get; set; }

        // 计费项值-前端显示
        /// <summary>
        /// <b>Example:</b>
        /// <para>display_value</para>
        /// </summary>
        [NameInMap("display_value")]
        [Validation(Required=false)]
        public string DisplayValue { get; set; }

    }

}
