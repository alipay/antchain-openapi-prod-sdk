// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_2d01ff274c3448c2b919937512c80f91.Models
{
    // 狗
    public class Dog : TeaModel {
        // 名字
        [NameInMap("name")]
        [Validation(Required=true, MaxLength=32)]
        public string Name { get; set; }

        // 年龄
        [NameInMap("age")]
        [Validation(Required=true)]
        public long? Age { get; set; }

        // 是否已领养
        [NameInMap("is_adopted")]
        [Validation(Required=true)]
        public bool? IsAdopted { get; set; }

        // 领养时间
        [NameInMap("adopted_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string AdoptedDate { get; set; }

        // 标记
        [NameInMap("marks")]
        [Validation(Required=false)]
        public List<string> Marks { get; set; }

    }

}
