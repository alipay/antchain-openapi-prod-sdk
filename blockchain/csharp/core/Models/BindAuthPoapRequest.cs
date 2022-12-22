// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class BindAuthPoapRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 长度不超过64字符的业务流水唯一id，可作幂等处理
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 徽章元数据ID
        [NameInMap("poap_meta_id")]
        [Validation(Required=true)]
        public string PoapMetaId { get; set; }

        // 支付宝UID，2088开头
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 用户真实姓名
        [NameInMap("user_name")]
        [Validation(Required=false)]
        public string UserName { get; set; }

        // 用户手机号
        [NameInMap("user_cert_no")]
        [Validation(Required=false)]
        public string UserCertNo { get; set; }

        // 用户手机号
        [NameInMap("user_mobile")]
        [Validation(Required=false)]
        public string UserMobile { get; set; }

        // 定制id会有白名单进行权限限制。id格式要求：长度6-20，允许字母、数字、部分特殊字符(_#:|)
        [NameInMap("poap_id")]
        [Validation(Required=false)]
        public string PoapId { get; set; }

        // 徽章关联权益时，用户领取权益的动作类型
        [NameInMap("profit_action")]
        [Validation(Required=false)]
        public string ProfitAction { get; set; }

        // 徽章关联权益时，用户领取权益的地址
        [NameInMap("profit_url")]
        [Validation(Required=false)]
        public string ProfitUrl { get; set; }

        // 徽章关联权益时附带信息，buttonName为自定义领取按钮名称，needAuth为是否需要授权，authId为授权请求id，authBizId为授权请求场景id
        [NameInMap("payload")]
        [Validation(Required=false)]
        public string Payload { get; set; }

    }

}
