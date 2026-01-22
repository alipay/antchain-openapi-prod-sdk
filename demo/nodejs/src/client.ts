// This file is auto-generated, don't edit it
import AntchainUtil from '@antchain/alipay-util';
import Util, * as $Util from '@alicloud/tea-util';
import RPCUtil from '@alicloud/rpc-util';
import { Readable } from 'stream';
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

// host
export class Host extends $tea.Model {
  // test_2e1ae924805f
  systemName: string;
  // 地址
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

// 身份
export class Identity extends $tea.Model {
  // ak
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
  areaCode: string;
  // area_name
  areaName: string;
  // bdcdyh
  bdcdyh: string;
  // bdcqzh
  bdcqzh: string;
  // djsj
  djsj: string;
  // fwyt1
  fwyt1: string;
  // gyqk
  gyqk: string;
  // qllx
  qllx: string;
  // qlrmc
  qlrmc: string;
  // scjzmj
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
  identity: Identity;
  // 调用链编号
  traceId: string;
  // host信息
  host: Host;
  // 方向
  direction: string;
  // 请求类型
  requestType: string;
  // 协议版本
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

// Demo类1
export class DemoClass extends $tea.Model {
  // 字符串测试
  someString: string;
  // 日期测试
  someDate: string;
  // Boolean测试
  someBoolean: boolean;
  // 整数测试
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

// SCRealEstateQueryRequestPayload
export class SCRealEstateQueryRequestPayload extends $tea.Model {
  // xm
  xm: string;
  // sfz
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

// 编码
export class Cmd extends $tea.Model {
  // cmd编码
  cmdCode: string;
  // 版本号
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

// SCRealEstateQueryResponsePayload
export class SCRealEstateQueryResponsePayload extends $tea.Model {
  // code
  code: string;
  // data
  data: SCRealEstateQueryResponseData[];
  // uuid
  uuid: string;
  // ret_msg
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
  key: string;
  // 值
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
  content?: string;
  // 213
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
  header: Header;
  // body
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

// 风险评估因子明细
export class RiskFactorDetail extends $tea.Model {
  // 风险评估因子类型
  factorType?: string;
  // 分数
  score?: number;
  // 风险事件
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
  param1?: string;
  // number
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
  time: string;
  // 操作人
  operator: string;
  // 请求编号
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
  amount?: number;
  // 币种
  currency?: string;
  // 渠道
  channel?: string;
  // 地址
  location?: string;
  // 时间
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

// 数字类型
export class NumberTest extends $tea.Model {
  // 1
  parameter1: number;
  // 2
  parameter2: number;
  // 3
  parameter3: number;
  // 4
  parameter4: number;
  // 5
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

// testAAAA
export class TestClass extends $tea.Model {
  // 1
  test: string;
  // 2
  demo: string;
  // 3
  demo1: string;
  // 22
  demo2: string;
  static names(): { [key: string]: string } {
    return {
      test: 'test',
      demo: 'demo',
      demo1: 'demo1',
      demo2: 'demo2',
    };
  }

  static types(): { [key: string]: any } {
    return {
      test: 'string',
      demo: 'string',
      demo1: 'string',
      demo2: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// TestStruct
export class TestStruct extends $tea.Model {
  // x
  x: string;
  // y
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

// 测试
export class TestObject extends $tea.Model {
  // 主键
  id: number;
  // 名称
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

// 另一个Demo类
export class AnotherClass extends $tea.Model {
  // 测试字段
  bar: string;
  // 引用字段
  ref: DemoClass;
  // 列表引用Struct
  refList?: DemoClass[];
  static names(): { [key: string]: string } {
    return {
      bar: 'bar',
      ref: 'ref',
      refList: 'refList',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bar: 'string',
      ref: DemoClass,
      refList: { 'type': 'array', 'itemType': DemoClass },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 自动生成单测代码model
export class AutoCodeModel extends $tea.Model {
  // 111
  modelStringParam: string;
  // 111
  modelDateParam: string;
  // 111
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
  cmd: Cmd;
  // 路由信息
  routeCondition: RouteCondition;
  // requestId
  requestId: string;
  // payload
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

// 嵌套结构
export class NestModel extends $tea.Model {
  // aaaa
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

// 测试
export class TestAPIObject extends $tea.Model {
  // test
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
  cost: number;
  // response_status
  responseStatus: string;
  // response_code
  responseCode: string;
  // request_id
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
  userId?: string;
  // 用户身份证号
  idNumber?: string;
  // 手机号
  mobile?: string;
  // 年龄
  age?: number;
  // 信用评分
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

// Map<String,Object> 集合
export class QueryMap extends $tea.Model {
  // 键值
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
  parameter1: string;
  // 2
  parameter2: string;
  // 3
  parameter3: string;
  // 4
  parameter4: string;
  // 5
  parameter5: string;
  // 6
  parameter6: string;
  // 7
  parameter7: string;
  // 8
  parameter8: string;
  // 9
  parameter9: string;
  // 10
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

// 自动化测试创建（勿删）
export class TestsT extends $tea.Model {
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

// groupA分组结构体
export class GroupAClass extends $tea.Model {
  // -
  productInstanceId?: string;
  // 防伪码类型
  codeType: string;
  // 防伪码码值
  code: string;
  static names(): { [key: string]: string } {
    return {
      productInstanceId: 'product_instance_id',
      codeType: 'code_type',
      code: 'code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      productInstanceId: 'string',
      codeType: 'string',
      code: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 自动化测试创建（用于测试编辑功能，勿删）
export class AbcdEfgh extends $tea.Model {
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

// 用于测试预发ob的同步_已编辑
export class PreTestUse extends $tea.Model {
  // 1
  param1: string;
  // 11
  param2: number;
  // boolean
  param3: boolean;
  static names(): { [key: string]: string } {
    return {
      param1: 'param_1',
      param2: 'param_2',
      param3: 'param_3',
    };
  }

  static types(): { [key: string]: any } {
    return {
      param1: 'string',
      param2: 'number',
      param3: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 键值对
export class XNameValuePair extends $tea.Model {
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

export class StabilizeTestTestRequest extends $tea.Model {
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

export class StabilizeTestTestResponse extends $tea.Model {
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

export class AsdasAsdaAsdaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 11
  aa?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      aa: 'aa',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      aa: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AsdasAsdaAsdaResponse extends $tea.Model {
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

export class StatusGatewayCheckRequest extends $tea.Model {
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

export class StatusGatewayCheckResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // OK
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

export class EchoGatewayCheckRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // input_array
  inputArray: TestStruct[];
  // file_id
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  // 1
  inputInt: number;
  // 测试一下
  fileName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      inputArray: 'input_array',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      inputInt: 'input_int',
      fileName: 'file_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      inputArray: { 'type': 'array', 'itemType': TestStruct },
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      inputInt: 'number',
      fileName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class EchoGatewayCheckResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // output_demo测试
  outputDemo?: DemoClass;
  // output_string
  outputString?: string;
  // file_url
  fileUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      outputDemo: 'output_demo',
      outputString: 'output_string',
      fileUrl: 'file_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      outputDemo: DemoClass,
      outputString: 'string',
      fileUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGatewayMyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 字符串类型入参
  test1: string;
  // 数字入参
  test2: number;
  // 布尔值入参
  test3: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      test1: 'test_1',
      test2: 'test_2',
      test3: 'test_3',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      test1: 'string',
      test2: 'number',
      test3: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGatewayMyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // SUCCESS le
  success?: string;
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
      success: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGatewayCheckEchotimeoutRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 10
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

export class QueryGatewayCheckEchotimeoutResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 222
  stauts?: string;
  // ok
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

export class QueryGatewayCheckEchotenRequest extends $tea.Model {
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

export class QueryGatewayCheckEchotenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 222
  status?: string;
  // ok
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

export class QueryAdAsdAsdRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 1111
  bnumber: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bnumber: 'bnumber',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bnumber: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAdAsdAsdResponse extends $tea.Model {
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

export class InitGatewayRoadRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求编号
  count: number;
  // 请求时间
  time: string;
  // 请求描述
  desc?: string;
  // 操作人
  operator: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      count: 'count',
      time: 'time',
      desc: 'desc',
      operator: 'operator',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      count: 'number',
      time: 'string',
      desc: 'string',
      operator: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitGatewayRoadResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回desc
  initDesc?: string;
  // 组合返回请求结果
  initPack?: InitPack;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      initDesc: 'init_desc',
      initPack: 'init_pack',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      initDesc: 'string',
      initPack: InitPack,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGatewayEmbedRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实例参数
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

export class QueryGatewayEmbedResponse extends $tea.Model {
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

export class UpdateGatewayRoadRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求时间
  time: string;
  // 操作人
  operator: string;
  // 请求编号
  count: number;
  // 原信息
  originInfo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      time: 'time',
      operator: 'operator',
      count: 'count',
      originInfo: 'origin_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      time: 'string',
      operator: 'string',
      count: 'number',
      originInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateGatewayRoadResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 更新后返回info
  updInfo?: string;
  // 组合返回请求结果
  updPack?: InitPack;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      updInfo: 'upd_info',
      updPack: 'upd_pack',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      updInfo: 'string',
      updPack: InitPack,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGatewayRoadRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询输入
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

export class QueryGatewayRoadResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询返回
  queryResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      queryResult: 'query_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      queryResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecGatewayRoadRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 计算值输入
  execNum: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      execNum: 'exec_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      execNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecGatewayRoadResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 计算值返回
  execNumEcho?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      execNumEcho: 'exec_num_echo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      execNumEcho: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLoadtestTimeThreeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // ms
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

export class QueryLoadtestTimeThreeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 200
  stauts?: string;
  // ok
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

export class QueryInstanceidRuleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数字
  count: string;
  // 姓名
  oprator: string;
  // 结构体
  struct: TestA;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      count: 'count',
      oprator: 'oprator',
      struct: 'struct',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      count: 'string',
      oprator: 'string',
      struct: TestA,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInstanceidRuleResponse extends $tea.Model {
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

export class QueryGatewayCheckEchotimeoutokRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 耗时时间
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

export class QueryGatewayCheckEchotimeoutokResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回OK
  stauts?: string;
  // 结果描述
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

export class MatchBusinessAndInstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // L5
  businessCode: string;
  // 实例
  instanceCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      businessCode: 'business_code',
      instanceCode: 'instance_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      businessCode: 'string',
      instanceCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class MatchBusinessAndInstanceResponse extends $tea.Model {
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

export class QueryStreamTestRequest extends $tea.Model {
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

export class QueryStreamTestResponse extends $tea.Model {
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

export class QueryTestCatcheLimitRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // abc
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

export class QueryTestCatcheLimitResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回OK
  stauts?: string;
  // 结果描述
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

export class QueryTestForLimitRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 2
  execNum: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      execNum: 'exec_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      execNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTestForLimitResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 1
  execNumEcho?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      execNumEcho: 'exec_num_echo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      execNumEcho: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTestTestTestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时时间
  timeout: string;
  // aaa
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      timeout: 'timeout',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      timeout: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTestTestTestResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 1
  stauts?: string;
  // 1
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

export class QueryABCRequest extends $tea.Model {
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

export class QueryABCResponse extends $tea.Model {
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

export class QueryTestEmbedUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // test
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTestEmbedUserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // name
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

export class QueryAasSaSaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // aa
  notBlankVerify: string;
  // 12344
  idcard?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      notBlankVerify: 'not_blank_verify',
      idcard: 'idcard',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      notBlankVerify: 'string',
      idcard: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAasSaSaResponse extends $tea.Model {
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

export class QueryApiWhiteListRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询输入
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

export class QueryApiWhiteListResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询返回
  queryResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      queryResult: 'query_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      queryResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApiBlackListRequest extends $tea.Model {
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

export class QueryApiBlackListResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 200
  status?: string;
  // OK
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

export class QueryIpWhiteListRequest extends $tea.Model {
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

export class QueryIpWhiteListResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // ok
  status?: string;
  // SUCCESS
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

export class QueryIpBlackListRequest extends $tea.Model {
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

export class QueryIpBlackListResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // OK
  status?: string;
  // SUCCESS
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

export class QueryIpRetryRequest extends $tea.Model {
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

export class QueryIpRetryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // OK
  status?: string;
  // SUCCESS
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

export class QueryTestTimeTestaRequest extends $tea.Model {
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

export class QueryTestTimeTestaResponse extends $tea.Model {
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

export class QueryOasRestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id信息
  identityId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      identityId: 'identity_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      identityId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOasRestResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 描述信息
  info?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      info: 'info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      info: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTestContentTypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询输入
  data?: string;
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

export class QueryTestContentTypeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码
  statucode?: string;
  // 查询返回结果
  queryResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      statucode: 'statucode',
      queryResult: 'query_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      statucode: 'string',
      queryResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTestContentTypeoneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询输入
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

export class QueryTestContentTypeoneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询结果
  queryResult?: string;
  // 结果码
  statucode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      queryResult: 'query_result',
      statucode: 'statucode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      queryResult: 'string',
      statucode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTestContentTypetwoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询输入
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

export class QueryTestContentTypetwoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询返回结果
  data?: string;
  // 状态码
  statucode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      statucode: 'statucode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      statucode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTestContentTypethreeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询输入
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

export class QueryTestContentTypethreeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询返回结果
  queryResult?: string;
  // 结果码
  statucode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      queryResult: 'query_result',
      statucode: 'statucode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      queryResult: 'string',
      statucode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTestContentTypefourRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询输入
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

export class QueryTestContentTypefourResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询返回结果
  queryResult?: string;
  // 结果码
  statucode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      queryResult: 'query_result',
      statucode: 'statucode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      queryResult: 'string',
      statucode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTestContentTypefiveRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询入参
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

export class QueryTestContentTypefiveResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果码
  statucode?: string;
  // 查询结果
  queryResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      statucode: 'statucode',
      queryResult: 'query_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      statucode: 'string',
      queryResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAgentFinancialRiskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户基础信息
  userProfile?: UserProfile;
  // 交易明细信息
  transactionDetails?: TransactionDetails;
  // 风险评估因子列表
  riskFactors?: RiskFactorDetail[];
  // 业务上下文信息
  businessContext?: NameValuePair;
  // 风险等级标识（LOW/MEDIUM/HIGH/URGENT）
  riskLevel?: string;
  // 接口超时时间（毫秒）
  timeout?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userProfile: 'user_profile',
      transactionDetails: 'transaction_details',
      riskFactors: 'risk_factors',
      businessContext: 'business_context',
      riskLevel: 'risk_level',
      timeout: 'timeout',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userProfile: UserProfile,
      transactionDetails: TransactionDetails,
      riskFactors: { 'type': 'array', 'itemType': RiskFactorDetail },
      businessContext: NameValuePair,
      riskLevel: 'string',
      timeout: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAgentFinancialRiskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 风险等级
  riskLevel?: string;
  // 风险建议动作
  suggestedAction?: string;
  // 风险分
  riskScore?: number;
  // 风险因子列表
  riskfactors?: RiskFactorDetail;
  // 处置建议
  recommendations?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      riskLevel: 'risk_level',
      suggestedAction: 'suggested_action',
      riskScore: 'risk_score',
      riskfactors: 'riskfactors',
      recommendations: 'recommendations',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      riskLevel: 'string',
      suggestedAction: 'string',
      riskScore: 'number',
      riskfactors: RiskFactorDetail,
      recommendations: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadAutoTestFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // fileId
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  // 超时时间
  timeout: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      timeout: 'timeout',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      timeout: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadAutoTestFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // OK
  status?: string;
  // SUCCESS le
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

export class QueryStreamTestmethodtwoRequest extends $tea.Model {
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

export class QueryStreamTestmethodtwoResponse extends $tea.Model {
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

export class QueryTestHfRequest extends $tea.Model {
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

export class QueryTestHfResponse extends $tea.Model {
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

export class QueryAaaMultiCccRequest extends $tea.Model {
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

export class QueryAaaMultiCccResponse extends $tea.Model {
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

export class QueryStreamTestmethodRequest extends $tea.Model {
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

export class QueryStreamTestmethodResponse extends $tea.Model {
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

export class QueryStreamTimeoutRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // name
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

export class QueryStreamTimeoutResponse extends $tea.Model {
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

export class QueryStreamNonjsonRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // name
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

export class QueryStreamNonjsonResponse extends $tea.Model {
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

export class QueryStreamSpecialCharactersRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // name
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

export class QueryStreamSpecialCharactersResponse extends $tea.Model {
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

export class QueryStreamNonstreamRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // name
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

export class QueryStreamNonstreamResponse extends $tea.Model {
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

export class QueryLoadtestTimeOneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 毫秒值
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

export class QueryLoadtestTimeOneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 200
  stauts?: string;
  // ok
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

export class QueryLoadtestTimeTwoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 毫秒
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

export class QueryLoadtestTimeTwoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 200
  stauts?: string;
  // ok
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

export class QueryLoadtestTimeFourRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 毫秒值
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

export class QueryLoadtestTimeFourResponse extends $tea.Model {
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

export class QueryLoadtestTimeFiveRequest extends $tea.Model {
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

export class QueryLoadtestTimeFiveResponse extends $tea.Model {
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

export class CheckAicoguardcoreAicoguardrailsQuestionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前提问内容
  question: string;
  // 当前提问格式
  questionFormat?: string;
  // 应用名
  appCode: string;
  // 会话ID
  sessionId: string;
  // 唯一定位一个问答对
  requestId: string;
  // 场景code，走SOP流程申请
  sceneCode: string;
  // 当前固定填入：TJ_QUESTION_BASIC
  serviceCode: string;
  // Agent标识
  agentCode: string;
  // 大模型Code，区分大模型类型和版本，比如bailing_10b_0229、bailing_65b_0315
  modelCode?: string;
  // 用户ID，用于主体风险判断
  userId?: string;
  // 扩展信息，会透传到业务属性中
  businessProperties?: Map;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      question: 'question',
      questionFormat: 'question_format',
      appCode: 'app_code',
      sessionId: 'session_id',
      requestId: 'request_id',
      sceneCode: 'scene_code',
      serviceCode: 'service_code',
      agentCode: 'agent_code',
      modelCode: 'model_code',
      userId: 'user_id',
      businessProperties: 'business_properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      question: 'string',
      questionFormat: 'string',
      appCode: 'string',
      sessionId: 'string',
      requestId: 'string',
      sceneCode: 'string',
      serviceCode: 'string',
      agentCode: 'string',
      modelCode: 'string',
      userId: 'string',
      businessProperties: Map,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckAicoguardcoreAicoguardrailsQuestionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否安全无风险 true：安全无风险 false：有风险
  safe?: boolean;
  // 安全动作 BLOCK：拦截  SECURITY_ANSWER：安全代答  SECURITY_PROMPT：安全提示增强
  actionCode?: string;
  // 安全动作相关文案，比如安全提示增强的文案、安全代答的回答、回答里补充的安全提示
  actionMsg?: string;
  // 会话动作. END_SESSION：终止会话.  RECALL_QUERY：撤回提问
  sessionAction?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
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

export class QueryTestTimeMenhuRequest extends $tea.Model {
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

export class QueryTestTimeMenhuResponse extends $tea.Model {
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

export class BindAaaBbbCccRequest extends $tea.Model {
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

export class BindAaaBbbCccResponse extends $tea.Model {
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

export class QueryAaaBbbCccRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 入参
  param: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param: 'param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAaaBbbCccResponse extends $tea.Model {
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

export class QueryAbcAbcAbcRequest extends $tea.Model {
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

export class QueryAbcAbcAbcResponse extends $tea.Model {
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

export class BindAaaBbbCcdRequest extends $tea.Model {
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

export class BindAaaBbbCcdResponse extends $tea.Model {
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

export class QueryAutoTestRequest extends $tea.Model {
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

export class QueryAutoTestResponse extends $tea.Model {
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

export class CreateAntcloudGatewayxFileUploadRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 上传文件作用的openapi method
  apiCode: string;
  // 文件标签，多个标签;分割
  fileLabel?: string;
  // 自定义的文件元数据
  fileMetadata?: string;
  // 文件名，不传则随机生成文件名
  fileName?: string;
  // 文件的多媒体类型
  mimeType?: string;
  // 产品方的api归属集群，即productInstanceId
  apiCluster?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      apiCode: 'api_code',
      fileLabel: 'file_label',
      fileMetadata: 'file_metadata',
      fileName: 'file_name',
      mimeType: 'mime_type',
      apiCluster: 'api_cluster',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      apiCode: 'string',
      fileLabel: 'string',
      fileMetadata: 'string',
      fileName: 'string',
      mimeType: 'string',
      apiCluster: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntcloudGatewayxFileUploadResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 上传有效期
  expiredTime?: string;
  // 32位文件唯一id
  fileId?: string;
  // 放入http请求头里
  uploadHeaders?: XNameValuePair[];
  // 文件上传地址
  uploadUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      expiredTime: 'expired_time',
      fileId: 'file_id',
      uploadHeaders: 'upload_headers',
      uploadUrl: 'upload_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      expiredTime: 'string',
      fileId: 'string',
      uploadHeaders: { 'type': 'array', 'itemType': XNameValuePair },
      uploadUrl: 'string',
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
          sdk_version: "1.1.94",
          _prod_code: "DEMO",
          _prod_channel: "undefined",
        };
        if (!Util.empty(this._securityToken)) {
          request_.query["security_token"] = this._securityToken;
        }

        request_.headers = {
          host: Util.defaultString(this._endpoint, "centre-openapi.antchain.antgroup.com"),
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
   * Description: test
   * Summary: test
   */
  async stabilizeTestTest(request: StabilizeTestTestRequest): Promise<StabilizeTestTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.stabilizeTestTestEx(request, headers, runtime);
  }

  /**
   * Description: test
   * Summary: test
   */
  async stabilizeTestTestEx(request: StabilizeTestTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StabilizeTestTestResponse> {
    Util.validateModel(request);
    return $tea.cast<StabilizeTestTestResponse>(await this.doRequest("1.0", "demo.test.test.stabilize", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StabilizeTestTestResponse({}));
  }

  /**
   * Description: a_a_a
   * Summary: a_a_a
   */
  async asdasAsdaAsda(request: AsdasAsdaAsdaRequest): Promise<AsdasAsdaAsdaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.asdasAsdaAsdaEx(request, headers, runtime);
  }

  /**
   * Description: a_a_a
   * Summary: a_a_a
   */
  async asdasAsdaAsdaEx(request: AsdasAsdaAsdaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AsdasAsdaAsdaResponse> {
    Util.validateModel(request);
    return $tea.cast<AsdasAsdaAsdaResponse>(await this.doRequest("1.0", "demo.asda.asda.asdas", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AsdasAsdaAsdaResponse({}));
  }

  /**
   * Description: Demo接口，返回当前服务器当前状态1
   * Summary: 检查服务状态
   */
  async statusGatewayCheck(request: StatusGatewayCheckRequest): Promise<StatusGatewayCheckResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.statusGatewayCheckEx(request, headers, runtime);
  }

  /**
   * Description: Demo接口，返回当前服务器当前状态1
   * Summary: 检查服务状态
   */
  async statusGatewayCheckEx(request: StatusGatewayCheckRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StatusGatewayCheckResponse> {
    Util.validateModel(request);
    return $tea.cast<StatusGatewayCheckResponse>(await this.doRequest("1.0", "demo.gateway.check.status", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StatusGatewayCheckResponse({}));
  }

  /**
   * Description: Demo接口，返回当前输入的值
   * Summary: 返回输入值1
   */
  async echoGatewayCheck(request: EchoGatewayCheckRequest): Promise<EchoGatewayCheckResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.echoGatewayCheckEx(request, headers, runtime);
  }

  /**
   * Description: Demo接口，返回当前输入的值
   * Summary: 返回输入值1
   */
  async echoGatewayCheckEx(request: EchoGatewayCheckRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<EchoGatewayCheckResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "demo.gateway.check.echo",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "OK")) {
        let echoGatewayCheckResponse = new EchoGatewayCheckResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return echoGatewayCheckResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<EchoGatewayCheckResponse>(await this.doRequest("1.0", "demo.gateway.check.echo", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new EchoGatewayCheckResponse({}));
  }

  /**
   * Description: aaa
   * Summary: 测试demo
   */
  async queryGatewayMy(request: QueryGatewayMyRequest): Promise<QueryGatewayMyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGatewayMyEx(request, headers, runtime);
  }

  /**
   * Description: aaa
   * Summary: 测试demo
   */
  async queryGatewayMyEx(request: QueryGatewayMyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGatewayMyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGatewayMyResponse>(await this.doRequest("1.0", "demo.gateway.my.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGatewayMyResponse({}));
  }

  /**
   * Description: 超时测试
   * Summary: 自动化运行态测试使用【勿动！】
   */
  async queryGatewayCheckEchotimeout(request: QueryGatewayCheckEchotimeoutRequest): Promise<QueryGatewayCheckEchotimeoutResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGatewayCheckEchotimeoutEx(request, headers, runtime);
  }

  /**
   * Description: 超时测试
   * Summary: 自动化运行态测试使用【勿动！】
   */
  async queryGatewayCheckEchotimeoutEx(request: QueryGatewayCheckEchotimeoutRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGatewayCheckEchotimeoutResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGatewayCheckEchotimeoutResponse>(await this.doRequest("1.0", "demo.gateway.check.echotimeout.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGatewayCheckEchotimeoutResponse({}));
  }

  /**
   * Description: 10  测测aa
   * Summary: 10s
   */
  async queryGatewayCheckEchoten(request: QueryGatewayCheckEchotenRequest): Promise<QueryGatewayCheckEchotenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGatewayCheckEchotenEx(request, headers, runtime);
  }

  /**
   * Description: 10  测测aa
   * Summary: 10s
   */
  async queryGatewayCheckEchotenEx(request: QueryGatewayCheckEchotenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGatewayCheckEchotenResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGatewayCheckEchotenResponse>(await this.doRequest("1.0", "demo.gateway.check.echoten.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGatewayCheckEchotenResponse({}));
  }

  /**
   * Description: 简介简介简介s
   * Summary: 简介简介
   */
  async queryAdAsdAsd(request: QueryAdAsdAsdRequest): Promise<QueryAdAsdAsdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAdAsdAsdEx(request, headers, runtime);
  }

  /**
   * Description: 简介简介简介s
   * Summary: 简介简介
   */
  async queryAdAsdAsdEx(request: QueryAdAsdAsdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAdAsdAsdResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAdAsdAsdResponse>(await this.doRequest("1.0", "demo.ad.asd.asd.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAdAsdAsdResponse({}));
  }

  /**
   * Description: 根据入参组合返回结果，Fr 自动化连通性测试。
   * Summary: road.init（Fr AutoT）
   */
  async initGatewayRoad(request: InitGatewayRoadRequest): Promise<InitGatewayRoadResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initGatewayRoadEx(request, headers, runtime);
  }

  /**
   * Description: 根据入参组合返回结果，Fr 自动化连通性测试。
   * Summary: road.init（Fr AutoT）
   */
  async initGatewayRoadEx(request: InitGatewayRoadRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitGatewayRoadResponse> {
    Util.validateModel(request);
    return $tea.cast<InitGatewayRoadResponse>(await this.doRequest("1.0", "demo.gateway.road.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitGatewayRoadResponse({}));
  }

  /**
   * Description: 近端网关测试接口
   * Summary: 近端网关测试接口（勿删）
   */
  async queryGatewayEmbed(request: QueryGatewayEmbedRequest): Promise<QueryGatewayEmbedResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGatewayEmbedEx(request, headers, runtime);
  }

  /**
   * Description: 近端网关测试接口
   * Summary: 近端网关测试接口（勿删）
   */
  async queryGatewayEmbedEx(request: QueryGatewayEmbedRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGatewayEmbedResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGatewayEmbedResponse>(await this.doRequest("1.0", "demo.gateway.embed.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGatewayEmbedResponse({}));
  }

  /**
   * Description: 更新入参后返回结果，Fr 自动化连通性测试。
   * Summary: road.upd（Fr AutoT）
   */
  async updateGatewayRoad(request: UpdateGatewayRoadRequest): Promise<UpdateGatewayRoadResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateGatewayRoadEx(request, headers, runtime);
  }

  /**
   * Description: 更新入参后返回结果，Fr 自动化连通性测试。
   * Summary: road.upd（Fr AutoT）
   */
  async updateGatewayRoadEx(request: UpdateGatewayRoadRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateGatewayRoadResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateGatewayRoadResponse>(await this.doRequest("1.0", "demo.gateway.road.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateGatewayRoadResponse({}));
  }

  /**
   * Description: 查询并返回结果，Fr 自动化连通性测试。
   * Summary: road.query（Fr AutoT）
   */
  async queryGatewayRoad(request: QueryGatewayRoadRequest): Promise<QueryGatewayRoadResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGatewayRoadEx(request, headers, runtime);
  }

  /**
   * Description: 查询并返回结果，Fr 自动化连通性测试。
   * Summary: road.query（Fr AutoT）
   */
  async queryGatewayRoadEx(request: QueryGatewayRoadRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGatewayRoadResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGatewayRoadResponse>(await this.doRequest("1.0", "demo.gateway.road.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGatewayRoadResponse({}));
  }

  /**
   * Description: 执行计算后返回，Fr 自动化连通性测试。
   * Summary: road.exec（Fr AutoT）
   */
  async execGatewayRoad(request: ExecGatewayRoadRequest): Promise<ExecGatewayRoadResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execGatewayRoadEx(request, headers, runtime);
  }

  /**
   * Description: 执行计算后返回，Fr 自动化连通性测试。
   * Summary: road.exec（Fr AutoT）
   */
  async execGatewayRoadEx(request: ExecGatewayRoadRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecGatewayRoadResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecGatewayRoadResponse>(await this.doRequest("1.0", "demo.gateway.road.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecGatewayRoadResponse({}));
  }

  /**
   * Description: 压测接口3
   * Summary: 压测接口3
   */
  async queryLoadtestTimeThree(request: QueryLoadtestTimeThreeRequest): Promise<QueryLoadtestTimeThreeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLoadtestTimeThreeEx(request, headers, runtime);
  }

  /**
   * Description: 压测接口3
   * Summary: 压测接口3
   */
  async queryLoadtestTimeThreeEx(request: QueryLoadtestTimeThreeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLoadtestTimeThreeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLoadtestTimeThreeResponse>(await this.doRequest("1.0", "demo.loadtest.time.three.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLoadtestTimeThreeResponse({}));
  }

  /**
   * Description: test
   * Summary: 自动化测试工程使用，勿删勿改
   */
  async queryInstanceidRule(request: QueryInstanceidRuleRequest): Promise<QueryInstanceidRuleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInstanceidRuleEx(request, headers, runtime);
  }

  /**
   * Description: test
   * Summary: 自动化测试工程使用，勿删勿改
   */
  async queryInstanceidRuleEx(request: QueryInstanceidRuleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInstanceidRuleResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInstanceidRuleResponse>(await this.doRequest("1.0", "demo.instanceid.rule.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInstanceidRuleResponse({}));
  }

  /**
   * Description: 设置下游耗时
   * Summary: 自动化运行态使用【勿动！】
   */
  async queryGatewayCheckEchotimeoutok(request: QueryGatewayCheckEchotimeoutokRequest): Promise<QueryGatewayCheckEchotimeoutokResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGatewayCheckEchotimeoutokEx(request, headers, runtime);
  }

  /**
   * Description: 设置下游耗时
   * Summary: 自动化运行态使用【勿动！】
   */
  async queryGatewayCheckEchotimeoutokEx(request: QueryGatewayCheckEchotimeoutokRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGatewayCheckEchotimeoutokResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGatewayCheckEchotimeoutokResponse>(await this.doRequest("1.0", "demo.gateway.check.echotimeoutok.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGatewayCheckEchotimeoutokResponse({}));
  }

  /**
   * Description: 双百&门户&网关，停服决策测试使用
   * Summary: 商业化规则测试
   */
  async matchBusinessAndInstance(request: MatchBusinessAndInstanceRequest): Promise<MatchBusinessAndInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.matchBusinessAndInstanceEx(request, headers, runtime);
  }

  /**
   * Description: 双百&门户&网关，停服决策测试使用
   * Summary: 商业化规则测试
   */
  async matchBusinessAndInstanceEx(request: MatchBusinessAndInstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<MatchBusinessAndInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<MatchBusinessAndInstanceResponse>(await this.doRequest("1.0", "demo.business.and.instance.match", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new MatchBusinessAndInstanceResponse({}));
  }

  /**
   * Description: 流失查询测试
   * Summary: 流失查询测试
   */
  async queryStreamTest(request: QueryStreamTestRequest): Promise<QueryStreamTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryStreamTestEx(request, headers, runtime);
  }

  /**
   * Description: 流失查询测试
   * Summary: 流失查询测试
   */
  async queryStreamTestEx(request: QueryStreamTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryStreamTestResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryStreamTestResponse>(await this.doRequest("1.0", "demo.stream.test.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryStreamTestResponse({}));
  }

  /**
   * Description: 网关性能优化测试
   * Summary: 性能优化测试
   */
  async queryTestCatcheLimit(request: QueryTestCatcheLimitRequest): Promise<QueryTestCatcheLimitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTestCatcheLimitEx(request, headers, runtime);
  }

  /**
   * Description: 网关性能优化测试
   * Summary: 性能优化测试
   */
  async queryTestCatcheLimitEx(request: QueryTestCatcheLimitRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTestCatcheLimitResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTestCatcheLimitResponse>(await this.doRequest("1.0", "demo.test.catche.limit.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTestCatcheLimitResponse({}));
  }

  /**
   * Description: 测试使用
   * Summary: 测试使用
   */
  async queryTestForLimit(request: QueryTestForLimitRequest): Promise<QueryTestForLimitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTestForLimitEx(request, headers, runtime);
  }

  /**
   * Description: 测试使用
   * Summary: 测试使用
   */
  async queryTestForLimitEx(request: QueryTestForLimitRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTestForLimitResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTestForLimitResponse>(await this.doRequest("1.0", "demo.test.for.limit.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTestForLimitResponse({}));
  }

  /**
   * Description: test
   * Summary: test
   */
  async queryTestTestTest(request: QueryTestTestTestRequest): Promise<QueryTestTestTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTestTestTestEx(request, headers, runtime);
  }

  /**
   * Description: test
   * Summary: test
   */
  async queryTestTestTestEx(request: QueryTestTestTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTestTestTestResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "demo.test.test.test.query",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "OK")) {
        let queryTestTestTestResponse = new QueryTestTestTestResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return queryTestTestTestResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<QueryTestTestTestResponse>(await this.doRequest("1.0", "demo.test.test.test.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTestTestTestResponse({}));
  }

  /**
   * Description: a
   * Summary: abcde
   */
  async queryABC(request: QueryABCRequest): Promise<QueryABCResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryABCEx(request, headers, runtime);
  }

  /**
   * Description: a
   * Summary: abcde
   */
  async queryABCEx(request: QueryABCRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryABCResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryABCResponse>(await this.doRequest("1.0", "demo.a.b.c.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryABCResponse({}));
  }

  /**
   * Description: 近端接口测试
   * Summary: 近端接口测试
   */
  async queryTestEmbedUser(request: QueryTestEmbedUserRequest): Promise<QueryTestEmbedUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTestEmbedUserEx(request, headers, runtime);
  }

  /**
   * Description: 近端接口测试
   * Summary: 近端接口测试
   */
  async queryTestEmbedUserEx(request: QueryTestEmbedUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTestEmbedUserResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTestEmbedUserResponse>(await this.doRequest("1.0", "demo.test.embed.user.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTestEmbedUserResponse({}));
  }

  /**
   * Description: sss
   * Summary: sss
   */
  async queryAasSaSa(request: QueryAasSaSaRequest): Promise<QueryAasSaSaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAasSaSaEx(request, headers, runtime);
  }

  /**
   * Description: sss
   * Summary: sss
   */
  async queryAasSaSaEx(request: QueryAasSaSaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAasSaSaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAasSaSaResponse>(await this.doRequest("1.0", "demo.aas.sa.sa.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAasSaSaResponse({}));
  }

  /**
   * Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
   * Summary: 自动化测试需要，【请勿做任何改动！】
   */
  async queryApiWhiteList(request: QueryApiWhiteListRequest): Promise<QueryApiWhiteListResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryApiWhiteListEx(request, headers, runtime);
  }

  /**
   * Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
   * Summary: 自动化测试需要，【请勿做任何改动！】
   */
  async queryApiWhiteListEx(request: QueryApiWhiteListRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryApiWhiteListResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryApiWhiteListResponse>(await this.doRequest("1.0", "demo.api.white.list.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryApiWhiteListResponse({}));
  }

  /**
   * Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
   * Summary: 自动化测试需要，【请勿做任何改动！】
   */
  async queryApiBlackList(request: QueryApiBlackListRequest): Promise<QueryApiBlackListResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryApiBlackListEx(request, headers, runtime);
  }

  /**
   * Description: 用于自动化测试IP访问控制白名单测试需要，【请勿做任何改动！】
   * Summary: 自动化测试需要，【请勿做任何改动！】
   */
  async queryApiBlackListEx(request: QueryApiBlackListRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryApiBlackListResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryApiBlackListResponse>(await this.doRequest("1.0", "demo.api.black.list.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryApiBlackListResponse({}));
  }

  /**
   * Description: ip访问白名单测试
   * Summary: 【自动化】ip访问白名单测试
   */
  async queryIpWhiteList(request: QueryIpWhiteListRequest): Promise<QueryIpWhiteListResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIpWhiteListEx(request, headers, runtime);
  }

  /**
   * Description: ip访问白名单测试
   * Summary: 【自动化】ip访问白名单测试
   */
  async queryIpWhiteListEx(request: QueryIpWhiteListRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIpWhiteListResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIpWhiteListResponse>(await this.doRequest("1.0", "demo.ip.white.list.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIpWhiteListResponse({}));
  }

  /**
   * Description: ip访问白名单测试
   * Summary: 【自动化】ip访问黑名单测试
   */
  async queryIpBlackList(request: QueryIpBlackListRequest): Promise<QueryIpBlackListResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIpBlackListEx(request, headers, runtime);
  }

  /**
   * Description: ip访问白名单测试
   * Summary: 【自动化】ip访问黑名单测试
   */
  async queryIpBlackListEx(request: QueryIpBlackListRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIpBlackListResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIpBlackListResponse>(await this.doRequest("1.0", "demo.ip.black.list.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIpBlackListResponse({}));
  }

  /**
   * Description: 重试策略
   * Summary: 【自动化】重试策略
   */
  async queryIpRetry(request: QueryIpRetryRequest): Promise<QueryIpRetryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIpRetryEx(request, headers, runtime);
  }

  /**
   * Description: 重试策略
   * Summary: 【自动化】重试策略
   */
  async queryIpRetryEx(request: QueryIpRetryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIpRetryResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIpRetryResponse>(await this.doRequest("1.0", "demo.ip.retry.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIpRetryResponse({}));
  }

  /**
   * Description: 个人工作台二期测试
   * Summary: 个人工作台二期测试
   */
  async queryTestTimeTesta(request: QueryTestTimeTestaRequest): Promise<QueryTestTimeTestaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTestTimeTestaEx(request, headers, runtime);
  }

  /**
   * Description: 个人工作台二期测试
   * Summary: 个人工作台二期测试
   */
  async queryTestTimeTestaEx(request: QueryTestTimeTestaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTestTimeTestaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTestTimeTestaResponse>(await this.doRequest("1.0", "demo.test.time.testa.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTestTimeTestaResponse({}));
  }

  /**
   * Description: oas 测试使用
   * Summary: oas 测试使用
   */
  async queryOasRest(request: QueryOasRestRequest): Promise<QueryOasRestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryOasRestEx(request, headers, runtime);
  }

  /**
   * Description: oas 测试使用
   * Summary: oas 测试使用
   */
  async queryOasRestEx(request: QueryOasRestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryOasRestResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryOasRestResponse>(await this.doRequest("1.0", "demo.oas.rest.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryOasRestResponse({}));
  }

  /**
   * Description: 自动化contenttype兼容测试
   * Summary: 自动化contenttype兼容测试
   */
  async queryTestContentType(request: QueryTestContentTypeRequest): Promise<QueryTestContentTypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTestContentTypeEx(request, headers, runtime);
  }

  /**
   * Description: 自动化contenttype兼容测试
   * Summary: 自动化contenttype兼容测试
   */
  async queryTestContentTypeEx(request: QueryTestContentTypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTestContentTypeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTestContentTypeResponse>(await this.doRequest("1.0", "demo.test.content.type.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTestContentTypeResponse({}));
  }

  /**
   * Description: 自动化测试contentType
   * Summary: 自动化测试contentType
   */
  async queryTestContentTypeone(request: QueryTestContentTypeoneRequest): Promise<QueryTestContentTypeoneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTestContentTypeoneEx(request, headers, runtime);
  }

  /**
   * Description: 自动化测试contentType
   * Summary: 自动化测试contentType
   */
  async queryTestContentTypeoneEx(request: QueryTestContentTypeoneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTestContentTypeoneResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTestContentTypeoneResponse>(await this.doRequest("1.0", "demo.test.content.typeone.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTestContentTypeoneResponse({}));
  }

  /**
   * Description: 自动化contenttype兼容测试
   * Summary: 自动化contenttype兼容测试
   */
  async queryTestContentTypetwo(request: QueryTestContentTypetwoRequest): Promise<QueryTestContentTypetwoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTestContentTypetwoEx(request, headers, runtime);
  }

  /**
   * Description: 自动化contenttype兼容测试
   * Summary: 自动化contenttype兼容测试
   */
  async queryTestContentTypetwoEx(request: QueryTestContentTypetwoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTestContentTypetwoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTestContentTypetwoResponse>(await this.doRequest("1.0", "demo.test.content.typetwo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTestContentTypetwoResponse({}));
  }

  /**
   * Description: 自动化contenttype兼容测试
   * Summary: 自动化contenttype兼容测试
   */
  async queryTestContentTypethree(request: QueryTestContentTypethreeRequest): Promise<QueryTestContentTypethreeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTestContentTypethreeEx(request, headers, runtime);
  }

  /**
   * Description: 自动化contenttype兼容测试
   * Summary: 自动化contenttype兼容测试
   */
  async queryTestContentTypethreeEx(request: QueryTestContentTypethreeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTestContentTypethreeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTestContentTypethreeResponse>(await this.doRequest("1.0", "demo.test.content.typethree.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTestContentTypethreeResponse({}));
  }

  /**
   * Description: 自动化contenttype兼容测试
   * Summary: 自动化contenttype兼容测试
   */
  async queryTestContentTypefour(request: QueryTestContentTypefourRequest): Promise<QueryTestContentTypefourResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTestContentTypefourEx(request, headers, runtime);
  }

  /**
   * Description: 自动化contenttype兼容测试
   * Summary: 自动化contenttype兼容测试
   */
  async queryTestContentTypefourEx(request: QueryTestContentTypefourRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTestContentTypefourResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTestContentTypefourResponse>(await this.doRequest("1.0", "demo.test.content.typefour.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTestContentTypefourResponse({}));
  }

  /**
   * Description: 自动化contenttype兼容测试
   * Summary: 自动化contenttype兼容测试
   */
  async queryTestContentTypefive(request: QueryTestContentTypefiveRequest): Promise<QueryTestContentTypefiveResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTestContentTypefiveEx(request, headers, runtime);
  }

  /**
   * Description: 自动化contenttype兼容测试
   * Summary: 自动化contenttype兼容测试
   */
  async queryTestContentTypefiveEx(request: QueryTestContentTypefiveRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTestContentTypefiveResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTestContentTypefiveResponse>(await this.doRequest("1.0", "demo.test.content.typefive.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTestContentTypefiveResponse({}));
  }

  /**
   * Description: 金融场景风险分析
   * Summary: 金融场景风险分析
   */
  async queryAgentFinancialRisk(request: QueryAgentFinancialRiskRequest): Promise<QueryAgentFinancialRiskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAgentFinancialRiskEx(request, headers, runtime);
  }

  /**
   * Description: 金融场景风险分析
   * Summary: 金融场景风险分析
   */
  async queryAgentFinancialRiskEx(request: QueryAgentFinancialRiskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAgentFinancialRiskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAgentFinancialRiskResponse>(await this.doRequest("1.0", "demo.agent.financial.risk.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAgentFinancialRiskResponse({}));
  }

  /**
   * Description: 自动化文件上传
   * Summary: 自动化文件上传【勿动！】
   */
  async uploadAutoTestFile(request: UploadAutoTestFileRequest): Promise<UploadAutoTestFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadAutoTestFileEx(request, headers, runtime);
  }

  /**
   * Description: 自动化文件上传
   * Summary: 自动化文件上传【勿动！】
   */
  async uploadAutoTestFileEx(request: UploadAutoTestFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadAutoTestFileResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "demo.auto.test.file.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "OK")) {
        let uploadAutoTestFileResponse = new UploadAutoTestFileResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadAutoTestFileResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<UploadAutoTestFileResponse>(await this.doRequest("1.0", "demo.auto.test.file.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadAutoTestFileResponse({}));
  }

  /**
   * Description: stream200 test
   * Summary: stream200 test
   */
  async queryStreamTestmethodtwo(request: QueryStreamTestmethodtwoRequest): Promise<QueryStreamTestmethodtwoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryStreamTestmethodtwoEx(request, headers, runtime);
  }

  /**
   * Description: stream200 test
   * Summary: stream200 test
   */
  async queryStreamTestmethodtwoEx(request: QueryStreamTestmethodtwoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryStreamTestmethodtwoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryStreamTestmethodtwoResponse>(await this.doRequest("1.0", "demo.stream.testmethodtwo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryStreamTestmethodtwoResponse({}));
  }

  /**
   * Description: test
   * Summary: test
   */
  async queryTestHf(request: QueryTestHfRequest): Promise<QueryTestHfResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTestHfEx(request, headers, runtime);
  }

  /**
   * Description: test
   * Summary: test
   */
  async queryTestHfEx(request: QueryTestHfRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTestHfResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTestHfResponse>(await this.doRequest("1.0", "demo.test.hf.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTestHfResponse({}));
  }

  /**
   * Description: 测试用
   * Summary: 测试用
   */
  async queryAaaMultiCcc(request: QueryAaaMultiCccRequest): Promise<QueryAaaMultiCccResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAaaMultiCccEx(request, headers, runtime);
  }

  /**
   * Description: 测试用
   * Summary: 测试用
   */
  async queryAaaMultiCccEx(request: QueryAaaMultiCccRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAaaMultiCccResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAaaMultiCccResponse>(await this.doRequest("1.0", "demo.aaa.multi.ccc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAaaMultiCccResponse({}));
  }

  /**
   * Description: 流式处理
   * Summary: 流式处理
   */
  async queryStreamTestmethod(request: QueryStreamTestmethodRequest): Promise<QueryStreamTestmethodResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryStreamTestmethodEx(request, headers, runtime);
  }

  /**
   * Description: 流式处理
   * Summary: 流式处理
   */
  async queryStreamTestmethodEx(request: QueryStreamTestmethodRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryStreamTestmethodResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryStreamTestmethodResponse>(await this.doRequest("1.0", "demo.stream.testmethod.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryStreamTestmethodResponse({}));
  }

  /**
   * Description: 模拟下游超时情况
   * Summary: 流式超时测试接口
   */
  async queryStreamTimeout(request: QueryStreamTimeoutRequest): Promise<QueryStreamTimeoutResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryStreamTimeoutEx(request, headers, runtime);
  }

  /**
   * Description: 模拟下游超时情况
   * Summary: 流式超时测试接口
   */
  async queryStreamTimeoutEx(request: QueryStreamTimeoutRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryStreamTimeoutResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryStreamTimeoutResponse>(await this.doRequest("1.0", "demo.stream.timeout.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryStreamTimeoutResponse({}));
  }

  /**
   * Description: 模拟下游返回非json的情况
   * Summary: 流式下游返回非json
   */
  async queryStreamNonjson(request: QueryStreamNonjsonRequest): Promise<QueryStreamNonjsonResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryStreamNonjsonEx(request, headers, runtime);
  }

  /**
   * Description: 模拟下游返回非json的情况
   * Summary: 流式下游返回非json
   */
  async queryStreamNonjsonEx(request: QueryStreamNonjsonRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryStreamNonjsonResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryStreamNonjsonResponse>(await this.doRequest("1.0", "demo.stream.nonjson.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryStreamNonjsonResponse({}));
  }

  /**
   * Description: 流式出参包含特殊字符
   * Summary: 流式出参包含特殊字符
   */
  async queryStreamSpecialCharacters(request: QueryStreamSpecialCharactersRequest): Promise<QueryStreamSpecialCharactersResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryStreamSpecialCharactersEx(request, headers, runtime);
  }

  /**
   * Description: 流式出参包含特殊字符
   * Summary: 流式出参包含特殊字符
   */
  async queryStreamSpecialCharactersEx(request: QueryStreamSpecialCharactersRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryStreamSpecialCharactersResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryStreamSpecialCharactersResponse>(await this.doRequest("1.0", "demo.stream.special.characters.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryStreamSpecialCharactersResponse({}));
  }

  /**
   * Description: 非流式返回
   * Summary: 非流式返回
   */
  async queryStreamNonstream(request: QueryStreamNonstreamRequest): Promise<QueryStreamNonstreamResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryStreamNonstreamEx(request, headers, runtime);
  }

  /**
   * Description: 非流式返回
   * Summary: 非流式返回
   */
  async queryStreamNonstreamEx(request: QueryStreamNonstreamRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryStreamNonstreamResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryStreamNonstreamResponse>(await this.doRequest("1.0", "demo.stream.nonstream.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryStreamNonstreamResponse({}));
  }

  /**
   * Description: 压测接口1
   * Summary: 压测接口1
   */
  async queryLoadtestTimeOne(request: QueryLoadtestTimeOneRequest): Promise<QueryLoadtestTimeOneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLoadtestTimeOneEx(request, headers, runtime);
  }

  /**
   * Description: 压测接口1
   * Summary: 压测接口1
   */
  async queryLoadtestTimeOneEx(request: QueryLoadtestTimeOneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLoadtestTimeOneResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLoadtestTimeOneResponse>(await this.doRequest("1.0", "demo.loadtest.time.one.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLoadtestTimeOneResponse({}));
  }

  /**
   * Description: 压测接口2
   * Summary: 压测接口2
   */
  async queryLoadtestTimeTwo(request: QueryLoadtestTimeTwoRequest): Promise<QueryLoadtestTimeTwoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLoadtestTimeTwoEx(request, headers, runtime);
  }

  /**
   * Description: 压测接口2
   * Summary: 压测接口2
   */
  async queryLoadtestTimeTwoEx(request: QueryLoadtestTimeTwoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLoadtestTimeTwoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLoadtestTimeTwoResponse>(await this.doRequest("1.0", "demo.loadtest.time.two.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLoadtestTimeTwoResponse({}));
  }

  /**
   * Description: 压测接口4，用于压测
   * Summary: 压测接口4
   */
  async queryLoadtestTimeFour(request: QueryLoadtestTimeFourRequest): Promise<QueryLoadtestTimeFourResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLoadtestTimeFourEx(request, headers, runtime);
  }

  /**
   * Description: 压测接口4，用于压测
   * Summary: 压测接口4
   */
  async queryLoadtestTimeFourEx(request: QueryLoadtestTimeFourRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLoadtestTimeFourResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLoadtestTimeFourResponse>(await this.doRequest("1.0", "demo.loadtest.time.four.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLoadtestTimeFourResponse({}));
  }

  /**
   * Description: 压测接口5，用于压测
   * Summary: 压测接口5
   */
  async queryLoadtestTimeFive(request: QueryLoadtestTimeFiveRequest): Promise<QueryLoadtestTimeFiveResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLoadtestTimeFiveEx(request, headers, runtime);
  }

  /**
   * Description: 压测接口5，用于压测
   * Summary: 压测接口5
   */
  async queryLoadtestTimeFiveEx(request: QueryLoadtestTimeFiveRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLoadtestTimeFiveResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLoadtestTimeFiveResponse>(await this.doRequest("1.0", "demo.loadtest.time.five.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLoadtestTimeFiveResponse({}));
  }

  /**
   * Description: 大模型护栏多轮对话提问检测 测试
   * Summary: 大模型护栏多轮对话提问检测
   */
  async checkAicoguardcoreAicoguardrailsQuestion(request: CheckAicoguardcoreAicoguardrailsQuestionRequest): Promise<CheckAicoguardcoreAicoguardrailsQuestionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkAicoguardcoreAicoguardrailsQuestionEx(request, headers, runtime);
  }

  /**
   * Description: 大模型护栏多轮对话提问检测 测试
   * Summary: 大模型护栏多轮对话提问检测
   */
  async checkAicoguardcoreAicoguardrailsQuestionEx(request: CheckAicoguardcoreAicoguardrailsQuestionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckAicoguardcoreAicoguardrailsQuestionResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckAicoguardcoreAicoguardrailsQuestionResponse>(await this.doRequest("1.0", "demo.aicoguardcore.aicoguardrails.question.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckAicoguardcoreAicoguardrailsQuestionResponse({}));
  }

  /**
   * Description: 个人工作台二期测试
   * Summary: 个人工作台二期测试
   */
  async queryTestTimeMenhu(request: QueryTestTimeMenhuRequest): Promise<QueryTestTimeMenhuResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTestTimeMenhuEx(request, headers, runtime);
  }

  /**
   * Description: 个人工作台二期测试
   * Summary: 个人工作台二期测试
   */
  async queryTestTimeMenhuEx(request: QueryTestTimeMenhuRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTestTimeMenhuResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTestTimeMenhuResponse>(await this.doRequest("1.0", "demo.test.time.menhu.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTestTimeMenhuResponse({}));
  }

  /**
   * Description: 自动化测试创建test，请勿修改、删除
   * Summary: 自动化测试创建test1
   */
  async bindAaaBbbCcc(request: BindAaaBbbCccRequest): Promise<BindAaaBbbCccResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindAaaBbbCccEx(request, headers, runtime);
  }

  /**
   * Description: 自动化测试创建test，请勿修改、删除
   * Summary: 自动化测试创建test1
   */
  async bindAaaBbbCccEx(request: BindAaaBbbCccRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindAaaBbbCccResponse> {
    Util.validateModel(request);
    return $tea.cast<BindAaaBbbCccResponse>(await this.doRequest("1.0", "demo.aaa.bbb.ccc.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindAaaBbbCccResponse({}));
  }

  /**
   * Description: 自动化测试创建111
   * Summary: 自动化测试创建（勿动）
   */
  async queryAaaBbbCcc(request: QueryAaaBbbCccRequest): Promise<QueryAaaBbbCccResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAaaBbbCccEx(request, headers, runtime);
  }

  /**
   * Description: 自动化测试创建111
   * Summary: 自动化测试创建（勿动）
   */
  async queryAaaBbbCccEx(request: QueryAaaBbbCccRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAaaBbbCccResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAaaBbbCccResponse>(await this.doRequest("1.0", "demo.aaa.bbb.ccc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAaaBbbCccResponse({}));
  }

  /**
   * Description: 自动化测试创建,用于测试API的修改
   * Summary: 自动化测试创建,用于测试API的修改勿动
   */
  async queryAbcAbcAbc(request: QueryAbcAbcAbcRequest): Promise<QueryAbcAbcAbcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAbcAbcAbcEx(request, headers, runtime);
  }

  /**
   * Description: 自动化测试创建,用于测试API的修改
   * Summary: 自动化测试创建,用于测试API的修改勿动
   */
  async queryAbcAbcAbcEx(request: QueryAbcAbcAbcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAbcAbcAbcResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAbcAbcAbcResponse>(await this.doRequest("1.0", "demo.abc.abc.abc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAbcAbcAbcResponse({}));
  }

  /**
   * Description: 123
   * Summary: 123
   */
  async bindAaaBbbCcd(request: BindAaaBbbCcdRequest): Promise<BindAaaBbbCcdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindAaaBbbCcdEx(request, headers, runtime);
  }

  /**
   * Description: 123
   * Summary: 123
   */
  async bindAaaBbbCcdEx(request: BindAaaBbbCcdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindAaaBbbCcdResponse> {
    Util.validateModel(request);
    return $tea.cast<BindAaaBbbCcdResponse>(await this.doRequest("1.0", "demo.aaa.bbb.ccd.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindAaaBbbCcdResponse({}));
  }

  /**
   * Description: 测试
   * Summary: test
   */
  async queryAutoTest(request: QueryAutoTestRequest): Promise<QueryAutoTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAutoTestEx(request, headers, runtime);
  }

  /**
   * Description: 测试
   * Summary: test
   */
  async queryAutoTestEx(request: QueryAutoTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAutoTestResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAutoTestResponse>(await this.doRequest("1.0", "demo.auto.test.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAutoTestResponse({}));
  }

  /**
   * Description: 创建HTTP PUT提交的文件上传
   * Summary: 文件上传创建
   */
  async createAntcloudGatewayxFileUpload(request: CreateAntcloudGatewayxFileUploadRequest): Promise<CreateAntcloudGatewayxFileUploadResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAntcloudGatewayxFileUploadEx(request, headers, runtime);
  }

  /**
   * Description: 创建HTTP PUT提交的文件上传
   * Summary: 文件上传创建
   */
  async createAntcloudGatewayxFileUploadEx(request: CreateAntcloudGatewayxFileUploadRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAntcloudGatewayxFileUploadResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAntcloudGatewayxFileUploadResponse>(await this.doRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAntcloudGatewayxFileUploadResponse({}));
  }

}
