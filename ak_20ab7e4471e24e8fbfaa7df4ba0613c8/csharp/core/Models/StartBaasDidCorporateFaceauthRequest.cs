// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_20ab7e4471e24e8fbfaa7df4ba0613c8.Models
{
    public class StartBaasDidCorporateFaceauthRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 回调通知地址
        [NameInMap("call_back_url")]
        [Validation(Required=false)]
        public string CallBackUrl { get; set; }

        // 企业名称
        [NameInMap("ep_cert_name")]
        [Validation(Required=true)]
        public string EpCertName { get; set; }

        // 企业证件号
        [NameInMap("ep_cert_no")]
        [Validation(Required=true)]
        public string EpCertNo { get; set; }

        // 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码））
        [NameInMap("ep_cert_type")]
        [Validation(Required=true)]
        public string EpCertType { get; set; }

        // { "nation": "CN", //企业注册地址 "type": "LimitedCompany", //企业类型 "name": "演示用户名", //必选字段，企业名 "licenceNo": "1111", //营业执照 "address": "1111", //企业地址 "parentName": "", //<-必选字段 业务方名 需要提前协商 "linkType": "indirect", //<- 连接类型，direct直链企业， indirect间链企业 "certifyDate": "2019-1-1", //证书颁发时间 "licenceExpireDate": "2020-1-1", //证书到期时间 "businessScope": "1111", //企业经营范围 "businessAddress": "1111", //企业经营地址 "corporateBusinessType": 0, //<- 企业类型：0 一般企业， 1 个人商户 "channelName": "" //<- 必选字段 业务渠道 需要提前沟通 }
        [NameInMap("extension_info")]
        [Validation(Required=false)]
        public string ExtensionInfo { get; set; }

        // 企业法人
        [NameInMap("legal_person_cert_name")]
        [Validation(Required=true)]
        public string LegalPersonCertName { get; set; }

        // 法人身份证号
        [NameInMap("legal_person_cert_no")]
        [Validation(Required=true)]
        public string LegalPersonCertNo { get; set; }

        // 认证完成后回跳地址
        [NameInMap("merchant_url")]
        [Validation(Required=false)]
        public string MerchantUrl { get; set; }

        // 名称
        [NameInMap("owner_name")]
        [Validation(Required=false)]
        public string OwnerName { get; set; }

        // 自定义企业唯一id，企业在自有模式下的唯一号，调用者需要保证其唯一性
        [NameInMap("owner_uid")]
        [Validation(Required=false)]
        public string OwnerUid { get; set; }

        // 场景码，找dis工作人员进行分配	
        [NameInMap("biz_code")]
        [Validation(Required=false)]
        public string BizCode { get; set; }

        // 产品渲染方式：H5、NATIVE 或 PC, 默认为H5
        [NameInMap("group")]
        [Validation(Required=false)]
        public string Group { get; set; }

        // 认证ID
        [NameInMap("certify_id")]
        [Validation(Required=false)]
        public string CertifyId { get; set; }

        // 二维码URL，用户支付宝扫一扫实人认证
        [NameInMap("certify_url")]
        [Validation(Required=false)]
        public string CertifyUrl { get; set; }

    }

}
