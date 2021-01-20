// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryRmsAgentbrowserRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // app_name
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // extra_suffixs
        [NameInMap("extra_suffixs")]
        [Validation(Required=false)]
        public List<string> ExtraSuffixs { get; set; }

        // scan_dirs
        [NameInMap("scan_dirs")]
        [Validation(Required=false)]
        public List<string> ScanDirs { get; set; }

        // prefer_host
        [NameInMap("prefer_host")]
        [Validation(Required=false)]
        public string PreferHost { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

    }

}
