// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCESAAS.Models
{
    public class PostbackAntcloudInsuranceLeadReceiveRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // string
        /// <summary>
        /// <para>待上传文件</para>
        /// </summary>
        [NameInMap("fileObject")]
        [Validation(Required=false)]
        public Stream FileObject { get; set; }

        /// <summary>
        /// <para>待上传文件名</para>
        /// </summary>
        [NameInMap("fileObjectName")]
        [Validation(Required=false)]
        public string FileObjectName { get; set; }

        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // 请求id，每一次请求保持唯一，若重复，则报错；
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 通知类型：固定 LEAD_PUSH_NOTIFY（既往症线索推送通知）
        [NameInMap("notify_type")]
        [Validation(Required=true)]
        public string NotifyType { get; set; }

        // 动作类型：首次-FULL_PUSH，周期-TRIGGER_PUSH
        [NameInMap("action_type")]
        [Validation(Required=true)]
        public string ActionType { get; set; }

        // json格式数据updateCycle等字段
        [NameInMap("notify_info")]
        [Validation(Required=false)]
        public string NotifyInfo { get; set; }

        // 客户「既往症线索周期变更」受理号透传，供给方回传结果文件时随请求带回
        [NameInMap("accept_no")]
        [Validation(Required=true)]
        public string AcceptNo { get; set; }

    }

}
