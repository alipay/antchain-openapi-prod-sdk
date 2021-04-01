// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class UpdateConsumecardAccountRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 授权函地址
        [NameInMap("authorization_address")]
        [Validation(Required=false)]
        public string AuthorizationAddress { get; set; }

        // 是否有采购/消费权限
        [NameInMap("auth_consumer")]
        [Validation(Required=true)]
        public bool? AuthConsumer { get; set; }

        // 是否有供应权限
        [NameInMap("auth_provider")]
        [Validation(Required=true)]
        public bool? AuthProvider { get; set; }

        // 请求参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequest BaseRequest { get; set; }

        // 认证方id
        [NameInMap("certification_id")]
        [Validation(Required=true)]
        public string CertificationId { get; set; }

        // 商户描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 个人用户的身份证号码/机构的企业编号
        [NameInMap("id_number")]
        [Validation(Required=true)]
        public string IdNumber { get; set; }

        // 证件类型：0 身份证, 1 护照, 2 军官证, 3 回乡证, 4 港澳证件, 5 营业执照, 6 港澳居民来往内地通行证, 7 台湾居民来往内地通行证, 8 港澳居民居住证, 9 台湾居民居住证, 10事业单位登记证书, 11 社会团体登记证书, 12 民办非企业单位证书, 13 党政机关批准设计文件, 14 全国组织机构代码证书, 15 其他证件
        [NameInMap("id_type")]
        [Validation(Required=true)]
        public long? IdType { get; set; }

        // 账户映像资料
        [NameInMap("image")]
        [Validation(Required=true)]
        public string Image { get; set; }

        // 邮箱地址(机构注册必传)
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 个人用户的手机号码/机构用户的联系电话(必填)
        [NameInMap("phone_number")]
        [Validation(Required=true)]
        public string PhoneNumber { get; set; }

        // 个人用户姓名/机构名称
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 提现银行卡
        [NameInMap("withdraw_bank_card_id")]
        [Validation(Required=false)]
        public string WithdrawBankCardId { get; set; }

    }

}
