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

// 链上交易中的事件
export class ChainInsightEvent extends $tea.Model {
  // 事件的 topics 列表
  topics: string[];
  // 解析后的交易 topics 列表
  topicsDecoded?: string[];
  // 事件的内容
  content: string;
  // 解析后的事件内容
  contentDecoded?: string;
  static names(): { [key: string]: string } {
    return {
      topics: 'topics',
      topicsDecoded: 'topics_decoded',
      content: 'content',
      contentDecoded: 'content_decoded',
    };
  }

  static types(): { [key: string]: any } {
    return {
      topics: { 'type': 'array', 'itemType': 'string' },
      topicsDecoded: { 'type': 'array', 'itemType': 'string' },
      content: 'string',
      contentDecoded: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// MapKV
export class MapEntry extends $tea.Model {
  // Key
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

// 数据洞察统计指标Meta元数据
export class ChainInsightStatisticMetricMeta extends $tea.Model {
  // 统计指标的类型；枚举：Table，Histogram
  type: string;
  // 指标的展示名称
  name: string;
  // 指标的实际名称（自定义指标ID）
  metricName: string;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      name: 'name',
      metricName: 'metric_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      name: 'string',
      metricName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据洞察表格行
export class ChainInsightStatisticCustomTableRow extends $tea.Model {
  // 表格的一行
  row: MapEntry[];
  static names(): { [key: string]: string } {
    return {
      row: 'row',
    };
  }

  static types(): { [key: string]: any } {
    return {
      row: { 'type': 'array', 'itemType': MapEntry },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 导出任务检查点信息
export class TriggerCheckpoint extends $tea.Model {
  // 当前处理的高度
  height?: number;
  // 检查点偏移量
  index?: number;
  // 检查点的类型
  type?: string;
  // 最近的错误信息
  lastError?: string;
  // 错误计数
  errorCount?: number;
  // 推送的事件数量
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      height: 'height',
      index: 'index',
      type: 'type',
      lastError: 'last_error',
      errorCount: 'error_count',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      height: 'number',
      index: 'number',
      type: 'string',
      lastError: 'string',
      errorCount: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据洞察搜索结果的Item
export class ChainInsightSearchResultItem extends $tea.Model {
  // 结果类型，枚举：Chain、ChainData、ChainAddress、ChainBlock、ChainTx、ChainTxTimeline
  type: string;
  // 结果所在的链ID
  bizId: string;
  // 结果与搜索请求的相关性程度，(0, 10000000]
  score: number;
  // 搜索结果值
  values: MapEntry[];
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      bizId: 'biz_id',
      score: 'score',
      values: 'values',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      bizId: 'string',
      score: 'number',
      values: { 'type': 'array', 'itemType': MapEntry },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 二维点
export class ChainInsightPoint extends $tea.Model {
  // x坐标，4位定点小数， 10000 表示 1
  x: number;
  // y坐标，4位定点小数， 10000 表示 1
  y: number;
  static names(): { [key: string]: string } {
    return {
      x: 'x',
      y: 'y',
    };
  }

  static types(): { [key: string]: any } {
    return {
      x: 'number',
      y: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 链上交易
export class ChainInsightTransaction extends $tea.Model {
  // 链ID
  bizId: string;
  // 链名称
  bizIdName?: string;
  // 交易ID
  id: string;
  // 交易类型
  type: string;
  // 交易状态，VALID 表示合法，其它为错误码
  state: string;
  // 交易发起者地址
  from: string;
  // 交易目标地址
  to: string;
  // 交易原始输入，hex编码
  input: string;
  // 交易调用的函数名
  function?: string;
  // 交易输入解析后的 json string
  inputDecoded?: string;
  // 交易的返回值
  output?: string;
  // 交易返回值解析后的 json string
  outputDecoded?: string;
  // 交易所在区块高度
  blockNum: number;
  // 交易所在区块中的 index
  txIndex: number;
  // 原始交易的 json string
  data?: string;
  // 交易中的事件
  events?: ChainInsightEvent[];
  static names(): { [key: string]: string } {
    return {
      bizId: 'biz_id',
      bizIdName: 'biz_id_name',
      id: 'id',
      type: 'type',
      state: 'state',
      from: 'from',
      to: 'to',
      input: 'input',
      function: 'function',
      inputDecoded: 'input_decoded',
      output: 'output',
      outputDecoded: 'output_decoded',
      blockNum: 'block_num',
      txIndex: 'tx_index',
      data: 'data',
      events: 'events',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizId: 'string',
      bizIdName: 'string',
      id: 'string',
      type: 'string',
      state: 'string',
      from: 'string',
      to: 'string',
      input: 'string',
      function: 'string',
      inputDecoded: 'string',
      output: 'string',
      outputDecoded: 'string',
      blockNum: 'number',
      txIndex: 'number',
      data: 'string',
      events: { 'type': 'array', 'itemType': ChainInsightEvent },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据洞察搜索请求
export class ChainInsightSearchRequest extends $tea.Model {
  // 插叙偏移量，用于分页；= (pageNo - 1 * pageSize); 最大值 500
  offset: number;
  // 搜索的上下文，在查询下一页时，需要在请求中带入 Response 返回的 context
  context?: string;
  // 页大小
  pagSize: number;
  // 需要搜索的请求内容，可以使用 and、or、not、括号 组合查询逻辑
  query: string;
  // 查询某个合约或者存证账户的时间轴返回结果
  timelineQuery?: string;
  // 查询范围的开始时间戳，毫秒
  startTime: number;
  // 查询范围的终止时间戳，单位毫秒
  endTime: number;
  // 搜索的类型范围，枚举：Chain、ChainData、ChainAddress、ChainBlock、ChainTx、ChainTxTimeline
  enabledTypes?: string[];
  static names(): { [key: string]: string } {
    return {
      offset: 'offset',
      context: 'context',
      pagSize: 'pag_size',
      query: 'query',
      timelineQuery: 'timeline_query',
      startTime: 'start_time',
      endTime: 'end_time',
      enabledTypes: 'enabled_types',
    };
  }

  static types(): { [key: string]: any } {
    return {
      offset: 'number',
      context: 'string',
      pagSize: 'number',
      query: 'string',
      timelineQuery: 'string',
      startTime: 'number',
      endTime: 'number',
      enabledTypes: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据洞察合约接口参数信息
export class ChainInsightContractInterfaceArgument extends $tea.Model {
  // 参数名
  name: string;
  // 参数类型
  type: string;
  // 参数位置，枚举：input，output，deposit
  location: string;
  // 参数的业务名称
  comment?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      type: 'type',
      location: 'location',
      comment: 'comment',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      type: 'string',
      location: 'string',
      comment: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据洞察统计任务
export class ChainInsightStatisticTask extends $tea.Model {
  // 统计任务ID
  id: string;
  // 统计任务类型
  type: string;
  // 所属链ID
  bizId: string;
  // 统计的链上合约地址
  address?: string;
  // 任务产出的指标信息
  metrics: ChainInsightStatisticMetricMeta[];
  // 任务创建时间，毫秒时间戳
  createTime?: number;
  // 任务修改时间，毫秒时间戳
  modifyTime?: number;
  // 任务状态：Running： 运行中； Paused: 已暂停
  status: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      type: 'type',
      bizId: 'biz_id',
      address: 'address',
      metrics: 'metrics',
      createTime: 'create_time',
      modifyTime: 'modify_time',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      type: 'string',
      bizId: 'string',
      address: 'string',
      metrics: { 'type': 'array', 'itemType': ChainInsightStatisticMetricMeta },
      createTime: 'number',
      modifyTime: 'number',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据洞察折线图
export class ChainInsightHistogram extends $tea.Model {
  // 横坐标名称
  xLabel?: string;
  // 纵坐标名称
  yLabel?: string;
  // 坐标集，按x增序
  points: ChainInsightPoint[];
  // 表格的名称或维度名称
  name?: string;
  static names(): { [key: string]: string } {
    return {
      xLabel: 'x_label',
      yLabel: 'y_label',
      points: 'points',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      xLabel: 'string',
      yLabel: 'string',
      points: { 'type': 'array', 'itemType': ChainInsightPoint },
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 查询自定义统计Table指标的返回结果
export class ChainInsightStatisticCustomTablesResponse extends $tea.Model {
  // 页大小
  pageSize: number;
  // 当前页码
  current: number;
  // 总条数
  total: number;
  // 表格每一行内容，    Key 为列名，    Value，列的取值
  list: ChainInsightStatisticCustomTableRow[];
  static names(): { [key: string]: string } {
    return {
      pageSize: 'page_size',
      current: 'current',
      total: 'total',
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageSize: 'number',
      current: 'number',
      total: 'number',
      list: { 'type': 'array', 'itemType': ChainInsightStatisticCustomTableRow },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 地址最近交易返回值
export class ChainInsightAddressLatestTxsResponse extends $tea.Model {
  // 页大小
  pageSize?: number;
  // 当前页码
  current?: number;
  // 合计
  total?: number;
  // 近期交易详情
  list?: ChainInsightTransaction[];
  static names(): { [key: string]: string } {
    return {
      pageSize: 'page_size',
      current: 'current',
      total: 'total',
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageSize: 'number',
      current: 'number',
      total: 'number',
      list: { 'type': 'array', 'itemType': ChainInsightTransaction },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 业务数据检索的结果数据
export class DataSearchResultResponseLog extends $tea.Model {
  // 数据关联的合约Meta信息
  metaId: string;
  // 交易调用的函数名称
  function?: string;
  // 交易产生的事件名称
  topic?: string;
  // 交易所在的区块高度
  blockNum: number;
  // 交易ID
  txId: string;
  // Json 序列化的交易请求参数
  data?: string;
  // 交易中合约输出的日志内容
  log?: string;
  // 索引数据枚举类型， interface, event, deposit ；分别对应合约调用、合约事件、原生存证
  type: string;
  // 交易上链时间戳，单位毫秒
  txTimestamp: number;
  static names(): { [key: string]: string } {
    return {
      metaId: 'meta_id',
      function: 'function',
      topic: 'topic',
      blockNum: 'block_num',
      txId: 'tx_id',
      data: 'data',
      log: 'log',
      type: 'type',
      txTimestamp: 'tx_timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      metaId: 'string',
      function: 'string',
      topic: 'string',
      blockNum: 'number',
      txId: 'string',
      data: 'string',
      log: 'string',
      type: 'string',
      txTimestamp: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合约Meta
export class ContractMeta extends $tea.Model {
  // MetaID
  id?: number;
  // 合约Meta创建时间
  createTime?: number;
  // 合约Meta更新时间
  updateTime?: number;
  // 合约名称
  contractName: string;
  // 合约名称对应的Hex编码合约地址
  contractAddr: string;
  // 合约版本号，用于助记
  contractVersion: string;
  // 合约Meta的类型，枚举类型；
  metaType: string;
  // 合约Meta生效块高，留空表示从上一个已定义的区间结束开始生效； 否则表示具体的起始生效块高
  startBlock?: number;
  // 合约Meta生效的截止块高，留空表示自动探测到下一个已定于的区间为止， 0 表示持续生效
  endBlock?: number;
  // 合约是否对外该链其它租户开放； 0 表示否， 1表示开放
  publicFlag?: number;
  // 合约Meta对应类型的数据
  metaContent: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      createTime: 'create_time',
      updateTime: 'update_time',
      contractName: 'contract_name',
      contractAddr: 'contract_addr',
      contractVersion: 'contract_version',
      metaType: 'meta_type',
      startBlock: 'start_block',
      endBlock: 'end_block',
      publicFlag: 'public_flag',
      metaContent: 'meta_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      createTime: 'number',
      updateTime: 'number',
      contractName: 'string',
      contractAddr: 'string',
      contractVersion: 'string',
      metaType: 'string',
      startBlock: 'number',
      endBlock: 'number',
      publicFlag: 'number',
      metaContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据洞察合约接口
export class ChainInsightContractInterface extends $tea.Model {
  // 展示的函数名称
  name?: string;
  // 接口中使用的函数名称标识符
  nameSig: string;
  // 接口的类型，枚举：function, event, deposit
  type: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      nameSig: 'name_sig',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      nameSig: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据实时检索搜索Request
export class DataSearchRequest extends $tea.Model {
  // 所有请求字符串，支持使用 and, or 逻辑连接词和括号
  query: string;
  // 分页，返回数据结果起始位置
  offset?: number;
  // 请求的结果数量，默认值 10
  size?: number;
  // 是否按时间降序排列
  reverse?: boolean;
  // 检索数据的截止时间范围，Unix时间戳（秒）
  to?: number;
  // 检索结果的总条数
  total?: number;
  static names(): { [key: string]: string } {
    return {
      query: 'query',
      offset: 'offset',
      size: 'size',
      reverse: 'reverse',
      to: 'to',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      query: 'string',
      offset: 'number',
      size: 'number',
      reverse: 'boolean',
      to: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 导出任务的日志
export class TriggerLog extends $tea.Model {
  // 日志的唯一ID
  uuid: string;
  // 日志的发生时间
  createTime?: number;
  // 日志的最近修改时间
  modifyTime?: number;
  // 日志发生的位置
  position: TriggerCheckpoint;
  // 日志状态
  status: string;
  static names(): { [key: string]: string } {
    return {
      uuid: 'uuid',
      createTime: 'create_time',
      modifyTime: 'modify_time',
      position: 'position',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uuid: 'string',
      createTime: 'number',
      modifyTime: 'number',
      position: TriggerCheckpoint,
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据洞察搜索返回结果
export class ChainInsightSearchResponse extends $tea.Model {
  // 搜索命中的结果总数
  total: number;
  // 搜索总共消耗了多长时间，时间单位毫秒
  took: number;
  // 当前搜索的 context；翻页时请求中的 context 需要配置为该值
  context: string;
  // 搜索结果
  items: ChainInsightSearchResultItem[];
  static names(): { [key: string]: string } {
    return {
      total: 'total',
      took: 'took',
      context: 'context',
      items: 'items',
    };
  }

  static types(): { [key: string]: any } {
    return {
      total: 'number',
      took: 'number',
      context: 'string',
      items: { 'type': 'array', 'itemType': ChainInsightSearchResultItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 地址标签信息
export class ChainInsightAddressLabel extends $tea.Model {
  // 链上账户或者合约地址
  address?: string;
  // 账户或者合约的真实名称
  name?: string;
  // 用户定义的地址描述信息
  comments?: string;
  // 合约/账户地址的标签信息
  labels?: MapEntry[];
  static names(): { [key: string]: string } {
    return {
      address: 'address',
      name: 'name',
      comments: 'comments',
      labels: 'labels',
    };
  }

  static types(): { [key: string]: any } {
    return {
      address: 'string',
      name: 'string',
      comments: 'string',
      labels: { 'type': 'array', 'itemType': MapEntry },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 服务状态
export class ServiceStatus extends $tea.Model {
  // 服务名称
  service: string;
  // 服务的开通与关闭状态
  state: string;
  static names(): { [key: string]: string } {
    return {
      service: 'service',
      state: 'state',
    };
  }

  static types(): { [key: string]: any } {
    return {
      service: 'string',
      state: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 链上区块
export class ChainInsightBlock extends $tea.Model {
  // 链ID
  bizId: string;
  // 链名称
  bizIdName?: string;
  // 链ID
  chain: string;
  // 所在子网
  network: string;
  // 区块高度
  number: number;
  // 区块Hash
  hash: string;
  // 区块创建时间戳
  createTime: number;
  // 上一个区块Hash
  previousHash: string;
  // 区块内交易列表
  transactions: ChainInsightTransaction[];
  // 区块的json序列化string
  data?: string;
  static names(): { [key: string]: string } {
    return {
      bizId: 'biz_id',
      bizIdName: 'biz_id_name',
      chain: 'chain',
      network: 'network',
      number: 'number',
      hash: 'hash',
      createTime: 'create_time',
      previousHash: 'previous_hash',
      transactions: 'transactions',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizId: 'string',
      bizIdName: 'string',
      chain: 'string',
      network: 'string',
      number: 'number',
      hash: 'string',
      createTime: 'number',
      previousHash: 'string',
      transactions: { 'type': 'array', 'itemType': ChainInsightTransaction },
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 导出任务
export class Trigger extends $tea.Model {
  // 导出任务唯一ID
  name?: string;
  // 导出目标
  type: string;
  // 导出的事件类型
  source?: string;
  // 创建时间戳
  createTime?: number;
  // 最近的错误描述信息
  errorMessage?: string;
  // 任务的状态
  status: string;
  // 导出任务的待处理错误日志数量
  pendingErrorLogs?: number;
  // 检查点信息
  checkpoint?: TriggerCheckpoint;
  // 导出任务配置
  options: MapEntry[];
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      type: 'type',
      source: 'source',
      createTime: 'create_time',
      errorMessage: 'error_message',
      status: 'status',
      pendingErrorLogs: 'pending_error_logs',
      checkpoint: 'checkpoint',
      options: 'options',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      type: 'string',
      source: 'string',
      createTime: 'number',
      errorMessage: 'string',
      status: 'string',
      pendingErrorLogs: 'number',
      checkpoint: TriggerCheckpoint,
      options: { 'type': 'array', 'itemType': MapEntry },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据洞察链上地址信息
export class ChainInsightAddress extends $tea.Model {
  // 链ID
  bizId: string;
  // 链名称
  bizIdName?: string;
  // 账户或合约地址
  address: string;
  // 创建者租户ID
  creatorOrganization?: string;
  // 创建者地址
  creator: string;
  // 创建时间
  craeteTime: number;
  // 创建交易ID
  createTxId: string;
  // 修改时间戳
  modifyTime: number;
  // 最近修改账户的交易ID
  modifyTxId: string;
  // 地址类型，枚举：Account，Contract
  type: string;
  // 地址状态，枚举：NORMAL，FREEZE，RECOVERING，UNKNOWN
  status: string;
  // 地址余额
  balance: number;
  // 认证Map
  authMap: MapEntry[];
  // 地址恢复公钥
  recoverKey: string;
  // 合约类型，仅当地址为合约时返回：WASM、SOLIDITY
  contractType?: string;
  static names(): { [key: string]: string } {
    return {
      bizId: 'biz_id',
      bizIdName: 'biz_id_name',
      address: 'address',
      creatorOrganization: 'creator_organization',
      creator: 'creator',
      craeteTime: 'craete_time',
      createTxId: 'create_tx_id',
      modifyTime: 'modify_time',
      modifyTxId: 'modify_tx_id',
      type: 'type',
      status: 'status',
      balance: 'balance',
      authMap: 'auth_map',
      recoverKey: 'recover_key',
      contractType: 'contract_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizId: 'string',
      bizIdName: 'string',
      address: 'string',
      creatorOrganization: 'string',
      creator: 'string',
      craeteTime: 'number',
      createTxId: 'string',
      modifyTime: 'number',
      modifyTxId: 'string',
      type: 'string',
      status: 'string',
      balance: 'number',
      authMap: { 'type': 'array', 'itemType': MapEntry },
      recoverKey: 'string',
      contractType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据导出映射关系
export class DataExportTableField extends $tea.Model {
  // 列名称
  columnName?: string;
  // 事件中字段提取的 jq 表达式
  field?: string;
  // 列类型
  columnType?: string;
  // 列大小
  columnSize?: number;
  // 列描述
  columnDescription?: string;
  static names(): { [key: string]: string } {
    return {
      columnName: 'column_name',
      field: 'field',
      columnType: 'column_type',
      columnSize: 'column_size',
      columnDescription: 'column_description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      columnName: 'string',
      field: 'string',
      columnType: 'string',
      columnSize: 'number',
      columnDescription: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDatasearchSearchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户唯一标识符（租户ID）
  tenantId: string;
  // 链唯一标识符
  bizId: string;
  // 检索的metaId范围；私有化不支持，参数留空
  metaConditions?: string[];
  // 检索请求
  query: DataSearchRequest;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      bizId: 'biz_id',
      metaConditions: 'meta_conditions',
      query: 'query',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      bizId: 'string',
      metaConditions: { 'type': 'array', 'itemType': 'string' },
      query: DataSearchRequest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDatasearchSearchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求下一页的Request
  context?: DataSearchRequest;
  // 检索的结果
  logs?: DataSearchResultResponseLog[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      context: 'context',
      logs: 'logs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      context: DataSearchRequest,
      logs: { 'type': 'array', 'itemType': DataSearchResultResponseLog },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartDatasearchIndexRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户唯一标识符（租户ID）
  tenantId: string;
  // 链唯一标识符
  bizId: string;
  // 合约ABI meta ID
  metaId: string;
  // 合约 hex 编码的地址
  contract: string;
  // 索引的起始位置，同合约ABI的起始位置； 0 表示从头
  startHeight: number;
  // 索引的终止位置，同合约ABI的终止位置；0 表示到最新
  endHeight: number;
  // 索引类型，   interface  为合约方法及输入输出； event 为合约Logs; deposit 为原生存证
  indexType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      bizId: 'biz_id',
      metaId: 'meta_id',
      contract: 'contract',
      startHeight: 'start_height',
      endHeight: 'end_height',
      indexType: 'index_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      bizId: 'string',
      metaId: 'string',
      contract: 'string',
      startHeight: 'number',
      endHeight: 'number',
      indexType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartDatasearchIndexResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 合约索引的任务的状态
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

export class StopDatasearchIndexRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户唯一标识符（租户ID）
  tenantId: string;
  // 链唯一标识符
  bizId: string;
  // 合约ABI的ID
  metaId: string;
  // 索引类型， interface 为合约方法及输入输出； event 为合约Logs; deposit 为原生存证
  indexType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      bizId: 'biz_id',
      metaId: 'meta_id',
      indexType: 'index_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      bizId: 'string',
      metaId: 'string',
      indexType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StopDatasearchIndexResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 合约索引的任务的状态
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

export class RemoveDatasearchIndexRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户唯一标识符（租户ID）
  tenantId: string;
  // 链唯一标识符
  bizId: string;
  // 合约ABI meta ID
  metaId: string;
  // 索引类型， interface 为合约方法及输入输出； event 为合约Logs; deposit 为原生存证
  indexType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      bizId: 'biz_id',
      metaId: 'meta_id',
      indexType: 'index_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      bizId: 'string',
      metaId: 'string',
      indexType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RemoveDatasearchIndexResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 合约索引的任务的状态
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

export class GetDatasearchIndexRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户唯一标识符（租户ID）
  tenantId: string;
  // 链唯一标识符
  bizId: string;
  // 合约ABI meta ID
  metaId: string;
  // 索引类型， interface 为合约方法及输入输出； event 为合约Logs; deposit 为原生存证
  indexType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      bizId: 'biz_id',
      metaId: 'meta_id',
      indexType: 'index_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      bizId: 'string',
      metaId: 'string',
      indexType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDatasearchIndexResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 索引的索引进度（块高）
  status?: number;
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
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListContractmetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户唯一标识符（租户ID）
  tenantId: string;
  // 链唯一标识符
  bizId: string;
  // 合约 hex 编码的地址, 留空表示所有合约
  contractAddr?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      bizId: 'biz_id',
      contractAddr: 'contract_addr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      bizId: 'string',
      contractAddr: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListContractmetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 合约Meta列表
  metas?: ContractMeta[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      metas: 'metas',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      metas: { 'type': 'array', 'itemType': ContractMeta },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddContractmetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户唯一标识符（租户ID）
  tenantId: string;
  // 链唯一标识符
  bizId: string;
  // 合约Meta
  meta: ContractMeta;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      bizId: 'biz_id',
      meta: 'meta',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      bizId: 'string',
      meta: ContractMeta,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddContractmetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 合约Meta
  meta?: ContractMeta;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      meta: 'meta',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      meta: ContractMeta,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteContractmetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户唯一标识符（租户ID）
  tenantId: string;
  // 链唯一标识符
  bizId: string;
  // 要删除的合约MetaID
  metaId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      bizId: 'biz_id',
      metaId: 'meta_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      bizId: 'string',
      metaId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteContractmetaResponse extends $tea.Model {
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

export class GetContractmetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户唯一标识符（租户ID）
  tenantId: string;
  // 链唯一标识符
  bizId: string;
  // 合约MetaId
  metaId: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      bizId: 'biz_id',
      metaId: 'meta_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      bizId: 'string',
      metaId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetContractmetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 合约Meta
  meta?: ContractMeta;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      meta: 'meta',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      meta: ContractMeta,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDataexportPreviewdataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户唯一标识符（租户ID）
  tenantId: string;
  // 链唯一标识符
  bizId: string;
  // 任务配置
  trigger: Trigger;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      bizId: 'biz_id',
      trigger: 'trigger',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      bizId: 'string',
      trigger: Trigger,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDataexportPreviewdataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 异步任务ID
  taskId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDataexportPreviewdataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户唯一标识符（租户ID）
  tenantId: string;
  // 链唯一标识符
  bizId: string;
  // 异步任务ID
  taskId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      bizId: 'biz_id',
      taskId: 'task_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      bizId: 'string',
      taskId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDataexportPreviewdataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 预览数据
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

export class GetDataexportPreviewsmappingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户唯一标识符（租户ID）
  tenantId: string;
  // 链唯一标识符
  bizId: string;
  // 获取的映射类型
  type: string;
  // 预览返回的数据
  data: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      bizId: 'biz_id',
      type: 'type',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      bizId: 'string',
      type: 'string',
      data: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDataexportPreviewsmappingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 映射关系列表
  data?: DataExportTableField[];
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
      data: { 'type': 'array', 'itemType': DataExportTableField },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDataexportTriggerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户唯一标识符（租户ID）
  tenantId: string;
  // 链唯一标识符
  bizId: string;
  // 导出任务
  trigger: Trigger;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      bizId: 'biz_id',
      trigger: 'trigger',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      bizId: 'string',
      trigger: Trigger,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDataexportTriggerResponse extends $tea.Model {
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

export class QueryDataexportPreviewsqlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // -
  tenantId: string;
  // -
  bizId: string;
  // -
  trigger: Trigger;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      bizId: 'biz_id',
      trigger: 'trigger',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      bizId: 'string',
      trigger: Trigger,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDataexportPreviewsqlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建表的SQL语句
  sql?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sql: 'sql',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sql: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDataexportTriggerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // -
  tenantId: string;
  // -
  bizId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      bizId: 'biz_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      bizId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDataexportTriggerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // -
  triggers?: Trigger[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      triggers: 'triggers',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      triggers: { 'type': 'array', 'itemType': Trigger },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateDataexportTriggerstatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // -
  tenantId: string;
  // -
  bizId: string;
  // 导出任务ID
  name: string;
  // 操作
  action: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      bizId: 'biz_id',
      name: 'name',
      action: 'action',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      bizId: 'string',
      name: 'string',
      action: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateDataexportTriggerstatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // -
  trigger?: Trigger;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      trigger: 'trigger',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      trigger: Trigger,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateDataexportTriggerconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // -
  tenantId: string;
  // -
  bizId: string;
  // 导出任务ID
  name: string;
  // -
  trigger: Trigger;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      bizId: 'biz_id',
      name: 'name',
      trigger: 'trigger',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      bizId: 'string',
      name: 'string',
      trigger: Trigger,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateDataexportTriggerconfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // -
  trigger?: Trigger;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      trigger: 'trigger',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      trigger: Trigger,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDataexportTriggerlogRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // tenant_id
  tenantId: string;
  // biz_id
  bizId: string;
  // 导出任务ID
  name: string;
  // 状态过滤条件
  action?: string;
  // -
  pageNo?: number;
  // -
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      bizId: 'biz_id',
      name: 'name',
      action: 'action',
      pageNo: 'page_no',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      bizId: 'string',
      name: 'string',
      action: 'string',
      pageNo: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListDataexportTriggerlogResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // -
  pageSize?: number;
  // -
  current?: number;
  // -
  total?: number;
  // -
  list?: TriggerLog[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageSize: 'page_size',
      current: 'current',
      total: 'total',
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pageSize: 'number',
      current: 'number',
      total: 'number',
      list: { 'type': 'array', 'itemType': TriggerLog },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateDataexportTriggerlogRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // tenant_id
  tenantId: string;
  // biz_id
  bizId: string;
  // 导出任务ID
  name: string;
  // 操作
  action: string;
  // 导出任务日志ID列表
  logs: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      bizId: 'biz_id',
      name: 'name',
      action: 'action',
      logs: 'logs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      bizId: 'string',
      name: 'string',
      action: 'string',
      logs: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateDataexportTriggerlogResponse extends $tea.Model {
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

export class QueryChaininsightLabelsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // 需要查询的地址列表
  hexAddresses: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      hexAddresses: 'hex_addresses',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      hexAddresses: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChaininsightLabelsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 地址的标签信息
  result?: ChainInsightAddressLabel[];
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
      result: { 'type': 'array', 'itemType': ChainInsightAddressLabel },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateChaininsightLabelsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // 链上地址
  hexAddress: string;
  // 更新的 label 内容
  label: ChainInsightAddressLabel;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      hexAddress: 'hex_address',
      label: 'label',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      hexAddress: 'string',
      label: ChainInsightAddressLabel,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateChaininsightLabelsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
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

export class QueryChaininsightSearchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联盟ID
  unionId: string;
  // 需要搜索的链ID列表，为空是表示搜索联盟内的所有链
  bizIds?: string[];
  // 搜索请求
  request: ChainInsightSearchRequest;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      unionId: 'union_id',
      bizIds: 'biz_ids',
      request: 'request',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      unionId: 'string',
      bizIds: { 'type': 'array', 'itemType': 'string' },
      request: ChainInsightSearchRequest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChaininsightSearchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 搜索结果
  result?: ChainInsightSearchResponse;
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
      result: ChainInsightSearchResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChaininsightAddressRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // 链上地址
  hexAddress: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      hexAddress: 'hex_address',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      hexAddress: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChaininsightAddressResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  result?: ChainInsightAddress;
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
      result: ChainInsightAddress,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChaininsightTransactionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // 交易ID
  txId: string;
  // hex编码的TEE交易解密Key，留空表示不解密
  teeKey?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      txId: 'tx_id',
      teeKey: 'tee_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      txId: 'string',
      teeKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChaininsightTransactionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  result?: ChainInsightTransaction;
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
      result: ChainInsightTransaction,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChaininsightBlockRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // 区块高度
  num: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      num: 'num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      num: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChaininsightBlockResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  result?: ChainInsightBlock;
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
      result: ChainInsightBlock,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChaininsightAddresslatesttxsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // 链上地址
  hexAddress: string;
  // 页码
  pageNo?: number;
  // 页大小
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      hexAddress: 'hex_address',
      pageNo: 'page_no',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      hexAddress: 'string',
      pageNo: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChaininsightAddresslatesttxsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  result?: ChainInsightAddressLatestTxsResponse;
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
      result: ChainInsightAddressLatestTxsResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListChaininsightContractinterfaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // 链上地址
  hexAddress: string;
  // 需要查询的版本信息，0表示最新
  ver: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      hexAddress: 'hex_address',
      ver: 'ver',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      hexAddress: 'string',
      ver: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListChaininsightContractinterfaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  result?: ChainInsightContractInterface[];
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
      result: { 'type': 'array', 'itemType': ChainInsightContractInterface },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailChaininsightContractinterfaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // 链上地址
  hexAddress: string;
  // 版本信息（块高）
  ver: string;
  // 接口
  contractInterface: ChainInsightContractInterface;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      hexAddress: 'hex_address',
      ver: 'ver',
      contractInterface: 'contract_interface',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      hexAddress: 'string',
      ver: 'string',
      contractInterface: ChainInsightContractInterface,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DetailChaininsightContractinterfaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  result?: ChainInsightContractInterfaceArgument[];
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
      result: { 'type': 'array', 'itemType': ChainInsightContractInterfaceArgument },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateChaininsightContractinterfaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // 链上地址
  hexAddress: string;
  // 版本信息
  ver: string;
  // 接口信息
  contractInterface: ChainInsightContractInterface;
  // 新的接口参数信息
  interfaceArgument: ChainInsightContractInterfaceArgument;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      hexAddress: 'hex_address',
      ver: 'ver',
      contractInterface: 'contract_interface',
      interfaceArgument: 'interface_argument',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      hexAddress: 'string',
      ver: 'string',
      contractInterface: ChainInsightContractInterface,
      interfaceArgument: ChainInsightContractInterfaceArgument,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateChaininsightContractinterfaceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
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

export class UploadChaininsightAbiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // 链上地址
  hexAddress: string;
  // 对应的合约版本
  ver: string;
  // ABI文件原始内容
  file: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      hexAddress: 'hex_address',
      ver: 'ver',
      file: 'file',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      hexAddress: 'string',
      ver: 'string',
      file: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadChaininsightAbiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
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

export class QueryChaininsightAddresshistogramrxRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // 地址
  hexAddress: string;
  // 开始时间戳，毫秒
  startTime: number;
  // 结束时间戳，毫秒
  endTime: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      hexAddress: 'hex_address',
      startTime: 'start_time',
      endTime: 'end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      hexAddress: 'string',
      startTime: 'number',
      endTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChaininsightAddresshistogramrxResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  result?: ChainInsightHistogram;
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
      result: ChainInsightHistogram,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChaininsightAddresshistogramtxRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // 地址
  hexAddress: string;
  // 开始时间戳
  startTime: number;
  // 结束时间戳
  endTime: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      hexAddress: 'hex_address',
      startTime: 'start_time',
      endTime: 'end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      hexAddress: 'string',
      startTime: 'number',
      endTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChaininsightAddresshistogramtxResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  result?: ChainInsightHistogram;
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
      result: ChainInsightHistogram,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChaininsightChaintxhistogramRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联盟ID
  unionId: string;
  // 链ID，可选；留空表示联盟内所有链
  bizId?: string;
  // 开始时间戳
  startTime: number;
  // 结束时间戳
  endTime: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      unionId: 'union_id',
      bizId: 'biz_id',
      startTime: 'start_time',
      endTime: 'end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      unionId: 'string',
      bizId: 'string',
      startTime: 'number',
      endTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChaininsightChaintxhistogramResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  result?: ChainInsightHistogram;
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
      result: ChainInsightHistogram,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryChaininsightTransactionRequest extends $tea.Model {
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

export class BatchqueryChaininsightTransactionResponse extends $tea.Model {
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

export class ListChaininsightStatisticRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // 统计类型，ContractStatistic：合约性能检测指标
  type?: string;
  // 合约地址
  hexAddress?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      type: 'type',
      hexAddress: 'hex_address',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      type: 'string',
      hexAddress: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListChaininsightStatisticResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  result?: ChainInsightStatisticTask[];
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
      result: { 'type': 'array', 'itemType': ChainInsightStatisticTask },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddChaininsightStatisticRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // 统计类型，    ContractStatistic： 合约性能检测指标
  type: string;
  // 链上合约地址
  hexAddress?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      type: 'type',
      hexAddress: 'hex_address',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      type: 'string',
      hexAddress: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddChaininsightStatisticResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  result?: ChainInsightStatisticTask;
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
      result: ChainInsightStatisticTask,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateChaininsightStatisticRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // 统计任务ID
  taskId: string;
  // 操作方式； Delete 删除
  operation: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      taskId: 'task_id',
      operation: 'operation',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      taskId: 'string',
      operation: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateChaininsightStatisticResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  result?: ChainInsightStatisticTask;
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
      result: ChainInsightStatisticTask,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChaininsightStatistichistogramRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // 自定义通知指标的ID
  name: string;
  // 多个维度名称，空表示所有维度
  dimensions?: string[];
  // 查询开始时间，毫秒时间戳
  startTime: number;
  // 查询结束时间，毫秒时间戳
  endTime: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      name: 'name',
      dimensions: 'dimensions',
      startTime: 'start_time',
      endTime: 'end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      name: 'string',
      dimensions: { 'type': 'array', 'itemType': 'string' },
      startTime: 'number',
      endTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChaininsightStatistichistogramResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  result?: ChainInsightHistogram[];
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
      result: { 'type': 'array', 'itemType': ChainInsightHistogram },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChaininsightStatistictableRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // 自定义统计的指标ID
  name: string;
  // 多个维度名称，空表示所有维度
  dimensions?: string[];
  // 分页大小
  pageSize?: number;
  // 页码
  pageNo?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      name: 'name',
      dimensions: 'dimensions',
      pageSize: 'page_size',
      pageNo: 'page_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      name: 'string',
      dimensions: { 'type': 'array', 'itemType': 'string' },
      pageSize: 'number',
      pageNo: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChaininsightStatistictableResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  result?: ChainInsightStatisticCustomTablesResponse;
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
      result: ChainInsightStatisticCustomTablesResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateChaininsightQrcodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // QR码类型，枚举值：CONTRACT / HEXADDRESS / TX / CHAIN / BLOCK / TIMELINE
  pageType: string;
  // 页面对应的参数
  paramMap: MapEntry[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      pageType: 'page_type',
      paramMap: 'param_map',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      pageType: 'string',
      paramMap: { 'type': 'array', 'itemType': MapEntry },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateChaininsightQrcodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // base64编码的png图片
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

export class RegisterChainsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链唯一标识符
  bizId: string;
  // 链配置的最后更新时间（用于标识版本）
  ver: number;
  // 链类型
  type: string;
  // 节点RPC接口地址
  mychainNodes?: string[];
  // MyChain版本
  mychainType?: string;
  // base64编码的JDS
  mychainTruststore?: string;
  // -
  mychainTruststorePassword?: string;
  // -
  mychainClientCrt?: string;
  // -
  mychainClientKey?: string;
  // -
  mychainClientKeyPwd?: string;
  // -
  mychainTlsAlgo?: string;
  // -
  mychainIdentityAlgo?: string;
  // 子链 groupID
  mychainGroupid?: string;
  // 子链的父链ID
  mychainParentBizid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      ver: 'ver',
      type: 'type',
      mychainNodes: 'mychain_nodes',
      mychainType: 'mychain_type',
      mychainTruststore: 'mychain_truststore',
      mychainTruststorePassword: 'mychain_truststore_password',
      mychainClientCrt: 'mychain_client_crt',
      mychainClientKey: 'mychain_client_key',
      mychainClientKeyPwd: 'mychain_client_key_pwd',
      mychainTlsAlgo: 'mychain_tls_algo',
      mychainIdentityAlgo: 'mychain_identity_algo',
      mychainGroupid: 'mychain_groupid',
      mychainParentBizid: 'mychain_parent_bizid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      ver: 'number',
      type: 'string',
      mychainNodes: { 'type': 'array', 'itemType': 'string' },
      mychainType: 'string',
      mychainTruststore: 'string',
      mychainTruststorePassword: 'string',
      mychainClientCrt: 'string',
      mychainClientKey: 'string',
      mychainClientKeyPwd: 'string',
      mychainTlsAlgo: 'string',
      mychainIdentityAlgo: 'string',
      mychainGroupid: 'string',
      mychainParentBizid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterChainsResponse extends $tea.Model {
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

export class OperateChainsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // -
  bizId: string;
  // 不留空表示给租户开通权限
  tenantId?: string;
  // 操作类型，默认留空表示开通
  type?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      tenantId: 'tenant_id',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      tenantId: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateChainsResponse extends $tea.Model {
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

export class GetChainsStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // -
  bizId: string;
  // -
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetChainsStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // -
  status?: ServiceStatus[];
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
      status: { 'type': 'array', 'itemType': ServiceStatus },
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
          sdk_version: "1.3.1",
          _prod_code: "BAASDATAGW",
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
   * Description: 检索索引的链上数据
   * Summary: 检索索引的链上数据
   */
  async queryDatasearchSearch(request: QueryDatasearchSearchRequest): Promise<QueryDatasearchSearchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDatasearchSearchEx(request, headers, runtime);
  }

  /**
   * Description: 检索索引的链上数据
   * Summary: 检索索引的链上数据
   */
  async queryDatasearchSearchEx(request: QueryDatasearchSearchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDatasearchSearchResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDatasearchSearchResponse>(await this.doRequest("1.0", "antchain.baasdatagw.datasearch.search.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDatasearchSearchResponse({}));
  }

  /**
   * Description: 针对某个数据类型的数据开启索引；该方法可重入
   * Summary: 开启数据索引
   */
  async startDatasearchIndex(request: StartDatasearchIndexRequest): Promise<StartDatasearchIndexResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startDatasearchIndexEx(request, headers, runtime);
  }

  /**
   * Description: 针对某个数据类型的数据开启索引；该方法可重入
   * Summary: 开启数据索引
   */
  async startDatasearchIndexEx(request: StartDatasearchIndexRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartDatasearchIndexResponse> {
    Util.validateModel(request);
    return $tea.cast<StartDatasearchIndexResponse>(await this.doRequest("1.0", "antchain.baasdatagw.datasearch.index.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartDatasearchIndexResponse({}));
  }

  /**
   * Description: 针对某个分组的数据停止索引；该方法可重入
   * Summary: 停止数据索引
   */
  async stopDatasearchIndex(request: StopDatasearchIndexRequest): Promise<StopDatasearchIndexResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.stopDatasearchIndexEx(request, headers, runtime);
  }

  /**
   * Description: 针对某个分组的数据停止索引；该方法可重入
   * Summary: 停止数据索引
   */
  async stopDatasearchIndexEx(request: StopDatasearchIndexRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StopDatasearchIndexResponse> {
    Util.validateModel(request);
    return $tea.cast<StopDatasearchIndexResponse>(await this.doRequest("1.0", "antchain.baasdatagw.datasearch.index.stop", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StopDatasearchIndexResponse({}));
  }

  /**
   * Description: 针对某个分组的数据删除索引（ES 中的数据仍然存在, 不会删除）；该方法不可重入
   * Summary: 删除数据索引
   */
  async removeDatasearchIndex(request: RemoveDatasearchIndexRequest): Promise<RemoveDatasearchIndexResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.removeDatasearchIndexEx(request, headers, runtime);
  }

  /**
   * Description: 针对某个分组的数据删除索引（ES 中的数据仍然存在, 不会删除）；该方法不可重入
   * Summary: 删除数据索引
   */
  async removeDatasearchIndexEx(request: RemoveDatasearchIndexRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RemoveDatasearchIndexResponse> {
    Util.validateModel(request);
    return $tea.cast<RemoveDatasearchIndexResponse>(await this.doRequest("1.0", "antchain.baasdatagw.datasearch.index.remove", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RemoveDatasearchIndexResponse({}));
  }

  /**
   * Description: 查询分组的索引进度，返回当前索引的索引进度（块高）
   * Summary: 查询数据索引进度
   */
  async getDatasearchIndex(request: GetDatasearchIndexRequest): Promise<GetDatasearchIndexResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDatasearchIndexEx(request, headers, runtime);
  }

  /**
   * Description: 查询分组的索引进度，返回当前索引的索引进度（块高）
   * Summary: 查询数据索引进度
   */
  async getDatasearchIndexEx(request: GetDatasearchIndexRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDatasearchIndexResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDatasearchIndexResponse>(await this.doRequest("1.0", "antchain.baasdatagw.datasearch.index.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDatasearchIndexResponse({}));
  }

  /**
   * Description: 列出租户在链上的所有合约Meta
   * Summary: 列出租户在链上的所有合约Meta
   */
  async listContractmeta(request: ListContractmetaRequest): Promise<ListContractmetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listContractmetaEx(request, headers, runtime);
  }

  /**
   * Description: 列出租户在链上的所有合约Meta
   * Summary: 列出租户在链上的所有合约Meta
   */
  async listContractmetaEx(request: ListContractmetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListContractmetaResponse> {
    Util.validateModel(request);
    return $tea.cast<ListContractmetaResponse>(await this.doRequest("1.0", "antchain.baasdatagw.contractmeta.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListContractmetaResponse({}));
  }

  /**
   * Description: 新增合约Meta
   * Summary: 新增合约Meta
   */
  async addContractmeta(request: AddContractmetaRequest): Promise<AddContractmetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addContractmetaEx(request, headers, runtime);
  }

  /**
   * Description: 新增合约Meta
   * Summary: 新增合约Meta
   */
  async addContractmetaEx(request: AddContractmetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddContractmetaResponse> {
    Util.validateModel(request);
    return $tea.cast<AddContractmetaResponse>(await this.doRequest("1.0", "antchain.baasdatagw.contractmeta.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddContractmetaResponse({}));
  }

  /**
   * Description: 删除合约meta
   * Summary: 删除合约meta
   */
  async deleteContractmeta(request: DeleteContractmetaRequest): Promise<DeleteContractmetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteContractmetaEx(request, headers, runtime);
  }

  /**
   * Description: 删除合约meta
   * Summary: 删除合约meta
   */
  async deleteContractmetaEx(request: DeleteContractmetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteContractmetaResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteContractmetaResponse>(await this.doRequest("1.0", "antchain.baasdatagw.contractmeta.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteContractmetaResponse({}));
  }

  /**
   * Description: 查询meta具体信息
   * Summary: 获取meta信息
   */
  async getContractmeta(request: GetContractmetaRequest): Promise<GetContractmetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getContractmetaEx(request, headers, runtime);
  }

  /**
   * Description: 查询meta具体信息
   * Summary: 获取meta信息
   */
  async getContractmetaEx(request: GetContractmetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetContractmetaResponse> {
    Util.validateModel(request);
    return $tea.cast<GetContractmetaResponse>(await this.doRequest("1.0", "antchain.baasdatagw.contractmeta.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetContractmetaResponse({}));
  }

  /**
   * Description: 获取导出任务预览数据的异步任务ID
   * Summary: 获取导出任务预览数据的异步任务ID
   */
  async createDataexportPreviewdata(request: CreateDataexportPreviewdataRequest): Promise<CreateDataexportPreviewdataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDataexportPreviewdataEx(request, headers, runtime);
  }

  /**
   * Description: 获取导出任务预览数据的异步任务ID
   * Summary: 获取导出任务预览数据的异步任务ID
   */
  async createDataexportPreviewdataEx(request: CreateDataexportPreviewdataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDataexportPreviewdataResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDataexportPreviewdataResponse>(await this.doRequest("1.0", "antchain.baasdatagw.dataexport.previewdata.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDataexportPreviewdataResponse({}));
  }

  /**
   * Description: 查询数据预览任务结果
   * Summary: 查询数据预览任务结果
   */
  async queryDataexportPreviewdata(request: QueryDataexportPreviewdataRequest): Promise<QueryDataexportPreviewdataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDataexportPreviewdataEx(request, headers, runtime);
  }

  /**
   * Description: 查询数据预览任务结果
   * Summary: 查询数据预览任务结果
   */
  async queryDataexportPreviewdataEx(request: QueryDataexportPreviewdataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDataexportPreviewdataResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDataexportPreviewdataResponse>(await this.doRequest("1.0", "antchain.baasdatagw.dataexport.previewdata.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDataexportPreviewdataResponse({}));
  }

  /**
   * Description: 查询默认字段映射
   * Summary: 查询默认字段映射
   */
  async getDataexportPreviewsmapping(request: GetDataexportPreviewsmappingRequest): Promise<GetDataexportPreviewsmappingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDataexportPreviewsmappingEx(request, headers, runtime);
  }

  /**
   * Description: 查询默认字段映射
   * Summary: 查询默认字段映射
   */
  async getDataexportPreviewsmappingEx(request: GetDataexportPreviewsmappingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDataexportPreviewsmappingResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDataexportPreviewsmappingResponse>(await this.doRequest("1.0", "antchain.baasdatagw.dataexport.previewsmapping.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDataexportPreviewsmappingResponse({}));
  }

  /**
   * Description: 创建导出任务
   * Summary: 创建导出任务
   */
  async createDataexportTrigger(request: CreateDataexportTriggerRequest): Promise<CreateDataexportTriggerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDataexportTriggerEx(request, headers, runtime);
  }

  /**
   * Description: 创建导出任务
   * Summary: 创建导出任务
   */
  async createDataexportTriggerEx(request: CreateDataexportTriggerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDataexportTriggerResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDataexportTriggerResponse>(await this.doRequest("1.0", "antchain.baasdatagw.dataexport.trigger.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDataexportTriggerResponse({}));
  }

  /**
   * Description: 查询建表语句
   * Summary: 查询建表语句
   */
  async queryDataexportPreviewsql(request: QueryDataexportPreviewsqlRequest): Promise<QueryDataexportPreviewsqlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDataexportPreviewsqlEx(request, headers, runtime);
  }

  /**
   * Description: 查询建表语句
   * Summary: 查询建表语句
   */
  async queryDataexportPreviewsqlEx(request: QueryDataexportPreviewsqlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDataexportPreviewsqlResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDataexportPreviewsqlResponse>(await this.doRequest("1.0", "antchain.baasdatagw.dataexport.previewsql.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDataexportPreviewsqlResponse({}));
  }

  /**
   * Description: 列出导出任务
   * Summary: 列出导出任务
   */
  async listDataexportTrigger(request: ListDataexportTriggerRequest): Promise<ListDataexportTriggerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listDataexportTriggerEx(request, headers, runtime);
  }

  /**
   * Description: 列出导出任务
   * Summary: 列出导出任务
   */
  async listDataexportTriggerEx(request: ListDataexportTriggerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListDataexportTriggerResponse> {
    Util.validateModel(request);
    return $tea.cast<ListDataexportTriggerResponse>(await this.doRequest("1.0", "antchain.baasdatagw.dataexport.trigger.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListDataexportTriggerResponse({}));
  }

  /**
   * Description: 修改导出任务状态
   * Summary: 修改导出任务状态
   */
  async operateDataexportTriggerstatus(request: OperateDataexportTriggerstatusRequest): Promise<OperateDataexportTriggerstatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateDataexportTriggerstatusEx(request, headers, runtime);
  }

  /**
   * Description: 修改导出任务状态
   * Summary: 修改导出任务状态
   */
  async operateDataexportTriggerstatusEx(request: OperateDataexportTriggerstatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateDataexportTriggerstatusResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateDataexportTriggerstatusResponse>(await this.doRequest("1.0", "antchain.baasdatagw.dataexport.triggerstatus.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateDataexportTriggerstatusResponse({}));
  }

  /**
   * Description: 修改导出任务配置
   * Summary: 修改导出任务配置
   */
  async operateDataexportTriggerconfig(request: OperateDataexportTriggerconfigRequest): Promise<OperateDataexportTriggerconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateDataexportTriggerconfigEx(request, headers, runtime);
  }

  /**
   * Description: 修改导出任务配置
   * Summary: 修改导出任务配置
   */
  async operateDataexportTriggerconfigEx(request: OperateDataexportTriggerconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateDataexportTriggerconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateDataexportTriggerconfigResponse>(await this.doRequest("1.0", "antchain.baasdatagw.dataexport.triggerconfig.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateDataexportTriggerconfigResponse({}));
  }

  /**
   * Description: 列出导出任务失败日志
   * Summary: 列出导出任务失败日志
   */
  async listDataexportTriggerlog(request: ListDataexportTriggerlogRequest): Promise<ListDataexportTriggerlogResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listDataexportTriggerlogEx(request, headers, runtime);
  }

  /**
   * Description: 列出导出任务失败日志
   * Summary: 列出导出任务失败日志
   */
  async listDataexportTriggerlogEx(request: ListDataexportTriggerlogRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListDataexportTriggerlogResponse> {
    Util.validateModel(request);
    return $tea.cast<ListDataexportTriggerlogResponse>(await this.doRequest("1.0", "antchain.baasdatagw.dataexport.triggerlog.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListDataexportTriggerlogResponse({}));
  }

  /**
   * Description: 操作导出任务失败日志
   * Summary: 操作导出任务失败日志
   */
  async operateDataexportTriggerlog(request: OperateDataexportTriggerlogRequest): Promise<OperateDataexportTriggerlogResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateDataexportTriggerlogEx(request, headers, runtime);
  }

  /**
   * Description: 操作导出任务失败日志
   * Summary: 操作导出任务失败日志
   */
  async operateDataexportTriggerlogEx(request: OperateDataexportTriggerlogRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateDataexportTriggerlogResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateDataexportTriggerlogResponse>(await this.doRequest("1.0", "antchain.baasdatagw.dataexport.triggerlog.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateDataexportTriggerlogResponse({}));
  }

  /**
   * Description: 查询地址标签
   * Summary: 查询地址标签
   */
  async queryChaininsightLabels(request: QueryChaininsightLabelsRequest): Promise<QueryChaininsightLabelsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryChaininsightLabelsEx(request, headers, runtime);
  }

  /**
   * Description: 查询地址标签
   * Summary: 查询地址标签
   */
  async queryChaininsightLabelsEx(request: QueryChaininsightLabelsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryChaininsightLabelsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryChaininsightLabelsResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.labels.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryChaininsightLabelsResponse({}));
  }

  /**
   * Description: 更新地址标签
   * Summary: 更新地址标签
   */
  async updateChaininsightLabels(request: UpdateChaininsightLabelsRequest): Promise<UpdateChaininsightLabelsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateChaininsightLabelsEx(request, headers, runtime);
  }

  /**
   * Description: 更新地址标签
   * Summary: 更新地址标签
   */
  async updateChaininsightLabelsEx(request: UpdateChaininsightLabelsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateChaininsightLabelsResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateChaininsightLabelsResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.labels.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateChaininsightLabelsResponse({}));
  }

  /**
   * Description: 链上搜索
   * Summary: 链上搜索
   */
  async queryChaininsightSearch(request: QueryChaininsightSearchRequest): Promise<QueryChaininsightSearchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryChaininsightSearchEx(request, headers, runtime);
  }

  /**
   * Description: 链上搜索
   * Summary: 链上搜索
   */
  async queryChaininsightSearchEx(request: QueryChaininsightSearchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryChaininsightSearchResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryChaininsightSearchResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.search.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryChaininsightSearchResponse({}));
  }

  /**
   * Description: 查询链上地址详情
   * Summary: 查询链上地址详情
   */
  async queryChaininsightAddress(request: QueryChaininsightAddressRequest): Promise<QueryChaininsightAddressResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryChaininsightAddressEx(request, headers, runtime);
  }

  /**
   * Description: 查询链上地址详情
   * Summary: 查询链上地址详情
   */
  async queryChaininsightAddressEx(request: QueryChaininsightAddressRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryChaininsightAddressResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryChaininsightAddressResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.address.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryChaininsightAddressResponse({}));
  }

  /**
   * Description: 查询链上交易详情
   * Summary: 查询链上交易详情
   */
  async queryChaininsightTransaction(request: QueryChaininsightTransactionRequest): Promise<QueryChaininsightTransactionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryChaininsightTransactionEx(request, headers, runtime);
  }

  /**
   * Description: 查询链上交易详情
   * Summary: 查询链上交易详情
   */
  async queryChaininsightTransactionEx(request: QueryChaininsightTransactionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryChaininsightTransactionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryChaininsightTransactionResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.transaction.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryChaininsightTransactionResponse({}));
  }

  /**
   * Description: 查询链上区块详情
   * Summary: 查询链上区块详情
   */
  async queryChaininsightBlock(request: QueryChaininsightBlockRequest): Promise<QueryChaininsightBlockResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryChaininsightBlockEx(request, headers, runtime);
  }

  /**
   * Description: 查询链上区块详情
   * Summary: 查询链上区块详情
   */
  async queryChaininsightBlockEx(request: QueryChaininsightBlockRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryChaininsightBlockResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryChaininsightBlockResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.block.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryChaininsightBlockResponse({}));
  }

  /**
   * Description: 查询地址近期交易
   * Summary: 查询地址近期交易
   */
  async queryChaininsightAddresslatesttxs(request: QueryChaininsightAddresslatesttxsRequest): Promise<QueryChaininsightAddresslatesttxsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryChaininsightAddresslatesttxsEx(request, headers, runtime);
  }

  /**
   * Description: 查询地址近期交易
   * Summary: 查询地址近期交易
   */
  async queryChaininsightAddresslatesttxsEx(request: QueryChaininsightAddresslatesttxsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryChaininsightAddresslatesttxsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryChaininsightAddresslatesttxsResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.addresslatesttxs.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryChaininsightAddresslatesttxsResponse({}));
  }

  /**
   * Description: 列出合约全部接口
   * Summary: 列出合约全部接口
   */
  async listChaininsightContractinterface(request: ListChaininsightContractinterfaceRequest): Promise<ListChaininsightContractinterfaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listChaininsightContractinterfaceEx(request, headers, runtime);
  }

  /**
   * Description: 列出合约全部接口
   * Summary: 列出合约全部接口
   */
  async listChaininsightContractinterfaceEx(request: ListChaininsightContractinterfaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListChaininsightContractinterfaceResponse> {
    Util.validateModel(request);
    return $tea.cast<ListChaininsightContractinterfaceResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.contractinterface.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListChaininsightContractinterfaceResponse({}));
  }

  /**
   * Description: 查询合约接口信息
   * Summary: 查询合约接口信息
   */
  async detailChaininsightContractinterface(request: DetailChaininsightContractinterfaceRequest): Promise<DetailChaininsightContractinterfaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.detailChaininsightContractinterfaceEx(request, headers, runtime);
  }

  /**
   * Description: 查询合约接口信息
   * Summary: 查询合约接口信息
   */
  async detailChaininsightContractinterfaceEx(request: DetailChaininsightContractinterfaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DetailChaininsightContractinterfaceResponse> {
    Util.validateModel(request);
    return $tea.cast<DetailChaininsightContractinterfaceResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.contractinterface.detail", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DetailChaininsightContractinterfaceResponse({}));
  }

  /**
   * Description: 更新合约接口信息
   * Summary: 更新合约接口信息
   */
  async updateChaininsightContractinterface(request: UpdateChaininsightContractinterfaceRequest): Promise<UpdateChaininsightContractinterfaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateChaininsightContractinterfaceEx(request, headers, runtime);
  }

  /**
   * Description: 更新合约接口信息
   * Summary: 更新合约接口信息
   */
  async updateChaininsightContractinterfaceEx(request: UpdateChaininsightContractinterfaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateChaininsightContractinterfaceResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateChaininsightContractinterfaceResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.contractinterface.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateChaininsightContractinterfaceResponse({}));
  }

  /**
   * Description: 上传合约ABI文件
   * Summary: 上传合约ABI文件
   */
  async uploadChaininsightAbi(request: UploadChaininsightAbiRequest): Promise<UploadChaininsightAbiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadChaininsightAbiEx(request, headers, runtime);
  }

  /**
   * Description: 上传合约ABI文件
   * Summary: 上传合约ABI文件
   */
  async uploadChaininsightAbiEx(request: UploadChaininsightAbiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadChaininsightAbiResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadChaininsightAbiResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.abi.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadChaininsightAbiResponse({}));
  }

  /**
   * Description: 查询地址的接收交易数量趋势
   * Summary: 查询地址的接收交易数量趋势
   */
  async queryChaininsightAddresshistogramrx(request: QueryChaininsightAddresshistogramrxRequest): Promise<QueryChaininsightAddresshistogramrxResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryChaininsightAddresshistogramrxEx(request, headers, runtime);
  }

  /**
   * Description: 查询地址的接收交易数量趋势
   * Summary: 查询地址的接收交易数量趋势
   */
  async queryChaininsightAddresshistogramrxEx(request: QueryChaininsightAddresshistogramrxRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryChaininsightAddresshistogramrxResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryChaininsightAddresshistogramrxResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.addresshistogramrx.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryChaininsightAddresshistogramrxResponse({}));
  }

  /**
   * Description: 查询地址的发送交易数量趋势
   * Summary: 查询地址的发送交易数量趋势
   */
  async queryChaininsightAddresshistogramtx(request: QueryChaininsightAddresshistogramtxRequest): Promise<QueryChaininsightAddresshistogramtxResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryChaininsightAddresshistogramtxEx(request, headers, runtime);
  }

  /**
   * Description: 查询地址的发送交易数量趋势
   * Summary: 查询地址的发送交易数量趋势
   */
  async queryChaininsightAddresshistogramtxEx(request: QueryChaininsightAddresshistogramtxRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryChaininsightAddresshistogramtxResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryChaininsightAddresshistogramtxResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.addresshistogramtx.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryChaininsightAddresshistogramtxResponse({}));
  }

  /**
   * Description: 查询链交易数量趋势
   * Summary: 查询链交易数量趋势
   */
  async queryChaininsightChaintxhistogram(request: QueryChaininsightChaintxhistogramRequest): Promise<QueryChaininsightChaintxhistogramResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryChaininsightChaintxhistogramEx(request, headers, runtime);
  }

  /**
   * Description: 查询链交易数量趋势
   * Summary: 查询链交易数量趋势
   */
  async queryChaininsightChaintxhistogramEx(request: QueryChaininsightChaintxhistogramRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryChaininsightChaintxhistogramResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryChaininsightChaintxhistogramResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.chaintxhistogram.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryChaininsightChaintxhistogramResponse({}));
  }

  /**
   * Description: 批量查询链上交易详情
   * Summary: 批量查询链上交易详情
   */
  async batchqueryChaininsightTransaction(request: BatchqueryChaininsightTransactionRequest): Promise<BatchqueryChaininsightTransactionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryChaininsightTransactionEx(request, headers, runtime);
  }

  /**
   * Description: 批量查询链上交易详情
   * Summary: 批量查询链上交易详情
   */
  async batchqueryChaininsightTransactionEx(request: BatchqueryChaininsightTransactionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryChaininsightTransactionResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryChaininsightTransactionResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.transaction.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryChaininsightTransactionResponse({}));
  }

  /**
   * Description: 查询统计任务
   * Summary: 查询统计任务
   */
  async listChaininsightStatistic(request: ListChaininsightStatisticRequest): Promise<ListChaininsightStatisticResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listChaininsightStatisticEx(request, headers, runtime);
  }

  /**
   * Description: 查询统计任务
   * Summary: 查询统计任务
   */
  async listChaininsightStatisticEx(request: ListChaininsightStatisticRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListChaininsightStatisticResponse> {
    Util.validateModel(request);
    return $tea.cast<ListChaininsightStatisticResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.statistic.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListChaininsightStatisticResponse({}));
  }

  /**
   * Description: 新建统计任务
   * Summary: 新建统计任务
   */
  async addChaininsightStatistic(request: AddChaininsightStatisticRequest): Promise<AddChaininsightStatisticResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addChaininsightStatisticEx(request, headers, runtime);
  }

  /**
   * Description: 新建统计任务
   * Summary: 新建统计任务
   */
  async addChaininsightStatisticEx(request: AddChaininsightStatisticRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddChaininsightStatisticResponse> {
    Util.validateModel(request);
    return $tea.cast<AddChaininsightStatisticResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.statistic.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddChaininsightStatisticResponse({}));
  }

  /**
   * Description: 操作统计任务
   * Summary: 操作统计任务
   */
  async operateChaininsightStatistic(request: OperateChaininsightStatisticRequest): Promise<OperateChaininsightStatisticResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateChaininsightStatisticEx(request, headers, runtime);
  }

  /**
   * Description: 操作统计任务
   * Summary: 操作统计任务
   */
  async operateChaininsightStatisticEx(request: OperateChaininsightStatisticRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateChaininsightStatisticResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateChaininsightStatisticResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.statistic.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateChaininsightStatisticResponse({}));
  }

  /**
   * Description: 查询统计任务的统计结果直方图
   * Summary: 查询统计任务的统计结果直方图
   */
  async queryChaininsightStatistichistogram(request: QueryChaininsightStatistichistogramRequest): Promise<QueryChaininsightStatistichistogramResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryChaininsightStatistichistogramEx(request, headers, runtime);
  }

  /**
   * Description: 查询统计任务的统计结果直方图
   * Summary: 查询统计任务的统计结果直方图
   */
  async queryChaininsightStatistichistogramEx(request: QueryChaininsightStatistichistogramRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryChaininsightStatistichistogramResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryChaininsightStatistichistogramResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.statistichistogram.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryChaininsightStatistichistogramResponse({}));
  }

  /**
   * Description: 查询统计任务的统计结果表格
   * Summary: 查询统计任务的统计结果表格
   */
  async queryChaininsightStatistictable(request: QueryChaininsightStatistictableRequest): Promise<QueryChaininsightStatistictableResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryChaininsightStatistictableEx(request, headers, runtime);
  }

  /**
   * Description: 查询统计任务的统计结果表格
   * Summary: 查询统计任务的统计结果表格
   */
  async queryChaininsightStatistictableEx(request: QueryChaininsightStatistictableRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryChaininsightStatistictableResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryChaininsightStatistictableResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.statistictable.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryChaininsightStatistictableResponse({}));
  }

  /**
   * Description: 生成支付宝小程序二维码
   * Summary: 生成支付宝小程序二维码
   */
  async createChaininsightQrcode(request: CreateChaininsightQrcodeRequest): Promise<CreateChaininsightQrcodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createChaininsightQrcodeEx(request, headers, runtime);
  }

  /**
   * Description: 生成支付宝小程序二维码
   * Summary: 生成支付宝小程序二维码
   */
  async createChaininsightQrcodeEx(request: CreateChaininsightQrcodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateChaininsightQrcodeResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateChaininsightQrcodeResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.qrcode.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateChaininsightQrcodeResponse({}));
  }

  /**
   * Description: 注册链信息
   * Summary: 注册链信息
   */
  async registerChains(request: RegisterChainsRequest): Promise<RegisterChainsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerChainsEx(request, headers, runtime);
  }

  /**
   * Description: 注册链信息
   * Summary: 注册链信息
   */
  async registerChainsEx(request: RegisterChainsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterChainsResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterChainsResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chains.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterChainsResponse({}));
  }

  /**
   * Description: 操作数据网关开通状态
   * Summary: 操作数据网关开通状态
   */
  async operateChains(request: OperateChainsRequest): Promise<OperateChainsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateChainsEx(request, headers, runtime);
  }

  /**
   * Description: 操作数据网关开通状态
   * Summary: 操作数据网关开通状态
   */
  async operateChainsEx(request: OperateChainsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateChainsResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateChainsResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chains.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateChainsResponse({}));
  }

  /**
   * Description: 查询某条链的服务开通状态
   * Summary: 查询某条链的服务开通状态
   */
  async getChainsStatus(request: GetChainsStatusRequest): Promise<GetChainsStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getChainsStatusEx(request, headers, runtime);
  }

  /**
   * Description: 查询某条链的服务开通状态
   * Summary: 查询某条链的服务开通状态
   */
  async getChainsStatusEx(request: GetChainsStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetChainsStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<GetChainsStatusResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chains.status.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetChainsStatusResponse({}));
  }

}
