// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_2abe765c32934341bd9bb6cc1c8ff589.Models
{
    // 同步订单中的下单人信息
    public class UserSyncInfo : TeaModel {
        // 外部同步的订单 id
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=50)]
        public string OrderId { get; set; }

        // 用户登录名，租赁平台会员ID/若支付宝ID必传
        [NameInMap("login_id")]
        [Validation(Required=true, MaxLength=50)]
        public string LoginId { get; set; }

        // 户登录名类型 1.商户会员2.支付宝3.其他
        [NameInMap("login_type")]
        [Validation(Required=true)]
        public long? LoginType { get; set; }

        // 用户登录时间 格式为2019-08-31 12:00:00
        [NameInMap("login_time")]
        [Validation(Required=true, MaxLength=32)]
        public string LoginTime { get; set; }

        // 租赁人姓名，这里是用户通过公钥加密后的密文
        [NameInMap("user_name")]
        [Validation(Required=true, MaxLength=500)]
        public string UserName { get; set; }

        // 租赁人身份证，这里是用户通过公钥加密后的密文
        [NameInMap("user_id")]
        [Validation(Required=true, MaxLength=500)]
        public string UserId { get; set; }

        // 承租人手机号，这里是用户通过公钥加密后的密文
        [NameInMap("user_phone_number")]
        [Validation(Required=true, MaxLength=500)]
        public string UserPhoneNumber { get; set; }

        // 身份认证类型 1支付宝实人，2芝麻实人，3非蚂蚁实人
        [NameInMap("user_type")]
        [Validation(Required=true, MaxLength=2)]
        public string UserType { get; set; }

        // 支付宝账号信息
        [NameInMap("alipay_uid")]
        [Validation(Required=true, MaxLength=64)]
        public string AlipayUid { get; set; }

        // 出租企业名称
        [NameInMap("lease_corp_name")]
        [Validation(Required=true, MaxLength=50)]
        public string LeaseCorpName { get; set; }

        // 出租企业统一社会信用代码
        [NameInMap("lease_corp_id")]
        [Validation(Required=true, MaxLength=50)]
        public string LeaseCorpId { get; set; }

        // 出租法定代表人姓名
        [NameInMap("lease_corp_owner_name")]
        [Validation(Required=true, MaxLength=50)]
        public string LeaseCorpOwnerName { get; set; }

        // 1.企业用户 2.个人用户
        [NameInMap("lessee_type")]
        [Validation(Required=true)]
        public long? LesseeType { get; set; }

        // 营业执照对应的名称
        [NameInMap("leased_enterprise")]
        [Validation(Required=false, MaxLength=50)]
        public string LeasedEnterprise { get; set; }

        // 租赁⼈身份证照⽚正⾯地址
        [NameInMap("user_image_url")]
        [Validation(Required=false, MaxLength=1000)]
        public string UserImageUrl { get; set; }

        // 租赁⼈身份证照⽚反⾯地址
        [NameInMap("user_back_image_url")]
        [Validation(Required=false, MaxLength=1000)]
        public string UserBackImageUrl { get; set; }

        // 平台注册的电话，这里是用户通过公钥加密后的密文
        [NameInMap("registered_telephone_number")]
        [Validation(Required=false, MaxLength=500)]
        public string RegisteredTelephoneNumber { get; set; }

        // 承租企业实际控制人（股东/法人）身份证号
        [NameInMap("actual_controller_id")]
        [Validation(Required=false, MaxLength=500)]
        public string ActualControllerId { get; set; }

        // 承租企业实际控制人（股东/法人）手机号。若为企业类型必填，字段长度：不超过 500
        [NameInMap("actual_controller_number")]
        [Validation(Required=false)]
        public string ActualControllerNumber { get; set; }

        // 承租企业实际控制人（股东/法人）姓名，若为企业类型必填
        [NameInMap("actual_controller_name")]
        [Validation(Required=false, MaxLength=1000)]
        public string ActualControllerName { get; set; }

        // 承租企业实际控制人（股东/法人）身份证正面地址，若为企业类型必填
        [NameInMap("actual_controller_image_url")]
        [Validation(Required=false, MaxLength=50)]
        public string ActualControllerImageUrl { get; set; }

        // 承租企业实际控制人（股东/法人）身份证反面地址
        [NameInMap("actual_controller_back_image_url")]
        [Validation(Required=false, MaxLength=1000)]
        public string ActualControllerBackImageUrl { get; set; }

        // 承租企业实际控制人（股东/法人）手机号
        [NameInMap("actual_controller_telephone_number")]
        [Validation(Required=false, MaxLength=12)]
        public string ActualControllerTelephoneNumber { get; set; }

        // 承租企业统⼀社会信⽤代码
        [NameInMap("business_license_number")]
        [Validation(Required=false, MaxLength=50)]
        public string BusinessLicenseNumber { get; set; }

        // 承租企业统一社会信用代码
        [NameInMap("businesslicense_url")]
        [Validation(Required=false)]
        public string BusinesslicenseUrl { get; set; }

        // 承租企业法定代表人姓名
        [NameInMap("legal_representative")]
        [Validation(Required=false, MaxLength=20)]
        public string LegalRepresentative { get; set; }

        //  资方定义的其他额外字段，以json形式传递
        [NameInMap("extra_info")]
        [Validation(Required=false, MaxLength=2000)]
        public string ExtraInfo { get; set; }

    }

}
