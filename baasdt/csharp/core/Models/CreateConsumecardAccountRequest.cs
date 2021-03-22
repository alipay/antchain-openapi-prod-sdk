// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class CreateConsumecardAccountRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
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

        // 业务系统幂等Id,防止同一笔交易重复发送(接入方传入)
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 认证方id(如: 支付宝的用户Id)
        [NameInMap("certification_id")]
        [Validation(Required=true)]
        public string CertificationId { get; set; }

        // 支持多链多合约,该参数为指明需要操作哪个智能合约环境
        [NameInMap("chain_id")]
        [Validation(Required=true)]
        public string ChainId { get; set; }

        // 手机号国家编码
        [NameInMap("country_code")]
        [Validation(Required=true)]
        public string CountryCode { get; set; }

        // 账户描述
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

        // 开户影像信息（BASE64格式传入）
        [NameInMap("image")]
        [Validation(Required=true)]
        public string Image { get; set; }

        // 外部系统传入的交易备注信息(必填)
        [NameInMap("memo")]
        [Validation(Required=true)]
        public string Memo { get; set; }

        // 邮箱地址(机构注册必传)
        [NameInMap("email")]
        [Validation(Required=false)]
        public string Email { get; set; }

        // 个人用户的手机号码/机构用户的联系电话(必填)
        [NameInMap("phone_number")]
        [Validation(Required=true)]
        public string PhoneNumber { get; set; }

        // 场景码(需要申请)
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 平台归属机构的链上账户Id(账户可以归属在一个机构下)
        [NameInMap("relegation_account_id")]
        [Validation(Required=false)]
        public string RelegationAccountId { get; set; }

        // 角色(1 机构, 2 个人)
        [NameInMap("role_type")]
        [Validation(Required=true)]
        public long? RoleType { get; set; }

        // 外部系统对该个人用户/机构的内部编号,用于唯一识别该用户
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

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
