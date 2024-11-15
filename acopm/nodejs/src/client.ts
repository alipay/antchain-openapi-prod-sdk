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

// RateLimitEffectScopeValueDTO
export class RateLimitEffectScopeValueDTO extends $tea.Model {
  // region
  region: string;
  // enabled
  enabled: boolean;
  // limit
  limit: number;
  // timeDuration
  timeDuration: string;
  static names(): { [key: string]: string } {
    return {
      region: 'region',
      enabled: 'enabled',
      limit: 'limit',
      timeDuration: 'time_duration',
    };
  }

  static types(): { [key: string]: any } {
    return {
      region: 'string',
      enabled: 'boolean',
      limit: 'number',
      timeDuration: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// RateLimitEffectScopeDTO
export class RateLimitEffectScopeDTO extends $tea.Model {
  // RateLimitEffectScopeValueDTO list
  values: RateLimitEffectScopeValueDTO[];
  static names(): { [key: string]: string } {
    return {
      values: 'values',
    };
  }

  static types(): { [key: string]: any } {
    return {
      values: { 'type': 'array', 'itemType': RateLimitEffectScopeValueDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商业化规则项
export class BusinessRuleItem extends $tea.Model {
  // 规则表达式
  condition: string;
  // 规则值
  value: string;
  static names(): { [key: string]: string } {
    return {
      condition: 'condition',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      condition: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// updateScopeValue
export class UpdateScopeValue extends $tea.Model {
  // CN-HANGZHOU-FINANCE
  region: string;
  // 限流值
  limit: number;
  // 生效与否
  enabled: boolean;
  // 时间单位
  timeDuration: string;
  static names(): { [key: string]: string } {
    return {
      region: 'region',
      limit: 'limit',
      enabled: 'enabled',
      timeDuration: 'time_duration',
    };
  }

  static types(): { [key: string]: any } {
    return {
      region: 'string',
      limit: 'number',
      enabled: 'boolean',
      timeDuration: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商业化规则
export class BusinessRule extends $tea.Model {
  // 规则类型（BUSINESS/INSTANCE/TENANT_WHITELIST）
  ruleType: string;
  // 规则项列表
  ruleItems: BusinessRuleItem[];
  static names(): { [key: string]: string } {
    return {
      ruleType: 'rule_type',
      ruleItems: 'rule_items',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ruleType: 'string',
      ruleItems: { 'type': 'array', 'itemType': BusinessRuleItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// sdk打包结果
export class MultiSdkItem extends $tea.Model {
  // 任务id
  taskUniqueId: string;
  // 产品码
  prodCode: string;
  // sdk版本
  saassdkVersion: string;
  // sdk语言
  lang: string;
  // 发布仓库
  repo: string;
  // 发布地址
  address: string;
  // 开始时间
  startTme: string;
  // 花费时间
  cost: number;
  // 结束时间
  endTime: string;
  // 打包状态
  status: string;
  // 查看链接
  previewLink?: string;
  // 依赖
  dependency?: string;
  static names(): { [key: string]: string } {
    return {
      taskUniqueId: 'task_unique_id',
      prodCode: 'prod_code',
      saassdkVersion: 'saassdk_version',
      lang: 'lang',
      repo: 'repo',
      address: 'address',
      startTme: 'start_tme',
      cost: 'cost',
      endTime: 'end_time',
      status: 'status',
      previewLink: 'preview_link',
      dependency: 'dependency',
    };
  }

  static types(): { [key: string]: any } {
    return {
      taskUniqueId: 'string',
      prodCode: 'string',
      saassdkVersion: 'string',
      lang: 'string',
      repo: 'string',
      address: 'string',
      startTme: 'string',
      cost: 'number',
      endTime: 'string',
      status: 'string',
      previewLink: 'string',
      dependency: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// UpdateRateLimit
export class UpdateRateLimit extends $tea.Model {
  // api_name
  apiName: string;
  // provider_id
  providerId: string;
  // update_scope_value
  updateScopeValue: UpdateScopeValue;
  static names(): { [key: string]: string } {
    return {
      apiName: 'api_name',
      providerId: 'provider_id',
      updateScopeValue: 'update_scope_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiName: 'string',
      providerId: 'string',
      updateScopeValue: UpdateScopeValue,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// api限流信息
export class RateLimitDetail extends $tea.Model {
  // apiName
  apiName: string;
  // provider_id
  providerId: string;
  // 租户ID
  tenantId?: string;
  // 已使用量
  used?: number;
  // effectScope
  effectScope?: RateLimitEffectScopeDTO;
  static names(): { [key: string]: string } {
    return {
      apiName: 'api_name',
      providerId: 'provider_id',
      tenantId: 'tenant_id',
      used: 'used',
      effectScope: 'effect_scope',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiName: 'string',
      providerId: 'string',
      tenantId: 'string',
      used: 'number',
      effectScope: RateLimitEffectScopeDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// user信息
export class BucUser extends $tea.Model {
  // 工号
  empId: string;
  // 域账号
  emailPrefix: string;
  // 花名
  nickName?: string;
  static names(): { [key: string]: string } {
    return {
      empId: 'emp_id',
      emailPrefix: 'email_prefix',
      nickName: 'nick_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      empId: 'string',
      emailPrefix: 'string',
      nickName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// api信息结构体
export class ApiInfoModel extends $tea.Model {
  // API名称
  apiName: string;
  // 网关产品码
  prodCode: string;
  // 是否是内部接口 0对外 1对内
  internal: number;
  // API版本号
  apiVersion: string;
  // API描述
  apiDesc: string;
  // api所属网关产品id
  providerId: string;
  static names(): { [key: string]: string } {
    return {
      apiName: 'api_name',
      prodCode: 'prod_code',
      internal: 'internal',
      apiVersion: 'api_version',
      apiDesc: 'api_desc',
      providerId: 'provider_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiName: 'string',
      prodCode: 'string',
      internal: 'number',
      apiVersion: 'string',
      apiDesc: 'string',
      providerId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// sdk的maven依赖信息
export class SdkMavenDependencyInfo extends $tea.Model {
  // client端依赖
  referenceClient: string;
  // server端依赖
  referencServer: string;
  // client端maven仓库地址
  mavenLinkClient: string;
  // server端maven仓库地址
  mavenLinkServer: string;
  static names(): { [key: string]: string } {
    return {
      referenceClient: 'reference_client',
      referencServer: 'referenc_server',
      mavenLinkClient: 'maven_link_client',
      mavenLinkServer: 'maven_link_server',
    };
  }

  static types(): { [key: string]: any } {
    return {
      referenceClient: 'string',
      referencServer: 'string',
      mavenLinkClient: 'string',
      mavenLinkServer: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 产品信息
export class ProductInfo extends $tea.Model {
  // 产品码
  prodCode: string;
  // sdk版本号
  sdkVersion: string;
  static names(): { [key: string]: string } {
    return {
      prodCode: 'prod_code',
      sdkVersion: 'sdk_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      prodCode: 'string',
      sdkVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 用户域账号
  userId?: string;
  // 产品关键字
  keyword?: string;
  // 每页记录
  pageSize?: number;
  // 当前页面
  currentPage?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      userId: 'user_id',
      keyword: 'keyword',
      pageSize: 'page_size',
      currentPage: 'current_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      userId: 'string',
      keyword: 'string',
      pageSize: 'number',
      currentPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListProductResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 产品列表
  products?: ProductInfo[];
  // 记录总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      products: 'products',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      products: { 'type': 'array', 'itemType': ProductInfo },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackMultisdkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 回调JSON报文
  body?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      body: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackMultisdkResponse extends $tea.Model {
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

export class CreateProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 产品码
  prodCode: string;
  // 英文名
  nameEn: string;
  // 中文名
  nameCn: string;
  // 描述
  description: string;
  // zoujili.zjl
  ownerId: string;
  // 成员域账号，用于同步权限
  memberList?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      prodCode: 'prod_code',
      nameEn: 'name_en',
      nameCn: 'name_cn',
      description: 'description',
      ownerId: 'owner_id',
      memberList: 'member_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      prodCode: 'string',
      nameEn: 'string',
      nameCn: 'string',
      description: 'string',
      ownerId: 'string',
      memberList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateProductResponse extends $tea.Model {
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

export class InitProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 产品码
  prodCode: string;
  // 品牌名
  firstName: string;
  // 产品标识
  secondName: string;
  // api类型，tr或http(不区分大小写)
  type: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      prodCode: 'prod_code',
      firstName: 'first_name',
      secondName: 'second_name',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      prodCode: 'string',
      firstName: 'string',
      secondName: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitProductResponse extends $tea.Model {
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

export class DeleteProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // YUNYOU
  prodCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      prodCode: 'prod_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      prodCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteProductResponse extends $tea.Model {
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

export class PublishProductSdkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 产品码
  prodCode: string;
  // 版本号。生成的sdk的最终版本号格式为<publish_version>.<platform_origin>
  publishVersion: string;
  // sdk发布请求来源。生成的sdk的最终版本号格式为<publish_version>.<platform_origin>。
  platformOrigin: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      prodCode: 'prod_code',
      publishVersion: 'publish_version',
      platformOrigin: 'platform_origin',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      prodCode: 'string',
      publishVersion: 'string',
      platformOrigin: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishProductSdkResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // maven sdk依赖信息
  sdkMavenDependencyInfo?: SdkMavenDependencyInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sdkMavenDependencyInfo: 'sdk_maven_dependency_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sdkMavenDependencyInfo: SdkMavenDependencyInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSdkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 产品码
  prodCode: string;
  // 版本号
  apiVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      prodCode: 'prod_code',
      apiVersion: 'api_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      prodCode: 'string',
      apiVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSdkResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // xml内容
  content?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishProductSaassdkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 要发布的共享能力名称
  saasCode: string;
  // 本次打包的版本
  saassdkVersion: string;
  // 是否发布
  publish: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      saasCode: 'saas_code',
      saassdkVersion: 'saassdk_version',
      publish: 'publish',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      saasCode: 'string',
      saassdkVersion: 'string',
      publish: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PublishProductSaassdkResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetProductSaassdkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 共享能力码
  saasCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      saasCode: 'saas_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      saasCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetProductSaassdkResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前的sdk版本
  currentVersion?: string;
  // 要发布的版本
  publishVersion?: string;
  // 打包是否正在进行
  taskRunning?: boolean;
  // 已经过发布的sdk
  publishedSdks?: MultiSdkItem[];
  // 任务状态
  taskStatus?: string;
  // 任务码
  taskId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      currentVersion: 'current_version',
      publishVersion: 'publish_version',
      taskRunning: 'task_running',
      publishedSdks: 'published_sdks',
      taskStatus: 'task_status',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      currentVersion: 'string',
      publishVersion: 'string',
      taskRunning: 'boolean',
      publishedSdks: { 'type': 'array', 'itemType': MultiSdkItem },
      taskStatus: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddProductMemberRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // user_id
  memberList: string[];
  // 产品码
  prodCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      memberList: 'member_list',
      prodCode: 'prod_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      memberList: { 'type': 'array', 'itemType': 'string' },
      prodCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddProductMemberResponse extends $tea.Model {
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

export class QueryApiRatelimitRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // api名
  apiNameList: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      apiNameList: 'api_name_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      apiNameList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApiRatelimitResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 限流信息
  rateLimitDetailList?: RateLimitDetail[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rateLimitDetailList: 'rate_limit_detail_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rateLimitDetailList: { 'type': 'array', 'itemType': RateLimitDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTenantRatelimitRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户id
  tenantIdList: string[];
  // api名
  apiNameList: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenantIdList: 'tenant_id_list',
      apiNameList: 'api_name_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenantIdList: { 'type': 'array', 'itemType': 'string' },
      apiNameList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTenantRatelimitResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 限流信息
  rateLimitDetailList?: RateLimitDetail[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      rateLimitDetailList: 'rate_limit_detail_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      rateLimitDetailList: { 'type': 'array', 'itemType': RateLimitDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateApiRatelimitRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // update_limit_list
  updateLimitList: UpdateRateLimit[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      updateLimitList: 'update_limit_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      updateLimitList: { 'type': 'array', 'itemType': UpdateRateLimit },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateApiRatelimitResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // result
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

export class UpdateTenantRatelimitRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户id
  tenantId: string;
  // 更新列表
  updateLimitList: UpdateRateLimit[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenantId: 'tenant_id',
      updateLimitList: 'update_limit_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenantId: 'string',
      updateLimitList: { 'type': 'array', 'itemType': UpdateRateLimit },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTenantRatelimitResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // result
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

export class CallbackJiuzhouPlanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 请求标识
  execId: string;
  // 回调数据
  callBackData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      execId: 'exec_id',
      callBackData: 'call_back_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      execId: 'string',
      callBackData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackJiuzhouPlanResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求标识
  execId?: string;
  // 请求是否成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      execId: 'exec_id',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      execId: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecRobotIntelligentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 请求id
  targetReqMsgId: string;
  // 通知人
  senderStaffId?: string;
  // 回调通知接口
  callUrl?: string;
  // token
  robotToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      targetReqMsgId: 'target_req_msg_id',
      senderStaffId: 'sender_staff_id',
      callUrl: 'call_url',
      robotToken: 'robot_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      targetReqMsgId: 'string',
      senderStaffId: 'string',
      callUrl: 'string',
      robotToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecRobotIntelligentResponse extends $tea.Model {
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

export class UpdateApisStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 待更新的api数组
  apis: string[];
  // 产品码，原字段废弃
  newProductCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      apis: 'apis',
      newProductCode: 'new_product_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      apis: { 'type': 'array', 'itemType': 'string' },
      newProductCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateApisStatusResponse extends $tea.Model {
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

export class QuerySdkApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 商业能力id
  abilityId: string;
  // 发布版本号
  publishVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      abilityId: 'ability_id',
      publishVersion: 'publish_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      abilityId: 'string',
      publishVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySdkApiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前版本sdk包含api信息列表
  apiInfoModels?: ApiInfoModel[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      apiInfoModels: 'api_info_models',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      apiInfoModels: { 'type': 'array', 'itemType': ApiInfoModel },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecRobotBaasplusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 目标请求id
  targetReqId?: string;
  // 目标请求参数
  targetParam?: string;
  // 是否重试
  retryFlag: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      targetReqId: 'target_req_id',
      targetParam: 'target_param',
      retryFlag: 'retry_flag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      targetReqId: 'string',
      targetParam: 'string',
      retryFlag: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecRobotBaasplusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求数据json字符串数组
  reqJsonString?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      reqJsonString: 'req_json_string',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      reqJsonString: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApiDetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // demo
  targetProd: string;
  // demo
  targetApi: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      targetProd: 'target_prod',
      targetApi: 'target_api',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      targetProd: 'string',
      targetApi: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApiDetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // json
  apiDetailJson?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      apiDetailJson: 'api_detail_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      apiDetailJson: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApiOwnerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 网关产品码
  productCode: string;
  // api方法信息
  api: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productCode: 'product_code',
      api: 'api',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productCode: 'string',
      api: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApiOwnerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // buc用户信息
  bucUser?: BucUser;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bucUser: 'buc_user',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bucUser: BucUser,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateGwCacheRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 刷新缓存的key
  cacheKey: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      cacheKey: 'cache_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      cacheKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateGwCacheResponse extends $tea.Model {
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

export class CreateBusinessruleOperateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // api名称
  apiName: string;
  // 规则列表
  rules: BusinessRule[];
  // api版本（可选，传递则表示导入）
  ruleVersion?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      apiName: 'api_name',
      rules: 'rules',
      ruleVersion: 'rule_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      apiName: 'string',
      rules: { 'type': 'array', 'itemType': BusinessRule },
      ruleVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBusinessruleOperateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 版本号
  version?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      version: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class EnableBusinessruleOperateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // api名称
  apiName: string;
  // 环境
  env?: string;
  // 版本（不传为创建新版）
  ruleVersion: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      apiName: 'api_name',
      env: 'env',
      ruleVersion: 'rule_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      apiName: 'string',
      env: 'string',
      ruleVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class EnableBusinessruleOperateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 版本号
  version?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      version: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBusinessruleMatchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 请求的reqMsgId
  requestMsgId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      requestMsgId: 'request_msg_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      requestMsgId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBusinessruleMatchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 最终匹配结果
  matchResult?: string;
  // 出入参信息
  httpContent?: string;
  // 防控结果
  preventResult?: string;
  // 匹配到的L5
  matchBusinessCode?: string;
  // 匹配到的实例id
  matchInstanceId?: string;
  // 规则引擎耗时
  engineTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      matchResult: 'match_result',
      httpContent: 'http_content',
      preventResult: 'prevent_result',
      matchBusinessCode: 'match_business_code',
      matchInstanceId: 'match_instance_id',
      engineTime: 'engine_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      matchResult: 'string',
      httpContent: 'string',
      preventResult: 'string',
      matchBusinessCode: 'string',
      matchInstanceId: 'string',
      engineTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBusinessruleServicesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 提交人域账号
  submitterId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      submitterId: 'submitter_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      submitterId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBusinessruleServicesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // api服务列表
  serviceList?: ApiInfoModel[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      serviceList: 'service_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      serviceList: { 'type': 'array', 'itemType': ApiInfoModel },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetBusinessruleServicesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // api名称
  apiName: string;
  // 版本号（可不填）
  apiVersion?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      apiName: 'api_name',
      apiVersion: 'api_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      apiName: 'string',
      apiVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetBusinessruleServicesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // api元数据（参照facade包中的cn.com.antcloud.opm.service.model.apimng.response.ExportApiResponse结构）
  apiMeta?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      apiMeta: 'api_meta',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      apiMeta: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateInstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 实例ID
  instanceId: string;
  // 需变更的实例状态
  instanceStatus: string;
  // 履约幂等号
  bizNo: string;
  // L5商品编号
  businessCode: string;
  // 规格属性
  specification?: string;
  // 扩展信息
  extensionInfo?: string;
  // 修改时间戳
  versionTimestamp: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      instanceId: 'instance_id',
      instanceStatus: 'instance_status',
      bizNo: 'biz_no',
      businessCode: 'business_code',
      specification: 'specification',
      extensionInfo: 'extension_info',
      versionTimestamp: 'version_timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      instanceId: 'string',
      instanceStatus: 'string',
      bizNo: 'string',
      businessCode: 'string',
      specification: 'string',
      extensionInfo: 'string',
      versionTimestamp: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateInstanceResponse extends $tea.Model {
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

export class UpdateInstanceTenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 实例ID
  instanceId: string;
  // 履约幂等号
  bizNo: string;
  // 租户ID
  tenantId: string;
  // 租户操作
  tenantOperatorEnum: string;
  // 扩展信息
  extensionInfo?: string;
  // 修改时间戳
  versionTimestamp: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      instanceId: 'instance_id',
      bizNo: 'biz_no',
      tenantId: 'tenant_id',
      tenantOperatorEnum: 'tenant_operator_enum',
      extensionInfo: 'extension_info',
      versionTimestamp: 'version_timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      instanceId: 'string',
      bizNo: 'string',
      tenantId: 'string',
      tenantOperatorEnum: 'string',
      extensionInfo: 'string',
      versionTimestamp: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateInstanceTenantResponse extends $tea.Model {
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
          sdk_version: "1.3.39",
          _prod_code: "ACOPM",
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
   * Description: 获取产品列表
   * Summary: 获取产品列表
   */
  async listProduct(request: ListProductRequest): Promise<ListProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listProductEx(request, headers, runtime);
  }

  /**
   * Description: 获取产品列表
   * Summary: 获取产品列表
   */
  async listProductEx(request: ListProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListProductResponse> {
    Util.validateModel(request);
    return $tea.cast<ListProductResponse>(await this.doRequest("1.0", "antcloud.acopm.product.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListProductResponse({}));
  }

  /**
   * Description: 阿里云Tea多语言SDK生成回调
   * Summary: 阿里云Tea多语言SDK生成回调
   */
  async callbackMultisdk(request: CallbackMultisdkRequest): Promise<CallbackMultisdkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackMultisdkEx(request, headers, runtime);
  }

  /**
   * Description: 阿里云Tea多语言SDK生成回调
   * Summary: 阿里云Tea多语言SDK生成回调
   */
  async callbackMultisdkEx(request: CallbackMultisdkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackMultisdkResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackMultisdkResponse>(await this.doRequest("1.0", "antcloud.acopm.multisdk.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackMultisdkResponse({}));
  }

  /**
   * Description: 创建产品
   * Summary: 创建产品
   */
  async createProduct(request: CreateProductRequest): Promise<CreateProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createProductEx(request, headers, runtime);
  }

  /**
   * Description: 创建产品
   * Summary: 创建产品
   */
  async createProductEx(request: CreateProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateProductResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateProductResponse>(await this.doRequest("1.0", "antcloud.acopm.product.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateProductResponse({}));
  }

  /**
   * Description: api初始化
   * Summary: api初始化
   */
  async initProduct(request: InitProductRequest): Promise<InitProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initProductEx(request, headers, runtime);
  }

  /**
   * Description: api初始化
   * Summary: api初始化
   */
  async initProductEx(request: InitProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitProductResponse> {
    Util.validateModel(request);
    return $tea.cast<InitProductResponse>(await this.doRequest("1.0", "antcloud.acopm.product.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitProductResponse({}));
  }

  /**
   * Description: 删除产品
   * Summary: 删除产品
   */
  async deleteProduct(request: DeleteProductRequest): Promise<DeleteProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteProductEx(request, headers, runtime);
  }

  /**
   * Description: 删除产品
   * Summary: 删除产品
   */
  async deleteProductEx(request: DeleteProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteProductResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteProductResponse>(await this.doRequest("1.0", "antcloud.acopm.product.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteProductResponse({}));
  }

  /**
   * Description: 发布sdk
   * Summary: 发布sdk
   */
  async publishProductSdk(request: PublishProductSdkRequest): Promise<PublishProductSdkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.publishProductSdkEx(request, headers, runtime);
  }

  /**
   * Description: 发布sdk
   * Summary: 发布sdk
   */
  async publishProductSdkEx(request: PublishProductSdkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PublishProductSdkResponse> {
    Util.validateModel(request);
    return $tea.cast<PublishProductSdkResponse>(await this.doRequest("1.0", "antcloud.acopm.product.sdk.publish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PublishProductSdkResponse({}));
  }

  /**
   * Description: 获取sdk元数据snapshot
   * Summary: 获取sdk元数据snapshot
   */
  async getSdk(request: GetSdkRequest): Promise<GetSdkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSdkEx(request, headers, runtime);
  }

  /**
   * Description: 获取sdk元数据snapshot
   * Summary: 获取sdk元数据snapshot
   */
  async getSdkEx(request: GetSdkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSdkResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSdkResponse>(await this.doRequest("1.0", "antcloud.acopm.sdk.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSdkResponse({}));
  }

  /**
   * Description: 发布共享能力中心sdk
   * Summary: 共享能力中心sdk发布
   */
  async publishProductSaassdk(request: PublishProductSaassdkRequest): Promise<PublishProductSaassdkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.publishProductSaassdkEx(request, headers, runtime);
  }

  /**
   * Description: 发布共享能力中心sdk
   * Summary: 共享能力中心sdk发布
   */
  async publishProductSaassdkEx(request: PublishProductSaassdkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PublishProductSaassdkResponse> {
    Util.validateModel(request);
    return $tea.cast<PublishProductSaassdkResponse>(await this.doRequest("1.0", "antcloud.acopm.product.saassdk.publish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PublishProductSaassdkResponse({}));
  }

  /**
   * Description: 共享能力中心获取sdk打包结果
   * Summary: 共享能力中心获取sdk打包结果
   */
  async getProductSaassdk(request: GetProductSaassdkRequest): Promise<GetProductSaassdkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getProductSaassdkEx(request, headers, runtime);
  }

  /**
   * Description: 共享能力中心获取sdk打包结果
   * Summary: 共享能力中心获取sdk打包结果
   */
  async getProductSaassdkEx(request: GetProductSaassdkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetProductSaassdkResponse> {
    Util.validateModel(request);
    return $tea.cast<GetProductSaassdkResponse>(await this.doRequest("1.0", "antcloud.acopm.product.saassdk.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetProductSaassdkResponse({}));
  }

  /**
   * Description: 同步产品成员权限
   * Summary: 同步产品成员权限
   */
  async addProductMember(request: AddProductMemberRequest): Promise<AddProductMemberResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addProductMemberEx(request, headers, runtime);
  }

  /**
   * Description: 同步产品成员权限
   * Summary: 同步产品成员权限
   */
  async addProductMemberEx(request: AddProductMemberRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddProductMemberResponse> {
    Util.validateModel(request);
    return $tea.cast<AddProductMemberResponse>(await this.doRequest("1.0", "antcloud.acopm.product.member.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddProductMemberResponse({}));
  }

  /**
   * Description: 查询api限流信息
   * Summary: 查询api限流信息（api）
   */
  async queryApiRatelimit(request: QueryApiRatelimitRequest): Promise<QueryApiRatelimitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryApiRatelimitEx(request, headers, runtime);
  }

  /**
   * Description: 查询api限流信息
   * Summary: 查询api限流信息（api）
   */
  async queryApiRatelimitEx(request: QueryApiRatelimitRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryApiRatelimitResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryApiRatelimitResponse>(await this.doRequest("1.0", "antcloud.acopm.api.ratelimit.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryApiRatelimitResponse({}));
  }

  /**
   * Description:  查询api限流信息
   * Summary:  查询api限流信息（租户维度）
   */
  async queryTenantRatelimit(request: QueryTenantRatelimitRequest): Promise<QueryTenantRatelimitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTenantRatelimitEx(request, headers, runtime);
  }

  /**
   * Description:  查询api限流信息
   * Summary:  查询api限流信息（租户维度）
   */
  async queryTenantRatelimitEx(request: QueryTenantRatelimitRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTenantRatelimitResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTenantRatelimitResponse>(await this.doRequest("1.0", "antcloud.acopm.tenant.ratelimit.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTenantRatelimitResponse({}));
  }

  /**
   * Description: api限流更新
   * Summary: api限流更新（api维度）
   */
  async updateApiRatelimit(request: UpdateApiRatelimitRequest): Promise<UpdateApiRatelimitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateApiRatelimitEx(request, headers, runtime);
  }

  /**
   * Description: api限流更新
   * Summary: api限流更新（api维度）
   */
  async updateApiRatelimitEx(request: UpdateApiRatelimitRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateApiRatelimitResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateApiRatelimitResponse>(await this.doRequest("1.0", "antcloud.acopm.api.ratelimit.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateApiRatelimitResponse({}));
  }

  /**
   * Description: api限流更新
   * Summary: api限流更新（租户维度）
   */
  async updateTenantRatelimit(request: UpdateTenantRatelimitRequest): Promise<UpdateTenantRatelimitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateTenantRatelimitEx(request, headers, runtime);
  }

  /**
   * Description: api限流更新
   * Summary: api限流更新（租户维度）
   */
  async updateTenantRatelimitEx(request: UpdateTenantRatelimitRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateTenantRatelimitResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateTenantRatelimitResponse>(await this.doRequest("1.0", "antcloud.acopm.tenant.ratelimit.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateTenantRatelimitResponse({}));
  }

  /**
   * Description: 九州工单回调接口
   * Summary: 九州工单回调接口
   */
  async callbackJiuzhouPlan(request: CallbackJiuzhouPlanRequest): Promise<CallbackJiuzhouPlanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackJiuzhouPlanEx(request, headers, runtime);
  }

  /**
   * Description: 九州工单回调接口
   * Summary: 九州工单回调接口
   */
  async callbackJiuzhouPlanEx(request: CallbackJiuzhouPlanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackJiuzhouPlanResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackJiuzhouPlanResponse>(await this.doRequest("1.0", "antcloud.acopm.jiuzhou.plan.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackJiuzhouPlanResponse({}));
  }

  /**
   * Description: 智能排障机器人接口
   * Summary: 排障机器人接口
   */
  async execRobotIntelligent(request: ExecRobotIntelligentRequest): Promise<ExecRobotIntelligentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execRobotIntelligentEx(request, headers, runtime);
  }

  /**
   * Description: 智能排障机器人接口
   * Summary: 排障机器人接口
   */
  async execRobotIntelligentEx(request: ExecRobotIntelligentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecRobotIntelligentResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecRobotIntelligentResponse>(await this.doRequest("1.0", "antcloud.acopm.robot.intelligent.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecRobotIntelligentResponse({}));
  }

  /**
   * Description: 生产环境api状态更新
   * Summary: 生产环境api状态更新
   */
  async updateApisStatus(request: UpdateApisStatusRequest): Promise<UpdateApisStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateApisStatusEx(request, headers, runtime);
  }

  /**
   * Description: 生产环境api状态更新
   * Summary: 生产环境api状态更新
   */
  async updateApisStatusEx(request: UpdateApisStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateApisStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateApisStatusResponse>(await this.doRequest("1.0", "antcloud.acopm.apis.status.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateApisStatusResponse({}));
  }

  /**
   * Description: 查询商业产品sdk版本api信息
   * Summary: 查询商业产品sdk版本api信息
   */
  async querySdkApi(request: QuerySdkApiRequest): Promise<QuerySdkApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySdkApiEx(request, headers, runtime);
  }

  /**
   * Description: 查询商业产品sdk版本api信息
   * Summary: 查询商业产品sdk版本api信息
   */
  async querySdkApiEx(request: QuerySdkApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySdkApiResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySdkApiResponse>(await this.doRequest("1.0", "antcloud.acopm.sdk.api.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySdkApiResponse({}));
  }

  /**
   * Description: 企业认证排障
   * Summary: 企业认证排障
   */
  async execRobotBaasplus(request: ExecRobotBaasplusRequest): Promise<ExecRobotBaasplusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execRobotBaasplusEx(request, headers, runtime);
  }

  /**
   * Description: 企业认证排障
   * Summary: 企业认证排障
   */
  async execRobotBaasplusEx(request: ExecRobotBaasplusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecRobotBaasplusResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecRobotBaasplusResponse>(await this.doRequest("1.0", "antcloud.acopm.robot.baasplus.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecRobotBaasplusResponse({}));
  }

  /**
   * Description: api数据获取
   * Summary: api数据获取
   */
  async queryApiDetail(request: QueryApiDetailRequest): Promise<QueryApiDetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryApiDetailEx(request, headers, runtime);
  }

  /**
   * Description: api数据获取
   * Summary: api数据获取
   */
  async queryApiDetailEx(request: QueryApiDetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryApiDetailResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryApiDetailResponse>(await this.doRequest("1.0", "antcloud.acopm.api.detail.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryApiDetailResponse({}));
  }

  /**
   * Description: 查询api负责人信息
   * Summary: 查询api负责人信息
   */
  async queryApiOwner(request: QueryApiOwnerRequest): Promise<QueryApiOwnerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryApiOwnerEx(request, headers, runtime);
  }

  /**
   * Description: 查询api负责人信息
   * Summary: 查询api负责人信息
   */
  async queryApiOwnerEx(request: QueryApiOwnerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryApiOwnerResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryApiOwnerResponse>(await this.doRequest("1.0", "antcloud.acopm.api.owner.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryApiOwnerResponse({}));
  }

  /**
   * Description: 请求刷新gw的缓存
   * Summary: 网关运行态gw cache刷新
   */
  async updateGwCache(request: UpdateGwCacheRequest): Promise<UpdateGwCacheResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateGwCacheEx(request, headers, runtime);
  }

  /**
   * Description: 请求刷新gw的缓存
   * Summary: 网关运行态gw cache刷新
   */
  async updateGwCacheEx(request: UpdateGwCacheRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateGwCacheResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateGwCacheResponse>(await this.doRequest("1.0", "antcloud.acopm.gw.cache.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateGwCacheResponse({}));
  }

  /**
   * Description: 商业化规则创建
   * Summary: 商业化规则创建
   */
  async createBusinessruleOperate(request: CreateBusinessruleOperateRequest): Promise<CreateBusinessruleOperateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBusinessruleOperateEx(request, headers, runtime);
  }

  /**
   * Description: 商业化规则创建
   * Summary: 商业化规则创建
   */
  async createBusinessruleOperateEx(request: CreateBusinessruleOperateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBusinessruleOperateResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBusinessruleOperateResponse>(await this.doRequest("1.0", "antcloud.acopm.businessrule.operate.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBusinessruleOperateResponse({}));
  }

  /**
   * Description: 生效商业化规则
   * Summary: 生效商业化规则
   */
  async enableBusinessruleOperate(request: EnableBusinessruleOperateRequest): Promise<EnableBusinessruleOperateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.enableBusinessruleOperateEx(request, headers, runtime);
  }

  /**
   * Description: 生效商业化规则
   * Summary: 生效商业化规则
   */
  async enableBusinessruleOperateEx(request: EnableBusinessruleOperateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<EnableBusinessruleOperateResponse> {
    Util.validateModel(request);
    return $tea.cast<EnableBusinessruleOperateResponse>(await this.doRequest("1.0", "antcloud.acopm.businessrule.operate.enable", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new EnableBusinessruleOperateResponse({}));
  }

  /**
   * Description: 查询规则匹配情况
   * Summary: 查询规则匹配情况
   */
  async queryBusinessruleMatch(request: QueryBusinessruleMatchRequest): Promise<QueryBusinessruleMatchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBusinessruleMatchEx(request, headers, runtime);
  }

  /**
   * Description: 查询规则匹配情况
   * Summary: 查询规则匹配情况
   */
  async queryBusinessruleMatchEx(request: QueryBusinessruleMatchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBusinessruleMatchResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBusinessruleMatchResponse>(await this.doRequest("1.0", "antcloud.acopm.businessrule.match.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBusinessruleMatchResponse({}));
  }

  /**
   * Description: 查询当前登录人有权限的服务列表
   * Summary: 查询当前登录人有权限的服务列表
   */
  async queryBusinessruleServices(request: QueryBusinessruleServicesRequest): Promise<QueryBusinessruleServicesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBusinessruleServicesEx(request, headers, runtime);
  }

  /**
   * Description: 查询当前登录人有权限的服务列表
   * Summary: 查询当前登录人有权限的服务列表
   */
  async queryBusinessruleServicesEx(request: QueryBusinessruleServicesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBusinessruleServicesResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBusinessruleServicesResponse>(await this.doRequest("1.0", "antcloud.acopm.businessrule.services.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBusinessruleServicesResponse({}));
  }

  /**
   * Description: 查询单个服务的参数/返回等元信息
   * Summary: 查询单个服务的参数/返回等元信息
   */
  async getBusinessruleServices(request: GetBusinessruleServicesRequest): Promise<GetBusinessruleServicesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getBusinessruleServicesEx(request, headers, runtime);
  }

  /**
   * Description: 查询单个服务的参数/返回等元信息
   * Summary: 查询单个服务的参数/返回等元信息
   */
  async getBusinessruleServicesEx(request: GetBusinessruleServicesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetBusinessruleServicesResponse> {
    Util.validateModel(request);
    return $tea.cast<GetBusinessruleServicesResponse>(await this.doRequest("1.0", "antcloud.acopm.businessrule.services.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetBusinessruleServicesResponse({}));
  }

  /**
   * Description: 实例更新
   * Summary: 实例更新
   */
  async updateInstance(request: UpdateInstanceRequest): Promise<UpdateInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateInstanceEx(request, headers, runtime);
  }

  /**
   * Description: 实例更新
   * Summary: 实例更新
   */
  async updateInstanceEx(request: UpdateInstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateInstanceResponse>(await this.doRequest("1.0", "antcloud.acopm.instance.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateInstanceResponse({}));
  }

  /**
   * Description: 租户实例更新
   * Summary: 租户实例更新
   */
  async updateInstanceTenant(request: UpdateInstanceTenantRequest): Promise<UpdateInstanceTenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateInstanceTenantEx(request, headers, runtime);
  }

  /**
   * Description: 租户实例更新
   * Summary: 租户实例更新
   */
  async updateInstanceTenantEx(request: UpdateInstanceTenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateInstanceTenantResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateInstanceTenantResponse>(await this.doRequest("1.0", "antcloud.acopm.instance.tenant.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateInstanceTenantResponse({}));
  }

}
