// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DONPA.Models
{
    public class StartMyslxfRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 待修复人列表
        [NameInMap("repair_people_list")]
        [Validation(Required=true)]
        public List<PersonData> RepairPeopleList { get; set; }

    }

}
