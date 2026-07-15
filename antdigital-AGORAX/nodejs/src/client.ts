// This file is auto-generated, don't edit it
import AntchainUtil from '@antchain/alipay-util';
import Util, * as $Util from '@alicloud/tea-util';
import RPCUtil from '@alicloud/rpc-util';
import * as $tea from '@alicloud/tea-typescript';

/**
 * @remarks
 * Model for initing client
 */
export class Config extends $tea.Model {
  /**
   * @remarks
   * accesskey id
   */
  accessKeyId?: string;
  /**
   * @remarks
   * accesskey secret
   */
  accessKeySecret?: string;
  /**
   * @remarks
   * security token
   */
  securityToken?: string;
  /**
   * @remarks
   * http protocol
   * 
   * @example
   * http
   */
  protocol?: string;
  /**
   * @remarks
   * read timeout
   * 
   * @example
   * 10
   */
  readTimeout?: number;
  /**
   * @remarks
   * connect timeout
   * 
   * @example
   * 10
   */
  connectTimeout?: number;
  /**
   * @remarks
   * http proxy
   * 
   * @example
   * http://localhost
   */
  httpProxy?: string;
  /**
   * @remarks
   * https proxy
   * 
   * @example
   * https://localhost
   */
  httpsProxy?: string;
  /**
   * @remarks
   * endpoint
   * 
   * @example
   * cs.aliyuncs.com
   */
  endpoint?: string;
  /**
   * @remarks
   * proxy white list
   * 
   * @example
   * http://localhost
   */
  noProxy?: string;
  /**
   * @remarks
   * max idle conns
   * 
   * @example
   * 3
   */
  maxIdleConns?: number;
  /**
   * @remarks
   * user agent
   * 
   * @example
   * Alibabacloud/1
   */
  userAgent?: string;
  /**
   * @remarks
   * socks5 proxy
   */
  socks5Proxy?: string;
  /**
   * @remarks
   * socks5 network
   * 
   * @example
   * TCP
   */
  socks5NetWork?: string;
  /**
   * @remarks
   * 长链接最大空闲时长
   */
  maxIdleTimeMillis?: number;
  /**
   * @remarks
   * 长链接最大连接时长
   */
  keepAliveDurationMillis?: number;
  /**
   * @remarks
   * 最大连接数（长链接最大总数）
   */
  maxRequests?: number;
  /**
   * @remarks
   * 每个目标主机的最大连接数（分主机域名的长链接最大总数
   */
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
  /**
   * @example
   * did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
   */
  nodeId: string;
  // 节点名称
  /**
   * @example
   * Bob
   */
  nodeName: string;
  // 节点序号，从1开始编号
  /**
   * @example
   * 1
   */
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
  /**
   * @example
   * asdfasdfsadfsdafasd
   */
  data: string;
  // from
  /**
   * @example
   * eeb0aa76449922c8ec718b97ec5da4c493d46d66a1f446fdce2ba29263efd612
   */
  from: string;
  // to
  /**
   * @example
   * eeb0aa76449922c8ec718b97ec5da4c493d46d66a1f446fdce2ba29263efd612
   */
  to: string;
  // gas
  /**
   * @example
   * 0
   */
  gas: number;
  // hash
  /**
   * @example
   * 65a0a7aa9b6f739faddd8e993eadecf85340cdeda6e20417e013e052f30afd3c
   */
  hash: string;
  // nonce
  /**
   * @example
   * 395460146568219584
   */
  nonce: string;
  // period
  /**
   * @example
   * 0
   */
  period: number;
  // signature_list
  /**
   * @example
   * signature_list
   */
  signatureList: string[];
  // timestamp
  /**
   * @example
   * 1604565299516
   */
  timestamp: number;
  // transaction_type
  /**
   * @example
   * TX_DEPOSIT_DATA
   */
  transactionType: string;
  // value
  /**
   * @example
   * 0
   */
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
  /**
   * @example
   * "1"
   */
  errorCount?: string;
  // 高度
  /**
   * @example
   * "10"
   */
  height?: string;
  // 序号
  /**
   * @example
   * “1”
   */
  index?: string;
  // 最后一个错误
  /**
   * @example
   * “”
   */
  lastError?: string;
  // 类型
  /**
   * @example
   * ""
   */
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
  /**
   * @example
   * 76a0e716164848168dc726460042ee25
   */
  bizUid?: string;
  // 区块链ID
  /**
   * @example
   * cfd98b44fb3246dbbae07dae4bae59fe
   */
  blockchainId?: string;
  // 创建时间
  /**
   * @example
   * 1595574776000
   */
  createTime: number;
  // 信用代码
  /**
   * @example
   * 30405123
   */
  creditNumber?: string;
  // 扩展信息，标准JSON格式
  /**
   * @example
   * {"organization":"test","company":"test"}
   */
  extensionInfo?: string;
  // 参与方名字
  /**
   * @example
   * Bob
   */
  name: string;
  // 回调通知服务地址
  /**
   * @example
   * http://127.0.0.1
   */
  notificationService?: string;
  // 参与方ID
  /**
   * @example
   * did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
   */
  participantId: string;
  // DID  doc中的公开信息
  /**
   * @example
   * information
   */
  publicInfo?: string;
  // 参与方角色列表
  role: string[];
  // 空间ID
  /**
   * @example
   * space1
   */
  spaceId?: string;
  // 参与方状态
  /**
   * @example
   * ACTIVE,DELETED...
   */
  status?: string;
  // 更新时间
  /**
   * @example
   * 1595574776000
   */
  updateTime: number;
  // 账户名称
  /**
   * @example
   * account1
   */
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
  /**
   * @example
   * cme20230724104931af3a4d
   */
  serviceId?: string;
  // 合约名称
  /**
   * @example
   * 资产合约
   */
  name?: string;
  // 是否已关联
  /**
   * @example
   * true
   */
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
  /**
   * @example
   * xx
   */
  group?: string;
  // 条件节点
  /**
   * @example
   * xx
   */
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
  /**
   * @example
   * 普通任务
   */
  taskName: string;
  // 任务ID
  /**
   * @example
   * qdQxqU5gz
   */
  taskId: string;
  // appId
  /**
   * @example
   * 2021004121633301
   */
  appId: string;
  // 自有ID
  /**
   * @example
   * ybl1112
   */
  surveyId: string;
  // 租户ID
  /**
   * @example
   * RIVUFSJG
   */
  tenantId: string;
  // 租户名称
  /**
   * @example
   * 李强
   */
  tenantName: string;
  // 操作员
  /**
   * @example
   * eipzps@alitest.comtest
   */
  operator: string;
  // 样本数量
  sampleNum: number;
  // 完成数量
  completedNum: number;
  // 甄别数量
  screenNum: number;
  // 样本总金额
  /**
   * @example
   * 10.00
   */
  sampleTotalAmount: string;
  // 全额红包总金额
  /**
   * @example
   * 20.00
   */
  redPacketTotalAmount: string;
  // 该任务总金额
  /**
   * @example
   * 30.00
   */
  taskTotalAmount: string;
  // 全额红包金额
  /**
   * @example
   * 1.00
   */
  fullRedPacketAmount: string;
  // 甄别红包金额
  /**
   * @example
   * 0.05
   */
  examineRedPacketAmount: string;
  // 发证量
  issuedNum?: number;
  // 产品下单code类型（1-资源包 2-后付费）
  /**
   * @example
   * 1
   */
  productCodeType: string;
  // 审核理由
  /**
   * @example
   * 拒绝,图片不合适
   */
  reviewContent?: string;
  // 任务状态：0-已删、1-已完成、2-审核未通过、3-暂停、4-投放中、5-暂停中未重启、6、投放中未暂停、7-投放中未调整、8-投放中未完成、9-待投放、10-草稿任务
  /**
   * @example
   * 9
   */
  status: string;
  // ap状态，1:启用，0：审批中
  /**
   * @example
   * 1
   */
  apStatus: string;
  // 奖励渠道（0-手动发支付宝余额 1-海豚红包 2-问卷自带）
  /**
   * @example
   * 1
   */
  prizeChannel: number;
  // 奖励渠道为问卷自带时，全额红包信息
  /**
   * @example
   * 1-5元红包
   */
  fullRedPacketTextInfo?: string;
  // 修改时间
  /**
   * @example
   * 2023-12-22 10:34:11
   */
  gmtModified: string;
  // 创建时间
  /**
   * @example
   * 2023-12-22 10:11:33
   */
  gmtCreate: string;
  // 投放时间
  /**
   * @example
   * 2023-12-23 10:11:22
   */
  gmtOnline?: string;
  // 最近暂停/完成时间
  /**
   * @example
   * 2022-12-22 09:11:11
   */
  gmtPauseOrComplete?: string;
  // 最近一轮用时（h）
  /**
   * @example
   * 1
   */
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
  /**
   * @example
   * 11231231231
   */
  joinTime?: number;
  // 成员id
  /**
   * @example
   * 成员id
   */
  memberId?: string;
  // 成员名称
  /**
   * @example
   * 成员名称
   */
  memberName?: string;
  // 角色
  /**
   * @example
   * 角色
   */
  role?: string;
  // 状态
  /**
   * @example
   * 状态
   */
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
  /**
   * @example
   * 满100 减10元
   */
  benefitName?: string;
  // 展示金额文案
  /**
   * @example
   * 10元
   */
  showAmountText?: string;
  // 门槛金额文案
  /**
   * @example
   * 满100元可用
   */
  thresholdAmountText?: string;
  // 使用说明
  /**
   * @example
   * 满100 减10元
   */
  benefitUsageDesc?: string;
  // 规则描述
  /**
   * @example
   * 满100元可用
   */
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
  /**
   * @example
   * app20230725115808679d4f
   */
  applicationId?: string;
  // 链ID
  /**
   * @example
   * 284f75bc-8069-443f-9d46-4576bb15f210
   */
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
  /**
   * @example
   * 张三
   */
  operator?: string;
  // 操作时间
  /**
   * @example
   * 1690166971465
   */
  time?: number;
  // 合约部署进度类型
  /**
   * @example
   * SERVICE_START
   */
  type?: string;
  // 部署状态
  /**
   * @example
   * INIT
   */
  status?: string;
  // 合约部署进度名称
  /**
   * @example
   * 部署合约服务
   */
  typeName?: string;
  // 额外参数
  /**
   * @example
   * {json}
   */
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
  /**
   * @example
   * 3fc223617da9a17a4d7792ef0c3f57bd176ec
   */
  bizUid?: string;
  // 空间ID
  /**
   * @example
   * space1
   */
  spaceId: string;
  // 创建时间
  /**
   * @example
   * 1595574776000
   */
  createTime: number;
  // 数据模型描述
  /**
   * @example
   * 这是一个描述信息
   */
  description?: string;
  // 模型字段详细信息
  /**
   * @example
   * {"organization":"test","company":"test"}
   */
  fieldDetail: string;
  // 数据模型业务ID
  /**
   * @example
   * model_company_data
   */
  modelBizId?: string;
  // 数据模型ID
  /**
   * @example
   * DATA_MODEL_123
   */
  modelId: string;
  // 数据模型名称
  /**
   * @example
   * 税务信息模型
   */
  name: string;
  // 提交人
  submitter: Participant;
  // 更新时间
  /**
   * @example
   * 1595574776000
   */
  updateTime: number;
  // 状态
  /**
   * @example
   * ACTIVE
   */
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
  /**
   * @example
   * agree comment
   */
  comment: string;
  // 节点ID
  /**
   * @example
   * did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
   */
  nodeId: string;
  // 节点名称
  /**
   * @example
   * Bob
   */
  nodeName: string;
  // 节点状态
  /**
   * @example
   * Agree
   */
  nodeStatus: string;
  // 节点审批时间
  /**
   * @example
   * 1592883002497
   */
  operateTime: number;
  // 扩展参数
  /**
   * @example
   * test
   */
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
  /**
   * @example
   * Tester001
   */
  accountName: string;
  // 区块链唯一标识
  /**
   * @example
   * 0001bcde
   */
  bizid: string;
  // 合约链的名字
  /**
   * @example
   * 合约体验链
   */
  chainName: string;
  // 目标合约链的host地址
  /**
   * @example
   * https://127.0.0.1
   */
  host: string;
  // 说明是否开启wasm合约功能
  /**
   * @example
   * true
   */
  isWasm?: boolean;
  // 目标合约链服务公开的端口号
  /**
   * @example
   * 18131
   */
  port: string;
  // 合约链已创建的测试账户的密钥
  /**
   * @example
   * c8d6079a1ea7e5dba407998fecd89ac0783295c7e1a84d44e304b5314c765e73
   */
  privateKey: string;
  // 如果是TEE硬件隐私合约链，会包含此字段内容
  /**
   * @example
   * -----BEGIN PUBLIC KEY----- <RSA公钥> -----END PUBLIC KEY-----
   */
  rsaPublicKey?: string;
  // 合约链的版本说明
  /**
   * @example
   * 2.7
   */
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
  /**
   * @example
   * key
   */
  key: string;
  // 值
  /**
   * @example
   * value
   */
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
  /**
   * @example
   * ""
   */
  createTime?: string;
  // 修改时间
  /**
   * @example
   * ""
   */
  modifyTime?: string;
  // 状态
  /**
   * @example
   * ""
   */
  status?: string;
  // uuid
  /**
   * @example
   * “”
   */
  uuid?: string;
  // 位置
  /**
   * @example
   * {}
   */
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
  /**
   * @example
   * 存证合约
   */
  name?: string;
  // 值
  /**
   * @example
   * DEPOSITE
   */
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
  /**
   * @example
   * 27ce375122ef483691488395808e009e
   */
  bizid: string;
  // block_hash
  /**
   * @example
   * 4a6306e001a484c5c1d198668008b4876b991c5369a18a8431e9e7b37b021694
   */
  blockHash: string;
  // category
  /**
   * @example
   * -1
   */
  category: number;
  // create_time
  /**
   * @example
   * 1604565299516
   */
  createTime: number;
  // from
  /**
   * @example
   * eeb0aa76449922c8ec718b97ec5da4c493d46d66a1f446fdce2ba29263efd612
   */
  from: string;
  // gas_used
  /**
   * @example
   * 0
   */
  gasUsed: number;
  // hash
  /**
   * @example
   * 65a0a7aa9b6f739faddd8e993eadecf85340cdeda6e20417e013e052f30afd3c
   */
  hash: string;
  // height
  /**
   * @example
   * 6814087
   */
  height: number;
  // reference_count
  /**
   * @example
   * 0
   */
  referenceCount: number;
  // to
  /**
   * @example
   * eeb0aa76449922c8ec718b97ec5da4c493d46d66a1f446fdce2ba29263efd612
   */
  to: string;
  // transaction_type
  /**
   * @example
   * TX_DEPOSIT_DATA
   */
  transactionType: string;
  // block_version
  /**
   * @example
   * 10
   */
  blockVersion: number;
  // blockchain_name
  /**
   * @example
   * BAASQATEST
   */
  blockchainName: string;
  // blockchain_status
  /**
   * @example
   * true, false
   */
  blockchainStatus: boolean;
  // content
  /**
   * @example
   * eyJ0cmFuc2FjdGlvbl9pZCI6ImRjM2YyZTYz
   */
  content: string;
  // hash_status
  /**
   * @example
   * true, false
   */
  hashStatus: boolean;
  // type
  /**
   * @example
   * 0
   */
  type: number;
  // transaction_contract
  /**
   * @example
   * transaction_contract
   */
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
  /**
   * @example
   * userId
   */
  transInType: string;
  // 结算收款方
  /**
   * @example
   * 1100001990
   */
  transIn: string;
  // 结算汇总维度
  /**
   * @example
   * A0001
   */
  summaryDimension?: string;
  // 结算主体类型
  /**
   * @example
   * SecondMerchant
   */
  settleEntityType?: string;
  // 结算主体标识
  /**
   * @example
   * 2088xxxxx
   */
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
  /**
   * @example
   * client_crt_url
   */
  clientCrtUrl?: string;
  // trust_ca_url
  /**
   * @example
   * trust_ca_url
   */
  trustCaUrl?: string;
  // ca_crt_url
  /**
   * @example
   * ca_crt_url
   */
  caCrtUrl?: string;
  // sdk_url
  /**
   * @example
   * sdk_url
   */
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
  /**
   * @example
   * S210304150059
   */
  antChainId?: string;
  // 子链名称
  /**
   * @example
   * name
   */
  name?: string;
  // 子链节点数
  /**
   * @example
   * 1
   */
  nodeSum?: number;
  // 子链监控状态
  /**
   * @example
   * true, false
   */
  monitor?: boolean;
  // 子链的块高
  /**
   * @example
   * 100
   */
  blockHeight?: string;
  // 子链的业务总数
  /**
   * @example
   * 1000
   */
  transactionSum?: number;
  // 子链的创建时间
  /**
   * @example
   * 1000821213123
   */
  createTime?: number;
  // 子链的状态
  /**
   * @example
   * STOP/CREATE
   */
  status?: string;
  // 子链的权限
  /**
   * @example
   * true, false
   */
  consortiumMember?: boolean;
  // 主链id
  /**
   * @example
   * 2e7e22c42bb8419bbf99b7f56aa2f17f
   */
  mainChainId?: string;
  // rest申请状态
  /**
   * @example
   * OK
   */
  rest?: string;
  // 子链序号
  /**
   * @example
   * 0000000000000002000000000000000000000000
   */
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
  /**
   * @example
   * http://xxxxxx
   */
  endPoint: string;
  // 扩展字段信息
  /**
   * @example
   * {"item1":""}
   */
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
  /**
   * @example
   * app20230725115808679d4f
   */
  application?: string;
  // 执行结果
  /**
   * @example
   * INIT
   */
  status?: string;
  // 操作时间
  /**
   * @example
   * 1690166971465
   */
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
  /**
   * @example
   * ant_chain_id
   */
  antChainId?: string;
  // account
  /**
   * @example
   * account
   */
  account?: string;
  // account_public_key
  /**
   * @example
   * account_public_key
   */
  accountPublicKey?: string;
  // account_recovery_key
  /**
   * @example
   * account_recovery_key
   */
  accountRecoveryKey?: string;
  // account_status
  /**
   * @example
   * account_status
   */
  accountStatus?: string;
  // 机构信息
  /**
   * @example
   * uid-11321313131
   */
  memberName?: string;
  // 创建时间
  /**
   * @example
   * 112313123
   */
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
  /**
   * @example
   * 3123123
   */
  blockHeight?: number;
  // node_name
  /**
   * @example
   * node_name
   */
  nodeName?: string;
  // status
  /**
   * @example
   * true, false
   */
  status?: boolean;
  // version
  /**
   * @example
   * version
   */
  version?: string;
  // 节点id
  /**
   * @example
   * 0x0AC5C397C076E394B3D32C1A9488AAF32BABD410A2FFAF97C87646F5BD04CD42
   */
  nodeId?: string;
  // 节点ip
  /**
   * @example
   * 10.1.0.12
   */
  nodeIp?: string;
  // 节点的端口
  /**
   * @example
   * 18130
   */
  nodePort?: string;
  // 节点类型
  /**
   * @example
   * 共识或非共识
   */
  nodeType?: string;
  // 节点状态
  /**
   * @example
   * 正常/异常
   */
  nodeState?: string;
  // 节点来源
  /**
   * @example
   * BaaS
   */
  nodeSource?: string;
  // 节点存储空间使用量
  /**
   * @example
   * 10
   */
  diskUse?: string;
  // 节点存储总空间大小
  /**
   * @example
   * 1024
   */
  diskTotal?: string;
  // 节点公钥
  /**
   * @example
   * 121231bcd
   */
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
  /**
   * @example
   * xxxx
   */
  publicKey?: string;
  // 传输vc使用的区块链id
  /**
   * @example
   * bizid
   */
  vcChannel?: string;
  // 验证者did
  /**
   * @example
   * did:mychain:xxxx
   */
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
  /**
   * @example
   * 性别
   */
  name: string;
  // 枚举值
  /**
   * @example
   * F
   */
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
  /**
   * @example
   * tx_type
   */
  txType?: string;
  // data
  /**
   * @example
   * data
   */
  data?: string;
  // hash
  /**
   * @example
   * hash
   */
  hash?: string;
  // from
  /**
   * @example
   * from
   */
  from?: string;
  // to
  /**
   * @example
   * to
   */
  to?: string;
  // timestamp
  /**
   * @example
   * 1231231
   */
  timestamp?: number;
  // period
  /**
   * @example
   * 12312312
   */
  period?: number;
  // nonce
  /**
   * @example
   * nonce
   */
  nonce?: string;
  // gas
  /**
   * @example
   * gas
   */
  gas?: string;
  // value
  /**
   * @example
   * value
   */
  value?: string;
  // signatures
  /**
   * @example
   * signatures
   */
  signatures?: string[];
  // extentions
  /**
   * @example
   * extentions
   */
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
  /**
   * @example
   * name
   */
  name?: string;
  // bizid
  /**
   * @example
   * bizid
   */
  bizid?: string;
  // chain_type
  /**
   * @example
   * chain_type
   */
  chainType?: string;
  // node_num
  /**
   * @example
   * node_num
   */
  nodeNum?: number;
  // member_status
  /**
   * @example
   * member_status
   */
  memberStatus?: string;
  // block_height
  /**
   * @example
   * block_height
   */
  blockHeight?: number;
  // transactions
  /**
   * @example
   * transactions
   */
  transactions?: number;
  // network
  /**
   * @example
   * network
   */
  network?: string;
  // version
  /**
   * @example
   * version
   */
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
  /**
   * @example
   * tme202307251209228357cc
   */
  templateId?: string;
  // 产品码
  /**
   * @example
   * 0001
   */
  productCode?: string;
  // 合约名称
  /**
   * @example
   * 资产合约
   */
  name?: string;
  // 缩略图url
  /**
   * @example
   * http://www.xxx.com
   */
  thumbUrl?: string;
  // 合约描述
  /**
   * @example
   * 实现数据不可删除，不可篡改，不可抵赖的存证效果
   */
  description?: string;
  // 文档地址
  /**
   * @example
   * https://help.aliyun.com/product/84950.html
   */
  detailUrl?: string;
  // 是否已开通合约
  /**
   * @example
   * true
   */
  open?: boolean;
  // 后续展示：购买用户头像
  avatarLogoList?: string[];
  // 定制合约价格
  /**
   * @example
   * 定制合约服务费用：80,000元/年
   */
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
  /**
   * @example
   * AUTHORIZED
   */
  authStatus?: string;
  // 业务系统唯一标示
  /**
   * @example
   * 76a0e716164848168dc726460042ee25
   */
  bizUid?: string;
  // 区块链ID
  /**
   * @example
   * 8c777cf9a71b660233215b6337dca78d
   */
  blockchainId?: string;
  // 数据类别
  /**
   * @example
   * TABLE,FILE...
   */
  category: string;
  // 数据ID
  /**
   * @example
   * did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
   */
  dataId: string;
  // 数据模型ID
  /**
   * @example
   * DATA_MODEL_Q23
   */
  dataModelId?: string;
  // 扩展信息，标准JSON格式
  /**
   * @example
   * {"strategy":"test”}
   */
  extensionInfo?: string;
  // 数据名称
  /**
   * @example
   * testdata
   */
  name: string;
  // 数据所有者ID
  /**
   * @example
   * did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
   */
  ownerId: string;
  // 流程节点信息
  processTemplate?: ProcessNode[];
  // 数据状态
  /**
   * @example
   * ACTIVE,DELETED...
   */
  status?: string;
  // 创建时间
  /**
   * @example
   * 1595574776000
   */
  createTime: number;
  // 修改时间
  /**
   * @example
   * 1592810480442
   */
  updateTime?: number;
  // DID doc里的公开信息
  /**
   * @example
   * {}
   */
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
  /**
   * @example
   * xxxxx
   */
  userId: string;
  // 手机号
  /**
   * @example
   * 138xxxxxxx
   */
  phoneNum: string;
  // 城市编码
  /**
   * @example
   * 110000
   */
  cityCode: string;
  // 姓名
  /**
   * @example
   * 张三
   */
  userCertName?: string;
  // 证件号码
  /**
   * @example
   * xxxxx
   */
  userCertNo?: string;
  // 性别
  /**
   * @example
   * girl
   */
  userGender?: string;
  // 昵称
  /**
   * @example
   * xxxxx
   */
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
  /**
   * @example
   * ant_chain_id
   */
  antChainId?: string;
  // 链名称
  /**
   * @example
   * name
   */
  antChainName?: string;
  // 链的类型
  /**
   * @example
   * 链的类型
   */
  chainType?: string;
  // cipher_suit
  /**
   * @example
   * cipher_suit
   */
  cipherSuit?: string;
  // 创建时间
  /**
   * @example
   * 创建时间
   */
  createTime?: number;
  // expire_time
  /**
   * @example
   * 1123123123123
   */
  expireTime?: number;
  // instance_id
  /**
   * @example
   * instance_id
   */
  instanceId?: string;
  // is_admin
  /**
   * @example
   * true、false
   */
  isAdmin?: boolean;
  // 成员状态
  /**
   * @example
   * 成员状态
   */
  memberStatus?: string;
  // merkle_tree_suit
  /**
   * @example
   * merkle_tree_suit
   */
  merkleTreeSuit?: string;
  // Network
  /**
   * @example
   * Network
   */
  network?: string;
  // 节点数
  /**
   * @example
   * 节点数
   */
  nodeNum?: number;
  // 区域信息
  /**
   * @example
   * 区域信息
   */
  regionId?: string;
  // 链的资源大小
  /**
   * @example
   * 链的资源大小
   */
  resourceSize?: string;
  // rest_status
  /**
   * @example
   * rest_status
   */
  restStatus?: string;
  // 算法参数
  /**
   * @example
   * 算法参数
   */
  tlsAlgo?: string;
  // 版本信息
  /**
   * @example
   * 0.10.2.12.5
   */
  version?: string;
  // monitor_status
  /**
   * @example
   * monitor_status
   */
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
  /**
   * @example
   * json string
   */
  extension?: string;
  // 服务ID，必须保证该服务ID在did doc中是唯一的。对于保留类型服务：
  // DidAuthService， 有且只能有一个，并且id必须为didauth-1；
  // VerifiableClaimRepository， 有且只有一个，并且id必须为vcrepository-1;
  /**
   * @example
   * service-id1
   */
  id: string;
  // 服务的可访问地址
  /**
   * @example
   * http://example.com
   */
  serviceEndpoint: string;
  // 服务类型，必须是已经注册的服务类型，或者是默认保留的服务类型
  /**
   * @example
   * KYBServiceType
   */
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
  /**
   * @example
   * ant_chain_id
   */
  antChainId?: string;
  // username
  /**
   * @example
   * username
   */
  username?: string;
  // createtime
  /**
   * @example
   * createtime
   */
  createtime?: number;
  // updatetime
  /**
   * @example
   * 1231231231231
   */
  updatetime?: number;
  // bid
  /**
   * @example
   * bid
   */
  bid?: string;
  // status
  /**
   * @example
   * status
   */
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
  /**
   * @example
   * {}
   */
  extesion?: string;
  // did doc service id
  /**
   * @example
   * didauth-1
   */
  id: string;
  // 服务endpoint
  /**
   * @example
   * http://auth.mydid.agent.com
   */
  serviceEndpoint: string;
  // service type
  /**
   * @example
   * DidAuthService
   */
  type: string;
  // EXIST
  // CONFLICT
  // VALID
  // INVALID
  /**
   * @example
   * 描述
   */
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
  /**
   * @example
   * name
   */
  name?: string;
  // bizid
  /**
   * @example
   * bizid
   */
  bizid?: string;
  // chain_type
  /**
   * @example
   * chain_type
   */
  chainType?: string;
  // node_num
  /**
   * @example
   * 3
   */
  nodeNum?: number;
  // member_status
  /**
   * @example
   * member_status
   */
  memberStatus?: string;
  // block_height
  /**
   * @example
   * 4
   */
  blockHeight?: number;
  // transactions
  /**
   * @example
   * 121
   */
  transactions?: number;
  // network
  /**
   * @example
   * network
   */
  network?: string;
  // version
  /**
   * @example
   * version
   */
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
  /**
   * @example
   * phone
   */
  phone?: string;
  // gmt_authorized
  /**
   * @example
   * gmt_authorized
   */
  gmtAuthorized?: string;
  // 记录id
  /**
   * @example
   * 112
   */
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
  /**
   * @example
   * consortium_id
   */
  consortiumId?: string;
  // create_time
  /**
   * @example
   * 123123123
   */
  createTime?: number;
  // project_description
  /**
   * @example
   * project_description
   */
  projectDescription?: string;
  // project_id
  /**
   * @example
   * project_id
   */
  projectId?: string;
  // project_name
  /**
   * @example
   * project_name
   */
  projectName?: string;
  // project_version
  /**
   * @example
   * project_version
   */
  projectVersion?: string;
  // update_time
  /**
   * @example
   * update_time
   */
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
  /**
   * @example
   * cme20230724104931af3a4d
   */
  serviceId?: string;
  // 合约名称
  /**
   * @example
   * 资产合约
   */
  name?: string;
  // 合约类型
  /**
   * @example
   * 存证合约
   */
  type?: string;
  // 创建时间
  /**
   * @example
   * 1690166971465
   */
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
  /**
   * @example
   * name
   */
  name?: string;
  // bizid
  /**
   * @example
   * bizid
   */
  bizid?: string;
  // chain_type
  /**
   * @example
   * chain_type
   */
  chainType?: string;
  // node_num
  /**
   * @example
   * node_num
   */
  nodeNum?: number;
  // member_status
  /**
   * @example
   * member_status
   */
  memberStatus?: string;
  // block_height
  /**
   * @example
   * block_height
   */
  blockHeight?: number;
  // transactions
  /**
   * @example
   * transactions
   */
  transactions?: number;
  // network
  /**
   * @example
   * network
   */
  network?: string;
  // version
  /**
   * @example
   * version
   */
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
  /**
   * @example
   * 20
   */
  pageSize?: number;
  // 分页编号
  /**
   * @example
   * 1
   */
  pageNumber?: number;
  // 总数大小
  /**
   * @example
   * 100
   */
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
  /**
   * @example
   * alias
   */
  alias?: string;
  // hash
  /**
   * @example
   * hash
   */
  hash?: string;
  // trans_type_v6
  /**
   * @example
   * trans_type_v6
   */
  transTypeV6?: string;
  // trans_type_v10
  /**
   * @example
   * trans_type_v10
   */
  transTypeV10?: string;
  // category
  /**
   * @example
   * 1
   */
  category?: number;
  // height
  /**
   * @example
   * 2131231
   */
  height?: number;
  // block_hash
  /**
   * @example
   * block_hash
   */
  blockHash?: string;
  // create_time
  /**
   * @example
   * 123123123
   */
  createTime?: number;
  // reference_count
  /**
   * @example
   * 1
   */
  referenceCount?: number;
  // from
  /**
   * @example
   * from
   */
  from?: string;
  // to
  /**
   * @example
   * to
   */
  to?: string;
  // gas_used
  /**
   * @example
   * 123
   */
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
  /**
   * @example
   * 2
   */
  chainNum?: number;
  // 成员数量
  /**
   * @example
   * 5
   */
  memberNum?: number;
  // 时间戳
  /**
   * @example
   * 时间戳
   */
  createTime?: number;
  // 角色
  /**
   * @example
   * 角色
   */
  role?: string;
  // 联盟id
  /**
   * @example
   * 联盟id
   */
  consortiumId?: string;
  // 状态值
  /**
   * @example
   * 状态值
   */
  status?: string;
  // 联盟名称
  /**
   * @example
   * 联盟名称
   */
  consortiumName?: string;
  // 联盟描述
  /**
   * @example
   * 联盟描述
   */
  consortiumDescription?: string;
  // 是否为空联盟
  /**
   * @example
   * true, false
   */
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
  /**
   * @example
   * 100
   */
  height?: string;
  // 序号
  /**
   * @example
   * 0
   */
  index?: string;
  // 类型
  /**
   * @example
   * "Block"
   */
  type?: string;
  // last_error
  /**
   * @example
   * “”
   */
  lastError?: string;
  // 错误统计
  /**
   * @example
   * 0
   */
  errorCount?: string;
  // 统计
  /**
   * @example
   * 0
   */
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
  /**
   * @example
   * true, false
   */
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
  /**
   * @example
   * xxxxxxx
   */
  bcAccount: string;
  // 账户绑定状态，1为未绑定，2为绑定成功
  /**
   * @example
   * 1
   */
  bindingStatus: number;
  // 1是激活状态，2是冻结状态
  /**
   * @example
   * 1
   */
  status: number;
  // 账户唯一标示
  /**
   * @example
   * userid
   */
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
  /**
   * @example
   * xx
   */
  bizId: string;
  // 实例名称
  /**
   * @example
   * xx
   */
  name: string;
  // 版发者
  /**
   * @example
   * xx
   */
  issuer: string;
  // 实例内容
  /**
   * @example
   * xx
   */
  claimContent: string;
  // 状态；-1：已删除 0：审核未通过, 1：审核通过, 2：待审核, 3：编辑中
  status: number;
  // 审核建议
  /**
   * @example
   * xx
   */
  verifyComment: string;
  // 创建时间
  /**
   * @example
   * 1701227612000
   */
  gmtCreate: string;
  // 修改时间
  /**
   * @example
   * 1701227612000
   */
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
  /**
   * @example
   * 110000199001011234
   */
  prizeId?: string;
  // 奖品名称
  /**
   * @example
   * xx面馆
   */
  prizeName?: string;
  // 奖品类型
  /**
   * @example
   * VIRTUAL_PRIZE
   */
  prizeType?: string;
  // 奖品状态
  /**
   * @example
   * PRIZE_CREATED
   */
  prizeStatus?: string;
  // 预算金额
  /**
   * @example
   * 354.22
   */
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
  /**
   * @example
   * 4356
   */
  id?: string;
  // 用途key
  /**
   * @example
   * 3uhhf
   */
  key?: string;
  // 用途内容
  /**
   * @example
   * 用途内容
   */
  name?: string;
  // 用途申报时间
  /**
   * @example
   * 22-01-01
   */
  time?: string;
  // 用途申报状态
  /**
   * @example
   * 用途申报状态
   */
  status?: string;
  // 简短描述开关
  /**
   * @example
   * true, false
   */
  item?: boolean;
  // 详细描述开关
  /**
   * @example
   * true, false
   */
  extend?: boolean;
  // 用途申报简短描述
  /**
   * @example
   * ""
   */
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
  /**
   * @example
   * FIXED
   */
  strategyType?: string;
  // 策略值
  /**
   * @example
   * 110000199001011234
   */
  strategyValue?: string;
  // 最小金额（单位：分）
  /**
   * @example
   * 6.22
   */
  minPrice?: number;
  // 最大金额（单位：分）
  /**
   * @example
   * 45.22
   */
  maxPrice?: number;
  // 门槛金额（单位：分）
  /**
   * @example
   * 21.55
   */
  threshold?: number;
  // 门槛类型
  /**
   * @example
   * 074a1CcTG1LelxKe4xQC0zgNdId0nxi95b5lsNpazWYoCo5
   */
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
  /**
   * @example
   * 1-5000
   */
  errorNum: number;
  // 出错数据抽样
  /**
   * @example
   * [“xxx“, “xxxx“]
   */
  samples: string[];
  // 出错列，从0开始
  /**
   * @example
   * 0
   */
  errorColumnIndex: number;
  // 当前错误类型的描述
  /**
   * @example
   * 身份证号格式不正确
   */
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
  /**
   * @example
   * {"issuerName":"XX有限公司","userNo":"12123434"}
   */
  claimContent: string;
  // 如果在相同的biz_type下，还需要针对声明claim进行细化划分，可以使用此字段。
  /**
   * @example
   * Level1
   */
  claimType?: string;
  // 申请声明颁发后的有效期，可选参数，如果不指定则默认申请永久有效。
  /**
   * @example
   * -1
   */
  expire?: number;
  // 授权颁发可验证声明的目标did信息，通常为机构或组织的did
  /**
   * @example
   * did:mychain:6d8f3ff4af91532eaa7fc477be6b68dea14ed3bcfd5755ccedced43f6c248214
   */
  did?: string;
  // 目标待授权的名称，标定唯一性，与claim内容配合使用，如果不指定did可以考虑使用此字段。
  /**
   * @example
   * XX有限公司
   */
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
  /**
   * @example
   * OK
   */
  checkResult?: string;
  // 子链成员列表
  consortiumMemberList?: string[];
  // 节点信息列表
  chainNodeInfoList?: ALiYunChainNodeInfo[];
  // 联盟管理员
  /**
   * @example
   * true, false
   */
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
  /**
   * @example
   * DID
   */
  source: string;
  // 规则索引
  /**
   * @example
   * serviceType
   */
  index: string;
  // 规则类型
  /**
   * @example
   * DEFAULT
   */
  type: string;
  // 规则表达式
  /**
   * @example
   * EQUALS
   */
  expression: string;
  // 规则内容
  /**
   * @example
   * content
   */
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
  /**
   * @example
   * 1234:1234:123
   */
  baccount: string;
  // 当前账户映射结果描述语句
  /**
   * @example
   * 成功
   */
  message: string;
  // 状态描述符
  /**
   * @example
   * success
   */
  status: string;
  // 自有系统中该账户唯一标示
  /**
   * @example
   * 1234
   */
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
  /**
   * @example
   * 371000
   */
  cityCode: string;
  // 区县编码
  /**
   * @example
   * 371002
   */
  districtCode: string;
  // 地址
  /**
   * @example
   * 万塘路18号黄龙时代广场B座
   */
  address: string;
  // 省份编码
  /**
   * @example
   * 370000
   */
  provinceCode: string;
  // 高德 poiid
  /**
   * @example
   * B0FFIVU189
   */
  poiid?: string;
  // 经度
  /**
   * @example
   * 120.760001
   */
  longitude?: string;
  // 纬度
  /**
   * @example
   * 60.270001
   */
  latitude?: string;
  // 地址类型
  /**
   * @example
   * BUSINESS_ADDRESS
   */
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
  /**
   * @example
   * 未定义
   */
  vcId: string;
  // 可验证声明完整内容， status 为 “1” 时候非空
  /**
   * @example
   * 声明内容，JSON字符串
   */
  vcContent: string;
  // 可验证声明的颁发状态说明： -1：颁发失败，0：未授权 1：授权成功，此时vc_content字段会包含授权后的声明内容，其它状态码，待定义后增加。
  /**
   * @example
   * “1”
   */
  status: string;
  // 被颁发当前可验证声明的目标did
  /**
   * @example
   * did:mychain:6d8f3ff4af91532eaa7fc477be6b68dea14ed3bcfd5755ccedced43f6c248214
   */
  did?: string;
  // 如果status 是 “-1”，则说明当前可验证声明颁发失败，此字段说明失败原因。
  /**
   * @example
   * “颁发可验证声明失败”
   */
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
  /**
   * @example
   * 12.50
   */
  refundAmount: string;
  // 退分账结果码
  /**
   * @example
   * SUCCESS
   */
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
  /**
   * @example
   * 13222222222
   */
  phone: string;
  // 用户账号信息
  /**
   * @example
   * 13222222222
   */
  userAccount: string;
  // 用户名称
  /**
   * @example
   * wangerxiao
   */
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
  /**
   * @example
   * NQYwDb1w5
   */
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
  /**
   * @example
   * xxxid
   */
  bizId: string;
  // 授权租户id
  /**
   * @example
   * tenantID
   */
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
  /**
   * @example
   * did:mychain:xxxx
   */
  childdid: string;
  // 子did 的did doc
  /**
   * @example
   * xxx
   */
  childdiddoc: string;
  // 用户输入用于派生子did的派生码
  /**
   * @example
   * asdfghj
   */
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
  /**
   * @example
   * vc:private:0000:7bd647663cec087bc424941ad35cb588e96f38c2dcb512442410596c02e8ef681595560495530110
   */
  authorityCertId: string;
  // 授权ID
  /**
   * @example
   * 8c777cf9a71b660233215b6337dca78d66e10f25feca50a2761c09df7d4d0506
   */
  authorizationId?: string;
  // 区块号
  /**
   * @example
   * 1324
   */
  blockNum: number;
  // 过期时间
  /**
   * @example
   * 1592810480442
   */
  expire?: number;
  // 授权时间
  /**
   * @example
   * 1595574776000
   */
  issuanceTime: number;
  // 授权人
  issuer: Participant;
  // 被授权人
  subject: Participant;
  // 哈希
  /**
   * @example
   * d4dbde485203ed445b59fa7cf7976ecc56cf7494cca2d0185c1cac130463ac91
   */
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
  /**
   * @example
   * bizid
   */
  bizid?: string;
  // name
  /**
   * @example
   * name
   */
  name?: string;
  // trial_account
  /**
   * @example
   * trial_account
   */
  trialAccount?: string;
  // trial_account_private_key
  /**
   * @example
   * trial_account_private_key
   */
  trialAccountPrivateKey?: string;
  // ant_chain_id
  /**
   * @example
   * ant_chain_id
   */
  antChainId?: string;
  // ant_chain_name
  /**
   * @example
   * ant_chain_name
   */
  antChainName?: string;
  // version
  /**
   * @example
   * version
   */
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
  /**
   * @example
   * app20230725115808679d4f
   */
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
  /**
   * @example
   * 联盟内链的集合
   */
  antChains?: ALiYunAntChain[];
  // 联盟信息
  /**
   * @example
   * 联盟信息
   */
  antConsortiums?: ALiYunAntConsortium[];
  // 联盟Id
  /**
   * @example
   * 联盟Id
   */
  consortiumId?: string;
  // 联盟成员信息
  /**
   * @example
   * 联盟成员信息
   */
  members?: ALiYunMember[];
  // 阿里云分页属性
  /**
   * @example
   * 阿里云分页属性
   */
  pagination?: ALiYunPagination;
  // is_exist
  /**
   * @example
   * true, false
   */
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
  /**
   * @example
   * did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
   */
  issuerId: string;
  // 公钥接受者ID
  /**
   * @example
   * did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
   */
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
  /**
   * @example
   * 123
   */
  massToken: string;
  // 上传文件地址
  /**
   * @example
   * http://uploadExcamp.com
   */
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
  /**
   * @example
   * 北京市朝阳区阜通东大街6号
   */
  address?: string;
  // 行政区划代码
  /**
   * @example
   * 110000
   */
  cityCode?: string;
  // 纬度
  /**
   * @example
   * 39.916527
   */
  lat: string;
  // 经度
  /**
   * @example
   * 116.397128
   */
  lon: string;
  // 轨迹时间戳
  /**
   * @example
   * 1566221266000
   */
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
  /**
   * @example
   * 110000199001011234
   */
  activityId: string;
  // 活动名称
  /**
   * @example
   * xx面馆活动
   */
  activityName?: string;
  // 活动状态
  /**
   * @example
   * CAMP_CREATED
   */
  activityStatus?: string;
  // 平台类型
  /**
   * @example
   * PLATFORM
   */
  platformType?: string;
  // 活动开始时间
  /**
   * @example
   * yyyy-MM-dd HH:mm:ss
   */
  publishStartTime?: string;
  // 活动结束时间
  /**
   * @example
   * yyyy-MM-dd HH:mm:ss
   */
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
  /**
   * @example
   * request_id
   */
  requestId?: string;
  // data
  /**
   * @example
   * data
   */
  data?: string;
  // success
  /**
   * @example
   * true, false
   */
  success?: boolean;
  // code
  /**
   * @example
   * code
   */
  code?: string;
  // message
  /**
   * @example
   * message
   */
  message?: string;
  // synchro
  /**
   * @example
   * true, false
   */
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
  /**
   * @example
   * 200
   */
  totalNum: number;
  // 该商户下账户信息的总页数
  /**
   * @example
   * 10
   */
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
  /**
   * @example
   * ant_chain_id
   */
  antChainId?: string;
  // block_hash
  /**
   * @example
   * block_hash
   */
  blockHash?: string;
  // create_time
  /**
   * @example
   * create_time
   */
  createTime?: number;
  // height
  /**
   * @example
   * 123123
   */
  height?: number;
  // previous_hash
  /**
   * @example
   * previous_hash
   */
  previousHash?: string;
  // root_tx_hash
  /**
   * @example
   * root_tx_hash
   */
  rootTxHash?: string;
  // transaction_size
  /**
   * @example
   * 3
   */
  transactionSize?: number;
  // trans_summary_list
  /**
   * @example
   * trans_summary_list
   */
  transSummaryList?: ALiYunTransactionSummary[];
  // Version
  /**
   * @example
   * 10
   */
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
  /**
   * @example
   * 200
   */
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
  /**
   * @example
   * "$./path"
   */
  path: string;
  // 生成ZKP证明的公共信息
  /**
   * @example
   * json array string
   */
  publicInputs: string;
  // zkp方法
  /**
   * @example
   * more,less,contain
   */
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
  /**
   * @example
   * pagination
   */
  pagination?: ALiYunPagination;
  // accounts
  /**
   * @example
   * accounts
   */
  accounts?: ALiYunAccount[];
  // 联盟管理员
  /**
   * @example
   * true, false
   */
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
  /**
   * @example
   * 1
   */
  status?: string;
  // 已申报的用途，比如供应链金融
  /**
   * @example
   * 已申报的用途，比如供应链金融
   */
  purpose?: string;
  // 申报时间
  /**
   * @example
   * 21-1-1
   */
  createTime?: string;
  // 简短说明用途
  /**
   * @example
   * 简短说明用途
   */
  chainPurposeItem?: string;
  // 用途详情
  /**
   * @example
   * 用途详情
   */
  chainPurposeExtend?: string;
  // 申请用途列表
  /**
   * @example
   * []
   */
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
  /**
   * @example
   * data
   */
  data?: string;
  // gas_used
  /**
   * @example
   * gas_used
   */
  gasUsed?: string;
  // result
  /**
   * @example
   * result
   */
  result?: number;
  // logs
  /**
   * @example
   * logs
   */
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
  /**
   * @example
   * SERVICE_START
   */
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
  /**
   * @example
   * cme20230724104931af3a4d
   */
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
  /**
   * @example
   * 141a48c42f1e47b085a4502dab442553
   */
  bizid: string;
  // 链的状态
  /**
   * @example
   * NOMAL
   */
  blockchainStatus: string;
  // 链的类型
  /**
   * @example
   * PROD、TEST
   */
  blockchainType: string;
  // 链的名称
  /**
   * @example
   * 区块链
   */
  blockchainName: string;
  // 节点数量
  /**
   * @example
   * 1
   */
  blockchanNodeNum: number;
  // 创建时间
  /**
   * @example
   * 1609731134000
   */
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
  /**
   * @example
   * vc:mychain:dec9725c55bc7ad28b97340230f211b2ad96a35f5131ce9f77c1bd7b67f919451572244785477124
   */
  vcId: string;
  // 分享给目标接受者的did
  /**
   * @example
   * did:mychain:6d8f3ff4af91532eaa7fc477be6b68dea14ed3bcfd5755ccedced43f6c248214 
   */
  targetDid: string;
  // 分享链上VC数据的交易hash，可用于直连区块链查询交易内容时使用。
  /**
   * @example
   * 388d0822df016aa66c954344e22c36ec89e4a4573ef0491220bd80c1fe3469cb
   */
  txHash?: string;
  // 分享是否成功，true：成功，false：失败
  /**
   * @example
   * true，false
   */
  status: boolean;
  // 失败的对应原因信息
  /**
   * @example
   * “失败原因”
   */
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
  /**
   * @example
   * keyId
   */
  key: string;
  // 0:encrypt_text,
  // 1:encrypt_array_text,
  // 2:encrypt_int
  // 3:encrypt_array_int
  /**
   * @example
   * 0
   */
  type: number;
  // 字段对应的数据
  /**
   * @example
   * "value_1"
   */
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
  /**
   * @example
   * add
   */
  action: string;
  // 对应did
  /**
   * @example
   * did:mychain:XXXX
   */
  did: string;
  // did对应doc
  /**
   * @example
   * {}
   */
  didDoc: string;
  // 本次事件的触发者
  /**
   * @example
   * XXXXXXXXX
   */
  from: string;
  // 6500
  /**
   * @example
   * 事件在区块的高度
   */
  height: number;
  // 交易hash
  /**
   * @example
   * xxxxxx
   */
  txHash: string;
  // 交易在区块中的index
  /**
   * @example
   * 1
   */
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
  /**
   * @example
   * vc:mychain:xxxxx
   */
  vcId: string;
  // vc原文，如果vc原文出现在传输接口，那么VC仓库不会从本地查找，而是直接将传输的VC上链
  /**
   * @example
   * json string
   */
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
  /**
   * @example
   * content
   */
  content?: string;
  // content_id
  /**
   * @example
   * content_id
   */
  contentId?: string;
  // content_name
  /**
   * @example
   * content_name
   */
  contentName?: string;
  // create_time
  /**
   * @example
   * create_time
   */
  createTime?: number;
  // is_directory
  /**
   * @example
   * true
   */
  isDirectory?: boolean;
  // parent_content_id
  /**
   * @example
   * parent_content_id
   */
  parentContentId?: string;
  // project_id
  /**
   * @example
   * project_id
   */
  projectId?: string;
  // update_time
  /**
   * @example
   * update_time
   */
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
  /**
   * @example
   * 00001
   */
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
  /**
   * @example
   * 2
   */
  previousVersion: number;
  // did doc中的service id
  /**
   * @example
   * service#1
   */
  serviceId: string;
  // 服务信息
  serviceInfo: DidServiceInfo;
  // 服务类型
  /**
   * @example
   * auth
   */
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
  /**
   * @example
   * 北京
   */
  address?: string;
  // 业务场景code
  /**
   * @example
   * 020301
   */
  bizCode: string;
  // 业务名称
  /**
   * @example
   * test1
   */
  bizName: string;
  // 业务类型，预留
  /**
   * @example
   * test1
   */
  bizType?: string;
  // 用户创建时间，格式yyyy-MM-dd HH:mm:ss
  /**
   * @example
   * 2019-06-12 00:00:00
   */
  createTime?: string;
  // 用户注销时间，格式yyyy-MM-dd HH:mm:ss
  /**
   * @example
   * 2019-06-13 00:00:00  
   */
  endTime?: string;
  // 扩展字段，使用json格式
  /**
   * @example
   * {"status":1}
   */
  extension?: string;
  // 业务组code
  /**
   * @example
   * 0101
   */
  groupCode: string;
  // 业务组名称
  /**
   * @example
   * baas平台
   */
  groupName: string;
  // 唯一标示类型，0:统一信用代码,1:开票机构代码,2:身份证号
  /**
   * @example
   * 0
   */
  identityType?: number;
  // 唯一标示码
  /**
   * @example
   * 370211198106130000
   */
  identityValue?: string;
  // 用户标签
  /**
   * @example
   * <kpi>0</kpi>
   */
  label?: string;
  // 间连用户的上层直连用户名称
  /**
   * @example
   * 某某公司
   */
  parent?: string;
  // 统计时间，时间格式：yyyy-MM-dd HH:mm:ss
  /**
   * @example
   * 2019-06-12 00:00:00
   */
  statDate?: string;
  // 用户id
  /**
   * @example
   * bjc1111   
   */
  userId?: string;
  // 用户或企业名称
  /**
   * @example
   * 北京公司A
   */
  userName?: string;
  // 用户类型：direct直连，indirect间连，partner合作伙伴
  /**
   * @example
   * direct
   */
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
  /**
   * @example
   * 京Axxxxx
   */
  licenseNo: string;
  // 车架号
  /**
   * @example
   * xxxxx
   */
  vin: string;
  // 发动机号
  /**
   * @example
   * xxxxx
   */
  engineNo: string;
  // 初登日期
  /**
   * @example
   * 2021-12-21
   */
  registerDate: string;
  // 车辆型号
  /**
   * @example
   * xxxxx
   */
  modelCode: string;
  // 营运性质
  /**
   * @example
   * xxxxx
   */
  useNatureCode: string;
  // 是否抵押
  /**
   * @example
   * true, false
   */
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
  /**
   * @example
   * 323
   */
  industryQualificationType: string;
  // 商户行业资质图片
  /**
   * @example
   * 20200219192259536bda6664ed60f815
   */
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
  /**
   * @example
   * 001abc
   */
  batchId?: string;
  // 合同编号
  /**
   * @example
   * 8888888
   */
  contractId?: string;
  // 信用凭证额度
  /**
   * @example
   * 1898.98
   */
  creditLimit?: string;
  // 失败原因信息
  /**
   * @example
   * 发行额度不足
   */
  errMsg?: string;
  // 信用凭证到期时间
  /**
   * @example
   * 20191212
   */
  expireDate?: string;
  // 信用凭证发起时间
  /**
   * @example
   * 20190101
   */
  issueDate?: string;
  // 信用流转凭证
  /**
   * @example
   * 002abc
   */
  issueId?: string;
  // 发行结果状态 
  // -1:发行失败状态， 0:未完成状态， 1:已发行状态
  /**
   * @example
   * 1
   */
  status?: number;
  // 发行信用流转的运单号
  /**
   * @example
   * 003abc
   */
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
  /**
   * @example
   * ******
   */
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
  /**
   * @example
   * 10
   */
  pageSize?: string;
  // 当前页码
  /**
   * @example
   * 10
   */
  current?: string;
  // 总条数
  /**
   * @example
   * total
   */
  total?: string;
  // 失败日志数组
  /**
   * @example
   * {}
   */
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
  /**
   * @example
   * region_id
   */
  regionId?: string;
  // region_name
  /**
   * @example
   * region_name
   */
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
  /**
   * @example
   * consortium_name
   */
  consortiumName?: string;
  // consortium_id
  /**
   * @example
   * consortium_id
   */
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
  /**
   * @example
   * 未定义
   */
  vcId: string;
  // 目标的VC持有者的did
  /**
   * @example
   * did:mychain:6d8f3ff4af91532eaa7fc477be6b68dea14ed3bcfd5755ccedced43f6c248214
   */
  ownerDid: string;
  // 在支持声明的claim字段级别分享能力时使用，可以指定哪些字段隐藏，哪些字段分享。示例中标记为”1“的是隐藏，”0“的是分享明文。
  /**
   * @example
   * { "Item1": "1", "学历信息": [ { "学历": "0", "毕业院校": "0", "专业": "0", "Item2":"1", }, "1", ], "Item3":"1" }
   */
  index?: string;
  // 非托管模式下owner_did的签名，作为授权凭证
  /**
   * @example
   * jN1LVH5YhbTvgrdeBqlImPJBWDzVdNyyHZ1n9A0pSOQKnt11jWM5Qn707+wEa7bc8TOd1WvRItTe
   * mx4xYCqX0gE=
   *  
   */
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
  /**
   * @example
   * DISABLED, ALL_USER, SPECIFIC_USER
   */
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
  /**
   * @example
   * SUCCESS
   */
  txReceiptResult: string;
  // 区块链id
  /**
   * @example
   * c4b83bb3080a4a19957af5b0b4430542
   */
  bizId: string;
  // 交易hash
  /**
   * @example
   * aeedaaf3abb4a1ce86de538ec42759626689ea59fdfba4a10a0ef1550aa10d3d
   */
  txHash: string;
  // 交易类型
  /**
   * @example
   * TX_DEPOSIT_DATA
   */
  txType: string;
  // 时间戳
  /**
   * @example
   * 1638796927336
   */
  timestamp: number;
  // 区块高度
  /**
   * @example
   * 68772416
   */
  blockNumber: string;
  // 交易随机数Nonce
  /**
   * @example
   * 505563366098488426
   */
  nonce: string;
  // 发起地址
  /**
   * @example
   * 070e88eb167a1dc5156563c5b0dd2c9e89fe5cff50e78c8534c33511d13d3304
   */
  from: string;
  // 目标地址
  /**
   * @example
   * 070e88eb167a1dc5156563c5b0dd2c9e89fe5cff50e78c8534c33511d13d3304
   */
  to: string;
  // 签名
  /**
   * @example
   * 9357e09984d9ba31f0f6070a8276b0d39ffeb8c40aaa7a6873cc69a04ea4babf7295d642aeb945b5eca6624751e11e41885d918deae554abd8d732f95e31d44f00
   */
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
  /**
   * @example
   * did:mychain:...
   */
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
  /**
   * @example
   * 27ce375122ef483691488395808e009e
   */
  bizid: string;
  // 开始时间
  /**
   * @example
   * 1604480401000
   */
  createTime: number;
  // 时间点
  /**
   * @example
   * 2020-10-28
   */
  dateTime: string;
  // 统计时间内最新块高度
  /**
   * @example
   * 6372915
   */
  lastSumBlockHeight: number;
  // 统计周期内交易的数量
  /**
   * @example
   * 2750038
   */
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
  /**
   * @example
   * access_id
   */
  accessId?: string;
  // create_time
  /**
   * @example
   * 123123123
   */
  createTime?: number;
  // rest
  /**
   * @example
   * rest
   */
  rest?: string;
  // update_time
  /**
   * @example
   * 123123123
   */
  updateTime?: number;
  // REST开通结果
  /**
   * @example
   * OK
   */
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
  /**
   * @example
   * did:mychain:xxxxx
   */
  did: string;
  // 用户did对应的授权公钥
  /**
   * @example
   * xxxxxx
   */
  publicKey: string;
  // 业务区块连的bizid
  /**
   * @example
   * xxx
   */
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
  /**
   * @example
   * 1000
   */
  epAmount: number;
  // 版通代码
  /**
   * @example
   * 000111
   */
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
  /**
   * @example
   * config_option
   */
  configOption?: string;
  // show_name
  /**
   * @example
   * show_name
   */
  showName?: string;
  // enable
  /**
   * @example
   * true, false
   */
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
  /**
   * @example
   * data
   */
  data?: boolean;
  // success
  /**
   * @example
   * true, false
   */
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
  /**
   * @example
   * timestamp
   */
  timestamp: number;
  // 交易hash
  /**
   * @example
   * hash
   */
  hash: string;
  // 交易块高
  /**
   * @example
   * 1
   */
  height: number;
  // 交易所在块高
  /**
   * @example
   * hash
   */
  blockhash: string;
  // 交易来源
  /**
   * @example
   * hash
   */
  from: string;
  // 交易地址
  /**
   * @example
   * hash
   */
  to: string;
  // 交易类型
  /**
   * @example
   * 11
   */
  txtype: number;
  // 转账额度
  /**
   * @example
   * 1
   */
  value: number;
  // logs
  /**
   * @example
   * logs
   */
  logs: string;
  // 燃料消耗
  /**
   * @example
   * 11
   */
  gasused: number;
  // result
  /**
   * @example
   * result
   */
  result: string;
  // 拓展json字段
  /**
   * @example
   * json
   */
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
  /**
   * @example
   * ant_chain_id
   */
  antChainId?: string;
  // q_r_code_type
  /**
   * @example
   * q_r_code_type
   */
  qRCodeType?: string;
  // authorization_type
  /**
   * @example
   * authorization_type
   */
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
  /**
   * @example
   * 普通任务
   */
  taskName: string;
  // appId
  /**
   * @example
   * 2021004121633301
   */
  appId: string;
  // 问卷ID
  /**
   * @example
   * ybl1112
   */
  surveyId: string;
  // 备注信息
  /**
   * @example
   * 普通任务备注
   */
  notes?: string;
  // 租户ID
  /**
   * @example
   * RIVUFSJG
   */
  tenantId: string;
  // 操作者
  /**
   * @example
   * eipzps@alitest.comtest
   */
  operator: string;
  // banner标题
  /**
   * @example
   * 普通任务banner
   */
  bannerTitle: string;
  // banner图片地址（最多支持3张）
  /**
   * @example
   * testTenant_1.png,testTenant_1.png
   */
  bannerImageUrls?: string;
  // banner 图片地址, 拼装后的url
  /**
   * @example
   * ["testTenant_1.png","testTenant_1.png"]
   */
  bannerImageFullUrls?: string[];
  // 题量
  /**
   * @example
   * 100
   */
  questionNum: number;
  // 任务连接地址
  /**
   * @example
   * https://pro.wenjuan.com/t/a2
   */
  taskLinkUrl: string;
  // 人群划分描述
  /**
   * @example
   * 购买过健身服装的人群
   */
  personDivideContent?: string;
  // 城市列表
  /**
   * @example
   * 北京,上海,新加坡
   */
  cityDivideUrls?: string;
  // 城市列表, 拼装后的url
  /**
   * @example
   * ["北京","上海","新加坡"]
   */
  cityDivideFullUrls?: string[];
  // 样本数量
  /**
   * @example
   * 20
   */
  sampleNum: number;
  // 完成样本量
  /**
   * @example
   * 1
   */
  completedNum: number;
  // 产品下单code类型（1-资源包 2-后付费）
  /**
   * @example
   * 1
   */
  productCodeType: string;
  // 产品余量
  /**
   * @example
   * 20
   */
  productCapacity: number;
  // 奖励渠道（0-手动发支付宝余额 1-海豚红包 2-问卷自带）
  /**
   * @example
   * 1
   */
  prizeChannel: number;
  // 支付宝账号
  /**
   * @example
   * kefu@lingdangshuo.com
   */
  alipayAccountId?: string;
  // 奖励类型（0-定额红包）
  /**
   * @example
   * 0
   */
  prizeType: number;
  // 全额红包金额，奖励渠道为0和1时
  /**
   * @example
   * 1.00
   */
  fullRedPacketAmount: string;
  // 全额红包描述，奖励渠道为2时，此处必填
  /**
   * @example
   * 1-5元红包
   */
  fullRedPacketTextInfo?: string;
  // 甄别红包金额
  /**
   * @example
   * 0.01
   */
  examineRedPacketAmount: string;
  // 关联的证书instanceId
  /**
   * @example
   * 6511ce4b43414e9588114682bbf9a893
   */
  certInstanceId?: string;
  // 证书实例详情
  certInstanceDetail?: CertInstanceDetail;
  // 审核建议
  /**
   * @example
   * 拒绝
   */
  verifyComment?: string;
  // 任务创建时间
  /**
   * @example
   * 2023-12-20 12:19:00
   */
  gmtCreate: string;
  // 任务更新时间
  /**
   * @example
   * 2023-12-20 12:45:00
   */
  gmtModified: string;
  // 审核理由
  /**
   * @example
   * 不合适
   */
  reviewContent?: string;
  // 人群配置信息
  /**
   * @example
   * {"exclude": false,"nodeConfig": {"groupType": "AND","children": ["exclude": false,"nodeType": "GROUP","nodeId": "1303661d-a7da-4d8a-b646-0819f2fc2855","nodeConfig": {"groupType": "AND","children": []}}]},"nodeId": "ROOT","nodeType": "GROUP"}
   */
  crowdConfig?: string;
  // 任务ID
  /**
   * @example
   * qdQxqU5gz
   */
  taskId: string;
  // 状态
  /**
   * @example
   * 9
   */
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
  /**
   * @example
   * private_key
   */
  privateKey?: string;
  // download_path
  /**
   * @example
   * download_path
   */
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
  /**
   * @example
   * testAgreementName
   */
  agreementName: string;
  // 协议链接
  /**
   * @example
   * testAgreementUrl
   */
  agreementUrl: string;
  // 协议描述
  /**
   * @example
   * testAgreementDesc
   */
  agreementDesc: string;
  // 协议版本
  /**
   * @example
   * 1
   */
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
  /**
   * @example
   * alias
   */
  alias?: string;
  // Dt
  /**
   * @example
   * Dt
   */
  dt?: number;
  // trans_count
  /**
   * @example
   * 21323
   */
  transCount?: number;
  // last_sum_block_height
  /**
   * @example
   * 1231
   */
  lastSumBlockHeight?: number;
  // creat_time
  /**
   * @example
   * creat_time
   */
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
  /**
   * @example
   * pagination
   */
  pagination?: ALiYunPagination;
  // certificate_application
  /**
   * @example
   * certificate_application
   */
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
  /**
   * @example
   * true, false
   */
  isSuccess: boolean;
  // 失败时返回的额外信息
  /**
   * @example
   * 附属消息
   */
  message: string;
  // 接受者did
  /**
   * @example
   * did:mychain:xxxx
   */
  targetVerifier: string;
  // 待签名的交易hash
  /**
   * @example
   * 123123
   */
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
  /**
   * @example
   * 18701507222
   */
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
  /**
   * @example
   * 10000
   */
  blockheight?: number;
  // 节点名称
  /**
   * @example
   * 名字
   */
  nodename?: string;
  // 节点健康状况
  /**
   * @example
   * true
   */
  status?: boolean;
  // 节点版本
  /**
   * @example
   * 0.10
   */
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
  /**
   * @example
   * http,https,openapi,ftp,other...
   */
  accessMode?: string;
  // 对服务的文字描述，<1000个字符
  /**
   * @example
   * 对服务描述
   */
  description?: string;
  // 服务类型创建者did
  /**
   * @example
   * did:mychain:xxxx
   */
  did: string;
  // { "item1":"", "item2":"",...
  /**
   * @example
   * json描述服务入参
   */
  serviceInput?: string;
  // 返回值类型描述，json形式
  /**
   * @example
   * { "item1":"" "item2":"" ... }
   */
  serviceOutput?: string;
  // 自定义服务类型，字符数16～32个
  /**
   * @example
   * KYBServiceType
   */
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
  /**
   * @example
   * app20230725115808679d4f
   */
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
  /**
   * @example
   * 2
   */
  percentage?: string;
  // 分账金额
  /**
   * @example
   * 2
   */
  amount?: string;
  // 分账类型
  /**
   * @example
   * transfer
   */
  royaltyType?: string;
  // 支出方账户类型
  /**
   * @example
   * userId
   */
  transOutType?: string;
  // 支出方账户
  /**
   * @example
   * 2088101126765726
   */
  transOut?: string;
  // 收入方账户类型
  /**
   * @example
   * userId
   */
  transInType?: string;
  // 收入方账户
  /**
   * @example
   * 2088101126708402
   */
  transIn?: string;
  // 分账描述
  /**
   * @example
   * 分账给2088101126708402
   */
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
  /**
   * @example
   * ac01ceb0d8df822e042e5ea3b677201655250dbf54b9bd0c364de6f3f2a1dc7e
   */
  contract?: string;
  // 部署hash
  /**
   * @example
   * 1c625b49992ed3b55abaac677f964a35c4151d4112da8204ac874b6497bf1143
   */
  hash?: string;
  // 合约部署时间
  /**
   * @example
   * 1573401600000
   */
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
  /**
   * @example
   * 1232
   */
  contentHash: string;
  // issuer后缀的hash值
  /**
   * @example
   * 12345667
   */
  issuerHash: string;
  // valid or invalid
  /**
   * @example
   * valid
   */
  status: string;
  // 接收者后缀hash值
  /**
   * @example
   * 1234567
   */
  subjectHash: string;
  // 可验证声明id
  /**
   * @example
   * vc:mychain:xxxxxx
   */
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
  /**
   * @example
   * d
   */
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
  /**
   * @example
   * ant_chain_id
   */
  antChainId?: string;
  // transaction_hash
  /**
   * @example
   * transaction_hash
   */
  transactionHash?: string;
  // base64_q_r_code_p_n_g
  /**
   * @example
   * base64_q_r_code_p_n_g
   */
  base64QRCodePNG?: string;
  // q_r_code_content
  /**
   * @example
   * q_r_code_content
   */
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
  /**
   * @example
   * 2021-03-19
   */
  date: string;
  // 以day为单位的一天凭证颁发的数据量统计。
  /**
   * @example
   * 1001
   */
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
  /**
   * @example
   * 合同内容
   */
  phase: string;
  // 扩展字段
  /**
   * @example
   * {"key":"value"}
   */
  properties?: string;
  // 全局唯一的存证事务ID
  /**
   * @example
   * 877c4383-9c83-477b-b7ec-03828a946e54
   */
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
  /**
   * @example
   * 用户的金融科技租户id
   */
  clientTenent?: string;
  // 业务代码
  /**
   * @example
   * BAAS_ANTFIN|BAAS_ALICLOUD|MORSE|RECEIVABLE|TRACE|GLOBAL_PAYMENT|JUDICIAL|INVOICE
   */
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
  /**
   * @example
   * 000111
   */
  epCode: string;
  // 版通交易号
  /**
   * @example
   * 123123
   */
  txCode: string;
  // 卖方账户
  /**
   * @example
   * testAccount
   */
  txFrom: string;
  // 交易时间戳
  /**
   * @example
   * 1560827725
   */
  txTime: number;
  // 买方账户
  /**
   * @example
   * testAccount
   */
  txTo: string;
  // 交易数量
  /**
   * @example
   * 1000
   */
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
  /**
   * @example
   * 小明
   */
  agent?: string;
  // 经办人身份证
  /**
   * @example
   * 123123123123
   */
  agentId?: string;
  // 用户名称
  /**
   * @example
   * 小王
   */
  certName: string;
  // 证件号
  /**
   * @example
   * 12332112312312
   */
  certNo: string;
  // 证件类型，个人只支持身份证IDENTITY_CARD，企业支持UNIFIED_SOCIAL_CREDIT_CODE（统一社会信用代码）和ENTERPRISE_REGISTERED_NUMBER（企业工商注册号
  /**
   * @example
   * IDENTITY_CARD
   */
  certType: string;
  // 法人姓名，企业认证必选
  /**
   * @example
   * 小李
   */
  legalPerson?: string;
  // 法人身份证,  企业认证必选
  /**
   * @example
   * 123123321123
   */
  legalPersonId?: string;
  // 用户手机号码
  /**
   * @example
   * 1231231231
   */
  mobileNo?: string;
  // 扩展属性
  /**
   * @example
   * {"key":"value"}
   */
  properties?: string;
  // 用户类型，PERSON或者ENTERPRISE
  /**
   * @example
   * PERSON
   */
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
  /**
   * @example
   * 张三
   */
  name: string;
  // 手机号
  /**
   * @example
   * 13888888888
   */
  mobile: string;
  // 电子邮箱
  /**
   * @example
   * user@domain.com
   */
  email?: string;
  // 电话
  /**
   * @example
   * 0571-85022088
   */
  phone?: string;
  // 身份证号
  /**
   * @example
   * 110000199001011234
   */
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
  /**
   * @example
   * 10.8
   */
  balance: string;
  // 待结算额度
  /**
   * @example
   * 11.4
   */
  settleQuota: string;
  // 商户id
  /**
   * @example
   * tset id
   */
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
  /**
   * @example
   * 用户did对应的授权公钥
   */
  publicKey?: string;
  // 业务区块连的bizid
  /**
   * @example
   * 业务区块连的bizid
   */
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
  /**
   * @example
   * message
   */
  message?: string;
  // request_id
  /**
   * @example
   * request_id
   */
  requestId?: string;
  // success
  /**
   * @example
   * true, false
   */
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
  /**
   * @example
   * 枭洒保税所有海关可用严禁修改
   */
  desc: string;
  // 扩展信息 ，json格式
  /**
   * @example
   * "{"isUrl",true,"usrid":"123231"}"
   */
  extInfo: string;
  // 溯源项的键值
  /**
   * @example
   * itemName
   */
  key: string;
  // 溯源项的中文标题 
  /**
   * @example
   * 品名
   */
  title: string;
  // 内容类型 
  /**
   * @example
   * text, image, region, link, longtext
   */
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
  /**
   * @example
   * fafafafaf
   */
  taapId: string;
  // C3S可信计算TAPP版本
  /**
   * @example
   * 1
   */
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
  /**
   * @example
   * name
   */
  unionName: string;
  // 描述
  /**
   * @example
   * 描述
   */
  unionDescription: string;
  // 联系人
  /**
   * @example
   * 联系人
   */
  unionUser: string;
  // 联盟联系人手机号码
  /**
   * @example
   * 联盟联系人手机号码
   */
  unionUserCell: string;
  // 联盟联系人邮箱
  /**
   * @example
   * 联盟联系人邮箱
   */
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
  /**
   * @example
   * b0c13c3bdeb4b3e0892ab2d2ddd28f9972abba66a3fae0799507dec6fcfa7ba0
   */
  blockHash?: string;
  // 交易来源
  /**
   * @example
   * b0c13c3bdeb4b3e0892ab2d2ddd28f9972abba66a3fae0799507dec6fcfa7ba0
   */
  from?: string;
  // gas消耗
  /**
   * @example
   * 1111
   */
  gasUsed?: number;
  // 交易hash
  /**
   * @example
   * ce386c5510df2e358056893b86ba77178fcf00d90de9c56bd788fd1968c9b58d
   */
  hash?: string;
  // 交易所在块 块高
  /**
   * @example
   * 1000
   */
  height?: number;
  // 交易返回结果
  /**
   * @example
   * 0
   */
  result?: string;
  // 交易时间
  /**
   * @example
   * 1573401600000
   */
  timestamp?: number;
  // 交易地址
  /**
   * @example
   * 4a5e107d0ea041f25ca7bfb58503e6549913e67e5d07aadfe359418440359fec
   */
  to?: string;
  // 交易类型 同SDK
  /**
   * @example
   * 11
   */
  txType?: number;
  // 转账额度
  /**
   * @example
   * 1111
   */
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
  /**
   * @example
   * true, false
   */
  isSuccess: boolean;
  // 失败信息
  /**
   * @example
   * 失败信息
   */
  message?: string;
  // 验证verifier did
  /**
   * @example
   * did:mychian:xxxxx
   */
  targetVerifier: string;
  // 交易hash
  /**
   * @example
   * xxxxx
   */
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
  /**
   * @example
   * userId
   */
  type: string;
  // 分账接收方账号
  /**
   * @example
   * 2088324168543
   */
  account: string;
  // 分账接收方真实姓名
  /**
   * @example
   * 张三
   */
  name?: string;
  // 分账关系描述
  /**
   * @example
   * 分账给测试商户
   */
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
  /**
   * @example
   * AAAAA 
   */
  hashedMessage: string;
  // 哈希算法
  /**
   * @example
   * 321
   */
  hashAlgorithm: string;
  // 时间
  /**
   * @example
   * 123
   */
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
  /**
   * @example
   * apple-01
   */
  goodsId: string;
  // 商品名称
  /**
   * @example
   * apple
   */
  goodsName: string;
  // 商品数量
  /**
   * @example
   * 1
   */
  quantity: string;
  // 商品单价
  /**
   * @example
   * 200
   */
  price: string;
  // 商品类目
  /**
   * @example
   * 34543238
   */
  goodsCategory?: string;
  // 商品类目树
  /**
   * @example
   * 124868003|126232002|126252004
   */
  categoriesTree?: string;
  // 商品的展示地址
  /**
   * @example
   * http://www.alipay.com/xxx.jpg
   */
  showUrl?: string;
  // 商品69条码
  /**
   * @example
   * 6972829161111
   */
  goodsEanId?: string;
  // 商家侧小程序商品 ID
  /**
   * @example
   * outItem_01
   */
  outItemId?: string;
  // 商家侧小程序商品ID
  /**
   * @example
   * outSku_01
   */
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
  /**
   * @example
   * 9481b612d6ca4cfdbecc5c5d395eda4237c749fa-97fc-4156-9c23-e21cd6060669
   */
  name?: string;
  // 类型
  /**
   * @example
   * "BLOCK"
   */
  type?: string;
  // 源
  /**
   * @example
   * “”
   */
  source?: string;
  // 创建时间
  /**
   * @example
   * 103422
   */
  createTime?: string;
  // 错误信息
  /**
   * @example
   * "error"
   */
  errorMessage?: string;
  // 状态
  /**
   * @example
   * “success”
   */
  status?: string;
  // option（map结构，由于金融云无map接口所以通过string类型传输json格式）
  /**
   * @example
   * {a:"123",  b:"123"}
   */
  option?: string;
  // checkpoint类
  /**
   * @example
   * {}
   */
  checkpoint?: CheckPointStructBody;
  // 待处理的错误事件总数
  /**
   * @example
   * 待处理的错误事件总数
   */
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
  /**
   * @example
   * c1bff3fe-f1fb-42a2-8fc7-9cbb1a011713
   */
  nodeId: string;
  // 节点类型
  /**
   * @example
   * GROUP
   */
  nodeType: CrowdNodeTypeEnum;
  // 是否排除
  /**
   * @example
   * true, false
   */
  exclude: boolean;
  // 节点配置
  /**
   * @example
   * "nodeConfig": {   "tagCode": "P0010GC6",   "valueList": [     {       "selectedValues": [         "18",         "30"       ],       "operator": "BT"     }   ],   "tagType": "BASE" }
   */
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
  /**
   * @example
   * 杭州
   */
  city?: string;
  // 操作IMEI
  /**
   * @example
   * 359426002899056
   */
  imei?: string;
  // 操作IMSI
  /**
   * @example
   * 460001357924680
   */
  imsi?: string;
  // 操作IP地址
  /**
   * @example
   * 0.0.0.0
   */
  ip?: string;
  // 纬度
  /**
   * @example
   * 66.33
   */
  latitude?: string;
  // 经度
  /**
   * @example
   * 23.26
   */
  longitude?: string;
  // 扩展属性
  /**
   * @example
   * {"key":"value"}
   */
  propertities?: string;
  // 操作Wi-Fi物理地址
  /**
   * @example
   * 00-01-6C-06-A6-29
   */
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
  /**
   * @example
   * 15.9
   */
  balanceLog: string;
  // 商户id
  /**
   * @example
   * testid
   */
  shopId: string;
  // 记录时间
  /**
   * @example
   * 12.2
   */
  timeLog: number;
  // 链上地址
  /**
   * @example
   * 123
   */
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
  /**
   * @example
   * 100
   */
  accessCount?: number;
  // access_alipay_account_count
  /**
   * @example
   * 1000
   */
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
  /**
   * @example
   * 事例id
   */
  instanceId: string;
  // 是否成功
  /**
   * @example
   * true, false
   */
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
  /**
   * @example
   * node_id
   */
  nodeId: string;
  // node_ip
  /**
   * @example
   * node_ip
   */
  nodeIp: string;
  // node_name
  /**
   * @example
   * node_name
   */
  nodeName: string;
  // node_owner
  /**
   * @example
   * node_owner
   */
  nodeOwner: string;
  // node_port
  /**
   * @example
   * node_port
   */
  nodePort: string;
  // node_source
  /**
   * @example
   * node_source
   */
  nodeSource: string;
  // node_state
  /**
   * @example
   * node_state
   */
  nodeState: string;
  // node_type
  /**
   * @example
   * node_type
   */
  nodeType: string;
  // 节点已使用的存储空间
  /**
   * @example
   * 50
   */
  nodeDiskUsed: string;
  // 节点的总存储空间
  /**
   * @example
   * 1024
   */
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
  /**
   * @example
   * account_private_key
   */
  accountPrivateKey?: string;
  // account_public_key
  /**
   * @example
   * account_public_key
   */
  accountPublicKey?: string;
  // account_recover_private_key
  /**
   * @example
   * account_recover_private_key
   */
  accountRecoverPrivateKey?: string;
  // account_recover_public_key
  /**
   * @example
   * account_recover_public_key
   */
  accountRecoverPublicKey?: string;
  // ant_chain_id
  /**
   * @example
   * ant_chain_id
   */
  antChainId?: string;
  // account
  /**
   * @example
   * account
   */
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
  /**
   * @example
   * test id
   */
  productId: string;
  // 商户id
  /**
   * @example
   * test id
   */
  shopId: string;
  // 链上地址
  /**
   * @example
   * 123
   */
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
  /**
   * @example
   * bizid
   */
  bizid: string;
  // block_hash
  /**
   * @example
   * block_hash
   */
  blockHash: string;
  // create_time
  /**
   * @example
   * 1604564398000
   */
  createTime: number;
  // height
  /**
   * @example
   * 6812497
   */
  height: number;
  // previous_hash
  /**
   * @example
   * f6d51d362abc1b31e42dbd88d5ce0660cb96b8d0c0a4293cd29ffa042f61c784
   */
  previousHash: string;
  // root_tx_hash
  /**
   * @example
   * da9a42027ab141c8396b7fc78d74c94264da71f6361ac468385bed3fbc5408b4
   */
  rootTxHash: string;
  // size
  /**
   * @example
   * 1024
   */
  size: number;
  // transaction_size
  /**
   * @example
   * 1
   */
  transactionSize: number;
  // version
  /**
   * @example
   * 258
   */
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
  /**
   * @example
   * 123123123
   */
  signature: string;
  // 交易hash
  /**
   * @example
   * 1232123
   */
  txHash: string;
  // vc传输目标did
  /**
   * @example
   * 验证者id
   */
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
  /**
   * @example
   * ant_chain_id
   */
  antChainId?: string;
  // q_r_code_type
  /**
   * @example
   * q_r_code_type
   */
  qRCodeType?: string;
  // authorization_type
  /**
   * @example
   * authorization_type
   */
  authorizationType?: string;
  // pagination
  /**
   * @example
   * pagination
   */
  pagination?: ALiYunPagination;
  // ALiYunChainMiniAppAuthorizedUser
  /**
   * @example
   * ALiYunChainMiniAppAuthorizedUser
   */
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
  /**
   * @example
   * 1
   */
  currentNode: number;
  // 扩展信息
  /**
   * @example
   * 68f955a58591e80b94e6ed755722abab4d665936a59bbe6482dd0be9aad21d9a
   */
  extensionInfo?: string;
  // 节点列表
  nodes: NodeDetail[];
  // 流程ID
  /**
   * @example
   * 68f955a58591e80b94e6ed755722abab4d665936a59bbe6482dd0be9aad21d9a
   */
  processId: string;
  // 流程状态
  /**
   * @example
   * processing
   */
  processStatus: string;
  // 流程节点总数
  /**
   * @example
   * 1
   */
  totalCount: number;
  // 数据对象ID
  /**
   * @example
   * did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
   */
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
  /**
   * @example
   * region_id
   */
  regionId?: string;
  // type_list
  /**
   * @example
   * type_list
   */
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
  /**
   * @example
   * 13473121212
   */
  phone: string;
  // 用户账户
  /**
   * @example
   * testAccount
   */
  userAccount: string;
  // 用户名称
  /**
   * @example
   * 小明
   */
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
  /**
   * @example
   * user_request_id
   */
  userRequestId?: string;
  // data
  /**
   * @example
   * data
   */
  data?: string;
  // success
  /**
   * @example
   * true, false
   */
  success?: boolean;
  // code
  /**
   * @example
   * code
   */
  code?: string;
  // message
  /**
   * @example
   * message
   */
  message?: string;
  // synchro
  /**
   * @example
   * true, false
   */
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
  /**
   * @example
   * SOCIAL_INSURANCE
   */
  productCode: string;
  // 产品简称
  /**
   * @example
   * 社保
   */
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
  /**
   * @example
   * 12345
   */
  bizid: string;
  // 0: 身份证；1：手机；2: 电子邮箱；3: 企业营业执照号
  /**
   * @example
   * 0
   */
  entityInfoType?: number;
  // 对应entity_info_type的具体值
  // 
  /**
   * @example
   * 18701207322
   */
  entityInfoValue?: string;
  // 账户对应实体的全名
  /**
   * @example
   * huihui.liu
   */
  fullName?: string;
  // 该账户在指定链上的状态1，激活，2，冻结，新建账户只能为1
  status: number;
  // 希望映射后在链上的账户名
  /**
   * @example
   * huihui_online
   */
  targetName?: string;
  // 该账户对应实体的类型：0， 个人； 1， 企业
  /**
   * @example
   * 1
   */
  type?: number;
  // 自有系统中该账户的唯一标示
  /**
   * @example
   * huihui
   */
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
  /**
   * @example
   * 6
   */
  totalElements: number;
  // 记录总页数
  /**
   * @example
   * 20
   */
  totalPages: number;
  // 页码
  /**
   * @example
   * 0
   */
  number: number;
  // 每页记录条目
  /**
   * @example
   * 6
   */
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
  /**
   * @example
   * LTAIR4HVnajwxdUK
   */
  accessId: string;
  // 一个需要回调通知服务端的方法名，非必填
  /**
   * @example
   * callBackFunction
   */
  callback?: string;
  // oss上的文件存放路径
  /**
   * @example
   * contract/abi/lP9v5bJsvY1566977941329
   */
  dir: string;
  // url超期的时间戳说明
  /**
   * @example
   * 1566977971
   */
  expire: string;
  // oss的地址
  /**
   * @example
   * https://baas-XXX.oss-cn-shanghai.aliyuncs.com
   */
  host: string;
  // 被base64编码的policy内容
  /**
   * @example
   * eyJleHBpcmF0aW9uIjoiMjAxOS0wOC0yOFQwNzozOTozMS4zMjlaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsMTA0ODU3NjBdLFsic3RhcnRzLXdpdGgiLCIka2V5IiwiY29udHJhY3QvYWJpL2xQOXY1YkpzdlkxNTY2OTc3OTQxMzI5Il1dfQ==
   */
  policy: string;
  // 签名结果
  /**
   * @example
   * sQEa/Q8F/e5jqDWPvTVYtZ5Ysbw=
   */
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
  /**
   * @example
   * did:mychain:xxxx
   */
  controller: string;
  // 旧Auth Key的过期时间
  /**
   * @example
   * 1567890
   */
  previousAuthKeyExpire: string;
  // 更新Did doc的版本
  /**
   * @example
   * 1
   */
  previousVersion: number;
  // 新DID Auth key的public key id
  /**
   * @example
   * key#3
   */
  publicKeyId: string;
  // 密钥对生成算法
  /**
   * @example
   * RsaVerificationKey2018
   */
  publicKeyType: string;
  // 公钥的实际值
  /**
   * @example
   * xxxxxx
   */
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
  /**
   * @example
   * csv
   */
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
  /**
   * @example
   * did:mychain:xxxx
   */
  controller: string;
  // did描述符
  /**
   * @example
   * did:mychain:xxxxx
   */
  did: string;
  // did doc
  /**
   * @example
   * json字段
   */
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
  /**
   * @example
   * 27ce375122ef483691488395808e009e
   */
  bizid: string;
  // blockchain_name
  /**
   * @example
   * BAASQATEST
   */
  blockchainName: string;
  // blockchain_status
  /**
   * @example
   * true
   */
  blockchainStatus: boolean;
  // block_hash
  /**
   * @example
   * 4a6306e001a484c5c1d198668008b4876b991c5369a18a8431e9e7b37b021694
   */
  blockHash: string;
  // create_time
  /**
   * @example
   * 1604565300002
   */
  createTime: number;
  // hash_status
  /**
   * @example
   * true, false
   */
  hashStatus: boolean;
  // height
  /**
   * @example
   * 6814087
   */
  height: number;
  // previous_hash
  /**
   * @example
   * e70b3768125ac3543ba0c823fa56500eb4516c165cb7fd1489961fac961ee5f1
   */
  previousHash: string;
  // root_tx_hash
  /**
   * @example
   * 711f000e6604bf49bc4434b8ecd57ac98c0519e817d8f75bf6eef3caea7a0d79
   */
  rootTxHash: string;
  // transaction_list
  /**
   * @example
   * transaction_list
   */
  transactionList: BlockchainBrowserTransaction[];
  // transaction_size
  /**
   * @example
   * 11
   */
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
  /**
   * @example
   * c1bff3fe-f1fb-42a2-8fc7-9cbb1a011713
   */
  nodeId: string;
  // 节点类型
  /**
   * @example
   * GROUP、AND
   */
  nodeType: string;
  // 是否排除
  /**
   * @example
   * true, false
   */
  exclude: boolean;
  // 节点配置
  /**
   * @example
   * "nodeConfig": { "tagCode": "P0010GC6", "valueList": [ { "selectedValues": [ "18", "30" ], "operator": "BT" } ], "tagType": "BASE" }
   */
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
  /**
   * @example
   * true, false
   */
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
  /**
   * @example
   * notary_blockchain
   */
  notaryBlockchain?: ALiYunNotaryBlockchain;
  // contract_blockchain
  /**
   * @example
   * contract_blockchain
   */
  contractBlockchain?: ALiYunContractBlockchain;
  // old_contract_blockchain
  /**
   * @example
   * old_contract_blockchain
   */
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
  /**
   * @example
   * 1
   */
  level: number;
  // 上级推广订单id
  /**
   * @example
   * test id
   */
  parentId: string;
  // 推广人id
  /**
   * @example
   * test id
   */
  promoterId: string;
  // 返佣额度
  /**
   * @example
   * 10.5
   */
  quota: string;
  // 返佣比例 10表示10%
  /**
   * @example
   * 10
   */
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
  /**
   * @example
   * true,false
   */
  authorized?: boolean;
  // transaction_response
  /**
   * @example
   * transaction_response
   */
  transactionResponse?: string;
  // transaction_receipt
  /**
   * @example
   * transaction_receipt
   */
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
  /**
   * @example
   * 1234567890
   */
  pubKey?: string;
  // 托管秘钥ID
  /**
   * @example
   * 1234567890
   */
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
  /**
   * @example
   * 789
   */
  draweeTaxNo: string;
  // 业务方企业id
  /**
   * @example
   * 123
   */
  orgId: string;
  // 业务方用户id
  /**
   * @example
   * 456
   */
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
  /**
   * @example
   * cme20230724104931af3a4d
   */
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
  /**
   * @example
   * xxx
   */
  licenseNo: string;
  // 车架号
  /**
   * @example
   * xx
   */
  vin: string;
  // 发动机号
  /**
   * @example
   * xxx
   */
  engineNo: string;
  // 
  // 注册日期
  /**
   * @example
   * xxxx
   */
  registerDate: string;
  // 车型
  /**
   * @example
   * xxx
   */
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
  /**
   * @example
   * 1
   */
  num: number;
  // 页大小
  /**
   * @example
   * 200
   */
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
  /**
   * @example
   * 2018-01-02 20:00:00
   */
  createTime: string;
  // 用户手机号
  /**
   * @example
   * 13000005555
   */
  mobile: string;
  // 用户唯一标识
  /**
   * @example
   * 000:111:222:333
   */
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
  /**
   * @example
   * 200
   */
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
  /**
   * @example
   * test
   */
  extension?: string;
  // 申请权限原因
  /**
   * @example
   * test
   */
  message?: string;
  // 下一个处理节点ID
  /**
   * @example
   * did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
   */
  next?: string;
  // 流程ID
  /**
   * @example
   * 68f955a58591e80b94e6ed755722abab4d665936a59bbe6482dd0be9aad21d9a
   */
  processId: string;
  // 流程状态
  /**
   * @example
   * processing
   */
  status: string;
  // 数据对象ID
  /**
   * @example
   * did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
   */
  dataId: string;
  // 交易HASH
  /**
   * @example
   * AQEETAAAAEEAAAAETbYFwqfIiyqFWt2Tasr2f4
   */
  txHash?: string;
  // 区块高度
  /**
   * @example
   * 1256
   */
  blockNumber?: number;
  // 授权凭证
  /**
   * @example
   * JSON格式
   */
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
  /**
   * @example
   * did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
   */
  issuerId: string;
  // 公钥内容
  /**
   * @example
   * AQEETAAAAEEAAAAETbYFwqfIiyqFWt2Tasr2f4+wjKcEXsFupLxM6WZohB702fTTsuw88bp7LKBskdWhDiZvpeIShOzZopg95psaFw==
   */
  publicKeyContent: string;
  // 公钥接受者ID
  /**
   * @example
   * did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2
   */
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
  /**
   * @example
   * abi-oss-key
   */
  abiOssKey: string;
  // abi oss 地址
  /**
   * @example
   * abi-oss-url
   */
  abiOssUrl?: string;
  // 区块链唯一标识
  /**
   * @example
   * 0001bcde
   */
  bizid: string;
  // 区块链名称
  /**
   * @example
   * 合约体验链
   */
  blockchainName: string;
  // bytecode对应oss key
  /**
   * @example
   * bytecode-oss-key
   */
  bytecodeOssKey: string;
  // bytecode oss 地址
  /**
   * @example
   * bytecode-oss-url
   */
  bytecodeOssUrl?: string;
  // 16进制表示的合约identity
  /**
   * @example
   * e7d3e769f3f593dadcb8634cc5b09fc90dd3a61c4a06a79cb0923662fe6fae6b
   */
  identity: string;
  // 合约代码中定义的合约实例名，比如solidity的contract 关键字后面的命名
  /**
   * @example
   * instance-name
   */
  instanceName: string;
  // 合约名称
  /**
   * @example
   * contract-name
   */
  name: string;
  // 发布状态，1未发布，3已发布
  /**
   * @example
   * 3
   */
  publish: number;
  // 交易hash
  /**
   * @example
   * e93372533f323b2f12783aa3a586135cf421486439c2cdcde47411b78f9839ec
   */
  txHash: string;
  // solidity|cpp|go
  /**
   * @example
   * solidity
   */
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
  /**
   * @example
   * data
   */
  data: string;
  // gas_used
  /**
   * @example
   * 0
   */
  gasUsed: number;
  // logs
  /**
   * @example
   * awdawd
   */
  logs: string[];
  // result
  /**
   * @example
   * 0
   */
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
  /**
   * @example
   * 06
   */
  siteType: string;
  // 站点地址
  /**
   * @example
   * https://open.alipay.com
   */
  siteUrl: string;
  // 站点名称
  /**
   * @example
   * XXX网站
   */
  siteName: string;
  // 小程序 appId
  /**
   * @example
   * 2021004105652035
   */
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
  /**
   * @example
   * 1000
   */
  epAmount: number;
  // 用户账户
  /**
   * @example
   * testAccount
   */
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
  /**
   * @example
   * 1100034
   */
  id?: number;
  // 活动ID
  /**
   * @example
   * 1100001911234
   */
  activityId?: string;
  // 活动名称
  /**
   * @example
   * xx面馆活动
   */
  activityName?: string;
  // 用户ID
  /**
   * @example
   * 2088000098761234
   */
  userId?: string;
  // 业务ID
  /**
   * @example
   * 110001011234
   */
  bizId?: string;
  // 记录来源：NORMAL（正常发券）/ HAITUN_SYNC（上游补录）
  /**
   * @example
   * NORMAL
   */
  recordSource?: string;
  // 创建时间
  /**
   * @example
   * yyyy-MM-dd HH:mm:ss
   */
  gmtCreate?: string;
  // 更新时间
  /**
   * @example
   * yyyy-MM-dd HH:mm:ss
   */
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
  /**
   * @example
   * 普通任务修改
   */
  taskName: string;
  // appId
  /**
   * @example
   * 2021004121633301
   */
  appId: string;
  // 问卷ID
  /**
   * @example
   * ybl1112
   */
  surveyId: string;
  // 任务ID
  /**
   * @example
   * qdQxqU5gz
   */
  taskId: string;
  // 备注信息
  /**
   * @example
   * 普通任务修改测试
   */
  notes?: string;
  // 租户ID
  /**
   * @example
   * RIVUFSJG
   */
  tenantId: string;
  // 操作者ID
  /**
   * @example
   * eipzps@alitest.comtest
   */
  operator: string;
  // banner标题
  /**
   * @example
   * 普通任务banner
   */
  bannerTitle: string;
  // banner图片地址（最多支持3张）
  /**
   * @example
   * testTenant_1.png,testTenant_1.png
   */
  bannerImageUrls?: string;
  // banner 图片地址, 拼装后的url
  /**
   * @example
   * ["testTenant_1.png","testTenant_1.png"]
   */
  bannerImageFullUrls?: string[];
  // 题量
  /**
   * @example
   * 10
   */
  questionNum: number;
  // 任务连接地址
  /**
   * @example
   * https://pro.wenjuan.com/t/a1
   */
  taskLinkUrl: string;
  // 人群划分描述
  /**
   * @example
   * 购买过健身服装的人群
   */
  personDivideContent?: string;
  // 城市列表
  /**
   * @example
   * 新加坡,纽约,tokey
   */
  cityDivideUrls?: string;
  // 城市列表, 拼装后的url
  /**
   * @example
   * [_新加坡_,"纽约","tokey"]
   */
  cityDivideFullUrls?: string[];
  // 样本数量
  /**
   * @example
   * 100
   */
  sampleNum: number;
  // 完成样本量
  /**
   * @example
   * 2
   */
  completedNum: number;
  // 产品下单code类型（1-资源包 2-后付费）
  /**
   * @example
   * 1
   */
  productCodeType: string;
  // 产品余量
  /**
   * @example
   * 13
   */
  productCapacity: number;
  // 奖励渠道（0-手动发支付宝余额 1-海豚红包 2-问卷自带）
  /**
   * @example
   * 1
   */
  prizeChannel: number;
  // 支付宝账号
  /**
   * @example
   * kefu@lingdangshuo.com
   */
  alipayAccountId?: string;
  // 奖励类型（0-定额红包）
  /**
   * @example
   * 0
   */
  prizeType: number;
  // 全额红包金额，奖励渠道为0和1时
  /**
   * @example
   * 1.00
   */
  fullRedPacketAmount: string;
  // 全额红包描述，奖励渠道为2时，此处必填
  /**
   * @example
   * 1-6元红包
   */
  fullRedPacketTextInfo?: string;
  // 甄别红包金额
  /**
   * @example
   * 0.01
   */
  examineRedPacketAmount: string;
  // 关联的证书instanceId
  /**
   * @example
   * 6511ce4b43414e9588114682bbf9a893
   */
  certInstanceId?: string;
  // 证书实例详情
  certInstanceDetail: CertInstanceDetail;
  // 审核意见
  /**
   * @example
   * 拒绝
   */
  verifyOmment?: string;
  // 任务创建时间
  /**
   * @example
   * 2023-12-20 12:19:00
   */
  gmtCreate: string;
  // 任务修改时间
  /**
   * @example
   * 2023-12-20 12:45:00
   */
  gmtModified: string;
  // 审核理由
  /**
   * @example
   * 不合适
   */
  reviewContent?: string;
  // 状态
  /**
   * @example
   * 9
   */
  status: number;
  // 人群配置
  /**
   * @example
   * {"exclude": false,"nodeConfig": {"groupType": "AND","children": ["exclude": false,"nodeType": "GROUP","nodeId": "1303661d-a7da-4d8a-b646-0819f2fc2855","nodeConfig": {"groupType": "AND","children": []}}]},"nodeId": "ROOT","nodeType": "GROUP"}
   */
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
  /**
   * @example
   * block_hash
   */
  blockHash?: string;
  // block_height
  /**
   * @example
   * 123131
   */
  blockHeight?: number;
  // block_version
  /**
   * @example
   * block_version
   */
  blockVersion?: string;
  // create_time
  /**
   * @example
   * 213213
   */
  createTime?: number;
  // hash
  /**
   * @example
   * hash
   */
  hash?: string;
  // Transaction
  /**
   * @example
   * Transaction
   */
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
  /**
   * @example
   * key-1
   */
  keyId: string;
  // 公钥内容
  /**
   * @example
   * 7ceb38181822437c82909506a87aa456
   */
  publicKey: string;
  // 算法类型
  /**
   * @example
   * Secp256k1VerificationKey2018
   */
  signType: string;
  // 过期时间戳（毫秒）
  /**
   * @example
   * 18600000000
   */
  expire?: number;
  // 公钥状态，0:不可用 1:可用
  /**
   * @example
   * 1
   */
  status: number;
  // 创建者的did
  /**
   * @example
   * did:xxxx:xxxxxxxx
   */
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
  /**
   * @example
   * valid
   */
  status: string;
  // 可验证声明id
  /**
   * @example
   * vc:mychain:xxxx
   */
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
  /**
   * @example
   * app20230725115808679d4f
   */
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
  /**
   * @example
   * 2018-10-10 10:10:00
   */
  createTime: string;
  // 手机号
  /**
   * @example
   * 186xxxxx
   */
  phoneNumber: string;
  // 用户姓名
  /**
   * @example
   * xxxxxxx
   */
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
  /**
   * @example
   * XXX
   */
  vin?: string;
  // 发动机号
  /**
   * @example
   * XXX
   */
  engineNo?: string;
  // 注册日期
  /**
   * @example
   * XXX
   */
  registerDate?: string;
  // 品牌车型
  /**
   * @example
   * XXX
   */
  modelCode?: string;
  // 营运性质
  /**
   * @example
   * XXX
   */
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
  /**
   * @example
   * TwoMeta
   */
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
  /**
   * @example
   * xxx
   */
  brandId: string;
  // 品牌名称
  /**
   * @example
   * xxx
   */
  brandName: string;
  // 车系ID
  // 
  /**
   * @example
   * xxx
   */
  carSeriesId: string;
  // 车系名称
  /**
   * @example
   * xxx
   */
  carSeries: string;
  // 车型ID
  /**
   * @example
   * xxx
   */
  carId: string;
  // 车型名称
  /**
   * @example
   * xxx
   */
  carName: string;
  // 年款
  /**
   * @example
   * xxx
   */
  carYear: string;
  // 城市code
  /**
   * @example
   * xxx
   */
  cityCode: string;
  // 城市名称
  /**
   * @example
   * xxx
   */
  cityName: string;
  //   车系指导价（范围值） 单位到分
  /**
   * @example
   * {"min":1234,"max":5678}
   */
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
  /**
   * @example
   * xxx
   */
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
  /**
   * @example
   * S210304150059
   */
  antChainId?: string;
  // 子链名称
  /**
   * @example
   * 子链名称
   */
  blockchainName?: string;
  // 联盟管理员
  /**
   * @example
   * true, false
   */
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
  /**
   * @example
   * 存证合约
   */
  type?: string;
  // 页码
  /**
   * @example
   * 1
   */
  num: number;
  // 页大小
  /**
   * @example
   * 200
   */
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
  /**
   * @example
   * xxx
   */
  submitId: string;
  // 是否成功
  /**
   * @example
   * true, false
   */
  isSuccess: boolean;
  // OK
  // NO_DEMAND 无线索需求，需要重试
  // INVALID 无效，不要重试
  /**
   * @example
   * OK/INVALID/NO_DEMAND
   */
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
  /**
   * @example
   * P0010GC6
   */
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
  /**
   * @example
   * -
   */
  agreementName: string;
  // 协议类型
  /**
   * @example
   * USER_SERVICE_AUTH
   */
  agreementType: string;
  // 第三方原始协议链接
  /**
   * @example
   * -
   */
  agreementUrl: string;
  // 协议文件上传目录
  /**
   * @example
   * -
   */
  agreementFileOssKey: string;
  // 上传时的协议原始文件名
  /**
   * @example
   * -
   */
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
  /**
   * @example
   * alias
   */
  alias?: string;
  // block_hash
  /**
   * @example
   * block_hash
   */
  blockHash?: string;
  // root_tx_hash
  /**
   * @example
   * root_tx_hash
   */
  rootTxHash?: string;
  // height
  /**
   * @example
   * 120
   */
  height?: number;
  // previous_hash
  /**
   * @example
   * previous_hash
   */
  previousHash?: string;
  // create_time
  /**
   * @example
   * 12312312312
   */
  createTime?: number;
  // biz_data
  /**
   * @example
   * biz_data
   */
  bizData?: string;
  // transaction_size
  /**
   * @example
   * 12
   */
  transactionSize?: number;
  // version
  /**
   * @example
   * 20
   */
  version?: number;
  // size
  /**
   * @example
   * size
   */
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
  /**
   * @example
   * 12
   */
  sortId?: number;
  // 字段描述
  /**
   * @example
   * 联盟名称
   */
  text: string;
  // 提示信息
  /**
   * @example
   * 提示信息
   */
  tips?: string;
  // 单位信息
  /**
   * @example
   * 单位信息
   */
  unit?: string;
  // 值内容
  /**
   * @example
   * 值内容
   */
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
  /**
   * @example
   * 200
   */
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
  /**
   * @example
   * 465518149b3407dc927e05208136c42b2c6b82fe961006f3dff5202b0c3d8764
   */
  account?: string;
  // 账户创建时间
  /**
   * @example
   * 1573442990479
   */
  createTime?: number;
  // 创建该账户的交易hash
  /**
   * @example
   * fffc98e106171ee7783fb79a433312e3ac98091cb82e7292ec62462138c7ff8e
   */
  hash?: string;
  // 创建该账户的 账户hash
  /**
   * @example
   * e7d3e769f3f593dadcb8634cc5b09fc90dd3a61c4a06a79cb0923662fe6fae6b
   */
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
  /**
   * @example
   * 2
   */
  previousVersion: number;
  // 指定服务的id
  /**
   * @example
   * service#2
   */
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
  /**
   * @example
   * 招商银行杭州高新支行
   */
  accountBranchName: string;
  // 卡户名
  /**
   * @example
   * 张三
   */
  accountHolderName: string;
  // 开户行所在地-市
  /**
   * @example
   * 杭州市
   */
  accountInstCity: string;
  // 开户行简称缩写
  /**
   * @example
   * CMB
   */
  accountInstId: string;
  // 银行名称
  /**
   * @example
   * 招商银行
   */
  accountInstName: string;
  // 开户行所在地-省
  /**
   * @example
   * 浙江省
   */
  accountInstProvince: string;
  // 银行卡号
  /**
   * @example
   * 6214855710610408
   */
  accountNo: string;
  // 卡类型
  /**
   * @example
   * DC
   */
  accountType: string;
  // 账号使用类型
  /**
   * @example
   * 01
   */
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
  /**
   * @example
   * add
   */
  action: string;
  // 本次事件的触发者
  /**
   * @example
   * xxxxx
   */
  from: string;
  // 事件在区块的高度
  /**
   * @example
   * 6300
   */
  height: number;
  // 该VC的颁发者
  /**
   * @example
   * did:mychian:xxxxx
   */
  issuer: string;
  // 有效，或者无效
  /**
   * @example
   * valid
   */
  status: string;
  // 该vc的接受者
  /**
   * @example
   * hash256(did:mychain:xxxxx)
   */
  subjec: string;
  // 交易hash
  // 
  /**
   * @example
   * xxxx
   */
  txHash: string;
  // 交易在区块中的index
  /**
   * @example
   * 1
   */
  txIndex: number;
  // 可验证声明Hash值
  /**
   * @example
   * hash256(可验证声明)
   */
  vcHash: string;
  // vcid
  /**
   * @example
   * vc:mychain:XXXX
   */
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
  /**
   * @example
   * did:mychain:xxxxxxxxx
   */
  controller: string;
  // 服务地址
  /**
   * @example
   * www.xxxx.com/xxxx
   */
  endPoint: string;
  // 服务id
  /**
   * @example
   * did:service:xxxxxx
   */
  serviceId: string;
  // 服务类型
  /**
   * @example
   * xxxx
   */
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
  /**
   * @example
   * XX
   */
  userId: string;
  // 手机号
  /**
   * @example
   * XXX
   */
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
  /**
   * @example
   * ACconstellation_ADF
   */
  poapId: string;
  // 徽章名字
  /**
   * @example
   * 星座徽章
   */
  poapName: string;
  // 徽章HASH
  /**
   * @example
   * 0fddf9087f7c5bd71c2fabb4b520bdec9fe7157c00807b26f9ddff9cd5d73d77
   */
  uniHash: string;
  // 状态，枚举值
  /**
   * @example
   * FINISHED
   */
  status?: string;
  // 徽章资源 URL
  /**
   * @example
   * http://xxxx.ff.png
   */
  poapUrl: string;
  // 枚举值，2D_IMAGE--2D图片渲染；3D_OASISENGINE--3D模型渲染
  /**
   * @example
   * 2D_IMAGE
   */
  renderType: string;
  // 3D模型降级使用的资源URL
  /**
   * @example
   * http://xxx.png
   */
  faultToleranceUrl?: string;
  // 小程序详情跳转URL。临时链接，过期时间为 detail_alipays_url_expire_time 字段的值
  /**
   * @example
   * alipays://platformapi/startapp?
   */
  detailAlipaysUrl?: string;
  // 详情页跳转URL过期时间
  /**
   * @example
   * 2022-12-31 23:59:59
   */
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
  /**
   * @example
   * 123123
   */
  did: string;
  // 分布式数字身份对应的用户名称
  /**
   * @example
   * 蚂蚁金服
   */
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
  /**
   * @example
   * erpDataReader-1
   */
  tappName: string;
  // 版本号，如果不填就选择最新的版本
  tappVersion?: number;
  // 该tapp将被声明在did doc中的id
  /**
   * @example
   * erpDataReader-1
   */
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
  /**
   * @example
   * id
   */
  id?: string;
  // consortium_id
  /**
   * @example
   * consortium_id
   */
  consortiumId?: string;
  // gmt_create
  /**
   * @example
   * 21312312312
   */
  gmtCreate?: number;
  // gmt_modified
  /**
   * @example
   * 123123212
   */
  gmtModified?: number;
  // name
  /**
   * @example
   * name
   */
  name?: string;
  // version
  /**
   * @example
   * version
   */
  version?: string;
  // description
  /**
   * @example
   * description
   */
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
  /**
   * @example
   * 1989.76
   */
  creditLimit?: string;
  // 信用凭证到期时间
  /**
   * @example
   * 20191212
   */
  expireDate?: string;
  // 凭证来源方did
  /**
   * @example
   * did:mychain:1b8b30228ec99cb5de99b2265538f3c505b274e0bef98fb9cee7aabd8f5f47eb
   */
  fromDid?: string;
  // 信用凭证发起时间
  /**
   * @example
   * 20190101
   */
  issueDate?: string;
  // 信用流转凭证
  /**
   * @example
   * 000abc
   */
  issueId?: string;
  // 流水类型
  /**
   * @example
   * 融资提现
   */
  stateType?: string;
  // 凭证流转方did
  /**
   * @example
   * did:mychain:1b8b30228ec99cb5de99b2265538f3c505b274e0bef98fb9cee7aabd8f5f47eb
   */
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
  /**
   * @example
   * undefined
   */
  displayInfo?: DisplayInfo;
  // 定价策略
  /**
   * @example
   * undefined
   */
  priceStrategy?: PriceStrategy;
  // 奖品基本信息
  /**
   * @example
   * undefined
   */
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
  /**
   * @example
   * xx
   */
  carSeries: string;
  // 金融方案
  /**
   * @example
   * xxx
   */
  finaicalPlan?: string;
  // 车系id
  /**
   * @example
   * xxx
   */
  carSeriesId?: string;
  // 请求提交唯一id
  /**
   * @example
   * xxxx
   */
  submitId?: string;
  // 预计购买时间
  /**
   * @example
   * 1
   */
  purcharseTime?: string;
  // 用户信息
  userInfo: CarUserInfo;
  // 懂车帝或者汽车之家
  /**
   * @example
   * DCD/QC
   */
  matchSource?: string;
  // 汽车之家车型id
  /**
   * @example
   * 123
   */
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
  /**
   * @example
   * pagination
   */
  pagination?: ALiYunPagination;
  // contract_projects
  /**
   * @example
   * contract_projects
   */
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
  /**
   * @example
   * type_id
   */
  typeId?: number;
  // cpu
  /**
   * @example
   * 24
   */
  cpu?: number;
  // memory
  /**
   * @example
   * 24
   */
  memory?: number;
  // disk
  /**
   * @example
   * 500
   */
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
  /**
   * @example
   * 货物个数
   */
  desc: string;
  // 结构化存证该数据字段的唯一索引
  /**
   * @example
   * item_id
   */
  key: string;
  // 结构化存证时该item的类型
  // 0 text
  // 1 encrypt text
  // 2 txHash
  // 3 image url
  // 4 vedio url
  // 5 map url
  /**
   * @example
   * 0
   */
  type: number;
  // 结构化数据存证时，该item的值
  /**
   * @example
   * 10个
   */
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
  /**
   * @example
   * hash
   */
  hash?: string;
  // transaction_v10_type
  /**
   * @example
   * transaction_v10_type
   */
  transactionV10Type?: string;
  // trans_type_v6
  /**
   * @example
   * trans_type_v6
   */
  transTypeV6?: string;
  // from
  /**
   * @example
   * from
   */
  from?: string;
  // to
  /**
   * @example
   * to
   */
  to?: string;
  // create_time
  /**
   * @example
   * 1231231231
   */
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
  /**
   * @example
   * 1
   */
  num: number;
  // 页大小
  /**
   * @example
   * 200
   */
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
  /**
   * @example
   * CZKZJVCN
   */
  grantedUser: string[];
  // 密钥名称
  /**
   * @example
   * subunion_a_key
   */
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
  /**
   * @example
   * {"degree": {"type": "BachelorDegree","name": "Baccalauréat en musiques numériques"}}
   */
  claim: string;
  // 证书类型
  /**
   * @example
   * claimtype
   */
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
  /**
   * @example
   * cme20230724104931af3a4d
   */
  serviceId?: string;
  // 合约服务名称
  /**
   * @example
   * 存证合约
   */
  name?: string;
  // 创建人
  /**
   * @example
   * 张三
   */
  creator?: string;
  // 创建时间
  /**
   * @example
   * 1690166971465
   */
  createTime?: number;
  // 订购产品
  /**
   * @example
   * 存证合约服务
   */
  orderingProducts?: string;
  // 关联区块链id
  /**
   * @example
   * 284f75bc-8069-443f-9d46-4576bb15f210
   */
  chanId?: string;
  // 合约状态
  /**
   * @example
   * DEPLOYED
   */
  contractStatus?: string;
  // 合约部署进度当前状态
  /**
   * @example
   * SERVICE_START
   */
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
  /**
   * @example
   * alipayAccount
   */
  defaultSettleType: string;
  // 默认结算目标	bankCard 时填银行卡号，alipayAccount 时填支付宝登录号
  /**
   * @example
   * myalipay@alipay.com
   */
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
  /**
   * @example
   * 5
   */
  id: string;
  // 实例
  /**
   * @example
   * "MQ_INST_1287126353308684_BXYEnC3u"
   */
  instance?: string;
  // 主题
  /**
   * @example
   * "tfx4lb3m0qh3emact73tln8t8qkygb65"
   */
  topic?: string;
  // 类型
  /**
   * @example
   * "basic"
   */
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
  /**
   * @example
   * b99e641b2d6d45ac90600fd958e8bc3a
   */
  bizId: string;
  // 存证ID，如果颁发失败，此值为null
  /**
   * @example
   * vc:mychain:xxxxxx
   */
  vcId: string;
  // 因校验异常停止任务（不会继续校验文件内容和颁发证书） -3
  // 因校验内容不正确停止颁发任务(会校验完所有的行但不执行颁发) -2
  // 已手动取消（可重试状态下手动取消任务，取消状态下可以启动新的颁发任务） -1
  // 可重试 0
  // 执行中（初始状态） 1
  // 已成功完成 2
  /**
   * @example
   * 2
   */
  status: number;
  // is_error=true时的错误描述
  /**
   * @example
   * 标题格式不正确
   */
  errorMessage: string;
  // 证书的字段标题列表
  /**
   * @example
   * [身份证号,姓名,证书字段1]
   */
  titles: string[];
  // 颁发进度百分比
  /**
   * @example
   * 0-100
   */
  progressPercent: number;
  // 当前批次数据总行数（不含标题）
  /**
   * @example
   * 0-5000
   */
  totalNum: string;
  // 颁发证书当前执行的阶段，VERIFY：校验文件中，ISSUE：颁发中
  /**
   * @example
   * VERIFY、ISSUE
   */
  curTaskType: string;
  // 颁发开始的时间戳
  /**
   * @example
   * 18123123123123
   */
  startTimeMillis: number;
  // 颁发结束的时间戳
  /**
   * @example
   * 182371293192831
   */
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
  /**
   * @example
   * apple-01
   */
  goodsId: string;
  // 该商品的退款总金额
  /**
   * @example
   * 19.50
   */
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
  /**
   * @example
   * content
   */
  content: string;
  // 链上存证哈希
  /**
   * @example
   * 04181b49ee5d7eb0099a289ac8a45df6afb5aa2679c5284444698a9790099269
   */
  transactionHash: string;
  // 存证类型
  /**
   * @example
   * text,file
   */
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
  /**
   * @example
   * createTime
   */
  createTime: number;
  // from
  /**
   * @example
   * eeb0aa76449922c8ec718b97ec5da4c493d46d66a1f446fdce2ba29263efd612
   */
  from: string;
  // to
  /**
   * @example
   * e4386406265f8a0f7d3a84efec3afa3ea12d2f9a3c21e2928a7b4d6a4e70ba68
   */
  to: string;
  // hash
  /**
   * @example
   * eeb0aa76449922c8ec718b97ec5da4c493d46d66a1f446fdce2ba29263efd612
   */
  hash: string;
  // transactionV10Type
  /**
   * @example
   * TX_DEPOSIT_DATA
   */
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
  /**
   * @example
   * 1560827725
   */
  issueDate: number;
  // 版通线下发行量
  /**
   * @example
   * 1000
   */
  offlineIssueAmount: number;
  // 版通线上发行量
  /**
   * @example
   * 1000
   */
  onlineIssueAmount: number;
  // 版通自持发行量
  /**
   * @example
   * 1000
   */
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
  /**
   * @example
   * 284f75bc-8069-443f-9d46-4576bb15f210
   */
  chainId: string;
  // 合约模板标识
  /**
   * @example
   * cme2023072511571851e2f3
   */
  templateId: string;
  // 合约名称
  /**
   * @example
   * 资产合约
   */
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
  /**
   * @example
   * 张某某
   */
  agent?: string;
  // 经办人身份证号
  /**
   * @example
   * 130406200101012832
   */
  agentId?: string;
  // 用户的姓名
  /**
   * @example
   * 李明
   */
  certName: string;
  // 用户的身份证号
  /**
   * @example
   * 410204200101013716
   */
  certNo: string;
  // 用户证件类型，目前只支持IDENTITY_CARD
  /**
   * @example
   * IDENTITY_CARD
   */
  certType: string;
  // 法人姓名，企业认证必选
  /**
   * @example
   * 张某某
   */
  legalPerson?: string;
  // 法人身份证，企业认证必选
  /**
   * @example
   * 130406200101010634
   */
  legalPersonId?: string;
  // 手机号码
  /**
   * @example
   * 18322331111
   */
  mobileNo?: string;
  // 扩展属性字段
  /**
   * @example
   * {"key":"value"}
   */
  properties?: string;
  // 用户类型，默认为PERSON
  /**
   * @example
   * PERSON,ENTERPRISE
   */
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
  /**
   * @example
   * 4
   */
  abnormalNodes?: number;
  // ant_chain_id
  /**
   * @example
   * ant_chain_id
   */
  antChainId?: string;
  // block_height
  /**
   * @example
   * 2131
   */
  blockHeight?: number;
  // create_time
  /**
   * @example
   * 123131212312
   */
  createTime?: number;
  // is_role
  /**
   * @example
   * true
   */
  isRole?: boolean;
  // node_number
  /**
   * @example
   * 4
   */
  nodeNumber?: number;
  // normal
  /**
   * @example
   * true, false
   */
  normal?: boolean;
  // transaction_sum
  /**
   * @example
   * 312312
   */
  transactionSum?: number;
  // Version
  /**
   * @example
   * Version
   */
  version?: string;
  // node_infos
  /**
   * @example
   * node_infos
   */
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
  /**
   * @example
   * json string
   */
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
  /**
   * @example
   * 1
   */
  id: number;
  // 模板类别：马拉松类、滑雪类
  /**
   * @example
   * marathon
   */
  category: string;
  // 模板内容， json格式文本
  /**
   * @example
   * {}
   */
  claimTemplate: string;
  // 创建时间
  /**
   * @example
   * 2021-01-01 00:00:00
   */
  gmtCreate: string;
  // 修改时间
  /**
   * @example
   * 2021-01-01 00:00:00
   */
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
  /**
   * @example
   * 0zgNdId0nxi95b5lsNpazWYoCo5
   */
  activityId?: string;
  // 记录ID
  /**
   * @example
   * 110000199001011234
   */
  id?: string;
  // 业务ID
  /**
   * @example
   * b5lsNpazWYoCo5
   */
  bizId?: string;
  // 奖品id
  /**
   * @example
   * 110000199001011234
   */
  prizeId?: string;
  // 触发时间
  /**
   * @example
   * 2026-04-29 10:19:23
   */
  sendTime?: string;
  // 发券结果
  /**
   * @example
   * SUCCESS
   */
  sendStatus?: string;
  // 错误码
  /**
   * @example
   * 10000911
   */
  errorCode?: string;
  // 错误描述
  /**
   * @example
   * [10000911]指定奖品指定金额决策参数检查异常
   */
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

// 退款列表
export class RefundList extends $tea.Model {
  // 退款业务号
  /**
   * @example
   * XXX
   */
  outRequestNo: string;
  // 本次退款金额
  /**
   * @example
   * 1.09
   */
  refundAmount: string;
  // 退款状态
  /**
   * @example
   * XXX
   */
  refundStatus: string;
  static names(): { [key: string]: string } {
    return {
      outRequestNo: 'out_request_no',
      refundAmount: 'refund_amount',
      refundStatus: 'refund_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      outRequestNo: 'string',
      refundAmount: 'string',
      refundStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 退款信息
export class RefundInfo extends $tea.Model {
  // 退款业务号
  /**
   * @example
   * XXX
   */
  outRequestNo: string;
  // 本次退款金额
  /**
   * @example
   * 11.09
   */
  refundAmount: string;
  // 退款状态
  /**
   * @example
   * XXX
   */
  refundStatus: string;
  static names(): { [key: string]: string } {
    return {
      outRequestNo: 'out_request_no',
      refundAmount: 'refund_amount',
      refundStatus: 'refund_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      outRequestNo: 'string',
      refundAmount: 'string',
      refundStatus: 'string',
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

export class InitTradeAppRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 接入方 外部业务订单号，接入方 内唯一，创建后不可变
  outTradeNo: string;
  // 支付金额，单位：元，大于 0，最多两位小数
  totalAmount: string;
  // 商品或权益卡标题
  subject: string;
  // 用户登记手机号，中国大陆 11 位手机号
  registeredMobile?: string;
  // 用户登录接口返回的用户唯一标识
  openId: string;
  // 权益档位 ID
  tierId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outTradeNo: 'out_trade_no',
      totalAmount: 'total_amount',
      subject: 'subject',
      registeredMobile: 'registered_mobile',
      openId: 'open_id',
      tierId: 'tier_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outTradeNo: 'string',
      totalAmount: 'string',
      subject: 'string',
      registeredMobile: 'string',
      openId: 'string',
      tierId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class InitTradeAppResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接入方 外部业务订单号
  outTradeNo?: string;
  // 支付宝交易号，供小程序拉起支付
  tradeNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      outTradeNo: 'out_trade_no',
      tradeNo: 'trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      outTradeNo: 'string',
      tradeNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTradeAppRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 创建支付时的外部业务订单号
  outTradeNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outTradeNo: 'out_trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outTradeNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTradeAppResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接入方外部业务订单号
  outTradeNo?: string;
  // 支付宝交易号
  tradeNo?: string;
  // 支付状态
  tradeStatus?: string;
  // 订单金额，单位：元
  totalAmount?: string;
  // 实付金额，单位：元
  receiptAmount?: string;
  // 退款记录
  refundList?: RefundInfo[];
  // 累计退款金额
  totalRefundAmount?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      outTradeNo: 'out_trade_no',
      tradeNo: 'trade_no',
      tradeStatus: 'trade_status',
      totalAmount: 'total_amount',
      receiptAmount: 'receipt_amount',
      refundList: 'refund_list',
      totalRefundAmount: 'total_refund_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      outTradeNo: 'string',
      tradeNo: 'string',
      tradeStatus: 'string',
      totalAmount: 'string',
      receiptAmount: 'string',
      refundList: { 'type': 'array', 'itemType': RefundInfo },
      totalRefundAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CloseTradeAppRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 接入方 外部业务订单号
  outTradeNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outTradeNo: 'out_trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outTradeNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CloseTradeAppResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接入方 外部业务订单号
  outTradeNo?: string;
  // 支付宝交易号
  tradeNo?: string;
  // 支付状态
  tradeStatus?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      outTradeNo: 'out_trade_no',
      tradeNo: 'trade_no',
      tradeStatus: 'trade_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      outTradeNo: 'string',
      tradeNo: 'string',
      tradeStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecLoginAppRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 支付宝小程序本次取得的一次性授权码
  authCode: string;
  // 用户是否已签署隐私协议
  privacyAgreementSigned: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authCode: 'auth_code',
      privacyAgreementSigned: 'privacy_agreement_signed',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authCode: 'string',
      privacyAgreementSigned: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecLoginAppResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 由auth_code 换取的用户唯一标识
  openId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      openId: 'open_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      openId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecPromotionConsultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户 open_id
  openId: string;
  // 支付宝小程序 App ID
  appId: string;
  // 支付宝小程序 App ID
  activityId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      openId: 'open_id',
      appId: 'app_id',
      activityId: 'activity_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      openId: 'string',
      appId: 'string',
      activityId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecPromotionConsultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 咨询状态
  consultStatus?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      consultStatus: 'consult_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      consultStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBenefitAppRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户open_id
  openId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      openId: 'open_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      openId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBenefitAppResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 平台配置的档位稳定 ID，例如TIER_17
  tierId?: string;
  // 档位名称，例如中级会员17元
  tierName?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tierId: 'tier_id',
      tierName: 'tier_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tierId: 'string',
      tierName: 'string',
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
   * @remarks
   * Init client with Config
   * 
   * @param config - config contains the necessary information to create a client
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
   * @remarks
   * Encapsulate the request and invoke the network
   * 
   * @param action - api name
   * @param protocol - http or https
   * @param method - e.g. GET
   * @param pathname - pathname of every api
   * @param request - which contains request params
   * @param runtime - which controls some details of call api, such as retry times
   * @returns the response
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
          sdk_version: "1.4.1",
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
   * @remarks
   * Description: 查询活动及关联奖品详情信息
   * Summary: 查询活动及关联奖品详情信息
   */
  async queryBaasPromotionActivity(request: QueryBaasPromotionActivityRequest): Promise<QueryBaasPromotionActivityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBaasPromotionActivityEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询活动及关联奖品详情信息
   * Summary: 查询活动及关联奖品详情信息
   */
  async queryBaasPromotionActivityEx(request: QueryBaasPromotionActivityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBaasPromotionActivityResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasPromotionActivityResponse>(await this.doRequest("1.0", "baas.promotion.activity.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBaasPromotionActivityResponse({}));
  }

  /**
   * @remarks
   * Description: 为指定用户发放优惠券
   * Summary: 为指定用户发放优惠券
   */
  async execBaasPromotionCoupon(request: ExecBaasPromotionCouponRequest): Promise<ExecBaasPromotionCouponResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execBaasPromotionCouponEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 为指定用户发放优惠券
   * Summary: 为指定用户发放优惠券
   */
  async execBaasPromotionCouponEx(request: ExecBaasPromotionCouponRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecBaasPromotionCouponResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBaasPromotionCouponResponse>(await this.doRequest("1.0", "baas.promotion.coupon.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecBaasPromotionCouponResponse({}));
  }

  /**
   * @remarks
   * Description: 分页查询发券记录
   * Summary: 分页查询发券记录
   */
  async queryBaasPromotionCoupon(request: QueryBaasPromotionCouponRequest): Promise<QueryBaasPromotionCouponResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBaasPromotionCouponEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 分页查询发券记录
   * Summary: 分页查询发券记录
   */
  async queryBaasPromotionCouponEx(request: QueryBaasPromotionCouponRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBaasPromotionCouponResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasPromotionCouponResponse>(await this.doRequest("1.0", "baas.promotion.coupon.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBaasPromotionCouponResponse({}));
  }

  /**
   * @remarks
   * Description: 查询活动及关联奖品详情信息
   * Summary: 查询活动及关联奖品详情信息
   */
  async queryPromotionActivity(request: QueryPromotionActivityRequest): Promise<QueryPromotionActivityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPromotionActivityEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询活动及关联奖品详情信息
   * Summary: 查询活动及关联奖品详情信息
   */
  async queryPromotionActivityEx(request: QueryPromotionActivityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPromotionActivityResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPromotionActivityResponse>(await this.doRequest("1.0", "antdigital.agorax.promotion.activity.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPromotionActivityResponse({}));
  }

  /**
   * @remarks
   * Description: 为指定用户发放优惠券
   * Summary: 为指定用户发放优惠券
   */
  async execPromotionCoupon(request: ExecPromotionCouponRequest): Promise<ExecPromotionCouponResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execPromotionCouponEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 为指定用户发放优惠券
   * Summary: 为指定用户发放优惠券
   */
  async execPromotionCouponEx(request: ExecPromotionCouponRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecPromotionCouponResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecPromotionCouponResponse>(await this.doRequest("1.0", "antdigital.agorax.promotion.coupon.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecPromotionCouponResponse({}));
  }

  /**
   * @remarks
   * Description: 分页查询发券记录
   * Summary: 分页查询发券记录
   */
  async queryPromotionCoupon(request: QueryPromotionCouponRequest): Promise<QueryPromotionCouponResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPromotionCouponEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 分页查询发券记录
   * Summary: 分页查询发券记录
   */
  async queryPromotionCouponEx(request: QueryPromotionCouponRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPromotionCouponResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPromotionCouponResponse>(await this.doRequest("1.0", "antdigital.agorax.promotion.coupon.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPromotionCouponResponse({}));
  }

  /**
   * @remarks
   * Description: 小程序创建支付订单
   * Summary: 小程序创建支付订单
   */
  async initTradeApp(request: InitTradeAppRequest): Promise<InitTradeAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.initTradeAppEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 小程序创建支付订单
   * Summary: 小程序创建支付订单
   */
  async initTradeAppEx(request: InitTradeAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<InitTradeAppResponse> {
    Util.validateModel(request);
    return $tea.cast<InitTradeAppResponse>(await this.doRequest("1.0", "antdigital.agorax.trade.app.init", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new InitTradeAppResponse({}));
  }

  /**
   * @remarks
   * Description: 小程序交易查询
   * Summary: 小程序交易查询
   */
  async queryTradeApp(request: QueryTradeAppRequest): Promise<QueryTradeAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTradeAppEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 小程序交易查询
   * Summary: 小程序交易查询
   */
  async queryTradeAppEx(request: QueryTradeAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTradeAppResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTradeAppResponse>(await this.doRequest("1.0", "antdigital.agorax.trade.app.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTradeAppResponse({}));
  }

  /**
   * @remarks
   * Description: 关闭尚未支付的交易
   * Summary: 关闭尚未支付的交易
   */
  async closeTradeApp(request: CloseTradeAppRequest): Promise<CloseTradeAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.closeTradeAppEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 关闭尚未支付的交易
   * Summary: 关闭尚未支付的交易
   */
  async closeTradeAppEx(request: CloseTradeAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CloseTradeAppResponse> {
    Util.validateModel(request);
    return $tea.cast<CloseTradeAppResponse>(await this.doRequest("1.0", "antdigital.agorax.trade.app.close", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CloseTradeAppResponse({}));
  }

  /**
   * @remarks
   * Description: 小程序用户登录
   * Summary: 小程序用户登录
   */
  async execLoginApp(request: ExecLoginAppRequest): Promise<ExecLoginAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execLoginAppEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 小程序用户登录
   * Summary: 小程序用户登录
   */
  async execLoginAppEx(request: ExecLoginAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecLoginAppResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecLoginAppResponse>(await this.doRequest("1.0", "antdigital.agorax.login.app.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecLoginAppResponse({}));
  }

  /**
   * @remarks
   * Description: 发券前咨询用户是否可以领券
   * Summary: 发券前咨询用户是否可以领券
   */
  async execPromotionConsult(request: ExecPromotionConsultRequest): Promise<ExecPromotionConsultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execPromotionConsultEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 发券前咨询用户是否可以领券
   * Summary: 发券前咨询用户是否可以领券
   */
  async execPromotionConsultEx(request: ExecPromotionConsultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecPromotionConsultResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecPromotionConsultResponse>(await this.doRequest("1.0", "antdigital.agorax.promotion.consult.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecPromotionConsultResponse({}));
  }

  /**
   * @remarks
   * Description: 查询用户权益档位
   * Summary: 查询用户权益档位
   */
  async queryBenefitApp(request: QueryBenefitAppRequest): Promise<QueryBenefitAppResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBenefitAppEx(request, headers, runtime);
  }

  /**
   * @remarks
   * Description: 查询用户权益档位
   * Summary: 查询用户权益档位
   */
  async queryBenefitAppEx(request: QueryBenefitAppRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBenefitAppResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBenefitAppResponse>(await this.doRequest("1.0", "antdigital.agorax.benefit.app.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBenefitAppResponse({}));
  }

}
