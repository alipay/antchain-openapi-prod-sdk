// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 数登申请声明：包括创作目的、创作过程、独创性和字体申明
    public class DciExplanationInfo : TeaModel {
        // 创作目的，描述作品创作的目的
        /// <summary>
        /// <b>Example:</b>
        /// <para>xx的创作目的</para>
        /// </summary>
        [NameInMap("creation_purpose")]
        [Validation(Required=true)]
        public string CreationPurpose { get; set; }

        // 创作过程，具体的创作过程
        /// <summary>
        /// <b>Example:</b>
        /// <para>xx的创作过程</para>
        /// </summary>
        [NameInMap("creation_process")]
        [Validation(Required=true)]
        public string CreationProcess { get; set; }

        // 阐述作品的独创性
        /// <summary>
        /// <b>Example:</b>
        /// <para>独创性说明</para>
        /// </summary>
        [NameInMap("originality")]
        [Validation(Required=true)]
        public string Originality { get; set; }

        // 创作过程涉及到字体使用相关版权说明
        /// <summary>
        /// <b>Example:</b>
        /// <para>字体申明</para>
        /// </summary>
        [NameInMap("font_copyright")]
        [Validation(Required=false)]
        public string FontCopyright { get; set; }

        // 创作过程涉及到字体使用相关版权说明	
        // 
        [NameInMap("font_types")]
        [Validation(Required=false)]
        public List<string> FontTypes { get; set; }

    }

}
