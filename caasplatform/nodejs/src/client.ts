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

// 分账明细
export class RuleItem extends $tea.Model {
  // 分账方Id
  id: string;
  // 分账份额，总份额100，保留2位小数
  proportion: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      proportion: 'proportion',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      proportion: 'string',
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

export class CreateDepositRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务幂等id
  orderId: string;
  // 服务实例id
  serviceId: string;
  // 基础信息json
  baseInfoJson?: string;
  // 额外信息json
  extensionInfoJson?: string;
  // 文件id
  fileObject?: Readable;
  fileObjectName?: string;
  fileId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      serviceId: 'service_id',
      baseInfoJson: 'base_info_json',
      extensionInfoJson: 'extension_info_json',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      serviceId: 'string',
      baseInfoJson: 'string',
      extensionInfoJson: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDepositResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 合约调用交易哈希
  txHash?: string;
  // 合约调用交易块高
  blockNumber?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      blockNumber: 'block_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      blockNumber: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDepositRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务幂等id
  orderId: string;
  // 服务实例id
  serviceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      serviceId: 'service_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      serviceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDepositResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务幂等id
  orderId?: string;
  // 服务实例id
  serviceId?: string;
  // 基础信息json
  baseInfoJson?: string;
  // 额外信息json
  extensionInfoJson?: string;
  // 交易hash
  txHash?: string;
  // 块高
  blockNumber?: number;
  // 交易时间戳
  timestamp?: number;
  // 文件地址
  fileUrl?: string;
  // 文件id
  fileId?: string;
  // 文件哈希
  fileHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      serviceId: 'service_id',
      baseInfoJson: 'base_info_json',
      extensionInfoJson: 'extension_info_json',
      txHash: 'tx_hash',
      blockNumber: 'block_number',
      timestamp: 'timestamp',
      fileUrl: 'file_url',
      fileId: 'file_id',
      fileHash: 'file_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      serviceId: 'string',
      baseInfoJson: 'string',
      extensionInfoJson: 'string',
      txHash: 'string',
      blockNumber: 'number',
      timestamp: 'number',
      fileUrl: 'string',
      fileId: 'string',
      fileHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDepositCertificateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务幂等id
  orderId: string;
  // 合约服务实例id
  serviceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      serviceId: 'service_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      serviceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDepositCertificateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务幂等id
  orderId?: string;
  // 服务实例id
  serviceId?: string;
  // 基础信息json
  baseInfoJson?: string;
  // 额外信息json
  extensionInfoJson?: string;
  // 交易hash
  txHash?: string;
  // 块高
  blockNumber?: number;
  // 交易时间戳
  timestamp?: number;
  // 文件地址
  fileUrl?: string;
  // 文件id
  fileId?: string;
  // 文件哈希
  fileHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      serviceId: 'service_id',
      baseInfoJson: 'base_info_json',
      extensionInfoJson: 'extension_info_json',
      txHash: 'tx_hash',
      blockNumber: 'block_number',
      timestamp: 'timestamp',
      fileUrl: 'file_url',
      fileId: 'file_id',
      fileHash: 'file_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      serviceId: 'string',
      baseInfoJson: 'string',
      extensionInfoJson: 'string',
      txHash: 'string',
      blockNumber: 'number',
      timestamp: 'number',
      fileUrl: 'string',
      fileId: 'string',
      fileHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDepositCertificateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务幂等id
  orderId: string;
  // 合约服务实例id
  serviceId: string;
  // 基础信息json
  baseInfoJson?: string;
  // 额外信息json
  extensionInfoJson?: string;
  // 文件id
  fileObject?: Readable;
  fileObjectName?: string;
  fileId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      serviceId: 'service_id',
      baseInfoJson: 'base_info_json',
      extensionInfoJson: 'extension_info_json',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      serviceId: 'string',
      baseInfoJson: 'string',
      extensionInfoJson: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDepositCertificateResponse extends $tea.Model {
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

export class QueryDepositCharityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务幂等id
  orderId: string;
  // 合约服务实例id
  serviceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      serviceId: 'service_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      serviceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDepositCharityResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务幂等id
  orderId?: string;
  // 服务实例id
  serviceId?: string;
  // 基础信息json
  baseInfoJson?: string;
  // 额外信息json
  extensionInfoJson?: string;
  // 交易hash
  txHash?: string;
  // 块高
  blockNumber?: number;
  // 交易时间戳
  timestamp?: number;
  // 文件地址
  fileUrl?: string;
  // 文件id
  fileId?: string;
  // 文件哈希
  fileHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      serviceId: 'service_id',
      baseInfoJson: 'base_info_json',
      extensionInfoJson: 'extension_info_json',
      txHash: 'tx_hash',
      blockNumber: 'block_number',
      timestamp: 'timestamp',
      fileUrl: 'file_url',
      fileId: 'file_id',
      fileHash: 'file_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      serviceId: 'string',
      baseInfoJson: 'string',
      extensionInfoJson: 'string',
      txHash: 'string',
      blockNumber: 'number',
      timestamp: 'number',
      fileUrl: 'string',
      fileId: 'string',
      fileHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDepositCharityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务幂等id
  orderId: string;
  // 合约服务实例id
  serviceId: string;
  // 基础信息json
  baseInfoJson?: string;
  // 额外信息json
  extensionInfoJson?: string;
  // 文件id
  fileObject?: Readable;
  fileObjectName?: string;
  fileId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      serviceId: 'service_id',
      baseInfoJson: 'base_info_json',
      extensionInfoJson: 'extension_info_json',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      serviceId: 'string',
      baseInfoJson: 'string',
      extensionInfoJson: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDepositCharityResponse extends $tea.Model {
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

export class QueryDepositSweepstakesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务幂等id
  orderId: string;
  // 合约服务实例id
  serviceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      serviceId: 'service_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      serviceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDepositSweepstakesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务幂等id
  orderId?: string;
  // 服务实例id
  serviceId?: string;
  // 基础信息json
  baseInfoJson?: string;
  // 额外信息json
  extensionInfoJson?: string;
  // 交易hash
  txHash?: string;
  // 块高
  blockNumber?: number;
  // 交易时间戳
  timestamp?: number;
  // 文件地址
  fileUrl?: string;
  // 文件id
  fileId?: string;
  // 文件哈希
  fileHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      serviceId: 'service_id',
      baseInfoJson: 'base_info_json',
      extensionInfoJson: 'extension_info_json',
      txHash: 'tx_hash',
      blockNumber: 'block_number',
      timestamp: 'timestamp',
      fileUrl: 'file_url',
      fileId: 'file_id',
      fileHash: 'file_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      serviceId: 'string',
      baseInfoJson: 'string',
      extensionInfoJson: 'string',
      txHash: 'string',
      blockNumber: 'number',
      timestamp: 'number',
      fileUrl: 'string',
      fileId: 'string',
      fileHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDepositSweepstakesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务幂等id
  orderId: string;
  // 合约服务实例id
  serviceId: string;
  // 基础信息json
  baseInfoJson?: string;
  // 额外信息json
  extensionInfoJson?: string;
  // 文件id
  fileObject?: Readable;
  fileObjectName?: string;
  fileId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderId: 'order_id',
      serviceId: 'service_id',
      baseInfoJson: 'base_info_json',
      extensionInfoJson: 'extension_info_json',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderId: 'string',
      serviceId: 'string',
      baseInfoJson: 'string',
      extensionInfoJson: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDepositSweepstakesResponse extends $tea.Model {
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

export class SetGeneralDepositRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务ID
  id: string;
  // 要存储的数据，推荐json格式
  data: string;
  // 合约服务实例id
  serviceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      data: 'data',
      serviceId: 'service_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
      data: 'string',
      serviceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetGeneralDepositResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 合约调用交易哈希
  txHash?: string;
  // 合约调用交易块高
  blockNumber?: number;
  // 合约返回结果
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      blockNumber: 'block_number',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      blockNumber: 'number',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGeneralDepositRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务ID
  id: string;
  // 合约服务实例id
  serviceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      serviceId: 'service_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
      serviceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGeneralDepositResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 调用合约交易哈希
  txHash?: string;
  // 合约调用交易块高
  blockNumber?: number;
  // 合约返回结果
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      blockNumber: 'block_number',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      blockNumber: 'number',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PayGeneralRightsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合约服务实例Id
  serviceId: string;
  // 持有账号的地址
  from: string;
  // 接收账号的地址
  to: string;
  // 数据资产ID
  id: number;
  // 要转增的数据资产数量
  amount: number;
  // 扩展数据
  data?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceId: 'service_id',
      from: 'from',
      to: 'to',
      id: 'id',
      amount: 'amount',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceId: 'string',
      from: 'string',
      to: 'string',
      id: 'number',
      amount: 'number',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PayGeneralRightsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 合约调用交易哈希
  txHash?: string;
  // 合约调用交易块高
  blockNumber?: number;
  // 合约返回结果
  result?: string;
  // 错误码
  code?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      blockNumber: 'block_number',
      result: 'result',
      code: 'code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      blockNumber: 'number',
      result: 'string',
      code: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadExtendRightsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 名称
  name: string;
  // 描述
  description?: string;
  // 文件id
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  // 扩展字段
  data?: string;
  // 作者或发型方
  author: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      description: 'description',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      data: 'data',
      author: 'author',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      description: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      data: 'string',
      author: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadExtendRightsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据资产id
  rightsId?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rightsId: 'rights_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rightsId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateExtendRightsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合约实例id
  serviceId: string;
  // 账号名称
  accountName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceId: 'service_id',
      accountName: 'account_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceId: 'string',
      accountName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateExtendRightsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上账户地址
  address?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      address: 'address',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      address: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterGeneralRightsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合约实例id
  serviceId: string;
  // 创建链上账户时指定的accountName
  account: string;
  // 通过调用托管资源接口返回的资源id
  id: number;
  // 要铸造的数据资产数量
  amount: number;
  // 扩展参数
  data?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceId: 'service_id',
      account: 'account',
      id: 'id',
      amount: 'amount',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceId: 'string',
      account: 'string',
      id: 'number',
      amount: 'number',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterGeneralRightsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 合约调用交易哈希
  txHash?: string;
  // 合约调用交易块高
  blockNumber?: number;
  // 合约返回结果
  result?: string;
  // 错误码
  code?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      blockNumber: 'block_number',
      result: 'result',
      code: 'code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      blockNumber: 'number',
      result: 'string',
      code: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGeneralRightsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合约示例id
  serviceId: string;
  // 数据资产id
  tokenId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceId: 'service_id',
      tokenId: 'token_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceId: 'string',
      tokenId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGeneralRightsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 合约调用交易哈希
  txHash?: string;
  // 合约调用交易块高
  blockNumber?: number;
  // 合约返回结果
  result?: string;
  // 错误码
  code?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      blockNumber: 'block_number',
      result: 'result',
      code: 'code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      blockNumber: 'number',
      result: 'string',
      code: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterGeneralDivideRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合约实例id
  serviceId: string;
  // 自定义Id,重复则更新
  id: string;
  // 企业营业证编号，或唯一ID
  code: string;
  // 企业名称
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceId: 'service_id',
      id: 'id',
      code: 'code',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceId: 'string',
      id: 'string',
      code: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterGeneralDivideResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证交易Hash
  txHash?: string;
  // 区块高度
  blockNumber?: number;
  // 错误码
  code?: number;
  // 合约接口返回结果
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      blockNumber: 'block_number',
      code: 'code',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      blockNumber: 'number',
      code: 'number',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGeneralDivideRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合约实例id
  serviceId: string;
  // 分账方Id
  id: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceId: 'service_id',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceId: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGeneralDivideResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证交易Hash
  txHash?: string;
  // 区块高度
  blockNumber?: number;
  // 错误码
  code?: number;
  // 合约接口返回结果
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      blockNumber: 'block_number',
      code: 'code',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      blockNumber: 'number',
      code: 'number',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetGeneralDivideRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合约实例id
  serviceId: string;
  // 自定义分账规则唯一ID
  ruleId: string;
  // 分账方，分账方不能重复配置
  ruleItemList: RuleItem[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceId: 'service_id',
      ruleId: 'rule_id',
      ruleItemList: 'rule_item_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceId: 'string',
      ruleId: 'string',
      ruleItemList: { 'type': 'array', 'itemType': RuleItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetGeneralDivideResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证交易Hash
  txHash?: string;
  // 区块高度
  blockNumber?: number;
  // 错误码
  code?: number;
  // 合约接口返回结果
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      blockNumber: 'block_number',
      code: 'code',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      blockNumber: 'number',
      code: 'number',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGeneralDivideRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合约实例id
  serviceId: string;
  // 分账规则ID
  ruleId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceId: 'service_id',
      ruleId: 'rule_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceId: 'string',
      ruleId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGeneralDivideResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证交易Hash
  txHash?: string;
  // 区块高度
  blockNumber?: number;
  // 错误码
  code?: number;
  // 合约接口返回结果
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      blockNumber: 'block_number',
      code: 'code',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      blockNumber: 'number',
      code: 'number',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteGeneralDivideRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合约实例id
  serviceId: string;
  // 分账方Id
  id: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceId: 'service_id',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceId: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteGeneralDivideResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证交易Hash
  txHash?: string;
  // 区块高度
  blockNumber?: number;
  // 错误码
  code?: number;
  // 合约接口返回结果
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      blockNumber: 'block_number',
      code: 'code',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      blockNumber: 'number',
      code: 'number',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PayGeneralDivideRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合约实例id
  serviceId: string;
  // 订单编号 ( 编号不能重复)
  orderId: string;
  // 发起人
  from: string;
  // 付款人
  payer: string;
  // 支付方式
  payType: string;
  // 支付时间
  payTime: string;
  // 支付状态
  status: string;
  // 收款人
  to: string;
  // 订单金额（保留3位小数）
  amount: string;
  // 分账规则id （根据规则进行分账）
  ruleId: string;
  // 扩展json
  data?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceId: 'service_id',
      orderId: 'order_id',
      from: 'from',
      payer: 'payer',
      payType: 'pay_type',
      payTime: 'pay_time',
      status: 'status',
      to: 'to',
      amount: 'amount',
      ruleId: 'rule_id',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceId: 'string',
      orderId: 'string',
      from: 'string',
      payer: 'string',
      payType: 'string',
      payTime: 'string',
      status: 'string',
      to: 'string',
      amount: 'string',
      ruleId: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PayGeneralDivideResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证交易Hash
  txHash?: string;
  // 区块高度
  blockNumber?: number;
  // 错误码
  code?: number;
  // 合约接口返回结果
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      blockNumber: 'block_number',
      code: 'code',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      blockNumber: 'number',
      code: 'number',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PullGeneralDivideRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合约实例id
  serviceId: string;
  // 分账方Id
  id: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceId: 'service_id',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceId: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PullGeneralDivideResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证交易Hash
  txHash?: string;
  // 区块高度
  blockNumber?: number;
  // 错误码
  code?: number;
  // 合约接口返回结果
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      blockNumber: 'block_number',
      code: 'code',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      blockNumber: 'number',
      code: 'number',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryGeneralDivideRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合约实例id
  serviceId: string;
  // 订单编号
  orderId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceId: 'service_id',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceId: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryGeneralDivideResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证交易Hash
  txHash?: string;
  // 区块高度
  blockNumber?: number;
  // 错误码
  code?: number;
  // 合约接口返回结果
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      blockNumber: 'block_number',
      code: 'code',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      blockNumber: 'number',
      code: 'number',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGeneralTourismRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合约实例id
  serviceId: string;
  // 数据资产id
  tokenId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceId: 'service_id',
      tokenId: 'token_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceId: 'string',
      tokenId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGeneralTourismResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证交易Hash
  txHash?: string;
  // 区块高度
  blockNumber?: number;
  // 错误码
  code?: number;
  // 合约接口返回结果
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      blockNumber: 'block_number',
      code: 'code',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      blockNumber: 'number',
      code: 'number',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterGeneralTourismRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合约实例id
  serviceId: string;
  // 创建链上账户时指定的accountName
  account: string;
  // 通过调用托管资源接口返回的资源id
  id: number;
  // 要铸造的数据资产数量
  amount: number;
  // 扩展参数
  data?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceId: 'service_id',
      account: 'account',
      id: 'id',
      amount: 'amount',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceId: 'string',
      account: 'string',
      id: 'number',
      amount: 'number',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterGeneralTourismResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证交易Hash
  txHash?: string;
  // 区块高度
  blockNumber?: number;
  // 错误码
  code?: number;
  // 合约接口返回结果
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      blockNumber: 'block_number',
      code: 'code',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      blockNumber: 'number',
      code: 'number',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PayGeneralTourismRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合约实例id
  serviceId: string;
  // 持有账号的地址
  from: string;
  // 接收账号的地址
  to: string;
  // 数据资产ID
  id: number;
  // 要转增的数据资产数量
  amount: number;
  // 扩展数据
  data?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceId: 'service_id',
      from: 'from',
      to: 'to',
      id: 'id',
      amount: 'amount',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceId: 'string',
      from: 'string',
      to: 'string',
      id: 'number',
      amount: 'number',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PayGeneralTourismResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证交易Hash
  txHash?: string;
  // 区块高度
  blockNumber?: number;
  // 错误码
  code?: number;
  // 合约接口返回结果
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      blockNumber: 'block_number',
      code: 'code',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      blockNumber: 'number',
      code: 'number',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGeneralTicketsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合约实例id
  serviceId: string;
  // 数据资产id
  tokenId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceId: 'service_id',
      tokenId: 'token_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceId: 'string',
      tokenId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGeneralTicketsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证交易Hash
  txHash?: string;
  // 区块高度
  blockNumber?: number;
  // 错误码
  code?: number;
  // 合约接口返回结果
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      blockNumber: 'block_number',
      code: 'code',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      blockNumber: 'number',
      code: 'number',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterGeneralTicketsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合约实例id
  serviceId: string;
  // 创建链上账户时指定的accountName
  account: string;
  // 通过调用托管资源接口返回的资源id
  id: number;
  // 要铸造的数据资产数量
  amount: number;
  // 扩展参数
  data?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceId: 'service_id',
      account: 'account',
      id: 'id',
      amount: 'amount',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceId: 'string',
      account: 'string',
      id: 'number',
      amount: 'number',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterGeneralTicketsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证交易Hash
  txHash?: string;
  // 区块高度
  blockNumber?: number;
  // 错误码
  code?: number;
  // 合约接口返回结果
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      blockNumber: 'block_number',
      code: 'code',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      blockNumber: 'number',
      code: 'number',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PayGeneralTicketsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合约实例id
  serviceId: string;
  // 持有账号的地址
  from: string;
  // 接收账号的地址
  to: string;
  // 数据资产ID
  id: number;
  // 要转增的数据资产数量
  amount: number;
  // 扩展数据
  data?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceId: 'service_id',
      from: 'from',
      to: 'to',
      id: 'id',
      amount: 'amount',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceId: 'string',
      from: 'string',
      to: 'string',
      id: 'number',
      amount: 'number',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PayGeneralTicketsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证交易Hash
  txHash?: string;
  // 区块高度
  blockNumber?: number;
  // 错误码
  code?: number;
  // 合约接口返回结果
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      blockNumber: 'block_number',
      code: 'code',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      blockNumber: 'number',
      code: 'number',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateGeneralDivideRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合约实例id
  serviceId: string;
  // 分账规则ID
  ruleId: string;
  // 分账方用户ID
  userId: string;
  // 确认状态，0: 待确认；1:确认；2：拒绝
  strStatus: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceId: 'service_id',
      ruleId: 'rule_id',
      userId: 'user_id',
      strStatus: 'str_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceId: 'string',
      ruleId: 'string',
      userId: 'string',
      strStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateGeneralDivideResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易HASH
  txHash?: string;
  // 区块高度
  blockNumber?: number;
  // 错误码
  code?: number;
  // 合约接口返回结果
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      blockNumber: 'block_number',
      code: 'code',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      blockNumber: 'number',
      code: 'number',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListGeneralDivideRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合约实例id
  serviceId: string;
  // 分账方ID
  userId: string;
  // 分账列表起始序号
  strStartIndex: string;
  // 分账明细查询截止序号
  strEndIndex: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceId: 'service_id',
      userId: 'user_id',
      strStartIndex: 'str_start_index',
      strEndIndex: 'str_end_index',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceId: 'string',
      userId: 'string',
      strStartIndex: 'string',
      strEndIndex: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListGeneralDivideResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易Hash
  txHash?: string;
  // 区块高度
  blockNumber?: number;
  // 错误码
  code?: number;
  // 返回结果，json格式，data为分账明细数据
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      blockNumber: 'block_number',
      code: 'code',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      blockNumber: 'number',
      code: 'number',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGeneralRightsbalanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合约服务实例id
  serviceId: string;
  // 账号的地址
  account: string;
  // 数据资产ID
  id: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceId: 'service_id',
      account: 'account',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceId: 'string',
      account: 'string',
      id: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetGeneralRightsbalanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易hash
  txHash?: string;
  // 区块高度
  blockNumber?: number;
  // 执行结果，0:成功
  code?: number;
  // 合约接口返回结果
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      blockNumber: 'block_number',
      code: 'code',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      blockNumber: 'number',
      code: 'number',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeExtendTxqrcodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合约服务ID
  serviceId: string;
  // 业务幂等id(和tx_hash二者必须选其一)
  orderId?: string;
  // 交易hash(和order_id二者必须选其一)
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceId: 'service_id',
      orderId: 'order_id',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceId: 'string',
      orderId: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeExtendTxqrcodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // Base64编码的二维码 png 图片
  base64QrCodePng?: string;
  // 二维码内容
  qrCodeContent?: string;
  // ac73c8fa158436513e0b398632d9a082e04cee3eac6f9fb50087a46d801bdfd1
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      base64QrCodePng: 'base64_qr_code_png',
      qrCodeContent: 'qr_code_content',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      base64QrCodePng: 'string',
      qrCodeContent: 'string',
      txHash: 'string',
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
          sdk_version: "1.5.1",
          _prod_code: "CAASPLATFORM",
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
   * Description: 创建存证
   * Summary: 创建存证
   */
  async createDeposit(request: CreateDepositRequest): Promise<CreateDepositResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDepositEx(request, headers, runtime);
  }

  /**
   * Description: 创建存证
   * Summary: 创建存证
   */
  async createDepositEx(request: CreateDepositRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDepositResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.caasplatform.deposit.create",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let createDepositResponse = new CreateDepositResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return createDepositResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<CreateDepositResponse>(await this.doRequest("1.0", "antchain.caasplatform.deposit.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDepositResponse({}));
  }

  /**
   * Description: 存证查询
   * Summary: 存证查询
   */
  async queryDeposit(request: QueryDepositRequest): Promise<QueryDepositResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDepositEx(request, headers, runtime);
  }

  /**
   * Description: 存证查询
   * Summary: 存证查询
   */
  async queryDepositEx(request: QueryDepositRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDepositResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDepositResponse>(await this.doRequest("1.0", "antchain.caasplatform.deposit.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDepositResponse({}));
  }

  /**
   * Description: 证书存证合约-证书存证查询
   * Summary: 证书存证合约-证书存证查询
   */
  async queryDepositCertificate(request: QueryDepositCertificateRequest): Promise<QueryDepositCertificateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDepositCertificateEx(request, headers, runtime);
  }

  /**
   * Description: 证书存证合约-证书存证查询
   * Summary: 证书存证合约-证书存证查询
   */
  async queryDepositCertificateEx(request: QueryDepositCertificateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDepositCertificateResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDepositCertificateResponse>(await this.doRequest("1.0", "antchain.caasplatform.deposit.certificate.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDepositCertificateResponse({}));
  }

  /**
   * Description: 证书存证合约-创建证书存证
   * Summary: 证书存证合约-创建证书存证
   */
  async createDepositCertificate(request: CreateDepositCertificateRequest): Promise<CreateDepositCertificateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDepositCertificateEx(request, headers, runtime);
  }

  /**
   * Description: 证书存证合约-创建证书存证
   * Summary: 证书存证合约-创建证书存证
   */
  async createDepositCertificateEx(request: CreateDepositCertificateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDepositCertificateResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.caasplatform.deposit.certificate.create",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let createDepositCertificateResponse = new CreateDepositCertificateResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return createDepositCertificateResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<CreateDepositCertificateResponse>(await this.doRequest("1.0", "antchain.caasplatform.deposit.certificate.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDepositCertificateResponse({}));
  }

  /**
   * Description: 捐赠合约-捐赠证明查询
   * Summary: 捐赠合约-捐赠证明查询
   */
  async queryDepositCharity(request: QueryDepositCharityRequest): Promise<QueryDepositCharityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDepositCharityEx(request, headers, runtime);
  }

  /**
   * Description: 捐赠合约-捐赠证明查询
   * Summary: 捐赠合约-捐赠证明查询
   */
  async queryDepositCharityEx(request: QueryDepositCharityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDepositCharityResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDepositCharityResponse>(await this.doRequest("1.0", "antchain.caasplatform.deposit.charity.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDepositCharityResponse({}));
  }

  /**
   * Description: 捐赠合约-创建捐赠证明
   * Summary: 捐赠合约-创建捐赠证明
   */
  async createDepositCharity(request: CreateDepositCharityRequest): Promise<CreateDepositCharityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDepositCharityEx(request, headers, runtime);
  }

  /**
   * Description: 捐赠合约-创建捐赠证明
   * Summary: 捐赠合约-创建捐赠证明
   */
  async createDepositCharityEx(request: CreateDepositCharityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDepositCharityResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.caasplatform.deposit.charity.create",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let createDepositCharityResponse = new CreateDepositCharityResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return createDepositCharityResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<CreateDepositCharityResponse>(await this.doRequest("1.0", "antchain.caasplatform.deposit.charity.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDepositCharityResponse({}));
  }

  /**
   * Description: 抽奖活动审计合约-中奖记录查询
   * Summary: 抽奖活动审计合约-中奖记录查询
   */
  async queryDepositSweepstakes(request: QueryDepositSweepstakesRequest): Promise<QueryDepositSweepstakesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDepositSweepstakesEx(request, headers, runtime);
  }

  /**
   * Description: 抽奖活动审计合约-中奖记录查询
   * Summary: 抽奖活动审计合约-中奖记录查询
   */
  async queryDepositSweepstakesEx(request: QueryDepositSweepstakesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDepositSweepstakesResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDepositSweepstakesResponse>(await this.doRequest("1.0", "antchain.caasplatform.deposit.sweepstakes.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDepositSweepstakesResponse({}));
  }

  /**
   * Description: 抽奖活动审计合约-创建活动记录
   * Summary: 抽奖活动审计合约-创建活动记录
   */
  async createDepositSweepstakes(request: CreateDepositSweepstakesRequest): Promise<CreateDepositSweepstakesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDepositSweepstakesEx(request, headers, runtime);
  }

  /**
   * Description: 抽奖活动审计合约-创建活动记录
   * Summary: 抽奖活动审计合约-创建活动记录
   */
  async createDepositSweepstakesEx(request: CreateDepositSweepstakesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDepositSweepstakesResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.caasplatform.deposit.sweepstakes.create",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let createDepositSweepstakesResponse = new CreateDepositSweepstakesResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return createDepositSweepstakesResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<CreateDepositSweepstakesResponse>(await this.doRequest("1.0", "antchain.caasplatform.deposit.sweepstakes.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDepositSweepstakesResponse({}));
  }

  /**
   * Description: 通用合约调用-结构化存储场景
   * Summary: 通用合约调用-结构化存储场景
   */
  async setGeneralDeposit(request: SetGeneralDepositRequest): Promise<SetGeneralDepositResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setGeneralDepositEx(request, headers, runtime);
  }

  /**
   * Description: 通用合约调用-结构化存储场景
   * Summary: 通用合约调用-结构化存储场景
   */
  async setGeneralDepositEx(request: SetGeneralDepositRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetGeneralDepositResponse> {
    Util.validateModel(request);
    return $tea.cast<SetGeneralDepositResponse>(await this.doRequest("1.0", "antchain.caasplatform.general.deposit.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetGeneralDepositResponse({}));
  }

  /**
   * Description: 通用合约调用-结构化查询场景
   * Summary: 通用合约调用-结构化查询场景
   */
  async getGeneralDeposit(request: GetGeneralDepositRequest): Promise<GetGeneralDepositResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getGeneralDepositEx(request, headers, runtime);
  }

  /**
   * Description: 通用合约调用-结构化查询场景
   * Summary: 通用合约调用-结构化查询场景
   */
  async getGeneralDepositEx(request: GetGeneralDepositRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetGeneralDepositResponse> {
    Util.validateModel(request);
    return $tea.cast<GetGeneralDepositResponse>(await this.doRequest("1.0", "antchain.caasplatform.general.deposit.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetGeneralDepositResponse({}));
  }

  /**
   * Description: 通用合约调用-权益-转赠
   * Summary: 通用合约调用-权益-转赠
   */
  async payGeneralRights(request: PayGeneralRightsRequest): Promise<PayGeneralRightsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.payGeneralRightsEx(request, headers, runtime);
  }

  /**
   * Description: 通用合约调用-权益-转赠
   * Summary: 通用合约调用-权益-转赠
   */
  async payGeneralRightsEx(request: PayGeneralRightsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PayGeneralRightsResponse> {
    Util.validateModel(request);
    return $tea.cast<PayGeneralRightsResponse>(await this.doRequest("1.0", "antchain.caasplatform.general.rights.pay", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PayGeneralRightsResponse({}));
  }

  /**
   * Description: 资源文件托管
   * Summary: 资源文件托管
   */
  async uploadExtendRights(request: UploadExtendRightsRequest): Promise<UploadExtendRightsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadExtendRightsEx(request, headers, runtime);
  }

  /**
   * Description: 资源文件托管
   * Summary: 资源文件托管
   */
  async uploadExtendRightsEx(request: UploadExtendRightsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadExtendRightsResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.caasplatform.extend.rights.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadExtendRightsResponse = new UploadExtendRightsResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadExtendRightsResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<UploadExtendRightsResponse>(await this.doRequest("1.0", "antchain.caasplatform.extend.rights.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadExtendRightsResponse({}));
  }

  /**
   * Description: 创建链上账户
   * Summary: 创建链上账户
   */
  async createExtendRights(request: CreateExtendRightsRequest): Promise<CreateExtendRightsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createExtendRightsEx(request, headers, runtime);
  }

  /**
   * Description: 创建链上账户
   * Summary: 创建链上账户
   */
  async createExtendRightsEx(request: CreateExtendRightsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateExtendRightsResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateExtendRightsResponse>(await this.doRequest("1.0", "antchain.caasplatform.extend.rights.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateExtendRightsResponse({}));
  }

  /**
   * Description: 通用合约调用-权益-铸造
   * Summary: 通用合约调用-权益-铸造
   */
  async registerGeneralRights(request: RegisterGeneralRightsRequest): Promise<RegisterGeneralRightsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerGeneralRightsEx(request, headers, runtime);
  }

  /**
   * Description: 通用合约调用-权益-铸造
   * Summary: 通用合约调用-权益-铸造
   */
  async registerGeneralRightsEx(request: RegisterGeneralRightsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterGeneralRightsResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterGeneralRightsResponse>(await this.doRequest("1.0", "antchain.caasplatform.general.rights.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterGeneralRightsResponse({}));
  }

  /**
   * Description: 通用合约调用-权益-URL查询
   * Summary: 通用合约调用-权益- URL查询
   */
  async getGeneralRights(request: GetGeneralRightsRequest): Promise<GetGeneralRightsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getGeneralRightsEx(request, headers, runtime);
  }

  /**
   * Description: 通用合约调用-权益-URL查询
   * Summary: 通用合约调用-权益- URL查询
   */
  async getGeneralRightsEx(request: GetGeneralRightsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetGeneralRightsResponse> {
    Util.validateModel(request);
    return $tea.cast<GetGeneralRightsResponse>(await this.doRequest("1.0", "antchain.caasplatform.general.rights.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetGeneralRightsResponse({}));
  }

  /**
   * Description: 1.分账方最大数量限制50
  2.id存在则更新分账方
  3.存在分账记录的分账方不能被更新
   * Summary: 分账合约-配置分账方
   */
  async registerGeneralDivide(request: RegisterGeneralDivideRequest): Promise<RegisterGeneralDivideResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerGeneralDivideEx(request, headers, runtime);
  }

  /**
   * Description: 1.分账方最大数量限制50
  2.id存在则更新分账方
  3.存在分账记录的分账方不能被更新
   * Summary: 分账合约-配置分账方
   */
  async registerGeneralDivideEx(request: RegisterGeneralDivideRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterGeneralDivideResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterGeneralDivideResponse>(await this.doRequest("1.0", "antchain.caasplatform.general.divide.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterGeneralDivideResponse({}));
  }

  /**
   * Description: 分账合约-查询分账方
   * Summary: 分账合约-查询分账方
   */
  async queryGeneralDivide(request: QueryGeneralDivideRequest): Promise<QueryGeneralDivideResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGeneralDivideEx(request, headers, runtime);
  }

  /**
   * Description: 分账合约-查询分账方
   * Summary: 分账合约-查询分账方
   */
  async queryGeneralDivideEx(request: QueryGeneralDivideRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGeneralDivideResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGeneralDivideResponse>(await this.doRequest("1.0", "antchain.caasplatform.general.divide.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGeneralDivideResponse({}));
  }

  /**
   * Description: 1.分账规则id不能重复配置
  2.至少配置一个分账方
  3.分账方id需要已存在
  4.分账份额保留2位小数,多余部分舍弃
  5.分账份额需小于100 且大于0
  6.总份额不能大于100
   * Summary: 分账合约-配置分账规则
   */
  async setGeneralDivide(request: SetGeneralDivideRequest): Promise<SetGeneralDivideResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setGeneralDivideEx(request, headers, runtime);
  }

  /**
   * Description: 1.分账规则id不能重复配置
  2.至少配置一个分账方
  3.分账方id需要已存在
  4.分账份额保留2位小数,多余部分舍弃
  5.分账份额需小于100 且大于0
  6.总份额不能大于100
   * Summary: 分账合约-配置分账规则
   */
  async setGeneralDivideEx(request: SetGeneralDivideRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetGeneralDivideResponse> {
    Util.validateModel(request);
    return $tea.cast<SetGeneralDivideResponse>(await this.doRequest("1.0", "antchain.caasplatform.general.divide.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetGeneralDivideResponse({}));
  }

  /**
   * Description: 分账合约-查询分账规则
   * Summary: 分账合约-查询分账规则
   */
  async getGeneralDivide(request: GetGeneralDivideRequest): Promise<GetGeneralDivideResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getGeneralDivideEx(request, headers, runtime);
  }

  /**
   * Description: 分账合约-查询分账规则
   * Summary: 分账合约-查询分账规则
   */
  async getGeneralDivideEx(request: GetGeneralDivideRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetGeneralDivideResponse> {
    Util.validateModel(request);
    return $tea.cast<GetGeneralDivideResponse>(await this.doRequest("1.0", "antchain.caasplatform.general.divide.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetGeneralDivideResponse({}));
  }

  /**
   * Description: 1.分账方id需存在
  2.已分账的分账方不能删除
  3.已配置分账规则的分账方不能删除
   * Summary: 分账合约-删除分账方
   */
  async deleteGeneralDivide(request: DeleteGeneralDivideRequest): Promise<DeleteGeneralDivideResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteGeneralDivideEx(request, headers, runtime);
  }

  /**
   * Description: 1.分账方id需存在
  2.已分账的分账方不能删除
  3.已配置分账规则的分账方不能删除
   * Summary: 分账合约-删除分账方
   */
  async deleteGeneralDivideEx(request: DeleteGeneralDivideRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteGeneralDivideResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteGeneralDivideResponse>(await this.doRequest("1.0", "antchain.caasplatform.general.divide.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteGeneralDivideResponse({}));
  }

  /**
   * Description: 1.订单id不能重复
  2.金额不能小于0，金额保留3位小数多余部分舍弃
  3.分账方id需要已存在
  4.分账规则id需已存在
   * Summary: 分账合约-发起分账
   */
  async payGeneralDivide(request: PayGeneralDivideRequest): Promise<PayGeneralDivideResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.payGeneralDivideEx(request, headers, runtime);
  }

  /**
   * Description: 1.订单id不能重复
  2.金额不能小于0，金额保留3位小数多余部分舍弃
  3.分账方id需要已存在
  4.分账规则id需已存在
   * Summary: 分账合约-发起分账
   */
  async payGeneralDivideEx(request: PayGeneralDivideRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PayGeneralDivideResponse> {
    Util.validateModel(request);
    return $tea.cast<PayGeneralDivideResponse>(await this.doRequest("1.0", "antchain.caasplatform.general.divide.pay", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PayGeneralDivideResponse({}));
  }

  /**
   * Description: 分账合约-获取分账方余额
   * Summary: 分账合约-获取分账方余额
   */
  async pullGeneralDivide(request: PullGeneralDivideRequest): Promise<PullGeneralDivideResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pullGeneralDivideEx(request, headers, runtime);
  }

  /**
   * Description: 分账合约-获取分账方余额
   * Summary: 分账合约-获取分账方余额
   */
  async pullGeneralDivideEx(request: PullGeneralDivideRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PullGeneralDivideResponse> {
    Util.validateModel(request);
    return $tea.cast<PullGeneralDivideResponse>(await this.doRequest("1.0", "antchain.caasplatform.general.divide.pull", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PullGeneralDivideResponse({}));
  }

  /**
   * Description: 分账合约-获取订单分账信息
   * Summary: 分账合约-获取订单分账信息
   */
  async batchqueryGeneralDivide(request: BatchqueryGeneralDivideRequest): Promise<BatchqueryGeneralDivideResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryGeneralDivideEx(request, headers, runtime);
  }

  /**
   * Description: 分账合约-获取订单分账信息
   * Summary: 分账合约-获取订单分账信息
   */
  async batchqueryGeneralDivideEx(request: BatchqueryGeneralDivideRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryGeneralDivideResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryGeneralDivideResponse>(await this.doRequest("1.0", "antchain.caasplatform.general.divide.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryGeneralDivideResponse({}));
  }

  /**
   * Description: 旅游文创合约-文创URL查询
   * Summary: 旅游文创合约-文创URL查询
   */
  async getGeneralTourism(request: GetGeneralTourismRequest): Promise<GetGeneralTourismResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getGeneralTourismEx(request, headers, runtime);
  }

  /**
   * Description: 旅游文创合约-文创URL查询
   * Summary: 旅游文创合约-文创URL查询
   */
  async getGeneralTourismEx(request: GetGeneralTourismRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetGeneralTourismResponse> {
    Util.validateModel(request);
    return $tea.cast<GetGeneralTourismResponse>(await this.doRequest("1.0", "antchain.caasplatform.general.tourism.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetGeneralTourismResponse({}));
  }

  /**
   * Description: 旅游文创合约-铸造文创
   * Summary: 旅游文创合约-铸造文创
   */
  async registerGeneralTourism(request: RegisterGeneralTourismRequest): Promise<RegisterGeneralTourismResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerGeneralTourismEx(request, headers, runtime);
  }

  /**
   * Description: 旅游文创合约-铸造文创
   * Summary: 旅游文创合约-铸造文创
   */
  async registerGeneralTourismEx(request: RegisterGeneralTourismRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterGeneralTourismResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterGeneralTourismResponse>(await this.doRequest("1.0", "antchain.caasplatform.general.tourism.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterGeneralTourismResponse({}));
  }

  /**
   * Description: 旅游文创合约-文创转增
   * Summary: 旅游文创合约-文创转增
   */
  async payGeneralTourism(request: PayGeneralTourismRequest): Promise<PayGeneralTourismResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.payGeneralTourismEx(request, headers, runtime);
  }

  /**
   * Description: 旅游文创合约-文创转增
   * Summary: 旅游文创合约-文创转增
   */
  async payGeneralTourismEx(request: PayGeneralTourismRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PayGeneralTourismResponse> {
    Util.validateModel(request);
    return $tea.cast<PayGeneralTourismResponse>(await this.doRequest("1.0", "antchain.caasplatform.general.tourism.pay", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PayGeneralTourismResponse({}));
  }

  /**
   * Description: 线下门票合约-门票URL查询
   * Summary: 线下门票合约-门票URL查询
   */
  async getGeneralTickets(request: GetGeneralTicketsRequest): Promise<GetGeneralTicketsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getGeneralTicketsEx(request, headers, runtime);
  }

  /**
   * Description: 线下门票合约-门票URL查询
   * Summary: 线下门票合约-门票URL查询
   */
  async getGeneralTicketsEx(request: GetGeneralTicketsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetGeneralTicketsResponse> {
    Util.validateModel(request);
    return $tea.cast<GetGeneralTicketsResponse>(await this.doRequest("1.0", "antchain.caasplatform.general.tickets.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetGeneralTicketsResponse({}));
  }

  /**
   * Description: 线下门票合约-铸造线下买票
   * Summary: 线下门票合约-铸造线下买票
   */
  async registerGeneralTickets(request: RegisterGeneralTicketsRequest): Promise<RegisterGeneralTicketsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerGeneralTicketsEx(request, headers, runtime);
  }

  /**
   * Description: 线下门票合约-铸造线下买票
   * Summary: 线下门票合约-铸造线下买票
   */
  async registerGeneralTicketsEx(request: RegisterGeneralTicketsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterGeneralTicketsResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterGeneralTicketsResponse>(await this.doRequest("1.0", "antchain.caasplatform.general.tickets.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterGeneralTicketsResponse({}));
  }

  /**
   * Description: 线下门票合约-门票转增
   * Summary: 线下门票合约-门票转增
   */
  async payGeneralTickets(request: PayGeneralTicketsRequest): Promise<PayGeneralTicketsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.payGeneralTicketsEx(request, headers, runtime);
  }

  /**
   * Description: 线下门票合约-门票转增
   * Summary: 线下门票合约-门票转增
   */
  async payGeneralTicketsEx(request: PayGeneralTicketsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PayGeneralTicketsResponse> {
    Util.validateModel(request);
    return $tea.cast<PayGeneralTicketsResponse>(await this.doRequest("1.0", "antchain.caasplatform.general.tickets.pay", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PayGeneralTicketsResponse({}));
  }

  /**
   * Description: 进行分账规则的确认
   * Summary: 分账规则确认接口
   */
  async updateGeneralDivide(request: UpdateGeneralDivideRequest): Promise<UpdateGeneralDivideResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateGeneralDivideEx(request, headers, runtime);
  }

  /**
   * Description: 进行分账规则的确认
   * Summary: 分账规则确认接口
   */
  async updateGeneralDivideEx(request: UpdateGeneralDivideRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateGeneralDivideResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateGeneralDivideResponse>(await this.doRequest("1.0", "antchain.caasplatform.general.divide.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateGeneralDivideResponse({}));
  }

  /**
   * Description: 查询指定分账方的分账明细数据
   * Summary: 分账明细查询
   */
  async listGeneralDivide(request: ListGeneralDivideRequest): Promise<ListGeneralDivideResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listGeneralDivideEx(request, headers, runtime);
  }

  /**
   * Description: 查询指定分账方的分账明细数据
   * Summary: 分账明细查询
   */
  async listGeneralDivideEx(request: ListGeneralDivideRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListGeneralDivideResponse> {
    Util.validateModel(request);
    return $tea.cast<ListGeneralDivideResponse>(await this.doRequest("1.0", "antchain.caasplatform.general.divide.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListGeneralDivideResponse({}));
  }

  /**
   * Description: 查询某个账户下拥有的资产数量
   * Summary: 权证资产合约资产查询
   */
  async getGeneralRightsbalance(request: GetGeneralRightsbalanceRequest): Promise<GetGeneralRightsbalanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getGeneralRightsbalanceEx(request, headers, runtime);
  }

  /**
   * Description: 查询某个账户下拥有的资产数量
   * Summary: 权证资产合约资产查询
   */
  async getGeneralRightsbalanceEx(request: GetGeneralRightsbalanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetGeneralRightsbalanceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetGeneralRightsbalanceResponse>(await this.doRequest("1.0", "antchain.caasplatform.general.rightsbalance.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetGeneralRightsbalanceResponse({}));
  }

  /**
   * Description: 获取蚂蚁区块链交易二维码
   * Summary: 获取蚂蚁区块链交易二维码
   */
  async describeExtendTxqrcode(request: DescribeExtendTxqrcodeRequest): Promise<DescribeExtendTxqrcodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.describeExtendTxqrcodeEx(request, headers, runtime);
  }

  /**
   * Description: 获取蚂蚁区块链交易二维码
   * Summary: 获取蚂蚁区块链交易二维码
   */
  async describeExtendTxqrcodeEx(request: DescribeExtendTxqrcodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DescribeExtendTxqrcodeResponse> {
    Util.validateModel(request);
    return $tea.cast<DescribeExtendTxqrcodeResponse>(await this.doRequest("1.0", "antchain.caasplatform.extend.txqrcode.describe", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DescribeExtendTxqrcodeResponse({}));
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
