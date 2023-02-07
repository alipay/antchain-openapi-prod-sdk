// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // AppPortraitAppGroupList
    public class AppPortraitAppGroupList : TeaModel {
        // 应用分组id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 应用分组名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
