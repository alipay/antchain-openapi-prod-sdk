// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 一个应用发布包视图
    public class AppPackageListView : TeaModel {
        // appId
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // appName
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // packageCount
        [NameInMap("package_count")]
        [Validation(Required=false)]
        public long? PackageCount { get; set; }

        // buildpackId
        [NameInMap("buildpack_id")]
        [Validation(Required=false)]
        public string BuildpackId { get; set; }

        // buildpackName
        [NameInMap("buildpack_name")]
        [Validation(Required=false)]
        public string BuildpackName { get; set; }

        // buildpackVersion
        [NameInMap("buildpack_version")]
        [Validation(Required=false)]
        public string BuildpackVersion { get; set; }

        // appOwnerId
        [NameInMap("app_owner_id")]
        [Validation(Required=false)]
        public string AppOwnerId { get; set; }

        // appOwnerName
        [NameInMap("app_owner_name")]
        [Validation(Required=false)]
        public string AppOwnerName { get; set; }

        // latestPackage
        [NameInMap("latest_package")]
        [Validation(Required=false)]
        public AppManifest LatestPackage { get; set; }

        // appStatus
        [NameInMap("app_status")]
        [Validation(Required=false)]
        public string AppStatus { get; set; }

    }

}
