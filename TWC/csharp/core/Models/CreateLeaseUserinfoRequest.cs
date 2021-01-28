// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateLeaseUserinfoRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 支付宝账号信息
        [NameInMap("alipay_uid")]
        [Validation(Required=true)]
        public string AlipayUid { get; set; }

        // 融资租赁业务id，由资方控制台生成返回
        [NameInMap("application_id")]
        [Validation(Required=false)]
        public string ApplicationId { get; set; }

        // 是否启动异步
        [NameInMap("async")]
        [Validation(Required=false)]
        public long? Async { get; set; }

        // 融资租赁用户信息额外字段
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 承租企业统一社会信用代码 长度不可超过50
        [NameInMap("lease_corp_id")]
        [Validation(Required=true)]
        public string LeaseCorpId { get; set; }

        // 承租企业名称 长度不可超过50
        [NameInMap("lease_corp_name")]
        [Validation(Required=true)]
        public string LeaseCorpName { get; set; }

        // 承租法定代表人姓名 长度不可超过50
        [NameInMap("lease_corp_owner_name")]
        [Validation(Required=true)]
        public string LeaseCorpOwnerName { get; set; }

        // 用户登录名，租赁平台会员ID/支付宝ID 长度不可超过50
        [NameInMap("login_id")]
        [Validation(Required=true)]
        public string LoginId { get; set; }

        // 用户登录时间 格式为2019-8-31 12:00:00
        [NameInMap("login_time")]
        [Validation(Required=true)]
        public string LoginTime { get; set; }

        // 用户登录名类型 1.商户会员2.支付宝3.其他
        [NameInMap("login_type")]
        [Validation(Required=true)]
        public long? LoginType { get; set; }

        // 订单id 长度不可超过50
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 区块链认证Hash，若为支付宝实人，必填
        [NameInMap("user_blockchain_verify_hash")]
        [Validation(Required=false)]
        public string UserBlockchainVerifyHash { get; set; }

        // 承租人电子邮件，法院/仲裁电子送达必填项，长度不超过5
        [NameInMap("user_email")]
        [Validation(Required=false)]
        public string UserEmail { get; set; }

        // 承租人身份证
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 承租人身份证照片哈希
        [NameInMap("user_image_hash")]
        [Validation(Required=true)]
        public string UserImageHash { get; set; }

        // 承租人身份证照片存证交易哈希
        [NameInMap("user_image_tx_hash")]
        [Validation(Required=true)]
        public string UserImageTxHash { get; set; }

        // 承租人姓名 长度不可超过10
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 承租人手机号
        [NameInMap("user_phone_number")]
        [Validation(Required=true)]
        public string UserPhoneNumber { get; set; }

        // 身份认证类型 1支付宝实人，2芝麻实人，3非蚂蚁实人
        [NameInMap("user_type")]
        [Validation(Required=true)]
        public long? UserType { get; set; }

        // 额外通知第三方，如果需要通知相关方外的第三方，需要在此设置关联方的租户id，若不设置则只通知资方
        [NameInMap("related_notify")]
        [Validation(Required=false)]
        public List<string> RelatedNotify { get; set; }

    }

}
