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

// 附件上传表单参数
export class FormParam extends $tea.Model {
  //  
  ossAccessKeyId: string;
  //  
  callback: string;
  //  
  key: string;
  //  
  policy: string;
  //  
  signature: string;
  //  
  successActionStatus: string;
  //  
  appName: string;
  static names(): { [key: string]: string } {
    return {
      ossAccessKeyId: 'oss_access_key_id',
      callback: 'callback',
      key: 'key',
      policy: 'policy',
      signature: 'signature',
      successActionStatus: 'success_action_status',
      appName: 'app_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ossAccessKeyId: 'string',
      callback: 'string',
      key: 'string',
      policy: 'string',
      signature: 'string',
      successActionStatus: 'string',
      appName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 附件上传
export class UploadRequest extends $tea.Model {
  // 文件流/文件地址
  stream: string;
  // 文件名称
  filename: string;
  // 内外工号
  user: string;
  // 附件的关联对象类型
  targetType: string;
  // 附件的关联对象ID
  targetId: number;
  static names(): { [key: string]: string } {
    return {
      stream: 'stream',
      filename: 'filename',
      user: 'user',
      targetType: 'target_type',
      targetId: 'target_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      stream: 'string',
      filename: 'string',
      user: 'string',
      targetType: 'string',
      targetId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 返回结果
export class ResultMap extends $tea.Model {
  // name
  name: string;
  // value
  value: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 文件集合
export class UploadRequestArray extends $tea.Model {
  // 文件数据
  uploadArray: UploadRequest;
  static names(): { [key: string]: string } {
    return {
      uploadArray: 'upload_array',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uploadArray: UploadRequest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 事件详情
export class Emergency extends $tea.Model {
  // 标题
  title: string;
  // 账号
  account: string;
  // 姓名
  name: string;
  // 手机号
  phone: string;
  // 邮箱
  email: string;
  // 钉钉群
  group: string;
  // 当前记录状态
  status: string;
  static names(): { [key: string]: string } {
    return {
      title: 'title',
      account: 'account',
      name: 'name',
      phone: 'phone',
      email: 'email',
      group: 'group',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      title: 'string',
      account: 'string',
      name: 'string',
      phone: 'string',
      email: 'string',
      group: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// aces产品
export class AcesProduct extends $tea.Model {
  //  
  cnName: string;
  //  
  enName?: string;
  //  
  code: string;
  // 产品owner
  owner?: string;
  // 产品创建时间
  createTime: string;
  // 产品修改时间
  updateTime: string;
  //  
  description?: string;
  //  
  l1?: string;
  //  
  l2?: string;
  static names(): { [key: string]: string } {
    return {
      cnName: 'cn_name',
      enName: 'en_name',
      code: 'code',
      owner: 'owner',
      createTime: 'create_time',
      updateTime: 'update_time',
      description: 'description',
      l1: 'l1',
      l2: 'l2',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cnName: 'string',
      enName: 'string',
      code: 'string',
      owner: 'string',
      createTime: 'string',
      updateTime: 'string',
      description: 'string',
      l1: 'string',
      l2: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 返回结果
export class ResultOncall extends $tea.Model {
  // 是否成功
  success: string;
  // 提示信息
  resultMsg: string;
  // 保存的工单主键id（成功才有）
  id?: string;
  static names(): { [key: string]: string } {
    return {
      success: 'success',
      resultMsg: 'result_msg',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      success: 'string',
      resultMsg: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商务中心项目基础结构
export class ProjectBase extends $tea.Model {
  // 项目记录ID
  id?: string;
  // 项目可读编码
  projectCode?: string;
  // 项目名称
  title?: string;
  // 项目来源：蚂蚁、阿里云、合作伙伴 ProjectSource.getKey() ANTCLOUD("ANTCLOUD", "蚂蚁区块链"), ALIYUN("ALIYUN", "阿里云"), PARTNER("PARTNER", "合作伙伴");
  source?: string;
  // 签约方（总包方）。蚂蚁、阿里云 ANTCLOUD("ANTCLOUD", "蚂蚁区块链"), ALIYUN("ALIYUN", "阿里云"),
  contractor?: string;
  // 项目所在阶段
  stage?: string;
  // 项目状态
  status?: string;
  // 预计签约日期
  expectConDate?: string;
  // 预估签约金额
  expectConAmt?: string;
  // 是否需要交付。1需要，0不需要
  needPm?: string;
  // 是否需要提前”进场“。1需要，0不需要。
  needAdEntry?: string;
  // 合作伙伴Id
  partnerId?: string;
  // partnerName
  partnerName?: string;
  // 阿里云Bpid
  aliyunBpid?: string;
  // 客户ID
  customerId?: string;
  // 客户名称
  customerName?: string;
  // BD
  bdWorkNo?: string;
  // PM
  pmWorkNos?: string[];
  //  
  tamList?: string[];
  //  
  bdList?: string[];
  //  
  tmList?: string[];
  //  
  pmList?: string[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      projectCode: 'project_code',
      title: 'title',
      source: 'source',
      contractor: 'contractor',
      stage: 'stage',
      status: 'status',
      expectConDate: 'expect_con_date',
      expectConAmt: 'expect_con_amt',
      needPm: 'need_pm',
      needAdEntry: 'need_ad_entry',
      partnerId: 'partner_id',
      partnerName: 'partner_name',
      aliyunBpid: 'aliyun_bpid',
      customerId: 'customer_id',
      customerName: 'customer_name',
      bdWorkNo: 'bd_work_no',
      pmWorkNos: 'pm_work_nos',
      tamList: 'tam_list',
      bdList: 'bd_list',
      tmList: 'tm_list',
      pmList: 'pm_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      projectCode: 'string',
      title: 'string',
      source: 'string',
      contractor: 'string',
      stage: 'string',
      status: 'string',
      expectConDate: 'string',
      expectConAmt: 'string',
      needPm: 'string',
      needAdEntry: 'string',
      partnerId: 'string',
      partnerName: 'string',
      aliyunBpid: 'string',
      customerId: 'string',
      customerName: 'string',
      bdWorkNo: 'string',
      pmWorkNos: { 'type': 'array', 'itemType': 'string' },
      tamList: { 'type': 'array', 'itemType': 'string' },
      bdList: { 'type': 'array', 'itemType': 'string' },
      tmList: { 'type': 'array', 'itemType': 'string' },
      pmList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 返回结构
export class ResultData extends $tea.Model {
  // data
  data: ResultMap;
  static names(): { [key: string]: string } {
    return {
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      data: ResultMap,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ACES系统接收的项目信息
export class AcesProject extends $tea.Model {
  // 项目id
  projectId: string;
  // 项目名称
  projectName: string;
  // 客户id
  customerId: string;
  // 客户名称
  customerName: string;
  // 产品线
  projectLine?: string;
  // 业务线
  workLine?: string;
  // 业务分类
  bizType?: string;
  // 项目大阶段
  projectBigStage?: string;
  // 转维状态
  opStatus?: string;
  // 交付阶段
  deliver?: string;
  // 是否售后
  afterSale?: boolean;
  //  
  aliyunBpid?: string;
  // 解决方案架构师
  sa: string;
  // 项目经理
  pm: string;
  // 商务经理
  bd: string;
  // 交付经理
  tm: string;
  // 项目状态
  projectStage?: string;
  // 项目交付状态（未启动、已启动等）
  projectStatus?: string;
  // 是否需要交付 1需要 0不需要
  needDeliver: string;
  // 是否需要提前进场 1需要 0不需要
  needAdEntry: string;
  // 是否需要竞标 1需要 0不需要
  needTender: string;
  // 张三
  cre?: string;
  static names(): { [key: string]: string } {
    return {
      projectId: 'project_id',
      projectName: 'project_name',
      customerId: 'customer_id',
      customerName: 'customer_name',
      projectLine: 'project_line',
      workLine: 'work_line',
      bizType: 'biz_type',
      projectBigStage: 'project_big_stage',
      opStatus: 'op_status',
      deliver: 'deliver',
      afterSale: 'after_sale',
      aliyunBpid: 'aliyun_bpid',
      sa: 'sa',
      pm: 'pm',
      bd: 'bd',
      tm: 'tm',
      projectStage: 'project_stage',
      projectStatus: 'project_status',
      needDeliver: 'need_deliver',
      needAdEntry: 'need_ad_entry',
      needTender: 'need_tender',
      cre: 'cre',
    };
  }

  static types(): { [key: string]: any } {
    return {
      projectId: 'string',
      projectName: 'string',
      customerId: 'string',
      customerName: 'string',
      projectLine: 'string',
      workLine: 'string',
      bizType: 'string',
      projectBigStage: 'string',
      opStatus: 'string',
      deliver: 'string',
      afterSale: 'boolean',
      aliyunBpid: 'string',
      sa: 'string',
      pm: 'string',
      bd: 'string',
      tm: 'string',
      projectStage: 'string',
      projectStatus: 'string',
      needDeliver: 'string',
      needAdEntry: 'string',
      needTender: 'string',
      cre: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

//  
export class Upload extends $tea.Model {
  //  
  endpoint: string;
  //  
  fileUniqueId: string;
  //  
  fileUrl: string;
  //  
  formParam: FormParam;
  static names(): { [key: string]: string } {
    return {
      endpoint: 'endpoint',
      fileUniqueId: 'file_unique_id',
      fileUrl: 'file_url',
      formParam: 'form_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      endpoint: 'string',
      fileUniqueId: 'string',
      fileUrl: 'string',
      formParam: FormParam,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 提交表单入参
export class SubmitRequest extends $tea.Model {
  // 测试
  title: string;
  // 问题描述（富文本）
  description: string;
  // 影响
  influence: string;
  // 账号
  account: string;
  // 姓名
  name: string;
  // 手机号
  phone?: string;
  // 邮箱
  email?: string;
  // 钉钉群
  group: string;
  // 校验令牌（接入RDS校验）
  token: string;
  // ip
  ip: string;
  // 验证码
  verifyCode: string;
  // RDS的bizNo
  bizNo: string;
  // 公有化PUBLIC、私有化PRIVATE
  type: string;
  // 上传附件的URL
  fileUrl?: string[];
  static names(): { [key: string]: string } {
    return {
      title: 'title',
      description: 'description',
      influence: 'influence',
      account: 'account',
      name: 'name',
      phone: 'phone',
      email: 'email',
      group: 'group',
      token: 'token',
      ip: 'ip',
      verifyCode: 'verify_code',
      bizNo: 'biz_no',
      type: 'type',
      fileUrl: 'file_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      title: 'string',
      description: 'string',
      influence: 'string',
      account: 'string',
      name: 'string',
      phone: 'string',
      email: 'string',
      group: 'string',
      token: 'string',
      ip: 'string',
      verifyCode: 'string',
      bizNo: 'string',
      type: 'string',
      fileUrl: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 返回值
export class ResultArray extends $tea.Model {
  // 数组
  resultArray: string[];
  static names(): { [key: string]: string } {
    return {
      resultArray: 'result_array',
    };
  }

  static types(): { [key: string]: any } {
    return {
      resultArray: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCustomRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 分页页码
  pageNo: number;
  // 分页长度，最大不超过50
  pageSize: number;
  // 项目id，非必填；可通过项目id查询单个项目
  projectId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      pageNo: 'page_no',
      pageSize: 'page_size',
      projectId: 'project_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      pageNo: 'number',
      pageSize: 'number',
      projectId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCustomResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 调用结果是否成功标识
  success?: boolean;
  // 项目数组
  data?: AcesProject[];
  // 项目总数
  total?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      data: 'data',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      data: { 'type': 'array', 'itemType': AcesProject },
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  
  l5codeList: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      l5codeList: 'l5code_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      l5codeList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  l3codeList?: string[];
  //  
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      l3codeList: 'l3code_list',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      l3codeList: { 'type': 'array', 'itemType': 'string' },
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryProductRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // l3code的数组
  l3codeList: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      l3codeList: 'l3code_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      l3codeList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryProductResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  productList?: AcesProduct[];
  //  
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      productList: 'product_list',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      productList: { 'type': 'array', 'itemType': AcesProduct },
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryProjectPagequeryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 兼容BD待客下单对外暴露项目Id查询
  id?: string;
  // 项目唯一编码
  projectCode?: string;
  // 项目名称，支持模糊
  title?: string;
  // 客户id
  customerId?: string;
  // 客户名称
  customerName?: string;
  // 项目阶段，支持多个过滤
  status?: string[];
  // 项目阶段，支持多个过滤
  stages?: string[];
  // 项目BD工号列表
  bdWorkNos?: string[];
  // 交付项目经理工号列表
  pmWorkNos?: string[];
  // 页面大小
  pageSize?: number;
  // 当前页面
  currentPage?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
      projectCode: 'project_code',
      title: 'title',
      customerId: 'customer_id',
      customerName: 'customer_name',
      status: 'status',
      stages: 'stages',
      bdWorkNos: 'bd_work_nos',
      pmWorkNos: 'pm_work_nos',
      pageSize: 'page_size',
      currentPage: 'current_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'string',
      projectCode: 'string',
      title: 'string',
      customerId: 'string',
      customerName: 'string',
      status: { 'type': 'array', 'itemType': 'string' },
      stages: { 'type': 'array', 'itemType': 'string' },
      bdWorkNos: { 'type': 'array', 'itemType': 'string' },
      pmWorkNos: { 'type': 'array', 'itemType': 'string' },
      pageSize: 'number',
      currentPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryProjectPagequeryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据
  projectList?: ProjectBase[];
  // 是否成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      projectList: 'project_list',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      projectList: { 'type': 'array', 'itemType': ProjectBase },
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryProjectGetprojectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 项目id
  projectId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      projectId: 'project_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      projectId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryProjectGetprojectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  projectList?: ProjectBase;
  //  
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      projectList: 'project_list',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      projectList: ProjectBase,
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveAoneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 产品线
  productLine: string;
  // 产品名称
  productName: string;
  // 问题类型
  issueType: string;
  // 期望日期
  expectedAt?: string;
  // 创建者的工号
  author: string;
  // 解决者/指派者的工号
  assignedTo: string;
  // 标题
  subject: string;
  // 描述
  description: string;
  // 跟踪者的工号
  watcherUsers: string[];
  // 优先级
  priorityId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productLine: 'product_line',
      productName: 'product_name',
      issueType: 'issue_type',
      expectedAt: 'expected_at',
      author: 'author',
      assignedTo: 'assigned_to',
      subject: 'subject',
      description: 'description',
      watcherUsers: 'watcher_users',
      priorityId: 'priority_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productLine: 'string',
      productName: 'string',
      issueType: 'string',
      expectedAt: 'string',
      author: 'string',
      assignedTo: 'string',
      subject: 'string',
      description: 'string',
      watcherUsers: { 'type': 'array', 'itemType': 'string' },
      priorityId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveAoneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回数据
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

export class QueryAoneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 项目id
  id: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      id: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAoneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回值
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

export class ImportScOperationcenterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 提交表单入参
  submitRequest: SubmitRequest;
  // 站位
  flagId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      submitRequest: 'submit_request',
      flagId: 'flag_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      submitRequest: SubmitRequest,
      flagId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportScOperationcenterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  // 保存的工单主键id（成功才有）
  id?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateScOperationcenterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 手机号/邮箱
  receiver: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      receiver: 'receiver',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      receiver: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateScOperationcenterResponse extends $tea.Model {
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

export class QueryScOperationcenterRequest extends $tea.Model {
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

export class QueryScOperationcenterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  // 事件详情
  data?: Emergency;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      data: Emergency,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportScFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  //  
  key: string;
  //  
  fileName: string;
  //  
  businessName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      key: 'key',
      fileName: 'file_name',
      businessName: 'business_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      key: 'string',
      fileName: 'string',
      businessName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportScFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success?: boolean;
  //  
  data?: Upload;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      data: Upload,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryScTestRequest extends $tea.Model {
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

export class QueryScTestResponse extends $tea.Model {
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
          sdk_version: "1.3.5",
          _prod_code: "TAM",
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
   * Description: 查询售后中心项目信息
   * Summary: 查询售后中心项目信息
   */
  async queryCustom(request: QueryCustomRequest): Promise<QueryCustomResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCustomEx(request, headers, runtime);
  }

  /**
   * Description: 查询售后中心项目信息
   * Summary: 查询售后中心项目信息
   */
  async queryCustomEx(request: QueryCustomRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCustomResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCustomResponse>(await this.doRequest("1.0", "antcloud.tam.custom.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCustomResponse({}));
  }

  /**
   * Description:  
   * Summary: 查询双百L3code
   */
  async queryCode(request: QueryCodeRequest): Promise<QueryCodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCodeEx(request, headers, runtime);
  }

  /**
   * Description:  
   * Summary: 查询双百L3code
   */
  async queryCodeEx(request: QueryCodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCodeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCodeResponse>(await this.doRequest("1.0", "antcloud.tam.code.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCodeResponse({}));
  }

  /**
   * Description:  
   * Summary: 根据l3code列表查询产品信息
   */
  async queryProduct(request: QueryProductRequest): Promise<QueryProductResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryProductEx(request, headers, runtime);
  }

  /**
   * Description:  
   * Summary: 根据l3code列表查询产品信息
   */
  async queryProductEx(request: QueryProductRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryProductResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryProductResponse>(await this.doRequest("1.0", "antcloud.tam.product.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryProductResponse({}));
  }

  /**
   * Description: 查询商务中心项目，便于获取增值服务项目
   * Summary: 查询商务中心项目，便于获取增值服务项目
   */
  async queryProjectPagequery(request: QueryProjectPagequeryRequest): Promise<QueryProjectPagequeryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryProjectPagequeryEx(request, headers, runtime);
  }

  /**
   * Description: 查询商务中心项目，便于获取增值服务项目
   * Summary: 查询商务中心项目，便于获取增值服务项目
   */
  async queryProjectPagequeryEx(request: QueryProjectPagequeryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryProjectPagequeryResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryProjectPagequeryResponse>(await this.doRequest("1.0", "antcloud.tam.project.pagequery.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryProjectPagequeryResponse({}));
  }

  /**
   * Description: 查询商务中心项目信息
   * Summary: 查询商务中心项目信息
   */
  async queryProjectGetproject(request: QueryProjectGetprojectRequest): Promise<QueryProjectGetprojectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryProjectGetprojectEx(request, headers, runtime);
  }

  /**
   * Description: 查询商务中心项目信息
   * Summary: 查询商务中心项目信息
   */
  async queryProjectGetprojectEx(request: QueryProjectGetprojectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryProjectGetprojectResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryProjectGetprojectResponse>(await this.doRequest("1.0", "antcloud.tam.project.getproject.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryProjectGetprojectResponse({}));
  }

  /**
   * Description: 提交到aone
   * Summary: 提交到aone
   */
  async saveAone(request: SaveAoneRequest): Promise<SaveAoneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveAoneEx(request, headers, runtime);
  }

  /**
   * Description: 提交到aone
   * Summary: 提交到aone
   */
  async saveAoneEx(request: SaveAoneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveAoneResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveAoneResponse>(await this.doRequest("1.0", "antcloud.tam.aone.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveAoneResponse({}));
  }

  /**
   * Description: 查询aone详情
   * Summary: 查询aone详情
   */
  async queryAone(request: QueryAoneRequest): Promise<QueryAoneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAoneEx(request, headers, runtime);
  }

  /**
   * Description: 查询aone详情
   * Summary: 查询aone详情
   */
  async queryAoneEx(request: QueryAoneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAoneResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAoneResponse>(await this.doRequest("1.0", "antcloud.tam.aone.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAoneResponse({}));
  }

  /**
   * Description: 智能外呼需求，前端提交表单后调用此接口将数据落入售后中心
   * Summary: 前端提交需求表单
   */
  async importScOperationcenter(request: ImportScOperationcenterRequest): Promise<ImportScOperationcenterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importScOperationcenterEx(request, headers, runtime);
  }

  /**
   * Description: 智能外呼需求，前端提交表单后调用此接口将数据落入售后中心
   * Summary: 前端提交需求表单
   */
  async importScOperationcenterEx(request: ImportScOperationcenterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportScOperationcenterResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportScOperationcenterResponse>(await this.doRequest("1.0", "antcloud.tam.sc.operationcenter.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportScOperationcenterResponse({}));
  }

  /**
   * Description: 发送验证码
   * Summary: 发送验证码
   */
  async operateScOperationcenter(request: OperateScOperationcenterRequest): Promise<OperateScOperationcenterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateScOperationcenterEx(request, headers, runtime);
  }

  /**
   * Description: 发送验证码
   * Summary: 发送验证码
   */
  async operateScOperationcenterEx(request: OperateScOperationcenterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateScOperationcenterResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateScOperationcenterResponse>(await this.doRequest("1.0", "antcloud.tam.sc.operationcenter.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateScOperationcenterResponse({}));
  }

  /**
   * Description: 查询跟进情况
   * Summary: 查询跟进情况
   */
  async queryScOperationcenter(request: QueryScOperationcenterRequest): Promise<QueryScOperationcenterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryScOperationcenterEx(request, headers, runtime);
  }

  /**
   * Description: 查询跟进情况
   * Summary: 查询跟进情况
   */
  async queryScOperationcenterEx(request: QueryScOperationcenterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryScOperationcenterResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryScOperationcenterResponse>(await this.doRequest("1.0", "antcloud.tam.sc.operationcenter.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryScOperationcenterResponse({}));
  }

  /**
   * Description: 附件上传
   * Summary: 附件上传
   */
  async importScFile(request: ImportScFileRequest): Promise<ImportScFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importScFileEx(request, headers, runtime);
  }

  /**
   * Description: 附件上传
   * Summary: 附件上传
   */
  async importScFileEx(request: ImportScFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportScFileResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportScFileResponse>(await this.doRequest("1.0", "antcloud.tam.sc.file.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportScFileResponse({}));
  }

  /**
   * Description:  
   * Summary: 测试
   */
  async queryScTest(request: QueryScTestRequest): Promise<QueryScTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryScTestEx(request, headers, runtime);
  }

  /**
   * Description:  
   * Summary: 测试
   */
  async queryScTestEx(request: QueryScTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryScTestResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryScTestResponse>(await this.doRequest("1.0", "antcloud.tam.sc.test.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryScTestResponse({}));
  }

}
