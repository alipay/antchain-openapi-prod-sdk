// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class QueryOpsplanAppprogressResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 应用发布进度详情
        [NameInMap("app_deploy_progress")]
        [Validation(Required=false)]
        public AppDeployProgress AppDeployProgress { get; set; }

        // [huanyu场景使用] 查询涉及的部署单元及pod详情列表
        [NameInMap("affected_cell_pods")]
        [Validation(Required=false)]
        public List<AppDeployCell> AffectedCellPods { get; set; }

        // [huanyu场景使用] json格式的变更对象信息列表
        [NameInMap("opscloud_change_target_json_str")]
        [Validation(Required=false)]
        public string OpscloudChangeTargetJsonStr { get; set; }

    }

}
