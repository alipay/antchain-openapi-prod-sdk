// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_d3c4f09125a14cd587057c405561809a.Models
{
    // 所有系统操作日志
    public class OperationLogVO : TeaModel {
        // ID主键
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 创建时间戳（毫秒）
        [NameInMap("gmt_created")]
        [Validation(Required=false)]
        public long? GmtCreated { get; set; }

        // 更新时间戳（毫秒）
        [NameInMap("gmt_modified")]
        [Validation(Required=false)]
        public long? GmtModified { get; set; }

        // 用户id
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 用户地址
        [NameInMap("user_address")]
        [Validation(Required=false)]
        public string UserAddress { get; set; }

        // 发起操作的URL接口
        [NameInMap("request_url")]
        [Validation(Required=false)]
        public string RequestUrl { get; set; }

        // 发起操作的URL接口描述code值
        [NameInMap("api_desc")]
        [Validation(Required=false)]
        public string ApiDesc { get; set; }

        // 发起操作的URL接口中文描述
        [NameInMap("ch_desc")]
        [Validation(Required=false)]
        public string ChDesc { get; set; }

        // 设备信息
        [NameInMap("device_info")]
        [Validation(Required=false)]
        public string DeviceInfo { get; set; }

        // 设备Hash
        [NameInMap("device_hash")]
        [Validation(Required=false)]
        public string DeviceHash { get; set; }

        // 操作种类
        [NameInMap("operation_type")]
        [Validation(Required=false)]
        public string OperationType { get; set; }

        // 请求输入
        [NameInMap("request_input")]
        [Validation(Required=false)]
        public string RequestInput { get; set; }

        // 请求输出
        [NameInMap("request_output")]
        [Validation(Required=false)]
        public string RequestOutput { get; set; }

        // 操作状态：true/false
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        // 操作来源
        [NameInMap("request_from")]
        [Validation(Required=false)]
        public string RequestFrom { get; set; }

        // 发起IP地址
        [NameInMap("ip")]
        [Validation(Required=false)]
        public string Ip { get; set; }

        // 扩展字段
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

        // 登录名类型(EMAIL)
        [NameInMap("login_account_type")]
        [Validation(Required=false)]
        public string LoginAccountType { get; set; }

        // 登录名
        [NameInMap("login_account")]
        [Validation(Required=false)]
        public string LoginAccount { get; set; }

    }

}
