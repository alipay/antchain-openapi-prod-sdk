// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 消费卡账户
    public class ConsumeCardAccount : TeaModel {
        // 授权函地址
        [NameInMap("authorization_address")]
        [Validation(Required=true)]
        public string AuthorizationAddress { get; set; }

        // 认证方id
        [NameInMap("certification_id")]
        [Validation(Required=true)]
        public string CertificationId { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 分布式身份ID
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 是否有权限采购商品
        [NameInMap("auth_consumer")]
        [Validation(Required=true)]
        public bool? AuthConsumer { get; set; }

        // 是否有权限发行商品
        [NameInMap("auth_provider")]
        [Validation(Required=true)]
        public bool? AuthProvider { get; set; }

        // 个人用户的身份证号码/机构的企业编号
        [NameInMap("id_number")]
        [Validation(Required=true)]
        public string IdNumber { get; set; }

        // 证件类型：0 身份证, 1 护照, 2 军官证, 3 回乡证, 4 港澳证件, 5 营业执照, 6 港澳居民来往内地通行证, 7 台湾居民来往内地通行证, 8 港澳居民居住证, 9 台湾居民居住证, 10事业单位登记证书, 11 社会团体登记证书, 12 民办非企业单位证书, 13 党政机关批准设计文件, 14 全国组织机构代码证书, 15 其他证件
        [NameInMap("id_type")]
        [Validation(Required=true)]
        public long? IdType { get; set; }

        // 个人用户的手机号码/机构用户的联系电话或邮箱(必填)
        [NameInMap("phone_number")]
        [Validation(Required=true)]
        public string PhoneNumber { get; set; }

        // 商户状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 是否可以发行资产
        [NameInMap("token_issuer")]
        [Validation(Required=true)]
        public bool? TokenIssuer { get; set; }

        // 账户创建类型（0:用户，1:商户）
        [NameInMap("type")]
        [Validation(Required=true)]
        public long? Type { get; set; }

        // 账户ID
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 账户名称
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 提现银行卡
        [NameInMap("withdraw_bank_card_id")]
        [Validation(Required=true)]
        public string WithdrawBankCardId { get; set; }

        // 账户影响信息
        [NameInMap("image")]
        [Validation(Required=true)]
        public string Image { get; set; }

        // 账户邮箱
        [NameInMap("email")]
        [Validation(Required=true)]
        public string Email { get; set; }

    }

}
