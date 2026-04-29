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

// 数据授权服务审批流程节点结构体
export class ProcessNode extends $tea.Model {
  // 审批节点ID
  nodeId: string;
  // 节点名称
  nodeName: string;
  // 节点序号，从1开始编号
  nodeNum: number;
  static names(): { [key: string]: string } {
    return {
      nodeId: 'node_id',
      nodeName: 'node_name',
      nodeNum: 'node_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      nodeId: 'string',
      nodeName: 'string',
      nodeNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 蚂蚁链浏览器合约链交易内容
export class BlockchainBrowserTransactionContract extends $tea.Model {
  // data
  data: string;
  // from
  from: string;
  // to
  to: string;
  // gas
  gas: number;
  // hash
  hash: string;
  // nonce
  nonce: string;
  // period
  period: number;
  // signature_list
  signatureList: string[];
  // timestamp
  timestamp: number;
  // transaction_type
  transactionType: string;
  // value
  value: number;
  static names(): { [key: string]: string } {
    return {
      data: 'data',
      from: 'from',
      to: 'to',
      gas: 'gas',
      hash: 'hash',
      nonce: 'nonce',
      period: 'period',
      signatureList: 'signature_list',
      timestamp: 'timestamp',
      transactionType: 'transaction_type',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      data: 'string',
      from: 'string',
      to: 'string',
      gas: 'number',
      hash: 'string',
      nonce: 'string',
      period: 'number',
      signatureList: { 'type': 'array', 'itemType': 'string' },
      timestamp: 'number',
      transactionType: 'string',
      value: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// TriggerLogDTO类成员
export class PositionStructBody extends $tea.Model {
  // 错误计数
  errorCount?: string;
  // 高度
  height?: string;
  // 序号
  index?: string;
  // 最后一个错误
  lastError?: string;
  // 类型
  type?: string;
  static names(): { [key: string]: string } {
    return {
      errorCount: 'error_count',
      height: 'height',
      index: 'index',
      lastError: 'last_error',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      errorCount: 'string',
      height: 'string',
      index: 'string',
      lastError: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 授权服务参与方结构体
export class Participant extends $tea.Model {
  // 业务系统唯一标示
  bizUid?: string;
  // 区块链ID
  blockchainId?: string;
  // 创建时间
  createTime: number;
  // 信用代码
  creditNumber?: string;
  // 扩展信息，标准JSON格式
  extensionInfo?: string;
  // 参与方名字
  name: string;
  // 回调通知服务地址
  notificationService?: string;
  // 参与方ID
  participantId: string;
  // DID  doc中的公开信息
  publicInfo?: string;
  // 参与方角色列表
  role: string[];
  // 空间ID
  spaceId?: string;
  // 参与方状态
  status?: string;
  // 更新时间
  updateTime: number;
  // 账户名称
  account?: string;
  static names(): { [key: string]: string } {
    return {
      bizUid: 'biz_uid',
      blockchainId: 'blockchain_id',
      createTime: 'create_time',
      creditNumber: 'credit_number',
      extensionInfo: 'extension_info',
      name: 'name',
      notificationService: 'notification_service',
      participantId: 'participant_id',
      publicInfo: 'public_info',
      role: 'role',
      spaceId: 'space_id',
      status: 'status',
      updateTime: 'update_time',
      account: 'account',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizUid: 'string',
      blockchainId: 'string',
      createTime: 'number',
      creditNumber: 'string',
      extensionInfo: 'string',
      name: 'string',
      notificationService: 'string',
      participantId: 'string',
      publicInfo: 'string',
      role: { 'type': 'array', 'itemType': 'string' },
      spaceId: 'string',
      status: 'string',
      updateTime: 'number',
      account: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合约绑定关系
export class ContractBindResp extends $tea.Model {
  // 合约标识
  serviceId?: string;
  // 合约名称
  name?: string;
  // 是否已关联
  bind?: boolean;
  static names(): { [key: string]: string } {
    return {
      serviceId: 'service_id',
      name: 'name',
      bind: 'bind',
    };
  }

  static types(): { [key: string]: any } {
    return {
      serviceId: 'string',
      name: 'string',
      bind: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 节点类型
export class CrowdNodeTypeEnum extends $tea.Model {
  // 组合节点
  group?: string;
  // 条件节点
  condition?: string;
  static names(): { [key: string]: string } {
    return {
      group: 'group',
      condition: 'condition',
    };
  }

  static types(): { [key: string]: any } {
    return {
      group: 'string',
      condition: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 任务列表返回体
export class TaskListInfoDTO extends $tea.Model {
  // 任务名称
  taskName: string;
  // 任务ID
  taskId: string;
  // appId
  appId: string;
  // 自有ID
  surveyId: string;
  // 租户ID
  tenantId: string;
  // 租户名称
  tenantName: string;
  // 操作员
  operator: string;
  // 样本数量
  sampleNum: number;
  // 完成数量
  completedNum: number;
  // 甄别数量
  screenNum: number;
  // 样本总金额
  sampleTotalAmount: string;
  // 全额红包总金额
  redPacketTotalAmount: string;
  // 该任务总金额
  taskTotalAmount: string;
  // 全额红包金额
  fullRedPacketAmount: string;
  // 甄别红包金额
  examineRedPacketAmount: string;
  // 发证量
  issuedNum?: number;
  // 产品下单code类型（1-资源包 2-后付费）
  productCodeType: string;
  // 审核理由
  reviewContent?: string;
  // 任务状态：0-已删、1-已完成、2-审核未通过、3-暂停、4-投放中、5-暂停中未重启、6、投放中未暂停、7-投放中未调整、8-投放中未完成、9-待投放、10-草稿任务
  status: string;
  // ap状态，1:启用，0：审批中
  apStatus: string;
  // 奖励渠道（0-手动发支付宝余额 1-海豚红包 2-问卷自带）
  prizeChannel: number;
  // 奖励渠道为问卷自带时，全额红包信息
  fullRedPacketTextInfo?: string;
  // 修改时间
  gmtModified: string;
  // 创建时间
  gmtCreate: string;
  // 投放时间
  gmtOnline?: string;
  // 最近暂停/完成时间
  gmtPauseOrComplete?: string;
  // 最近一轮用时（h）
  lastRoundTime?: number;
  static names(): { [key: string]: string } {
    return {
      taskName: 'task_name',
      taskId: 'task_id',
      appId: 'app_id',
      surveyId: 'survey_id',
      tenantId: 'tenant_id',
      tenantName: 'tenant_name',
      operator: 'operator',
      sampleNum: 'sample_num',
      completedNum: 'completed_num',
      screenNum: 'screen_num',
      sampleTotalAmount: 'sample_total_amount',
      redPacketTotalAmount: 'red_packet_total_amount',
      taskTotalAmount: 'task_total_amount',
      fullRedPacketAmount: 'full_red_packet_amount',
      examineRedPacketAmount: 'examine_red_packet_amount',
      issuedNum: 'issued_num',
      productCodeType: 'product_code_type',
      reviewContent: 'review_content',
      status: 'status',
      apStatus: 'ap_status',
      prizeChannel: 'prize_channel',
      fullRedPacketTextInfo: 'full_red_packet_text_info',
      gmtModified: 'gmt_modified',
      gmtCreate: 'gmt_create',
      gmtOnline: 'gmt_online',
      gmtPauseOrComplete: 'gmt_pause_or_complete',
      lastRoundTime: 'last_round_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      taskName: 'string',
      taskId: 'string',
      appId: 'string',
      surveyId: 'string',
      tenantId: 'string',
      tenantName: 'string',
      operator: 'string',
      sampleNum: 'number',
      completedNum: 'number',
      screenNum: 'number',
      sampleTotalAmount: 'string',
      redPacketTotalAmount: 'string',
      taskTotalAmount: 'string',
      fullRedPacketAmount: 'string',
      examineRedPacketAmount: 'string',
      issuedNum: 'number',
      productCodeType: 'string',
      reviewContent: 'string',
      status: 'string',
      apStatus: 'string',
      prizeChannel: 'number',
      fullRedPacketTextInfo: 'string',
      gmtModified: 'string',
      gmtCreate: 'string',
      gmtOnline: 'string',
      gmtPauseOrComplete: 'string',
      lastRoundTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云联盟成员信息
export class ALiYunMember extends $tea.Model {
  // 加入时间
  joinTime?: number;
  // 成员id
  memberId?: string;
  // 成员名称
  memberName?: string;
  // 角色
  role?: string;
  // 状态
  status?: string;
  static names(): { [key: string]: string } {
    return {
      joinTime: 'join_time',
      memberId: 'member_id',
      memberName: 'member_name',
      role: 'role',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      joinTime: 'number',
      memberId: 'string',
      memberName: 'string',
      role: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 对客展示信息
export class DisplayInfo extends $tea.Model {
  // 权益名称
  benefitName?: string;
  // 展示金额文案
  showAmountText?: string;
  // 门槛金额文案
  thresholdAmountText?: string;
  // 使用说明
  benefitUsageDesc?: string;
  // 规则描述
  benefitRuleDesc?: string;
  static names(): { [key: string]: string } {
    return {
      benefitName: 'benefit_name',
      showAmountText: 'show_amount_text',
      thresholdAmountText: 'threshold_amount_text',
      benefitUsageDesc: 'benefit_usage_desc',
      benefitRuleDesc: 'benefit_rule_desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      benefitName: 'string',
      showAmountText: 'string',
      thresholdAmountText: 'string',
      benefitUsageDesc: 'string',
      benefitRuleDesc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用授权列表
export class ApplicationPageListResp extends $tea.Model {
  // 应用标识
  applicationId?: string;
  // 链ID
  accessKey?: string;
  // 合约(创建实例时填写的合约名称。)
  nameList?: string[];
  static names(): { [key: string]: string } {
    return {
      applicationId: 'application_id',
      accessKey: 'access_key',
      nameList: 'name_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      applicationId: 'string',
      accessKey: 'string',
      nameList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 实例进度信息
export class InstanceProgressInfo extends $tea.Model {
  // 操作人
  operator?: string;
  // 操作时间
  time?: number;
  // 合约部署进度类型
  type?: string;
  // 部署状态
  status?: string;
  // 合约部署进度名称
  typeName?: string;
  // 额外参数
  data?: string;
  static names(): { [key: string]: string } {
    return {
      operator: 'operator',
      time: 'time',
      type: 'type',
      status: 'status',
      typeName: 'type_name',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      operator: 'string',
      time: 'number',
      type: 'string',
      status: 'string',
      typeName: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 授权服务数据模型结构体
export class DataModel extends $tea.Model {
  // 业务系统唯一标示
  bizUid?: string;
  // 空间ID
  spaceId: string;
  // 创建时间
  createTime: number;
  // 数据模型描述
  description?: string;
  // 模型字段详细信息
  fieldDetail: string;
  // 数据模型业务ID
  modelBizId?: string;
  // 数据模型ID
  modelId: string;
  // 数据模型名称
  name: string;
  // 提交人
  submitter: Participant;
  // 更新时间
  updateTime: number;
  // 状态
  status: string;
  static names(): { [key: string]: string } {
    return {
      bizUid: 'biz_uid',
      spaceId: 'space_id',
      createTime: 'create_time',
      description: 'description',
      fieldDetail: 'field_detail',
      modelBizId: 'model_biz_id',
      modelId: 'model_id',
      name: 'name',
      submitter: 'submitter',
      updateTime: 'update_time',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizUid: 'string',
      spaceId: 'string',
      createTime: 'number',
      description: 'string',
      fieldDetail: 'string',
      modelBizId: 'string',
      modelId: 'string',
      name: 'string',
      submitter: Participant,
      updateTime: 'number',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 授权流程节点详细信息
export class NodeDetail extends $tea.Model {
  // 节点审批意见
  comment: string;
  // 节点ID
  nodeId: string;
  // 节点名称
  nodeName: string;
  // 节点状态
  nodeStatus: string;
  // 节点审批时间
  operateTime: number;
  // 扩展参数
  extensionInfo?: string;
  static names(): { [key: string]: string } {
    return {
      comment: 'comment',
      nodeId: 'node_id',
      nodeName: 'node_name',
      nodeStatus: 'node_status',
      operateTime: 'operate_time',
      extensionInfo: 'extension_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      comment: 'string',
      nodeId: 'string',
      nodeName: 'string',
      nodeStatus: 'string',
      operateTime: 'number',
      extensionInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合约链配置信息结果
export class ContractIdeConfig extends $tea.Model {
  // 合约链的一个已创建的测试账户
  accountName: string;
  // 区块链唯一标识
  bizid: string;
  // 合约链的名字
  chainName: string;
  // 目标合约链的host地址
  host: string;
  // 说明是否开启wasm合约功能
  isWasm?: boolean;
  // 目标合约链服务公开的端口号
  port: string;
  // 合约链已创建的测试账户的密钥
  privateKey: string;
  // 如果是TEE硬件隐私合约链，会包含此字段内容
  rsaPublicKey?: string;
  // 合约链的版本说明
  version?: string;
  static names(): { [key: string]: string } {
    return {
      accountName: 'account_name',
      bizid: 'bizid',
      chainName: 'chain_name',
      host: 'host',
      isWasm: 'is_wasm',
      port: 'port',
      privateKey: 'private_key',
      rsaPublicKey: 'rsa_public_key',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accountName: 'string',
      bizid: 'string',
      chainName: 'string',
      host: 'string',
      isWasm: 'boolean',
      port: 'string',
      privateKey: 'string',
      rsaPublicKey: 'string',
      version: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// {"key":"value"}
export class KeyValuePair extends $tea.Model {
  // 键名
  key: string;
  // 值
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

// 日志存储类型
export class TriggerLogDTOStructBody extends $tea.Model {
  // 创建时间
  createTime?: string;
  // 修改时间
  modifyTime?: string;
  // 状态
  status?: string;
  // uuid
  uuid?: string;
  // 位置
  position?: PositionStructBody;
  static names(): { [key: string]: string } {
    return {
      createTime: 'create_time',
      modifyTime: 'modify_time',
      status: 'status',
      uuid: 'uuid',
      position: 'position',
    };
  }

  static types(): { [key: string]: any } {
    return {
      createTime: 'string',
      modifyTime: 'string',
      status: 'string',
      uuid: 'string',
      position: PositionStructBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合约类型
export class ContractTypeListResp extends $tea.Model {
  // 名称
  name?: string;
  // 值
  value?: string;
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

// 蚂蚁链浏览器交易信息
export class BlockchainBrowserTransaction extends $tea.Model {
  // bizid
  bizid: string;
  // block_hash
  blockHash: string;
  // category
  category: number;
  // create_time
  createTime: number;
  // from
  from: string;
  // gas_used
  gasUsed: number;
  // hash
  hash: string;
  // height
  height: number;
  // reference_count
  referenceCount: number;
  // to
  to: string;
  // transaction_type
  transactionType: string;
  // block_version
  blockVersion: number;
  // blockchain_name
  blockchainName: string;
  // blockchain_status
  blockchainStatus: boolean;
  // content
  content: string;
  // hash_status
  hashStatus: boolean;
  // type
  type: number;
  // transaction_contract
  transactionContract: BlockchainBrowserTransactionContract;
  static names(): { [key: string]: string } {
    return {
      bizid: 'bizid',
      blockHash: 'block_hash',
      category: 'category',
      createTime: 'create_time',
      from: 'from',
      gasUsed: 'gas_used',
      hash: 'hash',
      height: 'height',
      referenceCount: 'reference_count',
      to: 'to',
      transactionType: 'transaction_type',
      blockVersion: 'block_version',
      blockchainName: 'blockchain_name',
      blockchainStatus: 'blockchain_status',
      content: 'content',
      hashStatus: 'hash_status',
      type: 'type',
      transactionContract: 'transaction_contract',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizid: 'string',
      blockHash: 'string',
      category: 'number',
      createTime: 'number',
      from: 'string',
      gasUsed: 'number',
      hash: 'string',
      height: 'number',
      referenceCount: 'number',
      to: 'string',
      transactionType: 'string',
      blockVersion: 'number',
      blockchainName: 'string',
      blockchainStatus: 'boolean',
      content: 'string',
      hashStatus: 'boolean',
      type: 'number',
      transactionContract: BlockchainBrowserTransactionContract,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 结算详细信息
export class SettleDetailInfo extends $tea.Model {
  // 结算收款方账户类型
  transInType: string;
  // 结算收款方
  transIn: string;
  // 结算汇总维度
  summaryDimension?: string;
  // 结算主体类型
  settleEntityType?: string;
  // 结算主体标识
  settleEntityId?: string;
  static names(): { [key: string]: string } {
    return {
      transInType: 'trans_in_type',
      transIn: 'trans_in',
      summaryDimension: 'summary_dimension',
      settleEntityType: 'settle_entity_type',
      settleEntityId: 'settle_entity_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      transInType: 'string',
      transIn: 'string',
      summaryDimension: 'string',
      settleEntityType: 'string',
      settleEntityId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云蚂蚁链相关下载链接
export class ALiYunDownloadPath extends $tea.Model {
  // client_crt_url
  clientCrtUrl?: string;
  // trust_ca_url
  trustCaUrl?: string;
  // ca_crt_url
  caCrtUrl?: string;
  // sdk_url
  sdkUrl?: string;
  static names(): { [key: string]: string } {
    return {
      clientCrtUrl: 'client_crt_url',
      trustCaUrl: 'trust_ca_url',
      caCrtUrl: 'ca_crt_url',
      sdkUrl: 'sdk_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      clientCrtUrl: 'string',
      trustCaUrl: 'string',
      caCrtUrl: 'string',
      sdkUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云子链结构体
export class ALiYunChainSubnet extends $tea.Model {
  // 子链id
  antChainId?: string;
  // 子链名称
  name?: string;
  // 子链节点数
  nodeSum?: number;
  // 子链监控状态
  monitor?: boolean;
  // 子链的块高
  blockHeight?: string;
  // 子链的业务总数
  transactionSum?: number;
  // 子链的创建时间
  createTime?: number;
  // 子链的状态
  status?: string;
  // 子链的权限
  consortiumMember?: boolean;
  // 主链id
  mainChainId?: string;
  // rest申请状态
  rest?: string;
  // 子链序号
  groupId?: string;
  static names(): { [key: string]: string } {
    return {
      antChainId: 'ant_chain_id',
      name: 'name',
      nodeSum: 'node_sum',
      monitor: 'monitor',
      blockHeight: 'block_height',
      transactionSum: 'transaction_sum',
      createTime: 'create_time',
      status: 'status',
      consortiumMember: 'consortium_member',
      mainChainId: 'main_chain_id',
      rest: 'rest',
      groupId: 'group_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      antChainId: 'string',
      name: 'string',
      nodeSum: 'number',
      monitor: 'boolean',
      blockHeight: 'string',
      transactionSum: 'number',
      createTime: 'number',
      status: 'string',
      consortiumMember: 'boolean',
      mainChainId: 'string',
      rest: 'string',
      groupId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Did doc中的service info
export class DidServiceInfo extends $tea.Model {
  // 服务的end point info
  endPoint: string;
  // 扩展字段信息
  extensionInfo: string;
  static names(): { [key: string]: string } {
    return {
      endPoint: 'end_point',
      extensionInfo: 'extension_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      endPoint: 'string',
      extensionInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 实例最近调用记录
export class InstanceRecordInfo extends $tea.Model {
  // 应用标识
  application?: string;
  // 执行结果
  status?: string;
  // 操作时间
  operatingTime?: string;
  static names(): { [key: string]: string } {
    return {
      application: 'application',
      status: 'status',
      operatingTime: 'operating_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      application: 'string',
      status: 'string',
      operatingTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云账户信息
export class ALiYunAccount extends $tea.Model {
  // ant_chain_id
  antChainId?: string;
  // account
  account?: string;
  // account_public_key
  accountPublicKey?: string;
  // account_recovery_key
  accountRecoveryKey?: string;
  // account_status
  accountStatus?: string;
  // 机构信息
  memberName?: string;
  // 创建时间
  createTime?: number;
  static names(): { [key: string]: string } {
    return {
      antChainId: 'ant_chain_id',
      account: 'account',
      accountPublicKey: 'account_public_key',
      accountRecoveryKey: 'account_recovery_key',
      accountStatus: 'account_status',
      memberName: 'member_name',
      createTime: 'create_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      antChainId: 'string',
      account: 'string',
      accountPublicKey: 'string',
      accountRecoveryKey: 'string',
      accountStatus: 'string',
      memberName: 'string',
      createTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云链节点信息
export class ALiYunChainNodeInfo extends $tea.Model {
  // block_height
  blockHeight?: number;
  // node_name
  nodeName?: string;
  // status
  status?: boolean;
  // version
  version?: string;
  // 节点id
  nodeId?: string;
  // 节点ip
  nodeIp?: string;
  // 节点的端口
  nodePort?: string;
  // 节点类型
  nodeType?: string;
  // 节点状态
  nodeState?: string;
  // 节点来源
  nodeSource?: string;
  // 节点存储空间使用量
  diskUse?: string;
  // 节点存储总空间大小
  diskTotal?: string;
  // 节点公钥
  publicKey?: string;
  static names(): { [key: string]: string } {
    return {
      blockHeight: 'block_height',
      nodeName: 'node_name',
      status: 'status',
      version: 'version',
      nodeId: 'node_id',
      nodeIp: 'node_ip',
      nodePort: 'node_port',
      nodeType: 'node_type',
      nodeState: 'node_state',
      nodeSource: 'node_source',
      diskUse: 'disk_use',
      diskTotal: 'disk_total',
      publicKey: 'public_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      blockHeight: 'number',
      nodeName: 'string',
      status: 'boolean',
      version: 'string',
      nodeId: 'string',
      nodeIp: 'string',
      nodePort: 'string',
      nodeType: 'string',
      nodeState: 'string',
      nodeSource: 'string',
      diskUse: 'string',
      diskTotal: 'string',
      publicKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// VC可信传输时，指定的目标did信息
export class VcTransmitTargetStruct extends $tea.Model {
  // 目标did的公钥
  publicKey?: string;
  // 传输vc使用的区块链id
  vcChannel?: string;
  // 验证者did
  verifierDid: string;
  static names(): { [key: string]: string } {
    return {
      publicKey: 'public_key',
      vcChannel: 'vc_channel',
      verifierDid: 'verifier_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      publicKey: 'string',
      vcChannel: 'string',
      verifierDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 人群标签对象
export class CrowdTagEnumItemDTO extends $tea.Model {
  // 枚举名称
  name: string;
  // 枚举值
  val: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      val: 'val',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      val: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云交易查询信息
export class ALiYunTransaction extends $tea.Model {
  // tx_type
  txType?: string;
  // data
  data?: string;
  // hash
  hash?: string;
  // from
  from?: string;
  // to
  to?: string;
  // timestamp
  timestamp?: number;
  // period
  period?: number;
  // nonce
  nonce?: string;
  // gas
  gas?: string;
  // value
  value?: string;
  // signatures
  signatures?: string[];
  // extentions
  extentions?: string[];
  static names(): { [key: string]: string } {
    return {
      txType: 'tx_type',
      data: 'data',
      hash: 'hash',
      from: 'from',
      to: 'to',
      timestamp: 'timestamp',
      period: 'period',
      nonce: 'nonce',
      gas: 'gas',
      value: 'value',
      signatures: 'signatures',
      extentions: 'extentions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      txType: 'string',
      data: 'string',
      hash: 'string',
      from: 'string',
      to: 'string',
      timestamp: 'number',
      period: 'number',
      nonce: 'string',
      gas: 'string',
      value: 'string',
      signatures: { 'type': 'array', 'itemType': 'string' },
      extentions: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云存证链信息
export class ALiYunNotaryBlockchain extends $tea.Model {
  // name
  name?: string;
  // bizid
  bizid?: string;
  // chain_type
  chainType?: string;
  // node_num
  nodeNum?: number;
  // member_status
  memberStatus?: string;
  // block_height
  blockHeight?: number;
  // transactions
  transactions?: number;
  // network
  network?: string;
  // version
  version?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      bizid: 'bizid',
      chainType: 'chain_type',
      nodeNum: 'node_num',
      memberStatus: 'member_status',
      blockHeight: 'block_height',
      transactions: 'transactions',
      network: 'network',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      bizid: 'string',
      chainType: 'string',
      nodeNum: 'number',
      memberStatus: 'string',
      blockHeight: 'number',
      transactions: 'number',
      network: 'string',
      version: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合约市场列表
export class ContractTemplateResp extends $tea.Model {
  // 模板标识
  templateId?: string;
  // 产品码
  productCode?: string;
  // 合约名称
  name?: string;
  // 缩略图url
  thumbUrl?: string;
  // 合约描述
  description?: string;
  // 文档地址
  detailUrl?: string;
  // 是否已开通合约
  open?: boolean;
  // 后续展示：购买用户头像
  avatarLogoList?: string[];
  // 定制合约价格
  priceMessage?: string;
  static names(): { [key: string]: string } {
    return {
      templateId: 'template_id',
      productCode: 'product_code',
      name: 'name',
      thumbUrl: 'thumb_url',
      description: 'description',
      detailUrl: 'detail_url',
      open: 'open',
      avatarLogoList: 'avatar_logo_list',
      priceMessage: 'price_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      templateId: 'string',
      productCode: 'string',
      name: 'string',
      thumbUrl: 'string',
      description: 'string',
      detailUrl: 'string',
      open: 'boolean',
      avatarLogoList: { 'type': 'array', 'itemType': 'string' },
      priceMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据授权服务数据对象结构体
export class DataEntity extends $tea.Model {
  // 授权状态
  authStatus?: string;
  // 业务系统唯一标示
  bizUid?: string;
  // 区块链ID
  blockchainId?: string;
  // 数据类别
  category: string;
  // 数据ID
  dataId: string;
  // 数据模型ID
  dataModelId?: string;
  // 扩展信息，标准JSON格式
  extensionInfo?: string;
  // 数据名称
  name: string;
  // 数据所有者ID
  ownerId: string;
  // 流程节点信息
  processTemplate?: ProcessNode[];
  // 数据状态
  status?: string;
  // 创建时间
  createTime: number;
  // 修改时间
  updateTime?: number;
  // DID doc里的公开信息
  publicInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authStatus: 'auth_status',
      bizUid: 'biz_uid',
      blockchainId: 'blockchain_id',
      category: 'category',
      dataId: 'data_id',
      dataModelId: 'data_model_id',
      extensionInfo: 'extension_info',
      name: 'name',
      ownerId: 'owner_id',
      processTemplate: 'process_template',
      status: 'status',
      createTime: 'create_time',
      updateTime: 'update_time',
      publicInfo: 'public_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authStatus: 'string',
      bizUid: 'string',
      blockchainId: 'string',
      category: 'string',
      dataId: 'string',
      dataModelId: 'string',
      extensionInfo: 'string',
      name: 'string',
      ownerId: 'string',
      processTemplate: { 'type': 'array', 'itemType': ProcessNode },
      status: 'string',
      createTime: 'number',
      updateTime: 'number',
      publicInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 车辆用户信息
export class CarUserInfo extends $tea.Model {
  // 唯一标识用户的id
  userId: string;
  // 手机号
  phoneNum: string;
  // 城市编码
  cityCode: string;
  // 姓名
  userCertName?: string;
  // 证件号码
  userCertNo?: string;
  // 性别
  userGender?: string;
  // 昵称
  nick?: string;
  static names(): { [key: string]: string } {
    return {
      userId: 'user_id',
      phoneNum: 'phone_num',
      cityCode: 'city_code',
      userCertName: 'user_cert_name',
      userCertNo: 'user_cert_no',
      userGender: 'user_gender',
      nick: 'nick',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userId: 'string',
      phoneNum: 'string',
      cityCode: 'string',
      userCertName: 'string',
      userCertNo: 'string',
      userGender: 'string',
      nick: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云蚂蚁链对象
export class ALiYunAntChain extends $tea.Model {
  // ant_chain_id
  antChainId?: string;
  // 链名称
  antChainName?: string;
  // 链的类型
  chainType?: string;
  // cipher_suit
  cipherSuit?: string;
  // 创建时间
  createTime?: number;
  // expire_time
  expireTime?: number;
  // instance_id
  instanceId?: string;
  // is_admin
  isAdmin?: boolean;
  // 成员状态
  memberStatus?: string;
  // merkle_tree_suit
  merkleTreeSuit?: string;
  // Network
  network?: string;
  // 节点数
  nodeNum?: number;
  // 区域信息
  regionId?: string;
  // 链的资源大小
  resourceSize?: string;
  // rest_status
  restStatus?: string;
  // 算法参数
  tlsAlgo?: string;
  // 版本信息
  version?: string;
  // monitor_status
  monitorStatus?: boolean;
  static names(): { [key: string]: string } {
    return {
      antChainId: 'ant_chain_id',
      antChainName: 'ant_chain_name',
      chainType: 'chain_type',
      cipherSuit: 'cipher_suit',
      createTime: 'create_time',
      expireTime: 'expire_time',
      instanceId: 'instance_id',
      isAdmin: 'is_admin',
      memberStatus: 'member_status',
      merkleTreeSuit: 'merkle_tree_suit',
      network: 'network',
      nodeNum: 'node_num',
      regionId: 'region_id',
      resourceSize: 'resource_size',
      restStatus: 'rest_status',
      tlsAlgo: 'tls_algo',
      version: 'version',
      monitorStatus: 'monitor_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      antChainId: 'string',
      antChainName: 'string',
      chainType: 'string',
      cipherSuit: 'string',
      createTime: 'number',
      expireTime: 'number',
      instanceId: 'string',
      isAdmin: 'boolean',
      memberStatus: 'string',
      merkleTreeSuit: 'string',
      network: 'string',
      nodeNum: 'number',
      regionId: 'string',
      resourceSize: 'string',
      restStatus: 'string',
      tlsAlgo: 'string',
      version: 'string',
      monitorStatus: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Did Doc中的服务字段描述
export class DidDocServicesInfo extends $tea.Model {
  // 服务的扩展字段
  extension?: string;
  // 服务ID，必须保证该服务ID在did doc中是唯一的。对于保留类型服务：
  // DidAuthService， 有且只能有一个，并且id必须为didauth-1；
  // VerifiableClaimRepository， 有且只有一个，并且id必须为vcrepository-1;
  id: string;
  // 服务的可访问地址
  serviceEndpoint: string;
  // 服务类型，必须是已经注册的服务类型，或者是默认保留的服务类型
  type: string;
  static names(): { [key: string]: string } {
    return {
      extension: 'extension',
      id: 'id',
      serviceEndpoint: 'service_endpoint',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      extension: 'string',
      id: 'string',
      serviceEndpoint: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云蚂蚁区块链证书信息
export class ALiYunCertificateApplication extends $tea.Model {
  // ant_chain_id
  antChainId?: string;
  // username
  username?: string;
  // createtime
  createtime?: number;
  // updatetime
  updatetime?: number;
  // bid
  bid?: string;
  // status
  status?: string;
  static names(): { [key: string]: string } {
    return {
      antChainId: 'ant_chain_id',
      username: 'username',
      createtime: 'createtime',
      updatetime: 'updatetime',
      bid: 'bid',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      antChainId: 'string',
      username: 'string',
      createtime: 'number',
      updatetime: 'number',
      bid: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// DidDoc中service的信息
export class DisServicesInfo extends $tea.Model {
  // did doc service扩展字段
  extesion?: string;
  // did doc service id
  id: string;
  // 服务endpoint
  serviceEndpoint: string;
  // service type
  type: string;
  // EXIST
  // CONFLICT
  // VALID
  // INVALID
  desc?: string;
  static names(): { [key: string]: string } {
    return {
      extesion: 'extesion',
      id: 'id',
      serviceEndpoint: 'service_endpoint',
      type: 'type',
      desc: 'desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      extesion: 'string',
      id: 'string',
      serviceEndpoint: 'string',
      type: 'string',
      desc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云合约链信息
export class ALiYunContractBlockchain extends $tea.Model {
  // name
  name?: string;
  // bizid
  bizid?: string;
  // chain_type
  chainType?: string;
  // node_num
  nodeNum?: number;
  // member_status
  memberStatus?: string;
  // block_height
  blockHeight?: number;
  // transactions
  transactions?: number;
  // network
  network?: string;
  // version
  version?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      bizid: 'bizid',
      chainType: 'chain_type',
      nodeNum: 'node_num',
      memberStatus: 'member_status',
      blockHeight: 'block_height',
      transactions: 'transactions',
      network: 'network',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      bizid: 'string',
      chainType: 'string',
      nodeNum: 'number',
      memberStatus: 'string',
      blockHeight: 'number',
      transactions: 'number',
      network: 'string',
      version: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云区块链小程序用户权限信息
export class ALiYunChainMiniAppAuthorizedUser extends $tea.Model {
  // phone
  phone?: string;
  // gmt_authorized
  gmtAuthorized?: string;
  // 记录id
  userId?: number;
  static names(): { [key: string]: string } {
    return {
      phone: 'phone',
      gmtAuthorized: 'gmt_authorized',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      phone: 'string',
      gmtAuthorized: 'string',
      userId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云合约工程信息
export class ALiYunContractProject extends $tea.Model {
  // consortium_id
  consortiumId?: string;
  // create_time
  createTime?: number;
  // project_description
  projectDescription?: string;
  // project_id
  projectId?: string;
  // project_name
  projectName?: string;
  // project_version
  projectVersion?: string;
  // update_time
  updateTime?: number;
  static names(): { [key: string]: string } {
    return {
      consortiumId: 'consortium_id',
      createTime: 'create_time',
      projectDescription: 'project_description',
      projectId: 'project_id',
      projectName: 'project_name',
      projectVersion: 'project_version',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      consortiumId: 'string',
      createTime: 'number',
      projectDescription: 'string',
      projectId: 'string',
      projectName: 'string',
      projectVersion: 'string',
      updateTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合约列表
export class ContractPageListResp extends $tea.Model {
  // 服务ID
  serviceId?: string;
  // 合约名称
  name?: string;
  // 合约类型
  type?: string;
  // 创建时间
  createTime?: number;
  static names(): { [key: string]: string } {
    return {
      serviceId: 'service_id',
      name: 'name',
      type: 'type',
      createTime: 'create_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      serviceId: 'string',
      name: 'string',
      type: 'string',
      createTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云区块链信息
export class ALiYunOldContractBlockchain extends $tea.Model {
  // name
  name?: string;
  // bizid
  bizid?: string;
  // chain_type
  chainType?: string;
  // node_num
  nodeNum?: number;
  // member_status
  memberStatus?: string;
  // block_height
  blockHeight?: number;
  // transactions
  transactions?: number;
  // network
  network?: string;
  // version
  version?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      bizid: 'bizid',
      chainType: 'chain_type',
      nodeNum: 'node_num',
      memberStatus: 'member_status',
      blockHeight: 'block_height',
      transactions: 'transactions',
      network: 'network',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      bizid: 'string',
      chainType: 'string',
      nodeNum: 'number',
      memberStatus: 'string',
      blockHeight: 'number',
      transactions: 'number',
      network: 'string',
      version: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分页属性
export class ALiYunPagination extends $tea.Model {
  // 分页大小
  pageSize?: number;
  // 分页编号
  pageNumber?: number;
  // 总数大小
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      pageSize: 'page_size',
      pageNumber: 'page_number',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pageSize: 'number',
      pageNumber: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云区块链交易的汇总信息
export class ALiYunTransactionSummary extends $tea.Model {
  // alias
  alias?: string;
  // hash
  hash?: string;
  // trans_type_v6
  transTypeV6?: string;
  // trans_type_v10
  transTypeV10?: string;
  // category
  category?: number;
  // height
  height?: number;
  // block_hash
  blockHash?: string;
  // create_time
  createTime?: number;
  // reference_count
  referenceCount?: number;
  // from
  from?: string;
  // to
  to?: string;
  // gas_used
  gasUsed?: number;
  static names(): { [key: string]: string } {
    return {
      alias: 'alias',
      hash: 'hash',
      transTypeV6: 'trans_type_v6',
      transTypeV10: 'trans_type_v10',
      category: 'category',
      height: 'height',
      blockHash: 'block_hash',
      createTime: 'create_time',
      referenceCount: 'reference_count',
      from: 'from',
      to: 'to',
      gasUsed: 'gas_used',
    };
  }

  static types(): { [key: string]: any } {
    return {
      alias: 'string',
      hash: 'string',
      transTypeV6: 'string',
      transTypeV10: 'string',
      category: 'number',
      height: 'number',
      blockHash: 'string',
      createTime: 'number',
      referenceCount: 'number',
      from: 'string',
      to: 'string',
      gasUsed: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云联盟信息
export class ALiYunAntConsortium extends $tea.Model {
  // 链的数量
  chainNum?: number;
  // 成员数量
  memberNum?: number;
  // 时间戳
  createTime?: number;
  // 角色
  role?: string;
  // 联盟id
  consortiumId?: string;
  // 状态值
  status?: string;
  // 联盟名称
  consortiumName?: string;
  // 联盟描述
  consortiumDescription?: string;
  // 是否为空联盟
  isEmptyConsortium?: boolean;
  static names(): { [key: string]: string } {
    return {
      chainNum: 'chain_num',
      memberNum: 'member_num',
      createTime: 'create_time',
      role: 'role',
      consortiumId: 'consortium_id',
      status: 'status',
      consortiumName: 'consortium_name',
      consortiumDescription: 'consortium_description',
      isEmptyConsortium: 'is_empty_consortium',
    };
  }

  static types(): { [key: string]: any } {
    return {
      chainNum: 'number',
      memberNum: 'number',
      createTime: 'number',
      role: 'string',
      consortiumId: 'string',
      status: 'string',
      consortiumName: 'string',
      consortiumDescription: 'string',
      isEmptyConsortium: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云数据导出任务checkpoint类
export class CheckPointStructBody extends $tea.Model {
  // 高度
  height?: string;
  // 序号
  index?: string;
  // 类型
  type?: string;
  // last_error
  lastError?: string;
  // 错误统计
  errorCount?: string;
  // 统计
  totalCount?: string;
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
      height: 'string',
      index: 'string',
      type: 'string',
      lastError: 'string',
      errorCount: 'string',
      totalCount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 人群匹配结果
export class CrowdMatchResult extends $tea.Model {
  // 人群匹配结果
  match: boolean;
  static names(): { [key: string]: string } {
    return {
      match: 'match',
    };
  }

  static types(): { [key: string]: any } {
    return {
      match: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 账户映射情况
export class AccountMappingInfo extends $tea.Model {
  // 链上账户id
  bcAccount: string;
  // 账户绑定状态，1为未绑定，2为绑定成功
  bindingStatus: number;
  // 1是激活状态，2是冻结状态
  status: number;
  // 账户唯一标示
  uid: string;
  static names(): { [key: string]: string } {
    return {
      bcAccount: 'bc_account',
      bindingStatus: 'binding_status',
      status: 'status',
      uid: 'uid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bcAccount: 'string',
      bindingStatus: 'number',
      status: 'number',
      uid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 证书实例详情
export class CertInstanceDetail extends $tea.Model {
  // 主键
  bizId: string;
  // 实例名称
  name: string;
  // 版发者
  issuer: string;
  // 实例内容
  claimContent: string;
  // 状态；-1：已删除 0：审核未通过, 1：审核通过, 2：待审核, 3：编辑中
  status: number;
  // 审核建议
  verifyComment: string;
  // 创建时间
  gmtCreate: string;
  // 修改时间
  gmtModified: string;
  static names(): { [key: string]: string } {
    return {
      bizId: 'biz_id',
      name: 'name',
      issuer: 'issuer',
      claimContent: 'claim_content',
      status: 'status',
      verifyComment: 'verify_comment',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizId: 'string',
      name: 'string',
      issuer: 'string',
      claimContent: 'string',
      status: 'number',
      verifyComment: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 奖品基本信息
export class PrizeBaseInfo extends $tea.Model {
  // 奖品ID
  prizeId?: string;
  // 奖品名称
  prizeName?: string;
  // 奖品类型
  prizeType?: string;
  // 奖品状态
  prizeStatus?: string;
  // 预算金额
  budgetAmount?: number;
  static names(): { [key: string]: string } {
    return {
      prizeId: 'prize_id',
      prizeName: 'prize_name',
      prizeType: 'prize_type',
      prizeStatus: 'prize_status',
      budgetAmount: 'budget_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      prizeId: 'string',
      prizeName: 'string',
      prizeType: 'string',
      prizeStatus: 'string',
      budgetAmount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 蚂蚁链用途申报结构体
export class ChainPurpose extends $tea.Model {
  // 用途id
  id?: string;
  // 用途key
  key?: string;
  // 用途内容
  name?: string;
  // 用途申报时间
  time?: string;
  // 用途申报状态
  status?: string;
  // 简短描述开关
  item?: boolean;
  // 详细描述开关
  extend?: boolean;
  // 用途申报简短描述
  purposeItem?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      key: 'key',
      name: 'name',
      time: 'time',
      status: 'status',
      item: 'item',
      extend: 'extend',
      purposeItem: 'purpose_item',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      key: 'string',
      name: 'string',
      time: 'string',
      status: 'string',
      item: 'boolean',
      extend: 'boolean',
      purposeItem: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 定价策略
export class PriceStrategy extends $tea.Model {
  // 定价策略类型
  strategyType?: string;
  // 策略值
  strategyValue?: string;
  // 最小金额（单位：分）
  minPrice?: number;
  // 最大金额（单位：分）
  maxPrice?: number;
  // 门槛金额（单位：分）
  threshold?: number;
  // 门槛类型
  thresholdType?: string;
  static names(): { [key: string]: string } {
    return {
      strategyType: 'strategy_type',
      strategyValue: 'strategy_value',
      minPrice: 'min_price',
      maxPrice: 'max_price',
      threshold: 'threshold',
      thresholdType: 'threshold_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      strategyType: 'string',
      strategyValue: 'string',
      minPrice: 'number',
      maxPrice: 'number',
      threshold: 'number',
      thresholdType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 证书颁发校验错误描述
export class TemplateInstanceErrorDetailDTO extends $tea.Model {
  // 当前错误类型的错误行数
  errorNum: number;
  // 出错数据抽样
  samples: string[];
  // 出错列，从0开始
  errorColumnIndex: number;
  // 当前错误类型的描述
  errorDescription: string;
  static names(): { [key: string]: string } {
    return {
      errorNum: 'error_num',
      samples: 'samples',
      errorColumnIndex: 'error_column_index',
      errorDescription: 'error_description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      errorNum: 'number',
      samples: { 'type': 'array', 'itemType': 'string' },
      errorColumnIndex: 'number',
      errorDescription: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 申请用户授权的目标可验证声明内容、过期时间等配置
export class Claim extends $tea.Model {
  // 一个json的string，内容包含具体需要的声明，不同业务场景不同。
  claimContent: string;
  // 如果在相同的biz_type下，还需要针对声明claim进行细化划分，可以使用此字段。
  claimType?: string;
  // 申请声明颁发后的有效期，可选参数，如果不指定则默认申请永久有效。
  expire?: number;
  // 授权颁发可验证声明的目标did信息，通常为机构或组织的did
  did?: string;
  // 目标待授权的名称，标定唯一性，与claim内容配合使用，如果不指定did可以考虑使用此字段。
  name?: string;
  static names(): { [key: string]: string } {
    return {
      claimContent: 'claim_content',
      claimType: 'claim_type',
      expire: 'expire',
      did: 'did',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      claimContent: 'string',
      claimType: 'string',
      expire: 'number',
      did: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云子链检查结果
export class ALiYunChainSubnetCheck extends $tea.Model {
  // 检查结果
  checkResult?: string;
  // 子链成员列表
  consortiumMemberList?: string[];
  // 节点信息列表
  chainNodeInfoList?: ALiYunChainNodeInfo[];
  // 联盟管理员
  consortiumAdmin?: boolean;
  // 子链成员列表
  consortiumMemberInfoList?: ALiYunMember[];
  // 分页信息
  pagination?: ALiYunPagination;
  static names(): { [key: string]: string } {
    return {
      checkResult: 'check_result',
      consortiumMemberList: 'consortium_member_list',
      chainNodeInfoList: 'chain_node_info_list',
      consortiumAdmin: 'consortium_admin',
      consortiumMemberInfoList: 'consortium_member_info_list',
      pagination: 'pagination',
    };
  }

  static types(): { [key: string]: any } {
    return {
      checkResult: 'string',
      consortiumMemberList: { 'type': 'array', 'itemType': 'string' },
      chainNodeInfoList: { 'type': 'array', 'itemType': ALiYunChainNodeInfo },
      consortiumAdmin: 'boolean',
      consortiumMemberInfoList: { 'type': 'array', 'itemType': ALiYunMember },
      pagination: ALiYunPagination,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 授权规则详细信息
export class AuthorizationRule extends $tea.Model {
  // 规则来源
  source: string;
  // 规则索引
  index: string;
  // 规则类型
  type: string;
  // 规则表达式
  expression: string;
  // 规则内容
  content: string;
  static names(): { [key: string]: string } {
    return {
      source: 'source',
      index: 'index',
      type: 'type',
      expression: 'expression',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      source: 'string',
      index: 'string',
      type: 'string',
      expression: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 账户映射结果
export class AccountMappingResult extends $tea.Model {
  // 该账户在链上的唯一标示
  baccount: string;
  // 当前账户映射结果描述语句
  message: string;
  // 状态描述符
  status: string;
  // 自有系统中该账户唯一标示
  uid: string;
  static names(): { [key: string]: string } {
    return {
      baccount: 'baccount',
      message: 'message',
      status: 'status',
      uid: 'uid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      baccount: 'string',
      message: 'string',
      status: 'string',
      uid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 经营地址
export class AddressInfo extends $tea.Model {
  // 城市编码
  cityCode: string;
  // 区县编码
  districtCode: string;
  // 地址
  address: string;
  // 省份编码
  provinceCode: string;
  // 高德 poiid
  poiid?: string;
  // 经度
  longitude?: string;
  // 纬度
  latitude?: string;
  // 地址类型
  type?: string;
  static names(): { [key: string]: string } {
    return {
      cityCode: 'city_code',
      districtCode: 'district_code',
      address: 'address',
      provinceCode: 'province_code',
      poiid: 'poiid',
      longitude: 'longitude',
      latitude: 'latitude',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cityCode: 'string',
      districtCode: 'string',
      address: 'string',
      provinceCode: 'string',
      poiid: 'string',
      longitude: 'string',
      latitude: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 可验证声明的完整内容以及状态，当前持有者的did等信息
export class VcContent extends $tea.Model {
  // 可验证声明的唯一标识id，status 为 “1” 时候非空
  vcId: string;
  // 可验证声明完整内容， status 为 “1” 时候非空
  vcContent: string;
  // 可验证声明的颁发状态说明： -1：颁发失败，0：未授权 1：授权成功，此时vc_content字段会包含授权后的声明内容，其它状态码，待定义后增加。
  status: string;
  // 被颁发当前可验证声明的目标did
  did?: string;
  // 如果status 是 “-1”，则说明当前可验证声明颁发失败，此字段说明失败原因。
  message?: string;
  static names(): { [key: string]: string } {
    return {
      vcId: 'vc_id',
      vcContent: 'vc_content',
      status: 'status',
      did: 'did',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      vcId: 'string',
      vcContent: 'string',
      status: 'string',
      did: 'string',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 退分账明细信息
export class RefundRoyaltyResult extends $tea.Model {
  // 退分账金额
  refundAmount: string;
  // 退分账结果码
  resultCode: string;
  static names(): { [key: string]: string } {
    return {
      refundAmount: 'refund_amount',
      resultCode: 'result_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      refundAmount: 'string',
      resultCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户身份、账户及手机号信息
export class UserInfoParam extends $tea.Model {
  // 用户手机号信息
  phone: string;
  // 用户账号信息
  userAccount: string;
  // 用户名称
  userName: string;
  static names(): { [key: string]: string } {
    return {
      phone: 'phone',
      userAccount: 'user_account',
      userName: 'user_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      phone: 'string',
      userAccount: 'string',
      userName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 任务人群匹配返回列表
export class TaskCrowdMatchResp extends $tea.Model {
  // 任务ID
  taskId: string;
  // 人群匹配结果
  crowdMatchResult: CrowdMatchResult;
  static names(): { [key: string]: string } {
    return {
      taskId: 'task_id',
      crowdMatchResult: 'crowd_match_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      taskId: 'string',
      crowdMatchResult: CrowdMatchResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 链详情
export class MyChainInfo extends $tea.Model {
  // 链id
  bizId: string;
  // 授权租户id
  tenant: string;
  static names(): { [key: string]: string } {
    return {
      bizId: 'biz_id',
      tenant: 'tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizId: 'string',
      tenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 派生DID的具体参数
export class DeriveDid extends $tea.Model {
  // 派生的子did
  childdid: string;
  // 子did 的did doc
  childdiddoc: string;
  // 用户输入用于派生子did的派生码
  code: string;
  static names(): { [key: string]: string } {
    return {
      childdid: 'childdid',
      childdiddoc: 'childdiddoc',
      code: 'code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      childdid: 'string',
      childdiddoc: 'string',
      code: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 授权明细详情
export class AuthorizationDetail extends $tea.Model {
  // 授权凭证ID
  authorityCertId: string;
  // 授权ID
  authorizationId?: string;
  // 区块号
  blockNum: number;
  // 过期时间
  expire?: number;
  // 授权时间
  issuanceTime: number;
  // 授权人
  issuer: Participant;
  // 被授权人
  subject: Participant;
  // 哈希
  txHash: string;
  // 资产所有者
  owner: Participant;
  static names(): { [key: string]: string } {
    return {
      authorityCertId: 'authority_cert_id',
      authorizationId: 'authorization_id',
      blockNum: 'block_num',
      expire: 'expire',
      issuanceTime: 'issuance_time',
      issuer: 'issuer',
      subject: 'subject',
      txHash: 'tx_hash',
      owner: 'owner',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authorityCertId: 'string',
      authorizationId: 'string',
      blockNum: 'number',
      expire: 'number',
      issuanceTime: 'number',
      issuer: Participant,
      subject: Participant,
      txHash: 'string',
      owner: Participant,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云CloudIde的配置
export class ALiYunChainCloudIdeConfig extends $tea.Model {
  // bizid
  bizid?: string;
  // name
  name?: string;
  // trial_account
  trialAccount?: string;
  // trial_account_private_key
  trialAccountPrivateKey?: string;
  // ant_chain_id
  antChainId?: string;
  // ant_chain_name
  antChainName?: string;
  // version
  version?: string;
  static names(): { [key: string]: string } {
    return {
      bizid: 'bizid',
      name: 'name',
      trialAccount: 'trial_account',
      trialAccountPrivateKey: 'trial_account_private_key',
      antChainId: 'ant_chain_id',
      antChainName: 'ant_chain_name',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizid: 'string',
      name: 'string',
      trialAccount: 'string',
      trialAccountPrivateKey: 'string',
      antChainId: 'string',
      antChainName: 'string',
      version: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 创建应用响应信息
export class ApplicationCreateResp extends $tea.Model {
  // 应用标识
  applicationId?: string;
  static names(): { [key: string]: string } {
    return {
      applicationId: 'application_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      applicationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云联盟返回结果
export class ALiYunUnion extends $tea.Model {
  // 联盟内链的集合
  antChains?: ALiYunAntChain[];
  // 联盟信息
  antConsortiums?: ALiYunAntConsortium[];
  // 联盟Id
  consortiumId?: string;
  // 联盟成员信息
  members?: ALiYunMember[];
  // 阿里云分页属性
  pagination?: ALiYunPagination;
  // is_exist
  isExist?: boolean;
  static names(): { [key: string]: string } {
    return {
      antChains: 'ant_chains',
      antConsortiums: 'ant_consortiums',
      consortiumId: 'consortium_id',
      members: 'members',
      pagination: 'pagination',
      isExist: 'is_exist',
    };
  }

  static types(): { [key: string]: any } {
    return {
      antChains: { 'type': 'array', 'itemType': ALiYunAntChain },
      antConsortiums: { 'type': 'array', 'itemType': ALiYunAntConsortium },
      consortiumId: 'string',
      members: { 'type': 'array', 'itemType': ALiYunMember },
      pagination: ALiYunPagination,
      isExist: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据授权服务公钥矩阵关系结构体
export class PublicKeyRelation extends $tea.Model {
  // 公钥颁发者ID
  issuerId: string;
  // 公钥接受者ID
  recipientId: string;
  static names(): { [key: string]: string } {
    return {
      issuerId: 'issuer_id',
      recipientId: 'recipient_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      issuerId: 'string',
      recipientId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 获取Afts文件上传地址返回值，包含地址和token
export class GetAftsUploadUrlResponse extends $tea.Model {
  // 11121312
  massToken: string;
  // 上传文件地址
  uploadUrl: string;
  static names(): { [key: string]: string } {
    return {
      massToken: 'mass_token',
      uploadUrl: 'upload_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      massToken: 'string',
      uploadUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合约类型
export class ContractTypeResp extends $tea.Model {
  // 合约服务类型
  typeList?: ContractTypeListResp[];
  static names(): { [key: string]: string } {
    return {
      typeList: 'type_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      typeList: { 'type': 'array', 'itemType': ContractTypeListResp },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 物流金融平台运单轨迹信息
export class LogisticLocation extends $tea.Model {
  // 结构化地址信息,规则遵循：国家、省份、城市、区县、城镇、乡村、街道、门牌号码、屋邨、大厦
  address?: string;
  // 行政区划代码
  cityCode?: string;
  // 纬度
  lat: string;
  // 经度
  lon: string;
  // 轨迹时间戳
  trackTime: number;
  static names(): { [key: string]: string } {
    return {
      address: 'address',
      cityCode: 'city_code',
      lat: 'lat',
      lon: 'lon',
      trackTime: 'track_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      address: 'string',
      cityCode: 'string',
      lat: 'string',
      lon: 'string',
      trackTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 活动基本信息
export class ActivityBaseInfo extends $tea.Model {
  // 活动ID
  activityId: string;
  // 活动名称
  activityName?: string;
  // 活动状态
  activityStatus?: string;
  // 平台类型
  platformType?: string;
  // 活动开始时间
  publishStartTime?: string;
  // 活动结束时间
  publishEndTime?: string;
  static names(): { [key: string]: string } {
    return {
      activityId: 'activity_id',
      activityName: 'activity_name',
      activityStatus: 'activity_status',
      platformType: 'platform_type',
      publishStartTime: 'publish_start_time',
      publishEndTime: 'publish_end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      activityId: 'string',
      activityName: 'string',
      activityStatus: 'string',
      platformType: 'string',
      publishStartTime: 'string',
      publishEndTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云订单结果
export class ALiYunOrderResult extends $tea.Model {
  // request_id
  requestId?: string;
  // data
  data?: string;
  // success
  success?: boolean;
  // code
  code?: string;
  // message
  message?: string;
  // synchro
  synchro?: boolean;
  static names(): { [key: string]: string } {
    return {
      requestId: 'request_id',
      data: 'data',
      success: 'success',
      code: 'code',
      message: 'message',
      synchro: 'synchro',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
      data: 'string',
      success: 'boolean',
      code: 'string',
      message: 'string',
      synchro: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 批量查询商户下已映射的账户信息接口，返回的对象
export class QueryMappingBatchResult extends $tea.Model {
  // 本次查询获取的账户信息
  accounts: AccountMappingInfo[];
  // 该商户下总共映射账户的数量
  totalNum: number;
  // 该商户下账户信息的总页数
  totalPage: number;
  static names(): { [key: string]: string } {
    return {
      accounts: 'accounts',
      totalNum: 'total_num',
      totalPage: 'total_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accounts: { 'type': 'array', 'itemType': AccountMappingInfo },
      totalNum: 'number',
      totalPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云区块链区块信息
export class ALiYunChainBlock extends $tea.Model {
  // ant_chain_id
  antChainId?: string;
  // block_hash
  blockHash?: string;
  // create_time
  createTime?: number;
  // height
  height?: number;
  // previous_hash
  previousHash?: string;
  // root_tx_hash
  rootTxHash?: string;
  // transaction_size
  transactionSize?: number;
  // trans_summary_list
  transSummaryList?: ALiYunTransactionSummary[];
  // Version
  version?: number;
  static names(): { [key: string]: string } {
    return {
      antChainId: 'ant_chain_id',
      blockHash: 'block_hash',
      createTime: 'create_time',
      height: 'height',
      previousHash: 'previous_hash',
      rootTxHash: 'root_tx_hash',
      transactionSize: 'transaction_size',
      transSummaryList: 'trans_summary_list',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      antChainId: 'string',
      blockHash: 'string',
      createTime: 'number',
      height: 'number',
      previousHash: 'string',
      rootTxHash: 'string',
      transactionSize: 'number',
      transSummaryList: { 'type': 'array', 'itemType': ALiYunTransactionSummary },
      version: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用授权列表查询
export class ApplicationPageResp extends $tea.Model {
  // 应用授权列表
  list?: ApplicationPageListResp[];
  // 总数
  total?: number;
  static names(): { [key: string]: string } {
    return {
      list: 'list',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': ApplicationPageListResp },
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// did中使用ZKP生成证明需要的信息
export class DidZKPInfo extends $tea.Model {
  // 需要生成证明的路径
  path: string;
  // 生成ZKP证明的公共信息
  publicInputs: string;
  // zkp方法
  zkpType: string;
  static names(): { [key: string]: string } {
    return {
      path: 'path',
      publicInputs: 'public_inputs',
      zkpType: 'zkp_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      path: 'string',
      publicInputs: 'string',
      zkpType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云账户列表信息
export class ALiYunAccountList extends $tea.Model {
  // pagination
  pagination?: ALiYunPagination;
  // accounts
  accounts?: ALiYunAccount[];
  // 联盟管理员
  consortiumAdmin?: boolean;
  static names(): { [key: string]: string } {
    return {
      pagination: 'pagination',
      accounts: 'accounts',
      consortiumAdmin: 'consortium_admin',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pagination: ALiYunPagination,
      accounts: { 'type': 'array', 'itemType': ALiYunAccount },
      consortiumAdmin: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 蚂蚁链用途申报结构体
export class AntChainPurposeResponse extends $tea.Model {
  // 用户申报用途状态
  status?: string;
  // 已申报的用途，比如供应链金融
  purpose?: string;
  // 申报时间
  createTime?: string;
  // 简短说明用途
  chainPurposeItem?: string;
  // 用途详情
  chainPurposeExtend?: string;
  // 申请用途列表
  recordList?: ChainPurpose[];
  static names(): { [key: string]: string } {
    return {
      status: 'status',
      purpose: 'purpose',
      createTime: 'create_time',
      chainPurposeItem: 'chain_purpose_item',
      chainPurposeExtend: 'chain_purpose_extend',
      recordList: 'record_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      status: 'string',
      purpose: 'string',
      createTime: 'string',
      chainPurposeItem: 'string',
      chainPurposeExtend: 'string',
      recordList: { 'type': 'array', 'itemType': ChainPurpose },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云交易收据
export class ALiYunTransactionReceipt extends $tea.Model {
  // data
  data?: string;
  // gas_used
  gasUsed?: string;
  // result
  result?: number;
  // logs
  logs?: string[];
  static names(): { [key: string]: string } {
    return {
      data: 'data',
      gasUsed: 'gas_used',
      result: 'result',
      logs: 'logs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      data: 'string',
      gasUsed: 'string',
      result: 'number',
      logs: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 实例进度
export class ContractCreateProcessResp extends $tea.Model {
  // 当前进度信息
  status?: string;
  // 合约部署进度
  progressInfoList?: InstanceProgressInfo[];
  static names(): { [key: string]: string } {
    return {
      status: 'status',
      progressInfoList: 'progress_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      status: 'string',
      progressInfoList: { 'type': 'array', 'itemType': InstanceProgressInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 新建合约服务
export class ContractCreateResp extends $tea.Model {
  // 合约标识
  serviceId?: string;
  static names(): { [key: string]: string } {
    return {
      serviceId: 'service_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      serviceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 内部建链信息查询
export class CreateBlockchainInfo extends $tea.Model {
  // 链id
  bizid: string;
  // 链的状态
  blockchainStatus: string;
  // 链的类型
  blockchainType: string;
  // 链的名称
  blockchainName: string;
  // 节点数量
  blockchanNodeNum: number;
  // 创建时间
  blockchainCreateTime: number;
  static names(): { [key: string]: string } {
    return {
      bizid: 'bizid',
      blockchainStatus: 'blockchain_status',
      blockchainType: 'blockchain_type',
      blockchainName: 'blockchain_name',
      blockchanNodeNum: 'blockchan_node_num',
      blockchainCreateTime: 'blockchain_create_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizid: 'string',
      blockchainStatus: 'string',
      blockchainType: 'string',
      blockchainName: 'string',
      blockchanNodeNum: 'number',
      blockchainCreateTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// VC分享的结果
export class VcShareResult extends $tea.Model {
  // 目标分享的VC的id
  vcId: string;
  // 分享给目标接受者的did
  targetDid: string;
  // 分享链上VC数据的交易hash，可用于直连区块链查询交易内容时使用。
  txHash?: string;
  // 分享是否成功，true：成功，false：失败
  status: boolean;
  // 失败的对应原因信息
  msg?: string;
  static names(): { [key: string]: string } {
    return {
      vcId: 'vc_id',
      targetDid: 'target_did',
      txHash: 'tx_hash',
      status: 'status',
      msg: 'msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      vcId: 'string',
      targetDid: 'string',
      txHash: 'string',
      status: 'boolean',
      msg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合约加密字段
export class ContractEncryptKeyItem extends $tea.Model {
  // 字段对应的id
  key: string;
  // 0:encrypt_text,
  // 1:encrypt_array_text,
  // 2:encrypt_int
  // 3:encrypt_array_int
  type: number;
  // 字段对应的数据
  value: string;
  static names(): { [key: string]: string } {
    return {
      key: 'key',
      type: 'type',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      key: 'string',
      type: 'number',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// did更新事件
export class DidEvent extends $tea.Model {
  // 事件对应的合约方法
  action: string;
  // 对应did
  did: string;
  // did对应doc
  didDoc: string;
  // 本次事件的触发者
  from: string;
  // 6500
  height: number;
  // 交易hash
  txHash: string;
  // 交易在区块中的index
  txIndex: number;
  static names(): { [key: string]: string } {
    return {
      action: 'action',
      did: 'did',
      didDoc: 'did_doc',
      from: 'from',
      height: 'height',
      txHash: 'tx_hash',
      txIndex: 'tx_index',
    };
  }

  static types(): { [key: string]: any } {
    return {
      action: 'string',
      did: 'string',
      didDoc: 'string',
      from: 'string',
      height: 'number',
      txHash: 'string',
      txIndex: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Vc可信传输实际参数
export class VcTransmitPayload extends $tea.Model {
  // 目标did相关信息列表
  targetVerifier: VcTransmitTargetStruct[];
  // 要传输的vc_id
  vcId: string;
  // vc原文，如果vc原文出现在传输接口，那么VC仓库不会从本地查找，而是直接将传输的VC上链
  vcContent?: string;
  static names(): { [key: string]: string } {
    return {
      targetVerifier: 'target_verifier',
      vcId: 'vc_id',
      vcContent: 'vc_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      targetVerifier: { 'type': 'array', 'itemType': VcTransmitTargetStruct },
      vcId: 'string',
      vcContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云合约内容
export class ALiYunChainContractContent extends $tea.Model {
  // content
  content?: string;
  // content_id
  contentId?: string;
  // content_name
  contentName?: string;
  // create_time
  createTime?: number;
  // is_directory
  isDirectory?: boolean;
  // parent_content_id
  parentContentId?: string;
  // project_id
  projectId?: string;
  // update_time
  updateTime?: number;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      contentId: 'content_id',
      contentName: 'content_name',
      createTime: 'create_time',
      isDirectory: 'is_directory',
      parentContentId: 'parent_content_id',
      projectId: 'project_id',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: 'string',
      contentId: 'string',
      contentName: 'string',
      createTime: 'number',
      isDirectory: 'boolean',
      parentContentId: 'string',
      projectId: 'string',
      updateTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 描述结算信息
export class SettleInfo extends $tea.Model {
  // 结算详细信息
  settleDetailInfos: SettleDetailInfo[];
  static names(): { [key: string]: string } {
    return {
      settleDetailInfos: 'settle_detail_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      settleDetailInfos: { 'type': 'array', 'itemType': SettleDetailInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 结果
export class Result extends $tea.Model {
  // 联盟id
  consortiumId: string;
  static names(): { [key: string]: string } {
    return {
      consortiumId: 'consortium_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      consortiumId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 更新did doc中的service信息
export class UpdateDidService extends $tea.Model {
  // 待更新did之前的版本号
  previousVersion: number;
  // did doc中的service id
  serviceId: string;
  // 服务信息
  serviceInfo: DidServiceInfo;
  // 服务类型
  serviceType: string;
  static names(): { [key: string]: string } {
    return {
      previousVersion: 'previous_version',
      serviceId: 'service_id',
      serviceInfo: 'service_info',
      serviceType: 'service_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      previousVersion: 'number',
      serviceId: 'string',
      serviceInfo: DidServiceInfo,
      serviceType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 包含业务组的用户信息
export class AccountInfoWithBiz extends $tea.Model {
  // 注册地址
  address?: string;
  // 业务场景code
  bizCode: string;
  // 业务名称
  bizName: string;
  // 业务类型，预留
  bizType?: string;
  // 用户创建时间，格式yyyy-MM-dd HH:mm:ss
  createTime?: string;
  // 用户注销时间，格式yyyy-MM-dd HH:mm:ss
  endTime?: string;
  // 扩展字段，使用json格式
  extension?: string;
  // 业务组code
  groupCode: string;
  // 业务组名称
  groupName: string;
  // 唯一标示类型，0:统一信用代码,1:开票机构代码,2:身份证号
  identityType?: number;
  // 唯一标示码
  identityValue?: string;
  // 用户标签
  label?: string;
  // 间连用户的上层直连用户名称
  parent?: string;
  // 统计时间，时间格式：yyyy-MM-dd HH:mm:ss
  statDate?: string;
  // 用户id
  userId?: string;
  // 用户或企业名称
  userName?: string;
  // 用户类型：direct直连，indirect间连，partner合作伙伴
  userType?: string;
  static names(): { [key: string]: string } {
    return {
      address: 'address',
      bizCode: 'biz_code',
      bizName: 'biz_name',
      bizType: 'biz_type',
      createTime: 'create_time',
      endTime: 'end_time',
      extension: 'extension',
      groupCode: 'group_code',
      groupName: 'group_name',
      identityType: 'identity_type',
      identityValue: 'identity_value',
      label: 'label',
      parent: 'parent',
      statDate: 'stat_date',
      userId: 'user_id',
      userName: 'user_name',
      userType: 'user_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      address: 'string',
      bizCode: 'string',
      bizName: 'string',
      bizType: 'string',
      createTime: 'string',
      endTime: 'string',
      extension: 'string',
      groupCode: 'string',
      groupName: 'string',
      identityType: 'number',
      identityValue: 'string',
      label: 'string',
      parent: 'string',
      statDate: 'string',
      userId: 'string',
      userName: 'string',
      userType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 基础车辆信息
export class BasicCarInfo extends $tea.Model {
  // 车牌号码
  licenseNo: string;
  // 车架号
  vin: string;
  // 发动机号
  engineNo: string;
  // 初登日期
  registerDate: string;
  // 车辆型号
  modelCode: string;
  // 营运性质
  useNatureCode: string;
  // 是否抵押
  mortgage?: boolean;
  static names(): { [key: string]: string } {
    return {
      licenseNo: 'license_no',
      vin: 'vin',
      engineNo: 'engine_no',
      registerDate: 'register_date',
      modelCode: 'model_code',
      useNatureCode: 'use_nature_code',
      mortgage: 'mortgage',
    };
  }

  static types(): { [key: string]: any } {
    return {
      licenseNo: 'string',
      vin: 'string',
      engineNo: 'string',
      registerDate: 'string',
      modelCode: 'string',
      useNatureCode: 'string',
      mortgage: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商户行业资质信息
export class IndustryQualificationInfo extends $tea.Model {
  // 商户行业资质类型
  industryQualificationType: string;
  // 商户行业资质图片
  industryQualificationImage: string;
  static names(): { [key: string]: string } {
    return {
      industryQualificationType: 'industry_qualification_type',
      industryQualificationImage: 'industry_qualification_image',
    };
  }

  static types(): { [key: string]: any } {
    return {
      industryQualificationType: 'string',
      industryQualificationImage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 物流金融信用凭证信息
export class IssueInfo extends $tea.Model {
  // 信用流转批次号
  batchId?: string;
  // 合同编号
  contractId?: string;
  // 信用凭证额度
  creditLimit?: string;
  // 失败原因信息
  errMsg?: string;
  // 信用凭证到期时间
  expireDate?: string;
  // 信用凭证发起时间
  issueDate?: string;
  // 信用流转凭证
  issueId?: string;
  // 发行结果状态 
  // -1:发行失败状态， 0:未完成状态， 1:已发行状态
  status?: number;
  // 发行信用流转的运单号
  waybillId?: string;
  static names(): { [key: string]: string } {
    return {
      batchId: 'batch_id',
      contractId: 'contract_id',
      creditLimit: 'credit_limit',
      errMsg: 'err_msg',
      expireDate: 'expire_date',
      issueDate: 'issue_date',
      issueId: 'issue_id',
      status: 'status',
      waybillId: 'waybill_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      batchId: 'string',
      contractId: 'string',
      creditLimit: 'string',
      errMsg: 'string',
      expireDate: 'string',
      issueDate: 'string',
      issueId: 'string',
      status: 'number',
      waybillId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 查看应用秘钥响应信息
export class ApplicationGetSkResp extends $tea.Model {
  // 应用秘钥
  sk?: string;
  static names(): { [key: string]: string } {
    return {
      sk: 'sk',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sk: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分页失败的展示日志（过滤器：待处理、成功、已忽略）
export class CommonResponsePageableStructBody extends $tea.Model {
  // 页面规格
  pageSize?: string;
  // 当前页码
  current?: string;
  // 总条数
  total?: string;
  // 失败日志数组
  list?: TriggerLogDTOStructBody[];
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
      pageSize: 'string',
      current: 'string',
      total: 'string',
      list: { 'type': 'array', 'itemType': TriggerLogDTOStructBody },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云售卖区信息
export class ALiYunChainRegion extends $tea.Model {
  // region_id
  regionId?: string;
  // region_name
  regionName?: string;
  static names(): { [key: string]: string } {
    return {
      regionId: 'region_id',
      regionName: 'region_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      regionId: 'string',
      regionName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云售卖联盟信息
export class ALiYunBuyUnion extends $tea.Model {
  // consortium_name
  consortiumName?: string;
  // consortium_id
  consortiumId?: string;
  static names(): { [key: string]: string } {
    return {
      consortiumName: 'consortium_name',
      consortiumId: 'consortium_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      consortiumName: 'string',
      consortiumId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分享可验证声明时的核心内容
export class VcShareStruct extends $tea.Model {
  // 分享的目标VC的id
  vcId: string;
  // 目标的VC持有者的did
  ownerDid: string;
  // 在支持声明的claim字段级别分享能力时使用，可以指定哪些字段隐藏，哪些字段分享。示例中标记为”1“的是隐藏，”0“的是分享明文。
  index?: string;
  // 非托管模式下owner_did的签名，作为授权凭证
  signature?: string;
  static names(): { [key: string]: string } {
    return {
      vcId: 'vc_id',
      ownerDid: 'owner_did',
      index: 'index',
      signature: 'signature',
    };
  }

  static types(): { [key: string]: any } {
    return {
      vcId: 'string',
      ownerDid: 'string',
      index: 'string',
      signature: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 小程序浏览器授权类型
export class MiniAppBrowserAuthType extends $tea.Model {
  // 授权类型
  authType: string;
  static names(): { [key: string]: string } {
    return {
      authType: 'auth_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 链上交易信息
export class TxInfo extends $tea.Model {
  // 上链结果
  txReceiptResult: string;
  // 区块链id
  bizId: string;
  // 交易hash
  txHash: string;
  // 交易类型
  txType: string;
  // 时间戳
  timestamp: number;
  // 区块高度
  blockNumber: string;
  // 交易随机数Nonce
  nonce: string;
  // 发起地址
  from: string;
  // 目标地址
  to: string;
  // 签名
  signature: string;
  static names(): { [key: string]: string } {
    return {
      txReceiptResult: 'tx_receipt_result',
      bizId: 'biz_id',
      txHash: 'tx_hash',
      txType: 'tx_type',
      timestamp: 'timestamp',
      blockNumber: 'block_number',
      nonce: 'nonce',
      from: 'from',
      to: 'to',
      signature: 'signature',
    };
  }

  static types(): { [key: string]: any } {
    return {
      txReceiptResult: 'string',
      bizId: 'string',
      txHash: 'string',
      txType: 'string',
      timestamp: 'number',
      blockNumber: 'string',
      nonce: 'string',
      from: 'string',
      to: 'string',
      signature: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 服务发现结果
export class ServiceDiscoveryResult extends $tea.Model {
  // 提供该服务能力的did
  did: string;
  // 提供该服务能力的endpoint信息
  services: DidDocServicesInfo[];
  static names(): { [key: string]: string } {
    return {
      did: 'did',
      services: 'services',
    };
  }

  static types(): { [key: string]: any } {
    return {
      did: 'string',
      services: { 'type': 'array', 'itemType': DidDocServicesInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 蚂蚁链交易汇总信息
export class BlockchainBrowserTransactionStatistic extends $tea.Model {
  // 蚂蚁链id
  bizid: string;
  // 开始时间
  createTime: number;
  // 时间点
  dateTime: string;
  // 统计时间内最新块高度
  lastSumBlockHeight: number;
  // 统计周期内交易的数量
  transCount: number;
  static names(): { [key: string]: string } {
    return {
      bizid: 'bizid',
      createTime: 'create_time',
      dateTime: 'date_time',
      lastSumBlockHeight: 'last_sum_block_height',
      transCount: 'trans_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizid: 'string',
      createTime: 'number',
      dateTime: 'string',
      lastSumBlockHeight: 'number',
      transCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云区块链Rest信息
export class ALiYunChainRest extends $tea.Model {
  // access_id
  accessId?: string;
  // create_time
  createTime?: number;
  // rest
  rest?: string;
  // update_time
  updateTime?: number;
  // REST开通结果
  result?: string;
  static names(): { [key: string]: string } {
    return {
      accessId: 'access_id',
      createTime: 'create_time',
      rest: 'rest',
      updateTime: 'update_time',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accessId: 'string',
      createTime: 'number',
      rest: 'string',
      updateTime: 'number',
      result: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 通过controller注册用户
export class VcControllerAddUserRegisterPayload extends $tea.Model {
  // 注册用户did
  did: string;
  // 用户did对应的授权公钥
  publicKey: string;
  // 业务区块连的bizid
  vcChannel?: string;
  static names(): { [key: string]: string } {
    return {
      did: 'did',
      publicKey: 'public_key',
      vcChannel: 'vc_channel',
    };
  }

  static types(): { [key: string]: any } {
    return {
      did: 'string',
      publicKey: 'string',
      vcChannel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 账户信息
export class AccountInfo extends $tea.Model {
  // 版通数量
  epAmount: number;
  // 版通代码
  epCode: string;
  static names(): { [key: string]: string } {
    return {
      epAmount: 'ep_amount',
      epCode: 'ep_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      epAmount: 'number',
      epCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云区块链配置信息
export class ALiYunChainConfigOption extends $tea.Model {
  // config_option
  configOption?: string;
  // show_name
  showName?: string;
  // enable
  enable?: boolean;
  static names(): { [key: string]: string } {
    return {
      configOption: 'config_option',
      showName: 'show_name',
      enable: 'enable',
    };
  }

  static types(): { [key: string]: any } {
    return {
      configOption: 'string',
      showName: 'string',
      enable: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 删除资源返回结果
export class ALiYunDeleteResource extends $tea.Model {
  // data
  data?: boolean;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      data: 'data',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      data: 'boolean',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 交易详情
export class TransactionInfo extends $tea.Model {
  // 交易时间戳
  timestamp: number;
  // 交易hash
  hash: string;
  // 交易块高
  height: number;
  // 交易所在块高
  blockhash: string;
  // 交易来源
  from: string;
  // 交易地址
  to: string;
  // 交易类型
  txtype: number;
  // 转账额度
  value: number;
  // logs
  logs: string;
  // 燃料消耗
  gasused: number;
  // result
  result: string;
  // 拓展json字段
  json: string;
  static names(): { [key: string]: string } {
    return {
      timestamp: 'timestamp',
      hash: 'hash',
      height: 'height',
      blockhash: 'blockhash',
      from: 'from',
      to: 'to',
      txtype: 'txtype',
      value: 'value',
      logs: 'logs',
      gasused: 'gasused',
      result: 'result',
      json: 'json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      timestamp: 'number',
      hash: 'string',
      height: 'number',
      blockhash: 'string',
      from: 'string',
      to: 'string',
      txtype: 'number',
      value: 'number',
      logs: 'string',
      gasused: 'number',
      result: 'string',
      json: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云区块链小程序权限控制信息
export class ALiYunChainMiniAppAuthorization extends $tea.Model {
  // ant_chain_id
  antChainId?: string;
  // q_r_code_type
  qRCodeType?: string;
  // authorization_type
  authorizationType?: string;
  static names(): { [key: string]: string } {
    return {
      antChainId: 'ant_chain_id',
      qRCodeType: 'q_r_code_type',
      authorizationType: 'authorization_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      antChainId: 'string',
      qRCodeType: 'string',
      authorizationType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 历史任务信息
export class OldTaskInfo extends $tea.Model {
  // 任务标题(同一个租户不能重复)
  taskName: string;
  // appId
  appId: string;
  // 问卷ID
  surveyId: string;
  // 备注信息
  notes?: string;
  // 租户ID
  tenantId: string;
  // 操作者
  operator: string;
  // banner标题
  bannerTitle: string;
  // banner图片地址（最多支持3张）
  bannerImageUrls?: string;
  // banner 图片地址, 拼装后的url
  bannerImageFullUrls?: string[];
  // 题量
  questionNum: number;
  // 任务连接地址
  taskLinkUrl: string;
  // 人群划分描述
  personDivideContent?: string;
  // 城市列表
  cityDivideUrls?: string;
  // 城市列表, 拼装后的url
  cityDivideFullUrls?: string[];
  // 样本数量
  sampleNum: number;
  // 完成样本量
  completedNum: number;
  // 产品下单code类型（1-资源包 2-后付费）
  productCodeType: string;
  // 产品余量
  productCapacity: number;
  // 奖励渠道（0-手动发支付宝余额 1-海豚红包 2-问卷自带）
  prizeChannel: number;
  // 支付宝账号
  alipayAccountId?: string;
  // 奖励类型（0-定额红包）
  prizeType: number;
  // 全额红包金额，奖励渠道为0和1时
  fullRedPacketAmount: string;
  // 全额红包描述，奖励渠道为2时，此处必填
  fullRedPacketTextInfo?: string;
  // 甄别红包金额
  examineRedPacketAmount: string;
  // 关联的证书instanceId
  certInstanceId?: string;
  // 证书实例详情
  certInstanceDetail?: CertInstanceDetail;
  // 审核建议
  verifyComment?: string;
  // 任务创建时间
  gmtCreate: string;
  // 任务更新时间
  gmtModified: string;
  // 审核理由
  reviewContent?: string;
  // 人群配置信息
  crowdConfig?: string;
  // 任务ID
  taskId: string;
  // 状态
  status: number;
  static names(): { [key: string]: string } {
    return {
      taskName: 'task_name',
      appId: 'app_id',
      surveyId: 'survey_id',
      notes: 'notes',
      tenantId: 'tenant_id',
      operator: 'operator',
      bannerTitle: 'banner_title',
      bannerImageUrls: 'banner_image_urls',
      bannerImageFullUrls: 'banner_image_full_urls',
      questionNum: 'question_num',
      taskLinkUrl: 'task_link_url',
      personDivideContent: 'person_divide_content',
      cityDivideUrls: 'city_divide_urls',
      cityDivideFullUrls: 'city_divide_full_urls',
      sampleNum: 'sample_num',
      completedNum: 'completed_num',
      productCodeType: 'product_code_type',
      productCapacity: 'product_capacity',
      prizeChannel: 'prize_channel',
      alipayAccountId: 'alipay_account_id',
      prizeType: 'prize_type',
      fullRedPacketAmount: 'full_red_packet_amount',
      fullRedPacketTextInfo: 'full_red_packet_text_info',
      examineRedPacketAmount: 'examine_red_packet_amount',
      certInstanceId: 'cert_instance_id',
      certInstanceDetail: 'cert_instance_detail',
      verifyComment: 'verify_comment',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      reviewContent: 'review_content',
      crowdConfig: 'crowd_config',
      taskId: 'task_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      taskName: 'string',
      appId: 'string',
      surveyId: 'string',
      notes: 'string',
      tenantId: 'string',
      operator: 'string',
      bannerTitle: 'string',
      bannerImageUrls: 'string',
      bannerImageFullUrls: { 'type': 'array', 'itemType': 'string' },
      questionNum: 'number',
      taskLinkUrl: 'string',
      personDivideContent: 'string',
      cityDivideUrls: 'string',
      cityDivideFullUrls: { 'type': 'array', 'itemType': 'string' },
      sampleNum: 'number',
      completedNum: 'number',
      productCodeType: 'string',
      productCapacity: 'number',
      prizeChannel: 'number',
      alipayAccountId: 'string',
      prizeType: 'number',
      fullRedPacketAmount: 'string',
      fullRedPacketTextInfo: 'string',
      examineRedPacketAmount: 'string',
      certInstanceId: 'string',
      certInstanceDetail: CertInstanceDetail,
      verifyComment: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      reviewContent: 'string',
      crowdConfig: 'string',
      taskId: 'string',
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云蚂蚁区块链相关下载结果
export class ALiYunChainDownload extends $tea.Model {
  // private_key
  privateKey?: string;
  // download_path
  downloadPath?: ALiYunDownloadPath;
  static names(): { [key: string]: string } {
    return {
      privateKey: 'private_key',
      downloadPath: 'download_path',
    };
  }

  static types(): { [key: string]: any } {
    return {
      privateKey: 'string',
      downloadPath: ALiYunDownloadPath,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 授权协议信息
export class AgreementConfigInfoDTO extends $tea.Model {
  // 协议名称
  agreementName: string;
  // 协议链接
  agreementUrl: string;
  // 协议描述
  agreementDesc: string;
  // 协议版本
  version?: number;
  static names(): { [key: string]: string } {
    return {
      agreementName: 'agreement_name',
      agreementUrl: 'agreement_url',
      agreementDesc: 'agreement_desc',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      agreementName: 'string',
      agreementUrl: 'string',
      agreementDesc: 'string',
      version: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云链统计信息
export class ALiYunChainStatics extends $tea.Model {
  // alias
  alias?: string;
  // Dt
  dt?: number;
  // trans_count
  transCount?: number;
  // last_sum_block_height
  lastSumBlockHeight?: number;
  // creat_time
  creatTime?: number;
  static names(): { [key: string]: string } {
    return {
      alias: 'alias',
      dt: 'dt',
      transCount: 'trans_count',
      lastSumBlockHeight: 'last_sum_block_height',
      creatTime: 'creat_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      alias: 'string',
      dt: 'number',
      transCount: 'number',
      lastSumBlockHeight: 'number',
      creatTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云蚂蚁区块链证书列表信息
export class ALiYunCertificateApplications extends $tea.Model {
  // pagination
  pagination?: ALiYunPagination;
  // certificate_application
  certificateApplications?: ALiYunCertificateApplication[];
  static names(): { [key: string]: string } {
    return {
      pagination: 'pagination',
      certificateApplications: 'certificate_applications',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pagination: ALiYunPagination,
      certificateApplications: { 'type': 'array', 'itemType': ALiYunCertificateApplication },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// vc传输初始化结果
export class VcTransmitInitResult extends $tea.Model {
  // 初始化成功与否
  isSuccess: boolean;
  // 失败时返回的额外信息
  message: string;
  // 接受者did
  targetVerifier: string;
  // 待签名的交易hash
  needSignatureTxHash: string;
  static names(): { [key: string]: string } {
    return {
      isSuccess: 'is_success',
      message: 'message',
      targetVerifier: 'target_verifier',
      needSignatureTxHash: 'need_signature_tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      isSuccess: 'boolean',
      message: 'string',
      targetVerifier: 'string',
      needSignatureTxHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 具体实体的身份信息
export class EntityInfo extends $tea.Model {
  // 0，身份证；1，电话；2，email，3，企业营业执照号
  type: number;
  // 具体号码
  value: string;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'number',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 链节点信息
export class NodeInfo extends $tea.Model {
  // 链的区块高度
  blockheight?: number;
  // 节点名称
  nodename?: string;
  // 节点健康状况
  status?: boolean;
  // 节点版本
  version?: string;
  static names(): { [key: string]: string } {
    return {
      blockheight: 'blockheight',
      nodename: 'nodename',
      status: 'status',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      blockheight: 'number',
      nodename: 'string',
      status: 'boolean',
      version: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// Did服务类型描述结构体
export class DidServiceType extends $tea.Model {
  // 枚举类型，描述访问服务的方式
  accessMode?: string;
  // 对服务的文字描述，<1000个字符
  description?: string;
  // 服务类型创建者did
  did: string;
  // { "item1":"", "item2":"",...
  serviceInput?: string;
  // 返回值类型描述，json形式
  serviceOutput?: string;
  // 自定义服务类型，字符数16～32个
  serviceType: string;
  static names(): { [key: string]: string } {
    return {
      accessMode: 'access_mode',
      description: 'description',
      did: 'did',
      serviceInput: 'service_input',
      serviceOutput: 'service_output',
      serviceType: 'service_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accessMode: 'string',
      description: 'string',
      did: 'string',
      serviceInput: 'string',
      serviceOutput: 'string',
      serviceType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应用请求
export class ApplicationQueryReq extends $tea.Model {
  // 应用程序ID
  applicationId: string;
  static names(): { [key: string]: string } {
    return {
      applicationId: 'application_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      applicationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分账信息
export class OpenApiRoyaltyDetailInfoPojo extends $tea.Model {
  // 分账比例
  percentage?: string;
  // 分账金额
  amount?: string;
  // 分账类型
  royaltyType?: string;
  // 支出方账户类型
  transOutType?: string;
  // 支出方账户
  transOut?: string;
  // 收入方账户类型
  transInType?: string;
  // 收入方账户
  transIn?: string;
  // 分账描述
  desc?: string;
  static names(): { [key: string]: string } {
    return {
      percentage: 'percentage',
      amount: 'amount',
      royaltyType: 'royalty_type',
      transOutType: 'trans_out_type',
      transOut: 'trans_out',
      transInType: 'trans_in_type',
      transIn: 'trans_in',
      desc: 'desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      percentage: 'string',
      amount: 'string',
      royaltyType: 'string',
      transOutType: 'string',
      transOut: 'string',
      transInType: 'string',
      transIn: 'string',
      desc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合约信息
export class ContractInfo extends $tea.Model {
  // 合约地址
  contract?: string;
  // 部署hash
  hash?: string;
  // 合约部署时间
  timestamp?: number;
  static names(): { [key: string]: string } {
    return {
      contract: 'contract',
      hash: 'hash',
      timestamp: 'timestamp',
    };
  }

  static types(): { [key: string]: any } {
    return {
      contract: 'string',
      hash: 'string',
      timestamp: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 创建VC参数
export class AddVC extends $tea.Model {
  // vc原文hash
  contentHash: string;
  // issuer后缀的hash值
  issuerHash: string;
  // valid or invalid
  status: string;
  // 接收者后缀hash值
  subjectHash: string;
  // 可验证声明id
  vcId: string;
  static names(): { [key: string]: string } {
    return {
      contentHash: 'content_hash',
      issuerHash: 'issuer_hash',
      status: 'status',
      subjectHash: 'subject_hash',
      vcId: 'vc_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      contentHash: 'string',
      issuerHash: 'string',
      status: 'string',
      subjectHash: 'string',
      vcId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 带单位的值
export class ValueUnitPair extends $tea.Model {
  // 数值
  value: number;
  // 单位
  unit: string;
  static names(): { [key: string]: string } {
    return {
      value: 'value',
      unit: 'unit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      value: 'number',
      unit: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云区块链小程序交易二维码生成
export class ALiYunChainMiniAppCodeCreate extends $tea.Model {
  // ant_chain_id
  antChainId?: string;
  // transaction_hash
  transactionHash?: string;
  // base64_q_r_code_p_n_g
  base64QRCodePNG?: string;
  // q_r_code_content
  qRCodeContent?: string;
  static names(): { [key: string]: string } {
    return {
      antChainId: 'ant_chain_id',
      transactionHash: 'transaction_hash',
      base64QRCodePNG: 'base64_q_r_code_p_n_g',
      qRCodeContent: 'q_r_code_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      antChainId: 'string',
      transactionHash: 'string',
      base64QRCodePNG: 'string',
      qRCodeContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 描述分布的结构，目前主要包含date和value值
export class Curve extends $tea.Model {
  // 分布以day为单位的日期
  date: string;
  // 以day为单位的一天凭证颁发的数据量统计。
  value: string;
  static names(): { [key: string]: string } {
    return {
      date: 'date',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      date: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 存证元数据
export class NotaryMetaParam extends $tea.Model {
  // 描述本条存证在存证事务中的阶段，用户可自行维护
  phase: string;
  // 扩展字段
  properties?: string;
  // 全局唯一的存证事务ID
  token: string;
  static names(): { [key: string]: string } {
    return {
      phase: 'phase',
      properties: 'properties',
      token: 'token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      phase: 'string',
      properties: 'string',
      token: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用于内部业务统计的信息，外部商户请忽略
export class BizInfo extends $tea.Model {
  // BPWZPFCN
  clientTenent?: string;
  // 业务代码
  code?: string;
  static names(): { [key: string]: string } {
    return {
      clientTenent: 'client_tenent',
      code: 'code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      clientTenent: 'string',
      code: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数字资产管理平台版通交易信息
export class EPTradeInfo extends $tea.Model {
  // 版通代码
  epCode: string;
  // 版通交易号
  txCode: string;
  // 卖方账户
  txFrom: string;
  // 交易时间戳
  txTime: number;
  // 买方账户
  txTo: string;
  // 交易数量
  txValue: number;
  static names(): { [key: string]: string } {
    return {
      epCode: 'ep_code',
      txCode: 'tx_code',
      txFrom: 'tx_from',
      txTime: 'tx_time',
      txTo: 'tx_to',
      txValue: 'tx_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      epCode: 'string',
      txCode: 'string',
      txFrom: 'string',
      txTime: 'number',
      txTo: 'string',
      txValue: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 可信存证身份识别信息
export class Identity extends $tea.Model {
  // 经办人姓名，企业认证必选
  agent?: string;
  // 经办人身份证
  agentId?: string;
  // 用户名称
  certName: string;
  // 证件号
  certNo: string;
  // 证件类型，个人只支持身份证IDENTITY_CARD，企业支持UNIFIED_SOCIAL_CREDIT_CODE（统一社会信用代码）和ENTERPRISE_REGISTERED_NUMBER（企业工商注册号
  certType: string;
  // 法人姓名，企业认证必选
  legalPerson?: string;
  // 法人身份证,  企业认证必选
  legalPersonId?: string;
  // 用户手机号码
  mobileNo?: string;
  // 扩展属性
  properties?: string;
  // 用户类型，PERSON或者ENTERPRISE
  userType: string;
  static names(): { [key: string]: string } {
    return {
      agent: 'agent',
      agentId: 'agent_id',
      certName: 'cert_name',
      certNo: 'cert_no',
      certType: 'cert_type',
      legalPerson: 'legal_person',
      legalPersonId: 'legal_person_id',
      mobileNo: 'mobile_no',
      properties: 'properties',
      userType: 'user_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      agent: 'string',
      agentId: 'string',
      certName: 'string',
      certNo: 'string',
      certType: 'string',
      legalPerson: 'string',
      legalPersonId: 'string',
      mobileNo: 'string',
      properties: 'string',
      userType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 联系人信息
export class ContactInfo extends $tea.Model {
  // 联系人名字
  name: string;
  // 手机号
  mobile: string;
  // 电子邮箱
  email?: string;
  // 电话
  phone?: string;
  // 身份证号
  idCardNo?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      mobile: 'mobile',
      email: 'email',
      phone: 'phone',
      idCardNo: 'id_card_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      mobile: 'string',
      email: 'string',
      phone: 'string',
      idCardNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 营销分销平台推广人账户信息
export class FundInfo extends $tea.Model {
  // 可提现余额
  balance: string;
  // 待结算额度
  settleQuota: string;
  // 商户id
  shopId: string;
  static names(): { [key: string]: string } {
    return {
      balance: 'balance',
      settleQuota: 'settle_quota',
      shopId: 'shop_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      balance: 'string',
      settleQuota: 'string',
      shopId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// VC Repo用户注册结构体
export class VcUserRegisterPayload extends $tea.Model {
  // 用户did对应的授权公钥
  publicKey?: string;
  // 业务区块连的bizid
  vcChannel?: string;
  static names(): { [key: string]: string } {
    return {
      publicKey: 'public_key',
      vcChannel: 'vc_channel',
    };
  }

  static types(): { [key: string]: any } {
    return {
      publicKey: 'string',
      vcChannel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云请求结果
export class ALiYunHandleBabelMns extends $tea.Model {
  // message
  message?: string;
  // request_id
  requestId?: string;
  // success
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      message: 'message',
      requestId: 'request_id',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      message: 'string',
      requestId: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 溯源信息中的一项记录。
export class Item extends $tea.Model {
  // 溯源项的具体内容
  desc: string;
  // 扩展信息 ，json格式
  extInfo: string;
  // 溯源项的键值
  key: string;
  // 溯源项的中文标题 
  title: string;
  // 内容类型 
  type: string;
  static names(): { [key: string]: string } {
    return {
      desc: 'desc',
      extInfo: 'ext_info',
      key: 'key',
      title: 'title',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      desc: 'string',
      extInfo: 'string',
      key: 'string',
      title: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// C3S可信计算服务TAPP应用信息
export class TappInfo extends $tea.Model {
  // C3S可信计算TAPP应用标识
  taapId: string;
  // C3S可信计算TAPP版本
  tappVersion: number;
  static names(): { [key: string]: string } {
    return {
      taapId: 'taap_id',
      tappVersion: 'tapp_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      taapId: 'string',
      tappVersion: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// BaaS平台联盟信息
export class BaasUnionInfo extends $tea.Model {
  // 联盟名称
  unionName: string;
  // 描述
  unionDescription: string;
  // 联系人
  unionUser: string;
  // 联盟联系人手机号码
  unionUserCell: string;
  // 联盟联系人邮箱
  unionUserMail: string;
  static names(): { [key: string]: string } {
    return {
      unionName: 'union_name',
      unionDescription: 'union_description',
      unionUser: 'union_user',
      unionUserCell: 'union_user_cell',
      unionUserMail: 'union_user_mail',
    };
  }

  static types(): { [key: string]: any } {
    return {
      unionName: 'string',
      unionDescription: 'string',
      unionUser: 'string',
      unionUserCell: 'string',
      unionUserMail: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// blockchain交易结构体
export class TransactionPo extends $tea.Model {
  // 交易所在块hash
  blockHash?: string;
  // 交易来源
  from?: string;
  // gas消耗
  gasUsed?: number;
  // 交易hash
  hash?: string;
  // 交易所在块 块高
  height?: number;
  // 交易返回结果
  result?: string;
  // 交易时间
  timestamp?: number;
  // 交易地址
  to?: string;
  // 交易类型 同SDK
  txType?: number;
  // 转账额度
  value?: number;
  static names(): { [key: string]: string } {
    return {
      blockHash: 'block_hash',
      from: 'from',
      gasUsed: 'gas_used',
      hash: 'hash',
      height: 'height',
      result: 'result',
      timestamp: 'timestamp',
      to: 'to',
      txType: 'tx_type',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      blockHash: 'string',
      from: 'string',
      gasUsed: 'number',
      hash: 'string',
      height: 'number',
      result: 'string',
      timestamp: 'number',
      to: 'string',
      txType: 'number',
      value: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// VC链上传输结果
export class VcTransmitResult extends $tea.Model {
  // 成功或者失败
  isSuccess: boolean;
  // 失败信息
  message?: string;
  // 验证verifier did
  targetVerifier: string;
  // 交易hash
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      isSuccess: 'is_success',
      message: 'message',
      targetVerifier: 'target_verifier',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      isSuccess: 'boolean',
      message: 'string',
      targetVerifier: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分账主体
export class RoyaltyEntity extends $tea.Model {
  // 分账接收方类型
  type: string;
  // 分账接收方账号
  account: string;
  // 分账接收方真实姓名
  name?: string;
  // 分账关系描述
  memo?: string;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      account: 'account',
      name: 'name',
      memo: 'memo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      account: 'string',
      name: 'string',
      memo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 可信时间信息结构
export class TsrResponse extends $tea.Model {
  // hash后的信息
  hashedMessage: string;
  // 哈希算法
  hashAlgorithm: string;
  // 时间
  ts: string;
  static names(): { [key: string]: string } {
    return {
      hashedMessage: 'hashed_message',
      hashAlgorithm: 'hash_algorithm',
      ts: 'ts',
    };
  }

  static types(): { [key: string]: any } {
    return {
      hashedMessage: 'string',
      hashAlgorithm: 'string',
      ts: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品信息
export class GoodsDetail extends $tea.Model {
  // 商品编号
  goodsId: string;
  // 商品名称
  goodsName: string;
  // 商品数量
  quantity: string;
  // 商品单价
  price: string;
  // 商品类目
  goodsCategory?: string;
  // 商品类目树
  categoriesTree?: string;
  // 商品的展示地址
  showUrl?: string;
  // 商品69条码
  goodsEanId?: string;
  // 商家侧小程序商品 ID
  outItemId?: string;
  // 商家侧小程序商品ID
  outSkuId?: string;
  static names(): { [key: string]: string } {
    return {
      goodsId: 'goods_id',
      goodsName: 'goods_name',
      quantity: 'quantity',
      price: 'price',
      goodsCategory: 'goods_category',
      categoriesTree: 'categories_tree',
      showUrl: 'show_url',
      goodsEanId: 'goods_ean_id',
      outItemId: 'out_item_id',
      outSkuId: 'out_sku_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      goodsId: 'string',
      goodsName: 'string',
      quantity: 'string',
      price: 'string',
      goodsCategory: 'string',
      categoriesTree: 'string',
      showUrl: 'string',
      goodsEanId: 'string',
      outItemId: 'string',
      outSkuId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云数据导出服务TriggerDTO结构体
export class TriggerDTOStructBody extends $tea.Model {
  // 名称
  name?: string;
  // 类型
  type?: string;
  // 源
  source?: string;
  // 创建时间
  createTime?: string;
  // 错误信息
  errorMessage?: string;
  // 状态
  status?: string;
  // option（map结构，由于金融云无map接口所以通过string类型传输json格式）
  option?: string;
  // checkpoint类
  checkpoint?: CheckPointStructBody;
  // 待处理的错误事件总数
  pendingErrorLogs?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      type: 'type',
      source: 'source',
      createTime: 'create_time',
      errorMessage: 'error_message',
      status: 'status',
      option: 'option',
      checkpoint: 'checkpoint',
      pendingErrorLogs: 'pending_error_logs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      type: 'string',
      source: 'string',
      createTime: 'string',
      errorMessage: 'string',
      status: 'string',
      option: 'string',
      checkpoint: CheckPointStructBody,
      pendingErrorLogs: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 人群配置
export class CrowdNodeDTO extends $tea.Model {
  // 节点id
  nodeId: string;
  // 节点类型
  nodeType: CrowdNodeTypeEnum;
  // 是否排除
  exclude: boolean;
  // 节点配置
  nodeConfig: string;
  static names(): { [key: string]: string } {
    return {
      nodeId: 'node_id',
      nodeType: 'node_type',
      exclude: 'exclude',
      nodeConfig: 'node_config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      nodeId: 'string',
      nodeType: CrowdNodeTypeEnum,
      exclude: 'boolean',
      nodeConfig: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 可信存证存证地点信息
export class Location extends $tea.Model {
  // 所在城市
  city?: string;
  // 操作IMEI
  imei?: string;
  // 操作IMSI
  imsi?: string;
  // 操作IP地址
  ip?: string;
  // 纬度
  latitude?: string;
  // 经度
  longitude?: string;
  // 扩展属性
  propertities?: string;
  // 操作Wi-Fi物理地址
  wifiMac?: string;
  static names(): { [key: string]: string } {
    return {
      city: 'city',
      imei: 'imei',
      imsi: 'imsi',
      ip: 'ip',
      latitude: 'latitude',
      longitude: 'longitude',
      propertities: 'propertities',
      wifiMac: 'wifi_mac',
    };
  }

  static types(): { [key: string]: any } {
    return {
      city: 'string',
      imei: 'string',
      imsi: 'string',
      ip: 'string',
      latitude: 'string',
      longitude: 'string',
      propertities: 'string',
      wifiMac: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 营销分销推广人账户流水信息
export class CapitalInfo extends $tea.Model {
  // 记录流水额度
  balanceLog: string;
  // 商户id
  shopId: string;
  // 记录时间
  timeLog: number;
  // 链上地址
  txHash: string;
  static names(): { [key: string]: string } {
    return {
      balanceLog: 'balance_log',
      shopId: 'shop_id',
      timeLog: 'time_log',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      balanceLog: 'string',
      shopId: 'string',
      timeLog: 'number',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云区块链小程序日志查询
export class ALiYunChainMiniAppLog extends $tea.Model {
  // access_count
  accessCount?: number;
  // access_alipay_account_count
  accessAlipayAccountCount?: number;
  static names(): { [key: string]: string } {
    return {
      accessCount: 'access_count',
      accessAlipayAccountCount: 'access_alipay_account_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accessCount: 'number',
      accessAlipayAccountCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订单结果
export class OrderResult extends $tea.Model {
  // 事例id
  instanceId: string;
  // 是否成功
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

// 蚂蚁链节点信息
export class BlockchainBrowserNodeOwner extends $tea.Model {
  // node_id
  nodeId: string;
  // node_ip
  nodeIp: string;
  // node_name
  nodeName: string;
  // node_owner
  nodeOwner: string;
  // node_port
  nodePort: string;
  // node_source
  nodeSource: string;
  // node_state
  nodeState: string;
  // node_type
  nodeType: string;
  // 节点已使用的存储空间
  nodeDiskUsed: string;
  // 节点的总存储空间
  nodeDiskTotal: string;
  static names(): { [key: string]: string } {
    return {
      nodeId: 'node_id',
      nodeIp: 'node_ip',
      nodeName: 'node_name',
      nodeOwner: 'node_owner',
      nodePort: 'node_port',
      nodeSource: 'node_source',
      nodeState: 'node_state',
      nodeType: 'node_type',
      nodeDiskUsed: 'node_disk_used',
      nodeDiskTotal: 'node_disk_total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      nodeId: 'string',
      nodeIp: 'string',
      nodeName: 'string',
      nodeOwner: 'string',
      nodePort: 'string',
      nodeSource: 'string',
      nodeState: 'string',
      nodeType: 'string',
      nodeDiskUsed: 'string',
      nodeDiskTotal: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云蚂蚁区块链账户创建信息
export class ALiYunChainAccount extends $tea.Model {
  // account_private_key
  accountPrivateKey?: string;
  // account_public_key
  accountPublicKey?: string;
  // account_recover_private_key
  accountRecoverPrivateKey?: string;
  // account_recover_public_key
  accountRecoverPublicKey?: string;
  // ant_chain_id
  antChainId?: string;
  // account
  account?: string;
  static names(): { [key: string]: string } {
    return {
      accountPrivateKey: 'account_private_key',
      accountPublicKey: 'account_public_key',
      accountRecoverPrivateKey: 'account_recover_private_key',
      accountRecoverPublicKey: 'account_recover_public_key',
      antChainId: 'ant_chain_id',
      account: 'account',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accountPrivateKey: 'string',
      accountPublicKey: 'string',
      accountRecoverPrivateKey: 'string',
      accountRecoverPublicKey: 'string',
      antChainId: 'string',
      account: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 更新DID服务列表
export class UpdateDidServiceList extends $tea.Model {
  // 待更新did之前的版本号
  previousVersion: number;
  // 服务信息列表
  serviceList: DisServicesInfo[];
  static names(): { [key: string]: string } {
    return {
      previousVersion: 'previous_version',
      serviceList: 'service_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      previousVersion: 'number',
      serviceList: { 'type': 'array', 'itemType': DisServicesInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 营销分销商品信息
export class ItemDto extends $tea.Model {
  // 商品id
  productId: string;
  // 商户id
  shopId: string;
  // 链上地址
  txHash: string;
  static names(): { [key: string]: string } {
    return {
      productId: 'product_id',
      shopId: 'shop_id',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      productId: 'string',
      shopId: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 蚂蚁链最新区块列表信息
export class BlockchainBrowserLatestBlock extends $tea.Model {
  // bizid
  bizid: string;
  // block_hash
  blockHash: string;
  // create_time
  createTime: number;
  // height
  height: number;
  // previous_hash
  previousHash: string;
  // root_tx_hash
  rootTxHash: string;
  // size
  size: number;
  // transaction_size
  transactionSize: number;
  // version
  version: number;
  static names(): { [key: string]: string } {
    return {
      bizid: 'bizid',
      blockHash: 'block_hash',
      createTime: 'create_time',
      height: 'height',
      previousHash: 'previous_hash',
      rootTxHash: 'root_tx_hash',
      size: 'size',
      transactionSize: 'transaction_size',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizid: 'string',
      blockHash: 'string',
      createTime: 'number',
      height: 'number',
      previousHash: 'string',
      rootTxHash: 'string',
      size: 'number',
      transactionSize: 'number',
      version: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// VC传输确认
export class VcTransmitCnf extends $tea.Model {
  // 针对tx_hash的签名
  signature: string;
  // 交易hash
  txHash: string;
  // vc传输目标did
  verifierId: string;
  static names(): { [key: string]: string } {
    return {
      signature: 'signature',
      txHash: 'tx_hash',
      verifierId: 'verifier_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      signature: 'string',
      txHash: 'string',
      verifierId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云区块链小程序用户权限查询
export class ALiYunChainMiniAppUserPrivilege extends $tea.Model {
  // ant_chain_id
  antChainId?: string;
  // q_r_code_type
  qRCodeType?: string;
  // authorization_type
  authorizationType?: string;
  // pagination
  pagination?: ALiYunPagination;
  // ALiYunChainMiniAppAuthorizedUser
  authorizedUserList?: ALiYunChainMiniAppAuthorizedUser[];
  static names(): { [key: string]: string } {
    return {
      antChainId: 'ant_chain_id',
      qRCodeType: 'q_r_code_type',
      authorizationType: 'authorization_type',
      pagination: 'pagination',
      authorizedUserList: 'authorized_user_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      antChainId: 'string',
      qRCodeType: 'string',
      authorizationType: 'string',
      pagination: ALiYunPagination,
      authorizedUserList: { 'type': 'array', 'itemType': ALiYunChainMiniAppAuthorizedUser },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 授权服务流程信息
export class ProcessInfo extends $tea.Model {
  // 当前处理节点
  currentNode: number;
  // 扩展信息
  extensionInfo?: string;
  // 节点列表
  nodes: NodeDetail[];
  // 流程ID
  processId: string;
  // 流程状态
  processStatus: string;
  // 流程节点总数
  totalCount: number;
  // 数据对象ID
  dataId: string;
  static names(): { [key: string]: string } {
    return {
      currentNode: 'current_node',
      extensionInfo: 'extension_info',
      nodes: 'nodes',
      processId: 'process_id',
      processStatus: 'process_status',
      totalCount: 'total_count',
      dataId: 'data_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      currentNode: 'number',
      extensionInfo: 'string',
      nodes: { 'type': 'array', 'itemType': NodeDetail },
      processId: 'string',
      processStatus: 'string',
      totalCount: 'number',
      dataId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云区块链售卖资源信息
export class ALiYunChainResouceForSale extends $tea.Model {
  // region_id
  regionId?: string;
  // type_list
  typeList?: string[];
  static names(): { [key: string]: string } {
    return {
      regionId: 'region_id',
      typeList: 'type_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      regionId: 'string',
      typeList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数字资产管理平台账户映射结构
export class ExchangeAccountMap extends $tea.Model {
  // 用户联系方式
  phone: string;
  // 用户账户
  userAccount: string;
  // 用户名称
  userName: string;
  static names(): { [key: string]: string } {
    return {
      phone: 'phone',
      userAccount: 'user_account',
      userName: 'user_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      phone: 'string',
      userAccount: 'string',
      userName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云区块链创建信息
export class ALiYunChainExecuteOrder extends $tea.Model {
  // user_request_id
  userRequestId?: string;
  // data
  data?: string;
  // success
  success?: boolean;
  // code
  code?: string;
  // message
  message?: string;
  // synchro
  synchro?: boolean;
  static names(): { [key: string]: string } {
    return {
      userRequestId: 'user_request_id',
      data: 'data',
      success: 'success',
      code: 'code',
      message: 'message',
      synchro: 'synchro',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userRequestId: 'string',
      data: 'string',
      success: 'boolean',
      code: 'string',
      message: 'string',
      synchro: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 授权服务产品
export class AuthProduct extends $tea.Model {
  // 产品code
  productCode: string;
  // 产品简称
  productAbbr: string;
  static names(): { [key: string]: string } {
    return {
      productCode: 'product_code',
      productAbbr: 'product_abbr',
    };
  }

  static types(): { [key: string]: any } {
    return {
      productCode: 'string',
      productAbbr: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 账户映射的具体信息
export class AccountMap extends $tea.Model {
  // 要映射的链对应的唯一id
  bizid: string;
  // 0: 身份证；1：手机；2: 电子邮箱；3: 企业营业执照号
  entityInfoType?: number;
  // 对应entity_info_type的具体值
  // 
  entityInfoValue?: string;
  // 账户对应实体的全名
  fullName?: string;
  // 该账户在指定链上的状态1，激活，2，冻结，新建账户只能为1
  status: number;
  // 希望映射后在链上的账户名
  targetName?: string;
  // 该账户对应实体的类型：0， 个人； 1， 企业
  type?: number;
  // 自有系统中该账户的唯一标示
  uid: string;
  static names(): { [key: string]: string } {
    return {
      bizid: 'bizid',
      entityInfoType: 'entity_info_type',
      entityInfoValue: 'entity_info_value',
      fullName: 'full_name',
      status: 'status',
      targetName: 'target_name',
      type: 'type',
      uid: 'uid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizid: 'string',
      entityInfoType: 'number',
      entityInfoValue: 'string',
      fullName: 'string',
      status: 'number',
      targetName: 'string',
      type: 'number',
      uid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 任务列表分页结构体
export class PageTaskListDTO extends $tea.Model {
  // 任务列表集合
  content: TaskListInfoDTO[];
  // 总记录条目
  totalElements: number;
  // 记录总页数
  totalPages: number;
  // 页码
  number: number;
  // 每页记录条目
  size: number;
  // 每页元素个数
  numberOfElements: number;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      totalElements: 'total_elements',
      totalPages: 'total_pages',
      number: 'number',
      size: 'size',
      numberOfElements: 'number_of_elements',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: { 'type': 'array', 'itemType': TaskListInfoDTO },
      totalElements: 'number',
      totalPages: 'number',
      number: 'number',
      size: 'number',
      numberOfElements: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 服务端签名oss的url然后client直传文件到oss，此结构包含了服务端签名后的数据。
export class PresignedUrlPolicy extends $tea.Model {
  // oss访问的临时access id
  accessId: string;
  // 一个需要回调通知服务端的方法名，非必填
  callback?: string;
  // oss上的文件存放路径
  dir: string;
  // url超期的时间戳说明
  expire: string;
  // oss的地址
  host: string;
  // 被base64编码的policy内容
  policy: string;
  // 签名结果
  signature: string;
  static names(): { [key: string]: string } {
    return {
      accessId: 'access_id',
      callback: 'callback',
      dir: 'dir',
      expire: 'expire',
      host: 'host',
      policy: 'policy',
      signature: 'signature',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accessId: 'string',
      callback: 'string',
      dir: 'string',
      expire: 'string',
      host: 'string',
      policy: 'string',
      signature: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 更新did auth paylod结构体
export class UpdateDidAuthPayload extends $tea.Model {
  // 新公钥的实际控制者
  controller: string;
  // 旧Auth Key的过期时间
  previousAuthKeyExpire: string;
  // 更新Did doc的版本
  previousVersion: number;
  // 新DID Auth key的public key id
  publicKeyId: string;
  // 密钥对生成算法
  publicKeyType: string;
  // 公钥的实际值
  value: string;
  static names(): { [key: string]: string } {
    return {
      controller: 'controller',
      previousAuthKeyExpire: 'previous_auth_key_expire',
      previousVersion: 'previous_version',
      publicKeyId: 'public_key_id',
      publicKeyType: 'public_key_type',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      controller: 'string',
      previousAuthKeyExpire: 'string',
      previousVersion: 'number',
      publicKeyId: 'string',
      publicKeyType: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 获取Afts上传地址和token
export class GetAftsUploadUrlRequest extends $tea.Model {
  // 问件类型
  fileType: string;
  static names(): { [key: string]: string } {
    return {
      fileType: 'file_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fileType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// did详情
export class DidDetail extends $tea.Model {
  // 控制者的did描述符
  controller: string;
  // did描述符
  did: string;
  // did doc
  didDoc: string;
  static names(): { [key: string]: string } {
    return {
      controller: 'controller',
      did: 'did',
      didDoc: 'did_doc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      controller: 'string',
      did: 'string',
      didDoc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 蚂蚁链浏览器区块信息
export class BlockchainBrowserBlock extends $tea.Model {
  // bizid
  bizid: string;
  // blockchain_name
  blockchainName: string;
  // blockchain_status
  blockchainStatus: boolean;
  // block_hash
  blockHash: string;
  // create_time
  createTime: number;
  // hash_status
  hashStatus: boolean;
  // height
  height: number;
  // previous_hash
  previousHash: string;
  // root_tx_hash
  rootTxHash: string;
  // transaction_list
  transactionList: BlockchainBrowserTransaction[];
  // transaction_size
  transactionSize: number;
  static names(): { [key: string]: string } {
    return {
      bizid: 'bizid',
      blockchainName: 'blockchain_name',
      blockchainStatus: 'blockchain_status',
      blockHash: 'block_hash',
      createTime: 'create_time',
      hashStatus: 'hash_status',
      height: 'height',
      previousHash: 'previous_hash',
      rootTxHash: 'root_tx_hash',
      transactionList: 'transaction_list',
      transactionSize: 'transaction_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizid: 'string',
      blockchainName: 'string',
      blockchainStatus: 'boolean',
      blockHash: 'string',
      createTime: 'number',
      hashStatus: 'boolean',
      height: 'number',
      previousHash: 'string',
      rootTxHash: 'string',
      transactionList: { 'type': 'array', 'itemType': BlockchainBrowserTransaction },
      transactionSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 任务人群配置
export class TaskCrowdNodeDTO extends $tea.Model {
  // 节点ID
  nodeId: string;
  // 节点类型
  nodeType: string;
  // 是否排除
  exclude: boolean;
  // 节点配置
  nodeConfig: string;
  static names(): { [key: string]: string } {
    return {
      nodeId: 'node_id',
      nodeType: 'node_type',
      exclude: 'exclude',
      nodeConfig: 'node_config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      nodeId: 'string',
      nodeType: 'string',
      exclude: 'boolean',
      nodeConfig: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 人群匹配结果
export class MatchResult extends $tea.Model {
  // 是否匹配
  match: boolean;
  static names(): { [key: string]: string } {
    return {
      match: 'match',
    };
  }

  static types(): { [key: string]: any } {
    return {
      match: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云蚂蚁区块链信息
export class ALiYunChain extends $tea.Model {
  // notary_blockchain
  notaryBlockchain?: ALiYunNotaryBlockchain;
  // contract_blockchain
  contractBlockchain?: ALiYunContractBlockchain;
  // old_contract_blockchain
  oldContractBlockchain?: ALiYunOldContractBlockchain;
  static names(): { [key: string]: string } {
    return {
      notaryBlockchain: 'notary_blockchain',
      contractBlockchain: 'contract_blockchain',
      oldContractBlockchain: 'old_contract_blockchain',
    };
  }

  static types(): { [key: string]: any } {
    return {
      notaryBlockchain: ALiYunNotaryBlockchain,
      contractBlockchain: ALiYunContractBlockchain,
      oldContractBlockchain: ALiYunOldContractBlockchain,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 营销分销平台返佣信息
export class RakeBackInfo extends $tea.Model {
  // 推广层级
  level: number;
  // 上级推广订单id
  parentId: string;
  // 推广人id
  promoterId: string;
  // 返佣额度
  quota: string;
  // 返佣比例 10表示10%
  rate: string;
  static names(): { [key: string]: string } {
    return {
      level: 'level',
      parentId: 'parent_id',
      promoterId: 'promoter_id',
      quota: 'quota',
      rate: 'rate',
    };
  }

  static types(): { [key: string]: any } {
    return {
      level: 'number',
      parentId: 'string',
      promoterId: 'string',
      quota: 'string',
      rate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云区块链小程序交易查询信息
export class ALiYunChainMiniAppTransaction extends $tea.Model {
  // authorized
  authorized?: boolean;
  // transaction_response
  transactionResponse?: string;
  // transaction_receipt
  transactionReceipt?: string;
  static names(): { [key: string]: string } {
    return {
      authorized: 'authorized',
      transactionResponse: 'transaction_response',
      transactionReceipt: 'transaction_receipt',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authorized: 'boolean',
      transactionResponse: 'string',
      transactionReceipt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云托管账户信息
export class ALiYunChainKmsAccount extends $tea.Model {
  // 账户公钥
  pubKey?: string;
  // 托管秘钥ID
  myKmsKeyId?: string;
  static names(): { [key: string]: string } {
    return {
      pubKey: 'pub_key',
      myKmsKeyId: 'my_kms_key_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pubKey: 'string',
      myKmsKeyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 物流金融平台用户信息
export class LogisticFinUser extends $tea.Model {
  // 纳税人识别号
  draweeTaxNo: string;
  // 业务方企业id
  orgId: string;
  // 业务方用户id
  userId: string;
  static names(): { [key: string]: string } {
    return {
      draweeTaxNo: 'drawee_tax_no',
      orgId: 'org_id',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      draweeTaxNo: 'string',
      orgId: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合约查询
export class ContractQueryDetailReq extends $tea.Model {
  // 服务ID
  serviceId: string;
  static names(): { [key: string]: string } {
    return {
      serviceId: 'service_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      serviceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 车辆基本信息
export class CarInfo extends $tea.Model {
  // 车牌号
  licenseNo: string;
  // 车架号
  vin: string;
  // 发动机号
  engineNo: string;
  // 
  // 注册日期
  registerDate: string;
  // 车型
  modelCode: string;
  static names(): { [key: string]: string } {
    return {
      licenseNo: 'license_no',
      vin: 'vin',
      engineNo: 'engine_no',
      registerDate: 'register_date',
      modelCode: 'model_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      licenseNo: 'string',
      vin: 'string',
      engineNo: 'string',
      registerDate: 'string',
      modelCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 智能合约市场列表查询
export class ContractTemplateQueryReq extends $tea.Model {
  // 页码
  num: number;
  // 页大小
  size: number;
  static names(): { [key: string]: string } {
    return {
      num: 'num',
      size: 'size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      num: 'number',
      size: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分销会员用户信息
export class DistributionUser extends $tea.Model {
  // 用户创建时间
  createTime: string;
  // 用户手机号
  mobile: string;
  // 用户唯一标识
  userId: string;
  static names(): { [key: string]: string } {
    return {
      createTime: 'create_time',
      mobile: 'mobile',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      createTime: 'string',
      mobile: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 智能合约市场列表
export class ContractTemplateListResp extends $tea.Model {
  // 合约市场列表
  list?: ContractTemplateResp[];
  // 总数
  total?: number;
  static names(): { [key: string]: string } {
    return {
      list: 'list',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': ContractTemplateResp },
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 授权流程操作结果
export class ProcessResult extends $tea.Model {
  // 申请权限的扩展参数
  extension?: string;
  // 申请权限原因
  message?: string;
  // 下一个处理节点ID
  next?: string;
  // 流程ID
  processId: string;
  // 流程状态
  status: string;
  // 数据对象ID
  dataId: string;
  // 交易HASH
  txHash?: string;
  // 区块高度
  blockNumber?: number;
  // 授权凭证
  authorityCert?: string;
  static names(): { [key: string]: string } {
    return {
      extension: 'extension',
      message: 'message',
      next: 'next',
      processId: 'process_id',
      status: 'status',
      dataId: 'data_id',
      txHash: 'tx_hash',
      blockNumber: 'block_number',
      authorityCert: 'authority_cert',
    };
  }

  static types(): { [key: string]: any } {
    return {
      extension: 'string',
      message: 'string',
      next: 'string',
      processId: 'string',
      status: 'string',
      dataId: 'string',
      txHash: 'string',
      blockNumber: 'number',
      authorityCert: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据授权服务用户公钥结构体
export class PublicKey extends $tea.Model {
  // 公钥颁发者ID
  issuerId: string;
  // 公钥内容
  publicKeyContent: string;
  // 公钥接受者ID
  recipientId: string;
  static names(): { [key: string]: string } {
    return {
      issuerId: 'issuer_id',
      publicKeyContent: 'public_key_content',
      recipientId: 'recipient_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      issuerId: 'string',
      publicKeyContent: 'string',
      recipientId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合约部署记录
export class ContractRecord extends $tea.Model {
  // abi对应oss key
  abiOssKey: string;
  // abi oss 地址
  abiOssUrl?: string;
  // 区块链唯一标识
  bizid: string;
  // 区块链名称
  blockchainName: string;
  // bytecode对应oss key
  bytecodeOssKey: string;
  // bytecode oss 地址
  bytecodeOssUrl?: string;
  // 16进制表示的合约identity
  identity: string;
  // 合约代码中定义的合约实例名，比如solidity的contract 关键字后面的命名
  instanceName: string;
  // 合约名称
  name: string;
  // 发布状态，1未发布，3已发布
  publish: number;
  // 交易hash
  txHash: string;
  // solidity|cpp|go
  type: string;
  static names(): { [key: string]: string } {
    return {
      abiOssKey: 'abi_oss_key',
      abiOssUrl: 'abi_oss_url',
      bizid: 'bizid',
      blockchainName: 'blockchain_name',
      bytecodeOssKey: 'bytecode_oss_key',
      bytecodeOssUrl: 'bytecode_oss_url',
      identity: 'identity',
      instanceName: 'instance_name',
      name: 'name',
      publish: 'publish',
      txHash: 'tx_hash',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      abiOssKey: 'string',
      abiOssUrl: 'string',
      bizid: 'string',
      blockchainName: 'string',
      bytecodeOssKey: 'string',
      bytecodeOssUrl: 'string',
      identity: 'string',
      instanceName: 'string',
      name: 'string',
      publish: 'number',
      txHash: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 蚂蚁链浏览器交易收据信息
export class BlockchainBrowserTransactionReceipt extends $tea.Model {
  // data
  data: string;
  // gas_used
  gasUsed: number;
  // logs
  logs: string[];
  // result
  result: number;
  static names(): { [key: string]: string } {
    return {
      data: 'data',
      gasUsed: 'gas_used',
      logs: 'logs',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      data: 'string',
      gasUsed: 'number',
      logs: { 'type': 'array', 'itemType': 'string' },
      result: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商户站点信息（网站/APP/小程序）
export class SiteInfo extends $tea.Model {
  // 网站类型
  siteType: string;
  // 站点地址
  siteUrl: string;
  // 站点名称
  siteName: string;
  // 小程序 appId
  tinyAppId: string;
  static names(): { [key: string]: string } {
    return {
      siteType: 'site_type',
      siteUrl: 'site_url',
      siteName: 'site_name',
      tinyAppId: 'tiny_app_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      siteType: 'string',
      siteUrl: 'string',
      siteName: 'string',
      tinyAppId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数字资产管理平台批发结构
export class AccountWholesaleParam extends $tea.Model {
  // 批发数量
  epAmount: number;
  // 用户账户
  userAccount: string;
  static names(): { [key: string]: string } {
    return {
      epAmount: 'ep_amount',
      userAccount: 'user_account',
    };
  }

  static types(): { [key: string]: any } {
    return {
      epAmount: 'number',
      userAccount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发券记录列表
export class List extends $tea.Model {
  // 记录ID
  id?: number;
  // 活动ID
  activityId?: string;
  // 活动名称
  activityName?: string;
  // 用户ID
  userId?: string;
  // 业务ID
  bizId?: string;
  // 记录来源：NORMAL（正常发券）/ HAITUN_SYNC（上游补录）
  recordSource?: string;
  // 创建时间
  gmtCreate?: string;
  // 更新时间
  gmtModified?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      activityId: 'activity_id',
      activityName: 'activity_name',
      userId: 'user_id',
      bizId: 'biz_id',
      recordSource: 'record_source',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      activityId: 'string',
      activityName: 'string',
      userId: 'string',
      bizId: 'string',
      recordSource: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 更新后的任务信息
export class UpdatedTaskInfo extends $tea.Model {
  // 任务标题(同一个租户不能重复)
  taskName: string;
  // appId
  appId: string;
  // 问卷ID
  surveyId: string;
  // 任务ID
  taskId: string;
  // 备注信息
  notes?: string;
  // 租户ID
  tenantId: string;
  // 操作者ID
  operator: string;
  // banner标题
  bannerTitle: string;
  // banner图片地址（最多支持3张）
  bannerImageUrls?: string;
  // banner 图片地址, 拼装后的url
  bannerImageFullUrls?: string[];
  // 题量
  questionNum: number;
  // 任务连接地址
  taskLinkUrl: string;
  // 人群划分描述
  personDivideContent?: string;
  // 城市列表
  cityDivideUrls?: string;
  // 城市列表, 拼装后的url
  cityDivideFullUrls?: string[];
  // 样本数量
  sampleNum: number;
  // 完成样本量
  completedNum: number;
  // 产品下单code类型（1-资源包 2-后付费）
  productCodeType: string;
  // 产品余量
  productCapacity: number;
  // 奖励渠道（0-手动发支付宝余额 1-海豚红包 2-问卷自带）
  prizeChannel: number;
  // 支付宝账号
  alipayAccountId?: string;
  // 奖励类型（0-定额红包）
  prizeType: number;
  // 全额红包金额，奖励渠道为0和1时
  fullRedPacketAmount: string;
  // 全额红包描述，奖励渠道为2时，此处必填
  fullRedPacketTextInfo?: string;
  // 甄别红包金额
  examineRedPacketAmount: string;
  // 关联的证书instanceId
  certInstanceId?: string;
  // 证书实例详情
  certInstanceDetail: CertInstanceDetail;
  // 审核意见
  verifyOmment?: string;
  // 任务创建时间
  gmtCreate: string;
  // 任务修改时间
  gmtModified: string;
  // 审核理由
  reviewContent?: string;
  // 状态
  status: number;
  // 人群配置
  crowdConfig: string;
  static names(): { [key: string]: string } {
    return {
      taskName: 'task_name',
      appId: 'app_id',
      surveyId: 'survey_id',
      taskId: 'task_id',
      notes: 'notes',
      tenantId: 'tenant_id',
      operator: 'operator',
      bannerTitle: 'banner_title',
      bannerImageUrls: 'banner_image_urls',
      bannerImageFullUrls: 'banner_image_full_urls',
      questionNum: 'question_num',
      taskLinkUrl: 'task_link_url',
      personDivideContent: 'person_divide_content',
      cityDivideUrls: 'city_divide_urls',
      cityDivideFullUrls: 'city_divide_full_urls',
      sampleNum: 'sample_num',
      completedNum: 'completed_num',
      productCodeType: 'product_code_type',
      productCapacity: 'product_capacity',
      prizeChannel: 'prize_channel',
      alipayAccountId: 'alipay_account_id',
      prizeType: 'prize_type',
      fullRedPacketAmount: 'full_red_packet_amount',
      fullRedPacketTextInfo: 'full_red_packet_text_info',
      examineRedPacketAmount: 'examine_red_packet_amount',
      certInstanceId: 'cert_instance_id',
      certInstanceDetail: 'cert_instance_detail',
      verifyOmment: 'verify_omment',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      reviewContent: 'review_content',
      status: 'status',
      crowdConfig: 'crowd_config',
    };
  }

  static types(): { [key: string]: any } {
    return {
      taskName: 'string',
      appId: 'string',
      surveyId: 'string',
      taskId: 'string',
      notes: 'string',
      tenantId: 'string',
      operator: 'string',
      bannerTitle: 'string',
      bannerImageUrls: 'string',
      bannerImageFullUrls: { 'type': 'array', 'itemType': 'string' },
      questionNum: 'number',
      taskLinkUrl: 'string',
      personDivideContent: 'string',
      cityDivideUrls: 'string',
      cityDivideFullUrls: { 'type': 'array', 'itemType': 'string' },
      sampleNum: 'number',
      completedNum: 'number',
      productCodeType: 'string',
      productCapacity: 'number',
      prizeChannel: 'number',
      alipayAccountId: 'string',
      prizeType: 'number',
      fullRedPacketAmount: 'string',
      fullRedPacketTextInfo: 'string',
      examineRedPacketAmount: 'string',
      certInstanceId: 'string',
      certInstanceDetail: CertInstanceDetail,
      verifyOmment: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
      reviewContent: 'string',
      status: 'number',
      crowdConfig: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云交易查询结果
export class ALiYunTransactionResult extends $tea.Model {
  // block_hash
  blockHash?: string;
  // block_height
  blockHeight?: number;
  // block_version
  blockVersion?: string;
  // create_time
  createTime?: number;
  // hash
  hash?: string;
  // Transaction
  transaction?: ALiYunTransaction;
  static names(): { [key: string]: string } {
    return {
      blockHash: 'block_hash',
      blockHeight: 'block_height',
      blockVersion: 'block_version',
      createTime: 'create_time',
      hash: 'hash',
      transaction: 'transaction',
    };
  }

  static types(): { [key: string]: any } {
    return {
      blockHash: 'string',
      blockHeight: 'number',
      blockVersion: 'string',
      createTime: 'number',
      hash: 'string',
      transaction: ALiYunTransaction,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// waas公钥信息
export class PublicKeyInfo extends $tea.Model {
  // 公钥id
  keyId: string;
  // 公钥内容
  publicKey: string;
  // 算法类型
  signType: string;
  // 过期时间戳（毫秒）
  expire?: number;
  // 公钥状态，0:不可用 1:可用
  status: number;
  // 创建者的did
  controller?: string;
  static names(): { [key: string]: string } {
    return {
      keyId: 'key_id',
      publicKey: 'public_key',
      signType: 'sign_type',
      expire: 'expire',
      status: 'status',
      controller: 'controller',
    };
  }

  static types(): { [key: string]: any } {
    return {
      keyId: 'string',
      publicKey: 'string',
      signType: 'string',
      expire: 'number',
      status: 'number',
      controller: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 更新VC状态数据结构
export class UpdateVCStatus extends $tea.Model {
  // valid or invalid
  status: string;
  // 可验证声明id
  vcId: string;
  static names(): { [key: string]: string } {
    return {
      status: 'status',
      vcId: 'vc_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      status: 'string',
      vcId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 关联应用
export class ContractBindAppReq extends $tea.Model {
  // 应用ID
  applicationId: string;
  // 合约服务标识集合
  serviceIds?: string[];
  static names(): { [key: string]: string } {
    return {
      applicationId: 'application_id',
      serviceIds: 'service_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      applicationId: 'string',
      serviceIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户数据
export class OCUserData extends $tea.Model {
  // 创建时间
  createTime: string;
  // 手机号
  phoneNumber: string;
  // 用户姓名
  userName: string;
  static names(): { [key: string]: string } {
    return {
      createTime: 'create_time',
      phoneNumber: 'phone_number',
      userName: 'user_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      createTime: 'string',
      phoneNumber: 'string',
      userName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 车五项信息
export class CarItemsInfo extends $tea.Model {
  // 车架号
  vin?: string;
  // 发动机号
  engineNo?: string;
  // 注册日期
  registerDate?: string;
  // 品牌车型
  modelCode?: string;
  // 营运性质
  useNatureCode?: string;
  static names(): { [key: string]: string } {
    return {
      vin: 'vin',
      engineNo: 'engine_no',
      registerDate: 'register_date',
      modelCode: 'model_code',
      useNatureCode: 'use_nature_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      vin: 'string',
      engineNo: 'string',
      registerDate: 'string',
      modelCode: 'string',
      useNatureCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户身份信息
export class UserMetaInfo extends $tea.Model {
  // 用户身份信息类型
  type: string;
  // 用户身份信息
  data: KeyValuePair[];
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      data: { 'type': 'array', 'itemType': KeyValuePair },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 车辆业务价格
export class CarBusinessPrice extends $tea.Model {
  // 品牌id
  brandId: string;
  // 品牌名称
  brandName: string;
  // 车系ID
  // 
  carSeriesId: string;
  // 车系名称
  carSeries: string;
  // 车型ID
  carId: string;
  // 车型名称
  carName: string;
  // 年款
  carYear: string;
  // 城市code
  cityCode: string;
  // 城市名称
  cityName: string;
  //   车系指导价（范围值） 单位到分
  seriesGuidePrice: string;
  // 车型指导价（具体值）单位到分
  officialPrice: number;
  // 车主成交价（具体值）单位到分
  fullPrice: number;
  // 车主裸车价（具体值）单位到分
  nakedPrice: number;
  // 购置税（具体值）单位到分
  purchaseTax: number;
  // 车船税（具体值）单位到分
  vehicleVesselTax: number;
  // 商业险（具体值）单位到分
  businessInsurance: number;
  // json 扩展字段
  extraContent: string;
  static names(): { [key: string]: string } {
    return {
      brandId: 'brand_id',
      brandName: 'brand_name',
      carSeriesId: 'car_series_id',
      carSeries: 'car_series',
      carId: 'car_id',
      carName: 'car_name',
      carYear: 'car_year',
      cityCode: 'city_code',
      cityName: 'city_name',
      seriesGuidePrice: 'series_guide_price',
      officialPrice: 'official_price',
      fullPrice: 'full_price',
      nakedPrice: 'naked_price',
      purchaseTax: 'purchase_tax',
      vehicleVesselTax: 'vehicle_vessel_tax',
      businessInsurance: 'business_insurance',
      extraContent: 'extra_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      brandId: 'string',
      brandName: 'string',
      carSeriesId: 'string',
      carSeries: 'string',
      carId: 'string',
      carName: 'string',
      carYear: 'string',
      cityCode: 'string',
      cityName: 'string',
      seriesGuidePrice: 'string',
      officialPrice: 'number',
      fullPrice: 'number',
      nakedPrice: 'number',
      purchaseTax: 'number',
      vehicleVesselTax: 'number',
      businessInsurance: 'number',
      extraContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云子链列表信息
export class ALiYunChainSubnetList extends $tea.Model {
  // ant_chain_id
  antChainId?: string;
  // 子链名称
  blockchainName?: string;
  // 联盟管理员
  consortiumAdmin?: boolean;
  // 子链列表信息
  blockchainSubnetList?: ALiYunChainSubnet[];
  static names(): { [key: string]: string } {
    return {
      antChainId: 'ant_chain_id',
      blockchainName: 'blockchain_name',
      consortiumAdmin: 'consortium_admin',
      blockchainSubnetList: 'blockchain_subnet_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      antChainId: 'string',
      blockchainName: 'string',
      consortiumAdmin: 'boolean',
      blockchainSubnetList: { 'type': 'array', 'itemType': ALiYunChainSubnet },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合约服务列表查询
export class ContracPageReq extends $tea.Model {
  // 合约服务类别
  type?: string;
  // 页码
  num: number;
  // 页大小
  size: number;
  static names(): { [key: string]: string } {
    return {
      type: 'type',
      num: 'num',
      size: 'size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      type: 'string',
      num: 'number',
      size: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 批量提交结果
export class BatchSubmitCarResult extends $tea.Model {
  // 提交线索唯一请求id
  submitId: string;
  // 是否成功
  isSuccess: boolean;
  // OK
  // NO_DEMAND 无线索需求，需要重试
  // INVALID 无效，不要重试
  pushResultCode: string;
  static names(): { [key: string]: string } {
    return {
      submitId: 'submit_id',
      isSuccess: 'is_success',
      pushResultCode: 'push_result_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      submitId: 'string',
      isSuccess: 'boolean',
      pushResultCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 人群标签枚举集合对象
export class CrowdTagEnumResp extends $tea.Model {
  // 人群标签code
  crowdTag: string;
  // 人群标签枚举列表对象
  crowTagEnumItemList: CrowdTagEnumItemDTO[];
  static names(): { [key: string]: string } {
    return {
      crowdTag: 'crowd_tag',
      crowTagEnumItemList: 'crow_tag_enum_item_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      crowdTag: 'string',
      crowTagEnumItemList: { 'type': 'array', 'itemType': CrowdTagEnumItemDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 协议模板信息
export class Agreement extends $tea.Model {
  // 协议名称
  agreementName: string;
  // 协议类型
  agreementType: string;
  // 第三方原始协议链接
  agreementUrl: string;
  // 协议文件上传目录
  agreementFileOssKey: string;
  // 上传时的协议原始文件名
  agreementFileOriginalName: string;
  static names(): { [key: string]: string } {
    return {
      agreementName: 'agreement_name',
      agreementType: 'agreement_type',
      agreementUrl: 'agreement_url',
      agreementFileOssKey: 'agreement_file_oss_key',
      agreementFileOriginalName: 'agreement_file_original_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      agreementName: 'string',
      agreementType: 'string',
      agreementUrl: 'string',
      agreementFileOssKey: 'string',
      agreementFileOriginalName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云最新区块列表查询的单元信息
export class ALiYunChainBlockInfo extends $tea.Model {
  // alias
  alias?: string;
  // block_hash
  blockHash?: string;
  // root_tx_hash
  rootTxHash?: string;
  // height
  height?: number;
  // previous_hash
  previousHash?: string;
  // create_time
  createTime?: number;
  // biz_data
  bizData?: string;
  // transaction_size
  transactionSize?: number;
  // version
  version?: number;
  // size
  size?: number;
  static names(): { [key: string]: string } {
    return {
      alias: 'alias',
      blockHash: 'block_hash',
      rootTxHash: 'root_tx_hash',
      height: 'height',
      previousHash: 'previous_hash',
      createTime: 'create_time',
      bizData: 'biz_data',
      transactionSize: 'transaction_size',
      version: 'version',
      size: 'size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      alias: 'string',
      blockHash: 'string',
      rootTxHash: 'string',
      height: 'number',
      previousHash: 'string',
      createTime: 'number',
      bizData: 'string',
      transactionSize: 'number',
      version: 'number',
      size: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 组件信息
export class DiscreteValue extends $tea.Model {
  // 排序id
  sortId?: number;
  // 字段描述
  text: string;
  // 提示信息
  tips?: string;
  // 单位信息
  unit?: string;
  // 值内容
  value: string;
  static names(): { [key: string]: string } {
    return {
      sortId: 'sort_id',
      text: 'text',
      tips: 'tips',
      unit: 'unit',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sortId: 'number',
      text: 'string',
      tips: 'string',
      unit: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合约列表
export class ContractPageResp extends $tea.Model {
  // 合约列表
  list?: ContractPageListResp[];
  // 总数
  total?: number;
  static names(): { [key: string]: string } {
    return {
      list: 'list',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': ContractPageListResp },
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// AccountPo
export class AccountPo extends $tea.Model {
  // 账户 hash
  account?: string;
  // 账户创建时间
  createTime?: number;
  // 创建该账户的交易hash
  hash?: string;
  // 创建该账户的 账户hash
  parent?: string;
  static names(): { [key: string]: string } {
    return {
      account: 'account',
      createTime: 'create_time',
      hash: 'hash',
      parent: 'parent',
    };
  }

  static types(): { [key: string]: any } {
    return {
      account: 'string',
      createTime: 'number',
      hash: 'string',
      parent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// doc删除service
export class DidDeleteService extends $tea.Model {
  // 修改前did doc版本
  previousVersion: number;
  // 指定服务的id
  serviceId: string;
  static names(): { [key: string]: string } {
    return {
      previousVersion: 'previous_version',
      serviceId: 'service_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      previousVersion: 'number',
      serviceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 结算银行卡信息
export class SettleCardInfo extends $tea.Model {
  // 开户支行名
  accountBranchName: string;
  // 卡户名
  accountHolderName: string;
  // 开户行所在地-市
  accountInstCity: string;
  // 开户行简称缩写
  accountInstId: string;
  // 银行名称
  accountInstName: string;
  // 开户行所在地-省
  accountInstProvince: string;
  // 银行卡号
  accountNo: string;
  // 卡类型
  accountType: string;
  // 账号使用类型
  usageType: string;
  static names(): { [key: string]: string } {
    return {
      accountBranchName: 'account_branch_name',
      accountHolderName: 'account_holder_name',
      accountInstCity: 'account_inst_city',
      accountInstId: 'account_inst_id',
      accountInstName: 'account_inst_name',
      accountInstProvince: 'account_inst_province',
      accountNo: 'account_no',
      accountType: 'account_type',
      usageType: 'usage_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accountBranchName: 'string',
      accountHolderName: 'string',
      accountInstCity: 'string',
      accountInstId: 'string',
      accountInstName: 'string',
      accountInstProvince: 'string',
      accountNo: 'string',
      accountType: 'string',
      usageType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 可验证声明相关的事件
export class VCEvent extends $tea.Model {
  // 事件对应的合约方法
  action: string;
  // 本次事件的触发者
  from: string;
  // 事件在区块的高度
  height: number;
  // 该VC的颁发者
  issuer: string;
  // 有效，或者无效
  status: string;
  // 该vc的接受者
  subjec: string;
  // 交易hash
  // 
  txHash: string;
  // 交易在区块中的index
  txIndex: number;
  // 可验证声明Hash值
  vcHash: string;
  // vcid
  vcId: string;
  static names(): { [key: string]: string } {
    return {
      action: 'action',
      from: 'from',
      height: 'height',
      issuer: 'issuer',
      status: 'status',
      subjec: 'subjec',
      txHash: 'tx_hash',
      txIndex: 'tx_index',
      vcHash: 'vc_hash',
      vcId: 'vc_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      action: 'string',
      from: 'string',
      height: 'number',
      issuer: 'string',
      status: 'string',
      subjec: 'string',
      txHash: 'string',
      txIndex: 'number',
      vcHash: 'string',
      vcId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// dis服务发现对象
export class DisServiceInfo extends $tea.Model {
  // 提供服务的did
  controller: string;
  // 服务地址
  endPoint: string;
  // 服务id
  serviceId: string;
  // 服务类型
  serviceType: string;
  static names(): { [key: string]: string } {
    return {
      controller: 'controller',
      endPoint: 'end_point',
      serviceId: 'service_id',
      serviceType: 'service_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      controller: 'string',
      endPoint: 'string',
      serviceId: 'string',
      serviceType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户基本信息
export class CarOwnerUserInfo extends $tea.Model {
  // 用户id
  userId: string;
  // 手机号
  phoneNum: string;
  static names(): { [key: string]: string } {
    return {
      userId: 'user_id',
      phoneNum: 'phone_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userId: 'string',
      phoneNum: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// POAP徽章的详细信息
export class PoapInfo extends $tea.Model {
  // 徽章ID，具有唯一性
  poapId: string;
  // 徽章名字
  poapName: string;
  // 徽章HASH
  uniHash: string;
  // 状态，枚举值
  status?: string;
  // 徽章资源 URL
  poapUrl: string;
  // 枚举值，2D_IMAGE--2D图片渲染；3D_OASISENGINE--3D模型渲染
  renderType: string;
  // 3D模型降级使用的资源URL
  faultToleranceUrl?: string;
  // 小程序详情跳转URL。临时链接，过期时间为 detail_alipays_url_expire_time 字段的值
  detailAlipaysUrl?: string;
  // 详情页跳转URL过期时间
  detailAlipaysUrlExpireTime?: string;
  static names(): { [key: string]: string } {
    return {
      poapId: 'poap_id',
      poapName: 'poap_name',
      uniHash: 'uni_hash',
      status: 'status',
      poapUrl: 'poap_url',
      renderType: 'render_type',
      faultToleranceUrl: 'fault_tolerance_url',
      detailAlipaysUrl: 'detail_alipays_url',
      detailAlipaysUrlExpireTime: 'detail_alipays_url_expire_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      poapId: 'string',
      poapName: 'string',
      uniHash: 'string',
      status: 'string',
      poapUrl: 'string',
      renderType: 'string',
      faultToleranceUrl: 'string',
      detailAlipaysUrl: 'string',
      detailAlipaysUrlExpireTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分布式数字身份信息
export class DidInfo extends $tea.Model {
  // 分布式数字身份id
  did: string;
  // 分布式数字身份对应的用户名称
  name: string;
  static names(): { [key: string]: string } {
    return {
      did: 'did',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      did: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据隐私服务选择tapp信息的结构体
export class ChoiceTappInfo extends $tea.Model {
  // 选择的tapp的名字
  tappName: string;
  // 版本号，如果不填就选择最新的版本
  tappVersion?: number;
  // 该tapp将被声明在did doc中的id
  serviceId: string;
  static names(): { [key: string]: string } {
    return {
      tappName: 'tapp_name',
      tappVersion: 'tapp_version',
      serviceId: 'service_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tappName: 'string',
      tappVersion: 'number',
      serviceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 复制阿里云合约工程信息
export class ALiYunContractProjectDuplicate extends $tea.Model {
  // id
  id?: string;
  // consortium_id
  consortiumId?: string;
  // gmt_create
  gmtCreate?: number;
  // gmt_modified
  gmtModified?: number;
  // name
  name?: string;
  // version
  version?: string;
  // description
  description?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      consortiumId: 'consortium_id',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      name: 'name',
      version: 'version',
      description: 'description',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      consortiumId: 'string',
      gmtCreate: 'number',
      gmtModified: 'number',
      name: 'string',
      version: 'string',
      description: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 物流金融信用流转流水信息
export class CreditTransferStatementInfo extends $tea.Model {
  // 信用凭证额度
  creditLimit?: string;
  // 信用凭证到期时间
  expireDate?: string;
  // 凭证来源方did
  fromDid?: string;
  // 信用凭证发起时间
  issueDate?: string;
  // 信用流转凭证
  issueId?: string;
  // 流水类型
  stateType?: string;
  // 凭证流转方did
  toDid?: string;
  static names(): { [key: string]: string } {
    return {
      creditLimit: 'credit_limit',
      expireDate: 'expire_date',
      fromDid: 'from_did',
      issueDate: 'issue_date',
      issueId: 'issue_id',
      stateType: 'state_type',
      toDid: 'to_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      creditLimit: 'string',
      expireDate: 'string',
      fromDid: 'string',
      issueDate: 'string',
      issueId: 'string',
      stateType: 'string',
      toDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 关联奖品列表
export class PrizeList extends $tea.Model {
  // 对客展示信息
  displayInfo?: DisplayInfo;
  // 定价策略
  priceStrategy?: PriceStrategy;
  // 奖品基本信息
  prizeBaseInfo?: PrizeBaseInfo;
  static names(): { [key: string]: string } {
    return {
      displayInfo: 'display_info',
      priceStrategy: 'price_strategy',
      prizeBaseInfo: 'prize_base_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      displayInfo: DisplayInfo,
      priceStrategy: PriceStrategy,
      prizeBaseInfo: PrizeBaseInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 新车信息
export class NewCarInfo extends $tea.Model {
  // 车系
  carSeries: string;
  // 金融方案
  finaicalPlan?: string;
  // 车系id
  carSeriesId?: string;
  // 请求提交唯一id
  submitId?: string;
  // 预计购买时间
  purcharseTime?: string;
  // 用户信息
  userInfo: CarUserInfo;
  // 懂车帝或者汽车之家
  matchSource?: string;
  // 汽车之家车型id
  qcCarSeriesId?: string;
  static names(): { [key: string]: string } {
    return {
      carSeries: 'car_series',
      finaicalPlan: 'finaical_plan',
      carSeriesId: 'car_series_id',
      submitId: 'submit_id',
      purcharseTime: 'purcharse_time',
      userInfo: 'user_info',
      matchSource: 'match_source',
      qcCarSeriesId: 'qc_car_series_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      carSeries: 'string',
      finaicalPlan: 'string',
      carSeriesId: 'string',
      submitId: 'string',
      purcharseTime: 'string',
      userInfo: CarUserInfo,
      matchSource: 'string',
      qcCarSeriesId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云合约工程信息查询
export class ALiYunContractProjects extends $tea.Model {
  // pagination
  pagination?: ALiYunPagination;
  // contract_projects
  contractProjects?: ALiYunContractProject[];
  static names(): { [key: string]: string } {
    return {
      pagination: 'pagination',
      contractProjects: 'contract_projects',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pagination: ALiYunPagination,
      contractProjects: { 'type': 'array', 'itemType': ALiYunContractProject },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云区块链资源类型信息
export class ALiYunChainResouceType extends $tea.Model {
  // type_id
  typeId?: number;
  // cpu
  cpu?: number;
  // memory
  memory?: number;
  // disk
  disk?: number;
  static names(): { [key: string]: string } {
    return {
      typeId: 'type_id',
      cpu: 'cpu',
      memory: 'memory',
      disk: 'disk',
    };
  }

  static types(): { [key: string]: any } {
    return {
      typeId: 'number',
      cpu: 'number',
      memory: 'number',
      disk: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 结构化存证类型
export class DepositMetaDataItem extends $tea.Model {
  // 结构化存证时该item的描述
  desc: string;
  // 结构化存证该数据字段的唯一索引
  key: string;
  // 结构化存证时该item的类型
  // 0 text
  // 1 encrypt text
  // 2 txHash
  // 3 image url
  // 4 vedio url
  // 5 map url
  type: number;
  // 结构化数据存证时，该item的值
  value: string;
  static names(): { [key: string]: string } {
    return {
      desc: 'desc',
      key: 'key',
      type: 'type',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      desc: 'string',
      key: 'string',
      type: 'number',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云最新交易信息
export class ALiYunLatestTransaction extends $tea.Model {
  // hash
  hash?: string;
  // transaction_v10_type
  transactionV10Type?: string;
  // trans_type_v6
  transTypeV6?: string;
  // from
  from?: string;
  // to
  to?: string;
  // create_time
  createTime?: number;
  static names(): { [key: string]: string } {
    return {
      hash: 'hash',
      transactionV10Type: 'transaction_v10_type',
      transTypeV6: 'trans_type_v6',
      from: 'from',
      to: 'to',
      createTime: 'create_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      hash: 'string',
      transactionV10Type: 'string',
      transTypeV6: 'string',
      from: 'string',
      to: 'string',
      createTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分页查询请求信息
export class PageReq extends $tea.Model {
  // 页码
  num: number;
  // 页大小
  size: number;
  static names(): { [key: string]: string } {
    return {
      num: 'num',
      size: 'size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      num: 'number',
      size: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户密钥信息
export class UserBizKeyInfo extends $tea.Model {
  // 拥有该密钥的用户列表
  grantedUser: string[];
  // 密钥名称
  keyName: string;
  static names(): { [key: string]: string } {
    return {
      grantedUser: 'granted_user',
      keyName: 'key_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      grantedUser: { 'type': 'array', 'itemType': 'string' },
      keyName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 证书详情
export class BareClaim extends $tea.Model {
  // 下面的内容由调用者自己定义，建议只存放必要的声明信息，不要放置敏感数据
  claim: string;
  // 证书类型
  type?: string;
  static names(): { [key: string]: string } {
    return {
      claim: 'claim',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      claim: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合约链配置信息结果，内部包含一个列表，列举多个合约链的配置信息
export class ContractIdeConfigResult extends $tea.Model {
  // 合约链的配置信息，可包含多个合约链的配置
  contractIdeConfigList: ContractIdeConfig[];
  static names(): { [key: string]: string } {
    return {
      contractIdeConfigList: 'contract_ide_config_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      contractIdeConfigList: { 'type': 'array', 'itemType': ContractIdeConfig },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合约与应用关联信息
export class ContractBindListResp extends $tea.Model {
  // 合约关联列表
  list?: ContractBindResp[];
  static names(): { [key: string]: string } {
    return {
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      list: { 'type': 'array', 'itemType': ContractBindResp },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 合约详情
export class ContractDetailResp extends $tea.Model {
  // 合约服务ID
  serviceId?: string;
  // 合约服务名称
  name?: string;
  // 创建人
  creator?: string;
  // 创建时间
  createTime?: number;
  // 订购产品
  orderingProducts?: string;
  // 关联区块链id
  chanId?: string;
  // 合约状态
  contractStatus?: string;
  // 合约部署进度当前状态
  status?: string;
  // 合约部署进度
  progressInfoList?: InstanceProgressInfo[];
  // 实例最近调用记录(暂缓，先不做)
  recordInfoList?: InstanceRecordInfo[];
  static names(): { [key: string]: string } {
    return {
      serviceId: 'service_id',
      name: 'name',
      creator: 'creator',
      createTime: 'create_time',
      orderingProducts: 'ordering_products',
      chanId: 'chan_id',
      contractStatus: 'contract_status',
      status: 'status',
      progressInfoList: 'progress_info_list',
      recordInfoList: 'record_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      serviceId: 'string',
      name: 'string',
      creator: 'string',
      createTime: 'number',
      orderingProducts: 'string',
      chanId: 'string',
      contractStatus: 'string',
      status: 'string',
      progressInfoList: { 'type': 'array', 'itemType': InstanceProgressInfo },
      recordInfoList: { 'type': 'array', 'itemType': InstanceRecordInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 默认结算规则
export class DefaultSettleRule extends $tea.Model {
  // 默认结算类型，结算到银行卡: bankCard，结算到支付宝账号: alipayAccount
  defaultSettleType: string;
  // 默认结算目标	bankCard 时填银行卡号，alipayAccount 时填支付宝登录号
  defaultSettleTarget: string;
  static names(): { [key: string]: string } {
    return {
      defaultSettleType: 'default_settle_type',
      defaultSettleTarget: 'default_settle_target',
    };
  }

  static types(): { [key: string]: any } {
    return {
      defaultSettleType: 'string',
      defaultSettleTarget: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 托管数据库ManagedMQDTO结构体
export class ManagedMQDTOStructBody extends $tea.Model {
  // id
  id: string;
  // 实例
  instance?: string;
  // 主题
  topic?: string;
  // 类型
  type?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      instance: 'instance',
      topic: 'topic',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      instance: 'string',
      topic: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 证书批量颁发进度
export class CertIssueProgressDTO extends $tea.Model {
  // 证书实例id
  bizId: string;
  // 存证ID，如果颁发失败，此值为null
  vcId: string;
  // 因校验异常停止任务（不会继续校验文件内容和颁发证书） -3
  // 因校验内容不正确停止颁发任务(会校验完所有的行但不执行颁发) -2
  // 已手动取消（可重试状态下手动取消任务，取消状态下可以启动新的颁发任务） -1
  // 可重试 0
  // 执行中（初始状态） 1
  // 已成功完成 2
  status: number;
  // is_error=true时的错误描述
  errorMessage: string;
  // 证书的字段标题列表
  titles: string[];
  // 颁发进度百分比
  progressPercent: number;
  // 当前批次数据总行数（不含标题）
  totalNum: string;
  // 颁发证书当前执行的阶段，VERIFY：校验文件中，ISSUE：颁发中
  curTaskType: string;
  // 颁发开始的时间戳
  startTimeMillis: number;
  // 颁发结束的时间戳
  endTimeMillis: number;
  // 校验错误描述列表
  errorDetails: TemplateInstanceErrorDetailDTO[];
  static names(): { [key: string]: string } {
    return {
      bizId: 'biz_id',
      vcId: 'vc_id',
      status: 'status',
      errorMessage: 'error_message',
      titles: 'titles',
      progressPercent: 'progress_percent',
      totalNum: 'total_num',
      curTaskType: 'cur_task_type',
      startTimeMillis: 'start_time_millis',
      endTimeMillis: 'end_time_millis',
      errorDetails: 'error_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizId: 'string',
      vcId: 'string',
      status: 'number',
      errorMessage: 'string',
      titles: { 'type': 'array', 'itemType': 'string' },
      progressPercent: 'number',
      totalNum: 'string',
      curTaskType: 'string',
      startTimeMillis: 'number',
      endTimeMillis: 'number',
      errorDetails: { 'type': 'array', 'itemType': TemplateInstanceErrorDetailDTO },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 退款商品详细信息
export class RefundGoodsDetail extends $tea.Model {
  // 商品编号
  goodsId: string;
  // 该商品的退款总金额
  refundAmount: string;
  static names(): { [key: string]: string } {
    return {
      goodsId: 'goods_id',
      refundAmount: 'refund_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      goodsId: 'string',
      refundAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 存证信息集合
export class NotaryTransaction extends $tea.Model {
  // 如果存证类型为text, 则为存证内容
  // 如果存证类型为file,则为存证文件临时下载地址
  content: string;
  // 链上存证哈希
  transactionHash: string;
  // 存证类型
  type: string;
  static names(): { [key: string]: string } {
    return {
      content: 'content',
      transactionHash: 'transaction_hash',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      content: 'string',
      transactionHash: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 蚂蚁链最新交易信息
export class BlockchainBrowserLatestTransaction extends $tea.Model {
  // create_time
  createTime: number;
  // from
  from: string;
  // to
  to: string;
  // hash
  hash: string;
  // transactionV10Type
  transactionType: string;
  static names(): { [key: string]: string } {
    return {
      createTime: 'create_time',
      from: 'from',
      to: 'to',
      hash: 'hash',
      transactionType: 'transaction_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      createTime: 'number',
      from: 'string',
      to: 'string',
      hash: 'string',
      transactionType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 版通历史发行记录信息
export class EPIssueHisInfo extends $tea.Model {
  // 版通发行日期时间戳
  issueDate: number;
  // 版通线下发行量
  offlineIssueAmount: number;
  // 版通线上发行量
  onlineIssueAmount: number;
  // 版通自持发行量
  selfIssueAmount: number;
  static names(): { [key: string]: string } {
    return {
      issueDate: 'issue_date',
      offlineIssueAmount: 'offline_issue_amount',
      onlineIssueAmount: 'online_issue_amount',
      selfIssueAmount: 'self_issue_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      issueDate: 'number',
      offlineIssueAmount: 'number',
      onlineIssueAmount: 'number',
      selfIssueAmount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据资产分页查询
export class ListDataEntityResult extends $tea.Model {
  // 数据模型信息
  dataModel: DataModel;
  // 数据资产信息
  dataEntity: DataEntity;
  static names(): { [key: string]: string } {
    return {
      dataModel: 'data_model',
      dataEntity: 'data_entity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dataModel: DataModel,
      dataEntity: DataEntity,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 新建合约服务
export class ContractCreateReq extends $tea.Model {
  // 链ID
  chainId: string;
  // 合约模板标识
  templateId: string;
  // 合约名称
  name: string;
  static names(): { [key: string]: string } {
    return {
      chainId: 'chain_id',
      templateId: 'template_id',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      chainId: 'string',
      templateId: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// identity parameter
export class IdentityParam extends $tea.Model {
  // 经办人姓名
  agent?: string;
  // 经办人身份证号
  agentId?: string;
  // 用户的姓名
  certName: string;
  // 用户的身份证号
  certNo: string;
  // 用户证件类型，目前只支持IDENTITY_CARD
  certType: string;
  // 法人姓名，企业认证必选
  legalPerson?: string;
  // 法人身份证，企业认证必选
  legalPersonId?: string;
  // 手机号码
  mobileNo?: string;
  // 扩展属性字段
  properties?: string;
  // 用户类型，默认为PERSON
  userType?: string;
  static names(): { [key: string]: string } {
    return {
      agent: 'agent',
      agentId: 'agent_id',
      certName: 'cert_name',
      certNo: 'cert_no',
      certType: 'cert_type',
      legalPerson: 'legal_person',
      legalPersonId: 'legal_person_id',
      mobileNo: 'mobile_no',
      properties: 'properties',
      userType: 'user_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      agent: 'string',
      agentId: 'string',
      certName: 'string',
      certNo: 'string',
      certType: 'string',
      legalPerson: 'string',
      legalPersonId: 'string',
      mobileNo: 'string',
      properties: 'string',
      userType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云链信息
export class ALiYunChainInfo extends $tea.Model {
  // abnormal_nodes
  abnormalNodes?: number;
  // ant_chain_id
  antChainId?: string;
  // block_height
  blockHeight?: number;
  // create_time
  createTime?: number;
  // is_role
  isRole?: boolean;
  // node_number
  nodeNumber?: number;
  // normal
  normal?: boolean;
  // transaction_sum
  transactionSum?: number;
  // Version
  version?: string;
  // node_infos
  nodeInfos?: ALiYunChainNodeInfo[];
  static names(): { [key: string]: string } {
    return {
      abnormalNodes: 'abnormal_nodes',
      antChainId: 'ant_chain_id',
      blockHeight: 'block_height',
      createTime: 'create_time',
      isRole: 'is_role',
      nodeNumber: 'node_number',
      normal: 'normal',
      transactionSum: 'transaction_sum',
      version: 'version',
      nodeInfos: 'node_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      abnormalNodes: 'number',
      antChainId: 'string',
      blockHeight: 'number',
      createTime: 'number',
      isRole: 'boolean',
      nodeNumber: 'number',
      normal: 'boolean',
      transactionSum: 'number',
      version: 'string',
      nodeInfos: { 'type': 'array', 'itemType': ALiYunChainNodeInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 创建did doc时的具体操作
export class DidAddDoc extends $tea.Model {
  // did doc content
  doc: string;
  static names(): { [key: string]: string } {
    return {
      doc: 'doc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      doc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 证书模板详情类
export class TemplateInfoDTO extends $tea.Model {
  // 主键
  id: number;
  // 模板类别：马拉松类、滑雪类
  category: string;
  // 模板内容， json格式文本
  claimTemplate: string;
  // 创建时间
  gmtCreate: string;
  // 修改时间
  gmtModified: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      category: 'category',
      claimTemplate: 'claim_template',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      category: 'string',
      claimTemplate: 'string',
      gmtCreate: 'string',
      gmtModified: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 发券记录列表
export class OrderList extends $tea.Model {
  // 活动ID
  activityId?: string;
  // 记录ID
  id?: string;
  // 业务ID
  bizId?: string;
  // 奖品id
  prizeId?: string;
  // 触发时间
  sendTime?: string;
  // 发券结果
  sendStatus?: string;
  // 错误码
  errorCode?: string;
  // 错误描述
  errorMsg?: string;
  static names(): { [key: string]: string } {
    return {
      activityId: 'activity_id',
      id: 'id',
      bizId: 'biz_id',
      prizeId: 'prize_id',
      sendTime: 'send_time',
      sendStatus: 'send_status',
      errorCode: 'error_code',
      errorMsg: 'error_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      activityId: 'string',
      id: 'string',
      bizId: 'string',
      prizeId: 'string',
      sendTime: 'string',
      sendStatus: 'string',
      errorCode: 'string',
      errorMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasPromotionActivityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 活动ID，由运营线下通知分配
  activityId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      activityId: 'activity_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      activityId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasPromotionActivityResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 活动基本信息
  activityBaseInfo?: ActivityBaseInfo;
  // 关联奖品列表
  prizeList?: PrizeList;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      activityBaseInfo: 'activity_base_info',
      prizeList: 'prize_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      activityBaseInfo: ActivityBaseInfo,
      prizeList: PrizeList,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasPromotionCouponRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务ID
  bizId: string;
  // openId
  openId: string;
  // appId
  appId: string;
  // 活动ID，由运营线下通知分配
  activityId: string;
  // 奖品ID，需要指定奖品抽奖时传入
  prizeId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      openId: 'open_id',
      appId: 'app_id',
      activityId: 'activity_id',
      prizeId: 'prize_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      openId: 'string',
      appId: 'string',
      activityId: 'string',
      prizeId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasPromotionCouponResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 活动ID
  activityId?: string;
  // 活动名称
  activityName?: string;
  // 活动状态
  activityStatus?: string;
  // 子错误码
  subCode?: string;
  // 子错误描述
  subMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      activityId: 'activity_id',
      activityName: 'activity_name',
      activityStatus: 'activity_status',
      subCode: 'sub_code',
      subMessage: 'sub_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      activityId: 'string',
      activityName: 'string',
      activityStatus: 'string',
      subCode: 'string',
      subMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasPromotionCouponRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // openId
  openId?: string;
  // appId
  appId?: string;
  // 活动ID
  activityId: string;
  // 开始日期
  startDate?: string;
  // 结束日期
  endDate?: string;
  // 页码，默认 1，最小值 1
  pageNum?: number;
  // 每页数量，默认 20，范围 1~100
  pageSize?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      openId: 'open_id',
      appId: 'app_id',
      activityId: 'activity_id',
      startDate: 'start_date',
      endDate: 'end_date',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      openId: 'string',
      appId: 'string',
      activityId: 'string',
      startDate: 'string',
      endDate: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasPromotionCouponResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 记录总数
  totalCount?: number;
  // 当前页码
  pageNum?: number;
  // 每页数量
  pageSize?: number;
  // 发券记录列表
  list?: List[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalCount: 'total_count',
      pageNum: 'page_num',
      pageSize: 'page_size',
      list: 'list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalCount: 'number',
      pageNum: 'number',
      pageSize: 'number',
      list: { 'type': 'array', 'itemType': List },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPromotionActivityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 活动ID，由运营线下通知分配
  activityId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      activityId: 'activity_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      activityId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPromotionActivityResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 活动基本信息
  activityBaseInfo?: ActivityBaseInfo;
  // 关联奖品列表
  prizeList?: PrizeList;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      activityBaseInfo: 'activity_base_info',
      prizeList: 'prize_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      activityBaseInfo: ActivityBaseInfo,
      prizeList: PrizeList,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecPromotionCouponRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务ID
  bizId: string;
  // open_id
  openId: string;
  // appId
  appId: string;
  // 活动ID
  activityId: string;
  // 奖品ID，需要指定奖品抽奖时传入
  prizeId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizId: 'biz_id',
      openId: 'open_id',
      appId: 'app_id',
      activityId: 'activity_id',
      prizeId: 'prize_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizId: 'string',
      openId: 'string',
      appId: 'string',
      activityId: 'string',
      prizeId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecPromotionCouponResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 活动ID
  activityId?: string;
  // 活动名称
  activityName?: string;
  // 活动状态
  activityStatus?: string;
  // 子错误码
  subCode?: string;
  // 子错误描述
  subMessage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      activityId: 'activity_id',
      activityName: 'activity_name',
      activityStatus: 'activity_status',
      subCode: 'sub_code',
      subMessage: 'sub_message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      activityId: 'string',
      activityName: 'string',
      activityStatus: 'string',
      subCode: 'string',
      subMessage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPromotionCouponRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 活动ID
  activityId: string;
  // openId
  openId: string;
  // appId
  appId: string;
  // 开始日期
  startDate: string;
  // 结束日期
  endDate: string;
  // 页码，默认 1，最小值 1
  pageNum: number;
  // 每页数量，默认 20，范围 1~100
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      activityId: 'activity_id',
      openId: 'open_id',
      appId: 'app_id',
      startDate: 'start_date',
      endDate: 'end_date',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      activityId: 'string',
      openId: 'string',
      appId: 'string',
      startDate: 'string',
      endDate: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPromotionCouponResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 记录总数
  totalCount?: number;
  // 当前页码
  pageNum?: number;
  // 每页数量
  pageSize?: number;
  // 发券记录列表
  orderList?: OrderList[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalCount: 'total_count',
      pageNum: 'page_num',
      pageSize: 'page_size',
      orderList: 'order_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalCount: 'number',
      pageNum: 'number',
      pageSize: 'number',
      orderList: { 'type': 'array', 'itemType': OrderList },
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
          sdk_version: "1.3.0",
          _prod_code: "AGORAX",
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
   * Description: 查询活动及关联奖品详情信息
   * Summary: 查询活动及关联奖品详情信息
   */
  async queryBaasPromotionActivity(request: QueryBaasPromotionActivityRequest): Promise<QueryBaasPromotionActivityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBaasPromotionActivityEx(request, headers, runtime);
  }

  /**
   * Description: 查询活动及关联奖品详情信息
   * Summary: 查询活动及关联奖品详情信息
   */
  async queryBaasPromotionActivityEx(request: QueryBaasPromotionActivityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBaasPromotionActivityResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasPromotionActivityResponse>(await this.doRequest("1.0", "baas.promotion.activity.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBaasPromotionActivityResponse({}));
  }

  /**
   * Description: 为指定用户发放优惠券
   * Summary: 为指定用户发放优惠券
   */
  async execBaasPromotionCoupon(request: ExecBaasPromotionCouponRequest): Promise<ExecBaasPromotionCouponResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execBaasPromotionCouponEx(request, headers, runtime);
  }

  /**
   * Description: 为指定用户发放优惠券
   * Summary: 为指定用户发放优惠券
   */
  async execBaasPromotionCouponEx(request: ExecBaasPromotionCouponRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecBaasPromotionCouponResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBaasPromotionCouponResponse>(await this.doRequest("1.0", "baas.promotion.coupon.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecBaasPromotionCouponResponse({}));
  }

  /**
   * Description: 分页查询发券记录
   * Summary: 分页查询发券记录
   */
  async queryBaasPromotionCoupon(request: QueryBaasPromotionCouponRequest): Promise<QueryBaasPromotionCouponResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBaasPromotionCouponEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询发券记录
   * Summary: 分页查询发券记录
   */
  async queryBaasPromotionCouponEx(request: QueryBaasPromotionCouponRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBaasPromotionCouponResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasPromotionCouponResponse>(await this.doRequest("1.0", "baas.promotion.coupon.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBaasPromotionCouponResponse({}));
  }

  /**
   * Description: 查询活动及关联奖品详情信息
   * Summary: 查询活动及关联奖品详情信息
   */
  async queryPromotionActivity(request: QueryPromotionActivityRequest): Promise<QueryPromotionActivityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPromotionActivityEx(request, headers, runtime);
  }

  /**
   * Description: 查询活动及关联奖品详情信息
   * Summary: 查询活动及关联奖品详情信息
   */
  async queryPromotionActivityEx(request: QueryPromotionActivityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPromotionActivityResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPromotionActivityResponse>(await this.doRequest("1.0", "antdigital.agorax.promotion.activity.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPromotionActivityResponse({}));
  }

  /**
   * Description: 为指定用户发放优惠券
   * Summary: 为指定用户发放优惠券
   */
  async execPromotionCoupon(request: ExecPromotionCouponRequest): Promise<ExecPromotionCouponResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execPromotionCouponEx(request, headers, runtime);
  }

  /**
   * Description: 为指定用户发放优惠券
   * Summary: 为指定用户发放优惠券
   */
  async execPromotionCouponEx(request: ExecPromotionCouponRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecPromotionCouponResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecPromotionCouponResponse>(await this.doRequest("1.0", "antdigital.agorax.promotion.coupon.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecPromotionCouponResponse({}));
  }

  /**
   * Description: 分页查询发券记录
   * Summary: 分页查询发券记录
   */
  async queryPromotionCoupon(request: QueryPromotionCouponRequest): Promise<QueryPromotionCouponResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPromotionCouponEx(request, headers, runtime);
  }

  /**
   * Description: 分页查询发券记录
   * Summary: 分页查询发券记录
   */
  async queryPromotionCouponEx(request: QueryPromotionCouponRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPromotionCouponResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPromotionCouponResponse>(await this.doRequest("1.0", "antdigital.agorax.promotion.coupon.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPromotionCouponResponse({}));
  }

}
