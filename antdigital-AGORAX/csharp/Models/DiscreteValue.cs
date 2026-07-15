// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 组件信息
    public class DiscreteValue : TeaModel {
        // 排序id
        /// <summary>
        /// <b>Example:</b>
        /// <para>12</para>
        /// </summary>
        [NameInMap("sort_id")]
        [Validation(Required=false)]
        public long? SortId { get; set; }

        // 字段描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>联盟名称</para>
        /// </summary>
        [NameInMap("text")]
        [Validation(Required=true)]
        public string Text { get; set; }

        // 提示信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>提示信息</para>
        /// </summary>
        [NameInMap("tips")]
        [Validation(Required=false)]
        public string Tips { get; set; }

        // 单位信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>单位信息</para>
        /// </summary>
        [NameInMap("unit")]
        [Validation(Required=false)]
        public string Unit { get; set; }

        // 值内容
        /// <summary>
        /// <b>Example:</b>
        /// <para>值内容</para>
        /// </summary>
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
