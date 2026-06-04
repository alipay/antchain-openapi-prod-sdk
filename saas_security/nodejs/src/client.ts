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

// 大安全结构体
export class ContentAddress extends $tea.Model {
  // 123
  isDjangoUrl?: boolean;
  // 213
  address?: string;
  // 123
  httpUrl?: string;
  // 123
  audioType?: string;
  static names(): { [key: string]: string } {
    return {
      isDjangoUrl: 'is_django_url',
      address: 'address',
      httpUrl: 'http_url',
      audioType: 'audio_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      isDjangoUrl: 'boolean',
      address: 'string',
      httpUrl: 'string',
      audioType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 内容检测接口返回值
export class SecurityRiskContentAnalyzeResponse extends $tea.Model {
  // 场景id
  appSceneDataId?: string;
  // 返回事件码，用于异步查询
  eventId?: string;
  // 是否需要异步查询
  needQuery?: string;
  // 返回结果
  resultAction?: string;
  // 命中场景
  hitDetectItems?: InfoSecHitDetectItem[];
  // 描述被命中的风险标签
  riskLabels: string;
  static names(): { [key: string]: string } {
    return {
      appSceneDataId: 'app_scene_data_id',
      eventId: 'event_id',
      needQuery: 'need_query',
      resultAction: 'result_action',
      hitDetectItems: 'hit_detect_items',
      riskLabels: 'risk_labels',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appSceneDataId: 'string',
      eventId: 'string',
      needQuery: 'string',
      resultAction: 'string',
      hitDetectItems: { 'type': 'array', 'itemType': InfoSecHitDetectItem },
      riskLabels: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 大安全结构体
export class ContentProperty extends $tea.Model {
  // 123
  text?: string;
  // 213
  textList?: string[];
  // 123
  urls?: string[];
  // 123
  pictures?: ContentAddress[];
  // 123
  videos?: ContentAddress[];
  // 123
  audios?: ContentAddress[];
  static names(): { [key: string]: string } {
    return {
      text: 'text',
      textList: 'text_list',
      urls: 'urls',
      pictures: 'pictures',
      videos: 'videos',
      audios: 'audios',
    };
  }

  static types(): { [key: string]: any } {
    return {
      text: 'string',
      textList: { 'type': 'array', 'itemType': 'string' },
      urls: { 'type': 'array', 'itemType': 'string' },
      pictures: { 'type': 'array', 'itemType': ContentAddress },
      videos: { 'type': 'array', 'itemType': ContentAddress },
      audios: { 'type': 'array', 'itemType': ContentAddress },
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

// 键值对
export class KeyContentPropertyPair extends $tea.Model {
  // 123
  key: string;
  // 123
  value: ContentProperty;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: ContentProperty,
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

// 大安全接口返回值
export class RdsAnalyzeResponse extends $tea.Model {
  // 请求是否成功
  success: boolean;
  // 返回信息
  message: string;
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

// 大安全内容检测接口返回参数
export class ResultModel extends $tea.Model {
  // 返回结果
  code?: number;
  // 返回错误信息
  errMsg?: string;
  // 返回具体结果
  model?: SecurityRiskContentAnalyzeResponse;
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
      model: SecurityRiskContentAnalyzeResponse,
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

// 键值对
export class KeyValuePair extends $tea.Model {
  // 23
  key?: string;
  // 123
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

export class CheckInfosecHoloxcontentcheckserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 123
  holoxCheckEvent?: HoloxCheckEvent;
  // 123
  serviceVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      holoxCheckEvent: 'holox_check_event',
      serviceVersion: 'service_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      holoxCheckEvent: HoloxCheckEvent,
      serviceVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckInfosecHoloxcontentcheckserviceResponse extends $tea.Model {
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

export class QuerySecuritycoreSecurityuniformserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 123
  securityUniformRequest: SecurityUniformRequest;
  // 123
  serviceVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      securityUniformRequest: 'security_uniform_request',
      serviceVersion: 'service_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      securityUniformRequest: SecurityUniformRequest,
      serviceVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySecuritycoreSecurityuniformserviceResponse extends $tea.Model {
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

export class CheckRdsRdsserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 123
  rdsServiceCheckRequest: string;
  // 服务版本
  serviceVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      rdsServiceCheckRequest: 'rds_service_check_request',
      serviceVersion: 'service_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      rdsServiceCheckRequest: 'string',
      serviceVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckRdsRdsserviceResponse extends $tea.Model {
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

export class QueryInfosecHoloxcontentcheckqueryserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 123
  infosecContentQuery: InfoSecContentQuery;
  // 123
  serviceVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      infosecContentQuery: 'infosec_content_query',
      serviceVersion: 'service_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      infosecContentQuery: InfoSecContentQuery,
      serviceVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInfosecHoloxcontentcheckqueryserviceResponse extends $tea.Model {
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

export class VerifyRdslibAntcaptchaserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 123
  rdsAnalyzeRequest: RdsAnalyzeRequest;
  // 服务版本
  serviceVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      rdsAnalyzeRequest: 'rds_analyze_request',
      serviceVersion: 'service_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      rdsAnalyzeRequest: RdsAnalyzeRequest,
      serviceVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyRdslibAntcaptchaserviceResponse extends $tea.Model {
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

export class QueryTscenterUmidqueryserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户token id
  tokenId: string;
  // 服务版本
  serviceVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tokenId: 'token_id',
      serviceVersion: 'service_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tokenId: 'string',
      serviceVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTscenterUmidqueryserviceResponse extends $tea.Model {
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

export class CheckInfosecOpencheckservicecheckRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 以json格式输入想要检测的内容
  content: string;
  // 服务版本
  serviceVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      content: 'content',
      serviceVersion: 'service_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      content: 'string',
      serviceVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckInfosecOpencheckservicecheckResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 大安全内容检测接口返回参数
  data?: ResultModel;
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
      data: ResultModel,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInfosecOpencheckservicequeryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询参数
  event: string;
  // 服务版本
  serviceVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      event: 'event',
      serviceVersion: 'service_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      event: 'string',
      serviceVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInfosecOpencheckservicequeryResponse extends $tea.Model {
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

export class QueryDemoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 测试数据
  data: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDemoResponse extends $tea.Model {
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

export class QueryGuardAskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 会话ID，用于匹配多轮对话上下文
  sessionId: string;
  // 数据唯一标识，能够根据该值定位到该条数据
  requestId: string;
  // 大模型提问护栏服务, 用于区分提供的服务类别，当前支持：TJ_QUESTION_BASIC、TJ_ANSWER_BASIC 两种
  serviceName: string;
  // 当前提问内容，最大长度10000个字符。
  question: string;
  // 用户ID，用于主体风险判断，如果是2088开头的阿里体系用户，请传入2088开头的用户ID
  userId: string;
  // 提问内容类型，纯文本: PLAINTEXT，图片url: PICTURE_URL
  questionFormat?: string;
  // 大模型ID，表示大模型版本
  modelCode?: string;
  // 扩展属性Map，key限定为：aigcType、serviceScene、triggerSource、bizOwner，对应的value取值为： aigcType： ● 文生文：text_text ● 文生图：text_pic ● 图生文：pic_text ● 图生图：pic_pic serviceScene: 根据业务使用的不同情况支持自定义入参做策略个性化配置，私域或者公域，以及不同的业务应用 比如领域： serviceScene = insurance 表示保险 serviceScene = medical 表示医疗 serviceScene = government 表示政务 比如业务活动应用： serviceScene = xiacu 表示夏促 serviceScene = qixi 表示七夕 triggerSource: 不同的来源，比如移动端、web端、API
  businessProperties?: KeyValuePair;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sessionId: 'session_id',
      requestId: 'request_id',
      serviceName: 'service_name',
      question: 'question',
      userId: 'user_id',
      questionFormat: 'question_format',
      modelCode: 'model_code',
      businessProperties: 'business_properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sessionId: 'string',
      requestId: 'string',
      serviceName: 'string',
      question: 'string',
      userId: 'string',
      questionFormat: 'string',
      modelCode: 'string',
      businessProperties: KeyValuePair,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGuardAskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 检测数据ID
  requestId?: string;
  // 是否安全无风险，true: 安全无风险，false: 有风险
  safe?: boolean;
  // 安全动作，拦截: BLOCK，安全代答: SECURITY_ANSWER，红色GPT安全代答: REDGPT_ANSWER，安全提示增强: SECURITY_PROMPT
  actionCode?: string;
  // 安全动作相关文案
  actionMsg?: string;
  // 会话动作，终止会话: END_SESSION，撤回提问: RECALL_QUERY
  sessionAction?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
      safe: 'safe',
      actionCode: 'action_code',
      actionMsg: 'action_msg',
      sessionAction: 'session_action',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
      safe: 'boolean',
      actionCode: 'string',
      actionMsg: 'string',
      sessionAction: 'string',
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
    if (Util.isUnset(config)) {
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
      keepAliveDuration: this._keepAliveDurationMillis,
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
          sdk_version: "1.0.28",
          _prod_code: "SAAS_SECURITY",
          _prod_channel: "undefined",
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
   * Description: 大安全接口
   * Summary: 大安全接口
   */
  async checkInfosecHoloxcontentcheckservice(request: CheckInfosecHoloxcontentcheckserviceRequest): Promise<CheckInfosecHoloxcontentcheckserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkInfosecHoloxcontentcheckserviceEx(request, headers, runtime);
  }

  /**
   * Description: 大安全接口
   * Summary: 大安全接口
   */
  async checkInfosecHoloxcontentcheckserviceEx(request: CheckInfosecHoloxcontentcheckserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckInfosecHoloxcontentcheckserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckInfosecHoloxcontentcheckserviceResponse>(await this.doRequest("1.0", "saas.security.infosec.holoxcontentcheckservice.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckInfosecHoloxcontentcheckserviceResponse({}));
  }

  /**
   * Description: 大安全接口
   * Summary: 大安全接口
   */
  async querySecuritycoreSecurityuniformservice(request: QuerySecuritycoreSecurityuniformserviceRequest): Promise<QuerySecuritycoreSecurityuniformserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySecuritycoreSecurityuniformserviceEx(request, headers, runtime);
  }

  /**
   * Description: 大安全接口
   * Summary: 大安全接口
   */
  async querySecuritycoreSecurityuniformserviceEx(request: QuerySecuritycoreSecurityuniformserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySecuritycoreSecurityuniformserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySecuritycoreSecurityuniformserviceResponse>(await this.doRequest("1.0", "saas.security.securitycore.securityuniformservice.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySecuritycoreSecurityuniformserviceResponse({}));
  }

  /**
   * Description: 大安全接口
   * Summary: 大安全接口
   */
  async checkRdsRdsservice(request: CheckRdsRdsserviceRequest): Promise<CheckRdsRdsserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkRdsRdsserviceEx(request, headers, runtime);
  }

  /**
   * Description: 大安全接口
   * Summary: 大安全接口
   */
  async checkRdsRdsserviceEx(request: CheckRdsRdsserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckRdsRdsserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckRdsRdsserviceResponse>(await this.doRequest("1.0", "saas.security.rds.rdsservice.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckRdsRdsserviceResponse({}));
  }

  /**
   * Description: 123
   * Summary: 大安全内容风控接口
   */
  async queryInfosecHoloxcontentcheckqueryservice(request: QueryInfosecHoloxcontentcheckqueryserviceRequest): Promise<QueryInfosecHoloxcontentcheckqueryserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInfosecHoloxcontentcheckqueryserviceEx(request, headers, runtime);
  }

  /**
   * Description: 123
   * Summary: 大安全内容风控接口
   */
  async queryInfosecHoloxcontentcheckqueryserviceEx(request: QueryInfosecHoloxcontentcheckqueryserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInfosecHoloxcontentcheckqueryserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInfosecHoloxcontentcheckqueryserviceResponse>(await this.doRequest("1.0", "saas.security.infosec.holoxcontentcheckqueryservice.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInfosecHoloxcontentcheckqueryserviceResponse({}));
  }

  /**
   * Description: 大安全接口
   * Summary: 大安全接口
   */
  async verifyRdslibAntcaptchaservice(request: VerifyRdslibAntcaptchaserviceRequest): Promise<VerifyRdslibAntcaptchaserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyRdslibAntcaptchaserviceEx(request, headers, runtime);
  }

  /**
   * Description: 大安全接口
   * Summary: 大安全接口
   */
  async verifyRdslibAntcaptchaserviceEx(request: VerifyRdslibAntcaptchaserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyRdslibAntcaptchaserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyRdslibAntcaptchaserviceResponse>(await this.doRequest("1.0", "saas.security.rdslib.antcaptchaservice.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyRdslibAntcaptchaserviceResponse({}));
  }

  /**
   * Description: 大安全接口
   * Summary: 大安全接口
   */
  async queryTscenterUmidqueryservice(request: QueryTscenterUmidqueryserviceRequest): Promise<QueryTscenterUmidqueryserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTscenterUmidqueryserviceEx(request, headers, runtime);
  }

  /**
   * Description: 大安全接口
   * Summary: 大安全接口
   */
  async queryTscenterUmidqueryserviceEx(request: QueryTscenterUmidqueryserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTscenterUmidqueryserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTscenterUmidqueryserviceResponse>(await this.doRequest("1.0", "saas.security.tscenter.umidqueryservice.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTscenterUmidqueryserviceResponse({}));
  }

  /**
   * Description: 大安全检验内容安全接口
   * Summary: 大安全检验内容安全接口
   */
  async checkInfosecOpencheckservicecheck(request: CheckInfosecOpencheckservicecheckRequest): Promise<CheckInfosecOpencheckservicecheckResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkInfosecOpencheckservicecheckEx(request, headers, runtime);
  }

  /**
   * Description: 大安全检验内容安全接口
   * Summary: 大安全检验内容安全接口
   */
  async checkInfosecOpencheckservicecheckEx(request: CheckInfosecOpencheckservicecheckRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckInfosecOpencheckservicecheckResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckInfosecOpencheckservicecheckResponse>(await this.doRequest("1.0", "saas.security.infosec.opencheckservicecheck.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckInfosecOpencheckservicecheckResponse({}));
  }

  /**
   * Description: 大安全内容检测结果查询接口
   * Summary: 大安全内容检测结果查询接口
   */
  async queryInfosecOpencheckservicequery(request: QueryInfosecOpencheckservicequeryRequest): Promise<QueryInfosecOpencheckservicequeryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInfosecOpencheckservicequeryEx(request, headers, runtime);
  }

  /**
   * Description: 大安全内容检测结果查询接口
   * Summary: 大安全内容检测结果查询接口
   */
  async queryInfosecOpencheckservicequeryEx(request: QueryInfosecOpencheckservicequeryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInfosecOpencheckservicequeryResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInfosecOpencheckservicequeryResponse>(await this.doRequest("1.0", "saas.security.infosec.opencheckservicequery.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInfosecOpencheckservicequeryResponse({}));
  }

  /**
   * Description: 测试接口
   * Summary: 测试接口
   */
  async queryDemo(request: QueryDemoRequest): Promise<QueryDemoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDemoEx(request, headers, runtime);
  }

  /**
   * Description: 测试接口
   * Summary: 测试接口
   */
  async queryDemoEx(request: QueryDemoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDemoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDemoResponse>(await this.doRequest("1.0", "saas.security.demo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDemoResponse({}));
  }

  /**
   * Description: 天鉴ask接口
   * Summary: 天鉴ask接口
   */
  async queryGuardAsk(request: QueryGuardAskRequest): Promise<QueryGuardAskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGuardAskEx(request, headers, runtime);
  }

  /**
   * Description: 天鉴ask接口
   * Summary: 天鉴ask接口
   */
  async queryGuardAskEx(request: QueryGuardAskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGuardAskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGuardAskResponse>(await this.doRequest("1.0", "saas.security.guard.ask.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGuardAskResponse({}));
  }

}
