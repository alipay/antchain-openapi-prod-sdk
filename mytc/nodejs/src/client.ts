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

// 上传者信息
export class UploaderInfo extends $tea.Model {
  // 上传者证书hash
  certHash: string;
  // 上传者身份证明
  uploader: string;
  // 上传时间
  uploadTime: number;
  // 经度
  longitude?: string;
  // 纬度
  latitude?: string;
  static names(): { [key: string]: string } {
    return {
      certHash: 'cert_hash',
      uploader: 'uploader',
      uploadTime: 'upload_time',
      longitude: 'longitude',
      latitude: 'latitude',
    };
  }

  static types(): { [key: string]: any } {
    return {
      certHash: 'string',
      uploader: 'string',
      uploadTime: 'number',
      longitude: 'string',
      latitude: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 区块信息
export class BlockInfo extends $tea.Model {
  // 块高度
  blockHeight: number;
  // 成块时间戳
  timestamp: number;
  // 交易摘要
  txHash: string;
  static names(): { [key: string]: string } {
    return {
      blockHeight: 'block_height',
      timestamp: 'timestamp',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      blockHeight: 'number',
      timestamp: 'number',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 环节项
export class PhaseItem extends $tea.Model {
  // 标题
  title: string;
  // 类型
  // TEXT: 文本，
  // IMAGE： 图片,
  // VIDEO:  视频,
  // LONGTEXT: 长文本,
  // MAP: 地图,
  // BANNER: 广告位,
  // PDF: pdf文件,
  // CERTIFICATE: 认证信息
  // NESTED： 嵌套类型
  // CUSTOMIZE： 自定义类型
  type: string;
  // 值
  value: string;
  // 扩展信息
  extInfo: string;
  static names(): { [key: string]: string } {
    return {
      title: 'title',
      type: 'type',
      value: 'value',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      title: 'string',
      type: 'string',
      value: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户扫码信息
export class ScanUserInfo extends $tea.Model {
  // 用户昵称
  nick: string;
  // 用户ID
  userId: string;
  // 经度
  longitude: string;
  // 纬度
  latitude: string;
  // 用户来源
  srcType: string;
  // 扫码时间
  scanTime?: number;
  static names(): { [key: string]: string } {
    return {
      nick: 'nick',
      userId: 'user_id',
      longitude: 'longitude',
      latitude: 'latitude',
      srcType: 'src_type',
      scanTime: 'scan_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      nick: 'string',
      userId: 'string',
      longitude: 'string',
      latitude: 'string',
      srcType: 'string',
      scanTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 码注册信息
export class CodeRegisterInfo extends $tea.Model {
  // 溯源码，代表该账户的唯一资源标识
  code: string;
  // 状态,客户自定义状态，用于过滤查询使用
  status?: string;
  // 关联溯源码列表，可以通过接口查询关联溯源码绑定的信息
  relationCodes?: string[];
  // 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度128
  bizLabels?: string[];
  // 注册内容
  content?: string;
  // 区块链上交易哈希
  txHash?: string;
  // 注册溯源码记录唯一标识
  uniqueId?: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      status: 'status',
      relationCodes: 'relation_codes',
      bizLabels: 'biz_labels',
      content: 'content',
      txHash: 'tx_hash',
      uniqueId: 'unique_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      status: 'string',
      relationCodes: { 'type': 'array', 'itemType': 'string' },
      bizLabels: { 'type': 'array', 'itemType': 'string' },
      content: 'string',
      txHash: 'string',
      uniqueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品信息
export class ProudctInfo extends $tea.Model {
  // 商品名称
  name: string;
  // 商品图片链接列表
  proudctImages?: string[];
  // 商品描述
  productDesc?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      proudctImages: 'proudct_images',
      productDesc: 'product_desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      proudctImages: { 'type': 'array', 'itemType': 'string' },
      productDesc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 溯源码关联信息
export class CodeRelationInfo extends $tea.Model {
  // 溯源码，代表该账户的唯一资源标识
  code: string;
  // 状态,客户自定义状态，用于过滤查询使用，仅支持字母数字构成
  // 
  status?: string;
  // 关联内容
  content?: string;
  // 区块链上交易哈希
  txHash?: string;
  // 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度128
  bizLabels?: string[];
  // 溯源码信息关联记录唯一标识
  uniqueId?: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      status: 'status',
      content: 'content',
      txHash: 'tx_hash',
      bizLabels: 'biz_labels',
      uniqueId: 'unique_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      status: 'string',
      content: 'string',
      txHash: 'string',
      bizLabels: { 'type': 'array', 'itemType': 'string' },
      uniqueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 区块链交易信息
export class BlockChainTransactionInfo extends $tea.Model {
  // 区块链上交易哈希
  txHash: string;
  // 区块链标识
  bizId: string;
  // 消耗gas数量
  gasUsed: string;
  // 父区块哈希
  parentHash: string;
  // 收据根
  receiptRoot: string;
  // 状态树根
  stateRoot: string;
  // 交易根
  transactionRoot: string;
  // 版本
  version: string;
  // 区块高度
  number: number;
  // 成块时间
  timestamp: number;
  static names(): { [key: string]: string } {
    return {
      txHash: 'tx_hash',
      bizId: 'biz_id',
      gasUsed: 'gas_used',
      parentHash: 'parent_hash',
      receiptRoot: 'receipt_root',
      stateRoot: 'state_root',
      transactionRoot: 'transaction_root',
      version: 'version',
      number: 'number',
      timestamp: 'timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      txHash: 'string',
      bizId: 'string',
      gasUsed: 'string',
      parentHash: 'string',
      receiptRoot: 'string',
      stateRoot: 'string',
      transactionRoot: 'string',
      version: 'string',
      number: 'number',
      timestamp: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 首次扫描信息
export class ScanHeadInfo extends $tea.Model {
  // 扫描时间
  scanTime: number;
  // 扫码次数
  scanCount: number;
  // 扫码地址
  scanAddr: string;
  static names(): { [key: string]: string } {
    return {
      scanTime: 'scan_time',
      scanCount: 'scan_count',
      scanAddr: 'scan_addr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      scanTime: 'number',
      scanCount: 'number',
      scanAddr: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 环节信息
export class PhaseInfo extends $tea.Model {
  // 环节名称
  name: string;
  // 环节项
  items: PhaseItem[];
  // 上传者信息
  uploadInfo: UploaderInfo;
  // 区块信息
  blockInfo: BlockInfo;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      items: 'items',
      uploadInfo: 'upload_info',
      blockInfo: 'block_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      items: { 'type': 'array', 'itemType': PhaseItem },
      uploadInfo: UploaderInfo,
      blockInfo: BlockInfo,
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

export class RecognizeAntiQrcodeacRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 上传图片使用的设备类型,用于更精准的识别,非必填。
  deviceType?: string;
  // Base64格式的图片数据
  imageStr?: string;
  // 图片文件id，通过小程序拍照，上传的二维码图片信息。
  fileObject?: Readable;
  fileObjectName?: string;
  fileId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceType: 'device_type',
      imageStr: 'image_str',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceType: 'string',
      imageStr: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RecognizeAntiQrcodeacResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 解码结果,0:失败,1:成功，如果解码成功，可忽略detectState字段返回结果
  code?: string;
  // 识别状态
  detectState?: string;
  // 识别状态描述
  detectDesc?: string;
  // 加密数据
  encryptData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      detectState: 'detect_state',
      detectDesc: 'detect_desc',
      encryptData: 'encrypt_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      detectState: 'string',
      detectDesc: 'string',
      encryptData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckCodeFakeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备型号
  deviceType?: string;
  // 图片文件id，通过小程序拍照，上传的二维码图片信息。	
  fileObject?: Readable;
  fileObjectName?: string;
  fileId?: string;
  // Base64格式的图片数据	
  // 
  imageStr?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceType: 'device_type',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      imageStr: 'image_str',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceType: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      imageStr: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckCodeFakeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 验真是否成功
  detectSuccess?: boolean;
  // 返回编码
  detectCode?: string;
  // 调用返回信息
  detectMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      detectSuccess: 'detect_success',
      detectCode: 'detect_code',
      detectMessage: 'detect_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      detectSuccess: 'boolean',
      detectCode: 'string',
      detectMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitAntiImagesyncRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 防伪码类型标识,由蚂蚁侧分配
  codeType: string;
  // 防伪码批次号
  batchNo: string;
  // 批次下要上传的防伪码总数
  total: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      codeType: 'code_type',
      batchNo: 'batch_no',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      codeType: 'string',
      batchNo: 'string',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitAntiImagesyncResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 批次号
  batchNo?: string;
  // 批次下的访问码总数
  total?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      batchNo: 'batch_no',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      batchNo: 'string',
      total: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadAntiImagesyncRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 防伪码类型
  codeType: string;
  // 防伪码码值
  code: string;
  // 批次号码
  batchNo: string;
  // 文件id
  fileObject?: Readable;
  fileObjectName?: string;
  fileId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      codeType: 'code_type',
      code: 'code',
      batchNo: 'batch_no',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      codeType: 'string',
      code: 'string',
      batchNo: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadAntiImagesyncResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 防伪码码值
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

export class FinishAntiImagesyncRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 批次号
  batchNo: string;
  // 防伪码类型
  codeType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      batchNo: 'batch_no',
      codeType: 'code_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      batchNo: 'string',
      codeType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FinishAntiImagesyncResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 批次号
  batchNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      batchNo: 'batch_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      batchNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntiQrcodeimageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 要生成图片二维码的字符串信息
  qrCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      qrCode: 'qr_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      qrCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntiQrcodeimageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 生成的二维码图片的oss地址
  qrcodeUrl?: string;
  // 生成结果码，用于异常场景下细化错误信息
  generateCode?: string;
  // 生成结果码含义,用于异常场景下细化错误信息
  generateMessage?: string;
  // 生成失败时的解决方案,用于异常场景下细化错误信息
  unableGenerateSolution?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      qrcodeUrl: 'qrcode_url',
      generateCode: 'generate_code',
      generateMessage: 'generate_message',
      unableGenerateSolution: 'unable_generate_solution',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      qrcodeUrl: 'string',
      generateCode: 'string',
      generateMessage: 'string',
      unableGenerateSolution: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCodeRegistrationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务类型，客户自定义标签，做code数据隔离使用
  bizType: string;
  // 溯源码，代表该账户的唯一资源标识
  code: string;
  // 状态,客户自定义状态，用于过滤查询使用。只能由字符+数字构成
  status: string;
  // 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
  bizLabels?: string[];
  // 注册内容
  content?: string;
  // 关联溯源码列表。最多200条关联码，关联码格式要求和溯源码要求一致。
  // 可以通过接口查询关联溯源码绑定的信息。
  relationCodes?: string[];
  // 关联溯源码递归检查，检查最多5层。默认NO_CHECK。枚举值如下，
  // NO_CHECK:  不做递归检查;
  // TREE_CHECK: 树结构检查;
  // DAG_CHECK: 有向无环图检查;
  recursionType?: string;
  // 是否上链，默认true。
  // 为false时，仅做DB数据保存不上链。
  // 若content数据大小超过要求限制，仅会保存content的hash值上链
  upChainFlag?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizType: 'biz_type',
      code: 'code',
      status: 'status',
      bizLabels: 'biz_labels',
      content: 'content',
      relationCodes: 'relation_codes',
      recursionType: 'recursion_type',
      upChainFlag: 'up_chain_flag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizType: 'string',
      code: 'string',
      status: 'string',
      bizLabels: { 'type': 'array', 'itemType': 'string' },
      content: 'string',
      relationCodes: { 'type': 'array', 'itemType': 'string' },
      recursionType: 'string',
      upChainFlag: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCodeRegistrationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 区块链上交易哈希
  txHash?: string;
  // 注册记录唯一标识
  uniqueId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      uniqueId: 'unique_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      uniqueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteCodeRegistrationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务类型，客户自定义标签，做code数据隔离使用
  bizType: string;
  // 溯源码，代表该账户的唯一资源标识
  code: string;
  // 注册记录唯一标识
  uniqueId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizType: 'biz_type',
      code: 'code',
      uniqueId: 'unique_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizType: 'string',
      code: 'string',
      uniqueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteCodeRegistrationResponse extends $tea.Model {
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

export class CreateCodeRelationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务类型，客户自定义标签，做code数据隔离使用
  bizType: string;
  // 溯源码，代表该账户的唯一资源标识
  code: string;
  // 状态,客户自定义状态，用于过滤查询使用。只能由字符+数字构成
  status: string;
  // 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
  bizLabels?: string[];
  // 是否上链，默认true。 为false时，仅做DB数据保存不上链。 
  // 若content数据大小超过要求限制，仅会保存content的hash值上链
  upChainFlag?: boolean;
  // 关联内容
  // 
  content?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizType: 'biz_type',
      code: 'code',
      status: 'status',
      bizLabels: 'biz_labels',
      upChainFlag: 'up_chain_flag',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizType: 'string',
      code: 'string',
      status: 'string',
      bizLabels: { 'type': 'array', 'itemType': 'string' },
      upChainFlag: 'boolean',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCodeRelationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 区块链上交易哈希
  txHash?: string;
  // 绑定信息记录唯一标识
  uniqueId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      uniqueId: 'unique_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      uniqueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteCodeRelationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务类型
  bizType: string;
  // 溯源码，代表该账户的唯一资源标识
  code?: string;
  // 关联信息记录唯一标识
  // 
  uniqueId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizType: 'biz_type',
      code: 'code',
      uniqueId: 'unique_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizType: 'string',
      code: 'string',
      uniqueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteCodeRelationResponse extends $tea.Model {
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

export class QueryCodeCombineRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务类型，客户自定义标签，做code数据隔离使用
  bizType: string;
  // 溯源码，代表该账户的唯一资源标识
  code: string;
  // 页码,当且仅当pageNum=1时返回溯源码最新注册信息
  pageNum: number;
  // 页大小
  pageSize: number;
  // 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
  bizLabels?: string[];
  // 状态,客户自定义状态，用于过滤查询使用，只能由字符+数字构成，多个可以用"|"分隔
  status?: string;
  // 是否递归查询，默认false, 最多递归5层
  // 
  recursionFlag?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizType: 'biz_type',
      code: 'code',
      pageNum: 'page_num',
      pageSize: 'page_size',
      bizLabels: 'biz_labels',
      status: 'status',
      recursionFlag: 'recursion_flag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizType: 'string',
      code: 'string',
      pageNum: 'number',
      pageSize: 'number',
      bizLabels: { 'type': 'array', 'itemType': 'string' },
      status: 'string',
      recursionFlag: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCodeCombineResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总数据量
  total?: number;
  // 注册码信息
  registerInfo?: CodeRegisterInfo;
  // 关联信息
  relationInfos?: CodeRelationInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      total: 'total',
      registerInfo: 'register_info',
      relationInfos: 'relation_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      total: 'number',
      registerInfo: CodeRegisterInfo,
      relationInfos: { 'type': 'array', 'itemType': CodeRelationInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCodeRegistrationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务类型，客户自定义标签，做code数据隔离使用
  // 
  bizType: string;
  // 溯源码，代表该账户的唯一资源标识
  code: string;
  // 页码
  pageNum: number;
  // 页大小
  pageSize: number;
  // 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
  bizLabels?: string[];
  // 注册记录唯一标识
  uniqueId?: string;
  // 状态,客户自定义状态，用于过滤查询使用。
  // 状态信息只能由字母+数字构成，多个状态可以用"|"分隔
  status?: string;
  // 仅能取如下值范围：
  // 1. ASC     按注册时间升序
  // 2. DESC   按注册时间降序
  // 默认降序
  sortType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizType: 'biz_type',
      code: 'code',
      pageNum: 'page_num',
      pageSize: 'page_size',
      bizLabels: 'biz_labels',
      uniqueId: 'unique_id',
      status: 'status',
      sortType: 'sort_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizType: 'string',
      code: 'string',
      pageNum: 'number',
      pageSize: 'number',
      bizLabels: { 'type': 'array', 'itemType': 'string' },
      uniqueId: 'string',
      status: 'string',
      sortType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCodeRegistrationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总数据量
  total?: number;
  // 溯源码历史注册信息
  data?: CodeRegisterInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      total: 'total',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      total: 'number',
      data: { 'type': 'array', 'itemType': CodeRegisterInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCodeRelationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务类型，客户自定义标签，做code数据隔离使用
  bizType: string;
  // 溯源码，代表该账户的唯一资源标识
  code: string;
  // 页码
  pageNum: number;
  // 页大小
  pageSize: number;
  // 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
  bizLabels?: string[];
  // 绑定信息记录唯一标识
  uniqueId?: string;
  // 状态,客户自定义状态，用于过滤查询使用，只能由字符+数字构成，多个可以用"|"分隔
  status?: string;
  // 仅能取如下值范围： 1. ASC 按注册时间升序 2. DESC 按注册时间降序 默认降序
  sortType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizType: 'biz_type',
      code: 'code',
      pageNum: 'page_num',
      pageSize: 'page_size',
      bizLabels: 'biz_labels',
      uniqueId: 'unique_id',
      status: 'status',
      sortType: 'sort_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizType: 'string',
      code: 'string',
      pageNum: 'number',
      pageSize: 'number',
      bizLabels: { 'type': 'array', 'itemType': 'string' },
      uniqueId: 'string',
      status: 'string',
      sortType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCodeRelationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总历史记录条数
  total?: number;
  // 溯源码关联信息列表
  data?: CodeRelationInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      total: 'total',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      total: 'number',
      data: { 'type': 'array', 'itemType': CodeRelationInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddCodeDepositRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务类型，客户自定义标签
  bizType: string;
  // 存证内容
  // 
  content: string;
  // 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
  bizLabels?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizType: 'biz_type',
      content: 'content',
      bizLabels: 'biz_labels',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizType: 'string',
      content: 'string',
      bizLabels: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddCodeDepositResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 区块链上交易哈希
  txHash?: string;
  // 注册记录唯一标识
  uniqueId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      uniqueId: 'unique_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      uniqueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCodeCertRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务类型，客户自定义标签，做code数据隔离使用
  bizType: string;
  // 区块链上交易哈希
  txHash: string;
  // 是否展示交易具体内容，默认false
  contentFlag?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizType: 'biz_type',
      txHash: 'tx_hash',
      contentFlag: 'content_flag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizType: 'string',
      txHash: 'string',
      contentFlag: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCodeCertResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 存证内容。
  // 在注册溯源码、溯源码关联信息等接口调用情况下，上链内容会包装加密后上链。
  // 因此返回内容不可读，需要按照指定要求解密读取。
  content?: string;
  // 链交易信息
  chainTransactionInfo?: BlockChainTransactionInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      content: 'content',
      chainTransactionInfo: 'chain_transaction_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      content: 'string',
      chainTransactionInfo: BlockChainTransactionInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCodeStatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务类型，客户自定义标签
  // 
  bizType: string;
  // 开始时间
  startTime?: number;
  // 截止时间
  endTime?: number;
  // 支持以下查询维度：
  // REGISTRATION  注册码统计
  // RELATION  关联码信息统计
  // DEPOSIT    存证信息统计
  codeType?: string;
  // 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
  bizLabels?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizType: 'biz_type',
      startTime: 'start_time',
      endTime: 'end_time',
      codeType: 'code_type',
      bizLabels: 'biz_labels',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizType: 'string',
      startTime: 'number',
      endTime: 'number',
      codeType: 'string',
      bizLabels: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCodeStatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 上链交易量
  transactionSize?: number;
  // 上链总数据存储容量占用
  chainCapacity?: number;
  // 记录条数，包括上链和未上链的总数据条数
  recordSize?: number;
  // 对重复操作仅做一次记录的数据统计量。eg: 实际溯源码注册量，实际绑定信息的数据量。
  validSize?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      transactionSize: 'transaction_size',
      chainCapacity: 'chain_capacity',
      recordSize: 'record_size',
      validSize: 'valid_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      transactionSize: 'number',
      chainCapacity: 'number',
      recordSize: 'number',
      validSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddCodeRegistrationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务类型，客户自定义标签，做code数据隔离使用
  bizType: string;
  // 溯源码，代表该账户的唯一资源标识
  code: string;
  // 状态,客户自定义状态，用于过滤查询使用。只能由字符+数字构成
  // 
  status: string;
  // 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
  bizLabels?: string[];
  // 注册内容
  // 
  content?: string;
  // 关联溯源码列表。最多200条关联码，关联码格式要求和溯源码要求一致。 可以通过接口查询关联溯源码绑定的信息。
  relationCodes?: string[];
  // 关联溯源码递归检查，检查最多5层。默认NO_CHECK。枚举值如下，
  // NO_CHECK: 不做递归检查;
  // TREE_CHECK: 树结构检查; 
  // DAG_CHECK: 有向无环图检查;
  recursionType?: string;
  // 是否上链，默认true。 为false时，仅做DB数据保存不上链。 若content数据大小超过要求限制，仅会保存content的hash值上链
  upChainFlag?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizType: 'biz_type',
      code: 'code',
      status: 'status',
      bizLabels: 'biz_labels',
      content: 'content',
      relationCodes: 'relation_codes',
      recursionType: 'recursion_type',
      upChainFlag: 'up_chain_flag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizType: 'string',
      code: 'string',
      status: 'string',
      bizLabels: { 'type': 'array', 'itemType': 'string' },
      content: 'string',
      relationCodes: { 'type': 'array', 'itemType': 'string' },
      recursionType: 'string',
      upChainFlag: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddCodeRegistrationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 区块链上交易哈希
  txHash?: string;
  // 注册记录唯一标识
  uniqueId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      uniqueId: 'unique_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      uniqueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateCodeRegistrationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务类型，客户自定义标签，做code数据隔离使用
  bizType: string;
  // 溯源码，代表该账户的唯一资源标识。该字段不更新，仅做过滤使用。
  code?: string;
  // 注册记录唯一标识
  uniqueId: string;
  // 状态,客户自定义状态，用于过滤查询使用。只能由字符+数字构成
  status?: string;
  // 注册内容。若已上链，则不可更新该信息。
  // 
  content?: string;
  // 关联溯源码列表。最多200条关联码，关联码格式要求和溯源码要求一致。 可以通过接口查询关联溯源码绑定的信息。若已上链，则不可更新该信息。
  relationCodes?: string[];
  // 关联溯源码递归检查，检查最多5层。默认NO_CHECK。枚举值如下， 
  // NO_CHECK: 不做递归检查; 
  // TREE_CHECK: 树结构检查;
  // DAG_CHECK: 有向无环图检查;
  recursionType?: string;
  // 是否上链，默认true。 为false时，仅做DB数据保存不上链。 若content数据大小超过要求限制，仅会保存content的hash值上链
  upChainFlag?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizType: 'biz_type',
      code: 'code',
      uniqueId: 'unique_id',
      status: 'status',
      content: 'content',
      relationCodes: 'relation_codes',
      recursionType: 'recursion_type',
      upChainFlag: 'up_chain_flag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizType: 'string',
      code: 'string',
      uniqueId: 'string',
      status: 'string',
      content: 'string',
      relationCodes: { 'type': 'array', 'itemType': 'string' },
      recursionType: 'string',
      upChainFlag: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateCodeRegistrationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 区块链上交易哈希
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddCodeRelationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务类型，客户自定义标签，做code数据隔离使用
  // 
  bizType: string;
  // 溯源码，代表该账户的唯一资源标识
  // 
  code: string;
  // 状态,客户自定义状态，用于过滤查询使用。只能由字符+数字构成
  // 
  status: string;
  // 业务维度列表，最多5个。各个业务维度依次从高到低。每个业务维度最大长度64
  bizLabels?: string[];
  // 是否上链，默认true。 为false时，仅做DB数据保存不上链。 若content数据大小超过要求限制，仅会保存content的hash值上链
  upChainFlag?: boolean;
  // 关联内容
  // 
  content?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizType: 'biz_type',
      code: 'code',
      status: 'status',
      bizLabels: 'biz_labels',
      upChainFlag: 'up_chain_flag',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizType: 'string',
      code: 'string',
      status: 'string',
      bizLabels: { 'type': 'array', 'itemType': 'string' },
      upChainFlag: 'boolean',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddCodeRelationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 区块链上交易哈希
  txHash?: string;
  // 绑定信息记录唯一标识
  uniqueId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
      uniqueId: 'unique_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
      uniqueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateCodeRelationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务类型，客户自定义标签，做code数据隔离使用
  bizType: string;
  // 溯源码，代表该账户的唯一资源标识
  // 
  code: string;
  // 绑定信息记录唯一标识
  uniqueId: string;
  // 状态,客户自定义状态，用于过滤查询使用。只能由字符+数字构成
  status?: string;
  // 是否上链，默认true。 为false时，仅做DB数据保存不上链。 若content数据大小超过要求限制，仅会保存content的hash值上链
  upChainFlag?: boolean;
  // 关联信息内容。若已上链，则不可更新该信息。
  content?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizType: 'biz_type',
      code: 'code',
      uniqueId: 'unique_id',
      status: 'status',
      upChainFlag: 'up_chain_flag',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizType: 'string',
      code: 'string',
      uniqueId: 'string',
      status: 'string',
      upChainFlag: 'boolean',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateCodeRelationResponse extends $tea.Model {
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

export class QueryMiniCodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 溯源码
  code: string;
  // 用户信息
  userInfo?: ScanUserInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      code: 'code',
      userInfo: 'user_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      code: 'string',
      userInfo: ScanUserInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMiniCodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 首次扫描信息
  scanInfo?: ScanHeadInfo;
  // 商品信息
  productInfo?: ProudctInfo;
  // 溯源环节信息列表
  phaseInfos?: PhaseInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      scanInfo: 'scan_info',
      productInfo: 'product_info',
      phaseInfos: 'phase_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      scanInfo: ScanHeadInfo,
      productInfo: ProudctInfo,
      phaseInfos: { 'type': 'array', 'itemType': PhaseInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMiniCertRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 溯源码信息
  code: string;
  // 交易哈希
  txHash: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      code: 'code',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      code: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMiniCertResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 区块信息
  blockInfo?: BlockInfo;
  // 上传者信息
  uploadInfo?: UploaderInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      blockInfo: 'block_info',
      uploadInfo: 'upload_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      blockInfo: BlockInfo,
      uploadInfo: UploaderInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyMiniNfcRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 动态秘钥字符串信息
  code: string;
  // NFC UID
  uid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      code: 'code',
      uid: 'uid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      code: 'string',
      uid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyMiniNfcResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 校验结果
  status?: string;
  // 校验信息
  message?: string;
  // 校验解析溯源码
  code?: string;
  // NFC UID
  uid?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      message: 'message',
      code: 'code',
      uid: 'uid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      message: 'string',
      code: 'string',
      uid: 'string',
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
          sdk_version: "1.3.2",
          _prod_code: "MYTC",
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
   * Description: 主要用于二维码防伪识别，内部集成安创的二维码验真能力。
   * Summary: 二维码防伪识别
   */
  async recognizeAntiQrcodeac(request: RecognizeAntiQrcodeacRequest): Promise<RecognizeAntiQrcodeacResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.recognizeAntiQrcodeacEx(request, headers, runtime);
  }

  /**
   * Description: 主要用于二维码防伪识别，内部集成安创的二维码验真能力。
   * Summary: 二维码防伪识别
   */
  async recognizeAntiQrcodeacEx(request: RecognizeAntiQrcodeacRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RecognizeAntiQrcodeacResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.mytc.anti.qrcodeac.recognize",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let recognizeAntiQrcodeacResponse = new RecognizeAntiQrcodeacResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return recognizeAntiQrcodeacResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
    }

    Util.validateModel(request);
    return $tea.cast<RecognizeAntiQrcodeacResponse>(await this.doRequest("1.0", "antchain.mytc.anti.qrcodeac.recognize", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RecognizeAntiQrcodeacResponse({}));
  }

  /**
   * Description: 二维码防伪图片验证
   * Summary: 二维码防伪图片验证
   */
  async checkCodeFake(request: CheckCodeFakeRequest): Promise<CheckCodeFakeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkCodeFakeEx(request, headers, runtime);
  }

  /**
   * Description: 二维码防伪图片验证
   * Summary: 二维码防伪图片验证
   */
  async checkCodeFakeEx(request: CheckCodeFakeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckCodeFakeResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.mytc.code.fake.check",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let checkCodeFakeResponse = new CheckCodeFakeResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return checkCodeFakeResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
    }

    Util.validateModel(request);
    return $tea.cast<CheckCodeFakeResponse>(await this.doRequest("1.0", "antchain.mytc.code.fake.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckCodeFakeResponse({}));
  }

  /**
   * Description: 防伪码平台防伪底图上传，初始化上传记录
   * Summary: 防伪码平台防伪底图上传初始化
   */
  async initAntiImagesync(request: InitAntiImagesyncRequest): Promise<InitAntiImagesyncResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initAntiImagesyncEx(request, headers, runtime);
  }

  /**
   * Description: 防伪码平台防伪底图上传，初始化上传记录
   * Summary: 防伪码平台防伪底图上传初始化
   */
  async initAntiImagesyncEx(request: InitAntiImagesyncRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitAntiImagesyncResponse> {
    Util.validateModel(request);
    return $tea.cast<InitAntiImagesyncResponse>(await this.doRequest("1.0", "antchain.mytc.anti.imagesync.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitAntiImagesyncResponse({}));
  }

  /**
   * Description: 防伪码图片上传
   * Summary: 防伪码平台防伪码图片上传
   */
  async uploadAntiImagesync(request: UploadAntiImagesyncRequest): Promise<UploadAntiImagesyncResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadAntiImagesyncEx(request, headers, runtime);
  }

  /**
   * Description: 防伪码图片上传
   * Summary: 防伪码平台防伪码图片上传
   */
  async uploadAntiImagesyncEx(request: UploadAntiImagesyncRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadAntiImagesyncResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antchain.mytc.anti.imagesync.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadAntiImagesyncResponse = new UploadAntiImagesyncResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadAntiImagesyncResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
    }

    Util.validateModel(request);
    return $tea.cast<UploadAntiImagesyncResponse>(await this.doRequest("1.0", "antchain.mytc.anti.imagesync.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadAntiImagesyncResponse({}));
  }

  /**
   * Description: 防伪码平台防伪底图上传完成
   * Summary: 防伪码平台防伪底图上传完成
   */
  async finishAntiImagesync(request: FinishAntiImagesyncRequest): Promise<FinishAntiImagesyncResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.finishAntiImagesyncEx(request, headers, runtime);
  }

  /**
   * Description: 防伪码平台防伪底图上传完成
   * Summary: 防伪码平台防伪底图上传完成
   */
  async finishAntiImagesyncEx(request: FinishAntiImagesyncRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<FinishAntiImagesyncResponse> {
    Util.validateModel(request);
    return $tea.cast<FinishAntiImagesyncResponse>(await this.doRequest("1.0", "antchain.mytc.anti.imagesync.finish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new FinishAntiImagesyncResponse({}));
  }

  /**
   * Description: 自研二维码生成
   * Summary: 二维码防伪图片生成
   */
  async createAntiQrcodeimage(request: CreateAntiQrcodeimageRequest): Promise<CreateAntiQrcodeimageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAntiQrcodeimageEx(request, headers, runtime);
  }

  /**
   * Description: 自研二维码生成
   * Summary: 二维码防伪图片生成
   */
  async createAntiQrcodeimageEx(request: CreateAntiQrcodeimageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAntiQrcodeimageResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAntiQrcodeimageResponse>(await this.doRequest("1.0", "antchain.mytc.anti.qrcodeimage.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAntiQrcodeimageResponse({}));
  }

  /**
   * Description: 溯源码注册, 会根据bizType+code确定唯一一条记录信息。
  主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
   * Summary: 溯源码注册
   */
  async createCodeRegistration(request: CreateCodeRegistrationRequest): Promise<CreateCodeRegistrationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCodeRegistrationEx(request, headers, runtime);
  }

  /**
   * Description: 溯源码注册, 会根据bizType+code确定唯一一条记录信息。
  主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
   * Summary: 溯源码注册
   */
  async createCodeRegistrationEx(request: CreateCodeRegistrationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCodeRegistrationResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCodeRegistrationResponse>(await this.doRequest("1.0", "antchain.mytc.code.registration.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCodeRegistrationResponse({}));
  }

  /**
   * Description: 若溯源码注册的最新记录未上链，则可以被删除。若删除后，通过antchain.mytc.code.combine.query接口不能查询到相关码注册记录
   * Summary: 溯源码注册记录删除
   */
  async deleteCodeRegistration(request: DeleteCodeRegistrationRequest): Promise<DeleteCodeRegistrationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteCodeRegistrationEx(request, headers, runtime);
  }

  /**
   * Description: 若溯源码注册的最新记录未上链，则可以被删除。若删除后，通过antchain.mytc.code.combine.query接口不能查询到相关码注册记录
   * Summary: 溯源码注册记录删除
   */
  async deleteCodeRegistrationEx(request: DeleteCodeRegistrationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteCodeRegistrationResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteCodeRegistrationResponse>(await this.doRequest("1.0", "antchain.mytc.code.registration.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteCodeRegistrationResponse({}));
  }

  /**
   * Description: 将关联信息绑定到溯源码上。
  该接口调用存在以下业务维度限制：
  1. code + bizLables + bizType做唯一性判断。
  
  
   * Summary: 溯源码关联信息
   */
  async createCodeRelation(request: CreateCodeRelationRequest): Promise<CreateCodeRelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCodeRelationEx(request, headers, runtime);
  }

  /**
   * Description: 将关联信息绑定到溯源码上。
  该接口调用存在以下业务维度限制：
  1. code + bizLables + bizType做唯一性判断。
  
  
   * Summary: 溯源码关联信息
   */
  async createCodeRelationEx(request: CreateCodeRelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCodeRelationResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCodeRelationResponse>(await this.doRequest("1.0", "antchain.mytc.code.relation.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCodeRelationResponse({}));
  }

  /**
   * Description: 仅未上链的码关联信息可以被删除。仅删除code,bizType,bizSub1,bizSub2,bizSub3全部匹配的未上链的关联信息。
  若删除后，通过antchain.mytc.code.combine.query接口不能查询到该码关联记录。
   * Summary: 溯源码关联信息删除
   */
  async deleteCodeRelation(request: DeleteCodeRelationRequest): Promise<DeleteCodeRelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteCodeRelationEx(request, headers, runtime);
  }

  /**
   * Description: 仅未上链的码关联信息可以被删除。仅删除code,bizType,bizSub1,bizSub2,bizSub3全部匹配的未上链的关联信息。
  若删除后，通过antchain.mytc.code.combine.query接口不能查询到该码关联记录。
   * Summary: 溯源码关联信息删除
   */
  async deleteCodeRelationEx(request: DeleteCodeRelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteCodeRelationResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteCodeRelationResponse>(await this.doRequest("1.0", "antchain.mytc.code.relation.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteCodeRelationResponse({}));
  }

  /**
   * Description: 查询当前账户下的溯源码信息。
  会查询最新的溯源码注册信息，以及各个业务维度的最新关联信息列表。
  
   * Summary: 溯源码查询
   */
  async queryCodeCombine(request: QueryCodeCombineRequest): Promise<QueryCodeCombineResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCodeCombineEx(request, headers, runtime);
  }

  /**
   * Description: 查询当前账户下的溯源码信息。
  会查询最新的溯源码注册信息，以及各个业务维度的最新关联信息列表。
  
   * Summary: 溯源码查询
   */
  async queryCodeCombineEx(request: QueryCodeCombineRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCodeCombineResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCodeCombineResponse>(await this.doRequest("1.0", "antchain.mytc.code.combine.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCodeCombineResponse({}));
  }

  /**
   * Description: 溯源码注册历史查询
   * Summary: 溯源码注册历史查询
   */
  async queryCodeRegistration(request: QueryCodeRegistrationRequest): Promise<QueryCodeRegistrationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCodeRegistrationEx(request, headers, runtime);
  }

  /**
   * Description: 溯源码注册历史查询
   * Summary: 溯源码注册历史查询
   */
  async queryCodeRegistrationEx(request: QueryCodeRegistrationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCodeRegistrationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCodeRegistrationResponse>(await this.doRequest("1.0", "antchain.mytc.code.registration.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCodeRegistrationResponse({}));
  }

  /**
   * Description: 溯源码关联历史信息查询
   * Summary: 溯源码关联历史信息查询
   */
  async queryCodeRelation(request: QueryCodeRelationRequest): Promise<QueryCodeRelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCodeRelationEx(request, headers, runtime);
  }

  /**
   * Description: 溯源码关联历史信息查询
   * Summary: 溯源码关联历史信息查询
   */
  async queryCodeRelationEx(request: QueryCodeRelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCodeRelationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCodeRelationResponse>(await this.doRequest("1.0", "antchain.mytc.code.relation.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCodeRelationResponse({}));
  }

  /**
   * Description: 1. 原生存证，交易内容上链存证，返回链上唯一交易哈希。
  2. 存证内容超过链上限制仅会将存证内容hash值上链。
   * Summary: 原生存证
   */
  async addCodeDeposit(request: AddCodeDepositRequest): Promise<AddCodeDepositResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addCodeDepositEx(request, headers, runtime);
  }

  /**
   * Description: 1. 原生存证，交易内容上链存证，返回链上唯一交易哈希。
  2. 存证内容超过链上限制仅会将存证内容hash值上链。
   * Summary: 原生存证
   */
  async addCodeDepositEx(request: AddCodeDepositRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddCodeDepositResponse> {
    Util.validateModel(request);
    return $tea.cast<AddCodeDepositResponse>(await this.doRequest("1.0", "antchain.mytc.code.deposit.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddCodeDepositResponse({}));
  }

  /**
   * Description: 链上交易详情查询
   * Summary: 链上交易证书查询
   */
  async queryCodeCert(request: QueryCodeCertRequest): Promise<QueryCodeCertResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCodeCertEx(request, headers, runtime);
  }

  /**
   * Description: 链上交易详情查询
   * Summary: 链上交易证书查询
   */
  async queryCodeCertEx(request: QueryCodeCertRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCodeCertResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCodeCertResponse>(await this.doRequest("1.0", "antchain.mytc.code.cert.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCodeCertResponse({}));
  }

  /**
   * Description: 溯源统计信息查询，不填写starTime和endTime会查询全量注册信息。 
  若填写starTime和endTime，统计时间范围不能超过7天。
   * Summary: 溯源统计信息查询
   */
  async queryCodeStat(request: QueryCodeStatRequest): Promise<QueryCodeStatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCodeStatEx(request, headers, runtime);
  }

  /**
   * Description: 溯源统计信息查询，不填写starTime和endTime会查询全量注册信息。 
  若填写starTime和endTime，统计时间范围不能超过7天。
   * Summary: 溯源统计信息查询
   */
  async queryCodeStatEx(request: QueryCodeStatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCodeStatResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCodeStatResponse>(await this.doRequest("1.0", "antchain.mytc.code.stat.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCodeStatResponse({}));
  }

  /**
   * Description: 溯源码注册，可重复注册。 主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
   * Summary: 溯源码(可重复)注册
   */
  async addCodeRegistration(request: AddCodeRegistrationRequest): Promise<AddCodeRegistrationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addCodeRegistrationEx(request, headers, runtime);
  }

  /**
   * Description: 溯源码注册，可重复注册。 主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
   * Summary: 溯源码(可重复)注册
   */
  async addCodeRegistrationEx(request: AddCodeRegistrationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddCodeRegistrationResponse> {
    Util.validateModel(request);
    return $tea.cast<AddCodeRegistrationResponse>(await this.doRequest("1.0", "antchain.mytc.code.registration.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddCodeRegistrationResponse({}));
  }

  /**
   * Description: 更新已注册的溯源信息
   * Summary: 溯源注册信息更新
   */
  async updateCodeRegistration(request: UpdateCodeRegistrationRequest): Promise<UpdateCodeRegistrationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateCodeRegistrationEx(request, headers, runtime);
  }

  /**
   * Description: 更新已注册的溯源信息
   * Summary: 溯源注册信息更新
   */
  async updateCodeRegistrationEx(request: UpdateCodeRegistrationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateCodeRegistrationResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateCodeRegistrationResponse>(await this.doRequest("1.0", "antchain.mytc.code.registration.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateCodeRegistrationResponse({}));
  }

  /**
   * Description: 将关联信息绑定到溯源码上，可重复注册。 该接口调用存在以下业务维度限制： 1. code + bizLables + bizType做唯一性判断。
   * Summary: 溯源码(可重复)关联信息
   */
  async addCodeRelation(request: AddCodeRelationRequest): Promise<AddCodeRelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addCodeRelationEx(request, headers, runtime);
  }

  /**
   * Description: 将关联信息绑定到溯源码上，可重复注册。 该接口调用存在以下业务维度限制： 1. code + bizLables + bizType做唯一性判断。
   * Summary: 溯源码(可重复)关联信息
   */
  async addCodeRelationEx(request: AddCodeRelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddCodeRelationResponse> {
    Util.validateModel(request);
    return $tea.cast<AddCodeRelationResponse>(await this.doRequest("1.0", "antchain.mytc.code.relation.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddCodeRelationResponse({}));
  }

  /**
   * Description: 更新绑定到溯源码上的关联信息。
   * Summary: 溯源码关联信息更新
   */
  async updateCodeRelation(request: UpdateCodeRelationRequest): Promise<UpdateCodeRelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateCodeRelationEx(request, headers, runtime);
  }

  /**
   * Description: 更新绑定到溯源码上的关联信息。
   * Summary: 溯源码关联信息更新
   */
  async updateCodeRelationEx(request: UpdateCodeRelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateCodeRelationResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateCodeRelationResponse>(await this.doRequest("1.0", "antchain.mytc.code.relation.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateCodeRelationResponse({}));
  }

  /**
   * Description: 溯源码详情查询
   * Summary: 溯源码详情查询
   */
  async queryMiniCode(request: QueryMiniCodeRequest): Promise<QueryMiniCodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMiniCodeEx(request, headers, runtime);
  }

  /**
   * Description: 溯源码详情查询
   * Summary: 溯源码详情查询
   */
  async queryMiniCodeEx(request: QueryMiniCodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMiniCodeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMiniCodeResponse>(await this.doRequest("1.0", "antchain.mytc.mini.code.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMiniCodeResponse({}));
  }

  /**
   * Description: 溯源证书查询
   * Summary: 溯源证书查询
   */
  async queryMiniCert(request: QueryMiniCertRequest): Promise<QueryMiniCertResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMiniCertEx(request, headers, runtime);
  }

  /**
   * Description: 溯源证书查询
   * Summary: 溯源证书查询
   */
  async queryMiniCertEx(request: QueryMiniCertRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMiniCertResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMiniCertResponse>(await this.doRequest("1.0", "antchain.mytc.mini.cert.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMiniCertResponse({}));
  }

  /**
   * Description: 动态秘钥NFC二维码校验
   * Summary: 动态秘钥NFC二维码校验
   */
  async verifyMiniNfc(request: VerifyMiniNfcRequest): Promise<VerifyMiniNfcResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyMiniNfcEx(request, headers, runtime);
  }

  /**
   * Description: 动态秘钥NFC二维码校验
   * Summary: 动态秘钥NFC二维码校验
   */
  async verifyMiniNfcEx(request: VerifyMiniNfcRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyMiniNfcResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyMiniNfcResponse>(await this.doRequest("1.0", "antchain.mytc.mini.nfc.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyMiniNfcResponse({}));
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
