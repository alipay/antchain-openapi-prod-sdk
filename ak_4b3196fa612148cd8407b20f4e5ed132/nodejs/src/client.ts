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

export class StartBlockchainArecRcpMgrRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
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
  // 解抵押单号
  mgReleaseOrderNo?: string;
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
      mgReleaseOrderNo: 'mg_release_order_no',
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
      mgReleaseOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartBlockchainArecRcpMgrResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class ConfirmBlockchainArecRcpMgrRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
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

export class ConfirmBlockchainArecRcpMgrResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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
          sdk_version: "1.0.0",
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
   * Description: 发起解抵押(宁波模式)
   * Summary: 发起解抵押(宁波模式)
   */
  async startBlockchainArecRcpMgr(request: StartBlockchainArecRcpMgrRequest): Promise<StartBlockchainArecRcpMgrResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startBlockchainArecRcpMgrEx(request, headers, runtime);
  }

  /**
   * Description: 发起解抵押(宁波模式)
   * Summary: 发起解抵押(宁波模式)
   */
  async startBlockchainArecRcpMgrEx(request: StartBlockchainArecRcpMgrRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartBlockchainArecRcpMgrResponse> {
    Util.validateModel(request);
    return $tea.cast<StartBlockchainArecRcpMgrResponse>(await this.doRequest("1.0", "blockchain.arec.rcp.mgr.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartBlockchainArecRcpMgrResponse({}));
  }

  /**
   * Description: 确认解抵押(宁波模式)
   * Summary: 确认解抵押(宁波模式)
   */
  async confirmBlockchainArecRcpMgr(request: ConfirmBlockchainArecRcpMgrRequest): Promise<ConfirmBlockchainArecRcpMgrResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmBlockchainArecRcpMgrEx(request, headers, runtime);
  }

  /**
   * Description: 确认解抵押(宁波模式)
   * Summary: 确认解抵押(宁波模式)
   */
  async confirmBlockchainArecRcpMgrEx(request: ConfirmBlockchainArecRcpMgrRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmBlockchainArecRcpMgrResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmBlockchainArecRcpMgrResponse>(await this.doRequest("1.0", "blockchain.arec.rcp.mgr.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmBlockchainArecRcpMgrResponse({}));
  }

}
