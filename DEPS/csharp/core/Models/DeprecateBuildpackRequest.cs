// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class DeprecateBuildpackRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // depracationNoteMap
        [NameInMap("depracation_note_map")]
        [Validation(Required=false)]
        public DepracationNotePayload DepracationNoteMap { get; set; }

        // ids
        [NameInMap("id")]
        [Validation(Required=false)]
        public List<string> Id { get; set; }

    }

}
