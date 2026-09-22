// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVERENDER.Models
{
    // 视频输出结果
    public class VideoOutput : TeaModel {
        // 产物类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>video</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 可下载的视频地址
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://example.com/result.mp4">https://example.com/result.mp4</a></para>
        /// </summary>
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

        // 产物 ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>video-001</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 实际视频时长，单位秒
        /// <summary>
        /// <b>Example:</b>
        /// <para>15</para>
        /// </summary>
        [NameInMap("duration")]
        [Validation(Required=false)]
        public long? Duration { get; set; }

        // URL 过期时间，毫秒时间戳；能确定时返回
        /// <summary>
        /// <b>Example:</b>
        /// <para>1790000000000</para>
        /// </summary>
        [NameInMap("expire_time")]
        [Validation(Required=false)]
        public long? ExpireTime { get; set; }

    }

}
