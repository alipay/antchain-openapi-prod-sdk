// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 一个应用发布包视图
    public class AppPackageListView : TeaModel {
        // app_id
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // app_name
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // app_owner_id
        [NameInMap("app_owner_id")]
        [Validation(Required=false)]
        public string AppOwnerId { get; set; }

        // app_owner_name
        [NameInMap("app_owner_name")]
        [Validation(Required=false)]
        public string AppOwnerName { get; set; }

        // app_status
        [NameInMap("app_status")]
        [Validation(Required=false)]
        public string AppStatus { get; set; }

        // buildpack_id
        [NameInMap("buildpack_id")]
        [Validation(Required=false)]
        public string BuildpackId { get; set; }

        // buildpack_name
        [NameInMap("buildpack_name")]
        [Validation(Required=false)]
        public string BuildpackName { get; set; }

        // buildpack_version
        [NameInMap("buildpack_version")]
        [Validation(Required=false)]
        public string BuildpackVersion { get; set; }

        // latest_package
        [NameInMap("latest_package")]
        [Validation(Required=false)]
        public AppManifest LatestPackage { get; set; }

        // package_count
        [NameInMap("package_count")]
        [Validation(Required=false)]
        public long? PackageCount { get; set; }

    }

}
