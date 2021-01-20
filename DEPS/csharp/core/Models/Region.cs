// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // Region
    public class Region : TeaModel {
        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // iaasProviderId
        [NameInMap("iaas_provider_id")]
        [Validation(Required=false)]
        public string IaasProviderId { get; set; }

        // region名称
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // identity
        [NameInMap("identity")]
        [Validation(Required=false)]
        public string Identity { get; set; }

        // region显示名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // networkType
        [NameInMap("network_type")]
        [Validation(Required=false)]
        public string NetworkType { get; set; }

        // state
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

        // utcCreate
        [NameInMap("utc_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcCreate { get; set; }

        // utcModified
        [NameInMap("utc_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcModified { get; set; }

        // zoneDtos
        [NameInMap("zone_dtos")]
        [Validation(Required=false)]
        public string ZoneDtos { get; set; }

        // buildpackId
        [NameInMap("buildpack_id")]
        [Validation(Required=false)]
        public string BuildpackId { get; set; }

        // fileStatus
        [NameInMap("file_status")]
        [Validation(Required=false)]
        public string FileStatus { get; set; }

        // fileLocation
        [NameInMap("file_location")]
        [Validation(Required=false)]
        public string FileLocation { get; set; }

        // objectName
        [NameInMap("object_name")]
        [Validation(Required=false)]
        public string ObjectName { get; set; }

        // fileSize
        [NameInMap("file_size")]
        [Validation(Required=false)]
        public long? FileSize { get; set; }

        // readableFileSize
        [NameInMap("readable_file_size")]
        [Validation(Required=false)]
        public string ReadableFileSize { get; set; }

        // fileChecksum
        [NameInMap("file_checksum")]
        [Validation(Required=false)]
        public string FileChecksum { get; set; }

        // originalFileName
        [NameInMap("original_file_name")]
        [Validation(Required=false)]
        public string OriginalFileName { get; set; }

        // buildpackTenantId
        [NameInMap("buildpack_tenant_id")]
        [Validation(Required=false)]
        public string BuildpackTenantId { get; set; }

        // fromRegionId
        [NameInMap("from_region_id")]
        [Validation(Required=false)]
        public string FromRegionId { get; set; }

        // creationTime
        [NameInMap("creation_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string CreationTime { get; set; }

        // modificationTime
        [NameInMap("modification_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string ModificationTime { get; set; }

    }

}
