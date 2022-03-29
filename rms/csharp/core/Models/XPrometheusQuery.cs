// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    //  
    public class XPrometheusQuery : TeaModel {
        //  
        [NameInMap("port")]
        [Validation(Required=true)]
        public long? Port { get; set; }

        //  
        [NameInMap("ip")]
        [Validation(Required=false)]
        public string Ip { get; set; }

        //  
        [NameInMap("path")]
        [Validation(Required=true)]
        public string Path { get; set; }

        //  
        [NameInMap("target")]
        [Validation(Required=false)]
        public XTarget Target { get; set; }

    }

}
