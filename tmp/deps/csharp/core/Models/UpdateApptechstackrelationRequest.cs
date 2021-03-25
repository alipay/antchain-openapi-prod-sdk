// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class UpdateApptechstackrelationRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // appId
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // buildpackArch
        [NameInMap("buildpack_arch")]
        [Validation(Required=false)]
        public string BuildpackArch { get; set; }

        // creationTime
        [NameInMap("creation_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string CreationTime { get; set; }

        // extraInfo
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // modificationTime
        [NameInMap("modification_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string ModificationTime { get; set; }

        // techstackId
        [NameInMap("techstack_id")]
        [Validation(Required=false)]
        public long? TechstackId { get; set; }

        // techstackIdentity
        [NameInMap("techstack_identity")]
        [Validation(Required=false)]
        public string TechstackIdentity { get; set; }

        // techstackName
        [NameInMap("techstack_name")]
        [Validation(Required=false)]
        public string TechstackName { get; set; }

    }

}
