// This file is auto-generated, don't edit it
import AntchainUtil from '@antchain/alipay-util';
import Util, * as $Util from '@alicloud/tea-util';
import RPCUtil from '@alicloud/rpc-util';
import { Readable } from 'stream';
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

// ceshi
export class DemoClass extends $tea.Model {
  // some_string
  /**
   * @example
   * some_string
   */
  someString: string;
  // some_date
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  someDate: string;
  // some_boolean
  /**
   * @example
   * true
   */
  someBoolean: boolean;
  // some_int
  /**
   * @example
   * 1
   */
  someInt: number;
  // some_list
  /**
   * @example
   * some_list
   */
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

// 添加使用
export class AddUse extends $tea.Model {
  // a
  /**
   * @example
   * a
   */
  a: string;
  // b
  /**
   * @example
   * b
   */
  b: string;
  // c
  /**
   * @example
   * c
   */
  c: string;
  // d
  /**
   * @example
   * d
   */
  d: string;
  static names(): { [key: string]: string } {
    return {
      a: 'a',
      b: 'b',
      c: 'c',
      d: 'd',
    };
  }

  static types(): { [key: string]: any } {
    return {
      a: 'string',
      b: 'string',
      c: 'string',
      d: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// w
export class W extends $tea.Model {
  // a
  /**
   * @example
   * a
   */
  a: string;
  // b
  /**
   * @example
   * b
   */
  b: string;
  // c
  /**
   * @example
   * c
   */
  c: string;
  static names(): { [key: string]: string } {
    return {
      a: 'a',
      b: 'b',
      c: 'c',
    };
  }

  static types(): { [key: string]: any } {
    return {
      a: 'string',
      b: 'string',
      c: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// S
export class S extends $tea.Model {
  // a
  /**
   * @example
   * a
   */
  a: string;
  // b
  /**
   * @example
   * b
   */
  b: string;
  // c
  /**
   * @example
   * c
   */
  c: string;
  static names(): { [key: string]: string } {
    return {
      a: 'a',
      b: 'b',
      c: 'c',
    };
  }

  static types(): { [key: string]: any } {
    return {
      a: 'string',
      b: 'string',
      c: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// b
export class B extends $tea.Model {
  // q
  /**
   * @example
   * q
   */
  q: string;
  // w
  /**
   * @example
   * w
   */
  w: string;
  // e
  /**
   * @example
   * e
   */
  e: string;
  static names(): { [key: string]: string } {
    return {
      q: 'q',
      w: 'w',
      e: 'e',
    };
  }

  static types(): { [key: string]: any } {
    return {
      q: 'string',
      w: 'string',
      e: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 1
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
  y: string;
  // z
  /**
   * @example
   * undefined
   */
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
      y: 'string',
      z: { 'type': 'array', 'itemType': DemoClass },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 同步测试
export class AddStruct extends $tea.Model {
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
  y: string;
  // z
  /**
   * @example
   * undefined
   */
  z: AddUse[];
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
      y: 'string',
      z: { 'type': 'array', 'itemType': AddUse },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// q
export class D extends $tea.Model {
  // a
  /**
   * @example
   * a
   */
  a: string;
  // s
  /**
   * @example
   * undefined
   */
  b: S[];
  static names(): { [key: string]: string } {
    return {
      a: 'a',
      b: 'b',
    };
  }

  static types(): { [key: string]: any } {
    return {
      a: 'string',
      b: { 'type': 'array', 'itemType': S },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 测试结构体
export class TestNew extends $tea.Model {
  // 12
  /**
   * @example
   * 张三
   */
  name?: string;
  // 1
  /**
   * @example
   * 1
   */
  number?: number;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      number: 'number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      number: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// q
export class Q extends $tea.Model {
  // q
  /**
   * @example
   * q
   */
  q: string;
  // w
  /**
   * @example
   * undefined
   */
  w: W[];
  static names(): { [key: string]: string } {
    return {
      q: 'q',
      w: 'w',
    };
  }

  static types(): { [key: string]: any } {
    return {
      q: 'string',
      w: { 'type': 'array', 'itemType': W },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 1
export class A extends $tea.Model {
  // a
  /**
   * @example
   * a
   */
  a: string;
  // b
  /**
   * @example
   * undefined
   */
  b: B[];
  static names(): { [key: string]: string } {
    return {
      a: 'a',
      b: 'b',
    };
  }

  static types(): { [key: string]: any } {
    return {
      a: 'string',
      b: { 'type': 'array', 'itemType': B },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ceshi
export class InitPacks extends $tea.Model {
  // 返回接收到请求的当前时间
  // 
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  time: string;
  // 1
  /**
   * @example
   * 张三
   */
  operator: string;
  // 1
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

// 键值对
export class XNameValuePair extends $tea.Model {
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

export class ApiCreateFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // string
  /**
   * @remarks
   * 待上传文件
   */
  fileObject?: Readable;
  /**
   * @remarks
   * 待上传文件名
   */
  fileObjectName?: string;
  fileId: string;
  // 1
  inputInt: number;
  // 文件名
  fileName: string;
  // input_array
  inputArray: TestStruct[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      inputInt: 'input_int',
      fileName: 'file_name',
      inputArray: 'input_array',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      inputInt: 'number',
      fileName: 'string',
      inputArray: { 'type': 'array', 'itemType': TestStruct },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApiCreateFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // output_string
  outputString?: string;
  // file_url
  fileUrl?: string;
  // output_demo
  outputDemo?: DemoClass;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      outputString: 'output_string',
      fileUrl: 'file_url',
      outputDemo: 'output_demo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      outputString: 'string',
      fileUrl: 'string',
      outputDemo: DemoClass,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class TestAddStructRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // ceshi 
  structparam: AddStruct[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      structparam: 'structparam',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      structparam: { 'type': 'array', 'itemType': AddStruct },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class TestAddStructResponse extends $tea.Model {
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

export class ADemoTestRequest extends $tea.Model {
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

export class ADemoTestResponse extends $tea.Model {
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

export class BDemoTestRequest extends $tea.Model {
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

export class BDemoTestResponse extends $tea.Model {
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

export class CDemoTestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // a
  a: A[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      a: 'a',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      a: { 'type': 'array', 'itemType': A },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CDemoTestResponse extends $tea.Model {
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

export class QQQRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // test
  struct: Q[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      struct: 'struct',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      struct: { 'type': 'array', 'itemType': Q },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QQQResponse extends $tea.Model {
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

export class ZzZZRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 1
  qwer: D;
  // z
  z: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      qwer: 'qwer',
      z: 'z',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      qwer: D,
      z: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ZzZZResponse extends $tea.Model {
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

export class ApiPreAcceptanceRequest extends $tea.Model {
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

export class ApiPreAcceptanceResponse extends $tea.Model {
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

export class AaaPreTestApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 编号
  count: number;
  // 1
  time: string;
  // 1
  desc: string;
  // 1
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

export class AaaPreTestApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 1
  initDesc?: string;
  // 组合返回请求结果
  initPack?: InitPacks;
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
      initPack: InitPacks,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 测试用
  name?: DemoClass;
  // 1
  test?: string;
  // 12
  testNew?: TestNew;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      test: 'test',
      testNew: 'test_new',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: DemoClass,
      test: 'string',
      testNew: TestNew,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 记录id
  id?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      id: 'string',
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
          sdk_version: "1.0.6",
          _prod_code: "TESTJZQ",
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
   * Description: 测试使用
   * Summary: 测试使用
   */
  async apiCreateFile(request: ApiCreateFileRequest): Promise<ApiCreateFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.apiCreateFileEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试使用
   * Summary: 测试使用
   */
  async apiCreateFileEx(request: ApiCreateFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApiCreateFileResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antdigital.testjzq.create.file.api",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let apiCreateFileResponse = new ApiCreateFileResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return apiCreateFileResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<ApiCreateFileResponse>(await this.doRequest("1.0", "antdigital.testjzq.create.file.api", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApiCreateFileResponse({}));
  }

  /**
   * @remarks
   * Description: 测试结构体的部署同步
   * Summary: 测试结构体的部署同步
   */
  async testAddStruct(request: TestAddStructRequest): Promise<TestAddStructResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.testAddStructEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试结构体的部署同步
   * Summary: 测试结构体的部署同步
   */
  async testAddStructEx(request: TestAddStructRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<TestAddStructResponse> {
    Util.validateModel(request);
    return $tea.cast<TestAddStructResponse>(await this.doRequest("1.0", "antdigital.testjzq.add.struct.test", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new TestAddStructResponse({}));
  }

  /**
   * @remarks
   * Description: 111
   * Summary: 111
   */
  async aDemoTest(request: ADemoTestRequest): Promise<ADemoTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.aDemoTestEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 111
   * Summary: 111
   */
  async aDemoTestEx(request: ADemoTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ADemoTestResponse> {
    Util.validateModel(request);
    return $tea.cast<ADemoTestResponse>(await this.doRequest("1.0", "antdigital.testjzq.demo.test.a", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ADemoTestResponse({}));
  }

  /**
   * @remarks
   * Description: 111
   * Summary: 111
   */
  async bDemoTest(request: BDemoTestRequest): Promise<BDemoTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bDemoTestEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 111
   * Summary: 111
   */
  async bDemoTestEx(request: BDemoTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BDemoTestResponse> {
    Util.validateModel(request);
    return $tea.cast<BDemoTestResponse>(await this.doRequest("1.0", "antdigital.testjzq.demo.test.b", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BDemoTestResponse({}));
  }

  /**
   * @remarks
   * Description: ccccc
   * Summary: ccccc
   */
  async cDemoTest(request: CDemoTestRequest): Promise<CDemoTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cDemoTestEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: ccccc
   * Summary: ccccc
   */
  async cDemoTestEx(request: CDemoTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CDemoTestResponse> {
    Util.validateModel(request);
    return $tea.cast<CDemoTestResponse>(await this.doRequest("1.0", "antdigital.testjzq.demo.test.c", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CDemoTestResponse({}));
  }

  /**
   * @remarks
   * Description: aaaaa
   * Summary: aaaaa
   */
  async qQQ(request: QQQRequest): Promise<QQQResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.qQQEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: aaaaa
   * Summary: aaaaa
   */
  async qQQEx(request: QQQRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QQQResponse> {
    Util.validateModel(request);
    return $tea.cast<QQQResponse>(await this.doRequest("1.0", "antdigital.testjzq.q.q.q", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QQQResponse({}));
  }

  /**
   * @remarks
   * Description: zzzzzzz
   * Summary: zzzzzzz
   */
  async zzZZ(request: ZzZZRequest): Promise<ZzZZResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.zzZZEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: zzzzzzz
   * Summary: zzzzzzz
   */
  async zzZZEx(request: ZzZZRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ZzZZResponse> {
    Util.validateModel(request);
    return $tea.cast<ZzZZResponse>(await this.doRequest("1.0", "antdigital.testjzq.z.z.zz", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ZzZZResponse({}));
  }

  /**
   * @remarks
   * Description: 预发验收创建api
   * Summary: 预发验收创建api
   */
  async apiPreAcceptance(request: ApiPreAcceptanceRequest): Promise<ApiPreAcceptanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.apiPreAcceptanceEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 预发验收创建api
   * Summary: 预发验收创建api
   */
  async apiPreAcceptanceEx(request: ApiPreAcceptanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApiPreAcceptanceResponse> {
    Util.validateModel(request);
    return $tea.cast<ApiPreAcceptanceResponse>(await this.doRequest("1.0", "antdigital.testjzq.pre.acceptance.api", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApiPreAcceptanceResponse({}));
  }

  /**
   * @remarks
   * Description: test
   * Summary: test
   */
  async aaaPreTestApi(request: AaaPreTestApiRequest): Promise<AaaPreTestApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.aaaPreTestApiEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: test
   * Summary: test
   */
  async aaaPreTestApiEx(request: AaaPreTestApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AaaPreTestApiResponse> {
    Util.validateModel(request);
    return $tea.cast<AaaPreTestApiResponse>(await this.doRequest("1.0", "antdigital.testjzq.pre.test.api.aaa", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AaaPreTestApiResponse({}));
  }

  /**
   * @remarks
   * Description: 测试流程使用
   * Summary: 测试流程使用
   */
  async querySs(request: QuerySsRequest): Promise<QuerySsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySsEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试流程使用
   * Summary: 测试流程使用
   */
  async querySsEx(request: QuerySsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySsResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySsResponse>(await this.doRequest("1.0", "antdigital.testjzq.ss.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySsResponse({}));
  }

  /**
   * @remarks
   * Description: 创建HTTP PUT提交的文件上传
   * Summary: 文件上传创建
   */
  async createAntcloudGatewayxFileUpload(request: CreateAntcloudGatewayxFileUploadRequest): Promise<CreateAntcloudGatewayxFileUploadResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAntcloudGatewayxFileUploadEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建HTTP PUT提交的文件上传
   * Summary: 文件上传创建
   */
  async createAntcloudGatewayxFileUploadEx(request: CreateAntcloudGatewayxFileUploadRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAntcloudGatewayxFileUploadResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAntcloudGatewayxFileUploadResponse>(await this.doRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAntcloudGatewayxFileUploadResponse({}));
  }

}
