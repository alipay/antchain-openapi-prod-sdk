// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 答辩人对象
    public class PleaderObject : TeaModel {
        // 法人或自然人标识，法人为1，自然人为0
        [NameInMap("party_type")]
        [Validation(Required=true)]
        public long? PartyType { get; set; }

        // 自然人信息
        // 当partyType=1必填
        [NameInMap("natural_person")]
        [Validation(Required=false)]
        public NaturalPerson NaturalPerson { get; set; }

        // 法人信息
        // 当partyType=0必填
        [NameInMap("legal_person")]
        [Validation(Required=false)]
        public LegalPerson LegalPerson { get; set; }

    }

}
