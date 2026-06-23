// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 权限点
    public class Action : TeaModel {
        // 权限点ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>A0000000001</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 权限点名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>antcloud.xxx.xxx.labelinfo.query</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>INNER</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>NORMAL</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 描述
        /// <summary>
        /// <b>Example:</b>
        /// 
        /// </summary>
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

    }

}
