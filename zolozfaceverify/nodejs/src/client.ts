// This file is auto-generated, don't edit it
import AntchainUtil from '@antchain/alipay-util';
import Util, * as $Util from '@alicloud/tea-util';
import RPCUtil from '@alicloud/rpc-util';
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

// 计量详细结果
export class MeteringDataDetail extends $tea.Model {
  // 比对通过
  identifyPassedPv?: number;
  // 上传服务端成功
  identifySucceedPv?: number;
  // 计量类型
  meteringType?: string;
  // 产品渲染（SDK唤起）
  prodStartPv?: number;
  // 查询结果通过
  queryPassedPv?: number;
  // 发起查询
  querySucceedPv?: number;
  // 可用性检查通过
  usablePassedPv?: number;
  // 可用性检查开始
  usableStartPv?: number;
  static names(): { [key: string]: string } {
    return {
      identifyPassedPv: 'identify_passed_pv',
      identifySucceedPv: 'identify_succeed_pv',
      meteringType: 'metering_type',
      prodStartPv: 'prod_start_pv',
      queryPassedPv: 'query_passed_pv',
      querySucceedPv: 'query_succeed_pv',
      usablePassedPv: 'usable_passed_pv',
      usableStartPv: 'usable_start_pv',
    };
  }

  static types(): { [key: string]: any } {
    return {
      identifyPassedPv: 'number',
      identifySucceedPv: 'number',
      meteringType: 'string',
      prodStartPv: 'number',
      queryPassedPv: 'number',
      querySucceedPv: 'number',
      usablePassedPv: 'number',
      usableStartPv: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 计量结果
export class MeteringData extends $tea.Model {
  // endTime
  endTime?: string;
  // metering_data_detail_list
  meteringDataDetailList?: MeteringDataDetail[];
  // startTime
  startTime?: string;
  static names(): { [key: string]: string } {
    return {
      endTime: 'end_time',
      meteringDataDetailList: 'metering_data_detail_list',
      startTime: 'start_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      endTime: 'string',
      meteringDataDetailList: { 'type': 'array', 'itemType': MeteringDataDetail },
      startTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecFaceauthAlgorithmRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 业务ID
  bizId: string;
  // 渠道
  channel: string;
  // base64图片
  imgStr: string;
  // Pano类型
  imgType: string;
  // 场景
  scene?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      channel: 'channel',
      imgStr: 'img_str',
      imgType: 'img_type',
      scene: 'scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      channel: 'string',
      imgStr: 'string',
      imgType: 'string',
      scene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecFaceauthAlgorithmResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  // 算法结果，json格式
  algoResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      algoResult: 'algo_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      algoResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FaceFaceauthInitializeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
  bizId: string;
  // 预留扩展业务参数
  externParam?: string;
  // 用户身份信息
  identityParam: string;
  // metainfo环境参数
  metainfo: string;
  // 操作类型
  operationType?: string;
  // 比对源图片
  refImg?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      externParam: 'extern_param',
      identityParam: 'identity_param',
      metainfo: 'metainfo',
      operationType: 'operation_type',
      refImg: 'ref_img',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      externParam: 'string',
      identityParam: 'string',
      metainfo: 'string',
      operationType: 'string',
      refImg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FaceFaceauthInitializeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  // 预留扩展结果
  externInfo: string;
  // 产品结果明细，不影响决策
  resultCodeSub: string;
  // result_code_sub对应的文案
  resultMsgSub: string;
  // 实人认证id
  zimId: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      externInfo: 'extern_info',
      resultCodeSub: 'result_code_sub',
      resultMsgSub: 'result_msg_sub',
      zimId: 'zim_id',
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
      zimId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FaceFaceauthQueryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 业务单据号，用于核对和排查
  bizId: string;
  // 预留扩展业务参数
  externParam?: string;
  // zimId，用于查询认证结果
  zimId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      externParam: 'extern_param',
      zimId: 'zim_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      externParam: 'string',
      zimId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FaceFaceauthQueryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  // 预留扩展结果
  externInfo: string;
  // 产品结果明细，不影响决策
  resultCodeSub: string;
  // result_code_sub对应的文案
  resultMsgSub: string;
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

export class IdentityFaceauthServermodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 活体照片，base64编码
  authImg?: string;
  // BLOB：使用客户端透传的BLOB数据
  // IMAGE：正常图片模式
  authImgType?: string;
  // 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
  bizId: string;
  // 预留扩展业务参数
  externParam?: string;
  // 用户身份信息
  identityParam?: string;
  // 操作类型，NORMAL正常模式，CUSTOM用户自定义比对源
  operationType?: string;
  // 比对源照片，base64编码
  refImg?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authImg: 'auth_img',
      authImgType: 'auth_img_type',
      bizId: 'biz_id',
      externParam: 'extern_param',
      identityParam: 'identity_param',
      operationType: 'operation_type',
      refImg: 'ref_img',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authImg: 'string',
      authImgType: 'string',
      bizId: 'string',
      externParam: 'string',
      identityParam: 'string',
      operationType: 'string',
      refImg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class IdentityFaceauthServermodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  // 预留扩展结果
  externInfo?: string;
  // 产品结果明细，不影响决策
  resultCodeSub?: string;
  // 明细返回码对应的文案
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

export class InitializeFaceauthWebRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
  bizId: string;
  // 预留扩展业务参数
  externParam?: string;
  // 用户身份信息
  identityParam?: string;
  // metainfo环境参数
  metainfo?: string;
  // 操作类型
  operationType?: string;
  // 比对源图片
  refImg?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      externParam: 'extern_param',
      identityParam: 'identity_param',
      metainfo: 'metainfo',
      operationType: 'operation_type',
      refImg: 'ref_img',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      externParam: 'string',
      identityParam: 'string',
      metainfo: 'string',
      operationType: 'string',
      refImg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitializeFaceauthWebResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  // 预留扩展结果
  externInfo?: string;
  // 产品结果明细，不影响决策
  resultCodeSub?: string;
  // result_code_sub对应的文案
  resultMsgSub?: string;
  // 实人认证id
  zimId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      externInfo: 'extern_info',
      resultCodeSub: 'result_code_sub',
      resultMsgSub: 'result_msg_sub',
      zimId: 'zim_id',
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
      zimId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFaceauthWebRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 业务单据号，用于核对和排查问题
  bizId: string;
  // 预留扩展业务参数
  externParam?: string;
  // zimId，用于查询认证结果
  zimId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      externParam: 'extern_param',
      zimId: 'zim_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      externParam: 'string',
      zimId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFaceauthWebResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  // 预留扩展结果
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

export class QueryFaceauthMeteringRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 业务流水号
  bizId: string;
  // 截止时间（整小时）
  endTime: string;
  // 初始化接口传入的二级商户id
  merchantId?: string;
  // 需要查询的计量类型
  // 实名新用户:realNameNewUser
  // 实名老用户:realNameOldUser
  // 匿名注册:anonymousEnroll
  // 匿名比对:anonymousAuth
  // 
  meteringType?: string;
  // 起始时间（整小时）
  startTime: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      endTime: 'end_time',
      merchantId: 'merchant_id',
      meteringType: 'metering_type',
      startTime: 'start_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      endTime: 'string',
      merchantId: 'string',
      meteringType: 'string',
      startTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFaceauthMeteringResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  // 计量数据
  meteringData?: MeteringData;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      meteringData: 'metering_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      meteringData: MeteringData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitFaceauthFaceLiteRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
  bizId: string;
  // 预留扩展业务参数
  externParam?: string;
  // 用户身份信息
  identityParam: string;
  // metainfo环境参数
  metainfo: string;
  // 操作类型
  operationType?: string;
  // 比对源图片
  refImg?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      externParam: 'extern_param',
      identityParam: 'identity_param',
      metainfo: 'metainfo',
      operationType: 'operation_type',
      refImg: 'ref_img',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      externParam: 'string',
      identityParam: 'string',
      metainfo: 'string',
      operationType: 'string',
      refImg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitFaceauthFaceLiteResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  // 扩展结果
  externInfo?: string;
  // 人脸协议
  protocol?: string;
  // 产品结果明细，不影响决策
  resultCodeSub?: string;
  // 明细返回码对应的文案
  resultMsgSub?: string;
  // 刷脸认证唯一标识。如果初始化失败则为空，可通过返回码分析具体原因
  zimId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      externInfo: 'extern_info',
      protocol: 'protocol',
      resultCodeSub: 'result_code_sub',
      resultMsgSub: 'result_msg_sub',
      zimId: 'zim_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      externInfo: 'string',
      protocol: 'string',
      resultCodeSub: 'string',
      resultMsgSub: 'string',
      zimId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFaceauthDataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 业务ID
  bizId: string;
  // 数据地址
  dataUrl: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      dataUrl: 'data_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      dataUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFaceauthDataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  // 查询结果详情
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAuthenticationCustomerFaceabilityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // extract(提取特征)、sex(检测性别)、rect(人脸矩形框识别)
  ability: string;
  // 算法版本
  algVer: string;
  // 图片encode base64 String
  authImg: string;
  // 业务接入方生成，唯一ID
  bizId: string;
  // 场景码
  sceneCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      ability: 'ability',
      algVer: 'alg_ver',
      authImg: 'auth_img',
      bizId: 'biz_id',
      sceneCode: 'scene_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      ability: 'string',
      algVer: 'string',
      authImg: 'string',
      bizId: 'string',
      sceneCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAuthenticationCustomerFaceabilityResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
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

export class InitFaceauthZimRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 业务参数
  bizData?: string;
  // 渠道
  channel?: string;
  // 商户
  merchant?: string;
  // 环境参数
  metaInfo: string;
  // 产品节点
  produceNode?: string;
  // 产品名称
  productName?: string;
  // 实人认证id
  zimId: string;
  // 身份信息参数
  zimPrincipal?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizData: 'biz_data',
      channel: 'channel',
      merchant: 'merchant',
      metaInfo: 'meta_info',
      produceNode: 'produce_node',
      productName: 'product_name',
      zimId: 'zim_id',
      zimPrincipal: 'zim_principal',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizData: 'string',
      channel: 'string',
      merchant: 'string',
      metaInfo: 'string',
      produceNode: 'string',
      productName: 'string',
      zimId: 'string',
      zimPrincipal: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitFaceauthZimResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  // 预留扩展结果
  extParams?: string;
  // 描述
  message?: string;
  // 协议
  protocol?: string;
  // 返回码
  retCode?: string;
  // 明细返回码
  retCodeSub?: string;
  // 明细返回码对应的文案
  retMessageSub?: string;
  // 实人认证id
  zimiId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      extParams: 'ext_params',
      message: 'message',
      protocol: 'protocol',
      retCode: 'ret_code',
      retCodeSub: 'ret_code_sub',
      retMessageSub: 'ret_message_sub',
      zimiId: 'zimi_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      extParams: 'string',
      message: 'string',
      protocol: 'string',
      retCode: 'string',
      retCodeSub: 'string',
      retMessageSub: 'string',
      zimiId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyFaceauthZimRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 扩展信息,Map的json格式
  externParam?: string;
  // 人脸业务参数
  zimData: string;
  // 实人认证id
  zimId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      externParam: 'extern_param',
      zimData: 'zim_data',
      zimId: 'zim_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      externParam: 'string',
      zimData: 'string',
      zimId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyFaceauthZimResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  // 预留扩展结果
  extParams?: string;
  // ""
  hasNext?: string;
  // ""
  nextProtocol?: string;
  // 产品返回明细码
  productRetCode?: string;
  // 明细返回码
  retCodeSub?: string;
  // 明细返回码对应的文案
  retMessageSub?: string;
  // 验证返回明细码
  validationRetCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      extParams: 'ext_params',
      hasNext: 'has_next',
      nextProtocol: 'next_protocol',
      productRetCode: 'product_ret_code',
      retCodeSub: 'ret_code_sub',
      retMessageSub: 'ret_message_sub',
      validationRetCode: 'validation_ret_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      extParams: 'string',
      hasNext: 'string',
      nextProtocol: 'string',
      productRetCode: 'string',
      retCodeSub: 'string',
      retMessageSub: 'string',
      validationRetCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RecognizeFaceauthOcrRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 数据内容
  dataContext: string;
  // 数据类型：OSS_ADDR/BASE64_JPG
  dataType: string;
  // 扩展字段
  externParam?: string;
  // face: 身份证正面 back: 身份证反面 缺省值是：face
  // 
  side: string;
  // zimid
  zimId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataContext: 'data_context',
      dataType: 'data_type',
      externParam: 'extern_param',
      side: 'side',
      zimId: 'zim_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataContext: 'string',
      dataType: 'string',
      externParam: 'string',
      side: 'string',
      zimId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RecognizeFaceauthOcrResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  // Map的json格式,预留
  externInfo?: string;
  // Map的json格式：里面存储ocr识别的结果：
  // 
  // name:姓名
  // 
  // sex：性别
  // 
  // num：身份证号码
  // 
  // birth：出生年月日
  // 
  // address：地址
  // 
  // nationality：名族
  // 
  // start_date：身份证有效期开始时间
  // 
  // end_date：身份证有效期截止时间
  // 
  // issue：备案公安局
  ocrInfo?: string;
  // 返回码
  retCode?: string;
  // 业务返回码
  // 
  retCodeSub?: string;
  // 业务返回码描述
  // 
  retMessageSub?: string;
  // face: 身份证正面 back: 身份证反面 缺省值是：face
  // 
  side?: string;
  // zimid
  zimId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      externInfo: 'extern_info',
      ocrInfo: 'ocr_info',
      retCode: 'ret_code',
      retCodeSub: 'ret_code_sub',
      retMessageSub: 'ret_message_sub',
      side: 'side',
      zimId: 'zim_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      externInfo: 'string',
      ocrInfo: 'string',
      retCode: 'string',
      retCodeSub: 'string',
      retMessageSub: 'string',
      side: 'string',
      zimId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitFaceauthWebsdkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 租户请求的唯一标志，该标识作为对账的关键信息，商户要保证其唯一性
  bizId: string;
  // 预留扩展业务参数
  externParam?: string;
  // 用户身份信息
  identityParam?: string;
  // metainfo环境参数
  metainfo?: string;
  // 操作类型
  operationType?: string;
  // 比对源图片
  refImg?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      externParam: 'extern_param',
      identityParam: 'identity_param',
      metainfo: 'metainfo',
      operationType: 'operation_type',
      refImg: 'ref_img',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      externParam: 'string',
      identityParam: 'string',
      metainfo: 'string',
      operationType: 'string',
      refImg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitFaceauthWebsdkResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  // 预留扩展结果
  externInfo?: string;
  // 产品结果明细，不影响决策
  resultCodeSub?: string;
  // result_code_sub对应的文案
  resultMsgSub?: string;
  // 实人认证id
  zimId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      externInfo: 'extern_info',
      resultCodeSub: 'result_code_sub',
      resultMsgSub: 'result_msg_sub',
      zimId: 'zim_id',
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
      zimId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFaceauthWebsdkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // 业务单据号，用于核对和排查问题
  bizId: string;
  // 预留扩展业务参数
  externParam?: string;
  // zimId，用于查询认证结果
  zimId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      externParam: 'extern_param',
      zimId: 'zim_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      externParam: 'string',
      zimId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFaceauthWebsdkResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  // 预留扩展结果
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

export class QueryFaceauthFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 集群ID
  productInstanceId?: string;
  // zoloz认证会话主键
  zimId: string;
  // 预留扩展业务参数
  externParam?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      zimId: 'zim_id',
      externParam: 'extern_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      zimId: 'string',
      externParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFaceauthFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 异常信息的文本描述
  resultCode?: string;
  resultMsg?: string;
  // 预留扩展结果
  externInfo?: string;
  // 结果码
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
          sdk_version: "1.3.6",
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
   * Description: 金融云计算能力输出给主站使用
   * Summary: 金融云计算能力输出给主站使用
   */
  async execFaceauthAlgorithm(request: ExecFaceauthAlgorithmRequest): Promise<ExecFaceauthAlgorithmResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execFaceauthAlgorithmEx(request, headers, runtime);
  }

  /**
   * Description: 金融云计算能力输出给主站使用
   * Summary: 金融云计算能力输出给主站使用
   */
  async execFaceauthAlgorithmEx(request: ExecFaceauthAlgorithmRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecFaceauthAlgorithmResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecFaceauthAlgorithmResponse>(await this.doRequest("1.0", "faceverifyzoloz.faceauth.algorithm.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecFaceauthAlgorithmResponse({}));
  }

  /**
   * Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
   * Summary: 实人认证初始化
   */
  async faceFaceauthInitialize(request: FaceFaceauthInitializeRequest): Promise<FaceFaceauthInitializeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.faceFaceauthInitializeEx(request, headers, runtime);
  }

  /**
   * Description: 调用“实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
   * Summary: 实人认证初始化
   */
  async faceFaceauthInitializeEx(request: FaceFaceauthInitializeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<FaceFaceauthInitializeResponse> {
    Util.validateModel(request);
    return $tea.cast<FaceFaceauthInitializeResponse>(await this.doRequest("1.0", "faceverifyzoloz.faceauth.initialize.face", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new FaceFaceauthInitializeResponse({}));
  }

  /**
   * Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
   * Summary: 实人认证查询
   */
  async faceFaceauthQuery(request: FaceFaceauthQueryRequest): Promise<FaceFaceauthQueryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.faceFaceauthQueryEx(request, headers, runtime);
  }

  /**
   * Description: 调用“实人认证结果查询”接口可以通过zimId查询当次认证的结果
   * Summary: 实人认证查询
   */
  async faceFaceauthQueryEx(request: FaceFaceauthQueryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<FaceFaceauthQueryResponse> {
    Util.validateModel(request);
    return $tea.cast<FaceFaceauthQueryResponse>(await this.doRequest("1.0", "faceverifyzoloz.faceauth.query.face", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new FaceFaceauthQueryResponse({}));
  }

  /**
   * Description: 人脸纯服务端模式比对
   * Summary: 人脸纯服务端模式比对
   */
  async identityFaceauthServermode(request: IdentityFaceauthServermodeRequest): Promise<IdentityFaceauthServermodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.identityFaceauthServermodeEx(request, headers, runtime);
  }

  /**
   * Description: 人脸纯服务端模式比对
   * Summary: 人脸纯服务端模式比对
   */
  async identityFaceauthServermodeEx(request: IdentityFaceauthServermodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<IdentityFaceauthServermodeResponse> {
    Util.validateModel(request);
    return $tea.cast<IdentityFaceauthServermodeResponse>(await this.doRequest("1.0", "faceverifyzoloz.faceauth.servermode.identity", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new IdentityFaceauthServermodeResponse({}));
  }

  /**
   * Description: 调用“H5实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
   * Summary: H5实人认证初始化
   */
  async initializeFaceauthWeb(request: InitializeFaceauthWebRequest): Promise<InitializeFaceauthWebResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initializeFaceauthWebEx(request, headers, runtime);
  }

  /**
   * Description: 调用“H5实人认证初始化”接口初始化认证服务并得到zimId，zimId用于唯一标识一次认证请求，后续通过zimId可以查询本次实人认证的结果
   * Summary: H5实人认证初始化
   */
  async initializeFaceauthWebEx(request: InitializeFaceauthWebRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitializeFaceauthWebResponse> {
    Util.validateModel(request);
    return $tea.cast<InitializeFaceauthWebResponse>(await this.doRequest("1.0", "faceverifyzoloz.faceauth.web.initialize", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitializeFaceauthWebResponse({}));
  }

  /**
   * Description: H5实人认证查询
   * Summary: H5实人认证查询
   */
  async queryFaceauthWeb(request: QueryFaceauthWebRequest): Promise<QueryFaceauthWebResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFaceauthWebEx(request, headers, runtime);
  }

  /**
   * Description: H5实人认证查询
   * Summary: H5实人认证查询
   */
  async queryFaceauthWebEx(request: QueryFaceauthWebRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFaceauthWebResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFaceauthWebResponse>(await this.doRequest("1.0", "faceverifyzoloz.faceauth.web.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFaceauthWebResponse({}));
  }

  /**
   * Description: 提供给业务方刷脸认证计量查询接口
   * Summary: 提供给业务方刷脸认证计量查询接口
   */
  async queryFaceauthMetering(request: QueryFaceauthMeteringRequest): Promise<QueryFaceauthMeteringResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFaceauthMeteringEx(request, headers, runtime);
  }

  /**
   * Description: 提供给业务方刷脸认证计量查询接口
   * Summary: 提供给业务方刷脸认证计量查询接口
   */
  async queryFaceauthMeteringEx(request: QueryFaceauthMeteringRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFaceauthMeteringResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFaceauthMeteringResponse>(await this.doRequest("1.0", "faceverifyzoloz.faceauth.metering.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFaceauthMeteringResponse({}));
  }

  /**
   * Description: 极简模式初始化接口，返回zimId和协议
   * Summary: 极简模式初始化接口
   */
  async initFaceauthFaceLite(request: InitFaceauthFaceLiteRequest): Promise<InitFaceauthFaceLiteResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initFaceauthFaceLiteEx(request, headers, runtime);
  }

  /**
   * Description: 极简模式初始化接口，返回zimId和协议
   * Summary: 极简模式初始化接口
   */
  async initFaceauthFaceLiteEx(request: InitFaceauthFaceLiteRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitFaceauthFaceLiteResponse> {
    Util.validateModel(request);
    return $tea.cast<InitFaceauthFaceLiteResponse>(await this.doRequest("1.0", "faceverifyzoloz.faceauth.face.lite.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitFaceauthFaceLiteResponse({}));
  }

  /**
   * Description: 数据查询，排查case
   * Summary: 数据查询，排查case
   */
  async queryFaceauthData(request: QueryFaceauthDataRequest): Promise<QueryFaceauthDataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFaceauthDataEx(request, headers, runtime);
  }

  /**
   * Description: 数据查询，排查case
   * Summary: 数据查询，排查case
   */
  async queryFaceauthDataEx(request: QueryFaceauthDataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFaceauthDataResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFaceauthDataResponse>(await this.doRequest("1.0", "faceverifyzoloz.faceauth.data.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFaceauthDataResponse({}));
  }

  /**
   * Description: 提供人脸特征提取、人脸区域识别等能力接口
   * Summary: 提供人脸特征提取、人脸区域识别等能力接口
   */
  async execAuthenticationCustomerFaceability(request: ExecAuthenticationCustomerFaceabilityRequest): Promise<ExecAuthenticationCustomerFaceabilityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execAuthenticationCustomerFaceabilityEx(request, headers, runtime);
  }

  /**
   * Description: 提供人脸特征提取、人脸区域识别等能力接口
   * Summary: 提供人脸特征提取、人脸区域识别等能力接口
   */
  async execAuthenticationCustomerFaceabilityEx(request: ExecAuthenticationCustomerFaceabilityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecAuthenticationCustomerFaceabilityResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecAuthenticationCustomerFaceabilityResponse>(await this.doRequest("1.0", "faceverifyzoloz.authentication.customer.faceability.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecAuthenticationCustomerFaceabilityResponse({}));
  }

  /**
   * Description: 客户端接口初始化认证
   * Summary: 客户端初始化
   */
  async initFaceauthZim(request: InitFaceauthZimRequest): Promise<InitFaceauthZimResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initFaceauthZimEx(request, headers, runtime);
  }

  /**
   * Description: 客户端接口初始化认证
   * Summary: 客户端初始化
   */
  async initFaceauthZimEx(request: InitFaceauthZimRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitFaceauthZimResponse> {
    Util.validateModel(request);
    return $tea.cast<InitFaceauthZimResponse>(await this.doRequest("1.0", "faceverifyzoloz.faceauth.zim.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitFaceauthZimResponse({}));
  }

  /**
   * Description: 提供客户端活体检测与人脸比对服务
   * Summary: 客户端人脸验证
   */
  async verifyFaceauthZim(request: VerifyFaceauthZimRequest): Promise<VerifyFaceauthZimResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyFaceauthZimEx(request, headers, runtime);
  }

  /**
   * Description: 提供客户端活体检测与人脸比对服务
   * Summary: 客户端人脸验证
   */
  async verifyFaceauthZimEx(request: VerifyFaceauthZimRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyFaceauthZimResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyFaceauthZimResponse>(await this.doRequest("1.0", "faceverifyzoloz.faceauth.zim.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyFaceauthZimResponse({}));
  }

  /**
   * Description: OCR识别接口，开放给阿里云场景
   * Summary: OCR识别接口
   */
  async recognizeFaceauthOcr(request: RecognizeFaceauthOcrRequest): Promise<RecognizeFaceauthOcrResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.recognizeFaceauthOcrEx(request, headers, runtime);
  }

  /**
   * Description: OCR识别接口，开放给阿里云场景
   * Summary: OCR识别接口
   */
  async recognizeFaceauthOcrEx(request: RecognizeFaceauthOcrRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RecognizeFaceauthOcrResponse> {
    Util.validateModel(request);
    return $tea.cast<RecognizeFaceauthOcrResponse>(await this.doRequest("1.0", "faceverifyzoloz.faceauth.ocr.recognize", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RecognizeFaceauthOcrResponse({}));
  }

  /**
   * Description: Web实人认证初始化	
   * Summary: Web实人认证初始化 
   */
  async initFaceauthWebsdk(request: InitFaceauthWebsdkRequest): Promise<InitFaceauthWebsdkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initFaceauthWebsdkEx(request, headers, runtime);
  }

  /**
   * Description: Web实人认证初始化	
   * Summary: Web实人认证初始化 
   */
  async initFaceauthWebsdkEx(request: InitFaceauthWebsdkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitFaceauthWebsdkResponse> {
    Util.validateModel(request);
    return $tea.cast<InitFaceauthWebsdkResponse>(await this.doRequest("1.0", "faceverifyzoloz.faceauth.websdk.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitFaceauthWebsdkResponse({}));
  }

  /**
   * Description: Web实人认证查询
   * Summary: Web实人认证查询
   */
  async queryFaceauthWebsdk(request: QueryFaceauthWebsdkRequest): Promise<QueryFaceauthWebsdkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFaceauthWebsdkEx(request, headers, runtime);
  }

  /**
   * Description: Web实人认证查询
   * Summary: Web实人认证查询
   */
  async queryFaceauthWebsdkEx(request: QueryFaceauthWebsdkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFaceauthWebsdkResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFaceauthWebsdkResponse>(await this.doRequest("1.0", "faceverifyzoloz.faceauth.websdk.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFaceauthWebsdkResponse({}));
  }

  /**
   * Description: zoloz提供具备权限控制的人脸图片获取接口，提供于支付宝会员等上游，控制数据风险
   * Summary: 获取认证资料
   */
  async queryFaceauthFile(request: QueryFaceauthFileRequest): Promise<QueryFaceauthFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFaceauthFileEx(request, headers, runtime);
  }

  /**
   * Description: zoloz提供具备权限控制的人脸图片获取接口，提供于支付宝会员等上游，控制数据风险
   * Summary: 获取认证资料
   */
  async queryFaceauthFileEx(request: QueryFaceauthFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFaceauthFileResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFaceauthFileResponse>(await this.doRequest("1.0", "faceverifyzoloz.faceauth.file.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFaceauthFileResponse({}));
  }

}
