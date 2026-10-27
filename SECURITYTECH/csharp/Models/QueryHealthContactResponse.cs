// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class QueryHealthContactResponse : TeaModel {
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

        // 品牌方渠道标识
        [NameInMap("channe_id")]
        [Validation(Required=false)]
        public string ChanneId { get; set; }

        // 设备唯一id
        [NameInMap("tuid")]
        [Validation(Required=false)]
        public string Tuid { get; set; }

        // 联系人业务id
        [NameInMap("contact_id")]
        [Validation(Required=false)]
        public string ContactId { get; set; }

        // 键位设置优先级（1=红键, 2=黄键, 3=绿键）
        [NameInMap("priority")]
        [Validation(Required=false)]
        public long? Priority { get; set; }

        // 联系人姓名
        [NameInMap("contact_name")]
        [Validation(Required=false)]
        public string ContactName { get; set; }

        // 联系人手机号
        [NameInMap("contact_phone")]
        [Validation(Required=false)]
        public string ContactPhone { get; set; }

        // 是否锁定 - 锁定时不允许c端用户修改联系人信息
        [NameInMap("locked")]
        [Validation(Required=false)]
        public bool? Locked { get; set; }

        // 预留可扩展字段
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

    }

}
