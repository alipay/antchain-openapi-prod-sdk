// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 蚂蚁链用途申报结构体
    public class ChainPurpose : TeaModel {
        // 用途id
        /// <summary>
        /// <b>Example:</b>
        /// <para>4356</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 用途key
        /// <summary>
        /// <b>Example:</b>
        /// <para>3uhhf</para>
        /// </summary>
        [NameInMap("key")]
        [Validation(Required=false)]
        public string Key { get; set; }

        // 用途内容
        /// <summary>
        /// <b>Example:</b>
        /// <para>用途内容</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 用途申报时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>22-01-01</para>
        /// </summary>
        [NameInMap("time")]
        [Validation(Required=false)]
        public string Time { get; set; }

        // 用途申报状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>用途申报状态</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 简短描述开关
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("item")]
        [Validation(Required=false)]
        public bool? Item { get; set; }

        // 详细描述开关
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("extend")]
        [Validation(Required=false)]
        public bool? Extend { get; set; }

        // 用途申报简短描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;&quot;</para>
        /// </summary>
        [NameInMap("purpose_item")]
        [Validation(Required=false)]
        public string PurposeItem { get; set; }

    }

}
