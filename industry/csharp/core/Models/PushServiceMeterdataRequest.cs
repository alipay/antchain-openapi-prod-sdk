// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INDUSTRY.Models
{
    public class PushServiceMeterdataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 业务唯一单据号，最大64
        [NameInMap("biz_no")]
        [Validation(Required=true, MaxLength=64)]
        public string BizNo { get; set; }

        // 来源场景码, 由中台分配给业务方
        [NameInMap("source")]
        [Validation(Required=true, MaxLength=32)]
        public string Source { get; set; }

        // 行业渠道码(由经支中台分配给业务方)
        [NameInMap("channel")]
        [Validation(Required=true, MaxLength=32)]
        public string Channel { get; set; }

        // 业务发生时间
        [NameInMap("gmt_service")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtService { get; set; }

        // 服务唯一标识码
        [NameInMap("service_code")]
        [Validation(Required=true, MaxLength=32)]
        public string ServiceCode { get; set; }

        // 如果是金额，请填写分；如果是次数，请填写整数
        [NameInMap("service_amount")]
        [Validation(Required=true, MaxLength=32)]
        public string ServiceAmount { get; set; }

        // 服务量单位，如果是金额，请填写币种value(exp:156),如果是次数/个,填写UU
        [NameInMap("service_unit")]
        [Validation(Required=true, MaxLength=16)]
        public string ServiceUnit { get; set; }

        // 业务标题
        [NameInMap("service_subject")]
        [Validation(Required=true, MaxLength=128)]
        public string ServiceSubject { get; set; }

        // 业务详细内容
        [NameInMap("service_body")]
        [Validation(Required=false, MaxLength=512)]
        public string ServiceBody { get; set; }

        // 会员id;如果是商户，那么是商户uid,如果是用户，那么是会员id
        [NameInMap("user_id")]
        [Validation(Required=true, MaxLength=32)]
        public string UserId { get; set; }

        // 基本与user_id保持一致
        [NameInMap("buyer_id")]
        [Validation(Required=true, MaxLength=32)]
        public string BuyerId { get; set; }

        // 卖家id,用于代收付场景
        [NameInMap("seller_id")]
        [Validation(Required=false, MaxLength=32)]
        public string SellerId { get; set; }

        // 扩展属性字段
        [NameInMap("properties")]
        [Validation(Required=true, MaxLength=512)]
        public string Properties { get; set; }

    }

}
