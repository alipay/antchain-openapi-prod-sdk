// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DONPA.Models
{
    public class BatchqueryMyslxfRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 修复批次ID
        [NameInMap("batch_id")]
        [Validation(Required=true)]
        public string BatchId { get; set; }

        // 查询修复人的列表
        [NameInMap("repair_people_list")]
        [Validation(Required=true)]
        public List<PersonData> RepairPeopleList { get; set; }

    }

}
