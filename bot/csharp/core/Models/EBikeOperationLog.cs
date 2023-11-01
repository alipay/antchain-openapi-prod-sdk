// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 二轮车操作日志
    public class EBikeOperationLog : TeaModel {
        // 日志时间
        [NameInMap("time")]
        [Validation(Required=true)]
        public string Time { get; set; }

        // 租户
        [NameInMap("tenant")]
        [Validation(Required=true)]
        public string Tenant { get; set; }

        // 小程序应用Id
        [NameInMap("app_id")]
        [Validation(Required=true)]
        public string AppId { get; set; }

        // 用户id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 设备id
        [NameInMap("device_id")]
        [Validation(Required=false)]
        public string DeviceId { get; set; }

        // 操作时间
        [NameInMap("operate_time")]
        [Validation(Required=true)]
        public string OperateTime { get; set; }

        // 操作描述
        [NameInMap("operate_desc")]
        [Validation(Required=true)]
        public string OperateDesc { get; set; }

        // 操作是否成功
        [NameInMap("success")]
        [Validation(Required=true)]
        public bool? Success { get; set; }

        // 日志等级(info、warn、error)
        [NameInMap("level")]
        [Validation(Required=false)]
        public string Level { get; set; }

    }

}
