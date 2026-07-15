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

// x
export class OrderItemX extends $tea.Model {
  // a
  /**
   * @example
   * 1
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

export class CreateBusinessOrderzzzRequest extends $tea.Model {
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

export class CreateBusinessOrderzzzResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单ID
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

export class CreateBusinessOrderpppRequest extends $tea.Model {
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

export class CreateBusinessOrderpppResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果描述
  msg?: string;
  // 结果码
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApiaCliCreateRequest extends $tea.Model {
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

export class ApiaCliCreateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果描述
  msg?: string;
  // 结果码
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApibCliCreateRequest extends $tea.Model {
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

export class ApibCliCreateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果描述
  msg?: string;
  // 结果码
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApicCliCreateRequest extends $tea.Model {
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

export class ApicCliCreateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果描述
  msg?: string;
  // 结果码
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApieCliCreateRequest extends $tea.Model {
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

export class ApieCliCreateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果描述
  msg?: string;
  // 结果码
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBusinessOrderaaaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单编号
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

export class CreateBusinessOrderaaaResponse extends $tea.Model {
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

export class CreateBusinessOrderbbbRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单编号
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

export class CreateBusinessOrderbbbResponse extends $tea.Model {
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

export class CreateBusinessOrdereeeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单编号
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

export class CreateBusinessOrdereeeResponse extends $tea.Model {
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

export class CreateBusinessOrderdddRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单编号
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

export class CreateBusinessOrderdddResponse extends $tea.Model {
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

export class CreateBusinessOrderabcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单编号
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

export class CreateBusinessOrderabcResponse extends $tea.Model {
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

export class CreateBusinessOrderfffRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单编号
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

export class CreateBusinessOrderfffResponse extends $tea.Model {
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

export class CreateBusinessOrdergggRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单编号
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

export class CreateBusinessOrdergggResponse extends $tea.Model {
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

export class CreateBusinessOrderhRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单编号
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

export class CreateBusinessOrderhResponse extends $tea.Model {
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

export class CreateBusinessOrderiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单编号
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

export class CreateBusinessOrderiResponse extends $tea.Model {
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

export class CreateBusinessOrderjRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单编号
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

export class CreateBusinessOrderjResponse extends $tea.Model {
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

export class CreateBusinessOrderkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单编号
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

export class CreateBusinessOrderkResponse extends $tea.Model {
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

export class CreateBusinessOrderlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单编号
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

export class CreateBusinessOrderlResponse extends $tea.Model {
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

export class CreateBusinessOrderoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单编号
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

export class CreateBusinessOrderoResponse extends $tea.Model {
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

export class CreateBusinessOrderrRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单编号
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

export class CreateBusinessOrderrResponse extends $tea.Model {
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

export class CreateBusinessOrdersRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单编号
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

export class CreateBusinessOrdersResponse extends $tea.Model {
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

export class ApifCliCreateRequest extends $tea.Model {
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

export class ApifCliCreateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果描述
  msg?: string;
  // 结果码
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApigCliCreateRequest extends $tea.Model {
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

export class ApigCliCreateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果描述
  msg?: string;
  // 结果码
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApiCliCreateRequest extends $tea.Model {
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

export class ApiCliCreateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果描述
  msg?: string;
  // 结果码
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msg: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApihCliCreateRequest extends $tea.Model {
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

export class ApihCliCreateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果描述
  msg?: string;
  // 结果码
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msg: 'msg',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
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
          sdk_version: "1.0.0",
          _prod_code: "CLIPRODUCT",
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
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrderzzz(request: CreateBusinessOrderzzzRequest): Promise<CreateBusinessOrderzzzResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBusinessOrderzzzEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrderzzzEx(request: CreateBusinessOrderzzzRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBusinessOrderzzzResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBusinessOrderzzzResponse>(await this.doRequest("1.0", "antdigital.cliproduct.business.orderzzz.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBusinessOrderzzzResponse({}));
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrderppp(request: CreateBusinessOrderpppRequest): Promise<CreateBusinessOrderpppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBusinessOrderpppEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrderpppEx(request: CreateBusinessOrderpppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBusinessOrderpppResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBusinessOrderpppResponse>(await this.doRequest("1.0", "antdigital.cliproduct.business.orderppp.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBusinessOrderpppResponse({}));
  }

  /**
   * @remarks
   * Description: cli创建测试接口A
   * Summary: cli创建测试接口A
   */
  async apiaCliCreate(request: ApiaCliCreateRequest): Promise<ApiaCliCreateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.apiaCliCreateEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: cli创建测试接口A
   * Summary: cli创建测试接口A
   */
  async apiaCliCreateEx(request: ApiaCliCreateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApiaCliCreateResponse> {
    Util.validateModel(request);
    return $tea.cast<ApiaCliCreateResponse>(await this.doRequest("1.0", "antdigital.cliproduct.cli.create.apia", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApiaCliCreateResponse({}));
  }

  /**
   * @remarks
   * Description: cli创建测试接口A
   * Summary: cli创建测试接口A
   */
  async apibCliCreate(request: ApibCliCreateRequest): Promise<ApibCliCreateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.apibCliCreateEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: cli创建测试接口A
   * Summary: cli创建测试接口A
   */
  async apibCliCreateEx(request: ApibCliCreateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApibCliCreateResponse> {
    Util.validateModel(request);
    return $tea.cast<ApibCliCreateResponse>(await this.doRequest("1.0", "antdigital.cliproduct.cli.create.apib", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApibCliCreateResponse({}));
  }

  /**
   * @remarks
   * Description: cli创建测试接口A
   * Summary: cli创建测试接口A
   */
  async apicCliCreate(request: ApicCliCreateRequest): Promise<ApicCliCreateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.apicCliCreateEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: cli创建测试接口A
   * Summary: cli创建测试接口A
   */
  async apicCliCreateEx(request: ApicCliCreateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApicCliCreateResponse> {
    Util.validateModel(request);
    return $tea.cast<ApicCliCreateResponse>(await this.doRequest("1.0", "antdigital.cliproduct.cli.create.apic", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApicCliCreateResponse({}));
  }

  /**
   * @remarks
   * Description: cli创建测试接口A
   * Summary: cli创建测试接口A
   */
  async apieCliCreate(request: ApieCliCreateRequest): Promise<ApieCliCreateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.apieCliCreateEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: cli创建测试接口A
   * Summary: cli创建测试接口A
   */
  async apieCliCreateEx(request: ApieCliCreateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApieCliCreateResponse> {
    Util.validateModel(request);
    return $tea.cast<ApieCliCreateResponse>(await this.doRequest("1.0", "antdigital.cliproduct.cli.create.apie", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApieCliCreateResponse({}));
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrderaaa(request: CreateBusinessOrderaaaRequest): Promise<CreateBusinessOrderaaaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBusinessOrderaaaEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrderaaaEx(request: CreateBusinessOrderaaaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBusinessOrderaaaResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBusinessOrderaaaResponse>(await this.doRequest("1.0", "antdigital.cliproduct.business.orderaaa.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBusinessOrderaaaResponse({}));
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrderbbb(request: CreateBusinessOrderbbbRequest): Promise<CreateBusinessOrderbbbResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBusinessOrderbbbEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrderbbbEx(request: CreateBusinessOrderbbbRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBusinessOrderbbbResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBusinessOrderbbbResponse>(await this.doRequest("1.0", "antdigital.cliproduct.business.orderbbb.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBusinessOrderbbbResponse({}));
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrdereee(request: CreateBusinessOrdereeeRequest): Promise<CreateBusinessOrdereeeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBusinessOrdereeeEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrdereeeEx(request: CreateBusinessOrdereeeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBusinessOrdereeeResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBusinessOrdereeeResponse>(await this.doRequest("1.0", "antdigital.cliproduct.business.ordereee.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBusinessOrdereeeResponse({}));
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrderddd(request: CreateBusinessOrderdddRequest): Promise<CreateBusinessOrderdddResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBusinessOrderdddEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrderdddEx(request: CreateBusinessOrderdddRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBusinessOrderdddResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBusinessOrderdddResponse>(await this.doRequest("1.0", "antdigital.cliproduct.business.orderddd.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBusinessOrderdddResponse({}));
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrderabc(request: CreateBusinessOrderabcRequest): Promise<CreateBusinessOrderabcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBusinessOrderabcEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrderabcEx(request: CreateBusinessOrderabcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBusinessOrderabcResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBusinessOrderabcResponse>(await this.doRequest("1.0", "antdigital.cliproduct.business.orderabc.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBusinessOrderabcResponse({}));
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrderfff(request: CreateBusinessOrderfffRequest): Promise<CreateBusinessOrderfffResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBusinessOrderfffEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrderfffEx(request: CreateBusinessOrderfffRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBusinessOrderfffResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBusinessOrderfffResponse>(await this.doRequest("1.0", "antdigital.cliproduct.business.orderfff.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBusinessOrderfffResponse({}));
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrderggg(request: CreateBusinessOrdergggRequest): Promise<CreateBusinessOrdergggResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBusinessOrdergggEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrdergggEx(request: CreateBusinessOrdergggRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBusinessOrdergggResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBusinessOrdergggResponse>(await this.doRequest("1.0", "antdigital.cliproduct.business.orderggg.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBusinessOrdergggResponse({}));
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrderh(request: CreateBusinessOrderhRequest): Promise<CreateBusinessOrderhResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBusinessOrderhEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrderhEx(request: CreateBusinessOrderhRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBusinessOrderhResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBusinessOrderhResponse>(await this.doRequest("1.0", "antdigital.cliproduct.business.orderh.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBusinessOrderhResponse({}));
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrderi(request: CreateBusinessOrderiRequest): Promise<CreateBusinessOrderiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBusinessOrderiEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrderiEx(request: CreateBusinessOrderiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBusinessOrderiResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBusinessOrderiResponse>(await this.doRequest("1.0", "antdigital.cliproduct.business.orderi.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBusinessOrderiResponse({}));
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrderj(request: CreateBusinessOrderjRequest): Promise<CreateBusinessOrderjResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBusinessOrderjEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrderjEx(request: CreateBusinessOrderjRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBusinessOrderjResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBusinessOrderjResponse>(await this.doRequest("1.0", "antdigital.cliproduct.business.orderj.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBusinessOrderjResponse({}));
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrderk(request: CreateBusinessOrderkRequest): Promise<CreateBusinessOrderkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBusinessOrderkEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrderkEx(request: CreateBusinessOrderkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBusinessOrderkResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBusinessOrderkResponse>(await this.doRequest("1.0", "antdigital.cliproduct.business.orderk.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBusinessOrderkResponse({}));
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrderl(request: CreateBusinessOrderlRequest): Promise<CreateBusinessOrderlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBusinessOrderlEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrderlEx(request: CreateBusinessOrderlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBusinessOrderlResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBusinessOrderlResponse>(await this.doRequest("1.0", "antdigital.cliproduct.business.orderl.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBusinessOrderlResponse({}));
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrdero(request: CreateBusinessOrderoRequest): Promise<CreateBusinessOrderoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBusinessOrderoEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrderoEx(request: CreateBusinessOrderoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBusinessOrderoResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBusinessOrderoResponse>(await this.doRequest("1.0", "antdigital.cliproduct.business.ordero.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBusinessOrderoResponse({}));
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrderr(request: CreateBusinessOrderrRequest): Promise<CreateBusinessOrderrResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBusinessOrderrEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrderrEx(request: CreateBusinessOrderrRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBusinessOrderrResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBusinessOrderrResponse>(await this.doRequest("1.0", "antdigital.cliproduct.business.orderr.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBusinessOrderrResponse({}));
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrders(request: CreateBusinessOrdersRequest): Promise<CreateBusinessOrdersResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBusinessOrdersEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 创建订单
   * Summary: 创建订单
   */
  async createBusinessOrdersEx(request: CreateBusinessOrdersRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBusinessOrdersResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBusinessOrdersResponse>(await this.doRequest("1.0", "antdigital.cliproduct.business.orders.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBusinessOrdersResponse({}));
  }

  /**
   * @remarks
   * Description: cli创建测试接口D
   * Summary: cli创建测试接口D
   */
  async apifCliCreate(request: ApifCliCreateRequest): Promise<ApifCliCreateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.apifCliCreateEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: cli创建测试接口D
   * Summary: cli创建测试接口D
   */
  async apifCliCreateEx(request: ApifCliCreateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApifCliCreateResponse> {
    Util.validateModel(request);
    return $tea.cast<ApifCliCreateResponse>(await this.doRequest("1.0", "antdigital.cliproduct.cli.create.apif", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApifCliCreateResponse({}));
  }

  /**
   * @remarks
   * Description: cli创建测试接口G
   * Summary: cli创建测试接口G
   */
  async apigCliCreate(request: ApigCliCreateRequest): Promise<ApigCliCreateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.apigCliCreateEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: cli创建测试接口G
   * Summary: cli创建测试接口G
   */
  async apigCliCreateEx(request: ApigCliCreateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApigCliCreateResponse> {
    Util.validateModel(request);
    return $tea.cast<ApigCliCreateResponse>(await this.doRequest("1.0", "antdigital.cliproduct.cli.create.apig", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApigCliCreateResponse({}));
  }

  /**
   * @remarks
   * Description: cli创建测试接口G
   * Summary: cli创建测试接口G
   */
  async apiCliCreate(request: ApiCliCreateRequest): Promise<ApiCliCreateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.apiCliCreateEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: cli创建测试接口G
   * Summary: cli创建测试接口G
   */
  async apiCliCreateEx(request: ApiCliCreateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApiCliCreateResponse> {
    Util.validateModel(request);
    return $tea.cast<ApiCliCreateResponse>(await this.doRequest("1.0", "antdigital.cliproduct.cli.create.api", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApiCliCreateResponse({}));
  }

  /**
   * @remarks
   * Description: cli创建测试接口h
   * Summary: cli创建测试接口h
   */
  async apihCliCreate(request: ApihCliCreateRequest): Promise<ApihCliCreateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.apihCliCreateEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: cli创建测试接口h
   * Summary: cli创建测试接口h
   */
  async apihCliCreateEx(request: ApihCliCreateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApihCliCreateResponse> {
    Util.validateModel(request);
    return $tea.cast<ApihCliCreateResponse>(await this.doRequest("1.0", "antdigital.cliproduct.cli.create.apih", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApihCliCreateResponse({}));
  }

}
