// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAM.Models
{
    // 附件上传表单参数
    public class FormParam : TeaModel {
        //  
        [NameInMap("oss_access_key_id")]
        [Validation(Required=true)]
        public string OssAccessKeyId { get; set; }

        //  
        [NameInMap("callback")]
        [Validation(Required=true)]
        public string Callback { get; set; }

        //  
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        //  
        [NameInMap("policy")]
        [Validation(Required=true)]
        public string Policy { get; set; }

        //  
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

        //  
        [NameInMap("success_action_status")]
        [Validation(Required=true)]
        public string SuccessActionStatus { get; set; }

        //  
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

    }

}
