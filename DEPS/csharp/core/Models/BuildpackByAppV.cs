// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 通过appid查到的buildpack
    public class BuildpackByAppV : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // des
        [NameInMap("des")]
        [Validation(Required=false)]
        public string Des { get; set; }

        // version
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

        // deployScriptId
        [NameInMap("deploy_script_id")]
        [Validation(Required=false)]
        public string DeployScriptId { get; set; }

        // buildScriptId
        [NameInMap("build_script_id")]
        [Validation(Required=false)]
        public string BuildScriptId { get; set; }

        // configId
        [NameInMap("config_id")]
        [Validation(Required=false)]
        public string ConfigId { get; set; }

        // componentId
        [NameInMap("component_id")]
        [Validation(Required=false)]
        public string ComponentId { get; set; }

        // commandId
        [NameInMap("command_id")]
        [Validation(Required=false)]
        public string CommandId { get; set; }

        // bgEnable
        [NameInMap("bg_enable")]
        [Validation(Required=false)]
        public bool? BgEnable { get; set; }

        // creator
        [NameInMap("creator")]
        [Validation(Required=false)]
        public string Creator { get; set; }

        // tenantId
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // customerIds
        [NameInMap("customer_ids")]
        [Validation(Required=false)]
        public string CustomerIds { get; set; }

        // gmtCreate
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string GmtCreate { get; set; }

        // gmtModified
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string GmtModified { get; set; }

        // resultMsg
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // utcCreate
        [NameInMap("utc_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcCreate { get; set; }

        // utcModified
        [NameInMap("utc_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcModified { get; set; }

    }

}
