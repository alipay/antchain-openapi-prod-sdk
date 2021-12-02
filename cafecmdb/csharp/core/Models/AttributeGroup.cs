// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAFECMDB.Models
{
    // 字段组
    public class AttributeGroup : TeaModel {
        // id
        [NameInMap("unique_id")]
        [Validation(Required=true)]
        public string UniqueId { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // display_name
        [NameInMap("display_name")]
        [Validation(Required=false)]
        public string DisplayName { get; set; }

        // display_properties
        [NameInMap("display_properties")]
        [Validation(Required=false)]
        public string DisplayProperties { get; set; }

    }

}
