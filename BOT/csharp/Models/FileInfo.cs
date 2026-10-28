// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 附件信息
    public class FileInfo : TeaModel {
        // 文件名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>文件名称</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 文件类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>文件类型</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // oss地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>oss地址</para>
        /// </summary>
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>11223344556778899</para>
        /// </summary>
        [NameInMap("created_at")]
        [Validation(Required=true)]
        public long? CreatedAt { get; set; }

        // id
        /// <summary>
        /// <b>Example:</b>
        /// <para>11223344556778899</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

    }

}
