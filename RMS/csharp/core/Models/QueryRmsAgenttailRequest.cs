// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryRmsAgenttailRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // app_name
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // prefer_host
        [NameInMap("prefer_host")]
        [Validation(Required=false)]
        public string PreferHost { get; set; }

        // full_path
        [NameInMap("full_path")]
        [Validation(Required=false)]
        public string FullPath { get; set; }

        // scan_dirs
        [NameInMap("scan_dirs")]
        [Validation(Required=false)]
        public List<string> ScanDirs { get; set; }

        // need_bytes
        [NameInMap("need_bytes")]
        [Validation(Required=false)]
        public long? NeedBytes { get; set; }

        // line_break_str
        [NameInMap("line_break_str")]
        [Validation(Required=false)]
        public string LineBreakStr { get; set; }

        // extra_suffixs
        [NameInMap("extra_suffixs")]
        [Validation(Required=false)]
        public List<string> ExtraSuffixs { get; set; }

        // charset_str
        [NameInMap("charset_str")]
        [Validation(Required=false)]
        public string CharsetStr { get; set; }

    }

}
