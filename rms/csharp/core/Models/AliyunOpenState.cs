// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 阿里云开通信息
    public class AliyunOpenState : TeaModel {
        // 阿里云用户ID
        [NameInMap("aliyun_user_id")]
        [Validation(Required=true)]
        public long? AliyunUserId { get; set; }

        // 阿里云实例ID
        [NameInMap("aliyun_instance_id")]
        [Validation(Required=true)]
        public string AliyunInstanceId { get; set; }

        // 监控租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public long? TenantId { get; set; }

        // 监控租户名称
        [NameInMap("tenant_name")]
        [Validation(Required=true)]
        public string TenantName { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public long? GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public long? GmtModified { get; set; }

        // 开通状态，0未开通，1开通
        [NameInMap("state")]
        [Validation(Required=true)]
        public long? State { get; set; }

    }

}
