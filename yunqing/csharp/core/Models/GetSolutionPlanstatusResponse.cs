// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class GetSolutionPlanstatusResponse : TeaModel {
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

        // 是否完成规划
        [NameInMap("all_plan_confirmed")]
        [Validation(Required=false)]
        public bool? AllPlanConfirmed { get; set; }

        // sidecar规划状态
        [NameInMap("sidecar_plan_status")]
        [Validation(Required=false)]
        public string SidecarPlanStatus { get; set; }

        // 持久化存储规划状态
        [NameInMap("persistent_volume_plan_status")]
        [Validation(Required=false)]
        public string PersistentVolumePlanStatus { get; set; }

        // 数据库规划状态
        // 
        [NameInMap("db_plan_status")]
        [Validation(Required=false)]
        public string DbPlanStatus { get; set; }

        // 负载均衡规划
        [NameInMap("lb_plan_status")]
        [Validation(Required=false)]
        public string LbPlanStatus { get; set; }

        // 应用配置规划状态
        [NameInMap("app_deploy_spec_status")]
        [Validation(Required=false)]
        public string AppDeploySpecStatus { get; set; }

        // 解决方案检查项结果
        [NameInMap("check_point")]
        [Validation(Required=false)]
        public List<CheckPoint> CheckPoint { get; set; }

    }

}
