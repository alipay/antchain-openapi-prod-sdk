// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // skill信息
    public class SkillInfo : TeaModel {
        // skill名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 版本
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.2</para>
        /// </summary>
        [NameInMap("version")]
        [Validation(Required=true)]
        public string Version { get; set; }

        // oss地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>url</para>
        /// </summary>
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

        // skillId
        /// <summary>
        /// <b>Example:</b>
        /// <para>11223344556778899</para>
        /// </summary>
        [NameInMap("skill_id")]
        [Validation(Required=true)]
        public string SkillId { get; set; }

    }

}
