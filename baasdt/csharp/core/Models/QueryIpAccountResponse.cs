// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryIpAccountResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 该用户的在外部系统的用户Id
        [NameInMap("external_user_id")]
        [Validation(Required=false)]
        public string ExternalUserId { get; set; }

        // 该用户的在外部系统的用户名称
        [NameInMap("external_user_name")]
        [Validation(Required=false)]
        public string ExternalUserName { get; set; }

        // 1:版权方 2: 版权采购商 
        [NameInMap("role")]
        [Validation(Required=false)]
        public long? Role { get; set; }

        // 用户状态(0:初始化, 1:申请流程中, 2:可用, 3:被冻结)
        // 买家: 链上账户注册成功即为可用状态。
        // 卖家: 链上账户注册成功为初始化状态, 申请期间涉及2层审核皆为审核流程中状态, 支付宝审核通过即为可用状态。
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

    }

}
