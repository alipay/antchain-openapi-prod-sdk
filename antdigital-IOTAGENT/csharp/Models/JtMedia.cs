// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 多媒体文件
    public class JtMedia : TeaModel {
        // 多媒体ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("media_id")]
        [Validation(Required=true)]
        public string MediaId { get; set; }

        // 文件名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx.jpg</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 可访问的url
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://oss.com/53/85855.jpg?sign=xxx">https://oss.com/53/85855.jpg?sign=xxx</a></para>
        /// </summary>
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

        // 上传时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1687859592688</para>
        /// </summary>
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public long? GmtCreate { get; set; }

        // 多媒体类型枚举：IMAGE 图像；AUDIO 音频；VIDEO视频； UN_KNOW  未知；
        /// <summary>
        /// <b>Example:</b>
        /// <para>IMAGE</para>
        /// </summary>
        [NameInMap("media_type")]
        [Validation(Required=true)]
        public string MediaType { get; set; }

    }

}
