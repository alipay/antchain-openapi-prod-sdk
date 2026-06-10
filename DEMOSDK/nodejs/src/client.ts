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

// 1
export class TestDemo extends $tea.Model {
  // 1
  /**
   * @example
   * 张三
   */
  name?: string;
  // 1
  /**
   * @example
   * 23
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

export class QueryTestapiRequest extends $tea.Model {
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

export class QueryTestapiResponse extends $tea.Model {
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

export class RemarkTestRequest extends $tea.Model {
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

export class RemarkTestResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 测试
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

export class TestPreFullRequest extends $tea.Model {
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

export class TestPreFullResponse extends $tea.Model {
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

export class QueryTumRequest extends $tea.Model {
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

export class QueryTumResponse extends $tea.Model {
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

export class QueryTesxRequest extends $tea.Model {
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

export class QueryTesxResponse extends $tea.Model {
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

export class AaavTestLiuyzRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // demo_param
  demoParam: DemoClass;
  // aa
  paramA: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      demoParam: 'demo_param',
      paramA: 'param_a',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      demoParam: DemoClass,
      paramA: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AaavTestLiuyzResponse extends $tea.Model {
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

export class QuerySyhfRequest extends $tea.Model {
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

export class QuerySyhfResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // id
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

export class QueryBbbCccRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询条件
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

export class QueryBbbCccResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // id
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

export class ImportBbbCciRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // test
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
  fileId?: string;
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

export class ImportBbbCciResponse extends $tea.Model {
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

export class QueryTimeLimitRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // file_id
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

export class QueryTimeLimitResponse extends $tea.Model {
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

export class QueryCacheLimitRequest extends $tea.Model {
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

export class QueryCacheLimitResponse extends $tea.Model {
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

export class QueryBbbEeeRequest extends $tea.Model {
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

export class QueryBbbEeeResponse extends $tea.Model {
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

export class QueryAaaTestRequest extends $tea.Model {
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

export class QueryAaaTestResponse extends $tea.Model {
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

export class StabilizeBbbCccRequest extends $tea.Model {
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

export class StabilizeBbbCccResponse extends $tea.Model {
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

export class QueryMultiCccRequest extends $tea.Model {
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

export class QueryMultiCccResponse extends $tea.Model {
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

export class QueryAaaCciRequest extends $tea.Model {
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

export class QueryAaaCciResponse extends $tea.Model {
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

export class QueryMultiCciuRequest extends $tea.Model {
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

export class QueryMultiCciuResponse extends $tea.Model {
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
  // x
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
  // imj yaa
  idcard?: ResultTest;
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
      idcard: ResultTest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRuleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 测试
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

export class QueryRuleResponse extends $tea.Model {
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

export class ApiFileUploadRequest extends $tea.Model {
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

export class ApiFileUploadResponse extends $tea.Model {
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

export class QueryTesthfhfhfRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // test
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

export class QueryTesthfhfhfResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // id
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

export class PublishIterationhfRequest extends $tea.Model {
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

export class PublishIterationhfResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // id
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

export class QueryWorkbenchTestsRequest extends $tea.Model {
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

export class QueryWorkbenchTestsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回
  msg?: string;
  // 正确返回
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

export class ResetBbbCccRequest extends $tea.Model {
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

export class ResetBbbCccResponse extends $tea.Model {
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

export class QueryTestSssRequest extends $tea.Model {
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

export class QueryTestSssResponse extends $tea.Model {
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

export class QueryCimRunRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 记录id
  id: string;
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

export class QueryCimRunResponse extends $tea.Model {
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

export class QueryRoleListRequest extends $tea.Model {
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

export class QueryRoleListResponse extends $tea.Model {
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

export class ImportRoleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // xx
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

export class ImportRoleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 1213
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

export class ResetRoleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // te
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

export class ResetRoleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 21
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

export class PublishRoleListRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 1
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

export class PublishRoleListResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 123
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

export class InitUserTestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 12
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

export class InitUserTestResponse extends $tea.Model {
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

export class ExecCimRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 123
  test?: string;
  // 12
  id: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      test: 'test',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      test: 'string',
      id: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecCimResponse extends $tea.Model {
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

export class QueryCcXxRequest extends $tea.Model {
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

export class QueryCcXxResponse extends $tea.Model {
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

export class LyzaTestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // aa
  param?: string;
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

export class LyzaTestResponse extends $tea.Model {
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

export class CTestLizAaaRequest extends $tea.Model {
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

export class CTestLizAaaResponse extends $tea.Model {
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

export class VerifyApiListRequest extends $tea.Model {
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

export class VerifyApiListResponse extends $tea.Model {
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
  // copy
  initDesc?: string;
  // 组合返回请求结果
  initPack?: InitPack;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      stauts: 'stauts',
      msg: 'msg',
      initDesc: 'init_desc',
      initPack: 'init_pack',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      stauts: 'string',
      msg: 'string',
      initDesc: 'string',
      initPack: InitPack,
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

export class ImportCreateTestRequest extends $tea.Model {
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

export class ImportCreateTestResponse extends $tea.Model {
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

export class QueryAbcdOneRequest extends $tea.Model {
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
  // 操作人
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

export class QueryAbcdOneResponse extends $tea.Model {
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

export class ResetAbcdLimitRequest extends $tea.Model {
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

export class ResetAbcdLimitResponse extends $tea.Model {
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

export class RegisterAbcdLimitRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时时间
  timeout?: string;
  // 操作者
  operator?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      timeout: 'timeout',
      operator: 'operator',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      timeout: 'string',
      operator: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterAbcdLimitResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  stauts?: string;
  // 返回结果
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

export class QueryTwiceOneRequest extends $tea.Model {
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

export class QueryTwiceOneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  stauts?: string;
  // 返回信息描述
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

export class ImportTwiceOneRequest extends $tea.Model {
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

export class ImportTwiceOneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
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

export class PublishTwiceOneRequest extends $tea.Model {
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

export class ImportCreateOneRequest extends $tea.Model {
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

export class ImportCreateOneResponse extends $tea.Model {
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

export class QueryCreateTwoRequest extends $tea.Model {
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

export class QueryCreateTwoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // OK
  stauts?: string;
  // SUCCESS le
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

export class ImportCreateThreeRequest extends $tea.Model {
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

export class ImportCreateThreeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // SUCCESS le
  msg?: string;
  // OK
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

export class WithdrawTwiceOneRequest extends $tea.Model {
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

export class WithdrawTwiceOneResponse extends $tea.Model {
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

export class OperateTwiceOneRequest extends $tea.Model {
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

export class OperateTwiceOneResponse extends $tea.Model {
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

export class QueryTwiceTwoRequest extends $tea.Model {
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

export class QueryTwiceTwoResponse extends $tea.Model {
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

export class QueryTestRequest extends $tea.Model {
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

export class QueryTestResponse extends $tea.Model {
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

export class ImportTestRequest extends $tea.Model {
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

export class ImportTestResponse extends $tea.Model {
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

export class StabilizeTestRequest extends $tea.Model {
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

export class StabilizeTestResponse extends $tea.Model {
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

export class QueryTwiceThreeRequest extends $tea.Model {
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

export class QueryTwiceThreeResponse extends $tea.Model {
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

export class ImportTwiceThreeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时间
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

export class UnstabilizeTestRequest extends $tea.Model {
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

export class UnstabilizeTestResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态描述
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

export class QueryTestXcRequest extends $tea.Model {
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

export class QueryTestXcResponse extends $tea.Model {
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

export class QueryTestSyaRequest extends $tea.Model {
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

export class QueryTestSyaResponse extends $tea.Model {
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

export class QueryQqqWwwRequest extends $tea.Model {
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

export class QueryQqqWwwResponse extends $tea.Model {
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

export class StabilizeTwiceThreeRequest extends $tea.Model {
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

export class StabilizeTwiceThreeResponse extends $tea.Model {
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

export class UnstabilizeTwiceThreeRequest extends $tea.Model {
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

export class UnstabilizeTwiceThreeResponse extends $tea.Model {
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

export class QueryBbbAatestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 12
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

export class QueryBbbAatestResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // boolean
  res?: boolean;
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
      res: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ParamLiuyzTestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // aaa
  paramA: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      paramA: 'param_a',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      paramA: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ParamLiuyzTestResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 0000
  code?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class LllProxyLyzTestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 测试
  paramA: InitPack;
  // aa
  paramC: ResultTest;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      paramA: 'param_a',
      paramC: 'param_c',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      paramA: InitPack,
      paramC: ResultTest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class LllProxyLyzTestResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // aa
  paramB?: DemoClass;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      paramB: 'param_b',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      paramB: DemoClass,
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
          sdk_version: "1.4.5",
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
   * Description: 测试接口
   * Summary: 测试接口
   */
  async queryTestapi(request: QueryTestapiRequest): Promise<QueryTestapiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTestapiEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试接口
   * Summary: 测试接口
   */
  async queryTestapiEx(request: QueryTestapiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTestapiResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTestapiResponse>(await this.doRequest("1.0", "antchain.demosdk.testapi.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTestapiResponse({}));
  }

  /**
   * @remarks
   * Description: 123
   * Summary: 123
   */
  async remarkTest(request: RemarkTestRequest): Promise<RemarkTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.remarkTestEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 123
   * Summary: 123
   */
  async remarkTestEx(request: RemarkTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RemarkTestResponse> {
    Util.validateModel(request);
    return $tea.cast<RemarkTestResponse>(await this.doRequest("1.0", "antchain.demosdk.test.remark", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RemarkTestResponse({}));
  }

  /**
   * @remarks
   * Description: 1
   * Summary: 1
   */
  async testPreFull(request: TestPreFullRequest): Promise<TestPreFullResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.testPreFullEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 1
   * Summary: 1
   */
  async testPreFullEx(request: TestPreFullRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<TestPreFullResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.demosdk.pre.full.test",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let testPreFullResponse = new TestPreFullResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return testPreFullResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<TestPreFullResponse>(await this.doRequest("1.0", "antchain.demosdk.pre.full.test", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new TestPreFullResponse({}));
  }

  /**
   * @remarks
   * Description: 测试
   * Summary: 测试
   */
  async queryTum(request: QueryTumRequest): Promise<QueryTumResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTumEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试
   * Summary: 测试
   */
  async queryTumEx(request: QueryTumRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTumResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTumResponse>(await this.doRequest("1.0", "antchain.demosdk.tum.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTumResponse({}));
  }

  /**
   * @remarks
   * Description: 测试接口
   * Summary: 测试接口
   */
  async queryTesx(request: QueryTesxRequest): Promise<QueryTesxResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTesxEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试接口
   * Summary: 测试接口
   */
  async queryTesxEx(request: QueryTesxRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTesxResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTesxResponse>(await this.doRequest("1.0", "antchain.demosdk.tesx.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTesxResponse({}));
  }

  /**
   * @remarks
   * Description: 工作台测试接口
   * Summary: 工作台测试接口
   */
  async aaavTestLiuyz(request: AaavTestLiuyzRequest): Promise<AaavTestLiuyzResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.aaavTestLiuyzEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 工作台测试接口
   * Summary: 工作台测试接口
   */
  async aaavTestLiuyzEx(request: AaavTestLiuyzRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AaavTestLiuyzResponse> {
    Util.validateModel(request);
    return $tea.cast<AaavTestLiuyzResponse>(await this.doRequest("1.0", "antchain.demosdk.test.liuyz.aaav", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AaavTestLiuyzResponse({}));
  }

  /**
   * @remarks
   * Description: test
   * Summary: test
   */
  async querySyhf(request: QuerySyhfRequest): Promise<QuerySyhfResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySyhfEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: test
   * Summary: test
   */
  async querySyhfEx(request: QuerySyhfRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySyhfResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySyhfResponse>(await this.doRequest("1.0", "antchain.demosdk.syhf.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySyhfResponse({}));
  }

  /**
   * @remarks
   * Description: 测试sdk打包用
   * Summary: 测试sdk打包用
   */
  async queryBbbCcc(request: QueryBbbCccRequest): Promise<QueryBbbCccResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBbbCccEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试sdk打包用
   * Summary: 测试sdk打包用
   */
  async queryBbbCccEx(request: QueryBbbCccRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBbbCccResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBbbCccResponse>(await this.doRequest("1.0", "antchain.demosdk.bbb.ccc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBbbCccResponse({}));
  }

  /**
   * @remarks
   * Description: 测试用
   * Summary: 测试用
   */
  async importBbbCci(request: ImportBbbCciRequest): Promise<ImportBbbCciResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importBbbCciEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试用
   * Summary: 测试用
   */
  async importBbbCciEx(request: ImportBbbCciRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportBbbCciResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.demosdk.bbb.cci.import",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let importBbbCciResponse = new ImportBbbCciResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return importBbbCciResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<ImportBbbCciResponse>(await this.doRequest("1.0", "antchain.demosdk.bbb.cci.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportBbbCciResponse({}));
  }

  /**
   * @remarks
   * Description: 个人工作台二期全链路测试接口1
   * Summary: 个人工作台二期全链路测试接口1
   */
  async queryTimeLimit(request: QueryTimeLimitRequest): Promise<QueryTimeLimitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTimeLimitEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 个人工作台二期全链路测试接口1
   * Summary: 个人工作台二期全链路测试接口1
   */
  async queryTimeLimitEx(request: QueryTimeLimitRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTimeLimitResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.demosdk.time.limit.query",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let queryTimeLimitResponse = new QueryTimeLimitResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return queryTimeLimitResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<QueryTimeLimitResponse>(await this.doRequest("1.0", "antchain.demosdk.time.limit.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTimeLimitResponse({}));
  }

  /**
   * @remarks
   * Description: 个人工作台二期测试接口2
   * Summary: 个人工作台二期测试接口2
   */
  async queryCacheLimit(request: QueryCacheLimitRequest): Promise<QueryCacheLimitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCacheLimitEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 个人工作台二期测试接口2
   * Summary: 个人工作台二期测试接口2
   */
  async queryCacheLimitEx(request: QueryCacheLimitRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCacheLimitResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCacheLimitResponse>(await this.doRequest("1.0", "antchain.demosdk.cache.limit.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCacheLimitResponse({}));
  }

  /**
   * @remarks
   * Description: 测试接口
   * Summary: 测试接口
   */
  async queryBbbEee(request: QueryBbbEeeRequest): Promise<QueryBbbEeeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBbbEeeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试接口
   * Summary: 测试接口
   */
  async queryBbbEeeEx(request: QueryBbbEeeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBbbEeeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBbbEeeResponse>(await this.doRequest("1.0", "antchain.demosdk.bbb.eee.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBbbEeeResponse({}));
  }

  /**
   * @remarks
   * Description: 测试用
   * Summary: 测试用
   */
  async queryAaaTest(request: QueryAaaTestRequest): Promise<QueryAaaTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAaaTestEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试用
   * Summary: 测试用
   */
  async queryAaaTestEx(request: QueryAaaTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAaaTestResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAaaTestResponse>(await this.doRequest("1.0", "antchain.demosdk.aaa.test.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAaaTestResponse({}));
  }

  /**
   * @remarks
   * Description: 测试
   * Summary: 测试
   */
  async stabilizeBbbCcc(request: StabilizeBbbCccRequest): Promise<StabilizeBbbCccResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.stabilizeBbbCccEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试
   * Summary: 测试
   */
  async stabilizeBbbCccEx(request: StabilizeBbbCccRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StabilizeBbbCccResponse> {
    Util.validateModel(request);
    return $tea.cast<StabilizeBbbCccResponse>(await this.doRequest("1.0", "antchain.demosdk.bbb.ccc.stabilize", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StabilizeBbbCccResponse({}));
  }

  /**
   * @remarks
   * Description: r
   * Summary: r
   */
  async queryMultiCcc(request: QueryMultiCccRequest): Promise<QueryMultiCccResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMultiCccEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: r
   * Summary: r
   */
  async queryMultiCccEx(request: QueryMultiCccRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMultiCccResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMultiCccResponse>(await this.doRequest("1.0", "antchain.demosdk.multi.ccc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMultiCccResponse({}));
  }

  /**
   * @remarks
   * Description: l
   * Summary: l
   */
  async queryAaaCci(request: QueryAaaCciRequest): Promise<QueryAaaCciResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAaaCciEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: l
   * Summary: l
   */
  async queryAaaCciEx(request: QueryAaaCciRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAaaCciResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAaaCciResponse>(await this.doRequest("1.0", "antchain.demosdk.aaa.cci.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAaaCciResponse({}));
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
   * Summary: 测试
   */
  async queryMultiCciu(request: QueryMultiCciuRequest): Promise<QueryMultiCciuResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMultiCciuEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: l
   * Summary: 测试
   */
  async queryMultiCciuEx(request: QueryMultiCciuRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMultiCciuResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMultiCciuResponse>(await this.doRequest("1.0", "antchain.demosdk.multi.cciu.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMultiCciuResponse({}));
  }

  /**
   * @remarks
   * Description: 测试
   * Summary: 测试
   */
  async queryTxt(request: QueryTxtRequest): Promise<QueryTxtResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTxtEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试
   * Summary: 测试
   */
  async queryTxtEx(request: QueryTxtRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTxtResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTxtResponse>(await this.doRequest("1.0", "antchain.demosdk.txt.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTxtResponse({}));
  }

  /**
   * @remarks
   * Description: 测试接口
   * Summary: 测试接口
   */
  async queryRule(request: QueryRuleRequest): Promise<QueryRuleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRuleEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试接口
   * Summary: 测试接口
   */
  async queryRuleEx(request: QueryRuleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRuleResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRuleResponse>(await this.doRequest("1.0", "antchain.demosdk.rule.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRuleResponse({}));
  }

  /**
   * @remarks
   * Description: 个人工作台二期测试使用
   * Summary: 个人工作台二期测试使用
   */
  async apiFileUpload(request: ApiFileUploadRequest): Promise<ApiFileUploadResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.apiFileUploadEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 个人工作台二期测试使用
   * Summary: 个人工作台二期测试使用
   */
  async apiFileUploadEx(request: ApiFileUploadRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApiFileUploadResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.demosdk.file.upload.api",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let apiFileUploadResponse = new ApiFileUploadResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return apiFileUploadResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<ApiFileUploadResponse>(await this.doRequest("1.0", "antchain.demosdk.file.upload.api", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApiFileUploadResponse({}));
  }

  /**
   * @remarks
   * Description: test
   * Summary: test
   */
  async queryTesthfhfhf(request: QueryTesthfhfhfRequest): Promise<QueryTesthfhfhfResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTesthfhfhfEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: test
   * Summary: test
   */
  async queryTesthfhfhfEx(request: QueryTesthfhfhfRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTesthfhfhfResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTesthfhfhfResponse>(await this.doRequest("1.0", "antchain.demosdk.testhfhfhf.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTesthfhfhfResponse({}));
  }

  /**
   * @remarks
   * Description: test
   * Summary: test
   */
  async publishIterationhf(request: PublishIterationhfRequest): Promise<PublishIterationhfResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.publishIterationhfEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: test
   * Summary: test
   */
  async publishIterationhfEx(request: PublishIterationhfRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PublishIterationhfResponse> {
    Util.validateModel(request);
    return $tea.cast<PublishIterationhfResponse>(await this.doRequest("1.0", "antchain.demosdk.iterationhf.publish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PublishIterationhfResponse({}));
  }

  /**
   * @remarks
   * Description: 测试使用
   * Summary: 测试使用
   */
  async queryWorkbenchTests(request: QueryWorkbenchTestsRequest): Promise<QueryWorkbenchTestsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryWorkbenchTestsEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试使用
   * Summary: 测试使用
   */
  async queryWorkbenchTestsEx(request: QueryWorkbenchTestsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryWorkbenchTestsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryWorkbenchTestsResponse>(await this.doRequest("1.0", "antchain.demosdk.workbench.tests.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryWorkbenchTestsResponse({}));
  }

  /**
   * @remarks
   * Description: 测试接口
   * Summary: 测试接口
   */
  async resetBbbCcc(request: ResetBbbCccRequest): Promise<ResetBbbCccResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.resetBbbCccEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试接口
   * Summary: 测试接口
   */
  async resetBbbCccEx(request: ResetBbbCccRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ResetBbbCccResponse> {
    Util.validateModel(request);
    return $tea.cast<ResetBbbCccResponse>(await this.doRequest("1.0", "antchain.demosdk.bbb.ccc.reset", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ResetBbbCccResponse({}));
  }

  /**
   * @remarks
   * Description: 测试接口
   * Summary: 测试接口
   */
  async queryTestSss(request: QueryTestSssRequest): Promise<QueryTestSssResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTestSssEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试接口
   * Summary: 测试接口
   */
  async queryTestSssEx(request: QueryTestSssRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTestSssResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTestSssResponse>(await this.doRequest("1.0", "antchain.demosdk.test.sss.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTestSssResponse({}));
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
   * Summary: 自动化测试创建test1
   */
  async queryAaaCcd(request: QueryAaaCcdRequest): Promise<QueryAaaCcdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAaaCcdEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 自动化测试创建test，请勿修改、删除
   * Summary: 自动化测试创建test1
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
   * Description: 测试
   * Summary: 测试
   */
  async queryCimRun(request: QueryCimRunRequest): Promise<QueryCimRunResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCimRunEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试
   * Summary: 测试
   */
  async queryCimRunEx(request: QueryCimRunRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCimRunResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCimRunResponse>(await this.doRequest("1.0", "antchain.demosdk.cim.run.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCimRunResponse({}));
  }

  /**
   * @remarks
   * Description: 测试
   * Summary: 测试
   */
  async queryRoleList(request: QueryRoleListRequest): Promise<QueryRoleListResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRoleListEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试
   * Summary: 测试
   */
  async queryRoleListEx(request: QueryRoleListRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRoleListResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRoleListResponse>(await this.doRequest("1.0", "antchain.demosdk.role.list.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRoleListResponse({}));
  }

  /**
   * @remarks
   * Description: 测试
   * Summary: 测试
   */
  async importRole(request: ImportRoleRequest): Promise<ImportRoleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importRoleEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试
   * Summary: 测试
   */
  async importRoleEx(request: ImportRoleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportRoleResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportRoleResponse>(await this.doRequest("1.0", "antchain.demosdk.role.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportRoleResponse({}));
  }

  /**
   * @remarks
   * Description: 测试流程
   * Summary: 测试流程
   */
  async resetRole(request: ResetRoleRequest): Promise<ResetRoleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.resetRoleEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试流程
   * Summary: 测试流程
   */
  async resetRoleEx(request: ResetRoleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ResetRoleResponse> {
    Util.validateModel(request);
    return $tea.cast<ResetRoleResponse>(await this.doRequest("1.0", "antchain.demosdk.role.reset", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ResetRoleResponse({}));
  }

  /**
   * @remarks
   * Description: 测试
   * Summary: 测试
   */
  async publishRoleList(request: PublishRoleListRequest): Promise<PublishRoleListResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.publishRoleListEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试
   * Summary: 测试
   */
  async publishRoleListEx(request: PublishRoleListRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PublishRoleListResponse> {
    Util.validateModel(request);
    return $tea.cast<PublishRoleListResponse>(await this.doRequest("1.0", "antchain.demosdk.role.list.publish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PublishRoleListResponse({}));
  }

  /**
   * @remarks
   * Description: 测试
   * Summary: 测试
   */
  async initUserTest(request: InitUserTestRequest): Promise<InitUserTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initUserTestEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试
   * Summary: 测试
   */
  async initUserTestEx(request: InitUserTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitUserTestResponse> {
    Util.validateModel(request);
    return $tea.cast<InitUserTestResponse>(await this.doRequest("1.0", "antchain.demosdk.user.test.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitUserTestResponse({}));
  }

  /**
   * @remarks
   * Description: 测试
   * Summary: 测试
   */
  async execCim(request: ExecCimRequest): Promise<ExecCimResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execCimEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试
   * Summary: 测试
   */
  async execCimEx(request: ExecCimRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecCimResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecCimResponse>(await this.doRequest("1.0", "antchain.demosdk.cim.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecCimResponse({}));
  }

  /**
   * @remarks
   * Description: 测试
   * Summary: 测试
   */
  async queryCcXx(request: QueryCcXxRequest): Promise<QueryCcXxResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCcXxEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试
   * Summary: 测试
   */
  async queryCcXxEx(request: QueryCcXxRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCcXxResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCcXxResponse>(await this.doRequest("1.0", "antchain.demosdk.cc.xx.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCcXxResponse({}));
  }

  /**
   * @remarks
   * Description: test
   * Summary: test
   */
  async lyzaTest(request: LyzaTestRequest): Promise<LyzaTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.lyzaTestEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: test
   * Summary: test
   */
  async lyzaTestEx(request: LyzaTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<LyzaTestResponse> {
    Util.validateModel(request);
    return $tea.cast<LyzaTestResponse>(await this.doRequest("1.0", "antchain.demosdk.test.lyza", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new LyzaTestResponse({}));
  }

  /**
   * @remarks
   * Description: test
   * Summary: test
   */
  async cTestLizAaa(request: CTestLizAaaRequest): Promise<CTestLizAaaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cTestLizAaaEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: test
   * Summary: test
   */
  async cTestLizAaaEx(request: CTestLizAaaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CTestLizAaaResponse> {
    Util.validateModel(request);
    return $tea.cast<CTestLizAaaResponse>(await this.doRequest("1.0", "antchain.demosdk.test.liz.aaa.c", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CTestLizAaaResponse({}));
  }

  /**
   * @remarks
   * Description: 用于个人工作台二期测试使用
   * Summary: 用于个人工作台二期测试使用
   */
  async verifyApiList(request: VerifyApiListRequest): Promise<VerifyApiListResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyApiListEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 用于个人工作台二期测试使用
   * Summary: 用于个人工作台二期测试使用
   */
  async verifyApiListEx(request: VerifyApiListRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyApiListResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyApiListResponse>(await this.doRequest("1.0", "antchain.demosdk.api.list.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyApiListResponse({}));
  }

  /**
   * @remarks
   * Description: 用于个人工作台二期测试使用测试test
   * Summary: 用于个人工作台二期测试使用
   */
  async queryWorkbenchTest(request: QueryWorkbenchTestRequest): Promise<QueryWorkbenchTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryWorkbenchTestEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 用于个人工作台二期测试使用测试test
   * Summary: 用于个人工作台二期测试使用
   */
  async queryWorkbenchTestEx(request: QueryWorkbenchTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryWorkbenchTestResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryWorkbenchTestResponse>(await this.doRequest("1.0", "antchain.demosdk.workbench.test.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryWorkbenchTestResponse({}));
  }

  /**
   * @remarks
   * Description: 用于个人工作台二期测试使用
   * Summary: 用于个人工作台二期测试使用
   */
  async importCreateTest(request: ImportCreateTestRequest): Promise<ImportCreateTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importCreateTestEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 用于个人工作台二期测试使用
   * Summary: 用于个人工作台二期测试使用
   */
  async importCreateTestEx(request: ImportCreateTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportCreateTestResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportCreateTestResponse>(await this.doRequest("1.0", "antchain.demosdk.create.test.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportCreateTestResponse({}));
  }

  /**
   * @remarks
   * Description: 哈哈哈个人工作台二期测试接口test
   * Summary: 个人工作台二期测试接口
   */
  async queryAbcdOne(request: QueryAbcdOneRequest): Promise<QueryAbcdOneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAbcdOneEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 哈哈哈个人工作台二期测试接口test
   * Summary: 个人工作台二期测试接口
   */
  async queryAbcdOneEx(request: QueryAbcdOneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAbcdOneResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAbcdOneResponse>(await this.doRequest("1.0", "antchain.demosdk.abcd.one.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAbcdOneResponse({}));
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
   * Description: 个人工作台二期分组路由灰度测试接口
   * Summary: 个人工作台二期分组路由灰度测试接口
   */
  async resetAbcdLimit(request: ResetAbcdLimitRequest): Promise<ResetAbcdLimitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.resetAbcdLimitEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 个人工作台二期分组路由灰度测试接口
   * Summary: 个人工作台二期分组路由灰度测试接口
   */
  async resetAbcdLimitEx(request: ResetAbcdLimitRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ResetAbcdLimitResponse> {
    Util.validateModel(request);
    return $tea.cast<ResetAbcdLimitResponse>(await this.doRequest("1.0", "antchain.demosdk.abcd.limit.reset", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ResetAbcdLimitResponse({}));
  }

  /**
   * @remarks
   * Description: 个人工作台二期分组路由测试接口
   * Summary: 个人工作台二期分组路由测试接口
   */
  async registerAbcdLimit(request: RegisterAbcdLimitRequest): Promise<RegisterAbcdLimitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerAbcdLimitEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 个人工作台二期分组路由测试接口
   * Summary: 个人工作台二期分组路由测试接口
   */
  async registerAbcdLimitEx(request: RegisterAbcdLimitRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterAbcdLimitResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterAbcdLimitResponse>(await this.doRequest("1.0", "antchain.demosdk.abcd.limit.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterAbcdLimitResponse({}));
  }

  /**
   * @remarks
   * Description: 个人工作台预发测试使用
   * Summary: 个人工作台预发测试使用
   */
  async queryTwiceOne(request: QueryTwiceOneRequest): Promise<QueryTwiceOneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTwiceOneEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 个人工作台预发测试使用
   * Summary: 个人工作台预发测试使用
   */
  async queryTwiceOneEx(request: QueryTwiceOneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTwiceOneResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTwiceOneResponse>(await this.doRequest("1.0", "antchain.demosdk.twice.one.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTwiceOneResponse({}));
  }

  /**
   * @remarks
   * Description: 个人工作台二期预发测试
   * Summary: 个人工作台二期预发测试
   */
  async importTwiceOne(request: ImportTwiceOneRequest): Promise<ImportTwiceOneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importTwiceOneEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 个人工作台二期预发测试
   * Summary: 个人工作台二期预发测试
   */
  async importTwiceOneEx(request: ImportTwiceOneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportTwiceOneResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportTwiceOneResponse>(await this.doRequest("1.0", "antchain.demosdk.twice.one.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportTwiceOneResponse({}));
  }

  /**
   * @remarks
   * Description: 个人工作台二期预发测试
   * Summary: 个人工作台二期预发测试
   */
  async publishTwiceOne(request: PublishTwiceOneRequest): Promise<PublishTwiceOneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.publishTwiceOneEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 个人工作台二期预发测试
   * Summary: 个人工作台二期预发测试
   */
  async publishTwiceOneEx(request: PublishTwiceOneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PublishTwiceOneResponse> {
    Util.validateModel(request);
    return $tea.cast<PublishTwiceOneResponse>(await this.doRequest("1.0", "antchain.demosdk.twice.one.publish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PublishTwiceOneResponse({}));
  }

  /**
   * @remarks
   * Description: 用于个人工作台二期测试使用
   * Summary: 用于个人工作台二期测试使用
   */
  async importCreateOne(request: ImportCreateOneRequest): Promise<ImportCreateOneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importCreateOneEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 用于个人工作台二期测试使用
   * Summary: 用于个人工作台二期测试使用
   */
  async importCreateOneEx(request: ImportCreateOneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportCreateOneResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportCreateOneResponse>(await this.doRequest("1.0", "antchain.demosdk.create.one.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportCreateOneResponse({}));
  }

  /**
   * @remarks
   * Description: 用于个人工作台二期测试使用
   * Summary: 用于个人工作台二期测试使用
   */
  async queryCreateTwo(request: QueryCreateTwoRequest): Promise<QueryCreateTwoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCreateTwoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 用于个人工作台二期测试使用
   * Summary: 用于个人工作台二期测试使用
   */
  async queryCreateTwoEx(request: QueryCreateTwoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCreateTwoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCreateTwoResponse>(await this.doRequest("1.0", "antchain.demosdk.create.two.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCreateTwoResponse({}));
  }

  /**
   * @remarks
   * Description: 用于个人工作台二期测试使用
   * Summary: 用于个人工作台二期测试使用
   */
  async importCreateThree(request: ImportCreateThreeRequest): Promise<ImportCreateThreeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importCreateThreeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 用于个人工作台二期测试使用
   * Summary: 用于个人工作台二期测试使用
   */
  async importCreateThreeEx(request: ImportCreateThreeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportCreateThreeResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportCreateThreeResponse>(await this.doRequest("1.0", "antchain.demosdk.create.three.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportCreateThreeResponse({}));
  }

  /**
   * @remarks
   * Description: 个人工作台二期预发测试
   * Summary: 个人工作台二期预发测试
   */
  async withdrawTwiceOne(request: WithdrawTwiceOneRequest): Promise<WithdrawTwiceOneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.withdrawTwiceOneEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 个人工作台二期预发测试
   * Summary: 个人工作台二期预发测试
   */
  async withdrawTwiceOneEx(request: WithdrawTwiceOneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<WithdrawTwiceOneResponse> {
    Util.validateModel(request);
    return $tea.cast<WithdrawTwiceOneResponse>(await this.doRequest("1.0", "antchain.demosdk.twice.one.withdraw", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new WithdrawTwiceOneResponse({}));
  }

  /**
   * @remarks
   * Description: 个人工作台二期预发测试
   * Summary: 个人工作台二期预发测试
   */
  async operateTwiceOne(request: OperateTwiceOneRequest): Promise<OperateTwiceOneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateTwiceOneEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 个人工作台二期预发测试
   * Summary: 个人工作台二期预发测试
   */
  async operateTwiceOneEx(request: OperateTwiceOneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateTwiceOneResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateTwiceOneResponse>(await this.doRequest("1.0", "antchain.demosdk.twice.one.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateTwiceOneResponse({}));
  }

  /**
   * @remarks
   * Description: 个人工作台二期预发测试
   * Summary: 个人工作台二期预发测试
   */
  async queryTwiceTwo(request: QueryTwiceTwoRequest): Promise<QueryTwiceTwoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTwiceTwoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 个人工作台二期预发测试
   * Summary: 个人工作台二期预发测试
   */
  async queryTwiceTwoEx(request: QueryTwiceTwoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTwiceTwoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTwiceTwoResponse>(await this.doRequest("1.0", "antchain.demosdk.twice.two.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTwiceTwoResponse({}));
  }

  /**
   * @remarks
   * Description: 测试刷新cachekey
   * Summary: 测试刷新cachekey
   */
  async queryTest(request: QueryTestRequest): Promise<QueryTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTestEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试刷新cachekey
   * Summary: 测试刷新cachekey
   */
  async queryTestEx(request: QueryTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTestResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTestResponse>(await this.doRequest("1.0", "antchain.demosdk.test.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTestResponse({}));
  }

  /**
   * @remarks
   * Description: 测试刷新cachekey
   * Summary: 测试刷新cachekey
   */
  async importTest(request: ImportTestRequest): Promise<ImportTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importTestEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试刷新cachekey
   * Summary: 测试刷新cachekey
   */
  async importTestEx(request: ImportTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportTestResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportTestResponse>(await this.doRequest("1.0", "antchain.demosdk.test.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportTestResponse({}));
  }

  /**
   * @remarks
   * Description: 测试灰度刷新缓存范围
   * Summary: 测试灰度刷新缓存范围
   */
  async stabilizeTest(request: StabilizeTestRequest): Promise<StabilizeTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.stabilizeTestEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试灰度刷新缓存范围
   * Summary: 测试灰度刷新缓存范围
   */
  async stabilizeTestEx(request: StabilizeTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StabilizeTestResponse> {
    Util.validateModel(request);
    return $tea.cast<StabilizeTestResponse>(await this.doRequest("1.0", "antchain.demosdk.test.stabilize", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StabilizeTestResponse({}));
  }

  /**
   * @remarks
   * Description: 个人工作台二期预发测试
   * Summary: 个人工作台二期预发测试
   */
  async queryTwiceThree(request: QueryTwiceThreeRequest): Promise<QueryTwiceThreeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTwiceThreeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 个人工作台二期预发测试
   * Summary: 个人工作台二期预发测试
   */
  async queryTwiceThreeEx(request: QueryTwiceThreeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTwiceThreeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTwiceThreeResponse>(await this.doRequest("1.0", "antchain.demosdk.twice.three.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTwiceThreeResponse({}));
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
   * Description: 测试刷新cachekey
   * Summary: 测试刷新cachekey
   */
  async unstabilizeTest(request: UnstabilizeTestRequest): Promise<UnstabilizeTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.unstabilizeTestEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试刷新cachekey
   * Summary: 测试刷新cachekey
   */
  async unstabilizeTestEx(request: UnstabilizeTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UnstabilizeTestResponse> {
    Util.validateModel(request);
    return $tea.cast<UnstabilizeTestResponse>(await this.doRequest("1.0", "antchain.demosdk.test.unstabilize", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UnstabilizeTestResponse({}));
  }

  /**
   * @remarks
   * Description: 测试
   * Summary: 测试
   */
  async queryTestXc(request: QueryTestXcRequest): Promise<QueryTestXcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTestXcEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试
   * Summary: 测试
   */
  async queryTestXcEx(request: QueryTestXcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTestXcResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTestXcResponse>(await this.doRequest("1.0", "antchain.demosdk.test.xc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTestXcResponse({}));
  }

  /**
   * @remarks
   * Description: test
   * Summary: test
   */
  async queryTestSya(request: QueryTestSyaRequest): Promise<QueryTestSyaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTestSyaEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: test
   * Summary: test
   */
  async queryTestSyaEx(request: QueryTestSyaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTestSyaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTestSyaResponse>(await this.doRequest("1.0", "antchain.demosdk.test.sya.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTestSyaResponse({}));
  }

  /**
   * @remarks
   * Description: 用于个人工作台二期测试使用
   * Summary: 用于个人工作台二期测试使用
   */
  async queryQqqWww(request: QueryQqqWwwRequest): Promise<QueryQqqWwwResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryQqqWwwEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 用于个人工作台二期测试使用
   * Summary: 用于个人工作台二期测试使用
   */
  async queryQqqWwwEx(request: QueryQqqWwwRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryQqqWwwResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryQqqWwwResponse>(await this.doRequest("1.0", "antchain.demosdk.qqq.www.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryQqqWwwResponse({}));
  }

  /**
   * @remarks
   * Description: 个人工作台二期预发测试
   * Summary: 个人工作台二期预发测试
   */
  async stabilizeTwiceThree(request: StabilizeTwiceThreeRequest): Promise<StabilizeTwiceThreeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.stabilizeTwiceThreeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 个人工作台二期预发测试
   * Summary: 个人工作台二期预发测试
   */
  async stabilizeTwiceThreeEx(request: StabilizeTwiceThreeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StabilizeTwiceThreeResponse> {
    Util.validateModel(request);
    return $tea.cast<StabilizeTwiceThreeResponse>(await this.doRequest("1.0", "antchain.demosdk.twice.three.stabilize", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StabilizeTwiceThreeResponse({}));
  }

  /**
   * @remarks
   * Description: 个人工作台二期预发测试
   * Summary: 个人工作台二期预发测试
   */
  async unstabilizeTwiceThree(request: UnstabilizeTwiceThreeRequest): Promise<UnstabilizeTwiceThreeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.unstabilizeTwiceThreeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 个人工作台二期预发测试
   * Summary: 个人工作台二期预发测试
   */
  async unstabilizeTwiceThreeEx(request: UnstabilizeTwiceThreeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UnstabilizeTwiceThreeResponse> {
    Util.validateModel(request);
    return $tea.cast<UnstabilizeTwiceThreeResponse>(await this.doRequest("1.0", "antchain.demosdk.twice.three.unstabilize", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UnstabilizeTwiceThreeResponse({}));
  }

  /**
   * @remarks
   * Description: 测试用
   * Summary: 测试用
   */
  async queryBbbAatest(request: QueryBbbAatestRequest): Promise<QueryBbbAatestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBbbAatestEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试用
   * Summary: 测试用
   */
  async queryBbbAatestEx(request: QueryBbbAatestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBbbAatestResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBbbAatestResponse>(await this.doRequest("1.0", "antchain.demosdk.bbb.aatest.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBbbAatestResponse({}));
  }

  /**
   * @remarks
   * Description: 测试接口
   * Summary: 测试接口
   */
  async paramLiuyzTest(request: ParamLiuyzTestRequest): Promise<ParamLiuyzTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.paramLiuyzTestEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试接口
   * Summary: 测试接口
   */
  async paramLiuyzTestEx(request: ParamLiuyzTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ParamLiuyzTestResponse> {
    Util.validateModel(request);
    return $tea.cast<ParamLiuyzTestResponse>(await this.doRequest("1.0", "antchain.demosdk.liuyz.test.param", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ParamLiuyzTestResponse({}));
  }

  /**
   * @remarks
   * Description: 测试接口
   * Summary: 测试接口
   */
  async lllProxyLyzTest(request: LllProxyLyzTestRequest): Promise<LllProxyLyzTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.lllProxyLyzTestEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 测试接口
   * Summary: 测试接口
   */
  async lllProxyLyzTestEx(request: LllProxyLyzTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<LllProxyLyzTestResponse> {
    Util.validateModel(request);
    return $tea.cast<LllProxyLyzTestResponse>(await this.doRequest("1.0", "antchain.demosdk.proxy.lyz.test.lll", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new LllProxyLyzTestResponse({}));
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
