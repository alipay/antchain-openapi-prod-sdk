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

// 区块链信息
export class BlockchainInfoDTO extends $tea.Model {
  // 交易hash
  txHash: string;
  // 交易时间戳
  txTime: number;
  static names(): { [key: string]: string } {
    return {
      txHash: 'tx_hash',
      txTime: 'tx_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      txHash: 'string',
      txTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品信息
export class GoodsDTO extends $tea.Model {
  // 商品id
  goodsId: string;
  // 商品模板id
  templateId: string;
  // 商品内容
  content: string;
  // 二维码地址
  qrCode: string;
  // 区块链信息
  blockchainInfo: BlockchainInfoDTO;
  static names(): { [key: string]: string } {
    return {
      goodsId: 'goods_id',
      templateId: 'template_id',
      content: 'content',
      qrCode: 'qr_code',
      blockchainInfo: 'blockchain_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      goodsId: 'string',
      templateId: 'string',
      content: 'string',
      qrCode: 'string',
      blockchainInfo: BlockchainInfoDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 溯源信息
export class TraceInfoDTO extends $tea.Model {
  // 操作描述
  operateTypeDesc: string;
  // 操作时间，时间戳
  operateTime: number;
  // 操作人id
  operatorId: string;
  // 操作人名称
  operatorName: string;
  // 操作内容
  content: string;
  static names(): { [key: string]: string } {
    return {
      operateTypeDesc: 'operate_type_desc',
      operateTime: 'operate_time',
      operatorId: 'operator_id',
      operatorName: 'operator_name',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      operateTypeDesc: 'string',
      operateTime: 'number',
      operatorId: 'string',
      operatorName: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品模板
export class GoodsTemplateDTO extends $tea.Model {
  // 模板id
  templateId: string;
  // 商品名称
  name: string;
  // 商品模板描述
  content: string;
  static names(): { [key: string]: string } {
    return {
      templateId: 'template_id',
      name: 'name',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      templateId: 'string',
      name: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeagueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 酒证:WINE_ASSET,茶证:TEA_ASSET,艺术物证:ARTISTIC_ASSET
  sceneType: string;
  // 联盟名称
  leagueName: string;
  // 黄酒集市
  sceneDesc?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneType: 'scene_type',
      leagueName: 'league_name',
      sceneDesc: 'scene_desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneType: 'string',
      leagueName: 'string',
      sceneDesc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeagueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 联盟id
  leagueId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      leagueId: 'league_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      leagueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelLeagueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联盟id
  leagueId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      leagueId: 'league_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      leagueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelLeagueResponse extends $tea.Model {
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

export class CreateUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户昵称
  userName: string;
  // 联盟id
  leagueId: string;
  // 真实姓名
  certName?: string;
  // 身份证号
  certNo?: string;
  // 手机号
  phone?: string;
  // 邮箱
  email?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userName: 'user_name',
      leagueId: 'league_id',
      certName: 'cert_name',
      certNo: 'cert_no',
      phone: 'phone',
      email: 'email',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userName: 'string',
      leagueId: 'string',
      certName: 'string',
      certNo: 'string',
      phone: 'string',
      email: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateUserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户id
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户id
  userId: string;
  // 用户昵称
  userName?: string;
  // 真实姓名
  certName?: string;
  // 身份证号
  certNo?: string;
  // 手机号
  phone?: string;
  // 邮箱
  email?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      userName: 'user_name',
      certName: 'cert_name',
      certNo: 'cert_no',
      phone: 'phone',
      email: 'email',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      userName: 'string',
      certName: 'string',
      certNo: 'string',
      phone: 'string',
      email: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateUserResponse extends $tea.Model {
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

export class BindUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户id
  userId: string;
  // 支付宝：ALIPAY
  platform: string;
  // 开放平台用户id
  openId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      platform: 'platform',
      openId: 'open_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      platform: 'string',
      openId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindUserResponse extends $tea.Model {
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

export class UnbindUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户id
  userId: string;
  // 支付宝：ALIPAY
  platform: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      platform: 'platform',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      platform: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnbindUserResponse extends $tea.Model {
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

export class CreateGoodstemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商品名称
  name: string;
  // 商品定义描述，格式如示例
  content: string;
  // 联盟id
  leagueId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      content: 'content',
      leagueId: 'league_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      content: 'string',
      leagueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateGoodstemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 模板id
  templateId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      templateId: 'template_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      templateId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateGoodstemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 模板id
  templateId: string;
  // 商品定义描述，格式如示例
  content: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      templateId: 'template_id',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      templateId: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateGoodstemplateResponse extends $tea.Model {
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

export class CancelGoodstemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 模板id
  templateId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      templateId: 'template_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      templateId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelGoodstemplateResponse extends $tea.Model {
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

export class QueryGoodstemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商品模板id，如果传入这个字段，返回的列表只有一条数据
  templateId?: string;
  // 当前页数
  currentPage?: number;
  // 每页大小，最大为20
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      templateId: 'template_id',
      currentPage: 'current_page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      templateId: 'string',
      currentPage: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGoodstemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商品模板列表
  goodstemplateList?: GoodsTemplateDTO[];
  // 总页数
  totalPage?: number;
  // 当前页数
  currentPage?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      goodstemplateList: 'goodstemplate_list',
      totalPage: 'total_page',
      currentPage: 'current_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      goodstemplateList: { 'type': 'array', 'itemType': GoodsTemplateDTO },
      totalPage: 'number',
      currentPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateGoodsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商品模板id
  templateId: string;
  // 用户id
  userId: string;
  // 商品信息
  content: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      templateId: 'template_id',
      userId: 'user_id',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      templateId: 'string',
      userId: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateGoodsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商品id
  goodsId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      goodsId: 'goods_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      goodsId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateGoodsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商品id
  goodsId: string;
  // 商品详情
  content: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      goodsId: 'goods_id',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      goodsId: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateGoodsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 区块链交易信息
  blockchainInfo?: BlockchainInfoDTO;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      blockchainInfo: 'blockchain_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      blockchainInfo: BlockchainInfoDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendGoodsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商品id
  goodsId: string;
  // 接收人用户id
  transfereeId: string;
  // 转让金额，单位分
  amount?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      goodsId: 'goods_id',
      transfereeId: 'transferee_id',
      amount: 'amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      goodsId: 'string',
      transfereeId: 'string',
      amount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendGoodsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 区块链交易信息
  blockchainInfo?: BlockchainInfoDTO;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      blockchainInfo: 'blockchain_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      blockchainInfo: BlockchainInfoDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGoodsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商品id
  goodsId: string;
  // 溯源信息枚举：ASSET_ONLY，只返回物权信息；LIST_ROAM_TRACE，转让溯源信息；LIST_TRACE，所有溯源信息；ASSET_ALL，返回以上所有信息（默认）
  traceType?: string;
  // 当前页（默认为1）
  currentPage?: number;
  // 页大小（默认为10）
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      goodsId: 'goods_id',
      traceType: 'trace_type',
      currentPage: 'current_page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      goodsId: 'string',
      traceType: 'string',
      currentPage: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGoodsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商品信息
  goods?: GoodsDTO;
  // 溯源信息列表
  traceInfoList?: TraceInfoDTO[];
  // 流转信息列表
  roamTraceList?: TraceInfoDTO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      goods: 'goods',
      traceInfoList: 'trace_info_list',
      roamTraceList: 'roam_trace_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      goods: GoodsDTO,
      traceInfoList: { 'type': 'array', 'itemType': TraceInfoDTO },
      roamTraceList: { 'type': 'array', 'itemType': TraceInfoDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryGoodsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户id
  userId: string;
  // 当前页
  currentPage: number;
  // 每页大小，最大20
  pageSize: number;
  // 数据范围类型：ALL_ASSET，所有物证；EFFECTIVE_ASSET，已生效物证；INVALID_ASSET，已失效物证。
  type: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      currentPage: 'current_page',
      pageSize: 'page_size',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      currentPage: 'number',
      pageSize: 'number',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryGoodsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前页
  currentPage?: number;
  // 总页数
  totalPage?: number;
  // 商品列表
  goodsList?: GoodsDTO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      currentPage: 'current_page',
      totalPage: 'total_page',
      goodsList: 'goods_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      currentPage: 'number',
      totalPage: 'number',
      goodsList: { 'type': 'array', 'itemType': GoodsDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateGoodsOperateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商品id
  goodsId: string;
  // 操作内容
  content: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      goodsId: 'goods_id',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      goodsId: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateGoodsOperateResponse extends $tea.Model {
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

export class CancelGoodsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商品核销
  goodsId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      goodsId: 'goods_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      goodsId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelGoodsResponse extends $tea.Model {
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

export class DisableGoodsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商品id
  goodsId: string;
  // 异常状态描述
  statusDesc: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      goodsId: 'goods_id',
      statusDesc: 'status_desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      goodsId: 'string',
      statusDesc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DisableGoodsResponse extends $tea.Model {
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

export class GetHealthcodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 身份证号，使用蚂蚁侧提供的RSA公钥加密
  certNo: string;
  // 设备编码
  deviceCode: string;
  // 姓名
  name: string;
  // 是否需要健康码信息，不传默认不需要
  // 1：需要
  // 0：不需要
  health?: number;
  // 是否需要疫苗信息
  // 1：需要，0：不需要，不传默认不需要
  vaccination?: number;
  // 是否需要核酸信息：
  // 1.需要，0：不需要，不传默认不需要
  nucleicAcid?: number;
  // 是否需要行程码：
  // 1.需要，0：不需要，不传默认不需要
  travel?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certNo: 'cert_no',
      deviceCode: 'device_code',
      name: 'name',
      health: 'health',
      vaccination: 'vaccination',
      nucleicAcid: 'nucleic_acid',
      travel: 'travel',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certNo: 'string',
      deviceCode: 'string',
      name: 'string',
      health: 'number',
      vaccination: 'number',
      nucleicAcid: 'number',
      travel: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetHealthcodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 1：绿色 2：黄色 3：红色
  healthCode?: string;
  // 健康码失败原因
  healthFactor?: string;
  // 行程码信息
  // 1:没去过疫情区，绿码;
  // 2:去过疫情区，红码;
  // 3:其他，黄码;
  // 0:行程信息不全;
  // -1查询失败;
  travelCode?: string;
  // 检测类型
  reportType?: string;
  // 检测结果
  reportResult?: string;
  // 检测机构
  reportOrganization?: string;
  // 检测时间
  reportTime?: string;
  // 疫苗接种信息：
  // 0查询失败 1未接种 2已接种一针 3完成接种
  vaccinationCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      healthCode: 'health_code',
      healthFactor: 'health_factor',
      travelCode: 'travel_code',
      reportType: 'report_type',
      reportResult: 'report_result',
      reportOrganization: 'report_organization',
      reportTime: 'report_time',
      vaccinationCode: 'vaccination_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      healthCode: 'string',
      healthFactor: 'string',
      travelCode: 'string',
      reportType: 'string',
      reportResult: 'string',
      reportOrganization: 'string',
      reportTime: 'string',
      vaccinationCode: 'string',
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
          sdk_version: "1.0.4",
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
   * Description: 创建联盟
   * Summary: 创建联盟
   */
  async createLeague(request: CreateLeagueRequest): Promise<CreateLeagueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeagueEx(request, headers, runtime);
  }

  /**
   * Description: 创建联盟
   * Summary: 创建联盟
   */
  async createLeagueEx(request: CreateLeagueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeagueResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeagueResponse>(await this.doRequest("1.0", "antchain.goodschain.league.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeagueResponse({}));
  }

  /**
   * Description: 注销联盟
   * Summary: 注销联盟
   */
  async cancelLeague(request: CancelLeagueRequest): Promise<CancelLeagueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelLeagueEx(request, headers, runtime);
  }

  /**
   * Description: 注销联盟
   * Summary: 注销联盟
   */
  async cancelLeagueEx(request: CancelLeagueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelLeagueResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelLeagueResponse>(await this.doRequest("1.0", "antchain.goodschain.league.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelLeagueResponse({}));
  }

  /**
   * Description: 创建用户
   * Summary: 创建用户
   */
  async createUser(request: CreateUserRequest): Promise<CreateUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createUserEx(request, headers, runtime);
  }

  /**
   * Description: 创建用户
   * Summary: 创建用户
   */
  async createUserEx(request: CreateUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateUserResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateUserResponse>(await this.doRequest("1.0", "antchain.goodschain.user.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateUserResponse({}));
  }

  /**
   * Description: 更新用户
   * Summary: 更新用户
   */
  async updateUser(request: UpdateUserRequest): Promise<UpdateUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateUserEx(request, headers, runtime);
  }

  /**
   * Description: 更新用户
   * Summary: 更新用户
   */
  async updateUserEx(request: UpdateUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateUserResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateUserResponse>(await this.doRequest("1.0", "antchain.goodschain.user.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateUserResponse({}));
  }

  /**
   * Description: 渠道用户绑定
   * Summary: 渠道用户绑定
   */
  async bindUser(request: BindUserRequest): Promise<BindUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindUserEx(request, headers, runtime);
  }

  /**
   * Description: 渠道用户绑定
   * Summary: 渠道用户绑定
   */
  async bindUserEx(request: BindUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindUserResponse> {
    Util.validateModel(request);
    return $tea.cast<BindUserResponse>(await this.doRequest("1.0", "antchain.goodschain.user.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindUserResponse({}));
  }

  /**
   * Description: 渠道用户解绑
   * Summary: 渠道用户解绑
   */
  async unbindUser(request: UnbindUserRequest): Promise<UnbindUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.unbindUserEx(request, headers, runtime);
  }

  /**
   * Description: 渠道用户解绑
   * Summary: 渠道用户解绑
   */
  async unbindUserEx(request: UnbindUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UnbindUserResponse> {
    Util.validateModel(request);
    return $tea.cast<UnbindUserResponse>(await this.doRequest("1.0", "antchain.goodschain.user.unbind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UnbindUserResponse({}));
  }

  /**
   * Description: 链上商品模版定义
   * Summary: 链上商品模版定义
   */
  async createGoodstemplate(request: CreateGoodstemplateRequest): Promise<CreateGoodstemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createGoodstemplateEx(request, headers, runtime);
  }

  /**
   * Description: 链上商品模版定义
   * Summary: 链上商品模版定义
   */
  async createGoodstemplateEx(request: CreateGoodstemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateGoodstemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateGoodstemplateResponse>(await this.doRequest("1.0", "antchain.goodschain.goodstemplate.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateGoodstemplateResponse({}));
  }

  /**
   * Description: 链上商品模版更新
   * Summary: 链上商品模版更新
   */
  async updateGoodstemplate(request: UpdateGoodstemplateRequest): Promise<UpdateGoodstemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateGoodstemplateEx(request, headers, runtime);
  }

  /**
   * Description: 链上商品模版更新
   * Summary: 链上商品模版更新
   */
  async updateGoodstemplateEx(request: UpdateGoodstemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateGoodstemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateGoodstemplateResponse>(await this.doRequest("1.0", "antchain.goodschain.goodstemplate.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateGoodstemplateResponse({}));
  }

  /**
   * Description: 链上商品模版注销
   * Summary: 链上商品模版注销
   */
  async cancelGoodstemplate(request: CancelGoodstemplateRequest): Promise<CancelGoodstemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelGoodstemplateEx(request, headers, runtime);
  }

  /**
   * Description: 链上商品模版注销
   * Summary: 链上商品模版注销
   */
  async cancelGoodstemplateEx(request: CancelGoodstemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelGoodstemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelGoodstemplateResponse>(await this.doRequest("1.0", "antchain.goodschain.goodstemplate.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelGoodstemplateResponse({}));
  }

  /**
   * Description: 链上商品模版查询
   * Summary: 链上商品模版查询
   */
  async queryGoodstemplate(request: QueryGoodstemplateRequest): Promise<QueryGoodstemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGoodstemplateEx(request, headers, runtime);
  }

  /**
   * Description: 链上商品模版查询
   * Summary: 链上商品模版查询
   */
  async queryGoodstemplateEx(request: QueryGoodstemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGoodstemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGoodstemplateResponse>(await this.doRequest("1.0", "antchain.goodschain.goodstemplate.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGoodstemplateResponse({}));
  }

  /**
   * Description: 链上商品发行
   * Summary: 链上商品发行
   */
  async createGoods(request: CreateGoodsRequest): Promise<CreateGoodsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createGoodsEx(request, headers, runtime);
  }

  /**
   * Description: 链上商品发行
   * Summary: 链上商品发行
   */
  async createGoodsEx(request: CreateGoodsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateGoodsResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateGoodsResponse>(await this.doRequest("1.0", "antchain.goodschain.goods.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateGoodsResponse({}));
  }

  /**
   * Description: 链上商品更新
   * Summary: 链上商品更新
   */
  async updateGoods(request: UpdateGoodsRequest): Promise<UpdateGoodsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateGoodsEx(request, headers, runtime);
  }

  /**
   * Description: 链上商品更新
   * Summary: 链上商品更新
   */
  async updateGoodsEx(request: UpdateGoodsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateGoodsResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateGoodsResponse>(await this.doRequest("1.0", "antchain.goodschain.goods.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateGoodsResponse({}));
  }

  /**
   * Description: 链上商品转增
   * Summary: 链上商品转增
   */
  async sendGoods(request: SendGoodsRequest): Promise<SendGoodsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendGoodsEx(request, headers, runtime);
  }

  /**
   * Description: 链上商品转增
   * Summary: 链上商品转增
   */
  async sendGoodsEx(request: SendGoodsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendGoodsResponse> {
    Util.validateModel(request);
    return $tea.cast<SendGoodsResponse>(await this.doRequest("1.0", "antchain.goodschain.goods.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendGoodsResponse({}));
  }

  /**
   * Description: 链上商品详情查询
   * Summary: 链上商品详情查询
   */
  async queryGoods(request: QueryGoodsRequest): Promise<QueryGoodsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGoodsEx(request, headers, runtime);
  }

  /**
   * Description: 链上商品详情查询
   * Summary: 链上商品详情查询
   */
  async queryGoodsEx(request: QueryGoodsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGoodsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGoodsResponse>(await this.doRequest("1.0", "antchain.goodschain.goods.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGoodsResponse({}));
  }

  /**
   * Description: 链上商品列表查询
   * Summary: 链上商品列表查询
   */
  async pagequeryGoods(request: PagequeryGoodsRequest): Promise<PagequeryGoodsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryGoodsEx(request, headers, runtime);
  }

  /**
   * Description: 链上商品列表查询
   * Summary: 链上商品列表查询
   */
  async pagequeryGoodsEx(request: PagequeryGoodsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryGoodsResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryGoodsResponse>(await this.doRequest("1.0", "antchain.goodschain.goods.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryGoodsResponse({}));
  }

  /**
   * Description: 自定义链上商品操作节点
   * Summary: 自定义链上商品操作节点
   */
  async createGoodsOperate(request: CreateGoodsOperateRequest): Promise<CreateGoodsOperateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createGoodsOperateEx(request, headers, runtime);
  }

  /**
   * Description: 自定义链上商品操作节点
   * Summary: 自定义链上商品操作节点
   */
  async createGoodsOperateEx(request: CreateGoodsOperateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateGoodsOperateResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateGoodsOperateResponse>(await this.doRequest("1.0", "antchain.goodschain.goods.operate.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateGoodsOperateResponse({}));
  }

  /**
   * Description: 商品交收核销
   * Summary: 商品交收核销
   */
  async cancelGoods(request: CancelGoodsRequest): Promise<CancelGoodsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelGoodsEx(request, headers, runtime);
  }

  /**
   * Description: 商品交收核销
   * Summary: 商品交收核销
   */
  async cancelGoodsEx(request: CancelGoodsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelGoodsResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelGoodsResponse>(await this.doRequest("1.0", "antchain.goodschain.goods.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelGoodsResponse({}));
  }

  /**
   * Description: 商品异常处置
   * Summary: 商品异常处置
   */
  async disableGoods(request: DisableGoodsRequest): Promise<DisableGoodsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.disableGoodsEx(request, headers, runtime);
  }

  /**
   * Description: 商品异常处置
   * Summary: 商品异常处置
   */
  async disableGoodsEx(request: DisableGoodsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DisableGoodsResponse> {
    Util.validateModel(request);
    return $tea.cast<DisableGoodsResponse>(await this.doRequest("1.0", "antchain.goodschain.goods.disable", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DisableGoodsResponse({}));
  }

  /**
   * Description: 获取健康码、核酸、疫苗、行程码等信息
   * Summary: 获取健康码、核酸、疫苗、行程码等信息
   */
  async getHealthcode(request: GetHealthcodeRequest): Promise<GetHealthcodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getHealthcodeEx(request, headers, runtime);
  }

  /**
   * Description: 获取健康码、核酸、疫苗、行程码等信息
   * Summary: 获取健康码、核酸、疫苗、行程码等信息
   */
  async getHealthcodeEx(request: GetHealthcodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetHealthcodeResponse> {
    Util.validateModel(request);
    return $tea.cast<GetHealthcodeResponse>(await this.doRequest("1.0", "antchain.goodschain.healthcode.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetHealthcodeResponse({}));
  }

}
