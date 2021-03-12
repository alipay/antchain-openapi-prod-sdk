// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartMydidcommunInstitutionSettleinRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 入驻时选择的业务码，这个码需要在机构入驻时与数据隐私服务确认之后填写
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

        // 机构唯一编号
        [NameInMap("institiution_no")]
        [Validation(Required=false)]
        public string InstitiutionNo { get; set; }

        // 机构实际名称
        [NameInMap("institution_name")]
        [Validation(Required=true)]
        public string InstitutionName { get; set; }

        // 接受数据隐私服务回调通知的URL，如果地址是https的，那么该地址必须提供有效的证书
        [NameInMap("notification_url")]
        [Validation(Required=false)]
        public string NotificationUrl { get; set; }

        // 机构和数据隐私服务进行通讯的非对称密钥对中的公钥
        [NameInMap("public_key")]
        [Validation(Required=true)]
        public string PublicKey { get; set; }

        // 恢复密钥公钥，可用于以后修改通讯公钥用，不要和通讯公钥一样
        [NameInMap("recover_key")]
        [Validation(Required=true)]
        public string RecoverKey { get; set; }

    }

}
