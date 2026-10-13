// This file is auto-generated, don't edit it
import AntchainUtil from '@antchain/alipay-util';
import Util, * as $Util from '@alicloud/tea-util';
import RPCUtil from '@alicloud/rpc-util';
import * as $tea from '@alicloud/tea-typescript';

/**
 * @remarks
 * Model for initing client
 */
export class Config extends $tea.Model {
  /**
   * @remarks
   * accesskey id
   */
  accessKeyId?: string;
  /**
   * @remarks
   * accesskey secret
   */
  accessKeySecret?: string;
  /**
   * @remarks
   * security token
   */
  securityToken?: string;
  /**
   * @remarks
   * http protocol
   * 
   * @example
   * http
   */
  protocol?: string;
  /**
   * @remarks
   * read timeout
   * 
   * @example
   * 10
   */
  readTimeout?: number;
  /**
   * @remarks
   * connect timeout
   * 
   * @example
   * 10
   */
  connectTimeout?: number;
  /**
   * @remarks
   * http proxy
   * 
   * @example
   * http://localhost
   */
  httpProxy?: string;
  /**
   * @remarks
   * https proxy
   * 
   * @example
   * https://localhost
   */
  httpsProxy?: string;
  /**
   * @remarks
   * endpoint
   * 
   * @example
   * cs.aliyuncs.com
   */
  endpoint?: string;
  /**
   * @remarks
   * proxy white list
   * 
   * @example
   * http://localhost
   */
  noProxy?: string;
  /**
   * @remarks
   * max idle conns
   * 
   * @example
   * 3
   */
  maxIdleConns?: number;
  /**
   * @remarks
   * user agent
   * 
   * @example
   * Alibabacloud/1
   */
  userAgent?: string;
  /**
   * @remarks
   * socks5 proxy
   */
  socks5Proxy?: string;
  /**
   * @remarks
   * socks5 network
   * 
   * @example
   * TCP
   */
  socks5NetWork?: string;
  /**
   * @remarks
   * 长链接最大空闲时长
   */
  maxIdleTimeMillis?: number;
  /**
   * @remarks
   * 长链接最大连接时长
   */
  keepAliveDurationMillis?: number;
  /**
   * @remarks
   * 最大连接数（长链接最大总数）
   */
  maxRequests?: number;
  /**
   * @remarks
   * 每个目标主机的最大连接数（分主机域名的长链接最大总数
   */
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

// 键值对，兼容map用
export class NameValuePair extends $tea.Model {
  // 键名
  /**
   * @example
   * key
   */
  name: string;
  // 键值
  /**
   * @example
   * value
   */
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

// Map<String,Object> 集合
export class QueryMap extends $tea.Model {
  // 键值
  /**
   * @example
   * BUSINESS_CODE
   */
  name: string;
  // 额外用户信息
  value?: NameValuePair[];
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      value: { 'type': 'array', 'itemType': NameValuePair },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// host
export class Host extends $tea.Model {
  // test_2e1ae924805f
  /**
   * @example
   * test_2e1ae924805f
   */
  systemName: string;
  // 地址
  /**
   * @example
   * test_941f18a4013b
   */
  address: string;
  static names(): { [key: string]: string } {
    return {
      systemName: 'system_name',
      address: 'address',
    };
  }

  static types(): { [key: string]: any } {
    return {
      systemName: 'string',
      address: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 另一个Demo类
export class AnotherClass extends $tea.Model {
  // 测试字段
  /**
   * @example
   * some string
   */
  bar: string;
  // 引用字段
  ref: QueryMap;
  // 新增结构体
  /**
   * @example
   * new structs
   */
  newStruct?: string;
  static names(): { [key: string]: string } {
    return {
      bar: 'bar',
      ref: 'ref',
      newStruct: 'new_struct',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bar: 'string',
      ref: QueryMap,
      newStruct: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 身份
export class Identity extends $tea.Model {
  // ak
  /**
   * @example
   * test_0efe42463f8f
   */
  ak: string;
  static names(): { [key: string]: string } {
    return {
      ak: 'ak',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ak: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// SCRealEstateQueryResponseData
export class SCRealEstateQueryResponseData extends $tea.Model {
  // area_code
  /**
   * @example
   * 510108
   */
  areaCode: string;
  // area_name
  /**
   * @example
   * area_name
   */
  areaName: string;
  // bdcdyh
  /**
   * @example
   * bdcdyh
   */
  bdcdyh: string;
  // bdcqzh
  /**
   * @example
   * bdcqzh
   */
  bdcqzh: string;
  // djsj
  /**
   * @example
   * djsj
   */
  djsj: string;
  // fwyt1
  /**
   * @example
   * fwyt1
   */
  fwyt1: string;
  // gyqk
  /**
   * @example
   * gyqk
   */
  gyqk: string;
  // qllx
  /**
   * @example
   * qllx
   */
  qllx: string;
  // qlrmc
  /**
   * @example
   * qlrmc
   */
  qlrmc: string;
  // scjzmj
  /**
   * @example
   * scjzmj
   */
  scjzmj: string;
  static names(): { [key: string]: string } {
    return {
      areaCode: 'area_code',
      areaName: 'area_name',
      bdcdyh: 'bdcdyh',
      bdcqzh: 'bdcqzh',
      djsj: 'djsj',
      fwyt1: 'fwyt1',
      gyqk: 'gyqk',
      qllx: 'qllx',
      qlrmc: 'qlrmc',
      scjzmj: 'scjzmj',
    };
  }

  static types(): { [key: string]: any } {
    return {
      areaCode: 'string',
      areaName: 'string',
      bdcdyh: 'string',
      bdcqzh: 'string',
      djsj: 'string',
      fwyt1: 'string',
      gyqk: 'string',
      qllx: 'string',
      qlrmc: 'string',
      scjzmj: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 头文件
export class Header extends $tea.Model {
  // 身份信息
  /**
   * @example
   * "identity": {       "ak": "test_0efe42463f8f"     }
   */
  identity: Identity;
  // 调用链编号
  /**
   * @example
   * test_6db79b5d2e48
   */
  traceId: string;
  // host信息
  /**
   * @example
   * "host": {       "systemName": "test_2e1ae924805f",       "address": "test_941f18a4013b"     }
   */
  host: Host;
  // 方向
  /**
   * @example
   * REQUEST
   */
  direction: string;
  // 请求类型
  /**
   * @example
   * INVOKE
   */
  requestType: string;
  // 协议版本
  /**
   * @example
   * test_6709e9002606
   */
  protocolVersion: string;
  static names(): { [key: string]: string } {
    return {
      identity: 'identity',
      traceId: 'trace_id',
      host: 'host',
      direction: 'direction',
      requestType: 'request_type',
      protocolVersion: 'protocol_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      identity: Identity,
      traceId: 'string',
      host: Host,
      direction: 'string',
      requestType: 'string',
      protocolVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// routeCondition
export class RouteCondition extends $tea.Model {
  // 渠道编号
  /**
   * @example
   * HZZKZTKJ
   */
  channelId: string;
  static names(): { [key: string]: string } {
    return {
      channelId: 'channel_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      channelId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单详情
export class OrderDetail extends $tea.Model {
  // 商品名称
  /**
   * @example
   * 商品A
   */
  itemName: string;
  // 数量
  /**
   * @example
   * 2
   */
  quantity: number;
  // 单价
  /**
   * @example
   * 50
   */
  price: number;
  static names(): { [key: string]: string } {
    return {
      itemName: 'item_name',
      quantity: 'quantity',
      price: 'price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      itemName: 'string',
      quantity: 'number',
      price: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// testAtestB
export class SCRealEstateQueryBody extends $tea.Model {
  static names(): { [key: string]: string } {
    return {
    };
  }

  static types(): { [key: string]: any } {
    return {
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Demo类1111-11
export class DemoClass extends $tea.Model {
  // 字符串测试
  /**
   * @example
   * some string
   */
  someString: string;
  // 日期测试
  /**
   * @example
   * 3
   */
  someDate: string;
  // Boolean测试
  /**
   * @example
   * true
   */
  someBoolean: boolean;
  // 整数测试
  /**
   * @example
   * 3
   */
  someInt: number;
  // 结构体字段
  someStruct: AnotherClass;
  static names(): { [key: string]: string } {
    return {
      someString: 'some_string',
      someDate: 'some_date',
      someBoolean: 'some_boolean',
      someInt: 'some_int',
      someStruct: 'some_struct',
    };
  }

  static types(): { [key: string]: any } {
    return {
      someString: 'string',
      someDate: 'string',
      someBoolean: 'boolean',
      someInt: 'number',
      someStruct: AnotherClass,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 卡片信息
export class CardInfos extends $tea.Model {
  // x
  domianInfo: Identity;
  // 12
  /**
   * @example
   * 张三
   */
  test: string;
  static names(): { [key: string]: string } {
    return {
      domianInfo: 'domian_info',
      test: 'test',
    };
  }

  static types(): { [key: string]: any } {
    return {
      domianInfo: Identity,
      test: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// SCRealEstateQueryRequestPayload
export class SCRealEstateQueryRequestPayload extends $tea.Model {
  // xm
  /**
   * @example
   * 张三
   */
  xm: string;
  // sfz
  /**
   * @example
   * 51382219970820817X
   */
  sfz: string;
  static names(): { [key: string]: string } {
    return {
      xm: 'xm',
      sfz: 'sfz',
    };
  }

  static types(): { [key: string]: any } {
    return {
      xm: 'string',
      sfz: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 编码
export class Cmd extends $tea.Model {
  // cmd编码
  /**
   * @example
   * SC-RealEstate-Query
   */
  cmdCode: string;
  // 版本号
  /**
   * @example
   * test_d19bd9d59915
   */
  version: string;
  static names(): { [key: string]: string } {
    return {
      cmdCode: 'cmd_code',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cmdCode: 'string',
      version: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 测试
export class ATest extends $tea.Model {
  // cc
  /**
   * @example
   * aaa
   */
  datay?: string;
  static names(): { [key: string]: string } {
    return {
      datay: 'datay',
    };
  }

  static types(): { [key: string]: any } {
    return {
      datay: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// SCRealEstateQueryResponsePayload
export class SCRealEstateQueryResponsePayload extends $tea.Model {
  // code
  /**
   * @example
   * 200
   */
  code: string;
  // data
  data: SCRealEstateQueryResponseData[];
  // uuid
  /**
   * @example
   * uuid
   */
  uuid: string;
  // ret_msg
  /**
   * @example
   * ret_msg
   */
  retMsg: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      data: 'data',
      uuid: 'uuid',
      retMsg: 'ret_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      data: { 'type': 'array', 'itemType': SCRealEstateQueryResponseData },
      uuid: 'string',
      retMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 键值对
export class Map extends $tea.Model {
  // 键
  /**
   * @example
   * key1
   */
  key: string;
  // 值
  /**
   * @example
   * value1
   */
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

// 大安全佐罗测试接口结构体
export class FaceImage extends $tea.Model {
  // 123
  /**
   * @example
   * 123
   */
  content?: string;
  // 213
  /**
   * @example
   * 13
   */
  rect?: string;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      rect: 'rect',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: 'string',
      rect: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// SCRealEstateQuery
export class SCRealEstateQueryInvokerRequest extends $tea.Model {
  // header
  /**
   * @example
   * "header": {}
   */
  header: Header;
  // body
  /**
   * @example
   * "body":{}
   */
  body: SCRealEstateQueryBody;
  static names(): { [key: string]: string } {
    return {
      header: 'header',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      header: Header,
      body: SCRealEstateQueryBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单DTO
export class OrderDTO extends $tea.Model {
  // 订单编号
  /**
   * @example
   * ORD001
   */
  orderNo: string;
  // 状态
  /**
   * @example
   * SUCCESS
   */
  status: string;
  static names(): { [key: string]: string } {
    return {
      orderNo: 'order_no',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderNo: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OrderItem extends $tea.Model {
  // 商品ID
  /**
   * @example
   * SKU001
   */
  itemId: string;
  // 数量
  /**
   * @example
   * 2
   */
  quantity: number;
  static names(): { [key: string]: string } {
    return {
      itemId: 'item_id',
      quantity: 'quantity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      itemId: 'string',
      quantity: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 风险评估因子明细
export class RiskFactorDetail extends $tea.Model {
  // 风险评估因子类型
  /**
   * @example
   * BLACKLIST
   */
  factorType?: string;
  // 分数
  /**
   * @example
   * 85
   */
  score?: number;
  // 风险事件
  /**
   * @example
   * ["关联账户被冻结", "高频异常交易"]
   */
  evidence?: string[];
  static names(): { [key: string]: string } {
    return {
      factorType: 'factor_type',
      score: 'score',
      evidence: 'evidence',
    };
  }

  static types(): { [key: string]: any } {
    return {
      factorType: 'string',
      score: 'number',
      evidence: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用于上海非金迭代的测试使用
export class ShangHaiTest extends $tea.Model {
  // string
  /**
   * @example
   * test
   */
  param1?: string;
  // number
  /**
   * @example
   * 1
   */
  param2?: number;
  static names(): { [key: string]: string } {
    return {
      param1: 'param_1',
      param2: 'param_2',
    };
  }

  static types(): { [key: string]: any } {
    return {
      param1: 'string',
      param2: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// init接口响应结果，map类型
export class InitPack extends $tea.Model {
  // 返回接收到请求的当前时间
  /**
   * @example
   * 2022-11-07 14:48
   */
  time: string;
  // 操作人
  /**
   * @example
   * wanyi
   */
  operator: string;
  // 请求编号
  /**
   * @example
   * 1
   */
  count: number;
  static names(): { [key: string]: string } {
    return {
      time: 'time',
      operator: 'operator',
      count: 'count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      time: 'string',
      operator: 'string',
      count: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 交易明细信息
export class TransactionDetails extends $tea.Model {
  // 金额
  /**
   * @example
   * 85000.00
   */
  amount?: number;
  // 币种
  /**
   * @example
   * CNY
   */
  currency?: string;
  // 渠道
  /**
   * @example
   * ATM
   */
  channel?: string;
  // 地址
  /**
   * @example
   * 上海分行
   */
  location?: string;
  // 时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  time?: string;
  static names(): { [key: string]: string } {
    return {
      amount: 'amount',
      currency: 'currency',
      channel: 'channel',
      location: 'location',
      time: 'time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      amount: 'number',
      currency: 'string',
      channel: 'string',
      location: 'string',
      time: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单信息
export class OrderInfo extends $tea.Model {
  // 订单号
  /**
   * @example
   * ORD001
   */
  orderId: string;
  // 金额
  /**
   * @example
   * 100
   */
  amount: number;
  // 详情
  /**
   * @example
   * {}
   */
  detail?: OrderDetail;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      amount: 'amount',
      detail: 'detail',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      amount: 'number',
      detail: OrderDetail,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数字类型
export class NumberTest extends $tea.Model {
  // 1
  /**
   * @example
   * 1
   */
  parameter1: number;
  // 2
  /**
   * @example
   * 2
   */
  parameter2: number;
  // 3
  /**
   * @example
   * 3
   */
  parameter3: number;
  // 4
  /**
   * @example
   * 4
   */
  parameter4: number;
  // 5
  /**
   * @example
   * 5
   */
  parameter5: DemoClass;
  static names(): { [key: string]: string } {
    return {
      parameter1: 'parameter_1',
      parameter2: 'parameter_2',
      parameter3: 'parameter_3',
      parameter4: 'parameter_4',
      parameter5: 'parameter_5',
    };
  }

  static types(): { [key: string]: any } {
    return {
      parameter1: 'number',
      parameter2: 'number',
      parameter3: 'number',
      parameter4: 'number',
      parameter5: DemoClass,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 测试类结构体
export class TestClass extends $tea.Model {
  // 字符串字段
  /**
   * @example
   * string_param
   */
  stringParam: string;
  // 数字字段
  /**
   * @example
   * 100
   */
  numberParam: number;
  // 布尔值参数
  /**
   * @example
   * true, false
   */
  booleanParam: boolean;
  // 日期参数
  /**
   * @example
   * 2026-02-10T10:10:00Z
   */
  dateParam: string;
  // 数组参数
  /**
   * @example
   * {a,b,c,d}
   */
  arrayParam: string[];
  // 结构体参数
  structParam: DemoClass;
  static names(): { [key: string]: string } {
    return {
      stringParam: 'string_param',
      numberParam: 'number_param',
      booleanParam: 'boolean_param',
      dateParam: 'date_param',
      arrayParam: 'array_param',
      structParam: 'struct_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      stringParam: 'string',
      numberParam: 'number',
      booleanParam: 'boolean',
      dateParam: 'string',
      arrayParam: { 'type': 'array', 'itemType': 'string' },
      structParam: DemoClass,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// TestStruct
export class TestStruct extends $tea.Model {
  // x
  /**
   * @example
   * x
   */
  x: string;
  // y
  /**
   * @example
   * y
   */
  y: DemoClass;
  // z
  z: DemoClass[];
  static names(): { [key: string]: string } {
    return {
      x: 'x',
      y: 'y',
      z: 'z',
    };
  }

  static types(): { [key: string]: any } {
    return {
      x: 'string',
      y: DemoClass,
      z: { 'type': 'array', 'itemType': DemoClass },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// x
export class CardInfo extends $tea.Model {
  // 1
  demoInfo: DemoClass;
  // 测试
  /**
   * @example
   * 张三
   */
  name?: string;
  static names(): { [key: string]: string } {
    return {
      demoInfo: 'demo_info',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      demoInfo: DemoClass,
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 测试
export class TestObject extends $tea.Model {
  // 主键
  /**
   * @example
   * 12
   */
  id: number;
  // 名称
  /**
   * @example
   * 小蜜
   */
  name: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// DemoTestx
export class DemoTestx extends $tea.Model {
  // ability_id
  /**
   * @example
   * 8000
   */
  abilityId: string;
  static names(): { [key: string]: string } {
    return {
      abilityId: 'ability_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      abilityId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 自动生成单测代码model
export class AutoCodeModel extends $tea.Model {
  // 111
  /**
   * @example
   * 111
   */
  modelStringParam: string;
  // 111
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  modelDateParam: string;
  // 111
  /**
   * @example
   * 111
   */
  modelArrayParam: string[];
  static names(): { [key: string]: string } {
    return {
      modelStringParam: 'model_string_param',
      modelDateParam: 'model_date_param',
      modelArrayParam: 'model_array_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      modelStringParam: 'string',
      modelDateParam: 'string',
      modelArrayParam: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// SCRealEstateQueryRequestBody
export class SCRealEstateQueryRequestBody extends $tea.Model {
  // cmd
  /**
   * @example
   * "cmd": {       "cmdCode": "SC-RealEstate-Query",       "version": "test_d19bd9d59915"     }
   */
  cmd: Cmd;
  // 路由信息
  /**
   * @example
   * "routeCondition": {       "channelId": "HZZKZTKJ"     }
   */
  routeCondition: RouteCondition;
  // requestId
  /**
   * @example
   * test_8c964bb7781a
   */
  requestId: string;
  // payload
  /**
   * @example
   * { "xm": "张三",   "sfz": "51382219970820817X"}
   */
  payload: SCRealEstateQueryRequestPayload;
  static names(): { [key: string]: string } {
    return {
      cmd: 'cmd',
      routeCondition: 'route_condition',
      requestId: 'request_id',
      payload: 'payload',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cmd: Cmd,
      routeCondition: RouteCondition,
      requestId: 'string',
      payload: SCRealEstateQueryRequestPayload,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 1
export class DemoT extends $tea.Model {
  // 1
  /**
   * @example
   * 3000
   */
  timeout?: string;
  static names(): { [key: string]: string } {
    return {
      timeout: 'timeout',
    };
  }

  static types(): { [key: string]: any } {
    return {
      timeout: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ss
export class TestStrcuct extends $tea.Model {
  // ss
  /**
   * @example
   * 张三
   */
  name?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 嵌套结构
export class NestModel extends $tea.Model {
  // aaaa
  /**
   * @example
   * aaa
   */
  a: string;
  static names(): { [key: string]: string } {
    return {
      a: 'a',
    };
  }

  static types(): { [key: string]: any } {
    return {
      a: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// btest
export class Btest extends $tea.Model {
  // atest
  /**
   * @example
   * atest
   */
  atest: ATest;
  static names(): { [key: string]: string } {
    return {
      atest: 'atest',
    };
  }

  static types(): { [key: string]: any } {
    return {
      atest: ATest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 测试
export class TestAPIObject extends $tea.Model {
  // test
  /**
   * @example
   * 21
   */
  id: number;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ResponseBody
export class SCRealEstateQueryResponseBody extends $tea.Model {
  // cost
  /**
   * @example
   * 1234
   */
  cost: number;
  // response_status
  /**
   * @example
   * response_status
   */
  responseStatus: string;
  // response_code
  /**
   * @example
   * 200
   */
  responseCode: string;
  // request_id
  /**
   * @example
   * request_id
   */
  requestId: string;
  // payload
  payload: SCRealEstateQueryResponsePayload;
  static names(): { [key: string]: string } {
    return {
      cost: 'cost',
      responseStatus: 'response_status',
      responseCode: 'response_code',
      requestId: 'request_id',
      payload: 'payload',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cost: 'number',
      responseStatus: 'string',
      responseCode: 'string',
      requestId: 'string',
      payload: SCRealEstateQueryResponsePayload,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户基础信息
export class UserProfile extends $tea.Model {
  // 用户ID
  /**
   * @example
   * 1234567890
   */
  userId?: string;
  // 用户身份证号
  /**
   * @example
   * 110101199003072516
   */
  idNumber?: string;
  // 手机号
  /**
   * @example
   * 13800138000
   */
  mobile?: string;
  // 年龄
  /**
   * @example
   * 32
   */
  age?: number;
  // 信用评分
  /**
   * @example
   * 720
   */
  creditScore?: number;
  static names(): { [key: string]: string } {
    return {
      userId: 'user_id',
      idNumber: 'id_number',
      mobile: 'mobile',
      age: 'age',
      creditScore: 'credit_score',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userId: 'string',
      idNumber: 'string',
      mobile: 'string',
      age: 'number',
      creditScore: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// x
export class PersonInfo extends $tea.Model {
  // 1
  /**
   * @example
   * 张三
   */
  cardInfos: CardInfos;
  // 123
  /**
   * @example
   * 张三
   */
  name: string;
  static names(): { [key: string]: string } {
    return {
      cardInfos: 'card_infos',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cardInfos: CardInfos,
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// aaa
export class A extends $tea.Model {
  static names(): { [key: string]: string } {
    return {
    };
  }

  static types(): { [key: string]: any } {
    return {
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 123
export class TestA extends $tea.Model {
  // 1
  /**
   * @example
   * 1
   */
  parameter1: string;
  // 2
  /**
   * @example
   * 2
   */
  parameter2: string;
  // 3
  /**
   * @example
   * 3
   */
  parameter3: string;
  // 4
  /**
   * @example
   * 4
   */
  parameter4: string;
  // 5
  /**
   * @example
   * 5
   */
  parameter5: string;
  // 6
  /**
   * @example
   * 6
   */
  parameter6: string;
  // 7
  /**
   * @example
   * 7
   */
  parameter7: string;
  // 8
  /**
   * @example
   * 8
   */
  parameter8: string;
  // 9
  /**
   * @example
   * 9
   */
  parameter9: string;
  // 10
  /**
   * @example
   * 10
   */
  parameter10: string;
  static names(): { [key: string]: string } {
    return {
      parameter1: 'parameter_1',
      parameter2: 'parameter_2',
      parameter3: 'parameter_3',
      parameter4: 'parameter_4',
      parameter5: 'parameter_5',
      parameter6: 'parameter_6',
      parameter7: 'parameter_7',
      parameter8: 'parameter_8',
      parameter9: 'parameter_9',
      parameter10: 'parameter_10',
    };
  }

  static types(): { [key: string]: any } {
    return {
      parameter1: 'string',
      parameter2: 'string',
      parameter3: 'string',
      parameter4: 'string',
      parameter5: 'string',
      parameter6: 'string',
      parameter7: 'string',
      parameter8: 'string',
      parameter9: 'string',
      parameter10: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ABC结构体C
export class AbcStructC extends $tea.Model {
  // string_c
  /**
   * @example
   * string_c
   */
  stringParamC?: string;
  // number_c
  /**
   * @example
   * 200
   */
  numberParamC?: number;
  // boolean_c
  /**
   * @example
   * true, false
   */
  booleanParamC?: boolean;
  // date_c
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  dateParamC?: string;
  // string_c
  /**
   * @example
   * string_c
   */
  arrayParamC?: string[];
  static names(): { [key: string]: string } {
    return {
      stringParamC: 'string_param_c',
      numberParamC: 'number_param_c',
      booleanParamC: 'boolean_param_c',
      dateParamC: 'date_param_c',
      arrayParamC: 'array_param_c',
    };
  }

  static types(): { [key: string]: any } {
    return {
      stringParamC: 'string',
      numberParamC: 'number',
      booleanParamC: 'boolean',
      dateParamC: 'string',
      arrayParamC: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ABC结构体B
export class AbcStructB extends $tea.Model {
  // string_b
  /**
   * @example
   * string_b
   */
  stringParamB?: string;
  // number_b
  /**
   * @example
   * 200
   */
  numberParamB?: number;
  // boolean_b
  /**
   * @example
   * true, false
   */
  booleanParamB?: boolean;
  // date_b
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  dateParamB?: string;
  // array_b
  /**
   * @example
   * array_param
   */
  arrayParamB?: AbcStructC[];
  // struct_b
  /**
   * @example
   * struct_param
   */
  structParamB?: AbcStructC;
  static names(): { [key: string]: string } {
    return {
      stringParamB: 'string_param_b',
      numberParamB: 'number_param_b',
      booleanParamB: 'boolean_param_b',
      dateParamB: 'date_param_b',
      arrayParamB: 'array_param_b',
      structParamB: 'struct_param_b',
    };
  }

  static types(): { [key: string]: any } {
    return {
      stringParamB: 'string',
      numberParamB: 'number',
      booleanParamB: 'boolean',
      dateParamB: 'string',
      arrayParamB: { 'type': 'array', 'itemType': AbcStructC },
      structParamB: AbcStructC,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ABC产品结构体A
export class AbcCreateStructA extends $tea.Model {
  // 【姓名】
  /**
   * @example
   * 张三
   */
  name?: string;
  // 【年龄】
  /**
   * @example
   * 18
   */
  age?: number;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      age: 'age',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      age: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ABC产品结构体B
export class AbcCreateStructB extends $tea.Model {
  // 【信息描述】
  /**
   * @example
   * 这是关于xxx的资料信息
   */
  info?: string;
  // 【地区】
  /**
   * @example
   * 浙江省杭州市
   */
  region?: string;
  static names(): { [key: string]: string } {
    return {
      info: 'info',
      region: 'region',
    };
  }

  static types(): { [key: string]: any } {
    return {
      info: 'string',
      region: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ABC产品结构体C
export class AbcCreateStructC extends $tea.Model {
  // 【个人信息】
  /**
   * @example
   * {"name":"张三","age":"18"}
   */
  personalInformation?: AbcCreateStructA;
  // 【地区信息】
  /**
   * @example
   * {"info":"xxxxx","region":"浙江省杭州市西湖区xx街道xxx-xx幢-xx号"}
   */
  regionalInformation?: AbcCreateStructB;
  // 【用例类型】
  /**
   * @example
   * caseType
   */
  caseName?: string;
  static names(): { [key: string]: string } {
    return {
      personalInformation: 'personal_information',
      regionalInformation: 'regional_information',
      caseName: 'case_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      personalInformation: AbcCreateStructA,
      regionalInformation: AbcCreateStructB,
      caseName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ABC产品结构体D
export class AbcCreateStructD extends $tea.Model {
  // 应用场景（payChannel =JDPAY仅支持MINI_APP） MINI_APP 小程序 APP 自有app ALL 两种都有
  /**
   * @example
   * ALL
   */
  applicationScene?: string;
  // 小程序id
  /**
   * @example
   * 小程序id
   */
  tinyAppId?: string;
  // 小程序名称
  /**
   * @example
   * xx小程序
   */
  siteName?: string;
  // 网站地址（pay_channel=ALIPAY必填）
  /**
   * @example
   * http://asdasas.com
   */
  sitUrl?: string;
  // 商户名称。（pay_channel=ALIPAY必填） 修改后的商户名称，将同步支付宝代扣签约页面字段展示
  /**
   * @example
   * xx商户
   */
  merchantName?: string;
  // 商户服务名称。（pay_channel=ALIPAY必填） 修改后的商户服务名称，将同步支付宝代扣签约页面字段展示
  /**
   * @example
   * xx商户服务
   */
  merchantServiceName?: string;
  static names(): { [key: string]: string } {
    return {
      applicationScene: 'application_scene',
      tinyAppId: 'tiny_app_id',
      siteName: 'site_name',
      sitUrl: 'sit_url',
      merchantName: 'merchant_name',
      merchantServiceName: 'merchant_service_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      applicationScene: 'string',
      tinyAppId: 'string',
      siteName: 'string',
      sitUrl: 'string',
      merchantName: 'string',
      merchantServiceName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ABC示例结构体（这是编辑后上线的）
export class AbcDemoStruct extends $tea.Model {
  // 字符串属性
  /**
   * @example
   * str
   */
  someString?: string;
  static names(): { [key: string]: string } {
    return {
      someString: 'some_string',
    };
  }

  static types(): { [key: string]: any } {
    return {
      someString: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ABC结构体A
export class AbcStructA extends $tea.Model {
  // string_a
  /**
   * @example
   * string
   */
  stringParamA?: string;
  // number_a
  /**
   * @example
   * 800
   */
  numberParamA?: number;
  // boolean_a
  /**
   * @example
   * true, false
   */
  booleanParamA?: boolean;
  // date_a
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  dateParamA?: string;
  // struct_a
  /**
   * @example
   * struct_param
   */
  structParamA?: AbcStructB;
  static names(): { [key: string]: string } {
    return {
      stringParamA: 'string_param_a',
      numberParamA: 'number_param_a',
      booleanParamA: 'boolean_param_a',
      dateParamA: 'date_param_a',
      structParamA: 'struct_param_a',
    };
  }

  static types(): { [key: string]: any } {
    return {
      stringParamA: 'string',
      numberParamA: 'number',
      booleanParamA: 'boolean',
      dateParamA: 'string',
      structParamA: AbcStructB,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 子结构体（这是编辑后的）
export class SubDemoStruct extends $tea.Model {
  // name
  /**
   * @example
   * name
   */
  name: string;
  // value
  /**
   * @example
   * value
   */
  value: string;
  // a
  /**
   * @example
   * a
   */
  a: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      value: 'value',
      a: 'a',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      value: 'string',
      a: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// test
export class TestParamC extends $tea.Model {
  // string_param
  /**
   * @example
   * string_param
   */
  stringParam?: string;
  // number_param
  /**
   * @example
   * 1
   */
  numberParam?: number;
  // boolean_param
  /**
   * @example
   * true, false
   */
  booleanParam?: boolean;
  // date_param
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  dateParam?: string;
  // string
  arrayParam?: string[];
  static names(): { [key: string]: string } {
    return {
      stringParam: 'string_param',
      numberParam: 'number_param',
      booleanParam: 'boolean_param',
      dateParam: 'date_param',
      arrayParam: 'array_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      stringParam: 'string',
      numberParam: 'number',
      booleanParam: 'boolean',
      dateParam: 'string',
      arrayParam: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// test for edit
export class TestParamB extends $tea.Model {
  // string_param
  /**
   * @example
   * string_param
   */
  stringParam?: string;
  // number_param
  /**
   * @example
   * 1
   */
  numberParam?: number;
  // boolean_param
  /**
   * @example
   * true, false
   */
  booleanParam?: boolean;
  // date_param
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  dateParam?: string;
  // struct_param
  structParam: TestParamC;
  // aa
  /**
   * @example
   * 3000
   */
  structListB?: TestParamC;
  static names(): { [key: string]: string } {
    return {
      stringParam: 'string_param',
      numberParam: 'number_param',
      booleanParam: 'boolean_param',
      dateParam: 'date_param',
      structParam: 'struct_param',
      structListB: 'struct_list_b',
    };
  }

  static types(): { [key: string]: any } {
    return {
      stringParam: 'string',
      numberParam: 'number',
      booleanParam: 'boolean',
      dateParam: 'string',
      structParam: TestParamC,
      structListB: TestParamC,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// test for edit
export class TestParamA extends $tea.Model {
  // string_param
  /**
   * @example
   * string_param
   */
  stringParam?: string;
  // number_param
  /**
   * @example
   * 1
   */
  numberParam?: number;
  // boolean_param
  /**
   * @example
   * true, false
   */
  booleanParam?: boolean;
  // date_param
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  dateParam?: string;
  // struct_parama
  structParama: TestParamB;
  // 结构体列表a
  /**
   * @example
   * undefined
   */
  structListA?: TestParamB[];
  static names(): { [key: string]: string } {
    return {
      stringParam: 'string_param',
      numberParam: 'number_param',
      booleanParam: 'boolean_param',
      dateParam: 'date_param',
      structParama: 'struct_parama',
      structListA: 'struct_list_a',
    };
  }

  static types(): { [key: string]: any } {
    return {
      stringParam: 'string',
      numberParam: 'number',
      booleanParam: 'boolean',
      dateParam: 'string',
      structParama: TestParamB,
      structListA: { 'type': 'array', 'itemType': TestParamB },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// a
export class TestDemo extends $tea.Model {
  // a
  /**
   * @example
   * a
   */
  timeout?: string;
  static names(): { [key: string]: string } {
    return {
      timeout: 'timeout',
    };
  }

  static types(): { [key: string]: any } {
    return {
      timeout: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 测试11-22
export class TestParams extends $tea.Model {
  // a
  /**
   * @example
   * undefined
   */
  parameter?: TestParamA;
  // string
  /**
   * @example
   * string
   */
  string?: string;
  static names(): { [key: string]: string } {
    return {
      parameter: 'parameter',
      string: 'string',
    };
  }

  static types(): { [key: string]: any } {
    return {
      parameter: TestParamA,
      string: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// aa
export class OrderA extends $tea.Model {
  // aa
  /**
   * @example
   * a
   */
  aaa?: string;
  static names(): { [key: string]: string } {
    return {
      aaa: 'aaa',
    };
  }

  static types(): { [key: string]: any } {
    return {
      aaa: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// DEMOSDK结构体A·edit for test18
export class DemosdkStructA extends $tea.Model {
  // 【公司名称】
  /**
   * @example
   * xx公司
   */
  companyName?: string;
  // 【业务类型】
  /**
   * @example
   * 运营
   */
  productMainClass?: string;
  // 【公司地址】
  /**
   * @example
   * xx市xx区
   */
  companyAddress?: string;
  // 【联系人】
  /**
   * @example
   * 张三
   */
  contactName?: string;
  // 【联系人手机号】
  /**
   * @example
   * 13688888888
   */
  contactMobile?: string;
  static names(): { [key: string]: string } {
    return {
      companyName: 'company_name',
      productMainClass: 'product_main_class',
      companyAddress: 'company_address',
      contactName: 'contact_name',
      contactMobile: 'contact_mobile',
    };
  }

  static types(): { [key: string]: any } {
    return {
      companyName: 'string',
      productMainClass: 'string',
      companyAddress: 'string',
      contactName: 'string',
      contactMobile: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 返回结果测试类-11
export class ResultTest extends $tea.Model {
  // 姓名
  /**
   * @example
   * 张三
   */
  name?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// aaa
export class CreateStructA extends $tea.Model {
  // 超时时间
  /**
   * @example
   * 3000
   */
  timeouta?: string;
  static names(): { [key: string]: string } {
    return {
      timeouta: 'timeouta',
    };
  }

  static types(): { [key: string]: any } {
    return {
      timeouta: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// a
export class SumBean extends $tea.Model {
  // 1
  /**
   * @example
   * 1
   */
  a?: number;
  static names(): { [key: string]: string } {
    return {
      a: 'a',
    };
  }

  static types(): { [key: string]: any } {
    return {
      a: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Demo类1
export class DemoClasses extends $tea.Model {
  // 字符串测试
  /**
   * @example
   * some string
   */
  someString: string;
  // 日期测试
  /**
   * @example
   * 3
   */
  someDate: string;
  // Boolean测试
  /**
   * @example
   * true
   */
  someBoolean: boolean;
  // 整数测试
  /**
   * @example
   * 3
   */
  someInt: number;
  // 列表测试
  someList: string[];
  static names(): { [key: string]: string } {
    return {
      someString: 'some_string',
      someDate: 'some_date',
      someBoolean: 'some_boolean',
      someInt: 'some_int',
      someList: 'some_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      someString: 'string',
      someDate: 'string',
      someBoolean: 'boolean',
      someInt: 'number',
      someList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 测试返回类
export class TesRes extends $tea.Model {
  // 证件号
  /**
   * @example
   * 12345
   */
  idcard: string;
  static names(): { [key: string]: string } {
    return {
      idcard: 'idcard',
    };
  }

  static types(): { [key: string]: any } {
    return {
      idcard: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDemoStreamTestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 名称
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDemoStreamTestResponse extends $tea.Model {
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

export class QueryDemoTestTimeTestaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // a
  a?: string;
  // b
  b?: TestClass;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      a: 'a',
      b: 'b',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      a: 'string',
      b: TestClass,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDemoTestTimeTestaResponse extends $tea.Model {
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

export class QueryDemoTtUseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 测试
  idCard?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      idCard: 'id_card',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      idCard: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDemoTtUseResponse extends $tea.Model {
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

export class QueryDemoUtListRequest extends $tea.Model {
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

export class QueryDemoUtListResponse extends $tea.Model {
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

export class QueryAntchainAbcTimeFiveRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 下游超时时间
  timeout?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      timeout: 'timeout',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      timeout: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAbcTimeFiveResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码
  stauts?: string;
  // OK
  msg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      stauts: 'stauts',
      msg: 'msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      stauts: 'string',
      msg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAbcApprovalTestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 入参
  input: string;
  // 新增字段
  delete: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      input: 'input',
      delete: 'delete',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      input: 'string',
      delete: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAbcApprovalTestResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 回参
  msg?: string;
  // 新增字段
  code?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      code: 'code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      code: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApiAntchainAbcTestCreateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 1
  timeout: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      timeout: 'timeout',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      timeout: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApiAntchainAbcTestCreateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求返回描述
  status?: string;
  // msg
  msg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      msg: 'msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      msg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAbcOneLimitRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时时间
  timeout: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      timeout: 'timeout',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      timeout: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAbcOneLimitResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码
  stauts?: string;
  // 状态码描述
  msg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      stauts: 'stauts',
      msg: 'msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      stauts: 'string',
      msg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportAntchainAbcOneLimitRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时时间
  timeout: string;
  // 123
  idcard?: AbcDemoStruct;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      timeout: 'timeout',
      idcard: 'idcard',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      timeout: 'string',
      idcard: AbcDemoStruct,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportAntchainAbcOneLimitResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码
  stauts?: string;
  // 状态描述
  msg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      stauts: 'stauts',
      msg: 'msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      stauts: 'string',
      msg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnstabilizeAntchainAbcOneLimitRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时时间
  timeout: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      timeout: 'timeout',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      timeout: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnstabilizeAntchainAbcOneLimitResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果码描述
  msg?: string;
  // 状态码
  stauts?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      stauts: 'stauts',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      stauts: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApibAntchainDemointernationalxjpInternationalPushRequest extends $tea.Model {
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

export class ApibAntchainDemointernationalxjpInternationalPushResponse extends $tea.Model {
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

export class BindAntchainDemosdkXxxRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 123
  date: string;
  // 123
  data: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      date: 'date',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      date: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindAntchainDemosdkXxxResponse extends $tea.Model {
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

export class ZzzAntchainDemosdkAaaBbbRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 123
  date: string;
  // 123
  data: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      date: 'date',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      date: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ZzzAntchainDemosdkAaaBbbResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 名称
  name?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallDemoAaaBbbCccRequest extends $tea.Model {
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

export class CallDemoAaaBbbCccResponse extends $tea.Model {
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
   * @remarks
   * Init client with Config
   * 
   * @param config - config contains the necessary information to create a client
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
   * @remarks
   * Encapsulate the request and invoke the network
   * 
   * @param action - api name
   * @param protocol - http or https
   * @param method - e.g. GET
   * @param pathname - pathname of every api
   * @param request - which contains request params
   * @param runtime - which controls some details of call api, such as retry times
   * @returns the response
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
          sdk_version: "2.0.5",
          _prod_code: "QQQ",
          _prod_channel: "default",
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
   * @remarks
   * Description: 流失查询测试
   * Summary: 流失查询测试
   */
  async queryDemoStreamTest(request: QueryDemoStreamTestRequest): Promise<QueryDemoStreamTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDemoStreamTestEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 流失查询测试
   * Summary: 流失查询测试
   */
  async queryDemoStreamTestEx(request: QueryDemoStreamTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDemoStreamTestResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDemoStreamTestResponse>(await this.doRequest("1.0", "demo.stream.test.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDemoStreamTestResponse({}));
  }

  /**
   * @remarks
   * Description: 个人工作台二期测试
   * Summary: 个人工作台二期测试
   */
  async queryDemoTestTimeTesta(request: QueryDemoTestTimeTestaRequest): Promise<QueryDemoTestTimeTestaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDemoTestTimeTestaEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 个人工作台二期测试
   * Summary: 个人工作台二期测试
   */
  async queryDemoTestTimeTestaEx(request: QueryDemoTestTimeTestaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDemoTestTimeTestaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDemoTestTimeTestaResponse>(await this.doRequest("1.0", "demo.test.time.testa.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDemoTestTimeTestaResponse({}));
  }

  /**
   * @remarks
   * Description: s
   * Summary: s
   */
  async queryDemoTtUse(request: QueryDemoTtUseRequest): Promise<QueryDemoTtUseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDemoTtUseEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: s
   * Summary: s
   */
  async queryDemoTtUseEx(request: QueryDemoTtUseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDemoTtUseResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDemoTtUseResponse>(await this.doRequest("1.0", "demo.tt.use.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDemoTtUseResponse({}));
  }

  /**
   * @remarks
   * Description: x
   * Summary: x
   */
  async queryDemoUtList(request: QueryDemoUtListRequest): Promise<QueryDemoUtListResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDemoUtListEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: x
   * Summary: x
   */
  async queryDemoUtListEx(request: QueryDemoUtListRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDemoUtListResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDemoUtListResponse>(await this.doRequest("1.0", "demo.ut.list.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDemoUtListResponse({}));
  }

  /**
   * @remarks
   * Description: 压测接口5
   * Summary: 压测接口5
   */
  async queryAntchainAbcTimeFive(request: QueryAntchainAbcTimeFiveRequest): Promise<QueryAntchainAbcTimeFiveResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainAbcTimeFiveEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 压测接口5
   * Summary: 压测接口5
   */
  async queryAntchainAbcTimeFiveEx(request: QueryAntchainAbcTimeFiveRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainAbcTimeFiveResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainAbcTimeFiveResponse>(await this.doRequest("1.0", "antchain.abc.time.five.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainAbcTimeFiveResponse({}));
  }

  /**
   * @remarks
   * Description: 用于测试api评审接入SDL/修改后的评审/0323
   * Summary: 用于测试api评审接入SDL/修改后的评审/0323
   */
  async queryAntchainAbcApprovalTest(request: QueryAntchainAbcApprovalTestRequest): Promise<QueryAntchainAbcApprovalTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainAbcApprovalTestEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 用于测试api评审接入SDL/修改后的评审/0323
   * Summary: 用于测试api评审接入SDL/修改后的评审/0323
   */
  async queryAntchainAbcApprovalTestEx(request: QueryAntchainAbcApprovalTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainAbcApprovalTestResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainAbcApprovalTestResponse>(await this.doRequest("1.0", "antchain.abc.approval.test.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainAbcApprovalTestResponse({}));
  }

  /**
   * @remarks
   * Description: 测试使用api
   * Summary: 测试使用api
   */
  async apiAntchainAbcTestCreate(request: ApiAntchainAbcTestCreateRequest): Promise<ApiAntchainAbcTestCreateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.apiAntchainAbcTestCreateEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试使用api
   * Summary: 测试使用api
   */
  async apiAntchainAbcTestCreateEx(request: ApiAntchainAbcTestCreateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApiAntchainAbcTestCreateResponse> {
    Util.validateModel(request);
    return $tea.cast<ApiAntchainAbcTestCreateResponse>(await this.doRequest("1.0", "antchain.abc.test.create.api", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApiAntchainAbcTestCreateResponse({}));
  }

  /**
   * @remarks
   * Description: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
   * Summary: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
   */
  async queryAntchainAbcOneLimit(request: QueryAntchainAbcOneLimitRequest): Promise<QueryAntchainAbcOneLimitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainAbcOneLimitEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
   * Summary: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
   */
  async queryAntchainAbcOneLimitEx(request: QueryAntchainAbcOneLimitRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainAbcOneLimitResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainAbcOneLimitResponse>(await this.doRequest("1.0", "antchain.abc.one.limit.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainAbcOneLimitResponse({}));
  }

  /**
   * @remarks
   * Description: 个人工作台二期预发测试
   * Summary: 个人工作台二期预发测试
   */
  async importAntchainAbcOneLimit(request: ImportAntchainAbcOneLimitRequest): Promise<ImportAntchainAbcOneLimitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importAntchainAbcOneLimitEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 个人工作台二期预发测试
   * Summary: 个人工作台二期预发测试
   */
  async importAntchainAbcOneLimitEx(request: ImportAntchainAbcOneLimitRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportAntchainAbcOneLimitResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportAntchainAbcOneLimitResponse>(await this.doRequest("1.0", "antchain.abc.one.limit.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportAntchainAbcOneLimitResponse({}));
  }

  /**
   * @remarks
   * Description: 个人工作台二期测试接口
   * Summary: 个人工作台二期测试接口
   */
  async unstabilizeAntchainAbcOneLimit(request: UnstabilizeAntchainAbcOneLimitRequest): Promise<UnstabilizeAntchainAbcOneLimitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.unstabilizeAntchainAbcOneLimitEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 个人工作台二期测试接口
   * Summary: 个人工作台二期测试接口
   */
  async unstabilizeAntchainAbcOneLimitEx(request: UnstabilizeAntchainAbcOneLimitRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UnstabilizeAntchainAbcOneLimitResponse> {
    Util.validateModel(request);
    return $tea.cast<UnstabilizeAntchainAbcOneLimitResponse>(await this.doRequest("1.0", "antchain.abc.one.limit.unstabilize", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UnstabilizeAntchainAbcOneLimitResponse({}));
  }

  /**
   * @remarks
   * Description: 新加坡push
   * Summary: 新加坡push
   */
  async apibAntchainDemointernationalxjpInternationalPush(request: ApibAntchainDemointernationalxjpInternationalPushRequest): Promise<ApibAntchainDemointernationalxjpInternationalPushResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.apibAntchainDemointernationalxjpInternationalPushEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 新加坡push
   * Summary: 新加坡push
   */
  async apibAntchainDemointernationalxjpInternationalPushEx(request: ApibAntchainDemointernationalxjpInternationalPushRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApibAntchainDemointernationalxjpInternationalPushResponse> {
    Util.validateModel(request);
    return $tea.cast<ApibAntchainDemointernationalxjpInternationalPushResponse>(await this.doRequest("1.0", "antchain.demointernationalxjp.international.push.apib", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApibAntchainDemointernationalxjpInternationalPushResponse({}));
  }

  /**
   * @remarks
   * Description: 自动化测试创建test，请勿修改、删除
   * Summary: 自动化测试创建test，请勿修改、删除
   */
  async bindAntchainDemosdkXxx(request: BindAntchainDemosdkXxxRequest): Promise<BindAntchainDemosdkXxxResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindAntchainDemosdkXxxEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 自动化测试创建test，请勿修改、删除
   * Summary: 自动化测试创建test，请勿修改、删除
   */
  async bindAntchainDemosdkXxxEx(request: BindAntchainDemosdkXxxRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindAntchainDemosdkXxxResponse> {
    Util.validateModel(request);
    return $tea.cast<BindAntchainDemosdkXxxResponse>(await this.doRequest("1.0", "antchain.demosdk.xxx.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindAntchainDemosdkXxxResponse({}));
  }

  /**
   * @remarks
   * Description: 自动化测试创建test，请勿修改、删除
   * Summary: 自动化测试创建test，请勿修改、删除
   */
  async zzzAntchainDemosdkAaaBbb(request: ZzzAntchainDemosdkAaaBbbRequest): Promise<ZzzAntchainDemosdkAaaBbbResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.zzzAntchainDemosdkAaaBbbEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 自动化测试创建test，请勿修改、删除
   * Summary: 自动化测试创建test，请勿修改、删除
   */
  async zzzAntchainDemosdkAaaBbbEx(request: ZzzAntchainDemosdkAaaBbbRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ZzzAntchainDemosdkAaaBbbResponse> {
    Util.validateModel(request);
    return $tea.cast<ZzzAntchainDemosdkAaaBbbResponse>(await this.doRequest("1.0", "antchain.demosdk.aaa.bbb.zzz", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ZzzAntchainDemosdkAaaBbbResponse({}));
  }

  /**
   * @remarks
   * Description: 自动化测试创建test，请勿修改、删除
   * Summary: 自动化测试创建test，请勿修改、删除
   */
  async callDemoAaaBbbCcc(request: CallDemoAaaBbbCccRequest): Promise<CallDemoAaaBbbCccResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callDemoAaaBbbCccEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 自动化测试创建test，请勿修改、删除
   * Summary: 自动化测试创建test，请勿修改、删除
   */
  async callDemoAaaBbbCccEx(request: CallDemoAaaBbbCccRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallDemoAaaBbbCccResponse> {
    Util.validateModel(request);
    return $tea.cast<CallDemoAaaBbbCccResponse>(await this.doRequest("1.0", "demo.aaa.bbb.ccc.call", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallDemoAaaBbbCccResponse({}));
  }

}
