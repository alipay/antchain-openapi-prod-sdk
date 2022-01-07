// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DONPA.Models
{
    // 修复结果明细
    public class DetailInfo : TeaModel {
        // 修复人
        [NameInMap("person_data")]
        [Validation(Required=true)]
        public PersonData PersonData { get; set; }

        // “0”: 修复中，”1":修复失败,”2":修复成功,”3":修复出错
        [NameInMap("repair_status")]
        [Validation(Required=true)]
        public string RepairStatus { get; set; }

        // 修复结果过期时间
        [NameInMap("expire_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ExpireTime { get; set; }

        // 修复结果数
        [NameInMap("count")]
        [Validation(Required=true)]
        public long? Count { get; set; }

    }

}
