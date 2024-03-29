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

// 查询所有数字权证项目接口结构体
export class DigitalProjectList extends $tea.Model {
  // 项目id
  projectId?: string;
  // 项目名称
  name?: string;
  // 项目描述
  description?: string;
  // 项目状态
  projectStatus?: string;
  // 创建时间戳
  createTime?: number;
  // 合约symbol
  symbol?: string;
  // 发行数量
  amount?: number;
  static names(): { [key: string]: string } {
    return {
      projectId: 'project_id',
      name: 'name',
      description: 'description',
      projectStatus: 'project_status',
      createTime: 'create_time',
      symbol: 'symbol',
      amount: 'amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      projectId: 'string',
      name: 'string',
      description: 'string',
      projectStatus: 'string',
      createTime: 'number',
      symbol: 'string',
      amount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AssetUri中多组资源信息
export class ResourceBundle extends $tea.Model {
  // 可公开访问的资源地址
  uri: string;
  // 上传资源时指定的资源类型
  type: string;
  // 资源描述
  description?: string;
  static names(): { [key: string]: string } {
    return {
      uri: 'uri',
      type: 'type',
      description: 'description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uri: 'string',
      type: 'string',
      description: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发送交易时的账户信息，托管(推荐)和非托管(本地)必选其中一种
export class AccountInfo extends $tea.Model {
  // 托管账户的账户名称，也是链上账户名称，交易发起方账户
  account?: string;
  // 托管账户对应的秘钥ID
  kmsId?: string;
  // 托管账户对应的租户ID，默认为空，如有使用其他租户的托管账户时需指定
  tenantId?: string;
  // 非托管模式下必须输入，客户端构建交易出的信息，base64编码
  signData?: string;
  static names(): { [key: string]: string } {
    return {
      account: 'account',
      kmsId: 'kms_id',
      tenantId: 'tenant_id',
      signData: 'sign_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      account: 'string',
      kmsId: 'string',
      tenantId: 'string',
      signData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云查询数字权证列表结果
export class AliYunDigitalProjectListView extends $tea.Model {
  // 分页编号
  pageIndex?: number;
  // 单页行数
  pageSize?: number;
  // 数据总行数
  totalSize?: number;
  // 查询结果列表
  projectList?: DigitalProjectList[];
  static names(): { [key: string]: string } {
    return {
      pageIndex: 'page_index',
      pageSize: 'page_size',
      totalSize: 'total_size',
      projectList: 'project_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageIndex: 'number',
      pageSize: 'number',
      totalSize: 'number',
      projectList: { 'type': 'array', 'itemType': DigitalProjectList },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数字权证项目信息类
export class DigitalProject extends $tea.Model {
  // 数字权证项目id
  projectId: string;
  // 模版类型
  // 1为共享型，2为独享型，3为高性能共享型，4为高性能独享型
  bizType: number;
  // 数字权证项目名称
  name: string;
  // 合约symbol
  symbol: string;
  // 数字权证项目描述
  description: string;
  // 项目状态：
  // deploy：已部署(可更新)
  // issue：已发布(不可更新)
  projectStatus: string;
  // 项目发行权证的总数，高性能版本显示为0
  amount: number;
  // 权证的uri信息（共享tokenuri模式有该字段）
  assetUri?: string;
  // 项目发行后权证数量是否可增发，高性能版本显示为支持
  // 
  limitedAmount: boolean;
  // 项目权证是否可核销
  writeOffable: boolean;
  // 项目权证是否可销毁
  burnable: boolean;
  // 项目管理员账户地址
  ownerAccount: string;
  // 项目核销员账户地址列表
  issuerList?: string[];
  // 项目核销员账户地址列表
  writeoffList?: string[];
  // 项目部署的合约地址
  address?: string;
  // 合约创建时间
  createTime: number;
  static names(): { [key: string]: string } {
    return {
      projectId: 'project_id',
      bizType: 'biz_type',
      name: 'name',
      symbol: 'symbol',
      description: 'description',
      projectStatus: 'project_status',
      amount: 'amount',
      assetUri: 'asset_uri',
      limitedAmount: 'limited_amount',
      writeOffable: 'write_offable',
      burnable: 'burnable',
      ownerAccount: 'owner_account',
      issuerList: 'issuer_list',
      writeoffList: 'writeoff_list',
      address: 'address',
      createTime: 'create_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      projectId: 'string',
      bizType: 'number',
      name: 'string',
      symbol: 'string',
      description: 'string',
      projectStatus: 'string',
      amount: 'number',
      assetUri: 'string',
      limitedAmount: 'boolean',
      writeOffable: 'boolean',
      burnable: 'boolean',
      ownerAccount: 'string',
      issuerList: { 'type': 'array', 'itemType': 'string' },
      writeoffList: { 'type': 'array', 'itemType': 'string' },
      address: 'string',
      createTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AssetUri定义
export class AssetUriDefinition extends $tea.Model {
  // 数字权证名称
  name: string;
  // 数字权证描述
  description: string;
  // 该权证的图片地址
  image: string;
  // 资产指向外部的链接
  externalUrl?: string;
  // 背景颜色, 16进制6位Hex
  backgroundColor?: string;
  // 动态资源地址，可指向音视频资源，需先上传
  animationUrl?: string;
  // 资源集合，可定义多个组合资源，适合有多资源文件的资产
  resourceBundle?: ResourceBundle[];
  // 自定义的资产属性数组，数组元素需为json格式
  attributes?: string[];
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      description: 'description',
      image: 'image',
      externalUrl: 'external_url',
      backgroundColor: 'background_color',
      animationUrl: 'animation_url',
      resourceBundle: 'resource_bundle',
      attributes: 'attributes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      description: 'string',
      image: 'string',
      externalUrl: 'string',
      backgroundColor: 'string',
      animationUrl: 'string',
      resourceBundle: { 'type': 'array', 'itemType': ResourceBundle },
      attributes: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云数字权证服务信息结构体
export class AliYunDigitalServiceInfo extends $tea.Model {
  // 项目总数
  projectCount?: number;
  // 项目上限
  projectLimit?: number;
  // 资源存储使用量
  storageUsed?: number;
  // 资源存储容量上限
  storageLimit?: number;
  // 日访问流量
  trafficDailyUsed?: number;
  // 日流量上限
  trafficDailyLimit?: number;
  static names(): { [key: string]: string } {
    return {
      projectCount: 'project_count',
      projectLimit: 'project_limit',
      storageUsed: 'storage_used',
      storageLimit: 'storage_limit',
      trafficDailyUsed: 'traffic_daily_used',
      trafficDailyLimit: 'traffic_daily_limit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      projectCount: 'number',
      projectLimit: 'number',
      storageUsed: 'number',
      storageLimit: 'number',
      trafficDailyUsed: 'number',
      trafficDailyLimit: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class JudgeAliyunServiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联盟ID
  consortiumId: string;
  // 蚂蚁链ID
  bizid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      consortiumId: 'consortium_id',
      bizid: 'bizid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      consortiumId: 'string',
      bizid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class JudgeAliyunServiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 0；未开通；
  // 1：开通中；
  // 2：已开通；
  result?: number;
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
      result: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OpenAliyunServiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联盟ID
  consortiumId: string;
  // 蚂蚁链ID
  bizid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      consortiumId: 'consortium_id',
      bizid: 'bizid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      consortiumId: 'string',
      bizid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OpenAliyunServiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 1：开通中； 2：已开通；
  result?: number;
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
      result: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailAliyunServiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 蚂蚁链ID
  bizid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailAliyunServiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数字权证服务详情
  result?: AliYunDigitalServiceInfo;
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
      result: AliYunDigitalServiceInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAliyunProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 蚂蚁链ID
  bizid: string;
  // 项目名称
  name?: string;
  // 项目id
  projectId?: string;
  // 项目状态
  projectStatus?: string;
  // 创建起始日期时间戳
  startTime?: number;
  // 创建结束时间戳
  endTime?: number;
  // 分页页码，默认0
  pageIndex: number;
  // 单页数量，默认10
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      name: 'name',
      projectId: 'project_id',
      projectStatus: 'project_status',
      startTime: 'start_time',
      endTime: 'end_time',
      pageIndex: 'page_index',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      name: 'string',
      projectId: 'string',
      projectStatus: 'string',
      startTime: 'number',
      endTime: 'number',
      pageIndex: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAliyunProjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 权证项目列表
  result?: AliYunDigitalProjectListView;
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
      result: AliYunDigitalProjectListView,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckAliyunAccessRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链id
  bizid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckAliyunAccessResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否是数字权证链
  result?: boolean;
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
      result: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizid: string;
  // 账户名称
  account: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      account: 'account',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      account: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckAccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 账户存在且状态正常
  status?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAccountKmsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链id
  bizid: string;
  // 链账户名称，支持长度100以内的，大小写字母、数字、下划线、横线、@、点
  account: string;
  // 托管账户所在的租户，默认为调用者的租户
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      account: 'account',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      account: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAccountKmsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 账户公钥
  pubKey?: string;
  // 托管秘钥ID
  myKmsId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pubKey: 'pub_key',
      myKmsId: 'my_kms_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pubKey: 'string',
      myKmsId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateResourcePolicyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizid: string;
  // 上传文件名，实际服务端文件名称会使用随机字符串，这里需上传指定后缀的文件
  fileName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      fileName: 'file_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      fileName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateResourcePolicyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 最终上传至服务端的实际文件名称
  name?: string;
  // 用户请求的AccessKey ID
  accessid?: string;
  // 用户发送上传请求的域名。
  host?: string;
  // 用户表单上传的策略（Policy），Policy为经过Ba...
  policy?: string;
  // 对Policy签名后的字符串
  signature?: string;
  // 由服务器端指定的Policy过期时间，格式为Unix时间戳
  expire?: string;
  // 文件类型
  mimeType?: string;
  // 	
  // 限制上传的文件名称
  dir?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      name: 'name',
      accessid: 'accessid',
      host: 'host',
      policy: 'policy',
      signature: 'signature',
      expire: 'expire',
      mimeType: 'mime_type',
      dir: 'dir',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      name: 'string',
      accessid: 'string',
      host: 'string',
      policy: 'string',
      signature: 'string',
      expire: 'string',
      mimeType: 'string',
      dir: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckResourceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizid: string;
  // 创建资源上传规则url时生成的服务端文件名称
  realName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      realName: 'real_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      realName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckResourceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 可公开访问的资源地址。为空则表示暂时无法访问
  accessUrl?: string;
  // upload：文件已上传
  // check：内容检测中
  // invalid：图片不可访问
  // pass：可公开访问
  // publish：已绑定至某个项目
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accessUrl: 'access_url',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accessUrl: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAsseturiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizid: string;
  // 数字权证asset uri定义
  assetUriDefinition: AssetUriDefinition;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      assetUriDefinition: 'asset_uri_definition',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      assetUriDefinition: AssetUriDefinition,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAsseturiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 可公开访问的asseturi地址。
  accessUri?: string;
  // assetUri文件内容
  jsonInfo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accessUri: 'access_uri',
      jsonInfo: 'json_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accessUri: 'string',
      jsonInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizid: string;
  // 数字权证项目ID
  projectId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      projectId: 'project_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      projectId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryProjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询单一数字权证项目返回信息
  result?: DigitalProject;
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
      result: DigitalProject,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizid: string;
  // 项目名称
  name: string;
  // 数字合约symbol，biz_type为5(1155标准)时，可不输入。其他情况必须输入
  symbol?: string;
  // 数字权证项目描述信息
  description?: string;
  // 模版类型
  // 1为共享型，2为独享型，3为共享型(高性能)，4为独享型(高性能)
  // 5为1155标准
  bizType: number;
  // 项目发行权证数量上限，普通版本需设置发行上限，高性能版本无需设置。
  amount?: number;
  // 数字权证链接，共享时必须传入
  assetUri?: string;
  // 是否可增发，普通版本需设置，高性能版本默认为可增发。
  limitedAmount?: boolean;
  // 是否可核销
  writeOffable: boolean;
  // 是否可销毁
  burnable: boolean;
  // 项目管理者，必须是链上已存在的账户，只有管理者可以修改项目信息
  ownerAccount: string;
  // 发行者列表，必须是链上已经存在的账户，只有发行者具备权证发行权限。
  issuerList: string[];
  // 核销者列表，必须是链上已经存在的账户，只有核销者才可以核销权证
  writeoffList?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      name: 'name',
      symbol: 'symbol',
      description: 'description',
      bizType: 'biz_type',
      amount: 'amount',
      assetUri: 'asset_uri',
      limitedAmount: 'limited_amount',
      writeOffable: 'write_offable',
      burnable: 'burnable',
      ownerAccount: 'owner_account',
      issuerList: 'issuer_list',
      writeoffList: 'writeoff_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      name: 'string',
      symbol: 'string',
      description: 'string',
      bizType: 'number',
      amount: 'number',
      assetUri: 'string',
      limitedAmount: 'boolean',
      writeOffable: 'boolean',
      burnable: 'boolean',
      ownerAccount: 'string',
      issuerList: { 'type': 'array', 'itemType': 'string' },
      writeoffList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateProjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 项目id
  projectId?: string;
  // 部署该项目到区块链的hash值
  hash?: string;
  // 该项目在链上部署的合约地址
  address?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      projectId: 'project_id',
      hash: 'hash',
      address: 'address',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      projectId: 'string',
      hash: 'string',
      address: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizid: string;
  // 数字权证项目ID
  projectId: string;
  // 项目发行权证的总数上限。如果设置为可增发，则可以使用增发接口提高总数量上限。
  // 高性能版本不支持修改上限。
  amount?: number;
  // 项目发行后权证数量是否可增发。
  // true:可增发
  // false:不可增发
  // 高性能版本不支持修改此配置
  limitedAmount?: boolean;
  // 项目权证是否可核销。false:不可核销；true:可核销
  writeOffable?: boolean;
  // 项目权证是否可销毁。false:不可销毁；true:可销毁
  burnable?: boolean;
  // 托管账户信息(推荐)，托管和非拖管必选一种
  accountInfo: AccountInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      projectId: 'project_id',
      amount: 'amount',
      limitedAmount: 'limited_amount',
      writeOffable: 'write_offable',
      burnable: 'burnable',
      accountInfo: 'account_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      projectId: 'string',
      amount: 'number',
      limitedAmount: 'boolean',
      writeOffable: 'boolean',
      burnable: 'boolean',
      accountInfo: AccountInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateProjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否更新成功
  result?: boolean;
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
      result: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecContractIssueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizid: string;
  // 数字权证项目ID
  projectId: string;
  // 业务方请求唯一标识，用于异步查询交易情况
  traceId: string;
  // 权证ID，线下生成，保证唯一，asset_id长度限制为64，只支持英文字符和数字
  assetId: string;
  // 数字权证标准URI协议文件，权证信息
  assetUri: string;
  // 权证发行的目标账户
  toAccount: string;
  // 托管账户信息(推荐)，托管和非拖管必选一种
  accountInfo: AccountInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      projectId: 'project_id',
      traceId: 'trace_id',
      assetId: 'asset_id',
      assetUri: 'asset_uri',
      toAccount: 'to_account',
      accountInfo: 'account_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      projectId: 'string',
      traceId: 'string',
      assetId: 'string',
      assetUri: 'string',
      toAccount: 'string',
      accountInfo: AccountInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecContractIssueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户端传入的请求唯一标识
  traceId?: string;
  // 交易hash，可通过hash查询上链结果
  hash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      traceId: 'trace_id',
      hash: 'hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      traceId: 'string',
      hash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListProjectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链id
  bizid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListProjectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 项目ID列表
  idList?: string[];
  // 链上项目总数
  total?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      idList: 'id_list',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      idList: { 'type': 'array', 'itemType': 'string' },
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractTransactionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链id
  bizid: string;
  // 业务方请求唯一标识，用于异步查询交易情况。
  // trace_id 和hash至少选择一种，都输入时，使用trace_id查询
  traceId?: string;
  // 租户id，默认为空
  tenantId?: string;
  // 查询的交易hash
  hash?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      traceId: 'trace_id',
      tenantId: 'tenant_id',
      hash: 'hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      traceId: 'string',
      tenantId: 'string',
      hash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractTransactionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易所在区块高度
  blockNumber?: number;
  // 交易hash
  hash?: string;
  // 该笔交易输入参数(base64编码)
  input?: string;
  // 交易时间戳
  timestamp?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      blockNumber: 'block_number',
      hash: 'hash',
      input: 'input',
      timestamp: 'timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      blockNumber: 'number',
      hash: 'string',
      input: 'string',
      timestamp: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractReceiptRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链id
  bizid: string;
  // 业务方请求唯一标识，用于异步查询交易情况。 trace_id 和hash至少选择一种，都输入时，使用trace_id查询
  traceId?: string;
  // 租户id
  tenantId?: string;
  // 查询的交易hash
  hash?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      traceId: 'trace_id',
      tenantId: 'tenant_id',
      hash: 'hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      traceId: 'string',
      tenantId: 'string',
      hash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractReceiptResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果执行结果code，一般为0则表示交易执行成功，非0则表示交易执行过程中发送了异常
  result?: number;
  // 交易所在区块高度
  blockNumber?: number;
  // 交易hash
  hash?: string;
  // 该笔交易执行的返回值(base64编码)，一般为合约方法中return的值
  output?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
      blockNumber: 'block_number',
      hash: 'hash',
      output: 'output',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: 'number',
      blockNumber: 'number',
      hash: 'string',
      output: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecContractAddsupplyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizid: string;
  // 数字权证项目ID
  projectId: string;
  // 业务方请求唯一标识，用于异步查询交易情况
  traceId: string;
  // 增发数值，非零
  increase: number;
  // 托管账户信息(推荐)，托管和非拖管必选一种
  accountInfo: AccountInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      projectId: 'project_id',
      traceId: 'trace_id',
      increase: 'increase',
      accountInfo: 'account_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      projectId: 'string',
      traceId: 'string',
      increase: 'number',
      accountInfo: AccountInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecContractAddsupplyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户端传入的请求唯一标识
  traceId?: string;
  // 交易hash，可通过hash查询上链结果
  hash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      traceId: 'trace_id',
      hash: 'hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      traceId: 'string',
      hash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecContractTransferRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizid: string;
  // 数字权证项目ID
  projectId: string;
  // 业务方请求唯一标识，用于异步查询交易情况
  traceId: string;
  // 权证所有者账户
  from: string;
  // 转移的目标账户
  to: string;
  // 转移的目标权证
  assetId: string;
  // 托管账户信息(推荐)，托管和非拖管必选一种
  accountInfo: AccountInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      projectId: 'project_id',
      traceId: 'trace_id',
      from: 'from',
      to: 'to',
      assetId: 'asset_id',
      accountInfo: 'account_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      projectId: 'string',
      traceId: 'string',
      from: 'string',
      to: 'string',
      assetId: 'string',
      accountInfo: AccountInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecContractTransferResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户端传入的请求唯一标识
  traceId?: string;
  // 交易hash，可通过hash查询上链结果
  hash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      traceId: 'trace_id',
      hash: 'hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      traceId: 'string',
      hash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecContractWriteoffRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizid: string;
  // 数字权证项目ID
  projectId: string;
  // 业务方请求唯一标识，用于异步查询交易情况
  traceId: string;
  // 被核销的目标权证
  assetId: string;
  // 托管账户信息(推荐)，托管和非拖管必选一种
  accountInfo: AccountInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      projectId: 'project_id',
      traceId: 'trace_id',
      assetId: 'asset_id',
      accountInfo: 'account_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      projectId: 'string',
      traceId: 'string',
      assetId: 'string',
      accountInfo: AccountInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecContractWriteoffResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户端传入的请求唯一标识
  traceId?: string;
  // 交易hash，可通过hash查询上链结果
  hash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      traceId: 'trace_id',
      hash: 'hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      traceId: 'string',
      hash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecContractBurnoffRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizid: string;
  // 数字权证项目ID
  projectId: string;
  // 业务方请求唯一标识，用于异步查询交易情况
  traceId: string;
  // 被销毁的目标权证
  assetId: string;
  // 托管账户信息(推荐)，托管和非拖管必选一种
  accountInfo: AccountInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      projectId: 'project_id',
      traceId: 'trace_id',
      assetId: 'asset_id',
      accountInfo: 'account_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      projectId: 'string',
      traceId: 'string',
      assetId: 'string',
      accountInfo: AccountInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecContractBurnoffResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户端传入的请求唯一标识
  traceId?: string;
  // 交易hash，可通过hash查询上链结果
  hash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      traceId: 'trace_id',
      hash: 'hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      traceId: 'string',
      hash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractAssetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizid: string;
  // 数字权证项目ID
  projectId: string;
  // 业务方请求唯一标识，用于异步查询交易情况
  traceId?: string;
  // 查询的目标账户
  account: string;
  // 托管账户信息(推荐)，托管和非拖管必选一种
  accountInfo: AccountInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      projectId: 'project_id',
      traceId: 'trace_id',
      account: 'account',
      accountInfo: 'account_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      projectId: 'string',
      traceId: 'string',
      account: 'string',
      accountInfo: AccountInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractAssetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户端传入的请求唯一标识
  traceId?: string;
  // 客户端传入的查询账户
  account?: string;
  // 目标账户拥有的权证列表
  assetIdList?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      traceId: 'trace_id',
      account: 'account',
      assetIdList: 'asset_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      traceId: 'string',
      account: 'string',
      assetIdList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractAsseturiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizid: string;
  // 数字权证项目ID
  projectId: string;
  // 业务方请求唯一标识，用于异步查询交易情况
  traceId?: string;
  // 查询的权证ID
  assetId: string;
  // 托管账户信息(推荐)，托管和非拖管必选一种
  accountInfo: AccountInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      projectId: 'project_id',
      traceId: 'trace_id',
      assetId: 'asset_id',
      accountInfo: 'account_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      projectId: 'string',
      traceId: 'string',
      assetId: 'string',
      accountInfo: AccountInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractAsseturiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户端传入的请求唯一标识
  traceId?: string;
  // 客户端传入的权证id
  assetId?: string;
  // 数字权证绑定的标准URI协议文件，权证信息
  assetUri?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      traceId: 'trace_id',
      assetId: 'asset_id',
      assetUri: 'asset_uri',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      traceId: 'string',
      assetId: 'string',
      assetUri: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecContractApproveRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizid: string;
  // 数字权证项目ID
  projectId: string;
  // 业务方请求唯一标识，用于异步查询交易情况
  traceId: string;
  // 被授权的目标权证
  assetId: string;
  // 被授权的目标账户
  toAccount: string;
  // 托管账户信息(推荐)，托管和非拖管必选一种
  accountInfo: AccountInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      projectId: 'project_id',
      traceId: 'trace_id',
      assetId: 'asset_id',
      toAccount: 'to_account',
      accountInfo: 'account_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      projectId: 'string',
      traceId: 'string',
      assetId: 'string',
      toAccount: 'string',
      accountInfo: AccountInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecContractApproveResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户端传入的请求唯一标识
  traceId?: string;
  // 交易hash，可通过hash查询上链结果
  hash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      traceId: 'trace_id',
      hash: 'hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      traceId: 'string',
      hash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelContractApproveRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizid: string;
  // 数字权证项目ID
  projectId: string;
  // 业务方请求唯一标识，用于异步查询交易情况
  traceId: string;
  // 被取消授权的目标权证ID
  assetId: string;
  // 托管账户信息(推荐)，托管和非拖管必选一种
  accountInfo: AccountInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      projectId: 'project_id',
      traceId: 'trace_id',
      assetId: 'asset_id',
      accountInfo: 'account_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      projectId: 'string',
      traceId: 'string',
      assetId: 'string',
      accountInfo: AccountInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelContractApproveResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户端传入的请求唯一标识
  traceId?: string;
  // 交易hash，可通过hash查询上链结果
  hash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      traceId: 'trace_id',
      hash: 'hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      traceId: 'string',
      hash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetContractRoleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizid: string;
  // 数字权证项目ID
  projectId: string;
  // 业务方请求唯一标识，用于异步查询交易情况
  traceId: string;
  // 授权的目标账户
  account: string;
  // 项目中的权证管理角色，目前支持两种：
  // 1.【issuer】发行者角色
  // 2.【writeoff】核销者
  // 输入不区分大小写
  role: string;
  // 托管账户信息(推荐)，托管和非拖管必选一种
  accountInfo: AccountInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      projectId: 'project_id',
      traceId: 'trace_id',
      account: 'account',
      role: 'role',
      accountInfo: 'account_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      projectId: 'string',
      traceId: 'string',
      account: 'string',
      role: 'string',
      accountInfo: AccountInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetContractRoleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户端传入的请求唯一标识
  traceId?: string;
  // 交易hash，可通过hash查询上链结果
  hash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      traceId: 'trace_id',
      hash: 'hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      traceId: 'string',
      hash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelContractRoleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizid: string;
  // 数字权证项目ID
  projectId: string;
  // 业务方请求唯一标识，用于异步查询交易情况
  traceId: string;
  // 被取消的目标账户
  account: string;
  // 被取消的角色，目前支持两种：
  // 1.【issuer】发行者角色 
  // 2.【writeoff】核销者 
  // 输入不区分大小写
  role: string;
  // 托管账户信息(推荐)，托管和非拖管必选一种
  accountInfo: AccountInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      projectId: 'project_id',
      traceId: 'trace_id',
      account: 'account',
      role: 'role',
      accountInfo: 'account_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      projectId: 'string',
      traceId: 'string',
      account: 'string',
      role: 'string',
      accountInfo: AccountInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelContractRoleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户端传入的请求唯一标识
  traceId?: string;
  // 交易hash，可通过hash查询上链结果
  hash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      traceId: 'trace_id',
      hash: 'hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      traceId: 'string',
      hash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecContractBatchissueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizid: string;
  // 数字权证项目ID
  projectId: string;
  // 业务方请求唯一标识，用于异步查询交易情况
  traceId: string;
  // 权证发行的目标账户
  toAccount: string;
  // 批量发行个数，单次最多发行20个，建议多次分批执行
  amount: number;
  // 托管账户信息(推荐)，托管和非拖管必选一种
  accountInfo: AccountInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      projectId: 'project_id',
      traceId: 'trace_id',
      toAccount: 'to_account',
      amount: 'amount',
      accountInfo: 'account_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      projectId: 'string',
      traceId: 'string',
      toAccount: 'string',
      amount: 'number',
      accountInfo: AccountInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecContractBatchissueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户端传入的请求唯一标识
  traceId?: string;
  // 交易hash，可通过hash查询上链结果
  hash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      traceId: 'trace_id',
      hash: 'hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      traceId: 'string',
      hash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecContractListissueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链id
  bizid: string;
  // 数字权证项目ID
  projectId: string;
  // 业务方请求唯一标识，用于异步查询交易情况
  traceId: string;
  // 权证发行的目标账户
  toAccount: string;
  // 批量发行的资产id列表，单次最多发20个，asset_id长度限制为64，只支持英文字符和数字
  assetList: string[];
  // 托管账户信息(推荐)，托管和非拖管必选一种
  accountInfo: AccountInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      projectId: 'project_id',
      traceId: 'trace_id',
      toAccount: 'to_account',
      assetList: 'asset_list',
      accountInfo: 'account_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      projectId: 'string',
      traceId: 'string',
      toAccount: 'string',
      assetList: { 'type': 'array', 'itemType': 'string' },
      accountInfo: AccountInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecContractListissueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户端传入的请求唯一标识
  traceId?: string;
  // 交易hash，可通过hash查询上链结果
  // 
  hash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      traceId: 'trace_id',
      hash: 'hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      traceId: 'string',
      hash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractOwnerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizid: string;
  // 数字权证项目ID
  projectId: string;
  // 业务方请求唯一标识，用于异步查询交易情况
  traceId?: string;
  // 资产ID，如果是1155标准资产，则对应批次id
  assetId: string;
  // 1155标准下，需要填入批次内具体的资产碎片id
  shardId?: string;
  // 托管账户信息(推荐)，托管和非拖管必选一种
  accountInfo: AccountInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      projectId: 'project_id',
      traceId: 'trace_id',
      assetId: 'asset_id',
      shardId: 'shard_id',
      accountInfo: 'account_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      projectId: 'string',
      traceId: 'string',
      assetId: 'string',
      shardId: 'string',
      accountInfo: AccountInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractOwnerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户端传入的请求唯一标识
  traceId?: string;
  // 该资产的拥有者
  account?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      traceId: 'trace_id',
      account: 'account',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      traceId: 'string',
      account: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizid: string;
  // 数字权证项目ID
  projectId: string;
  // 业务方请求唯一标识
  traceId?: string;
  // 资产ID，如果是1155标准资产，则对应批次id
  assetId: string;
  // 1155标准下，需要填入批次内具体的资产碎片id
  shardId?: string;
  // 托管账户信息(推荐)，托管和非拖管必选一种
  accountInfo: AccountInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      projectId: 'project_id',
      traceId: 'trace_id',
      assetId: 'asset_id',
      shardId: 'shard_id',
      accountInfo: 'account_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      projectId: 'string',
      traceId: 'string',
      assetId: 'string',
      shardId: 'string',
      accountInfo: AccountInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryContractStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户端传入的请求唯一标识
  traceId?: string;
  // 资产状态；0：可用；1：已核销；2：已销毁
  status?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      traceId: 'trace_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      traceId: 'string',
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecMultiIssueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链id
  bizid: string;
  // 数字权证项目ID
  projectId: string;
  // 业务方请求唯一标识，可用于异步查询交易情况
  traceId: string;
  // 发行批次ID，线下生成，保证唯一，asset_id长度限制为64，只支持英文字符和数字
  assetId: string;
  // 数字权证标准URI协议文件，权证信息。
  // 首次发行时必填，后续发行(增发)时可不用输入
  assetUri?: string;
  // 该批次权证发行的目标账户
  toAccount: string;
  // 该批次中包含的资产个数
  amount: number;
  // 预留
  data?: string;
  // 托管账户信息(推荐)，托管和非拖管必选一种
  accountInfo: AccountInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      projectId: 'project_id',
      traceId: 'trace_id',
      assetId: 'asset_id',
      assetUri: 'asset_uri',
      toAccount: 'to_account',
      amount: 'amount',
      data: 'data',
      accountInfo: 'account_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      projectId: 'string',
      traceId: 'string',
      assetId: 'string',
      assetUri: 'string',
      toAccount: 'string',
      amount: 'number',
      data: 'string',
      accountInfo: AccountInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecMultiIssueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户端传入的请求唯一标识
  traceId?: string;
  // 交易hash，可通过hash查询上链结果
  hash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      traceId: 'trace_id',
      hash: 'hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      traceId: 'string',
      hash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecMultiTransferRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链id
  bizid: string;
  // 数字权证项目ID
  projectId: string;
  // 业务方请求唯一标识，用于异步查询交易情况
  traceId: string;
  // 权证所有者账户
  from: string;
  // 转移的目标账户
  to: string;
  // 转移的目标权证批次
  assetId: string;
  // 该批次中的资产的唯一编号，客户端不传递则系统采用随机UUID，并从结果返回
  shardId?: string;
  // 预留
  data?: string;
  // 托管账户信息(推荐)，托管和非拖管必选一种
  accountInfo: AccountInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      projectId: 'project_id',
      traceId: 'trace_id',
      from: 'from',
      to: 'to',
      assetId: 'asset_id',
      shardId: 'shard_id',
      data: 'data',
      accountInfo: 'account_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      projectId: 'string',
      traceId: 'string',
      from: 'string',
      to: 'string',
      assetId: 'string',
      shardId: 'string',
      data: 'string',
      accountInfo: AccountInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecMultiTransferResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户端传入的请求唯一标识
  traceId?: string;
  // 交易hash，可通过hash查询上链结果
  // 
  hash?: string;
  // 资产id
  shardId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      traceId: 'trace_id',
      hash: 'hash',
      shardId: 'shard_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      traceId: 'string',
      hash: 'string',
      shardId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecMultiWriteoffRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链id
  bizid: string;
  // 数字权证项目ID
  projectId: string;
  // 业务方请求唯一标识，可用于异步查询交易情况
  traceId: string;
  // 发行批次ID，线下生成，保证唯一，asset_id长度限制为64，只支持英文字符和数字
  assetId: string;
  // 批次资产内每个资产的ID
  shardId: string;
  // 托管账户信息(推荐)，托管和非拖管必选一种
  accountInfo: AccountInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      projectId: 'project_id',
      traceId: 'trace_id',
      assetId: 'asset_id',
      shardId: 'shard_id',
      accountInfo: 'account_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      projectId: 'string',
      traceId: 'string',
      assetId: 'string',
      shardId: 'string',
      accountInfo: AccountInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecMultiWriteoffResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户端传入的请求唯一标识
  traceId?: string;
  // 交易hash，可通过hash查询上链结果
  hash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      traceId: 'trace_id',
      hash: 'hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      traceId: 'string',
      hash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecMultiBurnoffRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizid: string;
  // 数字权证项目ID
  projectId: string;
  // 业务方请求唯一标识，用于异步查询交易情况
  traceId: string;
  // 被销毁的目标权证批次ID
  assetId: string;
  // 该批次内具体的资产id
  shardId: string;
  // 该权证资产的拥有者
  from: string;
  // 托管账户信息(推荐)，托管和非拖管必选一种
  accountInfo: AccountInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizid: 'bizid',
      projectId: 'project_id',
      traceId: 'trace_id',
      assetId: 'asset_id',
      shardId: 'shard_id',
      from: 'from',
      accountInfo: 'account_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizid: 'string',
      projectId: 'string',
      traceId: 'string',
      assetId: 'string',
      shardId: 'string',
      from: 'string',
      accountInfo: AccountInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecMultiBurnoffResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户端传入的请求唯一标识
  traceId?: string;
  // 交易hash，可通过hash查询上链结果
  hash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      traceId: 'trace_id',
      hash: 'hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      traceId: 'string',
      hash: 'string',
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
          sdk_version: "1.2.2",
          _prod_code: "BAASDIGITAL",
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
   * Description: 数字权证服务开通状态检测
   * Summary: 数字权证服务开通状态检测
   */
  async judgeAliyunService(request: JudgeAliyunServiceRequest): Promise<JudgeAliyunServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.judgeAliyunServiceEx(request, headers, runtime);
  }

  /**
   * Description: 数字权证服务开通状态检测
   * Summary: 数字权证服务开通状态检测
   */
  async judgeAliyunServiceEx(request: JudgeAliyunServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<JudgeAliyunServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<JudgeAliyunServiceResponse>(await this.doRequest("1.0", "antchain.baasdigital.aliyun.service.judge", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new JudgeAliyunServiceResponse({}));
  }

  /**
   * Description: 开通数字权证链服务
   * Summary: 开通数字权证链服务
   */
  async openAliyunService(request: OpenAliyunServiceRequest): Promise<OpenAliyunServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.openAliyunServiceEx(request, headers, runtime);
  }

  /**
   * Description: 开通数字权证链服务
   * Summary: 开通数字权证链服务
   */
  async openAliyunServiceEx(request: OpenAliyunServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OpenAliyunServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<OpenAliyunServiceResponse>(await this.doRequest("1.0", "antchain.baasdigital.aliyun.service.open", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OpenAliyunServiceResponse({}));
  }

  /**
   * Description: 查询数字权证服务开通详情
   * Summary: 数字权证服务开通信息详情
   */
  async detailAliyunService(request: DetailAliyunServiceRequest): Promise<DetailAliyunServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailAliyunServiceEx(request, headers, runtime);
  }

  /**
   * Description: 查询数字权证服务开通详情
   * Summary: 数字权证服务开通信息详情
   */
  async detailAliyunServiceEx(request: DetailAliyunServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailAliyunServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailAliyunServiceResponse>(await this.doRequest("1.0", "antchain.baasdigital.aliyun.service.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailAliyunServiceResponse({}));
  }

  /**
   * Description: 查询数字权证项目列表内容
   * Summary: 查询数字权证项目列表内容
   */
  async queryAliyunProject(request: QueryAliyunProjectRequest): Promise<QueryAliyunProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAliyunProjectEx(request, headers, runtime);
  }

  /**
   * Description: 查询数字权证项目列表内容
   * Summary: 查询数字权证项目列表内容
   */
  async queryAliyunProjectEx(request: QueryAliyunProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAliyunProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAliyunProjectResponse>(await this.doRequest("1.0", "antchain.baasdigital.aliyun.project.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAliyunProjectResponse({}));
  }

  /**
   * Description: 检测链ID是否为数字权证链
   * Summary: 检测链ID是否为数字权证链
   */
  async checkAliyunAccess(request: CheckAliyunAccessRequest): Promise<CheckAliyunAccessResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkAliyunAccessEx(request, headers, runtime);
  }

  /**
   * Description: 检测链ID是否为数字权证链
   * Summary: 检测链ID是否为数字权证链
   */
  async checkAliyunAccessEx(request: CheckAliyunAccessRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckAliyunAccessResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckAliyunAccessResponse>(await this.doRequest("1.0", "antchain.baasdigital.aliyun.access.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckAliyunAccessResponse({}));
  }

  /**
   * Description: 检测账户名称是否已经在区块链注册
   * Summary: 检测账户名称是否已经在区块链注册
   */
  async checkAccount(request: CheckAccountRequest): Promise<CheckAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkAccountEx(request, headers, runtime);
  }

  /**
   * Description: 检测账户名称是否已经在区块链注册
   * Summary: 检测账户名称是否已经在区块链注册
   */
  async checkAccountEx(request: CheckAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckAccountResponse>(await this.doRequest("1.0", "antchain.baasdigital.account.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckAccountResponse({}));
  }

  /**
   * Description: 创建MyChain托管账户
   * Summary: 创建MyChain托管账户
   */
  async createAccountKms(request: CreateAccountKmsRequest): Promise<CreateAccountKmsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAccountKmsEx(request, headers, runtime);
  }

  /**
   * Description: 创建MyChain托管账户
   * Summary: 创建MyChain托管账户
   */
  async createAccountKmsEx(request: CreateAccountKmsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAccountKmsResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAccountKmsResponse>(await this.doRequest("1.0", "antchain.baasdigital.account.kms.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAccountKmsResponse({}));
  }

  /**
   * Description: 创建oss上传policy，客户端使用http方式自主上传文件
   * Summary: 创建资源上传规则url
   */
  async createResourcePolicy(request: CreateResourcePolicyRequest): Promise<CreateResourcePolicyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createResourcePolicyEx(request, headers, runtime);
  }

  /**
   * Description: 创建oss上传policy，客户端使用http方式自主上传文件
   * Summary: 创建资源上传规则url
   */
  async createResourcePolicyEx(request: CreateResourcePolicyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateResourcePolicyResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateResourcePolicyResponse>(await this.doRequest("1.0", "antchain.baasdigital.resource.policy.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateResourcePolicyResponse({}));
  }

  /**
   * Description: 上传文件状态检测
   * Summary: 上传文件状态检测
   */
  async checkResource(request: CheckResourceRequest): Promise<CheckResourceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkResourceEx(request, headers, runtime);
  }

  /**
   * Description: 上传文件状态检测
   * Summary: 上传文件状态检测
   */
  async checkResourceEx(request: CheckResourceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckResourceResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckResourceResponse>(await this.doRequest("1.0", "antchain.baasdigital.resource.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckResourceResponse({}));
  }

  /**
   * Description: 定义数字权证AssetUri，包括权证所需各种属性
   * Summary: 定义数字权证AssetUri
   */
  async createAsseturi(request: CreateAsseturiRequest): Promise<CreateAsseturiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAsseturiEx(request, headers, runtime);
  }

  /**
   * Description: 定义数字权证AssetUri，包括权证所需各种属性
   * Summary: 定义数字权证AssetUri
   */
  async createAsseturiEx(request: CreateAsseturiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAsseturiResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAsseturiResponse>(await this.doRequest("1.0", "antchain.baasdigital.asseturi.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAsseturiResponse({}));
  }

  /**
   * Description: 查询单个权证项目信息
   * Summary: 查询单个权证项目信息
   */
  async queryProject(request: QueryProjectRequest): Promise<QueryProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryProjectEx(request, headers, runtime);
  }

  /**
   * Description: 查询单个权证项目信息
   * Summary: 查询单个权证项目信息
   */
  async queryProjectEx(request: QueryProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryProjectResponse>(await this.doRequest("1.0", "antchain.baasdigital.project.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryProjectResponse({}));
  }

  /**
   * Description: 创建数字权证项目
   * Summary: 创建数字权证项目
   */
  async createProject(request: CreateProjectRequest): Promise<CreateProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createProjectEx(request, headers, runtime);
  }

  /**
   * Description: 创建数字权证项目
   * Summary: 创建数字权证项目
   */
  async createProjectEx(request: CreateProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateProjectResponse>(await this.doRequest("1.0", "antchain.baasdigital.project.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateProjectResponse({}));
  }

  /**
   * Description: 更新数字权证项目信息
   * Summary: 更新数字权证项目信息
   */
  async updateProject(request: UpdateProjectRequest): Promise<UpdateProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateProjectEx(request, headers, runtime);
  }

  /**
   * Description: 更新数字权证项目信息
   * Summary: 更新数字权证项目信息
   */
  async updateProjectEx(request: UpdateProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateProjectResponse>(await this.doRequest("1.0", "antchain.baasdigital.project.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateProjectResponse({}));
  }

  /**
   * Description: 数字权证签发(异步)
   * Summary: 数字权证签发(异步)
   */
  async execContractIssue(request: ExecContractIssueRequest): Promise<ExecContractIssueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execContractIssueEx(request, headers, runtime);
  }

  /**
   * Description: 数字权证签发(异步)
   * Summary: 数字权证签发(异步)
   */
  async execContractIssueEx(request: ExecContractIssueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecContractIssueResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecContractIssueResponse>(await this.doRequest("1.0", "antchain.baasdigital.contract.issue.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecContractIssueResponse({}));
  }

  /**
   * Description: 查询所有项目ID列表
   * Summary: 查询所有项目ID列表
   */
  async listProject(request: ListProjectRequest): Promise<ListProjectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listProjectEx(request, headers, runtime);
  }

  /**
   * Description: 查询所有项目ID列表
   * Summary: 查询所有项目ID列表
   */
  async listProjectEx(request: ListProjectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListProjectResponse> {
    Util.validateModel(request);
    return $tea.cast<ListProjectResponse>(await this.doRequest("1.0", "antchain.baasdigital.project.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListProjectResponse({}));
  }

  /**
   * Description: 查询发送到链上的交易内容
   * Summary: 查询交易
   */
  async queryContractTransaction(request: QueryContractTransactionRequest): Promise<QueryContractTransactionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContractTransactionEx(request, headers, runtime);
  }

  /**
   * Description: 查询发送到链上的交易内容
   * Summary: 查询交易
   */
  async queryContractTransactionEx(request: QueryContractTransactionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContractTransactionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContractTransactionResponse>(await this.doRequest("1.0", "antchain.baasdigital.contract.transaction.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContractTransactionResponse({}));
  }

  /**
   * Description: 查询发送到链上的交易执行的结果
   * Summary: 查询交易执行回执
   */
  async queryContractReceipt(request: QueryContractReceiptRequest): Promise<QueryContractReceiptResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContractReceiptEx(request, headers, runtime);
  }

  /**
   * Description: 查询发送到链上的交易执行的结果
   * Summary: 查询交易执行回执
   */
  async queryContractReceiptEx(request: QueryContractReceiptRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContractReceiptResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContractReceiptResponse>(await this.doRequest("1.0", "antchain.baasdigital.contract.receipt.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContractReceiptResponse({}));
  }

  /**
   * Description: 数字权证增发(异步)，高性能版本暂不支持此接口
   * Summary: 数字权证增发(异步)
   */
  async execContractAddsupply(request: ExecContractAddsupplyRequest): Promise<ExecContractAddsupplyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execContractAddsupplyEx(request, headers, runtime);
  }

  /**
   * Description: 数字权证增发(异步)，高性能版本暂不支持此接口
   * Summary: 数字权证增发(异步)
   */
  async execContractAddsupplyEx(request: ExecContractAddsupplyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecContractAddsupplyResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecContractAddsupplyResponse>(await this.doRequest("1.0", "antchain.baasdigital.contract.addsupply.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecContractAddsupplyResponse({}));
  }

  /**
   * Description: 数字权证转移(异步)
   * Summary: 数字权证转移(异步)
   */
  async execContractTransfer(request: ExecContractTransferRequest): Promise<ExecContractTransferResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execContractTransferEx(request, headers, runtime);
  }

  /**
   * Description: 数字权证转移(异步)
   * Summary: 数字权证转移(异步)
   */
  async execContractTransferEx(request: ExecContractTransferRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecContractTransferResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecContractTransferResponse>(await this.doRequest("1.0", "antchain.baasdigital.contract.transfer.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecContractTransferResponse({}));
  }

  /**
   * Description: 数字权证核销(异步)
   * Summary: 数字权证核销(异步)
   */
  async execContractWriteoff(request: ExecContractWriteoffRequest): Promise<ExecContractWriteoffResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execContractWriteoffEx(request, headers, runtime);
  }

  /**
   * Description: 数字权证核销(异步)
   * Summary: 数字权证核销(异步)
   */
  async execContractWriteoffEx(request: ExecContractWriteoffRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecContractWriteoffResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecContractWriteoffResponse>(await this.doRequest("1.0", "antchain.baasdigital.contract.writeoff.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecContractWriteoffResponse({}));
  }

  /**
   * Description: 数字权证销毁(异步)
   * Summary: 数字权证销毁(异步)
   */
  async execContractBurnoff(request: ExecContractBurnoffRequest): Promise<ExecContractBurnoffResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execContractBurnoffEx(request, headers, runtime);
  }

  /**
   * Description: 数字权证销毁(异步)
   * Summary: 数字权证销毁(异步)
   */
  async execContractBurnoffEx(request: ExecContractBurnoffRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecContractBurnoffResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecContractBurnoffResponse>(await this.doRequest("1.0", "antchain.baasdigital.contract.burnoff.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecContractBurnoffResponse({}));
  }

  /**
   * Description: 查询特定账户下的权证信息，高性能版本暂不支持此接口
   * Summary: 查询特定账户下的权证信息
   */
  async queryContractAsset(request: QueryContractAssetRequest): Promise<QueryContractAssetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContractAssetEx(request, headers, runtime);
  }

  /**
   * Description: 查询特定账户下的权证信息，高性能版本暂不支持此接口
   * Summary: 查询特定账户下的权证信息
   */
  async queryContractAssetEx(request: QueryContractAssetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContractAssetResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContractAssetResponse>(await this.doRequest("1.0", "antchain.baasdigital.contract.asset.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContractAssetResponse({}));
  }

  /**
   * Description: 查询特定权证的uri meta信息
   * Summary: 查询特定权证的uri meta信息
   */
  async queryContractAsseturi(request: QueryContractAsseturiRequest): Promise<QueryContractAsseturiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContractAsseturiEx(request, headers, runtime);
  }

  /**
   * Description: 查询特定权证的uri meta信息
   * Summary: 查询特定权证的uri meta信息
   */
  async queryContractAsseturiEx(request: QueryContractAsseturiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContractAsseturiResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContractAsseturiResponse>(await this.doRequest("1.0", "antchain.baasdigital.contract.asseturi.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContractAsseturiResponse({}));
  }

  /**
   * Description: 授权权证给某个账户
   * Summary: 数字权证授权(异步)
   */
  async execContractApprove(request: ExecContractApproveRequest): Promise<ExecContractApproveResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execContractApproveEx(request, headers, runtime);
  }

  /**
   * Description: 授权权证给某个账户
   * Summary: 数字权证授权(异步)
   */
  async execContractApproveEx(request: ExecContractApproveRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecContractApproveResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecContractApproveResponse>(await this.doRequest("1.0", "antchain.baasdigital.contract.approve.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecContractApproveResponse({}));
  }

  /**
   * Description: 取消数字权证授权
   * Summary: 取消数字权证授权(异步)
   */
  async cancelContractApprove(request: CancelContractApproveRequest): Promise<CancelContractApproveResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelContractApproveEx(request, headers, runtime);
  }

  /**
   * Description: 取消数字权证授权
   * Summary: 取消数字权证授权(异步)
   */
  async cancelContractApproveEx(request: CancelContractApproveRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelContractApproveResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelContractApproveResponse>(await this.doRequest("1.0", "antchain.baasdigital.contract.approve.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelContractApproveResponse({}));
  }

  /**
   * Description: 为某个账户授权权证管理角色，目前支持设置【发行者】，【核销者】两种。
  同一个账户可具备多个角色，同一个角色可有多个账户。
   * Summary: 授权项目权证管理角色(异步)
   */
  async setContractRole(request: SetContractRoleRequest): Promise<SetContractRoleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setContractRoleEx(request, headers, runtime);
  }

  /**
   * Description: 为某个账户授权权证管理角色，目前支持设置【发行者】，【核销者】两种。
  同一个账户可具备多个角色，同一个角色可有多个账户。
   * Summary: 授权项目权证管理角色(异步)
   */
  async setContractRoleEx(request: SetContractRoleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetContractRoleResponse> {
    Util.validateModel(request);
    return $tea.cast<SetContractRoleResponse>(await this.doRequest("1.0", "antchain.baasdigital.contract.role.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetContractRoleResponse({}));
  }

  /**
   * Description: 取消某个账户已经拥有的管理角色，目前支持设置【发行者】，【核销者】两种。
   * Summary: 取消项目管理角色(异步)
   */
  async cancelContractRole(request: CancelContractRoleRequest): Promise<CancelContractRoleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelContractRoleEx(request, headers, runtime);
  }

  /**
   * Description: 取消某个账户已经拥有的管理角色，目前支持设置【发行者】，【核销者】两种。
   * Summary: 取消项目管理角色(异步)
   */
  async cancelContractRoleEx(request: CancelContractRoleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelContractRoleResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelContractRoleResponse>(await this.doRequest("1.0", "antchain.baasdigital.contract.role.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelContractRoleResponse({}));
  }

  /**
   * Description: 共享型项目批量发行权证到指定账户，非共享型项目及高性能版本无法使用此接口
   * Summary: 批量发行权证到指定账户(异步)
   */
  async execContractBatchissue(request: ExecContractBatchissueRequest): Promise<ExecContractBatchissueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execContractBatchissueEx(request, headers, runtime);
  }

  /**
   * Description: 共享型项目批量发行权证到指定账户，非共享型项目及高性能版本无法使用此接口
   * Summary: 批量发行权证到指定账户(异步)
   */
  async execContractBatchissueEx(request: ExecContractBatchissueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecContractBatchissueResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecContractBatchissueResponse>(await this.doRequest("1.0", "antchain.baasdigital.contract.batchissue.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecContractBatchissueResponse({}));
  }

  /**
   * Description: 高性能共享型批量发行权证到指定账户，非高性能共享型项目无法使用此接口
   * Summary: 批量发行权证到指定账户(异步)
   */
  async execContractListissue(request: ExecContractListissueRequest): Promise<ExecContractListissueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execContractListissueEx(request, headers, runtime);
  }

  /**
   * Description: 高性能共享型批量发行权证到指定账户，非高性能共享型项目无法使用此接口
   * Summary: 批量发行权证到指定账户(异步)
   */
  async execContractListissueEx(request: ExecContractListissueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecContractListissueResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecContractListissueResponse>(await this.doRequest("1.0", "antchain.baasdigital.contract.listissue.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecContractListissueResponse({}));
  }

  /**
   * Description: 查询特定资产权证的所有者
   * Summary: 查询特定资产权证的所有者
   */
  async queryContractOwner(request: QueryContractOwnerRequest): Promise<QueryContractOwnerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContractOwnerEx(request, headers, runtime);
  }

  /**
   * Description: 查询特定资产权证的所有者
   * Summary: 查询特定资产权证的所有者
   */
  async queryContractOwnerEx(request: QueryContractOwnerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContractOwnerResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContractOwnerResponse>(await this.doRequest("1.0", "antchain.baasdigital.contract.owner.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContractOwnerResponse({}));
  }

  /**
   * Description: 查询特定资产权证的状态。0：可用；1：已核销；2：已销毁
   * Summary: 查询特定资产权证的状态
   */
  async queryContractStatus(request: QueryContractStatusRequest): Promise<QueryContractStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryContractStatusEx(request, headers, runtime);
  }

  /**
   * Description: 查询特定资产权证的状态。0：可用；1：已核销；2：已销毁
   * Summary: 查询特定资产权证的状态
   */
  async queryContractStatusEx(request: QueryContractStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryContractStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryContractStatusResponse>(await this.doRequest("1.0", "antchain.baasdigital.contract.status.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryContractStatusResponse({}));
  }

  /**
   * Description: 数字权证签发(异步)-1155标准专用
   * Summary: 数字权证签发(异步)-1155标准专用
   */
  async execMultiIssue(request: ExecMultiIssueRequest): Promise<ExecMultiIssueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execMultiIssueEx(request, headers, runtime);
  }

  /**
   * Description: 数字权证签发(异步)-1155标准专用
   * Summary: 数字权证签发(异步)-1155标准专用
   */
  async execMultiIssueEx(request: ExecMultiIssueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecMultiIssueResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecMultiIssueResponse>(await this.doRequest("1.0", "antchain.baasdigital.multi.issue.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecMultiIssueResponse({}));
  }

  /**
   * Description: 数字权证转移(异步)-1155标准专用
   * Summary: 数字权证转移(异步)-1155标准专用
   */
  async execMultiTransfer(request: ExecMultiTransferRequest): Promise<ExecMultiTransferResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execMultiTransferEx(request, headers, runtime);
  }

  /**
   * Description: 数字权证转移(异步)-1155标准专用
   * Summary: 数字权证转移(异步)-1155标准专用
   */
  async execMultiTransferEx(request: ExecMultiTransferRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecMultiTransferResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecMultiTransferResponse>(await this.doRequest("1.0", "antchain.baasdigital.multi.transfer.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecMultiTransferResponse({}));
  }

  /**
   * Description: 数字权证核销(异步)-1155标准专用
   * Summary: 数字权证核销(异步)-1155标准专用
   */
  async execMultiWriteoff(request: ExecMultiWriteoffRequest): Promise<ExecMultiWriteoffResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execMultiWriteoffEx(request, headers, runtime);
  }

  /**
   * Description: 数字权证核销(异步)-1155标准专用
   * Summary: 数字权证核销(异步)-1155标准专用
   */
  async execMultiWriteoffEx(request: ExecMultiWriteoffRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecMultiWriteoffResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecMultiWriteoffResponse>(await this.doRequest("1.0", "antchain.baasdigital.multi.writeoff.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecMultiWriteoffResponse({}));
  }

  /**
   * Description: 数字权证销毁(异步)-1155标准专用
   * Summary: 数字权证销毁(异步)-1155标准专用
   */
  async execMultiBurnoff(request: ExecMultiBurnoffRequest): Promise<ExecMultiBurnoffResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execMultiBurnoffEx(request, headers, runtime);
  }

  /**
   * Description: 数字权证销毁(异步)-1155标准专用
   * Summary: 数字权证销毁(异步)-1155标准专用
   */
  async execMultiBurnoffEx(request: ExecMultiBurnoffRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecMultiBurnoffResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecMultiBurnoffResponse>(await this.doRequest("1.0", "antchain.baasdigital.multi.burnoff.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecMultiBurnoffResponse({}));
  }

}
