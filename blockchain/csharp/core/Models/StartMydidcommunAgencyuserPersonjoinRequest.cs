// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartMydidcommunAgencyuserPersonjoinRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 身份证号码
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 事件通知地址
        [NameInMap("notification_url")]
        [Validation(Required=true)]
        public string NotificationUrl { get; set; }

        // 公钥	
        [NameInMap("public_key")]
        [Validation(Required=true)]
        public string PublicKey { get; set; }

        // 恢复公钥	
        [NameInMap("recover_key")]
        [Validation(Required=true)]
        public string RecoverKey { get; set; }

        // 选择的TAPP列表
        [NameInMap("tapp_info_list")]
        [Validation(Required=false)]
        public List<ChoiceTappInfo> TappInfoList { get; set; }

        // 业务码，接入时需要找数据隐私服务分配
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

    }

}
