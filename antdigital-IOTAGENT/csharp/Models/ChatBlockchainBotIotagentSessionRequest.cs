// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class ChatBlockchainBotIotagentSessionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 智能体id
        [NameInMap("agent_id")]
        [Validation(Required=true)]
        public string AgentId { get; set; }

        // 会话id
        [NameInMap("session_id")]
        [Validation(Required=true)]
        public string SessionId { get; set; }

        // 用户ID
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 会话类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 问题（新建模式必填；携 resume 续接时互斥不传）
        [NameInMap("query")]
        [Validation(Required=false)]
        public string Query { get; set; }

        // 附件
        [NameInMap("attach_files")]
        [Validation(Required=false)]
        public List<FileInfo> AttachFiles { get; set; }

        // josn字符串
        [NameInMap("extra_params")]
        [Validation(Required=false)]
        public string ExtraParams { get; set; }

        // 续接结构体 JSON（系分 §8.1.1）：{turnId 必填, afterSequence 可选, command 可选={type:DECIDE/ANSWER/CANCEL, expectedVersion, payload}}；payload 键 camelCase：DECIDE={interactionId,decision,scope} ANSWER={interactionId,answer} CANCEL={reason}
        [NameInMap("resume")]
        [Validation(Required=false)]
        public string Resume { get; set; }

        // 用户侧模型选择（§8.1.2）：本地模型目录稳定键（如 dtmaas/deepseek-flash），独立顶层参数唯一入口；仅新建 Turn 可传，省略沿默认配置，空/非法值拒绝；不得经 extra_params 携带
        [NameInMap("model_key")]
        [Validation(Required=false)]
        public string ModelKey { get; set; }

        // 用户侧思考等级选择（§8.1.2）：受控选项，须为选中模型目录声明 supported_efforts 内取值（model.list 返回），非法值拒绝；仅新建 Turn 可传，不得经 extra_params 携带
        [NameInMap("reasoning_effort")]
        [Validation(Required=false)]
        public string ReasoningEffort { get; set; }

    }

}
