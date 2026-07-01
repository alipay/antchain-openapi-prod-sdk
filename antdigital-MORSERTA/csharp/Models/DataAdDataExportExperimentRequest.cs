// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MORSERTA.Models
{
    public class DataAdDataExportExperimentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 广告主账户为数字，如“9471147”
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 开始时间 yyyyMMdd
        [NameInMap("start_day")]
        [Validation(Required=true)]
        public string StartDay { get; set; }

        // 结束时间 yyyyMMdd
        [NameInMap("end_day")]
        [Validation(Required=true)]
        public string EndDay { get; set; }

    }

}
