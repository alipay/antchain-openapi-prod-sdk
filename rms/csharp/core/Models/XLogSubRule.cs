// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // LogSubRule
    public class XLogSubRule : TeaModel {
        // log path
        [NameInMap("path")]
        [Validation(Required=false)]
        public string Path { get; set; }

        //  
        [NameInMap("metrics")]
        [Validation(Required=true)]
        public List<XExpression> Metrics { get; set; }

        //  
        [NameInMap("rule_tags")]
        [Validation(Required=false)]
        public List<XExpression> RuleTags { get; set; }

        // 白名单
        [NameInMap("include_lines")]
        [Validation(Required=false)]
        public List<XExpression> IncludeLines { get; set; }

        //  
        [NameInMap("exclude_lines")]
        [Validation(Required=false)]
        public List<XExpression> ExcludeLines { get; set; }

        // x
        [NameInMap("paths")]
        [Validation(Required=false)]
        public List<string> Paths { get; set; }

        // x
        [NameInMap("path_link_prefix")]
        [Validation(Required=false)]
        public string PathLinkPrefix { get; set; }

        //  
        [NameInMap("path_expression")]
        [Validation(Required=false)]
        public XExpression PathExpression { get; set; }

    }

}
