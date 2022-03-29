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

// 数组元素类型
export class ListItem extends $tea.Model {
  // 参数类型
  type: string;
  // 结构体名称
  structName?: string;
  // 参数示例
  example?: string;
  // 整数最大值
  maximum?: number;
  // 是否包括最大值
  exclusiveMaximum?: boolean;
  // 最小值
  minimum?: number;
  // 是否包括最小值
  exclusiveMinimum?: boolean;
  // 最大长度
  maxLength?: number;
  // 最小长度
  minLength?: number;
  // 模式
  pattern?: string;
  // 最大元素个数
  maxItems?: number;
  // 最小元素数目
  minItems?: number;
  // 枚举类型
  enumValues?: string;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      structName: 'struct_name',
      example: 'example',
      maximum: 'maximum',
      exclusiveMaximum: 'exclusive_maximum',
      minimum: 'minimum',
      exclusiveMinimum: 'exclusive_minimum',
      maxLength: 'max_length',
      minLength: 'min_length',
      pattern: 'pattern',
      maxItems: 'max_items',
      minItems: 'min_items',
      enumValues: 'enum_values',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      structName: 'string',
      example: 'string',
      maximum: 'number',
      exclusiveMaximum: 'boolean',
      minimum: 'number',
      exclusiveMinimum: 'boolean',
      maxLength: 'number',
      minLength: 'number',
      pattern: 'string',
      maxItems: 'number',
      minItems: 'number',
      enumValues: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 参数模型
export class ParamModal extends $tea.Model {
  // api meta数据id
  apiMetaId: string;
  // api版本id
  apiVersionId: string;
  // 数组参数
  listItem?: ListItem[];
  // 结构体id
  fieldStructId?: string;
  // 结构体名称
  fieldStructName?: string;
  // 参数示例
  example?: string;
  // 是否必填
  required: boolean;
  // 最大整数长度
  maximum?: number;
  // 是否包括最大值
  exclusiveMaximum?: boolean;
  // 整数的最小值
  minimum?: number;
  // 是否排除最小值
  exclusiveMinimum?: boolean;
  // 字符串的最大长度
  maxLength?: number;
  // 字符串的最小长度
  minLength?: number;
  // 模式
  pattern?: string;
  // 最大元素数目
  maxItems?: number;
  // 最小元素数目
  minItems?: number;
  // 枚举值
  enumValues?: string;
  // 参数名称
  name: string;
  // 参数类型
  type: string;
  // 参数描述
  description: string;
  // 参数特性
  feature: string;
  static names(): { [key: string]: string } {
    return {
      apiMetaId: 'api_meta_id',
      apiVersionId: 'api_version_id',
      listItem: 'list_item',
      fieldStructId: 'field_struct_id',
      fieldStructName: 'field_struct_name',
      example: 'example',
      required: 'required',
      maximum: 'maximum',
      exclusiveMaximum: 'exclusive_maximum',
      minimum: 'minimum',
      exclusiveMinimum: 'exclusive_minimum',
      maxLength: 'max_length',
      minLength: 'min_length',
      pattern: 'pattern',
      maxItems: 'max_items',
      minItems: 'min_items',
      enumValues: 'enum_values',
      name: 'name',
      type: 'type',
      description: 'description',
      feature: 'feature',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiMetaId: 'string',
      apiVersionId: 'string',
      listItem: { 'type': 'array', 'itemType': ListItem },
      fieldStructId: 'string',
      fieldStructName: 'string',
      example: 'string',
      required: 'boolean',
      maximum: 'number',
      exclusiveMaximum: 'boolean',
      minimum: 'number',
      exclusiveMinimum: 'boolean',
      maxLength: 'number',
      minLength: 'number',
      pattern: 'string',
      maxItems: 'number',
      minItems: 'number',
      enumValues: 'string',
      name: 'string',
      type: 'string',
      description: 'string',
      feature: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// api结果码
export class ResultCodeRequest extends $tea.Model {
  // api版本
  apiVersion: string;
  // api名称
  apiName: string;
  // 外部返回结果码
  code: string;
  // 内部返回结果码
  internalCode: string;
  // 结果码描述
  description?: string;
  // 错误解决方法
  resolution?: string;
  static names(): { [key: string]: string } {
    return {
      apiVersion: 'api_version',
      apiName: 'api_name',
      code: 'code',
      internalCode: 'internal_code',
      description: 'description',
      resolution: 'resolution',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiVersion: 'string',
      apiName: 'string',
      code: 'string',
      internalCode: 'string',
      description: 'string',
      resolution: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// api请求参数体
export class ApiParamRequest extends $tea.Model {
  // api名称
  apiName: string;
  // api版本
  apiVersion: string;
  // 参数名称
  name: string;
  // 目标名称
  targetName?: string;
  // 参数类型
  type: string;
  // 链表信息
  listItem?: ListItem[];
  // 参数示例
  example?: string;
  // 参数描述
  description?: string;
  // 结构体名称
  structName?: string;
  // 最大值
  maximum?: number;
  // 最小值
  minimum?: number;
  // 最大长度
  maxLength?: number;
  // 最小长度
  minLength?: number;
  // 是否必填
  required: boolean;
  // 特性
  feature: string;
  static names(): { [key: string]: string } {
    return {
      apiName: 'api_name',
      apiVersion: 'api_version',
      name: 'name',
      targetName: 'target_name',
      type: 'type',
      listItem: 'list_item',
      example: 'example',
      description: 'description',
      structName: 'struct_name',
      maximum: 'maximum',
      minimum: 'minimum',
      maxLength: 'max_length',
      minLength: 'min_length',
      required: 'required',
      feature: 'feature',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiName: 'string',
      apiVersion: 'string',
      name: 'string',
      targetName: 'string',
      type: 'string',
      listItem: { 'type': 'array', 'itemType': ListItem },
      example: 'string',
      description: 'string',
      structName: 'string',
      maximum: 'number',
      minimum: 'number',
      maxLength: 'number',
      minLength: 'number',
      required: 'boolean',
      feature: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// api参数信息
export class ApiParamInfo extends $tea.Model {
  // api名字
  name: string;
  // api类型
  type: string;
  // 示例
  example: string;
  // api描述
  description: string;
  // 结构体名称
  structName: string;
  // 最大数字
  maximum: number;
  // 最小数字
  minimum: number;
  // 字符串最大长度
  maxLength: number;
  // 最小长度
  minLength: boolean;
  //  是否支持传输文件
  fileTransfer: boolean;
  // 是否为必填字段
  required: boolean;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      type: 'type',
      example: 'example',
      description: 'description',
      structName: 'struct_name',
      maximum: 'maximum',
      minimum: 'minimum',
      maxLength: 'max_length',
      minLength: 'min_length',
      fileTransfer: 'file_transfer',
      required: 'required',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      type: 'string',
      example: 'string',
      description: 'string',
      structName: 'string',
      maximum: 'number',
      minimum: 'number',
      maxLength: 'number',
      minLength: 'boolean',
      fileTransfer: 'boolean',
      required: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// api返回结果
export class ApiResultCodeInfo extends $tea.Model {
  // 返回结果码
  internalCode: string;
  // 外部结果码
  code: string;
  // 返回结果描述
  description: string;
  // 返回结果码解决方案
  resolution: string;
  static names(): { [key: string]: string } {
    return {
      internalCode: 'internal_code',
      code: 'code',
      description: 'description',
      resolution: 'resolution',
    };
  }

  static types(): { [key: string]: any } {
    return {
      internalCode: 'string',
      code: 'string',
      description: 'string',
      resolution: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// k-v对
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

// api分组枚举
export class ApiGroupTypeEnum extends $tea.Model {
  // API分组类型
  code: string;
  // api分组描述
  ddescription?: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      ddescription: 'ddescription',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      ddescription: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Api状态
export class StatusEnum extends $tea.Model {
  // api状态码
  code: string;
  // api状态码描述
  description: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      description: 'description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      description: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 结果码
export class ResultCode extends $tea.Model {
  // meta数据id
  apiMetaId: string;
  // api版本id
  apiVersionId: string;
  // 结果码
  internalCode: string;
  // 外部结果码
  code: string;
  // 返回结果描述
  description: string;
  // 解决错误办法
  resolution: string;
  static names(): { [key: string]: string } {
    return {
      apiMetaId: 'api_meta_id',
      apiVersionId: 'api_version_id',
      internalCode: 'internal_code',
      code: 'code',
      description: 'description',
      resolution: 'resolution',
    };
  }

  static types(): { [key: string]: any } {
    return {
      apiMetaId: 'string',
      apiVersionId: 'string',
      internalCode: 'string',
      code: 'string',
      description: 'string',
      resolution: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分组信息
export class ApiGroup extends $tea.Model {
  // 分组名称
  name: string;
  // 分组描述
  description: string;
  // api类型
  type: ApiGroupTypeEnum;
  // 产品
  providerId: string;
  // 套件id
  apiSuiteId: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      description: 'description',
      type: 'type',
      providerId: 'provider_id',
      apiSuiteId: 'api_suite_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      description: 'string',
      type: ApiGroupTypeEnum,
      providerId: 'string',
      apiSuiteId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Api基础数据
export class ApiMetaRequest extends $tea.Model {
  // 产品码
  providerName: string;
  // 套件版本号
  suiteVersion: string;
  // api分组名称
  groupName: string;
  // api名称
  name: string;
  // 新名字
  newName?: string;
  // api拥有者
  owner: string;
  // api简介
  summary: string;
  // 是否是内部api
  internal: boolean;
  // api版本
  apiVersion: string;
  // api描述
  description?: string;
  // 是否是第三方代理
  thirdPartAuth?: boolean;
  // api状态
  statusEnum: StatusEnum;
  // 扩展参数
  extAttribute?: string;
  static names(): { [key: string]: string } {
    return {
      providerName: 'provider_name',
      suiteVersion: 'suite_version',
      groupName: 'group_name',
      name: 'name',
      newName: 'new_name',
      owner: 'owner',
      summary: 'summary',
      internal: 'internal',
      apiVersion: 'api_version',
      description: 'description',
      thirdPartAuth: 'third_part_auth',
      statusEnum: 'status_enum',
      extAttribute: 'ext_attribute',
    };
  }

  static types(): { [key: string]: any } {
    return {
      providerName: 'string',
      suiteVersion: 'string',
      groupName: 'string',
      name: 'string',
      newName: 'string',
      owner: 'string',
      summary: 'string',
      internal: 'boolean',
      apiVersion: 'string',
      description: 'string',
      thirdPartAuth: 'boolean',
      statusEnum: StatusEnum,
      extAttribute: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 引入参数
export class ImportApiParamsRequest extends $tea.Model {
  // 请求参数
  requestParams?: ApiParamRequest[];
  // 响应参数
  responseParams?: ApiParamRequest[];
  // 返回结果码
  resultCodes?: ResultCodeRequest[];
  // api名称
  apiName: string;
  // api版本
  apiVersion: string;
  static names(): { [key: string]: string } {
    return {
      requestParams: 'request_params',
      responseParams: 'response_params',
      resultCodes: 'result_codes',
      apiName: 'api_name',
      apiVersion: 'api_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestParams: { 'type': 'array', 'itemType': ApiParamRequest },
      responseParams: { 'type': 'array', 'itemType': ApiParamRequest },
      resultCodes: { 'type': 'array', 'itemType': ResultCodeRequest },
      apiName: 'string',
      apiVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// api前端数据
export class ApiFrontendInfo extends $tea.Model {
  // 是否有数据传输
  fileTransfer: boolean;
  // api参数
  requestPathParams: string[];
  // Rest请求的URI，并带有路径参数
  requestUriWithPathParams: string;
  // api参数
  requestParams: ApiParamInfo;
  static names(): { [key: string]: string } {
    return {
      fileTransfer: 'file_transfer',
      requestPathParams: 'request_path_params',
      requestUriWithPathParams: 'request_uri_with_path_params',
      requestParams: 'request_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fileTransfer: 'boolean',
      requestPathParams: { 'type': 'array', 'itemType': 'string' },
      requestUriWithPathParams: 'string',
      requestParams: ApiParamInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// api套件信息
export class ApiSuite extends $tea.Model {
  // 产品码
  providerId: string;
  // 套件版本
  version: string;
  // 是否发布
  released: boolean;
  // 版本号
  versionAlias: string;
  static names(): { [key: string]: string } {
    return {
      providerId: 'provider_id',
      version: 'version',
      released: 'released',
      versionAlias: 'version_alias',
    };
  }

  static types(): { [key: string]: any } {
    return {
      providerId: 'string',
      version: 'string',
      released: 'boolean',
      versionAlias: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// api后台参数
export class ApiBackendInfo extends $tea.Model {
  //  调用方法
  dispatchType: string;
  // TR转发的uniqueid
  uniqueId?: string;
  // TR转发的url
  testUrl?: string;
  // TR转发的路径
  path?: string;
  // 是否跳过鉴权
  skipAuth?: boolean;
  // 后端转发超时时间
  timeout: number;
  // 后端返回参数
  responseParams: ApiParamInfo[];
  // 返回结果码
  resultCodes: ApiResultCodeInfo[];
  static names(): { [key: string]: string } {
    return {
      dispatchType: 'dispatch_type',
      uniqueId: 'unique_id',
      testUrl: 'test_url',
      path: 'path',
      skipAuth: 'skip_auth',
      timeout: 'timeout',
      responseParams: 'response_params',
      resultCodes: 'result_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dispatchType: 'string',
      uniqueId: 'string',
      testUrl: 'string',
      path: 'string',
      skipAuth: 'boolean',
      timeout: 'number',
      responseParams: { 'type': 'array', 'itemType': ApiParamInfo },
      resultCodes: { 'type': 'array', 'itemType': ApiResultCodeInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// api版本请求体
export class ApiVersionRequest extends $tea.Model {
  // 产品名称
  providerName: string;
  // 套件版本
  suiteVersion: string;
  // API名称
  apiName: string;
  // api版本名称
  name: string;
  // api版本描述
  description: string;
  // api转发方式
  dispatchType: string;
  // unique id
  uniquId: string;
  // 测试url
  testUrl?: string;
  // 转发路径
  path?: string;
  // api状态
  status: StatusEnum;
  // 1000
  timeout: number;
  // 请求uri模式
  requestUriPattern?: string;
  // 请求路径参数
  requestPathParams?: string;
  // 方法名称
  requestMethod: string;
  // 支持特性
  feature?: string;
  static names(): { [key: string]: string } {
    return {
      providerName: 'provider_name',
      suiteVersion: 'suite_version',
      apiName: 'api_name',
      name: 'name',
      description: 'description',
      dispatchType: 'dispatch_type',
      uniquId: 'uniqu_id',
      testUrl: 'test_url',
      path: 'path',
      status: 'status',
      timeout: 'timeout',
      requestUriPattern: 'request_uri_pattern',
      requestPathParams: 'request_path_params',
      requestMethod: 'request_method',
      feature: 'feature',
    };
  }

  static types(): { [key: string]: any } {
    return {
      providerName: 'string',
      suiteVersion: 'string',
      apiName: 'string',
      name: 'string',
      description: 'string',
      dispatchType: 'string',
      uniquId: 'string',
      testUrl: 'string',
      path: 'string',
      status: StatusEnum,
      timeout: 'number',
      requestUriPattern: 'string',
      requestPathParams: 'string',
      requestMethod: 'string',
      feature: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// api版本信息
export class ApiVersion extends $tea.Model {
  // 版本名称
  name: string;
  // api版本描述
  description: string;
  // apimeta数据id
  apiMetaId: string;
  // api状态
  status: string;
  // api请求参数
  requestParams?: ParamModal[];
  // api响应参数
  responseParams: ParamModal[];
  // api uri模式
  requestUriPattern?: string;
  // 请求参数路径
  requestPathParams?: string;
  // 请求方法
  requestMethod: string;
  // 具体API请求时，解析出来的路径参数与其对应的值
  // eg. /sofa/mq/msgtype/{id}，如果实际请求为/sofa/mq/msgtype/1，那么返回的map就是 id => 1
  requestPathValues: KeyValuePair[];
  // 请求分发方法
  dispatchType: string;
  // 分发内容
  dispatchContext?: string;
  // 接口特性
  feature?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      description: 'description',
      apiMetaId: 'api_meta_id',
      status: 'status',
      requestParams: 'request_params',
      responseParams: 'response_params',
      requestUriPattern: 'request_uri_pattern',
      requestPathParams: 'request_path_params',
      requestMethod: 'request_method',
      requestPathValues: 'request_path_values',
      dispatchType: 'dispatch_type',
      dispatchContext: 'dispatch_context',
      feature: 'feature',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      description: 'string',
      apiMetaId: 'string',
      status: 'string',
      requestParams: { 'type': 'array', 'itemType': ParamModal },
      responseParams: { 'type': 'array', 'itemType': ParamModal },
      requestUriPattern: 'string',
      requestPathParams: 'string',
      requestMethod: 'string',
      requestPathValues: { 'type': 'array', 'itemType': KeyValuePair },
      dispatchType: 'string',
      dispatchContext: 'string',
      feature: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// api元数据
export class ApiMeta extends $tea.Model {
  // api名字
  name: string;
  // api简介
  summary: string;
  // api负责人
  owner: string;
  // 为true时，不签约的情况下也可以调用
  activationDisabled: boolean;
  // 是否对外展示
  internal: boolean;
  // unique_id
  defaultUniqueId?: string;
  // 调用路径
  defaultHttpPath?: string;
  // 允许使用的用户类型
  allowedUserType?: string;
  // 是否是第三方授权
  thirdPartyAuth: boolean;
  // 动作名称
  actionName: string;
  // 角色名称
  roleName?: string;
  // api描述
  description: string;
  // api状态
  status: string;
  // 产品码
  providerId: string;
  // 分组id
  groupId: string;
  // 套件id
  apiSuiteId: string;
  // 扩展参数
  extAttribute?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      summary: 'summary',
      owner: 'owner',
      activationDisabled: 'activation_disabled',
      internal: 'internal',
      defaultUniqueId: 'default_unique_id',
      defaultHttpPath: 'default_http_path',
      allowedUserType: 'allowed_user_type',
      thirdPartyAuth: 'third_party_auth',
      actionName: 'action_name',
      roleName: 'role_name',
      description: 'description',
      status: 'status',
      providerId: 'provider_id',
      groupId: 'group_id',
      apiSuiteId: 'api_suite_id',
      extAttribute: 'ext_attribute',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      summary: 'string',
      owner: 'string',
      activationDisabled: 'boolean',
      internal: 'boolean',
      defaultUniqueId: 'string',
      defaultHttpPath: 'string',
      allowedUserType: 'string',
      thirdPartyAuth: 'boolean',
      actionName: 'string',
      roleName: 'string',
      description: 'string',
      status: 'string',
      providerId: 'string',
      groupId: 'string',
      apiSuiteId: 'string',
      extAttribute: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 渠道API
export class ChannelApi extends $tea.Model {
  // 渠道名称
  channelName: string;
  // 外部产品码
  productCode: string;
  // 外部服务码
  serviceCode?: string;
  // 外部API名称
  apiName: string;
  // 外部API版本
  apiVersion: string;
  // 鉴权模式
  authType?: string;
  // 鉴权资源表达式
  authExpression?: string;
  // 内部产品码
  innerProviderName: string;
  // 内部API名称
  innerApiName?: string;
  // 内部API版本
  innerApiVersion?: string;
  static names(): { [key: string]: string } {
    return {
      channelName: 'channel_name',
      productCode: 'product_code',
      serviceCode: 'service_code',
      apiName: 'api_name',
      apiVersion: 'api_version',
      authType: 'auth_type',
      authExpression: 'auth_expression',
      innerProviderName: 'inner_provider_name',
      innerApiName: 'inner_api_name',
      innerApiVersion: 'inner_api_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      channelName: 'string',
      productCode: 'string',
      serviceCode: 'string',
      apiName: 'string',
      apiVersion: 'string',
      authType: 'string',
      authExpression: 'string',
      innerProviderName: 'string',
      innerApiName: 'string',
      innerApiVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// api
export class ApiPair extends $tea.Model {
  // api名称
  name: string;
  // api版本
  version: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      version: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApiserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 产品码
  provider: string;
  // 套件
  suite: string;
  // api名字
  apiName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      provider: 'provider',
      suite: 'suite',
      apiName: 'api_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      provider: 'string',
      suite: 'string',
      apiName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryApiserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 套件信息
  apiSuite?: ApiSuite;
  // api基本信息
  apiMeta?: ApiMeta;
  // api版本数据
  apiVersion?: ApiVersion;
  // api分组信息
  apiGroup?: ApiGroup;
  // api请求参数
  requestParams?: ParamModal[];
  // api返回参数
  responseParams?: ParamModal[];
  // 结果码
  resultCodes?: ResultCode[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      apiSuite: 'api_suite',
      apiMeta: 'api_meta',
      apiVersion: 'api_version',
      apiGroup: 'api_group',
      requestParams: 'request_params',
      responseParams: 'response_params',
      resultCodes: 'result_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      apiSuite: ApiSuite,
      apiMeta: ApiMeta,
      apiVersion: ApiVersion,
      apiGroup: ApiGroup,
      requestParams: { 'type': 'array', 'itemType': ParamModal },
      responseParams: { 'type': 'array', 'itemType': ParamModal },
      resultCodes: { 'type': 'array', 'itemType': ResultCode },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportApiserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // api基本信息
  apiMetaRequest: ApiMetaRequest;
  // api版本
  apiVersionRequest: ApiVersionRequest;
  // api请求参数
  importApiParamsRequest?: ImportApiParamsRequest;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      apiMetaRequest: 'api_meta_request',
      apiVersionRequest: 'api_version_request',
      importApiParamsRequest: 'import_api_params_request',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      apiMetaRequest: ApiMetaRequest,
      apiVersionRequest: ApiVersionRequest,
      importApiParamsRequest: ImportApiParamsRequest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportApiserviceResponse extends $tea.Model {
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

export class CreateApiserviceProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 产品码
  prodCode: string;
  // 产品类型
  type?: string;
  // 产品英文名
  name: string;
  // 产品中文名
  chineseName: string;
  // 产品版本
  prodVersion?: string;
  // 产品所有者
  primaryOwnerId: string;
  // 产品描述
  description: string;
  // api提供方类型
  providerType?: string;
  // 产品前缀
  apiNamePrefix?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      prodCode: 'prod_code',
      type: 'type',
      name: 'name',
      chineseName: 'chinese_name',
      prodVersion: 'prod_version',
      primaryOwnerId: 'primary_owner_id',
      description: 'description',
      providerType: 'provider_type',
      apiNamePrefix: 'api_name_prefix',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      prodCode: 'string',
      type: 'string',
      name: 'string',
      chineseName: 'string',
      prodVersion: 'string',
      primaryOwnerId: 'string',
      description: 'string',
      providerType: 'string',
      apiNamePrefix: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateApiserviceProductResponse extends $tea.Model {
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

export class CreateApiserviceGroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 所属产品
  providerName: string;
  // 套件版本
  suiteVersion: string;
  // 分组描述
  description: string;
  // 分组名称
  groupName: string;
  // 分组类型
  apiGroupType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      providerName: 'provider_name',
      suiteVersion: 'suite_version',
      description: 'description',
      groupName: 'group_name',
      apiGroupType: 'api_group_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      providerName: 'string',
      suiteVersion: 'string',
      description: 'string',
      groupName: 'string',
      apiGroupType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateApiserviceGroupResponse extends $tea.Model {
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

export class CreateApiserviceSuiteRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 默认为1.0.0
  suiteVersion?: string;
  // 所属产品名
  providerName: string;
  // 是否已经发布
  released: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      suiteVersion: 'suite_version',
      providerName: 'provider_name',
      released: 'released',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      suiteVersion: 'string',
      providerName: 'string',
      released: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateApiserviceSuiteResponse extends $tea.Model {
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

export class ImportSpecRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // API数据描述，XML文件内容
  content: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportSpecResponse extends $tea.Model {
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

export class ExportSpecRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 产品码
  prodCode: string;
  // api列表
  apis?: ApiPair[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      prodCode: 'prod_code',
      apis: 'apis',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      prodCode: 'string',
      apis: { 'type': 'array', 'itemType': ApiPair },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportSpecResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // spec内容
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

export class GetProviderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 产品码
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

export class GetProviderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // API前缀
  apiNamePrefix?: string;
  // 描述
  description?: string;
  // 是否在开发者中心展示
  developerCenterDisplay?: boolean;
  // Proivder名称，等同于产品码
  name?: string;
  // 产品别名
  nameAlias?: string;
  // 组织机构
  organization?: string;
  // 产品类型
  providerType?: string;
  // 产品状态
  status?: string;
  // 产品简介
  summary?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      apiNamePrefix: 'api_name_prefix',
      description: 'description',
      developerCenterDisplay: 'developer_center_display',
      name: 'name',
      nameAlias: 'name_alias',
      organization: 'organization',
      providerType: 'provider_type',
      status: 'status',
      summary: 'summary',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      apiNamePrefix: 'string',
      description: 'string',
      developerCenterDisplay: 'boolean',
      name: 'string',
      nameAlias: 'string',
      organization: 'string',
      providerType: 'string',
      status: 'string',
      summary: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportChannelapiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 渠道API列表
  apiList: ChannelApi[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      apiList: 'api_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      apiList: { 'type': 'array', 'itemType': ChannelApi },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportChannelapiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 失败列表
  failureList?: ChannelApi[];
  // 失败数量
  failureNum?: number;
  // 成功数量
  successNum?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      failureList: 'failure_list',
      failureNum: 'failure_num',
      successNum: 'success_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      failureList: { 'type': 'array', 'itemType': ChannelApi },
      failureNum: 'number',
      successNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ServiceGatewayCheckRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ServiceGatewayCheckResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 如果正常，返回OK
  status?: string;
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
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportGatewaySpecRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // API数据描述，XML文件内容
  content: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportGatewaySpecResponse extends $tea.Model {
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

export class UpdateGatewayClusterhostRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 产品码
  product: string;
  // 集群名称，对应productInstanceId
  cluster: string;
  // api所属套件版本
  suitVersion: string;
  // api分组名称
  groupName: string;
  // 后端地址
  host: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      product: 'product',
      cluster: 'cluster',
      suitVersion: 'suit_version',
      groupName: 'group_name',
      host: 'host',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      product: 'string',
      cluster: 'string',
      suitVersion: 'string',
      groupName: 'string',
      host: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateGatewayClusterhostResponse extends $tea.Model {
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

export class CreateGatewayStaticrouterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 产品码
  provider: string;
  // 套件版本
  suitVersion: string;
  // 分组名称
  groupName: string;
  // accessKey
  accesskey: string;
  // 后端地址
  host: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      provider: 'provider',
      suitVersion: 'suit_version',
      groupName: 'group_name',
      accesskey: 'accesskey',
      host: 'host',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      provider: 'string',
      suitVersion: 'string',
      groupName: 'string',
      accesskey: 'string',
      host: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateGatewayStaticrouterResponse extends $tea.Model {
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

export class QueryGatewayClusterhostRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 产品码
  product: string;
  // 集群名称，对应productInstanceId
  cluster: string;
  // api所属套件版本
  suitVersion: string;
  // api分组名称
  groupName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      product: 'product',
      cluster: 'cluster',
      suitVersion: 'suit_version',
      groupName: 'group_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      product: 'string',
      cluster: 'string',
      suitVersion: 'string',
      groupName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryGatewayClusterhostResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 后端地址
  host?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      host: 'host',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      host: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportSdkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 产品码
  prodCode: string;
  // SDK语言
  sdkLanguage: string;
  // 版本
  versionOfSdk: string;
  // 依赖详情
  dependencyDetail: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      prodCode: 'prod_code',
      sdkLanguage: 'sdk_language',
      versionOfSdk: 'version_of_sdk',
      dependencyDetail: 'dependency_detail',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      prodCode: 'string',
      sdkLanguage: 'string',
      versionOfSdk: 'string',
      dependencyDetail: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportSdkResponse extends $tea.Model {
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
          sdk_version: "3.2.3",
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
   * Description: 查询api详情
   * Summary: 查询api
   */
  async queryApiservice(request: QueryApiserviceRequest): Promise<QueryApiserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryApiserviceEx(request, headers, runtime);
  }

  /**
   * Description: 查询api详情
   * Summary: 查询api
   */
  async queryApiserviceEx(request: QueryApiserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryApiserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryApiserviceResponse>(await this.doRequest("1.0", "antcloud.openapi.apiservice.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryApiserviceResponse({}));
  }

  /**
   * Description: 导入api信息
   * Summary: 导入api信息
   */
  async importApiservice(request: ImportApiserviceRequest): Promise<ImportApiserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importApiserviceEx(request, headers, runtime);
  }

  /**
   * Description: 导入api信息
   * Summary: 导入api信息
   */
  async importApiserviceEx(request: ImportApiserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportApiserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportApiserviceResponse>(await this.doRequest("1.0", "antcloud.openapi.apiservice.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportApiserviceResponse({}));
  }

  /**
   * Description: 调用apicore创建产品
   * Summary: 创建产品
   */
  async createApiserviceProduct(request: CreateApiserviceProductRequest): Promise<CreateApiserviceProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createApiserviceProductEx(request, headers, runtime);
  }

  /**
   * Description: 调用apicore创建产品
   * Summary: 创建产品
   */
  async createApiserviceProductEx(request: CreateApiserviceProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateApiserviceProductResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateApiserviceProductResponse>(await this.doRequest("1.0", "antcloud.openapi.apiservice.product.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateApiserviceProductResponse({}));
  }

  /**
   * Description: 创建分组
   * Summary: 创建分组
   */
  async createApiserviceGroup(request: CreateApiserviceGroupRequest): Promise<CreateApiserviceGroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createApiserviceGroupEx(request, headers, runtime);
  }

  /**
   * Description: 创建分组
   * Summary: 创建分组
   */
  async createApiserviceGroupEx(request: CreateApiserviceGroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateApiserviceGroupResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateApiserviceGroupResponse>(await this.doRequest("1.0", "antcloud.openapi.apiservice.group.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateApiserviceGroupResponse({}));
  }

  /**
   * Description: 创建suite
   * Summary: 创建suite
   */
  async createApiserviceSuite(request: CreateApiserviceSuiteRequest): Promise<CreateApiserviceSuiteResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createApiserviceSuiteEx(request, headers, runtime);
  }

  /**
   * Description: 创建suite
   * Summary: 创建suite
   */
  async createApiserviceSuiteEx(request: CreateApiserviceSuiteRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateApiserviceSuiteResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateApiserviceSuiteResponse>(await this.doRequest("1.0", "antcloud.openapi.apiservice.suite.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateApiserviceSuiteResponse({}));
  }

  /**
   * Description: 通过XML Spec形式导入产品的API配置
   * Summary: 导入API配置
   */
  async importSpec(request: ImportSpecRequest): Promise<ImportSpecResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importSpecEx(request, headers, runtime);
  }

  /**
   * Description: 通过XML Spec形式导入产品的API配置
   * Summary: 导入API配置
   */
  async importSpecEx(request: ImportSpecRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportSpecResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportSpecResponse>(await this.doRequest("1.0", "antcloud.openapi.spec.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportSpecResponse({}));
  }

  /**
   * Description: 导出Spec
   * Summary: 导出Spec
   */
  async exportSpec(request: ExportSpecRequest): Promise<ExportSpecResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.exportSpecEx(request, headers, runtime);
  }

  /**
   * Description: 导出Spec
   * Summary: 导出Spec
   */
  async exportSpecEx(request: ExportSpecRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExportSpecResponse> {
    Util.validateModel(request);
    return $tea.cast<ExportSpecResponse>(await this.doRequest("1.0", "antcloud.openapi.spec.export", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExportSpecResponse({}));
  }

  /**
   * Description: 获取OpenAPI提供方详情
   * Summary: 获取OpenAPI提供方详情
   */
  async getProvider(request: GetProviderRequest): Promise<GetProviderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getProviderEx(request, headers, runtime);
  }

  /**
   * Description: 获取OpenAPI提供方详情
   * Summary: 获取OpenAPI提供方详情
   */
  async getProviderEx(request: GetProviderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetProviderResponse> {
    Util.validateModel(request);
    return $tea.cast<GetProviderResponse>(await this.doRequest("1.0", "antcloud.openapi.provider.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetProviderResponse({}));
  }

  /**
   * Description: 渠道API导入
   * Summary: 渠道API导入
   */
  async importChannelapi(request: ImportChannelapiRequest): Promise<ImportChannelapiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importChannelapiEx(request, headers, runtime);
  }

  /**
   * Description: 渠道API导入
   * Summary: 渠道API导入
   */
  async importChannelapiEx(request: ImportChannelapiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportChannelapiResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportChannelapiResponse>(await this.doRequest("1.0", "antcloud.openapi.channelapi.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportChannelapiResponse({}));
  }

  /**
   * Description: 检测金融云网关目前的健康状态
   * Summary: 网关健康检查1
   */
  async serviceGatewayCheck(request: ServiceGatewayCheckRequest): Promise<ServiceGatewayCheckResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.serviceGatewayCheckEx(request, headers, runtime);
  }

  /**
   * Description: 检测金融云网关目前的健康状态
   * Summary: 网关健康检查1
   */
  async serviceGatewayCheckEx(request: ServiceGatewayCheckRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ServiceGatewayCheckResponse> {
    Util.validateModel(request);
    return $tea.cast<ServiceGatewayCheckResponse>(await this.doRequest("1.0", "antcloud.openapi.gateway.check.service", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ServiceGatewayCheckResponse({}));
  }

  /**
   * Description: 通过XML Spec形式导入产品的API配置
   * Summary: 导入API配置
   */
  async importGatewaySpec(request: ImportGatewaySpecRequest): Promise<ImportGatewaySpecResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importGatewaySpecEx(request, headers, runtime);
  }

  /**
   * Description: 通过XML Spec形式导入产品的API配置
   * Summary: 导入API配置
   */
  async importGatewaySpecEx(request: ImportGatewaySpecRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportGatewaySpecResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportGatewaySpecResponse>(await this.doRequest("1.0", "antcloud.openapi.gateway.spec.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportGatewaySpecResponse({}));
  }

  /**
   * Description: 更新集群路由host
   * Summary: 更新集群路由host
   */
  async updateGatewayClusterhost(request: UpdateGatewayClusterhostRequest): Promise<UpdateGatewayClusterhostResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateGatewayClusterhostEx(request, headers, runtime);
  }

  /**
   * Description: 更新集群路由host
   * Summary: 更新集群路由host
   */
  async updateGatewayClusterhostEx(request: UpdateGatewayClusterhostRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateGatewayClusterhostResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateGatewayClusterhostResponse>(await this.doRequest("1.0", "antcloud.openapi.gateway.clusterhost.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateGatewayClusterhostResponse({}));
  }

  /**
   * Description: 创建静态路由
   * Summary: 创建静态路由
   */
  async createGatewayStaticrouter(request: CreateGatewayStaticrouterRequest): Promise<CreateGatewayStaticrouterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createGatewayStaticrouterEx(request, headers, runtime);
  }

  /**
   * Description: 创建静态路由
   * Summary: 创建静态路由
   */
  async createGatewayStaticrouterEx(request: CreateGatewayStaticrouterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateGatewayStaticrouterResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateGatewayStaticrouterResponse>(await this.doRequest("1.0", "antcloud.openapi.gateway.staticrouter.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateGatewayStaticrouterResponse({}));
  }

  /**
   * Description: 查询集群路由host
   * Summary: 查询集群路由host
   */
  async queryGatewayClusterhost(request: QueryGatewayClusterhostRequest): Promise<QueryGatewayClusterhostResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryGatewayClusterhostEx(request, headers, runtime);
  }

  /**
   * Description: 查询集群路由host
   * Summary: 查询集群路由host
   */
  async queryGatewayClusterhostEx(request: QueryGatewayClusterhostRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryGatewayClusterhostResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryGatewayClusterhostResponse>(await this.doRequest("1.0", "antcloud.openapi.gateway.clusterhost.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryGatewayClusterhostResponse({}));
  }

  /**
   * Description: 导入SDK信息
   * Summary: 导入SDK信息
   */
  async importSdk(request: ImportSdkRequest): Promise<ImportSdkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importSdkEx(request, headers, runtime);
  }

  /**
   * Description: 导入SDK信息
   * Summary: 导入SDK信息
   */
  async importSdkEx(request: ImportSdkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportSdkResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportSdkResponse>(await this.doRequest("1.0", "antcloud.openapi.sdk.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportSdkResponse({}));
  }

}
