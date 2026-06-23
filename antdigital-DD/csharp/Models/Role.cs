// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 角色
    public class Role : TeaModel {
        // 角色ID
        /// <summary>
        /// <b>Example:</b>
        /// 
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 角色名称
        // 
        /// <summary>
        /// <b>Example:</b>
        /// 
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 角色类型，CUSTOM:自定义角色，COMMON:系统通用角色
        /// <summary>
        /// <b>Example:</b>
        /// 
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 角色描述
        // 
        /// <summary>
        /// <b>Example:</b>
        /// 
        /// </summary>
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>NORMAL</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 所有者
        /// <summary>
        /// <b>Example:</b>
        /// <para>AntCloud</para>
        /// </summary>
        [NameInMap("owner")]
        [Validation(Required=false)]
        public string Owner { get; set; }

    }

}
