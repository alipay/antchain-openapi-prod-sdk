// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryLeaseUserResponse : TeaModel {
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

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 用户登录名，租赁平台会员ID/若支付宝ID必传 长度不可超过50
        [NameInMap("login_id")]
        [Validation(Required=false)]
        public string LoginId { get; set; }

        // 用户登录名类型 1.商户会员2.支付宝3.其他
        [NameInMap("login_type")]
        [Validation(Required=false)]
        public string LoginType { get; set; }

        // 用户登录时间 格式为2019-8-31 12:00:00
        [NameInMap("login_time")]
        [Validation(Required=false)]
        public string LoginTime { get; set; }

        // 承租人姓名，加密返回
        [NameInMap("user_name")]
        [Validation(Required=false)]
        public string UserName { get; set; }

        // 承租人身份证号，加密返回
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 承租人手机号
        [NameInMap("user_phone_number")]
        [Validation(Required=false)]
        public string UserPhoneNumber { get; set; }

        // 身份认证类型 1支付宝实人，2芝麻实人，3非蚂蚁实人
        [NameInMap("user_type")]
        [Validation(Required=false)]
        public string UserType { get; set; }

        // 承租人支付宝账号信息
        [NameInMap("alipay_uid")]
        [Validation(Required=false)]
        public string AlipayUid { get; set; }

        // 出租企业名称
        [NameInMap("lease_corp_name")]
        [Validation(Required=false)]
        public string LeaseCorpName { get; set; }

        // 出租企业法人名称
        [NameInMap("lease_corp_owner_name")]
        [Validation(Required=false)]
        public string LeaseCorpOwnerName { get; set; }

        // 承租企业统一社会信用代码 长度不可超过50
        [NameInMap("lease_corp_id")]
        [Validation(Required=false)]
        public string LeaseCorpId { get; set; }

        // 错误码
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 错误信息描述
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

    }

}
