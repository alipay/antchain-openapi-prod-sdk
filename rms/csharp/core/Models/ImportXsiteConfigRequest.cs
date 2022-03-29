// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class ImportXsiteConfigRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        //  
        [NameInMap("workspace_name")]
        [Validation(Required=false)]
        public string WorkspaceName { get; set; }

        //  
        [NameInMap("data")]
        [Validation(Required=true)]
        public XSiteExportData Data { get; set; }

        // 替换前的字符串
        [NameInMap("origin")]
        [Validation(Required=false)]
        public string Origin { get; set; }

        // 替换后的字符串
        [NameInMap("replaced")]
        [Validation(Required=false)]
        public string Replaced { get; set; }

    }

}
