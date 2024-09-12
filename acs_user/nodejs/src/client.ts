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

// 功能点信息
export class AuthAction extends $tea.Model {
  // 权限点编码
  actionCode: string;
  // 权限点名称
  actionName: string;
  // 归属产品码
  productCode: string;
  // 权限点级别
  actionLevel: number;
  // 是否展示
  isShow: boolean;
  // 权限点描述信息
  actionDescription?: string;
  // 父权限点编码
  parentActionCode?: string;
  static names(): { [key: string]: string } {
    return {
      actionCode: 'action_code',
      actionName: 'action_name',
      productCode: 'product_code',
      actionLevel: 'action_level',
      isShow: 'is_show',
      actionDescription: 'action_description',
      parentActionCode: 'parent_action_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      actionCode: 'string',
      actionName: 'string',
      productCode: 'string',
      actionLevel: 'number',
      isShow: 'boolean',
      actionDescription: 'string',
      parentActionCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AntChain Stack 用户角色
export class ACSUserRole extends $tea.Model {
  // 角色归属产品
  productCode: string;
  // 角色编码
  productRole: string;
  // 角色类型，SYSTEM：系统角色；USER_DEFINE：用户自定义角色
  roleType: string;
  // 角色名称
  roleName?: string;
  // 角色描述信息
  roleDescription?: string;
  // 权限点信息
  authActions?: AuthAction[];
  // 角色code
  roleCode?: string;
  // 登陆用户名
  userid?: string;
  static names(): { [key: string]: string } {
    return {
      productCode: 'product_code',
      productRole: 'product_role',
      roleType: 'role_type',
      roleName: 'role_name',
      roleDescription: 'role_description',
      authActions: 'auth_actions',
      roleCode: 'role_code',
      userid: 'userid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      productCode: 'string',
      productRole: 'string',
      roleType: 'string',
      roleName: 'string',
      roleDescription: 'string',
      authActions: { 'type': 'array', 'itemType': AuthAction },
      roleCode: 'string',
      userid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AntChain Stack 用户信息
export class ACSUserInfo extends $tea.Model {
  // 用户ID
  userId?: string;
  // 用户名称
  userName?: string;
  // 用户类型，OPERATOR：登录用户；SERVICE：服务用户
  userType?: string;
  // 是否已失效
  expired?: boolean;
  // 是否被禁用
  disabled?: boolean;
  // 邮箱
  email?: string;
  // 手机号码
  phone?: string;
  // 失效时间
  expiredTime?: string;
  // 创建时间
  createTime?: string;
  // 更新时间
  updateTime?: string;
  // 用户角色
  userRoles?: ACSUserRole[];
  // 账户密码
  password?: string;
  static names(): { [key: string]: string } {
    return {
      userId: 'user_id',
      userName: 'user_name',
      userType: 'user_type',
      expired: 'expired',
      disabled: 'disabled',
      email: 'email',
      phone: 'phone',
      expiredTime: 'expired_time',
      createTime: 'create_time',
      updateTime: 'update_time',
      userRoles: 'user_roles',
      password: 'password',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userId: 'string',
      userName: 'string',
      userType: 'string',
      expired: 'boolean',
      disabled: 'boolean',
      email: 'string',
      phone: 'string',
      expiredTime: 'string',
      createTime: 'string',
      updateTime: 'string',
      userRoles: { 'type': 'array', 'itemType': ACSUserRole },
      password: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 角色信息
export class ACSRole extends $tea.Model {
  // 角色归属产品
  productCode: string;
  // 角色编码
  productRole: string;
  // 角色编码
  roleCode: string;
  // 角色名称
  roleName: string;
  // 角色描述信息
  roleDescription?: string;
  // 角色类型，SYSTEM：系统角色；USER_DEFINE：用户自定义角色
  roleType?: string;
  static names(): { [key: string]: string } {
    return {
      productCode: 'product_code',
      productRole: 'product_role',
      roleCode: 'role_code',
      roleName: 'role_name',
      roleDescription: 'role_description',
      roleType: 'role_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      productCode: 'string',
      productRole: 'string',
      roleCode: 'string',
      roleName: 'string',
      roleDescription: 'string',
      roleType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAccessorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 网关调用的服务access key
  userAccessKey: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userAccessKey: 'user_access_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userAccessKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAccessorResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户ID
  userId?: string;
  // 用户名称
  userName?: string;
  // SERVICE:服务账号
  // MASTER:登录账号
  userType?: string;
  // 服务账号
  accessKey?: string;
  // 服务账号对应的密钥
  accessSecret?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      userId: 'user_id',
      userName: 'user_name',
      userType: 'user_type',
      accessKey: 'access_key',
      accessSecret: 'access_secret',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      userId: 'string',
      userName: 'string',
      userType: 'string',
      accessKey: 'string',
      accessSecret: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListUserwithroleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 产品CODE
  prodCode?: string;
  // 产品内的角色信息
  productRole?: string;
  // 分页开始序号，默认第一个开始
  currentPage?: number;
  // 分页大小，未传默认是100
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      prodCode: 'prod_code',
      productRole: 'product_role',
      currentPage: 'current_page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      prodCode: 'string',
      productRole: 'string',
      currentPage: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListUserwithroleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前页码
  currentPage?: number;
  // 页面大小
  pageSize?: number;
  // 总页数
  totalPage?: number;
  // 用户信息列表
  userInfos?: ACSUserInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalPage: 'total_page',
      userInfos: 'user_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      currentPage: 'number',
      pageSize: 'number',
      totalPage: 'number',
      userInfos: { 'type': 'array', 'itemType': ACSUserInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifySessionTokenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户登录态信息
  token: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      token: 'token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      token: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifySessionTokenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户ID
  userId?: string;
  // 用户名称
  userName?: string;
  // 私有化中的租户ID（0表示适用所有租户）
  tenantId?: number;
  // 用户类型，OPERATOR：登录账号；SERVICE：服务账号
  userType?: string;
  // 是否已失效
  expired?: boolean;
  // 是否已冻结
  disabled?: boolean;
  // 邮箱地址
  email?: string;
  // 电话号码
  phone?: string;
  // 失效时间
  expiredTime?: string;
  // 是否需要修改密码
  changeRequired?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      userId: 'user_id',
      userName: 'user_name',
      tenantId: 'tenant_id',
      userType: 'user_type',
      expired: 'expired',
      disabled: 'disabled',
      email: 'email',
      phone: 'phone',
      expiredTime: 'expired_time',
      changeRequired: 'change_required',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      userId: 'string',
      userName: 'string',
      tenantId: 'number',
      userType: 'string',
      expired: 'boolean',
      disabled: 'boolean',
      email: 'string',
      phone: 'string',
      expiredTime: 'string',
      changeRequired: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class JudgeAuthorityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户id，和参数token二者必须有一个不能为空
  userId?: string;
  // 用户登录token，和user_id二者必须有一个不能为空，当token不为空时，会先判断token 是否有效，然后进行权限判断
  token?: string;
  // 产品编码
  productCode: string;
  // 对应的权限码或者是角色编码
  actionCode: string;
  // 鉴权类型，ROLE：角色鉴权；ACTION：权限点鉴权
  actionType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      token: 'token',
      productCode: 'product_code',
      actionCode: 'action_code',
      actionType: 'action_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      token: 'string',
      productCode: 'string',
      actionCode: 'string',
      actionType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class JudgeAuthorityResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // true：有权限；false：无权限
  judgeResult?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      judgeResult: 'judge_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      judgeResult: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListPolicyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户id，和token二者其中一个必须输入
  userId?: string;
  // 用户登录token，和user_id二者其中一个必须，如果token不为空，则会先进行登录态的检查，没有查到，则返回失败，否则返回用户的权限信息
  token?: string;
  // 产品编码，不传入，返回用户拥有的所有权限，传入则返回用户当前产品的权限信息
  productCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      token: 'token',
      productCode: 'product_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      token: 'string',
      productCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListPolicyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户的权限角色信息
  authRoles?: ACSUserRole[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      authRoles: 'auth_roles',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      authRoles: { 'type': 'array', 'itemType': ACSUserRole },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户名称，模糊查询
  userName?: string;
  // 产品编码，表示查询拥有该产品权限的用户列表，为空查询所有有效用户
  productCode?: string;
  // 分页查询页数，默认第一页
  pageNum?: number;
  // 分页大小，默认20
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userName: 'user_name',
      productCode: 'product_code',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userName: 'string',
      productCode: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户列表
  userInfos?: ACSUserInfo[];
  // 传入的页码，没有传入，则取默认值1
  pageNum?: number;
  // 传入的页大小，如果没有传入，则取默认值20
  pageSize?: number;
  // 查询结果的总条目数量
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      userInfos: 'user_infos',
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
      userInfos: { 'type': 'array', 'itemType': ACSUserInfo },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户编码
  tenantCode: string;
  // 租户名称
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantCode: 'tenant_code',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantCode: 'string',
      tenantName: 'string',
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
  // 租户ID
  tenantId?: number;
  // 租户编码
  tenantCode?: string;
  // 租户名称
  tenantName?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tenantId: 'tenant_id',
      tenantCode: 'tenant_code',
      tenantName: 'tenant_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tenantId: 'number',
      tenantCode: 'string',
      tenantName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAuthActionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 产品CODE
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

export class ListAuthActionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 权限点列表
  actionList?: AuthAction[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      actionList: 'action_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      actionList: { 'type': 'array', 'itemType': AuthAction },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRoleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 分页查询页数，默认第一页
  pageNum?: number;
  // 分页大小，默认500
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRoleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分页查询，当前页
  currentPage?: number;
  // 每页包含条数
  pageSize?: number;
  // 共10页
  totalPage?: number;
  // 角色列表
  roles?: ACSRole[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      currentPage: 'current_page',
      pageSize: 'page_size',
      totalPage: 'total_page',
      roles: 'roles',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      currentPage: 'number',
      pageSize: 'number',
      totalPage: 'number',
      roles: { 'type': 'array', 'itemType': ACSRole },
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
  // 用户信息
  user: ACSUserInfo;
  // 用户登陆名
  userid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      user: 'user',
      userid: 'userid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      user: ACSUserInfo,
      userid: 'string',
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
  // 用户信息
  user?: ACSUserInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      user: 'user',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      user: ACSUserInfo,
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
  // 用户信息
  user: ACSUserInfo;
  // 用户登陆名
  userid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      user: 'user',
      userid: 'userid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      user: ACSUserInfo,
      userid: 'string',
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
  // 用户信息
  user?: ACSUserInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      user: 'user',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      user: ACSUserInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户登陆账号
  userid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userid: 'userid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteUserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 删除的结果
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
          sdk_version: "1.3.3",
          _prod_code: "ACS_USER",
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
   * Description: acsgw来根据ak查询accessor的信息
   * Summary: 根据ak查询accessor信息
   */
  async queryAccessor(request: QueryAccessorRequest): Promise<QueryAccessorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAccessorEx(request, headers, runtime);
  }

  /**
   * Description: acsgw来根据ak查询accessor的信息
   * Summary: 根据ak查询accessor信息
   */
  async queryAccessorEx(request: QueryAccessorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAccessorResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAccessorResponse>(await this.doRequest("1.0", "acs.user.accessor.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAccessorResponse({}));
  }

  /**
   * Description: 查询所有的用户与权限关系列表
   * Summary: 获取用户角色信息列表
   */
  async listUserwithrole(request: ListUserwithroleRequest): Promise<ListUserwithroleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listUserwithroleEx(request, headers, runtime);
  }

  /**
   * Description: 查询所有的用户与权限关系列表
   * Summary: 获取用户角色信息列表
   */
  async listUserwithroleEx(request: ListUserwithroleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListUserwithroleResponse> {
    Util.validateModel(request);
    return $tea.cast<ListUserwithroleResponse>(await this.doRequest("1.0", "acs.user.userwithrole.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListUserwithroleResponse({}));
  }

  /**
   * Description: 私有化场景用户登录态验证
   * Summary: 私有化场景用户登录态验证
   */
  async verifySessionToken(request: VerifySessionTokenRequest): Promise<VerifySessionTokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifySessionTokenEx(request, headers, runtime);
  }

  /**
   * Description: 私有化场景用户登录态验证
   * Summary: 私有化场景用户登录态验证
   */
  async verifySessionTokenEx(request: VerifySessionTokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifySessionTokenResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifySessionTokenResponse>(await this.doRequest("1.0", "acs.user.session.token.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifySessionTokenResponse({}));
  }

  /**
   * Description: 用户权限校验
   * Summary: 用户权限校验
   */
  async judgeAuthority(request: JudgeAuthorityRequest): Promise<JudgeAuthorityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.judgeAuthorityEx(request, headers, runtime);
  }

  /**
   * Description: 用户权限校验
   * Summary: 用户权限校验
   */
  async judgeAuthorityEx(request: JudgeAuthorityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<JudgeAuthorityResponse> {
    Util.validateModel(request);
    return $tea.cast<JudgeAuthorityResponse>(await this.doRequest("1.0", "acs.user.authority.judge", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new JudgeAuthorityResponse({}));
  }

  /**
   * Description: 查询某个用户的权限
   * Summary: 用户权限查询
   */
  async listPolicy(request: ListPolicyRequest): Promise<ListPolicyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listPolicyEx(request, headers, runtime);
  }

  /**
   * Description: 查询某个用户的权限
   * Summary: 用户权限查询
   */
  async listPolicyEx(request: ListPolicyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListPolicyResponse> {
    Util.validateModel(request);
    return $tea.cast<ListPolicyResponse>(await this.doRequest("1.0", "acs.user.policy.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListPolicyResponse({}));
  }

  /**
   * Description: 用户信息查询
   * Summary: 用户信息查询
   */
  async queryUser(request: QueryUserRequest): Promise<QueryUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUserEx(request, headers, runtime);
  }

  /**
   * Description: 用户信息查询
   * Summary: 用户信息查询
   */
  async queryUserEx(request: QueryUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUserResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUserResponse>(await this.doRequest("1.0", "acs.user.user.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUserResponse({}));
  }

  /**
   * Description: 租户创建
   * Summary: 租户创建
   */
  async createTenant(request: CreateTenantRequest): Promise<CreateTenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createTenantEx(request, headers, runtime);
  }

  /**
   * Description: 租户创建
   * Summary: 租户创建
   */
  async createTenantEx(request: CreateTenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateTenantResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTenantResponse>(await this.doRequest("1.0", "acs.user.tenant.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateTenantResponse({}));
  }

  /**
   * Description: 获取归属某个产品的有效权限点列表
   * Summary: 获取归属某个产品的有效权限点列表
   */
  async listAuthAction(request: ListAuthActionRequest): Promise<ListAuthActionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAuthActionEx(request, headers, runtime);
  }

  /**
   * Description: 获取归属某个产品的有效权限点列表
   * Summary: 获取归属某个产品的有效权限点列表
   */
  async listAuthActionEx(request: ListAuthActionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAuthActionResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAuthActionResponse>(await this.doRequest("1.0", "acs.user.auth.action.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAuthActionResponse({}));
  }

  /**
   * Description: 查询角色列表
   * Summary: 角色列表
   */
  async listRole(request: ListRoleRequest): Promise<ListRoleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listRoleEx(request, headers, runtime);
  }

  /**
   * Description: 查询角色列表
   * Summary: 角色列表
   */
  async listRoleEx(request: ListRoleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListRoleResponse> {
    Util.validateModel(request);
    return $tea.cast<ListRoleResponse>(await this.doRequest("1.0", "acs.user.role.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListRoleResponse({}));
  }

  /**
   * Description: 添加用户
   * Summary: 添加用户
   */
  async createUser(request: CreateUserRequest): Promise<CreateUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createUserEx(request, headers, runtime);
  }

  /**
   * Description: 添加用户
   * Summary: 添加用户
   */
  async createUserEx(request: CreateUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateUserResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateUserResponse>(await this.doRequest("1.0", "acs.user.user.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateUserResponse({}));
  }

  /**
   * Description: 更新用户角色
   * Summary: 更新用户角色
   */
  async updateUser(request: UpdateUserRequest): Promise<UpdateUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateUserEx(request, headers, runtime);
  }

  /**
   * Description: 更新用户角色
   * Summary: 更新用户角色
   */
  async updateUserEx(request: UpdateUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateUserResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateUserResponse>(await this.doRequest("1.0", "acs.user.user.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateUserResponse({}));
  }

  /**
   * Description: 删除用户
   * Summary: 删除用户
   */
  async deleteUser(request: DeleteUserRequest): Promise<DeleteUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteUserEx(request, headers, runtime);
  }

  /**
   * Description: 删除用户
   * Summary: 删除用户
   */
  async deleteUserEx(request: DeleteUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteUserResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteUserResponse>(await this.doRequest("1.0", "acs.user.user.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteUserResponse({}));
  }

}
