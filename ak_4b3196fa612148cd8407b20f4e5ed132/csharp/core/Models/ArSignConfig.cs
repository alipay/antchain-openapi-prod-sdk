// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_4b3196fa612148cd8407b20f4e5ed132.Models
{
    // 电子签约相关配置
    public class ArSignConfig : TeaModel {
        // 签约者类型，比如：BANK=银行
        [NameInMap("ar_signer_type")]
        [Validation(Required=false)]
        public string ArSignerType { get; set; }

        // 签署区列表
        [NameInMap("ar_sign_fields")]
        [Validation(Required=false)]
        public List<ArSignField> ArSignFields { get; set; }

        // 签署人
        [NameInMap("signer")]
        [Validation(Required=false)]
        public Person Signer { get; set; }

    }

}
