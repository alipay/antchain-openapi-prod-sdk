// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryInnerAntesignResponse : TeaModel {
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

        // 业务流水号
        [NameInMap("biz_no")]
        [Validation(Required=false)]
        public string BizNo { get; set; }

        // 签署流水id
        [NameInMap("sign_flow_id")]
        [Validation(Required=false)]
        public string SignFlowId { get; set; }

        // 签署子任务结果
        [NameInMap("ant_sign_task_result_list")]
        [Validation(Required=false)]
        public List<AntSignTaskResult> AntSignTaskResultList { get; set; }

        // 总状态INIT-初始化
        // SIGNING-签署中
        // FINISH-已完成
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 应用方来源信息
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 租户信息
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

        // 签署中心流程id
        [NameInMap("sign_center_id")]
        [Validation(Required=false)]
        public string SignCenterId { get; set; }

    }

}
