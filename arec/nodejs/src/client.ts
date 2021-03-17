// This file is auto-generated, don't edit it
import AntchainUtil from '@antchain/alipay-util';
import Util, * as $Util from '@alicloud/tea-util';
import RPCUtil from '@alicloud/rpc-util';
import * as $tea from '@alicloud/tea-typescript';

/**
 * Model for initing client
 */
export class Config extends $tea.Model {
  accessKeyId?: string;
  accessKeySecret?: string;
  securityToken?: string;
  protocol?: string;
  readTimeout?: number;
  connectTimeout?: number;
  httpProxy?: string;
  httpsProxy?: string;
  endpoint?: string;
  noProxy?: string;
  maxIdleConns?: number;
  userAgent?: string;
  socks5Proxy?: string;
  socks5NetWork?: string;
  maxIdleTimeMillis?: number;
  keepAliveDurationMillis?: number;
  maxRequests?: number;
  maxRequestsPerHost?: number;
  static names(): { [key: string]: string } {
    return {
      accessKeyId: 'accessKeyId',
      accessKeySecret: 'accessKeySecret',
      securityToken: 'securityToken',
      protocol: 'protocol',
      readTimeout: 'readTimeout',
      connectTimeout: 'connectTimeout',
      httpProxy: 'httpProxy',
      httpsProxy: 'httpsProxy',
      endpoint: 'endpoint',
      noProxy: 'noProxy',
      maxIdleConns: 'maxIdleConns',
      userAgent: 'userAgent',
      socks5Proxy: 'socks5Proxy',
      socks5NetWork: 'socks5NetWork',
      maxIdleTimeMillis: 'maxIdleTimeMillis',
      keepAliveDurationMillis: 'keepAliveDurationMillis',
      maxRequests: 'maxRequests',
      maxRequestsPerHost: 'maxRequestsPerHost',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accessKeyId: 'string',
      accessKeySecret: 'string',
      securityToken: 'string',
      protocol: 'string',
      readTimeout: 'number',
      connectTimeout: 'number',
      httpProxy: 'string',
      httpsProxy: 'string',
      endpoint: 'string',
      noProxy: 'string',
      maxIdleConns: 'number',
      userAgent: 'string',
      socks5Proxy: 'string',
      socks5NetWork: 'string',
      maxIdleTimeMillis: 'number',
      keepAliveDurationMillis: 'number',
      maxRequests: 'number',
      maxRequestsPerHost: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 个人
export class Person extends $tea.Model {
  // 身份证地址
  address?: string;
  // 居民身份证号
  certNo?: string;
  // 证件类型,比如：ID_CARD=身份证
  certType?: string;
  // 客户编号
  cmNo?: string;
  // 电子邮箱
  email?: string;
  // 证件反面照片oss存储路径
  certBackPicOssKey?: string;
  // 证件正面照片OSS存储路径
  certFrontPicOssKey?: string;
  // 手机号
  mobile?: string;
  // 客户姓名
  name?: string;
  // 身份证所在地邮编
  postCode?: string;
  static names(): { [key: string]: string } {
    return {
      address: 'address',
      certNo: 'cert_no',
      certType: 'cert_type',
      cmNo: 'cm_no',
      email: 'email',
      certBackPicOssKey: 'cert_back_pic_oss_key',
      certFrontPicOssKey: 'cert_front_pic_oss_key',
      mobile: 'mobile',
      name: 'name',
      postCode: 'post_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      address: 'string',
      certNo: 'string',
      certType: 'string',
      cmNo: 'string',
      email: 'string',
      certBackPicOssKey: 'string',
      certFrontPicOssKey: 'string',
      mobile: 'string',
      name: 'string',
      postCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签署人
export class EntityBasicInfo extends $tea.Model {
  // 名称
  name: string;
  // 证件类型，可选值：ID_CARD,BUSINESS_LICENSE,UNIFIED_SOCIAL_CODE
  certType: string;
  // 证件号码
  certNo: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      certType: 'cert_type',
      certNo: 'cert_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      certType: 'string',
      certNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 电子签约签署区
export class ArSignField extends $tea.Model {
  // 签署页
  posPage?: string;
  // 签署区x坐标
  posX?: string;
  // 签署区y坐标
  posY?: string;
  // 签署日期签署页
  signDatePosPage?: string;
  // 签署日期的签署坐标x
  signDatePosX?: string;
  // 签署日期签署坐标y
  signDatePosY?: string;
  static names(): { [key: string]: string } {
    return {
      posPage: 'pos_page',
      posX: 'pos_x',
      posY: 'pos_y',
      signDatePosPage: 'sign_date_pos_page',
      signDatePosX: 'sign_date_pos_x',
      signDatePosY: 'sign_date_pos_y',
    };
  }

  static types(): { [key: string]: any } {
    return {
      posPage: 'string',
      posX: 'string',
      posY: 'string',
      signDatePosPage: 'string',
      signDatePosX: 'string',
      signDatePosY: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合同模版
export class ArTemplate extends $tea.Model {
  // 合同模版号
  arTpNo?: string;
  // 合同版本
  arTpVersion?: number;
  // 合同模版类型，比如：CT_AUTH_HOUSE_QUERY=房屋查询授权合同
  arType?: string;
  // 区块链智能合同的合同模版号
  mycTpId?: string;
  // 合同名称
  name?: string;
  // 合同模版归属机构编号
  orgNo?: string;
  // 合同模版归属机构类型，比如：BANK=银行
  orgType?: string;
  // 合同模版OSS存储路径
  pdfOssKey?: string;
  // 合同变量,Map<String,String>的json格式
  varJson?: string;
  // 签署区设置
  signAreaJson?: string;
  static names(): { [key: string]: string } {
    return {
      arTpNo: 'ar_tp_no',
      arTpVersion: 'ar_tp_version',
      arType: 'ar_type',
      mycTpId: 'myc_tp_id',
      name: 'name',
      orgNo: 'org_no',
      orgType: 'org_type',
      pdfOssKey: 'pdf_oss_key',
      varJson: 'var_json',
      signAreaJson: 'sign_area_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      arTpNo: 'string',
      arTpVersion: 'number',
      arType: 'string',
      mycTpId: 'string',
      name: 'string',
      orgNo: 'string',
      orgType: 'string',
      pdfOssKey: 'string',
      varJson: 'string',
      signAreaJson: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 房屋抵押信息
export class HouseMgInfo extends $tea.Model {
  // 债权金额，人民币默认单位元，保留两位小数点
  debtAmount?: string;
  // 债权金额货币类型，比如：CNY=人民币
  debtAmountCurrency?: string;
  // 抵押权人证件号码
  mortgageeCertNo?: string;
  // 抵押权人证件类型,比如：UNIFIED_SOCIAL_CODE=统一社会信用代码
  mortgageeCertType?: string;
  // 抵押权人名称
  mortgageeName?: string;
  // 履债结束日期
  debtEndDate?: string;
  // 履债起始日期
  debtStartDate?: string;
  // 登记时间
  registeredDate?: string;
  // 房产链内部房产编号
  houseNo?: string;
  static names(): { [key: string]: string } {
    return {
      debtAmount: 'debt_amount',
      debtAmountCurrency: 'debt_amount_currency',
      mortgageeCertNo: 'mortgagee_cert_no',
      mortgageeCertType: 'mortgagee_cert_type',
      mortgageeName: 'mortgagee_name',
      debtEndDate: 'debt_end_date',
      debtStartDate: 'debt_start_date',
      registeredDate: 'registered_date',
      houseNo: 'house_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      debtAmount: 'string',
      debtAmountCurrency: 'string',
      mortgageeCertNo: 'string',
      mortgageeCertType: 'string',
      mortgageeName: 'string',
      debtEndDate: 'string',
      debtStartDate: 'string',
      registeredDate: 'string',
      houseNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 房产限制信息
export class HouseRestrictionInfo extends $tea.Model {
  // 申请人
  // 
  applicant?: string;
  // 限制结束日期
  restrictionEndDate?: string;
  // 限制起始日期
  restrictionStartDate?: string;
  // 来文单位
  fromOrgName?: string;
  // 登记时间
  registerTime?: string;
  // 限制金额，人民币默认单位元，保留两位小数点
  restrictedAmount?: string;
  // 限制金额货币类型，比如：CNY=人民币
  restrictedAmountCurrency?: string;
  // 限制文号
  restrictionNo?: string;
  // 房产链内部房产编号
  houseNo?: string;
  static names(): { [key: string]: string } {
    return {
      applicant: 'applicant',
      restrictionEndDate: 'restriction_end_date',
      restrictionStartDate: 'restriction_start_date',
      fromOrgName: 'from_org_name',
      registerTime: 'register_time',
      restrictedAmount: 'restricted_amount',
      restrictedAmountCurrency: 'restricted_amount_currency',
      restrictionNo: 'restriction_no',
      houseNo: 'house_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      applicant: 'string',
      restrictionEndDate: 'string',
      restrictionStartDate: 'string',
      fromOrgName: 'string',
      registerTime: 'string',
      restrictedAmount: 'string',
      restrictedAmountCurrency: 'string',
      restrictionNo: 'string',
      houseNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签署信息
export class SignInfo extends $tea.Model {
  // 签署人
  signer: EntityBasicInfo;
  // 签署类型，可选值：SINGLE_PAGE、CROSS_PAGE
  signType: string;
  // 签署页码
  signPage: number;
  // 签署x坐标
  signPositionX: string;
  // 签署y坐标
  signPositionY: string;
  static names(): { [key: string]: string } {
    return {
      signer: 'signer',
      signType: 'sign_type',
      signPage: 'sign_page',
      signPositionX: 'sign_position_x',
      signPositionY: 'sign_position_y',
    };
  }

  static types(): { [key: string]: any } {
    return {
      signer: EntityBasicInfo,
      signType: 'string',
      signPage: 'number',
      signPositionX: 'string',
      signPositionY: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 电子签约相关配置
export class ArSignConfig extends $tea.Model {
  // 签约者类型，比如：BANK=银行
  arSignerType?: string;
  // 签署区列表
  arSignFields?: ArSignField[];
  // 签署人
  signer?: Person;
  static names(): { [key: string]: string } {
    return {
      arSignerType: 'ar_signer_type',
      arSignFields: 'ar_sign_fields',
      signer: 'signer',
    };
  }

  static types(): { [key: string]: any } {
    return {
      arSignerType: 'string',
      arSignFields: { 'type': 'array', 'itemType': ArSignField },
      signer: Person,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 产权人
export class HouseOwner extends $tea.Model {
  // 姓名
  name?: string;
  // 证件类型
  certType?: string;
  // 证件号
  certNo?: string;
  // 手机号
  mobile?: string;
  // 身份证正面照片存储路径
  certFrontPicOssKey?: string;
  // 身份证反面照片存储路径
  certBackPicOssKey?: string;
  // 权利人主体类型，PERSON=个人
  obligeeType?: string;
  // 权利人类型
  obligeeRole?: string;
  // 共有情况
  ownershipStatus?: string;
  // 权证类型
  houseCertType?: string;
  // 权证号
  houseCertNo?: string;
  // 权利比例
  rightsRate?: string;
  // 房产链内部客户编号
  cmNo?: string;
  // 房产链内部房产编号
  houseNo?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      certType: 'cert_type',
      certNo: 'cert_no',
      mobile: 'mobile',
      certFrontPicOssKey: 'cert_front_pic_oss_key',
      certBackPicOssKey: 'cert_back_pic_oss_key',
      obligeeType: 'obligee_type',
      obligeeRole: 'obligee_role',
      ownershipStatus: 'ownership_status',
      houseCertType: 'house_cert_type',
      houseCertNo: 'house_cert_no',
      rightsRate: 'rights_rate',
      cmNo: 'cm_no',
      houseNo: 'house_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      certType: 'string',
      certNo: 'string',
      mobile: 'string',
      certFrontPicOssKey: 'string',
      certBackPicOssKey: 'string',
      obligeeType: 'string',
      obligeeRole: 'string',
      ownershipStatus: 'string',
      houseCertType: 'string',
      houseCertNo: 'string',
      rightsRate: 'string',
      cmNo: 'string',
      houseNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合同
export class Agreement extends $tea.Model {
  // 电子合同pdf文件存储路径
  arArchiveOssPath?: string;
  // 合同编号
  arNo?: string;
  // 合同模版
  arTemplate?: ArTemplate;
  // 合同类型，比如：房屋查询授权合同
  arType?: string;
  // 需要签署合同的角色列表，如：BANK,HOUSE_OWNER,BORROWER
  arSignerRoles?: string[];
  // 合同模版需要的变量和值集合,Map<String,String>的json格式
  arVarValueJson?: string;
  // 区块链智能合同合同文件号
  mycFileNo?: string;
  // 外部合同编号(银行生成)
  outArNo?: string;
  // 合同签署流程编号
  procNo?: string;
  // 合同签署时间
  signTime?: string;
  // 签署状态，比如：SUCC=签署完成
  status?: string;
  // 待签署的合同文档oss存储路径，仅当不动产合同才有
  unSignArArchiveOssPath?: string;
  // 合同生成方式，AR_TP=模版
  arGenerateType?: string;
  // 智能合同部分的签署区设置
  ctSignConfigs?: ArSignConfig[];
  // 机构自主签署部分的签署区设置
  orgSignConfigs?: ArSignConfig[];
  // 机构签署状态，SUCC=签署完成
  orgSignStatus?: string;
  // 机构签署完成时间
  orgSignTime?: string;
  // 机构签署完成后的合同存储路径
  orgArArchiveOssPath?: string;
  // 最终签署完成的合同存储路径
  finalArArchiveOssPath?: string;
  static names(): { [key: string]: string } {
    return {
      arArchiveOssPath: 'ar_archive_oss_path',
      arNo: 'ar_no',
      arTemplate: 'ar_template',
      arType: 'ar_type',
      arSignerRoles: 'ar_signer_roles',
      arVarValueJson: 'ar_var_value_json',
      mycFileNo: 'myc_file_no',
      outArNo: 'out_ar_no',
      procNo: 'proc_no',
      signTime: 'sign_time',
      status: 'status',
      unSignArArchiveOssPath: 'un_sign_ar_archive_oss_path',
      arGenerateType: 'ar_generate_type',
      ctSignConfigs: 'ct_sign_configs',
      orgSignConfigs: 'org_sign_configs',
      orgSignStatus: 'org_sign_status',
      orgSignTime: 'org_sign_time',
      orgArArchiveOssPath: 'org_ar_archive_oss_path',
      finalArArchiveOssPath: 'final_ar_archive_oss_path',
    };
  }

  static types(): { [key: string]: any } {
    return {
      arArchiveOssPath: 'string',
      arNo: 'string',
      arTemplate: ArTemplate,
      arType: 'string',
      arSignerRoles: { 'type': 'array', 'itemType': 'string' },
      arVarValueJson: 'string',
      mycFileNo: 'string',
      outArNo: 'string',
      procNo: 'string',
      signTime: 'string',
      status: 'string',
      unSignArArchiveOssPath: 'string',
      arGenerateType: 'string',
      ctSignConfigs: { 'type': 'array', 'itemType': ArSignConfig },
      orgSignConfigs: { 'type': 'array', 'itemType': ArSignConfig },
      orgSignStatus: 'string',
      orgSignTime: 'string',
      orgArArchiveOssPath: 'string',
      finalArArchiveOssPath: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 抵押登记权证
export class MgCert extends $tea.Model {
  // 房产编号
  houseNo?: string;
  // 坐落
  location?: string;
  // 抵押登记回执编号
  mgCertNo?: string;
  // 新他项权证号
  newOtherRightCertNo?: string;
  // 新他项权证电子证照地址
  newOtherRightCertPath?: string;
  // 新他项权证类型，比如：MORTGAGE_REG_CERT=不动产登记证明(抵押权登记)
  newOtherRightCertType?: string;
  // 权利人
  mortgageeJson?: string;
  // 抵押义务人
  mortgagorJson?: string;
  // 证明权力或事项
  proof?: string;
  // 不动产返回其他信息
  other?: string;
  // 不动产返回附记信息
  supplement?: string;
  // 发证工本号
  licenseNumber?: string;
  // 缮证人
  printer?: string;
  // 缮证时间
  printTime?: string;
  // 发证人
  issuer?: string;
  // 发证时间
  issuanceTime?: string;
  // 区县代码
  districtCode?: string;
  // 省编号
  provinceCode?: string;
  // 不动产单元号
  houseUnitCode?: string;
  // 是否在房产链已解抵
  released?: string;
  // 房产链内部解抵押单号
  mgReleaseOrderNo?: string;
  // 登记证明种类,MORTGAGE=抵押权证明
  regCertType?: string;
  // 发证机关
  issuingAuthority?: string;
  // 债权金额
  debtAmt?: string;
  // 抵押权开始时间
  mgRightStartDate?: string;
  // 抵押权结束日期
  mgRightEndDate?: string;
  // 抵押方式，MAX_AMOUNT_MORT=最高额抵押
  mortgageType?: string;
  static names(): { [key: string]: string } {
    return {
      houseNo: 'house_no',
      location: 'location',
      mgCertNo: 'mg_cert_no',
      newOtherRightCertNo: 'new_other_right_cert_no',
      newOtherRightCertPath: 'new_other_right_cert_path',
      newOtherRightCertType: 'new_other_right_cert_type',
      mortgageeJson: 'mortgagee_json',
      mortgagorJson: 'mortgagor_json',
      proof: 'proof',
      other: 'other',
      supplement: 'supplement',
      licenseNumber: 'license_number',
      printer: 'printer',
      printTime: 'print_time',
      issuer: 'issuer',
      issuanceTime: 'issuance_time',
      districtCode: 'district_code',
      provinceCode: 'province_code',
      houseUnitCode: 'house_unit_code',
      released: 'released',
      mgReleaseOrderNo: 'mg_release_order_no',
      regCertType: 'reg_cert_type',
      issuingAuthority: 'issuing_authority',
      debtAmt: 'debt_amt',
      mgRightStartDate: 'mg_right_start_date',
      mgRightEndDate: 'mg_right_end_date',
      mortgageType: 'mortgage_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      houseNo: 'string',
      location: 'string',
      mgCertNo: 'string',
      newOtherRightCertNo: 'string',
      newOtherRightCertPath: 'string',
      newOtherRightCertType: 'string',
      mortgageeJson: 'string',
      mortgagorJson: 'string',
      proof: 'string',
      other: 'string',
      supplement: 'string',
      licenseNumber: 'string',
      printer: 'string',
      printTime: 'string',
      issuer: 'string',
      issuanceTime: 'string',
      districtCode: 'string',
      provinceCode: 'string',
      houseUnitCode: 'string',
      released: 'string',
      mgReleaseOrderNo: 'string',
      regCertType: 'string',
      issuingAuthority: 'string',
      debtAmt: 'string',
      mgRightStartDate: 'string',
      mgRightEndDate: 'string',
      mortgageType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 银行
export class Bank extends $tea.Model {
  // 地址
  address?: string;
  // 银行编号
  bankNo?: string;
  // 法人证件号
  legalPersonCertNo?: string;
  // 法人手机号
  legalPersonMobile?: string;
  // 法人姓名
  legalPersonName?: string;
  // 行内级别，比如：SUB_BRANCH=支行
  level?: string;
  // 蚂蚁智能合同的机构id
  mycOrgId?: string;
  // 银行名称
  name?: string;
  // OSS存储跟路径
  ossBaseFold?: string;
  // 银行证件号
  certNo?: string;
  // 上级行号，比如支行对应的分行
  parentBankNo?: string;
  // 蚂蚁链隐私数据网络的身份id
  pdnDid?: string;
  // 公钥
  pubKey?: string;
  // 租户ID
  tenantId?: string;
  // 法人证件类型，比如：ID_CARD=身份证
  legalPersonCertType?: string;
  // 授权合同签署后小程序端的回跳地址
  authCallbackUrl?: string;
  // 抵押登记相关合同签署后小程序端的回跳地址
  mgCallbackUrl?: string;
  // 银行接收房产链通知接口地址
  bkCallbackUrl?: string;
  // 银行证件类型
  certType?: string;
  static names(): { [key: string]: string } {
    return {
      address: 'address',
      bankNo: 'bank_no',
      legalPersonCertNo: 'legal_person_cert_no',
      legalPersonMobile: 'legal_person_mobile',
      legalPersonName: 'legal_person_name',
      level: 'level',
      mycOrgId: 'myc_org_id',
      name: 'name',
      ossBaseFold: 'oss_base_fold',
      certNo: 'cert_no',
      parentBankNo: 'parent_bank_no',
      pdnDid: 'pdn_did',
      pubKey: 'pub_key',
      tenantId: 'tenant_id',
      legalPersonCertType: 'legal_person_cert_type',
      authCallbackUrl: 'auth_callback_url',
      mgCallbackUrl: 'mg_callback_url',
      bkCallbackUrl: 'bk_callback_url',
      certType: 'cert_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      address: 'string',
      bankNo: 'string',
      legalPersonCertNo: 'string',
      legalPersonMobile: 'string',
      legalPersonName: 'string',
      level: 'string',
      mycOrgId: 'string',
      name: 'string',
      ossBaseFold: 'string',
      certNo: 'string',
      parentBankNo: 'string',
      pdnDid: 'string',
      pubKey: 'string',
      tenantId: 'string',
      legalPersonCertType: 'string',
      authCallbackUrl: 'string',
      mgCallbackUrl: 'string',
      bkCallbackUrl: 'string',
      certType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 附件材料
export class Archive extends $tea.Model {
  // 附件内容的Hash值
  archiveHash?: string;
  // 附件材料类型，比如：AT_SUOYOUQUANZHENG=房屋所有权证
  archiveType?: string;
  // 移动后到银行目录下的oss存储路径
  bankOssKey?: string;
  // 附件KEY，也是oss的存储路径，原始保存路径
  ossKey?: string;
  // 附件来源外部业务单号
  outBizNo?: string;
  // 机构编号
  ownerNo?: string;
  // 附件材料归属机构类型，比如：BANK=银行
  ownerType?: string;
  // 移动到不动产中心目录下的oss存储路径
  rtcOssKey?: string;
  // 材料附件来源场景，比如：ASS_BK_APPLY=银行申请抵押提交
  scene?: string;
  // 房产链平台的存储路径
  rcpOssKey?: string;
  // 助贷平台的访问路径
  loanAssistPlatformOssKey?: string;
  static names(): { [key: string]: string } {
    return {
      archiveHash: 'archive_hash',
      archiveType: 'archive_type',
      bankOssKey: 'bank_oss_key',
      ossKey: 'oss_key',
      outBizNo: 'out_biz_no',
      ownerNo: 'owner_no',
      ownerType: 'owner_type',
      rtcOssKey: 'rtc_oss_key',
      scene: 'scene',
      rcpOssKey: 'rcp_oss_key',
      loanAssistPlatformOssKey: 'loan_assist_platform_oss_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      archiveHash: 'string',
      archiveType: 'string',
      bankOssKey: 'string',
      ossKey: 'string',
      outBizNo: 'string',
      ownerNo: 'string',
      ownerType: 'string',
      rtcOssKey: 'string',
      scene: 'string',
      rcpOssKey: 'string',
      loanAssistPlatformOssKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 房产
export class House extends $tea.Model {
  // 房屋所在区/县地区编码
  areaCode?: string;
  // 是否有异议，Y-是，N-否
  claimed?: string;
  // 是否有文件备案
  fileRecorded?: string;
  // 产证编号
  houseCertNo?: string;
  // 权证类型，比如：HOUSE_CERT=房屋所有权证
  houseCertType?: string;
  // 房产编号
  houseCode?: string;
  // 抵押信息列表
  houseMgInfos?: HouseMgInfo[];
  // 房产编号
  houseNo?: string;
  // 产权人列表
  houseOwners?: HouseOwner[];
  // 限制信息列表
  houseRestrictionInfos?: HouseRestrictionInfo[];
  // 不动产单元号
  houseUnitCode?: string;
  // 不动产单元号，待废弃字段
  houseUnitCodes?: string[];
  // 隐形产权人列表
  invisibleHouseOwners?: HouseOwner[];
  // 房屋所在地址信息
  location?: string;
  // 是否有抵押，Y-是，N-否
  mortgaged?: string;
  // 共有情况,比如：SHARE_COOWNER=共同共有
  ownershipStatus?: string;
  // 数据获取时间
  queryTime?: string;
  // 用途,比如：HOUSE=住宅
  realtyUsage?: string;
  // 是否有查封：Y-是，N-否
  seized?: string;
  // 土地分摊面积
  sharingLandArea?: string;
  // 土地分摊面积单位，比如：SQUARE_METER=平方米
  sharingLandAreaUnit?: string;
  // 当前产证归属的房产链产权人内部编号
  houseOwnerCmNo?: string;
  // 建筑面积
  structureArea?: string;
  // 建筑面积单位，比如：SQUARE_METER=平方米
  structureAreaUnit?: string;
  // 权利性质
  rightsNature?: string;
  // 权利类型,STATE_OWNED_CONSTRUCTION_LAND_AND_BUILDING=国有建设用地使用权/房屋（构筑物）所有权
  rightsType?: string;
  // 房屋性质,COMMERCIAL_HOUSING=商品房
  houseNature?: string;
  // 土地证号
  landCertNo?: string;
  // 土地用途
  landUsage?: string;
  // 土地性质,SELL=出让
  landNature?: string;
  // 土地使用权开始日期
  landUseStartDate?: string;
  // 土地使用权终止日期
  landUseEndDate?: string;
  // 总层数
  totalFloor?: string;
  // 所在层
  itsFloor?: string;
  // 建造年份
  builtYear?: string;
  // 登薄日期
  regDate?: string;
  // 证书附记备注
  certRemark?: string;
  // 证书状态描述
  certStatus?: string;
  static names(): { [key: string]: string } {
    return {
      areaCode: 'area_code',
      claimed: 'claimed',
      fileRecorded: 'file_recorded',
      houseCertNo: 'house_cert_no',
      houseCertType: 'house_cert_type',
      houseCode: 'house_code',
      houseMgInfos: 'house_mg_infos',
      houseNo: 'house_no',
      houseOwners: 'house_owners',
      houseRestrictionInfos: 'house_restriction_infos',
      houseUnitCode: 'house_unit_code',
      houseUnitCodes: 'house_unit_codes',
      invisibleHouseOwners: 'invisible_house_owners',
      location: 'location',
      mortgaged: 'mortgaged',
      ownershipStatus: 'ownership_status',
      queryTime: 'query_time',
      realtyUsage: 'realty_usage',
      seized: 'seized',
      sharingLandArea: 'sharing_land_area',
      sharingLandAreaUnit: 'sharing_land_area_unit',
      houseOwnerCmNo: 'house_owner_cm_no',
      structureArea: 'structure_area',
      structureAreaUnit: 'structure_area_unit',
      rightsNature: 'rights_nature',
      rightsType: 'rights_type',
      houseNature: 'house_nature',
      landCertNo: 'land_cert_no',
      landUsage: 'land_usage',
      landNature: 'land_nature',
      landUseStartDate: 'land_use_start_date',
      landUseEndDate: 'land_use_end_date',
      totalFloor: 'total_floor',
      itsFloor: 'its_floor',
      builtYear: 'built_year',
      regDate: 'reg_date',
      certRemark: 'cert_remark',
      certStatus: 'cert_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      areaCode: 'string',
      claimed: 'string',
      fileRecorded: 'string',
      houseCertNo: 'string',
      houseCertType: 'string',
      houseCode: 'string',
      houseMgInfos: { 'type': 'array', 'itemType': HouseMgInfo },
      houseNo: 'string',
      houseOwners: { 'type': 'array', 'itemType': HouseOwner },
      houseRestrictionInfos: { 'type': 'array', 'itemType': HouseRestrictionInfo },
      houseUnitCode: 'string',
      houseUnitCodes: { 'type': 'array', 'itemType': 'string' },
      invisibleHouseOwners: { 'type': 'array', 'itemType': HouseOwner },
      location: 'string',
      mortgaged: 'string',
      ownershipStatus: 'string',
      queryTime: 'string',
      realtyUsage: 'string',
      seized: 'string',
      sharingLandArea: 'string',
      sharingLandAreaUnit: 'string',
      houseOwnerCmNo: 'string',
      structureArea: 'string',
      structureAreaUnit: 'string',
      rightsNature: 'string',
      rightsType: 'string',
      houseNature: 'string',
      landCertNo: 'string',
      landUsage: 'string',
      landNature: 'string',
      landUseStartDate: 'string',
      landUseEndDate: 'string',
      totalFloor: 'string',
      itsFloor: 'string',
      builtYear: 'string',
      regDate: 'string',
      certRemark: 'string',
      certStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合同签署任务
export class ArSignTask extends $tea.Model {
  // 证件号
  certNo?: string;
  // 证件类型，比如：ID_CARD=身份证
  certType?: string;
  // 客户编号
  cmNo?: string;
  // 姓名
  name?: string;
  // 签署流程编号
  procNo?: string;
  // 合同签署地址
  signUrl?: string;
  // 签署状态 ，比如：INIT=待签署
  status?: string;
  // 智慧合同签署账号id
  mycAccountId?: string;
  static names(): { [key: string]: string } {
    return {
      certNo: 'cert_no',
      certType: 'cert_type',
      cmNo: 'cm_no',
      name: 'name',
      procNo: 'proc_no',
      signUrl: 'sign_url',
      status: 'status',
      mycAccountId: 'myc_account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      certNo: 'string',
      certType: 'string',
      cmNo: 'string',
      name: 'string',
      procNo: 'string',
      signUrl: 'string',
      status: 'string',
      mycAccountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 机构签署信息
export class OrgSigning extends $tea.Model {
  // 企业印章ID，如不填写则使用企业默认印章，如果无默认印章则报错
  orgSealId?: string;
  // 机构签署页码，从第1页开始
  // 
  // 
  orgSignPageNo: number;
  // 机构签署页位置的X坐标，企业盖章页位置的X坐标值，为距离左边边界的位置，单位为PX
  // 
  // 
  orgSignCoordinateX: string;
  // 机构签署页位置的Y坐标，企业盖章页位置的Y坐标值，为距离下边界的位置，单位为PX。关于签署位置 XY 坐标的计算方法请参考文档：https://antchain.antgroup.com/docs/11/155164，注意XY为签署区中心的点的坐标，需要考虑前后距离防止遮挡文字。
  orgSignCoordinateY: string;
  static names(): { [key: string]: string } {
    return {
      orgSealId: 'org_seal_id',
      orgSignPageNo: 'org_sign_page_no',
      orgSignCoordinateX: 'org_sign_coordinate_x',
      orgSignCoordinateY: 'org_sign_coordinate_y',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orgSealId: 'string',
      orgSignPageNo: 'number',
      orgSignCoordinateX: 'string',
      orgSignCoordinateY: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 个人签署信息
export class PersonalSigning extends $tea.Model {
  // 数字房产账户 ID
  // 
  personalId: string;
  // 个人印章 ID，如不填写则使用个人默认印章，如果无默认印章则报错
  personalSealId?: string;
  // 个人签署页码，本签名最终签署到协议哪一页
  personalSignPageNo: number;
  // 个人签署页位置的X坐标，为距离左侧边界的位置，单位为PX
  personalSignCoordinateX: string;
  // 个人签署页位置的Y坐标，为距离下边界的位置，单位为PX，计算方法同上。关于签署位置 XY 坐标的计算方法请参考文档：https://antchain.antgroup.com/docs/11/155164，注意XY为签署区中心的点的坐标，需要考虑前后距离防止遮挡文字。
  personalSignCoordinateY: string;
  static names(): { [key: string]: string } {
    return {
      personalId: 'personal_id',
      personalSealId: 'personal_seal_id',
      personalSignPageNo: 'personal_sign_page_no',
      personalSignCoordinateX: 'personal_sign_coordinate_x',
      personalSignCoordinateY: 'personal_sign_coordinate_y',
    };
  }

  static types(): { [key: string]: any } {
    return {
      personalId: 'string',
      personalSealId: 'string',
      personalSignPageNo: 'number',
      personalSignCoordinateX: 'string',
      personalSignCoordinateY: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签署任务
export class SignTask extends $tea.Model {
  // 文件路径
  filePath: string;
  // 签署信息列表
  signInfoList: SignInfo[];
  // 签署文档类型，支持类型：APPLY_FORM("申请表")、INQUIRY_FORM("询问表")、MORT_CONTACT("抵押合同")、OTHER_CONTACT("其他合同")
  signDocumentType: string;
  static names(): { [key: string]: string } {
    return {
      filePath: 'file_path',
      signInfoList: 'sign_info_list',
      signDocumentType: 'sign_document_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      filePath: 'string',
      signInfoList: { 'type': 'array', 'itemType': SignInfo },
      signDocumentType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 待签约任务描述
export class SignTaskProfile extends $tea.Model {
  // 签署任务列表
  signTaskList: SignTask[];
  static names(): { [key: string]: string } {
    return {
      signTaskList: 'sign_task_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      signTaskList: { 'type': 'array', 'itemType': SignTask },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 房产查询单
export class HqOrder extends $tea.Model {
  // 房产链房产查询单号
  houseQueryOrderNo?: string;
  // 房产链房产查询单状态
  status?: string;
  // 房产查询场景,NO_AUTH_QUERY=无授权直查
  scene?: string;
  // 2334898983498394838C
  outBizNo?: string;
  // 助贷平台
  loanAssistPlatform?: string;
  // 房产链内部银行编号
  bankNo?: string;
  // 银行名称
  bankName?: string;
  // 房产链内部不动产中心编号
  rtcNo?: string;
  // 不动产中心名称
  rtcName?: string;
  // 房产权证类型
  houseCertType?: string;
  // 权证编号(短号)
  houseCertNo?: string;
  // 房产查询单生成时间
  startTime?: string;
  // 房产查询单结束时间
  endTime?: string;
  // 房产查询失败原因，MF_REALTY_NOT_EXISTS=房产信息不存在
  failCode?: string;
  // 房产查询失败描述
  failDesc?: string;
  // 业务办理分支行
  branchBank?: Bank;
  // 房产信息
  house?: House;
  static names(): { [key: string]: string } {
    return {
      houseQueryOrderNo: 'house_query_order_no',
      status: 'status',
      scene: 'scene',
      outBizNo: 'out_biz_no',
      loanAssistPlatform: 'loan_assist_platform',
      bankNo: 'bank_no',
      bankName: 'bank_name',
      rtcNo: 'rtc_no',
      rtcName: 'rtc_name',
      houseCertType: 'house_cert_type',
      houseCertNo: 'house_cert_no',
      startTime: 'start_time',
      endTime: 'end_time',
      failCode: 'fail_code',
      failDesc: 'fail_desc',
      branchBank: 'branch_bank',
      house: 'house',
    };
  }

  static types(): { [key: string]: any } {
    return {
      houseQueryOrderNo: 'string',
      status: 'string',
      scene: 'string',
      outBizNo: 'string',
      loanAssistPlatform: 'string',
      bankNo: 'string',
      bankName: 'string',
      rtcNo: 'string',
      rtcName: 'string',
      houseCertType: 'string',
      houseCertNo: 'string',
      startTime: 'string',
      endTime: 'string',
      failCode: 'string',
      failDesc: 'string',
      branchBank: Bank,
      house: House,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 不动产基本信息
export class RealtyBasicInfo extends $tea.Model {
  // 权证类型，可选值：HOUSE_OWNERSHIP_CERT,OTHER_RIGHT_CERT,REALTY_OWNERSHIP_CERT,MORTGAGE_REG_CERT
  realtyCertType: string;
  // 权证号码
  realtyCertNo: string;
  // 坐落位置
  location: string;
  // 权利人列表
  obligeeList?: EntityBasicInfo[];
  static names(): { [key: string]: string } {
    return {
      realtyCertType: 'realty_cert_type',
      realtyCertNo: 'realty_cert_no',
      location: 'location',
      obligeeList: 'obligee_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      realtyCertType: 'string',
      realtyCertNo: 'string',
      location: 'string',
      obligeeList: { 'type': 'array', 'itemType': EntityBasicInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 他项权证信息
export class OtherRightInfo extends $tea.Model {
  // 权证类型，可选值：PROP_RIGHT_CERT("房地产权证")、HOUSE_PROP_RIGHT_CERT("房屋所有权证")、HOUSE_OWNERSHIP_CERT("房屋所有权证")、 OTHER_RIGHT_CERT("房屋他项权证")、REALTY_OWNERSHIP_CERT("不动产权证")、 MORTGAGE_REG_CERT("不动产登记证明(抵押权登记)")
  realtyCertType: string;
  // 权证号码
  realtyCertNo: string;
  // 权利人
  obligee: EntityBasicInfo;
  // 原他项权证号
  oldOtherRealtyCertNo?: string;
  // 坐落
  location: string;
  // 新他项权证类型，可选值：PROP_RIGHT_CERT("房地产权证")、HOUSE_PROP_RIGHT_CERT("房屋所有权证")、HOUSE_OWNERSHIP_CERT("房屋所有权证")、 OTHER_RIGHT_CERT("房屋他项权证")、REALTY_OWNERSHIP_CERT("不动产权证")、 MORTGAGE_REG_CERT("不动产登记证明(抵押权登记)")
  newOtherRightCertType: string;
  // 新他项权证号
  newOtherRightCertNo: string;
  // 新他项权证电子证照地址，他项权证电子证照上传到房产链的路径
  newOtherRightCertPath: string;
  static names(): { [key: string]: string } {
    return {
      realtyCertType: 'realty_cert_type',
      realtyCertNo: 'realty_cert_no',
      obligee: 'obligee',
      oldOtherRealtyCertNo: 'old_other_realty_cert_no',
      location: 'location',
      newOtherRightCertType: 'new_other_right_cert_type',
      newOtherRightCertNo: 'new_other_right_cert_no',
      newOtherRightCertPath: 'new_other_right_cert_path',
    };
  }

  static types(): { [key: string]: any } {
    return {
      realtyCertType: 'string',
      realtyCertNo: 'string',
      obligee: EntityBasicInfo,
      oldOtherRealtyCertNo: 'string',
      location: 'string',
      newOtherRightCertType: 'string',
      newOtherRightCertNo: 'string',
      newOtherRightCertPath: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签署的合同信息
// 
export class Contract extends $tea.Model {
  // 文件 ID
  documentId: string;
  // 参数指定合同文件名称
  contractName: string;
  // 合同文件的URL下载路径，有效期1小时
  archivedFileUrl?: string;
  static names(): { [key: string]: string } {
    return {
      documentId: 'document_id',
      contractName: 'contract_name',
      archivedFileUrl: 'archived_file_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      documentId: 'string',
      contractName: 'string',
      archivedFileUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 材料文件信息
export class MaterialFileInfo extends $tea.Model {
  // 文件路径
  filePath: string;
  // 材料ID，默认值为2，代表身份证明
  materialId: string;
  // 材料名称
  materialName: string;
  // 材料类型，取值范围：1--申请文件，2--业务表格，3--证照，4--申请人像，5--受理回执单 ，6--缴款通知书，7--抵押登记证明，8--原证照，9--银行内部审批材料，10--网上申办凭证
  materialType?: string;
  // 材料类别，取值范围：1--原件，2--复印件，3--原件和复印件，4--申请人像，10--原证照 
  materialCategory?: string;
  // 材料份数
  copiesNumber: number;
  // 材料页数
  page: number;
  static names(): { [key: string]: string } {
    return {
      filePath: 'file_path',
      materialId: 'material_id',
      materialName: 'material_name',
      materialType: 'material_type',
      materialCategory: 'material_category',
      copiesNumber: 'copies_number',
      page: 'page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      filePath: 'string',
      materialId: 'string',
      materialName: 'string',
      materialType: 'string',
      materialCategory: 'string',
      copiesNumber: 'number',
      page: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 不动产中心通用应答结果
export class RtcCommonResult extends $tea.Model {
  // 响应状态，包括值：S-成功，F-失败，已知的异常，U-未知，未知的异常或状态
  status: string;
  // 结果码
  code: string;
  // 返回消息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      status: 'status',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      status: 'string',
      code: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合同及签署信息
export class ContractSigning extends $tea.Model {
  // 本合同文件的名称
  contractName: string;
  // 待签署文件存放在的可读取路径，参数具体内容根据调用方约定，比如内容为OSS路径时，数字房产访问OSS下载文件。
  filePath: string;
  // 机构签署记录列表，可设置多个机构的签署区
  orgSignList: OrgSigning[];
  // 个人签署记录的列表形式，可设置多个个人的签署区
  personalSignList: PersonalSigning[];
  static names(): { [key: string]: string } {
    return {
      contractName: 'contract_name',
      filePath: 'file_path',
      orgSignList: 'org_sign_list',
      personalSignList: 'personal_sign_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      contractName: 'string',
      filePath: 'string',
      orgSignList: { 'type': 'array', 'itemType': OrgSigning },
      personalSignList: { 'type': 'array', 'itemType': PersonalSigning },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 金额信息
export class Amount extends $tea.Model {
  // 币种代码，如CNY代表人民币
  code: string;
  // 币种金额，如200.00，人民币以元为单位，保留两位小数
  value: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 抵押单
export class MgOrder extends $tea.Model {
  // 已签署的合同列表
  agreements?: Agreement[];
  // 附件材料列表
  archives?: Archive[];
  // 房屋授权查询合同签署任务
  authArSignTask?: ArSignTask;
  // 银行名称
  bankName?: string;
  // 银行编号
  bankNo?: string;
  // 借款人身份证号
  certNo?: string;
  // 证件类型，比如：ID_CARD=身份证
  certType?: string;
  // 借款人编号
  cmNo?: string;
  // 抵押登记结束日期
  endTime?: string;
  // 抵押登记失败类型，比如：MF_REALTY_NOT_EXISTS=房产信息不存在
  failCode?: string;
  // 抵押登记错误信息描述
  failDesc?: string;
  // 不动产返回房产信息
  house?: House;
  // 确认预抵押登记时的所有合同变量和值的结合,Map<Sting,String>的json格式
  initArVarValueJson?: string;
  // 借款人婚姻状况，比如：MARRIED=已婚
  marriage?: string;
  // 抵押登记相关合同签署任务列表
  mgArSignTasks?: ArSignTask[];
  // 抵押登记回执
  mgCert?: MgCert;
  // 抵押单号
  mgOrderNo?: string;
  // 借款人身份证
  name?: string;
  // 银行的业务编号
  outBizNo?: string;
  // 抵押登记申请日期
  regApplyDate?: string;
  // 登记设立原因，比如：LOAN=借贷
  regReason?: string;
  // 登记设立原因描述
  regReasonRemark?: string;
  // 登记权利,比如：MORTGAGE_RIGHTS=抵押权
  regRights?: string;
  // 登记类型，比如：FIRST_REG=首次登记
  regType?: string;
  // 不动产中心的抵押登记号
  rtcMgOrderNo?: string;
  // 不动产登记中心名称
  rtcName?: string;
  // 不动产登记中心编号
  rtcNo?: string;
  // 借款人配偶客户编号
  spouseCmNo?: string;
  // 发起抵押登记时的所有合同变量和值的结合,Map<Sting,String>的json格式
  startArVarValueJson?: string;
  // 抵押登记发起日期
  startTime?: string;
  // 抵押单状态 ，比如：MG_ING=抵押登记中
  status?: string;
  // 扩展字段
  extendJson?: string;
  // 助贷平台
  loanAssistPlatform?: string;
  // 办理业务分支行
  branchBank?: Bank;
  static names(): { [key: string]: string } {
    return {
      agreements: 'agreements',
      archives: 'archives',
      authArSignTask: 'auth_ar_sign_task',
      bankName: 'bank_name',
      bankNo: 'bank_no',
      certNo: 'cert_no',
      certType: 'cert_type',
      cmNo: 'cm_no',
      endTime: 'end_time',
      failCode: 'fail_code',
      failDesc: 'fail_desc',
      house: 'house',
      initArVarValueJson: 'init_ar_var_value_json',
      marriage: 'marriage',
      mgArSignTasks: 'mg_ar_sign_tasks',
      mgCert: 'mg_cert',
      mgOrderNo: 'mg_order_no',
      name: 'name',
      outBizNo: 'out_biz_no',
      regApplyDate: 'reg_apply_date',
      regReason: 'reg_reason',
      regReasonRemark: 'reg_reason_remark',
      regRights: 'reg_rights',
      regType: 'reg_type',
      rtcMgOrderNo: 'rtc_mg_order_no',
      rtcName: 'rtc_name',
      rtcNo: 'rtc_no',
      spouseCmNo: 'spouse_cm_no',
      startArVarValueJson: 'start_ar_var_value_json',
      startTime: 'start_time',
      status: 'status',
      extendJson: 'extend_json',
      loanAssistPlatform: 'loan_assist_platform',
      branchBank: 'branch_bank',
    };
  }

  static types(): { [key: string]: any } {
    return {
      agreements: { 'type': 'array', 'itemType': Agreement },
      archives: { 'type': 'array', 'itemType': Archive },
      authArSignTask: ArSignTask,
      bankName: 'string',
      bankNo: 'string',
      certNo: 'string',
      certType: 'string',
      cmNo: 'string',
      endTime: 'string',
      failCode: 'string',
      failDesc: 'string',
      house: House,
      initArVarValueJson: 'string',
      marriage: 'string',
      mgArSignTasks: { 'type': 'array', 'itemType': ArSignTask },
      mgCert: MgCert,
      mgOrderNo: 'string',
      name: 'string',
      outBizNo: 'string',
      regApplyDate: 'string',
      regReason: 'string',
      regReasonRemark: 'string',
      regRights: 'string',
      regType: 'string',
      rtcMgOrderNo: 'string',
      rtcName: 'string',
      rtcNo: 'string',
      spouseCmNo: 'string',
      startArVarValueJson: 'string',
      startTime: 'string',
      status: 'string',
      extendJson: 'string',
      loanAssistPlatform: 'string',
      branchBank: Bank,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 银行网办操作员
export class BankOperator extends $tea.Model {
  // 网办操作员工号
  opNo?: string;
  // 姓名
  name?: string;
  // 证件类型
  certType?: string;
  // 证件号
  certNo?: string;
  // 手机号
  mobile?: string;
  static names(): { [key: string]: string } {
    return {
      opNo: 'op_no',
      name: 'name',
      certType: 'cert_type',
      certNo: 'cert_no',
      mobile: 'mobile',
    };
  }

  static types(): { [key: string]: any } {
    return {
      opNo: 'string',
      name: 'string',
      certType: 'string',
      certNo: 'string',
      mobile: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 不动产中心
export class RealtyCenter extends $tea.Model {
  // 不动产中心地址
  address?: string;
  // 不动产中心名称 
  name?: string;
  // 外部不动产中心编号(不动产中心提供)
  outRtcNo?: string;
  // 蚂蚁链身份id
  pdnDid?: string;
  // 公钥
  pubKey?: string;
  // 不动产中心编号
  rtcNo?: string;
  static names(): { [key: string]: string } {
    return {
      address: 'address',
      name: 'name',
      outRtcNo: 'out_rtc_no',
      pdnDid: 'pdn_did',
      pubKey: 'pub_key',
      rtcNo: 'rtc_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      address: 'string',
      name: 'string',
      outRtcNo: 'string',
      pdnDid: 'string',
      pubKey: 'string',
      rtcNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 解抵押单
export class MgReleaseOrder extends $tea.Model {
  // 解抵押单号
  mgReleaseOrderNo?: string;
  // 不动产中心解抵押单号
  rtcMgReleaseOrderNo?: string;
  // 机构侧业务单号
  outBizNo?: string;
  // 抵押登记权证号(他项权证号)
  otherRightCertNo?: string;
  // 抵押权消灭原因,OAN_FINISHED=借款已结清或主债权已灭失
  wipeMortgageReason?: string;
  // 解抵押状态
  status?: string;
  // 房产链内部银行编号
  bankNo?: string;
  // 银行名称
  bankName?: string;
  // 房产链内部不动产中心编号
  rtcNo?: string;
  // 不动产中心名称
  rtcName?: string;
  // 办理业务分支行
  branchBank?: Bank;
  // 解抵押的房产信息
  house?: House;
  // 解抵押的合同列表
  agreements?: Agreement[];
  // 解抵押相关的附件材料
  archives?: Archive[];
  // 解抵押单据生成时间
  startTime?: string;
  // 解抵押单据结束时间
  endTime?: string;
  // 解抵押失败code,MGR_AR_SIGN_FAIL=解抵押合同签署失败
  failCode?: string;
  // 解抵押失败原因描述
  failDesc?: string;
  // 助贷平台
  loanAssistPlatform?: string;
  static names(): { [key: string]: string } {
    return {
      mgReleaseOrderNo: 'mg_release_order_no',
      rtcMgReleaseOrderNo: 'rtc_mg_release_order_no',
      outBizNo: 'out_biz_no',
      otherRightCertNo: 'other_right_cert_no',
      wipeMortgageReason: 'wipe_mortgage_reason',
      status: 'status',
      bankNo: 'bank_no',
      bankName: 'bank_name',
      rtcNo: 'rtc_no',
      rtcName: 'rtc_name',
      branchBank: 'branch_bank',
      house: 'house',
      agreements: 'agreements',
      archives: 'archives',
      startTime: 'start_time',
      endTime: 'end_time',
      failCode: 'fail_code',
      failDesc: 'fail_desc',
      loanAssistPlatform: 'loan_assist_platform',
    };
  }

  static types(): { [key: string]: any } {
    return {
      mgReleaseOrderNo: 'string',
      rtcMgReleaseOrderNo: 'string',
      outBizNo: 'string',
      otherRightCertNo: 'string',
      wipeMortgageReason: 'string',
      status: 'string',
      bankNo: 'string',
      bankName: 'string',
      rtcNo: 'string',
      rtcName: 'string',
      branchBank: Bank,
      house: House,
      agreements: { 'type': 'array', 'itemType': Agreement },
      archives: { 'type': 'array', 'itemType': Archive },
      startTime: 'string',
      endTime: 'string',
      failCode: 'string',
      failDesc: 'string',
      loanAssistPlatform: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 附件材料信息
export class ArchiveInfo extends $tea.Model {
  // 附件存储OSS路径
  ossKey?: string;
  // 附件材料类型，比如：AT_SUOYOUQUANZHENG=房屋所有权证
  type?: string;
  // 附件内容摘要
  hash?: string;
  static names(): { [key: string]: string } {
    return {
      ossKey: 'oss_key',
      type: 'type',
      hash: 'hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ossKey: 'string',
      type: 'string',
      hash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 抵押担保信息
export class MortGuaranteeInfo extends $tea.Model {
  // 争议处理方式,比如：COUNT_PROCEEDING=有管辖权的人民法院提起诉讼
  conflictHandleMethod?: string;
  // 评估价值，人民币默认单位为元，小数点保留2位
  evaluationAmt?: string;
  // 评估价值货币类型,比如：CNY=人民币
  evaluationAmtCurrency?: string;
  // 担保范围列表,比如：MAIN_CLAIM=主债权
  guaranteeScopeJson?: string[];
  // 担保范围备注
  guaranteeScopeNote?: string;
  // 抵押方式，比如：MAX_AMOUNT_MORT=最高额抵押权
  mortgageType?: string;
  // 被担保主债权数额,人民币默认单位元，保留两位小数点
  debtAmt?: string;
  // 被担保主债权数额货币类型，比如：CNY=人民币
  debtAmtCurrency?: string;
  // 履债结束日期
  debtEndDate?: string;
  // 履债起始日期
  debtStartDate?: string;
  // 抵押物属性,比如：REGISTED_BUILDING=已建成并登记发证建筑物
  mortRealtyProperty?: string;
  // 合同债权金额币种
  arDebtAmtCurrency?: string;
  // 合同债权金额
  arDebtAmt?: string;
  // 房产链内部抵押单号
  mgOrderNo?: string;
  static names(): { [key: string]: string } {
    return {
      conflictHandleMethod: 'conflict_handle_method',
      evaluationAmt: 'evaluation_amt',
      evaluationAmtCurrency: 'evaluation_amt_currency',
      guaranteeScopeJson: 'guarantee_scope_json',
      guaranteeScopeNote: 'guarantee_scope_note',
      mortgageType: 'mortgage_type',
      debtAmt: 'debt_amt',
      debtAmtCurrency: 'debt_amt_currency',
      debtEndDate: 'debt_end_date',
      debtStartDate: 'debt_start_date',
      mortRealtyProperty: 'mort_realty_property',
      arDebtAmtCurrency: 'ar_debt_amt_currency',
      arDebtAmt: 'ar_debt_amt',
      mgOrderNo: 'mg_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      conflictHandleMethod: 'string',
      evaluationAmt: 'string',
      evaluationAmtCurrency: 'string',
      guaranteeScopeJson: { 'type': 'array', 'itemType': 'string' },
      guaranteeScopeNote: 'string',
      mortgageType: 'string',
      debtAmt: 'string',
      debtAmtCurrency: 'string',
      debtEndDate: 'string',
      debtStartDate: 'string',
      mortRealtyProperty: 'string',
      arDebtAmtCurrency: 'string',
      arDebtAmt: 'string',
      mgOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartRcpHqRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 房产查询场景,NO_AUTH_QUERY=无授权直查
  scene: string;
  // 助贷平台
  loanAssistPlatform: string;
  // 房产链内部银行编号
  bankNo: string;
  // 外部业务单号
  outBizNo: string;
  // 房产信息
  house: House;
  // 查询产权
  houseOwner: HouseOwner;
  // 办理业务分支行
  branchBank: Bank;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      scene: 'scene',
      loanAssistPlatform: 'loan_assist_platform',
      bankNo: 'bank_no',
      outBizNo: 'out_biz_no',
      house: 'house',
      houseOwner: 'house_owner',
      branchBank: 'branch_bank',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      scene: 'string',
      loanAssistPlatform: 'string',
      bankNo: 'string',
      outBizNo: 'string',
      house: House,
      houseOwner: HouseOwner,
      branchBank: Bank,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartRcpHqResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  // 房产链房产查询单号
  hqOrderNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      hqOrderNo: 'hq_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      hqOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRcpHqRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 房产链内部银行编号
  bankNo: string;
  // 房产查询单号
  hqOrderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bankNo: 'bank_no',
      hqOrderNo: 'hq_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bankNo: 'string',
      hqOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRcpHqResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  // 房产查询单明细
  hqOrder?: HqOrder;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      hqOrder: 'hq_order',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      hqOrder: HqOrder,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartRcpMgrRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 助贷平台
  loanAssistPlatform: string;
  // 房产链内部银行编号
  bankNo: string;
  // 外部业务单号
  outBizNo: string;
  // 不动产颁发的他项权证号
  otherRightCertNo: string;
  // 抵押权消灭原因,OAN_FINISHED=借款已结清或主债权已灭失
  wipeMortgageReason: string;
  // 解抵押的房产信息
  house: House;
  // 办理业务分支行
  branchBank: Bank;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      loanAssistPlatform: 'loan_assist_platform',
      bankNo: 'bank_no',
      outBizNo: 'out_biz_no',
      otherRightCertNo: 'other_right_cert_no',
      wipeMortgageReason: 'wipe_mortgage_reason',
      house: 'house',
      branchBank: 'branch_bank',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      loanAssistPlatform: 'string',
      bankNo: 'string',
      outBizNo: 'string',
      otherRightCertNo: 'string',
      wipeMortgageReason: 'string',
      house: House,
      branchBank: Bank,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartRcpMgrResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  // 解抵押单号
  mgReleaseOrderNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      mgReleaseOrderNo: 'mg_release_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      mgReleaseOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmRcpMgrRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 助贷平台
  loanAssistPlatform: string;
  // 房产链内部银行编号
  bankNo: string;
  // 解抵押单号
  mgReleaseOrderNo: string;
  // Y=继续解抵押,N=终止解抵押
  result: string;
  // 终止解抵押原因码
  failCode?: string;
  // 终止解抵押原因描述
  failDesc?: string;
  // 银行签署完成的解抵押合同列表
  agreements: Agreement[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      loanAssistPlatform: 'loan_assist_platform',
      bankNo: 'bank_no',
      mgReleaseOrderNo: 'mg_release_order_no',
      result: 'result',
      failCode: 'fail_code',
      failDesc: 'fail_desc',
      agreements: 'agreements',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      loanAssistPlatform: 'string',
      bankNo: 'string',
      mgReleaseOrderNo: 'string',
      result: 'string',
      failCode: 'string',
      failDesc: 'string',
      agreements: { 'type': 'array', 'itemType': Agreement },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmRcpMgrResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRcpMgrRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 房产链内部银行编号
  bankNo: string;
  // 房产链解抵押单号
  mgReleaseOrderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bankNo: 'bank_no',
      mgReleaseOrderNo: 'mg_release_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bankNo: 'string',
      mgReleaseOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRcpMgrResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  // 解抵押单明细
  mgReleaseOrder?: MgReleaseOrder;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      mgReleaseOrder: 'mg_release_order',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      mgReleaseOrder: MgReleaseOrder,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartRcpMgRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 待签署的合同列表
  agreements: Agreement[];
  // 材料清单列表
  archives?: Archive[];
  // 合同变量和值的全集，Map<String,String>的json格式
  arVarValueJson: string;
  // 银行编号
  bankNo: string;
  // 借款人
  borrower: Person;
  // 扩展字段
  extendJson?: string;
  // 抵押房产
  house: House;
  // 婚姻状况,比如：MARRIED=已婚
  maritalStatus: string;
  // 外部业务单号，银行提供
  outBizNo: string;
  // 登记设立原因，比如：LOAN=借贷
  regReason: string;
  // 登记设立原因备注
  regReasonRemark?: string;
  // 登记权利,比如：MORTGAGE_RIGHTS=抵押权
  regRights: string;
  // 登记类型，比如：FIRST_REG=首次登记
  regType: string;
  // 配偶
  spouse?: Person;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      agreements: 'agreements',
      archives: 'archives',
      arVarValueJson: 'ar_var_value_json',
      bankNo: 'bank_no',
      borrower: 'borrower',
      extendJson: 'extend_json',
      house: 'house',
      maritalStatus: 'marital_status',
      outBizNo: 'out_biz_no',
      regReason: 'reg_reason',
      regReasonRemark: 'reg_reason_remark',
      regRights: 'reg_rights',
      regType: 'reg_type',
      spouse: 'spouse',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      agreements: { 'type': 'array', 'itemType': Agreement },
      archives: { 'type': 'array', 'itemType': Archive },
      arVarValueJson: 'string',
      bankNo: 'string',
      borrower: Person,
      extendJson: 'string',
      house: House,
      maritalStatus: 'string',
      outBizNo: 'string',
      regReason: 'string',
      regReasonRemark: 'string',
      regRights: 'string',
      regType: 'string',
      spouse: Person,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartRcpMgResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  // 抵押单号
  mgOrderNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      mgOrderNo: 'mg_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      mgOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRcpMgRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 银行编号
  bankNo: string;
  // 抵押单号
  mgOrderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bankNo: 'bank_no',
      mgOrderNo: 'mg_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bankNo: 'string',
      mgOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRcpMgResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  // 抵押单
  mgOrder?: MgOrder;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      mgOrder: 'mg_order',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      mgOrder: MgOrder,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmRcpMgRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 银行编号
  bankNo: string;
  // 抵押单号
  mgOrderNo: string;
  // 确认抵押登记结果，Y:继续,N:中止抵押
  result: string;
  // 银行返回的中止抵押原因code
  failCode?: string;
  // 银行反馈的中止抵押原因描述
  failDesc?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bankNo: 'bank_no',
      mgOrderNo: 'mg_order_no',
      result: 'result',
      failCode: 'fail_code',
      failDesc: 'fail_desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bankNo: 'string',
      mgOrderNo: 'string',
      result: 'string',
      failCode: 'string',
      failDesc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmRcpMgResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitRcpMgRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 银行编号
  bankNo: string;
  // 抵押单号
  mgOrderNo: string;
  // 确认预抵押结论，Y-表示继续，N-表示中止
  result: string;
  // 中止抵押的原因code
  failCode?: string;
  // 中止抵押的原因描述
  failDesc?: string;
  // 抵押登记相关合同变量和值全集，Map<String,String>的json格式
  arVarValueJson: string;
  // 抵押担保信息
  mgOrderMortGuarantee: MortGuaranteeInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bankNo: 'bank_no',
      mgOrderNo: 'mg_order_no',
      result: 'result',
      failCode: 'fail_code',
      failDesc: 'fail_desc',
      arVarValueJson: 'ar_var_value_json',
      mgOrderMortGuarantee: 'mg_order_mort_guarantee',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bankNo: 'string',
      mgOrderNo: 'string',
      result: 'string',
      failCode: 'string',
      failDesc: 'string',
      arVarValueJson: 'string',
      mgOrderMortGuarantee: MortGuaranteeInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitRcpMgResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartRcpMgvtwoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 助贷平台
  loanAssistPlatform?: string;
  // 房产链内部银行编号
  bankNo?: string;
  // 外部业务单号
  outBizNo?: string;
  // 借款人
  borrower?: Person;
  // 婚姻状况
  maritalStatus?: string;
  // 借款人配偶
  spouse?: Person;
  // 房产信息
  house?: House;
  // 待签合同列表
  agreements?: Agreement[];
  // 客户签署合同过期时间
  arExpireTime?: string;
  // 抵押担保信息
  mgOrderMortGuarantee?: MortGuaranteeInfo;
  // 办理业务分支行
  branchBank?: Bank;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      loanAssistPlatform: 'loan_assist_platform',
      bankNo: 'bank_no',
      outBizNo: 'out_biz_no',
      borrower: 'borrower',
      maritalStatus: 'marital_status',
      spouse: 'spouse',
      house: 'house',
      agreements: 'agreements',
      arExpireTime: 'ar_expire_time',
      mgOrderMortGuarantee: 'mg_order_mort_guarantee',
      branchBank: 'branch_bank',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      loanAssistPlatform: 'string',
      bankNo: 'string',
      outBizNo: 'string',
      borrower: Person,
      maritalStatus: 'string',
      spouse: Person,
      house: House,
      agreements: { 'type': 'array', 'itemType': Agreement },
      arExpireTime: 'string',
      mgOrderMortGuarantee: MortGuaranteeInfo,
      branchBank: Bank,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartRcpMgvtwoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  // 房产链抵押单号
  mgOrderNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      mgOrderNo: 'mg_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      mgOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmRcpMgvtwoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 助贷平台
  loanAssistPlatform: string;
  // 房产链内部银行编号
  bankNo: string;
  // 房产链抵押单号
  mgOrderNo: string;
  // 确认抵押结果，Y:继续抵押,N:终止抵押
  result: string;
  // 终止抵押原因code
  failCode?: string;
  // 终止抵押原因desc
  failDesc?: string;
  // 借款人
  borrower: Person;
  // 婚姻状况,MARRIED=已婚
  maritalStatus: string;
  // 借款人配偶
  spouse?: Person;
  // 银行签署完成的合同列表
  agreements: Agreement[];
  // 确认抵押需要的影印材料列表
  archives: Archive[];
  // 登记权利类型，MORTGAGE_RIGHTS=抵押权
  regRights: string;
  // 登记类型,FIRSTMAXGAGE_BIZTYPE=不动产抵押权首次登记(最高额抵押)
  regType: string;
  // 登记设立原因,LOAN=借贷
  regReason: string;
  // 登记设立原因备注
  regReasonRemark: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      loanAssistPlatform: 'loan_assist_platform',
      bankNo: 'bank_no',
      mgOrderNo: 'mg_order_no',
      result: 'result',
      failCode: 'fail_code',
      failDesc: 'fail_desc',
      borrower: 'borrower',
      maritalStatus: 'marital_status',
      spouse: 'spouse',
      agreements: 'agreements',
      archives: 'archives',
      regRights: 'reg_rights',
      regType: 'reg_type',
      regReason: 'reg_reason',
      regReasonRemark: 'reg_reason_remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      loanAssistPlatform: 'string',
      bankNo: 'string',
      mgOrderNo: 'string',
      result: 'string',
      failCode: 'string',
      failDesc: 'string',
      borrower: Person,
      maritalStatus: 'string',
      spouse: Person,
      agreements: { 'type': 'array', 'itemType': Agreement },
      archives: { 'type': 'array', 'itemType': Archive },
      regRights: 'string',
      regType: 'string',
      regReason: 'string',
      regReasonRemark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmRcpMgvtwoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CloseRcpMgvtwoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 助贷平台
  loanAssistPlatform: string;
  // 房产链内部银行编号
  bankNo: string;
  // 房产链抵押单
  mgOrderNo: string;
  // 终止抵押原因码
  failCode?: string;
  // 终止抵押原因描述
  failDesc?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      loanAssistPlatform: 'loan_assist_platform',
      bankNo: 'bank_no',
      mgOrderNo: 'mg_order_no',
      failCode: 'fail_code',
      failDesc: 'fail_desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      loanAssistPlatform: 'string',
      bankNo: 'string',
      mgOrderNo: 'string',
      failCode: 'string',
      failDesc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CloseRcpMgvtwoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRcpMgvtwoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 房产链内部银行编号
  bankNo: string;
  // 房产链内部抵押单号
  mgOrderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bankNo: 'bank_no',
      mgOrderNo: 'mg_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bankNo: 'string',
      mgOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRcpMgvtwoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  // 抵押单明细
  mgOrder?: MgOrder;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      mgOrder: 'mg_order',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      mgOrder: MgOrder,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthRcpRtcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 申办业务号
  applyBizId: string;
  // 签署任务描述
  signTaskProfile: SignTaskProfile;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applyBizId: 'apply_biz_id',
      signTaskProfile: 'sign_task_profile',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applyBizId: 'string',
      signTaskProfile: SignTaskProfile,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthRcpRtcResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FinishRcpRtcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 申办业务号
  applyBizId: string;
  // 业务状态，可选值：PENDING("审核中")、CANCELLED("已撤回")、DONE("已办结")、REJECTED("已退件")、NEED_MORE_MATERIAL("待补件")
  bizStatus: string;
  // 业务类型，可选值：FIRST_BIZTYPE("不动产抵押权首次登记(普通抵押)"),、EGAGECANCEL_BIZTYPE("不动产抵押权注销登记")、FIRSTMAXGAGE_BIZTYPE("不动产抵押权首次登记(最高额抵押)")
  bizType: string;
  // 被担保主债权数额
  debtAmount: Amount;
  // 履债结束日期，格式为：yyyy-MM-dd
  debtEndDate?: string;
  // 履债开始日期，格式为：yyyy-MM-dd
  debtStartDate?: string;
  // 评估价值
  evaluationAmount?: Amount;
  // 抵押权人
  mortgagee: EntityBasicInfo;
  // 抵押方式，可选值： NORMAL_MORT("一般抵押权")、MAX_AMOUNT_MORT("最高额抵押权")
  mortgageType: string;
  // 他项权证信息
  otherRightInfo: OtherRightInfo;
  // 登记日期，格式为：yyyy-MM-dd
  registeredDate: string;
  // 材料文件列表，待缴费时必填）当业务状态为待缴费时，本材料文件列表会返回缴款通知书。
  materialFileList?: MaterialFileInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applyBizId: 'apply_biz_id',
      bizStatus: 'biz_status',
      bizType: 'biz_type',
      debtAmount: 'debt_amount',
      debtEndDate: 'debt_end_date',
      debtStartDate: 'debt_start_date',
      evaluationAmount: 'evaluation_amount',
      mortgagee: 'mortgagee',
      mortgageType: 'mortgage_type',
      otherRightInfo: 'other_right_info',
      registeredDate: 'registered_date',
      materialFileList: 'material_file_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applyBizId: 'string',
      bizStatus: 'string',
      bizType: 'string',
      debtAmount: Amount,
      debtEndDate: 'string',
      debtStartDate: 'string',
      evaluationAmount: Amount,
      mortgagee: EntityBasicInfo,
      mortgageType: 'string',
      otherRightInfo: OtherRightInfo,
      registeredDate: 'string',
      materialFileList: { 'type': 'array', 'itemType': MaterialFileInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FinishRcpRtcResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FinishRcpNingboRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 业务号，银行抵押登记申请接口中生成并传递给不动产的业务号
  ywh: string;
  // 不动产单元号，如14-2-1802
  bdcdyh: string;
  // 不动产登记证明号
  bdcdjzmh: string;
  // 证明权利或事项
  zmqlhsx: string;
  // 权利人
  qlr: string;
  // 义务人
  ywr: string;
  // 坐落
  zl: string;
  // 其他
  qt?: string;
  // 附记
  fj: string;
  // 发证工本号
  fzgbh: string;
  // 缮证人
  szr: string;
  // 缮证时间
  szsj: string;
  // 发证人
  fzr: string;
  // 发证时间
  fzsj: string;
  // 发证机关
  fzjg: string;
  // 区县代码
  qxdm: number;
  // 省编号
  sbh: string;
  // 登记证明种类
  djzmzl: string;
  // 电子版文件字符串
  djzmfile: string;
  // 债权数额，单位:万元
  zqse: string;
  // 抵押权起始日期，格式：“yyyy-MM-dd”
  qlqssj: string;
  // 抵押权结束日期，格式：“yyyy-MM-dd”
  qljssj: string;
  // 抵押方式
  dyfs: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      ywh: 'ywh',
      bdcdyh: 'bdcdyh',
      bdcdjzmh: 'bdcdjzmh',
      zmqlhsx: 'zmqlhsx',
      qlr: 'qlr',
      ywr: 'ywr',
      zl: 'zl',
      qt: 'qt',
      fj: 'fj',
      fzgbh: 'fzgbh',
      szr: 'szr',
      szsj: 'szsj',
      fzr: 'fzr',
      fzsj: 'fzsj',
      fzjg: 'fzjg',
      qxdm: 'qxdm',
      sbh: 'sbh',
      djzmzl: 'djzmzl',
      djzmfile: 'djzmfile',
      zqse: 'zqse',
      qlqssj: 'qlqssj',
      qljssj: 'qljssj',
      dyfs: 'dyfs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      ywh: 'string',
      bdcdyh: 'string',
      bdcdjzmh: 'string',
      zmqlhsx: 'string',
      qlr: 'string',
      ywr: 'string',
      zl: 'string',
      qt: 'string',
      fj: 'string',
      fzgbh: 'string',
      szr: 'string',
      szsj: 'string',
      fzr: 'string',
      fzsj: 'string',
      fzjg: 'string',
      qxdm: 'number',
      sbh: 'string',
      djzmzl: 'string',
      djzmfile: 'string',
      zqse: 'string',
      qlqssj: 'string',
      qljssj: 'string',
      dyfs: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FinishRcpNingboResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RefuseRcpNingboRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 请求时间，是以long类型的字符串
  timestamp: string;
  // 业务号
  ywh: string;
  // 状态：1—审核通过（开始受理），2—驳回
  // 
  zt: string;
  // 备注，驳回原因
  bz: string;
  // 操作人
  czr: string;
  // 操作时间 yyyy-MM-dd HH:mm:ss
  czsj: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      timestamp: 'timestamp',
      ywh: 'ywh',
      zt: 'zt',
      bz: 'bz',
      czr: 'czr',
      czsj: 'czsj',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      timestamp: 'string',
      ywh: 'string',
      zt: 'string',
      bz: 'string',
      czr: 'string',
      czsj: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RefuseRcpNingboResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRealtytradeOrgRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 公司名称的全称
  name: string;
  // 机构证件类型，默认为：CRED_ORG_USCC（统一社会信用代码），证件类型详见 https://tech.antfin.com/docs/2/155166
  certType?: string;
  // 证件类型对应的证件号码
  certNo: string;
  // 经办人的证件类型，默认为身份证，值为：CRED_PSN_CH_IDCARD
  managerCertType?: string;
  // 经办人的证件号码
  // 
  // 
  managerCertNo: string;
  // 经办人的姓名
  // 
  // 
  managerName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      certType: 'cert_type',
      certNo: 'cert_no',
      managerCertType: 'manager_cert_type',
      managerCertNo: 'manager_cert_no',
      managerName: 'manager_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      certType: 'string',
      certNo: 'string',
      managerCertType: 'string',
      managerCertNo: 'string',
      managerName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRealtytradeOrgResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  // 本机构在数字房产平台的唯一ID
  // 
  // 
  orgId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orgId: 'org_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orgId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRealtytradeOrgsealRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 企业账户注册时返回的机构ID
  orgId: string;
  // 印章样式说明，Round-圆章，Oval-椭圆章，默认Round
  templateType?: string;
  // 印章颜色，ed-红色，Blue-蓝色，Black-黑色，默认Red
  sealColor?: string;
  // 中心图案类型，Star-圆形有五角星，None-圆形无五角星，默认None
  centerPattern?: string;
  // 企业用章说明，可设置0-8个字，企业名称超出25个字后，不支持设置横向文
  horizontalTitle?: string;
  // 企业用章日期范围等，可设置0-20个字，企业企业名称超出25个字后，不支持设置下弦文
  lastTitle?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orgId: 'org_id',
      templateType: 'template_type',
      sealColor: 'seal_color',
      centerPattern: 'center_pattern',
      horizontalTitle: 'horizontal_title',
      lastTitle: 'last_title',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orgId: 'string',
      templateType: 'string',
      sealColor: 'string',
      centerPattern: 'string',
      horizontalTitle: 'string',
      lastTitle: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRealtytradeOrgsealResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  // 企业印章 ID
  orgSealId?: string;
  // 印章图片下载URL地址，1个小时内有效
  url?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orgSealId: 'org_seal_id',
      url: 'url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orgSealId: 'string',
      url: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRealtytradePersonalRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 姓名
  name: string;
  // 证件类型详见 https://tech.antfin.com/docs/2/155166，默认为CRED_PSN_CH_IDCARD（身份证类型）
  certType?: string;
  // 证件号码
  certNo: string;
  // 手机号码
  telephone: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      certType: 'cert_type',
      certNo: 'cert_no',
      telephone: 'telephone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      certType: 'string',
      certNo: 'string',
      telephone: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRealtytradePersonalResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  // 个人在数字房产平台的唯一ID
  personalId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      personalId: 'personal_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      personalId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRealtytradePersonalsealRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 个人在数字房产平台的唯一ID
  personalId: string;
  // 图片data，BASE64 编码后图片信息，图片原始格式必须为 png
  pictureData: string;
  // 印章高度，单位为px，默认95
  sealHeight?: number;
  // 印章宽度，单位为px，默认95
  sealWidth?: number;
  // 否对图片进行透明化处理，默认false。仅对图片整体做透明化处理，无法去除图片背景。
  transparentizing?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      personalId: 'personal_id',
      pictureData: 'picture_data',
      sealHeight: 'seal_height',
      sealWidth: 'seal_width',
      transparentizing: 'transparentizing',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      personalId: 'string',
      pictureData: 'string',
      sealHeight: 'number',
      sealWidth: 'number',
      transparentizing: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRealtytradePersonalsealResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  // 个人印章 ID
  personalSealId?: string;
  // 印章图片下载URL地址，1个小时内有效
  url?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      personalSealId: 'personal_seal_id',
      url: 'url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      personalSealId: 'string',
      url: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartRealtytradeSigningRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 机构账号 ID
  orgId: string;
  // 业务描述,描述本次合同文档加载业务
  description: string;
  // 合同及签署信息列表
  contractList: ContractSigning[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orgId: 'org_id',
      description: 'description',
      contractList: 'contract_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orgId: 'string',
      description: 'string',
      contractList: { 'type': 'array', 'itemType': ContractSigning },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartRealtytradeSigningResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  // 签署流程 ID
  processId?: string;
  // 签署中的多个合同文件信息
  contractList?: Contract[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      processId: 'process_id',
      contractList: 'contract_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      processId: 'string',
      contractList: { 'type': 'array', 'itemType': Contract },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRealtytradeSigningRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 签署流程 ID
  // 
  processId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      processId: 'process_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      processId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRealtytradeSigningResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  // 签署流程 ID
  processId?: string;
  // 签署流程状态，包括值为：Initial、Pending、Ready、Started、Finish
  status?: string;
  // 签署结果，包括值为：2-完成，所有签署人完成签署，3-撤销，发起方撤销签署任务，5-过期（签署截止日到期后触发），7-拒签 
  signingResult?: string;
  // 合同信息列表，列表描述本流程中的多个文件详情，只有签署结果为完成时才有合同的归档文件下载路径：archived_file_url
  contractList?: Contract[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      processId: 'process_id',
      status: 'status',
      signingResult: 'signing_result',
      contractList: 'contract_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      processId: 'string',
      status: 'string',
      signingResult: 'string',
      contractList: { 'type': 'array', 'itemType': Contract },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}


export default class Client {
  _endpoint: string;
  _regionId: string;
  _accessKeyId: string;
  _accessKeySecret: string;
  _protocol: string;
  _userAgent: string;
  _readTimeout: number;
  _connectTimeout: number;
  _httpProxy: string;
  _httpsProxy: string;
  _socks5Proxy: string;
  _socks5NetWork: string;
  _noProxy: string;
  _maxIdleConns: number;
  _securityToken: string;
  _maxIdleTimeMillis: number;
  _keepAliveDurationMillis: number;
  _maxRequests: number;
  _maxRequestsPerHost: number;

  /**
   * Init client with Config
   * @param config config contains the necessary information to create a client
   */
  constructor(config: Config) {
    if (Util.isUnset($tea.toMap(config))) {
      throw $tea.newError({
        code: "ParameterMissing",
        message: "'config' can not be unset",
      });
    }

    this._accessKeyId = config.accessKeyId;
    this._accessKeySecret = config.accessKeySecret;
    this._securityToken = config.securityToken;
    this._endpoint = config.endpoint;
    this._protocol = config.protocol;
    this._userAgent = config.userAgent;
    this._readTimeout = Util.defaultNumber(config.readTimeout, 20000);
    this._connectTimeout = Util.defaultNumber(config.connectTimeout, 20000);
    this._httpProxy = config.httpProxy;
    this._httpsProxy = config.httpsProxy;
    this._noProxy = config.noProxy;
    this._socks5Proxy = config.socks5Proxy;
    this._socks5NetWork = config.socks5NetWork;
    this._maxIdleConns = Util.defaultNumber(config.maxIdleConns, 60000);
    this._maxIdleTimeMillis = Util.defaultNumber(config.maxIdleTimeMillis, 5);
    this._keepAliveDurationMillis = Util.defaultNumber(config.keepAliveDurationMillis, 5000);
    this._maxRequests = Util.defaultNumber(config.maxRequests, 100);
    this._maxRequestsPerHost = Util.defaultNumber(config.maxRequestsPerHost, 100);
  }

  /**
   * Encapsulate the request and invoke the network
   * @param action api name
   * @param protocol http or https
   * @param method e.g. GET
   * @param pathname pathname of every api
   * @param request which contains request params
   * @param runtime which controls some details of call api, such as retry times
   * @return the response
   */
  async doRequest(version: string, action: string, protocol: string, method: string, pathname: string, request: {[key: string]: any}, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<{[key: string]: any}> {
    let _runtime: { [key: string]: any } = {
      timeouted: "retry",
      readTimeout: Util.defaultNumber(runtime.readTimeout, this._readTimeout),
      connectTimeout: Util.defaultNumber(runtime.connectTimeout, this._connectTimeout),
      httpProxy: Util.defaultString(runtime.httpProxy, this._httpProxy),
      httpsProxy: Util.defaultString(runtime.httpsProxy, this._httpsProxy),
      noProxy: Util.defaultString(runtime.noProxy, this._noProxy),
      maxIdleConns: Util.defaultNumber(runtime.maxIdleConns, this._maxIdleConns),
      maxIdleTimeMillis: this._maxIdleTimeMillis,
      keepAliveDurationMillis: this._keepAliveDurationMillis,
      maxRequests: this._maxRequests,
      maxRequestsPerHost: this._maxRequestsPerHost,
      retry: {
        retryable: runtime.autoretry,
        maxAttempts: Util.defaultNumber(runtime.maxAttempts, 3),
      },
      backoff: {
        policy: Util.defaultString(runtime.backoffPolicy, "no"),
        period: Util.defaultNumber(runtime.backoffPeriod, 1),
      },
      ignoreSSL: runtime.ignoreSSL,
    }

    let _lastRequest = null;
    let _now = Date.now();
    let _retryTimes = 0;
    while ($tea.allowRetry(_runtime['retry'], _retryTimes, _now)) {
      if (_retryTimes > 0) {
        let _backoffTime = $tea.getBackoffTime(_runtime['backoff'], _retryTimes);
        if (_backoffTime > 0) {
          await $tea.sleep(_backoffTime);
        }
      }

      _retryTimes = _retryTimes + 1;
      try {
        let request_ = new $tea.Request();
        request_.protocol = Util.defaultString(this._protocol, protocol);
        request_.method = method;
        request_.pathname = pathname;
        request_.query = {
          method: action,
          version: version,
          sign_type: "HmacSHA1",
          req_time: AntchainUtil.getTimestamp(),
          req_msg_id: AntchainUtil.getNonce(),
          access_key: this._accessKeyId,
          base_sdk_version: "TeaSDK-2.0",
          sdk_version: "1.4.10",
        };
        if (!Util.empty(this._securityToken)) {
          request_.query["security_token"] = this._securityToken;
        }

        request_.headers = {
          host: Util.defaultString(this._endpoint, "openapi.antchain.antgroup.com"),
          'user-agent': Util.getUserAgent(this._userAgent),
          ...headers,
        };
        let tmp = Util.anyifyMapValue(RPCUtil.query(request));
        request_.body = new $tea.BytesReadable(Util.toFormString(tmp));
        request_.headers["content-type"] = "application/x-www-form-urlencoded";
        let signedParam = {
          ...request_.query,
          ...RPCUtil.query(request),
        };
        request_.query["sign"] = AntchainUtil.getSignature(signedParam, this._accessKeySecret);
        _lastRequest = request_;
        let response_ = await $tea.doAction(request_, _runtime);

        let raw = await Util.readAsString(response_.body);
        let obj = Util.parseJSON(raw);
        let res = Util.assertAsMap(obj);
        let resp = Util.assertAsMap(res["response"]);
        if (AntchainUtil.hasError(raw, this._accessKeySecret)) {
          throw $tea.newError({
            message: resp["result_msg"],
            data: resp,
            code: resp["result_code"],
          });
        }

        return resp;
      } catch (ex) {
        if ($tea.isRetryable(ex)) {
          continue;
        }
        throw ex;
      }
    }

    throw $tea.newUnretryableError(_lastRequest);
  }

  /**
   * Description: 发起房产查询
   * Summary: 发起房产查询
   */
  async startRcpHq(request: StartRcpHqRequest): Promise<StartRcpHqResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startRcpHqEx(request, headers, runtime);
  }

  /**
   * Description: 发起房产查询
   * Summary: 发起房产查询
   */
  async startRcpHqEx(request: StartRcpHqRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartRcpHqResponse> {
    Util.validateModel(request);
    return $tea.cast<StartRcpHqResponse>(await this.doRequest("1.0", "blockchain.arec.rcp.hq.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartRcpHqResponse({}));
  }

  /**
   * Description: 获取房产查询单信息
   * Summary: 获取房产查询单信息
   */
  async getRcpHq(request: GetRcpHqRequest): Promise<GetRcpHqResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getRcpHqEx(request, headers, runtime);
  }

  /**
   * Description: 获取房产查询单信息
   * Summary: 获取房产查询单信息
   */
  async getRcpHqEx(request: GetRcpHqRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetRcpHqResponse> {
    Util.validateModel(request);
    return $tea.cast<GetRcpHqResponse>(await this.doRequest("1.0", "blockchain.arec.rcp.hq.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetRcpHqResponse({}));
  }

  /**
   * Description: 发起解抵押(宁波模式)
   * Summary: 发起解抵押(宁波模式)
   */
  async startRcpMgr(request: StartRcpMgrRequest): Promise<StartRcpMgrResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startRcpMgrEx(request, headers, runtime);
  }

  /**
   * Description: 发起解抵押(宁波模式)
   * Summary: 发起解抵押(宁波模式)
   */
  async startRcpMgrEx(request: StartRcpMgrRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartRcpMgrResponse> {
    Util.validateModel(request);
    return $tea.cast<StartRcpMgrResponse>(await this.doRequest("1.0", "blockchain.arec.rcp.mgr.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartRcpMgrResponse({}));
  }

  /**
   * Description: 确认解抵押(宁波模式)
   * Summary: 确认解抵押(宁波模式)
   */
  async confirmRcpMgr(request: ConfirmRcpMgrRequest): Promise<ConfirmRcpMgrResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmRcpMgrEx(request, headers, runtime);
  }

  /**
   * Description: 确认解抵押(宁波模式)
   * Summary: 确认解抵押(宁波模式)
   */
  async confirmRcpMgrEx(request: ConfirmRcpMgrRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmRcpMgrResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmRcpMgrResponse>(await this.doRequest("1.0", "blockchain.arec.rcp.mgr.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmRcpMgrResponse({}));
  }

  /**
   * Description: 查询解抵押单(宁波模式)
   * Summary: 查询解抵押单(宁波模式)
   */
  async getRcpMgr(request: GetRcpMgrRequest): Promise<GetRcpMgrResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getRcpMgrEx(request, headers, runtime);
  }

  /**
   * Description: 查询解抵押单(宁波模式)
   * Summary: 查询解抵押单(宁波模式)
   */
  async getRcpMgrEx(request: GetRcpMgrRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetRcpMgrResponse> {
    Util.validateModel(request);
    return $tea.cast<GetRcpMgrResponse>(await this.doRequest("1.0", "blockchain.arec.rcp.mgr.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetRcpMgrResponse({}));
  }

  /**
   * Description: 房屋抵押贷款业务，发起抵押登记服务
   * Summary: 发起抵押登记
   */
  async startRcpMg(request: StartRcpMgRequest): Promise<StartRcpMgResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startRcpMgEx(request, headers, runtime);
  }

  /**
   * Description: 房屋抵押贷款业务，发起抵押登记服务
   * Summary: 发起抵押登记
   */
  async startRcpMgEx(request: StartRcpMgRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartRcpMgResponse> {
    Util.validateModel(request);
    return $tea.cast<StartRcpMgResponse>(await this.doRequest("1.0", "blockchain.arec.rcp.mg.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartRcpMgResponse({}));
  }

  /**
   * Description: 根据抵押单号查询抵押单
   * Summary: 查询抵押单
   */
  async getRcpMg(request: GetRcpMgRequest): Promise<GetRcpMgResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getRcpMgEx(request, headers, runtime);
  }

  /**
   * Description: 根据抵押单号查询抵押单
   * Summary: 查询抵押单
   */
  async getRcpMgEx(request: GetRcpMgRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetRcpMgResponse> {
    Util.validateModel(request);
    return $tea.cast<GetRcpMgResponse>(await this.doRequest("1.0", "blockchain.arec.rcp.mg.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetRcpMgResponse({}));
  }

  /**
   * Description: 房屋抵押登记业务，银行确认抵押登记服务
   * Summary: 确认抵押登记
   */
  async confirmRcpMg(request: ConfirmRcpMgRequest): Promise<ConfirmRcpMgResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmRcpMgEx(request, headers, runtime);
  }

  /**
   * Description: 房屋抵押登记业务，银行确认抵押登记服务
   * Summary: 确认抵押登记
   */
  async confirmRcpMgEx(request: ConfirmRcpMgRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmRcpMgResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmRcpMgResponse>(await this.doRequest("1.0", "blockchain.arec.rcp.mg.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmRcpMgResponse({}));
  }

  /**
   * Description: 确认预抵押登记，预抵押登记是正式抵押登记前置步骤
   * Summary: 确认进行预抵押登记
   */
  async initRcpMg(request: InitRcpMgRequest): Promise<InitRcpMgResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initRcpMgEx(request, headers, runtime);
  }

  /**
   * Description: 确认预抵押登记，预抵押登记是正式抵押登记前置步骤
   * Summary: 确认进行预抵押登记
   */
  async initRcpMgEx(request: InitRcpMgRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitRcpMgResponse> {
    Util.validateModel(request);
    return $tea.cast<InitRcpMgResponse>(await this.doRequest("1.0", "blockchain.arec.rcp.mg.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitRcpMgResponse({}));
  }

  /**
   * Description: 发起抵押(宁波模式)
   * Summary: 发起抵押(宁波模式)
   */
  async startRcpMgvtwo(request: StartRcpMgvtwoRequest): Promise<StartRcpMgvtwoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startRcpMgvtwoEx(request, headers, runtime);
  }

  /**
   * Description: 发起抵押(宁波模式)
   * Summary: 发起抵押(宁波模式)
   */
  async startRcpMgvtwoEx(request: StartRcpMgvtwoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartRcpMgvtwoResponse> {
    Util.validateModel(request);
    return $tea.cast<StartRcpMgvtwoResponse>(await this.doRequest("1.0", "blockchain.arec.rcp.mgvtwo.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartRcpMgvtwoResponse({}));
  }

  /**
   * Description: 确认抵押(宁波模式)
   * Summary: 确认抵押(宁波模式)
   */
  async confirmRcpMgvtwo(request: ConfirmRcpMgvtwoRequest): Promise<ConfirmRcpMgvtwoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmRcpMgvtwoEx(request, headers, runtime);
  }

  /**
   * Description: 确认抵押(宁波模式)
   * Summary: 确认抵押(宁波模式)
   */
  async confirmRcpMgvtwoEx(request: ConfirmRcpMgvtwoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmRcpMgvtwoResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmRcpMgvtwoResponse>(await this.doRequest("1.0", "blockchain.arec.rcp.mgvtwo.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmRcpMgvtwoResponse({}));
  }

  /**
   * Description: 终止抵押(宁波模式)
   * Summary: 终止抵押(宁波模式)
   */
  async closeRcpMgvtwo(request: CloseRcpMgvtwoRequest): Promise<CloseRcpMgvtwoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.closeRcpMgvtwoEx(request, headers, runtime);
  }

  /**
   * Description: 终止抵押(宁波模式)
   * Summary: 终止抵押(宁波模式)
   */
  async closeRcpMgvtwoEx(request: CloseRcpMgvtwoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CloseRcpMgvtwoResponse> {
    Util.validateModel(request);
    return $tea.cast<CloseRcpMgvtwoResponse>(await this.doRequest("1.0", "blockchain.arec.rcp.mgvtwo.close", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CloseRcpMgvtwoResponse({}));
  }

  /**
   * Description: 查询抵押单(宁波模式)
   * Summary: 查询抵押单(宁波模式)
   */
  async getRcpMgvtwo(request: GetRcpMgvtwoRequest): Promise<GetRcpMgvtwoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getRcpMgvtwoEx(request, headers, runtime);
  }

  /**
   * Description: 查询抵押单(宁波模式)
   * Summary: 查询抵押单(宁波模式)
   */
  async getRcpMgvtwoEx(request: GetRcpMgvtwoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetRcpMgvtwoResponse> {
    Util.validateModel(request);
    return $tea.cast<GetRcpMgvtwoResponse>(await this.doRequest("1.0", "blockchain.arec.rcp.mgvtwo.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetRcpMgvtwoResponse({}));
  }

  /**
   * Description: 不动产中心通知房产链待签约的合同列表，用户签约后表示授权办理相关业务。比如房产抵押。
   * Summary: 接收不动产中心授权签约列表
   */
  async authRcpRtc(request: AuthRcpRtcRequest): Promise<AuthRcpRtcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authRcpRtcEx(request, headers, runtime);
  }

  /**
   * Description: 不动产中心通知房产链待签约的合同列表，用户签约后表示授权办理相关业务。比如房产抵押。
   * Summary: 接收不动产中心授权签约列表
   */
  async authRcpRtcEx(request: AuthRcpRtcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthRcpRtcResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthRcpRtcResponse>(await this.doRequest("1.0", "blockchain.arec.rcp.rtc.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthRcpRtcResponse({}));
  }

  /**
   * Description: 接收不动产中心业务处理结果，比如抵押登记完成后的结果
   * Summary: 接收不动产中心业务处理结果
   */
  async finishRcpRtc(request: FinishRcpRtcRequest): Promise<FinishRcpRtcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.finishRcpRtcEx(request, headers, runtime);
  }

  /**
   * Description: 接收不动产中心业务处理结果，比如抵押登记完成后的结果
   * Summary: 接收不动产中心业务处理结果
   */
  async finishRcpRtcEx(request: FinishRcpRtcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<FinishRcpRtcResponse> {
    Util.validateModel(request);
    return $tea.cast<FinishRcpRtcResponse>(await this.doRequest("1.0", "blockchain.arec.rcp.rtc.finish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new FinishRcpRtcResponse({}));
  }

  /**
   * Description: 请求不动产中心发起抵押后，在抵押办理完成式，不动产中心通过此接口通知抵押结果。
   * Summary: 通知抵押结果完成(宁波)
   */
  async finishRcpNingbo(request: FinishRcpNingboRequest): Promise<FinishRcpNingboResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.finishRcpNingboEx(request, headers, runtime);
  }

  /**
   * Description: 请求不动产中心发起抵押后，在抵押办理完成式，不动产中心通过此接口通知抵押结果。
   * Summary: 通知抵押结果完成(宁波)
   */
  async finishRcpNingboEx(request: FinishRcpNingboRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<FinishRcpNingboResponse> {
    Util.validateModel(request);
    return $tea.cast<FinishRcpNingboResponse>(await this.doRequest("1.0", "blockchain.arec.rcp.ningbo.finish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new FinishRcpNingboResponse({}));
  }

  /**
   * Description: 通知抵押驳回
   * Summary: 通知抵押驳回(宁波)
   */
  async refuseRcpNingbo(request: RefuseRcpNingboRequest): Promise<RefuseRcpNingboResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.refuseRcpNingboEx(request, headers, runtime);
  }

  /**
   * Description: 通知抵押驳回
   * Summary: 通知抵押驳回(宁波)
   */
  async refuseRcpNingboEx(request: RefuseRcpNingboRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RefuseRcpNingboResponse> {
    Util.validateModel(request);
    return $tea.cast<RefuseRcpNingboResponse>(await this.doRequest("1.0", "blockchain.arec.rcp.ningbo.refuse", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RefuseRcpNingboResponse({}));
  }

  /**
   * Description: 提供企业账户创建接口，根据参数创建数字房产账户和区块链合同的机构账号。
   * Summary: 注册企业账户
   */
  async createRealtytradeOrg(request: CreateRealtytradeOrgRequest): Promise<CreateRealtytradeOrgResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createRealtytradeOrgEx(request, headers, runtime);
  }

  /**
   * Description: 提供企业账户创建接口，根据参数创建数字房产账户和区块链合同的机构账号。
   * Summary: 注册企业账户
   */
  async createRealtytradeOrgEx(request: CreateRealtytradeOrgRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateRealtytradeOrgResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateRealtytradeOrgResponse>(await this.doRequest("1.0", "blockchain.arec.realtytrade.org.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateRealtytradeOrgResponse({}));
  }

  /**
   * Description: 提供企业账户印章创建接口，该企业印章将展示在电子合同中企业盖章区域。
   * Summary: 创建企业印章
   */
  async createRealtytradeOrgseal(request: CreateRealtytradeOrgsealRequest): Promise<CreateRealtytradeOrgsealResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createRealtytradeOrgsealEx(request, headers, runtime);
  }

  /**
   * Description: 提供企业账户印章创建接口，该企业印章将展示在电子合同中企业盖章区域。
   * Summary: 创建企业印章
   */
  async createRealtytradeOrgsealEx(request: CreateRealtytradeOrgsealRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateRealtytradeOrgsealResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateRealtytradeOrgsealResponse>(await this.doRequest("1.0", "blockchain.arec.realtytrade.orgseal.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateRealtytradeOrgsealResponse({}));
  }

  /**
   * Description: 提供个人账户注册接口，注册数字房产账户以及关联的区块链合同签署数字证书等
   * Summary: 注册个人账户
   */
  async createRealtytradePersonal(request: CreateRealtytradePersonalRequest): Promise<CreateRealtytradePersonalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createRealtytradePersonalEx(request, headers, runtime);
  }

  /**
   * Description: 提供个人账户注册接口，注册数字房产账户以及关联的区块链合同签署数字证书等
   * Summary: 注册个人账户
   */
  async createRealtytradePersonalEx(request: CreateRealtytradePersonalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateRealtytradePersonalResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateRealtytradePersonalResponse>(await this.doRequest("1.0", "blockchain.arec.realtytrade.personal.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateRealtytradePersonalResponse({}));
  }

  /**
   * Description: 提供个人账户印章创建接口，该印章将展示在电子合同中企业盖章区域，最后一次创建的印章作为个人默认的印章。
   * Summary: 创建个人图片印章
   */
  async createRealtytradePersonalseal(request: CreateRealtytradePersonalsealRequest): Promise<CreateRealtytradePersonalsealResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createRealtytradePersonalsealEx(request, headers, runtime);
  }

  /**
   * Description: 提供个人账户印章创建接口，该印章将展示在电子合同中企业盖章区域，最后一次创建的印章作为个人默认的印章。
   * Summary: 创建个人图片印章
   */
  async createRealtytradePersonalsealEx(request: CreateRealtytradePersonalsealRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateRealtytradePersonalsealResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateRealtytradePersonalsealResponse>(await this.doRequest("1.0", "blockchain.arec.realtytrade.personalseal.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateRealtytradePersonalsealResponse({}));
  }

  /**
   * Description: 当调用方已渲染和填充完成待签署的合同文件(PDF格式)， 则可以提交文件来创建签署流程，一个流程支持关联多个待签署合同文件。
   * Summary: 发起签署流程
   */
  async startRealtytradeSigning(request: StartRealtytradeSigningRequest): Promise<StartRealtytradeSigningResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startRealtytradeSigningEx(request, headers, runtime);
  }

  /**
   * Description: 当调用方已渲染和填充完成待签署的合同文件(PDF格式)， 则可以提交文件来创建签署流程，一个流程支持关联多个待签署合同文件。
   * Summary: 发起签署流程
   */
  async startRealtytradeSigningEx(request: StartRealtytradeSigningRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartRealtytradeSigningResponse> {
    Util.validateModel(request);
    return $tea.cast<StartRealtytradeSigningResponse>(await this.doRequest("1.0", "blockchain.arec.realtytrade.signing.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartRealtytradeSigningResponse({}));
  }

  /**
   * Description: 数字房产会处理所有签署成功的签署流程，并提供签署成功的电子合同文档下载服务。本接口由数字房产提供给天猫好房，用于签署完成后下载已归档电子合同文件。
   * Summary: 查看签署流程
   */
  async queryRealtytradeSigning(request: QueryRealtytradeSigningRequest): Promise<QueryRealtytradeSigningResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRealtytradeSigningEx(request, headers, runtime);
  }

  /**
   * Description: 数字房产会处理所有签署成功的签署流程，并提供签署成功的电子合同文档下载服务。本接口由数字房产提供给天猫好房，用于签署完成后下载已归档电子合同文件。
   * Summary: 查看签署流程
   */
  async queryRealtytradeSigningEx(request: QueryRealtytradeSigningRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRealtytradeSigningResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRealtytradeSigningResponse>(await this.doRequest("1.0", "blockchain.arec.realtytrade.signing.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRealtytradeSigningResponse({}));
  }

}
