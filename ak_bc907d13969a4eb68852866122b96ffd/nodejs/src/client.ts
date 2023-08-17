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

// MapObject
export class MapObject extends $tea.Model {
  // key
  key?: string;
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

// TaskTemplateOptionConfig
export class TaskTemplateOptionConfig extends $tea.Model {
  // defaultresult
  defaultresult: string;
  // rule
  rule?: string;
  // 预制选项，针对填空题的输入题目
  preoptions?: string[];
  static names(): { [key: string]: string } {
    return {
      defaultresult: 'defaultresult',
      rule: 'rule',
      preoptions: 'preoptions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      defaultresult: 'string',
      rule: 'string',
      preoptions: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Groups
export class Groups extends $tea.Model {
  // groupid
  groupid?: string;
  // groupname
  groupname?: string;
  static names(): { [key: string]: string } {
    return {
      groupid: 'groupid',
      groupname: 'groupname',
    };
  }

  static types(): { [key: string]: any } {
    return {
      groupid: 'string',
      groupname: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 模板选项配置映射
export class TemplateOptionMap extends $tea.Model {
  // Map<String, TaskTemplateOptionConfig> templateOptionMap中的key
  key?: string;
  // TaskTemplateOptionConfig
  value?: TaskTemplateOptionConfig;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: TaskTemplateOptionConfig,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Exif
export class Exif extends $tea.Model {
  // exif
  exif: MapObject[];
  static names(): { [key: string]: string } {
    return {
      exif: 'exif',
    };
  }

  static types(): { [key: string]: any } {
    return {
      exif: { 'type': 'array', 'itemType': MapObject },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 添加用户至租户
export class User extends $tea.Model {
  // 接入标注系统的用户ID
  accountno?: string;
  // 用户名称
  username?: string;
  // 用户来源
  accountsource?: string;
  // UserId
  userid?: string;
  static names(): { [key: string]: string } {
    return {
      accountno: 'accountno',
      username: 'username',
      accountsource: 'accountsource',
      userid: 'userid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accountno: 'string',
      username: 'string',
      accountsource: 'string',
      userid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 任务管理员列表
export class Admins extends $tea.Model {
  // 管理员列表
  users?: User[];
  // 组ID
  groups?: Groups[];
  static names(): { [key: string]: string } {
    return {
      users: 'users',
      groups: 'groups',
    };
  }

  static types(): { [key: string]: any } {
    return {
      users: { 'type': 'array', 'itemType': User },
      groups: { 'type': 'array', 'itemType': Groups },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// DownloadMarkResult
export class DownloadMarkResult extends $tea.Model {
  // TaskId
  taskid?: string;
  // RunInstId
  runinstid?: string;
  // msgid
  msgid?: string;
  static names(): { [key: string]: string } {
    return {
      taskid: 'taskid',
      runinstid: 'runinstid',
      msgid: 'msgid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      taskid: 'string',
      runinstid: 'string',
      msgid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 标注工作流，私有化项目只用到 标注MARK、质检CHECK 这两个节点
export class ITagTaskWorkflowConfig extends $tea.Model {
  // 标注阶段
  nodename?: string;
  // 标注人员列表
  users?: User[];
  // 分组
  groups?: Groups[];
  // 扩展参数，例如质检抽样的比例，0~100 %
  exif?: Exif;
  static names(): { [key: string]: string } {
    return {
      nodename: 'nodename',
      users: 'users',
      groups: 'groups',
      exif: 'exif',
    };
  }

  static types(): { [key: string]: any } {
    return {
      nodename: 'string',
      users: { 'type': 'array', 'itemType': User },
      groups: { 'type': 'array', 'itemType': Groups },
      exif: Exif,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 模板的可定制部分
export class TaskTemplateConfig extends $tea.Model {
  // templateoptionmap
  templateoptionmap: TemplateOptionMap;
  static names(): { [key: string]: string } {
    return {
      templateoptionmap: 'templateoptionmap',
    };
  }

  static types(): { [key: string]: any } {
    return {
      templateoptionmap: TemplateOptionMap,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 任务使用的数据集
export class DatasetProxyRelations extends $tea.Model {
  // 来源
  source?: string;
  // iTAG数据集的ID
  datasetid?: string;
  // 标注类型
  datasettype?: string;
  // SourceBizId
  sourcebizid?: string;
  static names(): { [key: string]: string } {
    return {
      source: 'source',
      datasetid: 'datasetid',
      datasettype: 'datasettype',
      sourcebizid: 'sourcebizid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      source: 'string',
      datasetid: 'string',
      datasettype: 'string',
      sourcebizid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ProcessResult
export class ProcessResult extends $tea.Model {
  // Node
  node?: string;
  // totalitem
  totalitem?: number;
  // finisheditem
  finisheditem?: number;
  // TotalSubTask
  totalsubtask?: number;
  // FinishedSubTask
  finishedsubtask?: number;
  static names(): { [key: string]: string } {
    return {
      node: 'node',
      totalitem: 'totalitem',
      finisheditem: 'finisheditem',
      totalsubtask: 'totalsubtask',
      finishedsubtask: 'finishedsubtask',
    };
  }

  static types(): { [key: string]: any } {
    return {
      node: 'string',
      totalitem: 'number',
      finisheditem: 'number',
      totalsubtask: 'number',
      finishedsubtask: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 轮询导出进度中的RunRet
export class RunRet extends $tea.Model {
  // taskid
  taskid?: string;
  // subtaskdistdt
  subtaskdistdt?: string;
  // requestid
  requestid?: string;
  // taskname
  taskname?: string;
  // msgsenddt
  msgsenddt?: string;
  // msgid
  msgid?: string;
  // resultlink
  resultlink?: string;
  static names(): { [key: string]: string } {
    return {
      taskid: 'taskid',
      subtaskdistdt: 'subtaskdistdt',
      requestid: 'requestid',
      taskname: 'taskname',
      msgsenddt: 'msgsenddt',
      msgid: 'msgid',
      resultlink: 'resultlink',
    };
  }

  static types(): { [key: string]: any } {
    return {
      taskid: 'string',
      subtaskdistdt: 'string',
      requestid: 'string',
      taskname: 'string',
      msgsenddt: 'string',
      msgid: 'string',
      resultlink: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 防止客户端因bug而瞬间重复创建多个相同的任务
export class BizInfo extends $tea.Model {
  // 业务码
  bizcode?: string;
  // 可使用时间戳来防止重复
  bizno?: number;
  static names(): { [key: string]: string } {
    return {
      bizcode: 'bizcode',
      bizno: 'bizno',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizcode: 'string',
      bizno: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AssignConfig
export class AssignConfig extends $tea.Model {
  // AVG_SIZE
  assigntype: string;
  // AssignSubTaskCount
  assignsubtaskcount?: number;
  static names(): { [key: string]: string } {
    return {
      assigntype: 'assigntype',
      assignsubtaskcount: 'assignsubtaskcount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      assigntype: 'string',
      assignsubtaskcount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthItagAntitagAcmRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 第三方平台用户ID
  accountno: string;
  // 用户来源
  accountsource: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountno: 'accountno',
      accountsource: 'accountsource',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountno: 'string',
      accountsource: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthItagAntitagAcmResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 消息ID
  reqmsgid?: string;
  // 结果码
  resultcode?: string;
  // 结果消息
  resultmsg?: string;
  // 授权码
  accesstoken?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      reqmsgid: 'reqmsgid',
      resultcode: 'resultcode',
      resultmsg: 'resultmsg',
      accesstoken: 'accesstoken',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      reqmsgid: 'string',
      resultcode: 'string',
      resultmsg: 'string',
      accesstoken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateItagAntitagTaskRequestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // taskname
  taskname?: string;
  // templateid
  templateid?: string;
  // projectid
  projectid?: string;
  // AssignConfig
  assignconfig?: AssignConfig;
  // TaskWorkFlow
  taskworkflow?: ITagTaskWorkflowConfig;
  // admins
  admins?: Admins[];
  // datasetproxyrelations
  datasetproxyrelations?: DatasetProxyRelations[];
  // bizinfo
  bizinfo?: BizInfo;
  // tasktemplateconfig
  tasktemplateconfig?: TaskTemplateConfig;
  // Exif
  exif?: Exif;
  // tntinstid
  tntinstid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskname: 'taskname',
      templateid: 'templateid',
      projectid: 'projectid',
      assignconfig: 'assignconfig',
      taskworkflow: 'taskworkflow',
      admins: 'admins',
      datasetproxyrelations: 'datasetproxyrelations',
      bizinfo: 'bizinfo',
      tasktemplateconfig: 'tasktemplateconfig',
      exif: 'exif',
      tntinstid: 'tntinstid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskname: 'string',
      templateid: 'string',
      projectid: 'string',
      assignconfig: AssignConfig,
      taskworkflow: ITagTaskWorkflowConfig,
      admins: { 'type': 'array', 'itemType': Admins },
      datasetproxyrelations: { 'type': 'array', 'itemType': DatasetProxyRelations },
      bizinfo: BizInfo,
      tasktemplateconfig: TaskTemplateConfig,
      exif: Exif,
      tntinstid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateItagAntitagTaskRequestResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // taskId
  taskid?: string;
  // flowrunid
  flowrunid?: string;
  // msgid
  msgid?: string;
  // slavemsgid
  slavemsgid?: string;
  // reftaskid
  reftaskid?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskid: 'taskid',
      flowrunid: 'flowrunid',
      msgid: 'msgid',
      slavemsgid: 'slavemsgid',
      reftaskid: 'reftaskid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskid: 'string',
      flowrunid: 'string',
      msgid: 'string',
      slavemsgid: 'string',
      reftaskid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportItagAntitagTaskDownloadRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // iTAG租户id
  tntinstid?: string;
  // TaskId
  taskid?: string;
  // Encode
  encode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tntinstid: 'tntinstid',
      taskid: 'taskid',
      encode: 'encode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tntinstid: 'string',
      taskid: 'string',
      encode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportItagAntitagTaskDownloadResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // RequestId
  requestid?: string;
  // Succ
  succ?: string;
  // Code
  code?: string;
  // Msg
  msg?: string;
  // errinfo
  errinfo?: string;
  // result
  result?: DownloadMarkResult;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestid: 'requestid',
      succ: 'succ',
      code: 'code',
      msg: 'msg',
      errinfo: 'errinfo',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestid: 'string',
      succ: 'string',
      code: 'string',
      msg: 'string',
      errinfo: 'string',
      result: DownloadMarkResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryItagAntitagTaskDownloadRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // iTAG租户ID
  tntinstid?: string;
  // runinstid
  runinstid?: string;
  // 任务ID
  taskid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tntinstid: 'tntinstid',
      runinstid: 'runinstid',
      taskid: 'taskid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tntinstid: 'string',
      runinstid: 'string',
      taskid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryItagAntitagTaskDownloadResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // requestid
  requestid?: string;
  // code
  code?: string;
  // msg
  msg?: string;
  // succ
  succ?: string;
  // errinfo
  errinfo?: string;
  // runret
  runret?: RunRet;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestid: 'requestid',
      code: 'code',
      msg: 'msg',
      succ: 'succ',
      errinfo: 'errinfo',
      runret: 'runret',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestid: 'string',
      code: 'string',
      msg: 'string',
      succ: 'string',
      errinfo: 'string',
      runret: RunRet,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryItagAntitagTaskProcessRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // TntInstId
  tntinstid?: string;
  // taskid
  taskid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tntinstid: 'tntinstid',
      taskid: 'taskid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tntinstid: 'string',
      taskid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryItagAntitagTaskProcessResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // requestid
  requestid?: string;
  // Code
  code?: string;
  // Msg
  msg?: string;
  // succ
  succ?: string;
  // ProcessResult
  result?: ProcessResult;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestid: 'requestid',
      code: 'code',
      msg: 'msg',
      succ: 'succ',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestid: 'string',
      code: 'string',
      msg: 'string',
      succ: 'string',
      result: ProcessResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterItagAntitagUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 名称
  name: string;
  // 第三方系统用户账号ID
  accountno: string;
  // 用户来源
  accountsource: string;
  // 邮箱
  email?: string;
  // 电话
  phone?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      accountno: 'accountno',
      accountsource: 'accountsource',
      email: 'email',
      phone: 'phone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      accountno: 'string',
      accountsource: 'string',
      email: 'string',
      phone: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterItagAntitagUserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求ID
  requestid?: string;
  // 结果码
  code?: number;
  // 错误信息
  errmsg?: string;
  // 结果消息
  msg?: string;
  // 标注平台userid
  result?: string;
  // 结果
  succ?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestid: 'requestid',
      code: 'code',
      errmsg: 'errmsg',
      msg: 'msg',
      result: 'result',
      succ: 'succ',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestid: 'string',
      code: 'number',
      errmsg: 'string',
      msg: 'string',
      result: 'string',
      succ: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddItagAntitagUserTntRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 标注平台的租户ID
  tntinstid: string;
  // 第三方账号
  accountno: string;
  // 用户来源
  accountsource: string;
  // 角色，枚举值：ADMIN|SUPER_ADMIN|ADMINISTRATOR|LEADER|OPERATOR, 默认OPERATOR",
  role?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tntinstid: 'tntinstid',
      accountno: 'accountno',
      accountsource: 'accountsource',
      role: 'role',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tntinstid: 'string',
      accountno: 'string',
      accountsource: 'string',
      role: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddItagAntitagUserTntResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // TntInstId
  tntinstid?: string;
  // 角色，枚举值：ADMIN|SUPER_ADMIN|ADMINISTRATOR|LEADER|OPERATOR, 默认OPERATOR",
  role?: string;
  // 用户信息
  result?: User;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tntinstid: 'tntinstid',
      role: 'role',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tntinstid: 'string',
      role: 'string',
      result: User,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateItagAntitagTaskJsonRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 创建任务参数，格式为JSON
  params: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      params: 'params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      params: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateItagAntitagTaskJsonResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果码
  code?: string;
  // 消息体
  msg?: string;
  // 请求ID
  requestid?: string;
  // 成功标识
  succ?: string;
  // 任务ID
  taskid?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      msg: 'msg',
      requestid: 'requestid',
      succ: 'succ',
      taskid: 'taskid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      msg: 'string',
      requestid: 'string',
      succ: 'string',
      taskid: 'string',
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
          sdk_version: "2.0.0",
          _prod_code: "ak_bc907d13969a4eb68852866122b96ffd",
          _prod_channel: "saas",
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
   * Description: 通过标注平台ID获取Token
   * Summary: 获取Token
   */
  async authItagAntitagAcm(request: AuthItagAntitagAcmRequest): Promise<AuthItagAntitagAcmResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authItagAntitagAcmEx(request, headers, runtime);
  }

  /**
   * Description: 通过标注平台ID获取Token
   * Summary: 获取Token
   */
  async authItagAntitagAcmEx(request: AuthItagAntitagAcmRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthItagAntitagAcmResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthItagAntitagAcmResponse>(await this.doRequest("1.0", "itag.antitag.acm.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthItagAntitagAcmResponse({}));
  }

  /**
   * Description: 创建标注任务
   * Summary: 创建标注任务
   */
  async createItagAntitagTaskRequest(request: CreateItagAntitagTaskRequestRequest): Promise<CreateItagAntitagTaskRequestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createItagAntitagTaskRequestEx(request, headers, runtime);
  }

  /**
   * Description: 创建标注任务
   * Summary: 创建标注任务
   */
  async createItagAntitagTaskRequestEx(request: CreateItagAntitagTaskRequestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateItagAntitagTaskRequestResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateItagAntitagTaskRequestResponse>(await this.doRequest("1.0", "itag.antitag.task.request.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateItagAntitagTaskRequestResponse({}));
  }

  /**
   * Description: 触发数据导出
   * Summary: 触发数据导出
   */
  async exportItagAntitagTaskDownload(request: ExportItagAntitagTaskDownloadRequest): Promise<ExportItagAntitagTaskDownloadResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.exportItagAntitagTaskDownloadEx(request, headers, runtime);
  }

  /**
   * Description: 触发数据导出
   * Summary: 触发数据导出
   */
  async exportItagAntitagTaskDownloadEx(request: ExportItagAntitagTaskDownloadRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExportItagAntitagTaskDownloadResponse> {
    Util.validateModel(request);
    return $tea.cast<ExportItagAntitagTaskDownloadResponse>(await this.doRequest("1.0", "itag.antitag.task.download.export", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExportItagAntitagTaskDownloadResponse({}));
  }

  /**
   * Description: 轮询导出进度 
   * Summary: 轮询导出进度 
   */
  async queryItagAntitagTaskDownload(request: QueryItagAntitagTaskDownloadRequest): Promise<QueryItagAntitagTaskDownloadResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryItagAntitagTaskDownloadEx(request, headers, runtime);
  }

  /**
   * Description: 轮询导出进度 
   * Summary: 轮询导出进度 
   */
  async queryItagAntitagTaskDownloadEx(request: QueryItagAntitagTaskDownloadRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryItagAntitagTaskDownloadResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryItagAntitagTaskDownloadResponse>(await this.doRequest("1.0", "itag.antitag.task.download.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryItagAntitagTaskDownloadResponse({}));
  }

  /**
   * Description: 任务进度查询
   * Summary: 任务进度查询
   */
  async queryItagAntitagTaskProcess(request: QueryItagAntitagTaskProcessRequest): Promise<QueryItagAntitagTaskProcessResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryItagAntitagTaskProcessEx(request, headers, runtime);
  }

  /**
   * Description: 任务进度查询
   * Summary: 任务进度查询
   */
  async queryItagAntitagTaskProcessEx(request: QueryItagAntitagTaskProcessRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryItagAntitagTaskProcessResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryItagAntitagTaskProcessResponse>(await this.doRequest("1.0", "itag.antitag.task.process.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryItagAntitagTaskProcessResponse({}));
  }

  /**
   * Description: 注册用户到标注平台
   * Summary: 注册用户
   */
  async registerItagAntitagUser(request: RegisterItagAntitagUserRequest): Promise<RegisterItagAntitagUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerItagAntitagUserEx(request, headers, runtime);
  }

  /**
   * Description: 注册用户到标注平台
   * Summary: 注册用户
   */
  async registerItagAntitagUserEx(request: RegisterItagAntitagUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterItagAntitagUserResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterItagAntitagUserResponse>(await this.doRequest("1.0", "itag.antitag.user.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterItagAntitagUserResponse({}));
  }

  /**
   * Description: 添加用户到指定租户
   * Summary: 新用户到租户
   */
  async addItagAntitagUserTnt(request: AddItagAntitagUserTntRequest): Promise<AddItagAntitagUserTntResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addItagAntitagUserTntEx(request, headers, runtime);
  }

  /**
   * Description: 添加用户到指定租户
   * Summary: 新用户到租户
   */
  async addItagAntitagUserTntEx(request: AddItagAntitagUserTntRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddItagAntitagUserTntResponse> {
    Util.validateModel(request);
    return $tea.cast<AddItagAntitagUserTntResponse>(await this.doRequest("1.0", "itag.antitag.user.tnt.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddItagAntitagUserTntResponse({}));
  }

  /**
   * Description: 通过json方式创建任务
   * Summary: 创建标注任务json
   */
  async createItagAntitagTaskJson(request: CreateItagAntitagTaskJsonRequest): Promise<CreateItagAntitagTaskJsonResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createItagAntitagTaskJsonEx(request, headers, runtime);
  }

  /**
   * Description: 通过json方式创建任务
   * Summary: 创建标注任务json
   */
  async createItagAntitagTaskJsonEx(request: CreateItagAntitagTaskJsonRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateItagAntitagTaskJsonResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateItagAntitagTaskJsonResponse>(await this.doRequest("1.0", "itag.antitag.task.json.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateItagAntitagTaskJsonResponse({}));
  }

}
