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

// MapKV
export class MapEntry extends $tea.Model {
  // Key
  key: string;
  // value
  value: string;
  // 声明 value 的类型，包括 String / Double / Long / Bool / JSONObject / JSONArray
  type?: string;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      value: 'value',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      value: 'string',
      type: 'string',
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
  // 搜索的类型范围，枚举：Chain、ChainData、ChainAddress、ChainBlock、ChainTx、ChainTxTimeline、DigitalAsset
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

// 数据洞察搜索结果的Item
export class ChainInsightSearchResultItem extends $tea.Model {
  // 结果类型，枚举：Chain、ChainData、ChainAddress、ChainBlock、ChainTx、ChainTxTimeline
  type: string;
  // 结果所在的链ID
  bizId: string;
  // 结果链ID对应的区块链名称
  bizName?: string;
  // 结果与搜索请求的相关性程度，(0, 10000000]
  score: number;
  // 搜索结果值
  values: MapEntry[];
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      bizId: 'biz_id',
      bizName: 'biz_name',
      score: 'score',
      values: 'values',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      bizId: 'string',
      bizName: 'string',
      score: 'number',
      values: { 'type': 'array', 'itemType': MapEntry },
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
  // 资产合约相关信息
  assetContractInfo?: ChainInsightAssetContractInfo;
  // 创建时间
  createTime: number;
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
      assetContractInfo: 'asset_contract_info',
      createTime: 'create_time',
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
      assetContractInfo: ChainInsightAssetContractInfo,
      createTime: 'number',
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
  // 交易时间戳（单位：毫秒）
  timestamp: number;
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
      timestamp: 'timestamp',
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
      timestamp: 'number',
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
  // 对应的标准 ERC 事件/方法 的名称
  standardErcName?: string;
  // 参数列表
  args?: ChainInsightContractInterfaceArgument[];
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      nameSig: 'name_sig',
      type: 'type',
      standardErcName: 'standard_erc_name',
      args: 'args',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      nameSig: 'string',
      type: 'string',
      standardErcName: 'string',
      args: { 'type': 'array', 'itemType': ChainInsightContractInterfaceArgument },
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
  // 用于在更新参数配置时，声明是否需要删除该参数的 comment 内容
  deleteComment?: boolean;
  // 对应的标准 ERC 参数的名称，例如：标准ERC1155 TransferBatch事件中的operator
  standardErcName?: string;
  // 是否进行数据脱敏
  needDesensitization?: boolean;
  // 子参数列表
  subArgs?: ChainInsightContractInterfaceArgumentList;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      type: 'type',
      location: 'location',
      comment: 'comment',
      deleteComment: 'delete_comment',
      standardErcName: 'standard_erc_name',
      needDesensitization: 'need_desensitization',
      subArgs: 'sub_args',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      type: 'string',
      location: 'string',
      comment: 'string',
      deleteComment: 'boolean',
      standardErcName: 'string',
      needDesensitization: 'boolean',
      subArgs: ChainInsightContractInterfaceArgumentList,
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

// 数据搜索状态
export class ChainInsightSearchStatus extends $tea.Model {
  // 链ID
  bizId: string;
  // 链名称
  bizIdName?: string;
  // Indexing,Enabled,Disabled
  status: string;
  // 当前索引的区块高度
  currentHeight?: number;
  // 当前区块链高度
  ledgerHeight?: number;
  // 预计索引完成的时间，单位秒
  estimateTime?: number;
  static names(): { [key: string]: string } {
    return {
      bizId: 'biz_id',
      bizIdName: 'biz_id_name',
      status: 'status',
      currentHeight: 'current_height',
      ledgerHeight: 'ledger_height',
      estimateTime: 'estimate_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizId: 'string',
      bizIdName: 'string',
      status: 'string',
      currentHeight: 'number',
      ledgerHeight: 'number',
      estimateTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据洞察看板
export class ChainInsightWidget extends $tea.Model {
  // 看版类型，内置看版类型为Default
  widgetType: string;
  // 看版子类型；ChainIdWidget, ChainAccountWidget, ChainContractWidget, ChainTotalTransactionWidget, ChainActiveAddressWidget, ChainTxTimeLineWidget
  type: string;
  // 看版时间范围，单位小时
  timeRange: number;
  // 看板ID
  id?: string;
  // 看版名称，最大32字符
  name?: string;
  // 看版描述，最大 255 字符
  description?: string;
  // 看版创建时间，单位毫秒时间戳
  createTime?: number;
  // 看版修改时间，单位毫秒时间戳
  modifyTime?: number;
  // 看版对应的链ID，空表示联盟下所有的链
  bizId?: string;
  // 链名称
  bizIdName?: string;
  // 看版对应的链上账户地址，hex编码
  hexAddress?: string;
  // 时间轴搜索的请求
  query?: string;
  static names(): { [key: string]: string } {
    return {
      widgetType: 'widget_type',
      type: 'type',
      timeRange: 'time_range',
      id: 'id',
      name: 'name',
      description: 'description',
      createTime: 'create_time',
      modifyTime: 'modify_time',
      bizId: 'biz_id',
      bizIdName: 'biz_id_name',
      hexAddress: 'hex_address',
      query: 'query',
    };
  }

  static types(): { [key: string]: any } {
    return {
      widgetType: 'string',
      type: 'string',
      timeRange: 'number',
      id: 'string',
      name: 'string',
      description: 'string',
      createTime: 'number',
      modifyTime: 'number',
      bizId: 'string',
      bizIdName: 'string',
      hexAddress: 'string',
      query: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 链上近期活跃地址响应
export class ChainInsightActiveAddressesResponse extends $tea.Model {
  // 页面大小
  pageSize?: number;
  // 当前页码
  current?: number;
  // 合计
  total?: number;
  // 结果列表
  list?: MapEntryList[];
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
      list: { 'type': 'array', 'itemType': MapEntryList },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 链上交易基础信息
export class ChainInsightTransactionInfo extends $tea.Model {
  // 交易ID
  id?: string;
  // 交易类型
  type?: string;
  // 交易发起者
  from?: string;
  // 交易接收者
  to?: string;
  // 交易成块高度
  height?: number;
  // 交易成块时间，毫秒时间戳
  timestamp?: number;
  // 合约中 ABI 的状态  (无需上传) none / （可以上传）pending / （可以更新）uploaded
  abiStatus?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      type: 'type',
      from: 'from',
      to: 'to',
      height: 'height',
      timestamp: 'timestamp',
      abiStatus: 'abi_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      type: 'string',
      from: 'string',
      to: 'string',
      height: 'number',
      timestamp: 'number',
      abiStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ChainInsightTransactionInfo分页结构体
export class ChainInsightTransactionInfoPageableResponse extends $tea.Model {
  // 页面大小
  pageSize?: number;
  // 当前页码
  current?: number;
  // 合计
  total?: number;
  // ChainInsightTransactionInfo列表
  list?: ChainInsightTransactionInfo[];
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
      list: { 'type': 'array', 'itemType': ChainInsightTransactionInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 区块链节点信息
export class ChainInsightNodeInfo extends $tea.Model {
  // 链ID
  bizId?: string;
  // 节点名称
  name?: string;
  // 节点IP
  ip?: string;
  // 节点当前区块高度
  height?: number;
  // 节点状态，ok, fail
  status?: string;
  static names(): { [key: string]: string } {
    return {
      bizId: 'biz_id',
      name: 'name',
      ip: 'ip',
      height: 'height',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizId: 'string',
      name: 'string',
      ip: 'string',
      height: 'number',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 链状态
export class ChainStatus extends $tea.Model {
  // 链ID
  bizId?: string;
  // 链名称
  bizIdName?: string;
  // 主链ID
  parentBizId?: string;
  // 当前区块高度
  ledgerHeight?: number;
  // 交易总量
  txCount?: number;
  // 链状态，ok, fail
  status?: string;
  static names(): { [key: string]: string } {
    return {
      bizId: 'biz_id',
      bizIdName: 'biz_id_name',
      parentBizId: 'parent_biz_id',
      ledgerHeight: 'ledger_height',
      txCount: 'tx_count',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizId: 'string',
      bizIdName: 'string',
      parentBizId: 'string',
      ledgerHeight: 'number',
      txCount: 'number',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 链状态信息
export class ChainInsightChainStatus extends $tea.Model {
  // 节点信息
  nodeInfos?: ChainInsightNodeInfo[];
  // 链状态
  chainStatuses?: ChainStatus[];
  static names(): { [key: string]: string } {
    return {
      nodeInfos: 'node_infos',
      chainStatuses: 'chain_statuses',
    };
  }

  static types(): { [key: string]: any } {
    return {
      nodeInfos: { 'type': 'array', 'itemType': ChainInsightNodeInfo },
      chainStatuses: { 'type': 'array', 'itemType': ChainStatus },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// MapEntry列表，对应一个Map
export class MapEntryList extends $tea.Model {
  // MapEntry列表
  element?: MapEntry[];
  static names(): { [key: string]: string } {
    return {
      element: 'element',
    };
  }

  static types(): { [key: string]: any } {
    return {
      element: { 'type': 'array', 'itemType': MapEntry },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 链上资产信息
export class ChainInsightAsset extends $tea.Model {
  // 链ID
  bizId?: string;
  // 链名称
  bizIdName?: string;
  // 资产合约地址
  contractAddr: string;
  // 资产ID
  assetId: string;
  // 数字权证链上的1155资产分片ID
  shardId?: string;
  // 资产类型：ERC721 / ERC1155
  ercType: string;
  // 创建时间，取值为创建时交易所在区块创建的时间，单位：毫秒
  createTime?: number;
  // 持有者数量
  ownerCount?: number;
  // 资产元信息
  metaData?: string;
  // 资产元信息链接
  uri?: string;
  // 账户名下该资产的余额 / 合约下该资产的总供应量
  balance?: number;
  // 该资产最近一笔交易的哈希
  latestTxHash: string;
  // 该资产最近一笔交易所在区块的创建时间
  latestTxTime: number;
  static names(): { [key: string]: string } {
    return {
      bizId: 'biz_id',
      bizIdName: 'biz_id_name',
      contractAddr: 'contract_addr',
      assetId: 'asset_id',
      shardId: 'shard_id',
      ercType: 'erc_type',
      createTime: 'create_time',
      ownerCount: 'owner_count',
      metaData: 'meta_data',
      uri: 'uri',
      balance: 'balance',
      latestTxHash: 'latest_tx_hash',
      latestTxTime: 'latest_tx_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizId: 'string',
      bizIdName: 'string',
      contractAddr: 'string',
      assetId: 'string',
      shardId: 'string',
      ercType: 'string',
      createTime: 'number',
      ownerCount: 'number',
      metaData: 'string',
      uri: 'string',
      balance: 'number',
      latestTxHash: 'string',
      latestTxTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 链上资产元信息
export class ChainInsightAssetMeta extends $tea.Model {
  // 资产元信息链接
  uri?: string;
  // 资产元信息
  metaData?: string;
  // 资源类型：Image / Audio / Video / Unknown
  resourceType: string;
  // 资源详细数据，如图片、视频的链接
  resourceData?: string;
  static names(): { [key: string]: string } {
    return {
      uri: 'uri',
      metaData: 'meta_data',
      resourceType: 'resource_type',
      resourceData: 'resource_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      uri: 'string',
      metaData: 'string',
      resourceType: 'string',
      resourceData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 链上资产持有者信息
export class ChainInsightAssetOwner extends $tea.Model {
  // 持有者地址
  owner: string;
  // 合约地址
  contractAddr: string;
  // 资产ID
  assetId: string;
  // 数字权证链1155合约特有的分片ID
  shardId?: string;
  // 资产类型：ERC721 / ERC1155
  ercType: string;
  // 数字资产余额
  balance: number;
  // 该账户对该资产最近一次转让交易的哈希
  updateTxHash: string;
  // 该账户对该资产最近一次转让交易所在区块高度
  updateBlockHeight: number;
  // 该账户对该资产最近一次转让交易所在区块的创建时间，单位：毫秒
  updateBlockTime: number;
  static names(): { [key: string]: string } {
    return {
      owner: 'owner',
      contractAddr: 'contract_addr',
      assetId: 'asset_id',
      shardId: 'shard_id',
      ercType: 'erc_type',
      balance: 'balance',
      updateTxHash: 'update_tx_hash',
      updateBlockHeight: 'update_block_height',
      updateBlockTime: 'update_block_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      owner: 'string',
      contractAddr: 'string',
      assetId: 'string',
      shardId: 'string',
      ercType: 'string',
      balance: 'number',
      updateTxHash: 'string',
      updateBlockHeight: 'number',
      updateBlockTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 链上资产持有者信息响应
export class ChainInsightAssetOwnersResponse extends $tea.Model {
  // 页面大小
  pageSize: number;
  // 当前页码
  current: number;
  // 合计
  total: number;
  // 结果列表
  list: ChainInsightAssetOwner[];
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
      list: { 'type': 'array', 'itemType': ChainInsightAssetOwner },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 链上资产信息响应
export class ChainInsightAssetsResponse extends $tea.Model {
  // 页面大小
  pageSize: number;
  // 当前页码
  current: number;
  // 合计
  total: number;
  // 结果列表
  list: ChainInsightAsset[];
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
      list: { 'type': 'array', 'itemType': ChainInsightAsset },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 链上资产流转信息
export class ChainInsightAssetOperation extends $tea.Model {
  // 合约地址
  contractAddr: string;
  // 流转交易哈希
  txId: string;
  // 转让执行者地址，ERC1155资产会有
  operator?: string;
  // 资产转出地址
  from: string;
  // 资产转入地址
  to: string;
  // 资产ID
  assetId: string;
  // 数字权证链的1155资产的分片ID
  shardId?: string;
  // 资产转让数量
  assetValue: number;
  // 资产流转交易所在区块的创建时间，单位：毫秒
  timestamp: number;
  // 流转交易所在块高
  blockHeight: number;
  static names(): { [key: string]: string } {
    return {
      contractAddr: 'contract_addr',
      txId: 'tx_id',
      operator: 'operator',
      from: 'from',
      to: 'to',
      assetId: 'asset_id',
      shardId: 'shard_id',
      assetValue: 'asset_value',
      timestamp: 'timestamp',
      blockHeight: 'block_height',
    };
  }

  static types(): { [key: string]: any } {
    return {
      contractAddr: 'string',
      txId: 'string',
      operator: 'string',
      from: 'string',
      to: 'string',
      assetId: 'string',
      shardId: 'string',
      assetValue: 'number',
      timestamp: 'number',
      blockHeight: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 链上资产流转交易响应
export class ChainInsightAssetOperationsResponse extends $tea.Model {
  // 页面大小
  pageSize: number;
  // 当前页码
  current: number;
  // 合计
  total: number;
  // 结果列表
  list: ChainInsightAssetOperation[];
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
      list: { 'type': 'array', 'itemType': ChainInsightAssetOperation },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 资产合约信息
export class ChainInsightAssetContractInfo extends $tea.Model {
  // 资产类型：ERC721 / ERC1155
  ercType?: string;
  // 资产总量
  assetCount?: number;
  // 持有者总量
  ownerCount?: number;
  static names(): { [key: string]: string } {
    return {
      ercType: 'erc_type',
      assetCount: 'asset_count',
      ownerCount: 'owner_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ercType: 'string',
      assetCount: 'number',
      ownerCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 业务模型配置
export class DataModelConfig extends $tea.Model {
  // 对应的方法参数
  argName: string;
  // 方法参数位置，input / output
  argLocation: string;
  // 业务名称
  comment?: string;
  // 业务名称在交易时间轴是否可见
  visible?: boolean;
  static names(): { [key: string]: string } {
    return {
      argName: 'arg_name',
      argLocation: 'arg_location',
      comment: 'comment',
      visible: 'visible',
    };
  }

  static types(): { [key: string]: any } {
    return {
      argName: 'string',
      argLocation: 'string',
      comment: 'string',
      visible: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 链上地址（合约、存证账户）交易时间轴配置
export class AddressTimelineConfig extends $tea.Model {
  // 交易时间轴看板高度
  widgetHeight?: number;
  // 接口业务字段配置列表，更新时只需传入需要更新的方法
  interfaceDataModelConfigs?: InterfaceDataModelConfig[];
  static names(): { [key: string]: string } {
    return {
      widgetHeight: 'widget_height',
      interfaceDataModelConfigs: 'interface_data_model_configs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      widgetHeight: 'number',
      interfaceDataModelConfigs: { 'type': 'array', 'itemType': InterfaceDataModelConfig },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 接口业务字段配置
export class InterfaceDataModelConfig extends $tea.Model {
  // 接口名称
  name: string;
  // 接口签名，SOLIDITY 合约必填
  nameSig?: string;
  // 接口类型，当前 event 暂不支持。
  // function / deposit / event
  type: string;
  // 接口参数配置列表，保序传递。
  argConfigs?: DataModelConfig[];
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      nameSig: 'name_sig',
      type: 'type',
      argConfigs: 'arg_configs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      nameSig: 'string',
      type: 'string',
      argConfigs: { 'type': 'array', 'itemType': DataModelConfig },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合约接口参数列表
export class ChainInsightContractInterfaceArgumentList extends $tea.Model {
  // 合约接口参数列表
  list?: ChainInsightContractInterfaceArgument[];
  static names(): { [key: string]: string } {
    return {
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': ChainInsightContractInterfaceArgument },
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
  // 租户ID，留空
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      hexAddresses: 'hex_addresses',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      hexAddresses: { 'type': 'array', 'itemType': 'string' },
      tenantId: 'string',
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
  // 租户ID，留空
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      hexAddress: 'hex_address',
      label: 'label',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      hexAddress: 'string',
      label: ChainInsightAddressLabel,
      tenantId: 'string',
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
  // 租户ID，留空
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      unionId: 'union_id',
      bizIds: 'biz_ids',
      request: 'request',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      unionId: 'string',
      bizIds: { 'type': 'array', 'itemType': 'string' },
      request: ChainInsightSearchRequest,
      tenantId: 'string',
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
  // 租户ID，留空
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      hexAddress: 'hex_address',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      hexAddress: 'string',
      tenantId: 'string',
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
  // 租户ID，留空
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      txId: 'tx_id',
      teeKey: 'tee_key',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      txId: 'string',
      teeKey: 'string',
      tenantId: 'string',
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
  // 租户ID，留空
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      hexAddress: 'hex_address',
      ver: 'ver',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      hexAddress: 'string',
      ver: 'string',
      tenantId: 'string',
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
  // 租户ID，留空
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      hexAddress: 'hex_address',
      ver: 'ver',
      contractInterface: 'contract_interface',
      tenantId: 'tenant_id',
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
      tenantId: 'string',
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
  // 租户ID，留空
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      hexAddress: 'hex_address',
      ver: 'ver',
      contractInterface: 'contract_interface',
      interfaceArgument: 'interface_argument',
      tenantId: 'tenant_id',
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
      tenantId: 'string',
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
  // 租户ID，留空
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      hexAddress: 'hex_address',
      ver: 'ver',
      file: 'file',
      tenantId: 'tenant_id',
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
      tenantId: 'string',
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
  // 点集类型，枚举：Amount、Increment、GrowthRate，默认Amount
  type?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      hexAddress: 'hex_address',
      startTime: 'start_time',
      endTime: 'end_time',
      type: 'type',
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
      type: 'string',
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
  // 点集类型，枚举：Amount、Increment、GrowthRate，默认Amount
  type?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      hexAddress: 'hex_address',
      startTime: 'start_time',
      endTime: 'end_time',
      type: 'type',
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
      type: 'string',
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
  // 点集类型，枚举：Amount、Increment、GrowthRate，默认Amount
  type?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      unionId: 'union_id',
      bizId: 'biz_id',
      startTime: 'start_time',
      endTime: 'end_time',
      type: 'type',
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
      type: 'string',
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
  // 租户ID，留空
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      type: 'type',
      hexAddress: 'hex_address',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      type: 'string',
      hexAddress: 'string',
      tenantId: 'string',
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
  // 租户ID，留空
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      taskId: 'task_id',
      operation: 'operation',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      taskId: 'string',
      operation: 'string',
      tenantId: 'string',
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
  // 点集类型，枚举：Amount、Increment、GrowthRate，默认为Amount
  type?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      name: 'name',
      dimensions: 'dimensions',
      startTime: 'start_time',
      endTime: 'end_time',
      type: 'type',
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
      type: 'string',
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

export class OpenChaininsightDatasearchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联盟ID
  unionId: string;
  // 链ID
  bizId: string;
  // 租户ID，留空
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      unionId: 'union_id',
      bizId: 'biz_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      unionId: 'string',
      bizId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OpenChaininsightDatasearchResponse extends $tea.Model {
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

export class QueryChaininsightPrivatedatasearchstatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联盟ID
  unionId: string;
  // 租户ID，留空
  tenantId?: string;
  // 链ID列表
  bizIds?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      unionId: 'union_id',
      tenantId: 'tenant_id',
      bizIds: 'biz_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      unionId: 'string',
      tenantId: 'string',
      bizIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChaininsightPrivatedatasearchstatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链搜索状态列表
  result?: ChainInsightSearchStatus[];
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
      result: { 'type': 'array', 'itemType': ChainInsightSearchStatus },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddChaininsightWidgetsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联盟ID
  unionId: string;
  // 租户ID，留空
  tenantId?: string;
  // 数据洞察看板
  widget: ChainInsightWidget;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      unionId: 'union_id',
      tenantId: 'tenant_id',
      widget: 'widget',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      unionId: 'string',
      tenantId: 'string',
      widget: ChainInsightWidget,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddChaininsightWidgetsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据洞察看板
  result?: ChainInsightWidget;
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
      result: ChainInsightWidget,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListChaininsightWidgetsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联盟ID
  unionId: string;
  // 租户ID，留空
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      unionId: 'union_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      unionId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListChaininsightWidgetsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据洞察看板列表
  result?: ChainInsightWidget[];
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
      result: { 'type': 'array', 'itemType': ChainInsightWidget },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChaininsightTablesactivereceiverRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联盟ID
  unionId: string;
  // 链ID列表
  bizIds?: string[];
  // 时间范围，单位小时，默认24小时
  timeRange?: number;
  // 页码，默认1
  pageNo?: number;
  // 页面大小，默认10
  pageSize?: number;
  // 租户ID，留空
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      unionId: 'union_id',
      bizIds: 'biz_ids',
      timeRange: 'time_range',
      pageNo: 'page_no',
      pageSize: 'page_size',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      unionId: 'string',
      bizIds: { 'type': 'array', 'itemType': 'string' },
      timeRange: 'number',
      pageNo: 'number',
      pageSize: 'number',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChaininsightTablesactivereceiverResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据洞察链上活跃接收地址响应
  result?: ChainInsightActiveAddressesResponse;
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
      result: ChainInsightActiveAddressesResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChaininsightTablesactivesenderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联盟ID
  unionId: string;
  // 链ID列表
  bizIds?: string[];
  // 时间范围，单位小时，默认24小时
  timeRange?: number;
  // 页码，默认1
  pageNo?: number;
  // 页面大小，默认10
  pageSize?: number;
  // 租户ID，留空
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      unionId: 'union_id',
      bizIds: 'biz_ids',
      timeRange: 'time_range',
      pageNo: 'page_no',
      pageSize: 'page_size',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      unionId: 'string',
      bizIds: { 'type': 'array', 'itemType': 'string' },
      timeRange: 'number',
      pageNo: 'number',
      pageSize: 'number',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChaininsightTablesactivesenderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据洞察链上活跃发送地址响应
  result?: ChainInsightActiveAddressesResponse;
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
      result: ChainInsightActiveAddressesResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryChaininsightLatestcontractsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // 页码
  pageNo?: number;
  // 页面大小，默认为5
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      pageNo: 'page_no',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      pageNo: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryChaininsightLatestcontractsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  result?: ChainInsightTransactionInfoPageableResponse;
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
      result: ChainInsightTransactionInfoPageableResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryChaininsightLatesttxsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // 页面大小，默认为5
  pageSize?: number;
  // 页码，默认为1
  pageNo?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      pageSize: 'page_size',
      pageNo: 'page_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      pageSize: 'number',
      pageNo: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryChaininsightLatesttxsResponse extends $tea.Model {
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

export class QueryChaininsightPrivatechainsstatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联盟ID
  unionId: string;
  // 链ID列表
  bizIds?: string[];
  // 租户ID，留空
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      unionId: 'union_id',
      bizIds: 'biz_ids',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      unionId: 'string',
      bizIds: { 'type': 'array', 'itemType': 'string' },
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChaininsightPrivatechainsstatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  result?: ChainInsightChainStatus;
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
      result: ChainInsightChainStatus,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChaininsightPrivatechaintxhistogramRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联盟ID
  unionId: string;
  // 链ID列表
  bizIds: string[];
  // 开始时间戳
  startTime: number;
  // 结束时间戳
  endTime: number;
  // 点集类型，枚举：Amount、Increment、GrowthRate，默认为Amount
  type?: string;
  // 统计间隔
  interval?: number;
  // 枚举值，统计间隔的时间单位：Second / Hour / Day / Month / Year
  intervalUnit?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      unionId: 'union_id',
      bizIds: 'biz_ids',
      startTime: 'start_time',
      endTime: 'end_time',
      type: 'type',
      interval: 'interval',
      intervalUnit: 'interval_unit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      unionId: 'string',
      bizIds: { 'type': 'array', 'itemType': 'string' },
      startTime: 'number',
      endTime: 'number',
      type: 'string',
      interval: 'number',
      intervalUnit: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChaininsightPrivatechaintxhistogramResponse extends $tea.Model {
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

export class DeleteChaininsightWidgetsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联盟ID
  unionId: string;
  // 看板ID
  widgetId: string;
  // 租户ID，留空
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      unionId: 'union_id',
      widgetId: 'widget_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      unionId: 'string',
      widgetId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteChaininsightWidgetsResponse extends $tea.Model {
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

export class OperateChaininsightWidgetsmoveRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联盟ID
  unionId: string;
  // 看板ID
  widgetId: string;
  // 移动类型， 向上移动（MoveUp） / 向下移动（MoveDown）
  type: string;
  // 租户ID，留空
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      unionId: 'union_id',
      widgetId: 'widget_id',
      type: 'type',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      unionId: 'string',
      widgetId: 'string',
      type: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OperateChaininsightWidgetsmoveResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 移动后的看板列表
  result?: ChainInsightWidget[];
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
      result: { 'type': 'array', 'itemType': ChainInsightWidget },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateChaininsightWidgetsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联盟ID
  unionId: string;
  // 要修改的看板信息
  widget: ChainInsightWidget;
  // 租户ID，留空
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      unionId: 'union_id',
      widget: 'widget',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      unionId: 'string',
      widget: ChainInsightWidget,
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateChaininsightWidgetsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 修改后的看板信息
  result?: ChainInsightWidget;
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
      result: ChainInsightWidget,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DownloadChaininsightContractRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // 合约地址
  hexAddress: string;
  // 合约部署交易所在区块范围的最大值，默认为0，即小于当前区块
  height?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      hexAddress: 'hex_address',
      height: 'height',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      hexAddress: 'string',
      height: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DownloadChaininsightContractResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // base64编码的合约信息
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

export class PagequeryChaininsightContractmodifytxRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // 租户ID，留空
  tenantId?: string;
  // 合约地址
  hexAddress: string;
  // 页码，默认为1
  pageNo?: number;
  // 页面大小，默认为10
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      tenantId: 'tenant_id',
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
      tenantId: 'string',
      hexAddress: 'string',
      pageNo: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryChaininsightContractmodifytxResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  result?: ChainInsightTransactionInfoPageableResponse;
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
      result: ChainInsightTransactionInfoPageableResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryChaininsightAccountmodifytxRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // 账户地址
  hexAddress: string;
  // 页码，默认为1
  pageNo?: number;
  // 页面大小，默认为10
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

export class PagequeryChaininsightAccountmodifytxResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  result?: ChainInsightTransactionInfoPageableResponse;
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
      result: ChainInsightTransactionInfoPageableResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListChaininsightAssetinterfacesrequiredRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // ERC标准类型：ERC721 / ERC1155
  ercType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      ercType: 'erc_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      ercType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListChaininsightAssetinterfacesrequiredResponse extends $tea.Model {
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

export class QueryChaininsightStatisticassetdetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // 合约地址
  contract: string;
  // 资产ID
  assetId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      contract: 'contract',
      assetId: 'asset_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      contract: 'string',
      assetId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChaininsightStatisticassetdetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  result?: ChainInsightAsset;
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
      result: ChainInsightAsset,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChaininsightStatisticassetmetaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // 合约地址
  contract: string;
  // 资产ID
  assetId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      contract: 'contract',
      assetId: 'asset_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      contract: 'string',
      assetId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChaininsightStatisticassetmetaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  result?: ChainInsightAssetMeta;
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
      result: ChainInsightAssetMeta,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryChaininsightStatisticassetownerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // 合约地址
  contract: string;
  // 资产ID，可空，支持模糊搜索（既可以是assetId，也可以是数字权证链1155资产特有的shardId）
  assetId?: string;
  // 数字权证链1155合约的分片ID
  shardId?: string;
  // 页数，从 1 开始，缺省值为1
  pageNo?: number;
  // 页面大小，缺省值为10
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      contract: 'contract',
      assetId: 'asset_id',
      shardId: 'shard_id',
      pageNo: 'page_no',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      contract: 'string',
      assetId: 'string',
      shardId: 'string',
      pageNo: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryChaininsightStatisticassetownerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  result?: ChainInsightAssetOwnersResponse;
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
      result: ChainInsightAssetOwnersResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryChaininsightStatisticassetinventoryaccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // 账户地址
  account: string;
  // 资产ID，可空，支持模糊搜索（既可以是assetId，也可以是数字权证链1155资产特有的shardId）
  assetId?: string;
  // 页数，从1开始，缺省值为1
  pageNo?: number;
  // 页面大小，缺省值为10
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      account: 'account',
      assetId: 'asset_id',
      pageNo: 'page_no',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      account: 'string',
      assetId: 'string',
      pageNo: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryChaininsightStatisticassetinventoryaccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  result?: ChainInsightAssetsResponse;
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
      result: ChainInsightAssetsResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryChaininsightStatisticassethistoryassetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // 合约地址
  contract: string;
  // 资产ID，支持模糊搜索（既可以是assetId，也可以是数字权证链1155合约特有的shardId）
  assetId: string;
  // 分片ID，可空
  shardId?: string;
  // 页数，从 1 开始，缺省值为1
  pageNo?: number;
  // 页面大小，缺省值为10
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      contract: 'contract',
      assetId: 'asset_id',
      shardId: 'shard_id',
      pageNo: 'page_no',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      contract: 'string',
      assetId: 'string',
      shardId: 'string',
      pageNo: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryChaininsightStatisticassethistoryassetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  result?: ChainInsightAssetOperationsResponse;
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
      result: ChainInsightAssetOperationsResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryChaininsightStatisticassethistorycontractRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // 合约地址
  contract: string;
  // 资产ID，支持模糊搜索（既可以是assetId，也可以是数字权证链1155资产特有的shardId）
  assetId?: string;
  // 数字权证链1155资产的分片ID
  shardId?: string;
  // 页数，从 1 开始，缺省值：1
  pageNo?: number;
  // 页面大小，缺省值：10
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      contract: 'contract',
      assetId: 'asset_id',
      shardId: 'shard_id',
      pageNo: 'page_no',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      contract: 'string',
      assetId: 'string',
      shardId: 'string',
      pageNo: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryChaininsightStatisticassethistorycontractResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  result?: ChainInsightAssetOperationsResponse;
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
      result: ChainInsightAssetOperationsResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryChaininsightContracttimelineconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // 链上地址：合约 / 存证账户
  hexAddress: string;
  // 需要更新的区块高度（会更新生效区间包含该高度的时间轴配置）
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

export class QueryChaininsightContracttimelineconfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  result?: AddressTimelineConfig;
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
      result: AddressTimelineConfig,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateChaininsightContracttimelineconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // 链上地址：合约 / 存证账户
  hexAddress: string;
  // 需要更新的区块高度（会更新生效区间包含该高度的时间轴配置）
  ver: string;
  // 时间轴配置
  timelineConfig: AddressTimelineConfig;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      hexAddress: 'hex_address',
      ver: 'ver',
      timelineConfig: 'timeline_config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      hexAddress: 'string',
      ver: 'string',
      timelineConfig: AddressTimelineConfig,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateChaininsightContracttimelineconfigResponse extends $tea.Model {
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

export class SaveChaininsightContractinterfaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  bizId: string;
  // 合约 / 存证账户地址
  contract: string;
  // 生效块高
  ver?: string;
  // 接口类型，Function / Event
  interfaceType: string;
  // 接口列表
  contractInterfaces: ChainInsightContractInterface[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      contract: 'contract',
      ver: 'ver',
      interfaceType: 'interface_type',
      contractInterfaces: 'contract_interfaces',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      contract: 'string',
      ver: 'string',
      interfaceType: 'string',
      contractInterfaces: { 'type': 'array', 'itemType': ChainInsightContractInterface },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveChaininsightContractinterfaceResponse extends $tea.Model {
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
  // Aldaba 链节点地址
  aldabaNodes?: string[];
  // Aldaba 链使用的协议，支持 WebSocket / Tcp; 默认 WebSocket
  aldabaNetworkProtocol?: string;
  // Aldaba 链base64编码的JDS
  aldabaTlsRootTruststore?: string;
  // Aldaba 链 JDS 密码
  aldabaTlsRootTruststorePassword?: string;
  // Aldaba 链 base64编码的证书
  aldabaTlsClientCertificate?: string;
  // Aldaba 链 base64编码的密钥
  aldabaTlsClientKey?: string;
  // Aldaba 链密钥密码
  aldabaTlsClientKeyPassword?: string;
  // Aldaba 链 base64 编码的 sender 密钥
  aldabaSenderKey?: string;
  // Aldaba 链 sender 密钥的密码
  aldabaSenderKeyPassword?: string;
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
      aldabaNodes: 'aldaba_nodes',
      aldabaNetworkProtocol: 'aldaba_network_protocol',
      aldabaTlsRootTruststore: 'aldaba_tls_root_truststore',
      aldabaTlsRootTruststorePassword: 'aldaba_tls_root_truststore_password',
      aldabaTlsClientCertificate: 'aldaba_tls_client_certificate',
      aldabaTlsClientKey: 'aldaba_tls_client_key',
      aldabaTlsClientKeyPassword: 'aldaba_tls_client_key_password',
      aldabaSenderKey: 'aldaba_sender_key',
      aldabaSenderKeyPassword: 'aldaba_sender_key_password',
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
      aldabaNodes: { 'type': 'array', 'itemType': 'string' },
      aldabaNetworkProtocol: 'string',
      aldabaTlsRootTruststore: 'string',
      aldabaTlsRootTruststorePassword: 'string',
      aldabaTlsClientCertificate: 'string',
      aldabaTlsClientKey: 'string',
      aldabaTlsClientKeyPassword: 'string',
      aldabaSenderKey: 'string',
      aldabaSenderKeyPassword: 'string',
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
          sdk_version: "1.4.10",
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
   * Description: 开通数据搜索服务
   * Summary: 开通数据搜索服务
   */
  async openChaininsightDatasearch(request: OpenChaininsightDatasearchRequest): Promise<OpenChaininsightDatasearchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.openChaininsightDatasearchEx(request, headers, runtime);
  }

  /**
   * Description: 开通数据搜索服务
   * Summary: 开通数据搜索服务
   */
  async openChaininsightDatasearchEx(request: OpenChaininsightDatasearchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OpenChaininsightDatasearchResponse> {
    Util.validateModel(request);
    return $tea.cast<OpenChaininsightDatasearchResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.datasearch.open", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OpenChaininsightDatasearchResponse({}));
  }

  /**
   * Description: 私有化场景下查询所有链的数据搜索服务状态
   * Summary: 私有化场景下查询所有链的数据搜索服务状态
   */
  async queryChaininsightPrivatedatasearchstatus(request: QueryChaininsightPrivatedatasearchstatusRequest): Promise<QueryChaininsightPrivatedatasearchstatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryChaininsightPrivatedatasearchstatusEx(request, headers, runtime);
  }

  /**
   * Description: 私有化场景下查询所有链的数据搜索服务状态
   * Summary: 私有化场景下查询所有链的数据搜索服务状态
   */
  async queryChaininsightPrivatedatasearchstatusEx(request: QueryChaininsightPrivatedatasearchstatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryChaininsightPrivatedatasearchstatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryChaininsightPrivatedatasearchstatusResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.privatedatasearchstatus.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryChaininsightPrivatedatasearchstatusResponse({}));
  }

  /**
   * Description: 添加看板
   * Summary: 添加看板
   */
  async addChaininsightWidgets(request: AddChaininsightWidgetsRequest): Promise<AddChaininsightWidgetsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addChaininsightWidgetsEx(request, headers, runtime);
  }

  /**
   * Description: 添加看板
   * Summary: 添加看板
   */
  async addChaininsightWidgetsEx(request: AddChaininsightWidgetsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddChaininsightWidgetsResponse> {
    Util.validateModel(request);
    return $tea.cast<AddChaininsightWidgetsResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.widgets.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddChaininsightWidgetsResponse({}));
  }

  /**
   * Description: 获取看板列表
   * Summary: 获取看板列表
   */
  async listChaininsightWidgets(request: ListChaininsightWidgetsRequest): Promise<ListChaininsightWidgetsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listChaininsightWidgetsEx(request, headers, runtime);
  }

  /**
   * Description: 获取看板列表
   * Summary: 获取看板列表
   */
  async listChaininsightWidgetsEx(request: ListChaininsightWidgetsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListChaininsightWidgetsResponse> {
    Util.validateModel(request);
    return $tea.cast<ListChaininsightWidgetsResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.widgets.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListChaininsightWidgetsResponse({}));
  }

  /**
   * Description: 分页查询链上活跃接收地址
   * Summary: 分页查询链上活跃接收地址
   */
  async queryChaininsightTablesactivereceiver(request: QueryChaininsightTablesactivereceiverRequest): Promise<QueryChaininsightTablesactivereceiverResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryChaininsightTablesactivereceiverEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询链上活跃接收地址
   * Summary: 分页查询链上活跃接收地址
   */
  async queryChaininsightTablesactivereceiverEx(request: QueryChaininsightTablesactivereceiverRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryChaininsightTablesactivereceiverResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryChaininsightTablesactivereceiverResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.tablesactivereceiver.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryChaininsightTablesactivereceiverResponse({}));
  }

  /**
   * Description: 分页查询链上活跃发送地址
   * Summary: 分页查询链上活跃发送地址
   */
  async queryChaininsightTablesactivesender(request: QueryChaininsightTablesactivesenderRequest): Promise<QueryChaininsightTablesactivesenderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryChaininsightTablesactivesenderEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询链上活跃发送地址
   * Summary: 分页查询链上活跃发送地址
   */
  async queryChaininsightTablesactivesenderEx(request: QueryChaininsightTablesactivesenderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryChaininsightTablesactivesenderResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryChaininsightTablesactivesenderResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.tablesactivesender.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryChaininsightTablesactivesenderResponse({}));
  }

  /**
   * Description: 分页查询链上近期合约
   * Summary: 分页查询链上近期合约
   */
  async pagequeryChaininsightLatestcontracts(request: PagequeryChaininsightLatestcontractsRequest): Promise<PagequeryChaininsightLatestcontractsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryChaininsightLatestcontractsEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询链上近期合约
   * Summary: 分页查询链上近期合约
   */
  async pagequeryChaininsightLatestcontractsEx(request: PagequeryChaininsightLatestcontractsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryChaininsightLatestcontractsResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryChaininsightLatestcontractsResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.latestcontracts.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryChaininsightLatestcontractsResponse({}));
  }

  /**
   * Description: 分页查询链上近期交易
   * Summary: 分页查询链上近期交易
   */
  async pagequeryChaininsightLatesttxs(request: PagequeryChaininsightLatesttxsRequest): Promise<PagequeryChaininsightLatesttxsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryChaininsightLatesttxsEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询链上近期交易
   * Summary: 分页查询链上近期交易
   */
  async pagequeryChaininsightLatesttxsEx(request: PagequeryChaininsightLatesttxsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryChaininsightLatesttxsResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryChaininsightLatesttxsResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.latesttxs.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryChaininsightLatesttxsResponse({}));
  }

  /**
   * Description: 私有化场景下查询区块链整体状态
   * Summary: 私有化场景下查询区块链整体状态
   */
  async queryChaininsightPrivatechainsstatus(request: QueryChaininsightPrivatechainsstatusRequest): Promise<QueryChaininsightPrivatechainsstatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryChaininsightPrivatechainsstatusEx(request, headers, runtime);
  }

  /**
   * Description: 私有化场景下查询区块链整体状态
   * Summary: 私有化场景下查询区块链整体状态
   */
  async queryChaininsightPrivatechainsstatusEx(request: QueryChaininsightPrivatechainsstatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryChaininsightPrivatechainsstatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryChaininsightPrivatechainsstatusResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.privatechainsstatus.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryChaininsightPrivatechainsstatusResponse({}));
  }

  /**
   * Description: 私有化场景下查询链交易数量趋势
   * Summary: 私有化场景下查询链交易数量趋势
   */
  async queryChaininsightPrivatechaintxhistogram(request: QueryChaininsightPrivatechaintxhistogramRequest): Promise<QueryChaininsightPrivatechaintxhistogramResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryChaininsightPrivatechaintxhistogramEx(request, headers, runtime);
  }

  /**
   * Description: 私有化场景下查询链交易数量趋势
   * Summary: 私有化场景下查询链交易数量趋势
   */
  async queryChaininsightPrivatechaintxhistogramEx(request: QueryChaininsightPrivatechaintxhistogramRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryChaininsightPrivatechaintxhistogramResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryChaininsightPrivatechaintxhistogramResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.privatechaintxhistogram.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryChaininsightPrivatechaintxhistogramResponse({}));
  }

  /**
   * Description: 删除数据洞察看板
   * Summary: 删除数据洞察看板
   */
  async deleteChaininsightWidgets(request: DeleteChaininsightWidgetsRequest): Promise<DeleteChaininsightWidgetsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteChaininsightWidgetsEx(request, headers, runtime);
  }

  /**
   * Description: 删除数据洞察看板
   * Summary: 删除数据洞察看板
   */
  async deleteChaininsightWidgetsEx(request: DeleteChaininsightWidgetsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteChaininsightWidgetsResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteChaininsightWidgetsResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.widgets.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteChaininsightWidgetsResponse({}));
  }

  /**
   * Description: 移动看板
   * Summary: 移动看板
   */
  async operateChaininsightWidgetsmove(request: OperateChaininsightWidgetsmoveRequest): Promise<OperateChaininsightWidgetsmoveResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.operateChaininsightWidgetsmoveEx(request, headers, runtime);
  }

  /**
   * Description: 移动看板
   * Summary: 移动看板
   */
  async operateChaininsightWidgetsmoveEx(request: OperateChaininsightWidgetsmoveRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OperateChaininsightWidgetsmoveResponse> {
    Util.validateModel(request);
    return $tea.cast<OperateChaininsightWidgetsmoveResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.widgetsmove.operate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OperateChaininsightWidgetsmoveResponse({}));
  }

  /**
   * Description: 修改看板
   * Summary: 修改看板
   */
  async updateChaininsightWidgets(request: UpdateChaininsightWidgetsRequest): Promise<UpdateChaininsightWidgetsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateChaininsightWidgetsEx(request, headers, runtime);
  }

  /**
   * Description: 修改看板
   * Summary: 修改看板
   */
  async updateChaininsightWidgetsEx(request: UpdateChaininsightWidgetsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateChaininsightWidgetsResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateChaininsightWidgetsResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.widgets.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateChaininsightWidgetsResponse({}));
  }

  /**
   * Description: 下载合约
   * Summary: 下载合约
   */
  async downloadChaininsightContract(request: DownloadChaininsightContractRequest): Promise<DownloadChaininsightContractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.downloadChaininsightContractEx(request, headers, runtime);
  }

  /**
   * Description: 下载合约
   * Summary: 下载合约
   */
  async downloadChaininsightContractEx(request: DownloadChaininsightContractRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DownloadChaininsightContractResponse> {
    Util.validateModel(request);
    return $tea.cast<DownloadChaininsightContractResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.contract.download", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DownloadChaininsightContractResponse({}));
  }

  /**
   * Description: 查询修改合约的交易
   * Summary: 查询修改合约的交易
   */
  async pagequeryChaininsightContractmodifytx(request: PagequeryChaininsightContractmodifytxRequest): Promise<PagequeryChaininsightContractmodifytxResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryChaininsightContractmodifytxEx(request, headers, runtime);
  }

  /**
   * Description: 查询修改合约的交易
   * Summary: 查询修改合约的交易
   */
  async pagequeryChaininsightContractmodifytxEx(request: PagequeryChaininsightContractmodifytxRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryChaininsightContractmodifytxResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryChaininsightContractmodifytxResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.contractmodifytx.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryChaininsightContractmodifytxResponse({}));
  }

  /**
   * Description: 分页查询账户的修改交易
   * Summary: 分页查询账户的修改交易
   */
  async pagequeryChaininsightAccountmodifytx(request: PagequeryChaininsightAccountmodifytxRequest): Promise<PagequeryChaininsightAccountmodifytxResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryChaininsightAccountmodifytxEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询账户的修改交易
   * Summary: 分页查询账户的修改交易
   */
  async pagequeryChaininsightAccountmodifytxEx(request: PagequeryChaininsightAccountmodifytxRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryChaininsightAccountmodifytxResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryChaininsightAccountmodifytxResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.accountmodifytx.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryChaininsightAccountmodifytxResponse({}));
  }

  /**
   * Description: 返回对应 ERC 类型资产统计所必须的接口
   * Summary: 查询资产统计所必须的接口
   */
  async listChaininsightAssetinterfacesrequired(request: ListChaininsightAssetinterfacesrequiredRequest): Promise<ListChaininsightAssetinterfacesrequiredResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listChaininsightAssetinterfacesrequiredEx(request, headers, runtime);
  }

  /**
   * Description: 返回对应 ERC 类型资产统计所必须的接口
   * Summary: 查询资产统计所必须的接口
   */
  async listChaininsightAssetinterfacesrequiredEx(request: ListChaininsightAssetinterfacesrequiredRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListChaininsightAssetinterfacesrequiredResponse> {
    Util.validateModel(request);
    return $tea.cast<ListChaininsightAssetinterfacesrequiredResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.assetinterfacesrequired.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListChaininsightAssetinterfacesrequiredResponse({}));
  }

  /**
   * Description: 查询链上资产的详情
   * Summary: 查询资产详情
   */
  async queryChaininsightStatisticassetdetail(request: QueryChaininsightStatisticassetdetailRequest): Promise<QueryChaininsightStatisticassetdetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryChaininsightStatisticassetdetailEx(request, headers, runtime);
  }

  /**
   * Description: 查询链上资产的详情
   * Summary: 查询资产详情
   */
  async queryChaininsightStatisticassetdetailEx(request: QueryChaininsightStatisticassetdetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryChaininsightStatisticassetdetailResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryChaininsightStatisticassetdetailResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.statisticassetdetail.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryChaininsightStatisticassetdetailResponse({}));
  }

  /**
   * Description: 查询链上资产合约中资产的元信息
   * Summary: 查询链上资产元信息
   */
  async queryChaininsightStatisticassetmeta(request: QueryChaininsightStatisticassetmetaRequest): Promise<QueryChaininsightStatisticassetmetaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryChaininsightStatisticassetmetaEx(request, headers, runtime);
  }

  /**
   * Description: 查询链上资产合约中资产的元信息
   * Summary: 查询链上资产元信息
   */
  async queryChaininsightStatisticassetmetaEx(request: QueryChaininsightStatisticassetmetaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryChaininsightStatisticassetmetaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryChaininsightStatisticassetmetaResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.statisticassetmeta.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryChaininsightStatisticassetmetaResponse({}));
  }

  /**
   * Description: 分页查询链上资产合约中资产的持有者信息，按最近一次交易时间降序
   * Summary: 查询链上资产的持有者信息
   */
  async pagequeryChaininsightStatisticassetowner(request: PagequeryChaininsightStatisticassetownerRequest): Promise<PagequeryChaininsightStatisticassetownerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryChaininsightStatisticassetownerEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询链上资产合约中资产的持有者信息，按最近一次交易时间降序
   * Summary: 查询链上资产的持有者信息
   */
  async pagequeryChaininsightStatisticassetownerEx(request: PagequeryChaininsightStatisticassetownerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryChaininsightStatisticassetownerResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryChaininsightStatisticassetownerResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.statisticassetowner.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryChaininsightStatisticassetownerResponse({}));
  }

  /**
   * Description: 分页查询链上账户的资产列表，按最近一次交易时间降序
   * Summary: 查询链上账户的资产列表
   */
  async pagequeryChaininsightStatisticassetinventoryaccount(request: PagequeryChaininsightStatisticassetinventoryaccountRequest): Promise<PagequeryChaininsightStatisticassetinventoryaccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryChaininsightStatisticassetinventoryaccountEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询链上账户的资产列表，按最近一次交易时间降序
   * Summary: 查询链上账户的资产列表
   */
  async pagequeryChaininsightStatisticassetinventoryaccountEx(request: PagequeryChaininsightStatisticassetinventoryaccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryChaininsightStatisticassetinventoryaccountResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryChaininsightStatisticassetinventoryaccountResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.statisticassetinventoryaccount.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryChaininsightStatisticassetinventoryaccountResponse({}));
  }

  /**
   * Description: 分页查询链上资产合约中资产的流转信息，按交易时间降序
   * Summary: 查询链上资产的流转信息
   */
  async pagequeryChaininsightStatisticassethistoryasset(request: PagequeryChaininsightStatisticassethistoryassetRequest): Promise<PagequeryChaininsightStatisticassethistoryassetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryChaininsightStatisticassethistoryassetEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询链上资产合约中资产的流转信息，按交易时间降序
   * Summary: 查询链上资产的流转信息
   */
  async pagequeryChaininsightStatisticassethistoryassetEx(request: PagequeryChaininsightStatisticassethistoryassetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryChaininsightStatisticassethistoryassetResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryChaininsightStatisticassethistoryassetResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.statisticassethistoryasset.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryChaininsightStatisticassethistoryassetResponse({}));
  }

  /**
   * Description: 分页查询链上资产合约的资产流转信息，按交易时间降序
   * Summary: 查询链上资产合约的资产流转信息
   */
  async pagequeryChaininsightStatisticassethistorycontract(request: PagequeryChaininsightStatisticassethistorycontractRequest): Promise<PagequeryChaininsightStatisticassethistorycontractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryChaininsightStatisticassethistorycontractEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询链上资产合约的资产流转信息，按交易时间降序
   * Summary: 查询链上资产合约的资产流转信息
   */
  async pagequeryChaininsightStatisticassethistorycontractEx(request: PagequeryChaininsightStatisticassethistorycontractRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryChaininsightStatisticassethistorycontractResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryChaininsightStatisticassethistorycontractResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.statisticassethistorycontract.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryChaininsightStatisticassethistorycontractResponse({}));
  }

  /**
   * Description: 列出链上地址（合约 / 存证账户）的时间轴配置
   * Summary: 列出链上地址的时间轴配置
   */
  async queryChaininsightContracttimelineconfig(request: QueryChaininsightContracttimelineconfigRequest): Promise<QueryChaininsightContracttimelineconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryChaininsightContracttimelineconfigEx(request, headers, runtime);
  }

  /**
   * Description: 列出链上地址（合约 / 存证账户）的时间轴配置
   * Summary: 列出链上地址的时间轴配置
   */
  async queryChaininsightContracttimelineconfigEx(request: QueryChaininsightContracttimelineconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryChaininsightContracttimelineconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryChaininsightContracttimelineconfigResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.contracttimelineconfig.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryChaininsightContracttimelineconfigResponse({}));
  }

  /**
   * Description: 更新链上地址（合约 / 存证账户）的时间轴配置
   * Summary: 更新链上地址的时间轴配置
   */
  async updateChaininsightContracttimelineconfig(request: UpdateChaininsightContracttimelineconfigRequest): Promise<UpdateChaininsightContracttimelineconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateChaininsightContracttimelineconfigEx(request, headers, runtime);
  }

  /**
   * Description: 更新链上地址（合约 / 存证账户）的时间轴配置
   * Summary: 更新链上地址的时间轴配置
   */
  async updateChaininsightContracttimelineconfigEx(request: UpdateChaininsightContracttimelineconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateChaininsightContracttimelineconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateChaininsightContracttimelineconfigResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.contracttimelineconfig.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateChaininsightContracttimelineconfigResponse({}));
  }

  /**
   * Description: 重写接口参数配置
   * Summary: 重写接口参数配置
   */
  async saveChaininsightContractinterface(request: SaveChaininsightContractinterfaceRequest): Promise<SaveChaininsightContractinterfaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveChaininsightContractinterfaceEx(request, headers, runtime);
  }

  /**
   * Description: 重写接口参数配置
   * Summary: 重写接口参数配置
   */
  async saveChaininsightContractinterfaceEx(request: SaveChaininsightContractinterfaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveChaininsightContractinterfaceResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveChaininsightContractinterfaceResponse>(await this.doRequest("1.0", "antchain.baasdatagw.chaininsight.contractinterface.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveChaininsightContractinterfaceResponse({}));
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
