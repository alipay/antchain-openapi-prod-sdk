// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAM.Models
{
    // aces产品
    public class AcesProduct : TeaModel {
        //  
        [NameInMap("cn_name")]
        [Validation(Required=true)]
        public string CnName { get; set; }

        //  
        [NameInMap("en_name")]
        [Validation(Required=false)]
        public string EnName { get; set; }

        //  
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 产品owner
        [NameInMap("owner")]
        [Validation(Required=false)]
        public string Owner { get; set; }

        // 产品创建时间
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public string CreateTime { get; set; }

        // 产品修改时间
        [NameInMap("update_time")]
        [Validation(Required=true)]
        public string UpdateTime { get; set; }

        //  
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        //  
        [NameInMap("l1")]
        [Validation(Required=false)]
        public string L1 { get; set; }

        //  
        [NameInMap("l2")]
        [Validation(Required=false)]
        public string L2 { get; set; }

    }

}
