// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class ApplyDubbridgeCreditLxRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 授信申请编号
        [NameInMap("credit_apply_id")]
        [Validation(Required=true)]
        public string CreditApplyId { get; set; }

        // 合作方代码
        [NameInMap("partner_code")]
        [Validation(Required=false)]
        public string PartnerCode { get; set; }

        // 申请人姓名
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 授信金额，单位:元
        [NameInMap("credit_amount")]
        [Validation(Required=true)]
        public long? CreditAmount { get; set; }

        // 婚姻状况，
        // 0-未婚
        // 1-已婚
        // 3-离异
        // 4-未知
        // 5-丧偶
        [NameInMap("marital_status")]
        [Validation(Required=true)]
        public string MaritalStatus { get; set; }

        // 学历，
        // 0未知，1本科，2大专，3硕士，4博士，7初中，10大专(老)，11中专，12高中，13小学
        [NameInMap("education")]
        [Validation(Required=true)]
        public string Education { get; set; }

        // 年龄
        [NameInMap("age")]
        [Validation(Required=true)]
        public long? Age { get; set; }

        // 性别，
        // 1-男
        // 2-女
        // 0-未知
        [NameInMap("sex")]
        [Validation(Required=true)]
        public string Sex { get; set; }

        // 证件类型，
        // 1、身份证
        [NameInMap("identi_type")]
        [Validation(Required=true)]
        public string IdentiType { get; set; }

        // 证件号码
        [NameInMap("identi_no")]
        [Validation(Required=true)]
        public string IdentiNo { get; set; }

        // 身份证有效期止，如果是长期用20991231
        [NameInMap("id_card_expire_date")]
        [Validation(Required=true)]
        public string IdCardExpireDate { get; set; }

        // 身份证有效期起
        [NameInMap("id_card_valid_date")]
        [Validation(Required=true)]
        public string IdCardValidDate { get; set; }

        // 身份证省
        [NameInMap("id_province")]
        [Validation(Required=true)]
        public string IdProvince { get; set; }

        // 身份证市
        [NameInMap("id_city")]
        [Validation(Required=true)]
        public string IdCity { get; set; }

        // 身份证地址
        [NameInMap("id_addr")]
        [Validation(Required=true)]
        public string IdAddr { get; set; }

        // 身份证签发机关
        [NameInMap("issued_agency")]
        [Validation(Required=true)]
        public string IssuedAgency { get; set; }

        // 出生日期，yyyy-MM-dd
        [NameInMap("birthday")]
        [Validation(Required=true)]
        public string Birthday { get; set; }

        // 国籍
        [NameInMap("nationality")]
        [Validation(Required=true)]
        public string Nationality { get; set; }

        // 民族
        [NameInMap("nation")]
        [Validation(Required=true)]
        public string Nation { get; set; }

        // 客户手机号
        [NameInMap("mobile_no")]
        [Validation(Required=true)]
        public string MobileNo { get; set; }

        // 用户银行卡号
        [NameInMap("user_bank_card_no")]
        [Validation(Required=true)]
        public string UserBankCardNo { get; set; }

        // 第一联系人姓名
        [NameInMap("contact_name")]
        [Validation(Required=true)]
        public string ContactName { get; set; }

        // 第一联系人手机
        [NameInMap("contact_mobile")]
        [Validation(Required=true)]
        public string ContactMobile { get; set; }

        // 第一联系人关系，
        // 1 父母
        // 2 配偶
        // 3 亲戚
        // 4 家人
        // 5 子女
        // 6 朋友
        // 7 同事
        // 8 兄弟姐妹
        // 9 同学
        // 99 其他
        [NameInMap("contact_rel")]
        [Validation(Required=true)]
        public string ContactRel { get; set; }

        // 居住地址对应的省，若为空则上送身份证地址对应的省
        [NameInMap("living_province")]
        [Validation(Required=true)]
        public string LivingProvince { get; set; }

        // 居住地址对应的市，若为空则上送身份证地址对应的市
        [NameInMap("living_city")]
        [Validation(Required=true)]
        public string LivingCity { get; set; }

        // 居住地对应的区
        [NameInMap("living_county")]
        [Validation(Required=false)]
        public string LivingCounty { get; set; }

        // 居住地址
        [NameInMap("living_address")]
        [Validation(Required=true)]
        public string LivingAddress { get; set; }

        // 客户职业，
        // 0 未知（空值默认按0提供）
        // 1 国家机关、党群组织、企业、事业单位负责人
        // 2 专业技术人员
        // 3 办事人员和有关人员
        // 4 商业、服务业人员
        // 5 农、林、牧、渔、水利业生产人员
        // 6 生产、运输设备操作人员及有关人员
        // 7 军人
        // 8 不便分类的其他从业人员
        [NameInMap("user_occupation")]
        [Validation(Required=true)]
        public string UserOccupation { get; set; }

        // 客户行业，
        // 0 未知（空值默认按0提供）
        // 1 信息传输、软件和信息技术服务业
        // 2 金融业
        // 3 制造业
        // 4 卫生和社会工作
        // 5 建筑业
        // 6 文化、体育和娱乐业
        // 7 租赁和商务服务业
        // 8 住宿和餐饮业
        // 9 交通运输、仓储和邮政业
        // 10 采矿业
        // 11 电力、热力、燃气及水生产和供应业
        // 12 科学研究和技术服务业
        // 13 农、林、牧、渔业
        // 14 水利、环境和公共设施管理业
        // 15 其他
        // 77 批发和零售业
        // 78 居民服务、修理和其他服务业
        // 79 房地产业
        // 81 教育
        // 82 公共管理、社会保障和社会组织
        // 80 国际组织
        [NameInMap("user_industry_category")]
        [Validation(Required=true)]
        public string UserIndustryCategory { get; set; }

    }

}
