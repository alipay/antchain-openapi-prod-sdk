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

// 子结构体
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

// ABC示例结构体
export class AbcDemoStruct extends $tea.Model {
  // 字符串属性
  /**
   * @example
   * str
   */
  someString?: string;
  // Long型属性
  /**
   * @example
   * 100
   */
  someNumber: number;
  // 布尔型
  /**
   * @example
   * true, false
   */
  someBoolean: boolean;
  // ISO8601格式字符串：yyyy-MM-dd_T_HH:mm:ss_Z_
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  someDate?: string;
  // 字符串数组
  /**
   * @example
   * somestring
   */
  someStringList?: string[];
  // 子结构体
  /**
   * @example
   * { "name": "value" }
   */
  someStruct: SubDemoStruct;
  // 结构体数组
  /**
   * @example
   * [{"name": "value"}]
   */
  someStructList: SubDemoStruct[];
  static names(): { [key: string]: string } {
    return {
      someString: 'some_string',
      someNumber: 'some_number',
      someBoolean: 'some_boolean',
      someDate: 'some_date',
      someStringList: 'some_string_list',
      someStruct: 'some_struct',
      someStructList: 'some_struct_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      someString: 'string',
      someNumber: 'number',
      someBoolean: 'boolean',
      someDate: 'string',
      someStringList: { 'type': 'array', 'itemType': 'string' },
      someStruct: SubDemoStruct,
      someStructList: { 'type': 'array', 'itemType': SubDemoStruct },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// TestDemo
export class TestDemo extends $tea.Model {
  // id
  /**
   * @example
   * id
   */
  demo: string;
  static names(): { [key: string]: string } {
    return {
      demo: 'demo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      demo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 模拟大安全类型
export class FaceImage extends $tea.Model {
  // 1123
  /**
   * @example
   * 123
   */
  content?: string;
  // 123
  /**
   * @example
   * 123
   */
  rect: string;
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

// 结构体返回结构
export class ResultListDemo extends $tea.Model {
  // 返回结果码
  /**
   * @example
   * {"name":"value"}
   */
  code: AbcDemoStruct;
  // 返回结果
  /**
   * @example
   * {"name":{"key":"value"}}
   */
  data: AbcDemoStruct;
  // 返回信息
  /**
   * @example
   * {"message":"success"}
   */
  message: AbcDemoStruct;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      data: 'data',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: AbcDemoStruct,
      data: AbcDemoStruct,
      message: AbcDemoStruct,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 姓名和年龄
export class NameAndAge extends $tea.Model {
  // 姓名
  /**
   * @example
   * 张三
   */
  name?: string;
  // 年龄
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

// 共享能力六期接入rasp回归
export class GongXiangnengli extends $tea.Model {
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

// 初始参数
export class InitParks extends $tea.Model {
  // 返回接收到请求的当前时间
  /**
   * @example
   * 2024-11-03 14:00
   */
  time: string;
  // 操作人
  /**
   * @example
   * 姜泽琦
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

// 11
export class InitPark extends $tea.Model {
  // 1
  /**
   * @example
   * 1
   */
  demo: string;
  static names(): { [key: string]: string } {
    return {
      demo: 'demo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      demo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 初始
export class InitPack extends $tea.Model {
  // 请求时间
  /**
   * @example
   * 2018-10-10T10:10:00Z
   */
  time: string;
  // 请求人
  /**
   * @example
   * 张三
   */
  operate: string;
  // 编号
  /**
   * @example
   * 1
   */
  count: number;
  static names(): { [key: string]: string } {
    return {
      time: 'time',
      operate: 'operate',
      count: 'count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      time: 'string',
      operate: 'string',
      count: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 测试使用
export class TestPark extends $tea.Model {
  // 请求时间
  /**
   * @example
   * 2022-11-07 14:48
   */
  time: string;
  // 请求人
  /**
   * @example
   * 张三
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

// dev测试
export class DevTest extends $tea.Model {
  // 超时时间
  /**
   * @example
   * 200
   */
  timeout: string;
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

// Demo类1
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

// 返回结果测试类
export class ResultTest extends $tea.Model {
  // 姓名
  /**
   * @example
   * 张三
   */
  name?: string;
  // test
  /**
   * @example
   * undefined
   */
  list: DemoClass;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      list: DemoClass,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 返回结果测试类
export class ResultTests extends $tea.Model {
  // 姓名
  /**
   * @example
   * 张三
   */
  name?: string;
  // 年龄
  /**
   * @example
   * 18
   */
  age: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      age: 'age',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      age: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// test
export class DemoTestHf extends $tea.Model {
  // test
  /**
   * @example
   * undefined
   */
  info: ResultTest;
  static names(): { [key: string]: string } {
    return {
      info: 'info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      info: ResultTest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 测试实体
export class SumBean extends $tea.Model {
  // 元素名称
  /**
   * @example
   * 张三
   */
  eName?: string;
  // 数量
  /**
   * @example
   * 23
   */
  num?: number;
  // test
  /**
   * @example
   * undefined
   */
  info: ResultTests;
  static names(): { [key: string]: string } {
    return {
      eName: 'e_name',
      num: 'num',
      info: 'info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      eName: 'string',
      num: 'number',
      info: ResultTests,
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

export class QueryAntchainDemosdkBbbEeeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 姓名
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

export class QueryAntchainDemosdkBbbEeeResponse extends $tea.Model {
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

export class QueryAntchainDemosdkAaaTestRequest extends $tea.Model {
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

export class QueryAntchainDemosdkAaaTestResponse extends $tea.Model {
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

export class StabilizeAntchainDemosdkBbbCccRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 测试
  test?: string;
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

export class StabilizeAntchainDemosdkBbbCccResponse extends $tea.Model {
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

export class QueryAntchainDemosdkMultiCccRequest extends $tea.Model {
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

export class QueryAntchainDemosdkMultiCccResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 测试
  body?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      body: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainDemosdkAaaCciRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 姓名
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

export class QueryAntchainDemosdkAaaCciResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 测试
  test?: string;
  // 1
  num?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      test: 'test',
      num: 'num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      test: 'string',
      num: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ResetAntchainDemosdkBbbCccRequest extends $tea.Model {
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

export class ResetAntchainDemosdkBbbCccResponse extends $tea.Model {
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

export class QueryAntchainDemosdkCcXxRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // aa
  name: string;
  // 测试
  msg: ResultTest;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      msg: 'msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      msg: ResultTest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainDemosdkCcXxResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 1213
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

export class ResetAntchainDemosdkAbcdLimitRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时时间
  timeout?: string;
  // 请求编号
  count?: string;
  // 请求时间
  time?: string;
  // 请求描述
  desc?: string;
  // 操作者
  operator?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      timeout: 'timeout',
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
      timeout: 'string',
      count: 'string',
      time: 'string',
      desc: 'string',
      operator: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ResetAntchainDemosdkAbcdLimitResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  stauts?: string;
  // 返回描述
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

export class ImportAntchainDemosdkCreateOneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 3000
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

export class ImportAntchainDemosdkCreateOneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 200
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

export class WithdrawAntchainDemosdkTwiceOneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时时间
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

export class WithdrawAntchainDemosdkTwiceOneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果码
  stauts?: string;
  // 返回结果描述
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

export class OperateAntchainDemosdkTwiceOneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时时间
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

export class OperateAntchainDemosdkTwiceOneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码
  stauts?: string;
  // 返回结果描述
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

export class QueryAntchainDemosdkTwiceThreeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时时间
  timeout?: string;
  // 11
  aa?: DemoClass;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      timeout: 'timeout',
      aa: 'aa',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      timeout: 'string',
      aa: DemoClass,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainDemosdkTwiceThreeResponse extends $tea.Model {
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

export class UnstabilizeAntchainDemosdkTwiceThreeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时时间
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

export class UnstabilizeAntchainDemosdkTwiceThreeResponse extends $tea.Model {
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

export class QueryAntchainDemosdkTesxRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 名称
  name: string;
  // 12
  test?: DemoClass;
  // 12
  testNew?: TestDemo;
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
      name: 'string',
      test: DemoClass,
      testNew: TestDemo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainDemosdkTesxResponse extends $tea.Model {
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

export class TestAntchainDemosdkPreFullRequest extends $tea.Model {
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

export class TestAntchainDemosdkPreFullResponse extends $tea.Model {
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

export class QueryAntchainDemosdkTestapiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 名称
  name: string;
  // 测试
  className?: DemoClass;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      className: 'class_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      className: DemoClass,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainDemosdkTestapiResponse extends $tea.Model {
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

export class QueryAntchainDemosdkTumRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 名称
  name?: string;
  // 测试bean
  testBean?: SumBean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      testBean: 'test_bean',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      testBean: SumBean,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainDemosdkTumResponse extends $tea.Model {
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
          sdk_version: "2.0.7",
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
   * Description: 测试接口
   * Summary: 测试接口
   */
  async queryAntchainDemosdkBbbEee(request: QueryAntchainDemosdkBbbEeeRequest): Promise<QueryAntchainDemosdkBbbEeeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainDemosdkBbbEeeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试接口
   * Summary: 测试接口
   */
  async queryAntchainDemosdkBbbEeeEx(request: QueryAntchainDemosdkBbbEeeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainDemosdkBbbEeeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainDemosdkBbbEeeResponse>(await this.doRequest("1.0", "antchain.demosdk.bbb.eee.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainDemosdkBbbEeeResponse({}));
  }

  /**
   * @remarks
   * Description: 测试用
   * Summary: 测试用
   */
  async queryAntchainDemosdkAaaTest(request: QueryAntchainDemosdkAaaTestRequest): Promise<QueryAntchainDemosdkAaaTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainDemosdkAaaTestEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试用
   * Summary: 测试用
   */
  async queryAntchainDemosdkAaaTestEx(request: QueryAntchainDemosdkAaaTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainDemosdkAaaTestResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainDemosdkAaaTestResponse>(await this.doRequest("1.0", "antchain.demosdk.aaa.test.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainDemosdkAaaTestResponse({}));
  }

  /**
   * @remarks
   * Description: 测试
   * Summary: 测试
   */
  async stabilizeAntchainDemosdkBbbCcc(request: StabilizeAntchainDemosdkBbbCccRequest): Promise<StabilizeAntchainDemosdkBbbCccResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.stabilizeAntchainDemosdkBbbCccEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试
   * Summary: 测试
   */
  async stabilizeAntchainDemosdkBbbCccEx(request: StabilizeAntchainDemosdkBbbCccRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StabilizeAntchainDemosdkBbbCccResponse> {
    Util.validateModel(request);
    return $tea.cast<StabilizeAntchainDemosdkBbbCccResponse>(await this.doRequest("1.0", "antchain.demosdk.bbb.ccc.stabilize", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StabilizeAntchainDemosdkBbbCccResponse({}));
  }

  /**
   * @remarks
   * Description: r
   * Summary: r
   */
  async queryAntchainDemosdkMultiCcc(request: QueryAntchainDemosdkMultiCccRequest): Promise<QueryAntchainDemosdkMultiCccResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainDemosdkMultiCccEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: r
   * Summary: r
   */
  async queryAntchainDemosdkMultiCccEx(request: QueryAntchainDemosdkMultiCccRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainDemosdkMultiCccResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainDemosdkMultiCccResponse>(await this.doRequest("1.0", "antchain.demosdk.multi.ccc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainDemosdkMultiCccResponse({}));
  }

  /**
   * @remarks
   * Description: l
   * Summary: l
   */
  async queryAntchainDemosdkAaaCci(request: QueryAntchainDemosdkAaaCciRequest): Promise<QueryAntchainDemosdkAaaCciResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainDemosdkAaaCciEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: l
   * Summary: l
   */
  async queryAntchainDemosdkAaaCciEx(request: QueryAntchainDemosdkAaaCciRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainDemosdkAaaCciResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainDemosdkAaaCciResponse>(await this.doRequest("1.0", "antchain.demosdk.aaa.cci.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainDemosdkAaaCciResponse({}));
  }

  /**
   * @remarks
   * Description: 测试接口
   * Summary: 测试接口
   */
  async resetAntchainDemosdkBbbCcc(request: ResetAntchainDemosdkBbbCccRequest): Promise<ResetAntchainDemosdkBbbCccResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.resetAntchainDemosdkBbbCccEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试接口
   * Summary: 测试接口
   */
  async resetAntchainDemosdkBbbCccEx(request: ResetAntchainDemosdkBbbCccRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ResetAntchainDemosdkBbbCccResponse> {
    Util.validateModel(request);
    return $tea.cast<ResetAntchainDemosdkBbbCccResponse>(await this.doRequest("1.0", "antchain.demosdk.bbb.ccc.reset", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ResetAntchainDemosdkBbbCccResponse({}));
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
   * Description: 测试
   * Summary: 测试
   */
  async queryAntchainDemosdkCcXx(request: QueryAntchainDemosdkCcXxRequest): Promise<QueryAntchainDemosdkCcXxResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainDemosdkCcXxEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试
   * Summary: 测试
   */
  async queryAntchainDemosdkCcXxEx(request: QueryAntchainDemosdkCcXxRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainDemosdkCcXxResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainDemosdkCcXxResponse>(await this.doRequest("1.0", "antchain.demosdk.cc.xx.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainDemosdkCcXxResponse({}));
  }

  /**
   * @remarks
   * Description: 个人工作台二期分组路由灰度测试接口
   * Summary: 个人工作台二期分组路由灰度测试接口
   */
  async resetAntchainDemosdkAbcdLimit(request: ResetAntchainDemosdkAbcdLimitRequest): Promise<ResetAntchainDemosdkAbcdLimitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.resetAntchainDemosdkAbcdLimitEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 个人工作台二期分组路由灰度测试接口
   * Summary: 个人工作台二期分组路由灰度测试接口
   */
  async resetAntchainDemosdkAbcdLimitEx(request: ResetAntchainDemosdkAbcdLimitRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ResetAntchainDemosdkAbcdLimitResponse> {
    Util.validateModel(request);
    return $tea.cast<ResetAntchainDemosdkAbcdLimitResponse>(await this.doRequest("1.0", "antchain.demosdk.abcd.limit.reset", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ResetAntchainDemosdkAbcdLimitResponse({}));
  }

  /**
   * @remarks
   * Description: 用于个人工作台二期测试使用
   * Summary: 用于个人工作台二期测试使用
   */
  async importAntchainDemosdkCreateOne(request: ImportAntchainDemosdkCreateOneRequest): Promise<ImportAntchainDemosdkCreateOneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importAntchainDemosdkCreateOneEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 用于个人工作台二期测试使用
   * Summary: 用于个人工作台二期测试使用
   */
  async importAntchainDemosdkCreateOneEx(request: ImportAntchainDemosdkCreateOneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportAntchainDemosdkCreateOneResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportAntchainDemosdkCreateOneResponse>(await this.doRequest("1.0", "antchain.demosdk.create.one.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportAntchainDemosdkCreateOneResponse({}));
  }

  /**
   * @remarks
   * Description: 个人工作台二期预发测试
   * Summary: 个人工作台二期预发测试
   */
  async withdrawAntchainDemosdkTwiceOne(request: WithdrawAntchainDemosdkTwiceOneRequest): Promise<WithdrawAntchainDemosdkTwiceOneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.withdrawAntchainDemosdkTwiceOneEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 个人工作台二期预发测试
   * Summary: 个人工作台二期预发测试
   */
  async withdrawAntchainDemosdkTwiceOneEx(request: WithdrawAntchainDemosdkTwiceOneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<WithdrawAntchainDemosdkTwiceOneResponse> {
    Util.validateModel(request);
    return $tea.cast<WithdrawAntchainDemosdkTwiceOneResponse>(await this.doRequest("1.0", "antchain.demosdk.twice.one.withdraw", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new WithdrawAntchainDemosdkTwiceOneResponse({}));
  }

  /**
   * @remarks
   * Description: 个人工作台二期预发测试
   * Summary: 个人工作台二期预发测试
   */
  async operateAntchainDemosdkTwiceOne(request: OperateAntchainDemosdkTwiceOneRequest): Promise<OperateAntchainDemosdkTwiceOneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateAntchainDemosdkTwiceOneEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 个人工作台二期预发测试
   * Summary: 个人工作台二期预发测试
   */
  async operateAntchainDemosdkTwiceOneEx(request: OperateAntchainDemosdkTwiceOneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateAntchainDemosdkTwiceOneResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateAntchainDemosdkTwiceOneResponse>(await this.doRequest("1.0", "antchain.demosdk.twice.one.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateAntchainDemosdkTwiceOneResponse({}));
  }

  /**
   * @remarks
   * Description: 个人工作台二期预发测试
   * Summary: 个人工作台二期预发测试
   */
  async queryAntchainDemosdkTwiceThree(request: QueryAntchainDemosdkTwiceThreeRequest): Promise<QueryAntchainDemosdkTwiceThreeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainDemosdkTwiceThreeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 个人工作台二期预发测试
   * Summary: 个人工作台二期预发测试
   */
  async queryAntchainDemosdkTwiceThreeEx(request: QueryAntchainDemosdkTwiceThreeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainDemosdkTwiceThreeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainDemosdkTwiceThreeResponse>(await this.doRequest("1.0", "antchain.demosdk.twice.three.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainDemosdkTwiceThreeResponse({}));
  }

  /**
   * @remarks
   * Description: 个人工作台二期预发测试
   * Summary: 个人工作台二期预发测试
   */
  async unstabilizeAntchainDemosdkTwiceThree(request: UnstabilizeAntchainDemosdkTwiceThreeRequest): Promise<UnstabilizeAntchainDemosdkTwiceThreeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.unstabilizeAntchainDemosdkTwiceThreeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 个人工作台二期预发测试
   * Summary: 个人工作台二期预发测试
   */
  async unstabilizeAntchainDemosdkTwiceThreeEx(request: UnstabilizeAntchainDemosdkTwiceThreeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UnstabilizeAntchainDemosdkTwiceThreeResponse> {
    Util.validateModel(request);
    return $tea.cast<UnstabilizeAntchainDemosdkTwiceThreeResponse>(await this.doRequest("1.0", "antchain.demosdk.twice.three.unstabilize", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UnstabilizeAntchainDemosdkTwiceThreeResponse({}));
  }

  /**
   * @remarks
   * Description: 测试接口
   * Summary: 测试接口
   */
  async queryAntchainDemosdkTesx(request: QueryAntchainDemosdkTesxRequest): Promise<QueryAntchainDemosdkTesxResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainDemosdkTesxEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试接口
   * Summary: 测试接口
   */
  async queryAntchainDemosdkTesxEx(request: QueryAntchainDemosdkTesxRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainDemosdkTesxResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainDemosdkTesxResponse>(await this.doRequest("1.0", "antchain.demosdk.tesx.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainDemosdkTesxResponse({}));
  }

  /**
   * @remarks
   * Description: 1
   * Summary: 1
   */
  async testAntchainDemosdkPreFull(request: TestAntchainDemosdkPreFullRequest): Promise<TestAntchainDemosdkPreFullResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.testAntchainDemosdkPreFullEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 1
   * Summary: 1
   */
  async testAntchainDemosdkPreFullEx(request: TestAntchainDemosdkPreFullRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<TestAntchainDemosdkPreFullResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.demosdk.pre.full.test",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let testAntchainDemosdkPreFullResponse = new TestAntchainDemosdkPreFullResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return testAntchainDemosdkPreFullResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<TestAntchainDemosdkPreFullResponse>(await this.doRequest("1.0", "antchain.demosdk.pre.full.test", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new TestAntchainDemosdkPreFullResponse({}));
  }

  /**
   * @remarks
   * Description: 测试接口
   * Summary: 测试接口
   */
  async queryAntchainDemosdkTestapi(request: QueryAntchainDemosdkTestapiRequest): Promise<QueryAntchainDemosdkTestapiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainDemosdkTestapiEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试接口
   * Summary: 测试接口
   */
  async queryAntchainDemosdkTestapiEx(request: QueryAntchainDemosdkTestapiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainDemosdkTestapiResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainDemosdkTestapiResponse>(await this.doRequest("1.0", "antchain.demosdk.testapi.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainDemosdkTestapiResponse({}));
  }

  /**
   * @remarks
   * Description: 测试
   * Summary: 测试
   */
  async queryAntchainDemosdkTum(request: QueryAntchainDemosdkTumRequest): Promise<QueryAntchainDemosdkTumResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainDemosdkTumEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试
   * Summary: 测试
   */
  async queryAntchainDemosdkTumEx(request: QueryAntchainDemosdkTumRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainDemosdkTumResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainDemosdkTumResponse>(await this.doRequest("1.0", "antchain.demosdk.tum.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainDemosdkTumResponse({}));
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
