// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    //  
    public class XRule : TeaModel {
        // rule type
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        //  
        [NameInMap("interval")]
        [Validation(Required=true)]
        public long? Interval { get; set; }

        // rule timeout
        [NameInMap("timeout")]
        [Validation(Required=false)]
        public long? Timeout { get; set; }

        //  
        [NameInMap("external_tags")]
        [Validation(Required=false)]
        public List<XExpression> ExternalTags { get; set; }

        // log rules
        [NameInMap("rules")]
        [Validation(Required=false)]
        public List<XLogSubRule> Rules { get; set; }

        // metrics
        [NameInMap("metrics")]
        [Validation(Required=false)]
        public List<XExpression> Metrics { get; set; }

        // prometheus port
        [NameInMap("port")]
        [Validation(Required=false)]
        public long? Port { get; set; }

        // prometheus path
        [NameInMap("path")]
        [Validation(Required=false)]
        public string Path { get; set; }

        //  
        [NameInMap("scheme")]
        [Validation(Required=false)]
        public string Scheme { get; set; }

        //  
        [NameInMap("method")]
        [Validation(Required=false)]
        public string Method { get; set; }

        // tcp ports
        [NameInMap("ports")]
        [Validation(Required=false)]
        public List<long?> Ports { get; set; }

        //  
        [NameInMap("tags")]
        [Validation(Required=false)]
        public List<XExpression> Tags { get; set; }

        //  
        [NameInMap("expression")]
        [Validation(Required=false)]
        public string Expression { get; set; }

        //  
        [NameInMap("target")]
        [Validation(Required=false)]
        public XMatchExpression Target { get; set; }

        //  
        [NameInMap("local_host")]
        [Validation(Required=false)]
        public bool? LocalHost { get; set; }

        //   
        [NameInMap("ca_file")]
        [Validation(Required=false)]
        public string CaFile { get; set; }

        //  
        [NameInMap("cert_file")]
        [Validation(Required=false)]
        public string CertFile { get; set; }

        //  
        [NameInMap("key_file")]
        [Validation(Required=false)]
        public string KeyFile { get; set; }

        //  
        [NameInMap("bearer_token_file")]
        [Validation(Required=false)]
        public string BearerTokenFile { get; set; }

        //  
        [NameInMap("insecure_skip_verify")]
        [Validation(Required=false)]
        public bool? InsecureSkipVerify { get; set; }

    }

}
