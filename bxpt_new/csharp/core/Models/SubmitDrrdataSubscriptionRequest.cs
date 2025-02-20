// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BXPT_NEW.Models
{
    public class SubmitDrrdataSubscriptionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 业务类型
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 请求id
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 运单号
        [NameInMap("mail_no")]
        [Validation(Required=true)]
        public string MailNo { get; set; }

        // 快递公司编码
        [NameInMap("cp_code")]
        [Validation(Required=false)]
        public string CpCode { get; set; }

        // 自定义标签，可为备注
        [NameInMap("tag")]
        [Validation(Required=false)]
        public string Tag { get; set; }

        // 收、寄件人电话号码
        [NameInMap("phone")]
        [Validation(Required=false)]
        public string Phone { get; set; }

        // 出发地城市
        [NameInMap("from_city")]
        [Validation(Required=false)]
        public string FromCity { get; set; }

        // 目的地城市
        [NameInMap("to_city")]
        [Validation(Required=false)]
        public string ToCity { get; set; }

        // {}
        [NameInMap("biz_content")]
        [Validation(Required=false)]
        public string BizContent { get; set; }

    }

}
