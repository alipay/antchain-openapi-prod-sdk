// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class UploadUmktOfflinedecisionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 离线圈客计划id
        [NameInMap("offline_decision_plan_id")]
        [Validation(Required=true)]
        public long? OfflineDecisionPlanId { get; set; }

        // 文件模版信息
        [NameInMap("file_template")]
        [Validation(Required=true)]
        public string FileTemplate { get; set; }

        // 文件id，网关文件上传自动装填
        /// <summary>
        /// 待上传文件
        /// </summary>
        [NameInMap("fileObject")]
        [Validation(Required=false)]
        public Stream FileObject { get; set; }

        /// <summary>
        /// 待上传文件名
        /// </summary>
        [NameInMap("fileObjectName")]
        [Validation(Required=false)]
        public string FileObjectName { get; set; }

        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // 非必填, 默认OFFLINE_DECISION
        [NameInMap("relation_type")]
        [Validation(Required=false)]
        public string RelationType { get; set; }

        // 任务执行uuid
        [NameInMap("task_uuid")]
        [Validation(Required=false)]
        public string TaskUuid { get; set; }

    }

}
