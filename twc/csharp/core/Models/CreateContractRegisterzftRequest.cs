// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateContractRegisterzftRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 地址。商户详细经营地址或人员所在地点
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

        // 代理商户的账户
        [NameInMap("agent_account_id")]
        [Validation(Required=false)]
        public string AgentAccountId { get; set; }

        // 商户别名
        [NameInMap("alias_name")]
        [Validation(Required=true)]
        public string AliasName { get; set; }

        // 商户支付宝账户
        [NameInMap("alipay_logon_id")]
        [Validation(Required=true)]
        public string AlipayLogonId { get; set; }

        // 申请时间
        [NameInMap("apply_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ApplyTime { get; set; }

        // 二级商户支付宝账户，用于协议确认。目前商业场景（除医疗、中小学教育等）下必填。本字段要求与商户名称name同名，且是实名认证支付宝账户
        [NameInMap("binding_alipay_logon_id")]
        [Validation(Required=true)]
        public string BindingAlipayLogonId { get; set; }

        // 结算卡id
        [NameInMap("card_alias_no")]
        [Validation(Required=false)]
        public string CardAliasNo { get; set; }

        // 营业执照图片url，本业务接口中，如果是特殊行业必填。其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
        [NameInMap("cert_image")]
        [Validation(Required=true)]
        public string CertImage { get; set; }

        // 商户社会信用码
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 商户证件类型，取值范围：201：营业执照；2011:营业执照(统一社会信用代码)；204：民办非企业登记证书；206：社会团体法人登记证书；218：事业单位法人证书；219：党政机关批准设立文件/行政执法主体资格证；100：个人商户身份证
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public string CertType { get; set; }

        // 城市编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。
        // （参考资料：
        // http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
        [NameInMap("city_code")]
        [Validation(Required=true)]
        public string CityCode { get; set; }

        // 电子邮箱
        [NameInMap("contact_email")]
        [Validation(Required=true)]
        public string ContactEmail { get; set; }

        // 商户联系人信息
        [NameInMap("contact_mobile")]
        [Validation(Required=true)]
        public string ContactMobile { get; set; }

        // 联系人名字	
        [NameInMap("contact_name")]
        [Validation(Required=true)]
        public string ContactName { get; set; }

        // 商户联系人电话信息
        [NameInMap("contact_phone")]
        [Validation(Required=true)]
        public string ContactPhone { get; set; }

        // 商户联系人业务标识枚举，表示商户联系人的职责。异议处理接口人:02;商户关键联系人:06;数据反馈接口人:11;服务联动接口人:08
        [NameInMap("contact_tag")]
        [Validation(Required=true)]
        public string ContactTag { get; set; }

        // 联系人类型，取值范围：LEGAL_PERSON：法人；CONTROLLER：实际控制人；AGENT：代理人；OTHER：其他
        [NameInMap("contact_type")]
        [Validation(Required=true)]
        public string ContactType { get; set; }

        // 区县编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。
        // （参考资料：
        // http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
        [NameInMap("district_code")]
        [Validation(Required=true)]
        public string DistrictCode { get; set; }

        // 返回申请单相关参数。当前返回内容有cardAliasNo，smid	
        [NameInMap("ext_info")]
        [Validation(Required=true)]
        public string ExtInfo { get; set; }

        // 商户角色id。审核通过后生成。间连商户或平台商二级商户业务中，本字段表示smid
        [NameInMap("ip_role_id")]
        [Validation(Required=true)]
        public string IpRoleId { get; set; }

        // 法人身份证反面url，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。本业务接口中，如果是特殊行业必填
        [NameInMap("legal_cert_back_image")]
        [Validation(Required=true)]
        public string LegalCertBackImage { get; set; }

        // 法人身份证正面url，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。本业务接口中，如果是特殊行业必填
        [NameInMap("legal_cert_front_image")]
        [Validation(Required=true)]
        public string LegalCertFrontImage { get; set; }

        // 法人身份证号
        [NameInMap("legal_cert_no")]
        [Validation(Required=true)]
        public string LegalCertNo { get; set; }

        // 法人名称
        [NameInMap("legal_name")]
        [Validation(Required=true)]
        public string LegalName { get; set; }

        // 商户类别码mcc，参见附件描述中的“类目code” https://gw.alipayobjects.com/os/basement_prod/82cb70f7-abbd-417a-91ba-73c1849f07ea.xlsx 如果要求资质一栏不为空，表明是特殊行业，会有人工审核。注：文档更新可能有滞后性，以实际为准
        [NameInMap("mcc")]
        [Validation(Required=true)]
        public string Mcc { get; set; }

        // 蚂蚁金服（杭*****术有限公司
        [NameInMap("merchant_name")]
        [Validation(Required=true)]
        public string MerchantName { get; set; }

        // 商家类型：01：企业；02：事业单位；03：民办非企业组织；04：社会团体；05：党政及国家机关；06：个人商户；07：个体工商户
        [NameInMap("merchant_type")]
        [Validation(Required=true)]
        public string MerchantType { get; set; }

        // 商户名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 申请单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 外部业务号。比如某种业务标准外部订单号,比如交易外部订单号，代表服务商端自己订单号。用于做并发控制，防止一笔外部订单发起两次进件。非必要场景禁止传入本字段，如要使用务必理清场景及字段生成规则，与蚂蚁金服对接人咨询。
        [NameInMap("out_biz_no")]
        [Validation(Required=true)]
        public string OutBizNo { get; set; }

        // 门头照，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。如果使用当面付服务则必填
        [NameInMap("out_door_image")]
        [Validation(Required=true)]
        public string OutDoorImage { get; set; }

        // 商户在智能合同平台唯一id
        [NameInMap("platform_tuid")]
        [Validation(Required=true)]
        public string PlatformTuid { get; set; }

        // 省份编码。请按照https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx 表格中内容填写。
        // （参考资料：
        // http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/）
        [NameInMap("province_code")]
        [Validation(Required=true)]
        public string ProvinceCode { get; set; }

        // 商户使用服务，可选值有：当面付、app支付、wap支付、电脑支付
        [NameInMap("service")]
        [Validation(Required=true)]
        public string Service { get; set; }

        // 客服电话	
        [NameInMap("service_phone")]
        [Validation(Required=true)]
        public string ServicePhone { get; set; }

        // 二级商户与服务商的签约时间
        [NameInMap("sign_time_with_isv")]
        [Validation(Required=true)]
        public string SignTimeWithIsv { get; set; }

        // 站点名称
        [NameInMap("site_name")]
        [Validation(Required=true)]
        public string SiteName { get; set; }

        // 网站：01
        // APP : 02
        // 服务窗:03
        // 公众号:04
        // 其他:05
        // 支付宝小程序:06
        [NameInMap("site_type")]
        [Validation(Required=true)]
        public string SiteType { get; set; }

        // 站点地址
        [NameInMap("site_url")]
        [Validation(Required=true)]
        public string SiteUrl { get; set; }

        // 二级商户id
        [NameInMap("smid")]
        [Validation(Required=true)]
        public string Smid { get; set; }

        // 申请单状态。99:已完结;-1:失败;031:已提交审核
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 0表示不更新，1表示强制更新
        [NameInMap("update")]
        [Validation(Required=true)]
        public long? Update { get; set; }

    }

}
