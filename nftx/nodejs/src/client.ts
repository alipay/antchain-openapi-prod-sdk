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

// nft发行的文件
export class File extends $tea.Model {
  // 原文件的可访问路径
  originalFilePath: string;
  // 缩略图的可访问路径
  miniImagePath: string;
  // 文件名称
  name: string;
  //     IMAGE("IMAGE", "图片"),
  //     VIDEO("VIDEO", "视频"),
  //     AUDIO("AUDIO","音频"),
  //     THREE_DIMENSIONS("THREE_DIMENSIONS","3D模型")
  type: string;
  static names(): { [key: string]: string } {
    return {
      originalFilePath: 'original_file_path',
      miniImagePath: 'mini_image_path',
      name: 'name',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      originalFilePath: 'string',
      miniImagePath: 'string',
      name: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 资源图片
export class CToMResourceImg extends $tea.Model {
  // 预览图
  thumbnailUrl: string;
  // 高清图
  highDefinitionUrl: string;
  // key
  key: string;
  static names(): { [key: string]: string } {
    return {
      thumbnailUrl: 'thumbnail_url',
      highDefinitionUrl: 'high_definition_url',
      key: 'key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      thumbnailUrl: 'string',
      highDefinitionUrl: 'string',
      key: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户资产
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
  // 缩略图url，带5分钟鉴权
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

export class ImportNftCreateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 对端自己的项目id；用作幂等字段
  projectId: string;
  // NFT艺术品的名称
  skuName: string;
  // IMAGE("IMAGE","图片"),
  // VIDEO("VIDEO","视频"),
  // ;
  skuType: string;
  // 发行数量
  quantity: number;
  // 艺术品作者
  author: string;
  // 艺术品拥有者
  owner: string;
  // 艺术品创作时间
  creationTime: string;
  // 用于标识NFT资产来自特定的产品，用作特殊的交互跳转需求，非必填字段
  bizType?: string;
  // nft简介信息
  description: string;
  // 跳转链接
  jumpUrl?: string;
  // nft发行的艺术品文件
  files: File[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
      skuName: 'sku_name',
      skuType: 'sku_type',
      quantity: 'quantity',
      author: 'author',
      owner: 'owner',
      creationTime: 'creation_time',
      bizType: 'biz_type',
      description: 'description',
      jumpUrl: 'jump_url',
      files: 'files',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
      skuName: 'string',
      skuType: 'string',
      quantity: 'number',
      author: 'string',
      owner: 'string',
      creationTime: 'string',
      bizType: 'string',
      description: 'string',
      jumpUrl: 'string',
      files: { 'type': 'array', 'itemType': File },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportNftCreateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // NFT发行成功的商品id
  skuId?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      skuId: 'sku_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      skuId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryNftCreateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 对端自己的项目id；NFT发行时用作幂等字段
  projectId: string;
  // NFT发行成功的商品id，传入sku_id时以此为准做查询
  skuId?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
      skuId: 'sku_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
      skuId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryNftCreateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // NFT发行成功的商品id
  skuId?: number;
  // INIT("INIT", "初始化"),
  // PROCESSING("PROCESSING", "资产创建中"),
  // FINISH("FINISH", "资产初始化完毕"),
  // ;
  skuStatus?: string;
  // NFT商品的名称
  skuName?: string;
  // 作者的名称
  authorName?: string;
  // 发行方的名称
  issuerName?: string;
  // 缩略图展示路径
  miniImagePath?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      skuId: 'sku_id',
      skuStatus: 'sku_status',
      skuName: 'sku_name',
      authorName: 'author_name',
      issuerName: 'issuer_name',
      miniImagePath: 'mini_image_path',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      skuId: 'number',
      skuStatus: 'string',
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

export class ExecNftTransferRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // NFT发行成功的商品id
  skuId: number;
  // C端用户的支付宝uid
  toIdNo: string;
  // C端用户的支付宝账号类型
  toIdType: string;
  // 用户在商户购买的订单号，用作幂等字段
  orderNo: string;
  // 用户购买订单的时间
  orderTime: string;
  // 用户购买订单的价格，可以为0；用户的购买历史记录会展示
  priceCent?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      skuId: 'sku_id',
      toIdNo: 'to_id_no',
      toIdType: 'to_id_type',
      orderNo: 'order_no',
      orderTime: 'order_time',
      priceCent: 'price_cent',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      skuId: 'number',
      toIdNo: 'string',
      toIdType: 'string',
      orderNo: 'string',
      orderTime: 'string',
      priceCent: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecNftTransferResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // NFT发行成功的商品id
  skuId?: number;
  // NFT发行成功的商品，其中转给C端用户的特定一个token
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

export class SendNftTransferRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // NFT租户下唯一的项目编号
  projectId: string;
  // 支付宝2088开头账号
  toIdNo: string;
  // 账号类型，当前只支持支付宝账号
  toIdType: string;
  // 交易NFT时租户的唯一订单号
  orderNo: string;
  // 用户购买订单时间
  orderTime: string;
  // 购买NFT的金额，单位分
  priceCent?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
      toIdNo: 'to_id_no',
      toIdType: 'to_id_type',
      orderNo: 'order_no',
      orderTime: 'order_time',
      priceCent: 'price_cent',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
      toIdNo: 'string',
      toIdType: 'string',
      orderNo: 'string',
      orderTime: 'string',
      priceCent: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendNftTransferResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // NFT商品编码
  skuId?: string;
  // 发放的NFT编码
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
      skuId: 'string',
      nftId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryNftCustomerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户支付宝2088账号编码，16位
  idNo: string;
  // 用户的账户类型
  idType: string;
  // NFT资产唯一编码
  nftId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      idNo: 'id_no',
      idType: 'id_type',
      nftId: 'nft_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      idNo: 'string',
      idType: 'string',
      nftId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryNftCustomerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // NFT商品的商品编码
  skuId?: number;
  // NFT资产的唯一编码
  nftId?: string;
  // NFT商品的名称
  skuName?: string;
  // NFT的创作者名称
  authorName?: string;
  // NFT的发行方名称
  issuerName?: string;
  // 缩略图url，带5分钟鉴权
  miniImagePath?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
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
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
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

export class QueryNftOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 支付宝的2088账号
  idNo: string;
  // 支付账号类型，该版本仅支持支付宝账号
  idType: string;
  // 租户的唯一映射订单号
  orderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      idNo: 'id_no',
      idType: 'id_type',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      idNo: 'string',
      idType: 'string',
      orderNo: 'string',
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
  // NFT商品编码
  skuId?: number;
  // NFT资产的唯一id
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

export class CreateNftIssuerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户发行NFT的唯一编号
  projectId: string;
  // NFT商品的名称
  skuName: string;
  // NFT资产类型, 含IMAGE、VIDEO、FILE、AUDIO、THREE_DIMENSIONS等
  skuType: string;
  // 铸造数量，100起
  quantity: number;
  // NFT创作者
  author: string;
  // 发行方名称
  issuerName: string;
  // NFT商品的描述
  skuDescrption: string;
  // 跳转链接
  jumpUrl?: string;
  // 业务类型：PAY_CODE，DEFAULT，EUROPEAN_CUP，TAOBAO_AUCTION，NFT_CUSTOMIZE（NFT定制）
  bizType?: string;
  // 素材文件结构
  files: File[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
      skuName: 'sku_name',
      skuType: 'sku_type',
      quantity: 'quantity',
      author: 'author',
      issuerName: 'issuer_name',
      skuDescrption: 'sku_descrption',
      jumpUrl: 'jump_url',
      bizType: 'biz_type',
      files: 'files',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
      skuName: 'string',
      skuType: 'string',
      quantity: 'number',
      author: 'string',
      issuerName: 'string',
      skuDescrption: 'string',
      jumpUrl: 'string',
      bizType: 'string',
      files: { 'type': 'array', 'itemType': File },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateNftIssuerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发行任务编号
  taskId?: string;
  // 业务方发行NFT对应的唯一项目编号
  projectId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      projectId: 'project_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      projectId: 'string',
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
  // 当前页码
  page: number;
  // 页长
  pageSize: number;
  // 用户手机号或支付宝UID
  idNo: string;
  // 用户ID类型，和id_no对应
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
  // fans uid
  uid?: string;
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
      uid: 'uid',
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
      uid: 'string',
      assetList: { 'type': 'array', 'itemType': UserAsset },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateNftPublishRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户发行NFT的唯一编号
  projectId: string;
  // NFT商品的名称
  skuName: string;
  // NFT资产类型, 含IMAGE(图片)、VIDEO(视频)、AUDIO(音频)、THREE_DIMENSIONS(3D模型)等
  skuType: string;
  // 铸造数量，至少为1
  quantity: number;
  // NFT创作者。中文或手机号和author_type对应
  author: string;
  // 创作者类型。手机号或中文类型，和author对应
  authorType: string;
  // 发行方名称
  issuerName: string;
  // NFT商品的描述
  skuDescrption: string;
  // 监制方。中文名或手机号，和producer_type对应
  producer: string;
  // 监制方类型。手机号或中文类型，和producer对应
  producerType: string;
  // 跳转链接
  jumpUrl?: string;
  // 业务类型：PAY_CODE，DEFAULT，EUROPEAN_CUP，TAOBAO_AUCTION，
  bizType?: string;
  // 渠道租户
  channelTenant: string;
  // 素材文件结构
  files: File[];
  // 备注信息
  memo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
      skuName: 'sku_name',
      skuType: 'sku_type',
      quantity: 'quantity',
      author: 'author',
      authorType: 'author_type',
      issuerName: 'issuer_name',
      skuDescrption: 'sku_descrption',
      producer: 'producer',
      producerType: 'producer_type',
      jumpUrl: 'jump_url',
      bizType: 'biz_type',
      channelTenant: 'channel_tenant',
      files: 'files',
      memo: 'memo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
      skuName: 'string',
      skuType: 'string',
      quantity: 'number',
      author: 'string',
      authorType: 'string',
      issuerName: 'string',
      skuDescrption: 'string',
      producer: 'string',
      producerType: 'string',
      jumpUrl: 'string',
      bizType: 'string',
      channelTenant: 'string',
      files: { 'type': 'array', 'itemType': File },
      memo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateNftPublishResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发行任务编号
  taskId?: string;
  // 业务方发行NFT对应的唯一项目编号
  projectId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
      projectId: 'project_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
      projectId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RunNftTransferRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // NFT租户下唯一的项目编号
  projectId: string;
  // 支付宝2088开头账号
  toIdNo: string;
  // 账号类型，当前只支持支付宝账号
  toIdType: string;
  // 交易NFT时租户的唯一订单号
  orderNo: string;
  // 购买NFT的金额，单位分
  priceCent?: number;
  // 渠道租户
  channelTenant: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
      toIdNo: 'to_id_no',
      toIdType: 'to_id_type',
      orderNo: 'order_no',
      priceCent: 'price_cent',
      channelTenant: 'channel_tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
      toIdNo: 'string',
      toIdType: 'string',
      orderNo: 'string',
      priceCent: 'number',
      channelTenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RunNftTransferResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // NFT商品编码
  skuId?: string;
  // 发放的NFT编码
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
      skuId: 'string',
      nftId: 'string',
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
  // NFT发行成功的商品id
  skuId: number;
  // C端用户的支付宝uid
  toIdNo: string;
  // 仅支持 支付宝账号类型
  toIdType: string;
  // 用户在商户购买的订单号，用作幂等字段
  orderNo: string;
  // 用户购买订单的价格，单位为分，可以为0；
  priceCent?: number;
  // 渠道租户
  channelTenant: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      skuId: 'sku_id',
      toIdNo: 'to_id_no',
      toIdType: 'to_id_type',
      orderNo: 'order_no',
      priceCent: 'price_cent',
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
      orderNo: 'string',
      priceCent: 'number',
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
  // NFT发行成功的商品id
  skuId?: number;
  // NFT发行成功的商品，其中转给C端用户的特定一个token
  nftId?: string;
  // fans uid
  uid?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      skuId: 'sku_id',
      nftId: 'nft_id',
      uid: 'uid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      skuId: 'number',
      nftId: 'string',
      uid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyNftTransferbyprojectwithchanneltenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // NFT租户下唯一的项目编号
  projectId: string;
  // 支付宝2088开头账号
  toIdNo: string;
  // 账号类型，当前只支持支付宝账号
  toIdType: string;
  // 交易NFT时租户的唯一订单号
  orderNo: string;
  // 购买NFT的金额，单位分
  priceCent?: number;
  // 渠道租户
  channelTenant: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
      toIdNo: 'to_id_no',
      toIdType: 'to_id_type',
      orderNo: 'order_no',
      priceCent: 'price_cent',
      channelTenant: 'channel_tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
      toIdNo: 'string',
      toIdType: 'string',
      orderNo: 'string',
      priceCent: 'number',
      channelTenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyNftTransferbyprojectwithchanneltenantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // NFT商品编码
  skuId?: string;
  // 发放的NFT编码
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
      skuId: 'string',
      nftId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryNftAssetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基于租户Id生成的对应访问服务端的accessToken
  accessToken: string;
  // 对应此藏品的nftId
  nftId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accessToken: 'access_token',
      nftId: 'nft_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accessToken: 'string',
      nftId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryNftAssetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 藏品ID
  nftId?: string;
  // 藏品名称
  skuName?: string;
  // 藏品SKU ID
  skuId?: number;
  // 此藏品对应的uniHash值
  uniHash?: string;
  // 藏品铸造时间
  creationTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      nftId: 'nft_id',
      skuName: 'sku_name',
      skuId: 'sku_id',
      uniHash: 'uni_hash',
      creationTime: 'creation_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      nftId: 'string',
      skuName: 'string',
      skuId: 'number',
      uniHash: 'string',
      creationTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PayOrderDataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 接入方测订单号，保证全局唯一
  externalOrderNo: string;
  // 订单金额，单位为分
  amountCent: number;
  // ALIPAY 表示小程序支付，ALIPAY_APP表示App支付, ALIPAY_WAP表示手机网站支付
  payChannel: string;
  // 订单标题，支付宝账单会展示
  subject: string;
  // 订单超时时间，秒级
  timeoutExpireSecond: number;
  // 接入方存储的accessToken
  accessToken: string;
  // 支付完成后的回跳地址
  returnUrl?: string;
  // AC编码
  nftId?: string;
  // 鲸探测分配的实物规格编码
  itemCode?: string;
  // 用户购买的商品个数
  itemNum?: number;
  // 商品单价，单位分
  itemPriceCent?: number;
  // 资源ID
  resourceId?: string;
  // 根据实际情况传递
  resourceType?: string;
  // 是否使用GET方法支持wap支付
  wapPayUseGet?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      externalOrderNo: 'external_order_no',
      amountCent: 'amount_cent',
      payChannel: 'pay_channel',
      subject: 'subject',
      timeoutExpireSecond: 'timeout_expire_second',
      accessToken: 'access_token',
      returnUrl: 'return_url',
      nftId: 'nft_id',
      itemCode: 'item_code',
      itemNum: 'item_num',
      itemPriceCent: 'item_price_cent',
      resourceId: 'resource_id',
      resourceType: 'resource_type',
      wapPayUseGet: 'wap_pay_use_get',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      externalOrderNo: 'string',
      amountCent: 'number',
      payChannel: 'string',
      subject: 'string',
      timeoutExpireSecond: 'number',
      accessToken: 'string',
      returnUrl: 'string',
      nftId: 'string',
      itemCode: 'string',
      itemNum: 'number',
      itemPriceCent: 'number',
      resourceId: 'string',
      resourceType: 'string',
      wapPayUseGet: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PayOrderDataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 鲸探开放平台内部订单号
  openOrderNo?: string;
  // json字符串
  payParams?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      openOrderNo: 'open_order_no',
      payParams: 'pay_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      openOrderNo: 'string',
      payParams: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncOrderDataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 接入方的订单号
  externalOrderNo: string;
  // 目前支持两种状态 PAID、PAY_CANCEL 
  externalOrderStatus: string;
  // 鲸探开放平台订单号
  openOrderNo?: string;
  // 鲸探授权的用户加密的uid
  openUserId: string;
  // 同步改状态时的事件毫秒时间戳
  updateTime: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      externalOrderNo: 'external_order_no',
      externalOrderStatus: 'external_order_status',
      openOrderNo: 'open_order_no',
      openUserId: 'open_user_id',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      externalOrderNo: 'string',
      externalOrderStatus: 'string',
      openOrderNo: 'string',
      openUserId: 'string',
      updateTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncOrderDataResponse extends $tea.Model {
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

export class QueryResourceImageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // access_token
  accessToken: string;
  // 素材的类型（AIGC/NFT）
  type: string;
  // 资源ID
  resourceId: string;
  // type为NFT必填
  nftId?: string;
  // 是否需要高清图
  needHdImg: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accessToken: 'access_token',
      type: 'type',
      resourceId: 'resource_id',
      nftId: 'nft_id',
      needHdImg: 'need_hd_img',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accessToken: 'string',
      type: 'string',
      resourceId: 'string',
      nftId: 'string',
      needHdImg: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryResourceImageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // nftID 藏品素材nftId，type为NFT时有值
  nftId?: string;
  // 具体藏品名称，type为NFT时有值
  skuName?: string;
  // nftId 的 算法计算的hash，该藏品唯一标识，type为NFT时有值
  uniHash?: string;
  // Date	藏品铸造上链生成时间，例如2021.09.22 20:22:19，type为NFT时有值
  creationTime?: string;
  // url列表
  imgUrls?: CToMResourceImg[];
  // int	高清图状态
  // 0 需要等待
  // 1 已完成
  highDefinitionStatus?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      nftId: 'nft_id',
      skuName: 'sku_name',
      uniHash: 'uni_hash',
      creationTime: 'creation_time',
      imgUrls: 'img_urls',
      highDefinitionStatus: 'high_definition_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      nftId: 'string',
      skuName: 'string',
      uniHash: 'string',
      creationTime: 'string',
      imgUrls: { 'type': 'array', 'itemType': CToMResourceImg },
      highDefinitionStatus: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportResourceConsigneeinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 姓名
  name: string;
  // 手机号
  phone: string;
  // 收货地址
  deliveryAddress: string;
  // email
  email: string;
  // 中奖人手机号
  luckyPhone: string;
  // 单据号，幂等用
  bizNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      phone: 'phone',
      deliveryAddress: 'delivery_address',
      email: 'email',
      luckyPhone: 'lucky_phone',
      bizNo: 'biz_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      phone: 'string',
      deliveryAddress: 'string',
      email: 'string',
      luckyPhone: 'string',
      bizNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportResourceConsigneeinfoResponse extends $tea.Model {
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
  // 1.authorization_code，表示换取使用用户授权码code换取授权令牌access_token。
  // 2.refresh_token，表示使用refresh_token刷新获取新授权令牌。
  // 本期只支持authorization_code
  grantType: string;
  // 授权码，用户对应用授权后得到。
  // 本参数在 grant_type 为 authorization_code 时必填；为 refresh_token 时不填。
  authCode?: string;
  // 刷新令牌，上次换取访问令牌时得到。本参数在 grant_type 为 authorization_code 时不填；为 refresh_token 时必填
  refreshToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      grantType: 'grant_type',
      authCode: 'auth_code',
      refreshToken: 'refresh_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      grantType: 'string',
      authCode: 'string',
      refreshToken: 'string',
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
  // 后续调用接口鉴权的token
  accessToken?: string;
  // 到期时间
  expireTime?: string;
  // openuid
  openUserId?: string;
  // 预留字段，本期不使用
  refreshToken?: string;
  // 预留字段，本期不使用
  refreshExpireTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accessToken: 'access_token',
      expireTime: 'expire_time',
      openUserId: 'open_user_id',
      refreshToken: 'refresh_token',
      refreshExpireTime: 'refresh_expire_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accessToken: 'string',
      expireTime: 'string',
      openUserId: 'string',
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
  // 授权token
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

export class QueryOauthUserinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户昵称
  nickName?: string;
  // 头像链接
  avatar?: string;
  // open_user_id
  openUserId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      nickName: 'nick_name',
      avatar: 'avatar',
      openUserId: 'open_user_id',
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
          sdk_version: "1.8.10",
          _prod_code: "NFTX",
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
   * Description: B端商户的NFT发行以及铸造
   * Summary: B端商户的NFT铸造 (废弃)
   */
  async importNftCreate(request: ImportNftCreateRequest): Promise<ImportNftCreateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importNftCreateEx(request, headers, runtime);
  }

  /**
   * Description: B端商户的NFT发行以及铸造
   * Summary: B端商户的NFT铸造 (废弃)
   */
  async importNftCreateEx(request: ImportNftCreateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportNftCreateResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportNftCreateResponse>(await this.doRequest("1.0", "antchain.nftx.nft.create.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportNftCreateResponse({}));
  }

  /**
   * Description: B端商户的NFT发行后查询，包含状态、NFT商品的概要信息
   * Summary: B端商户的NFT发行铸造后查询
   */
  async queryNftCreate(request: QueryNftCreateRequest): Promise<QueryNftCreateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryNftCreateEx(request, headers, runtime);
  }

  /**
   * Description: B端商户的NFT发行后查询，包含状态、NFT商品的概要信息
   * Summary: B端商户的NFT发行铸造后查询
   */
  async queryNftCreateEx(request: QueryNftCreateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryNftCreateResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryNftCreateResponse>(await this.doRequest("1.0", "antchain.nftx.nft.create.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryNftCreateResponse({}));
  }

  /**
   * Description: 按商品编码（skuid）B2C发放NFT
   * Summary: 按商品编码B2C发放NFT
   */
  async execNftTransfer(request: ExecNftTransferRequest): Promise<ExecNftTransferResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execNftTransferEx(request, headers, runtime);
  }

  /**
   * Description: 按商品编码（skuid）B2C发放NFT
   * Summary: 按商品编码B2C发放NFT
   */
  async execNftTransferEx(request: ExecNftTransferRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecNftTransferResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecNftTransferResponse>(await this.doRequest("1.0", "antchain.nftx.nft.transfer.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecNftTransferResponse({}));
  }

  /**
   * Description: 按项目表编码B2C发放NFT
   * Summary: 按项目表编码B2C发放NFT
   */
  async sendNftTransfer(request: SendNftTransferRequest): Promise<SendNftTransferResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendNftTransferEx(request, headers, runtime);
  }

  /**
   * Description: 按项目表编码B2C发放NFT
   * Summary: 按项目表编码B2C发放NFT
   */
  async sendNftTransferEx(request: SendNftTransferRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendNftTransferResponse> {
    Util.validateModel(request);
    return $tea.cast<SendNftTransferResponse>(await this.doRequest("1.0", "antchain.nftx.nft.transfer.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendNftTransferResponse({}));
  }

  /**
   * Description: 根据nftId查询客户NFT资产
   * Summary: 根据nftId查询客户NFT资产
   */
  async queryNftCustomer(request: QueryNftCustomerRequest): Promise<QueryNftCustomerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryNftCustomerEx(request, headers, runtime);
  }

  /**
   * Description: 根据nftId查询客户NFT资产
   * Summary: 根据nftId查询客户NFT资产
   */
  async queryNftCustomerEx(request: QueryNftCustomerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryNftCustomerResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryNftCustomerResponse>(await this.doRequest("1.0", "antchain.nftx.nft.customer.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryNftCustomerResponse({}));
  }

  /**
   * Description: 根据外部订单号查询该订单的NFT流水记录
   * Summary: 根据外部订单号查询该订单的NFT流水记录
   */
  async queryNftOrder(request: QueryNftOrderRequest): Promise<QueryNftOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryNftOrderEx(request, headers, runtime);
  }

  /**
   * Description: 根据外部订单号查询该订单的NFT流水记录
   * Summary: 根据外部订单号查询该订单的NFT流水记录
   */
  async queryNftOrderEx(request: QueryNftOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryNftOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryNftOrderResponse>(await this.doRequest("1.0", "antchain.nftx.nft.order.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryNftOrderResponse({}));
  }

  /**
   * Description: NFT发行审核&铸造
   * Summary: NFT发行审核&铸造
   */
  async createNftIssuer(request: CreateNftIssuerRequest): Promise<CreateNftIssuerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createNftIssuerEx(request, headers, runtime);
  }

  /**
   * Description: NFT发行审核&铸造
   * Summary: NFT发行审核&铸造
   */
  async createNftIssuerEx(request: CreateNftIssuerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateNftIssuerResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateNftIssuerResponse>(await this.doRequest("1.0", "antchain.nftx.nft.issuer.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateNftIssuerResponse({}));
  }

  /**
   * Description: B端用户资产列表查询
   * Summary: 用户资产列表查询
   */
  async pagequeryNftCustomer(request: PagequeryNftCustomerRequest): Promise<PagequeryNftCustomerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryNftCustomerEx(request, headers, runtime);
  }

  /**
   * Description: B端用户资产列表查询
   * Summary: 用户资产列表查询
   */
  async pagequeryNftCustomerEx(request: PagequeryNftCustomerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryNftCustomerResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryNftCustomerResponse>(await this.doRequest("1.0", "antchain.nftx.nft.customer.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryNftCustomerResponse({}));
  }

  /**
   * Description: NFT铸造, 带监制方和渠道租户
   * Summary: NFT铸造, 带监制方和渠道租户
   */
  async createNftPublish(request: CreateNftPublishRequest): Promise<CreateNftPublishResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createNftPublishEx(request, headers, runtime);
  }

  /**
   * Description: NFT铸造, 带监制方和渠道租户
   * Summary: NFT铸造, 带监制方和渠道租户
   */
  async createNftPublishEx(request: CreateNftPublishRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateNftPublishResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateNftPublishResponse>(await this.doRequest("1.0", "antchain.nftx.nft.publish.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateNftPublishResponse({}));
  }

  /**
   * Description: 按项目表编码B2C发放NFT,带渠道租户
   * Summary: 按项目表编码B2C发放NFT, (废弃)
   */
  async runNftTransfer(request: RunNftTransferRequest): Promise<RunNftTransferResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.runNftTransferEx(request, headers, runtime);
  }

  /**
   * Description: 按项目表编码B2C发放NFT,带渠道租户
   * Summary: 按项目表编码B2C发放NFT, (废弃)
   */
  async runNftTransferEx(request: RunNftTransferRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RunNftTransferResponse> {
    Util.validateModel(request);
    return $tea.cast<RunNftTransferResponse>(await this.doRequest("1.0", "antchain.nftx.nft.transfer.run", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RunNftTransferResponse({}));
  }

  /**
   * Description: 按商品编码B2C发放NFT 带渠道租户
   * Summary: 按商品编码B2C发放NFT 带渠道租户
   */
  async applyNftTransfer(request: ApplyNftTransferRequest): Promise<ApplyNftTransferResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyNftTransferEx(request, headers, runtime);
  }

  /**
   * Description: 按商品编码B2C发放NFT 带渠道租户
   * Summary: 按商品编码B2C发放NFT 带渠道租户
   */
  async applyNftTransferEx(request: ApplyNftTransferRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyNftTransferResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyNftTransferResponse>(await this.doRequest("1.0", "antchain.nftx.nft.transfer.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyNftTransferResponse({}));
  }

  /**
   * Description: 按项目表编码B2C发放NFT,带渠道租户
   * Summary: 按项目表编码B2C发放NFT,带渠道租户
   */
  async applyNftTransferbyprojectwithchanneltenant(request: ApplyNftTransferbyprojectwithchanneltenantRequest): Promise<ApplyNftTransferbyprojectwithchanneltenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyNftTransferbyprojectwithchanneltenantEx(request, headers, runtime);
  }

  /**
   * Description: 按项目表编码B2C发放NFT,带渠道租户
   * Summary: 按项目表编码B2C发放NFT,带渠道租户
   */
  async applyNftTransferbyprojectwithchanneltenantEx(request: ApplyNftTransferbyprojectwithchanneltenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyNftTransferbyprojectwithchanneltenantResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyNftTransferbyprojectwithchanneltenantResponse>(await this.doRequest("1.0", "antchain.nftx.nft.transferbyprojectwithchanneltenant.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyNftTransferbyprojectwithchanneltenantResponse({}));
  }

  /**
   * Description: 第三方通过accessToken和nftId校验藏品归属及查询相应藏品信息
   * Summary: 校验藏品归属及查询相应藏品信息
   */
  async queryNftAsset(request: QueryNftAssetRequest): Promise<QueryNftAssetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryNftAssetEx(request, headers, runtime);
  }

  /**
   * Description: 第三方通过accessToken和nftId校验藏品归属及查询相应藏品信息
   * Summary: 校验藏品归属及查询相应藏品信息
   */
  async queryNftAssetEx(request: QueryNftAssetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryNftAssetResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryNftAssetResponse>(await this.doRequest("1.0", "antchain.nftx.nft.asset.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryNftAssetResponse({}));
  }

  /**
   * Description: 基于直付通模式的开放订单支付接口
   * Summary: 开放订单支付接口
   */
  async payOrderData(request: PayOrderDataRequest): Promise<PayOrderDataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.payOrderDataEx(request, headers, runtime);
  }

  /**
   * Description: 基于直付通模式的开放订单支付接口
   * Summary: 开放订单支付接口
   */
  async payOrderDataEx(request: PayOrderDataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PayOrderDataResponse> {
    Util.validateModel(request);
    return $tea.cast<PayOrderDataResponse>(await this.doRequest("1.0", "antchain.nftx.order.data.pay", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PayOrderDataResponse({}));
  }

  /**
   * Description: 外部订单数据同步，包括取消、完成，未来会扩展额外数据
   * Summary: 外部订单数据同步
   */
  async syncOrderData(request: SyncOrderDataRequest): Promise<SyncOrderDataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncOrderDataEx(request, headers, runtime);
  }

  /**
   * Description: 外部订单数据同步，包括取消、完成，未来会扩展额外数据
   * Summary: 外部订单数据同步
   */
  async syncOrderDataEx(request: SyncOrderDataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncOrderDataResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncOrderDataResponse>(await this.doRequest("1.0", "antchain.nftx.order.data.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncOrderDataResponse({}));
  }

  /**
   * Description: 查询实物定制图片
   * Summary: 查询实物定制图片
   */
  async queryResourceImage(request: QueryResourceImageRequest): Promise<QueryResourceImageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryResourceImageEx(request, headers, runtime);
  }

  /**
   * Description: 查询实物定制图片
   * Summary: 查询实物定制图片
   */
  async queryResourceImageEx(request: QueryResourceImageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryResourceImageResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryResourceImageResponse>(await this.doRequest("1.0", "antchain.nftx.resource.image.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryResourceImageResponse({}));
  }

  /**
   * Description: 用户收货信息存档
   * Summary: 用户收货信息存档
   */
  async importResourceConsigneeinfo(request: ImportResourceConsigneeinfoRequest): Promise<ImportResourceConsigneeinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importResourceConsigneeinfoEx(request, headers, runtime);
  }

  /**
   * Description: 用户收货信息存档
   * Summary: 用户收货信息存档
   */
  async importResourceConsigneeinfoEx(request: ImportResourceConsigneeinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportResourceConsigneeinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportResourceConsigneeinfoResponse>(await this.doRequest("1.0", "antchain.nftx.resource.consigneeinfo.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportResourceConsigneeinfoResponse({}));
  }

  /**
   * Description: 拿authcode换token
   * Summary: 拿authcode换token
   */
  async applyOauthToken(request: ApplyOauthTokenRequest): Promise<ApplyOauthTokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyOauthTokenEx(request, headers, runtime);
  }

  /**
   * Description: 拿authcode换token
   * Summary: 拿authcode换token
   */
  async applyOauthTokenEx(request: ApplyOauthTokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyOauthTokenResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyOauthTokenResponse>(await this.doRequest("1.0", "antchain.nftx.oauth.token.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyOauthTokenResponse({}));
  }

  /**
   * Description: 获取用户信息
   * Summary: 获取用户信息
   */
  async queryOauthUserinfo(request: QueryOauthUserinfoRequest): Promise<QueryOauthUserinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryOauthUserinfoEx(request, headers, runtime);
  }

  /**
   * Description: 获取用户信息
   * Summary: 获取用户信息
   */
  async queryOauthUserinfoEx(request: QueryOauthUserinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryOauthUserinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryOauthUserinfoResponse>(await this.doRequest("1.0", "antchain.nftx.oauth.userinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryOauthUserinfoResponse({}));
  }

}
