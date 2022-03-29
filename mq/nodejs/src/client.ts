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

// schema元数据对象
export class SchemaMetadataDO extends $tea.Model {
  // app名称
  app: string;
  // 兼容性
  compatibility: string;
  // 坐标依赖
  coordinate: string;
  // 描述
  description: string;
  // 名称
  name: string;
  // 命名空间
  namespace: string;
  // 操作人
  operator: string;
  // 状态
  state: string;
  // 同步站点
  syncSites: string;
  // 租户
  tenant: string;
  // 创建时间
  gmtCreate: number;
  // 修改时间
  gmtModified: number;
  // Schema指定的序列化方式
  serialization: string;
  static names(): { [key: string]: string } {
    return {
      app: 'app',
      compatibility: 'compatibility',
      coordinate: 'coordinate',
      description: 'description',
      name: 'name',
      namespace: 'namespace',
      operator: 'operator',
      state: 'state',
      syncSites: 'sync_sites',
      tenant: 'tenant',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      serialization: 'serialization',
    };
  }

  static types(): { [key: string]: any } {
    return {
      app: 'string',
      compatibility: 'string',
      coordinate: 'string',
      description: 'string',
      name: 'string',
      namespace: 'string',
      operator: 'string',
      state: 'string',
      syncSites: 'string',
      tenant: 'string',
      gmtCreate: 'number',
      gmtModified: 'number',
      serialization: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 切换动作
export class SwitchoverAction extends $tea.Model {
  // 目标单元
  destCell?: string;
  // 来源单元
  sourceCell?: string;
  static names(): { [key: string]: string } {
    return {
      destCell: 'dest_cell',
      sourceCell: 'source_cell',
    };
  }

  static types(): { [key: string]: any } {
    return {
      destCell: 'string',
      sourceCell: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// SofaMQ 资源标签
export class ResourceLabelsDTO extends $tea.Model {
  // 实例 ID（命名空间）
  instanceId: string;
  // 资源类型：TOPIC、GROUP
  resourceType: string;
  // 资源名字
  resourceName: string;
  // 标签
  labels: string[];
  static names(): { [key: string]: string } {
    return {
      instanceId: 'instance_id',
      resourceType: 'resource_type',
      resourceName: 'resource_name',
      labels: 'labels',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instanceId: 'string',
      resourceType: 'string',
      resourceName: 'string',
      labels: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// metedata分页对象
export class SchemaMetadataPageDO extends $tea.Model {
  // Metadata列表内容
  content: SchemaMetadataDO[];
  // 页号
  pageNum: number;
  // 页大小
  pageSize: number;
  // 总个数
  total: number;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      pageNum: 'page_num',
      pageSize: 'page_size',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: { 'type': 'array', 'itemType': SchemaMetadataDO },
      pageNum: 'number',
      pageSize: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 客户端消费记录的明细列表
export class SubClientInfoDTO extends $tea.Model {
  // 消费客户端的客户端地址
  clientHost: string;
  // 本次消费耗时，单位毫秒
  costTime: number;
  // 本次消费的投递轮次
  reconsumeTimes: number;
  // 消费状态。取值说明如下：
  // 
  // CONSUME_FAILED：消费失败
  // CONSUME_SUCCESS：消费成功
  // CONSUME_NOT_RETURN：消费未返回结果
  // SEND_UNKNOWN：事务消息未提交
  // SEND_DELAY：定时(延时)消息定时中
  status: string;
  // 该客户端所属的 Group ID
  subGroupName: string;
  // 消费开始时间戳
  subTime: number;
  static names(): { [key: string]: string } {
    return {
      clientHost: 'client_host',
      costTime: 'cost_time',
      reconsumeTimes: 'reconsume_times',
      status: 'status',
      subGroupName: 'sub_group_name',
      subTime: 'sub_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      clientHost: 'string',
      costTime: 'number',
      reconsumeTimes: 'number',
      status: 'string',
      subGroupName: 'string',
      subTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// UIComponent的内容
export class ComponentContent extends $tea.Model {
  // 文本内容
  content: string;
  // 超链接
  url?: string;
  // 是否粗体
  bold: boolean;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      url: 'url',
      bold: 'bold',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: 'string',
      url: 'string',
      bold: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 列值详情
export class ColumnValue extends $tea.Model {
  // 名称
  name: string;
  // 值
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

// 前端控件中的选择框中每个选项，参见 UIControlModel
export class UIOptionModel extends $tea.Model {
  // 选项展示的中文描述
  display: string;
  // 选项的枚举值
  value: string;
  static names(): { [key: string]: string } {
    return {
      display: 'display',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      display: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Jstack 堆栈信息
export class ThreadTrackDTO extends $tea.Model {
  // 线程名称
  thread: string;
  // Jstack 堆栈信息字符串
  trackList: string[];
  static names(): { [key: string]: string } {
    return {
      thread: 'thread',
      trackList: 'track_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      thread: 'string',
      trackList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订阅关系集合
export class SubscriptionDTO extends $tea.Model {
  // 订阅该 Topic 的子类别 Tag 表达式
  subString: string;
  //  订阅关系版本号，为自增 Long 型
  subVersion: number;
  // 订阅的 Tag 集合
  tagsSet: string[];
  // 订阅的 Topic 名称
  topic: string;
  static names(): { [key: string]: string } {
    return {
      subString: 'sub_string',
      subVersion: 'sub_version',
      tagsSet: 'tags_set',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      subString: 'string',
      subVersion: 'number',
      tagsSet: { 'type': 'array', 'itemType': 'string' },
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 列表元素
export class ItemComponent extends $tea.Model {
  // 内容
  contents: ComponentContent[];
  static names(): { [key: string]: string } {
    return {
      contents: 'contents',
    };
  }

  static types(): { [key: string]: any } {
    return {
      contents: { 'type': 'array', 'itemType': ComponentContent },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 消息属性列表
export class MessagePropertyDTO extends $tea.Model {
  // Key 名
  name: string;
  // 值
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

// 实时状态统计
export class ConsumerRunningDataDTO extends $tea.Model {
  // 堆积量
  diff: number;
  // 每小时内消费失败的消息数统计
  failedCountPerHour: number;
  // 消费消息失败的 TPS 统计
  failedTps: string;
  // 订阅方的 Group ID
  groupId: string;
  // 消费消息成功的 TPS 统计
  okTps: string;
  // 消费 RT 时间，单位 ms
  rt: string;
  // 订阅的 Topic 名称
  topic: string;
  static names(): { [key: string]: string } {
    return {
      diff: 'diff',
      failedCountPerHour: 'failed_count_per_hour',
      failedTps: 'failed_tps',
      groupId: 'group_id',
      okTps: 'ok_tps',
      rt: 'rt',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      diff: 'number',
      failedCountPerHour: 'number',
      failedTps: 'string',
      groupId: 'string',
      okTps: 'string',
      rt: 'string',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 消息的消费轨迹列表
export class SubMapDTO extends $tea.Model {
  // cell name
  cell?: string;
  // 该 Group ID 客户端消费记录的明细列表
  // 
  // 
  clientList: SubClientInfoDTO[];
  // 该 Group ID 消费失败次数统计
  failCount: number;
  // 消费方 Group ID
  subGroupName: string;
  // 该 Group ID 消费成功次数统计
  successCount: number;
  static names(): { [key: string]: string } {
    return {
      cell: 'cell',
      clientList: 'client_list',
      failCount: 'fail_count',
      subGroupName: 'sub_group_name',
      successCount: 'success_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cell: 'string',
      clientList: { 'type': 'array', 'itemType': SubClientInfoDTO },
      failCount: 'number',
      subGroupName: 'string',
      successCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// instance
export class InstanceDTO extends $tea.Model {
  // 集群名
  cluster: string;
  // 创建时间
  gmtCreate: number;
  // 修改时间
  gmtModified: number;
  // 实例ID
  instanceId: string;
  // 实例状态。取值说明如下： 0、部署中 1、已欠费
  instanceStatus: number;
  // 租户id
  tenantId: string;
  // 用户id
  userId: string;
  // workspace名
  workspaceName: string;
  // 数据库id
  id: number;
  static names(): { [key: string]: string } {
    return {
      cluster: 'cluster',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      instanceId: 'instance_id',
      instanceStatus: 'instance_status',
      tenantId: 'tenant_id',
      userId: 'user_id',
      workspaceName: 'workspace_name',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cluster: 'string',
      gmtCreate: 'number',
      gmtModified: 'number',
      instanceId: 'string',
      instanceStatus: 'number',
      tenantId: 'string',
      userId: 'string',
      workspaceName: 'string',
      id: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// SofamqMessageGetByMsgId和SofamqMessageGetByKey接口返回Data信息
export class MessageGetDTO extends $tea.Model {
  // 消息体
  body: string;
  // 消息体 CRC 校验值
  bodyCrc: number;
  // 生成该消息的客户端实例
  bornHost: string;
  //  生成时间戳
  bornTimestamp: number;
  //  实例 ID
  instanceId: string;
  // 消息 ID，即 Message ID
  msgId: string;
  // 消息属性列表
  propertyList: MessagePropertyDTO[];
  //  消息重试消费的次数
  reconsumeTimes: number;
  // 存储该消息的服务器实例
  storeHost: string;
  // 消息大小
  storeSize: number;
  // 被服务端存储的时间戳
  storeTimestamp: number;
  //  消息的 Topic
  topic: string;
  // 消息的SchemaID
  schemaId: string;
  static names(): { [key: string]: string } {
    return {
      body: 'body',
      bodyCrc: 'body_crc',
      bornHost: 'born_host',
      bornTimestamp: 'born_timestamp',
      instanceId: 'instance_id',
      msgId: 'msg_id',
      propertyList: 'property_list',
      reconsumeTimes: 'reconsume_times',
      storeHost: 'store_host',
      storeSize: 'store_size',
      storeTimestamp: 'store_timestamp',
      topic: 'topic',
      schemaId: 'schema_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      body: 'string',
      bodyCrc: 'number',
      bornHost: 'string',
      bornTimestamp: 'number',
      instanceId: 'string',
      msgId: 'string',
      propertyList: { 'type': 'array', 'itemType': MessagePropertyDTO },
      reconsumeTimes: 'number',
      storeHost: 'string',
      storeSize: 'number',
      storeTimestamp: 'number',
      topic: 'string',
      schemaId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 该查询任务的匹配轨迹列表
export class TraceMapDTO extends $tea.Model {
  // 消息发送方的客户端地址
  bornHost: string;
  // 生产端的cell name
  cell?: string;
  // 发送耗时，单位毫秒
  costTime: number;
  // 消息的 ID，即 Message ID
  msgId: string;
  //  消息的 Key ，即 Message Key
  msgKey: string;
  // 发送方客户端配置的 Group ID
  pubGroupName: string;
  // 消息发送时间
  pubTime: number;
  // 发送状态。取值说明如下：
  // 
  // SEND_SUCCESS：发送成功
  // SEND_FAILED：发送失败
  // SEND_ROLLBACK：事务消息回滚
  // SEND_UNKNOWN：事务消息未提交
  // SEND_DELAY：定时(延时)消息定时中
  status: string;
  // 消息的消费轨迹列表
  subList: SubMapDTO[];
  // 消息的 Tag，即 Message Tag
  tag: string;
  // 消息的 Topic
  topic: string;
  static names(): { [key: string]: string } {
    return {
      bornHost: 'born_host',
      cell: 'cell',
      costTime: 'cost_time',
      msgId: 'msg_id',
      msgKey: 'msg_key',
      pubGroupName: 'pub_group_name',
      pubTime: 'pub_time',
      status: 'status',
      subList: 'sub_list',
      tag: 'tag',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bornHost: 'string',
      cell: 'string',
      costTime: 'number',
      msgId: 'string',
      msgKey: 'string',
      pubGroupName: 'string',
      pubTime: 'number',
      status: 'string',
      subList: { 'type': 'array', 'itemType': SubMapDTO },
      tag: 'string',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// TracePageDTO内每行数据
export class TraceDTO extends $tea.Model {
  // 查询的 Cell
  cell?: string;
  // 创建时间
  gmtCreate: number;
  // 修改时间
  gmtModified: number;
  // 实例 ID
  instanceId: string;
  // 消息查询所用的 Message ID
  msgId?: string;
  // 消息查询所用的 Message Key
  msgKey?: string;
  // 查询 ID
  queryId: string;
  // 状态
  status: string;
  // 查询的 Topic
  topic: string;
  static names(): { [key: string]: string } {
    return {
      cell: 'cell',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      instanceId: 'instance_id',
      msgId: 'msg_id',
      msgKey: 'msg_key',
      queryId: 'query_id',
      status: 'status',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cell: 'string',
      gmtCreate: 'number',
      gmtModified: 'number',
      instanceId: 'string',
      msgId: 'string',
      msgKey: 'string',
      queryId: 'string',
      status: 'string',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// connector事件订阅配置
export class EventSubConfig extends $tea.Model {
  // 配置是否开启
  enabled: boolean;
  // 事件类型数组
  eventTypes: string[];
  // 事件触发通知类型
  triggerType: string;
  // 钉钉通知的webhook
  webhook?: string;
  // http 连接
  httpUrl?: string;
  // topic
  topic?: string;
  // tag
  tag?: string;
  static names(): { [key: string]: string } {
    return {
      enabled: 'enabled',
      eventTypes: 'event_types',
      triggerType: 'trigger_type',
      webhook: 'webhook',
      httpUrl: 'http_url',
      topic: 'topic',
      tag: 'tag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      enabled: 'boolean',
      eventTypes: { 'type': 'array', 'itemType': 'string' },
      triggerType: 'string',
      webhook: 'string',
      httpUrl: 'string',
      topic: 'string',
      tag: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 任务执行记录详情
export class TaskRecordDTO extends $tea.Model {
  // 结束时间
  // 
  // 
  end?: string;
  // 任务分区名
  name: string;
  // 开始时间
  // 
  // 
  start: string;
  // 耗时 s
  // 
  // 
  time?: string;
  // 任务进度
  // 
  // 
  progress: string;
  // 执行成功，执行失败，执行中
  type: string;
  static names(): { [key: string]: string } {
    return {
      end: 'end',
      name: 'name',
      start: 'start',
      time: 'time',
      progress: 'progress',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      end: 'string',
      name: 'string',
      start: 'string',
      time: 'string',
      progress: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 四元组，包括 key，value, display，visible
export class UIKeyVauleTemplate extends $tea.Model {
  // 中文，描述这个UI元素的key
  display: string;
  // 对应ui元素的key
  key: string;
  // 对应UI元素的值
  value: string;
  // 该配置是否对 用户 可见。
  visible: boolean;
  static names(): { [key: string]: string } {
    return {
      display: 'display',
      key: 'key',
      value: 'value',
      visible: 'visible',
    };
  }

  static types(): { [key: string]: any } {
    return {
      display: 'string',
      key: 'string',
      value: 'string',
      visible: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// router
export class RouterConfigDO extends $tea.Model {
  // 消费端 Group
  consumerId: string;
  // 消费起始位点。取值范围：0：最小位点；1：最大位点；2：时间戳。
  consumeFromType: number;
  // 消费起始位点时间戳，时间戳的值，单位是秒
  consumeFromValue: number;
  // 消费终止位点。取值范围：0：最小位点；1：最大位点；2：时间戳。
  consumeToType: number;
  // 消费终止位点时间戳，时间戳的值，单位是秒
  consumeToValue: number;
  // 延迟时间
  delayTime?: string;
  // 描述信息
  description?: string;
  // 目标单元
  destinationCell: string;
  // 目标实例 ID
  destinationInstanceId: string;
  // 目标 Topic
  destinationTopic: string;
  // 容灾标识
  disaster: boolean;
  // 容灾机房
  disasterRecoveryDatacenter: string;
  // 创建时间
  gmtCreate: string;
  // 修改时间
  gmtModified: string;
  // 路由任务 ID
  id: number;
  // 源单元
  sourceCell: string;
  // 源实例 ID
  sourceInstanceId: string;
  // 源 Topic
  sourceTopic: string;
  // 过滤 Tag
  tag: string;
  // 任务状态。取值说明：0：初始化；1：工作中；2：停止。
  taskStatus: number;
  // 任务类型。取值范围： 0：LDC 复制；1：非 LDC；2...
  taskType: number;
  static names(): { [key: string]: string } {
    return {
      consumerId: 'consumer_id',
      consumeFromType: 'consume_from_type',
      consumeFromValue: 'consume_from_value',
      consumeToType: 'consume_to_type',
      consumeToValue: 'consume_to_value',
      delayTime: 'delay_time',
      description: 'description',
      destinationCell: 'destination_cell',
      destinationInstanceId: 'destination_instance_id',
      destinationTopic: 'destination_topic',
      disaster: 'disaster',
      disasterRecoveryDatacenter: 'disaster_recovery_datacenter',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      id: 'id',
      sourceCell: 'source_cell',
      sourceInstanceId: 'source_instance_id',
      sourceTopic: 'source_topic',
      tag: 'tag',
      taskStatus: 'task_status',
      taskType: 'task_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      consumerId: 'string',
      consumeFromType: 'number',
      consumeFromValue: 'number',
      consumeToType: 'number',
      consumeToValue: 'number',
      delayTime: 'string',
      description: 'string',
      destinationCell: 'string',
      destinationInstanceId: 'string',
      destinationTopic: 'string',
      disaster: 'boolean',
      disasterRecoveryDatacenter: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      id: 'number',
      sourceCell: 'string',
      sourceInstanceId: 'string',
      sourceTopic: 'string',
      tag: 'string',
      taskStatus: 'number',
      taskType: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订阅者topic信息
export class SubscriptionTopicDTO extends $tea.Model {
  // 是否在线
  online: boolean;
  // 订阅匹配字符串
  subString: string;
  // Topic 名称
  topic: string;
  static names(): { [key: string]: string } {
    return {
      online: 'online',
      subString: 'sub_string',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      online: 'boolean',
      subString: 'string',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 该集群在线客户端详细信息，包含 Jstack、消费 RT 时间等信息
export class ConsumerConnectionInfoDTO extends $tea.Model {
  // 消费实例的 ID
  clientId: string;
  // 连接信息
  connection: string;
  // PUSH/PULL
  consumeType: string;
  // Jstack 堆栈信息
  jstack: ThreadTrackDTO[];
  // 客户端语言
  language: string;
  // 最后更新时间
  lastTimestamp: number;
  // 消费模型，取值说明如下：CLUSTERING：集群消费模式；BROADCASTING：广播消费模式。
  messageModel: string;
  // 实时状态统计
  runningDataList: ConsumerRunningDataDTO[];
  // 开始时间
  startTimestamp: number;
  // 订阅关系集合
  subscriptionSet: SubscriptionDTO[];
  // 消费线程数
  threadCount: number;
  //  客户端版本号
  version: string;
  static names(): { [key: string]: string } {
    return {
      clientId: 'client_id',
      connection: 'connection',
      consumeType: 'consume_type',
      jstack: 'jstack',
      language: 'language',
      lastTimestamp: 'last_timestamp',
      messageModel: 'message_model',
      runningDataList: 'running_data_list',
      startTimestamp: 'start_timestamp',
      subscriptionSet: 'subscription_set',
      threadCount: 'thread_count',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      clientId: 'string',
      connection: 'string',
      consumeType: 'string',
      jstack: { 'type': 'array', 'itemType': ThreadTrackDTO },
      language: 'string',
      lastTimestamp: 'number',
      messageModel: 'string',
      runningDataList: { 'type': 'array', 'itemType': ConsumerRunningDataDTO },
      startTimestamp: 'number',
      subscriptionSet: { 'type': 'array', 'itemType': SubscriptionDTO },
      threadCount: 'number',
      version: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// cell
export class CellDO extends $tea.Model {
  // cell
  cell: string;
  // cell type
  cellType?: string;
  // default
  datacenter?: string;
  // endpoint
  endpoint?: string;
  // endpoint type
  endpointType?: string;
  // gmt_create
  gmtCreate: string;
  // gmt_modified
  gmtModified: string;
  // id
  id: number;
  // instance_id
  instanceId?: string;
  // room
  room?: string;
  static names(): { [key: string]: string } {
    return {
      cell: 'cell',
      cellType: 'cell_type',
      datacenter: 'datacenter',
      endpoint: 'endpoint',
      endpointType: 'endpoint_type',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      id: 'id',
      instanceId: 'instance_id',
      room: 'room',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cell: 'string',
      cellType: 'string',
      datacenter: 'string',
      endpoint: 'string',
      endpointType: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      id: 'number',
      instanceId: 'string',
      room: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// sofa mq
export class TopicDTO extends $tea.Model {
  // 集群名称
  cluster?: string;
  // 创建时间
  gmtCreate: number;
  // 修改时间
  gmtModified: number;
  // 数据库 ID
  id: number;
  // 实例 ID
  instanceId: string;
  // 消息类型。取值说明如下：
  // 
  // 0：普通消息
  // 1：分区顺序消息
  // 2：全局顺序消息
  // 4：事务消息
  // 5：定时/延时消息
  messageType: number;
  // 创建人
  operator?: string;
  // 设置该 Topic 的读写模式。取值说明如下：
  // 
  // 6：同时支持读写
  // 4：禁写
  // 2：禁读
  perm: number;
  // 读分区数
  readQueueNum?: number;
  // Topic 备注信息
  remark: string;
  // Topic 名称
  topic: string;
  // 写分区数
  writeQueueNum?: number;
  // 生效范围
  scope?: string;
  // 版本号
  version?: number;
  // 删除标志
  deleteMark?: string;
  // true标识该topic带有schema，否则不带schema
  schemaMark?: boolean;
  // Topic对应Schema配置的序列化方式
  schemaSerialization?: string;
  // Topic对应的Schema的兼容性策略
  schemaCompatibility?: string;
  // Topic 所属的应用名称，要求 app name 在 zappinfo 上可查
  owner?: string;
  static names(): { [key: string]: string } {
    return {
      cluster: 'cluster',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      id: 'id',
      instanceId: 'instance_id',
      messageType: 'message_type',
      operator: 'operator',
      perm: 'perm',
      readQueueNum: 'read_queue_num',
      remark: 'remark',
      topic: 'topic',
      writeQueueNum: 'write_queue_num',
      scope: 'scope',
      version: 'version',
      deleteMark: 'delete_mark',
      schemaMark: 'schema_mark',
      schemaSerialization: 'schema_serialization',
      schemaCompatibility: 'schema_compatibility',
      owner: 'owner',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cluster: 'string',
      gmtCreate: 'number',
      gmtModified: 'number',
      id: 'number',
      instanceId: 'string',
      messageType: 'number',
      operator: 'string',
      perm: 'number',
      readQueueNum: 'number',
      remark: 'string',
      topic: 'string',
      writeQueueNum: 'number',
      scope: 'string',
      version: 'number',
      deleteMark: 'string',
      schemaMark: 'boolean',
      schemaSerialization: 'string',
      schemaCompatibility: 'string',
      owner: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// msgtype
export class MsgTypeDO extends $tea.Model {
  // desc
  desc?: string;
  // eventcode
  eventcode: string;
  // gmt_create
  gmtCreate?: string;
  // gmt_modified
  gmtModified?: string;
  // instance_id
  instanceId: string;
  // topic
  topic: string;
  // id
  id: number;
  static names(): { [key: string]: string } {
    return {
      desc: 'desc',
      eventcode: 'eventcode',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      instanceId: 'instance_id',
      topic: 'topic',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      desc: 'string',
      eventcode: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      instanceId: 'string',
      topic: 'string',
      id: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 前端UI展示的模型
export class UIControlModel extends $tea.Model {
  // 展示给用户查看的描述。
  display: string;
  // 提示信息，参照Tooltip
  hint?: string;
  // 控件名称，也是控件绑定的数据 key
  name: string;
  // 如果本控件是 select 或者 radio 选择框类型，本数组是 所有 选项的具体信息。
  options?: UIOptionModel[];
  // input控件独有字段，代表输入框的place holder
  placeHolder?: string;
  // 该控件的value是否是必须的
  required: boolean;
  // 本控件的值必须满足的规则，例如input，那么可能输入的文本必须满足全英文等；以正则表达式的形式。
  rule?: string;
  // 当 用户输入的 值与 rule不符合时，提醒用户出错的备注。
  ruleRemark?: string;
  // 控件的类型；支持 Select、Radio、Input、DatePicking
  type: string;
  // 本控件是否未联动控件，联动控件是否展示 与 union_control和union_value 相关，当联动的父控件union_control的值为union_value时，本控件才可见。
  union: boolean;
  // 联动的控件名称，即name
  unionControl?: string;
  // 当联动空间union_control的值是本字段的值时，本联动控件可以展示。
  unionValue?: string;
  // 本控件对应的值；如果是input，那么就是输入的值；如果是select/radio，那就是选项的值；如果是option，那么就是自己本身的枚举值。
  value?: string;
  // 该控件的值是否可以修改
  immutable: boolean;
  static names(): { [key: string]: string } {
    return {
      display: 'display',
      hint: 'hint',
      name: 'name',
      options: 'options',
      placeHolder: 'place_holder',
      required: 'required',
      rule: 'rule',
      ruleRemark: 'rule_remark',
      type: 'type',
      union: 'union',
      unionControl: 'union_control',
      unionValue: 'union_value',
      value: 'value',
      immutable: 'immutable',
    };
  }

  static types(): { [key: string]: any } {
    return {
      display: 'string',
      hint: 'string',
      name: 'string',
      options: { 'type': 'array', 'itemType': UIOptionModel },
      placeHolder: 'string',
      required: 'boolean',
      rule: 'string',
      ruleRemark: 'string',
      type: 'string',
      union: 'boolean',
      unionControl: 'string',
      unionValue: 'string',
      value: 'string',
      immutable: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 队列详情信息
export class QueueDescDTO extends $tea.Model {
  // 关联应用名
  assoApp: string;
  // 通道名
  channel: string;
  // 队列id
  id: number;
  // 队列管理器ip
  ip: string;
  // 队列管理器名
  manager: string;
  // 队列名
  name: string;
  // 队列管理器端口
  port: string;
  // 队列类型
  type: string;
  static names(): { [key: string]: string } {
    return {
      assoApp: 'asso_app',
      channel: 'channel',
      id: 'id',
      ip: 'ip',
      manager: 'manager',
      name: 'name',
      port: 'port',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      assoApp: 'string',
      channel: 'string',
      id: 'number',
      ip: 'string',
      manager: 'string',
      name: 'string',
      port: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 接入点信息
export class EndpointsDTO extends $tea.Model {
  // HTTP 内网接入点
  httpInternalEndpoint: string;
  // HTTP 公网接入点
  httpInternetEndpoint: string;
  // HTTPS 公网接入点
  httpInternetSecureEndpoint: string;
  // TCP 协议接入点
  tcpEndpoint: string;
  static names(): { [key: string]: string } {
    return {
      httpInternalEndpoint: 'http_internal_endpoint',
      httpInternetEndpoint: 'http_internet_endpoint',
      httpInternetSecureEndpoint: 'http_internet_secure_endpoint',
      tcpEndpoint: 'tcp_endpoint',
    };
  }

  static types(): { [key: string]: any } {
    return {
      httpInternalEndpoint: 'string',
      httpInternetEndpoint: 'string',
      httpInternetSecureEndpoint: 'string',
      tcpEndpoint: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 源端 topic
export class SourceTopic extends $tea.Model {
  // 源端 topic
  sourceTopic: string;
  // 此源端 topic 所有的 event code列表
  sourceEventCode: string[];
  static names(): { [key: string]: string } {
    return {
      sourceTopic: 'source_topic',
      sourceEventCode: 'source_event_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sourceTopic: 'string',
      sourceEventCode: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 查询结果
export class MessageTrackDTO extends $tea.Model {
  // 订阅该 Topic 的消费者所对应的 Group ID
  consumerGroup: string;
  // 需查询的消息所对应的实例 ID
  instanceId: string;
  // 当前状态。取值说明如下：
  // 
  // CONSUMED：已消费
  // CONSUMED_BUT_FILTERED：已被过滤
  // NOT_CONSUME_YET：暂未消费
  // NOT_ONLINE：客户端不在线
  // UNKNOWN：其他问题
  // 
  trackType: string;
  static names(): { [key: string]: string } {
    return {
      consumerGroup: 'consumer_group',
      instanceId: 'instance_id',
      trackType: 'track_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      consumerGroup: 'string',
      instanceId: 'string',
      trackType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 一行字段的值
export class ColumnsValue extends $tea.Model {
  // 一行的值
  value: ColumnValue[];
  static names(): { [key: string]: string } {
    return {
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      value: { 'type': 'array', 'itemType': ColumnValue },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 告警信息
export class WarnDTO extends $tea.Model {
  // 报警时间段
  alertTime: string;
  // 属性字符串
  attribute: string;
  // 消息阻塞时间
  blockTime: number;
  // 联系人列表
  contacts: string;
  // 延迟时间
  delayTime: number;
  // 报警频率，单位分钟
  frequency: number;
  // 创建时间
  gmtCreate: number;
  // 修改时间
  gmtModified: number;
  // 消费组 ID
  groupId: string;
  // 报警 ID
  id: number;
  // 实例 ID
  instanceId: string;
  // 操作者
  operator: string;
  // 阈值
  threshold: number;
  // 报警的 Topic
  topic: string;
  // 报警级别
  warnLevel: number;
  // 报警状态
  warnStatus: number;
  // 报警类型
  warnType: number;
  static names(): { [key: string]: string } {
    return {
      alertTime: 'alert_time',
      attribute: 'attribute',
      blockTime: 'block_time',
      contacts: 'contacts',
      delayTime: 'delay_time',
      frequency: 'frequency',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      groupId: 'group_id',
      id: 'id',
      instanceId: 'instance_id',
      operator: 'operator',
      threshold: 'threshold',
      topic: 'topic',
      warnLevel: 'warn_level',
      warnStatus: 'warn_status',
      warnType: 'warn_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      alertTime: 'string',
      attribute: 'string',
      blockTime: 'number',
      contacts: 'string',
      delayTime: 'number',
      frequency: 'number',
      gmtCreate: 'number',
      gmtModified: 'number',
      groupId: 'string',
      id: 'number',
      instanceId: 'string',
      operator: 'string',
      threshold: 'number',
      topic: 'string',
      warnLevel: 'number',
      warnStatus: 'number',
      warnType: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// config信息
export class ConfigDTO extends $tea.Model {
  // create time
  gmtCreate: number;
  // modify time
  gmtModified: number;
  // id
  id: number;
  // operator
  operator: string;
  // key
  property: string;
  // 目标名
  targetName: string;
  // cluster type or broker type
  targetType: number;
  // value
  value: string;
  // 生效范围
  scope: string;
  // 版本号
  version: number;
  // 删除标志
  deleteMark: string;
  static names(): { [key: string]: string } {
    return {
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      id: 'id',
      operator: 'operator',
      property: 'property',
      targetName: 'target_name',
      targetType: 'target_type',
      value: 'value',
      scope: 'scope',
      version: 'version',
      deleteMark: 'delete_mark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      gmtCreate: 'number',
      gmtModified: 'number',
      id: 'number',
      operator: 'string',
      property: 'string',
      targetName: 'string',
      targetType: 'number',
      value: 'string',
      scope: 'string',
      version: 'number',
      deleteMark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 告警日志
export class WarnLogDTO extends $tea.Model {
  // 单元名称
  cell: string;
  // 创建时间
  gmtCreate: number;
  // 修改时间
  gmtModified: number;
  // Group ID
  groupId: string;
  // 实例 ID
  instanceId: string;
  // Topic 名称
  topic: string;
  // 报警 ID
  warnId: number;
  // 报警信息
  warnInfo: string;
  static names(): { [key: string]: string } {
    return {
      cell: 'cell',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      groupId: 'group_id',
      instanceId: 'instance_id',
      topic: 'topic',
      warnId: 'warn_id',
      warnInfo: 'warn_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cell: 'string',
      gmtCreate: 'number',
      gmtModified: 'number',
      groupId: 'string',
      instanceId: 'string',
      topic: 'string',
      warnId: 'number',
      warnInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// node
export class NodeDO extends $tea.Model {
  // cluster
  cluster?: string;
  // default
  dataCenter?: string;
  // hostname
  hostname: string;
  // node group
  nodeGroup?: string;
  // node type
  nodeType?: string;
  // node perm
  perm?: string;
  // rip
  rip?: string;
  // room
  room?: string;
  // vip
  vip?: string;
  // id
  id: number;
  // gmt_create
  gmtCreate: string;
  // gmt_modified
  gmtModified: string;
  // 节点状态 MASTER|SLAVE|OFFLINE
  status: string;
  // 节点所属环境
  env?: string;
  // 节点所在城市
  city?: string;
  static names(): { [key: string]: string } {
    return {
      cluster: 'cluster',
      dataCenter: 'data_center',
      hostname: 'hostname',
      nodeGroup: 'node_group',
      nodeType: 'node_type',
      perm: 'perm',
      rip: 'rip',
      room: 'room',
      vip: 'vip',
      id: 'id',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      status: 'status',
      env: 'env',
      city: 'city',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cluster: 'string',
      dataCenter: 'string',
      hostname: 'string',
      nodeGroup: 'string',
      nodeType: 'string',
      perm: 'string',
      rip: 'string',
      room: 'string',
      vip: 'string',
      id: 'number',
      gmtCreate: 'string',
      gmtModified: 'string',
      status: 'string',
      env: 'string',
      city: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 客户端信息
// 
export class ClientInfoDTO extends $tea.Model {
  // 客户端ID
  clientId: string;
  // 客户端地址
  clientAddr: string;
  // 订阅详情
  subscriptions: SubscriptionDTO[];
  static names(): { [key: string]: string } {
    return {
      clientId: 'client_id',
      clientAddr: 'client_addr',
      subscriptions: 'subscriptions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      clientId: 'string',
      clientAddr: 'string',
      subscriptions: { 'type': 'array', 'itemType': SubscriptionDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订阅者分组信息
export class SubscriptionGroupDTO extends $tea.Model {
  // 消费者所属消费组
  groupId: string;
  // 部署模型
  messageModel: string;
  // 订阅字符串
  subString: string;
  // group协议类型
  groupType: string;
  static names(): { [key: string]: string } {
    return {
      groupId: 'group_id',
      messageModel: 'message_model',
      subString: 'sub_string',
      groupType: 'group_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      groupId: 'string',
      messageModel: 'string',
      subString: 'string',
      groupType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// bind
export class BindingDO extends $tea.Model {
  // app_name
  appName: string;
  // eventcode
  eventcode: string;
  // exchange_type
  exchangeType: string;
  // expression
  expression?: string;
  // gmt_create
  gmtCreate: string;
  // gmt_modified
  gmtModified: string;
  // group
  group: string;
  // id
  id: number;
  // instance_id
  instanceId: string;
  // persistence
  persistence: boolean;
  // topic
  topic: string;
  static names(): { [key: string]: string } {
    return {
      appName: 'app_name',
      eventcode: 'eventcode',
      exchangeType: 'exchange_type',
      expression: 'expression',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      group: 'group',
      id: 'id',
      instanceId: 'instance_id',
      persistence: 'persistence',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appName: 'string',
      eventcode: 'string',
      exchangeType: 'string',
      expression: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      group: 'string',
      id: 'number',
      instanceId: 'string',
      persistence: 'boolean',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// msgbatch
export class MsgQueryBatchDO extends $tea.Model {
  // eventcode
  eventcode: string;
  // gmt_create
  gmtCreate?: string;
  // message_id
  messageId: string;
  // status
  status?: string;
  // subscriber_group_undelivery
  subscriberGroupUndelivery?: string;
  static names(): { [key: string]: string } {
    return {
      eventcode: 'eventcode',
      gmtCreate: 'gmt_create',
      messageId: 'message_id',
      status: 'status',
      subscriberGroupUndelivery: 'subscriber_group_undelivery',
    };
  }

  static types(): { [key: string]: any } {
    return {
      eventcode: 'string',
      gmtCreate: 'string',
      messageId: 'string',
      status: 'string',
      subscriberGroupUndelivery: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// kv配置
export class KVConfigDTO extends $tea.Model {
  // 创建时间
  gmtCreate: number;
  // 修改时间
  gmtModified: number;
  // id
  id: number;
  // key
  uniformKey: string;
  // 命名空间
  namespace: string;
  // 操作人
  operator: string;
  // value
  uniformValue: string;
  static names(): { [key: string]: string } {
    return {
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      id: 'id',
      uniformKey: 'uniform_key',
      namespace: 'namespace',
      operator: 'operator',
      uniformValue: 'uniform_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      gmtCreate: 'number',
      gmtModified: 'number',
      id: 'number',
      uniformKey: 'string',
      namespace: 'string',
      operator: 'string',
      uniformValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 连接器任务信息
export class ConnectorJobInfo extends $tea.Model {
  // 任务名称
  name: string;
  // 任务的调度类型
  type: string;
  // 创建时间
  gmtCreate: string;
  // 任务描述
  remark?: string;
  // 任务状态
  status: string;
  // 所属应用
  app: string;
  // 工单状态
  processStatus: string;
  // 系统标签
  sysLabels?: string[];
  // 应用标签
  userLabels?: string[];
  // 事件订阅是否开启
  eventSubEnabled?: boolean;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      type: 'type',
      gmtCreate: 'gmt_create',
      remark: 'remark',
      status: 'status',
      app: 'app',
      processStatus: 'process_status',
      sysLabels: 'sys_labels',
      userLabels: 'user_labels',
      eventSubEnabled: 'event_sub_enabled',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      type: 'string',
      gmtCreate: 'string',
      remark: 'string',
      status: 'string',
      app: 'string',
      processStatus: 'string',
      sysLabels: { 'type': 'array', 'itemType': 'string' },
      userLabels: { 'type': 'array', 'itemType': 'string' },
      eventSubEnabled: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 各个 Topic 的消费情况
export class DetailInTopicDTO extends $tea.Model {
  // 延迟时间
  delayTime: number;
  // 最后更新时间
  lastTimestamp: number;
  // Topic 名称
  topic: string;
  // 该 Topic 消费总堆积数
  totalDiff: number;
  static names(): { [key: string]: string } {
    return {
      delayTime: 'delay_time',
      lastTimestamp: 'last_timestamp',
      topic: 'topic',
      totalDiff: 'total_diff',
    };
  }

  static types(): { [key: string]: any } {
    return {
      delayTime: 'number',
      lastTimestamp: 'number',
      topic: 'string',
      totalDiff: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 队列路由规则
export class QueueRouteRulesDTO extends $tea.Model {
  // 应用
  app: string;
  // 修改时间
  gmtModified: string;
  // 队列路由规则id
  id: number;
  // 方法
  meth: string;
  // 路由规则名称
  name: string;
  // 队列id
  queueId: number;
  // 状态
  status: number;
  // 分流开关
  switchStatus: number;
  // 路由类型
  type: string;
  static names(): { [key: string]: string } {
    return {
      app: 'app',
      gmtModified: 'gmt_modified',
      id: 'id',
      meth: 'meth',
      name: 'name',
      queueId: 'queue_id',
      status: 'status',
      switchStatus: 'switch_status',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      app: 'string',
      gmtModified: 'string',
      id: 'number',
      meth: 'string',
      name: 'string',
      queueId: 'number',
      status: 'number',
      switchStatus: 'number',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// WhitelistDO
export class WhitelistDO extends $tea.Model {
  // instance_id
  instanceId: string;
  // topic
  topic: string;
  // id
  id: number;
  // groupid
  groupid: string;
  // gmt_create
  gmtCreate?: string;
  // gmt_modified
  gmtModified?: string;
  static names(): { [key: string]: string } {
    return {
      instanceId: 'instance_id',
      topic: 'topic',
      id: 'id',
      groupid: 'groupid',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instanceId: 'string',
      topic: 'string',
      id: 'number',
      groupid: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// schema详情
export class SchemaDetailDO extends $tea.Model {
  // 注释
  comment?: string;
  // schema内容
  content: string;
  // 值校验规则
  fieldValidateRule?: string;
  // 名称
  name: string;
  // 命名空间
  namespace?: string;
  // 序列化类型
  serialization: string;
  // 状态
  state?: string;
  // 租户
  tenant?: string;
  // schema类型
  type: string;
  // 唯一ID
  uniqId?: string;
  // 版本
  version?: number;
  // 操作人
  operator: string;
  // 创建时间
  gmtCreate?: number;
  // 修改时间
  gmtModified?: number;
  static names(): { [key: string]: string } {
    return {
      comment: 'comment',
      content: 'content',
      fieldValidateRule: 'field_validate_rule',
      name: 'name',
      namespace: 'namespace',
      serialization: 'serialization',
      state: 'state',
      tenant: 'tenant',
      type: 'type',
      uniqId: 'uniq_id',
      version: 'version',
      operator: 'operator',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      comment: 'string',
      content: 'string',
      fieldValidateRule: 'string',
      name: 'string',
      namespace: 'string',
      serialization: 'string',
      state: 'string',
      tenant: 'string',
      type: 'string',
      uniqId: 'string',
      version: 'number',
      operator: 'string',
      gmtCreate: 'number',
      gmtModified: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 前端展示的UI组件
export class UIComponent extends $tea.Model {
  // UI组件类型
  type: string;
  // UI组件中的 内容组成部分，可以由多个Content对象组成
  contents: ComponentContent[];
  // 列表内元素组件集合
  listItems?: ItemComponent[];
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      contents: 'contents',
      listItems: 'list_items',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      contents: { 'type': 'array', 'itemType': ComponentContent },
      listItems: { 'type': 'array', 'itemType': ItemComponent },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 采集点信息
export class StatsDataDTO extends $tea.Model {
  // 横轴，毫秒时间戳
  x: number;
  // 纵轴，数据（TPS 或者总量）
  y: string;
  static names(): { [key: string]: string } {
    return {
      x: 'x',
      y: 'y',
    };
  }

  static types(): { [key: string]: any } {
    return {
      x: 'number',
      y: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 限流规则信息
export class QueueLimitRulesDTO extends $tea.Model {
  // 修改时间
  gmtModified: string;
  // 限流规则id
  id: number;
  // 限流算法
  lAlgorithm: string;
  // 限流后操作
  lOperation: string;
  // 方法
  meth: string;
  // 限流规则名称
  name: string;
  // 队列id
  queueId: number;
  // 运行模式
  rMode: string;
  // 状态
  status: number;
  // 应用名
  app: string;
  static names(): { [key: string]: string } {
    return {
      gmtModified: 'gmt_modified',
      id: 'id',
      lAlgorithm: 'l_algorithm',
      lOperation: 'l_operation',
      meth: 'meth',
      name: 'name',
      queueId: 'queue_id',
      rMode: 'r_mode',
      status: 'status',
      app: 'app',
    };
  }

  static types(): { [key: string]: any } {
    return {
      gmtModified: 'string',
      id: 'number',
      lAlgorithm: 'string',
      lOperation: 'string',
      meth: 'string',
      name: 'string',
      queueId: 'number',
      rMode: 'string',
      status: 'number',
      app: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 管理员用户信息
export class AdminUserDTO extends $tea.Model {
  // 创建时间
  gmtCreate: number;
  // 修改时间
  gmtModified: number;
  // 数据库id
  id: number;
  // 登录名
  loginName: string;
  // 昵称
  nickName: string;
  // 真实姓名
  realName: string;
  // 用户类型
  userType: number;
  // 操作人
  operator: string;
  static names(): { [key: string]: string } {
    return {
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      id: 'id',
      loginName: 'login_name',
      nickName: 'nick_name',
      realName: 'real_name',
      userType: 'user_type',
      operator: 'operator',
    };
  }

  static types(): { [key: string]: any } {
    return {
      gmtCreate: 'number',
      gmtModified: 'number',
      id: 'number',
      loginName: 'string',
      nickName: 'string',
      realName: 'string',
      userType: 'number',
      operator: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 队列的消费offset相关信息
export class ConsumeQueueOffset extends $tea.Model {
  // topic
  topic: string;
  // queue所在broker的名字
  brokerName: string;
  // queue id
  queueId: number;
  // 消费位点
  brokerOffset: number;
  // 消费端offset
  consumerOffset: number;
  // 最后时间（时间戳）
  // 
  lastTimestamp: number;
  // 消费端地址
  clientAddr: string;
  // 消费者客户端id
  // 
  clientId: string;
  // 消息堆积数
  // 
  accumulate: number;
  // queue位点和消费端位点差
  difference: number;
  static names(): { [key: string]: string } {
    return {
      topic: 'topic',
      brokerName: 'broker_name',
      queueId: 'queue_id',
      brokerOffset: 'broker_offset',
      consumerOffset: 'consumer_offset',
      lastTimestamp: 'last_timestamp',
      clientAddr: 'client_addr',
      clientId: 'client_id',
      accumulate: 'accumulate',
      difference: 'difference',
    };
  }

  static types(): { [key: string]: any } {
    return {
      topic: 'string',
      brokerName: 'string',
      queueId: 'number',
      brokerOffset: 'number',
      consumerOffset: 'number',
      lastTimestamp: 'number',
      clientAddr: 'string',
      clientId: 'string',
      accumulate: 'number',
      difference: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// group
export class GroupDTO extends $tea.Model {
  // 集群名
  cluster?: string;
  // 删除标志
  deleteMark?: string;
  // 创建时间
  gmtCreate: number;
  // 修改时间
  gmtModified: number;
  // Group ID
  groupId: string;
  // 查询的 Group ID 适用的协议。TCP 协议和 HTTP 协议的 Group ID 不可以共用，需要分别创建。取值说明如下：
  // 
  // tcp：表示该 Group ID 仅适用于 TCP 协议的消息收发。
  // http：表示该 Group ID 仅适用于 HTTP 协议的消息收发。
  groupType: string;
  // 数据库 ID
  id: number;
  // 实例 ID
  instanceId: string;
  // 操作人
  operator?: string;
  // 读权限
  readEnable?: boolean;
  // Group 备注信息
  remark: string;
  // 生效范围
  scope?: string;
  // 版本号
  version?: number;
  // retry topic读队列数
  retryReadQueueNum?: number;
  // retry topic写队列数
  retryWriteQueueNum?: number;
  // retry topic读写权限
  retryPerm?: number;
  // Group 所属的应用名称，要求应用名在 zappinfo 上可查
  owner?: string;
  static names(): { [key: string]: string } {
    return {
      cluster: 'cluster',
      deleteMark: 'delete_mark',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      groupId: 'group_id',
      groupType: 'group_type',
      id: 'id',
      instanceId: 'instance_id',
      operator: 'operator',
      readEnable: 'read_enable',
      remark: 'remark',
      scope: 'scope',
      version: 'version',
      retryReadQueueNum: 'retry_read_queue_num',
      retryWriteQueueNum: 'retry_write_queue_num',
      retryPerm: 'retry_perm',
      owner: 'owner',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cluster: 'string',
      deleteMark: 'string',
      gmtCreate: 'number',
      gmtModified: 'number',
      groupId: 'string',
      groupType: 'string',
      id: 'number',
      instanceId: 'string',
      operator: 'string',
      readEnable: 'boolean',
      remark: 'string',
      scope: 'string',
      version: 'number',
      retryReadQueueNum: 'number',
      retryWriteQueueNum: 'number',
      retryPerm: 'number',
      owner: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 该集群当前在线客户端信息
export class ConnectionDTO extends $tea.Model {
  // 该消费实例的地址和端口
  clientAddr: string;
  // 消费实例的 ID
  clientId: string;
  // 消费端语言
  language: string;
  // 宿主机 IP 或公网 IP
  remoteIp: string;
  // 消费端版本
  version: string;
  static names(): { [key: string]: string } {
    return {
      clientAddr: 'client_addr',
      clientId: 'client_id',
      language: 'language',
      remoteIp: 'remote_ip',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      clientAddr: 'string',
      clientId: 'string',
      language: 'string',
      remoteIp: 'string',
      version: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 列配置
export class ColumnConfig extends $tea.Model {
  // 别名
  alias?: string;
  // 转化类型
  castType?: string;
  // 名称
  name: string;
  // 列类型
  type: string;
  // 当前字段 可转化成的类型选项
  castTypeOptions?: string[];
  static names(): { [key: string]: string } {
    return {
      alias: 'alias',
      castType: 'cast_type',
      name: 'name',
      type: 'type',
      castTypeOptions: 'cast_type_options',
    };
  }

  static types(): { [key: string]: any } {
    return {
      alias: 'string',
      castType: 'string',
      name: 'string',
      type: 'string',
      castTypeOptions: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用页面
export class ApplicationDTO extends $tea.Model {
  // 创建时间
  gmtCreated: string;
  // 应用id
  id: number;
  // 应用名
  name: string;
  // 服务端get队列
  pubGetQueue?: string;
  // 服务端put队列
  pubPutQueue?: string;
  // 服务端开关
  pubRpcStatus?: number;
  // 客户端get队列
  subGetQueue?: string;
  // 客户端put队列
  subPutQueue?: string;
  // rpc分流比例
  subRpcScale?: number;
  // 服务类型
  type: string;
  static names(): { [key: string]: string } {
    return {
      gmtCreated: 'gmt_created',
      id: 'id',
      name: 'name',
      pubGetQueue: 'pub_get_queue',
      pubPutQueue: 'pub_put_queue',
      pubRpcStatus: 'pub_rpc_status',
      subGetQueue: 'sub_get_queue',
      subPutQueue: 'sub_put_queue',
      subRpcScale: 'sub_rpc_scale',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      gmtCreated: 'string',
      id: 'number',
      name: 'string',
      pubGetQueue: 'string',
      pubPutQueue: 'string',
      pubRpcStatus: 'number',
      subGetQueue: 'string',
      subPutQueue: 'string',
      subRpcScale: 'number',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// nodes
export class NodePageDO extends $tea.Model {
  // nodes
  content: NodeDO[];
  // page
  pageNum: number;
  // page size
  pageSize: number;
  // total
  total: number;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      pageNum: 'page_num',
      pageSize: 'page_size',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: { 'type': 'array', 'itemType': NodeDO },
      pageNum: 'number',
      pageSize: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 执行记录详情
export class JobRecordDTO extends $tea.Model {
  // 结束时间
  end?: string;
  // 任务执行id
  id: string;
  // 执行总进度
  // 
  // 总的进度为100，这里的进度条如何配置需要，前端同学定一下，我来改
  progress: number;
  // 任务执行状态
  runType: string;
  // 开始时间
  start: string;
  // 任务执行记录集合
  taskRecords: TaskRecordDTO[];
  // 执行耗时
  time?: number;
  // 触发类型
  triggerType: string;
  // 分区信息
  partition: string;
  // 触发上下文
  context?: string;
  static names(): { [key: string]: string } {
    return {
      end: 'end',
      id: 'id',
      progress: 'progress',
      runType: 'run_type',
      start: 'start',
      taskRecords: 'task_records',
      time: 'time',
      triggerType: 'trigger_type',
      partition: 'partition',
      context: 'context',
    };
  }

  static types(): { [key: string]: any } {
    return {
      end: 'string',
      id: 'string',
      progress: 'number',
      runType: 'string',
      start: 'string',
      taskRecords: { 'type': 'array', 'itemType': TaskRecordDTO },
      time: 'number',
      triggerType: 'string',
      partition: 'string',
      context: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// room
export class RoomDO extends $tea.Model {
  // cluster
  cluster: string;
  // endpoint
  endpoint?: string;
  // endpoint_type
  endpointType?: string;
  // region
  region?: string;
  // room
  room: string;
  // id
  id: number;
  // gmt_create
  gmtCreate: string;
  // gmt_modified
  gmtModified: string;
  static names(): { [key: string]: string } {
    return {
      cluster: 'cluster',
      endpoint: 'endpoint',
      endpointType: 'endpoint_type',
      region: 'region',
      room: 'room',
      id: 'id',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cluster: 'string',
      endpoint: 'string',
      endpointType: 'string',
      region: 'string',
      room: 'string',
      id: 'number',
      gmtCreate: 'string',
      gmtModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 任务实例摘要信息
export class InstanceDigest extends $tea.Model {
  // job instance id
  id: string;
  // 分区信息
  partition: string;
  // 时间
  gmtCreate: string;
  // 任务状态
  state: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      partition: 'partition',
      gmtCreate: 'gmt_create',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      partition: 'string',
      gmtCreate: 'string',
      state: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 告警日志查询集合
export class WarnLogPageDTO extends $tea.Model {
  // 报警日志信息
  content: WarnLogDTO[];
  // 页码
  pageNum: number;
  // 每页显示条数
  pageSize: number;
  // 总条数
  total: number;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      pageNum: 'page_num',
      pageSize: 'page_size',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: { 'type': 'array', 'itemType': WarnLogDTO },
      pageNum: 'number',
      pageSize: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 指定 Group ID 的连接信息
export class ConsumerGetConnectionDTO extends $tea.Model {
  // 指定 Group ID 的连接信息
  // 
  // 
  connectionList: ConnectionDTO[];
  static names(): { [key: string]: string } {
    return {
      connectionList: 'connection_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      connectionList: { 'type': 'array', 'itemType': ConnectionDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 积压数据点
export class BacklogMetricItem extends $tea.Model {
  // 积压消息量
  backlogCnt: number;
  // 积压数据的时间戳
  timestamp: number;
  static names(): { [key: string]: string } {
    return {
      backlogCnt: 'backlog_cnt',
      timestamp: 'timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      backlogCnt: 'number',
      timestamp: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 清除消费进度结果对象
export class ClearOffsetResultDTO extends $tea.Model {
  // GroupId
  groupId: string;
  // Topic 名称
  topic: string;
  // 操作结果
  result: string;
  static names(): { [key: string]: string } {
    return {
      groupId: 'group_id',
      topic: 'topic',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      groupId: 'string',
      topic: 'string',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 工单详情
export class ProcessDTO extends $tea.Model {
  // 工单名称
  processName: string;
  // 状态
  processStatus: string;
  // 工单链接
  processUrl: string;
  static names(): { [key: string]: string } {
    return {
      processName: 'process_name',
      processStatus: 'process_status',
      processUrl: 'process_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      processName: 'string',
      processStatus: 'string',
      processUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// cell页面数据
export class CellPageDTO extends $tea.Model {
  // cell数据
  content: CellDO[];
  // 页号
  pageNum: number;
  // 页面大小
  pageSize: number;
  // 总量
  total: number;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      pageNum: 'page_num',
      pageSize: 'page_size',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: { 'type': 'array', 'itemType': CellDO },
      pageNum: 'number',
      pageSize: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Api接口信息
export class ApiInfoDTO extends $tea.Model {
  // api详细描述
  description: string;
  // api名
  name: string;
  // 负责人
  owner: string;
  // api路径
  path: string;
  // api简介
  summary: string;
  // 开关
  switchOpen: boolean;
  // sofamq action 名称
  sofamqAction?: string;
  // 是否默认分配给普通用户
  userDefaultAssign?: boolean;
  // 是否默认分配给 app owner
  ownerDefaultAssign?: boolean;
  static names(): { [key: string]: string } {
    return {
      description: 'description',
      name: 'name',
      owner: 'owner',
      path: 'path',
      summary: 'summary',
      switchOpen: 'switch_open',
      sofamqAction: 'sofamq_action',
      userDefaultAssign: 'user_default_assign',
      ownerDefaultAssign: 'owner_default_assign',
    };
  }

  static types(): { [key: string]: any } {
    return {
      description: 'string',
      name: 'string',
      owner: 'string',
      path: 'string',
      summary: 'string',
      switchOpen: 'boolean',
      sofamqAction: 'string',
      userDefaultAssign: 'boolean',
      ownerDefaultAssign: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Consumer 的消费堆积情况信息
export class ConsumerAccumulateDTO extends $tea.Model {
  // 该 Group ID 下消费者实例群组接收消息的总 TPS
  consumeTps: string;
  // 该 Topic 所发消息的最大消费延迟时间
  delayTime: number;
  // 各个 Topic 具体情况
  detailInTopicList: DetailInTopicDTO[];
  // 该 Topic 中最近一条被消费的信息的生产时间
  lastTimestamp: number;
  // 该 Group ID 下是否有消费者实例在线；只要有一个消费者实例在线，该 Group ID 状态即为在线。取值说明如下：
  // 
  // true：状态为在线
  // false：状态为不在线
  online: boolean;
  // 该 Topic 的消费堆积数量
  totalDiff: number;
  static names(): { [key: string]: string } {
    return {
      consumeTps: 'consume_tps',
      delayTime: 'delay_time',
      detailInTopicList: 'detail_in_topic_list',
      lastTimestamp: 'last_timestamp',
      online: 'online',
      totalDiff: 'total_diff',
    };
  }

  static types(): { [key: string]: any } {
    return {
      consumeTps: 'string',
      delayTime: 'number',
      detailInTopicList: { 'type': 'array', 'itemType': DetailInTopicDTO },
      lastTimestamp: 'number',
      online: 'boolean',
      totalDiff: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 采集数据集合
export class TrendTpsDTO extends $tea.Model {
  // 数据集合
  records: StatsDataDTO[];
  // Table 的名称
  title: string;
  // 时间戳，单位毫秒
  xUnit: string;
  // 纵轴单位
  // 
  yUnit: string;
  static names(): { [key: string]: string } {
    return {
      records: 'records',
      title: 'title',
      xUnit: 'x_unit',
      yUnit: 'y_unit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      records: { 'type': 'array', 'itemType': StatsDataDTO },
      title: 'string',
      xUnit: 'string',
      yUnit: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ConsumerTimeSpan查询结果
export class ConsumerTimeSpanDTO extends $tea.Model {
  //  当前 Group 消费该 Topic 的最新的时间
  consumeTimestamp: number;
  // 需查询的消费端 Group ID 所对应的实例 ID
  instanceId: string;
  // 整个 Topic 目前存储的最早的消息的时间
  maxTimestamp: number;
  //  整个 Topic 目前存储的最新的消息的时间
  minTimestamp: number;
  // 需查询的 Topic 名称
  topic: string;
  static names(): { [key: string]: string } {
    return {
      consumeTimestamp: 'consume_timestamp',
      instanceId: 'instance_id',
      maxTimestamp: 'max_timestamp',
      minTimestamp: 'min_timestamp',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      consumeTimestamp: 'number',
      instanceId: 'string',
      maxTimestamp: 'number',
      minTimestamp: 'number',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 二元组
export class Pair extends $tea.Model {
  // 键值对中的 键
  key: string;
  // 键值对中的值
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

// topic
export class Topic extends $tea.Model {
  // creation_time
  creationTime?: string;
  // desc
  desc?: string;
  // eventcode
  eventcode?: string;
  // id
  id?: string;
  // instance_id
  instanceId?: string;
  // topic
  topic?: string;
  // update_time
  updateTime?: string;
  static names(): { [key: string]: string } {
    return {
      creationTime: 'creation_time',
      desc: 'desc',
      eventcode: 'eventcode',
      id: 'id',
      instanceId: 'instance_id',
      topic: 'topic',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      creationTime: 'string',
      desc: 'string',
      eventcode: 'string',
      id: 'string',
      instanceId: 'string',
      topic: 'string',
      updateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Group 统计列表详情
export class GroupStatsItem extends $tea.Model {
  // 每分钟消息大小
  bpm: number;
  // 死信数量
  dlq: number;
  // 消费组 Group ID
  groupId: string;
  // 当前 Group 消息积压的数量
  msgBacklog: number;
  // 当前每分钟 Group ID 拉请求数量
  ppm: number;
  // Topic 名称
  topic: string;
  // 每分钟拉取的消息数量
  tpm: number;
  // 每天拉取的消息数量
  tpd: number;
  static names(): { [key: string]: string } {
    return {
      bpm: 'bpm',
      dlq: 'dlq',
      groupId: 'group_id',
      msgBacklog: 'msg_backlog',
      ppm: 'ppm',
      topic: 'topic',
      tpm: 'tpm',
      tpd: 'tpd',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bpm: 'number',
      dlq: 'number',
      groupId: 'string',
      msgBacklog: 'number',
      ppm: 'number',
      topic: 'string',
      tpm: 'number',
      tpd: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 队列详情信息以及分页信息
export class QueuePageDescDTO extends $tea.Model {
  // 总页数
  pageCount: number;
  // 当前页面
  pageCurrent: number;
  // 页面大小
  pageSize: number;
  // 队列详情信息
  records: QueueDescDTO[];
  // 总记录数
  rowCount: number;
  static names(): { [key: string]: string } {
    return {
      pageCount: 'page_count',
      pageCurrent: 'page_current',
      pageSize: 'page_size',
      records: 'records',
      rowCount: 'row_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageCount: 'number',
      pageCurrent: 'number',
      pageSize: 'number',
      records: { 'type': 'array', 'itemType': QueueDescDTO },
      rowCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// config page
export class ConfigPageDTO extends $tea.Model {
  // config page
  content: ConfigDTO[];
  // 页号
  pageNum: number;
  // 页面大小
  pageSize: number;
  // 总量
  total: number;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      pageNum: 'page_num',
      pageSize: 'page_size',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: { 'type': 'array', 'itemType': ConfigDTO },
      pageNum: 'number',
      pageSize: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// dms
export class WhitelistPageDO extends $tea.Model {
  // content
  content: WhitelistDO[];
  // page_num
  pageNum?: number;
  // page_size
  pageSize?: number;
  // total
  total?: number;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      pageNum: 'page_num',
      pageSize: 'page_size',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: { 'type': 'array', 'itemType': WhitelistDO },
      pageNum: 'number',
      pageSize: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// sofa mq topic page
export class TopicPageDTO extends $tea.Model {
  // Topic 信息
  content: TopicDTO[];
  // 页码
  pageNum: number;
  // 每页显示条数
  pageSize: number;
  // 总条数
  total: number;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      pageNum: 'page_num',
      pageSize: 'page_size',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: { 'type': 'array', 'itemType': TopicDTO },
      pageNum: 'number',
      pageSize: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// trace result返回值
export class TraceMapResultDTO extends $tea.Model {
  // 该查询任务的创建时间
  // 
  // 
  createTime: number;
  //  实例 ID
  instanceId: string;
  // 该查询任务对应的 Message ID
  msgId: string;
  // 该查询任务对应的 Message Key
  msgKey: string;
  // 查询任务 ID
  queryId: string;
  // 该查询任务的结果。取值说明如下：finish：查询完成；working：查询中；removed：任务已删除。
  status: string;
  // 该查询任务的 Topic
  topic: string;
  // 该查询任务的匹配轨迹列表
  // 
  traceList: TraceMapDTO[];
  // 该查询任务的最后更新时间
  updateTime: number;
  //  查询用户 ID
  userId: string;
  static names(): { [key: string]: string } {
    return {
      createTime: 'create_time',
      instanceId: 'instance_id',
      msgId: 'msg_id',
      msgKey: 'msg_key',
      queryId: 'query_id',
      status: 'status',
      topic: 'topic',
      traceList: 'trace_list',
      updateTime: 'update_time',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      createTime: 'number',
      instanceId: 'string',
      msgId: 'string',
      msgKey: 'string',
      queryId: 'string',
      status: 'string',
      topic: 'string',
      traceList: { 'type': 'array', 'itemType': TraceMapDTO },
      updateTime: 'number',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 延迟信息
export class DelayInfo extends $tea.Model {
  // 延迟时间
  name: string;
  // 值
  value: string;
  // 值类型
  valueType: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      value: 'value',
      valueType: 'value_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      value: 'string',
      valueType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// slo配置
export class SloSpec extends $tea.Model {
  // 是否开启
  enable: boolean;
  // 是否是常驻任务
  longRunningTask: boolean;
  // 默认可接受执行时间
  defaultAcceptableExecutionInterval: number;
  static names(): { [key: string]: string } {
    return {
      enable: 'enable',
      longRunningTask: 'long_running_task',
      defaultAcceptableExecutionInterval: 'default_acceptable_execution_interval',
    };
  }

  static types(): { [key: string]: any } {
    return {
      enable: 'boolean',
      longRunningTask: 'boolean',
      defaultAcceptableExecutionInterval: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 队列路由域值
export class QueueRouteEditionDTO extends $tea.Model {
  // 版本
  edition: string;
  // 路由版本（插入时可不填）
  id: number;
  // 路由规则id（插入时可不填）
  routeId: number;
  // 权重
  scale: number;
  static names(): { [key: string]: string } {
    return {
      edition: 'edition',
      id: 'id',
      routeId: 'route_id',
      scale: 'scale',
    };
  }

  static types(): { [key: string]: any } {
    return {
      edition: 'string',
      id: 'number',
      routeId: 'number',
      scale: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 消息同步任务
export class MsgdumpTaskDTO extends $tea.Model {
  // 描述
  remark: string;
  // 源 eventcode
  sourceEventCode: string;
  // 源实例 id
  sourceInstanceId: string;
  // 源 topic
  sourceTopic: string;
  // 任务状态
  // 0: 初始化中；1: 运行中；2: 停止中；3: 已停止
  status: number;
  // 目标实例 id
  targetInstanceId: string;
  // 目标 tag
  targetTag: string;
  // 目标 topic
  targetTopic: string;
  // 任务 id
  taskId: number;
  // 消息同步目标 cell
  cell: string;
  static names(): { [key: string]: string } {
    return {
      remark: 'remark',
      sourceEventCode: 'source_event_code',
      sourceInstanceId: 'source_instance_id',
      sourceTopic: 'source_topic',
      status: 'status',
      targetInstanceId: 'target_instance_id',
      targetTag: 'target_tag',
      targetTopic: 'target_topic',
      taskId: 'task_id',
      cell: 'cell',
    };
  }

  static types(): { [key: string]: any } {
    return {
      remark: 'string',
      sourceEventCode: 'string',
      sourceInstanceId: 'string',
      sourceTopic: 'string',
      status: 'number',
      targetInstanceId: 'string',
      targetTag: 'string',
      targetTopic: 'string',
      taskId: 'number',
      cell: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 消息同步任务源端实例、topic、eventcode
export class MsgdumpSourceInfo extends $tea.Model {
  // 源 instance id
  sourceInstanceId: string;
  // 源端 topic 列表
  sourceTopics: SourceTopic[];
  static names(): { [key: string]: string } {
    return {
      sourceInstanceId: 'source_instance_id',
      sourceTopics: 'source_topics',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sourceInstanceId: 'string',
      sourceTopics: { 'type': 'array', 'itemType': SourceTopic },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// sofamq 审计
export class AuditorDTO extends $tea.Model {
  // 操作名
  action: string;
  // 资源名
  resource: string;
  // 操作详情
  detail: string;
  // 操作人
  operator: string;
  // 时间戳
  timestamp: string;
  static names(): { [key: string]: string } {
    return {
      action: 'action',
      resource: 'resource',
      detail: 'detail',
      operator: 'operator',
      timestamp: 'timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      action: 'string',
      resource: 'string',
      detail: 'string',
      operator: 'string',
      timestamp: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// SofamqTopicStatus 返回data
export class TopicStatusDTO extends $tea.Model {
  // Topic 的最后更新时间时间戳
  lastTimestamp: number;
  // 设置该 Topic 的读写模式。取值说明如下：6：同时支持读写；4：禁写；2：禁读。
  perm: number;
  // 消息总量
  totalCount: number;
  static names(): { [key: string]: string } {
    return {
      lastTimestamp: 'last_timestamp',
      perm: 'perm',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      lastTimestamp: 'number',
      perm: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// SofamqTopicSubDetail接口返回的data信息
export class TopicSubDetailDTO extends $tea.Model {
  // 最近发送时间
  latestSendTime: number;
  // SubscriptionData 数组
  subscriptionDataList: SubscriptionGroupDTO[];
  // Topic 名称
  topic: string;
  static names(): { [key: string]: string } {
    return {
      latestSendTime: 'latest_send_time',
      subscriptionDataList: 'subscription_data_list',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      latestSendTime: 'number',
      subscriptionDataList: { 'type': 'array', 'itemType': SubscriptionGroupDTO },
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 链接信息
export class LinkDTO extends $tea.Model {
  // demo工程
  demoProject: string;
  // 产品文档
  productDoc: string;
  // 快速开始文档
  quickStart: string;
  static names(): { [key: string]: string } {
    return {
      demoProject: 'demo_project',
      productDoc: 'product_doc',
      quickStart: 'quick_start',
    };
  }

  static types(): { [key: string]: any } {
    return {
      demoProject: 'string',
      productDoc: 'string',
      quickStart: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// InstanceCreate返回数据
export class InstanceCreateDTO extends $tea.Model {
  // instance id
  instanceId: string;
  // 实例类型
  instanceType: number;
  static names(): { [key: string]: string } {
    return {
      instanceId: 'instance_id',
      instanceType: 'instance_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instanceId: 'string',
      instanceType: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// topic
export class Binding extends $tea.Model {
  // appName
  appName?: string;
  // creation_time
  creationTime?: string;
  // eventcode
  eventcode?: string;
  // exchangeType
  exchangeType?: string;
  // expression
  expression?: string;
  // group
  group?: string;
  // id
  id?: string;
  // instance_id
  instanceId?: string;
  // persistence
  persistence?: boolean;
  // topic
  topic?: string;
  // update_time
  updateTime?: string;
  static names(): { [key: string]: string } {
    return {
      appName: 'app_name',
      creationTime: 'creation_time',
      eventcode: 'eventcode',
      exchangeType: 'exchange_type',
      expression: 'expression',
      group: 'group',
      id: 'id',
      instanceId: 'instance_id',
      persistence: 'persistence',
      topic: 'topic',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appName: 'string',
      creationTime: 'string',
      eventcode: 'string',
      exchangeType: 'string',
      expression: 'string',
      group: 'string',
      id: 'string',
      instanceId: 'string',
      persistence: 'boolean',
      topic: 'string',
      updateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// string
export class StringDataDo extends $tea.Model {
  // data
  data: string;
  static names(): { [key: string]: string } {
    return {
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 返回 Data 对象
// 
export class GroupSubDetailDTO extends $tea.Model {
  // Group ID
  groupId: string;
  // 部署模型
  messageModel: string;
  // 是否在线
  online: boolean;
  // 订阅信息列表
  subscriptionDataList: SubscriptionTopicDTO[];
  static names(): { [key: string]: string } {
    return {
      groupId: 'group_id',
      messageModel: 'message_model',
      online: 'online',
      subscriptionDataList: 'subscription_data_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      groupId: 'string',
      messageModel: 'string',
      online: 'boolean',
      subscriptionDataList: { 'type': 'array', 'itemType': SubscriptionTopicDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// datacenter
export class DataCenterDO extends $tea.Model {
  // cluster
  cluster: string;
  // datacenter
  datacenter: string;
  // room
  room: string;
  // id
  id: number;
  // gmt_create
  gmtCreate: string;
  // gmt_modified
  gmtModified: string;
  static names(): { [key: string]: string } {
    return {
      cluster: 'cluster',
      datacenter: 'datacenter',
      room: 'room',
      id: 'id',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cluster: 'string',
      datacenter: 'string',
      room: 'string',
      id: 'number',
      gmtCreate: 'string',
      gmtModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 连接器任务
export class ConnectorJob extends $tea.Model {
  // cron表达式描述任务的触发详情。
  cron?: string;
  // sql过滤
  filter?: string;
  // 任务名称
  name: string;
  // 限流值
  rate?: number;
  // 描述这个任务的具体详情
  remark?: string;
  // 去向信息的配置
  sinkConfigs: UIKeyVauleTemplate[];
  // 去向类型
  sinkType: string;
  // 数据源的配置项列表
  sourceConfigs: UIKeyVauleTemplate[];
  // 来源类型
  sourceType: string;
  // 当任务类型选择为once时，会有本字段，表示具体执行的时间
  time?: string;
  // 数据转化
  transformation?: ColumnConfig[];
  // 任务的调度类型
  type: string;
  // 创建时间
  gmtCreate: string;
  // 任务所有者
  app?: string;
  // stepflow平台的某个模板的编号
  stepflowTemplateId?: string;
  // 单例模式
  singleton: boolean;
  // 事件订阅是否开启
  eventSubEnabled?: boolean;
  // 事件订阅的配置集合
  eventSubConfigs?: EventSubConfig[];
  // 可接受延迟时间
  acceptableExecutionInterval?: number;
  // 状态
  status?: string;
  // 工单状态
  processStatus?: string;
  // 是否自动回收实例
  autoRecycleInstance: boolean;
  static names(): { [key: string]: string } {
    return {
      cron: 'cron',
      filter: 'filter',
      name: 'name',
      rate: 'rate',
      remark: 'remark',
      sinkConfigs: 'sink_configs',
      sinkType: 'sink_type',
      sourceConfigs: 'source_configs',
      sourceType: 'source_type',
      time: 'time',
      transformation: 'transformation',
      type: 'type',
      gmtCreate: 'gmt_create',
      app: 'app',
      stepflowTemplateId: 'stepflow_template_id',
      singleton: 'singleton',
      eventSubEnabled: 'event_sub_enabled',
      eventSubConfigs: 'event_sub_configs',
      acceptableExecutionInterval: 'acceptable_execution_interval',
      status: 'status',
      processStatus: 'process_status',
      autoRecycleInstance: 'auto_recycle_instance',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cron: 'string',
      filter: 'string',
      name: 'string',
      rate: 'number',
      remark: 'string',
      sinkConfigs: { 'type': 'array', 'itemType': UIKeyVauleTemplate },
      sinkType: 'string',
      sourceConfigs: { 'type': 'array', 'itemType': UIKeyVauleTemplate },
      sourceType: 'string',
      time: 'string',
      transformation: { 'type': 'array', 'itemType': ColumnConfig },
      type: 'string',
      gmtCreate: 'string',
      app: 'string',
      stepflowTemplateId: 'string',
      singleton: 'boolean',
      eventSubEnabled: 'boolean',
      eventSubConfigs: { 'type': 'array', 'itemType': EventSubConfig },
      acceptableExecutionInterval: 'number',
      status: 'string',
      processStatus: 'string',
      autoRecycleInstance: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 错误报告，包含了错误码，排查指南，请求上下文，支持链接等
export class ErrorReport extends $tea.Model {
  // 组件 数组
  components: UIComponent[];
  static names(): { [key: string]: string } {
    return {
      components: 'components',
    };
  }

  static types(): { [key: string]: any } {
    return {
      components: { 'type': 'array', 'itemType': UIComponent },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分区详情分页结果
export class ConnectorJobPartitionStatusPageResult extends $tea.Model {
  // 页码
  pageNum: number;
  // 每页数量
  pageSize: number;
  // 数据总数
  totalSize?: number;
  // 分区状态
  content: ColumnsValue[];
  static names(): { [key: string]: string } {
    return {
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalSize: 'total_size',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageNum: 'number',
      pageSize: 'number',
      totalSize: 'number',
      content: { 'type': 'array', 'itemType': ColumnsValue },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// MessageTrace信息结构
export class MessageTraceDTO extends $tea.Model {
  // 查询结果
  trackList: MessageTrackDTO[];
  static names(): { [key: string]: string } {
    return {
      trackList: 'track_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      trackList: { 'type': 'array', 'itemType': MessageTrackDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// namespace
export class NamespaceDO extends $tea.Model {
  // gmt_create
  gmtCreate: string;
  // gmt_modified
  gmtModified: string;
  // id
  id: number;
  // instance type
  instanceType?: string;
  // namespace name
  namespaceName: string;
  // workspace
  workspace?: string;
  // workspace group
  workspaceGroup?: string;
  // ldcMode
  ldcMode: number;
  static names(): { [key: string]: string } {
    return {
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      id: 'id',
      instanceType: 'instance_type',
      namespaceName: 'namespace_name',
      workspace: 'workspace',
      workspaceGroup: 'workspace_group',
      ldcMode: 'ldc_mode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      gmtCreate: 'string',
      gmtModified: 'string',
      id: 'number',
      instanceType: 'string',
      namespaceName: 'string',
      workspace: 'string',
      workspaceGroup: 'string',
      ldcMode: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 联动的UI控件模型
export class UnionControlModel extends $tea.Model {
  // 具体的联动 控件模型
  control: UIControlModel;
  // 本联动控件对应的父控件的名称，例如本联动控件是input，父控件是select，想要做到select选择某个特定选项后展示input控件，那么本字段就是 select控件的name。
  unionControl: string;
  // 对应父控件的value为本字段的值时，本联动控件会展示出来。例如：当topicConfig这个select控件的值是 customized时，本联动控件input就能展示了。
  value: string;
  static names(): { [key: string]: string } {
    return {
      control: 'control',
      unionControl: 'union_control',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      control: UIControlModel,
      unionControl: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 查询到的trace信息集合
export class TracePageDTO extends $tea.Model {
  // Trace 信息
  content: TraceDTO[];
  // 页码
  pageNum: number;
  // 每页显示条数
  pageSize: number;
  // 总条数
  total: number;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      pageNum: 'page_num',
      pageSize: 'page_size',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: { 'type': 'array', 'itemType': TraceDTO },
      pageNum: 'number',
      pageSize: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// msgtype
export class MsgTypePageDO extends $tea.Model {
  // msgtypes
  content: MsgTypeDO[];
  // page_num
  pageNum?: number;
  // page_size
  pageSize?: number;
  // total
  total?: number;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      pageNum: 'page_num',
      pageSize: 'page_size',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: { 'type': 'array', 'itemType': MsgTypeDO },
      pageNum: 'number',
      pageSize: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 流程查询请求
export class ProcessQueryDTO extends $tea.Model {
  // 任务名称
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

// 列名称
export class ColumnName extends $tea.Model {
  // 名称
  name: string;
  // 唯一ID
  id: string;
  // 值类型
  valueType: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      id: 'id',
      valueType: 'value_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      id: 'string',
      valueType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// MsgTypeDTO
export class MsgTypeDTO extends $tea.Model {
  // topic name
  topic: string;
  // eventcode
  eventcode: string;
  // desc
  desc?: string;
  static names(): { [key: string]: string } {
    return {
      topic: 'topic',
      eventcode: 'eventcode',
      desc: 'desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      topic: 'string',
      eventcode: 'string',
      desc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// schema详情分页类型
export class SchemaDetailPageDO extends $tea.Model {
  // 页面数量
  pageNum: number;
  // 页大小
  pageSize: number;
  // 总数
  total: number;
  // 内容
  content: SchemaDetailDO[];
  static names(): { [key: string]: string } {
    return {
      pageNum: 'page_num',
      pageSize: 'page_size',
      total: 'total',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageNum: 'number',
      pageSize: 'number',
      total: 'number',
      content: { 'type': 'array', 'itemType': SchemaDetailDO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// topic 统计列表详情
export class TopicStatsItem extends $tea.Model {
  // 该 Topic 每分钟发送的消息大小（byte）
  bpm: number;
  // Topic 名称
  topic: string;
  // 该 Topic 每分钟发送的消息数量
  tpm: number;
  // 该 Topic 每天发送的消息数量	
  // 
  tpd: number;
  // 该 Topic 每天发送的消息大小（byte）	
  // 
  bpd: number;
  static names(): { [key: string]: string } {
    return {
      bpm: 'bpm',
      topic: 'topic',
      tpm: 'tpm',
      tpd: 'tpd',
      bpd: 'bpd',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bpm: 'number',
      topic: 'string',
      tpm: 'number',
      tpd: 'number',
      bpd: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// topic 监控数据点的值
export class TopicMetricItem extends $tea.Model {
  // 当前时间点 Topic 消费的消息数量
  recvCnt: number;
  // 当前时间点 Topic 消费的消息流量（byte）
  recvTraffic: number;
  // 当前时间点 Topic 发送的消息数量
  sendCnt: number;
  // 当前时间点 Topic 发送的消息流量（byte）
  sendTraffic: number;
  // 数据点的时间戳
  timestamp: number;
  static names(): { [key: string]: string } {
    return {
      recvCnt: 'recv_cnt',
      recvTraffic: 'recv_traffic',
      sendCnt: 'send_cnt',
      sendTraffic: 'send_traffic',
      timestamp: 'timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      recvCnt: 'number',
      recvTraffic: 'number',
      sendCnt: 'number',
      sendTraffic: 'number',
      timestamp: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// sofa mq group page
export class GroupPageDTO extends $tea.Model {
  // Group 信息
  content: GroupDTO[];
  // 页码
  pageNum: number;
  // 每页显示条数
  pageSize: number;
  // 总条数
  total: number;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      pageNum: 'page_num',
      pageSize: 'page_size',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: { 'type': 'array', 'itemType': GroupDTO },
      pageNum: 'number',
      pageSize: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 接入点信息
export class EndpointDTO extends $tea.Model {
  // endpoint接口相关的文档
  doc?: string;
  // https类型公网的endpoint接入点
  httpsInternet?: string;
  // http类型内网的endpoint接口
  httpInternal?: string;
  // http类型的公网接入点
  httpInternet?: string;
  // tcp类型的endpoint接口
  tcp?: string;
  static names(): { [key: string]: string } {
    return {
      doc: 'doc',
      httpsInternet: 'https_internet',
      httpInternal: 'http_internal',
      httpInternet: 'http_internet',
      tcp: 'tcp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      doc: 'string',
      httpsInternet: 'string',
      httpInternal: 'string',
      httpInternet: 'string',
      tcp: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 消费端堆栈信息
export class ConsumerJstackDTO extends $tea.Model {
  // 消费端 Client ID
  clientId: string;
  // Jstack 堆栈信息
  jstack: ThreadTrackDTO[];
  static names(): { [key: string]: string } {
    return {
      clientId: 'client_id',
      jstack: 'jstack',
    };
  }

  static types(): { [key: string]: any } {
    return {
      clientId: 'string',
      jstack: { 'type': 'array', 'itemType': ThreadTrackDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// sofa mq instance page
export class InstancePageDTO extends $tea.Model {
  // topic page
  content: InstanceDTO[];
  // 页码
  pageNum: number;
  // 每页条数
  pageSize: number;
  // 总条数
  total: number;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      pageNum: 'page_num',
      pageSize: 'page_size',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: { 'type': 'array', 'itemType': InstanceDTO },
      pageNum: 'number',
      pageSize: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 消费限流DTO
export class ConsumeLimiterDTO extends $tea.Model {
  // 实例ID
  // 
  instanceId: string;
  // 限流类型
  // - UNIT：单元限流，指定单元/CELL限流
  // 
  limiterType: string;
  // 限流资源名，由 GROUP@TOPIC 组成
  // 
  name: string;
  // 限流值配置，BASE 为基准限流值。
  tps: string;
  static names(): { [key: string]: string } {
    return {
      instanceId: 'instance_id',
      limiterType: 'limiter_type',
      name: 'name',
      tps: 'tps',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instanceId: 'string',
      limiterType: 'string',
      name: 'string',
      tps: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 队列路由信息和分页信息
export class QueueRouteRulesPageDTO extends $tea.Model {
  // 规则信息
  records: QueueRouteRulesDTO[];
  // 页面大小
  pageSize: number;
  // 当前页
  pageCurrent: number;
  // 总页数
  pageCount: number;
  // 总记录数
  rowCount: number;
  static names(): { [key: string]: string } {
    return {
      records: 'records',
      pageSize: 'page_size',
      pageCurrent: 'page_current',
      pageCount: 'page_count',
      rowCount: 'row_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      records: { 'type': 'array', 'itemType': QueueRouteRulesDTO },
      pageSize: 'number',
      pageCurrent: 'number',
      pageCount: 'number',
      rowCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 告警查询关系集合
export class WarnPageDTO extends $tea.Model {
  // 报警规则信息
  content: WarnDTO[];
  // 页码
  pageNum: number;
  // 每页显示条数
  pageSize: number;
  // 总条数
  total: number;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      pageNum: 'page_num',
      pageSize: 'page_size',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: { 'type': 'array', 'itemType': WarnDTO },
      pageNum: 'number',
      pageSize: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用服务
export class ApplicationServiceDTO extends $tea.Model {
  // 应用服务id
  id: number;
  // 应用serviceid
  serviceId: string;
  // 应用服务名
  name: string;
  // 应用id
  appId: number;
  // 区分客户端的serviceid和服务端的service_id
  type: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      serviceId: 'service_id',
      name: 'name',
      appId: 'app_id',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      serviceId: 'string',
      name: 'string',
      appId: 'number',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用详情页面
export class ApplicationPageDescDTO extends $tea.Model {
  // 总页数
  pageCount: number;
  // 当前页
  pageCurrent: number;
  // 页面显示数
  pageSize: number;
  // 页面记录
  records: ApplicationDTO[];
  // 总记录数
  rowCount: number;
  static names(): { [key: string]: string } {
    return {
      pageCount: 'page_count',
      pageCurrent: 'page_current',
      pageSize: 'page_size',
      records: 'records',
      rowCount: 'row_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageCount: 'number',
      pageCurrent: 'number',
      pageSize: 'number',
      records: { 'type': 'array', 'itemType': ApplicationDTO },
      rowCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Topic Group历史统计数据点
export class TopicGroupHistoryStatsItem extends $tea.Model {
  // 当前时间点的死信数量
  dlq: number;
  // 当前时间点的消息积压量
  msgBacklog: number;
  // 每分钟消费数据大小
  recvBpm: number;
  // 每分钟拉请求数量
  recvPpm: number;
  // 消费 TPM
  recvTpm: number;
  // 每分钟发送消息大小
  sendBpm: number;
  // 发送 TPM
  sendTpm: number;
  // Unix 时间戳
  timestamp: number;
  static names(): { [key: string]: string } {
    return {
      dlq: 'dlq',
      msgBacklog: 'msg_backlog',
      recvBpm: 'recv_bpm',
      recvPpm: 'recv_ppm',
      recvTpm: 'recv_tpm',
      sendBpm: 'send_bpm',
      sendTpm: 'send_tpm',
      timestamp: 'timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dlq: 'number',
      msgBacklog: 'number',
      recvBpm: 'number',
      recvPpm: 'number',
      recvTpm: 'number',
      sendBpm: 'number',
      sendTpm: 'number',
      timestamp: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 连接器任务分页查询结果
export class ConnectorJobPageResult extends $tea.Model {
  // 任务信息列表
  content: ConnectorJobInfo[];
  // 页码
  pageNum: number;
  // 每页的数量
  pageSize: number;
  // 数据总数
  totalSize: number;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalSize: 'total_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: { 'type': 'array', 'itemType': ConnectorJobInfo },
      pageNum: 'number',
      pageSize: 'number',
      totalSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// dms
export class MsgQueryPageDO extends $tea.Model {
  // data
  content: MsgQueryBatchDO[];
  // page_num
  pageNum?: number;
  // page_size
  pageSize?: number;
  // total
  total?: number;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      pageNum: 'page_num',
      pageSize: 'page_size',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: { 'type': 'array', 'itemType': MsgQueryBatchDO },
      pageNum: 'number',
      pageSize: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// config
export class ConfigDO extends $tea.Model {
  // key
  property: string;
  // target name
  targetName: string;
  // cluster type or broker type
  targetType: string;
  // value
  value: string;
  // id
  id: number;
  // gmt_create
  gmtCreate: string;
  // gmt_modified
  gmtModified: string;
  static names(): { [key: string]: string } {
    return {
      property: 'property',
      targetName: 'target_name',
      targetType: 'target_type',
      value: 'value',
      id: 'id',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      property: 'string',
      targetName: 'string',
      targetType: 'string',
      value: 'string',
      id: 'number',
      gmtCreate: 'string',
      gmtModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 连接器任务查询条件
export class ConnectorJobQuery extends $tea.Model {
  // 任务名称
  name?: string;
  // 任务状态
  status?: string;
  // 排序的列
  sortColumn?: string;
  // increment代表升序排序，decrement代表降序排序。
  // 
  sortType?: string;
  // 应用名
  app?: string;
  // 审批状态
  processStatus?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      status: 'status',
      sortColumn: 'sort_column',
      sortType: 'sort_type',
      app: 'app',
      processStatus: 'process_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      status: 'string',
      sortColumn: 'string',
      sortType: 'string',
      app: 'string',
      processStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 消息体内容的DTO对象，包含SchemaID和消息体内容反序列化后的字符串
export class MessagePayloadDTO extends $tea.Model {
  // 消息对应的Schema的唯一ID
  schemaId: string;
  // 消息体内容的展现
  payload: string;
  static names(): { [key: string]: string } {
    return {
      schemaId: 'schema_id',
      payload: 'payload',
    };
  }

  static types(): { [key: string]: any } {
    return {
      schemaId: 'string',
      payload: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 限流域值
export class QueueLimitValueDTO extends $tea.Model {
  // 条件模式
  cMode: string;
  // 限流域值id(新增限流规则时不填）
  id: number;
  // 限流规则id(新增限流规则时不填）
  limitId: number;
  // 限流域值
  lValue: string;
  // 单位时间
  uTime: string;
  static names(): { [key: string]: string } {
    return {
      cMode: 'c_mode',
      id: 'id',
      limitId: 'limit_id',
      lValue: 'l_value',
      uTime: 'u_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cMode: 'string',
      id: 'number',
      limitId: 'number',
      lValue: 'string',
      uTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// router
export class RouterPageDO extends $tea.Model {
  // 消息路由信息
  content: RouterConfigDO[];
  // 页码
  pageNum: number;
  // 每页显示条数
  pageSize: number;
  // 总条数
  total: number;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      pageNum: 'page_num',
      pageSize: 'page_size',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: { 'type': 'array', 'itemType': RouterConfigDO },
      pageNum: 'number',
      pageSize: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// topic队列信息
export class TopicQueueDTO extends $tea.Model {
  // Topic 名称
  topic: string;
  // Broker 名称
  brokerName: string;
  // brokerip地址
  brokerAddrStr: string;
  // 最后更新时间
  lastUpdateTimestamp: number;
  // 最大 offset 位点
  maxOffset: number;
  // 最小位点
  minOffset: number;
  // 队列 ID
  queueId: number;
  static names(): { [key: string]: string } {
    return {
      topic: 'topic',
      brokerName: 'broker_name',
      brokerAddrStr: 'broker_addr_str',
      lastUpdateTimestamp: 'last_update_timestamp',
      maxOffset: 'max_offset',
      minOffset: 'min_offset',
      queueId: 'queue_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      topic: 'string',
      brokerName: 'string',
      brokerAddrStr: 'string',
      lastUpdateTimestamp: 'number',
      maxOffset: 'number',
      minOffset: 'number',
      queueId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 队列规则信息以及分页信息
export class QueueLimitRulesPageDTO extends $tea.Model {
  // 总页数
  pageCount: number;
  // 当前页
  pageCurrent: number;
  // 每页条数
  pageSize: number;
  // 总记录数
  rowCount: number;
  // 队列规则信息
  records: QueueLimitRulesDTO[];
  static names(): { [key: string]: string } {
    return {
      pageCount: 'page_count',
      pageCurrent: 'page_current',
      pageSize: 'page_size',
      rowCount: 'row_count',
      records: 'records',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageCount: 'number',
      pageCurrent: 'number',
      pageSize: 'number',
      rowCount: 'number',
      records: { 'type': 'array', 'itemType': QueueLimitRulesDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// kv config page
export class KVConfigPageDTO extends $tea.Model {
  // config page
  content: KVConfigDTO[];
  // 页号
  pageNum: number;
  // 页面大小
  pageSize: number;
  // 总量
  total: number;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      pageNum: 'page_num',
      pageSize: 'page_size',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: { 'type': 'array', 'itemType': KVConfigDTO },
      pageNum: 'number',
      pageSize: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 实例信息对象
export class InstanceBaseInfoDTO extends $tea.Model {
  // 各个协议的接入点
  endpoints: EndpointsDTO;
  // 实例是否有命名空间。取值说明如下：
  // 
  // true：拥有独立命名空间，资源命名确保实例内唯一，跨实例之间可重名
  // false：无独立命名空间，实例内或者跨实例之间，资源命名必须全局唯一
  independentNaming: boolean;
  //  实例 ID
  instanceId: string;
  // 实例名称
  instanceName: string;
  // 实例状态。取值说明如下：
  // 
  // 0：铂金版实例部署中
  // 2：后付费实例已欠费
  // 5：后付费实例或铂金版实例服务中
  // 7：铂金版实例升级中且服务可用
  instanceStatus: number;
  // 实例类型。取值说明如下：
  // 
  // 1：后付费实例
  // 2：铂金版实例
  instanceType?: number;
  // 铂金版实例过期时间
  // 
  // 
  releaseTime?: number;
  // 备注
  remark: string;
  static names(): { [key: string]: string } {
    return {
      endpoints: 'endpoints',
      independentNaming: 'independent_naming',
      instanceId: 'instance_id',
      instanceName: 'instance_name',
      instanceStatus: 'instance_status',
      instanceType: 'instance_type',
      releaseTime: 'release_time',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      endpoints: EndpointsDTO,
      independentNaming: 'boolean',
      instanceId: 'string',
      instanceName: 'string',
      instanceStatus: 'number',
      instanceType: 'number',
      releaseTime: 'number',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订阅关系DTO
export class BindingDTO extends $tea.Model {
  // app_name
  appName: string;
  // group
  group: string;
  // topic
  topic: string;
  // eventcode
  eventcode: string;
  // exchange_type
  exchangeType: string;
  // expression
  expression?: string;
  // persistence
  persistence: boolean;
  static names(): { [key: string]: string } {
    return {
      appName: 'app_name',
      group: 'group',
      topic: 'topic',
      eventcode: 'eventcode',
      exchangeType: 'exchange_type',
      expression: 'expression',
      persistence: 'persistence',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appName: 'string',
      group: 'string',
      topic: 'string',
      eventcode: 'string',
      exchangeType: 'string',
      expression: 'string',
      persistence: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 延迟详情
export class DelayDetail extends $tea.Model {
  // 延迟时间
  delayTime?: string;
  // store拉取延迟时间
  storePullDelay?: string;
  // 延迟时间
  lightWriteDelay?: string;
  // 积压数量
  backlog?: number;
  static names(): { [key: string]: string } {
    return {
      delayTime: 'delay_time',
      storePullDelay: 'store_pull_delay',
      lightWriteDelay: 'light_write_delay',
      backlog: 'backlog',
    };
  }

  static types(): { [key: string]: any } {
    return {
      delayTime: 'string',
      storePullDelay: 'string',
      lightWriteDelay: 'string',
      backlog: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 连接器中来源去向信息的配置项描述，包括名称、控件、描述、默认值
export class ConnectorConfigs extends $tea.Model {
  // 前端控件类型
  control: string;
  // 控件描述：中文、展示给用户
  description: string;
  // 配置项名称
  name: string;
  // 选项控件的所有选项
  selectOptions?: string[];
  // radio控件的所有选项
  radioOptions?: string[];
  // 描述本配置的子配置名称，如果本配置是 选项类型，那么如果本选项被选中后，子控件才可见。
  child?: string;
  // 本配置是否可见，也即控件是否被用户可见
  visible: boolean;
  // 代表 本配置 的 父配置名称，便于做 控件间联动
  parent?: string;
  static names(): { [key: string]: string } {
    return {
      control: 'control',
      description: 'description',
      name: 'name',
      selectOptions: 'select_options',
      radioOptions: 'radio_options',
      child: 'child',
      visible: 'visible',
      parent: 'parent',
    };
  }

  static types(): { [key: string]: any } {
    return {
      control: 'string',
      description: 'string',
      name: 'string',
      selectOptions: { 'type': 'array', 'itemType': 'string' },
      radioOptions: { 'type': 'array', 'itemType': 'string' },
      child: 'string',
      visible: 'boolean',
      parent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// cluster
export class ClusterDO extends $tea.Model {
  // appkey
  appkey?: string;
  // cluster
  cluster: string;
  // cluster cluster
  clusterType?: string;
  // 0:单机房
  deployMode?: string;
  // ldc模式
  ldcMode?: string;
  // remark
  remark?: string;
  // id
  id: number;
  // create
  gmtCreate: string;
  // gmt_modified
  gmtModified: string;
  static names(): { [key: string]: string } {
    return {
      appkey: 'appkey',
      cluster: 'cluster',
      clusterType: 'cluster_type',
      deployMode: 'deploy_mode',
      ldcMode: 'ldc_mode',
      remark: 'remark',
      id: 'id',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      appkey: 'string',
      cluster: 'string',
      clusterType: 'string',
      deployMode: 'string',
      ldcMode: 'string',
      remark: 'string',
      id: 'number',
      gmtCreate: 'string',
      gmtModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 管理员用户分页信息
export class AdminUserPageDTO extends $tea.Model {
  // admin user page
  content: AdminUserDTO[];
  // 页号
  pageNum: number;
  // 页面大小
  pageSize: number;
  // 总条数
  total: number;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      pageNum: 'page_num',
      pageSize: 'page_size',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: { 'type': 'array', 'itemType': AdminUserDTO },
      pageNum: 'number',
      pageSize: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 重置任务位点请求
export class ResetJobOffsetRequest extends $tea.Model {
  // 时间戳(单位为s)
  timestamp?: number;
  static names(): { [key: string]: string } {
    return {
      timestamp: 'timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      timestamp: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 消费状态查询结果
export class ConsumptionStatusDTO extends $tea.Model {
  // 实例id
  instanceId: string;
  // 消费端groupId
  groupId: string;
  // 单元化cell
  cell: string;
  // 消费端是否在线
  online: boolean;
  // 总的位点差
  totalDiff: number;
  // 所有订阅关系
  subscriptions: SubscriptionDTO[];
  // 消费者-队列状态
  consumptionStatus: ConsumeQueueOffset[];
  // 消费者客户端状态
  clients: ClientInfoDTO[];
  static names(): { [key: string]: string } {
    return {
      instanceId: 'instance_id',
      groupId: 'group_id',
      cell: 'cell',
      online: 'online',
      totalDiff: 'total_diff',
      subscriptions: 'subscriptions',
      consumptionStatus: 'consumption_status',
      clients: 'clients',
    };
  }

  static types(): { [key: string]: any } {
    return {
      instanceId: 'string',
      groupId: 'string',
      cell: 'string',
      online: 'boolean',
      totalDiff: 'number',
      subscriptions: { 'type': 'array', 'itemType': SubscriptionDTO },
      consumptionStatus: { 'type': 'array', 'itemType': ConsumeQueueOffset },
      clients: { 'type': 'array', 'itemType': ClientInfoDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// SofamqConsumerStatus返回数据
export class ConsumerStatusDTO extends $tea.Model {
  // 该集群当前在线客户端信息
  connectionSet: ConnectionDTO[];
  // 该集群在线客户端详细信息，包含 Jstack、消费 RT 时间等信息
  consumerConnectionInfoList: ConsumerConnectionInfoDTO[];
  // 消费模型。取值说明如下：CLUSTERING：集群消费模式；BROADCASTING：广播消费模式。
  consumeModel: string;
  // 总消费 TPS
  consumeTps: string;
  // 延迟时间
  delayTime: number;
  // 各个 Topic 的消费情况
  detailInTopicList: DetailInTopicDTO[];
  // 实例 ID
  instanceId: string;
  // 最后更新时间
  lastTimestamp: number;
  // 是否在线
  online: boolean;
  // 客户端 Rebalance 是否正常。取值说明如下：true：正常；false：不正常。
  rebalanceOk: boolean;
  // 订阅关系是否一致
  subscriptionSame: boolean;
  // 集群总的消费堆积
  totalDiff: number;
  static names(): { [key: string]: string } {
    return {
      connectionSet: 'connection_set',
      consumerConnectionInfoList: 'consumer_connection_info_list',
      consumeModel: 'consume_model',
      consumeTps: 'consume_tps',
      delayTime: 'delay_time',
      detailInTopicList: 'detail_in_topic_list',
      instanceId: 'instance_id',
      lastTimestamp: 'last_timestamp',
      online: 'online',
      rebalanceOk: 'rebalance_ok',
      subscriptionSame: 'subscription_same',
      totalDiff: 'total_diff',
    };
  }

  static types(): { [key: string]: any } {
    return {
      connectionSet: { 'type': 'array', 'itemType': ConnectionDTO },
      consumerConnectionInfoList: { 'type': 'array', 'itemType': ConsumerConnectionInfoDTO },
      consumeModel: 'string',
      consumeTps: 'string',
      delayTime: 'number',
      detailInTopicList: { 'type': 'array', 'itemType': DetailInTopicDTO },
      instanceId: 'string',
      lastTimestamp: 'number',
      online: 'boolean',
      rebalanceOk: 'boolean',
      subscriptionSame: 'boolean',
      totalDiff: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// message page
export class MessageGetPageDTO extends $tea.Model {
  // 消息的详细信息
  content: MessageGetDTO[];
  // 页码
  pageNum: number;
  // 每页显示条数
  pageSize: number;
  // 第一次新建查询时返回的查询任务 ID，用于后续获取消息。
  taskId?: string;
  // 总页数
  total: number;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      pageNum: 'page_num',
      pageSize: 'page_size',
      taskId: 'task_id',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: { 'type': 'array', 'itemType': MessageGetDTO },
      pageNum: 'number',
      pageSize: 'number',
      taskId: 'string',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分区状态
export class PartitionStatus extends $tea.Model {
  // 分区ID
  id: string;
  // 消费位点
  consumeOffset?: number;
  // 延迟时间
  consumeTime?: string;
  // 积压数量
  backlogNum?: number;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      consumeOffset: 'consume_offset',
      consumeTime: 'consume_time',
      backlogNum: 'backlog_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      consumeOffset: 'number',
      consumeTime: 'string',
      backlogNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// binds
export class BindingPageDO extends $tea.Model {
  // binds
  content?: BindingDO[];
  // page num
  pageNum?: number;
  // page size
  pageSize?: number;
  // total
  total?: number;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      pageNum: 'page_num',
      pageSize: 'page_size',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: { 'type': 'array', 'itemType': BindingDO },
      pageNum: 'number',
      pageSize: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// dms
export class MsgQueryDO extends $tea.Model {
  // delivery_count
  deliveryCount?: number;
  // eventcode
  eventcode: string;
  // gmt_create
  gmtCreate: string;
  // gmt_last_delivery
  gmtLastDelivery: string;
  // gmt_next_delivery
  gmtNextDelivery: string;
  // message_id
  messageId: string;
  // publisher_group
  publisherGroup: string;
  // status
  status?: string;
  // topic
  topic: string;
  // transaction
  transaction?: boolean;
  // subscriber_group_delivery
  subscriberGroupDelivery?: string;
  // subscriber_group_undelivery
  subscriberGroupUndelivery?: string;
  static names(): { [key: string]: string } {
    return {
      deliveryCount: 'delivery_count',
      eventcode: 'eventcode',
      gmtCreate: 'gmt_create',
      gmtLastDelivery: 'gmt_last_delivery',
      gmtNextDelivery: 'gmt_next_delivery',
      messageId: 'message_id',
      publisherGroup: 'publisher_group',
      status: 'status',
      topic: 'topic',
      transaction: 'transaction',
      subscriberGroupDelivery: 'subscriber_group_delivery',
      subscriberGroupUndelivery: 'subscriber_group_undelivery',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deliveryCount: 'number',
      eventcode: 'string',
      gmtCreate: 'string',
      gmtLastDelivery: 'string',
      gmtNextDelivery: 'string',
      messageId: 'string',
      publisherGroup: 'string',
      status: 'string',
      topic: 'string',
      transaction: 'boolean',
      subscriberGroupDelivery: 'string',
      subscriberGroupUndelivery: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// cell by type
export class CellGroupDO extends $tea.Model {
  // cell_type
  cellType: string;
  // cells
  data: string[];
  static names(): { [key: string]: string } {
    return {
      cellType: 'cell_type',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cellType: 'string',
      data: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StatusMqMessageUndeliveryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StatusMqMessageUndeliveryResponse extends $tea.Model {
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

export class UndeliverMessageStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // message type: eventcode
  eventcode: string;
  // group of subscriber
  group: string;
  // middleware instance id
  instanceId: string;
  // interval in seconds to the current time
  intervalInSecond: number;
  // tenant id
  tenant?: string;
  // message type: topic
  topic: string;
  // workspace id
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      eventcode: 'eventcode',
      group: 'group',
      instanceId: 'instance_id',
      intervalInSecond: 'interval_in_second',
      tenant: 'tenant',
      topic: 'topic',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      eventcode: 'string',
      group: 'string',
      instanceId: 'string',
      intervalInSecond: 'number',
      tenant: 'string',
      topic: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UndeliverMessageStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // status of undelivery message
  data: string;
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

export class AddMsgtypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // description of message type
  desc?: string;
  // message type: eventcode
  eventcode: string;
  // middleware instance id
  instanceId: string;
  // tenant id
  tenant?: string;
  // message type: topic
  topic: string;
  // workspace id
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      desc: 'desc',
      eventcode: 'eventcode',
      instanceId: 'instance_id',
      tenant: 'tenant',
      topic: 'topic',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      desc: 'string',
      eventcode: 'string',
      instanceId: 'string',
      tenant: 'string',
      topic: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddMsgtypeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // request result
  data?: boolean;
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
      data: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMsgtypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // description of message type
  desc?: string;
  // message type: eventcode
  eventcode: string;
  // middleware instance id
  instanceId: string;
  // tenant id
  tenant?: string;
  // message type: topic
  topic: string;
  // workspace id
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      desc: 'desc',
      eventcode: 'eventcode',
      instanceId: 'instance_id',
      tenant: 'tenant',
      topic: 'topic',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      desc: 'string',
      eventcode: 'string',
      instanceId: 'string',
      tenant: 'string',
      topic: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMsgtypeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // request result
  data?: boolean;
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
      data: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteMsgtypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // message type: eventcode
  eventcode: string;
  // middleware instance id
  instanceId: string;
  // tenant id
  tenant?: string;
  // message type: topic
  topic: string;
  // workspace id
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      eventcode: 'eventcode',
      instanceId: 'instance_id',
      tenant: 'tenant',
      topic: 'topic',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      eventcode: 'string',
      instanceId: 'string',
      tenant: 'string',
      topic: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteMsgtypeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // request result
  data?: boolean;
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
      data: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMsgtypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // count value
  count?: number;
  // message type: eventcode
  eventcode: string;
  // middleware instance id
  instanceId: string;
  // offset value
  offset?: number;
  // tenant id
  tenant?: string;
  // message type: topic
  topic: string;
  // workspace id
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      count: 'count',
      eventcode: 'eventcode',
      instanceId: 'instance_id',
      offset: 'offset',
      tenant: 'tenant',
      topic: 'topic',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      count: 'number',
      eventcode: 'string',
      instanceId: 'string',
      offset: 'number',
      tenant: 'string',
      topic: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMsgtypeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // request result
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

export class AddBindingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // application name
  appName: string;
  // message type: eventcode
  eventcode: string;
  // binding: exchangeType, "DIRECT" or "HEADER"
  exchangeType: string;
  // binding: expression
  expression?: string;
  // group of subscriber
  group: string;
  // middleware instance id
  instanceId: string;
  // binding: expression
  persistence: boolean;
  // tenant id
  tenant?: string;
  // message type: topic
  topic: string;
  // workspace id
  workspace?: string;
  // zone info
  zone?: string;
  // zone mode
  zoneMode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      eventcode: 'eventcode',
      exchangeType: 'exchange_type',
      expression: 'expression',
      group: 'group',
      instanceId: 'instance_id',
      persistence: 'persistence',
      tenant: 'tenant',
      topic: 'topic',
      workspace: 'workspace',
      zone: 'zone',
      zoneMode: 'zone_mode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      eventcode: 'string',
      exchangeType: 'string',
      expression: 'string',
      group: 'string',
      instanceId: 'string',
      persistence: 'boolean',
      tenant: 'string',
      topic: 'string',
      workspace: 'string',
      zone: 'string',
      zoneMode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddBindingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // request result
  data?: boolean;
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
      data: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBindingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // application name
  appName: string;
  // message type: eventcode
  eventcode: string;
  // binding: exchangeType, "DIRECT" or "HEADER"
  exchangeType: string;
  // binding: expression
  expression?: string;
  // group of subscriber
  group: string;
  // middleware instance id
  instanceId: string;
  // binding: expression
  persistence: boolean;
  // tenant id
  tenant?: string;
  // message type: topic
  topic: string;
  // workspace id
  workspace?: string;
  // zone info
  zone?: string;
  // zone mode
  zoneMode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      eventcode: 'eventcode',
      exchangeType: 'exchange_type',
      expression: 'expression',
      group: 'group',
      instanceId: 'instance_id',
      persistence: 'persistence',
      tenant: 'tenant',
      topic: 'topic',
      workspace: 'workspace',
      zone: 'zone',
      zoneMode: 'zone_mode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      eventcode: 'string',
      exchangeType: 'string',
      expression: 'string',
      group: 'string',
      instanceId: 'string',
      persistence: 'boolean',
      tenant: 'string',
      topic: 'string',
      workspace: 'string',
      zone: 'string',
      zoneMode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBindingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // request result
  data?: boolean;
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
      data: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteBindingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // message type: eventcode
  eventcode: string;
  // group of subscriber
  group: string;
  // middleware instance id
  instanceId: string;
  // tenant id
  tenant?: string;
  // message type: topic
  topic: string;
  // workspace id
  workspace?: string;
  // zone info
  zone?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      eventcode: 'eventcode',
      group: 'group',
      instanceId: 'instance_id',
      tenant: 'tenant',
      topic: 'topic',
      workspace: 'workspace',
      zone: 'zone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      eventcode: 'string',
      group: 'string',
      instanceId: 'string',
      tenant: 'string',
      topic: 'string',
      workspace: 'string',
      zone: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteBindingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // request result
  data?: boolean;
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
      data: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBindingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // application name
  appName?: string;
  // count value
  count?: number;
  // message type: eventcode
  eventcode?: string;
  // group of subscriber
  group?: string;
  // middleware instance id
  instanceId: string;
  // offset value
  offset?: number;
  // tenant id
  tenant?: string;
  // message type: topic
  topic?: string;
  // workspace id
  workspace?: string;
  // zone info
  zone?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      count: 'count',
      eventcode: 'eventcode',
      group: 'group',
      instanceId: 'instance_id',
      offset: 'offset',
      tenant: 'tenant',
      topic: 'topic',
      workspace: 'workspace',
      zone: 'zone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      count: 'number',
      eventcode: 'string',
      group: 'string',
      instanceId: 'string',
      offset: 'number',
      tenant: 'string',
      topic: 'string',
      workspace: 'string',
      zone: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBindingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // request result
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

export class ExecuteSwitchoverRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // target zone
  destCell: string;
  // instance id
  instanceId: string;
  // source zone
  sourceCell: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      destCell: 'dest_cell',
      instanceId: 'instance_id',
      sourceCell: 'source_cell',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      destCell: 'string',
      instanceId: 'string',
      sourceCell: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecuteSwitchoverResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // request result
  success: boolean;
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

export class CancelSwitchoverRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // target zone
  destCell: string;
  // instance id
  instanceId: string;
  // source zone
  sourceCell: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      destCell: 'dest_cell',
      instanceId: 'instance_id',
      sourceCell: 'source_cell',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      destCell: 'string',
      instanceId: 'string',
      sourceCell: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelSwitchoverResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // request result
  success: boolean;
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

export class QuerySwitchoverRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // instance id
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySwitchoverResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // unit list
  actions: SwitchoverAction[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      actions: 'actions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      actions: { 'type': 'array', 'itemType': SwitchoverAction },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetMsgtypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // count value
  count?: number;
  // message type: eventcode
  eventcode: string;
  // middleware instance id
  instanceId: string;
  // offset value
  offset?: number;
  // tenant id
  tenant?: string;
  // message type: topic
  topic: string;
  // workspace id
  workspace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      count: 'count',
      eventcode: 'eventcode',
      instanceId: 'instance_id',
      offset: 'offset',
      tenant: 'tenant',
      topic: 'topic',
      workspace: 'workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      count: 'number',
      eventcode: 'string',
      instanceId: 'string',
      offset: 'number',
      tenant: 'string',
      topic: 'string',
      workspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetMsgtypeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // request result
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

export class UndeliveryMessageStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // end time
  endTime: number;
  // message type: eventcode
  eventcode: string;
  // group of subscriber
  group: string;
  // middleware instance id
  instanceId: string;
  // stauts
  status: string;
  // message type: topic
  topic: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      endTime: 'end_time',
      eventcode: 'eventcode',
      group: 'group',
      instanceId: 'instance_id',
      status: 'status',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      endTime: 'number',
      eventcode: 'string',
      group: 'string',
      instanceId: 'string',
      status: 'string',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UndeliveryMessageStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // count of undelivery message
  totalCount: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTopicsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // eventcode
  eventcode: string;
  // instance id
  instanceId: string;
  // page num
  pageNum: number;
  // page size
  pageSize: number;
  // topic
  topic: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      eventcode: 'eventcode',
      instanceId: 'instance_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      eventcode: 'string',
      instanceId: 'string',
      pageNum: 'number',
      pageSize: 'number',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTopicsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // page num
  pageNum?: number;
  // page size
  pageSize?: number;
  // list
  topics: Topic[];
  // total count
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageNum: 'page_num',
      pageSize: 'page_size',
      topics: 'topics',
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
      topics: { 'type': 'array', 'itemType': Topic },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class IdTopicQueryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id
  id: string;
  // instance id
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class IdTopicQueryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // topic
  topic: Topic;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      topic: Topic,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddTopicRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // desc
  desc: string;
  // eventcode
  eventcode: string;
  // instance id
  instanceId: string;
  // topic
  topic: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      desc: 'desc',
      eventcode: 'eventcode',
      instanceId: 'instance_id',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      desc: 'string',
      eventcode: 'string',
      instanceId: 'string',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddTopicResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // id
  id?: string;
  // instance id
  instanceId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      id: 'id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      id: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTopicRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // desc
  desc: string;
  // id
  id: string;
  // instance id
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      desc: 'desc',
      id: 'id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      desc: 'string',
      id: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTopicResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // id
  id?: string;
  // instance id
  instanceId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      id: 'id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      id: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteTopicRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id
  id: string;
  // instance id
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteTopicResponse extends $tea.Model {
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

export class QueryBindingsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // appname
  appName: string;
  // eventcode
  eventcode: string;
  // group
  group: string;
  // instance id
  instanceId: string;
  // page num
  pageNum: number;
  // page size
  pageSize: number;
  // topic
  topic: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      eventcode: 'eventcode',
      group: 'group',
      instanceId: 'instance_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      eventcode: 'string',
      group: 'string',
      instanceId: 'string',
      pageNum: 'number',
      pageSize: 'number',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBindingsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // list
  bindings: Binding[];
  // page num
  pageNum?: number;
  // page size
  pageSize?: number;
  // total count
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bindings: 'bindings',
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
      bindings: { 'type': 'array', 'itemType': Binding },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class IdBindingQueryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id
  id: string;
  // instance id
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class IdBindingQueryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // binding
  binding: Binding;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      binding: 'binding',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      binding: Binding,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqTopicRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需获取的 Topic 信息列表所对应的实例 ID
  instanceId: string;
  // 页码
  pageNum: number;
  // 每页显示条数
  pageSize: number;
  // 查询指定 Topic 时设置，否则查询所有 Topic
  topic?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      pageNum: 'number',
      pageSize: 'number',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqTopicResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回所有查询到的 Topic 信息列表
  data?: TopicPageDTO;
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
      data: TopicPageDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqTopicRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需创建的 Topic 所对应的实例 ID
  instanceId: string;
  // 消息类型。取值说明如下：0：普通消息；1：分区顺序消息；2：全局顺序消息；4：事务消息；5：定时/延时消息。
  messageType: number;
  // Topic 的备注信息
  remark?: string;
  // 需创建的 Topic 的名称
  topic: string;
  // Topic对应Schema的兼容性策略
  schemaCompatibility?: string;
  // Topic对应Schema的序列化方式
  schemaSerialization?: string;
  // Topic 所属的应用名称，要求 app name 在 zappinfo 上可查
  owner?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      messageType: 'message_type',
      remark: 'remark',
      topic: 'topic',
      schemaCompatibility: 'schema_compatibility',
      schemaSerialization: 'schema_serialization',
      owner: 'owner',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      messageType: 'number',
      remark: 'string',
      topic: 'string',
      schemaCompatibility: 'string',
      schemaSerialization: 'string',
      owner: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqTopicResponse extends $tea.Model {
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

export class DeleteSofamqTopicRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需删除的 Topic 所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
  instanceId: string;
  // 指定删除的 Topic
  topic: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSofamqTopicResponse extends $tea.Model {
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

export class UpdateSofamqTopicRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需更新读写权限的 Topic 所对应的实例 ID
  instanceId: string;
  // 设置该 Topic 的读写模式。取值说明：6：同时支持读写；4：禁写；2：禁读。
  perm: number;
  // 需更新读写权限的 Topic 名称。一个用户下不可重复。
  topic: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      perm: 'perm',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      perm: 'number',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSofamqTopicResponse extends $tea.Model {
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

export class ListSofamqInstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 页号
  pageNum: number;
  // 每页显示条数
  pageSize: number;
  // 实例ID
  instanceId?: string;
  // 用户id
  userId?: string;
  // 集群名
  cluster?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
      instanceId: 'instance_id',
      userId: 'user_id',
      cluster: 'cluster',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageNum: 'number',
      pageSize: 'number',
      instanceId: 'string',
      userId: 'string',
      cluster: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqInstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // instance list
  data?: InstancePageDTO;
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
      data: InstancePageDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqInstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实例名称，长度为 3-64，取值可为中英文
  instanceName: string;
  // 备注信息
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceName: 'instance_name',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceName: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqInstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // InstanceCreate返回数据
  data?: InstanceCreateDTO;
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
      data: InstanceCreateDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSofamqInstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实例ID
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSofamqInstanceResponse extends $tea.Model {
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

export class UpdateSofamqInstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实例ID
  instanceId: string;
  // 实例名
  instanceName: string;
  // 实例描述
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      instanceName: 'instance_name',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      instanceName: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSofamqInstanceResponse extends $tea.Model {
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

export class CreateSofamqGroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 创建的消息端 Group ID
  groupId: string;
  // 需创建的 Group ID 所对应的实例 ID
  instanceId: string;
  // Group ID 描述信息
  remark?: string;
  // 指定创建的 Group ID 适用的协议。TCP 协议和 HTTP 协议的 Group ID 不可以共用，需要分别创建。取值说明如下：
  // 
  // tcp：默认值，表示创建的 Group ID 仅适用于 TCP 协议的消息收发。
  // http：表示创建的 Group ID 仅适用于 HTTP 协议的消息收发。
  groupType?: string;
  // Group 所属的应用名称，要求 app name 在 zappinfo 上可查
  owner?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      groupId: 'group_id',
      instanceId: 'instance_id',
      remark: 'remark',
      groupType: 'group_type',
      owner: 'owner',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      groupId: 'string',
      instanceId: 'string',
      remark: 'string',
      groupType: 'string',
      owner: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqGroupResponse extends $tea.Model {
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

export class ListSofamqGroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询指定 Group ID 时设置，否则查询所有 Group ID
  groupId?: string;
  // 需获取 Group ID 所对应的实例 ID
  instanceId: string;
  // 页码
  pageNum: number;
  // 每页显示数量
  pageSize: number;
  // 查询的 Group ID 适用的协议。TCP 协议和 HTTP 协议的 Group ID 不可以共用，需要分别创建。取值说明如下：
  // 
  // tcp：默认值，表示该 Group ID 仅适用于 TCP 协议的消息收发。
  // http：表示该 Group ID 仅适用于 HTTP 协议的消息收发。
  groupType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      groupId: 'group_id',
      instanceId: 'instance_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
      groupType: 'group_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      groupId: 'string',
      instanceId: 'string',
      pageNum: 'number',
      pageSize: 'number',
      groupType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqGroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询到的订阅关系集合
  data?: GroupPageDTO;
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
      data: GroupPageDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSofamqGroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需要删除的消息消费集群的 Group ID
  groupId: string;
  // 需删除的 Group ID 对应的实例 ID
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      groupId: 'group_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      groupId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSofamqGroupResponse extends $tea.Model {
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

export class UpdateSofamqGroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需配置的 Group ID
  groupId: string;
  // 需配置的 Group ID 所对应的实例 ID
  instanceId: string;
  // 设置读消息开关
  readEnable: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      groupId: 'group_id',
      instanceId: 'instance_id',
      readEnable: 'read_enable',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      groupId: 'string',
      instanceId: 'string',
      readEnable: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSofamqGroupResponse extends $tea.Model {
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

export class QuerySofamqTopicstatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需查询的 Topic 所在的 Cell
  cell?: string;
  // 需查询的 Topic 所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
  instanceId: string;
  // 需查询的 Topic 名称
  topic: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cell: 'cell',
      instanceId: 'instance_id',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cell: 'string',
      instanceId: 'string',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqTopicstatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询到的 Topic 的信息存储数据结构
  data?: TopicStatusDTO;
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
      data: TopicStatusDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqTopicsubdetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需查询的 Topic 所在的单元
  cell?: string;
  // 需查询的 Topic 所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
  instanceId: string;
  // 需查询的 Topic 名称
  topic: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cell: 'cell',
      instanceId: 'instance_id',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cell: 'string',
      instanceId: 'string',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqTopicsubdetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回 Data 对象
  data?: TopicSubDetailDTO;
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
      data: TopicSubDetailDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqNodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // cluster
  cluster?: string;
  // data_center
  dataCenter?: string;
  // hostname
  hostname?: string;
  // node_group
  nodeGroup?: string;
  // room
  room?: string;
  // page num
  pageNum: number;
  // page size
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cluster: 'cluster',
      dataCenter: 'data_center',
      hostname: 'hostname',
      nodeGroup: 'node_group',
      room: 'room',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cluster: 'string',
      dataCenter: 'string',
      hostname: 'string',
      nodeGroup: 'string',
      room: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqNodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // node list
  data?: NodePageDO;
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
      data: NodePageDO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqNodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // cluster
  cluster?: string;
  // hostname
  hostname: string;
  // node_group
  nodeGroup?: string;
  // node_type
  nodeType?: string;
  // perm
  perm?: string;
  // rip
  rip?: string;
  // room
  room?: string;
  // vip
  vip?: string;
  // default
  dataCenter?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cluster: 'cluster',
      hostname: 'hostname',
      nodeGroup: 'node_group',
      nodeType: 'node_type',
      perm: 'perm',
      rip: 'rip',
      room: 'room',
      vip: 'vip',
      dataCenter: 'data_center',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cluster: 'string',
      hostname: 'string',
      nodeGroup: 'string',
      nodeType: 'string',
      perm: 'string',
      rip: 'string',
      room: 'string',
      vip: 'string',
      dataCenter: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqNodeResponse extends $tea.Model {
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

export class CreateSofamqRoomRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // cluster
  cluster: string;
  // endpoint
  endpoint?: string;
  // endpoint_type
  endpointType?: string;
  // region
  region?: string;
  // room
  room: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cluster: 'cluster',
      endpoint: 'endpoint',
      endpointType: 'endpoint_type',
      region: 'region',
      room: 'room',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cluster: 'string',
      endpoint: 'string',
      endpointType: 'string',
      region: 'string',
      room: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqRoomResponse extends $tea.Model {
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

export class CreateSofamqCellRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // cell
  cell: string;
  // cell_type
  cellType?: string;
  // default
  datacenter?: string;
  // endpoint
  endpoint?: string;
  // endpoint_type
  endpointType?: string;
  // ns id
  instanceId: string;
  // room
  room?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cell: 'cell',
      cellType: 'cell_type',
      datacenter: 'datacenter',
      endpoint: 'endpoint',
      endpointType: 'endpoint_type',
      instanceId: 'instance_id',
      room: 'room',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cell: 'string',
      cellType: 'string',
      datacenter: 'string',
      endpoint: 'string',
      endpointType: 'string',
      instanceId: 'string',
      room: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqCellResponse extends $tea.Model {
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

export class CreateSofamqClusterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // appkey
  appkey?: string;
  // cluster
  cluster: string;
  // cluster_type
  clusterType?: string;
  // 0:单机房,1:本地优先,2:交叉部署,3:独占LDC
  deployMode?: string;
  // unshared: 独占
  // shared: 共享
  ldcMode?: string;
  // remark
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appkey: 'appkey',
      cluster: 'cluster',
      clusterType: 'cluster_type',
      deployMode: 'deploy_mode',
      ldcMode: 'ldc_mode',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appkey: 'string',
      cluster: 'string',
      clusterType: 'string',
      deployMode: 'string',
      ldcMode: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqClusterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
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

export class CreateSofamqNamespaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // instance id
  instanceId: string;
  // instance_type
  instanceType?: string;
  // nsid
  namespaceId: string;
  // namespace_name
  namespaceName: string;
  // workspace
  workspace?: string;
  // workspace_group
  workspaceGroup?: string;
  // ldcMode
  ldcMode: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      instanceType: 'instance_type',
      namespaceId: 'namespace_id',
      namespaceName: 'namespace_name',
      workspace: 'workspace',
      workspaceGroup: 'workspace_group',
      ldcMode: 'ldc_mode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      instanceType: 'string',
      namespaceId: 'string',
      namespaceName: 'string',
      workspace: 'string',
      workspaceGroup: 'string',
      ldcMode: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqNamespaceResponse extends $tea.Model {
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

export class ListSofamqRoomRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // cluster
  cluster?: string;
  // region
  region?: string;
  // room
  room?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cluster: 'cluster',
      region: 'region',
      room: 'room',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cluster: 'string',
      region: 'string',
      room: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqRoomResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // room
  data?: RoomDO[];
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
      data: { 'type': 'array', 'itemType': RoomDO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqCellRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // cell名
  cell: string;
  // 需查询的 Group ID 所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
  instanceId: string;
  // 页号
  pageNum: number;
  // 页面大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cell: 'cell',
      instanceId: 'instance_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cell: 'string',
      instanceId: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqCellResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // cell
  data?: CellPageDTO;
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
      data: CellPageDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqClusterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // cluster
  cluster?: string;
  // appkey
  appkey?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cluster: 'cluster',
      appkey: 'appkey',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cluster: 'string',
      appkey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqClusterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // list cell
  data?: ClusterDO[];
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
      data: { 'type': 'array', 'itemType': ClusterDO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqGroupsubdetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需查询的 Group ID 所在的 Cell
  cell?: string;
  // 需查询的 Group ID
  groupId: string;
  // 需查询的 Group ID 所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cell: 'cell',
      groupId: 'group_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cell: 'string',
      groupId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqGroupsubdetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回 Data 信息
  data?: GroupSubDetailDTO;
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
      data: GroupSubDetailDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSofamqInstancebaseinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需查询的实例 ID
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSofamqInstancebaseinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实例信息对象
  data?: InstanceBaseInfoDTO;
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
      data: InstanceBaseInfoDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecSofamqConsumerresetoffsetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需要查询的单元
  // 
  // 
  cell?: string;
  // 需查询的消费端 Group ID
  groupId: string;
  // 需查询的 Group ID 所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
  instanceId: string;
  // 重置位点到指定的时间戳，仅在 Type 为 1 时生效。
  resetTimestamp?: number;
  // 需重置位点的 Topic 名称
  topic: string;
  // 消息清理类型。取值说明如下：
  // 
  // 0：清除所有消息
  // 1：清理到指定时间
  type: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cell: 'cell',
      groupId: 'group_id',
      instanceId: 'instance_id',
      resetTimestamp: 'reset_timestamp',
      topic: 'topic',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cell: 'string',
      groupId: 'string',
      instanceId: 'string',
      resetTimestamp: 'number',
      topic: 'string',
      type: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecSofamqConsumerresetoffsetResponse extends $tea.Model {
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

export class QuerySofamqConsumeraccumulateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需要查询的 Group ID 所在的单元
  cell?: string;
  // 是否查询详细信息。取值说明如下：true：要查询详细信息；false：不查询详细信息（默认值）。
  detail?: boolean;
  // 需查询的消费端 Group ID
  groupId: string;
  // 实例 ID。针对有独立命名空间的实例，该参数为必填。
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cell: 'cell',
      detail: 'detail',
      groupId: 'group_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cell: 'string',
      detail: 'boolean',
      groupId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqConsumeraccumulateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 指定 Consumer 的消费堆积情况
  data?: ConsumerAccumulateDTO;
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
      data: ConsumerAccumulateDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqConsumerconnectionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需要查询的 Group ID 所在的单元
  cell?: string;
  // 需查询的 Group ID
  groupId: string;
  // 需查询的 Group ID 所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cell: 'cell',
      groupId: 'group_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cell: 'string',
      groupId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqConsumerconnectionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 指定 Group ID 的连接信息
  // 
  // 
  data?: ConsumerGetConnectionDTO;
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
      data: ConsumerGetConnectionDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqConsumertimespanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需查询的消费端 Group ID 所在的 Cell
  cell?: string;
  // 需查询的消费端 Group ID
  groupId: string;
  // 需查询的消费端 Group ID 所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
  instanceId: string;
  // 需查询的消费端 Group ID 订阅的 Topic
  topic: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cell: 'cell',
      groupId: 'group_id',
      instanceId: 'instance_id',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cell: 'string',
      groupId: 'string',
      instanceId: 'string',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqConsumertimespanResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询结果
  data?: ConsumerTimeSpanDTO;
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
      data: ConsumerTimeSpanDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqMessagetraceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需要查询的Cell名
  cell?: string;
  // 需查询的消息所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
  instanceId: string;
  // 需查询消息轨迹的消息 ID，即 Message ID
  msgId: string;
  // 消息的 Topic
  topic: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cell: 'cell',
      instanceId: 'instance_id',
      msgId: 'msg_id',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cell: 'string',
      instanceId: 'string',
      msgId: 'string',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqMessagetraceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询结果
  data?: MessageTraceDTO;
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
      data: MessageTraceDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSofamqMessagebymsgidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需查询的消息所在的单元
  cell?: string;
  // 需查询消息所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
  instanceId: string;
  // 需查询的消息的 ID，即 Message ID
  msgId: string;
  // 需查询的消息的 Topic
  topic: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cell: 'cell',
      instanceId: 'instance_id',
      msgId: 'msg_id',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cell: 'string',
      instanceId: 'string',
      msgId: 'string',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSofamqMessagebymsgidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询结果
  data?: MessageGetDTO;
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
      data: MessageGetDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqMessagebykeyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需查询的消息所在的单元
  cell?: string;
  // 需查询的消息所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
  instanceId: string;
  // 需查询的消息的 Message Key
  key: string;
  // 需查询的消息的 Topic
  topic: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cell: 'cell',
      instanceId: 'instance_id',
      key: 'key',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cell: 'string',
      instanceId: 'string',
      key: 'string',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqMessagebykeyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询结果
  data?: MessageGetDTO[];
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
      data: { 'type': 'array', 'itemType': MessageGetDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSofamqTracebymsgidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  //  查询的时间范围的起始时间点
  beginTime: number;
  // 需要查询的单元
  cell?: string;
  // 查询的时间范围的结束时间点
  endTime: number;
  // 需查询的消息的 Topic 所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
  instanceId: string;
  // 需查询的消息的 ID，即 Message ID
  msgId: string;
  // 需查询的消息的 Topic
  topic: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      beginTime: 'begin_time',
      cell: 'cell',
      endTime: 'end_time',
      instanceId: 'instance_id',
      msgId: 'msg_id',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      beginTime: 'number',
      cell: 'string',
      endTime: 'number',
      instanceId: 'string',
      msgId: 'string',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSofamqTracebymsgidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  该查询任务的 ID。可根据该任务 ID，再调用 GetMqSofamqTraceResult 接口获取详细结果。
  queryId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      queryId: 'query_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      queryId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqTracebymsgkeyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  //  查询的时间范围的起始时间点
  beginTime: number;
  // 需要查询的单元
  cell?: string;
  // 查询的时间范围的结束时间点
  endTime: number;
  //  需查询的消息的 Topic 所对应的实例 ID
  instanceId: string;
  //  需查询的消息的 Message Key
  msgKey: string;
  // 需查询的消息的 Topic
  topic: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      beginTime: 'begin_time',
      cell: 'cell',
      endTime: 'end_time',
      instanceId: 'instance_id',
      msgKey: 'msg_key',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      beginTime: 'number',
      cell: 'string',
      endTime: 'number',
      instanceId: 'string',
      msgKey: 'string',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqTracebymsgkeyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 该查询任务的 ID。可根据该任务 ID，再调用 GetMqSofamqTraceResult 接口获取详细结果。
  queryId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      queryId: 'query_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      queryId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSofamqTraceresultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实例 ID
  instanceId: string;
  // 消息轨迹查询的任务 ID
  queryId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      queryId: 'query_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      queryId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSofamqTraceresultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 该查询任务的结果明细
  data?: TraceMapResultDTO;
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
      data: TraceMapResultDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqInputtpsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询区间起始毫秒时间戳
  beginTime: number;
  // 需要查询的Cell名
  cell?: string;
  // 查询区间终止毫秒时间戳
  endTime: number;
  // 指定的 Topic 所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
  instanceId: string;
  // 采样周期，单位分钟，取值可为 1、5、10
  period?: number;
  // 需查询的 Topic 名称
  topic: string;
  // 查询的类型。取值说明如下：
  // 
  // 0：查询指定时间段内 Topic 的写入量
  // 1：查询指定时间段内 Topic 的 TPS 曲线数据
  type: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      beginTime: 'begin_time',
      cell: 'cell',
      endTime: 'end_time',
      instanceId: 'instance_id',
      period: 'period',
      topic: 'topic',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      beginTime: 'number',
      cell: 'string',
      endTime: 'number',
      instanceId: 'string',
      period: 'number',
      topic: 'string',
      type: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqInputtpsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据集合
  data?: TrendTpsDTO;
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
      data: TrendTpsDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqOutputtpsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  //  查询区间起始毫秒时间戳
  beginTime: string;
  // 需要查询的Cell名
  cell?: string;
  //  查询区间终止毫秒时间戳
  endTime: string;
  //  需要查询的 Group ID
  groupId: string;
  // 需统计数据的 Group ID 所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
  instanceId: string;
  // 采样周期，单位分钟，取值可为 1、5、10
  period?: number;
  //  需要查询的 Topic 名称
  topic: string;
  // 查询的类型。取值说明如下：
  // 
  // 0：查询消费消息总量的统计曲线
  // 1：查询消费消息 TPS 的统计曲线
  type: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      beginTime: 'begin_time',
      cell: 'cell',
      endTime: 'end_time',
      groupId: 'group_id',
      instanceId: 'instance_id',
      period: 'period',
      topic: 'topic',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      beginTime: 'string',
      cell: 'string',
      endTime: 'string',
      groupId: 'string',
      instanceId: 'string',
      period: 'number',
      topic: 'string',
      type: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqOutputtpsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据集合
  data?: TrendTpsDTO;
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
      data: TrendTpsDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSofamqDlqbyidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需要查询的单元
  cell?: string;
  // 需查询的消费端 Group ID
  groupId: string;
  // 需查询消息所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
  instanceId: string;
  // 需查询的消息的 ID，即 Message ID
  msgId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cell: 'cell',
      groupId: 'group_id',
      instanceId: 'instance_id',
      msgId: 'msg_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cell: 'string',
      groupId: 'string',
      instanceId: 'string',
      msgId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSofamqDlqbyidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询结果
  data?: MessageGetDTO;
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
      data: MessageGetDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecSofamqDlqresendbyidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需要查询的单元
  cell?: string;
  // 需查询的消费端 Group ID
  groupId: string;
  // 需查询消息所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
  instanceId: string;
  // 需查询的消息的 ID，即 Message ID
  msgId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cell: 'cell',
      groupId: 'group_id',
      instanceId: 'instance_id',
      msgId: 'msg_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cell: 'string',
      groupId: 'string',
      instanceId: 'string',
      msgId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecSofamqDlqresendbyidResponse extends $tea.Model {
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

export class ListSofamqNamespaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // instance_id
  instanceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqNamespaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // ns
  data?: NamespaceDO[];
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
      data: { 'type': 'array', 'itemType': NamespaceDO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendSofamqMessageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 目标单元
  cell?: string;
  // 实例 ID
  instanceId: string;
  // 消息的 Message Key
  key?: string;
  //  消息内容
  message: string;
  // 消息 Tag
  tag?: string;
  // 需要发送的 Topic 名称
  topic: string;
  // 使用的Schema的版本号
  schemaVersion?: number;
  // 消息属性 key-value
  properties?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cell: 'cell',
      instanceId: 'instance_id',
      key: 'key',
      message: 'message',
      tag: 'tag',
      topic: 'topic',
      schemaVersion: 'schema_version',
      properties: 'properties',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cell: 'string',
      instanceId: 'string',
      key: 'string',
      message: 'string',
      tag: 'string',
      topic: 'string',
      schemaVersion: 'number',
      properties: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendSofamqMessageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 消息的 Message ID
  msgId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msgId: 'msg_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msgId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushSofamqMessageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 单元名称
  cell?: string;
  // 需要接收消息的 Client ID
  clientId: string;
  // 需要 push 的消费组 Group ID
  groupId: string;
  // 实例 ID
  instanceId: string;
  // 需要 push 的消息 Message ID
  msgId: string;
  // 需要发送的 Topic 名称
  topic: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cell: 'cell',
      clientId: 'client_id',
      groupId: 'group_id',
      instanceId: 'instance_id',
      msgId: 'msg_id',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cell: 'string',
      clientId: 'string',
      groupId: 'string',
      instanceId: 'string',
      msgId: 'string',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushSofamqMessageResponse extends $tea.Model {
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

export class QuerySofamqNodebynamespaceidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // instanceid
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqNodebynamespaceidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // ndoes
  data?: NodeDO[];
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
      data: { 'type': 'array', 'itemType': NodeDO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqRoombynamespaceidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // instance id
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqRoombynamespaceidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // rooms
  data?: RoomDO[];
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
      data: { 'type': 'array', 'itemType': RoomDO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqMessagebytopicRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  //  查询范围的起始时间戳
  beginTime: number;
  // 需查询的单元
  cell?: string;
  // 查询范围的终止时间戳
  endTime: number;
  // 需查询的消息所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
  instanceId: string;
  // 页码
  pageNum: number;
  // 每页显示条数
  pageSize: number;
  // 查询任务的 ID。首次查询不需要输入，后续取消息必须传入，根据前一次的返回结果取出该字段。
  taskId?: string;
  // 需查询的消息的 Topic 名称
  topic: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      beginTime: 'begin_time',
      cell: 'cell',
      endTime: 'end_time',
      instanceId: 'instance_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
      taskId: 'task_id',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      beginTime: 'number',
      cell: 'string',
      endTime: 'number',
      instanceId: 'string',
      pageNum: 'number',
      pageSize: 'number',
      taskId: 'string',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqMessagebytopicResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分页查询Message
  data?: MessageGetPageDTO;
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
      data: MessageGetPageDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqDlqbygroupidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询范围的起始时间戳
  // 
  // 
  beginTime: number;
  // 需要查询的单元
  cell?: string;
  // 查询范围的终止时间戳
  endTime: number;
  // 需查询的消费端 Group ID
  groupId: string;
  // 需查询的消息所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
  instanceId: string;
  // 页码
  pageNum: number;
  // 每页条数
  pageSize: number;
  // 查询任务的 ID。首次查询不需要输入，后续获取消息必须传入，根据前一次的返回结果取出该字段。
  taskId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      beginTime: 'begin_time',
      cell: 'cell',
      endTime: 'end_time',
      groupId: 'group_id',
      instanceId: 'instance_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      beginTime: 'number',
      cell: 'string',
      endTime: 'number',
      groupId: 'string',
      instanceId: 'string',
      pageNum: 'number',
      pageSize: 'number',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqDlqbygroupidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 消息内容
  data?: MessageGetPageDTO;
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
      data: MessageGetPageDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSofamqConsumerstatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需要查询的单元
  cell?: string;
  // 是否查询详细信息。取值说明如下：true：要查询详细信息；false：不查询详细信息。
  detail?: boolean;
  // 需要查询的消费端 Group ID
  groupId: string;
  // 需查询的 Group ID 所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
  instanceId: string;
  // 是否打印 Jstack 信息
  needJstack?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cell: 'cell',
      detail: 'detail',
      groupId: 'group_id',
      instanceId: 'instance_id',
      needJstack: 'need_jstack',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cell: 'string',
      detail: 'boolean',
      groupId: 'string',
      instanceId: 'string',
      needJstack: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSofamqConsumerstatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询结果
  data?: ConsumerStatusDTO;
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
      data: ConsumerStatusDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSofamqTopicremarkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实例 ID
  instanceId: string;
  // Topic 描述信息
  remark: string;
  // 需更新的 Topic 名称，一个用户下不可重复。
  topic: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      remark: 'remark',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      remark: 'string',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSofamqTopicremarkResponse extends $tea.Model {
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

export class CreateSofamqDatacenterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // cluster
  cluster?: string;
  // datacenter
  datacenter?: string;
  // room
  room?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cluster: 'cluster',
      datacenter: 'datacenter',
      room: 'room',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cluster: 'string',
      datacenter: 'string',
      room: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqDatacenterResponse extends $tea.Model {
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

export class ListSofamqDatacenterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // instance id
  instanceId?: string;
  // cluster
  cluster?: string;
  // datacenter
  datacenter?: string;
  // room
  room?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      cluster: 'cluster',
      datacenter: 'datacenter',
      room: 'room',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      cluster: 'string',
      datacenter: 'string',
      room: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqDatacenterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // datacenter
  data?: DataCenterDO[];
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
      data: { 'type': 'array', 'itemType': DataCenterDO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqConfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 页号
  pageNum: number;
  // 页面大小
  pageSize: number;
  // key
  property?: string;
  // target name
  targetName?: string;
  // cluster or broker type
  targetType?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
      property: 'property',
      targetName: 'target_name',
      targetType: 'target_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageNum: 'number',
      pageSize: 'number',
      property: 'string',
      targetName: 'string',
      targetType: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqConfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // configs
  data?: ConfigPageDTO;
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
      data: ConfigPageDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSofamqGroupremarkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需配置更新的 Group ID
  groupId: string;
  // 实例 ID
  instanceId: string;
  // 描述信息
  remark: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      groupId: 'group_id',
      instanceId: 'instance_id',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      groupId: 'string',
      instanceId: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSofamqGroupremarkResponse extends $tea.Model {
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

export class DownloadSofamqMessageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需配置的 Group ID 所对应的实例 ID
  instanceId: string;
  // topic名
  topic: string;
  //  需查询的消息的 ID，即 Message ID
  msgId: string;
  // 需要查询的Cell名
  cell?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      topic: 'topic',
      msgId: 'msg_id',
      cell: 'cell',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      topic: 'string',
      msgId: 'string',
      cell: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DownloadSofamqMessageResponse extends $tea.Model {
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

export class QueryMetricsTopicRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 结束时间
  // 
  endTime: number;
  // 实例 ID
  instanceId: string;
  // 开始时间
  startTime: number;
  // 需要查询的 Topic 名称。如果 Topic 为 "ALL"，则查询当前租户下所有的 Topic 的数据。
  topic: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      endTime: 'end_time',
      instanceId: 'instance_id',
      startTime: 'start_time',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      endTime: 'number',
      instanceId: 'string',
      startTime: 'number',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMetricsTopicResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结束时间
  // 
  endTime?: number;
  // 每个数据点间隔（毫秒）
  interval?: number;
  // 数据点列表
  // 
  metrics?: TopicMetricItem[];
  // 开始时间
  // 
  startTime?: number;
  // Topic 名称
  topic?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      endTime: 'end_time',
      interval: 'interval',
      metrics: 'metrics',
      startTime: 'start_time',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      endTime: 'number',
      interval: 'number',
      metrics: { 'type': 'array', 'itemType': TopicMetricItem },
      startTime: 'number',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMetricsBacklogRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 结束时间
  // 
  endTime: number;
  // 实例 ID
  // 
  instanceId: string;
  // 开始时间
  startTime: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      endTime: 'end_time',
      instanceId: 'instance_id',
      startTime: 'start_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      endTime: 'number',
      instanceId: 'string',
      startTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMetricsBacklogResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结束时间
  endTime?: number;
  // 每个时间点间隔（毫秒）
  interval?: number;
  // 数据点
  // 
  metrics?: BacklogMetricItem[];
  // 开始时间
  startTime?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      endTime: 'end_time',
      interval: 'interval',
      metrics: 'metrics',
      startTime: 'start_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      endTime: 'number',
      interval: 'number',
      metrics: { 'type': 'array', 'itemType': BacklogMetricItem },
      startTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMetricsOverviewRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实例 ID
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMetricsOverviewResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 消息堆积数量
  backlogNum?: number;
  // 死信消息数量
  dlqNum?: number;
  // 当前租户消费组数量
  groupNum?: number;
  // 订阅关系数量
  subscriptionNum?: number;
  // 当前租户下的 Topic 数量
  topicNum?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      backlogNum: 'backlog_num',
      dlqNum: 'dlq_num',
      groupNum: 'group_num',
      subscriptionNum: 'subscription_num',
      topicNum: 'topic_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      backlogNum: 'number',
      dlqNum: 'number',
      groupNum: 'number',
      subscriptionNum: 'number',
      topicNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqRouterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 目标单元
  destinationCell?: string;
  // 目标实例 ID
  destinationInstanceId: string;
  // 目标 Topic
  destinationTopic?: string;
  // 实例 ID
  instanceId: string;
  // 页码
  pageNum: number;
  // 每页显示条数
  pageSize: number;
  // 源单元
  sourceCell?: string;
  // 源实例 ID
  sourceInstanceId: string;
  // 源 Topic
  sourceTopic?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      destinationCell: 'destination_cell',
      destinationInstanceId: 'destination_instance_id',
      destinationTopic: 'destination_topic',
      instanceId: 'instance_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
      sourceCell: 'source_cell',
      sourceInstanceId: 'source_instance_id',
      sourceTopic: 'source_topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      destinationCell: 'string',
      destinationInstanceId: 'string',
      destinationTopic: 'string',
      instanceId: 'string',
      pageNum: 'number',
      pageSize: 'number',
      sourceCell: 'string',
      sourceInstanceId: 'string',
      sourceTopic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqRouterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 消息路由任务列表页
  data?: RouterPageDO;
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
      data: RouterPageDO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqRouterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 消费端 Group
  consumerId?: string;
  // 消费起始位点。取值范围：0：最小位点；1：最大位点；2：时间戳。
  consumeFromType: number;
  // 消费起始位点时间戳，时间戳的值，单位是秒
  consumeFromValue?: number;
  // 消费终止位点。取值范围：0：最小位点；1：最大位点；2：时间戳。
  consumeToType?: number;
  // 消费终止位点时间戳，时间戳的值，单位是秒
  consumeToValue?: number;
  // 描述信息
  description?: string;
  // 目标单元
  destinationCell: string;
  // 目标实例 ID
  destinationInstanceId: string;
  // 目标 Topic	
  destinationTopic: string;
  // 容灾标识
  disaster?: boolean;
  // 容灾机房
  disasterRecoveryDatacenter?: string;
  // 实例 ID
  instanceId: string;
  // 源单元
  sourceCell: string;
  // 源实例 ID	
  sourceInstanceId: string;
  // 源 Topic
  sourceTopic: string;
  // 过滤 Tag	
  tag?: string;
  // 任务状态。取值说明：0：初始化；1：工作中；2：停止。
  taskStatus?: number;
  // 任务类型。取值范围： 0：LDC 复制；1：非 LDC；2：LDC 容灾。	
  taskType: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      consumerId: 'consumer_id',
      consumeFromType: 'consume_from_type',
      consumeFromValue: 'consume_from_value',
      consumeToType: 'consume_to_type',
      consumeToValue: 'consume_to_value',
      description: 'description',
      destinationCell: 'destination_cell',
      destinationInstanceId: 'destination_instance_id',
      destinationTopic: 'destination_topic',
      disaster: 'disaster',
      disasterRecoveryDatacenter: 'disaster_recovery_datacenter',
      instanceId: 'instance_id',
      sourceCell: 'source_cell',
      sourceInstanceId: 'source_instance_id',
      sourceTopic: 'source_topic',
      tag: 'tag',
      taskStatus: 'task_status',
      taskType: 'task_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      consumerId: 'string',
      consumeFromType: 'number',
      consumeFromValue: 'number',
      consumeToType: 'number',
      consumeToValue: 'number',
      description: 'string',
      destinationCell: 'string',
      destinationInstanceId: 'string',
      destinationTopic: 'string',
      disaster: 'boolean',
      disasterRecoveryDatacenter: 'string',
      instanceId: 'string',
      sourceCell: 'string',
      sourceInstanceId: 'string',
      sourceTopic: 'string',
      tag: 'string',
      taskStatus: 'number',
      taskType: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqRouterResponse extends $tea.Model {
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

export class DeleteSofamqNodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id
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

export class DeleteSofamqNodeResponse extends $tea.Model {
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

export class DeleteSofamqRoomRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id
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

export class DeleteSofamqRoomResponse extends $tea.Model {
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

export class DeleteSofamqCellRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id
  id: number;
  // instance id
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSofamqCellResponse extends $tea.Model {
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

export class DeleteSofamqClusterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id
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

export class DeleteSofamqClusterResponse extends $tea.Model {
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

export class DeleteSofamqNamespaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id
  id: number;
  // instance id
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSofamqNamespaceResponse extends $tea.Model {
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

export class DeleteSofamqDatacenterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id
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

export class DeleteSofamqDatacenterResponse extends $tea.Model {
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

export class DeleteSofamqRouterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 路由任务 ID
  routerId: number;
  // 实例 ID
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      routerId: 'router_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      routerId: 'number',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSofamqRouterResponse extends $tea.Model {
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

export class CreateSofamqConfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // property
  property: string;
  // target_name
  targetName: string;
  // target_type
  targetType: number;
  // value
  value: string;
  // 生效范围，三板斧使用
  scope?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      property: 'property',
      targetName: 'target_name',
      targetType: 'target_type',
      value: 'value',
      scope: 'scope',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      property: 'string',
      targetName: 'string',
      targetType: 'number',
      value: 'string',
      scope: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqConfigResponse extends $tea.Model {
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

export class QuerySofamqCellRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // instance_id
  instanceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqCellResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // cells
  data?: CellDO[];
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
      data: { 'type': 'array', 'itemType': CellDO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqRouterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // instanceId
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqRouterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // router
  data?: RouterConfigDO[];
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
      data: { 'type': 'array', 'itemType': RouterConfigDO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetMiddlewareInstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // curr_tenant
  currTenant: string;
  // curr_workspace
  currWorkspace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      currTenant: 'curr_tenant',
      currWorkspace: 'curr_workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      currTenant: 'string',
      currWorkspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetMiddlewareInstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // instanceid
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

export class GetMiddlewareEndpointRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // instance id
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetMiddlewareEndpointResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // endpoint
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

export class QuerySofamqCellbytypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // instance id
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqCellbytypeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // cells
  data?: CellGroupDO[];
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
      data: { 'type': 'array', 'itemType': CellGroupDO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqTraceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实例 ID
  instanceId: string;
  // 页码
  pageNum: number;
  // 每页显示条数
  pageSize: number;
  // 模糊查询项，可以为 Topic、Message ID 或 Message Key。
  queryItem?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
      queryItem: 'query_item',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      pageNum: 'number',
      pageSize: 'number',
      queryItem: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqTraceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询返回的数据集合
  data?: TracePageDTO;
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
      data: TracePageDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSofamqTraceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实例 ID
  instanceId: string;
  // 待删除的消息轨迹查询任务 ID
  queryId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      queryId: 'query_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      queryId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSofamqTraceResponse extends $tea.Model {
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

export class QuerySofamqTracebytopicRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询的时间范围的起始时间点
  beginTime: number;
  // 需要查询的单元
  cell?: string;
  // 查询的时间范围的结束时间点
  endTime: number;
  // 实例 ID
  instanceId: string;
  // 需查询的消息的 Topic
  topic: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      beginTime: 'begin_time',
      cell: 'cell',
      endTime: 'end_time',
      instanceId: 'instance_id',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      beginTime: 'number',
      cell: 'string',
      endTime: 'number',
      instanceId: 'string',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqTracebytopicResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 该消息轨迹查询任务的 ID
  queryId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      queryId: 'query_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      queryId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushSpiPaycallbackRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // JSON data
  data: string;
  // request_id
  requestId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      data: 'data',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      data: 'string',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushSpiPaycallbackResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回 code
  code?: string;
  // json data
  data?: string;
  // 返回 message
  message?: string;
  // 请求是否成功
  success?: boolean;
  // synchro
  synchro?: string;
  // request_id
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      data: 'data',
      message: 'message',
      success: 'success',
      synchro: 'synchro',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      data: 'string',
      message: 'string',
      success: 'boolean',
      synchro: 'string',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushSpiCompletecommodityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // data
  data: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushSpiCompletecommodityResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // code
  code?: string;
  // data
  data?: string;
  // message
  message?: string;
  // success
  success?: boolean;
  // synchro
  synchro?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      code: 'code',
      data: 'data',
      message: 'message',
      success: 'success',
      synchro: 'synchro',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      code: 'string',
      data: 'string',
      message: 'string',
      success: 'boolean',
      synchro: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushSpiOrderverifyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // data
  data: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushSpiOrderverifyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // success
  success?: boolean;
  // code
  code?: string;
  // message
  message?: string;
  // data
  data?: string;
  // synchro
  synchro?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      code: 'code',
      message: 'message',
      data: 'data',
      synchro: 'synchro',
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
      data: 'string',
      synchro: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushSpiOpencallbackRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // data
  data: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushSpiOpencallbackResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // success
  success?: boolean;
  // code
  code?: string;
  // message
  message?: string;
  // data
  data?: string;
  // synchro
  synchro?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      code: 'code',
      message: 'message',
      data: 'data',
      synchro: 'synchro',
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
      data: 'string',
      synchro: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSofamqLdcbynamespaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // namespace_id
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSofamqLdcbynamespaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // true
  data?: boolean;
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
      data: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSofamqRouterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前状态
  currentStatus: number;
  // 路由任务描述信息
  description: string;
  // 路由任务 ID
  routerId: number;
  // 实例 ID
  instanceId: string;
  // 目标状态
  targetStatus: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      currentStatus: 'current_status',
      description: 'description',
      routerId: 'router_id',
      instanceId: 'instance_id',
      targetStatus: 'target_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      currentStatus: 'number',
      description: 'string',
      routerId: 'number',
      instanceId: 'string',
      targetStatus: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSofamqRouterResponse extends $tea.Model {
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

export class ExecSofamqDlqresendbatchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需要查询的单元
  cell?: string;
  // 需查询的消费端 Group ID
  groupId: string;
  // 需查询消息所对应的实例 ID。
  instanceId: string;
  // 需重发的消息的 ID，即 Message ID，多个消息使用英文逗号分隔
  msgIds: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cell: 'cell',
      groupId: 'group_id',
      instanceId: 'instance_id',
      msgIds: 'msg_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cell: 'string',
      groupId: 'string',
      instanceId: 'string',
      msgIds: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecSofamqDlqresendbatchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 发送失败的消息的 ID，即 Message ID
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

export class ListSofamqWarnRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询指定 Group 的报警规则时设置
  groupId?: string;
  // 实例 ID
  instanceId: string;
  // 页码
  pageNum: number;
  // 每页显示条数
  pageSize: number;
  // 查询指定 Topic 的报警规则时设置
  topic?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      groupId: 'group_id',
      instanceId: 'instance_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      groupId: 'string',
      instanceId: 'string',
      pageNum: 'number',
      pageSize: 'number',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqWarnResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询到的告警规则集合
  data?: WarnPageDTO;
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
      data: WarnPageDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqWarnRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 报警时间范围
  alertTime: string;
  // 报警通知人信息
  contacts: string;
  // 延迟多少秒报报警
  delayTime: number;
  // 报警频率
  frequency: number;
  // 查询指定 Group 时设置
  groupId?: string;
  // 实例 ID
  instanceId: string;
  // 堆积阈值
  threshold: number;
  // 查询指定 Topic 时设置
  topic?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      alertTime: 'alert_time',
      contacts: 'contacts',
      delayTime: 'delay_time',
      frequency: 'frequency',
      groupId: 'group_id',
      instanceId: 'instance_id',
      threshold: 'threshold',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      alertTime: 'string',
      contacts: 'string',
      delayTime: 'number',
      frequency: 'number',
      groupId: 'string',
      instanceId: 'string',
      threshold: 'number',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqWarnResponse extends $tea.Model {
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

export class DeleteSofamqWarnRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实例 ID
  instanceId: string;
  // 待删除的报警规则 ID
  warnId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      warnId: 'warn_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      warnId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSofamqWarnResponse extends $tea.Model {
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

export class UpdateSofamqWarnRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 报警时间范围
  alertTime?: string;
  // 报警通知人信息
  contacts?: string;
  // 延迟多少秒报警
  delayTime?: number;
  // 报警频率
  frequency?: number;
  // 实例 ID
  instanceId: string;
  // 阈值
  threshold?: number;
  // 指定修改的报警规则
  warnId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      alertTime: 'alert_time',
      contacts: 'contacts',
      delayTime: 'delay_time',
      frequency: 'frequency',
      instanceId: 'instance_id',
      threshold: 'threshold',
      warnId: 'warn_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      alertTime: 'string',
      contacts: 'string',
      delayTime: 'number',
      frequency: 'number',
      instanceId: 'string',
      threshold: 'number',
      warnId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSofamqWarnResponse extends $tea.Model {
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

export class EnableSofamqWarnRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实例 ID
  instanceId: string;
  // 待开启的报警规则 ID
  warnId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      warnId: 'warn_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      warnId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class EnableSofamqWarnResponse extends $tea.Model {
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

export class DisableSofamqWarnRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实例 ID
  instanceId: string;
  // 待关闭的报警规则 ID
  warnId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      warnId: 'warn_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      warnId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DisableSofamqWarnResponse extends $tea.Model {
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

export class ListSofamqWarnlogRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 目标单元
  cell?: string;
  // Group ID
  groupId?: string;
  // 实例 ID
  instanceId: string;
  // 页码
  pageNum: number;
  // 每页显示条数
  pageSize: number;
  // Topic 名称
  topic?: string;
  // 报警规则 ID
  warnId?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cell: 'cell',
      groupId: 'group_id',
      instanceId: 'instance_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
      topic: 'topic',
      warnId: 'warn_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cell: 'string',
      groupId: 'string',
      instanceId: 'string',
      pageNum: 'number',
      pageSize: 'number',
      topic: 'string',
      warnId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqWarnlogResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询到的报警日志集合
  data?: WarnLogPageDTO;
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
      data: WarnLogPageDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqAdmintopicRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实例ID
  instanceId?: string;
  // 集群名
  cluster?: string;
  // topic名
  topic?: string;
  // 页号
  pageNum: number;
  //  页面大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      cluster: 'cluster',
      topic: 'topic',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      cluster: 'string',
      topic: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqAdmintopicResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // topic list
  data?: TopicPageDTO;
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
      data: TopicPageDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMetricsTginstantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 要查询的单元
  cell?: string;
  // Group ID
  group: string;
  // 实例 ID
  instanceId: string;
  // Topic 名称
  topic: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cell: 'cell',
      group: 'group',
      instanceId: 'instance_id',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cell: 'string',
      group: 'string',
      instanceId: 'string',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMetricsTginstantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前 Group 死信
  dlq?: number;
  // 当前消息积压
  msgBacklog?: number;
  // 每分钟消费数据大小
  recvBpm?: number;
  // 每分钟拉请求数量
  recvPpm?: number;
  // 消费 TPM
  recvTpm?: number;
  // 每分钟发送消息大小
  sendBpm?: number;
  // 发送 TPM
  sendTpm?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      dlq: 'dlq',
      msgBacklog: 'msg_backlog',
      recvBpm: 'recv_bpm',
      recvPpm: 'recv_ppm',
      recvTpm: 'recv_tpm',
      sendBpm: 'send_bpm',
      sendTpm: 'send_tpm',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      dlq: 'number',
      msgBacklog: 'number',
      recvBpm: 'number',
      recvPpm: 'number',
      recvTpm: 'number',
      sendBpm: 'number',
      sendTpm: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMetricsTghistoryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 要查询的单元
  cell?: string;
  // 结束时间
  endTime: number;
  // 消费组 Group ID
  group: string;
  // 实例 ID
  instanceId: string;
  // 开始时间
  startTime: number;
  // Topic 名称
  topic: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cell: 'cell',
      endTime: 'end_time',
      group: 'group',
      instanceId: 'instance_id',
      startTime: 'start_time',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cell: 'string',
      endTime: 'number',
      group: 'string',
      instanceId: 'string',
      startTime: 'number',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMetricsTghistoryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结束时间
  endTime?: number;
  // 消息点之间的时间间隔（秒），默认为 1
  interval?: number;
  // 具体的统计值
  metrics?: TopicGroupHistoryStatsItem[];
  // 开始时间
  startTime?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      endTime: 'end_time',
      interval: 'interval',
      metrics: 'metrics',
      startTime: 'start_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      endTime: 'number',
      interval: 'number',
      metrics: { 'type': 'array', 'itemType': TopicGroupHistoryStatsItem },
      startTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMetricsInstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实例 ID
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMetricsInstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 消息积压数量
  backlogNum?: number;
  // 死信数量
  dlqNum?: number;
  // 消费组数量
  groupNum?: number;
  // 订阅关系数量
  subscriptionNum?: number;
  // Topic 数量
  topicNum?: number;
  // 数据更新时间戳
  updateAt?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      backlogNum: 'backlog_num',
      dlqNum: 'dlq_num',
      groupNum: 'group_num',
      subscriptionNum: 'subscription_num',
      topicNum: 'topic_num',
      updateAt: 'update_at',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      backlogNum: 'number',
      dlqNum: 'number',
      groupNum: 'number',
      subscriptionNum: 'number',
      topicNum: 'number',
      updateAt: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMetricsInstancehistoryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 结束时间（Unix 时间戳）
  endTime: number;
  // 实例 ID
  instanceId: string;
  // 开始时间（Unix 时间戳）
  startTime: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      endTime: 'end_time',
      instanceId: 'instance_id',
      startTime: 'start_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      endTime: 'number',
      instanceId: 'string',
      startTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMetricsInstancehistoryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 历史统计数据
  metrics?: TopicGroupHistoryStatsItem[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      metrics: 'metrics',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      metrics: { 'type': 'array', 'itemType': TopicGroupHistoryStatsItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryStatsTopicRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 是否降序
  desc?: boolean;
  // 实例 ID
  instanceId: string;
  // 排序字段
  orderIndex?: number;
  // 页码
  pageNum: number;
  // 每页显示条数
  pageSize: number;
  // Unix 时间戳
  timestampSec: number;
  // 过滤查询的 Topic
  topic?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      desc: 'desc',
      instanceId: 'instance_id',
      orderIndex: 'order_index',
      pageNum: 'page_num',
      pageSize: 'page_size',
      timestampSec: 'timestamp_sec',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      desc: 'boolean',
      instanceId: 'string',
      orderIndex: 'number',
      pageNum: 'number',
      pageSize: 'number',
      timestampSec: 'number',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryStatsTopicResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // Topic 统计详情
  metrics?: TopicStatsItem[];
  // 页码
  pageNum?: number;
  // 每页显示条数
  pageSize?: number;
  // 总条数
  totalCount?: number;
  // 报表数据更新的 Unix 时间戳
  updatedAt?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      metrics: 'metrics',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalCount: 'total_count',
      updatedAt: 'updated_at',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      metrics: { 'type': 'array', 'itemType': TopicStatsItem },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
      updatedAt: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryStatsGroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 是否降序，默认为降序
  desc?: boolean;
  // Group ID 过滤
  groupId?: string;
  // 实例 ID
  instanceId: string;
  // 排序字段
  orderIndex?: number;
  // 页码
  pageNum: number;
  // 每页显示条数
  pageSize: number;
  // Unix 时间戳
  timestampSec: number;
  // Topic 过滤
  topic?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      desc: 'desc',
      groupId: 'group_id',
      instanceId: 'instance_id',
      orderIndex: 'order_index',
      pageNum: 'page_num',
      pageSize: 'page_size',
      timestampSec: 'timestamp_sec',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      desc: 'boolean',
      groupId: 'string',
      instanceId: 'string',
      orderIndex: 'number',
      pageNum: 'number',
      pageSize: 'number',
      timestampSec: 'number',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryStatsGroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前实例的所有 Group 统计信息
  metrics?: GroupStatsItem[];
  // 页码
  pageNum?: number;
  // 每页显示条数
  pageSize?: number;
  // 总条数
  totalCount?: number;
  // 报表数据更新的 Unix 时间戳
  updatedAt?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      metrics: 'metrics',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalCount: 'total_count',
      updatedAt: 'updated_at',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      metrics: { 'type': 'array', 'itemType': GroupStatsItem },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
      updatedAt: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqAdmingroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 集群名
  cluster?: string;
  // 组名
  groupId?: string;
  // 实例ID
  instanceId?: string;
  // 页号
  pageNum: number;
  // 页面大小
  pageSize: number;
  // 是否显示router group
  showRouter?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cluster: 'cluster',
      groupId: 'group_id',
      instanceId: 'instance_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
      showRouter: 'show_router',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cluster: 'string',
      groupId: 'string',
      instanceId: 'string',
      pageNum: 'number',
      pageSize: 'number',
      showRouter: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqAdmingroupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // group list
  data?: GroupPageDTO;
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
      data: GroupPageDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqKvconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // key
  key?: string;
  // 命名空间
  namespace?: string;
  // 页号
  pageNum: number;
  // 页面大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      key: 'key',
      namespace: 'namespace',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      key: 'string',
      namespace: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqKvconfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // kv config page
  data?: KVConfigPageDTO;
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
      data: KVConfigPageDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqKvconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 命名空间
  namespace: string;
  // key
  key: string;
  // value
  value: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      namespace: 'namespace',
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      namespace: 'string',
      key: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqKvconfigResponse extends $tea.Model {
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

export class DeleteSofamqKvconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 命名空间
  namespace: string;
  // key
  key: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      namespace: 'namespace',
      key: 'key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      namespace: 'string',
      key: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSofamqKvconfigResponse extends $tea.Model {
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

export class UpdateSofamqKvconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 命名空间
  namespace: string;
  // key
  key: string;
  // 值
  value: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      namespace: 'namespace',
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      namespace: 'string',
      key: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSofamqKvconfigResponse extends $tea.Model {
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

export class DeleteSofamqConfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 目标名
  targetName: string;
  // 目标类型
  targetType: number;
  // 属性名
  property: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      targetName: 'target_name',
      targetType: 'target_type',
      property: 'property',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      targetName: 'string',
      targetType: 'number',
      property: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSofamqConfigResponse extends $tea.Model {
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

export class UpdateSofamqConfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 目标名
  targetName: string;
  // 目标类型
  targetType: number;
  // 配置名
  property: string;
  // 配置值
  value: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      targetName: 'target_name',
      targetType: 'target_type',
      property: 'property',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      targetName: 'string',
      targetType: 'number',
      property: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSofamqConfigResponse extends $tea.Model {
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

export class UpdateSofamqClusterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id
  id: number;
  // appkey
  appkey?: string;
  // cluster
  cluster?: string;
  // deploy_mode
  deployMode?: string;
  // remark
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      appkey: 'appkey',
      cluster: 'cluster',
      deployMode: 'deploy_mode',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      appkey: 'string',
      cluster: 'string',
      deployMode: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSofamqClusterResponse extends $tea.Model {
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

export class UpdateSofamqDatacenterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id
  id: number;
  // datacenter
  datacenter?: string;
  // room
  room?: string;
  // cluster
  cluster?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      datacenter: 'datacenter',
      room: 'room',
      cluster: 'cluster',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      datacenter: 'string',
      room: 'string',
      cluster: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSofamqDatacenterResponse extends $tea.Model {
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

export class UpdateSofamqRoomRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id
  id: number;
  // cluster
  cluster?: string;
  // endpoint
  endpoint?: string;
  // region
  region?: string;
  // room
  room?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      cluster: 'cluster',
      endpoint: 'endpoint',
      region: 'region',
      room: 'room',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      cluster: 'string',
      endpoint: 'string',
      region: 'string',
      room: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSofamqRoomResponse extends $tea.Model {
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

export class UpdateSofamqNodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id
  id: number;
  // cluster
  cluster?: string;
  // data_center
  dataCenter?: string;
  // hostname
  hostname?: string;
  // node_group
  nodeGroup?: string;
  // perm
  perm?: string;
  // rip
  rip?: string;
  // vip
  vip?: string;
  // room
  room?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      cluster: 'cluster',
      dataCenter: 'data_center',
      hostname: 'hostname',
      nodeGroup: 'node_group',
      perm: 'perm',
      rip: 'rip',
      vip: 'vip',
      room: 'room',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      cluster: 'string',
      dataCenter: 'string',
      hostname: 'string',
      nodeGroup: 'string',
      perm: 'string',
      rip: 'string',
      vip: 'string',
      room: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSofamqNodeResponse extends $tea.Model {
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

export class QuerySofamqTopicqueueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需查询的 Topic 所在的 Cell
  cell?: string;
  // 需查询的 Topic 所对应的实例 ID
  instanceId: string;
  // Topic 名称
  topic: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cell: 'cell',
      instanceId: 'instance_id',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cell: 'string',
      instanceId: 'string',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqTopicqueueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // Topic 队列列表
  data?: TopicQueueDTO[];
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
      data: { 'type': 'array', 'itemType': TopicQueueDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqAdmingroupsubdetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // cell名
  cell: string;
  // 需查询的 Group ID
  groupId: string;
  // 需查询的 Topic 所对应的实例 ID。
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cell: 'cell',
      groupId: 'group_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cell: 'string',
      groupId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqAdmingroupsubdetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回data信息
  data?: GroupSubDetailDTO;
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
      data: GroupSubDetailDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqAdminuserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户名
  loginName?: string;
  // 页号
  pageNum: number;
  // 页面大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      loginName: 'login_name',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      loginName: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqAdminuserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 管理员用户分页数据
  data?: AdminUserPageDTO;
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
      data: AdminUserPageDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqAdminuserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 登录名
  loginName: string;
  // 用户密码
  password: string;
  // 用户类型
  userType: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      loginName: 'login_name',
      password: 'password',
      userType: 'user_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      loginName: 'string',
      password: 'string',
      userType: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqAdminuserResponse extends $tea.Model {
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

export class DeleteSofamqAdminuserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 管理员用户名
  loginName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      loginName: 'login_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      loginName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSofamqAdminuserResponse extends $tea.Model {
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

export class ListSofamqAdminapiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 是否显示创建接口
  showCreate?: boolean;
  // 是否显示删除接口
  showDelete?: boolean;
  // 是否显示查询接口
  showRetrieve?: boolean;
  // 是否显示更新接口
  showUpdate?: boolean;
  // 是否显示操作类接口
  showOperation?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      showCreate: 'show_create',
      showDelete: 'show_delete',
      showRetrieve: 'show_retrieve',
      showUpdate: 'show_update',
      showOperation: 'show_operation',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      showCreate: 'boolean',
      showDelete: 'boolean',
      showRetrieve: 'boolean',
      showUpdate: 'boolean',
      showOperation: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqAdminapiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询结果
  data?: ApiInfoDTO[];
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
      data: { 'type': 'array', 'itemType': ApiInfoDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SwitchSofamqAdminapiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // api接口名
  name: string;
  // 开关是否打开
  switchOpen: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      switchOpen: 'switch_open',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      switchOpen: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SwitchSofamqAdminapiResponse extends $tea.Model {
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

export class AddDmsMsgtypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // instance_id
  instanceId: string;
  // topic
  topic: string;
  // eventcode
  eventcode: string;
  // desc
  desc?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      topic: 'topic',
      eventcode: 'eventcode',
      desc: 'desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      topic: 'string',
      eventcode: 'string',
      desc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddDmsMsgtypeResponse extends $tea.Model {
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

export class ListDmsMsgtypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // currentPage
  pageNum: number;
  // eventcode
  eventcode?: string;
  // instance_id
  instanceId: string;
  // page size
  pageSize: number;
  // topic
  topic?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageNum: 'page_num',
      eventcode: 'eventcode',
      instanceId: 'instance_id',
      pageSize: 'page_size',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageNum: 'number',
      eventcode: 'string',
      instanceId: 'string',
      pageSize: 'number',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDmsMsgtypeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // msgtypes
  data?: MsgTypePageDO;
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
      data: MsgTypePageDO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDmsBindingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // appname
  appName: string;
  // eventcode
  eventcode: string;
  // exchange_type
  exchangeType: string;
  // expression
  expression?: string;
  // groupid
  group: string;
  // instance_id
  instanceId: string;
  // persistence
  persistence: boolean;
  // topic
  topic: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      eventcode: 'eventcode',
      exchangeType: 'exchange_type',
      expression: 'expression',
      group: 'group',
      instanceId: 'instance_id',
      persistence: 'persistence',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      eventcode: 'string',
      exchangeType: 'string',
      expression: 'string',
      group: 'string',
      instanceId: 'string',
      persistence: 'boolean',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDmsBindingResponse extends $tea.Model {
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

export class ListDmsBindingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // appname
  appName?: string;
  // eventcode
  eventcode?: string;
  // groupid
  group?: string;
  // current_page
  pageNum?: number;
  // page_size
  pageSize?: number;
  // topic
  topic?: string;
  // ins
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      appName: 'app_name',
      eventcode: 'eventcode',
      group: 'group',
      pageNum: 'page_num',
      pageSize: 'page_size',
      topic: 'topic',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      appName: 'string',
      eventcode: 'string',
      group: 'string',
      pageNum: 'number',
      pageSize: 'number',
      topic: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDmsBindingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: BindingPageDO;
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
      data: BindingPageDO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteDmsMsgtypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id
  id: string;
  // instance_id
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteDmsMsgtypeResponse extends $tea.Model {
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

export class DeleteDmsBindingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id
  id: string;
  // instance_id
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteDmsBindingResponse extends $tea.Model {
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

export class UpdateDmsMsgtypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id
  id: number;
  // instance_id
  instanceId: string;
  // eventcode
  eventcode: string;
  // desc
  desc?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      instanceId: 'instance_id',
      eventcode: 'eventcode',
      desc: 'desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      instanceId: 'string',
      eventcode: 'string',
      desc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDmsMsgtypeResponse extends $tea.Model {
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

export class UpdateDmsBindingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id
  id: string;
  // instance_id
  instanceId: string;
  // eventcode
  eventcode: string;
  // exchange_type
  exchangeType: string;
  // expression
  expression?: string;
  // persistence
  persistence: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      instanceId: 'instance_id',
      eventcode: 'eventcode',
      exchangeType: 'exchange_type',
      expression: 'expression',
      persistence: 'persistence',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
      instanceId: 'string',
      eventcode: 'string',
      exchangeType: 'string',
      expression: 'string',
      persistence: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDmsBindingResponse extends $tea.Model {
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

export class QueryDmsMsgRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id
  id: string;
  // instance_id
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDmsMsgResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: MsgQueryDO;
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
      data: MsgQueryDO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryDmsMsgRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // born_time_begin
  bornTimeBegin: string;
  // born_time_end
  bornTimeEnd: string;
  // current_page
  pageNum?: number;
  // eventcode
  eventcode: string;
  // instance_id
  instanceId: string;
  // page_size
  pageSize?: number;
  // topic
  topic: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bornTimeBegin: 'born_time_begin',
      bornTimeEnd: 'born_time_end',
      pageNum: 'page_num',
      eventcode: 'eventcode',
      instanceId: 'instance_id',
      pageSize: 'page_size',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bornTimeBegin: 'string',
      bornTimeEnd: 'string',
      pageNum: 'number',
      eventcode: 'string',
      instanceId: 'string',
      pageSize: 'number',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryDmsMsgResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: MsgQueryPageDO;
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
      data: MsgQueryPageDO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteDmsMsgRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id
  id: string;
  // instance_id
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteDmsMsgResponse extends $tea.Model {
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

export class BatchdeleteDmsMsgRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id
  id: string;
  // instance_id
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchdeleteDmsMsgResponse extends $tea.Model {
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

export class ExportDmsMsgtypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // instance_id
  instanceId: string;
  // id列表，为空则表示导出当前instance_id全部数据
  ids?: string;
  // field
  field?: string;
  // order
  order?: string;
  // topic
  topic?: string;
  // eventcode
  eventcode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      ids: 'ids',
      field: 'field',
      order: 'order',
      topic: 'topic',
      eventcode: 'eventcode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      ids: 'string',
      field: 'string',
      order: 'string',
      topic: 'string',
      eventcode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportDmsMsgtypeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回的导出结果具体数据
  msgTypeList?: MsgTypeDTO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      msgTypeList: 'msg_type_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      msgTypeList: { 'type': 'array', 'itemType': MsgTypeDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportDmsMsgtypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 导入的excel文件转换成的具体json字符串内容
  content: string;
  // instance_id
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      content: 'content',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      content: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportDmsMsgtypeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 导入内容总条数
  totalCount?: number;
  // 导入成功数量
  successCount?: number;
  // 已经存在的记录总数
  existRecords?: MsgTypeDTO[];
  // 导入失败的记录详情
  processErrorRecords?: MsgTypeDTO[];
  // 格式错误的记录
  formatErrorRecords?: MsgTypeDTO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalCount: 'total_count',
      successCount: 'success_count',
      existRecords: 'exist_records',
      processErrorRecords: 'process_error_records',
      formatErrorRecords: 'format_error_records',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalCount: 'number',
      successCount: 'number',
      existRecords: { 'type': 'array', 'itemType': MsgTypeDTO },
      processErrorRecords: { 'type': 'array', 'itemType': MsgTypeDTO },
      formatErrorRecords: { 'type': 'array', 'itemType': MsgTypeDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportDmsBindingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // instance_id
  instanceId: string;
  // ids
  ids?: string;
  // field
  field?: string;
  // order
  order?: string;
  // appname
  appName?: string;
  // groupid
  group?: string;
  // topic
  topic?: string;
  // eventcode
  eventcode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      ids: 'ids',
      field: 'field',
      order: 'order',
      appName: 'app_name',
      group: 'group',
      topic: 'topic',
      eventcode: 'eventcode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      ids: 'string',
      field: 'string',
      order: 'string',
      appName: 'string',
      group: 'string',
      topic: 'string',
      eventcode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportDmsBindingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 导出数据列表
  bindingList?: BindingDTO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bindingList: 'binding_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bindingList: { 'type': 'array', 'itemType': BindingDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportDmsBindingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // instance_id
  instanceId: string;
  // 导入的excel文件转换成的具体json字符串内容
  content: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportDmsBindingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 导入总数
  totalCount?: number;
  // 导入成功总数
  successCount?: number;
  // 格式化或者参数错误元素列表
  formatErrorRecords?: BindingDTO[];
  // 导入错误元素列表
  processErrorRecords?: BindingDTO[];
  // 已存在元素列表
  existRecords?: BindingDTO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalCount: 'total_count',
      successCount: 'success_count',
      formatErrorRecords: 'format_error_records',
      processErrorRecords: 'process_error_records',
      existRecords: 'exist_records',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalCount: 'number',
      successCount: 'number',
      formatErrorRecords: { 'type': 'array', 'itemType': BindingDTO },
      processErrorRecords: { 'type': 'array', 'itemType': BindingDTO },
      existRecords: { 'type': 'array', 'itemType': BindingDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDmsWhitelistRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // groupid
  group?: string;
  // instance_id
  instanceId: string;
  // page_num
  pageNum?: number;
  // page_size
  pageSize?: number;
  // topic
  topic?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      group: 'group',
      instanceId: 'instance_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      group: 'string',
      instanceId: 'string',
      pageNum: 'number',
      pageSize: 'number',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDmsWhitelistResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: WhitelistPageDO;
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
      data: WhitelistPageDO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddDmsWhitelistRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // groupid
  group: string;
  // instance_id
  instanceId: string;
  // topic
  topic: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      group: 'group',
      instanceId: 'instance_id',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      group: 'string',
      instanceId: 'string',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddDmsWhitelistResponse extends $tea.Model {
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

export class DeleteDmsWhitelistRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // instance_id
  instanceId: string;
  // id
  id: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      id: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteDmsWhitelistResponse extends $tea.Model {
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

export class GetDmsTopicsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // ins
  instanceId: string;
  // group
  group: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      group: 'group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      group: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDmsTopicsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
  data?: string[];
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
      data: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSofamqConsumerjstackRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需要查询的单元
  cell: string;
  // 需要查询的消费端 Client ID
  clientId: string;
  // 需要查询的消费端的 Group ID
  groupId: string;
  // 需要查询的消费者对应的实例 ID
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cell: 'cell',
      clientId: 'client_id',
      groupId: 'group_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cell: 'string',
      clientId: 'string',
      groupId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSofamqConsumerjstackResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 消费端 Jstack 堆栈信息
  data?: ConsumerJstackDTO;
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
      data: ConsumerJstackDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDmsUploadurlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // file_name
  fileName: string;
  // instance_id
  instanceId: string;
  // type
  type: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileName: 'file_name',
      instanceId: 'instance_id',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileName: 'string',
      instanceId: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDmsUploadurlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
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

export class GetDmsMsgtypetemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // instance_id
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDmsMsgtypetemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
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

export class GetDmsBindingtemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // ins
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDmsBindingtemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // data
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

export class QueryMsgdumpSourceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前 instance id
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMsgdumpSourceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 消息同步源端信息
  data?: MsgdumpSourceInfo[];
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
      data: { 'type': 'array', 'itemType': MsgdumpSourceInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateMsgdumpTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // cell
  cell: string;
  // 对消息同步任务的描述
  remark: string;
  // 源端 event code
  sourceEventCode: string;
  // 源端实例 id
  sourceInstanceId: string;
  // 源端 topic
  sourceTopic: string;
  // 目标 tag
  targetTag: string;
  // 目标 topic
  targetTopic: string;
  // 目标 instance id 
  targetInstanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cell: 'cell',
      remark: 'remark',
      sourceEventCode: 'source_event_code',
      sourceInstanceId: 'source_instance_id',
      sourceTopic: 'source_topic',
      targetTag: 'target_tag',
      targetTopic: 'target_topic',
      targetInstanceId: 'target_instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cell: 'string',
      remark: 'string',
      sourceEventCode: 'string',
      sourceInstanceId: 'string',
      sourceTopic: 'string',
      targetTag: 'string',
      targetTopic: 'string',
      targetInstanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateMsgdumpTaskResponse extends $tea.Model {
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

export class QueryMsgdumpTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 源 event code
  sourceEventCode?: string;
  // 源实例 id
  sourceInstanceId?: string;
  // 源 topic
  sourceTopic?: string;
  // 任务状态
  status?: number;
  // 目标 instance id
  targetInstanceId?: string;
  // 目标 tag
  targetTag?: string;
  // 目标 topic
  targetTopic?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sourceEventCode: 'source_event_code',
      sourceInstanceId: 'source_instance_id',
      sourceTopic: 'source_topic',
      status: 'status',
      targetInstanceId: 'target_instance_id',
      targetTag: 'target_tag',
      targetTopic: 'target_topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sourceEventCode: 'string',
      sourceInstanceId: 'string',
      sourceTopic: 'string',
      status: 'number',
      targetInstanceId: 'string',
      targetTag: 'string',
      targetTopic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMsgdumpTaskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务列表
  data?: MsgdumpTaskDTO[];
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
      data: { 'type': 'array', 'itemType': MsgdumpTaskDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteMsgdumpTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务 id
  taskId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteMsgdumpTaskResponse extends $tea.Model {
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

export class EnableMsgdumpTaskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务 id
  taskId: number;
  // true: 启动任务
  // false: 停止任务
  enable: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskId: 'task_id',
      enable: 'enable',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskId: 'number',
      enable: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class EnableMsgdumpTaskResponse extends $tea.Model {
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

export class ListSchemaAdminmetadataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // SOFAMQ的实例ID
  instanceId: string;
  // 名称
  name: string;
  // 页号
  pageNum: number;
  // 页大小
  pageSize: number;
  // schema的租户信息
  schemaTenant?: string;
  // schema的命名空间
  schemaNamespace?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      name: 'name',
      pageNum: 'page_num',
      pageSize: 'page_size',
      schemaTenant: 'schema_tenant',
      schemaNamespace: 'schema_namespace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      name: 'string',
      pageNum: 'number',
      pageSize: 'number',
      schemaTenant: 'string',
      schemaNamespace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSchemaAdminmetadataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据
  data?: SchemaMetadataPageDO;
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
      data: SchemaMetadataPageDO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSchemaAdminmetadataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // SOFAMQ实例ID
  instanceId: string;
  // 应用名称
  app: string;
  // 兼容性策略
  compatibility: string;
  // 描述
  // 
  description: string;
  // 名称
  name: string;
  // 命名空间
  namespace?: string;
  // 租户
  schemaTenant?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      app: 'app',
      compatibility: 'compatibility',
      description: 'description',
      name: 'name',
      namespace: 'namespace',
      schemaTenant: 'schema_tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      app: 'string',
      compatibility: 'string',
      description: 'string',
      name: 'string',
      namespace: 'string',
      schemaTenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSchemaAdminmetadataResponse extends $tea.Model {
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

export class UpdateSchemaAdminmetadataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // SOFAMQ实例ID
  instanceId: string;
  // 应用名
  app?: string;
  // 兼容性
  compatibility?: string;
  // 依赖坐标
  coordinate?: string;
  // 描述
  description?: string;
  // 名称
  name: string;
  // 命名空间
  namespace?: string;
  // 租户
  schemaTenant?: string;
  // 状态
  state?: string;
  // 同步站点
  syncSites?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      app: 'app',
      compatibility: 'compatibility',
      coordinate: 'coordinate',
      description: 'description',
      name: 'name',
      namespace: 'namespace',
      schemaTenant: 'schema_tenant',
      state: 'state',
      syncSites: 'sync_sites',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      app: 'string',
      compatibility: 'string',
      coordinate: 'string',
      description: 'string',
      name: 'string',
      namespace: 'string',
      schemaTenant: 'string',
      state: 'string',
      syncSites: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSchemaAdminmetadataResponse extends $tea.Model {
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

export class DeleteSchemaAdminmetadataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // SOFAMQ的实例ID
  instanceId: string;
  // 名称
  name: string;
  // 命名空间
  namespace?: string;
  // 租户
  schemaTenant?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      name: 'name',
      namespace: 'namespace',
      schemaTenant: 'schema_tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      name: 'string',
      namespace: 'string',
      schemaTenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSchemaAdminmetadataResponse extends $tea.Model {
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

export class ListSchemaAdmindetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // SOFAMQ的实例ID
  instanceId: string;
  // schema 名称
  name: string;
  // 页面编号
  pageNum: number;
  // 页面大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      name: 'name',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      name: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSchemaAdmindetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分页返回值
  data?: SchemaDetailPageDO;
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
      data: SchemaDetailPageDO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSchemaAdmindetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // SOFAMQ的实例ID
  instanceId: string;
  // 内容
  content: string;
  // 值校验
  fieldValidateRule?: string;
  // 名称
  name: string;
  // 命名空间
  namespace?: string;
  // 租户
  schemaTenant?: string;
  // 序列化方式
  serialization: string;
  // 类型
  schemaType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      content: 'content',
      fieldValidateRule: 'field_validate_rule',
      name: 'name',
      namespace: 'namespace',
      schemaTenant: 'schema_tenant',
      serialization: 'serialization',
      schemaType: 'schema_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      content: 'string',
      fieldValidateRule: 'string',
      name: 'string',
      namespace: 'string',
      schemaTenant: 'string',
      serialization: 'string',
      schemaType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSchemaAdmindetailResponse extends $tea.Model {
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

export class DeleteSchemaAdmindetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // uniq_id
  uniqId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      uniqId: 'uniq_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      uniqId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSchemaAdmindetailResponse extends $tea.Model {
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

export class QuerySofamqEndpointRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实例ID
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqEndpointResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接入点列表信息
  data?: EndpointDTO;
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
      data: EndpointDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySchemaAdminmetadataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // SOFAMQ实例ID
  instanceId: string;
  // schema名称
  name: string;
  // 命名空间
  namespace?: string;
  // 租户
  schemaTenant?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      name: 'name',
      namespace: 'namespace',
      schemaTenant: 'schema_tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      name: 'string',
      namespace: 'string',
      schemaTenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySchemaAdminmetadataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // schema元数据
  data?: SchemaMetadataDO;
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
      data: SchemaMetadataDO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySchemaAdminconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 配置类型
  configType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      configType: 'config_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      configType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySchemaAdminconfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 配置列表
  data?: string[];
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
      data: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqLinkRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实例ID
  instanceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqLinkResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链接信息
  data?: LinkDTO;
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
      data: LinkDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqTopicnameRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实例ID
  instanceId: string;
  // 查询数量
  num?: number;
  // 用于模糊搜索的 topic 关键字
  topic?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      num: 'num',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      num: 'number',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqTopicnameResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // topic列表
  data?: string[];
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
      data: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqGroupnameRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实例id
  instanceId: string;
  // 查询最大数量
  num?: number;
  // 用于模糊搜索的 groupId 关键字
  groupId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      num: 'num',
      groupId: 'group_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      num: 'number',
      groupId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqGroupnameResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // group列表
  data?: string[];
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
      data: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqAdmintopicRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 集群名
  cluster: string;
  // 需创建的 Topic 所对应的实例 ID
  instanceId: string;
  // 消息类型。取值说明如下：0：普通消息；1：分区顺序消息；2：全局顺序消息；4：事务消息；5：定时/延时消息。
  messageType: number;
  // Topic 的备注信息
  remark?: string;
  // 生效范围，为三板斧使用
  scope?: string;
  // 需创建的 Topic 的名称
  topic: string;
  // Topic 权限，6为可读可写，4为可读
  perm?: string;
  // Topic 所属的应用名称，要求 app name 在 appinfo 上可查
  owner?: string;
  // 标识该 topic 的消息是否具有优先级
  priority?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cluster: 'cluster',
      instanceId: 'instance_id',
      messageType: 'message_type',
      remark: 'remark',
      scope: 'scope',
      topic: 'topic',
      perm: 'perm',
      owner: 'owner',
      priority: 'priority',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cluster: 'string',
      instanceId: 'string',
      messageType: 'number',
      remark: 'string',
      scope: 'string',
      topic: 'string',
      perm: 'string',
      owner: 'string',
      priority: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqAdmintopicResponse extends $tea.Model {
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

export class CreateSofamqAdmingroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 集群名
  cluster: string;
  // Group ID
  groupId: string;
  // group协议类型
  groupType?: string;
  // 实例ID
  instanceId: string;
  // Group ID 描述信息
  remark?: string;
  // 生效范围，三板斧使用
  scope?: string;
  // Group 所属的应用名称，要求 app name 在 zappinfo 上可查
  owner?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cluster: 'cluster',
      groupId: 'group_id',
      groupType: 'group_type',
      instanceId: 'instance_id',
      remark: 'remark',
      scope: 'scope',
      owner: 'owner',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cluster: 'string',
      groupId: 'string',
      groupType: 'string',
      instanceId: 'string',
      remark: 'string',
      scope: 'string',
      owner: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqAdmingroupResponse extends $tea.Model {
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

export class QuerySofamqConnectorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务名称
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqConnectorResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 连接器任务实体
  data?: ConnectorJob;
  // 错误报告
  errorReport?: ErrorReport;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      errorReport: 'error_report',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: ConnectorJob,
      errorReport: ErrorReport,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqConnectorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // cron表达式描述任务触发，如果类型是cron的话
  cron?: string;
  // 数据过滤，支持SQL92过滤
  filter?: string;
  // 实例编号
  instanceId: string;
  // 任务名称
  name: string;
  // 限流值
  rate?: number;
  // 描述任务
  remark?: string;
  // 去向信息的配置, kv结构的数组 的 JSON String
  sinkConfigs: string;
  // 去向类型
  sinkType: string;
  // 来源的配置项列表， kv结构数组 的 JSON String
  sourceConfigs: string;
  // 来源类型
  sourceType: string;
  // 如果类型是once的话，给定一个unix时间戳
  time?: number;
  // 数据转化配置。数据转化配置的数组 的JSON String
  transformation?: string;
  // 任务调度类型
  type: string;
  // 任务所有者，一般是app维度
  app: string;
  // stepflow平台上的某个 模板编号
  stepflowTemplateId?: string;
  // 时间订阅的配置，json格式
  eventSubConfigs?: string;
  // 事件订阅是否开启
  eventSubEnabled: boolean;
  // 预期完成时间(s)
  acceptableExecutionInterval?: number;
  // 是否自动回收实例
  autoRecycleInstance?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cron: 'cron',
      filter: 'filter',
      instanceId: 'instance_id',
      name: 'name',
      rate: 'rate',
      remark: 'remark',
      sinkConfigs: 'sink_configs',
      sinkType: 'sink_type',
      sourceConfigs: 'source_configs',
      sourceType: 'source_type',
      time: 'time',
      transformation: 'transformation',
      type: 'type',
      app: 'app',
      stepflowTemplateId: 'stepflow_template_id',
      eventSubConfigs: 'event_sub_configs',
      eventSubEnabled: 'event_sub_enabled',
      acceptableExecutionInterval: 'acceptable_execution_interval',
      autoRecycleInstance: 'auto_recycle_instance',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cron: 'string',
      filter: 'string',
      instanceId: 'string',
      name: 'string',
      rate: 'number',
      remark: 'string',
      sinkConfigs: 'string',
      sinkType: 'string',
      sourceConfigs: 'string',
      sourceType: 'string',
      time: 'number',
      transformation: 'string',
      type: 'string',
      app: 'string',
      stepflowTemplateId: 'string',
      eventSubConfigs: 'string',
      eventSubEnabled: 'boolean',
      acceptableExecutionInterval: 'number',
      autoRecycleInstance: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqConnectorResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误报告
  errorReport?: ErrorReport;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      errorReport: 'error_report',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      errorReport: ErrorReport,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqConnectorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 页码
  pageNum: number;
  // 每页大小
  pageSize: number;
  // 任务查询条件
  query?: ConnectorJobQuery;
  // 租户实例编号
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
      query: 'query',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageNum: 'number',
      pageSize: 'number',
      query: ConnectorJobQuery,
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqConnectorResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 连接器分页查询结果
  data?: ConnectorJobPageResult;
  // 错误报告
  errorReport?: ErrorReport;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      errorReport: 'error_report',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: ConnectorJobPageResult,
      errorReport: ErrorReport,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSofamqConnectorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务名称
  name: string;
  // 租户实例编号
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSofamqConnectorResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误报告
  errorReport?: ErrorReport;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      errorReport: 'error_report',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      errorReport: ErrorReport,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class EnableSofamqConnectorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务名称
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class EnableSofamqConnectorResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务名称
  name?: string;
  // 租户实例编号
  instanceId?: string;
  // 错误报告
  errorReport?: ErrorReport;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      name: 'name',
      instanceId: 'instance_id',
      errorReport: 'error_report',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      name: 'string',
      instanceId: 'string',
      errorReport: ErrorReport,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DisableSofamqConnectorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务名称
  name: string;
  // 租户实例
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DisableSofamqConnectorResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误报告
  errorReport?: ErrorReport;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      errorReport: 'error_report',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      errorReport: ErrorReport,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqConnectorscheuletypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqConnectorscheuletypeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务的调度类型 列表
  data?: string[];
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
      data: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqConnectorsourcetypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqConnectorsourcetypeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 所有支持的来源类型
  data?: string[];
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
      data: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqConnectorsinktypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqConnectorsinktypeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 所有支持的去向类型
  data?: string[];
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
      data: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class LoadSofamqConnectorconfigsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据源的类型，代表是来源还是去向，只有两种，对应的值是source 和 sink
  type: string;
  // 具体的来源或者去向的类型
  value: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      type: 'type',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      type: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class LoadSofamqConnectorconfigsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 连接器来源或者去向的 配置详情
  data?: UIControlModel[];
  // 错误报告
  errorReport?: ErrorReport;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      errorReport: 'error_report',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': UIControlModel },
      errorReport: ErrorReport,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqConnectordateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务名称
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqConnectordateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回该任务的执行计划的实例摘要
  data?: InstanceDigest[];
  // 时间列表
  dateList?: string[];
  // 错误报告
  errorReport?: ErrorReport;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      dateList: 'date_list',
      errorReport: 'error_report',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': InstanceDigest },
      dateList: { 'type': 'array', 'itemType': 'string' },
      errorReport: ErrorReport,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqConnectorrecordRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务执行摘要
  digest: InstanceDigest;
  // 任务名称
  name: string;
  // 时间，本字段已经废除，不需要传递
  date?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      digest: 'digest',
      name: 'name',
      date: 'date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      digest: InstanceDigest,
      name: 'string',
      date: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqConnectorrecordResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 任务执行记录
  records?: JobRecordDTO;
  // 错误报告
  errorReport?: ErrorReport;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      records: 'records',
      errorReport: 'error_report',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      records: JobRecordDTO,
      errorReport: ErrorReport,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class LoadSofamqConnectorsourceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 来源的配置信息。source kv结构配置 数组 的 JSON String
  sourceConfigs: string;
  // 数据源类型
  sourceType: string;
  // 任务名称，仅仅在任务修改时需要传递
  name?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sourceConfigs: 'source_configs',
      sourceType: 'source_type',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sourceConfigs: 'string',
      sourceType: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class LoadSofamqConnectorsourceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 来源的数据结构信息，包括名称、类型、别名、转化类型
  data?: ColumnConfig[];
  // 错误报告
  errorReport?: ErrorReport;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      errorReport: 'error_report',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': ColumnConfig },
      errorReport: ErrorReport,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMeshQueueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 队列名称
  name?: string;
  // 当前页码值
  pageCurrent: number;
  // 页面显示数
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      pageCurrent: 'page_current',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      pageCurrent: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMeshQueueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 队列详情以及分页信息
  data?: QueuePageDescDTO;
  // 状态
  state?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: QueuePageDescDTO,
      state: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportMeshQueueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 关联应用名
  assoApp: string;
  // 通道名
  channel: string;
  // 队列管理器ip
  ip: string;
  // 队列管理器名
  manager: string;
  // 队列名称
  name: string;
  // 队列管理器端口
  port: string;
  // 队列类型
  type: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      assoApp: 'asso_app',
      channel: 'channel',
      ip: 'ip',
      manager: 'manager',
      name: 'name',
      port: 'port',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      assoApp: 'string',
      channel: 'string',
      ip: 'string',
      manager: 'string',
      name: 'string',
      port: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportMeshQueueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态
  state?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      state: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteMeshQueueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 队列id
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

export class DeleteMeshQueueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态
  state?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      state: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMeshQueueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 关联应用名
  assoApp: string;
  // 通道名
  channel: string;
  // 队列id
  id: number;
  // 队列管理器ip
  ip: string;
  // 队列管理器名
  manager: string;
  // 队列名称
  name: string;
  // 队列管理器端口
  port: string;
  // 队列类型
  type: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      assoApp: 'asso_app',
      channel: 'channel',
      id: 'id',
      ip: 'ip',
      manager: 'manager',
      name: 'name',
      port: 'port',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      assoApp: 'string',
      channel: 'string',
      id: 'number',
      ip: 'string',
      manager: 'string',
      name: 'string',
      port: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMeshQueueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回状态码
  state?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      state: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMeshQueuelimitrulesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 队列id
  id: string;
  // 限流规则名称
  name?: string;
  // 当前页
  pageCurrent: number;
  // 每页记录数
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      name: 'name',
      pageCurrent: 'page_current',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'string',
      name: 'string',
      pageCurrent: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMeshQueuelimitrulesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 队列规则信息和分页信息
  data?: QueueLimitRulesPageDTO[];
  // 状态
  state?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': QueueLimitRulesPageDTO },
      state: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSofamqConnectorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // cron表达式描述任务触发，如果类型是cron的话
  cron?: string;
  // 数据过滤，支持SQL92过滤
  filter?: string;
  // 实例编号
  instanceId: string;
  // 任务名称
  name: string;
  // 限流值
  rate?: number;
  // 任务描述
  remark?: string;
  // 去向信息的配置，配置信息数组的 jsonString
  sinkConfigs: string;
  // 去向类型
  sinkType: string;
  // 	
  // 来源的配置项列表，配置数据数组 的JSONString
  sourceConfigs: string;
  // 来源类型
  sourceType: string;
  // 如果类型是once的话，给定一个unix时间戳
  time?: number;
  // 数据转化配置，转化配置数组的 JSONString
  transformation?: string;
  // 任务调度类型
  type: string;
  // 所属应用
  app: string;
  // stepflow_template_id 
  stepflowTemplateId?: string;
  // 事件订阅的配置，json格式
  eventSubConfigs?: string;
  // 事件订阅是否生效
  eventSubEnabled: boolean;
  // SLO时间
  acceptableExecutionInterval: number;
  // 是否自动回收实例
  autoRecycleInstance?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cron: 'cron',
      filter: 'filter',
      instanceId: 'instance_id',
      name: 'name',
      rate: 'rate',
      remark: 'remark',
      sinkConfigs: 'sink_configs',
      sinkType: 'sink_type',
      sourceConfigs: 'source_configs',
      sourceType: 'source_type',
      time: 'time',
      transformation: 'transformation',
      type: 'type',
      app: 'app',
      stepflowTemplateId: 'stepflow_template_id',
      eventSubConfigs: 'event_sub_configs',
      eventSubEnabled: 'event_sub_enabled',
      acceptableExecutionInterval: 'acceptable_execution_interval',
      autoRecycleInstance: 'auto_recycle_instance',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cron: 'string',
      filter: 'string',
      instanceId: 'string',
      name: 'string',
      rate: 'number',
      remark: 'string',
      sinkConfigs: 'string',
      sinkType: 'string',
      sourceConfigs: 'string',
      sourceType: 'string',
      time: 'number',
      transformation: 'string',
      type: 'string',
      app: 'string',
      stepflowTemplateId: 'string',
      eventSubConfigs: 'string',
      eventSubEnabled: 'boolean',
      acceptableExecutionInterval: 'number',
      autoRecycleInstance: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSofamqConnectorResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误报告
  errorReport?: ErrorReport;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      errorReport: 'error_report',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      errorReport: ErrorReport,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMeshQueuelimitvalueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 限流规则id
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

export class QueryMeshQueuelimitvalueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 限流域值
  data?: QueueLimitValueDTO[];
  // 状态
  state?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': QueueLimitValueDTO },
      state: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMeshQueuelimitRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 限流规则id
  id: number;
  // 队列限流域值
  list: QueueLimitValueDTO[];
  // 限流算法
  lAlgorithm: string;
  // 限流后操作
  lOperation: string;
  // 方法
  meth: string;
  // 限流规则名称
  name: string;
  // 队列id
  queueId: number;
  // 运行模式
  rMode: string;
  // 状态
  status: number;
  // 应用名
  app: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      list: 'list',
      lAlgorithm: 'l_algorithm',
      lOperation: 'l_operation',
      meth: 'meth',
      name: 'name',
      queueId: 'queue_id',
      rMode: 'r_mode',
      status: 'status',
      app: 'app',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      list: { 'type': 'array', 'itemType': QueueLimitValueDTO },
      lAlgorithm: 'string',
      lOperation: 'string',
      meth: 'string',
      name: 'string',
      queueId: 'number',
      rMode: 'string',
      status: 'number',
      app: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMeshQueuelimitResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回信息
  message?: string;
  // 状态
  state?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      message: 'message',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      message: 'string',
      state: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportMeshQueuelimitRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // id和rule_id为空
  list: QueueLimitValueDTO[];
  // 限流算法
  lAlgorithm: string;
  // 限流后操作
  lOperation: string;
  // 方法
  meth: string;
  // 规则名称
  name: string;
  // 队列id
  queueId: number;
  // 运行模式
  rMode: string;
  // 应用名
  app: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      list: 'list',
      lAlgorithm: 'l_algorithm',
      lOperation: 'l_operation',
      meth: 'meth',
      name: 'name',
      queueId: 'queue_id',
      rMode: 'r_mode',
      app: 'app',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      list: { 'type': 'array', 'itemType': QueueLimitValueDTO },
      lAlgorithm: 'string',
      lOperation: 'string',
      meth: 'string',
      name: 'string',
      queueId: 'number',
      rMode: 'string',
      app: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportMeshQueuelimitResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态
  state?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      state: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteMeshQueuelimitRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 队列规则id
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

export class DeleteMeshQueuelimitResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态码
  state?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      state: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteMeshQueuelimitvalueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 限流域值id
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

export class DeleteMeshQueuelimitvalueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态
  state?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      state: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMeshQueuerouterulesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 队列id
  id: number;
  // 路由规则名称
  name?: string;
  // 当前页码值
  pagecurrent: number;
  // 页面大小
  pagesize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      name: 'name',
      pagecurrent: 'pagecurrent',
      pagesize: 'pagesize',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      name: 'string',
      pagecurrent: 'number',
      pagesize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMeshQueuerouterulesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 路由规则信息
  data?: QueueRouteRulesPageDTO;
  // 状态
  state?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: QueueRouteRulesPageDTO,
      state: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMeshQueuerouteeditionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 路由规则id
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

export class QueryMeshQueuerouteeditionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 路由版本
  data?: QueueRouteEditionDTO[];
  // 状态
  state?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': QueueRouteEditionDTO },
      state: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportMeshQueuerouteRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用
  app: string;
  // 队列版本
  list: QueueRouteEditionDTO[];
  // 方法
  meth: string;
  // 路由规则名称
  name: string;
  // 队列id
  queueId: number;
  // 路由类型
  type: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      app: 'app',
      list: 'list',
      meth: 'meth',
      name: 'name',
      queueId: 'queue_id',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      app: 'string',
      list: { 'type': 'array', 'itemType': QueueRouteEditionDTO },
      meth: 'string',
      name: 'string',
      queueId: 'number',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportMeshQueuerouteResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态
  state?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      state: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMeshQueuerouteRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用
  app: string;
  // 路由规则id
  id: number;
  // 版本
  list: QueueRouteEditionDTO[];
  // 方法
  meth: string;
  // 路由规则名称
  name: string;
  // 队列id
  queueId: number;
  // 状态
  status: number;
  // 分流开关
  switchStatus: number;
  // 路由类型
  type: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      app: 'app',
      id: 'id',
      list: 'list',
      meth: 'meth',
      name: 'name',
      queueId: 'queue_id',
      status: 'status',
      switchStatus: 'switch_status',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      app: 'string',
      id: 'number',
      list: { 'type': 'array', 'itemType': QueueRouteEditionDTO },
      meth: 'string',
      name: 'string',
      queueId: 'number',
      status: 'number',
      switchStatus: 'number',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMeshQueuerouteResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态
  state?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      state: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteMeshQueuerouteRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 路由规则id
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

export class DeleteMeshQueuerouteResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态
  state?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      state: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteMeshQueuerouteeditionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 路由版本id
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

export class DeleteMeshQueuerouteeditionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态
  state?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      state: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMeshQueuerouteappRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 队列id
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

export class QueryMeshQueuerouteappResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 应用名
  data?: string[];
  // 状态
  state?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': 'string' },
      state: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMeshQueuebyidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 队列id
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

export class QueryMeshQueuebyidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 关联应用
  assoApp?: string;
  // 通道名
  channel?: string;
  // 队列管理器ip
  ip?: string;
  // 队列管理器名
  manager?: string;
  // 队列名
  name?: string;
  // 队列管理器端口
  port?: string;
  // 状态码
  state?: number;
  // 类型
  type?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      assoApp: 'asso_app',
      channel: 'channel',
      ip: 'ip',
      manager: 'manager',
      name: 'name',
      port: 'port',
      state: 'state',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      assoApp: 'string',
      channel: 'string',
      ip: 'string',
      manager: 'string',
      name: 'string',
      port: 'string',
      state: 'number',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMeshQueuelimitstatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 限流规则id
  id: number;
  // 状态
  status: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMeshQueuelimitstatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态
  state?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      state: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMeshQueueroutestatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 路由规则id
  id: number;
  // 队列id
  queueId: number;
  // 状态
  status: number;
  // 应用
  app: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      queueId: 'queue_id',
      status: 'status',
      app: 'app',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      queueId: 'number',
      status: 'number',
      app: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMeshQueueroutestatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态
  state?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      state: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSofamqAdmintopicRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 集群名
  cluster: string;
  // 需创建的 Topic 所对应的实例 ID
  instanceId: string;
  // 设置该 Topic 的读写模式。取值说明：6：同时支持读写；4：禁写；2：禁读。
  perm?: number;
  // 读队列数
  readQueueNum?: number;
  // topic名
  topic: string;
  // 写队列数
  writeQueueNum?: number;
  // 生效范围，三板斧使用
  scope?: string;
  // 标识该 topic 的消息是否具有优先级
  priority?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cluster: 'cluster',
      instanceId: 'instance_id',
      perm: 'perm',
      readQueueNum: 'read_queue_num',
      topic: 'topic',
      writeQueueNum: 'write_queue_num',
      scope: 'scope',
      priority: 'priority',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cluster: 'string',
      instanceId: 'string',
      perm: 'number',
      readQueueNum: 'number',
      topic: 'string',
      writeQueueNum: 'number',
      scope: 'string',
      priority: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSofamqAdmintopicResponse extends $tea.Model {
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

export class UpdateSofamqAdmingroupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 集群名
  cluster: string;
  // group名
  groupId: string;
  // 需创建的 Topic 所对应的实例 ID
  instanceId: string;
  // 设置读消息开关
  readEnable: boolean;
  // 生效范围，三板斧使用
  scope?: string;
  // 重试队列读队列数
  retryReadQueueNum?: number;
  // 重试队列写队列数
  retryWriteQueueNum?: number;
  // 设置该重试队列的读写模式。取值说明：6：同时支持读写；4：禁写；2：禁读。
  retryPerm?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cluster: 'cluster',
      groupId: 'group_id',
      instanceId: 'instance_id',
      readEnable: 'read_enable',
      scope: 'scope',
      retryReadQueueNum: 'retry_read_queue_num',
      retryWriteQueueNum: 'retry_write_queue_num',
      retryPerm: 'retry_perm',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cluster: 'string',
      groupId: 'string',
      instanceId: 'string',
      readEnable: 'boolean',
      scope: 'string',
      retryReadQueueNum: 'number',
      retryWriteQueueNum: 'number',
      retryPerm: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSofamqAdmingroupResponse extends $tea.Model {
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

export class RunSofamqConnectorjobRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 期望任务执行时间的unix 时间戳，精度是毫秒
  executionTime?: number;
  // 任务名
  job: string;
  // 分区描述
  partition?: string;
  // 租户实例id
  instanceId: string;
  // Sink开发分组
  sinkDevGroup?: string;
  // dt=20210910
  sourcePartition?: string;
  // 目标分组
  sinkPartition?: string;
  // Source开发分组
  sourceDevGroup?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      executionTime: 'execution_time',
      job: 'job',
      partition: 'partition',
      instanceId: 'instance_id',
      sinkDevGroup: 'sink_dev_group',
      sourcePartition: 'source_partition',
      sinkPartition: 'sink_partition',
      sourceDevGroup: 'source_dev_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      executionTime: 'number',
      job: 'string',
      partition: 'string',
      instanceId: 'string',
      sinkDevGroup: 'string',
      sourcePartition: 'string',
      sinkPartition: 'string',
      sourceDevGroup: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RunSofamqConnectorjobResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误报告
  errorReport?: ErrorReport;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      errorReport: 'error_report',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      errorReport: ErrorReport,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PauseSofamqConnectorjobRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务id
  taskId: string;
  // 所属Connector任务名
  job: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskId: 'task_id',
      job: 'job',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskId: 'string',
      job: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PauseSofamqConnectorjobResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误报告
  errorReport?: ErrorReport;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      errorReport: 'error_report',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      errorReport: ErrorReport,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ResumeSofamqConnectorjobRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务id
  taskId: string;
  // Connector任务
  job: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taskId: 'task_id',
      job: 'job',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taskId: 'string',
      job: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ResumeSofamqConnectorjobResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误报告
  errorReport?: ErrorReport;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      errorReport: 'error_report',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      errorReport: ErrorReport,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMeshQueueroutestatusconfirmRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 路由规则id
  id: number;
  // 队列id
  queueId: number;
  // 状态
  status: number;
  // 应用
  app: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      queueId: 'queue_id',
      status: 'status',
      app: 'app',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      queueId: 'number',
      status: 'number',
      app: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMeshQueueroutestatusconfirmResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态
  state?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      state: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMeshQueuelimitstatusconfirmRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 限流规则id
  id: number;
  // 限流规则状态
  status: number;
  // 队列id
  queueId: number;
  // 方法
  meth: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      status: 'status',
      queueId: 'queue_id',
      meth: 'meth',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      status: 'number',
      queueId: 'number',
      meth: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMeshQueuelimitstatusconfirmResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态
  state?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      state: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecSofamqDailycheckRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 单元名
  cell?: string;
  // group名
  groupId: string;
  // 实例ID
  instanceId: string;
  // 日切时间点
  checkTime: number;
  // topic名
  topic: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cell: 'cell',
      groupId: 'group_id',
      instanceId: 'instance_id',
      checkTime: 'check_time',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cell: 'string',
      groupId: 'string',
      instanceId: 'string',
      checkTime: 'number',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecSofamqDailycheckResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否满足日切条件
  checkStatus?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      checkStatus: 'check_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      checkStatus: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMeshApplicationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用名
  name?: string;
  // 当前页
  pageCurrent: number;
  // 页面大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      pageCurrent: 'page_current',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      pageCurrent: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMeshApplicationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 页面记录
  data?: ApplicationPageDescDTO[];
  // 状态
  state?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': ApplicationPageDescDTO },
      state: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportMeshApplicationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用id
  id: number;
  // 应用名
  name: string;
  // 服务端get队列
  pubGetQueue?: string;
  // 服务端put队列
  pubPutQueue?: string;
  // 服务端rpc开关
  pubRpcStatus?: number;
  // 客户端get队列
  subGetQueue?: string;
  // 客户端put队列
  subPutQueue?: string;
  // 客户端rpc分流比例
  subRpcScale?: number;
  // 服务类型
  type: string;
  // 服务id列表
  list: ApplicationServiceDTO[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      name: 'name',
      pubGetQueue: 'pub_get_queue',
      pubPutQueue: 'pub_put_queue',
      pubRpcStatus: 'pub_rpc_status',
      subGetQueue: 'sub_get_queue',
      subPutQueue: 'sub_put_queue',
      subRpcScale: 'sub_rpc_scale',
      type: 'type',
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      name: 'string',
      pubGetQueue: 'string',
      pubPutQueue: 'string',
      pubRpcStatus: 'number',
      subGetQueue: 'string',
      subPutQueue: 'string',
      subRpcScale: 'number',
      type: 'string',
      list: { 'type': 'array', 'itemType': ApplicationServiceDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportMeshApplicationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 状态
  state?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      state: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMeshApplicationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用id
  id: number;
  // 服务id
  list: ApplicationServiceDTO[];
  // 应用名
  name: string;
  // 服务度get队列
  pubGetQueue?: string;
  // 服务端put队列
  pubPutQueue?: string;
  // 服务端开关
  pubRpcStatus?: number;
  // 客户端get队列
  subGetQueue?: string;
  // 客户端put队列
  subPutQueue?: string;
  // 客户端rpc比例
  subRpcScale?: number;
  // 服务类型
  type: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      list: 'list',
      name: 'name',
      pubGetQueue: 'pub_get_queue',
      pubPutQueue: 'pub_put_queue',
      pubRpcStatus: 'pub_rpc_status',
      subGetQueue: 'sub_get_queue',
      subPutQueue: 'sub_put_queue',
      subRpcScale: 'sub_rpc_scale',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      list: { 'type': 'array', 'itemType': ApplicationServiceDTO },
      name: 'string',
      pubGetQueue: 'string',
      pubPutQueue: 'string',
      pubRpcStatus: 'number',
      subGetQueue: 'string',
      subPutQueue: 'string',
      subRpcScale: 'number',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMeshApplicationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回状态
  state?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      state: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteMeshApplicationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用id
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

export class DeleteMeshApplicationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回状态
  state?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      state: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMeshApplicationserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用id
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

export class QueryMeshApplicationserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 服务信息
  data?: ApplicationServiceDTO[];
  // 返回状态
  state?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': ApplicationServiceDTO },
      state: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMeshApplicationbynameRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应用名
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMeshApplicationbynameResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建日期
  gmtCreated?: string;
  // 应用id
  id?: number;
  // 应用名
  name?: string;
  // 服务端get队列
  pubGetQueue?: string;
  // 服务端put队列
  pubPutQueue?: string;
  // 服务端rpc开关
  pubRpcStatus?: number;
  // 返回状态
  state?: number;
  // 客户端get队列
  subGetQueue?: string;
  // 客户端put队列
  subPutQueue?: string;
  // 客户端rpc比例
  subRpcScale?: number;
  // 服务类型
  type?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      gmtCreated: 'gmt_created',
      id: 'id',
      name: 'name',
      pubGetQueue: 'pub_get_queue',
      pubPutQueue: 'pub_put_queue',
      pubRpcStatus: 'pub_rpc_status',
      state: 'state',
      subGetQueue: 'sub_get_queue',
      subPutQueue: 'sub_put_queue',
      subRpcScale: 'sub_rpc_scale',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      gmtCreated: 'string',
      id: 'number',
      name: 'string',
      pubGetQueue: 'string',
      pubPutQueue: 'string',
      pubRpcStatus: 'number',
      state: 'number',
      subGetQueue: 'string',
      subPutQueue: 'string',
      subRpcScale: 'number',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMeshApplicationlistRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 队列id
  id: number;
  // 队列名
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      id: 'id',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      id: 'number',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMeshApplicationlistResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 队列应用列表
  list?: string[];
  // 返回状态
  state?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      list: 'list',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      list: { 'type': 'array', 'itemType': 'string' },
      state: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMeshApplicationqueuenamesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMeshApplicationqueuenamesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 应用列表
  list?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      list: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PauseSofamqConnectorplanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 执行计划的Id
  planId: string;
  // Connector任务名
  job: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      planId: 'plan_id',
      job: 'job',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      planId: 'string',
      job: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PauseSofamqConnectorplanResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误报告
  errorReport?: ErrorReport;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      errorReport: 'error_report',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      errorReport: ErrorReport,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ResumeSofamqConnectorplanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // connector任务执行计划Id
  planId: string;
  // Connector任务名
  job: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      planId: 'plan_id',
      job: 'job',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      planId: 'string',
      job: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ResumeSofamqConnectorplanResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误报告
  errorReport?: ErrorReport;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      errorReport: 'error_report',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      errorReport: ErrorReport,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetrySofamqConnectorplanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // connector任务执行计划
  planId: string;
  // Connector任务
  job: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      planId: 'plan_id',
      job: 'job',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      planId: 'string',
      job: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RetrySofamqConnectorplanResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误报告
  errorReport?: ErrorReport;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      errorReport: 'error_report',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      errorReport: ErrorReport,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqConnectorconfigsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户名称
  instanceId: string;
  // 任务名称
  name: string;
  // 代表查询的配置 是source还是sink
  type: string;
  // 是否是克隆模式
  clone?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      name: 'name',
      type: 'type',
      clone: 'clone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      name: 'string',
      type: 'string',
      clone: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqConnectorconfigsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 该任务 来源或去向的配置信息，包括是否可以修改，已经每个配置项如何修改的控件
  configs?: UIControlModel[];
  // 错误报告
  errorReport?: ErrorReport;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      configs: 'configs',
      errorReport: 'error_report',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      configs: { 'type': 'array', 'itemType': UIControlModel },
      errorReport: ErrorReport,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqConsumelimiterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实例ID
  instanceId: string;
  // 限流资源名，由 GROUP@TOPIC 组成
  name: string;
  // 限流类型
  // - UNIT：单元限流，指定单元/CELL限流
  limiterType: string;
  // 限流值配置，BASE 为基准限流值。
  tps: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      name: 'name',
      limiterType: 'limiter_type',
      tps: 'tps',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      name: 'string',
      limiterType: 'string',
      tps: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqConsumelimiterResponse extends $tea.Model {
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

export class UpdateSofamqConsumelimiterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实例ID
  // 
  instanceId: string;
  // 限流类型 - UNIT：单元限流，指定单元/CELL限流
  // 
  limiterType: string;
  // 限流资源名，由 GROUP@TOPIC 组成
  // 
  name: string;
  // 限流值配置，BASE 为基准限流值。
  tps: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      limiterType: 'limiter_type',
      name: 'name',
      tps: 'tps',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      limiterType: 'string',
      name: 'string',
      tps: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSofamqConsumelimiterResponse extends $tea.Model {
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

export class DeleteSofamqConsumelimiterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实例ID
  instanceId: string;
  // 限流资源名，由 GROUP@TOPIC 组成
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSofamqConsumelimiterResponse extends $tea.Model {
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

export class QuerySofamqConsumelimiterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 消费限流资源所属的group
  group: string;
  // 实例ID
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      group: 'group',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      group: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqConsumelimiterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 消费限流列表
  data?: ConsumeLimiterDTO[];
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
      data: { 'type': 'array', 'itemType': ConsumeLimiterDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDmsInstanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // ddd
  currTenant: string;
  // ss
  currWorkspace: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      currTenant: 'curr_tenant',
      currWorkspace: 'curr_workspace',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      currTenant: 'string',
      currWorkspace: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDmsInstanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // dd
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

export class QuerySofamqLabelsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实例 ID（命名空间）
  instanceId?: string;
  // 资源类型：TOPIC、GROUP
  resourceType?: string;
  // 资源名，like _resource_name_ 匹配
  resourceName?: string;
  // 标签 KEY
  labelKey?: string;
  // 标签值，like _label_value_ 匹配
  labelValue: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      resourceType: 'resource_type',
      resourceName: 'resource_name',
      labelKey: 'label_key',
      labelValue: 'label_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      resourceType: 'string',
      resourceName: 'string',
      labelKey: 'string',
      labelValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqLabelsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 资源标签
  labels?: ResourceLabelsDTO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      labels: 'labels',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      labels: { 'type': 'array', 'itemType': ResourceLabelsDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqLabelsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实例 ID（命名空间）
  instanceId: string;
  // 资源类型：TOPIC、GROUP
  resourceType: string;
  // 资源名
  resourceName: string;
  // 标签
  labels: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      resourceType: 'resource_type',
      resourceName: 'resource_name',
      labels: 'labels',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      resourceType: 'string',
      resourceName: 'string',
      labels: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqLabelsResponse extends $tea.Model {
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

export class DeleteSofamqLabelsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实例 ID（命名空间）
  instanceId: string;
  // 资源类型：TOPIC、GROUP
  resourceType: string;
  // 资源名
  resourceName: string;
  // 标签
  labels: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      resourceType: 'resource_type',
      resourceName: 'resource_name',
      labels: 'labels',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      resourceType: 'string',
      resourceName: 'string',
      labels: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSofamqLabelsResponse extends $tea.Model {
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

export class ListSofamqSchemaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需获取的 Topic 信息列表所对应的实例 ID
  instanceId: string;
  // 页码
  pageNum: number;
  // 每页的条数
  pageSize: number;
  // schema的subject，在sofamq就中就是topic名称
  topic: string;
  // schema的唯一ID
  schemaId?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
      topic: 'topic',
      schemaId: 'schema_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      pageNum: 'number',
      pageSize: 'number',
      topic: 'string',
      schemaId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqSchemaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // Schema信息
  data?: SchemaDetailPageDO;
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
      data: SchemaDetailPageDO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqSchemaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 创建Schema时的instanceId
  instanceId: string;
  // SOFAMQ的Topic
  topic: string;
  // Topic的Schema内容
  schemaContent: string;
  // Schema的描述信息
  schemaComment: string;
  // Schema的兼容性策略
  schemaCompatibility: string;
  // schema的序列化方式
  schemaSerialization: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      topic: 'topic',
      schemaContent: 'schema_content',
      schemaComment: 'schema_comment',
      schemaCompatibility: 'schema_compatibility',
      schemaSerialization: 'schema_serialization',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      topic: 'string',
      schemaContent: 'string',
      schemaComment: 'string',
      schemaCompatibility: 'string',
      schemaSerialization: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateSofamqSchemaResponse extends $tea.Model {
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

export class GetSofamqSchemaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // instance id
  instanceId: string;
  // sofamq的topic名称
  topic: string;
  // schema的版本号
  schemaVersion: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      topic: 'topic',
      schemaVersion: 'schema_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      topic: 'string',
      schemaVersion: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetSofamqSchemaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回特定某个Schema的信息
  data?: SchemaDetailDO;
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
      data: SchemaDetailDO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportSofamqSchemaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // sofamq instance id
  instanceId: string;
  // schema的唯一ID
  schemaId: string;
  // 实例代码的变成语言类型，空缺时使用Java
  language?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      schemaId: 'schema_id',
      language: 'language',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      schemaId: 'string',
      language: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportSofamqSchemaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 代码示例
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

export class UpdateSofamqSchemaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // sofamq的instance id
  instanceId: string;
  // schema的唯一id
  schemaId: string;
  // schema的描述信息
  description?: string;
  // 消息主题
  topic: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      schemaId: 'schema_id',
      description: 'description',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      schemaId: 'string',
      description: 'string',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateSofamqSchemaResponse extends $tea.Model {
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

export class AllSofamqSchemaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // sofamq的instance id
  instanceId: string;
  // 查询Schema的Topic名称
  topic: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllSofamqSchemaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回某个Topic的Schema的版本号列表，版本号降序排列
  data?: number[];
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
      data: { 'type': 'array', 'itemType': 'number' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportSofamqMessageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // sofamq的instance id
  instanceId: string;
  // 消息的唯一ID
  messageId: string;
  // 消息的Topic
  topic: string;
  // 消息所属的ZONE
  cell?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      messageId: 'message_id',
      topic: 'topic',
      cell: 'cell',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      messageId: 'string',
      topic: 'string',
      cell: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExportSofamqMessageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 消息体反序列化后的数据，包含
  data?: MessagePayloadDTO;
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
      data: MessagePayloadDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqSchemacompatibilityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqSchemacompatibilityResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回系统支持的兼容性，key为兼容性的值，比如FULL，对应的value为前端下拉列表中展现的内容，比如“全兼容”
  data?: Pair[];
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
      data: { 'type': 'array', 'itemType': Pair },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqSchemaserializationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqSchemaserializationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回系统支持的序列化方式
  data?: string[];
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
      data: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSofamqSchemaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // sofamq的instance id
  instanceId: string;
  // schema的唯一id
  schemaId: string;
  // 消息主题
  topic: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      schemaId: 'schema_id',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      schemaId: 'string',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSofamqSchemaResponse extends $tea.Model {
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

export class QuerySofamqConnectorprocessRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务名称
  jobName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      jobName: 'job_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      jobName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqConnectorprocessResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 工单详情
  processInfos?: ProcessDTO[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      processInfos: 'process_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      processInfos: { 'type': 'array', 'itemType': ProcessDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelSofamqConnectorprocessRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务名称
  jobName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      jobName: 'job_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      jobName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelSofamqConnectorprocessResponse extends $tea.Model {
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

export class ResumeSofamqConnectorprocessRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务名称
  jobName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      jobName: 'job_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      jobName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ResumeSofamqConnectorprocessResponse extends $tea.Model {
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

export class VerifySofamqConnectoroperationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务名称
  job: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      job: 'job',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      job: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifySofamqConnectoroperationResponse extends $tea.Model {
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

export class ListSofamqAuditorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 起始时间
  closedStart?: number;
  // 结束时间戳
  openEnd?: number;
  // 模糊资源名
  resource?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      closedStart: 'closed_start',
      openEnd: 'open_end',
      resource: 'resource',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      closedStart: 'number',
      openEnd: 'number',
      resource: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListSofamqAuditorResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 操作审计数据
  data?: AuditorDTO[];
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
      data: { 'type': 'array', 'itemType': AuditorDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqConnectorjobappRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实例ID
  instanceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqConnectorjobappResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 应用名称
  appNames?: string[];
  // 报错信息
  errorReport?: ErrorReport;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      appNames: 'app_names',
      errorReport: 'error_report',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      appNames: { 'type': 'array', 'itemType': 'string' },
      errorReport: ErrorReport,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelSofamqConnectorplanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // connector任务执行计划Id
  planId: string;
  // Connector任务名
  job: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      planId: 'plan_id',
      job: 'job',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      planId: 'string',
      job: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelSofamqConnectorplanResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 报错报告
  errorReport?: ErrorReport;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      errorReport: 'error_report',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      errorReport: ErrorReport,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetSofamqConnectorplancheckpointRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // connector任务执行计划Id	
  // 
  planId: string;
  // Connector任务名	
  // 
  job: string;
  // 重置任务请求
  resetOffsetRequest: ResetJobOffsetRequest;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      planId: 'plan_id',
      job: 'job',
      resetOffsetRequest: 'reset_offset_request',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      planId: 'string',
      job: 'string',
      resetOffsetRequest: ResetJobOffsetRequest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetSofamqConnectorplancheckpointResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误报告
  errorReport?: ErrorReport;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      errorReport: 'error_report',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      errorReport: ErrorReport,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqConnectorplansingletonRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务名称
  job: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      job: 'job',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      job: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqConnectorplansingletonResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实例详情
  jobInstance?: JobRecordDTO;
  // 报错报告
  errorReport?: ErrorReport;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      jobInstance: 'job_instance',
      errorReport: 'error_report',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      jobInstance: JobRecordDTO,
      errorReport: ErrorReport,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqConnectorjobdelayRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 任务名称
  job: string;
  // connector任务执行计划Id
  // 
  planId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      job: 'job',
      planId: 'plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      job: 'string',
      planId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqConnectorjobdelayResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 延迟详情
  delayDetail?: DelayInfo[];
  // 报错报告
  errorDetail?: ErrorReport;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      delayDetail: 'delay_detail',
      errorDetail: 'error_detail',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      delayDetail: { 'type': 'array', 'itemType': DelayInfo },
      errorDetail: ErrorReport,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqConnectorjobpartitionstatuscolumnRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // connector任务执行计划Id
  // 
  job: string;
  // connector任务执行计划Id
  // 
  planId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      job: 'job',
      planId: 'plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      job: 'string',
      planId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqConnectorjobpartitionstatuscolumnResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 列名称
  columnName?: ColumnName[];
  // 错误报告
  errorReport?: ErrorReport;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      columnName: 'column_name',
      errorReport: 'error_report',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      columnName: { 'type': 'array', 'itemType': ColumnName },
      errorReport: ErrorReport,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqConnectorjobpartitionstatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 页码
  pageNum: number;
  // 每页大小
  pageSize: number;
  // 作业名称
  job: string;
  // 实例id
  planId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
      job: 'job',
      planId: 'plan_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageNum: 'number',
      pageSize: 'number',
      job: 'string',
      planId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqConnectorjobpartitionstatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分区分页状态
  data?: ConnectorJobPartitionStatusPageResult;
  // 错误报告
  errorReport?: ErrorReport;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      errorReport: 'error_report',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: ConnectorJobPartitionStatusPageResult,
      errorReport: ErrorReport,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqConnectortriggerconfigsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // source类型
  sourceType: string;
  // sink类型
  sinkType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sourceType: 'source_type',
      sinkType: 'sink_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sourceType: 'string',
      sinkType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqConnectortriggerconfigsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 页面渲染配置
  configs?: UIControlModel[];
  // 错误报告
  errorReport?: ErrorReport;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      configs: 'configs',
      errorReport: 'error_report',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      configs: { 'type': 'array', 'itemType': UIControlModel },
      errorReport: ErrorReport,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSofamqOffsetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需清除消费进度的 Group ID 所对应的实例 ID。针对有独立命名空间的实例，该参数为必填。
  instanceId: string;
  // 需清除消费进度的消费端 Group ID
  groupId: string;
  // 需清除消费进度的 Topic 名称
  topic: string;
  // 需要清除消费进度的单元
  cells: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      groupId: 'group_id',
      topic: 'topic',
      cells: 'cells',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      groupId: 'string',
      topic: 'string',
      cells: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteSofamqOffsetResponse extends $tea.Model {
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

export class QuerySofamqConsumptionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户实例ID
  // 
  instanceId: string;
  // ldc模式下的cell
  // 
  cell: string;
  // 消费者groupID
  groupId: string;
  // 订阅的topic
  // 
  topic: string;
  // 是否带上客户端信息
  // 
  needClientDetail: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      cell: 'cell',
      groupId: 'group_id',
      topic: 'topic',
      needClientDetail: 'need_client_detail',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      cell: 'string',
      groupId: 'string',
      topic: 'string',
      needClientDetail: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySofamqConsumptionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询结果
  data?: ConsumptionStatusDTO;
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
      data: ConsumptionStatusDTO,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUserTopicqueueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需查询的 Topic 所在的 Cell
  // 
  cell: string;
  // 需要查询的Topic对应的实例ID
  instanceId: string;
  // Topic名称
  topic: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cell: 'cell',
      instanceId: 'instance_id',
      topic: 'topic',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cell: 'string',
      instanceId: 'string',
      topic: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryUserTopicqueueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // Topic队列列表信息
  data?: TopicQueueDTO[];
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
      data: { 'type': 'array', 'itemType': TopicQueueDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMessageNextdeliverytimeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户实例id
  instanceId: string;
  // topic
  topic: string;
  // eventcode
  eventcode: string;
  // subscriber group
  group: string;
  // next delivery time
  deliveryTime?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      topic: 'topic',
      eventcode: 'eventcode',
      group: 'group',
      deliveryTime: 'delivery_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      topic: 'string',
      eventcode: 'string',
      group: 'string',
      deliveryTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateMessageNextdeliverytimeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 更新结果
  updateResults?: number[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      updateResults: 'update_results',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      updateResults: { 'type': 'array', 'itemType': 'number' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountMessageUndeliveryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // middleware instance id
  instanceId: string;
  // topic
  topic: string;
  // eventcode
  eventcode: string;
  // subscriber group
  group: string;
  // end time
  endTime: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      topic: 'topic',
      eventcode: 'eventcode',
      group: 'group',
      endTime: 'end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      topic: 'string',
      eventcode: 'string',
      group: 'string',
      endTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountMessageUndeliveryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // count of undelivered messages
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class LoadConnectorjobSloviewRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // source类型
  sourceType: string;
  // 触发类型
  triggerType: string;
  // cron表达式的值
  triggerValue: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sourceType: 'source_type',
      triggerType: 'trigger_type',
      triggerValue: 'trigger_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sourceType: 'string',
      triggerType: 'string',
      triggerValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class LoadConnectorjobSloviewResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // Slo配置
  data?: SloSpec;
  // 错误报告
  errorReport?: ErrorReport;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      errorReport: 'error_report',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: SloSpec,
      errorReport: ErrorReport,
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
          sdk_version: "3.8.22",
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
   * Description: Query undelivery message status.
   * Summary: query undelivery message status
   */
  async statusMqMessageUndelivery(request: StatusMqMessageUndeliveryRequest): Promise<StatusMqMessageUndeliveryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.statusMqMessageUndeliveryEx(request, headers, runtime);
  }

  /**
   * Description: Query undelivery message status.
   * Summary: query undelivery message status
   */
  async statusMqMessageUndeliveryEx(request: StatusMqMessageUndeliveryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StatusMqMessageUndeliveryResponse> {
    Util.validateModel(request);
    return $tea.cast<StatusMqMessageUndeliveryResponse>(await this.doRequest("1.0", "mq.message.undelivery.status", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StatusMqMessageUndeliveryResponse({}));
  }

  /**
   * Description: Query undelivery message status.
   * Summary: query undelivery message status
   */
  async undeliverMessageStatus(request: UndeliverMessageStatusRequest): Promise<UndeliverMessageStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.undeliverMessageStatusEx(request, headers, runtime);
  }

  /**
   * Description: Query undelivery message status.
   * Summary: query undelivery message status
   */
  async undeliverMessageStatusEx(request: UndeliverMessageStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UndeliverMessageStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<UndeliverMessageStatusResponse>(await this.doRequest("1.0", "sofa.mq.message.status.undeliver", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UndeliverMessageStatusResponse({}));
  }

  /**
   * Description: Add a message type.
   * Summary: add a message type
   */
  async addMsgtype(request: AddMsgtypeRequest): Promise<AddMsgtypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addMsgtypeEx(request, headers, runtime);
  }

  /**
   * Description: Add a message type.
   * Summary: add a message type
   */
  async addMsgtypeEx(request: AddMsgtypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddMsgtypeResponse> {
    Util.validateModel(request);
    return $tea.cast<AddMsgtypeResponse>(await this.doRequest("1.0", "sofa.mq.msgtype.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddMsgtypeResponse({}));
  }

  /**
   * Description: Update a message type.
   * Summary: update a message type
   */
  async updateMsgtype(request: UpdateMsgtypeRequest): Promise<UpdateMsgtypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateMsgtypeEx(request, headers, runtime);
  }

  /**
   * Description: Update a message type.
   * Summary: update a message type
   */
  async updateMsgtypeEx(request: UpdateMsgtypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateMsgtypeResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateMsgtypeResponse>(await this.doRequest("1.0", "sofa.mq.msgtype.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateMsgtypeResponse({}));
  }

  /**
   * Description: Delete a message type.
   * Summary: delete a message type
   */
  async deleteMsgtype(request: DeleteMsgtypeRequest): Promise<DeleteMsgtypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteMsgtypeEx(request, headers, runtime);
  }

  /**
   * Description: Delete a message type.
   * Summary: delete a message type
   */
  async deleteMsgtypeEx(request: DeleteMsgtypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteMsgtypeResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteMsgtypeResponse>(await this.doRequest("1.0", "sofa.mq.msgtype.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteMsgtypeResponse({}));
  }

  /**
   * Description: Query the collection of message type.
   * Summary: query the collection of message type
   */
  async queryMsgtype(request: QueryMsgtypeRequest): Promise<QueryMsgtypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMsgtypeEx(request, headers, runtime);
  }

  /**
   * Description: Query the collection of message type.
   * Summary: query the collection of message type
   */
  async queryMsgtypeEx(request: QueryMsgtypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMsgtypeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMsgtypeResponse>(await this.doRequest("1.0", "sofa.mq.msgtype.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMsgtypeResponse({}));
  }

  /**
   * Description: Add a binding.
   * Summary: add a binding
   */
  async addBinding(request: AddBindingRequest): Promise<AddBindingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addBindingEx(request, headers, runtime);
  }

  /**
   * Description: Add a binding.
   * Summary: add a binding
   */
  async addBindingEx(request: AddBindingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddBindingResponse> {
    Util.validateModel(request);
    return $tea.cast<AddBindingResponse>(await this.doRequest("1.0", "sofa.mq.binding.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddBindingResponse({}));
  }

  /**
   * Description: Update a binding.
   * Summary: update a binding
   */
  async updateBinding(request: UpdateBindingRequest): Promise<UpdateBindingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateBindingEx(request, headers, runtime);
  }

  /**
   * Description: Update a binding.
   * Summary: update a binding
   */
  async updateBindingEx(request: UpdateBindingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateBindingResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBindingResponse>(await this.doRequest("1.0", "sofa.mq.binding.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateBindingResponse({}));
  }

  /**
   * Description: Delete a binding.
   * Summary: delete a binding
   */
  async deleteBinding(request: DeleteBindingRequest): Promise<DeleteBindingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteBindingEx(request, headers, runtime);
  }

  /**
   * Description: Delete a binding.
   * Summary: delete a binding
   */
  async deleteBindingEx(request: DeleteBindingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteBindingResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteBindingResponse>(await this.doRequest("1.0", "sofa.mq.binding.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteBindingResponse({}));
  }

  /**
   * Description: Query the collection of binding.
   * Summary: query the collection of binding
   */
  async queryBinding(request: QueryBindingRequest): Promise<QueryBindingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBindingEx(request, headers, runtime);
  }

  /**
   * Description: Query the collection of binding.
   * Summary: query the collection of binding
   */
  async queryBindingEx(request: QueryBindingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBindingResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBindingResponse>(await this.doRequest("1.0", "sofa.mq.binding.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBindingResponse({}));
  }

  /**
   * Description: Queue switchover execute.
   * Summary: Queue switchover execute
   */
  async executeSwitchover(request: ExecuteSwitchoverRequest): Promise<ExecuteSwitchoverResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.executeSwitchoverEx(request, headers, runtime);
  }

  /**
   * Description: Queue switchover execute.
   * Summary: Queue switchover execute
   */
  async executeSwitchoverEx(request: ExecuteSwitchoverRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecuteSwitchoverResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecuteSwitchoverResponse>(await this.doRequest("1.0", "sofa.mq.switchover.execute", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecuteSwitchoverResponse({}));
  }

  /**
   * Description: Queue switchover cancel.
   * Summary: Queue switchover cancel
   */
  async cancelSwitchover(request: CancelSwitchoverRequest): Promise<CancelSwitchoverResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelSwitchoverEx(request, headers, runtime);
  }

  /**
   * Description: Queue switchover cancel.
   * Summary: Queue switchover cancel
   */
  async cancelSwitchoverEx(request: CancelSwitchoverRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelSwitchoverResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelSwitchoverResponse>(await this.doRequest("1.0", "sofa.mq.switchover.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelSwitchoverResponse({}));
  }

  /**
   * Description: Queue switchover query.
   * Summary: Queue switchover query
   */
  async querySwitchover(request: QuerySwitchoverRequest): Promise<QuerySwitchoverResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySwitchoverEx(request, headers, runtime);
  }

  /**
   * Description: Queue switchover query.
   * Summary: Queue switchover query
   */
  async querySwitchoverEx(request: QuerySwitchoverRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySwitchoverResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySwitchoverResponse>(await this.doRequest("1.0", "sofa.mq.switchover.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySwitchoverResponse({}));
  }

  /**
   * Description: Query the collection of message type.
   * Summary: query the collection of message type
   */
  async getMsgtype(request: GetMsgtypeRequest): Promise<GetMsgtypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getMsgtypeEx(request, headers, runtime);
  }

  /**
   * Description: Query the collection of message type.
   * Summary: query the collection of message type
   */
  async getMsgtypeEx(request: GetMsgtypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetMsgtypeResponse> {
    Util.validateModel(request);
    return $tea.cast<GetMsgtypeResponse>(await this.doRequest("2.0", "sofa.mq.msgtype.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetMsgtypeResponse({}));
  }

  /**
   * Description: Query undelivery message status.
   * Summary: query undelivery message status
   */
  async undeliveryMessageStatus(request: UndeliveryMessageStatusRequest): Promise<UndeliveryMessageStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.undeliveryMessageStatusEx(request, headers, runtime);
  }

  /**
   * Description: Query undelivery message status.
   * Summary: query undelivery message status
   */
  async undeliveryMessageStatusEx(request: UndeliveryMessageStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UndeliveryMessageStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<UndeliveryMessageStatusResponse>(await this.doRequest("2.0", "sofa.mq.message.status.undelivery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UndeliveryMessageStatusResponse({}));
  }

  /**
   * Description: query topics
   * Summary: query topics
   */
  async queryTopics(request: QueryTopicsRequest): Promise<QueryTopicsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTopicsEx(request, headers, runtime);
  }

  /**
   * Description: query topics
   * Summary: query topics
   */
  async queryTopicsEx(request: QueryTopicsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTopicsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTopicsResponse>(await this.doRequest("2.0", "sofa.mq.topics.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTopicsResponse({}));
  }

  /**
   * Description: query topic
   * Summary: query topic
   */
  async idTopicQuery(request: IdTopicQueryRequest): Promise<IdTopicQueryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.idTopicQueryEx(request, headers, runtime);
  }

  /**
   * Description: query topic
   * Summary: query topic
   */
  async idTopicQueryEx(request: IdTopicQueryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<IdTopicQueryResponse> {
    Util.validateModel(request);
    return $tea.cast<IdTopicQueryResponse>(await this.doRequest("2.0", "sofa.mq.topic.query.id", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new IdTopicQueryResponse({}));
  }

  /**
   * Description: add topic
   * Summary: add topic
   */
  async addTopic(request: AddTopicRequest): Promise<AddTopicResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addTopicEx(request, headers, runtime);
  }

  /**
   * Description: add topic
   * Summary: add topic
   */
  async addTopicEx(request: AddTopicRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddTopicResponse> {
    Util.validateModel(request);
    return $tea.cast<AddTopicResponse>(await this.doRequest("2.0", "sofa.mq.topic.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddTopicResponse({}));
  }

  /**
   * Description: update topic
   * Summary: update topic
   */
  async updateTopic(request: UpdateTopicRequest): Promise<UpdateTopicResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateTopicEx(request, headers, runtime);
  }

  /**
   * Description: update topic
   * Summary: update topic
   */
  async updateTopicEx(request: UpdateTopicRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateTopicResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateTopicResponse>(await this.doRequest("2.0", "sofa.mq.topic.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateTopicResponse({}));
  }

  /**
   * Description: delete topic
   * Summary: delete topic
   */
  async deleteTopic(request: DeleteTopicRequest): Promise<DeleteTopicResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteTopicEx(request, headers, runtime);
  }

  /**
   * Description: delete topic
   * Summary: delete topic
   */
  async deleteTopicEx(request: DeleteTopicRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteTopicResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteTopicResponse>(await this.doRequest("2.0", "sofa.mq.topic.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteTopicResponse({}));
  }

  /**
   * Description: query bindings
   * Summary: query bindings
   */
  async queryBindings(request: QueryBindingsRequest): Promise<QueryBindingsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBindingsEx(request, headers, runtime);
  }

  /**
   * Description: query bindings
   * Summary: query bindings
   */
  async queryBindingsEx(request: QueryBindingsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBindingsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBindingsResponse>(await this.doRequest("2.0", "sofa.mq.bindings.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBindingsResponse({}));
  }

  /**
   * Description: query binding
   * Summary: query binding
   */
  async idBindingQuery(request: IdBindingQueryRequest): Promise<IdBindingQueryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.idBindingQueryEx(request, headers, runtime);
  }

  /**
   * Description: query binding
   * Summary: query binding
   */
  async idBindingQueryEx(request: IdBindingQueryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<IdBindingQueryResponse> {
    Util.validateModel(request);
    return $tea.cast<IdBindingQueryResponse>(await this.doRequest("2.0", "sofa.mq.binding.query.id", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new IdBindingQueryResponse({}));
  }

  /**
   * Description: 查询指定实例下 Topic 的信息列表。
   * Summary: 查询Topic列表
   */
  async listSofamqTopic(request: ListSofamqTopicRequest): Promise<ListSofamqTopicResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSofamqTopicEx(request, headers, runtime);
  }

  /**
   * Description: 查询指定实例下 Topic 的信息列表。
   * Summary: 查询Topic列表
   */
  async listSofamqTopicEx(request: ListSofamqTopicRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSofamqTopicResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSofamqTopicResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.topic.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSofamqTopicResponse({}));
  }

  /**
   * Description: 在指定环境实例下创建一个 Topic，需要指定消息类型与 Topic 名称。
   * Summary: 创建Topic
   */
  async createSofamqTopic(request: CreateSofamqTopicRequest): Promise<CreateSofamqTopicResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSofamqTopicEx(request, headers, runtime);
  }

  /**
   * Description: 在指定环境实例下创建一个 Topic，需要指定消息类型与 Topic 名称。
   * Summary: 创建Topic
   */
  async createSofamqTopicEx(request: CreateSofamqTopicRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSofamqTopicResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSofamqTopicResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.topic.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSofamqTopicResponse({}));
  }

  /**
   * Description: 删除指定的 Topic。删除后，该 Topic 下所有的订阅关系会被清理，需谨慎调用。
   * Summary: 删除Topic
   */
  async deleteSofamqTopic(request: DeleteSofamqTopicRequest): Promise<DeleteSofamqTopicResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSofamqTopicEx(request, headers, runtime);
  }

  /**
   * Description: 删除指定的 Topic。删除后，该 Topic 下所有的订阅关系会被清理，需谨慎调用。
   * Summary: 删除Topic
   */
  async deleteSofamqTopicEx(request: DeleteSofamqTopicRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSofamqTopicResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSofamqTopicResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.topic.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSofamqTopicResponse({}));
  }

  /**
   * Description: 更新指定 Topic 的读写权限配置。
   * Summary: 更新Topic读写权限
   */
  async updateSofamqTopic(request: UpdateSofamqTopicRequest): Promise<UpdateSofamqTopicResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSofamqTopicEx(request, headers, runtime);
  }

  /**
   * Description: 更新指定 Topic 的读写权限配置。
   * Summary: 更新Topic读写权限
   */
  async updateSofamqTopicEx(request: UpdateSofamqTopicRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSofamqTopicResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSofamqTopicResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.topic.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSofamqTopicResponse({}));
  }

  /**
   * Description: sofamq list instance
   * Summary: sofamq list instance
   */
  async listSofamqInstance(request: ListSofamqInstanceRequest): Promise<ListSofamqInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSofamqInstanceEx(request, headers, runtime);
  }

  /**
   * Description: sofamq list instance
   * Summary: sofamq list instance
   */
  async listSofamqInstanceEx(request: ListSofamqInstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSofamqInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSofamqInstanceResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.instance.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSofamqInstanceResponse({}));
  }

  /**
   * Description: sofamq instance create
   * Summary: instance create
   */
  async createSofamqInstance(request: CreateSofamqInstanceRequest): Promise<CreateSofamqInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSofamqInstanceEx(request, headers, runtime);
  }

  /**
   * Description: sofamq instance create
   * Summary: instance create
   */
  async createSofamqInstanceEx(request: CreateSofamqInstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSofamqInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSofamqInstanceResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.instance.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSofamqInstanceResponse({}));
  }

  /**
   * Description: instance delete
   * Summary: instance delete
   */
  async deleteSofamqInstance(request: DeleteSofamqInstanceRequest): Promise<DeleteSofamqInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSofamqInstanceEx(request, headers, runtime);
  }

  /**
   * Description: instance delete
   * Summary: instance delete
   */
  async deleteSofamqInstanceEx(request: DeleteSofamqInstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSofamqInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSofamqInstanceResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.instance.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSofamqInstanceResponse({}));
  }

  /**
   * Description: 使用 InstanceUpdate 更新实例名称和描述
   * Summary: instance update
   */
  async updateSofamqInstance(request: UpdateSofamqInstanceRequest): Promise<UpdateSofamqInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSofamqInstanceEx(request, headers, runtime);
  }

  /**
   * Description: 使用 InstanceUpdate 更新实例名称和描述
   * Summary: instance update
   */
  async updateSofamqInstanceEx(request: UpdateSofamqInstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSofamqInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSofamqInstanceResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.instance.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSofamqInstanceResponse({}));
  }

  /**
   * Description: 创建 Group ID。创建的 Group ID 用于发布和订阅消息。
   * Summary: 创建Group
   */
  async createSofamqGroup(request: CreateSofamqGroupRequest): Promise<CreateSofamqGroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSofamqGroupEx(request, headers, runtime);
  }

  /**
   * Description: 创建 Group ID。创建的 Group ID 用于发布和订阅消息。
   * Summary: 创建Group
   */
  async createSofamqGroupEx(request: CreateSofamqGroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSofamqGroupResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSofamqGroupResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.group.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSofamqGroupResponse({}));
  }

  /**
   * Description: 查询指定环境实例下 Group ID 资源的信息列表。
   * Summary: 查询Group列表
   */
  async listSofamqGroup(request: ListSofamqGroupRequest): Promise<ListSofamqGroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSofamqGroupEx(request, headers, runtime);
  }

  /**
   * Description: 查询指定环境实例下 Group ID 资源的信息列表。
   * Summary: 查询Group列表
   */
  async listSofamqGroupEx(request: ListSofamqGroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSofamqGroupResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSofamqGroupResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.group.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSofamqGroupResponse({}));
  }

  /**
   * Description: 删除指定的 Group。
   * Summary: 删除Group
   */
  async deleteSofamqGroup(request: DeleteSofamqGroupRequest): Promise<DeleteSofamqGroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSofamqGroupEx(request, headers, runtime);
  }

  /**
   * Description: 删除指定的 Group。
   * Summary: 删除Group
   */
  async deleteSofamqGroupEx(request: DeleteSofamqGroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSofamqGroupResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSofamqGroupResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.group.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSofamqGroupResponse({}));
  }

  /**
   * Description: 更新指定 Group 的读权限配置。
   * Summary: 更新Group读权限
   */
  async updateSofamqGroup(request: UpdateSofamqGroupRequest): Promise<UpdateSofamqGroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSofamqGroupEx(request, headers, runtime);
  }

  /**
   * Description: 更新指定 Group 的读权限配置。
   * Summary: 更新Group读权限
   */
  async updateSofamqGroupEx(request: UpdateSofamqGroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSofamqGroupResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSofamqGroupResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.group.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSofamqGroupResponse({}));
  }

  /**
   * Description: 查询指定的 Topic 下的消息总量以及 Topic 的最后更新时间。
   * Summary: 查询Topic状态
   */
  async querySofamqTopicstatus(request: QuerySofamqTopicstatusRequest): Promise<QuerySofamqTopicstatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqTopicstatusEx(request, headers, runtime);
  }

  /**
   * Description: 查询指定的 Topic 下的消息总量以及 Topic 的最后更新时间。
   * Summary: 查询Topic状态
   */
  async querySofamqTopicstatusEx(request: QuerySofamqTopicstatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqTopicstatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqTopicstatusResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.topicstatus.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqTopicstatusResponse({}));
  }

  /**
   * Description: 查询指定的 Topic 被哪些在线的订阅组订阅了。
   * Summary: 查看在线订阅组
   */
  async querySofamqTopicsubdetail(request: QuerySofamqTopicsubdetailRequest): Promise<QuerySofamqTopicsubdetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqTopicsubdetailEx(request, headers, runtime);
  }

  /**
   * Description: 查询指定的 Topic 被哪些在线的订阅组订阅了。
   * Summary: 查看在线订阅组
   */
  async querySofamqTopicsubdetailEx(request: QuerySofamqTopicsubdetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqTopicsubdetailResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqTopicsubdetailResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.topicsubdetail.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqTopicsubdetailResponse({}));
  }

  /**
   * Description: node list
   * Summary: node list
   */
  async listSofamqNode(request: ListSofamqNodeRequest): Promise<ListSofamqNodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSofamqNodeEx(request, headers, runtime);
  }

  /**
   * Description: node list
   * Summary: node list
   */
  async listSofamqNodeEx(request: ListSofamqNodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSofamqNodeResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSofamqNodeResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.node.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSofamqNodeResponse({}));
  }

  /**
   * Description: create node
   * Summary: create node
   */
  async createSofamqNode(request: CreateSofamqNodeRequest): Promise<CreateSofamqNodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSofamqNodeEx(request, headers, runtime);
  }

  /**
   * Description: create node
   * Summary: create node
   */
  async createSofamqNodeEx(request: CreateSofamqNodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSofamqNodeResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSofamqNodeResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.node.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSofamqNodeResponse({}));
  }

  /**
   * Description: room create
   * Summary: room create
   */
  async createSofamqRoom(request: CreateSofamqRoomRequest): Promise<CreateSofamqRoomResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSofamqRoomEx(request, headers, runtime);
  }

  /**
   * Description: room create
   * Summary: room create
   */
  async createSofamqRoomEx(request: CreateSofamqRoomRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSofamqRoomResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSofamqRoomResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.room.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSofamqRoomResponse({}));
  }

  /**
   * Description: create cell
   * Summary: create cell
   */
  async createSofamqCell(request: CreateSofamqCellRequest): Promise<CreateSofamqCellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSofamqCellEx(request, headers, runtime);
  }

  /**
   * Description: create cell
   * Summary: create cell
   */
  async createSofamqCellEx(request: CreateSofamqCellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSofamqCellResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSofamqCellResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.cell.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSofamqCellResponse({}));
  }

  /**
   * Description: create cluster
   * Summary: create cluster
   */
  async createSofamqCluster(request: CreateSofamqClusterRequest): Promise<CreateSofamqClusterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSofamqClusterEx(request, headers, runtime);
  }

  /**
   * Description: create cluster
   * Summary: create cluster
   */
  async createSofamqClusterEx(request: CreateSofamqClusterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSofamqClusterResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSofamqClusterResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.cluster.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSofamqClusterResponse({}));
  }

  /**
   * Description: create namespace
   * Summary: create namespace
   */
  async createSofamqNamespace(request: CreateSofamqNamespaceRequest): Promise<CreateSofamqNamespaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSofamqNamespaceEx(request, headers, runtime);
  }

  /**
   * Description: create namespace
   * Summary: create namespace
   */
  async createSofamqNamespaceEx(request: CreateSofamqNamespaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSofamqNamespaceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSofamqNamespaceResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.namespace.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSofamqNamespaceResponse({}));
  }

  /**
   * Description: room list
   * Summary: room list
   */
  async listSofamqRoom(request: ListSofamqRoomRequest): Promise<ListSofamqRoomResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSofamqRoomEx(request, headers, runtime);
  }

  /**
   * Description: room list
   * Summary: room list
   */
  async listSofamqRoomEx(request: ListSofamqRoomRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSofamqRoomResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSofamqRoomResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.room.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSofamqRoomResponse({}));
  }

  /**
   * Description: 查询cell列表
   * Summary: 查询cell列表
   */
  async listSofamqCell(request: ListSofamqCellRequest): Promise<ListSofamqCellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSofamqCellEx(request, headers, runtime);
  }

  /**
   * Description: 查询cell列表
   * Summary: 查询cell列表
   */
  async listSofamqCellEx(request: ListSofamqCellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSofamqCellResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSofamqCellResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.cell.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSofamqCellResponse({}));
  }

  /**
   * Description: list cluster
   * Summary: list cluster
   */
  async listSofamqCluster(request: ListSofamqClusterRequest): Promise<ListSofamqClusterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSofamqClusterEx(request, headers, runtime);
  }

  /**
   * Description: list cluster
   * Summary: list cluster
   */
  async listSofamqClusterEx(request: ListSofamqClusterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSofamqClusterResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSofamqClusterResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.cluster.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSofamqClusterResponse({}));
  }

  /**
   * Description: 查看指定的 Group ID 订阅了哪些 Topic。如果 Group ID 对应的消费者实例不在线，则查不到数据。
   * Summary: 查看在线订阅组
   */
  async querySofamqGroupsubdetail(request: QuerySofamqGroupsubdetailRequest): Promise<QuerySofamqGroupsubdetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqGroupsubdetailEx(request, headers, runtime);
  }

  /**
   * Description: 查看指定的 Group ID 订阅了哪些 Topic。如果 Group ID 对应的消费者实例不在线，则查不到数据。
   * Summary: 查看在线订阅组
   */
  async querySofamqGroupsubdetailEx(request: QuerySofamqGroupsubdetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqGroupsubdetailResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqGroupsubdetailResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.groupsubdetail.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqGroupsubdetailResponse({}));
  }

  /**
   * Description: 查询实例基本信息和收发消息的接入点
   * Summary: 查询实例基本信息
   */
  async getSofamqInstancebaseinfo(request: GetSofamqInstancebaseinfoRequest): Promise<GetSofamqInstancebaseinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSofamqInstancebaseinfoEx(request, headers, runtime);
  }

  /**
   * Description: 查询实例基本信息和收发消息的接入点
   * Summary: 查询实例基本信息
   */
  async getSofamqInstancebaseinfoEx(request: GetSofamqInstancebaseinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSofamqInstancebaseinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSofamqInstancebaseinfoResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.instancebaseinfo.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSofamqInstancebaseinfoResponse({}));
  }

  /**
   * Description: 重置指定的 Group ID 的消费位点到指定时间戳。本接口一般用于清理堆积消息，或者回溯消费。提供以下两种清理方式：清理所有消息、清理消费进度到指定的时间。
   * Summary: 重置消费位点
   */
  async execSofamqConsumerresetoffset(request: ExecSofamqConsumerresetoffsetRequest): Promise<ExecSofamqConsumerresetoffsetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execSofamqConsumerresetoffsetEx(request, headers, runtime);
  }

  /**
   * Description: 重置指定的 Group ID 的消费位点到指定时间戳。本接口一般用于清理堆积消息，或者回溯消费。提供以下两种清理方式：清理所有消息、清理消费进度到指定的时间。
   * Summary: 重置消费位点
   */
  async execSofamqConsumerresetoffsetEx(request: ExecSofamqConsumerresetoffsetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecSofamqConsumerresetoffsetResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecSofamqConsumerresetoffsetResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.consumerresetoffset.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecSofamqConsumerresetoffsetResponse({}));
  }

  /**
   * Description: 消费堆积查询一般在生产环境中需要关注 Group ID 消费进度时使用，用于粗略判断消息消费情况和延迟情况。您不仅可以查到该 Group ID 订阅的所有 Topic 的消息堆积情况，还可以查到每个 Topic 各自的消息堆积情况。
   * Summary: 消费者堆积查询
   */
  async querySofamqConsumeraccumulate(request: QuerySofamqConsumeraccumulateRequest): Promise<QuerySofamqConsumeraccumulateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqConsumeraccumulateEx(request, headers, runtime);
  }

  /**
   * Description: 消费堆积查询一般在生产环境中需要关注 Group ID 消费进度时使用，用于粗略判断消息消费情况和延迟情况。您不仅可以查到该 Group ID 订阅的所有 Topic 的消息堆积情况，还可以查到每个 Topic 各自的消息堆积情况。
   * Summary: 消费者堆积查询
   */
  async querySofamqConsumeraccumulateEx(request: QuerySofamqConsumeraccumulateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqConsumeraccumulateResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqConsumeraccumulateResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.consumeraccumulate.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqConsumeraccumulateResponse({}));
  }

  /**
   * Description: 判断指定 Group ID 的消费者是否在线，并获取详细的客户端连接的列表。
   * Summary: 查询指定当前客户端的连接情况。
   */
  async querySofamqConsumerconnection(request: QuerySofamqConsumerconnectionRequest): Promise<QuerySofamqConsumerconnectionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqConsumerconnectionEx(request, headers, runtime);
  }

  /**
   * Description: 判断指定 Group ID 的消费者是否在线，并获取详细的客户端连接的列表。
   * Summary: 查询指定当前客户端的连接情况。
   */
  async querySofamqConsumerconnectionEx(request: QuerySofamqConsumerconnectionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqConsumerconnectionResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqConsumerconnectionResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.consumerconnection.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqConsumerconnectionResponse({}));
  }

  /**
   * Description: 查询指定的 Group ID 订阅的 Topic 的最新消息时间戳以及消费的最新时间。可以查询某个 Topic 当前服务器上存在的消息的最新时间和最早时间，以及查询消费端最近消费的时间。本接口一般用于展示消费进度的概况，与 QueryMqSofamqConsumerAccumulate 接口配合使用。
   * Summary: 查询时间跨度
   */
  async querySofamqConsumertimespan(request: QuerySofamqConsumertimespanRequest): Promise<QuerySofamqConsumertimespanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqConsumertimespanEx(request, headers, runtime);
  }

  /**
   * Description: 查询指定的 Group ID 订阅的 Topic 的最新消息时间戳以及消费的最新时间。可以查询某个 Topic 当前服务器上存在的消息的最新时间和最早时间，以及查询消费端最近消费的时间。本接口一般用于展示消费进度的概况，与 QueryMqSofamqConsumerAccumulate 接口配合使用。
   * Summary: 查询时间跨度
   */
  async querySofamqConsumertimespanEx(request: QuerySofamqConsumertimespanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqConsumertimespanResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqConsumertimespanResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.consumertimespan.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqConsumertimespanResponse({}));
  }

  /**
   * Description: 本接口的实现基于消息队列 Sofamq的内部位点机制，在大部分场景下判断结果可信，但如果应用方进行过重置位点已经清除消息等操作，则判断结果可能有误。
   * Summary: 判断目标消息是否曾被消费过
   */
  async querySofamqMessagetrace(request: QuerySofamqMessagetraceRequest): Promise<QuerySofamqMessagetraceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqMessagetraceEx(request, headers, runtime);
  }

  /**
   * Description: 本接口的实现基于消息队列 Sofamq的内部位点机制，在大部分场景下判断结果可信，但如果应用方进行过重置位点已经清除消息等操作，则判断结果可能有误。
   * Summary: 判断目标消息是否曾被消费过
   */
  async querySofamqMessagetraceEx(request: QuerySofamqMessagetraceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqMessagetraceResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqMessagetraceResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.messagetrace.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqMessagetraceResponse({}));
  }

  /**
   * Description: 根据指定的 Message ID，查询消息。该查询方式属于精确查询。查询条件需要的 Message ID 从每次消息发送成功的 SendResult 中获取，因此业务方必须存储每次发送消息的结果。
   * Summary: 按Message ID查询消息
   */
  async getSofamqMessagebymsgid(request: GetSofamqMessagebymsgidRequest): Promise<GetSofamqMessagebymsgidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSofamqMessagebymsgidEx(request, headers, runtime);
  }

  /**
   * Description: 根据指定的 Message ID，查询消息。该查询方式属于精确查询。查询条件需要的 Message ID 从每次消息发送成功的 SendResult 中获取，因此业务方必须存储每次发送消息的结果。
   * Summary: 按Message ID查询消息
   */
  async getSofamqMessagebymsgidEx(request: GetSofamqMessagebymsgidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSofamqMessagebymsgidResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSofamqMessagebymsgidResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.messagebymsgid.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSofamqMessagebymsgidResponse({}));
  }

  /**
   * Description: 根据指定的 Message Key，查询消息，该查询方式属于模糊查询。由于业务方的 Key 可能不唯一，所以查询结果可能为多条。
   * Summary: 按Message Key查询消息
   */
  async querySofamqMessagebykey(request: QuerySofamqMessagebykeyRequest): Promise<QuerySofamqMessagebykeyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqMessagebykeyEx(request, headers, runtime);
  }

  /**
   * Description: 根据指定的 Message Key，查询消息，该查询方式属于模糊查询。由于业务方的 Key 可能不唯一，所以查询结果可能为多条。
   * Summary: 按Message Key查询消息
   */
  async querySofamqMessagebykeyEx(request: QuerySofamqMessagebykeyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqMessagebykeyResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqMessagebykeyResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.messagebykey.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqMessagebykeyResponse({}));
  }

  /**
   * Description: 已记录了某消息的 Message ID，如需根据此 Message ID 查询该消息的投递轨迹信息，可调用本接口创建查询任务。本接口返回任务 ID 后，可调用 GetMqSofamqTraceResult 接口传入任务 ID，以获取轨迹查询结果。
   * Summary: 通过MsgId创建轨迹查询任务
   */
  async getSofamqTracebymsgid(request: GetSofamqTracebymsgidRequest): Promise<GetSofamqTracebymsgidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSofamqTracebymsgidEx(request, headers, runtime);
  }

  /**
   * Description: 已记录了某消息的 Message ID，如需根据此 Message ID 查询该消息的投递轨迹信息，可调用本接口创建查询任务。本接口返回任务 ID 后，可调用 GetMqSofamqTraceResult 接口传入任务 ID，以获取轨迹查询结果。
   * Summary: 通过MsgId创建轨迹查询任务
   */
  async getSofamqTracebymsgidEx(request: GetSofamqTracebymsgidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSofamqTracebymsgidResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSofamqTracebymsgidResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.tracebymsgid.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSofamqTracebymsgidResponse({}));
  }

  /**
   * Description: 已记录了 Message Key ，如需根据此 Message Key 查询该消息的投递轨迹信息，即可调用本接口创建查询任务。
   * Summary: 通过MsgKey创建轨迹查询任务
   */
  async querySofamqTracebymsgkey(request: QuerySofamqTracebymsgkeyRequest): Promise<QuerySofamqTracebymsgkeyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqTracebymsgkeyEx(request, headers, runtime);
  }

  /**
   * Description: 已记录了 Message Key ，如需根据此 Message Key 查询该消息的投递轨迹信息，即可调用本接口创建查询任务。
   * Summary: 通过MsgKey创建轨迹查询任务
   */
  async querySofamqTracebymsgkeyEx(request: QuerySofamqTracebymsgkeyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqTracebymsgkeyResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqTracebymsgkeyResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.tracebymsgkey.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqTracebymsgkeyResponse({}));
  }

  /**
   * Description: 已根据 Message ID 或者 Message Key 创建了轨迹查询任务，并得到了查询任务的 ID。此时，可调用本接口通过传入该查询任务 ID，获取对应的轨迹查询的结果明细。
   * Summary: 获取轨迹查询结果
   */
  async getSofamqTraceresult(request: GetSofamqTraceresultRequest): Promise<GetSofamqTraceresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSofamqTraceresultEx(request, headers, runtime);
  }

  /**
   * Description: 已根据 Message ID 或者 Message Key 创建了轨迹查询任务，并得到了查询任务的 ID。此时，可调用本接口通过传入该查询任务 ID，获取对应的轨迹查询的结果明细。
   * Summary: 获取轨迹查询结果
   */
  async getSofamqTraceresultEx(request: GetSofamqTraceresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSofamqTraceresultResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSofamqTraceresultResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.traceresult.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSofamqTraceresultResponse({}));
  }

  /**
   * Description: 您可以使用本接口获取在线上环境统计的 Topic 的消息数据信息，可以根据需要择查询指定时间段内 Topic 的写入量或者 TPS 曲线数据。
   * Summary: 查询一段时间写入报表数据
   */
  async querySofamqInputtps(request: QuerySofamqInputtpsRequest): Promise<QuerySofamqInputtpsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqInputtpsEx(request, headers, runtime);
  }

  /**
   * Description: 您可以使用本接口获取在线上环境统计的 Topic 的消息数据信息，可以根据需要择查询指定时间段内 Topic 的写入量或者 TPS 曲线数据。
   * Summary: 查询一段时间写入报表数据
   */
  async querySofamqInputtpsEx(request: QuerySofamqInputtpsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqInputtpsResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqInputtpsResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.inputtps.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqInputtpsResponse({}));
  }

  /**
   * Description: 线上环境生成消费数据报表时，可以使用本接口查询指定的 Group ID 在一段时间内的以下统计信息：
  
  消费消息总量的统计曲线
  消费消息 TPS 的统计曲线
   * Summary: 查询一段时间内消费消息统计信息
   */
  async querySofamqOutputtps(request: QuerySofamqOutputtpsRequest): Promise<QuerySofamqOutputtpsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqOutputtpsEx(request, headers, runtime);
  }

  /**
   * Description: 线上环境生成消费数据报表时，可以使用本接口查询指定的 Group ID 在一段时间内的以下统计信息：
  
  消费消息总量的统计曲线
  消费消息 TPS 的统计曲线
   * Summary: 查询一段时间内消费消息统计信息
   */
  async querySofamqOutputtpsEx(request: QuerySofamqOutputtpsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqOutputtpsResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqOutputtpsResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.outputtps.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqOutputtpsResponse({}));
  }

  /**
   * Description: 根据 Message ID，查询死信消息。该查询方式属于精确查询。查询条件需要的 Message ID 从消息发送成功的 SendResult 中获取，或者从批量查询的接口中获取。
   * Summary: 按Message ID查询死信消息
   */
  async getSofamqDlqbyid(request: GetSofamqDlqbyidRequest): Promise<GetSofamqDlqbyidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSofamqDlqbyidEx(request, headers, runtime);
  }

  /**
   * Description: 根据 Message ID，查询死信消息。该查询方式属于精确查询。查询条件需要的 Message ID 从消息发送成功的 SendResult 中获取，或者从批量查询的接口中获取。
   * Summary: 按Message ID查询死信消息
   */
  async getSofamqDlqbyidEx(request: GetSofamqDlqbyidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSofamqDlqbyidResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSofamqDlqbyidResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.dlqbyid.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSofamqDlqbyidResponse({}));
  }

  /**
   * Description: 重发指定 Message ID 的死信消息。使该死信消息复活，让消息能够被 Consumer 再消费一次。
  
  死信消息已达最大重试次数，若重发后再次消费失败，则死信队列中将增加一条 Message ID 相同的消息，可通过控制台死信队列的查询页面或者管控 API 查看该结果。您可通过同一 Message ID 的消息出现次数判断重发后依然消费失败的次数。
   * Summary: 重新发送死信消息
   */
  async execSofamqDlqresendbyid(request: ExecSofamqDlqresendbyidRequest): Promise<ExecSofamqDlqresendbyidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execSofamqDlqresendbyidEx(request, headers, runtime);
  }

  /**
   * Description: 重发指定 Message ID 的死信消息。使该死信消息复活，让消息能够被 Consumer 再消费一次。
  
  死信消息已达最大重试次数，若重发后再次消费失败，则死信队列中将增加一条 Message ID 相同的消息，可通过控制台死信队列的查询页面或者管控 API 查看该结果。您可通过同一 Message ID 的消息出现次数判断重发后依然消费失败的次数。
   * Summary: 重新发送死信消息
   */
  async execSofamqDlqresendbyidEx(request: ExecSofamqDlqresendbyidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecSofamqDlqresendbyidResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecSofamqDlqresendbyidResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.dlqresendbyid.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecSofamqDlqresendbyidResponse({}));
  }

  /**
   * Description: list ns
   * Summary: list ns
   */
  async listSofamqNamespace(request: ListSofamqNamespaceRequest): Promise<ListSofamqNamespaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSofamqNamespaceEx(request, headers, runtime);
  }

  /**
   * Description: list ns
   * Summary: list ns
   */
  async listSofamqNamespaceEx(request: ListSofamqNamespaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSofamqNamespaceResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSofamqNamespaceResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.namespace.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSofamqNamespaceResponse({}));
  }

  /**
   * Description: 发送测试消息
   * Summary: 发送测试信息
   */
  async sendSofamqMessage(request: SendSofamqMessageRequest): Promise<SendSofamqMessageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendSofamqMessageEx(request, headers, runtime);
  }

  /**
   * Description: 发送测试消息
   * Summary: 发送测试信息
   */
  async sendSofamqMessageEx(request: SendSofamqMessageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendSofamqMessageResponse> {
    Util.validateModel(request);
    return $tea.cast<SendSofamqMessageResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.message.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendSofamqMessageResponse({}));
  }

  /**
   * Description: 消费验证
   * Summary: 消费验证
   */
  async pushSofamqMessage(request: PushSofamqMessageRequest): Promise<PushSofamqMessageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushSofamqMessageEx(request, headers, runtime);
  }

  /**
   * Description: 消费验证
   * Summary: 消费验证
   */
  async pushSofamqMessageEx(request: PushSofamqMessageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushSofamqMessageResponse> {
    Util.validateModel(request);
    return $tea.cast<PushSofamqMessageResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.message.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushSofamqMessageResponse({}));
  }

  /**
   * Description: getNodesByNamespaceId
   * Summary: get nodes by ns id
   */
  async querySofamqNodebynamespaceid(request: QuerySofamqNodebynamespaceidRequest): Promise<QuerySofamqNodebynamespaceidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqNodebynamespaceidEx(request, headers, runtime);
  }

  /**
   * Description: getNodesByNamespaceId
   * Summary: get nodes by ns id
   */
  async querySofamqNodebynamespaceidEx(request: QuerySofamqNodebynamespaceidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqNodebynamespaceidResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqNodebynamespaceidResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.nodebynamespaceid.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqNodebynamespaceidResponse({}));
  }

  /**
   * Description: query room by ns
   * Summary: query room by ns
   */
  async querySofamqRoombynamespaceid(request: QuerySofamqRoombynamespaceidRequest): Promise<QuerySofamqRoombynamespaceidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqRoombynamespaceidEx(request, headers, runtime);
  }

  /**
   * Description: query room by ns
   * Summary: query room by ns
   */
  async querySofamqRoombynamespaceidEx(request: QuerySofamqRoombynamespaceidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqRoombynamespaceidResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqRoombynamespaceidResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.roombynamespaceid.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqRoombynamespaceidResponse({}));
  }

  /**
   * Description: 通过传入 Topic 名称和时间段，分页查询指定时间段内该 Topic 内存在的所有消息。
   * Summary: 按Topic查询消息
   */
  async querySofamqMessagebytopic(request: QuerySofamqMessagebytopicRequest): Promise<QuerySofamqMessagebytopicResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqMessagebytopicEx(request, headers, runtime);
  }

  /**
   * Description: 通过传入 Topic 名称和时间段，分页查询指定时间段内该 Topic 内存在的所有消息。
   * Summary: 按Topic查询消息
   */
  async querySofamqMessagebytopicEx(request: QuerySofamqMessagebytopicRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqMessagebytopicResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqMessagebytopicResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.messagebytopic.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqMessagebytopicResponse({}));
  }

  /**
   * Description: 通过传入 Group ID 和时间段，分页查询指定时间段内该 Group ID 内存在的所有死信消息。
   * Summary: 按Group ID查询死信消息
   */
  async querySofamqDlqbygroupid(request: QuerySofamqDlqbygroupidRequest): Promise<QuerySofamqDlqbygroupidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqDlqbygroupidEx(request, headers, runtime);
  }

  /**
   * Description: 通过传入 Group ID 和时间段，分页查询指定时间段内该 Group ID 内存在的所有死信消息。
   * Summary: 按Group ID查询死信消息
   */
  async querySofamqDlqbygroupidEx(request: QuerySofamqDlqbygroupidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqDlqbygroupidResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqDlqbygroupidResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.dlqbygroupid.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqDlqbygroupidResponse({}));
  }

  /**
   * Description: 查询指定 Group ID 的详细状态数据，包含订阅关系检查、消费 TPS 统计、负载均衡状态、消费端连接等。
   * Summary: 查询消费状态
   */
  async getSofamqConsumerstatus(request: GetSofamqConsumerstatusRequest): Promise<GetSofamqConsumerstatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSofamqConsumerstatusEx(request, headers, runtime);
  }

  /**
   * Description: 查询指定 Group ID 的详细状态数据，包含订阅关系检查、消费 TPS 统计、负载均衡状态、消费端连接等。
   * Summary: 查询消费状态
   */
  async getSofamqConsumerstatusEx(request: GetSofamqConsumerstatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSofamqConsumerstatusResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSofamqConsumerstatusResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.consumerstatus.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSofamqConsumerstatusResponse({}));
  }

  /**
   * Description: 更新指定 Topic 的描述信息。
   * Summary: 更新Topic的描述
   */
  async updateSofamqTopicremark(request: UpdateSofamqTopicremarkRequest): Promise<UpdateSofamqTopicremarkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSofamqTopicremarkEx(request, headers, runtime);
  }

  /**
   * Description: 更新指定 Topic 的描述信息。
   * Summary: 更新Topic的描述
   */
  async updateSofamqTopicremarkEx(request: UpdateSofamqTopicremarkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSofamqTopicremarkResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSofamqTopicremarkResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.topicremark.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSofamqTopicremarkResponse({}));
  }

  /**
   * Description: datacenter list
   * Summary: datacenter
   */
  async createSofamqDatacenter(request: CreateSofamqDatacenterRequest): Promise<CreateSofamqDatacenterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSofamqDatacenterEx(request, headers, runtime);
  }

  /**
   * Description: datacenter list
   * Summary: datacenter
   */
  async createSofamqDatacenterEx(request: CreateSofamqDatacenterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSofamqDatacenterResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSofamqDatacenterResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.datacenter.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSofamqDatacenterResponse({}));
  }

  /**
   * Description: datacenter list
   * Summary: datacenter list
   */
  async listSofamqDatacenter(request: ListSofamqDatacenterRequest): Promise<ListSofamqDatacenterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSofamqDatacenterEx(request, headers, runtime);
  }

  /**
   * Description: datacenter list
   * Summary: datacenter list
   */
  async listSofamqDatacenterEx(request: ListSofamqDatacenterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSofamqDatacenterResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSofamqDatacenterResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.datacenter.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSofamqDatacenterResponse({}));
  }

  /**
   * Description: config list
   * Summary: config list
   */
  async listSofamqConfig(request: ListSofamqConfigRequest): Promise<ListSofamqConfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSofamqConfigEx(request, headers, runtime);
  }

  /**
   * Description: config list
   * Summary: config list
   */
  async listSofamqConfigEx(request: ListSofamqConfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSofamqConfigResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSofamqConfigResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.config.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSofamqConfigResponse({}));
  }

  /**
   * Description: 更新指定 Group 的描述信息。
   * Summary: 更新Group的描述
   */
  async updateSofamqGroupremark(request: UpdateSofamqGroupremarkRequest): Promise<UpdateSofamqGroupremarkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSofamqGroupremarkEx(request, headers, runtime);
  }

  /**
   * Description: 更新指定 Group 的描述信息。
   * Summary: 更新Group的描述
   */
  async updateSofamqGroupremarkEx(request: UpdateSofamqGroupremarkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSofamqGroupremarkResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSofamqGroupremarkResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.groupremark.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSofamqGroupremarkResponse({}));
  }

  /**
   * Description: 下载消息
   * Summary: 下载消息
   */
  async downloadSofamqMessage(request: DownloadSofamqMessageRequest): Promise<DownloadSofamqMessageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.downloadSofamqMessageEx(request, headers, runtime);
  }

  /**
   * Description: 下载消息
   * Summary: 下载消息
   */
  async downloadSofamqMessageEx(request: DownloadSofamqMessageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DownloadSofamqMessageResponse> {
    Util.validateModel(request);
    return $tea.cast<DownloadSofamqMessageResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.message.download", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DownloadSofamqMessageResponse({}));
  }

  /**
   * Description: 获取指定或全部的 Topic 资源监控统计信息。
   * Summary: 获取 topic 统计信息
   */
  async queryMetricsTopic(request: QueryMetricsTopicRequest): Promise<QueryMetricsTopicResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMetricsTopicEx(request, headers, runtime);
  }

  /**
   * Description: 获取指定或全部的 Topic 资源监控统计信息。
   * Summary: 获取 topic 统计信息
   */
  async queryMetricsTopicEx(request: QueryMetricsTopicRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMetricsTopicResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMetricsTopicResponse>(await this.doRequest("2.0", "sofa.mq.metrics.topic.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMetricsTopicResponse({}));
  }

  /**
   * Description: 查询指定时间范围内的积压数据。
   * Summary: 查看积压数据
   */
  async queryMetricsBacklog(request: QueryMetricsBacklogRequest): Promise<QueryMetricsBacklogResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMetricsBacklogEx(request, headers, runtime);
  }

  /**
   * Description: 查询指定时间范围内的积压数据。
   * Summary: 查看积压数据
   */
  async queryMetricsBacklogEx(request: QueryMetricsBacklogRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMetricsBacklogResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMetricsBacklogResponse>(await this.doRequest("2.0", "sofa.mq.metrics.backlog.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMetricsBacklogResponse({}));
  }

  /**
   * Description: 查询监控数据概览信息，包括消息堆积数量、死信消息数量、订阅关系数量等。
   * Summary: 监控数据概览
   */
  async queryMetricsOverview(request: QueryMetricsOverviewRequest): Promise<QueryMetricsOverviewResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMetricsOverviewEx(request, headers, runtime);
  }

  /**
   * Description: 查询监控数据概览信息，包括消息堆积数量、死信消息数量、订阅关系数量等。
   * Summary: 监控数据概览
   */
  async queryMetricsOverviewEx(request: QueryMetricsOverviewRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMetricsOverviewResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMetricsOverviewResponse>(await this.doRequest("2.0", "sofa.mq.metrics.overview.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMetricsOverviewResponse({}));
  }

  /**
   * Description: 查询消息路由列表信息。
   * Summary: 查询路由列表
   */
  async listSofamqRouter(request: ListSofamqRouterRequest): Promise<ListSofamqRouterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSofamqRouterEx(request, headers, runtime);
  }

  /**
   * Description: 查询消息路由列表信息。
   * Summary: 查询路由列表
   */
  async listSofamqRouterEx(request: ListSofamqRouterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSofamqRouterResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSofamqRouterResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.router.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSofamqRouterResponse({}));
  }

  /**
   * Description: 创建一个消息路由任务。
   * Summary: 创建路由
   */
  async createSofamqRouter(request: CreateSofamqRouterRequest): Promise<CreateSofamqRouterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSofamqRouterEx(request, headers, runtime);
  }

  /**
   * Description: 创建一个消息路由任务。
   * Summary: 创建路由
   */
  async createSofamqRouterEx(request: CreateSofamqRouterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSofamqRouterResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSofamqRouterResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.router.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSofamqRouterResponse({}));
  }

  /**
   * Description: delete node
   * Summary: delete node
   */
  async deleteSofamqNode(request: DeleteSofamqNodeRequest): Promise<DeleteSofamqNodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSofamqNodeEx(request, headers, runtime);
  }

  /**
   * Description: delete node
   * Summary: delete node
   */
  async deleteSofamqNodeEx(request: DeleteSofamqNodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSofamqNodeResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSofamqNodeResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.node.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSofamqNodeResponse({}));
  }

  /**
   * Description: delete room
   * Summary: delete room
   */
  async deleteSofamqRoom(request: DeleteSofamqRoomRequest): Promise<DeleteSofamqRoomResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSofamqRoomEx(request, headers, runtime);
  }

  /**
   * Description: delete room
   * Summary: delete room
   */
  async deleteSofamqRoomEx(request: DeleteSofamqRoomRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSofamqRoomResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSofamqRoomResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.room.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSofamqRoomResponse({}));
  }

  /**
   * Description: del cell
   * Summary: del cell
   */
  async deleteSofamqCell(request: DeleteSofamqCellRequest): Promise<DeleteSofamqCellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSofamqCellEx(request, headers, runtime);
  }

  /**
   * Description: del cell
   * Summary: del cell
   */
  async deleteSofamqCellEx(request: DeleteSofamqCellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSofamqCellResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSofamqCellResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.cell.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSofamqCellResponse({}));
  }

  /**
   * Description: del cluster
   * Summary: del cluster
   */
  async deleteSofamqCluster(request: DeleteSofamqClusterRequest): Promise<DeleteSofamqClusterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSofamqClusterEx(request, headers, runtime);
  }

  /**
   * Description: del cluster
   * Summary: del cluster
   */
  async deleteSofamqClusterEx(request: DeleteSofamqClusterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSofamqClusterResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSofamqClusterResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.cluster.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSofamqClusterResponse({}));
  }

  /**
   * Description: del ns
   * Summary: del ns
   */
  async deleteSofamqNamespace(request: DeleteSofamqNamespaceRequest): Promise<DeleteSofamqNamespaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSofamqNamespaceEx(request, headers, runtime);
  }

  /**
   * Description: del ns
   * Summary: del ns
   */
  async deleteSofamqNamespaceEx(request: DeleteSofamqNamespaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSofamqNamespaceResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSofamqNamespaceResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.namespace.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSofamqNamespaceResponse({}));
  }

  /**
   * Description: del dc
   * Summary: del dc
   */
  async deleteSofamqDatacenter(request: DeleteSofamqDatacenterRequest): Promise<DeleteSofamqDatacenterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSofamqDatacenterEx(request, headers, runtime);
  }

  /**
   * Description: del dc
   * Summary: del dc
   */
  async deleteSofamqDatacenterEx(request: DeleteSofamqDatacenterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSofamqDatacenterResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSofamqDatacenterResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.datacenter.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSofamqDatacenterResponse({}));
  }

  /**
   * Description: 删除指定的消息路由任务。
   * Summary: 删除路由
   */
  async deleteSofamqRouter(request: DeleteSofamqRouterRequest): Promise<DeleteSofamqRouterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSofamqRouterEx(request, headers, runtime);
  }

  /**
   * Description: 删除指定的消息路由任务。
   * Summary: 删除路由
   */
  async deleteSofamqRouterEx(request: DeleteSofamqRouterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSofamqRouterResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSofamqRouterResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.router.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSofamqRouterResponse({}));
  }

  /**
   * Description: create config
   * Summary: create config
   */
  async createSofamqConfig(request: CreateSofamqConfigRequest): Promise<CreateSofamqConfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSofamqConfigEx(request, headers, runtime);
  }

  /**
   * Description: create config
   * Summary: create config
   */
  async createSofamqConfigEx(request: CreateSofamqConfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSofamqConfigResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSofamqConfigResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.config.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSofamqConfigResponse({}));
  }

  /**
   * Description: query cells
   * Summary: query cells
   */
  async querySofamqCell(request: QuerySofamqCellRequest): Promise<QuerySofamqCellResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqCellEx(request, headers, runtime);
  }

  /**
   * Description: query cells
   * Summary: query cells
   */
  async querySofamqCellEx(request: QuerySofamqCellRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqCellResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqCellResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.cell.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqCellResponse({}));
  }

  /**
   * Description: 查询路由
   * Summary: 查询路由
   */
  async querySofamqRouter(request: QuerySofamqRouterRequest): Promise<QuerySofamqRouterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqRouterEx(request, headers, runtime);
  }

  /**
   * Description: 查询路由
   * Summary: 查询路由
   */
  async querySofamqRouterEx(request: QuerySofamqRouterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqRouterResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqRouterResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.router.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqRouterResponse({}));
  }

  /**
   * Description: get instance
   * Summary: get instance
   */
  async getMiddlewareInstance(request: GetMiddlewareInstanceRequest): Promise<GetMiddlewareInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getMiddlewareInstanceEx(request, headers, runtime);
  }

  /**
   * Description: get instance
   * Summary: get instance
   */
  async getMiddlewareInstanceEx(request: GetMiddlewareInstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetMiddlewareInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetMiddlewareInstanceResponse>(await this.doRequest("2.0", "sofa.mq.middleware.instance.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetMiddlewareInstanceResponse({}));
  }

  /**
   * Description: get endpoint
   * Summary: get endpoint
   */
  async getMiddlewareEndpoint(request: GetMiddlewareEndpointRequest): Promise<GetMiddlewareEndpointResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getMiddlewareEndpointEx(request, headers, runtime);
  }

  /**
   * Description: get endpoint
   * Summary: get endpoint
   */
  async getMiddlewareEndpointEx(request: GetMiddlewareEndpointRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetMiddlewareEndpointResponse> {
    Util.validateModel(request);
    return $tea.cast<GetMiddlewareEndpointResponse>(await this.doRequest("2.0", "sofa.mq.middleware.endpoint.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetMiddlewareEndpointResponse({}));
  }

  /**
   * Description: cellbytype
   * Summary: cellbytype
   */
  async querySofamqCellbytype(request: QuerySofamqCellbytypeRequest): Promise<QuerySofamqCellbytypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqCellbytypeEx(request, headers, runtime);
  }

  /**
   * Description: cellbytype
   * Summary: cellbytype
   */
  async querySofamqCellbytypeEx(request: QuerySofamqCellbytypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqCellbytypeResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqCellbytypeResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.cellbytype.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqCellbytypeResponse({}));
  }

  /**
   * Description: 查询指定实例下的消息轨迹查询任务列表信息。
   * Summary: 查询trace请求列表
   */
  async listSofamqTrace(request: ListSofamqTraceRequest): Promise<ListSofamqTraceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSofamqTraceEx(request, headers, runtime);
  }

  /**
   * Description: 查询指定实例下的消息轨迹查询任务列表信息。
   * Summary: 查询trace请求列表
   */
  async listSofamqTraceEx(request: ListSofamqTraceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSofamqTraceResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSofamqTraceResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.trace.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSofamqTraceResponse({}));
  }

  /**
   * Description: 删除指定的消息轨迹查询任务。
   * Summary: 删除trace查询任务
   */
  async deleteSofamqTrace(request: DeleteSofamqTraceRequest): Promise<DeleteSofamqTraceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSofamqTraceEx(request, headers, runtime);
  }

  /**
   * Description: 删除指定的消息轨迹查询任务。
   * Summary: 删除trace查询任务
   */
  async deleteSofamqTraceEx(request: DeleteSofamqTraceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSofamqTraceResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSofamqTraceResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.trace.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSofamqTraceResponse({}));
  }

  /**
   * Description: 通过传入 Topic 名称创建消息轨迹查询任务，得到该查询任务的 ID。
   * Summary: 通过Topic创建轨迹查询任务
   */
  async querySofamqTracebytopic(request: QuerySofamqTracebytopicRequest): Promise<QuerySofamqTracebytopicResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqTracebytopicEx(request, headers, runtime);
  }

  /**
   * Description: 通过传入 Topic 名称创建消息轨迹查询任务，得到该查询任务的 ID。
   * Summary: 通过Topic创建轨迹查询任务
   */
  async querySofamqTracebytopicEx(request: QuerySofamqTracebytopicRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqTracebytopicResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqTracebytopicResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.tracebytopic.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqTracebytopicResponse({}));
  }

  /**
   * Description: sofamq 支付后回调
   * Summary: sofamq 支付后回调
   */
  async pushSpiPaycallback(request: PushSpiPaycallbackRequest): Promise<PushSpiPaycallbackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushSpiPaycallbackEx(request, headers, runtime);
  }

  /**
   * Description: sofamq 支付后回调
   * Summary: sofamq 支付后回调
   */
  async pushSpiPaycallbackEx(request: PushSpiPaycallbackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushSpiPaycallbackResponse> {
    Util.validateModel(request);
    return $tea.cast<PushSpiPaycallbackResponse>(await this.doRequest("2.0", "sofa.mq.spi.paycallback.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushSpiPaycallbackResponse({}));
  }

  /**
   * Description: 补全商品信息
   * Summary: 补全商品信息
   */
  async pushSpiCompletecommodity(request: PushSpiCompletecommodityRequest): Promise<PushSpiCompletecommodityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushSpiCompletecommodityEx(request, headers, runtime);
  }

  /**
   * Description: 补全商品信息
   * Summary: 补全商品信息
   */
  async pushSpiCompletecommodityEx(request: PushSpiCompletecommodityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushSpiCompletecommodityResponse> {
    Util.validateModel(request);
    return $tea.cast<PushSpiCompletecommodityResponse>(await this.doRequest("2.0", "sofa.mq.spi.completecommodity.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushSpiCompletecommodityResponse({}));
  }

  /**
   * Description: 订单校验
   * Summary: 订单校验
   */
  async pushSpiOrderverify(request: PushSpiOrderverifyRequest): Promise<PushSpiOrderverifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushSpiOrderverifyEx(request, headers, runtime);
  }

  /**
   * Description: 订单校验
   * Summary: 订单校验
   */
  async pushSpiOrderverifyEx(request: PushSpiOrderverifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushSpiOrderverifyResponse> {
    Util.validateModel(request);
    return $tea.cast<PushSpiOrderverifyResponse>(await this.doRequest("2.0", "sofa.mq.spi.orderverify.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushSpiOrderverifyResponse({}));
  }

  /**
   * Description: 生命周期回调
   * Summary: 生命周期回调
   */
  async pushSpiOpencallback(request: PushSpiOpencallbackRequest): Promise<PushSpiOpencallbackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushSpiOpencallbackEx(request, headers, runtime);
  }

  /**
   * Description: 生命周期回调
   * Summary: 生命周期回调
   */
  async pushSpiOpencallbackEx(request: PushSpiOpencallbackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushSpiOpencallbackResponse> {
    Util.validateModel(request);
    return $tea.cast<PushSpiOpencallbackResponse>(await this.doRequest("2.0", "sofa.mq.spi.opencallback.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushSpiOpencallbackResponse({}));
  }

  /**
   * Description: getldcbynamespace
   * Summary: getldcbynamespace
   */
  async getSofamqLdcbynamespace(request: GetSofamqLdcbynamespaceRequest): Promise<GetSofamqLdcbynamespaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSofamqLdcbynamespaceEx(request, headers, runtime);
  }

  /**
   * Description: getldcbynamespace
   * Summary: getldcbynamespace
   */
  async getSofamqLdcbynamespaceEx(request: GetSofamqLdcbynamespaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSofamqLdcbynamespaceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSofamqLdcbynamespaceResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.ldcbynamespace.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSofamqLdcbynamespaceResponse({}));
  }

  /**
   * Description: 更新指定的消息路由任务的配置信息。
   * Summary: 更新路由配置
   */
  async updateSofamqRouter(request: UpdateSofamqRouterRequest): Promise<UpdateSofamqRouterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSofamqRouterEx(request, headers, runtime);
  }

  /**
   * Description: 更新指定的消息路由任务的配置信息。
   * Summary: 更新路由配置
   */
  async updateSofamqRouterEx(request: UpdateSofamqRouterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSofamqRouterResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSofamqRouterResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.router.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSofamqRouterResponse({}));
  }

  /**
   * Description: 批量重发指定 Message ID 的死信消息，使这些消息能够被 Consumer 再次消费。
   * Summary: 批量重发死信消息
   */
  async execSofamqDlqresendbatch(request: ExecSofamqDlqresendbatchRequest): Promise<ExecSofamqDlqresendbatchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execSofamqDlqresendbatchEx(request, headers, runtime);
  }

  /**
   * Description: 批量重发指定 Message ID 的死信消息，使这些消息能够被 Consumer 再次消费。
   * Summary: 批量重发死信消息
   */
  async execSofamqDlqresendbatchEx(request: ExecSofamqDlqresendbatchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecSofamqDlqresendbatchResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecSofamqDlqresendbatchResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.dlqresendbatch.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecSofamqDlqresendbatchResponse({}));
  }

  /**
   * Description: 获取报警规则列表信息。
   * Summary: 获取告警列表
   */
  async listSofamqWarn(request: ListSofamqWarnRequest): Promise<ListSofamqWarnResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSofamqWarnEx(request, headers, runtime);
  }

  /**
   * Description: 获取报警规则列表信息。
   * Summary: 获取告警列表
   */
  async listSofamqWarnEx(request: ListSofamqWarnRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSofamqWarnResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSofamqWarnResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.warn.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSofamqWarnResponse({}));
  }

  /**
   * Description: 创建一条报警规则。
   * Summary: 创建告警规则
   */
  async createSofamqWarn(request: CreateSofamqWarnRequest): Promise<CreateSofamqWarnResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSofamqWarnEx(request, headers, runtime);
  }

  /**
   * Description: 创建一条报警规则。
   * Summary: 创建告警规则
   */
  async createSofamqWarnEx(request: CreateSofamqWarnRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSofamqWarnResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSofamqWarnResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.warn.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSofamqWarnResponse({}));
  }

  /**
   * Description: 通过传入报警规则 ID，删除指定的报警规则。
   * Summary: 删除告警规则
   */
  async deleteSofamqWarn(request: DeleteSofamqWarnRequest): Promise<DeleteSofamqWarnResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSofamqWarnEx(request, headers, runtime);
  }

  /**
   * Description: 通过传入报警规则 ID，删除指定的报警规则。
   * Summary: 删除告警规则
   */
  async deleteSofamqWarnEx(request: DeleteSofamqWarnRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSofamqWarnResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSofamqWarnResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.warn.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSofamqWarnResponse({}));
  }

  /**
   * Description: 更新指定报警规则的配置信息。
   * Summary: 更新告警规则
   */
  async updateSofamqWarn(request: UpdateSofamqWarnRequest): Promise<UpdateSofamqWarnResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSofamqWarnEx(request, headers, runtime);
  }

  /**
   * Description: 更新指定报警规则的配置信息。
   * Summary: 更新告警规则
   */
  async updateSofamqWarnEx(request: UpdateSofamqWarnRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSofamqWarnResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSofamqWarnResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.warn.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSofamqWarnResponse({}));
  }

  /**
   * Description: 通过传入报警规则 ID，启用指定的报警规则。
   * Summary: 打开告警开关
   */
  async enableSofamqWarn(request: EnableSofamqWarnRequest): Promise<EnableSofamqWarnResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.enableSofamqWarnEx(request, headers, runtime);
  }

  /**
   * Description: 通过传入报警规则 ID，启用指定的报警规则。
   * Summary: 打开告警开关
   */
  async enableSofamqWarnEx(request: EnableSofamqWarnRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<EnableSofamqWarnResponse> {
    Util.validateModel(request);
    return $tea.cast<EnableSofamqWarnResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.warn.enable", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new EnableSofamqWarnResponse({}));
  }

  /**
   * Description: 通过传入报警规则 ID，禁用指定的报警规则。
   * Summary: 关闭告警开关
   */
  async disableSofamqWarn(request: DisableSofamqWarnRequest): Promise<DisableSofamqWarnResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.disableSofamqWarnEx(request, headers, runtime);
  }

  /**
   * Description: 通过传入报警规则 ID，禁用指定的报警规则。
   * Summary: 关闭告警开关
   */
  async disableSofamqWarnEx(request: DisableSofamqWarnRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DisableSofamqWarnResponse> {
    Util.validateModel(request);
    return $tea.cast<DisableSofamqWarnResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.warn.disable", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DisableSofamqWarnResponse({}));
  }

  /**
   * Description: 可以通过本接口查询历史报警记录，目前默认保存 30 天以内的报警信息。
   * Summary: 查询告警日志
   */
  async listSofamqWarnlog(request: ListSofamqWarnlogRequest): Promise<ListSofamqWarnlogResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSofamqWarnlogEx(request, headers, runtime);
  }

  /**
   * Description: 可以通过本接口查询历史报警记录，目前默认保存 30 天以内的报警信息。
   * Summary: 查询告警日志
   */
  async listSofamqWarnlogEx(request: ListSofamqWarnlogRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSofamqWarnlogResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSofamqWarnlogResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.warnlog.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSofamqWarnlogResponse({}));
  }

  /**
   * Description: 管理员查看topic
   * Summary: 管理员查看topic
   */
  async listSofamqAdmintopic(request: ListSofamqAdmintopicRequest): Promise<ListSofamqAdmintopicResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSofamqAdmintopicEx(request, headers, runtime);
  }

  /**
   * Description: 管理员查看topic
   * Summary: 管理员查看topic
   */
  async listSofamqAdmintopicEx(request: ListSofamqAdmintopicRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSofamqAdmintopicResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSofamqAdmintopicResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.admintopic.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSofamqAdmintopicResponse({}));
  }

  /**
   * Description: 查询 Topic、Group 实时的发送消费速度。
   * Summary: topicgroup实时的发送消费速度
   */
  async queryMetricsTginstant(request: QueryMetricsTginstantRequest): Promise<QueryMetricsTginstantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMetricsTginstantEx(request, headers, runtime);
  }

  /**
   * Description: 查询 Topic、Group 实时的发送消费速度。
   * Summary: topicgroup实时的发送消费速度
   */
  async queryMetricsTginstantEx(request: QueryMetricsTginstantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMetricsTginstantResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMetricsTginstantResponse>(await this.doRequest("2.0", "sofa.mq.metrics.tginstant.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMetricsTginstantResponse({}));
  }

  /**
   * Description: 查询指定时间端内 Topic、Group 的历史统计数据。
   * Summary: 获取 topic、group 的历史数据
   */
  async queryMetricsTghistory(request: QueryMetricsTghistoryRequest): Promise<QueryMetricsTghistoryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMetricsTghistoryEx(request, headers, runtime);
  }

  /**
   * Description: 查询指定时间端内 Topic、Group 的历史统计数据。
   * Summary: 获取 topic、group 的历史数据
   */
  async queryMetricsTghistoryEx(request: QueryMetricsTghistoryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMetricsTghistoryResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMetricsTghistoryResponse>(await this.doRequest("2.0", "sofa.mq.metrics.tghistory.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMetricsTghistoryResponse({}));
  }

  /**
   * Description: 根据实例 ID，查询该实例的资源统计信息，包括 Topic 数量、订阅关系数量、死信数量等。
   * Summary: 获取实例的基本信息
   */
  async queryMetricsInstance(request: QueryMetricsInstanceRequest): Promise<QueryMetricsInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMetricsInstanceEx(request, headers, runtime);
  }

  /**
   * Description: 根据实例 ID，查询该实例的资源统计信息，包括 Topic 数量、订阅关系数量、死信数量等。
   * Summary: 获取实例的基本信息
   */
  async queryMetricsInstanceEx(request: QueryMetricsInstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMetricsInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMetricsInstanceResponse>(await this.doRequest("2.0", "sofa.mq.metrics.instance.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMetricsInstanceResponse({}));
  }

  /**
   * Description: 查询指定实例下的历史统计数据，包括每分钟消费数据大小、每分钟发送消息大小等。
   * Summary: 获取实例的历史统计数据
   */
  async queryMetricsInstancehistory(request: QueryMetricsInstancehistoryRequest): Promise<QueryMetricsInstancehistoryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMetricsInstancehistoryEx(request, headers, runtime);
  }

  /**
   * Description: 查询指定实例下的历史统计数据，包括每分钟消费数据大小、每分钟发送消息大小等。
   * Summary: 获取实例的历史统计数据
   */
  async queryMetricsInstancehistoryEx(request: QueryMetricsInstancehistoryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMetricsInstancehistoryResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMetricsInstancehistoryResponse>(await this.doRequest("2.0", "sofa.mq.metrics.instancehistory.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMetricsInstancehistoryResponse({}));
  }

  /**
   * Description: 查询指定实例下 Topic 的统计列表信息。
   * Summary: 查询 topic 统计列表
   */
  async queryStatsTopic(request: QueryStatsTopicRequest): Promise<QueryStatsTopicResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryStatsTopicEx(request, headers, runtime);
  }

  /**
   * Description: 查询指定实例下 Topic 的统计列表信息。
   * Summary: 查询 topic 统计列表
   */
  async queryStatsTopicEx(request: QueryStatsTopicRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryStatsTopicResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryStatsTopicResponse>(await this.doRequest("2.0", "sofa.mq.stats.topic.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryStatsTopicResponse({}));
  }

  /**
   * Description: 获取指定实例下 Group 的统计信息。
   * Summary: 获取当前实例的 group 统计信息
   */
  async queryStatsGroup(request: QueryStatsGroupRequest): Promise<QueryStatsGroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryStatsGroupEx(request, headers, runtime);
  }

  /**
   * Description: 获取指定实例下 Group 的统计信息。
   * Summary: 获取当前实例的 group 统计信息
   */
  async queryStatsGroupEx(request: QueryStatsGroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryStatsGroupResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryStatsGroupResponse>(await this.doRequest("2.0", "sofa.mq.stats.group.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryStatsGroupResponse({}));
  }

  /**
   * Description: 管理员查看group
   * Summary: 管理员查看group
   */
  async listSofamqAdmingroup(request: ListSofamqAdmingroupRequest): Promise<ListSofamqAdmingroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSofamqAdmingroupEx(request, headers, runtime);
  }

  /**
   * Description: 管理员查看group
   * Summary: 管理员查看group
   */
  async listSofamqAdmingroupEx(request: ListSofamqAdmingroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSofamqAdmingroupResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSofamqAdmingroupResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.admingroup.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSofamqAdmingroupResponse({}));
  }

  /**
   * Description: 查询kv配置
   * Summary: 查询kv配置
   */
  async listSofamqKvconfig(request: ListSofamqKvconfigRequest): Promise<ListSofamqKvconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSofamqKvconfigEx(request, headers, runtime);
  }

  /**
   * Description: 查询kv配置
   * Summary: 查询kv配置
   */
  async listSofamqKvconfigEx(request: ListSofamqKvconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSofamqKvconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSofamqKvconfigResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.kvconfig.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSofamqKvconfigResponse({}));
  }

  /**
   * Description: 创建kvconfig
   * Summary: 创建kvconfig
   */
  async createSofamqKvconfig(request: CreateSofamqKvconfigRequest): Promise<CreateSofamqKvconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSofamqKvconfigEx(request, headers, runtime);
  }

  /**
   * Description: 创建kvconfig
   * Summary: 创建kvconfig
   */
  async createSofamqKvconfigEx(request: CreateSofamqKvconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSofamqKvconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSofamqKvconfigResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.kvconfig.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSofamqKvconfigResponse({}));
  }

  /**
   * Description: 删除kvconfig
   * Summary: 删除kvconfig
   */
  async deleteSofamqKvconfig(request: DeleteSofamqKvconfigRequest): Promise<DeleteSofamqKvconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSofamqKvconfigEx(request, headers, runtime);
  }

  /**
   * Description: 删除kvconfig
   * Summary: 删除kvconfig
   */
  async deleteSofamqKvconfigEx(request: DeleteSofamqKvconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSofamqKvconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSofamqKvconfigResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.kvconfig.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSofamqKvconfigResponse({}));
  }

  /**
   * Description: 修改kvconfig值
   * Summary: 修改kvconfig值
   */
  async updateSofamqKvconfig(request: UpdateSofamqKvconfigRequest): Promise<UpdateSofamqKvconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSofamqKvconfigEx(request, headers, runtime);
  }

  /**
   * Description: 修改kvconfig值
   * Summary: 修改kvconfig值
   */
  async updateSofamqKvconfigEx(request: UpdateSofamqKvconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSofamqKvconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSofamqKvconfigResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.kvconfig.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSofamqKvconfigResponse({}));
  }

  /**
   * Description: 删除config配置
   * Summary: 删除config配置
   */
  async deleteSofamqConfig(request: DeleteSofamqConfigRequest): Promise<DeleteSofamqConfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSofamqConfigEx(request, headers, runtime);
  }

  /**
   * Description: 删除config配置
   * Summary: 删除config配置
   */
  async deleteSofamqConfigEx(request: DeleteSofamqConfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSofamqConfigResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSofamqConfigResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.config.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSofamqConfigResponse({}));
  }

  /**
   * Description: 更新config配置
   * Summary: 更新config配置
   */
  async updateSofamqConfig(request: UpdateSofamqConfigRequest): Promise<UpdateSofamqConfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSofamqConfigEx(request, headers, runtime);
  }

  /**
   * Description: 更新config配置
   * Summary: 更新config配置
   */
  async updateSofamqConfigEx(request: UpdateSofamqConfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSofamqConfigResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSofamqConfigResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.config.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSofamqConfigResponse({}));
  }

  /**
   * Description: update cluster
   * Summary: update cluster
   */
  async updateSofamqCluster(request: UpdateSofamqClusterRequest): Promise<UpdateSofamqClusterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSofamqClusterEx(request, headers, runtime);
  }

  /**
   * Description: update cluster
   * Summary: update cluster
   */
  async updateSofamqClusterEx(request: UpdateSofamqClusterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSofamqClusterResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSofamqClusterResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.cluster.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSofamqClusterResponse({}));
  }

  /**
   * Description: update dc
   * Summary: update dc
   */
  async updateSofamqDatacenter(request: UpdateSofamqDatacenterRequest): Promise<UpdateSofamqDatacenterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSofamqDatacenterEx(request, headers, runtime);
  }

  /**
   * Description: update dc
   * Summary: update dc
   */
  async updateSofamqDatacenterEx(request: UpdateSofamqDatacenterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSofamqDatacenterResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSofamqDatacenterResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.datacenter.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSofamqDatacenterResponse({}));
  }

  /**
   * Description: update room
   * Summary: update room
   */
  async updateSofamqRoom(request: UpdateSofamqRoomRequest): Promise<UpdateSofamqRoomResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSofamqRoomEx(request, headers, runtime);
  }

  /**
   * Description: update room
   * Summary: update room
   */
  async updateSofamqRoomEx(request: UpdateSofamqRoomRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSofamqRoomResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSofamqRoomResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.room.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSofamqRoomResponse({}));
  }

  /**
   * Description: update node
   * Summary: update node
   */
  async updateSofamqNode(request: UpdateSofamqNodeRequest): Promise<UpdateSofamqNodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSofamqNodeEx(request, headers, runtime);
  }

  /**
   * Description: update node
   * Summary: update node
   */
  async updateSofamqNodeEx(request: UpdateSofamqNodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSofamqNodeResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSofamqNodeResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.node.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSofamqNodeResponse({}));
  }

  /**
   * Description: 查询指定的 Topic 的队列信息。
   * Summary: 查询topic的队列信息
   */
  async querySofamqTopicqueue(request: QuerySofamqTopicqueueRequest): Promise<QuerySofamqTopicqueueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqTopicqueueEx(request, headers, runtime);
  }

  /**
   * Description: 查询指定的 Topic 的队列信息。
   * Summary: 查询topic的队列信息
   */
  async querySofamqTopicqueueEx(request: QuerySofamqTopicqueueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqTopicqueueResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqTopicqueueResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.topicqueue.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqTopicqueueResponse({}));
  }

  /**
   * Description: 查看在线订阅topic
   * Summary: 查看在线订阅topic
   */
  async querySofamqAdmingroupsubdetail(request: QuerySofamqAdmingroupsubdetailRequest): Promise<QuerySofamqAdmingroupsubdetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqAdmingroupsubdetailEx(request, headers, runtime);
  }

  /**
   * Description: 查看在线订阅topic
   * Summary: 查看在线订阅topic
   */
  async querySofamqAdmingroupsubdetailEx(request: QuerySofamqAdmingroupsubdetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqAdmingroupsubdetailResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqAdmingroupsubdetailResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.admingroupsubdetail.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqAdmingroupsubdetailResponse({}));
  }

  /**
   * Description: 管理员列表
   * Summary: 管理员列表
   */
  async listSofamqAdminuser(request: ListSofamqAdminuserRequest): Promise<ListSofamqAdminuserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSofamqAdminuserEx(request, headers, runtime);
  }

  /**
   * Description: 管理员列表
   * Summary: 管理员列表
   */
  async listSofamqAdminuserEx(request: ListSofamqAdminuserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSofamqAdminuserResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSofamqAdminuserResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.adminuser.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSofamqAdminuserResponse({}));
  }

  /**
   * Description: 添加用户
   * Summary: 添加用户
   */
  async createSofamqAdminuser(request: CreateSofamqAdminuserRequest): Promise<CreateSofamqAdminuserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSofamqAdminuserEx(request, headers, runtime);
  }

  /**
   * Description: 添加用户
   * Summary: 添加用户
   */
  async createSofamqAdminuserEx(request: CreateSofamqAdminuserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSofamqAdminuserResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSofamqAdminuserResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.adminuser.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSofamqAdminuserResponse({}));
  }

  /**
   * Description: 删除管理员用户
   * Summary: 删除管理员用户
   */
  async deleteSofamqAdminuser(request: DeleteSofamqAdminuserRequest): Promise<DeleteSofamqAdminuserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSofamqAdminuserEx(request, headers, runtime);
  }

  /**
   * Description: 删除管理员用户
   * Summary: 删除管理员用户
   */
  async deleteSofamqAdminuserEx(request: DeleteSofamqAdminuserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSofamqAdminuserResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSofamqAdminuserResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.adminuser.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSofamqAdminuserResponse({}));
  }

  /**
   * Description: 查询用户侧接口列表
   * Summary: 查询用户侧接口列表
   */
  async listSofamqAdminapi(request: ListSofamqAdminapiRequest): Promise<ListSofamqAdminapiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSofamqAdminapiEx(request, headers, runtime);
  }

  /**
   * Description: 查询用户侧接口列表
   * Summary: 查询用户侧接口列表
   */
  async listSofamqAdminapiEx(request: ListSofamqAdminapiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSofamqAdminapiResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSofamqAdminapiResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.adminapi.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSofamqAdminapiResponse({}));
  }

  /**
   * Description: api权限更新
   * Summary: api权限更新
   */
  async switchSofamqAdminapi(request: SwitchSofamqAdminapiRequest): Promise<SwitchSofamqAdminapiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.switchSofamqAdminapiEx(request, headers, runtime);
  }

  /**
   * Description: api权限更新
   * Summary: api权限更新
   */
  async switchSofamqAdminapiEx(request: SwitchSofamqAdminapiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SwitchSofamqAdminapiResponse> {
    Util.validateModel(request);
    return $tea.cast<SwitchSofamqAdminapiResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.adminapi.switch", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SwitchSofamqAdminapiResponse({}));
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async addDmsMsgtype(request: AddDmsMsgtypeRequest): Promise<AddDmsMsgtypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addDmsMsgtypeEx(request, headers, runtime);
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async addDmsMsgtypeEx(request: AddDmsMsgtypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddDmsMsgtypeResponse> {
    Util.validateModel(request);
    return $tea.cast<AddDmsMsgtypeResponse>(await this.doRequest("2.0", "sofa.mq.dms.msgtype.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddDmsMsgtypeResponse({}));
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async listDmsMsgtype(request: ListDmsMsgtypeRequest): Promise<ListDmsMsgtypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listDmsMsgtypeEx(request, headers, runtime);
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async listDmsMsgtypeEx(request: ListDmsMsgtypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListDmsMsgtypeResponse> {
    Util.validateModel(request);
    return $tea.cast<ListDmsMsgtypeResponse>(await this.doRequest("2.0", "sofa.mq.dms.msgtype.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListDmsMsgtypeResponse({}));
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async createDmsBinding(request: CreateDmsBindingRequest): Promise<CreateDmsBindingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDmsBindingEx(request, headers, runtime);
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async createDmsBindingEx(request: CreateDmsBindingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDmsBindingResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDmsBindingResponse>(await this.doRequest("2.0", "sofa.mq.dms.binding.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDmsBindingResponse({}));
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async listDmsBinding(request: ListDmsBindingRequest): Promise<ListDmsBindingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listDmsBindingEx(request, headers, runtime);
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async listDmsBindingEx(request: ListDmsBindingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListDmsBindingResponse> {
    Util.validateModel(request);
    return $tea.cast<ListDmsBindingResponse>(await this.doRequest("2.0", "sofa.mq.dms.binding.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListDmsBindingResponse({}));
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async deleteDmsMsgtype(request: DeleteDmsMsgtypeRequest): Promise<DeleteDmsMsgtypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteDmsMsgtypeEx(request, headers, runtime);
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async deleteDmsMsgtypeEx(request: DeleteDmsMsgtypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteDmsMsgtypeResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteDmsMsgtypeResponse>(await this.doRequest("2.0", "sofa.mq.dms.msgtype.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteDmsMsgtypeResponse({}));
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async deleteDmsBinding(request: DeleteDmsBindingRequest): Promise<DeleteDmsBindingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteDmsBindingEx(request, headers, runtime);
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async deleteDmsBindingEx(request: DeleteDmsBindingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteDmsBindingResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteDmsBindingResponse>(await this.doRequest("2.0", "sofa.mq.dms.binding.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteDmsBindingResponse({}));
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async updateDmsMsgtype(request: UpdateDmsMsgtypeRequest): Promise<UpdateDmsMsgtypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateDmsMsgtypeEx(request, headers, runtime);
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async updateDmsMsgtypeEx(request: UpdateDmsMsgtypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateDmsMsgtypeResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDmsMsgtypeResponse>(await this.doRequest("2.0", "sofa.mq.dms.msgtype.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateDmsMsgtypeResponse({}));
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async updateDmsBinding(request: UpdateDmsBindingRequest): Promise<UpdateDmsBindingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateDmsBindingEx(request, headers, runtime);
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async updateDmsBindingEx(request: UpdateDmsBindingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateDmsBindingResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDmsBindingResponse>(await this.doRequest("2.0", "sofa.mq.dms.binding.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateDmsBindingResponse({}));
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async queryDmsMsg(request: QueryDmsMsgRequest): Promise<QueryDmsMsgResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDmsMsgEx(request, headers, runtime);
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async queryDmsMsgEx(request: QueryDmsMsgRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDmsMsgResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDmsMsgResponse>(await this.doRequest("2.0", "sofa.mq.dms.msg.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDmsMsgResponse({}));
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async batchqueryDmsMsg(request: BatchqueryDmsMsgRequest): Promise<BatchqueryDmsMsgResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryDmsMsgEx(request, headers, runtime);
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async batchqueryDmsMsgEx(request: BatchqueryDmsMsgRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryDmsMsgResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryDmsMsgResponse>(await this.doRequest("2.0", "sofa.mq.dms.msg.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryDmsMsgResponse({}));
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async deleteDmsMsg(request: DeleteDmsMsgRequest): Promise<DeleteDmsMsgResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteDmsMsgEx(request, headers, runtime);
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async deleteDmsMsgEx(request: DeleteDmsMsgRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteDmsMsgResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteDmsMsgResponse>(await this.doRequest("2.0", "sofa.mq.dms.msg.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteDmsMsgResponse({}));
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async batchdeleteDmsMsg(request: BatchdeleteDmsMsgRequest): Promise<BatchdeleteDmsMsgResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchdeleteDmsMsgEx(request, headers, runtime);
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async batchdeleteDmsMsgEx(request: BatchdeleteDmsMsgRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchdeleteDmsMsgResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchdeleteDmsMsgResponse>(await this.doRequest("2.0", "sofa.mq.dms.msg.batchdelete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchdeleteDmsMsgResponse({}));
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async exportDmsMsgtype(request: ExportDmsMsgtypeRequest): Promise<ExportDmsMsgtypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.exportDmsMsgtypeEx(request, headers, runtime);
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async exportDmsMsgtypeEx(request: ExportDmsMsgtypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExportDmsMsgtypeResponse> {
    Util.validateModel(request);
    return $tea.cast<ExportDmsMsgtypeResponse>(await this.doRequest("2.0", "sofa.mq.dms.msgtype.export", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExportDmsMsgtypeResponse({}));
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async importDmsMsgtype(request: ImportDmsMsgtypeRequest): Promise<ImportDmsMsgtypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importDmsMsgtypeEx(request, headers, runtime);
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async importDmsMsgtypeEx(request: ImportDmsMsgtypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportDmsMsgtypeResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportDmsMsgtypeResponse>(await this.doRequest("2.0", "sofa.mq.dms.msgtype.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportDmsMsgtypeResponse({}));
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async exportDmsBinding(request: ExportDmsBindingRequest): Promise<ExportDmsBindingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.exportDmsBindingEx(request, headers, runtime);
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async exportDmsBindingEx(request: ExportDmsBindingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExportDmsBindingResponse> {
    Util.validateModel(request);
    return $tea.cast<ExportDmsBindingResponse>(await this.doRequest("2.0", "sofa.mq.dms.binding.export", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExportDmsBindingResponse({}));
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async importDmsBinding(request: ImportDmsBindingRequest): Promise<ImportDmsBindingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importDmsBindingEx(request, headers, runtime);
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async importDmsBindingEx(request: ImportDmsBindingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportDmsBindingResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportDmsBindingResponse>(await this.doRequest("2.0", "sofa.mq.dms.binding.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportDmsBindingResponse({}));
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async listDmsWhitelist(request: ListDmsWhitelistRequest): Promise<ListDmsWhitelistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listDmsWhitelistEx(request, headers, runtime);
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async listDmsWhitelistEx(request: ListDmsWhitelistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListDmsWhitelistResponse> {
    Util.validateModel(request);
    return $tea.cast<ListDmsWhitelistResponse>(await this.doRequest("2.0", "sofa.mq.dms.whitelist.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListDmsWhitelistResponse({}));
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async addDmsWhitelist(request: AddDmsWhitelistRequest): Promise<AddDmsWhitelistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addDmsWhitelistEx(request, headers, runtime);
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async addDmsWhitelistEx(request: AddDmsWhitelistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddDmsWhitelistResponse> {
    Util.validateModel(request);
    return $tea.cast<AddDmsWhitelistResponse>(await this.doRequest("2.0", "sofa.mq.dms.whitelist.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddDmsWhitelistResponse({}));
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async deleteDmsWhitelist(request: DeleteDmsWhitelistRequest): Promise<DeleteDmsWhitelistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteDmsWhitelistEx(request, headers, runtime);
  }

  /**
   * Description: dms
   * Summary: dms
   */
  async deleteDmsWhitelistEx(request: DeleteDmsWhitelistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteDmsWhitelistResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteDmsWhitelistResponse>(await this.doRequest("2.0", "sofa.mq.dms.whitelist.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteDmsWhitelistResponse({}));
  }

  /**
   * Description: admin
   * Summary: topics
   */
  async getDmsTopics(request: GetDmsTopicsRequest): Promise<GetDmsTopicsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDmsTopicsEx(request, headers, runtime);
  }

  /**
   * Description: admin
   * Summary: topics
   */
  async getDmsTopicsEx(request: GetDmsTopicsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDmsTopicsResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDmsTopicsResponse>(await this.doRequest("2.0", "sofa.mq.dms.topics.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDmsTopicsResponse({}));
  }

  /**
   * Description: 查询消费者堆栈信息，便于定位问题。
   * Summary: 查询消费者堆栈信息
   */
  async getSofamqConsumerjstack(request: GetSofamqConsumerjstackRequest): Promise<GetSofamqConsumerjstackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSofamqConsumerjstackEx(request, headers, runtime);
  }

  /**
   * Description: 查询消费者堆栈信息，便于定位问题。
   * Summary: 查询消费者堆栈信息
   */
  async getSofamqConsumerjstackEx(request: GetSofamqConsumerjstackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSofamqConsumerjstackResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSofamqConsumerjstackResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.consumerjstack.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSofamqConsumerjstackResponse({}));
  }

  /**
   * Description: uploadurl
   * Summary: uploadurl
   */
  async queryDmsUploadurl(request: QueryDmsUploadurlRequest): Promise<QueryDmsUploadurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDmsUploadurlEx(request, headers, runtime);
  }

  /**
   * Description: uploadurl
   * Summary: uploadurl
   */
  async queryDmsUploadurlEx(request: QueryDmsUploadurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDmsUploadurlResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDmsUploadurlResponse>(await this.doRequest("2.0", "sofa.mq.dms.uploadurl.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDmsUploadurlResponse({}));
  }

  /**
   * Description: msgtypetemplate
   * Summary: msgtypetemplate
   */
  async getDmsMsgtypetemplate(request: GetDmsMsgtypetemplateRequest): Promise<GetDmsMsgtypetemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDmsMsgtypetemplateEx(request, headers, runtime);
  }

  /**
   * Description: msgtypetemplate
   * Summary: msgtypetemplate
   */
  async getDmsMsgtypetemplateEx(request: GetDmsMsgtypetemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDmsMsgtypetemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDmsMsgtypetemplateResponse>(await this.doRequest("2.0", "sofa.mq.dms.msgtypetemplate.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDmsMsgtypetemplateResponse({}));
  }

  /**
   * Description: template
   * Summary: template
   */
  async getDmsBindingtemplate(request: GetDmsBindingtemplateRequest): Promise<GetDmsBindingtemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDmsBindingtemplateEx(request, headers, runtime);
  }

  /**
   * Description: template
   * Summary: template
   */
  async getDmsBindingtemplateEx(request: GetDmsBindingtemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDmsBindingtemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDmsBindingtemplateResponse>(await this.doRequest("2.0", "sofa.mq.dms.bindingtemplate.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDmsBindingtemplateResponse({}));
  }

  /**
   * Description: 查询msgdump消息同步任务源端资源
   * Summary: 查询msgdump消息同步任务源端资源
   */
  async queryMsgdumpSource(request: QueryMsgdumpSourceRequest): Promise<QueryMsgdumpSourceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMsgdumpSourceEx(request, headers, runtime);
  }

  /**
   * Description: 查询msgdump消息同步任务源端资源
   * Summary: 查询msgdump消息同步任务源端资源
   */
  async queryMsgdumpSourceEx(request: QueryMsgdumpSourceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMsgdumpSourceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMsgdumpSourceResponse>(await this.doRequest("2.0", "sofa.mq.msgdump.source.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMsgdumpSourceResponse({}));
  }

  /**
   * Description: 创建 msgdump 同步任务
   * Summary: 创建同步任务
   */
  async createMsgdumpTask(request: CreateMsgdumpTaskRequest): Promise<CreateMsgdumpTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createMsgdumpTaskEx(request, headers, runtime);
  }

  /**
   * Description: 创建 msgdump 同步任务
   * Summary: 创建同步任务
   */
  async createMsgdumpTaskEx(request: CreateMsgdumpTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateMsgdumpTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateMsgdumpTaskResponse>(await this.doRequest("2.0", "sofa.mq.msgdump.task.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateMsgdumpTaskResponse({}));
  }

  /**
   * Description: 查询消息同步任务
   * Summary: 查询消息同步任务
   */
  async queryMsgdumpTask(request: QueryMsgdumpTaskRequest): Promise<QueryMsgdumpTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMsgdumpTaskEx(request, headers, runtime);
  }

  /**
   * Description: 查询消息同步任务
   * Summary: 查询消息同步任务
   */
  async queryMsgdumpTaskEx(request: QueryMsgdumpTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMsgdumpTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMsgdumpTaskResponse>(await this.doRequest("2.0", "sofa.mq.msgdump.task.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMsgdumpTaskResponse({}));
  }

  /**
   * Description: 删除 msgdump 任务
   * Summary: 删除 msgdump 任务
   */
  async deleteMsgdumpTask(request: DeleteMsgdumpTaskRequest): Promise<DeleteMsgdumpTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteMsgdumpTaskEx(request, headers, runtime);
  }

  /**
   * Description: 删除 msgdump 任务
   * Summary: 删除 msgdump 任务
   */
  async deleteMsgdumpTaskEx(request: DeleteMsgdumpTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteMsgdumpTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteMsgdumpTaskResponse>(await this.doRequest("2.0", "sofa.mq.msgdump.task.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteMsgdumpTaskResponse({}));
  }

  /**
   * Description: 更新msgdump任务状态
   * Summary: 更新msgdump任务状态
   */
  async enableMsgdumpTask(request: EnableMsgdumpTaskRequest): Promise<EnableMsgdumpTaskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.enableMsgdumpTaskEx(request, headers, runtime);
  }

  /**
   * Description: 更新msgdump任务状态
   * Summary: 更新msgdump任务状态
   */
  async enableMsgdumpTaskEx(request: EnableMsgdumpTaskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<EnableMsgdumpTaskResponse> {
    Util.validateModel(request);
    return $tea.cast<EnableMsgdumpTaskResponse>(await this.doRequest("2.0", "sofa.mq.msgdump.task.enable", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new EnableMsgdumpTaskResponse({}));
  }

  /**
   * Description: schema metadata 分页查询
   * Summary: schema metadata 分页查询
   */
  async listSchemaAdminmetadata(request: ListSchemaAdminmetadataRequest): Promise<ListSchemaAdminmetadataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSchemaAdminmetadataEx(request, headers, runtime);
  }

  /**
   * Description: schema metadata 分页查询
   * Summary: schema metadata 分页查询
   */
  async listSchemaAdminmetadataEx(request: ListSchemaAdminmetadataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSchemaAdminmetadataResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSchemaAdminmetadataResponse>(await this.doRequest("2.0", "sofa.mq.schema.adminmetadata.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSchemaAdminmetadataResponse({}));
  }

  /**
   * Description: 新增schema的metadata信息
   * Summary: 新增schema的metadata信息
   */
  async createSchemaAdminmetadata(request: CreateSchemaAdminmetadataRequest): Promise<CreateSchemaAdminmetadataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSchemaAdminmetadataEx(request, headers, runtime);
  }

  /**
   * Description: 新增schema的metadata信息
   * Summary: 新增schema的metadata信息
   */
  async createSchemaAdminmetadataEx(request: CreateSchemaAdminmetadataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSchemaAdminmetadataResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSchemaAdminmetadataResponse>(await this.doRequest("2.0", "sofa.mq.schema.adminmetadata.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSchemaAdminmetadataResponse({}));
  }

  /**
   * Description: 更新schema元信息
   * Summary: 更新schema元信息
   */
  async updateSchemaAdminmetadata(request: UpdateSchemaAdminmetadataRequest): Promise<UpdateSchemaAdminmetadataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSchemaAdminmetadataEx(request, headers, runtime);
  }

  /**
   * Description: 更新schema元信息
   * Summary: 更新schema元信息
   */
  async updateSchemaAdminmetadataEx(request: UpdateSchemaAdminmetadataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSchemaAdminmetadataResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSchemaAdminmetadataResponse>(await this.doRequest("2.0", "sofa.mq.schema.adminmetadata.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSchemaAdminmetadataResponse({}));
  }

  /**
   * Description: 删除schema元信息
   * Summary: 删除schema元信息
   */
  async deleteSchemaAdminmetadata(request: DeleteSchemaAdminmetadataRequest): Promise<DeleteSchemaAdminmetadataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSchemaAdminmetadataEx(request, headers, runtime);
  }

  /**
   * Description: 删除schema元信息
   * Summary: 删除schema元信息
   */
  async deleteSchemaAdminmetadataEx(request: DeleteSchemaAdminmetadataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSchemaAdminmetadataResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSchemaAdminmetadataResponse>(await this.doRequest("2.0", "sofa.mq.schema.adminmetadata.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSchemaAdminmetadataResponse({}));
  }

  /**
   * Description: 分页查看schema详情
   * Summary: 分页查看schema详情
   */
  async listSchemaAdmindetail(request: ListSchemaAdmindetailRequest): Promise<ListSchemaAdmindetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSchemaAdmindetailEx(request, headers, runtime);
  }

  /**
   * Description: 分页查看schema详情
   * Summary: 分页查看schema详情
   */
  async listSchemaAdmindetailEx(request: ListSchemaAdmindetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSchemaAdmindetailResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSchemaAdmindetailResponse>(await this.doRequest("2.0", "sofa.mq.schema.admindetail.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSchemaAdmindetailResponse({}));
  }

  /**
   * Description: 新增schema详情
   * Summary: 新增schema详情
   */
  async createSchemaAdmindetail(request: CreateSchemaAdmindetailRequest): Promise<CreateSchemaAdmindetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSchemaAdmindetailEx(request, headers, runtime);
  }

  /**
   * Description: 新增schema详情
   * Summary: 新增schema详情
   */
  async createSchemaAdmindetailEx(request: CreateSchemaAdmindetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSchemaAdmindetailResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSchemaAdmindetailResponse>(await this.doRequest("2.0", "sofa.mq.schema.admindetail.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSchemaAdmindetailResponse({}));
  }

  /**
   * Description: admindetail
   * Summary: 删除schema详情
   */
  async deleteSchemaAdmindetail(request: DeleteSchemaAdmindetailRequest): Promise<DeleteSchemaAdmindetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSchemaAdmindetailEx(request, headers, runtime);
  }

  /**
   * Description: admindetail
   * Summary: 删除schema详情
   */
  async deleteSchemaAdmindetailEx(request: DeleteSchemaAdmindetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSchemaAdmindetailResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSchemaAdmindetailResponse>(await this.doRequest("2.0", "sofa.mq.schema.admindetail.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSchemaAdmindetailResponse({}));
  }

  /**
   * Description: 查询endpoint
   * Summary: 查询endpoint
   */
  async querySofamqEndpoint(request: QuerySofamqEndpointRequest): Promise<QuerySofamqEndpointResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqEndpointEx(request, headers, runtime);
  }

  /**
   * Description: 查询endpoint
   * Summary: 查询endpoint
   */
  async querySofamqEndpointEx(request: QuerySofamqEndpointRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqEndpointResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqEndpointResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.endpoint.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqEndpointResponse({}));
  }

  /**
   * Description: 按照条件查看schema元数据
   * Summary: 按照条件查看schema元数据
   */
  async querySchemaAdminmetadata(request: QuerySchemaAdminmetadataRequest): Promise<QuerySchemaAdminmetadataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySchemaAdminmetadataEx(request, headers, runtime);
  }

  /**
   * Description: 按照条件查看schema元数据
   * Summary: 按照条件查看schema元数据
   */
  async querySchemaAdminmetadataEx(request: QuerySchemaAdminmetadataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySchemaAdminmetadataResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySchemaAdminmetadataResponse>(await this.doRequest("2.0", "sofa.mq.schema.adminmetadata.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySchemaAdminmetadataResponse({}));
  }

  /**
   * Description: 查询schema的config配置
   * Summary: 查询schema的config配置
   */
  async querySchemaAdminconfig(request: QuerySchemaAdminconfigRequest): Promise<QuerySchemaAdminconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySchemaAdminconfigEx(request, headers, runtime);
  }

  /**
   * Description: 查询schema的config配置
   * Summary: 查询schema的config配置
   */
  async querySchemaAdminconfigEx(request: QuerySchemaAdminconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySchemaAdminconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySchemaAdminconfigResponse>(await this.doRequest("2.0", "sofa.mq.schema.adminconfig.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySchemaAdminconfigResponse({}));
  }

  /**
   * Description: 查询console页面的链接
   * Summary: 查询console页面的链接
   */
  async querySofamqLink(request: QuerySofamqLinkRequest): Promise<QuerySofamqLinkResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqLinkEx(request, headers, runtime);
  }

  /**
   * Description: 查询console页面的链接
   * Summary: 查询console页面的链接
   */
  async querySofamqLinkEx(request: QuerySofamqLinkRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqLinkResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqLinkResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.link.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqLinkResponse({}));
  }

  /**
   * Description: 查询全部topic名字
   * Summary: 查询全部topic名字
   */
  async querySofamqTopicname(request: QuerySofamqTopicnameRequest): Promise<QuerySofamqTopicnameResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqTopicnameEx(request, headers, runtime);
  }

  /**
   * Description: 查询全部topic名字
   * Summary: 查询全部topic名字
   */
  async querySofamqTopicnameEx(request: QuerySofamqTopicnameRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqTopicnameResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqTopicnameResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.topicname.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqTopicnameResponse({}));
  }

  /**
   * Description: 查询全部group名字
   * Summary: 查询全部group名字
   */
  async querySofamqGroupname(request: QuerySofamqGroupnameRequest): Promise<QuerySofamqGroupnameResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqGroupnameEx(request, headers, runtime);
  }

  /**
   * Description: 查询全部group名字
   * Summary: 查询全部group名字
   */
  async querySofamqGroupnameEx(request: QuerySofamqGroupnameRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqGroupnameResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqGroupnameResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.groupname.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqGroupnameResponse({}));
  }

  /**
   * Description: 管理员创建topic
   * Summary: 管理员创建topic
   */
  async createSofamqAdmintopic(request: CreateSofamqAdmintopicRequest): Promise<CreateSofamqAdmintopicResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSofamqAdmintopicEx(request, headers, runtime);
  }

  /**
   * Description: 管理员创建topic
   * Summary: 管理员创建topic
   */
  async createSofamqAdmintopicEx(request: CreateSofamqAdmintopicRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSofamqAdmintopicResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSofamqAdmintopicResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.admintopic.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSofamqAdmintopicResponse({}));
  }

  /**
   * Description: 管理员创建group
   * Summary: 管理员创建group
   */
  async createSofamqAdmingroup(request: CreateSofamqAdmingroupRequest): Promise<CreateSofamqAdmingroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSofamqAdmingroupEx(request, headers, runtime);
  }

  /**
   * Description: 管理员创建group
   * Summary: 管理员创建group
   */
  async createSofamqAdmingroupEx(request: CreateSofamqAdmingroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSofamqAdmingroupResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSofamqAdmingroupResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.admingroup.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSofamqAdmingroupResponse({}));
  }

  /**
   * Description: 查询特定的连接任务详情
   * Summary: 查询特定的连接任务详情
   */
  async querySofamqConnector(request: QuerySofamqConnectorRequest): Promise<QuerySofamqConnectorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqConnectorEx(request, headers, runtime);
  }

  /**
   * Description: 查询特定的连接任务详情
   * Summary: 查询特定的连接任务详情
   */
  async querySofamqConnectorEx(request: QuerySofamqConnectorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqConnectorResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqConnectorResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connector.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqConnectorResponse({}));
  }

  /**
   * Description: 新增一个连接器任务
   * Summary: 新增一个连接器任务
   */
  async createSofamqConnector(request: CreateSofamqConnectorRequest): Promise<CreateSofamqConnectorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSofamqConnectorEx(request, headers, runtime);
  }

  /**
   * Description: 新增一个连接器任务
   * Summary: 新增一个连接器任务
   */
  async createSofamqConnectorEx(request: CreateSofamqConnectorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSofamqConnectorResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSofamqConnectorResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connector.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSofamqConnectorResponse({}));
  }

  /**
   * Description: 查询所有的连接任务，允许携带查询条件
   * Summary: 查询连接任务
   */
  async listSofamqConnector(request: ListSofamqConnectorRequest): Promise<ListSofamqConnectorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSofamqConnectorEx(request, headers, runtime);
  }

  /**
   * Description: 查询所有的连接任务，允许携带查询条件
   * Summary: 查询连接任务
   */
  async listSofamqConnectorEx(request: ListSofamqConnectorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSofamqConnectorResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSofamqConnectorResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connector.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSofamqConnectorResponse({}));
  }

  /**
   * Description: 删除一个连接器任务
   * Summary: 删除一个连接器任务
   */
  async deleteSofamqConnector(request: DeleteSofamqConnectorRequest): Promise<DeleteSofamqConnectorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSofamqConnectorEx(request, headers, runtime);
  }

  /**
   * Description: 删除一个连接器任务
   * Summary: 删除一个连接器任务
   */
  async deleteSofamqConnectorEx(request: DeleteSofamqConnectorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSofamqConnectorResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSofamqConnectorResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connector.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSofamqConnectorResponse({}));
  }

  /**
   * Description: 启动一个连接器的任务
   * Summary: 启动一个连接器的任务
   */
  async enableSofamqConnector(request: EnableSofamqConnectorRequest): Promise<EnableSofamqConnectorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.enableSofamqConnectorEx(request, headers, runtime);
  }

  /**
   * Description: 启动一个连接器的任务
   * Summary: 启动一个连接器的任务
   */
  async enableSofamqConnectorEx(request: EnableSofamqConnectorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<EnableSofamqConnectorResponse> {
    Util.validateModel(request);
    return $tea.cast<EnableSofamqConnectorResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connector.enable", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new EnableSofamqConnectorResponse({}));
  }

  /**
   * Description: 停止一个连接器任务
   * Summary: 停止一个连接器任务
   */
  async disableSofamqConnector(request: DisableSofamqConnectorRequest): Promise<DisableSofamqConnectorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.disableSofamqConnectorEx(request, headers, runtime);
  }

  /**
   * Description: 停止一个连接器任务
   * Summary: 停止一个连接器任务
   */
  async disableSofamqConnectorEx(request: DisableSofamqConnectorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DisableSofamqConnectorResponse> {
    Util.validateModel(request);
    return $tea.cast<DisableSofamqConnectorResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connector.disable", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DisableSofamqConnectorResponse({}));
  }

  /**
   * Description: 列出所有任务的调度类型
   * Summary: 列出所有任务的调度类型
   */
  async listSofamqConnectorscheuletype(request: ListSofamqConnectorscheuletypeRequest): Promise<ListSofamqConnectorscheuletypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSofamqConnectorscheuletypeEx(request, headers, runtime);
  }

  /**
   * Description: 列出所有任务的调度类型
   * Summary: 列出所有任务的调度类型
   */
  async listSofamqConnectorscheuletypeEx(request: ListSofamqConnectorscheuletypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSofamqConnectorscheuletypeResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSofamqConnectorscheuletypeResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connectorscheuletype.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSofamqConnectorscheuletypeResponse({}));
  }

  /**
   * Description: 列出所有支持的来源类型
   * Summary: 列出所有支持的来源类型
   */
  async listSofamqConnectorsourcetype(request: ListSofamqConnectorsourcetypeRequest): Promise<ListSofamqConnectorsourcetypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSofamqConnectorsourcetypeEx(request, headers, runtime);
  }

  /**
   * Description: 列出所有支持的来源类型
   * Summary: 列出所有支持的来源类型
   */
  async listSofamqConnectorsourcetypeEx(request: ListSofamqConnectorsourcetypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSofamqConnectorsourcetypeResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSofamqConnectorsourcetypeResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connectorsourcetype.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSofamqConnectorsourcetypeResponse({}));
  }

  /**
   * Description: 列出所有支持的去向类型
   * Summary: 列出所有支持的去向类型
   */
  async listSofamqConnectorsinktype(request: ListSofamqConnectorsinktypeRequest): Promise<ListSofamqConnectorsinktypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSofamqConnectorsinktypeEx(request, headers, runtime);
  }

  /**
   * Description: 列出所有支持的去向类型
   * Summary: 列出所有支持的去向类型
   */
  async listSofamqConnectorsinktypeEx(request: ListSofamqConnectorsinktypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSofamqConnectorsinktypeResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSofamqConnectorsinktypeResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connectorsinktype.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSofamqConnectorsinktypeResponse({}));
  }

  /**
   * Description: 根据不同的来源或去向的类型，加载出前端需要渲染出来 让用户配置的  配置项控件。
   * Summary: 加载不同数据来源和去向对应的前端配置
   */
  async loadSofamqConnectorconfigs(request: LoadSofamqConnectorconfigsRequest): Promise<LoadSofamqConnectorconfigsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.loadSofamqConnectorconfigsEx(request, headers, runtime);
  }

  /**
   * Description: 根据不同的来源或去向的类型，加载出前端需要渲染出来 让用户配置的  配置项控件。
   * Summary: 加载不同数据来源和去向对应的前端配置
   */
  async loadSofamqConnectorconfigsEx(request: LoadSofamqConnectorconfigsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<LoadSofamqConnectorconfigsResponse> {
    Util.validateModel(request);
    return $tea.cast<LoadSofamqConnectorconfigsResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connectorconfigs.load", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new LoadSofamqConnectorconfigsResponse({}));
  }

  /**
   * Description: connect按照时间段返回当前任务的执行记录
   * Summary: connect执行记录查询
   */
  async querySofamqConnectordate(request: QuerySofamqConnectordateRequest): Promise<QuerySofamqConnectordateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqConnectordateEx(request, headers, runtime);
  }

  /**
   * Description: connect按照时间段返回当前任务的执行记录
   * Summary: connect执行记录查询
   */
  async querySofamqConnectordateEx(request: QuerySofamqConnectordateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqConnectordateResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqConnectordateResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connectordate.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqConnectordateResponse({}));
  }

  /**
   * Description: 根据执行时间返回当前的任务记录执行详情
   * Summary: 根据执行时间返回当前的任务记录执行详情
   */
  async querySofamqConnectorrecord(request: QuerySofamqConnectorrecordRequest): Promise<QuerySofamqConnectorrecordResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqConnectorrecordEx(request, headers, runtime);
  }

  /**
   * Description: 根据执行时间返回当前的任务记录执行详情
   * Summary: 根据执行时间返回当前的任务记录执行详情
   */
  async querySofamqConnectorrecordEx(request: QuerySofamqConnectorrecordRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqConnectorrecordResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqConnectorrecordResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connectorrecord.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqConnectorrecordResponse({}));
  }

  /**
   * Description: 加载数据源对应的结构信息
   * Summary: 加载数据源对应的结构信息
   */
  async loadSofamqConnectorsource(request: LoadSofamqConnectorsourceRequest): Promise<LoadSofamqConnectorsourceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.loadSofamqConnectorsourceEx(request, headers, runtime);
  }

  /**
   * Description: 加载数据源对应的结构信息
   * Summary: 加载数据源对应的结构信息
   */
  async loadSofamqConnectorsourceEx(request: LoadSofamqConnectorsourceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<LoadSofamqConnectorsourceResponse> {
    Util.validateModel(request);
    return $tea.cast<LoadSofamqConnectorsourceResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connectorsource.load", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new LoadSofamqConnectorsourceResponse({}));
  }

  /**
   * Description: 查询队列详情信息以及分页信息
   * Summary: 查询队列详情
   */
  async queryMeshQueue(request: QueryMeshQueueRequest): Promise<QueryMeshQueueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMeshQueueEx(request, headers, runtime);
  }

  /**
   * Description: 查询队列详情信息以及分页信息
   * Summary: 查询队列详情
   */
  async queryMeshQueueEx(request: QueryMeshQueueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMeshQueueResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMeshQueueResponse>(await this.doRequest("2.0", "sofa.mq.mesh.queue.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMeshQueueResponse({}));
  }

  /**
   * Description: 新增队列
   * Summary: 新增队列
   */
  async importMeshQueue(request: ImportMeshQueueRequest): Promise<ImportMeshQueueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importMeshQueueEx(request, headers, runtime);
  }

  /**
   * Description: 新增队列
   * Summary: 新增队列
   */
  async importMeshQueueEx(request: ImportMeshQueueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportMeshQueueResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportMeshQueueResponse>(await this.doRequest("2.0", "sofa.mq.mesh.queue.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportMeshQueueResponse({}));
  }

  /**
   * Description: 删除队列
   * Summary: 删除队列
   */
  async deleteMeshQueue(request: DeleteMeshQueueRequest): Promise<DeleteMeshQueueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteMeshQueueEx(request, headers, runtime);
  }

  /**
   * Description: 删除队列
   * Summary: 删除队列
   */
  async deleteMeshQueueEx(request: DeleteMeshQueueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteMeshQueueResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteMeshQueueResponse>(await this.doRequest("2.0", "sofa.mq.mesh.queue.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteMeshQueueResponse({}));
  }

  /**
   * Description: 更新队列
   * Summary: 更新队列
   */
  async updateMeshQueue(request: UpdateMeshQueueRequest): Promise<UpdateMeshQueueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateMeshQueueEx(request, headers, runtime);
  }

  /**
   * Description: 更新队列
   * Summary: 更新队列
   */
  async updateMeshQueueEx(request: UpdateMeshQueueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateMeshQueueResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateMeshQueueResponse>(await this.doRequest("2.0", "sofa.mq.mesh.queue.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateMeshQueueResponse({}));
  }

  /**
   * Description: 查询限流规则
   * Summary: 查询限流规则
   */
  async queryMeshQueuelimitrules(request: QueryMeshQueuelimitrulesRequest): Promise<QueryMeshQueuelimitrulesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMeshQueuelimitrulesEx(request, headers, runtime);
  }

  /**
   * Description: 查询限流规则
   * Summary: 查询限流规则
   */
  async queryMeshQueuelimitrulesEx(request: QueryMeshQueuelimitrulesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMeshQueuelimitrulesResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMeshQueuelimitrulesResponse>(await this.doRequest("2.0", "sofa.mq.mesh.queuelimitrules.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMeshQueuelimitrulesResponse({}));
  }

  /**
   * Description: 修改一个连接器任务
   * Summary: 修改一个连接器任务
   */
  async updateSofamqConnector(request: UpdateSofamqConnectorRequest): Promise<UpdateSofamqConnectorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSofamqConnectorEx(request, headers, runtime);
  }

  /**
   * Description: 修改一个连接器任务
   * Summary: 修改一个连接器任务
   */
  async updateSofamqConnectorEx(request: UpdateSofamqConnectorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSofamqConnectorResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSofamqConnectorResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connector.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSofamqConnectorResponse({}));
  }

  /**
   * Description: 查询限流规则域值
   * Summary: 查询限流规则域值
   */
  async queryMeshQueuelimitvalue(request: QueryMeshQueuelimitvalueRequest): Promise<QueryMeshQueuelimitvalueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMeshQueuelimitvalueEx(request, headers, runtime);
  }

  /**
   * Description: 查询限流规则域值
   * Summary: 查询限流规则域值
   */
  async queryMeshQueuelimitvalueEx(request: QueryMeshQueuelimitvalueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMeshQueuelimitvalueResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMeshQueuelimitvalueResponse>(await this.doRequest("2.0", "sofa.mq.mesh.queuelimitvalue.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMeshQueuelimitvalueResponse({}));
  }

  /**
   * Description: 更新限流规则
   * Summary: 更新限流规则
   */
  async updateMeshQueuelimit(request: UpdateMeshQueuelimitRequest): Promise<UpdateMeshQueuelimitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateMeshQueuelimitEx(request, headers, runtime);
  }

  /**
   * Description: 更新限流规则
   * Summary: 更新限流规则
   */
  async updateMeshQueuelimitEx(request: UpdateMeshQueuelimitRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateMeshQueuelimitResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateMeshQueuelimitResponse>(await this.doRequest("2.0", "sofa.mq.mesh.queuelimit.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateMeshQueuelimitResponse({}));
  }

  /**
   * Description: 添加限流规则
   * Summary: 添加限流规则
   */
  async importMeshQueuelimit(request: ImportMeshQueuelimitRequest): Promise<ImportMeshQueuelimitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importMeshQueuelimitEx(request, headers, runtime);
  }

  /**
   * Description: 添加限流规则
   * Summary: 添加限流规则
   */
  async importMeshQueuelimitEx(request: ImportMeshQueuelimitRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportMeshQueuelimitResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportMeshQueuelimitResponse>(await this.doRequest("2.0", "sofa.mq.mesh.queuelimit.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportMeshQueuelimitResponse({}));
  }

  /**
   * Description: 删除限流规则
   * Summary: 删除限流规则
   */
  async deleteMeshQueuelimit(request: DeleteMeshQueuelimitRequest): Promise<DeleteMeshQueuelimitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteMeshQueuelimitEx(request, headers, runtime);
  }

  /**
   * Description: 删除限流规则
   * Summary: 删除限流规则
   */
  async deleteMeshQueuelimitEx(request: DeleteMeshQueuelimitRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteMeshQueuelimitResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteMeshQueuelimitResponse>(await this.doRequest("2.0", "sofa.mq.mesh.queuelimit.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteMeshQueuelimitResponse({}));
  }

  /**
   * Description: 删除限流域值
   * Summary: 删除规则的限流域值
   */
  async deleteMeshQueuelimitvalue(request: DeleteMeshQueuelimitvalueRequest): Promise<DeleteMeshQueuelimitvalueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteMeshQueuelimitvalueEx(request, headers, runtime);
  }

  /**
   * Description: 删除限流域值
   * Summary: 删除规则的限流域值
   */
  async deleteMeshQueuelimitvalueEx(request: DeleteMeshQueuelimitvalueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteMeshQueuelimitvalueResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteMeshQueuelimitvalueResponse>(await this.doRequest("2.0", "sofa.mq.mesh.queuelimitvalue.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteMeshQueuelimitvalueResponse({}));
  }

  /**
   * Description: 查询路由规则
   * Summary: 查询路由规则
   */
  async queryMeshQueuerouterules(request: QueryMeshQueuerouterulesRequest): Promise<QueryMeshQueuerouterulesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMeshQueuerouterulesEx(request, headers, runtime);
  }

  /**
   * Description: 查询路由规则
   * Summary: 查询路由规则
   */
  async queryMeshQueuerouterulesEx(request: QueryMeshQueuerouterulesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMeshQueuerouterulesResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMeshQueuerouterulesResponse>(await this.doRequest("2.0", "sofa.mq.mesh.queuerouterules.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMeshQueuerouterulesResponse({}));
  }

  /**
   * Description: 查询路由版本
   * Summary: 查询路由版本
   */
  async queryMeshQueuerouteedition(request: QueryMeshQueuerouteeditionRequest): Promise<QueryMeshQueuerouteeditionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMeshQueuerouteeditionEx(request, headers, runtime);
  }

  /**
   * Description: 查询路由版本
   * Summary: 查询路由版本
   */
  async queryMeshQueuerouteeditionEx(request: QueryMeshQueuerouteeditionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMeshQueuerouteeditionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMeshQueuerouteeditionResponse>(await this.doRequest("2.0", "sofa.mq.mesh.queuerouteedition.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMeshQueuerouteeditionResponse({}));
  }

  /**
   * Description: 添加路由规则
   * Summary: 添加路由规则
   */
  async importMeshQueueroute(request: ImportMeshQueuerouteRequest): Promise<ImportMeshQueuerouteResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importMeshQueuerouteEx(request, headers, runtime);
  }

  /**
   * Description: 添加路由规则
   * Summary: 添加路由规则
   */
  async importMeshQueuerouteEx(request: ImportMeshQueuerouteRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportMeshQueuerouteResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportMeshQueuerouteResponse>(await this.doRequest("2.0", "sofa.mq.mesh.queueroute.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportMeshQueuerouteResponse({}));
  }

  /**
   * Description: 更新路由规则
   * Summary: 更新路由规则
   */
  async updateMeshQueueroute(request: UpdateMeshQueuerouteRequest): Promise<UpdateMeshQueuerouteResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateMeshQueuerouteEx(request, headers, runtime);
  }

  /**
   * Description: 更新路由规则
   * Summary: 更新路由规则
   */
  async updateMeshQueuerouteEx(request: UpdateMeshQueuerouteRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateMeshQueuerouteResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateMeshQueuerouteResponse>(await this.doRequest("2.0", "sofa.mq.mesh.queueroute.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateMeshQueuerouteResponse({}));
  }

  /**
   * Description: 删除限流规则
   * Summary: 删除限流规则
   */
  async deleteMeshQueueroute(request: DeleteMeshQueuerouteRequest): Promise<DeleteMeshQueuerouteResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteMeshQueuerouteEx(request, headers, runtime);
  }

  /**
   * Description: 删除限流规则
   * Summary: 删除限流规则
   */
  async deleteMeshQueuerouteEx(request: DeleteMeshQueuerouteRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteMeshQueuerouteResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteMeshQueuerouteResponse>(await this.doRequest("2.0", "sofa.mq.mesh.queueroute.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteMeshQueuerouteResponse({}));
  }

  /**
   * Description: 删除路由版本
   * Summary: 删除路由版本
   */
  async deleteMeshQueuerouteedition(request: DeleteMeshQueuerouteeditionRequest): Promise<DeleteMeshQueuerouteeditionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteMeshQueuerouteeditionEx(request, headers, runtime);
  }

  /**
   * Description: 删除路由版本
   * Summary: 删除路由版本
   */
  async deleteMeshQueuerouteeditionEx(request: DeleteMeshQueuerouteeditionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteMeshQueuerouteeditionResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteMeshQueuerouteeditionResponse>(await this.doRequest("2.0", "sofa.mq.mesh.queuerouteedition.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteMeshQueuerouteeditionResponse({}));
  }

  /**
   * Description: 查询路由规则应用
   * Summary: 查询路由规则应用
   */
  async queryMeshQueuerouteapp(request: QueryMeshQueuerouteappRequest): Promise<QueryMeshQueuerouteappResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMeshQueuerouteappEx(request, headers, runtime);
  }

  /**
   * Description: 查询路由规则应用
   * Summary: 查询路由规则应用
   */
  async queryMeshQueuerouteappEx(request: QueryMeshQueuerouteappRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMeshQueuerouteappResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMeshQueuerouteappResponse>(await this.doRequest("2.0", "sofa.mq.mesh.queuerouteapp.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMeshQueuerouteappResponse({}));
  }

  /**
   * Description: 根据队列id查询队列详情
   * Summary: 根据队列id查询队列详情
   */
  async queryMeshQueuebyid(request: QueryMeshQueuebyidRequest): Promise<QueryMeshQueuebyidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMeshQueuebyidEx(request, headers, runtime);
  }

  /**
   * Description: 根据队列id查询队列详情
   * Summary: 根据队列id查询队列详情
   */
  async queryMeshQueuebyidEx(request: QueryMeshQueuebyidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMeshQueuebyidResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMeshQueuebyidResponse>(await this.doRequest("2.0", "sofa.mq.mesh.queuebyid.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMeshQueuebyidResponse({}));
  }

  /**
   * Description: zhaolei
   * Summary: 更新限流状态
   */
  async updateMeshQueuelimitstatus(request: UpdateMeshQueuelimitstatusRequest): Promise<UpdateMeshQueuelimitstatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateMeshQueuelimitstatusEx(request, headers, runtime);
  }

  /**
   * Description: zhaolei
   * Summary: 更新限流状态
   */
  async updateMeshQueuelimitstatusEx(request: UpdateMeshQueuelimitstatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateMeshQueuelimitstatusResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateMeshQueuelimitstatusResponse>(await this.doRequest("2.0", "sofa.mq.mesh.queuelimitstatus.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateMeshQueuelimitstatusResponse({}));
  }

  /**
   * Description: 更新路由规则状态
   * Summary: 更新路由规则状态
   */
  async updateMeshQueueroutestatus(request: UpdateMeshQueueroutestatusRequest): Promise<UpdateMeshQueueroutestatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateMeshQueueroutestatusEx(request, headers, runtime);
  }

  /**
   * Description: 更新路由规则状态
   * Summary: 更新路由规则状态
   */
  async updateMeshQueueroutestatusEx(request: UpdateMeshQueueroutestatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateMeshQueueroutestatusResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateMeshQueueroutestatusResponse>(await this.doRequest("2.0", "sofa.mq.mesh.queueroutestatus.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateMeshQueueroutestatusResponse({}));
  }

  /**
   * Description: 管理员更新topic
   * Summary: 管理员更新topic
   */
  async updateSofamqAdmintopic(request: UpdateSofamqAdmintopicRequest): Promise<UpdateSofamqAdmintopicResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSofamqAdmintopicEx(request, headers, runtime);
  }

  /**
   * Description: 管理员更新topic
   * Summary: 管理员更新topic
   */
  async updateSofamqAdmintopicEx(request: UpdateSofamqAdmintopicRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSofamqAdmintopicResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSofamqAdmintopicResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.admintopic.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSofamqAdmintopicResponse({}));
  }

  /**
   * Description: 管理员更新group
   * Summary: 管理员更新group
   */
  async updateSofamqAdmingroup(request: UpdateSofamqAdmingroupRequest): Promise<UpdateSofamqAdmingroupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSofamqAdmingroupEx(request, headers, runtime);
  }

  /**
   * Description: 管理员更新group
   * Summary: 管理员更新group
   */
  async updateSofamqAdmingroupEx(request: UpdateSofamqAdmingroupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSofamqAdmingroupResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSofamqAdmingroupResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.admingroup.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSofamqAdmingroupResponse({}));
  }

  /**
   * Description: 手动触发一次任务的执行
   * Summary: 手动触发一次任务的执行
   */
  async runSofamqConnectorjob(request: RunSofamqConnectorjobRequest): Promise<RunSofamqConnectorjobResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.runSofamqConnectorjobEx(request, headers, runtime);
  }

  /**
   * Description: 手动触发一次任务的执行
   * Summary: 手动触发一次任务的执行
   */
  async runSofamqConnectorjobEx(request: RunSofamqConnectorjobRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RunSofamqConnectorjobResponse> {
    Util.validateModel(request);
    return $tea.cast<RunSofamqConnectorjobResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connectorjob.run", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RunSofamqConnectorjobResponse({}));
  }

  /**
   * Description: 暂停一个Connector任务
   * Summary: 暂停一个任务
   */
  async pauseSofamqConnectorjob(request: PauseSofamqConnectorjobRequest): Promise<PauseSofamqConnectorjobResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pauseSofamqConnectorjobEx(request, headers, runtime);
  }

  /**
   * Description: 暂停一个Connector任务
   * Summary: 暂停一个任务
   */
  async pauseSofamqConnectorjobEx(request: PauseSofamqConnectorjobRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PauseSofamqConnectorjobResponse> {
    Util.validateModel(request);
    return $tea.cast<PauseSofamqConnectorjobResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connectorjob.pause", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PauseSofamqConnectorjobResponse({}));
  }

  /**
   * Description: 恢复一个暂停的任务
   * Summary: 恢复一个暂停的任务
   */
  async resumeSofamqConnectorjob(request: ResumeSofamqConnectorjobRequest): Promise<ResumeSofamqConnectorjobResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.resumeSofamqConnectorjobEx(request, headers, runtime);
  }

  /**
   * Description: 恢复一个暂停的任务
   * Summary: 恢复一个暂停的任务
   */
  async resumeSofamqConnectorjobEx(request: ResumeSofamqConnectorjobRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ResumeSofamqConnectorjobResponse> {
    Util.validateModel(request);
    return $tea.cast<ResumeSofamqConnectorjobResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connectorjob.resume", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ResumeSofamqConnectorjobResponse({}));
  }

  /**
   * Description: 确认覆盖路有规则状态
   * Summary: 确认覆盖路由规则状态
   */
  async updateMeshQueueroutestatusconfirm(request: UpdateMeshQueueroutestatusconfirmRequest): Promise<UpdateMeshQueueroutestatusconfirmResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateMeshQueueroutestatusconfirmEx(request, headers, runtime);
  }

  /**
   * Description: 确认覆盖路有规则状态
   * Summary: 确认覆盖路由规则状态
   */
  async updateMeshQueueroutestatusconfirmEx(request: UpdateMeshQueueroutestatusconfirmRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateMeshQueueroutestatusconfirmResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateMeshQueueroutestatusconfirmResponse>(await this.doRequest("2.0", "sofa.mq.mesh.queueroutestatusconfirm.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateMeshQueueroutestatusconfirmResponse({}));
  }

  /**
   * Description: 更细限流状态
   * Summary: 更新限流状态
   */
  async updateMeshQueuelimitstatusconfirm(request: UpdateMeshQueuelimitstatusconfirmRequest): Promise<UpdateMeshQueuelimitstatusconfirmResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateMeshQueuelimitstatusconfirmEx(request, headers, runtime);
  }

  /**
   * Description: 更细限流状态
   * Summary: 更新限流状态
   */
  async updateMeshQueuelimitstatusconfirmEx(request: UpdateMeshQueuelimitstatusconfirmRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateMeshQueuelimitstatusconfirmResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateMeshQueuelimitstatusconfirmResponse>(await this.doRequest("2.0", "sofa.mq.mesh.queuelimitstatusconfirm.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateMeshQueuelimitstatusconfirmResponse({}));
  }

  /**
   * Description: 日切检查，验证是否可以完成日切
   * Summary: 日切检查
   */
  async execSofamqDailycheck(request: ExecSofamqDailycheckRequest): Promise<ExecSofamqDailycheckResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execSofamqDailycheckEx(request, headers, runtime);
  }

  /**
   * Description: 日切检查，验证是否可以完成日切
   * Summary: 日切检查
   */
  async execSofamqDailycheckEx(request: ExecSofamqDailycheckRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecSofamqDailycheckResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecSofamqDailycheckResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.dailycheck.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecSofamqDailycheckResponse({}));
  }

  /**
   * Description: 查询应用详情
   * Summary: 查询应用详情
   */
  async queryMeshApplication(request: QueryMeshApplicationRequest): Promise<QueryMeshApplicationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMeshApplicationEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用详情
   * Summary: 查询应用详情
   */
  async queryMeshApplicationEx(request: QueryMeshApplicationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMeshApplicationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMeshApplicationResponse>(await this.doRequest("2.0", "sofa.mq.mesh.application.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMeshApplicationResponse({}));
  }

  /**
   * Description: 新增应用
   * Summary: 新增应用
   */
  async importMeshApplication(request: ImportMeshApplicationRequest): Promise<ImportMeshApplicationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importMeshApplicationEx(request, headers, runtime);
  }

  /**
   * Description: 新增应用
   * Summary: 新增应用
   */
  async importMeshApplicationEx(request: ImportMeshApplicationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportMeshApplicationResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportMeshApplicationResponse>(await this.doRequest("2.0", "sofa.mq.mesh.application.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportMeshApplicationResponse({}));
  }

  /**
   * Description: 更新应用
   * Summary: 更新应用
   */
  async updateMeshApplication(request: UpdateMeshApplicationRequest): Promise<UpdateMeshApplicationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateMeshApplicationEx(request, headers, runtime);
  }

  /**
   * Description: 更新应用
   * Summary: 更新应用
   */
  async updateMeshApplicationEx(request: UpdateMeshApplicationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateMeshApplicationResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateMeshApplicationResponse>(await this.doRequest("2.0", "sofa.mq.mesh.application.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateMeshApplicationResponse({}));
  }

  /**
   * Description: 删除应用
   * Summary: 删除应用
   */
  async deleteMeshApplication(request: DeleteMeshApplicationRequest): Promise<DeleteMeshApplicationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteMeshApplicationEx(request, headers, runtime);
  }

  /**
   * Description: 删除应用
   * Summary: 删除应用
   */
  async deleteMeshApplicationEx(request: DeleteMeshApplicationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteMeshApplicationResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteMeshApplicationResponse>(await this.doRequest("2.0", "sofa.mq.mesh.application.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteMeshApplicationResponse({}));
  }

  /**
   * Description: 查询应用服务id
   * Summary: 查询应用服务id
   */
  async queryMeshApplicationservice(request: QueryMeshApplicationserviceRequest): Promise<QueryMeshApplicationserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMeshApplicationserviceEx(request, headers, runtime);
  }

  /**
   * Description: 查询应用服务id
   * Summary: 查询应用服务id
   */
  async queryMeshApplicationserviceEx(request: QueryMeshApplicationserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMeshApplicationserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMeshApplicationserviceResponse>(await this.doRequest("2.0", "sofa.mq.mesh.applicationservice.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMeshApplicationserviceResponse({}));
  }

  /**
   * Description: 根据应用名查应用详情
   * Summary: 根据应用名查应用详情
   */
  async queryMeshApplicationbyname(request: QueryMeshApplicationbynameRequest): Promise<QueryMeshApplicationbynameResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMeshApplicationbynameEx(request, headers, runtime);
  }

  /**
   * Description: 根据应用名查应用详情
   * Summary: 根据应用名查应用详情
   */
  async queryMeshApplicationbynameEx(request: QueryMeshApplicationbynameRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMeshApplicationbynameResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMeshApplicationbynameResponse>(await this.doRequest("2.0", "sofa.mq.mesh.applicationbyname.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMeshApplicationbynameResponse({}));
  }

  /**
   * Description: 查询队列的应用列表
   * Summary: 查询队列的应用列表
   */
  async queryMeshApplicationlist(request: QueryMeshApplicationlistRequest): Promise<QueryMeshApplicationlistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMeshApplicationlistEx(request, headers, runtime);
  }

  /**
   * Description: 查询队列的应用列表
   * Summary: 查询队列的应用列表
   */
  async queryMeshApplicationlistEx(request: QueryMeshApplicationlistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMeshApplicationlistResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMeshApplicationlistResponse>(await this.doRequest("2.0", "sofa.mq.mesh.applicationlist.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMeshApplicationlistResponse({}));
  }

  /**
   * Description: 应用队列下拉框
   * Summary: 应用队列下拉框
   */
  async queryMeshApplicationqueuenames(request: QueryMeshApplicationqueuenamesRequest): Promise<QueryMeshApplicationqueuenamesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMeshApplicationqueuenamesEx(request, headers, runtime);
  }

  /**
   * Description: 应用队列下拉框
   * Summary: 应用队列下拉框
   */
  async queryMeshApplicationqueuenamesEx(request: QueryMeshApplicationqueuenamesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMeshApplicationqueuenamesResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMeshApplicationqueuenamesResponse>(await this.doRequest("2.0", "sofa.mq.mesh.applicationqueuenames.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMeshApplicationqueuenamesResponse({}));
  }

  /**
   * Description: 暂停一个Connector执行计划
   * Summary: 暂停一个Connector执行计划
   */
  async pauseSofamqConnectorplan(request: PauseSofamqConnectorplanRequest): Promise<PauseSofamqConnectorplanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pauseSofamqConnectorplanEx(request, headers, runtime);
  }

  /**
   * Description: 暂停一个Connector执行计划
   * Summary: 暂停一个Connector执行计划
   */
  async pauseSofamqConnectorplanEx(request: PauseSofamqConnectorplanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PauseSofamqConnectorplanResponse> {
    Util.validateModel(request);
    return $tea.cast<PauseSofamqConnectorplanResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connectorplan.pause", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PauseSofamqConnectorplanResponse({}));
  }

  /**
   * Description: 恢复一个connector执行计划
   * Summary: 恢复一个connector执行计划
   */
  async resumeSofamqConnectorplan(request: ResumeSofamqConnectorplanRequest): Promise<ResumeSofamqConnectorplanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.resumeSofamqConnectorplanEx(request, headers, runtime);
  }

  /**
   * Description: 恢复一个connector执行计划
   * Summary: 恢复一个connector执行计划
   */
  async resumeSofamqConnectorplanEx(request: ResumeSofamqConnectorplanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ResumeSofamqConnectorplanResponse> {
    Util.validateModel(request);
    return $tea.cast<ResumeSofamqConnectorplanResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connectorplan.resume", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ResumeSofamqConnectorplanResponse({}));
  }

  /**
   * Description: 重启一个已有的connector任务计划，会删除当前的执行计划和执行进度
   * Summary: 重启一个已有的connector任务计划
   */
  async retrySofamqConnectorplan(request: RetrySofamqConnectorplanRequest): Promise<RetrySofamqConnectorplanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.retrySofamqConnectorplanEx(request, headers, runtime);
  }

  /**
   * Description: 重启一个已有的connector任务计划，会删除当前的执行计划和执行进度
   * Summary: 重启一个已有的connector任务计划
   */
  async retrySofamqConnectorplanEx(request: RetrySofamqConnectorplanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RetrySofamqConnectorplanResponse> {
    Util.validateModel(request);
    return $tea.cast<RetrySofamqConnectorplanResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connectorplan.retry", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RetrySofamqConnectorplanResponse({}));
  }

  /**
   * Description: 根据来源类型或去向类型，查询某个任务的所有配置，包括是否可以修改等
   * Summary: 查询任务不同来源去向的配置
   */
  async querySofamqConnectorconfigs(request: QuerySofamqConnectorconfigsRequest): Promise<QuerySofamqConnectorconfigsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqConnectorconfigsEx(request, headers, runtime);
  }

  /**
   * Description: 根据来源类型或去向类型，查询某个任务的所有配置，包括是否可以修改等
   * Summary: 查询任务不同来源去向的配置
   */
  async querySofamqConnectorconfigsEx(request: QuerySofamqConnectorconfigsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqConnectorconfigsResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqConnectorconfigsResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connectorconfigs.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqConnectorconfigsResponse({}));
  }

  /**
   * Description: 创建消费限流规则
   * Summary: 创建消费限流规则
   */
  async createSofamqConsumelimiter(request: CreateSofamqConsumelimiterRequest): Promise<CreateSofamqConsumelimiterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSofamqConsumelimiterEx(request, headers, runtime);
  }

  /**
   * Description: 创建消费限流规则
   * Summary: 创建消费限流规则
   */
  async createSofamqConsumelimiterEx(request: CreateSofamqConsumelimiterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSofamqConsumelimiterResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSofamqConsumelimiterResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.consumelimiter.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSofamqConsumelimiterResponse({}));
  }

  /**
   * Description: 更新限流规则
   * Summary: 更新限流规则
   */
  async updateSofamqConsumelimiter(request: UpdateSofamqConsumelimiterRequest): Promise<UpdateSofamqConsumelimiterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSofamqConsumelimiterEx(request, headers, runtime);
  }

  /**
   * Description: 更新限流规则
   * Summary: 更新限流规则
   */
  async updateSofamqConsumelimiterEx(request: UpdateSofamqConsumelimiterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSofamqConsumelimiterResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSofamqConsumelimiterResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.consumelimiter.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSofamqConsumelimiterResponse({}));
  }

  /**
   * Description: 删除限流规则
   * Summary: 删除限流规则
   */
  async deleteSofamqConsumelimiter(request: DeleteSofamqConsumelimiterRequest): Promise<DeleteSofamqConsumelimiterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSofamqConsumelimiterEx(request, headers, runtime);
  }

  /**
   * Description: 删除限流规则
   * Summary: 删除限流规则
   */
  async deleteSofamqConsumelimiterEx(request: DeleteSofamqConsumelimiterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSofamqConsumelimiterResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSofamqConsumelimiterResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.consumelimiter.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSofamqConsumelimiterResponse({}));
  }

  /**
   * Description: 获取限流规则
   * Summary: 限流规则获取
   */
  async querySofamqConsumelimiter(request: QuerySofamqConsumelimiterRequest): Promise<QuerySofamqConsumelimiterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqConsumelimiterEx(request, headers, runtime);
  }

  /**
   * Description: 获取限流规则
   * Summary: 限流规则获取
   */
  async querySofamqConsumelimiterEx(request: QuerySofamqConsumelimiterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqConsumelimiterResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqConsumelimiterResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.consumelimiter.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqConsumelimiterResponse({}));
  }

  /**
   * Description: dd
   * Summary: dd
   */
  async getDmsInstance(request: GetDmsInstanceRequest): Promise<GetDmsInstanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDmsInstanceEx(request, headers, runtime);
  }

  /**
   * Description: dd
   * Summary: dd
   */
  async getDmsInstanceEx(request: GetDmsInstanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDmsInstanceResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDmsInstanceResponse>(await this.doRequest("2.0", "sofa.mq.dms.instance.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDmsInstanceResponse({}));
  }

  /**
   * Description: 查询标签
   * Summary: 查询标签
   */
  async querySofamqLabels(request: QuerySofamqLabelsRequest): Promise<QuerySofamqLabelsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqLabelsEx(request, headers, runtime);
  }

  /**
   * Description: 查询标签
   * Summary: 查询标签
   */
  async querySofamqLabelsEx(request: QuerySofamqLabelsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqLabelsResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqLabelsResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.labels.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqLabelsResponse({}));
  }

  /**
   * Description: SofaMQ 创建资源标签
   * Summary: 创建资源标签
   */
  async createSofamqLabels(request: CreateSofamqLabelsRequest): Promise<CreateSofamqLabelsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSofamqLabelsEx(request, headers, runtime);
  }

  /**
   * Description: SofaMQ 创建资源标签
   * Summary: 创建资源标签
   */
  async createSofamqLabelsEx(request: CreateSofamqLabelsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSofamqLabelsResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSofamqLabelsResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.labels.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSofamqLabelsResponse({}));
  }

  /**
   * Description: 删除资源标签
   * Summary: 删除资源标签
   */
  async deleteSofamqLabels(request: DeleteSofamqLabelsRequest): Promise<DeleteSofamqLabelsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSofamqLabelsEx(request, headers, runtime);
  }

  /**
   * Description: 删除资源标签
   * Summary: 删除资源标签
   */
  async deleteSofamqLabelsEx(request: DeleteSofamqLabelsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSofamqLabelsResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSofamqLabelsResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.labels.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSofamqLabelsResponse({}));
  }

  /**
   * Description: 获取特定Topic的Schema列表
   * Summary: 获取Topic的Schema列表
   */
  async listSofamqSchema(request: ListSofamqSchemaRequest): Promise<ListSofamqSchemaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSofamqSchemaEx(request, headers, runtime);
  }

  /**
   * Description: 获取特定Topic的Schema列表
   * Summary: 获取Topic的Schema列表
   */
  async listSofamqSchemaEx(request: ListSofamqSchemaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSofamqSchemaResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSofamqSchemaResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.schema.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSofamqSchemaResponse({}));
  }

  /**
   * Description: 创建Topic的Schema
   * Summary: 创建Schema
   */
  async createSofamqSchema(request: CreateSofamqSchemaRequest): Promise<CreateSofamqSchemaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createSofamqSchemaEx(request, headers, runtime);
  }

  /**
   * Description: 创建Topic的Schema
   * Summary: 创建Schema
   */
  async createSofamqSchemaEx(request: CreateSofamqSchemaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateSofamqSchemaResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateSofamqSchemaResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.schema.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateSofamqSchemaResponse({}));
  }

  /**
   * Description: 获取特定Topic特定版本的Schema
   * Summary: 获取Schema详情
   */
  async getSofamqSchema(request: GetSofamqSchemaRequest): Promise<GetSofamqSchemaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getSofamqSchemaEx(request, headers, runtime);
  }

  /**
   * Description: 获取特定Topic特定版本的Schema
   * Summary: 获取Schema详情
   */
  async getSofamqSchemaEx(request: GetSofamqSchemaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetSofamqSchemaResponse> {
    Util.validateModel(request);
    return $tea.cast<GetSofamqSchemaResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.schema.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetSofamqSchemaResponse({}));
  }

  /**
   * Description: 根据Schema生成对应的POJO代码
   * Summary: 获取schema对应的代码
   */
  async exportSofamqSchema(request: ExportSofamqSchemaRequest): Promise<ExportSofamqSchemaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.exportSofamqSchemaEx(request, headers, runtime);
  }

  /**
   * Description: 根据Schema生成对应的POJO代码
   * Summary: 获取schema对应的代码
   */
  async exportSofamqSchemaEx(request: ExportSofamqSchemaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExportSofamqSchemaResponse> {
    Util.validateModel(request);
    return $tea.cast<ExportSofamqSchemaResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.schema.export", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExportSofamqSchemaResponse({}));
  }

  /**
   * Description: 更新schema信息（schema仅允许更新部分信息，比如描述信息；schema的内容是不能修改的）
   * Summary: 更新schema
   */
  async updateSofamqSchema(request: UpdateSofamqSchemaRequest): Promise<UpdateSofamqSchemaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateSofamqSchemaEx(request, headers, runtime);
  }

  /**
   * Description: 更新schema信息（schema仅允许更新部分信息，比如描述信息；schema的内容是不能修改的）
   * Summary: 更新schema
   */
  async updateSofamqSchemaEx(request: UpdateSofamqSchemaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateSofamqSchemaResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateSofamqSchemaResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.schema.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateSofamqSchemaResponse({}));
  }

  /**
   * Description: 获取Schema的版本号列表，结果按版本号大小降序排列
   * Summary: 获取Schema的版本号列表
   */
  async allSofamqSchema(request: AllSofamqSchemaRequest): Promise<AllSofamqSchemaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allSofamqSchemaEx(request, headers, runtime);
  }

  /**
   * Description: 获取Schema的版本号列表，结果按版本号大小降序排列
   * Summary: 获取Schema的版本号列表
   */
  async allSofamqSchemaEx(request: AllSofamqSchemaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllSofamqSchemaResponse> {
    Util.validateModel(request);
    return $tea.cast<AllSofamqSchemaResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.schema.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllSofamqSchemaResponse({}));
  }

  /**
   * Description: 根据Schema解析消息体，查看消息体的详细数据
   * Summary: 查看消息内容
   */
  async exportSofamqMessage(request: ExportSofamqMessageRequest): Promise<ExportSofamqMessageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.exportSofamqMessageEx(request, headers, runtime);
  }

  /**
   * Description: 根据Schema解析消息体，查看消息体的详细数据
   * Summary: 查看消息内容
   */
  async exportSofamqMessageEx(request: ExportSofamqMessageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExportSofamqMessageResponse> {
    Util.validateModel(request);
    return $tea.cast<ExportSofamqMessageResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.message.export", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExportSofamqMessageResponse({}));
  }

  /**
   * Description: 获取系统支持的兼容性策略
   * Summary: 获取系统支持的兼容性策略
   */
  async listSofamqSchemacompatibility(request: ListSofamqSchemacompatibilityRequest): Promise<ListSofamqSchemacompatibilityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSofamqSchemacompatibilityEx(request, headers, runtime);
  }

  /**
   * Description: 获取系统支持的兼容性策略
   * Summary: 获取系统支持的兼容性策略
   */
  async listSofamqSchemacompatibilityEx(request: ListSofamqSchemacompatibilityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSofamqSchemacompatibilityResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSofamqSchemacompatibilityResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.schemacompatibility.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSofamqSchemacompatibilityResponse({}));
  }

  /**
   * Description: 获取系统支持的序列化方式
   * Summary: 获取系统支持的序列化方式
   */
  async listSofamqSchemaserialization(request: ListSofamqSchemaserializationRequest): Promise<ListSofamqSchemaserializationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSofamqSchemaserializationEx(request, headers, runtime);
  }

  /**
   * Description: 获取系统支持的序列化方式
   * Summary: 获取系统支持的序列化方式
   */
  async listSofamqSchemaserializationEx(request: ListSofamqSchemaserializationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSofamqSchemaserializationResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSofamqSchemaserializationResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.schemaserialization.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSofamqSchemaserializationResponse({}));
  }

  /**
   * Description: 删除特定的Schema
   * Summary: 删除特定的Schema
   */
  async deleteSofamqSchema(request: DeleteSofamqSchemaRequest): Promise<DeleteSofamqSchemaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSofamqSchemaEx(request, headers, runtime);
  }

  /**
   * Description: 删除特定的Schema
   * Summary: 删除特定的Schema
   */
  async deleteSofamqSchemaEx(request: DeleteSofamqSchemaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSofamqSchemaResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSofamqSchemaResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.schema.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSofamqSchemaResponse({}));
  }

  /**
   * Description: Connector工单查询
   * Summary: Connector工单查询
   */
  async querySofamqConnectorprocess(request: QuerySofamqConnectorprocessRequest): Promise<QuerySofamqConnectorprocessResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqConnectorprocessEx(request, headers, runtime);
  }

  /**
   * Description: Connector工单查询
   * Summary: Connector工单查询
   */
  async querySofamqConnectorprocessEx(request: QuerySofamqConnectorprocessRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqConnectorprocessResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqConnectorprocessResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connectorprocess.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqConnectorprocessResponse({}));
  }

  /**
   * Description: Connector任务撤回审批
   * Summary: Connector任务撤回审批
   */
  async cancelSofamqConnectorprocess(request: CancelSofamqConnectorprocessRequest): Promise<CancelSofamqConnectorprocessResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelSofamqConnectorprocessEx(request, headers, runtime);
  }

  /**
   * Description: Connector任务撤回审批
   * Summary: Connector任务撤回审批
   */
  async cancelSofamqConnectorprocessEx(request: CancelSofamqConnectorprocessRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelSofamqConnectorprocessResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelSofamqConnectorprocessResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connectorprocess.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelSofamqConnectorprocessResponse({}));
  }

  /**
   * Description: Connector重新提交工单
   * Summary: Connector重新提交工单
   */
  async resumeSofamqConnectorprocess(request: ResumeSofamqConnectorprocessRequest): Promise<ResumeSofamqConnectorprocessResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.resumeSofamqConnectorprocessEx(request, headers, runtime);
  }

  /**
   * Description: Connector重新提交工单
   * Summary: Connector重新提交工单
   */
  async resumeSofamqConnectorprocessEx(request: ResumeSofamqConnectorprocessRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ResumeSofamqConnectorprocessResponse> {
    Util.validateModel(request);
    return $tea.cast<ResumeSofamqConnectorprocessResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connectorprocess.resume", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ResumeSofamqConnectorprocessResponse({}));
  }

  /**
   * Description: 校验一个connector的操作是否合法
   * Summary: 校验一个connector的操作是否合法
   */
  async verifySofamqConnectoroperation(request: VerifySofamqConnectoroperationRequest): Promise<VerifySofamqConnectoroperationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifySofamqConnectoroperationEx(request, headers, runtime);
  }

  /**
   * Description: 校验一个connector的操作是否合法
   * Summary: 校验一个connector的操作是否合法
   */
  async verifySofamqConnectoroperationEx(request: VerifySofamqConnectoroperationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifySofamqConnectoroperationResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifySofamqConnectoroperationResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connectoroperation.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifySofamqConnectoroperationResponse({}));
  }

  /**
   * Description: 查看操作审计
   * Summary: 查看操作审计
   */
  async listSofamqAuditor(request: ListSofamqAuditorRequest): Promise<ListSofamqAuditorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listSofamqAuditorEx(request, headers, runtime);
  }

  /**
   * Description: 查看操作审计
   * Summary: 查看操作审计
   */
  async listSofamqAuditorEx(request: ListSofamqAuditorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListSofamqAuditorResponse> {
    Util.validateModel(request);
    return $tea.cast<ListSofamqAuditorResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.auditor.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListSofamqAuditorResponse({}));
  }

  /**
   * Description: connector任务对应的应用名称查询
   * Summary: connector任务对应的应用名称查询
   */
  async querySofamqConnectorjobapp(request: QuerySofamqConnectorjobappRequest): Promise<QuerySofamqConnectorjobappResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqConnectorjobappEx(request, headers, runtime);
  }

  /**
   * Description: connector任务对应的应用名称查询
   * Summary: connector任务对应的应用名称查询
   */
  async querySofamqConnectorjobappEx(request: QuerySofamqConnectorjobappRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqConnectorjobappResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqConnectorjobappResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connectorjobapp.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqConnectorjobappResponse({}));
  }

  /**
   * Description: 取消Connector运行实例
   * Summary: 取消Connector运行实例
   */
  async cancelSofamqConnectorplan(request: CancelSofamqConnectorplanRequest): Promise<CancelSofamqConnectorplanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelSofamqConnectorplanEx(request, headers, runtime);
  }

  /**
   * Description: 取消Connector运行实例
   * Summary: 取消Connector运行实例
   */
  async cancelSofamqConnectorplanEx(request: CancelSofamqConnectorplanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelSofamqConnectorplanResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelSofamqConnectorplanResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connectorplan.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelSofamqConnectorplanResponse({}));
  }

  /**
   * Description: 重置任务实例位点
   * Summary: 重置任务实例位点
   */
  async setSofamqConnectorplancheckpoint(request: SetSofamqConnectorplancheckpointRequest): Promise<SetSofamqConnectorplancheckpointResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setSofamqConnectorplancheckpointEx(request, headers, runtime);
  }

  /**
   * Description: 重置任务实例位点
   * Summary: 重置任务实例位点
   */
  async setSofamqConnectorplancheckpointEx(request: SetSofamqConnectorplancheckpointRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetSofamqConnectorplancheckpointResponse> {
    Util.validateModel(request);
    return $tea.cast<SetSofamqConnectorplancheckpointResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connectorplancheckpoint.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetSofamqConnectorplancheckpointResponse({}));
  }

  /**
   * Description: 活跃的conenctor实例【常驻任务】
   * Summary: 活跃的conenctor实例
   */
  async querySofamqConnectorplansingleton(request: QuerySofamqConnectorplansingletonRequest): Promise<QuerySofamqConnectorplansingletonResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqConnectorplansingletonEx(request, headers, runtime);
  }

  /**
   * Description: 活跃的conenctor实例【常驻任务】
   * Summary: 活跃的conenctor实例
   */
  async querySofamqConnectorplansingletonEx(request: QuerySofamqConnectorplansingletonRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqConnectorplansingletonResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqConnectorplansingletonResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connectorplansingleton.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqConnectorplansingletonResponse({}));
  }

  /**
   * Description: 获取延迟时间
   * Summary: 获取延迟时间
   */
  async querySofamqConnectorjobdelay(request: QuerySofamqConnectorjobdelayRequest): Promise<QuerySofamqConnectorjobdelayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqConnectorjobdelayEx(request, headers, runtime);
  }

  /**
   * Description: 获取延迟时间
   * Summary: 获取延迟时间
   */
  async querySofamqConnectorjobdelayEx(request: QuerySofamqConnectorjobdelayRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqConnectorjobdelayResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqConnectorjobdelayResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connectorjobdelay.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqConnectorjobdelayResponse({}));
  }

  /**
   * Description: 常驻任务分区信息详情
   * Summary: 分区状态详情列名
   */
  async querySofamqConnectorjobpartitionstatuscolumn(request: QuerySofamqConnectorjobpartitionstatuscolumnRequest): Promise<QuerySofamqConnectorjobpartitionstatuscolumnResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqConnectorjobpartitionstatuscolumnEx(request, headers, runtime);
  }

  /**
   * Description: 常驻任务分区信息详情
   * Summary: 分区状态详情列名
   */
  async querySofamqConnectorjobpartitionstatuscolumnEx(request: QuerySofamqConnectorjobpartitionstatuscolumnRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqConnectorjobpartitionstatuscolumnResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqConnectorjobpartitionstatuscolumnResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connectorjobpartitionstatuscolumn.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqConnectorjobpartitionstatuscolumnResponse({}));
  }

  /**
   * Description: 分区状态分页查询
   * Summary: 分区状态分页查询
   */
  async querySofamqConnectorjobpartitionstatus(request: QuerySofamqConnectorjobpartitionstatusRequest): Promise<QuerySofamqConnectorjobpartitionstatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqConnectorjobpartitionstatusEx(request, headers, runtime);
  }

  /**
   * Description: 分区状态分页查询
   * Summary: 分区状态分页查询
   */
  async querySofamqConnectorjobpartitionstatusEx(request: QuerySofamqConnectorjobpartitionstatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqConnectorjobpartitionstatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqConnectorjobpartitionstatusResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connectorjobpartitionstatus.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqConnectorjobpartitionstatusResponse({}));
  }

  /**
   * Description: 手动触发UI
   * Summary: 手动触发UI
   */
  async querySofamqConnectortriggerconfigs(request: QuerySofamqConnectortriggerconfigsRequest): Promise<QuerySofamqConnectortriggerconfigsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqConnectortriggerconfigsEx(request, headers, runtime);
  }

  /**
   * Description: 手动触发UI
   * Summary: 手动触发UI
   */
  async querySofamqConnectortriggerconfigsEx(request: QuerySofamqConnectortriggerconfigsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqConnectortriggerconfigsResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqConnectortriggerconfigsResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.connectortriggerconfigs.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqConnectortriggerconfigsResponse({}));
  }

  /**
   * Description: 清除消费进度
   * Summary: 清除消费进度
   */
  async deleteSofamqOffset(request: DeleteSofamqOffsetRequest): Promise<DeleteSofamqOffsetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteSofamqOffsetEx(request, headers, runtime);
  }

  /**
   * Description: 清除消费进度
   * Summary: 清除消费进度
   */
  async deleteSofamqOffsetEx(request: DeleteSofamqOffsetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteSofamqOffsetResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteSofamqOffsetResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.offset.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteSofamqOffsetResponse({}));
  }

  /**
   * Description: 用户端查询消费进度
   * Summary: 用户端查询消费进度
   */
  async querySofamqConsumption(request: QuerySofamqConsumptionRequest): Promise<QuerySofamqConsumptionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySofamqConsumptionEx(request, headers, runtime);
  }

  /**
   * Description: 用户端查询消费进度
   * Summary: 用户端查询消费进度
   */
  async querySofamqConsumptionEx(request: QuerySofamqConsumptionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySofamqConsumptionResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySofamqConsumptionResponse>(await this.doRequest("2.0", "sofa.mq.sofamq.consumption.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySofamqConsumptionResponse({}));
  }

  /**
   * Description: 查询用户端topic的queue信息
   * Summary: 查询用户端topic的queue信息
   */
  async queryUserTopicqueue(request: QueryUserTopicqueueRequest): Promise<QueryUserTopicqueueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryUserTopicqueueEx(request, headers, runtime);
  }

  /**
   * Description: 查询用户端topic的queue信息
   * Summary: 查询用户端topic的queue信息
   */
  async queryUserTopicqueueEx(request: QueryUserTopicqueueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryUserTopicqueueResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryUserTopicqueueResponse>(await this.doRequest("2.0", "sofa.mq.user.topicqueue.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryUserTopicqueueResponse({}));
  }

  /**
   * Description: update next delivery time
   * Summary: update delivery time
   */
  async updateMessageNextdeliverytime(request: UpdateMessageNextdeliverytimeRequest): Promise<UpdateMessageNextdeliverytimeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateMessageNextdeliverytimeEx(request, headers, runtime);
  }

  /**
   * Description: update next delivery time
   * Summary: update delivery time
   */
  async updateMessageNextdeliverytimeEx(request: UpdateMessageNextdeliverytimeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateMessageNextdeliverytimeResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateMessageNextdeliverytimeResponse>(await this.doRequest("2.0", "sofa.mq.message.nextdeliverytime.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateMessageNextdeliverytimeResponse({}));
  }

  /**
   * Description: 统计未投递消息数量
   * Summary: 统计未投递消息数量
   */
  async countMessageUndelivery(request: CountMessageUndeliveryRequest): Promise<CountMessageUndeliveryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.countMessageUndeliveryEx(request, headers, runtime);
  }

  /**
   * Description: 统计未投递消息数量
   * Summary: 统计未投递消息数量
   */
  async countMessageUndeliveryEx(request: CountMessageUndeliveryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CountMessageUndeliveryResponse> {
    Util.validateModel(request);
    return $tea.cast<CountMessageUndeliveryResponse>(await this.doRequest("2.0", "sofa.mq.message.undelivery.count", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CountMessageUndeliveryResponse({}));
  }

  /**
   * Description: 加载任务SLO配置页面
   * Summary: 任务SLO配置
   */
  async loadConnectorjobSloview(request: LoadConnectorjobSloviewRequest): Promise<LoadConnectorjobSloviewResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.loadConnectorjobSloviewEx(request, headers, runtime);
  }

  /**
   * Description: 加载任务SLO配置页面
   * Summary: 任务SLO配置
   */
  async loadConnectorjobSloviewEx(request: LoadConnectorjobSloviewRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<LoadConnectorjobSloviewResponse> {
    Util.validateModel(request);
    return $tea.cast<LoadConnectorjobSloviewResponse>(await this.doRequest("2.0", "sofa.mq.connectorjob.sloview.load", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new LoadConnectorjobSloviewResponse({}));
  }

}
