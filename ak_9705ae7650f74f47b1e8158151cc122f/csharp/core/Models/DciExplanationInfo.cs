// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_9705ae7650f74f47b1e8158151cc122f.Models
{
    // 数登申请声明：包括创作目的、创作过程、独创性和字体申明
    public class DciExplanationInfo : TeaModel {
        // 创作目的，描述作品创作的目的
        [NameInMap("creation_purpose")]
        [Validation(Required=true)]
        public string CreationPurpose { get; set; }

        // 创作过程，具体的创作过程
        [NameInMap("creation_process")]
        [Validation(Required=true)]
        public string CreationProcess { get; set; }

        // 阐述作品的独创性
        [NameInMap("originality")]
        [Validation(Required=true)]
        public string Originality { get; set; }

        // 创作过程涉及到字体使用相关版权说明
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
