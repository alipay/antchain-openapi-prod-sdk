// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTLCOMMONCENTER.Models
{
    public class UpdateProductRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 产品线code
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // L1code
        [NameInMap("business_line")]
        [Validation(Required=true)]
        public string BusinessLine { get; set; }

        // L2code
        [NameInMap("product_line")]
        [Validation(Required=true)]
        public string ProductLine { get; set; }

        // 研发负责人
        [NameInMap("dev_leader")]
        [Validation(Required=false)]
        public string DevLeader { get; set; }

        // 研发参与人
        [NameInMap("devs")]
        [Validation(Required=false)]
        public string Devs { get; set; }

        // 产品负责人
        [NameInMap("pd_leader")]
        [Validation(Required=false)]
        public string PdLeader { get; set; }

        // 产品参与人
        [NameInMap("pds")]
        [Validation(Required=false)]
        public string Pds { get; set; }

        // 财务负责人
        [NameInMap("finance")]
        [Validation(Required=false)]
        public string Finance { get; set; }

        // 法务负责人
        [NameInMap("legal_owner")]
        [Validation(Required=false)]
        public string LegalOwner { get; set; }

        // 产管
        [NameInMap("product_assistant")]
        [Validation(Required=false)]
        public string ProductAssistant { get; set; }

    }

}
