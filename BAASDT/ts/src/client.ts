// This file is auto-generated, don't edit it
import AlipayUtil from '@antchain/alipay-util';
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 交易日志
export class LogEntry extends $tea.Model {
  // 交易发起方
  from?: string;
  // log信息
  logData?: string;
  // 交易接受方
  to?: string;
  // 交易topic
  topics?: string[];
  static names(): { [key: string]: string } {
    return {
      from: 'from',
      logData: 'log_data',
      to: 'to',
      topics: 'topics',
    };
  }

  static types(): { [key: string]: any } {
    return {
      from: 'string',
      logData: 'string',
      to: 'string',
      topics: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 交易扩展字段
export class Extension extends $tea.Model {
  // key
  key?: number;
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
      key: 'number',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户价格
export class UserPrice extends $tea.Model {
  // 具体价格
  price?: string;
  // 相对比例
  ratio?: string;
  // 对租户价格(需要和当前生效价格匹配)
  snapshotTenantPrice?: string;
  // 价格类型(数值/比例)
  userPriceType?: number;
  // 租户用户价格包括费率
  userPriceWithCommission?: string;
  static names(): { [key: string]: string } {
    return {
      price: 'price',
      ratio: 'ratio',
      snapshotTenantPrice: 'snapshot_tenant_price',
      userPriceType: 'user_price_type',
      userPriceWithCommission: 'user_price_with_commission',
    };
  }

  static types(): { [key: string]: any } {
    return {
      price: 'string',
      ratio: 'string',
      snapshotTenantPrice: 'string',
      userPriceType: 'number',
      userPriceWithCommission: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 交易
export class BlockTransaction extends $tea.Model {
  // 交易信息
  data?: string;
  // 交易扩展信息
  extension?: Extension[];
  // 交易发起方
  from?: string;
  // 交易gas消耗
  gas?: number;
  // 分组id，暂时没用
  groupId?: string;
  // 交易哈希
  hash?: string;
  // 交易随机数
  nonce?: string;
  // 交易时间
  period?: number;
  // 交易签名
  signature?: string[];
  // 交易时间戳
  timestamp?: number;
  // 交易接收方
  to?: string;
  // 2
  type?: number;
  // 交易转账金额
  value?: number;
  // 2
  version?: number;
  static names(): { [key: string]: string } {
    return {
      data: 'data',
      extension: 'extension',
      from: 'from',
      gas: 'gas',
      groupId: 'group_id',
      hash: 'hash',
      nonce: 'nonce',
      period: 'period',
      signature: 'signature',
      timestamp: 'timestamp',
      to: 'to',
      type: 'type',
      value: 'value',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      data: 'string',
      extension: { 'type': 'array', 'itemType': Extension },
      from: 'string',
      gas: 'number',
      groupId: 'string',
      hash: 'string',
      nonce: 'string',
      period: 'number',
      signature: { 'type': 'array', 'itemType': 'string' },
      timestamp: 'number',
      to: 'string',
      type: 'number',
      value: 'number',
      version: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 交易收据
export class BlockReceipt extends $tea.Model {
  // 使用的gas数量
  gasUsed?: number;
  // 收据log信息
  logs?: LogEntry[];
  // 交易输出
  output?: string;
  // 交易结果，0为成功
  result?: number;
  static names(): { [key: string]: string } {
    return {
      gasUsed: 'gas_used',
      logs: 'logs',
      output: 'output',
      result: 'result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      gasUsed: 'number',
      logs: { 'type': 'array', 'itemType': LogEntry },
      output: 'string',
      result: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 区块体
export class BlockBody extends $tea.Model {
  // 区块共识证明(HEX)
  consensusProof?: string;
  // 区块中交易回执列表
  receiptList?: BlockReceipt[];
  // 区块中交易列表
  transactionList?: BlockTransaction[];
  static names(): { [key: string]: string } {
    return {
      consensusProof: 'consensus_proof',
      receiptList: 'receipt_list',
      transactionList: 'transaction_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      consensusProof: 'string',
      receiptList: { 'type': 'array', 'itemType': BlockReceipt },
      transactionList: { 'type': 'array', 'itemType': BlockTransaction },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商户备付金账户
export class Provision extends $tea.Model {
  // 授信上限
  creditMax?: string;
  // 授信已使用
  creditUsed?: string;
  // 币种
  currency?: string;
  // 余额
  debit?: string;
  static names(): { [key: string]: string } {
    return {
      creditMax: 'credit_max',
      creditUsed: 'credit_used',
      currency: 'currency',
      debit: 'debit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      creditMax: 'string',
      creditUsed: 'string',
      currency: 'string',
      debit: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 权益附属信息
export class EquityExtInfo extends $tea.Model {
  // 费率
  commission?: string;
  // 指定兑换日限制已使用
  limitPerDayUsed?: number;
  // 指定兑换月限制已使用
  limitPerMonthUsed?: number;
  // 权益开放的租户ID
  openToTenantId?: string;
  // 指定日期
  targetDate?: string;
  // 权益对租户价格
  tenantPrice?: string;
  // 租户价格包括费率
  tenantPriceWithCommission?: string;
  // 授权给租户用户的价格
  tenantUserPrice?: UserPrice;
  static names(): { [key: string]: string } {
    return {
      commission: 'commission',
      limitPerDayUsed: 'limit_per_day_used',
      limitPerMonthUsed: 'limit_per_month_used',
      openToTenantId: 'open_to_tenant_id',
      targetDate: 'target_date',
      tenantPrice: 'tenant_price',
      tenantPriceWithCommission: 'tenant_price_with_commission',
      tenantUserPrice: 'tenant_user_price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      commission: 'string',
      limitPerDayUsed: 'number',
      limitPerMonthUsed: 'number',
      openToTenantId: 'string',
      targetDate: 'string',
      tenantPrice: 'string',
      tenantPriceWithCommission: 'string',
      tenantUserPrice: UserPrice,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 权益详情
export class EquityDetail extends $tea.Model {
  // 权益描述
  description?: string;
  // 权益描述图片OSS地址（分号;分隔）
  descImages?: string;
  // 权益ID
  equityId?: string;
  // 权益名称
  equityName?: string;
  // 权益类型
  equityType?: string;
  // 权益面值(元)
  equityValue?: string;
  // 权益主图片OSS地址（分号;分隔）
  images?: string;
  // 对客价(元)
  price?: string;
  // 权益SKU
  skuId?: string;
  static names(): { [key: string]: string } {
    return {
      description: 'description',
      descImages: 'desc_images',
      equityId: 'equity_id',
      equityName: 'equity_name',
      equityType: 'equity_type',
      equityValue: 'equity_value',
      images: 'images',
      price: 'price',
      skuId: 'sku_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      description: 'string',
      descImages: 'string',
      equityId: 'string',
      equityName: 'string',
      equityType: 'string',
      equityValue: 'string',
      images: 'string',
      price: 'string',
      skuId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 资产附属信息
export class AssetExtInfo extends $tea.Model {
  // 发放账户余额
  dispenseBalance?: string;
  // 发放账户归属租户ID
  dispenseTenantId?: string;
  // 用户账户余额
  userCreditBalance?: string;
  // 用户ID
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      dispenseBalance: 'dispense_balance',
      dispenseTenantId: 'dispense_tenant_id',
      userCreditBalance: 'user_credit_balance',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      dispenseBalance: 'string',
      dispenseTenantId: 'string',
      userCreditBalance: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 区块头
export class BlockHeader extends $tea.Model {
  // gas总消耗
  gasUsed?: number;
  // 十六进制区块哈希值
  hash?: string;
  // log bloom
  logBloom?: string;
  // 区块高度
  number?: number;
  // 十六进制区块父hash
  parentHash?: string;
  // 交易单据树根
  receiptRoot?: string;
  // 状态树根
  stateRoot?: string;
  // 区块时间戳
  timestamp?: number;
  // 十六进制交易merkle树根
  transactionRoot?: string;
  // 区块版本
  version?: number;
  static names(): { [key: string]: string } {
    return {
      gasUsed: 'gas_used',
      hash: 'hash',
      logBloom: 'log_bloom',
      number: 'number',
      parentHash: 'parent_hash',
      receiptRoot: 'receipt_root',
      stateRoot: 'state_root',
      timestamp: 'timestamp',
      transactionRoot: 'transaction_root',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      gasUsed: 'number',
      hash: 'string',
      logBloom: 'string',
      number: 'number',
      parentHash: 'string',
      receiptRoot: 'string',
      stateRoot: 'string',
      timestamp: 'number',
      transactionRoot: 'string',
      version: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 卡密信息
export class Card extends $tea.Model {
  // 计算理论上应该变为的状态
  calStatus?: number;
  // 卡密ID
  cardId?: string;
  // 充值时间
  chargeTime?: number;
  // 数量
  countOfMinUnit?: number;
  // 卡密创建时间
  createTime?: number;
  // 创建卡密时的交易hash
  createTxHash?: string;
  // 脱敏手机信息
  desensitizedUid?: string;
  // 附加信息
  extInfo?: string;
  // 最小单位数量
  minUnit?: number;
  // 公钥
  publicKey?: string;
  // 状态
  status?: number;
  // 公钥信息
  uidPublicKey?: string;
  // 卡密在该时间后有效
  validAfter?: number;
  // 卡密在该时间前有效
  validBefore?: number;
  // 有效天数
  validDays?: number;
  // 价值
  value?: number;
  // 卡密版本
  version?: number;
  static names(): { [key: string]: string } {
    return {
      calStatus: 'cal_status',
      cardId: 'card_id',
      chargeTime: 'charge_time',
      countOfMinUnit: 'count_of_min_unit',
      createTime: 'create_time',
      createTxHash: 'create_tx_hash',
      desensitizedUid: 'desensitized_uid',
      extInfo: 'ext_info',
      minUnit: 'min_unit',
      publicKey: 'public_key',
      status: 'status',
      uidPublicKey: 'uid_public_key',
      validAfter: 'valid_after',
      validBefore: 'valid_before',
      validDays: 'valid_days',
      value: 'value',
      version: 'version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      calStatus: 'number',
      cardId: 'string',
      chargeTime: 'number',
      countOfMinUnit: 'number',
      createTime: 'number',
      createTxHash: 'string',
      desensitizedUid: 'string',
      extInfo: 'string',
      minUnit: 'number',
      publicKey: 'string',
      status: 'number',
      uidPublicKey: 'string',
      validAfter: 'number',
      validBefore: 'number',
      validDays: 'number',
      value: 'number',
      version: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品详情
export class SKUItem extends $tea.Model {
  // 集分宝销售费率
  rate?: string;
  // 包含集分宝个数
  skuAmount?: number;
  // 商品ID
  skuId?: string;
  // 商品名称
  skuName?: string;
  // 商品面值（单位：元）
  skuPrice?: string;
  // 商品状态：0可用，1冻结，2下线
  status?: number;
  static names(): { [key: string]: string } {
    return {
      rate: 'rate',
      skuAmount: 'sku_amount',
      skuId: 'sku_id',
      skuName: 'sku_name',
      skuPrice: 'sku_price',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      rate: 'string',
      skuAmount: 'number',
      skuId: 'string',
      skuName: 'string',
      skuPrice: 'string',
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 手续费信息
export class Commission extends $tea.Model {
  // 手续费生效时间（时间戳 ms）
  beginTime?: number;
  // 手续费
  commission?: string;
  // 手续费结束时间
  endTime?: number;
  // 要更新的手续费状态
  status?: number;
  static names(): { [key: string]: string } {
    return {
      beginTime: 'begin_time',
      commission: 'commission',
      endTime: 'end_time',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      beginTime: 'number',
      commission: 'string',
      endTime: 'number',
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 图片OSS URL，包含四个不同大小的图片
export class MultiURL extends $tea.Model {
  // 上传的图片正常大小
  normal?: string;
  // style150
  style150?: string;
  // style200
  style200?: string;
  // style70
  style70?: string;
  static names(): { [key: string]: string } {
    return {
      normal: 'normal',
      style150: 'style_150',
      style200: 'style_200',
      style70: 'style_70',
    };
  }

  static types(): { [key: string]: any } {
    return {
      normal: 'string',
      style150: 'string',
      style200: 'string',
      style70: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 权益流水
export class EInstruction extends $tea.Model {
  // 资产ID
  assetId?: string;
  // 资产的汇率
  assetRate?: string;
  // 资产扣减数量(单位:个)
  deductAssetAmount?: string;
  // 扣减商户备付金授信额(单位:元)
  deductCreditAmount?: string;
  // 扣减商户备付金余额(单位:元)
  deductDebitAmount?: string;
  // 被扣减备付金的租户ID
  deductTenantId?: string;
  // 权益ID
  equityId?: string;
  // 权益名称
  equityName?: string;
  // 权益对用户价格(单位:元)
  equityPrice?: string;
  // 权益面值(单位:元)
  equityValue?: string;
  // 附言Deliver/Complete/OutOfStore/WriteOff)
  memo?: string;
  // 发起操作的租户ID
  optTenantId?: string;
  // 业务交易ID
  outTxId?: string;
  // 对换单流水状态：
  // 0        // 权益兑换单创建
  // 1        // 权益兑换单接单
  // 2        // 权益兑换单发货
  // 3        // 权益兑换单确认收货
  // 4        // 权益兑换单缺货
  // 5        // 权益兑换单核销
  status?: number;
  // 权益归属租户ID
  tenantId?: string;
  // 交易时间戳
  timeStamp?: number;
  // 兑换类型(商户身份/用户身份)
  type?: number;
  // 用户身份兑换/商户兑换的受益用户
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      assetId: 'asset_id',
      assetRate: 'asset_rate',
      deductAssetAmount: 'deduct_asset_amount',
      deductCreditAmount: 'deduct_credit_amount',
      deductDebitAmount: 'deduct_debit_amount',
      deductTenantId: 'deduct_tenant_id',
      equityId: 'equity_id',
      equityName: 'equity_name',
      equityPrice: 'equity_price',
      equityValue: 'equity_value',
      memo: 'memo',
      optTenantId: 'opt_tenant_id',
      outTxId: 'out_tx_id',
      status: 'status',
      tenantId: 'tenant_id',
      timeStamp: 'time_stamp',
      type: 'type',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      assetId: 'string',
      assetRate: 'string',
      deductAssetAmount: 'string',
      deductCreditAmount: 'string',
      deductDebitAmount: 'string',
      deductTenantId: 'string',
      equityId: 'string',
      equityName: 'string',
      equityPrice: 'string',
      equityValue: 'string',
      memo: 'string',
      optTenantId: 'string',
      outTxId: 'string',
      status: 'number',
      tenantId: 'string',
      timeStamp: 'number',
      type: 'number',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 接口白名单信息
export class APIWhiteListInfo extends $tea.Model {
  // 链ID
  chainId?: string;
  // 扩展字段
  extension?: string;
  // 权限级别，暂时不用
  level?: number;
  // 租户ID
  tenantId?: string;
  // 更新时间
  updateTime?: string;
  static names(): { [key: string]: string } {
    return {
      chainId: 'chain_id',
      extension: 'extension',
      level: 'level',
      tenantId: 'tenant_id',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      chainId: 'string',
      extension: 'string',
      level: 'number',
      tenantId: 'string',
      updateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 链上交易结构
export class Transaction extends $tea.Model {
  // 交易数据，转换位十六进制
  data?: string;
  // 卡密管理员链上ID，64位十六进制。
  from?: string;
  // 交易hash，十六进制编码
  hash?: string;
  // 交易随机数
  nonce?: number;
  // 交易时间
  period?: number;
  // from账户对应的公钥，128位十六进制。
  publicKey?: string;
  // 交易签名，十六进制编码
  signature?: string;
  // 交易时间戳
  timestamp?: number;
  // 交易目标地址，64位十六进制。
  to?: string;
  static names(): { [key: string]: string } {
    return {
      data: 'data',
      from: 'from',
      hash: 'hash',
      nonce: 'nonce',
      period: 'period',
      publicKey: 'public_key',
      signature: 'signature',
      timestamp: 'timestamp',
      to: 'to',
    };
  }

  static types(): { [key: string]: any } {
    return {
      data: 'string',
      from: 'string',
      hash: 'string',
      nonce: 'number',
      period: 'number',
      publicKey: 'string',
      signature: 'string',
      timestamp: 'number',
      to: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 租户的备付金列表
export class DiscreteValue extends $tea.Model {
  // 序号
  sortId?: number;
  // 文本信息
  text?: string;
  // 文本值
  value?: string;
  static names(): { [key: string]: string } {
    return {
      sortId: 'sort_id',
      text: 'text',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      sortId: 'number',
      text: 'string',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 权益
export class Equity extends $tea.Model {
  // 权益管理员ID
  adminId?: string;
  // 权益授权类型
  authType?: number;
  // 权益锚定币种
  currency?: string;
  // 权益默认价格
  defaultPrice?: string;
  // 权益描述
  description?: string;
  // 权益描述图片OSS地址 分号分隔
  descImages?: string;
  // 权益附属信息
  equityExtInfo?: EquityExtInfo;
  // 权益ID
  equityId?: string;
  // 权益名称
  equityName?: string;
  // 商品类型，详见数字商品公约https://tech.antfin.com/docs/2/163896
  equityType?: string;
  // 权益主图片OSS地址 分号;分隔
  images?: string;
  // 是否为公开权益
  isPublic?: boolean;
  // 商户每日兑换上限
  limitPerMerchantAndDay?: number;
  // 商户每月兑换上限
  limitPerMerchantAndMonth?: number;
  // 用户每日兑换上限
  limitPerUserAndDay?: number;
  // 用户每月兑换上限
  limitPerUserAndMonth?: number;
  // 附言
  memo?: string;
  // 权益状态
  status?: number;
  // 租户ID
  tenantId?: string;
  // 权益库存
  totalCount?: string;
  // 权益使用有效期右闭区间
  useValidNotAfter?: number;
  // 权益使用有效期左闭区间
  useValidNotBefore?: number;
  // 权益兑换有效期右闭区间
  validNotAfter?: number;
  // 权益兑换有效期左闭区间
  validNotBefore?: number;
  // 权益面值
  value?: string;
  static names(): { [key: string]: string } {
    return {
      adminId: 'admin_id',
      authType: 'auth_type',
      currency: 'currency',
      defaultPrice: 'default_price',
      description: 'description',
      descImages: 'desc_images',
      equityExtInfo: 'equity_ext_info',
      equityId: 'equity_id',
      equityName: 'equity_name',
      equityType: 'equity_type',
      images: 'images',
      isPublic: 'is_public',
      limitPerMerchantAndDay: 'limit_per_merchant_and_day',
      limitPerMerchantAndMonth: 'limit_per_merchant_and_month',
      limitPerUserAndDay: 'limit_per_user_and_day',
      limitPerUserAndMonth: 'limit_per_user_and_month',
      memo: 'memo',
      status: 'status',
      tenantId: 'tenant_id',
      totalCount: 'total_count',
      useValidNotAfter: 'use_valid_not_after',
      useValidNotBefore: 'use_valid_not_before',
      validNotAfter: 'valid_not_after',
      validNotBefore: 'valid_not_before',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      adminId: 'string',
      authType: 'number',
      currency: 'string',
      defaultPrice: 'string',
      description: 'string',
      descImages: 'string',
      equityExtInfo: EquityExtInfo,
      equityId: 'string',
      equityName: 'string',
      equityType: 'string',
      images: 'string',
      isPublic: 'boolean',
      limitPerMerchantAndDay: 'number',
      limitPerMerchantAndMonth: 'number',
      limitPerUserAndDay: 'number',
      limitPerUserAndMonth: 'number',
      memo: 'string',
      status: 'number',
      tenantId: 'string',
      totalCount: 'string',
      useValidNotAfter: 'number',
      useValidNotBefore: 'number',
      validNotAfter: 'number',
      validNotBefore: 'number',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 区块
export class Block extends $tea.Model {
  // 区块体
  body?: BlockBody;
  // 区块头
  header?: BlockHeader;
  static names(): { [key: string]: string } {
    return {
      body: 'body',
      header: 'header',
    };
  }

  static types(): { [key: string]: any } {
    return {
      body: BlockBody,
      header: BlockHeader,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 已授权给商户的权益信息
export class OpenedEquity extends $tea.Model {
  // 商户管理员ID
  adminId?: string;
  // 授权类型
  authType?: string;
  // 币种
  currency?: string;
  // 默认价格
  defaultPrice?: string;
  // 权益详情
  description?: string;
  // 权益详情图片
  descImages?: string;
  // 权益ID
  equityD?: string;
  // 权益名称
  equityName?: string;
  // 权益类型
  equityType?: number;
  // 权益主图片
  images?: string;
  // 是否是公开权益
  isPublic?: boolean;
  // 每日商户对换限制
  limitPerMerchantAndDay?: number;
  // 每月商户对换限制
  limitPerMerchantAndMonth?: number;
  // 每日用户对换限制
  limitPerUserAndDay?: number;
  // 每月用户对换限制
  limitPerUserAndMonth?: number;
  // 权益附言
  memo?: string;
  // 被授权的租户ID
  openToTenantId?: string;
  // 权益状态
  status?: number;
  // 租户ID
  tenantId?: string;
  // 授权价格
  tenantPrice?: string;
  // 库存
  totalCount?: string;
  // 可用右区间
  useValidNotAfter?: number;
  // 可用左区间
  useValidNotBefore?: number;
  // 有效右区间
  validNotAfter?: number;
  // 有效左时间
  validNotBefore?: number;
  // 价值
  value?: string;
  static names(): { [key: string]: string } {
    return {
      adminId: 'admin_id',
      authType: 'auth_type',
      currency: 'currency',
      defaultPrice: 'default_price',
      description: 'description',
      descImages: 'desc_images',
      equityD: 'equity_d',
      equityName: 'equity_name',
      equityType: 'equity_type',
      images: 'images',
      isPublic: 'is_public',
      limitPerMerchantAndDay: 'limit_per_merchant_and_day',
      limitPerMerchantAndMonth: 'limit_per_merchant_and_month',
      limitPerUserAndDay: 'limit_per_user_and_day',
      limitPerUserAndMonth: 'limit_per_user_and_month',
      memo: 'memo',
      openToTenantId: 'open_to_tenant_id',
      status: 'status',
      tenantId: 'tenant_id',
      tenantPrice: 'tenant_price',
      totalCount: 'total_count',
      useValidNotAfter: 'use_valid_not_after',
      useValidNotBefore: 'use_valid_not_before',
      validNotAfter: 'valid_not_after',
      validNotBefore: 'valid_not_before',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      adminId: 'string',
      authType: 'string',
      currency: 'string',
      defaultPrice: 'string',
      description: 'string',
      descImages: 'string',
      equityD: 'string',
      equityName: 'string',
      equityType: 'number',
      images: 'string',
      isPublic: 'boolean',
      limitPerMerchantAndDay: 'number',
      limitPerMerchantAndMonth: 'number',
      limitPerUserAndDay: 'number',
      limitPerUserAndMonth: 'number',
      memo: 'string',
      openToTenantId: 'string',
      status: 'number',
      tenantId: 'string',
      tenantPrice: 'string',
      totalCount: 'string',
      useValidNotAfter: 'number',
      useValidNotBefore: 'number',
      validNotAfter: 'number',
      validNotBefore: 'number',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 资产
export class Asset extends $tea.Model {
  // 资产管理员ID
  adminId?: string;
  // 资产附属信息
  assetExtInfo?: AssetExtInfo;
  // 资产ID
  assetId?: string;
  // 资产名称
  assetName?: string;
  // 资产汇率
  assetRate?: string;
  // 币种
  currency?: string;
  // 发行账户余额
  issueAccountBalance?: string;
  // 过期回收账户余额
  overdueRecoveryAccountBalance?: string;
  // 支付收款账户余额
  receivePaymentAccountBalance?: string;
  // 中继账户余额
  relayAccountBalance?: string;
  // 资产状态
  status?: number;
  // 租户ID
  tenantId?: string;
  // 资产总发行量
  totalIssueBalance?: string;
  static names(): { [key: string]: string } {
    return {
      adminId: 'admin_id',
      assetExtInfo: 'asset_ext_info',
      assetId: 'asset_id',
      assetName: 'asset_name',
      assetRate: 'asset_rate',
      currency: 'currency',
      issueAccountBalance: 'issue_account_balance',
      overdueRecoveryAccountBalance: 'overdue_recovery_account_balance',
      receivePaymentAccountBalance: 'receive_payment_account_balance',
      relayAccountBalance: 'relay_account_balance',
      status: 'status',
      tenantId: 'tenant_id',
      totalIssueBalance: 'total_issue_balance',
    };
  }

  static types(): { [key: string]: any } {
    return {
      adminId: 'string',
      assetExtInfo: AssetExtInfo,
      assetId: 'string',
      assetName: 'string',
      assetRate: 'string',
      currency: 'string',
      issueAccountBalance: 'string',
      overdueRecoveryAccountBalance: 'string',
      receivePaymentAccountBalance: 'string',
      relayAccountBalance: 'string',
      status: 'number',
      tenantId: 'string',
      totalIssueBalance: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 代理授权关系信息
export class DelegateRelationInfo extends $tea.Model {
  // 被代理的租户ID
  delegatedTenantId?: string;
  // 扩展字段
  extension?: string;
  // 状态
  status?: boolean;
  // 被授权的租户ID
  tenantId?: string;
  // 更新时间
  updateTime?: string;
  static names(): { [key: string]: string } {
    return {
      delegatedTenantId: 'delegated_tenant_id',
      extension: 'extension',
      status: 'status',
      tenantId: 'tenant_id',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      delegatedTenantId: 'string',
      extension: 'string',
      status: 'boolean',
      tenantId: 'string',
      updateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商户积分库和与预算库信息
export class MerchantBudget extends $tea.Model {
  // 预算库代码
  budgetCode?: string;
  // 预算库描述
  budgetDesc?: string;
  // 预算库截止时间
  budgetEndTime?: string;
  // 预算库启用时间
  budgetStartTime?: string;
  // 积分库代码
  pointLibCode?: string;
  static names(): { [key: string]: string } {
    return {
      budgetCode: 'budget_code',
      budgetDesc: 'budget_desc',
      budgetEndTime: 'budget_end_time',
      budgetStartTime: 'budget_start_time',
      pointLibCode: 'point_lib_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      budgetCode: 'string',
      budgetDesc: 'string',
      budgetEndTime: 'string',
      budgetStartTime: 'string',
      pointLibCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 可兑换商品列表
export class ExchangeableEquityList extends $tea.Model {
  // 页面上数据在总数据中的结束位置（第几个数据）
  endRow?: number;
  // 权益信息列表
  equityList?: EquityDetail[];
  // 第一页页码
  firstPage?: number;
  // 是否有下一页
  hasNextPage?: boolean;
  // 是否有前一页
  hasPreviousPage?: boolean;
  // 是否第一页
  isFirstPage?: boolean;
  // 是否最后一页
  isLastPage?: boolean;
  // 最后一页页码
  lastPage?: number;
  // 下一页页码
  nextPage?: number;
  // 排序规则
  orderBy?: string;
  // 可兑换的权益总页数
  pages?: number;
  // 当前页码
  pageNumber?: number;
  // 页面大小
  pageSize?: number;
  // 前一页页码
  prePage?: number;
  // 页面中实际数量
  size?: number;
  // 页面上数据在总数据中的开始位置（第几个数据）
  startRow?: number;
  // 可兑换的权益总数
  total?: number;
  static names(): { [key: string]: string } {
    return {
      endRow: 'end_row',
      equityList: 'equity_list',
      firstPage: 'first_page',
      hasNextPage: 'has_next_page',
      hasPreviousPage: 'has_previous_page',
      isFirstPage: 'is_first_page',
      isLastPage: 'is_last_page',
      lastPage: 'last_page',
      nextPage: 'next_page',
      orderBy: 'order_by',
      pages: 'pages',
      pageNumber: 'page_number',
      pageSize: 'page_size',
      prePage: 'pre_page',
      size: 'size',
      startRow: 'start_row',
      total: 'total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      endRow: 'number',
      equityList: { 'type': 'array', 'itemType': EquityDetail },
      firstPage: 'number',
      hasNextPage: 'boolean',
      hasPreviousPage: 'boolean',
      isFirstPage: 'boolean',
      isLastPage: 'boolean',
      lastPage: 'number',
      nextPage: 'number',
      orderBy: 'string',
      pages: 'number',
      pageNumber: 'number',
      pageSize: 'number',
      prePage: 'number',
      size: 'number',
      startRow: 'number',
      total: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 查询手续费结果信息
export class CommissionResult extends $tea.Model {
  // 手续费生效时间
  beginTime?: number;
  // 手续费
  commission?: string;
  // 手续费信息ID
  commissionId?: string;
  // 手续费失效时间
  endTime?: number;
  // 商品类型
  equityType?: number;
  // 手续费状态（0可用，1停用，2禁用）
  status?: number;
  // 租户ID
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      beginTime: 'begin_time',
      commission: 'commission',
      commissionId: 'commission_id',
      endTime: 'end_time',
      equityType: 'equity_type',
      status: 'status',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      beginTime: 'number',
      commission: 'string',
      commissionId: 'string',
      endTime: 'number',
      equityType: 'number',
      status: 'number',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 设置过自定义价格的权益信息
export class UserPriceEquity extends $tea.Model {
  // 权益提供商商户ID
  adminId?: string;
  // 授权类型
  authType?: number;
  // 币种
  currency?: string;
  // 默认价格
  defaultPrice?: string;
  // 权益描述
  description?: string;
  // 权益描述图片
  descImages?: string;
  // 权益ID
  equityD?: string;
  // 权益名称
  equityName?: string;
  // 权益类型
  equityType?: number;
  // 权益主图片
  images?: string;
  // 是否公开权益
  isPublic?: boolean;
  // 商户每日兑换上线
  limitPerMerchantAndDay?: number;
  // 商户每月兑换上线
  limitPerMerchantAndMonth?: number;
  // 用户每日兑换上线
  limitPerUserAndDay?: number;
  // 用户每月兑换上限
  limitPerUserAndMonth?: number;
  // 权益附言信息
  memo?: string;
  // 授权的租户ID
  openToTenantId?: string;
  // 用户价格
  price?: string;
  // 用户价格比例
  ratio?: string;
  // 快照租户价格
  snapshotTenantPrice?: string;
  // 权益状态
  status?: number;
  // 权益提供商租户ID
  tenantId?: string;
  // 权益库存
  totalCount?: string;
  // 用户价格类型
  userPriceType?: number;
  // 可用右区间
  useValidNotAfter?: number;
  // 可用左区间
  useValidNotBefore?: number;
  // 有效右区间
  validNotAfter?: number;
  // 有效左区间
  validNotBefore?: number;
  // 价值
  value?: string;
  static names(): { [key: string]: string } {
    return {
      adminId: 'admin_id',
      authType: 'auth_type',
      currency: 'currency',
      defaultPrice: 'default_price',
      description: 'description',
      descImages: 'desc_images',
      equityD: 'equity_d',
      equityName: 'equity_name',
      equityType: 'equity_type',
      images: 'images',
      isPublic: 'is_public',
      limitPerMerchantAndDay: 'limit_per_merchant_and_day',
      limitPerMerchantAndMonth: 'limit_per_merchant_and_month',
      limitPerUserAndDay: 'limit_per_user_and_day',
      limitPerUserAndMonth: 'limit_per_user_and_month',
      memo: 'memo',
      openToTenantId: 'open_to_tenant_id',
      price: 'price',
      ratio: 'ratio',
      snapshotTenantPrice: 'snapshot_tenant_price',
      status: 'status',
      tenantId: 'tenant_id',
      totalCount: 'total_count',
      userPriceType: 'user_price_type',
      useValidNotAfter: 'use_valid_not_after',
      useValidNotBefore: 'use_valid_not_before',
      validNotAfter: 'valid_not_after',
      validNotBefore: 'valid_not_before',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      adminId: 'string',
      authType: 'number',
      currency: 'string',
      defaultPrice: 'string',
      description: 'string',
      descImages: 'string',
      equityD: 'string',
      equityName: 'string',
      equityType: 'number',
      images: 'string',
      isPublic: 'boolean',
      limitPerMerchantAndDay: 'number',
      limitPerMerchantAndMonth: 'number',
      limitPerUserAndDay: 'number',
      limitPerUserAndMonth: 'number',
      memo: 'string',
      openToTenantId: 'string',
      price: 'string',
      ratio: 'string',
      snapshotTenantPrice: 'string',
      status: 'number',
      tenantId: 'string',
      totalCount: 'string',
      userPriceType: 'number',
      useValidNotAfter: 'number',
      useValidNotBefore: 'number',
      validNotAfter: 'number',
      validNotBefore: 'number',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商户
export class Merchant extends $tea.Model {
  // 商户管理员ID
  adminId?: string;
  // 商户描述
  description?: string;
  // 商户分布式身份ID
  did?: string;
  // 资金管理员ID
  fundManagerId?: string;
  // 是否可以发行资产
  isAssetIssuer?: boolean;
  // 是否可以采购权益
  isEquityConsumer?: boolean;
  // 是否可以发行权益
  isEquityProvider?: boolean;
  // 商户的损益账户
  profitLossBalance?: string;
  // 备付金数据
  provision?: Provision;
  // 商户状态: 0可用, 1下线, 2冻结
  status?: number;
  // 租户ID
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      adminId: 'admin_id',
      description: 'description',
      did: 'did',
      fundManagerId: 'fund_manager_id',
      isAssetIssuer: 'is_asset_issuer',
      isEquityConsumer: 'is_equity_consumer',
      isEquityProvider: 'is_equity_provider',
      profitLossBalance: 'profit_loss_balance',
      provision: 'provision',
      status: 'status',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      adminId: 'string',
      description: 'string',
      did: 'string',
      fundManagerId: 'string',
      isAssetIssuer: 'boolean',
      isEquityConsumer: 'boolean',
      isEquityProvider: 'boolean',
      profitLossBalance: 'string',
      provision: Provision,
      status: 'number',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户
export class User extends $tea.Model {
  // 用户分布式身份ID
  did?: string;
  // 用户的链外身份ID
  localId?: string;
  // 用户公钥
  pk?: string;
  // 租户ID
  tenantId?: string;
  // 用户ID
  userId?: string;
  // 用户VC
  vc?: string;
  static names(): { [key: string]: string } {
    return {
      did: 'did',
      localId: 'local_id',
      pk: 'pk',
      tenantId: 'tenant_id',
      userId: 'user_id',
      vc: 'vc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      did: 'string',
      localId: 'string',
      pk: 'string',
      tenantId: 'string',
      userId: 'string',
      vc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoCardCreateRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 交易信息
  tx?: Transaction;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      tx: 'tx',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      tx: Transaction,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoCardCreateResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 卡密ID
  cardId?: string;
  // 创建卡密的交易hash
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      cardId: 'card_id',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      cardId: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoCardQueryRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 交易信息
  tx?: Transaction;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      tx: 'tx',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      tx: Transaction,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoCardQueryResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 卡密信息对象
  card?: Card;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      card: 'card',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      card: Card,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoCardBindnameRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 交易内容
  tx?: Transaction;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      tx: 'tx',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      tx: Transaction,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoCardBindnameResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ExecBaasAntdaoCardChargeRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 交易信息
  tx?: Transaction;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      tx: 'tx',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      tx: Transaction,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoCardChargeResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ExecBaasAntdaoCardWriteoffRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 交易信息
  tx?: Transaction;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      tx: 'tx',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      tx: Transaction,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoCardWriteoffResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ExecBaasAntdaoCardExpiredRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 交易信息
  tx?: Transaction;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      tx: 'tx',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      tx: Transaction,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoCardExpiredResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ExecBaasAntdaoCardForbiddenRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 交易信息
  tx?: Transaction;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      tx: 'tx',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      tx: Transaction,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoCardForbiddenResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ExecBaasAntdaoCardChargeresetRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 交易信息
  tx?: Transaction;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      tx: 'tx',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      tx: Transaction,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoCardChargeresetResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryBaasAntdaoMerchantUserRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 商户管理下的用户ID
  localId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      localId: 'local_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      localId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoMerchantUserResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 用户完整信息
  // {
  //             "tenant_id": "ZKUA",
  //             "user_id": "331f9b0922f940f464d4b94b5628180408ac305b7fc72d3e40f5b7727d0702fb",
  //             "local_id": "user01",
  //             "did": "",
  //             "vc": "",
  //             "pk": "3280b948a7fa8525c0fbfd47d1df75d7a7ee9f3baedd6964565b42f461dd86732717c4bc4c8203ea2b9b1aeef7b148644babba3c0cd6927c4c0964919f590c6c"
  //         }
  // 
  user?: User;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      user: 'user',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      user: User,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasAntdaoMerchantUserRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 用户的did信息
  did?: string;
  // 用户外部ID
  localId?: string;
  // 外部交易ID
  outTxId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      did: 'did',
      localId: 'local_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      did: 'string',
      localId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasAntdaoMerchantUserResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryBaasAntdaoMerchantRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 币种
  currency?: string;
  // 要代理操作的租户ID
  delegatedTenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      currency: 'currency',
      delegatedTenantId: 'delegated_tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      currency: 'string',
      delegatedTenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoMerchantResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 查询商户信息时的区块高度
  blockNumber?: number;
  // 商户完整信息
  // {
  //             "tenant_id": "Z",
  //             "did": "did:mychain:ct",
  //             "admin_id": "ed7b3acb718e2f91bc8fab6a5e7cc3c061",
  //             "fund_manager_id": "b7ecd55bde04827b3e611a741d",
  //             "description": "SK",
  //             "is_equity_provider": true,
  //             "is_equity_consumer": true,
  //             "is_asset_issuer": true,
  //             "status": 0,
  //             "provision": {
  //                 "currency": "CNY",
  //                 "debit": "99999999.0000",
  //                 "credit_max": "99999999.0000",
  //                 "credit_used": "0.0000"
  //             }
  //         }
  merchant?: Merchant;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      blockNumber: 'block_number',
      merchant: 'merchant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      blockNumber: 'number',
      merchant: Merchant,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadBaasAntdaoImageRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 图片MIME类型，目前仅支持 image/jpeg
  contentType?: string;
  // 要代理操作的租户ID
  delegatedTenantId?: string;
  // 图片信息（base64编码）
  image?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      contentType: 'content_type',
      delegatedTenantId: 'delegated_tenant_id',
      image: 'image',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      contentType: 'string',
      delegatedTenantId: 'string',
      image: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadBaasAntdaoImageResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 临时可访问的url，过期时间2小时
  temporaryUrl?: string;
  // 图片的不可访问url，发布权益时使用
  url?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      temporaryUrl: 'temporary_url',
      url: 'url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      temporaryUrl: 'string',
      url: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetBaasAntdaoPkiPublickeyRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 商户管理员/其用户的链上账户ID
  accountId?: string;
  // 商户管理员/其用户归属的租户ID
  optTenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      accountId: 'account_id',
      optTenantId: 'opt_tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      accountId: 'string',
      optTenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetBaasAntdaoPkiPublickeyResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 公钥字符串（base64）
  publicKey?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      publicKey: 'public_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      publicKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoPkiEncryptRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 商户管理员/其用户的链上账户ID
  accountId?: string;
  // 明文（base64编码）
  content?: string;
  // 商户管理员/其用户归属的租户ID
  optTenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      accountId: 'account_id',
      content: 'content',
      optTenantId: 'opt_tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      accountId: 'string',
      content: 'string',
      optTenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoPkiEncryptResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 密文 base64编码 
  encryptedContent?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      encryptedContent: 'encrypted_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      encryptedContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoPkiDecryptRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 商户管理员/其用户的链上账户ID
  accountId?: string;
  // 要代理操作的租户ID
  delegatedTenantId?: string;
  // 密文（base64）
  encryptedContent?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      accountId: 'account_id',
      delegatedTenantId: 'delegated_tenant_id',
      encryptedContent: 'encrypted_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      accountId: 'string',
      delegatedTenantId: 'string',
      encryptedContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoPkiDecryptResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 明文
  content?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasAntdaoMerchantFriendRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 友好商户租户ID
  friendTenantId?: string;
  // 外部交易ID
  outTxId?: string;
  // 更新类型
  type?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      friendTenantId: 'friend_tenant_id',
      outTxId: 'out_tx_id',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      friendTenantId: 'string',
      outTxId: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasAntdaoMerchantFriendResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateBaasAntdaoEquityRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 授权类型 0 Auto，1Contract
  authType?: number;
  // 链ID
  chainId?: string;
  // 结算币种
  currency?: string;
  // 权益价格（单位：元）
  defaultPrice?: string;
  // 代理操作专用，要代理操作的租户ID
  delegatedTenantId?: string;
  // 权益商品详情信息
  description?: string;
  // 权益商品详情图。上传仅接受链接，请使用OSS存储服务上传图片(;分隔)
  descImages?: string;
  // 权益商品名称
  equityName?: string;
  // 权益商品类型：类型为整型（不大于：2147483647），需要进行细分，类型由三部分组成；aabbbbcccc。aa 为大类分类，bbbb 为细项分类（无细项分类时为0000），cccc 为数据格式分类（其中0000表示无格式要求）。请根据实际商品类型填写，具体类型和兑换时数据结构查看文档【https://tech.antfin.com/docs/2/163896】 
  equityType?: number;
  // 字段决定权益商品是否全量链上客户可见，当选择权益为false时，需要使用baas.antdao.equity.merchant.open接口增加权益商品可见客户
  ifPublic?: boolean;
  // 权益商品主图。上传仅接受链接，请使用OSS存储服务上传图片(;分隔)
  images?: string;
  // 商户每日兑换上限
  limitPerMerchantAndDay?: number;
  // 商户每月兑换上限
  limitPerMerchantAndMonth?: number;
  // 用户每日兑换上限
  limitPerUserAndDay?: number;
  // 用户每月兑换上限
  limitPerUserAndMonth?: number;
  // 若需要兑换方提供的特殊信息，可增加在备注字段，并要求兑换方是否传入（按照需求方自定义内容信息）
  // - 如必须传入证件号，手机号信息，则权益需要通过运营平台审核，非必须采集信息将拒绝上架
  memo?: string;
  // 外部交易ID
  outTxId?: string;
  // 权益商品库存数量
  totalCount?: string;
  // 权益商品使用有效期右闭区间（毫秒）
  useValidNotAfter?: number;
  // 权益商品使用有效期左闭区间（毫秒）
  useValidNotBefore?: number;
  // 权益商品兑换有效期右闭区间（毫秒）
  validNotAfter?: number;
  // 权益商品兑换有效期左闭区间（毫秒）
  validNotBefore?: number;
  // 权益商品面值（单位：元）
  value?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      authType: 'auth_type',
      chainId: 'chain_id',
      currency: 'currency',
      defaultPrice: 'default_price',
      delegatedTenantId: 'delegated_tenant_id',
      description: 'description',
      descImages: 'desc_images',
      equityName: 'equity_name',
      equityType: 'equity_type',
      ifPublic: 'if_public',
      images: 'images',
      limitPerMerchantAndDay: 'limit_per_merchant_and_day',
      limitPerMerchantAndMonth: 'limit_per_merchant_and_month',
      limitPerUserAndDay: 'limit_per_user_and_day',
      limitPerUserAndMonth: 'limit_per_user_and_month',
      memo: 'memo',
      outTxId: 'out_tx_id',
      totalCount: 'total_count',
      useValidNotAfter: 'use_valid_not_after',
      useValidNotBefore: 'use_valid_not_before',
      validNotAfter: 'valid_not_after',
      validNotBefore: 'valid_not_before',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      authType: 'number',
      chainId: 'string',
      currency: 'string',
      defaultPrice: 'string',
      delegatedTenantId: 'string',
      description: 'string',
      descImages: 'string',
      equityName: 'string',
      equityType: 'number',
      ifPublic: 'boolean',
      images: 'string',
      limitPerMerchantAndDay: 'number',
      limitPerMerchantAndMonth: 'number',
      limitPerUserAndDay: 'number',
      limitPerUserAndMonth: 'number',
      memo: 'string',
      outTxId: 'string',
      totalCount: 'string',
      useValidNotAfter: 'number',
      useValidNotBefore: 'number',
      validNotAfter: 'number',
      validNotBefore: 'number',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasAntdaoEquityResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 请求ID，用于查询异步发布权益结果
  createEquityRequestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      createEquityRequestId: 'create_equity_request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      createEquityRequestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OfflineBaasAntdaoEquityRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 权益商品ID
  equityId?: string;
  // 外部交易ID
  outTxId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      equityId: 'equity_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      equityId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OfflineBaasAntdaoEquityResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class FreezeBaasAntdaoEquityRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 权益商品ID
  equityId?: string;
  // 外部交易ID
  outTxId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      equityId: 'equity_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      equityId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FreezeBaasAntdaoEquityResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class OpenBaasAntdaoEquityMerchantRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 代理操作专用，要代理操作的租户ID
  delegatedTenantId?: string;
  // 权益商品ID
  equityId?: string;
  // 被授权的租户ID
  optTenantId?: string;
  // 更新操作，添加或者删除
  optType?: string;
  // 外部交易ID
  outTxId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      delegatedTenantId: 'delegated_tenant_id',
      equityId: 'equity_id',
      optTenantId: 'opt_tenant_id',
      optType: 'opt_type',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      delegatedTenantId: 'string',
      equityId: 'string',
      optTenantId: 'string',
      optType: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OpenBaasAntdaoEquityMerchantResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class AuthBaasAntdaoEquityMerchantuserpriceRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 用户兑换价格（单位：元）。价格和比例二选一，且只能填写一个。
  amount?: string;
  // 链ID
  chainId?: string;
  // 代理操作专用，要代理操作的租户ID
  delegatedTenantId?: string;
  // 权益商品ID
  equityId?: string;
  // 操作用户
  optTenantId?: string;
  // 外部交易ID
  outTxId?: string;
  // 比例。价格和比例二选一，且只能填写一个。
  ratio?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      amount: 'amount',
      chainId: 'chain_id',
      delegatedTenantId: 'delegated_tenant_id',
      equityId: 'equity_id',
      optTenantId: 'opt_tenant_id',
      outTxId: 'out_tx_id',
      ratio: 'ratio',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      amount: 'string',
      chainId: 'string',
      delegatedTenantId: 'string',
      equityId: 'string',
      optTenantId: 'string',
      outTxId: 'string',
      ratio: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthBaasAntdaoEquityMerchantuserpriceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UpdateBaasAntdaoEquityDefaultpriceRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 价格
  amount?: string;
  // 链ID
  chainId?: string;
  // 代理操作专用，要代理操作的租户ID
  delegatedTenantId?: string;
  // 权益商品ID
  equityId?: string;
  // 外部交易ID
  outTxId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      amount: 'amount',
      chainId: 'chain_id',
      delegatedTenantId: 'delegated_tenant_id',
      equityId: 'equity_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      amount: 'string',
      chainId: 'string',
      delegatedTenantId: 'string',
      equityId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasAntdaoEquityDefaultpriceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UpdateBaasAntdaoEquityTenantpriceRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 价格（单位：元）
  amount?: string;
  // 链ID
  chainId?: string;
  // 要代理操作的租户ID
  delegatedTenantId?: string;
  // 权益商品ID
  equityId?: string;
  // 定向价格租户ID
  optTenantId?: string;
  // 外部交易ID
  outTxId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      amount: 'amount',
      chainId: 'chain_id',
      delegatedTenantId: 'delegated_tenant_id',
      equityId: 'equity_id',
      optTenantId: 'opt_tenant_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      amount: 'string',
      chainId: 'string',
      delegatedTenantId: 'string',
      equityId: 'string',
      optTenantId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasAntdaoEquityTenantpriceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class AddBaasAntdaoEquityCountRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 权益库存数量
  amount?: number;
  // 链ID
  chainId?: string;
  // 代理操作专用，要代理操作的租户ID
  delegatedTenantId?: string;
  // 权益商品ID
  equityId?: string;
  // 外部交易ID
  outTxId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      amount: 'amount',
      chainId: 'chain_id',
      delegatedTenantId: 'delegated_tenant_id',
      equityId: 'equity_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      amount: 'number',
      chainId: 'string',
      delegatedTenantId: 'string',
      equityId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddBaasAntdaoEquityCountResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UpdateBaasAntdaoEquityExchangelimitRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 代理操作专用，要代理操作的租户ID
  delegatedTenantId?: string;
  // 权益商品ID
  equityId?: string;
  // 商户每日兑换上限
  limitPerMerchantAndDay?: number;
  // 商户每月兑换上限
  limitPerMerchantAndMontn?: number;
  // 用户每日兑换上限
  limitPerUserAndDay?: number;
  // 用户每月兑换上限
  limitPerUserAndMonth?: number;
  // 外部交易ID
  outTxId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      delegatedTenantId: 'delegated_tenant_id',
      equityId: 'equity_id',
      limitPerMerchantAndDay: 'limit_per_merchant_and_day',
      limitPerMerchantAndMontn: 'limit_per_merchant_and_montn',
      limitPerUserAndDay: 'limit_per_user_and_day',
      limitPerUserAndMonth: 'limit_per_user_and_month',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      delegatedTenantId: 'string',
      equityId: 'string',
      limitPerMerchantAndDay: 'number',
      limitPerMerchantAndMontn: 'number',
      limitPerUserAndDay: 'number',
      limitPerUserAndMonth: 'number',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasAntdaoEquityExchangelimitResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UpdateBaasAntdaoEquityValidtimeRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 要代理的租户ID
  delegatedTenantId?: string;
  // 权益商品ID
  equityId?: string;
  // 外部交易ID
  outTxId?: string;
  // 权益商品使用有效期右闭区间
  useValidNotAfter?: string;
  // 权益商品使用有效期左闭区间
  useValidNotBefore?: string;
  // 权益商品兑换有效期右闭区间
  validNotAfter?: string;
  // 权益商品兑换有效期左闭区间
  validNotBefore?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      delegatedTenantId: 'delegated_tenant_id',
      equityId: 'equity_id',
      outTxId: 'out_tx_id',
      useValidNotAfter: 'use_valid_not_after',
      useValidNotBefore: 'use_valid_not_before',
      validNotAfter: 'valid_not_after',
      validNotBefore: 'valid_not_before',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      delegatedTenantId: 'string',
      equityId: 'string',
      outTxId: 'string',
      useValidNotAfter: 'string',
      useValidNotBefore: 'string',
      validNotAfter: 'string',
      validNotBefore: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasAntdaoEquityValidtimeResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryBaasAntdaoEquityRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 要代理操作的租户ID
  delegatedTenantId?: string;
  // 权益商品ID
  equityId?: string;
  // 被检索商户ID
  optTenantId?: string;
  // 交易限制日期(yyyyMMdd或yyyyMM)(可选)
  targetDate?: string;
  // 被检索用户ID
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      delegatedTenantId: 'delegated_tenant_id',
      equityId: 'equity_id',
      optTenantId: 'opt_tenant_id',
      targetDate: 'target_date',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      delegatedTenantId: 'string',
      equityId: 'string',
      optTenantId: 'string',
      targetDate: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoEquityResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 权益商品完整信息: equityType 权益类型：0积分，1卡券，2实物。 status 权益状态：0可用状态，1下线，2冻结。 authType 权益授权类型：0自动，1合约。
  //  { "equity_id": "6041f851f4d", "tenant_id": "ZEJEZKUA", "admin_id": "ed7b3ac3c061", "equity_type": 1, "equity_name": "FDCardtest", "description": "FDCard", "total_count": "1000000", "status": 0, "auth_type": 0, "currency": "CNY", "value": "10.0000", "default_price": "1.0000", "images": "oss://myexchange/12593acf32dd6d4257fa0.jpeg", "desc_images": "", "memo": "", "is_public": true, "valid_not_before": 112692, "valid_not_after": 112654365244, "use_valid_not_before": 112612, "use_valid_not_after": 11265436524415235, "limit_per_user_and_day": 1000000, "limit_per_user_and_month": 100000, "limit_per_merchant_and_day": 1000000, "limit_per_merchant_and_month": 1000000, "equity_ext_info": { "open_to_tenant_id": "", "tenant_price": "", "tenant_user_price": { "snapshot_tenant_price": "", "user_price_type": 0, "price": "", "ratio": "" }, "target_date": "", "limit_per_day_used": 0, "limit_per_month_used": 0 } }
  equity?: Equity;
  // 权益图片的永久oss地址
  urls?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      equity: 'equity',
      urls: 'urls',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      equity: Equity,
      urls: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoExchangeByuserRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 资产ID
  assetId?: string;
  // 资产发行方
  assetIssuer?: string;
  // 期望资产汇率
  assetRate?: string;
  // 链ID
  chainId?: string;
  // 代理操作专用，要代理操作的租户ID
  delegatedTenantId?: string;
  // 权益商品ID
  equityId?: string;
  // 权益商品提供方ID
  equityProvider?: string;
  // 期望权益汇率
  equityRate?: string;
  // 兑换时必要信息，敏感信息需加密。兑换时必要的信息，敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
  memo?: string;
  // 外部交易ID
  outTxId?: string;
  // 用户ID
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      assetId: 'asset_id',
      assetIssuer: 'asset_issuer',
      assetRate: 'asset_rate',
      chainId: 'chain_id',
      delegatedTenantId: 'delegated_tenant_id',
      equityId: 'equity_id',
      equityProvider: 'equity_provider',
      equityRate: 'equity_rate',
      memo: 'memo',
      outTxId: 'out_tx_id',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      assetId: 'string',
      assetIssuer: 'string',
      assetRate: 'string',
      chainId: 'string',
      delegatedTenantId: 'string',
      equityId: 'string',
      equityProvider: 'string',
      equityRate: 'string',
      memo: 'string',
      outTxId: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoExchangeByuserResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ExecBaasAntdaoExchangeBymerchantRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 资产ID
  assetId?: string;
  // 当前希望按照上述比例扣减用户资产
  assetRate?: string;
  // 链ID
  chainId?: string;
  // 权益商品ID，例：7f1be9108651f97513b5b59030f5b059e58a59d263ab426cbf26337f91642caa
  equityId?: string;
  // 期望权益商品价格（单位：元）
  equityPrice?: string;
  // 兑换时必要的信息，敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
  // 比如在兑换手机直充商品时，需要对{"countryCode": "86", "phone": "13900000000"} 使用供应商的公钥进行加密。
  memo?: string;
  // 权益商品兑换外部流水ID，调用方自定义流水ID
  outTxId?: string;
  // 采购商如果绑定了附加的公私钥对。在兑换商品时需要对SHA256(out_tx_id+tenant_id+asset_id+equity_id+equity_price+asset_rate+user_id+memo)使用ECC K1私钥签名（算法ECDSAWithSHA256，曲线Secp256K1），并转换为Hex。
  txSig?: string;
  // 受益用户ID
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      assetId: 'asset_id',
      assetRate: 'asset_rate',
      chainId: 'chain_id',
      equityId: 'equity_id',
      equityPrice: 'equity_price',
      memo: 'memo',
      outTxId: 'out_tx_id',
      txSig: 'tx_sig',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      assetId: 'string',
      assetRate: 'string',
      chainId: 'string',
      equityId: 'string',
      equityPrice: 'string',
      memo: 'string',
      outTxId: 'string',
      txSig: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoExchangeBymerchantResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ConfirmBaasAntdaoExchangeRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 要代理操作的租户ID
  delegatedTenantId?: string;
  // 权益商品ID
  equityId?: string;
  // 附言。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
  memo?: string;
  // 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
  originTxId?: string;
  // 外部交易ID
  outTxId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      delegatedTenantId: 'delegated_tenant_id',
      equityId: 'equity_id',
      memo: 'memo',
      originTxId: 'origin_tx_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      delegatedTenantId: 'string',
      equityId: 'string',
      memo: 'string',
      originTxId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmBaasAntdaoExchangeResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ExecBaasAntdaoExchangeOutofstoreRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 要代理操作的租户ID
  delegatedTenantId?: string;
  // 权益商品ID
  equityId?: string;
  // 缺货时通知给采购方的信息，若敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
  memo?: string;
  // 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
  originTxId?: string;
  // 外部交易ID
  outTxId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      delegatedTenantId: 'delegated_tenant_id',
      equityId: 'equity_id',
      memo: 'memo',
      originTxId: 'origin_tx_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      delegatedTenantId: 'string',
      equityId: 'string',
      memo: 'string',
      originTxId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoExchangeOutofstoreResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class SendBaasAntdaoExchangeRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 要代理操作的租户ID
  delegatedTenantId?: string;
  // 权益商品ID
  equityId?: string;
  // 发货商品的信息，敏感信息需加密，使用收货方公钥加密的权益信息。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896。比如在手机直充时可以返回 {  "voucher": "充值凭证，如有",  "memo": ""}信息。
  memo?: string;
  // 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
  originTxId?: string;
  // 外部交易ID
  outTxId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      delegatedTenantId: 'delegated_tenant_id',
      equityId: 'equity_id',
      memo: 'memo',
      originTxId: 'origin_tx_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      delegatedTenantId: 'string',
      equityId: 'string',
      memo: 'string',
      originTxId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendBaasAntdaoExchangeResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ExecBaasAntdaoExchangeReceivebyuserRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 要代理操作的租户ID
  delegatedTenantId?: string;
  // 收货时的信息，若敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
  memo?: string;
  // 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
  originTxId?: string;
  // 外部交易ID
  outTxId?: string;
  // 用户ID
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      delegatedTenantId: 'delegated_tenant_id',
      memo: 'memo',
      originTxId: 'origin_tx_id',
      outTxId: 'out_tx_id',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      delegatedTenantId: 'string',
      memo: 'string',
      originTxId: 'string',
      outTxId: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoExchangeReceivebyuserResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ExecBaasAntdaoAssetExpireRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 数量
  amount?: number;
  // 资产ID
  assetId?: string;
  // 链ID
  chainId?: string;
  // 资产过期信息
  info?: string;
  // 过期的交易ID
  originalTxId?: string;
  // 外部交易ID，每个租户保证唯一
  outTxId?: string;
  // 用户ID
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      amount: 'amount',
      assetId: 'asset_id',
      chainId: 'chain_id',
      info: 'info',
      originalTxId: 'original_tx_id',
      outTxId: 'out_tx_id',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      amount: 'number',
      assetId: 'string',
      chainId: 'string',
      info: 'string',
      originalTxId: 'string',
      outTxId: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoAssetExpireResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryBaasAntdaoAssetInstructionRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 资产流水ID
  originTxId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      originTxId: 'origin_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      originTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoAssetInstructionResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 资产流水完整信息的json字符串。
  // direction 交易方向:：0正向交易，1反向交易。
  // type 交易类型：0 资产发行；1资产赎回；2资产发放；3资产发放回退；4资产风控调整；5资产过期；6资产支付；7资产支付退款。
  // status流水状态(Complete)；0完成
  instruction?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      instruction: 'instruction',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      instruction: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoExchangeInstructionRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 权益商品ID
  equityId?: string;
  // 发起操作的租户ID
  optTenantId?: string;
  // 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
  originTxId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      equityId: 'equity_id',
      optTenantId: 'opt_tenant_id',
      originTxId: 'origin_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      equityId: 'string',
      optTenantId: 'string',
      originTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoExchangeInstructionResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 权益兑换流水完整信息
  instruction?: EInstruction;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      instruction: 'instruction',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      instruction: EInstruction,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoAssetIssueRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 充值数量
  amount?: number;
  // 资产ID
  assetId?: string;
  // 链ID
  chainId?: string;
  // 备注信息
  info?: string;
  // 充值租户ID
  optTenantId?: string;
  // 外部交易ID
  outTxId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      amount: 'amount',
      assetId: 'asset_id',
      chainId: 'chain_id',
      info: 'info',
      optTenantId: 'opt_tenant_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      amount: 'number',
      assetId: 'string',
      chainId: 'string',
      info: 'string',
      optTenantId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoAssetIssueResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ExecBaasAntdaoAssetRedeemRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 赎回数量
  amount?: number;
  // 资产ID
  assetId?: string;
  // 链ID
  chainId?: string;
  // 备注信息
  info?: string;
  // 要赎回的充值交易ID
  originTxId?: string;
  // 外部交易ID
  outTxId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      amount: 'amount',
      assetId: 'asset_id',
      chainId: 'chain_id',
      info: 'info',
      originTxId: 'origin_tx_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      amount: 'number',
      assetId: 'string',
      chainId: 'string',
      info: 'string',
      originTxId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoAssetRedeemResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ExecBaasAntdaoAssetGrantRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 数量
  amount?: string;
  // 资产ID
  assetId?: string;
  // 链ID
  chainId?: string;
  // 资产发放信息
  info?: string;
  // 商户ID
  merchantId?: string;
  // 外部交易ID
  outTxId?: string;
  // 用户ID
  userId?: string;
  // 有效时间
  validityTime?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      amount: 'amount',
      assetId: 'asset_id',
      chainId: 'chain_id',
      info: 'info',
      merchantId: 'merchant_id',
      outTxId: 'out_tx_id',
      userId: 'user_id',
      validityTime: 'validity_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      amount: 'string',
      assetId: 'string',
      chainId: 'string',
      info: 'string',
      merchantId: 'string',
      outTxId: 'string',
      userId: 'string',
      validityTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoAssetGrantResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ExecBaasAntdaoAssetGrantrefundRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 数量
  amount?: number;
  // 资产ID
  assetId?: string;
  // 链ID
  chainId?: string;
  // 备注信息
  info?: string;
  // 要回退的交易ID
  originTxId?: string;
  // 外部交易ID
  outTxId?: string;
  // 用户ID
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      amount: 'amount',
      assetId: 'asset_id',
      chainId: 'chain_id',
      info: 'info',
      originTxId: 'origin_tx_id',
      outTxId: 'out_tx_id',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      amount: 'number',
      assetId: 'string',
      chainId: 'string',
      info: 'string',
      originTxId: 'string',
      outTxId: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoAssetGrantrefundResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ExecBaasAntdaoAssetAdjustRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 风控调整数量
  amount?: number;
  // 资产ID
  assetId?: string;
  // 链ID
  chainId?: string;
  // 风控调整信息
  info?: string;
  // 外部交易ID，每个租户保证唯一
  outTxId?: string;
  // 用户ID
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      amount: 'amount',
      assetId: 'asset_id',
      chainId: 'chain_id',
      info: 'info',
      outTxId: 'out_tx_id',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      amount: 'number',
      assetId: 'string',
      chainId: 'string',
      info: 'string',
      outTxId: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoAssetAdjustResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryBaasAntdaoAssetRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 资产ID
  assetId?: string;
  // 链ID
  chainId?: string;
  // 资产查询相关的租户ID
  optTenantId?: string;
  // 若要查询用户持有的资产数量，输入用户ID
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      assetId: 'asset_id',
      chainId: 'chain_id',
      optTenantId: 'opt_tenant_id',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      assetId: 'string',
      chainId: 'string',
      optTenantId: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoAssetResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 资产完整信息
  // {
  //             "asset_id": "CT::Asset001",
  //             "asset_name": "CTPoints",
  //             "tenant_id": "OREDKOCN",
  //             "admin_id": "f46857d8796fc2b829862e2752bda38f7eefeec5581ad41398002f50a3ad8ccd",
  //             "currency": "CNY",
  //             "asset_rate": "1000.0000",
  //             "total_issue_balance": "11111111.0000",
  //             "issue_account_balance": "0.0000",
  //             "relay_Account_balance": "0.0000",
  //             "receive_payment_account_balance": "0.0000",
  //             "overdue_recovery_account_balance": "",
  //             "status": 76,
  //             "asset_ext_info": {
  //                 "dispense_tenant_id": "",
  //                 "dispense_balance": "",
  //                 "user_id": "",
  //                 "user_credit_balance": ""
  //             }
  //         }
  asset?: Asset;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      asset: 'asset',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      asset: Asset,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoExchangeReceivebymerchantRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 权益商品ID
  equityId?: string;
  // 收货时的信息，若敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
  memo?: string;
  // 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
  originTxId?: string;
  // 外部交易ID
  outTxId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      equityId: 'equity_id',
      memo: 'memo',
      originTxId: 'origin_tx_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      equityId: 'string',
      memo: 'string',
      originTxId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoExchangeReceivebymerchantResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryBaasAntdaoBlockRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 区块链高度
  blockNumber?: number;
  // 链ID
  chainId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      blockNumber: 'block_number',
      chainId: 'chain_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      blockNumber: 'number',
      chainId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoBlockResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 区块信息
  block?: Block;
  // 区块高度
  blockNumber?: number;
  // 链ID
  chainId?: string;
  // 过滤后的交易数量
  filteredTxCount?: number;
  // 区块中交易总数
  totalTxCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      block: 'block',
      blockNumber: 'block_number',
      chainId: 'chain_id',
      filteredTxCount: 'filtered_tx_count',
      totalTxCount: 'total_tx_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      block: Block,
      blockNumber: 'number',
      chainId: 'string',
      filteredTxCount: 'number',
      totalTxCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoBlockLastblocknumberRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoBlockLastblocknumberResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 最新区块高度
  lastBlockNumber?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      lastBlockNumber: 'last_block_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      lastBlockNumber: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasAntdaoEquityRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 授权类型：0 Auto，1 Contract
  authType?: number;
  // 链ID
  chainId?: string;
  // 货币类型
  currency?: string;
  // 默认价格（单位：元）
  defaultPrice?: string;
  // 要代理的租户ID
  delegatedTenantId?: string;
  // 权益商品详细描述信息
  description?: string;
  // 描述图片信息(;分隔)
  descImages?: string;
  // 权益商品ID
  equityId?: string;
  // 权益商品名称
  equityName?: string;
  // 权益商品类型：类型为整型（不大于：2147483647），需要进行细分，类型由三部分组成；aabbbbcccc。aa 为大类分类，bbbb 为细项分类（无细项分类时为0000），cccc 为数据格式分类（其中0000表示无格式要求）。请根据实际商品类型填写，具体类型和兑换时数据结构查看文档【https://tech.antfin.com/docs/2/163896】
  equityType?: number;
  // 权益商品是否公开
  ifPublic?: boolean;
  // 主图片信息(;分隔)
  images?: string;
  // 商户每日兑换上限
  limitPerMerchantAndDay?: number;
  // 商户每月兑换上限
  limitPerMerchantAndMonth?: number;
  // 用户每日兑换上限
  limitPerUserAndDay?: number;
  // 用户每月兑换上限
  limitPerUserAndMonth?: number;
  // 附言
  memo?: string;
  // 交易ID
  outTxId?: string;
  // 库存
  totalCount?: string;
  // 权益商品使用有效期右闭区间
  useValidNotAfter?: number;
  // 权益商品使用有效期左闭区间
  useValidNotBefore?: number;
  // 权益商品兑换有效期右闭区间
  validNotAfter?: number;
  // 权益商品兑换有效期左闭区间
  validNotBefore?: number;
  // 面值（单位：元）
  value?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      authType: 'auth_type',
      chainId: 'chain_id',
      currency: 'currency',
      defaultPrice: 'default_price',
      delegatedTenantId: 'delegated_tenant_id',
      description: 'description',
      descImages: 'desc_images',
      equityId: 'equity_id',
      equityName: 'equity_name',
      equityType: 'equity_type',
      ifPublic: 'if_public',
      images: 'images',
      limitPerMerchantAndDay: 'limit_per_merchant_and_day',
      limitPerMerchantAndMonth: 'limit_per_merchant_and_month',
      limitPerUserAndDay: 'limit_per_user_and_day',
      limitPerUserAndMonth: 'limit_per_user_and_month',
      memo: 'memo',
      outTxId: 'out_tx_id',
      totalCount: 'total_count',
      useValidNotAfter: 'use_valid_not_after',
      useValidNotBefore: 'use_valid_not_before',
      validNotAfter: 'valid_not_after',
      validNotBefore: 'valid_not_before',
      value: 'value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      authType: 'number',
      chainId: 'string',
      currency: 'string',
      defaultPrice: 'string',
      delegatedTenantId: 'string',
      description: 'string',
      descImages: 'string',
      equityId: 'string',
      equityName: 'string',
      equityType: 'number',
      ifPublic: 'boolean',
      images: 'string',
      limitPerMerchantAndDay: 'number',
      limitPerMerchantAndMonth: 'number',
      limitPerUserAndDay: 'number',
      limitPerUserAndMonth: 'number',
      memo: 'string',
      outTxId: 'string',
      totalCount: 'string',
      useValidNotAfter: 'number',
      useValidNotBefore: 'number',
      validNotAfter: 'number',
      validNotBefore: 'number',
      value: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasAntdaoEquityResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryBaasAntdaoEquityCreateresultRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 异步发布权益结果查询ID
  createEquityRequestId?: string;
  // 要代理操作的租户ID
  delegatedTenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      createEquityRequestId: 'create_equity_request_id',
      delegatedTenantId: 'delegated_tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      createEquityRequestId: 'string',
      delegatedTenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoEquityCreateresultResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 权益商品创建成功，返回权益ID
  equityId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      equityId: 'equity_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      equityId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoEquityInstructionRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 代理该租户调用接口，会使用该租户发送交易链上查询信息
  delegatedTenantId?: string;
  // 权益商品ID
  equityId?: string;
  // 发起操作的租户ID
  optTenantId?: string;
  // 要查询的流水交易号
  originTxId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      delegatedTenantId: 'delegated_tenant_id',
      equityId: 'equity_id',
      optTenantId: 'opt_tenant_id',
      originTxId: 'origin_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      delegatedTenantId: 'string',
      equityId: 'string',
      optTenantId: 'string',
      originTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoEquityInstructionResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 商品兑换流水信息
  instruction?: EInstruction;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      instruction: 'instruction',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      instruction: EInstruction,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoImageRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 要查询的图片数组，填入不可访问的url
  urls?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      urls: 'urls',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      urls: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoImageResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 临时可访问的oss图片链接，每张图片会返回四个url，对应原图和不同的比例缩小，每一张图片的四个url用;隔开。
  urls?: MultiURL[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      urls: 'urls',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      urls: { 'type': 'array', 'itemType': MultiURL },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasAntdaoEquityStatusRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 要代理操作的租户ID
  delegatedTenantId?: string;
  // 权益商品ID
  equityId?: string;
  // 外部交易ID
  outTxId?: string;
  // 权益状态：0可用，1下线，2冻结
  status?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      delegatedTenantId: 'delegated_tenant_id',
      equityId: 'equity_id',
      outTxId: 'out_tx_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      delegatedTenantId: 'string',
      equityId: 'string',
      outTxId: 'string',
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasAntdaoEquityStatusResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class SetBaasAntdaoMerchantProvisionRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 新的授信上限（单位：元）
  creditMaxAmount?: string;
  // 新的授信已使用数额（单位：元）
  creditUsedAmount?: string;
  // 币种
  currency?: string;
  // 新的备付金余额（单位：元）
  debitAmount?: string;
  // 要设置备付金的商户租户ID
  optTenantId?: string;
  // 初始的授信上限（单位：元）
  originalCreditMaxAmount?: string;
  // 初始的授信已使用数额（单位：元）
  originalCreditUsedAmount?: string;
  // 初始的备付金余额（单位：元）
  originalDebitAmount?: string;
  // 外部交易ID（确保幂等）
  outTxId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      creditMaxAmount: 'credit_max_amount',
      creditUsedAmount: 'credit_used_amount',
      currency: 'currency',
      debitAmount: 'debit_amount',
      optTenantId: 'opt_tenant_id',
      originalCreditMaxAmount: 'original_credit_max_amount',
      originalCreditUsedAmount: 'original_credit_used_amount',
      originalDebitAmount: 'original_debit_amount',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      creditMaxAmount: 'string',
      creditUsedAmount: 'string',
      currency: 'string',
      debitAmount: 'string',
      optTenantId: 'string',
      originalCreditMaxAmount: 'string',
      originalCreditUsedAmount: 'string',
      originalDebitAmount: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetBaasAntdaoMerchantProvisionResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UpdateBaasAntdaoMerchantProvisionRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 更新授信上限
  creditMaxAmount?: string;
  // 更新授信已使用数额
  creditUsedAmount?: string;
  // 币种
  currency?: string;
  // 更新余额
  debitAmount?: string;
  // 要设置备付金的商户租户ID
  optTenantId?: string;
  // 操作类型，ADD表示增加，SUB表示减少
  optType?: string;
  // 外部交易ID
  outTxId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      creditMaxAmount: 'credit_max_amount',
      creditUsedAmount: 'credit_used_amount',
      currency: 'currency',
      debitAmount: 'debit_amount',
      optTenantId: 'opt_tenant_id',
      optType: 'opt_type',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      creditMaxAmount: 'string',
      creditUsedAmount: 'string',
      currency: 'string',
      debitAmount: 'string',
      optTenantId: 'string',
      optType: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasAntdaoMerchantProvisionResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ExecBaasAntdaoEquityInstructionwriteoffRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 权益商品ID
  equityId?: string;
  // 附言
  memo?: string;
  // 兑换交易ID
  originTxId?: string;
  // 外部交易ID
  outTxId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      equityId: 'equity_id',
      memo: 'memo',
      originTxId: 'origin_tx_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      equityId: 'string',
      memo: 'string',
      originTxId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoEquityInstructionwriteoffResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryBaasAntdaoMerchantProvisionsRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 行为
  businessAction?: string;
  // 要查询的租户ID
  optTenantId?: string;
  // 产品编码
  productCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      businessAction: 'business_action',
      optTenantId: 'opt_tenant_id',
      productCode: 'product_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      businessAction: 'string',
      optTenantId: 'string',
      productCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoMerchantProvisionsResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 租户的备付金列表信息
  discreteValues?: DiscreteValue[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      discreteValues: 'discrete_values',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      discreteValues: { 'type': 'array', 'itemType': DiscreteValue },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoMerchantExchangeableequitylistRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 页码
  pageNumber?: string;
  // 每页数量（不填默认返回50条数据）
  pageSize?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      pageNumber: 'page_number',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      pageNumber: 'string',
      pageSize: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoMerchantExchangeableequitylistResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 可兑换商品信息列表
  object?: ExchangeableEquityList;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      object: 'object',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      object: ExchangeableEquityList,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoMerchantExchangeableequitydetailRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 商品SKUID
  skuId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      skuId: 'sku_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      skuId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoMerchantExchangeableequitydetailResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 可兑换的商品详情信息
  equity?: EquityDetail;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      equity: 'equity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      equity: EquityDetail,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoAssetCreateRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 资产ID
  assetId?: string;
  // 资产名称
  assetName?: string;
  // 链ID
  chainId?: string;
  // 资产绑定币种
  currency?: string;
  // 为该租户创建新资产
  optTenantId?: string;
  // 外部交易ID
  outTxId?: string;
  // 资产汇率(等值一元钱的数量)
  rate?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      assetId: 'asset_id',
      assetName: 'asset_name',
      chainId: 'chain_id',
      currency: 'currency',
      optTenantId: 'opt_tenant_id',
      outTxId: 'out_tx_id',
      rate: 'rate',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      assetId: 'string',
      assetName: 'string',
      chainId: 'string',
      currency: 'string',
      optTenantId: 'string',
      outTxId: 'string',
      rate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoAssetCreateResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ExecBaasAntdaoAssetGenerateRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 铸币数量
  amount?: string;
  // 资产ID
  assetId?: string;
  // 链ID
  chainId?: string;
  // 外部交易ID
  outTxId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      amount: 'amount',
      assetId: 'asset_id',
      chainId: 'chain_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      amount: 'string',
      assetId: 'string',
      chainId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoAssetGenerateResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateBaasAntdaoMerchantRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 商户描述，不超过2048
  description?: string;
  // 商户的资金管理员 归属的租户ID
  fundManagerTenantId?: string;
  // 商户角色，是否是资产发行商
  ifAssetIssuer?: boolean;
  // 商户角色，是否是采购商
  ifEquityConsumer?: boolean;
  // 商户角色，是否是供应商
  ifEquityProvider?: boolean;
  // 商户归属的租户ID
  optTenantId?: string;
  // 外部交易ID（确保幂等）
  outTxId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      description: 'description',
      fundManagerTenantId: 'fund_manager_tenant_id',
      ifAssetIssuer: 'if_asset_issuer',
      ifEquityConsumer: 'if_equity_consumer',
      ifEquityProvider: 'if_equity_provider',
      optTenantId: 'opt_tenant_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      description: 'string',
      fundManagerTenantId: 'string',
      ifAssetIssuer: 'boolean',
      ifEquityConsumer: 'boolean',
      ifEquityProvider: 'boolean',
      optTenantId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasAntdaoMerchantResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class SetBaasAntdaoMerchantFundmanagerRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 资金管理员所属的租户ID
  fundManagerTenantId?: string;
  // 要进行资金管理员设置的租户ID
  optTenantId?: string;
  // 外部交易ID
  outTxId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      fundManagerTenantId: 'fund_manager_tenant_id',
      optTenantId: 'opt_tenant_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      fundManagerTenantId: 'string',
      optTenantId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetBaasAntdaoMerchantFundmanagerResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateBaasAntdaoMerchantProvisionRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 备付金账户币种
  currency?: string;
  // 要创建备付金账户的租户ID
  optTenantId?: string;
  // 外部交易ID，确保幂等
  outTxId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      currency: 'currency',
      optTenantId: 'opt_tenant_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      currency: 'string',
      optTenantId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBaasAntdaoMerchantProvisionResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryBaasAntdaoConfigDelegaterelationRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 被代理的租户ID
  delegatedTenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      delegatedTenantId: 'delegated_tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      delegatedTenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoConfigDelegaterelationResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 代理授权关系信息
  delegateRelationInfos?: DelegateRelationInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      delegateRelationInfos: 'delegate_relation_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      delegateRelationInfos: { 'type': 'array', 'itemType': DelegateRelationInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasAntdaoConfigDelegaterelationRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 被代理的租户ID
  delegatedTenantId?: string;
  // 代理租户ID
  optTenantId?: string;
  // 操作类型，ADD表示添加，SUB表示撤销
  optType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      delegatedTenantId: 'delegated_tenant_id',
      optTenantId: 'opt_tenant_id',
      optType: 'opt_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      delegatedTenantId: 'string',
      optTenantId: 'string',
      optType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasAntdaoConfigDelegaterelationResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryBaasAntdaoConfigWhitelistRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 查询链的白名单信息
  chainId?: string;
  // 查询该租户的白名单信息
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoConfigWhitelistResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 接口白名单信息
  whiteList?: APIWhiteListInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      whiteList: 'white_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      whiteList: { 'type': 'array', 'itemType': APIWhiteListInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasAntdaoConfigWhitelistRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 租户ID
  optTenantId?: string;
  // 操作类型
  optType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      optTenantId: 'opt_tenant_id',
      optType: 'opt_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      optTenantId: 'string',
      optType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasAntdaoConfigWhitelistResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ApplyBaasAntdaoExchangeAftersaleRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链id
  chainId?: string;
  // 权益商品id
  equityId?: string;
  // 额外信息 可选
  memo?: string;
  // 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
  originTxId?: string;
  // 外部交易ID
  outTxId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      equityId: 'equity_id',
      memo: 'memo',
      originTxId: 'origin_tx_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      equityId: 'string',
      memo: 'string',
      originTxId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyBaasAntdaoExchangeAftersaleResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ExecBaasAntdaoExchangeAgreeaftersaleRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链id
  chainId?: string;
  // 要代理操作的租户ID
  delegatedTenantId?: string;
  // 权益id
  equityId?: string;
  // 额外信息
  memo?: string;
  // 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
  originTxId?: string;
  // 外部交易ID
  outTxId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      delegatedTenantId: 'delegated_tenant_id',
      equityId: 'equity_id',
      memo: 'memo',
      originTxId: 'origin_tx_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      delegatedTenantId: 'string',
      equityId: 'string',
      memo: 'string',
      originTxId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoExchangeAgreeaftersaleResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class RefuseBaasAntdaoExchangeAftersaleRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // l链id
  chainId?: string;
  // 要代理操作的租户ID
  delegatedTenantId?: string;
  // 商品id
  equityId?: string;
  // 额外信息
  memo?: string;
  // 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
  originTxId?: string;
  // 外部交易id
  outTxId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      delegatedTenantId: 'delegated_tenant_id',
      equityId: 'equity_id',
      memo: 'memo',
      originTxId: 'origin_tx_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      delegatedTenantId: 'string',
      equityId: 'string',
      memo: 'string',
      originTxId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RefuseBaasAntdaoExchangeAftersaleResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class SendBaasAntdaoExchangeAftersaleRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链id
  chainId?: string;
  // 要代理操作的租户ID
  delegatedTenantId?: string;
  // 商品id
  equityId?: string;
  // 发货商品的信息，敏感信息需加密，使用收货方公钥加密的权益信息。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896。比如在手机直充时可以返回 {  "voucher": "充值凭证，如有",  "memo": ""}信息。
  memo?: string;
  // 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
  originTxId?: string;
  // 外部交易id
  outTxId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      delegatedTenantId: 'delegated_tenant_id',
      equityId: 'equity_id',
      memo: 'memo',
      originTxId: 'origin_tx_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      delegatedTenantId: 'string',
      equityId: 'string',
      memo: 'string',
      originTxId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendBaasAntdaoExchangeAftersaleResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ConfirmBaasAntdaoExchangeAftersaleRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链id
  chainId?: string;
  // 商品id
  equityId?: string;
  // 收货时的信息，若敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
  memo?: string;
  // 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
  originTxId?: string;
  // 外部交易id
  outTxId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      equityId: 'equity_id',
      memo: 'memo',
      originTxId: 'origin_tx_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      equityId: 'string',
      memo: 'string',
      originTxId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmBaasAntdaoExchangeAftersaleResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ExecBaasAntdaoDataDepositRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 交易信息
  tx?: Transaction;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      tx: 'tx',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      tx: Transaction,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoDataDepositResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 存证交易哈希
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetBaasAntdaoCommissionRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 手续费列表，可传入多个
  commissions?: Commission[];
  // 商品类型。可按照如下文档查询商品对应的类型，及数据格式 https://tech.antfin.com/docs/2/163896
  equityType?: number;
  // 是否设置全局手续费。若是false，需传入optTenantId
  ifGlobal?: boolean;
  // 要设置手续费的租户对象，如果为空表示设置全局手续费（IfGlobal需设置为true）
  optTenantId?: string;
  // 交易幂等ID
  outTxId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      commissions: 'commissions',
      equityType: 'equity_type',
      ifGlobal: 'if_global',
      optTenantId: 'opt_tenant_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      commissions: { 'type': 'array', 'itemType': Commission },
      equityType: 'number',
      ifGlobal: 'boolean',
      optTenantId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetBaasAntdaoCommissionResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 手续费ID
  commissionId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      commissionId: 'commission_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      commissionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoCommissionRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 查询该租户的手续费信息
  delegatedTenantId?: string;
  // 商品类型。可按照如下文档查询商品对应的类型，及数据格式https://tech.antfin.com/docs/2/163896
  equityType?: number;
  // 是否查询当前生效的手续费信息。如为false，则查询该商品的全部手续费信息
  ifCurrent?: boolean;
  // 是否查询全局的手续费信息
  ifGlobal?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      delegatedTenantId: 'delegated_tenant_id',
      equityType: 'equity_type',
      ifCurrent: 'if_current',
      ifGlobal: 'if_global',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      delegatedTenantId: 'string',
      equityType: 'number',
      ifCurrent: 'boolean',
      ifGlobal: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoCommissionResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 手续费信息列表
  commissions?: CommissionResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      commissions: 'commissions',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      commissions: { 'type': 'array', 'itemType': CommissionResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetBaasAntdaoCommissionMerchantRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 收取手续费的商户对应的租户ID
  optTenantId?: string;
  // 交易幂等ID
  outTxId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      optTenantId: 'opt_tenant_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      optTenantId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetBaasAntdaoCommissionMerchantResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryBaasAntdaoCommissionMerchantRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoCommissionMerchantResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 收取手续费的商户 租户ID
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoBlockanalysisBlockRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 区块高度
  blockNumber?: number;
  // 链ID
  chainId?: string;
  // 代理查询区块信息，传入代理租户需有代理权限。接口会返回调用者和被代理租户能查看的所有交易信息。
  delegatedTenantIds?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      blockNumber: 'block_number',
      chainId: 'chain_id',
      delegatedTenantIds: 'delegated_tenant_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      blockNumber: 'number',
      chainId: 'string',
      delegatedTenantIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoBlockanalysisBlockResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 区块信息
  block?: Block;
  // 区块高度
  blockNumber?: number;
  // 链ID
  chainId?: string;
  // 过滤后的交易数量
  filteredTxCount?: number;
  // 区块中交易总数
  totalTxCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      block: 'block',
      blockNumber: 'block_number',
      chainId: 'chain_id',
      filteredTxCount: 'filtered_tx_count',
      totalTxCount: 'total_tx_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      block: Block,
      blockNumber: 'number',
      chainId: 'string',
      filteredTxCount: 'number',
      totalTxCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoBlockanalysisLastblocknumberRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoBlockanalysisLastblocknumberResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 区块链最高区块高度
  blockNumber?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      blockNumber: 'block_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      blockNumber: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoBlockanalysisOpenedequitiesRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 每页数据量
  count?: number;
  // 页数
  page?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      count: 'count',
      page: 'page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      count: 'number',
      page: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoBlockanalysisOpenedequitiesResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 权益商品信息详细信息list
  equities?: OpenedEquity[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      equities: 'equities',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      equities: { 'type': 'array', 'itemType': OpenedEquity },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoBlockanalysisUserpriceupdatedequitiesRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 每页数量
  count?: number;
  // 页码
  page?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      count: 'count',
      page: 'page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      count: 'number',
      page: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoBlockanalysisUserpriceupdatedequitiesResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 权益商品信息详细信息list
  equities?: UserPriceEquity[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      equities: 'equities',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      equities: { 'type': 'array', 'itemType': UserPriceEquity },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoBlockanalysisUnwriteoffvalueRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 资产ID
  assetId?: string;
  // 链ID
  chainId?: string;
  // 要查询的租户ID
  optTenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      assetId: 'asset_id',
      chainId: 'chain_id',
      optTenantId: 'opt_tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      assetId: 'string',
      chainId: 'string',
      optTenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoBlockanalysisUnwriteoffvalueResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 资产ID
  assetId?: string;
  // 租户ID
  tenantId?: string;
  // 未核销的资产总额（单位：元）
  totalValue?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      assetId: 'asset_id',
      tenantId: 'tenant_id',
      totalValue: 'total_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      assetId: 'string',
      tenantId: 'string',
      totalValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasAntdaoBlockanalysisDelegaterelationRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 被代理的租户ID
  delegatedTenantId?: string;
  // 代理租户ID
  optTenantId?: string;
  // 操作类型，ADD表示添加，SUB表示撤销
  optType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      delegatedTenantId: 'delegated_tenant_id',
      optTenantId: 'opt_tenant_id',
      optType: 'opt_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      delegatedTenantId: 'string',
      optTenantId: 'string',
      optType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasAntdaoBlockanalysisDelegaterelationResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UpdateBaasAntdaoBlockanalysisWhitelistRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 租户ID
  optTenantId?: string;
  // 操作类型
  optType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      optTenantId: 'opt_tenant_id',
      optType: 'opt_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      optTenantId: 'string',
      optType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBaasAntdaoBlockanalysisWhitelistResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryBaasAntdaoBlockanalysisDelegaterelationRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 被代理的租户ID
  delegatedTenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      delegatedTenantId: 'delegated_tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      delegatedTenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoBlockanalysisDelegaterelationResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 代理授权关系信息
  delegateRelationInfos?: DelegateRelationInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      delegateRelationInfos: 'delegate_relation_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      delegateRelationInfos: { 'type': 'array', 'itemType': DelegateRelationInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoBlockanalysisWhitelistRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 查询链的白名单信息
  chainId?: string;
  // 查询该租户的白名单信息
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoBlockanalysisWhitelistResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 接口白名单信息
  whiteList?: APIWhiteListInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      whiteList: 'white_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      whiteList: { 'type': 'array', 'itemType': APIWhiteListInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoBlockanalysisTransactionRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 交易hash
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoBlockanalysisTransactionResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 区块高度
  blockNumber?: number;
  // 交易数据，hex格式
  data?: string;
  // 交易发起方
  from?: string;
  // 交易单据信息
  receipt?: BlockReceipt;
  // 交易时间戳
  timestamp?: string;
  // 交易接收方
  to?: string;
  // 交易hash
  txHash?: string;
  // 交易类型
  txType?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      blockNumber: 'block_number',
      data: 'data',
      from: 'from',
      receipt: 'receipt',
      timestamp: 'timestamp',
      to: 'to',
      txHash: 'tx_hash',
      txType: 'tx_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      blockNumber: 'number',
      data: 'string',
      from: 'string',
      receipt: BlockReceipt,
      timestamp: 'string',
      to: 'string',
      txHash: 'string',
      txType: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoMypointsSkuRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 区块链ID
  chainId?: string;
  // 环境标识
  env?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      env: 'env',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      env: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoMypointsSkuResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 商品列表
  skus?: SKUItem[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      skus: 'skus',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      skus: { 'type': 'array', 'itemType': SKUItem },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoMypointsMerchantbalanceRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 环境标识
  env?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      env: 'env',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      env: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoMypointsMerchantbalanceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 积分库可用余额
  budgetAvailableBalance?: number;
  // 预算库余额
  budgetBalance?: number;
  // 预算库代码
  budgetCode?: string;
  // 商户的支付宝商家ID
  pid?: string;
  // 积分库余额
  pointLibBalance?: number;
  // 积分库代码
  pointLibCode?: string;
  // 商户的金融云租户ID
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      budgetAvailableBalance: 'budget_available_balance',
      budgetBalance: 'budget_balance',
      budgetCode: 'budget_code',
      pid: 'pid',
      pointLibBalance: 'point_lib_balance',
      pointLibCode: 'point_lib_code',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      budgetAvailableBalance: 'number',
      budgetBalance: 'number',
      budgetCode: 'string',
      pid: 'string',
      pointLibBalance: 'number',
      pointLibCode: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoMypointsPreorderskuRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 预下单数量
  count?: number;
  // 环境标识
  env?: string;
  // 备注
  memo?: string;
  // 业务幂等号，商户需要保证每笔订单号唯一
  orderNo?: string;
  // 商品ID
  skuId?: string;
  // 总花费花费(询价接口结果) 
  totalCost?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      count: 'count',
      env: 'env',
      memo: 'memo',
      orderNo: 'order_no',
      skuId: 'sku_id',
      totalCost: 'total_cost',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      count: 'number',
      env: 'string',
      memo: 'string',
      orderNo: 'string',
      skuId: 'string',
      totalCost: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoMypointsPreorderskuResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 数量
  count?: number;
  // 是否需要重试
  needRetry?: boolean;
  // 业务幂等ID
  orderNo?: string;
  // 预下单Id
  preOrderId?: string;
  // 商品ID
  skuId?: string;
  // 总集分宝数量(单位:个)
  totalAmount?: number;
  // 总费用
  totalCost?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      count: 'count',
      needRetry: 'need_retry',
      orderNo: 'order_no',
      preOrderId: 'pre_order_id',
      skuId: 'sku_id',
      totalAmount: 'total_amount',
      totalCost: 'total_cost',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      count: 'number',
      needRetry: 'boolean',
      orderNo: 'string',
      preOrderId: 'string',
      skuId: 'string',
      totalAmount: 'number',
      totalCost: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoMypointsOrderskuRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 环境标识
  env?: string;
  // 业务幂等号
  orderNo?: string;
  // 手机号
  phoneNumber?: string;
  // 预下单号
  preOrderId?: string;
  // 商品ID
  skuId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      env: 'env',
      orderNo: 'order_no',
      phoneNumber: 'phone_number',
      preOrderId: 'pre_order_id',
      skuId: 'sku_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      env: 'string',
      orderNo: 'string',
      phoneNumber: 'string',
      preOrderId: 'string',
      skuId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecBaasAntdaoMypointsOrderskuResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 卡密ID
  cardId?: string;
  // 集分宝卡密的面值(单位:个)
  cardValue?: number;
  // 是否需要重试
  needRetry?: boolean;
  // 业务幂等ID
  orderNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      cardId: 'card_id',
      cardValue: 'card_value',
      needRetry: 'need_retry',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      cardId: 'string',
      cardValue: 'number',
      needRetry: 'boolean',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoMypointsSkufeeRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 预下单数量
  count?: number;
  // 环境标识(sandbox/prod)
  env?: string;
  // 备注信息
  memo?: string;
  // 业务幂等号
  orderNo?: string;
  // 商品ID
  skuId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      count: 'count',
      env: 'env',
      memo: 'memo',
      orderNo: 'order_no',
      skuId: 'sku_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      count: 'number',
      env: 'string',
      memo: 'string',
      orderNo: 'string',
      skuId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoMypointsSkufeeResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 预下单的数量
  count?: number;
  // 费率
  rate?: string;
  // 商品ID
  skuId?: string;
  // 总集分宝数量（个）
  totalAmount?: number;
  // 总费用
  totalCost?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      count: 'count',
      rate: 'rate',
      skuId: 'sku_id',
      totalAmount: 'total_amount',
      totalCost: 'total_cost',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      count: 'number',
      rate: 'string',
      skuId: 'string',
      totalAmount: 'number',
      totalCost: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoMypointsPreorderinstructionRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 环境标识
  env?: string;
  // 业务幂等ID
  orderNo?: string;
  // 商品ID
  skuId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      env: 'env',
      orderNo: 'order_no',
      skuId: 'sku_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      env: 'string',
      orderNo: 'string',
      skuId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoMypointsPreorderinstructionResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 业务请求单号
  bizId?: string;
  // 商家的预算库代码
  budgetCode?: string;
  // 链ID
  chainId?: string;
  // 环境标识
  env?: string;
  // 扩展信息
  extendInfo?: string;
  // 备注信息
  memo?: string;
  // 商家在支付宝域的标识
  pid?: string;
  // 集分宝SKU预下单ID
  preOrderId?: string;
  // 集分宝产品码
  productCode?: string;
  // 订单中剩余的可下单商品数量
  remainCount?: number;
  // 包含集分宝数量(个)
  skuAmount?: number;
  // 集分宝SKU的ID
  skuId?: string;
  // SKU面值
  skuValue?: string;
  // 流水状态(0初始状态, 1采购失败可重试, 2采购失败不可重试, 3采购成功, 4预算库创建失败可重试, 5预算库创建失败不可重试, 6预算库叉棍见成功, 7预算调拨失败可重试, 8预算库调拨失败不可重试, 9预算库调拨成功)
  status?: number;
  // 商户在金融云的租户ID
  tenantId?: string;
  // 总下单集分宝数量
  totalAmount?: number;
  // 集分宝SKU的预下单数量
  totalCount?: number;
  // 总下单金额
  totalValue?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizId: 'biz_id',
      budgetCode: 'budget_code',
      chainId: 'chain_id',
      env: 'env',
      extendInfo: 'extend_info',
      memo: 'memo',
      pid: 'pid',
      preOrderId: 'pre_order_id',
      productCode: 'product_code',
      remainCount: 'remain_count',
      skuAmount: 'sku_amount',
      skuId: 'sku_id',
      skuValue: 'sku_value',
      status: 'status',
      tenantId: 'tenant_id',
      totalAmount: 'total_amount',
      totalCount: 'total_count',
      totalValue: 'total_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizId: 'string',
      budgetCode: 'string',
      chainId: 'string',
      env: 'string',
      extendInfo: 'string',
      memo: 'string',
      pid: 'string',
      preOrderId: 'string',
      productCode: 'string',
      remainCount: 'number',
      skuAmount: 'number',
      skuId: 'string',
      skuValue: 'string',
      status: 'number',
      tenantId: 'string',
      totalAmount: 'number',
      totalCount: 'number',
      totalValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoMypointsOrderinstructionRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链ID
  chainId?: string;
  // 环境标识
  env?: string;
  // 业务幂等号
  orderNo?: string;
  // SKU ID
  skuId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      chainId: 'chain_id',
      env: 'env',
      orderNo: 'order_no',
      skuId: 'sku_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      chainId: 'string',
      env: 'string',
      orderNo: 'string',
      skuId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBaasAntdaoMypointsOrderinstructionResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 业务请求单号
  bizId?: string;
  // 链ID
  chainId?: string;
  // 环境标识
  env?: string;
  // 扩展信息
  extendInfo?: string;
  // 订单ID(env+chain_id+tenant_id+sku_id+biz_id)
  orderId?: string;
  // 预下单ID
  preOrderId?: string;
  // 包含集分宝数量(个)
  skuAmount?: number;
  // SKU ID
  skuId?: string;
  // 面值
  skuValue?: string;
  // 状态(0:初始,1:失败可重试,2:失败不可重试,3:成功)
  status?: number;
  // 商家在金融云的租户ID
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      bizId: 'biz_id',
      chainId: 'chain_id',
      env: 'env',
      extendInfo: 'extend_info',
      orderId: 'order_id',
      preOrderId: 'pre_order_id',
      skuAmount: 'sku_amount',
      skuId: 'sku_id',
      skuValue: 'sku_value',
      status: 'status',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      bizId: 'string',
      chainId: 'string',
      env: 'string',
      extendInfo: 'string',
      orderId: 'string',
      preOrderId: 'string',
      skuAmount: 'number',
      skuId: 'string',
      skuValue: 'string',
      status: 'number',
      tenantId: 'string',
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
    this._readTimeout = config.readTimeout;
    this._connectTimeout = config.connectTimeout;
    this._httpProxy = config.httpProxy;
    this._httpsProxy = config.httpsProxy;
    this._noProxy = config.noProxy;
    this._socks5Proxy = config.socks5Proxy;
    this._socks5NetWork = config.socks5NetWork;
    this._maxIdleConns = config.maxIdleConns;
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
  async doRequest(version: string, action: string, protocol: string, method: string, pathname: string, request: {[key: string]: any}, runtime: $Util.RuntimeOptions): Promise<{[key: string]: any}> {
    let _runtime: { [key: string]: any } = {
      timeouted: "retry",
      readTimeout: Util.defaultNumber(runtime.readTimeout, this._readTimeout),
      connectTimeout: Util.defaultNumber(runtime.connectTimeout, this._connectTimeout),
      httpProxy: Util.defaultString(runtime.httpProxy, this._httpProxy),
      httpsProxy: Util.defaultString(runtime.httpsProxy, this._httpsProxy),
      noProxy: Util.defaultString(runtime.noProxy, this._noProxy),
      maxIdleConns: Util.defaultNumber(runtime.maxIdleConns, this._maxIdleConns),
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
          req_time: AlipayUtil.getTimestamp(),
          req_msg_id: Util.getNonce(),
          access_key: this._accessKeyId,
          charset: "UTF-8",
          baseSdkVersion: "Tea-SDK",
          sdkVersion: "Tea-SDK-20200713",
        };
        if (!Util.empty(this._securityToken)) {
          request_.query["security_token"] = this._securityToken;
        }

        request_.headers = {
          host: this._endpoint,
          'user-agent': this.getUserAgent(),
        };
        let tmp = Util.anyifyMapValue(RPCUtil.query(request));
        request_.body = new $tea.BytesReadable(Util.toFormString(tmp));
        request_.headers["content-type"] = "application/x-www-form-urlencoded";
        let signedParam = {
          ...request_.query,
          ...RPCUtil.query(request),
        };
        request_.query["sign"] = AlipayUtil.getSignature(signedParam, this._accessKeySecret);
        _lastRequest = request_;
        let response_ = await $tea.doAction(request_, _runtime);

        let obj = await Util.readAsJSON(response_.body);
        let res = Util.assertAsMap(obj);
        let resp = Util.assertAsMap(res["response"]);
        if (AlipayUtil.hasError(res)) {
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
   * Get user agent
   * @return user agent
   */
  getUserAgent(): string {
    let userAgent = "TeaClient/1.0.0";
    return Util.getUserAgent(userAgent);
  }

  /**
   * Description: 创建卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-消费卡服务-创建卡密
   */
  async execBaasAntdaoCardCreate(request: ExecBaasAntdaoCardCreateRequest): Promise<ExecBaasAntdaoCardCreateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.execBaasAntdaoCardCreateEx(request, runtime);
  }

  /**
   * Description: 创建卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-消费卡服务-创建卡密
   */
  async execBaasAntdaoCardCreateEx(request: ExecBaasAntdaoCardCreateRequest, runtime: $Util.RuntimeOptions): Promise<ExecBaasAntdaoCardCreateResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBaasAntdaoCardCreateResponse>(await this.doRequest("1.0", "baas.antdao.card.create.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ExecBaasAntdaoCardCreateResponse({}));
  }

  /**
   * Description: 查询卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-消费卡服务-查询卡密
   */
  async execBaasAntdaoCardQuery(request: ExecBaasAntdaoCardQueryRequest): Promise<ExecBaasAntdaoCardQueryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.execBaasAntdaoCardQueryEx(request, runtime);
  }

  /**
   * Description: 查询卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-消费卡服务-查询卡密
   */
  async execBaasAntdaoCardQueryEx(request: ExecBaasAntdaoCardQueryRequest, runtime: $Util.RuntimeOptions): Promise<ExecBaasAntdaoCardQueryResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBaasAntdaoCardQueryResponse>(await this.doRequest("1.0", "baas.antdao.card.query.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ExecBaasAntdaoCardQueryResponse({}));
  }

  /**
   * Description: 记名卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-消费卡服务-记名卡发行
   */
  async execBaasAntdaoCardBindname(request: ExecBaasAntdaoCardBindnameRequest): Promise<ExecBaasAntdaoCardBindnameResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.execBaasAntdaoCardBindnameEx(request, runtime);
  }

  /**
   * Description: 记名卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-消费卡服务-记名卡发行
   */
  async execBaasAntdaoCardBindnameEx(request: ExecBaasAntdaoCardBindnameRequest, runtime: $Util.RuntimeOptions): Promise<ExecBaasAntdaoCardBindnameResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBaasAntdaoCardBindnameResponse>(await this.doRequest("1.0", "baas.antdao.card.bindname.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ExecBaasAntdaoCardBindnameResponse({}));
  }

  /**
   * Description: 充值卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-消费卡服务-充值卡密
   */
  async execBaasAntdaoCardCharge(request: ExecBaasAntdaoCardChargeRequest): Promise<ExecBaasAntdaoCardChargeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.execBaasAntdaoCardChargeEx(request, runtime);
  }

  /**
   * Description: 充值卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-消费卡服务-充值卡密
   */
  async execBaasAntdaoCardChargeEx(request: ExecBaasAntdaoCardChargeRequest, runtime: $Util.RuntimeOptions): Promise<ExecBaasAntdaoCardChargeResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBaasAntdaoCardChargeResponse>(await this.doRequest("1.0", "baas.antdao.card.charge.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ExecBaasAntdaoCardChargeResponse({}));
  }

  /**
   * Description: 核销卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-消费卡服务-核销卡密
   */
  async execBaasAntdaoCardWriteoff(request: ExecBaasAntdaoCardWriteoffRequest): Promise<ExecBaasAntdaoCardWriteoffResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.execBaasAntdaoCardWriteoffEx(request, runtime);
  }

  /**
   * Description: 核销卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-消费卡服务-核销卡密
   */
  async execBaasAntdaoCardWriteoffEx(request: ExecBaasAntdaoCardWriteoffRequest, runtime: $Util.RuntimeOptions): Promise<ExecBaasAntdaoCardWriteoffResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBaasAntdaoCardWriteoffResponse>(await this.doRequest("1.0", "baas.antdao.card.writeoff.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ExecBaasAntdaoCardWriteoffResponse({}));
  }

  /**
   * Description: 过期卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-消费卡服务-过期卡密
   */
  async execBaasAntdaoCardExpired(request: ExecBaasAntdaoCardExpiredRequest): Promise<ExecBaasAntdaoCardExpiredResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.execBaasAntdaoCardExpiredEx(request, runtime);
  }

  /**
   * Description: 过期卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-消费卡服务-过期卡密
   */
  async execBaasAntdaoCardExpiredEx(request: ExecBaasAntdaoCardExpiredRequest, runtime: $Util.RuntimeOptions): Promise<ExecBaasAntdaoCardExpiredResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBaasAntdaoCardExpiredResponse>(await this.doRequest("1.0", "baas.antdao.card.expired.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ExecBaasAntdaoCardExpiredResponse({}));
  }

  /**
   * Description: 风控禁用卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-消费卡服务-风控禁用卡密
   */
  async execBaasAntdaoCardForbidden(request: ExecBaasAntdaoCardForbiddenRequest): Promise<ExecBaasAntdaoCardForbiddenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.execBaasAntdaoCardForbiddenEx(request, runtime);
  }

  /**
   * Description: 风控禁用卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-消费卡服务-风控禁用卡密
   */
  async execBaasAntdaoCardForbiddenEx(request: ExecBaasAntdaoCardForbiddenRequest, runtime: $Util.RuntimeOptions): Promise<ExecBaasAntdaoCardForbiddenResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBaasAntdaoCardForbiddenResponse>(await this.doRequest("1.0", "baas.antdao.card.forbidden.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ExecBaasAntdaoCardForbiddenResponse({}));
  }

  /**
   * Description: 充值重置卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-消费卡服务-充值重置卡密
   */
  async execBaasAntdaoCardChargereset(request: ExecBaasAntdaoCardChargeresetRequest): Promise<ExecBaasAntdaoCardChargeresetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.execBaasAntdaoCardChargeresetEx(request, runtime);
  }

  /**
   * Description: 充值重置卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-消费卡服务-充值重置卡密
   */
  async execBaasAntdaoCardChargeresetEx(request: ExecBaasAntdaoCardChargeresetRequest, runtime: $Util.RuntimeOptions): Promise<ExecBaasAntdaoCardChargeresetResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBaasAntdaoCardChargeresetResponse>(await this.doRequest("1.0", "baas.antdao.card.chargereset.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ExecBaasAntdaoCardChargeresetResponse({}));
  }

  /**
   * Description: 查询调用商户下的用户信息
   * Summary: 数字商品服务-商户管理-查询用户信息
   */
  async queryBaasAntdaoMerchantUser(request: QueryBaasAntdaoMerchantUserRequest): Promise<QueryBaasAntdaoMerchantUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasAntdaoMerchantUserEx(request, runtime);
  }

  /**
   * Description: 查询调用商户下的用户信息
   * Summary: 数字商品服务-商户管理-查询用户信息
   */
  async queryBaasAntdaoMerchantUserEx(request: QueryBaasAntdaoMerchantUserRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasAntdaoMerchantUserResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasAntdaoMerchantUserResponse>(await this.doRequest("1.0", "baas.antdao.merchant.user.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasAntdaoMerchantUserResponse({}));
  }

  /**
   * Description: 创建商户管理下的用户
   * Summary: 数字商品服务-商户管理-商户创建用户
   */
  async createBaasAntdaoMerchantUser(request: CreateBaasAntdaoMerchantUserRequest): Promise<CreateBaasAntdaoMerchantUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createBaasAntdaoMerchantUserEx(request, runtime);
  }

  /**
   * Description: 创建商户管理下的用户
   * Summary: 数字商品服务-商户管理-商户创建用户
   */
  async createBaasAntdaoMerchantUserEx(request: CreateBaasAntdaoMerchantUserRequest, runtime: $Util.RuntimeOptions): Promise<CreateBaasAntdaoMerchantUserResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBaasAntdaoMerchantUserResponse>(await this.doRequest("1.0", "baas.antdao.merchant.user.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateBaasAntdaoMerchantUserResponse({}));
  }

  /**
   * Description: 查询管理员创建的商户信息（可查询自身的商户信息）
   * Summary: 数字商品服务-商户管理-查询商户信息
   */
  async queryBaasAntdaoMerchant(request: QueryBaasAntdaoMerchantRequest): Promise<QueryBaasAntdaoMerchantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasAntdaoMerchantEx(request, runtime);
  }

  /**
   * Description: 查询管理员创建的商户信息（可查询自身的商户信息）
   * Summary: 数字商品服务-商户管理-查询商户信息
   */
  async queryBaasAntdaoMerchantEx(request: QueryBaasAntdaoMerchantRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasAntdaoMerchantResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasAntdaoMerchantResponse>(await this.doRequest("1.0", "baas.antdao.merchant.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasAntdaoMerchantResponse({}));
  }

  /**
   * Description: 上传图片到OSS，以备风控检查。仅权益发行方可使用，采购方不可使用。上传的图片单张不超过1M。
   * Summary: 数字商品服务-OSS服务-上传图片
   */
  async uploadBaasAntdaoImage(request: UploadBaasAntdaoImageRequest): Promise<UploadBaasAntdaoImageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.uploadBaasAntdaoImageEx(request, runtime);
  }

  /**
   * Description: 上传图片到OSS，以备风控检查。仅权益发行方可使用，采购方不可使用。上传的图片单张不超过1M。
   * Summary: 数字商品服务-OSS服务-上传图片
   */
  async uploadBaasAntdaoImageEx(request: UploadBaasAntdaoImageRequest, runtime: $Util.RuntimeOptions): Promise<UploadBaasAntdaoImageResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadBaasAntdaoImageResponse>(await this.doRequest("1.0", "baas.antdao.image.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UploadBaasAntdaoImageResponse({}));
  }

  /**
   * Description: 获取kms中对应用户的公钥
   * Summary: 数字商品服务-密钥管理-获取用户公钥
   */
  async getBaasAntdaoPkiPublickey(request: GetBaasAntdaoPkiPublickeyRequest): Promise<GetBaasAntdaoPkiPublickeyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.getBaasAntdaoPkiPublickeyEx(request, runtime);
  }

  /**
   * Description: 获取kms中对应用户的公钥
   * Summary: 数字商品服务-密钥管理-获取用户公钥
   */
  async getBaasAntdaoPkiPublickeyEx(request: GetBaasAntdaoPkiPublickeyRequest, runtime: $Util.RuntimeOptions): Promise<GetBaasAntdaoPkiPublickeyResponse> {
    Util.validateModel(request);
    return $tea.cast<GetBaasAntdaoPkiPublickeyResponse>(await this.doRequest("1.0", "baas.antdao.pki.publickey.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new GetBaasAntdaoPkiPublickeyResponse({}));
  }

  /**
   * Description: ECC公钥加密接口
   * Summary: 数字商品服务-密钥管理-公钥加密
   */
  async execBaasAntdaoPkiEncrypt(request: ExecBaasAntdaoPkiEncryptRequest): Promise<ExecBaasAntdaoPkiEncryptResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.execBaasAntdaoPkiEncryptEx(request, runtime);
  }

  /**
   * Description: ECC公钥加密接口
   * Summary: 数字商品服务-密钥管理-公钥加密
   */
  async execBaasAntdaoPkiEncryptEx(request: ExecBaasAntdaoPkiEncryptRequest, runtime: $Util.RuntimeOptions): Promise<ExecBaasAntdaoPkiEncryptResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBaasAntdaoPkiEncryptResponse>(await this.doRequest("1.0", "baas.antdao.pki.encrypt.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ExecBaasAntdaoPkiEncryptResponse({}));
  }

  /**
   * Description: ECC解密算法接口
   * Summary: 数字商品服务-密钥管理-私钥解密
   */
  async execBaasAntdaoPkiDecrypt(request: ExecBaasAntdaoPkiDecryptRequest): Promise<ExecBaasAntdaoPkiDecryptResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.execBaasAntdaoPkiDecryptEx(request, runtime);
  }

  /**
   * Description: ECC解密算法接口
   * Summary: 数字商品服务-密钥管理-私钥解密
   */
  async execBaasAntdaoPkiDecryptEx(request: ExecBaasAntdaoPkiDecryptRequest, runtime: $Util.RuntimeOptions): Promise<ExecBaasAntdaoPkiDecryptResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBaasAntdaoPkiDecryptResponse>(await this.doRequest("1.0", "baas.antdao.pki.decrypt.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ExecBaasAntdaoPkiDecryptResponse({}));
  }

  /**
   * Description: 更新商户的友商信息
   * Summary: 数字商品服务-商户管理-更新商户友商
   */
  async updateBaasAntdaoMerchantFriend(request: UpdateBaasAntdaoMerchantFriendRequest): Promise<UpdateBaasAntdaoMerchantFriendResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateBaasAntdaoMerchantFriendEx(request, runtime);
  }

  /**
   * Description: 更新商户的友商信息
   * Summary: 数字商品服务-商户管理-更新商户友商
   */
  async updateBaasAntdaoMerchantFriendEx(request: UpdateBaasAntdaoMerchantFriendRequest, runtime: $Util.RuntimeOptions): Promise<UpdateBaasAntdaoMerchantFriendResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBaasAntdaoMerchantFriendResponse>(await this.doRequest("1.0", "baas.antdao.merchant.friend.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateBaasAntdaoMerchantFriendResponse({}));
  }

  /**
   * Description: 商品供应商户发布一个商品
   * Summary: 数字商品服务-商品服务-创建商品
   */
  async createBaasAntdaoEquity(request: CreateBaasAntdaoEquityRequest): Promise<CreateBaasAntdaoEquityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createBaasAntdaoEquityEx(request, runtime);
  }

  /**
   * Description: 商品供应商户发布一个商品
   * Summary: 数字商品服务-商品服务-创建商品
   */
  async createBaasAntdaoEquityEx(request: CreateBaasAntdaoEquityRequest, runtime: $Util.RuntimeOptions): Promise<CreateBaasAntdaoEquityResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBaasAntdaoEquityResponse>(await this.doRequest("1.0", "baas.antdao.equity.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateBaasAntdaoEquityResponse({}));
  }

  /**
   * Description: 该接口不使用，合并至 baas.antdao.equity.status.update
  下线商品
   * Summary: 数字商品服务-商品服务-下线商品
   */
  async offlineBaasAntdaoEquity(request: OfflineBaasAntdaoEquityRequest): Promise<OfflineBaasAntdaoEquityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.offlineBaasAntdaoEquityEx(request, runtime);
  }

  /**
   * Description: 该接口不使用，合并至 baas.antdao.equity.status.update
  下线商品
   * Summary: 数字商品服务-商品服务-下线商品
   */
  async offlineBaasAntdaoEquityEx(request: OfflineBaasAntdaoEquityRequest, runtime: $Util.RuntimeOptions): Promise<OfflineBaasAntdaoEquityResponse> {
    Util.validateModel(request);
    return $tea.cast<OfflineBaasAntdaoEquityResponse>(await this.doRequest("1.0", "baas.antdao.equity.offline", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new OfflineBaasAntdaoEquityResponse({}));
  }

  /**
   * Description: 该接口不使用，合并至baas.antdao.equity.status.update
  冻结权益
   * Summary: 数字商品服务-商品服务-冻结商品
   */
  async freezeBaasAntdaoEquity(request: FreezeBaasAntdaoEquityRequest): Promise<FreezeBaasAntdaoEquityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.freezeBaasAntdaoEquityEx(request, runtime);
  }

  /**
   * Description: 该接口不使用，合并至baas.antdao.equity.status.update
  冻结权益
   * Summary: 数字商品服务-商品服务-冻结商品
   */
  async freezeBaasAntdaoEquityEx(request: FreezeBaasAntdaoEquityRequest, runtime: $Util.RuntimeOptions): Promise<FreezeBaasAntdaoEquityResponse> {
    Util.validateModel(request);
    return $tea.cast<FreezeBaasAntdaoEquityResponse>(await this.doRequest("1.0", "baas.antdao.equity.freeze", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new FreezeBaasAntdaoEquityResponse({}));
  }

  /**
   * Description: 授权兑换—非公开商品商户配置
   * Summary: 数字商品服务-商品服务-授权兑换
   */
  async openBaasAntdaoEquityMerchant(request: OpenBaasAntdaoEquityMerchantRequest): Promise<OpenBaasAntdaoEquityMerchantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.openBaasAntdaoEquityMerchantEx(request, runtime);
  }

  /**
   * Description: 授权兑换—非公开商品商户配置
   * Summary: 数字商品服务-商品服务-授权兑换
   */
  async openBaasAntdaoEquityMerchantEx(request: OpenBaasAntdaoEquityMerchantRequest, runtime: $Util.RuntimeOptions): Promise<OpenBaasAntdaoEquityMerchantResponse> {
    Util.validateModel(request);
    return $tea.cast<OpenBaasAntdaoEquityMerchantResponse>(await this.doRequest("1.0", "baas.antdao.equity.merchant.open", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new OpenBaasAntdaoEquityMerchantResponse({}));
  }

  /**
   * Description: 用户兑换价格设置
   * Summary: 数字商品服务-商品服务-用户兑换价格设置
   */
  async authBaasAntdaoEquityMerchantuserprice(request: AuthBaasAntdaoEquityMerchantuserpriceRequest): Promise<AuthBaasAntdaoEquityMerchantuserpriceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.authBaasAntdaoEquityMerchantuserpriceEx(request, runtime);
  }

  /**
   * Description: 用户兑换价格设置
   * Summary: 数字商品服务-商品服务-用户兑换价格设置
   */
  async authBaasAntdaoEquityMerchantuserpriceEx(request: AuthBaasAntdaoEquityMerchantuserpriceRequest, runtime: $Util.RuntimeOptions): Promise<AuthBaasAntdaoEquityMerchantuserpriceResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthBaasAntdaoEquityMerchantuserpriceResponse>(await this.doRequest("1.0", "baas.antdao.equity.merchantuserprice.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new AuthBaasAntdaoEquityMerchantuserpriceResponse({}));
  }

  /**
   * Description: 该接口不使用，合并至 baas.antdao.equity.update 
  更新商品价格
   * Summary: 数字商品服务-商品服务-更新商品价格
   */
  async updateBaasAntdaoEquityDefaultprice(request: UpdateBaasAntdaoEquityDefaultpriceRequest): Promise<UpdateBaasAntdaoEquityDefaultpriceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateBaasAntdaoEquityDefaultpriceEx(request, runtime);
  }

  /**
   * Description: 该接口不使用，合并至 baas.antdao.equity.update 
  更新商品价格
   * Summary: 数字商品服务-商品服务-更新商品价格
   */
  async updateBaasAntdaoEquityDefaultpriceEx(request: UpdateBaasAntdaoEquityDefaultpriceRequest, runtime: $Util.RuntimeOptions): Promise<UpdateBaasAntdaoEquityDefaultpriceResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBaasAntdaoEquityDefaultpriceResponse>(await this.doRequest("1.0", "baas.antdao.equity.defaultprice.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateBaasAntdaoEquityDefaultpriceResponse({}));
  }

  /**
   * Description: 更新商品自定义定价
   * Summary: 数字商品服务-商品服务-更新自定义定价
   */
  async updateBaasAntdaoEquityTenantprice(request: UpdateBaasAntdaoEquityTenantpriceRequest): Promise<UpdateBaasAntdaoEquityTenantpriceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateBaasAntdaoEquityTenantpriceEx(request, runtime);
  }

  /**
   * Description: 更新商品自定义定价
   * Summary: 数字商品服务-商品服务-更新自定义定价
   */
  async updateBaasAntdaoEquityTenantpriceEx(request: UpdateBaasAntdaoEquityTenantpriceRequest, runtime: $Util.RuntimeOptions): Promise<UpdateBaasAntdaoEquityTenantpriceResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBaasAntdaoEquityTenantpriceResponse>(await this.doRequest("1.0", "baas.antdao.equity.tenantprice.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateBaasAntdaoEquityTenantpriceResponse({}));
  }

  /**
   * Description: 该接口不使用，合并至 baas.antdao.equity.update
  增加权益库存
   * Summary: 数字商品服务-商品服务-增加权益库存
   */
  async addBaasAntdaoEquityCount(request: AddBaasAntdaoEquityCountRequest): Promise<AddBaasAntdaoEquityCountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.addBaasAntdaoEquityCountEx(request, runtime);
  }

  /**
   * Description: 该接口不使用，合并至 baas.antdao.equity.update
  增加权益库存
   * Summary: 数字商品服务-商品服务-增加权益库存
   */
  async addBaasAntdaoEquityCountEx(request: AddBaasAntdaoEquityCountRequest, runtime: $Util.RuntimeOptions): Promise<AddBaasAntdaoEquityCountResponse> {
    Util.validateModel(request);
    return $tea.cast<AddBaasAntdaoEquityCountResponse>(await this.doRequest("1.0", "baas.antdao.equity.count.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new AddBaasAntdaoEquityCountResponse({}));
  }

  /**
   * Description: 该接口不使用，合并至 baas.antdao.equity.update
  更新兑换限制规则
   * Summary: 数字商品服务-商品服务-更新兑换限制规则
   */
  async updateBaasAntdaoEquityExchangelimit(request: UpdateBaasAntdaoEquityExchangelimitRequest): Promise<UpdateBaasAntdaoEquityExchangelimitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateBaasAntdaoEquityExchangelimitEx(request, runtime);
  }

  /**
   * Description: 该接口不使用，合并至 baas.antdao.equity.update
  更新兑换限制规则
   * Summary: 数字商品服务-商品服务-更新兑换限制规则
   */
  async updateBaasAntdaoEquityExchangelimitEx(request: UpdateBaasAntdaoEquityExchangelimitRequest, runtime: $Util.RuntimeOptions): Promise<UpdateBaasAntdaoEquityExchangelimitResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBaasAntdaoEquityExchangelimitResponse>(await this.doRequest("1.0", "baas.antdao.equity.exchangelimit.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateBaasAntdaoEquityExchangelimitResponse({}));
  }

  /**
   * Description: 该接口不使用，合并至 baas.antdao.equity.update
  更新商品有效期
   * Summary: 数字商品服务-商品服务-更新有效期
   */
  async updateBaasAntdaoEquityValidtime(request: UpdateBaasAntdaoEquityValidtimeRequest): Promise<UpdateBaasAntdaoEquityValidtimeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateBaasAntdaoEquityValidtimeEx(request, runtime);
  }

  /**
   * Description: 该接口不使用，合并至 baas.antdao.equity.update
  更新商品有效期
   * Summary: 数字商品服务-商品服务-更新有效期
   */
  async updateBaasAntdaoEquityValidtimeEx(request: UpdateBaasAntdaoEquityValidtimeRequest, runtime: $Util.RuntimeOptions): Promise<UpdateBaasAntdaoEquityValidtimeResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBaasAntdaoEquityValidtimeResponse>(await this.doRequest("1.0", "baas.antdao.equity.validtime.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateBaasAntdaoEquityValidtimeResponse({}));
  }

  /**
   * Description: 查询商品信息
   * Summary: 数字商品服务-商品服务-查询商品信息
   */
  async queryBaasAntdaoEquity(request: QueryBaasAntdaoEquityRequest): Promise<QueryBaasAntdaoEquityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasAntdaoEquityEx(request, runtime);
  }

  /**
   * Description: 查询商品信息
   * Summary: 数字商品服务-商品服务-查询商品信息
   */
  async queryBaasAntdaoEquityEx(request: QueryBaasAntdaoEquityRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasAntdaoEquityResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasAntdaoEquityResponse>(await this.doRequest("1.0", "baas.antdao.equity.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasAntdaoEquityResponse({}));
  }

  /**
   * Description: 用户身份发起兑换
   * Summary: 数字商品服务-兑换服务-用户身份发起兑换
   */
  async execBaasAntdaoExchangeByuser(request: ExecBaasAntdaoExchangeByuserRequest): Promise<ExecBaasAntdaoExchangeByuserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.execBaasAntdaoExchangeByuserEx(request, runtime);
  }

  /**
   * Description: 用户身份发起兑换
   * Summary: 数字商品服务-兑换服务-用户身份发起兑换
   */
  async execBaasAntdaoExchangeByuserEx(request: ExecBaasAntdaoExchangeByuserRequest, runtime: $Util.RuntimeOptions): Promise<ExecBaasAntdaoExchangeByuserResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBaasAntdaoExchangeByuserResponse>(await this.doRequest("1.0", "baas.antdao.exchange.byuser.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ExecBaasAntdaoExchangeByuserResponse({}));
  }

  /**
   * Description: 商户身份发起兑换
   * Summary: 数字商品服务-商品服务-商户身份发起兑换
   */
  async execBaasAntdaoExchangeBymerchant(request: ExecBaasAntdaoExchangeBymerchantRequest): Promise<ExecBaasAntdaoExchangeBymerchantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.execBaasAntdaoExchangeBymerchantEx(request, runtime);
  }

  /**
   * Description: 商户身份发起兑换
   * Summary: 数字商品服务-商品服务-商户身份发起兑换
   */
  async execBaasAntdaoExchangeBymerchantEx(request: ExecBaasAntdaoExchangeBymerchantRequest, runtime: $Util.RuntimeOptions): Promise<ExecBaasAntdaoExchangeBymerchantResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBaasAntdaoExchangeBymerchantResponse>(await this.doRequest("1.0", "baas.antdao.exchange.bymerchant.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ExecBaasAntdaoExchangeBymerchantResponse({}));
  }

  /**
   * Description: 确认接单接口。注意：若确认接单则必须发货！如果不能确保发货则直接调用缺货接口。
   * Summary: 数字商品服务-兑换服务-确认接单
   */
  async confirmBaasAntdaoExchange(request: ConfirmBaasAntdaoExchangeRequest): Promise<ConfirmBaasAntdaoExchangeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.confirmBaasAntdaoExchangeEx(request, runtime);
  }

  /**
   * Description: 确认接单接口。注意：若确认接单则必须发货！如果不能确保发货则直接调用缺货接口。
   * Summary: 数字商品服务-兑换服务-确认接单
   */
  async confirmBaasAntdaoExchangeEx(request: ConfirmBaasAntdaoExchangeRequest, runtime: $Util.RuntimeOptions): Promise<ConfirmBaasAntdaoExchangeResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmBaasAntdaoExchangeResponse>(await this.doRequest("1.0", "baas.antdao.exchange.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ConfirmBaasAntdaoExchangeResponse({}));
  }

  /**
   * Description: 拒绝发货。供应商可由于缺货，商品不满足发货条件，意外状态下使用。
   * Summary: 数字商品服务-兑换服务-拒绝发货
   */
  async execBaasAntdaoExchangeOutofstore(request: ExecBaasAntdaoExchangeOutofstoreRequest): Promise<ExecBaasAntdaoExchangeOutofstoreResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.execBaasAntdaoExchangeOutofstoreEx(request, runtime);
  }

  /**
   * Description: 拒绝发货。供应商可由于缺货，商品不满足发货条件，意外状态下使用。
   * Summary: 数字商品服务-兑换服务-拒绝发货
   */
  async execBaasAntdaoExchangeOutofstoreEx(request: ExecBaasAntdaoExchangeOutofstoreRequest, runtime: $Util.RuntimeOptions): Promise<ExecBaasAntdaoExchangeOutofstoreResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBaasAntdaoExchangeOutofstoreResponse>(await this.doRequest("1.0", "baas.antdao.exchange.outofstore.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ExecBaasAntdaoExchangeOutofstoreResponse({}));
  }

  /**
   * Description: 兑换发货
   * Summary: 数字商品服务-兑换服务-兑换发货
   */
  async sendBaasAntdaoExchange(request: SendBaasAntdaoExchangeRequest): Promise<SendBaasAntdaoExchangeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.sendBaasAntdaoExchangeEx(request, runtime);
  }

  /**
   * Description: 兑换发货
   * Summary: 数字商品服务-兑换服务-兑换发货
   */
  async sendBaasAntdaoExchangeEx(request: SendBaasAntdaoExchangeRequest, runtime: $Util.RuntimeOptions): Promise<SendBaasAntdaoExchangeResponse> {
    Util.validateModel(request);
    return $tea.cast<SendBaasAntdaoExchangeResponse>(await this.doRequest("1.0", "baas.antdao.exchange.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new SendBaasAntdaoExchangeResponse({}));
  }

  /**
   * Description: 用户身份确认收货
   * Summary: 数字商品服务-兑换服务-用户身份确认收货
   */
  async execBaasAntdaoExchangeReceivebyuser(request: ExecBaasAntdaoExchangeReceivebyuserRequest): Promise<ExecBaasAntdaoExchangeReceivebyuserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.execBaasAntdaoExchangeReceivebyuserEx(request, runtime);
  }

  /**
   * Description: 用户身份确认收货
   * Summary: 数字商品服务-兑换服务-用户身份确认收货
   */
  async execBaasAntdaoExchangeReceivebyuserEx(request: ExecBaasAntdaoExchangeReceivebyuserRequest, runtime: $Util.RuntimeOptions): Promise<ExecBaasAntdaoExchangeReceivebyuserResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBaasAntdaoExchangeReceivebyuserResponse>(await this.doRequest("1.0", "baas.antdao.exchange.receivebyuser.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ExecBaasAntdaoExchangeReceivebyuserResponse({}));
  }

  /**
   * Description: 资产过期
   * Summary: 数字商品服务-资产服务-资产过期
   */
  async execBaasAntdaoAssetExpire(request: ExecBaasAntdaoAssetExpireRequest): Promise<ExecBaasAntdaoAssetExpireResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.execBaasAntdaoAssetExpireEx(request, runtime);
  }

  /**
   * Description: 资产过期
   * Summary: 数字商品服务-资产服务-资产过期
   */
  async execBaasAntdaoAssetExpireEx(request: ExecBaasAntdaoAssetExpireRequest, runtime: $Util.RuntimeOptions): Promise<ExecBaasAntdaoAssetExpireResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBaasAntdaoAssetExpireResponse>(await this.doRequest("1.0", "baas.antdao.asset.expire.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ExecBaasAntdaoAssetExpireResponse({}));
  }

  /**
   * Description: 检索资产流转流水
   * Summary: 数字商品服务-资产服务-查询资产流转流水
   */
  async queryBaasAntdaoAssetInstruction(request: QueryBaasAntdaoAssetInstructionRequest): Promise<QueryBaasAntdaoAssetInstructionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasAntdaoAssetInstructionEx(request, runtime);
  }

  /**
   * Description: 检索资产流转流水
   * Summary: 数字商品服务-资产服务-查询资产流转流水
   */
  async queryBaasAntdaoAssetInstructionEx(request: QueryBaasAntdaoAssetInstructionRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasAntdaoAssetInstructionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasAntdaoAssetInstructionResponse>(await this.doRequest("1.0", "baas.antdao.asset.instruction.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasAntdaoAssetInstructionResponse({}));
  }

  /**
   * Description: 该接口废弃不用！！！
  查询商品兑换流水
   * Summary: 数字商品服务-兑换服务-查询商品兑换流水
   */
  async queryBaasAntdaoExchangeInstruction(request: QueryBaasAntdaoExchangeInstructionRequest): Promise<QueryBaasAntdaoExchangeInstructionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasAntdaoExchangeInstructionEx(request, runtime);
  }

  /**
   * Description: 该接口废弃不用！！！
  查询商品兑换流水
   * Summary: 数字商品服务-兑换服务-查询商品兑换流水
   */
  async queryBaasAntdaoExchangeInstructionEx(request: QueryBaasAntdaoExchangeInstructionRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasAntdaoExchangeInstructionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasAntdaoExchangeInstructionResponse>(await this.doRequest("1.0", "baas.antdao.exchange.instruction.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasAntdaoExchangeInstructionResponse({}));
  }

  /**
   * Description: 资产初始化发行
   * Summary: 数字商品服务-资产服务-资产初始化发行
   */
  async execBaasAntdaoAssetIssue(request: ExecBaasAntdaoAssetIssueRequest): Promise<ExecBaasAntdaoAssetIssueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.execBaasAntdaoAssetIssueEx(request, runtime);
  }

  /**
   * Description: 资产初始化发行
   * Summary: 数字商品服务-资产服务-资产初始化发行
   */
  async execBaasAntdaoAssetIssueEx(request: ExecBaasAntdaoAssetIssueRequest, runtime: $Util.RuntimeOptions): Promise<ExecBaasAntdaoAssetIssueResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBaasAntdaoAssetIssueResponse>(await this.doRequest("1.0", "baas.antdao.asset.issue.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ExecBaasAntdaoAssetIssueResponse({}));
  }

  /**
   * Description: 赎回资产
   * Summary: 数字商品服务-资产服务-赎回资产
   */
  async execBaasAntdaoAssetRedeem(request: ExecBaasAntdaoAssetRedeemRequest): Promise<ExecBaasAntdaoAssetRedeemResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.execBaasAntdaoAssetRedeemEx(request, runtime);
  }

  /**
   * Description: 赎回资产
   * Summary: 数字商品服务-资产服务-赎回资产
   */
  async execBaasAntdaoAssetRedeemEx(request: ExecBaasAntdaoAssetRedeemRequest, runtime: $Util.RuntimeOptions): Promise<ExecBaasAntdaoAssetRedeemResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBaasAntdaoAssetRedeemResponse>(await this.doRequest("1.0", "baas.antdao.asset.redeem.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ExecBaasAntdaoAssetRedeemResponse({}));
  }

  /**
   * Description: 发放资产
   * Summary: 数字商品服务-资产服务-发放资产
   */
  async execBaasAntdaoAssetGrant(request: ExecBaasAntdaoAssetGrantRequest): Promise<ExecBaasAntdaoAssetGrantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.execBaasAntdaoAssetGrantEx(request, runtime);
  }

  /**
   * Description: 发放资产
   * Summary: 数字商品服务-资产服务-发放资产
   */
  async execBaasAntdaoAssetGrantEx(request: ExecBaasAntdaoAssetGrantRequest, runtime: $Util.RuntimeOptions): Promise<ExecBaasAntdaoAssetGrantResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBaasAntdaoAssetGrantResponse>(await this.doRequest("1.0", "baas.antdao.asset.grant.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ExecBaasAntdaoAssetGrantResponse({}));
  }

  /**
   * Description: 发放回退资产
   * Summary: 数字商品服务-资产服务-发放回退资产
   */
  async execBaasAntdaoAssetGrantrefund(request: ExecBaasAntdaoAssetGrantrefundRequest): Promise<ExecBaasAntdaoAssetGrantrefundResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.execBaasAntdaoAssetGrantrefundEx(request, runtime);
  }

  /**
   * Description: 发放回退资产
   * Summary: 数字商品服务-资产服务-发放回退资产
   */
  async execBaasAntdaoAssetGrantrefundEx(request: ExecBaasAntdaoAssetGrantrefundRequest, runtime: $Util.RuntimeOptions): Promise<ExecBaasAntdaoAssetGrantrefundResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBaasAntdaoAssetGrantrefundResponse>(await this.doRequest("1.0", "baas.antdao.asset.grantrefund.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ExecBaasAntdaoAssetGrantrefundResponse({}));
  }

  /**
   * Description: 风控调整资产
   * Summary: 数字商品服务-资产服务-风控调整资产
   */
  async execBaasAntdaoAssetAdjust(request: ExecBaasAntdaoAssetAdjustRequest): Promise<ExecBaasAntdaoAssetAdjustResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.execBaasAntdaoAssetAdjustEx(request, runtime);
  }

  /**
   * Description: 风控调整资产
   * Summary: 数字商品服务-资产服务-风控调整资产
   */
  async execBaasAntdaoAssetAdjustEx(request: ExecBaasAntdaoAssetAdjustRequest, runtime: $Util.RuntimeOptions): Promise<ExecBaasAntdaoAssetAdjustResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBaasAntdaoAssetAdjustResponse>(await this.doRequest("1.0", "baas.antdao.asset.adjust.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ExecBaasAntdaoAssetAdjustResponse({}));
  }

  /**
   * Description: 资产查询
   * Summary: 数字商品服务-资产服务-资产查询
   */
  async queryBaasAntdaoAsset(request: QueryBaasAntdaoAssetRequest): Promise<QueryBaasAntdaoAssetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasAntdaoAssetEx(request, runtime);
  }

  /**
   * Description: 资产查询
   * Summary: 数字商品服务-资产服务-资产查询
   */
  async queryBaasAntdaoAssetEx(request: QueryBaasAntdaoAssetRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasAntdaoAssetResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasAntdaoAssetResponse>(await this.doRequest("1.0", "baas.antdao.asset.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasAntdaoAssetResponse({}));
  }

  /**
   * Description: 商户身份确认收货
   * Summary: 数字商品服务-兑换服务-商户身份确认收货
   */
  async execBaasAntdaoExchangeReceivebymerchant(request: ExecBaasAntdaoExchangeReceivebymerchantRequest): Promise<ExecBaasAntdaoExchangeReceivebymerchantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.execBaasAntdaoExchangeReceivebymerchantEx(request, runtime);
  }

  /**
   * Description: 商户身份确认收货
   * Summary: 数字商品服务-兑换服务-商户身份确认收货
   */
  async execBaasAntdaoExchangeReceivebymerchantEx(request: ExecBaasAntdaoExchangeReceivebymerchantRequest, runtime: $Util.RuntimeOptions): Promise<ExecBaasAntdaoExchangeReceivebymerchantResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBaasAntdaoExchangeReceivebymerchantResponse>(await this.doRequest("1.0", "baas.antdao.exchange.receivebymerchant.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ExecBaasAntdaoExchangeReceivebymerchantResponse({}));
  }

  /**
   * Description: 获取特定高度的区块信息
   * Summary: 数字商品服务-拉块服务-获取区块信息
   */
  async queryBaasAntdaoBlock(request: QueryBaasAntdaoBlockRequest): Promise<QueryBaasAntdaoBlockResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasAntdaoBlockEx(request, runtime);
  }

  /**
   * Description: 获取特定高度的区块信息
   * Summary: 数字商品服务-拉块服务-获取区块信息
   */
  async queryBaasAntdaoBlockEx(request: QueryBaasAntdaoBlockRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasAntdaoBlockResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasAntdaoBlockResponse>(await this.doRequest("1.0", "baas.antdao.block.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasAntdaoBlockResponse({}));
  }

  /**
   * Description: 获取区块链最新区块高度
   * Summary: 数字商品服务-拉块服务-获取最新区块高度
   */
  async queryBaasAntdaoBlockLastblocknumber(request: QueryBaasAntdaoBlockLastblocknumberRequest): Promise<QueryBaasAntdaoBlockLastblocknumberResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasAntdaoBlockLastblocknumberEx(request, runtime);
  }

  /**
   * Description: 获取区块链最新区块高度
   * Summary: 数字商品服务-拉块服务-获取最新区块高度
   */
  async queryBaasAntdaoBlockLastblocknumberEx(request: QueryBaasAntdaoBlockLastblocknumberRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasAntdaoBlockLastblocknumberResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasAntdaoBlockLastblocknumberResponse>(await this.doRequest("1.0", "baas.antdao.block.lastblocknumber.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasAntdaoBlockLastblocknumberResponse({}));
  }

  /**
   * Description: 更新商品信息
   * Summary: 数字商品服务-商品服务-更新商品属性信息
   */
  async updateBaasAntdaoEquity(request: UpdateBaasAntdaoEquityRequest): Promise<UpdateBaasAntdaoEquityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateBaasAntdaoEquityEx(request, runtime);
  }

  /**
   * Description: 更新商品信息
   * Summary: 数字商品服务-商品服务-更新商品属性信息
   */
  async updateBaasAntdaoEquityEx(request: UpdateBaasAntdaoEquityRequest, runtime: $Util.RuntimeOptions): Promise<UpdateBaasAntdaoEquityResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBaasAntdaoEquityResponse>(await this.doRequest("1.0", "baas.antdao.equity.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateBaasAntdaoEquityResponse({}));
  }

  /**
   * Description: 配合异步发布权益接口，查询发布权益商品结果。如查询无结果，判断错误类型，用户需要轮询。
   * Summary: 数字商品服务-商品服务-发布商品结果查询
   */
  async queryBaasAntdaoEquityCreateresult(request: QueryBaasAntdaoEquityCreateresultRequest): Promise<QueryBaasAntdaoEquityCreateresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasAntdaoEquityCreateresultEx(request, runtime);
  }

  /**
   * Description: 配合异步发布权益接口，查询发布权益商品结果。如查询无结果，判断错误类型，用户需要轮询。
   * Summary: 数字商品服务-商品服务-发布商品结果查询
   */
  async queryBaasAntdaoEquityCreateresultEx(request: QueryBaasAntdaoEquityCreateresultRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasAntdaoEquityCreateresultResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasAntdaoEquityCreateresultResponse>(await this.doRequest("1.0", "baas.antdao.equity.createresult.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasAntdaoEquityCreateresultResponse({}));
  }

  /**
   * Description: 根据商品兑换流水交易号查询商品兑换流水详情
   * Summary: 数字商品服务-商品服务-查询商品兑换流水
   */
  async queryBaasAntdaoEquityInstruction(request: QueryBaasAntdaoEquityInstructionRequest): Promise<QueryBaasAntdaoEquityInstructionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasAntdaoEquityInstructionEx(request, runtime);
  }

  /**
   * Description: 根据商品兑换流水交易号查询商品兑换流水详情
   * Summary: 数字商品服务-商品服务-查询商品兑换流水
   */
  async queryBaasAntdaoEquityInstructionEx(request: QueryBaasAntdaoEquityInstructionRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasAntdaoEquityInstructionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasAntdaoEquityInstructionResponse>(await this.doRequest("1.0", "baas.antdao.equity.instruction.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasAntdaoEquityInstructionResponse({}));
  }

  /**
   * Description: 传入图片的不可访问URL，获取图片的临时可访问URL（支持批量查询）
   * Summary: 数字商品服务-OSS服务-获取图片URL
   */
  async queryBaasAntdaoImage(request: QueryBaasAntdaoImageRequest): Promise<QueryBaasAntdaoImageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasAntdaoImageEx(request, runtime);
  }

  /**
   * Description: 传入图片的不可访问URL，获取图片的临时可访问URL（支持批量查询）
   * Summary: 数字商品服务-OSS服务-获取图片URL
   */
  async queryBaasAntdaoImageEx(request: QueryBaasAntdaoImageRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasAntdaoImageResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasAntdaoImageResponse>(await this.doRequest("1.0", "baas.antdao.image.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasAntdaoImageResponse({}));
  }

  /**
   * Description: 更新商品状态（可用，冻结，下线）
   * Summary: 数字商品服务-商品服务-更新商品状态
   */
  async updateBaasAntdaoEquityStatus(request: UpdateBaasAntdaoEquityStatusRequest): Promise<UpdateBaasAntdaoEquityStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateBaasAntdaoEquityStatusEx(request, runtime);
  }

  /**
   * Description: 更新商品状态（可用，冻结，下线）
   * Summary: 数字商品服务-商品服务-更新商品状态
   */
  async updateBaasAntdaoEquityStatusEx(request: UpdateBaasAntdaoEquityStatusRequest, runtime: $Util.RuntimeOptions): Promise<UpdateBaasAntdaoEquityStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBaasAntdaoEquityStatusResponse>(await this.doRequest("1.0", "baas.antdao.equity.status.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateBaasAntdaoEquityStatusResponse({}));
  }

  /**
   * Description: 设置备付金金额（CAS接口）
   * Summary: 数字商品服务-商户管理-设置备付金金额
   */
  async setBaasAntdaoMerchantProvision(request: SetBaasAntdaoMerchantProvisionRequest): Promise<SetBaasAntdaoMerchantProvisionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.setBaasAntdaoMerchantProvisionEx(request, runtime);
  }

  /**
   * Description: 设置备付金金额（CAS接口）
   * Summary: 数字商品服务-商户管理-设置备付金金额
   */
  async setBaasAntdaoMerchantProvisionEx(request: SetBaasAntdaoMerchantProvisionRequest, runtime: $Util.RuntimeOptions): Promise<SetBaasAntdaoMerchantProvisionResponse> {
    Util.validateModel(request);
    return $tea.cast<SetBaasAntdaoMerchantProvisionResponse>(await this.doRequest("1.0", "baas.antdao.merchant.provision.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new SetBaasAntdaoMerchantProvisionResponse({}));
  }

  /**
   * Description: 更新商户的备付金金额，由资金管理员操作
   * Summary: 数字商品服务-商户管理-更新备付金金额
   */
  async updateBaasAntdaoMerchantProvision(request: UpdateBaasAntdaoMerchantProvisionRequest): Promise<UpdateBaasAntdaoMerchantProvisionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateBaasAntdaoMerchantProvisionEx(request, runtime);
  }

  /**
   * Description: 更新商户的备付金金额，由资金管理员操作
   * Summary: 数字商品服务-商户管理-更新备付金金额
   */
  async updateBaasAntdaoMerchantProvisionEx(request: UpdateBaasAntdaoMerchantProvisionRequest, runtime: $Util.RuntimeOptions): Promise<UpdateBaasAntdaoMerchantProvisionResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBaasAntdaoMerchantProvisionResponse>(await this.doRequest("1.0", "baas.antdao.merchant.provision.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateBaasAntdaoMerchantProvisionResponse({}));
  }

  /**
   * Description: 核销商品兑换交易，由资金管理员操作
   * Summary: 数字商品服务-商品服务-核销商品兑换交易
   */
  async execBaasAntdaoEquityInstructionwriteoff(request: ExecBaasAntdaoEquityInstructionwriteoffRequest): Promise<ExecBaasAntdaoEquityInstructionwriteoffResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.execBaasAntdaoEquityInstructionwriteoffEx(request, runtime);
  }

  /**
   * Description: 核销商品兑换交易，由资金管理员操作
   * Summary: 数字商品服务-商品服务-核销商品兑换交易
   */
  async execBaasAntdaoEquityInstructionwriteoffEx(request: ExecBaasAntdaoEquityInstructionwriteoffRequest, runtime: $Util.RuntimeOptions): Promise<ExecBaasAntdaoEquityInstructionwriteoffResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBaasAntdaoEquityInstructionwriteoffResponse>(await this.doRequest("1.0", "baas.antdao.equity.instructionwriteoff.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ExecBaasAntdaoEquityInstructionwriteoffResponse({}));
  }

  /**
   * Description: 查询租户的备付金列表
   * Summary: 数字商品服务-商户管理-查租户备付金列表
   */
  async queryBaasAntdaoMerchantProvisions(request: QueryBaasAntdaoMerchantProvisionsRequest): Promise<QueryBaasAntdaoMerchantProvisionsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasAntdaoMerchantProvisionsEx(request, runtime);
  }

  /**
   * Description: 查询租户的备付金列表
   * Summary: 数字商品服务-商户管理-查租户备付金列表
   */
  async queryBaasAntdaoMerchantProvisionsEx(request: QueryBaasAntdaoMerchantProvisionsRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasAntdaoMerchantProvisionsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasAntdaoMerchantProvisionsResponse>(await this.doRequest("1.0", "baas.antdao.merchant.provisions.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasAntdaoMerchantProvisionsResponse({}));
  }

  /**
   * Description: 只有代理到数字商品管理后台的商户才能查询到信息。查询商户可兑换商品列表
   * Summary: 数字商品服务-商户管理-查询可兑换商品
   */
  async queryBaasAntdaoMerchantExchangeableequitylist(request: QueryBaasAntdaoMerchantExchangeableequitylistRequest): Promise<QueryBaasAntdaoMerchantExchangeableequitylistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasAntdaoMerchantExchangeableequitylistEx(request, runtime);
  }

  /**
   * Description: 只有代理到数字商品管理后台的商户才能查询到信息。查询商户可兑换商品列表
   * Summary: 数字商品服务-商户管理-查询可兑换商品
   */
  async queryBaasAntdaoMerchantExchangeableequitylistEx(request: QueryBaasAntdaoMerchantExchangeableequitylistRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasAntdaoMerchantExchangeableequitylistResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasAntdaoMerchantExchangeableequitylistResponse>(await this.doRequest("1.0", "baas.antdao.merchant.exchangeableequitylist.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasAntdaoMerchantExchangeableequitylistResponse({}));
  }

  /**
   * Description: 只有代理到数字商品管理后台的商户才能查询到信息。查询商户可兑换的商品明细信息
   * Summary: 数字商品服务-商户管理-查询可兑商品明细
   */
  async queryBaasAntdaoMerchantExchangeableequitydetail(request: QueryBaasAntdaoMerchantExchangeableequitydetailRequest): Promise<QueryBaasAntdaoMerchantExchangeableequitydetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasAntdaoMerchantExchangeableequitydetailEx(request, runtime);
  }

  /**
   * Description: 只有代理到数字商品管理后台的商户才能查询到信息。查询商户可兑换的商品明细信息
   * Summary: 数字商品服务-商户管理-查询可兑商品明细
   */
  async queryBaasAntdaoMerchantExchangeableequitydetailEx(request: QueryBaasAntdaoMerchantExchangeableequitydetailRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasAntdaoMerchantExchangeableequitydetailResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasAntdaoMerchantExchangeableequitydetailResponse>(await this.doRequest("1.0", "baas.antdao.merchant.exchangeableequitydetail.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasAntdaoMerchantExchangeableequitydetailResponse({}));
  }

  /**
   * Description: 创建新资产
   * Summary: 数字商品服务-资产服务-创建资产
   */
  async execBaasAntdaoAssetCreate(request: ExecBaasAntdaoAssetCreateRequest): Promise<ExecBaasAntdaoAssetCreateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.execBaasAntdaoAssetCreateEx(request, runtime);
  }

  /**
   * Description: 创建新资产
   * Summary: 数字商品服务-资产服务-创建资产
   */
  async execBaasAntdaoAssetCreateEx(request: ExecBaasAntdaoAssetCreateRequest, runtime: $Util.RuntimeOptions): Promise<ExecBaasAntdaoAssetCreateResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBaasAntdaoAssetCreateResponse>(await this.doRequest("1.0", "baas.antdao.asset.create.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ExecBaasAntdaoAssetCreateResponse({}));
  }

  /**
   * Description: 资产铸币(不扣减备付金)，合约管理员操作
   * Summary: 数字商品服务-资产服务-资产铸币
   */
  async execBaasAntdaoAssetGenerate(request: ExecBaasAntdaoAssetGenerateRequest): Promise<ExecBaasAntdaoAssetGenerateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.execBaasAntdaoAssetGenerateEx(request, runtime);
  }

  /**
   * Description: 资产铸币(不扣减备付金)，合约管理员操作
   * Summary: 数字商品服务-资产服务-资产铸币
   */
  async execBaasAntdaoAssetGenerateEx(request: ExecBaasAntdaoAssetGenerateRequest, runtime: $Util.RuntimeOptions): Promise<ExecBaasAntdaoAssetGenerateResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBaasAntdaoAssetGenerateResponse>(await this.doRequest("1.0", "baas.antdao.asset.generate.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ExecBaasAntdaoAssetGenerateResponse({}));
  }

  /**
   * Description: 创建商户（合约管理员权限）
   * Summary: 数字商品服务-商户管理-创建商户
   */
  async createBaasAntdaoMerchant(request: CreateBaasAntdaoMerchantRequest): Promise<CreateBaasAntdaoMerchantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createBaasAntdaoMerchantEx(request, runtime);
  }

  /**
   * Description: 创建商户（合约管理员权限）
   * Summary: 数字商品服务-商户管理-创建商户
   */
  async createBaasAntdaoMerchantEx(request: CreateBaasAntdaoMerchantRequest, runtime: $Util.RuntimeOptions): Promise<CreateBaasAntdaoMerchantResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBaasAntdaoMerchantResponse>(await this.doRequest("1.0", "baas.antdao.merchant.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateBaasAntdaoMerchantResponse({}));
  }

  /**
   * Description: 设置商户的资金管理员，重要权限，谨慎操作！
   * Summary: 数字商品服务-商户管理-设置资金管理员
   */
  async setBaasAntdaoMerchantFundmanager(request: SetBaasAntdaoMerchantFundmanagerRequest): Promise<SetBaasAntdaoMerchantFundmanagerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.setBaasAntdaoMerchantFundmanagerEx(request, runtime);
  }

  /**
   * Description: 设置商户的资金管理员，重要权限，谨慎操作！
   * Summary: 数字商品服务-商户管理-设置资金管理员
   */
  async setBaasAntdaoMerchantFundmanagerEx(request: SetBaasAntdaoMerchantFundmanagerRequest, runtime: $Util.RuntimeOptions): Promise<SetBaasAntdaoMerchantFundmanagerResponse> {
    Util.validateModel(request);
    return $tea.cast<SetBaasAntdaoMerchantFundmanagerResponse>(await this.doRequest("1.0", "baas.antdao.merchant.fundmanager.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new SetBaasAntdaoMerchantFundmanagerResponse({}));
  }

  /**
   * Description: 创建备付金账户，合约管理员权限
   * Summary: 数字商品服务-商户管理-创建备付金账户
   */
  async createBaasAntdaoMerchantProvision(request: CreateBaasAntdaoMerchantProvisionRequest): Promise<CreateBaasAntdaoMerchantProvisionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createBaasAntdaoMerchantProvisionEx(request, runtime);
  }

  /**
   * Description: 创建备付金账户，合约管理员权限
   * Summary: 数字商品服务-商户管理-创建备付金账户
   */
  async createBaasAntdaoMerchantProvisionEx(request: CreateBaasAntdaoMerchantProvisionRequest, runtime: $Util.RuntimeOptions): Promise<CreateBaasAntdaoMerchantProvisionResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBaasAntdaoMerchantProvisionResponse>(await this.doRequest("1.0", "baas.antdao.merchant.provision.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateBaasAntdaoMerchantProvisionResponse({}));
  }

  /**
   * Description: 查询租户的授权代理权限
   * Summary: 数字商品服务-管理服务-代理权限查询
   */
  async queryBaasAntdaoConfigDelegaterelation(request: QueryBaasAntdaoConfigDelegaterelationRequest): Promise<QueryBaasAntdaoConfigDelegaterelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasAntdaoConfigDelegaterelationEx(request, runtime);
  }

  /**
   * Description: 查询租户的授权代理权限
   * Summary: 数字商品服务-管理服务-代理权限查询
   */
  async queryBaasAntdaoConfigDelegaterelationEx(request: QueryBaasAntdaoConfigDelegaterelationRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasAntdaoConfigDelegaterelationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasAntdaoConfigDelegaterelationResponse>(await this.doRequest("1.0", "baas.antdao.config.delegaterelation.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasAntdaoConfigDelegaterelationResponse({}));
  }

  /**
   * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
   * Summary: 数字商品服务-管理服务-设置代理权限
   */
  async updateBaasAntdaoConfigDelegaterelation(request: UpdateBaasAntdaoConfigDelegaterelationRequest): Promise<UpdateBaasAntdaoConfigDelegaterelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateBaasAntdaoConfigDelegaterelationEx(request, runtime);
  }

  /**
   * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
   * Summary: 数字商品服务-管理服务-设置代理权限
   */
  async updateBaasAntdaoConfigDelegaterelationEx(request: UpdateBaasAntdaoConfigDelegaterelationRequest, runtime: $Util.RuntimeOptions): Promise<UpdateBaasAntdaoConfigDelegaterelationResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBaasAntdaoConfigDelegaterelationResponse>(await this.doRequest("1.0", "baas.antdao.config.delegaterelation.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateBaasAntdaoConfigDelegaterelationResponse({}));
  }

  /**
   * Description: 查询接口访问白名单信息
   * Summary: 数字商品服务-拉块服务-查询接口白名单
   */
  async queryBaasAntdaoConfigWhitelist(request: QueryBaasAntdaoConfigWhitelistRequest): Promise<QueryBaasAntdaoConfigWhitelistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasAntdaoConfigWhitelistEx(request, runtime);
  }

  /**
   * Description: 查询接口访问白名单信息
   * Summary: 数字商品服务-拉块服务-查询接口白名单
   */
  async queryBaasAntdaoConfigWhitelistEx(request: QueryBaasAntdaoConfigWhitelistRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasAntdaoConfigWhitelistResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasAntdaoConfigWhitelistResponse>(await this.doRequest("1.0", "baas.antdao.config.whitelist.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasAntdaoConfigWhitelistResponse({}));
  }

  /**
   * Description: 设置接口访问白名单
   * Summary: 数字商品服务-管理服务-设置访问白名单
   */
  async updateBaasAntdaoConfigWhitelist(request: UpdateBaasAntdaoConfigWhitelistRequest): Promise<UpdateBaasAntdaoConfigWhitelistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateBaasAntdaoConfigWhitelistEx(request, runtime);
  }

  /**
   * Description: 设置接口访问白名单
   * Summary: 数字商品服务-管理服务-设置访问白名单
   */
  async updateBaasAntdaoConfigWhitelistEx(request: UpdateBaasAntdaoConfigWhitelistRequest, runtime: $Util.RuntimeOptions): Promise<UpdateBaasAntdaoConfigWhitelistResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBaasAntdaoConfigWhitelistResponse>(await this.doRequest("1.0", "baas.antdao.config.whitelist.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateBaasAntdaoConfigWhitelistResponse({}));
  }

  /**
   * Description: 兑换单申请售后（采购商）
   * Summary: 数字商品服务-兑换服务-申请售后(商家)
   */
  async applyBaasAntdaoExchangeAftersale(request: ApplyBaasAntdaoExchangeAftersaleRequest): Promise<ApplyBaasAntdaoExchangeAftersaleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.applyBaasAntdaoExchangeAftersaleEx(request, runtime);
  }

  /**
   * Description: 兑换单申请售后（采购商）
   * Summary: 数字商品服务-兑换服务-申请售后(商家)
   */
  async applyBaasAntdaoExchangeAftersaleEx(request: ApplyBaasAntdaoExchangeAftersaleRequest, runtime: $Util.RuntimeOptions): Promise<ApplyBaasAntdaoExchangeAftersaleResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyBaasAntdaoExchangeAftersaleResponse>(await this.doRequest("1.0", "baas.antdao.exchange.aftersale.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ApplyBaasAntdaoExchangeAftersaleResponse({}));
  }

  /**
   * Description: 同意售后（供应商）
   * Summary: 数字商品服务-兑换服务-同意售后
   */
  async execBaasAntdaoExchangeAgreeaftersale(request: ExecBaasAntdaoExchangeAgreeaftersaleRequest): Promise<ExecBaasAntdaoExchangeAgreeaftersaleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.execBaasAntdaoExchangeAgreeaftersaleEx(request, runtime);
  }

  /**
   * Description: 同意售后（供应商）
   * Summary: 数字商品服务-兑换服务-同意售后
   */
  async execBaasAntdaoExchangeAgreeaftersaleEx(request: ExecBaasAntdaoExchangeAgreeaftersaleRequest, runtime: $Util.RuntimeOptions): Promise<ExecBaasAntdaoExchangeAgreeaftersaleResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBaasAntdaoExchangeAgreeaftersaleResponse>(await this.doRequest("1.0", "baas.antdao.exchange.agreeaftersale.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ExecBaasAntdaoExchangeAgreeaftersaleResponse({}));
  }

  /**
   * Description: 拒绝售后（供应商）
   * Summary: 数字商品服务-兑换服务-拒绝售后
   */
  async refuseBaasAntdaoExchangeAftersale(request: RefuseBaasAntdaoExchangeAftersaleRequest): Promise<RefuseBaasAntdaoExchangeAftersaleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.refuseBaasAntdaoExchangeAftersaleEx(request, runtime);
  }

  /**
   * Description: 拒绝售后（供应商）
   * Summary: 数字商品服务-兑换服务-拒绝售后
   */
  async refuseBaasAntdaoExchangeAftersaleEx(request: RefuseBaasAntdaoExchangeAftersaleRequest, runtime: $Util.RuntimeOptions): Promise<RefuseBaasAntdaoExchangeAftersaleResponse> {
    Util.validateModel(request);
    return $tea.cast<RefuseBaasAntdaoExchangeAftersaleResponse>(await this.doRequest("1.0", "baas.antdao.exchange.aftersale.refuse", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new RefuseBaasAntdaoExchangeAftersaleResponse({}));
  }

  /**
   * Description: 重新发货（供应商）
   * Summary: 数字商品服务-兑换服务-重新发货
   */
  async sendBaasAntdaoExchangeAftersale(request: SendBaasAntdaoExchangeAftersaleRequest): Promise<SendBaasAntdaoExchangeAftersaleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.sendBaasAntdaoExchangeAftersaleEx(request, runtime);
  }

  /**
   * Description: 重新发货（供应商）
   * Summary: 数字商品服务-兑换服务-重新发货
   */
  async sendBaasAntdaoExchangeAftersaleEx(request: SendBaasAntdaoExchangeAftersaleRequest, runtime: $Util.RuntimeOptions): Promise<SendBaasAntdaoExchangeAftersaleResponse> {
    Util.validateModel(request);
    return $tea.cast<SendBaasAntdaoExchangeAftersaleResponse>(await this.doRequest("1.0", "baas.antdao.exchange.aftersale.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new SendBaasAntdaoExchangeAftersaleResponse({}));
  }

  /**
   * Description: 商户确认售后（供应商）comfirmaftersale
   * Summary:  数字商品服务-兑换服务-商户确认售后
   */
  async confirmBaasAntdaoExchangeAftersale(request: ConfirmBaasAntdaoExchangeAftersaleRequest): Promise<ConfirmBaasAntdaoExchangeAftersaleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.confirmBaasAntdaoExchangeAftersaleEx(request, runtime);
  }

  /**
   * Description: 商户确认售后（供应商）comfirmaftersale
   * Summary:  数字商品服务-兑换服务-商户确认售后
   */
  async confirmBaasAntdaoExchangeAftersaleEx(request: ConfirmBaasAntdaoExchangeAftersaleRequest, runtime: $Util.RuntimeOptions): Promise<ConfirmBaasAntdaoExchangeAftersaleResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmBaasAntdaoExchangeAftersaleResponse>(await this.doRequest("1.0", "baas.antdao.exchange.aftersale.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ConfirmBaasAntdaoExchangeAftersaleResponse({}));
  }

  /**
   * Description: 数字消费卡链上发布
   * Summary: 数字商品服务-存证服务-消费卡链上发布
   */
  async execBaasAntdaoDataDeposit(request: ExecBaasAntdaoDataDepositRequest): Promise<ExecBaasAntdaoDataDepositResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.execBaasAntdaoDataDepositEx(request, runtime);
  }

  /**
   * Description: 数字消费卡链上发布
   * Summary: 数字商品服务-存证服务-消费卡链上发布
   */
  async execBaasAntdaoDataDepositEx(request: ExecBaasAntdaoDataDepositRequest, runtime: $Util.RuntimeOptions): Promise<ExecBaasAntdaoDataDepositResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBaasAntdaoDataDepositResponse>(await this.doRequest("1.0", "baas.antdao.data.deposit.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ExecBaasAntdaoDataDepositResponse({}));
  }

  /**
   * Description: 设置商品兑换手续费
   * Summary: 数字商品服务-商品服务-设置商品手续费
   */
  async setBaasAntdaoCommission(request: SetBaasAntdaoCommissionRequest): Promise<SetBaasAntdaoCommissionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.setBaasAntdaoCommissionEx(request, runtime);
  }

  /**
   * Description: 设置商品兑换手续费
   * Summary: 数字商品服务-商品服务-设置商品手续费
   */
  async setBaasAntdaoCommissionEx(request: SetBaasAntdaoCommissionRequest, runtime: $Util.RuntimeOptions): Promise<SetBaasAntdaoCommissionResponse> {
    Util.validateModel(request);
    return $tea.cast<SetBaasAntdaoCommissionResponse>(await this.doRequest("1.0", "baas.antdao.commission.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new SetBaasAntdaoCommissionResponse({}));
  }

  /**
   * Description: 查询商品手续费（可查询 当前生效 和 全部 的手续费信息）
   * Summary: 数字商品服务-商品服务-查询商品手续费
   */
  async queryBaasAntdaoCommission(request: QueryBaasAntdaoCommissionRequest): Promise<QueryBaasAntdaoCommissionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasAntdaoCommissionEx(request, runtime);
  }

  /**
   * Description: 查询商品手续费（可查询 当前生效 和 全部 的手续费信息）
   * Summary: 数字商品服务-商品服务-查询商品手续费
   */
  async queryBaasAntdaoCommissionEx(request: QueryBaasAntdaoCommissionRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasAntdaoCommissionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasAntdaoCommissionResponse>(await this.doRequest("1.0", "baas.antdao.commission.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasAntdaoCommissionResponse({}));
  }

  /**
   * Description: 设置收取手续费的商户信息（合约管理员权限）
   * Summary: 数字商品服务-商品服务-设置收手续费商户
   */
  async setBaasAntdaoCommissionMerchant(request: SetBaasAntdaoCommissionMerchantRequest): Promise<SetBaasAntdaoCommissionMerchantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.setBaasAntdaoCommissionMerchantEx(request, runtime);
  }

  /**
   * Description: 设置收取手续费的商户信息（合约管理员权限）
   * Summary: 数字商品服务-商品服务-设置收手续费商户
   */
  async setBaasAntdaoCommissionMerchantEx(request: SetBaasAntdaoCommissionMerchantRequest, runtime: $Util.RuntimeOptions): Promise<SetBaasAntdaoCommissionMerchantResponse> {
    Util.validateModel(request);
    return $tea.cast<SetBaasAntdaoCommissionMerchantResponse>(await this.doRequest("1.0", "baas.antdao.commission.merchant.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new SetBaasAntdaoCommissionMerchantResponse({}));
  }

  /**
   * Description: 查询收取手续费的商户信息
   * Summary: 数字商品服务-商品服务-查询收手续费商户
   */
  async queryBaasAntdaoCommissionMerchant(request: QueryBaasAntdaoCommissionMerchantRequest): Promise<QueryBaasAntdaoCommissionMerchantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasAntdaoCommissionMerchantEx(request, runtime);
  }

  /**
   * Description: 查询收取手续费的商户信息
   * Summary: 数字商品服务-商品服务-查询收手续费商户
   */
  async queryBaasAntdaoCommissionMerchantEx(request: QueryBaasAntdaoCommissionMerchantRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasAntdaoCommissionMerchantResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasAntdaoCommissionMerchantResponse>(await this.doRequest("1.0", "baas.antdao.commission.merchant.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasAntdaoCommissionMerchantResponse({}));
  }

  /**
   * Description: 获取特定高度的区块信息
   * Summary: 数字商品服务-拉块服务-获取区块信息
   */
  async queryBaasAntdaoBlockanalysisBlock(request: QueryBaasAntdaoBlockanalysisBlockRequest): Promise<QueryBaasAntdaoBlockanalysisBlockResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasAntdaoBlockanalysisBlockEx(request, runtime);
  }

  /**
   * Description: 获取特定高度的区块信息
   * Summary: 数字商品服务-拉块服务-获取区块信息
   */
  async queryBaasAntdaoBlockanalysisBlockEx(request: QueryBaasAntdaoBlockanalysisBlockRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasAntdaoBlockanalysisBlockResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasAntdaoBlockanalysisBlockResponse>(await this.doRequest("1.0", "baas.antdao.blockanalysis.block.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasAntdaoBlockanalysisBlockResponse({}));
  }

  /**
   * Description: 获取最新区块高度
   * Summary: 数字商品服务-拉块服务-获取最新区块高度
   */
  async queryBaasAntdaoBlockanalysisLastblocknumber(request: QueryBaasAntdaoBlockanalysisLastblocknumberRequest): Promise<QueryBaasAntdaoBlockanalysisLastblocknumberResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasAntdaoBlockanalysisLastblocknumberEx(request, runtime);
  }

  /**
   * Description: 获取最新区块高度
   * Summary: 数字商品服务-拉块服务-获取最新区块高度
   */
  async queryBaasAntdaoBlockanalysisLastblocknumberEx(request: QueryBaasAntdaoBlockanalysisLastblocknumberRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasAntdaoBlockanalysisLastblocknumberResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasAntdaoBlockanalysisLastblocknumberResponse>(await this.doRequest("1.0", "baas.antdao.blockanalysis.lastblocknumber.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasAntdaoBlockanalysisLastblocknumberResponse({}));
  }

  /**
   * Description: 获取公开的或者已授权的权益商品信息
   * Summary: 数字商品服务-拉块服务-获取已授权商品
   */
  async queryBaasAntdaoBlockanalysisOpenedequities(request: QueryBaasAntdaoBlockanalysisOpenedequitiesRequest): Promise<QueryBaasAntdaoBlockanalysisOpenedequitiesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasAntdaoBlockanalysisOpenedequitiesEx(request, runtime);
  }

  /**
   * Description: 获取公开的或者已授权的权益商品信息
   * Summary: 数字商品服务-拉块服务-获取已授权商品
   */
  async queryBaasAntdaoBlockanalysisOpenedequitiesEx(request: QueryBaasAntdaoBlockanalysisOpenedequitiesRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasAntdaoBlockanalysisOpenedequitiesResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasAntdaoBlockanalysisOpenedequitiesResponse>(await this.doRequest("1.0", "baas.antdao.blockanalysis.openedequities.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasAntdaoBlockanalysisOpenedequitiesResponse({}));
  }

  /**
   * Description: 查询已设置过用户价格的有效权益商品信息
   * Summary: 数字商品服务-拉块服务-已设用户价格商品
   */
  async queryBaasAntdaoBlockanalysisUserpriceupdatedequities(request: QueryBaasAntdaoBlockanalysisUserpriceupdatedequitiesRequest): Promise<QueryBaasAntdaoBlockanalysisUserpriceupdatedequitiesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasAntdaoBlockanalysisUserpriceupdatedequitiesEx(request, runtime);
  }

  /**
   * Description: 查询已设置过用户价格的有效权益商品信息
   * Summary: 数字商品服务-拉块服务-已设用户价格商品
   */
  async queryBaasAntdaoBlockanalysisUserpriceupdatedequitiesEx(request: QueryBaasAntdaoBlockanalysisUserpriceupdatedequitiesRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasAntdaoBlockanalysisUserpriceupdatedequitiesResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasAntdaoBlockanalysisUserpriceupdatedequitiesResponse>(await this.doRequest("1.0", "baas.antdao.blockanalysis.userpriceupdatedequities.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasAntdaoBlockanalysisUserpriceupdatedequitiesResponse({}));
  }

  /**
   * Description: 查询商户的可提现资产价值(单位:分)
   * Summary: 数字商品服务-拉块服务-查询可提现资产
   */
  async queryBaasAntdaoBlockanalysisUnwriteoffvalue(request: QueryBaasAntdaoBlockanalysisUnwriteoffvalueRequest): Promise<QueryBaasAntdaoBlockanalysisUnwriteoffvalueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasAntdaoBlockanalysisUnwriteoffvalueEx(request, runtime);
  }

  /**
   * Description: 查询商户的可提现资产价值(单位:分)
   * Summary: 数字商品服务-拉块服务-查询可提现资产
   */
  async queryBaasAntdaoBlockanalysisUnwriteoffvalueEx(request: QueryBaasAntdaoBlockanalysisUnwriteoffvalueRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasAntdaoBlockanalysisUnwriteoffvalueResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasAntdaoBlockanalysisUnwriteoffvalueResponse>(await this.doRequest("1.0", "baas.antdao.blockanalysis.unwriteoffvalue.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasAntdaoBlockanalysisUnwriteoffvalueResponse({}));
  }

  /**
   * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
   * Summary: 数字商品服务-拉块服务-设置代理权限
   */
  async updateBaasAntdaoBlockanalysisDelegaterelation(request: UpdateBaasAntdaoBlockanalysisDelegaterelationRequest): Promise<UpdateBaasAntdaoBlockanalysisDelegaterelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateBaasAntdaoBlockanalysisDelegaterelationEx(request, runtime);
  }

  /**
   * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
   * Summary: 数字商品服务-拉块服务-设置代理权限
   */
  async updateBaasAntdaoBlockanalysisDelegaterelationEx(request: UpdateBaasAntdaoBlockanalysisDelegaterelationRequest, runtime: $Util.RuntimeOptions): Promise<UpdateBaasAntdaoBlockanalysisDelegaterelationResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBaasAntdaoBlockanalysisDelegaterelationResponse>(await this.doRequest("1.0", "baas.antdao.blockanalysis.delegaterelation.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateBaasAntdaoBlockanalysisDelegaterelationResponse({}));
  }

  /**
   * Description: 设置接口访问白名单。
   * Summary: 数字商品服务-拉块服务-设置访问白名单
   */
  async updateBaasAntdaoBlockanalysisWhitelist(request: UpdateBaasAntdaoBlockanalysisWhitelistRequest): Promise<UpdateBaasAntdaoBlockanalysisWhitelistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateBaasAntdaoBlockanalysisWhitelistEx(request, runtime);
  }

  /**
   * Description: 设置接口访问白名单。
   * Summary: 数字商品服务-拉块服务-设置访问白名单
   */
  async updateBaasAntdaoBlockanalysisWhitelistEx(request: UpdateBaasAntdaoBlockanalysisWhitelistRequest, runtime: $Util.RuntimeOptions): Promise<UpdateBaasAntdaoBlockanalysisWhitelistResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBaasAntdaoBlockanalysisWhitelistResponse>(await this.doRequest("1.0", "baas.antdao.blockanalysis.whitelist.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateBaasAntdaoBlockanalysisWhitelistResponse({}));
  }

  /**
   * Description: 查询租户的授权代理权限
   * Summary: 数字商品服务-拉块服务-代理权限查询
   */
  async queryBaasAntdaoBlockanalysisDelegaterelation(request: QueryBaasAntdaoBlockanalysisDelegaterelationRequest): Promise<QueryBaasAntdaoBlockanalysisDelegaterelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasAntdaoBlockanalysisDelegaterelationEx(request, runtime);
  }

  /**
   * Description: 查询租户的授权代理权限
   * Summary: 数字商品服务-拉块服务-代理权限查询
   */
  async queryBaasAntdaoBlockanalysisDelegaterelationEx(request: QueryBaasAntdaoBlockanalysisDelegaterelationRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasAntdaoBlockanalysisDelegaterelationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasAntdaoBlockanalysisDelegaterelationResponse>(await this.doRequest("1.0", "baas.antdao.blockanalysis.delegaterelation.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasAntdaoBlockanalysisDelegaterelationResponse({}));
  }

  /**
   * Description: 查询接口访问白名单信息
   * Summary: 数字商品服务-拉块服务-查询接口白名单
   */
  async queryBaasAntdaoBlockanalysisWhitelist(request: QueryBaasAntdaoBlockanalysisWhitelistRequest): Promise<QueryBaasAntdaoBlockanalysisWhitelistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasAntdaoBlockanalysisWhitelistEx(request, runtime);
  }

  /**
   * Description: 查询接口访问白名单信息
   * Summary: 数字商品服务-拉块服务-查询接口白名单
   */
  async queryBaasAntdaoBlockanalysisWhitelistEx(request: QueryBaasAntdaoBlockanalysisWhitelistRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasAntdaoBlockanalysisWhitelistResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasAntdaoBlockanalysisWhitelistResponse>(await this.doRequest("1.0", "baas.antdao.blockanalysis.whitelist.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasAntdaoBlockanalysisWhitelistResponse({}));
  }

  /**
   * Description: 根据交易hash获取交易信息
   * Summary: 数字商品服务-拉块服务-获取交易信息
   */
  async queryBaasAntdaoBlockanalysisTransaction(request: QueryBaasAntdaoBlockanalysisTransactionRequest): Promise<QueryBaasAntdaoBlockanalysisTransactionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasAntdaoBlockanalysisTransactionEx(request, runtime);
  }

  /**
   * Description: 根据交易hash获取交易信息
   * Summary: 数字商品服务-拉块服务-获取交易信息
   */
  async queryBaasAntdaoBlockanalysisTransactionEx(request: QueryBaasAntdaoBlockanalysisTransactionRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasAntdaoBlockanalysisTransactionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasAntdaoBlockanalysisTransactionResponse>(await this.doRequest("1.0", "baas.antdao.blockanalysis.transaction.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasAntdaoBlockanalysisTransactionResponse({}));
  }

  /**
   * Description: 可订购的SKU列表查询
   * Summary: 数字商品服务-商品服务-商品列表查询
   */
  async queryBaasAntdaoMypointsSku(request: QueryBaasAntdaoMypointsSkuRequest): Promise<QueryBaasAntdaoMypointsSkuResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasAntdaoMypointsSkuEx(request, runtime);
  }

  /**
   * Description: 可订购的SKU列表查询
   * Summary: 数字商品服务-商品服务-商品列表查询
   */
  async queryBaasAntdaoMypointsSkuEx(request: QueryBaasAntdaoMypointsSkuRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasAntdaoMypointsSkuResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasAntdaoMypointsSkuResponse>(await this.doRequest("1.0", "baas.antdao.mypoints.sku.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasAntdaoMypointsSkuResponse({}));
  }

  /**
   * Description: 查询商户的积分库和预算库
   * Summary: 数字商品服务-商品服务-积分预算库查询
   */
  async queryBaasAntdaoMypointsMerchantbalance(request: QueryBaasAntdaoMypointsMerchantbalanceRequest): Promise<QueryBaasAntdaoMypointsMerchantbalanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasAntdaoMypointsMerchantbalanceEx(request, runtime);
  }

  /**
   * Description: 查询商户的积分库和预算库
   * Summary: 数字商品服务-商品服务-积分预算库查询
   */
  async queryBaasAntdaoMypointsMerchantbalanceEx(request: QueryBaasAntdaoMypointsMerchantbalanceRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasAntdaoMypointsMerchantbalanceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasAntdaoMypointsMerchantbalanceResponse>(await this.doRequest("1.0", "baas.antdao.mypoints.merchantbalance.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasAntdaoMypointsMerchantbalanceResponse({}));
  }

  /**
   * Description: 预下单商品
   * Summary: 数字商品服务-商品服务-商品预下单
   */
  async execBaasAntdaoMypointsPreordersku(request: ExecBaasAntdaoMypointsPreorderskuRequest): Promise<ExecBaasAntdaoMypointsPreorderskuResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.execBaasAntdaoMypointsPreorderskuEx(request, runtime);
  }

  /**
   * Description: 预下单商品
   * Summary: 数字商品服务-商品服务-商品预下单
   */
  async execBaasAntdaoMypointsPreorderskuEx(request: ExecBaasAntdaoMypointsPreorderskuRequest, runtime: $Util.RuntimeOptions): Promise<ExecBaasAntdaoMypointsPreorderskuResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBaasAntdaoMypointsPreorderskuResponse>(await this.doRequest("1.0", "baas.antdao.mypoints.preordersku.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ExecBaasAntdaoMypointsPreorderskuResponse({}));
  }

  /**
   * Description: 商品下单
   * Summary: 数字商品服务-商品服务-商品下单
   */
  async execBaasAntdaoMypointsOrdersku(request: ExecBaasAntdaoMypointsOrderskuRequest): Promise<ExecBaasAntdaoMypointsOrderskuResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.execBaasAntdaoMypointsOrderskuEx(request, runtime);
  }

  /**
   * Description: 商品下单
   * Summary: 数字商品服务-商品服务-商品下单
   */
  async execBaasAntdaoMypointsOrderskuEx(request: ExecBaasAntdaoMypointsOrderskuRequest, runtime: $Util.RuntimeOptions): Promise<ExecBaasAntdaoMypointsOrderskuResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecBaasAntdaoMypointsOrderskuResponse>(await this.doRequest("1.0", "baas.antdao.mypoints.ordersku.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ExecBaasAntdaoMypointsOrderskuResponse({}));
  }

  /**
   * Description: 根据商品ID，查询批量购买的费率
   * Summary: 数字商品服务-商品服务-商品费率查询
   */
  async queryBaasAntdaoMypointsSkufee(request: QueryBaasAntdaoMypointsSkufeeRequest): Promise<QueryBaasAntdaoMypointsSkufeeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasAntdaoMypointsSkufeeEx(request, runtime);
  }

  /**
   * Description: 根据商品ID，查询批量购买的费率
   * Summary: 数字商品服务-商品服务-商品费率查询
   */
  async queryBaasAntdaoMypointsSkufeeEx(request: QueryBaasAntdaoMypointsSkufeeRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasAntdaoMypointsSkufeeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasAntdaoMypointsSkufeeResponse>(await this.doRequest("1.0", "baas.antdao.mypoints.skufee.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasAntdaoMypointsSkufeeResponse({}));
  }

  /**
   * Description: 查询集分宝SKU的预下单流水记录
   * Summary: 数字商品服务-商品服务-预下单流水查询
   */
  async queryBaasAntdaoMypointsPreorderinstruction(request: QueryBaasAntdaoMypointsPreorderinstructionRequest): Promise<QueryBaasAntdaoMypointsPreorderinstructionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasAntdaoMypointsPreorderinstructionEx(request, runtime);
  }

  /**
   * Description: 查询集分宝SKU的预下单流水记录
   * Summary: 数字商品服务-商品服务-预下单流水查询
   */
  async queryBaasAntdaoMypointsPreorderinstructionEx(request: QueryBaasAntdaoMypointsPreorderinstructionRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasAntdaoMypointsPreorderinstructionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasAntdaoMypointsPreorderinstructionResponse>(await this.doRequest("1.0", "baas.antdao.mypoints.preorderinstruction.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasAntdaoMypointsPreorderinstructionResponse({}));
  }

  /**
   * Description: 查询下单流水信息
   * Summary: 数字商品服务-商品服务-商品下单流水查询
   */
  async queryBaasAntdaoMypointsOrderinstruction(request: QueryBaasAntdaoMypointsOrderinstructionRequest): Promise<QueryBaasAntdaoMypointsOrderinstructionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryBaasAntdaoMypointsOrderinstructionEx(request, runtime);
  }

  /**
   * Description: 查询下单流水信息
   * Summary: 数字商品服务-商品服务-商品下单流水查询
   */
  async queryBaasAntdaoMypointsOrderinstructionEx(request: QueryBaasAntdaoMypointsOrderinstructionRequest, runtime: $Util.RuntimeOptions): Promise<QueryBaasAntdaoMypointsOrderinstructionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBaasAntdaoMypointsOrderinstructionResponse>(await this.doRequest("1.0", "baas.antdao.mypoints.orderinstruction.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryBaasAntdaoMypointsOrderinstructionResponse({}));
  }

}
