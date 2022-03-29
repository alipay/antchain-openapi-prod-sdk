// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryRmsAgenttailRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // app_name
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // prefer_host
        [NameInMap("prefer_host")]
        [Validation(Required=true)]
        public string PreferHost { get; set; }

        // full_path
        [NameInMap("full_path")]
        [Validation(Required=true)]
        public string FullPath { get; set; }

        // scan_dirs
        [NameInMap("scan_dirs")]
        [Validation(Required=true)]
        public List<string> ScanDirs { get; set; }

        // need_bytes
        [NameInMap("need_bytes")]
        [Validation(Required=true)]
        public long? NeedBytes { get; set; }

        // line_break_str
        [NameInMap("line_break_str")]
        [Validation(Required=true)]
        public string LineBreakStr { get; set; }

        // extra_suffixs
        [NameInMap("extra_suffixs")]
        [Validation(Required=true)]
        public List<string> ExtraSuffixs { get; set; }

        // charset_str
        [NameInMap("charset_str")]
        [Validation(Required=true)]
        public string CharsetStr { get; set; }

    }

}
