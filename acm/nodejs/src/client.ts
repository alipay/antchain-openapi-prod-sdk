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

// 租户
export class Tenant extends $tea.Model {
  // 蚂蚁通行证签约账户
  antAccount?: string;
  // 蚂蚁通行证uid
  antUid?: string;
  // 金融云官网:ANTCLOUD,蚂蚁开放平台：ANTOPEN
  businessOwnerId?: string;
  // 租户创建时间，ISO8601格式
  createTime?: string;
  // 租户所在的企业的唯一标识
  customer?: string;
  // 租户描述信息
  description?: string;
  // 租户唯一标识
  id?: string;
  // 租户内部id
  internalId?: string;
  // 租户显示名称
  name?: string;
  // 租户最近一次修改时间，ISO8601格式
  updateTime?: string;
  static names(): { [key: string]: string } {
    return {
      antAccount: 'ant_account',
      antUid: 'ant_uid',
      businessOwnerId: 'business_owner_id',
      createTime: 'create_time',
      customer: 'customer',
      description: 'description',
      id: 'id',
      internalId: 'internal_id',
      name: 'name',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      antAccount: 'string',
      antUid: 'string',
      businessOwnerId: 'string',
      createTime: 'string',
      customer: 'string',
      description: 'string',
      id: 'string',
      internalId: 'string',
      name: 'string',
      updateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 操作员
export class Operator extends $tea.Model {
  // 操作员创建时间，ISO8601格式
  createTime?: string;
  // 操作员所在的企业
  customer?: string;
  // 邮箱
  email?: string;
  // 外部对接系统操作员id
  externalId?: string;
  // 外部对接系统类型
  externalSystem?: string;
  // 操作员ID
  id?: string;
  // 登录名
  loginName?: string;
  // 手机号
  mobile?: string;
  // 昵称
  nickname?: string;
  // 真实姓名
  realName?: string;
  // 操作员状态(INACTIVE：未激活，NORMAL：正常状态，FROZEN：冻结状态)
  status?: string;
  // 操作员加入的租户列表
  tenants?: string[];
  // 操作员最近一次修改时间，ISO8601格式
  updateTime?: string;
  static names(): { [key: string]: string } {
    return {
      createTime: 'create_time',
      customer: 'customer',
      email: 'email',
      externalId: 'external_id',
      externalSystem: 'external_system',
      id: 'id',
      loginName: 'login_name',
      mobile: 'mobile',
      nickname: 'nickname',
      realName: 'real_name',
      status: 'status',
      tenants: 'tenants',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      createTime: 'string',
      customer: 'string',
      email: 'string',
      externalId: 'string',
      externalSystem: 'string',
      id: 'string',
      loginName: 'string',
      mobile: 'string',
      nickname: 'string',
      realName: 'string',
      status: 'string',
      tenants: { 'type': 'array', 'itemType': 'string' },
      updateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AccessKey
export class AccessKey extends $tea.Model {
  // AccessKey创建时间，ISO8601格式
  createTime?: string;
  // AccessKey唯一标识
  id?: string;
  // AccessKey的秘钥，加密传输，网关返回后，使用调用方的AccesSecret进行解密
  secret?: string;
  // 状态
  status?: string;
  // AccessKey最近一次修改时间，ISO8601格式
  updateTime?: string;
  static names(): { [key: string]: string } {
    return {
      createTime: 'create_time',
      id: 'id',
      secret: 'secret',
      status: 'status',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      createTime: 'string',
      id: 'string',
      secret: 'string',
      status: 'string',
      updateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 标签实体
export class Tag extends $tea.Model {
  // 标签类型
  tagType: string;
  // 标签值
  tagValue: string;
  static names(): { [key: string]: string } {
    return {
      tagType: 'tag_type',
      tagValue: 'tag_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tagType: 'string',
      tagValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 访问IaaS层的身份
export class Accessor extends $tea.Model {
  // Accessor关联的AccessKey
  accessKey?: string;
  // Accessor关联的AccessKey的密钥，加密传输，网关返回后，使用调用方的AccessSecret进行解密
  accessSecret?: string;
  // AccessKey的密钥，加密传输，网关返回后，使用调用方的AccessSecret进行解密
  account?: string;
  // AccessKey创建时间，ISO8601格式
  createTime?: string;
  // Accessor唯一标识
  id?: string;
  // Accessor类型(RAM/ACCOUNT)
  type?: string;
  static names(): { [key: string]: string } {
    return {
      accessKey: 'access_key',
      accessSecret: 'access_secret',
      account: 'account',
      createTime: 'create_time',
      id: 'id',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accessKey: 'string',
      accessSecret: 'string',
      account: 'string',
      createTime: 'string',
      id: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业
export class Customer extends $tea.Model {
  // 企业创建时间，ISO8601格式
  createTime?: string;
  // 企业ID
  id?: string;
  // 企业名称
  name?: string;
  // 企业最近一次修改时间，ISO8601格式
  updateTime?: string;
  static names(): { [key: string]: string } {
    return {
      createTime: 'create_time',
      id: 'id',
      name: 'name',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      createTime: 'string',
      id: 'string',
      name: 'string',
      updateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCustomerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 企业ID
  customer: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      customer: 'customer',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      customer: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCustomerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建时间，ISO8601格式
  createTime?: string;
  // 企业ID
  id: string;
  // 企业名称
  name: string;
  // 最近一次修改时间，ISO8601格式
  updateTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      createTime: 'create_time',
      id: 'id',
      name: 'name',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      createTime: 'string',
      id: 'string',
      name: 'string',
      updateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetOperatorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 操作员登录名
  loginName?: string;
  // 金融云操作员id
  operatorId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      loginName: 'login_name',
      operatorId: 'operator_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      loginName: 'string',
      operatorId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetOperatorResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作员创建时间，ISO8601格式
  createTime?: string;
  // 操作员所在的企业
  customer: string;
  // 邮箱
  email: string;
  // 外部对接系统操作员ID
  externalId: string;
  // 外部对接系统类型
  externalSystem: string;
  // 操作员ID
  id: string;
  // 登录名
  loginName: string;
  // 手机号
  mobile: string;
  // 昵称
  nickname: string;
  // 真实姓名
  realName: string;
  // 操作员状态(INACTIVE：未激活，NORMAL：正常状态，FROZEN：冻结状态)
  status: string;
  // 用户加入的租户列表
  tenants: string[];
  // 操作员最近一次修改时间，ISO8601格式
  updateTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      createTime: 'create_time',
      customer: 'customer',
      email: 'email',
      externalId: 'external_id',
      externalSystem: 'external_system',
      id: 'id',
      loginName: 'login_name',
      mobile: 'mobile',
      nickname: 'nickname',
      realName: 'real_name',
      status: 'status',
      tenants: 'tenants',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      createTime: 'string',
      customer: 'string',
      email: 'string',
      externalId: 'string',
      externalSystem: 'string',
      id: 'string',
      loginName: 'string',
      mobile: 'string',
      nickname: 'string',
      realName: 'string',
      status: 'string',
      tenants: { 'type': 'array', 'itemType': 'string' },
      updateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOperatorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 企业ID
  customer: string;
  // 当前页，默认值为1
  pageNum?: number;
  // 分页大小，默认值为10
  pageSize?: number;
  // 真实姓名
  realName?: string;
  // 租户唯一标识
  tenant?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      customer: 'customer',
      pageNum: 'page_num',
      pageSize: 'page_size',
      realName: 'real_name',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      customer: 'string',
      pageNum: 'number',
      pageSize: 'number',
      realName: 'string',
      tenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryOperatorResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作员列表
  operators: Operator[];
  // 传入的页码, 如果没有传入, 则取默认值1
  pageNum: number;
  // 传入的页大小, 如果没有传入, 则取默认值10
  pageSize: number;
  // 查询结果的总条目数量
  totalCount: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      operators: 'operators',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      operators: { 'type': 'array', 'itemType': Operator },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SearchOperatorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 企业ID
  customer: string;
  // 登录名
  loginName?: string;
  // 昵称
  nickname?: string;
  // 当前页，默认值为1
  pageNum?: number;
  // 分页大小，默认值为10
  pageSize?: number;
  // 真实姓名
  realName?: string;
  // 租户唯一标识
  tenant?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      customer: 'customer',
      loginName: 'login_name',
      nickname: 'nickname',
      pageNum: 'page_num',
      pageSize: 'page_size',
      realName: 'real_name',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      customer: 'string',
      loginName: 'string',
      nickname: 'string',
      pageNum: 'number',
      pageSize: 'number',
      realName: 'string',
      tenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SearchOperatorResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作员列表
  operators: Operator[];
  // 传入的页码, 如果没有传入, 则取默认值1
  pageNum: number;
  // 传入的页大小, 如果没有传入, 则取默认值10
  pageSize: number;
  // 查询结果的总条目数量
  totalCount: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      operators: 'operators',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      operators: { 'type': 'array', 'itemType': Operator },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateOperatorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 企业唯一标识
  customer?: string;
  // 外部对接系统操作员ID
  externalId?: string;
  // 外部对接系统类型
  externalSystem?: string;
  // 操作员唯一登录名
  loginName: string;
  // 手机号
  mobile?: string;
  // 操作员昵称
  nickname?: string;
  // 操作员真实姓名
  realName: string;
  // 租户唯一标识
  tenant?: string;
  // 业务场景码
  bussinessCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      customer: 'customer',
      externalId: 'external_id',
      externalSystem: 'external_system',
      loginName: 'login_name',
      mobile: 'mobile',
      nickname: 'nickname',
      realName: 'real_name',
      tenant: 'tenant',
      bussinessCode: 'bussiness_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      customer: 'string',
      externalId: 'string',
      externalSystem: 'string',
      loginName: 'string',
      mobile: 'string',
      nickname: 'string',
      realName: 'string',
      tenant: 'string',
      bussinessCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateOperatorResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作员唯一ID
  operatorId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      operatorId: 'operator_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      operatorId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateOperatorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 邮箱
  email?: string;
  // 手机号
  mobile?: string;
  // 操作员昵称
  nickname?: string;
  // 操作员唯一ID
  operatorId: string;
  // 操作员真实姓名
  realName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      email: 'email',
      mobile: 'mobile',
      nickname: 'nickname',
      operatorId: 'operator_id',
      realName: 'real_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      email: 'string',
      mobile: 'string',
      nickname: 'string',
      operatorId: 'string',
      realName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateOperatorResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作员创建时间，ISO8601格式
  createTime?: string;
  // 操作员所在的企业
  customer: string;
  // 邮箱
  email: string;
  // 操作员ID
  id: string;
  // 登录名
  loginName: string;
  // 手机号
  mobile: string;
  // 昵称
  nickname: string;
  // 真实姓名
  realName: string;
  // 操作员状态(INACTIVE：未激活，NORMAL：正常状态，FROZEN：冻结状态)
  status: string;
  // 用户加入的租户列表
  tenants: string[];
  // 操作员最近一次修改时间，ISO8601格式
  updateTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      createTime: 'create_time',
      customer: 'customer',
      email: 'email',
      id: 'id',
      loginName: 'login_name',
      mobile: 'mobile',
      nickname: 'nickname',
      realName: 'real_name',
      status: 'status',
      tenants: 'tenants',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      createTime: 'string',
      customer: 'string',
      email: 'string',
      id: 'string',
      loginName: 'string',
      mobile: 'string',
      nickname: 'string',
      realName: 'string',
      status: 'string',
      tenants: { 'type': 'array', 'itemType': 'string' },
      updateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteOperatorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 操作员唯一id
  operatorId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operatorId: 'operator_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operatorId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteOperatorResponse extends $tea.Model {
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

export class AddTenantMemberRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 操作员唯一id
  operatorId: string;
  // 操作员唯一id
  tenant: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      operatorId: 'operator_id',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      operatorId: 'string',
      tenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddTenantMemberResponse extends $tea.Model {
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

export class CreateTenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 蚂蚁通行证uid
  antUid: string;
  // 金融云官网:ANTCLOUD, 蚂蚁开放平台：ANTOPEN, 口碑：KOUBEI
  businessOwnerId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      antUid: 'ant_uid',
      businessOwnerId: 'business_owner_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      antUid: 'string',
      businessOwnerId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTenantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 租户唯一标识
  tenant: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户唯一标识
  tenant: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTenantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 蚂蚁通行证签约账户
  antAccount: string;
  // 蚂蚁通行证uid
  antUid: string;
  // 金融云官网:ANTCLOUD,蚂蚁开放平台：ANTOPEN
  businessOwnerId: string;
  // 租户创建时间，ISO8601格式
  createTime?: string;
  // 租户所在的企业的唯一标识
  customer?: string;
  // 租户描述信息
  description?: string;
  // 租户唯一标识
  id?: string;
  // 租户内部id
  internalId?: string;
  // 租户显示名称
  name?: string;
  // 租户最近一次修改时间，ISO8601格式
  updateTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      antAccount: 'ant_account',
      antUid: 'ant_uid',
      businessOwnerId: 'business_owner_id',
      createTime: 'create_time',
      customer: 'customer',
      description: 'description',
      id: 'id',
      internalId: 'internal_id',
      name: 'name',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      antAccount: 'string',
      antUid: 'string',
      businessOwnerId: 'string',
      createTime: 'string',
      customer: 'string',
      description: 'string',
      id: 'string',
      internalId: 'string',
      name: 'string',
      updateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 企业唯一标识
  customer: string;
  // 当前页，默认值为1
  pageNum?: number;
  // 分页大小，默认值为10
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      customer: 'customer',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      customer: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTenantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 传入的页码, 如果没有传入, 则取默认值1
  pageNum: number;
  // 传入的页大小, 如果没有传入, 则取默认值10
  pageSize: number;
  // 租户列表
  tenants: Tenant[];
  // 查询结果的总条目数量
  totalCount: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageNum: 'page_num',
      pageSize: 'page_size',
      tenants: 'tenants',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pageNum: 'number',
      pageSize: 'number',
      tenants: { 'type': 'array', 'itemType': Tenant },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntpassportTenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 蚂蚁通行证uid
  antUid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      antUid: 'ant_uid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      antUid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAntpassportTenantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  tenant: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAccesskeyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 操作员或服务账号唯一ID
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAccesskeyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // AccessKey列表
  accessKeys: AccessKey[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accessKeys: 'access_keys',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accessKeys: { 'type': 'array', 'itemType': AccessKey },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCurrentidRequest extends $tea.Model {
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

export class GetCurrentidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建时间，ISO8601格式
  createTime: string;
  // 身份实体所属企业
  customer: string;
  // 身份实体ID
  id: string;
  // 身份实体类型，OPERATOR(操作员)或SERVICE(服务账号)
  type: string;
  // 最近一次修改时间，ISO8601格式
  updateTime: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      createTime: 'create_time',
      customer: 'customer',
      id: 'id',
      type: 'type',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      createTime: 'string',
      customer: 'string',
      id: 'string',
      type: 'string',
      updateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAccessorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // Accessor关联的accessKey
  accessKeyId?: string;
  // 租户唯一标识
  tenant?: string;
  // 操作员或服务账号唯一ID
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      accessKeyId: 'access_key_id',
      tenant: 'tenant',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      accessKeyId: 'string',
      tenant: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAccessorResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // Accessor关联的AccessKey
  accessKey?: string;
  // Accessor关联的AccessKey的密钥，加密传输，网关返回后，使用调用方的AccessSecret进行解密
  accessSecret?: string;
  // AccessKey的密钥，加密传输，网关返回后，使用调用方的AccessSecret进行解密
  account?: string;
  // AccessKey创建时间，ISO8601格式
  createTime?: string;
  // Accessor唯一标识
  id?: string;
  // 关联的租户
  tenant?: string;
  // Accessor类型(RAM/ACCOUNT)
  type?: string;
  // 关联的用户ID
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accessKey: 'access_key',
      accessSecret: 'access_secret',
      account: 'account',
      createTime: 'create_time',
      id: 'id',
      tenant: 'tenant',
      type: 'type',
      userId: 'userId',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accessKey: 'string',
      accessSecret: 'string',
      account: 'string',
      createTime: 'string',
      id: 'string',
      tenant: 'string',
      type: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTenantDingtokenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 入驻金融云的产品码
  product: string;
  // 租户唯一标识
  tenant: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      product: 'product',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      product: 'string',
      tenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTenantDingtokenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 钉钉企业授权token
  accessToken: string;
  // 	钉钉企业授权应用ID
  agentId: string;
  // 钉钉企业ID
  corpId: string;
  // 创建时间，ISO8601格式
  createTime?: string;
  // 前端授权ticket
  jsTicket: string;
  // 最近一次修改时间，ISO8601格式
  updateTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accessToken: 'access_token',
      agentId: 'agent_id',
      corpId: 'corp_id',
      createTime: 'create_time',
      jsTicket: 'js_ticket',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accessToken: 'string',
      agentId: 'string',
      corpId: 'string',
      createTime: 'string',
      jsTicket: 'string',
      updateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAdminRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户唯一标识
  tenant: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAdminResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作员列表
  operators: Operator[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      operators: 'operators',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      operators: { 'type': 'array', 'itemType': Operator },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTenantIaasaccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户唯一标识
  tenant: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetTenantIaasaccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 账户关联的AccessKey
  accessKey?: string;
  // 账户关联的AccessSecret
  accessSecret?: string;
  // IaaS账户名
  account?: string;
  // 创建时间，ISO8601格式
  createTime?: string;
  // IaaS账户id
  id?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accessKey: 'access_key',
      accessSecret: 'access_secret',
      account: 'account',
      createTime: 'create_time',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accessKey: 'string',
      accessSecret: 'string',
      account: 'string',
      createTime: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCustomerRequest extends $tea.Model {
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

export class ListCustomerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 企业列表
  customers: Customer[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      customers: 'customers',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      customers: { 'type': 'array', 'itemType': Customer },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckAlipayTenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 支付宝账号关联的证件号
  certNo?: string;
  // 渠道编码 ，新接入时需要申请
  channelCode: string;
  // 企业名称
  firmName?: string;
  // 法人姓名
  realName?: string;
  // 业务场景编码
  sceneCode: string;
  // 智科租户id(支付宝账号会员id）
  tenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      certNo: 'cert_no',
      channelCode: 'channel_code',
      firmName: 'firm_name',
      realName: 'real_name',
      sceneCode: 'scene_code',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      certNo: 'string',
      channelCode: 'string',
      firmName: 'string',
      realName: 'string',
      sceneCode: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckAlipayTenantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 智科租户id(支付宝会员id)
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTenantStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 渠道码，接入时需要申请
  channelCode: string;
  // 业务场景码，接入时需要申请
  sceneCode: string;
  // 智科租户id（支付宝会员id)
  tenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      channelCode: 'channel_code',
      sceneCode: 'scene_code',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      channelCode: 'string',
      sceneCode: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTenantStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 租户入住状态
  status?: string;
  // 智科租户id（支付宝会员id）
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntchainTenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 企业名称或个人名称
  name: string;
  // 客户类型
  // PERSON("个人","1"),
  // ENTERPRISE("企业","2")
  userType: string;
  // 证件号
  certNo?: string;
  // 证件类型
  certType?: string;
  // 法人姓名
  realName?: string;
  // 法人证件号
  artificialPersonCertNo?: string;
  // 法人证件类型
  artificialPersonCertType?: string;
  // 支付宝登录号
  loginName?: string;
  // 支付宝uid(租户id)
  tenantId?: string;
  // 业务场景码
  bussinessCode: string;
  // 在平台上的角色，比如服务提供方，服务消费方，合作机构，资金提供方
  bussinessRole?: string;
  // 是否支付宝账户入驻
  isAlipayTenant: boolean;
  // 是否认证过，不填默认未认证
  antchainCertified?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      name: 'name',
      userType: 'user_type',
      certNo: 'cert_no',
      certType: 'cert_type',
      realName: 'real_name',
      artificialPersonCertNo: 'artificial_person_cert_no',
      artificialPersonCertType: 'artificial_person_cert_type',
      loginName: 'login_name',
      tenantId: 'tenant_id',
      bussinessCode: 'bussiness_code',
      bussinessRole: 'bussiness_role',
      isAlipayTenant: 'is_alipay_tenant',
      antchainCertified: 'antchain_certified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      name: 'string',
      userType: 'string',
      certNo: 'string',
      certType: 'string',
      realName: 'string',
      artificialPersonCertNo: 'string',
      artificialPersonCertType: 'string',
      loginName: 'string',
      tenantId: 'string',
      bussinessCode: 'string',
      bussinessRole: 'string',
      isAlipayTenant: 'boolean',
      antchainCertified: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntchainTenantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 租户id
  tenantId?: string;
  // 客户id
  customerId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tenantId: 'tenant_id',
      customerId: 'customer_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tenantId: 'string',
      customerId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateCustomerIdentityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 客户id
  customerId?: string;
  // 企业名称或个人名称
  name: string;
  // 租户id
  tenantId?: string;
  // 证件号
  certNo: string;
  // 证件类型
  certType: string;
  // 法人姓名
  realName?: string;
  // 法人证件号码
  artificialPersonCertNo?: string;
  // 法人证件类型
  artificialPersonCertType?: string;
  // 业务场景码
  businessCode: string;
  // 业务角色
  bussinessRole?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      customerId: 'customer_id',
      name: 'name',
      tenantId: 'tenant_id',
      certNo: 'cert_no',
      certType: 'cert_type',
      realName: 'real_name',
      artificialPersonCertNo: 'artificial_person_cert_no',
      artificialPersonCertType: 'artificial_person_cert_type',
      businessCode: 'business_code',
      bussinessRole: 'bussiness_role',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      customerId: 'string',
      name: 'string',
      tenantId: 'string',
      certNo: 'string',
      certType: 'string',
      realName: 'string',
      artificialPersonCertNo: 'string',
      artificialPersonCertType: 'string',
      businessCode: 'string',
      bussinessRole: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateCustomerIdentityResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回客户id
  customerId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      customerId: 'customer_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      customerId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckLoginIdRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 登录id
  loginName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      loginName: 'login_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      loginName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckLoginIdResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否存在
  exist?: boolean;
  // 所属的租户id
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      exist: 'exist',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      exist: 'boolean',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetMasterTenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 主账号id
  tenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetMasterTenantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 蚂蚁通行证签约账户
  loginName?: string;
  // 租户id
  tenantId?: string;
  // 租户创建时间，ISO8601格式	
  createTime?: string;
  // 客户id
  customerId?: string;
  // 租户描述信息	
  description?: string;
  // 租户名称
  name?: string;
  // 租户最近一次修改时间，ISO8601格式	
  updateTime?: string;
  // 用户类型
  userType?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      loginName: 'login_name',
      tenantId: 'tenant_id',
      createTime: 'create_time',
      customerId: 'customer_id',
      description: 'description',
      name: 'name',
      updateTime: 'update_time',
      userType: 'user_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      loginName: 'string',
      tenantId: 'string',
      createTime: 'string',
      customerId: 'string',
      description: 'string',
      name: 'string',
      updateTime: 'string',
      userType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckLoginnameRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 邮箱名称
  loginName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      loginName: 'login_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      loginName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckLoginnameResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否存在
  exist?: boolean;
  // 所属租户ID
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      exist: 'exist',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      exist: 'boolean',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTenantTagRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户id
  tenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTenantTagResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 标签列表
  tags?: Tag[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tags: 'tags',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tags: { 'type': 'array', 'itemType': Tag },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddTenantBusinesstagRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户ID
  tenantId: string;
  // 业务场景码
  businessCode: string;
  // 业务场景的权限码，区分大小写
  authCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenantId: 'tenant_id',
      businessCode: 'business_code',
      authCode: 'auth_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenantId: 'string',
      businessCode: 'string',
      authCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddTenantBusinesstagResponse extends $tea.Model {
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

export class RemoveTenantBusinesstagRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 租户ID
  tenantId: string;
  // 业务场景码
  businessCode: string;
  // 业务场景的权限吗
  authCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      tenantId: 'tenant_id',
      businessCode: 'business_code',
      authCode: 'auth_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      tenantId: 'string',
      businessCode: 'string',
      authCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RemoveTenantBusinesstagResponse extends $tea.Model {
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
          sdk_version: "1.0.19",
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
   * Description: 查询企业详情
   * Summary: 获取企业
   */
  async getCustomer(request: GetCustomerRequest): Promise<GetCustomerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getCustomerEx(request, headers, runtime);
  }

  /**
   * Description: 查询企业详情
   * Summary: 获取企业
   */
  async getCustomerEx(request: GetCustomerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetCustomerResponse> {
    Util.validateModel(request);
    return $tea.cast<GetCustomerResponse>(await this.doRequest("1.0", "antcloud.acm.customer.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetCustomerResponse({}));
  }

  /**
   * Description: 查询一个操作员的详情
   * Summary: 获取操作员
   */
  async getOperator(request: GetOperatorRequest): Promise<GetOperatorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getOperatorEx(request, headers, runtime);
  }

  /**
   * Description: 查询一个操作员的详情
   * Summary: 获取操作员
   */
  async getOperatorEx(request: GetOperatorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetOperatorResponse> {
    Util.validateModel(request);
    return $tea.cast<GetOperatorResponse>(await this.doRequest("1.0", "antcloud.acm.operator.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetOperatorResponse({}));
  }

  /**
   * Description: 查询操作员列表
   * Summary: 查询操作员
   */
  async queryOperator(request: QueryOperatorRequest): Promise<QueryOperatorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryOperatorEx(request, headers, runtime);
  }

  /**
   * Description: 查询操作员列表
   * Summary: 查询操作员
   */
  async queryOperatorEx(request: QueryOperatorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryOperatorResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryOperatorResponse>(await this.doRequest("1.0", "antcloud.acm.operator.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryOperatorResponse({}));
  }

  /**
   * Description: 搜索操作员
   * Summary: 搜索操作员
   */
  async searchOperator(request: SearchOperatorRequest): Promise<SearchOperatorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.searchOperatorEx(request, headers, runtime);
  }

  /**
   * Description: 搜索操作员
   * Summary: 搜索操作员
   */
  async searchOperatorEx(request: SearchOperatorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SearchOperatorResponse> {
    Util.validateModel(request);
    return $tea.cast<SearchOperatorResponse>(await this.doRequest("1.0", "antcloud.acm.operator.search", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SearchOperatorResponse({}));
  }

  /**
   * Description: 创建操作员
   * Summary: 创建操作员
   */
  async createOperator(request: CreateOperatorRequest): Promise<CreateOperatorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createOperatorEx(request, headers, runtime);
  }

  /**
   * Description: 创建操作员
   * Summary: 创建操作员
   */
  async createOperatorEx(request: CreateOperatorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateOperatorResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateOperatorResponse>(await this.doRequest("1.0", "antcloud.acm.operator.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateOperatorResponse({}));
  }

  /**
   * Description: 更新操作员
   * Summary: 更新操作员
   */
  async updateOperator(request: UpdateOperatorRequest): Promise<UpdateOperatorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateOperatorEx(request, headers, runtime);
  }

  /**
   * Description: 更新操作员
   * Summary: 更新操作员
   */
  async updateOperatorEx(request: UpdateOperatorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateOperatorResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateOperatorResponse>(await this.doRequest("1.0", "antcloud.acm.operator.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateOperatorResponse({}));
  }

  /**
   * Description: 删除操作员
   * Summary: 删除操作员
   */
  async deleteOperator(request: DeleteOperatorRequest): Promise<DeleteOperatorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteOperatorEx(request, headers, runtime);
  }

  /**
   * Description: 删除操作员
   * Summary: 删除操作员
   */
  async deleteOperatorEx(request: DeleteOperatorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteOperatorResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteOperatorResponse>(await this.doRequest("1.0", "antcloud.acm.operator.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteOperatorResponse({}));
  }

  /**
   * Description: 添加租户成员
   * Summary: 添加租户成员
   */
  async addTenantMember(request: AddTenantMemberRequest): Promise<AddTenantMemberResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addTenantMemberEx(request, headers, runtime);
  }

  /**
   * Description: 添加租户成员
   * Summary: 添加租户成员
   */
  async addTenantMemberEx(request: AddTenantMemberRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddTenantMemberResponse> {
    Util.validateModel(request);
    return $tea.cast<AddTenantMemberResponse>(await this.doRequest("1.0", "antcloud.acm.tenant.member.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddTenantMemberResponse({}));
  }

  /**
   * Description: 初始化租户
   * Summary: 初始化租户
   */
  async createTenant(request: CreateTenantRequest): Promise<CreateTenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createTenantEx(request, headers, runtime);
  }

  /**
   * Description: 初始化租户
   * Summary: 初始化租户
   */
  async createTenantEx(request: CreateTenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateTenantResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTenantResponse>(await this.doRequest("1.0", "antcloud.acm.tenant.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateTenantResponse({}));
  }

  /**
   * Description: 查询租户详情
   * Summary: 获取租户
   */
  async getTenant(request: GetTenantRequest): Promise<GetTenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTenantEx(request, headers, runtime);
  }

  /**
   * Description: 查询租户详情
   * Summary: 获取租户
   */
  async getTenantEx(request: GetTenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTenantResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTenantResponse>(await this.doRequest("1.0", "antcloud.acm.tenant.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTenantResponse({}));
  }

  /**
   * Description: 查询租户列表
   * Summary: 查询租户列表
   */
  async queryTenant(request: QueryTenantRequest): Promise<QueryTenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTenantEx(request, headers, runtime);
  }

  /**
   * Description: 查询租户列表
   * Summary: 查询租户列表
   */
  async queryTenantEx(request: QueryTenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTenantResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTenantResponse>(await this.doRequest("1.0", "antcloud.acm.tenant.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTenantResponse({}));
  }

  /**
   * Description: 根据蚂蚁通行证uid查询租户id
   * Summary: 查询租户ID
   */
  async getAntpassportTenant(request: GetAntpassportTenantRequest): Promise<GetAntpassportTenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAntpassportTenantEx(request, headers, runtime);
  }

  /**
   * Description: 根据蚂蚁通行证uid查询租户id
   * Summary: 查询租户ID
   */
  async getAntpassportTenantEx(request: GetAntpassportTenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAntpassportTenantResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAntpassportTenantResponse>(await this.doRequest("1.0", "antcloud.acm.antpassport.tenant.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAntpassportTenantResponse({}));
  }

  /**
   * Description: 获取用户AccessKey信息
   * Summary: 获取用户AccessKey信息
   */
  async listAccesskey(request: ListAccesskeyRequest): Promise<ListAccesskeyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAccesskeyEx(request, headers, runtime);
  }

  /**
   * Description: 获取用户AccessKey信息
   * Summary: 获取用户AccessKey信息
   */
  async listAccesskeyEx(request: ListAccesskeyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAccesskeyResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAccesskeyResponse>(await this.doRequest("1.0", "antcloud.acm.accesskey.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAccesskeyResponse({}));
  }

  /**
   * Description: 获取调用接口所使用AccessKey对应的身份实体信息
   * Summary: 获取调用接口所使用AccessKey对应的身份实体信息
   */
  async getCurrentid(request: GetCurrentidRequest): Promise<GetCurrentidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getCurrentidEx(request, headers, runtime);
  }

  /**
   * Description: 获取调用接口所使用AccessKey对应的身份实体信息
   * Summary: 获取调用接口所使用AccessKey对应的身份实体信息
   */
  async getCurrentidEx(request: GetCurrentidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetCurrentidResponse> {
    Util.validateModel(request);
    return $tea.cast<GetCurrentidResponse>(await this.doRequest("1.0", "antcloud.acm.currentid.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetCurrentidResponse({}));
  }

  /**
   * Description: 获取用户Accessor信息
   * Summary: 获取用户Accessor信息
   */
  async getAccessor(request: GetAccessorRequest): Promise<GetAccessorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAccessorEx(request, headers, runtime);
  }

  /**
   * Description: 获取用户Accessor信息
   * Summary: 获取用户Accessor信息
   */
  async getAccessorEx(request: GetAccessorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAccessorResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAccessorResponse>(await this.doRequest("1.0", "antcloud.acm.accessor.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAccessorResponse({}));
  }

  /**
   * Description: 获取租户对应的钉钉授权token信息，内部接口
   * Summary: 获取租户的钉钉授权
   */
  async getTenantDingtoken(request: GetTenantDingtokenRequest): Promise<GetTenantDingtokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTenantDingtokenEx(request, headers, runtime);
  }

  /**
   * Description: 获取租户对应的钉钉授权token信息，内部接口
   * Summary: 获取租户的钉钉授权
   */
  async getTenantDingtokenEx(request: GetTenantDingtokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTenantDingtokenResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTenantDingtokenResponse>(await this.doRequest("1.0", "antcloud.acm.tenant.dingtoken.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTenantDingtokenResponse({}));
  }

  /**
   * Description: 分页查询管理员，内部接口
   * Summary: 分页查询管理员
   */
  async queryAdmin(request: QueryAdminRequest): Promise<QueryAdminResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAdminEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询管理员，内部接口
   * Summary: 分页查询管理员
   */
  async queryAdminEx(request: QueryAdminRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAdminResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAdminResponse>(await this.doRequest("1.0", "antcloud.acm.admin.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAdminResponse({}));
  }

  /**
   * Description: 获取租户的IaaS账号
   * Summary: 获取租户的IaaS账号
   */
  async getTenantIaasaccount(request: GetTenantIaasaccountRequest): Promise<GetTenantIaasaccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getTenantIaasaccountEx(request, headers, runtime);
  }

  /**
   * Description: 获取租户的IaaS账号
   * Summary: 获取租户的IaaS账号
   */
  async getTenantIaasaccountEx(request: GetTenantIaasaccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetTenantIaasaccountResponse> {
    Util.validateModel(request);
    return $tea.cast<GetTenantIaasaccountResponse>(await this.doRequest("1.0", "antcloud.acm.tenant.iaasaccount.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetTenantIaasaccountResponse({}));
  }

  /**
   * Description: 查询企业列表(内部接口,私有云开放)
   * Summary: 查询企业列表
   */
  async listCustomer(request: ListCustomerRequest): Promise<ListCustomerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listCustomerEx(request, headers, runtime);
  }

  /**
   * Description: 查询企业列表(内部接口,私有云开放)
   * Summary: 查询企业列表
   */
  async listCustomerEx(request: ListCustomerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListCustomerResponse> {
    Util.validateModel(request);
    return $tea.cast<ListCustomerResponse>(await this.doRequest("1.0", "antcloud.acm.customer.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListCustomerResponse({}));
  }

  /**
   * Description: 支付宝账号证书信息校验及校验、入驻、打标
   * Summary: 支付宝账号证书信息校验、入驻、打标
   */
  async checkAlipayTenant(request: CheckAlipayTenantRequest): Promise<CheckAlipayTenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkAlipayTenantEx(request, headers, runtime);
  }

  /**
   * Description: 支付宝账号证书信息校验及校验、入驻、打标
   * Summary: 支付宝账号证书信息校验、入驻、打标
   */
  async checkAlipayTenantEx(request: CheckAlipayTenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckAlipayTenantResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckAlipayTenantResponse>(await this.doRequest("1.0", "antcloud.acm.alipay.tenant.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckAlipayTenantResponse({}));
  }

  /**
   * Description: 租户入住状态查询
   * Summary: 租户入住状态查询
   */
  async queryTenantStatus(request: QueryTenantStatusRequest): Promise<QueryTenantStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTenantStatusEx(request, headers, runtime);
  }

  /**
   * Description: 租户入住状态查询
   * Summary: 租户入住状态查询
   */
  async queryTenantStatusEx(request: QueryTenantStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTenantStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTenantStatusResponse>(await this.doRequest("1.0", "antcloud.acm.tenant.status.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTenantStatusResponse({}));
  }

  /**
   * Description: 账号创建
   * Summary: 账号创建
   */
  async createAntchainTenant(request: CreateAntchainTenantRequest): Promise<CreateAntchainTenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAntchainTenantEx(request, headers, runtime);
  }

  /**
   * Description: 账号创建
   * Summary: 账号创建
   */
  async createAntchainTenantEx(request: CreateAntchainTenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAntchainTenantResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAntchainTenantResponse>(await this.doRequest("1.0", "antcloud.acm.antchain.tenant.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAntchainTenantResponse({}));
  }

  /**
   * Description: 客户认证信息更新
   * Summary: 客户认证信息更新
   */
  async updateCustomerIdentity(request: UpdateCustomerIdentityRequest): Promise<UpdateCustomerIdentityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateCustomerIdentityEx(request, headers, runtime);
  }

  /**
   * Description: 客户认证信息更新
   * Summary: 客户认证信息更新
   */
  async updateCustomerIdentityEx(request: UpdateCustomerIdentityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateCustomerIdentityResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateCustomerIdentityResponse>(await this.doRequest("1.0", "antcloud.acm.customer.identity.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateCustomerIdentityResponse({}));
  }

  /**
   * Description: 校验邮箱是否可以创建账号
   * Summary: 校验邮箱是否可以创建账号
   */
  async checkLoginId(request: CheckLoginIdRequest): Promise<CheckLoginIdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkLoginIdEx(request, headers, runtime);
  }

  /**
   * Description: 校验邮箱是否可以创建账号
   * Summary: 校验邮箱是否可以创建账号
   */
  async checkLoginIdEx(request: CheckLoginIdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckLoginIdResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckLoginIdResponse>(await this.doRequest("1.0", "antcloud.acm.login.id.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckLoginIdResponse({}));
  }

  /**
   * Description: 使用租户ID查询租户信息
   * Summary: 使用租户ID查询租户信息
   */
  async getMasterTenant(request: GetMasterTenantRequest): Promise<GetMasterTenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getMasterTenantEx(request, headers, runtime);
  }

  /**
   * Description: 使用租户ID查询租户信息
   * Summary: 使用租户ID查询租户信息
   */
  async getMasterTenantEx(request: GetMasterTenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetMasterTenantResponse> {
    Util.validateModel(request);
    return $tea.cast<GetMasterTenantResponse>(await this.doRequest("1.0", "antcloud.acm.master.tenant.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetMasterTenantResponse({}));
  }

  /**
   * Description: 检查邮箱是否可以用来注册
   * Summary: 检查邮箱是否可以用来注册
   */
  async checkLoginname(request: CheckLoginnameRequest): Promise<CheckLoginnameResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkLoginnameEx(request, headers, runtime);
  }

  /**
   * Description: 检查邮箱是否可以用来注册
   * Summary: 检查邮箱是否可以用来注册
   */
  async checkLoginnameEx(request: CheckLoginnameRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckLoginnameResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckLoginnameResponse>(await this.doRequest("1.0", "antcloud.acm.loginname.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckLoginnameResponse({}));
  }

  /**
   * Description: 查询租户的标签
   * Summary: 查询租户的标签列表
   */
  async queryTenantTag(request: QueryTenantTagRequest): Promise<QueryTenantTagResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTenantTagEx(request, headers, runtime);
  }

  /**
   * Description: 查询租户的标签
   * Summary: 查询租户的标签列表
   */
  async queryTenantTagEx(request: QueryTenantTagRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTenantTagResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTenantTagResponse>(await this.doRequest("1.0", "antcloud.acm.tenant.tag.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTenantTagResponse({}));
  }

  /**
   * Description: 租户增加业务标签
   * Summary: 租户增加业务标签
   */
  async addTenantBusinesstag(request: AddTenantBusinesstagRequest): Promise<AddTenantBusinesstagResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addTenantBusinesstagEx(request, headers, runtime);
  }

  /**
   * Description: 租户增加业务标签
   * Summary: 租户增加业务标签
   */
  async addTenantBusinesstagEx(request: AddTenantBusinesstagRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddTenantBusinesstagResponse> {
    Util.validateModel(request);
    return $tea.cast<AddTenantBusinesstagResponse>(await this.doRequest("1.0", "antcloud.acm.tenant.businesstag.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddTenantBusinesstagResponse({}));
  }

  /**
   * Description: 删除业务标签
   * Summary: 删除业务标签
   */
  async removeTenantBusinesstag(request: RemoveTenantBusinesstagRequest): Promise<RemoveTenantBusinesstagResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.removeTenantBusinesstagEx(request, headers, runtime);
  }

  /**
   * Description: 删除业务标签
   * Summary: 删除业务标签
   */
  async removeTenantBusinesstagEx(request: RemoveTenantBusinesstagRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RemoveTenantBusinesstagResponse> {
    Util.validateModel(request);
    return $tea.cast<RemoveTenantBusinesstagResponse>(await this.doRequest("1.0", "antcloud.acm.tenant.businesstag.remove", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RemoveTenantBusinesstagResponse({}));
  }

}
