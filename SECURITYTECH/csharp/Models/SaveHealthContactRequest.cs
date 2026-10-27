// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class SaveHealthContactRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 品牌方渠道标识
        [NameInMap("channel_id")]
        [Validation(Required=true)]
        public string ChannelId { get; set; }

        // 设备唯一id
        [NameInMap("tuid")]
        [Validation(Required=true)]
        public string Tuid { get; set; }

        // 联系人业务id -为空时新增/不为空时编辑
        [NameInMap("contact_id")]
        [Validation(Required=false)]
        public string ContactId { get; set; }

        // 键位设置优先级（1=红键, 2=黄键, 3=绿键）
        [NameInMap("priority")]
        [Validation(Required=true)]
        public long? Priority { get; set; }

        // 联系人名称
        [NameInMap("contact_name")]
        [Validation(Required=true)]
        public string ContactName { get; set; }

        // 呼叫联系人手机号
        [NameInMap("contact_phone")]
        [Validation(Required=true)]
        public string ContactPhone { get; set; }

        // 是否锁定 - 锁定时不允许c端用户修改联系人信息，可通过此接口修改相关信息以及解锁
        [NameInMap("locked")]
        [Validation(Required=true)]
        public bool? Locked { get; set; }

        // 预留可扩展字段
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

    }

}
