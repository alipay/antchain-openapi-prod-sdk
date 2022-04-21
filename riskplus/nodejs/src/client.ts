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

// 企业风险等级分布统计
export class RtopLevelDistribution extends $tea.Model {
  // 统计值
  count: number;
  // 等级
  level: string;
  static names(): { [key: string]: string } {
    return {
      count: 'count',
      level: 'level',
    };
  }

  static types(): { [key: string]: any } {
    return {
      count: 'number',
      level: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 删除参数
export class OutParams extends $tea.Model {
  // 输出参数
  name: string;
  // 参数描述
  desc: string;
  // 参数值
  value: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      desc: 'desc',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      desc: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// infocode
export class InfoCodes extends $tea.Model {
  // infocode
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

// 天枢系统Contact结构体
export class Contact extends $tea.Model {
  // 联系人类型
  // 1配偶
  // 2父母
  // 3子女
  // 4兄弟
  // 5姐妹
  // 6朋友
  // 7其他
  kind: string;
  // 联系人姓名
  name: string;
  // 联系人手机号
  mobile: string;
  static names(): { [key: string]: string } {
    return {
      kind: 'kind',
      name: 'name',
      mobile: 'mobile',
    };
  }

  static types(): { [key: string]: any } {
    return {
      kind: 'string',
      name: 'string',
      mobile: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 涉众风险企业特征
export class RtopCrowdRiskFeatureTag extends $tea.Model {
  // 标签描述
  tagExplanation: string;
  // 标签名称
  tagName: string;
  static names(): { [key: string]: string } {
    return {
      tagExplanation: 'tag_explanation',
      tagName: 'tag_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tagExplanation: 'string',
      tagName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 反欺诈风险数据服务风险规则详情
export class RiskDetail extends $tea.Model {
  // 反欺诈风险数据服务命中规则风险权重
  ruleWeight: string;
  // 反欺诈风险数据服务命中规则名称
  ruleName: string;
  static names(): { [key: string]: string } {
    return {
      ruleWeight: 'rule_weight',
      ruleName: 'rule_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ruleWeight: 'string',
      ruleName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 决策流
export class DecisionFlow extends $tea.Model {
  // 输出参数
  decisionFlow?: OutParams;
  // 决策结果
  decision: string;
  // infocodes
  infoCodes?: InfoCodes;
  static names(): { [key: string]: string } {
    return {
      decisionFlow: 'decision_flow',
      decision: 'decision',
      infoCodes: 'info_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      decisionFlow: OutParams,
      decision: 'string',
      infoCodes: InfoCodes,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 营销盾批量查询单条结果
export class BaseCustomerUmktInfoModel extends $tea.Model {
  // 用户凭证
  customerKey?: string;
  // 输入模板
  queryTemplate?: string;
  // 实时营销结果
  umktResult?: number;
  static names(): { [key: string]: string } {
    return {
      customerKey: 'customer_key',
      queryTemplate: 'query_template',
      umktResult: 'umkt_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      customerKey: 'string',
      queryTemplate: 'string',
      umktResult: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业类型分布统计
export class RtopTypeDistribution extends $tea.Model {
  // 统计值
  count: number;
  // 当前类型下的等级分布
  levelDistribution: RtopLevelDistribution[];
  // 类型
  type: string;
  static names(): { [key: string]: string } {
    return {
      count: 'count',
      levelDistribution: 'levelDistribution',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      count: 'number',
      levelDistribution: { 'type': 'array', 'itemType': RtopLevelDistribution },
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 监管风险标签
export class RtopRiskTag extends $tea.Model {
  // 标签ID
  tagId: string;
  // 标签名称
  tagName: string;
  // 标签类型
  tagType?: string;
  // 标签文本
  tagText?: string;
  // 线索概览
  tagClue?: string;
  // 线索明细类型
  clueDetailType?: string;
  // 线索明细
  tagClueDetail?: string;
  static names(): { [key: string]: string } {
    return {
      tagId: 'tag_id',
      tagName: 'tag_name',
      tagType: 'tag_type',
      tagText: 'tag_text',
      tagClue: 'tag_clue',
      clueDetailType: 'clue_detail_type',
      tagClueDetail: 'tag_clue_detail',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tagId: 'string',
      tagName: 'string',
      tagType: 'string',
      tagText: 'string',
      tagClue: 'string',
      clueDetailType: 'string',
      tagClueDetail: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢系统专用ReceiptInfo结构体
export class ReceiptInfo extends $tea.Model {
  // 客户名
  customName: string;
  // 证件号码
  cardNo: string;
  // 手机号
  mobile: string;
  // 贷款金额
  applyAmount: number;
  // 发放金额
  loanAmount: number;
  // 期数
  period: number;
  // 当前期数
  curPeriod: number;
  // 还款方式1：等额本息，2：等额本金，3：按月付息到期还本，4：利随本清，5：自由还款
  repayType: string;
  // 还款日
  repayDate: string;
  // 放款时间
  loanTime: string;
  // 借据状态0：未还清，1：已还清，2：已提前还清
  status: string;
  // 已还本金
  alreadyCorpus: number;
  // 已还利息
  alreadyAccrual: number;
  // 结清日期
  alreadyDate: string;
  // 审批状态0：通过 1：拒绝 2：审批中 3：失败
  workflowStatus: string;
  // 借据编号
  receiptNo: string;
  static names(): { [key: string]: string } {
    return {
      customName: 'custom_name',
      cardNo: 'card_no',
      mobile: 'mobile',
      applyAmount: 'apply_amount',
      loanAmount: 'loan_amount',
      period: 'period',
      curPeriod: 'cur_period',
      repayType: 'repay_type',
      repayDate: 'repay_date',
      loanTime: 'loan_time',
      status: 'status',
      alreadyCorpus: 'already_corpus',
      alreadyAccrual: 'already_accrual',
      alreadyDate: 'already_date',
      workflowStatus: 'workflow_status',
      receiptNo: 'receipt_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      customName: 'string',
      cardNo: 'string',
      mobile: 'string',
      applyAmount: 'number',
      loanAmount: 'number',
      period: 'number',
      curPeriod: 'number',
      repayType: 'string',
      repayDate: 'string',
      loanTime: 'string',
      status: 'string',
      alreadyCorpus: 'number',
      alreadyAccrual: 'number',
      alreadyDate: 'string',
      workflowStatus: 'string',
      receiptNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢系统专用RepayRef结构体
export class RepayRef extends $tea.Model {
  // 客户编码
  customNo: string;
  // 当前期数
  period: string;
  // 应还总额
  needAmount: number;
  // 应还本金
  transPrincipal: number;
  // 应还利息
  needAccrual: number;
  // 应还手续费
  needFee: number;
  // 已还总额
  alreadyAmount: number;
  // 已还本金
  alreadyCorpus: number;
  // 已还逾期本金
  alreadyOvercorpus: number;
  // 已还利息
  alreadyAccrual: number;
  // 已还逾期息
  alreadyPunish: number;
  // 已还手续费
  alreadyFee: number;
  // 利率
  rate: number;
  // 罚息率
  penaltyValue: number;
  // 当期剩余总额
  restAmount: number;
  // 当期剩余本金
  restCorpus: number;
  // 当期剩余利息
  restAccrual: number;
  // 当期剩余罚息
  restPunish: number;
  // 期末本金
  remainCorpus: number;
  // 借据编号
  receiptNo: string;
  // 还款状态1：已还清 2 未还 3 部分还款
  status: string;
  // 应还日期
  settleDate: string;
  // 还款日期
  tradeDate: string;
  static names(): { [key: string]: string } {
    return {
      customNo: 'custom_no',
      period: 'period',
      needAmount: 'need_amount',
      transPrincipal: 'trans_principal',
      needAccrual: 'need_accrual',
      needFee: 'need_fee',
      alreadyAmount: 'already_amount',
      alreadyCorpus: 'already_corpus',
      alreadyOvercorpus: 'already_overcorpus',
      alreadyAccrual: 'already_accrual',
      alreadyPunish: 'already_punish',
      alreadyFee: 'already_fee',
      rate: 'rate',
      penaltyValue: 'penalty_value',
      restAmount: 'rest_amount',
      restCorpus: 'rest_corpus',
      restAccrual: 'rest_accrual',
      restPunish: 'rest_punish',
      remainCorpus: 'remain_corpus',
      receiptNo: 'receipt_no',
      status: 'status',
      settleDate: 'settle_date',
      tradeDate: 'trade_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      customNo: 'string',
      period: 'string',
      needAmount: 'number',
      transPrincipal: 'number',
      needAccrual: 'number',
      needFee: 'number',
      alreadyAmount: 'number',
      alreadyCorpus: 'number',
      alreadyOvercorpus: 'number',
      alreadyAccrual: 'number',
      alreadyPunish: 'number',
      alreadyFee: 'number',
      rate: 'number',
      penaltyValue: 'number',
      restAmount: 'number',
      restCorpus: 'number',
      restAccrual: 'number',
      restPunish: 'number',
      remainCorpus: 'number',
      receiptNo: 'string',
      status: 'string',
      settleDate: 'string',
      tradeDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 反欺诈风险数据服务规则细节信息
export class RuleDetail extends $tea.Model {
  // 规则细节名称
  name: string;
  // 规则细节值
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

// 安全场景参数
export class SecurityScene extends $tea.Model {
  // 接入渠道
  accessChannel?: string;
  // 事件信息
  ctuParams?: string;
  // 产品名称
  productName?: string;
  // 产品节点
  productNode?: string;
  // 扩展参数
  securitySceneParams?: string;
  // 系统名称
  systemName?: string;
  // 总金额
  totalFee?: string;
  static names(): { [key: string]: string } {
    return {
      accessChannel: 'access_channel',
      ctuParams: 'ctu_params',
      productName: 'product_name',
      productNode: 'product_node',
      securitySceneParams: 'security_scene_params',
      systemName: 'system_name',
      totalFee: 'total_fee',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accessChannel: 'string',
      ctuParams: 'string',
      productName: 'string',
      productNode: 'string',
      securitySceneParams: 'string',
      systemName: 'string',
      totalFee: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 收藏的企业信息
export class RtopStarCompanyInfo extends $tea.Model {
  // 行业
  categories?: string[];
  // 经营地址
  operatingPlace?: string;
  // 经营省份
  operatingProvince?: string;
  // 企业名称
  orgName?: string;
  // 风险分数
  riskScore?: number;
  // 风险标签
  riskTags?: string[];
  // 风险线索
  riskTagDetails?: RtopRiskTag[];
  // 风险标签Id集合
  riskTagIds?: string[];
  // 统一社会信用代码
  ucCode?: string;
  static names(): { [key: string]: string } {
    return {
      categories: 'categories',
      operatingPlace: 'operating_place',
      operatingProvince: 'operating_province',
      orgName: 'org_name',
      riskScore: 'risk_score',
      riskTags: 'risk_tags',
      riskTagDetails: 'risk_tag_details',
      riskTagIds: 'risk_tag_ids',
      ucCode: 'uc_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      categories: { 'type': 'array', 'itemType': 'string' },
      operatingPlace: 'string',
      operatingProvince: 'string',
      orgName: 'string',
      riskScore: 'number',
      riskTags: { 'type': 'array', 'itemType': 'string' },
      riskTagDetails: { 'type': 'array', 'itemType': RtopRiskTag },
      riskTagIds: { 'type': 'array', 'itemType': 'string' },
      ucCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业日期趋势统计
export class RtopDateDistribution extends $tea.Model {
  // 统计值
  count: number;
  // 年龄
  date: string;
  static names(): { [key: string]: string } {
    return {
      count: 'count',
      date: 'date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      count: 'number',
      date: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢系统个人信息结构体
export class PersonalInfo extends $tea.Model {
  // 客户姓名
  customName: string;
  // 身份证号码(18位)
  cardNo: string;
  // 1-身份证
  idType: string;
  // 证件开始日期(格式：YYYY-MM-DD)
  // 
  certSignDate: string;
  // 格式：YYYY-MM-DD，身份证有效期为长期的送: 9999-12-31
  certValidate: string;
  // 证件地址
  certAdr: string;
  // 手机号
  mobile: string;
  // 学历
  education: string;
  // 所在省份 汉字
  province?: string;
  // 所在城市 汉字
  city?: string;
  // 地区名称 汉字
  area?: string;
  // 详细地址
  address?: string;
  // 性别M-男
  // F-女
  sex?: string;
  // 民族
  nation?: string;
  static names(): { [key: string]: string } {
    return {
      customName: 'custom_name',
      cardNo: 'card_no',
      idType: 'id_type',
      certSignDate: 'cert_sign_date',
      certValidate: 'cert_validate',
      certAdr: 'cert_adr',
      mobile: 'mobile',
      education: 'education',
      province: 'province',
      city: 'city',
      area: 'area',
      address: 'address',
      sex: 'sex',
      nation: 'nation',
    };
  }

  static types(): { [key: string]: any } {
    return {
      customName: 'string',
      cardNo: 'string',
      idType: 'string',
      certSignDate: 'string',
      certValidate: 'string',
      certAdr: 'string',
      mobile: 'string',
      education: 'string',
      province: 'string',
      city: 'string',
      area: 'string',
      address: 'string',
      sex: 'string',
      nation: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 策略流信息
export class DfSceneInfos extends $tea.Model {
  // scene_code
  sceneCode: string;
  // 拒绝
  sceneDecision: string;
  // decision_flow
  decisionFlow: DecisionFlow;
  static names(): { [key: string]: string } {
    return {
      sceneCode: 'scene_code',
      sceneDecision: 'scene_decision',
      decisionFlow: 'decision_flow',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sceneCode: 'string',
      sceneDecision: 'string',
      decisionFlow: DecisionFlow,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 反欺诈风险数据服务风险信息
export class RiskInfo extends $tea.Model {
  // 反欺诈风险数据服务风险组描述
  riskGroupDesc: string;
  // 反欺诈风险数据服务风险组名
  riskGroup: string;
  // 反欺诈风险数据服务风险组类别
  riskGroupCategory: string;
  // 反欺诈风险数据服务风险组信息
  riskDetails: RiskDetail[];
  static names(): { [key: string]: string } {
    return {
      riskGroupDesc: 'risk_group_desc',
      riskGroup: 'risk_group',
      riskGroupCategory: 'risk_group_category',
      riskDetails: 'risk_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      riskGroupDesc: 'string',
      riskGroup: 'string',
      riskGroupCategory: 'string',
      riskDetails: { 'type': 'array', 'itemType': RiskDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 风险维度
export class RtopCompanyRiskFactor extends $tea.Model {
  // 维度名称
  name?: string;
  // 维度分数
  score?: number;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      score: 'score',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      score: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢系统专用Material结构体
export class Material extends $tea.Model {
  // 资料类型0-风控报告1-合同2-图片3-附件
  mType: string;
  // 大类编码00-风控报告10-合同20身份证图片26人脸图片30-附件
  bigCode: string;
  // 小类编码
  // 201-身份证人脸面202身份证国徽面212-活体人脸图片
  smallCode: string;
  // 资料名称
  meterialName: string;
  // 文件地址
  filePath: string;
  static names(): { [key: string]: string } {
    return {
      mType: 'm_type',
      bigCode: 'big_code',
      smallCode: 'small_code',
      meterialName: 'meterial_name',
      filePath: 'file_path',
    };
  }

  static types(): { [key: string]: any } {
    return {
      mType: 'string',
      bigCode: 'string',
      smallCode: 'string',
      meterialName: 'string',
      filePath: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢系统RiskData结构体
export class RiskData extends $tea.Model {
  // 联系人信息列表
  contacts: Contact[];
  // 人脸对比分
  facePoint?: string;
  // 活体供应商
  faceSource?: string;
  static names(): { [key: string]: string } {
    return {
      contacts: 'contacts',
      facePoint: 'face_point',
      faceSource: 'face_source',
    };
  }

  static types(): { [key: string]: any } {
    return {
      contacts: { 'type': 'array', 'itemType': Contact },
      facePoint: 'string',
      faceSource: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 安全数据服务请求参数
export class SecurityDataQueryStruct extends $tea.Model {
  // 请求数据参数
  params: string;
  // 请求数据类型
  type: string;
  // 请求数据版本
  version: string;
  static names(): { [key: string]: string } {
    return {
      params: 'params',
      type: 'type',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      params: 'string',
      type: 'string',
      version: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 标签信息
export class RiskLabelInfo extends $tea.Model {
  // 线索明细类型(字段停用)
  clueDetailType: string;
  // odps数据产出时间，冗余字段，业务上不需要，以备错误排查
  dt?: string;
  // 数据产生时间
  gmtCreate: string;
  // 记录唯一ID
  id: number;
  // 0-正常 1-删除
  isDeleted: number;
  // 企业ID
  mctOneId: string;
  // 操作人ID
  operatorId: string;
  // 操作类型
  // add、delete、update
  opType: string;
  // 企业名称
  orgName: string;
  // 线索类型
  riskDetailType: string;
  // 风险维度
  // 
  riskDimensionType: string;
  // 线索概览
  tagClue: string;
  // 线索明细
  tagClueDetail: string;
  // 标签ID
  tagId: string;
  // 线索列表表头，英文逗号分隔
  // 
  tagListHeaders: string;
  // 标签列表，排序字段
  tagListOrderColumn: string;
  // 标签列表排序方式
  tagListOrderType: string;
  // 标签文本
  tagText: string;
  // 趋势图表名
  tagTrendChartName: string;
  // 数据同步到公有云时间(业务上赋值当天)
  updateDate: string;
  static names(): { [key: string]: string } {
    return {
      clueDetailType: 'clue_detail_type',
      dt: 'dt',
      gmtCreate: 'gmt_create',
      id: 'id',
      isDeleted: 'is_deleted',
      mctOneId: 'mct_one_id',
      operatorId: 'operator_id',
      opType: 'op_type',
      orgName: 'org_name',
      riskDetailType: 'risk_detail_type',
      riskDimensionType: 'risk_dimension_type',
      tagClue: 'tag_clue',
      tagClueDetail: 'tag_clue_detail',
      tagId: 'tag_id',
      tagListHeaders: 'tag_list_headers',
      tagListOrderColumn: 'tag_list_order_column',
      tagListOrderType: 'tag_list_order_type',
      tagText: 'tag_text',
      tagTrendChartName: 'tag_trend_chart_name',
      updateDate: 'update_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      clueDetailType: 'string',
      dt: 'string',
      gmtCreate: 'string',
      id: 'number',
      isDeleted: 'number',
      mctOneId: 'string',
      operatorId: 'string',
      opType: 'string',
      orgName: 'string',
      riskDetailType: 'string',
      riskDimensionType: 'string',
      tagClue: 'string',
      tagClueDetail: 'string',
      tagId: 'string',
      tagListHeaders: 'string',
      tagListOrderColumn: 'string',
      tagListOrderType: 'string',
      tagText: 'string',
      tagTrendChartName: 'string',
      updateDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业反馈
export class RtopCompanyFeedback extends $tea.Model {
  // 主键
  id: number;
  // 企业ID
  companyId: string;
  // 反馈原因
  feedbackReason: string;
  // 反馈原因详情
  feedbackReasonDetail: string;
  // 评论
  comment: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      companyId: 'company_id',
      feedbackReason: 'feedback_reason',
      feedbackReasonDetail: 'feedback_reason_detail',
      comment: 'comment',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      companyId: 'string',
      feedbackReason: 'string',
      feedbackReasonDetail: 'string',
      comment: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 监测企业的特征信息
export class RtopMonitorCompanyFeature extends $tea.Model {
  // 特征的描述
  description?: string;
  // 特征的名称
  name: string;
  // 特征里的风险标签列表
  riskTags?: string[];
  // 特征的评分
  score: number;
  static names(): { [key: string]: string } {
    return {
      description: 'description',
      name: 'name',
      riskTags: 'risk_tags',
      score: 'score',
    };
  }

  static types(): { [key: string]: any } {
    return {
      description: 'string',
      name: 'string',
      riskTags: { 'type': 'array', 'itemType': 'string' },
      score: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 风报接口返回结构体
export class RtopCompanyRiskInfo extends $tea.Model {
  // 区域类型
  placeType?: string;
  // 区域
  placeName?: string;
  // 企业唯一id
  mctOneId?: string;
  // 企业统一社会信用代码
  ucCode?: string;
  // 工商注册号
  regNo?: string;
  // 组织机构代码
  orgCode?: string;
  // 企业名
  orgName?: string;
  // 风险评分
  riskScore?: string;
  // 风险变化程度排序，根据分值波动大小，标签变更次数排序
  riskShiftRank?: string;
  // 风险定性
  riskType?: string;
  // 风险标签id列表
  riskTagsId?: string[];
  // 线索
  tagsClue?: string;
  // 风险线索明细
  tagsClueDetail?: string;
  static names(): { [key: string]: string } {
    return {
      placeType: 'place_type',
      placeName: 'place_name',
      mctOneId: 'mct_one_id',
      ucCode: 'uc_code',
      regNo: 'reg_no',
      orgCode: 'org_code',
      orgName: 'org_name',
      riskScore: 'risk_score',
      riskShiftRank: 'risk_shift_rank',
      riskType: 'risk_type',
      riskTagsId: 'risk_tags_id',
      tagsClue: 'tags_clue',
      tagsClueDetail: 'tags_clue_detail',
    };
  }

  static types(): { [key: string]: any } {
    return {
      placeType: 'string',
      placeName: 'string',
      mctOneId: 'string',
      ucCode: 'string',
      regNo: 'string',
      orgCode: 'string',
      orgName: 'string',
      riskScore: 'string',
      riskShiftRank: 'string',
      riskType: 'string',
      riskTagsId: { 'type': 'array', 'itemType': 'string' },
      tagsClue: 'string',
      tagsClueDetail: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 逾期信息查询响应
export class OverdueInfoResponse extends $tea.Model {
  // 逾期标识
  // true：逾期
  // false：未逾期
  overDueFlag: boolean;
  // 逾期天数
  overDays: number;
  // 逾期金额在50元以上的客户的逾期天数
  valuableOverDays: number;
  // 逾期期数
  overPeriodCount: number;
  // 逾期本金
  overPrincipal: number;
  // 逾期利息
  overInterest: number;
  // 应还罚息
  overPunish: number;
  // 应还逾期总额
  needOverdueAmount: number;
  // 当前应还总额
  currentNeedAmount: number;
  // 总剩余应还
  totalAmount: number;
  static names(): { [key: string]: string } {
    return {
      overDueFlag: 'over_due_flag',
      overDays: 'over_days',
      valuableOverDays: 'valuable_over_days',
      overPeriodCount: 'over_period_count',
      overPrincipal: 'over_principal',
      overInterest: 'over_interest',
      overPunish: 'over_punish',
      needOverdueAmount: 'need_overdue_amount',
      currentNeedAmount: 'current_need_amount',
      totalAmount: 'total_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      overDueFlag: 'boolean',
      overDays: 'number',
      valuableOverDays: 'number',
      overPeriodCount: 'number',
      overPrincipal: 'number',
      overInterest: 'number',
      overPunish: 'number',
      needOverdueAmount: 'number',
      currentNeedAmount: 'number',
      totalAmount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业年报信息
export class RtopRiskStormCompanyAnnualReport extends $tea.Model {
  // 年报个数
  annualReportCount?: number;
  // 年报是否发生股权转让
  annualReportHasEquityTransfer?: boolean;
  // 年报是否对外提供担保
  annualReportHasExternalGuarantee?: boolean;
  // 年报是否对外投资
  annualReportHasExternalInvest?: boolean;
  // 营业总收入中主营业务收入
  annualReportMainBusinessIncome?: string;
  // 年报净利润
  annualReportNetProfit?: string;
  // 年报发布日期
  annualReportReleaseDate?: string;
  // 年报股东实缴出资额（万元（实缴出资额用两个冒号::分割）
  annualReportShActualPaid?: string;
  // 年报公司人数
  annualReportStaffCount?: number;
  // 资产总额
  annualReportTotalAssets?: string;
  // 负债总额
  annualReportTotalLiabilities?: string;
  // 营业总收入
  annualReportTotalOperatingIncome?: string;
  // 年报所有者权益合计
  annualReportTotalOwnerEquity?: string;
  // 年报利润总额
  annualReportTotalProfit?: string;
  // 纳税总额
  annualReportTotalTax?: string;
  // 年报报送年度
  annualReportYear?: string;
  static names(): { [key: string]: string } {
    return {
      annualReportCount: 'annual_report_count',
      annualReportHasEquityTransfer: 'annual_report_has_equity_transfer',
      annualReportHasExternalGuarantee: 'annual_report_has_external_guarantee',
      annualReportHasExternalInvest: 'annual_report_has_external_invest',
      annualReportMainBusinessIncome: 'annual_report_main_business_income',
      annualReportNetProfit: 'annual_report_net_profit',
      annualReportReleaseDate: 'annual_report_release_date',
      annualReportShActualPaid: 'annual_report_sh_actual_paid',
      annualReportStaffCount: 'annual_report_staff_count',
      annualReportTotalAssets: 'annual_report_total_assets',
      annualReportTotalLiabilities: 'annual_report_total_liabilities',
      annualReportTotalOperatingIncome: 'annual_report_total_operating_income',
      annualReportTotalOwnerEquity: 'annual_report_total_owner_equity',
      annualReportTotalProfit: 'annual_report_total_profit',
      annualReportTotalTax: 'annual_report_total_tax',
      annualReportYear: 'annual_report_year',
    };
  }

  static types(): { [key: string]: any } {
    return {
      annualReportCount: 'number',
      annualReportHasEquityTransfer: 'boolean',
      annualReportHasExternalGuarantee: 'boolean',
      annualReportHasExternalInvest: 'boolean',
      annualReportMainBusinessIncome: 'string',
      annualReportNetProfit: 'string',
      annualReportReleaseDate: 'string',
      annualReportShActualPaid: 'string',
      annualReportStaffCount: 'number',
      annualReportTotalAssets: 'string',
      annualReportTotalLiabilities: 'string',
      annualReportTotalOperatingIncome: 'string',
      annualReportTotalOwnerEquity: 'string',
      annualReportTotalProfit: 'string',
      annualReportTotalTax: 'string',
      annualReportYear: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 全局动态中的企业
export class RtopRiskyCompany extends $tea.Model {
  // 企业ID
  companyId: string;
  // 异动分数
  changeScore: string;
  // 异动程度
  changeLevel: string;
  // 新增企业的时间
  newAddedTime: string;
  // 总公司注册地
  headRegisterPlace: string;
  // 数据的时间
  dataTime: string;
  static names(): { [key: string]: string } {
    return {
      companyId: 'company_id',
      changeScore: 'change_score',
      changeLevel: 'change_level',
      newAddedTime: 'new_added_time',
      headRegisterPlace: 'head_register_place',
      dataTime: 'data_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      companyId: 'string',
      changeScore: 'string',
      changeLevel: 'string',
      newAddedTime: 'string',
      headRegisterPlace: 'string',
      dataTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// zhima.customer.ep.identification.query
// 在认证完成后,商户可以查询认证的状态和结果
// 
export class ZhimaQueryResp extends $tea.Model {
  // 认证的企业证件号
  epCertNo?: string;
  // 认证的企业名
  epName?: string;
  // 认证不通过的错误码
  failedCode?: string;
  // 认证是否通过，通过为true，不通过为false
  passed?: string;
  //  10000是成功，其余是失败
  resultCode: string;
  //  
  resultMsg: string;
  //  
  subCode?: string;
  //  
  subMsg?: string;
  static names(): { [key: string]: string } {
    return {
      epCertNo: 'ep_cert_no',
      epName: 'ep_name',
      failedCode: 'failed_code',
      passed: 'passed',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      epCertNo: 'string',
      epName: 'string',
      failedCode: 'string',
      passed: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      subCode: 'string',
      subMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 机构平台通知响应结果
export class DefinInnerChannelNotifyResult extends $tea.Model {
  // 请求编号
  requestId: string;
  // 业务响应Json
  bizResponse: string;
  static names(): { [key: string]: string } {
    return {
      requestId: 'request_id',
      bizResponse: 'biz_response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      requestId: 'string',
      bizResponse: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业涉众风险详细信息
export class RtopCrowdRiskSummaryResp extends $tea.Model {
  // 活跃市
  activeCity?: string;
  // 活跃县
  activeCounty?: string;
  // 活跃省
  activeProvince?: string;
  // 风险标签
  clueTags?: string[];
  // 企业ID
  companyId: string;
  // 企业名称
  companyName: string;
  // 风险等级
  crowdRiskLevel?: string;
  // 涉众风险分数
  crowdRiskScore?: number;
  // 涉众风险类型
  crowdRiskType?: string;
  // 发现时间
  detectedTime?: string;
  // 影响金额
  moneyInvolved?: number;
  // 影响人数
  peopleInvolved?: number;
  // 注册市
  registeredCity?: string;
  // 注册县
  registeredCounty?: string;
  // 注册省
  registeredProvince?: string;
  static names(): { [key: string]: string } {
    return {
      activeCity: 'active_city',
      activeCounty: 'active_county',
      activeProvince: 'active_province',
      clueTags: 'clue_tags',
      companyId: 'company_id',
      companyName: 'company_name',
      crowdRiskLevel: 'crowd_risk_level',
      crowdRiskScore: 'crowd_risk_score',
      crowdRiskType: 'crowd_risk_type',
      detectedTime: 'detected_time',
      moneyInvolved: 'money_involved',
      peopleInvolved: 'people_involved',
      registeredCity: 'registered_city',
      registeredCounty: 'registered_county',
      registeredProvince: 'registered_province',
    };
  }

  static types(): { [key: string]: any } {
    return {
      activeCity: 'string',
      activeCounty: 'string',
      activeProvince: 'string',
      clueTags: { 'type': 'array', 'itemType': 'string' },
      companyId: 'string',
      companyName: 'string',
      crowdRiskLevel: 'string',
      crowdRiskScore: 'number',
      crowdRiskType: 'string',
      detectedTime: 'string',
      moneyInvolved: 'number',
      peopleInvolved: 'number',
      registeredCity: 'string',
      registeredCounty: 'string',
      registeredProvince: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 标签配置全量信息
export class RiskLabelConfigInfo extends $tea.Model {
  // id
  id: number;
  // 线索ID
  tagId: string;
  // 标签文本
  tagText: string;
  // 风险维度
  riskDimensionType: string;
  // 线索类型
  riskDetailType: string;
  // 趋势图表名
  tagTrendChartName: string;
  // 线索列表表头，英文逗号分隔
  tagListHeaders: string;
  // 标签列表，排序字段
  tagListOrderColumn: string;
  // 标签列表排序方式
  tagListOrderType: string;
  // 标记删除
  isDelete: number;
  // 创建时间
  gmtCreate: string;
  // 修改时间
  gmtModified: string;
  // 操作人ID
  operatorId: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      tagId: 'tag_id',
      tagText: 'tag_text',
      riskDimensionType: 'risk_dimension_type',
      riskDetailType: 'risk_detail_type',
      tagTrendChartName: 'tag_trend_chart_name',
      tagListHeaders: 'tag_list_headers',
      tagListOrderColumn: 'tag_list_order_column',
      tagListOrderType: 'tag_list_order_type',
      isDelete: 'is_delete',
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      operatorId: 'operator_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      tagId: 'string',
      tagText: 'string',
      riskDimensionType: 'string',
      riskDetailType: 'string',
      tagTrendChartName: 'string',
      tagListHeaders: 'string',
      tagListOrderColumn: 'string',
      tagListOrderType: 'string',
      isDelete: 'number',
      gmtCreate: 'string',
      gmtModified: 'string',
      operatorId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 策略详情
export class StrategyDetails extends $tea.Model {
  // 策略id
  id: string;
  // 策略名称
  name: string;
  // 决策结果
  decision: string;
  // 场景码
  sceneCode: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      name: 'name',
      decision: 'decision',
      sceneCode: 'scene_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'string',
      name: 'string',
      decision: 'string',
      sceneCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 反欺诈风险数据服务决策结果
export class SecurityResultInfos extends $tea.Model {
  // 反欺诈风险数据服务风险建议决策
  decision: string;
  // 反欺诈风险数据服务风险分
  riskScore: number;
  // 反欺诈风险数据服务场景码
  sceneCode: string;
  static names(): { [key: string]: string } {
    return {
      decision: 'decision',
      riskScore: 'risk_score',
      sceneCode: 'scene_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      decision: 'string',
      riskScore: 'number',
      sceneCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业影响人数年龄分布统计
export class RtopAgeDistribution extends $tea.Model {
  // 年龄
  age: string;
  // 统计值
  count: number;
  static names(): { [key: string]: string } {
    return {
      age: 'age',
      count: 'count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      age: 'string',
      count: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业信息
export class CompanyInfo extends $tea.Model {
  // 活跃地json
  activeAddrJson: string;
  // 活跃市(字段停用)
  activeCity: string;
  // 活跃县(字段停用)
  activeCounty: string;
  // 活跃省(字段停用)
  activeProvince: string;
  // 类经融行业分类
  categories: string;
  // 核准日期
  checkDate: string;
  // 删除标志
  delFlag: string;
  // odps数据产生时间，业务上不关心
  dt: string;
  // 企业曾用名
  formerOrgNames: string;
  // {"mct_one_id":"ID1","org_name":"总公司名称1"}
  headOffice: string;
  // 记录ID
  id: number;
  // 影响金额
  involvedAmount: number;
  // 影响人数
  involvedPeople: number;
  // 重要关联企业,json格式
  keyRelaOrgs: string;
  // 法人
  legalRepresentative: string;
  // 企业ID
  mctOneId: string;
  // 经营地json
  operatingAddrJson: string;
  // 经营市(字段停用)
  operatingCity: string;
  // 经营县(字段停用)
  operatingCounty: string;
  // 经营地址(字段停用)
  operatingPlace: string;
  // 经营省(字段停用)
  operatingProvince: string;
  // 营运状态(1:营运0:不营运)
  oprtActvState: string;
  // 经营期限至
  oprtEndDate: string;
  // 经营范围
  oprtScope: string;
  // 经营期限自
  oprtStartDate: string;
  // 操作类型
  // 
  opType: string;
  // 组织机构代码
  orgCode: string;
  // 电子邮箱
  orgEmail: string;
  // 企业名
  orgName: string;
  // 注册资本折人民币(万元)
  orgRegCptlRmb: string;
  // 企业状态
  orgState: string;
  // 联系电话
  orgTel: string;
  // 企业类型
  orgType: string;
  // 平台名
  platformName: string;
  // 平台状态
  platformStates: string;
  // 注册资本币种
  registerCapitalCurrency: string;
  // 注册资本值
  registerCapitalValue: string;
  // 注册市
  registerCity: string;
  // 注册区县
  registerCounty: string;
  // 注册时间
  registerDate: string;
  // 注册地址
  registerPlace: string;
  // 注册省
  registerProvince: string;
  // 登记机关
  registrationAuthority: string;
  // 工商注册号
  regNo: string;
  // 风报企业ID
  riskstormCompanyId: string;
  // 风险维度
  riskFactors: string;
  // 风险图谱可视化数据
  riskGraphJson: string;
  // 风险报文
  riskMessage: string;
  // 风险指数
  riskScore: number;
  // 风险指数，按日的趋势图
  riskScoreTrend: string;
  // 风险指数周波动
  riskScoreWeeklyFloat: number;
  // 风险标签(字段停用)
  riskTags: string;
  // 风险标签ID
  riskTagsId: string;
  // 风险定性
  riskType: string;
  // 搜索内容
  searchContent: string;
  // 传播人次
  spreadNumber: number;
  // 影响地区人次分布,json格式如下
  spreadNumDistribution: string;
  // 社会统一信用代码
  ucCode: string;
  // 公有云数据库产生时间
  updateDate: string;
  // 平台json  
  platform: string;
  static names(): { [key: string]: string } {
    return {
      activeAddrJson: 'active_addr_json',
      activeCity: 'active_city',
      activeCounty: 'active_county',
      activeProvince: 'active_province',
      categories: 'categories',
      checkDate: 'check_date',
      delFlag: 'del_flag',
      dt: 'dt',
      formerOrgNames: 'former_org_names',
      headOffice: 'head_office',
      id: 'id',
      involvedAmount: 'involved_amount',
      involvedPeople: 'involved_people',
      keyRelaOrgs: 'key_rela_orgs',
      legalRepresentative: 'legal_representative',
      mctOneId: 'mct_one_id',
      operatingAddrJson: 'operating_addr_json',
      operatingCity: 'operating_city',
      operatingCounty: 'operating_county',
      operatingPlace: 'operating_place',
      operatingProvince: 'operating_province',
      oprtActvState: 'oprt_actv_state',
      oprtEndDate: 'oprt_end_date',
      oprtScope: 'oprt_scope',
      oprtStartDate: 'oprt_start_date',
      opType: 'op_type',
      orgCode: 'org_code',
      orgEmail: 'org_email',
      orgName: 'org_name',
      orgRegCptlRmb: 'org_reg_cptl_rmb',
      orgState: 'org_state',
      orgTel: 'org_tel',
      orgType: 'org_type',
      platformName: 'platform_name',
      platformStates: 'platform_states',
      registerCapitalCurrency: 'register_capital_currency',
      registerCapitalValue: 'register_capital_value',
      registerCity: 'register_city',
      registerCounty: 'register_county',
      registerDate: 'register_date',
      registerPlace: 'register_place',
      registerProvince: 'register_province',
      registrationAuthority: 'registration_authority',
      regNo: 'reg_no',
      riskstormCompanyId: 'riskstorm_company_id',
      riskFactors: 'risk_factors',
      riskGraphJson: 'risk_graph_json',
      riskMessage: 'risk_message',
      riskScore: 'risk_score',
      riskScoreTrend: 'risk_score_trend',
      riskScoreWeeklyFloat: 'risk_score_weekly_float',
      riskTags: 'risk_tags',
      riskTagsId: 'risk_tags_id',
      riskType: 'risk_type',
      searchContent: 'search_content',
      spreadNumber: 'spread_number',
      spreadNumDistribution: 'spread_num_distribution',
      ucCode: 'uc_code',
      updateDate: 'update_date',
      platform: 'platform',
    };
  }

  static types(): { [key: string]: any } {
    return {
      activeAddrJson: 'string',
      activeCity: 'string',
      activeCounty: 'string',
      activeProvince: 'string',
      categories: 'string',
      checkDate: 'string',
      delFlag: 'string',
      dt: 'string',
      formerOrgNames: 'string',
      headOffice: 'string',
      id: 'number',
      involvedAmount: 'number',
      involvedPeople: 'number',
      keyRelaOrgs: 'string',
      legalRepresentative: 'string',
      mctOneId: 'string',
      operatingAddrJson: 'string',
      operatingCity: 'string',
      operatingCounty: 'string',
      operatingPlace: 'string',
      operatingProvince: 'string',
      oprtActvState: 'string',
      oprtEndDate: 'string',
      oprtScope: 'string',
      oprtStartDate: 'string',
      opType: 'string',
      orgCode: 'string',
      orgEmail: 'string',
      orgName: 'string',
      orgRegCptlRmb: 'string',
      orgState: 'string',
      orgTel: 'string',
      orgType: 'string',
      platformName: 'string',
      platformStates: 'string',
      registerCapitalCurrency: 'string',
      registerCapitalValue: 'string',
      registerCity: 'string',
      registerCounty: 'string',
      registerDate: 'string',
      registerPlace: 'string',
      registerProvince: 'string',
      registrationAuthority: 'string',
      regNo: 'string',
      riskstormCompanyId: 'string',
      riskFactors: 'string',
      riskGraphJson: 'string',
      riskMessage: 'string',
      riskScore: 'number',
      riskScoreTrend: 'string',
      riskScoreWeeklyFloat: 'number',
      riskTags: 'string',
      riskTagsId: 'string',
      riskType: 'string',
      searchContent: 'string',
      spreadNumber: 'number',
      spreadNumDistribution: 'string',
      ucCode: 'string',
      updateDate: 'string',
      platform: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 营销盾事件信息同步详情
export class EventResultSyncDetail extends $tea.Model {
  // 事件唯一id（单个租户全局唯一）
  eventId: string;
  // 营销计划id
  planId: string;
  // 消息id
  msgId: string;
  // 事件时间
  eventTime: string;
  // 事件类型：1为富信贴尾
  eventType: number;
  // 1为成功 2为失败
  state: number;
  // 用户key类型
  keyType: string;
  // 手机号
  customerKey: string;
  // 扩展字段
  extData: string;
  static names(): { [key: string]: string } {
    return {
      eventId: 'event_id',
      planId: 'plan_id',
      msgId: 'msg_id',
      eventTime: 'event_time',
      eventType: 'event_type',
      state: 'state',
      keyType: 'key_type',
      customerKey: 'customer_key',
      extData: 'ext_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      eventId: 'string',
      planId: 'string',
      msgId: 'string',
      eventTime: 'string',
      eventType: 'number',
      state: 'number',
      keyType: 'string',
      customerKey: 'string',
      extData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 预警企业
export class RtopCompanyAlarm extends $tea.Model {
  // 企业ID
  companyId: string;
  // 预警类型
  alarmType: string;
  // 预警序号
  alarmIdx: string;
  // 预警日期
  alarmDate: string;
  // 预警标识，是否需要预警
  alarmFlag: string;
  static names(): { [key: string]: string } {
    return {
      companyId: 'company_id',
      alarmType: 'alarm_type',
      alarmIdx: 'alarm_idx',
      alarmDate: 'alarm_date',
      alarmFlag: 'alarm_flag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      companyId: 'string',
      alarmType: 'string',
      alarmIdx: 'string',
      alarmDate: 'string',
      alarmFlag: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 通用响应结构体
export class RpcommonResp extends $tea.Model {
  // 调用是否成功
  success: boolean;
  // 结果描述
  resultMsg: string;
  // 结果码
  responseCode: string;
  // 具体返回值.jsonString形式
  data: string;
  static names(): { [key: string]: string } {
    return {
      success: 'success',
      resultMsg: 'result_msg',
      responseCode: 'response_code',
      data: 'data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      success: 'boolean',
      resultMsg: 'string',
      responseCode: 'string',
      data: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 标签图片
export class RtopTagImage extends $tea.Model {
  // 标签图片表主键
  id: number;
  // 图片
  image?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      image: 'image',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      image: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业影响人数性别分布统计
export class RtopGenderDistribution extends $tea.Model {
  // 统计值
  count: number;
  // 性别
  gender: string;
  static names(): { [key: string]: string } {
    return {
      count: 'count',
      gender: 'gender',
    };
  }

  static types(): { [key: string]: any } {
    return {
      count: 'number',
      gender: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 风险基因-点
export class RtopRiskGeneNode extends $tea.Model {
  // 主企业唯一ID
  mainCompanyId?: string;
  // 主企业名称
  mainCompanyName?: string;
  // 节点唯一ID
  nodeId?: string;
  // 节点名称
  nodeName?: string;
  // 节点证件号码
  nodeCertNo?: string;
  // 节点类型，枚举值
  nodeType?: string;
  // 节点扩展信息
  nodeExtJson?: string;
  // 基因模式
  riskLabel?: string;
  // 基因模式
  riskMode?: string;
  static names(): { [key: string]: string } {
    return {
      mainCompanyId: 'main_company_id',
      mainCompanyName: 'main_company_name',
      nodeId: 'node_id',
      nodeName: 'node_name',
      nodeCertNo: 'node_cert_no',
      nodeType: 'node_type',
      nodeExtJson: 'node_ext_json',
      riskLabel: 'risk_label',
      riskMode: 'risk_mode',
    };
  }

  static types(): { [key: string]: any } {
    return {
      mainCompanyId: 'string',
      mainCompanyName: 'string',
      nodeId: 'string',
      nodeName: 'string',
      nodeCertNo: 'string',
      nodeType: 'string',
      nodeExtJson: 'string',
      riskLabel: 'string',
      riskMode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业影响人数分布统计
export class RtopPopulationDistribution extends $tea.Model {
  // 市
  city: string;
  // 统计值
  count: number;
  static names(): { [key: string]: string } {
    return {
      city: 'city',
      count: 'count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      city: 'string',
      count: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢文件信息统一结构体
export class DubheFileInfo extends $tea.Model {
  // 文件访问路径
  filePath: string;
  static names(): { [key: string]: string } {
    return {
      filePath: 'file_path',
    };
  }

  static types(): { [key: string]: any } {
    return {
      filePath: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 服务上下文包括环境信息和用户信息
export class ServiceContext extends $tea.Model {
  // 客户端IP
  clientIp?: string;
  // 客户端UMID
  clientPcidguid?: string;
  // 服务器名
  serverName?: string;
  // 会话ID
  sessionId?: string;
  // 用户ID
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      clientIp: 'client_ip',
      clientPcidguid: 'client_pcidguid',
      serverName: 'server_name',
      sessionId: 'session_id',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      clientIp: 'string',
      clientPcidguid: 'string',
      serverName: 'string',
      sessionId: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 营销盾实时圈客结果返回model
export class CustomerUmktInfoModel extends $tea.Model {
  // 基本圈客结果信息
  baseInfo: BaseCustomerUmktInfoModel;
  // 额外的营销分结果
  umktOutPutInfo?: string;
  static names(): { [key: string]: string } {
    return {
      baseInfo: 'base_info',
      umktOutPutInfo: 'umkt_out_put_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      baseInfo: BaseCustomerUmktInfoModel,
      umktOutPutInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 模型结果详情
// 
export class ModelDetails extends $tea.Model {
  // 风险场景编码
  sceneCode: string;
  // 该风险场景的风险分值
  // 
  score: string;
  static names(): { [key: string]: string } {
    return {
      sceneCode: 'scene_code',
      score: 'score',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sceneCode: 'string',
      score: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业舆情数量
export class RtopCompanyOpinionCount extends $tea.Model {
  // 企业名称
  companyName: string;
  // 企业对应的舆情数量
  count: number;
  static names(): { [key: string]: string } {
    return {
      companyName: 'company_name',
      count: 'count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      companyName: 'string',
      count: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 企业地区分布统计
export class RtopRegionalDistribution extends $tea.Model {
  // 统计值
  count: number;
  // 地区
  place: string;
  // 当前地区的涉众风险类型分布，即非法集资有多少企业，传销有多少企业
  typeDistribution?: RtopTypeDistribution[];
  static names(): { [key: string]: string } {
    return {
      count: 'count',
      place: 'place',
      typeDistribution: 'type_distribution',
    };
  }

  static types(): { [key: string]: any } {
    return {
      count: 'number',
      place: 'string',
      typeDistribution: { 'type': 'array', 'itemType': RtopTypeDistribution },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 标签过滤配置
export class RiskLabelFilterConfigInfo extends $tea.Model {
  // 创建时间
  gmtCreate: string;
  // 修改时间
  gmtModified: string;
  // id
  id: number;
  // 是否为基本筛选标签
  isBase: number;
  // 标记删除
  isDelete: number;
  // 操作人员ID
  operatorId: string;
  // 地区名
  placeName: string;
  // 地区类型
  placeType: string;
  // 标签ID
  tagId: string;
  static names(): { [key: string]: string } {
    return {
      gmtCreate: 'gmt_create',
      gmtModified: 'gmt_modified',
      id: 'id',
      isBase: 'is_base',
      isDelete: 'is_delete',
      operatorId: 'operator_id',
      placeName: 'place_name',
      placeType: 'place_type',
      tagId: 'tag_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      gmtCreate: 'string',
      gmtModified: 'string',
      id: 'number',
      isBase: 'number',
      isDelete: 'number',
      operatorId: 'string',
      placeName: 'string',
      placeType: 'string',
      tagId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢系统职业信息
export class JobInfo extends $tea.Model {
  // 职业
  jobType?: string;
  // 职务
  workPosition?: string;
  // 工作年限
  jobLife?: string;
  // 本单位工作年限
  currentJobLife?: number;
  // 公司名称
  companyName?: string;
  // 公司行业类型
  companyIndustryType?: string;
  // 公司电话
  companyTel?: string;
  // 公司省份
  companyProvince?: string;
  // 公司城市
  companyCity?: string;
  // 公司区域
  companyArea?: string;
  // 公司街道
  companyStreet?: string;
  // 公司详细地址
  companyAddress?: string;
  // 年收入
  yearSalary?: number;
  static names(): { [key: string]: string } {
    return {
      jobType: 'job_type',
      workPosition: 'work_position',
      jobLife: 'job_life',
      currentJobLife: 'current_job_life',
      companyName: 'company_name',
      companyIndustryType: 'company_industry_type',
      companyTel: 'company_tel',
      companyProvince: 'company_province',
      companyCity: 'company_city',
      companyArea: 'company_area',
      companyStreet: 'company_street',
      companyAddress: 'company_address',
      yearSalary: 'year_salary',
    };
  }

  static types(): { [key: string]: any } {
    return {
      jobType: 'string',
      workPosition: 'string',
      jobLife: 'string',
      currentJobLife: 'number',
      companyName: 'string',
      companyIndustryType: 'string',
      companyTel: 'string',
      companyProvince: 'string',
      companyCity: 'string',
      companyArea: 'string',
      companyStreet: 'string',
      companyAddress: 'string',
      yearSalary: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 涉众风险企业特征
export class RtopCrowdRiskFeatureResp extends $tea.Model {
  // 特征标签列表
  clueTags?: RtopCrowdRiskFeatureTag[];
  // 特征名称
  featureName: string;
  // 特征​分数
  score: number;
  static names(): { [key: string]: string } {
    return {
      clueTags: 'clue_tags',
      featureName: 'feature_name',
      score: 'score',
    };
  }

  static types(): { [key: string]: any } {
    return {
      clueTags: { 'type': 'array', 'itemType': RtopCrowdRiskFeatureTag },
      featureName: 'string',
      score: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢系统居住信息结构体
export class LiveInfo extends $tea.Model {
  // 居住省份
  liveProvince?: string;
  // 居住城市
  liveCity?: string;
  // 居住区域
  liveArea?: string;
  // 居住街道
  liveStreet?: string;
  // 居住详细地址
  liveAddress?: string;
  // 居住年限
  liveYears?: number;
  static names(): { [key: string]: string } {
    return {
      liveProvince: 'live_province',
      liveCity: 'live_city',
      liveArea: 'live_area',
      liveStreet: 'live_street',
      liveAddress: 'live_address',
      liveYears: 'live_years',
    };
  }

  static types(): { [key: string]: any } {
    return {
      liveProvince: 'string',
      liveCity: 'string',
      liveArea: 'string',
      liveStreet: 'string',
      liveAddress: 'string',
      liveYears: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 风报风险标签统计
export class RiskStormLabelResp extends $tea.Model {
  // 标签次数
  labelCount: number;
  // 标签id
  labelId: string;
  // 标签名称
  labelName: string;
  static names(): { [key: string]: string } {
    return {
      labelCount: 'label_count',
      labelId: 'label_id',
      labelName: 'label_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      labelCount: 'number',
      labelId: 'string',
      labelName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 待还款信息
export class RepayInfo extends $tea.Model {
  // true：逾期
  // false：未逾期
  overdueFlag: boolean;
  // 逾期天数
  overDays: number;
  // 逾期金额在50元以上的客户的逾期天数
  valuableOverDays: number;
  // 逾期期数
  overPeriodCount: number;
  // 逾期本金
  overPrincipal: number;
  // 逾期利息
  overInterest: number;
  // 应还罚息
  overPunish: number;
  // 应还逾期总额
  needOverdueAmount: number;
  // 当前应还总额（包含逾期和当前期）
  currentNeedAmount: number;
  // 总剩余应还
  totalAmount: number;
  static names(): { [key: string]: string } {
    return {
      overdueFlag: 'overdue_flag',
      overDays: 'over_days',
      valuableOverDays: 'valuable_over_days',
      overPeriodCount: 'over_period_count',
      overPrincipal: 'over_principal',
      overInterest: 'over_interest',
      overPunish: 'over_punish',
      needOverdueAmount: 'need_overdue_amount',
      currentNeedAmount: 'current_need_amount',
      totalAmount: 'total_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      overdueFlag: 'boolean',
      overDays: 'number',
      valuableOverDays: 'number',
      overPeriodCount: 'number',
      overPrincipal: 'number',
      overInterest: 'number',
      overPunish: 'number',
      needOverdueAmount: 'number',
      currentNeedAmount: 'number',
      totalAmount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 芝麻四要素认证接口
export class ZhimaIdentifyResp extends $tea.Model {
  // 唯一ID，接口正常的话有此字段
  bizNo?: string;
  // 带参数的回调地址，接口正常的话有此字段
  certifyUrl?: string;
  // 蚂蚁调用芝麻的错误码
  resultCode: string;
  // 蚂蚁调用芝麻的结果描述
  resultMsg: string;
  // 蚂蚁调用芝麻的错误码
  subCode?: string;
  // 蚂蚁调用芝麻信息
  subMsg?: string;
  static names(): { [key: string]: string } {
    return {
      bizNo: 'biz_no',
      certifyUrl: 'certify_url',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      subCode: 'sub_code',
      subMsg: 'sub_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizNo: 'string',
      certifyUrl: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      subCode: 'string',
      subMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 天枢系统专用CreditAmount结构体
export class CreditAmount extends $tea.Model {
  // 授信额度
  creditAmount: number;
  // 授信余额
  restAmount: number;
  // 发放日期
  payDate: string;
  // 到期日期
  expireDate: string;
  // 利率单位(1:年，2：月，3：日)
  rateUnit: string;
  // 执行利率,利率值，单位%
  // 年化5%，rateValue=5
  // 
  rateValue: number;
  // 还款方式1等额本息2等额本金3先息后本4一次性利随本清5只还本金6等本等息
  repayWay: string;
  // 状态0-正常 1-冻结 2-终止
  status: string;
  static names(): { [key: string]: string } {
    return {
      creditAmount: 'credit_amount',
      restAmount: 'rest_amount',
      payDate: 'pay_date',
      expireDate: 'expire_date',
      rateUnit: 'rate_unit',
      rateValue: 'rate_value',
      repayWay: 'repay_way',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      creditAmount: 'number',
      restAmount: 'number',
      payDate: 'string',
      expireDate: 'string',
      rateUnit: 'string',
      rateValue: 'number',
      repayWay: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 舆情的详情
export class RtopCompanyOpinionDetail extends $tea.Model {
  // 具体的舆情内容
  docContent: string;
  // 舆情的id
  docId: string;
  // 舆情的标题
  docTitle: string;
  // 舆情的url
  docUrl: string;
  // 情感得分
  emotionScore?: string;
  // 实体相关度得分
  entityRelevancyScore?: string;
  // 命中的关键词
  hitKeywords?: string;
  // 媒体影响力得分
  mediaInfluenceScore?: string;
  // 来源媒体
  mediaName: string;
  // 媒体传播得分
  mediaPropagationScore?: string;
  // 舆情的发布时间
  publishTime: string;
  // 相似文章数
  similarDocs?: number;
  static names(): { [key: string]: string } {
    return {
      docContent: 'doc_content',
      docId: 'doc_id',
      docTitle: 'doc_title',
      docUrl: 'doc_url',
      emotionScore: 'emotion_score',
      entityRelevancyScore: 'entity_relevancy_score',
      hitKeywords: 'hit_keywords',
      mediaInfluenceScore: 'media_influence_score',
      mediaName: 'media_name',
      mediaPropagationScore: 'media_propagation_score',
      publishTime: 'publish_time',
      similarDocs: 'similar_docs',
    };
  }

  static types(): { [key: string]: any } {
    return {
      docContent: 'string',
      docId: 'string',
      docTitle: 'string',
      docUrl: 'string',
      emotionScore: 'string',
      entityRelevancyScore: 'string',
      hitKeywords: 'string',
      mediaInfluenceScore: 'string',
      mediaName: 'string',
      mediaPropagationScore: 'string',
      publishTime: 'string',
      similarDocs: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 云通信短信发送结果
export class SmsReponse extends $tea.Model {
  // 发送回执ID
  bizId: string;
  // 请求状态码; OK表示成功, 其他表示失败
  code: string;
  // 是否调用接口成功的描述
  message: string;
  // 请求ID
  requestId: string;
  static names(): { [key: string]: string } {
    return {
      bizId: 'biz_id',
      code: 'code',
      message: 'message',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizId: 'string',
      code: 'string',
      message: 'string',
      requestId: 'string',
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

export class QuerySecurityPolicyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 风险类型：表示风险处理或风险咨询——process/advice
  riskType: string;
  securityScene: SecurityScene;
  serviceContext: ServiceContext;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      riskType: 'risk_type',
      securityScene: 'security_scene',
      serviceContext: 'service_context',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      riskType: 'string',
      securityScene: SecurityScene,
      serviceContext: ServiceContext,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySecurityPolicyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 风险咨询情况下返回的风险等级，风险处理不会返回该值
  level?: number;
  // 反馈成功之后的id
  securityId?: string;
  // 安全处理结果，枚举值为：reject[拒绝],validate[校验],accept[放过]
  securityResult?: string;
  // 是否成功
  success: string;
  // 有风险需要失败业务情况下的返回码
  templateCode?: string;
  // 有风险需要失败业务情况下的返回码描述
  templateDesc?: string;
  // native场景下的核身id
  verifyId?: string;
  // h5场景下的核身地址
  verifyUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      level: 'level',
      securityId: 'security_id',
      securityResult: 'security_result',
      success: 'success',
      templateCode: 'template_code',
      templateDesc: 'template_desc',
      verifyId: 'verify_id',
      verifyUrl: 'verify_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      level: 'number',
      securityId: 'string',
      securityResult: 'string',
      success: 'string',
      templateCode: 'string',
      templateDesc: 'string',
      verifyId: 'string',
      verifyUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendSecurityDataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 安全累计属性列表字段，安全属性列表
  securityContent: string;
  // 代码发送给安全核心的事件编码
  securitySign: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      securityContent: 'security_content',
      securitySign: 'security_sign',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      securityContent: 'string',
      securitySign: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendSecurityDataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success: string;
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
      success: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmSecurityPolicyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 二次确认参数，防止篡改
  confirmParams: string;
  // 代码发送给安全核心的事件编码
  securityId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      confirmParams: 'confirm_params',
      securityId: 'security_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      confirmParams: 'string',
      securityId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmSecurityPolicyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success: string;
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
      success: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckSecurityRdsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 输入大字段，具体见接入文档
  rdsContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      rdsContent: 'rds_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      rdsContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckSecurityRdsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  result: number;
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
      result: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySecurityDataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  reqInfo: SecurityDataQueryStruct[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      reqInfo: 'req_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      reqInfo: { 'type': 'array', 'itemType': SecurityDataQueryStruct },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySecurityDataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  success: string;
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
      success: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckSecurityDataRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 入参为Map转换后的String
  reqInfo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      reqInfo: 'req_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      reqInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckSecurityDataResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // code表示状态，message为提示，data为返回结果
  response?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      response: 'response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      response: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecSecurityRiskdataserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 风险数据服务请求事件属性详情
  eventInfo: string;
  // 反欺诈数据服务查询请求唯一凭证，为申请成功后得到，当请求类型是query时必填
  riskDataServiaceApplyId?: string;
  // 反欺诈风险数据服务请求类型（query or apply）
  riskDataServiceType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      eventInfo: 'event_info',
      riskDataServiaceApplyId: 'risk_data_serviace_apply_id',
      riskDataServiceType: 'risk_data_service_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      eventInfo: 'string',
      riskDataServiaceApplyId: 'string',
      riskDataServiceType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecSecurityRiskdataserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 反欺诈风险数据服务申请成功时返回的查询凭证（申请请求时存在）
  riskDataServiceApplyId?: string;
  // 反欺诈风险数据服务查询请求结果中风险详细信息字段（查询请求时存在）
  riskInfos?: RiskInfo[];
  // 请求响应业务唯一id
  securityId?: string;
  // 反欺诈风险数据服务查询成功时得到风险建议结果信息（查询请求时存在）
  securityResultInfos?: SecurityResultInfos;
  // 请求是否成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      riskDataServiceApplyId: 'risk_data_service_apply_id',
      riskInfos: 'risk_infos',
      securityId: 'security_id',
      securityResultInfos: 'security_result_infos',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      riskDataServiceApplyId: 'string',
      riskInfos: { 'type': 'array', 'itemType': RiskInfo },
      securityId: 'string',
      securityResultInfos: SecurityResultInfos,
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheTestRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 测试id字段
  testid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      testid: 'testid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      testid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheTestResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 测试返回体
  testResponseStr?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      testResponseStr: 'test_response_str',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      testResponseStr: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheRouterFundrouterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 身份证号(md5加密32位)
  cardNo: string;
  // 手机号（MD5加密，32位）
  mobile: string;
  // 客户姓名
  customName: string;
  // 合作方产品编号
  prodNo: string;
  // 渠道类型
  channelType?: string;
  // 客户类型
  customType?: string;
  // 导流平台
  trafficPlatform?: string;
  // 流量名称
  trafficSourceName?: string;
  // 广告位标志
  trafficAdId?: string;
  // 预留
  trafficMktId?: string;
  // 预留
  clickId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cardNo: 'card_no',
      mobile: 'mobile',
      customName: 'custom_name',
      prodNo: 'prod_no',
      channelType: 'channel_type',
      customType: 'custom_type',
      trafficPlatform: 'traffic_platform',
      trafficSourceName: 'traffic_source_name',
      trafficAdId: 'traffic_ad_id',
      trafficMktId: 'traffic_mkt_id',
      clickId: 'click_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cardNo: 'string',
      mobile: 'string',
      customName: 'string',
      prodNo: 'string',
      channelType: 'string',
      customType: 'string',
      trafficPlatform: 'string',
      trafficSourceName: 'string',
      trafficAdId: 'string',
      trafficMktId: 'string',
      clickId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheRouterFundrouterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 资金方代码
  fundCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      fundCode: 'fund_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      fundCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyDubheCreditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础信息
  personalInfo: PersonalInfo;
  // 资产方用户唯一标识
  openId: string;
  // 订单号
  orderNo: string;
  // 居住信息
  borrowerLiveInfo?: LiveInfo;
  // 工作信息
  borrowerEmpInfo?: JobInfo;
  // 产品编号
  prodNo: string;
  // 风险数据对象
  riskData?: RiskData;
  // 借款用途
  loanReason?: string;
  // 资料文件
  materials?: Material[];
  // 导流平台
  trafficPlatform?: string;
  // 流量名称
  trafficSourceName?: string;
  // 广告位标志
  trafficAdId?: string;
  // 预留
  trafficMktId?: string;
  // 预留
  clickId?: string;
  // 渠道类型
  channelType?: string;
  // 客户类型
  customType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      personalInfo: 'personal_info',
      openId: 'open_id',
      orderNo: 'order_no',
      borrowerLiveInfo: 'borrower_live_info',
      borrowerEmpInfo: 'borrower_emp_info',
      prodNo: 'prod_no',
      riskData: 'risk_data',
      loanReason: 'loan_reason',
      materials: 'materials',
      trafficPlatform: 'traffic_platform',
      trafficSourceName: 'traffic_source_name',
      trafficAdId: 'traffic_ad_id',
      trafficMktId: 'traffic_mkt_id',
      clickId: 'click_id',
      channelType: 'channel_type',
      customType: 'custom_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      personalInfo: PersonalInfo,
      openId: 'string',
      orderNo: 'string',
      borrowerLiveInfo: LiveInfo,
      borrowerEmpInfo: JobInfo,
      prodNo: 'string',
      riskData: RiskData,
      loanReason: 'string',
      materials: { 'type': 'array', 'itemType': Material },
      trafficPlatform: 'string',
      trafficSourceName: 'string',
      trafficAdId: 'string',
      trafficMktId: 'string',
      clickId: 'string',
      channelType: 'string',
      customType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyDubheCreditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户编号
  customNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      customNo: 'custom_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      customNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheCreditStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授信申请订单号
  originalOrderNo: string;
  // 订单号
  orderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      originalOrderNo: 'original_order_no',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      originalOrderNo: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheCreditStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授信状态（0-通过/1-不通过2-处理中）
  status?: string;
  // 拒绝原因
  msg?: string;
  // 授信额度
  creditAmt?: number;
  // 期数
  period?: number;
  // 还款方式
  repayType?: string;
  // 额度信息
  creditInfo?: CreditAmount;
  // 客户编号(该客户的唯一标识，后续接口需要用到)
  customNo?: string;
  // 授信申请编号
  applyNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      msg: 'msg',
      creditAmt: 'credit_amt',
      period: 'period',
      repayType: 'repay_type',
      creditInfo: 'credit_info',
      customNo: 'custom_no',
      applyNo: 'apply_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      msg: 'string',
      creditAmt: 'number',
      period: 'number',
      repayType: 'string',
      creditInfo: CreditAmount,
      customNo: 'string',
      applyNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountDubheRepayReftrialRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderNo: string;
  // 授信申请订单号
  originalOrderNo: string;
  // 产品编号
  prodNo: string;
  // 借款金额
  applyAmount: number;
  // 借款期数
  applyPeriod: number;
  // 还款方式
  repayType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      originalOrderNo: 'original_order_no',
      prodNo: 'prod_no',
      applyAmount: 'apply_amount',
      applyPeriod: 'apply_period',
      repayType: 'repay_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      originalOrderNo: 'string',
      prodNo: 'string',
      applyAmount: 'number',
      applyPeriod: 'number',
      repayType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountDubheRepayReftrialResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 还款计划试算结果
  repayRefList?: RepayRef[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      repayRefList: 'repay_ref_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      repayRefList: { 'type': 'array', 'itemType': RepayRef },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheRepayListRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderNo: string;
  // 用信申请订单号
  originalOrderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      originalOrderNo: 'original_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      originalOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheRepayListResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 还款计划查询结果
  repayRefList?: RepayRef[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      repayRefList: 'repay_ref_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      repayRefList: { 'type': 'array', 'itemType': RepayRef },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyDubheUsecreditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授信申请订单号
  originalOrderNo: string;
  // 用信金额
  loanAmount: number;
  // 期数
  period: number;
  // 资产方用户唯一标识
  openId: string;
  // 订单号
  orderOn: string;
  // 还款方式
  repayType: string;
  // 1：手机数码 2：旅游 3：装修 4：教育 5：婚庆 6：租房 7：家具家居 8：健康医疗 9：其他消费 10：家用电器
  loanWay: string;
  // 1: APP
  // 2: 支付宝小程序
  // 3：微信小程序
  // 4：微信公众号
  // 5：PC网页
  // 默认1
  channelType: string;
  // 1: 新增客户
  // 2：存量激活客户
  // 3：目标营销客户
  // 默认1
  customType: string;
  // 指定还款日（仅无在贷借据时生效）
  repayDate: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      originalOrderNo: 'original_order_no',
      loanAmount: 'loan_amount',
      period: 'period',
      openId: 'open_id',
      orderOn: 'order_on',
      repayType: 'repay_type',
      loanWay: 'loan_way',
      channelType: 'channel_type',
      customType: 'custom_type',
      repayDate: 'repay_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      originalOrderNo: 'string',
      loanAmount: 'number',
      period: 'number',
      openId: 'string',
      orderOn: 'string',
      repayType: 'string',
      loanWay: 'string',
      channelType: 'string',
      customType: 'string',
      repayDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyDubheUsecreditResponse extends $tea.Model {
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

export class QueryDubheUsecreditStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用信申请订单号
  originalOrderNo: string;
  // 请求网络流水号
  orderOn: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      originalOrderNo: 'original_order_no',
      orderOn: 'order_on',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      originalOrderNo: 'string',
      orderOn: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheUsecreditStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用信状态（0-通过/1-不通过2-处理中）
  status?: string;
  // 拒绝原因
  msg?: string;
  // 借据信息
  receiptInfo?: ReceiptInfo;
  // 还款计划列表
  repayRef?: RepayRef[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      msg: 'msg',
      receiptInfo: 'receipt_info',
      repayRef: 'repay_ref',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      msg: 'string',
      receiptInfo: ReceiptInfo,
      repayRef: { 'type': 'array', 'itemType': RepayRef },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountDubheRepayTrialRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用信申请订单号
  originalOrderNo: string;
  // 还款类型1:当期结清，2：正常还款3：全部结清
  repayType: string;
  // 订单号
  orderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      originalOrderNo: 'original_order_no',
      repayType: 'repay_type',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      originalOrderNo: 'string',
      repayType: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountDubheRepayTrialResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 还款本金
  realPrincipal?: number;
  // 还款利息
  realInterest?: number;
  // 还款费用
  realOverAmt?: number;
  // 服务费
  serviceCharge?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      realPrincipal: 'real_principal',
      realInterest: 'real_interest',
      realOverAmt: 'real_over_amt',
      serviceCharge: 'service_charge',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      realPrincipal: 'number',
      realInterest: 'number',
      realOverAmt: 'number',
      serviceCharge: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RepayDubheRepayCheckstandRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用信申请订单号
  originalOrderNo: string;
  // 还款类型1:当期结清，2：正常还款3：全部结清
  repayType: string;
  // 订单号
  orderNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      originalOrderNo: 'original_order_no',
      repayType: 'repay_type',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      originalOrderNo: 'string',
      repayType: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RepayDubheRepayCheckstandResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 收银台地址(成功就有值)
  checkstandAddress?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      checkstandAddress: 'checkstand_address',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      checkstandAddress: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheRepayInfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 原还款订单号
  originalOrderNo: string;
  // 订单号
  orderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      originalOrderNo: 'original_order_no',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      originalOrderNo: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheRepayInfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 还款编号
  repayNo?: string;
  // 借据编码
  receiptNo?: string;
  // 客户编号
  customNo?: string;
  // 客户名称
  customName?: string;
  // 还款类型1:提前还款，2：正常还款 3:批量还款 4：自由还款
  repayType?: string;
  // 还款标志1 线下还款 2 用户主动还款 3 系统代扣
  repaySign?: string;
  // 还款日期
  repayDate?: string;
  // 实还总额
  repayAmount?: number;
  // 实还本金
  repayPrincipal?: number;
  // 实还利息
  repayInterest?: number;
  // 实还通道手续费
  channelAmt?: number;
  // 实还手续费
  repayFee?: string;
  // 实收罚息
  repayPunish?: number;
  // 还款账户
  repayAccount?: string;
  // 还款账户名称
  repayAccountName?: string;
  // 还款账户的手机号
  repayMobile?: string;
  // 还款账户银行行号
  repayBankNo?: string;
  // 还款账户银行名称
  repayBankName?: string;
  // 还款状态0:失败 1成功 2-审批中 3-还款中
  repayStatus?: string;
  // 失败原因
  failReason?: string;
  // 授信申请编号
  applyNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      repayNo: 'repay_no',
      receiptNo: 'receipt_no',
      customNo: 'custom_no',
      customName: 'custom_name',
      repayType: 'repay_type',
      repaySign: 'repay_sign',
      repayDate: 'repay_date',
      repayAmount: 'repay_amount',
      repayPrincipal: 'repay_principal',
      repayInterest: 'repay_interest',
      channelAmt: 'channel_amt',
      repayFee: 'repay_fee',
      repayPunish: 'repay_punish',
      repayAccount: 'repay_account',
      repayAccountName: 'repay_account_name',
      repayMobile: 'repay_mobile',
      repayBankNo: 'repay_bank_no',
      repayBankName: 'repay_bank_name',
      repayStatus: 'repay_status',
      failReason: 'fail_reason',
      applyNo: 'apply_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      repayNo: 'string',
      receiptNo: 'string',
      customNo: 'string',
      customName: 'string',
      repayType: 'string',
      repaySign: 'string',
      repayDate: 'string',
      repayAmount: 'number',
      repayPrincipal: 'number',
      repayInterest: 'number',
      channelAmt: 'number',
      repayFee: 'string',
      repayPunish: 'number',
      repayAccount: 'string',
      repayAccountName: 'string',
      repayMobile: 'string',
      repayBankNo: 'string',
      repayBankName: 'string',
      repayStatus: 'string',
      failReason: 'string',
      applyNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDubheCustomerInfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户姓名(可修改字段)
  customName?: string;
  // 户籍所在地(可修改字段)
  censusRegister?: string;
  // 证件号码(可修改字段)
  cardNo?: string;
  // 手机号码(可修改字段)
  mobile?: string;
  // 客户编号(唯一不变)
  customNo: string;
  // 订单号
  orderNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      customName: 'custom_name',
      censusRegister: 'census_register',
      cardNo: 'card_no',
      mobile: 'mobile',
      customNo: 'custom_no',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      customName: 'string',
      censusRegister: 'string',
      cardNo: 'string',
      mobile: 'string',
      customNo: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDubheCustomerInfoResponse extends $tea.Model {
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

export class ApplyDubheCustomerAgreementsignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户编号
  customNo: string;
  // 订单号
  orderNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      customNo: 'custom_no',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      customNo: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyDubheCustomerAgreementsignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // sdkParams返回给商户app客户端，作为客户端唤起sdk的入参
  sdkParams?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      sdkParams: 'sdk_params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      sdkParams: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheCustomerAgreementsignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户编号
  customNo: string;
  // 订单号
  orderNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      customNo: 'custom_no',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      customNo: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheCustomerAgreementsignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户编号
  customNo?: string;
  // 流水号(代扣协议中标示用户的唯一签约号)
  transSerials?: string;
  // 协议签约状态(0-成功1-失败2-处理中)
  status?: string;
  // 协议签约时间(支付宝代扣协议的实际签约时间，格式为yyyy-MM-dd HH:mm:ss)
  signTime?: string;
  // 协议生效时间(用户代扣协议的实际生效时间，格式为yyyy-MM-dd HH:mm:ss)
  validTime?: string;
  // 协议失效时间(用户代扣协议的失效时间，格式为yyyy-MM-dd HH:mm:ss)
  invalidTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      customNo: 'custom_no',
      transSerials: 'trans_serials',
      status: 'status',
      signTime: 'sign_time',
      validTime: 'valid_time',
      invalidTime: 'invalid_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      customNo: 'string',
      transSerials: 'string',
      status: 'string',
      signTime: 'string',
      validTime: 'string',
      invalidTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RepayDubheRepayWithholdRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // originalOrderNo
  originalOrderNo: string;
  // 还款类型1:当期结清，2：正常还款3：全部结清
  repayType: string;
  // 订单号
  orderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      originalOrderNo: 'original_order_no',
      repayType: 'repay_type',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      originalOrderNo: 'string',
      repayType: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RepayDubheRepayWithholdResponse extends $tea.Model {
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

export class QueryDubheSearchContractRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 原用信订单号
  originalOrderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      originalOrderNo: 'original_order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      originalOrderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheSearchContractResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 关联编号（授信/用信）
  relationNo?: string;
  // 合同编号
  contractNo?: string;
  // 合同名称
  contractName?: string;
  // 合同类型
  contractType?: string;
  // 客户编号
  customNo?: string;
  // 下载地址
  savePath?: string;
  // 合同金额
  contractAmount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      relationNo: 'relation_no',
      contractNo: 'contract_no',
      contractName: 'contract_name',
      contractType: 'contract_type',
      customNo: 'custom_no',
      savePath: 'save_path',
      contractAmount: 'contract_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      relationNo: 'string',
      contractNo: 'string',
      contractName: 'string',
      contractType: 'string',
      customNo: 'string',
      savePath: 'string',
      contractAmount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheReceiptOverdueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合同编号
  contractNo: string;
  // 渠道号
  channelCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      contractNo: 'contract_no',
      channelCode: 'channel_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      contractNo: 'string',
      channelCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubheReceiptOverdueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 逾期信息响应
  data?: OverdueInfoResponse;
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
      data: OverdueInfoResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendDubbridgeSmsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 接收短信的手机号码。支持对多个手机号码发送短信，手机号码之间以英文逗号（,）分隔。上限为1000个手机号码。批量调用相对于单条调用及时性稍有延迟。
  phoneNumbers: string;
  // 短信签名
  signName: string;
  // 短信模板CODE
  templateCode: string;
  // 短信模板变量对应的值，JSON格式
  templateParam?: string;
  // 上行短信扩展码
  smsUpExtendCode?: string;
  // 外部流水扩展
  outId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      phoneNumbers: 'phone_numbers',
      signName: 'sign_name',
      templateCode: 'template_code',
      templateParam: 'template_param',
      smsUpExtendCode: 'sms_up_extend_code',
      outId: 'out_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      phoneNumbers: 'string',
      signName: 'string',
      templateCode: 'string',
      templateParam: 'string',
      smsUpExtendCode: 'string',
      outId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendDubbridgeSmsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 云通信发送结果
  response?: SmsReponse;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      response: 'response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      response: SmsReponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendDubbridgeSmsBatchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 短信模板code
  templateCode: string;
  // 接收短信的手机号码，JSON数组格式
  phoneNumberJson: string;
  // 短信签名名称，JSON数组格式
  signNameJson: string;
  // 短信模板变量对应的实际值，JSON数组格式
  templateParamJson: string;
  // 上行短信扩展码，JSON数组格式。无特殊需要此字段的用户请忽略此字段
  smsUpExtendCodeJson: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      templateCode: 'template_code',
      phoneNumberJson: 'phone_number_json',
      signNameJson: 'sign_name_json',
      templateParamJson: 'template_param_json',
      smsUpExtendCodeJson: 'sms_up_extend_code_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      templateCode: 'string',
      phoneNumberJson: 'string',
      signNameJson: 'string',
      templateParamJson: 'string',
      smsUpExtendCodeJson: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendDubbridgeSmsBatchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 云通信短信发送结果
  response?: SmsReponse;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      response: 'response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      response: SmsReponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeRouterFundrouterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 身份证号
  cardNo: string;
  // 手机号
  mobile: string;
  // 姓名
  customName: string;
  // 合作方产品编号
  prodNo: string;
  // 渠道类型
  channelType?: string;
  // 客户类型
  customType?: string;
  // 导流平台
  trafficPlatform?: string;
  // 流量名称
  trafficSourceName?: string;
  // 广告位标志
  trafficAdId?: string;
  // 预留
  trafficMktId?: string;
  // 预留
  clickId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cardNo: 'card_no',
      mobile: 'mobile',
      customName: 'custom_name',
      prodNo: 'prod_no',
      channelType: 'channel_type',
      customType: 'custom_type',
      trafficPlatform: 'traffic_platform',
      trafficSourceName: 'traffic_source_name',
      trafficAdId: 'traffic_ad_id',
      trafficMktId: 'traffic_mkt_id',
      clickId: 'click_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cardNo: 'string',
      mobile: 'string',
      customName: 'string',
      prodNo: 'string',
      channelType: 'string',
      customType: 'string',
      trafficPlatform: 'string',
      trafficSourceName: 'string',
      trafficAdId: 'string',
      trafficMktId: 'string',
      clickId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeRouterFundrouterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 资金方代码
  fundCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      fundCode: 'fund_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      fundCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyDubbridgeCreditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础信息
  personalInfo: PersonalInfo;
  // 资产方用户唯一标识
  openId: string;
  // 订单号
  orderNo: string;
  // 居住信息
  borrowerLiveInfo?: LiveInfo;
  // 工作信息
  borrowerEmpInfo?: JobInfo;
  // 产品编号
  prodNo: string;
  // 风险数据对象
  riskData?: RiskData;
  // 借款用途
  loanReason?: string;
  // 资料文件
  materials?: Material[];
  // 导流平台
  trafficPlatform?: string;
  // 流量名称
  trafficSourceName?: string;
  // 广告位标志
  trafficAdId?: string;
  // 预留
  trafficMktId?: string;
  // 预留
  clickId?: string;
  // 渠道类型
  channelType?: string;
  // 客户类型
  customType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      personalInfo: 'personal_info',
      openId: 'open_id',
      orderNo: 'order_no',
      borrowerLiveInfo: 'borrower_live_info',
      borrowerEmpInfo: 'borrower_emp_info',
      prodNo: 'prod_no',
      riskData: 'risk_data',
      loanReason: 'loan_reason',
      materials: 'materials',
      trafficPlatform: 'traffic_platform',
      trafficSourceName: 'traffic_source_name',
      trafficAdId: 'traffic_ad_id',
      trafficMktId: 'traffic_mkt_id',
      clickId: 'click_id',
      channelType: 'channel_type',
      customType: 'custom_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      personalInfo: PersonalInfo,
      openId: 'string',
      orderNo: 'string',
      borrowerLiveInfo: LiveInfo,
      borrowerEmpInfo: JobInfo,
      prodNo: 'string',
      riskData: RiskData,
      loanReason: 'string',
      materials: { 'type': 'array', 'itemType': Material },
      trafficPlatform: 'string',
      trafficSourceName: 'string',
      trafficAdId: 'string',
      trafficMktId: 'string',
      clickId: 'string',
      channelType: 'string',
      customType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyDubbridgeCreditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 客户编号
  customNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      customNo: 'custom_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      customNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadDubbridgeFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderNo: string;
  // 渠道号
  channelCode: string;
  // 文件名
  fileName: string;
  // 文件id
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      channelCode: 'channel_code',
      fileName: 'file_name',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      channelCode: 'string',
      fileName: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadDubbridgeFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文件信息
  fileInfo?: DubheFileInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      fileInfo: 'file_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      fileInfo: DubheFileInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindDubbridgeCustomerBankcardRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderNo: string;
  // 客户编号
  customNo: string;
  // 银行卡号
  bankCardNo: string;
  // 渠道描述，具体请见分配
  channelCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      customNo: 'custom_no',
      bankCardNo: 'bank_card_no',
      channelCode: 'channel_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      customNo: 'string',
      bankCardNo: 'string',
      channelCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BindDubbridgeCustomerBankcardResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 绑卡流水
  bindSerialNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bindSerialNo: 'bind_serial_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bindSerialNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyDubbridgeCustomerBankcardRequest extends $tea.Model {
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

export class VerifyDubbridgeCustomerBankcardResponse extends $tea.Model {
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

export class NotifyDubbridgeDefininnerchannelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 调用流水
  seqNo: string;
  // 机构平台接口名
  apiName: string;
  // 机构编号
  instMemberCode: string;
  // 业务参数Json
  bizParam: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      seqNo: 'seq_no',
      apiName: 'api_name',
      instMemberCode: 'inst_member_code',
      bizParam: 'biz_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      seqNo: 'string',
      apiName: 'string',
      instMemberCode: 'string',
      bizParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyDubbridgeDefininnerchannelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 处理结果
  data?: DefinInnerChannelNotifyResult;
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
      data: DefinInnerChannelNotifyResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeCreditStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授信申请订单号	
  originalOrderNo?: string;
  // 订单号
  orderNo: string;
  // 三方客户id
  openId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      originalOrderNo: 'original_order_no',
      orderNo: 'order_no',
      openId: 'open_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      originalOrderNo: 'string',
      orderNo: 'string',
      openId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeCreditStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授信状态（0-通过/1-不通过2-处理中）
  status?: string;
  // 拒绝原因
  msg?: string;
  // 授信额度
  creditAmt?: number;
  // 期数
  period?: number;
  // 还款方式
  repayType?: string;
  // 额度信息
  creditInfo?: CreditAmount;
  // 客户编号(该客户的唯一标识，后续接口需要用到)
  customNo?: string;
  // 授信申请编号
  applyNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      msg: 'msg',
      creditAmt: 'credit_amt',
      period: 'period',
      repayType: 'repay_type',
      creditInfo: 'credit_info',
      customNo: 'custom_no',
      applyNo: 'apply_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      msg: 'string',
      creditAmt: 'number',
      period: 'number',
      repayType: 'string',
      creditInfo: CreditAmount,
      customNo: 'string',
      applyNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeRiskinfoEnterprisescoreRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 统一信用代码
  socialCreditCode: string;
  // MD5
  mobileMd5: string;
  // 客户号
  customerNo: string;
  // 渠道号
  channelCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      socialCreditCode: 'social_credit_code',
      mobileMd5: 'mobile_md5',
      customerNo: 'customer_no',
      channelCode: 'channel_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      socialCreditCode: 'string',
      mobileMd5: 'string',
      customerNo: 'string',
      channelCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeRiskinfoEnterprisescoreResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 小微分
  score?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      score: 'score',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      score: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeRiskinfoCommonRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询id
  queryId: string;
  // 查询id类型
  idType: string;
  // 用户id
  openId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      queryId: 'query_id',
      idType: 'id_type',
      openId: 'open_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      queryId: 'string',
      idType: 'string',
      openId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeRiskinfoCommonResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 风控信息Json字符串
  queryResult?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      queryResult: 'query_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      queryResult: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDubbridgeInstitutionCreditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 机构请求流水号，用于幂等。行方需确保唯一性
  serialNo: string;
  // 授信编号，授信申请时同申请单号一致，调额等操作同前授信申请时的授信编号一致
  creditNo: string;
  // 客户姓名
  name: string;
  // 身份证号
  certNo: string;
  // ADJUST_AMT_APPLY|ADJUST_RATE_APPLY|CLEAR_UP_APPLY|FROZEN_APPLY|UN_FROZEN_APPLY
  applyType: string;
  // 基础固额-申请调整值，单位分，机构发起调额场景下有值
  creditAmount?: string;
  // 年利率-申请调整值，机构发起调价场景下有值
  creditRate?: string;
  // 申请来源
  source: string;
  // 机构申请原因码
  reasonCode: string;
  // 机构发起原因描述
  reasonMsg: string;
  // 透传授信阶段天枢字段，json格式
  extInfoTs: string;
  // 扩展信息，json格式
  extInfo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serialNo: 'serial_no',
      creditNo: 'credit_no',
      name: 'name',
      certNo: 'cert_no',
      applyType: 'apply_type',
      creditAmount: 'credit_amount',
      creditRate: 'credit_rate',
      source: 'source',
      reasonCode: 'reason_code',
      reasonMsg: 'reason_msg',
      extInfoTs: 'ext_info_ts',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serialNo: 'string',
      creditNo: 'string',
      name: 'string',
      certNo: 'string',
      applyType: 'string',
      creditAmount: 'string',
      creditRate: 'string',
      source: 'string',
      reasonCode: 'string',
      reasonMsg: 'string',
      extInfoTs: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDubbridgeInstitutionCreditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 蚂蚁端返回申请单号
  applyNo?: string;
  // 机构请求流水号，用于幂等
  serialNo?: string;
  // 业务响应码
  bizCode?: string;
  // 业务消息
  bizMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      applyNo: 'apply_no',
      serialNo: 'serial_no',
      bizCode: 'biz_code',
      bizMsg: 'biz_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      applyNo: 'string',
      serialNo: 'string',
      bizCode: 'string',
      bizMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeRiskinfoBusinessinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 渠道号
  channelCode: string;
  // 客户号
  customerNo: string;
  // 统一社会信用代码
  socialCreditCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      channelCode: 'channel_code',
      customerNo: 'customer_no',
      socialCreditCode: 'social_credit_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      channelCode: 'string',
      customerNo: 'string',
      socialCreditCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDubbridgeRiskinfoBusinessinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 企业经营信息
  info?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      info: 'info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      info: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyFinserviceZhimaIdentifyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需要校验的人姓名
  legalPersonCertName: string;
  // 需要校验的人身份证号
  legalPersonCertNo: string;
  // 认证结束后的商户回调地址。
  merchantUrl: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      legalPersonCertName: 'legal_person_cert_name',
      legalPersonCertNo: 'legal_person_cert_no',
      merchantUrl: 'merchant_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      legalPersonCertName: 'string',
      legalPersonCertNo: 'string',
      merchantUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyFinserviceZhimaIdentifyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 本次认证的唯一标识，商户需要记录，后续的操作都需要用到。
  data?: ZhimaIdentifyResp;
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
      data: ZhimaIdentifyResp,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFinserviceZhimaIdentifyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 初始化时候返回的唯一标识
  bizNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizNo: 'biz_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryFinserviceZhimaIdentifyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  //  
  data?: ZhimaQueryResp;
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
      data: ZhimaQueryResp,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMdipDataserviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 服务编码
  serviceCode: string;
  // 服务参数
  serviceParam: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      serviceCode: 'service_code',
      serviceParam: 'service_param',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      serviceCode: 'string',
      serviceParam: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMdipDataserviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 多源查询结果值
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

export class QueryRbbGenericInvokeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // {"platformId":1234,"method":"riskQuery"}
  content: string;
  // 账号的所有权限点，逗号分隔
  permission: string;
  // 标题备用
  title: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      content: 'content',
      permission: 'permission',
      title: 'title',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      content: 'string',
      permission: 'string',
      title: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRbbGenericInvokeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回数据内容
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

export class CreateRbbTokenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 扩展字段
  content: string;
  // 新人用户密码，用来做映射生成token
  password: string;
  // 用户
  username: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      content: 'content',
      password: 'password',
      username: 'username',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      content: 'string',
      password: 'string',
      username: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRbbTokenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回数据
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

export class CreateRbbApiGwtokenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 扩展字段
  extension?: string;
  // 新人用户密码，用来做映射生成token
  password: string;
  // 用户
  username: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      extension: 'extension',
      password: 'password',
      username: 'username',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      extension: 'string',
      password: 'string',
      username: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRbbApiGwtokenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回登录token
  logintoken?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      logintoken: 'logintoken',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      logintoken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRbbGeneralRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 额外参数json
  extension?: string;
  // 通用查询名称
  queryname: string;
  // 查询参数JSON字符串
  queryparas?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      extension: 'extension',
      queryname: 'queryname',
      queryparas: 'queryparas',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      extension: 'string',
      queryname: 'string',
      queryparas: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRbbGeneralResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // json字符串表示的通用查询结果
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

export class GetRbbLoginTokenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户名
  username: string;
  // 密码
  password: string;
  // 扩展json字符串
  extension?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      username: 'username',
      password: 'password',
      extension: 'extension',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      username: 'string',
      password: 'string',
      extension: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRbbLoginTokenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 登录token，5分钟有效
  logintoken?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      logintoken: 'logintoken',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      logintoken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRbbTenantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户过期时间，不填表示永不过期
  effectiveEndDate?: string;
  // 租户编码，必须全局唯一
  tenantCode: string;
  // 租户名称
  tenantName: string;
  // 租户自定义属性，JSON格式，可以为空
  tenantPropertyJson?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      effectiveEndDate: 'effective_end_date',
      tenantCode: 'tenant_code',
      tenantName: 'tenant_name',
      tenantPropertyJson: 'tenant_property_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      effectiveEndDate: 'string',
      tenantCode: 'string',
      tenantName: 'string',
      tenantPropertyJson: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRbbTenantResponse extends $tea.Model {
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

export class CreateRbbUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户邮箱，非必填
  email?: string;
  // 用户姓名、真实名称，不要求全局唯一
  fullName: string;
  // 用户密码
  password: string;
  // 用户电话号码，非必填
  phone?: string;
  // 用户所属租户编码
  tenantCode?: string;
  // 用户名，必须全局唯一
  userName: string;
  // 用户属性扩展字段，json格式，可以为空
  userPropertyJson?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      email: 'email',
      fullName: 'full_name',
      password: 'password',
      phone: 'phone',
      tenantCode: 'tenant_code',
      userName: 'user_name',
      userPropertyJson: 'user_property_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      email: 'string',
      fullName: 'string',
      password: 'string',
      phone: 'string',
      tenantCode: 'string',
      userName: 'string',
      userPropertyJson: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRbbUserResponse extends $tea.Model {
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

export class ExecRbbCompanyGuardRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业名称或统一社会信用代码
  keyword: string;
  // 规则ID，在风险大脑系统中配置
  ruleId: number;
  // 额外参数，与规则有关
  params?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      keyword: 'keyword',
      ruleId: 'rule_id',
      params: 'params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      keyword: 'string',
      ruleId: 'number',
      params: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecRbbCompanyGuardResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 决策结果，ACCEPT/REJECT/TBD
  decision?: string;
  // 准入执行结果的快照
  results?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      decision: 'decision',
      results: 'results',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      decision: 'string',
      results: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyRbbCompanyCreditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业名称、统一社会信用代码
  keyword: string;
  // 规则ID，需提前在蚁盾中进行配置
  ruleId: number;
  // 额外参数，与规则有关
  params?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      keyword: 'keyword',
      ruleId: 'rule_id',
      params: 'params',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      keyword: 'string',
      ruleId: 'number',
      params: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyRbbCompanyCreditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询token，用于查询授信结果
  token?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      token: 'token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      token: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRbbCompanyCreditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询token，从apply接口获得
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

export class QueryRbbCompanyCreditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授信额度，单位元
  creditAmount?: number;
  // 额外特征字段
  extra?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      creditAmount: 'credit_amount',
      extra: 'extra',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      creditAmount: 'number',
      extra: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRbbRegdatasyncPreparedRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询该bizDate数据分区的数据是否已经准备好
  bizDate: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizDate: 'biz_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRbbRegdatasyncPreparedResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 指定时间分区的数据是否已经准备完毕
  prepared?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      prepared: 'prepared',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      prepared: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartRbbRegdatasyncScheduleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 同步时间分区
  bizDate: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizDate: 'biz_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartRbbRegdatasyncScheduleResponse extends $tea.Model {
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

export class FinishRbbRegdatasyncScheduleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 时间分区
  bizDate: string;
  // 记录当前分区离线同步情况
  syncInfo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizDate: 'biz_date',
      syncInfo: 'sync_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizDate: 'string',
      syncInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FinishRbbRegdatasyncScheduleResponse extends $tea.Model {
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

export class QueryRpgwSignUrlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业标识，固定值
  companyCode: string;
  // 调用方平台用户id
  platformUserIdentification: string;
  // 手机号
  userCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyCode: 'company_code',
      platformUserIdentification: 'platform_user_identification',
      userCode: 'user_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyCode: 'string',
      platformUserIdentification: 'string',
      userCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRpgwSignUrlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签约地址
  resultData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultData: 'result_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterRpgwUserEinvoiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业标识，固定值
  companyCode: string;
  // 调用方平台用户id
  platformUserIdentification: string;
  // 身份证号码
  identificationNumber: string;
  // 用户手机号
  mobilePhone: string;
  // 用户姓名
  userName: string;
  // 身份证照片人像面照片url
  identityFrontPic: string;
  // 身份证照片国徽面url
  identityBackPic: string;
  // 身份证有效期开始时间，格式yyyy-MM-dd
  idcardValidityStart: string;
  // 身份证有效期结束时间，格式yyyy-MM-dd
  idcardValidityEnd: string;
  // 实名认证时间，格式yyyy-MM-dd HH:mm:ss
  identityTime: string;
  // 注册模式，固定值
  registerMode: string;
  // 注册时间，格式yyyy-MM-dd HH:mm:ss
  registerTime: string;
  // 用户人脸照片url
  facePic?: string;
  // 支付宝账号，实名认证的支付宝登录邮箱或手机登录，其账户姓名好和实人认证姓名一致
  alipayAccount?: string;
  // 微信支付个人账户（openid）
  wxpayAccount?: string;
  // 银行卡号，标准一类或二类卡格式，持卡人为本用户
  bankcardNo?: string;
  // 开户行名称
  bankName?: string;
  // 开户行归属地省市
  bankcardCity?: string;
  // 用户所在省市
  city?: string;
  // 拓展信息
  extJson?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyCode: 'company_code',
      platformUserIdentification: 'platform_user_identification',
      identificationNumber: 'identification_number',
      mobilePhone: 'mobile_phone',
      userName: 'user_name',
      identityFrontPic: 'identity_front_pic',
      identityBackPic: 'identity_back_pic',
      idcardValidityStart: 'idcard_validity_start',
      idcardValidityEnd: 'idcard_validity_end',
      identityTime: 'identity_time',
      registerMode: 'register_mode',
      registerTime: 'register_time',
      facePic: 'face_pic',
      alipayAccount: 'alipay_account',
      wxpayAccount: 'wxpay_account',
      bankcardNo: 'bankcard_no',
      bankName: 'bank_name',
      bankcardCity: 'bankcard_city',
      city: 'city',
      extJson: 'ext_json',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyCode: 'string',
      platformUserIdentification: 'string',
      identificationNumber: 'string',
      mobilePhone: 'string',
      userName: 'string',
      identityFrontPic: 'string',
      identityBackPic: 'string',
      idcardValidityStart: 'string',
      idcardValidityEnd: 'string',
      identityTime: 'string',
      registerMode: 'string',
      registerTime: 'string',
      facePic: 'string',
      alipayAccount: 'string',
      wxpayAccount: 'string',
      bankcardNo: 'string',
      bankName: 'string',
      bankcardCity: 'string',
      city: 'string',
      extJson: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RegisterRpgwUserEinvoiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户在我方的id
  resultData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultData: 'result_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRpgwUserSignurlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业标识，固定值
  companyCode: string;
  // 调用方平台用户id
  platformUserIdentification: string;
  // 手机号
  userCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyCode: 'company_code',
      platformUserIdentification: 'platform_user_identification',
      userCode: 'user_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyCode: 'string',
      platformUserIdentification: 'string',
      userCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRpgwUserSignurlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签约地址
  resultData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultData: 'result_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class WithdrawRpgwUserCommissionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 提现业务单号
  orderNumber: string;
  // 任务单号
  userOrderNumbers: string;
  // 提现人id
  withdrawerId: string;
  // 提现人支付宝id
  withdrawerAlipayId: string;
  // 提现人姓名
  withdrawerName: string;
  // 提现人手机
  withdrawerPhoneNumber?: string;
  // 提现人身份证
  withdrawerIdNumber: string;
  // 提现金额
  withdrawAmount: string;
  // 提现附言
  orderTitle: string;
  // 业务备注
  remark: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNumber: 'order_number',
      userOrderNumbers: 'user_order_numbers',
      withdrawerId: 'withdrawer_id',
      withdrawerAlipayId: 'withdrawer_alipay_id',
      withdrawerName: 'withdrawer_name',
      withdrawerPhoneNumber: 'withdrawer_phone_number',
      withdrawerIdNumber: 'withdrawer_id_number',
      withdrawAmount: 'withdraw_amount',
      orderTitle: 'order_title',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNumber: 'string',
      userOrderNumbers: 'string',
      withdrawerId: 'string',
      withdrawerAlipayId: 'string',
      withdrawerName: 'string',
      withdrawerPhoneNumber: 'string',
      withdrawerIdNumber: 'string',
      withdrawAmount: 'string',
      orderTitle: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class WithdrawRpgwUserCommissionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 提现结果
  resultData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultData: 'result_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncRpgwUserOrderinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 订单号
  orderNumber: string;
  // REGISTER与PURCHASE二选一
  orderType: string;
  // 注册/下单总佣金
  orderAmount: string;
  // 时间，格式为yyyy-MM-dd HH:mm:ss
  orderTime: string;
  // 邀请人id
  inviterId: string;
  // 邀请人姓名
  inviterName: string;
  // 邀请人手机号
  inviterPhoneNumber: string;
  // 邀请人身份证号
  inviterIdNumber: string;
  // 邀请码
  invitationCode?: string;
  // 被邀请人id
  inviteeId: string;
  // 被邀请人姓名
  inviteeName?: string;
  // 被邀请人手机号
  inviteePhoneNumber: string;
  // 被邀请人身份证
  inviteeIdNumber?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNumber: 'order_number',
      orderType: 'order_type',
      orderAmount: 'order_amount',
      orderTime: 'order_time',
      inviterId: 'inviter_id',
      inviterName: 'inviter_name',
      inviterPhoneNumber: 'inviter_phone_number',
      inviterIdNumber: 'inviter_id_number',
      invitationCode: 'invitation_code',
      inviteeId: 'invitee_id',
      inviteeName: 'invitee_name',
      inviteePhoneNumber: 'invitee_phone_number',
      inviteeIdNumber: 'invitee_id_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNumber: 'string',
      orderType: 'string',
      orderAmount: 'string',
      orderTime: 'string',
      inviterId: 'string',
      inviterName: 'string',
      inviterPhoneNumber: 'string',
      inviterIdNumber: 'string',
      invitationCode: 'string',
      inviteeId: 'string',
      inviteeName: 'string',
      inviteePhoneNumber: 'string',
      inviteeIdNumber: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncRpgwUserOrderinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 同步结果
  resultData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultData: 'result_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyRpgwUserSignresultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 调用方平台用户id
  platformUserIdentification: string;
  // 用户手机号
  userCode: string;
  // 签约结果，1成功，0失败
  signResult: string;
  // 失败原因描述
  resultDesc?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      platformUserIdentification: 'platform_user_identification',
      userCode: 'user_code',
      signResult: 'sign_result',
      resultDesc: 'result_desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      platformUserIdentification: 'string',
      userCode: 'string',
      signResult: 'string',
      resultDesc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyRpgwUserSignresultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 通知结果
  resultData?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultData: 'result_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCompanyOpinionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 结束时间
  endTime: string;
  // 页码
  pageNum: number;
  // 一页的数量
  pageSize: number;
  // 所在地的名称
  placeName: string;
  // 地区类型
  placeType: string;
  // 开始时间
  startTime: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      endTime: 'end_time',
      pageNum: 'page_num',
      pageSize: 'page_size',
      placeName: 'place_name',
      placeType: 'place_type',
      startTime: 'start_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      endTime: 'string',
      pageNum: 'number',
      pageSize: 'number',
      placeName: 'string',
      placeType: 'string',
      startTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCompanyOpinionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  companyOpinionCount: RtopCompanyOpinionCount[];
  // 页码
  pageNum: number;
  // 一页的数量
  pageSize: number;
  // 总的记录数
  totalCount: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      companyOpinionCount: 'company_opinion_count',
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
      companyOpinionCount: { 'type': 'array', 'itemType': RtopCompanyOpinionCount },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRtopCompanyOpinionsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 地区类型
  companyName: string;
  // 页码
  pageNum: number;
  // 一页的数量
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyName: 'company_name',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyName: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRtopCompanyOpinionsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  companyOpinionDetails: RtopCompanyOpinionDetail[];
  // 页码
  pageNum: number;
  // 一页的数量
  pageSize: number;
  // 总的记录数
  totalCount: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      companyOpinionDetails: 'company_opinion_details',
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
      companyOpinionDetails: { 'type': 'array', 'itemType': RtopCompanyOpinionDetail },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRtopCompanyMonitorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 地区类型
  companyName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyName: 'company_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRtopCompanyMonitorResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 活跃市，不带国家和地区的代码
  activeCity: string;
  // 监测企业的行业
  companyCategory?: string;
  // 涉众风险类型
  crowdRiskType: string;
  features: RtopMonitorCompanyFeature[];
  // 影响金额
  moneyInvolved: number;
  monitorRiskTags: string[];
  // 监测企业的评分
  monitorScore: number;
  // 影响人数
  peopleInvolved: number;
  // 注册市，不带国家和地区的代码
  registeredCity: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      activeCity: 'active_city',
      companyCategory: 'company_category',
      crowdRiskType: 'crowd_risk_type',
      features: 'features',
      moneyInvolved: 'money_involved',
      monitorRiskTags: 'monitor_risk_tags',
      monitorScore: 'monitor_score',
      peopleInvolved: 'people_involved',
      registeredCity: 'registered_city',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      activeCity: 'string',
      companyCategory: 'string',
      crowdRiskType: 'string',
      features: { 'type': 'array', 'itemType': RtopMonitorCompanyFeature },
      moneyInvolved: 'number',
      monitorRiskTags: { 'type': 'array', 'itemType': 'string' },
      monitorScore: 'number',
      peopleInvolved: 'number',
      registeredCity: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCrowdriskStatisticRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 结束时间
  endTime?: string;
  // 所在地的名称
  placeName?: string;
  // 地区类型
  placeType?: string;
  // 开始时间
  startTime?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      endTime: 'end_time',
      placeName: 'place_name',
      placeType: 'place_type',
      startTime: 'start_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      endTime: 'string',
      placeName: 'string',
      placeType: 'string',
      startTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCrowdriskStatisticResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  levelDistribution?: RtopLevelDistribution[];
  // 按地区统计
  regionDistribution?: RtopRegionalDistribution[];
  typeDistribution?: RtopTypeDistribution[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      levelDistribution: 'level_distribution',
      regionDistribution: 'region_distribution',
      typeDistribution: 'type_distribution',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      levelDistribution: { 'type': 'array', 'itemType': RtopLevelDistribution },
      regionDistribution: { 'type': 'array', 'itemType': RtopRegionalDistribution },
      typeDistribution: { 'type': 'array', 'itemType': RtopTypeDistribution },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRtopCrowdriskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 活跃地筛选
  activePlaces?: string[];
  // 风险等级
  crowdRiskLevels?: string[];
  // 风险类型
  crowdRiskTypes?: string[];
  // 结束时间
  endTime?: string;
  // 页码
  pageNum?: number;
  // 每页条数
  pageSize?: number;
  // 所在地的名称
  placeName?: string;
  // 地区类型
  placeType?: string;
  // 注册地筛选
  regPlaces?: string[];
  // 排序字段
  sortBy?: string;
  // 排序方式
  sortType?: string;
  // 开始时间
  startTime?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      activePlaces: 'active_places',
      crowdRiskLevels: 'crowd_risk_levels',
      crowdRiskTypes: 'crowd_risk_types',
      endTime: 'end_time',
      pageNum: 'page_num',
      pageSize: 'page_size',
      placeName: 'place_name',
      placeType: 'place_type',
      regPlaces: 'reg_places',
      sortBy: 'sort_by',
      sortType: 'sort_type',
      startTime: 'start_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      activePlaces: { 'type': 'array', 'itemType': 'string' },
      crowdRiskLevels: { 'type': 'array', 'itemType': 'string' },
      crowdRiskTypes: { 'type': 'array', 'itemType': 'string' },
      endTime: 'string',
      pageNum: 'number',
      pageSize: 'number',
      placeName: 'string',
      placeType: 'string',
      regPlaces: { 'type': 'array', 'itemType': 'string' },
      sortBy: 'string',
      sortType: 'string',
      startTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRtopCrowdriskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 企业列表
  companys?: RtopCrowdRiskSummaryResp[];
  // 页码
  pageNum?: number;
  // 每页条数
  pageSize?: number;
  // 总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      companys: 'companys',
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
      companys: { 'type': 'array', 'itemType': RtopCrowdRiskSummaryResp },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCrowdriskDetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业ID
  companyId?: string;
  // 所在地的名称
  placeName?: string;
  // 地区类型
  placeType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyId: 'company_id',
      placeName: 'place_name',
      placeType: 'place_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyId: 'string',
      placeName: 'string',
      placeType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCrowdriskDetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 活跃市
  activeCity?: string;
  // 活跃县
  activeCounty?: string;
  // 活跃省
  activeProvince?: string;
  // 年龄分布
  ageDistribution?: RtopAgeDistribution[];
  // 线索标签
  clueTags?: string[];
  // 报文
  conclusion?: string;
  // 风险等级
  crowdRiskLevel?: string;
  // 涉众风险分析的分数
  crowdRiskScore?: number;
  // 风险类型
  crowdRiskType?: string;
  // 发现时间
  detectedTime?: string;
  // 特征
  features?: RtopCrowdRiskFeatureResp[];
  // 性别分布
  genderDistribution?: RtopGenderDistribution[];
  // 上次活跃时间
  lastActiveTime?: string;
  // 涉案金额
  moneyInvolved?: number;
  // 影响金额的历史曲线
  moneyInvolvedHistory?: RtopDateDistribution[];
  // 涉案人数
  peopleInvolved?: number;
  // 影响人数的历史曲线
  peopleInvolvedHistory?: RtopDateDistribution[];
  // 影响的人数分布，key为地区城市，value为影响的人数
  populationDistribution?: RtopPopulationDistribution[];
  // 注册市
  registeredCity?: string;
  // 注册县
  registeredCounty?: string;
  // 注册省
  registeredProvince?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      activeCity: 'active_city',
      activeCounty: 'active_county',
      activeProvince: 'active_province',
      ageDistribution: 'age_distribution',
      clueTags: 'clue_tags',
      conclusion: 'conclusion',
      crowdRiskLevel: 'crowd_risk_level',
      crowdRiskScore: 'crowd_risk_score',
      crowdRiskType: 'crowd_risk_type',
      detectedTime: 'detected_time',
      features: 'features',
      genderDistribution: 'gender_distribution',
      lastActiveTime: 'last_active_time',
      moneyInvolved: 'money_involved',
      moneyInvolvedHistory: 'money_involved_history',
      peopleInvolved: 'people_involved',
      peopleInvolvedHistory: 'people_involved_history',
      populationDistribution: 'population_distribution',
      registeredCity: 'registered_city',
      registeredCounty: 'registered_county',
      registeredProvince: 'registered_province',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      activeCity: 'string',
      activeCounty: 'string',
      activeProvince: 'string',
      ageDistribution: { 'type': 'array', 'itemType': RtopAgeDistribution },
      clueTags: { 'type': 'array', 'itemType': 'string' },
      conclusion: 'string',
      crowdRiskLevel: 'string',
      crowdRiskScore: 'number',
      crowdRiskType: 'string',
      detectedTime: 'string',
      features: { 'type': 'array', 'itemType': RtopCrowdRiskFeatureResp },
      genderDistribution: { 'type': 'array', 'itemType': RtopGenderDistribution },
      lastActiveTime: 'string',
      moneyInvolved: 'number',
      moneyInvolvedHistory: { 'type': 'array', 'itemType': RtopDateDistribution },
      peopleInvolved: 'number',
      peopleInvolvedHistory: { 'type': 'array', 'itemType': RtopDateDistribution },
      populationDistribution: { 'type': 'array', 'itemType': RtopPopulationDistribution },
      registeredCity: 'string',
      registeredCounty: 'string',
      registeredProvince: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopRiskstormRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业ID
  companyId?: string;
  // 数据类型
  type?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyId: 'company_id',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyId: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopRiskstormResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 年报数据
  annualReports?: RtopRiskStormCompanyAnnualReport[];
  // 风险标签数据
  riskLabels?: RiskStormLabelResp[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      annualReports: 'annual_reports',
      riskLabels: 'risk_labels',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      annualReports: { 'type': 'array', 'itemType': RtopRiskStormCompanyAnnualReport },
      riskLabels: { 'type': 'array', 'itemType': RiskStormLabelResp },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCrowdriskSumRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 指定的企业ID列表，企业ID数量不超过100个。
  companyIds: string[];
  // 指定的地区名称，例如温州市、鹿城区等
  placeName: string;
  // 地区类型，PROVINCE表示省，CITY表示市，COUNTY表示县
  placeType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyIds: 'company_ids',
      placeName: 'place_name',
      placeType: 'place_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyIds: { 'type': 'array', 'itemType': 'string' },
      placeName: 'string',
      placeType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCrowdriskSumResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询企业的影响金额之和
  moneyInvolved?: number;
  // 查询企业的影响人数之和
  peopleInvolved?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      moneyInvolved: 'money_involved',
      peopleInvolved: 'people_involved',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      moneyInvolved: 'number',
      peopleInvolved: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRtopCompanyDetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业ID
  companyId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyId: 'company_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetRtopCompanyDetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 风险分数
  riskScore?: number;
  // 风险维度特征
  riskFeatures?: string;
  // 风险标签列表
  riskTags?: RtopRiskTag[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      riskScore: 'risk_score',
      riskFeatures: 'risk_features',
      riskTags: 'risk_tags',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      riskScore: 'number',
      riskFeatures: 'string',
      riskTags: { 'type': 'array', 'itemType': RtopRiskTag },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCompanyRiskinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 租户access key
  ak: string;
  // 业务场景 ""
  bizType?: string;
  // 预留字段
  memo?: string;
  // 区域中文名称
  placeName: string;
  // 区域类型
  placeType: string;
  // 租户seceret key
  sk: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      ak: 'ak',
      bizType: 'biz_type',
      memo: 'memo',
      placeName: 'place_name',
      placeType: 'place_type',
      sk: 'sk',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      ak: 'string',
      bizType: 'string',
      memo: 'string',
      placeName: 'string',
      placeType: 'string',
      sk: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCompanyRiskinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 企业列表
  data?: RtopCompanyRiskInfo[];
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
      data: { 'type': 'array', 'itemType': RtopCompanyRiskInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecRtopGenericInvokeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // {"platformId":1234}
  content: string;
  // 这个账号的所有权限点，逗号分隔
  permission: string;
  // title
  title: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      content: 'content',
      permission: 'permission',
      title: 'title',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      content: 'string',
      permission: 'string',
      title: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecRtopGenericInvokeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 接口数据
  data?: string;
  // response_code
  responseCode?: string;
  // 是否请求成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      responseCode: 'response_code',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      responseCode: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateRtopTokenRequest extends $tea.Model {
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

export class CreateRtopTokenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回数据
  data?: string;
  // 返回码
  responseCode?: string;
  // 成功，失败
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      responseCode: 'response_code',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: 'string',
      responseCode: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopRisklabelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // pageNo
  pageNo: number;
  // pageSize
  pageSize: number;
  // scroll_id
  scrollId?: string;
  // mct_one_id  -- search after使用
  mctOneId?: string;
  // 数据更新日期
  updateDate: string;
  // tag_id  -- search after使用
  tagId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageNo: 'page_no',
      pageSize: 'page_size',
      scrollId: 'scroll_id',
      mctOneId: 'mct_one_id',
      updateDate: 'update_date',
      tagId: 'tag_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageNo: 'number',
      pageSize: 'number',
      scrollId: 'string',
      mctOneId: 'string',
      updateDate: 'string',
      tagId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopRisklabelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回码
  responseCode?: string;
  // 标签信息
  riskLabelInfos?: RiskLabelInfo[];
  // scroll_id
  scrollId?: string;
  // 是否调用成功
  success?: boolean;
  // total
  total?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseCode: 'response_code',
      riskLabelInfos: 'risk_label_infos',
      scrollId: 'scroll_id',
      success: 'success',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseCode: 'string',
      riskLabelInfos: { 'type': 'array', 'itemType': RiskLabelInfo },
      scrollId: 'string',
      success: 'boolean',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCompanyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 公司ID集合
  companyIds: string[];
  // 数据同步到公有云时间(业务上赋值当天)
  updateDate: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyIds: 'company_ids',
      updateDate: 'update_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyIds: { 'type': 'array', 'itemType': 'string' },
      updateDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCompanyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 企业信息列表
  companyInfos?: CompanyInfo[];
  // 返回码
  responseCode?: string;
  // 是否调用成功
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      companyInfos: 'company_infos',
      responseCode: 'response_code',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      companyInfos: { 'type': 'array', 'itemType': CompanyInfo },
      responseCode: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopRisklabelFilterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // pageNo
  pageNo: number;
  // page_size
  pageSize: number;
  // 成都市
  placeName: string;
  // CITY
  placeType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageNo: 'page_no',
      pageSize: 'page_size',
      placeName: 'place_name',
      placeType: 'place_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageNo: 'number',
      pageSize: 'number',
      placeName: 'string',
      placeType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopRisklabelFilterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回码
  responseCode?: string;
  // 标签配置全量信息
  riskLabelFilterConfigInfo?: RiskLabelFilterConfigInfo[];
  // 是否调用成功
  success?: boolean;
  // 总数
  total?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseCode: 'response_code',
      riskLabelFilterConfigInfo: 'risk_label_filter_config_info',
      success: 'success',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseCode: 'string',
      riskLabelFilterConfigInfo: { 'type': 'array', 'itemType': RiskLabelFilterConfigInfo },
      success: 'boolean',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PullRegtechNewsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 表示本地数据库中舆情数据中的最大id
  newsMaxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      newsMaxId: 'news_max_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      newsMaxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PullRegtechNewsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回的数据体
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

export class QueryRtopCompanyFeedbackRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前是第几页
  pageNo: number;
  // 每一页的记录条数
  pageSize: number;
  // 用户属地
  userPlace: string;
  // 用户所在地类型
  userPlaceType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageNo: 'page_no',
      pageSize: 'page_size',
      userPlace: 'user_place',
      userPlaceType: 'user_place_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageNo: 'number',
      pageSize: 'number',
      userPlace: 'string',
      userPlaceType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCompanyFeedbackResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 企业反馈列表
  companyFeedbacks?: RtopCompanyFeedback[];
  // 返回码
  responseCode?: string;
  // 是否调用成功
  success?: boolean;
  // 总条数
  totalNum?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      companyFeedbacks: 'company_feedbacks',
      responseCode: 'response_code',
      success: 'success',
      totalNum: 'total_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      companyFeedbacks: { 'type': 'array', 'itemType': RtopCompanyFeedback },
      responseCode: 'string',
      success: 'boolean',
      totalNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCompanyAlarmRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据的时间
  dataTime: string;
  // 当前是第几页
  pageNo: number;
  // 每一页的记录条数
  pageSize: number;
  // 用户属地
  userPlace: string;
  // 用户所在地类型
  userPlaceType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataTime: 'data_time',
      pageNo: 'page_no',
      pageSize: 'page_size',
      userPlace: 'user_place',
      userPlaceType: 'user_place_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataTime: 'string',
      pageNo: 'number',
      pageSize: 'number',
      userPlace: 'string',
      userPlaceType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCompanyAlarmResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 预警企业列表
  companyAlarms?: RtopCompanyAlarm[];
  // 返回码
  responseCode?: string;
  // 是否调用成功
  success?: boolean;
  // 总条数
  totalNum?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      companyAlarms: 'company_alarms',
      responseCode: 'response_code',
      success: 'success',
      totalNum: 'total_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      companyAlarms: { 'type': 'array', 'itemType': RtopCompanyAlarm },
      responseCode: 'string',
      success: 'boolean',
      totalNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCompanyRiskyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据时间
  dataTime: string;
  // 全局态势中的列表 类型
  listType: string;
  // 当前是第几页
  pageNo: number;
  // 每一页的记录条数
  pageSize: number;
  // 全局动态类型
  type: string;
  // 用户属地
  userPlace: string;
  // 用户所在地类型
  userPlaceType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      dataTime: 'data_time',
      listType: 'list_type',
      pageNo: 'page_no',
      pageSize: 'page_size',
      type: 'type',
      userPlace: 'user_place',
      userPlaceType: 'user_place_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      dataTime: 'string',
      listType: 'string',
      pageNo: 'number',
      pageSize: 'number',
      type: 'string',
      userPlace: 'string',
      userPlaceType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCompanyRiskyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回码
  responseCode?: string;
  // 全局动态中的企业列表
  riskyCompanies?: RtopRiskyCompany[];
  // 是否调用成功
  success?: boolean;
  // 总条数
  totalNum?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseCode: 'response_code',
      riskyCompanies: 'risky_companies',
      success: 'success',
      totalNum: 'total_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseCode: 'string',
      riskyCompanies: { 'type': 'array', 'itemType': RtopRiskyCompany },
      success: 'boolean',
      totalNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCompanyListRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 活跃地区
  activeAreas?: string[];
  // 企业类型
  categories?: string[];
  // 企业状态
  companyStates?: string[];
  // 反馈
  feedback?: string[];
  // 风险指数最大值
  maxRiskScore?: number;
  // 指数周波动最大值
  maxRiskScoreWeeklyFloat?: string;
  // 传播人次最大值
  maxSpreadNumber?: number;
  // 风险指数最小值
  minRiskScore?: number;
  // 指数周波动最小值
  minRiskScoreWeeklyFloat?: string;
  // 传播人次最小值
  minSpreadNumber?: number;
  // 正常营运状态
  normalOperation?: boolean;
  // 经营地区
  operateAreas?: string[];
  // 当前是第几页
  pageNo: number;
  // 每一页的记录条数
  pageSize: number;
  // 平台状态
  platformStates?: string[];
  // 注册地区
  registerAreas?: string[];
  // 高风险维度
  riskyDimensions?: string[];
  // 风险标签
  riskTags?: string[];
  // 风险定性
  riskTypes?: string[];
  // 排序字段
  sortField?: string;
  // 排序类型
  sortType?: string;
  // 用户属地
  userPlace: string;
  // 用户所在地类型
  userPlaceType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      activeAreas: 'active_areas',
      categories: 'categories',
      companyStates: 'company_states',
      feedback: 'feedback',
      maxRiskScore: 'max_risk_score',
      maxRiskScoreWeeklyFloat: 'max_risk_score_weekly_float',
      maxSpreadNumber: 'max_spread_number',
      minRiskScore: 'min_risk_score',
      minRiskScoreWeeklyFloat: 'min_risk_score_weekly_float',
      minSpreadNumber: 'min_spread_number',
      normalOperation: 'normal_operation',
      operateAreas: 'operate_areas',
      pageNo: 'page_no',
      pageSize: 'page_size',
      platformStates: 'platform_states',
      registerAreas: 'register_areas',
      riskyDimensions: 'risky_dimensions',
      riskTags: 'risk_tags',
      riskTypes: 'risk_types',
      sortField: 'sort_field',
      sortType: 'sort_type',
      userPlace: 'user_place',
      userPlaceType: 'user_place_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      activeAreas: { 'type': 'array', 'itemType': 'string' },
      categories: { 'type': 'array', 'itemType': 'string' },
      companyStates: { 'type': 'array', 'itemType': 'string' },
      feedback: { 'type': 'array', 'itemType': 'string' },
      maxRiskScore: 'number',
      maxRiskScoreWeeklyFloat: 'string',
      maxSpreadNumber: 'number',
      minRiskScore: 'number',
      minRiskScoreWeeklyFloat: 'string',
      minSpreadNumber: 'number',
      normalOperation: 'boolean',
      operateAreas: { 'type': 'array', 'itemType': 'string' },
      pageNo: 'number',
      pageSize: 'number',
      platformStates: { 'type': 'array', 'itemType': 'string' },
      registerAreas: { 'type': 'array', 'itemType': 'string' },
      riskyDimensions: { 'type': 'array', 'itemType': 'string' },
      riskTags: { 'type': 'array', 'itemType': 'string' },
      riskTypes: { 'type': 'array', 'itemType': 'string' },
      sortField: 'string',
      sortType: 'string',
      userPlace: 'string',
      userPlaceType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCompanyListResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 企业id列表
  companyIds?: string[];
  // 返回码
  responseCode?: string;
  // 是否调用成功
  success?: boolean;
  // 总条数
  totalNum?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      companyIds: 'company_ids',
      responseCode: 'response_code',
      success: 'success',
      totalNum: 'total_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      companyIds: { 'type': 'array', 'itemType': 'string' },
      responseCode: 'string',
      success: 'boolean',
      totalNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopRisklabelConfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // page_no
  pageNo: number;
  // page_size
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageNo: 'page_no',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageNo: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopRisklabelConfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回码	
  // 
  responseCode?: string;
  // 是否调用成功	
  // 
  success?: boolean;
  // 列表
  tagConfig?: RiskLabelConfigInfo[];
  // 总数
  total?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      responseCode: 'response_code',
      success: 'success',
      tagConfig: 'tag_config',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      responseCode: 'string',
      success: 'boolean',
      tagConfig: { 'type': 'array', 'itemType': RiskLabelConfigInfo },
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCompanyRiskRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业id
  companyId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyId: 'company_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopCompanyRiskResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 风险维度
  riskFactors?: RtopCompanyRiskFactor[];
  // 风险等级
  riskLevel?: string;
  // 风险报文
  riskMessage?: string;
  // 风险分数
  riskScore?: number;
  // 风险标签
  riskTags?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      riskFactors: 'risk_factors',
      riskLevel: 'risk_level',
      riskMessage: 'risk_message',
      riskScore: 'risk_score',
      riskTags: 'risk_tags',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      riskFactors: { 'type': 'array', 'itemType': RtopCompanyRiskFactor },
      riskLevel: 'string',
      riskMessage: 'string',
      riskScore: 'number',
      riskTags: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRtopCompanyRelatedRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业id
  companyId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyId: 'company_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRtopCompanyRelatedResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // node
  companies?: RtopRiskGeneNode[];
  // 返回码
  // 
  responseCode?: string;
  // 是否调用成功
  // 
  success?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      companies: 'companies',
      responseCode: 'response_code',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      companies: { 'type': 'array', 'itemType': RtopRiskGeneNode },
      responseCode: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopTagImageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业ID
  companyId: string;
  // 标签ID
  tagId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyId: 'company_id',
      tagId: 'tag_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyId: 'string',
      tagId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRtopTagImageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 标签图片列表
  riskImages?: RtopTagImage[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      riskImages: 'risk_images',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      riskImages: { 'type': 'array', 'itemType': RtopTagImage },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRtopStarCompanyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 页码
  pageNo: number;
  // 一页条数
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageNo: 'page_no',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageNo: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListRtopStarCompanyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 企业列表
  companyInfos?: RtopStarCompanyInfo[];
  // 页码
  pageNo?: number;
  // 一页条数
  pageSize?: number;
  // 总的记录数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      companyInfos: 'company_infos',
      pageNo: 'page_no',
      pageSize: 'page_size',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      companyInfos: { 'type': 'array', 'itemType': RtopStarCompanyInfo },
      pageNo: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRpSecurityPolicyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 风险类型：表示风险处理或风险咨询——process/advice
  riskType: string;
  // security_scene
  securityScene: SecurityScene;
  // service_context
  serviceContext: ServiceContext;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      riskType: 'risk_type',
      securityScene: 'security_scene',
      serviceContext: 'service_context',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      riskType: 'string',
      securityScene: SecurityScene,
      serviceContext: ServiceContext,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryRpSecurityPolicyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 模型结果详情
  // 
  modelDetails?: ModelDetails[];
  // 反馈成功之后的id
  securityId?: string;
  // 安全处理结果，枚举值为：reject[拒绝],validate[校验],accept[放过]
  securityResult?: string;
  // 策略结果详情
  // 
  strategyDetails?: StrategyDetails[];
  // 决策流信息
  dfSceneInfos?: DfSceneInfos;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      modelDetails: 'model_details',
      securityId: 'security_id',
      securityResult: 'security_result',
      strategyDetails: 'strategy_details',
      dfSceneInfos: 'df_scene_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      modelDetails: { 'type': 'array', 'itemType': ModelDetails },
      securityId: 'string',
      securityResult: 'string',
      strategyDetails: { 'type': 'array', 'itemType': StrategyDetails },
      dfSceneInfos: DfSceneInfos,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySnapshotEventRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 事件id
  eventId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      eventId: 'event_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      eventId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QuerySnapshotEventResponse extends $tea.Model {
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

export class UploadUmktParamsFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // file_id
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  // 场景策略id
  sceneStrategyId: number;
  // 预计执行时间，不设置则为立即执行
  execTime?: string;
  // 支持不同的文件模版：
  // MOBILE_MD5_WITH_MS_VARIABLE、MOBILE_MD5
  // 后续支持
  // DEVICE_MD5
  fileTemplate: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
      sceneStrategyId: 'scene_strategy_id',
      execTime: 'exec_time',
      fileTemplate: 'file_template',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
      sceneStrategyId: 'number',
      execTime: 'string',
      fileTemplate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadUmktParamsFileResponse extends $tea.Model {
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

export class BatchqueryUmktRtMarketingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 场景营销策略id
  sceneStrategyId: number;
  // 用户列表传输模版
  queryTemplate?: string;
  // 用户查询凭证列表
  customerKeys: string[];
  // 业务方流水号
  bizSerialNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      sceneStrategyId: 'scene_strategy_id',
      queryTemplate: 'query_template',
      customerKeys: 'customer_keys',
      bizSerialNo: 'biz_serial_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      sceneStrategyId: 'number',
      queryTemplate: 'string',
      customerKeys: { 'type': 'array', 'itemType': 'string' },
      bizSerialNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryUmktRtMarketingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 处理是否成功
  success?: boolean;
  // 实时营销单条结果
  queryResult?: CustomerUmktInfoModel[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      success: 'success',
      queryResult: 'query_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      success: 'boolean',
      queryResult: { 'type': 'array', 'itemType': CustomerUmktInfoModel },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncUmktRtEventresultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 详细事件明细
  detail: EventResultSyncDetail[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      detail: 'detail',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      detail: { 'type': 'array', 'itemType': EventResultSyncDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SyncUmktRtEventresultResponse extends $tea.Model {
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

export class ImportUmktSceneUploadRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需要刷新的key
  key: string;
  // 需要刷新的value，可能是json格式
  value: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      key: 'key',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      key: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportUmktSceneUploadResponse extends $tea.Model {
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

export class BatchqueryUmktRtTailmarketingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 营销计划id
  planId: number;
  // 	
  // 用户列表传输模版
  queryTemplate: string;
  // 	
  // 用户查询凭证列表
  customerKeys: string[];
  // 业务方流水号
  bizSerialNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      planId: 'plan_id',
      queryTemplate: 'query_template',
      customerKeys: 'customer_keys',
      bizSerialNo: 'biz_serial_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      planId: 'number',
      queryTemplate: 'string',
      customerKeys: { 'type': 'array', 'itemType': 'string' },
      bizSerialNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryUmktRtTailmarketingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 	
  // 实时营销单条结果
  queryResult?: CustomerUmktInfoModel[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      queryResult: 'query_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      queryResult: { 'type': 'array', 'itemType': CustomerUmktInfoModel },
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
          sdk_version: "1.10.5",
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
   * Description: 外部客户业务接入风控+，进行风险识别和风险决策。
   * Summary: 策略咨询服务输出
   */
  async querySecurityPolicy(request: QuerySecurityPolicyRequest): Promise<QuerySecurityPolicyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySecurityPolicyEx(request, headers, runtime);
  }

  /**
   * Description: 外部客户业务接入风控+，进行风险识别和风险决策。
   * Summary: 策略咨询服务输出
   */
  async querySecurityPolicyEx(request: QuerySecurityPolicyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySecurityPolicyResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySecurityPolicyResponse>(await this.doRequest("1.0", "riskplus.security.policy.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySecurityPolicyResponse({}));
  }

  /**
   * Description: 向风控发送异步安全数据
   * Summary: 异步发送安全数据
   */
  async sendSecurityData(request: SendSecurityDataRequest): Promise<SendSecurityDataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendSecurityDataEx(request, headers, runtime);
  }

  /**
   * Description: 向风控发送异步安全数据
   * Summary: 异步发送安全数据
   */
  async sendSecurityDataEx(request: SendSecurityDataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendSecurityDataResponse> {
    Util.validateModel(request);
    return $tea.cast<SendSecurityDataResponse>(await this.doRequest("1.0", "riskplus.security.data.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendSecurityDataResponse({}));
  }

  /**
   * Description: 外部客户业务接入蚂蚁风控，进行风险识别和风险决策输出核身后，进行二次确认
   * Summary: 安全策略确认服务输出
   */
  async confirmSecurityPolicy(request: ConfirmSecurityPolicyRequest): Promise<ConfirmSecurityPolicyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmSecurityPolicyEx(request, headers, runtime);
  }

  /**
   * Description: 外部客户业务接入蚂蚁风控，进行风险识别和风险决策输出核身后，进行二次确认
   * Summary: 安全策略确认服务输出
   */
  async confirmSecurityPolicyEx(request: ConfirmSecurityPolicyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmSecurityPolicyResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmSecurityPolicyResponse>(await this.doRequest("1.0", "riskplus.security.policy.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmSecurityPolicyResponse({}));
  }

  /**
   * Description: 外部客户业务接入风控+，进行人机识别判断。
   * Summary: 策略咨询服务输出
   */
  async checkSecurityRds(request: CheckSecurityRdsRequest): Promise<CheckSecurityRdsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkSecurityRdsEx(request, headers, runtime);
  }

  /**
   * Description: 外部客户业务接入风控+，进行人机识别判断。
   * Summary: 策略咨询服务输出
   */
  async checkSecurityRdsEx(request: CheckSecurityRdsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckSecurityRdsResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckSecurityRdsResponse>(await this.doRequest("1.0", "riskplus.security.rds.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckSecurityRdsResponse({}));
  }

  /**
   * Description: 外部客户业务接入风控+，请求安全数据如ip画像等。
   * Summary: 安全数据服务输出
   */
  async querySecurityData(request: QuerySecurityDataRequest): Promise<QuerySecurityDataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySecurityDataEx(request, headers, runtime);
  }

  /**
   * Description: 外部客户业务接入风控+，请求安全数据如ip画像等。
   * Summary: 安全数据服务输出
   */
  async querySecurityDataEx(request: QuerySecurityDataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySecurityDataResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySecurityDataResponse>(await this.doRequest("1.0", "riskplus.security.data.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySecurityDataResponse({}));
  }

  /**
   * Description: 外部客户数据校验接口，比如端防护
   * Summary: 安全数据服务校验
   */
  async checkSecurityData(request: CheckSecurityDataRequest): Promise<CheckSecurityDataResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkSecurityDataEx(request, headers, runtime);
  }

  /**
   * Description: 外部客户数据校验接口，比如端防护
   * Summary: 安全数据服务校验
   */
  async checkSecurityDataEx(request: CheckSecurityDataRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckSecurityDataResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckSecurityDataResponse>(await this.doRequest("1.0", "riskplus.security.data.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckSecurityDataResponse({}));
  }

  /**
   * Description: 反欺诈风险数据服务请求执行
   * Summary: 反欺诈风险数据服务请求执行
   */
  async execSecurityRiskdataservice(request: ExecSecurityRiskdataserviceRequest): Promise<ExecSecurityRiskdataserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execSecurityRiskdataserviceEx(request, headers, runtime);
  }

  /**
   * Description: 反欺诈风险数据服务请求执行
   * Summary: 反欺诈风险数据服务请求执行
   */
  async execSecurityRiskdataserviceEx(request: ExecSecurityRiskdataserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecSecurityRiskdataserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecSecurityRiskdataserviceResponse>(await this.doRequest("1.0", "riskplus.security.riskdataservice.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecSecurityRiskdataserviceResponse({}));
  }

  /**
   * Description: 天枢信贷业务系统线下测试环境测试接口
   * Summary: 天枢信贷业务系统线下测试接口
   */
  async queryDubheTest(request: QueryDubheTestRequest): Promise<QueryDubheTestResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubheTestEx(request, headers, runtime);
  }

  /**
   * Description: 天枢信贷业务系统线下测试环境测试接口
   * Summary: 天枢信贷业务系统线下测试接口
   */
  async queryDubheTestEx(request: QueryDubheTestRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubheTestResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubheTestResponse>(await this.doRequest("1.0", "riskplus.dubhe.test.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubheTestResponse({}));
  }

  /**
   * Description: 通过客户三要素信息查询资金方代码(资金路由)
   * Summary: 天枢系统资金方代码(资金路由)查询
   */
  async queryDubheRouterFundrouter(request: QueryDubheRouterFundrouterRequest): Promise<QueryDubheRouterFundrouterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubheRouterFundrouterEx(request, headers, runtime);
  }

  /**
   * Description: 通过客户三要素信息查询资金方代码(资金路由)
   * Summary: 天枢系统资金方代码(资金路由)查询
   */
  async queryDubheRouterFundrouterEx(request: QueryDubheRouterFundrouterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubheRouterFundrouterResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubheRouterFundrouterResponse>(await this.doRequest("1.0", "riskplus.dubhe.router.fundrouter.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubheRouterFundrouterResponse({}));
  }

  /**
   * Description: 天枢系统授信申请接口
   * Summary: 天枢系统授信申请接口
   */
  async applyDubheCredit(request: ApplyDubheCreditRequest): Promise<ApplyDubheCreditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyDubheCreditEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统授信申请接口
   * Summary: 天枢系统授信申请接口
   */
  async applyDubheCreditEx(request: ApplyDubheCreditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyDubheCreditResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyDubheCreditResponse>(await this.doRequest("1.0", "riskplus.dubhe.credit.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyDubheCreditResponse({}));
  }

  /**
   * Description: 天枢系统授信额度查询接口
   * Summary: 天枢系统授信额度查询接口
   */
  async queryDubheCreditStatus(request: QueryDubheCreditStatusRequest): Promise<QueryDubheCreditStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubheCreditStatusEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统授信额度查询接口
   * Summary: 天枢系统授信额度查询接口
   */
  async queryDubheCreditStatusEx(request: QueryDubheCreditStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubheCreditStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubheCreditStatusResponse>(await this.doRequest("1.0", "riskplus.dubhe.credit.status.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubheCreditStatusResponse({}));
  }

  /**
   * Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
   * Summary: 天枢系统还款计划试算
   */
  async countDubheRepayReftrial(request: CountDubheRepayReftrialRequest): Promise<CountDubheRepayReftrialResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.countDubheRepayReftrialEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
   * Summary: 天枢系统还款计划试算
   */
  async countDubheRepayReftrialEx(request: CountDubheRepayReftrialRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CountDubheRepayReftrialResponse> {
    Util.validateModel(request);
    return $tea.cast<CountDubheRepayReftrialResponse>(await this.doRequest("1.0", "riskplus.dubhe.repay.reftrial.count", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CountDubheRepayReftrialResponse({}));
  }

  /**
   * Description: 天枢系统还款计划查询，根据申请订单查询还款计划
   * Summary: 天枢系统还款计划查询
   */
  async queryDubheRepayList(request: QueryDubheRepayListRequest): Promise<QueryDubheRepayListResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubheRepayListEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统还款计划查询，根据申请订单查询还款计划
   * Summary: 天枢系统还款计划查询
   */
  async queryDubheRepayListEx(request: QueryDubheRepayListRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubheRepayListResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubheRepayListResponse>(await this.doRequest("1.0", "riskplus.dubhe.repay.list.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubheRepayListResponse({}));
  }

  /**
   * Description: 天枢系统用信申请接口
   * Summary: 天枢系统用信申请接口
   */
  async applyDubheUsecredit(request: ApplyDubheUsecreditRequest): Promise<ApplyDubheUsecreditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyDubheUsecreditEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统用信申请接口
   * Summary: 天枢系统用信申请接口
   */
  async applyDubheUsecreditEx(request: ApplyDubheUsecreditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyDubheUsecreditResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyDubheUsecreditResponse>(await this.doRequest("1.0", "riskplus.dubhe.usecredit.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyDubheUsecreditResponse({}));
  }

  /**
   * Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
   * Summary: 天枢系统用信申请状态查询
   */
  async queryDubheUsecreditStatus(request: QueryDubheUsecreditStatusRequest): Promise<QueryDubheUsecreditStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubheUsecreditStatusEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
   * Summary: 天枢系统用信申请状态查询
   */
  async queryDubheUsecreditStatusEx(request: QueryDubheUsecreditStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubheUsecreditStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubheUsecreditStatusResponse>(await this.doRequest("1.0", "riskplus.dubhe.usecredit.status.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubheUsecreditStatusResponse({}));
  }

  /**
   * Description: 天枢系统还款试算，根据借据号计算还款金额
   * Summary: 天枢系统还款试算
   */
  async countDubheRepayTrial(request: CountDubheRepayTrialRequest): Promise<CountDubheRepayTrialResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.countDubheRepayTrialEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统还款试算，根据借据号计算还款金额
   * Summary: 天枢系统还款试算
   */
  async countDubheRepayTrialEx(request: CountDubheRepayTrialRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CountDubheRepayTrialResponse> {
    Util.validateModel(request);
    return $tea.cast<CountDubheRepayTrialResponse>(await this.doRequest("1.0", "riskplus.dubhe.repay.trial.count", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CountDubheRepayTrialResponse({}));
  }

  /**
   * Description: 天枢系统主动还款（收银台）接口
   * Summary: 天枢系统主动还款（收银台）接口
   */
  async repayDubheRepayCheckstand(request: RepayDubheRepayCheckstandRequest): Promise<RepayDubheRepayCheckstandResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.repayDubheRepayCheckstandEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统主动还款（收银台）接口
   * Summary: 天枢系统主动还款（收银台）接口
   */
  async repayDubheRepayCheckstandEx(request: RepayDubheRepayCheckstandRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RepayDubheRepayCheckstandResponse> {
    Util.validateModel(request);
    return $tea.cast<RepayDubheRepayCheckstandResponse>(await this.doRequest("1.0", "riskplus.dubhe.repay.checkstand.repay", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RepayDubheRepayCheckstandResponse({}));
  }

  /**
   * Description: 天枢系统还款信息查询
   * Summary: 天枢系统还款信息查询
   */
  async queryDubheRepayInfo(request: QueryDubheRepayInfoRequest): Promise<QueryDubheRepayInfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubheRepayInfoEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统还款信息查询
   * Summary: 天枢系统还款信息查询
   */
  async queryDubheRepayInfoEx(request: QueryDubheRepayInfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubheRepayInfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubheRepayInfoResponse>(await this.doRequest("1.0", "riskplus.dubhe.repay.info.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubheRepayInfoResponse({}));
  }

  /**
   * Description: 天枢系统客户信息变更接口（变更客户三要素信息）
   * Summary: 天枢系统客户信息变更接口
   */
  async updateDubheCustomerInfo(request: UpdateDubheCustomerInfoRequest): Promise<UpdateDubheCustomerInfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateDubheCustomerInfoEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统客户信息变更接口（变更客户三要素信息）
   * Summary: 天枢系统客户信息变更接口
   */
  async updateDubheCustomerInfoEx(request: UpdateDubheCustomerInfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateDubheCustomerInfoResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDubheCustomerInfoResponse>(await this.doRequest("1.0", "riskplus.dubhe.customer.info.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateDubheCustomerInfoResponse({}));
  }

  /**
   * Description: 天枢系统协议签约申请(支付宝
   * Summary: 天枢系统协议签约申请(支付宝)
   */
  async applyDubheCustomerAgreementsign(request: ApplyDubheCustomerAgreementsignRequest): Promise<ApplyDubheCustomerAgreementsignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyDubheCustomerAgreementsignEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统协议签约申请(支付宝
   * Summary: 天枢系统协议签约申请(支付宝)
   */
  async applyDubheCustomerAgreementsignEx(request: ApplyDubheCustomerAgreementsignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyDubheCustomerAgreementsignResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyDubheCustomerAgreementsignResponse>(await this.doRequest("1.0", "riskplus.dubhe.customer.agreementsign.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyDubheCustomerAgreementsignResponse({}));
  }

  /**
   * Description: 天枢系统协议签约查询(支付宝)
   * Summary: 天枢系统协议签约查询(支付宝)
   */
  async queryDubheCustomerAgreementsign(request: QueryDubheCustomerAgreementsignRequest): Promise<QueryDubheCustomerAgreementsignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubheCustomerAgreementsignEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统协议签约查询(支付宝)
   * Summary: 天枢系统协议签约查询(支付宝)
   */
  async queryDubheCustomerAgreementsignEx(request: QueryDubheCustomerAgreementsignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubheCustomerAgreementsignResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubheCustomerAgreementsignResponse>(await this.doRequest("1.0", "riskplus.dubhe.customer.agreementsign.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubheCustomerAgreementsignResponse({}));
  }

  /**
   * Description: 天枢信贷业务系统主动还款（直接代扣）接口
   * Summary: 天枢信贷业务系统主动还款（直接代扣）接口
   */
  async repayDubheRepayWithhold(request: RepayDubheRepayWithholdRequest): Promise<RepayDubheRepayWithholdResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.repayDubheRepayWithholdEx(request, headers, runtime);
  }

  /**
   * Description: 天枢信贷业务系统主动还款（直接代扣）接口
   * Summary: 天枢信贷业务系统主动还款（直接代扣）接口
   */
  async repayDubheRepayWithholdEx(request: RepayDubheRepayWithholdRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RepayDubheRepayWithholdResponse> {
    Util.validateModel(request);
    return $tea.cast<RepayDubheRepayWithholdResponse>(await this.doRequest("1.0", "riskplus.dubhe.repay.withhold.repay", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RepayDubheRepayWithholdResponse({}));
  }

  /**
   * Description: 天枢系统合同获取
   * Summary: 天枢系统合同获取
   */
  async queryDubheSearchContract(request: QueryDubheSearchContractRequest): Promise<QueryDubheSearchContractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubheSearchContractEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统合同获取
   * Summary: 天枢系统合同获取
   */
  async queryDubheSearchContractEx(request: QueryDubheSearchContractRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubheSearchContractResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubheSearchContractResponse>(await this.doRequest("1.0", "riskplus.dubhe.search.contract.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubheSearchContractResponse({}));
  }

  /**
   * Description: 天枢逾期信息查询接口
   * Summary: 逾期信息查询
   */
  async queryDubheReceiptOverdue(request: QueryDubheReceiptOverdueRequest): Promise<QueryDubheReceiptOverdueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubheReceiptOverdueEx(request, headers, runtime);
  }

  /**
   * Description: 天枢逾期信息查询接口
   * Summary: 逾期信息查询
   */
  async queryDubheReceiptOverdueEx(request: QueryDubheReceiptOverdueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubheReceiptOverdueResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubheReceiptOverdueResponse>(await this.doRequest("1.0", "riskplus.dubhe.receipt.overdue.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubheReceiptOverdueResponse({}));
  }

  /**
   * Description: 天枢发送短信接口，适用于一个模板相同参数
   * Summary: 天枢发送短信接口
   */
  async sendDubbridgeSms(request: SendDubbridgeSmsRequest): Promise<SendDubbridgeSmsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendDubbridgeSmsEx(request, headers, runtime);
  }

  /**
   * Description: 天枢发送短信接口，适用于一个模板相同参数
   * Summary: 天枢发送短信接口
   */
  async sendDubbridgeSmsEx(request: SendDubbridgeSmsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendDubbridgeSmsResponse> {
    Util.validateModel(request);
    return $tea.cast<SendDubbridgeSmsResponse>(await this.doRequest("1.0", "riskplus.dubbridge.sms.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendDubbridgeSmsResponse({}));
  }

  /**
   * Description: 天枢批量发送短信接口，适合一个短信模板多个不同参数场景
   * Summary: 天枢批量发送短信接口
   */
  async sendDubbridgeSmsBatch(request: SendDubbridgeSmsBatchRequest): Promise<SendDubbridgeSmsBatchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendDubbridgeSmsBatchEx(request, headers, runtime);
  }

  /**
   * Description: 天枢批量发送短信接口，适合一个短信模板多个不同参数场景
   * Summary: 天枢批量发送短信接口
   */
  async sendDubbridgeSmsBatchEx(request: SendDubbridgeSmsBatchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendDubbridgeSmsBatchResponse> {
    Util.validateModel(request);
    return $tea.cast<SendDubbridgeSmsBatchResponse>(await this.doRequest("1.0", "riskplus.dubbridge.sms.batch.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendDubbridgeSmsBatchResponse({}));
  }

  /**
   * Description: 资金路由接口，获取资金方编号
   * Summary: 天枢系统资金方代码(资金路由)查询
   */
  async queryDubbridgeRouterFundrouter(request: QueryDubbridgeRouterFundrouterRequest): Promise<QueryDubbridgeRouterFundrouterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeRouterFundrouterEx(request, headers, runtime);
  }

  /**
   * Description: 资金路由接口，获取资金方编号
   * Summary: 天枢系统资金方代码(资金路由)查询
   */
  async queryDubbridgeRouterFundrouterEx(request: QueryDubbridgeRouterFundrouterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeRouterFundrouterResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeRouterFundrouterResponse>(await this.doRequest("1.0", "riskplus.dubbridge.router.fundrouter.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeRouterFundrouterResponse({}));
  }

  /**
   * Description: 天枢系统授信申请接口
   * Summary: 天枢系统授信申请接口
   */
  async applyDubbridgeCredit(request: ApplyDubbridgeCreditRequest): Promise<ApplyDubbridgeCreditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyDubbridgeCreditEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统授信申请接口
   * Summary: 天枢系统授信申请接口
   */
  async applyDubbridgeCreditEx(request: ApplyDubbridgeCreditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyDubbridgeCreditResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyDubbridgeCreditResponse>(await this.doRequest("1.0", "riskplus.dubbridge.credit.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyDubbridgeCreditResponse({}));
  }

  /**
   * Description: 为流量方提供文件上传接口，用于申请件影像资料上传
   * Summary: 天枢文件上传
   */
  async uploadDubbridgeFile(request: UploadDubbridgeFileRequest): Promise<UploadDubbridgeFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadDubbridgeFileEx(request, headers, runtime);
  }

  /**
   * Description: 为流量方提供文件上传接口，用于申请件影像资料上传
   * Summary: 天枢文件上传
   */
  async uploadDubbridgeFileEx(request: UploadDubbridgeFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadDubbridgeFileResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "riskplus.dubbridge.file.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadDubbridgeFileResponse = new UploadDubbridgeFileResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadDubbridgeFileResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
    }

    Util.validateModel(request);
    return $tea.cast<UploadDubbridgeFileResponse>(await this.doRequest("1.0", "riskplus.dubbridge.file.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadDubbridgeFileResponse({}));
  }

  /**
   * Description: 代扣签约绑卡接口
   * Summary: 代扣协议签约申请(银行卡绑卡)
   */
  async bindDubbridgeCustomerBankcard(request: BindDubbridgeCustomerBankcardRequest): Promise<BindDubbridgeCustomerBankcardResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.bindDubbridgeCustomerBankcardEx(request, headers, runtime);
  }

  /**
   * Description: 代扣签约绑卡接口
   * Summary: 代扣协议签约申请(银行卡绑卡)
   */
  async bindDubbridgeCustomerBankcardEx(request: BindDubbridgeCustomerBankcardRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BindDubbridgeCustomerBankcardResponse> {
    Util.validateModel(request);
    return $tea.cast<BindDubbridgeCustomerBankcardResponse>(await this.doRequest("1.0", "riskplus.dubbridge.customer.bankcard.bind", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BindDubbridgeCustomerBankcardResponse({}));
  }

  /**
   * Description: 代扣协议签约提交(银行卡绑卡)
   * Summary: 代扣协议签约校验(银行卡绑卡)
   */
  async verifyDubbridgeCustomerBankcard(request: VerifyDubbridgeCustomerBankcardRequest): Promise<VerifyDubbridgeCustomerBankcardResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyDubbridgeCustomerBankcardEx(request, headers, runtime);
  }

  /**
   * Description: 代扣协议签约提交(银行卡绑卡)
   * Summary: 代扣协议签约校验(银行卡绑卡)
   */
  async verifyDubbridgeCustomerBankcardEx(request: VerifyDubbridgeCustomerBankcardRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyDubbridgeCustomerBankcardResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyDubbridgeCustomerBankcardResponse>(await this.doRequest("1.0", "riskplus.dubbridge.customer.bankcard.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyDubbridgeCustomerBankcardResponse({}));
  }

  /**
   * Description: 用于机构通道通用回调
   * Summary: 机构通道回调通用接口
   */
  async notifyDubbridgeDefininnerchannel(request: NotifyDubbridgeDefininnerchannelRequest): Promise<NotifyDubbridgeDefininnerchannelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.notifyDubbridgeDefininnerchannelEx(request, headers, runtime);
  }

  /**
   * Description: 用于机构通道通用回调
   * Summary: 机构通道回调通用接口
   */
  async notifyDubbridgeDefininnerchannelEx(request: NotifyDubbridgeDefininnerchannelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<NotifyDubbridgeDefininnerchannelResponse> {
    Util.validateModel(request);
    return $tea.cast<NotifyDubbridgeDefininnerchannelResponse>(await this.doRequest("1.0", "riskplus.dubbridge.defininnerchannel.notify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new NotifyDubbridgeDefininnerchannelResponse({}));
  }

  /**
   * Description: 天枢系统授信额度查询接口
   * Summary: 天枢系统授信额度查询接口
   */
  async queryDubbridgeCreditStatus(request: QueryDubbridgeCreditStatusRequest): Promise<QueryDubbridgeCreditStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeCreditStatusEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统授信额度查询接口
   * Summary: 天枢系统授信额度查询接口
   */
  async queryDubbridgeCreditStatusEx(request: QueryDubbridgeCreditStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeCreditStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeCreditStatusResponse>(await this.doRequest("1.0", "riskplus.dubbridge.credit.status.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeCreditStatusResponse({}));
  }

  /**
   * Description: 天枢系统企业小微分查询
   * Summary: 天枢系统企业小微分查询
   */
  async queryDubbridgeRiskinfoEnterprisescore(request: QueryDubbridgeRiskinfoEnterprisescoreRequest): Promise<QueryDubbridgeRiskinfoEnterprisescoreResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeRiskinfoEnterprisescoreEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统企业小微分查询
   * Summary: 天枢系统企业小微分查询
   */
  async queryDubbridgeRiskinfoEnterprisescoreEx(request: QueryDubbridgeRiskinfoEnterprisescoreRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeRiskinfoEnterprisescoreResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeRiskinfoEnterprisescoreResponse>(await this.doRequest("1.0", "riskplus.dubbridge.riskinfo.enterprisescore.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeRiskinfoEnterprisescoreResponse({}));
  }

  /**
   * Description: 天枢系统风控信息通用查询
   * Summary: 天枢系统风控信息通用查询
   */
  async queryDubbridgeRiskinfoCommon(request: QueryDubbridgeRiskinfoCommonRequest): Promise<QueryDubbridgeRiskinfoCommonResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeRiskinfoCommonEx(request, headers, runtime);
  }

  /**
   * Description: 天枢系统风控信息通用查询
   * Summary: 天枢系统风控信息通用查询
   */
  async queryDubbridgeRiskinfoCommonEx(request: QueryDubbridgeRiskinfoCommonRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeRiskinfoCommonResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeRiskinfoCommonResponse>(await this.doRequest("1.0", "riskplus.dubbridge.riskinfo.common.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeRiskinfoCommonResponse({}));
  }

  /**
   * Description: 额度、利率、状态调整
   * Summary: 调额申请
   */
  async updateDubbridgeInstitutionCredit(request: UpdateDubbridgeInstitutionCreditRequest): Promise<UpdateDubbridgeInstitutionCreditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateDubbridgeInstitutionCreditEx(request, headers, runtime);
  }

  /**
   * Description: 额度、利率、状态调整
   * Summary: 调额申请
   */
  async updateDubbridgeInstitutionCreditEx(request: UpdateDubbridgeInstitutionCreditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateDubbridgeInstitutionCreditResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDubbridgeInstitutionCreditResponse>(await this.doRequest("1.0", "riskplus.dubbridge.institution.credit.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateDubbridgeInstitutionCreditResponse({}));
  }

  /**
   * Description: 天枢企业经营数据查询
   * Summary: 天枢企业经营数据查询
   */
  async queryDubbridgeRiskinfoBusinessinfo(request: QueryDubbridgeRiskinfoBusinessinfoRequest): Promise<QueryDubbridgeRiskinfoBusinessinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryDubbridgeRiskinfoBusinessinfoEx(request, headers, runtime);
  }

  /**
   * Description: 天枢企业经营数据查询
   * Summary: 天枢企业经营数据查询
   */
  async queryDubbridgeRiskinfoBusinessinfoEx(request: QueryDubbridgeRiskinfoBusinessinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryDubbridgeRiskinfoBusinessinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDubbridgeRiskinfoBusinessinfoResponse>(await this.doRequest("1.0", "riskplus.dubbridge.riskinfo.businessinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryDubbridgeRiskinfoBusinessinfoResponse({}));
  }

  /**
   * Description: 四要素认证首先调用此接口
   * Summary: 芝麻四要素接口
   */
  async verifyFinserviceZhimaIdentify(request: VerifyFinserviceZhimaIdentifyRequest): Promise<VerifyFinserviceZhimaIdentifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyFinserviceZhimaIdentifyEx(request, headers, runtime);
  }

  /**
   * Description: 四要素认证首先调用此接口
   * Summary: 芝麻四要素接口
   */
  async verifyFinserviceZhimaIdentifyEx(request: VerifyFinserviceZhimaIdentifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyFinserviceZhimaIdentifyResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyFinserviceZhimaIdentifyResponse>(await this.doRequest("1.0", "riskplus.finservice.zhima.identify.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyFinserviceZhimaIdentifyResponse({}));
  }

  /**
   * Description:  
   * Summary: 芝麻四要素认证结果查询
   */
  async queryFinserviceZhimaIdentify(request: QueryFinserviceZhimaIdentifyRequest): Promise<QueryFinserviceZhimaIdentifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryFinserviceZhimaIdentifyEx(request, headers, runtime);
  }

  /**
   * Description:  
   * Summary: 芝麻四要素认证结果查询
   */
  async queryFinserviceZhimaIdentifyEx(request: QueryFinserviceZhimaIdentifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryFinserviceZhimaIdentifyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryFinserviceZhimaIdentifyResponse>(await this.doRequest("1.0", "riskplus.finservice.zhima.identify.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryFinserviceZhimaIdentifyResponse({}));
  }

  /**
   * Description: 多源融合平台的数据服务查询接口
   * Summary: 多源融合平台的数据服务查询接口
   */
  async queryMdipDataservice(request: QueryMdipDataserviceRequest): Promise<QueryMdipDataserviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMdipDataserviceEx(request, headers, runtime);
  }

  /**
   * Description: 多源融合平台的数据服务查询接口
   * Summary: 多源融合平台的数据服务查询接口
   */
  async queryMdipDataserviceEx(request: QueryMdipDataserviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMdipDataserviceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMdipDataserviceResponse>(await this.doRequest("1.0", "riskplus.mdip.dataservice.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMdipDataserviceResponse({}));
  }

  /**
   * Description: 风险大脑企业版通用查询接口
   * Summary: 【已废弃】
   */
  async queryRbbGenericInvoke(request: QueryRbbGenericInvokeRequest): Promise<QueryRbbGenericInvokeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRbbGenericInvokeEx(request, headers, runtime);
  }

  /**
   * Description: 风险大脑企业版通用查询接口
   * Summary: 【已废弃】
   */
  async queryRbbGenericInvokeEx(request: QueryRbbGenericInvokeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRbbGenericInvokeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRbbGenericInvokeResponse>(await this.doRequest("1.0", "riskplus.rbb.generic.invoke.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRbbGenericInvokeResponse({}));
  }

  /**
   * Description: 风险大脑企业版token生成
   * Summary: 【已废弃】
   */
  async createRbbToken(request: CreateRbbTokenRequest): Promise<CreateRbbTokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createRbbTokenEx(request, headers, runtime);
  }

  /**
   * Description: 风险大脑企业版token生成
   * Summary: 【已废弃】
   */
  async createRbbTokenEx(request: CreateRbbTokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateRbbTokenResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateRbbTokenResponse>(await this.doRequest("1.0", "riskplus.rbb.token.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateRbbTokenResponse({}));
  }

  /**
   * Description: 获取风险大脑企业版登录token
   * Summary: 【已废弃】
   */
  async createRbbApiGwtoken(request: CreateRbbApiGwtokenRequest): Promise<CreateRbbApiGwtokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createRbbApiGwtokenEx(request, headers, runtime);
  }

  /**
   * Description: 获取风险大脑企业版登录token
   * Summary: 【已废弃】
   */
  async createRbbApiGwtokenEx(request: CreateRbbApiGwtokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateRbbApiGwtokenResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateRbbApiGwtokenResponse>(await this.doRequest("1.0", "riskplus.rbb.api.gwtoken.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateRbbApiGwtokenResponse({}));
  }

  /**
   * Description: 风险大脑企业版通用查询OpenAPI
   * Summary: 风险大脑企业版通用查询OpenAPI
   */
  async queryRbbGeneral(request: QueryRbbGeneralRequest): Promise<QueryRbbGeneralResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRbbGeneralEx(request, headers, runtime);
  }

  /**
   * Description: 风险大脑企业版通用查询OpenAPI
   * Summary: 风险大脑企业版通用查询OpenAPI
   */
  async queryRbbGeneralEx(request: QueryRbbGeneralRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRbbGeneralResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRbbGeneralResponse>(await this.doRequest("1.0", "riskplus.rbb.general.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRbbGeneralResponse({}));
  }

  /**
   * Description: 获取登录Token
   * Summary: 获取登录Token
   */
  async getRbbLoginToken(request: GetRbbLoginTokenRequest): Promise<GetRbbLoginTokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getRbbLoginTokenEx(request, headers, runtime);
  }

  /**
   * Description: 获取登录Token
   * Summary: 获取登录Token
   */
  async getRbbLoginTokenEx(request: GetRbbLoginTokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetRbbLoginTokenResponse> {
    Util.validateModel(request);
    return $tea.cast<GetRbbLoginTokenResponse>(await this.doRequest("1.0", "riskplus.rbb.login.token.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetRbbLoginTokenResponse({}));
  }

  /**
   * Description: 风险大脑企业版创建租户
   * Summary: 风险大脑企业版创建租户
   */
  async createRbbTenant(request: CreateRbbTenantRequest): Promise<CreateRbbTenantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createRbbTenantEx(request, headers, runtime);
  }

  /**
   * Description: 风险大脑企业版创建租户
   * Summary: 风险大脑企业版创建租户
   */
  async createRbbTenantEx(request: CreateRbbTenantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateRbbTenantResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateRbbTenantResponse>(await this.doRequest("1.0", "riskplus.rbb.tenant.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateRbbTenantResponse({}));
  }

  /**
   * Description: 风险大脑企业版创建用户
   * Summary: 风险大脑企业版创建用户
   */
  async createRbbUser(request: CreateRbbUserRequest): Promise<CreateRbbUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createRbbUserEx(request, headers, runtime);
  }

  /**
   * Description: 风险大脑企业版创建用户
   * Summary: 风险大脑企业版创建用户
   */
  async createRbbUserEx(request: CreateRbbUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateRbbUserResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateRbbUserResponse>(await this.doRequest("1.0", "riskplus.rbb.user.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateRbbUserResponse({}));
  }

  /**
   * Description: 企业准入接口
   * Summary: 企业准入
   */
  async execRbbCompanyGuard(request: ExecRbbCompanyGuardRequest): Promise<ExecRbbCompanyGuardResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execRbbCompanyGuardEx(request, headers, runtime);
  }

  /**
   * Description: 企业准入接口
   * Summary: 企业准入
   */
  async execRbbCompanyGuardEx(request: ExecRbbCompanyGuardRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecRbbCompanyGuardResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecRbbCompanyGuardResponse>(await this.doRequest("1.0", "riskplus.rbb.company.guard.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecRbbCompanyGuardResponse({}));
  }

  /**
   * Description: 提交授信申请
   * Summary: 企业授信申请
   */
  async applyRbbCompanyCredit(request: ApplyRbbCompanyCreditRequest): Promise<ApplyRbbCompanyCreditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyRbbCompanyCreditEx(request, headers, runtime);
  }

  /**
   * Description: 提交授信申请
   * Summary: 企业授信申请
   */
  async applyRbbCompanyCreditEx(request: ApplyRbbCompanyCreditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyRbbCompanyCreditResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyRbbCompanyCreditResponse>(await this.doRequest("1.0", "riskplus.rbb.company.credit.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyRbbCompanyCreditResponse({}));
  }

  /**
   * Description: 查询企业授信结果
   * Summary: 企业授信结果查询
   */
  async queryRbbCompanyCredit(request: QueryRbbCompanyCreditRequest): Promise<QueryRbbCompanyCreditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRbbCompanyCreditEx(request, headers, runtime);
  }

  /**
   * Description: 查询企业授信结果
   * Summary: 企业授信结果查询
   */
  async queryRbbCompanyCreditEx(request: QueryRbbCompanyCreditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRbbCompanyCreditResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRbbCompanyCreditResponse>(await this.doRequest("1.0", "riskplus.rbb.company.credit.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRbbCompanyCreditResponse({}));
  }

  /**
   * Description: 风险大脑-上交所数据离线同步数据准备状态，上交所本地部署鹰眼项目需要获取离线数据是否准备好的信息
   * Summary: 风险大脑-上交所数据离线同步数据准备状态
   */
  async queryRbbRegdatasyncPrepared(request: QueryRbbRegdatasyncPreparedRequest): Promise<QueryRbbRegdatasyncPreparedResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRbbRegdatasyncPreparedEx(request, headers, runtime);
  }

  /**
   * Description: 风险大脑-上交所数据离线同步数据准备状态，上交所本地部署鹰眼项目需要获取离线数据是否准备好的信息
   * Summary: 风险大脑-上交所数据离线同步数据准备状态
   */
  async queryRbbRegdatasyncPreparedEx(request: QueryRbbRegdatasyncPreparedRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRbbRegdatasyncPreparedResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRbbRegdatasyncPreparedResponse>(await this.doRequest("1.0", "riskplus.rbb.regdatasync.prepared.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRbbRegdatasyncPreparedResponse({}));
  }

  /**
   * Description: 风险大脑-上交所数据离线同步数据开始通知标识
   * Summary: 风险大脑-上交所数据离线同步数据开始通知
   */
  async startRbbRegdatasyncSchedule(request: StartRbbRegdatasyncScheduleRequest): Promise<StartRbbRegdatasyncScheduleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startRbbRegdatasyncScheduleEx(request, headers, runtime);
  }

  /**
   * Description: 风险大脑-上交所数据离线同步数据开始通知标识
   * Summary: 风险大脑-上交所数据离线同步数据开始通知
   */
  async startRbbRegdatasyncScheduleEx(request: StartRbbRegdatasyncScheduleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartRbbRegdatasyncScheduleResponse> {
    Util.validateModel(request);
    return $tea.cast<StartRbbRegdatasyncScheduleResponse>(await this.doRequest("1.0", "riskplus.rbb.regdatasync.schedule.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartRbbRegdatasyncScheduleResponse({}));
  }

  /**
   * Description: 风险大脑-上交所数据离线同步数据完成记录 记录完成的状态
   * Summary: 风险大脑-上交所数据离线同步数据完成记录
   */
  async finishRbbRegdatasyncSchedule(request: FinishRbbRegdatasyncScheduleRequest): Promise<FinishRbbRegdatasyncScheduleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.finishRbbRegdatasyncScheduleEx(request, headers, runtime);
  }

  /**
   * Description: 风险大脑-上交所数据离线同步数据完成记录 记录完成的状态
   * Summary: 风险大脑-上交所数据离线同步数据完成记录
   */
  async finishRbbRegdatasyncScheduleEx(request: FinishRbbRegdatasyncScheduleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<FinishRbbRegdatasyncScheduleResponse> {
    Util.validateModel(request);
    return $tea.cast<FinishRbbRegdatasyncScheduleResponse>(await this.doRequest("1.0", "riskplus.rbb.regdatasync.schedule.finish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new FinishRbbRegdatasyncScheduleResponse({}));
  }

  /**
   * Description: 获取签约接口
   * Summary: 获取签约接口
   */
  async queryRpgwSignUrl(request: QueryRpgwSignUrlRequest): Promise<QueryRpgwSignUrlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRpgwSignUrlEx(request, headers, runtime);
  }

  /**
   * Description: 获取签约接口
   * Summary: 获取签约接口
   */
  async queryRpgwSignUrlEx(request: QueryRpgwSignUrlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRpgwSignUrlResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRpgwSignUrlResponse>(await this.doRequest("1.0", "riskplus.rpgw.sign.url.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRpgwSignUrlResponse({}));
  }

  /**
   * Description: 创建报税用户接口
   * Summary: 创建报税用户接口
   */
  async registerRpgwUserEinvoice(request: RegisterRpgwUserEinvoiceRequest): Promise<RegisterRpgwUserEinvoiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.registerRpgwUserEinvoiceEx(request, headers, runtime);
  }

  /**
   * Description: 创建报税用户接口
   * Summary: 创建报税用户接口
   */
  async registerRpgwUserEinvoiceEx(request: RegisterRpgwUserEinvoiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RegisterRpgwUserEinvoiceResponse> {
    Util.validateModel(request);
    return $tea.cast<RegisterRpgwUserEinvoiceResponse>(await this.doRequest("1.0", "riskplus.rpgw.user.einvoice.register", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RegisterRpgwUserEinvoiceResponse({}));
  }

  /**
   * Description: 查询签约接口
   * Summary: 获取签约接口
   */
  async queryRpgwUserSignurl(request: QueryRpgwUserSignurlRequest): Promise<QueryRpgwUserSignurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRpgwUserSignurlEx(request, headers, runtime);
  }

  /**
   * Description: 查询签约接口
   * Summary: 获取签约接口
   */
  async queryRpgwUserSignurlEx(request: QueryRpgwUserSignurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRpgwUserSignurlResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRpgwUserSignurlResponse>(await this.doRequest("1.0", "riskplus.rpgw.user.signurl.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRpgwUserSignurlResponse({}));
  }

  /**
   * Description: 提现
   * Summary: 提现
   */
  async withdrawRpgwUserCommission(request: WithdrawRpgwUserCommissionRequest): Promise<WithdrawRpgwUserCommissionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.withdrawRpgwUserCommissionEx(request, headers, runtime);
  }

  /**
   * Description: 提现
   * Summary: 提现
   */
  async withdrawRpgwUserCommissionEx(request: WithdrawRpgwUserCommissionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<WithdrawRpgwUserCommissionResponse> {
    Util.validateModel(request);
    return $tea.cast<WithdrawRpgwUserCommissionResponse>(await this.doRequest("1.0", "riskplus.rpgw.user.commission.withdraw", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new WithdrawRpgwUserCommissionResponse({}));
  }

  /**
   * Description: 信息同步
   * Summary: 下单等信息同步
   */
  async syncRpgwUserOrderinfo(request: SyncRpgwUserOrderinfoRequest): Promise<SyncRpgwUserOrderinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncRpgwUserOrderinfoEx(request, headers, runtime);
  }

  /**
   * Description: 信息同步
   * Summary: 下单等信息同步
   */
  async syncRpgwUserOrderinfoEx(request: SyncRpgwUserOrderinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncRpgwUserOrderinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncRpgwUserOrderinfoResponse>(await this.doRequest("1.0", "riskplus.rpgw.user.orderinfo.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncRpgwUserOrderinfoResponse({}));
  }

  /**
   * Description: 签约结果通知
   * Summary: 签约结果通知
   */
  async notifyRpgwUserSignresult(request: NotifyRpgwUserSignresultRequest): Promise<NotifyRpgwUserSignresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.notifyRpgwUserSignresultEx(request, headers, runtime);
  }

  /**
   * Description: 签约结果通知
   * Summary: 签约结果通知
   */
  async notifyRpgwUserSignresultEx(request: NotifyRpgwUserSignresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<NotifyRpgwUserSignresultResponse> {
    Util.validateModel(request);
    return $tea.cast<NotifyRpgwUserSignresultResponse>(await this.doRequest("1.0", "riskplus.rpgw.user.signresult.notify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new NotifyRpgwUserSignresultResponse({}));
  }

  /**
   * Description: 查询所在地的负面舆情企业列表
   * Summary: 查询所在地的负面舆情企业列表
   */
  async queryRtopCompanyOpinion(request: QueryRtopCompanyOpinionRequest): Promise<QueryRtopCompanyOpinionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopCompanyOpinionEx(request, headers, runtime);
  }

  /**
   * Description: 查询所在地的负面舆情企业列表
   * Summary: 查询所在地的负面舆情企业列表
   */
  async queryRtopCompanyOpinionEx(request: QueryRtopCompanyOpinionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopCompanyOpinionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopCompanyOpinionResponse>(await this.doRequest("1.0", "riskplus.rtop.company.opinion.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopCompanyOpinionResponse({}));
  }

  /**
   * Description: 查询企业的舆情详情信息
   * Summary: 查询企业的舆情详情信息
   */
  async listRtopCompanyOpinions(request: ListRtopCompanyOpinionsRequest): Promise<ListRtopCompanyOpinionsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listRtopCompanyOpinionsEx(request, headers, runtime);
  }

  /**
   * Description: 查询企业的舆情详情信息
   * Summary: 查询企业的舆情详情信息
   */
  async listRtopCompanyOpinionsEx(request: ListRtopCompanyOpinionsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListRtopCompanyOpinionsResponse> {
    Util.validateModel(request);
    return $tea.cast<ListRtopCompanyOpinionsResponse>(await this.doRequest("1.0", "riskplus.rtop.company.opinions.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListRtopCompanyOpinionsResponse({}));
  }

  /**
   * Description: 查询监测企业的详情
   * Summary: 查询监测企业的详情
   */
  async getRtopCompanyMonitor(request: GetRtopCompanyMonitorRequest): Promise<GetRtopCompanyMonitorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getRtopCompanyMonitorEx(request, headers, runtime);
  }

  /**
   * Description: 查询监测企业的详情
   * Summary: 查询监测企业的详情
   */
  async getRtopCompanyMonitorEx(request: GetRtopCompanyMonitorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetRtopCompanyMonitorResponse> {
    Util.validateModel(request);
    return $tea.cast<GetRtopCompanyMonitorResponse>(await this.doRequest("1.0", "riskplus.rtop.company.monitor.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetRtopCompanyMonitorResponse({}));
  }

  /**
   * Description: 查询所在地的涉众风险企业统计信息
   * Summary: 查询所在地的涉众风险企业统计信息
   */
  async queryRtopCrowdriskStatistic(request: QueryRtopCrowdriskStatisticRequest): Promise<QueryRtopCrowdriskStatisticResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopCrowdriskStatisticEx(request, headers, runtime);
  }

  /**
   * Description: 查询所在地的涉众风险企业统计信息
   * Summary: 查询所在地的涉众风险企业统计信息
   */
  async queryRtopCrowdriskStatisticEx(request: QueryRtopCrowdriskStatisticRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopCrowdriskStatisticResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopCrowdriskStatisticResponse>(await this.doRequest("1.0", "riskplus.rtop.crowdrisk.statistic.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopCrowdriskStatisticResponse({}));
  }

  /**
   * Description: 查询涉众风险企业的列表
   * Summary: 查询涉众风险企业的列表
   */
  async listRtopCrowdrisk(request: ListRtopCrowdriskRequest): Promise<ListRtopCrowdriskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listRtopCrowdriskEx(request, headers, runtime);
  }

  /**
   * Description: 查询涉众风险企业的列表
   * Summary: 查询涉众风险企业的列表
   */
  async listRtopCrowdriskEx(request: ListRtopCrowdriskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListRtopCrowdriskResponse> {
    Util.validateModel(request);
    return $tea.cast<ListRtopCrowdriskResponse>(await this.doRequest("1.0", "riskplus.rtop.crowdrisk.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListRtopCrowdriskResponse({}));
  }

  /**
   * Description: 查询涉众风险企业的详细信息
   * Summary: 查询涉众风险企业的详细信息
   */
  async queryRtopCrowdriskDetail(request: QueryRtopCrowdriskDetailRequest): Promise<QueryRtopCrowdriskDetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopCrowdriskDetailEx(request, headers, runtime);
  }

  /**
   * Description: 查询涉众风险企业的详细信息
   * Summary: 查询涉众风险企业的详细信息
   */
  async queryRtopCrowdriskDetailEx(request: QueryRtopCrowdriskDetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopCrowdriskDetailResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopCrowdriskDetailResponse>(await this.doRequest("1.0", "riskplus.rtop.crowdrisk.detail.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopCrowdriskDetailResponse({}));
  }

  /**
   * Description: 查询风报的详细信息
   * Summary: 查询风报的详细信息
   */
  async queryRtopRiskstorm(request: QueryRtopRiskstormRequest): Promise<QueryRtopRiskstormResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopRiskstormEx(request, headers, runtime);
  }

  /**
   * Description: 查询风报的详细信息
   * Summary: 查询风报的详细信息
   */
  async queryRtopRiskstormEx(request: QueryRtopRiskstormRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopRiskstormResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopRiskstormResponse>(await this.doRequest("1.0", "riskplus.rtop.riskstorm.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopRiskstormResponse({}));
  }

  /**
   * Description: 监管涉众风险指定的一批企业的影响人数之和、影响金额之和
   * Summary: 监管涉众风险一批企业的影响人数影响金额
   */
  async queryRtopCrowdriskSum(request: QueryRtopCrowdriskSumRequest): Promise<QueryRtopCrowdriskSumResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopCrowdriskSumEx(request, headers, runtime);
  }

  /**
   * Description: 监管涉众风险指定的一批企业的影响人数之和、影响金额之和
   * Summary: 监管涉众风险一批企业的影响人数影响金额
   */
  async queryRtopCrowdriskSumEx(request: QueryRtopCrowdriskSumRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopCrowdriskSumResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopCrowdriskSumResponse>(await this.doRequest("1.0", "riskplus.rtop.crowdrisk.sum.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopCrowdriskSumResponse({}));
  }

  /**
   * Description: 监管企业详情获取，包括风险分数、风险标签。
   * Summary: 监管企业详情获取
   */
  async getRtopCompanyDetail(request: GetRtopCompanyDetailRequest): Promise<GetRtopCompanyDetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getRtopCompanyDetailEx(request, headers, runtime);
  }

  /**
   * Description: 监管企业详情获取，包括风险分数、风险标签。
   * Summary: 监管企业详情获取
   */
  async getRtopCompanyDetailEx(request: GetRtopCompanyDetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetRtopCompanyDetailResponse> {
    Util.validateModel(request);
    return $tea.cast<GetRtopCompanyDetailResponse>(await this.doRequest("1.0", "riskplus.rtop.company.detail.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetRtopCompanyDetailResponse({}));
  }

  /**
   * Description: 企业风险查询接口
   * Summary: 企业风险查询接口
   */
  async queryRtopCompanyRiskinfo(request: QueryRtopCompanyRiskinfoRequest): Promise<QueryRtopCompanyRiskinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopCompanyRiskinfoEx(request, headers, runtime);
  }

  /**
   * Description: 企业风险查询接口
   * Summary: 企业风险查询接口
   */
  async queryRtopCompanyRiskinfoEx(request: QueryRtopCompanyRiskinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopCompanyRiskinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopCompanyRiskinfoResponse>(await this.doRequest("1.0", "riskplus.rtop.company.riskinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopCompanyRiskinfoResponse({}));
  }

  /**
   * Description: 公有云通用风险信息接口
   * Summary: 公有云通用风险信息接口
   */
  async execRtopGenericInvoke(request: ExecRtopGenericInvokeRequest): Promise<ExecRtopGenericInvokeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execRtopGenericInvokeEx(request, headers, runtime);
  }

  /**
   * Description: 公有云通用风险信息接口
   * Summary: 公有云通用风险信息接口
   */
  async execRtopGenericInvokeEx(request: ExecRtopGenericInvokeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecRtopGenericInvokeResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecRtopGenericInvokeResponse>(await this.doRequest("1.0", "riskplus.rtop.generic.invoke.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecRtopGenericInvokeResponse({}));
  }

  /**
   * Description: 公有云生成token
   * Summary: 公有云生成token
   */
  async createRtopToken(request: CreateRtopTokenRequest): Promise<CreateRtopTokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createRtopTokenEx(request, headers, runtime);
  }

  /**
   * Description: 公有云生成token
   * Summary: 公有云生成token
   */
  async createRtopTokenEx(request: CreateRtopTokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateRtopTokenResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateRtopTokenResponse>(await this.doRequest("1.0", "riskplus.rtop.token.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateRtopTokenResponse({}));
  }

  /**
   * Description: 标签全量信息获取
   * Summary: 标签全量信息获取
   */
  async queryRtopRisklabel(request: QueryRtopRisklabelRequest): Promise<QueryRtopRisklabelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopRisklabelEx(request, headers, runtime);
  }

  /**
   * Description: 标签全量信息获取
   * Summary: 标签全量信息获取
   */
  async queryRtopRisklabelEx(request: QueryRtopRisklabelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopRisklabelResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopRisklabelResponse>(await this.doRequest("1.0", "riskplus.rtop.risklabel.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopRisklabelResponse({}));
  }

  /**
   * Description: 企业全量信息获取
   * Summary: 企业全量信息获取
   */
  async queryRtopCompany(request: QueryRtopCompanyRequest): Promise<QueryRtopCompanyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopCompanyEx(request, headers, runtime);
  }

  /**
   * Description: 企业全量信息获取
   * Summary: 企业全量信息获取
   */
  async queryRtopCompanyEx(request: QueryRtopCompanyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopCompanyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopCompanyResponse>(await this.doRequest("1.0", "riskplus.rtop.company.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopCompanyResponse({}));
  }

  /**
   * Description: 标签配置全量信息获取
  rtop_company_tag_filter_config
   * Summary: 标签配置全量信息获取
   */
  async queryRtopRisklabelFilter(request: QueryRtopRisklabelFilterRequest): Promise<QueryRtopRisklabelFilterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopRisklabelFilterEx(request, headers, runtime);
  }

  /**
   * Description: 标签配置全量信息获取
  rtop_company_tag_filter_config
   * Summary: 标签配置全量信息获取
   */
  async queryRtopRisklabelFilterEx(request: QueryRtopRisklabelFilterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopRisklabelFilterResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopRisklabelFilterResponse>(await this.doRequest("1.0", "riskplus.rtop.risklabel.filter.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopRisklabelFilterResponse({}));
  }

  /**
   * Description: 用于鹰眼项目舆情同步
   * Summary: 鹰眼项目舆情同步
   */
  async pullRegtechNews(request: PullRegtechNewsRequest): Promise<PullRegtechNewsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pullRegtechNewsEx(request, headers, runtime);
  }

  /**
   * Description: 用于鹰眼项目舆情同步
   * Summary: 鹰眼项目舆情同步
   */
  async pullRegtechNewsEx(request: PullRegtechNewsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PullRegtechNewsResponse> {
    Util.validateModel(request);
    return $tea.cast<PullRegtechNewsResponse>(await this.doRequest("1.0", "riskplus.regtech.news.pull", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PullRegtechNewsResponse({}));
  }

  /**
   * Description: 查看企业反馈
   * Summary: 查看企业反馈
   */
  async queryRtopCompanyFeedback(request: QueryRtopCompanyFeedbackRequest): Promise<QueryRtopCompanyFeedbackResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopCompanyFeedbackEx(request, headers, runtime);
  }

  /**
   * Description: 查看企业反馈
   * Summary: 查看企业反馈
   */
  async queryRtopCompanyFeedbackEx(request: QueryRtopCompanyFeedbackRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopCompanyFeedbackResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopCompanyFeedbackResponse>(await this.doRequest("1.0", "riskplus.rtop.company.feedback.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopCompanyFeedbackResponse({}));
  }

  /**
   * Description: 全局动态中的预警企业详细列表查询
   * Summary: 全局动态中的预警企业详细列表查询
   */
  async queryRtopCompanyAlarm(request: QueryRtopCompanyAlarmRequest): Promise<QueryRtopCompanyAlarmResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopCompanyAlarmEx(request, headers, runtime);
  }

  /**
   * Description: 全局动态中的预警企业详细列表查询
   * Summary: 全局动态中的预警企业详细列表查询
   */
  async queryRtopCompanyAlarmEx(request: QueryRtopCompanyAlarmRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopCompanyAlarmResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopCompanyAlarmResponse>(await this.doRequest("1.0", "riskplus.rtop.company.alarm.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopCompanyAlarmResponse({}));
  }

  /**
   * Description: 查询全局动态中的企业列表里的全部列表
   * Summary: 查询全局动态中的企业列表里的全部列表
   */
  async queryRtopCompanyRisky(request: QueryRtopCompanyRiskyRequest): Promise<QueryRtopCompanyRiskyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopCompanyRiskyEx(request, headers, runtime);
  }

  /**
   * Description: 查询全局动态中的企业列表里的全部列表
   * Summary: 查询全局动态中的企业列表里的全部列表
   */
  async queryRtopCompanyRiskyEx(request: QueryRtopCompanyRiskyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopCompanyRiskyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopCompanyRiskyResponse>(await this.doRequest("1.0", "riskplus.rtop.company.risky.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopCompanyRiskyResponse({}));
  }

  /**
   * Description: 查询企业列表
   * Summary: 查询企业列表
   */
  async queryRtopCompanyList(request: QueryRtopCompanyListRequest): Promise<QueryRtopCompanyListResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopCompanyListEx(request, headers, runtime);
  }

  /**
   * Description: 查询企业列表
   * Summary: 查询企业列表
   */
  async queryRtopCompanyListEx(request: QueryRtopCompanyListRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopCompanyListResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopCompanyListResponse>(await this.doRequest("1.0", "riskplus.rtop.company.list.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopCompanyListResponse({}));
  }

  /**
   * Description: 标签配置全量信息获取
   * Summary: 标签配置全量信息获取
   */
  async queryRtopRisklabelConfig(request: QueryRtopRisklabelConfigRequest): Promise<QueryRtopRisklabelConfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopRisklabelConfigEx(request, headers, runtime);
  }

  /**
   * Description: 标签配置全量信息获取
   * Summary: 标签配置全量信息获取
   */
  async queryRtopRisklabelConfigEx(request: QueryRtopRisklabelConfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopRisklabelConfigResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopRisklabelConfigResponse>(await this.doRequest("1.0", "riskplus.rtop.risklabel.config.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopRisklabelConfigResponse({}));
  }

  /**
   * Description: 企业风险标签信息查询
   * Summary: 企业风险标签信息查询
   */
  async queryRtopCompanyRisk(request: QueryRtopCompanyRiskRequest): Promise<QueryRtopCompanyRiskResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopCompanyRiskEx(request, headers, runtime);
  }

  /**
   * Description: 企业风险标签信息查询
   * Summary: 企业风险标签信息查询
   */
  async queryRtopCompanyRiskEx(request: QueryRtopCompanyRiskRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopCompanyRiskResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopCompanyRiskResponse>(await this.doRequest("1.0", "riskplus.rtop.company.risk.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopCompanyRiskResponse({}));
  }

  /**
   * Description: 查看重点关联企业
   * Summary: 重点关联企业
   */
  async listRtopCompanyRelated(request: ListRtopCompanyRelatedRequest): Promise<ListRtopCompanyRelatedResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listRtopCompanyRelatedEx(request, headers, runtime);
  }

  /**
   * Description: 查看重点关联企业
   * Summary: 重点关联企业
   */
  async listRtopCompanyRelatedEx(request: ListRtopCompanyRelatedRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListRtopCompanyRelatedResponse> {
    Util.validateModel(request);
    return $tea.cast<ListRtopCompanyRelatedResponse>(await this.doRequest("1.0", "riskplus.rtop.company.related.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListRtopCompanyRelatedResponse({}));
  }

  /**
   * Description: 风险标签图片查询
   * Summary: 风险标签图片查询
   */
  async queryRtopTagImage(request: QueryRtopTagImageRequest): Promise<QueryRtopTagImageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRtopTagImageEx(request, headers, runtime);
  }

  /**
   * Description: 风险标签图片查询
   * Summary: 风险标签图片查询
   */
  async queryRtopTagImageEx(request: QueryRtopTagImageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRtopTagImageResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRtopTagImageResponse>(await this.doRequest("1.0", "riskplus.rtop.tag.image.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRtopTagImageResponse({}));
  }

  /**
   * Description: 查询用户收藏企业列表
   * Summary: 查询用户收藏企业列表
   */
  async listRtopStarCompany(request: ListRtopStarCompanyRequest): Promise<ListRtopStarCompanyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listRtopStarCompanyEx(request, headers, runtime);
  }

  /**
   * Description: 查询用户收藏企业列表
   * Summary: 查询用户收藏企业列表
   */
  async listRtopStarCompanyEx(request: ListRtopStarCompanyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListRtopStarCompanyResponse> {
    Util.validateModel(request);
    return $tea.cast<ListRtopStarCompanyResponse>(await this.doRequest("1.0", "riskplus.rtop.star.company.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListRtopStarCompanyResponse({}));
  }

  /**
   * Description: 策略咨询服务输出(saas)
   * Summary: 策略咨询服务输出(saas)
   */
  async queryRpSecurityPolicy(request: QueryRpSecurityPolicyRequest): Promise<QueryRpSecurityPolicyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryRpSecurityPolicyEx(request, headers, runtime);
  }

  /**
   * Description: 策略咨询服务输出(saas)
   * Summary: 策略咨询服务输出(saas)
   */
  async queryRpSecurityPolicyEx(request: QueryRpSecurityPolicyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryRpSecurityPolicyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryRpSecurityPolicyResponse>(await this.doRequest("1.0", "riskplus.rp.security.policy.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryRpSecurityPolicyResponse({}));
  }

  /**
   * Description: 风控快照查询
   * Summary: 风控事件快照查询
   */
  async querySnapshotEvent(request: QuerySnapshotEventRequest): Promise<QuerySnapshotEventResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.querySnapshotEventEx(request, headers, runtime);
  }

  /**
   * Description: 风控快照查询
   * Summary: 风控事件快照查询
   */
  async querySnapshotEventEx(request: QuerySnapshotEventRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QuerySnapshotEventResponse> {
    Util.validateModel(request);
    return $tea.cast<QuerySnapshotEventResponse>(await this.doRequest("1.0", "riskplus.snapshot.event.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QuerySnapshotEventResponse({}));
  }

  /**
   * Description: 营销盾批量参数文件上传接口
   * Summary: 营销盾参数文件上传
   */
  async uploadUmktParamsFile(request: UploadUmktParamsFileRequest): Promise<UploadUmktParamsFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadUmktParamsFileEx(request, headers, runtime);
  }

  /**
   * Description: 营销盾批量参数文件上传接口
   * Summary: 营销盾参数文件上传
   */
  async uploadUmktParamsFileEx(request: UploadUmktParamsFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadUmktParamsFileResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "riskplus.umkt.params.file.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadUmktParamsFileResponse = new UploadUmktParamsFileResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadUmktParamsFileResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
    }

    Util.validateModel(request);
    return $tea.cast<UploadUmktParamsFileResponse>(await this.doRequest("1.0", "riskplus.umkt.params.file.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadUmktParamsFileResponse({}));
  }

  /**
   * Description: 营销盾实时营销服务，支持批量
   * Summary: 营销盾实时营销服务
   */
  async batchqueryUmktRtMarketing(request: BatchqueryUmktRtMarketingRequest): Promise<BatchqueryUmktRtMarketingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryUmktRtMarketingEx(request, headers, runtime);
  }

  /**
   * Description: 营销盾实时营销服务，支持批量
   * Summary: 营销盾实时营销服务
   */
  async batchqueryUmktRtMarketingEx(request: BatchqueryUmktRtMarketingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryUmktRtMarketingResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryUmktRtMarketingResponse>(await this.doRequest("1.0", "riskplus.umkt.rt.marketing.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryUmktRtMarketingResponse({}));
  }

  /**
   * Description: 梦网富信投放事件通知
   * Summary: 梦网富信投放事件通知
   */
  async syncUmktRtEventresult(request: SyncUmktRtEventresultRequest): Promise<SyncUmktRtEventresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.syncUmktRtEventresultEx(request, headers, runtime);
  }

  /**
   * Description: 梦网富信投放事件通知
   * Summary: 梦网富信投放事件通知
   */
  async syncUmktRtEventresultEx(request: SyncUmktRtEventresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SyncUmktRtEventresultResponse> {
    Util.validateModel(request);
    return $tea.cast<SyncUmktRtEventresultResponse>(await this.doRequest("1.0", "riskplus.umkt.rt.eventresult.sync", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SyncUmktRtEventresultResponse({}));
  }

  /**
   * Description: 营销盾场景租户信息上传or更新
   * Summary: 营销盾场景租户信息上传or更新
   */
  async importUmktSceneUpload(request: ImportUmktSceneUploadRequest): Promise<ImportUmktSceneUploadResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importUmktSceneUploadEx(request, headers, runtime);
  }

  /**
   * Description: 营销盾场景租户信息上传or更新
   * Summary: 营销盾场景租户信息上传or更新
   */
  async importUmktSceneUploadEx(request: ImportUmktSceneUploadRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportUmktSceneUploadResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportUmktSceneUploadResponse>(await this.doRequest("1.0", "riskplus.umkt.scene.upload.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportUmktSceneUploadResponse({}));
  }

  /**
   * Description: 富信贴尾实时圈客
   * Summary: 富信贴尾实时圈客
   */
  async batchqueryUmktRtTailmarketing(request: BatchqueryUmktRtTailmarketingRequest): Promise<BatchqueryUmktRtTailmarketingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryUmktRtTailmarketingEx(request, headers, runtime);
  }

  /**
   * Description: 富信贴尾实时圈客
   * Summary: 富信贴尾实时圈客
   */
  async batchqueryUmktRtTailmarketingEx(request: BatchqueryUmktRtTailmarketingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryUmktRtTailmarketingResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryUmktRtTailmarketingResponse>(await this.doRequest("1.0", "riskplus.umkt.rt.tailmarketing.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryUmktRtTailmarketingResponse({}));
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
