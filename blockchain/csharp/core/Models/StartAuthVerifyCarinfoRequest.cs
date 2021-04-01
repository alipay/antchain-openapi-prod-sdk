// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartAuthVerifyCarinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 长度不超过64字符的业务唯一ID，用于对一个业务流的追踪，查询等。
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 业务类型，通常需要与授权宝服务沟通确定，业务类型可能影响此接口内部实现逻辑，长度不超过32字符。
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 加密前身份证号最后一位为字母 X 时，请使用大写 X，SHA256 加密字符串(小写)，身份证需 18
        // 岁以上。
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 保留字段，待扩展使用的JSON字符串内容
        [NameInMap("extension")]
        [Validation(Required=false)]
        public string Extension { get; set; }

        // 车牌号加密前车牌字母均为大写，SHA256 的加密后字符串(小写字母)
        [NameInMap("license_no")]
        [Validation(Required=true)]
        public string LicenseNo { get; set; }

        // 目标用户姓名的SHA256计算结果(小写字母)
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 姓名和身份证号拼接之后，SHA256加密的结果(小写字母)，身份证最后一位为字母 X 时， 请使用大写 X，加密后 SHA256 的 字符串(小写)， 身份证需 18 岁以上。
        [NameInMap("two_meta")]
        [Validation(Required=true)]
        public string TwoMeta { get; set; }

    }

}
