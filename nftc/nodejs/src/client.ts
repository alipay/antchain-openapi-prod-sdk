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

// 数字人部件素材对象
export class AvatarMaterialDTO extends $tea.Model {
  // json配置
  json: string;
  // 装扮id
  decoId: string;
  // 装扮名称
  decoName: string;
  // webGl ab包地址
  webAbUrl: string;
  // 贴图文件配置
  textureUrl: string;
  // 缩略图
  thumbnail: string;
  // json字符串，装扮额外属性信息
  // 如自定义头发颜色，性别等
  avatarPvJson: string;
  // 安卓ab包
  androidAbUrl: string;
  // IOS AB 包
  iosAbUrl: string;
  // 法令贴图文件
  falingTextureUrl: string;
  static names(): { [key: string]: string } {
    return {
      json: 'json',
      decoId: 'deco_id',
      decoName: 'deco_name',
      webAbUrl: 'web_ab_url',
      textureUrl: 'texture_url',
      thumbnail: 'thumbnail',
      avatarPvJson: 'avatar_pv_json',
      androidAbUrl: 'android_ab_url',
      iosAbUrl: 'ios_ab_url',
      falingTextureUrl: 'faling_texture_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      json: 'string',
      decoId: 'string',
      decoName: 'string',
      webAbUrl: 'string',
      textureUrl: 'string',
      thumbnail: 'string',
      avatarPvJson: 'string',
      androidAbUrl: 'string',
      iosAbUrl: 'string',
      falingTextureUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单商品对象
export class ExternalOrderItemDTO extends $tea.Model {
  // 购买的sku id
  skuId: number;
  // 购买后对应发放的藏品nftId，仅当orderStatus为FINISH时返回
  nftId: string;
  static names(): { [key: string]: string } {
    return {
      skuId: 'sku_id',
      nftId: 'nft_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      skuId: 'number',
      nftId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 通用资源差量包信息
export class GeneralResourcePatch extends $tea.Model {
  // 差量包文件下载地址
  url: string;
  // 差量包的旧版本号
  oldVersion: number;
  // md5摘要值
  md5: string;
  // 差量包文件大小
  size: number;
  static names(): { [key: string]: string } {
    return {
      url: 'url',
      oldVersion: 'old_version',
      md5: 'md5',
      size: 'size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      url: 'string',
      oldVersion: 'number',
      md5: 'string',
      size: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 外部订单对象
export class ExternalOrderDTO extends $tea.Model {
  // 订单的状态
  // PAID 已支付
  // PENDING 待支付
  // NOT_EXIST 不存在
  orderStatus: string;
  // 只有在PAID状态下，此字段才会有值
  // 由于当前一笔订单只会购买一个资产，因此当前list中只会有一个值
  orderItemList?: ExternalOrderItemDTO[];
  static names(): { [key: string]: string } {
    return {
      orderStatus: 'order_status',
      orderItemList: 'order_item_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderStatus: 'string',
      orderItemList: { 'type': 'array', 'itemType': ExternalOrderItemDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数字人整体形象
export class AvatarDTO extends $tea.Model {
  // 数字人基础脸部模型
  avatarFaceUrl: string;
  // 数字人基础脸部Json配置
  avatarFaceJson: string;
  // 上衣配置
  upcloth: AvatarMaterialDTO;
  // 下衣配置
  downcloth: AvatarMaterialDTO;
  // 鞋子配置
  shoe: AvatarMaterialDTO;
  // 套装配置
  suit: AvatarMaterialDTO;
  // 项链配置
  necklace: AvatarMaterialDTO;
  // 帽子配置
  hat: AvatarMaterialDTO;
  // 眼镜配置
  glass: AvatarMaterialDTO;
  // 头发配置
  hair: AvatarMaterialDTO;
  // 脸型配置
  head: AvatarMaterialDTO;
  // 眉毛配置
  eyebrow: AvatarMaterialDTO;
  // 眼睛配置
  eye: AvatarMaterialDTO;
  // 嘴巴配置
  lip: AvatarMaterialDTO;
  // 鼻子配置
  nose: AvatarMaterialDTO;
  // 腮红配置
  rouge: AvatarMaterialDTO;
  // 美瞳配置
  lens: AvatarMaterialDTO;
  // 睫毛配置
  eyelash: AvatarMaterialDTO;
  // 唇妆配置
  lipstick: AvatarMaterialDTO;
  // 眼线配置
  eyeliner: AvatarMaterialDTO;
  // 眼影配置
  eyeshadow: AvatarMaterialDTO;
  // webgl ab包链接
  avatarWebGlUnityBodyUrl: string;
  // ios ab包链接
  avatarIosUnityBodyUrl: string;
  // android ab包链接
  avatarAndroidUnityBodyUrl: string;
  // 默认Unity配置
  defaultUnityConfig: string;
  // 袜子配置
  sock: AvatarMaterialDTO;
  // 背持配置
  backpack: AvatarMaterialDTO;
  // 手部配置
  hand: AvatarMaterialDTO;
  // 耳环配置
  earring: AvatarMaterialDTO;
  static names(): { [key: string]: string } {
    return {
      avatarFaceUrl: 'avatar_face_url',
      avatarFaceJson: 'avatar_face_json',
      upcloth: 'upcloth',
      downcloth: 'downcloth',
      shoe: 'shoe',
      suit: 'suit',
      necklace: 'necklace',
      hat: 'hat',
      glass: 'glass',
      hair: 'hair',
      head: 'head',
      eyebrow: 'eyebrow',
      eye: 'eye',
      lip: 'lip',
      nose: 'nose',
      rouge: 'rouge',
      lens: 'lens',
      eyelash: 'eyelash',
      lipstick: 'lipstick',
      eyeliner: 'eyeliner',
      eyeshadow: 'eyeshadow',
      avatarWebGlUnityBodyUrl: 'avatar_web_gl_unity_body_url',
      avatarIosUnityBodyUrl: 'avatar_ios_unity_body_url',
      avatarAndroidUnityBodyUrl: 'avatar_android_unity_body_url',
      defaultUnityConfig: 'default_unity_config',
      sock: 'sock',
      backpack: 'backpack',
      hand: 'hand',
      earring: 'earring',
    };
  }

  static types(): { [key: string]: any } {
    return {
      avatarFaceUrl: 'string',
      avatarFaceJson: 'string',
      upcloth: AvatarMaterialDTO,
      downcloth: AvatarMaterialDTO,
      shoe: AvatarMaterialDTO,
      suit: AvatarMaterialDTO,
      necklace: AvatarMaterialDTO,
      hat: AvatarMaterialDTO,
      glass: AvatarMaterialDTO,
      hair: AvatarMaterialDTO,
      head: AvatarMaterialDTO,
      eyebrow: AvatarMaterialDTO,
      eye: AvatarMaterialDTO,
      lip: AvatarMaterialDTO,
      nose: AvatarMaterialDTO,
      rouge: AvatarMaterialDTO,
      lens: AvatarMaterialDTO,
      eyelash: AvatarMaterialDTO,
      lipstick: AvatarMaterialDTO,
      eyeliner: AvatarMaterialDTO,
      eyeshadow: AvatarMaterialDTO,
      avatarWebGlUnityBodyUrl: 'string',
      avatarIosUnityBodyUrl: 'string',
      avatarAndroidUnityBodyUrl: 'string',
      defaultUnityConfig: 'string',
      sock: AvatarMaterialDTO,
      backpack: AvatarMaterialDTO,
      hand: AvatarMaterialDTO,
      earring: AvatarMaterialDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户资产
// 
export class UserAsset extends $tea.Model {
  // NFT商品的商品编码
  skuId: number;
  // NFT资产的唯一编码
  nftId: string;
  // NFT商品的名称
  skuName: string;
  // NFT的创作者名称
  authorName: string;
  // NFT的发行方名称
  issuerName: string;
  // 缩略图url
  miniImagePath: string;
  static names(): { [key: string]: string } {
    return {
      skuId: 'sku_id',
      nftId: 'nft_id',
      skuName: 'sku_name',
      authorName: 'author_name',
      issuerName: 'issuer_name',
      miniImagePath: 'mini_image_path',
    };
  }

  static types(): { [key: string]: any } {
    return {
      skuId: 'number',
      nftId: 'string',
      skuName: 'string',
      authorName: 'string',
      issuerName: 'string',
      miniImagePath: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAsoDistinctRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // App ID
  appid: string;
  // 苹果设备的 IDFA
  idfa: string;
  // 渠道标识(默认 qimai )
  source?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appid: 'appid',
      idfa: 'idfa',
      source: 'source',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appid: 'string',
      idfa: 'string',
      source: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAsoDistinctResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否激活
  // -1: 失败; 0: 未激活; 1:已激活
  idfa?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      idfa: 'idfa',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      idfa: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitAsoClickRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // App ID
  appid: string;
  // 苹果设备的 IDFA
  idfa: string;
  // 用户终端的公网IP地址
  ip: string;
  // 用户代理(User Agent)
  ua: string;
  // 渠道标识(默认 qimai )
  source?: string;
  // urlencode后的回调地址
  callback: string;
  // 手机型号 iphone10,3
  model?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appid: 'appid',
      idfa: 'idfa',
      ip: 'ip',
      ua: 'ua',
      source: 'source',
      callback: 'callback',
      model: 'model',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appid: 'string',
      idfa: 'string',
      ip: 'string',
      ua: 'string',
      source: 'string',
      callback: 'string',
      model: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SubmitAsoClickResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功 0: 失败; 1:成功
  result?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAvatarProfileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 在antchain.nftc.oauth.token.apply接口内获取到的AccessToken，带过期时间，可唯一确定当前用户
  accessToken: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accessToken: 'access_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accessToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAvatarProfileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数字人整体形象数据
  avatarInfo?: AvatarDTO;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      avatarInfo: 'avatar_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      avatarInfo: AvatarDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPromoteActivityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 助力活动的活动规则编码
  promoteId: string;
  // 用户授权token
  accessToken: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      promoteId: 'promote_id',
      accessToken: 'access_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      promoteId: 'string',
      accessToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPromoteActivityResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 助力活动的活动规则编码
  promoteId?: string;
  // 活动状态：
  // ENABLE（进行中）
  // END（活动结束）
  status?: string;
  // 助力活动类型
  // ONCE（生命周期内一次）
  // DAILY（每日一次）
  type?: string;
  // 活动开始时间
  startTime?: string;
  // 活动结束时间
  endTime?: string;
  // 最大助力人数
  maxNum?: number;
  // 当前助力成功人数
  curNum?: number;
  // 参与助力的唯一编码，供三方幂等记录并唯一发奖
  promoteList?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      promoteId: 'promote_id',
      status: 'status',
      type: 'type',
      startTime: 'start_time',
      endTime: 'end_time',
      maxNum: 'max_num',
      curNum: 'cur_num',
      promoteList: 'promote_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      promoteId: 'string',
      status: 'string',
      type: 'string',
      startTime: 'string',
      endTime: 'string',
      maxNum: 'number',
      curNum: 'number',
      promoteList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetPromoteShareurlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 助力活动的活动规则编码
  promoteId: string;
  // 用户授权token
  accessToken: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      promoteId: 'promote_id',
      accessToken: 'access_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      promoteId: 'string',
      accessToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetPromoteShareurlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 经处理过的分享落地页面的链接，该落地页面由鲸探实现
  shareUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      shareUrl: 'share_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      shareUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmTaskRewardRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 鲸探用户唯一标识
  openUserId: string;
  // 前置通过消息获取的奖励流水唯—id(可用作幂等键，详情看下文的奖励消息通知)
  rewardRecordId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      openUserId: 'open_user_id',
      rewardRecordId: 'reward_record_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      openUserId: 'string',
      rewardRecordId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmTaskRewardResponse extends $tea.Model {
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

export class ApplyOauthTokenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权方式。支持：
  // 1.authorization_code，表示换取使用用户授权码code换取授权令牌access_token。
  // 2.refresh_token，表示使用refresh_token刷新获取新授权令牌。
  // refresh_token本期新增
  grantType: string;
  // 刷新令牌，上次换取访问令牌时得到。本参数在 grant_type 为 authorization_code 时不填；为 refresh_token 时必填；
  refreshToken?: string;
  // 授权码，用户对应用授权后得到。本参数在 grant_type 为 authorization_code 时必填，为 refresh_token 时不填
  authCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      grantType: 'grant_type',
      refreshToken: 'refresh_token',
      authCode: 'auth_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      grantType: 'string',
      refreshToken: 'string',
      authCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyOauthTokenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 虚拟uid
  openUserId?: string;
  // 后续调用接口健全的token，有效期30天
  accessToken?: string;
  // accessToken到期时间
  expireTime?: string;
  // 刷新token，有效期90天
  refreshToken?: string;
  // refreshToken到期时间
  refreshExpireTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      openUserId: 'open_user_id',
      accessToken: 'access_token',
      expireTime: 'expire_time',
      refreshToken: 'refresh_token',
      refreshExpireTime: 'refresh_expire_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      openUserId: 'string',
      accessToken: 'string',
      expireTime: 'string',
      refreshToken: 'string',
      refreshExpireTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOauthUserinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // accessToken请求
  accessToken: string;
  // 查询信息范围,user_base_info-查询头像、昵称
  scope?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accessToken: 'access_token',
      scope: 'scope',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accessToken: 'string',
      scope: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOauthUserinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 昵称
  nickName?: string;
  // 头像链接
  avatar?: string;
  // 用户id
  openUserId?: string;
  // 租户下用户id
  tenantUid?: string;
  // 用户手机号
  phone?: string;
  // 0-未实名; 1-已实名
  isRealNameVerified?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      nickName: 'nick_name',
      avatar: 'avatar',
      openUserId: 'open_user_id',
      tenantUid: 'tenant_uid',
      phone: 'phone',
      isRealNameVerified: 'is_real_name_verified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      nickName: 'string',
      avatar: 'string',
      openUserId: 'string',
      tenantUid: 'string',
      phone: 'string',
      isRealNameVerified: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyOauthUserinfotokenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // accessToken请求
  accessToken: string;
  // 拉起页面的场景
  // nft_details 订单详情页
  // oauth_page 授权登陆页
  pageTokenScene: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accessToken: 'access_token',
      pageTokenScene: 'page_token_scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accessToken: 'string',
      pageTokenScene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyOauthUserinfotokenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户token，有效期5分钟
  userInfoToken?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      userInfoToken: 'user_info_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      userInfoToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOauthRealnameinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // token
  accessToken: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accessToken: 'access_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accessToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOauthRealnameinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实名
  realName?: string;
  // 身份证编号
  idCard?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      realName: 'real_name',
      idCard: 'id_card',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      realName: 'string',
      idCard: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendSmsMessageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 短信模版Id
  templateId: string;
  // 手机号
  phone: string;
  // 参数键值对
  templateArgs: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      templateId: 'template_id',
      phone: 'phone',
      templateArgs: 'template_args',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      templateId: 'string',
      phone: 'string',
      templateArgs: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendSmsMessageResponse extends $tea.Model {
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

export class PublishMerchantDiyskuRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务请求id，用来做业务上的幂等。后面查询状态也是此字段
  bizNo: string;
  // 调用渠道
  // PET 宠物
  // MEMBER 会员
  channel: string;
  // 领取数字藏品的用户ID，支持2088/手机号/1322
  userId: string;
  // 支付宝2088账号：ALIPAY_UID
  // 手机号：PHONE_NO
  // 鲸探1322账号：FANS_UID
  userType: string;
  // 需要发放的SKUID编码
  skuId: string;
  // 一期仅支持图片：IMAGE
  skuType: string;
  // 数字藏品的缩略图地址，可与原图相同也可不同，需要校验长宽比为1:1
  thumbnailUrl: string;
  // 数字藏品的原图地址，需要校验长宽比为1:1
  originalUrl: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizNo: 'biz_no',
      channel: 'channel',
      userId: 'user_id',
      userType: 'user_type',
      skuId: 'sku_id',
      skuType: 'sku_type',
      thumbnailUrl: 'thumbnail_url',
      originalUrl: 'original_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizNo: 'string',
      channel: 'string',
      userId: 'string',
      userType: 'string',
      skuId: 'string',
      skuType: 'string',
      thumbnailUrl: 'string',
      originalUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishMerchantDiyskuResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 生成的nftid结果
  nftId?: string;
  // 获得时间
  receiveTime?: string;
  // 发放状态
  // AUDIT_SUBMIT("审核中"),
  // AUDIT_SUCCESS("审核通过"),
  // AUDIT_FAIL("审核未通过"),
  // TRANSFER_UNKNOWN("发放结果未知"),
  // TRANSFER_SUCCESS("发放成功"),
  // TRANSFER_FAILED("发放失败"),
  // SHIELD("屏蔽"),
  // RECYCLE("回收"),
  sendStatus?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      nftId: 'nft_id',
      receiveTime: 'receive_time',
      sendStatus: 'send_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      nftId: 'string',
      receiveTime: 'string',
      sendStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMerchantDiyskuRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务请求id，用来做业务上的幂等
  bizNo: string;
  // 领取数字藏品的用户ID，支持2088/手机号/1322
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizNo: 'biz_no',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizNo: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMerchantDiyskuResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 生成的nftid结果
  nftId?: string;
  // 获得时间
  receiveTime?: string;
  // 发放状态
  // AUDIT_SUBMIT("审核中"),
  // AUDIT_SUCCESS("审核通过"),
  // AUDIT_FAIL("审核未通过"),
  // TRANSFER_UNKNOWN("发放结果未知"),
  // TRANSFER_SUCCESS("发放成功"),
  // TRANSFER_FAILED("发放失败"),
  // SHIELD("屏蔽"),
  // RECYCLE("回收"),
  sendStatus?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      nftId: 'nft_id',
      receiveTime: 'receive_time',
      sendStatus: 'send_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      nftId: 'string',
      receiveTime: 'string',
      sendStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMerchantUgcimagesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // ugc资产铸造记录id列表
  recordIdList: string[];
  // 场景
  bizScene: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      recordIdList: 'record_id_list',
      bizScene: 'biz_scene',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      recordIdList: { 'type': 'array', 'itemType': 'string' },
      bizScene: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMerchantUgcimagesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 入参中id对应的图片列表
  imgList?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      imgList: 'img_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      imgList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyNftTransferRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 藏品标识sku
  skuId: number;
  // 被转入用户的支付宝uid和手机号
  toIdNo: string;
  // 参照idType枚举
  toIdType: string;
  // 用户购买价格，可以为0，单位分
  priceCent: number;
  // 用户在商户购买的订单号
  orderNo: string;
  // 调用方渠道租户，传租户id即可
  channelTenant: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      skuId: 'sku_id',
      toIdNo: 'to_id_no',
      toIdType: 'to_id_type',
      priceCent: 'price_cent',
      orderNo: 'order_no',
      channelTenant: 'channel_tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      skuId: 'number',
      toIdNo: 'string',
      toIdType: 'string',
      priceCent: 'number',
      orderNo: 'string',
      channelTenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyNftTransferResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 标识一类NFT
  skuId?: number;
  // 流转的nftId
  nftId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      skuId: 'sku_id',
      nftId: 'nft_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      skuId: 'number',
      nftId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryNftCustomerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 页码
  page: number;
  // 分页大小-上限10
  pageSize: number;
  // 用户标识
  idNo: string;
  // 用户id类型
  idType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      page: 'page',
      pageSize: 'page_size',
      idNo: 'id_no',
      idType: 'id_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      page: 'number',
      pageSize: 'number',
      idNo: 'string',
      idType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryNftCustomerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 页码，查询时传入
  page?: number;
  // 页长，查询时传入
  pageSize?: number;
  // 列表总数
  totalCount?: number;
  // 用户资产列表
  assetList?: UserAsset[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      page: 'page',
      pageSize: 'page_size',
      totalCount: 'total_count',
      assetList: 'asset_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      page: 'number',
      pageSize: 'number',
      totalCount: 'number',
      assetList: { 'type': 'array', 'itemType': UserAsset },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryNftOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务方侧唯一业务单号
  bizNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizNo: 'biz_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryNftOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单状态
  externalOrder?: ExternalOrderDTO;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      externalOrder: 'external_order',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      externalOrder: ExternalOrderDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryNftAssetbyskuRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 具体用户Id标识，支持不同类型的id标识，根据toIdType不同而不同
  idNo: string;
  // 参照idType枚举，支持手机号/openUserId
  idType: string;
  // 数字藏品类标识ID
  skuId: string;
  // 页码，从1开始
  page: number;
  // 分页大小-上限10
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      idNo: 'id_no',
      idType: 'id_type',
      skuId: 'sku_id',
      page: 'page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      idNo: 'string',
      idType: 'string',
      skuId: 'string',
      page: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryNftAssetbyskuResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户资产列表
  assetList?: UserAsset[];
  // 总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      assetList: 'asset_list',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      assetList: { 'type': 'array', 'itemType': UserAsset },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckNftAssetbyskuRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 鲸探用户ID标识，OpenApi场景使用的加密格式
  openUserId: string;
  // 数字藏品类标识ID
  skuId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      openUserId: 'open_user_id',
      skuId: 'sku_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      openUserId: 'string',
      skuId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckNftAssetbyskuResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否已拥有对应sku的nft
  hasOwn?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      hasOwn: 'has_own',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      hasOwn: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendPromoPrizeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 鲸探用户唯一标识
  openUserId: string;
  // 海豚活动ID，鲸探运营在海豚创建的活动ID
  campId: string;
  // 海豚奖品ID，鲸探运营在海豚创建的奖品ID
  prizeId: string;
  // 调用方唯一幂等号
  bizNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      openUserId: 'open_user_id',
      campId: 'camp_id',
      prizeId: 'prize_id',
      bizNo: 'biz_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      openUserId: 'string',
      campId: 'string',
      prizeId: 'string',
      bizNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendPromoPrizeResponse extends $tea.Model {
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

export class CreateResourceGeneralresourceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 小程序的APP ID
  appId: string;
  // 业务幂等ID
  bizId: string;
  // 是否需要生成差量包
  needPatch: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appId: 'app_id',
      bizId: 'biz_id',
      needPatch: 'need_patch',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appId: 'string',
      bizId: 'string',
      needPatch: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateResourceGeneralresourceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 资源ID
  resourceId?: string;
  // 文件上传地址
  url?: string;
  // 资源上传的授权token，上传文件时需要将该值放入header中进行鉴权
  maasToken?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resourceId: 'resource_id',
      url: 'url',
      maasToken: 'maas_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resourceId: 'string',
      url: 'string',
      maasToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindResourceGeneralresourcefileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 小程序的APP ID
  appId: string;
  // 资源ID
  resourceId: string;
  // 文件ID
  fileId: string;
  // 文件状态
  status?: string;
  // 业务自定义的文本版本号
  bizVersion?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appId: 'app_id',
      resourceId: 'resource_id',
      fileId: 'file_id',
      status: 'status',
      bizVersion: 'biz_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appId: 'string',
      resourceId: 'string',
      fileId: 'string',
      status: 'string',
      bizVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindResourceGeneralresourcefileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 版本号
  version?: number;
  // 文件下载地址
  url?: string;
  // md5摘要值
  md5?: string;
  // 文件大小
  size?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      version: 'version',
      url: 'url',
      md5: 'md5',
      size: 'size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      version: 'number',
      url: 'string',
      md5: 'string',
      size: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishResourceGeneralresourcefileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 小程序的APP ID
  appId: string;
  // 业务幂等ID
  bizId: string;
  // 资源ID
  resourceId: string;
  // 版本号
  fileVersion: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appId: 'app_id',
      bizId: 'biz_id',
      resourceId: 'resource_id',
      fileVersion: 'file_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appId: 'string',
      bizId: 'string',
      resourceId: 'string',
      fileVersion: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishResourceGeneralresourcefileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 版本号
  version?: number;
  // 资源文件下载地址
  url?: string;
  // md5摘要值
  md5?: string;
  // 文件大小
  size?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      version: 'version',
      url: 'url',
      md5: 'md5',
      size: 'size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      version: 'number',
      url: 'string',
      md5: 'string',
      size: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryResourcePatchlistRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 小程序的APP ID
  appId: string;
  // 资源ID
  resourceId: string;
  // 版本号
  fileVersion: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appId: 'app_id',
      resourceId: 'resource_id',
      fileVersion: 'file_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appId: 'string',
      resourceId: 'string',
      fileVersion: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryResourcePatchlistResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 差量包生成状态，包括PATCHING（生成中）和FINISHED（生成完成）
  patchStatus?: string;
  // 全量包下载地址
  url?: string;
  // 资源ID
  resourceId?: string;
  // 全量包版本号
  version?: number;
  // 全量包md5摘要值
  md5?: string;
  // 全量包文件大小
  size?: number;
  // 差量包文件信息列表
  patchList?: GeneralResourcePatch[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      patchStatus: 'patch_status',
      url: 'url',
      resourceId: 'resource_id',
      version: 'version',
      md5: 'md5',
      size: 'size',
      patchList: 'patch_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      patchStatus: 'string',
      url: 'string',
      resourceId: 'string',
      version: 'number',
      md5: 'string',
      size: 'number',
      patchList: { 'type': 'array', 'itemType': GeneralResourcePatch },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyResourceFiletokenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // Token类型
  tokenType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tokenType: 'token_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tokenType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyResourceFiletokenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 临时token信息
  massToken?: string;
  // 上传地址
  url?: string;
  // afts-appid
  appId?: string;
  // afts-bizkey
  bizKey?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      massToken: 'mass_token',
      url: 'url',
      appId: 'app_id',
      bizKey: 'biz_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      massToken: 'string',
      url: 'string',
      appId: 'string',
      bizKey: 'string',
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
          sdk_version: "1.0.30",
          _prod_code: "NFTC",
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
   * Description: ASO排重
   * Summary: ASO排重
   */
  async queryAsoDistinct(request: QueryAsoDistinctRequest): Promise<QueryAsoDistinctResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAsoDistinctEx(request, headers, runtime);
  }

  /**
   * Description: ASO排重
   * Summary: ASO排重
   */
  async queryAsoDistinctEx(request: QueryAsoDistinctRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAsoDistinctResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAsoDistinctResponse>(await this.doRequest("1.0", "antchain.nftc.aso.distinct.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAsoDistinctResponse({}));
  }

  /**
   * Description: ASO点击
   * Summary: ASO点击
   */
  async submitAsoClick(request: SubmitAsoClickRequest): Promise<SubmitAsoClickResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.submitAsoClickEx(request, headers, runtime);
  }

  /**
   * Description: ASO点击
   * Summary: ASO点击
   */
  async submitAsoClickEx(request: SubmitAsoClickRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SubmitAsoClickResponse> {
    Util.validateModel(request);
    return $tea.cast<SubmitAsoClickResponse>(await this.doRequest("1.0", "antchain.nftc.aso.click.submit", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SubmitAsoClickResponse({}));
  }

  /**
   * Description: 获取当前用户的数字人形象，进而在NBA空间内进行渲染
   * Summary: 查询当前数字人形象
   */
  async queryAvatarProfile(request: QueryAvatarProfileRequest): Promise<QueryAvatarProfileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAvatarProfileEx(request, headers, runtime);
  }

  /**
   * Description: 获取当前用户的数字人形象，进而在NBA空间内进行渲染
   * Summary: 查询当前数字人形象
   */
  async queryAvatarProfileEx(request: QueryAvatarProfileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAvatarProfileResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAvatarProfileResponse>(await this.doRequest("1.0", "antchain.nftc.avatar.profile.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAvatarProfileResponse({}));
  }

  /**
   * Description: 根据活动编码以及用户的openUid查询用户当前助力活动的状态以及进度
   * Summary: 查询用户助力活动信息
   */
  async queryPromoteActivity(request: QueryPromoteActivityRequest): Promise<QueryPromoteActivityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPromoteActivityEx(request, headers, runtime);
  }

  /**
   * Description: 根据活动编码以及用户的openUid查询用户当前助力活动的状态以及进度
   * Summary: 查询用户助力活动信息
   */
  async queryPromoteActivityEx(request: QueryPromoteActivityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPromoteActivityResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPromoteActivityResponse>(await this.doRequest("1.0", "antchain.nftc.promote.activity.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPromoteActivityResponse({}));
  }

  /**
   * Description: 根据活动编码以及用户的openUid发起助力，获取分享的url链接
   * Summary: 发起助力分享
   */
  async getPromoteShareurl(request: GetPromoteShareurlRequest): Promise<GetPromoteShareurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getPromoteShareurlEx(request, headers, runtime);
  }

  /**
   * Description: 根据活动编码以及用户的openUid发起助力，获取分享的url链接
   * Summary: 发起助力分享
   */
  async getPromoteShareurlEx(request: GetPromoteShareurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetPromoteShareurlResponse> {
    Util.validateModel(request);
    return $tea.cast<GetPromoteShareurlResponse>(await this.doRequest("1.0", "antchain.nftc.promote.shareurl.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetPromoteShareurlResponse({}));
  }

  /**
   * Description: 确认奖励到账
   * Summary: 确认奖励到账
   */
  async confirmTaskReward(request: ConfirmTaskRewardRequest): Promise<ConfirmTaskRewardResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmTaskRewardEx(request, headers, runtime);
  }

  /**
   * Description: 确认奖励到账
   * Summary: 确认奖励到账
   */
  async confirmTaskRewardEx(request: ConfirmTaskRewardRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmTaskRewardResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmTaskRewardResponse>(await this.doRequest("1.0", "antchain.nftc.task.reward.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmTaskRewardResponse({}));
  }

  /**
   * Description: authcode换取token
   * Summary: authcode换取token
   */
  async applyOauthToken(request: ApplyOauthTokenRequest): Promise<ApplyOauthTokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyOauthTokenEx(request, headers, runtime);
  }

  /**
   * Description: authcode换取token
   * Summary: authcode换取token
   */
  async applyOauthTokenEx(request: ApplyOauthTokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyOauthTokenResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyOauthTokenResponse>(await this.doRequest("1.0", "antchain.nftc.oauth.token.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyOauthTokenResponse({}));
  }

  /**
   * Description: token获取头像/昵称
   * Summary: token获取头像/昵称
   */
  async queryOauthUserinfo(request: QueryOauthUserinfoRequest): Promise<QueryOauthUserinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryOauthUserinfoEx(request, headers, runtime);
  }

  /**
   * Description: token获取头像/昵称
   * Summary: token获取头像/昵称
   */
  async queryOauthUserinfoEx(request: QueryOauthUserinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryOauthUserinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryOauthUserinfoResponse>(await this.doRequest("1.0", "antchain.nftc.oauth.userinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryOauthUserinfoResponse({}));
  }

  /**
   * Description: 获取用户Token
   * Summary: 获取用户Token
   */
  async applyOauthUserinfotoken(request: ApplyOauthUserinfotokenRequest): Promise<ApplyOauthUserinfotokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyOauthUserinfotokenEx(request, headers, runtime);
  }

  /**
   * Description: 获取用户Token
   * Summary: 获取用户Token
   */
  async applyOauthUserinfotokenEx(request: ApplyOauthUserinfotokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyOauthUserinfotokenResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyOauthUserinfotokenResponse>(await this.doRequest("1.0", "antchain.nftc.oauth.userinfotoken.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyOauthUserinfotokenResponse({}));
  }

  /**
   * Description: token获取实名信息
   * Summary: token获取实名认证信息
   */
  async queryOauthRealnameinfo(request: QueryOauthRealnameinfoRequest): Promise<QueryOauthRealnameinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryOauthRealnameinfoEx(request, headers, runtime);
  }

  /**
   * Description: token获取实名信息
   * Summary: token获取实名认证信息
   */
  async queryOauthRealnameinfoEx(request: QueryOauthRealnameinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryOauthRealnameinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryOauthRealnameinfoResponse>(await this.doRequest("1.0", "antchain.nftc.oauth.realnameinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryOauthRealnameinfoResponse({}));
  }

  /**
   * Description: 短信发送
   * Summary: 短信发送
   */
  async sendSmsMessage(request: SendSmsMessageRequest): Promise<SendSmsMessageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendSmsMessageEx(request, headers, runtime);
  }

  /**
   * Description: 短信发送
   * Summary: 短信发送
   */
  async sendSmsMessageEx(request: SendSmsMessageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendSmsMessageResponse> {
    Util.validateModel(request);
    return $tea.cast<SendSmsMessageResponse>(await this.doRequest("1.0", "antchain.nftc.sms.message.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendSmsMessageResponse({}));
  }

  /**
   * Description: DIY藏品发放
   * Summary: DIY藏品发放
   */
  async publishMerchantDiysku(request: PublishMerchantDiyskuRequest): Promise<PublishMerchantDiyskuResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.publishMerchantDiyskuEx(request, headers, runtime);
  }

  /**
   * Description: DIY藏品发放
   * Summary: DIY藏品发放
   */
  async publishMerchantDiyskuEx(request: PublishMerchantDiyskuRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PublishMerchantDiyskuResponse> {
    Util.validateModel(request);
    return $tea.cast<PublishMerchantDiyskuResponse>(await this.doRequest("1.0", "antchain.nftc.merchant.diysku.publish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PublishMerchantDiyskuResponse({}));
  }

  /**
   * Description: DIY藏品发放查询
   * Summary: DIY藏品发放查询
   */
  async queryMerchantDiysku(request: QueryMerchantDiyskuRequest): Promise<QueryMerchantDiyskuResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMerchantDiyskuEx(request, headers, runtime);
  }

  /**
   * Description: DIY藏品发放查询
   * Summary: DIY藏品发放查询
   */
  async queryMerchantDiyskuEx(request: QueryMerchantDiyskuRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMerchantDiyskuResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMerchantDiyskuResponse>(await this.doRequest("1.0", "antchain.nftc.merchant.diysku.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMerchantDiyskuResponse({}));
  }

  /**
   * Description: 提供ISV  ugc铸造图片查询的openapi服务
   * Summary: ugc铸造图片查询的openapi接口
   */
  async queryMerchantUgcimages(request: QueryMerchantUgcimagesRequest): Promise<QueryMerchantUgcimagesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMerchantUgcimagesEx(request, headers, runtime);
  }

  /**
   * Description: 提供ISV  ugc铸造图片查询的openapi服务
   * Summary: ugc铸造图片查询的openapi接口
   */
  async queryMerchantUgcimagesEx(request: QueryMerchantUgcimagesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMerchantUgcimagesResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMerchantUgcimagesResponse>(await this.doRequest("1.0", "antchain.nftc.merchant.ugcimages.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMerchantUgcimagesResponse({}));
  }

  /**
   * Description: 租户根据sku给用户发放藏品
   * Summary: 发放藏品
   */
  async applyNftTransfer(request: ApplyNftTransferRequest): Promise<ApplyNftTransferResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyNftTransferEx(request, headers, runtime);
  }

  /**
   * Description: 租户根据sku给用户发放藏品
   * Summary: 发放藏品
   */
  async applyNftTransferEx(request: ApplyNftTransferRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyNftTransferResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyNftTransferResponse>(await this.doRequest("1.0", "antchain.nftc.nft.transfer.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyNftTransferResponse({}));
  }

  /**
   * Description: 调用租户分页查询用户该租户发行的sku的资产
   * Summary: 查询藏品
   */
  async pagequeryNftCustomer(request: PagequeryNftCustomerRequest): Promise<PagequeryNftCustomerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryNftCustomerEx(request, headers, runtime);
  }

  /**
   * Description: 调用租户分页查询用户该租户发行的sku的资产
   * Summary: 查询藏品
   */
  async pagequeryNftCustomerEx(request: PagequeryNftCustomerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryNftCustomerResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryNftCustomerResponse>(await this.doRequest("1.0", "antchain.nftc.nft.customer.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryNftCustomerResponse({}));
  }

  /**
   * Description: 查询支付结果
   * Summary: 查询支付结果
   */
  async queryNftOrder(request: QueryNftOrderRequest): Promise<QueryNftOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryNftOrderEx(request, headers, runtime);
  }

  /**
   * Description: 查询支付结果
   * Summary: 查询支付结果
   */
  async queryNftOrderEx(request: QueryNftOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryNftOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryNftOrderResponse>(await this.doRequest("1.0", "antchain.nftc.nft.order.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryNftOrderResponse({}));
  }

  /**
   * Description: 根据skuId维度查询藏品
   * Summary: 根据skuId维度查询藏品
   */
  async queryNftAssetbysku(request: QueryNftAssetbyskuRequest): Promise<QueryNftAssetbyskuResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryNftAssetbyskuEx(request, headers, runtime);
  }

  /**
   * Description: 根据skuId维度查询藏品
   * Summary: 根据skuId维度查询藏品
   */
  async queryNftAssetbyskuEx(request: QueryNftAssetbyskuRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryNftAssetbyskuResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryNftAssetbyskuResponse>(await this.doRequest("1.0", "antchain.nftc.nft.assetbysku.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryNftAssetbyskuResponse({}));
  }

  /**
   * Description: 根据skuId维度校验藏品是否已拥有
   * Summary: 根据skuId维度校验藏品是否已拥有
   */
  async checkNftAssetbysku(request: CheckNftAssetbyskuRequest): Promise<CheckNftAssetbyskuResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkNftAssetbyskuEx(request, headers, runtime);
  }

  /**
   * Description: 根据skuId维度校验藏品是否已拥有
   * Summary: 根据skuId维度校验藏品是否已拥有
   */
  async checkNftAssetbyskuEx(request: CheckNftAssetbyskuRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckNftAssetbyskuResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckNftAssetbyskuResponse>(await this.doRequest("1.0", "antchain.nftc.nft.assetbysku.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckNftAssetbyskuResponse({}));
  }

  /**
   * Description: 支付宝海豚优惠券发放
   * Summary: 支付宝海豚优惠券发放
   */
  async sendPromoPrize(request: SendPromoPrizeRequest): Promise<SendPromoPrizeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendPromoPrizeEx(request, headers, runtime);
  }

  /**
   * Description: 支付宝海豚优惠券发放
   * Summary: 支付宝海豚优惠券发放
   */
  async sendPromoPrizeEx(request: SendPromoPrizeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendPromoPrizeResponse> {
    Util.validateModel(request);
    return $tea.cast<SendPromoPrizeResponse>(await this.doRequest("1.0", "antchain.nftc.promo.prize.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendPromoPrizeResponse({}));
  }

  /**
   * Description: 创建通用资源
   * Summary: 创建通用资源
   */
  async createResourceGeneralresource(request: CreateResourceGeneralresourceRequest): Promise<CreateResourceGeneralresourceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createResourceGeneralresourceEx(request, headers, runtime);
  }

  /**
   * Description: 创建通用资源
   * Summary: 创建通用资源
   */
  async createResourceGeneralresourceEx(request: CreateResourceGeneralresourceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateResourceGeneralresourceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateResourceGeneralresourceResponse>(await this.doRequest("1.0", "antchain.nftc.resource.generalresource.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateResourceGeneralresourceResponse({}));
  }

  /**
   * Description: 绑定文件到通用资源ID
   * Summary: 绑定文件到通用资源ID
   */
  async bindResourceGeneralresourcefile(request: BindResourceGeneralresourcefileRequest): Promise<BindResourceGeneralresourcefileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindResourceGeneralresourcefileEx(request, headers, runtime);
  }

  /**
   * Description: 绑定文件到通用资源ID
   * Summary: 绑定文件到通用资源ID
   */
  async bindResourceGeneralresourcefileEx(request: BindResourceGeneralresourcefileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindResourceGeneralresourcefileResponse> {
    Util.validateModel(request);
    return $tea.cast<BindResourceGeneralresourcefileResponse>(await this.doRequest("1.0", "antchain.nftc.resource.generalresourcefile.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindResourceGeneralresourcefileResponse({}));
  }

  /**
   * Description: 发布通用资源文件
   * Summary: 发布通用资源文件
   */
  async publishResourceGeneralresourcefile(request: PublishResourceGeneralresourcefileRequest): Promise<PublishResourceGeneralresourcefileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.publishResourceGeneralresourcefileEx(request, headers, runtime);
  }

  /**
   * Description: 发布通用资源文件
   * Summary: 发布通用资源文件
   */
  async publishResourceGeneralresourcefileEx(request: PublishResourceGeneralresourcefileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PublishResourceGeneralresourcefileResponse> {
    Util.validateModel(request);
    return $tea.cast<PublishResourceGeneralresourcefileResponse>(await this.doRequest("1.0", "antchain.nftc.resource.generalresourcefile.publish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PublishResourceGeneralresourcefileResponse({}));
  }

  /**
   * Description: 查询资源文件差量包列表
   * Summary: 查询资源文件差量包列表
   */
  async queryResourcePatchlist(request: QueryResourcePatchlistRequest): Promise<QueryResourcePatchlistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryResourcePatchlistEx(request, headers, runtime);
  }

  /**
   * Description: 查询资源文件差量包列表
   * Summary: 查询资源文件差量包列表
   */
  async queryResourcePatchlistEx(request: QueryResourcePatchlistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryResourcePatchlistResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryResourcePatchlistResponse>(await this.doRequest("1.0", "antchain.nftc.resource.patchlist.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryResourcePatchlistResponse({}));
  }

  /**
   * Description: 资源管理平台-申请文件上传token
   * Summary: 资源管理平台-申请文件上传token
   */
  async applyResourceFiletoken(request: ApplyResourceFiletokenRequest): Promise<ApplyResourceFiletokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyResourceFiletokenEx(request, headers, runtime);
  }

  /**
   * Description: 资源管理平台-申请文件上传token
   * Summary: 资源管理平台-申请文件上传token
   */
  async applyResourceFiletokenEx(request: ApplyResourceFiletokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyResourceFiletokenResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyResourceFiletokenResponse>(await this.doRequest("1.0", "antchain.nftc.resource.filetoken.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyResourceFiletokenResponse({}));
  }

}
