// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // WorkspaceZoneView
    public class WorkspaceZoneView : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // identity
        [NameInMap("identity")]
        [Validation(Required=true)]
        public string Identity { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // state
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

    }

}
