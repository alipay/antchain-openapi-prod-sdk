// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class AuthBusinessDepositdataCorpRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 被授权的存证数据所在的链
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 被授权者的did数字身份
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 授权的截止日期，超过该日期后，该组织不再具有访问加密数据的权限
        [NameInMap("due_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DueTime { get; set; }

        // 被授权的组织名
        [NameInMap("granted_corp")]
        [Validation(Required=true)]
        public string GrantedCorp { get; set; }

        // 被授权的字段
        [NameInMap("item_key_id")]
        [Validation(Required=true)]
        public List<string> ItemKeyId { get; set; }

        // 被授权的存证内容逻辑主键
        [NameInMap("key_id")]
        [Validation(Required=true)]
        public string KeyId { get; set; }

    }

}
