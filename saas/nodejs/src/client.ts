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

// api信息结构体
export class ApiInfoModel extends $tea.Model {
  // api名称
  apiName: string;
  // API所属网关技术产品码
  prodCode: string;
  // 是否是内部接口 0对外 1对内
  internal: number;
  // api版本号
  apiVersion: string;
  // api描述
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

// 能力信息
export class AbilityInfo extends $tea.Model {
  // 能力编号
  abilityId: string;
  // 能力名称
  abilityName: string;
  // 研发负责人
  devOwner: string;
  // 创建时间
  gmtCreate: string;
  // 描述信息
  description: string;
  // 研发负责人邮箱前缀
  devOwnerPrefixEmail: string;
  // 产品负责人
  productOwner: string;
  // 能力对应商业中台L5Code
  businessCode?: string;
  // apiInfoModels列表
  apiInfoModels: ApiInfoModel[];
  // 能力sla看板url
  slaUrl?: string;
  static names(): { [key: string]: string } {
    return {
      abilityId: 'ability_id',
      abilityName: 'ability_name',
      devOwner: 'dev_owner',
      gmtCreate: 'gmt_create',
      description: 'description',
      devOwnerPrefixEmail: 'dev_owner_prefix_email',
      productOwner: 'product_owner',
      businessCode: 'business_code',
      apiInfoModels: 'api_info_models',
      slaUrl: 'sla_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      abilityId: 'string',
      abilityName: 'string',
      devOwner: 'string',
      gmtCreate: 'string',
      description: 'string',
      devOwnerPrefixEmail: 'string',
      productOwner: 'string',
      businessCode: 'string',
      apiInfoModels: { 'type': 'array', 'itemType': ApiInfoModel },
      slaUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 能力与API关联信息
export class AbilityApiRelation extends $tea.Model {
  // api名称
  apiName: string;
  // 能力列表
  abilityInfoList: AbilityInfo[];
  static names(): { [key: string]: string } {
    return {
      apiName: 'api_name',
      abilityInfoList: 'ability_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiName: 'string',
      abilityInfoList: { 'type': 'array', 'itemType': AbilityInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// api 信息
export class ApiInfo extends $tea.Model {
  // 查询不动产接口
  apiCode: string;
  // api pb文件定义
  apiProtobufDefinition: string;
  static names(): { [key: string]: string } {
    return {
      apiCode: 'api_code',
      apiProtobufDefinition: 'api_protobuf_definition',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiCode: 'string',
      apiProtobufDefinition: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 干系人
export class RelUser extends $tea.Model {
  // 工号
  empId: string;
  // 域账号
  loginName: string;
  // 花名
  nickName: string;
  // 角色，PD-产品经理，DEV-研发
  role: string;
  static names(): { [key: string]: string } {
    return {
      empId: 'emp_id',
      loginName: 'login_name',
      nickName: 'nick_name',
      role: 'role',
    };
  }

  static types(): { [key: string]: any } {
    return {
      empId: 'string',
      loginName: 'string',
      nickName: 'string',
      role: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// sdk的maven依赖信息
export class SdkMavenDependencyInfo extends $tea.Model {
  // client端maven依赖，包含蚂蚁链版本和金融云版本依赖信息
  referenceClient: string;
  // 客户端server端依赖，产品api基于技术产品纬度使用技术客户端sdk构建，此处依赖基本使用不到
  referencServer?: string;
  // client端maven仓库地址
  mavenLinkClient: string;
  // server端maven仓库地址
  mavenLinkServer?: string;
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

// 键值对，兼容map用
export class KeyValuePair extends $tea.Model {
  // key
  key: string;
  // value
  value?: string;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RunMarketServiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务方传入，幂等用。
  bizId: string;
  // saas产品code
  productCode: string;
  // 服务code
  serviceCode: string;
  // 子服务code
  subServiceCode?: string;
  // 服务版本
  serviceVersion: string;
  // 业务参数，map格式
  params?: KeyValuePair[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      productCode: 'product_code',
      serviceCode: 'service_code',
      subServiceCode: 'sub_service_code',
      serviceVersion: 'service_version',
      params: 'params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      productCode: 'string',
      serviceCode: 'string',
      subServiceCode: 'string',
      serviceVersion: 'string',
      params: { 'type': 'array', 'itemType': KeyValuePair },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RunMarketServiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 服务调用结果
  resultData?: KeyValuePair[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultData: 'result_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultData: { 'type': 'array', 'itemType': KeyValuePair },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMarketSolutionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 解决方案code
  solutionCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      solutionCode: 'solution_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      solutionCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMarketSolutionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询结果
  resultData?: KeyValuePair[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultData: 'result_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultData: { 'type': 'array', 'itemType': KeyValuePair },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAbilityWithproductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 产品编码，源自于开放平台OPM定义的技术产品编码
  productCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productCode: 'product_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAbilityWithproductResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 能力列表
  abilityInfoList?: AbilityInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      abilityInfoList: 'ability_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      abilityInfoList: { 'type': 'array', 'itemType': AbilityInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryAbilityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前页码
  current: number;
  // 每页大小
  pageSize: number;
  // 用于能力的搜索标签
  keyword?: string;
  // 网关产品码
  gwProdCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      current: 'current',
      pageSize: 'page_size',
      keyword: 'keyword',
      gwProdCode: 'gw_prod_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      current: 'number',
      pageSize: 'number',
      keyword: 'string',
      gwProdCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryAbilityResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前页码
  current?: number;
  // 当前页大小
  pageSize?: number;
  // 总数
  total?: number;
  // 能力信息列表
  abilityInfoList?: AbilityInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      current: 'current',
      pageSize: 'page_size',
      total: 'total',
      abilityInfoList: 'ability_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      current: 'number',
      pageSize: 'number',
      total: 'number',
      abilityInfoList: { 'type': 'array', 'itemType': AbilityInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindAbilityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // api名称
  apiName: string;
  // 能力id列表
  abilityIds: string[];
  // 操作人的域账号
  operatorId: string;
  // api信息
  apiInfoModel: ApiInfoModel;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiName: 'api_name',
      abilityIds: 'ability_ids',
      operatorId: 'operator_id',
      apiInfoModel: 'api_info_model',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiName: 'string',
      abilityIds: { 'type': 'array', 'itemType': 'string' },
      operatorId: 'string',
      apiInfoModel: ApiInfoModel,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindAbilityResponse extends $tea.Model {
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

export class QueryAbilityWithapinameRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // api名称列表
  apiNameList: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiNameList: 'api_name_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiNameList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAbilityWithapinameResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // api与能力信息关联列表
  abilityApiRelationList?: AbilityApiRelation[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      abilityApiRelationList: 'ability_api_relation_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      abilityApiRelationList: { 'type': 'array', 'itemType': AbilityApiRelation },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackAbilityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // api名称集合
  apiNames: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      apiNames: 'api_names',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      apiNames: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackAbilityResponse extends $tea.Model {
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

export class QueryFoundationProtobufRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 产品码
  productCode: string;
  // api code列表信息
  apiCodeList: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productCode: 'product_code',
      apiCodeList: 'api_code_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productCode: 'string',
      apiCodeList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFoundationProtobufResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // api probuf信息
  apiInfoList?: ApiInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      apiInfoList: 'api_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      apiInfoList: { 'type': 'array', 'itemType': ApiInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAbilityResultcodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 1-INTERNAL_ERROR，2-TOO_MANY_REQUESTS，3-UNKNOW_ERROR，4-ACCESS_DENIED，5-OK，6-CUSTOM_RESULT_CODE_ONE，7-CUSTOM_RESULT_CODE_TWO
  index: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      index: 'index',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      index: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAbilityResultcodeResponse extends $tea.Model {
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

export class BindAbilityApiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 共享能力id
  abilityId: string;
  // qiujianglong.qjl
  operatorId: string;
  // api模型集合
  apiInfoModels: ApiInfoModel[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      abilityId: 'ability_id',
      operatorId: 'operator_id',
      apiInfoModels: 'api_info_models',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      abilityId: 'string',
      operatorId: 'string',
      apiInfoModels: { 'type': 'array', 'itemType': ApiInfoModel },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindAbilityApiResponse extends $tea.Model {
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

export class QueryAbilityBusinesscodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 能力id
  abilityId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      abilityId: 'ability_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      abilityId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAbilityBusinesscodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 能力信息
  abilityInfo?: AbilityInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      abilityInfo: 'ability_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      abilityInfo: AbilityInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBusinessProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商业产品L5编码
  businessCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      businessCode: 'business_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      businessCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBusinessProductResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商业产品sdk客户端的maven依赖信息
  sdkMavenDependencyInfo?: SdkMavenDependencyInfo;
  // 商业产品最新api信息列表，可能与当前版本jar包内api不一致，若发现不一致请在opm商业sdk管理中重新进行打包
  apiInfoModels?: ApiInfoModel[];
  // 已发布中央仓库的版本
  publishVersion?: string;
  // 是否存在运行中的任务，商业产品一次发布中央仓库打包任务，会执行三个子打包任务，上传线下仓库，上传蚂蚁链sdk包至中央仓库，上传金融云sdk包至中央仓库
  taskRunning?: boolean;
  // 最新一次打包任务运行状态RUNNING/SUCCESS/FAILED
  taskStatus?: string;
  // 能力sla看板url
  slaUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sdkMavenDependencyInfo: 'sdk_maven_dependency_info',
      apiInfoModels: 'api_info_models',
      publishVersion: 'publish_version',
      taskRunning: 'task_running',
      taskStatus: 'task_status',
      slaUrl: 'sla_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sdkMavenDependencyInfo: SdkMavenDependencyInfo,
      apiInfoModels: { 'type': 'array', 'itemType': ApiInfoModel },
      publishVersion: 'string',
      taskRunning: 'boolean',
      taskStatus: 'string',
      slaUrl: 'string',
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
          sdk_version: "1.1.25",
          _prod_code: "SAAS",
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
   * Description: SaaS服务调用
   * Summary: SaaS服务调用
   */
  async runMarketService(request: RunMarketServiceRequest): Promise<RunMarketServiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.runMarketServiceEx(request, headers, runtime);
  }

  /**
   * Description: SaaS服务调用
   * Summary: SaaS服务调用
   */
  async runMarketServiceEx(request: RunMarketServiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RunMarketServiceResponse> {
    Util.validateModel(request);
    return $tea.cast<RunMarketServiceResponse>(await this.doRequest("1.0", "antchain.saas.market.service.run", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RunMarketServiceResponse({}));
  }

  /**
   * Description: 查询解决方案，包括能力列表
   * Summary: 查询解决方案，包括能力列表
   */
  async queryMarketSolution(request: QueryMarketSolutionRequest): Promise<QueryMarketSolutionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMarketSolutionEx(request, headers, runtime);
  }

  /**
   * Description: 查询解决方案，包括能力列表
   * Summary: 查询解决方案，包括能力列表
   */
  async queryMarketSolutionEx(request: QueryMarketSolutionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMarketSolutionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMarketSolutionResponse>(await this.doRequest("1.0", "antchain.saas.market.solution.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMarketSolutionResponse({}));
  }

  /**
   * Description: 查询本产品下所有的能力标签
   * Summary: 查询本产品下所有的能力标签
   */
  async queryAbilityWithproduct(request: QueryAbilityWithproductRequest): Promise<QueryAbilityWithproductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAbilityWithproductEx(request, headers, runtime);
  }

  /**
   * Description: 查询本产品下所有的能力标签
   * Summary: 查询本产品下所有的能力标签
   */
  async queryAbilityWithproductEx(request: QueryAbilityWithproductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAbilityWithproductResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAbilityWithproductResponse>(await this.doRequest("1.0", "antchain.saas.ability.withproduct.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAbilityWithproductResponse({}));
  }

  /**
   * Description: 分页查询能力数据
   * Summary: 分页查询能力数据
   */
  async pagequeryAbility(request: PagequeryAbilityRequest): Promise<PagequeryAbilityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryAbilityEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询能力数据
   * Summary: 分页查询能力数据
   */
  async pagequeryAbilityEx(request: PagequeryAbilityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryAbilityResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryAbilityResponse>(await this.doRequest("1.0", "antchain.saas.ability.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryAbilityResponse({}));
  }

  /**
   * Description: 绑定API
   * Summary: 绑定能力与API关系
   */
  async bindAbility(request: BindAbilityRequest): Promise<BindAbilityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindAbilityEx(request, headers, runtime);
  }

  /**
   * Description: 绑定API
   * Summary: 绑定能力与API关系
   */
  async bindAbilityEx(request: BindAbilityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindAbilityResponse> {
    Util.validateModel(request);
    return $tea.cast<BindAbilityResponse>(await this.doRequest("1.0", "antchain.saas.ability.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindAbilityResponse({}));
  }

  /**
   * Description: 根据api名称列表查询能力标签列表
   * Summary: 根据api名称列表查询能力标签列表
   */
  async queryAbilityWithapiname(request: QueryAbilityWithapinameRequest): Promise<QueryAbilityWithapinameResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAbilityWithapinameEx(request, headers, runtime);
  }

  /**
   * Description: 根据api名称列表查询能力标签列表
   * Summary: 根据api名称列表查询能力标签列表
   */
  async queryAbilityWithapinameEx(request: QueryAbilityWithapinameRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAbilityWithapinameResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAbilityWithapinameResponse>(await this.doRequest("1.0", "antchain.saas.ability.withapiname.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAbilityWithapinameResponse({}));
  }

  /**
   * Description: api上线回调接口
   * Summary: api上线回调接口
   */
  async callbackAbility(request: CallbackAbilityRequest): Promise<CallbackAbilityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackAbilityEx(request, headers, runtime);
  }

  /**
   * Description: api上线回调接口
   * Summary: api上线回调接口
   */
  async callbackAbilityEx(request: CallbackAbilityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackAbilityResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackAbilityResponse>(await this.doRequest("1.0", "antchain.saas.ability.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackAbilityResponse({}));
  }

  /**
   * Description: 根据产品码+api code查询api protobuf信息
   * Summary: 查询api protobuf信息（勿删）
   */
  async queryFoundationProtobuf(request: QueryFoundationProtobufRequest): Promise<QueryFoundationProtobufResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFoundationProtobufEx(request, headers, runtime);
  }

  /**
   * Description: 根据产品码+api code查询api protobuf信息
   * Summary: 查询api protobuf信息（勿删）
   */
  async queryFoundationProtobufEx(request: QueryFoundationProtobufRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFoundationProtobufResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFoundationProtobufResponse>(await this.doRequest("1.0", "antchain.saas.foundation.protobuf.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFoundationProtobufResponse({}));
  }

  /**
   * Description: 测试网关结果码和计量接口
   * Summary: 网关结果码测试接口
   */
  async queryAbilityResultcode(request: QueryAbilityResultcodeRequest): Promise<QueryAbilityResultcodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAbilityResultcodeEx(request, headers, runtime);
  }

  /**
   * Description: 测试网关结果码和计量接口
   * Summary: 网关结果码测试接口
   */
  async queryAbilityResultcodeEx(request: QueryAbilityResultcodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAbilityResultcodeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAbilityResultcodeResponse>(await this.doRequest("1.0", "antchain.saas.ability.resultcode.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAbilityResultcodeResponse({}));
  }

  /**
   * Description: 绑定能力的api信息
   * Summary: 绑定能力的api信息
   */
  async bindAbilityApi(request: BindAbilityApiRequest): Promise<BindAbilityApiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindAbilityApiEx(request, headers, runtime);
  }

  /**
   * Description: 绑定能力的api信息
   * Summary: 绑定能力的api信息
   */
  async bindAbilityApiEx(request: BindAbilityApiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindAbilityApiResponse> {
    Util.validateModel(request);
    return $tea.cast<BindAbilityApiResponse>(await this.doRequest("1.0", "antchain.saas.ability.api.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindAbilityApiResponse({}));
  }

  /**
   * Description: 根据能力id查询能力信息
   * Summary: 根据能力id查询能力信息
   */
  async queryAbilityBusinesscode(request: QueryAbilityBusinesscodeRequest): Promise<QueryAbilityBusinesscodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAbilityBusinesscodeEx(request, headers, runtime);
  }

  /**
   * Description: 根据能力id查询能力信息
   * Summary: 根据能力id查询能力信息
   */
  async queryAbilityBusinesscodeEx(request: QueryAbilityBusinesscodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAbilityBusinesscodeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAbilityBusinesscodeResponse>(await this.doRequest("1.0", "antchain.saas.ability.businesscode.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAbilityBusinesscodeResponse({}));
  }

  /**
   * Description: 根据商业编码查询sdk依赖和api信息
   * Summary: 根据商业编码查询sdk依赖和api信息
   */
  async queryBusinessProduct(request: QueryBusinessProductRequest): Promise<QueryBusinessProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBusinessProductEx(request, headers, runtime);
  }

  /**
   * Description: 根据商业编码查询sdk依赖和api信息
   * Summary: 根据商业编码查询sdk依赖和api信息
   */
  async queryBusinessProductEx(request: QueryBusinessProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBusinessProductResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBusinessProductResponse>(await this.doRequest("1.0", "antchain.saas.business.product.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBusinessProductResponse({}));
  }

}
