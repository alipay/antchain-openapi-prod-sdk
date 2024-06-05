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

// ekyt响应头
export class ResponseHead extends $tea.Model {
  // 请求唯一标识
  requestId: string;
  static names(): { [key: string]: string } {
    return {
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// eKYT请求头
export class RequestHead extends $tea.Model {
  // 请求唯一标识
  requestId: string;
  // 客户身份标识ID
  secretId: string;
  // 客户签约产品code
  productCode: string;
  // response输出类型，默认json
  formatType?: string;
  // false
  onlineFlag?: boolean;
  static names(): { [key: string]: string } {
    return {
      requestId: 'request_id',
      secretId: 'secret_id',
      productCode: 'product_code',
      formatType: 'format_type',
      onlineFlag: 'online_flag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
      secretId: 'string',
      productCode: 'string',
      formatType: 'string',
      onlineFlag: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据上链成功结果数据
export class DeviceCollectResult extends $tea.Model {
  // 上链数据采集ID
  collectId: string;
  // 上链id
  antchainId?: string;
  static names(): { [key: string]: string } {
    return {
      collectId: 'collect_id',
      antchainId: 'antchain_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      collectId: 'string',
      antchainId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// eKYT业务响应结果
export class IifaaEkytResponse extends $tea.Model {
  // 响应头
  head: ResponseHead;
  // 业务响应结果
  bizRes: string;
  static names(): { [key: string]: string } {
    return {
      head: 'head',
      bizRes: 'biz_res',
    };
  }

  static types(): { [key: string]: any } {
    return {
      head: ResponseHead,
      bizRes: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 上链数据结果集
export class ChainModelResult extends $tea.Model {
  // 所属业务
  bizScene: string;
  // 资产类型
  dataScene: string;
  // 资产id
  assetId: string;
  // 资产数据内容json
  assetData: string;
  // 租户id
  tenantId: string;
  // 上链时间
  txTime: string;
  // 业务ID
  businessId: string;
  // 上链id
  antchainId: string;
  static names(): { [key: string]: string } {
    return {
      bizScene: 'biz_scene',
      dataScene: 'data_scene',
      assetId: 'asset_id',
      assetData: 'asset_data',
      tenantId: 'tenant_id',
      txTime: 'tx_time',
      businessId: 'business_id',
      antchainId: 'antchain_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizScene: 'string',
      dataScene: 'string',
      assetId: 'string',
      assetData: 'string',
      tenantId: 'string',
      txTime: 'string',
      businessId: 'string',
      antchainId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据上链失败结果
export class DeviceCollectFail extends $tea.Model {
  // 上链数据采集ID
  collectId: string;
  // 错误码
  code: string;
  // 错误信息
  message: string;
  static names(): { [key: string]: string } {
    return {
      collectId: 'collect_id',
      code: 'code',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      collectId: 'string',
      code: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 上链数据
export class CollectInfo extends $tea.Model {
  // 资产ID
  assetId: string;
  // 数据资产类型
  dataScene: string;
  // 资产数据内容，业务要上链的数据JSON格式
  assetData: string;
  // 上链数据采集id
  collectId: string;
  static names(): { [key: string]: string } {
    return {
      assetId: 'asset_id',
      dataScene: 'data_scene',
      assetData: 'asset_data',
      collectId: 'collect_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      assetId: 'string',
      dataScene: 'string',
      assetData: 'string',
      collectId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateBlockchainBotIotbasicDevicecollectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tenantId?: string;
  // 资产ID
  assetId?: string;
  // 数据资产类型
  dataScene: string;
  // 所属业务
  bizScene: string;
  // 资产数据内容，业务要上链的数据JSON格式
  assetData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      assetId: 'asset_id',
      dataScene: 'data_scene',
      bizScene: 'biz_scene',
      assetData: 'asset_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      assetId: 'string',
      dataScene: 'string',
      bizScene: 'string',
      assetData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateBlockchainBotIotbasicDevicecollectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  // 上链id
  antchainId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      antchainId: 'antchain_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      antchainId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateBlockchainBotIotbasicBatchcollectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 所属业务
  bizScene: string;
  // 租户id
  tenantId?: string;
  // 上链数据列表
  collectInfoList: CollectInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizScene: 'biz_scene',
      tenantId: 'tenant_id',
      collectInfoList: 'collect_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizScene: 'string',
      tenantId: 'string',
      collectInfoList: { 'type': 'array', 'itemType': CollectInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateBlockchainBotIotbasicBatchcollectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  // 上链成功列表
  successList?: DeviceCollectResult[];
  // 上链失败列表
  failList?: DeviceCollectFail[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      successList: 'success_list',
      failList: 'fail_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      successList: { 'type': 'array', 'itemType': DeviceCollectResult },
      failList: { 'type': 'array', 'itemType': DeviceCollectFail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBlockchainBotIotbasicDevicecollectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询结束时间
  endTime?: string;
  // 资产类型
  dataScene: string;
  // 所属业务
  bizScene: string;
  // 租户id
  tenantId?: string;
  // 上链hash
  antchainId?: string;
  // 上链数据内容 json
  assetData?: string;
  // 每页数量
  pageSize: number;
  // 当前页码
  currentPage: number;
  // 业务id
  businessId?: string;
  // 查询开始时间
  startTime?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      endTime: 'end_time',
      dataScene: 'data_scene',
      bizScene: 'biz_scene',
      tenantId: 'tenant_id',
      antchainId: 'antchain_id',
      assetData: 'asset_data',
      pageSize: 'page_size',
      currentPage: 'current_page',
      businessId: 'business_id',
      startTime: 'start_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      endTime: 'string',
      dataScene: 'string',
      bizScene: 'string',
      tenantId: 'string',
      antchainId: 'string',
      assetData: 'string',
      pageSize: 'number',
      currentPage: 'number',
      businessId: 'string',
      startTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBlockchainBotIotbasicDevicecollectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前页码
  current?: number;
  // 每页数据大小
  pageSize?: number;
  // 数据总条数
  total?: number;
  // 总页数
  totalPage?: number;
  // 查询结果
  data?: ChainModelResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      current: 'current',
      pageSize: 'page_size',
      total: 'total',
      totalPage: 'total_page',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      current: 'number',
      pageSize: 'number',
      total: 'number',
      totalPage: 'number',
      data: { 'type': 'array', 'itemType': ChainModelResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntsecuritytechGatewayEkytDriverRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 接口请求head
  head: RequestHead;
  // 请求业务参数，加密之后的密文信息
  request: string;
  // 请求数据签名值
  signature: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      head: 'head',
      request: 'request',
      signature: 'signature',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      head: RequestHead,
      request: 'string',
      signature: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntsecuritytechGatewayEkytDriverResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口响应结果
  success?: boolean;
  // 接口响应描述
  message?: string;
  // 接口响应数据
  data?: IifaaEkytResponse;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      message: 'message',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      message: 'string',
      data: IifaaEkytResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyAntsecuritytechGatewayIifaaDevicekeyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求头
  head: RequestHead;
  // 业务参数
  request: string;
  // 签名
  signature: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      head: 'head',
      request: 'request',
      signature: 'signature',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      head: RequestHead,
      request: 'string',
      signature: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyAntsecuritytechGatewayIifaaDevicekeyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 响应结果
  success?: boolean;
  // 结果描述
  message?: string;
  // 业务响应结果
  data?: IifaaEkytResponse;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      message: 'message',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      message: 'string',
      data: IifaaEkytResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBlockchainBotDevicecorpThingmodelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 新增的功能定义详情
  thingModelJson: string;
  // 品类code
  categoryCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      thingModelJson: 'thing_model_json',
      categoryCode: 'category_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      thingModelJson: 'string',
      categoryCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBlockchainBotDevicecorpThingmodelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作结果
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteBlockchainBotDevicecorpThingmodelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需要删除的属性标识符列表
  propertyIdentifier?: string[];
  // 需要删除的服务标识符列表
  serviceIdentifier?: string[];
  // 需要删除的事件标识符列表
  eventIdentifier?: string[];
  // 品类code
  categoryCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      propertyIdentifier: 'property_identifier',
      serviceIdentifier: 'service_identifier',
      eventIdentifier: 'event_identifier',
      categoryCode: 'category_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      propertyIdentifier: { 'type': 'array', 'itemType': 'string' },
      serviceIdentifier: { 'type': 'array', 'itemType': 'string' },
      eventIdentifier: { 'type': 'array', 'itemType': 'string' },
      categoryCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteBlockchainBotDevicecorpThingmodelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作结果
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishBlockchainBotDevicecorpThingmodelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 品类code
  categoryCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      categoryCode: 'category_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      categoryCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishBlockchainBotDevicecorpThingmodelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作结果
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SignBlockchainBotDigitalkeyWithholdRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 个人签约产品码
  personalProductCode: string;
  // 销售产品码
  productCode: string;
  // 请按当前接入的方式进行填充，且输入值必须为文档中的参数取值范围。 扫码或者短信页面签约需要拼装http的请求地址访问中间页面，钱包h5页面签约可直接拼接scheme的请求地址
  channel: string;
  // 支付宝App主动回跳商户App里指定的页面 http/https 路径。建议商户使用 https。
  returnUrl: string;
  // 用户在商户网站的登录账号，用于在签约页面展示
  externalLogonId: string;
  // 支付宝用户ID
  alipayUserId?: string;
  // 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）。 格式规则：支持大写小写字母和数字，最长32位。 商户系统按需自定义传入，如果同一用户在同一产品码、同一签约场景下，签订了多份代扣协议，那么需要指定并传入该值
  signScene: string;
  // 商户签约号，代扣协议中标示用户的唯一签约号（确保在商户系统中唯一）。 格式规则：支持大写小写字母和数字，最长32位。 商户系统按需自定义传入，如果同一用户在同一产品码、同一签约场景下，签订了多份代扣协议，那么需要指定并传入该值
  externalAgreementNo: string;
  // 当前用户签约请求的协议有效周期。 整形数字加上时间单位的协议有效期，从发起签约请求的时间开始算起。 目前支持的时间单位： 1. d：天 2. m：月 如果未传入，默认为长期有效。
  signValidityPeriod?: string;
  // 签约有效时间限制，单位是秒，有效范围是0-86400，商户传入此字段会用商户传入的值否则使用支付宝侧默认值，在有效时间外进行签约，会进行安全拦截；（备注：此字段适用于需要开通安全防控的商户，且依赖商户传入生成签约时的时间戳字段timestamp）
  effectTime?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      personalProductCode: 'personal_product_code',
      productCode: 'product_code',
      channel: 'channel',
      returnUrl: 'return_url',
      externalLogonId: 'external_logon_id',
      alipayUserId: 'alipay_user_id',
      signScene: 'sign_scene',
      externalAgreementNo: 'external_agreement_no',
      signValidityPeriod: 'sign_validity_period',
      effectTime: 'effect_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      personalProductCode: 'string',
      productCode: 'string',
      channel: 'string',
      returnUrl: 'string',
      externalLogonId: 'string',
      alipayUserId: 'string',
      signScene: 'string',
      externalAgreementNo: 'string',
      signValidityPeriod: 'string',
      effectTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SignBlockchainBotDigitalkeyWithholdResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 明细返回码
  subCode?: string;
  // 明细返回码描述
  subMsg?: string;
  // 生成的签约链接地址
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      subCode: 'string',
      subMsg: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnbindBlockchainBotDigitalkeyWithholdRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户的支付宝账号对应的支付宝唯一用户号，以 2088 开头的 16 位纯数字组成。
  alipayUserId: string;
  // 协议产品码，商户和支付宝签约时确定，不同业务场景对应不同的签约产品码，解约时传入签约时的产品码，销售产品码，商户代扣场景固定为 GENERAL_WITHHOLDING_P。
  personalProductCode: string;
  // 签约协议场景，商户和支付宝签约时确定，解约时，传入签约指定的场景信息。
  signScene: string;
  // 代扣协议中标示用户的唯一签约号(确保在商户系统中唯一)，传入签约时传入的签约号。
  externalAgreementNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      alipayUserId: 'alipay_user_id',
      personalProductCode: 'personal_product_code',
      signScene: 'sign_scene',
      externalAgreementNo: 'external_agreement_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      alipayUserId: 'string',
      personalProductCode: 'string',
      signScene: 'string',
      externalAgreementNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnbindBlockchainBotDigitalkeyWithholdResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 明细返回码
  subCode?: string;
  // 明细返回码描述
  subMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      subCode: 'string',
      subMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PayBlockchainBotDigitalkeyWithholdRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户订单号，需要保证不重复
  outTradeNo: string;
  // 订单标题
  subject: string;
  // 签约时支付宝返回的用户ID
  alipayUserId: string;
  // 销售产品码，商户代扣场景固定为GENERAL_WITHHOLDING
  productCode: string;
  // 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
  totalAmount: number;
  // 商户代扣扣款许可
  deductPermission?: string;
  // 代扣协议号, 对应于签约时，支付宝返回的协议
  agreementNo: string;
  // 该笔订单允许的最晚付款时间，逾期将关闭交易，超时关闭交易无法继续付款。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天 该参数数值不接受小数点， 如：1.5 h，可转换为 90m。
  timeoutExpress?: string;
  // 异步支付类型
  asyncType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outTradeNo: 'out_trade_no',
      subject: 'subject',
      alipayUserId: 'alipay_user_id',
      productCode: 'product_code',
      totalAmount: 'total_amount',
      deductPermission: 'deduct_permission',
      agreementNo: 'agreement_no',
      timeoutExpress: 'timeout_express',
      asyncType: 'async_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outTradeNo: 'string',
      subject: 'string',
      alipayUserId: 'string',
      productCode: 'string',
      totalAmount: 'number',
      deductPermission: 'string',
      agreementNo: 'string',
      timeoutExpress: 'string',
      asyncType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PayBlockchainBotDigitalkeyWithholdResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 明细返回码描述
  subMsg?: string;
  // 明细返回码
  subCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      subMsg: 'sub_msg',
      subCode: 'sub_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      subMsg: 'string',
      subCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RefuseBlockchainBotDigitalkeyWithholdRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单支付时传入的商户订单号,不能和 trade_no同时为空。
  outTradeNo: string;
  // 需要退款的金额，该金额不能大于订单金额,单位为元，支持两位小数
  refundAmount: number;
  // 标识一次退款请求，同一笔交易多次退款需要保证唯一。
  outRequestNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outTradeNo: 'out_trade_no',
      refundAmount: 'refund_amount',
      outRequestNo: 'out_request_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outTradeNo: 'string',
      refundAmount: 'number',
      outRequestNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RefuseBlockchainBotDigitalkeyWithholdResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 明细返回码
  subCode?: string;
  // 明细返回码描述
  subMsg?: string;
  // 退款返回信息 
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      subCode: 'string',
      subMsg: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBlockchainBotDigitalkeyWithholdRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户的支付宝账号对应的支付宝唯一用户号，以 2088 开头的 16 位纯数字组成。
  alipayUserId: string;
  // 协议产品码，商户和支付宝签约时确定，不同业务场景对应不同的签约产品码，解约时传入签约时的产品码，销售产品码，商户代扣场景固定为 GENERAL_WITHHOLDING_P。
  personalProductCode: string;
  // 签约协议场景，商户和支付宝签约时确定，解约时，传入签约指定的场景信息。
  signScene: string;
  // 代扣协议中标示用户的唯一签约号(确保在商户系统中唯一)，传入签约时传入的签约号。
  externalAgreementNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      alipayUserId: 'alipay_user_id',
      personalProductCode: 'personal_product_code',
      signScene: 'sign_scene',
      externalAgreementNo: 'external_agreement_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      alipayUserId: 'string',
      personalProductCode: 'string',
      signScene: 'string',
      externalAgreementNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBlockchainBotDigitalkeyWithholdResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 明细返回码
  subCode?: string;
  // 明细返回码描述
  subMsg?: string;
  // 协议查询返回信息 
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      subCode: 'string',
      subMsg: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelBlockchainBotDigitalkeyWithholdRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户传入外部交易订单号
  outTradeNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outTradeNo: 'out_trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outTradeNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelBlockchainBotDigitalkeyWithholdResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 明细返回码
  subCode?: string;
  // 明细返回码描述
  subMsg?: string;
  // 撤销返回信息 
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      subCode: 'string',
      subMsg: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyBlockchainBotDigitalkeyWithholdRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户请求号。 由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复
  outRequestNo: string;
  // 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
  totalAmount: number;
  // 代扣协议号, 对应于签约时，支付宝返回的协议
  agreementNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outRequestNo: 'out_request_no',
      totalAmount: 'total_amount',
      agreementNo: 'agreement_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outRequestNo: 'string',
      totalAmount: 'number',
      agreementNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyBlockchainBotDigitalkeyWithholdResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 明细返回码
  subCode?: string;
  // 明细返回码描述
  subMsg?: string;
  // 预通知返回内容
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      subCode: 'string',
      subMsg: 'string',
      data: 'string',
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
          sdk_version: "1.0.0",
          _prod_code: "ak_dc040d759c7a442f89b4b6590b1e39a0",
          _prod_channel: "saas",
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
   * Description: IoT设备平台-设备上链
   * Summary: IoT设备平台-设备上链
   */
  async operateBlockchainBotIotbasicDevicecollect(request: OperateBlockchainBotIotbasicDevicecollectRequest): Promise<OperateBlockchainBotIotbasicDevicecollectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateBlockchainBotIotbasicDevicecollectEx(request, headers, runtime);
  }

  /**
   * Description: IoT设备平台-设备上链
   * Summary: IoT设备平台-设备上链
   */
  async operateBlockchainBotIotbasicDevicecollectEx(request: OperateBlockchainBotIotbasicDevicecollectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateBlockchainBotIotbasicDevicecollectResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateBlockchainBotIotbasicDevicecollectResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.devicecollect.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateBlockchainBotIotbasicDevicecollectResponse({}));
  }

  /**
   * Description: IoT设备平台-批量数据上链
   * Summary: IoT设备平台-批量数据上链
   */
  async operateBlockchainBotIotbasicBatchcollect(request: OperateBlockchainBotIotbasicBatchcollectRequest): Promise<OperateBlockchainBotIotbasicBatchcollectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateBlockchainBotIotbasicBatchcollectEx(request, headers, runtime);
  }

  /**
   * Description: IoT设备平台-批量数据上链
   * Summary: IoT设备平台-批量数据上链
   */
  async operateBlockchainBotIotbasicBatchcollectEx(request: OperateBlockchainBotIotbasicBatchcollectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateBlockchainBotIotbasicBatchcollectResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateBlockchainBotIotbasicBatchcollectResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.batchcollect.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateBlockchainBotIotbasicBatchcollectResponse({}));
  }

  /**
   * Description: 上链数据分页查询
   * Summary: 上链数据分页查询
   */
  async queryBlockchainBotIotbasicDevicecollect(request: QueryBlockchainBotIotbasicDevicecollectRequest): Promise<QueryBlockchainBotIotbasicDevicecollectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBlockchainBotIotbasicDevicecollectEx(request, headers, runtime);
  }

  /**
   * Description: 上链数据分页查询
   * Summary: 上链数据分页查询
   */
  async queryBlockchainBotIotbasicDevicecollectEx(request: QueryBlockchainBotIotbasicDevicecollectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBlockchainBotIotbasicDevicecollectResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBlockchainBotIotbasicDevicecollectResponse>(await this.doRequest("1.0", "blockchain.bot.iotbasic.devicecollect.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBlockchainBotIotbasicDevicecollectResponse({}));
  }

  /**
   * Description: eKYT风险评估服务-出行场景司机
   * Summary: eKYT风险评估服务-出行场景司机
   */
  async queryAntsecuritytechGatewayEkytDriver(request: QueryAntsecuritytechGatewayEkytDriverRequest): Promise<QueryAntsecuritytechGatewayEkytDriverResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntsecuritytechGatewayEkytDriverEx(request, headers, runtime);
  }

  /**
   * Description: eKYT风险评估服务-出行场景司机
   * Summary: eKYT风险评估服务-出行场景司机
   */
  async queryAntsecuritytechGatewayEkytDriverEx(request: QueryAntsecuritytechGatewayEkytDriverRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntsecuritytechGatewayEkytDriverResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntsecuritytechGatewayEkytDriverResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.ekyt.driver.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntsecuritytechGatewayEkytDriverResponse({}));
  }

  /**
   * Description: 申请设备设备密钥
   * Summary: 申请设备设备密钥
   */
  async applyAntsecuritytechGatewayIifaaDevicekey(request: ApplyAntsecuritytechGatewayIifaaDevicekeyRequest): Promise<ApplyAntsecuritytechGatewayIifaaDevicekeyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyAntsecuritytechGatewayIifaaDevicekeyEx(request, headers, runtime);
  }

  /**
   * Description: 申请设备设备密钥
   * Summary: 申请设备设备密钥
   */
  async applyAntsecuritytechGatewayIifaaDevicekeyEx(request: ApplyAntsecuritytechGatewayIifaaDevicekeyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyAntsecuritytechGatewayIifaaDevicekeyResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyAntsecuritytechGatewayIifaaDevicekeyResponse>(await this.doRequest("1.0", "antsecuritytech.gateway.iifaa.devicekey.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyAntsecuritytechGatewayIifaaDevicekeyResponse({}));
  }

  /**
   * Description: iotbasic-设备厂商创建物模型
   * Summary: iotbasic-设备厂商创建物模型
   */
  async createBlockchainBotDevicecorpThingmodel(request: CreateBlockchainBotDevicecorpThingmodelRequest): Promise<CreateBlockchainBotDevicecorpThingmodelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBlockchainBotDevicecorpThingmodelEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-设备厂商创建物模型
   * Summary: iotbasic-设备厂商创建物模型
   */
  async createBlockchainBotDevicecorpThingmodelEx(request: CreateBlockchainBotDevicecorpThingmodelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBlockchainBotDevicecorpThingmodelResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBlockchainBotDevicecorpThingmodelResponse>(await this.doRequest("1.0", "blockchain.bot.devicecorp.thingmodel.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBlockchainBotDevicecorpThingmodelResponse({}));
  }

  /**
   * Description: iotbasic-设备厂商删除物模型
   * Summary: iotbasic-设备厂商删除物模型
   */
  async deleteBlockchainBotDevicecorpThingmodel(request: DeleteBlockchainBotDevicecorpThingmodelRequest): Promise<DeleteBlockchainBotDevicecorpThingmodelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteBlockchainBotDevicecorpThingmodelEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-设备厂商删除物模型
   * Summary: iotbasic-设备厂商删除物模型
   */
  async deleteBlockchainBotDevicecorpThingmodelEx(request: DeleteBlockchainBotDevicecorpThingmodelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteBlockchainBotDevicecorpThingmodelResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteBlockchainBotDevicecorpThingmodelResponse>(await this.doRequest("1.0", "blockchain.bot.devicecorp.thingmodel.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteBlockchainBotDevicecorpThingmodelResponse({}));
  }

  /**
   * Description: iotbasic-设备厂商发布物模型
   * Summary: iotbasic-设备厂商发布物模型
   */
  async publishBlockchainBotDevicecorpThingmodel(request: PublishBlockchainBotDevicecorpThingmodelRequest): Promise<PublishBlockchainBotDevicecorpThingmodelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.publishBlockchainBotDevicecorpThingmodelEx(request, headers, runtime);
  }

  /**
   * Description: iotbasic-设备厂商发布物模型
   * Summary: iotbasic-设备厂商发布物模型
   */
  async publishBlockchainBotDevicecorpThingmodelEx(request: PublishBlockchainBotDevicecorpThingmodelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PublishBlockchainBotDevicecorpThingmodelResponse> {
    Util.validateModel(request);
    return $tea.cast<PublishBlockchainBotDevicecorpThingmodelResponse>(await this.doRequest("1.0", "blockchain.bot.devicecorp.thingmodel.publish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PublishBlockchainBotDevicecorpThingmodelResponse({}));
  }

  /**
   * Description: 代扣签约链接获取
   * Summary: 代扣签约链接获取
   */
  async signBlockchainBotDigitalkeyWithhold(request: SignBlockchainBotDigitalkeyWithholdRequest): Promise<SignBlockchainBotDigitalkeyWithholdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.signBlockchainBotDigitalkeyWithholdEx(request, headers, runtime);
  }

  /**
   * Description: 代扣签约链接获取
   * Summary: 代扣签约链接获取
   */
  async signBlockchainBotDigitalkeyWithholdEx(request: SignBlockchainBotDigitalkeyWithholdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SignBlockchainBotDigitalkeyWithholdResponse> {
    Util.validateModel(request);
    return $tea.cast<SignBlockchainBotDigitalkeyWithholdResponse>(await this.doRequest("1.0", "blockchain.bot.digitalkey.withhold.sign", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SignBlockchainBotDigitalkeyWithholdResponse({}));
  }

  /**
   * Description: 代扣签约解除
   * Summary: 代扣签约解除
   */
  async unbindBlockchainBotDigitalkeyWithhold(request: UnbindBlockchainBotDigitalkeyWithholdRequest): Promise<UnbindBlockchainBotDigitalkeyWithholdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.unbindBlockchainBotDigitalkeyWithholdEx(request, headers, runtime);
  }

  /**
   * Description: 代扣签约解除
   * Summary: 代扣签约解除
   */
  async unbindBlockchainBotDigitalkeyWithholdEx(request: UnbindBlockchainBotDigitalkeyWithholdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UnbindBlockchainBotDigitalkeyWithholdResponse> {
    Util.validateModel(request);
    return $tea.cast<UnbindBlockchainBotDigitalkeyWithholdResponse>(await this.doRequest("1.0", "blockchain.bot.digitalkey.withhold.unbind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UnbindBlockchainBotDigitalkeyWithholdResponse({}));
  }

  /**
   * Description: 代扣支付
   * Summary: 代扣支付
   */
  async payBlockchainBotDigitalkeyWithhold(request: PayBlockchainBotDigitalkeyWithholdRequest): Promise<PayBlockchainBotDigitalkeyWithholdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.payBlockchainBotDigitalkeyWithholdEx(request, headers, runtime);
  }

  /**
   * Description: 代扣支付
   * Summary: 代扣支付
   */
  async payBlockchainBotDigitalkeyWithholdEx(request: PayBlockchainBotDigitalkeyWithholdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PayBlockchainBotDigitalkeyWithholdResponse> {
    Util.validateModel(request);
    return $tea.cast<PayBlockchainBotDigitalkeyWithholdResponse>(await this.doRequest("1.0", "blockchain.bot.digitalkey.withhold.pay", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PayBlockchainBotDigitalkeyWithholdResponse({}));
  }

  /**
   * Description: 代扣支付退款 
   * Summary: 代扣支付退款 
   */
  async refuseBlockchainBotDigitalkeyWithhold(request: RefuseBlockchainBotDigitalkeyWithholdRequest): Promise<RefuseBlockchainBotDigitalkeyWithholdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.refuseBlockchainBotDigitalkeyWithholdEx(request, headers, runtime);
  }

  /**
   * Description: 代扣支付退款 
   * Summary: 代扣支付退款 
   */
  async refuseBlockchainBotDigitalkeyWithholdEx(request: RefuseBlockchainBotDigitalkeyWithholdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RefuseBlockchainBotDigitalkeyWithholdResponse> {
    Util.validateModel(request);
    return $tea.cast<RefuseBlockchainBotDigitalkeyWithholdResponse>(await this.doRequest("1.0", "blockchain.bot.digitalkey.withhold.refuse", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RefuseBlockchainBotDigitalkeyWithholdResponse({}));
  }

  /**
   * Description: 代扣协议查询
   * Summary: 代扣协议查询
   */
  async queryBlockchainBotDigitalkeyWithhold(request: QueryBlockchainBotDigitalkeyWithholdRequest): Promise<QueryBlockchainBotDigitalkeyWithholdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBlockchainBotDigitalkeyWithholdEx(request, headers, runtime);
  }

  /**
   * Description: 代扣协议查询
   * Summary: 代扣协议查询
   */
  async queryBlockchainBotDigitalkeyWithholdEx(request: QueryBlockchainBotDigitalkeyWithholdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBlockchainBotDigitalkeyWithholdResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBlockchainBotDigitalkeyWithholdResponse>(await this.doRequest("1.0", "blockchain.bot.digitalkey.withhold.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBlockchainBotDigitalkeyWithholdResponse({}));
  }

  /**
   * Description: 代扣撤销
   * Summary: 代扣撤销
   */
  async cancelBlockchainBotDigitalkeyWithhold(request: CancelBlockchainBotDigitalkeyWithholdRequest): Promise<CancelBlockchainBotDigitalkeyWithholdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelBlockchainBotDigitalkeyWithholdEx(request, headers, runtime);
  }

  /**
   * Description: 代扣撤销
   * Summary: 代扣撤销
   */
  async cancelBlockchainBotDigitalkeyWithholdEx(request: CancelBlockchainBotDigitalkeyWithholdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelBlockchainBotDigitalkeyWithholdResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelBlockchainBotDigitalkeyWithholdResponse>(await this.doRequest("1.0", "blockchain.bot.digitalkey.withhold.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelBlockchainBotDigitalkeyWithholdResponse({}));
  }

  /**
   * Description: 代扣扣款前预通知
   * Summary: 代扣扣款前预通知
   */
  async notifyBlockchainBotDigitalkeyWithhold(request: NotifyBlockchainBotDigitalkeyWithholdRequest): Promise<NotifyBlockchainBotDigitalkeyWithholdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.notifyBlockchainBotDigitalkeyWithholdEx(request, headers, runtime);
  }

  /**
   * Description: 代扣扣款前预通知
   * Summary: 代扣扣款前预通知
   */
  async notifyBlockchainBotDigitalkeyWithholdEx(request: NotifyBlockchainBotDigitalkeyWithholdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<NotifyBlockchainBotDigitalkeyWithholdResponse> {
    Util.validateModel(request);
    return $tea.cast<NotifyBlockchainBotDigitalkeyWithholdResponse>(await this.doRequest("1.0", "blockchain.bot.digitalkey.withhold.notify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new NotifyBlockchainBotDigitalkeyWithholdResponse({}));
  }

}
