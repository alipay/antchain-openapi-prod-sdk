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

// InitPack
export class InitPack extends $tea.Model {
  // 2022-11-07 14:48
  /**
   * @example
   * 2022-11-07 14:48
   */
  time?: string;
  // wanyi
  /**
   * @example
   * wanyi
   */
  operator?: string;
  // 1
  /**
   * @example
   * 1
   */
  count?: number;
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

export class TestStructOnlineRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时时间
  timeout?: string;
  // 结构体参数
  struct?: TestParams;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      timeout: 'timeout',
      struct: 'struct',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      timeout: 'string',
      struct: TestParams,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class TestStructOnlineResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码
  status?: string;
  // 状态描述
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

export class TestaStructCreateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 信息
  testParamB?: DemosdkStructA;
  // 超时时间
  timeout?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      testParamB: 'test_param_b',
      timeout: 'timeout',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      testParamB: DemosdkStructA,
      timeout: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class TestaStructCreateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码
  status?: string;
  // 状态描述
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

export class QueryAaaSdkRequest extends $tea.Model {
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

export class QueryAaaSdkResponse extends $tea.Model {
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

export class QueryMultiCciuRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // aaa
  aaaaa?: TestParams;
  // bbbbb
  bbbbb?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      aaaaa: 'aaaaa',
      bbbbb: 'bbbbb',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      aaaaa: TestParams,
      bbbbb: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMultiCciuResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // bbbb
  bbbb?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bbbb: 'bbbb',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bbbb: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIamTestRequest extends $tea.Model {
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

export class QueryIamTestResponse extends $tea.Model {
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

export class TestIamSynchronousRequest extends $tea.Model {
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

export class TestIamSynchronousResponse extends $tea.Model {
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

export class IamIamIamRequest extends $tea.Model {
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

export class IamIamIamResponse extends $tea.Model {
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

export class TestIamPushRequest extends $tea.Model {
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

export class TestIamPushResponse extends $tea.Model {
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

export class QueryIamPushRequest extends $tea.Model {
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

export class QueryIamPushResponse extends $tea.Model {
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

export class IamApipushForRequest extends $tea.Model {
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

export class IamApipushForResponse extends $tea.Model {
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

export class ConfigQueryApiRequest extends $tea.Model {
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

export class ConfigQueryApiResponse extends $tea.Model {
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

export class BindAaaBbbCccRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 123
  date: string;
  // 123
  data: string;
  // 测试参数
  demoClass: DemoClass;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      date: 'date',
      data: 'data',
      demoClass: 'demo_class',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      date: 'string',
      data: 'string',
      demoClass: DemoClass,
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

export class QueryAaaCcdRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 123
  test?: string;
  // 结构体字段
  listParamsDemosdk?: TestParamA[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      test: 'test',
      listParamsDemosdk: 'list_params_demosdk',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      test: 'string',
      listParamsDemosdk: { 'type': 'array', 'itemType': TestParamA },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAaaCcdResponse extends $tea.Model {
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

export class BindXxxRequest extends $tea.Model {
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

export class BindXxxResponse extends $tea.Model {
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

export class QueryTxtRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 姓名
  name?: string;
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

export class QueryTxtResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 证件号
  idcard?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      idcard: 'idcard',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      idcard: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListTxtRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 124
  idcard?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      idcard: 'idcard',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      idcard: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListTxtResponse extends $tea.Model {
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

export class QueryWorkbenchTestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 3000
  timeout?: string;
  // 请求编号
  count?: number;
  // 请求时间
  time?: string;
  // 请求描述
  desc?: string;
  // 操作人
  operator?: string;
  // aaaaa
  aaaaa?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      timeout: 'timeout',
      count: 'count',
      time: 'time',
      desc: 'desc',
      operator: 'operator',
      aaaaa: 'aaaaa',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      timeout: 'string',
      count: 'number',
      time: 'string',
      desc: 'string',
      operator: 'string',
      aaaaa: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWorkbenchTestResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态
  stauts?: string;
  // 描述
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

export class ImportAbcdOneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时时间
  timeout?: string;
  // 请求编号
  count?: number;
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

export class ImportAbcdOneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 描述
  stauts?: string;
  // 描述
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

export class PublishWorkbenchOneRequest extends $tea.Model {
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

export class PublishWorkbenchOneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态
  msg?: string;
  // 状态码
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishWorkbenchTwoRequest extends $tea.Model {
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

export class PublishWorkbenchTwoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态
  msg?: string;
  // 状态码
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishTwiceOneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时时间
  timeout?: string;
  // aa
  aaa?: DemoClass;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      timeout: 'timeout',
      aaa: 'aaa',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      timeout: 'string',
      aaa: DemoClass,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishTwiceOneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回状态码
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

export class ImportTwiceThreeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时间
  timeout: string;
  // 结构体A
  structA?: TestParamA;
  // 结构体B
  structB?: TestParamB;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      timeout: 'timeout',
      structA: 'struct_a',
      structB: 'struct_b',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      timeout: 'string',
      structA: TestParamA,
      structB: TestParamB,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportTwiceThreeResponse extends $tea.Model {
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

export class PublishWorkbenchThreeRequest extends $tea.Model {
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

export class PublishWorkbenchThreeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态
  msg?: string;
  // 状态码
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishWorkbenchFourRequest extends $tea.Model {
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

export class PublishWorkbenchFourResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态
  msg?: string;
  // 状态码
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAaaQqqRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 1
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

export class QueryAaaQqqResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // OK
  stauts?: string;
  // msg
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

export class CABRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 时间
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

export class CABResponse extends $tea.Model {
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

export class AAARequest extends $tea.Model {
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

export class AAAResponse extends $tea.Model {
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

export class ApiAutotestCreateRequest extends $tea.Model {
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

export class ApiAutotestCreateResponse extends $tea.Model {
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

export class ZhongyipretestbZhongyipretestbZhongyipretestbRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 1
  timeout?: string;
  // struct_parama
  structParama?: TestParamA;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      timeout: 'timeout',
      structParama: 'struct_parama',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      timeout: 'string',
      structParama: TestParamA,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ZhongyipretestbZhongyipretestbZhongyipretestbResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 1
  msg?: string;
  // ok
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      status: 'string',
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
          sdk_version: "1.3.45",
          _prod_code: "DEMOSDK",
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
   * Description: 用于结构体上线测试
   * Summary: 用于结构体上线测试
   */
  async testStructOnline(request: TestStructOnlineRequest): Promise<TestStructOnlineResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.testStructOnlineEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 用于结构体上线测试
   * Summary: 用于结构体上线测试
   */
  async testStructOnlineEx(request: TestStructOnlineRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<TestStructOnlineResponse> {
    Util.validateModel(request);
    return $tea.cast<TestStructOnlineResponse>(await this.doRequest("1.0", "antchain.demosdk.struct.online.test", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new TestStructOnlineResponse({}));
  }

  /**
   * @remarks
   * Description: 结构体测试·edit for test18
   * Summary: 结构体测试·edit for test18
   */
  async testaStructCreate(request: TestaStructCreateRequest): Promise<TestaStructCreateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.testaStructCreateEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 结构体测试·edit for test18
   * Summary: 结构体测试·edit for test18
   */
  async testaStructCreateEx(request: TestaStructCreateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<TestaStructCreateResponse> {
    Util.validateModel(request);
    return $tea.cast<TestaStructCreateResponse>(await this.doRequest("1.0", "antchain.demosdk.struct.create.testa", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new TestaStructCreateResponse({}));
  }

  /**
   * @remarks
   * Description: 这是测试的
   * Summary: 这是测试的
   */
  async queryAaaSdk(request: QueryAaaSdkRequest): Promise<QueryAaaSdkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAaaSdkEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 这是测试的
   * Summary: 这是测试的
   */
  async queryAaaSdkEx(request: QueryAaaSdkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAaaSdkResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAaaSdkResponse>(await this.doRequest("1.0", "antchain.demosdk.aaa.sdk.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAaaSdkResponse({}));
  }

  /**
   * @remarks
   * Description: l
   * Summary: l
   */
  async queryMultiCciu(request: QueryMultiCciuRequest): Promise<QueryMultiCciuResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMultiCciuEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: l
   * Summary: l
   */
  async queryMultiCciuEx(request: QueryMultiCciuRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMultiCciuResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMultiCciuResponse>(await this.doRequest("1.0", "antchain.demosdk.multi.cciu.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMultiCciuResponse({}));
  }

  /**
   * @remarks
   * Description: a
   * Summary: a
   */
  async queryIamTest(request: QueryIamTestRequest): Promise<QueryIamTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIamTestEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: a
   * Summary: a
   */
  async queryIamTestEx(request: QueryIamTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIamTestResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIamTestResponse>(await this.doRequest("1.0", "antchain.demosdk.iam.test.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIamTestResponse({}));
  }

  /**
   * @remarks
   * Description: iam同步测试
   * Summary: iam同步测试
   */
  async testIamSynchronous(request: TestIamSynchronousRequest): Promise<TestIamSynchronousResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.testIamSynchronousEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: iam同步测试
   * Summary: iam同步测试
   */
  async testIamSynchronousEx(request: TestIamSynchronousRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<TestIamSynchronousResponse> {
    Util.validateModel(request);
    return $tea.cast<TestIamSynchronousResponse>(await this.doRequest("1.0", "antchain.demosdk.iam.synchronous.test", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new TestIamSynchronousResponse({}));
  }

  /**
   * @remarks
   * Description: iam同步测试
   * Summary: iam同步测试
   */
  async iamIamIam(request: IamIamIamRequest): Promise<IamIamIamResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.iamIamIamEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: iam同步测试
   * Summary: iam同步测试
   */
  async iamIamIamEx(request: IamIamIamRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<IamIamIamResponse> {
    Util.validateModel(request);
    return $tea.cast<IamIamIamResponse>(await this.doRequest("1.0", "antchain.demosdk.iam.iam.iam", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new IamIamIamResponse({}));
  }

  /**
   * @remarks
   * Description: iam推送测试
   * Summary: iam推送测试
   */
  async testIamPush(request: TestIamPushRequest): Promise<TestIamPushResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.testIamPushEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: iam推送测试
   * Summary: iam推送测试
   */
  async testIamPushEx(request: TestIamPushRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<TestIamPushResponse> {
    Util.validateModel(request);
    return $tea.cast<TestIamPushResponse>(await this.doRequest("1.0", "antchain.demosdk.iam.push.test", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new TestIamPushResponse({}));
  }

  /**
   * @remarks
   * Description: test
   * Summary: test
   */
  async queryIamPush(request: QueryIamPushRequest): Promise<QueryIamPushResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIamPushEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: test
   * Summary: test
   */
  async queryIamPushEx(request: QueryIamPushRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIamPushResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIamPushResponse>(await this.doRequest("1.0", "antchain.demosdk.iam.push.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIamPushResponse({}));
  }

  /**
   * @remarks
   * Description: test
   * Summary: test
   */
  async iamApipushFor(request: IamApipushForRequest): Promise<IamApipushForResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.iamApipushForEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: test
   * Summary: test
   */
  async iamApipushForEx(request: IamApipushForRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<IamApipushForResponse> {
    Util.validateModel(request);
    return $tea.cast<IamApipushForResponse>(await this.doRequest("1.0", "antchain.demosdk.apipush.for.iam", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new IamApipushForResponse({}));
  }

  /**
   * @remarks
   * Description: queryApiConfig接口优化
   * Summary: queryApiConfig接口优化
   */
  async configQueryApi(request: ConfigQueryApiRequest): Promise<ConfigQueryApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.configQueryApiEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: queryApiConfig接口优化
   * Summary: queryApiConfig接口优化
   */
  async configQueryApiEx(request: ConfigQueryApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfigQueryApiResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfigQueryApiResponse>(await this.doRequest("1.0", "antchain.demosdk.query.api.config", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfigQueryApiResponse({}));
  }

  /**
   * @remarks
   * Description: 自动化测试创建test，请勿修改、删除
   * Summary: 自动化测试创建test，请勿修改、删除
   */
  async bindAaaBbbCcc(request: BindAaaBbbCccRequest): Promise<BindAaaBbbCccResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindAaaBbbCccEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 自动化测试创建test，请勿修改、删除
   * Summary: 自动化测试创建test，请勿修改、删除
   */
  async bindAaaBbbCccEx(request: BindAaaBbbCccRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindAaaBbbCccResponse> {
    Util.validateModel(request);
    return $tea.cast<BindAaaBbbCccResponse>(await this.doRequest("1.0", "antchain.demosdk.aaa.bbb.ccc.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindAaaBbbCccResponse({}));
  }

  /**
   * @remarks
   * Description: 自动化测试创建test，请勿修改、删除
   * Summary: 自动化测试创建test，请勿修改、删除
   */
  async queryAaaCcd(request: QueryAaaCcdRequest): Promise<QueryAaaCcdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAaaCcdEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 自动化测试创建test，请勿修改、删除
   * Summary: 自动化测试创建test，请勿修改、删除
   */
  async queryAaaCcdEx(request: QueryAaaCcdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAaaCcdResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAaaCcdResponse>(await this.doRequest("1.0", "antchain.demosdk.aaa.ccd.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAaaCcdResponse({}));
  }

  /**
   * @remarks
   * Description: 自动化测试创建test，请勿修改、删除
   * Summary: 自动化测试创建test，请勿修改、删除
   */
  async bindXxx(request: BindXxxRequest): Promise<BindXxxResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindXxxEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 自动化测试创建test，请勿修改、删除
   * Summary: 自动化测试创建test，请勿修改、删除
   */
  async bindXxxEx(request: BindXxxRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindXxxResponse> {
    Util.validateModel(request);
    return $tea.cast<BindXxxResponse>(await this.doRequest("1.0", "antchain.demosdk.xxx.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindXxxResponse({}));
  }

  /**
   * @remarks
   * Description: 测试api流程
   * Summary: 测试api流程
   */
  async queryTxt(request: QueryTxtRequest): Promise<QueryTxtResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTxtEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试api流程
   * Summary: 测试api流程
   */
  async queryTxtEx(request: QueryTxtRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTxtResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTxtResponse>(await this.doRequest("1.0", "antchain.demosdk.txt.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTxtResponse({}));
  }

  /**
   * @remarks
   * Description: desc
   * Summary: desc
   */
  async listTxt(request: ListTxtRequest): Promise<ListTxtResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listTxtEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: desc
   * Summary: desc
   */
  async listTxtEx(request: ListTxtRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListTxtResponse> {
    Util.validateModel(request);
    return $tea.cast<ListTxtResponse>(await this.doRequest("1.0", "antchain.demosdk.txt.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListTxtResponse({}));
  }

  /**
   * @remarks
   * Description: 用于个人工作台二期测试使用测试test
   * Summary: 用于个人工作台二期测试使用测试test
   */
  async queryWorkbenchTest(request: QueryWorkbenchTestRequest): Promise<QueryWorkbenchTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryWorkbenchTestEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 用于个人工作台二期测试使用测试test
   * Summary: 用于个人工作台二期测试使用测试test
   */
  async queryWorkbenchTestEx(request: QueryWorkbenchTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryWorkbenchTestResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryWorkbenchTestResponse>(await this.doRequest("1.0", "antchain.demosdk.workbench.test.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryWorkbenchTestResponse({}));
  }

  /**
   * @remarks
   * Description: 个人工作台二期测试接口
   * Summary: 个人工作台二期测试接口
   */
  async importAbcdOne(request: ImportAbcdOneRequest): Promise<ImportAbcdOneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importAbcdOneEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 个人工作台二期测试接口
   * Summary: 个人工作台二期测试接口
   */
  async importAbcdOneEx(request: ImportAbcdOneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportAbcdOneResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportAbcdOneResponse>(await this.doRequest("1.0", "antchain.demosdk.abcd.one.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportAbcdOneResponse({}));
  }

  /**
   * @remarks
   * Description: 个人工作台测试使用
   * Summary: 个人工作台测试使用
   */
  async publishWorkbenchOne(request: PublishWorkbenchOneRequest): Promise<PublishWorkbenchOneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.publishWorkbenchOneEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 个人工作台测试使用
   * Summary: 个人工作台测试使用
   */
  async publishWorkbenchOneEx(request: PublishWorkbenchOneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PublishWorkbenchOneResponse> {
    Util.validateModel(request);
    return $tea.cast<PublishWorkbenchOneResponse>(await this.doRequest("1.0", "antchain.demosdk.workbench.one.publish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PublishWorkbenchOneResponse({}));
  }

  /**
   * @remarks
   * Description: 个人工作台测试
   * Summary: 个人工作台测试
   */
  async publishWorkbenchTwo(request: PublishWorkbenchTwoRequest): Promise<PublishWorkbenchTwoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.publishWorkbenchTwoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 个人工作台测试
   * Summary: 个人工作台测试
   */
  async publishWorkbenchTwoEx(request: PublishWorkbenchTwoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PublishWorkbenchTwoResponse> {
    Util.validateModel(request);
    return $tea.cast<PublishWorkbenchTwoResponse>(await this.doRequest("1.0", "antchain.demosdk.workbench.two.publish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PublishWorkbenchTwoResponse({}));
  }

  /**
   * @remarks
   * Description: 个人工作台二期预发测试1
   * Summary: 个人工作台二期预发测试1
   */
  async publishTwiceOne(request: PublishTwiceOneRequest): Promise<PublishTwiceOneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.publishTwiceOneEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 个人工作台二期预发测试1
   * Summary: 个人工作台二期预发测试1
   */
  async publishTwiceOneEx(request: PublishTwiceOneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PublishTwiceOneResponse> {
    Util.validateModel(request);
    return $tea.cast<PublishTwiceOneResponse>(await this.doRequest("1.0", "antchain.demosdk.twice.one.publish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PublishTwiceOneResponse({}));
  }

  /**
   * @remarks
   * Description: 个人工作台二期预发测试
   * Summary: 个人工作台二期预发测试
   */
  async importTwiceThree(request: ImportTwiceThreeRequest): Promise<ImportTwiceThreeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importTwiceThreeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 个人工作台二期预发测试
   * Summary: 个人工作台二期预发测试
   */
  async importTwiceThreeEx(request: ImportTwiceThreeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportTwiceThreeResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportTwiceThreeResponse>(await this.doRequest("1.0", "antchain.demosdk.twice.three.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportTwiceThreeResponse({}));
  }

  /**
   * @remarks
   * Description: 个人工作台测试使用
   * Summary: 个人工作台测试使用
   */
  async publishWorkbenchThree(request: PublishWorkbenchThreeRequest): Promise<PublishWorkbenchThreeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.publishWorkbenchThreeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 个人工作台测试使用
   * Summary: 个人工作台测试使用
   */
  async publishWorkbenchThreeEx(request: PublishWorkbenchThreeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PublishWorkbenchThreeResponse> {
    Util.validateModel(request);
    return $tea.cast<PublishWorkbenchThreeResponse>(await this.doRequest("1.0", "antchain.demosdk.workbench.three.publish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PublishWorkbenchThreeResponse({}));
  }

  /**
   * @remarks
   * Description: 个人工作台测试使用
   * Summary: 个人工作台测试使用
   */
  async publishWorkbenchFour(request: PublishWorkbenchFourRequest): Promise<PublishWorkbenchFourResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.publishWorkbenchFourEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 个人工作台测试使用
   * Summary: 个人工作台测试使用
   */
  async publishWorkbenchFourEx(request: PublishWorkbenchFourRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PublishWorkbenchFourResponse> {
    Util.validateModel(request);
    return $tea.cast<PublishWorkbenchFourResponse>(await this.doRequest("1.0", "antchain.demosdk.workbench.four.publish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PublishWorkbenchFourResponse({}));
  }

  /**
   * @remarks
   * Description: AAAA
   * Summary: AAAA
   */
  async queryAaaQqq(request: QueryAaaQqqRequest): Promise<QueryAaaQqqResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAaaQqqEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: AAAA
   * Summary: AAAA
   */
  async queryAaaQqqEx(request: QueryAaaQqqRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAaaQqqResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAaaQqqResponse>(await this.doRequest("1.0", "antchain.demosdk.aaa.qqq.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAaaQqqResponse({}));
  }

  /**
   * @remarks
   * Description: a
   * Summary: a
   */
  async cAB(request: CABRequest): Promise<CABResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cABEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: a
   * Summary: a
   */
  async cABEx(request: CABRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CABResponse> {
    Util.validateModel(request);
    return $tea.cast<CABResponse>(await this.doRequest("1.0", "antchain.demosdk.a.b.c", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CABResponse({}));
  }

  /**
   * @remarks
   * Description: 测试
   * Summary: 测试
   */
  async aAA(request: AAARequest): Promise<AAAResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.aAAEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试
   * Summary: 测试
   */
  async aAAEx(request: AAARequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AAAResponse> {
    Util.validateModel(request);
    return $tea.cast<AAAResponse>(await this.doRequest("1.0", "antchain.demosdk.a.a.a", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AAAResponse({}));
  }

  /**
   * @remarks
   * Description: 自动化测试使用
   * Summary: 自动化测试使用
   */
  async apiAutotestCreate(request: ApiAutotestCreateRequest): Promise<ApiAutotestCreateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.apiAutotestCreateEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 自动化测试使用
   * Summary: 自动化测试使用
   */
  async apiAutotestCreateEx(request: ApiAutotestCreateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApiAutotestCreateResponse> {
    Util.validateModel(request);
    return $tea.cast<ApiAutotestCreateResponse>(await this.doRequest("1.0", "antchain.demosdk.autotest.create.api", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApiAutotestCreateResponse({}));
  }

  /**
   * @remarks
   * Description: 这是编辑后的描述
   * Summary: 这是编辑后的描述
   */
  async zhongyipretestbZhongyipretestbZhongyipretestb(request: ZhongyipretestbZhongyipretestbZhongyipretestbRequest): Promise<ZhongyipretestbZhongyipretestbZhongyipretestbResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.zhongyipretestbZhongyipretestbZhongyipretestbEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 这是编辑后的描述
   * Summary: 这是编辑后的描述
   */
  async zhongyipretestbZhongyipretestbZhongyipretestbEx(request: ZhongyipretestbZhongyipretestbZhongyipretestbRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ZhongyipretestbZhongyipretestbZhongyipretestbResponse> {
    Util.validateModel(request);
    return $tea.cast<ZhongyipretestbZhongyipretestbZhongyipretestbResponse>(await this.doRequest("1.0", "antchain.demosdk.zhongyipretestb.zhongyipretestb.zhongyipretestb", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ZhongyipretestbZhongyipretestbZhongyipretestbResponse({}));
  }

}
