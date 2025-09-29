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

export class ExecDataproductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 数据产品编码
  productCode: string;
  // 请求ID，调用方需要确保唯一
  requestId: string;
  // 业务入参的json字符串
  bizContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productCode: 'product_code',
      requestId: 'request_id',
      bizContent: 'biz_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productCode: 'string',
      requestId: 'string',
      bizContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecDataproductResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务返回值
  // 
  bizResult?: string;
  // 是否计费标识
  // Y 表示计费，N 表示不计费
  chargeFlag?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
      chargeFlag: 'charge_flag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
      chargeFlag: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecDataproductAsyncRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 数据产品编码
  productCode: string;
  // 产品类型
  // 
  productType: string;
  // 请求ID，调用方需要确保唯一
  // 
  requestId: string;
  // 业务入参的json字符串
  // 
  bizContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productCode: 'product_code',
      productType: 'product_type',
      requestId: 'request_id',
      bizContent: 'biz_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productCode: 'string',
      productType: 'string',
      requestId: 'string',
      bizContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecDataproductAsyncResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 执行状态
  // RUNNING：执行中
  // SUCCESS：成功
  // FAIL：失败
  execStatus?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      execStatus: 'exec_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      execStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDataproductAsyncRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 数据产品编码
  // 
  productCode: string;
  // 产品类型
  // 
  productType: string;
  // 请求ID，需要确保和异步调用的请求ID一致
  // 
  requestId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productCode: 'product_code',
      productType: 'product_type',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productCode: 'string',
      productType: 'string',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDataproductAsyncResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 执行状态
  // INIT：请求已受理
  // RUNNING：执行中
  // SUCCESS：成功
  // FAIL：失败
  execStatus?: string;
  // 业务返回值
  // 
  bizResult?: string;
  // 是否计费标识 Y 表示计费，N 表示不计费
  // 
  chargeFlag?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      execStatus: 'exec_status',
      bizResult: 'biz_result',
      chargeFlag: 'charge_flag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      execStatus: 'string',
      bizResult: 'string',
      chargeFlag: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitDrrdataSubscriptionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 业务类型
  bizType: string;
  // 请求id
  requestId: string;
  // 运单号
  mailNo: string;
  // 快递公司编码
  cpCode?: string;
  // 自定义标签，可为备注
  tag?: string;
  // 收、寄件人电话号码
  phone?: string;
  // 出发地城市
  fromCity?: string;
  // 目的地城市
  toCity?: string;
  // {}
  bizContent?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      bizType: 'biz_type',
      requestId: 'request_id',
      mailNo: 'mail_no',
      cpCode: 'cp_code',
      tag: 'tag',
      phone: 'phone',
      fromCity: 'from_city',
      toCity: 'to_city',
      bizContent: 'biz_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      bizType: 'string',
      requestId: 'string',
      mailNo: 'string',
      cpCode: 'string',
      tag: 'string',
      phone: 'string',
      fromCity: 'string',
      toCity: 'string',
      bizContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitDrrdataSubscriptionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务状态
  status?: string;
  // 返回业务参数
  bizResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      bizResult: 'biz_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      bizResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReceiveDrrdataTrackRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 业务类型
  bizType: string;
  // 业务数据
  bizContent: string;
  // 请求id
  requestId: string;
  // 运单
  mailNo: string;
  // 快递公司编码
  cpCode?: string;
  // 自定义标签
  tag?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      bizType: 'biz_type',
      bizContent: 'biz_content',
      requestId: 'request_id',
      mailNo: 'mail_no',
      cpCode: 'cp_code',
      tag: 'tag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      bizType: 'string',
      bizContent: 'string',
      requestId: 'string',
      mailNo: 'string',
      cpCode: 'string',
      tag: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReceiveDrrdataTrackResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务结果数据
  bizResult?: string;
  // 状态
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDrrdataRiafdRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 业务流水号 需唯一， 格式：日期_客户标识_序列号
  tradeNo: string;
  // 请求来源  国泰-GT
  bizSource: string;
  // 逆向物流单号
  reverseMailNo: string;
  // 逆向物流快递公司代码
  reverseCpCode?: string;
  // 逆向物流关联的电商平台
  reverseRelatePlatform?: string;
  // 逆向收件人电话后四位
  reverseReceiverPhone?: string;
  // 逆向寄件人电话后四位
  reverseSenderPhone?: string;
  // 申请退货时间 格式：yyyy-MM-dd HH:mm:ss
  applyReturnTime?: string;
  // 申请理赔时间 格式：yyyy-MM-dd HH:mm:ss
  claimProcessingTime?: string;
  // 正向物流单号
  forwardMailNo?: string;
  // 正向物流快递公司代码
  forwardCpCode?: string;
  // 正向物流关联的电商平台
  forwardRelatePlatform?: string;
  // 正向收件人电话后四位
  forwardReceiverPhone?: string;
  // 正向寄件人电话后四位
  forwardSenderPhone?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tradeNo: 'trade_no',
      bizSource: 'biz_source',
      reverseMailNo: 'reverse_mail_no',
      reverseCpCode: 'reverse_cp_code',
      reverseRelatePlatform: 'reverse_relate_platform',
      reverseReceiverPhone: 'reverse_receiver_phone',
      reverseSenderPhone: 'reverse_sender_phone',
      applyReturnTime: 'apply_return_time',
      claimProcessingTime: 'claim_processing_time',
      forwardMailNo: 'forward_mail_no',
      forwardCpCode: 'forward_cp_code',
      forwardRelatePlatform: 'forward_relate_platform',
      forwardReceiverPhone: 'forward_receiver_phone',
      forwardSenderPhone: 'forward_sender_phone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tradeNo: 'string',
      bizSource: 'string',
      reverseMailNo: 'string',
      reverseCpCode: 'string',
      reverseRelatePlatform: 'string',
      reverseReceiverPhone: 'string',
      reverseSenderPhone: 'string',
      applyReturnTime: 'string',
      claimProcessingTime: 'string',
      forwardMailNo: 'string',
      forwardCpCode: 'string',
      forwardRelatePlatform: 'string',
      forwardReceiverPhone: 'string',
      forwardSenderPhone: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDrrdataRiafdResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 反欺诈业务查询结果，json格式
  bizResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecMultimodalDataprodRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 文件唯一id
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  // 业务入参的json字符串
  bizContent?: string;
  // 数据产品编码
  productCode: string;
  // 请求唯一标识
  requestId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      bizContent: 'biz_content',
      productCode: 'product_code',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      bizContent: 'string',
      productCode: 'string',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecMultimodalDataprodResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务返回值json
  bizResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyMultimodalDataprodRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 通知具体json内容
  bizContent?: string;
  // 唯一请求id
  requestId: string;
  // 业务标识
  bizNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      bizContent: 'biz_content',
      requestId: 'request_id',
      bizNo: 'biz_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      bizContent: 'string',
      requestId: 'string',
      bizNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyMultimodalDataprodResponse extends $tea.Model {
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

export class QueryDatapromotionDecisionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 保司编码
  insurerCode: string;
  // 保险险种
  insuranceType: string;
  // 业务参数内容JSON字符串
  bizContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      insurerCode: 'insurer_code',
      insuranceType: 'insurance_type',
      bizContent: 'biz_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      insurerCode: 'string',
      insuranceType: 'string',
      bizContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDatapromotionDecisionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务出参JSON字符串
  bizResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushDatapromotionTrafficRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 保险险种
  insurerCode: string;
  // 保险险种
  insuranceType: string;
  // 业务参数内容JSON字符串
  bizContent: string;
  // 协议签署：USER_SIGN_INFO;；
  // 车辆信息上报：CAR_INFO；
  pushDataType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      insurerCode: 'insurer_code',
      insuranceType: 'insurance_type',
      bizContent: 'biz_content',
      pushDataType: 'push_data_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      insurerCode: 'string',
      insuranceType: 'string',
      bizContent: 'string',
      pushDataType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushDatapromotionTrafficResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // {}
  bizResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizResult: 'biz_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizResult: 'string',
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
          sdk_version: "1.2.27",
          _prod_code: "BXPT_NEW",
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
   * Description: 保险数据产品服务调用
   * Summary: 保险数据产品服务调用
   */
  async execDataproduct(request: ExecDataproductRequest): Promise<ExecDataproductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execDataproductEx(request, headers, runtime);
  }

  /**
   * Description: 保险数据产品服务调用
   * Summary: 保险数据产品服务调用
   */
  async execDataproductEx(request: ExecDataproductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecDataproductResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecDataproductResponse>(await this.doRequest("1.0", "antcloud.bxptnew.dataproduct.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecDataproductResponse({}));
  }

  /**
   * Description: 保险数据产品服务异步调用
   * Summary: 保险数据产品服务异步调用
   */
  async execDataproductAsync(request: ExecDataproductAsyncRequest): Promise<ExecDataproductAsyncResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execDataproductAsyncEx(request, headers, runtime);
  }

  /**
   * Description: 保险数据产品服务异步调用
   * Summary: 保险数据产品服务异步调用
   */
  async execDataproductAsyncEx(request: ExecDataproductAsyncRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecDataproductAsyncResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecDataproductAsyncResponse>(await this.doRequest("1.0", "antcloud.bxptnew.dataproduct.async.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecDataproductAsyncResponse({}));
  }

  /**
   * Description: 保险数据产品服务异步结果查询
   * Summary: 保险数据产品服务异步结果查询
   */
  async queryDataproductAsync(request: QueryDataproductAsyncRequest): Promise<QueryDataproductAsyncResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDataproductAsyncEx(request, headers, runtime);
  }

  /**
   * Description: 保险数据产品服务异步结果查询
   * Summary: 保险数据产品服务异步结果查询
   */
  async queryDataproductAsyncEx(request: QueryDataproductAsyncRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDataproductAsyncResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDataproductAsyncResponse>(await this.doRequest("1.0", "antcloud.bxptnew.dataproduct.async.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDataproductAsyncResponse({}));
  }

  /**
   * Description: 退运险物理轨迹订阅提交
   * Summary: 退运险物理轨迹订阅提交
   */
  async submitDrrdataSubscription(request: SubmitDrrdataSubscriptionRequest): Promise<SubmitDrrdataSubscriptionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitDrrdataSubscriptionEx(request, headers, runtime);
  }

  /**
   * Description: 退运险物理轨迹订阅提交
   * Summary: 退运险物理轨迹订阅提交
   */
  async submitDrrdataSubscriptionEx(request: SubmitDrrdataSubscriptionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitDrrdataSubscriptionResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitDrrdataSubscriptionResponse>(await this.doRequest("1.0", "antcloud.bxptnew.drrdata.subscription.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitDrrdataSubscriptionResponse({}));
  }

  /**
   * Description: 退运险物理轨迹数据接收
   * Summary: 退运险物理轨迹数据接收
   */
  async receiveDrrdataTrack(request: ReceiveDrrdataTrackRequest): Promise<ReceiveDrrdataTrackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.receiveDrrdataTrackEx(request, headers, runtime);
  }

  /**
   * Description: 退运险物理轨迹数据接收
   * Summary: 退运险物理轨迹数据接收
   */
  async receiveDrrdataTrackEx(request: ReceiveDrrdataTrackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReceiveDrrdataTrackResponse> {
    Util.validateModel(request);
    return $tea.cast<ReceiveDrrdataTrackResponse>(await this.doRequest("1.0", "antcloud.bxptnew.drrdata.track.receive", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReceiveDrrdataTrackResponse({}));
  }

  /**
   * Description: 退运险反欺诈服务api
   * Summary: 退运险反欺诈服务api
   */
  async queryDrrdataRiafd(request: QueryDrrdataRiafdRequest): Promise<QueryDrrdataRiafdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDrrdataRiafdEx(request, headers, runtime);
  }

  /**
   * Description: 退运险反欺诈服务api
   * Summary: 退运险反欺诈服务api
   */
  async queryDrrdataRiafdEx(request: QueryDrrdataRiafdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDrrdataRiafdResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDrrdataRiafdResponse>(await this.doRequest("1.0", "antcloud.bxptnew.drrdata.riafd.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDrrdataRiafdResponse({}));
  }

  /**
   * Description: 提供多模态的数据产品执行，支持上传文本，图片、视频、音频等格式
   * Summary: 提供多模态的数据产品执行
   */
  async execMultimodalDataprod(request: ExecMultimodalDataprodRequest): Promise<ExecMultimodalDataprodResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execMultimodalDataprodEx(request, headers, runtime);
  }

  /**
   * Description: 提供多模态的数据产品执行，支持上传文本，图片、视频、音频等格式
   * Summary: 提供多模态的数据产品执行
   */
  async execMultimodalDataprodEx(request: ExecMultimodalDataprodRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecMultimodalDataprodResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antcloud.bxptnew.multimodal.dataprod.exec",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let execMultimodalDataprodResponse = new ExecMultimodalDataprodResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return execMultimodalDataprodResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<ExecMultimodalDataprodResponse>(await this.doRequest("1.0", "antcloud.bxptnew.multimodal.dataprod.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecMultimodalDataprodResponse({}));
  }

  /**
   * Description: 数据产品执行结果通知
   * Summary: 数据产品执行结果通知
   */
  async notifyMultimodalDataprod(request: NotifyMultimodalDataprodRequest): Promise<NotifyMultimodalDataprodResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.notifyMultimodalDataprodEx(request, headers, runtime);
  }

  /**
   * Description: 数据产品执行结果通知
   * Summary: 数据产品执行结果通知
   */
  async notifyMultimodalDataprodEx(request: NotifyMultimodalDataprodRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<NotifyMultimodalDataprodResponse> {
    Util.validateModel(request);
    return $tea.cast<NotifyMultimodalDataprodResponse>(await this.doRequest("1.0", "antcloud.bxptnew.multimodal.dataprod.notify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new NotifyMultimodalDataprodResponse({}));
  }

  /**
   * Description: 保险数据营销决策查询
   * Summary: 保险数据营销决策查询
   */
  async queryDatapromotionDecision(request: QueryDatapromotionDecisionRequest): Promise<QueryDatapromotionDecisionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDatapromotionDecisionEx(request, headers, runtime);
  }

  /**
   * Description: 保险数据营销决策查询
   * Summary: 保险数据营销决策查询
   */
  async queryDatapromotionDecisionEx(request: QueryDatapromotionDecisionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDatapromotionDecisionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDatapromotionDecisionResponse>(await this.doRequest("1.0", "antcloud.bxptnew.datapromotion.decision.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDatapromotionDecisionResponse({}));
  }

  /**
   * Description: 保险数据营销流量推送
   * Summary: 保险数据营销流量推送
   */
  async pushDatapromotionTraffic(request: PushDatapromotionTrafficRequest): Promise<PushDatapromotionTrafficResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushDatapromotionTrafficEx(request, headers, runtime);
  }

  /**
   * Description: 保险数据营销流量推送
   * Summary: 保险数据营销流量推送
   */
  async pushDatapromotionTrafficEx(request: PushDatapromotionTrafficRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushDatapromotionTrafficResponse> {
    Util.validateModel(request);
    return $tea.cast<PushDatapromotionTrafficResponse>(await this.doRequest("1.0", "antcloud.bxptnew.datapromotion.traffic.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushDatapromotionTrafficResponse({}));
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
