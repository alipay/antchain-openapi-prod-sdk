// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAM.Models
{
    //  
    public class Upload : TeaModel {
        //  
        [NameInMap("endpoint")]
        [Validation(Required=true)]
        public string Endpoint { get; set; }

        //  
        [NameInMap("file_unique_id")]
        [Validation(Required=true)]
        public string FileUniqueId { get; set; }

        //  
        [NameInMap("file_url")]
        [Validation(Required=true)]
        public string FileUrl { get; set; }

        //  
        [NameInMap("form_param")]
        [Validation(Required=true)]
        public FormParam FormParam { get; set; }

    }

}
