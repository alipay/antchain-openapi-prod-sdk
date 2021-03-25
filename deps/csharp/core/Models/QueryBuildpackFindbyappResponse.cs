// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class QueryBuildpackFindbyappResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // bgEnable
        [NameInMap("bg_enable")]
        [Validation(Required=false)]
        public bool? BgEnable { get; set; }

        // buildpackArch
        [NameInMap("buildpack_arch")]
        [Validation(Required=false)]
        public string BuildpackArch { get; set; }

        // buildScriptId
        [NameInMap("build_script_id")]
        [Validation(Required=false)]
        public string BuildScriptId { get; set; }

        // commandId
        [NameInMap("command_id")]
        [Validation(Required=false)]
        public string CommandId { get; set; }

        // componentId
        [NameInMap("component_id")]
        [Validation(Required=false)]
        public string ComponentId { get; set; }

        // configId
        [NameInMap("config_id")]
        [Validation(Required=false)]
        public string ConfigId { get; set; }

        // creator
        [NameInMap("creator")]
        [Validation(Required=false)]
        public string Creator { get; set; }

        // customerIds
        [NameInMap("customer_ids")]
        [Validation(Required=false)]
        public List<string> CustomerIds { get; set; }

        // deployScriptId
        [NameInMap("deploy_script_id")]
        [Validation(Required=false)]
        public string DeployScriptId { get; set; }

        // des
        [NameInMap("des")]
        [Validation(Required=false)]
        public string Des { get; set; }

        // fullVersion
        [NameInMap("full_version")]
        [Validation(Required=false)]
        public string FullVersion { get; set; }

        // gmtCreate
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string GmtCreate { get; set; }

        // gmtModified
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string GmtModified { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // supportedOS
        [NameInMap("supported_o_s")]
        [Validation(Required=false)]
        public List<BuildpackOS> SupportedOS { get; set; }

        // supportedRegions
        [NameInMap("supported_regions")]
        [Validation(Required=false)]
        public List<BuildpackRegionRelationDetail> SupportedRegions { get; set; }

        // techstack
        [NameInMap("techstack")]
        [Validation(Required=false)]
        public Techstack Techstack { get; set; }

        // tenantId
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // utcCreate
        [NameInMap("utc_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcCreate { get; set; }

        // utcModified
        [NameInMap("utc_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcModified { get; set; }

        // version
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

    }

}
