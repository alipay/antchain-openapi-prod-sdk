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

// 支出配置单对象结果详情
export class ExpenditureQuotationItemResult extends $tea.Model {
  // 支出配置单商品维度的外部唯一id
  outUniqueId: string;
  // 支出配置单商品合约号
  arrangementNo: string;
  static names(): { [key: string]: string } {
    return {
      outUniqueId: 'out_unique_id',
      arrangementNo: 'arrangement_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      outUniqueId: 'string',
      arrangementNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 交易履约结果消息结构
export class TradeFulfillResult extends $tea.Model {
  // 履约单据号，可用于作为幂等依据
  fulfillOrderNo: string;
  // 履约枚举，生产-PROVISION，停服-STOP，释放-RELEASE，恢复/RESUME
  // 
  fulfillType: string;
  // 租户ID
  tenantId: string;
  // 主商品编码
  commodityCode: string;
  // 履约实例ID
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      fulfillOrderNo: 'fulfill_order_no',
      fulfillType: 'fulfill_type',
      tenantId: 'tenant_id',
      commodityCode: 'commodity_code',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fulfillOrderNo: 'string',
      fulfillType: 'string',
      tenantId: 'string',
      commodityCode: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 从产品动态加载返回结果集
export class DiscreteValue extends $tea.Model {
  // 组件展示的内容
  text: string;
  // 组件的具体值
  value: string;
  // 组件值的单位
  unit?: string;
  // 组件选中值的说明/提示
  tips?: string;
  // 多个组件展示的顺序
  sortId: number;
  static names(): { [key: string]: string } {
    return {
      text: 'text',
      value: 'value',
      unit: 'unit',
      tips: 'tips',
      sortId: 'sort_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      text: 'string',
      value: 'string',
      unit: 'string',
      tips: 'string',
      sortId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单执行结果描述
export class OrderResult extends $tea.Model {
  // 实例Id
  instanceId: string;
  // 是否生成成功
  success: boolean;
  static names(): { [key: string]: string } {
    return {
      instanceId: 'instance_id',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instanceId: 'string',
      success: 'boolean',
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

// API变更结构
export class ApiChange extends $tea.Model {
  // 变更类型，ADD-新增，DELETE-删除
  changeType: string;
  // API名称列表
  apiNames: string[];
  static names(): { [key: string]: string } {
    return {
      changeType: 'change_type',
      apiNames: 'api_names',
    };
  }

  static types(): { [key: string]: any } {
    return {
      changeType: 'string',
      apiNames: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAbilityChainAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  productAccessCode?: string;
  // 业务流水，请求幂等号
  bizId: string;
  // 链id，每个合约独立的标识
  chainId: string;
  // 租户名。目前理解 chain_id + tenant_id + chain_user_id 能唯一标识某个合约上的某个账号
  tenantId: string;
  // 链上账号。链上唯一账号。某些特定场景（比如某个租户可以在一个合约上不同平台方参与分润），会需要合约账户id
  chainUserId?: string;
  // decrease 减少 increase 增加
  type: string;
  // 金额，单位：分。
  value: number;
  // 扩展字段，json格式
  extendParams?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productAccessCode: 'product_access_code',
      bizId: 'biz_id',
      chainId: 'chain_id',
      tenantId: 'tenant_id',
      chainUserId: 'chain_user_id',
      type: 'type',
      value: 'value',
      extendParams: 'extend_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productAccessCode: 'string',
      bizId: 'string',
      chainId: 'string',
      tenantId: 'string',
      chainUserId: 'string',
      type: 'string',
      value: 'number',
      extendParams: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAbilityChainAccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回值对象,json格式。
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

export class UpdateAbilityChainAssetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  productAccessCode?: string;
  // 流水号
  bizId: string;
  // 链id，链上合约id
  chainId: string;
  // 租户id
  tenantId: string;
  // 链上用户id
  chainUserId?: string;
  // 链上token金额，价值现金。单元：分
  tokenAmount: number;
  // token链上数量。与现金有一定的兑换率。
  tokenNumber: string;
  // 扩展字段，json格式
  extendParams?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productAccessCode: 'product_access_code',
      bizId: 'biz_id',
      chainId: 'chain_id',
      tenantId: 'tenant_id',
      chainUserId: 'chain_user_id',
      tokenAmount: 'token_amount',
      tokenNumber: 'token_number',
      extendParams: 'extend_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productAccessCode: 'string',
      bizId: 'string',
      chainId: 'string',
      tenantId: 'string',
      chainUserId: 'string',
      tokenAmount: 'number',
      tokenNumber: 'string',
      extendParams: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAbilityChainAssetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回json对象
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

export class StopSpProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  productAccessCode?: string;
  // 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
  orderNo: string;
  // 产品码 全局唯一
  productCode: string;
  // 产品实例Id
  instanceId: string;
  // 服务接入码，商品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址。
  accessCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productAccessCode: 'product_access_code',
      orderNo: 'order_no',
      productCode: 'product_code',
      instanceId: 'instance_id',
      accessCode: 'access_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productAccessCode: 'string',
      orderNo: 'string',
      productCode: 'string',
      instanceId: 'string',
      accessCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StopSpProductResponse extends $tea.Model {
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

export class ResumeSpProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  productAccessCode?: string;
  // 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
  orderNo: string;
  // 产品码 全局唯一
  productCode: string;
  // 产品实例ID
  instanceId: string;
  // 服务接入码，商品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址。
  accessCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productAccessCode: 'product_access_code',
      orderNo: 'order_no',
      productCode: 'product_code',
      instanceId: 'instance_id',
      accessCode: 'access_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productAccessCode: 'string',
      orderNo: 'string',
      productCode: 'string',
      instanceId: 'string',
      accessCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ResumeSpProductResponse extends $tea.Model {
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

export class ProvisionSpProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  productAccessCode?: string;
  // 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
  orderNo: string;
  // 产品码 全局唯一
  productCode: string;
  // 购买产品的租户
  tenant: string;
  // 产品实例Id
  instanceIds: string[];
  // 具体规格配置信息（JSON格式）会按照key进行排序
  specification: string;
  // 部分产品创建时需要非生产规格的数据（JSON格式） 比如：ECS生产需要账号、密码等 会按照key进行排序
  customData?: string;
  // 实例需要创建到租户的环境信息
  workspace?: string;
  // 实例需要创建到租户的地域
  region?: string;
  // 实例需要创建到租户的机房，可以有多个（冗灾场景）
  zones?: string[];
  // 购买产品的租户ID，格式为2088XXXXXXXXXXXX	
  tenantId: string;
  // 服务接入码，商品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址。
  accessCode: string;
  // 商业业务信息，如签约的项目ID、合同ID、合作伙伴ID等信息
  businessData?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productAccessCode: 'product_access_code',
      orderNo: 'order_no',
      productCode: 'product_code',
      tenant: 'tenant',
      instanceIds: 'instance_ids',
      specification: 'specification',
      customData: 'custom_data',
      workspace: 'workspace',
      region: 'region',
      zones: 'zones',
      tenantId: 'tenant_id',
      accessCode: 'access_code',
      businessData: 'business_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productAccessCode: 'string',
      orderNo: 'string',
      productCode: 'string',
      tenant: 'string',
      instanceIds: { 'type': 'array', 'itemType': 'string' },
      specification: 'string',
      customData: 'string',
      workspace: 'string',
      region: 'string',
      zones: { 'type': 'array', 'itemType': 'string' },
      tenantId: 'string',
      accessCode: 'string',
      businessData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ProvisionSpProductResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 标识是否同步返回生产结果
  sync?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sync: 'sync',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sync: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ModifySpProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  productAccessCode?: string;
  // 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
  orderNo: string;
  // 产品码 全局唯一
  productCode: string;
  // 产品实例Id
  instanceId: string;
  // 具体规格配置信息（JSON格式）会按照key进行排序
  specification: string;
  // 服务接入码，商品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址。
  accessCode: string;
  // 变配类型：
  // ONLY_SPECIFICATION只规格变配,
  // SPECIFICATION_AND_TIME 规格和时间同时变配
  modifyType: string;
  // 变配新的开始时间。格式为UTC时间。
  // modify_type是SPECIFICATION_AND_TIME时，必填
  newStartTime?: string;
  // 变配新的结束时间。格式为UTC时间.
  //  modify_type是SPECIFICATION_AND_TIME时，必填
  newEndTime?: string;
  // 商业业务信息，如签约的项目ID、合同ID、合作伙伴ID等
  businessData?: string;
  // 具体规格配置信息（JSON格式）会按照key进行排序。
  // 此字段传入的是变配前的老规格信息。
  oldSpecification?: string;
  // 具体规格配置信息（JSON格式）会按照key进行排序.
  // 传入新的规格信息，包括在新的规格中不存在，但是老的规格中有的kv。
  newSpecification?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productAccessCode: 'product_access_code',
      orderNo: 'order_no',
      productCode: 'product_code',
      instanceId: 'instance_id',
      specification: 'specification',
      accessCode: 'access_code',
      modifyType: 'modify_type',
      newStartTime: 'new_start_time',
      newEndTime: 'new_end_time',
      businessData: 'business_data',
      oldSpecification: 'old_specification',
      newSpecification: 'new_specification',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productAccessCode: 'string',
      orderNo: 'string',
      productCode: 'string',
      instanceId: 'string',
      specification: 'string',
      accessCode: 'string',
      modifyType: 'string',
      newStartTime: 'string',
      newEndTime: 'string',
      businessData: 'string',
      oldSpecification: 'string',
      newSpecification: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ModifySpProductResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 标识是否同步返回变更结果
  sync?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sync: 'sync',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sync: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReleaseSpProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  productAccessCode?: string;
  // 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
  orderNo: string;
  // 产品码 全局唯一
  productCode: string;
  // 产品实例ID
  instanceId: string;
  // 服务接入码，商品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址
  accessCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productAccessCode: 'product_access_code',
      orderNo: 'order_no',
      productCode: 'product_code',
      instanceId: 'instance_id',
      accessCode: 'access_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productAccessCode: 'string',
      orderNo: 'string',
      productCode: 'string',
      instanceId: 'string',
      accessCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReleaseSpProductResponse extends $tea.Model {
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

export class GetSpProductOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  productAccessCode?: string;
  // 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
  orderNo: string;
  // 产品码 全局唯一
  productCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productAccessCode: 'product_access_code',
      orderNo: 'order_no',
      productCode: 'product_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productAccessCode: 'string',
      orderNo: 'string',
      productCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSpProductOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果
  orderResults: OrderResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderResults: 'order_results',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderResults: { 'type': 'array', 'itemType': OrderResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class LoadSpProductOrderparameterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  productAccessCode?: string;
  // 加载业务的场景。具体内容同产品方定义，但产品下需保证唯一。
  businessAction: string;
  // 用于加载对应场景数据的上下文（JSON格式具体同产品方定义）
  businessContext: string;
  // 业务流水号。
  orderNo?: string;
  // 产品code
  productCode: string;
  // 地域。支持不同地域显示不同内容。
  region?: string;
  // 租户id
  tenant: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productAccessCode: 'product_access_code',
      businessAction: 'business_action',
      businessContext: 'business_context',
      orderNo: 'order_no',
      productCode: 'product_code',
      region: 'region',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productAccessCode: 'string',
      businessAction: 'string',
      businessContext: 'string',
      orderNo: 'string',
      productCode: 'string',
      region: 'string',
      tenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class LoadSpProductOrderparameterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 首页页面产品自定义展示内容加载结果
  discreteValues?: DiscreteValue[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      discreteValues: 'discrete_values',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      discreteValues: { 'type': 'array', 'itemType': DiscreteValue },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncIndustryTradeResultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  productAccessCode?: string;
  // 外部商户订单号，不超过32位
  merchantOrderNo: string;
  // 原支付请求的商户订单号
  outTradeNo: string;
  // 支付宝交易号
  tradeNo: string;
  // 交易状态。
  // WAIT_BUYER_PAY	交易创建，等待买家付款。
  // TRADE_CLOSED	未付款交易超时关闭，或支付完成后全额退款。
  // TRADE_SUCCESS	交易支付成功。
  tradeStatus: string;
  // 错误码。
  errorCode?: string;
  // 错误原因
  errorMsg?: string;
  // 渠道 自营平台、第三方平台等
  channel: string;
  // 交易金额，单位元，支持到分
  totalAmount?: string;
  // 币种
  currencyValue?: string;
  // 交易付款成功时间
  gmtTrade?: string;
  // 来源编码
  source?: string;
  // 扩展属性
  properties?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productAccessCode: 'product_access_code',
      merchantOrderNo: 'merchant_order_no',
      outTradeNo: 'out_trade_no',
      tradeNo: 'trade_no',
      tradeStatus: 'trade_status',
      errorCode: 'error_code',
      errorMsg: 'error_msg',
      channel: 'channel',
      totalAmount: 'total_amount',
      currencyValue: 'currency_value',
      gmtTrade: 'gmt_trade',
      source: 'source',
      properties: 'properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productAccessCode: 'string',
      merchantOrderNo: 'string',
      outTradeNo: 'string',
      tradeNo: 'string',
      tradeStatus: 'string',
      errorCode: 'string',
      errorMsg: 'string',
      channel: 'string',
      totalAmount: 'string',
      currencyValue: 'string',
      gmtTrade: 'string',
      source: 'string',
      properties: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncIndustryTradeResultResponse extends $tea.Model {
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

export class SyncMerchantSignResultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  productAccessCode?: string;
  // 本次关联注册失败错误原因。
  errorMsg?: string;
  // 商家注册(进件)受理单号
  orderId: string;
  // 商家注册（包括进件）结果。99:已完结;-1:失败;
  status: string;
  // 二级商户id
  smid: string;
  // 商户租户id
  merchantUserId: string;
  // 商户名称
  merchantName?: string;
  // 八位数的商户租户名称
  merchantUserName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productAccessCode: 'product_access_code',
      errorMsg: 'error_msg',
      orderId: 'order_id',
      status: 'status',
      smid: 'smid',
      merchantUserId: 'merchant_user_id',
      merchantName: 'merchant_name',
      merchantUserName: 'merchant_user_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productAccessCode: 'string',
      errorMsg: 'string',
      orderId: 'string',
      status: 'string',
      smid: 'string',
      merchantUserId: 'string',
      merchantName: 'string',
      merchantUserName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncMerchantSignResultResponse extends $tea.Model {
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

export class SyncMerchantAgreementResultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  productAccessCode?: string;
  // 签约请求单据号
  requestId: string;
  // 代扣产品码
  // 代扣：GENERAL_WITHHOLDING_P
  personalProductCode: string;
  // 代扣签约主体2088号(即代扣收款方)
  merchantUserId: string;
  // 签约客户支付宝uid
  customerAlipayUserId: string;
  // 实际生效时间
  validTime?: string;
  // 失效时间
  invalidTime?: string;
  // 签约时间
  signTime?: string;
  // 签约状态
  // TEMP-暂存
  // NORMAL-正常
  // STOP-暂停
  status: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productAccessCode: 'product_access_code',
      requestId: 'request_id',
      personalProductCode: 'personal_product_code',
      merchantUserId: 'merchant_user_id',
      customerAlipayUserId: 'customer_alipay_user_id',
      validTime: 'valid_time',
      invalidTime: 'invalid_time',
      signTime: 'sign_time',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productAccessCode: 'string',
      requestId: 'string',
      personalProductCode: 'string',
      merchantUserId: 'string',
      customerAlipayUserId: 'string',
      validTime: 'string',
      invalidTime: 'string',
      signTime: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncMerchantAgreementResultResponse extends $tea.Model {
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

export class QueryDemoCccCccRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  productAccessCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productAccessCode: 'product_access_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productAccessCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDemoCccCccResponse extends $tea.Model {
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

export class SyncAcpartnerProjectResultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  productAccessCode?: string;
  // 租户code：用于数据和功能隔离
  source: string;
  // 项目id
  projectId: number;
  // 外部业务单据号
  outBusinessNo: string;
  // 支出配置单结果列表
  expenditureQuotationItems: ExpenditureQuotationItemResult[];
  // 结果码
  code: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productAccessCode: 'product_access_code',
      source: 'source',
      projectId: 'project_id',
      outBusinessNo: 'out_business_no',
      expenditureQuotationItems: 'expenditure_quotation_items',
      code: 'code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productAccessCode: 'string',
      source: 'string',
      projectId: 'number',
      outBusinessNo: 'string',
      expenditureQuotationItems: { 'type': 'array', 'itemType': ExpenditureQuotationItemResult },
      code: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAcpartnerProjectResultResponse extends $tea.Model {
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

export class SyncAcpartnerSettleinResultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  productAccessCode?: string;
  // 租户code
  source: string;
  // 入驻申请id
  applyId: number;
  // 外部的业务单据号
  outBusinessNo: string;
  // 结果码
  code: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productAccessCode: 'product_access_code',
      source: 'source',
      applyId: 'apply_id',
      outBusinessNo: 'out_business_no',
      code: 'code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productAccessCode: 'string',
      source: 'string',
      applyId: 'number',
      outBusinessNo: 'string',
      code: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncAcpartnerSettleinResultResponse extends $tea.Model {
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

export class SyncTradeFulfillResultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  productAccessCode?: string;
  // 履约单据号，可用于作为幂等依据
  fulfillOrderNo: string;
  // 履约枚举，新购-NEW
  fulfillType: string;
  // 租户ID
  tenantId: string;
  // 租户8位英文名
  tenantName: string;
  // 主商品编码
  commodityCode: string;
  // 履约实例ID
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productAccessCode: 'product_access_code',
      fulfillOrderNo: 'fulfill_order_no',
      fulfillType: 'fulfill_type',
      tenantId: 'tenant_id',
      tenantName: 'tenant_name',
      commodityCode: 'commodity_code',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productAccessCode: 'string',
      fulfillOrderNo: 'string',
      fulfillType: 'string',
      tenantId: 'string',
      tenantName: 'string',
      commodityCode: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncTradeFulfillResultResponse extends $tea.Model {
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

export class SyncPccCommodityStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  productAccessCode?: string;
  // 主商品编码
  commodityCode: string;
  // 商品名称
  commodityName: string;
  // 商品服务模式，PLATFORM-平台型
  commodityServiceMode: string;
  // 商品计费模式，PREPAY_BY_MONTH-包年包月 AFTER_PAY_BY_HOUR-按量付费
  commodityChargeType: string;
  // 商品状态，ONLINE-上架，OFFLINE-下架
  commodityStatus: string;
  // 产品干系人
  productRelUses: RelUser[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productAccessCode: 'product_access_code',
      commodityCode: 'commodity_code',
      commodityName: 'commodity_name',
      commodityServiceMode: 'commodity_service_mode',
      commodityChargeType: 'commodity_charge_type',
      commodityStatus: 'commodity_status',
      productRelUses: 'product_rel_uses',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productAccessCode: 'string',
      commodityCode: 'string',
      commodityName: 'string',
      commodityServiceMode: 'string',
      commodityChargeType: 'string',
      commodityStatus: 'string',
      productRelUses: { 'type': 'array', 'itemType': RelUser },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncPccCommodityStatusResponse extends $tea.Model {
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

export class QueryDemoEchoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  productAccessCode?: string;
  // 123
  data: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productAccessCode: 'product_access_code',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productAccessCode: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDemoEchoResponse extends $tea.Model {
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

export class CreateSpProductLogicinstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  productAccessCode?: string;
  // 主产品实例唯一id
  productInstanceUniqueId: string;
  // 逻辑实例唯一id
  uniqueId: string;
  // 幂等号
  outBizNo: string;
  // 账号Id
  providerId: string;
  // ACTIVE
  status: string;
  // 逻辑实例描述
  description: string;
  // 扩展属性
  properties: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productAccessCode: 'product_access_code',
      productInstanceUniqueId: 'product_instance_unique_id',
      uniqueId: 'unique_id',
      outBizNo: 'out_biz_no',
      providerId: 'provider_id',
      status: 'status',
      description: 'description',
      properties: 'properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productAccessCode: 'string',
      productInstanceUniqueId: 'string',
      uniqueId: 'string',
      outBizNo: 'string',
      providerId: 'string',
      status: 'string',
      description: 'string',
      properties: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSpProductLogicinstanceResponse extends $tea.Model {
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

export class RenewSpProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  productAccessCode?: string;
  // 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
  orderNo: string;
  // 产品码 全局唯一
  productCode: string;
  // 产品实例ID
  instanceId: string;
  // 服务接入码，商品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址。
  accessCode: string;
  // 续签后，新的实例开始时间。时间使用UTC时间
  renewStartTime?: string;
  // 续签后，新的实例结束时间。时间使用UTC时间
  renewEndTime: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productAccessCode: 'product_access_code',
      orderNo: 'order_no',
      productCode: 'product_code',
      instanceId: 'instance_id',
      accessCode: 'access_code',
      renewStartTime: 'renew_start_time',
      renewEndTime: 'renew_end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productAccessCode: 'string',
      orderNo: 'string',
      productCode: 'string',
      instanceId: 'string',
      accessCode: 'string',
      renewStartTime: 'string',
      renewEndTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RenewSpProductResponse extends $tea.Model {
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

export class CheckSpProductOrderparameterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  productAccessCode?: string;
  // 加载业务的场景。具体内容同产品方定义，但产品下需保证唯一。
  businessAction: string;
  // 用于加载对应场景数据的上下文（JSON格式具体同产品方定义）
  businessContext: string;
  // 业务流水号。
  orderNo?: string;
  // 商品的渠道产品码
  productCode: string;
  // 地域。支持不同地域显示不同内容。
  region?: string;
  // 租户id
  tenantId: string;
  // 需要校验的数据
  input: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productAccessCode: 'product_access_code',
      businessAction: 'business_action',
      businessContext: 'business_context',
      orderNo: 'order_no',
      productCode: 'product_code',
      region: 'region',
      tenantId: 'tenant_id',
      input: 'input',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productAccessCode: 'string',
      businessAction: 'string',
      businessContext: 'string',
      orderNo: 'string',
      productCode: 'string',
      region: 'string',
      tenantId: 'string',
      input: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckSpProductOrderparameterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 参数校验结果，PASS 通过，UNPASS 不通过
  checkStatus?: string;
  // 参数校验不通过的提示信息
  checkMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      checkStatus: 'check_status',
      checkMsg: 'check_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      checkStatus: 'string',
      checkMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PreopenSpProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  productAccessCode?: string;
  // 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
  orderNo: string;
  // 产品码 全局唯一
  productCode: string;
  // 	
  // 产品实例Id
  instanceIds: string[];
  // 	
  // 具体规格配置信息（JSON格式）会按照key进行排序
  specification: string;
  // 部分产品创建时需要非生产规格的数据（JSON格式） 比如：ECS生产需要账号、密码等 会按照key进行排序
  customData?: string;
  // 实例需要创建到租户的环境信息
  workspace?: string;
  // 	
  // 实例需要创建到租户的地域
  region?: string;
  // 	
  // 实例需要创建到租户的机房，可以有多个（冗灾场景）
  zones?: string[];
  // 	
  // 购买产品的租户ID，格式为2088XXXXXXXXXXXX
  tenantId: string;
  // 服务接入码，商品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址
  accessCode: string;
  // 商业业务信息，如签约的项目ID、合同ID、合作伙伴ID等信息
  businessData?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productAccessCode: 'product_access_code',
      orderNo: 'order_no',
      productCode: 'product_code',
      instanceIds: 'instance_ids',
      specification: 'specification',
      customData: 'custom_data',
      workspace: 'workspace',
      region: 'region',
      zones: 'zones',
      tenantId: 'tenant_id',
      accessCode: 'access_code',
      businessData: 'business_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productAccessCode: 'string',
      orderNo: 'string',
      productCode: 'string',
      instanceIds: { 'type': 'array', 'itemType': 'string' },
      specification: 'string',
      customData: 'string',
      workspace: 'string',
      region: 'string',
      zones: { 'type': 'array', 'itemType': 'string' },
      tenantId: 'string',
      accessCode: 'string',
      businessData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PreopenSpProductResponse extends $tea.Model {
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

export class OpenSpProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  productAccessCode?: string;
  // 订单号用于业务串联，以及幂等。目前为纯数字。保留使用大小写英文字符可能。
  orderNo: string;
  // 产品码 全局唯一
  productCode: string;
  // 开通产品的租户
  tenant: string;
  // 产品实例ID
  instanceId: string;
  // 支持透传给产品非生产规格的自定义数据（JSON格式并按key排序）
  customData?: string;
  // 开通产品的租户ID，格式为2088XXXXXXXXXXXX
  tenantId: string;
  // 服务接入码，产品对接开通时关联的接入码，由产品方研发定义，并对应一个回调地址。
  accessCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productAccessCode: 'product_access_code',
      orderNo: 'order_no',
      productCode: 'product_code',
      tenant: 'tenant',
      instanceId: 'instance_id',
      customData: 'custom_data',
      tenantId: 'tenant_id',
      accessCode: 'access_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productAccessCode: 'string',
      orderNo: 'string',
      productCode: 'string',
      tenant: 'string',
      instanceId: 'string',
      customData: 'string',
      tenantId: 'string',
      accessCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OpenSpProductResponse extends $tea.Model {
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
          sdk_version: "4.9.0",
          _prod_code: "SP",
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
   * Description: 更新链上账户余额
   * Summary: 更新链上账户余额
   */
  async updateAbilityChainAccount(request: UpdateAbilityChainAccountRequest): Promise<UpdateAbilityChainAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAbilityChainAccountEx(request, headers, runtime);
  }

  /**
   * Description: 更新链上账户余额
   * Summary: 更新链上账户余额
   */
  async updateAbilityChainAccountEx(request: UpdateAbilityChainAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAbilityChainAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAbilityChainAccountResponse>(await this.doRequest("1.0", "antcloudspi.ability.chain.account.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAbilityChainAccountResponse({}));
  }

  /**
   * Description: 链上资产核销、确认核销成功
   * Summary: 链上资产核销确认
   */
  async updateAbilityChainAsset(request: UpdateAbilityChainAssetRequest): Promise<UpdateAbilityChainAssetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAbilityChainAssetEx(request, headers, runtime);
  }

  /**
   * Description: 链上资产核销、确认核销成功
   * Summary: 链上资产核销确认
   */
  async updateAbilityChainAssetEx(request: UpdateAbilityChainAssetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAbilityChainAssetResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAbilityChainAssetResponse>(await this.doRequest("1.0", "antcloudspi.ability.chain.asset.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAbilityChainAssetResponse({}));
  }

  /**
   * Description: 用户资源到期或欠费情况下会对资源先进行停服操作，用于限制用户使用但不能删除用户数据！不同的产品可以根据自身的功能进行不同的限制。
  停服属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
  注意：如果产品的停服为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
   * Summary: SPI-停止服务
   */
  async stopSpProduct(request: StopSpProductRequest): Promise<StopSpProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.stopSpProductEx(request, headers, runtime);
  }

  /**
   * Description: 用户资源到期或欠费情况下会对资源先进行停服操作，用于限制用户使用但不能删除用户数据！不同的产品可以根据自身的功能进行不同的限制。
  停服属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
  注意：如果产品的停服为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
   * Summary: SPI-停止服务
   */
  async stopSpProductEx(request: StopSpProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StopSpProductResponse> {
    Util.validateModel(request);
    return $tea.cast<StopSpProductResponse>(await this.doRequest("1.0", "antcloudspi.sp.product.stop", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StopSpProductResponse({}));
  }

  /**
   * Description: 用户对欠费或者到期实例进行续费操作后，平台会通知产品解除对用户指定实例的操作限制。即恢复正常服务能力。
  恢复指令同样属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
  注意：如果产品的恢复为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
   * Summary: SPI-恢复服务
   */
  async resumeSpProduct(request: ResumeSpProductRequest): Promise<ResumeSpProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.resumeSpProductEx(request, headers, runtime);
  }

  /**
   * Description: 用户对欠费或者到期实例进行续费操作后，平台会通知产品解除对用户指定实例的操作限制。即恢复正常服务能力。
  恢复指令同样属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
  注意：如果产品的恢复为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
   * Summary: SPI-恢复服务
   */
  async resumeSpProductEx(request: ResumeSpProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ResumeSpProductResponse> {
    Util.validateModel(request);
    return $tea.cast<ResumeSpProductResponse>(await this.doRequest("1.0", "antcloudspi.sp.product.resume", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ResumeSpProductResponse({}));
  }

  /**
   * Description: 创建产品实例（带配置）支持相同配置一次创建多个实例（最大10个）。比如：用户购买一个BAAS链，就是创建一个BAAS链实例。
  创建产品会生成产品实例Id，后续变配、释放、停服、恢复服务操作都是通过实例Id作为标识。
  异步接口，也支持通过参数指定同步返回。
  能力产品收到指令后需要自行落库，并记录执行结果。如果是异步行为，则创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI。
  注意：中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
   * Summary: SPI-创建产品实例
   */
  async provisionSpProduct(request: ProvisionSpProductRequest): Promise<ProvisionSpProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.provisionSpProductEx(request, headers, runtime);
  }

  /**
   * Description: 创建产品实例（带配置）支持相同配置一次创建多个实例（最大10个）。比如：用户购买一个BAAS链，就是创建一个BAAS链实例。
  创建产品会生成产品实例Id，后续变配、释放、停服、恢复服务操作都是通过实例Id作为标识。
  异步接口，也支持通过参数指定同步返回。
  能力产品收到指令后需要自行落库，并记录执行结果。如果是异步行为，则创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI。
  注意：中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
   * Summary: SPI-创建产品实例
   */
  async provisionSpProductEx(request: ProvisionSpProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ProvisionSpProductResponse> {
    Util.validateModel(request);
    return $tea.cast<ProvisionSpProductResponse>(await this.doRequest("1.0", "antcloudspi.sp.product.provision", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ProvisionSpProductResponse({}));
  }

  /**
   * Description: 对已有的实例进行规格变更操作。
  支持同步、异步返回结果
  1.如果变更过程比较耗时，能力产品收到指令后需要自行落库并记录执行结果。创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI
  2.如果变更过程立即生效，则通过sync=true进行返回
  中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
   * Summary: SPI-变更产品实例配置
   */
  async modifySpProduct(request: ModifySpProductRequest): Promise<ModifySpProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.modifySpProductEx(request, headers, runtime);
  }

  /**
   * Description: 对已有的实例进行规格变更操作。
  支持同步、异步返回结果
  1.如果变更过程比较耗时，能力产品收到指令后需要自行落库并记录执行结果。创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI
  2.如果变更过程立即生效，则通过sync=true进行返回
  中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
   * Summary: SPI-变更产品实例配置
   */
  async modifySpProductEx(request: ModifySpProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ModifySpProductResponse> {
    Util.validateModel(request);
    return $tea.cast<ModifySpProductResponse>(await this.doRequest("1.0", "antcloudspi.sp.product.modify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ModifySpProductResponse({}));
  }

  /**
   * Description: 用户主动删除实例或欠费逾期平台按照约定进行强制删除。
  释放操作属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。产品方应保证快速响应。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔2分钟持续通知（限制100次）
  注意：如果产品的释放为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间5s)
   * Summary: SPI-释放产品实例
   */
  async releaseSpProduct(request: ReleaseSpProductRequest): Promise<ReleaseSpProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.releaseSpProductEx(request, headers, runtime);
  }

  /**
   * Description: 用户主动删除实例或欠费逾期平台按照约定进行强制删除。
  释放操作属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。产品方应保证快速响应。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔2分钟持续通知（限制100次）
  注意：如果产品的释放为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间5s)
   * Summary: SPI-释放产品实例
   */
  async releaseSpProductEx(request: ReleaseSpProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReleaseSpProductResponse> {
    Util.validateModel(request);
    return $tea.cast<ReleaseSpProductResponse>(await this.doRequest("1.0", "antcloudspi.sp.product.release", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReleaseSpProductResponse({}));
  }

  /**
   * Description: 对于操作型指令（创建、变配）平台用来查询底层对指定订单的生产结果（如果超过规定时间没有主动告知平台结果）。
  注意：平台根据 order_no 查询，需要根据order_no做好结果保存。一般不会查询历史订单执行记录，主要用于在规定的生产时间内，底层因为网络、超时等问题导致没有能够将结果”通知“给平台。在产品上架时允许自定义操作指令的超时时间（默认最大120分钟）。建议可以控制产品生产时间的情况下配置一个合理的超时时间，便于及时定位异常问题，减少用户页面等待时间。如需要配置联系平台。
  接口为同步，最大超时时间5s，失败尝试3次（间隔2s）。
   * Summary: SPI-获取产品订单结果
   */
  async getSpProductOrder(request: GetSpProductOrderRequest): Promise<GetSpProductOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSpProductOrderEx(request, headers, runtime);
  }

  /**
   * Description: 对于操作型指令（创建、变配）平台用来查询底层对指定订单的生产结果（如果超过规定时间没有主动告知平台结果）。
  注意：平台根据 order_no 查询，需要根据order_no做好结果保存。一般不会查询历史订单执行记录，主要用于在规定的生产时间内，底层因为网络、超时等问题导致没有能够将结果”通知“给平台。在产品上架时允许自定义操作指令的超时时间（默认最大120分钟）。建议可以控制产品生产时间的情况下配置一个合理的超时时间，便于及时定位异常问题，减少用户页面等待时间。如需要配置联系平台。
  接口为同步，最大超时时间5s，失败尝试3次（间隔2s）。
   * Summary: SPI-获取产品订单结果
   */
  async getSpProductOrderEx(request: GetSpProductOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSpProductOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSpProductOrderResponse>(await this.doRequest("1.0", "antcloudspi.sp.product.order.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSpProductOrderResponse({}));
  }

  /**
   * Description: 提供订单系统渲染购买页，从产品方加载部分个性化的展示内容。
   * Summary: 从产品方加载购买页参数
   */
  async loadSpProductOrderparameter(request: LoadSpProductOrderparameterRequest): Promise<LoadSpProductOrderparameterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.loadSpProductOrderparameterEx(request, headers, runtime);
  }

  /**
   * Description: 提供订单系统渲染购买页，从产品方加载部分个性化的展示内容。
   * Summary: 从产品方加载购买页参数
   */
  async loadSpProductOrderparameterEx(request: LoadSpProductOrderparameterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<LoadSpProductOrderparameterResponse> {
    Util.validateModel(request);
    return $tea.cast<LoadSpProductOrderparameterResponse>(await this.doRequest("1.0", "antcloudspi.sp.product.orderparameter.load", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new LoadSpProductOrderparameterResponse({}));
  }

  /**
   * Description: 交易结果通知
   * Summary: 交易结果通知
   */
  async syncIndustryTradeResult(request: SyncIndustryTradeResultRequest): Promise<SyncIndustryTradeResultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncIndustryTradeResultEx(request, headers, runtime);
  }

  /**
   * Description: 交易结果通知
   * Summary: 交易结果通知
   */
  async syncIndustryTradeResultEx(request: SyncIndustryTradeResultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncIndustryTradeResultResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncIndustryTradeResultResponse>(await this.doRequest("1.0", "antcloudspi.industry.trade.result.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncIndustryTradeResultResponse({}));
  }

  /**
   * Description: 商家注册结果通知
   * Summary: 商家注册结果通知
   */
  async syncMerchantSignResult(request: SyncMerchantSignResultRequest): Promise<SyncMerchantSignResultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncMerchantSignResultEx(request, headers, runtime);
  }

  /**
   * Description: 商家注册结果通知
   * Summary: 商家注册结果通知
   */
  async syncMerchantSignResultEx(request: SyncMerchantSignResultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncMerchantSignResultResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncMerchantSignResultResponse>(await this.doRequest("1.0", "antcloudspi.merchant.sign.result.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncMerchantSignResultResponse({}));
  }

  /**
   * Description: 签约状态变更通知
   * Summary: 签约状态变更通知
   */
  async syncMerchantAgreementResult(request: SyncMerchantAgreementResultRequest): Promise<SyncMerchantAgreementResultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncMerchantAgreementResultEx(request, headers, runtime);
  }

  /**
   * Description: 签约状态变更通知
   * Summary: 签约状态变更通知
   */
  async syncMerchantAgreementResultEx(request: SyncMerchantAgreementResultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncMerchantAgreementResultResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncMerchantAgreementResultResponse>(await this.doRequest("1.0", "antcloudspi.merchant.agreement.result.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncMerchantAgreementResultResponse({}));
  }

  /**
   * Description: pdf
   * Summary: test
   */
  async queryDemoCccCcc(request: QueryDemoCccCccRequest): Promise<QueryDemoCccCccResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDemoCccCccEx(request, headers, runtime);
  }

  /**
   * Description: pdf
   * Summary: test
   */
  async queryDemoCccCccEx(request: QueryDemoCccCccRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDemoCccCccResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDemoCccCccResponse>(await this.doRequest("1.0", "antcloudspi.demo.ccc.ccc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDemoCccCccResponse({}));
  }

  /**
   * Description: 合作方（伙伴、商家等）项目签约结果通知
   * Summary: 合作方（伙伴、商家等）项目签约结果通知
   */
  async syncAcpartnerProjectResult(request: SyncAcpartnerProjectResultRequest): Promise<SyncAcpartnerProjectResultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncAcpartnerProjectResultEx(request, headers, runtime);
  }

  /**
   * Description: 合作方（伙伴、商家等）项目签约结果通知
   * Summary: 合作方（伙伴、商家等）项目签约结果通知
   */
  async syncAcpartnerProjectResultEx(request: SyncAcpartnerProjectResultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncAcpartnerProjectResultResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncAcpartnerProjectResultResponse>(await this.doRequest("1.0", "antcloudspi.acpartner.project.result.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncAcpartnerProjectResultResponse({}));
  }

  /**
   * Description: 合作方（伙伴、商家等）入驻结果通知
   * Summary: 合作方（伙伴、商家等）入驻结果通知
   */
  async syncAcpartnerSettleinResult(request: SyncAcpartnerSettleinResultRequest): Promise<SyncAcpartnerSettleinResultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncAcpartnerSettleinResultEx(request, headers, runtime);
  }

  /**
   * Description: 合作方（伙伴、商家等）入驻结果通知
   * Summary: 合作方（伙伴、商家等）入驻结果通知
   */
  async syncAcpartnerSettleinResultEx(request: SyncAcpartnerSettleinResultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncAcpartnerSettleinResultResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncAcpartnerSettleinResultResponse>(await this.doRequest("1.0", "antcloudspi.acpartner.settlein.result.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncAcpartnerSettleinResultResponse({}));
  }

  /**
   * Description: 交易平台履约结果通知
   * Summary: 交易平台履约结果通知
   */
  async syncTradeFulfillResult(request: SyncTradeFulfillResultRequest): Promise<SyncTradeFulfillResultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncTradeFulfillResultEx(request, headers, runtime);
  }

  /**
   * Description: 交易平台履约结果通知
   * Summary: 交易平台履约结果通知
   */
  async syncTradeFulfillResultEx(request: SyncTradeFulfillResultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncTradeFulfillResultResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncTradeFulfillResultResponse>(await this.doRequest("1.0", "antcloudspi.trade.fulfill.result.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncTradeFulfillResultResponse({}));
  }

  /**
   * Description: 目前仅通知商品上架状态变更事件
   * Summary: 商品状态变更通知
   */
  async syncPccCommodityStatus(request: SyncPccCommodityStatusRequest): Promise<SyncPccCommodityStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncPccCommodityStatusEx(request, headers, runtime);
  }

  /**
   * Description: 目前仅通知商品上架状态变更事件
   * Summary: 商品状态变更通知
   */
  async syncPccCommodityStatusEx(request: SyncPccCommodityStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncPccCommodityStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncPccCommodityStatusResponse>(await this.doRequest("1.0", "antcloudspi.pcc.commodity.status.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncPccCommodityStatusResponse({}));
  }

  /**
   * Description: spi测试
   * Summary: spi测试
   */
  async queryDemoEcho(request: QueryDemoEchoRequest): Promise<QueryDemoEchoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDemoEchoEx(request, headers, runtime);
  }

  /**
   * Description: spi测试
   * Summary: spi测试
   */
  async queryDemoEchoEx(request: QueryDemoEchoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDemoEchoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDemoEchoResponse>(await this.doRequest("1.0", "antcloudspi.demo.echo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDemoEchoResponse({}));
  }

  /**
   * Description: 逻辑实例创建成功后回调
   * Summary: 逻辑实例创建成功后回调
   */
  async createSpProductLogicinstance(request: CreateSpProductLogicinstanceRequest): Promise<CreateSpProductLogicinstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSpProductLogicinstanceEx(request, headers, runtime);
  }

  /**
   * Description: 逻辑实例创建成功后回调
   * Summary: 逻辑实例创建成功后回调
   */
  async createSpProductLogicinstanceEx(request: CreateSpProductLogicinstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSpProductLogicinstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSpProductLogicinstanceResponse>(await this.doRequest("1.0", "antcloudspi.sp.product.logicinstance.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSpProductLogicinstanceResponse({}));
  }

  /**
   * Description: 商品实例续费，支持已经创建的商品，延长生效时间
   * Summary: SPI-商品实例续费
   */
  async renewSpProduct(request: RenewSpProductRequest): Promise<RenewSpProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.renewSpProductEx(request, headers, runtime);
  }

  /**
   * Description: 商品实例续费，支持已经创建的商品，延长生效时间
   * Summary: SPI-商品实例续费
   */
  async renewSpProductEx(request: RenewSpProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RenewSpProductResponse> {
    Util.validateModel(request);
    return $tea.cast<RenewSpProductResponse>(await this.doRequest("1.0", "antcloudspi.sp.product.renew", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RenewSpProductResponse({}));
  }

  /**
   * Description: 官网下单购买页面，用户输入的数据，提供给产品方校验是否符合要求
   * Summary: 购买页参数传递给产品方校验
   */
  async checkSpProductOrderparameter(request: CheckSpProductOrderparameterRequest): Promise<CheckSpProductOrderparameterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkSpProductOrderparameterEx(request, headers, runtime);
  }

  /**
   * Description: 官网下单购买页面，用户输入的数据，提供给产品方校验是否符合要求
   * Summary: 购买页参数传递给产品方校验
   */
  async checkSpProductOrderparameterEx(request: CheckSpProductOrderparameterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckSpProductOrderparameterResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckSpProductOrderparameterResponse>(await this.doRequest("1.0", "antcloudspi.sp.product.orderparameter.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckSpProductOrderparameterResponse({}));
  }

  /**
   * Description: 开通前通知
   * Summary: 开通前通知
   */
  async preopenSpProduct(request: PreopenSpProductRequest): Promise<PreopenSpProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.preopenSpProductEx(request, headers, runtime);
  }

  /**
   * Description: 开通前通知
   * Summary: 开通前通知
   */
  async preopenSpProductEx(request: PreopenSpProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PreopenSpProductResponse> {
    Util.validateModel(request);
    return $tea.cast<PreopenSpProductResponse>(await this.doRequest("1.0", "antcloudspi.sp.product.preopen", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PreopenSpProductResponse({}));
  }

  /**
   * Description: 产品开通指令。即租户开通了指定产品（比如：开通实人认证）。对于能力产品可能需要初始化操作。
  开通会生成产品实例ID，作为后续生命周期SPI管理资源的标识。用户开通一个产品会生成一个产品实例ID，如果后面欠费释放后再次开通会生成新的产品实例ID。
  目前开通只支持同步操作（目前超时最大5s），对于操作需要进行内部初始化的场景暂不支持。
  注意：开通操作中台会通知能力产品所有集群，如果其中一个集群失败，用户可以重试开通-触发中台重复通知（集群）。需要根据订单号order_no做好幂等判断。
   * Summary: SPI-开通产品
   */
  async openSpProduct(request: OpenSpProductRequest): Promise<OpenSpProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.openSpProductEx(request, headers, runtime);
  }

  /**
   * Description: 产品开通指令。即租户开通了指定产品（比如：开通实人认证）。对于能力产品可能需要初始化操作。
  开通会生成产品实例ID，作为后续生命周期SPI管理资源的标识。用户开通一个产品会生成一个产品实例ID，如果后面欠费释放后再次开通会生成新的产品实例ID。
  目前开通只支持同步操作（目前超时最大5s），对于操作需要进行内部初始化的场景暂不支持。
  注意：开通操作中台会通知能力产品所有集群，如果其中一个集群失败，用户可以重试开通-触发中台重复通知（集群）。需要根据订单号order_no做好幂等判断。
   * Summary: SPI-开通产品
   */
  async openSpProductEx(request: OpenSpProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OpenSpProductResponse> {
    Util.validateModel(request);
    return $tea.cast<OpenSpProductResponse>(await this.doRequest("1.0", "antcloudspi.sp.product.open", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OpenSpProductResponse({}));
  }

}
