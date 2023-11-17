// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_be9ae52241c747408ac24bec8f036d74.Models
{
    public class SubmitAntchainPdcpJobPsiRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 项目ID
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 任务名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 任务类型，目前仅支持一种
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 任务的描述信息
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 任务执行参数，构造方式参考Participant结构体定义
        [NameInMap("participant_list")]
        [Validation(Required=true)]
        public List<PsiParticipantConfig> ParticipantList { get; set; }

    }

}
