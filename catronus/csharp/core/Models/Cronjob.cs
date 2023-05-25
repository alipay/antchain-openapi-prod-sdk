// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    // cronjob
    public class Cronjob : TeaModel {
        // crontab格式表述的cronjob
        [NameInMap("crontab")]
        [Validation(Required=false)]
        public string Crontab { get; set; }

    }

}
