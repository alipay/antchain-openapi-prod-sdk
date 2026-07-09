// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class CertifyIotbasicDeviceResponse : TeaModel {
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

        // 设备名称
        [NameInMap("device_name")]
        [Validation(Required=false)]
        public string DeviceName { get; set; }

        // 设备型号
        [NameInMap("device_model")]
        [Validation(Required=false)]
        public string DeviceModel { get; set; }

        // 设备状态
        [NameInMap("device_status")]
        [Validation(Required=false)]
        public string DeviceStatus { get; set; }

        // 注册时间
        [NameInMap("register_time")]
        [Validation(Required=false)]
        public string RegisterTime { get; set; }

        // 客户名称
        [NameInMap("customer_name")]
        [Validation(Required=false)]
        public string CustomerName { get; set; }

        // 客户对应租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 客户端版本
        [NameInMap("app_version")]
        [Validation(Required=false)]
        public string AppVersion { get; set; }

        // 服务状态
        [NameInMap("service_status")]
        [Validation(Required=false)]
        public string ServiceStatus { get; set; }

        // 子账号ID
        [NameInMap("account_id")]
        [Validation(Required=false)]
        public string AccountId { get; set; }

        // 所属账号名称
        [NameInMap("account_name")]
        [Validation(Required=false)]
        public string AccountName { get; set; }

        // 子账号角色
        [NameInMap("user_role")]
        [Validation(Required=false)]
        public string UserRole { get; set; }

    }

}
