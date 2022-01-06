// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // Drm日志
    public class DrmLog : TeaModel {
        // 触发推送客户端IP
        [NameInMap("client_ip")]
        [Validation(Required=false)]
        public string ClientIp { get; set; }

        // 资源标识
        [NameInMap("data_id")]
        [Validation(Required=false)]
        public string DataId { get; set; }

        // 推送失败目标
        [NameInMap("fail_target")]
        [Validation(Required=false)]
        public string FailTarget { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 实例ID
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 操作者
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 推送类型
        [NameInMap("push_mode")]
        [Validation(Required=false)]
        public string PushMode { get; set; }

        // 推送结果
        [NameInMap("result")]
        [Validation(Required=false)]
        public string Result { get; set; }

        // 来源应用
        [NameInMap("source_app")]
        [Validation(Required=false)]
        public string SourceApp { get; set; }

        // 目标
        [NameInMap("target")]
        [Validation(Required=false)]
        public string Target { get; set; }

        // 推送值
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

    }

}
