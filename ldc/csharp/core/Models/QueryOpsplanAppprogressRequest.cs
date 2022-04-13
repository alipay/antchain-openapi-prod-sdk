// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class QueryOpsplanAppprogressRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 应用id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 运维单id
        [NameInMap("time_series_id")]
        [Validation(Required=false)]
        public string TimeSeriesId { get; set; }

        // 批次stage的id
        [NameInMap("stage_id")]
        [Validation(Required=false)]
        public string StageId { get; set; }

        // [huanyu场景使用] 是否需要返回affected_cell_pods
        [NameInMap("need_export_cell_pods")]
        [Validation(Required=false)]
        public bool? NeedExportCellPods { get; set; }

        // [huanyu场景使用] 返回给opscloud的变更对象类型。如果为NONE，则不返回变更对象信息
        [NameInMap("opscloud_change_target_type")]
        [Validation(Required=false)]
        public string OpscloudChangeTargetType { get; set; }

    }

}
