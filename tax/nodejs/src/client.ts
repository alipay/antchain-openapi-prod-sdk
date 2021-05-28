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

// 发票明细
export class InvoiceItem extends $tea.Model {
  // 税收分类编码	
  spbm: string;
  // 项目名称, 如果为折扣行，商品名称须与被折扣行的商品名称相同，不能多行折扣。
  mc: string;
  // 单位
  jldw?: string;
  // 数量
  shul?: string;
  // 含税金额,2位小数
  je: string;
  // 税率,当fplx!=51or53时，必填,3位小数，例1%为0.010；
  sl?: string;
  // 税额,当fplx!=51or53时，必填
  se?: string;
  // 明细序号,从1开始递增
  mxxh: string;
  // 单价
  dj: string;
  // 规格型号
  ggxh?: string;
  static names(): { [key: string]: string } {
    return {
      spbm: 'spbm',
      mc: 'mc',
      jldw: 'jldw',
      shul: 'shul',
      je: 'je',
      sl: 'sl',
      se: 'se',
      mxxh: 'mxxh',
      dj: 'dj',
      ggxh: 'ggxh',
    };
  }

  static types(): { [key: string]: any } {
    return {
      spbm: 'string',
      mc: 'string',
      jldw: 'string',
      shul: 'string',
      je: 'string',
      sl: 'string',
      se: 'string',
      mxxh: 'string',
      dj: 'string',
      ggxh: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发票标准模型
export class Invoice extends $tea.Model {
  // 备注
  bz?: string;
  // 复核人
  fhr?: string;
  // 发票代码, 发票代码+发票号码唯一
  fpdm: string;
  // 发票号码,发票代码+发票号码唯一
  fphm: string;
  // 发票类型代码,
  // 默认填:20:广东电子普通发票
  // 01：增值税专用发票
  // 04：增值税普通发票
  // 10：增值税电子普通发票
  // 51：重庆通用机打一联发票76
  // 53：重庆通用机打三联发票210
  // 90：重庆通用机打三联发票190
  fplx: string;
  // 发票明细集合
  fpxxmxs?: InvoiceItem[];
  // 发票状态代码,0 正常 1 失控 2 作废 3 红字 4 异常票
  fpztdm: string;
  // 购买方地址、电话
  gfdzdh?: string;
  // 购买方名称
  gfmc: string;
  // 购买方纳税人识别号
  gfsh?: string;
  // 购买方银行账号
  gfyhzh?: string;
  // 购买方类型,1企业 2个人 3其他
  gmflx?: string;
  // 金额
  je: string;
  // 价税合计	， 单位：元（2 位小数）
  jshj: string;
  // 开票类型,0-蓝字发票；1-红字发票；
  kplx: string;
  // 开票人
  kpr: string;
  // 开票日期
  kprq: string;
  // 清单标志,00:无清单 01:有清单
  qdbz?: string;
  // 认证状态
  rzdklbdjgdm?: string;
  // 认证日期
  rzdklbdrq?: string;
  // 税额,当发票类型代码	 fplx!=51or fplx!=53时，必填
  se?: string;
  // 收款人
  skr?: string;
  // 税率标识,0不含税税率；1含税税率
  slbz: string;
  // 所属税务机关代码:
  // 山东省343
  // 重庆市350
  // 广东省347
  ssdq: string;
  // 销售方地址、电话
  xfdzdh?: string;
  // 销售方名称
  xfmc: string;
  // 销售方纳税人识别号
  xfsh: string;
  // 销售方银行账号
  xfyhzh?: string;
  // 原发票代码, kplx开票类型为1时必填
  yfpdm?: string;
  // 原发票号码,kplx开票类型为1时必填
  yfphm?: string;
  // 作废标志,0:未作废，1作废
  zfbz: string;
  // 作废时间
  zfsj?: string;
  // 扩展字段
  extFiled: string;
  static names(): { [key: string]: string } {
    return {
      bz: 'bz',
      fhr: 'fhr',
      fpdm: 'fpdm',
      fphm: 'fphm',
      fplx: 'fplx',
      fpxxmxs: 'fpxxmxs',
      fpztdm: 'fpztdm',
      gfdzdh: 'gfdzdh',
      gfmc: 'gfmc',
      gfsh: 'gfsh',
      gfyhzh: 'gfyhzh',
      gmflx: 'gmflx',
      je: 'je',
      jshj: 'jshj',
      kplx: 'kplx',
      kpr: 'kpr',
      kprq: 'kprq',
      qdbz: 'qdbz',
      rzdklbdjgdm: 'rzdklbdjgdm',
      rzdklbdrq: 'rzdklbdrq',
      se: 'se',
      skr: 'skr',
      slbz: 'slbz',
      ssdq: 'ssdq',
      xfdzdh: 'xfdzdh',
      xfmc: 'xfmc',
      xfsh: 'xfsh',
      xfyhzh: 'xfyhzh',
      yfpdm: 'yfpdm',
      yfphm: 'yfphm',
      zfbz: 'zfbz',
      zfsj: 'zfsj',
      extFiled: 'ext_filed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bz: 'string',
      fhr: 'string',
      fpdm: 'string',
      fphm: 'string',
      fplx: 'string',
      fpxxmxs: { 'type': 'array', 'itemType': InvoiceItem },
      fpztdm: 'string',
      gfdzdh: 'string',
      gfmc: 'string',
      gfsh: 'string',
      gfyhzh: 'string',
      gmflx: 'string',
      je: 'string',
      jshj: 'string',
      kplx: 'string',
      kpr: 'string',
      kprq: 'string',
      qdbz: 'string',
      rzdklbdjgdm: 'string',
      rzdklbdrq: 'string',
      se: 'string',
      skr: 'string',
      slbz: 'string',
      ssdq: 'string',
      xfdzdh: 'string',
      xfmc: 'string',
      xfsh: 'string',
      xfyhzh: 'string',
      yfpdm: 'string',
      yfphm: 'string',
      zfbz: 'string',
      zfsj: 'string',
      extFiled: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthCorpRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业注册地址和电话号码
  corpAddressPhoneNo: string;
  // 企业银行账号
  corpBankNo: string;
  // 填写公司名称
  corpName: string;
  // 企业授权秘钥
  corpPrivateKey: string;
  // 企业纳税人识别号
  corpTaxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      corpAddressPhoneNo: 'corp_address_phone_no',
      corpBankNo: 'corp_bank_no',
      corpName: 'corp_name',
      corpPrivateKey: 'corp_private_key',
      corpTaxId: 'corp_tax_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      corpAddressPhoneNo: 'string',
      corpBankNo: 'string',
      corpName: 'string',
      corpPrivateKey: 'string',
      corpTaxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthCorpResponse extends $tea.Model {
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

export class PushChargeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户
  bizTenant: string;
  // 平台分发,子业务类型，对应原来的authType.
  bizType: string;
  // 用户ID，根据业务对主体定义决定，比如票据业务的纳税人识别号
  customerId: string;
  // 系统编码,平台分发，定义枚举，全局用
  systemCode: string;
  // 请求id
  taskRequestId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizTenant: 'biz_tenant',
      bizType: 'biz_type',
      customerId: 'customer_id',
      systemCode: 'system_code',
      taskRequestId: 'task_request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizTenant: 'string',
      bizType: 'string',
      customerId: 'string',
      systemCode: 'string',
      taskRequestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushChargeResponse extends $tea.Model {
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

export class QueryChargeAuthRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户
  bizTenant: string;
  // 授权类型,业务类型
  bizType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizTenant: 'biz_tenant',
      bizType: 'biz_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizTenant: 'string',
      bizType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChargeAuthResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // OPEN:开通
  // STOP：停止
  // NOT_SALE：未授权
  authType?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      authType: 'auth_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      authType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushIcmInvoiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 批次号
  pch: string;
  // 发票信息（json格式）
  fpxx: string;
  // 发票类型
  // 01：增值税专用发票
  // 04：增值税普通发票
  // 10：增值税电子普通发票
  fplx: string;
  // 是否是历史数据推送
  islsp: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pch: 'pch',
      fpxx: 'fpxx',
      fplx: 'fplx',
      islsp: 'islsp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pch: 'string',
      fpxx: 'string',
      fplx: 'string',
      islsp: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushIcmInvoiceResponse extends $tea.Model {
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

export class QueryIcmInvoiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // ISV名称，用于标识合作的企业
  appId: string;
  // 授权类型
  // 01:发票归集授权; 02:记账; 03:报销; 11:发票贷授权; （0X发票相关授权，1X金融类授权）
  authType: string;
  //  数据通知地址接口 (当type=02或者03时必填) 用于数据采集完毕后通知该接口如何取发票数据
  // 
  callbackUrl?: string;
  // java long型
  // 起始金额，当type=03（报销查询）时必填
  endAmount?: number;
  // 查询起始时间(当auth_type=02或者03时必填)
  // 当auth_type=02(记账查询)时，查询起始时间和查询截止时间必须在同一个月内，如查询起始日期是6.31，截止日期为7.1，则会提示查询时间不能跨月，最长时间为一个月
  // 最大查询范围为6.1-6.30
  endDate?: string;
  // 非必填，不填则查询所有类型发票
  // "01": "增值税专用发票"
  // "04": "增值税普通发票"
  // "10": "增值税电子普通发票"
  invoiceType?: string;
  // 查询的企业纳税人识别号
  nsrsbh: string;
  // 请求号，调用方企业保证每次调用唯一，蚂蚁发票平台通过该字段和app_id两个字段做幂等判断
  requestId: string;
  // java long型
  // 起始金额，当type=03（报销查询）时必填
  startAmount?: number;
  // 查询起始时间(当auth_type=02或者03时必填)
  // 当auth_type=02(记账查询)时，查询起始时间和查询截止时间必须在同一个月内，如查询起始日期是6.31，截止日期为7.1，则会提示查询时间不能跨月，最长时间为一个月
  // 最大查询范围为6.1-6.30
  startDate?: string;
  // 地区编码
  cityCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appId: 'app_id',
      authType: 'auth_type',
      callbackUrl: 'callback_url',
      endAmount: 'end_amount',
      endDate: 'end_date',
      invoiceType: 'invoice_type',
      nsrsbh: 'nsrsbh',
      requestId: 'request_id',
      startAmount: 'start_amount',
      startDate: 'start_date',
      cityCode: 'city_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appId: 'string',
      authType: 'string',
      callbackUrl: 'string',
      endAmount: 'number',
      endDate: 'string',
      invoiceType: 'string',
      nsrsbh: 'string',
      requestId: 'string',
      startAmount: 'number',
      startDate: 'string',
      cityCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIcmInvoiceResponse extends $tea.Model {
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

export class PushIcmInvoiceinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 上票ISV app_id即secret_id
  appId: string;
  // 发票号码	
  invoice: Invoice;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appId: 'app_id',
      invoice: 'invoice',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appId: 'string',
      invoice: Invoice,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushIcmInvoiceinfoResponse extends $tea.Model {
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
          sdk_version: "1.1.6",
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
   * Description: 目前仅用于广州区块链发票开通企业信息推送
   * Summary: 区块链发票开通企业信息推送
   */
  async authCorp(request: AuthCorpRequest): Promise<AuthCorpResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authCorpEx(request, headers, runtime);
  }

  /**
   * Description: 目前仅用于广州区块链发票开通企业信息推送
   * Summary: 区块链发票开通企业信息推送
   */
  async authCorpEx(request: AuthCorpRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthCorpResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthCorpResponse>(await this.doRequest("1.0", "blockchain.tax.corp.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthCorpResponse({}));
  }

  /**
   * Description: 目前用于浙江票据的计费推送，其他主站环境还是继续使用msg。
   * Summary: 计费推送
   */
  async pushCharge(request: PushChargeRequest): Promise<PushChargeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushChargeEx(request, headers, runtime);
  }

  /**
   * Description: 目前用于浙江票据的计费推送，其他主站环境还是继续使用msg。
   * Summary: 计费推送
   */
  async pushChargeEx(request: PushChargeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushChargeResponse> {
    Util.validateModel(request);
    return $tea.cast<PushChargeResponse>(await this.doRequest("1.0", "blockchain.tax.charge.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushChargeResponse({}));
  }

  /**
   * Description: 查询计收费授权情况
   * Summary: 查询计收费授权情况
   */
  async queryChargeAuth(request: QueryChargeAuthRequest): Promise<QueryChargeAuthResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryChargeAuthEx(request, headers, runtime);
  }

  /**
   * Description: 查询计收费授权情况
   * Summary: 查询计收费授权情况
   */
  async queryChargeAuthEx(request: QueryChargeAuthRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryChargeAuthResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryChargeAuthResponse>(await this.doRequest("1.0", "blockchain.tax.charge.auth.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryChargeAuthResponse({}));
  }

  /**
   * Description: 目前仅用于广州区块链发票信息推送
   * Summary:  区块链发票信息推送
   */
  async pushIcmInvoice(request: PushIcmInvoiceRequest): Promise<PushIcmInvoiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushIcmInvoiceEx(request, headers, runtime);
  }

  /**
   * Description: 目前仅用于广州区块链发票信息推送
   * Summary:  区块链发票信息推送
   */
  async pushIcmInvoiceEx(request: PushIcmInvoiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushIcmInvoiceResponse> {
    Util.validateModel(request);
    return $tea.cast<PushIcmInvoiceResponse>(await this.doRequest("1.0", "blockchain.tax.icm.invoice.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushIcmInvoiceResponse({}));
  }

  /**
   * Description: 区块链发票信息查询接口-该接口为异步查询接口，查询结果通过回调调用方提供的callUrl方式进行通知
   * Summary:  区块链发票信息查询
   */
  async queryIcmInvoice(request: QueryIcmInvoiceRequest): Promise<QueryIcmInvoiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIcmInvoiceEx(request, headers, runtime);
  }

  /**
   * Description: 区块链发票信息查询接口-该接口为异步查询接口，查询结果通过回调调用方提供的callUrl方式进行通知
   * Summary:  区块链发票信息查询
   */
  async queryIcmInvoiceEx(request: QueryIcmInvoiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIcmInvoiceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIcmInvoiceResponse>(await this.doRequest("1.0", "blockchain.tax.icm.invoice.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIcmInvoiceResponse({}));
  }

  /**
   * Description: 标准发票推送
   * Summary: 标准发票推送
   */
  async pushIcmInvoiceinfo(request: PushIcmInvoiceinfoRequest): Promise<PushIcmInvoiceinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushIcmInvoiceinfoEx(request, headers, runtime);
  }

  /**
   * Description: 标准发票推送
   * Summary: 标准发票推送
   */
  async pushIcmInvoiceinfoEx(request: PushIcmInvoiceinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushIcmInvoiceinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<PushIcmInvoiceinfoResponse>(await this.doRequest("1.0", "blockchain.tax.icm.invoiceinfo.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushIcmInvoiceinfoResponse({}));
  }

}
