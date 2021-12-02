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

// 由于OP不支持MAP对象，此对象用来模拟Map中的Entry
export class MapStringToStringEntry extends $tea.Model {
  // key
  key: string;
  // value
  value: string;
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

// 查询的条件
export class Condition extends $tea.Model {
  // 用于查询条件的字段
  field: string;
  // 查询操作符
  operator: string;
  // 由于OP限制，此字段无法直接使用数组。请务必使用能够解析的JSON数组
  values: string;
  static names(): { [key: string]: string } {
    return {
      field: 'field',
      operator: 'operator',
      values: 'values',
    };
  }

  static types(): { [key: string]: any } {
    return {
      field: 'string',
      operator: 'string',
      values: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 字段组
export class AttributeGroup extends $tea.Model {
  // id
  uniqueId: string;
  // name
  name: string;
  // display_name
  displayName?: string;
  // display_properties
  displayProperties?: string;
  static names(): { [key: string]: string } {
    return {
      uniqueId: 'unique_id',
      name: 'name',
      displayName: 'display_name',
      displayProperties: 'display_properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uniqueId: 'string',
      name: 'string',
      displayName: 'string',
      displayProperties: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 模型字段（属性）
export class Attribute extends $tea.Model {
  // 所属模型的唯一标识
  modelId: string;
  // 唯一标识（所属模型内唯一）
  uniqueId: string;
  // 名称（所属模型内唯一）
  name: string;
  // 描述
  description?: string;
  // 类型【取值范围：INTEGER，LONG，DOUBLE，FLOAT，BOOLEAN，STRING，DATE，DATETIME，ENUM，ARRAY】
  type: string;
  // 是否为系统内置
  system: boolean;
  // 是否只读
  readonly: boolean;
  // 是否必填
  required: boolean;
  // 用于前端展示排序，数字越大优先级越高，默认为 0
  priority: number;
  // 用于前端展示的扩展属性
  displayProperties?: MapStringToStringEntry[];
  // 创建时间
  createdTime: string;
  // 修改时间
  modifiedTime: string;
  // 字段分组Id
  groupId: string;
  static names(): { [key: string]: string } {
    return {
      modelId: 'model_id',
      uniqueId: 'unique_id',
      name: 'name',
      description: 'description',
      type: 'type',
      system: 'system',
      readonly: 'readonly',
      required: 'required',
      priority: 'priority',
      displayProperties: 'display_properties',
      createdTime: 'created_time',
      modifiedTime: 'modified_time',
      groupId: 'group_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      modelId: 'string',
      uniqueId: 'string',
      name: 'string',
      description: 'string',
      type: 'string',
      system: 'boolean',
      readonly: 'boolean',
      required: 'boolean',
      priority: 'number',
      displayProperties: { 'type': 'array', 'itemType': MapStringToStringEntry },
      createdTime: 'string',
      modifiedTime: 'string',
      groupId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 模型分组
export class ModelCategory extends $tea.Model {
  // 唯一标识（全局唯一）
  uniqueId: string;
  // 名称（全局唯一）
  name: string;
  // 是否为系统内置
  system: boolean;
  // 创建时间
  createdTime: string;
  // 修改时间
  modifiedTime: string;
  // icon
  icon?: string;
  static names(): { [key: string]: string } {
    return {
      uniqueId: 'unique_id',
      name: 'name',
      system: 'system',
      createdTime: 'created_time',
      modifiedTime: 'modified_time',
      icon: 'icon',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uniqueId: 'string',
      name: 'string',
      system: 'boolean',
      createdTime: 'string',
      modifiedTime: 'string',
      icon: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 模型关联
export class ModelRelationship extends $tea.Model {
  // 目标模型的唯一标识
  destinationModelId: string;
  // 源模型的唯一标识（目标模型内唯一）
  sourceModelId: string;
  // 唯一标识（目标模型内唯一，等同于目标模型中与源模型建立关联的外键属性）
  uniqueId: string;
  // 描述
  description?: string;
  // 关联类型【取值范围：ONE_TO_ONE，ONE_TO_MANY】
  relationType: string;
  // 是否为系统内置
  system: boolean;
  // 创建时间
  createdTime: string;
  // 修改时间
  modifiedTime: string;
  static names(): { [key: string]: string } {
    return {
      destinationModelId: 'destination_model_id',
      sourceModelId: 'source_model_id',
      uniqueId: 'unique_id',
      description: 'description',
      relationType: 'relation_type',
      system: 'system',
      createdTime: 'created_time',
      modifiedTime: 'modified_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      destinationModelId: 'string',
      sourceModelId: 'string',
      uniqueId: 'string',
      description: 'string',
      relationType: 'string',
      system: 'boolean',
      createdTime: 'string',
      modifiedTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 审计日志
export class AuditLog extends $tea.Model {
  // id
  id: string;
  // 操作者
  operator: string;
  // 操作的对象类别
  resourceType: string;
  // 动作
  action: string;
  // 对象的ID
  targets: string[];
  // operation_time
  operationTime: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      operator: 'operator',
      resourceType: 'resource_type',
      action: 'action',
      targets: 'targets',
      operationTime: 'operation_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      operator: 'string',
      resourceType: 'string',
      action: 'string',
      targets: { 'type': 'array', 'itemType': 'string' },
      operationTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// CMDB中的实体对象
export class Item extends $tea.Model {
  // 实例ID
  id: string;
  // 名称
  name: string;
  // created_time
  createdTime?: string;
  // modified_time
  modifiedTime?: string;
  // data_json
  dataJson: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      createdTime: 'created_time',
      modifiedTime: 'modified_time',
      dataJson: 'data_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      createdTime: 'string',
      modifiedTime: 'string',
      dataJson: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 模型
export class Model extends $tea.Model {
  // 唯一标识（全局唯一）
  uniqueId: string;
  // 名称（全局唯一）
  name: string;
  // 所属模型分组的唯一标识
  categoryId: string;
  // 描述
  description?: string;
  // 是否为系统内置
  system: boolean;
  // 用于前端展示排序，数字越大优先级越高，默认为 0
  priority: number;
  // 用于前端展示的扩展属性
  displayProperties?: MapStringToStringEntry[];
  // 创建时间
  createdTime: string;
  // 修改时间
  modifiedTime: string;
  static names(): { [key: string]: string } {
    return {
      uniqueId: 'unique_id',
      name: 'name',
      categoryId: 'category_id',
      description: 'description',
      system: 'system',
      priority: 'priority',
      displayProperties: 'display_properties',
      createdTime: 'created_time',
      modifiedTime: 'modified_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uniqueId: 'string',
      name: 'string',
      categoryId: 'string',
      description: 'string',
      system: 'boolean',
      priority: 'number',
      displayProperties: { 'type': 'array', 'itemType': MapStringToStringEntry },
      createdTime: 'string',
      modifiedTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 系统参数
export class SystemParam extends $tea.Model {
  // description
  description: string;
  // key
  key: string;
  // value_type
  valueType: string;
  // value_json
  valueJson: string;
  // group_name
  groupName: string;
  static names(): { [key: string]: string } {
    return {
      description: 'description',
      key: 'key',
      valueType: 'value_type',
      valueJson: 'value_json',
      groupName: 'group_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      description: 'string',
      key: 'string',
      valueType: 'string',
      valueJson: 'string',
      groupName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 联合查询时的过滤条件
export class Filter extends $tea.Model {
  // join_model_id
  joinModelId: string;
  // conditions
  conditions: Condition[];
  static names(): { [key: string]: string } {
    return {
      joinModelId: 'join_model_id',
      conditions: 'conditions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      joinModelId: 'string',
      conditions: { 'type': 'array', 'itemType': Condition },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryItemRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // display_fields
  displayFields?: string[];
  // page_size
  pageSize?: number;
  // page_number
  pageNumber?: number;
  // sort_fields
  sortFields?: string[];
  // conditions
  conditions: Condition[];
  // filter
  filter?: Filter;
  // model_id
  modelId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      displayFields: 'display_fields',
      pageSize: 'page_size',
      pageNumber: 'page_number',
      sortFields: 'sort_fields',
      conditions: 'conditions',
      filter: 'filter',
      modelId: 'model_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      displayFields: { 'type': 'array', 'itemType': 'string' },
      pageSize: 'number',
      pageNumber: 'number',
      sortFields: { 'type': 'array', 'itemType': 'string' },
      conditions: { 'type': 'array', 'itemType': Condition },
      filter: Filter,
      modelId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryItemResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // total_count
  totalCount?: number;
  // data
  data?: Item[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalCount: 'total_count',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalCount: 'number',
      data: { 'type': 'array', 'itemType': Item },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateItemRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // model_id
  modelId: string;
  // name
  name: string;
  // id
  id: string;
  // 注意，data_json是一个MAP<String,Object>，但OP不支持MAP，，用户需要用Json序列化成字符串。不正确的格式将会报错
  dataJson: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      modelId: 'model_id',
      name: 'name',
      id: 'id',
      dataJson: 'data_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      modelId: 'string',
      name: 'string',
      id: 'string',
      dataJson: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateItemResponse extends $tea.Model {
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

export class UpdateItemRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // id
  id: string;
  // model_id
  modelId: string;
  // 同创建的data
  dataJson: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      modelId: 'model_id',
      dataJson: 'data_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      modelId: 'string',
      dataJson: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateItemResponse extends $tea.Model {
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

export class DeleteItemRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // id
  id: string;
  // model_id
  modelId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      modelId: 'model_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      modelId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteItemResponse extends $tea.Model {
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

export class GetItemRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // id
  id: string;
  // model_id
  modelId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      modelId: 'model_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      modelId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetItemResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: Item;
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
      data: Item,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetModelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 要获取的模型的唯一标识
  uniqueId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uniqueId: 'unique_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uniqueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetModelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 获取到的模型
  data?: Model;
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
      data: Model,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelRequest extends $tea.Model {
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

export class QueryModelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询到的模型列表
  data?: Model[];
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
      data: { 'type': 'array', 'itemType': Model },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateModelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 唯一标识（全局唯一）
  uniqueId: string;
  // 名称（全局唯一）
  name: string;
  // 所属模型分组的唯一标识
  categoryId: string;
  // 描述
  description?: string;
  // 用于前端展示排序，数字越大优先级越高，默认为 0
  priority?: number;
  // 用于前端展示的扩展属性
  displayProperties?: MapStringToStringEntry[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uniqueId: 'unique_id',
      name: 'name',
      categoryId: 'category_id',
      description: 'description',
      priority: 'priority',
      displayProperties: 'display_properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uniqueId: 'string',
      name: 'string',
      categoryId: 'string',
      description: 'string',
      priority: 'number',
      displayProperties: { 'type': 'array', 'itemType': MapStringToStringEntry },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateModelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建出的模型
  data?: Model;
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
      data: Model,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateModelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 要更新的模型的唯一标识
  uniqueId: string;
  // 名称（全局唯一）
  name: string;
  // 描述
  description?: string;
  // 用于前端展示排序，数字越大优先级越高，默认为 0
  priority?: number;
  // 用于前端展示的扩展属性
  displayProperties?: MapStringToStringEntry[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uniqueId: 'unique_id',
      name: 'name',
      description: 'description',
      priority: 'priority',
      displayProperties: 'display_properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uniqueId: 'string',
      name: 'string',
      description: 'string',
      priority: 'number',
      displayProperties: { 'type': 'array', 'itemType': MapStringToStringEntry },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateModelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 更新后的模型
  data?: Model;
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
      data: Model,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetModelcategoryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 要获取的模型分组的唯一标识
  uniqueId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uniqueId: 'unique_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uniqueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetModelcategoryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 获取到的模型分组
  data?: ModelCategory;
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
      data: ModelCategory,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteModelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 要删除的模型的唯一标识
  uniqueId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uniqueId: 'unique_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uniqueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteModelResponse extends $tea.Model {
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

export class QueryModelcategoryRequest extends $tea.Model {
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

export class QueryModelcategoryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询到的模型分组列表
  data?: ModelCategory[];
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
      data: { 'type': 'array', 'itemType': ModelCategory },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateModelcategoryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 唯一标识（全局唯一）
  uniqueId: string;
  // 名称（全局唯一）
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uniqueId: 'unique_id',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uniqueId: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateModelcategoryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建出的模型分组
  data?: ModelCategory;
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
      data: ModelCategory,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateModelcategoryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 要更新的模型分组的唯一标识
  uniqueId: string;
  // 名称（全局唯一）
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uniqueId: 'unique_id',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uniqueId: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateModelcategoryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 更新后的模型分组
  data?: ModelCategory;
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
      data: ModelCategory,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteModelcategoryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 要删除的模型分组的唯一标识
  uniqueId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      uniqueId: 'unique_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      uniqueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteModelcategoryResponse extends $tea.Model {
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

export class GetModelAttributeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 字段所属模型的唯一标识
  modelId: string;
  // 要获取的字段的唯一标识
  uniqueId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      modelId: 'model_id',
      uniqueId: 'unique_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      modelId: 'string',
      uniqueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetModelAttributeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 获取到的字段
  data?: Attribute;
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
      data: Attribute,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelAttributeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 所属模型的唯一标识
  modelId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      modelId: 'model_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      modelId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelAttributeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询到的模型字段列表
  data?: Attribute[];
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
      data: { 'type': 'array', 'itemType': Attribute },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateModelAttributeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 所属模型的唯一标识
  modelId: string;
  // 唯一标识（所属模型内唯一）
  uniqueId: string;
  // 名称（所属模型内唯一）
  name: string;
  // 描述
  description?: string;
  // 类型【取值范围：INTEGER，LONG，DOUBLE，FLOAT，BOOLEAN，STRING，DATE，DATETIME，ENUM，ARRAY】
  type: string;
  // 是否只读
  readonly: boolean;
  // 是否必填
  required: boolean;
  // 用于前端展示排序，数字越大优先级越高，默认为 0
  priority?: number;
  // 用于前端展示的扩展属性
  displayProperties?: MapStringToStringEntry[];
  // group_id
  groupId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      modelId: 'model_id',
      uniqueId: 'unique_id',
      name: 'name',
      description: 'description',
      type: 'type',
      readonly: 'readonly',
      required: 'required',
      priority: 'priority',
      displayProperties: 'display_properties',
      groupId: 'group_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      modelId: 'string',
      uniqueId: 'string',
      name: 'string',
      description: 'string',
      type: 'string',
      readonly: 'boolean',
      required: 'boolean',
      priority: 'number',
      displayProperties: { 'type': 'array', 'itemType': MapStringToStringEntry },
      groupId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateModelAttributeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建出的模型字段
  data?: Attribute;
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
      data: Attribute,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateModelAttributeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 要更新的模型字段所属模型的唯一标识
  modelId: string;
  // 要更新的模型字段的唯一标识
  uniqueId: string;
  // 名称（所属模型内唯一）
  name: string;
  // 描述
  description?: string;
  // 是否只读
  readonly: boolean;
  // 是否必填
  required: boolean;
  // 用于前端展示排序，数字越大优先级越高，默认为 0
  priority?: number;
  // 用于前端展示的扩展属性
  displayProperties?: MapStringToStringEntry[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      modelId: 'model_id',
      uniqueId: 'unique_id',
      name: 'name',
      description: 'description',
      readonly: 'readonly',
      required: 'required',
      priority: 'priority',
      displayProperties: 'display_properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      modelId: 'string',
      uniqueId: 'string',
      name: 'string',
      description: 'string',
      readonly: 'boolean',
      required: 'boolean',
      priority: 'number',
      displayProperties: { 'type': 'array', 'itemType': MapStringToStringEntry },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateModelAttributeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 更新后的模型字段
  data?: Attribute;
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
      data: Attribute,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteModelAttributeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 要删除的模型字段所属模型的唯一标识
  modelId: string;
  // 要删除的模型字段的唯一标识
  uniqueId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      modelId: 'model_id',
      uniqueId: 'unique_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      modelId: 'string',
      uniqueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteModelAttributeResponse extends $tea.Model {
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

export class ExistItemIdRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // model_id
  modelId: string;
  // id
  id: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      modelId: 'model_id',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      modelId: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExistItemIdResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // exsit
  exsit?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      exsit: 'exsit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      exsit: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryItemRelationsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 目标模型id
  destinationModelId: string;
  // item_id
  itemId: string;
  // 1
  pageSize?: number;
  // page_number
  pageNumber: number;
  // display_fields
  displayFields?: string[];
  // 上钻表示查询拓扑目标为自己的上级资源，反之则是查询以自己为源目标的下级资源
  drillUp?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      destinationModelId: 'destination_model_id',
      itemId: 'item_id',
      pageSize: 'page_size',
      pageNumber: 'page_number',
      displayFields: 'display_fields',
      drillUp: 'drill_up',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      destinationModelId: 'string',
      itemId: 'string',
      pageSize: 'number',
      pageNumber: 'number',
      displayFields: { 'type': 'array', 'itemType': 'string' },
      drillUp: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryItemRelationsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: Item[];
  // total_count
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': Item },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportItemRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // model_id
  modelId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      modelId: 'model_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      modelId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportItemResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // succeed_count
  succeedCount?: number;
  // failed_count
  failedCount?: number;
  // failed_reasons
  failedReasons?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      succeedCount: 'succeed_count',
      failedCount: 'failed_count',
      failedReasons: 'failed_reasons',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      succeedCount: 'number',
      failedCount: 'number',
      failedReasons: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportItemRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // model_id
  modelId: string;
  // display_fields
  displayFields: string[];
  // conditions
  conditions?: Condition[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      modelId: 'model_id',
      displayFields: 'display_fields',
      conditions: 'conditions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      modelId: 'string',
      displayFields: { 'type': 'array', 'itemType': 'string' },
      conditions: { 'type': 'array', 'itemType': Condition },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportItemResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // file_source
  fileSource?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      fileSource: 'file_source',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      fileSource: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetModelrelationshipRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 要获取的模型关联的目标模型的唯一标识
  destinationModelId: string;
  // 要获取的模型关联的源模型的唯一标识
  sourceModelId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      destinationModelId: 'destination_model_id',
      sourceModelId: 'source_model_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      destinationModelId: 'string',
      sourceModelId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetModelrelationshipResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 获取到的模型关联
  data?: ModelRelationship;
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
      data: ModelRelationship,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelrelationshipRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 目标模型的唯一标识
  destinationModelId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      destinationModelId: 'destination_model_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      destinationModelId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryModelrelationshipResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询到的模型关联列表
  data?: ModelRelationship[];
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
      data: { 'type': 'array', 'itemType': ModelRelationship },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateModelrelationshipRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 目标模型的唯一标识
  destinationModelId: string;
  // 源模型的唯一标识（目标模型内唯一）
  sourceModelId: string;
  // 描述
  description?: string;
  // 关联类型【取值范围：ONE_TO_ONE，ONE_TO_MANY】
  relationType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      destinationModelId: 'destination_model_id',
      sourceModelId: 'source_model_id',
      description: 'description',
      relationType: 'relation_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      destinationModelId: 'string',
      sourceModelId: 'string',
      description: 'string',
      relationType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateModelrelationshipResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建出的模型关联
  data?: ModelRelationship;
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
      data: ModelRelationship,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateModelrelationshipRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 要更新的模型关联的目标模型的唯一标识
  destinationModelId: string;
  // 要更新的模型关联的源模型的唯一标识
  sourceModelId: string;
  // 描述
  description?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      destinationModelId: 'destination_model_id',
      sourceModelId: 'source_model_id',
      description: 'description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      destinationModelId: 'string',
      sourceModelId: 'string',
      description: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateModelrelationshipResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 更新后的模型关联
  data?: ModelRelationship;
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
      data: ModelRelationship,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteModelrelationshipRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 要删除的模型关联的目标模型的唯一标识
  destinationModelId: string;
  // 要删除的模型关联的源模型的唯一标识
  sourceModelId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      destinationModelId: 'destination_model_id',
      sourceModelId: 'source_model_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      destinationModelId: 'string',
      sourceModelId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteModelrelationshipResponse extends $tea.Model {
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

export class PullParamRequest extends $tea.Model {
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

export class PullParamResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: SystemParam[];
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
      data: { 'type': 'array', 'itemType': SystemParam },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushParamRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 更新的键值
  key: string;
  // 由于OP不支持MAP，需要使用json字符串
  valueJson: string;
  // description
  description: string;
  // value_type
  valueType: string;
  // 参数分组
  groupName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      key: 'key',
      valueJson: 'value_json',
      description: 'description',
      valueType: 'value_type',
      groupName: 'group_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      key: 'string',
      valueJson: 'string',
      description: 'string',
      valueType: 'string',
      groupName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushParamResponse extends $tea.Model {
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

export class CreateAttributegroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // display_name
  displayName: string;
  // model_id
  modelId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      displayName: 'display_name',
      modelId: 'model_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      displayName: 'string',
      modelId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAttributegroupResponse extends $tea.Model {
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

export class QueryAttributegroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // model_id
  modelId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      modelId: 'model_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      modelId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAttributegroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: AttributeGroup[];
  // total_count
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': AttributeGroup },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAttributegroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // id
  id: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAttributegroupResponse extends $tea.Model {
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

export class UpdateAttributegroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // id
  id: string;
  // display_name
  displayName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      displayName: 'display_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      displayName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAttributegroupResponse extends $tea.Model {
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

export class QueryAuditlogRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 操作者
  operatorName?: string;
  // resource_type
  resourceType?: string;
  // resource_ids
  resourceIds?: string[];
  // begin_time
  beginTime?: string;
  // end_time
  endTime?: string;
  // page_size
  pageSize: number;
  // page_number
  pageNumber: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operatorName: 'operator_name',
      resourceType: 'resource_type',
      resourceIds: 'resource_ids',
      beginTime: 'begin_time',
      endTime: 'end_time',
      pageSize: 'page_size',
      pageNumber: 'page_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operatorName: 'string',
      resourceType: 'string',
      resourceIds: { 'type': 'array', 'itemType': 'string' },
      beginTime: 'string',
      endTime: 'string',
      pageSize: 'number',
      pageNumber: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAuditlogResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: AuditLog[];
  // total_count
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': AuditLog },
      totalCount: 'number',
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
          sdk_version: "1.0.27",
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
   * Description: 查询资源
   * Summary: 查询资源
   */
  async queryItem(request: QueryItemRequest): Promise<QueryItemResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryItemEx(request, headers, runtime);
  }

  /**
   * Description: 查询资源
   * Summary: 查询资源
   */
  async queryItemEx(request: QueryItemRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryItemResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryItemResponse>(await this.doRequest("1.0", "antcloud.cmdb.item.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryItemResponse({}));
  }

  /**
   * Description: 创建资源
   * Summary: 创建资源
   */
  async createItem(request: CreateItemRequest): Promise<CreateItemResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createItemEx(request, headers, runtime);
  }

  /**
   * Description: 创建资源
   * Summary: 创建资源
   */
  async createItemEx(request: CreateItemRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateItemResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateItemResponse>(await this.doRequest("1.0", "antcloud.cmdb.item.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateItemResponse({}));
  }

  /**
   * Description: 全量更新资源属性，不传的属性如果原本有值会被覆盖成空值
   * Summary: 更新资源属性
   */
  async updateItem(request: UpdateItemRequest): Promise<UpdateItemResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateItemEx(request, headers, runtime);
  }

  /**
   * Description: 全量更新资源属性，不传的属性如果原本有值会被覆盖成空值
   * Summary: 更新资源属性
   */
  async updateItemEx(request: UpdateItemRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateItemResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateItemResponse>(await this.doRequest("1.0", "antcloud.cmdb.item.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateItemResponse({}));
  }

  /**
   * Description: 删除单个资源
   * Summary: 删除单个资源
   */
  async deleteItem(request: DeleteItemRequest): Promise<DeleteItemResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteItemEx(request, headers, runtime);
  }

  /**
   * Description: 删除单个资源
   * Summary: 删除单个资源
   */
  async deleteItemEx(request: DeleteItemRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteItemResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteItemResponse>(await this.doRequest("1.0", "antcloud.cmdb.item.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteItemResponse({}));
  }

  /**
   * Description: 获取单个Item的详细信息
   * Summary: 获取单个Item的详细信息
   */
  async getItem(request: GetItemRequest): Promise<GetItemResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getItemEx(request, headers, runtime);
  }

  /**
   * Description: 获取单个Item的详细信息
   * Summary: 获取单个Item的详细信息
   */
  async getItemEx(request: GetItemRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetItemResponse> {
    Util.validateModel(request);
    return $tea.cast<GetItemResponse>(await this.doRequest("1.0", "antcloud.cmdb.item.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetItemResponse({}));
  }

  /**
   * Description: 获取单个模型
   * Summary: 获取单个模型
   */
  async getModel(request: GetModelRequest): Promise<GetModelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getModelEx(request, headers, runtime);
  }

  /**
   * Description: 获取单个模型
   * Summary: 获取单个模型
   */
  async getModelEx(request: GetModelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetModelResponse> {
    Util.validateModel(request);
    return $tea.cast<GetModelResponse>(await this.doRequest("1.0", "antcloud.cmdb.model.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetModelResponse({}));
  }

  /**
   * Description: 查询模型
   * Summary: 查询模型
   */
  async queryModel(request: QueryModelRequest): Promise<QueryModelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryModelEx(request, headers, runtime);
  }

  /**
   * Description: 查询模型
   * Summary: 查询模型
   */
  async queryModelEx(request: QueryModelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryModelResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryModelResponse>(await this.doRequest("1.0", "antcloud.cmdb.model.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryModelResponse({}));
  }

  /**
   * Description: 创建模型
   * Summary: 创建模型
   */
  async createModel(request: CreateModelRequest): Promise<CreateModelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createModelEx(request, headers, runtime);
  }

  /**
   * Description: 创建模型
   * Summary: 创建模型
   */
  async createModelEx(request: CreateModelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateModelResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateModelResponse>(await this.doRequest("1.0", "antcloud.cmdb.model.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateModelResponse({}));
  }

  /**
   * Description: 更新模型
   * Summary: 更新模型
   */
  async updateModel(request: UpdateModelRequest): Promise<UpdateModelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateModelEx(request, headers, runtime);
  }

  /**
   * Description: 更新模型
   * Summary: 更新模型
   */
  async updateModelEx(request: UpdateModelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateModelResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateModelResponse>(await this.doRequest("1.0", "antcloud.cmdb.model.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateModelResponse({}));
  }

  /**
   * Description: 获取单个模型分组
   * Summary: 获取单个模型分组
   */
  async getModelcategory(request: GetModelcategoryRequest): Promise<GetModelcategoryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getModelcategoryEx(request, headers, runtime);
  }

  /**
   * Description: 获取单个模型分组
   * Summary: 获取单个模型分组
   */
  async getModelcategoryEx(request: GetModelcategoryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetModelcategoryResponse> {
    Util.validateModel(request);
    return $tea.cast<GetModelcategoryResponse>(await this.doRequest("1.0", "antcloud.cmdb.modelcategory.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetModelcategoryResponse({}));
  }

  /**
   * Description: 删除模型
   * Summary: 删除模型
   */
  async deleteModel(request: DeleteModelRequest): Promise<DeleteModelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteModelEx(request, headers, runtime);
  }

  /**
   * Description: 删除模型
   * Summary: 删除模型
   */
  async deleteModelEx(request: DeleteModelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteModelResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteModelResponse>(await this.doRequest("1.0", "antcloud.cmdb.model.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteModelResponse({}));
  }

  /**
   * Description: 查询模型分组
   * Summary: 查询模型分组
   */
  async queryModelcategory(request: QueryModelcategoryRequest): Promise<QueryModelcategoryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryModelcategoryEx(request, headers, runtime);
  }

  /**
   * Description: 查询模型分组
   * Summary: 查询模型分组
   */
  async queryModelcategoryEx(request: QueryModelcategoryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryModelcategoryResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryModelcategoryResponse>(await this.doRequest("1.0", "antcloud.cmdb.modelcategory.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryModelcategoryResponse({}));
  }

  /**
   * Description: 创建模型分组
   * Summary: 创建模型分组
   */
  async createModelcategory(request: CreateModelcategoryRequest): Promise<CreateModelcategoryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createModelcategoryEx(request, headers, runtime);
  }

  /**
   * Description: 创建模型分组
   * Summary: 创建模型分组
   */
  async createModelcategoryEx(request: CreateModelcategoryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateModelcategoryResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateModelcategoryResponse>(await this.doRequest("1.0", "antcloud.cmdb.modelcategory.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateModelcategoryResponse({}));
  }

  /**
   * Description: 更新模型分组
   * Summary: 更新模型分组
   */
  async updateModelcategory(request: UpdateModelcategoryRequest): Promise<UpdateModelcategoryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateModelcategoryEx(request, headers, runtime);
  }

  /**
   * Description: 更新模型分组
   * Summary: 更新模型分组
   */
  async updateModelcategoryEx(request: UpdateModelcategoryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateModelcategoryResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateModelcategoryResponse>(await this.doRequest("1.0", "antcloud.cmdb.modelcategory.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateModelcategoryResponse({}));
  }

  /**
   * Description: 删除模型分组
   * Summary: 删除模型分组
   */
  async deleteModelcategory(request: DeleteModelcategoryRequest): Promise<DeleteModelcategoryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteModelcategoryEx(request, headers, runtime);
  }

  /**
   * Description: 删除模型分组
   * Summary: 删除模型分组
   */
  async deleteModelcategoryEx(request: DeleteModelcategoryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteModelcategoryResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteModelcategoryResponse>(await this.doRequest("1.0", "antcloud.cmdb.modelcategory.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteModelcategoryResponse({}));
  }

  /**
   * Description: 获取单个模型字段
   * Summary: 获取单个模型字段
   */
  async getModelAttribute(request: GetModelAttributeRequest): Promise<GetModelAttributeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getModelAttributeEx(request, headers, runtime);
  }

  /**
   * Description: 获取单个模型字段
   * Summary: 获取单个模型字段
   */
  async getModelAttributeEx(request: GetModelAttributeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetModelAttributeResponse> {
    Util.validateModel(request);
    return $tea.cast<GetModelAttributeResponse>(await this.doRequest("1.0", "antcloud.cmdb.model.attribute.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetModelAttributeResponse({}));
  }

  /**
   * Description: 查询模型字段
   * Summary: 查询模型字段
   */
  async queryModelAttribute(request: QueryModelAttributeRequest): Promise<QueryModelAttributeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryModelAttributeEx(request, headers, runtime);
  }

  /**
   * Description: 查询模型字段
   * Summary: 查询模型字段
   */
  async queryModelAttributeEx(request: QueryModelAttributeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryModelAttributeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryModelAttributeResponse>(await this.doRequest("1.0", "antcloud.cmdb.model.attribute.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryModelAttributeResponse({}));
  }

  /**
   * Description: 创建模型字段
   * Summary: 创建模型字段
   */
  async createModelAttribute(request: CreateModelAttributeRequest): Promise<CreateModelAttributeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createModelAttributeEx(request, headers, runtime);
  }

  /**
   * Description: 创建模型字段
   * Summary: 创建模型字段
   */
  async createModelAttributeEx(request: CreateModelAttributeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateModelAttributeResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateModelAttributeResponse>(await this.doRequest("1.0", "antcloud.cmdb.model.attribute.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateModelAttributeResponse({}));
  }

  /**
   * Description: 更新模型字段
   * Summary: 更新模型字段
   */
  async updateModelAttribute(request: UpdateModelAttributeRequest): Promise<UpdateModelAttributeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateModelAttributeEx(request, headers, runtime);
  }

  /**
   * Description: 更新模型字段
   * Summary: 更新模型字段
   */
  async updateModelAttributeEx(request: UpdateModelAttributeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateModelAttributeResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateModelAttributeResponse>(await this.doRequest("1.0", "antcloud.cmdb.model.attribute.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateModelAttributeResponse({}));
  }

  /**
   * Description: 删除模型字段
   * Summary: 删除模型字段
   */
  async deleteModelAttribute(request: DeleteModelAttributeRequest): Promise<DeleteModelAttributeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteModelAttributeEx(request, headers, runtime);
  }

  /**
   * Description: 删除模型字段
   * Summary: 删除模型字段
   */
  async deleteModelAttributeEx(request: DeleteModelAttributeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteModelAttributeResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteModelAttributeResponse>(await this.doRequest("1.0", "antcloud.cmdb.model.attribute.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteModelAttributeResponse({}));
  }

  /**
   * Description: id是否存在
   * Summary: id是否存在
   */
  async existItemId(request: ExistItemIdRequest): Promise<ExistItemIdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.existItemIdEx(request, headers, runtime);
  }

  /**
   * Description: id是否存在
   * Summary: id是否存在
   */
  async existItemIdEx(request: ExistItemIdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExistItemIdResponse> {
    Util.validateModel(request);
    return $tea.cast<ExistItemIdResponse>(await this.doRequest("1.0", "antcloud.cmdb.item.id.exist", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExistItemIdResponse({}));
  }

  /**
   * Description: 查询当前item的关系资源，注意区分上钻和下钻
   * Summary: 查询当前item的关系资源
   */
  async queryItemRelations(request: QueryItemRelationsRequest): Promise<QueryItemRelationsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryItemRelationsEx(request, headers, runtime);
  }

  /**
   * Description: 查询当前item的关系资源，注意区分上钻和下钻
   * Summary: 查询当前item的关系资源
   */
  async queryItemRelationsEx(request: QueryItemRelationsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryItemRelationsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryItemRelationsResponse>(await this.doRequest("1.0", "antcloud.cmdb.item.relations.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryItemRelationsResponse({}));
  }

  /**
   * Description: 导入ITEM
   * Summary: 导入ITEM
   */
  async importItem(request: ImportItemRequest): Promise<ImportItemResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importItemEx(request, headers, runtime);
  }

  /**
   * Description: 导入ITEM
   * Summary: 导入ITEM
   */
  async importItemEx(request: ImportItemRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportItemResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportItemResponse>(await this.doRequest("1.0", "antcloud.cmdb.item.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportItemResponse({}));
  }

  /**
   * Description: 导出资源
   * Summary: 导出资源
   */
  async exportItem(request: ExportItemRequest): Promise<ExportItemResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.exportItemEx(request, headers, runtime);
  }

  /**
   * Description: 导出资源
   * Summary: 导出资源
   */
  async exportItemEx(request: ExportItemRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExportItemResponse> {
    Util.validateModel(request);
    return $tea.cast<ExportItemResponse>(await this.doRequest("1.0", "antcloud.cmdb.item.export", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExportItemResponse({}));
  }

  /**
   * Description: 获取单个模型关联
   * Summary: 获取单个模型关联
   */
  async getModelrelationship(request: GetModelrelationshipRequest): Promise<GetModelrelationshipResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getModelrelationshipEx(request, headers, runtime);
  }

  /**
   * Description: 获取单个模型关联
   * Summary: 获取单个模型关联
   */
  async getModelrelationshipEx(request: GetModelrelationshipRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetModelrelationshipResponse> {
    Util.validateModel(request);
    return $tea.cast<GetModelrelationshipResponse>(await this.doRequest("1.0", "antcloud.cmdb.modelrelationship.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetModelrelationshipResponse({}));
  }

  /**
   * Description: 查询模型关联
   * Summary: 查询模型关联
   */
  async queryModelrelationship(request: QueryModelrelationshipRequest): Promise<QueryModelrelationshipResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryModelrelationshipEx(request, headers, runtime);
  }

  /**
   * Description: 查询模型关联
   * Summary: 查询模型关联
   */
  async queryModelrelationshipEx(request: QueryModelrelationshipRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryModelrelationshipResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryModelrelationshipResponse>(await this.doRequest("1.0", "antcloud.cmdb.modelrelationship.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryModelrelationshipResponse({}));
  }

  /**
   * Description: 创建模型关联
   * Summary: 创建模型关联
   */
  async createModelrelationship(request: CreateModelrelationshipRequest): Promise<CreateModelrelationshipResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createModelrelationshipEx(request, headers, runtime);
  }

  /**
   * Description: 创建模型关联
   * Summary: 创建模型关联
   */
  async createModelrelationshipEx(request: CreateModelrelationshipRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateModelrelationshipResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateModelrelationshipResponse>(await this.doRequest("1.0", "antcloud.cmdb.modelrelationship.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateModelrelationshipResponse({}));
  }

  /**
   * Description: 更新模型关联
   * Summary: 更新模型关联
   */
  async updateModelrelationship(request: UpdateModelrelationshipRequest): Promise<UpdateModelrelationshipResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateModelrelationshipEx(request, headers, runtime);
  }

  /**
   * Description: 更新模型关联
   * Summary: 更新模型关联
   */
  async updateModelrelationshipEx(request: UpdateModelrelationshipRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateModelrelationshipResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateModelrelationshipResponse>(await this.doRequest("1.0", "antcloud.cmdb.modelrelationship.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateModelrelationshipResponse({}));
  }

  /**
   * Description: 删除模型关联
   * Summary: 删除模型关联
   */
  async deleteModelrelationship(request: DeleteModelrelationshipRequest): Promise<DeleteModelrelationshipResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteModelrelationshipEx(request, headers, runtime);
  }

  /**
   * Description: 删除模型关联
   * Summary: 删除模型关联
   */
  async deleteModelrelationshipEx(request: DeleteModelrelationshipRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteModelrelationshipResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteModelrelationshipResponse>(await this.doRequest("1.0", "antcloud.cmdb.modelrelationship.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteModelrelationshipResponse({}));
  }

  /**
   * Description: 拉取当前环境的参数表
   * Summary: 拉取当前环境的参数表
   */
  async pullParam(request: PullParamRequest): Promise<PullParamResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pullParamEx(request, headers, runtime);
  }

  /**
   * Description: 拉取当前环境的参数表
   * Summary: 拉取当前环境的参数表
   */
  async pullParamEx(request: PullParamRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PullParamResponse> {
    Util.validateModel(request);
    return $tea.cast<PullParamResponse>(await this.doRequest("1.0", "antcloud.cmdb.param.pull", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PullParamResponse({}));
  }

  /**
   * Description: 更新配置信息
   * Summary: 更新配置信息
   */
  async pushParam(request: PushParamRequest): Promise<PushParamResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushParamEx(request, headers, runtime);
  }

  /**
   * Description: 更新配置信息
   * Summary: 更新配置信息
   */
  async pushParamEx(request: PushParamRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushParamResponse> {
    Util.validateModel(request);
    return $tea.cast<PushParamResponse>(await this.doRequest("1.0", "antcloud.cmdb.param.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushParamResponse({}));
  }

  /**
   * Description: 创建字段组
   * Summary: 创建字段组
   */
  async createAttributegroup(request: CreateAttributegroupRequest): Promise<CreateAttributegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAttributegroupEx(request, headers, runtime);
  }

  /**
   * Description: 创建字段组
   * Summary: 创建字段组
   */
  async createAttributegroupEx(request: CreateAttributegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAttributegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAttributegroupResponse>(await this.doRequest("1.0", "antcloud.cmdb.attributegroup.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAttributegroupResponse({}));
  }

  /**
   * Description: 查询字段组
   * Summary: 查询字段组
   */
  async queryAttributegroup(request: QueryAttributegroupRequest): Promise<QueryAttributegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAttributegroupEx(request, headers, runtime);
  }

  /**
   * Description: 查询字段组
   * Summary: 查询字段组
   */
  async queryAttributegroupEx(request: QueryAttributegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAttributegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAttributegroupResponse>(await this.doRequest("1.0", "antcloud.cmdb.attributegroup.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAttributegroupResponse({}));
  }

  /**
   * Description: 删除字段组
   * Summary: 删除字段组
   */
  async deleteAttributegroup(request: DeleteAttributegroupRequest): Promise<DeleteAttributegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteAttributegroupEx(request, headers, runtime);
  }

  /**
   * Description: 删除字段组
   * Summary: 删除字段组
   */
  async deleteAttributegroupEx(request: DeleteAttributegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteAttributegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteAttributegroupResponse>(await this.doRequest("1.0", "antcloud.cmdb.attributegroup.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteAttributegroupResponse({}));
  }

  /**
   * Description: 更新字段组
   * Summary: 更新字段组
   */
  async updateAttributegroup(request: UpdateAttributegroupRequest): Promise<UpdateAttributegroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAttributegroupEx(request, headers, runtime);
  }

  /**
   * Description: 更新字段组
   * Summary: 更新字段组
   */
  async updateAttributegroupEx(request: UpdateAttributegroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAttributegroupResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAttributegroupResponse>(await this.doRequest("1.0", "antcloud.cmdb.attributegroup.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAttributegroupResponse({}));
  }

  /**
   * Description: 审计日志查询
   * Summary: 审计日志查询
   */
  async queryAuditlog(request: QueryAuditlogRequest): Promise<QueryAuditlogResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAuditlogEx(request, headers, runtime);
  }

  /**
   * Description: 审计日志查询
   * Summary: 审计日志查询
   */
  async queryAuditlogEx(request: QueryAuditlogRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAuditlogResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAuditlogResponse>(await this.doRequest("1.0", "antcloud.cmdb.auditlog.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAuditlogResponse({}));
  }

}
