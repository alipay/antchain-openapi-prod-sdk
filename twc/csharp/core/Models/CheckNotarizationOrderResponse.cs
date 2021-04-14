// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CheckNotarizationOrderResponse : TeaModel {
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

        // 下单的业务类型ID列表
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public List<string> BizId { get; set; }

        // 实人认证接口调用授权码，与公证订单一一对应，有效次数默认为3次，超过调用次数则失效
        [NameInMap("face_auth_code")]
        [Validation(Required=false)]
        public string FaceAuthCode { get; set; }

        // 下单客户的账号ID
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 是否为合法订单
        [NameInMap("valid")]
        [Validation(Required=false)]
        public bool? Valid { get; set; }

        // 平台公证机构ID
        [NameInMap("org_id")]
        [Validation(Required=false)]
        public string OrgId { get; set; }

    }

}
