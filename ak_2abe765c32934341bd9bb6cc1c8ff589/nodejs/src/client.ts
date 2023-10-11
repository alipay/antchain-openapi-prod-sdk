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

// 订单包含的单个商品模型
export class OrderGoodsModel extends $tea.Model {
  // 商品 id
  productId: string;
  // 商品版本，每个商品的编码+版本 唯一确认一个产品信息，必须为自然数，如"0","1","10"等
  productVersion: number;
  // 商品名称
  productName: string;
  // 商品价格,精确到分，即 1234 表示 12.34 元
  productPrice: number;
  // 商品(3C产品)的设备 id
  productImeiId: string;
  // 链上采购供应商租户 id，提供商品方的金融科技租户 id，否则平台自己名称
  supplierId: string;
  // 商品数量，不能为空，且大于 0
  productNumber: number;
  static names(): { [key: string]: string } {
    return {
      productId: 'product_id',
      productVersion: 'product_version',
      productName: 'product_name',
      productPrice: 'product_price',
      productImeiId: 'product_imei_id',
      supplierId: 'supplier_id',
      productNumber: 'product_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      productId: 'string',
      productVersion: 'number',
      productName: 'string',
      productPrice: 'number',
      productImeiId: 'string',
      supplierId: 'string',
      productNumber: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单还款计划
export class PromiseInfo extends $tea.Model {
  // 订单 id
  orderId: string;
  // 宽限期，精确到 毫秒，产生罚息的延迟时间范围。
  dateLimit: number;
  // 应付租金时间，格式为 2019-08-31 12:00:00
  // yyyy-MM-dd HH:mm:ss
  payDateList: string[];
  // 租期
  payPeriod: number;
  // 应付租金，精确到分，即 1234 表示 12.34 元
  payMoneyList: number[];
  // 租赁公司支付宝 UID
  leaseAlipayUid: string;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      dateLimit: 'date_limit',
      payDateList: 'pay_date_list',
      payPeriod: 'pay_period',
      payMoneyList: 'pay_money_list',
      leaseAlipayUid: 'lease_alipay_uid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      dateLimit: 'number',
      payDateList: { 'type': 'array', 'itemType': 'string' },
      payPeriod: 'number',
      payMoneyList: { 'type': 'array', 'itemType': 'number' },
      leaseAlipayUid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 同步订单中的下单人信息
export class UserSyncInfo extends $tea.Model {
  // 外部同步的订单 id
  orderId: string;
  // 用户登录名，租赁平台会员ID/若支付宝ID必传
  loginId: string;
  // 户登录名类型 1.商户会员2.支付宝3.其他
  loginType: number;
  // 用户登录时间 格式为2019-08-31 12:00:00
  loginTime: string;
  // 租赁人姓名，这里是用户通过公钥加密后的密文
  userName: string;
  // 租赁人身份证，这里是用户通过公钥加密后的密文
  userId: string;
  // 承租人手机号，这里是用户通过公钥加密后的密文
  userPhoneNumber: string;
  // 身份认证类型 1支付宝实人，2芝麻实人，3非蚂蚁实人
  userType: string;
  // 支付宝账号信息
  alipayUid: string;
  // 出租企业名称
  leaseCorpName: string;
  // 出租企业统一社会信用代码
  leaseCorpId: string;
  // 出租法定代表人姓名
  leaseCorpOwnerName: string;
  // 1.企业用户 2.个人用户
  lesseeType: number;
  // 营业执照对应的名称
  leasedEnterprise?: string;
  // 租赁⼈身份证照⽚正⾯地址
  userImageUrl?: string;
  // 租赁⼈身份证照⽚反⾯地址
  userBackImageUrl?: string;
  // 平台注册的电话，这里是用户通过公钥加密后的密文
  registeredTelephoneNumber?: string;
  // 承租企业实际控制人（股东/法人）身份证号
  actualControllerId?: string;
  // 承租企业实际控制人（股东/法人）手机号。若为企业类型必填，字段长度：不超过 500
  actualControllerNumber?: string;
  // 承租企业实际控制人（股东/法人）姓名，若为企业类型必填
  actualControllerName?: string;
  // 承租企业实际控制人（股东/法人）身份证正面地址，若为企业类型必填
  actualControllerImageUrl?: string;
  // 承租企业实际控制人（股东/法人）身份证反面地址
  actualControllerBackImageUrl?: string;
  // 承租企业实际控制人（股东/法人）手机号
  actualControllerTelephoneNumber?: string;
  // 承租企业统⼀社会信⽤代码
  businessLicenseNumber?: string;
  // 承租企业统一社会信用代码
  businesslicenseUrl?: string;
  // 承租企业法定代表人姓名
  legalRepresentative?: string;
  //  资方定义的其他额外字段，以json形式传递
  extraInfo?: string;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      loginId: 'login_id',
      loginType: 'login_type',
      loginTime: 'login_time',
      userName: 'user_name',
      userId: 'user_id',
      userPhoneNumber: 'user_phone_number',
      userType: 'user_type',
      alipayUid: 'alipay_uid',
      leaseCorpName: 'lease_corp_name',
      leaseCorpId: 'lease_corp_id',
      leaseCorpOwnerName: 'lease_corp_owner_name',
      lesseeType: 'lessee_type',
      leasedEnterprise: 'leased_enterprise',
      userImageUrl: 'user_image_url',
      userBackImageUrl: 'user_back_image_url',
      registeredTelephoneNumber: 'registered_telephone_number',
      actualControllerId: 'actual_controller_id',
      actualControllerNumber: 'actual_controller_number',
      actualControllerName: 'actual_controller_name',
      actualControllerImageUrl: 'actual_controller_image_url',
      actualControllerBackImageUrl: 'actual_controller_back_image_url',
      actualControllerTelephoneNumber: 'actual_controller_telephone_number',
      businessLicenseNumber: 'business_license_number',
      businesslicenseUrl: 'businesslicense_url',
      legalRepresentative: 'legal_representative',
      extraInfo: 'extra_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      loginId: 'string',
      loginType: 'number',
      loginTime: 'string',
      userName: 'string',
      userId: 'string',
      userPhoneNumber: 'string',
      userType: 'string',
      alipayUid: 'string',
      leaseCorpName: 'string',
      leaseCorpId: 'string',
      leaseCorpOwnerName: 'string',
      lesseeType: 'number',
      leasedEnterprise: 'string',
      userImageUrl: 'string',
      userBackImageUrl: 'string',
      registeredTelephoneNumber: 'string',
      actualControllerId: 'string',
      actualControllerNumber: 'string',
      actualControllerName: 'string',
      actualControllerImageUrl: 'string',
      actualControllerBackImageUrl: 'string',
      actualControllerTelephoneNumber: 'string',
      businessLicenseNumber: 'string',
      businesslicenseUrl: 'string',
      legalRepresentative: 'string',
      extraInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 主订单信息
export class OrderInfo extends $tea.Model {
  // 订单 id
  orderId: string;
  // 订单创建时间，格式为2019-08-31 12:00:00
  orderCreateTime: string;
  // 订单支付时间，格式为 2019-08-31 12:00:00
  orderPayTime: string;
  // 订单支付 id
  orderPayId: string;
  // 订单支付类型；1:预授权，2:信用套餐，3:支付宝代扣，4:其他，5:网商直付通代扣，6:网商委托代扣
  orderPayType: number;
  // 订单支付主题
  orderPaySubject: string;
  // 租期，单位：月
  rentTerm: number;
  // 月租金 精确到分，即 1234 表示 12.34 元
  rentPricePerMonth: number;
  // 到期买断价 精确到分，即 1234 表示 12.34 元
  buyOutPrice: number;
  // 租赁合同,需要客户自己提供合并的 url
  leaseContractUrl: string;
  // 仓库类型；1: 实体仓 2: 虚拟仓
  storeType: number;
  // 承租人收货地址
  userAddress: string;
  // 供应商在金融科技对应的租户 id，若填写此字段，则会走供应商模式
  supplierIsvAccount: string;
  // 省份编码
  provinceCode: string;
  // 城市编码
  cityCode: string;
  // 地区码
  districtCode: string;
  // 到期形式；1:到期买断 2:到期归还
  dueMode: number;
  // 租赁合同 id，可用作幂等
  contractId?: string;
  // 租金总额，精确到分，即 1234 表示 12.34 元
  totalRentMoney: number;
  // 保险单号
  insuranceNumber?: string;
  // 保险地址
  insuranceUrl?: string;
  // 蚁盾分数
  yidunScore?: number;
  // 网商直付通模式的代扣协议号，订单类型为网商直付通模式为必填
  agreementNo?: string;
  // 直付通代扣受理订单号，订单类型为网商直付通模式为必填
  agreementOrderId?: string;
  // 首付款金额, 精确到分，即 1234 表示 12.34 元，订单类型为网商直付通模式为必填
  downPayment?: number;
  // 订单付款内容描述
  orderPayBody?: string;
  // 额外信息
  extraInfo?: string;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      orderCreateTime: 'order_create_time',
      orderPayTime: 'order_pay_time',
      orderPayId: 'order_pay_id',
      orderPayType: 'order_pay_type',
      orderPaySubject: 'order_pay_subject',
      rentTerm: 'rent_term',
      rentPricePerMonth: 'rent_price_per_month',
      buyOutPrice: 'buy_out_price',
      leaseContractUrl: 'lease_contract_url',
      storeType: 'store_type',
      userAddress: 'user_address',
      supplierIsvAccount: 'supplier_isv_account',
      provinceCode: 'province_code',
      cityCode: 'city_code',
      districtCode: 'district_code',
      dueMode: 'due_mode',
      contractId: 'contract_id',
      totalRentMoney: 'total_rent_money',
      insuranceNumber: 'insurance_number',
      insuranceUrl: 'insurance_url',
      yidunScore: 'yidun_score',
      agreementNo: 'agreement_no',
      agreementOrderId: 'agreement_order_id',
      downPayment: 'down_payment',
      orderPayBody: 'order_pay_body',
      extraInfo: 'extra_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      orderCreateTime: 'string',
      orderPayTime: 'string',
      orderPayId: 'string',
      orderPayType: 'number',
      orderPaySubject: 'string',
      rentTerm: 'number',
      rentPricePerMonth: 'number',
      buyOutPrice: 'number',
      leaseContractUrl: 'string',
      storeType: 'number',
      userAddress: 'string',
      supplierIsvAccount: 'string',
      provinceCode: 'string',
      cityCode: 'string',
      districtCode: 'string',
      dueMode: 'number',
      contractId: 'string',
      totalRentMoney: 'number',
      insuranceNumber: 'string',
      insuranceUrl: 'string',
      yidunScore: 'number',
      agreementNo: 'string',
      agreementOrderId: 'string',
      downPayment: 'number',
      orderPayBody: 'string',
      extraInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单商品信息
export class GoodsInfo extends $tea.Model {
  // 订单 id
  orderId: string;
  // 租赁机构自己的金融科技租户 id，如果是代理模式此处需要为被代理机构的金融科技租户 id
  leaseId?: string;
  // 订单包含的商品信息列表
  goodsList: OrderGoodsModel[];
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      leaseId: 'lease_id',
      goodsList: 'goods_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      leaseId: 'string',
      goodsList: { 'type': 'array', 'itemType': OrderGoodsModel },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoTradeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务字段，具体传入信息需参考文档
  // 传入格式需为json字符串
  bizContent: string;
  // 接口执行类型
  // 
  type: string;
  // 操作类型
  operationType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
      type: 'type',
      operationType: 'operation_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
      type: 'string',
      operationType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoTradeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // resp信息
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntchainAtoTradeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询信息，必须遵循json字符串格式
  bizContent: string;
  // 接口类型
  type: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizContent: 'biz_content',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizContent: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntchainAtoTradeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回的查询值
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntchainAtoRealpersonFacevrfRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 真实姓名
  certName: string;
  // 证件号码
  certNo: string;
  // 身份信息来源类型，当前仅支持证件（CERT_INFO）
  identityType: string;
  // 证件类型，当前仅支持身份证（IDENTITY_CARD）
  certType: string;
  // 商户请求的唯一标识。
  // 
  // 值为 32 位长度的字母数字组合。其中，前面几位字符是商户自定义的简称，中间几位可以使用一段时间，后段可以使用一个随机或递增序列。该值也可以使用 UUID。
  outerOrderNo: string;
  // 认证结束回跳地址
  returnUrl: string;
  // 订单id 长度不可超过50
  orderId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certName: 'cert_name',
      certNo: 'cert_no',
      identityType: 'identity_type',
      certType: 'cert_type',
      outerOrderNo: 'outer_order_no',
      returnUrl: 'return_url',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certName: 'string',
      certNo: 'string',
      identityType: 'string',
      certType: 'string',
      outerOrderNo: 'string',
      returnUrl: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntchainAtoRealpersonFacevrfResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务返回字段，JSON格式
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

export class QueryAntchainAtoRealpersonFacevrfRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 可信实人认证的唯一标识
  certifyId: string;
  // 商户请求的唯一标识。
  // 
  // 值为 32 位长度的字母数字组合。其中，前面几位字符是商户自定义的简称，中间几位可以使用一段时间，后段可以使用一个随机或递增序列。该值也可以使用 UUID。
  outerOrderNo: string;
  // 订单id 长度不可超过50
  orderId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certifyId: 'certify_id',
      outerOrderNo: 'outer_order_no',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certifyId: 'string',
      outerOrderNo: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoRealpersonFacevrfResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务返回字段，JSON格式
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

export class AllAntchainAtoSignTemplateRequest extends $tea.Model {
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

export class AllAntchainAtoSignTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // List<Object>格式，详细参考：
  // [
  //         {
  //             "templateCode": "TEST_001",
  //             "tenantId": "BIPCCOQY",
  //             "agreementType": "SERVICE_LEASE",
  //             "fileName": "测试模板之协议签署证明",
  //             "templateId": "f28038577d664015bfc1034c4a125121",
  //             "fieldArgs": "{\"sceneName\":\"测试协议合同签署\",\"title\":\"这是一份证明协议\"}",
  //             "userPos": "[{\"required\":true,\"posPage\":\"1\",\"posX\":\"162.44\",\"posY\":\"425\"}]",
  //             "orgPos": "[{\"required\":true,\"posPage\":\"1\",\"posX\":\"449.99\",\"posY\":\"420.03\"}]"
  //         }
  //     ]
  templateList?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      templateList: 'template_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      templateList: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitAntchainAtoSignFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderId: string;
  // 合同在用户签署完成以后是否自动落签完成签署，true-自动落签并结束；false-手工落签并通过接口完成落签。如果不自动落签，则需要调用另外一个落签接口来完成最终的签署的落签。
  autoSign: boolean;
  // CRED_PSN_CH_IDCARD： 大陆身份证
  // CRED_PSN_CH_TWCARD：台湾来往大陆通行证
  // CRED_PSN_CH_MACAO"：澳门来往大陆通行证
  // CRED_PSN_CH_HONGKONG：香港来往大陆通行证
  // CRED_PSN_PASSPORT：护照
  userIdType: string;
  // 用户证件号，需要采用RSA加密传输
  userIdNumber: string;
  // 姓名，需要采用RSA加密传输
  userName: string;
  // 用户手机号，可不传；传的话需要采用RSA加密传输
  userMobile?: string;
  // 用户的电子邮箱，可不传；传的话需要采用RSA加密传输
  userEmail?: string;
  // 签署有效期，时间戳，例如：new Date().getTime()
  signValidity?: string;
  // 1-短信；2-邮件
  flowNotifyType?: string;
  // 业务场景，电子合同签署协议的时候的标题
  businessScene: string;
  // 签署完成跳转链接
  signedRedirectUrl?: string;
  // 签署的电子合同模板信息，List<Object>的JSON格式，Object如下：
  // {
  // templateId:__, // String格式
  // templateArgs: {
  //     "模板参数key":"模板参数值", // 必须为String
  //   }
  // }
  templateList: string;
  // 用户的支付宝uid
  alipayUserId: string;
  // 公司名称
  merchantName: string;
  // 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
  merchantTag?: string;
  // 电子合同签署顺序，如果只有1方企业签署，传入1即可。如果是多方，并且需要设置签署顺序，则需要将这个值以及thirdSigner中的signOrder做一个签署顺序。
  merchantSignOrder?: number;
  // CRED_ORG_USCC：统一社会信用代码，CRED_ORG_REGCODE：工商注册号，只支持这两个值
  merchantIdType: string;
  // 商户证件号，需要采用RSA加密传输
  merchantIdNumber: string;
  // 法人姓名，需要RSA加密传输
  merchantLegalName?: string;
  // 法人证件号，需要采用RSA加密传输
  merchantLegalIdNumber?: string;
  // 多方签署的其他参与方的签署信息，json的array格式，参考：[{"tag":"zf_a","orgName":"上海网络科技有限公司","orgIdType":"CRED_ORG_REGCODE","orgIdNumber":"12098760923","orgLegalName":"王大浪","orgLegalIdNumber":"107120196708289012"}]，其中：orgIdNumber、orgLegalName、orgLegalIdNumber需要加密传输。
  thirdSigner?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      autoSign: 'auto_sign',
      userIdType: 'user_id_type',
      userIdNumber: 'user_id_number',
      userName: 'user_name',
      userMobile: 'user_mobile',
      userEmail: 'user_email',
      signValidity: 'sign_validity',
      flowNotifyType: 'flow_notify_type',
      businessScene: 'business_scene',
      signedRedirectUrl: 'signed_redirect_url',
      templateList: 'template_list',
      alipayUserId: 'alipay_user_id',
      merchantName: 'merchant_name',
      merchantTag: 'merchant_tag',
      merchantSignOrder: 'merchant_sign_order',
      merchantIdType: 'merchant_id_type',
      merchantIdNumber: 'merchant_id_number',
      merchantLegalName: 'merchant_legal_name',
      merchantLegalIdNumber: 'merchant_legal_id_number',
      thirdSigner: 'third_signer',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      autoSign: 'boolean',
      userIdType: 'string',
      userIdNumber: 'string',
      userName: 'string',
      userMobile: 'string',
      userEmail: 'string',
      signValidity: 'string',
      flowNotifyType: 'string',
      businessScene: 'string',
      signedRedirectUrl: 'string',
      templateList: 'string',
      alipayUserId: 'string',
      merchantName: 'string',
      merchantTag: 'string',
      merchantSignOrder: 'number',
      merchantIdType: 'string',
      merchantIdNumber: 'string',
      merchantLegalName: 'string',
      merchantLegalIdNumber: 'string',
      thirdSigner: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitAntchainAtoSignFlowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签署合同单号
  signNo?: string;
  // 电子签署流程ID
  flowId?: string;
  // 签署用户ID
  accountId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      signNo: 'sign_no',
      flowId: 'flow_id',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      signNo: 'string',
      flowId: 'string',
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntchainAtoSignFlowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 签署合同单号
  signNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      signNo: 'sign_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      signNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntchainAtoSignFlowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签署合同单号
  signNo?: string;
  // 订单号
  orderId?: string;
  // 签署用户ID
  accountId?: string;
  // 状态：DRAFT - 草稿； SIGNING - 签署中； FINISH - 签署完成；UNDO - 撤销； TERMINATE - 终止； EXPIRE - 过期； REJECTED - 拒签； CANCELLED - 解约
  // 
  status?: string;
  // 签署流程ID
  flowId?: string;
  // 签署文件列表，参考：
  // _[{"fileItemNo":"10090801000001699892007791144960","agreementType":"COMMON","fileName":"xxx合同","fileSize":228530,"signAccountId":"fe2eb3814c4e49edba2bc012f790771f","fileId":"2c7684461a0f4d33bc02f6d77f7b3937","downloadUrl":"https://dev.oss-cn-shanghai.aliyuncs.com/ag/ord/xxx/16939683744483057_%E6%B5%8B%E8%AF%95%E6%A8%A1%E6%9D%BF%E4%B9%8B%E5%8D%8F%E8%AE%AE%E7%AD%BE%E7%BD%B2%E8%AF%81%E6%98%8E.pdf?Expires=1693971989&OSSAccessKeyId=LTAI5tR3hHiaXPAh8YsY9Dce&Signature=i%2FfAgDem33guI%2F0KjIFj24XZNCc%3D"}]_
  docList?: string;
  // 业务场景，主要用于签署合同的标题描述
  businessScene?: string;
  // 签署合同中的订单的uid。
  alipayUserId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      signNo: 'sign_no',
      orderId: 'order_id',
      accountId: 'account_id',
      status: 'status',
      flowId: 'flow_id',
      docList: 'doc_list',
      businessScene: 'business_scene',
      alipayUserId: 'alipay_user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      signNo: 'string',
      orderId: 'string',
      accountId: 'string',
      status: 'string',
      flowId: 'string',
      docList: 'string',
      businessScene: 'string',
      alipayUserId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoFundSplittingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资方订单号
  fundNo: string;
  // 商户的订单号
  orderId: string;
  // 商户的数科租户ID
  merchantTenantId: string;
  // 第几期，例如：2表示第二期
  termNum: number;
  // 扣款时间， yyyy-MM-dd HH:mm:ss 格式
  deductionTime: string;
  // 扣款金额，单位精确到分， 例如：12462300为124623.00元
  deductionAmount: number;
  // 商户分账金额，单位精确到分，比如：666601 = 6666.01元
  merchantSplitAmount: number;
  // 资方分账金额，单位精确到分。比如：666610 = 6666.10元
  fundSplitAmount: number;
  // 其他参与方分账信息，JSON格式的数组，样例：
  // [{"participants":"参与方A","amount":666600,"accountNo":"777223","accountType":"ICBC"}]
  otherSplitInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fundNo: 'fund_no',
      orderId: 'order_id',
      merchantTenantId: 'merchant_tenant_id',
      termNum: 'term_num',
      deductionTime: 'deduction_time',
      deductionAmount: 'deduction_amount',
      merchantSplitAmount: 'merchant_split_amount',
      fundSplitAmount: 'fund_split_amount',
      otherSplitInfo: 'other_split_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fundNo: 'string',
      orderId: 'string',
      merchantTenantId: 'string',
      termNum: 'number',
      deductionTime: 'string',
      deductionAmount: 'number',
      merchantSplitAmount: 'number',
      fundSplitAmount: 'number',
      otherSplitInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoFundSplittingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 流水同步描述信息
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoFundOrderfinancialRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderId: string;
  // 商户在数科的租户ID
  merchantTenantId: string;
  // 订单融资唯一标识
  applicationId: string;
  // 订单融资状态：1-成功；2-失败
  status: number;
  // 融资结果描述，长度不超过64
  reason?: string;
  // 额外信息
  extras?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantTenantId: 'merchant_tenant_id',
      applicationId: 'application_id',
      status: 'status',
      reason: 'reason',
      extras: 'extras',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantTenantId: 'string',
      applicationId: 'string',
      status: 'number',
      reason: 'string',
      extras: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoFundOrderfinancialResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果描述信息
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntchainAtoFundRepaymentplanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id，不可为空
  orderId: string;
  // 商户在数科注册的tenantId，不可为空
  merchantTenantId: string;
  // 用户的支付宝uid
  alipayUid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantTenantId: 'merchant_tenant_id',
      alipayUid: 'alipay_uid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantTenantId: 'string',
      alipayUid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntchainAtoFundRepaymentplanResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单id
  orderId?: string;
  // 宽限期，精确到毫秒
  limit?: number;
  // 应付租金时间，格式为yyyy-MM-dd HH:mm:ss
  payDateList?: string;
  // 租期
  payPeriod?: number;
  // 应付租金，精确到分，即1234表示12.34元
  payMoneyList?: string;
  // 租赁公司支付宝UID
  leaseAlipayUid?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      limit: 'limit',
      payDateList: 'pay_date_list',
      payPeriod: 'pay_period',
      payMoneyList: 'pay_money_list',
      leaseAlipayUid: 'lease_alipay_uid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      limit: 'number',
      payDateList: 'string',
      payPeriod: 'number',
      payMoneyList: 'string',
      leaseAlipayUid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoFundWithholdingcontractRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderId: string;
  // 商家在数科注册的租户id
  merchantTenantId: string;
  // 代扣协议号
  withholdingContractId: string;
  // json的字符串，存储额外信息
  extraInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantTenantId: 'merchant_tenant_id',
      withholdingContractId: 'withholding_contract_id',
      extraInfo: 'extra_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantTenantId: 'string',
      withholdingContractId: 'string',
      extraInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoFundWithholdingcontractResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存储成功
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoFundOrderfulfillmentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户id
  merchantTenantId: string;
  // 订单id
  orderId: string;
  // 租期编号
  leaseTermIndex: number;
  // 租金归还状态，
  // 1.足额归还
  // 2.部分归还
  // 3.未归还，
  // 4退租,
  // 5该订单整个生命周期已完结
  rentalReturnState: number;
  // 租金归还金额,精确到分，即1234表示12.34元
  rentalMoney: number;
  // 归还时间，格式为"2019-07-31 12:00:00"
  returnTime: string;
  // 归还方式，
  // 1.预授权代扣
  // 2.支付宝代扣
  // 3.主动还款
  // 4.其他
  // 5.网商直付通
  // 6.网商委托代扣
  returnWay: number;
  // 还款凭证类型，
  // 1.支付宝
  // 2.平台代收（客户主动还款）
  // 3.其他
  // 6.网商银行
  returnVoucherType: number;
  // 还款凭证编号，不超过128字符，1.支付宝流水号
  returnVoucherSerial: string;
  // 手续费，如通过预授权、代扣的方式规划，必填，单位为分
  // 1234代表12.34元
  charge: number;
  // 剩余归还期数
  remainTerm: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      merchantTenantId: 'merchant_tenant_id',
      orderId: 'order_id',
      leaseTermIndex: 'lease_term_index',
      rentalReturnState: 'rental_return_state',
      rentalMoney: 'rental_money',
      returnTime: 'return_time',
      returnWay: 'return_way',
      returnVoucherType: 'return_voucher_type',
      returnVoucherSerial: 'return_voucher_serial',
      charge: 'charge',
      remainTerm: 'remain_term',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      merchantTenantId: 'string',
      orderId: 'string',
      leaseTermIndex: 'number',
      rentalReturnState: 'number',
      rentalMoney: 'number',
      returnTime: 'string',
      returnWay: 'number',
      returnVoucherType: 'number',
      returnVoucherSerial: 'string',
      charge: 'number',
      remainTerm: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoFundOrderfulfillmentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 添加成功
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntchainAtoFundOrderfulfillmentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id
  orderId: string;
  // 租赁订单所属商家租户id
  merchantTenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      merchantTenantId: 'merchant_tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      merchantTenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntchainAtoFundOrderfulfillmentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单履约信息的列表数组
  // List<OrderFulfillment> 的jsonArray.toString
  orderFulfillmentDataList?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderFulfillmentDataList: 'order_fulfillment_data_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderFulfillmentDataList: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntchainAtoWithholdSignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 长度不可超过50
  orderId: string;
  // 支付宝商户id，使用签约能力前时候进行向平台申请
  alipayMerchantId: string;
  // 支付宝商户名称，会展示在支付并签约界面
  alipayMerchantName: string;
  // 支付宝商户服务名称，会展示在支付并签约界面
  alipayMerchantServiceName: string;
  // 支付宝商户服务描述，会展示在支付并签约界面
  alipayMerchantServiceDescription: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      alipayMerchantId: 'alipay_merchant_id',
      alipayMerchantName: 'alipay_merchant_name',
      alipayMerchantServiceName: 'alipay_merchant_service_name',
      alipayMerchantServiceDescription: 'alipay_merchant_service_description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      alipayMerchantId: 'string',
      alipayMerchantName: 'string',
      alipayMerchantServiceName: 'string',
      alipayMerchantServiceDescription: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntchainAtoWithholdSignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签约字符串
  signStr?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      signStr: 'sign_str',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      signStr: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoWithholdSignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单id 长度不可超过50
  orderId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAtoWithholdSignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 协议当前状态
  // 1. UNSIGNED：未签约
  // 2. SIGNED：已签约；
  // 3. TERMINATED：已解约
  status?: string;
  // 协议签署时间
  signTime?: string;
  // 协议生效时间
  validTime?: string;
  // 协议失效时间
  invalidTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      signTime: 'sign_time',
      validTime: 'valid_time',
      invalidTime: 'invalid_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      signTime: 'string',
      validTime: 'string',
      invalidTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoTradeFullRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 购买用户信息
  userInfo: UserSyncInfo;
  // 主订单信息
  orderInfo: OrderInfo;
  // 订单包含的商品信息列表
  goodsInfo: GoodsInfo;
  // 订单还款计划
  promiseInfo: PromiseInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userInfo: 'user_info',
      orderInfo: 'order_info',
      goodsInfo: 'goods_info',
      promiseInfo: 'promise_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userInfo: UserSyncInfo,
      orderInfo: OrderInfo,
      goodsInfo: GoodsInfo,
      promiseInfo: PromiseInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAntchainAtoTradeFullResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 同步成功
  responseData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseData: 'response_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseData: 'string',
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
          _prod_code: "ak_2abe765c32934341bd9bb6cc1c8ff589",
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
   * Description: 对账saas交易信息同步接口
   * Summary: 对账saas交易信息同步接口
   */
  async syncAntchainAtoTrade(request: SyncAntchainAtoTradeRequest): Promise<SyncAntchainAtoTradeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncAntchainAtoTradeEx(request, headers, runtime);
  }

  /**
   * Description: 对账saas交易信息同步接口
   * Summary: 对账saas交易信息同步接口
   */
  async syncAntchainAtoTradeEx(request: SyncAntchainAtoTradeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncAntchainAtoTradeResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncAntchainAtoTradeResponse>(await this.doRequest("1.0", "antchain.ato.trade.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncAntchainAtoTradeResponse({}));
  }

  /**
   * Description: 获取详情
   * Summary: 获取详情
   */
  async getAntchainAtoTrade(request: GetAntchainAtoTradeRequest): Promise<GetAntchainAtoTradeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAntchainAtoTradeEx(request, headers, runtime);
  }

  /**
   * Description: 获取详情
   * Summary: 获取详情
   */
  async getAntchainAtoTradeEx(request: GetAntchainAtoTradeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAntchainAtoTradeResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAntchainAtoTradeResponse>(await this.doRequest("1.0", "antchain.ato.trade.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAntchainAtoTradeResponse({}));
  }

  /**
   * Description: 可信身份认证，创建认证
   * Summary: 创建认证
   */
  async createAntchainAtoRealpersonFacevrf(request: CreateAntchainAtoRealpersonFacevrfRequest): Promise<CreateAntchainAtoRealpersonFacevrfResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAntchainAtoRealpersonFacevrfEx(request, headers, runtime);
  }

  /**
   * Description: 可信身份认证，创建认证
   * Summary: 创建认证
   */
  async createAntchainAtoRealpersonFacevrfEx(request: CreateAntchainAtoRealpersonFacevrfRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAntchainAtoRealpersonFacevrfResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAntchainAtoRealpersonFacevrfResponse>(await this.doRequest("1.0", "antchain.ato.realperson.facevrf.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAntchainAtoRealpersonFacevrfResponse({}));
  }

  /**
   * Description: 查询认证的结果和相关信息
   * Summary: 查询认证结果
   */
  async queryAntchainAtoRealpersonFacevrf(request: QueryAntchainAtoRealpersonFacevrfRequest): Promise<QueryAntchainAtoRealpersonFacevrfResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainAtoRealpersonFacevrfEx(request, headers, runtime);
  }

  /**
   * Description: 查询认证的结果和相关信息
   * Summary: 查询认证结果
   */
  async queryAntchainAtoRealpersonFacevrfEx(request: QueryAntchainAtoRealpersonFacevrfRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainAtoRealpersonFacevrfResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainAtoRealpersonFacevrfResponse>(await this.doRequest("1.0", "antchain.ato.realperson.facevrf.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainAtoRealpersonFacevrfResponse({}));
  }

  /**
   * Description: 电子合同签署的合同模板查询服务
   * Summary: 电子合同签署的合同模板查询服务
   */
  async allAntchainAtoSignTemplate(request: AllAntchainAtoSignTemplateRequest): Promise<AllAntchainAtoSignTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allAntchainAtoSignTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 电子合同签署的合同模板查询服务
   * Summary: 电子合同签署的合同模板查询服务
   */
  async allAntchainAtoSignTemplateEx(request: AllAntchainAtoSignTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllAntchainAtoSignTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<AllAntchainAtoSignTemplateResponse>(await this.doRequest("1.0", "antchain.ato.sign.template.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllAntchainAtoSignTemplateResponse({}));
  }

  /**
   * Description: 提交电子合同的签署流程
   * Summary: 提交电子合同的签署流程
   */
  async submitAntchainAtoSignFlow(request: SubmitAntchainAtoSignFlowRequest): Promise<SubmitAntchainAtoSignFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitAntchainAtoSignFlowEx(request, headers, runtime);
  }

  /**
   * Description: 提交电子合同的签署流程
   * Summary: 提交电子合同的签署流程
   */
  async submitAntchainAtoSignFlowEx(request: SubmitAntchainAtoSignFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitAntchainAtoSignFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitAntchainAtoSignFlowResponse>(await this.doRequest("1.0", "antchain.ato.sign.flow.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitAntchainAtoSignFlowResponse({}));
  }

  /**
   * Description: 查询签署流程详情
   * Summary: 查询签署流程详情
   */
  async getAntchainAtoSignFlow(request: GetAntchainAtoSignFlowRequest): Promise<GetAntchainAtoSignFlowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAntchainAtoSignFlowEx(request, headers, runtime);
  }

  /**
   * Description: 查询签署流程详情
   * Summary: 查询签署流程详情
   */
  async getAntchainAtoSignFlowEx(request: GetAntchainAtoSignFlowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAntchainAtoSignFlowResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAntchainAtoSignFlowResponse>(await this.doRequest("1.0", "antchain.ato.sign.flow.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAntchainAtoSignFlowResponse({}));
  }

  /**
   * Description: 分账流水同步
   * Summary: 分账流水同步
   */
  async syncAntchainAtoFundSplitting(request: SyncAntchainAtoFundSplittingRequest): Promise<SyncAntchainAtoFundSplittingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncAntchainAtoFundSplittingEx(request, headers, runtime);
  }

  /**
   * Description: 分账流水同步
   * Summary: 分账流水同步
   */
  async syncAntchainAtoFundSplittingEx(request: SyncAntchainAtoFundSplittingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncAntchainAtoFundSplittingResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncAntchainAtoFundSplittingResponse>(await this.doRequest("1.0", "antchain.ato.fund.splitting.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncAntchainAtoFundSplittingResponse({}));
  }

  /**
   * Description: 提供给融资资金方，用以订单融资结果同步
   * Summary: 订单融资结果同步
   */
  async syncAntchainAtoFundOrderfinancial(request: SyncAntchainAtoFundOrderfinancialRequest): Promise<SyncAntchainAtoFundOrderfinancialResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncAntchainAtoFundOrderfinancialEx(request, headers, runtime);
  }

  /**
   * Description: 提供给融资资金方，用以订单融资结果同步
   * Summary: 订单融资结果同步
   */
  async syncAntchainAtoFundOrderfinancialEx(request: SyncAntchainAtoFundOrderfinancialRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncAntchainAtoFundOrderfinancialResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncAntchainAtoFundOrderfinancialResponse>(await this.doRequest("1.0", "antchain.ato.fund.orderfinancial.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncAntchainAtoFundOrderfinancialResponse({}));
  }

  /**
   * Description: 将返回订单实人认证通过后的、商家同步的还款计划
   * Summary: 获取商家同步的还款计划
   */
  async getAntchainAtoFundRepaymentplan(request: GetAntchainAtoFundRepaymentplanRequest): Promise<GetAntchainAtoFundRepaymentplanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAntchainAtoFundRepaymentplanEx(request, headers, runtime);
  }

  /**
   * Description: 将返回订单实人认证通过后的、商家同步的还款计划
   * Summary: 获取商家同步的还款计划
   */
  async getAntchainAtoFundRepaymentplanEx(request: GetAntchainAtoFundRepaymentplanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAntchainAtoFundRepaymentplanResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAntchainAtoFundRepaymentplanResponse>(await this.doRequest("1.0", "antchain.ato.fund.repaymentplan.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAntchainAtoFundRepaymentplanResponse({}));
  }

  /**
   * Description: 同步租赁订单的代扣协议
   * Summary: 同步租赁订单的代扣协议
   */
  async syncAntchainAtoFundWithholdingcontract(request: SyncAntchainAtoFundWithholdingcontractRequest): Promise<SyncAntchainAtoFundWithholdingcontractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncAntchainAtoFundWithholdingcontractEx(request, headers, runtime);
  }

  /**
   * Description: 同步租赁订单的代扣协议
   * Summary: 同步租赁订单的代扣协议
   */
  async syncAntchainAtoFundWithholdingcontractEx(request: SyncAntchainAtoFundWithholdingcontractRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncAntchainAtoFundWithholdingcontractResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncAntchainAtoFundWithholdingcontractResponse>(await this.doRequest("1.0", "antchain.ato.fund.withholdingcontract.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncAntchainAtoFundWithholdingcontractResponse({}));
  }

  /**
   * Description: 资方回传一条订单还款履约信息
   * Summary: 同步订单还款履约信息
   */
  async syncAntchainAtoFundOrderfulfillment(request: SyncAntchainAtoFundOrderfulfillmentRequest): Promise<SyncAntchainAtoFundOrderfulfillmentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncAntchainAtoFundOrderfulfillmentEx(request, headers, runtime);
  }

  /**
   * Description: 资方回传一条订单还款履约信息
   * Summary: 同步订单还款履约信息
   */
  async syncAntchainAtoFundOrderfulfillmentEx(request: SyncAntchainAtoFundOrderfulfillmentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncAntchainAtoFundOrderfulfillmentResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncAntchainAtoFundOrderfulfillmentResponse>(await this.doRequest("1.0", "antchain.ato.fund.orderfulfillment.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncAntchainAtoFundOrderfulfillmentResponse({}));
  }

  /**
   * Description: 获取订单的履约信息
   * Summary: 获取订单的履约信息
   */
  async getAntchainAtoFundOrderfulfillment(request: GetAntchainAtoFundOrderfulfillmentRequest): Promise<GetAntchainAtoFundOrderfulfillmentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAntchainAtoFundOrderfulfillmentEx(request, headers, runtime);
  }

  /**
   * Description: 获取订单的履约信息
   * Summary: 获取订单的履约信息
   */
  async getAntchainAtoFundOrderfulfillmentEx(request: GetAntchainAtoFundOrderfulfillmentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAntchainAtoFundOrderfulfillmentResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAntchainAtoFundOrderfulfillmentResponse>(await this.doRequest("1.0", "antchain.ato.fund.orderfulfillment.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAntchainAtoFundOrderfulfillmentResponse({}));
  }

  /**
   * Description: 代扣签约
   * Summary: 代扣签约
   */
  async createAntchainAtoWithholdSign(request: CreateAntchainAtoWithholdSignRequest): Promise<CreateAntchainAtoWithholdSignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAntchainAtoWithholdSignEx(request, headers, runtime);
  }

  /**
   * Description: 代扣签约
   * Summary: 代扣签约
   */
  async createAntchainAtoWithholdSignEx(request: CreateAntchainAtoWithholdSignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAntchainAtoWithholdSignResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAntchainAtoWithholdSignResponse>(await this.doRequest("1.0", "antchain.ato.withhold.sign.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAntchainAtoWithholdSignResponse({}));
  }

  /**
   * Description: 代扣签约查询
   * Summary: 代扣签约查询
   */
  async queryAntchainAtoWithholdSign(request: QueryAntchainAtoWithholdSignRequest): Promise<QueryAntchainAtoWithholdSignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainAtoWithholdSignEx(request, headers, runtime);
  }

  /**
   * Description: 代扣签约查询
   * Summary: 代扣签约查询
   */
  async queryAntchainAtoWithholdSignEx(request: QueryAntchainAtoWithholdSignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainAtoWithholdSignResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainAtoWithholdSignResponse>(await this.doRequest("1.0", "antchain.ato.withhold.sign.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainAtoWithholdSignResponse({}));
  }

  /**
   * Description: 同步商家的订单信息，包含下单人信息、订单信息、订单关联的商品信息以及订单绑定的还款计划。
   * Summary: 同步商家的订单信息
   */
  async syncAntchainAtoTradeFull(request: SyncAntchainAtoTradeFullRequest): Promise<SyncAntchainAtoTradeFullResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncAntchainAtoTradeFullEx(request, headers, runtime);
  }

  /**
   * Description: 同步商家的订单信息，包含下单人信息、订单信息、订单关联的商品信息以及订单绑定的还款计划。
   * Summary: 同步商家的订单信息
   */
  async syncAntchainAtoTradeFullEx(request: SyncAntchainAtoTradeFullRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncAntchainAtoTradeFullResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncAntchainAtoTradeFullResponse>(await this.doRequest("1.0", "antchain.ato.trade.full.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncAntchainAtoTradeFullResponse({}));
  }

}
