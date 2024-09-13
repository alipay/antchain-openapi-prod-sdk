// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MEDIA_SMS.Models
{
    // 素材
    public class SmsMaterial : TeaModel {
        // 素材名称，当素材类型
        // 为"text/plain"时可不传，其他情况必传
        [NameInMap("material_name")]
        [Validation(Required=false)]
        public string MaterialName { get; set; }

        // 素材类型
        // 本期最多只⽀持⼀张图⽚和⼀段⽂本信息；变量占位符只能是按顺序的数字{1}-{9},最多⽀持9个变量；链接中的变量只能放在尾部，如：http://aabbcc/{1}
        [NameInMap("material_type")]
        [Validation(Required=true)]
        public string MaterialType { get; set; }

        // 素材内容
        [NameInMap("material_content")]
        [Validation(Required=true)]
        public string MaterialContent { get; set; }

    }

}
