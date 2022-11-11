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

// Demo类
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

// testAAAA
export class TestClass extends $tea.Model {
  // 1
  test: string;
  // 2
  demo: string;
  // 3
  demo1: string;
  static names(): { [key: string]: string } {
    return {
      test: 'test',
      demo: 'demo',
      demo1: 'demo1',
    };
  }

  static types(): { [key: string]: any } {
    return {
      test: 'string',
      demo: 'string',
      demo1: 'string',
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

export class BindQweQweRequest extends $tea.Model {
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

export class BindQweQweResponse extends $tea.Model {
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

export class BindSdfSssSssRequest extends $tea.Model {
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

export class BindSdfSssSssResponse extends $tea.Model {
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

export class QueryGatewayCheckRequest extends $tea.Model {
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

export class QueryGatewayCheckResponse extends $tea.Model {
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

export class QueryGatewayTestRequest extends $tea.Model {
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

export class QueryGatewayTestResponse extends $tea.Model {
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

export class BindSssSsSsRequest extends $tea.Model {
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

export class BindSssSsSsResponse extends $tea.Model {
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

export class QueryGatewayMyRequest extends $tea.Model {
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

export class BindDemoCheckEeeRequest extends $tea.Model {
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

export class BindDemoCheckEeeResponse extends $tea.Model {
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

export class BindGatewayAbcTestRequest extends $tea.Model {
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

export class BindGatewayAbcTestResponse extends $tea.Model {
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

export class BindTestTestTestRequest extends $tea.Model {
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

export class BindTestTestTestResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // test
  test?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      test: 'test',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      test: 'string',
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

export class BindAsdAsdRequest extends $tea.Model {
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

export class BindAsdAsdResponse extends $tea.Model {
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
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      var1: 'var1',
      var2: 'var2',
      subject: 'subject',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      var1: 'string',
      var2: 'string',
      subject: 'string',
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

export class QueryCjtestCjResRequest extends $tea.Model {
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

export class QueryCjtestCjResResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 字符串
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

export class ResetCjtestApiAuthorizeRequest extends $tea.Model {
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

export class ResetCjtestApiAuthorizeResponse extends $tea.Model {
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
  // 请求时间
  time: string;
  // 操作人
  operator: string;
  // 请求编号
  count: number;
  // 请求描述
  desc?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      time: 'time',
      operator: 'operator',
      count: 'count',
      desc: 'desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      time: 'string',
      operator: 'string',
      count: 'number',
      desc: 'string',
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
  // 更新后信息
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
  // 查询内容
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
  // 查询结果
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
  // 请求执行编号
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
  // 返回用户请求编号+1
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

export class BindAsdAsdAsdRequest extends $tea.Model {
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

export class BindAsdAsdAsdResponse extends $tea.Model {
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

export class QueryTestAaaBbbRequest extends $tea.Model {
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

export class QueryTestAaaBbbResponse extends $tea.Model {
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
  burieds?: QueryMap;
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

export class QueryTestTestobjectBbbRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 测试入参
  requestParam1: string;
  // 测试入参2
  requestParam2: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      requestParam1: 'request_param1',
      requestParam2: 'request_param2',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      requestParam1: 'string',
      requestParam2: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTestTestobjectBbbResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 测试返回参数
  response?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      response: 'response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      response: 'string',
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

export class QueryGongxiangTestDemoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 验证字符
  character1: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      character1: 'character1',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      character1: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGongxiangTestDemoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // aaaaaa
  character1?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      character1: 'character1',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      character1: 'string',
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

export class BindGongxaingTestRequest extends $tea.Model {
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

export class BindGongxaingTestResponse extends $tea.Model {
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

export class QueryMasterstationMasterdataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户工号
  workno: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      workno: 'workno',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      workno: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMasterstationMasterdataResponse extends $tea.Model {
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

export class ResetComCnCcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // orderid
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

export class ResetComCnCcResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单id
  orderId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportComCnTestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 1
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

export class ImportComCnTestResponse extends $tea.Model {
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
          sdk_version: "1.0.120",
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
   * Description: 123
   * Summary: 123
   */
  async bindQweQwe(request: BindQweQweRequest): Promise<BindQweQweResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindQweQweEx(request, headers, runtime);
  }

  /**
   * Description: 123
   * Summary: 123
   */
  async bindQweQweEx(request: BindQweQweRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindQweQweResponse> {
    Util.validateModel(request);
    return $tea.cast<BindQweQweResponse>(await this.doRequest("1.0", "demo.qwe.qwe.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindQweQweResponse({}));
  }

  /**
   * Description: sdf
   * Summary: sdf
   */
  async bindSdfSssSss(request: BindSdfSssSssRequest): Promise<BindSdfSssSssResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindSdfSssSssEx(request, headers, runtime);
  }

  /**
   * Description: sdf
   * Summary: sdf
   */
  async bindSdfSssSssEx(request: BindSdfSssSssRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindSdfSssSssResponse> {
    Util.validateModel(request);
    return $tea.cast<BindSdfSssSssResponse>(await this.doRequest("1.0", "demo.sdf.sss.sss.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindSdfSssSssResponse({}));
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
   * Description: Demo接口，返回当输入的值
  测试下
   * Summary: 返回输入值
   */
  async echoGatewayCheck(request: EchoGatewayCheckRequest): Promise<EchoGatewayCheckResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.echoGatewayCheckEx(request, headers, runtime);
  }

  /**
   * Description: Demo接口，返回当输入的值
  测试下
   * Summary: 返回输入值
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
   * Description: ceshi
   * Summary: ss
   */
  async queryGatewayCheck(request: QueryGatewayCheckRequest): Promise<QueryGatewayCheckResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGatewayCheckEx(request, headers, runtime);
  }

  /**
   * Description: ceshi
   * Summary: ss
   */
  async queryGatewayCheckEx(request: QueryGatewayCheckRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGatewayCheckResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGatewayCheckResponse>(await this.doRequest("1.0", "demo.gateway.check.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGatewayCheckResponse({}));
  }

  /**
   * Description: 测试用aaa
   * Summary: 测试001
   */
  async queryGatewayTest(request: QueryGatewayTestRequest): Promise<QueryGatewayTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGatewayTestEx(request, headers, runtime);
  }

  /**
   * Description: 测试用aaa
   * Summary: 测试001
   */
  async queryGatewayTestEx(request: QueryGatewayTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGatewayTestResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGatewayTestResponse>(await this.doRequest("1.0", "demo.gateway.test.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGatewayTestResponse({}));
  }

  /**
   * Description: sss
   * Summary: ss
   */
  async bindSssSsSs(request: BindSssSsSsRequest): Promise<BindSssSsSsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindSssSsSsEx(request, headers, runtime);
  }

  /**
   * Description: sss
   * Summary: ss
   */
  async bindSssSsSsEx(request: BindSssSsSsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindSssSsSsResponse> {
    Util.validateModel(request);
    return $tea.cast<BindSssSsSsResponse>(await this.doRequest("1.0", "demo.sss.ss.ss.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindSssSsSsResponse({}));
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
   * Description: s
   * Summary: ss
   */
  async bindDemoCheckEee(request: BindDemoCheckEeeRequest): Promise<BindDemoCheckEeeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindDemoCheckEeeEx(request, headers, runtime);
  }

  /**
   * Description: s
   * Summary: ss
   */
  async bindDemoCheckEeeEx(request: BindDemoCheckEeeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindDemoCheckEeeResponse> {
    Util.validateModel(request);
    return $tea.cast<BindDemoCheckEeeResponse>(await this.doRequest("1.0", "demo.demo.check.eee.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindDemoCheckEeeResponse({}));
  }

  /**
   * Description: test
   * Summary: test
   */
  async bindGatewayAbcTest(request: BindGatewayAbcTestRequest): Promise<BindGatewayAbcTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindGatewayAbcTestEx(request, headers, runtime);
  }

  /**
   * Description: test
   * Summary: test
   */
  async bindGatewayAbcTestEx(request: BindGatewayAbcTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindGatewayAbcTestResponse> {
    Util.validateModel(request);
    return $tea.cast<BindGatewayAbcTestResponse>(await this.doRequest("1.0", "demo.gateway.abc.test.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindGatewayAbcTestResponse({}));
  }

  /**
   * Description: testaaa
   * Summary: test
   */
  async bindTestTestTest(request: BindTestTestTestRequest): Promise<BindTestTestTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindTestTestTestEx(request, headers, runtime);
  }

  /**
   * Description: testaaa
   * Summary: test
   */
  async bindTestTestTestEx(request: BindTestTestTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindTestTestTestResponse> {
    Util.validateModel(request);
    return $tea.cast<BindTestTestTestResponse>(await this.doRequest("1.0", "demo.test.test.test.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindTestTestTestResponse({}));
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
   * Description: asd
   * Summary: asd1
   */
  async queryAdAsdAsd(request: QueryAdAsdAsdRequest): Promise<QueryAdAsdAsdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAdAsdAsdEx(request, headers, runtime);
  }

  /**
   * Description: asd
   * Summary: asd1
   */
  async queryAdAsdAsdEx(request: QueryAdAsdAsdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAdAsdAsdResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAdAsdAsdResponse>(await this.doRequest("1.0", "demo.ad.asd.asd.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAdAsdAsdResponse({}));
  }

  /**
   * Description: 1·2
   * Summary: 测试
   */
  async bindAsdAsd(request: BindAsdAsdRequest): Promise<BindAsdAsdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindAsdAsdEx(request, headers, runtime);
  }

  /**
   * Description: 1·2
   * Summary: 测试
   */
  async bindAsdAsdEx(request: BindAsdAsdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindAsdAsdResponse> {
    Util.validateModel(request);
    return $tea.cast<BindAsdAsdResponse>(await this.doRequest("1.0", "demo.asd.asd.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindAsdAsdResponse({}));
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
   * Description: 文件测试
   * Summary: 文件测试
   */
  async uploadCjtestSourceFile(request: UploadCjtestSourceFileRequest): Promise<UploadCjtestSourceFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadCjtestSourceFileEx(request, headers, runtime);
  }

  /**
   * Description: 文件测试
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
   * Description: 测试返回值限制
   * Summary: dev测试返回值限制
   */
  async queryCjtestCjRes(request: QueryCjtestCjResRequest): Promise<QueryCjtestCjResResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCjtestCjResEx(request, headers, runtime);
  }

  /**
   * Description: 测试返回值限制
   * Summary: dev测试返回值限制
   */
  async queryCjtestCjResEx(request: QueryCjtestCjResRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCjtestCjResResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCjtestCjResResponse>(await this.doRequest("1.0", "demo.cjtest.cj.res.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCjtestCjResResponse({}));
  }

  /**
   * Description: test
   * Summary: test
   */
  async resetCjtestApiAuthorize(request: ResetCjtestApiAuthorizeRequest): Promise<ResetCjtestApiAuthorizeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.resetCjtestApiAuthorizeEx(request, headers, runtime);
  }

  /**
   * Description: test
   * Summary: test
   */
  async resetCjtestApiAuthorizeEx(request: ResetCjtestApiAuthorizeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ResetCjtestApiAuthorizeResponse> {
    Util.validateModel(request);
    return $tea.cast<ResetCjtestApiAuthorizeResponse>(await this.doRequest("1.0", "demo.cjtest.api.authorize.reset", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ResetCjtestApiAuthorizeResponse({}));
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
   * Description: 修改入参msg后返回，Fr 自动化连通性测试。
   * Summary: road.upd（Fr AutoT）
   */
  async updateGatewayRoad(request: UpdateGatewayRoadRequest): Promise<UpdateGatewayRoadResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateGatewayRoadEx(request, headers, runtime);
  }

  /**
   * Description: 修改入参msg后返回，Fr 自动化连通性测试。
   * Summary: road.upd（Fr AutoT）
   */
  async updateGatewayRoadEx(request: UpdateGatewayRoadRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateGatewayRoadResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateGatewayRoadResponse>(await this.doRequest("1.0", "demo.gateway.road.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateGatewayRoadResponse({}));
  }

  /**
   * Description: 简单查询处理，Fr 自动化连通性测试。
   * Summary: road.query（Fr AutoT）
   */
  async queryGatewayRoad(request: QueryGatewayRoadRequest): Promise<QueryGatewayRoadResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGatewayRoadEx(request, headers, runtime);
  }

  /**
   * Description: 简单查询处理，Fr 自动化连通性测试。
   * Summary: road.query（Fr AutoT）
   */
  async queryGatewayRoadEx(request: QueryGatewayRoadRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGatewayRoadResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGatewayRoadResponse>(await this.doRequest("1.0", "demo.gateway.road.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGatewayRoadResponse({}));
  }

  /**
   * Description: 简单执行返回处理结果，Fr 自动化连通性测试。
   * Summary: road.exec（Fr AutoT）
   */
  async execGatewayRoad(request: ExecGatewayRoadRequest): Promise<ExecGatewayRoadResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execGatewayRoadEx(request, headers, runtime);
  }

  /**
   * Description: 简单执行返回处理结果，Fr 自动化连通性测试。
   * Summary: road.exec（Fr AutoT）
   */
  async execGatewayRoadEx(request: ExecGatewayRoadRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecGatewayRoadResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecGatewayRoadResponse>(await this.doRequest("1.0", "demo.gateway.road.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecGatewayRoadResponse({}));
  }

  /**
   * Description: asd
   * Summary: asd
   */
  async bindAsdAsdAsd(request: BindAsdAsdAsdRequest): Promise<BindAsdAsdAsdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindAsdAsdAsdEx(request, headers, runtime);
  }

  /**
   * Description: asd
   * Summary: asd
   */
  async bindAsdAsdAsdEx(request: BindAsdAsdAsdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindAsdAsdAsdResponse> {
    Util.validateModel(request);
    return $tea.cast<BindAsdAsdAsdResponse>(await this.doRequest("1.0", "demo.asd.asd.asd.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindAsdAsdAsdResponse({}));
  }

  /**
   * Description: 共享能力主链路回归验证
   * Summary: 共享能力回归验证
   */
  async queryTestAaaBbb(request: QueryTestAaaBbbRequest): Promise<QueryTestAaaBbbResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTestAaaBbbEx(request, headers, runtime);
  }

  /**
   * Description: 共享能力主链路回归验证
   * Summary: 共享能力回归验证
   */
  async queryTestAaaBbbEx(request: QueryTestAaaBbbRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTestAaaBbbResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTestAaaBbbResponse>(await this.doRequest("1.0", "demo.test.aaa.bbb.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTestAaaBbbResponse({}));
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
   * Description: 测试添加api
   * Summary: 测试用api
   */
  async queryTestTestobjectBbb(request: QueryTestTestobjectBbbRequest): Promise<QueryTestTestobjectBbbResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTestTestobjectBbbEx(request, headers, runtime);
  }

  /**
   * Description: 测试添加api
   * Summary: 测试用api
   */
  async queryTestTestobjectBbbEx(request: QueryTestTestobjectBbbRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTestTestobjectBbbResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTestTestobjectBbbResponse>(await this.doRequest("1.0", "demo.test.testobject.bbb.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTestTestobjectBbbResponse({}));
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
   * Description: 共享能力中心六期回归验证创建使用
   * Summary: 共享能力中心六期回归验证创建
   */
  async queryGongxiangTestDemo(request: QueryGongxiangTestDemoRequest): Promise<QueryGongxiangTestDemoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGongxiangTestDemoEx(request, headers, runtime);
  }

  /**
   * Description: 共享能力中心六期回归验证创建使用
   * Summary: 共享能力中心六期回归验证创建
   */
  async queryGongxiangTestDemoEx(request: QueryGongxiangTestDemoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGongxiangTestDemoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGongxiangTestDemoResponse>(await this.doRequest("1.0", "demo.gongxiang.test.demo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGongxiangTestDemoResponse({}));
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
   * Description: 共享能力六期回归验证
   * Summary: 共享能力六期回归验证
   */
  async bindGongxaingTest(request: BindGongxaingTestRequest): Promise<BindGongxaingTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindGongxaingTestEx(request, headers, runtime);
  }

  /**
   * Description: 共享能力六期回归验证
   * Summary: 共享能力六期回归验证
   */
  async bindGongxaingTestEx(request: BindGongxaingTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindGongxaingTestResponse> {
    Util.validateModel(request);
    return $tea.cast<BindGongxaingTestResponse>(await this.doRequest("1.0", "demo.gongxaing.test.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindGongxaingTestResponse({}));
  }

  /**
   * Description: 自动化测试创建
   * Summary: 自动化测试创建1
   */
  async bindAaaBbbCcc(request: BindAaaBbbCccRequest): Promise<BindAaaBbbCccResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindAaaBbbCccEx(request, headers, runtime);
  }

  /**
   * Description: 自动化测试创建
   * Summary: 自动化测试创建1
   */
  async bindAaaBbbCccEx(request: BindAaaBbbCccRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindAaaBbbCccResponse> {
    Util.validateModel(request);
    return $tea.cast<BindAaaBbbCccResponse>(await this.doRequest("1.0", "demo.aaa.bbb.ccc.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindAaaBbbCccResponse({}));
  }

  /**
   * Description: 查询主数据
   * Summary: 查询主数据
   */
  async queryMasterstationMasterdata(request: QueryMasterstationMasterdataRequest): Promise<QueryMasterstationMasterdataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMasterstationMasterdataEx(request, headers, runtime);
  }

  /**
   * Description: 查询主数据
   * Summary: 查询主数据
   */
  async queryMasterstationMasterdataEx(request: QueryMasterstationMasterdataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMasterstationMasterdataResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMasterstationMasterdataResponse>(await this.doRequest("1.0", "demo.masterstation.masterdata.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMasterstationMasterdataResponse({}));
  }

  /**
   * Description: 自动化测试创建1
   * Summary: 自动化测试创建（勿动）
   */
  async queryAaaBbbCcc(request: QueryAaaBbbCccRequest): Promise<QueryAaaBbbCccResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAaaBbbCccEx(request, headers, runtime);
  }

  /**
   * Description: 自动化测试创建1
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
   * Description: 测试api描述
   * Summary: api简介
   */
  async resetComCnCc(request: ResetComCnCcRequest): Promise<ResetComCnCcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.resetComCnCcEx(request, headers, runtime);
  }

  /**
   * Description: 测试api描述
   * Summary: api简介
   */
  async resetComCnCcEx(request: ResetComCnCcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ResetComCnCcResponse> {
    Util.validateModel(request);
    return $tea.cast<ResetComCnCcResponse>(await this.doRequest("1.0", "demo.com.cn.cc.reset", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ResetComCnCcResponse({}));
  }

  /**
   * Description: 1
   * Summary: api简介
   */
  async importComCnTest(request: ImportComCnTestRequest): Promise<ImportComCnTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importComCnTestEx(request, headers, runtime);
  }

  /**
   * Description: 1
   * Summary: api简介
   */
  async importComCnTestEx(request: ImportComCnTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportComCnTestResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "demo.com.cn.test.import",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "OK")) {
        let importComCnTestResponse = new ImportComCnTestResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return importComCnTestResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
    }

    Util.validateModel(request);
    return $tea.cast<ImportComCnTestResponse>(await this.doRequest("1.0", "demo.com.cn.test.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportComCnTestResponse({}));
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
