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

// Did Doc中的服务字段描述
export class DidDocServicesInfo extends $tea.Model {
  // 服务的扩展字段
  extension?: string;
  // 服务ID，必须保证该服务ID在did doc中是唯一的。对于保留类型服务：
  // DidAuthService， 有且只能有一个，并且id必须为didauth-1；
  // VerifiableClaimRepository， 有且只有一个，并且id必须为vcrepository-1;
  id: string;
  // 服务的可访问地址
  serviceEndpoint: string;
  // 服务类型，必须是已经注册的服务类型，或者是默认保留的服务类型
  type: string;
  static names(): { [key: string]: string } {
    return {
      extension: 'extension',
      id: 'id',
      serviceEndpoint: 'service_endpoint',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      extension: 'string',
      id: 'string',
      serviceEndpoint: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// identity parameter
export class IdentityParam extends $tea.Model {
  // 经办人姓名
  agent?: string;
  // 经办人身份证号
  agentId?: string;
  // 用户的姓名
  certName: string;
  // 用户的身份证号
  certNo: string;
  // 用户证件类型，目前只支持IDENTITY_CARD
  certType: string;
  // 法人姓名，企业认证必选
  legalPerson?: string;
  // 法人身份证，企业认证必选
  legalPersonId?: string;
  // 手机号码
  mobileNo?: string;
  // 扩展属性字段
  properties?: string;
  // 用户类型，默认为PERSON
  userType?: string;
  static names(): { [key: string]: string } {
    return {
      agent: 'agent',
      agentId: 'agent_id',
      certName: 'cert_name',
      certNo: 'cert_no',
      certType: 'cert_type',
      legalPerson: 'legal_person',
      legalPersonId: 'legal_person_id',
      mobileNo: 'mobile_no',
      properties: 'properties',
      userType: 'user_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      agent: 'string',
      agentId: 'string',
      certName: 'string',
      certNo: 'string',
      certType: 'string',
      legalPerson: 'string',
      legalPersonId: 'string',
      mobileNo: 'string',
      properties: 'string',
      userType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 证书详情
export class BareClaim extends $tea.Model {
  // 下面的内容由调用者自己定义，建议只存放必要的声明信息，不要放置敏感数据
  claim: string;
  // 证书类型
  type?: string;
  static names(): { [key: string]: string } {
    return {
      claim: 'claim',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      claim: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartBaasDidCorporateAgentcreateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景码，找dis工作人员进行分配
  bizCode?: string;
  // 扩展字段
  extensionInfo?: string;
  // 所有需要关联的外键，外键必须已did auth key controller的did作为前缀+“sidekey:”+外键
  indexs?: string[];
  // 企业名称
  ownerName?: string;
  // 自定义企业唯一id，企业在自有模式下的唯一号bid的hash值，调用者需要保证其唯一性
  ownerUid: string;
  // 携带自己定义的服务类型
  services?: DidDocServicesInfo[];
  // 生成的did字符串
  did?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizCode: 'biz_code',
      extensionInfo: 'extension_info',
      indexs: 'indexs',
      ownerName: 'owner_name',
      ownerUid: 'owner_uid',
      services: 'services',
      did: 'did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizCode: 'string',
      extensionInfo: 'string',
      indexs: { 'type': 'array', 'itemType': 'string' },
      ownerName: 'string',
      ownerUid: 'string',
      services: { 'type': 'array', 'itemType': DidDocServicesInfo },
      did: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartBaasDidCorporateAgentcreateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 生成的did字符串
  did?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      did: 'did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      did: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartBaasDidPersonAgentcreateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业自定信息
  extensionInfo?: string;
  // 所有需要关联的外键，外键必须已did auth key controller的did作为前缀+“sidekey:”+外键
  indexs?: string[];
  // 名称
  ownerName?: string;
  // 唯一号，比如可以是hash(证件类型+企业营业执照号) 计算出来的唯一值等
  ownerUid: string;
  // 携带自己定义的服务类型
  services?: DidDocServicesInfo[];
  // 场景码，找dis工作人员进行分配
  bizCode?: string;
  // 生成的did字符串
  did?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      extensionInfo: 'extension_info',
      indexs: 'indexs',
      ownerName: 'owner_name',
      ownerUid: 'owner_uid',
      services: 'services',
      bizCode: 'biz_code',
      did: 'did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      extensionInfo: 'string',
      indexs: { 'type': 'array', 'itemType': 'string' },
      ownerName: 'string',
      ownerUid: 'string',
      services: { 'type': 'array', 'itemType': DidDocServicesInfo },
      bizCode: 'string',
      did: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartBaasDidPersonAgentcreateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 生成的did字符串
  did?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      did: 'did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      did: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartBaasDidCorporateSelfcreateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 扩展信息
  extension?: string;
  // 公司名称
  ownerName?: string;
  // 携带自己定义的服务类型
  services?: DidDocServicesInfo[];
  // 场景码，找dis工作人员进行分配
  bizCode?: string;
  // 生成的did字符串
  did?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      extension: 'extension',
      ownerName: 'owner_name',
      services: 'services',
      bizCode: 'biz_code',
      did: 'did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      extension: 'string',
      ownerName: 'string',
      services: { 'type': 'array', 'itemType': DidDocServicesInfo },
      bizCode: 'string',
      did: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartBaasDidCorporateSelfcreateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 生成的did字符串
  did?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      did: 'did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      did: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartBaasDidVerifiableclaimIssureRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 颁发证书声明
  bareClaim: BareClaim;
  // 过期时间
  expire: number;
  // 由谁来颁发，该did必须为调用者自己或者自己代理的did
  issuer: string;
  // 为哪个did颁发
  subject: string;
  // 验证声明类型，目前默认VerifiableCredential
  type?: string[];
  // 验证声明状态方式，目前只支持直接通过声明id上链查找状态方式，后续会支持更多方式
  verifyStatusType?: string;
  // 场景码，找dis工作人员进行分配
  bizCode?: string;
  // 可验证声明的完整声明 {"content":{"verion":"0.7.0","issuer":"xxxx","subject":"xxxx","expire":1530735444,"issucanceDate":1530735000,"id":"XXXX","claim":{//用户自定义},"status":{"type":"XXXX","id":"XXXXX"}},"proof":{"type":"ecdsa","created":"2018-06-18T21:19:10Z","verificationMethod":"XXXX","signatureValue":"XXXXX"}}
  verifiableClaimContent?: string;
  // 声明id
  verifiableClaimId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bareClaim: 'bare_claim',
      expire: 'expire',
      issuer: 'issuer',
      subject: 'subject',
      type: 'type',
      verifyStatusType: 'verify_status_type',
      bizCode: 'biz_code',
      verifiableClaimContent: 'verifiable_claim_content',
      verifiableClaimId: 'verifiable_claim_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bareClaim: BareClaim,
      expire: 'number',
      issuer: 'string',
      subject: 'string',
      type: { 'type': 'array', 'itemType': 'string' },
      verifyStatusType: 'string',
      bizCode: 'string',
      verifiableClaimContent: 'string',
      verifiableClaimId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartBaasDidVerifiableclaimIssureResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 可验证声明的完整声明 {"content":{"verion":"0.7.0","issuer":"xxxx","subject":"xxxx","expire":1530735444,"issucanceDate":1530735000,"id":"XXXX","claim":{//用户自定义},"status":{"type":"XXXX","id":"XXXXX"}},"proof":{"type":"ecdsa","created":"2018-06-18T21:19:10Z","verificationMethod":"XXXX","signatureValue":"XXXXX"}}
  verifiableClaimContent?: string;
  // 声明id
  verifiableClaimId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      verifiableClaimContent: 'verifiable_claim_content',
      verifiableClaimId: 'verifiable_claim_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      verifiableClaimContent: 'string',
      verifiableClaimId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartBaasDidVerifiableclaimVerifierRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用于零知识证明类型的可验证声明的验证。index是对应于完整VC的一个json字符串，其中key值保持和原始VC一致，value如果是1表示verificate_claim对应key携带的是对应field的原始值，而如果Key的value是0表示verificate_claim对应key携带的是对应field的merkle root值。
  indexs?: string;
  // 可验证声明
  verifiableClaim: string;
  // 场景码，找dis工作人员进行分配
  bizCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      indexs: 'indexs',
      verifiableClaim: 'verifiable_claim',
      bizCode: 'biz_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      indexs: 'string',
      verifiableClaim: 'string',
      bizCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartBaasDidVerifiableclaimVerifierResponse extends $tea.Model {
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

export class QueryBaasDidVcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // vc id，可通过该字符串来查询vc具体内容
  vcId: string;
  // 验证者id
  verifierDid?: string;
  // 场景码，找dis工作人员进行分配
  bizCode?: string;
  // 可验证声明的完整声明 {"content":{"verion":"0.7.0","issuer":"xxxx","subject":"xxxx","expire":1530735444,"issucanceDate":1530735000,"id":"XXXX","claim":{//用户自定义},"status":{"type":"XXXX","id":"XXXXX"}},"proof":{"type":"ecdsa","created":"2018-06-18T21:19:10Z","verificationMethod":"XXXX","signatureValue":"XXXXX"}}
  vcContent?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      vcId: 'vc_id',
      verifierDid: 'verifier_did',
      bizCode: 'biz_code',
      vcContent: 'vc_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      vcId: 'string',
      verifierDid: 'string',
      bizCode: 'string',
      vcContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasDidVcResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 可验证声明的完整声明 {"content":{"verion":"0.7.0","issuer":"xxxx","subject":"xxxx","expire":1530735444,"issucanceDate":1530735000,"id":"XXXX","claim":{//用户自定义},"status":{"type":"XXXX","id":"XXXXX"}},"proof":{"type":"ecdsa","created":"2018-06-18T21:19:10Z","verificationMethod":"XXXX","signatureValue":"XXXXX"}}
  vcContent?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      vcContent: 'vc_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      vcContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartBaasDidIdentificationFaceauthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 认证类型,枚举值 PC_AUTH、APP_AUTH
  authType: string;
  // 颁发证书的subject did
  did: string;
  // 用户身份信息
  identityParam: IdentityParam;
  // 认证接口回调路径，POST接口 请求示例： { "certifyId":"0242de204e1a2c3ed6ee5e21d8a57a4c", "did":"xxxxx","vcId":"xxxxx" }
  returnUrl?: string;
  // 场景码，找dis工作人员进行分配
  bizCode?: string;
  // 认证ID
  certifyId?: string;
  // 二维码URL，用户支付宝扫一扫实人认证
  certifyUrl?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authType: 'auth_type',
      did: 'did',
      identityParam: 'identity_param',
      returnUrl: 'return_url',
      bizCode: 'biz_code',
      certifyId: 'certify_id',
      certifyUrl: 'certify_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authType: 'string',
      did: 'string',
      identityParam: IdentityParam,
      returnUrl: 'string',
      bizCode: 'string',
      certifyId: 'string',
      certifyUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartBaasDidIdentificationFaceauthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 认证ID
  certifyId?: string;
  // 二维码URL，用户支付宝扫一扫实人认证
  certifyUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyId: 'certify_id',
      certifyUrl: 'certify_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyId: 'string',
      certifyUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasDidIdentificationFaceauthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 认证ID，用于查询认证结果
  certifyId: string;
  // 场景码，找dis工作人员进行分配
  bizCode?: string;
  // vc id，可通过该字符串来查询vc具体内容
  vcId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certifyId: 'certify_id',
      bizCode: 'biz_code',
      vcId: 'vc_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certifyId: 'string',
      bizCode: 'string',
      vcId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasDidIdentificationFaceauthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // vc id，可通过该字符串来查询vc具体内容
  vcId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      vcId: 'vc_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      vcId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasDidPersonWiththreemetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 身份证号码
  certNo: string;
  // 扩展字段
  extensionInfo?: string;
  // 手机号码
  mobile: string;
  // 姓名
  name: string;
  // 名称
  ownerName?: string;
  // 自定义个人唯一id，个人在自有模式下的唯一号，调用者需要保证其唯一性 
  ownerUid: string;
  // 场景码，找dis工作人员进行分配
  bizCode?: string;
  // 生成的did字符串
  did?: string;
  // 颁发的vcId
  vcId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certNo: 'cert_no',
      extensionInfo: 'extension_info',
      mobile: 'mobile',
      name: 'name',
      ownerName: 'owner_name',
      ownerUid: 'owner_uid',
      bizCode: 'biz_code',
      did: 'did',
      vcId: 'vc_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certNo: 'string',
      extensionInfo: 'string',
      mobile: 'string',
      name: 'string',
      ownerName: 'string',
      ownerUid: 'string',
      bizCode: 'string',
      did: 'string',
      vcId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasDidPersonWiththreemetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 生成的did字符串
  did?: string;
  // 颁发的vcId
  vcId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      did: 'did',
      vcId: 'vc_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      did: 'string',
      vcId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasDidCorporateWiththreemetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业名称
  epCertName: string;
  // 企业证件号
  epCertNo: string;
  // { "nation": "CN", //企业注册地址 "type": "LimitedCompany", //企业类型 "name": "演示用户名", //必选字段，企业名 "licenceNo": "1111", //营业执照 "address": "1111", //企业地址 "parentName": "", //<-必选字段 业务方名 需要提前协商 "linkType": "indirect", //<- 连接类型，direct直链企业， indirect间链企业 "certifyDate": "2019-1-1", //证书颁发时间 "licenceExpireDate": "2020-1-1", //证书到期时间 "businessScope": "1111", //企业经营范围 "businessAddress": "1111", //企业经营地址 "corporateBusinessType": 0, //<- 企业类型：0 一般企业， 1 个人商户 "channelName": "" //<- 必选字段 业务渠道 需要提前沟通 }
  extensionInfo?: string;
  // 法人姓名
  legalPersonCertName: string;
  // 名称
  ownerName?: string;
  // 自定义企业唯一id，企业在自有模式下的唯一号，调用者需要保证其唯一性
  ownerUid: string;
  // 场景码，找dis工作人员进行分配
  bizCode?: string;
  // 生成的did
  did?: string;
  // 颁发的vcId
  vcId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
      extensionInfo: 'extension_info',
      legalPersonCertName: 'legal_person_cert_name',
      ownerName: 'owner_name',
      ownerUid: 'owner_uid',
      bizCode: 'biz_code',
      did: 'did',
      vcId: 'vc_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      epCertName: 'string',
      epCertNo: 'string',
      extensionInfo: 'string',
      legalPersonCertName: 'string',
      ownerName: 'string',
      ownerUid: 'string',
      bizCode: 'string',
      did: 'string',
      vcId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasDidCorporateWiththreemetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 生成的did
  did?: string;
  // 颁发的vcId
  vcId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      did: 'did',
      vcId: 'vc_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      did: 'string',
      vcId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartBaasDidVcrepositoryIssueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 配置此列表，则说明需要DIS对证书声明内容加密处理，并且控制访问权限，此列表为初始配置的did名单，拥有对此颁发证书的读取权限。
  // 如果不配置此列表，则DIS默认将明文存储此证书，任何did都可以访问此证书声明内容。
  // 
  authDidList?: string[];
  // 颁发证书声明的原始声明内容，其中claim字段为json格式
  bareClaim: BareClaim;
  // 过期时间，如果用不过期可以设置为：-1。
  // 注意如果证书过期，则无法再通过VC Repository读取访问此证书内容。
  expire: number;
  // 颁发证书方，该did必须为调用者自己或者自己代理的did。
  // 
  issuer: string;
  // 1 - 指定id将被按照verifiable_claim_id = "vc:mychain:" + SHA256(Joiner.on(":").join(subject, verifiable_claim_id.substring(0,50)))+verifiable_claim_id.substring(50);此表达式参与SHA256的 verifiable_claim_id 为用户指定的参数。
  specifiedClaimIdType?: number;
  // 颁发证书的目标did，此目标did将拥有存储到VC Repository的数据管控权限，比如：授权给其它did读取此证书的权限。
  subject: string;
  // 通过层级定义的证书类型说明，在使用VC Repository的情况下默认为：["VerifiableCredential","DelegateVCRepository"]。
  // 如果用户希望通过type来过滤读取证书VC，那么可以在此列表后面追加层次定义说明，方便后续读取证书在VC Repository进行过滤。（如果读取方已知verifiable_claim_id可以直接过滤读取）
  type?: string[];
  // 如果指定，最终会使用此id会参与生成的证书的verifiable_claim_id，但是调用方需要保证设置值的唯一性，重复的id会引起最终verifiable_claim_id重复，导致被拒绝颁发证书。
  // 如果不指定，则会随机生成一个规范的verifiable_claim_id。
  // verifiable_claim_id = "vc:mychain:" + SHA256(Joiner.on(":").join(subject, verifiable_claim_id)); 此表达式参与SHA256的 verifiable_claim_id 为用户指定的参数。
  verifiableClaimId?: string;
  // 验证声明状态方式，目前只支持直接通过声明id上链查找状态方式，后续会支持更多方式
  verifyStatusType?: string;
  // 场景码，找dis工作人员进行分配
  bizCode?: string;
  // 可验证声明的完整声明 {"content":{"verion":"0.7.0","issuer":"xxxx","subject":"xxxx","expire":1530735444,"issucanceDate":1530735000,"id":"XXXX","claim":{//用户自定义},"status":{"type":"XXXX","id":"XXXXX"}},"proof":{"type":"ecdsa","created":"2018-06-18T21:19:10Z","verificationMethod":"XXXX","signatureValue":"XXXXX"}}
  verifiableClaimContent?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authDidList: 'auth_did_list',
      bareClaim: 'bare_claim',
      expire: 'expire',
      issuer: 'issuer',
      specifiedClaimIdType: 'specified_claim_id_type',
      subject: 'subject',
      type: 'type',
      verifiableClaimId: 'verifiable_claim_id',
      verifyStatusType: 'verify_status_type',
      bizCode: 'biz_code',
      verifiableClaimContent: 'verifiable_claim_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authDidList: { 'type': 'array', 'itemType': 'string' },
      bareClaim: BareClaim,
      expire: 'number',
      issuer: 'string',
      specifiedClaimIdType: 'number',
      subject: 'string',
      type: { 'type': 'array', 'itemType': 'string' },
      verifiableClaimId: 'string',
      verifyStatusType: 'string',
      bizCode: 'string',
      verifiableClaimContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartBaasDidVcrepositoryIssueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 可验证声明的完整声明 {"content":{"verion":"0.7.0","issuer":"xxxx","subject":"xxxx","expire":1530735444,"issucanceDate":1530735000,"id":"XXXX","claim":{//用户自定义},"status":{"type":"XXXX","id":"XXXXX"}},"proof":{"type":"ecdsa","created":"2018-06-18T21:19:10Z","verificationMethod":"XXXX","signatureValue":"XXXXX"}}
  verifiableClaimContent?: string;
  // 颁发的证书唯一id，颁发成功后返回。
  verifiableClaimId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      verifiableClaimContent: 'verifiable_claim_content',
      verifiableClaimId: 'verifiable_claim_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      verifiableClaimContent: 'string',
      verifiableClaimId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartBaasDidAgentServicetypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 枚举类型，描述访问服务的方式
  accessMode?: string;
  // 对服务的文字描述，<1000个字符
  description?: string;
  // 服务类型创建者did
  did: string;
  // {
  //   "item1":"",
  //   "item2":"",
  //   ...
  // }
  serviceInput?: string;
  // {
  //    "item1":""
  //    "item2":""
  //    ...
  // }
  serviceOutput?: string;
  // 自定义服务类型，字符数16～32个
  serviceType: string;
  // 场景码，找dis工作人员进行分配
  bizCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accessMode: 'access_mode',
      description: 'description',
      did: 'did',
      serviceInput: 'service_input',
      serviceOutput: 'service_output',
      serviceType: 'service_type',
      bizCode: 'biz_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accessMode: 'string',
      description: 'string',
      did: 'string',
      serviceInput: 'string',
      serviceOutput: 'string',
      serviceType: 'string',
      bizCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartBaasDidAgentServicetypeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建成功之后，返回服务类型名
  serviceType?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      serviceType: 'service_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      serviceType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasDidAgentServicetypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询者did
  did: string;
  // 指定查询的服务类型名
  serviceType: string;
  // 场景码，找dis工作人员进行分配
  bizCode?: string;
  // 服务类型定义列表
  serviceTypes?: string[];
  // 总共有几项
  totalNumber?: number;
  // 总共有几页
  totalPage?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      did: 'did',
      serviceType: 'service_type',
      bizCode: 'biz_code',
      serviceTypes: 'service_types',
      totalNumber: 'total_number',
      totalPage: 'total_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      did: 'string',
      serviceType: 'string',
      bizCode: 'string',
      serviceTypes: { 'type': 'array', 'itemType': 'string' },
      totalNumber: 'number',
      totalPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasDidAgentServicetypeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 服务类型定义列表
  serviceTypes?: string[];
  // 总共有几项
  totalNumber?: number;
  // 总共有几页
  totalPage?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      serviceTypes: 'service_types',
      totalNumber: 'total_number',
      totalPage: 'total_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      serviceTypes: { 'type': 'array', 'itemType': 'string' },
      totalNumber: 'number',
      totalPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasDidServicesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 新增的服务信息
  addSevices?: DidDocServicesInfo[];
  // 要删除的服务id列表
  delServices?: string[];
  // 指定要更新的did
  did: string;
  // did类型，个人|企业|设备(IOT)
  didType: string;
  // 场景码，找dis工作人员进行分配
  bizCode?: string;
  // 更新后的did doc
  didDoc?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      addSevices: 'add_sevices',
      delServices: 'del_services',
      did: 'did',
      didType: 'did_type',
      bizCode: 'biz_code',
      didDoc: 'did_doc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      addSevices: { 'type': 'array', 'itemType': DidDocServicesInfo },
      delServices: { 'type': 'array', 'itemType': 'string' },
      did: 'string',
      didType: 'string',
      bizCode: 'string',
      didDoc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasDidServicesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 更新后的did doc
  didDoc?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      didDoc: 'did_doc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      didDoc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasDidPersonWithtwometaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 身份证号码
  certNo: string;
  // 扩展字段
  extensionInfo?: string;
  // 姓名
  name: string;
  // 名称
  ownerName?: string;
  // 自定义个人唯一id，个人在自有模式下的唯一号，调用者需要保证其唯一性
  ownerUid: string;
  // 场景码，找dis工作人员进行分配
  bizCode?: string;
  // 生成的did字符串
  did?: string;
  // 颁发的vcId
  vcId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certNo: 'cert_no',
      extensionInfo: 'extension_info',
      name: 'name',
      ownerName: 'owner_name',
      ownerUid: 'owner_uid',
      bizCode: 'biz_code',
      did: 'did',
      vcId: 'vc_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certNo: 'string',
      extensionInfo: 'string',
      name: 'string',
      ownerName: 'string',
      ownerUid: 'string',
      bizCode: 'string',
      did: 'string',
      vcId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasDidPersonWithtwometaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 生成的did字符串
  did?: string;
  // 颁发的vcId
  vcId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      did: 'did',
      vcId: 'vc_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      did: 'string',
      vcId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasDidCorporateWithtwometaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业名称
  epCertName: string;
  // 企业证件号
  epCertNo: string;
  // {
  //   "nation": "CN", //企业注册地址
  //   "type": "LimitedCompany", //企业类型
  //   "name": "演示用户名", //必选字段，企业名
  //   "licenceNo": "1111", //营业执照
  //   "address": "1111", //企业地址
  //   "parentName": "", //<-必选字段 业务方名 需要提前协商
  //   "linkType": "indirect", //<- 连接类型，direct直链企业， indirect间链企业
  //   "certifyDate": "2019-1-1", //证书颁发时间
  //   "licenceExpireDate": "2020-1-1", //证书到期时间
  //   "businessScope": "1111", //企业经营范围
  //   "businessAddress": "1111", //企业经营地址
  //   "corporateBusinessType": 0, //<- 企业类型：0 一般企业， 1 个人商户
  //   "channelName": "" //<- 必选字段 业务渠道 需要提前沟通
  // }
  extensionInfo?: string;
  // 名称
  // 
  ownerName?: string;
  // 自定义企业唯一id，企业在自有模式下的唯一号，调用者需要保证其唯一性
  ownerUid: string;
  // 场景码，找dis工作人员进行分配
  bizCode?: string;
  // 生成的did
  // 
  did?: string;
  // 颁发的vcId
  vcId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
      extensionInfo: 'extension_info',
      ownerName: 'owner_name',
      ownerUid: 'owner_uid',
      bizCode: 'biz_code',
      did: 'did',
      vcId: 'vc_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      epCertName: 'string',
      epCertNo: 'string',
      extensionInfo: 'string',
      ownerName: 'string',
      ownerUid: 'string',
      bizCode: 'string',
      did: 'string',
      vcId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasDidCorporateWithtwometaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 生成的did
  // 
  did?: string;
  // 颁发的vcId
  vcId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      did: 'did',
      vcId: 'vc_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      did: 'string',
      vcId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasDidCorporateWithfourmetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业名称
  // 
  epCertName: string;
  // 企业证件号
  // 
  epCertNo: string;
  // { "nation": "CN", //企业注册地址 "type": "LimitedCompany", //企业类型 "name": "演示用户名", //必选字段，企业名 "licenceNo": "1111", //营业执照 "address": "1111", //企业地址 "parentName": "", //<-必选字段 业务方名 需要提前协商 "linkType": "indirect", //<- 连接类型，direct直链企业， indirect间链企业 "certifyDate": "2019-1-1", //证书颁发时间 "licenceExpireDate": "2020-1-1", //证书到期时间 "businessScope": "1111", //企业经营范围 "businessAddress": "1111", //企业经营地址 "corporateBusinessType": 0, //<- 企业类型：0 一般企业， 1 个人商户 "channelName": "" //<- 必选字段 业务渠道 需要提前沟通 }
  // 
  extensionInfo?: string;
  // 法人姓名
  // 
  legalPersonCertName: string;
  // 法人身份证件号
  legalPersonCertNo: string;
  // 名称
  // 
  ownerName?: string;
  // 自定义企业唯一id，企业在自有模式下的唯一号，调用者需要保证其唯一性
  ownerUid: string;
  // 场景码，找dis工作人员进行分配
  bizCode?: string;
  // 生成的did
  // 
  did?: string;
  // 颁发的vcId
  // 
  vcId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
      extensionInfo: 'extension_info',
      legalPersonCertName: 'legal_person_cert_name',
      legalPersonCertNo: 'legal_person_cert_no',
      ownerName: 'owner_name',
      ownerUid: 'owner_uid',
      bizCode: 'biz_code',
      did: 'did',
      vcId: 'vc_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      epCertName: 'string',
      epCertNo: 'string',
      extensionInfo: 'string',
      legalPersonCertName: 'string',
      legalPersonCertNo: 'string',
      ownerName: 'string',
      ownerUid: 'string',
      bizCode: 'string',
      did: 'string',
      vcId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasDidCorporateWithfourmetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 生成的did
  // 
  did?: string;
  // 颁发的vcId
  // 
  vcId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      did: 'did',
      vcId: 'vc_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      did: 'string',
      vcId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasDidPersonWithfourmetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 银行卡号
  bankCard: string;
  // 身份证号码
  // 
  certNo: string;
  // 扩展字段
  // 
  extensionInfo?: string;
  // 手机号码
  // 
  mobile: string;
  // 姓名
  // 
  name: string;
  // 名称
  // 
  ownerName?: string;
  // 自定义个人唯一id，个人在自有模式下的唯一号，调用者需要保证其唯一性
  ownerUid: string;
  // 场景码，找dis工作人员进行分配
  bizCode?: string;
  // 生成的did字符串
  // 
  did?: string;
  // 颁发的vcId
  // 
  vcId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bankCard: 'bank_card',
      certNo: 'cert_no',
      extensionInfo: 'extension_info',
      mobile: 'mobile',
      name: 'name',
      ownerName: 'owner_name',
      ownerUid: 'owner_uid',
      bizCode: 'biz_code',
      did: 'did',
      vcId: 'vc_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bankCard: 'string',
      certNo: 'string',
      extensionInfo: 'string',
      mobile: 'string',
      name: 'string',
      ownerName: 'string',
      ownerUid: 'string',
      bizCode: 'string',
      did: 'string',
      vcId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasDidPersonWithfourmetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 生成的did字符串
  // 
  did?: string;
  // 颁发的vcId
  // 
  vcId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      did: 'did',
      vcId: 'vc_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      did: 'string',
      vcId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartBaasDidCorporateFaceauthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 回调通知地址
  callBackUrl?: string;
  // 企业名称
  epCertName: string;
  // 企业证件号
  epCertNo: string;
  // 企业证件类型（NATIONAL_LEGAL（工商注册号）或 NATIONAL_LEGAL_MERGE （ 社会统一信用代码））
  epCertType: string;
  // { "nation": "CN", //企业注册地址 "type": "LimitedCompany", //企业类型 "name": "演示用户名", //必选字段，企业名 "licenceNo": "1111", //营业执照 "address": "1111", //企业地址 "parentName": "", //<-必选字段 业务方名 需要提前协商 "linkType": "indirect", //<- 连接类型，direct直链企业， indirect间链企业 "certifyDate": "2019-1-1", //证书颁发时间 "licenceExpireDate": "2020-1-1", //证书到期时间 "businessScope": "1111", //企业经营范围 "businessAddress": "1111", //企业经营地址 "corporateBusinessType": 0, //<- 企业类型：0 一般企业， 1 个人商户 "channelName": "" //<- 必选字段 业务渠道 需要提前沟通 }
  extensionInfo?: string;
  // 企业法人
  legalPersonCertName: string;
  // 法人身份证号
  legalPersonCertNo: string;
  // 认证完成后回跳地址
  merchantUrl?: string;
  // 名称
  ownerName?: string;
  // 自定义企业唯一id，企业在自有模式下的唯一号，调用者需要保证其唯一性
  ownerUid?: string;
  // 场景码，找dis工作人员进行分配	
  bizCode?: string;
  // 产品渲染方式：H5、NATIVE 或 PC, 默认为H5
  group?: string;
  // 认证ID
  certifyId?: string;
  // 二维码URL，用户支付宝扫一扫实人认证
  certifyUrl?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      callBackUrl: 'call_back_url',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
      epCertType: 'ep_cert_type',
      extensionInfo: 'extension_info',
      legalPersonCertName: 'legal_person_cert_name',
      legalPersonCertNo: 'legal_person_cert_no',
      merchantUrl: 'merchant_url',
      ownerName: 'owner_name',
      ownerUid: 'owner_uid',
      bizCode: 'biz_code',
      group: 'group',
      certifyId: 'certify_id',
      certifyUrl: 'certify_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      callBackUrl: 'string',
      epCertName: 'string',
      epCertNo: 'string',
      epCertType: 'string',
      extensionInfo: 'string',
      legalPersonCertName: 'string',
      legalPersonCertNo: 'string',
      merchantUrl: 'string',
      ownerName: 'string',
      ownerUid: 'string',
      bizCode: 'string',
      group: 'string',
      certifyId: 'string',
      certifyUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartBaasDidCorporateFaceauthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 认证ID
  certifyId?: string;
  // 二维码URL，用户支付宝扫一扫实人认证
  certifyUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyId: 'certify_id',
      certifyUrl: 'certify_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyId: 'string',
      certifyUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasDidCorporateFaceauthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 认证ID，用于查询认证结果
  // 
  certifyId: string;
  // 场景码，找dis工作人员进行分配
  bizCode?: string;
  // 产品渲染方式：H5、NATIVE 或 PC
  group?: string;
  // 生成的did
  did?: string;
  // vc id，可通过该字符串来查询vc具体内容
  vcId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certifyId: 'certify_id',
      bizCode: 'biz_code',
      group: 'group',
      did: 'did',
      vcId: 'vc_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certifyId: 'string',
      bizCode: 'string',
      group: 'string',
      did: 'string',
      vcId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasDidCorporateFaceauthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 生成的did
  did?: string;
  // vc id，可通过该字符串来查询vc具体内容
  vcId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      did: 'did',
      vcId: 'vc_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      did: 'string',
      vcId: 'string',
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
          sdk_version: "1.0.3",
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
   * Description: 通过代理模式为企业创建did
   * Summary: 通过代理模式为企业创建did
   */
  async startBaasDidCorporateAgentcreate(request: StartBaasDidCorporateAgentcreateRequest): Promise<StartBaasDidCorporateAgentcreateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startBaasDidCorporateAgentcreateEx(request, headers, runtime);
  }

  /**
   * Description: 通过代理模式为企业创建did
   * Summary: 通过代理模式为企业创建did
   */
  async startBaasDidCorporateAgentcreateEx(request: StartBaasDidCorporateAgentcreateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartBaasDidCorporateAgentcreateResponse> {
    Util.validateModel(request);
    return $tea.cast<StartBaasDidCorporateAgentcreateResponse>(await this.doRequest("1.0", "baas.did.corporate.agentcreate.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartBaasDidCorporateAgentcreateResponse({}));
  }

  /**
   * Description: 通过代理模式为个人创建did
   * Summary: 通过代理模式为个人创建did
   */
  async startBaasDidPersonAgentcreate(request: StartBaasDidPersonAgentcreateRequest): Promise<StartBaasDidPersonAgentcreateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startBaasDidPersonAgentcreateEx(request, headers, runtime);
  }

  /**
   * Description: 通过代理模式为个人创建did
   * Summary: 通过代理模式为个人创建did
   */
  async startBaasDidPersonAgentcreateEx(request: StartBaasDidPersonAgentcreateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartBaasDidPersonAgentcreateResponse> {
    Util.validateModel(request);
    return $tea.cast<StartBaasDidPersonAgentcreateResponse>(await this.doRequest("1.0", "baas.did.person.agentcreate.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartBaasDidPersonAgentcreateResponse({}));
  }

  /**
   * Description: 直接创建自己的企业did
   * Summary: 直接创建自己的企业did
   */
  async startBaasDidCorporateSelfcreate(request: StartBaasDidCorporateSelfcreateRequest): Promise<StartBaasDidCorporateSelfcreateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startBaasDidCorporateSelfcreateEx(request, headers, runtime);
  }

  /**
   * Description: 直接创建自己的企业did
   * Summary: 直接创建自己的企业did
   */
  async startBaasDidCorporateSelfcreateEx(request: StartBaasDidCorporateSelfcreateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartBaasDidCorporateSelfcreateResponse> {
    Util.validateModel(request);
    return $tea.cast<StartBaasDidCorporateSelfcreateResponse>(await this.doRequest("1.0", "baas.did.corporate.selfcreate.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartBaasDidCorporateSelfcreateResponse({}));
  }

  /**
   * Description: 使用自己或者代理的did为指定did颁发证书
   * Summary: 为指定did颁发证书
   */
  async startBaasDidVerifiableclaimIssure(request: StartBaasDidVerifiableclaimIssureRequest): Promise<StartBaasDidVerifiableclaimIssureResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startBaasDidVerifiableclaimIssureEx(request, headers, runtime);
  }

  /**
   * Description: 使用自己或者代理的did为指定did颁发证书
   * Summary: 为指定did颁发证书
   */
  async startBaasDidVerifiableclaimIssureEx(request: StartBaasDidVerifiableclaimIssureRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartBaasDidVerifiableclaimIssureResponse> {
    Util.validateModel(request);
    return $tea.cast<StartBaasDidVerifiableclaimIssureResponse>(await this.doRequest("1.0", "baas.did.verifiableclaim.issure.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartBaasDidVerifiableclaimIssureResponse({}));
  }

  /**
   * Description: 验证可验证声明
   * Summary: 验证可验证声明
   */
  async startBaasDidVerifiableclaimVerifier(request: StartBaasDidVerifiableclaimVerifierRequest): Promise<StartBaasDidVerifiableclaimVerifierResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startBaasDidVerifiableclaimVerifierEx(request, headers, runtime);
  }

  /**
   * Description: 验证可验证声明
   * Summary: 验证可验证声明
   */
  async startBaasDidVerifiableclaimVerifierEx(request: StartBaasDidVerifiableclaimVerifierRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartBaasDidVerifiableclaimVerifierResponse> {
    Util.validateModel(request);
    return $tea.cast<StartBaasDidVerifiableclaimVerifierResponse>(await this.doRequest("1.0", "baas.did.verifiableclaim.verifier.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartBaasDidVerifiableclaimVerifierResponse({}));
  }

  /**
   * Description: 通过vcid查询vc内容
   * Summary: 通过vcid查询vc内容
   */
  async queryBaasDidVc(request: QueryBaasDidVcRequest): Promise<QueryBaasDidVcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBaasDidVcEx(request, headers, runtime);
  }

  /**
   * Description: 通过vcid查询vc内容
   * Summary: 通过vcid查询vc内容
   */
  async queryBaasDidVcEx(request: QueryBaasDidVcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBaasDidVcResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasDidVcResponse>(await this.doRequest("1.0", "baas.did.vc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBaasDidVcResponse({}));
  }

  /**
   * Description: 开始实人认证
   * Summary: 开始实人认证
   */
  async startBaasDidIdentificationFaceauth(request: StartBaasDidIdentificationFaceauthRequest): Promise<StartBaasDidIdentificationFaceauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startBaasDidIdentificationFaceauthEx(request, headers, runtime);
  }

  /**
   * Description: 开始实人认证
   * Summary: 开始实人认证
   */
  async startBaasDidIdentificationFaceauthEx(request: StartBaasDidIdentificationFaceauthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartBaasDidIdentificationFaceauthResponse> {
    Util.validateModel(request);
    return $tea.cast<StartBaasDidIdentificationFaceauthResponse>(await this.doRequest("1.0", "baas.did.identification.faceauth.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartBaasDidIdentificationFaceauthResponse({}));
  }

  /**
   * Description: 查询实人认证结果
   * Summary: 查询实人认证结果
   */
  async queryBaasDidIdentificationFaceauth(request: QueryBaasDidIdentificationFaceauthRequest): Promise<QueryBaasDidIdentificationFaceauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBaasDidIdentificationFaceauthEx(request, headers, runtime);
  }

  /**
   * Description: 查询实人认证结果
   * Summary: 查询实人认证结果
   */
  async queryBaasDidIdentificationFaceauthEx(request: QueryBaasDidIdentificationFaceauthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBaasDidIdentificationFaceauthResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasDidIdentificationFaceauthResponse>(await this.doRequest("1.0", "baas.did.identification.faceauth.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBaasDidIdentificationFaceauthResponse({}));
  }

  /**
   * Description: 通过个人三要素验证后创建个人did，若未通过个人三要素验证，则不创建did并报错
   * Summary: 通过个人三要素验证后创建个人did
   */
  async createBaasDidPersonWiththreemeta(request: CreateBaasDidPersonWiththreemetaRequest): Promise<CreateBaasDidPersonWiththreemetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBaasDidPersonWiththreemetaEx(request, headers, runtime);
  }

  /**
   * Description: 通过个人三要素验证后创建个人did，若未通过个人三要素验证，则不创建did并报错
   * Summary: 通过个人三要素验证后创建个人did
   */
  async createBaasDidPersonWiththreemetaEx(request: CreateBaasDidPersonWiththreemetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBaasDidPersonWiththreemetaResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBaasDidPersonWiththreemetaResponse>(await this.doRequest("1.0", "baas.did.person.withthreemeta.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBaasDidPersonWiththreemetaResponse({}));
  }

  /**
   * Description: 通过企业三要素验证后创建企业did，若未通过企业三要素验证，则不创建did并报错
   * Summary: 通过企业三要素验证后创建企业did
   */
  async createBaasDidCorporateWiththreemeta(request: CreateBaasDidCorporateWiththreemetaRequest): Promise<CreateBaasDidCorporateWiththreemetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBaasDidCorporateWiththreemetaEx(request, headers, runtime);
  }

  /**
   * Description: 通过企业三要素验证后创建企业did，若未通过企业三要素验证，则不创建did并报错
   * Summary: 通过企业三要素验证后创建企业did
   */
  async createBaasDidCorporateWiththreemetaEx(request: CreateBaasDidCorporateWiththreemetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBaasDidCorporateWiththreemetaResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBaasDidCorporateWiththreemetaResponse>(await this.doRequest("1.0", "baas.did.corporate.withthreemeta.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBaasDidCorporateWiththreemetaResponse({}));
  }

  /**
   * Description: 使用自己或者代理的did为指定did颁发证书，同时在VC Repository中对证书VC进行存储。
  支持授权管理，只有被授权的did未来才可以访问获取此颁发的证书数据。
   * Summary: 指定did颁发证书，并存储
   */
  async startBaasDidVcrepositoryIssue(request: StartBaasDidVcrepositoryIssueRequest): Promise<StartBaasDidVcrepositoryIssueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startBaasDidVcrepositoryIssueEx(request, headers, runtime);
  }

  /**
   * Description: 使用自己或者代理的did为指定did颁发证书，同时在VC Repository中对证书VC进行存储。
  支持授权管理，只有被授权的did未来才可以访问获取此颁发的证书数据。
   * Summary: 指定did颁发证书，并存储
   */
  async startBaasDidVcrepositoryIssueEx(request: StartBaasDidVcrepositoryIssueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartBaasDidVcrepositoryIssueResponse> {
    Util.validateModel(request);
    return $tea.cast<StartBaasDidVcrepositoryIssueResponse>(await this.doRequest("1.0", "baas.did.vcrepository.issue.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartBaasDidVcrepositoryIssueResponse({}));
  }

  /**
   * Description: 注册自定义的服务类型，目前只有租户did可以调用
   * Summary: 注册自定义服务类型
   */
  async startBaasDidAgentServicetype(request: StartBaasDidAgentServicetypeRequest): Promise<StartBaasDidAgentServicetypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startBaasDidAgentServicetypeEx(request, headers, runtime);
  }

  /**
   * Description: 注册自定义的服务类型，目前只有租户did可以调用
   * Summary: 注册自定义服务类型
   */
  async startBaasDidAgentServicetypeEx(request: StartBaasDidAgentServicetypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartBaasDidAgentServicetypeResponse> {
    Util.validateModel(request);
    return $tea.cast<StartBaasDidAgentServicetypeResponse>(await this.doRequest("1.0", "baas.did.agent.servicetype.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartBaasDidAgentServicetypeResponse({}));
  }

  /**
   * Description: 查询指定服务类型的定义，不支持全量查询
   * Summary: 查询指定服务类型的定义
   */
  async queryBaasDidAgentServicetype(request: QueryBaasDidAgentServicetypeRequest): Promise<QueryBaasDidAgentServicetypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBaasDidAgentServicetypeEx(request, headers, runtime);
  }

  /**
   * Description: 查询指定服务类型的定义，不支持全量查询
   * Summary: 查询指定服务类型的定义
   */
  async queryBaasDidAgentServicetypeEx(request: QueryBaasDidAgentServicetypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBaasDidAgentServicetypeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasDidAgentServicetypeResponse>(await this.doRequest("1.0", "baas.did.agent.servicetype.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBaasDidAgentServicetypeResponse({}));
  }

  /**
   * Description: 代理模式下更新企业did doc中service中的字段
   * Summary: 代理更新企业did中的services
   */
  async updateBaasDidServices(request: UpdateBaasDidServicesRequest): Promise<UpdateBaasDidServicesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateBaasDidServicesEx(request, headers, runtime);
  }

  /**
   * Description: 代理模式下更新企业did doc中service中的字段
   * Summary: 代理更新企业did中的services
   */
  async updateBaasDidServicesEx(request: UpdateBaasDidServicesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateBaasDidServicesResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBaasDidServicesResponse>(await this.doRequest("1.0", "baas.did.services.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateBaasDidServicesResponse({}));
  }

  /**
   * Description: 通过个人二要素验证后创建个人did，若未通过个人二要素验证，则不创建did并报错
   * Summary: 通过个人二要素验证后创建个人did
   */
  async createBaasDidPersonWithtwometa(request: CreateBaasDidPersonWithtwometaRequest): Promise<CreateBaasDidPersonWithtwometaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBaasDidPersonWithtwometaEx(request, headers, runtime);
  }

  /**
   * Description: 通过个人二要素验证后创建个人did，若未通过个人二要素验证，则不创建did并报错
   * Summary: 通过个人二要素验证后创建个人did
   */
  async createBaasDidPersonWithtwometaEx(request: CreateBaasDidPersonWithtwometaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBaasDidPersonWithtwometaResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBaasDidPersonWithtwometaResponse>(await this.doRequest("1.0", "baas.did.person.withtwometa.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBaasDidPersonWithtwometaResponse({}));
  }

  /**
   * Description: 通过企业二要素验证后创建企业did
   * Summary: 通过企业二要素验证后创建企业did
   */
  async createBaasDidCorporateWithtwometa(request: CreateBaasDidCorporateWithtwometaRequest): Promise<CreateBaasDidCorporateWithtwometaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBaasDidCorporateWithtwometaEx(request, headers, runtime);
  }

  /**
   * Description: 通过企业二要素验证后创建企业did
   * Summary: 通过企业二要素验证后创建企业did
   */
  async createBaasDidCorporateWithtwometaEx(request: CreateBaasDidCorporateWithtwometaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBaasDidCorporateWithtwometaResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBaasDidCorporateWithtwometaResponse>(await this.doRequest("1.0", "baas.did.corporate.withtwometa.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBaasDidCorporateWithtwometaResponse({}));
  }

  /**
   * Description: 通过企业四要素验证后创建企业did
   * Summary: 通过企业四要素验证后创建企业did
   */
  async createBaasDidCorporateWithfourmeta(request: CreateBaasDidCorporateWithfourmetaRequest): Promise<CreateBaasDidCorporateWithfourmetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBaasDidCorporateWithfourmetaEx(request, headers, runtime);
  }

  /**
   * Description: 通过企业四要素验证后创建企业did
   * Summary: 通过企业四要素验证后创建企业did
   */
  async createBaasDidCorporateWithfourmetaEx(request: CreateBaasDidCorporateWithfourmetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBaasDidCorporateWithfourmetaResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBaasDidCorporateWithfourmetaResponse>(await this.doRequest("1.0", "baas.did.corporate.withfourmeta.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBaasDidCorporateWithfourmetaResponse({}));
  }

  /**
   * Description: 通过个人四要素验证后创建个人did
   * Summary: 通过个人四要素验证后创建个人did
   */
  async createBaasDidPersonWithfourmeta(request: CreateBaasDidPersonWithfourmetaRequest): Promise<CreateBaasDidPersonWithfourmetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBaasDidPersonWithfourmetaEx(request, headers, runtime);
  }

  /**
   * Description: 通过个人四要素验证后创建个人did
   * Summary: 通过个人四要素验证后创建个人did
   */
  async createBaasDidPersonWithfourmetaEx(request: CreateBaasDidPersonWithfourmetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBaasDidPersonWithfourmetaResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBaasDidPersonWithfourmetaResponse>(await this.doRequest("1.0", "baas.did.person.withfourmeta.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBaasDidPersonWithfourmetaResponse({}));
  }

  /**
   * Description: 企业法人刷脸认证
   * Summary: 企业法人刷脸认证
   */
  async startBaasDidCorporateFaceauth(request: StartBaasDidCorporateFaceauthRequest): Promise<StartBaasDidCorporateFaceauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startBaasDidCorporateFaceauthEx(request, headers, runtime);
  }

  /**
   * Description: 企业法人刷脸认证
   * Summary: 企业法人刷脸认证
   */
  async startBaasDidCorporateFaceauthEx(request: StartBaasDidCorporateFaceauthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartBaasDidCorporateFaceauthResponse> {
    Util.validateModel(request);
    return $tea.cast<StartBaasDidCorporateFaceauthResponse>(await this.doRequest("1.0", "baas.did.corporate.faceauth.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartBaasDidCorporateFaceauthResponse({}));
  }

  /**
   * Description: 查询企业法人实人结果
   * Summary: 查询企业法人实人结果
   */
  async queryBaasDidCorporateFaceauth(request: QueryBaasDidCorporateFaceauthRequest): Promise<QueryBaasDidCorporateFaceauthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBaasDidCorporateFaceauthEx(request, headers, runtime);
  }

  /**
   * Description: 查询企业法人实人结果
   * Summary: 查询企业法人实人结果
   */
  async queryBaasDidCorporateFaceauthEx(request: QueryBaasDidCorporateFaceauthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBaasDidCorporateFaceauthResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasDidCorporateFaceauthResponse>(await this.doRequest("1.0", "baas.did.corporate.faceauth.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBaasDidCorporateFaceauthResponse({}));
  }

}
