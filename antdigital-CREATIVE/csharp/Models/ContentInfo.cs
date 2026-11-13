// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVE.Models
{
    // 非空内容列表，至少含文本或素材
    public class ContentInfo : TeaModel {
        // 类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>text</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // type=text 时提供，文本
        /// <summary>
        /// <b>Example:</b>
        /// <para>生成一只猫</para>
        /// </summary>
        [NameInMap("text")]
        [Validation(Required=false)]
        public string Text { get; set; }

        // type=image_url 时提供
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="http://www.test.com/123">www.test.com/123</a></para>
        /// </summary>
        [NameInMap("image_url")]
        [Validation(Required=false)]
        public ContentUrl ImageUrl { get; set; }

        // type=audio_url 时提供
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="http://www.test.com/123">www.test.com/123</a></para>
        /// </summary>
        [NameInMap("audio_url")]
        [Validation(Required=false)]
        public ContentUrl AudioUrl { get; set; }

        // type=video_url 时提供
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="http://www.test.com/123">www.test.com/123</a></para>
        /// </summary>
        [NameInMap("video_url")]
        [Validation(Required=false)]
        public ContentUrl VideoUrl { get; set; }

        // 角色
        /// <summary>
        /// <b>Example:</b>
        /// <para>reference_image</para>
        /// </summary>
        [NameInMap("role")]
        [Validation(Required=false)]
        public string Role { get; set; }

    }

}
