// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // BuildpackRegionRelationDetail
    public class BuildpackRegionRelationDetail : TeaModel {
        // buildpackId
        [NameInMap("buildpack_id")]
        [Validation(Required=false)]
        public string BuildpackId { get; set; }

        // buildpackTenantId
        [NameInMap("buildpack_tenant_id")]
        [Validation(Required=false)]
        public string BuildpackTenantId { get; set; }

        // creationTime
        [NameInMap("creation_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string CreationTime { get; set; }

        // fileChecksum
        [NameInMap("file_checksum")]
        [Validation(Required=false)]
        public string FileChecksum { get; set; }

        // fileLocation
        [NameInMap("file_location")]
        [Validation(Required=false)]
        public string FileLocation { get; set; }

        // fileSize
        [NameInMap("file_size")]
        [Validation(Required=false)]
        public long? FileSize { get; set; }

        // fileStatus
        [NameInMap("file_status")]
        [Validation(Required=false)]
        public string FileStatus { get; set; }

        // fromRegionId
        [NameInMap("from_region_id")]
        [Validation(Required=false)]
        public string FromRegionId { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // modificationTime
        [NameInMap("modification_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string ModificationTime { get; set; }

        // objectName
        [NameInMap("object_name")]
        [Validation(Required=false)]
        public string ObjectName { get; set; }

        // originalFileName
        [NameInMap("original_file_name")]
        [Validation(Required=false)]
        public string OriginalFileName { get; set; }

        // readableFileSize
        [NameInMap("readable_file_size")]
        [Validation(Required=false)]
        public string ReadableFileSize { get; set; }

        // RegionDto
        [NameInMap("region")]
        [Validation(Required=false)]
        public Region Region { get; set; }

    }

}
