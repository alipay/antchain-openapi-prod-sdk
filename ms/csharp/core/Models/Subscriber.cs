// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 消费者信息
    public class Subscriber : TeaModel {
        // 订阅端是否存活，默认1-存活，订阅端下线标记为0，默认1
        // 
        [NameInMap("alive")]
        [Validation(Required=false)]
        public bool? Alive { get; set; }

        // 应用名
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 校验值
        // 
        [NameInMap("check_sum")]
        [Validation(Required=false)]
        public string CheckSum { get; set; }

        // 服务id
        // 
        [NameInMap("data_id")]
        [Validation(Required=false)]
        public string DataId { get; set; }

        // 创建日期
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 最后更新时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 发布这个服务的主机的 ip，不同于 service_ip
        [NameInMap("host_ip")]
        [Validation(Required=false)]
        public string HostIp { get; set; }

        // 消费者id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 租户实例id
        // 
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 进程ID
        // 
        [NameInMap("process_id")]
        [Validation(Required=false)]
        public string ProcessId { get; set; }

        // 订阅者的订阅维度
        [NameInMap("scope")]
        [Validation(Required=false)]
        public string Scope { get; set; }

        // 订阅端订阅时使用的 zone
        [NameInMap("zone")]
        [Validation(Required=false)]
        public string Zone { get; set; }

    }

}
