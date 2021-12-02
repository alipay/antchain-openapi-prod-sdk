// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAFECMDB.Models
{
    // 系统参数
    public class SystemParam : TeaModel {
        // description
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // key
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // value_type
        [NameInMap("value_type")]
        [Validation(Required=true)]
        public string ValueType { get; set; }

        // value_json
        [NameInMap("value_json")]
        [Validation(Required=true)]
        public string ValueJson { get; set; }

        // group_name
        [NameInMap("group_name")]
        [Validation(Required=true)]
        public string GroupName { get; set; }

    }

}
