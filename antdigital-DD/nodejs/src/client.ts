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

// 商品明细
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

// 访问IaaS层的身份
export class Accessor extends $tea.Model {
  // Accessor关联的AccessKey
  /**
   * @example
   * LTAIyqaeoWfELqMg
   */
  accessKey?: string;
  // Accessor关联的AccessKey的密钥，加密传输，网关返回后，使用调用方的AccessSecret进行解密
  accessSecret?: string;
  // AccessKey的密钥，加密传输，网关返回后，使用调用方的AccessSecret进行解密
  account?: string;
  // AccessKey创建时间，ISO8601格式
  createTime?: string;
  // Accessor唯一标识
  id?: string;
  // Accessor类型(RAM/ACCOUNT)
  /**
   * @example
   * RAM
   */
  type?: string;
  static names(): { [key: string]: string } {
    return {
      accessKey: 'access_key',
      accessSecret: 'access_secret',
      account: 'account',
      createTime: 'create_time',
      id: 'id',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accessKey: 'string',
      accessSecret: 'string',
      account: 'string',
      createTime: 'string',
      id: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 标签实体
export class Tag extends $tea.Model {
  // 标签类型
  /**
   * @example
   * CHANNEL_SCENE
   */
  tagType: string;
  // 标签值
  /**
   * @example
   * BAASDT_IPAE
   */
  tagValue: string;
  static names(): { [key: string]: string } {
    return {
      tagType: 'tag_type',
      tagValue: 'tag_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tagType: 'string',
      tagValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AccessKey
export class AccessKey extends $tea.Model {
  // AccessKey创建时间，ISO8601格式
  createTime?: string;
  // AccessKey唯一标识
  /**
   * @example
   * LTAIyqaeoWfELqMg
   */
  id?: string;
  // AccessKey的秘钥，加密传输，网关返回后，使用调用方的AccesSecret进行解密
  secret?: string;
  // 状态
  /**
   * @example
   * ACTIVE
   */
  status?: string;
  // AccessKey最近一次修改时间，ISO8601格式
  updateTime?: string;
  static names(): { [key: string]: string } {
    return {
      createTime: 'create_time',
      id: 'id',
      secret: 'secret',
      status: 'status',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      createTime: 'string',
      id: 'string',
      secret: 'string',
      status: 'string',
      updateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业
export class Customer extends $tea.Model {
  // 企业创建时间，ISO8601格式
  createTime?: string;
  // 企业ID
  /**
   * @example
   * 2088xxxxx1
   */
  id?: string;
  // 企业名称
  /**
   * @example
   * 蚂蚁金融云有限公司
   */
  name?: string;
  // 企业最近一次修改时间，ISO8601格式
  updateTime?: string;
  static names(): { [key: string]: string } {
    return {
      createTime: 'create_time',
      id: 'id',
      name: 'name',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      createTime: 'string',
      id: 'string',
      name: 'string',
      updateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 租户
export class Tenant extends $tea.Model {
  // 蚂蚁通行证签约账户
  /**
   * @example
   * antcloud@alipay.com
   */
  antAccount?: string;
  // 蚂蚁通行证uid
  /**
   * @example
   * 2088xxxxx1
   */
  antUid?: string;
  // 金融云官网:ANTCLOUD,蚂蚁开放平台：ANTOPEN
  /**
   * @example
   * ANTCLOUD
   */
  businessOwnerId?: string;
  // 租户创建时间，ISO8601格式
  createTime?: string;
  // 租户所在的企业的唯一标识
  /**
   * @example
   * 2088201881714570
   */
  customer?: string;
  // 租户描述信息
  /**
   * @example
   * the default tenant
   */
  description?: string;
  // 租户唯一标识
  /**
   * @example
   * TSCPDICN
   */
  id?: string;
  // 租户内部id
  /**
   * @example
   * 0000000001
   */
  internalId?: string;
  // 租户显示名称
  /**
   * @example
   * myTenant
   */
  name?: string;
  // 租户最近一次修改时间，ISO8601格式
  updateTime?: string;
  static names(): { [key: string]: string } {
    return {
      antAccount: 'ant_account',
      antUid: 'ant_uid',
      businessOwnerId: 'business_owner_id',
      createTime: 'create_time',
      customer: 'customer',
      description: 'description',
      id: 'id',
      internalId: 'internal_id',
      name: 'name',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      antAccount: 'string',
      antUid: 'string',
      businessOwnerId: 'string',
      createTime: 'string',
      customer: 'string',
      description: 'string',
      id: 'string',
      internalId: 'string',
      name: 'string',
      updateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 权限点
export class Action extends $tea.Model {
  // 权限点ID
  /**
   * @example
   * A0000000001
   */
  id?: string;
  // 权限点名称
  /**
   * @example
   * antcloud.xxx.xxx.labelinfo.query
   */
  name?: string;
  // 类型
  /**
   * @example
   * INNER
   */
  type?: string;
  // 状态
  /**
   * @example
   * NORMAL
   */
  status?: string;
  // 描述
  /**
   * @example
   *  
   */
  description?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      type: 'type',
      status: 'status',
      description: 'description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      type: 'string',
      status: 'string',
      description: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 项目
export class Project extends $tea.Model {
  // 项目ID
  /**
   * @example
   * 1232132131
   */
  projectId: string;
  // 项目名称
  /**
   * @example
   * 默认项目
   */
  projectName: string;
  // 项目描述
  /**
   * @example
   * 我是项目描述
   */
  description?: string;
  // 是否为默认项目
  /**
   * @example
   * true
   */
  isDefault: boolean;
  // 创建时间
  /**
   * @example
   * 2026-04-21 09:57:21
   */
  gmtCreate: string;
  // 更新时间
  /**
   * @example
   * 2026-04-21 09:57:21
   */
  gmtModified: string;
  static names(): { [key: string]: string } {
    return {
      projectId: 'project_id',
      projectName: 'project_name',
      description: 'description',
      isDefault: 'is_default',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      projectId: 'string',
      projectName: 'string',
      description: 'string',
      isDefault: 'boolean',
      gmtCreate: 'string',
      gmtModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 授权条件
export class Condition extends $tea.Model {
  //  
  /**
   * @example
   *  
   */
  key?: string;
  //  
  /**
   * @example
   *  
   */
  value?: string[];
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 角色
export class Role extends $tea.Model {
  // 角色ID
  /**
   * @example
   *  
   */
  id?: string;
  // 角色名称
  // 
  /**
   * @example
   *  
   */
  name?: string;
  // 角色类型，CUSTOM:自定义角色，COMMON:系统通用角色
  /**
   * @example
   *  
   */
  type?: string;
  // 角色描述
  // 
  /**
   * @example
   *  
   */
  description?: string;
  // 状态
  /**
   * @example
   * NORMAL
   */
  status?: string;
  // 所有者
  /**
   * @example
   * AntCloud
   */
  owner?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      type: 'type',
      description: 'description',
      status: 'status',
      owner: 'owner',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      type: 'string',
      description: 'string',
      status: 'string',
      owner: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 操作员
export class Operator extends $tea.Model {
  // 操作员创建时间，ISO8601格式
  createTime?: string;
  // 操作员所在的企业
  customer?: string;
  // 邮箱
  /**
   * @example
   * zhangsan@alipay.com
   */
  email?: string;
  // 外部对接系统操作员id
  /**
   * @example
   * ding0000001
   */
  externalId?: string;
  // 外部对接系统类型
  /**
   * @example
   * DING_TALK
   */
  externalSystem?: string;
  // 操作员ID
  /**
   * @example
   * 0000000001
   */
  id?: string;
  // 登录名
  loginName?: string;
  // 手机号
  mobile?: string;
  // 昵称
  nickname?: string;
  // 真实姓名
  realName?: string;
  // 部门唯一码
  /**
   * @example
   *  
   */
  departmentCode?: string;
  // 操作员状态(INACTIVE：未激活，NORMAL：正常状态，FROZEN：冻结状态)
  status?: string;
  // 操作员加入的租户列表
  tenants?: string[];
  // 操作员最近一次修改时间，ISO8601格式
  updateTime?: string;
  static names(): { [key: string]: string } {
    return {
      createTime: 'create_time',
      customer: 'customer',
      email: 'email',
      externalId: 'external_id',
      externalSystem: 'external_system',
      id: 'id',
      loginName: 'login_name',
      mobile: 'mobile',
      nickname: 'nickname',
      realName: 'real_name',
      departmentCode: 'department_code',
      status: 'status',
      tenants: 'tenants',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      createTime: 'string',
      customer: 'string',
      email: 'string',
      externalId: 'string',
      externalSystem: 'string',
      id: 'string',
      loginName: 'string',
      mobile: 'string',
      nickname: 'string',
      realName: 'string',
      departmentCode: 'string',
      status: 'string',
      tenants: { 'type': 'array', 'itemType': 'string' },
      updateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 范围value
export class RangeValue extends $tea.Model {
  // 范围类型
  /**
   * @example
   * ()
   */
  rangeType: string;
  // 范围最小值
  /**
   * @example
   * 1
   */
  minValue?: number;
  // 范围最大值
  /**
   * @example
   * 10000
   */
  maxValue?: number;
  // 范围类型时候步长
  /**
   * @example
   * 1
   */
  step?: number;
  static names(): { [key: string]: string } {
    return {
      rangeType: 'range_type',
      minValue: 'min_value',
      maxValue: 'max_value',
      step: 'step',
    };
  }

  static types(): { [key: string]: any } {
    return {
      rangeType: 'string',
      minValue: 'number',
      maxValue: 'number',
      step: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 模拟key和value都为String的map
export class StringMap extends $tea.Model {
  // key
  /**
   * @example
   * 1
   */
  key?: string;
  // value
  /**
   * @example
   * 1
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

// 计量项值限制
export class FieldValueLimit extends $tea.Model {
  // 枚举值，计量项为配置项的时候使用
  /**
   * @example
   * code,中文名
   */
  valueList?: StringMap[];
  // 范围value
  rangeValue?: RangeValue;
  // 范围类型
  /**
   * @example
   * num
   */
  valueDataType?: string;
  static names(): { [key: string]: string } {
    return {
      valueList: 'value_list',
      rangeValue: 'range_value',
      valueDataType: 'value_data_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      valueList: { 'type': 'array', 'itemType': StringMap },
      rangeValue: RangeValue,
      valueDataType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 计费因子
export class BillingFactorMeta extends $tea.Model {
  // 费用code
  /**
   * @example
   * 费用code
   */
  feeCode?: string;
  // 因子code
  /**
   * @example
   * test
   */
  factorCode?: string;
  // 因子名称
  /**
   * @example
   * 因子名称
   */
  factorName?: string;
  // 因子类型
  /**
   * @example
   * 计费，规格
   */
  factorType?: string;
  // 因子单位
  /**
   * @example
   * 元
   */
  factorUnit?: string;
  // 计量项code
  /**
   * @example
   * 计量项code
   */
  meterFeildCode?: string;
  // 转换比率，用于展示转换
  /**
   * @example
   * 1
   */
  factorRatio?: string;
  // 是否抵扣资源包
  /**
   * @example
   * true, false
   */
  deductRespackage?: boolean;
  // 是否累计
  /**
   * @example
   * true, false
   */
  isCumulative?: boolean;
  // 数据来源，配置，计量数据
  /**
   * @example
   * use_data
   */
  valOriginal?: string;
  // 默认值
  /**
   * @example
   * 默认值
   */
  defaultValue?: string;
  // 拓展信息
  /**
   * @example
   * 拓展信息
   */
  extraInfo?: string;
  // 订购模型，价格模型
  /**
   * @example
   * 01
   */
  factorModelType?: string;
  static names(): { [key: string]: string } {
    return {
      feeCode: 'fee_code',
      factorCode: 'factor_code',
      factorName: 'factor_name',
      factorType: 'factor_type',
      factorUnit: 'factor_unit',
      meterFeildCode: 'meter_feild_code',
      factorRatio: 'factor_ratio',
      deductRespackage: 'deduct_respackage',
      isCumulative: 'is_cumulative',
      valOriginal: 'val_original',
      defaultValue: 'default_value',
      extraInfo: 'extra_info',
      factorModelType: 'factor_model_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      feeCode: 'string',
      factorCode: 'string',
      factorName: 'string',
      factorType: 'string',
      factorUnit: 'string',
      meterFeildCode: 'string',
      factorRatio: 'string',
      deductRespackage: 'boolean',
      isCumulative: 'boolean',
      valOriginal: 'string',
      defaultValue: 'string',
      extraInfo: 'string',
      factorModelType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 资源包约束
export class ResourcePackageConstraintMeta extends $tea.Model {
  // 模板code
  /**
   * @example
   * test_deadline
   */
  templateName: string;
  // 约束码
  /**
   * @example
   * productCode
   */
  constraintCode: string;
  // 约束名称
  /**
   * @example
   * 抵扣约束
   */
  constraintName: string;
  // 约束表达式
  /**
   * @example
   * ql表达式
   */
  constraintExpression: string;
  // 约束类型
  /**
   * @example
   * DEDUCT
   */
  constraintType: string;
  static names(): { [key: string]: string } {
    return {
      templateName: 'template_name',
      constraintCode: 'constraint_code',
      constraintName: 'constraint_name',
      constraintExpression: 'constraint_expression',
      constraintType: 'constraint_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      templateName: 'string',
      constraintCode: 'string',
      constraintName: 'string',
      constraintExpression: 'string',
      constraintType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// DomainSLS配置
export class DomainSls extends $tea.Model {
  // 拉取sql
  /**
   * @example
   * select from
   */
  sql?: string;
  // 拉取SLS间隔
  /**
   * @example
   * 1_h
   */
  interval?: string;
  // 属性项
  /**
   * @example
   * {"code":"code"}
   */
  memo?: string;
  static names(): { [key: string]: string } {
    return {
      sql: 'sql',
      interval: 'interval',
      memo: 'memo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sql: 'string',
      interval: 'string',
      memo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 计量节点
export class DomainNode extends $tea.Model {
  // node字段
  // 目前可选枚举：CENTER, ODPS, MANUAL, SLS;
  //   也可以自定义
  /**
   * @example
   * CENTER
   */
  code?: string;
  // node英文名称
  /**
   * @example
   * node英文名称
   */
  englishName?: string;
  // 中文名称
  /**
   * @example
   * 中文名称
   */
  chineseName?: string;
  // 默认需要check
  /**
   * @example
   * true, false
   */
  needCheck?: boolean;
  // 默认超时时间,单位:m
  timeOut?: number;
  // 描述
  /**
   * @example
   * 描述
   */
  memo?: string;
  // 状态
  /**
   * @example
   * VALID
   */
  status?: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      englishName: 'english_name',
      chineseName: 'chinese_name',
      needCheck: 'need_check',
      timeOut: 'time_out',
      memo: 'memo',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      englishName: 'string',
      chineseName: 'string',
      needCheck: 'boolean',
      timeOut: 'number',
      memo: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 主键规则配置
export class PrimaryKeyGenRule extends $tea.Model {
  // 规则code
  /**
   * @example
   * test;instance
   */
  ruleCode?: string;
  // 规则名称
  /**
   * @example
   * 主键规则
   */
  chineseName?: string;
  // 规则englishName
  /**
   * @example
   * test
   */
  englishName?: string;
  // 规则包括的fiel列表
  /**
   * @example
   * field1,field2,field3
   */
  primaryKeys?: string;
  static names(): { [key: string]: string } {
    return {
      ruleCode: 'rule_code',
      chineseName: 'chinese_name',
      englishName: 'english_name',
      primaryKeys: 'primary_keys',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ruleCode: 'string',
      chineseName: 'string',
      englishName: 'string',
      primaryKeys: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 计量域成员信息
export class MeterDomainMember extends $tea.Model {
  // 角色
  /**
   * @example
   * develooper
   */
  role?: string;
  // 成员id
  /**
   * @example
   * workNo
   */
  userId?: string;
  // 成员昵称
  /**
   * @example
   * 成员昵称
   */
  nickName?: string;
  // 成员姓名
  /**
   * @example
   * 成员姓名
   */
  name?: string;
  static names(): { [key: string]: string } {
    return {
      role: 'role',
      userId: 'user_id',
      nickName: 'nick_name',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      role: 'string',
      userId: 'string',
      nickName: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 抵扣的计量项
export class DeductOmsField extends $tea.Model {
  // 抵扣的资源包商品
  /**
   * @example
   * testcode
   */
  productCode?: string;
  // 计量项列表
  omsField?: string[];
  static names(): { [key: string]: string } {
    return {
      productCode: 'product_code',
      omsField: 'oms_field',
    };
  }

  static types(): { [key: string]: any } {
    return {
      productCode: 'string',
      omsField: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 计量项模型
export class DomainField extends $tea.Model {
  // 计量项code
  /**
   * @example
   * request_num
   */
  code?: string;
  // 计量项英文名
  /**
   * @example
   * test
   */
  englishName?: string;
  // 计量字段中文名称
  /**
   * @example
   * 调用量
   */
  chineseName?: string;
  //    枚举，可选
  //       配置型
  //      消耗型
  //      *其他
  /**
   * @example
   * config
   */
  fieldType?: string;
  // 字段构成索引时的格式化长度<br>
  /**
   * @example
   * -1
   */
  formatLength?: string;
  // 默认值,可选
  /**
   * @example
   * 123
   */
  defaultValue?: string;
  // 是否必填，默认必填写
  /**
   * @example
   * Y
   */
  ifNull?: string;
  // 是否增量推送
  /**
   * @example
   * N
   */
  ifIncrement?: string;
  // 单位
  /**
   * @example
   * 元
   */
  unit?: string;
  // 计量项说明
  /**
   * @example
   * 计量项说明
   */
  remark?: string;
  // 关联字段排序
  /**
   * @example
   * 01
   */
  column?: string;
  // 计量项值约束
  fieldValueLimit?: FieldValueLimit;
  // 聚合方式
  /**
   * @example
   * SUM
   */
  aggregationType?: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      englishName: 'english_name',
      chineseName: 'chinese_name',
      fieldType: 'field_type',
      formatLength: 'format_length',
      defaultValue: 'default_value',
      ifNull: 'if_null',
      ifIncrement: 'if_increment',
      unit: 'unit',
      remark: 'remark',
      column: 'column',
      fieldValueLimit: 'field_value_limit',
      aggregationType: 'aggregation_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      englishName: 'string',
      chineseName: 'string',
      fieldType: 'string',
      formatLength: 'string',
      defaultValue: 'string',
      ifNull: 'string',
      ifIncrement: 'string',
      unit: 'string',
      remark: 'string',
      column: 'string',
      fieldValueLimit: FieldValueLimit,
      aggregationType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 多币种货币类
export class MultiCurrencyMoney extends $tea.Model {
  // 金额，以分为单位
  cent: number;
  // 支付宝体系内一般存储币种值
  /**
   * @example
   * 156
   */
  currencyValue: string;
  static names(): { [key: string]: string } {
    return {
      cent: 'cent',
      currencyValue: 'currency_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cent: 'number',
      currencyValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 资源包配置信息
export class RespackageConfVO extends $tea.Model {
  // 模板code
  /**
   * @example
   * test_deadline
   */
  templateCode?: string;
  // 模板展示名称
  /**
   * @example
   * 资源包模板
   */
  templateName?: string;
  // 资源包模板维度
  /**
   * @example
   * Single
   */
  templateDimension?: string;
  // 产品名称 -> 商品模型2.0中的渠道产品Code
  /**
   * @example
   * testcode
   */
  productCode?: string;
  // 商品名称 -> 商品模型2.0中的offerInnerCode
  /**
   * @example
   * testcode
   */
  offerCode?: string;
  // 抵扣的量价商品 -> 商品模型2.0中的渠道产品Code
  deductProductCode?: string[];
  // 抵扣的量价商品与计量项的关系
  deductOmsField?: DeductOmsField[];
  // 资源包抵扣类型
  /**
   * @example
   * PeriodMonthly
   */
  deductType?: string;
  // 产时的规格约束
  specification?: StringMap[];
  // 是否计算金额
  calcAmount?: boolean;
  // 是否使用子包
  /**
   * @example
   * true, false
   */
  subPack?: boolean;
  // 子包切分规则 None(不切割)、NaturalMonth(按自然月切割) 、SubscribeMonth(按订单月切割) *
  /**
   * @example
   * None
   */
  subPackSplitType?: string;
  // 关联子包模版
  /**
   * @example
   * template
   */
  relTemplate?: string;
  static names(): { [key: string]: string } {
    return {
      templateCode: 'template_code',
      templateName: 'template_name',
      templateDimension: 'template_dimension',
      productCode: 'product_code',
      offerCode: 'offer_code',
      deductProductCode: 'deduct_product_code',
      deductOmsField: 'deduct_oms_field',
      deductType: 'deduct_type',
      specification: 'specification',
      calcAmount: 'calc_amount',
      subPack: 'sub_pack',
      subPackSplitType: 'sub_pack_split_type',
      relTemplate: 'rel_template',
    };
  }

  static types(): { [key: string]: any } {
    return {
      templateCode: 'string',
      templateName: 'string',
      templateDimension: 'string',
      productCode: 'string',
      offerCode: 'string',
      deductProductCode: { 'type': 'array', 'itemType': 'string' },
      deductOmsField: { 'type': 'array', 'itemType': DeductOmsField },
      deductType: 'string',
      specification: { 'type': 'array', 'itemType': StringMap },
      calcAmount: 'boolean',
      subPack: 'boolean',
      subPackSplitType: 'string',
      relTemplate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 计费计划信息
export class BillingPlanVO extends $tea.Model {
  // 计费规则code
  /**
   * @example
   * 计费规则code
   */
  billingRuleCode?: string;
  // 计量域code
  /**
   * @example
   * domain_code
   */
  domainCode?: string;
  // 产品名称 -> 商品模型2.0中的渠道产品Code
  /**
   * @example
   * DYC
   */
  productCode?: string;
  // 商品名称 -> 商品模型2.0中的offerInnerCode
  /**
   * @example
   * twc_post
   */
  offerCode?: string;
  // 采集维度，主实例/逻辑实例，默认主实例
  /**
   * @example
   * mterid#instanceId
   */
  billDimension?: string;
  // 是否启用资源包，默认是
  /**
   * @example
   * true, false
   */
  enableResourcePackage?: boolean;
  // 累计模式(月/年/指定时间)
  /**
   * @example
   * month
   */
  cumulateCycle?: string;
  // 转账类型(数字商品户解冻/文娱链户解冻/权益宝户解冻)，默认空
  /**
   * @example
   * 文娱链户解冻
   */
  transferType?: string;
  // 支付类型(代扣)，默认空
  /**
   * @example
   * out
   */
  payAcceptType?: string;
  // 核销类型(业务侧)，默认空
  /**
   * @example
   * 核销类型(业务侧)，默认空
   */
  writeOffType?: string;
  // 单次计价最大价格保护（元），默认1000000元
  /**
   * @example
   * 100000000
   */
  maxPriceYuan?: string;
  // 计费因子
  billingfactorMetas?: BillingFactorMeta[];
  // 受理类型
  /**
   * @example
   * send
   */
  acceptType?: string;
  // 周期
  /**
   * @example
   * 02
   */
  collectPeriod?: string;
  // 外部支付类型
  /**
   * @example
   * 02
   */
  outPaidType?: string;
  // 是否立即出账
  /**
   * @example
   * true,false
   */
  enableRightRowCharge?: boolean;
  // 高精度累计类型
  /**
   * @example
   * HIGH_PRECISION_S_M
   */
  highPrecisionCumulativeType?: string;
  static names(): { [key: string]: string } {
    return {
      billingRuleCode: 'billing_rule_code',
      domainCode: 'domain_code',
      productCode: 'product_code',
      offerCode: 'offer_code',
      billDimension: 'bill_dimension',
      enableResourcePackage: 'enable_resource_package',
      cumulateCycle: 'cumulate_cycle',
      transferType: 'transfer_type',
      payAcceptType: 'pay_accept_type',
      writeOffType: 'write_off_type',
      maxPriceYuan: 'max_price_yuan',
      billingfactorMetas: 'billingfactor_metas',
      acceptType: 'accept_type',
      collectPeriod: 'collect_period',
      outPaidType: 'out_paid_type',
      enableRightRowCharge: 'enable_right_row_charge',
      highPrecisionCumulativeType: 'high_precision_cumulative_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      billingRuleCode: 'string',
      domainCode: 'string',
      productCode: 'string',
      offerCode: 'string',
      billDimension: 'string',
      enableResourcePackage: 'boolean',
      cumulateCycle: 'string',
      transferType: 'string',
      payAcceptType: 'string',
      writeOffType: 'string',
      maxPriceYuan: 'string',
      billingfactorMetas: { 'type': 'array', 'itemType': BillingFactorMeta },
      acceptType: 'string',
      collectPeriod: 'string',
      outPaidType: 'string',
      enableRightRowCharge: 'boolean',
      highPrecisionCumulativeType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 计量域信息
export class DomainConfigVO extends $tea.Model {
  // 操作类型
  /**
   * @example
   * ADD
   */
  operateType?: string;
  // 产品域Code，例如OSS
  /**
   * @example
   * test_r
   */
  domainCode?: string;
  // 版本
  /**
   * @example
   * 2023#test_r
   */
  domainVersion?: string;
  // 计量域中文名称
  /**
   * @example
   * 中文名
   */
  chineseName?: string;
  // 计量域英文名称
  /**
   * @example
   * english_name
   */
  englishName?: string;
  // 计量域描述
  /**
   * @example
   * 计量域描述
   */
  domainDesc?: string;
  // 渠道产品Code
  /**
   * @example
   * serviceCode
   */
  serviceCode?: string;
  // 商品code
  /**
   * @example
   * 商品code
   */
  commodityCode?: string;
  // 推送类型
  /**
   * @example
   * 全量
   */
  pushType?: string;
  // 计量数据维度
  /**
   * @example
   * r
   */
  dimension?: string;
  // 环境标识
  /**
   * @example
   * prod
   */
  env?: string;
  // 计量说明
  /**
   * @example
   * 说明
   */
  memo?: string;
  // domainCode是否需要聚合
  /**
   * @example
   * N
   */
  needAggregate?: string;
  // 创建者
  /**
   * @example
   * 工号
   */
  creator?: string;
  // 修改者
  /**
   * @example
   * 工号
   */
  modifier?: string;
  // 计量项list
  domainFieldSet?: DomainField[];
  // 主键规则配置
  primaryKeyGenRule?: PrimaryKeyGenRule;
  // 计量节点
  domainNodeSet?: DomainNode[];
  // 计量域成员信息
  meterDomainMemberSet?: MeterDomainMember[];
  // DomainSLS配置
  domainSls?: DomainSls;
  static names(): { [key: string]: string } {
    return {
      operateType: 'operate_type',
      domainCode: 'domain_code',
      domainVersion: 'domain_version',
      chineseName: 'chinese_name',
      englishName: 'english_name',
      domainDesc: 'domain_desc',
      serviceCode: 'service_code',
      commodityCode: 'commodity_code',
      pushType: 'push_type',
      dimension: 'dimension',
      env: 'env',
      memo: 'memo',
      needAggregate: 'need_aggregate',
      creator: 'creator',
      modifier: 'modifier',
      domainFieldSet: 'domain_field_set',
      primaryKeyGenRule: 'primary_key_gen_rule',
      domainNodeSet: 'domain_node_set',
      meterDomainMemberSet: 'meter_domain_member_set',
      domainSls: 'domain_sls',
    };
  }

  static types(): { [key: string]: any } {
    return {
      operateType: 'string',
      domainCode: 'string',
      domainVersion: 'string',
      chineseName: 'string',
      englishName: 'string',
      domainDesc: 'string',
      serviceCode: 'string',
      commodityCode: 'string',
      pushType: 'string',
      dimension: 'string',
      env: 'string',
      memo: 'string',
      needAggregate: 'string',
      creator: 'string',
      modifier: 'string',
      domainFieldSet: { 'type': 'array', 'itemType': DomainField },
      primaryKeyGenRule: PrimaryKeyGenRule,
      domainNodeSet: { 'type': 'array', 'itemType': DomainNode },
      meterDomainMemberSet: { 'type': 'array', 'itemType': MeterDomainMember },
      domainSls: DomainSls,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 资源包模板模型
export class ResPackageTemplateNewMeta extends $tea.Model {
  // 资源包code
  /**
   * @example
   * test_deadline
   */
  templateName: string;
  // 资源包模板类型
  /**
   * @example
   * single
   */
  templateType: string;
  // 抵扣类型
  /**
   * @example
   * deadline
   */
  deductType: string;
  // 资源包l5code
  /**
   * @example
   * testcode
   */
  productCode: string;
  // 资源包serviceCode
  /**
   * @example
   * serviceCode
   */
  productName: string;
  // 资源包模板名称
  /**
   * @example
   * 测试资源包模板
   */
  displayName: string;
  // 可抵扣的l5code
  /**
   * @example
   * testcode
   */
  applicableProductName: string;
  // 收费事件码
  /**
   * @example
   * eventcode
   */
  prodEventCode?: string;
  // 抵扣优先级
  /**
   * @example
   * 1
   */
  priority?: string;
  // 是否可续费
  /**
   * @example
   * true
   */
  renewable?: boolean;
  // 是否可升级
  /**
   * @example
   * true
   */
  upgradable?: boolean;
  // 单位转换关系
  /**
   * @example
   * [{"ratio":"1","unit":"次","roundMode":7,"scale":0},{"ratio":"10000","unit":"万次","roundMode":4,"scale":4}]
   */
  unitKey: string;
  // 是否计算金额
  /**
   * @example
   * true
   */
  calcAmount: boolean;
  // 是否使用子包
  /**
   * @example
   * true
   */
  subPack: boolean;
  // 子包切分规则
  /**
   * @example
   * None
   */
  subPackSplitType?: string;
  // 关联子包模版
  /**
   * @example
   * test_deadline
   */
  relTemplate?: string;
  // 状态
  /**
   * @example
   * effect
   */
  status?: string;
  // 资源包约束元数据列表
  /**
   * @example
   * undefined
   */
  resourcePackageConstraintMetas?: ResourcePackageConstraintMeta[];
  static names(): { [key: string]: string } {
    return {
      templateName: 'template_name',
      templateType: 'template_type',
      deductType: 'deduct_type',
      productCode: 'product_code',
      productName: 'product_name',
      displayName: 'display_name',
      applicableProductName: 'applicable_product_name',
      prodEventCode: 'prod_event_code',
      priority: 'priority',
      renewable: 'renewable',
      upgradable: 'upgradable',
      unitKey: 'unit_key',
      calcAmount: 'calc_amount',
      subPack: 'sub_pack',
      subPackSplitType: 'sub_pack_split_type',
      relTemplate: 'rel_template',
      status: 'status',
      resourcePackageConstraintMetas: 'resource_package_constraint_metas',
    };
  }

  static types(): { [key: string]: any } {
    return {
      templateName: 'string',
      templateType: 'string',
      deductType: 'string',
      productCode: 'string',
      productName: 'string',
      displayName: 'string',
      applicableProductName: 'string',
      prodEventCode: 'string',
      priority: 'string',
      renewable: 'boolean',
      upgradable: 'boolean',
      unitKey: 'string',
      calcAmount: 'boolean',
      subPack: 'boolean',
      subPackSplitType: 'string',
      relTemplate: 'string',
      status: 'string',
      resourcePackageConstraintMetas: { 'type': 'array', 'itemType': ResourcePackageConstraintMeta },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 校验失败的变更因子
export class FailChangeFactor extends $tea.Model {
  // 失败的路径值
  /**
   * @example
   * base.domainCode
   */
  failKey: string;
  // 失败原因
  /**
   * @example
   * 失败原因
   */
  failReason: string;
  static names(): { [key: string]: string } {
    return {
      failKey: 'fail_key',
      failReason: 'fail_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      failKey: 'string',
      failReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 计量计费配置模型（展示变更）
export class FeeConfEntityVO extends $tea.Model {
  // 计量域配置信息
  domainConfigParam?: DomainConfigVO;
  // 计费计划配置
  billingRuleMeta?: BillingPlanVO;
  // 资源包配置
  resPackageTemplateMeta?: RespackageConfVO[];
  // 新资源包模板
  /**
   * @example
   * undefined
   */
  resPackageTemplateNewMeta?: ResPackageTemplateNewMeta[];
  static names(): { [key: string]: string } {
    return {
      domainConfigParam: 'domain_config_param',
      billingRuleMeta: 'billing_rule_meta',
      resPackageTemplateMeta: 'res_package_template_meta',
      resPackageTemplateNewMeta: 'res_package_template_new_meta',
    };
  }

  static types(): { [key: string]: any } {
    return {
      domainConfigParam: DomainConfigVO,
      billingRuleMeta: BillingPlanVO,
      resPackageTemplateMeta: { 'type': 'array', 'itemType': RespackageConfVO },
      resPackageTemplateNewMeta: { 'type': 'array', 'itemType': ResPackageTemplateNewMeta },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 资源包日志VO
export class ResourcePackageLogVO extends $tea.Model {
  // 流水号
  /**
   * @example
   * 1
   */
  id?: string;
  // 资源包实例
  /**
   * @example
   * 1
   */
  resourcePackageInstanceId?: string;
  // 资源包展示名称
  /**
   * @example
   * 1
   */
  resourcePackageDisplayName?: string;
  // 抵扣前容量
  /**
   * @example
   * 1
   */
  capacityBeforeDeduct?: string;
  // 抵扣前容量单位
  /**
   * @example
   * 1
   */
  capacityBeforeDeductUnit?: string;
  // 抵扣后容量
  /**
   * @example
   * 1
   */
  capacityAfterDeduct?: string;
  // 抵扣后容量单位
  /**
   * @example
   * 1
   */
  capacityAfterDeductUnit?: string;
  // 本次抵扣量
  /**
   * @example
   * 1
   */
  deductedAmount?: string;
  // 本次抵扣量单位
  /**
   * @example
   * 1
   */
  deductedAmountUnit?: string;
  // 账单id
  /**
   * @example
   * 1
   */
  chargeBillId?: string;
  // 详单id
  /**
   * @example
   * 1
   */
  billDetailId?: string;
  // 被抵扣的产品名
  /**
   * @example
   * 1
   */
  deductedProductName?: string;
  // 被抵扣实例id
  /**
   * @example
   * 1
   */
  deductedInstanceId?: string;
  // 抵扣的字段
  /**
   * @example
   * 1
   */
  omsField?: string;
  // 抵扣发生时间
  deductTime?: string;
  // 类型
  /**
   * @example
   * 1
   */
  type?: string;
  // 抵扣资金
  /**
   * @example
   * 1
   */
  deductedFund?: string;
  // 剩余资金
  /**
   * @example
   * 1
   */
  remainFund?: string;
  // 抵扣发生时间
  omsStartTime?: string;
  // 抵扣发生时间
  omsEndTime?: string;
  // extendInfo
  /**
   * @example
   * JSON
   */
  extendInfo?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      resourcePackageInstanceId: 'resource_package_instance_id',
      resourcePackageDisplayName: 'resource_package_display_name',
      capacityBeforeDeduct: 'capacity_before_deduct',
      capacityBeforeDeductUnit: 'capacity_before_deduct_unit',
      capacityAfterDeduct: 'capacity_after_deduct',
      capacityAfterDeductUnit: 'capacity_after_deduct_unit',
      deductedAmount: 'deducted_amount',
      deductedAmountUnit: 'deducted_amount_unit',
      chargeBillId: 'charge_bill_id',
      billDetailId: 'bill_detail_id',
      deductedProductName: 'deducted_product_name',
      deductedInstanceId: 'deducted_instance_id',
      omsField: 'oms_field',
      deductTime: 'deduct_time',
      type: 'type',
      deductedFund: 'deducted_fund',
      remainFund: 'remain_fund',
      omsStartTime: 'oms_start_time',
      omsEndTime: 'oms_end_time',
      extendInfo: 'extend_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      resourcePackageInstanceId: 'string',
      resourcePackageDisplayName: 'string',
      capacityBeforeDeduct: 'string',
      capacityBeforeDeductUnit: 'string',
      capacityAfterDeduct: 'string',
      capacityAfterDeductUnit: 'string',
      deductedAmount: 'string',
      deductedAmountUnit: 'string',
      chargeBillId: 'string',
      billDetailId: 'string',
      deductedProductName: 'string',
      deductedInstanceId: 'string',
      omsField: 'string',
      deductTime: 'string',
      type: 'string',
      deductedFund: 'string',
      remainFund: 'string',
      omsStartTime: 'string',
      omsEndTime: 'string',
      extendInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 详单维度资源包抵扣详情
export class ResourcePackageDeductDetailVO extends $tea.Model {
  // 资源包抵扣日志id
  /**
   * @example
   * 11
   */
  resourcePackageLogId?: string;
  // 资源包抵扣量
  /**
   * @example
   * 1
   */
  deductedAmount?: string;
  // 资源包id
  /**
   * @example
   * aaa
   */
  resourcePackageId?: string;
  // 资源包实例id
  /**
   * @example
   * aaa
   */
  resourcePackageInstanceId?: string;
  static names(): { [key: string]: string } {
    return {
      resourcePackageLogId: 'resource_package_log_id',
      deductedAmount: 'deducted_amount',
      resourcePackageId: 'resource_package_id',
      resourcePackageInstanceId: 'resource_package_instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      resourcePackageLogId: 'string',
      deductedAmount: 'string',
      resourcePackageId: 'string',
      resourcePackageInstanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 记录计财域中变更
export class FeeChangeFactorVO extends $tea.Model {
  // 哪个字段变更
  /**
   * @example
   * newFeeEntity.field
   */
  key: string;
  // 改变类型
  /**
   * @example
   * UPDATE,ADD,DELETE
   */
  changeType: string;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      changeType: 'change_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      changeType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 计费详单VO
export class ChargeBillVO extends $tea.Model {
  // 主键Id
  /**
   * @example
   * 1
   */
  id: string;
  // 租户Id
  /**
   * @example
   * 2333
   */
  tenantId?: string;
  // 合约号
  /**
   * @example
   * dasd
   */
  arNo?: string;
  // 资源名称@ProductEnum
  /**
   * @example
   * 资源名称
   */
  prodCode?: string;
  // 云产品收费事件码
  /**
   * @example
   * adqd
   */
  prodEventCode?: string;
  // 实例id
  /**
   * @example
   * eqw
   */
  instanceId?: string;
  // 账单计费状态@ChargeBillStatusEnum
  /**
   * @example
   * INIT
   */
  status?: string;
  // 账单金额
  /**
   * @example
   * 11
   */
  amount?: MultiCurrencyMoney;
  // 优惠金额
  /**
   * @example
   * 11
   */
  discountFee?: MultiCurrencyMoney;
  // 高精度金额
  /**
   * @example
   * 11
   */
  highPrecisionAmount?: string;
  // 高精度活动金额
  /**
   * @example
   * 11
   */
  highPrecisionDiscountFee?: string;
  // 优惠券抵扣金额
  /**
   * @example
   * 11
   */
  couponSettleAmount?: MultiCurrencyMoney;
  // 高精度优惠券抵扣金额
  /**
   * @example
   * 11
   */
  highPrecisionCouponSettleAmount?: string;
  // 优惠券id
  /**
   * @example
   * 11
   */
  couponId?: string;
  // 应付金额
  /**
   * @example
   * 11
   */
  requireAmount?: MultiCurrencyMoney;
  // 高精度应付金额
  /**
   * @example
   * 11
   */
  highPrecisionRequireAmount?: string;
  // 账单对应的使用时间区间的开始时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  gmtFeeStartTime?: string;
  // 账单对应的使用时间区间的结束时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  gmtFeeEndTime?: string;
  // This property corresponds to db column <tt>extend_info</tt>.
  /**
   * @example
   * JSON
   */
  extendInfo?: string;
  // 是否有流量包抵扣
  /**
   * @example
   * true, false
   */
  isFlowPackDeducted?: boolean;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      tenantId: 'tenant_id',
      arNo: 'ar_no',
      prodCode: 'prod_code',
      prodEventCode: 'prod_event_code',
      instanceId: 'instance_id',
      status: 'status',
      amount: 'amount',
      discountFee: 'discount_fee',
      highPrecisionAmount: 'high_precision_amount',
      highPrecisionDiscountFee: 'high_precision_discount_fee',
      couponSettleAmount: 'coupon_settle_amount',
      highPrecisionCouponSettleAmount: 'high_precision_coupon_settle_amount',
      couponId: 'coupon_id',
      requireAmount: 'require_amount',
      highPrecisionRequireAmount: 'high_precision_require_amount',
      gmtFeeStartTime: 'gmt_fee_start_time',
      gmtFeeEndTime: 'gmt_fee_end_time',
      extendInfo: 'extend_info',
      isFlowPackDeducted: 'is_flow_pack_deducted',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      tenantId: 'string',
      arNo: 'string',
      prodCode: 'string',
      prodEventCode: 'string',
      instanceId: 'string',
      status: 'string',
      amount: MultiCurrencyMoney,
      discountFee: MultiCurrencyMoney,
      highPrecisionAmount: 'string',
      highPrecisionDiscountFee: 'string',
      couponSettleAmount: MultiCurrencyMoney,
      highPrecisionCouponSettleAmount: 'string',
      couponId: 'string',
      requireAmount: MultiCurrencyMoney,
      highPrecisionRequireAmount: 'string',
      gmtFeeStartTime: 'string',
      gmtFeeEndTime: 'string',
      extendInfo: 'string',
      isFlowPackDeducted: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 收费项模型VO
export class ChargeItemVO extends $tea.Model {
  // 收费项对应的枚举编码@ProductConstraintEnum 
  /**
   * @example
   * a
   */
  name?: string;
  // 收费项对应的云产品条件code@ProductConstraintEnum
  /**
   * @example
   * a
   */
  code?: string;
  // 使用量
  /**
   * @example
   * 1
   */
  value?: string;
  // 度量单位
  /**
   * @example
   * m
   */
  unit?: string;
  // 计费项类型
  /**
   * @example
   * type
   */
  type?: string;
  // 计费项名称-前端显示
  /**
   * @example
   * display_name
   */
  displayName?: string;
  // 计费项单位-前端显示 
  /**
   * @example
   * displayUnit
   */
  displayUnit?: string;
  // 计费项值-前端显示
  /**
   * @example
   * display_value
   */
  displayValue?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      code: 'code',
      value: 'value',
      unit: 'unit',
      type: 'type',
      displayName: 'display_name',
      displayUnit: 'display_unit',
      displayValue: 'display_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      code: 'string',
      value: 'string',
      unit: 'string',
      type: 'string',
      displayName: 'string',
      displayUnit: 'string',
      displayValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分页返参
export class PaginationResult extends $tea.Model {
  // 查询结果
  data: ChargeBillVO[];
  // 当前页
  /**
   * @example
   * 1
   */
  currentPage: number;
  // 分页大小
  /**
   * @example
   * 20
   */
  pageSize: number;
  // 查询结果总数
  /**
   * @example
   * 12
   */
  totalCount: number;
  // 状态
  /**
   * @example
   * true, false
   */
  success: boolean;
  static names(): { [key: string]: string } {
    return {
      data: 'data',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalCount: 'total_count',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      data: { 'type': 'array', 'itemType': ChargeBillVO },
      currentPage: 'number',
      pageSize: 'number',
      totalCount: 'number',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 资源包实例信息VO
export class ResourcePackageInstanceVO extends $tea.Model {
  // 流水号
  /**
   * @example
   * 1
   */
  id?: string;
  // 租户id
  /**
   * @example
   * 2088101118131245
   */
  tenantId?: string;
  // 实例名称
  /**
   * @example
   * 实例
   */
  instanceName?: string;
  // 资源包前端展现名称
  /**
   * @example
   * 名称
   */
  resourcePackageDisplayName?: string;
  // 资源包商品名
  /**
   * @example
   * 资源包商品名
   */
  resourcePackageProductName?: string;
  // 资源包可抵扣资源名称
  /**
   * @example
   * 资源包可抵扣资源名称
   */
  applicableProductName?: string;
  // 当前状态-VALID、CLOSED、INVALID
  /**
   * @example
   * INVALID
   */
  status?: string;
  // 是否可续费
  /**
   * @example
   * true, false
   */
  renewable?: boolean;
  // 是否可升级
  /**
   * @example
   * true, false
   */
  upgradable?: boolean;
  // 初始容量
  /**
   * @example
   * 1
   */
  initialCapacity?: string;
  // 当前容量
  /**
   * @example
   * 1
   */
  currentCapacity?: string;
  // 初始容量单位
  /**
   * @example
   * 1
   */
  initCapacityViewUnit?: string;
  // 当前容量单位
  /**
   * @example
   * 1
   */
  currentCapacityViewUnit?: string;
  // 有效期开始时间
  startTime?: string;
  // 有效期结束时间
  endTime?: string;
  // 总资金
  /**
   * @example
   * 1
   */
  totalFund?: string;
  // 剩余资金
  /**
   * @example
   * 1
   */
  remainFund?: string;
  // 子包信息
  subResourcePackageVos?: ResourcePackageLogVO[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      tenantId: 'tenant_id',
      instanceName: 'instance_name',
      resourcePackageDisplayName: 'resource_package_display_name',
      resourcePackageProductName: 'resource_package_product_name',
      applicableProductName: 'applicable_product_name',
      status: 'status',
      renewable: 'renewable',
      upgradable: 'upgradable',
      initialCapacity: 'initial_capacity',
      currentCapacity: 'current_capacity',
      initCapacityViewUnit: 'init_capacity_view_unit',
      currentCapacityViewUnit: 'current_capacity_view_unit',
      startTime: 'start_time',
      endTime: 'end_time',
      totalFund: 'total_fund',
      remainFund: 'remain_fund',
      subResourcePackageVos: 'sub_resource_package_vos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      tenantId: 'string',
      instanceName: 'string',
      resourcePackageDisplayName: 'string',
      resourcePackageProductName: 'string',
      applicableProductName: 'string',
      status: 'string',
      renewable: 'boolean',
      upgradable: 'boolean',
      initialCapacity: 'string',
      currentCapacity: 'string',
      initCapacityViewUnit: 'string',
      currentCapacityViewUnit: 'string',
      startTime: 'string',
      endTime: 'string',
      totalFund: 'string',
      remainFund: 'string',
      subResourcePackageVos: { 'type': 'array', 'itemType': ResourcePackageLogVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 本次抵扣结果
export class OmsDataComponentDeductDetailResultVO extends $tea.Model {
  // 资源包抵扣日志id
  /**
   * @example
   * 1233
   */
  resourcePackageLogId: string;
  // 资源包抵扣量
  deductAmount: number;
  // 资源包抵扣价值
  /**
   * @example
   * 123
   */
  deductedFund: string;
  // 资源包抵扣时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  deductedTime: string;
  // 资源包id
  /**
   * @example
   * A0SQBRFM01222133ORGJC1CN1ZXEMO6K8TL
   */
  resourcePackageId: string;
  // 资源包实例id
  /**
   * @example
   * 资源包实例id
   */
  resourcePackageInstanceId: string;
  static names(): { [key: string]: string } {
    return {
      resourcePackageLogId: 'resource_package_log_id',
      deductAmount: 'deduct_amount',
      deductedFund: 'deducted_fund',
      deductedTime: 'deducted_time',
      resourcePackageId: 'resource_package_id',
      resourcePackageInstanceId: 'resource_package_instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      resourcePackageLogId: 'string',
      deductAmount: 'number',
      deductedFund: 'string',
      deductedTime: 'string',
      resourcePackageId: 'string',
      resourcePackageInstanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 实例维度月账单
export class InstanceMonthlyBillVO extends $tea.Model {
  // 金融云租户id
  /**
   * @example
   * 2088101118131245
   */
  tenantId: string;
  // 产品类别@ProductServiceEnum
  /**
   * @example
   * MONITOR
   */
  productCategory: string;
  // 产品名称
  /**
   * @example
   * test
   */
  productName: string;
  // 付费类型
  /**
   * @example
   * AFTER_PAY
   */
  chargeType: string;
  // 实例id
  /**
   * @example
   * ASXASDAZAZ
   */
  instanceId: string;
  // 账单月份
  /**
   * @example
   * yyyyMM(202201)
   */
  billMonth: string;
  // 应收金额(不包含优惠券和折扣)
  billAmount?: MultiCurrencyMoney;
  // 优惠券抵扣金额
  /**
   * @example
   * 100.10
   */
  couponAmount: MultiCurrencyMoney;
  // 高精度优惠券金额
  /**
   * @example
   * 1.01
   */
  highPrecisionCouponAmount: string;
  // 折扣金额
  /**
   * @example
   * 11.01
   */
  discountAmount: MultiCurrencyMoney;
  // 高精度折扣金额
  /**
   * @example
   * 1.01
   */
  highPrecisionDiscountAmount: string;
  // 调账金额
  /**
   * @example
   * 1.01
   */
  adjustAmount: MultiCurrencyMoney;
  // 已收金额
  /**
   * @example
   * 1.01
   */
  receivedAmount: MultiCurrencyMoney;
  // 账单应收日期
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  accountReceivableDate: string;
  // 月账单号
  /**
   * @example
   * 123123
   */
  instanceMonthlyBillId: string;
  // 支付渠道
  /**
   * @example
   * test
   */
  payChannel: string;
  // 合同ID
  /**
   * @example
   * 123123
   */
  contractId: string;
  // map的json串
  /**
   * @example
   * {"test":"tets"}
   */
  extendInfo: string;
  // 未结清金额
  unsettledAmount: MultiCurrencyMoney;
  // 优惠金额
  totalDiscountAmount: MultiCurrencyMoney;
  static names(): { [key: string]: string } {
    return {
      tenantId: 'tenant_id',
      productCategory: 'product_category',
      productName: 'product_name',
      chargeType: 'charge_type',
      instanceId: 'instance_id',
      billMonth: 'bill_month',
      billAmount: 'bill_amount',
      couponAmount: 'coupon_amount',
      highPrecisionCouponAmount: 'high_precision_coupon_amount',
      discountAmount: 'discount_amount',
      highPrecisionDiscountAmount: 'high_precision_discount_amount',
      adjustAmount: 'adjust_amount',
      receivedAmount: 'received_amount',
      accountReceivableDate: 'account_receivable_date',
      instanceMonthlyBillId: 'instance_monthly_bill_id',
      payChannel: 'pay_channel',
      contractId: 'contract_id',
      extendInfo: 'extend_info',
      unsettledAmount: 'unsettled_amount',
      totalDiscountAmount: 'total_discount_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tenantId: 'string',
      productCategory: 'string',
      productName: 'string',
      chargeType: 'string',
      instanceId: 'string',
      billMonth: 'string',
      billAmount: MultiCurrencyMoney,
      couponAmount: MultiCurrencyMoney,
      highPrecisionCouponAmount: 'string',
      discountAmount: MultiCurrencyMoney,
      highPrecisionDiscountAmount: 'string',
      adjustAmount: MultiCurrencyMoney,
      receivedAmount: MultiCurrencyMoney,
      accountReceivableDate: 'string',
      instanceMonthlyBillId: 'string',
      payChannel: 'string',
      contractId: 'string',
      extendInfo: 'string',
      unsettledAmount: MultiCurrencyMoney,
      totalDiscountAmount: MultiCurrencyMoney,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 计财配置变更模型
export class FeeConfChangeVO extends $tea.Model {
  // 原本的计财配置
  oldConfEntity?: FeeConfEntityVO;
  // 新的计财配置实体
  newConfEntity?: FeeConfEntityVO;
  // 变更字段列表
  changeFactorList?: FeeChangeFactorVO[];
  // 失败的变更列表
  failChangFactorList?: FailChangeFactor[];
  static names(): { [key: string]: string } {
    return {
      oldConfEntity: 'old_conf_entity',
      newConfEntity: 'new_conf_entity',
      changeFactorList: 'change_factor_list',
      failChangFactorList: 'fail_chang_factor_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      oldConfEntity: FeeConfEntityVO,
      newConfEntity: FeeConfEntityVO,
      changeFactorList: { 'type': 'array', 'itemType': FeeChangeFactorVO },
      failChangFactorList: { 'type': 'array', 'itemType': FailChangeFactor },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 资源包余量结构体
export class RespackegeBanlanceVO extends $tea.Model {
  // 资源包商品编码
  /**
   * @example
   * ZLPTFM01221964
   */
  productCode: string;
  // 资源包模板编码
  /**
   * @example
   * ZNHYFM01222350_Deadline
   */
  tempalteName: string;
  // 资源包展示名称
  /**
   * @example
   * credits资源包(加油包)
   */
  displayName: string;
  // 初始容量
  /**
   * @example
   * 10000
   */
  initialCapacity: string;
  // 当前余量
  /**
   * @example
   * 10000
   */
  currentCapacity: string;
  // 总金额
  totalFund: MultiCurrencyMoney;
  // 剩余金额
  // 
  remainFund: MultiCurrencyMoney;
  static names(): { [key: string]: string } {
    return {
      productCode: 'product_code',
      tempalteName: 'tempalte_name',
      displayName: 'display_name',
      initialCapacity: 'initial_capacity',
      currentCapacity: 'current_capacity',
      totalFund: 'total_fund',
      remainFund: 'remain_fund',
    };
  }

  static types(): { [key: string]: any } {
    return {
      productCode: 'string',
      tempalteName: 'string',
      displayName: 'string',
      initialCapacity: 'string',
      currentCapacity: 'string',
      totalFund: MultiCurrencyMoney,
      remainFund: MultiCurrencyMoney,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 详单VO
export class BillDetailVO extends $tea.Model {
  // 主键Id
  /**
   * @example
   * 1
   */
  id: string;
  // 账单Id
  /**
   * @example
   * aa
   */
  chargeBillId?: string;
  // 合约号
  /**
   * @example
   * aa
   */
  arNo?: string;
  // 资源名称@ResourceNameEnum 
  /**
   * @example
   * 名称
   */
  prodCode?: string;
  // 云产品收费事件码
  /**
   * @example
   * aa
   */
  prodEventCode?: string;
  // 实例id
  /**
   * @example
   * aa
   */
  instanceId?: string;
  // 账单金额
  /**
   * @example
   * 1
   */
  amount?: MultiCurrencyMoney;
  // 高精度金额
  /**
   * @example
   * 1
   */
  highPrecisionAmount?: string;
  // 优惠金额
  /**
   * @example
   * 1
   */
  discountFee?: MultiCurrencyMoney;
  // 高精度优惠金额
  /**
   * @example
   * 1
   */
  highPrecisionDiscountFee?: string;
  // 流量包抵扣量
  flowPackDeducted?: number;
  // 流量包抵扣详情
  flowPackDeductDetail?: ResourcePackageDeductDetailVO[];
  // 账单对应的使用时间区间的开始时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  gmtFeeStartTime?: string;
  // 账单对应的使用时间区间的结束时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  gmtFeeEndTime?: string;
  // 计费项
  feeItems?: ChargeItemVO[];
  // 约束项
  constraintItems?: ChargeItemVO[];
  // This property corresponds to db column <tt>extend_info</tt>.
  /**
   * @example
   * JSON
   */
  extendInfo?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      chargeBillId: 'charge_bill_id',
      arNo: 'ar_no',
      prodCode: 'prod_code',
      prodEventCode: 'prod_event_code',
      instanceId: 'instance_id',
      amount: 'amount',
      highPrecisionAmount: 'high_precision_amount',
      discountFee: 'discount_fee',
      highPrecisionDiscountFee: 'high_precision_discount_fee',
      flowPackDeducted: 'flow_pack_deducted',
      flowPackDeductDetail: 'flow_pack_deduct_detail',
      gmtFeeStartTime: 'gmt_fee_start_time',
      gmtFeeEndTime: 'gmt_fee_end_time',
      feeItems: 'fee_items',
      constraintItems: 'constraint_items',
      extendInfo: 'extend_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      chargeBillId: 'string',
      arNo: 'string',
      prodCode: 'string',
      prodEventCode: 'string',
      instanceId: 'string',
      amount: MultiCurrencyMoney,
      highPrecisionAmount: 'string',
      discountFee: MultiCurrencyMoney,
      highPrecisionDiscountFee: 'string',
      flowPackDeducted: 'number',
      flowPackDeductDetail: { 'type': 'array', 'itemType': ResourcePackageDeductDetailVO },
      gmtFeeStartTime: 'string',
      gmtFeeEndTime: 'string',
      feeItems: { 'type': 'array', 'itemType': ChargeItemVO },
      constraintItems: { 'type': 'array', 'itemType': ChargeItemVO },
      extendInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 目录对象
export class CategoryVO extends $tea.Model {
  // 内部id
  id?: number;
  // 内容库id
  siteId?: number;
  // 站点
  /**
   * @example
   * ""
   */
  site?: string;
  // language
  /**
   * @example
   * ""
   */
  language?: string;
  // title
  /**
   * @example
   * ""
   */
  title?: string;
  // 类型
  type?: number;
  // 展示类型 1为左侧展示2为列表展示
  showType?: number;
  // 排序
  sort?: number;
  // 目录层级
  level?: number;
  // 外标id
  /**
   * @example
   * ""
   */
  extId?: string;
  // 父id
  /**
   * @example
   * ""
   */
  parentId?: string;
  // 来源类型
  sourceType?: number;
  // 版本
  /**
   * @example
   * ""
   */
  version?: string;
  // 语雀目录有无数据判定
  catalogueType?: number;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      siteId: 'site_id',
      site: 'site',
      language: 'language',
      title: 'title',
      type: 'type',
      showType: 'show_type',
      sort: 'sort',
      level: 'level',
      extId: 'ext_id',
      parentId: 'parent_id',
      sourceType: 'source_type',
      version: 'version',
      catalogueType: 'catalogue_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      siteId: 'number',
      site: 'string',
      language: 'string',
      title: 'string',
      type: 'number',
      showType: 'number',
      sort: 'number',
      level: 'number',
      extId: 'string',
      parentId: 'string',
      sourceType: 'number',
      version: 'string',
      catalogueType: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// NoviceMustSee
export class NoviceMustSee extends $tea.Model {
  // novice_must_see_explain
  /**
   * @example
   * ""
   */
  noviceMustSeeExplain?: string;
  // novice_must_see_title1
  /**
   * @example
   * ""
   */
  noviceMustSeeTitle1?: string;
  // novice_must_see_address1
  /**
   * @example
   * 12
   */
  noviceMustSeeAddress1?: string;
  // novice_must_see_title2
  /**
   * @example
   * ""
   */
  noviceMustSeeTitle2?: string;
  // novice_must_see_address2
  /**
   * @example
   * ""
   */
  noviceMustSeeAddress2?: string;
  // novice_must_see_title3
  /**
   * @example
   * ""
   */
  noviceMustSeeTitle3?: string;
  // novice_must_see_address3
  /**
   * @example
   * ""
   */
  noviceMustSeeAddress3?: string;
  static names(): { [key: string]: string } {
    return {
      noviceMustSeeExplain: 'novice_must_see_explain',
      noviceMustSeeTitle1: 'novice_must_see_title1',
      noviceMustSeeAddress1: 'novice_must_see_address1',
      noviceMustSeeTitle2: 'novice_must_see_title2',
      noviceMustSeeAddress2: 'novice_must_see_address2',
      noviceMustSeeTitle3: 'novice_must_see_title3',
      noviceMustSeeAddress3: 'novice_must_see_address3',
    };
  }

  static types(): { [key: string]: any } {
    return {
      noviceMustSeeExplain: 'string',
      noviceMustSeeTitle1: 'string',
      noviceMustSeeAddress1: 'string',
      noviceMustSeeTitle2: 'string',
      noviceMustSeeAddress2: 'string',
      noviceMustSeeTitle3: 'string',
      noviceMustSeeAddress3: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 公司联系人
export class CorporateContacts extends $tea.Model {
  // 职务
  /**
   * @example
   * 总经理
   */
  jobTitle?: string;
  // 姓名
  /**
   * @example
   * XXX
   */
  realName: string;
  // 电话
  /**
   * @example
   * 15888888888
   */
  mobilePhone?: string;
  // 邮箱
  /**
   * @example
   * XXX@XXX.COM
   */
  email?: string;
  static names(): { [key: string]: string } {
    return {
      jobTitle: 'job_title',
      realName: 'real_name',
      mobilePhone: 'mobile_phone',
      email: 'email',
    };
  }

  static types(): { [key: string]: any } {
    return {
      jobTitle: 'string',
      realName: 'string',
      mobilePhone: 'string',
      email: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// PopularDocument
export class PopularDocument extends $tea.Model {
  // popular_document_title
  /**
   * @example
   * ""
   */
  popularDocumentTitle?: string;
  // popular_document_id
  /**
   * @example
   * ""
   */
  popularDocumentId?: string;
  // popular_document_info
  /**
   * @example
   * ""
   */
  popularDocumentInfo?: string;
  // children
  children: CategoryVO[];
  static names(): { [key: string]: string } {
    return {
      popularDocumentTitle: 'popular_document_title',
      popularDocumentId: 'popular_document_id',
      popularDocumentInfo: 'popular_document_info',
      children: 'children',
    };
  }

  static types(): { [key: string]: any } {
    return {
      popularDocumentTitle: 'string',
      popularDocumentId: 'string',
      popularDocumentInfo: 'string',
      children: { 'type': 'array', 'itemType': CategoryVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商机信息
export class BusinessRequest extends $tea.Model {
  // 客户名称
  /**
   * @example
   * XXX公司
   */
  customerName: string;
  // 客户id
  /**
   * @example
   * XXX
   */
  customerId: string;
  // 商机名称
  /**
   * @example
   * XXX
   */
  businessName: string;
  // 商机ID
  /**
   * @example
   * xxx
   */
  businessId: string;
  // 未开通(INIT)/开通中(OPENING/已开通(OPEN)/使用中(USING)/闲置中(IDLE)/已关闭(CLOSE)
  /**
   * @example
   * INIT
   */
  businessStatus: string;
  // 商机说明
  /**
   * @example
   * XXX
   */
  businessExplain?: string;
  // 线索来源
  /**
   * @example
   *  
   */
  source: string;
  // 商机时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  businessDate: string;
  // 租户
  /**
   * @example
   * BCC
   */
  tenant: string;
  // 创建人工号
  /**
   * @example
   * 132
   */
  creator: string;
  // 创建人花名
  /**
   * @example
   * XX
   */
  creatorNick: string;
  static names(): { [key: string]: string } {
    return {
      customerName: 'customer_name',
      customerId: 'customer_id',
      businessName: 'business_name',
      businessId: 'business_id',
      businessStatus: 'business_status',
      businessExplain: 'business_explain',
      source: 'source',
      businessDate: 'business_date',
      tenant: 'tenant',
      creator: 'creator',
      creatorNick: 'creator_nick',
    };
  }

  static types(): { [key: string]: any } {
    return {
      customerName: 'string',
      customerId: 'string',
      businessName: 'string',
      businessId: 'string',
      businessStatus: 'string',
      businessExplain: 'string',
      source: 'string',
      businessDate: 'string',
      tenant: 'string',
      creator: 'string',
      creatorNick: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用于传输附件链接
export class Attachment extends $tea.Model {
  // 文件唯一标识，作为幂等字段
  /**
   * @example
   * 10100000219487
   */
  fileId: string;
  // 文件名称，用作展示
  /**
   * @example
   * exmaple.pdf
   */
  filename?: string;
  // 访问地址
  /**
   * @example
   * 文件链接
   */
  url: string;
  static names(): { [key: string]: string } {
    return {
      fileId: 'file_id',
      filename: 'filename',
      url: 'url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fileId: 'string',
      filename: 'string',
      url: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 页面上下文
export class PageContext extends $tea.Model {
  // 页面di
  /**
   * @example
   * 12
   */
  pageId?: string;
  // 页面标题
  /**
   * @example
   * 12
   */
  pageTitle?: string;
  static names(): { [key: string]: string } {
    return {
      pageId: 'page_id',
      pageTitle: 'page_title',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageId: 'string',
      pageTitle: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 情报资产详情
export class Asset extends $tea.Model {
  // 资产标识，作为幂等单号
  /**
   * @example
   * 2024112900876318
   */
  assetId: string;
  // VALID - 生效；INVALID - 作废
  /**
   * @example
   * 资产状态
   */
  status: string;
  // 资产详情，自定义展示
  /**
   * @example
   * "{"company":"alpha","name":"beta","phone":"18812345678","email":"hello@example.com","position":"gamma","industry":"zeta","content":"delta"}"
   */
  assetInfo: string;
  static names(): { [key: string]: string } {
    return {
      assetId: 'asset_id',
      status: 'status',
      assetInfo: 'asset_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      assetId: 'string',
      status: 'string',
      assetInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// CategoryLocalVO
export class CategoryLocalVO extends $tea.Model {
  // id
  id?: number;
  // siteId
  siteId?: number;
  // title
  /**
   * @example
   * ""
   */
  title?: string;
  // type
  type?: number;
  // sort
  sort?: number;
  // level
  level?: number;
  // parent_id
  /**
   * @example
   * ""
   */
  parentId?: string;
  // sourceType
  sourceType?: number;
  // show_type
  showType?: number;
  // ext_id
  /**
   * @example
   * ""
   */
  extId?: string;
  // shield
  shieId?: number;
  // status
  status?: number;
  // deleted
  deleted?: number;
  // tree
  /**
   * @example
   * ""
   */
  tree?: string;
  // green
  green?: number;
  // site_code
  /**
   * @example
   * ""
   */
  siteCode?: string;
  // created_time
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  createdTime?: string;
  // modified_time
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  modifiedTime?: string;
  // isCatalogue
  /**
   * @example
   * true, false
   */
  isCatalogue?: boolean;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      siteId: 'site_id',
      title: 'title',
      type: 'type',
      sort: 'sort',
      level: 'level',
      parentId: 'parent_id',
      sourceType: 'source_type',
      showType: 'show_type',
      extId: 'ext_id',
      shieId: 'shie_id',
      status: 'status',
      deleted: 'deleted',
      tree: 'tree',
      green: 'green',
      siteCode: 'site_code',
      createdTime: 'created_time',
      modifiedTime: 'modified_time',
      isCatalogue: 'is_catalogue',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      siteId: 'number',
      title: 'string',
      type: 'number',
      sort: 'number',
      level: 'number',
      parentId: 'string',
      sourceType: 'number',
      showType: 'number',
      extId: 'string',
      shieId: 'number',
      status: 'number',
      deleted: 'number',
      tree: 'string',
      green: 'number',
      siteCode: 'string',
      createdTime: 'string',
      modifiedTime: 'string',
      isCatalogue: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 线索信息请求
export class ClueInformationReq extends $tea.Model {
  // 线索标题
  /**
   * @example
   * 标题
   */
  title: string;
  // 线索跟进状态   INIT:待确认 CONTACTED:跟进中 CLOSED:线索终止 TRANSFER:已转交 BUSINESS:转商机
  /**
   * @example
   *  INIT 
   */
  status: string;
  // 线索跟进人  工号
  /**
   * @example
   * 123132
   */
  createdUserNick: string;
  // 线索描述
  /**
   * @example
   * 线索描述
   */
  description: string;
  // 客户名称
  /**
   * @example
   * XXX公司
   */
  customerName: string;
  // 业务线
  /**
   * @example
   * XXX
   */
  bizLine: string;
  // 客户地址
  /**
   * @example
   * XX省XX市XX区XXX
   */
  customerLocation: string;
  // 公司联系人
  /**
   * @example
   * {           "jobTitle": "经理",           "realName": "张三",           "mobilePhone": "15888888888",           "email": "lisi@lisi.com"         }
   */
  corporateContacts?: CorporateContacts[];
  // 客户所在行业
  /**
   * @example
   * 金融
   */
  customerIndustry: string;
  // 客户营收规模
  /**
   * @example
   *  
   */
  revenueScale?: string;
  // 社会信用代码
  /**
   * @example
   * 914XXXXXXXXXXXXXXX
   */
  socialCreditCode?: string;
  // 线索来源
  /**
   * @example
   * LAOJIAO
   */
  source: string;
  // 客户ID
  /**
   * @example
   * 203434343
   */
  customerId?: string;
  // 多租户模型。线索服务化的租户模型。请联系线索服务管理员提供。固定值。
  /**
   * @example
   * BCC
   */
  tenant: string;
  static names(): { [key: string]: string } {
    return {
      title: 'title',
      status: 'status',
      createdUserNick: 'created_user_nick',
      description: 'description',
      customerName: 'customer_name',
      bizLine: 'biz_line',
      customerLocation: 'customer_location',
      corporateContacts: 'corporate_contacts',
      customerIndustry: 'customer_industry',
      revenueScale: 'revenue_scale',
      socialCreditCode: 'social_credit_code',
      source: 'source',
      customerId: 'customer_id',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      title: 'string',
      status: 'string',
      createdUserNick: 'string',
      description: 'string',
      customerName: 'string',
      bizLine: 'string',
      customerLocation: 'string',
      corporateContacts: { 'type': 'array', 'itemType': CorporateContacts },
      customerIndustry: 'string',
      revenueScale: 'string',
      socialCreditCode: 'string',
      source: 'string',
      customerId: 'string',
      tenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 内容对象
export class ContentObjVO extends $tea.Model {
  // novice_must_sees
  noviceMustSees?: NoviceMustSee[];
  // popular_document
  popularDocument?: PopularDocument[];
  // product_presentation
  /**
   * @example
   * 12
   */
  productPresentation?: string;
  static names(): { [key: string]: string } {
    return {
      noviceMustSees: 'novice_must_sees',
      popularDocument: 'popular_document',
      productPresentation: 'product_presentation',
    };
  }

  static types(): { [key: string]: any } {
    return {
      noviceMustSees: { 'type': 'array', 'itemType': NoviceMustSee },
      popularDocument: { 'type': 'array', 'itemType': PopularDocument },
      productPresentation: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 优惠券模型
export class Coupon extends $tea.Model {
  // 优惠券ID
  /**
   * @example
   * 1231313
   */
  id: number;
  // 优惠券名称,前端展示
  /**
   * @example
   * XX优惠券
   */
  displayName: string;
  // 优惠券模板名称
  /**
   * @example
   * XXXX
   */
  name: string;
  // 优惠券类型，VOUCHER：抵用券;CERTAIN：满减券；DISCOUNT：折扣券
  /**
   * @example
   * VOUCHER
   */
  type: string;
  // 优惠券总金额，单位（分）。可使用优惠金额为amount-used_amount
  /**
   * @example
   * 10000
   */
  amount?: string;
  // 已使用金额，单位（分）。
  /**
   * @example
   * 10000
   */
  usedAmount?: string;
  // 状态，AVAILABLE-有效/EXPIRED-已过期/EXHAUSTED-已用完/ABANDONED-已作废
  /**
   * @example
   * AVAILABLE
   */
  status: string;
  // 有效期开始时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  startTime: string;
  // 有效期结束时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  endTime: string;
  // 模板id
  /**
   * @example
   * 111
   */
  youhuiTemplateId: number;
  // 优惠券=折扣券时使用，如0.75
  /**
   * @example
   * 0.75
   */
  discountRate?: string;
  // 优惠券类型=满减券时使用，如满2000元
  /**
   * @example
   * 2000.00
   */
  fullAmount?: string;
  // 可以使用的总次数
  /**
   * @example
   * 5
   */
  usageCount: number;
  // 已使用次数（冻结次数）
  /**
   * @example
   * 5
   */
  usedCount: number;
  // 适用产品：通用/ECS/RDS
  /**
   * @example
   * 通用
   */
  productList: string;
  // 适用订单类型
  /**
   * @example
   * BUY
   */
  orderTypeList: string;
  //  币种CurrencyCode CNY 代表人民币 USD代表美元
  /**
   * @example
   * CNY
   */
  currency: string;
  // 高精度总金额，单位元。可用金额 high_precision_available_amount = 总金额 high_precision_amount - 已使用金额 high_precision_used_amount
  /**
   * @example
   * 100.00
   */
  highPrecisionAmount: string;
  // 单位元
  /**
   * @example
   * 0.001
   */
  highPrecisionUsedAmount: string;
  // 单位元
  /**
   * @example
   * 100.001
   */
  highPrecisionAvailableAmount: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      displayName: 'display_name',
      name: 'name',
      type: 'type',
      amount: 'amount',
      usedAmount: 'used_amount',
      status: 'status',
      startTime: 'start_time',
      endTime: 'end_time',
      youhuiTemplateId: 'youhui_template_id',
      discountRate: 'discount_rate',
      fullAmount: 'full_amount',
      usageCount: 'usage_count',
      usedCount: 'used_count',
      productList: 'product_list',
      orderTypeList: 'order_type_list',
      currency: 'currency',
      highPrecisionAmount: 'high_precision_amount',
      highPrecisionUsedAmount: 'high_precision_used_amount',
      highPrecisionAvailableAmount: 'high_precision_available_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      displayName: 'string',
      name: 'string',
      type: 'string',
      amount: 'string',
      usedAmount: 'string',
      status: 'string',
      startTime: 'string',
      endTime: 'string',
      youhuiTemplateId: 'number',
      discountRate: 'string',
      fullAmount: 'string',
      usageCount: 'number',
      usedCount: 'number',
      productList: 'string',
      orderTypeList: 'string',
      currency: 'string',
      highPrecisionAmount: 'string',
      highPrecisionUsedAmount: 'string',
      highPrecisionAvailableAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 定价条件
export class PriceConditionAttr extends $tea.Model {
  // 属性code
  /**
   * @example
   * 属性code
   */
  attrCode: string;
  // 属性值code
  /**
   * @example
   * 属性值code
   */
  attrValueCode: string;
  // 属性值名称
  /**
   * @example
   * 属性值名称
   */
  attrValueName: string;
  // 运算符，只有在约束条件中会出现
  /**
   * @example
   * 运算符
   */
  operator?: string;
  static names(): { [key: string]: string } {
    return {
      attrCode: 'attr_code',
      attrValueCode: 'attr_value_code',
      attrValueName: 'attr_value_name',
      operator: 'operator',
    };
  }

  static types(): { [key: string]: any } {
    return {
      attrCode: 'string',
      attrValueCode: 'string',
      attrValueName: 'string',
      operator: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品属性结构
export class CommodityAttribute extends $tea.Model {
  // 属性编码
  /**
   * @example
   * CAPACITY
   */
  code: string;
  // 属性名
  /**
   * @example
   * 资源包容量
   */
  name: string;
  // 默认值
  /**
   * @example
   * 100
   */
  defaultValue: string;
  // 属性值类型，离散值：DISCRETE，数值：NUMBER
  /**
   * @example
   * DISCRETE
   */
  valueType: string;
  // 当是离散值类型时，为多个离散值逗号分隔
  // 当是数值类型时，为JSON，结构为{"rangeType":"open", "min":1, "max": 100, "step:1}
  /**
   * @example
   * 100,200
   */
  valueRange: string;
  // 展示类型
  /**
   * @example
   * RadioGroup
   */
  displayType: string;
  // 提示文案
  /**
   * @example
   * 这是一个属性
   */
  tips: string;
  // 单位
  /**
   * @example
   * 次、分钟
   */
  unit: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      name: 'name',
      defaultValue: 'default_value',
      valueType: 'value_type',
      valueRange: 'value_range',
      displayType: 'display_type',
      tips: 'tips',
      unit: 'unit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      name: 'string',
      defaultValue: 'string',
      valueType: 'string',
      valueRange: 'string',
      displayType: 'string',
      tips: 'string',
      unit: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 非继承型一客一价
export class NoExtendPrice extends $tea.Model {
  // 定价条件
  conditionAttrs?: PriceConditionAttr[];
  // 阶梯开始
  /**
   * @example
   * 0
   */
  ladderStart: string;
  // 阶梯结束
  /**
   * @example
   * infinity
   */
  ladderEnd: string;
  // 签约价
  /**
   * @example
   * 100
   */
  price: string;
  // 计价方法：具体公式、阶梯方法、自定义
  /**
   * @example
   * nonAccDiffFullCalculation
   */
  pricingMethod: string;
  // 阶梯区间类型，左开右闭/左闭右开
  /**
   * @example
   * LCRO
   */
  ladderIntervalType: string;
  // 定价对象code
  /**
   * @example
   * SYS_USAGE_AMOUNT
   */
  priceObjectCode: string;
  // 计价模式：公式、阶梯、自定义
  /**
   * @example
   * ladder
   */
  pricingMode: string;
  // 价格单位
  /**
   * @example
   * 元/次
   */
  unit: string;
  // 是否阶梯总价
  /**
   * @example
   * true, false
   */
  ladderPriceFixed?: boolean;
  static names(): { [key: string]: string } {
    return {
      conditionAttrs: 'condition_attrs',
      ladderStart: 'ladder_start',
      ladderEnd: 'ladder_end',
      price: 'price',
      pricingMethod: 'pricing_method',
      ladderIntervalType: 'ladder_interval_type',
      priceObjectCode: 'price_object_code',
      pricingMode: 'pricing_mode',
      unit: 'unit',
      ladderPriceFixed: 'ladder_price_fixed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      conditionAttrs: { 'type': 'array', 'itemType': PriceConditionAttr },
      ladderStart: 'string',
      ladderEnd: 'string',
      price: 'string',
      pricingMethod: 'string',
      ladderIntervalType: 'string',
      priceObjectCode: 'string',
      pricingMode: 'string',
      unit: 'string',
      ladderPriceFixed: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单周期结构
export class OrderDuration extends $tea.Model {
  // 周期类型，YEAR：年；MONTH：月；DAY：日
  /**
   * @example
   * YEAR
   */
  durationType: string;
  // 订购周期值
  /**
   * @example
   * 1
   */
  durationValue: number;
  static names(): { [key: string]: string } {
    return {
      durationType: 'duration_type',
      durationValue: 'duration_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      durationType: 'string',
      durationValue: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 后付商品签约价，用于在履约阶段生成一客一价
export class PostPayPrice extends $tea.Model {
  //  币种单位值，156（CNY)
  /**
   * @example
   *  币种单位值，156（CNY)
   */
  currencyValue?: string;
  //  价格周期
  /**
   * @example
   *  价格周期
   */
  duration?: OrderDuration;
  // 非继承型一客一价
  /**
   * @example
   * 非继承型一客一价
   */
  noExtendPrices?: NoExtendPrice[];
  static names(): { [key: string]: string } {
    return {
      currencyValue: 'currency_value',
      duration: 'duration',
      noExtendPrices: 'no_extend_prices',
    };
  }

  static types(): { [key: string]: any } {
    return {
      currencyValue: 'string',
      duration: OrderDuration,
      noExtendPrices: { 'type': 'array', 'itemType': NoExtendPrice },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品订购属性结构
export class CommodityOrderAttribute extends $tea.Model {
  // 属性编码
  /**
   * @example
   * SYS_USAGE_AMOUNT
   */
  code: string;
  // 属性值
  /**
   * @example
   * abc
   */
  value: string;
  // 属性值单位，部分数值型属性有多种单位，需要填入；其他情况不需要填
  /**
   * @example
   * MB
   */
  valueUnit: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      value: 'value',
      valueUnit: 'value_unit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      value: 'string',
      valueUnit: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 预付金额
export class PrepayAmount extends $tea.Model {
  // 指定预付费金额
  /**
   * @example
   * 100.00
   */
  amount: string;
  // 币种单位，CNY\USD等标准币种单位编码
  /**
   * @example
   * CNY
   */
  currency: string;
  static names(): { [key: string]: string } {
    return {
      amount: 'amount',
      currency: 'currency',
    };
  }

  static types(): { [key: string]: any } {
    return {
      amount: 'string',
      currency: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 履约选项
export class FulfillmentOptions extends $tea.Model {
  // 是否延迟履约，默认false
  /**
   * @example
   * true, false
   */
  deplay?: boolean;
  // 实际履约开始时间，默认支付完成时间；只有deplay=true时，start_time才生效
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  startTime?: string;
  // 跳过SPI回调，默认false，优先级高于商品上默认的接入属性
  /**
   * @example
   * true,false
   */
  spiSkip?: boolean;
  static names(): { [key: string]: string } {
    return {
      deplay: 'deplay',
      startTime: 'start_time',
      spiSkip: 'spi_skip',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deplay: 'boolean',
      startTime: 'string',
      spiSkip: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 套餐内商品订单结构
export class ComboCommodityOrder extends $tea.Model {
  // 商品编码
  /**
   * @example
   * KXSFFM00264687
   */
  commodityCode: string;
  // 状态
  /**
   * @example
   * COMPLETE
   */
  status: string;
  // 实例ID列表
  /**
   * @example
   * A0BLOCKCHAINAXAXVZSE1ZXEMO6HM2S
   */
  instanceIds: string[];
  static names(): { [key: string]: string } {
    return {
      commodityCode: 'commodity_code',
      status: 'status',
      instanceIds: 'instance_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      commodityCode: 'string',
      status: 'string',
      instanceIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 套餐内商品结构
export class ComboCommodity extends $tea.Model {
  // 商品名称
  /**
   * @example
   * 测试商品
   */
  name: string;
  // 商品在套餐中的唯一编码，当一个套餐中存在两个一样的商品时，编码会不一样
  /**
   * @example
   * ZWZJFM00167122ABCDEF
   */
  uniqueCode: string;
  // 商品主数据编码
  /**
   * @example
   * ZWZJFM00167122
   */
  innerCode: string;
  // 商品类型，资源包：attach
  /**
   * @example
   * attach
   */
  type: string;
  // 付费方式，预付：PREPAY，按量付费：POSTPAY
  /**
   * @example
   * PREPAY
   */
  chargeType: string;
  // 销售属性列表
  /**
   * @example
   * []
   */
  attrs: CommodityAttribute[];
  // 商品数量
  /**
   * @example
   * 1
   */
  quantity: number;
  // 扩展信息，JSON结构，包含标签、个性化配置等数据
  /**
   * @example
   * {"key":"name"}
   */
  extendsConfig: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      uniqueCode: 'unique_code',
      innerCode: 'inner_code',
      type: 'type',
      chargeType: 'charge_type',
      attrs: 'attrs',
      quantity: 'quantity',
      extendsConfig: 'extends_config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      uniqueCode: 'string',
      innerCode: 'string',
      type: 'string',
      chargeType: 'string',
      attrs: { 'type': 'array', 'itemType': CommodityAttribute },
      quantity: 'number',
      extendsConfig: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 支付选项
export class PayOptions extends $tea.Model {
  // 系统自动会根据账号类型、当前OU进行付费渠道判定；如果传入的付款渠道不满足，则报错
  /**
   * @example
   * CUSTOMER_FUND
   */
  payChannel?: string;
  // 支付方式，例如：直付通
  /**
   * @example
   * ZFT
   */
  paymentMethod?: string;
  static names(): { [key: string]: string } {
    return {
      payChannel: 'pay_channel',
      paymentMethod: 'payment_method',
    };
  }

  static types(): { [key: string]: any } {
    return {
      payChannel: 'string',
      paymentMethod: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 履约开通参数
export class ProvisionOption extends $tea.Model {
  // 订单开始时间 (ISO 8601 UTC)，可自定义覆盖默认值
  /**
   * @example
   * 2025-08-22T07:05:49.441Z
   */
  orderStartTime?: string;
  static names(): { [key: string]: string } {
    return {
      orderStartTime: 'order_start_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderStartTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 资源包结构
export class InstanceCapacity extends $tea.Model {
  // 实例ID
  /**
   * @example
   * A0KMMSFM00190219BMZNESCN1ZXEMO6IGIE
   */
  instanceId: string;
  // 当前剩余容量
  /**
   * @example
   * 1000
   */
  currentCapacity: string;
  // 初始容量
  /**
   * @example
   * 1000
   */
  initialCapacity: string;
  // 起始时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  startTime: string;
  // 截止时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  endTime: string;
  // Valid：有效；Closed：已用完；Expired:已到期
  /**
   * @example
   * 状态
   */
  status: string;
  // 资源包对应商品码
  /**
   * @example
   * KXSFFM00264687
   */
  commodityCode: string;
  // 关联按量商品码
  /**
   * @example
   * KKAASP00000001
   */
  relPostpayCommodity: string;
  static names(): { [key: string]: string } {
    return {
      instanceId: 'instance_id',
      currentCapacity: 'current_capacity',
      initialCapacity: 'initial_capacity',
      startTime: 'start_time',
      endTime: 'end_time',
      status: 'status',
      commodityCode: 'commodity_code',
      relPostpayCommodity: 'rel_postpay_commodity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instanceId: 'string',
      currentCapacity: 'string',
      initialCapacity: 'string',
      startTime: 'string',
      endTime: 'string',
      status: 'string',
      commodityCode: 'string',
      relPostpayCommodity: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品同步common_buy内容
export class CommoditySyncCommonBuyInfo extends $tea.Model {
  // 商品列表配置 ListJson字符串
  /**
   * @example
   * {"cyCode":"KXSFFM00329522","cyCodeType":"L5","description":"","gmtCreate":1768268723555,"gmtModified":1768268723555,"h5Mage":"","id":0,"pcImage":"","relateOu":"ZL6","relateSaleCode":"KXSFFSZL600314529","relateSaleName":"企业版"}
   */
  commonBuySaleGroupListJson: string[];
  // 规格配置 ListJson字符串
  /**
   * @example
   * {"attrCode":"L0735","id":4459268,"offerCode":"DJKXFM01233589"}
   */
  offerAttrListJson: string[];
  // Region配置 ListJson字符串
  /**
   * @example
   * {"aliyunRegionCode":"","id":1,"instCode":"","regionCode":"","regionName":"","type":"","zoneRange":""}
   */
  prodOfferRegionListJson: string[];
  // 费用项配置 ListJson字符串
  /**
   * @example
   * {"attrGroupCode":"","attrGroupName":"","attrGroupType":"","feeExpress":"","feeExpressMap":{},"feeList":[{"attrGroupCode":"","attrGroupName":"","fee":"","feeAttr":"","feeId":0,"id":0,"remark":""}],"id":0,"offerCode":"","remark":""}
   */
  offerAttrGroupListJson: string[];
  // 属性配置 ListJson字符串
  /**
   * @example
   * {"attrCode":"","defaultValue":"","displayName":"","express":"","id":0,"offerCode":"","offerVersion":"","remark":"","tip":"","valueRange":""}
   */
  offerExtendAttrListJson: string[];
  // 界面归类配置 ListJson字符串
  /**
   * @example
   * {"displayName":"","groupCode":"","id":1,"memberList":[{"buyDisplay":"","componentCode":"","displayType":"","groupId":0,"id":0,"label":"","labelDisplay":"","required":"","sortId":0,"upgradeDisplay":""}],"offerCode":"","remark":"","seqOrder":1}
   */
  offerCommonBuyGroupListJson: string[];
  // 规格约束配置 ListJson字符串
  /**
   * @example
   * {"cond":"","condType":"","constraintName":"","id":0,"offerCode":"","offerUniqueVid":"","orderType":"","remark":"","result":""}
   */
  offerAttrConstraintsListFson: string[];
  // 售卖规则配置 ListJson字符串
  /**
   * @example
   * {"actionParam":"","groupIndex":0,"groupName":"","id":0,"memberList":[{"groupId":0,"id":0,"isNegative":false,"onlyLogin":"","paramStr":"","ruleCode":"","ruleIndex":0,"ruleScript":"","ruleType":""}],"remark":"","ruleEventCode":""}
   */
  offerRuleGroupListJson: string[];
  static names(): { [key: string]: string } {
    return {
      commonBuySaleGroupListJson: 'common_buy_sale_group_list_json',
      offerAttrListJson: 'offer_attr_list_json',
      prodOfferRegionListJson: 'prod_offer_region_list_json',
      offerAttrGroupListJson: 'offer_attr_group_list_json',
      offerExtendAttrListJson: 'offer_extend_attr_list_json',
      offerCommonBuyGroupListJson: 'offer_common_buy_group_list_json',
      offerAttrConstraintsListFson: 'offer_attr_constraints_list_fson',
      offerRuleGroupListJson: 'offer_rule_group_list_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      commonBuySaleGroupListJson: { 'type': 'array', 'itemType': 'string' },
      offerAttrListJson: { 'type': 'array', 'itemType': 'string' },
      prodOfferRegionListJson: { 'type': 'array', 'itemType': 'string' },
      offerAttrGroupListJson: { 'type': 'array', 'itemType': 'string' },
      offerExtendAttrListJson: { 'type': 'array', 'itemType': 'string' },
      offerCommonBuyGroupListJson: { 'type': 'array', 'itemType': 'string' },
      offerAttrConstraintsListFson: { 'type': 'array', 'itemType': 'string' },
      offerRuleGroupListJson: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品实例
export class CommodityInstance extends $tea.Model {
  // 订单号
  /**
   * @example
   * 2088123412341234
   */
  bizNo?: string;
  // 商品编码
  /**
   * @example
   * KKAASP00001001
   */
  commodityCode: string;
  // 销售主体，不传默认ZL6
  /**
   * @example
   * ZL6,ZL7,ZJ9
   */
  ou?: string;
  // 订单类型，NEW：新购；RENEW：续费； MODIFY：变配 不填默认新购
  /**
   * @example
   * NEW 
   */
  orderType?: string;
  // 订购时长
  duration?: OrderDuration;
  // 优惠券ID
  /**
   * @example
   * 12345678
   */
  couponId?: string;
  // 数量，不填默认1
  quantity?: number;
  // 	
  // 商品订购属性，开通型商品部需要填写
  /**
   * @example
   * []
   */
  commodityAttrs?: CommodityOrderAttribute[];
  // 履约选项
  fulfillmentOptions?: FulfillmentOptions;
  // 实例ID，续费/变配场景必传
  /**
   * @example
   * A0BQBHFM00034877FVDJWUXR1ZXEMOD1U4G
   */
  instanceId?: string;
  // 预付费订单金额。仅白名单商品且batchBizNo是合法的合同ID的情况，才允许指定预付订单金额
  prepayAmount?: PrepayAmount;
  // 后付商品签约价，用于在履约阶段生成一客一价
  postPayPrice?: PostPayPrice;
  static names(): { [key: string]: string } {
    return {
      bizNo: 'biz_no',
      commodityCode: 'commodity_code',
      ou: 'ou',
      orderType: 'order_type',
      duration: 'duration',
      couponId: 'coupon_id',
      quantity: 'quantity',
      commodityAttrs: 'commodity_attrs',
      fulfillmentOptions: 'fulfillment_options',
      instanceId: 'instance_id',
      prepayAmount: 'prepay_amount',
      postPayPrice: 'post_pay_price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizNo: 'string',
      commodityCode: 'string',
      ou: 'string',
      orderType: 'string',
      duration: OrderDuration,
      couponId: 'string',
      quantity: 'number',
      commodityAttrs: { 'type': 'array', 'itemType': CommodityOrderAttribute },
      fulfillmentOptions: FulfillmentOptions,
      instanceId: 'string',
      prepayAmount: PrepayAmount,
      postPayPrice: PostPayPrice,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 套餐内商品信息列表（仅包含当前 OU 下上架的商品）
export class ComboItemDTO extends $tea.Model {
  // 主键ID
  /**
   * @example
   * 123
   */
  id?: number;
  // 唯一编码
  /**
   * @example
   * 123xxx
   */
  uniqueCode?: string;
  // 商品名称
  /**
   * @example
   * xxx商品
   */
  offerName?: string;
  // 商品主数据CODE
  /**
   * @example
   * sf12321xxx
   */
  offerInnerCode?: string;
  // 商品销售CODE（仅当指定 ou 且商品在该 OU 下上架时有值）
  /**
   * @example
   * sf123xxxx
   */
  offerSaleCode?: string;
  // 商品规格，JSON 结构
  /**
   * @example
   * {}
   */
  offerAttr?: string;
  // 商品规格描述
  /**
   * @example
   * xxx描述
   */
  offerAttrDesc?: string;
  // 付费方式（如 AFTER_PAY_BY_HOUR 后付费量价、PREPAY_BY_MONTH 预付费包年包月）
  /**
   * @example
   * AFTER_PAY_BY_HOUR
   */
  chargeType?: string;
  // 商品数量
  /**
   * @example
   * 1
   */
  quantity?: number;
  // 订购周期类型
  /**
   * @example
   * Y
   */
  durationType?: string;
  // 订购周期值
  /**
   * @example
   * 1
   */
  durationValue?: number;
  // 是否必选（true 必选，false 可选）
  /**
   * @example
   * true
   */
  required?: boolean;
  // 商品在套餐中的排序
  /**
   * @example
   * 1
   */
  seqOrder?: number;
  // 扩展配置
  /**
   * @example
   * {}
   */
  extendsConfig?: string;
  // 商品规格 JSON 结构，CommodityInfo 的 JSON 序列化字符串
  /**
   * @example
   * {}
   */
  offerAttrOption?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      uniqueCode: 'unique_code',
      offerName: 'offer_name',
      offerInnerCode: 'offer_inner_code',
      offerSaleCode: 'offer_sale_code',
      offerAttr: 'offer_attr',
      offerAttrDesc: 'offer_attr_desc',
      chargeType: 'charge_type',
      quantity: 'quantity',
      durationType: 'duration_type',
      durationValue: 'duration_value',
      required: 'required',
      seqOrder: 'seq_order',
      extendsConfig: 'extends_config',
      offerAttrOption: 'offer_attr_option',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      uniqueCode: 'string',
      offerName: 'string',
      offerInnerCode: 'string',
      offerSaleCode: 'string',
      offerAttr: 'string',
      offerAttrDesc: 'string',
      chargeType: 'string',
      quantity: 'number',
      durationType: 'string',
      durationValue: 'number',
      required: 'boolean',
      seqOrder: 'number',
      extendsConfig: 'string',
      offerAttrOption: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 套餐订单结构
export class ComboOrder extends $tea.Model {
  // 租户ID
  /**
   * @example
   * 2088xxx
   */
  tenantId: string;
  // 业务流水号
  /**
   * @example
   * 2088123412341234
   */
  bizNo: string;
  // 套餐订单号
  /**
   * @example
   * 2088123412341234
   */
  orderId: string;
  // 套餐编码
  /**
   * @example
   * KKAASP00001001
   */
  comboCode: string;
  // 套餐名称，下单时的套餐名称
  /**
   * @example
   * 测试套餐
   */
  comboName: string;
  // 订单状态，CREATED：创建；CANCEL：取消；PAYING：支付中；PAID：支付完成
  /**
   * @example
   * CREATED
   */
  status: string;
  // 履约生产状态，INCOMPLETE:未完成、COMPLETED:完成
  /**
   * @example
   * COMPLETED
   */
  provisionStatus: string;
  // 订单原始金额
  /**
   * @example
   * 200.00
   */
  originalAmount: string;
  // 折扣金额
  /**
   * @example
   * 100.00
   */
  discountAmount: string;
  // 优惠金额
  /**
   * @example
   * 100.00
   */
  couponAmount: string;
  // 实付金额
  /**
   * @example
   * 0.00
   */
  payAmount: string;
  // 下单时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  gmtCreate: string;
  // 套餐内商品订单列表
  /**
   * @example
   * []
   */
  commodityOrders: ComboCommodityOrder[];
  // 支付完成时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  payTime: string;
  // 支付渠道
  /**
   * @example
   * CUSTOMER_FUND
   */
  payChannel: string;
  static names(): { [key: string]: string } {
    return {
      tenantId: 'tenant_id',
      bizNo: 'biz_no',
      orderId: 'order_id',
      comboCode: 'combo_code',
      comboName: 'combo_name',
      status: 'status',
      provisionStatus: 'provision_status',
      originalAmount: 'original_amount',
      discountAmount: 'discount_amount',
      couponAmount: 'coupon_amount',
      payAmount: 'pay_amount',
      gmtCreate: 'gmt_create',
      commodityOrders: 'commodity_orders',
      payTime: 'pay_time',
      payChannel: 'pay_channel',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tenantId: 'string',
      bizNo: 'string',
      orderId: 'string',
      comboCode: 'string',
      comboName: 'string',
      status: 'string',
      provisionStatus: 'string',
      originalAmount: 'string',
      discountAmount: 'string',
      couponAmount: 'string',
      payAmount: 'string',
      gmtCreate: 'string',
      commodityOrders: { 'type': 'array', 'itemType': ComboCommodityOrder },
      payTime: 'string',
      payChannel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品定价结构
export class CommodityPricing extends $tea.Model {
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

// 标签对象
export class InstanceLabel extends $tea.Model {
  // 标签名。
  // 传递isvId
  /**
   * @example
   * isvId
   */
  instanceKey: string;
  // 标签值
  /**
   * @example
   * 邀请码
   */
  instanceValue: string;
  static names(): { [key: string]: string } {
    return {
      instanceKey: 'instance_key',
      instanceValue: 'instance_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instanceKey: 'string',
      instanceValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 价格策略
export class PriceStrategy extends $tea.Model {
  // 继承租户在商品下的价格，仅后付费商品生效
  /**
   * @example
   * 2088123412341234
   */
  followTenantId?: string;
  static names(): { [key: string]: string } {
    return {
      followTenantId: 'follow_tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      followTenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品同步common_buy内容
export class OfferSyncCommonBuyInfo extends $tea.Model {
  // 商品列表配置 ListJson字符串
  /**
   * @example
   * {"cyCode":"KXSFFM00329522","cyCodeType":"L5","description":"","gmtCreate":1768268723555,"gmtModified":1768268723555,"h5Mage":"","id":0,"pcImage":"","relateOu":"ZL6","relateSaleCode":"KXSFFSZL600314529","relateSaleName":"企业版"}
   */
  commonBuySaleGroupListJson: string[];
  // 规格配置 ListJson字符串
  /**
   * @example
   * {"attrCode":"L0735","id":4459268,"offerCode":"DJKXFM01233589"}
   */
  offerAttrListJson: string[];
  // Region配置 ListJson字符串
  /**
   * @example
   * {"aliyunRegionCode":"","id":1,"instCode":"","regionCode":"","regionName":"","type":"","zoneRange":""}
   */
  prodOfferRegionListJson: string[];
  // 费用项配置 ListJson字符串
  /**
   * @example
   * {"attrGroupCode":"","attrGroupName":"","attrGroupType":"","feeExpress":"","feeExpressMap":{},"feeList":[{"attrGroupCode":"","attrGroupName":"","fee":"","feeAttr":"","feeId":0,"id":0,"remark":""}],"id":0,"offerCode":"","remark":""}
   */
  offerAttrGroupListJson: string[];
  // 属性配置 ListJson字符串
  /**
   * @example
   * {"attrCode":"","defaultValue":"","displayName":"","express":"","id":0,"offerCode":"","offerVersion":"","remark":"","tip":"","valueRange":""}
   */
  offerExtendAttrListJson: string[];
  // 界面归类配置 ListJson字符串
  /**
   * @example
   * {"displayName":"","groupCode":"","id":1,"memberList":[{"buyDisplay":"","componentCode":"","displayType":"","groupId":0,"id":0,"label":"","labelDisplay":"","required":"","sortId":0,"upgradeDisplay":""}],"offerCode":"","remark":"","seqOrder":1}
   */
  offerCommonBuyGroupListJson: string[];
  // 规格约束配置 ListJson字符串
  /**
   * @example
   * {"cond":"","condType":"","constraintName":"","id":0,"offerCode":"","offerUniqueVid":"","orderType":"","remark":"","result":""}
   */
  offerAttrConstraintsListJson: string[];
  // 售卖规则配置 ListJson字符串
  /**
   * @example
   * {"actionParam":"","groupIndex":0,"groupName":"","id":0,"memberList":[{"groupId":0,"id":0,"isNegative":false,"onlyLogin":"","paramStr":"","ruleCode":"","ruleIndex":0,"ruleScript":"","ruleType":""}],"remark":"","ruleEventCode":""}
   */
  offerRuleGroupListJson: string[];
  static names(): { [key: string]: string } {
    return {
      commonBuySaleGroupListJson: 'common_buy_sale_group_list_json',
      offerAttrListJson: 'offer_attr_list_json',
      prodOfferRegionListJson: 'prod_offer_region_list_json',
      offerAttrGroupListJson: 'offer_attr_group_list_json',
      offerExtendAttrListJson: 'offer_extend_attr_list_json',
      offerCommonBuyGroupListJson: 'offer_common_buy_group_list_json',
      offerAttrConstraintsListJson: 'offer_attr_constraints_list_json',
      offerRuleGroupListJson: 'offer_rule_group_list_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      commonBuySaleGroupListJson: { 'type': 'array', 'itemType': 'string' },
      offerAttrListJson: { 'type': 'array', 'itemType': 'string' },
      prodOfferRegionListJson: { 'type': 'array', 'itemType': 'string' },
      offerAttrGroupListJson: { 'type': 'array', 'itemType': 'string' },
      offerExtendAttrListJson: { 'type': 'array', 'itemType': 'string' },
      offerCommonBuyGroupListJson: { 'type': 'array', 'itemType': 'string' },
      offerAttrConstraintsListJson: { 'type': 'array', 'itemType': 'string' },
      offerRuleGroupListJson: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 创建订单返回结果
export class CreateTradeOrderResult extends $tea.Model {
  // 订单号
  /**
   * @example
   * 2088123412341234
   */
  orderId: string;
  // 下单时的订单号
  /**
   * @example
   * 2088123412341234
   */
  bizNo: string;
  // 实例ID列表
  instanceIds?: string[];
  // 订单状态
  /**
   * @example
   * PAY_SUCCESS
   */
  payStatus: string;
  // 订购错误码
  /**
   * @example
   * 订购错误码
   */
  orderErrorCode?: string;
  // 订购错误描述	
  /**
   * @example
   * 订购错误描述 
   */
  orderErrorDescription?: string;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      bizNo: 'biz_no',
      instanceIds: 'instance_ids',
      payStatus: 'pay_status',
      orderErrorCode: 'order_error_code',
      orderErrorDescription: 'order_error_description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      bizNo: 'string',
      instanceIds: { 'type': 'array', 'itemType': 'string' },
      payStatus: 'string',
      orderErrorCode: 'string',
      orderErrorDescription: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品询价结构
export class CommodityEnquiryPrice extends $tea.Model {
  // 商品主数据编码
  /**
   * @example
   * KXSFFM00264687
   */
  commodityCode: string;
  // 商品名称
  /**
   * @example
   * 测试商品
   */
  commodityName: string;
  // 预付-支付金额
  /**
   * @example
   * 100.00
   */
  payAmount: string;
  // 预付费-原始金额
  /**
   * @example
   * 200.00
   */
  originalAmount: string;
  // 预付费-折扣金额
  /**
   * @example
   * 100.00
   */
  discountAmount: string;
  // 预付费-优惠券抵扣金额
  /**
   * @example
   * 0.00
   */
  couponAmount: string;
  // 原订购剩余价值，用于变配场景
  /**
   * @example
   * 50.00
   */
  subscriptionUnusedAmount: string;
  // 命中的活动编码
  /**
   * @example
   * a05d8efc-b1c8-42a0-9666-98f419d4e2eb
   */
  activityCode: string;
  // 命中的活动名称
  /**
   * @example
   * 测试折扣活动
   */
  activityName: string;
  // 命中的定价计划ID
  /**
   * @example
   * 1000
   */
  pricePlanId: number;
  // 命中的定价约束ID
  /**
   * @example
   * 2000
   */
  priceConstraintId: number;
  // 币种，元：CNY
  /**
   * @example
   * CNY
   */
  currency: string;
  // 基于剩余价值变配场景下，预测的支付金额正常的最小订购周期
  minDurationOfValidPayAmount?: OrderDuration;
  // 预付费-折扣率
  /**
   * @example
   * 0.75
   */
  discountRate: string;
  // 原始BD权限价金额，白名单商品会返回此价格
  /**
   * @example
   * 160.00
   */
  originalBdAmount?: string;
  // 原始成本价金额，白名单商品会返回此价格
  /**
   * @example
   * 100.00
   */
  originalCostAmount?: string;
  static names(): { [key: string]: string } {
    return {
      commodityCode: 'commodity_code',
      commodityName: 'commodity_name',
      payAmount: 'pay_amount',
      originalAmount: 'original_amount',
      discountAmount: 'discount_amount',
      couponAmount: 'coupon_amount',
      subscriptionUnusedAmount: 'subscription_unused_amount',
      activityCode: 'activity_code',
      activityName: 'activity_name',
      pricePlanId: 'price_plan_id',
      priceConstraintId: 'price_constraint_id',
      currency: 'currency',
      minDurationOfValidPayAmount: 'min_duration_of_valid_pay_amount',
      discountRate: 'discount_rate',
      originalBdAmount: 'original_bd_amount',
      originalCostAmount: 'original_cost_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      commodityCode: 'string',
      commodityName: 'string',
      payAmount: 'string',
      originalAmount: 'string',
      discountAmount: 'string',
      couponAmount: 'string',
      subscriptionUnusedAmount: 'string',
      activityCode: 'string',
      activityName: 'string',
      pricePlanId: 'number',
      priceConstraintId: 'number',
      currency: 'string',
      minDurationOfValidPayAmount: OrderDuration,
      discountRate: 'string',
      originalBdAmount: 'string',
      originalCostAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 套餐基本信息
export class ComboDTO extends $tea.Model {
  // 主键id
  /**
   * @example
   * 123
   */
  id?: number;
  // 套餐名称
  /**
   * @example
   * 套餐名称xxx
   */
  name?: string;
  // 套餐描述
  /**
   * @example
   * 套餐描述
   */
  description?: string;
  // 套餐状态 DRAFT("DRAFT", "草稿"), ONLINE("ONLINE", "已上架"),OFFLINE("OFFLINE", "已下架");
  /**
   * @example
   * DRAFT
   */
  status?: string;
  // 套餐编码
  /**
   * @example
   * C00250884
   */
  code?: string;
  // 套餐唯一版本号，模板变更时更新
  /**
   * @example
   * CV00252581
   */
  vid?: string;
  // 父版本号
  /**
   * @example
   * 1232456
   */
  parentVid?: string;
  // 扩展配置
  /**
   * @example
   * {}
   */
  extendsConfig?: string;
  // 创建人
  /**
   * @example
   * 012111
   */
  creator?: string;
  // 修改人
  /**
   * @example
   * 0121111
   */
  modify?: string;
  // 审批流程ID
  /**
   * @example
   * 123212312
   */
  auditProcessId?: string;
  // 审批状态
  /**
   * @example
   * PASS
   */
  auditStatus?: string;
  // 合同ID
  /**
   * @example
   * 20883519xxxxxxxx
   */
  quotationId?: string;
  // 项目ID
  /**
   * @example
   * 102876
   */
  projectId?: string;
  // 其他扩展信息
  /**
   * @example
   * {}
   */
  extendsInfo?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      description: 'description',
      status: 'status',
      code: 'code',
      vid: 'vid',
      parentVid: 'parent_vid',
      extendsConfig: 'extends_config',
      creator: 'creator',
      modify: 'modify',
      auditProcessId: 'audit_process_id',
      auditStatus: 'audit_status',
      quotationId: 'quotation_id',
      projectId: 'project_id',
      extendsInfo: 'extends_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      name: 'string',
      description: 'string',
      status: 'string',
      code: 'string',
      vid: 'string',
      parentVid: 'string',
      extendsConfig: 'string',
      creator: 'string',
      modify: 'string',
      auditProcessId: 'string',
      auditStatus: 'string',
      quotationId: 'string',
      projectId: 'string',
      extendsInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 套餐结构
export class Combo extends $tea.Model {
  // 套餐名称
  /**
   * @example
   * 测试套餐
   */
  code: string;
  // 套餐编码
  /**
   * @example
   * KKAASP00001001
   */
  name: string;
  // 套餐版本号
  /**
   * @example
   * SPV202105192651
   */
  vid: string;
  // 套餐描述
  /**
   * @example
   * 这是一个套餐
   */
  description: string;
  // 扩展信息，JSON结构，包含标签、个性化配置等数据
  /**
   * @example
   * {"key":"name"}
   */
  extendsConfig: string;
  // 状态
  /**
   * @example
   * ONLINE
   */
  status: string;
  // 套餐内商品列表
  /**
   * @example
   * [] 
   */
  commodities: ComboCommodity[];
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      name: 'name',
      vid: 'vid',
      description: 'description',
      extendsConfig: 'extends_config',
      status: 'status',
      commodities: 'commodities',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      name: 'string',
      vid: 'string',
      description: 'string',
      extendsConfig: 'string',
      status: 'string',
      commodities: { 'type': 'array', 'itemType': ComboCommodity },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户选择的规格配置列表
export class SelectedConfigItem extends $tea.Model {
  // 商品主数据内码（L5内码）
  /**
   * @example
   * BSTAFM01234567
   */
  offerInnerCode: string;
  // 商品销售码（带 OU 属性）
  /**
   * @example
   * BSTAFSZL70139xxxx
   */
  offerSaleCode: string;
  // 购买时长；预付费根据实际时长填写，后付费填 1
  /**
   * @example
   * 1
   */
  duration: number;
  // 购买时长单位； month / year
  /**
   * @example
   * month
   */
  pricingCycle: string;
  // 购买实例的数量
  /**
   * @example
   * 1
   */
  quantity: number;
  // 该子商品使用的优惠券ID
  /**
   * @example
   * 123456
   */
  couponId?: string;
  // 要购买的产品规格配件值,JSON格式
  /**
   * @example
   * {}
   */
  componentsMap?: string;
  static names(): { [key: string]: string } {
    return {
      offerInnerCode: 'offer_inner_code',
      offerSaleCode: 'offer_sale_code',
      duration: 'duration',
      pricingCycle: 'pricing_cycle',
      quantity: 'quantity',
      couponId: 'coupon_id',
      componentsMap: 'components_map',
    };
  }

  static types(): { [key: string]: any } {
    return {
      offerInnerCode: 'string',
      offerSaleCode: 'string',
      duration: 'number',
      pricingCycle: 'string',
      quantity: 'number',
      couponId: 'string',
      componentsMap: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 实例
export class Instance extends $tea.Model {
  // 租户id
  /**
   * @example
   * 2088*****
   */
  tenantId: string;
  // 实例id
  /**
   * @example
   * 实例id
   */
  instanceId: string;
  // 商品code
  /**
   * @example
   * ECS
   */
  productName: string;
  // 付费类型 PREPAY_BY_MONTH 预付 AFTER_PAY_BY_HOUR 后付 MIX_PAY 混合付
  /**
   * @example
   * PREPAY_BY_MONTH
   */
  chargeType: string;
  // 状态 CREATING 创建中 FAILED 创建失败  STARTED 运行中 STOPPED 已停服  RELEASED 已释放
  /**
   * @example
   * STARTED
   */
  status: string;
  static names(): { [key: string]: string } {
    return {
      tenantId: 'tenant_id',
      instanceId: 'instance_id',
      productName: 'product_name',
      chargeType: 'charge_type',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tenantId: 'string',
      instanceId: 'string',
      productName: 'string',
      chargeType: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 下单返回接口
export class CreateOrderResult extends $tea.Model {
  // 下单时指定的业务流水号。二级订单号
  /**
   * @example
   * 2088****
   */
  bsnNo: string;
  // 一级订单号
  /**
   * @example
   * 2088*****
   */
  orderId: string;
  // 二级订单号
  /**
   * @example
   * 2088*****
   */
  normalOrderLineId: string;
  // 订单状态
  /**
   * @example
   * ORDER_INIT
   */
  orderStatus: string;
  // 实例列表
  /**
   * @example
   * A0****
   */
  instanceIds: string;
  // 订购错误码
  /**
   * @example
   * 订购错误码
   */
  orderErrorCode: string;
  // 订购错误描述
  /**
   * @example
   * 订购错误描述
   */
  orderErrorDescription: string;
  static names(): { [key: string]: string } {
    return {
      bsnNo: 'bsn_no',
      orderId: 'order_id',
      normalOrderLineId: 'normal_order_line_id',
      orderStatus: 'order_status',
      instanceIds: 'instance_ids',
      orderErrorCode: 'order_error_code',
      orderErrorDescription: 'order_error_description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bsnNo: 'string',
      orderId: 'string',
      normalOrderLineId: 'string',
      orderStatus: 'string',
      instanceIds: 'string',
      orderErrorCode: 'string',
      orderErrorDescription: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 约束条件列表
export class PriceConstraintConditionVO extends $tea.Model {
  // 约束ID
  id: number;
  // 价格约束ID
  priceConstraintId: number;
  // 规格条件CODE
  /**
   * @example
   * test
   */
  specConditionCode?: string;
  // 条件关系比较符
  /**
   * @example
   * test
   */
  operator?: string;
  // 待比较对象的值
  /**
   * @example
   * test
   */
  targetValue?: string;
  // 特定场景下set才会有值
  /**
   * @example
   * test
   */
  specConditionName?: string;
  // 特定场景下set才会有值
  /**
   * @example
   * test
   */
  targetValueName?: string;
  // 描述
  /**
   * @example
   * test
   */
  description?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      priceConstraintId: 'price_constraint_id',
      specConditionCode: 'spec_condition_code',
      operator: 'operator',
      targetValue: 'target_value',
      specConditionName: 'spec_condition_name',
      targetValueName: 'target_value_name',
      description: 'description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      priceConstraintId: 'number',
      specConditionCode: 'string',
      operator: 'string',
      targetValue: 'string',
      specConditionName: 'string',
      targetValueName: 'string',
      description: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// l5数据
export class OfferMaster extends $tea.Model {
  // 内部商品码
  /**
   * @example
   * baas_pre
   */
  innerCode: string;
  // 用于展示的格式化商品编码
  /**
   * @example
   * PBC0000C013P-R
   */
  formatCode: string;
  // 外部商品编码
  /**
   * @example
   * baas_pre
   */
  outerCode: string;
  // 商品名称
  /**
   * @example
   * 蚂蚁链BaaS平台（包年包月）
   */
  name: string;
  // 商品描述
  /**
   * @example
   * 商品描述
   */
  description: string;
  // 产品code
  /**
   * @example
   * productCode
   */
  productCode: string;
  // 渠道产品编码
  /**
   * @example
   * TWCBAG
   */
  serviceCode: string;
  // l4编码
  /**
   * @example
   * MSRJSPU00000028
   */
  spuCode: string;
  static names(): { [key: string]: string } {
    return {
      innerCode: 'inner_code',
      formatCode: 'format_code',
      outerCode: 'outer_code',
      name: 'name',
      description: 'description',
      productCode: 'product_code',
      serviceCode: 'service_code',
      spuCode: 'spu_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      innerCode: 'string',
      formatCode: 'string',
      outerCode: 'string',
      name: 'string',
      description: 'string',
      productCode: 'string',
      serviceCode: 'string',
      spuCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 约束结果
export class PriceConstraintResultVO extends $tea.Model {
  // 价格id
  /**
   * @example
   * 0,1
   */
  id: number;
  // 价格约束ID
  /**
   * @example
   * 0,1
   */
  priceConstraintId: number;
  // 基础价格费率
  /**
   * @example
   * test
   */
  basePrice?: string;
  // 基础保底价
  /**
   * @example
   * test
   */
  adjustPrice?: string;
  // BD销售最低价费率
  /**
   * @example
   * test
   */
  bdPrice?: string;
  // 成本价费率
  /**
   * @example
   * test
   */
  costPrice?: string;
  // 阶梯区间最小值
  /**
   * @example
   * test
   */
  ladderStart?: string;
  // 阶梯区间结束值
  /**
   * @example
   * test
   */
  ladderEnd?: string;
  // 价格单位，例如：元/每次
  /**
   * @example
   * test
   */
  priceUnit?: string;
  // 是否阶梯固定价
  /**
   * @example
   * test
   */
  ladderPriceFixed?: boolean;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      priceConstraintId: 'price_constraint_id',
      basePrice: 'base_price',
      adjustPrice: 'adjust_price',
      bdPrice: 'bd_price',
      costPrice: 'cost_price',
      ladderStart: 'ladder_start',
      ladderEnd: 'ladder_end',
      priceUnit: 'price_unit',
      ladderPriceFixed: 'ladder_price_fixed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      priceConstraintId: 'number',
      basePrice: 'string',
      adjustPrice: 'string',
      bdPrice: 'string',
      costPrice: 'string',
      ladderStart: 'string',
      ladderEnd: 'string',
      priceUnit: 'string',
      ladderPriceFixed: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 潜客接受度市场逻辑明细
export class AcceptanceDetail extends $tea.Model {
  // 客户名称
  /**
   * @example
   * test
   */
  name?: string;
  // 客户价格
  /**
   * @example
   * test
   */
  price?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      price: 'price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      price: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 基于竞品及加成市场逻辑明细
export class AdditionDetail extends $tea.Model {
  // 友商名称
  /**
   * @example
   * test
   */
  name?: string;
  // 友商价格
  /**
   * @example
   * test
   */
  profit?: string;
  // 技术分调整
  /**
   * @example
   * test
   */
  technicalScore?: string;
  // 品牌分调整
  /**
   * @example
   * test
   */
  brandScore?: string;
  // BD权限价预估
  /**
   * @example
   * test
   */
  bdPricePredict?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      profit: 'profit',
      technicalScore: 'technical_score',
      brandScore: 'brand_score',
      bdPricePredict: 'bd_price_predict',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      profit: 'string',
      technicalScore: 'string',
      brandScore: 'string',
      bdPricePredict: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 成本法信息
export class CostInfo extends $tea.Model {
  // 成本法原因
  /**
   * @example
   * test
   */
  costReason?: string;
  // 预期毛利率
  /**
   * @example
   * test
   */
  predictProfit?: string;
  static names(): { [key: string]: string } {
    return {
      costReason: 'cost_reason',
      predictProfit: 'predict_profit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      costReason: 'string',
      predictProfit: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 定价计划对应的约束
export class PriceConstraintVO extends $tea.Model {
  // 定价计划ID
  /**
   * @example
   * 0,1
   */
  id: number;
  // 定价计划ID
  /**
   * @example
   * 0,1
   */
  pricePlanId: number;
  // 定价计划名称
  /**
   * @example
   * test
   */
  name?: string;
  // 描述
  /**
   * @example
   * test
   */
  description?: string;
  // 约束条件列表
  /**
   * @example
   * test
   */
  priceConstraintConditionVoList?: PriceConstraintConditionVO[];
  // 约束结果列表
  /**
   * @example
   * test
   */
  priceConstraintResultVoList?: PriceConstraintResultVO[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      pricePlanId: 'price_plan_id',
      name: 'name',
      description: 'description',
      priceConstraintConditionVoList: 'price_constraint_condition_vo_list',
      priceConstraintResultVoList: 'price_constraint_result_vo_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      pricePlanId: 'number',
      name: 'string',
      description: 'string',
      priceConstraintConditionVoList: { 'type': 'array', 'itemType': PriceConstraintConditionVO },
      priceConstraintResultVoList: { 'type': 'array', 'itemType': PriceConstraintResultVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 客户价价值法信息
export class CustomerValueDetail extends $tea.Model {
  // 名称
  /**
   * @example
   * test
   */
  name?: string;
  // 友商价格
  /**
   * @example
   * test
   */
  profit?: string;
  // 蚂蚁收益
  /**
   * @example
   * test
   */
  antDivide?: string;
  // BD权限价预估
  /**
   * @example
   * test
   */
  bdPricePredict?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      profit: 'profit',
      antDivide: 'ant_divide',
      bdPricePredict: 'bd_price_predict',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      profit: 'string',
      antDivide: 'string',
      bdPricePredict: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 价格限制策略
// 目前只支持保底价格配置
export class PriceLimitStrategyDTO extends $tea.Model {
  // 创建人
  /**
   * @example
   * test
   */
  creator?: string;
  // 修改人
  /**
   * @example
   * test
   */
  modifier?: string;
  // 是否删除
  /**
   * @example
   * true, false
   */
  deleted?: boolean;
  // 定价计划ID
  /**
   * @example
   * 0,1
   */
  pricePlanId: number;
  // 保底周期,year年、month月
  /**
   * @example
   * test
   */
  durationType?: string;
  // 保底价格
  /**
   * @example
   * test
   */
  guaranteePrice?: string;
  // 产品成本
  /**
   * @example
   * test
   */
  guaranteeCostPrice?: string;
  static names(): { [key: string]: string } {
    return {
      creator: 'creator',
      modifier: 'modifier',
      deleted: 'deleted',
      pricePlanId: 'price_plan_id',
      durationType: 'duration_type',
      guaranteePrice: 'guarantee_price',
      guaranteeCostPrice: 'guarantee_cost_price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      creator: 'string',
      modifier: 'string',
      deleted: 'boolean',
      pricePlanId: 'number',
      durationType: 'string',
      guaranteePrice: 'string',
      guaranteeCostPrice: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 市场法信息
export class MarketInfo extends $tea.Model {
  // 市场逻辑
  /**
   * @example
   * test
   */
  marketLogic?: string;
  // 潜客接受度
  /**
   * @example
   * test
   */
  acceptanceDetails?: AcceptanceDetail[];
  // 基于竞品及加成
  /**
   * @example
   * test
   */
  additionDetails?: AdditionDetail[];
  static names(): { [key: string]: string } {
    return {
      marketLogic: 'market_logic',
      acceptanceDetails: 'acceptance_details',
      additionDetails: 'addition_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      marketLogic: 'string',
      acceptanceDetails: { 'type': 'array', 'itemType': AcceptanceDetail },
      additionDetails: { 'type': 'array', 'itemType': AdditionDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 产品线SPU
export class ProductSpu extends $tea.Model {
  // SPU编码
  /**
   * @example
   * QYBBSPU00000001
   */
  spuCode: string;
  // SPU名称
  /**
   * @example
   * 积分兑换
   */
  spuName: string;
  // spu描述
  /**
   * @example
   * 积分兑换场景
   */
  spuDesc: string;
  // 交付模式，ONLINE/OFFLINE
  /**
   * @example
   * ONLINE
   */
  deliveryMode: string;
  // 归属产品码
  /**
   * @example
   * QYBB
   */
  productCode: string;
  // 是否涉及一方化 
  /**
   * @example
   * true, false
   */
  involvedOneParty: boolean;
  // technical_product:技术产品，technical_service:技术服务，solution_se:标准解决方案，saas:标准化SaaS，saas+:SaaS +，trading_network:交易网络
  /**
   * @example
   * solution_se
   */
  segment: string;
  // sku数据
  offerMaster: OfferMaster[];
  static names(): { [key: string]: string } {
    return {
      spuCode: 'spu_code',
      spuName: 'spu_name',
      spuDesc: 'spu_desc',
      deliveryMode: 'delivery_mode',
      productCode: 'product_code',
      involvedOneParty: 'involved_one_party',
      segment: 'segment',
      offerMaster: 'offer_master',
    };
  }

  static types(): { [key: string]: any } {
    return {
      spuCode: 'string',
      spuName: 'string',
      spuDesc: 'string',
      deliveryMode: 'string',
      productCode: 'string',
      involvedOneParty: 'boolean',
      segment: 'string',
      offerMaster: { 'type': 'array', 'itemType': OfferMaster },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// L3
export class BusinessProduct extends $tea.Model {
  // 业务产品code
  /**
   * @example
   * BAASPLUS
   */
  code: string;
  // 产品线名称
  /**
   * @example
   * BaaS增值服务
   */
  name: string;
  // 归属业务线
  /**
   * @example
   * 10010
   */
  businessLine: string;
  // 归属产品线
  /**
   * @example
   * 10010
   */
  productLine: string;
  // spu列表
  productSpu: ProductSpu[];
  // 短码
  /**
   * @example
   * CDXA
   */
  shortCode: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      name: 'name',
      businessLine: 'business_line',
      productLine: 'product_line',
      productSpu: 'product_spu',
      shortCode: 'short_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      name: 'string',
      businessLine: 'string',
      productLine: 'string',
      productSpu: { 'type': 'array', 'itemType': ProductSpu },
      shortCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 定价计划
export class PricePlanVO extends $tea.Model {
  // 定价计划ID
  id: number;
  // 商品CODE
  /**
   * @example
   * TAASFM00304790
   */
  commodityCode: string;
  // 定价对象CODE
  /**
   * @example
   * baasVer
   */
  priceObjectCode: string;
  // 定价计划名称
  /**
   * @example
   * test
   */
  name: string;
  // 定价计划类型
  /**
   * @example
   * personalized
   */
  type: string;
  // 租户ID
  /**
   * @example
   * 20888888
   */
  tenantId?: string;
  // 合同ID
  /**
   * @example
   * 233333
   */
  contractId?: string;
  // 政策ID
  /**
   * @example
   * 11111
   */
  policyId?: string;
  // 商务项目ID
  /**
   * @example
   * 111
   */
  businessProjectId?: string;
  // 执行条件
  /**
   * @example
   * 123
   */
  executeCondition?: string;
  // 优先级
  /**
   * @example
   * 1
   */
  priority: number;
  // 价格匹配不到处理策略：抛异常，继续询价
  /**
   * @example
   * test
   */
  noMatchRule?: string;
  // 计价模式：公式、阶梯、自定义
  /**
   * @example
   * ladder
   */
  pricingMode?: string;
  // 计价方法：具体公式、阶梯方法、自定义
  /**
   * @example
   * CUSTOM
   */
  pricingMethod?: string;
  // 阶梯区间类型，左开右闭/左闭右开
  /**
   * @example
   * LOC
   */
  ladderIntervalType?: string;
  // 父定价计划ID
  parentPricePlanId?: number;
  // 定价计划状态，编辑中、预发生效、线上生效、失效
  /**
   * @example
   * ONLINE
   */
  status: string;
  // 生效起始时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  startTime?: string;
  // 生效结束时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  endTime?: string;
  // 创建者
  /**
   * @example
   * 196301
   */
  creator?: string;
  // 修改者
  /**
   * @example
   * 196301
   */
  modifier?: string;
  // 创建时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  gmtCreate: string;
  // 修改时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  gmtModified: string;
  // 是否是基础价格
  /**
   * @example
   * Y
   */
  basis?: string;
  // 价格条件，多个以分号分隔
  /**
   * @example
   * 1,2,3
   */
  priceConditionCodes?: string;
  // 价格安全区间，格式 min,max如0,100
  /**
   * @example
   * 1,100
   */
  priceSafeArea: string;
  // 关联模板
  /**
   * @example
   * USAGE_AMOUNT_TEMPLATE
   */
  templateCode?: string;
  // 关联审批流程
  /**
   * @example
   * 111111
   */
  bpmsProcessId?: string;
  // 定价策略
  /**
   * @example
   * test
   */
  strategy?: string;
  // 定价阶段
  /**
   * @example
   * PRE
   */
  priceStage?: string;
  // 定价计划对应的约束，只有在明确需要查询定价约束时才会手动set进去
  priceConstraintVoList?: PriceConstraintVO[];
  // 价格限制策略
  priceLimitStrategyDto?: PriceLimitStrategyDTO[];
  // 销售渠道
  saleChannel?: string[];
  // 官网售卖折扣设置
  /**
   * @example
   * 8
   */
  officialSellDiscount?: string;
  // 客户法详情
  /**
   * @example
   * XXXX
   */
  customerValueInfo?: CustomerValueDetail;
  // 市场法详情
  /**
   * @example
   * XXXX
   */
  marketInfo?: MarketInfo;
  // 成本法详情
  /**
   * @example
   * XXX
   */
  costInfo?: CostInfo;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      commodityCode: 'commodity_code',
      priceObjectCode: 'price_object_code',
      name: 'name',
      type: 'type',
      tenantId: 'tenant_id',
      contractId: 'contract_id',
      policyId: 'policy_id',
      businessProjectId: 'business_project_id',
      executeCondition: 'execute_condition',
      priority: 'priority',
      noMatchRule: 'no_match_rule',
      pricingMode: 'pricing_mode',
      pricingMethod: 'pricing_method',
      ladderIntervalType: 'ladder_interval_type',
      parentPricePlanId: 'parent_price_plan_id',
      status: 'status',
      startTime: 'start_time',
      endTime: 'end_time',
      creator: 'creator',
      modifier: 'modifier',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      basis: 'basis',
      priceConditionCodes: 'price_condition_codes',
      priceSafeArea: 'price_safe_area',
      templateCode: 'template_code',
      bpmsProcessId: 'bpms_process_id',
      strategy: 'strategy',
      priceStage: 'price_stage',
      priceConstraintVoList: 'price_constraint_vo_list',
      priceLimitStrategyDto: 'price_limit_strategy_dto',
      saleChannel: 'sale_channel',
      officialSellDiscount: 'official_sell_discount',
      customerValueInfo: 'customer_value_info',
      marketInfo: 'market_info',
      costInfo: 'cost_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      commodityCode: 'string',
      priceObjectCode: 'string',
      name: 'string',
      type: 'string',
      tenantId: 'string',
      contractId: 'string',
      policyId: 'string',
      businessProjectId: 'string',
      executeCondition: 'string',
      priority: 'number',
      noMatchRule: 'string',
      pricingMode: 'string',
      pricingMethod: 'string',
      ladderIntervalType: 'string',
      parentPricePlanId: 'number',
      status: 'string',
      startTime: 'string',
      endTime: 'string',
      creator: 'string',
      modifier: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      basis: 'string',
      priceConditionCodes: 'string',
      priceSafeArea: 'string',
      templateCode: 'string',
      bpmsProcessId: 'string',
      strategy: 'string',
      priceStage: 'string',
      priceConstraintVoList: { 'type': 'array', 'itemType': PriceConstraintVO },
      priceLimitStrategyDto: { 'type': 'array', 'itemType': PriceLimitStrategyDTO },
      saleChannel: { 'type': 'array', 'itemType': 'string' },
      officialSellDiscount: 'string',
      customerValueInfo: CustomerValueDetail,
      marketInfo: MarketInfo,
      costInfo: CostInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// L2
export class ProductLine extends $tea.Model {
  // 溯源产品
  /**
   * @example
   * 10051
   */
  code: string;
  // 产品线名称
  /**
   * @example
   * 溯源产品
   */
  name: string;
  // 业务产品线code
  /**
   * @example
   * 10010
   */
  businessLineCode: string;
  // l3
  businessProduct: BusinessProduct[];
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      name: 'name',
      businessLineCode: 'business_line_code',
      businessProduct: 'business_product',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      name: 'string',
      businessLineCode: 'string',
      businessProduct: { 'type': 'array', 'itemType': BusinessProduct },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 收费项结果明细
export class PriceObjectFee extends $tea.Model {
  // 收费项CODE
  /**
   * @example
   * test
   */
  priceObjectCode?: string;
  // 收费项名称
  /**
   * @example
   * test
   */
  priceObjectName?: string;
  // 高精度价格12位
  /**
   * @example
   * test
   */
  price?: string;
  // 价格类型，标准价格，一客一价
  /**
   * @example
   * test
   */
  priceType?: string;
  // 结算信息
  /**
   * @example
   * test
   */
  settleType?: string;
  // 币种
  /**
   * @example
   * test
   */
  currency?: string;
  // 命中的定价计划
  /**
   * @example
   * test
   */
  pricePlanVo?: PricePlanVO;
  // 命中的定价计划约束
  /**
   * @example
   * test
   */
  priceConstraintVo?: PriceConstraintVO;
  // 扩展信息
  /**
   * @example
   * test
   */
  extendsMap?: string;
  // BD销售价格区间
  /**
   * @example
   * test
   */
  bdPrice?: string;
  // 最低成本价
  /**
   * @example
   * test
   */
  costPrice?: string;
  static names(): { [key: string]: string } {
    return {
      priceObjectCode: 'price_object_code',
      priceObjectName: 'price_object_name',
      price: 'price',
      priceType: 'price_type',
      settleType: 'settle_type',
      currency: 'currency',
      pricePlanVo: 'price_plan_vo',
      priceConstraintVo: 'price_constraint_vo',
      extendsMap: 'extends_map',
      bdPrice: 'bd_price',
      costPrice: 'cost_price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      priceObjectCode: 'string',
      priceObjectName: 'string',
      price: 'string',
      priceType: 'string',
      settleType: 'string',
      currency: 'string',
      pricePlanVo: PricePlanVO,
      priceConstraintVo: PriceConstraintVO,
      extendsMap: 'string',
      bdPrice: 'string',
      costPrice: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// PriceDetailDTO
export class PriceDetailDTO extends $tea.Model {
  // 定价约束id
  /**
   * @example
   * 1
   */
  constraintId: number;
  // 计费项code
  /**
   * @example
   * IN_NO_CACHE
   */
  chargeItem: string;
  // 定价阶梯
  /**
   * @example
   * L0
   */
  stageLevel: string;
  // 供应商
  /**
   * @example
   * aliyun
   */
  provider: string;
  // 刊例价
  /**
   * @example
   * 0.01
   */
  basePrice: string;
  // BD权限价
  /**
   * @example
   * 0.1
   */
  bdPrice: string;
  // 底价
  /**
   * @example
   * 0.1
   */
  costPrice: string;
  // 定价单位
  /**
   * @example
   * 元
   */
  priceUnit: string;
  // 币种
  /**
   * @example
   * 156
   */
  currencyValue: string;
  // 阶梯起始值
  /**
   * @example
   * 0
   */
  ladderStart: string;
  // 阶梯结束值
  /**
   * @example
   * 100
   */
  ladderEnd: string;
  // 定价id
  /**
   * @example
   * 12344
   */
  pricePlanId: number;
  // 定价计划名称
  /**
   * @example
   * 1234
   */
  pricePlanName: string;
  // 定价开始时间
  /**
   * @example
   * 2026-06-01
   */
  startTime: string;
  // 定价结束时间
  /**
   * @example
   * 2026-06-30
   */
  endTime: string;
  static names(): { [key: string]: string } {
    return {
      constraintId: 'constraint_id',
      chargeItem: 'charge_item',
      stageLevel: 'stage_level',
      provider: 'provider',
      basePrice: 'base_price',
      bdPrice: 'bd_price',
      costPrice: 'cost_price',
      priceUnit: 'price_unit',
      currencyValue: 'currency_value',
      ladderStart: 'ladder_start',
      ladderEnd: 'ladder_end',
      pricePlanId: 'price_plan_id',
      pricePlanName: 'price_plan_name',
      startTime: 'start_time',
      endTime: 'end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      constraintId: 'number',
      chargeItem: 'string',
      stageLevel: 'string',
      provider: 'string',
      basePrice: 'string',
      bdPrice: 'string',
      costPrice: 'string',
      priceUnit: 'string',
      currencyValue: 'string',
      ladderStart: 'string',
      ladderEnd: 'string',
      pricePlanId: 'number',
      pricePlanName: 'string',
      startTime: 'string',
      endTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Product基础信息，包含 code(产品码) ,name(产品名称),name_en(产品英文名)
export class ProductBaseInfo extends $tea.Model {
  // 产品码，系统内部识别
  /**
   * @example
   * IIFS
   */
  code: string;
  // 产品名称
  /**
   * @example
   * 票聚链-普惠金融服务
   */
  name: string;
  // 产品英文名称
  /**
   * @example
   * invoichain-finance
   */
  nameEn?: string;
  // 产品短码，管理维度识别
  /**
   * @example
   * IIFS
   */
  shortCode: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      name: 'name',
      nameEn: 'name_en',
      shortCode: 'short_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      name: 'string',
      nameEn: 'string',
      shortCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ModelPriceItemDTO
export class ModelPriceItemDTO extends $tea.Model {
  // 模型名称
  /**
   * @example
   * qwen3.5-plus
   */
  model: string;
  // 定价详情
  /**
   * @example
   * undefined
   */
  prices: PriceDetailDTO[];
  static names(): { [key: string]: string } {
    return {
      model: 'model',
      prices: 'prices',
    };
  }

  static types(): { [key: string]: any } {
    return {
      model: 'string',
      prices: { 'type': 'array', 'itemType': PriceDetailDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// L1
export class BusinessLine extends $tea.Model {
  // 产品线code
  /**
   * @example
   * 10031
   */
  code: string;
  // 1级产品线name
  /**
   * @example
   * 可信产业
   */
  name: string;
  // L2
  productLine: ProductLine[];
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      name: 'name',
      productLine: 'product_line',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      name: 'string',
      productLine: { 'type': 'array', 'itemType': ProductLine },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 客户价值法信息
export class CustomerValueInfo extends $tea.Model {
  // 客户价价值法信息
  /**
   * @example
   * test
   */
  customerValueDetails?: CustomerValueDetail[];
  static names(): { [key: string]: string } {
    return {
      customerValueDetails: 'customer_value_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      customerValueDetails: { 'type': 'array', 'itemType': CustomerValueDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 返回高精度12位价格,其他精度可使用工具类处理
export class InquiryPriceResponse extends $tea.Model {
  // 高精度12位价格
  /**
   * @example
   * test
   */
  price?: string;
  // 币种
  /**
   * @example
   * test
   */
  currency?: string;
  // BD销售价格(高精度12位)
  /**
   * @example
   * test
   */
  bdPrice?: string;
  // 最低成本价(高精度12位)
  /**
   * @example
   * test
   */
  costPrice?: string;
  // 收费项结果明细列表
  /**
   * @example
   * test
   */
  priceObjectFeeList?: PriceObjectFee[];
  static names(): { [key: string]: string } {
    return {
      price: 'price',
      currency: 'currency',
      bdPrice: 'bd_price',
      costPrice: 'cost_price',
      priceObjectFeeList: 'price_object_fee_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      price: 'string',
      currency: 'string',
      bdPrice: 'string',
      costPrice: 'string',
      priceObjectFeeList: { 'type': 'array', 'itemType': PriceObjectFee },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品结构
export class Commodity extends $tea.Model {
  // 商品编码
  /**
   * @example
   * KKAASP00000001
   */
  code: string;
  // 商品名称
  /**
   * @example
   * 测试商品
   */
  name: string;
  // 商品状态
  /**
   * @example
   * ONLINE
   */
  status: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      name: 'name',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      name: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDemoTestJltestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据
  data: string;
  // 数据bbb
  datax: string;
  // 数据bbb
  datay: string;
  // 数据ddd
  dataa: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      data: 'data',
      datax: 'datax',
      datay: 'datay',
      dataa: 'dataa',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      data: 'string',
      datax: 'string',
      datay: 'string',
      dataa: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDemoTestJltestResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 名字
  namex?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      namex: 'namex',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      namex: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDemoBusinessOrderxRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderId: string;
  // 分页大小
  pageSize?: number;
  // 订单结构体
  orderInfo: OrderInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      pageSize: 'page_size',
      orderInfo: 'order_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      pageSize: 'number',
      orderInfo: OrderInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDemoBusinessOrderxResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单列表
  orderList?: OrderDTO[];
  // 总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderList: 'order_list',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderList: { 'type': 'array', 'itemType': OrderDTO },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDemoBusinessOrderzRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderId: string;
  // 分页大小
  pageSize?: number;
  // 订单结构体
  orderInfo: OrderInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      pageSize: 'page_size',
      orderInfo: 'order_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      pageSize: 'number',
      orderInfo: OrderInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDemoBusinessOrderzResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单列表
  orderList?: OrderDTO[];
  // 总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderList: 'order_list',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderList: { 'type': 'array', 'itemType': OrderDTO },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDemoBusinessOrderyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderId: string;
  // 分页大小
  pageSize?: number;
  // 订单结构体
  orderInfo: OrderInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      pageSize: 'page_size',
      orderInfo: 'order_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      pageSize: 'number',
      orderInfo: OrderInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDemoBusinessOrderyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单列表
  orderList?: OrderDTO[];
  // 总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderList: 'order_list',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderList: { 'type': 'array', 'itemType': OrderDTO },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDemoBusinessOrdernRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
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

export class CreateDemoBusinessOrdernResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDemoBusinessOrderaaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单编号
  orderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDemoBusinessOrderaaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商品明细
  itemList?: OrderItem[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      itemList: 'item_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      itemList: { 'type': 'array', 'itemType': OrderItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDemoBusinessOrderqRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单编号
  orderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDemoBusinessOrderqResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商品明细
  itemList?: OrderItem[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      itemList: 'item_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      itemList: { 'type': 'array', 'itemType': OrderItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDemoBusinessOrderbRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单编号
  orderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDemoBusinessOrderbResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商品明细
  itemList?: OrderItem[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      itemList: 'item_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      itemList: { 'type': 'array', 'itemType': OrderItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class TestDemoTestApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // bbb
  id?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class TestDemoTestApiResponse extends $tea.Model {
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

export class CreateDemoBusinessOrdercRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单编号
  orderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDemoBusinessOrdercResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商品明细
  itemList?: OrderItem[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      itemList: 'item_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      itemList: { 'type': 'array', 'itemType': OrderItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDemoBusinessOrderdRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单编号
  orderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDemoBusinessOrderdResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商品明细
  itemList?: OrderItem[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      itemList: 'item_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      itemList: { 'type': 'array', 'itemType': OrderItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudAcmUserProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 用户ID
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudAcmUserProjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 项目
  projectList?: Project[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      projectList: 'project_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      projectList: { 'type': 'array', 'itemType': Project },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckAntcloudBillingConfigPreRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 配置字符串
  newFeeConfig: FeeConfEntityVO;
  // 请求单号
  bizNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      newFeeConfig: 'new_fee_config',
      bizNo: 'biz_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      newFeeConfig: FeeConfEntityVO,
      bizNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckAntcloudBillingConfigPreResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 对比对象
  result?: FeeConfChangeVO;
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
      result: FeeConfChangeVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendAntcloudMarketingPartnerCouponRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 优惠券模版id
  templateId: string;
  // 支付宝登录名称
  alipayLoginName: string;
  // 业务唯一幂等标识，可以是订单号
  bizNo: string;
  // 备注
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      templateId: 'template_id',
      alipayLoginName: 'alipay_login_name',
      bizNo: 'biz_no',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      templateId: 'string',
      alipayLoginName: 'string',
      bizNo: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendAntcloudMarketingPartnerCouponResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 优惠券id
  couponId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      couponId: 'coupon_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      couponId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudMarketingPartnerCouponstockRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 券模版id
  templateId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      templateId: 'template_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      templateId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudMarketingPartnerCouponstockResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 模版总量
  totalQuota?: number;
  // 已使用
  releasedQuota?: number;
  // 可用
  availableQuota?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalQuota: 'total_quota',
      releasedQuota: 'released_quota',
      availableQuota: 'available_quota',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalQuota: 'number',
      releasedQuota: 'number',
      availableQuota: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudTradeComboOptionsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 套餐版本唯一版本号，有值则优先使用
  vid: string;
  // 销售主体（如ZL6、ZL7）
  ou?: string;
  // 购买租户id
  tenantId: string;
  // 售卖市场
  marketType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      vid: 'vid',
      ou: 'ou',
      tenantId: 'tenant_id',
      marketType: 'market_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      vid: 'string',
      ou: 'string',
      tenantId: 'string',
      marketType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudTradeComboOptionsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 套餐基本信息
  comboDto?: ComboDTO;
  // 套餐内商品信息列表（仅包含当前 OU 下上架的商品）
  comboItemDtos?: ComboItemDTO[];
  // 售卖规则校验是否通过
  ruleCheckSuccess?: boolean;
  // 售卖规则校验失败时的错误码
  ruleCheckErrorCode?: string;
  // 该商品当前不可购买：未完成实名认证
  ruleCheckErrorMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      comboDto: 'combo_dto',
      comboItemDtos: 'combo_item_dtos',
      ruleCheckSuccess: 'rule_check_success',
      ruleCheckErrorCode: 'rule_check_error_code',
      ruleCheckErrorMessage: 'rule_check_error_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      comboDto: ComboDTO,
      comboItemDtos: { 'type': 'array', 'itemType': ComboItemDTO },
      ruleCheckSuccess: 'boolean',
      ruleCheckErrorCode: 'string',
      ruleCheckErrorMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreatewithoptionsAntcloudTradeComboRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 套餐版本唯一版本号
  comboVid: string;
  // 销售主体（如 ZL6、ZL7）
  ou: string;
  // 购买租户ID
  tenantId: string;
  // 用户选择的规格配置列表
  selectedConfigs: SelectedConfigItem[];
  // 请求ID，用于幂等
  requestId: string;
  // 售卖市场，由中台分配
  saleMarket: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      comboVid: 'combo_vid',
      ou: 'ou',
      tenantId: 'tenant_id',
      selectedConfigs: 'selected_configs',
      requestId: 'request_id',
      saleMarket: 'sale_market',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      comboVid: 'string',
      ou: 'string',
      tenantId: 'string',
      selectedConfigs: { 'type': 'array', 'itemType': SelectedConfigItem },
      requestId: 'string',
      saleMarket: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreatewithoptionsAntcloudTradeComboResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 套餐订单ID
  comboOrderId?: string;
  // 订单状态，创建成功为 WAIT_CONFIRM（待确认）
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      comboOrderId: 'combo_order_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      comboOrderId: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelAntcloudTradeComboRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 套餐订单ID
  comboOrderId: string;
  // 租户ID，用于校验订单归属和操作权限
  tenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      comboOrderId: 'combo_order_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      comboOrderId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelAntcloudTradeComboResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 取消操作结果。true 表示取消成功
  result?: boolean;
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
      result: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntcloudTradeComboOptionsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 套餐版本唯一版本号
  comboVid: string;
  // 销售主体（如 ZL6、ZL7）
  ou: string;
  // 购买租户ID
  tenantId: string;
  // 用户选择的规格配置列表
  selectedConfigs: SelectedConfigItem[];
  // 请求ID，用于幂等
  requestId: string;
  // 售卖市场，由中台分配
  saleMarket: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      comboVid: 'combo_vid',
      ou: 'ou',
      tenantId: 'tenant_id',
      selectedConfigs: 'selected_configs',
      requestId: 'request_id',
      saleMarket: 'sale_market',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      comboVid: 'string',
      ou: 'string',
      tenantId: 'string',
      selectedConfigs: { 'type': 'array', 'itemType': SelectedConfigItem },
      requestId: 'string',
      saleMarket: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntcloudTradeComboOptionsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 套餐订单ID
  comboOrderId?: string;
  // 订单状态，创建成功为 WAIT_CONFIRM（待确认）
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      comboOrderId: 'combo_order_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      comboOrderId: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudPccCommodityPriceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 模型名称，精确匹配
  model?: string;
  // 供应商
  provider?: string;
  // 收费项（定价对象）
  chargeItem?: string;
  // 定价状态
  status?: string;
  // 页码
  pageNum: number;
  // 每页数据量
  pageSize: number;
  // 商品code
  commodityCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      model: 'model',
      provider: 'provider',
      chargeItem: 'charge_item',
      status: 'status',
      pageNum: 'page_num',
      pageSize: 'page_size',
      commodityCode: 'commodity_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      model: 'string',
      provider: 'string',
      chargeItem: 'string',
      status: 'string',
      pageNum: 'number',
      pageSize: 'number',
      commodityCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntcloudPccCommodityPriceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总数
  total?: number;
  // 页码
  pageNum?: number;
  // 页大小
  pageSize?: number;
  // 模型定价
  items?: ModelPriceItemDTO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      total: 'total',
      pageNum: 'page_num',
      pageSize: 'page_size',
      items: 'items',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      total: 'number',
      pageNum: 'number',
      pageSize: 'number',
      items: { 'type': 'array', 'itemType': ModelPriceItemDTO },
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
          sdk_version: "1.0.9",
          _prod_code: "DD",
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
   * @remarks
   * Description: 测试使用
   * Summary: 测试使用
   */
  async queryDemoTestJltest(request: QueryDemoTestJltestRequest): Promise<QueryDemoTestJltestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDemoTestJltestEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试使用
   * Summary: 测试使用
   */
  async queryDemoTestJltestEx(request: QueryDemoTestJltestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDemoTestJltestResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDemoTestJltestResponse>(await this.doRequest("1.0", "demo.test.jltest.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDemoTestJltestResponse({}));
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createDemoBusinessOrderx(request: CreateDemoBusinessOrderxRequest): Promise<CreateDemoBusinessOrderxResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDemoBusinessOrderxEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createDemoBusinessOrderxEx(request: CreateDemoBusinessOrderxRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDemoBusinessOrderxResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDemoBusinessOrderxResponse>(await this.doRequest("1.0", "demo.business.orderx.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDemoBusinessOrderxResponse({}));
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createDemoBusinessOrderz(request: CreateDemoBusinessOrderzRequest): Promise<CreateDemoBusinessOrderzResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDemoBusinessOrderzEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createDemoBusinessOrderzEx(request: CreateDemoBusinessOrderzRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDemoBusinessOrderzResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDemoBusinessOrderzResponse>(await this.doRequest("1.0", "demo.business.orderz.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDemoBusinessOrderzResponse({}));
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createDemoBusinessOrdery(request: CreateDemoBusinessOrderyRequest): Promise<CreateDemoBusinessOrderyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDemoBusinessOrderyEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createDemoBusinessOrderyEx(request: CreateDemoBusinessOrderyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDemoBusinessOrderyResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDemoBusinessOrderyResponse>(await this.doRequest("1.0", "demo.business.ordery.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDemoBusinessOrderyResponse({}));
  }

  /**
   * @remarks
   * Description: 创建订单N
   * Summary: 创建订单N
   */
  async createDemoBusinessOrdern(request: CreateDemoBusinessOrdernRequest): Promise<CreateDemoBusinessOrdernResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDemoBusinessOrdernEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建订单N
   * Summary: 创建订单N
   */
  async createDemoBusinessOrdernEx(request: CreateDemoBusinessOrdernRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDemoBusinessOrdernResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDemoBusinessOrdernResponse>(await this.doRequest("1.0", "demo.business.ordern.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDemoBusinessOrdernResponse({}));
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createDemoBusinessOrderaa(request: CreateDemoBusinessOrderaaRequest): Promise<CreateDemoBusinessOrderaaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDemoBusinessOrderaaEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createDemoBusinessOrderaaEx(request: CreateDemoBusinessOrderaaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDemoBusinessOrderaaResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDemoBusinessOrderaaResponse>(await this.doRequest("1.0", "demo.business.orderaa.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDemoBusinessOrderaaResponse({}));
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createDemoBusinessOrderq(request: CreateDemoBusinessOrderqRequest): Promise<CreateDemoBusinessOrderqResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDemoBusinessOrderqEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createDemoBusinessOrderqEx(request: CreateDemoBusinessOrderqRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDemoBusinessOrderqResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDemoBusinessOrderqResponse>(await this.doRequest("1.0", "demo.business.orderq.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDemoBusinessOrderqResponse({}));
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createDemoBusinessOrderb(request: CreateDemoBusinessOrderbRequest): Promise<CreateDemoBusinessOrderbResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDemoBusinessOrderbEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createDemoBusinessOrderbEx(request: CreateDemoBusinessOrderbRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDemoBusinessOrderbResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDemoBusinessOrderbResponse>(await this.doRequest("1.0", "demo.business.orderb.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDemoBusinessOrderbResponse({}));
  }

  /**
   * @remarks
   * Description: 测试接口
   * Summary: 测试接口
   */
  async testDemoTestApi(request: TestDemoTestApiRequest): Promise<TestDemoTestApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.testDemoTestApiEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试接口
   * Summary: 测试接口
   */
  async testDemoTestApiEx(request: TestDemoTestApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<TestDemoTestApiResponse> {
    Util.validateModel(request);
    return $tea.cast<TestDemoTestApiResponse>(await this.doRequest("1.0", "demo.test.api.test", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new TestDemoTestApiResponse({}));
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createDemoBusinessOrderc(request: CreateDemoBusinessOrdercRequest): Promise<CreateDemoBusinessOrdercResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDemoBusinessOrdercEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createDemoBusinessOrdercEx(request: CreateDemoBusinessOrdercRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDemoBusinessOrdercResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDemoBusinessOrdercResponse>(await this.doRequest("1.0", "demo.business.orderc.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDemoBusinessOrdercResponse({}));
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createDemoBusinessOrderd(request: CreateDemoBusinessOrderdRequest): Promise<CreateDemoBusinessOrderdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDemoBusinessOrderdEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createDemoBusinessOrderdEx(request: CreateDemoBusinessOrderdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDemoBusinessOrderdResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDemoBusinessOrderdResponse>(await this.doRequest("1.0", "demo.business.orderd.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDemoBusinessOrderdResponse({}));
  }

  /**
   * @remarks
   * Description: 查询用户所属项目列表
   * Summary: 查询用户所属项目列表
   */
  async queryAntcloudAcmUserProject(request: QueryAntcloudAcmUserProjectRequest): Promise<QueryAntcloudAcmUserProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntcloudAcmUserProjectEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询用户所属项目列表
   * Summary: 查询用户所属项目列表
   */
  async queryAntcloudAcmUserProjectEx(request: QueryAntcloudAcmUserProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntcloudAcmUserProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntcloudAcmUserProjectResponse>(await this.doRequest("1.0", "antcloud.acm.user.project.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntcloudAcmUserProjectResponse({}));
  }

  /**
   * @remarks
   * Description: 线上对比线下计量计费资源包配置接口
   * Summary: 线上对比线下计量计费资源包配置接口
   */
  async checkAntcloudBillingConfigPre(request: CheckAntcloudBillingConfigPreRequest): Promise<CheckAntcloudBillingConfigPreResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkAntcloudBillingConfigPreEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 线上对比线下计量计费资源包配置接口
   * Summary: 线上对比线下计量计费资源包配置接口
   */
  async checkAntcloudBillingConfigPreEx(request: CheckAntcloudBillingConfigPreRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckAntcloudBillingConfigPreResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckAntcloudBillingConfigPreResponse>(await this.doRequest("1.0", "antcloud.billing.config.pre.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckAntcloudBillingConfigPreResponse({}));
  }

  /**
   * @remarks
   * Description: 外部发券
   * Summary: 外部发券
   */
  async sendAntcloudMarketingPartnerCoupon(request: SendAntcloudMarketingPartnerCouponRequest): Promise<SendAntcloudMarketingPartnerCouponResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendAntcloudMarketingPartnerCouponEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 外部发券
   * Summary: 外部发券
   */
  async sendAntcloudMarketingPartnerCouponEx(request: SendAntcloudMarketingPartnerCouponRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendAntcloudMarketingPartnerCouponResponse> {
    Util.validateModel(request);
    return $tea.cast<SendAntcloudMarketingPartnerCouponResponse>(await this.doRequest("1.0", "antcloud.marketing.partner.coupon.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendAntcloudMarketingPartnerCouponResponse({}));
  }

  /**
   * @remarks
   * Description: 外部客户查询券余量
   * Summary: 外部客户查询券余量
   */
  async queryAntcloudMarketingPartnerCouponstock(request: QueryAntcloudMarketingPartnerCouponstockRequest): Promise<QueryAntcloudMarketingPartnerCouponstockResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntcloudMarketingPartnerCouponstockEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 外部客户查询券余量
   * Summary: 外部客户查询券余量
   */
  async queryAntcloudMarketingPartnerCouponstockEx(request: QueryAntcloudMarketingPartnerCouponstockRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntcloudMarketingPartnerCouponstockResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntcloudMarketingPartnerCouponstockResponse>(await this.doRequest("1.0", "antcloud.marketing.partner.couponstock.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntcloudMarketingPartnerCouponstockResponse({}));
  }

  /**
   * @remarks
   * Description: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果
   * Summary: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果
   */
  async queryAntcloudTradeComboOptions(request: QueryAntcloudTradeComboOptionsRequest): Promise<QueryAntcloudTradeComboOptionsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntcloudTradeComboOptionsEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果
   * Summary: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果
   */
  async queryAntcloudTradeComboOptionsEx(request: QueryAntcloudTradeComboOptionsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntcloudTradeComboOptionsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntcloudTradeComboOptionsResponse>(await this.doRequest("1.0", "antcloud.trade.combo.options.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntcloudTradeComboOptionsResponse({}));
  }

  /**
   * @remarks
   * Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
   * Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单
   */
  async createwithoptionsAntcloudTradeCombo(request: CreatewithoptionsAntcloudTradeComboRequest): Promise<CreatewithoptionsAntcloudTradeComboResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createwithoptionsAntcloudTradeComboEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
   * Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单
   */
  async createwithoptionsAntcloudTradeComboEx(request: CreatewithoptionsAntcloudTradeComboRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreatewithoptionsAntcloudTradeComboResponse> {
    Util.validateModel(request);
    return $tea.cast<CreatewithoptionsAntcloudTradeComboResponse>(await this.doRequest("1.0", "antcloud.trade.combo.createwithoptions", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreatewithoptionsAntcloudTradeComboResponse({}));
  }

  /**
   * @remarks
   * Description: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消
   * Summary: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消
   */
  async cancelAntcloudTradeCombo(request: CancelAntcloudTradeComboRequest): Promise<CancelAntcloudTradeComboResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelAntcloudTradeComboEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消
   * Summary: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消
   */
  async cancelAntcloudTradeComboEx(request: CancelAntcloudTradeComboRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelAntcloudTradeComboResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelAntcloudTradeComboResponse>(await this.doRequest("1.0", "antcloud.trade.combo.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelAntcloudTradeComboResponse({}));
  }

  /**
   * @remarks
   * Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
   * Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单
   */
  async createAntcloudTradeComboOptions(request: CreateAntcloudTradeComboOptionsRequest): Promise<CreateAntcloudTradeComboOptionsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAntcloudTradeComboOptionsEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
   * Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单
   */
  async createAntcloudTradeComboOptionsEx(request: CreateAntcloudTradeComboOptionsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAntcloudTradeComboOptionsResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAntcloudTradeComboOptionsResponse>(await this.doRequest("1.0", "antcloud.trade.combo.options.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAntcloudTradeComboOptionsResponse({}));
  }

  /**
   * @remarks
   * Description: 商品定价查询
   * Summary: 商品定价查询
   */
  async queryAntcloudPccCommodityPrice(request: QueryAntcloudPccCommodityPriceRequest): Promise<QueryAntcloudPccCommodityPriceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntcloudPccCommodityPriceEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 商品定价查询
   * Summary: 商品定价查询
   */
  async queryAntcloudPccCommodityPriceEx(request: QueryAntcloudPccCommodityPriceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntcloudPccCommodityPriceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntcloudPccCommodityPriceResponse>(await this.doRequest("1.0", "antcloud.pcc.commodity.price.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntcloudPccCommodityPriceResponse({}));
  }

}
