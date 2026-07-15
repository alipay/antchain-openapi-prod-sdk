// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 溯源信息中的一项记录。
    public class Item : TeaModel {
        // 溯源项的具体内容
        /// <summary>
        /// <b>Example:</b>
        /// <para>枭洒保税所有海关可用严禁修改</para>
        /// </summary>
        [NameInMap("desc")]
        [Validation(Required=true)]
        public string Desc { get; set; }

        // 扩展信息 ，json格式
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;{&quot;isUrl&quot;,true,&quot;usrid&quot;:&quot;123231&quot;}&quot;</para>
        /// </summary>
        [NameInMap("ext_info")]
        [Validation(Required=true)]
        public string ExtInfo { get; set; }

        // 溯源项的键值
        /// <summary>
        /// <b>Example:</b>
        /// <para>itemName</para>
        /// </summary>
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 溯源项的中文标题 
        /// <summary>
        /// <b>Example:</b>
        /// <para>品名</para>
        /// </summary>
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // 内容类型 
        /// <summary>
        /// <b>Example:</b>
        /// <para>text, image, region, link, longtext</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
