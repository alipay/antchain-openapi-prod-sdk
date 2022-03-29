// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // UserAuthRsp
    public class UserAuthRsp : TeaModel {
        // powers
        [NameInMap("powers")]
        [Validation(Required=true)]
        public List<LongListKeySet> Powers { get; set; }

        // bd_powers
        [NameInMap("bd_powers")]
        [Validation(Required=true)]
        public List<LongListKeySet> BdPowers { get; set; }

        // w_powers
        [NameInMap("w_powers")]
        [Validation(Required=true)]
        public List<LongListKeySet> WPowers { get; set; }

        // t_powers
        [NameInMap("t_powers")]
        [Validation(Required=true)]
        public List<LongListKeySet> TPowers { get; set; }

        // super_admin
        [NameInMap("super_admin")]
        [Validation(Required=true)]
        public bool? SuperAdmin { get; set; }

        // super_view
        [NameInMap("super_view")]
        [Validation(Required=true)]
        public bool? SuperView { get; set; }

        // biz_domains
        [NameInMap("biz_domains")]
        [Validation(Required=true)]
        public List<BizDomain> BizDomains { get; set; }

        // auth_url
        [NameInMap("auth_url")]
        [Validation(Required=true)]
        public string AuthUrl { get; set; }

    }

}
