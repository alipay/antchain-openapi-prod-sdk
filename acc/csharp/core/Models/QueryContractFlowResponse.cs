// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class QueryContractFlowResponse : TeaModel {
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

        // 是否自动归档
        // 
        [NameInMap("auto_archive")]
        [Validation(Required=false)]
        public bool? AutoArchive { get; set; }

        // 文件主题
        // 
        [NameInMap("business_scene")]
        [Validation(Required=false)]
        public string BusinessScene { get; set; }

        // 业务码，0表示成功
        // 
        [NameInMap("code")]
        [Validation(Required=false)]
        public long? Code { get; set; }

        // 流程配置信息
        // 
        [NameInMap("config_info")]
        [Validation(Required=false)]
        public Contractsignflowconfig ConfigInfo { get; set; }

        // 文件到期前，提前多少小时提醒续签
        // 
        [NameInMap("contract_remind")]
        [Validation(Required=false)]
        public long? ContractRemind { get; set; }

        // 文件有效截止日期
        // 
        [NameInMap("contract_validity")]
        [Validation(Required=false)]
        public long? ContractValidity { get; set; }

        // 流程描述, 如果流程已拒签或已撤回, 并且存在拒签或撤回原因, 流程描述显示为原因, 否则默认为流程状态描述
        // 
        [NameInMap("flow_desc")]
        [Validation(Required=false)]
        public string FlowDesc { get; set; }

        // 流程结束时间
        // 
        [NameInMap("flow_end_time")]
        [Validation(Required=false)]
        public string FlowEndTime { get; set; }

        // 流程ID
        // 
        [NameInMap("flow_id")]
        [Validation(Required=false)]
        public string FlowId { get; set; }

        // 流程开始时间
        // 
        [NameInMap("flow_start_time")]
        [Validation(Required=false)]
        public string FlowStartTime { get; set; }

        // 流程状态,0-草稿 1-签署中 2-完成 3-撤销 4-终止 5-过期 6-删除 7-拒签
        // 
        [NameInMap("flow_status")]
        [Validation(Required=false)]
        public long? FlowStatus { get; set; }

        // 发起人账户id
        // 
        [NameInMap("initiator_account_id")]
        [Validation(Required=false)]
        public string InitiatorAccountId { get; set; }

        // 发起方主体id
        // 
        [NameInMap("initiator_authorized_account_id")]
        [Validation(Required=false)]
        public string InitiatorAuthorizedAccountId { get; set; }

        // 业务码信息
        // 
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 签署有效截止日期
        [NameInMap("sign_validity")]
        [Validation(Required=false)]
        public string SignValidity { get; set; }

    }

}
