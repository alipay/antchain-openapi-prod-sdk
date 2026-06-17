// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryContractSignauthRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 企业/个人账号ID
        // 《平台方用户注册》返回的organizationId、userId
        [NameInMap("initiator_account_id")]
        [Validation(Required=true)]
        public string InitiatorAccountId { get; set; }

        // 授权至经办人模式下的被授权人个人账号账号ID（平台方用户注册返回的userId）
        // 注意：若指定授权经办人模式时需传入，查询企业授权经办人的有效期。
        [NameInMap("initiator_authorized_account_id")]
        [Validation(Required=false)]
        public string InitiatorAuthorizedAccountId { get; set; }

    }

}
