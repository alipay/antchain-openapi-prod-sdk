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

// 音频元数据
export class AudioMeta extends $tea.Model {
  // 采样率
  sampleFreq?: number;
  // 音频道数
  channelsNum?: number;
  // 音频数据采样点所占位数
  bits?: number;
  // 语音信道分离标识
  channel?: number;
  static names(): { [key: string]: string } {
    return {
      sampleFreq: 'sample_freq',
      channelsNum: 'channels_num',
      bits: 'bits',
      channel: 'channel',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sampleFreq: 'number',
      channelsNum: 'number',
      bits: 'number',
      channel: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 音频文件
export class Audio extends $tea.Model {
  // 音频文件名称（单次请求保持唯一）
  token?: string;
  // 待认证的音频文件，base64编码格式
  rawData?: string;
  // 音频文件OSS地址
  audioUrl?: string;
  static names(): { [key: string]: string } {
    return {
      token: 'token',
      rawData: 'raw_data',
      audioUrl: 'audio_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      token: 'string',
      rawData: 'string',
      audioUrl: 'string',
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

export class QueryFacevrfServerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实人认证唯一标识
  certifyId: string;
  // 预留扩展业务参数
  externParam?: string;
  // 认证材料（如人脸图像）的哈希
  materialHash?: string;
  // 外部唯一标识。用于定位。
  // 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo: string;
  // 场景ID
  sceneId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certifyId: 'certify_id',
      externParam: 'extern_param',
      materialHash: 'material_hash',
      outerOrderNo: 'outer_order_no',
      sceneId: 'scene_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certifyId: 'string',
      externParam: 'string',
      materialHash: 'string',
      outerOrderNo: 'string',
      sceneId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFacevrfServerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 认证的主体信息，一般的认证场景返回为空
  identityInfo?: string;
  // 认证主体附件信息，一般的认证场景都是返回空
  materialInfo?: string;
  // 认证材料哈希是否匹配
  materialMatched?: string;
  // 是否通过，通过为T，不通过为F
  passed?: string;
  // 业务失败原因
  reason?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      identityInfo: 'identity_info',
      materialInfo: 'material_info',
      materialMatched: 'material_matched',
      passed: 'passed',
      reason: 'reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      identityInfo: 'string',
      materialInfo: 'string',
      materialMatched: 'string',
      passed: 'string',
      reason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFacevrfServerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 认证模式码
  bizCode: string;
  // h5认证完成后，服务端回调此地址通知商户认证结果
  callbackUrl?: string;
  // 真实姓名
  certName: string;
  // 证件号码
  certNo: string;
  // cert_name、cert_no两个字段的传入模式。0：明文1：密文
  encType?: string;
  // 证件类型，如身份证
  certType: string;
  // 预留扩展参数
  externParam?: string;
  // 自定义比对源人脸图像，base64编码格式
  facialPictureRef?: string;
  // 身份信息来源类型，如证件
  identityType: string;
  // metainfo 环境参数，需要通过客户端 SDK 获取
  metaInfo?: string;
  // 外部唯一标识。用于定位。
  // 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo: string;
  // 回跳地址
  returnUrl?: string;
  // 场景ID
  sceneId: string;
  // 商户自定义的用户ID
  userId?: string;
  // 用户的IP
  userIp?: string;
  // 用户的手机号
  userMobile?: string;
  // callbackUrl回调时是否需要重试，默认false(不需要重试)
  callbackNeedRetry?: boolean;
  // 活体检测的类型
  model?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizCode: 'biz_code',
      callbackUrl: 'callback_url',
      certName: 'cert_name',
      certNo: 'cert_no',
      encType: 'enc_type',
      certType: 'cert_type',
      externParam: 'extern_param',
      facialPictureRef: 'facial_picture_ref',
      identityType: 'identity_type',
      metaInfo: 'meta_info',
      outerOrderNo: 'outer_order_no',
      returnUrl: 'return_url',
      sceneId: 'scene_id',
      userId: 'user_id',
      userIp: 'user_ip',
      userMobile: 'user_mobile',
      callbackNeedRetry: 'callback_need_retry',
      model: 'model',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizCode: 'string',
      callbackUrl: 'string',
      certName: 'string',
      certNo: 'string',
      encType: 'string',
      certType: 'string',
      externParam: 'string',
      facialPictureRef: 'string',
      identityType: 'string',
      metaInfo: 'string',
      outerOrderNo: 'string',
      returnUrl: 'string',
      sceneId: 'string',
      userId: 'string',
      userIp: 'string',
      userMobile: 'string',
      callbackNeedRetry: 'boolean',
      model: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateFacevrfServerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实人认证唯一标识
  certifyId?: string;
  // 认证地址。只在特定场景返回。
  certifyUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyId: 'certify_id',
      certifyUrl: 'certify_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyId: 'string',
      certifyUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecFacevrfServerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 真实姓名
  certName: string;
  // 证件号码
  certNo: string;
  // cert_name、cert_no两个字段的传入模式0：明文1：密文
  encType?: string;
  // 证件类型，如身份证
  certType: string;
  // 预留扩展参数
  externParam?: string;
  // 自定义比对源人脸图像，base64编码格式
  facialPictureRef?: string;
  // 身份信息来源类型，如证件
  identityType: string;
  // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo: string;
  // 场景ID
  sceneId: string;
  // 商户自定义的用户ID
  userId?: string;
  // 用户的IP
  userIp?: string;
  // 用户的手机号（或其哈希值）
  userMobile?: string;
  // 待认证的人脸图像，base64编码格式
  facialPictureAuth: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certName: 'cert_name',
      certNo: 'cert_no',
      encType: 'enc_type',
      certType: 'cert_type',
      externParam: 'extern_param',
      facialPictureRef: 'facial_picture_ref',
      identityType: 'identity_type',
      outerOrderNo: 'outer_order_no',
      sceneId: 'scene_id',
      userId: 'user_id',
      userIp: 'user_ip',
      userMobile: 'user_mobile',
      facialPictureAuth: 'facial_picture_auth',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certName: 'string',
      certNo: 'string',
      encType: 'string',
      certType: 'string',
      externParam: 'string',
      facialPictureRef: 'string',
      identityType: 'string',
      outerOrderNo: 'string',
      sceneId: 'string',
      userId: 'string',
      userIp: 'string',
      userMobile: 'string',
      facialPictureAuth: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecFacevrfServerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 认证ID
  certifyId?: string;
  // 是否通过，通过为T，不通过为F
  passed?: string;
  // 业务失败原因
  reason?: string;
  // 认证主体附件信息，包含共计类型等
  materialInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyId: 'certify_id',
      passed: 'passed',
      reason: 'reason',
      materialInfo: 'material_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyId: 'string',
      passed: 'string',
      reason: 'string',
      materialInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFacevrfEvidenceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 某次刷脸的certifyId
  certifyId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certifyId: 'certify_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certifyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetFacevrfEvidenceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 刷脸的certifyId，原样返回
  certifyId?: string;
  // 统一证据ID，非SUCCESS状态为null，可在控制台中持统一证据ID验证pdf文件的正确性，法院方也可用此统一证据ID在司法链控制台进行核验pdf文件的正确性。
  onchainId?: string;
  // 上链状态，`SUCCESS`表示成功、`INIT`表示正在上链
  onchainStatus?: string;
  // pdf存证是否已经过期，不支持超过6个月的存证获取
  pdfExpired?: boolean;
  // 存证pdf文件内容的base64
  pdfContent?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyId: 'certify_id',
      onchainId: 'onchain_id',
      onchainStatus: 'onchain_status',
      pdfExpired: 'pdf_expired',
      pdfContent: 'pdf_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyId: 'string',
      onchainId: 'string',
      onchainStatus: 'string',
      pdfExpired: 'boolean',
      pdfContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckIndividualidTwometaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo: string;
  // 姓名
  certName: string;
  // 身份证号码
  certNo: string;
  // map结果的json数据格式，预留字段
  externParam?: string;
  // 认证子类型
  scene?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      certName: 'cert_name',
      certNo: 'cert_no',
      externParam: 'extern_param',
      scene: 'scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      certName: 'string',
      certNo: 'string',
      externParam: 'string',
      scene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckIndividualidTwometaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // true:匹配成功  false：匹配失败
  match?: string;
  // 扩展信息，预留字段
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      match: 'match',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      match: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckIndividualidThreemetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo: string;
  // 姓名
  certName: string;
  // 身份证号码
  certNo: string;
  // 手机号码
  mobile: string;
  // map结果的json数据格式，预留字段
  // 
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      certName: 'cert_name',
      certNo: 'cert_no',
      mobile: 'mobile',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      certName: 'string',
      certNo: 'string',
      mobile: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckIndividualidThreemetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // true:匹配成功 false：匹配失败
  match?: string;
  // 扩展信息，预留字段
  // 
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      match: 'match',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      match: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckIndividualidFourmetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo: string;
  // 姓名
  // 
  certName: string;
  // 身份证号码
  certNo: string;
  // 手机号码
  mobile: string;
  // 银行卡号
  bankCard: string;
  // map结果的json数据格式，预留字段
  // 
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      certName: 'cert_name',
      certNo: 'cert_no',
      mobile: 'mobile',
      bankCard: 'bank_card',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      certName: 'string',
      certNo: 'string',
      mobile: 'string',
      bankCard: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckIndividualidFourmetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // true:匹配成功 false：匹配失败
  // 
  match?: string;
  // 扩展信息，预留字段
  // 
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      match: 'match',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      match: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckRouteThreemetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo: string;
  // 姓名
  certName: string;
  // 身份证号
  certNo: string;
  // 手机号
  mobile: string;
  // 使用场景
  scene: string;
  // map结果的json数据格式，预留字段
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      certName: 'cert_name',
      certNo: 'cert_no',
      mobile: 'mobile',
      scene: 'scene',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      certName: 'string',
      certNo: 'string',
      mobile: 'string',
      scene: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckRouteThreemetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // true:匹配成功 false：匹配失败
  match?: string;
  // 扩展信息，预留字段
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      match: 'match',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      match: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateVoiceprintServermodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo: string;
  // 商户自定义的用户ID
  userId: string;
  // 音频文件流
  fileObject?: Readable;
  fileObjectName?: string;
  fileId?: string;
  // 音频元数据
  audioMeta: AudioMeta;
  // 音频文件集合
  audios: Audio[];
  // 预留扩展参数
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      userId: 'user_id',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      audioMeta: 'audio_meta',
      audios: 'audios',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      userId: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      audioMeta: AudioMeta,
      audios: { 'type': 'array', 'itemType': Audio },
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateVoiceprintServermodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 扩展信息，预留字段
  externInfo?: string;
  // 产品结果明细，不影响决策
  resultCodeSub?: string;
  // result_code_sub对应的文案
  resultMsgSub?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      externInfo: 'extern_info',
      resultCodeSub: 'result_code_sub',
      resultMsgSub: 'result_msg_sub',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      externInfo: 'string',
      resultCodeSub: 'string',
      resultMsgSub: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyVoiceprintServermodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo: string;
  // 商户自定义的用户ID
  userId: string;
  // 音频文件，base64编码格式
  // 
  audioAuth?: string;
  // 音频文件OSS地址
  audioUrl?: string;
  // 音频元数据
  audioMeta: AudioMeta;
  // 预留扩展参数
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      userId: 'user_id',
      audioAuth: 'audio_auth',
      audioUrl: 'audio_url',
      audioMeta: 'audio_meta',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      userId: 'string',
      audioAuth: 'string',
      audioUrl: 'string',
      audioMeta: AudioMeta,
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyVoiceprintServermodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 声纹认证唯一ID
  certifyId?: string;
  // 扩展信息，预留字段
  externInfo?: string;
  // 产品结果明细，不影响决策
  resultCodeSub?: string;
  // result_code_sub对应的文案
  resultMsgSub?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      certifyId: 'certify_id',
      externInfo: 'extern_info',
      resultCodeSub: 'result_code_sub',
      resultMsgSub: 'result_msg_sub',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      certifyId: 'string',
      externInfo: 'string',
      resultCodeSub: 'string',
      resultMsgSub: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckRouteTwometaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo: string;
  // 姓名
  certName: string;
  // 身份证号
  certNo: string;
  // 使用场景
  scene: string;
  // map结果的json数据格式，预留字段
  // 
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      certName: 'cert_name',
      certNo: 'cert_no',
      scene: 'scene',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      certName: 'string',
      certNo: 'string',
      scene: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckRouteTwometaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // true:匹配成功 false：匹配失败
  // 
  match?: string;
  // 扩展信息，预留字段
  // 
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      match: 'match',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      match: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMobileRiskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部唯一标识。用于定位。 值为32位长度的字母数字组合前面几位字符是商户自定义的简称，中间可以使用一段时间，后段可以使用一个随机或递增序列
  outerOrderNo: string;
  // 设备身份临时标识
  apdidToken: string;
  // 接口使用场景，不同场景下接口返回字段集合会有差异，可缺省
  scene?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      apdidToken: 'apdid_token',
      scene: 'scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      apdidToken: 'string',
      scene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMobileRiskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 设备相关数据，默认只返回apdid，由Map<String,String>序列化
  deviceInfo?: string;
  // 设备风险标签，由Map<String,String>序列化
  riskInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      deviceInfo: 'device_info',
      riskInfo: 'risk_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      deviceInfo: 'string',
      riskInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailFacevrfServerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实人认证唯一标识
  certifyId: string;
  // 预留扩展业务参数
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certifyId: 'certify_id',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certifyId: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailFacevrfServerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // PASS：认证通过
  // FAIL：认证不通过
  // NO_RECODE：无认证记录
  // PROCESSING：认证中
  state?: string;
  // 认证人信息，包括姓名和身份证号，不加密
  // state为PASS/FAIL/PROCESSING时为JSON字符串，为NO_RECORD时为空
  identityInfo?: string;
  // 预留扩展结果
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      state: 'state',
      identityInfo: 'identity_info',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      state: 'string',
      identityInfo: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckAnticheatPersonalRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部请求id
  outerOrderNo: string;
  // 主体姓名
  certName?: string;
  // 主体身份证号
  certNo: string;
  // 受雇企业
  companyName: string;
  // 组织机构代码
  companyNo?: string;
  // 扩展字段，json格式
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      certName: 'cert_name',
      certNo: 'cert_no',
      companyName: 'company_name',
      companyNo: 'company_no',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      certName: 'string',
      certNo: 'string',
      companyName: 'string',
      companyNo: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckAnticheatPersonalResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 风险等级
  riskLevel?: string;
  // 风险等级文字描述
  riskLevelDesc?: string;
  // 扩展信息
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      riskLevel: 'risk_level',
      riskLevelDesc: 'risk_level_desc',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      riskLevel: 'string',
      riskLevelDesc: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckTwometaHashRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // hash后的身份证号，不区分大小写，使用的hash算法参考hash_type字段
  certNoHash: string;
  // hash后的姓名，不区分大小写，使用的hash类型参考hash_type
  certNameHash: string;
  // 本次核验id
  outerOrderId: string;
  // 支持的hash类型
  hashType: string;
  // json格式的扩展字段
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certNoHash: 'cert_no_hash',
      certNameHash: 'cert_name_hash',
      outerOrderId: 'outer_order_id',
      hashType: 'hash_type',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certNoHash: 'string',
      certNameHash: 'string',
      outerOrderId: 'string',
      hashType: 'string',
      externInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckTwometaHashResponse extends $tea.Model {
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

export class QueryThreemetaOnlinetimeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部请求id
  outerOrderNo: string;
  // 姓名
  certName: string;
  // 身份证号
  certNo: string;
  // 手机号码
  phoneNo: string;
  // 扩展参数
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outerOrderNo: 'outer_order_no',
      certName: 'cert_name',
      certNo: 'cert_no',
      phoneNo: 'phone_no',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outerOrderNo: 'string',
      certName: 'string',
      certNo: 'string',
      phoneNo: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryThreemetaOnlinetimeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 在网时长标准码，规则：
  // 1: [0,3)表示在⽹时⻓是 0~3 个⽉
  // 2: [3,6)表示在⽹时⻓是 3~6 个⽉
  // 3: [6,12)表示在⽹时⻓是 6~12 个⽉
  // 4: [12,24)表示在⽹时⻓是 12~24 ⽉
  // 5: [24,+)表示在⽹时⻓是 24个⽉及以上
  lengthCode?: string;
  // 扩展信息，json格式
  externInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      lengthCode: 'length_code',
      externInfo: 'extern_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      lengthCode: 'string',
      externInfo: 'string',
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
          sdk_version: "1.8.0",
          _prod_code: "REALPERSON",
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
   * Description: 查询认证的结果和相关信息
   * Summary: 认证查询
   */
  async queryFacevrfServer(request: QueryFacevrfServerRequest): Promise<QueryFacevrfServerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFacevrfServerEx(request, headers, runtime);
  }

  /**
   * Description: 查询认证的结果和相关信息
   * Summary: 认证查询
   */
  async queryFacevrfServerEx(request: QueryFacevrfServerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFacevrfServerResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFacevrfServerResponse>(await this.doRequest("1.0", "di.realperson.facevrf.server.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFacevrfServerResponse({}));
  }

  /**
   * Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
   * Summary: 认证创建
   */
  async createFacevrfServer(request: CreateFacevrfServerRequest): Promise<CreateFacevrfServerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createFacevrfServerEx(request, headers, runtime);
  }

  /**
   * Description: 服务端认证创建，传入认证信息，获取认证ID（和url）
   * Summary: 认证创建
   */
  async createFacevrfServerEx(request: CreateFacevrfServerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateFacevrfServerResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateFacevrfServerResponse>(await this.doRequest("1.0", "di.realperson.facevrf.server.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateFacevrfServerResponse({}));
  }

  /**
   * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
   * Summary: 纯服务端比对
   */
  async execFacevrfServer(request: ExecFacevrfServerRequest): Promise<ExecFacevrfServerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execFacevrfServerEx(request, headers, runtime);
  }

  /**
   * Description: 纯服务端比对，直接输入待比对的图片，返回比对结果
   * Summary: 纯服务端比对
   */
  async execFacevrfServerEx(request: ExecFacevrfServerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecFacevrfServerResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecFacevrfServerResponse>(await this.doRequest("1.0", "di.realperson.facevrf.server.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecFacevrfServerResponse({}));
  }

  /**
   * Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
   * Summary: 商户获取司法链上刷脸存证和统一证据ID
   */
  async getFacevrfEvidence(request: GetFacevrfEvidenceRequest): Promise<GetFacevrfEvidenceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getFacevrfEvidenceEx(request, headers, runtime);
  }

  /**
   * Description: 传入某次刷脸的certifyID，获得刷脸存证的pdf文件和司法脸统一证据ID，这两份数据可以在司法链的控制台中进行核验存证是否被记录在区块链上从而证实其真实可信。
   * Summary: 商户获取司法链上刷脸存证和统一证据ID
   */
  async getFacevrfEvidenceEx(request: GetFacevrfEvidenceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetFacevrfEvidenceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetFacevrfEvidenceResponse>(await this.doRequest("1.0", "di.realperson.facevrf.evidence.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetFacevrfEvidenceResponse({}));
  }

  /**
   * Description: 个人二要素认证
   * Summary: 个人二要素认证
   */
  async checkIndividualidTwometa(request: CheckIndividualidTwometaRequest): Promise<CheckIndividualidTwometaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkIndividualidTwometaEx(request, headers, runtime);
  }

  /**
   * Description: 个人二要素认证
   * Summary: 个人二要素认证
   */
  async checkIndividualidTwometaEx(request: CheckIndividualidTwometaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckIndividualidTwometaResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckIndividualidTwometaResponse>(await this.doRequest("1.0", "di.realperson.individualid.twometa.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckIndividualidTwometaResponse({}));
  }

  /**
   * Description: 个人三要素认证
   * Summary: 个人三要素认证
   */
  async checkIndividualidThreemeta(request: CheckIndividualidThreemetaRequest): Promise<CheckIndividualidThreemetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkIndividualidThreemetaEx(request, headers, runtime);
  }

  /**
   * Description: 个人三要素认证
   * Summary: 个人三要素认证
   */
  async checkIndividualidThreemetaEx(request: CheckIndividualidThreemetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckIndividualidThreemetaResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckIndividualidThreemetaResponse>(await this.doRequest("1.0", "di.realperson.individualid.threemeta.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckIndividualidThreemetaResponse({}));
  }

  /**
   * Description: 个人四要素认证
   * Summary: 个人四要素认证
   */
  async checkIndividualidFourmeta(request: CheckIndividualidFourmetaRequest): Promise<CheckIndividualidFourmetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkIndividualidFourmetaEx(request, headers, runtime);
  }

  /**
   * Description: 个人四要素认证
   * Summary: 个人四要素认证
   */
  async checkIndividualidFourmetaEx(request: CheckIndividualidFourmetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckIndividualidFourmetaResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckIndividualidFourmetaResponse>(await this.doRequest("1.0", "di.realperson.individualid.fourmeta.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckIndividualidFourmetaResponse({}));
  }

  /**
   * Description: 个人三要素认证（场景路由）
   * Summary: 个人三要素认证（场景路由）
   */
  async checkRouteThreemeta(request: CheckRouteThreemetaRequest): Promise<CheckRouteThreemetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkRouteThreemetaEx(request, headers, runtime);
  }

  /**
   * Description: 个人三要素认证（场景路由）
   * Summary: 个人三要素认证（场景路由）
   */
  async checkRouteThreemetaEx(request: CheckRouteThreemetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckRouteThreemetaResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckRouteThreemetaResponse>(await this.doRequest("1.0", "di.realperson.route.threemeta.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckRouteThreemetaResponse({}));
  }

  /**
   * Description: 纯服务端声纹注册
   * Summary: 纯服务端声纹注册
   */
  async createVoiceprintServermode(request: CreateVoiceprintServermodeRequest): Promise<CreateVoiceprintServermodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createVoiceprintServermodeEx(request, headers, runtime);
  }

  /**
   * Description: 纯服务端声纹注册
   * Summary: 纯服务端声纹注册
   */
  async createVoiceprintServermodeEx(request: CreateVoiceprintServermodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateVoiceprintServermodeResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "di.realperson.voiceprint.servermode.create",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let createVoiceprintServermodeResponse = new CreateVoiceprintServermodeResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return createVoiceprintServermodeResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
    }

    Util.validateModel(request);
    return $tea.cast<CreateVoiceprintServermodeResponse>(await this.doRequest("1.0", "di.realperson.voiceprint.servermode.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateVoiceprintServermodeResponse({}));
  }

  /**
   * Description: 纯服务端声纹比对
   * Summary: 纯服务端声纹比对
   */
  async verifyVoiceprintServermode(request: VerifyVoiceprintServermodeRequest): Promise<VerifyVoiceprintServermodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyVoiceprintServermodeEx(request, headers, runtime);
  }

  /**
   * Description: 纯服务端声纹比对
   * Summary: 纯服务端声纹比对
   */
  async verifyVoiceprintServermodeEx(request: VerifyVoiceprintServermodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyVoiceprintServermodeResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyVoiceprintServermodeResponse>(await this.doRequest("1.0", "di.realperson.voiceprint.servermode.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyVoiceprintServermodeResponse({}));
  }

  /**
   * Description: 个人二要素认证（场景路由）
   * Summary: 个人二要素认证（场景路由）
   */
  async checkRouteTwometa(request: CheckRouteTwometaRequest): Promise<CheckRouteTwometaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkRouteTwometaEx(request, headers, runtime);
  }

  /**
   * Description: 个人二要素认证（场景路由）
   * Summary: 个人二要素认证（场景路由）
   */
  async checkRouteTwometaEx(request: CheckRouteTwometaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckRouteTwometaResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckRouteTwometaResponse>(await this.doRequest("1.0", "di.realperson.route.twometa.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckRouteTwometaResponse({}));
  }

  /**
   * Description: 通过移动设备身份临时标识查询该设备相关的设备风险信息的服务
   * Summary: 移动风险设备查询
   */
  async queryMobileRisk(request: QueryMobileRiskRequest): Promise<QueryMobileRiskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMobileRiskEx(request, headers, runtime);
  }

  /**
   * Description: 通过移动设备身份临时标识查询该设备相关的设备风险信息的服务
   * Summary: 移动风险设备查询
   */
  async queryMobileRiskEx(request: QueryMobileRiskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMobileRiskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMobileRiskResponse>(await this.doRequest("1.0", "di.realperson.mobile.risk.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMobileRiskResponse({}));
  }

  /**
   * Description: 通过认证ID查询认证人、认证时间等相关信息，供智科内部使用
   * Summary: 查询认证人、认证时间等相关信息
   */
  async detailFacevrfServer(request: DetailFacevrfServerRequest): Promise<DetailFacevrfServerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailFacevrfServerEx(request, headers, runtime);
  }

  /**
   * Description: 通过认证ID查询认证人、认证时间等相关信息，供智科内部使用
   * Summary: 查询认证人、认证时间等相关信息
   */
  async detailFacevrfServerEx(request: DetailFacevrfServerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailFacevrfServerResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailFacevrfServerResponse>(await this.doRequest("1.0", "di.realperson.facevrf.server.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailFacevrfServerResponse({}));
  }

  /**
   * Description: 临工场景等场景下，通过主体的社保缴纳情况进行的反欺诈校验
   * Summary: 个人反欺诈风险校验
   */
  async checkAnticheatPersonal(request: CheckAnticheatPersonalRequest): Promise<CheckAnticheatPersonalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkAnticheatPersonalEx(request, headers, runtime);
  }

  /**
   * Description: 临工场景等场景下，通过主体的社保缴纳情况进行的反欺诈校验
   * Summary: 个人反欺诈风险校验
   */
  async checkAnticheatPersonalEx(request: CheckAnticheatPersonalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckAnticheatPersonalResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckAnticheatPersonalResponse>(await this.doRequest("1.0", "di.realperson.anticheat.personal.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckAnticheatPersonalResponse({}));
  }

  /**
   * Description: 二要素支持hash主体信息
   * Summary: 个人二要素核验支持hash的主体信息
   */
  async checkTwometaHash(request: CheckTwometaHashRequest): Promise<CheckTwometaHashResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkTwometaHashEx(request, headers, runtime);
  }

  /**
   * Description: 二要素支持hash主体信息
   * Summary: 个人二要素核验支持hash的主体信息
   */
  async checkTwometaHashEx(request: CheckTwometaHashRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckTwometaHashResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckTwometaHashResponse>(await this.doRequest("1.0", "di.realperson.twometa.hash.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckTwometaHashResponse({}));
  }

  /**
   * Description: 对接运营商等数据源查询手机号码的在网时长
   * Summary: 三要素在网时长查询接口
   */
  async queryThreemetaOnlinetime(request: QueryThreemetaOnlinetimeRequest): Promise<QueryThreemetaOnlinetimeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryThreemetaOnlinetimeEx(request, headers, runtime);
  }

  /**
   * Description: 对接运营商等数据源查询手机号码的在网时长
   * Summary: 三要素在网时长查询接口
   */
  async queryThreemetaOnlinetimeEx(request: QueryThreemetaOnlinetimeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryThreemetaOnlinetimeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryThreemetaOnlinetimeResponse>(await this.doRequest("1.0", "di.realperson.threemeta.onlinetime.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryThreemetaOnlinetimeResponse({}));
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
