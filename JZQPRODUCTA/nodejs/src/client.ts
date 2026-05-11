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

export class TestDemoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 1
  demo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      demo: 'demo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      demo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class TestDemoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 1
  count?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      count: 'count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      count: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApiWithdrawRequest extends $tea.Model {
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

export class ApiWithdrawResponse extends $tea.Model {
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

export class QueryPreformanceTestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceTestResponse extends $tea.Model {
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

export class QueryPreformanceOnjgraRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceOnjgraResponse extends $tea.Model {
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

export class QueryPreformanceCgscczRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceCgscczResponse extends $tea.Model {
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

export class QueryPreformanceRyhdhnRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceRyhdhnResponse extends $tea.Model {
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

export class QueryPreformanceQcbszeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceQcbszeResponse extends $tea.Model {
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

export class QueryPreformanceScilwtRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceScilwtResponse extends $tea.Model {
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

export class QueryPreformanceZdsrecRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceZdsrecResponse extends $tea.Model {
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

export class QueryPreformanceIezhucRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceIezhucResponse extends $tea.Model {
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

export class QueryPreformanceXjdezpRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceXjdezpResponse extends $tea.Model {
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

export class QueryPreformanceDjuoinRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceDjuoinResponse extends $tea.Model {
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

export class QueryPreformanceBagemgRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceBagemgResponse extends $tea.Model {
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

export class QueryPreformanceDpvzbtRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceDpvzbtResponse extends $tea.Model {
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

export class QueryPreformanceGziwauRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceGziwauResponse extends $tea.Model {
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

export class QueryPreformanceVhpywuRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceVhpywuResponse extends $tea.Model {
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

export class QueryPreformanceJsulhtRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceJsulhtResponse extends $tea.Model {
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

export class QueryPreformanceIvcyplRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceIvcyplResponse extends $tea.Model {
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

export class QueryPreformanceGmylkmRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceGmylkmResponse extends $tea.Model {
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

export class QueryPreformanceYcdqltRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceYcdqltResponse extends $tea.Model {
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

export class QueryPreformanceTmspncRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceTmspncResponse extends $tea.Model {
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

export class QueryPreformanceSghpbdRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceSghpbdResponse extends $tea.Model {
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

export class QueryPreformanceRhuirbRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceRhuirbResponse extends $tea.Model {
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

export class QueryPreformanceZcvaeaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceZcvaeaResponse extends $tea.Model {
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

export class QueryPreformanceGhohidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceGhohidResponse extends $tea.Model {
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

export class QueryPreformanceMcxrxmRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceMcxrxmResponse extends $tea.Model {
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

export class QueryPreformanceYdbeozRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceYdbeozResponse extends $tea.Model {
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

export class QueryPreformanceGqiyjtRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceGqiyjtResponse extends $tea.Model {
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

export class QueryPreformanceFlmtjeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceFlmtjeResponse extends $tea.Model {
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

export class QueryPreformanceIhmckrRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceIhmckrResponse extends $tea.Model {
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

export class QueryPreformanceVuhkynRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceVuhkynResponse extends $tea.Model {
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

export class QueryPreformanceCdyiujRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceCdyiujResponse extends $tea.Model {
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

export class QueryPreformanceQcenzcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceQcenzcResponse extends $tea.Model {
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

export class QueryPreformanceKrohvyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceKrohvyResponse extends $tea.Model {
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

export class QueryPreformanceNpyznvRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceNpyznvResponse extends $tea.Model {
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

export class QueryPreformanceLqbvkmRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceLqbvkmResponse extends $tea.Model {
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

export class QueryPreformanceFjxvfjRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceFjxvfjResponse extends $tea.Model {
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

export class QueryPreformanceEqoghcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceEqoghcResponse extends $tea.Model {
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

export class QueryPreformanceQuklgcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceQuklgcResponse extends $tea.Model {
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

export class QueryPreformanceOtekpgRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceOtekpgResponse extends $tea.Model {
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

export class QueryPreformanceFnipumRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceFnipumResponse extends $tea.Model {
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

export class QueryPreformanceEhhgnqRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceEhhgnqResponse extends $tea.Model {
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

export class QueryPreformanceNtrmkkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceNtrmkkResponse extends $tea.Model {
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

export class QueryPreformanceCdjnvmRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceCdjnvmResponse extends $tea.Model {
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

export class QueryPreformanceZnmzzvRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceZnmzzvResponse extends $tea.Model {
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

export class QueryPreformanceJhxufrRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceJhxufrResponse extends $tea.Model {
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

export class QueryPreformanceBvhiaaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceBvhiaaResponse extends $tea.Model {
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

export class QueryPreformanceXkpsmyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceXkpsmyResponse extends $tea.Model {
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

export class QueryPreformanceUvqflcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceUvqflcResponse extends $tea.Model {
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

export class QueryPreformanceVyjnjhRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceVyjnjhResponse extends $tea.Model {
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

export class QueryPreformanceQdwewwRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceQdwewwResponse extends $tea.Model {
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

export class QueryPreformanceYxsifpRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceYxsifpResponse extends $tea.Model {
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

export class QueryPreformanceEfvjvzRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceEfvjvzResponse extends $tea.Model {
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

export class QueryPreformanceJppmohRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceJppmohResponse extends $tea.Model {
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

export class QueryPreformanceVcwcvoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceVcwcvoResponse extends $tea.Model {
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

export class QueryPreformanceBdbqlwRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceBdbqlwResponse extends $tea.Model {
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

export class QueryPreformanceAqmmruRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceAqmmruResponse extends $tea.Model {
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

export class QueryPreformanceRvieyvRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceRvieyvResponse extends $tea.Model {
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

export class QueryPreformanceDmopqgRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceDmopqgResponse extends $tea.Model {
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

export class QueryPreformanceJiccssRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceJiccssResponse extends $tea.Model {
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

export class QueryPreformanceHlqjtdRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceHlqjtdResponse extends $tea.Model {
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

export class QueryPreformanceLaldyfRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceLaldyfResponse extends $tea.Model {
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

export class QueryPreformanceYbynjwRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceYbynjwResponse extends $tea.Model {
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

export class QueryPreformanceFsinwzRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceFsinwzResponse extends $tea.Model {
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

export class QueryPreformancePgfxxnRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformancePgfxxnResponse extends $tea.Model {
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

export class QueryPreformanceQuinflRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceQuinflResponse extends $tea.Model {
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

export class QueryPreformanceYxgwyyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceYxgwyyResponse extends $tea.Model {
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

export class QueryPreformanceNendtwRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceNendtwResponse extends $tea.Model {
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

export class QueryPreformanceFtjeczRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceFtjeczResponse extends $tea.Model {
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

export class QueryPreformanceEputrhRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceEputrhResponse extends $tea.Model {
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

export class QueryPreformanceVspsumRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceVspsumResponse extends $tea.Model {
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

export class QueryPreformanceZlwaueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceZlwaueResponse extends $tea.Model {
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

export class QueryPreformanceMqaojrRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceMqaojrResponse extends $tea.Model {
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

export class QueryPreformanceBfcfqdRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceBfcfqdResponse extends $tea.Model {
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

export class QueryPreformanceYcfsafRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceYcfsafResponse extends $tea.Model {
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

export class QueryPreformanceZwpmyiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceZwpmyiResponse extends $tea.Model {
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

export class QueryPreformanceMvgnlaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceMvgnlaResponse extends $tea.Model {
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

export class QueryPreformanceVlmrpmRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceVlmrpmResponse extends $tea.Model {
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

export class QueryPreformanceKfygrpRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceKfygrpResponse extends $tea.Model {
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

export class QueryPreformanceKqdmywRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceKqdmywResponse extends $tea.Model {
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

export class QueryPreformanceIdrolcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceIdrolcResponse extends $tea.Model {
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

export class QueryPreformanceGoxdkkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceGoxdkkResponse extends $tea.Model {
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

export class QueryPreformanceJnrlwyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceJnrlwyResponse extends $tea.Model {
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

export class QueryPreformanceYoiwnfRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceYoiwnfResponse extends $tea.Model {
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

export class QueryPreformancePxtfgcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformancePxtfgcResponse extends $tea.Model {
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

export class QueryPreformanceGbigiaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceGbigiaResponse extends $tea.Model {
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

export class QueryPreformanceGohgooRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceGohgooResponse extends $tea.Model {
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

export class QueryPreformanceQzijugRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceQzijugResponse extends $tea.Model {
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

export class QueryPreformanceDtiqsmRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceDtiqsmResponse extends $tea.Model {
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

export class QueryPreformanceIapwkxRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceIapwkxResponse extends $tea.Model {
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

export class QueryPreformanceAarwuqRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceAarwuqResponse extends $tea.Model {
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

export class QueryPreformanceEgsbveRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceEgsbveResponse extends $tea.Model {
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

export class QueryPreformanceUdgzvlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceUdgzvlResponse extends $tea.Model {
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

export class QueryPreformanceOxzmsdRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceOxzmsdResponse extends $tea.Model {
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

export class QueryPreformanceWrbogxRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceWrbogxResponse extends $tea.Model {
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

export class QueryPreformanceSovdsqRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceSovdsqResponse extends $tea.Model {
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

export class QueryPreformanceKmenziRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceKmenziResponse extends $tea.Model {
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

export class QueryPreformanceNdyzvbRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceNdyzvbResponse extends $tea.Model {
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

export class QueryPreformancePleorxRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformancePleorxResponse extends $tea.Model {
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

export class QueryPreformanceErldmsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceErldmsResponse extends $tea.Model {
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

export class QueryPreformancePstmvtRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformancePstmvtResponse extends $tea.Model {
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

export class QueryPreformanceRgcensRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceRgcensResponse extends $tea.Model {
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

export class QueryPreformanceDfawnnRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceDfawnnResponse extends $tea.Model {
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

export class QueryPreformanceYzzbsmRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceYzzbsmResponse extends $tea.Model {
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

export class QueryPreformanceSybmpkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceSybmpkResponse extends $tea.Model {
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

export class QueryPreformanceZtxnbkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceZtxnbkResponse extends $tea.Model {
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

export class QueryPreformanceTtttjpRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceTtttjpResponse extends $tea.Model {
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

export class QueryPreformanceKpnmpvRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceKpnmpvResponse extends $tea.Model {
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

export class QueryPreformanceYquegwRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceYquegwResponse extends $tea.Model {
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

export class QueryPreformanceYjmbylRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceYjmbylResponse extends $tea.Model {
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

export class QueryPreformanceGjnnnvRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceGjnnnvResponse extends $tea.Model {
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

export class QueryPreformanceCgcmkvRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceCgcmkvResponse extends $tea.Model {
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

export class QueryPreformanceVtqjtiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceVtqjtiResponse extends $tea.Model {
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

export class QueryPreformanceZazxkcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceZazxkcResponse extends $tea.Model {
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

export class QueryPreformanceNxifyyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceNxifyyResponse extends $tea.Model {
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

export class QueryPreformanceZnlzkiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceZnlzkiResponse extends $tea.Model {
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

export class QueryPreformanceVcvcvyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceVcvcvyResponse extends $tea.Model {
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

export class QueryPreformanceXuchrmRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceXuchrmResponse extends $tea.Model {
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

export class QueryPreformanceZtkrkpRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceZtkrkpResponse extends $tea.Model {
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

export class QueryPreformanceJetnghRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceJetnghResponse extends $tea.Model {
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

export class QueryPreformanceBgtghlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceBgtghlResponse extends $tea.Model {
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

export class QueryPreformanceVwquksRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceVwquksResponse extends $tea.Model {
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

export class QueryPreformanceElcoqaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceElcoqaResponse extends $tea.Model {
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

export class QueryPreformanceSwzidtRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceSwzidtResponse extends $tea.Model {
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

export class QueryPreformanceLepjayRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceLepjayResponse extends $tea.Model {
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

export class QueryPreformanceWssfmiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceWssfmiResponse extends $tea.Model {
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

export class QueryPreformanceHiiibpRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceHiiibpResponse extends $tea.Model {
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

export class QueryPreformanceIlsifvRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceIlsifvResponse extends $tea.Model {
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

export class QueryPreformanceQrrdcgRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceQrrdcgResponse extends $tea.Model {
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

export class QueryPreformanceOeffbqRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceOeffbqResponse extends $tea.Model {
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

export class QueryPreformanceBfnylcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceBfnylcResponse extends $tea.Model {
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

export class QueryPreformanceKhmkcuRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceKhmkcuResponse extends $tea.Model {
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

export class QueryPreformanceXahvpkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceXahvpkResponse extends $tea.Model {
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

export class QueryPreformancePajjznRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformancePajjznResponse extends $tea.Model {
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

export class QueryPreformanceLrwablRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceLrwablResponse extends $tea.Model {
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

export class QueryPreformanceQccygnRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceQccygnResponse extends $tea.Model {
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

export class QueryPreformanceHtqkxtRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceHtqkxtResponse extends $tea.Model {
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

export class QueryPreformanceMitdkqRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceMitdkqResponse extends $tea.Model {
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

export class QueryPreformancePrbsekRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformancePrbsekResponse extends $tea.Model {
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

export class QueryPreformanceVrqoxoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceVrqoxoResponse extends $tea.Model {
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

export class QueryPreformanceUcltcuRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceUcltcuResponse extends $tea.Model {
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

export class QueryPreformanceMzmhjmRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceMzmhjmResponse extends $tea.Model {
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

export class QueryPreformanceUgztluRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceUgztluResponse extends $tea.Model {
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

export class QueryPreformanceYkrosjRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceYkrosjResponse extends $tea.Model {
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

export class QueryPreformanceGflgulRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceGflgulResponse extends $tea.Model {
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

export class QueryPreformanceXwkppoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceXwkppoResponse extends $tea.Model {
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

export class QueryPreformanceVmvwlqRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceVmvwlqResponse extends $tea.Model {
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

export class QueryPreformanceLeciagRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceLeciagResponse extends $tea.Model {
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

export class QueryPreformanceYhfxnrRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceYhfxnrResponse extends $tea.Model {
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

export class QueryPreformanceTmuqnsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceTmuqnsResponse extends $tea.Model {
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

export class QueryPreformanceAzmyssRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceAzmyssResponse extends $tea.Model {
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

export class QueryPreformanceXnkkmhRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceXnkkmhResponse extends $tea.Model {
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

export class QueryPreformanceBngodmRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceBngodmResponse extends $tea.Model {
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

export class QueryPreformanceTtvegrRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceTtvegrResponse extends $tea.Model {
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

export class QueryPreformanceHaarbkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceHaarbkResponse extends $tea.Model {
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

export class QueryPreformanceOnualkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceOnualkResponse extends $tea.Model {
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

export class QueryPreformanceZrjcrwRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceZrjcrwResponse extends $tea.Model {
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

export class QueryPreformanceBztkaaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceBztkaaResponse extends $tea.Model {
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

export class QueryPreformanceMtpvfgRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceMtpvfgResponse extends $tea.Model {
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

export class QueryPreformanceTysxvoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceTysxvoResponse extends $tea.Model {
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

export class QueryPreformanceKmexgpRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceKmexgpResponse extends $tea.Model {
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

export class QueryPreformancePwqvffRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformancePwqvffResponse extends $tea.Model {
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

export class QueryPreformanceTuyazjRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceTuyazjResponse extends $tea.Model {
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

export class QueryPreformanceSeidvgRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceSeidvgResponse extends $tea.Model {
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

export class QueryPreformanceMbtpawRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceMbtpawResponse extends $tea.Model {
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

export class QueryPreformanceFxblowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceFxblowResponse extends $tea.Model {
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

export class QueryPreformanceAequnwRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceAequnwResponse extends $tea.Model {
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

export class QueryPreformanceKksgngRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceKksgngResponse extends $tea.Model {
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

export class QueryPreformanceEplydbRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceEplydbResponse extends $tea.Model {
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

export class QueryPreformanceLkdxvsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceLkdxvsResponse extends $tea.Model {
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

export class QueryPreformancePkwuzmRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformancePkwuzmResponse extends $tea.Model {
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

export class QueryPreformanceTgagmiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceTgagmiResponse extends $tea.Model {
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

export class QueryPreformanceDadqnvRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceDadqnvResponse extends $tea.Model {
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

export class QueryPreformanceCfxhofRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceCfxhofResponse extends $tea.Model {
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

export class QueryPreformanceFlukhlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceFlukhlResponse extends $tea.Model {
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

export class QueryPreformanceDuwewnRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceDuwewnResponse extends $tea.Model {
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

export class QueryPreformanceJcgpsjRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceJcgpsjResponse extends $tea.Model {
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

export class QueryPreformanceIeexfuRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceIeexfuResponse extends $tea.Model {
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

export class QueryPreformanceGalthwRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceGalthwResponse extends $tea.Model {
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

export class QueryPreformanceFnmdohRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceFnmdohResponse extends $tea.Model {
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

export class QueryPreformanceXngfdiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceXngfdiResponse extends $tea.Model {
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

export class QueryPreformanceHynnnnRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceHynnnnResponse extends $tea.Model {
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

export class QueryPreformanceDyjtoyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceDyjtoyResponse extends $tea.Model {
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

export class QueryPreformanceWenfdhRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceWenfdhResponse extends $tea.Model {
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

export class QueryPreformanceJrctdxRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceJrctdxResponse extends $tea.Model {
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

export class QueryPreformanceDfdlkvRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceDfdlkvResponse extends $tea.Model {
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

export class QueryPreformanceKnwgewRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceKnwgewResponse extends $tea.Model {
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

export class QueryPreformanceApifsyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceApifsyResponse extends $tea.Model {
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

export class QueryPreformanceMjgxpvRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceMjgxpvResponse extends $tea.Model {
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

export class QueryPreformanceAskegsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceAskegsResponse extends $tea.Model {
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

export class QueryPreformanceJajelfRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceJajelfResponse extends $tea.Model {
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

export class QueryPreformanceKstsxlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceKstsxlResponse extends $tea.Model {
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

export class QueryPreformanceYihqycRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceYihqycResponse extends $tea.Model {
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

export class QueryPreformancePaqvegRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformancePaqvegResponse extends $tea.Model {
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

export class QueryPreformanceVgtiiuRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceVgtiiuResponse extends $tea.Model {
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

export class QueryPreformanceSdlanzRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceSdlanzResponse extends $tea.Model {
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

export class QueryPreformanceKkxxkfRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceKkxxkfResponse extends $tea.Model {
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

export class QueryPreformanceEglmkoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceEglmkoResponse extends $tea.Model {
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

export class QueryPreformanceOquwumRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceOquwumResponse extends $tea.Model {
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

export class QueryPreformanceGsnlkhRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceGsnlkhResponse extends $tea.Model {
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

export class QueryPreformanceOjswwdRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceOjswwdResponse extends $tea.Model {
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

export class QueryPreformanceLmpubpRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceLmpubpResponse extends $tea.Model {
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

export class QueryPreformanceMvjqpqRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceMvjqpqResponse extends $tea.Model {
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

export class QueryPreformanceUpavrgRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceUpavrgResponse extends $tea.Model {
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

export class QueryPreformanceHovxvtRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceHovxvtResponse extends $tea.Model {
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

export class QueryPreformanceLpgyzxRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceLpgyzxResponse extends $tea.Model {
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

export class QueryPreformancePhleouRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformancePhleouResponse extends $tea.Model {
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

export class QueryPreformanceEzhhniRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceEzhhniResponse extends $tea.Model {
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

export class QueryPreformanceVmkggaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceVmkggaResponse extends $tea.Model {
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

export class QueryPreformanceSbsurxRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceSbsurxResponse extends $tea.Model {
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

export class QueryPreformanceGxqzrqRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceGxqzrqResponse extends $tea.Model {
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

export class QueryPreformanceHvgdsqRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceHvgdsqResponse extends $tea.Model {
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

export class QueryPreformanceKatrmiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceKatrmiResponse extends $tea.Model {
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

export class QueryPreformanceRdkcqdRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceRdkcqdResponse extends $tea.Model {
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

export class QueryPreformanceYdpsaoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceYdpsaoResponse extends $tea.Model {
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

export class QueryPreformanceFbqfgdRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceFbqfgdResponse extends $tea.Model {
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

export class QueryPreformanceVyqznvRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceVyqznvResponse extends $tea.Model {
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

export class QueryPreformanceIwhkbpRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceIwhkbpResponse extends $tea.Model {
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

export class QueryPreformanceGcavtcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceGcavtcResponse extends $tea.Model {
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

export class QueryPreformanceEigmbuRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceEigmbuResponse extends $tea.Model {
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

export class QueryPreformanceNsxzrqRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceNsxzrqResponse extends $tea.Model {
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

export class QueryPreformanceHzlepwRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceHzlepwResponse extends $tea.Model {
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

export class QueryPreformanceUpoctvRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceUpoctvResponse extends $tea.Model {
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

export class QueryPreformancePdyotjRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformancePdyotjResponse extends $tea.Model {
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

export class QueryPreformanceQfhcuyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceQfhcuyResponse extends $tea.Model {
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

export class QueryPreformanceJuynknRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceJuynknResponse extends $tea.Model {
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

export class QueryPreformanceTxdmeoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceTxdmeoResponse extends $tea.Model {
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

export class QueryPreformanceKcjxngRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceKcjxngResponse extends $tea.Model {
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

export class QueryPreformanceXyfytzRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceXyfytzResponse extends $tea.Model {
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

export class QueryPreformanceHxmzyiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceHxmzyiResponse extends $tea.Model {
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

export class QueryPreformanceSxdzlbRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceSxdzlbResponse extends $tea.Model {
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

export class QueryPreformanceZmuzkgRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceZmuzkgResponse extends $tea.Model {
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

export class QueryPreformanceAiojyzRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceAiojyzResponse extends $tea.Model {
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

export class QueryPreformanceQxhgmlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceQxhgmlResponse extends $tea.Model {
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

export class QueryPreformanceUbklssRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceUbklssResponse extends $tea.Model {
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

export class QueryPreformanceGcavnvRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceGcavnvResponse extends $tea.Model {
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

export class QueryPreformanceUcybsnRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceUcybsnResponse extends $tea.Model {
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

export class QueryPreformanceAzwtosRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceAzwtosResponse extends $tea.Model {
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

export class QueryPreformanceWrbbytRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceWrbbytResponse extends $tea.Model {
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

export class QueryPreformanceIvbcwvRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceIvbcwvResponse extends $tea.Model {
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

export class QueryPreformanceTvcsigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceTvcsigResponse extends $tea.Model {
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

export class QueryPreformanceVvsvkxRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceVvsvkxResponse extends $tea.Model {
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

export class QueryPreformanceRxetnjRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceRxetnjResponse extends $tea.Model {
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

export class QueryPreformanceDulefcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceDulefcResponse extends $tea.Model {
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

export class QueryPreformanceJsazbwRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceJsazbwResponse extends $tea.Model {
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

export class QueryPreformanceXhzfcaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceXhzfcaResponse extends $tea.Model {
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

export class QueryPreformanceDgzghrRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceDgzghrResponse extends $tea.Model {
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

export class QueryPreformanceDmjttzRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceDmjttzResponse extends $tea.Model {
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

export class QueryPreformanceCahjgjRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceCahjgjResponse extends $tea.Model {
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

export class QueryPreformanceRjbfvtRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceRjbfvtResponse extends $tea.Model {
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

export class QueryPreformanceAywijlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceAywijlResponse extends $tea.Model {
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

export class QueryPreformanceBcjihiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceBcjihiResponse extends $tea.Model {
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

export class QueryPreformanceVewdbwRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceVewdbwResponse extends $tea.Model {
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

export class QueryPreformanceWgbntjRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceWgbntjResponse extends $tea.Model {
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

export class QueryPreformanceDwzzxqRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceDwzzxqResponse extends $tea.Model {
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

export class QueryPreformanceMhldihRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceMhldihResponse extends $tea.Model {
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

export class QueryPreformanceUtiveiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceUtiveiResponse extends $tea.Model {
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

export class QueryPreformancePrgtxgRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformancePrgtxgResponse extends $tea.Model {
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

export class QueryPreformanceXezxoyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceXezxoyResponse extends $tea.Model {
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

export class QueryPreformanceChnteuRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceChnteuResponse extends $tea.Model {
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

export class QueryPreformanceGzbbbcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceGzbbbcResponse extends $tea.Model {
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

export class QueryPreformanceEdwgsrRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceEdwgsrResponse extends $tea.Model {
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

export class QueryPreformanceEdmasfRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceEdmasfResponse extends $tea.Model {
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

export class QueryPreformanceZzwagiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceZzwagiResponse extends $tea.Model {
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

export class QueryPreformanceHlgygqRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceHlgygqResponse extends $tea.Model {
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

export class QueryPreformanceXajpkiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceXajpkiResponse extends $tea.Model {
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

export class QueryPreformanceOwjbhoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceOwjbhoResponse extends $tea.Model {
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

export class QueryPreformanceEcvcwyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceEcvcwyResponse extends $tea.Model {
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

export class QueryPreformanceWxvpvmRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceWxvpvmResponse extends $tea.Model {
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

export class QueryPreformanceItjtfbRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceItjtfbResponse extends $tea.Model {
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

export class QueryPreformanceCvlthhRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceCvlthhResponse extends $tea.Model {
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

export class QueryPreformanceMnedehRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceMnedehResponse extends $tea.Model {
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

export class QueryPreformanceIisiwtRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceIisiwtResponse extends $tea.Model {
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

export class QueryPreformanceNbdxumRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceNbdxumResponse extends $tea.Model {
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

export class QueryPreformanceSzsmhtRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceSzsmhtResponse extends $tea.Model {
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

export class QueryPreformanceVfrukaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceVfrukaResponse extends $tea.Model {
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

export class QueryPreformanceGcvnehRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceGcvnehResponse extends $tea.Model {
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

export class QueryPreformanceWmxlgeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceWmxlgeResponse extends $tea.Model {
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

export class QueryPreformanceLcsnasRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceLcsnasResponse extends $tea.Model {
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

export class QueryPreformanceEmfcanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceEmfcanResponse extends $tea.Model {
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

export class QueryPreformanceHmgrsyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceHmgrsyResponse extends $tea.Model {
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

export class QueryPreformanceFgadhfRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceFgadhfResponse extends $tea.Model {
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

export class QueryPreformanceRmevfqRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceRmevfqResponse extends $tea.Model {
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

export class QueryPreformanceElpwxxRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceElpwxxResponse extends $tea.Model {
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

export class QueryPreformanceAislleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceAislleResponse extends $tea.Model {
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

export class QueryPreformanceFbupcoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceFbupcoResponse extends $tea.Model {
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

export class QueryPreformanceSolifaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceSolifaResponse extends $tea.Model {
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

export class QueryPreformanceEcowvhRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceEcowvhResponse extends $tea.Model {
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

export class QueryPreformanceMudnyeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceMudnyeResponse extends $tea.Model {
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

export class QueryPreformanceLswaxkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceLswaxkResponse extends $tea.Model {
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

export class QueryPreformanceAruxngRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceAruxngResponse extends $tea.Model {
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

export class QueryPreformanceHbnwdpRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceHbnwdpResponse extends $tea.Model {
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

export class QueryPreformanceUfdptnRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceUfdptnResponse extends $tea.Model {
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

export class QueryPreformanceReyqjrRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceReyqjrResponse extends $tea.Model {
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

export class QueryPreformanceWtxvtjRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceWtxvtjResponse extends $tea.Model {
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

export class QueryPreformanceLjbjmkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceLjbjmkResponse extends $tea.Model {
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

export class QueryPreformanceCryfwzRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceCryfwzResponse extends $tea.Model {
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

export class QueryPreformancePxnzuwRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformancePxnzuwResponse extends $tea.Model {
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

export class QueryPreformancePpefnnRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformancePpefnnResponse extends $tea.Model {
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

export class QueryPreformanceHhekdxRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceHhekdxResponse extends $tea.Model {
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

export class QueryPreformanceYirplbRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceYirplbResponse extends $tea.Model {
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

export class QueryPreformanceJgxxvbRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 超时
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

export class QueryPreformanceJgxxvbResponse extends $tea.Model {
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

export class ApiCreateHttpRequest extends $tea.Model {
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

export class ApiCreateHttpResponse extends $tea.Model {
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
          sdk_version: "1.0.1",
          _prod_code: "JZQPRODUCTA",
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
   * Description: 1
   * Summary: 1
   */
  async testDemo(request: TestDemoRequest): Promise<TestDemoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.testDemoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 1
   * Summary: 1
   */
  async testDemoEx(request: TestDemoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<TestDemoResponse> {
    Util.validateModel(request);
    return $tea.cast<TestDemoResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.demo.test", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new TestDemoResponse({}));
  }

  /**
   * @remarks
   * Description: test
   * Summary: test
   */
  async apiWithdraw(request: ApiWithdrawRequest): Promise<ApiWithdrawResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.apiWithdrawEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: test
   * Summary: test
   */
  async apiWithdrawEx(request: ApiWithdrawRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApiWithdrawResponse> {
    Util.validateModel(request);
    return $tea.cast<ApiWithdrawResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.withdraw.api", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApiWithdrawResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceTest(request: QueryPreformanceTestRequest): Promise<QueryPreformanceTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceTestEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceTestEx(request: QueryPreformanceTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceTestResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceTestResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.test.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceTestResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceOnjgra(request: QueryPreformanceOnjgraRequest): Promise<QueryPreformanceOnjgraResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceOnjgraEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceOnjgraEx(request: QueryPreformanceOnjgraRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceOnjgraResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceOnjgraResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.onjgra.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceOnjgraResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceCgsccz(request: QueryPreformanceCgscczRequest): Promise<QueryPreformanceCgscczResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceCgscczEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceCgscczEx(request: QueryPreformanceCgscczRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceCgscczResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceCgscczResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.cgsccz.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceCgscczResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceRyhdhn(request: QueryPreformanceRyhdhnRequest): Promise<QueryPreformanceRyhdhnResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceRyhdhnEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceRyhdhnEx(request: QueryPreformanceRyhdhnRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceRyhdhnResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceRyhdhnResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ryhdhn.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceRyhdhnResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceQcbsze(request: QueryPreformanceQcbszeRequest): Promise<QueryPreformanceQcbszeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceQcbszeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceQcbszeEx(request: QueryPreformanceQcbszeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceQcbszeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceQcbszeResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.qcbsze.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceQcbszeResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceScilwt(request: QueryPreformanceScilwtRequest): Promise<QueryPreformanceScilwtResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceScilwtEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceScilwtEx(request: QueryPreformanceScilwtRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceScilwtResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceScilwtResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.scilwt.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceScilwtResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceZdsrec(request: QueryPreformanceZdsrecRequest): Promise<QueryPreformanceZdsrecResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceZdsrecEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceZdsrecEx(request: QueryPreformanceZdsrecRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceZdsrecResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceZdsrecResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.zdsrec.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceZdsrecResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceIezhuc(request: QueryPreformanceIezhucRequest): Promise<QueryPreformanceIezhucResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceIezhucEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceIezhucEx(request: QueryPreformanceIezhucRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceIezhucResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceIezhucResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.iezhuc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceIezhucResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceXjdezp(request: QueryPreformanceXjdezpRequest): Promise<QueryPreformanceXjdezpResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceXjdezpEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceXjdezpEx(request: QueryPreformanceXjdezpRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceXjdezpResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceXjdezpResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.xjdezp.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceXjdezpResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceDjuoin(request: QueryPreformanceDjuoinRequest): Promise<QueryPreformanceDjuoinResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceDjuoinEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceDjuoinEx(request: QueryPreformanceDjuoinRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceDjuoinResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceDjuoinResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.djuoin.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceDjuoinResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceBagemg(request: QueryPreformanceBagemgRequest): Promise<QueryPreformanceBagemgResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceBagemgEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceBagemgEx(request: QueryPreformanceBagemgRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceBagemgResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceBagemgResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.bagemg.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceBagemgResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceDpvzbt(request: QueryPreformanceDpvzbtRequest): Promise<QueryPreformanceDpvzbtResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceDpvzbtEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceDpvzbtEx(request: QueryPreformanceDpvzbtRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceDpvzbtResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceDpvzbtResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.dpvzbt.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceDpvzbtResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGziwau(request: QueryPreformanceGziwauRequest): Promise<QueryPreformanceGziwauResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceGziwauEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGziwauEx(request: QueryPreformanceGziwauRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceGziwauResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceGziwauResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.gziwau.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceGziwauResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVhpywu(request: QueryPreformanceVhpywuRequest): Promise<QueryPreformanceVhpywuResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceVhpywuEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVhpywuEx(request: QueryPreformanceVhpywuRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceVhpywuResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceVhpywuResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.vhpywu.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceVhpywuResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceJsulht(request: QueryPreformanceJsulhtRequest): Promise<QueryPreformanceJsulhtResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceJsulhtEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceJsulhtEx(request: QueryPreformanceJsulhtRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceJsulhtResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceJsulhtResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.jsulht.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceJsulhtResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceIvcypl(request: QueryPreformanceIvcyplRequest): Promise<QueryPreformanceIvcyplResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceIvcyplEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceIvcyplEx(request: QueryPreformanceIvcyplRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceIvcyplResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceIvcyplResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ivcypl.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceIvcyplResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGmylkm(request: QueryPreformanceGmylkmRequest): Promise<QueryPreformanceGmylkmResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceGmylkmEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGmylkmEx(request: QueryPreformanceGmylkmRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceGmylkmResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceGmylkmResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.gmylkm.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceGmylkmResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceYcdqlt(request: QueryPreformanceYcdqltRequest): Promise<QueryPreformanceYcdqltResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceYcdqltEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceYcdqltEx(request: QueryPreformanceYcdqltRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceYcdqltResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceYcdqltResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ycdqlt.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceYcdqltResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceTmspnc(request: QueryPreformanceTmspncRequest): Promise<QueryPreformanceTmspncResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceTmspncEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceTmspncEx(request: QueryPreformanceTmspncRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceTmspncResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceTmspncResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.tmspnc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceTmspncResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceSghpbd(request: QueryPreformanceSghpbdRequest): Promise<QueryPreformanceSghpbdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceSghpbdEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceSghpbdEx(request: QueryPreformanceSghpbdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceSghpbdResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceSghpbdResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.sghpbd.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceSghpbdResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceRhuirb(request: QueryPreformanceRhuirbRequest): Promise<QueryPreformanceRhuirbResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceRhuirbEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceRhuirbEx(request: QueryPreformanceRhuirbRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceRhuirbResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceRhuirbResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.rhuirb.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceRhuirbResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceZcvaea(request: QueryPreformanceZcvaeaRequest): Promise<QueryPreformanceZcvaeaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceZcvaeaEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceZcvaeaEx(request: QueryPreformanceZcvaeaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceZcvaeaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceZcvaeaResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.zcvaea.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceZcvaeaResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGhohid(request: QueryPreformanceGhohidRequest): Promise<QueryPreformanceGhohidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceGhohidEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGhohidEx(request: QueryPreformanceGhohidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceGhohidResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceGhohidResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ghohid.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceGhohidResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceMcxrxm(request: QueryPreformanceMcxrxmRequest): Promise<QueryPreformanceMcxrxmResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceMcxrxmEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceMcxrxmEx(request: QueryPreformanceMcxrxmRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceMcxrxmResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceMcxrxmResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.mcxrxm.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceMcxrxmResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceYdbeoz(request: QueryPreformanceYdbeozRequest): Promise<QueryPreformanceYdbeozResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceYdbeozEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceYdbeozEx(request: QueryPreformanceYdbeozRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceYdbeozResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceYdbeozResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ydbeoz.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceYdbeozResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGqiyjt(request: QueryPreformanceGqiyjtRequest): Promise<QueryPreformanceGqiyjtResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceGqiyjtEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGqiyjtEx(request: QueryPreformanceGqiyjtRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceGqiyjtResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceGqiyjtResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.gqiyjt.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceGqiyjtResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceFlmtje(request: QueryPreformanceFlmtjeRequest): Promise<QueryPreformanceFlmtjeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceFlmtjeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceFlmtjeEx(request: QueryPreformanceFlmtjeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceFlmtjeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceFlmtjeResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.flmtje.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceFlmtjeResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceIhmckr(request: QueryPreformanceIhmckrRequest): Promise<QueryPreformanceIhmckrResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceIhmckrEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceIhmckrEx(request: QueryPreformanceIhmckrRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceIhmckrResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceIhmckrResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ihmckr.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceIhmckrResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVuhkyn(request: QueryPreformanceVuhkynRequest): Promise<QueryPreformanceVuhkynResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceVuhkynEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVuhkynEx(request: QueryPreformanceVuhkynRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceVuhkynResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceVuhkynResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.vuhkyn.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceVuhkynResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceCdyiuj(request: QueryPreformanceCdyiujRequest): Promise<QueryPreformanceCdyiujResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceCdyiujEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceCdyiujEx(request: QueryPreformanceCdyiujRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceCdyiujResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceCdyiujResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.cdyiuj.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceCdyiujResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceQcenzc(request: QueryPreformanceQcenzcRequest): Promise<QueryPreformanceQcenzcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceQcenzcEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceQcenzcEx(request: QueryPreformanceQcenzcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceQcenzcResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceQcenzcResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.qcenzc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceQcenzcResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceKrohvy(request: QueryPreformanceKrohvyRequest): Promise<QueryPreformanceKrohvyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceKrohvyEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceKrohvyEx(request: QueryPreformanceKrohvyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceKrohvyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceKrohvyResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.krohvy.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceKrohvyResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceNpyznv(request: QueryPreformanceNpyznvRequest): Promise<QueryPreformanceNpyznvResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceNpyznvEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceNpyznvEx(request: QueryPreformanceNpyznvRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceNpyznvResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceNpyznvResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.npyznv.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceNpyznvResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceLqbvkm(request: QueryPreformanceLqbvkmRequest): Promise<QueryPreformanceLqbvkmResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceLqbvkmEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceLqbvkmEx(request: QueryPreformanceLqbvkmRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceLqbvkmResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceLqbvkmResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.lqbvkm.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceLqbvkmResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceFjxvfj(request: QueryPreformanceFjxvfjRequest): Promise<QueryPreformanceFjxvfjResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceFjxvfjEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceFjxvfjEx(request: QueryPreformanceFjxvfjRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceFjxvfjResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceFjxvfjResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.fjxvfj.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceFjxvfjResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceEqoghc(request: QueryPreformanceEqoghcRequest): Promise<QueryPreformanceEqoghcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceEqoghcEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceEqoghcEx(request: QueryPreformanceEqoghcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceEqoghcResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceEqoghcResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.eqoghc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceEqoghcResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceQuklgc(request: QueryPreformanceQuklgcRequest): Promise<QueryPreformanceQuklgcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceQuklgcEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceQuklgcEx(request: QueryPreformanceQuklgcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceQuklgcResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceQuklgcResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.quklgc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceQuklgcResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceOtekpg(request: QueryPreformanceOtekpgRequest): Promise<QueryPreformanceOtekpgResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceOtekpgEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceOtekpgEx(request: QueryPreformanceOtekpgRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceOtekpgResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceOtekpgResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.otekpg.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceOtekpgResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceFnipum(request: QueryPreformanceFnipumRequest): Promise<QueryPreformanceFnipumResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceFnipumEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceFnipumEx(request: QueryPreformanceFnipumRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceFnipumResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceFnipumResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.fnipum.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceFnipumResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceEhhgnq(request: QueryPreformanceEhhgnqRequest): Promise<QueryPreformanceEhhgnqResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceEhhgnqEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceEhhgnqEx(request: QueryPreformanceEhhgnqRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceEhhgnqResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceEhhgnqResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ehhgnq.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceEhhgnqResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceNtrmkk(request: QueryPreformanceNtrmkkRequest): Promise<QueryPreformanceNtrmkkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceNtrmkkEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceNtrmkkEx(request: QueryPreformanceNtrmkkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceNtrmkkResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceNtrmkkResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ntrmkk.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceNtrmkkResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceCdjnvm(request: QueryPreformanceCdjnvmRequest): Promise<QueryPreformanceCdjnvmResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceCdjnvmEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceCdjnvmEx(request: QueryPreformanceCdjnvmRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceCdjnvmResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceCdjnvmResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.cdjnvm.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceCdjnvmResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceZnmzzv(request: QueryPreformanceZnmzzvRequest): Promise<QueryPreformanceZnmzzvResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceZnmzzvEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceZnmzzvEx(request: QueryPreformanceZnmzzvRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceZnmzzvResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceZnmzzvResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.znmzzv.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceZnmzzvResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceJhxufr(request: QueryPreformanceJhxufrRequest): Promise<QueryPreformanceJhxufrResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceJhxufrEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceJhxufrEx(request: QueryPreformanceJhxufrRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceJhxufrResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceJhxufrResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.jhxufr.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceJhxufrResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceBvhiaa(request: QueryPreformanceBvhiaaRequest): Promise<QueryPreformanceBvhiaaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceBvhiaaEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceBvhiaaEx(request: QueryPreformanceBvhiaaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceBvhiaaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceBvhiaaResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.bvhiaa.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceBvhiaaResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceXkpsmy(request: QueryPreformanceXkpsmyRequest): Promise<QueryPreformanceXkpsmyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceXkpsmyEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceXkpsmyEx(request: QueryPreformanceXkpsmyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceXkpsmyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceXkpsmyResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.xkpsmy.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceXkpsmyResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceUvqflc(request: QueryPreformanceUvqflcRequest): Promise<QueryPreformanceUvqflcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceUvqflcEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceUvqflcEx(request: QueryPreformanceUvqflcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceUvqflcResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceUvqflcResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.uvqflc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceUvqflcResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVyjnjh(request: QueryPreformanceVyjnjhRequest): Promise<QueryPreformanceVyjnjhResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceVyjnjhEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVyjnjhEx(request: QueryPreformanceVyjnjhRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceVyjnjhResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceVyjnjhResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.vyjnjh.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceVyjnjhResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceQdweww(request: QueryPreformanceQdwewwRequest): Promise<QueryPreformanceQdwewwResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceQdwewwEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceQdwewwEx(request: QueryPreformanceQdwewwRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceQdwewwResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceQdwewwResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.qdweww.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceQdwewwResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceYxsifp(request: QueryPreformanceYxsifpRequest): Promise<QueryPreformanceYxsifpResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceYxsifpEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceYxsifpEx(request: QueryPreformanceYxsifpRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceYxsifpResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceYxsifpResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.yxsifp.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceYxsifpResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceEfvjvz(request: QueryPreformanceEfvjvzRequest): Promise<QueryPreformanceEfvjvzResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceEfvjvzEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceEfvjvzEx(request: QueryPreformanceEfvjvzRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceEfvjvzResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceEfvjvzResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.efvjvz.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceEfvjvzResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceJppmoh(request: QueryPreformanceJppmohRequest): Promise<QueryPreformanceJppmohResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceJppmohEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceJppmohEx(request: QueryPreformanceJppmohRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceJppmohResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceJppmohResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.jppmoh.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceJppmohResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVcwcvo(request: QueryPreformanceVcwcvoRequest): Promise<QueryPreformanceVcwcvoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceVcwcvoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVcwcvoEx(request: QueryPreformanceVcwcvoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceVcwcvoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceVcwcvoResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.vcwcvo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceVcwcvoResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceBdbqlw(request: QueryPreformanceBdbqlwRequest): Promise<QueryPreformanceBdbqlwResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceBdbqlwEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceBdbqlwEx(request: QueryPreformanceBdbqlwRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceBdbqlwResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceBdbqlwResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.bdbqlw.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceBdbqlwResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceAqmmru(request: QueryPreformanceAqmmruRequest): Promise<QueryPreformanceAqmmruResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceAqmmruEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceAqmmruEx(request: QueryPreformanceAqmmruRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceAqmmruResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceAqmmruResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.aqmmru.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceAqmmruResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceRvieyv(request: QueryPreformanceRvieyvRequest): Promise<QueryPreformanceRvieyvResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceRvieyvEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceRvieyvEx(request: QueryPreformanceRvieyvRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceRvieyvResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceRvieyvResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.rvieyv.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceRvieyvResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceDmopqg(request: QueryPreformanceDmopqgRequest): Promise<QueryPreformanceDmopqgResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceDmopqgEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceDmopqgEx(request: QueryPreformanceDmopqgRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceDmopqgResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceDmopqgResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.dmopqg.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceDmopqgResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceJiccss(request: QueryPreformanceJiccssRequest): Promise<QueryPreformanceJiccssResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceJiccssEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceJiccssEx(request: QueryPreformanceJiccssRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceJiccssResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceJiccssResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.jiccss.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceJiccssResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceHlqjtd(request: QueryPreformanceHlqjtdRequest): Promise<QueryPreformanceHlqjtdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceHlqjtdEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceHlqjtdEx(request: QueryPreformanceHlqjtdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceHlqjtdResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceHlqjtdResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.hlqjtd.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceHlqjtdResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceLaldyf(request: QueryPreformanceLaldyfRequest): Promise<QueryPreformanceLaldyfResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceLaldyfEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceLaldyfEx(request: QueryPreformanceLaldyfRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceLaldyfResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceLaldyfResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.laldyf.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceLaldyfResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceYbynjw(request: QueryPreformanceYbynjwRequest): Promise<QueryPreformanceYbynjwResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceYbynjwEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceYbynjwEx(request: QueryPreformanceYbynjwRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceYbynjwResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceYbynjwResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ybynjw.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceYbynjwResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceFsinwz(request: QueryPreformanceFsinwzRequest): Promise<QueryPreformanceFsinwzResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceFsinwzEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceFsinwzEx(request: QueryPreformanceFsinwzRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceFsinwzResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceFsinwzResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.fsinwz.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceFsinwzResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformancePgfxxn(request: QueryPreformancePgfxxnRequest): Promise<QueryPreformancePgfxxnResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformancePgfxxnEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformancePgfxxnEx(request: QueryPreformancePgfxxnRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformancePgfxxnResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformancePgfxxnResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.pgfxxn.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformancePgfxxnResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceQuinfl(request: QueryPreformanceQuinflRequest): Promise<QueryPreformanceQuinflResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceQuinflEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceQuinflEx(request: QueryPreformanceQuinflRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceQuinflResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceQuinflResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.quinfl.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceQuinflResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceYxgwyy(request: QueryPreformanceYxgwyyRequest): Promise<QueryPreformanceYxgwyyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceYxgwyyEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceYxgwyyEx(request: QueryPreformanceYxgwyyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceYxgwyyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceYxgwyyResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.yxgwyy.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceYxgwyyResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceNendtw(request: QueryPreformanceNendtwRequest): Promise<QueryPreformanceNendtwResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceNendtwEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceNendtwEx(request: QueryPreformanceNendtwRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceNendtwResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceNendtwResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.nendtw.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceNendtwResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceFtjecz(request: QueryPreformanceFtjeczRequest): Promise<QueryPreformanceFtjeczResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceFtjeczEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceFtjeczEx(request: QueryPreformanceFtjeczRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceFtjeczResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceFtjeczResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ftjecz.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceFtjeczResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceEputrh(request: QueryPreformanceEputrhRequest): Promise<QueryPreformanceEputrhResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceEputrhEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceEputrhEx(request: QueryPreformanceEputrhRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceEputrhResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceEputrhResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.eputrh.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceEputrhResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVspsum(request: QueryPreformanceVspsumRequest): Promise<QueryPreformanceVspsumResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceVspsumEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVspsumEx(request: QueryPreformanceVspsumRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceVspsumResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceVspsumResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.vspsum.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceVspsumResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceZlwaue(request: QueryPreformanceZlwaueRequest): Promise<QueryPreformanceZlwaueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceZlwaueEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceZlwaueEx(request: QueryPreformanceZlwaueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceZlwaueResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceZlwaueResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.zlwaue.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceZlwaueResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceMqaojr(request: QueryPreformanceMqaojrRequest): Promise<QueryPreformanceMqaojrResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceMqaojrEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceMqaojrEx(request: QueryPreformanceMqaojrRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceMqaojrResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceMqaojrResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.mqaojr.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceMqaojrResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceBfcfqd(request: QueryPreformanceBfcfqdRequest): Promise<QueryPreformanceBfcfqdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceBfcfqdEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceBfcfqdEx(request: QueryPreformanceBfcfqdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceBfcfqdResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceBfcfqdResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.bfcfqd.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceBfcfqdResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceYcfsaf(request: QueryPreformanceYcfsafRequest): Promise<QueryPreformanceYcfsafResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceYcfsafEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceYcfsafEx(request: QueryPreformanceYcfsafRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceYcfsafResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceYcfsafResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ycfsaf.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceYcfsafResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceZwpmyi(request: QueryPreformanceZwpmyiRequest): Promise<QueryPreformanceZwpmyiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceZwpmyiEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceZwpmyiEx(request: QueryPreformanceZwpmyiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceZwpmyiResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceZwpmyiResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.zwpmyi.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceZwpmyiResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceMvgnla(request: QueryPreformanceMvgnlaRequest): Promise<QueryPreformanceMvgnlaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceMvgnlaEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceMvgnlaEx(request: QueryPreformanceMvgnlaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceMvgnlaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceMvgnlaResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.mvgnla.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceMvgnlaResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVlmrpm(request: QueryPreformanceVlmrpmRequest): Promise<QueryPreformanceVlmrpmResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceVlmrpmEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVlmrpmEx(request: QueryPreformanceVlmrpmRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceVlmrpmResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceVlmrpmResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.vlmrpm.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceVlmrpmResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceKfygrp(request: QueryPreformanceKfygrpRequest): Promise<QueryPreformanceKfygrpResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceKfygrpEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceKfygrpEx(request: QueryPreformanceKfygrpRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceKfygrpResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceKfygrpResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.kfygrp.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceKfygrpResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceKqdmyw(request: QueryPreformanceKqdmywRequest): Promise<QueryPreformanceKqdmywResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceKqdmywEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceKqdmywEx(request: QueryPreformanceKqdmywRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceKqdmywResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceKqdmywResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.kqdmyw.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceKqdmywResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceIdrolc(request: QueryPreformanceIdrolcRequest): Promise<QueryPreformanceIdrolcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceIdrolcEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceIdrolcEx(request: QueryPreformanceIdrolcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceIdrolcResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceIdrolcResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.idrolc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceIdrolcResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGoxdkk(request: QueryPreformanceGoxdkkRequest): Promise<QueryPreformanceGoxdkkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceGoxdkkEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGoxdkkEx(request: QueryPreformanceGoxdkkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceGoxdkkResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceGoxdkkResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.goxdkk.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceGoxdkkResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceJnrlwy(request: QueryPreformanceJnrlwyRequest): Promise<QueryPreformanceJnrlwyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceJnrlwyEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceJnrlwyEx(request: QueryPreformanceJnrlwyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceJnrlwyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceJnrlwyResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.jnrlwy.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceJnrlwyResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceYoiwnf(request: QueryPreformanceYoiwnfRequest): Promise<QueryPreformanceYoiwnfResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceYoiwnfEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceYoiwnfEx(request: QueryPreformanceYoiwnfRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceYoiwnfResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceYoiwnfResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.yoiwnf.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceYoiwnfResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformancePxtfgc(request: QueryPreformancePxtfgcRequest): Promise<QueryPreformancePxtfgcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformancePxtfgcEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformancePxtfgcEx(request: QueryPreformancePxtfgcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformancePxtfgcResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformancePxtfgcResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.pxtfgc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformancePxtfgcResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGbigia(request: QueryPreformanceGbigiaRequest): Promise<QueryPreformanceGbigiaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceGbigiaEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGbigiaEx(request: QueryPreformanceGbigiaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceGbigiaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceGbigiaResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.gbigia.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceGbigiaResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGohgoo(request: QueryPreformanceGohgooRequest): Promise<QueryPreformanceGohgooResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceGohgooEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGohgooEx(request: QueryPreformanceGohgooRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceGohgooResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceGohgooResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.gohgoo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceGohgooResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceQzijug(request: QueryPreformanceQzijugRequest): Promise<QueryPreformanceQzijugResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceQzijugEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceQzijugEx(request: QueryPreformanceQzijugRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceQzijugResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceQzijugResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.qzijug.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceQzijugResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceDtiqsm(request: QueryPreformanceDtiqsmRequest): Promise<QueryPreformanceDtiqsmResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceDtiqsmEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceDtiqsmEx(request: QueryPreformanceDtiqsmRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceDtiqsmResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceDtiqsmResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.dtiqsm.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceDtiqsmResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceIapwkx(request: QueryPreformanceIapwkxRequest): Promise<QueryPreformanceIapwkxResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceIapwkxEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceIapwkxEx(request: QueryPreformanceIapwkxRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceIapwkxResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceIapwkxResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.iapwkx.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceIapwkxResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceAarwuq(request: QueryPreformanceAarwuqRequest): Promise<QueryPreformanceAarwuqResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceAarwuqEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceAarwuqEx(request: QueryPreformanceAarwuqRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceAarwuqResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceAarwuqResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.aarwuq.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceAarwuqResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceEgsbve(request: QueryPreformanceEgsbveRequest): Promise<QueryPreformanceEgsbveResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceEgsbveEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceEgsbveEx(request: QueryPreformanceEgsbveRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceEgsbveResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceEgsbveResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.egsbve.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceEgsbveResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceUdgzvl(request: QueryPreformanceUdgzvlRequest): Promise<QueryPreformanceUdgzvlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceUdgzvlEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceUdgzvlEx(request: QueryPreformanceUdgzvlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceUdgzvlResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceUdgzvlResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.udgzvl.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceUdgzvlResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceOxzmsd(request: QueryPreformanceOxzmsdRequest): Promise<QueryPreformanceOxzmsdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceOxzmsdEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceOxzmsdEx(request: QueryPreformanceOxzmsdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceOxzmsdResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceOxzmsdResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.oxzmsd.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceOxzmsdResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceWrbogx(request: QueryPreformanceWrbogxRequest): Promise<QueryPreformanceWrbogxResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceWrbogxEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceWrbogxEx(request: QueryPreformanceWrbogxRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceWrbogxResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceWrbogxResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.wrbogx.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceWrbogxResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceSovdsq(request: QueryPreformanceSovdsqRequest): Promise<QueryPreformanceSovdsqResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceSovdsqEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceSovdsqEx(request: QueryPreformanceSovdsqRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceSovdsqResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceSovdsqResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.sovdsq.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceSovdsqResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceKmenzi(request: QueryPreformanceKmenziRequest): Promise<QueryPreformanceKmenziResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceKmenziEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceKmenziEx(request: QueryPreformanceKmenziRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceKmenziResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceKmenziResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.kmenzi.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceKmenziResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceNdyzvb(request: QueryPreformanceNdyzvbRequest): Promise<QueryPreformanceNdyzvbResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceNdyzvbEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceNdyzvbEx(request: QueryPreformanceNdyzvbRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceNdyzvbResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceNdyzvbResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ndyzvb.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceNdyzvbResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformancePleorx(request: QueryPreformancePleorxRequest): Promise<QueryPreformancePleorxResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformancePleorxEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformancePleorxEx(request: QueryPreformancePleorxRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformancePleorxResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformancePleorxResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.pleorx.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformancePleorxResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceErldms(request: QueryPreformanceErldmsRequest): Promise<QueryPreformanceErldmsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceErldmsEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceErldmsEx(request: QueryPreformanceErldmsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceErldmsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceErldmsResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.erldms.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceErldmsResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformancePstmvt(request: QueryPreformancePstmvtRequest): Promise<QueryPreformancePstmvtResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformancePstmvtEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformancePstmvtEx(request: QueryPreformancePstmvtRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformancePstmvtResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformancePstmvtResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.pstmvt.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformancePstmvtResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceRgcens(request: QueryPreformanceRgcensRequest): Promise<QueryPreformanceRgcensResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceRgcensEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceRgcensEx(request: QueryPreformanceRgcensRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceRgcensResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceRgcensResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.rgcens.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceRgcensResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceDfawnn(request: QueryPreformanceDfawnnRequest): Promise<QueryPreformanceDfawnnResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceDfawnnEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceDfawnnEx(request: QueryPreformanceDfawnnRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceDfawnnResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceDfawnnResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.dfawnn.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceDfawnnResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceYzzbsm(request: QueryPreformanceYzzbsmRequest): Promise<QueryPreformanceYzzbsmResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceYzzbsmEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceYzzbsmEx(request: QueryPreformanceYzzbsmRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceYzzbsmResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceYzzbsmResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.yzzbsm.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceYzzbsmResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceSybmpk(request: QueryPreformanceSybmpkRequest): Promise<QueryPreformanceSybmpkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceSybmpkEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceSybmpkEx(request: QueryPreformanceSybmpkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceSybmpkResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceSybmpkResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.sybmpk.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceSybmpkResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceZtxnbk(request: QueryPreformanceZtxnbkRequest): Promise<QueryPreformanceZtxnbkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceZtxnbkEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceZtxnbkEx(request: QueryPreformanceZtxnbkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceZtxnbkResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceZtxnbkResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ztxnbk.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceZtxnbkResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceTtttjp(request: QueryPreformanceTtttjpRequest): Promise<QueryPreformanceTtttjpResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceTtttjpEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceTtttjpEx(request: QueryPreformanceTtttjpRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceTtttjpResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceTtttjpResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ttttjp.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceTtttjpResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceKpnmpv(request: QueryPreformanceKpnmpvRequest): Promise<QueryPreformanceKpnmpvResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceKpnmpvEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceKpnmpvEx(request: QueryPreformanceKpnmpvRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceKpnmpvResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceKpnmpvResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.kpnmpv.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceKpnmpvResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceYquegw(request: QueryPreformanceYquegwRequest): Promise<QueryPreformanceYquegwResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceYquegwEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceYquegwEx(request: QueryPreformanceYquegwRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceYquegwResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceYquegwResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.yquegw.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceYquegwResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceYjmbyl(request: QueryPreformanceYjmbylRequest): Promise<QueryPreformanceYjmbylResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceYjmbylEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceYjmbylEx(request: QueryPreformanceYjmbylRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceYjmbylResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceYjmbylResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.yjmbyl.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceYjmbylResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGjnnnv(request: QueryPreformanceGjnnnvRequest): Promise<QueryPreformanceGjnnnvResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceGjnnnvEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGjnnnvEx(request: QueryPreformanceGjnnnvRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceGjnnnvResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceGjnnnvResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.gjnnnv.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceGjnnnvResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceCgcmkv(request: QueryPreformanceCgcmkvRequest): Promise<QueryPreformanceCgcmkvResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceCgcmkvEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceCgcmkvEx(request: QueryPreformanceCgcmkvRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceCgcmkvResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceCgcmkvResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.cgcmkv.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceCgcmkvResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVtqjti(request: QueryPreformanceVtqjtiRequest): Promise<QueryPreformanceVtqjtiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceVtqjtiEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVtqjtiEx(request: QueryPreformanceVtqjtiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceVtqjtiResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceVtqjtiResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.vtqjti.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceVtqjtiResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceZazxkc(request: QueryPreformanceZazxkcRequest): Promise<QueryPreformanceZazxkcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceZazxkcEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceZazxkcEx(request: QueryPreformanceZazxkcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceZazxkcResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceZazxkcResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.zazxkc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceZazxkcResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceNxifyy(request: QueryPreformanceNxifyyRequest): Promise<QueryPreformanceNxifyyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceNxifyyEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceNxifyyEx(request: QueryPreformanceNxifyyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceNxifyyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceNxifyyResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.nxifyy.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceNxifyyResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceZnlzki(request: QueryPreformanceZnlzkiRequest): Promise<QueryPreformanceZnlzkiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceZnlzkiEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceZnlzkiEx(request: QueryPreformanceZnlzkiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceZnlzkiResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceZnlzkiResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.znlzki.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceZnlzkiResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVcvcvy(request: QueryPreformanceVcvcvyRequest): Promise<QueryPreformanceVcvcvyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceVcvcvyEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVcvcvyEx(request: QueryPreformanceVcvcvyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceVcvcvyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceVcvcvyResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.vcvcvy.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceVcvcvyResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceXuchrm(request: QueryPreformanceXuchrmRequest): Promise<QueryPreformanceXuchrmResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceXuchrmEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceXuchrmEx(request: QueryPreformanceXuchrmRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceXuchrmResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceXuchrmResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.xuchrm.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceXuchrmResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceZtkrkp(request: QueryPreformanceZtkrkpRequest): Promise<QueryPreformanceZtkrkpResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceZtkrkpEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceZtkrkpEx(request: QueryPreformanceZtkrkpRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceZtkrkpResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceZtkrkpResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ztkrkp.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceZtkrkpResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceJetngh(request: QueryPreformanceJetnghRequest): Promise<QueryPreformanceJetnghResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceJetnghEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceJetnghEx(request: QueryPreformanceJetnghRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceJetnghResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceJetnghResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.jetngh.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceJetnghResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceBgtghl(request: QueryPreformanceBgtghlRequest): Promise<QueryPreformanceBgtghlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceBgtghlEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceBgtghlEx(request: QueryPreformanceBgtghlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceBgtghlResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceBgtghlResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.bgtghl.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceBgtghlResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVwquks(request: QueryPreformanceVwquksRequest): Promise<QueryPreformanceVwquksResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceVwquksEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVwquksEx(request: QueryPreformanceVwquksRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceVwquksResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceVwquksResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.vwquks.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceVwquksResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceElcoqa(request: QueryPreformanceElcoqaRequest): Promise<QueryPreformanceElcoqaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceElcoqaEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceElcoqaEx(request: QueryPreformanceElcoqaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceElcoqaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceElcoqaResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.elcoqa.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceElcoqaResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceSwzidt(request: QueryPreformanceSwzidtRequest): Promise<QueryPreformanceSwzidtResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceSwzidtEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceSwzidtEx(request: QueryPreformanceSwzidtRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceSwzidtResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceSwzidtResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.swzidt.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceSwzidtResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceLepjay(request: QueryPreformanceLepjayRequest): Promise<QueryPreformanceLepjayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceLepjayEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceLepjayEx(request: QueryPreformanceLepjayRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceLepjayResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceLepjayResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.lepjay.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceLepjayResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceWssfmi(request: QueryPreformanceWssfmiRequest): Promise<QueryPreformanceWssfmiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceWssfmiEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceWssfmiEx(request: QueryPreformanceWssfmiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceWssfmiResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceWssfmiResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.wssfmi.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceWssfmiResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceHiiibp(request: QueryPreformanceHiiibpRequest): Promise<QueryPreformanceHiiibpResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceHiiibpEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceHiiibpEx(request: QueryPreformanceHiiibpRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceHiiibpResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceHiiibpResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.hiiibp.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceHiiibpResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceIlsifv(request: QueryPreformanceIlsifvRequest): Promise<QueryPreformanceIlsifvResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceIlsifvEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceIlsifvEx(request: QueryPreformanceIlsifvRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceIlsifvResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceIlsifvResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ilsifv.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceIlsifvResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceQrrdcg(request: QueryPreformanceQrrdcgRequest): Promise<QueryPreformanceQrrdcgResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceQrrdcgEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceQrrdcgEx(request: QueryPreformanceQrrdcgRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceQrrdcgResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceQrrdcgResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.qrrdcg.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceQrrdcgResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceOeffbq(request: QueryPreformanceOeffbqRequest): Promise<QueryPreformanceOeffbqResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceOeffbqEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceOeffbqEx(request: QueryPreformanceOeffbqRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceOeffbqResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceOeffbqResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.oeffbq.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceOeffbqResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceBfnylc(request: QueryPreformanceBfnylcRequest): Promise<QueryPreformanceBfnylcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceBfnylcEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceBfnylcEx(request: QueryPreformanceBfnylcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceBfnylcResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceBfnylcResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.bfnylc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceBfnylcResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceKhmkcu(request: QueryPreformanceKhmkcuRequest): Promise<QueryPreformanceKhmkcuResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceKhmkcuEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceKhmkcuEx(request: QueryPreformanceKhmkcuRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceKhmkcuResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceKhmkcuResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.khmkcu.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceKhmkcuResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceXahvpk(request: QueryPreformanceXahvpkRequest): Promise<QueryPreformanceXahvpkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceXahvpkEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceXahvpkEx(request: QueryPreformanceXahvpkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceXahvpkResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceXahvpkResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.xahvpk.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceXahvpkResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformancePajjzn(request: QueryPreformancePajjznRequest): Promise<QueryPreformancePajjznResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformancePajjznEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformancePajjznEx(request: QueryPreformancePajjznRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformancePajjznResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformancePajjznResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.pajjzn.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformancePajjznResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceLrwabl(request: QueryPreformanceLrwablRequest): Promise<QueryPreformanceLrwablResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceLrwablEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceLrwablEx(request: QueryPreformanceLrwablRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceLrwablResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceLrwablResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.lrwabl.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceLrwablResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceQccygn(request: QueryPreformanceQccygnRequest): Promise<QueryPreformanceQccygnResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceQccygnEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceQccygnEx(request: QueryPreformanceQccygnRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceQccygnResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceQccygnResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.qccygn.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceQccygnResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceHtqkxt(request: QueryPreformanceHtqkxtRequest): Promise<QueryPreformanceHtqkxtResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceHtqkxtEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceHtqkxtEx(request: QueryPreformanceHtqkxtRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceHtqkxtResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceHtqkxtResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.htqkxt.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceHtqkxtResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceMitdkq(request: QueryPreformanceMitdkqRequest): Promise<QueryPreformanceMitdkqResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceMitdkqEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceMitdkqEx(request: QueryPreformanceMitdkqRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceMitdkqResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceMitdkqResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.mitdkq.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceMitdkqResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformancePrbsek(request: QueryPreformancePrbsekRequest): Promise<QueryPreformancePrbsekResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformancePrbsekEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformancePrbsekEx(request: QueryPreformancePrbsekRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformancePrbsekResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformancePrbsekResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.prbsek.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformancePrbsekResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVrqoxo(request: QueryPreformanceVrqoxoRequest): Promise<QueryPreformanceVrqoxoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceVrqoxoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVrqoxoEx(request: QueryPreformanceVrqoxoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceVrqoxoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceVrqoxoResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.vrqoxo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceVrqoxoResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceUcltcu(request: QueryPreformanceUcltcuRequest): Promise<QueryPreformanceUcltcuResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceUcltcuEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceUcltcuEx(request: QueryPreformanceUcltcuRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceUcltcuResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceUcltcuResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ucltcu.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceUcltcuResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceMzmhjm(request: QueryPreformanceMzmhjmRequest): Promise<QueryPreformanceMzmhjmResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceMzmhjmEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceMzmhjmEx(request: QueryPreformanceMzmhjmRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceMzmhjmResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceMzmhjmResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.mzmhjm.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceMzmhjmResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceUgztlu(request: QueryPreformanceUgztluRequest): Promise<QueryPreformanceUgztluResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceUgztluEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceUgztluEx(request: QueryPreformanceUgztluRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceUgztluResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceUgztluResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ugztlu.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceUgztluResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceYkrosj(request: QueryPreformanceYkrosjRequest): Promise<QueryPreformanceYkrosjResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceYkrosjEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceYkrosjEx(request: QueryPreformanceYkrosjRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceYkrosjResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceYkrosjResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ykrosj.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceYkrosjResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGflgul(request: QueryPreformanceGflgulRequest): Promise<QueryPreformanceGflgulResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceGflgulEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGflgulEx(request: QueryPreformanceGflgulRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceGflgulResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceGflgulResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.gflgul.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceGflgulResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceXwkppo(request: QueryPreformanceXwkppoRequest): Promise<QueryPreformanceXwkppoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceXwkppoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceXwkppoEx(request: QueryPreformanceXwkppoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceXwkppoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceXwkppoResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.xwkppo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceXwkppoResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVmvwlq(request: QueryPreformanceVmvwlqRequest): Promise<QueryPreformanceVmvwlqResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceVmvwlqEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVmvwlqEx(request: QueryPreformanceVmvwlqRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceVmvwlqResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceVmvwlqResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.vmvwlq.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceVmvwlqResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceLeciag(request: QueryPreformanceLeciagRequest): Promise<QueryPreformanceLeciagResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceLeciagEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceLeciagEx(request: QueryPreformanceLeciagRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceLeciagResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceLeciagResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.leciag.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceLeciagResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceYhfxnr(request: QueryPreformanceYhfxnrRequest): Promise<QueryPreformanceYhfxnrResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceYhfxnrEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceYhfxnrEx(request: QueryPreformanceYhfxnrRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceYhfxnrResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceYhfxnrResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.yhfxnr.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceYhfxnrResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceTmuqns(request: QueryPreformanceTmuqnsRequest): Promise<QueryPreformanceTmuqnsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceTmuqnsEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceTmuqnsEx(request: QueryPreformanceTmuqnsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceTmuqnsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceTmuqnsResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.tmuqns.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceTmuqnsResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceAzmyss(request: QueryPreformanceAzmyssRequest): Promise<QueryPreformanceAzmyssResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceAzmyssEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceAzmyssEx(request: QueryPreformanceAzmyssRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceAzmyssResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceAzmyssResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.azmyss.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceAzmyssResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceXnkkmh(request: QueryPreformanceXnkkmhRequest): Promise<QueryPreformanceXnkkmhResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceXnkkmhEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceXnkkmhEx(request: QueryPreformanceXnkkmhRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceXnkkmhResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceXnkkmhResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.xnkkmh.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceXnkkmhResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceBngodm(request: QueryPreformanceBngodmRequest): Promise<QueryPreformanceBngodmResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceBngodmEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceBngodmEx(request: QueryPreformanceBngodmRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceBngodmResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceBngodmResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.bngodm.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceBngodmResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceTtvegr(request: QueryPreformanceTtvegrRequest): Promise<QueryPreformanceTtvegrResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceTtvegrEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceTtvegrEx(request: QueryPreformanceTtvegrRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceTtvegrResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceTtvegrResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ttvegr.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceTtvegrResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceHaarbk(request: QueryPreformanceHaarbkRequest): Promise<QueryPreformanceHaarbkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceHaarbkEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceHaarbkEx(request: QueryPreformanceHaarbkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceHaarbkResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceHaarbkResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.haarbk.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceHaarbkResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceOnualk(request: QueryPreformanceOnualkRequest): Promise<QueryPreformanceOnualkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceOnualkEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceOnualkEx(request: QueryPreformanceOnualkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceOnualkResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceOnualkResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.onualk.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceOnualkResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceZrjcrw(request: QueryPreformanceZrjcrwRequest): Promise<QueryPreformanceZrjcrwResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceZrjcrwEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceZrjcrwEx(request: QueryPreformanceZrjcrwRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceZrjcrwResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceZrjcrwResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.zrjcrw.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceZrjcrwResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceBztkaa(request: QueryPreformanceBztkaaRequest): Promise<QueryPreformanceBztkaaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceBztkaaEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceBztkaaEx(request: QueryPreformanceBztkaaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceBztkaaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceBztkaaResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.bztkaa.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceBztkaaResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceMtpvfg(request: QueryPreformanceMtpvfgRequest): Promise<QueryPreformanceMtpvfgResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceMtpvfgEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceMtpvfgEx(request: QueryPreformanceMtpvfgRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceMtpvfgResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceMtpvfgResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.mtpvfg.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceMtpvfgResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceTysxvo(request: QueryPreformanceTysxvoRequest): Promise<QueryPreformanceTysxvoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceTysxvoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceTysxvoEx(request: QueryPreformanceTysxvoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceTysxvoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceTysxvoResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.tysxvo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceTysxvoResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceKmexgp(request: QueryPreformanceKmexgpRequest): Promise<QueryPreformanceKmexgpResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceKmexgpEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceKmexgpEx(request: QueryPreformanceKmexgpRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceKmexgpResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceKmexgpResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.kmexgp.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceKmexgpResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformancePwqvff(request: QueryPreformancePwqvffRequest): Promise<QueryPreformancePwqvffResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformancePwqvffEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformancePwqvffEx(request: QueryPreformancePwqvffRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformancePwqvffResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformancePwqvffResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.pwqvff.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformancePwqvffResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceTuyazj(request: QueryPreformanceTuyazjRequest): Promise<QueryPreformanceTuyazjResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceTuyazjEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceTuyazjEx(request: QueryPreformanceTuyazjRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceTuyazjResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceTuyazjResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.tuyazj.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceTuyazjResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceSeidvg(request: QueryPreformanceSeidvgRequest): Promise<QueryPreformanceSeidvgResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceSeidvgEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceSeidvgEx(request: QueryPreformanceSeidvgRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceSeidvgResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceSeidvgResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.seidvg.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceSeidvgResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceMbtpaw(request: QueryPreformanceMbtpawRequest): Promise<QueryPreformanceMbtpawResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceMbtpawEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceMbtpawEx(request: QueryPreformanceMbtpawRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceMbtpawResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceMbtpawResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.mbtpaw.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceMbtpawResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceFxblow(request: QueryPreformanceFxblowRequest): Promise<QueryPreformanceFxblowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceFxblowEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceFxblowEx(request: QueryPreformanceFxblowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceFxblowResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceFxblowResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.fxblow.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceFxblowResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceAequnw(request: QueryPreformanceAequnwRequest): Promise<QueryPreformanceAequnwResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceAequnwEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceAequnwEx(request: QueryPreformanceAequnwRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceAequnwResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceAequnwResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.aequnw.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceAequnwResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceKksgng(request: QueryPreformanceKksgngRequest): Promise<QueryPreformanceKksgngResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceKksgngEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceKksgngEx(request: QueryPreformanceKksgngRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceKksgngResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceKksgngResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.kksgng.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceKksgngResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceEplydb(request: QueryPreformanceEplydbRequest): Promise<QueryPreformanceEplydbResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceEplydbEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceEplydbEx(request: QueryPreformanceEplydbRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceEplydbResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceEplydbResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.eplydb.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceEplydbResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceLkdxvs(request: QueryPreformanceLkdxvsRequest): Promise<QueryPreformanceLkdxvsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceLkdxvsEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceLkdxvsEx(request: QueryPreformanceLkdxvsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceLkdxvsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceLkdxvsResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.lkdxvs.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceLkdxvsResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformancePkwuzm(request: QueryPreformancePkwuzmRequest): Promise<QueryPreformancePkwuzmResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformancePkwuzmEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformancePkwuzmEx(request: QueryPreformancePkwuzmRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformancePkwuzmResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformancePkwuzmResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.pkwuzm.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformancePkwuzmResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceTgagmi(request: QueryPreformanceTgagmiRequest): Promise<QueryPreformanceTgagmiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceTgagmiEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceTgagmiEx(request: QueryPreformanceTgagmiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceTgagmiResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceTgagmiResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.tgagmi.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceTgagmiResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceDadqnv(request: QueryPreformanceDadqnvRequest): Promise<QueryPreformanceDadqnvResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceDadqnvEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceDadqnvEx(request: QueryPreformanceDadqnvRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceDadqnvResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceDadqnvResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.dadqnv.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceDadqnvResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceCfxhof(request: QueryPreformanceCfxhofRequest): Promise<QueryPreformanceCfxhofResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceCfxhofEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceCfxhofEx(request: QueryPreformanceCfxhofRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceCfxhofResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceCfxhofResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.cfxhof.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceCfxhofResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceFlukhl(request: QueryPreformanceFlukhlRequest): Promise<QueryPreformanceFlukhlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceFlukhlEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceFlukhlEx(request: QueryPreformanceFlukhlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceFlukhlResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceFlukhlResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.flukhl.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceFlukhlResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceDuwewn(request: QueryPreformanceDuwewnRequest): Promise<QueryPreformanceDuwewnResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceDuwewnEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceDuwewnEx(request: QueryPreformanceDuwewnRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceDuwewnResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceDuwewnResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.duwewn.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceDuwewnResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceJcgpsj(request: QueryPreformanceJcgpsjRequest): Promise<QueryPreformanceJcgpsjResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceJcgpsjEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceJcgpsjEx(request: QueryPreformanceJcgpsjRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceJcgpsjResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceJcgpsjResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.jcgpsj.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceJcgpsjResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceIeexfu(request: QueryPreformanceIeexfuRequest): Promise<QueryPreformanceIeexfuResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceIeexfuEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceIeexfuEx(request: QueryPreformanceIeexfuRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceIeexfuResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceIeexfuResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ieexfu.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceIeexfuResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGalthw(request: QueryPreformanceGalthwRequest): Promise<QueryPreformanceGalthwResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceGalthwEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGalthwEx(request: QueryPreformanceGalthwRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceGalthwResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceGalthwResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.galthw.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceGalthwResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceFnmdoh(request: QueryPreformanceFnmdohRequest): Promise<QueryPreformanceFnmdohResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceFnmdohEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceFnmdohEx(request: QueryPreformanceFnmdohRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceFnmdohResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceFnmdohResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.fnmdoh.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceFnmdohResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceXngfdi(request: QueryPreformanceXngfdiRequest): Promise<QueryPreformanceXngfdiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceXngfdiEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceXngfdiEx(request: QueryPreformanceXngfdiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceXngfdiResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceXngfdiResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.xngfdi.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceXngfdiResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceHynnnn(request: QueryPreformanceHynnnnRequest): Promise<QueryPreformanceHynnnnResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceHynnnnEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceHynnnnEx(request: QueryPreformanceHynnnnRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceHynnnnResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceHynnnnResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.hynnnn.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceHynnnnResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceDyjtoy(request: QueryPreformanceDyjtoyRequest): Promise<QueryPreformanceDyjtoyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceDyjtoyEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceDyjtoyEx(request: QueryPreformanceDyjtoyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceDyjtoyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceDyjtoyResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.dyjtoy.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceDyjtoyResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceWenfdh(request: QueryPreformanceWenfdhRequest): Promise<QueryPreformanceWenfdhResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceWenfdhEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceWenfdhEx(request: QueryPreformanceWenfdhRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceWenfdhResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceWenfdhResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.wenfdh.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceWenfdhResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceJrctdx(request: QueryPreformanceJrctdxRequest): Promise<QueryPreformanceJrctdxResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceJrctdxEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceJrctdxEx(request: QueryPreformanceJrctdxRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceJrctdxResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceJrctdxResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.jrctdx.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceJrctdxResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceDfdlkv(request: QueryPreformanceDfdlkvRequest): Promise<QueryPreformanceDfdlkvResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceDfdlkvEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceDfdlkvEx(request: QueryPreformanceDfdlkvRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceDfdlkvResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceDfdlkvResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.dfdlkv.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceDfdlkvResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceKnwgew(request: QueryPreformanceKnwgewRequest): Promise<QueryPreformanceKnwgewResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceKnwgewEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceKnwgewEx(request: QueryPreformanceKnwgewRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceKnwgewResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceKnwgewResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.knwgew.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceKnwgewResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceApifsy(request: QueryPreformanceApifsyRequest): Promise<QueryPreformanceApifsyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceApifsyEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceApifsyEx(request: QueryPreformanceApifsyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceApifsyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceApifsyResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.apifsy.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceApifsyResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceMjgxpv(request: QueryPreformanceMjgxpvRequest): Promise<QueryPreformanceMjgxpvResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceMjgxpvEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceMjgxpvEx(request: QueryPreformanceMjgxpvRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceMjgxpvResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceMjgxpvResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.mjgxpv.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceMjgxpvResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceAskegs(request: QueryPreformanceAskegsRequest): Promise<QueryPreformanceAskegsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceAskegsEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceAskegsEx(request: QueryPreformanceAskegsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceAskegsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceAskegsResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.askegs.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceAskegsResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceJajelf(request: QueryPreformanceJajelfRequest): Promise<QueryPreformanceJajelfResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceJajelfEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceJajelfEx(request: QueryPreformanceJajelfRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceJajelfResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceJajelfResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.jajelf.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceJajelfResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceKstsxl(request: QueryPreformanceKstsxlRequest): Promise<QueryPreformanceKstsxlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceKstsxlEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceKstsxlEx(request: QueryPreformanceKstsxlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceKstsxlResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceKstsxlResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.kstsxl.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceKstsxlResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceYihqyc(request: QueryPreformanceYihqycRequest): Promise<QueryPreformanceYihqycResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceYihqycEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceYihqycEx(request: QueryPreformanceYihqycRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceYihqycResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceYihqycResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.yihqyc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceYihqycResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformancePaqveg(request: QueryPreformancePaqvegRequest): Promise<QueryPreformancePaqvegResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformancePaqvegEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformancePaqvegEx(request: QueryPreformancePaqvegRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformancePaqvegResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformancePaqvegResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.paqveg.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformancePaqvegResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVgtiiu(request: QueryPreformanceVgtiiuRequest): Promise<QueryPreformanceVgtiiuResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceVgtiiuEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVgtiiuEx(request: QueryPreformanceVgtiiuRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceVgtiiuResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceVgtiiuResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.vgtiiu.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceVgtiiuResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceSdlanz(request: QueryPreformanceSdlanzRequest): Promise<QueryPreformanceSdlanzResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceSdlanzEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceSdlanzEx(request: QueryPreformanceSdlanzRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceSdlanzResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceSdlanzResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.sdlanz.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceSdlanzResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceKkxxkf(request: QueryPreformanceKkxxkfRequest): Promise<QueryPreformanceKkxxkfResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceKkxxkfEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceKkxxkfEx(request: QueryPreformanceKkxxkfRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceKkxxkfResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceKkxxkfResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.kkxxkf.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceKkxxkfResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceEglmko(request: QueryPreformanceEglmkoRequest): Promise<QueryPreformanceEglmkoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceEglmkoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceEglmkoEx(request: QueryPreformanceEglmkoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceEglmkoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceEglmkoResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.eglmko.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceEglmkoResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceOquwum(request: QueryPreformanceOquwumRequest): Promise<QueryPreformanceOquwumResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceOquwumEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceOquwumEx(request: QueryPreformanceOquwumRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceOquwumResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceOquwumResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.oquwum.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceOquwumResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGsnlkh(request: QueryPreformanceGsnlkhRequest): Promise<QueryPreformanceGsnlkhResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceGsnlkhEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGsnlkhEx(request: QueryPreformanceGsnlkhRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceGsnlkhResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceGsnlkhResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.gsnlkh.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceGsnlkhResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceOjswwd(request: QueryPreformanceOjswwdRequest): Promise<QueryPreformanceOjswwdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceOjswwdEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceOjswwdEx(request: QueryPreformanceOjswwdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceOjswwdResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceOjswwdResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ojswwd.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceOjswwdResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceLmpubp(request: QueryPreformanceLmpubpRequest): Promise<QueryPreformanceLmpubpResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceLmpubpEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceLmpubpEx(request: QueryPreformanceLmpubpRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceLmpubpResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceLmpubpResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.lmpubp.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceLmpubpResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceMvjqpq(request: QueryPreformanceMvjqpqRequest): Promise<QueryPreformanceMvjqpqResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceMvjqpqEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceMvjqpqEx(request: QueryPreformanceMvjqpqRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceMvjqpqResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceMvjqpqResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.mvjqpq.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceMvjqpqResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceUpavrg(request: QueryPreformanceUpavrgRequest): Promise<QueryPreformanceUpavrgResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceUpavrgEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceUpavrgEx(request: QueryPreformanceUpavrgRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceUpavrgResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceUpavrgResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.upavrg.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceUpavrgResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceHovxvt(request: QueryPreformanceHovxvtRequest): Promise<QueryPreformanceHovxvtResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceHovxvtEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceHovxvtEx(request: QueryPreformanceHovxvtRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceHovxvtResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceHovxvtResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.hovxvt.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceHovxvtResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceLpgyzx(request: QueryPreformanceLpgyzxRequest): Promise<QueryPreformanceLpgyzxResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceLpgyzxEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceLpgyzxEx(request: QueryPreformanceLpgyzxRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceLpgyzxResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceLpgyzxResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.lpgyzx.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceLpgyzxResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformancePhleou(request: QueryPreformancePhleouRequest): Promise<QueryPreformancePhleouResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformancePhleouEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformancePhleouEx(request: QueryPreformancePhleouRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformancePhleouResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformancePhleouResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.phleou.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformancePhleouResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceEzhhni(request: QueryPreformanceEzhhniRequest): Promise<QueryPreformanceEzhhniResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceEzhhniEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceEzhhniEx(request: QueryPreformanceEzhhniRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceEzhhniResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceEzhhniResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ezhhni.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceEzhhniResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVmkgga(request: QueryPreformanceVmkggaRequest): Promise<QueryPreformanceVmkggaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceVmkggaEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVmkggaEx(request: QueryPreformanceVmkggaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceVmkggaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceVmkggaResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.vmkgga.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceVmkggaResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceSbsurx(request: QueryPreformanceSbsurxRequest): Promise<QueryPreformanceSbsurxResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceSbsurxEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceSbsurxEx(request: QueryPreformanceSbsurxRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceSbsurxResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceSbsurxResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.sbsurx.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceSbsurxResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGxqzrq(request: QueryPreformanceGxqzrqRequest): Promise<QueryPreformanceGxqzrqResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceGxqzrqEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGxqzrqEx(request: QueryPreformanceGxqzrqRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceGxqzrqResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceGxqzrqResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.gxqzrq.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceGxqzrqResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceHvgdsq(request: QueryPreformanceHvgdsqRequest): Promise<QueryPreformanceHvgdsqResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceHvgdsqEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceHvgdsqEx(request: QueryPreformanceHvgdsqRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceHvgdsqResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceHvgdsqResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.hvgdsq.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceHvgdsqResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceKatrmi(request: QueryPreformanceKatrmiRequest): Promise<QueryPreformanceKatrmiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceKatrmiEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceKatrmiEx(request: QueryPreformanceKatrmiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceKatrmiResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceKatrmiResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.katrmi.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceKatrmiResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceRdkcqd(request: QueryPreformanceRdkcqdRequest): Promise<QueryPreformanceRdkcqdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceRdkcqdEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceRdkcqdEx(request: QueryPreformanceRdkcqdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceRdkcqdResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceRdkcqdResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.rdkcqd.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceRdkcqdResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceYdpsao(request: QueryPreformanceYdpsaoRequest): Promise<QueryPreformanceYdpsaoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceYdpsaoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceYdpsaoEx(request: QueryPreformanceYdpsaoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceYdpsaoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceYdpsaoResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ydpsao.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceYdpsaoResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceFbqfgd(request: QueryPreformanceFbqfgdRequest): Promise<QueryPreformanceFbqfgdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceFbqfgdEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceFbqfgdEx(request: QueryPreformanceFbqfgdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceFbqfgdResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceFbqfgdResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.fbqfgd.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceFbqfgdResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVyqznv(request: QueryPreformanceVyqznvRequest): Promise<QueryPreformanceVyqznvResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceVyqznvEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVyqznvEx(request: QueryPreformanceVyqznvRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceVyqznvResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceVyqznvResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.vyqznv.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceVyqznvResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceIwhkbp(request: QueryPreformanceIwhkbpRequest): Promise<QueryPreformanceIwhkbpResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceIwhkbpEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceIwhkbpEx(request: QueryPreformanceIwhkbpRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceIwhkbpResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceIwhkbpResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.iwhkbp.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceIwhkbpResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGcavtc(request: QueryPreformanceGcavtcRequest): Promise<QueryPreformanceGcavtcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceGcavtcEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGcavtcEx(request: QueryPreformanceGcavtcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceGcavtcResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceGcavtcResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.gcavtc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceGcavtcResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceEigmbu(request: QueryPreformanceEigmbuRequest): Promise<QueryPreformanceEigmbuResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceEigmbuEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceEigmbuEx(request: QueryPreformanceEigmbuRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceEigmbuResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceEigmbuResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.eigmbu.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceEigmbuResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceNsxzrq(request: QueryPreformanceNsxzrqRequest): Promise<QueryPreformanceNsxzrqResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceNsxzrqEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceNsxzrqEx(request: QueryPreformanceNsxzrqRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceNsxzrqResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceNsxzrqResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.nsxzrq.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceNsxzrqResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceHzlepw(request: QueryPreformanceHzlepwRequest): Promise<QueryPreformanceHzlepwResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceHzlepwEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceHzlepwEx(request: QueryPreformanceHzlepwRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceHzlepwResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceHzlepwResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.hzlepw.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceHzlepwResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceUpoctv(request: QueryPreformanceUpoctvRequest): Promise<QueryPreformanceUpoctvResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceUpoctvEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceUpoctvEx(request: QueryPreformanceUpoctvRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceUpoctvResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceUpoctvResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.upoctv.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceUpoctvResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformancePdyotj(request: QueryPreformancePdyotjRequest): Promise<QueryPreformancePdyotjResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformancePdyotjEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformancePdyotjEx(request: QueryPreformancePdyotjRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformancePdyotjResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformancePdyotjResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.pdyotj.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformancePdyotjResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceQfhcuy(request: QueryPreformanceQfhcuyRequest): Promise<QueryPreformanceQfhcuyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceQfhcuyEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceQfhcuyEx(request: QueryPreformanceQfhcuyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceQfhcuyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceQfhcuyResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.qfhcuy.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceQfhcuyResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceJuynkn(request: QueryPreformanceJuynknRequest): Promise<QueryPreformanceJuynknResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceJuynknEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceJuynknEx(request: QueryPreformanceJuynknRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceJuynknResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceJuynknResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.juynkn.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceJuynknResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceTxdmeo(request: QueryPreformanceTxdmeoRequest): Promise<QueryPreformanceTxdmeoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceTxdmeoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceTxdmeoEx(request: QueryPreformanceTxdmeoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceTxdmeoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceTxdmeoResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.txdmeo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceTxdmeoResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceKcjxng(request: QueryPreformanceKcjxngRequest): Promise<QueryPreformanceKcjxngResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceKcjxngEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceKcjxngEx(request: QueryPreformanceKcjxngRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceKcjxngResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceKcjxngResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.kcjxng.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceKcjxngResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceXyfytz(request: QueryPreformanceXyfytzRequest): Promise<QueryPreformanceXyfytzResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceXyfytzEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceXyfytzEx(request: QueryPreformanceXyfytzRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceXyfytzResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceXyfytzResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.xyfytz.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceXyfytzResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceHxmzyi(request: QueryPreformanceHxmzyiRequest): Promise<QueryPreformanceHxmzyiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceHxmzyiEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceHxmzyiEx(request: QueryPreformanceHxmzyiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceHxmzyiResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceHxmzyiResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.hxmzyi.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceHxmzyiResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceSxdzlb(request: QueryPreformanceSxdzlbRequest): Promise<QueryPreformanceSxdzlbResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceSxdzlbEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceSxdzlbEx(request: QueryPreformanceSxdzlbRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceSxdzlbResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceSxdzlbResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.sxdzlb.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceSxdzlbResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceZmuzkg(request: QueryPreformanceZmuzkgRequest): Promise<QueryPreformanceZmuzkgResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceZmuzkgEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceZmuzkgEx(request: QueryPreformanceZmuzkgRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceZmuzkgResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceZmuzkgResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.zmuzkg.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceZmuzkgResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceAiojyz(request: QueryPreformanceAiojyzRequest): Promise<QueryPreformanceAiojyzResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceAiojyzEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceAiojyzEx(request: QueryPreformanceAiojyzRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceAiojyzResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceAiojyzResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.aiojyz.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceAiojyzResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceQxhgml(request: QueryPreformanceQxhgmlRequest): Promise<QueryPreformanceQxhgmlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceQxhgmlEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceQxhgmlEx(request: QueryPreformanceQxhgmlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceQxhgmlResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceQxhgmlResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.qxhgml.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceQxhgmlResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceUbklss(request: QueryPreformanceUbklssRequest): Promise<QueryPreformanceUbklssResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceUbklssEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceUbklssEx(request: QueryPreformanceUbklssRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceUbklssResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceUbklssResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ubklss.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceUbklssResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGcavnv(request: QueryPreformanceGcavnvRequest): Promise<QueryPreformanceGcavnvResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceGcavnvEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGcavnvEx(request: QueryPreformanceGcavnvRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceGcavnvResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceGcavnvResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.gcavnv.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceGcavnvResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceUcybsn(request: QueryPreformanceUcybsnRequest): Promise<QueryPreformanceUcybsnResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceUcybsnEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceUcybsnEx(request: QueryPreformanceUcybsnRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceUcybsnResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceUcybsnResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ucybsn.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceUcybsnResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceAzwtos(request: QueryPreformanceAzwtosRequest): Promise<QueryPreformanceAzwtosResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceAzwtosEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceAzwtosEx(request: QueryPreformanceAzwtosRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceAzwtosResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceAzwtosResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.azwtos.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceAzwtosResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceWrbbyt(request: QueryPreformanceWrbbytRequest): Promise<QueryPreformanceWrbbytResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceWrbbytEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceWrbbytEx(request: QueryPreformanceWrbbytRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceWrbbytResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceWrbbytResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.wrbbyt.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceWrbbytResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceIvbcwv(request: QueryPreformanceIvbcwvRequest): Promise<QueryPreformanceIvbcwvResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceIvbcwvEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceIvbcwvEx(request: QueryPreformanceIvbcwvRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceIvbcwvResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceIvbcwvResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ivbcwv.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceIvbcwvResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceTvcsig(request: QueryPreformanceTvcsigRequest): Promise<QueryPreformanceTvcsigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceTvcsigEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceTvcsigEx(request: QueryPreformanceTvcsigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceTvcsigResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceTvcsigResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.tvcsig.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceTvcsigResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVvsvkx(request: QueryPreformanceVvsvkxRequest): Promise<QueryPreformanceVvsvkxResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceVvsvkxEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVvsvkxEx(request: QueryPreformanceVvsvkxRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceVvsvkxResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceVvsvkxResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.vvsvkx.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceVvsvkxResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceRxetnj(request: QueryPreformanceRxetnjRequest): Promise<QueryPreformanceRxetnjResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceRxetnjEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceRxetnjEx(request: QueryPreformanceRxetnjRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceRxetnjResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceRxetnjResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.rxetnj.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceRxetnjResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceDulefc(request: QueryPreformanceDulefcRequest): Promise<QueryPreformanceDulefcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceDulefcEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceDulefcEx(request: QueryPreformanceDulefcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceDulefcResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceDulefcResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.dulefc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceDulefcResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceJsazbw(request: QueryPreformanceJsazbwRequest): Promise<QueryPreformanceJsazbwResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceJsazbwEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceJsazbwEx(request: QueryPreformanceJsazbwRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceJsazbwResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceJsazbwResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.jsazbw.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceJsazbwResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceXhzfca(request: QueryPreformanceXhzfcaRequest): Promise<QueryPreformanceXhzfcaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceXhzfcaEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceXhzfcaEx(request: QueryPreformanceXhzfcaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceXhzfcaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceXhzfcaResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.xhzfca.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceXhzfcaResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceDgzghr(request: QueryPreformanceDgzghrRequest): Promise<QueryPreformanceDgzghrResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceDgzghrEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceDgzghrEx(request: QueryPreformanceDgzghrRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceDgzghrResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceDgzghrResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.dgzghr.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceDgzghrResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceDmjttz(request: QueryPreformanceDmjttzRequest): Promise<QueryPreformanceDmjttzResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceDmjttzEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceDmjttzEx(request: QueryPreformanceDmjttzRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceDmjttzResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceDmjttzResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.dmjttz.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceDmjttzResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceCahjgj(request: QueryPreformanceCahjgjRequest): Promise<QueryPreformanceCahjgjResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceCahjgjEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceCahjgjEx(request: QueryPreformanceCahjgjRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceCahjgjResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceCahjgjResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.cahjgj.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceCahjgjResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceRjbfvt(request: QueryPreformanceRjbfvtRequest): Promise<QueryPreformanceRjbfvtResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceRjbfvtEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceRjbfvtEx(request: QueryPreformanceRjbfvtRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceRjbfvtResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceRjbfvtResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.rjbfvt.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceRjbfvtResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceAywijl(request: QueryPreformanceAywijlRequest): Promise<QueryPreformanceAywijlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceAywijlEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceAywijlEx(request: QueryPreformanceAywijlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceAywijlResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceAywijlResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.aywijl.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceAywijlResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceBcjihi(request: QueryPreformanceBcjihiRequest): Promise<QueryPreformanceBcjihiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceBcjihiEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceBcjihiEx(request: QueryPreformanceBcjihiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceBcjihiResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceBcjihiResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.bcjihi.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceBcjihiResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVewdbw(request: QueryPreformanceVewdbwRequest): Promise<QueryPreformanceVewdbwResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceVewdbwEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVewdbwEx(request: QueryPreformanceVewdbwRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceVewdbwResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceVewdbwResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.vewdbw.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceVewdbwResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceWgbntj(request: QueryPreformanceWgbntjRequest): Promise<QueryPreformanceWgbntjResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceWgbntjEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceWgbntjEx(request: QueryPreformanceWgbntjRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceWgbntjResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceWgbntjResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.wgbntj.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceWgbntjResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceDwzzxq(request: QueryPreformanceDwzzxqRequest): Promise<QueryPreformanceDwzzxqResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceDwzzxqEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceDwzzxqEx(request: QueryPreformanceDwzzxqRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceDwzzxqResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceDwzzxqResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.dwzzxq.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceDwzzxqResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceMhldih(request: QueryPreformanceMhldihRequest): Promise<QueryPreformanceMhldihResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceMhldihEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceMhldihEx(request: QueryPreformanceMhldihRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceMhldihResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceMhldihResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.mhldih.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceMhldihResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceUtivei(request: QueryPreformanceUtiveiRequest): Promise<QueryPreformanceUtiveiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceUtiveiEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceUtiveiEx(request: QueryPreformanceUtiveiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceUtiveiResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceUtiveiResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.utivei.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceUtiveiResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformancePrgtxg(request: QueryPreformancePrgtxgRequest): Promise<QueryPreformancePrgtxgResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformancePrgtxgEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformancePrgtxgEx(request: QueryPreformancePrgtxgRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformancePrgtxgResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformancePrgtxgResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.prgtxg.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformancePrgtxgResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceXezxoy(request: QueryPreformanceXezxoyRequest): Promise<QueryPreformanceXezxoyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceXezxoyEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceXezxoyEx(request: QueryPreformanceXezxoyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceXezxoyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceXezxoyResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.xezxoy.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceXezxoyResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceChnteu(request: QueryPreformanceChnteuRequest): Promise<QueryPreformanceChnteuResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceChnteuEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceChnteuEx(request: QueryPreformanceChnteuRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceChnteuResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceChnteuResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.chnteu.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceChnteuResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGzbbbc(request: QueryPreformanceGzbbbcRequest): Promise<QueryPreformanceGzbbbcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceGzbbbcEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGzbbbcEx(request: QueryPreformanceGzbbbcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceGzbbbcResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceGzbbbcResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.gzbbbc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceGzbbbcResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceEdwgsr(request: QueryPreformanceEdwgsrRequest): Promise<QueryPreformanceEdwgsrResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceEdwgsrEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceEdwgsrEx(request: QueryPreformanceEdwgsrRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceEdwgsrResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceEdwgsrResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.edwgsr.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceEdwgsrResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceEdmasf(request: QueryPreformanceEdmasfRequest): Promise<QueryPreformanceEdmasfResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceEdmasfEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceEdmasfEx(request: QueryPreformanceEdmasfRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceEdmasfResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceEdmasfResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.edmasf.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceEdmasfResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceZzwagi(request: QueryPreformanceZzwagiRequest): Promise<QueryPreformanceZzwagiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceZzwagiEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceZzwagiEx(request: QueryPreformanceZzwagiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceZzwagiResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceZzwagiResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.zzwagi.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceZzwagiResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceHlgygq(request: QueryPreformanceHlgygqRequest): Promise<QueryPreformanceHlgygqResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceHlgygqEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceHlgygqEx(request: QueryPreformanceHlgygqRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceHlgygqResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceHlgygqResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.hlgygq.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceHlgygqResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceXajpki(request: QueryPreformanceXajpkiRequest): Promise<QueryPreformanceXajpkiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceXajpkiEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceXajpkiEx(request: QueryPreformanceXajpkiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceXajpkiResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceXajpkiResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.xajpki.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceXajpkiResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceOwjbho(request: QueryPreformanceOwjbhoRequest): Promise<QueryPreformanceOwjbhoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceOwjbhoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceOwjbhoEx(request: QueryPreformanceOwjbhoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceOwjbhoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceOwjbhoResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.owjbho.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceOwjbhoResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceEcvcwy(request: QueryPreformanceEcvcwyRequest): Promise<QueryPreformanceEcvcwyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceEcvcwyEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceEcvcwyEx(request: QueryPreformanceEcvcwyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceEcvcwyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceEcvcwyResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ecvcwy.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceEcvcwyResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceWxvpvm(request: QueryPreformanceWxvpvmRequest): Promise<QueryPreformanceWxvpvmResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceWxvpvmEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceWxvpvmEx(request: QueryPreformanceWxvpvmRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceWxvpvmResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceWxvpvmResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.wxvpvm.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceWxvpvmResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceItjtfb(request: QueryPreformanceItjtfbRequest): Promise<QueryPreformanceItjtfbResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceItjtfbEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceItjtfbEx(request: QueryPreformanceItjtfbRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceItjtfbResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceItjtfbResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.itjtfb.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceItjtfbResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceCvlthh(request: QueryPreformanceCvlthhRequest): Promise<QueryPreformanceCvlthhResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceCvlthhEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceCvlthhEx(request: QueryPreformanceCvlthhRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceCvlthhResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceCvlthhResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.cvlthh.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceCvlthhResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceMnedeh(request: QueryPreformanceMnedehRequest): Promise<QueryPreformanceMnedehResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceMnedehEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceMnedehEx(request: QueryPreformanceMnedehRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceMnedehResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceMnedehResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.mnedeh.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceMnedehResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceIisiwt(request: QueryPreformanceIisiwtRequest): Promise<QueryPreformanceIisiwtResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceIisiwtEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceIisiwtEx(request: QueryPreformanceIisiwtRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceIisiwtResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceIisiwtResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.iisiwt.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceIisiwtResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceNbdxum(request: QueryPreformanceNbdxumRequest): Promise<QueryPreformanceNbdxumResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceNbdxumEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceNbdxumEx(request: QueryPreformanceNbdxumRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceNbdxumResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceNbdxumResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.nbdxum.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceNbdxumResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceSzsmht(request: QueryPreformanceSzsmhtRequest): Promise<QueryPreformanceSzsmhtResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceSzsmhtEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceSzsmhtEx(request: QueryPreformanceSzsmhtRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceSzsmhtResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceSzsmhtResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.szsmht.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceSzsmhtResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVfruka(request: QueryPreformanceVfrukaRequest): Promise<QueryPreformanceVfrukaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceVfrukaEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceVfrukaEx(request: QueryPreformanceVfrukaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceVfrukaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceVfrukaResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.vfruka.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceVfrukaResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGcvneh(request: QueryPreformanceGcvnehRequest): Promise<QueryPreformanceGcvnehResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceGcvnehEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceGcvnehEx(request: QueryPreformanceGcvnehRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceGcvnehResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceGcvnehResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.gcvneh.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceGcvnehResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceWmxlge(request: QueryPreformanceWmxlgeRequest): Promise<QueryPreformanceWmxlgeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceWmxlgeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceWmxlgeEx(request: QueryPreformanceWmxlgeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceWmxlgeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceWmxlgeResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.wmxlge.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceWmxlgeResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceLcsnas(request: QueryPreformanceLcsnasRequest): Promise<QueryPreformanceLcsnasResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceLcsnasEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceLcsnasEx(request: QueryPreformanceLcsnasRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceLcsnasResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceLcsnasResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.lcsnas.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceLcsnasResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceEmfcan(request: QueryPreformanceEmfcanRequest): Promise<QueryPreformanceEmfcanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceEmfcanEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceEmfcanEx(request: QueryPreformanceEmfcanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceEmfcanResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceEmfcanResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.emfcan.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceEmfcanResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceHmgrsy(request: QueryPreformanceHmgrsyRequest): Promise<QueryPreformanceHmgrsyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceHmgrsyEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceHmgrsyEx(request: QueryPreformanceHmgrsyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceHmgrsyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceHmgrsyResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.hmgrsy.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceHmgrsyResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceFgadhf(request: QueryPreformanceFgadhfRequest): Promise<QueryPreformanceFgadhfResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceFgadhfEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceFgadhfEx(request: QueryPreformanceFgadhfRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceFgadhfResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceFgadhfResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.fgadhf.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceFgadhfResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceRmevfq(request: QueryPreformanceRmevfqRequest): Promise<QueryPreformanceRmevfqResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceRmevfqEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceRmevfqEx(request: QueryPreformanceRmevfqRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceRmevfqResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceRmevfqResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.rmevfq.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceRmevfqResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceElpwxx(request: QueryPreformanceElpwxxRequest): Promise<QueryPreformanceElpwxxResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceElpwxxEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceElpwxxEx(request: QueryPreformanceElpwxxRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceElpwxxResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceElpwxxResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.elpwxx.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceElpwxxResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceAislle(request: QueryPreformanceAislleRequest): Promise<QueryPreformanceAislleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceAislleEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceAislleEx(request: QueryPreformanceAislleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceAislleResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceAislleResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.aislle.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceAislleResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceFbupco(request: QueryPreformanceFbupcoRequest): Promise<QueryPreformanceFbupcoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceFbupcoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceFbupcoEx(request: QueryPreformanceFbupcoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceFbupcoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceFbupcoResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.fbupco.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceFbupcoResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceSolifa(request: QueryPreformanceSolifaRequest): Promise<QueryPreformanceSolifaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceSolifaEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceSolifaEx(request: QueryPreformanceSolifaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceSolifaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceSolifaResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.solifa.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceSolifaResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceEcowvh(request: QueryPreformanceEcowvhRequest): Promise<QueryPreformanceEcowvhResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceEcowvhEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceEcowvhEx(request: QueryPreformanceEcowvhRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceEcowvhResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceEcowvhResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ecowvh.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceEcowvhResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceMudnye(request: QueryPreformanceMudnyeRequest): Promise<QueryPreformanceMudnyeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceMudnyeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceMudnyeEx(request: QueryPreformanceMudnyeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceMudnyeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceMudnyeResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.mudnye.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceMudnyeResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceLswaxk(request: QueryPreformanceLswaxkRequest): Promise<QueryPreformanceLswaxkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceLswaxkEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceLswaxkEx(request: QueryPreformanceLswaxkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceLswaxkResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceLswaxkResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.lswaxk.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceLswaxkResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceAruxng(request: QueryPreformanceAruxngRequest): Promise<QueryPreformanceAruxngResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceAruxngEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceAruxngEx(request: QueryPreformanceAruxngRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceAruxngResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceAruxngResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.aruxng.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceAruxngResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceHbnwdp(request: QueryPreformanceHbnwdpRequest): Promise<QueryPreformanceHbnwdpResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceHbnwdpEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceHbnwdpEx(request: QueryPreformanceHbnwdpRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceHbnwdpResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceHbnwdpResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.hbnwdp.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceHbnwdpResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceUfdptn(request: QueryPreformanceUfdptnRequest): Promise<QueryPreformanceUfdptnResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceUfdptnEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceUfdptnEx(request: QueryPreformanceUfdptnRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceUfdptnResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceUfdptnResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ufdptn.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceUfdptnResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceReyqjr(request: QueryPreformanceReyqjrRequest): Promise<QueryPreformanceReyqjrResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceReyqjrEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceReyqjrEx(request: QueryPreformanceReyqjrRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceReyqjrResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceReyqjrResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.reyqjr.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceReyqjrResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceWtxvtj(request: QueryPreformanceWtxvtjRequest): Promise<QueryPreformanceWtxvtjResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceWtxvtjEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceWtxvtjEx(request: QueryPreformanceWtxvtjRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceWtxvtjResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceWtxvtjResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.wtxvtj.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceWtxvtjResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceLjbjmk(request: QueryPreformanceLjbjmkRequest): Promise<QueryPreformanceLjbjmkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceLjbjmkEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceLjbjmkEx(request: QueryPreformanceLjbjmkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceLjbjmkResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceLjbjmkResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ljbjmk.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceLjbjmkResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceCryfwz(request: QueryPreformanceCryfwzRequest): Promise<QueryPreformanceCryfwzResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceCryfwzEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceCryfwzEx(request: QueryPreformanceCryfwzRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceCryfwzResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceCryfwzResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.cryfwz.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceCryfwzResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformancePxnzuw(request: QueryPreformancePxnzuwRequest): Promise<QueryPreformancePxnzuwResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformancePxnzuwEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformancePxnzuwEx(request: QueryPreformancePxnzuwRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformancePxnzuwResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformancePxnzuwResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.pxnzuw.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformancePxnzuwResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformancePpefnn(request: QueryPreformancePpefnnRequest): Promise<QueryPreformancePpefnnResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformancePpefnnEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformancePpefnnEx(request: QueryPreformancePpefnnRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformancePpefnnResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformancePpefnnResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.ppefnn.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformancePpefnnResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceHhekdx(request: QueryPreformanceHhekdxRequest): Promise<QueryPreformanceHhekdxResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceHhekdxEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceHhekdxEx(request: QueryPreformanceHhekdxRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceHhekdxResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceHhekdxResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.hhekdx.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceHhekdxResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceYirplb(request: QueryPreformanceYirplbRequest): Promise<QueryPreformanceYirplbResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceYirplbEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceYirplbEx(request: QueryPreformanceYirplbRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceYirplbResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceYirplbResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.yirplb.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceYirplbResponse({}));
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceJgxxvb(request: QueryPreformanceJgxxvbRequest): Promise<QueryPreformanceJgxxvbResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPreformanceJgxxvbEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 门户性能测试
   * Summary: 门户性能测试
   */
  async queryPreformanceJgxxvbEx(request: QueryPreformanceJgxxvbRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPreformanceJgxxvbResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPreformanceJgxxvbResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.preformance.jgxxvb.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPreformanceJgxxvbResponse({}));
  }

  /**
   * @remarks
   * Description: 创建http协议api
   * Summary: 创建http协议api
   */
  async apiCreateHttp(request: ApiCreateHttpRequest): Promise<ApiCreateHttpResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.apiCreateHttpEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建http协议api
   * Summary: 创建http协议api
   */
  async apiCreateHttpEx(request: ApiCreateHttpRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApiCreateHttpResponse> {
    Util.validateModel(request);
    return $tea.cast<ApiCreateHttpResponse>(await this.doRequest("1.0", "antdigital.jzqproducta.create.http.api", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApiCreateHttpResponse({}));
  }

}
