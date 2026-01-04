// This file is auto-generated, don't edit it
import AntchainUtil from '@antchain/alipay-util';
import Util, * as $Util from '@alicloud/tea-util';
import RPCUtil from '@alicloud/rpc-util';
import { Readable } from 'stream';
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

// Agent对话-对应的工具/工作流参数列表
export class ToolOptionParam extends $tea.Model {
  // 参数名称
  name: string;
  // 参数code
  code: string;
  // 参数描述
  desc: string;
  // 参数值
  value: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      code: 'code',
      desc: 'desc',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      code: 'string',
      desc: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 对话界面思维链显示标题结构
export class ThoughtChainDisplay extends $tea.Model {
  // 思维链显示状态
  status: string;
  // 思维链显示名称
  name: string;
  // 思维链类型
  subType: string;
  // 思维链图标
  icon: string;
  // 思维链模块额外信息
  resultMsg: string;
  static names(): { [key: string]: string } {
    return {
      status: 'status',
      name: 'name',
      subType: 'sub_type',
      icon: 'icon',
      resultMsg: 'result_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      status: 'string',
      name: 'string',
      subType: 'string',
      icon: 'string',
      resultMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Agent对话详情-思维链-内容
export class ThoughtChainContent extends $tea.Model {
  // id
  id: string;
  // source
  source: string;
  // children
  children: string;
  // timeConsuming
  timeConsuming: string;
  // timeConsumingEpoch
  timeConsumingEpoch: number;
  // latency
  latency: number;
  // type
  type: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      source: 'source',
      children: 'children',
      timeConsuming: 'time_consuming',
      timeConsumingEpoch: 'time_consuming_epoch',
      latency: 'latency',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      source: 'string',
      children: 'string',
      timeConsuming: 'string',
      timeConsumingEpoch: 'number',
      latency: 'number',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Agent对话-记忆参数列表
// 
export class AgentVariable extends $tea.Model {
  // 变量对应的id
  id: number;
  // 变量名称
  name: string;
  // 变量code
  code: string;
  // 变量描述
  desc: string;
  // 变量值
  value: string;
  // 变量值更新时间
  updateTime: string;
  // "business", "业务参数"
  // "memory", "记忆参数"
  type: string;
  // 是否模型可见
  showToModel: boolean;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      code: 'code',
      desc: 'desc',
      value: 'value',
      updateTime: 'update_time',
      type: 'type',
      showToModel: 'show_to_model',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      name: 'string',
      code: 'string',
      desc: 'string',
      value: 'string',
      updateTime: 'string',
      type: 'string',
      showToModel: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Agent对话-引用工具/工作流列表
export class ToolOptionInfo extends $tea.Model {
  // plugin = 工具；workflow = 工作流
  type: string;
  // 对应的工具/工作流名称
  name: string;
  // 对应的工具/工作流名称
  code: string;
  // 对应的工具/工作流参数列表
  params: ToolOptionParam[];
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      name: 'name',
      code: 'code',
      params: 'params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      name: 'string',
      code: 'string',
      params: { 'type': 'array', 'itemType': ToolOptionParam },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Agent对话详情-思维链信息详情列表
export class ThoughtChainDisplayUnit extends $tea.Model {
  // 思维链模块id
  // 
  id: string;
  // 思维链模块状态：success or fail
  // 
  status: string;
  // 思维链模块额外信息
  // 
  resultMsg: string;
  // 思维链模块耗时
  // 
  latency: number;
  // 思维链模块时间戳 (思维链本身的时间戳)
  // 
  timestamp: number;
  // 思维链对应操作开始执行时间戳 (optional)
  // 
  startTimestamp: number;
  // 思维链对应操作开始输出时间戳 (optional)
  // 
  outputTimestamp: number;
  // 思维链对应操作结束执行时间戳 (optional)
  // 
  endTimestamp: number;
  // 思维链对应过程总模型token耗费 (optional)
  // 
  tokenCost: number;
  // 思维链对应过程输入模型token耗费 (optional)
  // 
  inputTokenCost: number;
  // 思维链对应过程输出模型token耗费 (optional)
  // 
  outputTokenCost: number;
  // 思维链模块显示名称
  // 
  displayName: string;
  // 思维链模块是否为进行中阶段的输出
  // 
  isRunning: boolean;
  // 思维链模块类型：DECISION or GENERATE
  // 
  type: string;
  // 思维链模块子类型：content_search 知识查询 / llm 大模型 / tool 工具 / workflow 工作流 / end 结束 / parameter 参数处理
  // 
  subType: string;
  // 思维链模块子类型关联id。如果是工具，那就是 platform_api_plugin 表的 id；如果是工作流，那就是 platform_intent 表的 id
  // 
  refResourceId: number;
  // 思维链模块子类型关联code，一般是工具或工作流类型对应的code
  // 
  refResourceCode: string;
  // 思维链模块子类型关联图标
  // 
  refResourceIcon: string;
  // 思维链模块子类型为工作流时的版本，仅当子类型为工作流时赋值
  // 
  refWorkflowBuildVersion: string;
  // 思维链模块子类型为工作流时的运行实例id，仅当子类型为工作流且 refWorkflowBuildVersion 以 NEW 开头时赋值
  // 
  refWorkflowRuntimeInstanceId: string;
  // 思维链模块入参信息，JSON字符串格式
  // 
  inputJsonString: string;
  // 思维链模块出参信息，JSON字符串格式
  // 
  outputJsonString: string;
  // 思维链模块额外消息信息 (如内置工具过程展现内容)，JSON字符串格式
  // 
  extraInfoJsonString: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      status: 'status',
      resultMsg: 'result_msg',
      latency: 'latency',
      timestamp: 'timestamp',
      startTimestamp: 'start_timestamp',
      outputTimestamp: 'output_timestamp',
      endTimestamp: 'end_timestamp',
      tokenCost: 'token_cost',
      inputTokenCost: 'input_token_cost',
      outputTokenCost: 'output_token_cost',
      displayName: 'display_name',
      isRunning: 'is_running',
      type: 'type',
      subType: 'sub_type',
      refResourceId: 'ref_resource_id',
      refResourceCode: 'ref_resource_code',
      refResourceIcon: 'ref_resource_icon',
      refWorkflowBuildVersion: 'ref_workflow_build_version',
      refWorkflowRuntimeInstanceId: 'ref_workflow_runtime_instance_id',
      inputJsonString: 'input_json_string',
      outputJsonString: 'output_json_string',
      extraInfoJsonString: 'extra_info_json_string',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      status: 'string',
      resultMsg: 'string',
      latency: 'number',
      timestamp: 'number',
      startTimestamp: 'number',
      outputTimestamp: 'number',
      endTimestamp: 'number',
      tokenCost: 'number',
      inputTokenCost: 'number',
      outputTokenCost: 'number',
      displayName: 'string',
      isRunning: 'boolean',
      type: 'string',
      subType: 'string',
      refResourceId: 'number',
      refResourceCode: 'string',
      refResourceIcon: 'string',
      refWorkflowBuildVersion: 'string',
      refWorkflowRuntimeInstanceId: 'string',
      inputJsonString: 'string',
      outputJsonString: 'string',
      extraInfoJsonString: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 文件附件信息
export class AttachFile extends $tea.Model {
  // 文件Id
  // 
  fileId: string;
  // 文件名称
  // 
  fileName: string;
  // 文件类型
  // 
  fileType: string;
  // 文件来源
  // 
  fileSource: string;
  // 文件链接
  // 
  fileUrl: string;
  // 文件总结
  // 
  fileSummary: string;
  // 上传时间
  // 
  operateTime: string;
  // Map<String, String>	扩展信息
  // 
  extInfo: string;
  // 文件大小
  // 
  fileSize: string;
  // 内容库 dbId, 用于检索
  // 
  contentId: string;
  static names(): { [key: string]: string } {
    return {
      fileId: 'file_id',
      fileName: 'file_name',
      fileType: 'file_type',
      fileSource: 'file_source',
      fileUrl: 'file_url',
      fileSummary: 'file_summary',
      operateTime: 'operate_time',
      extInfo: 'ext_info',
      fileSize: 'file_size',
      contentId: 'content_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fileId: 'string',
      fileName: 'string',
      fileType: 'string',
      fileSource: 'string',
      fileUrl: 'string',
      fileSummary: 'string',
      operateTime: 'string',
      extInfo: 'string',
      fileSize: 'string',
      contentId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 卡片/模版类型：行动点列表
export class TemplateAction extends $tea.Model {
  // name
  name: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Agent 运行思维链
export class ThoughtChainInfo extends $tea.Model {
  // 思维链id
  id: string;
  // "success" | "error" | "loading" | "abort" | "done"
  status: string;
  // 内容
  content: ThoughtChainContent[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      status: 'status',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      status: 'string',
      content: { 'type': 'array', 'itemType': ThoughtChainContent },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Agent 运行相关信息
export class AgentChatLogInfo extends $tea.Model {
  // 记忆参数列表
  // 
  contextVariableList: AgentVariable[];
  // 引用工具/工作流列表
  // 
  toolOptionList: ToolOptionInfo[];
  // 对话界面思维链显示标题结构
  thoughtChainDisplay: ThoughtChainDisplay;
  // 思维链信息详情列表
  // 
  thoughtChainDisplayUnitList: ThoughtChainDisplayUnit[];
  // 该思维链有回答环节
  // 
  hasResponseType: boolean;
  static names(): { [key: string]: string } {
    return {
      contextVariableList: 'context_variable_list',
      toolOptionList: 'tool_option_list',
      thoughtChainDisplay: 'thought_chain_display',
      thoughtChainDisplayUnitList: 'thought_chain_display_unit_list',
      hasResponseType: 'has_response_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      contextVariableList: { 'type': 'array', 'itemType': AgentVariable },
      toolOptionList: { 'type': 'array', 'itemType': ToolOptionInfo },
      thoughtChainDisplay: ThoughtChainDisplay,
      thoughtChainDisplayUnitList: { 'type': 'array', 'itemType': ThoughtChainDisplayUnit },
      hasResponseType: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Agent详情 --> 隶属multi-agent的sub agents --> edges 信息
export class MultiAgentEdge extends $tea.Model {
  // edge 指向的下个agent instance id
  // 
  nextInstanceId: string;
  // 跳到next agent的prompt
  // 
  prompt: string;
  static names(): { [key: string]: string } {
    return {
      nextInstanceId: 'next_instance_id',
      prompt: 'prompt',
    };
  }

  static types(): { [key: string]: any } {
    return {
      nextInstanceId: 'string',
      prompt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Agent对话详情-文档类型：文档参考片段列表
export class DocumentReferenceInfo extends $tea.Model {
  // title
  title: string;
  // address
  address: string;
  // score 浮点类型
  score: string;
  // content
  content: string;
  // type	SearchSceneEnum
  // LLM_CHUNK,
  //     FAQ,
  //     LLM_TABLE;
  type: string;
  static names(): { [key: string]: string } {
    return {
      title: 'title',
      address: 'address',
      score: 'score',
      content: 'content',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      title: 'string',
      address: 'string',
      score: 'string',
      content: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 知识类型：知识点列表
export class KnowledgeTitleInfo extends $tea.Model {
  // title
  title: string;
  // score 浮点类型
  score: string;
  static names(): { [key: string]: string } {
    return {
      title: 'title',
      score: 'score',
    };
  }

  static types(): { [key: string]: any } {
    return {
      title: 'string',
      score: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Agent详情 --> 隶属multi-agent的sub agents --> 坐标信息
export class DraftPosition extends $tea.Model {
  // x 浮点类型
  x: string;
  // y 浮点类型
  y: string;
  static names(): { [key: string]: string } {
    return {
      x: 'x',
      y: 'y',
    };
  }

  static types(): { [key: string]: any } {
    return {
      x: 'string',
      y: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 工具入参的json schema
export class JsonSchema extends $tea.Model {
  // 工具属性，Map<String, Object> 类型，适配网关透出，使用字符串方式存储
  propertiesJson: string;
  // 类型
  type: string;
  // 必填项
  required: string[];
  // 是否允许额外属性
  additionalProperties: boolean;
  static names(): { [key: string]: string } {
    return {
      propertiesJson: 'properties_json',
      type: 'type',
      required: 'required',
      additionalProperties: 'additional_properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      propertiesJson: 'string',
      type: 'string',
      required: { 'type': 'array', 'itemType': 'string' },
      additionalProperties: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Agent对话历史列表
export class SingleAgentChatHistoryPreview extends $tea.Model {
  // 数据库id
  // 
  id: number;
  // 会话id
  // 
  sessionId: string;
  // 会话开始时间
  // 
  askTime: string;
  // 前端展示的时间
  // 
  displayTime: string;
  // 会话在列表中的显示内容
  // 
  sessionIdentifier: string;
  // 消息类型（chat/pushMessage）
  // 
  type: string;
  // 推送的消息内容
  // 
  textResponse: string;
  // 推送时间
  // 
  timestampDisplay: string;
  // 返回类型
  // 
  displayResponseType: string;
  // 附件文件
  // 
  files: AttachFile[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      sessionId: 'session_id',
      askTime: 'ask_time',
      displayTime: 'display_time',
      sessionIdentifier: 'session_identifier',
      type: 'type',
      textResponse: 'text_response',
      timestampDisplay: 'timestamp_display',
      displayResponseType: 'display_response_type',
      files: 'files',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      sessionId: 'string',
      askTime: 'string',
      displayTime: 'string',
      sessionIdentifier: 'string',
      type: 'string',
      textResponse: 'string',
      timestampDisplay: 'string',
      displayResponseType: 'string',
      files: { 'type': 'array', 'itemType': AttachFile },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Agent详情-Agent模型配置表
// 
export class AgentModelParams extends $tea.Model {
  // 模型类型 AgentModelTypeEnum - DECISION: 决策模型 - GENERATE: 生成模型 - E2E: 端到端模型 - RAG: 检索生成模型
  // 
  type: string;
  // 模型版本 {model}/{version}#{adapter}
  // 
  model: string;
  // 生成策略预设配置 AgentModelPresetEnum - FLEXIBLE: 灵活 - NORMAL: 正常 - STRICT: 严格
  // 
  presetIndex: string;
  // temperature 浮点类型
  // 
  temperature: string;
  // top_k
  topK: number;
  // top_p 浮点类型
  topP: string;
  // doSample
  doSample: boolean;
  // beam_width
  beamWidth: number;
  // 最大输出长度
  // 
  maxOutToken: number;
  // 是否为支持 function call 的模型
  // 
  functionCall: boolean;
  // 自定义推理服务url
  // 
  customUrl: string;
  // 是否平台官方模型
  // 
  bailingOfficial: boolean;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      model: 'model',
      presetIndex: 'preset_index',
      temperature: 'temperature',
      topK: 'top_k',
      topP: 'top_p',
      doSample: 'do_sample',
      beamWidth: 'beam_width',
      maxOutToken: 'max_out_token',
      functionCall: 'function_call',
      customUrl: 'custom_url',
      bailingOfficial: 'bailing_official',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      model: 'string',
      presetIndex: 'string',
      temperature: 'string',
      topK: 'number',
      topP: 'string',
      doSample: 'boolean',
      beamWidth: 'number',
      maxOutToken: 'number',
      functionCall: 'boolean',
      customUrl: 'string',
      bailingOfficial: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 工具列表vo
export class ToolInfoVO extends $tea.Model {
  // 工具名称
  name: string;
  // 工具描述
  description: string;
  // 工具入参的json schema
  inputSchema: JsonSchema;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      description: 'description',
      inputSchema: 'input_schema',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      description: 'string',
      inputSchema: JsonSchema,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Agent详情查询-隶属multi-agent的sub agents
export class SubAgentInfo extends $tea.Model {
  // agent主键id
  // 
  id: number;
  // agent code
  // 
  uniqueCode: string;
  // 场景描述
  // 
  scene: string;
  // 调用示例 话术
  // 
  scripting: string[];
  // 是否默认展示
  // 
  isDefault: boolean;
  // 实例id
  // 
  instanceId: string;
  // edges 信息
  // 
  edges: MultiAgentEdge[];
  // 坐标信息
  // 
  position: DraftPosition;
  // agent 来源类型
  // 
  agentSource: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      uniqueCode: 'unique_code',
      scene: 'scene',
      scripting: 'scripting',
      isDefault: 'is_default',
      instanceId: 'instance_id',
      edges: 'edges',
      position: 'position',
      agentSource: 'agent_source',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      uniqueCode: 'string',
      scene: 'string',
      scripting: { 'type': 'array', 'itemType': 'string' },
      isDefault: 'boolean',
      instanceId: 'string',
      edges: { 'type': 'array', 'itemType': MultiAgentEdge },
      position: DraftPosition,
      agentSource: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Agent详情查询-Agent关联配置信息表
export class AgentRefPluginInfo extends $tea.Model {
  // 工具id
  // 
  id: string;
  // 构建版本号
  // 
  buildVersion: string;
  // 入参预设值表 Map<String, String>
  paramValueMap: string;
  // 入参预设值表，原param_value_map字段，Map<String, String>格式
  // 
  paramValueMapJson: string;
  // 关联的语料
  corpus: string[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      buildVersion: 'build_version',
      paramValueMap: 'param_value_map',
      paramValueMapJson: 'param_value_map_json',
      corpus: 'corpus',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      buildVersion: 'string',
      paramValueMap: 'string',
      paramValueMapJson: 'string',
      corpus: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Agent详情-Agent安全审核配置
export class AgentSecConfig extends $tea.Model {
  // 是否打开安全审核
  enableSecCheck: boolean;
  // 安全提供方:平台配置 大安全、天鉴等
  secProvider: string;
  static names(): { [key: string]: string } {
    return {
      enableSecCheck: 'enable_sec_check',
      secProvider: 'sec_provider',
    };
  }

  static types(): { [key: string]: any } {
    return {
      enableSecCheck: 'boolean',
      secProvider: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 对话详细信息
export class DisplayResponseContent extends $tea.Model {
  // 【对话历史展示专用】对话历史展示类型，枚举值：QUERY("用户输入"), RESPONSE("回复")
  // 
  chatHistoryDisplayTypeEnum: string;
  // 展示类型，前端根据此类型读取相关字段进行展示，枚举值：TEXT("文本"), CARD("卡片"), TEMPLATE("模版"), MARKDOWN("Markdown模版"), KNOWLEDGE("知识点"), DOCUMENT("文档"), PLUGIN("插件"), DEFAULT("兜底"), ERROR("异常")
  // 
  displayResponseType: string;
  // content 日志原文
  rawContent: string;
  // Map<String, Object> 元数据kv对
  // 
  kvMap: string;
  // 关联节点id
  // 
  refNodeId: string;
  // 关联节点信息
  // 
  spmData: string;
  // 关联意图domain+intent
  // 
  domainIntent: string;
  // 文本回复内容，非文本类型的机器人回复展现也使用该字段
  // 
  textResponse: string;
  // 卡片/模版类型：行动点列表
  // 
  templateActionList: TemplateAction[];
  // 模版/卡片类型: 序号
  // 
  order: number;
  // 模版类型：模版id
  // 
  templateId: string;
  // 模版类型：模版名称
  // 
  templateName: string;
  // 模版类型：模版 responseId
  // 
  templateResponseId: string;
  // 模版类型：模版预览图地址
  // 
  templatePictureUrl: string;
  // 卡片类型：卡片 responseId
  // 
  cardResponseId: string;
  // 卡片类型：卡片ID
  // 
  cardId: string;
  // 卡片类型：卡片版本
  // 
  cardVersion: string;
  // Markdown 类型：消息标题
  // 
  msgTitle: string;
  // Markdown 类型：消息内容
  // 
  msgContent: string;
  // 知识类型：知识点列表
  // 
  knowledgeTitleList: KnowledgeTitleInfo[];
  // 文档类型：文档参考片段列表
  // 
  documentReferenceList: DocumentReferenceInfo[];
  // 建议/关联问题列表
  // 
  suggestions: string[];
  // 响应单元id
  // 
  unitId: string;
  // 响应序号
  // 
  index: number;
  // 是还在加载
  // 
  loading: boolean;
  // 运行时间戳，用于计算耗时
  // 
  timestamp: number;
  // 运行时间戳，展示格式（已废弃）
  // 
  timestampDisplay: string;
  // 响应控制码，用于标识是否被安全拦截或者正常生成
  // 
  replyCmd: string;
  // 附件列表
  // 
  files: AttachFile[];
  // Agent 运行思维链
  thoughtChain: ThoughtChainInfo;
  // AgentChatLogInfo. Agent 运行相关信息
  // 
  agentChatLogInfo: AgentChatLogInfo;
  static names(): { [key: string]: string } {
    return {
      chatHistoryDisplayTypeEnum: 'chat_history_display_type_enum',
      displayResponseType: 'display_response_type',
      rawContent: 'raw_content',
      kvMap: 'kv_map',
      refNodeId: 'ref_node_id',
      spmData: 'spm_data',
      domainIntent: 'domain_intent',
      textResponse: 'text_response',
      templateActionList: 'template_action_list',
      order: 'order',
      templateId: 'template_id',
      templateName: 'template_name',
      templateResponseId: 'template_response_id',
      templatePictureUrl: 'template_picture_url',
      cardResponseId: 'card_response_id',
      cardId: 'card_id',
      cardVersion: 'card_version',
      msgTitle: 'msg_title',
      msgContent: 'msg_content',
      knowledgeTitleList: 'knowledge_title_list',
      documentReferenceList: 'document_reference_list',
      suggestions: 'suggestions',
      unitId: 'unit_id',
      index: 'index',
      loading: 'loading',
      timestamp: 'timestamp',
      timestampDisplay: 'timestamp_display',
      replyCmd: 'reply_cmd',
      files: 'files',
      thoughtChain: 'thought_chain',
      agentChatLogInfo: 'agent_chat_log_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      chatHistoryDisplayTypeEnum: 'string',
      displayResponseType: 'string',
      rawContent: 'string',
      kvMap: 'string',
      refNodeId: 'string',
      spmData: 'string',
      domainIntent: 'string',
      textResponse: 'string',
      templateActionList: { 'type': 'array', 'itemType': TemplateAction },
      order: 'number',
      templateId: 'string',
      templateName: 'string',
      templateResponseId: 'string',
      templatePictureUrl: 'string',
      cardResponseId: 'string',
      cardId: 'string',
      cardVersion: 'string',
      msgTitle: 'string',
      msgContent: 'string',
      knowledgeTitleList: { 'type': 'array', 'itemType': KnowledgeTitleInfo },
      documentReferenceList: { 'type': 'array', 'itemType': DocumentReferenceInfo },
      suggestions: { 'type': 'array', 'itemType': 'string' },
      unitId: 'string',
      index: 'number',
      loading: 'boolean',
      timestamp: 'number',
      timestampDisplay: 'string',
      replyCmd: 'string',
      files: { 'type': 'array', 'itemType': AttachFile },
      thoughtChain: ThoughtChainInfo,
      agentChatLogInfo: AgentChatLogInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Agent历史对话信息列表vo
export class AgentChatHistoryPreviewVO extends $tea.Model {
  // 对话历史列表
  sessionList: SingleAgentChatHistoryPreview[];
  static names(): { [key: string]: string } {
    return {
      sessionList: 'session_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sessionList: { 'type': 'array', 'itemType': SingleAgentChatHistoryPreview },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 知识库-文件上传响应内容
export class UploadAttachmentFileVO extends $tea.Model {
  // 上传结果	
  // 
  uploadStatus: string;
  // 文件URL
  fileUrl: string;
  // file_id
  fileId: string;
  // 文件类型
  fileType: string;
  // 文件名
  fileName: string;
  // 附件大小	
  // 
  fileSize: number;
  // 内容库 ID（用于检索）	
  // 
  contentId: string;
  // 错误信息	
  // 
  errorMessage: string;
  static names(): { [key: string]: string } {
    return {
      uploadStatus: 'upload_status',
      fileUrl: 'file_url',
      fileId: 'file_id',
      fileType: 'file_type',
      fileName: 'file_name',
      fileSize: 'file_size',
      contentId: 'content_id',
      errorMessage: 'error_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uploadStatus: 'string',
      fileUrl: 'string',
      fileId: 'string',
      fileType: 'string',
      fileName: 'string',
      fileSize: 'number',
      contentId: 'string',
      errorMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Agent详情查询VO
export class AgentVO extends $tea.Model {
  // Agent的唯一标识符
  id: number;
  // Agent唯一uid
  // 
  uniqueCode: string;
  // Agent名称
  // 
  name: string;
  // Agent 版本
  // 
  agentVersion: string;
  // Agent类型 "multi", "多智能体应用" "workflow", "工作流应用""lite", "轻量应用"  "external", "外部应用"
  type: string;
  // Agent描述
  // 
  description: string;
  // Agent创建人
  // 
  creator: string;
  // Agent创建时间
  // 
  gmtCreate: string;
  // Agent编辑时间
  // 
  gmtModified: string;
  // Agent安全审核配置
  // 
  secConfig: AgentSecConfig;
  // 欢迎语
  // 
  welcome: string;
  // 是否展示关联问题
  // 
  showRelatedQuestions: boolean;
  // 关联问题自定义prompt
  // 
  relatedQuestionPrompt: string;
  // 额外信息 ，Map<String, Object>
  extraInfo: string;
  // extra_info (额外信息) 字段的json形式，格式为：Map<String, Object>
  extraInfoJson: string;
  // 交互类型 VOICE / AVATAR / VIDEO
  // 
  interactionType: string;
  // 音色
  // 
  voice: string;
  // agent模型版本 {model}/{version}#{adapter} (deprecated)
  // 
  model: string;
  // Agent模型配置表
  // 
  modelList: AgentModelParams[];
  // Agent关联知识库ID列表
  // 
  refLibraryIds: string[];
  // Agent关联插件信息表, key为插件主键id, value为信息
  // 
  refPlugins: AgentRefPluginInfo[];
  // 关联的mcpServer
  // 
  refMcpServers: AgentRefPluginInfo[];
  // 隶属multi-agent的sub agents
  // 
  subAgents: SubAgentInfo[];
  // Agent关联workflow信息表, key为intent wutong id, value为信息
  // 
  refWorkflows: AgentRefPluginInfo[];
  // 关联卡片id列表
  // 
  refCardIds: string[];
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      uniqueCode: 'unique_code',
      name: 'name',
      agentVersion: 'agent_version',
      type: 'type',
      description: 'description',
      creator: 'creator',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      secConfig: 'sec_config',
      welcome: 'welcome',
      showRelatedQuestions: 'show_related_questions',
      relatedQuestionPrompt: 'related_question_prompt',
      extraInfo: 'extra_info',
      extraInfoJson: 'extra_info_json',
      interactionType: 'interaction_type',
      voice: 'voice',
      model: 'model',
      modelList: 'model_list',
      refLibraryIds: 'ref_library_ids',
      refPlugins: 'ref_plugins',
      refMcpServers: 'ref_mcp_servers',
      subAgents: 'sub_agents',
      refWorkflows: 'ref_workflows',
      refCardIds: 'ref_card_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      uniqueCode: 'string',
      name: 'string',
      agentVersion: 'string',
      type: 'string',
      description: 'string',
      creator: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      secConfig: AgentSecConfig,
      welcome: 'string',
      showRelatedQuestions: 'boolean',
      relatedQuestionPrompt: 'string',
      extraInfo: 'string',
      extraInfoJson: 'string',
      interactionType: 'string',
      voice: 'string',
      model: 'string',
      modelList: { 'type': 'array', 'itemType': AgentModelParams },
      refLibraryIds: { 'type': 'array', 'itemType': 'string' },
      refPlugins: { 'type': 'array', 'itemType': AgentRefPluginInfo },
      refMcpServers: { 'type': 'array', 'itemType': AgentRefPluginInfo },
      subAgents: { 'type': 'array', 'itemType': SubAgentInfo },
      refWorkflows: { 'type': 'array', 'itemType': AgentRefPluginInfo },
      refCardIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// MyMCP page分页内容信息
export class DigitalGatewayMCPPageVO extends $tea.Model {
  // 空间id
  spaceId: string;
  // server_id
  serverId: string;
  // server_code
  serverCode: string;
  // server_name
  serverName: string;
  // icon
  icon: string;
  // description
  description: string;
  //  mcp分类
  categories: string[];
  static names(): { [key: string]: string } {
    return {
      spaceId: 'space_id',
      serverId: 'server_id',
      serverCode: 'server_code',
      serverName: 'server_name',
      icon: 'icon',
      description: 'description',
      categories: 'categories',
    };
  }

  static types(): { [key: string]: any } {
    return {
      spaceId: 'string',
      serverId: 'string',
      serverCode: 'string',
      serverName: 'string',
      icon: 'string',
      description: 'string',
      categories: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 根据sessionId查询历史对话信息
export class DisplaySingleSessionHistoryVO extends $tea.Model {
  // 展示内容列表，入参和出参放在一起，方便前端展示
  contentList: DisplayResponseContent[];
  static names(): { [key: string]: string } {
    return {
      contentList: 'content_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      contentList: { 'type': 'array', 'itemType': DisplayResponseContent },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 知识库-任务列表对象
export class ContentTask extends $tea.Model {
  // 任务ID
  id: number;
  // 任务名称
  taskName: string;
  // 任务类型
  taskType: string;
  // 任务状态:
  status: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      taskName: 'task_name',
      taskType: 'task_type',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      taskName: 'string',
      taskType: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 异常对象
export class BizErrorInfo extends $tea.Model {
  // code
  code: string;
  // 异常信息
  errorMsg?: string;
  // params
  params?: string;
  static names(): { [key: string]: string } {
    return {
      code: 'code',
      errorMsg: 'error_msg',
      params: 'params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      code: 'string',
      errorMsg: 'string',
      params: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 我的MCP详情VO
export class DigitalGatewayMCPDetailVO extends $tea.Model {
  // server_host
  serverHost: string;
  // server请求协议
  transportProtocol: string;
  // 网关请求令牌
  serverToken: string;
  // 空间id
  spaceId: string;
  // server_id
  serverId: string;
  // server_code
  serverCode: string;
  // server名称
  serverName: string;
  // icon
  icon: string;
  // server描述
  description: string;
  // mcp上架信息（富文本）
  docs: string;
  // 工具列表
  toolList: ToolInfoVO[];
  static names(): { [key: string]: string } {
    return {
      serverHost: 'server_host',
      transportProtocol: 'transport_protocol',
      serverToken: 'server_token',
      spaceId: 'space_id',
      serverId: 'server_id',
      serverCode: 'server_code',
      serverName: 'server_name',
      icon: 'icon',
      description: 'description',
      docs: 'docs',
      toolList: 'tool_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      serverHost: 'string',
      transportProtocol: 'string',
      serverToken: 'string',
      spaceId: 'string',
      serverId: 'string',
      serverCode: 'string',
      serverName: 'string',
      icon: 'string',
      description: 'string',
      docs: 'string',
      toolList: { 'type': 'array', 'itemType': ToolInfoVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 知识库-文档列表-文档分页对象
export class ContentFile extends $tea.Model {
  // 文档所属知识库ID
  libraryId?: number;
  // 文档ID
  id?: number;
  // 文档文件名
  name?: string;
  // 文档类型
  typ?: string;
  // 文档标签列表
  tagList?: string[];
  // 发布状态
  publishStatus?: string;
  static names(): { [key: string]: string } {
    return {
      libraryId: 'library_id',
      id: 'id',
      name: 'name',
      typ: 'typ',
      tagList: 'tag_list',
      publishStatus: 'publish_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      libraryId: 'number',
      id: 'number',
      name: 'string',
      typ: 'string',
      tagList: { 'type': 'array', 'itemType': 'string' },
      publishStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// StringResult
export class StringResult extends $tea.Model {
  // success
  success: boolean;
  // code
  code: string;
  // msg
  msg: string;
  // trace_id
  traceId: string;
  // req_id
  reqId: string;
  // 接口返回值
  result: string;
  static names(): { [key: string]: string } {
    return {
      success: 'success',
      code: 'code',
      msg: 'msg',
      traceId: 'trace_id',
      reqId: 'req_id',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      success: 'boolean',
      code: 'string',
      msg: 'string',
      traceId: 'string',
      reqId: 'string',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 查看会话的历史会话信息result
export class AgentChatHistoryForSessionIdResult extends $tea.Model {
  // success
  success: boolean;
  // code
  code: string;
  // msg
  msg: string;
  // trace_id
  traceId: string;
  // req_id
  reqId: string;
  // 对话历史
  // 
  result: DisplaySingleSessionHistoryVO;
  static names(): { [key: string]: string } {
    return {
      success: 'success',
      code: 'code',
      msg: 'msg',
      traceId: 'trace_id',
      reqId: 'req_id',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      success: 'boolean',
      code: 'string',
      msg: 'string',
      traceId: 'string',
      reqId: 'string',
      result: DisplaySingleSessionHistoryVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Agent查询对话列表,Result
export class AgentChatHistoryPreviewListResult extends $tea.Model {
  // 请求处理结果
  // 
  success: boolean;
  // 返回结果编码
  // 
  code: string;
  // 返回结果信息
  // 
  msg: string;
  // trace_id
  traceId: string;
  // req_id
  reqId: string;
  // 对话历史
  result: AgentChatHistoryPreviewVO;
  static names(): { [key: string]: string } {
    return {
      success: 'success',
      code: 'code',
      msg: 'msg',
      traceId: 'trace_id',
      reqId: 'req_id',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      success: 'boolean',
      code: 'string',
      msg: 'string',
      traceId: 'string',
      reqId: 'string',
      result: AgentChatHistoryPreviewVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 知识库-任务列表result
export class LibraryContentTaskPageResult extends $tea.Model {
  // 请求处理结果标识
  success: boolean;
  // 业务状态码
  code: string;
  // 返回消息
  message: string;
  // 请求链路追踪ID
  traceId: string;
  // 符合查询条件的总记录数
  totalCount: number;
  // 当前返回数据的页码
  currentPage: number;
  // 实际返回的每页记录数
  pageSize: number;
  // 任务数据列表
  result: ContentTask[];
  static names(): { [key: string]: string } {
    return {
      success: 'success',
      code: 'code',
      message: 'message',
      traceId: 'trace_id',
      totalCount: 'total_count',
      currentPage: 'current_page',
      pageSize: 'page_size',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      success: 'boolean',
      code: 'string',
      message: 'string',
      traceId: 'string',
      totalCount: 'number',
      currentPage: 'number',
      pageSize: 'number',
      result: { 'type': 'array', 'itemType': ContentTask },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 知识库文件上传响应Result
export class LibraryUploadFileResult extends $tea.Model {
  // 请求处理结果标识
  success: boolean;
  // 业务状态码
  code: string;
  // 返回消息
  message: string;
  // 请求链路追踪ID
  traceId: string;
  // 文件上传响应对象
  result: UploadAttachmentFileVO;
  static names(): { [key: string]: string } {
    return {
      success: 'success',
      code: 'code',
      message: 'message',
      traceId: 'trace_id',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      success: 'boolean',
      code: 'string',
      message: 'string',
      traceId: 'string',
      result: UploadAttachmentFileVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 我订阅的MCP分页对象
export class MyMcpPageRestult extends $tea.Model {
  // total_count
  totalCount: number;
  // current_page
  currentPage: number;
  // trace_id
  traceId: string;
  // success
  success: boolean;
  // code
  code: string;
  // msg
  msg: string;
  // req_id
  reqId: string;
  // MCP分页内容
  result: DigitalGatewayMCPPageVO[];
  static names(): { [key: string]: string } {
    return {
      totalCount: 'total_count',
      currentPage: 'current_page',
      traceId: 'trace_id',
      success: 'success',
      code: 'code',
      msg: 'msg',
      reqId: 'req_id',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      totalCount: 'number',
      currentPage: 'number',
      traceId: 'string',
      success: 'boolean',
      code: 'string',
      msg: 'string',
      reqId: 'string',
      result: { 'type': 'array', 'itemType': DigitalGatewayMCPPageVO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 简单返回类
export class SimpleResult extends $tea.Model {
  // success
  success: boolean;
  // 返回结果编码 “ok”
  code: string;
  // 返回结果信息
  msg: string;
  // trace_id
  traceId: string;
  // req_id
  reqId: string;
  static names(): { [key: string]: string } {
    return {
      success: 'success',
      code: 'code',
      msg: 'msg',
      traceId: 'trace_id',
      reqId: 'req_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      success: 'boolean',
      code: 'string',
      msg: 'string',
      traceId: 'string',
      reqId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 知识库-文档-切片result对象
export class LibraryDocBatchSplitResult extends $tea.Model {
  // 请求是否成功
  success: boolean;
  // 业务状态码
  code: string;
  // 返回消息
  message: string;
  // 请求链路追踪ID
  traceId: string;
  // 任务ID，可用于异步任务追踪
  result: number;
  static names(): { [key: string]: string } {
    return {
      success: 'success',
      code: 'code',
      message: 'message',
      traceId: 'trace_id',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      success: 'boolean',
      code: 'string',
      message: 'string',
      traceId: 'string',
      result: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 知识库-文档切片-文件信息
export class FileReq extends $tea.Model {
  // 导入文件地址
  url: string;
  // 文件名称
  fileName: string;
  // 文件类型，不设置使用全局类型
  fileType: string;
  // 文件标签列表（用于AI参考）
  tagList?: string[];
  static names(): { [key: string]: string } {
    return {
      url: 'url',
      fileName: 'file_name',
      fileType: 'file_type',
      tagList: 'tag_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      url: 'string',
      fileName: 'string',
      fileType: 'string',
      tagList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// MCP详情查询返回Result对象
export class MCPDetailCommonResult extends $tea.Model {
  // MCP详情信息
  result: DigitalGatewayMCPDetailVO;
  // success
  success: boolean;
  // code
  code: string;
  // msg
  msg: string;
  // trace_id
  traceId: string;
  // req_id
  reqId: string;
  // 异常对象
  bizError: BizErrorInfo;
  static names(): { [key: string]: string } {
    return {
      result: 'result',
      success: 'success',
      code: 'code',
      msg: 'msg',
      traceId: 'trace_id',
      reqId: 'req_id',
      bizError: 'biz_error',
    };
  }

  static types(): { [key: string]: any } {
    return {
      result: DigitalGatewayMCPDetailVO,
      success: 'boolean',
      code: 'string',
      msg: 'string',
      traceId: 'string',
      reqId: 'string',
      bizError: BizErrorInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 删除Agent会话 Result
export class DeleteSessionFromAgentChatHistoryResult extends $tea.Model {
  // success
  success: boolean;
  // code
  code: string;
  // 返回结果信息
  // 
  msg: string;
  // trace_id
  traceId: string;
  // req_id
  reqId: string;
  static names(): { [key: string]: string } {
    return {
      success: 'success',
      code: 'code',
      msg: 'msg',
      traceId: 'trace_id',
      reqId: 'req_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      success: 'boolean',
      code: 'string',
      msg: 'string',
      traceId: 'string',
      reqId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Agent对话-上传文件 Result
export class UploadAttachmentFileResult extends $tea.Model {
  // success
  success: boolean;
  // code
  code: string;
  // msg
  msg: string;
  // trace_id
  traceId: string;
  // req_id
  reqId: string;
  // 上传解析结果
  // 
  result: UploadAttachmentFileVO;
  static names(): { [key: string]: string } {
    return {
      success: 'success',
      code: 'code',
      msg: 'msg',
      traceId: 'trace_id',
      reqId: 'req_id',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      success: 'boolean',
      code: 'string',
      msg: 'string',
      traceId: 'string',
      reqId: 'string',
      result: UploadAttachmentFileVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// MCP已订阅清单Request
export class MCPServerQueryPageGatewayRequest extends $tea.Model {
  // 空间id
  spaceId: string;
  // 运行模式
  runMode?: string;
  // 来源
  source?: string;
  // 查询条件
  query?: string;
  // 页码
  pageNum: number;
  // 分页大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      spaceId: 'space_id',
      runMode: 'run_mode',
      source: 'source',
      query: 'query',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      spaceId: 'string',
      runMode: 'string',
      source: 'string',
      query: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 获取 Agent 详情 Result
export class AgentDtailResult extends $tea.Model {
  // success
  success: boolean;
  // code
  code: string;
  // msg
  msg: string;
  // trace_id
  traceId: string;
  // req_id
  reqId: string;
  // 返回结果
  // 
  result: AgentVO;
  static names(): { [key: string]: string } {
    return {
      success: 'success',
      code: 'code',
      msg: 'msg',
      traceId: 'trace_id',
      reqId: 'req_id',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      success: 'boolean',
      code: 'string',
      msg: 'string',
      traceId: 'string',
      reqId: 'string',
      result: AgentVO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 知识库-文档列表-分页对象
export class LibraryDocPageResult extends $tea.Model {
  // 请求处理结果标识
  success: boolean;
  // 业务状态码
  code: string;
  // 返回消息
  message: string;
  // 请求链路追踪ID
  traceId: string;
  // 符合查询条件的总记录数
  totalCount: number;
  // 当前返回数据的页码
  currentPage: number;
  // 分页大小
  pageSize: number;
  // 文档数据列表
  result: ContentFile[];
  static names(): { [key: string]: string } {
    return {
      success: 'success',
      code: 'code',
      message: 'message',
      traceId: 'trace_id',
      totalCount: 'total_count',
      currentPage: 'current_page',
      pageSize: 'page_size',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      success: 'boolean',
      code: 'string',
      message: 'string',
      traceId: 'string',
      totalCount: 'number',
      currentPage: 'number',
      pageSize: 'number',
      result: { 'type': 'array', 'itemType': ContentFile },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 键值对
export class XNameValuePair extends $tea.Model {
  // 键名
  name: string;
  // 键值
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

export class StartOpenaiChatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 参数内容为 ChatCompletionRequest 的 JSON 字符串
  chatCompletionRequest: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chatCompletionRequest: 'chat_completion_request',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chatCompletionRequest: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartOpenaiChatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 会话结果
  chatCompletionObject?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      chatCompletionObject: 'chat_completion_object',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      chatCompletionObject: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartAgentChatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求内容，内容为 AgentChatReq 对象的json字符串
  agentChatRequest: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      agentChatRequest: 'agent_chat_request',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      agentChatRequest: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartAgentChatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 会话结果
  chatCompletionObject?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      chatCompletionObject: 'chat_completion_object',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      chatCompletionObject: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartAgentCchatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求内容，内容为 AgentChatReq 对象的json字符串
  agentChatRequest: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      agentChatRequest: 'agent_chat_request',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      agentChatRequest: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartAgentCchatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 会话结果
  chatCompletionObject?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      chatCompletionObject: 'chat_completion_object',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      chatCompletionObject: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadAlipayLibraryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件id
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadAlipayLibraryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // result
  data?: LibraryUploadFileResult;
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
      data: LibraryUploadFileResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadAlipayAgentchatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // fileId
  fileObject?: Readable;
  fileObjectName?: string;
  fileId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadAlipayAgentchatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: UploadAttachmentFileResult;
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
      data: UploadAttachmentFileResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryMcpMymcpRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 空间ID
  spaceId: string;
  // 查询条件
  query?: string;
  // 页码
  pageNum: number;
  // 分页大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      spaceId: 'space_id',
      query: 'query',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      spaceId: 'string',
      query: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryMcpMymcpResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // MyMCP分页对象
  data?: MyMcpPageRestult;
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
      data: MyMcpPageRestult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailMcpMymcpRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 空间id
  spaceId: string;
  // 平台serverId
  serverId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      spaceId: 'space_id',
      serverId: 'server_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      spaceId: 'string',
      serverId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailMcpMymcpResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // MCP详情接口返回Result
  data?: MCPDetailCommonResult;
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
      data: MCPDetailCommonResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListLibraryDocRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识库ID
  libraryId: number;
  // 文档标题模糊匹配
  title?: string;
  // 当前页
  pageNum?: number;
  // 分页大小
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      libraryId: 'library_id',
      title: 'title',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      libraryId: 'number',
      title: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListLibraryDocResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 响应体
  data?: LibraryDocPageResult;
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
      data: LibraryDocPageResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListLibraryTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识库ID
  libraryId: number;
  // 任务类型列表
  taskType?: string[];
  // 任务ID
  taskId?: number;
  // 页码
  pageNum?: string;
  // 分页大小
  pageSize?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      libraryId: 'library_id',
      taskType: 'task_type',
      taskId: 'task_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      libraryId: 'number',
      taskType: { 'type': 'array', 'itemType': 'string' },
      taskId: 'number',
      pageNum: 'string',
      pageSize: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListLibraryTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 知识库-任务列表result
  data?: LibraryContentTaskPageResult;
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
      data: LibraryContentTaskPageResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecLibraryDocsplitRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识库ID
  libraryId: number;
  // 使用的切分器名称
  splitter: string;
  // 切片类型
  sectionType: string;
  // 切分字数（智能分片/按规则分片）
  chunkSize: number;
  // 块之间的最大重叠字符数（智能分片）
  chunkOverlap: number;
  // 最小标题级别，0为全部拍平（智能分片）
  minLeve?: number;
  // 自定义切分规则正则表达式（按规则分片）
  regex: string;
  // 任务名称
  taskName: string;
  // 文件信息列表
  files: FileReq[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      libraryId: 'library_id',
      splitter: 'splitter',
      sectionType: 'section_type',
      chunkSize: 'chunk_size',
      chunkOverlap: 'chunk_overlap',
      minLeve: 'min_leve',
      regex: 'regex',
      taskName: 'task_name',
      files: 'files',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      libraryId: 'number',
      splitter: 'string',
      sectionType: 'string',
      chunkSize: 'number',
      chunkOverlap: 'number',
      minLeve: 'number',
      regex: 'string',
      taskName: 'string',
      files: { 'type': 'array', 'itemType': FileReq },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecLibraryDocsplitResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: LibraryDocBatchSplitResult;
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
      data: LibraryDocBatchSplitResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAgentChatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // agentCode
  agentCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      agentCode: 'agent_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      agentCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAgentChatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: AgentChatHistoryPreviewListResult;
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
      data: AgentChatHistoryPreviewListResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailAgentChatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // agent_code
  agentCode: string;
  // session_id
  sessionId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      agentCode: 'agent_code',
      sessionId: 'session_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      agentCode: 'string',
      sessionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailAgentChatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: AgentChatHistoryForSessionIdResult;
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
      data: AgentChatHistoryForSessionIdResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAgentChatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // agent_code
  agentCode: string;
  // session 主键ID
  id: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      agentCode: 'agent_code',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      agentCode: 'string',
      id: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAgentChatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: DeleteSessionFromAgentChatHistoryResult;
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
      data: DeleteSessionFromAgentChatHistoryResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAgentChatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // chat id
  // 
  chatId: string;
  // session_id
  sessionId: string;
  // 用户反馈[up_vote, down_vote, cancel_up, cancel_down]
  // 
  userFeedback: string;
  // 用户建议
  // 
  userFeedRemark?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chatId: 'chat_id',
      sessionId: 'session_id',
      userFeedback: 'user_feedback',
      userFeedRemark: 'user_feed_remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chatId: 'string',
      sessionId: 'string',
      userFeedback: 'string',
      userFeedRemark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAgentChatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: SimpleResult;
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
      data: SimpleResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailAgentInfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // agent主键ID
  id: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailAgentInfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: AgentDtailResult;
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
      data: AgentDtailResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StopAgentChatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // chat_id
  chatId: string;
  // agent_id
  agentId: string;
  // 会话ID，非必填，拓展用
  sessionId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chatId: 'chat_id',
      agentId: 'agent_id',
      sessionId: 'session_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chatId: 'string',
      agentId: 'string',
      sessionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StopAgentChatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: SimpleResult;
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
      data: SimpleResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadAgentPortalchatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // fileId
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadAgentPortalchatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: UploadAttachmentFileResult;
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
      data: UploadAttachmentFileResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DownloadLibraryDocRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 知识库ID
  libraryId: number;
  // 文档ID
  docId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      libraryId: 'library_id',
      docId: 'doc_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      libraryId: 'number',
      docId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DownloadLibraryDocResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: StringResult;
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
      data: StringResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadSaasLibraryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件ID
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadSaasLibraryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文件上传响应
  data?: LibraryUploadFileResult;
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
      data: LibraryUploadFileResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadSaasAgentchatRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // fileId
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadSaasAgentchatResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: UploadAttachmentFileResult;
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
      data: UploadAttachmentFileResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartAgentTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求内容，内容为 TaskChatReq 对象的json字符串
  taskChatReq: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskChatReq: 'task_chat_req',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskChatReq: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartAgentTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 会话结果
  chatCompletionObject?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      chatCompletionObject: 'chat_completion_object',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      chatCompletionObject: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StopAgentTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求内容，内容为 task_event_req 对象的json字符串
  taskEventReq: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskEventReq: 'task_event_req',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskEventReq: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StopAgentTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // success
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

export class OperateAgentTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求内容，内容为 task_event_req 对象的json字符串
  taskEventReq: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskEventReq: 'task_event_req',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskEventReq: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateAgentTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 会话结果
  // 
  taskMessages?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskMessages: 'task_messages',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskMessages: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntcloudGatewayxFileUploadRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  // 上传文件作用的openapi method
  apiCode: string;
  // 文件标签，多个标签;分割
  fileLabel?: string;
  // 自定义的文件元数据
  fileMetadata?: string;
  // 文件名，不传则随机生成文件名
  fileName?: string;
  // 文件的多媒体类型
  mimeType?: string;
  // 产品方的api归属集群，即productInstanceId
  apiCluster?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      apiCode: 'api_code',
      fileLabel: 'file_label',
      fileMetadata: 'file_metadata',
      fileName: 'file_name',
      mimeType: 'mime_type',
      apiCluster: 'api_cluster',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      apiCode: 'string',
      fileLabel: 'string',
      fileMetadata: 'string',
      fileName: 'string',
      mimeType: 'string',
      apiCluster: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAntcloudGatewayxFileUploadResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 上传有效期
  expiredTime?: string;
  // 32位文件唯一id
  fileId?: string;
  // 放入http请求头里
  uploadHeaders?: XNameValuePair[];
  // 文件上传地址
  uploadUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      expiredTime: 'expired_time',
      fileId: 'file_id',
      uploadHeaders: 'upload_headers',
      uploadUrl: 'upload_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      expiredTime: 'string',
      fileId: 'string',
      uploadHeaders: { 'type': 'array', 'itemType': XNameValuePair },
      uploadUrl: 'string',
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
          sdk_version: "3.0.2",
          _prod_code: "DTAIAGT",
          _prod_channel: "default",
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
   * Description: 大模型流式/同步对话接口
   * Summary: 大模型流式/同步对话接口
   */
  async startOpenaiChat(request: StartOpenaiChatRequest): Promise<StartOpenaiChatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startOpenaiChatEx(request, headers, runtime);
  }

  /**
   * Description: 大模型流式/同步对话接口
   * Summary: 大模型流式/同步对话接口
   */
  async startOpenaiChatEx(request: StartOpenaiChatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartOpenaiChatResponse> {
    Util.validateModel(request);
    return $tea.cast<StartOpenaiChatResponse>(await this.doRequest("1.0", "antdigital.dtaiagt.openai.chat.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartOpenaiChatResponse({}));
  }

  /**
   * Description: 智能体流式对话接口
   * Summary: 智能体流式对话接口
   */
  async startAgentChat(request: StartAgentChatRequest): Promise<StartAgentChatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startAgentChatEx(request, headers, runtime);
  }

  /**
   * Description: 智能体流式对话接口
   * Summary: 智能体流式对话接口
   */
  async startAgentChatEx(request: StartAgentChatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartAgentChatResponse> {
    Util.validateModel(request);
    return $tea.cast<StartAgentChatResponse>(await this.doRequest("1.0", "antdigital.dtaiagt.agent.chat.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartAgentChatResponse({}));
  }

  /**
   * Description: 智能体同步对话接口
   * Summary: 智能体同步对话接口
   */
  async startAgentCchat(request: StartAgentCchatRequest): Promise<StartAgentCchatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startAgentCchatEx(request, headers, runtime);
  }

  /**
   * Description: 智能体同步对话接口
   * Summary: 智能体同步对话接口
   */
  async startAgentCchatEx(request: StartAgentCchatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartAgentCchatResponse> {
    Util.validateModel(request);
    return $tea.cast<StartAgentCchatResponse>(await this.doRequest("1.0", "antdigital.dtaiagt.agent.cchat.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartAgentCchatResponse({}));
  }

  /**
   * Description: 主站-知识库文件上传
   * Summary: 主站-知识库文件上传
   */
  async uploadAlipayLibrary(request: UploadAlipayLibraryRequest): Promise<UploadAlipayLibraryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadAlipayLibraryEx(request, headers, runtime);
  }

  /**
   * Description: 主站-知识库文件上传
   * Summary: 主站-知识库文件上传
   */
  async uploadAlipayLibraryEx(request: UploadAlipayLibraryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadAlipayLibraryResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antdigital.dtaiagt.alipay.library.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadAlipayLibraryResponse = new UploadAlipayLibraryResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadAlipayLibraryResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<UploadAlipayLibraryResponse>(await this.doRequest("1.0", "antdigital.dtaiagt.alipay.library.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadAlipayLibraryResponse({}));
  }

  /**
   * Description: 主站-Agent对话-上传文件
   * Summary: 主站-Agent对话-上传文件
   */
  async uploadAlipayAgentchat(request: UploadAlipayAgentchatRequest): Promise<UploadAlipayAgentchatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadAlipayAgentchatEx(request, headers, runtime);
  }

  /**
   * Description: 主站-Agent对话-上传文件
   * Summary: 主站-Agent对话-上传文件
   */
  async uploadAlipayAgentchatEx(request: UploadAlipayAgentchatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadAlipayAgentchatResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antdigital.dtaiagt.alipay.agentchat.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadAlipayAgentchatResponse = new UploadAlipayAgentchatResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadAlipayAgentchatResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<UploadAlipayAgentchatResponse>(await this.doRequest("1.0", "antdigital.dtaiagt.alipay.agentchat.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadAlipayAgentchatResponse({}));
  }

  /**
   * Description: 查询已订阅的mcp清单
   * Summary: 查询已订阅的mcp清单
   */
  async pagequeryMcpMymcp(request: PagequeryMcpMymcpRequest): Promise<PagequeryMcpMymcpResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryMcpMymcpEx(request, headers, runtime);
  }

  /**
   * Description: 查询已订阅的mcp清单
   * Summary: 查询已订阅的mcp清单
   */
  async pagequeryMcpMymcpEx(request: PagequeryMcpMymcpRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryMcpMymcpResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryMcpMymcpResponse>(await this.doRequest("1.0", "antdigital.dtaiagt.mcp.mymcp.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryMcpMymcpResponse({}));
  }

  /**
   * Description: mcp详情
   * Summary: mcp详情
   */
  async detailMcpMymcp(request: DetailMcpMymcpRequest): Promise<DetailMcpMymcpResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailMcpMymcpEx(request, headers, runtime);
  }

  /**
   * Description: mcp详情
   * Summary: mcp详情
   */
  async detailMcpMymcpEx(request: DetailMcpMymcpRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailMcpMymcpResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailMcpMymcpResponse>(await this.doRequest("1.0", "antdigital.dtaiagt.mcp.mymcp.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailMcpMymcpResponse({}));
  }

  /**
   * Description: 知识库-文档分页查询
   * Summary: 知识库-文档分页查询
   */
  async listLibraryDoc(request: ListLibraryDocRequest): Promise<ListLibraryDocResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listLibraryDocEx(request, headers, runtime);
  }

  /**
   * Description: 知识库-文档分页查询
   * Summary: 知识库-文档分页查询
   */
  async listLibraryDocEx(request: ListLibraryDocRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListLibraryDocResponse> {
    Util.validateModel(request);
    return $tea.cast<ListLibraryDocResponse>(await this.doRequest("1.0", "antdigital.dtaiagt.library.doc.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListLibraryDocResponse({}));
  }

  /**
   * Description: 知识库-任务列表
   * Summary: 知识库-任务列表
   */
  async listLibraryTask(request: ListLibraryTaskRequest): Promise<ListLibraryTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listLibraryTaskEx(request, headers, runtime);
  }

  /**
   * Description: 知识库-任务列表
   * Summary: 知识库-任务列表
   */
  async listLibraryTaskEx(request: ListLibraryTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListLibraryTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<ListLibraryTaskResponse>(await this.doRequest("1.0", "antdigital.dtaiagt.library.task.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListLibraryTaskResponse({}));
  }

  /**
   * Description: 知识库-文档切片
   * Summary: 知识库-文档切片
   */
  async execLibraryDocsplit(request: ExecLibraryDocsplitRequest): Promise<ExecLibraryDocsplitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execLibraryDocsplitEx(request, headers, runtime);
  }

  /**
   * Description: 知识库-文档切片
   * Summary: 知识库-文档切片
   */
  async execLibraryDocsplitEx(request: ExecLibraryDocsplitRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecLibraryDocsplitResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecLibraryDocsplitResponse>(await this.doRequest("1.0", "antdigital.dtaiagt.library.docsplit.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecLibraryDocsplitResponse({}));
  }

  /**
   * Description: 查询Agent历史会话列表
   * Summary: 查询Agent历史会话列表
   */
  async listAgentChat(request: ListAgentChatRequest): Promise<ListAgentChatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAgentChatEx(request, headers, runtime);
  }

  /**
   * Description: 查询Agent历史会话列表
   * Summary: 查询Agent历史会话列表
   */
  async listAgentChatEx(request: ListAgentChatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAgentChatResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAgentChatResponse>(await this.doRequest("1.0", "antdigital.dtaiagt.agent.chat.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAgentChatResponse({}));
  }

  /**
   * Description: 查看Agent历史会话详情
   * Summary: 查看Agent历史会话详情
   */
  async detailAgentChat(request: DetailAgentChatRequest): Promise<DetailAgentChatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailAgentChatEx(request, headers, runtime);
  }

  /**
   * Description: 查看Agent历史会话详情
   * Summary: 查看Agent历史会话详情
   */
  async detailAgentChatEx(request: DetailAgentChatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailAgentChatResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailAgentChatResponse>(await this.doRequest("1.0", "antdigital.dtaiagt.agent.chat.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailAgentChatResponse({}));
  }

  /**
   * Description: 删除Agent会话
   * Summary: 删除Agent会话
   */
  async deleteAgentChat(request: DeleteAgentChatRequest): Promise<DeleteAgentChatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteAgentChatEx(request, headers, runtime);
  }

  /**
   * Description: 删除Agent会话
   * Summary: 删除Agent会话
   */
  async deleteAgentChatEx(request: DeleteAgentChatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteAgentChatResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteAgentChatResponse>(await this.doRequest("1.0", "antdigital.dtaiagt.agent.chat.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteAgentChatResponse({}));
  }

  /**
   * Description: Agent对话-点赞点踩反馈&删除消息评价
   * Summary: Agent对话-赞/踩反馈&删除消息评价
   */
  async updateAgentChat(request: UpdateAgentChatRequest): Promise<UpdateAgentChatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAgentChatEx(request, headers, runtime);
  }

  /**
   * Description: Agent对话-点赞点踩反馈&删除消息评价
   * Summary: Agent对话-赞/踩反馈&删除消息评价
   */
  async updateAgentChatEx(request: UpdateAgentChatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAgentChatResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAgentChatResponse>(await this.doRequest("1.0", "antdigital.dtaiagt.agent.chat.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAgentChatResponse({}));
  }

  /**
   * Description: 获取 Agent 详情
   * Summary: 获取 Agent 详情
   */
  async detailAgentInfo(request: DetailAgentInfoRequest): Promise<DetailAgentInfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailAgentInfoEx(request, headers, runtime);
  }

  /**
   * Description: 获取 Agent 详情
   * Summary: 获取 Agent 详情
   */
  async detailAgentInfoEx(request: DetailAgentInfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailAgentInfoResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailAgentInfoResponse>(await this.doRequest("1.0", "antdigital.dtaiagt.agent.info.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailAgentInfoResponse({}));
  }

  /**
   * Description: Agent停止对话
   * Summary: Agent停止对话
   */
  async stopAgentChat(request: StopAgentChatRequest): Promise<StopAgentChatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.stopAgentChatEx(request, headers, runtime);
  }

  /**
   * Description: Agent停止对话
   * Summary: Agent停止对话
   */
  async stopAgentChatEx(request: StopAgentChatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StopAgentChatResponse> {
    Util.validateModel(request);
    return $tea.cast<StopAgentChatResponse>(await this.doRequest("1.0", "antdigital.dtaiagt.agent.chat.stop", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StopAgentChatResponse({}));
  }

  /**
   * Description: Agent对话-上传文件
   * Summary: Agent对话-上传文件
   */
  async uploadAgentPortalchat(request: UploadAgentPortalchatRequest): Promise<UploadAgentPortalchatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadAgentPortalchatEx(request, headers, runtime);
  }

  /**
   * Description: Agent对话-上传文件
   * Summary: Agent对话-上传文件
   */
  async uploadAgentPortalchatEx(request: UploadAgentPortalchatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadAgentPortalchatResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antdigital.dtaiagt.agent.portalchat.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadAgentPortalchatResponse = new UploadAgentPortalchatResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadAgentPortalchatResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<UploadAgentPortalchatResponse>(await this.doRequest("1.0", "antdigital.dtaiagt.agent.portalchat.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadAgentPortalchatResponse({}));
  }

  /**
   * Description: 知识库-文档库-文档下载
   * Summary: 知识库-文档库-文档下载
   */
  async downloadLibraryDoc(request: DownloadLibraryDocRequest): Promise<DownloadLibraryDocResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.downloadLibraryDocEx(request, headers, runtime);
  }

  /**
   * Description: 知识库-文档库-文档下载
   * Summary: 知识库-文档库-文档下载
   */
  async downloadLibraryDocEx(request: DownloadLibraryDocRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DownloadLibraryDocResponse> {
    Util.validateModel(request);
    return $tea.cast<DownloadLibraryDocResponse>(await this.doRequest("1.0", "antdigital.dtaiagt.library.doc.download", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DownloadLibraryDocResponse({}));
  }

  /**
   * Description: SAAS-知识库文件上传
   * Summary: SAAS-知识库文件上传
   */
  async uploadSaasLibrary(request: UploadSaasLibraryRequest): Promise<UploadSaasLibraryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadSaasLibraryEx(request, headers, runtime);
  }

  /**
   * Description: SAAS-知识库文件上传
   * Summary: SAAS-知识库文件上传
   */
  async uploadSaasLibraryEx(request: UploadSaasLibraryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadSaasLibraryResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antdigital.dtaiagt.saas.library.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadSaasLibraryResponse = new UploadSaasLibraryResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadSaasLibraryResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<UploadSaasLibraryResponse>(await this.doRequest("1.0", "antdigital.dtaiagt.saas.library.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadSaasLibraryResponse({}));
  }

  /**
   * Description: SAAS-Agent对话-上传文件
   * Summary: SAAS-Agent对话-上传文件
   */
  async uploadSaasAgentchat(request: UploadSaasAgentchatRequest): Promise<UploadSaasAgentchatResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadSaasAgentchatEx(request, headers, runtime);
  }

  /**
   * Description: SAAS-Agent对话-上传文件
   * Summary: SAAS-Agent对话-上传文件
   */
  async uploadSaasAgentchatEx(request: UploadSaasAgentchatRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadSaasAgentchatResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "antdigital.dtaiagt.saas.agentchat.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadSaasAgentchatResponse = new UploadSaasAgentchatResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadSaasAgentchatResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
      request.fileObject = null;
    }

    Util.validateModel(request);
    return $tea.cast<UploadSaasAgentchatResponse>(await this.doRequest("1.0", "antdigital.dtaiagt.saas.agentchat.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadSaasAgentchatResponse({}));
  }

  /**
   * Description: 长任务对话，发起任务&重连任务
   * Summary: 长任务对话
   */
  async startAgentTask(request: StartAgentTaskRequest): Promise<StartAgentTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startAgentTaskEx(request, headers, runtime);
  }

  /**
   * Description: 长任务对话，发起任务&重连任务
   * Summary: 长任务对话
   */
  async startAgentTaskEx(request: StartAgentTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartAgentTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<StartAgentTaskResponse>(await this.doRequest("1.0", "antdigital.dtaiagt.agent.task.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartAgentTaskResponse({}));
  }

  /**
   * Description: 终止任务
   * Summary: 终止任务
   */
  async stopAgentTask(request: StopAgentTaskRequest): Promise<StopAgentTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.stopAgentTaskEx(request, headers, runtime);
  }

  /**
   * Description: 终止任务
   * Summary: 终止任务
   */
  async stopAgentTaskEx(request: StopAgentTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StopAgentTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<StopAgentTaskResponse>(await this.doRequest("1.0", "antdigital.dtaiagt.agent.task.stop", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StopAgentTaskResponse({}));
  }

  /**
   * Description: 获取前序消息流
   * Summary: 获取前序消息流
   */
  async operateAgentTask(request: OperateAgentTaskRequest): Promise<OperateAgentTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateAgentTaskEx(request, headers, runtime);
  }

  /**
   * Description: 获取前序消息流
   * Summary: 获取前序消息流
   */
  async operateAgentTaskEx(request: OperateAgentTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateAgentTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateAgentTaskResponse>(await this.doRequest("1.0", "antdigital.dtaiagt.agent.task.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateAgentTaskResponse({}));
  }

  /**
   * Description: 创建HTTP PUT提交的文件上传
   * Summary: 文件上传创建
   */
  async createAntcloudGatewayxFileUpload(request: CreateAntcloudGatewayxFileUploadRequest): Promise<CreateAntcloudGatewayxFileUploadResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAntcloudGatewayxFileUploadEx(request, headers, runtime);
  }

  /**
   * Description: 创建HTTP PUT提交的文件上传
   * Summary: 文件上传创建
   */
  async createAntcloudGatewayxFileUploadEx(request: CreateAntcloudGatewayxFileUploadRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAntcloudGatewayxFileUploadResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAntcloudGatewayxFileUploadResponse>(await this.doRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAntcloudGatewayxFileUploadResponse({}));
  }

}
