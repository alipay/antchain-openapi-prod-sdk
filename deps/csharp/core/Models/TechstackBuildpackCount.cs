// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // TechstackBuildpackCount
    public class TechstackBuildpackCount : TeaModel {
        // buildpackCount
        [NameInMap("buildpack_count")]
        [Validation(Required=false)]
        public long? BuildpackCount { get; set; }

        // creation_time
        [NameInMap("creation_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string CreationTime { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // extra_info
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // identity
        [NameInMap("identity")]
        [Validation(Required=false)]
        public string Identity { get; set; }

        // modification_time
        [NameInMap("modification_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string ModificationTime { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // scope
        [NameInMap("scope")]
        [Validation(Required=false)]
        public string Scope { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
