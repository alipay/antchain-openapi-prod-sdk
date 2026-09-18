// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 商户入驻-执照有效期
    public class MaoLicenseValidPeriod : TeaModel {
        // 营业执照有效期-起
        /// <summary>
        /// <b>Example:</b>
        /// <para>营业执照有效期-起</para>
        /// </summary>
        [NameInMap("start_date")]
        [Validation(Required=false)]
        public string StartDate { get; set; }

        // 营业执照有效期-止
        /// <summary>
        /// <b>Example:</b>
        /// <para>营业执照有效期-止</para>
        /// </summary>
        [NameInMap("end_date")]
        [Validation(Required=false)]
        public string EndDate { get; set; }

    }

}
