// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // AppServiceEnvParam
    public class AppServiceEnvParam : TeaModel {
        // app_id
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // app_service_id
        [NameInMap("app_service_id")]
        [Validation(Required=false)]
        public string AppServiceId { get; set; }

        // baseline_buildpack_id
        [NameInMap("baseline_buildpack_id")]
        [Validation(Required=false)]
        public string BaselineBuildpackId { get; set; }

        // creation_time
        [NameInMap("creation_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string CreationTime { get; set; }

        // default_value
        [NameInMap("default_value")]
        [Validation(Required=false)]
        public string DefaultValue { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // key
        [NameInMap("key")]
        [Validation(Required=false)]
        public string Key { get; set; }

        // modification_time
        [NameInMap("modification_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string ModificationTime { get; set; }

        // original_default_value
        [NameInMap("original_default_value")]
        [Validation(Required=false)]
        public string OriginalDefaultValue { get; set; }

        // original_description
        [NameInMap("original_description")]
        [Validation(Required=false)]
        public string OriginalDescription { get; set; }

        // original_readonly
        [NameInMap("original_readonly")]
        [Validation(Required=false)]
        public string OriginalReadonly { get; set; }

        // original_required
        [NameInMap("original_required")]
        [Validation(Required=false)]
        public bool? OriginalRequired { get; set; }

        // readonly
        [NameInMap("readonly")]
        [Validation(Required=false)]
        public bool? Readonly { get; set; }

        // required
        [NameInMap("required")]
        [Validation(Required=false)]
        public bool? Required { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // value
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

    }

}
