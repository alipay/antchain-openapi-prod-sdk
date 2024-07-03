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
  // output_demo
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

export class UpdateCjtestCjRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 测试参数
  var1: string;
  // 测试参数2
  var2: string;
  // 被授权机构did
  subject?: string;
  // test
  var3: number;
  // 111
  var4: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      var1: 'var1',
      var2: 'var2',
      subject: 'subject',
      var3: 'var3',
      var4: 'var4',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      var1: 'string',
      var2: 'string',
      subject: 'string',
      var3: 'number',
      var4: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateCjtestCjResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 测试返回参数1
  return1?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      return1: 'return1',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      return1: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadCjtestSourceFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // file
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadCjtestSourceFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // test
  res?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      res: 'res',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      res: 'string',
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

export class InitCjtestAcopmResRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 111
  timeout: number;
  // 11111
  msg: string;
  // 111
  timeout111: string[];
  // 34134
  msg1111: AutoCodeModel;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      timeout: 'timeout',
      msg: 'msg',
      timeout111: 'timeout111',
      msg1111: 'msg1111',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      timeout: 'number',
      msg: 'string',
      timeout111: { 'type': 'array', 'itemType': 'string' },
      msg1111: AutoCodeModel,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitCjtestAcopmResResponse extends $tea.Model {
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
  timeout: number;
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
      timeout: 'number',
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

export class CreateAutoTestCodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 111
  stringParam1: string;
  // 222
  stringParam2?: string;
  // 111
  numberParam1: number;
  // 222
  numberParam2?: number;
  // 111
  boolParam1: boolean;
  // 222
  boolParam2?: boolean;
  // 111
  dateParam1: string;
  // 222
  dateParam2?: string;
  // 111
  arrayParam1: string[];
  // 222
  arrayParam2?: string[];
  // 111
  structParam1: AutoCodeModel;
  // 222
  structParam2?: AutoCodeModel;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      stringParam1: 'string_param_1',
      stringParam2: 'string_param_2',
      numberParam1: 'number_param_1',
      numberParam2: 'number_param_2',
      boolParam1: 'bool_param_1',
      boolParam2: 'bool_param_2',
      dateParam1: 'date_param_1',
      dateParam2: 'date_param_2',
      arrayParam1: 'array_param_1',
      arrayParam2: 'array_param_2',
      structParam1: 'struct_param_1',
      structParam2: 'struct_param_2',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      stringParam1: 'string',
      stringParam2: 'string',
      numberParam1: 'number',
      numberParam2: 'number',
      boolParam1: 'boolean',
      boolParam2: 'boolean',
      dateParam1: 'string',
      dateParam2: 'string',
      arrayParam1: { 'type': 'array', 'itemType': 'string' },
      arrayParam2: { 'type': 'array', 'itemType': 'string' },
      structParam1: AutoCodeModel,
      structParam2: AutoCodeModel,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAutoTestCodeResponse extends $tea.Model {
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

export class QueryDemoAbcAbcRequest extends $tea.Model {
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

export class QueryDemoAbcAbcResponse extends $tea.Model {
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

export class QueryXxxxTestxAaaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 1
  xvalue: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      xvalue: 'xvalue',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      xvalue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryXxxxTestxAaaResponse extends $tea.Model {
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

export class QueryTestTestaTestaRequest extends $tea.Model {
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

export class QueryTestTestaTestaResponse extends $tea.Model {
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

export class QueryBusinessTestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // jzq
  name: string;
  // 1
  count: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      count: 'count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      count: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBusinessTestResponse extends $tea.Model {
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

export class QueryBusinessCodeTestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 1
  code: number;
  // 1
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      code: 'code',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      code: 'number',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBusinessCodeTestResponse extends $tea.Model {
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

export class QueryDevelopTestUseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 入参1
  stringparameter: string;
  // 数字入参
  numberparameter: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      stringparameter: 'stringparameter',
      numberparameter: 'numberparameter',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      stringparameter: 'string',
      numberparameter: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDevelopTestUseResponse extends $tea.Model {
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

export class VerifyDevelopTestTestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 入参
  stringparameter: string;
  // number类型入参
  numberparameter: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      stringparameter: 'stringparameter',
      numberparameter: 'numberparameter',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      stringparameter: 'string',
      numberparameter: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyDevelopTestTestResponse extends $tea.Model {
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

export class ImportPreObWriteRequest extends $tea.Model {
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

export class ImportPreObWriteResponse extends $tea.Model {
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

export class InitBbpInsuranceUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 保司编码
  businessCode: string;
  // 第三方id，此处为天猫uid
  thirdPartId: string;
  // 来源渠道
  channel: string;
  // 埋点信息
  burieds: QueryMap;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      businessCode: 'business_code',
      thirdPartId: 'third_part_id',
      channel: 'channel',
      burieds: 'burieds',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      businessCode: 'string',
      thirdPartId: 'string',
      channel: 'string',
      burieds: QueryMap,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitBbpInsuranceUserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 123
  startDate?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      startDate: 'start_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      startDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateShanghaiPreTestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 参数1
  param1: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      param1: 'param1',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      param1: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateShanghaiPreTestResponse extends $tea.Model {
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

export class QueryCjtestCjResRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 1
  test1: number;
  // 2
  test2: number;
  // test
  test3: number[];
  // testclass
  testclass: Host;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      test1: 'test1',
      test2: 'test2',
      test3: 'test3',
      testclass: 'testclass',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      test1: 'number',
      test2: 'number',
      test3: { 'type': 'array', 'itemType': 'number' },
      testclass: Host,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCjtestCjResResponse extends $tea.Model {
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
  timeout: number;
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
      timeout: 'number',
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
  timeout: number;
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
      timeout: 'number',
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

export class QueryTestGatewayTestRequest extends $tea.Model {
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

export class QueryTestGatewayTestResponse extends $tea.Model {
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

export class QueryAcopmAtoWithholdRequest extends $tea.Model {
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

export class QueryAcopmAtoWithholdResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 协议生效时间
  validTime?: string;
  // 协议当前状态 1. UNSIGNED：未签约 2. SIG...
  // 
  status?: string;
  // 协议失效时间
  invalidTime?: string;
  // 协议签署时间
  signTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      validTime: 'valid_time',
      status: 'status',
      invalidTime: 'invalid_time',
      signTime: 'sign_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      validTime: 'string',
      status: 'string',
      invalidTime: 'string',
      signTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApdevcenterTestobjectTestsubRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // test
  test: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      test: 'test',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      test: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApdevcenterTestobjectTestsubResponse extends $tea.Model {
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

export class QueryApdevcenterTestobjectTestsubaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 主键
  id: number;
  // 名称
  name: string;
  // test
  test: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      name: 'name',
      test: 'test',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      name: 'string',
      test: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApdevcenterTestobjectTestsubaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 主键
  id?: number;
  // 名称
  name?: string;
  // 描述
  desc?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      id: 'id',
      name: 'name',
      desc: 'desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      id: 'number',
      name: 'string',
      desc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTestFilesystemFileinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 主键
  id: number;
  // 名称
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTestFilesystemFileinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 主键
  id?: number;
  // 名称
  name?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      id: 'id',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      id: 'number',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTestproductTestobjectTestsubaaaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // test
  id: number;
  // test
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTestproductTestobjectTestsubaaaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // test
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

export class RegisterTestBizeventMessageRequest extends $tea.Model {
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

export class RegisterTestBizeventMessageResponse extends $tea.Model {
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

export class CreateAutoGenerateCodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 必填参数
  string1: string;
  // 非必填参数
  string2?: string;
  // 长度限制2~5位
  string3: string;
  // 长度限制3~5位
  string4?: string;
  // 数值必填
  number1: number;
  // 数值非必填
  number2?: number;
  // 最小2，最大10
  number3: number;
  // 最小1，最大5
  number4?: number;
  // boolean必填
  boolean1: boolean;
  // boolean非必填
  boolean2?: boolean;
  // 必填日期
  date1: string;
  // 非必填日期
  date2: string;
  // 必填array
  array1: number[];
  // 非必填array
  array2?: number[];
  // 必填struct
  struct1: GroupAClass;
  // 非必填struct
  struct2: GroupAClass;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      string1: 'string_1',
      string2: 'string_2',
      string3: 'string_3',
      string4: 'string_4',
      number1: 'number_1',
      number2: 'number_2',
      number3: 'number_3',
      number4: 'number_4',
      boolean1: 'boolean_1',
      boolean2: 'boolean_2',
      date1: 'date_1',
      date2: 'date_2',
      array1: 'array_1',
      array2: 'array_2',
      struct1: 'struct_1',
      struct2: 'struct_2',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      string1: 'string',
      string2: 'string',
      string3: 'string',
      string4: 'string',
      number1: 'number',
      number2: 'number',
      number3: 'number',
      number4: 'number',
      boolean1: 'boolean',
      boolean2: 'boolean',
      date1: 'string',
      date2: 'string',
      array1: { 'type': 'array', 'itemType': 'number' },
      array2: { 'type': 'array', 'itemType': 'number' },
      struct1: GroupAClass,
      struct2: GroupAClass,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAutoGenerateCodeResponse extends $tea.Model {
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

export class QueryPreTestUseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 2
  struct1: PreTestUse;
  // 1
  param1: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      struct1: 'struct_1',
      param1: 'param_1',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      struct1: PreTestUse,
      param1: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPreTestUseResponse extends $tea.Model {
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
          sdk_version: "1.0.308",
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
   * Summary: 超时
   */
  async queryGatewayCheckEchotimeout(request: QueryGatewayCheckEchotimeoutRequest): Promise<QueryGatewayCheckEchotimeoutResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGatewayCheckEchotimeoutEx(request, headers, runtime);
  }

  /**
   * Description: 超时测试
   * Summary: 超时
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
   * Description: 测试网关评审能力
   * Summary: 评审测试
   */
  async updateCjtestCj(request: UpdateCjtestCjRequest): Promise<UpdateCjtestCjResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateCjtestCjEx(request, headers, runtime);
  }

  /**
   * Description: 测试网关评审能力
   * Summary: 评审测试
   */
  async updateCjtestCjEx(request: UpdateCjtestCjRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateCjtestCjResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateCjtestCjResponse>(await this.doRequest("1.0", "demo.cjtest.cj.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateCjtestCjResponse({}));
  }

  /**
   * Description: 文件测试1
   * Summary: 文件测试
   */
  async uploadCjtestSourceFile(request: UploadCjtestSourceFileRequest): Promise<UploadCjtestSourceFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadCjtestSourceFileEx(request, headers, runtime);
  }

  /**
   * Description: 文件测试1
   * Summary: 文件测试
   */
  async uploadCjtestSourceFileEx(request: UploadCjtestSourceFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadCjtestSourceFileResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "demo.cjtest.source.file.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "OK")) {
        let uploadCjtestSourceFileResponse = new UploadCjtestSourceFileResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadCjtestSourceFileResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
    }

    Util.validateModel(request);
    return $tea.cast<UploadCjtestSourceFileResponse>(await this.doRequest("1.0", "demo.cjtest.source.file.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadCjtestSourceFileResponse({}));
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
   * Description: cj test
   * Summary: cj test1
   */
  async initCjtestAcopmRes(request: InitCjtestAcopmResRequest): Promise<InitCjtestAcopmResResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initCjtestAcopmResEx(request, headers, runtime);
  }

  /**
   * Description: cj test
   * Summary: cj test1
   */
  async initCjtestAcopmResEx(request: InitCjtestAcopmResRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitCjtestAcopmResResponse> {
    Util.validateModel(request);
    return $tea.cast<InitCjtestAcopmResResponse>(await this.doRequest("1.0", "demo.cjtest.acopm.res.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitCjtestAcopmResResponse({}));
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
   * Description: 测试自动生成回归测试代码
   * Summary: 测试自动生成回归测试代码
   */
  async createAutoTestCode(request: CreateAutoTestCodeRequest): Promise<CreateAutoTestCodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAutoTestCodeEx(request, headers, runtime);
  }

  /**
   * Description: 测试自动生成回归测试代码
   * Summary: 测试自动生成回归测试代码
   */
  async createAutoTestCodeEx(request: CreateAutoTestCodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAutoTestCodeResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAutoTestCodeResponse>(await this.doRequest("1.0", "demo.auto.test.code.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAutoTestCodeResponse({}));
  }

  /**
   * Description: 123
   * Summary: 测试用api
   */
  async queryDemoAbcAbc(request: QueryDemoAbcAbcRequest): Promise<QueryDemoAbcAbcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDemoAbcAbcEx(request, headers, runtime);
  }

  /**
   * Description: 123
   * Summary: 测试用api
   */
  async queryDemoAbcAbcEx(request: QueryDemoAbcAbcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDemoAbcAbcResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDemoAbcAbcResponse>(await this.doRequest("1.0", "demo.demo.abc.abc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDemoAbcAbcResponse({}));
  }

  /**
   * Description: test
   * Summary: test
   */
  async queryXxxxTestxAaa(request: QueryXxxxTestxAaaRequest): Promise<QueryXxxxTestxAaaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryXxxxTestxAaaEx(request, headers, runtime);
  }

  /**
   * Description: test
   * Summary: test
   */
  async queryXxxxTestxAaaEx(request: QueryXxxxTestxAaaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryXxxxTestxAaaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryXxxxTestxAaaResponse>(await this.doRequest("1.0", "demo.xxxx.testx.aaa.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryXxxxTestxAaaResponse({}));
  }

  /**
   * Description: test
   * Summary: test
   */
  async queryTestTestaTesta(request: QueryTestTestaTestaRequest): Promise<QueryTestTestaTestaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTestTestaTestaEx(request, headers, runtime);
  }

  /**
   * Description: test
   * Summary: test
   */
  async queryTestTestaTestaEx(request: QueryTestTestaTestaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTestTestaTestaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTestTestaTestaResponse>(await this.doRequest("1.0", "demo.test.testa.testa.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTestTestaTestaResponse({}));
  }

  /**
   * Description: test
   * Summary: test
   */
  async queryInstanceidRule(request: QueryInstanceidRuleRequest): Promise<QueryInstanceidRuleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInstanceidRuleEx(request, headers, runtime);
  }

  /**
   * Description: test
   * Summary: test
   */
  async queryInstanceidRuleEx(request: QueryInstanceidRuleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInstanceidRuleResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInstanceidRuleResponse>(await this.doRequest("1.0", "demo.instanceid.rule.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInstanceidRuleResponse({}));
  }

  /**
   * Description: test
   * Summary: test
   */
  async queryBusinessTest(request: QueryBusinessTestRequest): Promise<QueryBusinessTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBusinessTestEx(request, headers, runtime);
  }

  /**
   * Description: test
   * Summary: test
   */
  async queryBusinessTestEx(request: QueryBusinessTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBusinessTestResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBusinessTestResponse>(await this.doRequest("1.0", "demo.business.test.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBusinessTestResponse({}));
  }

  /**
   * Description: 设置下游耗时
   * Summary: 超时（加密）
   */
  async queryGatewayCheckEchotimeoutok(request: QueryGatewayCheckEchotimeoutokRequest): Promise<QueryGatewayCheckEchotimeoutokResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGatewayCheckEchotimeoutokEx(request, headers, runtime);
  }

  /**
   * Description: 设置下游耗时
   * Summary: 超时（加密）
   */
  async queryGatewayCheckEchotimeoutokEx(request: QueryGatewayCheckEchotimeoutokRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGatewayCheckEchotimeoutokResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGatewayCheckEchotimeoutokResponse>(await this.doRequest("1.0", "demo.gateway.check.echotimeoutok.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGatewayCheckEchotimeoutokResponse({}));
  }

  /**
   * Description: 测试使用
   * Summary: testuse1
   */
  async queryBusinessCodeTest(request: QueryBusinessCodeTestRequest): Promise<QueryBusinessCodeTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBusinessCodeTestEx(request, headers, runtime);
  }

  /**
   * Description: 测试使用
   * Summary: testuse1
   */
  async queryBusinessCodeTestEx(request: QueryBusinessCodeTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBusinessCodeTestResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBusinessCodeTestResponse>(await this.doRequest("1.0", "demo.business.code.test.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBusinessCodeTestResponse({}));
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
   * Description: 研发自测使用API
   * Summary: 研发自测使用API
   */
  async queryDevelopTestUse(request: QueryDevelopTestUseRequest): Promise<QueryDevelopTestUseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDevelopTestUseEx(request, headers, runtime);
  }

  /**
   * Description: 研发自测使用API
   * Summary: 研发自测使用API
   */
  async queryDevelopTestUseEx(request: QueryDevelopTestUseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDevelopTestUseResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDevelopTestUseResponse>(await this.doRequest("1.0", "demo.develop.test.use.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDevelopTestUseResponse({}));
  }

  /**
   * Description: 资损防控研发自测使用API
   * Summary: 研发自测使用API
   */
  async verifyDevelopTestTest(request: VerifyDevelopTestTestRequest): Promise<VerifyDevelopTestTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyDevelopTestTestEx(request, headers, runtime);
  }

  /**
   * Description: 资损防控研发自测使用API
   * Summary: 研发自测使用API
   */
  async verifyDevelopTestTestEx(request: VerifyDevelopTestTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyDevelopTestTestResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyDevelopTestTestResponse>(await this.doRequest("1.0", "demo.develop.test.test.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyDevelopTestTestResponse({}));
  }

  /**
   * Description: 用于测试预发环境RDS切OB之后的同步功能
   * Summary: 预发RDS切OB测试
   */
  async importPreObWrite(request: ImportPreObWriteRequest): Promise<ImportPreObWriteResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importPreObWriteEx(request, headers, runtime);
  }

  /**
   * Description: 用于测试预发环境RDS切OB之后的同步功能
   * Summary: 预发RDS切OB测试
   */
  async importPreObWriteEx(request: ImportPreObWriteRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportPreObWriteResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportPreObWriteResponse>(await this.doRequest("1.0", "demo.pre.ob.write.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportPreObWriteResponse({}));
  }

  /**
   * Description: 保司用户埋点信息
   * Summary: 用户登陆页面埋点
   */
  async initBbpInsuranceUser(request: InitBbpInsuranceUserRequest): Promise<InitBbpInsuranceUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initBbpInsuranceUserEx(request, headers, runtime);
  }

  /**
   * Description: 保司用户埋点信息
   * Summary: 用户登陆页面埋点
   */
  async initBbpInsuranceUserEx(request: InitBbpInsuranceUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitBbpInsuranceUserResponse> {
    Util.validateModel(request);
    return $tea.cast<InitBbpInsuranceUserResponse>(await this.doRequest("1.0", "demo.bbp.insurance.user.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitBbpInsuranceUserResponse({}));
  }

  /**
   * Description: 用于上海非金生产环境的同步测试
   * Summary: 上海非金生产环境测试
   */
  async operateShanghaiPreTest(request: OperateShanghaiPreTestRequest): Promise<OperateShanghaiPreTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateShanghaiPreTestEx(request, headers, runtime);
  }

  /**
   * Description: 用于上海非金生产环境的同步测试
   * Summary: 上海非金生产环境测试
   */
  async operateShanghaiPreTestEx(request: OperateShanghaiPreTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateShanghaiPreTestResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateShanghaiPreTestResponse>(await this.doRequest("1.0", "demo.shanghai.pre.test.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateShanghaiPreTestResponse({}));
  }

  /**
   * Description: cj test
   * Summary: cj test1
   */
  async queryCjtestCjRes(request: QueryCjtestCjResRequest): Promise<QueryCjtestCjResResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCjtestCjResEx(request, headers, runtime);
  }

  /**
   * Description: cj test
   * Summary: cj test1
   */
  async queryCjtestCjResEx(request: QueryCjtestCjResRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCjtestCjResResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCjtestCjResResponse>(await this.doRequest("1.0", "demo.cjtest.cj.res.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCjtestCjResResponse({}));
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
   * Description: 测试使用1
   * Summary: 测试创建
   */
  async queryTestGatewayTest(request: QueryTestGatewayTestRequest): Promise<QueryTestGatewayTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTestGatewayTestEx(request, headers, runtime);
  }

  /**
   * Description: 测试使用1
   * Summary: 测试创建
   */
  async queryTestGatewayTestEx(request: QueryTestGatewayTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTestGatewayTestResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTestGatewayTestResponse>(await this.doRequest("1.0", "demo.test.gateway.test.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTestGatewayTestResponse({}));
  }

  /**
   * Description: 测试
   * Summary: 测试ato异常
   */
  async queryAcopmAtoWithhold(request: QueryAcopmAtoWithholdRequest): Promise<QueryAcopmAtoWithholdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAcopmAtoWithholdEx(request, headers, runtime);
  }

  /**
   * Description: 测试
   * Summary: 测试ato异常
   */
  async queryAcopmAtoWithholdEx(request: QueryAcopmAtoWithholdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAcopmAtoWithholdResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAcopmAtoWithholdResponse>(await this.doRequest("1.0", "demo.acopm.ato.withhold.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAcopmAtoWithholdResponse({}));
  }

  /**
   * Description: test
   * Summary: 新增API测试查询接口(只是测试使用)
   */
  async queryApdevcenterTestobjectTestsub(request: QueryApdevcenterTestobjectTestsubRequest): Promise<QueryApdevcenterTestobjectTestsubResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryApdevcenterTestobjectTestsubEx(request, headers, runtime);
  }

  /**
   * Description: test
   * Summary: 新增API测试查询接口(只是测试使用)
   */
  async queryApdevcenterTestobjectTestsubEx(request: QueryApdevcenterTestobjectTestsubRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryApdevcenterTestobjectTestsubResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryApdevcenterTestobjectTestsubResponse>(await this.doRequest("1.0", "demo.apdevcenter.testobject.testsub.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryApdevcenterTestobjectTestsubResponse({}));
  }

  /**
   * Description: testtest
   * Summary: 新增API测试查询接口(只是测试使用)
   */
  async queryApdevcenterTestobjectTestsuba(request: QueryApdevcenterTestobjectTestsubaRequest): Promise<QueryApdevcenterTestobjectTestsubaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryApdevcenterTestobjectTestsubaEx(request, headers, runtime);
  }

  /**
   * Description: testtest
   * Summary: 新增API测试查询接口(只是测试使用)
   */
  async queryApdevcenterTestobjectTestsubaEx(request: QueryApdevcenterTestobjectTestsubaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryApdevcenterTestobjectTestsubaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryApdevcenterTestobjectTestsubaResponse>(await this.doRequest("1.0", "demo.apdevcenter.testobject.testsuba.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryApdevcenterTestobjectTestsubaResponse({}));
  }

  /**
   * Description: test
   * Summary: 新增API测试查询接口(只是测试使用)
   */
  async queryTestFilesystemFileinfo(request: QueryTestFilesystemFileinfoRequest): Promise<QueryTestFilesystemFileinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTestFilesystemFileinfoEx(request, headers, runtime);
  }

  /**
   * Description: test
   * Summary: 新增API测试查询接口(只是测试使用)
   */
  async queryTestFilesystemFileinfoEx(request: QueryTestFilesystemFileinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTestFilesystemFileinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTestFilesystemFileinfoResponse>(await this.doRequest("1.0", "demo.test.filesystem.fileinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTestFilesystemFileinfoResponse({}));
  }

  /**
   * Description: test
   * Summary: 新增API测试查询接口(只是测试使用)
   */
  async queryTestproductTestobjectTestsubaaa(request: QueryTestproductTestobjectTestsubaaaRequest): Promise<QueryTestproductTestobjectTestsubaaaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTestproductTestobjectTestsubaaaEx(request, headers, runtime);
  }

  /**
   * Description: test
   * Summary: 新增API测试查询接口(只是测试使用)
   */
  async queryTestproductTestobjectTestsubaaaEx(request: QueryTestproductTestobjectTestsubaaaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTestproductTestobjectTestsubaaaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTestproductTestobjectTestsubaaaResponse>(await this.doRequest("1.0", "demo.testproduct.testobject.testsubaaa.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTestproductTestobjectTestsubaaaResponse({}));
  }

  /**
   * Description: 随机测试
   * Summary: 消息发送及消费
   */
  async registerTestBizeventMessage(request: RegisterTestBizeventMessageRequest): Promise<RegisterTestBizeventMessageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerTestBizeventMessageEx(request, headers, runtime);
  }

  /**
   * Description: 随机测试
   * Summary: 消息发送及消费
   */
  async registerTestBizeventMessageEx(request: RegisterTestBizeventMessageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterTestBizeventMessageResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterTestBizeventMessageResponse>(await this.doRequest("1.0", "demo.test.bizevent.message.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterTestBizeventMessageResponse({}));
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
   * Summary: 测试用api
   */
  async bindAaaBbbCcd(request: BindAaaBbbCcdRequest): Promise<BindAaaBbbCcdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindAaaBbbCcdEx(request, headers, runtime);
  }

  /**
   * Description: 123
   * Summary: 测试用api
   */
  async bindAaaBbbCcdEx(request: BindAaaBbbCcdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindAaaBbbCcdResponse> {
    Util.validateModel(request);
    return $tea.cast<BindAaaBbbCcdResponse>(await this.doRequest("1.0", "demo.aaa.bbb.ccd.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindAaaBbbCcdResponse({}));
  }

  /**
   * Description: 用于测试自动化脚本自动生成的功能
   * Summary: 自动生成自动化脚本测试
   */
  async createAutoGenerateCode(request: CreateAutoGenerateCodeRequest): Promise<CreateAutoGenerateCodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAutoGenerateCodeEx(request, headers, runtime);
  }

  /**
   * Description: 用于测试自动化脚本自动生成的功能
   * Summary: 自动生成自动化脚本测试
   */
  async createAutoGenerateCodeEx(request: CreateAutoGenerateCodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAutoGenerateCodeResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAutoGenerateCodeResponse>(await this.doRequest("1.0", "demo.auto.generate.code.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAutoGenerateCodeResponse({}));
  }

  /**
   * Description: 用于测试预发环境ob数据同步
   * Summary: 用于测试ob数据同步
   */
  async queryPreTestUse(request: QueryPreTestUseRequest): Promise<QueryPreTestUseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreTestUseEx(request, headers, runtime);
  }

  /**
   * Description: 用于测试预发环境ob数据同步
   * Summary: 用于测试ob数据同步
   */
  async queryPreTestUseEx(request: QueryPreTestUseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreTestUseResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreTestUseResponse>(await this.doRequest("1.0", "demo.pre.test.use.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreTestUseResponse({}));
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
