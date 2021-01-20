// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // AppServiceBuildpackRelation
    public class AppServiceBuildpackRelation : TeaModel {
        // app_id
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // app_service_id
        [NameInMap("app_service_id")]
        [Validation(Required=false)]
        public string AppServiceId { get; set; }

        // buildpack_arch
        [NameInMap("buildpack_arch")]
        [Validation(Required=false)]
        public string BuildpackArch { get; set; }

        // buildpack_full_version
        [NameInMap("buildpack_full_version")]
        [Validation(Required=false)]
        public string BuildpackFullVersion { get; set; }

        // buildpack_id
        [NameInMap("buildpack_id")]
        [Validation(Required=false)]
        public string BuildpackId { get; set; }

        // creation_time
        [NameInMap("creation_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string CreationTime { get; set; }

        // extra_info
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // modification_time
        [NameInMap("modification_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string ModificationTime { get; set; }

        // techstack_id
        [NameInMap("techstack_id")]
        [Validation(Required=false)]
        public long? TechstackId { get; set; }

        // techstack_identity
        [NameInMap("techstack_identity")]
        [Validation(Required=false)]
        public string TechstackIdentity { get; set; }

        // techstack_name
        [NameInMap("techstack_name")]
        [Validation(Required=false)]
        public string TechstackName { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

    }

}
