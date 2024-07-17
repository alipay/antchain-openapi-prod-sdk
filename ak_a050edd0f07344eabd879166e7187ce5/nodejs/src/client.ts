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

// 播报内容数据结构
export class Output extends $tea.Model {
  // 交互类型多媒体节点使用
  // 
  interactionType: string;
  // 播报内容类型
  contentKey: string;
  // 合成的播报内容或者是录音的文件地址
  content: string;
  // 视频文件id
  videoFileId: string;
  // 视频文件播放长度毫秒
  videoFileContentTime: number;
  // 扩展信息
  extInfo: string;
  // key为上面content中的变量value为名称
  variableMap: string;
  // 视频文件code
  videoCode: string;
  // 语音文件code
  voiceCode: string;
  // 输出内容list
  contentList: string[];
  static names(): { [key: string]: string } {
    return {
      interactionType: 'interaction_type',
      contentKey: 'content_key',
      content: 'content',
      videoFileId: 'video_file_id',
      videoFileContentTime: 'video_file_content_time',
      extInfo: 'ext_info',
      variableMap: 'variable_map',
      videoCode: 'video_code',
      voiceCode: 'voice_code',
      contentList: 'content_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      interactionType: 'string',
      contentKey: 'string',
      content: 'string',
      videoFileId: 'string',
      videoFileContentTime: 'number',
      extInfo: 'string',
      variableMap: 'string',
      videoCode: 'string',
      voiceCode: 'string',
      contentList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 动作节点数据结构
export class Input extends $tea.Model {
  // 参数唯一id
  feId: string;
  // 因子的id
  id: number;
  // 参数的code
  code: string;
  // 参数的名称
  name: string;
  // 参数取值
  value: string[];
  // 参数的值类型
  type: string;
  // 是否使用自定义值
  custom: boolean;
  // 是否多选
  multiple: boolean;
  static names(): { [key: string]: string } {
    return {
      feId: 'fe_id',
      id: 'id',
      code: 'code',
      name: 'name',
      value: 'value',
      type: 'type',
      custom: 'custom',
      multiple: 'multiple',
    };
  }

  static types(): { [key: string]: any } {
    return {
      feId: 'string',
      id: 'number',
      code: 'string',
      name: 'string',
      value: { 'type': 'array', 'itemType': 'string' },
      type: 'string',
      custom: 'boolean',
      multiple: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 交互节点数据结构
export class OutputGroup extends $tea.Model {
  // 子节点id
  id: string;
  // 自节点名称
  name: string;
  // 快捷条件选择类型
  conditionType: string;
  // 条件表达式
  conditionConfig: string[];
  // 子节点下的播报内容
  contentList: Output[];
  // 重试播报时的优先级
  priority: number;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      conditionType: 'condition_type',
      conditionConfig: 'condition_config',
      contentList: 'content_list',
      priority: 'priority',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      conditionType: 'string',
      conditionConfig: { 'type': 'array', 'itemType': 'string' },
      contentList: { 'type': 'array', 'itemType': Output },
      priority: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 节点配置信息数据结构
export class NodeInfo extends $tea.Model {
  // 业务标签
  bizTag: Output;
  // 节点子类型
  subType: string;
  // 人工类型
  transferTargetType: string;
  // 路由点
  transferData: string;
  // 技能组
  skillGroupNo: string;
  // 扩展信息
  extInfo: string;
  // 业务达成
  bizAchieve: boolean;
  // 音色
  voiceType: string;
  // 模型类型
  modelType: string;
  // 分类模型id
  modelId: string;
  // llm意图识别列表配置
  llmLabels: string[];
  // 是否必填
  required: boolean;
  // 失败后重复次数
  repeatTime: number;
  // 是否允许重试话术打断
  interruptable: boolean;
  // sts配置
  sts: string;
  // appkey
  appkey: string;
  // 交互组件后置
  postInteractionComponent: boolean;
  // 话术选择策略
  corpusChooseStrategy: string;
  // 话术选择策略模型的地址
  corpusChooseModelUrl: string;
  // 话术选择策略模型类型
  corpusChooseModelType: string;
  // 全局意图
  globalIntention: boolean;
  // 命中全局意图后需要播报的内容
  globalIntentionReply: Output;
  // 按键类型
  buttonType: string;
  // 按键位数
  buttonDigit: number;
  // 结束按键
  buttonTerminator: string;
  // 收号超时时间
  buttonTimeout: number;
  // 收号校验规则
  buttonValidator: string;
  // 静态菜单配置
  staticKeys: string[];
  // 是否支持按键返回上一级
  staticKeyPrevious: boolean;
  // 是否支持按键重播
  staticKeyRepeat: boolean;
  // 是否跳过用户输入的错误校验
  staticKeySkipInputCheck: boolean;
  // 只有客权的静态菜单开发
  round: boolean;
  // 静态菜单语言
  language: string;
  // 实例码
  ieInstanceCode: string;
  // 子流程ID
  subFlowFeId: string;
  // 动态子流程id值
  subFlowDynamicId: string;
  // 输入参数配置
  subFlowInput: Input[];
  // 开始节点参数
  startParams: Input[];
  // 和ouput中的interactionType保持一致
  allowInteractionTypes: string[];
  // 需要共享上下文的虚拟因子列表
  shareFactors: Input[];
  static names(): { [key: string]: string } {
    return {
      bizTag: 'biz_tag',
      subType: 'sub_type',
      transferTargetType: 'transfer_target_type',
      transferData: 'transfer_data',
      skillGroupNo: 'skill_group_no',
      extInfo: 'ext_info',
      bizAchieve: 'biz_achieve',
      voiceType: 'voice_type',
      modelType: 'model_type',
      modelId: 'model_id',
      llmLabels: 'llm_labels',
      required: 'required',
      repeatTime: 'repeat_time',
      interruptable: 'interruptable',
      sts: 'sts',
      appkey: 'appkey',
      postInteractionComponent: 'post_interaction_component',
      corpusChooseStrategy: 'corpus_choose_strategy',
      corpusChooseModelUrl: 'corpus_choose_model_url',
      corpusChooseModelType: 'corpus_choose_model_type',
      globalIntention: 'global_intention',
      globalIntentionReply: 'global_intention_reply',
      buttonType: 'button_type',
      buttonDigit: 'button_digit',
      buttonTerminator: 'button_terminator',
      buttonTimeout: 'button_timeout',
      buttonValidator: 'button_validator',
      staticKeys: 'static_keys',
      staticKeyPrevious: 'static_key_previous',
      staticKeyRepeat: 'static_key_repeat',
      staticKeySkipInputCheck: 'static_key_skip_input_check',
      round: 'round',
      language: 'language',
      ieInstanceCode: 'ie_instance_code',
      subFlowFeId: 'sub_flow_fe_id',
      subFlowDynamicId: 'sub_flow_dynamic_id',
      subFlowInput: 'sub_flow_input',
      startParams: 'start_params',
      allowInteractionTypes: 'allow_interaction_types',
      shareFactors: 'share_factors',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizTag: Output,
      subType: 'string',
      transferTargetType: 'string',
      transferData: 'string',
      skillGroupNo: 'string',
      extInfo: 'string',
      bizAchieve: 'boolean',
      voiceType: 'string',
      modelType: 'string',
      modelId: 'string',
      llmLabels: { 'type': 'array', 'itemType': 'string' },
      required: 'boolean',
      repeatTime: 'number',
      interruptable: 'boolean',
      sts: 'string',
      appkey: 'string',
      postInteractionComponent: 'boolean',
      corpusChooseStrategy: 'string',
      corpusChooseModelUrl: 'string',
      corpusChooseModelType: 'string',
      globalIntention: 'boolean',
      globalIntentionReply: Output,
      buttonType: 'string',
      buttonDigit: 'number',
      buttonTerminator: 'string',
      buttonTimeout: 'number',
      buttonValidator: 'string',
      staticKeys: { 'type': 'array', 'itemType': 'string' },
      staticKeyPrevious: 'boolean',
      staticKeyRepeat: 'boolean',
      staticKeySkipInputCheck: 'boolean',
      round: 'boolean',
      language: 'string',
      ieInstanceCode: 'string',
      subFlowFeId: 'string',
      subFlowDynamicId: 'string',
      subFlowInput: { 'type': 'array', 'itemType': Input },
      startParams: { 'type': 'array', 'itemType': Input },
      allowInteractionTypes: { 'type': 'array', 'itemType': 'string' },
      shareFactors: { 'type': 'array', 'itemType': Input },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 前端图形相关
export class Shape extends $tea.Model {
  // 边的样式
  shape: string;
  // edgeId
  edgeId: string;
  // 边起点的锚点位置
  sourceAnchor: number;
  // 边终点的锚点位置
  targetAnchor: number;
  static names(): { [key: string]: string } {
    return {
      shape: 'shape',
      edgeId: 'edge_id',
      sourceAnchor: 'source_anchor',
      targetAnchor: 'target_anchor',
    };
  }

  static types(): { [key: string]: any } {
    return {
      shape: 'string',
      edgeId: 'string',
      sourceAnchor: 'number',
      targetAnchor: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 流程数据结构
export class Edge extends $tea.Model {
  // 边的id，这个是前端生成的，用于图关系
  edgeId: string;
  // key为上面content中的变量value为名称
  variableMap: string;
  // 边的规则表达式
  frontConditionExpression: string[];
  // 前端图形相关
  shape: Shape;
  // 边连接的上一个节点的feId
  source: string;
  // 边连接的下一个节点的feId
  target: string;
  // 优先级，0~999
  priority: number;
  static names(): { [key: string]: string } {
    return {
      edgeId: 'edge_id',
      variableMap: 'variable_map',
      frontConditionExpression: 'front_condition_expression',
      shape: 'shape',
      source: 'source',
      target: 'target',
      priority: 'priority',
    };
  }

  static types(): { [key: string]: any } {
    return {
      edgeId: 'string',
      variableMap: 'string',
      frontConditionExpression: { 'type': 'array', 'itemType': 'string' },
      shape: Shape,
      source: 'string',
      target: 'string',
      priority: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 节点数据结构
export class Node extends $tea.Model {
  // 节点的id
  nodeId: string;
  // 节点名称
  nodeName: string;
  // 节点类型
  nodeType: string;
  // 节点在画布的横向位置
  x: number;
  // 节点在画布的纵向位置
  y: number;
  // 节点配置信息
  nodeInfo: NodeInfo;
  // 交互节点的首问播报
  nodeOutputs: Output;
  // 交互节点的新的首问播报
  firstOutputs: Output[];
  // 视频首句播报配置
  nodeVideoOutput: Output;
  // 视频结束配置
  endVideoOutput: OutputGroup;
  static names(): { [key: string]: string } {
    return {
      nodeId: 'node_id',
      nodeName: 'node_name',
      nodeType: 'node_type',
      x: 'x',
      y: 'y',
      nodeInfo: 'node_info',
      nodeOutputs: 'node_outputs',
      firstOutputs: 'first_outputs',
      nodeVideoOutput: 'node_video_output',
      endVideoOutput: 'end_video_output',
    };
  }

  static types(): { [key: string]: any } {
    return {
      nodeId: 'string',
      nodeName: 'string',
      nodeType: 'string',
      x: 'number',
      y: 'number',
      nodeInfo: NodeInfo,
      nodeOutputs: Output,
      firstOutputs: { 'type': 'array', 'itemType': Output },
      nodeVideoOutput: Output,
      endVideoOutput: OutputGroup,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 其他统计类数据
export class Page extends $tea.Model {
  // 页码
  currenyPage: number;
  // 每页数据个数
  pageSize: number;
  // 总页数
  total: number;
  static names(): { [key: string]: string } {
    return {
      currenyPage: 'curreny_page',
      pageSize: 'page_size',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      currenyPage: 'number',
      pageSize: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 流程详情返回体
export class OutboundDialogFlowDetailResponseData extends $tea.Model {
  // 数据库自增id
  id?: number;
  // 前端生成的随机字符串id
  feId: string;
  // 流程名称
  name: string;
  // 流程当前版本号
  version: number;
  // 流程版本号集合
  versions: number[];
  // 全局配置
  globalConfig: string;
  // 流程类型
  type: string;
  // 暂存code
  temporaryStorageCode: string;
  // 视频播报类型
  flowInteractiveType: string;
  // 流程图边数据
  edges: Edge[];
  // 流程图节点数据
  nodes: Node[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      feId: 'fe_id',
      name: 'name',
      version: 'version',
      versions: 'versions',
      globalConfig: 'global_config',
      type: 'type',
      temporaryStorageCode: 'temporary_storage_code',
      flowInteractiveType: 'flow_interactive_type',
      edges: 'edges',
      nodes: 'nodes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      feId: 'string',
      name: 'string',
      version: 'number',
      versions: { 'type': 'array', 'itemType': 'number' },
      globalConfig: 'string',
      type: 'string',
      temporaryStorageCode: 'string',
      flowInteractiveType: 'string',
      edges: { 'type': 'array', 'itemType': Edge },
      nodes: { 'type': 'array', 'itemType': Node },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 收单返回结构体
export class OutboundPhoneResponseData extends $tea.Model {
  // 通话唯一ID
  acid?: string;
  // 是否同步
  asyn?: boolean;
  // 外呼ID
  outcallRequestId?: string;
  // 外呼DB的ID
  asynDbId?: string;
  static names(): { [key: string]: string } {
    return {
      acid: 'acid',
      asyn: 'asyn',
      outcallRequestId: 'outcall_request_id',
      asynDbId: 'asyn_db_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      acid: 'string',
      asyn: 'boolean',
      outcallRequestId: 'string',
      asynDbId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 任务列表返回体
export class OutboundTaskListResponseData extends $tea.Model {
  // 任务数据库id
  id?: number;
  // 任务名称
  name?: string;
  // 任务id
  code?: string;
  // 流程前端id/流程code
  flowFeld?: string;
  // 流程id
  flowId?: number;
  // 流程名称
  flowName?: string;
  // 流程环境区分
  // PRE——预发
  // PUB——线上
  flowEnv?: string;
  // 规则id
  ruleId?: number;
  // 规则名称
  ruleName?: string;
  // 状态
  // USING-启用
  // UNUSED-不启用
  // DELETED-已删除
  status?: string;
  // 当前任务版本号
  version?: number;
  // 当前引用流程版本号
  flowVersion?: number;
  // 流程最新的版本号
  flowLatestVersion?: number;
  // 当前引用规则版本号
  ruleVersion?: number;
  // 规则最新的版本号
  ruleLatestVersion?: number;
  // 任务最新的版本号
  latestVersion?: number;
  // 任务线上版本号
  pubVersion?: number;
  // 任务是否在发布流程中
  publishing: boolean;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      code: 'code',
      flowFeld: 'flow_feld',
      flowId: 'flow_id',
      flowName: 'flow_name',
      flowEnv: 'flow_env',
      ruleId: 'rule_id',
      ruleName: 'rule_name',
      status: 'status',
      version: 'version',
      flowVersion: 'flow_version',
      flowLatestVersion: 'flow_latest_version',
      ruleVersion: 'rule_version',
      ruleLatestVersion: 'rule_latest_version',
      latestVersion: 'latest_version',
      pubVersion: 'pub_version',
      publishing: 'publishing',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      name: 'string',
      code: 'string',
      flowFeld: 'string',
      flowId: 'number',
      flowName: 'string',
      flowEnv: 'string',
      ruleId: 'number',
      ruleName: 'string',
      status: 'string',
      version: 'number',
      flowVersion: 'number',
      flowLatestVersion: 'number',
      ruleVersion: 'number',
      ruleLatestVersion: 'number',
      latestVersion: 'number',
      pubVersion: 'number',
      publishing: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportAntchainAioOutboundPhoneRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务ID
  taskCode: string;
  // 收单手机号
  userPhone: string;
  // 用户ID
  userId?: string;
  // 幂等控制参数，可以为空。为空时不进行幂等控
  idempotenceId?: string;
  // 业务系统在外呼时传入额外参数,json格式
  bizExtInfo?: string;
  // 计划外呼执行时间时间戳。默认为当前时间。单位毫秒
  outcallTimestamp?: number;
  // 计划外呼过期时间戳。 必须填写，一般为当天22:30左右。单位毫秒
  expirationTimestamp: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskCode: 'task_code',
      userPhone: 'user_phone',
      userId: 'user_id',
      idempotenceId: 'idempotence_id',
      bizExtInfo: 'biz_ext_info',
      outcallTimestamp: 'outcall_timestamp',
      expirationTimestamp: 'expiration_timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskCode: 'string',
      userPhone: 'string',
      userId: 'string',
      idempotenceId: 'string',
      bizExtInfo: 'string',
      outcallTimestamp: 'number',
      expirationTimestamp: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportAntchainAioOutboundPhoneResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  success?: boolean;
  // 返回码
  code?: string;
  // 描述
  message?: string;
  // 内容
  data?: OutboundPhoneResponseData;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      code: 'code',
      message: 'message',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      code: 'string',
      message: 'string',
      data: OutboundPhoneResponseData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAioOutboundTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务名称
  name?: string;
  // 外呼流程id
  flowId?: number;
  // 环境区分
  env: string;
  // 与env对应
  ldcName: string;
  // 根据状态过滤数据
  status?: string;
  // 租户id
  tntInstId: string;
  // 业务id
  bizCode: string;
  // 当前页码
  currentPage: number;
  // 每页数据个数
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      flowId: 'flow_id',
      env: 'env',
      ldcName: 'ldc_name',
      status: 'status',
      tntInstId: 'tnt_inst_id',
      bizCode: 'biz_code',
      currentPage: 'current_page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      flowId: 'number',
      env: 'string',
      ldcName: 'string',
      status: 'string',
      tntInstId: 'string',
      bizCode: 'string',
      currentPage: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAioOutboundTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求是否成功
  success?: boolean;
  // 请求结果说明
  message?: string;
  // 接口业务数据
  data?: OutboundTaskListResponseData[];
  // 其他统计类数据
  stat?: Page;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      message: 'message',
      data: 'data',
      stat: 'stat',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      message: 'string',
      data: { 'type': 'array', 'itemType': OutboundTaskListResponseData },
      stat: Page,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAioOutboundDialogflowRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务id
  id: number;
  // 租户id
  tntInstId: string;
  // 业务id
  bizCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      tntInstId: 'tnt_inst_id',
      bizCode: 'biz_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      tntInstId: 'string',
      bizCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAioOutboundDialogflowResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求是否成功
  // 
  success?: boolean;
  // 请求结果说明
  // 
  message?: string;
  // 接口业务数据
  // 
  data?: OutboundDialogFlowDetailResponseData;
  // traceId
  traceId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      message: 'message',
      data: 'data',
      traceId: 'trace_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      message: 'string',
      data: OutboundDialogFlowDetailResponseData,
      traceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAioOutboundRecordurlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户id
  tntInstId: string;
  // 业务code
  bizCode: string;
  // acid
  acid?: string;
  // callRequestId
  callRequestId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tntInstId: 'tnt_inst_id',
      bizCode: 'biz_code',
      acid: 'acid',
      callRequestId: 'call_request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tntInstId: 'string',
      bizCode: 'string',
      acid: 'string',
      callRequestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAntchainAioOutboundRecordurlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求是否成功
  // 
  success?: boolean;
  // 请求结果说明
  // 
  message?: string;
  // 录音下载地址
  data?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      message: 'message',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      message: 'string',
      data: 'string',
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
          sdk_version: "1.0.1",
          _prod_code: "ak_a050edd0f07344eabd879166e7187ce5",
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
   * Description: 外呼收单接口
   * Summary: 外呼收单接口
   */
  async importAntchainAioOutboundPhone(request: ImportAntchainAioOutboundPhoneRequest): Promise<ImportAntchainAioOutboundPhoneResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importAntchainAioOutboundPhoneEx(request, headers, runtime);
  }

  /**
   * Description: 外呼收单接口
   * Summary: 外呼收单接口
   */
  async importAntchainAioOutboundPhoneEx(request: ImportAntchainAioOutboundPhoneRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportAntchainAioOutboundPhoneResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportAntchainAioOutboundPhoneResponse>(await this.doRequest("1.0", "antchain.aio.outbound.phone.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportAntchainAioOutboundPhoneResponse({}));
  }

  /**
   * Description: 任务列表接口
   * Summary: 任务列表接口
   */
  async queryAntchainAioOutboundTask(request: QueryAntchainAioOutboundTaskRequest): Promise<QueryAntchainAioOutboundTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainAioOutboundTaskEx(request, headers, runtime);
  }

  /**
   * Description: 任务列表接口
   * Summary: 任务列表接口
   */
  async queryAntchainAioOutboundTaskEx(request: QueryAntchainAioOutboundTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainAioOutboundTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainAioOutboundTaskResponse>(await this.doRequest("1.0", "antchain.aio.outbound.task.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainAioOutboundTaskResponse({}));
  }

  /**
   * Description: 话术详情
   * Summary: 话术详情
   */
  async queryAntchainAioOutboundDialogflow(request: QueryAntchainAioOutboundDialogflowRequest): Promise<QueryAntchainAioOutboundDialogflowResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainAioOutboundDialogflowEx(request, headers, runtime);
  }

  /**
   * Description: 话术详情
   * Summary: 话术详情
   */
  async queryAntchainAioOutboundDialogflowEx(request: QueryAntchainAioOutboundDialogflowRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainAioOutboundDialogflowResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainAioOutboundDialogflowResponse>(await this.doRequest("1.0", "antchain.aio.outbound.dialogflow.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainAioOutboundDialogflowResponse({}));
  }

  /**
   * Description: 录音下载
   * Summary: 录音下载接口
   */
  async queryAntchainAioOutboundRecordurl(request: QueryAntchainAioOutboundRecordurlRequest): Promise<QueryAntchainAioOutboundRecordurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAntchainAioOutboundRecordurlEx(request, headers, runtime);
  }

  /**
   * Description: 录音下载
   * Summary: 录音下载接口
   */
  async queryAntchainAioOutboundRecordurlEx(request: QueryAntchainAioOutboundRecordurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAntchainAioOutboundRecordurlResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAntchainAioOutboundRecordurlResponse>(await this.doRequest("1.0", "antchain.aio.outbound.recordurl.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAntchainAioOutboundRecordurlResponse({}));
  }

}
