// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 用户通行证详情
    public class XrUserTicketDetail : TeaModel {
        // 业务类型
        [NameInMap("biz_scene")]
        [Validation(Required=true)]
        public string BizScene { get; set; }

        // 所属客户
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 用户通行证编码
        [NameInMap("xr_ticket_code")]
        [Validation(Required=true)]
        public string XrTicketCode { get; set; }

        // xr通行证资源池名称
        [NameInMap("xr_ticket_pool_name")]
        [Validation(Required=true)]
        public string XrTicketPoolName { get; set; }

        // 用户id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 资源id
        [NameInMap("resource_id")]
        [Validation(Required=true)]
        public string ResourceId { get; set; }

        // 资源名称
        [NameInMap("resource_name")]
        [Validation(Required=true)]
        public string ResourceName { get; set; }

        // 用户通行证状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 有效期
        [NameInMap("valid_time")]
        [Validation(Required=true)]
        public string ValidTime { get; set; }

        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 核销时间
        [NameInMap("xr_verification_time")]
        [Validation(Required=false)]
        public string XrVerificationTime { get; set; }

        // 体验开始时间
        [NameInMap("sample_start_time")]
        [Validation(Required=false)]
        public string SampleStartTime { get; set; }

        // 体验结束时间
        [NameInMap("sample_end_time")]
        [Validation(Required=false)]
        public string SampleEndTime { get; set; }

        // 核销类型
        [NameInMap("xr_verification_type")]
        [Validation(Required=true)]
        public string XrVerificationType { get; set; }

        // 实例名称
        [NameInMap("instance_name")]
        [Validation(Required=false)]
        public string InstanceName { get; set; }

        // 体验时长，分
        [NameInMap("test_time")]
        [Validation(Required=true)]
        public string TestTime { get; set; }

        // vr应用集合
        [NameInMap("xr_apps")]
        [Validation(Required=false)]
        public string XrApps { get; set; }

    }

}
