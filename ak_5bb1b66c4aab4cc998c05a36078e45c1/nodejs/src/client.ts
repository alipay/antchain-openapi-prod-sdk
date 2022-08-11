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

// 123
export class InfoSecHitDetectItem extends $tea.Model {
  // 123
  detectTypeCode?: string;
  // 123
  hitDetectResource?: string;
  // 123
  hitContent?: string;
  // 123
  detectResourceLevel?: string;
  static names(): { [key: string]: string } {
    return {
      detectTypeCode: 'detect_type_code',
      hitDetectResource: 'hit_detect_resource',
      hitContent: 'hit_content',
      detectResourceLevel: 'detect_resource_level',
    };
  }

  static types(): { [key: string]: any } {
    return {
      detectTypeCode: 'string',
      hitDetectResource: 'string',
      hitContent: 'string',
      detectResourceLevel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 内容检测接口查询返回结构
export class SecurityRiskContentResultGetResponse extends $tea.Model {
  // 命中次数
  hitDetectItems?: InfoSecHitDetectItem[];
  // 返回结果
  resultAction?: string;
  static names(): { [key: string]: string } {
    return {
      hitDetectItems: 'hit_detect_items',
      resultAction: 'result_action',
    };
  }

  static types(): { [key: string]: any } {
    return {
      hitDetectItems: { 'type': 'array', 'itemType': InfoSecHitDetectItem },
      resultAction: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 键值对，兼容map用
export class NameValuePair extends $tea.Model {
  // 键名
  name: string;
  // 键值
  value: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 核身产品
export class GwValidateProduct extends $tea.Model {
  // 核审产品码，支持多种核身产品。
  // ZK_FACE_VERIFY：人脸识别
  productCode: string;
  // 产品渲染方式：H5、NATIVE 或 PC
  group: string;
  // 核身产品参数，因网关限制，暂只支持Map<String,String>
  productParams?: NameValuePair[];
  static names(): { [key: string]: string } {
    return {
      productCode: 'product_code',
      group: 'group',
      productParams: 'product_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      productCode: 'string',
      group: 'string',
      productParams: { 'type': 'array', 'itemType': NameValuePair },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 大安全接口返回
export class InfoSecContentQueryResult extends $tea.Model {
  // 检测来源等级
  detectResourceLevel?: string;
  // 检测结果类型
  detectTypeCode?: string;
  // 命中内容
  hitContent?: string;
  // 检测命中来源
  hitDetectResource?: string;
  static names(): { [key: string]: string } {
    return {
      detectResourceLevel: 'detect_resource_level',
      detectTypeCode: 'detect_type_code',
      hitContent: 'hit_content',
      hitDetectResource: 'hit_detect_resource',
    };
  }

  static types(): { [key: string]: any } {
    return {
      detectResourceLevel: 'string',
      detectTypeCode: 'string',
      hitContent: 'string',
      hitDetectResource: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 内容安全查询接口返回结构
export class ContentQueryResultModel extends $tea.Model {
  // 返回结果码
  code?: number;
  // 返回错误码
  errMsg?: string;
  // 返回结果
  model?: SecurityRiskContentResultGetResponse;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      errMsg: 'err_msg',
      model: 'model',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'number',
      errMsg: 'string',
      model: SecurityRiskContentResultGetResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 客户认证结果
export class CustomerAuthResult extends $tea.Model {
  // 账户ID
  accId?: string;
  // 返回code 0:核验成功 1:企业信息有误 2:企业非正常营业
  code: string;
  // 客户ID
  customerId?: string;
  // 客户did
  did?: string;
  // 验证状态
  enterpriseStatus?: string;
  // 开业时间
  openTime: string;
  // 认证结果，是否通过
  pass: boolean;
  // 业务ID
  disReqMsgId?: string;
  static names(): { [key: string]: string } {
    return {
      accId: 'acc_id',
      code: 'code',
      customerId: 'customer_id',
      did: 'did',
      enterpriseStatus: 'enterprise_status',
      openTime: 'open_time',
      pass: 'pass',
      disReqMsgId: 'dis_req_msg_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accId: 'string',
      code: 'string',
      customerId: 'string',
      did: 'string',
      enterpriseStatus: 'string',
      openTime: 'string',
      pass: 'boolean',
      disReqMsgId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 大安全内容安全接口返回值
export class HoloxCheckResult extends $tea.Model {
  // 是否成功
  sucess?: boolean;
  // 本次调用id
  id: string;
  // 场景码
  sceneCode: string;
  // 结果码
  resultCode?: string;
  // 错误码
  errorCode?: string;
  // 结果信息
  resultMessage?: string;
  // 213
  warnAction?: string;
  // 123
  contentPropertyOutputResultMap: string;
  // 213
  hitResultItems?: string;
  static names(): { [key: string]: string } {
    return {
      sucess: 'sucess',
      id: 'id',
      sceneCode: 'scene_code',
      resultCode: 'result_code',
      errorCode: 'error_code',
      resultMessage: 'result_message',
      warnAction: 'warn_action',
      contentPropertyOutputResultMap: 'content_property_output_result_map',
      hitResultItems: 'hit_result_items',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sucess: 'boolean',
      id: 'string',
      sceneCode: 'string',
      resultCode: 'string',
      errorCode: 'string',
      resultMessage: 'string',
      warnAction: 'string',
      contentPropertyOutputResultMap: 'string',
      hitResultItems: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 大安全接口参数
export class InfoSecContentQuery extends $tea.Model {
  // 123
  appScene?: string;
  // 123
  appSceneDataId?: string;
  // 123
  eventId?: string;
  static names(): { [key: string]: string } {
    return {
      appScene: 'app_scene',
      appSceneDataId: 'app_scene_data_id',
      eventId: 'event_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appScene: 'string',
      appSceneDataId: 'string',
      eventId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 大安全接口入参
export class RdsAnalyzeRequest extends $tea.Model {
  // 123
  appid: string;
  // 123
  bizNo?: string;
  // 213
  scene?: string;
  // 123
  token?: string;
  // 123
  data?: string;
  // 123
  extra?: string;
  static names(): { [key: string]: string } {
    return {
      appid: 'appid',
      bizNo: 'biz_no',
      scene: 'scene',
      token: 'token',
      data: 'data',
      extra: 'extra',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appid: 'string',
      bizNo: 'string',
      scene: 'string',
      token: 'string',
      data: 'string',
      extra: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 大安全接口入参
export class SecurityUniformRequest extends $tea.Model {
  // 123
  token: string;
  // 123
  bizId: string;
  // 132
  params: string;
  static names(): { [key: string]: string } {
    return {
      token: 'token',
      bizId: 'biz_id',
      params: 'params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      token: 'string',
      bizId: 'string',
      params: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 键值对，兼容map用
export class KeyValuePair extends $tea.Model {
  // key
  key: string;
  // value
  value?: string;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 大安全人机识别相应
export class RdslibAntcaptchaservice extends $tea.Model {
  // 是否请求成功
  success: boolean;
  // 相应信息
  message?: string;
  // 返回数据
  data?: string;
  static names(): { [key: string]: string } {
    return {
      success: 'success',
      message: 'message',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      success: 'boolean',
      message: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 大安全接口返回
export class SecurityUniformResponse extends $tea.Model {
  // 是否成功
  success: boolean;
  // 123
  code?: string;
  // 123
  message?: string;
  // 123
  token?: string;
  // 123
  bizId?: string;
  // 123
  data?: string;
  static names(): { [key: string]: string } {
    return {
      success: 'success',
      code: 'code',
      message: 'message',
      token: 'token',
      bizId: 'biz_id',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      success: 'boolean',
      code: 'string',
      message: 'string',
      token: 'string',
      bizId: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 大安全接口结构体
export class HoloxCheckEvent extends $tea.Model {
  // 是否成功
  sucess: boolean;
  // 123
  id: string;
  // 12
  appCode: string;
  // 123
  sceneCode: string;
  // 12
  productCode?: string;
  // 123
  channel: string;
  // 123
  appSceneDataId?: string;
  // 123
  accountType?: string;
  // 123
  userId: string;
  // 123
  recieverId: string;
  // 123
  publishDate: string;
  // 123
  isTest: boolean;
  // 123
  isLoadTest: boolean;
  // 123
  isFusing: boolean;
  // 123
  sceneType: string;
  // 123
  contentData: string;
  // 123
  eventData: string;
  static names(): { [key: string]: string } {
    return {
      sucess: 'sucess',
      id: 'id',
      appCode: 'app_code',
      sceneCode: 'scene_code',
      productCode: 'product_code',
      channel: 'channel',
      appSceneDataId: 'app_scene_data_id',
      accountType: 'account_type',
      userId: 'user_id',
      recieverId: 'reciever_id',
      publishDate: 'publish_date',
      isTest: 'is_test',
      isLoadTest: 'is_load_test',
      isFusing: 'is_fusing',
      sceneType: 'scene_type',
      contentData: 'content_data',
      eventData: 'event_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sucess: 'boolean',
      id: 'string',
      appCode: 'string',
      sceneCode: 'string',
      productCode: 'string',
      channel: 'string',
      appSceneDataId: 'string',
      accountType: 'string',
      userId: 'string',
      recieverId: 'string',
      publishDate: 'string',
      isTest: 'boolean',
      isLoadTest: 'boolean',
      isFusing: 'boolean',
      sceneType: 'string',
      contentData: 'string',
      eventData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 核身渲染结果
export class GwVerifyViewResult extends $tea.Model {
  // 核身上下文id
  verifyId: string;
  // 核审产品码，支持多种核身产品。 ZK_FACE_VERIFY：人脸识别
  productCode: string;
  // 核身分组
  group: string;
  // 返回结果
  responseParams: NameValuePair[];
  // 核身渲染是否调用成功
  success: boolean;
  // 返回码
  resultCode?: string;
  // 返回信息
  resultMsg?: string;
  static names(): { [key: string]: string } {
    return {
      verifyId: 'verify_id',
      productCode: 'product_code',
      group: 'group',
      responseParams: 'response_params',
      success: 'success',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      verifyId: 'string',
      productCode: 'string',
      group: 'string',
      responseParams: { 'type': 'array', 'itemType': NameValuePair },
      success: 'boolean',
      resultCode: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 核审场景
export class GwVerifyScene extends $tea.Model {
  // 调用方系统名
  systemName: string;
  // 业务方产品
  bizProduct: string;
  // 业务产品节点
  bizProdNode: string;
  // 业务接入渠道
  accessChannel: string;
  // 业务调用场景的语言版本、CHINESE("中文", "chi")、ENG("英文", "en")
  language: string;
  static names(): { [key: string]: string } {
    return {
      systemName: 'system_name',
      bizProduct: 'biz_product',
      bizProdNode: 'biz_prod_node',
      accessChannel: 'access_channel',
      language: 'language',
    };
  }

  static types(): { [key: string]: any } {
    return {
      systemName: 'string',
      bizProduct: 'string',
      bizProdNode: 'string',
      accessChannel: 'string',
      language: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitAntchainBbpVerifyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 接入场景（主要由接入系统、接入产品、产品节点三部分组成）
  verifyScene: GwVerifyScene;
  // 调用方传入，唯一标识一笔业务，核身平台将bizId与核身token进行绑定，用作防串改校验
  bizId: string;
  // 调用方传入，存放业务扩展参数（callback参数也写入此）
  externParams?: NameValuePair[];
  // 调用方传入，指定核身完成后的回调类型
  callbackEnum?: string;
  // 核身产品列表
  validateFlows: GwValidateProduct[];
  // 核身id
  verifyId?: string;
  // 核身请求地址url
  verifyUrl?: string;
  // 核身处理状态:INITIAL、PROCESSING、SUCCESS、EXPIRED、FAIL
  verifyStatus?: string;
  // 可用产品集合
  validProd?: GwValidateProduct[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      verifyScene: 'verify_scene',
      bizId: 'biz_id',
      externParams: 'extern_params',
      callbackEnum: 'callback_enum',
      validateFlows: 'validate_flows',
      verifyId: 'verify_id',
      verifyUrl: 'verify_url',
      verifyStatus: 'verify_status',
      validProd: 'valid_prod',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      verifyScene: GwVerifyScene,
      bizId: 'string',
      externParams: { 'type': 'array', 'itemType': NameValuePair },
      callbackEnum: 'string',
      validateFlows: { 'type': 'array', 'itemType': GwValidateProduct },
      verifyId: 'string',
      verifyUrl: 'string',
      verifyStatus: 'string',
      validProd: { 'type': 'array', 'itemType': GwValidateProduct },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitAntchainBbpVerifyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 核身id
  verifyId?: string;
  // 核身请求地址url
  verifyUrl?: string;
  // 核身处理状态:INITIAL、PROCESSING、SUCCESS、EXPIRED、FAIL
  verifyStatus?: string;
  // 可用产品集合
  validProd?: GwValidateProduct[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      verifyId: 'verify_id',
      verifyUrl: 'verify_url',
      verifyStatus: 'verify_status',
      validProd: 'valid_prod',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      verifyId: 'string',
      verifyUrl: 'string',
      verifyStatus: 'string',
      validProd: { 'type': 'array', 'itemType': GwValidateProduct },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartAntchainBbpVerifyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 核身上下文id
  verifyId: string;
  // 核身模块分组
  group: string;
  // 核身动作：view-渲染，verify-校验，repeat-重新发送
  productAction: string;
  // 业务id
  bizId: string;
  // 核身渲染结果
  result?: GwVerifyViewResult[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      verifyId: 'verify_id',
      group: 'group',
      productAction: 'product_action',
      bizId: 'biz_id',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      verifyId: 'string',
      group: 'string',
      productAction: 'string',
      bizId: 'string',
      result: { 'type': 'array', 'itemType': GwVerifyViewResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartAntchainBbpVerifyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 核身渲染结果
  result?: GwVerifyViewResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: { 'type': 'array', 'itemType': GwVerifyViewResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckAntchainBbpVerifyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 核身上下文id
  verifyId: string;
  // 核身模块分组
  group: string;
  // 核身动作：view-渲染，verify-校验，repeat-重新发送
  productAction: string;
  // 业务id
  bizId: string;
  // 核身产品码
  productCode: string;
  // 核身结果枚举：PASS-核身成功，INITIAL-初始化，PROCESS-处理中，FAIL-失败
  status?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      verifyId: 'verify_id',
      group: 'group',
      productAction: 'product_action',
      bizId: 'biz_id',
      productCode: 'product_code',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      verifyId: 'string',
      group: 'string',
      productAction: 'string',
      bizId: 'string',
      productCode: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckAntchainBbpVerifyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 核身结果枚举：PASS-核身成功，INITIAL-初始化，PROCESS-处理中，FAIL-失败
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RunAntchainSaasMarketServiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务方传入，幂等用。
  bizId: string;
  // saas产品code
  productCode: string;
  // 服务code
  serviceCode: string;
  // 子服务code
  subServiceCode?: string;
  // 服务版本
  serviceVersion: string;
  // 业务参数，map格式
  params?: KeyValuePair[];
  // 服务调用结果
  resultData?: KeyValuePair[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      productCode: 'product_code',
      serviceCode: 'service_code',
      subServiceCode: 'sub_service_code',
      serviceVersion: 'service_version',
      params: 'params',
      resultData: 'result_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      productCode: 'string',
      serviceCode: 'string',
      subServiceCode: 'string',
      serviceVersion: 'string',
      params: { 'type': 'array', 'itemType': KeyValuePair },
      resultData: { 'type': 'array', 'itemType': KeyValuePair },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RunAntchainSaasMarketServiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 服务调用结果
  resultData?: KeyValuePair[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultData: 'result_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultData: { 'type': 'array', 'itemType': KeyValuePair },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainSaasMarketSolutionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 解决方案code
  solutionCode: string;
  // 查询结果
  resultData?: KeyValuePair[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      solutionCode: 'solution_code',
      resultData: 'result_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      solutionCode: 'string',
      resultData: { 'type': 'array', 'itemType': KeyValuePair },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainSaasMarketSolutionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询结果
  resultData?: KeyValuePair[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultData: 'result_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultData: { 'type': 'array', 'itemType': KeyValuePair },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyAntchainBbpMetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 预留业务code
  bizCode?: string;
  // 企业名称
  epCertName: string;
  // 企业证件号码
  epCertNo: string;
  // 企业证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
  epCertNoType: string;
  // 法人姓名
  legalPersonCertName?: string;
  // 法人证件号码
  legalPersonCertNo?: string;
  // 法人证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
  legalPersonCertNoType?: string;
  // 系统名称
  ownerName?: string;
  // 系统租户ID
  ownerUid?: string;
  // 业务唯一ID
  bizId: string;
  // 业务渠道，需提前申请产品码
  channel: string;
  // 认证类型：ENTERPRISE-企业, PERSON-个人
  certifyEnum: string;
  // 客户支付宝ID
  alipayUid?: string;
  // 个人姓名，用于个人认证
  personName?: string;
  // 个人证件号码
  personCertNo?: string;
  // 个人证件类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
  personCertType?: string;
  // 扩展信息
  extensionInfo?: NameValuePair;
  // 要素认证结果
  result?: CustomerAuthResult;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizCode: 'biz_code',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
      epCertNoType: 'ep_cert_no_type',
      legalPersonCertName: 'legal_person_cert_name',
      legalPersonCertNo: 'legal_person_cert_no',
      legalPersonCertNoType: 'legal_person_cert_no_type',
      ownerName: 'owner_name',
      ownerUid: 'owner_uid',
      bizId: 'biz_id',
      channel: 'channel',
      certifyEnum: 'certify_enum',
      alipayUid: 'alipay_uid',
      personName: 'person_name',
      personCertNo: 'person_cert_no',
      personCertType: 'person_cert_type',
      extensionInfo: 'extension_info',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizCode: 'string',
      epCertName: 'string',
      epCertNo: 'string',
      epCertNoType: 'string',
      legalPersonCertName: 'string',
      legalPersonCertNo: 'string',
      legalPersonCertNoType: 'string',
      ownerName: 'string',
      ownerUid: 'string',
      bizId: 'string',
      channel: 'string',
      certifyEnum: 'string',
      alipayUid: 'string',
      personName: 'string',
      personCertNo: 'string',
      personCertType: 'string',
      extensionInfo: NameValuePair,
      result: CustomerAuthResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyAntchainBbpMetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 要素认证结果
  result?: CustomerAuthResult;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: CustomerAuthResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindDemoDemoCheckEeeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindDemoDemoCheckEeeResponse extends $tea.Model {
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

export class CheckSaasSecurityInfosecHoloxcontentcheckserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 123
  holoxCheckEvent?: HoloxCheckEvent;
  // 123
  serviceVersion: string;
  // 大安全风控接口返回结果
  data?: HoloxCheckResult;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      holoxCheckEvent: 'holox_check_event',
      serviceVersion: 'service_version',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      holoxCheckEvent: HoloxCheckEvent,
      serviceVersion: 'string',
      data: HoloxCheckResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckSaasSecurityInfosecHoloxcontentcheckserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 大安全风控接口返回结果
  data?: HoloxCheckResult;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: HoloxCheckResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 123
  securityUniformRequest: SecurityUniformRequest;
  // 123
  serviceVersion: string;
  // 返回结果
  data?: SecurityUniformResponse;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      securityUniformRequest: 'security_uniform_request',
      serviceVersion: 'service_version',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      securityUniformRequest: SecurityUniformRequest,
      serviceVersion: 'string',
      data: SecurityUniformResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  data?: SecurityUniformResponse;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: SecurityUniformResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckSaasSecurityRdsRdsserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 123
  rdsServiceCheckRequest: string;
  // 服务版本
  serviceVersion: string;
  // 是否是机器
  data?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      rdsServiceCheckRequest: 'rds_service_check_request',
      serviceVersion: 'service_version',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      rdsServiceCheckRequest: 'string',
      serviceVersion: 'string',
      data: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckSaasSecurityRdsRdsserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否是机器
  data?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 123
  infosecContentQuery: InfoSecContentQuery;
  // 123
  serviceVersion: string;
  // 返回回调结果
  data?: InfoSecContentQueryResult;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      infosecContentQuery: 'infosec_content_query',
      serviceVersion: 'service_version',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      infosecContentQuery: InfoSecContentQuery,
      serviceVersion: 'string',
      data: InfoSecContentQueryResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回回调结果
  data?: InfoSecContentQueryResult;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: InfoSecContentQueryResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifySaasSecurityRdslibAntcaptchaserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 123
  rdsAnalyzeRequest: RdsAnalyzeRequest;
  // 服务版本
  serviceVersion: string;
  // 是否是机器人
  data?: RdslibAntcaptchaservice;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      rdsAnalyzeRequest: 'rds_analyze_request',
      serviceVersion: 'service_version',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      rdsAnalyzeRequest: RdsAnalyzeRequest,
      serviceVersion: 'string',
      data: RdslibAntcaptchaservice,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifySaasSecurityRdslibAntcaptchaserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否是机器人
  data?: RdslibAntcaptchaservice;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: RdslibAntcaptchaservice,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySaasSecurityTscenterUmidqueryserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户token id
  tokenId: string;
  // 服务版本
  serviceVersion: string;
  // 返回的umid
  data?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tokenId: 'token_id',
      serviceVersion: 'service_version',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tokenId: 'string',
      serviceVersion: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySaasSecurityTscenterUmidqueryserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回的umid
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySaasSecurityInfosecOpencheckservicequeryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询参数
  event: string;
  // 服务版本
  serviceVersion: string;
  // 大安全内容检测接口返回结果
  data?: ContentQueryResultModel;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      event: 'event',
      serviceVersion: 'service_version',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      event: 'string',
      serviceVersion: 'string',
      data: ContentQueryResultModel,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySaasSecurityInfosecOpencheckservicequeryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 大安全内容检测接口返回结果
  data?: ContentQueryResultModel;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: ContentQueryResultModel,
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
          sdk_version: "1.0.2",
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
   * Description: 核身初始化接口
   * Summary: 核身初始化接口
   */
  async initAntchainBbpVerify(request: InitAntchainBbpVerifyRequest): Promise<InitAntchainBbpVerifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initAntchainBbpVerifyEx(request, headers, runtime);
  }

  /**
   * Description: 核身初始化接口
   * Summary: 核身初始化接口
   */
  async initAntchainBbpVerifyEx(request: InitAntchainBbpVerifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitAntchainBbpVerifyResponse> {
    Util.validateModel(request);
    return $tea.cast<InitAntchainBbpVerifyResponse>(await this.doRequest("1.0", "antchain.bbp.verify.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitAntchainBbpVerifyResponse({}));
  }

  /**
   * Description: 核身产品渲染接口
   * Summary: 核身产品渲染接口
   */
  async startAntchainBbpVerify(request: StartAntchainBbpVerifyRequest): Promise<StartAntchainBbpVerifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startAntchainBbpVerifyEx(request, headers, runtime);
  }

  /**
   * Description: 核身产品渲染接口
   * Summary: 核身产品渲染接口
   */
  async startAntchainBbpVerifyEx(request: StartAntchainBbpVerifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartAntchainBbpVerifyResponse> {
    Util.validateModel(request);
    return $tea.cast<StartAntchainBbpVerifyResponse>(await this.doRequest("1.0", "antchain.bbp.verify.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartAntchainBbpVerifyResponse({}));
  }

  /**
   * Description: 核身结果查询
   * Summary: 核身结果查询
   */
  async checkAntchainBbpVerify(request: CheckAntchainBbpVerifyRequest): Promise<CheckAntchainBbpVerifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkAntchainBbpVerifyEx(request, headers, runtime);
  }

  /**
   * Description: 核身结果查询
   * Summary: 核身结果查询
   */
  async checkAntchainBbpVerifyEx(request: CheckAntchainBbpVerifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckAntchainBbpVerifyResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckAntchainBbpVerifyResponse>(await this.doRequest("1.0", "antchain.bbp.verify.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckAntchainBbpVerifyResponse({}));
  }

  /**
   * Description: SaaS服务调用
   * Summary: SaaS服务调用
   */
  async runAntchainSaasMarketService(request: RunAntchainSaasMarketServiceRequest): Promise<RunAntchainSaasMarketServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.runAntchainSaasMarketServiceEx(request, headers, runtime);
  }

  /**
   * Description: SaaS服务调用
   * Summary: SaaS服务调用
   */
  async runAntchainSaasMarketServiceEx(request: RunAntchainSaasMarketServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RunAntchainSaasMarketServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<RunAntchainSaasMarketServiceResponse>(await this.doRequest("1.0", "antchain.saas.market.service.run", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RunAntchainSaasMarketServiceResponse({}));
  }

  /**
   * Description: 查询解决方案，包括能力列表
   * Summary: 查询解决方案，包括能力列表
   */
  async queryAntchainSaasMarketSolution(request: QueryAntchainSaasMarketSolutionRequest): Promise<QueryAntchainSaasMarketSolutionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainSaasMarketSolutionEx(request, headers, runtime);
  }

  /**
   * Description: 查询解决方案，包括能力列表
   * Summary: 查询解决方案，包括能力列表
   */
  async queryAntchainSaasMarketSolutionEx(request: QueryAntchainSaasMarketSolutionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainSaasMarketSolutionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainSaasMarketSolutionResponse>(await this.doRequest("1.0", "antchain.saas.market.solution.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainSaasMarketSolutionResponse({}));
  }

  /**
   * Description: 对企业身份进行认证
   * Summary: 企业四要素认证
   */
  async verifyAntchainBbpMeta(request: VerifyAntchainBbpMetaRequest): Promise<VerifyAntchainBbpMetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyAntchainBbpMetaEx(request, headers, runtime);
  }

  /**
   * Description: 对企业身份进行认证
   * Summary: 企业四要素认证
   */
  async verifyAntchainBbpMetaEx(request: VerifyAntchainBbpMetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyAntchainBbpMetaResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyAntchainBbpMetaResponse>(await this.doRequest("1.0", "antchain.bbp.meta.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyAntchainBbpMetaResponse({}));
  }

  /**
   * Description: s
   * Summary: ss
   */
  async bindDemoDemoCheckEee(request: BindDemoDemoCheckEeeRequest): Promise<BindDemoDemoCheckEeeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindDemoDemoCheckEeeEx(request, headers, runtime);
  }

  /**
   * Description: s
   * Summary: ss
   */
  async bindDemoDemoCheckEeeEx(request: BindDemoDemoCheckEeeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindDemoDemoCheckEeeResponse> {
    Util.validateModel(request);
    return $tea.cast<BindDemoDemoCheckEeeResponse>(await this.doRequest("1.0", "demo.demo.check.eee.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindDemoDemoCheckEeeResponse({}));
  }

  /**
   * Description: 大安全接口
   * Summary: 大安全接口
   */
  async checkSaasSecurityInfosecHoloxcontentcheckservice(request: CheckSaasSecurityInfosecHoloxcontentcheckserviceRequest): Promise<CheckSaasSecurityInfosecHoloxcontentcheckserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkSaasSecurityInfosecHoloxcontentcheckserviceEx(request, headers, runtime);
  }

  /**
   * Description: 大安全接口
   * Summary: 大安全接口
   */
  async checkSaasSecurityInfosecHoloxcontentcheckserviceEx(request: CheckSaasSecurityInfosecHoloxcontentcheckserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckSaasSecurityInfosecHoloxcontentcheckserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckSaasSecurityInfosecHoloxcontentcheckserviceResponse>(await this.doRequest("1.0", "saas.security.infosec.holoxcontentcheckservice.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckSaasSecurityInfosecHoloxcontentcheckserviceResponse({}));
  }

  /**
   * Description: 大安全接口
   * Summary: 大安全接口
   */
  async querySaasSecuritySecuritycoreSecurityuniformservice(request: QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest): Promise<QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySaasSecuritySecuritycoreSecurityuniformserviceEx(request, headers, runtime);
  }

  /**
   * Description: 大安全接口
   * Summary: 大安全接口
   */
  async querySaasSecuritySecuritycoreSecurityuniformserviceEx(request: QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse>(await this.doRequest("1.0", "saas.security.securitycore.securityuniformservice.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse({}));
  }

  /**
   * Description: 大安全接口
   * Summary: 大安全接口
   */
  async checkSaasSecurityRdsRdsservice(request: CheckSaasSecurityRdsRdsserviceRequest): Promise<CheckSaasSecurityRdsRdsserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkSaasSecurityRdsRdsserviceEx(request, headers, runtime);
  }

  /**
   * Description: 大安全接口
   * Summary: 大安全接口
   */
  async checkSaasSecurityRdsRdsserviceEx(request: CheckSaasSecurityRdsRdsserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckSaasSecurityRdsRdsserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckSaasSecurityRdsRdsserviceResponse>(await this.doRequest("1.0", "saas.security.rds.rdsservice.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckSaasSecurityRdsRdsserviceResponse({}));
  }

  /**
   * Description: 123
   * Summary: 大安全接口
   */
  async querySaasSecurityInfosecHoloxcontentcheckqueryservice(request: QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceRequest): Promise<QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySaasSecurityInfosecHoloxcontentcheckqueryserviceEx(request, headers, runtime);
  }

  /**
   * Description: 123
   * Summary: 大安全接口
   */
  async querySaasSecurityInfosecHoloxcontentcheckqueryserviceEx(request: QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceResponse>(await this.doRequest("1.0", "saas.security.infosec.holoxcontentcheckqueryservice.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceResponse({}));
  }

  /**
   * Description: 大安全接口
   * Summary: 大安全接口
   */
  async verifySaasSecurityRdslibAntcaptchaservice(request: VerifySaasSecurityRdslibAntcaptchaserviceRequest): Promise<VerifySaasSecurityRdslibAntcaptchaserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifySaasSecurityRdslibAntcaptchaserviceEx(request, headers, runtime);
  }

  /**
   * Description: 大安全接口
   * Summary: 大安全接口
   */
  async verifySaasSecurityRdslibAntcaptchaserviceEx(request: VerifySaasSecurityRdslibAntcaptchaserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifySaasSecurityRdslibAntcaptchaserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifySaasSecurityRdslibAntcaptchaserviceResponse>(await this.doRequest("1.0", "saas.security.rdslib.antcaptchaservice.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifySaasSecurityRdslibAntcaptchaserviceResponse({}));
  }

  /**
   * Description: 大安全接口
   * Summary: 大安全接口
   */
  async querySaasSecurityTscenterUmidqueryservice(request: QuerySaasSecurityTscenterUmidqueryserviceRequest): Promise<QuerySaasSecurityTscenterUmidqueryserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySaasSecurityTscenterUmidqueryserviceEx(request, headers, runtime);
  }

  /**
   * Description: 大安全接口
   * Summary: 大安全接口
   */
  async querySaasSecurityTscenterUmidqueryserviceEx(request: QuerySaasSecurityTscenterUmidqueryserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySaasSecurityTscenterUmidqueryserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySaasSecurityTscenterUmidqueryserviceResponse>(await this.doRequest("1.0", "saas.security.tscenter.umidqueryservice.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySaasSecurityTscenterUmidqueryserviceResponse({}));
  }

  /**
   * Description: 大安全内容检测结果查询接口
   * Summary: 大安全内容检测结果查询接口
   */
  async querySaasSecurityInfosecOpencheckservicequery(request: QuerySaasSecurityInfosecOpencheckservicequeryRequest): Promise<QuerySaasSecurityInfosecOpencheckservicequeryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySaasSecurityInfosecOpencheckservicequeryEx(request, headers, runtime);
  }

  /**
   * Description: 大安全内容检测结果查询接口
   * Summary: 大安全内容检测结果查询接口
   */
  async querySaasSecurityInfosecOpencheckservicequeryEx(request: QuerySaasSecurityInfosecOpencheckservicequeryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySaasSecurityInfosecOpencheckservicequeryResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySaasSecurityInfosecOpencheckservicequeryResponse>(await this.doRequest("1.0", "saas.security.infosec.opencheckservicequery.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySaasSecurityInfosecOpencheckservicequeryResponse({}));
  }

}
