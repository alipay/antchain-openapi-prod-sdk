// This file is auto-generated, don't edit it
import AlipayUtil from '@antchain/alipay-util';
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 证书
export class Cert extends $tea.Model {
  // 证书编号
  certCode?: string;
  // 证书描述	
  certDescription?: string;
  // 时间周期结束时间
  certEndTime?: string;
  // 证书id
  certId?: string;
  // 证书名称-中文
  certNameCn?: string;
  // 证书名称-英文（拼音）
  certNameEn?: string;
  // 首次发布时间
  certPublishTime?: string;
  // 发布时间时区，默认UTC+8	
  // 
  certPublishTimeZone?: string;
  // 时间周期开始时间
  certStartTime?: string;
  // 1-有效
  // 2-冻结
  // 3-失效
  // 4-作废
  // 5-其他
  certStatus?: number;
  // 证书概述	
  certSummary?: string;
  // 实体证书图片url
  certUrl?: string;
  // 证书归属国家
  // 使用“ISO 3166-1”代码表-数字码
  // https://zh.wikipedia.org/wiki/ISO_3166-1
  country?: string;
  // 1.长期有效
  // 2.时间周期
  expireType?: number;
  // 其他信息文件url
  featureUrl?: string;
  // 持有人的人脸图像url
  holderAvatar?: string;
  // 证书持有人姓名
  holderName?: string;
  // 证书等级类型：
  // 初级（五级）、中级（四级）、高级（三级）、技师（二级）和高级技师（一级）、其他
  level?: string;
  // 企业did
  orgDid?: string;
  // 企业名称
  orgName?: string;
  // 证书持有人id
  orgUserId?: string;
  // 持有人主证件编号，无身份证的个人使用0000000000000000
  primaryIdNo?: string;
  // 持有人辅助证件编号-1
  secondIdNo1?: string;
  // 持有人辅助证件编号-2
  secondIdNo2?: string;
  // 持有人辅助证件编号-3
  secondIdNo3?: string;
  // -数字码类型为156时可使用如下类目：
  // --学历证书-XLZ
  // --职业证书--ZYZ
  // -其他国家传入--QT
  type?: string;
  static names(): { [key: string]: string } {
    return {
      certCode: 'cert_code',
      certDescription: 'cert_description',
      certEndTime: 'cert_end_time',
      certId: 'cert_id',
      certNameCn: 'cert_name_cn',
      certNameEn: 'cert_name_en',
      certPublishTime: 'cert_publish_time',
      certPublishTimeZone: 'cert_publish_time_zone',
      certStartTime: 'cert_start_time',
      certStatus: 'cert_status',
      certSummary: 'cert_summary',
      certUrl: 'cert_url',
      country: 'country',
      expireType: 'expire_type',
      featureUrl: 'feature_url',
      holderAvatar: 'holder_avatar',
      holderName: 'holder_name',
      level: 'level',
      orgDid: 'org_did',
      orgName: 'org_name',
      orgUserId: 'org_user_id',
      primaryIdNo: 'primary_id_no',
      secondIdNo1: 'second_id_no_1',
      secondIdNo2: 'second_id_no_2',
      secondIdNo3: 'second_id_no_3',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      certCode: 'string',
      certDescription: 'string',
      certEndTime: 'string',
      certId: 'string',
      certNameCn: 'string',
      certNameEn: 'string',
      certPublishTime: 'string',
      certPublishTimeZone: 'string',
      certStartTime: 'string',
      certStatus: 'number',
      certSummary: 'string',
      certUrl: 'string',
      country: 'string',
      expireType: 'number',
      featureUrl: 'string',
      holderAvatar: 'string',
      holderName: 'string',
      level: 'string',
      orgDid: 'string',
      orgName: 'string',
      orgUserId: 'string',
      primaryIdNo: 'string',
      secondIdNo1: 'string',
      secondIdNo2: 'string',
      secondIdNo3: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业用户
export class OrgUser extends $tea.Model {
  // 企业did
  orgDid?: string;
  // 企业用户id
  orgUserId?: string;
  // 个人id
  personDid?: string;
  // 机构内部用户工号
  uid?: string;
  static names(): { [key: string]: string } {
    return {
      orgDid: 'org_did',
      orgUserId: 'org_user_id',
      personDid: 'person_did',
      uid: 'uid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orgDid: 'string',
      orgUserId: 'string',
      personDid: 'string',
      uid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 课程学习记录
export class CourseRecord extends $tea.Model {
  // 链上章节id
  // 
  chapterId?: string;
  // 班级id
  classId?: string;
  // 课程id
  courseId?: string;
  // 课程名称
  courseName?: string;
  // 企业did
  orgDid?: string;
  // 企业用户id
  // 
  orgUserId?: string;
  // 课程扩展信息，格式为json。比如钉钉用户id。
  recordExt?: string;
  // 记录id
  recordId?: string;
  // 本次开启时间
  // 
  recordOpenTime?: string;
  // 本次观看时长，单位秒
  recordPeriod?: number;
  // 行为来源
  recordSource?: string;
  // 本次点击观看时间
  recordStartTime?: string;
  static names(): { [key: string]: string } {
    return {
      chapterId: 'chapter_id',
      classId: 'class_id',
      courseId: 'course_id',
      courseName: 'course_name',
      orgDid: 'org_did',
      orgUserId: 'org_user_id',
      recordExt: 'record_ext',
      recordId: 'record_id',
      recordOpenTime: 'record_open_time',
      recordPeriod: 'record_period',
      recordSource: 'record_source',
      recordStartTime: 'record_start_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      chapterId: 'string',
      classId: 'string',
      courseId: 'string',
      courseName: 'string',
      orgDid: 'string',
      orgUserId: 'string',
      recordExt: 'string',
      recordId: 'string',
      recordOpenTime: 'string',
      recordPeriod: 'number',
      recordSource: 'string',
      recordStartTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 字段隐私属性描述
export class PrivacyDesc extends $tea.Model {
  // 属性名称
  // 
  attributeName?: string;
  // 隐私等级：
  // 1：数据可以全量明文查询
  // 2：数据仅可以通过数据比较查询
  privacyLevel?: number;
  static names(): { [key: string]: string } {
    return {
      attributeName: 'attribute_name',
      privacyLevel: 'privacy_level',
    };
  }

  static types(): { [key: string]: any } {
    return {
      attributeName: 'string',
      privacyLevel: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 班级
export class Class extends $tea.Model {
  // 班级id
  classId?: string;
  // 企业did
  orgDid?: string;
  static names(): { [key: string]: string } {
    return {
      classId: 'class_id',
      orgDid: 'org_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      classId: 'string',
      orgDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 字段托管属性描述
export class ProxyDesc extends $tea.Model {
  // 属性名称
  attributeName?: string;
  // 是否托管
  isProxy?: boolean;
  static names(): { [key: string]: string } {
    return {
      attributeName: 'attribute_name',
      isProxy: 'is_proxy',
    };
  }

  static types(): { [key: string]: any } {
    return {
      attributeName: 'string',
      isProxy: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 字段公开属性描述列表
export class PublicDesc extends $tea.Model {
  // 属性名称
  attributeName?: string;
  // 数据是否所有消费方可查询
  isPublic?: boolean;
  static names(): { [key: string]: string } {
    return {
      attributeName: 'attribute_name',
      isPublic: 'is_public',
    };
  }

  static types(): { [key: string]: any } {
    return {
      attributeName: 'string',
      isPublic: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 课程章节
export class CourseChapter extends $tea.Model {
  // 业务系统章节ID
  // 
  chapterBizId?: string;
  // 章节描述
  // 
  chapterDescription?: string;
  // 链上章节id
  chapterId?: string;
  // 章节名称
  chapterName?: string;
  // 章节时长，单位秒
  chapterPeriod?: number;
  static names(): { [key: string]: string } {
    return {
      chapterBizId: 'chapter_biz_id',
      chapterDescription: 'chapter_description',
      chapterId: 'chapter_id',
      chapterName: 'chapter_name',
      chapterPeriod: 'chapter_period',
    };
  }

  static types(): { [key: string]: any } {
    return {
      chapterBizId: 'string',
      chapterDescription: 'string',
      chapterId: 'string',
      chapterName: 'string',
      chapterPeriod: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasEbcOrganizationRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 企业码
  orgCode?: string;
  // 企业名称
  orgName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      orgCode: 'org_code',
      orgName: 'org_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      orgCode: 'string',
      orgName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasEbcOrganizationResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 企业did
  orgDid?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orgDid: 'org_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orgDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasEbcPersonRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 姓名
  personName?: string;
  // 持有人主证件编号，无身份证的个人使用0000000000000000
  // 请使用我们提供的公钥对数据进行加密
  primaryIdNo?: string;
  // 隐私属性描述列表
  // 
  privacyDescList?: PrivacyDesc[];
  // 托管属性描述列表
  // 
  proxyDescList?: ProxyDesc[];
  // 公开属性描述列表
  // 
  publicDescList?: PublicDesc[];
  // 持有人辅助证件编号-1
  // 请使用我们提供的公钥对数据进行加密
  secondIdNo1?: string;
  // 持有人辅助证件编号-1
  // 请使用我们提供的公钥对数据进行加密
  secondIdNo2?: string;
  // 持有人辅助证件编号-3
  // 请使用我们提供的公钥对数据进行加密
  secondIdNo3?: string;
  // 非对称加密后的对称秘钥，对应执行java SDK中的EnvelopeClient#envelopeSeal方法的返回值
  secretKey?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      personName: 'person_name',
      primaryIdNo: 'primary_id_no',
      privacyDescList: 'privacy_desc_list',
      proxyDescList: 'proxy_desc_list',
      publicDescList: 'public_desc_list',
      secondIdNo1: 'second_id_no_1',
      secondIdNo2: 'second_id_no_2',
      secondIdNo3: 'second_id_no_3',
      secretKey: 'secret_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      personName: 'string',
      primaryIdNo: 'string',
      privacyDescList: { 'type': 'array', 'itemType': PrivacyDesc },
      proxyDescList: { 'type': 'array', 'itemType': ProxyDesc },
      publicDescList: { 'type': 'array', 'itemType': PublicDesc },
      secondIdNo1: 'string',
      secondIdNo2: 'string',
      secondIdNo3: 'string',
      secretKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasEbcPersonResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 个人id
  personDid?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      personDid: 'person_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      personDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasEbcOrganizationUserRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 企业id
  orgDid?: string;
  // 个人id
  personDid?: string;
  // 机构内部用户工号
  uid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      orgDid: 'org_did',
      personDid: 'person_did',
      uid: 'uid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      orgDid: 'string',
      personDid: 'string',
      uid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasEbcOrganizationUserResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 机构内用户id
  orgUserId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orgUserId: 'org_user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orgUserId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelBaasEbcPersonRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 个人id
  personDid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      personDid: 'person_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      personDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelBaasEbcPersonResponse extends $tea.Model {
  reqMsgId?: string;
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

export class ResumeBaasEbcPersonRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 个人did
  personDid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      personDid: 'person_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      personDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ResumeBaasEbcPersonResponse extends $tea.Model {
  reqMsgId?: string;
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

export class CreateBaasEbcOrganizationClassRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 班级容量
  capacity?: number;
  // 结束时间
  classEndTime?: string;
  // 班级名称
  className?: string;
  // 开始时间
  classStartTime?: string;
  // 1:有效、2:暂停、3:失效
  classStatus?: number;
  // 企业id
  orgDid?: string;
  // 隐私属性描述列表
  // 
  privacyDescList?: PrivacyDesc[];
  // 托管属性描述列表
  // 
  proxyDescList?: ProxyDesc[];
  // 公开属性描述列表
  // 
  publicDescList?: PublicDesc[];
  // 非对称加密后的对称秘钥，对应执行java SDK中的EnvelopeClient#envelopeSeal方法的返回值
  secretKey?: string;
  // 1线上、2线下、3混合
  type?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      capacity: 'capacity',
      classEndTime: 'class_end_time',
      className: 'class_name',
      classStartTime: 'class_start_time',
      classStatus: 'class_status',
      orgDid: 'org_did',
      privacyDescList: 'privacy_desc_list',
      proxyDescList: 'proxy_desc_list',
      publicDescList: 'public_desc_list',
      secretKey: 'secret_key',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      capacity: 'number',
      classEndTime: 'string',
      className: 'string',
      classStartTime: 'string',
      classStatus: 'number',
      orgDid: 'string',
      privacyDescList: { 'type': 'array', 'itemType': PrivacyDesc },
      proxyDescList: { 'type': 'array', 'itemType': ProxyDesc },
      publicDescList: { 'type': 'array', 'itemType': PublicDesc },
      secretKey: 'string',
      type: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasEbcOrganizationClassResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 班级id
  classId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      classId: 'class_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      classId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasEbcOrganizationClassRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 容量
  capacity?: number;
  // 结束时间
  classEndTime?: string;
  // 班级id
  classId?: string;
  // 班级名称
  className?: string;
  // 开始时间
  classStartTime?: string;
  // 1:有效、2:暂停、3:失效
  classStatus?: number;
  // 企业did
  orgDid?: string;
  // 隐私属性描述列表
  // 
  privacyDescList?: PrivacyDesc[];
  // 托管属性描述列表
  // 
  proxyDescList?: ProxyDesc[];
  // 公开属性描述列表
  // 
  publicDescList?: PublicDesc[];
  // 非对称加密后的对称秘钥，对应执行java SDK中的EnvelopeClient#envelopeSeal方法的返回值
  secretKey?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      capacity: 'capacity',
      classEndTime: 'class_end_time',
      classId: 'class_id',
      className: 'class_name',
      classStartTime: 'class_start_time',
      classStatus: 'class_status',
      orgDid: 'org_did',
      privacyDescList: 'privacy_desc_list',
      proxyDescList: 'proxy_desc_list',
      publicDescList: 'public_desc_list',
      secretKey: 'secret_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      capacity: 'number',
      classEndTime: 'string',
      classId: 'string',
      className: 'string',
      classStartTime: 'string',
      classStatus: 'number',
      orgDid: 'string',
      privacyDescList: { 'type': 'array', 'itemType': PrivacyDesc },
      proxyDescList: { 'type': 'array', 'itemType': ProxyDesc },
      publicDescList: { 'type': 'array', 'itemType': PublicDesc },
      secretKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasEbcOrganizationClassResponse extends $tea.Model {
  reqMsgId?: string;
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

export class AddBaasEbcClassUserRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 班级id
  classId?: string;
  // 企业id
  orgDid?: string;
  // 企业用户列表,最多一次传入50个
  orgUserList?: OrgUser[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      classId: 'class_id',
      orgDid: 'org_did',
      orgUserList: 'org_user_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      classId: 'string',
      orgDid: 'string',
      orgUserList: { 'type': 'array', 'itemType': OrgUser },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddBaasEbcClassUserResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 加入失败的用户列表
  failList?: OrgUser[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      failList: 'fail_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      failList: { 'type': 'array', 'itemType': OrgUser },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteBaasEbcClassUserRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 班级id
  classId?: string;
  // 企业id
  orgDid?: string;
  // 企业用户列表,最多一次传入50个
  orgUserList?: OrgUser[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      classId: 'class_id',
      orgDid: 'org_did',
      orgUserList: 'org_user_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      classId: 'string',
      orgDid: 'string',
      orgUserList: { 'type': 'array', 'itemType': OrgUser },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteBaasEbcClassUserResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 删除失败的用户列表
  failList?: OrgUser[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      failList: 'fail_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      failList: { 'type': 'array', 'itemType': OrgUser },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasEbcOrganizationClassRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 班级id
  classId?: string;
  // 企业did
  orgDid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      classId: 'class_id',
      orgDid: 'org_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      classId: 'string',
      orgDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasEbcOrganizationClassResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 班级名称
  className?: string;
  // 1:有效、2:暂停、3:失效
  classStatus?: number;
  // 创建时间
  createTime?: string;
  // 修改时间
  modifyTime?: string;
  // 累计时长
  period?: number;
  // 班级类型：线上、线下、混合
  type?: string;
  // 学员数量
  userNum?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      className: 'class_name',
      classStatus: 'class_status',
      createTime: 'create_time',
      modifyTime: 'modify_time',
      period: 'period',
      type: 'type',
      userNum: 'user_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      className: 'string',
      classStatus: 'number',
      createTime: 'string',
      modifyTime: 'string',
      period: 'number',
      type: 'string',
      userNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasEbcClassUserRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 班级id
  classId?: string;
  // 企业did
  orgDid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      classId: 'class_id',
      orgDid: 'org_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      classId: 'string',
      orgDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasEbcClassUserResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 班级名称
  className?: string;
  // 企业用户id列表
  orgUserIdList?: string[];
  // 学员数量
  userNum?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      className: 'class_name',
      orgUserIdList: 'org_user_id_list',
      userNum: 'user_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      className: 'string',
      orgUserIdList: { 'type': 'array', 'itemType': 'string' },
      userNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasEbcOrganizationCourseRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 课程描述	
  // 
  courseDescription?: string;
  // 课程结束时间
  courseEndTime?: string;
  // 课程名称
  courseName?: string;
  // 课程开始时间
  courseStartTime?: string;
  // 课程简介	
  // 
  courseSummary?: string;
  // 课程类型
  // 1直播课程，2录播课程，3线下课程，4其他类型
  courseType?: number;
  // 企业did
  orgDid?: string;
  // 课程时长
  period?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      courseDescription: 'course_description',
      courseEndTime: 'course_end_time',
      courseName: 'course_name',
      courseStartTime: 'course_start_time',
      courseSummary: 'course_summary',
      courseType: 'course_type',
      orgDid: 'org_did',
      period: 'period',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      courseDescription: 'string',
      courseEndTime: 'string',
      courseName: 'string',
      courseStartTime: 'string',
      courseSummary: 'string',
      courseType: 'number',
      orgDid: 'string',
      period: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasEbcOrganizationCourseResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 课程did
  courseId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      courseId: 'course_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      courseId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasEbcOrganizationCourseRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 课程描述	
  // 
  courseDescription?: string;
  // 课程结束时间
  courseEndTime?: string;
  // 课程id
  courseId?: string;
  // 课程名称
  courseName?: string;
  // 课程开始时间
  courseStartTime?: string;
  // 课程简介	
  // 
  courseSummary?: string;
  // 课程类型
  // 1直播课程，2录播课程，3线下课程，4其他类型
  courseType?: number;
  // 企业id
  orgDid?: string;
  // 课程时长
  period?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      courseDescription: 'course_description',
      courseEndTime: 'course_end_time',
      courseId: 'course_id',
      courseName: 'course_name',
      courseStartTime: 'course_start_time',
      courseSummary: 'course_summary',
      courseType: 'course_type',
      orgDid: 'org_did',
      period: 'period',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      courseDescription: 'string',
      courseEndTime: 'string',
      courseId: 'string',
      courseName: 'string',
      courseStartTime: 'string',
      courseSummary: 'string',
      courseType: 'number',
      orgDid: 'string',
      period: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasEbcOrganizationCourseResponse extends $tea.Model {
  reqMsgId?: string;
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

export class AddBaasEbcCourseClassRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 班级列表,最多一次传入50个
  classList?: Class[];
  // 班级id
  courseId?: string;
  // 企业id
  orgDid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      classList: 'class_list',
      courseId: 'course_id',
      orgDid: 'org_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      classList: { 'type': 'array', 'itemType': Class },
      courseId: 'string',
      orgDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddBaasEbcCourseClassResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 添加失败的班级列表
  failList?: Class[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      failList: 'fail_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      failList: { 'type': 'array', 'itemType': Class },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddBaasEbcCourseUserRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 课程id
  courseId?: string;
  // 企业id
  orgDid?: string;
  // 企业用户列表,最多一次传入50个
  orgUserList?: OrgUser[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      courseId: 'course_id',
      orgDid: 'org_did',
      orgUserList: 'org_user_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      courseId: 'string',
      orgDid: 'string',
      orgUserList: { 'type': 'array', 'itemType': OrgUser },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddBaasEbcCourseUserResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 添加失败的用户列表
  failList?: OrgUser[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      failList: 'fail_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      failList: { 'type': 'array', 'itemType': OrgUser },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteBaasEbcCourseClassRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 班级列表,最多一次传入50个
  classList?: Class[];
  // 课程id
  courseId?: string;
  // 企业id
  orgDid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      classList: 'class_list',
      courseId: 'course_id',
      orgDid: 'org_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      classList: { 'type': 'array', 'itemType': Class },
      courseId: 'string',
      orgDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteBaasEbcCourseClassResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 删除失败的班级列表
  failList?: Class[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      failList: 'fail_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      failList: { 'type': 'array', 'itemType': Class },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteBaasEbcCourseUserRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 课程id
  courseId?: string;
  // 企业id
  orgDid?: string;
  // 企业用户列表,最多一次传入50个
  orgUserList?: OrgUser[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      courseId: 'course_id',
      orgDid: 'org_did',
      orgUserList: 'org_user_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      courseId: 'string',
      orgDid: 'string',
      orgUserList: { 'type': 'array', 'itemType': OrgUser },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteBaasEbcCourseUserResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 删除失败的用户列表
  failList?: OrgUser[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      failList: 'fail_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      failList: { 'type': 'array', 'itemType': OrgUser },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasEbcUserCertRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 证书编号
  certCode?: string;
  // 证书描述
  certDescription?: string;
  // 时间周期结束时间
  certEndTime?: string;
  // 证书名称-中文
  certNameCn?: string;
  // 证书名称-英文（拼音）
  certNameEn?: string;
  // 首次发布时间
  certPublishTime?: string;
  // 发布时间时区，默认UTC+8
  certPublishTimeZone?: string;
  // 时间周期开始时间
  certStartTime?: string;
  // 1-有效 2-冻结 3-失效 4-作废 5-其他
  certStatus?: number;
  // 证书概述
  certSummary?: string;
  // 证书归属国家 使用“ISO 3166-1”代码表-数字码 https://zh.wikipedia.org/wiki/ISO_3166-1
  country?: string;
  // 有效期类型1.长期有效 2.时间周期
  expireType?: number;
  // 证书持有人姓名
  // 
  holderName?: string;
  // 证书等级类型： 初级（五级）、中级（四级）、高级（三级）、技师（二级）和高级技师（一级）、其他
  level?: string;
  // 企业id
  orgDid?: string;
  // 企业名称
  orgName?: string;
  // 企业用户id
  orgUserId?: string;
  // 持有人主证件编号，无身份证的个人使用0000000000000000
  // 请使用我们提供的公钥对数据进行加密
  // 
  primaryIdNo?: string;
  // 隐私属性描述列表
  privacyDescList?: PrivacyDesc[];
  // 托管属性描述列表
  proxyDescList?: ProxyDesc[];
  // 公开属性描述列表
  publicDescList?: PublicDesc[];
  // 持有人辅助证件编号-1
  // 请使用我们提供的公钥对数据进行加密
  secondIdNo1?: string;
  // 持有人辅助证件编号-2
  // 请使用我们提供的公钥对数据进行加密
  secondIdNo2?: string;
  // 持有人辅助证件编号-3
  // 请使用我们提供的公钥对数据进行加密
  secondIdNo3?: string;
  // 非对称加密后的对称秘钥，对应执行java SDK中的EnvelopeClient#envelopeSeal方法的返回值
  secretKey?: string;
  // -数字码类型为156时可使用如下类目： --学历证书-XLZ --职业证书--ZYZ -其他国家传入--QT
  type?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      certCode: 'cert_code',
      certDescription: 'cert_description',
      certEndTime: 'cert_end_time',
      certNameCn: 'cert_name_cn',
      certNameEn: 'cert_name_en',
      certPublishTime: 'cert_publish_time',
      certPublishTimeZone: 'cert_publish_time_zone',
      certStartTime: 'cert_start_time',
      certStatus: 'cert_status',
      certSummary: 'cert_summary',
      country: 'country',
      expireType: 'expire_type',
      holderName: 'holder_name',
      level: 'level',
      orgDid: 'org_did',
      orgName: 'org_name',
      orgUserId: 'org_user_id',
      primaryIdNo: 'primary_id_no',
      privacyDescList: 'privacy_desc_list',
      proxyDescList: 'proxy_desc_list',
      publicDescList: 'public_desc_list',
      secondIdNo1: 'second_id_no_1',
      secondIdNo2: 'second_id_no_2',
      secondIdNo3: 'second_id_no_3',
      secretKey: 'secret_key',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      certCode: 'string',
      certDescription: 'string',
      certEndTime: 'string',
      certNameCn: 'string',
      certNameEn: 'string',
      certPublishTime: 'string',
      certPublishTimeZone: 'string',
      certStartTime: 'string',
      certStatus: 'number',
      certSummary: 'string',
      country: 'string',
      expireType: 'number',
      holderName: 'string',
      level: 'string',
      orgDid: 'string',
      orgName: 'string',
      orgUserId: 'string',
      primaryIdNo: 'string',
      privacyDescList: { 'type': 'array', 'itemType': PrivacyDesc },
      proxyDescList: { 'type': 'array', 'itemType': ProxyDesc },
      publicDescList: { 'type': 'array', 'itemType': PublicDesc },
      secondIdNo1: 'string',
      secondIdNo2: 'string',
      secondIdNo3: 'string',
      secretKey: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasEbcUserCertResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 证书id
  certId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certId: 'cert_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasEbcUserCertRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 证书id
  certId?: string;
  // 首次发布时间
  certPublishTime?: string;
  // 1-有效 2-冻结 3-失效 4-作废 5-其他
  certStatus?: number;
  // 企业did
  orgDid?: string;
  // 企业用户id
  orgUserId?: string;
  // 隐私属性描述列表
  // 
  privacyDescList?: PrivacyDesc[];
  // 托管属性描述列表
  // 
  proxyDescList?: ProxyDesc[];
  // 公开属性描述列表
  // 
  publicDescList?: PublicDesc[];
  // 非对称加密后的对称秘钥，对应执行java SDK中的EnvelopeClient#envelopeSeal方法的返回值
  secretKey?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      certId: 'cert_id',
      certPublishTime: 'cert_publish_time',
      certStatus: 'cert_status',
      orgDid: 'org_did',
      orgUserId: 'org_user_id',
      privacyDescList: 'privacy_desc_list',
      proxyDescList: 'proxy_desc_list',
      publicDescList: 'public_desc_list',
      secretKey: 'secret_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      certId: 'string',
      certPublishTime: 'string',
      certStatus: 'number',
      orgDid: 'string',
      orgUserId: 'string',
      privacyDescList: { 'type': 'array', 'itemType': PrivacyDesc },
      proxyDescList: { 'type': 'array', 'itemType': ProxyDesc },
      publicDescList: { 'type': 'array', 'itemType': PublicDesc },
      secretKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasEbcUserCertResponse extends $tea.Model {
  reqMsgId?: string;
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

export class QueryBaasEbcOrganizationCertRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 查询结束时间
  end?: string;
  // 企业id
  orgDid?: string;
  // 开始时间
  start?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      end: 'end',
      orgDid: 'org_did',
      start: 'start',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      end: 'string',
      orgDid: 'string',
      start: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasEbcOrganizationCertResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 证书id
  certIdList?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certIdList: 'cert_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certIdList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasEbcUserCertRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 企业did
  orgDid?: string;
  // 企业用户id
  orgUserId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      orgDid: 'org_did',
      orgUserId: 'org_user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      orgDid: 'string',
      orgUserId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasEbcUserCertResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 证书id列表
  certIdList?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certIdList: 'cert_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certIdList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasEbcCertRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 证书id
  certId?: string;
  // 企业did
  orgDid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      certId: 'cert_id',
      orgDid: 'org_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      certId: 'string',
      orgDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasEbcCertResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 证书明细
  cert?: Cert;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      cert: 'cert',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      cert: Cert,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyBaasEbcCertUrlRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 证书code
  certCode?: string;
  // 机构did
  orgDid?: string;
  // 证书持有人id
  orgUserId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      certCode: 'cert_code',
      orgDid: 'org_did',
      orgUserId: 'org_user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      certCode: 'string',
      orgDid: 'string',
      orgUserId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyBaasEbcCertUrlResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 实体证书图片上传url，文件最大5M
  certUploadUrl?: string;
  // 其他信息文件上传url，文件最大5M
  // 
  featureUploadUrl?: string;
  // 持有人的人脸图像上传url，文件最大5M
  holderAvatarUploadUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certUploadUrl: 'cert_upload_url',
      featureUploadUrl: 'feature_upload_url',
      holderAvatarUploadUrl: 'holder_avatar_upload_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certUploadUrl: 'string',
      featureUploadUrl: 'string',
      holderAvatarUploadUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasEbcAuthRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 授权关系结束时间
  authEndTime?: string;
  // 授权关系开始时间
  authStartTime?: string;
  // 1:身份数据，2:机构数据，3：课程数据，4：班级数据，5：证书数据
  dataType?: number;
  // 授权目标数据id列表，最多20个
  targetIdList?: string[];
  // 1.数据,2.机构,3.认证方,4.ALL
  targetType?: number;
  // 消费方租户id
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      authEndTime: 'auth_end_time',
      authStartTime: 'auth_start_time',
      dataType: 'data_type',
      targetIdList: 'target_id_list',
      targetType: 'target_type',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      authEndTime: 'string',
      authStartTime: 'string',
      dataType: 'number',
      targetIdList: { 'type': 'array', 'itemType': 'string' },
      targetType: 'number',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasEbcAuthResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 授权关系id
  authId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      authId: 'auth_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      authId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasEbcAuthRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 授权关系结束时间
  // 
  authEndTime?: string;
  // 授权关系id
  authId?: string;
  // 授权关系开始时间
  // 
  authStartTime?: string;
  // 1:身份数据，2:机构数据，3：课程数据，4：班级数据，5：证书数据
  dataType?: number;
  // 授权目标数据id列表，最多20个
  targetIdList?: string[];
  // 1.数据,2.机构,3.认证方,4.ALL
  // 
  targetType?: number;
  // 消费方租户id
  // 
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      authEndTime: 'auth_end_time',
      authId: 'auth_id',
      authStartTime: 'auth_start_time',
      dataType: 'data_type',
      targetIdList: 'target_id_list',
      targetType: 'target_type',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      authEndTime: 'string',
      authId: 'string',
      authStartTime: 'string',
      dataType: 'number',
      targetIdList: { 'type': 'array', 'itemType': 'string' },
      targetType: 'number',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasEbcAuthResponse extends $tea.Model {
  reqMsgId?: string;
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

export class UpdateBaasEbcAuthStatusRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 授权关系id
  // 
  authId?: string;
  // 1:启用，2：禁用，3：停用
  status?: number;
  // 消费方租户id
  // 
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      authId: 'auth_id',
      status: 'status',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      authId: 'string',
      status: 'number',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasEbcAuthStatusResponse extends $tea.Model {
  reqMsgId?: string;
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

export class UpdateBaasEbcDataPriceRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 目标数据id列表，最多20个
  dataIdList?: string[];
  // 1:身份数据，2:机构数据，3：课程数据，4：班级数据，5：证书数据
  dataType?: number;
  // 数据价值
  price?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      dataIdList: 'data_id_list',
      dataType: 'data_type',
      price: 'price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      dataIdList: { 'type': 'array', 'itemType': 'string' },
      dataType: 'number',
      price: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasEbcDataPriceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 更新失败的id列表
  failList?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      failList: 'fail_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      failList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasEbcConsumptionAmountRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 结束时间
  endTime?: string;
  // 开始时间
  startTime?: string;
  // 消费方租户id
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      endTime: 'end_time',
      startTime: 'start_time',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      endTime: 'string',
      startTime: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasEbcConsumptionAmountResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 区间内的累计消费金额
  amount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      amount: 'amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      amount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasEbcOrganizationCourseRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 班级id
  courseId?: string;
  // 企业did
  orgDid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      courseId: 'course_id',
      orgDid: 'org_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      courseId: 'string',
      orgDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasEbcOrganizationCourseResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 课程班级列表
  courseClassList?: Class[];
  // 课程描述
  courseDescription?: string;
  // 课程结束时间
  // 
  courseEndTime?: string;
  // 课程最近一次修改时间
  courseModifyTime?: string;
  // 课程名称
  courseName?: string;
  // 课程学员列表
  courseOrgUserList?: OrgUser[];
  // 课程开始时间
  // 
  courseStartTime?: string;
  // 1:已发布,2:进行中,3:已结束
  courseStatus?: number;
  // 课程简介
  courseSummary?: string;
  // 课程类型： 1直播课程，2录播课程，3线下课程，4其他类型
  courseType?: number;
  // 课程时长
  // 
  period?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      courseClassList: 'course_class_list',
      courseDescription: 'course_description',
      courseEndTime: 'course_end_time',
      courseModifyTime: 'course_modify_time',
      courseName: 'course_name',
      courseOrgUserList: 'course_org_user_list',
      courseStartTime: 'course_start_time',
      courseStatus: 'course_status',
      courseSummary: 'course_summary',
      courseType: 'course_type',
      period: 'period',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      courseClassList: { 'type': 'array', 'itemType': Class },
      courseDescription: 'string',
      courseEndTime: 'string',
      courseModifyTime: 'string',
      courseName: 'string',
      courseOrgUserList: { 'type': 'array', 'itemType': OrgUser },
      courseStartTime: 'string',
      courseStatus: 'number',
      courseSummary: 'string',
      courseType: 'number',
      period: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasEbcCourseChapterRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 业务系统章节ID
  chapterBizId?: string;
  // 章节描述
  chapterDescription?: string;
  // 章节名称
  chapterName?: string;
  // 章节时长，单位秒
  chapterPeriod?: number;
  // 课程id
  courseId?: string;
  // 企业链上did
  orgDid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chapterBizId: 'chapter_biz_id',
      chapterDescription: 'chapter_description',
      chapterName: 'chapter_name',
      chapterPeriod: 'chapter_period',
      courseId: 'course_id',
      orgDid: 'org_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chapterBizId: 'string',
      chapterDescription: 'string',
      chapterName: 'string',
      chapterPeriod: 'number',
      courseId: 'string',
      orgDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasEbcCourseChapterResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 链上章节id
  chapterId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      chapterId: 'chapter_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      chapterId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasEbcCourseChapterRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 章节描述
  chapterDescription?: string;
  // 链上章节id
  chapterId?: string;
  // 章节名称
  chapterName?: string;
  // 章节时长，单位秒
  chapterPeriod?: number;
  // 链上课程id
  courseId?: string;
  // 企业链上did
  orgDid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chapterDescription: 'chapter_description',
      chapterId: 'chapter_id',
      chapterName: 'chapter_name',
      chapterPeriod: 'chapter_period',
      courseId: 'course_id',
      orgDid: 'org_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chapterDescription: 'string',
      chapterId: 'string',
      chapterName: 'string',
      chapterPeriod: 'number',
      courseId: 'string',
      orgDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasEbcCourseChapterResponse extends $tea.Model {
  reqMsgId?: string;
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

export class CreateBaasEbcCourseRecordRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链上章节id
  chapterId?: string;
  // 链上班级id
  classId?: string;
  // 链上课程id
  courseId?: string;
  // 课程名称
  courseName?: string;
  // 企业did
  // 
  orgDid?: string;
  // 企业用户id
  orgUserId?: string;
  // 课程扩展信息，格式为json。比如钉钉用户id。
  recordExt?: string;
  // 本次开启时间
  recordOpenTime?: string;
  // 本次观看时长，单位秒
  recordPeriod?: number;
  // 行为来源
  recordSource?: string;
  // 本次点击观看时间
  recordStartTime?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chapterId: 'chapter_id',
      classId: 'class_id',
      courseId: 'course_id',
      courseName: 'course_name',
      orgDid: 'org_did',
      orgUserId: 'org_user_id',
      recordExt: 'record_ext',
      recordOpenTime: 'record_open_time',
      recordPeriod: 'record_period',
      recordSource: 'record_source',
      recordStartTime: 'record_start_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chapterId: 'string',
      classId: 'string',
      courseId: 'string',
      courseName: 'string',
      orgDid: 'string',
      orgUserId: 'string',
      recordExt: 'string',
      recordOpenTime: 'string',
      recordPeriod: 'number',
      recordSource: 'string',
      recordStartTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasEbcCourseRecordResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 链上学习记录id
  recordId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      recordId: 'record_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      recordId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasEbcCourseChapterRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 课程id
  courseId?: string;
  // 企业链上did
  orgDid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      courseId: 'course_id',
      orgDid: 'org_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      courseId: 'string',
      orgDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasEbcCourseChapterResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 课程章节列表
  chapterList?: CourseChapter[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      chapterList: 'chapter_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      chapterList: { 'type': 'array', 'itemType': CourseChapter },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasEbcCourseRecordRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 课程id
  courseId?: string;
  // 企业链上did
  // 
  orgDid?: string;
  // 企业用户id
  // 
  orgUserId?: string;
  // 页码，从1开始
  pageNum?: number;
  // 页面大小，最大10
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      courseId: 'course_id',
      orgDid: 'org_did',
      orgUserId: 'org_user_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      courseId: 'string',
      orgDid: 'string',
      orgUserId: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasEbcCourseRecordResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 总页数
  pages?: number;
  // 当前页码
  pageNum?: number;
  // 学习记录列表
  recordList?: CourseRecord[];
  // 数据总量
  total?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pages: 'pages',
      pageNum: 'page_num',
      recordList: 'record_list',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pages: 'number',
      pageNum: 'number',
      recordList: { 'type': 'array', 'itemType': CourseRecord },
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasEbcOrganizationUserRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 企业链上did
  orgDid?: string;
  // 页码，从1开始
  pageNum?: number;
  // 页面大小，最大10
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      orgDid: 'org_did',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      orgDid: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasEbcOrganizationUserResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 企业用户列表
  orgUserList?: OrgUser[];
  // 总页数
  pages?: number;
  // 当前页码
  pageNum?: number;
  // 数据总量
  total?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orgUserList: 'org_user_list',
      pages: 'pages',
      pageNum: 'page_num',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orgUserList: { 'type': 'array', 'itemType': OrgUser },
      pages: 'number',
      pageNum: 'number',
      total: 'number',
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
    this._readTimeout = config.readTimeout;
    this._connectTimeout = config.connectTimeout;
    this._httpProxy = config.httpProxy;
    this._httpsProxy = config.httpsProxy;
    this._noProxy = config.noProxy;
    this._socks5Proxy = config.socks5Proxy;
    this._socks5NetWork = config.socks5NetWork;
    this._maxIdleConns = config.maxIdleConns;
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
  async doRequest(version: string, action: string, protocol: string, method: string, pathname: string, request: {[key: string]: any}, runtime: $Util.RuntimeOptions): Promise<{[key: string]: any}> {
    let _runtime: { [key: string]: any } = {
      timeouted: "retry",
      readTimeout: Util.defaultNumber(runtime.readTimeout, this._readTimeout),
      connectTimeout: Util.defaultNumber(runtime.connectTimeout, this._connectTimeout),
      httpProxy: Util.defaultString(runtime.httpProxy, this._httpProxy),
      httpsProxy: Util.defaultString(runtime.httpsProxy, this._httpsProxy),
      noProxy: Util.defaultString(runtime.noProxy, this._noProxy),
      maxIdleConns: Util.defaultNumber(runtime.maxIdleConns, this._maxIdleConns),
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
          req_time: AlipayUtil.getTimestamp(),
          req_msg_id: Util.getNonce(),
          access_key: this._accessKeyId,
          charset: "UTF-8",
          baseSdkVersion: "Tea-SDK",
          sdkVersion: "Tea-SDK-20200922",
        };
        if (!Util.empty(this._securityToken)) {
          request_.query["security_token"] = this._securityToken;
        }

        request_.headers = {
          host: this._endpoint,
          'user-agent': this.getUserAgent(),
        };
        let tmp = Util.anyifyMapValue(RPCUtil.query(request));
        request_.body = new $tea.BytesReadable(Util.toFormString(tmp));
        request_.headers["content-type"] = "application/x-www-form-urlencoded";
        let signedParam = {
          ...request_.query,
          ...RPCUtil.query(request),
        };
        request_.query["sign"] = AlipayUtil.getSignature(signedParam, this._accessKeySecret);
        _lastRequest = request_;
        let response_ = await $tea.doAction(request_, _runtime);

        let obj = await Util.readAsJSON(response_.body);
        let res = Util.assertAsMap(obj);
        let resp = Util.assertAsMap(res["response"]);
        if (AlipayUtil.hasError(res)) {
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
   * Get user agent
   * @return user agent
   */
  getUserAgent(): string {
    let userAgent = "TeaClient/1.0.0";
    return Util.getUserAgent(userAgent);
  }

  /**
   * Description: 创建企业
   * Summary: 创建企业
   */
  async createBaasEbcOrganization(request: CreateBaasEbcOrganizationRequest): Promise<CreateBaasEbcOrganizationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createBaasEbcOrganizationEx(request, runtime);
  }

  /**
   * Description: 创建企业
   * Summary: 创建企业
   */
  async createBaasEbcOrganizationEx(request: CreateBaasEbcOrganizationRequest, runtime: $Util.RuntimeOptions): Promise<CreateBaasEbcOrganizationResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBaasEbcOrganizationResponse>(await this.doRequest("1.0", "baas.ebc.organization.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateBaasEbcOrganizationResponse({}));
  }

  /**
   * Description: 创建个人
   * Summary: 创建个人
   */
  async createBaasEbcPerson(request: CreateBaasEbcPersonRequest): Promise<CreateBaasEbcPersonResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createBaasEbcPersonEx(request, runtime);
  }

  /**
   * Description: 创建个人
   * Summary: 创建个人
   */
  async createBaasEbcPersonEx(request: CreateBaasEbcPersonRequest, runtime: $Util.RuntimeOptions): Promise<CreateBaasEbcPersonResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBaasEbcPersonResponse>(await this.doRequest("1.0", "baas.ebc.person.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateBaasEbcPersonResponse({}));
  }

  /**
   * Description: 企业用户注册
   * Summary: 企业用户注册
   */
  async createBaasEbcOrganizationUser(request: CreateBaasEbcOrganizationUserRequest): Promise<CreateBaasEbcOrganizationUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createBaasEbcOrganizationUserEx(request, runtime);
  }

  /**
   * Description: 企业用户注册
   * Summary: 企业用户注册
   */
  async createBaasEbcOrganizationUserEx(request: CreateBaasEbcOrganizationUserRequest, runtime: $Util.RuntimeOptions): Promise<CreateBaasEbcOrganizationUserResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBaasEbcOrganizationUserResponse>(await this.doRequest("1.0", "baas.ebc.organization.user.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateBaasEbcOrganizationUserResponse({}));
  }

  /**
   * Description: 个人退出
   * Summary: 个人退出
   */
  async cancelBaasEbcPerson(request: CancelBaasEbcPersonRequest): Promise<CancelBaasEbcPersonResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.cancelBaasEbcPersonEx(request, runtime);
  }

  /**
   * Description: 个人退出
   * Summary: 个人退出
   */
  async cancelBaasEbcPersonEx(request: CancelBaasEbcPersonRequest, runtime: $Util.RuntimeOptions): Promise<CancelBaasEbcPersonResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelBaasEbcPersonResponse>(await this.doRequest("1.0", "baas.ebc.person.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CancelBaasEbcPersonResponse({}));
  }

  /**
   * Description: 用户复入
   * Summary: 用户复入
   */
  async resumeBaasEbcPerson(request: ResumeBaasEbcPersonRequest): Promise<ResumeBaasEbcPersonResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.resumeBaasEbcPersonEx(request, runtime);
  }

  /**
   * Description: 用户复入
   * Summary: 用户复入
   */
  async resumeBaasEbcPersonEx(request: ResumeBaasEbcPersonRequest, runtime: $Util.RuntimeOptions): Promise<ResumeBaasEbcPersonResponse> {
    Util.validateModel(request);
    return $tea.cast<ResumeBaasEbcPersonResponse>(await this.doRequest("1.0", "baas.ebc.person.resume", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ResumeBaasEbcPersonResponse({}));
  }

  /**
   * Description: 创建班级
   * Summary: 创建班级
   */
  async createBaasEbcOrganizationClass(request: CreateBaasEbcOrganizationClassRequest): Promise<CreateBaasEbcOrganizationClassResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createBaasEbcOrganizationClassEx(request, runtime);
  }

  /**
   * Description: 创建班级
   * Summary: 创建班级
   */
  async createBaasEbcOrganizationClassEx(request: CreateBaasEbcOrganizationClassRequest, runtime: $Util.RuntimeOptions): Promise<CreateBaasEbcOrganizationClassResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBaasEbcOrganizationClassResponse>(await this.doRequest("1.0", "baas.ebc.organization.class.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateBaasEbcOrganizationClassResponse({}));
  }

  /**
   * Description: 更新班级
   * Summary: 更新班级
   */
  async updateBaasEbcOrganizationClass(request: UpdateBaasEbcOrganizationClassRequest): Promise<UpdateBaasEbcOrganizationClassResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateBaasEbcOrganizationClassEx(request, runtime);
  }

  /**
   * Description: 更新班级
   * Summary: 更新班级
   */
  async updateBaasEbcOrganizationClassEx(request: UpdateBaasEbcOrganizationClassRequest, runtime: $Util.RuntimeOptions): Promise<UpdateBaasEbcOrganizationClassResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBaasEbcOrganizationClassResponse>(await this.doRequest("1.0", "baas.ebc.organization.class.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateBaasEbcOrganizationClassResponse({}));
  }

  /**
   * Description: 增加学员
   * Summary: 增加学员
   */
  async addBaasEbcClassUser(request: AddBaasEbcClassUserRequest): Promise<AddBaasEbcClassUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.addBaasEbcClassUserEx(request, runtime);
  }

  /**
   * Description: 增加学员
   * Summary: 增加学员
   */
  async addBaasEbcClassUserEx(request: AddBaasEbcClassUserRequest, runtime: $Util.RuntimeOptions): Promise<AddBaasEbcClassUserResponse> {
    Util.validateModel(request);
    return $tea.cast<AddBaasEbcClassUserResponse>(await this.doRequest("1.0", "baas.ebc.class.user.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new AddBaasEbcClassUserResponse({}));
  }

  /**
   * Description: 删除学员
   * Summary: 删除学员
   */
  async deleteBaasEbcClassUser(request: DeleteBaasEbcClassUserRequest): Promise<DeleteBaasEbcClassUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.deleteBaasEbcClassUserEx(request, runtime);
  }

  /**
   * Description: 删除学员
   * Summary: 删除学员
   */
  async deleteBaasEbcClassUserEx(request: DeleteBaasEbcClassUserRequest, runtime: $Util.RuntimeOptions): Promise<DeleteBaasEbcClassUserResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteBaasEbcClassUserResponse>(await this.doRequest("1.0", "baas.ebc.class.user.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new DeleteBaasEbcClassUserResponse({}));
  }

  /**
   * Description: 班级查询
   * Summary: 班级查询
   */
  async queryBaasEbcOrganizationClass(request: QueryBaasEbcOrganizationClassRequest): Promise<QueryBaasEbcOrganizationClassResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasEbcOrganizationClassEx(request, runtime);
  }

  /**
   * Description: 班级查询
   * Summary: 班级查询
   */
  async queryBaasEbcOrganizationClassEx(request: QueryBaasEbcOrganizationClassRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasEbcOrganizationClassResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasEbcOrganizationClassResponse>(await this.doRequest("1.0", "baas.ebc.organization.class.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasEbcOrganizationClassResponse({}));
  }

  /**
   * Description: 班级明细查询
   * Summary: 班级明细查询
   */
  async queryBaasEbcClassUser(request: QueryBaasEbcClassUserRequest): Promise<QueryBaasEbcClassUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasEbcClassUserEx(request, runtime);
  }

  /**
   * Description: 班级明细查询
   * Summary: 班级明细查询
   */
  async queryBaasEbcClassUserEx(request: QueryBaasEbcClassUserRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasEbcClassUserResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasEbcClassUserResponse>(await this.doRequest("1.0", "baas.ebc.class.user.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasEbcClassUserResponse({}));
  }

  /**
   * Description: 发布课程
   * Summary: 发布课程
   */
  async createBaasEbcOrganizationCourse(request: CreateBaasEbcOrganizationCourseRequest): Promise<CreateBaasEbcOrganizationCourseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createBaasEbcOrganizationCourseEx(request, runtime);
  }

  /**
   * Description: 发布课程
   * Summary: 发布课程
   */
  async createBaasEbcOrganizationCourseEx(request: CreateBaasEbcOrganizationCourseRequest, runtime: $Util.RuntimeOptions): Promise<CreateBaasEbcOrganizationCourseResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBaasEbcOrganizationCourseResponse>(await this.doRequest("1.0", "baas.ebc.organization.course.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateBaasEbcOrganizationCourseResponse({}));
  }

  /**
   * Description: 更新课程
   * Summary: 更新课程
   */
  async updateBaasEbcOrganizationCourse(request: UpdateBaasEbcOrganizationCourseRequest): Promise<UpdateBaasEbcOrganizationCourseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateBaasEbcOrganizationCourseEx(request, runtime);
  }

  /**
   * Description: 更新课程
   * Summary: 更新课程
   */
  async updateBaasEbcOrganizationCourseEx(request: UpdateBaasEbcOrganizationCourseRequest, runtime: $Util.RuntimeOptions): Promise<UpdateBaasEbcOrganizationCourseResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBaasEbcOrganizationCourseResponse>(await this.doRequest("1.0", "baas.ebc.organization.course.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateBaasEbcOrganizationCourseResponse({}));
  }

  /**
   * Description: 将班级添加到课程中
   * Summary: 增加课程班级
   */
  async addBaasEbcCourseClass(request: AddBaasEbcCourseClassRequest): Promise<AddBaasEbcCourseClassResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.addBaasEbcCourseClassEx(request, runtime);
  }

  /**
   * Description: 将班级添加到课程中
   * Summary: 增加课程班级
   */
  async addBaasEbcCourseClassEx(request: AddBaasEbcCourseClassRequest, runtime: $Util.RuntimeOptions): Promise<AddBaasEbcCourseClassResponse> {
    Util.validateModel(request);
    return $tea.cast<AddBaasEbcCourseClassResponse>(await this.doRequest("1.0", "baas.ebc.course.class.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new AddBaasEbcCourseClassResponse({}));
  }

  /**
   * Description: 将学员添加到课程中
   * Summary: 增加课程学员
   */
  async addBaasEbcCourseUser(request: AddBaasEbcCourseUserRequest): Promise<AddBaasEbcCourseUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.addBaasEbcCourseUserEx(request, runtime);
  }

  /**
   * Description: 将学员添加到课程中
   * Summary: 增加课程学员
   */
  async addBaasEbcCourseUserEx(request: AddBaasEbcCourseUserRequest, runtime: $Util.RuntimeOptions): Promise<AddBaasEbcCourseUserResponse> {
    Util.validateModel(request);
    return $tea.cast<AddBaasEbcCourseUserResponse>(await this.doRequest("1.0", "baas.ebc.course.user.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new AddBaasEbcCourseUserResponse({}));
  }

  /**
   * Description: 删除课程中的班级
   * Summary: 删除课程班级
   */
  async deleteBaasEbcCourseClass(request: DeleteBaasEbcCourseClassRequest): Promise<DeleteBaasEbcCourseClassResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.deleteBaasEbcCourseClassEx(request, runtime);
  }

  /**
   * Description: 删除课程中的班级
   * Summary: 删除课程班级
   */
  async deleteBaasEbcCourseClassEx(request: DeleteBaasEbcCourseClassRequest, runtime: $Util.RuntimeOptions): Promise<DeleteBaasEbcCourseClassResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteBaasEbcCourseClassResponse>(await this.doRequest("1.0", "baas.ebc.course.class.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new DeleteBaasEbcCourseClassResponse({}));
  }

  /**
   * Description: 删除课程中的学员
   * Summary: 删除课程学员
   */
  async deleteBaasEbcCourseUser(request: DeleteBaasEbcCourseUserRequest): Promise<DeleteBaasEbcCourseUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.deleteBaasEbcCourseUserEx(request, runtime);
  }

  /**
   * Description: 删除课程中的学员
   * Summary: 删除课程学员
   */
  async deleteBaasEbcCourseUserEx(request: DeleteBaasEbcCourseUserRequest, runtime: $Util.RuntimeOptions): Promise<DeleteBaasEbcCourseUserResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteBaasEbcCourseUserResponse>(await this.doRequest("1.0", "baas.ebc.course.user.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new DeleteBaasEbcCourseUserResponse({}));
  }

  /**
   * Description: 发布证书
   * Summary: 发布证书
   */
  async createBaasEbcUserCert(request: CreateBaasEbcUserCertRequest): Promise<CreateBaasEbcUserCertResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createBaasEbcUserCertEx(request, runtime);
  }

  /**
   * Description: 发布证书
   * Summary: 发布证书
   */
  async createBaasEbcUserCertEx(request: CreateBaasEbcUserCertRequest, runtime: $Util.RuntimeOptions): Promise<CreateBaasEbcUserCertResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBaasEbcUserCertResponse>(await this.doRequest("1.0", "baas.ebc.user.cert.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateBaasEbcUserCertResponse({}));
  }

  /**
   * Description: 更新证书
   * Summary: 更新证书
   */
  async updateBaasEbcUserCert(request: UpdateBaasEbcUserCertRequest): Promise<UpdateBaasEbcUserCertResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateBaasEbcUserCertEx(request, runtime);
  }

  /**
   * Description: 更新证书
   * Summary: 更新证书
   */
  async updateBaasEbcUserCertEx(request: UpdateBaasEbcUserCertRequest, runtime: $Util.RuntimeOptions): Promise<UpdateBaasEbcUserCertResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBaasEbcUserCertResponse>(await this.doRequest("1.0", "baas.ebc.user.cert.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateBaasEbcUserCertResponse({}));
  }

  /**
   * Description: 查询证书
   * Summary: 查询企业证书
   */
  async queryBaasEbcOrganizationCert(request: QueryBaasEbcOrganizationCertRequest): Promise<QueryBaasEbcOrganizationCertResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasEbcOrganizationCertEx(request, runtime);
  }

  /**
   * Description: 查询证书
   * Summary: 查询企业证书
   */
  async queryBaasEbcOrganizationCertEx(request: QueryBaasEbcOrganizationCertRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasEbcOrganizationCertResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasEbcOrganizationCertResponse>(await this.doRequest("1.0", "baas.ebc.organization.cert.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasEbcOrganizationCertResponse({}));
  }

  /**
   * Description: 查询用户证书
   * Summary: 查询用户证书
   */
  async queryBaasEbcUserCert(request: QueryBaasEbcUserCertRequest): Promise<QueryBaasEbcUserCertResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasEbcUserCertEx(request, runtime);
  }

  /**
   * Description: 查询用户证书
   * Summary: 查询用户证书
   */
  async queryBaasEbcUserCertEx(request: QueryBaasEbcUserCertRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasEbcUserCertResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasEbcUserCertResponse>(await this.doRequest("1.0", "baas.ebc.user.cert.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasEbcUserCertResponse({}));
  }

  /**
   * Description: 证书明细查询
   * Summary: 证书明细查询
   */
  async queryBaasEbcCert(request: QueryBaasEbcCertRequest): Promise<QueryBaasEbcCertResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasEbcCertEx(request, runtime);
  }

  /**
   * Description: 证书明细查询
   * Summary: 证书明细查询
   */
  async queryBaasEbcCertEx(request: QueryBaasEbcCertRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasEbcCertResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasEbcCertResponse>(await this.doRequest("1.0", "baas.ebc.cert.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasEbcCertResponse({}));
  }

  /**
   * Description: 申请证书信息上传url，证书未发布则会返回证书图片、证书持有人、证书其他信息的文件上传url。
  证书已发布则会返回证书图片、证书其他信息的文件上传url。
  文件最大5M
   * Summary: 申请证书信息上传url
   */
  async applyBaasEbcCertUrl(request: ApplyBaasEbcCertUrlRequest): Promise<ApplyBaasEbcCertUrlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.applyBaasEbcCertUrlEx(request, runtime);
  }

  /**
   * Description: 申请证书信息上传url，证书未发布则会返回证书图片、证书持有人、证书其他信息的文件上传url。
  证书已发布则会返回证书图片、证书其他信息的文件上传url。
  文件最大5M
   * Summary: 申请证书信息上传url
   */
  async applyBaasEbcCertUrlEx(request: ApplyBaasEbcCertUrlRequest, runtime: $Util.RuntimeOptions): Promise<ApplyBaasEbcCertUrlResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyBaasEbcCertUrlResponse>(await this.doRequest("1.0", "baas.ebc.cert.url.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ApplyBaasEbcCertUrlResponse({}));
  }

  /**
   * Description: 新增授权关系，仅限联盟管理员调用
   * Summary: 新增授权关系
   */
  async createBaasEbcAuth(request: CreateBaasEbcAuthRequest): Promise<CreateBaasEbcAuthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createBaasEbcAuthEx(request, runtime);
  }

  /**
   * Description: 新增授权关系，仅限联盟管理员调用
   * Summary: 新增授权关系
   */
  async createBaasEbcAuthEx(request: CreateBaasEbcAuthRequest, runtime: $Util.RuntimeOptions): Promise<CreateBaasEbcAuthResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBaasEbcAuthResponse>(await this.doRequest("1.0", "baas.ebc.auth.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateBaasEbcAuthResponse({}));
  }

  /**
   * Description: 更新授权关系，仅限联盟管理员调用
   * Summary: 更新授权关系
   */
  async updateBaasEbcAuth(request: UpdateBaasEbcAuthRequest): Promise<UpdateBaasEbcAuthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateBaasEbcAuthEx(request, runtime);
  }

  /**
   * Description: 更新授权关系，仅限联盟管理员调用
   * Summary: 更新授权关系
   */
  async updateBaasEbcAuthEx(request: UpdateBaasEbcAuthRequest, runtime: $Util.RuntimeOptions): Promise<UpdateBaasEbcAuthResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBaasEbcAuthResponse>(await this.doRequest("1.0", "baas.ebc.auth.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateBaasEbcAuthResponse({}));
  }

  /**
   * Description: 更新授权关系状态，仅限联盟管理员调用
   * Summary: 更新授权关系状态
   */
  async updateBaasEbcAuthStatus(request: UpdateBaasEbcAuthStatusRequest): Promise<UpdateBaasEbcAuthStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateBaasEbcAuthStatusEx(request, runtime);
  }

  /**
   * Description: 更新授权关系状态，仅限联盟管理员调用
   * Summary: 更新授权关系状态
   */
  async updateBaasEbcAuthStatusEx(request: UpdateBaasEbcAuthStatusRequest, runtime: $Util.RuntimeOptions): Promise<UpdateBaasEbcAuthStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBaasEbcAuthStatusResponse>(await this.doRequest("1.0", "baas.ebc.auth.status.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateBaasEbcAuthStatusResponse({}));
  }

  /**
   * Description: 更新数据价值
   * Summary: 更新数据价值
   */
  async updateBaasEbcDataPrice(request: UpdateBaasEbcDataPriceRequest): Promise<UpdateBaasEbcDataPriceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateBaasEbcDataPriceEx(request, runtime);
  }

  /**
   * Description: 更新数据价值
   * Summary: 更新数据价值
   */
  async updateBaasEbcDataPriceEx(request: UpdateBaasEbcDataPriceRequest, runtime: $Util.RuntimeOptions): Promise<UpdateBaasEbcDataPriceResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBaasEbcDataPriceResponse>(await this.doRequest("1.0", "baas.ebc.data.price.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateBaasEbcDataPriceResponse({}));
  }

  /**
   * Description: 查询消费者消费金额
   * Summary: 查询消费者消费金额
   */
  async queryBaasEbcConsumptionAmount(request: QueryBaasEbcConsumptionAmountRequest): Promise<QueryBaasEbcConsumptionAmountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasEbcConsumptionAmountEx(request, runtime);
  }

  /**
   * Description: 查询消费者消费金额
   * Summary: 查询消费者消费金额
   */
  async queryBaasEbcConsumptionAmountEx(request: QueryBaasEbcConsumptionAmountRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasEbcConsumptionAmountResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasEbcConsumptionAmountResponse>(await this.doRequest("1.0", "baas.ebc.consumption.amount.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasEbcConsumptionAmountResponse({}));
  }

  /**
   * Description: 课程明细查询
   * Summary: 课程明细查询
   */
  async queryBaasEbcOrganizationCourse(request: QueryBaasEbcOrganizationCourseRequest): Promise<QueryBaasEbcOrganizationCourseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasEbcOrganizationCourseEx(request, runtime);
  }

  /**
   * Description: 课程明细查询
   * Summary: 课程明细查询
   */
  async queryBaasEbcOrganizationCourseEx(request: QueryBaasEbcOrganizationCourseRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasEbcOrganizationCourseResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasEbcOrganizationCourseResponse>(await this.doRequest("1.0", "baas.ebc.organization.course.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasEbcOrganizationCourseResponse({}));
  }

  /**
   * Description: 课程章节发布
   * Summary: 课程章节发布
   */
  async createBaasEbcCourseChapter(request: CreateBaasEbcCourseChapterRequest): Promise<CreateBaasEbcCourseChapterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createBaasEbcCourseChapterEx(request, runtime);
  }

  /**
   * Description: 课程章节发布
   * Summary: 课程章节发布
   */
  async createBaasEbcCourseChapterEx(request: CreateBaasEbcCourseChapterRequest, runtime: $Util.RuntimeOptions): Promise<CreateBaasEbcCourseChapterResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBaasEbcCourseChapterResponse>(await this.doRequest("1.0", "baas.ebc.course.chapter.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateBaasEbcCourseChapterResponse({}));
  }

  /**
   * Description: 课程章节更新
   * Summary: 课程章节更新
   */
  async updateBaasEbcCourseChapter(request: UpdateBaasEbcCourseChapterRequest): Promise<UpdateBaasEbcCourseChapterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateBaasEbcCourseChapterEx(request, runtime);
  }

  /**
   * Description: 课程章节更新
   * Summary: 课程章节更新
   */
  async updateBaasEbcCourseChapterEx(request: UpdateBaasEbcCourseChapterRequest, runtime: $Util.RuntimeOptions): Promise<UpdateBaasEbcCourseChapterResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBaasEbcCourseChapterResponse>(await this.doRequest("1.0", "baas.ebc.course.chapter.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateBaasEbcCourseChapterResponse({}));
  }

  /**
   * Description: 创建学习记录
   * Summary: 创建学习记录
   */
  async createBaasEbcCourseRecord(request: CreateBaasEbcCourseRecordRequest): Promise<CreateBaasEbcCourseRecordResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createBaasEbcCourseRecordEx(request, runtime);
  }

  /**
   * Description: 创建学习记录
   * Summary: 创建学习记录
   */
  async createBaasEbcCourseRecordEx(request: CreateBaasEbcCourseRecordRequest, runtime: $Util.RuntimeOptions): Promise<CreateBaasEbcCourseRecordResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBaasEbcCourseRecordResponse>(await this.doRequest("1.0", "baas.ebc.course.record.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateBaasEbcCourseRecordResponse({}));
  }

  /**
   * Description: 课程章节查询
   * Summary: 课程章节查询
   */
  async queryBaasEbcCourseChapter(request: QueryBaasEbcCourseChapterRequest): Promise<QueryBaasEbcCourseChapterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasEbcCourseChapterEx(request, runtime);
  }

  /**
   * Description: 课程章节查询
   * Summary: 课程章节查询
   */
  async queryBaasEbcCourseChapterEx(request: QueryBaasEbcCourseChapterRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasEbcCourseChapterResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasEbcCourseChapterResponse>(await this.doRequest("1.0", "baas.ebc.course.chapter.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasEbcCourseChapterResponse({}));
  }

  /**
   * Description: 学习记录查询
   * Summary: 学习记录查询
   */
  async queryBaasEbcCourseRecord(request: QueryBaasEbcCourseRecordRequest): Promise<QueryBaasEbcCourseRecordResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasEbcCourseRecordEx(request, runtime);
  }

  /**
   * Description: 学习记录查询
   * Summary: 学习记录查询
   */
  async queryBaasEbcCourseRecordEx(request: QueryBaasEbcCourseRecordRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasEbcCourseRecordResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasEbcCourseRecordResponse>(await this.doRequest("1.0", "baas.ebc.course.record.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasEbcCourseRecordResponse({}));
  }

  /**
   * Description: 企业用户查询
   * Summary: 企业用户查询
   */
  async queryBaasEbcOrganizationUser(request: QueryBaasEbcOrganizationUserRequest): Promise<QueryBaasEbcOrganizationUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasEbcOrganizationUserEx(request, runtime);
  }

  /**
   * Description: 企业用户查询
   * Summary: 企业用户查询
   */
  async queryBaasEbcOrganizationUserEx(request: QueryBaasEbcOrganizationUserRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasEbcOrganizationUserResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasEbcOrganizationUserResponse>(await this.doRequest("1.0", "baas.ebc.organization.user.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasEbcOrganizationUserResponse({}));
  }

}
