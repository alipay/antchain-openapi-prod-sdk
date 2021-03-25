// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // DeploymentCell
    public class DeploymentCell : TeaModel {
        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 部署单元 id
        [NameInMap("cell_ids")]
        [Validation(Required=false)]
        public List<string> CellIds { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

    }

}
