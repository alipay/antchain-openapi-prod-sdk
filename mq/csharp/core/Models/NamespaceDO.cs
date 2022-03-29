// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // namespace
    public class NamespaceDO : TeaModel {
        // gmt_create
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public string GmtCreate { get; set; }

        // gmt_modified
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public string GmtModified { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // instance type
        [NameInMap("instance_type")]
        [Validation(Required=false)]
        public string InstanceType { get; set; }

        // namespace name
        [NameInMap("namespace_name")]
        [Validation(Required=true)]
        public string NamespaceName { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

        // workspace group
        [NameInMap("workspace_group")]
        [Validation(Required=false)]
        public string WorkspaceGroup { get; set; }

        // ldcMode
        [NameInMap("ldc_mode")]
        [Validation(Required=true)]
        public long? LdcMode { get; set; }

    }

}
