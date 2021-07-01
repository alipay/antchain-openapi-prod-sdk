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

// 交易日志
export class LogEntry extends $tea.Model {
  // 交易发起方
  from: string;
  // log信息
  logData: string;
  // 交易接受方
  to: string;
  // 交易topic
  topics: string[];
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
  key: number;
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
  price: string;
  // 相对比例
  ratio: string;
  // 对租户价格(需要和当前生效价格匹配)
  snapshotTenantPrice: string;
  // 价格类型(数值/比例)
  userPriceType: number;
  // 租户用户价格包括费率
  userPriceWithCommission: string;
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
  data: string;
  // 交易扩展信息
  extension: Extension[];
  // 交易发起方
  from: string;
  // 交易gas消耗
  gas: number;
  // 分组id，暂时没用
  groupId: string;
  // 交易哈希
  hash: string;
  // 交易随机数
  nonce: string;
  // 交易时间
  period: number;
  // 交易签名
  signature: string[];
  // 交易时间戳
  timestamp: number;
  // 交易接收方
  to: string;
  // 2
  type: number;
  // 交易转账金额
  value: number;
  // 2
  version: number;
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

// 手续费分级
export class CommissionLayer extends $tea.Model {
  // 阶梯起始值，无结束值
  startNum: string;
  // 手续费费率
  deductRatio: string;
  // 固定的商品费率值
  deductToken: string;
  static names(): { [key: string]: string } {
    return {
      startNum: 'start_num',
      deductRatio: 'deduct_ratio',
      deductToken: 'deduct_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      startNum: 'string',
      deductRatio: 'string',
      deductToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 联系人详情
export class DockingPeopleInfo extends $tea.Model {
  // 名字
  name: string;
  // 手机号
  mobilePhone: string;
  // 职位
  position: string;
  // 邮箱
  email?: string;
  // 钉钉号
  dingDing?: string;
  // 座机
  telePhone?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      mobilePhone: 'mobile_phone',
      position: 'position',
      email: 'email',
      dingDing: 'ding_ding',
      telePhone: 'tele_phone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      mobilePhone: 'string',
      position: 'string',
      email: 'string',
      dingDing: 'string',
      telePhone: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 交易收据
export class BlockReceipt extends $tea.Model {
  // 使用的gas数量
  gasUsed: number;
  // 收据log信息
  logs: LogEntry[];
  // 交易输出
  output: string;
  // 交易结果，0为成功
  result: number;
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

// ip的sku信息
export class IpSkuInfo extends $tea.Model {
  // ip的链上id
  ipId: string;
  // ip的渠道名字
  channelName: string;
  // 售卖的商品价格范围
  priceRange: string;
  // ip售卖单价
  purchasePrice: string;
  // 套餐中ip的数量
  saleNum: string;
  static names(): { [key: string]: string } {
    return {
      ipId: 'ip_id',
      channelName: 'channel_name',
      priceRange: 'price_range',
      purchasePrice: 'purchase_price',
      saleNum: 'sale_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ipId: 'string',
      channelName: 'string',
      priceRange: 'string',
      purchasePrice: 'string',
      saleNum: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 手续费子结构体
export class SubCommissionRule extends $tea.Model {
  // deduct_token
  deductToken: string;
  // deduct_ratio
  deductRatio: string;
  // account_id
  accountId: string;
  static names(): { [key: string]: string } {
    return {
      deductToken: 'deduct_token',
      deductRatio: 'deduct_ratio',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deductToken: 'string',
      deductRatio: 'string',
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// IP授权交易: AddressInfo
export class IPAddressInfo extends $tea.Model {
  // 省份编码
  provinceCode: string;
  // 城市编码
  cityCode: string;
  // 区域编码
  districtCode: string;
  // 详细地址
  address: string;
  static names(): { [key: string]: string } {
    return {
      provinceCode: 'province_code',
      cityCode: 'city_code',
      districtCode: 'district_code',
      address: 'address',
    };
  }

  static types(): { [key: string]: any } {
    return {
      provinceCode: 'string',
      cityCode: 'string',
      districtCode: 'string',
      address: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// IP授权服务: CardInfo
export class IPCardInfo extends $tea.Model {
  // 卡户名
  accountHolderName: string;
  // 卡号
  accountNo: string;
  // 银行名称
  accountInstName: string;
  // 银行缩写
  accountInstId: string;
  // 联行号
  bankCode?: string;
  // 开户行所在省份
  accountInstProvince: string;
  // 开户行所在城市
  accountInstCity: string;
  // 开户行支行名称
  accountBranchName: string;
  static names(): { [key: string]: string } {
    return {
      accountHolderName: 'account_holder_name',
      accountNo: 'account_no',
      accountInstName: 'account_inst_name',
      accountInstId: 'account_inst_id',
      bankCode: 'bank_code',
      accountInstProvince: 'account_inst_province',
      accountInstCity: 'account_inst_city',
      accountBranchName: 'account_branch_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accountHolderName: 'string',
      accountNo: 'string',
      accountInstName: 'string',
      accountInstId: 'string',
      bankCode: 'string',
      accountInstProvince: 'string',
      accountInstCity: 'string',
      accountBranchName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 正版码配置的商品信息
export class IPCodeGoodsInfo extends $tea.Model {
  // 商品名称
  goodsName?: string;
  // 商品链接
  goodsUrl?: string;
  // 商品图片
  goodsImage?: string;
  // 商品店铺名称
  goodsStore?: string;
  // 店铺logo图片链接
  goodsStoreLogo?: string;
  static names(): { [key: string]: string } {
    return {
      goodsName: 'goods_name',
      goodsUrl: 'goods_url',
      goodsImage: 'goods_image',
      goodsStore: 'goods_store',
      goodsStoreLogo: 'goods_store_logo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      goodsName: 'string',
      goodsUrl: 'string',
      goodsImage: 'string',
      goodsStore: 'string',
      goodsStoreLogo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 增值服务信息
export class ValueAddedServiceInfo extends $tea.Model {
  // 增值服务归属账户id
  accountId: string;
  // 增值服务id
  serviceId: string;
  // 增值服务名字
  serviceName: string;
  // 主图 链接地址
  images: string;
  // 详情图
  imagesDetail: string;
  // 增值服务描述
  description?: string;
  // 联系人列表
  dockingPeople: DockingPeopleInfo[];
  // 资质证明
  copyRight?: string;
  // 备注
  memo?: string;
  // 服务状态（0:待审核 1:审核拒绝 2:上线【审核通过】 3: 下线）
  status: number;
  static names(): { [key: string]: string } {
    return {
      accountId: 'account_id',
      serviceId: 'service_id',
      serviceName: 'service_name',
      images: 'images',
      imagesDetail: 'images_detail',
      description: 'description',
      dockingPeople: 'docking_people',
      copyRight: 'copy_right',
      memo: 'memo',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accountId: 'string',
      serviceId: 'string',
      serviceName: 'string',
      images: 'string',
      imagesDetail: 'string',
      description: 'string',
      dockingPeople: { 'type': 'array', 'itemType': DockingPeopleInfo },
      copyRight: 'string',
      memo: 'string',
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 权益附属信息
export class EquityExtInfo extends $tea.Model {
  // 指定兑换日限制已使用
  limitPerDayUsed: number;
  // 指定兑换月限制已使用
  limitPerMonthUsed: number;
  // 权益开放的租户ID
  openToTenantId: string;
  // 指定日期
  targetDate: string;
  // 权益对租户价格
  tenantPrice: string;
  // 授权给租户用户的价格
  tenantUserPrice: UserPrice;
  // 租户价格包括费率
  tenantPriceWithCommission: string;
  // 费率
  commission: string;
  static names(): { [key: string]: string } {
    return {
      limitPerDayUsed: 'limit_per_day_used',
      limitPerMonthUsed: 'limit_per_month_used',
      openToTenantId: 'open_to_tenant_id',
      targetDate: 'target_date',
      tenantPrice: 'tenant_price',
      tenantUserPrice: 'tenant_user_price',
      tenantPriceWithCommission: 'tenant_price_with_commission',
      commission: 'commission',
    };
  }

  static types(): { [key: string]: any } {
    return {
      limitPerDayUsed: 'number',
      limitPerMonthUsed: 'number',
      openToTenantId: 'string',
      targetDate: 'string',
      tenantPrice: 'string',
      tenantUserPrice: UserPrice,
      tenantPriceWithCommission: 'string',
      commission: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 资产附属信息
export class AssetExtInfo extends $tea.Model {
  // 发放账户余额
  dispenseBalance: string;
  // 发放账户归属租户ID
  dispenseTenantId: string;
  // 用户账户余额
  userCreditBalance: string;
  // 用户ID
  userId: string;
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

// 钱包的统计信息
export class StatisticalInfo extends $tea.Model {
  // 可用于消费的信用Token等值金额(单位:元, 精确到小数点后12位)	
  creditTokenBalance: string;
  // 可用于消费的Token等值金额(单位:元, 精确到小数点后12位)
  debitTokenBalance: string;
  // 目前持有的他人Token的金额(单位:元, 精确到小数点后12位)
  otherTokenBalance: string;
  // 已消费的累积金额(单位:元, 精确到小数点后12位)
  usedTokenBalance: string;
  static names(): { [key: string]: string } {
    return {
      creditTokenBalance: 'credit_token_balance',
      debitTokenBalance: 'debit_token_balance',
      otherTokenBalance: 'other_token_balance',
      usedTokenBalance: 'used_token_balance',
    };
  }

  static types(): { [key: string]: any } {
    return {
      creditTokenBalance: 'string',
      debitTokenBalance: 'string',
      otherTokenBalance: 'string',
      usedTokenBalance: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// IP授权服务: SettleRule
export class IPSettleRule extends $tea.Model {
  // 结算类型， 1-表示结算到银行卡；2-表示结算到支付宝账号
  settleType: number;
  // 结算目标 如果settle_type = 1, 这里填写银行卡卡号; 如果settle_type = 2, 这里填写支付宝账号登录号, 且要求与商户名称name同名
  settleTarget: string;
  static names(): { [key: string]: string } {
    return {
      settleType: 'settle_type',
      settleTarget: 'settle_target',
    };
  }

  static types(): { [key: string]: any } {
    return {
      settleType: 'number',
      settleTarget: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 消费卡交易信息附加数据
export class MetaDataDO extends $tea.Model {
  // key
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

// 余额钱包信息
export class DebitWallet extends $tea.Model {
  // 钱包余额(单位:元, 精确到小数点后4位)
  balance: string;
  // 开户名称
  bankAccountName: string;
  // 开户地
  bankAddress: string;
  // 开户银行分支机构名称
  bankBranchName: string;
  // 开户卡号
  bankCardId: string;
  // 开户行名称
  bankName: string;
  // 其他信息（例举：联行号）
  extInfo: string;
  // 资金管理员
  fundManagerId: string;
  // 资金托管员
  trusteeId: string;
  // 钱包类型（0:debit,1:credit）
  walletType: number;
  static names(): { [key: string]: string } {
    return {
      balance: 'balance',
      bankAccountName: 'bank_account_name',
      bankAddress: 'bank_address',
      bankBranchName: 'bank_branch_name',
      bankCardId: 'bank_card_id',
      bankName: 'bank_name',
      extInfo: 'ext_info',
      fundManagerId: 'fund_manager_id',
      trusteeId: 'trustee_id',
      walletType: 'wallet_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      balance: 'string',
      bankAccountName: 'string',
      bankAddress: 'string',
      bankBranchName: 'string',
      bankCardId: 'string',
      bankName: 'string',
      extInfo: 'string',
      fundManagerId: 'string',
      trusteeId: 'string',
      walletType: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// sku的基础信息
export class IpSkuEmphasisInfo extends $tea.Model {
  // 价格区间，不做校验
  priceRange: string;
  // 单价
  purchasePrice: string;
  // 套餐数量
  saleNum: string;
  static names(): { [key: string]: string } {
    return {
      priceRange: 'price_range',
      purchasePrice: 'purchase_price',
      saleNum: 'sale_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      priceRange: 'string',
      purchasePrice: 'string',
      saleNum: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 区块体
export class BlockBody extends $tea.Model {
  // 区块共识证明(HEX)
  consensusProof: string;
  // 区块中交易回执列表
  receiptList: BlockReceipt[];
  // 区块中交易列表
  transactionList: BlockTransaction[];
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

// 手续费周期
export class CommissionPeriod extends $tea.Model {
  // 手续费费率
  deductRatio: string;
  // 手续费子结构
  subCommissionRules: SubCommissionRule[];
  // 买家的历史统计做阶梯计费，最多50个
  merchantLayers: CommissionLayer[];
  // 商品阶梯
  goodsLayers: CommissionLayer[];
  // 手续费开始时间（无结束时间）
  startTimeMills: number;
  // 0: txcount（成功的交易）; 1: 累计交易金额; 2:累计手续费; 3：单笔金额, ...
  layerType: number;
  // 分层的周期，（0是月，1是日，2是年（这期不用，需要设置一下）, 3是季度）
  counterTimeType: number;
  // 商品固定费用
  deductToken: string;
  static names(): { [key: string]: string } {
    return {
      deductRatio: 'deduct_ratio',
      subCommissionRules: 'sub_commission_rules',
      merchantLayers: 'merchant_layers',
      goodsLayers: 'goods_layers',
      startTimeMills: 'start_time_mills',
      layerType: 'layer_type',
      counterTimeType: 'counter_time_type',
      deductToken: 'deduct_token',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deductRatio: 'string',
      subCommissionRules: { 'type': 'array', 'itemType': SubCommissionRule },
      merchantLayers: { 'type': 'array', 'itemType': CommissionLayer },
      goodsLayers: { 'type': 'array', 'itemType': CommissionLayer },
      startTimeMills: 'number',
      layerType: 'number',
      counterTimeType: 'number',
      deductToken: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商户备付金账户
export class Provision extends $tea.Model {
  // 授信上限
  creditMax: string;
  // 授信已使用
  creditUsed: string;
  // 币种
  currency: string;
  // 余额
  debit: string;
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

// 信用钱包信息
export class CreditWallet extends $tea.Model {
  // 最大授信额度(单位:元,精确到小数点后4位)
  maxBalance: string;
  // 已经使用的授信额度(单位:元,精确到小数点后4位)
  usedBalance: string;
  // 钱包类型（0:debit,1:credit）
  walletType: number;
  // 资金管理员
  fundManagerId: string;
  // 资金托管员
  trusteeId: string;
  // 其他信息（例举：联行号）
  extInfo: string;
  static names(): { [key: string]: string } {
    return {
      maxBalance: 'max_balance',
      usedBalance: 'used_balance',
      walletType: 'wallet_type',
      fundManagerId: 'fund_manager_id',
      trusteeId: 'trustee_id',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      maxBalance: 'string',
      usedBalance: 'string',
      walletType: 'number',
      fundManagerId: 'string',
      trusteeId: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 权益详情
export class EquityDetail extends $tea.Model {
  // 权益描述
  description: string;
  // 权益描述图片OSS地址（分号;分隔）
  descImages: string;
  // 权益ID
  equityId: string;
  // 权益名称
  equityName: string;
  // 权益类型
  equityType: string;
  // 权益面值(元)
  equityValue: string;
  // 权益主图片OSS地址（分号;分隔）
  images: string;
  // 对客价(元)
  price: string;
  // 权益SKU
  skuId: string;
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

// ip的基础信息字段
export class IpBasicInfo extends $tea.Model {
  // ip名字
  ipName: string;
  // ip的链上id
  ipId: string;
  // ip类型，多个用;隔开
  ipType: string;
  // 受众群体，多个用;隔开
  audienceGroup: string;
  // ip主图,存放oss图片链接;隔开
  image: string;
  // 商品详情图 存放OSS图片链接 用;隔开
  imageDetail: string;
  // ip 描述
  description: string;
  // 对接人信息，json列表
  // [{
  // "name":"123", //联系人名字，必填
  // "mobilePhone":"123",// 联系人手机号,必填
  // "email":"456",// 联系人邮箱,选填
  // "dingDing":"999",// 联系人钉钉号,选填
  // "telePhone":"8888",// 联系人座机,选填
  // "position":"aaa"// 联系人职务,必填
  // }]
  dockingPeopleInfo: DockingPeopleInfo[];
  // 资质信息
  copyRight: string;
  // 合作案例，图片存放oss链接，多张用,隔开
  cooperationCase?: string;
  // 合作事项
  cooperationNote?: string;
  // 查询渠道
  channelName: string;
  // ip的外部创建时间，毫秒时间戳
  ipCreateTime?: number;
  // 未来大事件
  futureMilestones?: string;
  // 推广渠道
  promotionChannels?: string;
  // 系统中创建时间
  systemCreateTime: number;
  // ip别名，多个用;隔开
  ipOtherName: string;
  // ip的状态 0 待审批， 1 审批通过 2 审批拒绝
  approvalStatus?: number;
  // 审批意见
  approvalComments?: string;
  // 备注信息
  memo: string;
  // 资质生效时间，毫秒时间戳
  copyRightBeginTime: number;
  // 创建ip的版权方的链上账户
  accountId: string;
  // 资质生效的结束时间
  copyRightEndTime: number;
  // 账户名称
  accountName?: string;
  static names(): { [key: string]: string } {
    return {
      ipName: 'ip_name',
      ipId: 'ip_id',
      ipType: 'ip_type',
      audienceGroup: 'audience_group',
      image: 'image',
      imageDetail: 'image_detail',
      description: 'description',
      dockingPeopleInfo: 'docking_people_info',
      copyRight: 'copy_right',
      cooperationCase: 'cooperation_case',
      cooperationNote: 'cooperation_note',
      channelName: 'channel_name',
      ipCreateTime: 'ip_create_time',
      futureMilestones: 'future_milestones',
      promotionChannels: 'promotion_channels',
      systemCreateTime: 'system_create_time',
      ipOtherName: 'ip_other_name',
      approvalStatus: 'approval_status',
      approvalComments: 'approval_comments',
      memo: 'memo',
      copyRightBeginTime: 'copy_right_begin_time',
      accountId: 'account_id',
      copyRightEndTime: 'copy_right_end_time',
      accountName: 'account_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ipName: 'string',
      ipId: 'string',
      ipType: 'string',
      audienceGroup: 'string',
      image: 'string',
      imageDetail: 'string',
      description: 'string',
      dockingPeopleInfo: { 'type': 'array', 'itemType': DockingPeopleInfo },
      copyRight: 'string',
      cooperationCase: 'string',
      cooperationNote: 'string',
      channelName: 'string',
      ipCreateTime: 'number',
      futureMilestones: 'string',
      promotionChannels: 'string',
      systemCreateTime: 'number',
      ipOtherName: 'string',
      approvalStatus: 'number',
      approvalComments: 'string',
      memo: 'string',
      copyRightBeginTime: 'number',
      accountId: 'string',
      copyRightEndTime: 'number',
      accountName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// IP授权服务: ContactInfo
export class IPContactInfo extends $tea.Model {
  // 联系人姓名
  name: string;
  // 联系人手机号码
  mobile?: string;
  // 联系人电话号码
  phone?: string;
  // 联系人类型, 1-法人；2-实际控制人；3-代理人；4-其他
  type: number;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      mobile: 'mobile',
      phone: 'phone',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      mobile: 'string',
      phone: 'string',
      type: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 正版码配置资源位信息
export class IPCodeAdvertisingInfo extends $tea.Model {
  // 资源位头图
  adImage?: string;
  // 资源位链接
  adUrl?: string;
  static names(): { [key: string]: string } {
    return {
      adImage: 'ad_image',
      adUrl: 'ad_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      adImage: 'string',
      adUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 区块头
export class BlockHeader extends $tea.Model {
  // gas总消耗
  gasUsed: number;
  // 十六进制区块哈希值
  hash: string;
  // log bloom
  logBloom: string;
  // 区块高度
  number: number;
  // 十六进制区块父hash
  parentHash: string;
  // 交易单据树根
  receiptRoot: string;
  // 状态树根
  stateRoot: string;
  // 区块时间戳
  timestamp: number;
  // 十六进制交易merkle树根
  transactionRoot: string;
  // 区块版本
  version: number;
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

// 交易token来源信息
export class TokenInstructionDO extends $tea.Model {
  // token类型
  tokenType: number;
  // token价格
  tokenPrice: string;
  // token来源账户ID
  payAccountId: string;
  static names(): { [key: string]: string } {
    return {
      tokenType: 'token_type',
      tokenPrice: 'token_price',
      payAccountId: 'pay_account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tokenType: 'number',
      tokenPrice: 'string',
      payAccountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ip的渠道信息带上sku信息
export class IpChannelWithSku extends $tea.Model {
  // 渠道名字
  channelName: string;
  // 授权模式 商品授权 0普通授权/1独家授权 本期只有0
  // 
  authorizationMode: number;
  // 计费模式 0:按量 1:按金额
  // 
  payMode: number;
  // ip等级  0:经典IP/1:流量IP/2:设计IP
  ipLevel: number;
  // sku信息
  skuInfo: IpSkuInfo[];
  // 商品状态（0:待上架，1:上架，2:下架）
  status: number;
  // 交易是否需要确认
  tradeNeedConfirm?: boolean;
  static names(): { [key: string]: string } {
    return {
      channelName: 'channel_name',
      authorizationMode: 'authorization_mode',
      payMode: 'pay_mode',
      ipLevel: 'ip_level',
      skuInfo: 'sku_info',
      status: 'status',
      tradeNeedConfirm: 'trade_need_confirm',
    };
  }

  static types(): { [key: string]: any } {
    return {
      channelName: 'string',
      authorizationMode: 'number',
      payMode: 'number',
      ipLevel: 'number',
      skuInfo: { 'type': 'array', 'itemType': IpSkuInfo },
      status: 'number',
      tradeNeedConfirm: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 卡密信息
export class Card extends $tea.Model {
  // 计算理论上应该变为的状态
  calStatus: number;
  // 卡密ID
  cardId: string;
  // 充值时间
  chargeTime: number;
  // 数量
  countOfMinUnit: number;
  // 卡密创建时间
  createTime: number;
  // 创建卡密时的交易hash
  createTxHash: string;
  // 脱敏手机信息
  desensitizedUid: string;
  // 附加信息
  extInfo: string;
  // 最小单位数量
  minUnit: number;
  // 公钥
  publicKey: string;
  // 状态
  status: number;
  // 公钥信息
  uidPublicKey: string;
  // 卡密在该时间后有效
  validAfter: number;
  // 卡密在该时间前有效
  validBefore: number;
  // 有效天数
  validDays: number;
  // 价值
  value: number;
  // 卡密版本
  version: number;
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
  rate: string;
  // 包含集分宝个数
  skuAmount: number;
  // 商品ID
  skuId: string;
  // 商品名称
  skuName: string;
  // 商品面值（单位：元）
  skuPrice: string;
  // 商品状态：0可用，1冻结，2下线
  status: number;
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

// 手续费规则结果
export class CommissionRuleResponse extends $tea.Model {
  // 手续费到账方
  accountId: string;
  // 手续费周期列表
  commissionPeriods: CommissionPeriod[];
  static names(): { [key: string]: string } {
    return {
      accountId: 'account_id',
      commissionPeriods: 'commission_periods',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accountId: 'string',
      commissionPeriods: { 'type': 'array', 'itemType': CommissionPeriod },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// MCC信息(https://gw.alipayobjects.com/os/bmw-prod/05c9a32e-42d1-436b-ace7-13101d91f672.xlsx）
export class IPMCC extends $tea.Model {
  // MCC编码
  mccCode: string;
  // 经营类目一级
  categoryLevel1: string;
  // 经营类目二级
  categoryLevel2: string;
  // 经营类目三级
  categoryLevel3: string;
  static names(): { [key: string]: string } {
    return {
      mccCode: 'mcc_code',
      categoryLevel1: 'category_level1',
      categoryLevel2: 'category_level2',
      categoryLevel3: 'category_level3',
    };
  }

  static types(): { [key: string]: any } {
    return {
      mccCode: 'string',
      categoryLevel1: 'string',
      categoryLevel2: 'string',
      categoryLevel3: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 手续费信息
export class Commission extends $tea.Model {
  // 要更新的手续费状态
  status: number;
  // 手续费生效时间（时间戳 ms）
  beginTime?: number;
  // 手续费结束时间
  endTime?: number;
  // 手续费
  commission: string;
  static names(): { [key: string]: string } {
    return {
      status: 'status',
      beginTime: 'begin_time',
      endTime: 'end_time',
      commission: 'commission',
    };
  }

  static types(): { [key: string]: any } {
    return {
      status: 'number',
      beginTime: 'number',
      endTime: 'number',
      commission: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 消费卡数据
export class BlockConsumeCardInfo extends $tea.Model {
  // 外部系统对该个人/机构用户的内部编号,用于唯一识别该用户
  userId: string;
  // 用户的链上账户Id
  accountId: string;
  // 开户行名称
  bankName: string;
  // 消费卡开通绑定的银行卡卡号
  bankCardId: string;
  // 开户名称
  accountName: string;
  // 账户余额(元)
  debitAmount: string;
  // 信用余额(元)
  creditAmount: string;
  // 资产的来源<来源账户ID_余额/信用额, 数量>, 例如: "accountId1_Debit": 11000表示这笔资产来源于accountId1,是accountId1这个账户通过Debit余额发行的资产。
  assetMap: string;
  static names(): { [key: string]: string } {
    return {
      userId: 'user_id',
      accountId: 'account_id',
      bankName: 'bank_name',
      bankCardId: 'bank_card_id',
      accountName: 'account_name',
      debitAmount: 'debit_amount',
      creditAmount: 'credit_amount',
      assetMap: 'asset_map',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userId: 'string',
      accountId: 'string',
      bankName: 'string',
      bankCardId: 'string',
      accountName: 'string',
      debitAmount: 'string',
      creditAmount: 'string',
      assetMap: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// sku配置加上ip等级
export class IpSkuConfigWithLevel extends $tea.Model {
  // 价格区间
  priceRange: string;
  // 单价
  purchasePrice: string;
  // 销售数量
  saleNum: number;
  // ip等级
  ipLevel: number;
  static names(): { [key: string]: string } {
    return {
      priceRange: 'price_range',
      purchasePrice: 'purchase_price',
      saleNum: 'sale_num',
      ipLevel: 'ip_level',
    };
  }

  static types(): { [key: string]: any } {
    return {
      priceRange: 'string',
      purchasePrice: 'string',
      saleNum: 'number',
      ipLevel: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 图片OSS URL，包含四个不同大小的图片
export class MultiURL extends $tea.Model {
  // 上传的图片正常大小
  normal: string;
  // style200
  style200: string;
  // style150
  style150: string;
  // style70
  style70: string;
  static names(): { [key: string]: string } {
    return {
      normal: 'normal',
      style200: 'style_200',
      style150: 'style_150',
      style70: 'style_70',
    };
  }

  static types(): { [key: string]: any } {
    return {
      normal: 'string',
      style200: 'string',
      style150: 'string',
      style70: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 消费卡服务基础请求信息
export class BaseRequest extends $tea.Model {
  // 用户的链上账户Id(长度不超过256个字符)
  accountId: string;
  // 业务幂等Id,防止同一笔交易重复发送(长度不超过256个字符)
  bizId: string;
  // 支持多链多合约,该参数为指明需要操作哪个智能合约环境(长度不超过50个字符)
  chainId: string;
  // 备注信息(不要超过500个字符)。
  // 部分接口要求memo必填，以接口返回信息为准。
  memo?: string;
  // 场景码(入驻时申请)(长度不超过50个字符)
  productCode: string;
  static names(): { [key: string]: string } {
    return {
      accountId: 'account_id',
      bizId: 'biz_id',
      chainId: 'chain_id',
      memo: 'memo',
      productCode: 'product_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accountId: 'string',
      bizId: 'string',
      chainId: 'string',
      memo: 'string',
      productCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 增值服务加sku信息
export class ValueAddedServiceInfoWithSku extends $tea.Model {
  // 增值服务信息
  addValueInfo: ValueAddedServiceInfo;
  // sku信息
  skus: IpSkuEmphasisInfo[];
  static names(): { [key: string]: string } {
    return {
      addValueInfo: 'add_value_info',
      skus: 'skus',
    };
  }

  static types(): { [key: string]: any } {
    return {
      addValueInfo: ValueAddedServiceInfo,
      skus: { 'type': 'array', 'itemType': IpSkuEmphasisInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 链上交易结构
export class Transaction extends $tea.Model {
  // 交易数据，转换位十六进制
  data: string;
  // 卡密管理员链上ID，64位十六进制。
  from: string;
  // 交易hash，十六进制编码
  hash: string;
  // 交易随机数
  nonce: number;
  // 交易时间
  period: number;
  // from账户对应的公钥，128位十六进制。
  publicKey: string;
  // 交易签名，十六进制编码
  signature: string;
  // 交易时间戳
  timestamp: number;
  // 交易目标地址，64位十六进制。
  to: string;
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
  sortId: number;
  // 文本信息
  text: string;
  // 文本值
  value: string;
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

// 消费卡服务OpenAPI基础返回值
export class BaseResponseData extends $tea.Model {
  // 区块链交易执行的区块高度
  blockNumber: number;
  // 交易的业务幂等Id,与交易发起时外部传入的一致
  outBizId: string;
  // 区块链交易执行的哈希
  txHash: string;
  static names(): { [key: string]: string } {
    return {
      blockNumber: 'block_number',
      outBizId: 'out_biz_id',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      blockNumber: 'number',
      outBizId: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// IP图库记录
export class IPGalleryInstruction extends $tea.Model {
  // 下载时间
  timestamp: number;
  // 授权订单ID
  ipOrderId: string;
  // IP链上ID
  ipId: string;
  // 图库链接
  ipGalleryUrl: string;
  // 图库下载链接，默认过期时间2小时
  ipGalleryTemporaryUrl: string;
  // 图库版本
  ipGalleryVersion: number;
  // IP当前图库状态：0 生效中，1 已失效
  ipGalleryStatus: number;
  // 备注信息
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      timestamp: 'timestamp',
      ipOrderId: 'ip_order_id',
      ipId: 'ip_id',
      ipGalleryUrl: 'ip_gallery_url',
      ipGalleryTemporaryUrl: 'ip_gallery_temporary_url',
      ipGalleryVersion: 'ip_gallery_version',
      ipGalleryStatus: 'ip_gallery_status',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      timestamp: 'number',
      ipOrderId: 'string',
      ipId: 'string',
      ipGalleryUrl: 'string',
      ipGalleryTemporaryUrl: 'string',
      ipGalleryVersion: 'number',
      ipGalleryStatus: 'number',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 区块
export class Block extends $tea.Model {
  // 区块头
  header: BlockHeader;
  // 区块体
  body: BlockBody;
  static names(): { [key: string]: string } {
    return {
      header: 'header',
      body: 'body',
    };
  }

  static types(): { [key: string]: any } {
    return {
      header: BlockHeader,
      body: BlockBody,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用于sku config的查询
export class SkuWithLevel extends $tea.Model {
  static names(): { [key: string]: string } {
    return {
    };
  }

  static types(): { [key: string]: any } {
    return {
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ip 基础信息带上是否更新，只在渠道查询审批中用到
export class IpBasicInfoWithUpdate extends $tea.Model {
  // 基础信息
  ipBasicInfo: IpBasicInfo;
  // 是否有更新
  isUpdate: boolean;
  static names(): { [key: string]: string } {
    return {
      ipBasicInfo: 'ip_basic_info',
      isUpdate: 'is_update',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ipBasicInfo: IpBasicInfo,
      isUpdate: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// IP授权服务基础请求信息
export class BaseRequestInfo extends $tea.Model {
  // 业务幂等Id,防止同一笔交易重复发送(长度不超过256个字符)
  bizId: string;
  // 支持多链多合约,该参数为指明需要操作哪个智能合约环境(长度不超过50个字符)
  chainId: string;
  // 场景码(入驻时申请)(长度不超过50个字符)
  productCode: string;
  static names(): { [key: string]: string } {
    return {
      bizId: 'biz_id',
      chainId: 'chain_id',
      productCode: 'product_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizId: 'string',
      chainId: 'string',
      productCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 可兑换商品列表
export class ExchangeableEquityList extends $tea.Model {
  // 页面上数据在总数据中的结束位置（第几个数据）
  endRow: number;
  // 权益信息列表
  equityList: EquityDetail[];
  // 第一页页码
  firstPage: number;
  // 是否有下一页
  hasNextPage: boolean;
  // 是否有前一页
  hasPreviousPage: boolean;
  // 是否第一页
  isFirstPage: boolean;
  // 是否最后一页
  isLastPage: boolean;
  // 最后一页页码
  lastPage: number;
  // 下一页页码
  nextPage: number;
  // 排序规则
  orderBy: string;
  // 可兑换的权益总页数
  pages: number;
  // 当前页码
  pageNumber: number;
  // 页面大小
  pageSize: number;
  // 前一页页码
  prePage: number;
  // 页面中实际数量
  size: number;
  // 页面上数据在总数据中的开始位置（第几个数据）
  startRow: number;
  // 可兑换的权益总数
  total: number;
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

// 渠道统计结果
export class ChannelCounter extends $tea.Model {
  // 渠道名字
  channelName: string;
  // 统计值
  counter: number;
  // 月份。如果月份有具体值则数据为该月份数据，月份为空则为全部统计数据。
  month?: string;
  // 渠道交易金额
  totalPrice?: string;
  static names(): { [key: string]: string } {
    return {
      channelName: 'channel_name',
      counter: 'counter',
      month: 'month',
      totalPrice: 'total_price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      channelName: 'string',
      counter: 'number',
      month: 'string',
      totalPrice: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 查询手续费结果信息
export class CommissionResult extends $tea.Model {
  // 手续费生效时间
  beginTime: number;
  // 手续费
  commission: string;
  // 手续费信息ID
  commissionId: string;
  // 手续费状态（0可用，1停用，2禁用）
  commissionStatus: number;
  // 手续费失效时间
  endTime: number;
  // 商品类型
  equityType: number;
  // 租户ID
  tenantId: string;
  // 手续费信息ID
  commissionSubId: string;
  static names(): { [key: string]: string } {
    return {
      beginTime: 'begin_time',
      commission: 'commission',
      commissionId: 'commission_id',
      commissionStatus: 'commission_status',
      endTime: 'end_time',
      equityType: 'equity_type',
      tenantId: 'tenant_id',
      commissionSubId: 'commission_sub_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      beginTime: 'number',
      commission: 'string',
      commissionId: 'string',
      commissionStatus: 'number',
      endTime: 'number',
      equityType: 'number',
      tenantId: 'string',
      commissionSubId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 手续费规则
export class CommissionRule extends $tea.Model {
  // 一级分账方的账户ID
  accountId: string;
  // 手续费规则
  commissionPeriod: CommissionPeriod;
  static names(): { [key: string]: string } {
    return {
      accountId: 'account_id',
      commissionPeriod: 'commission_period',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accountId: 'string',
      commissionPeriod: CommissionPeriod,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 设置过自定义价格的权益信息
export class UserPriceEquity extends $tea.Model {
  // 权益提供商商户ID
  adminId: string;
  // 授权类型
  authType: number;
  // 币种
  currency: string;
  // 默认价格
  defaultPrice: string;
  // 权益描述
  description: string;
  // 权益描述图片
  descImages: string;
  // 权益ID
  equityD: string;
  // 权益名称
  equityName: string;
  // 权益类型
  equityType: number;
  // 权益主图片
  images: string;
  // 是否公开权益
  isPublic: boolean;
  // 商户每日兑换上线
  limitPerMerchantAndDay: number;
  // 商户每月兑换上线
  limitPerMerchantAndMonth: number;
  // 用户每日兑换上线
  limitPerUserAndDay: number;
  // 用户每月兑换上限
  limitPerUserAndMonth: number;
  // 权益附言信息
  memo: string;
  // 授权的租户ID
  openToTenantId: string;
  // 用户价格
  price: string;
  // 用户价格比例
  ratio: string;
  // 快照租户价格
  snapshotTenantPrice: string;
  // 权益状态
  status: number;
  // 权益提供商租户ID
  tenantId: string;
  // 权益库存
  totalCount: string;
  // 用户价格类型
  userPriceType: number;
  // 可用右区间
  useValidNotAfter: number;
  // 可用左区间
  useValidNotBefore: number;
  // 有效右区间
  validNotAfter: number;
  // 有效左区间
  validNotBefore: number;
  // 价值
  value: string;
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

// IP授权服务-商家进件信息
export class IPMerchantApplyInfo extends $tea.Model {
  // 链上账户Id
  accountId: string;
  // 支付宝的登陆用户名(必须实名制)
  alipayLoginName: string;
  // 商户别名, 会展示在账单以及支付结果页中
  merchantAliasName: string;
  // 商户类型(本期仅支持: 1:企业, 6:个人商户)
  merchantType: number;
  // 商户证件类型(本期仅支持: 201: 营业执照, 100: 个人商户身份证) 如果merchant_type为企业, 需要传入201; 如果merchant_type为个人, 需要传入100
  merchantCertType: number;
  // 商户证件编号(企业提供营业执照),本期人工审核
  merchantCertNumber: string;
  // 商户营业执照的图片地址,本期人工审核
  merchantCertImage: string;
  // 税务登记证明的图片,本期人工审核
  merchantSignImage: string;
  // 商户类别码mcc，参见https://gw.alipayobjects.com/os/bmw-prod/05c9a32e-42d1-436b-ace7-13101d91f672.xlsx
  mcc: string;
  // 商户法人名称, merchant_type = 01时必填
  // 
  legalName: string;
  // 商户法人身份证号码, merchant_type = 1时必填
  // 
  legalCertNo: string;
  // 商户经营地址
  // 
  addressInfo: IPAddressInfo;
  // 默认结算规则
  // 
  settleRule: IPSettleRule;
  // 商户联系人信息
  // 
  contactInfo: IPContactInfo;
  // 银行卡结算信息, 结算到银行卡时必填, 当前仅支持填入一张卡
  // 
  cardInfo: IPCardInfo;
  static names(): { [key: string]: string } {
    return {
      accountId: 'account_id',
      alipayLoginName: 'alipay_login_name',
      merchantAliasName: 'merchant_alias_name',
      merchantType: 'merchant_type',
      merchantCertType: 'merchant_cert_type',
      merchantCertNumber: 'merchant_cert_number',
      merchantCertImage: 'merchant_cert_image',
      merchantSignImage: 'merchant_sign_image',
      mcc: 'mcc',
      legalName: 'legal_name',
      legalCertNo: 'legal_cert_no',
      addressInfo: 'address_info',
      settleRule: 'settle_rule',
      contactInfo: 'contact_info',
      cardInfo: 'card_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accountId: 'string',
      alipayLoginName: 'string',
      merchantAliasName: 'string',
      merchantType: 'number',
      merchantCertType: 'number',
      merchantCertNumber: 'string',
      merchantCertImage: 'string',
      merchantSignImage: 'string',
      mcc: 'string',
      legalName: 'string',
      legalCertNo: 'string',
      addressInfo: IPAddressInfo,
      settleRule: IPSettleRule,
      contactInfo: IPContactInfo,
      cardInfo: IPCardInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// IP授权交易的账单信息
export class IPBill extends $tea.Model {
  // 订单ID
  ipOrderId: string;
  // 账单ID
  ipBillId: string;
  // 上传销售数据时的bizId
  bizId: string;
  // 收款方
  sellerId: string;
  // 付款方
  buyerId: string;
  // 账单状态
  status: number;
  // 账单创建时间，时间戳（毫秒）
  createTime: number;
  // 备注信息
  memo: string;
  // 交易类型：0套餐交易，1定向授权
  tradeType: number;
  // 支付链接
  payUrl: string;
  // 账单金额，支付金额
  billPayAmount: string;
  // 销售金额
  billSales: string;
  // 账单周期开始时间，时间戳（毫秒）
  cycleStartTime: number;
  // 账单周期结束时间，时间戳（毫秒）
  cycleEndTime: number;
  static names(): { [key: string]: string } {
    return {
      ipOrderId: 'ip_order_id',
      ipBillId: 'ip_bill_id',
      bizId: 'biz_id',
      sellerId: 'seller_id',
      buyerId: 'buyer_id',
      status: 'status',
      createTime: 'create_time',
      memo: 'memo',
      tradeType: 'trade_type',
      payUrl: 'pay_url',
      billPayAmount: 'bill_pay_amount',
      billSales: 'bill_sales',
      cycleStartTime: 'cycle_start_time',
      cycleEndTime: 'cycle_end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ipOrderId: 'string',
      ipBillId: 'string',
      bizId: 'string',
      sellerId: 'string',
      buyerId: 'string',
      status: 'number',
      createTime: 'number',
      memo: 'string',
      tradeType: 'number',
      payUrl: 'string',
      billPayAmount: 'string',
      billSales: 'string',
      cycleStartTime: 'number',
      cycleEndTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 电子券批次信息
export class CouponCollection extends $tea.Model {
  // 批次ID
  collectionId: string;
  // 电子券批次名称
  name: string;
  // 批次发行方
  issuer: string;
  // 批次前缀
  couponNumberPrefix: string;
  // 批次管理员链上ID
  couponAdminAccount: string;
  // 批次管理员租户ID
  couponAdminTenantId: string;
  // 批次过期观察员链上ID
  expireMonitorAccount: string;
  // 批次过期观察员租户ID
  expireMonitorTenantId: string;
  // 是否记名
  needRegistered: boolean;
  // 是否创建时记名
  needPreRegistered: boolean;
  static names(): { [key: string]: string } {
    return {
      collectionId: 'collection_id',
      name: 'name',
      issuer: 'issuer',
      couponNumberPrefix: 'coupon_number_prefix',
      couponAdminAccount: 'coupon_admin_account',
      couponAdminTenantId: 'coupon_admin_tenant_id',
      expireMonitorAccount: 'expire_monitor_account',
      expireMonitorTenantId: 'expire_monitor_tenant_id',
      needRegistered: 'need_registered',
      needPreRegistered: 'need_pre_registered',
    };
  }

  static types(): { [key: string]: any } {
    return {
      collectionId: 'string',
      name: 'string',
      issuer: 'string',
      couponNumberPrefix: 'string',
      couponAdminAccount: 'string',
      couponAdminTenantId: 'string',
      expireMonitorAccount: 'string',
      expireMonitorTenantId: 'string',
      needRegistered: 'boolean',
      needPreRegistered: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// IP授权交易的订单信息
export class IPOrder extends $tea.Model {
  // 订单ID
  ipOrderId: string;
  // 卖方
  sellerId: string;
  // 卖家名称
  sellerName: string;
  // 买方
  buyerId: string;
  // 买家名称
  buyerName: string;
  // 订单交易类型：0套餐交易，1授权交易
  type: number;
  // ip id
  ipId: string;
  // IP名称
  ipName: string;
  // 渠道信息
  channelId: string;
  // 套餐总量
  totalAmount: number;
  // 套餐已使用数量
  usedAmount: number;
  // 终端商品价格范围
  priceRange: string;
  // 套餐交易总费用
  totalPrice: string;
  // 授权佣金比例
  authRate: string;
  // 授权合作开始时间（毫秒时间戳）
  authStartTime: number;
  // 授权合作结束时间
  authEndTime: number;
  // 合同信息
  contract: string;
  // 设计稿信息
  designDraft: string;
  // 操作人
  operator: string;
  // 操作者名称
  operatorName: string;
  // 订单状态。TODO 补充枚举信息
  status: number;
  // 订单创建时间，时间戳（毫秒）
  createTime: number;
  // 订单最近更新时间
  updateTime: number;
  // 收费模式：0 销售抽佣, 1 按量付费
  chargeType: number;
  // 按量付费的收费单价（按量付费模式必填）
  authPrice: string;
  // 是否有保底金
  guaranteed: boolean;
  // 保底金金额
  guaranteedFund: string;
  // 保底商品个数（按量付费）
  guaranteedGoodsAmount: number;
  // 已使用的保底商品个数（按量付费），订单销售数量超过保底部分需按量付费
  usedGuaranteedGoodsAmount: number;
  // 保底商品销售金额（销售抽佣）
  guaranteedSales: string;
  // 已使用的保底商品销售金额（销售抽佣），订单销售额超过保底部分需按比例抽拥
  // 
  usedGuaranteedSales: string;
  // 授权产品范围
  authProductScope: string;
  // 授权地域范围
  authAreaScope: string;
  // 商品销售渠道
  salesChannel: string;
  // 0 IP交易，1 增值服务交易
  goodsType: number;
  // 增值服务交易绑定的ip授权交易订单
  relatedOrderId: string;
  // 是否已监修报审
  superviseApprove: boolean;
  // 订单图库信息，未确认则为空
  ipGalleryUrl?: string;
  // 图库版本
  ipGalleryVersion?: number;
  // 商家是否已下载过本订单的图库
  downloadIpGallery?: boolean;
  static names(): { [key: string]: string } {
    return {
      ipOrderId: 'ip_order_id',
      sellerId: 'seller_id',
      sellerName: 'seller_name',
      buyerId: 'buyer_id',
      buyerName: 'buyer_name',
      type: 'type',
      ipId: 'ip_id',
      ipName: 'ip_name',
      channelId: 'channel_id',
      totalAmount: 'total_amount',
      usedAmount: 'used_amount',
      priceRange: 'price_range',
      totalPrice: 'total_price',
      authRate: 'auth_rate',
      authStartTime: 'auth_start_time',
      authEndTime: 'auth_end_time',
      contract: 'contract',
      designDraft: 'design_draft',
      operator: 'operator',
      operatorName: 'operator_name',
      status: 'status',
      createTime: 'create_time',
      updateTime: 'update_time',
      chargeType: 'charge_type',
      authPrice: 'auth_price',
      guaranteed: 'guaranteed',
      guaranteedFund: 'guaranteed_fund',
      guaranteedGoodsAmount: 'guaranteed_goods_amount',
      usedGuaranteedGoodsAmount: 'used_guaranteed_goods_amount',
      guaranteedSales: 'guaranteed_sales',
      usedGuaranteedSales: 'used_guaranteed_sales',
      authProductScope: 'auth_product_scope',
      authAreaScope: 'auth_area_scope',
      salesChannel: 'sales_channel',
      goodsType: 'goods_type',
      relatedOrderId: 'related_order_id',
      superviseApprove: 'supervise_approve',
      ipGalleryUrl: 'ip_gallery_url',
      ipGalleryVersion: 'ip_gallery_version',
      downloadIpGallery: 'download_ip_gallery',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ipOrderId: 'string',
      sellerId: 'string',
      sellerName: 'string',
      buyerId: 'string',
      buyerName: 'string',
      type: 'number',
      ipId: 'string',
      ipName: 'string',
      channelId: 'string',
      totalAmount: 'number',
      usedAmount: 'number',
      priceRange: 'string',
      totalPrice: 'string',
      authRate: 'string',
      authStartTime: 'number',
      authEndTime: 'number',
      contract: 'string',
      designDraft: 'string',
      operator: 'string',
      operatorName: 'string',
      status: 'number',
      createTime: 'number',
      updateTime: 'number',
      chargeType: 'number',
      authPrice: 'string',
      guaranteed: 'boolean',
      guaranteedFund: 'string',
      guaranteedGoodsAmount: 'number',
      usedGuaranteedGoodsAmount: 'number',
      guaranteedSales: 'string',
      usedGuaranteedSales: 'string',
      authProductScope: 'string',
      authAreaScope: 'string',
      salesChannel: 'string',
      goodsType: 'number',
      relatedOrderId: 'string',
      superviseApprove: 'boolean',
      ipGalleryUrl: 'string',
      ipGalleryVersion: 'number',
      downloadIpGallery: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商品授权信息（一客一价信息）
export class EquityAuthInfo extends $tea.Model {
  // 链ID
  chainId: string;
  // 商品ID
  equityId: string;
  // 授权租户
  openToTenantId: string;
  // 租户价格（自定义价格）
  tenantPrice: string;
  // 区块高度
  blockNumber: string;
  // 交易hash
  txHash: string;
  // 区块时间戳
  blockTime: number;
  static names(): { [key: string]: string } {
    return {
      chainId: 'chain_id',
      equityId: 'equity_id',
      openToTenantId: 'open_to_tenant_id',
      tenantPrice: 'tenant_price',
      blockNumber: 'block_number',
      txHash: 'tx_hash',
      blockTime: 'block_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      chainId: 'string',
      equityId: 'string',
      openToTenantId: 'string',
      tenantPrice: 'string',
      blockNumber: 'string',
      txHash: 'string',
      blockTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 电子券详细信息
export class Coupon extends $tea.Model {
  // 绑定时间戳（毫秒）
  bindTime: number;
  // 绑定电子券的哈希
  bindTxHash: string;
  // 电子券理论上应处于的状态（比如电子券已过期）
  calStatus: number;
  // 激活时间戳（毫秒）
  chargeTime: number;
  // 激活码
  couponCode: string;
  // 激活码附加信息
  couponExtCode: string;
  // 电子券ID
  couponId: string;
  // 电子券名称
  couponName: string;
  // 创建时间戳（毫秒）
  createTime: number;
  // 创建电子券的哈希
  createTxHash: string;
  // 脱敏用户ID
  desensitizedUid: string;
  // 扩展信息
  extInfo: string;
  // 最后一次操作时间戳（毫秒）
  lastTime: number;
  // 最后一次操作的交易哈希
  lastTxHash: string;
  // 电子券公钥。椭圆曲线密码学 Secp256k1曲线的公钥，长度64字节，十六进制128位。
  publicKey: string;
  // 调子券信息查询次数
  queryCount: number;
  // 最后一次查询时间戳（毫秒）
  queryTime: number;
  // 最近一次查询的交易哈希
  queryTxHash: string;
  // 风控状态：0 启用，1 禁用
  riskStatus: number;
  // 电子券状态：
  status: number;
  // 用户公钥
  uidPublicKey: string;
  // 有效开始时间（毫秒时间戳）
  validAfter: number;
  // 有效结束时间（毫秒时间戳）
  validBefore: number;
  // 价值
  value: string;
  // 电子券版本
  version: number;
  // 电子券激活交易哈希
  chargeTxHash: string;
  // 记名电子券持有者账户
  holderUserAccount: string;
  static names(): { [key: string]: string } {
    return {
      bindTime: 'bind_time',
      bindTxHash: 'bind_tx_hash',
      calStatus: 'cal_status',
      chargeTime: 'charge_time',
      couponCode: 'coupon_code',
      couponExtCode: 'coupon_ext_code',
      couponId: 'coupon_id',
      couponName: 'coupon_name',
      createTime: 'create_time',
      createTxHash: 'create_tx_hash',
      desensitizedUid: 'desensitized_uid',
      extInfo: 'ext_info',
      lastTime: 'last_time',
      lastTxHash: 'last_tx_hash',
      publicKey: 'public_key',
      queryCount: 'query_count',
      queryTime: 'query_time',
      queryTxHash: 'query_tx_hash',
      riskStatus: 'risk_status',
      status: 'status',
      uidPublicKey: 'uid_public_key',
      validAfter: 'valid_after',
      validBefore: 'valid_before',
      value: 'value',
      version: 'version',
      chargeTxHash: 'charge_tx_hash',
      holderUserAccount: 'holder_user_account',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bindTime: 'number',
      bindTxHash: 'string',
      calStatus: 'number',
      chargeTime: 'number',
      couponCode: 'string',
      couponExtCode: 'string',
      couponId: 'string',
      couponName: 'string',
      createTime: 'number',
      createTxHash: 'string',
      desensitizedUid: 'string',
      extInfo: 'string',
      lastTime: 'number',
      lastTxHash: 'string',
      publicKey: 'string',
      queryCount: 'number',
      queryTime: 'number',
      queryTxHash: 'string',
      riskStatus: 'number',
      status: 'number',
      uidPublicKey: 'string',
      validAfter: 'number',
      validBefore: 'number',
      value: 'string',
      version: 'number',
      chargeTxHash: 'string',
      holderUserAccount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// IP授权订单的销售数据
export class IPSalesInfo extends $tea.Model {
  // 终端商品名称
  goodsName: string;
  // 终端商品图片
  goodsImage: string;
  // 终端销售渠道
  salesChannel: string;
  // 终端商品链接
  goodsUrl: string;
  // 零售价
  price: string;
  // 商品销售数量
  amount: number;
  // 销售金额
  sales: string;
  // 实付金额（授权交易）
  payment: string;
  // 统计周期开始时间（毫秒时间戳）
  settlementBeginTime: number;
  // 统计周期结束时间（毫秒时间戳）
  settlementEndTime: number;
  // 备注信息
  memo: string;
  // 数据上传操作人
  operator: string;
  // 销售数据上传操作时间（毫秒时间戳）
  operateTime: number;
  // 商品信息
  goodsInfo?: string;
  static names(): { [key: string]: string } {
    return {
      goodsName: 'goods_name',
      goodsImage: 'goods_image',
      salesChannel: 'sales_channel',
      goodsUrl: 'goods_url',
      price: 'price',
      amount: 'amount',
      sales: 'sales',
      payment: 'payment',
      settlementBeginTime: 'settlement_begin_time',
      settlementEndTime: 'settlement_end_time',
      memo: 'memo',
      operator: 'operator',
      operateTime: 'operate_time',
      goodsInfo: 'goods_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      goodsName: 'string',
      goodsImage: 'string',
      salesChannel: 'string',
      goodsUrl: 'string',
      price: 'string',
      amount: 'number',
      sales: 'string',
      payment: 'string',
      settlementBeginTime: 'number',
      settlementEndTime: 'number',
      memo: 'string',
      operator: 'string',
      operateTime: 'number',
      goodsInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// token信息
export class TokenData extends $tea.Model {
  // 拥有的token数量
  tokenNumber: number;
  // 来源为debit的token数量
  debitToken: number;
  // 来源为debit的token数量
  creditToken: number;
  // token发行者account
  accountId: string;
  static names(): { [key: string]: string } {
    return {
      tokenNumber: 'token_number',
      debitToken: 'debit_token',
      creditToken: 'credit_token',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tokenNumber: 'number',
      debitToken: 'number',
      creditToken: 'number',
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ip的渠道信息
export class IpChannelInfo extends $tea.Model {
  // 渠道名字
  channelName: string;
  // 授权模式 商品授权 0普通授权/1独家授权  本期只有0
  authorizationMode: number;
  // 计费模式 0:按量 1:按金额
  payMode: number;
  // ip等级 （5位数字） 对应a，0:经典IP/1:流量IP/2:设计IP
  ipLevel: number;
  // 商品状态（0:待上架，1:上架，2:下架）
  status: number;
  // 交易是否需要确认
  tradeNeedConfirm?: boolean;
  static names(): { [key: string]: string } {
    return {
      channelName: 'channel_name',
      authorizationMode: 'authorization_mode',
      payMode: 'pay_mode',
      ipLevel: 'ip_level',
      status: 'status',
      tradeNeedConfirm: 'trade_need_confirm',
    };
  }

  static types(): { [key: string]: any } {
    return {
      channelName: 'string',
      authorizationMode: 'number',
      payMode: 'number',
      ipLevel: 'number',
      status: 'number',
      tradeNeedConfirm: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 监修报审表单内容
export class SuperviseApprove extends $tea.Model {
  // 关联的订单id
  orderId: string;
  // 当前的阶段
  stage: number;
  // json组织，用于存储监修报审的具体信息
  extInfo: string;
  // 当前阶段的审批状态   0:待审批，1:审批通过 2:审批拒绝
  approvalStatus: number;
  // 审批备注
  approvalComments?: string;
  // 上链的交易hash
  txHash: string;
  // 关联的订单交易的ip id
  ipId: string;
  // 关联交易的卖家id
  sellerAccountId: string;
  // 关联交易的买家id
  buyerAccountId: string;
  // 审批额外信息
  approvalExtInfo?: string;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      stage: 'stage',
      extInfo: 'ext_info',
      approvalStatus: 'approval_status',
      approvalComments: 'approval_comments',
      txHash: 'tx_hash',
      ipId: 'ip_id',
      sellerAccountId: 'seller_account_id',
      buyerAccountId: 'buyer_account_id',
      approvalExtInfo: 'approval_ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      stage: 'number',
      extInfo: 'string',
      approvalStatus: 'number',
      approvalComments: 'string',
      txHash: 'string',
      ipId: 'string',
      sellerAccountId: 'string',
      buyerAccountId: 'string',
      approvalExtInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ip的重点信息
export class IpEmphasisInfo extends $tea.Model {
  // ip的链上id
  ipId: string;
  // ip的描述信息
  description: string;
  // ip类型
  ipType: string;
  // 受众群体（6位数字） 对应c
  audienceGroup: string;
  // 主图
  image: string;
  // 上架状态
  status: number;
  // 归属的账户id
  accountId: string;
  // 创建日期
  createTime: string;
  // ip名字
  ipName: string;
  // 商户名称
  accountName?: string;
  // 浏览量
  pv?: number;
  // 最近一次上下架时间
  lastStateChangeTime?: number;
  // ip的创建渠道，按照查询参数返回
  createrChannel?: string;
  static names(): { [key: string]: string } {
    return {
      ipId: 'ip_id',
      description: 'description',
      ipType: 'ip_type',
      audienceGroup: 'audience_group',
      image: 'image',
      status: 'status',
      accountId: 'account_id',
      createTime: 'create_time',
      ipName: 'ip_name',
      accountName: 'account_name',
      pv: 'pv',
      lastStateChangeTime: 'last_state_change_time',
      createrChannel: 'creater_channel',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ipId: 'string',
      description: 'string',
      ipType: 'string',
      audienceGroup: 'string',
      image: 'string',
      status: 'number',
      accountId: 'string',
      createTime: 'string',
      ipName: 'string',
      accountName: 'string',
      pv: 'number',
      lastStateChangeTime: 'number',
      createrChannel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 消费卡的单条交易记录数据
export class BlockInstruction extends $tea.Model {
  // 商品兑换单/订单编号
  orderId: string;
  // 交易类型
  instructionType: number;
  // 买家的链上账户Id
  buyerAccountId: string;
  // 卖家的链上账户Id
  sellerAccountId: string;
  // 平台机构ID
  platformId: string;
  // 商品ID
  goodsId: string;
  // 商品名称
  displayName: string;
  // 实际售价(元)
  sellerPrice: string;
  // 商品面值(元)
  displayPrice: string;
  // 备注信息
  memo: string;
  // 附言
  remark: string;
  // 兑换单状态
  status: number;
  // 退款状态
  refundStatus: number;
  // 交易创建时间
  createTimestamp: number;
  // 支付时间
  payTimestamp: number;
  // 交易附属信息
  extraData: MetaDataDO[];
  // 交易token来源信息
  tokenInstructions: TokenInstructionDO[];
  // 关联交易ID
  relatedOrderId: string;
  // 手续费token数量
  commissionToken: string;
  // 卖家收到的token数量
  sellerReceiveToken: string;
  // 支付类型：买家支付，卖家支付
  payCommissionType: number;
  // 买家手机号
  buyerPhone: string;
  // 买家名称
  buyerName: string;
  // 买家身份信息
  buyerIdNumber: string;
  // 买家身份信息类型
  buyerIdType: string;
  // 买家IP
  buyeIp: string;
  // 订单原始创建时间，外部传入
  originCreateTime: number;
  // 订单原始订单ID，外部传入
  originOrderId: string;
  static names(): { [key: string]: string } {
    return {
      orderId: 'order_id',
      instructionType: 'instruction_type',
      buyerAccountId: 'buyer_account_id',
      sellerAccountId: 'seller_account_id',
      platformId: 'platform_id',
      goodsId: 'goods_id',
      displayName: 'display_name',
      sellerPrice: 'seller_price',
      displayPrice: 'display_price',
      memo: 'memo',
      remark: 'remark',
      status: 'status',
      refundStatus: 'refund_status',
      createTimestamp: 'create_timestamp',
      payTimestamp: 'pay_timestamp',
      extraData: 'extra_data',
      tokenInstructions: 'token_instructions',
      relatedOrderId: 'related_order_id',
      commissionToken: 'commission_token',
      sellerReceiveToken: 'seller_receive_token',
      payCommissionType: 'pay_commission_type',
      buyerPhone: 'buyer_phone',
      buyerName: 'buyer_name',
      buyerIdNumber: 'buyer_id_number',
      buyerIdType: 'buyer_id_type',
      buyeIp: 'buye_ip',
      originCreateTime: 'origin_create_time',
      originOrderId: 'origin_order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderId: 'string',
      instructionType: 'number',
      buyerAccountId: 'string',
      sellerAccountId: 'string',
      platformId: 'string',
      goodsId: 'string',
      displayName: 'string',
      sellerPrice: 'string',
      displayPrice: 'string',
      memo: 'string',
      remark: 'string',
      status: 'number',
      refundStatus: 'number',
      createTimestamp: 'number',
      payTimestamp: 'number',
      extraData: { 'type': 'array', 'itemType': MetaDataDO },
      tokenInstructions: { 'type': 'array', 'itemType': TokenInstructionDO },
      relatedOrderId: 'string',
      commissionToken: 'string',
      sellerReceiveToken: 'string',
      payCommissionType: 'number',
      buyerPhone: 'string',
      buyerName: 'string',
      buyerIdNumber: 'string',
      buyerIdType: 'string',
      buyeIp: 'string',
      originCreateTime: 'number',
      originOrderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 接口白名单信息
export class APIWhiteListInfo extends $tea.Model {
  // 租户ID
  tenantId: string;
  // 链ID
  chainId: string;
  // 权限级别，暂时不用
  level: number;
  // 更新时间
  updateTime: string;
  // 扩展字段
  extension: string;
  static names(): { [key: string]: string } {
    return {
      tenantId: 'tenant_id',
      chainId: 'chain_id',
      level: 'level',
      updateTime: 'update_time',
      extension: 'extension',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tenantId: 'string',
      chainId: 'string',
      level: 'number',
      updateTime: 'string',
      extension: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 权益流水
export class EInstruction extends $tea.Model {
  // 资产ID
  assetId: string;
  // 资产的汇率
  assetRate: string;
  // 资产扣减数量(单位:个)
  deductAssetAmount: string;
  // 扣减商户备付金授信额(单位:元)
  deductCreditAmount: string;
  // 扣减商户备付金余额(单位:元)
  deductDebitAmount: string;
  // 被扣减备付金的租户ID
  deductTenantId: string;
  // 权益ID
  equityId: string;
  // 权益名称
  equityName: string;
  // 权益对用户价格(单位:元)
  equityPrice: string;
  // 权益面值(单位:元)
  equityValue: string;
  // 附言Deliver/Complete/OutOfStore/WriteOff)
  memo: string;
  // 发起操作的租户ID
  optTenantId: string;
  // 业务交易ID
  outTxId: string;
  // 对换单流水状态：
  // 0        // 权益兑换单创建
  // 1        // 权益兑换单接单
  // 2        // 权益兑换单发货
  // 3        // 权益兑换单确认收货
  // 4        // 权益兑换单缺货
  // 5        // 权益兑换单核销
  status: number;
  // 权益归属租户ID
  tenantId: string;
  // 交易时间戳
  timeStamp: number;
  // 兑换类型(商户身份/用户身份)
  type: number;
  // 用户身份兑换/商户兑换的受益用户
  userId: string;
  // 版本（之前版本为0，不收取手续费，之后版本为1，收取手续费）
  instructionVersion: number;
  // 收取手续费的金融云租户ID
  commissionTenantId: string;
  // 手续费(单位:元)
  instructionCommission: string;
  // 手续费扣减商户备付金余额(单位:元)
  deductDebitCommission: string;
  // 手续费扣减商户备付金授信额(单位:元)
  deductCreditCommission: string;
  // 资产手续费扣减数量(单位:个)
  deductAssetCommission: string;
  // 手续费率
  commissionRate: string;
  // 手续费id
  commissionId: string;
  // 手续费子id
  commissionSubId: string;
  // 手续费状态（0:未提现，1:已提现）
  commissionStatus: number;
  // 是否收取手续费
  commissionCharged: number;
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
      instructionVersion: 'instruction_version',
      commissionTenantId: 'commission_tenant_id',
      instructionCommission: 'instruction_commission',
      deductDebitCommission: 'deduct_debit_commission',
      deductCreditCommission: 'deduct_credit_commission',
      deductAssetCommission: 'deduct_asset_commission',
      commissionRate: 'commission_rate',
      commissionId: 'commission_id',
      commissionSubId: 'commission_sub_id',
      commissionStatus: 'commission_status',
      commissionCharged: 'commission_charged',
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
      instructionVersion: 'number',
      commissionTenantId: 'string',
      instructionCommission: 'string',
      deductDebitCommission: 'string',
      deductCreditCommission: 'string',
      deductAssetCommission: 'string',
      commissionRate: 'string',
      commissionId: 'string',
      commissionSubId: 'string',
      commissionStatus: 'number',
      commissionCharged: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ip的基础信息加上渠道信息
export class IpBasicInfoWithChannelInfo extends $tea.Model {
  // ip的基础信息
  ipBasicInfo: IpBasicInfo;
  // ip的渠道信息和sku信息
  ipChannalInfos: IpChannelWithSku[];
  static names(): { [key: string]: string } {
    return {
      ipBasicInfo: 'ip_basic_info',
      ipChannalInfos: 'ip_channal_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ipBasicInfo: IpBasicInfo,
      ipChannalInfos: { 'type': 'array', 'itemType': IpChannelWithSku },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// ip的所有信息，加上更新的flag信息
export class IpAllInfo extends $tea.Model {
  // ip的基础信息
  ipBasicInfo: IpBasicInfo;
  // ip的渠道信息带上sku信息
  ipChannalInfo: IpChannelWithSku[];
  // 是否有更新数据
  isUpdate: boolean;
  static names(): { [key: string]: string } {
    return {
      ipBasicInfo: 'ip_basic_info',
      ipChannalInfo: 'ip_channal_info',
      isUpdate: 'is_update',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ipBasicInfo: IpBasicInfo,
      ipChannalInfo: { 'type': 'array', 'itemType': IpChannelWithSku },
      isUpdate: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 权益
export class Equity extends $tea.Model {
  // 权益管理员ID
  adminId: string;
  // 权益授权类型
  authType: number;
  // 权益锚定币种
  currency: string;
  // 权益默认价格
  defaultPrice: string;
  // 权益描述
  description: string;
  // 权益描述图片OSS地址 分号分隔
  descImages: string;
  // 权益附属信息
  equityExtInfo: EquityExtInfo;
  // 权益ID
  equityId: string;
  // 权益名称
  equityName: string;
  // 商品类型，详见数字商品公约https://tech.antfin.com/docs/2/163896
  equityType: string;
  // 权益主图片OSS地址 分号;分隔
  images: string;
  // 是否为公开权益
  isPublic: boolean;
  // 商户每日兑换上限
  limitPerMerchantAndDay: number;
  // 商户每月兑换上限
  limitPerMerchantAndMonth: number;
  // 用户每日兑换上限
  limitPerUserAndDay: number;
  // 用户每月兑换上限
  limitPerUserAndMonth: number;
  // 附言
  memo: string;
  // 权益状态
  status: number;
  // 租户ID
  tenantId: string;
  // 权益库存
  totalCount: string;
  // 权益使用有效期右闭区间
  useValidNotAfter: number;
  // 权益使用有效期左闭区间
  useValidNotBefore: number;
  // 权益兑换有效期右闭区间
  validNotAfter: number;
  // 权益兑换有效期左闭区间
  validNotBefore: number;
  // 权益面值
  value: string;
  // 是否计算手续费（0: 更新手续费版本前不在合约计算手续费，1: 在合约计算手续费）
  commissionAccepted: number;
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
      commissionAccepted: 'commission_accepted',
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
      commissionAccepted: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 消费卡账户
export class ConsumeCardAccount extends $tea.Model {
  // 授权函地址
  authorizationAddress: string;
  // 认证方id
  certificationId: string;
  // 描述
  description: string;
  // 分布式身份ID
  did: string;
  // 是否有权限采购商品
  authConsumer: boolean;
  // 是否有权限发行商品
  authProvider: boolean;
  // 个人用户的身份证号码/机构的企业编号
  idNumber: string;
  // 证件类型：0 身份证, 1 护照, 2 军官证, 3 回乡证, 4 港澳证件, 5 营业执照, 6 港澳居民来往内地通行证, 7 台湾居民来往内地通行证, 8 港澳居民居住证, 9 台湾居民居住证, 10事业单位登记证书, 11 社会团体登记证书, 12 民办非企业单位证书, 13 党政机关批准设计文件, 14 全国组织机构代码证书, 15 其他证件
  idType: number;
  // 个人用户的手机号码/机构用户的联系电话或邮箱(必填)
  phoneNumber: string;
  // 商户状态
  status: number;
  // 是否可以发行资产
  tokenIssuer: boolean;
  // 账户创建类型（0:用户，1:商户）
  type: number;
  // 账户ID
  userId: string;
  // 账户名称
  userName: string;
  // 提现银行卡
  withdrawBankCardId: string;
  // 账户影响信息
  image: string;
  // 账户邮箱
  email: string;
  static names(): { [key: string]: string } {
    return {
      authorizationAddress: 'authorization_address',
      certificationId: 'certification_id',
      description: 'description',
      did: 'did',
      authConsumer: 'auth_consumer',
      authProvider: 'auth_provider',
      idNumber: 'id_number',
      idType: 'id_type',
      phoneNumber: 'phone_number',
      status: 'status',
      tokenIssuer: 'token_issuer',
      type: 'type',
      userId: 'user_id',
      userName: 'user_name',
      withdrawBankCardId: 'withdraw_bank_card_id',
      image: 'image',
      email: 'email',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authorizationAddress: 'string',
      certificationId: 'string',
      description: 'string',
      did: 'string',
      authConsumer: 'boolean',
      authProvider: 'boolean',
      idNumber: 'string',
      idType: 'number',
      phoneNumber: 'string',
      status: 'number',
      tokenIssuer: 'boolean',
      type: 'number',
      userId: 'string',
      userName: 'string',
      withdrawBankCardId: 'string',
      image: 'string',
      email: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 创建电子券的参数
export class CouponCreate extends $tea.Model {
  // 电子券批次ID
  collectionId: string;
  // 电子券价值
  value: string;
  // 电子券名称
  couponName: string;
  // 用户脱敏ID
  desensitizedUid?: string;
  // 扩展信息
  extInfo: string;
  // 持有者ID
  holderUserAccount?: string;
  // 电子券公钥
  publicKey: string;
  // 时区（暂时固定为GMT+8）
  timeZone: string;
  // 用户公钥
  uidPublicKey?: string;
  // 有效开始时间
  validAfter: number;
  // 有效结束时间
  validBefore: number;
  static names(): { [key: string]: string } {
    return {
      collectionId: 'collection_id',
      value: 'value',
      couponName: 'coupon_name',
      desensitizedUid: 'desensitized_uid',
      extInfo: 'ext_info',
      holderUserAccount: 'holder_user_account',
      publicKey: 'public_key',
      timeZone: 'time_zone',
      uidPublicKey: 'uid_public_key',
      validAfter: 'valid_after',
      validBefore: 'valid_before',
    };
  }

  static types(): { [key: string]: any } {
    return {
      collectionId: 'string',
      value: 'string',
      couponName: 'string',
      desensitizedUid: 'string',
      extInfo: 'string',
      holderUserAccount: 'string',
      publicKey: 'string',
      timeZone: 'string',
      uidPublicKey: 'string',
      validAfter: 'number',
      validBefore: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 资产
export class Asset extends $tea.Model {
  // 资产管理员ID
  adminId: string;
  // 资产附属信息
  assetExtInfo: AssetExtInfo;
  // 资产ID
  assetId: string;
  // 资产名称
  assetName: string;
  // 资产汇率
  assetRate: string;
  // 币种
  currency: string;
  // 发行账户余额
  issueAccountBalance: string;
  // 过期回收账户余额
  overdueRecoveryAccountBalance: string;
  // 支付收款账户余额
  receivePaymentAccountBalance: string;
  // 中继账户余额
  relayAccountBalance: string;
  // 资产状态
  status: number;
  // 租户ID
  tenantId: string;
  // 资产总发行量
  totalIssueBalance: string;
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

// 已授权给商户的权益信息
export class OpenedEquity extends $tea.Model {
  // 商户管理员ID
  adminId: string;
  // 授权类型
  authType: string;
  // 币种
  currency: string;
  // 默认价格
  defaultPrice: string;
  // 权益详情
  description: string;
  // 权益详情图片
  descImages: string;
  // 权益ID
  equityD: string;
  // 权益名称
  equityName: string;
  // 权益类型
  equityType: number;
  // 权益主图片
  images: string;
  // 是否是公开权益
  isPublic: boolean;
  // 每日商户对换限制
  limitPerMerchantAndDay: number;
  // 每月商户对换限制
  limitPerMerchantAndMonth: number;
  // 每日用户对换限制
  limitPerUserAndDay: number;
  // 每月用户对换限制
  limitPerUserAndMonth: number;
  // 权益附言
  memo: string;
  // 被授权的租户ID
  openToTenantId: string;
  // 权益状态
  status: number;
  // 租户ID
  tenantId: string;
  // 授权价格
  tenantPrice: string;
  // 库存
  totalCount: string;
  // 可用右区间
  useValidNotAfter: number;
  // 可用左区间
  useValidNotBefore: number;
  // 有效右区间
  validNotAfter: number;
  // 有效左时间
  validNotBefore: number;
  // 价值
  value: string;
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

// 代理授权关系信息
export class DelegateRelationInfo extends $tea.Model {
  // 被授权的租户ID
  tenantId: string;
  // 被代理的租户ID
  delegatedTenantId: string;
  // 更新时间
  updateTime: string;
  // 状态
  status: boolean;
  // 扩展字段
  extension: string;
  static names(): { [key: string]: string } {
    return {
      tenantId: 'tenant_id',
      delegatedTenantId: 'delegated_tenant_id',
      updateTime: 'update_time',
      status: 'status',
      extension: 'extension',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tenantId: 'string',
      delegatedTenantId: 'string',
      updateTime: 'string',
      status: 'boolean',
      extension: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 版权方申请
export class IPApplyInfo extends $tea.Model {
  // 账户Id
  accountId: string;
  // 用户名
  loginName: string;
  // 支付宝账户
  alipayLoginName: string;
  // 联系人
  legalName: string;
  // 联系方式
  phoneNumber: string;
  // 角色(1: 版权方 2:商家)
  role: number;
  // 状态
  status: number;
  // 用户的外系统识别Id
  externalUserId: string;
  // 外部系统用户名
  externalUserName: string;
  // 申请时间(毫秒时间戳)
  applyDate: number;
  static names(): { [key: string]: string } {
    return {
      accountId: 'account_id',
      loginName: 'login_name',
      alipayLoginName: 'alipay_login_name',
      legalName: 'legal_name',
      phoneNumber: 'phone_number',
      role: 'role',
      status: 'status',
      externalUserId: 'external_user_id',
      externalUserName: 'external_user_name',
      applyDate: 'apply_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accountId: 'string',
      loginName: 'string',
      alipayLoginName: 'string',
      legalName: 'string',
      phoneNumber: 'string',
      role: 'number',
      status: 'number',
      externalUserId: 'string',
      externalUserName: 'string',
      applyDate: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商户积分库和与预算库信息
export class MerchantBudget extends $tea.Model {
  // 积分库代码
  pointLibCode: string;
  // 预算库代码
  budgetCode: string;
  // 预算库描述
  budgetDesc: string;
  // 预算库启用时间
  budgetStartTime: string;
  // 预算库截止时间
  budgetEndTime: string;
  static names(): { [key: string]: string } {
    return {
      pointLibCode: 'point_lib_code',
      budgetCode: 'budget_code',
      budgetDesc: 'budget_desc',
      budgetStartTime: 'budget_start_time',
      budgetEndTime: 'budget_end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      pointLibCode: 'string',
      budgetCode: 'string',
      budgetDesc: 'string',
      budgetStartTime: 'string',
      budgetEndTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 统计数据
export class CounterData extends $tea.Model {
  // 成交总额
  gmv: string;
  // 公认标准收入
  gaap: string;
  // 笔数
  counter: string;
  static names(): { [key: string]: string } {
    return {
      gmv: 'gmv',
      gaap: 'gaap',
      counter: 'counter',
    };
  }

  static types(): { [key: string]: any } {
    return {
      gmv: 'string',
      gaap: 'string',
      counter: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 消费卡商品信息
export class GoodsResponse extends $tea.Model {
  // 商品归属的账户ID
  accountId: string;
  // 商品名称
  goodsName: string;
  // 商品类型
  goodsType: string;
  // 商品描述信息
  description: string;
  // 商品库存
  totalCount: number;
  // 显示价格
  displayPrice: string;
  // 默认价格
  defaultPrice: string;
  // 是否公开商品
  ifPublic: boolean;
  // 商品主图片URL
  images: string;
  // 商品描述图片，每个图片URL用:隔开
  descImages: string;
  // 商品状态 0可用，1下线
  status: number;
  // 商品开始时间
  validNotBefore: number;
  // 商品结束时间
  validNotAfter: number;
  // 商品每日上限
  limitPerUserAndDay: number;
  // 商品每月上限
  limitPerUserAndMonth: number;
  // 商品备注信息
  memo: string;
  // 授权类型
  authType: number;
  // 商品类型
  categoryId: string;
  // 商品ID
  goodsId: string;
  static names(): { [key: string]: string } {
    return {
      accountId: 'account_id',
      goodsName: 'goods_name',
      goodsType: 'goods_type',
      description: 'description',
      totalCount: 'total_count',
      displayPrice: 'display_price',
      defaultPrice: 'default_price',
      ifPublic: 'if_public',
      images: 'images',
      descImages: 'desc_images',
      status: 'status',
      validNotBefore: 'valid_not_before',
      validNotAfter: 'valid_not_after',
      limitPerUserAndDay: 'limit_per_user_and_day',
      limitPerUserAndMonth: 'limit_per_user_and_month',
      memo: 'memo',
      authType: 'auth_type',
      categoryId: 'category_id',
      goodsId: 'goods_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      accountId: 'string',
      goodsName: 'string',
      goodsType: 'string',
      description: 'string',
      totalCount: 'number',
      displayPrice: 'string',
      defaultPrice: 'string',
      ifPublic: 'boolean',
      images: 'string',
      descImages: 'string',
      status: 'number',
      validNotBefore: 'number',
      validNotAfter: 'number',
      limitPerUserAndDay: 'number',
      limitPerUserAndMonth: 'number',
      memo: 'string',
      authType: 'number',
      categoryId: 'string',
      goodsId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 租户场景码信息
export class ProductCodeInfo extends $tea.Model {
  // 链ID
  chainId: string;
  // 租户ID
  tenantId: string;
  // 场景码
  productCode: string;
  // 租户映射链上账户名称
  accountName?: string;
  // 租户映射账户链上账户ID
  accountId?: string;
  // 备注信息
  memo?: string;
  static names(): { [key: string]: string } {
    return {
      chainId: 'chain_id',
      tenantId: 'tenant_id',
      productCode: 'product_code',
      accountName: 'account_name',
      accountId: 'account_id',
      memo: 'memo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      chainId: 'string',
      tenantId: 'string',
      productCode: 'string',
      accountName: 'string',
      accountId: 'string',
      memo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 钱包信息
export class WalletInfo extends $tea.Model {
  // 授信钱包信息
  creditWallet: CreditWallet;
  // 余额钱包信息
  debitWallet: DebitWallet;
  // 钱包统计信息
  statisticalInfo: StatisticalInfo;
  static names(): { [key: string]: string } {
    return {
      creditWallet: 'credit_wallet',
      debitWallet: 'debit_wallet',
      statisticalInfo: 'statistical_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      creditWallet: CreditWallet,
      debitWallet: DebitWallet,
      statisticalInfo: StatisticalInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 商户
export class Merchant extends $tea.Model {
  // 商户管理员ID
  adminId: string;
  // 商户描述
  description: string;
  // 商户分布式身份ID
  did: string;
  // 资金管理员ID
  fundManagerId: string;
  // 是否可以发行资产
  isAssetIssuer: boolean;
  // 是否可以采购权益
  isEquityConsumer: boolean;
  // 是否可以发行权益
  isEquityProvider: boolean;
  // 备付金数据
  provision: Provision;
  // 商户状态: 0可用, 1下线, 2冻结
  status: number;
  // 租户ID
  tenantId: string;
  // 商户的损益账户
  profitLossBalance: string;
  static names(): { [key: string]: string } {
    return {
      adminId: 'admin_id',
      description: 'description',
      did: 'did',
      fundManagerId: 'fund_manager_id',
      isAssetIssuer: 'is_asset_issuer',
      isEquityConsumer: 'is_equity_consumer',
      isEquityProvider: 'is_equity_provider',
      provision: 'provision',
      status: 'status',
      tenantId: 'tenant_id',
      profitLossBalance: 'profit_loss_balance',
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
      provision: Provision,
      status: 'number',
      tenantId: 'string',
      profitLossBalance: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 正版码被扫描或领取的信息
export class IPCodeScannedInfo extends $tea.Model {
  // 正版码ID
  ipCode: string;
  // 用户的ID
  userId: string;
  // 用户的名称
  userName: string;
  // 用户头像地址
  avatar: string;
  // 用户的手机号
  phoneNumber?: string;
  // 用户的位置信息
  gps?: string;
  // 处理时间(毫秒时间戳)
  timestamp: number;
  // IP ID
  ipId: string;
  // 订单ID
  orderId: string;
  // 正版码商品信息配置列表
  goodsInfoList?: IPCodeGoodsInfo[];
  // 正版码资源位配置信息列表
  adInfoList?: IPCodeAdvertisingInfo[];
  static names(): { [key: string]: string } {
    return {
      ipCode: 'ip_code',
      userId: 'user_id',
      userName: 'user_name',
      avatar: 'avatar',
      phoneNumber: 'phone_number',
      gps: 'gps',
      timestamp: 'timestamp',
      ipId: 'ip_id',
      orderId: 'order_id',
      goodsInfoList: 'goods_info_list',
      adInfoList: 'ad_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      ipCode: 'string',
      userId: 'string',
      userName: 'string',
      avatar: 'string',
      phoneNumber: 'string',
      gps: 'string',
      timestamp: 'number',
      ipId: 'string',
      orderId: 'string',
      goodsInfoList: { 'type': 'array', 'itemType': IPCodeGoodsInfo },
      adInfoList: { 'type': 'array', 'itemType': IPCodeAdvertisingInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户
export class User extends $tea.Model {
  // 用户分布式身份ID
  did: string;
  // 用户的链外身份ID
  localId: string;
  // 用户公钥
  pk: string;
  // 租户ID
  tenantId: string;
  // 用户ID
  userId: string;
  // 用户VC
  vc: string;
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

export class ExecCardCreateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 交易信息
  tx: Transaction;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      tx: 'tx',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      tx: Transaction,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecCardCreateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class ExecCardQueryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 交易信息
  tx: Transaction;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      tx: 'tx',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      tx: Transaction,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecCardQueryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class ExecCardBindnameRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 交易内容
  tx: Transaction;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      tx: 'tx',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      tx: Transaction,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecCardBindnameResponse extends $tea.Model {
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

export class ExecCardChargeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 交易信息
  tx: Transaction;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      tx: 'tx',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      tx: Transaction,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecCardChargeResponse extends $tea.Model {
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

export class ExecCardWriteoffRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 交易信息
  tx: Transaction;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      tx: 'tx',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      tx: Transaction,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecCardWriteoffResponse extends $tea.Model {
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

export class ExecCardExpiredRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 交易信息
  tx: Transaction;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      tx: 'tx',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      tx: Transaction,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecCardExpiredResponse extends $tea.Model {
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

export class ExecCardForbiddenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 交易信息
  tx: Transaction;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      tx: 'tx',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      tx: Transaction,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecCardForbiddenResponse extends $tea.Model {
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

export class ExecCardChargeresetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 交易信息
  tx: Transaction;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      tx: 'tx',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      tx: Transaction,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecCardChargeresetResponse extends $tea.Model {
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

export class CreateConsumecardAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权函地址
  authorizationAddress?: string;
  // 是否有采购/消费权限
  authConsumer: boolean;
  // 是否有供应权限
  authProvider: boolean;
  // 业务系统幂等Id,防止同一笔交易重复发送(接入方传入)
  bizId: string;
  // 认证方id(如: 支付宝的用户Id)
  certificationId: string;
  // 支持多链多合约,该参数为指明需要操作哪个智能合约环境
  chainId: string;
  // 手机号国家编码
  countryCode: string;
  // 账户描述
  description?: string;
  // 个人用户的身份证号码/机构的企业编号
  idNumber: string;
  // 证件类型：0 身份证, 1 护照, 2 军官证, 3 回乡证, 4 港澳证件, 5 营业执照, 6 港澳居民来往内地通行证, 7 台湾居民来往内地通行证, 8 港澳居民居住证, 9 台湾居民居住证, 10事业单位登记证书, 11 社会团体登记证书, 12 民办非企业单位证书, 13 党政机关批准设计文件, 14 全国组织机构代码证书, 15 其他证件
  idType: number;
  // 开户影像信息（BASE64格式传入）
  image: string;
  // 外部系统传入的交易备注信息(必填)
  memo: string;
  // 邮箱地址(机构注册必传)
  email?: string;
  // 个人用户的手机号码/机构用户的联系电话(必填)
  phoneNumber: string;
  // 场景码(需要申请)
  productCode: string;
  // 平台归属机构的链上账户Id(账户可以归属在一个机构下)
  relegationAccountId?: string;
  // 角色(1 机构, 2 个人)
  roleType: number;
  // 外部系统对该个人用户/机构的内部编号,用于唯一识别该用户
  userId: string;
  // 个人用户姓名/机构名称
  userName: string;
  // 提现银行卡
  withdrawBankCardId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authorizationAddress: 'authorization_address',
      authConsumer: 'auth_consumer',
      authProvider: 'auth_provider',
      bizId: 'biz_id',
      certificationId: 'certification_id',
      chainId: 'chain_id',
      countryCode: 'country_code',
      description: 'description',
      idNumber: 'id_number',
      idType: 'id_type',
      image: 'image',
      memo: 'memo',
      email: 'email',
      phoneNumber: 'phone_number',
      productCode: 'product_code',
      relegationAccountId: 'relegation_account_id',
      roleType: 'role_type',
      userId: 'user_id',
      userName: 'user_name',
      withdrawBankCardId: 'withdraw_bank_card_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authorizationAddress: 'string',
      authConsumer: 'boolean',
      authProvider: 'boolean',
      bizId: 'string',
      certificationId: 'string',
      chainId: 'string',
      countryCode: 'string',
      description: 'string',
      idNumber: 'string',
      idType: 'number',
      image: 'string',
      memo: 'string',
      email: 'string',
      phoneNumber: 'string',
      productCode: 'string',
      relegationAccountId: 'string',
      roleType: 'number',
      userId: 'string',
      userName: 'string',
      withdrawBankCardId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateConsumecardAccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户/机构的链上账户Id
  accountId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OfflineConsumecardAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 附言(长度不要超过500个字符)
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OfflineConsumecardAccountResponse extends $tea.Model {
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

export class ReclaimConsumecardWalletRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 回退金额(元)
  amount: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 角色(1 机构, 2 个人)
  roleType: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      amount: 'amount',
      baseRequest: 'base_request',
      roleType: 'role_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      amount: 'string',
      baseRequest: BaseRequest,
      roleType: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReclaimConsumecardWalletResponse extends $tea.Model {
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

export class FreezeConsumecardAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 附言(长度不要超过500个字符)
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FreezeConsumecardAccountResponse extends $tea.Model {
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

export class UnfreezeConsumecardAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 附言(长度不要超过500个字符)
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnfreezeConsumecardAccountResponse extends $tea.Model {
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

export class UpdateConsumecardRiskcontrolRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 是否加值(false为减)
  add: boolean;
  // 调整金额(元)
  amount: string;
  // 请求参数
  baseRequest: BaseRequest;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      add: 'add',
      amount: 'amount',
      baseRequest: 'base_request',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      add: 'boolean',
      amount: 'string',
      baseRequest: BaseRequest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateConsumecardRiskcontrolResponse extends $tea.Model {
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

export class QueryConsumecardBillRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 需要查询的交易单号
  orderId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryConsumecardBillResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 消费卡的单条交易记录数据
  blockInstruction?: BlockInstruction;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      blockInstruction: 'block_instruction',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      blockInstruction: BlockInstruction,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ChargeConsumecardWalletRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 充值金额(单位:元,精确到分)
  chargeAmount: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      chargeAmount: 'charge_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      chargeAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ChargeConsumecardWalletResponse extends $tea.Model {
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

export class UpdateConsumecardAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权函地址
  authorizationAddress?: string;
  // 是否有采购/消费权限
  authConsumer: boolean;
  // 是否有供应权限
  authProvider: boolean;
  // 请求参数
  baseRequest: BaseRequest;
  // 认证方id
  certificationId: string;
  // 商户描述
  description?: string;
  // 个人用户的身份证号码/机构的企业编号
  idNumber: string;
  // 证件类型：0 身份证, 1 护照, 2 军官证, 3 回乡证, 4 港澳证件, 5 营业执照, 6 港澳居民来往内地通行证, 7 台湾居民来往内地通行证, 8 港澳居民居住证, 9 台湾居民居住证, 10事业单位登记证书, 11 社会团体登记证书, 12 民办非企业单位证书, 13 党政机关批准设计文件, 14 全国组织机构代码证书, 15 其他证件
  idType: number;
  // 账户映像资料
  image: string;
  // 邮箱地址(机构注册必传)
  email?: string;
  // 个人用户的手机号码/机构用户的联系电话(必填)
  phoneNumber: string;
  // 个人用户姓名/机构名称
  userName: string;
  // 提现银行卡
  withdrawBankCardId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authorizationAddress: 'authorization_address',
      authConsumer: 'auth_consumer',
      authProvider: 'auth_provider',
      baseRequest: 'base_request',
      certificationId: 'certification_id',
      description: 'description',
      idNumber: 'id_number',
      idType: 'id_type',
      image: 'image',
      email: 'email',
      phoneNumber: 'phone_number',
      userName: 'user_name',
      withdrawBankCardId: 'withdraw_bank_card_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authorizationAddress: 'string',
      authConsumer: 'boolean',
      authProvider: 'boolean',
      baseRequest: BaseRequest,
      certificationId: 'string',
      description: 'string',
      idNumber: 'string',
      idType: 'number',
      image: 'string',
      email: 'string',
      phoneNumber: 'string',
      userName: 'string',
      withdrawBankCardId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateConsumecardAccountResponse extends $tea.Model {
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

export class CreateConsumecardBillRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 账单标价(单位:元,精确到分)
  billDisplayPrice: string;
  // 账单名称
  billName: string;
  // 账单实际支付金额(单位:元,精确到分)
  billTokenPrice: string;
  // 账单类型
  billType: string;
  // 交易发起方的链上账户Id
  buyerAccountId: string;
  // 支付方证件号
  buyerIdNumber: string;
  // 证件类型：0 身份证, 1 护照, 2 军官证, 3 回乡证, 4 港澳证件, 5 营业执照, 6 港澳居民来往内地通行证, 7 台湾居民来往内地通行证, 8 港澳居民居住证, 9 台湾居民居住证, 10事业单位登记证书, 11 社会团体登记证书, 12 民办非企业单位证书, 13 党政机关批准设计文件, 14 全国组织机构代码证书, 15 其他证件
  buyerIdType: number;
  // 支付方发起ip
  buyerIp: string;
  // 支付方姓名
  buyerName: string;
  // 支付方手机号
  buyerPhone: string;
  // 外部系统创建时间
  originCreateTime: number;
  // 外部系统订单号
  originOrderId: string;
  // 附言（不必填）
  remark?: string;
  // 交易接收方的链上账户Id
  sellerAccountId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      billDisplayPrice: 'bill_display_price',
      billName: 'bill_name',
      billTokenPrice: 'bill_token_price',
      billType: 'bill_type',
      buyerAccountId: 'buyer_account_id',
      buyerIdNumber: 'buyer_id_number',
      buyerIdType: 'buyer_id_type',
      buyerIp: 'buyer_ip',
      buyerName: 'buyer_name',
      buyerPhone: 'buyer_phone',
      originCreateTime: 'origin_create_time',
      originOrderId: 'origin_order_id',
      remark: 'remark',
      sellerAccountId: 'seller_account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      billDisplayPrice: 'string',
      billName: 'string',
      billTokenPrice: 'string',
      billType: 'string',
      buyerAccountId: 'string',
      buyerIdNumber: 'string',
      buyerIdType: 'number',
      buyerIp: 'string',
      buyerName: 'string',
      buyerPhone: 'string',
      originCreateTime: 'number',
      originOrderId: 'string',
      remark: 'string',
      sellerAccountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateConsumecardBillResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 账单ID
  orderId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmConsumecardBillcreateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 账单ID
  orderId: string;
  // 附言(不要超过500个字符)
  remark?: string;
  // 账单创建是否确认成功。true为成功，false为失败
  success: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      orderId: 'order_id',
      remark: 'remark',
      success: 'success',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      orderId: 'string',
      remark: 'string',
      success: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmConsumecardBillcreateResponse extends $tea.Model {
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

export class CancelConsumecardBillRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 账单ID(长度不要超过256个字符)
  orderId: string;
  // 附言(长度不要超过500个字符)
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      orderId: 'order_id',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      orderId: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelConsumecardBillResponse extends $tea.Model {
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

export class ExecConsumecardBillpayRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 账单ID 
  orderId: string;
  // 需要支付的金额(单位:元,精确到分)
  payPrice: string;
  // 附言(不要超过500个字符)
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      orderId: 'order_id',
      payPrice: 'pay_price',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      orderId: 'string',
      payPrice: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecConsumecardBillpayResponse extends $tea.Model {
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

export class ExecConsumecardOrderwriteoffRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 交易类型(0: 商品兑换单, 1: 账单兑换单)
  instructionType: number;
  // 账单ID
  orderId: string;
  // 附言(长度不要超过500个字符)
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      instructionType: 'instruction_type',
      orderId: 'order_id',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      instructionType: 'number',
      orderId: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecConsumecardOrderwriteoffResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 区块高度
  blockNumber?: number;
  // 交易哈希
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      blockNumber: 'block_number',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      blockNumber: 'number',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmConsumecardBillrefundRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 是否接受退款申请，true同意退款，false拒绝退款
  accept: boolean;
  // 请求参数
  baseRequest: BaseRequest;
  // 账单ID
  orderId: string;
  // 附言(不要超过500个字符)
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accept: 'accept',
      baseRequest: 'base_request',
      orderId: 'order_id',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accept: 'boolean',
      baseRequest: BaseRequest,
      orderId: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmConsumecardBillrefundResponse extends $tea.Model {
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

export class QueryConsumecardAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 附言(长度不要超过500个字符)
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryConsumecardAccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 账户信息
  account?: ConsumeCardAccount;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      account: 'account',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      account: ConsumeCardAccount,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OpenConsumecardWalletRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 操作类型(0 开通钱包)
  operateType: number;
  // 角色(1 机构, 2 个人)
  roleType: number;
  // 钱包类型（0:余额账户）
  walletType: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      operateType: 'operate_type',
      roleType: 'role_type',
      walletType: 'wallet_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      operateType: 'number',
      roleType: 'number',
      walletType: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OpenConsumecardWalletResponse extends $tea.Model {
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

export class QueryConsumecardWalletRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 附言(长度不要超过500个字符)
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryConsumecardWalletResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 钱包信息数据
  walletInfo?: WalletInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      walletInfo: 'wallet_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      walletInfo: WalletInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecConsumecardWalletchargetotokenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 充值的金额(单位为:元,精确到小数点后2位)
  chargeAmount: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      chargeAmount: 'charge_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      chargeAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecConsumecardWalletchargetotokenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 区块高度
  blockNumber?: number;
  // 交易哈希
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      blockNumber: 'block_number',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      blockNumber: 'number',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecConsumecardWalletredeemtokenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 期望要回退的金额(单位:元,精确到分)
  redeemAmount?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      redeemAmount: 'redeem_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      redeemAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecConsumecardWalletredeemtokenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 区块高度
  blockNumber?: number;
  // 交易哈希
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      blockNumber: 'block_number',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      blockNumber: 'number',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartConsumecardPurchaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 支付方证件号
  buyerIdNumber: string;
  // 证件类型：0 身份证, 1 护照, 2 军官证, 3 回乡证, 4 港澳证件, 5 营业执照, 6 港澳居民来往内地通行证, 7 台湾居民来往内地通行证, 8 港澳居民居住证, 9 台湾居民居住证, 10事业单位登记证书, 11 社会团体登记证书, 12 民办非企业单位证书, 13 党政机关批准设计文件, 14 全国组织机构代码证书, 15 其他证件
  buyerIdType: number;
  // 支付方发起ip
  buyerIp: string;
  // 支付方姓名
  buyerName: string;
  // 支付方手机号
  buyerPhone: string;
  // 商品ID
  goodsId: string;
  // 外部系统交易创建时间，毫秒时间戳
  originCreateTime: number;
  // 外部系统订单号
  originOrderId: string;
  // 附言
  remark: string;
  // 期望支付的商品价格(单位:元,精确到分)
  tokenPrice: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      buyerIdNumber: 'buyer_id_number',
      buyerIdType: 'buyer_id_type',
      buyerIp: 'buyer_ip',
      buyerName: 'buyer_name',
      buyerPhone: 'buyer_phone',
      goodsId: 'goods_id',
      originCreateTime: 'origin_create_time',
      originOrderId: 'origin_order_id',
      remark: 'remark',
      tokenPrice: 'token_price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      buyerIdNumber: 'string',
      buyerIdType: 'number',
      buyerIp: 'string',
      buyerName: 'string',
      buyerPhone: 'string',
      goodsId: 'string',
      originCreateTime: 'number',
      originOrderId: 'string',
      remark: 'string',
      tokenPrice: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartConsumecardPurchaseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易ID
  orderId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelConsumecardBuyerpurchaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 交易ID
  orderId: string;
  // 附言
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      orderId: 'order_id',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      orderId: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelConsumecardBuyerpurchaseResponse extends $tea.Model {
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

export class ApplyConsumecardPurchaserefundRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 交易ID
  orderId: string;
  // 附言(退款原因)
  remark: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      orderId: 'order_id',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      orderId: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyConsumecardPurchaserefundResponse extends $tea.Model {
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

export class ApplyConsumecardPurchasereplaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 订单ID
  orderId: string;
  // 附言
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      orderId: 'order_id',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      orderId: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyConsumecardPurchasereplaceResponse extends $tea.Model {
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

export class ExecConsumecardPurchasereceiveRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 订单ID
  orderId: string;
  // 附言
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      orderId: 'order_id',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      orderId: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecConsumecardPurchasereceiveResponse extends $tea.Model {
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

export class RefuseConsumecardPurchaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 交易ID
  orderId: string;
  // 附言
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      orderId: 'order_id',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      orderId: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RefuseConsumecardPurchaseResponse extends $tea.Model {
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

export class SetConsumecardPurchaserefundRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 是否同意退款。true同意，false拒绝。
  accept: boolean;
  // 请求参数
  baseRequest: BaseRequest;
  // 交易ID
  orderId: string;
  // 附言
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accept: 'accept',
      baseRequest: 'base_request',
      orderId: 'order_id',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accept: 'boolean',
      baseRequest: BaseRequest,
      orderId: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetConsumecardPurchaserefundResponse extends $tea.Model {
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

export class SetConsumecardPurchasereplaceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 是否同意换货。true同意，false拒绝
  accept: boolean;
  // 请求参数
  baseRequest: BaseRequest;
  // 交易ID
  orderId: string;
  // 附言
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accept: 'accept',
      baseRequest: 'base_request',
      orderId: 'order_id',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accept: 'boolean',
      baseRequest: BaseRequest,
      orderId: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetConsumecardPurchasereplaceResponse extends $tea.Model {
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

export class ConfirmConsumecardPurchaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 交易ID
  orderId: string;
  // 附言
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      orderId: 'order_id',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      orderId: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmConsumecardPurchaseResponse extends $tea.Model {
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

export class SendConsumecardPurchaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 交易ID
  orderId: string;
  // 附言(发货信息)
  remark: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      orderId: 'order_id',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      orderId: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendConsumecardPurchaseResponse extends $tea.Model {
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

export class ReplaceConsumecardPurchaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 交易ID
  orderId: string;
  // 附言(补发商品信息)
  remark: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      orderId: 'order_id',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      orderId: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReplaceConsumecardPurchaseResponse extends $tea.Model {
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

export class CreateConsumecardGoodsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商品授权类型
  authType: number;
  // 请求参数
  baseRequest: BaseRequest;
  // 默认价格(单位:元,精确到分)
  defaultPrice: string;
  // 代理操作的链上ID
  delegateAccountId: string;
  // 商品描述
  description: string;
  // 商品描述图片url，多个图片间用;隔开
  descImages: string;
  // 商品标价
  displayPrice: string;
  // 商品名称
  goodsName: string;
  // 商品类型
  goodsType: string;
  // 是否公开
  ifPublic: boolean;
  // 商品主图片url
  image: string;
  // 商品每日上限
  limitPerUserAndDay: number;
  // 商品每月上限
  limitPerUserAndMonth: number;
  // 商品库存
  totalCount: number;
  // 商品有效结束时间(UNIX毫秒时间戳)
  validNotAfter: number;
  // 商品有效开始时间(UNIX毫秒时间戳)
  validNotBefore: number;
  // 备注信息
  memo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      authType: 'auth_type',
      baseRequest: 'base_request',
      defaultPrice: 'default_price',
      delegateAccountId: 'delegate_account_id',
      description: 'description',
      descImages: 'desc_images',
      displayPrice: 'display_price',
      goodsName: 'goods_name',
      goodsType: 'goods_type',
      ifPublic: 'if_public',
      image: 'image',
      limitPerUserAndDay: 'limit_per_user_and_day',
      limitPerUserAndMonth: 'limit_per_user_and_month',
      totalCount: 'total_count',
      validNotAfter: 'valid_not_after',
      validNotBefore: 'valid_not_before',
      memo: 'memo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      authType: 'number',
      baseRequest: BaseRequest,
      defaultPrice: 'string',
      delegateAccountId: 'string',
      description: 'string',
      descImages: 'string',
      displayPrice: 'string',
      goodsName: 'string',
      goodsType: 'string',
      ifPublic: 'boolean',
      image: 'string',
      limitPerUserAndDay: 'number',
      limitPerUserAndMonth: 'number',
      totalCount: 'number',
      validNotAfter: 'number',
      validNotBefore: 'number',
      memo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateConsumecardGoodsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 异步发布商品返回的查询ID。使用该ID查询发布结果。
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateConsumecardGoodsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 默认价格
  defaultPrice: string;
  // 商品描述
  description: string;
  // 描述图片url
  descImages: string;
  // 商品标价
  displayPrice: string;
  // 商品ID
  goodsId: string;
  // 商品名称
  goodsName: string;
  // 主图片url
  images: string;
  // 商品每日上限
  limitPerUserAndDay: number;
  // 商品每月上限
  limitPerUserAndMonth: number;
  // 商品库存
  totalCount: number;
  // 商品有效结束时间(UNIX毫秒时间戳)
  validNotAfter: number;
  // 商品有效开始时间(UNIX毫秒时间戳)
  validNotBefore: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      defaultPrice: 'default_price',
      description: 'description',
      descImages: 'desc_images',
      displayPrice: 'display_price',
      goodsId: 'goods_id',
      goodsName: 'goods_name',
      images: 'images',
      limitPerUserAndDay: 'limit_per_user_and_day',
      limitPerUserAndMonth: 'limit_per_user_and_month',
      totalCount: 'total_count',
      validNotAfter: 'valid_not_after',
      validNotBefore: 'valid_not_before',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      defaultPrice: 'string',
      description: 'string',
      descImages: 'string',
      displayPrice: 'string',
      goodsId: 'string',
      goodsName: 'string',
      images: 'string',
      limitPerUserAndDay: 'number',
      limitPerUserAndMonth: 'number',
      totalCount: 'number',
      validNotAfter: 'number',
      validNotBefore: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateConsumecardGoodsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 异步更新商品信息，根据该ID查询更新结果
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OpenConsumecardGoodstocustomRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 商品ID
  goodsId: string;
  // 开放权限的账户id
  openAccountId: string;
  // true授权，false解除授权
  open: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      goodsId: 'goods_id',
      openAccountId: 'open_account_id',
      open: 'open',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      goodsId: 'string',
      openAccountId: 'string',
      open: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OpenConsumecardGoodstocustomResponse extends $tea.Model {
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

export class CreateConsumecardGoodscategoryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 商品类别描述
  categoryDescription: string;
  // 商品分类id（ffaaaaabbbbbbcccccc，如果存在返回失败）
  categoryId: string;
  // 商品类别名称
  categoryName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      categoryDescription: 'category_description',
      categoryId: 'category_id',
      categoryName: 'category_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      categoryDescription: 'string',
      categoryId: 'string',
      categoryName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateConsumecardGoodscategoryResponse extends $tea.Model {
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

export class SetConsumecardGoodscustompriceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 商品ID
  goodsId: string;
  // 设置一客一价的目标账户id
  openAccountId: string;
  // 设置的价格(单位:元,精确到分)
  price: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      goodsId: 'goods_id',
      openAccountId: 'open_account_id',
      price: 'price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      goodsId: 'string',
      openAccountId: 'string',
      price: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetConsumecardGoodscustompriceResponse extends $tea.Model {
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

export class UploadConsumecardGoodsimageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 图片MIME类型，目前仅支持 image/jpeg
  contentType: string;
  // 图片信息（base64编码）列表
  image: string[];
  // 场景码(入驻时申请)
  productCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      contentType: 'content_type',
      image: 'image',
      productCode: 'product_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      contentType: 'string',
      image: { 'type': 'array', 'itemType': 'string' },
      productCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadConsumecardGoodsimageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 临时可访问的url列表，过期时间2小时
  temporaryUrls?: string[];
  // 图片的不可访问url列表，发布商品时使用
  urls?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      temporaryUrls: 'temporary_urls',
      urls: 'urls',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      temporaryUrls: { 'type': 'array', 'itemType': 'string' },
      urls: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecConsumecardOrdertrywithdrawRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 需要提现的订单分布的区块结束高度
  endBlockNumber?: number;
  // 需要提现的订单Id列表(不要超过100个Id)
  orderIdList?: string[];
  // 需要提现的订单分布的区块起始高度
  startBlockNumber?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      endBlockNumber: 'end_block_number',
      orderIdList: 'order_id_list',
      startBlockNumber: 'start_block_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      endBlockNumber: 'number',
      orderIdList: { 'type': 'array', 'itemType': 'string' },
      startBlockNumber: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecConsumecardOrdertrywithdrawResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 试算总提现金额(单位:元,精确到分)
  withdrawTotalAmount?: string;
  // 试算提现订单总笔数
  withdrawTotalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      withdrawTotalAmount: 'withdraw_total_amount',
      withdrawTotalCount: 'withdraw_total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      withdrawTotalAmount: 'string',
      withdrawTotalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecConsumecardOrderwithdrawbyblocknumRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 需要提现的订单分布的区块结束高度
  endBlockNumber: number;
  // 需要提现的订单分布的区块起始高度
  startBlockNumber: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      endBlockNumber: 'end_block_number',
      startBlockNumber: 'start_block_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      endBlockNumber: 'number',
      startBlockNumber: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecConsumecardOrderwithdrawbyblocknumResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 提现单编号(跟踪提现任务)
  withdrawBizId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      withdrawBizId: 'withdraw_biz_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      withdrawBizId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecConsumecardOrderwithdrawbyidsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 订单列表(不要超过100个Id)
  orderIdList: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      orderIdList: 'order_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      orderIdList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecConsumecardOrderwithdrawbyidsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 提现单编号(跟踪提现任务)
  withdrawBizId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      withdrawBizId: 'withdraw_biz_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      withdrawBizId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetConsumecardOrderwithdrawresultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 提现单编号
  withdrawBizId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      withdrawBizId: 'withdraw_biz_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      withdrawBizId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetConsumecardOrderwithdrawresultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 提现任务期望提现的金额(单位:元,精确到分)
  expectedWithdrawAmount?: string;
  // 状态
  status?: string;
  // 需要审批后才能提现的交易订单数量
  withdrawApprovalOrderCount?: number;
  // 提现单编号
  withdrawBizId?: string;
  // 提现成功的总金额(单位:元,精确到分)
  withdrawTotalAmount?: string;
  // 提现成功的总笔数
  withdrawTotalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      expectedWithdrawAmount: 'expected_withdraw_amount',
      status: 'status',
      withdrawApprovalOrderCount: 'withdraw_approval_order_count',
      withdrawBizId: 'withdraw_biz_id',
      withdrawTotalAmount: 'withdraw_total_amount',
      withdrawTotalCount: 'withdraw_total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      expectedWithdrawAmount: 'string',
      status: 'string',
      withdrawApprovalOrderCount: 'number',
      withdrawBizId: 'string',
      withdrawTotalAmount: 'string',
      withdrawTotalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryConsumecardWalletredeemableRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 备注(长度不要超过500个字符)
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryConsumecardWalletredeemableResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 可回退的金额
  redeemableAmount?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      redeemableAmount: 'redeemable_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      redeemableAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryConsumecardGoodscreateresultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 异步发布商品返回的查询ID。使用该ID查询发布结果。
  requestId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryConsumecardGoodscreateresultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商品ID
  goodsId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      goodsId: 'goods_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      goodsId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryConsumecardGoodsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 商品ID
  goodsId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      goodsId: 'goods_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      goodsId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryConsumecardGoodsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商品信息
  goods?: GoodsResponse;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      goods: 'goods',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      goods: GoodsResponse,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyConsumecardBillrefundRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 账单ID
  orderId: string;
  // 附言(不要超过500个字符)
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      orderId: 'order_id',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      orderId: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyConsumecardBillrefundResponse extends $tea.Model {
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

export class QueryConsumecardPurchaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 交易ID
  orderId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryConsumecardPurchaseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易信息
  blockInstruction?: BlockInstruction;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      blockInstruction: 'block_instruction',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      blockInstruction: BlockInstruction,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryConsumecardBlockRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 区块高度
  blockNumber: number;
  // 链ID，指定要获取的
  chainId: string;
  // 代理查询区块信息，传入代理租户需有代理权限。接口会返回调用者和被代理租户能查看的所有交易信息。
  delegatedTenantIds?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      blockNumber: 'block_number',
      chainId: 'chain_id',
      delegatedTenantIds: 'delegated_tenant_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      blockNumber: 'number',
      chainId: 'string',
      delegatedTenantIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryConsumecardBlockResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class QueryConsumecardLastblocknumberRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryConsumecardLastblocknumberResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class QueryConsumecardGoodsupdateresultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 异步更新商品返回的查询ID。使用该ID查询更新结果。
  requestId: string;
  // 请求参数
  baseRequest: BaseRequest;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      requestId: 'request_id',
      baseRequest: 'base_request',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      requestId: 'string',
      baseRequest: BaseRequest,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryConsumecardGoodsupdateresultResponse extends $tea.Model {
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

export class CancelConsumecardSellerpurchaseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 交易ID
  orderId: string;
  // 附言
  remark?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      orderId: 'order_id',
      remark: 'remark',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      orderId: 'string',
      remark: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelConsumecardSellerpurchaseResponse extends $tea.Model {
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

export class SetConsumecardCommissionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 分类id（ffaaaaabbbbbb）
  categoryId: string;
  // 手续费类型（0:全局，1:商户）
  type: number;
  // 手续费归属的账户id,如果type为0 ，则该字段必须为空
  accountId: string;
  // 手续费支出方（0.卖家，1.买家，2.平台）
  payCommissionType: string;
  // 手续费一级分账。最长为6条
  commissionRules: CommissionRule[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      categoryId: 'category_id',
      type: 'type',
      accountId: 'account_id',
      payCommissionType: 'pay_commission_type',
      commissionRules: 'commission_rules',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      categoryId: 'string',
      type: 'number',
      accountId: 'string',
      payCommissionType: 'string',
      commissionRules: { 'type': 'array', 'itemType': CommissionRule },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetConsumecardCommissionResponse extends $tea.Model {
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

export class RemoveConsumecardCommissionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 手续费类型（0:全局，1:商户）
  type: number;
  // 分类id（ffaaaaabbbbbb）
  categoryId: string;
  // 手续费归属的账户id,如果type为0 ，则该字段必须为空
  accountId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      type: 'type',
      categoryId: 'category_id',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      type: 'number',
      categoryId: 'string',
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RemoveConsumecardCommissionResponse extends $tea.Model {
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

export class QueryConsumecardCommissionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 分类id（ffaaaaabbbbbb）
  categoryId: string;
  // 手续费类型（0:全局，1:商户）
  type: number;
  // 手续费归属的账户id,如果type为0 ，则该字段必须为空
  accountId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      categoryId: 'category_id',
      type: 'type',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      categoryId: 'string',
      type: 'number',
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryConsumecardCommissionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 手续费规则结果
  commissionRules?: CommissionRuleResponse[];
  // 分类id（ffaaaaabbbbbb，如果存在则直接更新）
  categoryId?: string;
  // 手续费类型（0:全局，1:商户）
  type?: number;
  // 手续费归属的账户id,如果type为0 ，则该字段必须为空
  accountId?: string;
  // 手续费支出方（0.卖家，1.买家，2.平台）
  payCommissionType?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      commissionRules: 'commission_rules',
      categoryId: 'category_id',
      type: 'type',
      accountId: 'account_id',
      payCommissionType: 'pay_commission_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      commissionRules: { 'type': 'array', 'itemType': CommissionRuleResponse },
      categoryId: 'string',
      type: 'number',
      accountId: 'string',
      payCommissionType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetConsumecardCommissionmanagerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 手续费管理员账户
  setAccountId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      setAccountId: 'set_account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      setAccountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetConsumecardCommissionmanagerResponse extends $tea.Model {
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

export class SetConsumecardGoodsstatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequest;
  // 商品ID
  goodsId: string;
  // 商品状态：0上线，1下线
  status: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      goodsId: 'goods_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      goodsId: 'string',
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetConsumecardGoodsstatusResponse extends $tea.Model {
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

export class CreateConsumecardReceiptcontractRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础请求对象
  baseRequest: BaseRequest;
  // 合同编号，纯数字
  contractNumber: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      contractNumber: 'contract_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      contractNumber: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateConsumecardReceiptcontractResponse extends $tea.Model {
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

export class RemoveConsumecardReceiptcontractRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础信息对象
  baseRequest: BaseRequest;
  // 合同编号，纯数字
  contractNumber: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      contractNumber: 'contract_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      contractNumber: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RemoveConsumecardReceiptcontractResponse extends $tea.Model {
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

export class QueryConsumecardReceiptcontractRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础请求对象
  baseRequest: BaseRequest;
  // 合同编号，纯数字
  contractNumber: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      contractNumber: 'contract_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      contractNumber: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryConsumecardReceiptcontractResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签约ID= platform_tenant_id+product_code+certification_id+sales_plan(分库分表路由)
  uid?: string;
  // 平台租户ID
  platformTenantId?: string;
  // 场景码(需要申请)
  productCode?: string;
  // 认证平台ID，本期支付宝用户ID（分库分表路由字段）
  certificationId?: string;
  // 合同编号
  contractNumber?: string;
  // 证件编号
  idNumber?: string;
  // 证件类型
  idType?: number;
  // 用户姓名/企业名称
  name?: string;
  // 客户编号（链上账号）
  // 
  // 已经创建成功的链上账户
  accountId?: string;
  // 客户编号（业务系统）
  // 
  // 平台业务系统IP
  userId?: string;
  // 签约状态
  // 
  // 0：未签约 1：已签约 2：已解约（主动解约、过期解约）
  status?: number;
  // 签约日期
  // 
  signDate?: string;
  // 解约日期
  // 
  // 
  cancelDate?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      uid: 'uid',
      platformTenantId: 'platform_tenant_id',
      productCode: 'product_code',
      certificationId: 'certification_id',
      contractNumber: 'contract_number',
      idNumber: 'id_number',
      idType: 'id_type',
      name: 'name',
      accountId: 'account_id',
      userId: 'user_id',
      status: 'status',
      signDate: 'sign_date',
      cancelDate: 'cancel_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      uid: 'string',
      platformTenantId: 'string',
      productCode: 'string',
      certificationId: 'string',
      contractNumber: 'string',
      idNumber: 'string',
      idType: 'number',
      name: 'string',
      accountId: 'string',
      userId: 'string',
      status: 'number',
      signDate: 'string',
      cancelDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateConsumecardBillingcontractRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础请求结构
  baseRequest: BaseRequest;
  // 购买数字商品服务平台的租户ID
  platformTenantId: string;
  // 认证平台ID 本期支付宝用户ID
  certificationId: string;
  // 企业名称 企业营业执照名称
  companyName: string;
  // 企业简称 默认企业营业执照名称，可自定义
  companyShortName: string;
  // 身份信息 金融机构/非金融机构
  identity: string;
  // 统一信用社会代码
  usci: string;
  // 客户编号（业务系统） 平台业务系统IP
  userId: string;
  // 营业执照地址
  address: string;
  // 说明商家收款原因-字数中文500字以内（例如ETC服务,加油卡服务）
  serviceContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      platformTenantId: 'platform_tenant_id',
      certificationId: 'certification_id',
      companyName: 'company_name',
      companyShortName: 'company_short_name',
      identity: 'identity',
      usci: 'usci',
      userId: 'user_id',
      address: 'address',
      serviceContent: 'service_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      platformTenantId: 'string',
      certificationId: 'string',
      companyName: 'string',
      companyShortName: 'string',
      identity: 'string',
      usci: 'string',
      userId: 'string',
      address: 'string',
      serviceContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateConsumecardBillingcontractResponse extends $tea.Model {
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

export class RemoveConsumecardBillingcontractRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础请求对象
  baseRequest: BaseRequest;
  // 认证平台ID 本期支付宝用户ID
  certificationId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      certificationId: 'certification_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      certificationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RemoveConsumecardBillingcontractResponse extends $tea.Model {
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

export class QueryConsumecardBillingcontractRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础请求结构
  baseRequest: BaseRequest;
  // 认证平台ID 本期支付宝用户ID
  certificationId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      certificationId: 'certification_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      certificationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryConsumecardBillingcontractResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 基础响应对象
  baseResponse?: BaseResponseData;
  // 商家名称
  name?: string;
  // 商家链上账户ID
  accountId?: string;
  // 认证平台ID 例如：支付宝用户ID
  certificationId?: string;
  // 场景码(需要申请)
  productCode?: string;
  // 签约时间
  signTime?: string;
  // 解约时间
  invalidTime?: string;
  // 签约链接
  arrangementUrl?: string;
  // 签约状态
  status?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      baseResponse: 'base_response',
      name: 'name',
      accountId: 'account_id',
      certificationId: 'certification_id',
      productCode: 'product_code',
      signTime: 'sign_time',
      invalidTime: 'invalid_time',
      arrangementUrl: 'arrangement_url',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      baseResponse: BaseResponseData,
      name: 'string',
      accountId: 'string',
      certificationId: 'string',
      productCode: 'string',
      signTime: 'string',
      invalidTime: 'string',
      arrangementUrl: 'string',
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddConsumecardCommissionpartyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础请求对象
  baseRequest: BaseRequest;
  // 收费规则归属方
  accountId: string;
  // 手续费规则
  commissionRule: CommissionRule;
  // 手续费类型（0:全局，1:商户）
  type: number;
  // 分类id（ffaaaaabbbbbb）
  categoryId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      accountId: 'account_id',
      commissionRule: 'commission_rule',
      type: 'type',
      categoryId: 'category_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      accountId: 'string',
      commissionRule: CommissionRule,
      type: 'number',
      categoryId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddConsumecardCommissionpartyResponse extends $tea.Model {
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

export class RemoveConsumecardCommissionpartyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础请求结构
  baseRequest: BaseRequest;
  // 分类id（ffaaaaabbbbbb）
  categoryId: string;
  // 手续费类型（0:全局，1:商户）
  type: number;
  // 一级分账方accountId
  ruleAccountId: string;
  // 手续费归属的账户id,如果type为0 ，则该字段必须为空
  accountId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      categoryId: 'category_id',
      type: 'type',
      ruleAccountId: 'rule_account_id',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      categoryId: 'string',
      type: 'number',
      ruleAccountId: 'string',
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RemoveConsumecardCommissionpartyResponse extends $tea.Model {
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

export class AddConsumecardCommissionperiodRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础结构体
  baseRequest: BaseRequest;
  // 分类id（ffaaaaabbbbbb）
  categoryId: string;
  // 手续费类型（0:全局，1:商户）
  type: number;
  // 手续费归属的账户id,如果type为0 ，则该字段必须为空
  accountId: string;
  // 一级分账方
  ruleAccountId: string;
  // 手续费周期
  commissionPeriod: CommissionPeriod;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      categoryId: 'category_id',
      type: 'type',
      accountId: 'account_id',
      ruleAccountId: 'rule_account_id',
      commissionPeriod: 'commission_period',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      categoryId: 'string',
      type: 'number',
      accountId: 'string',
      ruleAccountId: 'string',
      commissionPeriod: CommissionPeriod,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddConsumecardCommissionperiodResponse extends $tea.Model {
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

export class RemoveConsumecardCommissionperiodRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础请求对象
  baseRequest: BaseRequest;
  // 商品分类id（ffaaaaabbbbbb）
  categoryId: string;
  // 手续费归属的账户id,如果type为0 ，则该字段必须为空
  accountId: string;
  // 一级分账方
  ruleAccountId: string;
  // 手续费类型（0:全局，1:商户）
  type: number;
  // 手续费开始时间,用于查找去除的手续费（无结束时间）
  startTimeMills: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      categoryId: 'category_id',
      accountId: 'account_id',
      ruleAccountId: 'rule_account_id',
      type: 'type',
      startTimeMills: 'start_time_mills',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      categoryId: 'string',
      accountId: 'string',
      ruleAccountId: 'string',
      type: 'number',
      startTimeMills: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RemoveConsumecardCommissionperiodResponse extends $tea.Model {
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

export class QueryConsumecardCounterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础结构体
  baseRequest: BaseRequest;
  // 查询的类别（0 商家，1 商品）
  type: number;
  // 查询的id（type：0 为accountId 1为goodsId）
  queryId: string;
  // 查询的时间戳对应的counter
  queryTimeInMills: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      type: 'type',
      queryId: 'query_id',
      queryTimeInMills: 'query_time_in_mills',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequest,
      type: 'number',
      queryId: 'string',
      queryTimeInMills: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryConsumecardCounterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 查询的类别（0 商家，1 商品）
  type?: number;
  // 查询的id（type：0 为accountId 1为goodsId）
  queryId?: string;
  // 日统计数据
  dayCounter?: CounterData;
  // 月统计数据
  monthCounter?: CounterData;
  // 年统计数据
  yearCounter?: CounterData;
  // 季度统计数据
  quarterlyCounter?: CounterData;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      type: 'type',
      queryId: 'query_id',
      dayCounter: 'day_counter',
      monthCounter: 'month_counter',
      yearCounter: 'year_counter',
      quarterlyCounter: 'quarterly_counter',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      type: 'number',
      queryId: 'string',
      dayCounter: CounterData,
      monthCounter: CounterData,
      yearCounter: CounterData,
      quarterlyCounter: CounterData,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetConsumecardProductcodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 要配置的租户ID
  tenantId: string;
  // 场景码
  productCode: string;
  // 账户链上名称
  accountName: string;
  // 账户链上ID
  accountId: string;
  // 备注信息
  memo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      tenantId: 'tenant_id',
      productCode: 'product_code',
      accountName: 'account_name',
      accountId: 'account_id',
      memo: 'memo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      tenantId: 'string',
      productCode: 'string',
      accountName: 'string',
      accountId: 'string',
      memo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetConsumecardProductcodeResponse extends $tea.Model {
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

export class QueryConsumecardProductcodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 要查询的租户信息，不传查全部信息
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryConsumecardProductcodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 场景码配置信息列表
  productCodeInfos?: ProductCodeInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      productCodeInfos: 'product_code_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      productCodeInfos: { 'type': 'array', 'itemType': ProductCodeInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RemoveConsumecardProductcodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 要操作的租户ID
  tenantId: string;
  // 	
  // 场景码
  productCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      tenantId: 'tenant_id',
      productCode: 'product_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      tenantId: 'string',
      productCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RemoveConsumecardProductcodeResponse extends $tea.Model {
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

export class QueryConsumecardGoodsimageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 场景码(入驻时申请)
  productCode: string;
  // 要查询的图片不可访问url列表
  urls: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      productCode: 'product_code',
      urls: 'urls',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      productCode: 'string',
      urls: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryConsumecardGoodsimageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 图片的临时可访问url列表，url过期时间2小时
  temporaryUrls?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      temporaryUrls: 'temporary_urls',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      temporaryUrls: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadConsumecardFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 场景码(入驻时申请)
  productCode: string;
  // file_id
  fileObject?: Readable;
  fileObjectName?: string;
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      productCode: 'product_code',
      fileObject: 'fileObject',
      fileObjectName: 'fileObjectName',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      productCode: 'string',
      fileObject: 'Readable',
      fileObjectName: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadConsumecardFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 图片的不可访问url，发布商品时使用
  url?: string;
  // 临时可访问的url，过期时间2小时
  temporaryUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      url: 'url',
      temporaryUrl: 'temporary_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      url: 'string',
      temporaryUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCouponRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 批次ID
  collectionId: string;
  // 电子券ID
  couponId: string;
  // 交易幂等ID，长度不大于128
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      collectionId: 'collection_id',
      couponId: 'coupon_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      collectionId: 'string',
      couponId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCouponResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 电子券详细信息
  coupon?: Coupon;
  // 交易区块高度
  blockNumber?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      coupon: 'coupon',
      blockNumber: 'block_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      coupon: Coupon,
      blockNumber: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCouponRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 创建电子券的参数
  couponInfo: CouponCreate;
  // 交易幂等ID
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      couponInfo: 'coupon_info',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      couponInfo: CouponCreate,
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCouponResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易块高
  blockNumber?: number;
  // 电子券ID
  couponId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      blockNumber: 'block_number',
      couponId: 'coupon_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      blockNumber: 'number',
      couponId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecCouponForbiddenRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 批次ID
  collectionId: string;
  // 电子券ID
  couponId: string;
  // 交易幂等ID，长度限制128
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      collectionId: 'collection_id',
      couponId: 'coupon_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      collectionId: 'string',
      couponId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecCouponForbiddenResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易区块高度
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

export class ExecCouponEnableRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 批次ID
  collectionId: string;
  // 电子券ID
  couponId: string;
  // 交易幂等ID
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      collectionId: 'collection_id',
      couponId: 'coupon_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      collectionId: 'string',
      couponId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecCouponEnableResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易区块高度
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

export class ExecCouponExpireRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 批次ID
  collectionId: string;
  // 电子券ID
  couponId: string;
  // 交易幂等ID
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      collectionId: 'collection_id',
      couponId: 'coupon_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      collectionId: 'string',
      couponId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecCouponExpireResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易区块高度
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

export class ExecCouponWriteoffRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 批次ID
  collectionId: string;
  // 电子券ID
  couponId: string;
  // 交易幂等ID
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      collectionId: 'collection_id',
      couponId: 'coupon_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      collectionId: 'string',
      couponId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecCouponWriteoffResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易区块高度
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

export class ExecCouponTimeoutRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 批次ID
  collectionId: string;
  // 电子券ID
  couponId: string;
  // 交易幂等ID
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      collectionId: 'collection_id',
      couponId: 'coupon_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      collectionId: 'string',
      couponId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecCouponTimeoutResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易区块高度
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

export class ExecCouponActivateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 电子券批次ID
  collectionId: string;
  // 电子券激活码
  couponCode: string;
  // 激活码附加信息
  couponExtCode?: string;
  // 电子券ID
  couponId: string;
  // 交易幂等ID
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      collectionId: 'collection_id',
      couponCode: 'coupon_code',
      couponExtCode: 'coupon_ext_code',
      couponId: 'coupon_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      collectionId: 'string',
      couponCode: 'string',
      couponExtCode: 'string',
      couponId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecCouponActivateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易区块高度
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

export class ExecCouponTransferRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 电子券批次ID
  collectionId: string;
  // 电子券ID
  couponId: string;
  // 原始持有用户公钥对应的私钥，对outBizId的签名
  originUidPublicKeySign: string;
  // 交易幂等ID
  outTxId: string;
  // 要转让的目标用户脱敏ID
  transferDesensitizedUid: string;
  // 要转让的目标用户公钥
  transferUidPublicKey: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      collectionId: 'collection_id',
      couponId: 'coupon_id',
      originUidPublicKeySign: 'origin_uid_public_key_sign',
      outTxId: 'out_tx_id',
      transferDesensitizedUid: 'transfer_desensitized_uid',
      transferUidPublicKey: 'transfer_uid_public_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      collectionId: 'string',
      couponId: 'string',
      originUidPublicKeySign: 'string',
      outTxId: 'string',
      transferDesensitizedUid: 'string',
      transferUidPublicKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecCouponTransferResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易区块高度
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

export class ExecCouponSignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 电子券批次ID
  collectionId: string;
  // 电子券ID
  couponId: string;
  // 脱敏用户ID
  desensitizedUid: string;
  // 交易幂等ID
  outTxId: string;
  // 用户公钥
  uidPublicKey: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      collectionId: 'collection_id',
      couponId: 'coupon_id',
      desensitizedUid: 'desensitized_uid',
      outTxId: 'out_tx_id',
      uidPublicKey: 'uid_public_key',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      collectionId: 'string',
      couponId: 'string',
      desensitizedUid: 'string',
      outTxId: 'string',
      uidPublicKey: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecCouponSignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易区块高度
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

export class ExecCouponBindRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 电子券批次ID
  collectionId: string;
  // 电子券ID
  couponId: string;
  // 用户脱敏ID
  desensitizedUid?: string;
  // 绑定的持有者信息
  holderUserAccount?: string;
  // 交易幂等ID
  outTxId: string;
  // 电子券公钥对应的私钥，对 couponId||outTxId 的签名
  publicKeySign: string;
  // 用户公钥对应的私钥，对 outTxId 的签名
  uidPublicKeySign?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      collectionId: 'collection_id',
      couponId: 'coupon_id',
      desensitizedUid: 'desensitized_uid',
      holderUserAccount: 'holder_user_account',
      outTxId: 'out_tx_id',
      publicKeySign: 'public_key_sign',
      uidPublicKeySign: 'uid_public_key_sign',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      collectionId: 'string',
      couponId: 'string',
      desensitizedUid: 'string',
      holderUserAccount: 'string',
      outTxId: 'string',
      publicKeySign: 'string',
      uidPublicKeySign: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecCouponBindResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易区块高度
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

export class BatchcreateCouponRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 电子券创建参数
  couponInfo: CouponCreate;
  // 一次性创建数量。最大每次创建100张
  createNumber: number;
  // 交易幂等ID
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      couponInfo: 'coupon_info',
      createNumber: 'create_number',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      couponInfo: CouponCreate,
      createNumber: 'number',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateCouponResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易块高
  blockNumber?: number;
  // 电子券创建结果：电子券ID列表
  couponIdList?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      blockNumber: 'block_number',
      couponIdList: 'coupon_id_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      blockNumber: 'number',
      couponIdList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCouponListRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 电子券创建参数列表
  coupons: CouponCreate[];
  // 交易幂等ID
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      coupons: 'coupons',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      coupons: { 'type': 'array', 'itemType': CouponCreate },
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCouponListResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 电子券创建结果：电子券ID列表
  couponIdList?: string[];
  // 交易区块高度
  blockNumber?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      couponIdList: 'coupon_id_list',
      blockNumber: 'block_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      couponIdList: { 'type': 'array', 'itemType': 'string' },
      blockNumber: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCouponCollectionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 批次ID
  collectionId: string;
  // 电子券前缀
  couponNumberPrefix: string;
  // 批次创建者
  issuer: string;
  // 批次名称
  name: string;
  // 是否创建时就记名
  needPreRegistered: boolean;
  // 是否记名电子券
  needRegistered: boolean;
  // 交易幂等ID
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      collectionId: 'collection_id',
      couponNumberPrefix: 'coupon_number_prefix',
      issuer: 'issuer',
      name: 'name',
      needPreRegistered: 'need_pre_registered',
      needRegistered: 'need_registered',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      collectionId: 'string',
      couponNumberPrefix: 'string',
      issuer: 'string',
      name: 'string',
      needPreRegistered: 'boolean',
      needRegistered: 'boolean',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCouponCollectionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易区块高度
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

export class QueryCouponCollectionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 批次ID
  collectionId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      collectionId: 'collection_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      collectionId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCouponCollectionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 批次详情
  couponCollection?: CouponCollection;
  // 交易区块高度
  blockNumber?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      couponCollection: 'coupon_collection',
      blockNumber: 'block_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      couponCollection: CouponCollection,
      blockNumber: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMerchantUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 商户管理下的用户ID
  localId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      localId: 'local_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      localId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMerchantUserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class CreateMerchantUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 用户的did信息
  did?: string;
  // 用户名
  localId: string;
  // 外部交易ID
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class CreateMerchantUserResponse extends $tea.Model {
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

export class QueryMerchantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 币种
  currency?: string;
  // 要代理操作的租户ID
  delegatedTenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      currency: 'currency',
      delegatedTenantId: 'delegated_tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      currency: 'string',
      delegatedTenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMerchantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
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
  // 查询商户信息时的区块高度
  blockNumber?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      merchant: 'merchant',
      blockNumber: 'block_number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      merchant: Merchant,
      blockNumber: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadImageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 图片MIME类型，目前仅支持 image/jpeg
  contentType: string;
  // 要代理操作的租户ID
  delegatedTenantId?: string;
  // 图片信息（base64编码）
  image: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class UploadImageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class GetPkiPublickeyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户管理员/其用户的链上账户ID
  accountId: string;
  // 商户管理员/其用户归属的租户ID
  optTenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountId: 'account_id',
      optTenantId: 'opt_tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountId: 'string',
      optTenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetPkiPublickeyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class ExecPkiEncryptRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户管理员/其用户的链上账户ID
  accountId: string;
  // 明文（base64编码）
  content: string;
  // 商户管理员/其用户归属的租户ID
  optTenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountId: 'account_id',
      content: 'content',
      optTenantId: 'opt_tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountId: 'string',
      content: 'string',
      optTenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecPkiEncryptResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class ExecPkiDecryptRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 商户管理员/其用户的链上账户ID
  accountId: string;
  // 要代理操作的租户ID
  delegatedTenantId?: string;
  // 密文（base64）
  encryptedContent: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountId: 'account_id',
      delegatedTenantId: 'delegated_tenant_id',
      encryptedContent: 'encrypted_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountId: 'string',
      delegatedTenantId: 'string',
      encryptedContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecPkiDecryptResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class UpdateMerchantFriendRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 友好商户租户ID
  friendTenantId: string;
  // 外部交易ID
  outTxId: string;
  // 更新类型
  type: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class UpdateMerchantFriendResponse extends $tea.Model {
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

export class CreateEquityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权类型 0 Auto，1Contract
  authType: number;
  // 链ID
  chainId: string;
  // 结算币种
  currency: string;
  // 权益价格（单位：元）
  defaultPrice: string;
  // 代理操作专用，要代理操作的租户ID
  delegatedTenantId?: string;
  // 权益商品详情信息
  description: string;
  // 权益商品详情图。上传仅接受链接，请使用OSS存储服务上传图片(;分隔)
  descImages: string;
  // 权益商品名称
  equityName: string;
  // 权益商品类型：类型为整型（不大于：2147483647），需要进行细分，类型由三部分组成；aabbbbcccc。aa 为大类分类，bbbb 为细项分类（无细项分类时为0000），cccc 为数据格式分类（其中0000表示无格式要求）。请根据实际商品类型填写，具体类型和兑换时数据结构查看文档【https://tech.antfin.com/docs/2/163896】 。不可修改，如需修改需重新发布商品
  equityType: number;
  // 字段决定权益商品是否全量链上客户可见，当选择权益为false时，需要使用baas.antdao.equity.merchant.open接口增加权益商品可见客户
  ifPublic: boolean;
  // 权益商品主图。上传仅接受链接，请使用OSS存储服务上传图片(;分隔)
  images: string;
  // 商户每日兑换上限
  limitPerMerchantAndDay: number;
  // 商户每月兑换上限
  limitPerMerchantAndMonth: number;
  // 用户每日兑换上限
  limitPerUserAndDay: number;
  // 用户每月兑换上限
  limitPerUserAndMonth: number;
  // 若需要兑换方提供的特殊信息，可增加在备注字段，并要求兑换方是否传入（按照需求方自定义内容信息）
  // - 如必须传入证件号，手机号信息，则权益需要通过运营平台审核，非必须采集信息将拒绝上架
  memo?: string;
  // 外部交易ID
  outTxId: string;
  // 权益商品库存数量
  totalCount: string;
  // 权益商品使用有效期结束时间（毫秒）
  useValidNotAfter: number;
  // 权益商品使用有效期开始时间（毫秒）
  useValidNotBefore: number;
  // 权益商品兑换有效期结束时间（毫秒）
  validNotAfter: number;
  // 权益商品兑换有效期开始时间（毫秒）
  validNotBefore: number;
  // 权益商品面值（单位：元）
  value: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class CreateEquityResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class OfflineEquityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 权益商品ID
  equityId: string;
  // 外部交易ID
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      equityId: 'equity_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      equityId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OfflineEquityResponse extends $tea.Model {
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

export class FreezeEquityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 权益商品ID
  equityId: string;
  // 外部交易ID
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      equityId: 'equity_id',
      outTxId: 'out_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      equityId: 'string',
      outTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FreezeEquityResponse extends $tea.Model {
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

export class OpenEquityMerchantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 代理操作专用，要代理操作的租户ID
  delegatedTenantId?: string;
  // 权益商品ID
  equityId: string;
  // 被授权的租户ID
  optTenantId: string;
  // 更新操作，添加或者删除
  optType: string;
  // 外部交易ID
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class OpenEquityMerchantResponse extends $tea.Model {
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

export class AuthEquityMerchantuserpriceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户兑换价格（单位：元）。价格和比例二选一，且只能填写一个。
  amount?: string;
  // 链ID
  chainId: string;
  // 代理操作专用，要代理操作的租户ID
  delegatedTenantId?: string;
  // 权益商品ID
  equityId: string;
  // 操作用户
  optTenantId?: string;
  // 外部交易ID
  outTxId: string;
  // 比例。价格和比例二选一，且只能填写一个。
  ratio?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class AuthEquityMerchantuserpriceResponse extends $tea.Model {
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

export class UpdateEquityDefaultpriceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 价格
  amount: string;
  // 链ID
  chainId: string;
  // 代理操作专用，要代理操作的租户ID
  delegatedTenantId?: string;
  // 权益商品ID
  equityId: string;
  // 外部交易ID
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class UpdateEquityDefaultpriceResponse extends $tea.Model {
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

export class UpdateEquityTenantpriceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 价格（单位：元）
  amount: string;
  // 链ID
  chainId: string;
  // 要代理操作的租户ID
  delegatedTenantId?: string;
  // 权益商品ID
  equityId: string;
  // 定向价格租户ID
  optTenantId: string;
  // 外部交易ID
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class UpdateEquityTenantpriceResponse extends $tea.Model {
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

export class AddEquityCountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 权益库存数量
  amount: number;
  // 链ID
  chainId: string;
  // 代理操作专用，要代理操作的租户ID
  delegatedTenantId?: string;
  // 权益商品ID
  equityId: string;
  // 外部交易ID
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class AddEquityCountResponse extends $tea.Model {
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

export class UpdateEquityExchangelimitRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 代理操作专用，要代理操作的租户ID
  delegatedTenantId?: string;
  // 权益商品ID
  equityId: string;
  // 商户每日兑换上限
  limitPerMerchantAndDay?: number;
  // 商户每月兑换上限
  limitPerMerchantAndMontn?: number;
  // 用户每日兑换上限
  limitPerUserAndDay?: number;
  // 用户每月兑换上限
  limitPerUserAndMonth?: number;
  // 外部交易ID
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class UpdateEquityExchangelimitResponse extends $tea.Model {
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

export class UpdateEquityValidtimeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 要代理的租户ID
  delegatedTenantId?: string;
  // 权益商品ID
  equityId: string;
  // 外部交易ID
  outTxId: string;
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

export class UpdateEquityValidtimeResponse extends $tea.Model {
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

export class QueryEquityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 要代理操作的租户ID
  delegatedTenantId?: string;
  // 权益商品ID
  equityId: string;
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

export class QueryEquityResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class ExecExchangeByuserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资产ID
  assetId: string;
  // 资产发行方
  assetIssuer: string;
  // 期望资产汇率
  assetRate: string;
  // 链ID
  chainId: string;
  // 代理操作专用，要代理操作的租户ID
  delegatedTenantId?: string;
  // 权益商品ID
  equityId: string;
  // 权益商品提供方ID
  equityProvider: string;
  // 期望权益汇率
  equityRate: string;
  // 兑换时必要信息，敏感信息需加密。兑换时必要的信息，敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
  memo?: string;
  // 外部交易ID
  outTxId: string;
  // 用户ID
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class ExecExchangeByuserResponse extends $tea.Model {
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

export class ExecExchangeBymerchantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资产ID
  assetId: string;
  // 当前希望按照上述比例扣减用户资产
  assetRate: string;
  // 链ID
  chainId: string;
  // 权益商品ID，例：7f1be9108651f97513b5b59030f5b059e58a59d263ab426cbf26337f91642caa
  equityId: string;
  // 用户兑换价格接口设置的价格（单位：元）
  equityPrice: string;
  // 兑换时必要的信息，敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
  // 比如在兑换手机直充商品时，需要对{"countryCode": "86", "phone": "13900000000"} 使用供应商的公钥进行加密。
  memo?: string;
  // 权益商品兑换外部流水ID，调用方自定义流水ID
  outTxId: string;
  // 采购商如果绑定了附加的公私钥对。在兑换商品时需要对SHA256(out_tx_id+tenant_id+asset_id+equity_id+equity_price+asset_rate+user_id+memo)使用ECC K1私钥签名（算法ECDSAWithSHA256，曲线Secp256K1），并转换为Hex。
  txSig?: string;
  // 受益用户名
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class ExecExchangeBymerchantResponse extends $tea.Model {
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

export class ConfirmExchangeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 要代理操作的租户ID
  delegatedTenantId?: string;
  // 权益商品ID
  equityId: string;
  // 附言。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
  memo?: string;
  // 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
  originTxId: string;
  // 外部交易ID
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class ConfirmExchangeResponse extends $tea.Model {
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

export class ExecExchangeOutofstoreRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 要代理操作的租户ID
  delegatedTenantId?: string;
  // 权益商品ID
  equityId: string;
  // 缺货时通知给采购方的信息，若敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
  memo: string;
  // 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
  originTxId: string;
  // 外部交易ID
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class ExecExchangeOutofstoreResponse extends $tea.Model {
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

export class SendExchangeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 要代理操作的租户ID
  delegatedTenantId?: string;
  // 权益商品ID
  equityId: string;
  // 发货商品的信息，敏感信息需加密，使用收货方公钥加密的权益信息。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896。比如在手机直充时可以返回 {  "voucher": "充值凭证，如有",  "memo": ""}信息。
  memo?: string;
  // 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
  originTxId: string;
  // 外部交易ID
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class SendExchangeResponse extends $tea.Model {
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

export class ExecExchangeReceivebyuserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 要代理操作的租户ID
  delegatedTenantId?: string;
  // 收货时的信息，若敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
  memo: string;
  // 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
  originTxId: string;
  // 外部交易ID
  outTxId: string;
  // 用户ID
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class ExecExchangeReceivebyuserResponse extends $tea.Model {
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

export class ExecAssetExpireRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数量
  amount: number;
  // 资产ID
  assetId: string;
  // 链ID
  chainId: string;
  // 资产过期信息
  info?: string;
  // 过期的交易ID
  originalTxId: string;
  // 外部交易ID，每个租户保证唯一
  outTxId: string;
  // 用户ID
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class ExecAssetExpireResponse extends $tea.Model {
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

export class QueryAssetInstructionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 资产流水ID
  originTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      originTxId: 'origin_tx_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      originTxId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryAssetInstructionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class QueryExchangeInstructionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 权益商品ID
  equityId: string;
  // 发起操作的租户ID
  optTenantId: string;
  // 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
  originTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class QueryExchangeInstructionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class ExecAssetIssueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 充值数量
  amount: number;
  // 资产ID
  assetId: string;
  // 链ID
  chainId: string;
  // 备注信息
  info: string;
  // 外部交易ID
  outTxId: string;
  // 充值租户ID
  optTenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      amount: 'amount',
      assetId: 'asset_id',
      chainId: 'chain_id',
      info: 'info',
      outTxId: 'out_tx_id',
      optTenantId: 'opt_tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      amount: 'number',
      assetId: 'string',
      chainId: 'string',
      info: 'string',
      outTxId: 'string',
      optTenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecAssetIssueResponse extends $tea.Model {
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

export class ExecAssetRedeemRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 赎回数量
  amount: number;
  // 资产ID
  assetId: string;
  // 链ID
  chainId: string;
  // 备注信息
  info: string;
  // 要赎回的充值交易ID
  originTxId: string;
  // 外部交易ID
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class ExecAssetRedeemResponse extends $tea.Model {
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

export class ExecAssetGrantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数量
  amount: string;
  // 资产ID
  assetId: string;
  // 链ID
  chainId: string;
  // 资产发放信息
  info?: string;
  // 商户ID
  merchantId: string;
  // 外部交易ID
  outTxId: string;
  // 用户ID
  userId: string;
  // 有效时间
  validityTime: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class ExecAssetGrantResponse extends $tea.Model {
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

export class ExecAssetGrantrefundRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数量
  amount: number;
  // 资产ID
  assetId: string;
  // 链ID
  chainId: string;
  // 备注信息
  info: string;
  // 要回退的交易ID
  originTxId: string;
  // 外部交易ID
  outTxId: string;
  // 用户ID
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class ExecAssetGrantrefundResponse extends $tea.Model {
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

export class ExecAssetAdjustRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 风控调整数量
  amount: number;
  // 资产ID
  assetId: string;
  // 链ID
  chainId: string;
  // 风控调整信息
  info?: string;
  // 外部交易ID，每个租户保证唯一
  outTxId: string;
  // 用户ID
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class ExecAssetAdjustResponse extends $tea.Model {
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

export class QueryAssetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资产ID
  assetId: string;
  // 链ID
  chainId: string;
  // 资产查询相关的租户ID
  optTenantId?: string;
  // 若要查询用户持有的资产数量，输入用户ID
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class QueryAssetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class ExecExchangeReceivebymerchantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 权益商品ID
  equityId: string;
  // 收货时的信息，若敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
  memo?: string;
  // 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
  originTxId: string;
  // 外部交易ID
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class ExecExchangeReceivebymerchantResponse extends $tea.Model {
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

export class QueryBlockRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 区块链高度
  blockNumber: number;
  // 链ID
  chainId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      blockNumber: 'block_number',
      chainId: 'chain_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      blockNumber: 'number',
      chainId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBlockResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class QueryBlockLastblocknumberRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBlockLastblocknumberResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class UpdateEquityRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 授权类型：0 Auto，1 Contract。不可修改，如需修改需重新发布商品
  authType: number;
  // 链ID
  chainId: string;
  // 货币类型。不可修改，如需修改需重新发布商品。
  currency: string;
  // 默认价格（单位：元）
  defaultPrice: string;
  // 要代理的租户ID
  delegatedTenantId?: string;
  // 权益商品详细描述信息
  description: string;
  // 描述图片信息(;分隔)
  descImages: string;
  // 权益商品ID
  equityId: string;
  // 权益商品名称
  equityName: string;
  // 权益商品类型：类型为整型（不大于：2147483647），需要进行细分，类型由三部分组成；aabbbbcccc。aa 为大类分类，bbbb 为细项分类（无细项分类时为0000），cccc 为数据格式分类（其中0000表示无格式要求）。请根据实际商品类型填写，具体类型和兑换时数据结构查看文档【https://tech.antfin.com/docs/2/163896】。不可修改，如需修改需重新发布商品
  equityType: number;
  // 权益商品是否公开。不可修改，如需修改需重新发布商品
  ifPublic: boolean;
  // 主图片信息(;分隔)
  images: string;
  // 商户每日兑换上限
  limitPerMerchantAndDay: number;
  // 商户每月兑换上限
  limitPerMerchantAndMonth: number;
  // 用户每日兑换上限
  limitPerUserAndDay: number;
  // 用户每月兑换上限
  limitPerUserAndMonth: number;
  // 附言
  memo?: string;
  // 交易ID
  outTxId: string;
  // 库存
  totalCount: string;
  // 权益商品使用有效期结束时间（毫秒）
  useValidNotAfter: number;
  // 权益商品使用有效期开始时间（毫秒）
  useValidNotBefore: number;
  // 权益商品兑换有效期结束时间（毫秒）
  validNotAfter: number;
  // 权益商品兑换有效期开始时间（毫秒）
  validNotBefore: number;
  // 面值（单位：元）。不可修改，如需修改需重新发布商品
  value: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class UpdateEquityResponse extends $tea.Model {
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

export class QueryEquityCreateresultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 创建商品接口返回的createEquityRequestId
  createEquityRequestId: string;
  // 要代理操作的租户ID
  delegatedTenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      createEquityRequestId: 'create_equity_request_id',
      delegatedTenantId: 'delegated_tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      createEquityRequestId: 'string',
      delegatedTenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryEquityCreateresultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class QueryEquityInstructionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 代理该租户调用接口，会使用该租户发送交易链上查询信息
  delegatedTenantId?: string;
  // 权益商品ID
  equityId: string;
  // 发起操作的租户ID
  optTenantId: string;
  // 要查询的流水交易号
  originTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class QueryEquityInstructionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class QueryImageRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 要查询的图片数组，填入不可访问的url
  urls: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      urls: 'urls',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      urls: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryImageResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class UpdateEquityStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 要代理操作的租户ID
  delegatedTenantId?: string;
  // 权益商品ID
  equityId: string;
  // 外部交易ID
  outTxId: string;
  // 权益状态：0可用，1下线，2冻结
  status: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class UpdateEquityStatusResponse extends $tea.Model {
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

export class SetMerchantProvisionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 新的授信上限（单位：元）
  creditMaxAmount?: string;
  // 新的授信已使用数额（单位：元）
  creditUsedAmount?: string;
  // 币种
  currency: string;
  // 新的备付金余额（单位：元）
  debitAmount?: string;
  // 要设置备付金的商户租户ID
  optTenantId: string;
  // 初始的授信上限（单位：元）
  originalCreditMaxAmount?: string;
  // 初始的授信已使用数额（单位：元）
  originalCreditUsedAmount?: string;
  // 初始的备付金余额（单位：元）
  originalDebitAmount?: string;
  // 外部交易ID（确保幂等）
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class SetMerchantProvisionResponse extends $tea.Model {
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

export class UpdateMerchantProvisionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 更新授信上限
  creditMaxAmount?: string;
  // 更新授信已使用数额
  creditUsedAmount?: string;
  // 币种
  currency: string;
  // 更新余额
  debitAmount?: string;
  // 要设置备付金的商户租户ID
  optTenantId: string;
  // 操作类型，ADD表示增加，SUB表示减少
  optType: string;
  // 外部交易ID
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class UpdateMerchantProvisionResponse extends $tea.Model {
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

export class ExecEquityInstructionwriteoffRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 权益商品ID
  equityId: string;
  // 附言
  memo?: string;
  // 兑换交易ID
  originTxId: string;
  // 外部交易ID
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class ExecEquityInstructionwriteoffResponse extends $tea.Model {
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

export class QueryMerchantProvisionsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 行为
  businessAction: string;
  // 要查询的租户ID
  optTenantId: string;
  // 产品编码
  productCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      businessAction: 'business_action',
      optTenantId: 'opt_tenant_id',
      productCode: 'product_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      businessAction: 'string',
      optTenantId: 'string',
      productCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMerchantProvisionsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class QueryMerchantExchangeableequitylistRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 页码
  pageNumber: string;
  // 每页数量（不填默认返回50条数据）
  pageSize?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      pageNumber: 'page_number',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      pageNumber: 'string',
      pageSize: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMerchantExchangeableequitylistResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class QueryMerchantExchangeableequitydetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 商品SKUID
  skuId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      skuId: 'sku_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      skuId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMerchantExchangeableequitydetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class ExecAssetCreateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资产ID
  assetId: string;
  // 资产名称
  assetName: string;
  // 链ID
  chainId: string;
  // 资产绑定币种
  currency: string;
  // 为该租户创建新资产
  optTenantId: string;
  // 外部交易ID
  outTxId: string;
  // 资产汇率(等值一元钱的数量)
  rate: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class ExecAssetCreateResponse extends $tea.Model {
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

export class ExecAssetGenerateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 铸币数量
  amount: string;
  // 资产ID
  assetId: string;
  // 链ID
  chainId: string;
  // 外部交易ID
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class ExecAssetGenerateResponse extends $tea.Model {
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

export class CreateMerchantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 商户描述，不超过2048
  description?: string;
  // 商户的资金管理员 归属的租户ID
  fundManagerTenantId: string;
  // 商户角色，是否是资产发行商
  ifAssetIssuer: boolean;
  // 商户角色，是否是采购商
  ifEquityConsumer: boolean;
  // 商户角色，是否是供应商
  ifEquityProvider: boolean;
  // 商户归属的租户ID
  optTenantId: string;
  // 外部交易ID（确保幂等）
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class CreateMerchantResponse extends $tea.Model {
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

export class SetMerchantFundmanagerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部交易ID
  outTxId: string;
  // 链ID
  chainId: string;
  // 要进行资金管理员设置的租户ID
  optTenantId: string;
  // 资金管理员所属的租户ID
  fundManagerTenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outTxId: 'out_tx_id',
      chainId: 'chain_id',
      optTenantId: 'opt_tenant_id',
      fundManagerTenantId: 'fund_manager_tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outTxId: 'string',
      chainId: 'string',
      optTenantId: 'string',
      fundManagerTenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetMerchantFundmanagerResponse extends $tea.Model {
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

export class CreateMerchantProvisionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 外部交易ID，确保幂等
  outTxId: string;
  // 链ID
  chainId: string;
  // 要创建备付金账户的租户ID
  optTenantId: string;
  // 备付金账户币种
  currency: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      outTxId: 'out_tx_id',
      chainId: 'chain_id',
      optTenantId: 'opt_tenant_id',
      currency: 'currency',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      outTxId: 'string',
      chainId: 'string',
      optTenantId: 'string',
      currency: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateMerchantProvisionResponse extends $tea.Model {
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

export class QueryConfigDelegaterelationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 被代理的租户ID
  delegatedTenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      delegatedTenantId: 'delegated_tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      delegatedTenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryConfigDelegaterelationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class UpdateConfigDelegaterelationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 被代理的租户ID
  delegatedTenantId: string;
  // 代理租户ID
  optTenantId: string;
  // 操作类型，ADD表示添加，SUB表示撤销
  optType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      delegatedTenantId: 'delegated_tenant_id',
      optTenantId: 'opt_tenant_id',
      optType: 'opt_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      delegatedTenantId: 'string',
      optTenantId: 'string',
      optType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateConfigDelegaterelationResponse extends $tea.Model {
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

export class QueryConfigWhitelistRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询链的白名单信息
  chainId?: string;
  // 查询该租户的白名单信息
  tenantId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      tenantId: 'tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      tenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryConfigWhitelistResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class UpdateConfigWhitelistRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 租户ID
  optTenantId: string;
  // 操作类型
  optType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      optTenantId: 'opt_tenant_id',
      optType: 'opt_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      optTenantId: 'string',
      optType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateConfigWhitelistResponse extends $tea.Model {
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

export class ApplyExchangeAftersaleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链id
  chainId: string;
  // 权益商品id
  equityId: string;
  // 额外信息 可选
  memo?: string;
  // 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
  originTxId: string;
  // 外部交易ID
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class ApplyExchangeAftersaleResponse extends $tea.Model {
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

export class ExecExchangeAgreeaftersaleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链id
  chainId: string;
  // 要代理操作的租户ID
  delegatedTenantId?: string;
  // 权益id
  equityId: string;
  // 额外信息
  memo?: string;
  // 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
  originTxId: string;
  // 外部交易ID
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class ExecExchangeAgreeaftersaleResponse extends $tea.Model {
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

export class RefuseExchangeAftersaleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // l链id
  chainId: string;
  // 要代理操作的租户ID
  delegatedTenantId?: string;
  // 商品id
  equityId: string;
  // 额外信息
  memo?: string;
  // 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
  originTxId: string;
  // 外部交易id
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class RefuseExchangeAftersaleResponse extends $tea.Model {
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

export class SendExchangeAftersaleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链id
  chainId: string;
  // 要代理操作的租户ID
  delegatedTenantId?: string;
  // 商品id
  equityId: string;
  // 发货商品的信息，敏感信息需加密，使用收货方公钥加密的权益信息。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896。比如在手机直充时可以返回 {  "voucher": "充值凭证，如有",  "memo": ""}信息。
  memo?: string;
  // 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
  originTxId: string;
  // 外部交易id
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class SendExchangeAftersaleResponse extends $tea.Model {
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

export class ConfirmExchangeAftersaleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链id
  chainId: string;
  // 商品id
  equityId: string;
  // 收货时的信息，若敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
  memo?: string;
  // 原始订单交易ID。由采购商在创建对换单时传入，不可更新。
  originTxId: string;
  // 外部交易id
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class ConfirmExchangeAftersaleResponse extends $tea.Model {
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

export class ExecDataDepositRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 交易信息
  tx: Transaction;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      tx: 'tx',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      tx: Transaction,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecDataDepositResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class SetCommissionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 手续费列表，可传入多个
  commissions: Commission[];
  // 商品类型。可按照如下文档查询商品对应的类型，及数据格式 https://tech.antfin.com/docs/2/163896
  equityType: number;
  // 是否设置全局手续费。若是false，需传入optTenantId
  ifGlobal?: boolean;
  // 要设置手续费的租户对象，如果为空表示设置全局手续费（IfGlobal需设置为true）
  optTenantId?: string;
  // 交易幂等ID
  outTxId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class SetCommissionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class QueryCommissionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 商品类型。可按照如下文档查询商品对应的类型，及数据格式https://tech.antfin.com/docs/2/163896
  equityType: number;
  // 是否查询当前生效的手续费信息。如为false，则查询该商品的全部手续费信息
  ifCurrent: boolean;
  // 是否查询全局的手续费信息
  ifGlobal: boolean;
  // 查询该租户的手续费信息
  delegatedTenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      equityType: 'equity_type',
      ifCurrent: 'if_current',
      ifGlobal: 'if_global',
      delegatedTenantId: 'delegated_tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      equityType: 'number',
      ifCurrent: 'boolean',
      ifGlobal: 'boolean',
      delegatedTenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCommissionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class SetCommissionMerchantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 收取手续费的商户对应的租户ID
  optTenantId: string;
  // 交易幂等ID
  outTxId: string;
  // 链ID
  chainId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      optTenantId: 'opt_tenant_id',
      outTxId: 'out_tx_id',
      chainId: 'chain_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      optTenantId: 'string',
      outTxId: 'string',
      chainId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetCommissionMerchantResponse extends $tea.Model {
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

export class QueryCommissionMerchantRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCommissionMerchantResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class CreateConfigChainaccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 要创建的链上ID对应的租户ID
  optTenantId: string;
  // 创建的角色，admin是商户管理员链上ID，fundmanager是资金管理员链上ID
  member: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      optTenantId: 'opt_tenant_id',
      member: 'member',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      optTenantId: 'string',
      member: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateConfigChainaccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 租户ID
  tenantId?: string;
  // 链上ID
  accountId?: string;
  // 链上账户对应的账户公钥
  publicKey?: string;
  // 分布式身份ID
  did?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tenantId: 'tenant_id',
      accountId: 'account_id',
      publicKey: 'public_key',
      did: 'did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tenantId: 'string',
      accountId: 'string',
      publicKey: 'string',
      did: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartIpPackagetradeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础请求参数
  baseRequest: BaseRequestInfo;
  // 买方的链上账户Id
  accountId: string;
  // IP授权交易时传入IP ID；增值服务交易时传入服务ID
  ipId: string;
  // true 只上链不走真实支付，false 上链并链下真实支付账单
  onlyCallBlockchain: boolean;
  // 终端商品价格区间
  priceRange: string;
  // 套餐中包含终端商品数量
  amount: number;
  // 套餐交易应付金额，单位元，保留两位小数
  expectedTotalPrice: string;
  // 授权合作开始期限（毫秒时间戳）
  authBeginTime: number;
  // 授权合作结束期限（毫秒时间戳）
  authEndTime: number;
  // 备注信息
  memo: string;
  // 授权产品范围
  authProductScope?: string;
  // 授权地域范围
  authAreaScope?: string;
  // 商品销售渠道
  salesChannel?: string;
  // 0 IP交易，1 增值服务交易
  goodsType?: number;
  // 增值服务交易绑定的ip授权交易订单，增值服务交易必填
  relatedOrderId?: string;
  // 支付完成后的回调地址。如果为空，默认跳转到https://ipforce.cloud.alipay.com/
  payReturnUrl?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      accountId: 'account_id',
      ipId: 'ip_id',
      onlyCallBlockchain: 'only_call_blockchain',
      priceRange: 'price_range',
      amount: 'amount',
      expectedTotalPrice: 'expected_total_price',
      authBeginTime: 'auth_begin_time',
      authEndTime: 'auth_end_time',
      memo: 'memo',
      authProductScope: 'auth_product_scope',
      authAreaScope: 'auth_area_scope',
      salesChannel: 'sales_channel',
      goodsType: 'goods_type',
      relatedOrderId: 'related_order_id',
      payReturnUrl: 'pay_return_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      accountId: 'string',
      ipId: 'string',
      onlyCallBlockchain: 'boolean',
      priceRange: 'string',
      amount: 'number',
      expectedTotalPrice: 'string',
      authBeginTime: 'number',
      authEndTime: 'number',
      memo: 'string',
      authProductScope: 'string',
      authAreaScope: 'string',
      salesChannel: 'string',
      goodsType: 'number',
      relatedOrderId: 'string',
      payReturnUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartIpPackagetradeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单ID
  ipOrderId?: string;
  // 支付信息
  payUrl?: string;
  // 账单ID
  ipBillId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      ipOrderId: 'ip_order_id',
      payUrl: 'pay_url',
      ipBillId: 'ip_bill_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      ipOrderId: 'string',
      payUrl: 'string',
      ipBillId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelIpPackagetradeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequestInfo;
  // 订单ID
  ipOrderId: string;
  // IP交易发起方的链上账户ID
  accountId: string;
  // 备注信息
  memo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      ipOrderId: 'ip_order_id',
      accountId: 'account_id',
      memo: 'memo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      ipOrderId: 'string',
      accountId: 'string',
      memo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelIpPackagetradeResponse extends $tea.Model {
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

export class UploadIpPackagetradesalesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequestInfo;
  // 买方的链上账户Id
  accountId: string;
  // 关联订单ID
  ipOrderId: string;
  // 销售数据列表
  ipSalesInfoList: IPSalesInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      accountId: 'account_id',
      ipOrderId: 'ip_order_id',
      ipSalesInfoList: 'ip_sales_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      accountId: 'string',
      ipOrderId: 'string',
      ipSalesInfoList: { 'type': 'array', 'itemType': IPSalesInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadIpPackagetradesalesResponse extends $tea.Model {
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

export class StartIpAuthtradeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequestInfo;
  // 采购者的链上账户Id
  accountId: string;
  // IP授权交易时传入IP ID；增值服务交易时传入服务ID
  ipId: string;
  // 收费模式：0 销售抽佣, 1 按量付费
  chargeType?: number;
  // 授权计费比例
  authRate?: string;
  // 按量付费的收费单价（按量付费模式必填）
  authPrice?: string;
  // 授权合作开始期限（毫秒时间戳）
  authBeginTime: number;
  // 授权合作结束期限（毫秒时间戳）
  authEndTime: number;
  // 合同（文件URL）
  contract?: string;
  // 设计稿（文件URL）
  designDraft?: string;
  // 授权产品范围
  authProductScope?: string;
  // 授权地域范围
  authAreaScope?: string;
  // 商品销售渠道
  salesChannel?: string;
  // 备注消息(不超过256个字符)
  memo: string;
  // 是否有保底金
  guaranteed: boolean;
  // 支付的保底金金额
  guaranteedFund?: string;
  // 保底商品个数（按量付费），订单销售数量超过保底部分需按量付费
  guaranteedGoodsAmount?: number;
  // 保底商品销售金额（销售抽佣），订单销售额超过保底部分需按比例抽拥
  guaranteedSales?: string;
  // 0 IP交易，1 增值服务交易
  goodsType?: number;
  // 增值服务交易绑定的ip授权交易订单，增值服务交易必填
  relatedOrderId?: string;
  // 支付完成后的回调地址。如果为空，默认跳转到https://ipforce.cloud.alipay.com/
  payReturnUrl?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      accountId: 'account_id',
      ipId: 'ip_id',
      chargeType: 'charge_type',
      authRate: 'auth_rate',
      authPrice: 'auth_price',
      authBeginTime: 'auth_begin_time',
      authEndTime: 'auth_end_time',
      contract: 'contract',
      designDraft: 'design_draft',
      authProductScope: 'auth_product_scope',
      authAreaScope: 'auth_area_scope',
      salesChannel: 'sales_channel',
      memo: 'memo',
      guaranteed: 'guaranteed',
      guaranteedFund: 'guaranteed_fund',
      guaranteedGoodsAmount: 'guaranteed_goods_amount',
      guaranteedSales: 'guaranteed_sales',
      goodsType: 'goods_type',
      relatedOrderId: 'related_order_id',
      payReturnUrl: 'pay_return_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      accountId: 'string',
      ipId: 'string',
      chargeType: 'number',
      authRate: 'string',
      authPrice: 'string',
      authBeginTime: 'number',
      authEndTime: 'number',
      contract: 'string',
      designDraft: 'string',
      authProductScope: 'string',
      authAreaScope: 'string',
      salesChannel: 'string',
      memo: 'string',
      guaranteed: 'boolean',
      guaranteedFund: 'string',
      guaranteedGoodsAmount: 'number',
      guaranteedSales: 'string',
      goodsType: 'number',
      relatedOrderId: 'string',
      payReturnUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartIpAuthtradeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单ID
  ipOrderId?: string;
  // 保底金支付链接
  payUrl?: string;
  // 保底金账单ID
  ipBillId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      ipOrderId: 'ip_order_id',
      payUrl: 'pay_url',
      ipBillId: 'ip_bill_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      ipOrderId: 'string',
      payUrl: 'string',
      ipBillId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadIpAuthtradesalesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequestInfo;
  // 上传记录的用户的链上账户Id
  accountId: string;
  // 订单ID
  ipOrderId: string;
  // true 只上链不走真实支付，false 上链并链下真实支付账单
  onlyCallBlockchain: boolean;
  // 支付完成后的回调地址。如果为空，默认跳转到https://ipforce.cloud.alipay.com/
  payReturnUrl?: string;
  // 授权佣金比例
  authRate?: string;
  // 定向授权按量付费单价
  authPrice?: string;
  // 本次结算周期开始时间
  settlementBeginTime: number;
  // 本次结算周期结束时间
  settlementEndTime: number;
  // 零售价
  price: string;
  // 终端商品销售数量
  amount: number;
  // 销售金额
  sales: string;
  // 实付金额
  payment: string;
  // 终端商品名称
  goodsName: string;
  // 终端商品图片
  goodsImage?: string;
  // 终端销售渠道
  salesChannel?: string;
  // 终端商品链接
  goodsUrl?: string;
  // 商品信息
  goodsInfo: string;
  // 数据上传操作者
  operator: string;
  // 备注信息
  memo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      accountId: 'account_id',
      ipOrderId: 'ip_order_id',
      onlyCallBlockchain: 'only_call_blockchain',
      payReturnUrl: 'pay_return_url',
      authRate: 'auth_rate',
      authPrice: 'auth_price',
      settlementBeginTime: 'settlement_begin_time',
      settlementEndTime: 'settlement_end_time',
      price: 'price',
      amount: 'amount',
      sales: 'sales',
      payment: 'payment',
      goodsName: 'goods_name',
      goodsImage: 'goods_image',
      salesChannel: 'sales_channel',
      goodsUrl: 'goods_url',
      goodsInfo: 'goods_info',
      operator: 'operator',
      memo: 'memo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      accountId: 'string',
      ipOrderId: 'string',
      onlyCallBlockchain: 'boolean',
      payReturnUrl: 'string',
      authRate: 'string',
      authPrice: 'string',
      settlementBeginTime: 'number',
      settlementEndTime: 'number',
      price: 'string',
      amount: 'number',
      sales: 'string',
      payment: 'string',
      goodsName: 'string',
      goodsImage: 'string',
      salesChannel: 'string',
      goodsUrl: 'string',
      goodsInfo: 'string',
      operator: 'string',
      memo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadIpAuthtradesalesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 支付信息
  payUrl?: string;
  // 账单ID
  ipBillId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      payUrl: 'pay_url',
      ipBillId: 'ip_bill_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      payUrl: 'string',
      ipBillId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelIpAuthtradebillRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequestInfo;
  // 授权模式销售数据的账单ID
  ipBillId: string;
  // 买家的链上账户Id
  accountId: string;
  // 备注信息
  memo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      ipBillId: 'ip_bill_id',
      accountId: 'account_id',
      memo: 'memo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      ipBillId: 'string',
      accountId: 'string',
      memo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelIpAuthtradebillResponse extends $tea.Model {
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

export class QueryIpBillstatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequestInfo;
  // 账单ID
  ipBillId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      ipBillId: 'ip_bill_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      ipBillId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIpBillstatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 交易状态
  // (1: "交易创建,等待买家付款"),
  // (2: "未付款交易超时关闭,或支付完成后全额退款"),
  // (3: "交易支付成功"),
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

export class QueryIpOrderlistRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequestInfo;
  // 买方ID
  buyerId?: string;
  // 卖方ID
  sellerId?: string;
  // IP id
  ipId?: string;
  // 订单ID
  ipOrderId?: string;
  // 订单状态
  orderStatus?: number;
  // 根据IP名称模糊查询
  ipName?: string;
  // 卖方名称，根据卖方名称模糊查询
  sellerName?: string;
  // 交易类型：1 套餐交易， 2 定向授权
  tradeType?: number;
  // 0 IP交易，1 增值服务交易
  goodsType?: number;
  // 收费模式：0 销售抽拥，1 按量计费
  chargeType?: number;
  // 查询订单授权开始时间
  authStartTime?: number;
  // 查询订单授权结束时间
  authEndTime?: number;
  // 排序字段
  orderBy: string;
  // 数据排序顺序：正序还是倒序
  order: string;
  // 页码
  pageNumber: number;
  // 每页数据量大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      buyerId: 'buyer_id',
      sellerId: 'seller_id',
      ipId: 'ip_id',
      ipOrderId: 'ip_order_id',
      orderStatus: 'order_status',
      ipName: 'ip_name',
      sellerName: 'seller_name',
      tradeType: 'trade_type',
      goodsType: 'goods_type',
      chargeType: 'charge_type',
      authStartTime: 'auth_start_time',
      authEndTime: 'auth_end_time',
      orderBy: 'order_by',
      order: 'order',
      pageNumber: 'page_number',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      buyerId: 'string',
      sellerId: 'string',
      ipId: 'string',
      ipOrderId: 'string',
      orderStatus: 'number',
      ipName: 'string',
      sellerName: 'string',
      tradeType: 'number',
      goodsType: 'number',
      chargeType: 'number',
      authStartTime: 'number',
      authEndTime: 'number',
      orderBy: 'string',
      order: 'string',
      pageNumber: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIpOrderlistResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 页码
  pageNumber?: number;
  // 页面大小
  pageSize?: number;
  // 订单总数
  totalOrderCount?: number;
  // 总金额
  totalPaymentAmount?: string;
  // 总客户数
  totalBuyerCount?: number;
  // 订单列表
  orderList?: IPOrder[];
  // 筛选条件下订单总数
  selectOrderCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageNumber: 'page_number',
      pageSize: 'page_size',
      totalOrderCount: 'total_order_count',
      totalPaymentAmount: 'total_payment_amount',
      totalBuyerCount: 'total_buyer_count',
      orderList: 'order_list',
      selectOrderCount: 'select_order_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pageNumber: 'number',
      pageSize: 'number',
      totalOrderCount: 'number',
      totalPaymentAmount: 'string',
      totalBuyerCount: 'number',
      orderList: { 'type': 'array', 'itemType': IPOrder },
      selectOrderCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateIpGoodsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础字段
  baseRequest: BaseRequestInfo;
  // 版权方的链上账户Id
  accountId: string;
  // ip的名字
  ipName: string;
  // 受众群体，多个用;隔开
  audienceGroup: string;
  // ip类型，多个用;隔开
  ipType: string;
  // ip主图,存放oss图片链接;隔开
  image: string;
  // 商品详情图  存放OSS图片链接 用;隔开
  imageDetail: string;
  // ip描述
  description?: string;
  // 对接人信息，json列表
  // [{
  // "name":"123", //联系人名字，必填
  // "mobilePhone":"123",// 联系人手机号,必填
  // "email":"456",// 联系人邮箱,选填
  // "dingDing":"999",// 联系人钉钉号,选填
  // "telePhone":"8888",// 联系人座机,选填
  // "position":"aaa"// 联系人职务,必填
  // }]
  dockingPeopleInfo: DockingPeopleInfo[];
  // 资质
  copyRight: string;
  // 合作事项
  cooperationNote?: string;
  // 传入的渠道信息
  channelName: string;
  // 合作案例，图片存放oss链接，多张用,隔开
  cooperationCase?: string;
  // ip创建时间,毫秒时间戳
  ipCreateTime?: number;
  // 未来大事件
  futureMilestones?: string;
  // 推广渠道
  promotionChannels?: string;
  // ip别称，多个用;隔开
  ipOtherName?: string;
  // 备注信息
  memo?: string;
  // 资质生效时间， 毫秒时间戳
  copyRightBeginTime: number;
  // 资质生效的结束时间
  copyRightEndTime: number;
  // IP图库链接
  ipGalleryUrl?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      accountId: 'account_id',
      ipName: 'ip_name',
      audienceGroup: 'audience_group',
      ipType: 'ip_type',
      image: 'image',
      imageDetail: 'image_detail',
      description: 'description',
      dockingPeopleInfo: 'docking_people_info',
      copyRight: 'copy_right',
      cooperationNote: 'cooperation_note',
      channelName: 'channel_name',
      cooperationCase: 'cooperation_case',
      ipCreateTime: 'ip_create_time',
      futureMilestones: 'future_milestones',
      promotionChannels: 'promotion_channels',
      ipOtherName: 'ip_other_name',
      memo: 'memo',
      copyRightBeginTime: 'copy_right_begin_time',
      copyRightEndTime: 'copy_right_end_time',
      ipGalleryUrl: 'ip_gallery_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      accountId: 'string',
      ipName: 'string',
      audienceGroup: 'string',
      ipType: 'string',
      image: 'string',
      imageDetail: 'string',
      description: 'string',
      dockingPeopleInfo: { 'type': 'array', 'itemType': DockingPeopleInfo },
      copyRight: 'string',
      cooperationNote: 'string',
      channelName: 'string',
      cooperationCase: 'string',
      ipCreateTime: 'number',
      futureMilestones: 'string',
      promotionChannels: 'string',
      ipOtherName: 'string',
      memo: 'string',
      copyRightBeginTime: 'number',
      copyRightEndTime: 'number',
      ipGalleryUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateIpGoodsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // ip的链上id
  ipId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      ipId: 'ip_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      ipId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddIpChannelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础字段
  baseRequest: BaseRequestInfo;
  // ip的链上id
  ipId: string;
  // 渠道信息
  channelName: string;
  // 商品授权 0普通授权/1独家授权,本期只支持0
  authorizationModel: number;
  // 计费模式 0:按量 1:按金额
  payMode: number;
  // ip等级  0:经典IP/1:流量IP/3:设计IP
  ipLevel: number;
  // 交易是否需要确认，默认不需要确认
  tradeNeedConfirm?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      ipId: 'ip_id',
      channelName: 'channel_name',
      authorizationModel: 'authorization_model',
      payMode: 'pay_mode',
      ipLevel: 'ip_level',
      tradeNeedConfirm: 'trade_need_confirm',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      ipId: 'string',
      channelName: 'string',
      authorizationModel: 'number',
      payMode: 'number',
      ipLevel: 'number',
      tradeNeedConfirm: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddIpChannelResponse extends $tea.Model {
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

export class QueryIpOrderinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequestInfo;
  // 订单ID
  ipOrderId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      ipOrderId: 'ip_order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      ipOrderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIpOrderinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单信息
  ipOrder?: IPOrder;
  // IP授权销售数据
  ipSalesInfoList?: IPSalesInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      ipOrder: 'ip_order',
      ipSalesInfoList: 'ip_sales_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      ipOrder: IPOrder,
      ipSalesInfoList: { 'type': 'array', 'itemType': IPSalesInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryIpGoodsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础信息
  baseRequest: BaseRequestInfo;
  // ip名称，支持模糊匹配
  ipName?: string;
  // 商品状态（0:待上架，1:上架，2:下架）
  status?: number;
  // ip的上架渠道
  channelName: string;
  // 分页大小
  pageSize: number;
  // 分页索引
  pageIndex: number;
  // ip商品归属方的链上id
  accountId?: string;
  // Ip类型
  ipType?: string;
  // 受众人群
  audienceGroup?: string;
  // 上架日期开始时间
  createBeginTime: string;
  // 创建的结束日期
  createEndTime: string;
  // 是否需要按照创建时间倒序排序
  isCreateTimeSortDesc: boolean;
  // 是否需要按照pv排序（0:不需要，1:正序，2:倒序），默认按照pv倒序
  isSortByPv?: number;
  // 是否需要按照最近上下架时间排序（0:不需要，1:正序，2:倒序），默认按照倒序
  isSortByStatusChange?: number;
  // 是否需要返回创建渠道，为空默认不返回
  queryCreaterChannel?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      ipName: 'ip_name',
      status: 'status',
      channelName: 'channel_name',
      pageSize: 'page_size',
      pageIndex: 'page_index',
      accountId: 'account_id',
      ipType: 'ip_type',
      audienceGroup: 'audience_group',
      createBeginTime: 'create_begin_time',
      createEndTime: 'create_end_time',
      isCreateTimeSortDesc: 'is_create_time_sort_desc',
      isSortByPv: 'is_sort_by_pv',
      isSortByStatusChange: 'is_sort_by_status_change',
      queryCreaterChannel: 'query_creater_channel',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      ipName: 'string',
      status: 'number',
      channelName: 'string',
      pageSize: 'number',
      pageIndex: 'number',
      accountId: 'string',
      ipType: 'string',
      audienceGroup: 'string',
      createBeginTime: 'string',
      createEndTime: 'string',
      isCreateTimeSortDesc: 'boolean',
      isSortByPv: 'number',
      isSortByStatusChange: 'number',
      queryCreaterChannel: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryIpGoodsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // ip重要信息
  ipList?: IpEmphasisInfo[];
  // 结果总数，不是列表值，用于分页
  allCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      ipList: 'ip_list',
      allCount: 'all_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      ipList: { 'type': 'array', 'itemType': IpEmphasisInfo },
      allCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIpGoodsdetailwithchannelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础结构
  baseRequest: BaseRequestInfo;
  // ip的链上id
  ipIds: string[];
  // 查询的渠道名字
  channelName: string;
  // 是否要增加pv，默认不增加
  updatePv?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      ipIds: 'ip_ids',
      channelName: 'channel_name',
      updatePv: 'update_pv',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      ipIds: { 'type': 'array', 'itemType': 'string' },
      channelName: 'string',
      updatePv: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIpGoodsdetailwithchannelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // ip的信息详情
  ips?: IpBasicInfoWithChannelInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      ips: 'ips',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      ips: { 'type': 'array', 'itemType': IpBasicInfoWithChannelInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIpDetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础字段
  baseRequest: BaseRequestInfo;
  // ip的链上id列表
  ipIds: string[];
  // 查找不到的ip是否报错，默认false，会报错
  skipNotFoundIp?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      ipIds: 'ip_ids',
      skipNotFoundIp: 'skip_not_found_ip',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      ipIds: { 'type': 'array', 'itemType': 'string' },
      skipNotFoundIp: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIpDetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // ip的信息列表
  ips?: IpBasicInfoWithChannelInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      ips: 'ips',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      ips: { 'type': 'array', 'itemType': IpBasicInfoWithChannelInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateIpGoodsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础字段
  baseRequest: BaseRequestInfo;
  // ip的名字
  ipName: string;
  // ip类型，多个用;隔开
  ipType: string;
  // 受众人群，多个用;隔开
  audienceGroup: string;
  // ip链上id
  ipId: string;
  // ip主图,存放oss图片链接 多个用;隔开
  image: string;
  // 商品详情图  存放OSS图片链接 多个用;隔开
  imageDetail: string;
  // ip描述
  description?: string;
  // 对接人信息，json列表
  // [{
  // "name":"123", //联系人名字，必填
  // "mobilePhone":"123",// 联系人手机号,必填
  // "email":"456",// 联系人邮箱,选填
  // "dingDing":"999",// 联系人钉钉号,选填
  // "telePhone":"8888",// 联系人座机,选填
  // "position":"aaa"// 联系人职务,必填
  // }]
  dockingPeopleInfo: DockingPeopleInfo[];
  // 资质
  copyRight: string;
  // 合作事项
  cooperationNote?: string;
  // 传入的渠道信息，不是更新项
  channelName: string;
  // 合作案例，图片存放oss链接，多张用;隔开
  cooperationCase?: string;
  // ip创建时间,毫秒时间戳
  ipCreateTime?: number;
  // 未来大事件
  futureMilestones?: string;
  // 推广渠道
  promotionChannels?: string;
  // ip别名，多个通过;隔开
  ipOtherName?: string;
  // 备注信息
  memo?: string;
  // 资质生效时间 毫秒时间戳
  copyRightBeginTime: number;
  // 资质生效的结束时间
  copyRightEndTime: number;
  // 如果商品是审批通过状态，是否需要审批，默认false。该字段提供给运营使用，慎用！！！
  needApproval?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      ipName: 'ip_name',
      ipType: 'ip_type',
      audienceGroup: 'audience_group',
      ipId: 'ip_id',
      image: 'image',
      imageDetail: 'image_detail',
      description: 'description',
      dockingPeopleInfo: 'docking_people_info',
      copyRight: 'copy_right',
      cooperationNote: 'cooperation_note',
      channelName: 'channel_name',
      cooperationCase: 'cooperation_case',
      ipCreateTime: 'ip_create_time',
      futureMilestones: 'future_milestones',
      promotionChannels: 'promotion_channels',
      ipOtherName: 'ip_other_name',
      memo: 'memo',
      copyRightBeginTime: 'copy_right_begin_time',
      copyRightEndTime: 'copy_right_end_time',
      needApproval: 'need_approval',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      ipName: 'string',
      ipType: 'string',
      audienceGroup: 'string',
      ipId: 'string',
      image: 'string',
      imageDetail: 'string',
      description: 'string',
      dockingPeopleInfo: { 'type': 'array', 'itemType': DockingPeopleInfo },
      copyRight: 'string',
      cooperationNote: 'string',
      channelName: 'string',
      cooperationCase: 'string',
      ipCreateTime: 'number',
      futureMilestones: 'string',
      promotionChannels: 'string',
      ipOtherName: 'string',
      memo: 'string',
      copyRightBeginTime: 'number',
      copyRightEndTime: 'number',
      needApproval: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateIpGoodsResponse extends $tea.Model {
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

export class UpdateIpChannelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础字段
  baseRequest: BaseRequestInfo;
  // ip的链上id
  ipId: string;
  // 渠道信息
  channelName: string;
  // 商品授权 0普通授权/1独家授权,本期只支持0
  authorizationModel: number;
  // 计费模式 0:按量 1:按金额
  payMode: number;
  // ip等级  0:经典IP/1:流量IP/3:设计IP
  ipLevel: number;
  // 交易是否需要确认，为空则不更新
  tradeNeedConfirm?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      ipId: 'ip_id',
      channelName: 'channel_name',
      authorizationModel: 'authorization_model',
      payMode: 'pay_mode',
      ipLevel: 'ip_level',
      tradeNeedConfirm: 'trade_need_confirm',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      ipId: 'string',
      channelName: 'string',
      authorizationModel: 'number',
      payMode: 'number',
      ipLevel: 'number',
      tradeNeedConfirm: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateIpChannelResponse extends $tea.Model {
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

export class OnlineIpRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础字段
  baseRequest: BaseRequestInfo;
  // ip的链上id
  ipId: string;
  // 渠道
  channelName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      ipId: 'ip_id',
      channelName: 'channel_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      ipId: 'string',
      channelName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OnlineIpResponse extends $tea.Model {
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

export class OfflineIpRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // ip基础信息
  baseRequest: BaseRequestInfo;
  // ip的链上id
  ipId: string;
  // 渠道1
  channelName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      ipId: 'ip_id',
      channelName: 'channel_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      ipId: 'string',
      channelName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OfflineIpResponse extends $tea.Model {
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

export class CreateIpAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础请求参数
  baseRequest: BaseRequestInfo;
  // 该用户的在外部系统的用户Id
  externalUserId: string;
  // 该用户的在外部系统的用户名称
  externalUserName: string;
  // 角色:  1:版权方 2: 版权采购商  
  role: number;
  // 商户合作伙伴id，邀请商户入驻
  inviterId?: string;
  // 商户合作伙伴返佣政策id
  policyId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      externalUserId: 'external_user_id',
      externalUserName: 'external_user_name',
      role: 'role',
      inviterId: 'inviter_id',
      policyId: 'policy_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      externalUserId: 'string',
      externalUserName: 'string',
      role: 'number',
      inviterId: 'string',
      policyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateIpAccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 创建成功后, 为该用户生成的链上账户Id
  accountId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FreezeIpAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础请求参数
  baseRequest: BaseRequestInfo;
  // 用户的链上账户Id
  accountId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FreezeIpAccountResponse extends $tea.Model {
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

export class UnfreezeIpAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础请求参数
  baseRequest: BaseRequestInfo;
  // 用户的链上账户Id
  accountId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnfreezeIpAccountResponse extends $tea.Model {
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

export class QueryIpAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础参数
  baseRequest: BaseRequestInfo;
  // 用户的链上账户Id
  accountId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIpAccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 该用户的在外部系统的用户Id
  externalUserId?: string;
  // 该用户的在外部系统的用户名称
  externalUserName?: string;
  // 1:版权方 2: 版权采购商 
  role?: number;
  // 用户状态(0:初始化, 1:申请流程中, 2:可用, 3:被冻结)
  // 买家: 链上账户注册成功即为可用状态。
  // 卖家: 链上账户注册成功为初始化状态, 申请期间涉及2层审核皆为审核流程中状态, 支付宝审核通过即为可用状态。
  status?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      externalUserId: 'external_user_id',
      externalUserName: 'external_user_name',
      role: 'role',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      externalUserId: 'string',
      externalUserName: 'string',
      role: 'number',
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyIpAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础参数
  baseRequest: BaseRequestInfo;
  // 版权方的链上账户Id
  accountId: string;
  // 支付宝的登陆用户名(必须实名制)
  alipayLoginName: string;
  // 商户别名, 会展示在账单以及支付结果页中
  merchantAliasName: string;
  // 商户类型(本期仅支持:  1:企业, 6:个人商户)
  merchantType: number;
  // 商户证件类型(本期仅支持: 201: 营业执照, 100: 个人商户身份证)
  // 如果merchant_type为企业, 需要传入201; 如果merchant_type为个人, 需要传入100
  merchantCertType: number;
  // 商户证件编号(企业提供营业执照),本期人工审核
  merchantCertNumber?: string;
  // 商户营业执照的图片地址,本期人工审核
  merchantCertImage?: string;
  // 税务登记证明的图片,本期人工审核
  merchantSignImage?: string;
  // 商户类别码mcc，参见https://gw.alipayobjects.com/os/bmw-prod/05c9a32e-42d1-436b-ace7-13101d91f672.xlsx
  mcc: string;
  // 商户法人名称, merchant_type = 01时必填	
  legalName?: string;
  // 商户法人身份证号码, merchant_type = 1时必填
  legalCertNo?: string;
  // 商户经营地址
  addressInfo: IPAddressInfo;
  // 商户联系人信息
  contactInfo: IPContactInfo;
  // 默认结算规则
  settleRule: IPSettleRule;
  // 银行卡结算信息, 结算到银行卡时必填, 当前仅支持填入一张卡
  cardInfo?: IPCardInfo;
  // 备注信息
  memo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      accountId: 'account_id',
      alipayLoginName: 'alipay_login_name',
      merchantAliasName: 'merchant_alias_name',
      merchantType: 'merchant_type',
      merchantCertType: 'merchant_cert_type',
      merchantCertNumber: 'merchant_cert_number',
      merchantCertImage: 'merchant_cert_image',
      merchantSignImage: 'merchant_sign_image',
      mcc: 'mcc',
      legalName: 'legal_name',
      legalCertNo: 'legal_cert_no',
      addressInfo: 'address_info',
      contactInfo: 'contact_info',
      settleRule: 'settle_rule',
      cardInfo: 'card_info',
      memo: 'memo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      accountId: 'string',
      alipayLoginName: 'string',
      merchantAliasName: 'string',
      merchantType: 'number',
      merchantCertType: 'number',
      merchantCertNumber: 'string',
      merchantCertImage: 'string',
      merchantSignImage: 'string',
      mcc: 'string',
      legalName: 'string',
      legalCertNo: 'string',
      addressInfo: IPAddressInfo,
      contactInfo: IPContactInfo,
      settleRule: IPSettleRule,
      cardInfo: IPCardInfo,
      memo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyIpAccountResponse extends $tea.Model {
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

export class CheckIpAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础参数
  baseRequest: BaseRequestInfo;
  // 版权方的链上账户Id
  accountId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckIpAccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 申请状态(0:运营审核中, 1:运营审核失败, 2:进件审核中, 3:进件审核失败, 4:进件审核成功)
  status?: string;
  // 运营审核失败原因
  rejectReason?: string;
  // 是否需要支付宝签约(当为true,需要用户到支付宝进行签约) 签约引导说明: https://opendocs.alipay.com/open/00gfyb	
  needSign?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      rejectReason: 'reject_reason',
      needSign: 'need_sign',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      rejectReason: 'string',
      needSign: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmIpGoodsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础信息
  baseRequest: BaseRequestInfo;
  // ip id
  ipId: string;
  // 是否审批通过
  isApproval: boolean;
  // 审批意见
  approvalComments: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      ipId: 'ip_id',
      isApproval: 'is_approval',
      approvalComments: 'approval_comments',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      ipId: 'string',
      isApproval: 'boolean',
      approvalComments: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmIpGoodsResponse extends $tea.Model {
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

export class BatchqueryIpApprovalRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础信息
  baseRequest: BaseRequestInfo;
  // ip名称，支持模糊匹配
  ipName?: string;
  // IP_id
  ipId?: string;
  // ip审批状态 0待审批，1 审批通过，2 审批拒绝
  approvalStatus?: number;
  // 分页
  pageSize: number;
  // 分页
  pageIndex: number;
  // ip类型
  ipType?: string;
  // 受众人群
  audienceGroup?: string;
  // 创建时间段起始
  createBeginTime: string;
  // 创建时间段结束
  createEndTime: string;
  // 商品的链上租户id
  accountId?: string;
  // 是否需要按照创建时间倒序排序
  isCreateTimeSortDesc: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      ipName: 'ip_name',
      ipId: 'ip_id',
      approvalStatus: 'approval_status',
      pageSize: 'page_size',
      pageIndex: 'page_index',
      ipType: 'ip_type',
      audienceGroup: 'audience_group',
      createBeginTime: 'create_begin_time',
      createEndTime: 'create_end_time',
      accountId: 'account_id',
      isCreateTimeSortDesc: 'is_create_time_sort_desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      ipName: 'string',
      ipId: 'string',
      approvalStatus: 'number',
      pageSize: 'number',
      pageIndex: 'number',
      ipType: 'string',
      audienceGroup: 'string',
      createBeginTime: 'string',
      createEndTime: 'string',
      accountId: 'string',
      isCreateTimeSortDesc: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryIpApprovalResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // ip信息
  ipList?: IpBasicInfo[];
  // 结果总数，不是列表值，用于分页
  allCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      ipList: 'ip_list',
      allCount: 'all_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      ipList: { 'type': 'array', 'itemType': IpBasicInfo },
      allCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmIpAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础参数
  baseRequest: BaseRequestInfo;
  // 版权方的链上账户Id
  accountId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmIpAccountResponse extends $tea.Model {
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

export class RefuseIpAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础参数
  baseRequest: BaseRequestInfo;
  // 版权方的链上账户Id
  accountId: string;
  // 拒绝原因
  rejectReason: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      accountId: 'account_id',
      rejectReason: 'reject_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      accountId: 'string',
      rejectReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RefuseIpAccountResponse extends $tea.Model {
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

export class PullIpAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础参数
  baseRequest: BaseRequestInfo;
  // 版权方的链上账户Id
  accountId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PullIpAccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 支付宝的登陆用户名(必须实名制)
  alipayLoginName?: string;
  // 商户别名, 会展示在账单以及支付结果页中
  merchantAliasName?: string;
  // 商户类型(本期仅支持: 1:企业, 6:个人商户)
  merchantType?: number;
  // 商户证件类型(本期仅支持: 201: 营业执照, 100: 个人商户身份证) 如果merchant_type为企业, 需要传入201; 如果merchant_type为个人, 需要传入100
  merchantCertType?: number;
  // 商户证件编号(企业提供营业执照),本期人工审核
  merchantCertNumber?: string;
  // 商户营业执照的图片地址,本期人工审核
  merchantCertImage?: string;
  // 税务登记证明的图片,本期人工审核
  merchantSignImage?: string;
  // 商户类别码mcc，参见https://gw.alipayobjects.com/os/bmw-prod/05c9a32e-42d1-436b-ace7-13101d91f672.xlsx
  mcc?: string;
  // 商户法人名称, merchant_type = 01时必填
  legalName?: string;
  // 商户法人身份证号码, merchant_type = 1时必填
  legalCertNo?: string;
  // 商户经营地址
  addressInfo?: IPAddressInfo;
  // 默认结算规则
  settleRule?: IPSettleRule;
  // 商户联系人信息
  contactInfo?: IPContactInfo;
  // 银行卡结算信息, 结算到银行卡时必填, 当前仅支持填入一张卡
  cardInfo?: IPCardInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      alipayLoginName: 'alipay_login_name',
      merchantAliasName: 'merchant_alias_name',
      merchantType: 'merchant_type',
      merchantCertType: 'merchant_cert_type',
      merchantCertNumber: 'merchant_cert_number',
      merchantCertImage: 'merchant_cert_image',
      merchantSignImage: 'merchant_sign_image',
      mcc: 'mcc',
      legalName: 'legal_name',
      legalCertNo: 'legal_cert_no',
      addressInfo: 'address_info',
      settleRule: 'settle_rule',
      contactInfo: 'contact_info',
      cardInfo: 'card_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      alipayLoginName: 'string',
      merchantAliasName: 'string',
      merchantType: 'number',
      merchantCertType: 'number',
      merchantCertNumber: 'string',
      merchantCertImage: 'string',
      merchantSignImage: 'string',
      mcc: 'string',
      legalName: 'string',
      legalCertNo: 'string',
      addressInfo: IPAddressInfo,
      settleRule: IPSettleRule,
      contactInfo: IPContactInfo,
      cardInfo: IPCardInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIpMccRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础字段
  baseRequest: BaseRequestInfo;
  // 备注信息
  memo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      memo: 'memo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      memo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIpMccResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // mcc类别列表
  mccList?: IPMCC[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      mccList: 'mcc_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      mccList: { 'type': 'array', 'itemType': IPMCC },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIpTypeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础参数
  baseRequest: BaseRequestInfo;
  // 备注信息
  memo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      memo: 'memo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      memo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIpTypeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // ip的type列表
  type?: string[];
  // ip的受众人群
  audienceGroup?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      type: 'type',
      audienceGroup: 'audience_group',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      type: { 'type': 'array', 'itemType': 'string' },
      audienceGroup: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryIpApprovalandchannelRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础信息
  baseRequest: BaseRequestInfo;
  // ip的名字
  ipName?: string;
  // ip的id
  ipId?: string;
  // 审批状态
  approvalStatus?: number;
  // ip类型
  ipType?: string;
  // 受众人群
  audienceGroup?: string;
  // 归属账户
  accountId?: string;
  // 是否需要按照创建时间倒序排序
  // 
  isCreateTimeSortDesc: boolean;
  // 分页大小
  pageSize: number;
  // 分页索引
  pageIndex: number;
  // 开始时间 
  createBeginTime: string;
  // 结束时间
  createEndTime: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      ipName: 'ip_name',
      ipId: 'ip_id',
      approvalStatus: 'approval_status',
      ipType: 'ip_type',
      audienceGroup: 'audience_group',
      accountId: 'account_id',
      isCreateTimeSortDesc: 'is_create_time_sort_desc',
      pageSize: 'page_size',
      pageIndex: 'page_index',
      createBeginTime: 'create_begin_time',
      createEndTime: 'create_end_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      ipName: 'string',
      ipId: 'string',
      approvalStatus: 'number',
      ipType: 'string',
      audienceGroup: 'string',
      accountId: 'string',
      isCreateTimeSortDesc: 'boolean',
      pageSize: 'number',
      pageIndex: 'number',
      createBeginTime: 'string',
      createEndTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryIpApprovalandchannelResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // ip信息
  ipList?: IpAllInfo[];
  // 总数
  allCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      ipList: 'ip_list',
      allCount: 'all_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      ipList: { 'type': 'array', 'itemType': IpAllInfo },
      allCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryIpAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础参数
  // 
  baseRequest: BaseRequestInfo;
  // 账户Id列表(单次不能超过50个)
  accountIds: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      accountIds: 'account_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      accountIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryIpAccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 批量查询商家信息
  applyInfos?: IPMerchantApplyInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      applyInfos: 'apply_infos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      applyInfos: { 'type': 'array', 'itemType': IPMerchantApplyInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryIpSellerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础信息
  baseRequest: BaseRequestInfo;
  // 不同的平台标识
  channelName: string;
  // 分页大小
  pageSize: number;
  // 分页索引
  pageIndex: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      channelName: 'channel_name',
      pageSize: 'page_size',
      pageIndex: 'page_index',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      channelName: 'string',
      pageSize: 'number',
      pageIndex: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryIpSellerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 结果总数，不是列表值，用于分页
  // 
  allCount?: number;
  // 版权方申请列表
  applyList?: IPApplyInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      allCount: 'all_count',
      applyList: 'apply_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      allCount: 'number',
      applyList: { 'type': 'array', 'itemType': IPApplyInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyIpCodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础参数
  baseRequest: BaseRequestInfo;
  // IP商家的链上账户ID
  accountId: string;
  // 套餐交易/授权交易的订单ID
  orderId: string;
  // 申请数量
  count: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      accountId: 'account_id',
      orderId: 'order_id',
      count: 'count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      accountId: 'string',
      orderId: 'string',
      count: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyIpCodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 正版码的批次ID
  codeBatchId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      codeBatchId: 'code_batch_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      codeBatchId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryIpCodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础参数
  baseRequest: BaseRequestInfo;
  // 正版码批次编码
  codeBatchId: string;
  // 分页参数:页码
  pageIndex: number;
  // 分页参数:每页条目数
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      codeBatchId: 'code_batch_id',
      pageIndex: 'page_index',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      codeBatchId: 'string',
      pageIndex: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryIpCodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 正版码列表
  codeList?: string[];
  // 交易订单ID
  orderId?: string;
  // IP商家的链上账户ID
  buyerAccountId?: string;
  // IP版权方的链上账户ID
  sellerAccountId?: string;
  // IPID
  ipId?: string;
  // IP名称
  ipName?: string;
  // IP主图的OSS地址
  ipImage?: string;
  // IP描述
  ipDesc?: string;
  // 该批次正版码的过期时间戳(毫秒)
  expiredDate?: number;
  // 总数量
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      codeList: 'code_list',
      orderId: 'order_id',
      buyerAccountId: 'buyer_account_id',
      sellerAccountId: 'seller_account_id',
      ipId: 'ip_id',
      ipName: 'ip_name',
      ipImage: 'ip_image',
      ipDesc: 'ip_desc',
      expiredDate: 'expired_date',
      totalCount: 'total_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      codeList: { 'type': 'array', 'itemType': 'string' },
      orderId: 'string',
      buyerAccountId: 'string',
      sellerAccountId: 'string',
      ipId: 'string',
      ipName: 'string',
      ipImage: 'string',
      ipDesc: 'string',
      expiredDate: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckIpCodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础参数
  baseRequest: BaseRequestInfo;
  // 正版码的编码
  code: string;
  // 扫码用户的ID
  userId: string;
  // 扫码用户的名称
  userName: string;
  // 扫码用户的手机号
  phoneNumber?: string;
  // 扫码用户的位置信息
  gps?: string;
  // 用户头像地址
  avatar: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      code: 'code',
      userId: 'user_id',
      userName: 'user_name',
      phoneNumber: 'phone_number',
      gps: 'gps',
      avatar: 'avatar',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      code: 'string',
      userId: 'string',
      userName: 'string',
      phoneNumber: 'string',
      gps: 'string',
      avatar: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckIpCodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 被扫描的次数(包含本次)
  scannedCount?: number;
  // 扫描历史列表(仅展示最近扫描的50次信息)
  scannedList?: IPCodeScannedInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      scannedCount: 'scanned_count',
      scannedList: 'scanned_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      scannedCount: 'number',
      scannedList: { 'type': 'array', 'itemType': IPCodeScannedInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmIpUpdateapprovalRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础字段
  baseRequest: BaseRequestInfo;
  // ip的id
  ipId: string;
  // 是否审批通过
  isApproval: boolean;
  // 审批信息
  approvalComments?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      ipId: 'ip_id',
      isApproval: 'is_approval',
      approvalComments: 'approval_comments',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      ipId: 'string',
      isApproval: 'boolean',
      approvalComments: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmIpUpdateapprovalResponse extends $tea.Model {
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

export class SetIpSkuRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础字段
  baseRequest: BaseRequestInfo;
  // ip的id
  ipId: string;
  // 渠道名字
  channelName: string;
  // sku数组
  skus: IpSkuEmphasisInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      ipId: 'ip_id',
      channelName: 'channel_name',
      skus: 'skus',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      ipId: 'string',
      channelName: 'string',
      skus: { 'type': 'array', 'itemType': IpSkuEmphasisInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetIpSkuResponse extends $tea.Model {
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

export class QueryIpGoodsupdateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础字段
  baseRequest: BaseRequestInfo;
  // ipid的列表，最多20个
  ipIds: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      ipIds: 'ip_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      ipIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIpGoodsupdateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // ip的更新数据
  ipList?: IpBasicInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      ipList: 'ip_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      ipList: { 'type': 'array', 'itemType': IpBasicInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryIpBillRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础请求参数
  baseRequest: BaseRequestInfo;
  // 订单ID
  ipOrderId: string;
  // 账单状态，预留字段
  billStatus?: number;
  // 排序字段
  orderBy: string;
  // 排序顺序：正序还是倒序
  order: string;
  // 页码
  pageNumber: number;
  // 每页数据量大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      ipOrderId: 'ip_order_id',
      billStatus: 'bill_status',
      orderBy: 'order_by',
      order: 'order',
      pageNumber: 'page_number',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      ipOrderId: 'string',
      billStatus: 'number',
      orderBy: 'string',
      order: 'string',
      pageNumber: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryIpBillResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 页码
  pageNumber?: number;
  // 页面数据量大小
  pageSize?: number;
  // 筛选条件下账单总数
  selectBillCount?: number;
  // 账单信息列表
  billList?: IPBill[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageNumber: 'page_number',
      pageSize: 'page_size',
      selectBillCount: 'select_bill_count',
      billList: 'bill_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pageNumber: 'number',
      pageSize: 'number',
      selectBillCount: 'number',
      billList: { 'type': 'array', 'itemType': IPBill },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIpSkuconfigRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础字段
  baseRequest: BaseRequestInfo;
  // 渠道名称
  channelName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      channelName: 'channel_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      channelName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIpSkuconfigResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // sku信息
  skus?: IpSkuConfigWithLevel[];
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
      skus: { 'type': 'array', 'itemType': IpSkuConfigWithLevel },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportIpAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础入参
  baseRequest: BaseRequestInfo;
  // 支付宝的登陆用户名(必须实名制)
  alipayLoginName: string;
  // 商户类型(本期仅支持: 1:企业, 6:个人商户)	
  merchantType: number;
  // 商户别名, 会展示在账单以及支付结果页中
  merchantAliasName: string;
  // 商户法人名称, merchant_type = 1时必填	
  legalName?: string;
  // 商户法人身份证号码, merchant_type = 1时必填	
  legalCertNo?: string;
  // 结算目标账户(银行卡/支付宝)
  settleTarget: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      alipayLoginName: 'alipay_login_name',
      merchantType: 'merchant_type',
      merchantAliasName: 'merchant_alias_name',
      legalName: 'legal_name',
      legalCertNo: 'legal_cert_no',
      settleTarget: 'settle_target',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      alipayLoginName: 'string',
      merchantType: 'number',
      merchantAliasName: 'string',
      legalName: 'string',
      legalCertNo: 'string',
      settleTarget: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportIpAccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 导入后的新链上账户Id
  accountId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RemoveIpSkuRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础字段
  baseRequest: BaseRequestInfo;
  // IP id
  ipId: string;
  // 渠道名称
  channelName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      ipId: 'ip_id',
      channelName: 'channel_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      ipId: 'string',
      channelName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RemoveIpSkuResponse extends $tea.Model {
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

export class CreateIpSuperviseapproveRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础字段
  baseRequest: BaseRequestInfo;
  // 订单id
  orderId: string;
  // 监修报审内容，业务相关字段自行组织成json，统一存储
  extInfo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      orderId: 'order_id',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      orderId: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateIpSuperviseapproveResponse extends $tea.Model {
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

export class ConfirmIpSuperviseapproveRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础字段
  baseRequest: BaseRequestInfo;
  // 监修报审关联的订单id
  orderId: string;
  // 当前期望的审批阶段（用于校验）
  stage: number;
  // 是否审批通过
  isApproval: boolean;
  // 审批备注
  approvalComments?: string;
  // 审批额外信息
  approvalExtInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      orderId: 'order_id',
      stage: 'stage',
      isApproval: 'is_approval',
      approvalComments: 'approval_comments',
      approvalExtInfo: 'approval_ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      orderId: 'string',
      stage: 'number',
      isApproval: 'boolean',
      approvalComments: 'string',
      approvalExtInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmIpSuperviseapproveResponse extends $tea.Model {
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

export class PushIpSuperviseapproveRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础字段
  baseRequest: BaseRequestInfo;
  // 关联的订单id
  orderId: string;
  // 当前期望的阶段（用于校验，若是重新提交，则阶段值相等，若推进下一阶段，则阶段值+1）
  stage: number;
  // 监修报审的阶段具体内容，组织成json保存
  extInfo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      orderId: 'order_id',
      stage: 'stage',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      orderId: 'string',
      stage: 'number',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushIpSuperviseapproveResponse extends $tea.Model {
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

export class QueryIpSuperviseapproveRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础字段
  baseRequest: BaseRequestInfo;
  // 关联的订单id
  orderId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIpSuperviseapproveResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 监修报审最新阶段的详情
  superviseApprove?: SuperviseApprove;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      superviseApprove: 'supervise_approve',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      superviseApprove: SuperviseApprove,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReceiveIpCodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础参数
  baseRequest: BaseRequestInfo;
  // 正版码的编码
  code: string;
  // 领取用户的ID
  userId: string;
  // 领取用户的名称
  userName: string;
  // 领取用户的手机号
  phoneNumber?: string;
  // 领取用户的位置信息
  gps?: string;
  // 用户头像地址
  avatar: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      code: 'code',
      userId: 'user_id',
      userName: 'user_name',
      phoneNumber: 'phone_number',
      gps: 'gps',
      avatar: 'avatar',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      code: 'string',
      userId: 'string',
      userName: 'string',
      phoneNumber: 'string',
      gps: 'string',
      avatar: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReceiveIpCodeResponse extends $tea.Model {
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

export class PagequeryIpCodeinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础参数
  baseRequest: BaseRequestInfo;
  // 用户ID
  userId: string;
  // 页码
  pageNumber: number;
  // 每页数据量大小
  pageSize: number;
  // 0 扫描过的正版码，1 领取过的正版码
  type: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      userId: 'user_id',
      pageNumber: 'page_number',
      pageSize: 'page_size',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      userId: 'string',
      pageNumber: 'number',
      pageSize: 'number',
      type: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryIpCodeinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 页码
  pageNumber?: number;
  // 页面数据量大小
  pageSize?: number;
  // 领取到的正版码总数
  codeCount?: number;
  // 正版码列表信息
  codeList?: IPCodeScannedInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageNumber: 'page_number',
      pageSize: 'page_size',
      codeCount: 'code_count',
      codeList: 'code_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pageNumber: 'number',
      pageSize: 'number',
      codeCount: 'number',
      codeList: { 'type': 'array', 'itemType': IPCodeScannedInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateIpValueaddRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础字段
  baseRequest: BaseRequestInfo;
  // 创建增值服务的账户id
  accountId: string;
  // 服务名字
  serviceName: string;
  // 商品主图，存放OSS图片链接,多张用;隔开
  images: string;
  // 商品详情图  存放OSS图片链接,多张用;隔开
  imagesDetail: string;
  // 商品描述
  description?: string;
  // 联系人
  dockingPeople: DockingPeopleInfo[];
  // 资质证明
  copyRight?: string;
  // 备注
  memo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      accountId: 'account_id',
      serviceName: 'service_name',
      images: 'images',
      imagesDetail: 'images_detail',
      description: 'description',
      dockingPeople: 'docking_people',
      copyRight: 'copy_right',
      memo: 'memo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      accountId: 'string',
      serviceName: 'string',
      images: 'string',
      imagesDetail: 'string',
      description: 'string',
      dockingPeople: { 'type': 'array', 'itemType': DockingPeopleInfo },
      copyRight: 'string',
      memo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateIpValueaddResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 服务id
  serviceId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      serviceId: 'service_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      serviceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateIpValueaddRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础字段
  baseRequest: BaseRequestInfo;
  // 服务id
  serviceId: string;
  // 增值服务名字
  serviceName: string;
  // 主图。存放OSS图片链接,多张用;隔开
  image: string;
  // 商品详情图  存放OSS图片链接.多张用;隔开
  imageDetail: string;
  // 描述
  description?: string;
  // 联系人
  dockingPeople: DockingPeopleInfo[];
  // 资质证明
  copyRight?: string;
  // 备注
  memo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      serviceId: 'service_id',
      serviceName: 'service_name',
      image: 'image',
      imageDetail: 'image_detail',
      description: 'description',
      dockingPeople: 'docking_people',
      copyRight: 'copy_right',
      memo: 'memo',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      serviceId: 'string',
      serviceName: 'string',
      image: 'string',
      imageDetail: 'string',
      description: 'string',
      dockingPeople: { 'type': 'array', 'itemType': DockingPeopleInfo },
      copyRight: 'string',
      memo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateIpValueaddResponse extends $tea.Model {
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

export class SetIpValueaddskuRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础字段
  baseRequest: BaseRequestInfo;
  // 服务id
  serviceId: string;
  // sku
  skus: IpSkuEmphasisInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      serviceId: 'service_id',
      skus: 'skus',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      serviceId: 'string',
      skus: { 'type': 'array', 'itemType': IpSkuEmphasisInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetIpValueaddskuResponse extends $tea.Model {
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

export class OnlineIpValueaddRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础字段
  baseRequest: BaseRequestInfo;
  // 服务id
  serviceId: string;
  // 是否上线，否为下线
  isOnline: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      serviceId: 'service_id',
      isOnline: 'is_online',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      serviceId: 'string',
      isOnline: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OnlineIpValueaddResponse extends $tea.Model {
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

export class QueryIpValueaddRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础字段
  baseRequest: BaseRequestInfo;
  // 查询服务id
  serviceId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      serviceId: 'service_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      serviceId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIpValueaddResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 增值服务详情
  valueAddedInfo?: ValueAddedServiceInfoWithSku;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      valueAddedInfo: 'value_added_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      valueAddedInfo: ValueAddedServiceInfoWithSku,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryIpValueaddRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础字段
  baseRequest: BaseRequestInfo;
  // 归属账户id
  accountId?: string;
  // 服务名字，模糊匹配
  serviceName?: string;
  // 服务状态（0:待审核 1:审核拒绝 2:上线【审核通过】 3: 下线）
  status?: number;
  // 第几页
  pageIndex: number;
  // 每页长度
  pageSize: number;
  // 开始时间
  beginCreateTime: string;
  // 结束时间
  engCreateTime: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      accountId: 'account_id',
      serviceName: 'service_name',
      status: 'status',
      pageIndex: 'page_index',
      pageSize: 'page_size',
      beginCreateTime: 'begin_create_time',
      engCreateTime: 'eng_create_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      accountId: 'string',
      serviceName: 'string',
      status: 'number',
      pageIndex: 'number',
      pageSize: 'number',
      beginCreateTime: 'string',
      engCreateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryIpValueaddResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 增值服务列表
  data?: ValueAddedServiceInfo[];
  // 总数
  allCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      data: 'data',
      allCount: 'all_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      data: { 'type': 'array', 'itemType': ValueAddedServiceInfo },
      allCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadIpTradesalesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求参数
  baseRequest: BaseRequestInfo;
  // 上传记录的用户的链上账户Id
  accountId: string;
  // 订单ID
  ipOrderId: string;
  // true 只上链不走真实支付，false 上链并链下真实支付账单
  onlyCallBlockchain: boolean;
  // 支付完成后的回调地址。如果为空，默认跳转到https://ipforce.cloud.alipay.com/
  payReturnUrl?: string;
  // 授权佣金比例
  authRate?: string;
  // 定向授权按量付费单价
  authPrice?: string;
  // 商品销售数量
  totalAmount: number;
  // 销售金额
  totalSales: string;
  // 实付金额（授权交易）
  totalPayment: string;
  // 销售数据列表
  ipSalesInfoList: IPSalesInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      accountId: 'account_id',
      ipOrderId: 'ip_order_id',
      onlyCallBlockchain: 'only_call_blockchain',
      payReturnUrl: 'pay_return_url',
      authRate: 'auth_rate',
      authPrice: 'auth_price',
      totalAmount: 'total_amount',
      totalSales: 'total_sales',
      totalPayment: 'total_payment',
      ipSalesInfoList: 'ip_sales_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      accountId: 'string',
      ipOrderId: 'string',
      onlyCallBlockchain: 'boolean',
      payReturnUrl: 'string',
      authRate: 'string',
      authPrice: 'string',
      totalAmount: 'number',
      totalSales: 'string',
      totalPayment: 'string',
      ipSalesInfoList: { 'type': 'array', 'itemType': IPSalesInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadIpTradesalesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 支付链接
  payUrl?: string;
  // 账单ID
  ipBillId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      payUrl: 'pay_url',
      ipBillId: 'ip_bill_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      payUrl: 'string',
      ipBillId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthIpUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础参数
  baseRequest: BaseRequestInfo;
  // 用户授权code
  authCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      authCode: 'auth_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      authCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthIpUserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户ID
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RemoveIpGoodsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础字段
  baseRequest: BaseRequestInfo;
  // ip id
  ipId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      ipId: 'ip_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      ipId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RemoveIpGoodsResponse extends $tea.Model {
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

export class CountIpNumRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础字段
  baseRequest: BaseRequestInfo;
  // 账户id，为空则查全局
  accountId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountIpNumResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 各个渠道的统计
  counterDetail?: ChannelCounter[];
  // 总计值
  allCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      counterDetail: 'counter_detail',
      allCount: 'all_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      counterDetail: { 'type': 'array', 'itemType': ChannelCounter },
      allCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountIpPvRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础字段
  baseRequest: BaseRequestInfo;
  // 账户id，为空则统计全局
  accountId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      accountId: 'account_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      accountId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountIpPvResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 总计
  allCount?: number;
  // 渠道统计值
  counterDetails?: ChannelCounter[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      allCount: 'all_count',
      counterDetails: 'counter_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      allCount: 'number',
      counterDetails: { 'type': 'array', 'itemType': ChannelCounter },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIpCodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础参数
  baseRequest: BaseRequestInfo;
  // 正版码的编码
  code: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      code: 'code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      code: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIpCodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 正版码信息
  codeInfo?: IPCodeScannedInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      codeInfo: 'code_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      codeInfo: IPCodeScannedInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountIpAccountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础参数
  baseRequest: BaseRequestInfo;
  // 支持多链多合约,该参数为指明需要操作哪个智能合约环境(长度不超过50个字符)
  chainId?: string;
  // 场景码(入驻时申请)(长度不超过50个字符)
  productCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      chainId: 'chain_id',
      productCode: 'product_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      chainId: 'string',
      productCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CountIpAccountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户数量
  userCount?: number;
  // 版权方数量
  sellerCount?: number;
  // 版权方数量
  buyerCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      userCount: 'user_count',
      sellerCount: 'seller_count',
      buyerCount: 'buyer_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      userCount: 'number',
      sellerCount: 'number',
      buyerCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIpOrderstatisticRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础参数
  baseRequest: BaseRequestInfo;
  // 卖方ID
  sellerId?: string;
  // IP id
  ipId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      sellerId: 'seller_id',
      ipId: 'ip_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      sellerId: 'string',
      ipId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIpOrderstatisticResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单总数
  totalOrderCount?: number;
  // 总金额
  totalPaymentAmount?: string;
  // 总客户数
  totalBuyerCount?: number;
  // 统计数据
  orderStaList?: ChannelCounter[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      totalOrderCount: 'total_order_count',
      totalPaymentAmount: 'total_payment_amount',
      totalBuyerCount: 'total_buyer_count',
      orderStaList: 'order_sta_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      totalOrderCount: 'number',
      totalPaymentAmount: 'string',
      totalBuyerCount: 'number',
      orderStaList: { 'type': 'array', 'itemType': ChannelCounter },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateIpGoodsgalleryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础参数
  baseRequest: BaseRequestInfo;
  // 版权方链上账户ID
  accountId: string;
  // ip链上id
  ipId: string;
  // IP图库链接，一个压缩包
  ipGalleryUrl: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      accountId: 'account_id',
      ipId: 'ip_id',
      ipGalleryUrl: 'ip_gallery_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      accountId: 'string',
      ipId: 'string',
      ipGalleryUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateIpGoodsgalleryResponse extends $tea.Model {
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

export class QueryIpGoodsgalleryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础参数
  baseRequest: BaseRequestInfo;
  // 账户链上ID
  accountId: string;
  // IP链上ID，只有版权方可以根据IPID查询图库信息
  ipId?: string;
  // IP授权订单ID，版权方和商家均可根据订单ID查询图库信息
  ipOrderId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      accountId: 'account_id',
      ipId: 'ip_id',
      ipOrderId: 'ip_order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      accountId: 'string',
      ipId: 'string',
      ipOrderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIpGoodsgalleryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 图库链接
  ipGalleryUrl?: string;
  // 图库临时下载链接，过期时间2小时
  ipGalleryTemporaryUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      ipGalleryUrl: 'ip_gallery_url',
      ipGalleryTemporaryUrl: 'ip_gallery_temporary_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      ipGalleryUrl: 'string',
      ipGalleryTemporaryUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetIpCodeinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础参数
  baseRequest: BaseRequestInfo;
  // 商家账户链上ID
  accountId: string;
  // 订单ID
  orderId: string;
  // 正版码商品信息配置列表
  goodsInfoList?: IPCodeGoodsInfo[];
  // 正版码资源位配置信息列表
  adInfoList?: IPCodeAdvertisingInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      accountId: 'account_id',
      orderId: 'order_id',
      goodsInfoList: 'goods_info_list',
      adInfoList: 'ad_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      accountId: 'string',
      orderId: 'string',
      goodsInfoList: { 'type': 'array', 'itemType': IPCodeGoodsInfo },
      adInfoList: { 'type': 'array', 'itemType': IPCodeAdvertisingInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SetIpCodeinfoResponse extends $tea.Model {
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

export class PagequeryIpGalleryinstructionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础参数
  baseRequest: BaseRequestInfo;
  // 账户链上ID
  accountId: string;
  // 授权订单ID
  ipOrderId: string;
  // 页码
  pageNumber: number;
  // 每页数据量大小
  pageSize: number;
  // 数据排序顺序：正序还是倒序。默认按照下载时间排序。
  order: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      accountId: 'account_id',
      ipOrderId: 'ip_order_id',
      pageNumber: 'page_number',
      pageSize: 'page_size',
      order: 'order',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      accountId: 'string',
      ipOrderId: 'string',
      pageNumber: 'number',
      pageSize: 'number',
      order: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PagequeryIpGalleryinstructionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 页码
  pageNumber?: number;
  // 每页数据量大小
  pageSize?: number;
  // 符合条件的数据总数
  totalCount?: number;
  // 图库系在记录信息
  galleryInstructionList?: IPGalleryInstruction[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageNumber: 'page_number',
      pageSize: 'page_size',
      totalCount: 'total_count',
      galleryInstructionList: 'gallery_instruction_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pageNumber: 'number',
      pageSize: 'number',
      totalCount: 'number',
      galleryInstructionList: { 'type': 'array', 'itemType': IPGalleryInstruction },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmIpOrdergalleryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础参数
  baseRequest: BaseRequestInfo;
  // 版权方账户链上ID
  accountId: string;
  // 授权订单ID
  ipOrderId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      accountId: 'account_id',
      ipOrderId: 'ip_order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      accountId: 'string',
      ipOrderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmIpOrdergalleryResponse extends $tea.Model {
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

export class ConfirmIpAuthtradeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础请求参数
  baseRequest: BaseRequestInfo;
  // 审核账户ID
  accountId: string;
  // 授权订单ID
  ipOrderId: string;
  // 是否同意授权
  confirmResult: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      accountId: 'account_id',
      ipOrderId: 'ip_order_id',
      confirmResult: 'confirm_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      accountId: 'string',
      ipOrderId: 'string',
      confirmResult: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmIpAuthtradeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单ID
  ipOrderId?: string;
  // 保底金支付链接
  payUrl?: string;
  // 保底金账单ID
  ipBillId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      ipOrderId: 'ip_order_id',
      payUrl: 'pay_url',
      ipBillId: 'ip_bill_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      ipOrderId: 'string',
      payUrl: 'string',
      ipBillId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmIpPackagetradeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础请求参数
  baseRequest: BaseRequestInfo;
  // 审核账户ID
  accountId: string;
  // 授权订单ID
  ipOrderId: string;
  // 是否同意授权
  // 
  confirmResult: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      accountId: 'account_id',
      ipOrderId: 'ip_order_id',
      confirmResult: 'confirm_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      accountId: 'string',
      ipOrderId: 'string',
      confirmResult: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmIpPackagetradeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单ID
  ipOrderId?: string;
  // 保底金支付链接
  payUrl?: string;
  // 保底金账单ID
  ipBillId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      ipOrderId: 'ip_order_id',
      payUrl: 'pay_url',
      ipBillId: 'ip_bill_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      ipOrderId: 'string',
      payUrl: 'string',
      ipBillId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyIpPackagetradeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础参数
  baseRequest: BaseRequestInfo;
  // 买方的链上账户Id
  accountId: string;
  // IP授权交易时传入IP ID；增值服务交易时传入服务ID
  ipId: string;
  // true 只上链不走真实支付，false 上链并链下真实支付账单
  onlyCallBlockchain: boolean;
  // 终端商品价格区间
  priceRange: string;
  // 套餐中包含终端商品数量
  amount: number;
  // 套餐交易应付金额，单位元，保留两位小数
  expectedTotalPrice: string;
  // 授权合作开始期限（毫秒时间戳）
  authBeginTime: number;
  // 授权合作结束期限（毫秒时间戳）
  authEndTime: number;
  // 备注信息
  memo: string;
  // 授权产品范围
  authProductScope?: string;
  // 授权地域范围
  authAreaScope?: string;
  // 商品销售渠道
  salesChannel?: string;
  // 0 IP交易，1 增值服务交易
  goodsType?: number;
  // 增值服务交易绑定的ip授权交易订单，增值服务交易必填
  relatedOrderId?: string;
  // 支付完成后的回调地址。如果为空，默认跳转到https://ipforce.cloud.alipay.com/
  payReturnUrl?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      accountId: 'account_id',
      ipId: 'ip_id',
      onlyCallBlockchain: 'only_call_blockchain',
      priceRange: 'price_range',
      amount: 'amount',
      expectedTotalPrice: 'expected_total_price',
      authBeginTime: 'auth_begin_time',
      authEndTime: 'auth_end_time',
      memo: 'memo',
      authProductScope: 'auth_product_scope',
      authAreaScope: 'auth_area_scope',
      salesChannel: 'sales_channel',
      goodsType: 'goods_type',
      relatedOrderId: 'related_order_id',
      payReturnUrl: 'pay_return_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      accountId: 'string',
      ipId: 'string',
      onlyCallBlockchain: 'boolean',
      priceRange: 'string',
      amount: 'number',
      expectedTotalPrice: 'string',
      authBeginTime: 'number',
      authEndTime: 'number',
      memo: 'string',
      authProductScope: 'string',
      authAreaScope: 'string',
      salesChannel: 'string',
      goodsType: 'number',
      relatedOrderId: 'string',
      payReturnUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyIpPackagetradeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单ID
  ipOrderId?: string;
  // 支付信息
  payUrl?: string;
  // 账单ID
  // 
  ipBillId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      ipOrderId: 'ip_order_id',
      payUrl: 'pay_url',
      ipBillId: 'ip_bill_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      ipOrderId: 'string',
      payUrl: 'string',
      ipBillId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyIpAuthtradeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础请求参数
  baseRequest: BaseRequestInfo;
  // 采购者的链上账户Id
  accountId: string;
  // IP授权交易时传入IP ID；增值服务交易时传入服务ID
  ipId: string;
  // 收费模式：0 销售抽佣, 1 按量付费
  chargeType?: number;
  // 授权计费比例
  authRate?: string;
  // 按量付费的收费单价（按量付费模式必填）
  authPrice?: string;
  // 授权合作开始期限（毫秒时间戳）
  authBeginTime: number;
  // 授权合作结束期限（毫秒时间戳）
  authEndTime: number;
  // 合同（文件URL）
  contract?: string;
  // 设计稿（文件URL）
  designDraft?: string;
  // 授权产品范围
  authProductScope?: string;
  // 授权地域范围
  authAreaScope?: string;
  // 商品销售渠道
  salesChannel?: string;
  // 备注消息(不超过256个字符)
  memo: string;
  // 是否有保底金
  guaranteed: boolean;
  // 支付的保底金金额
  guaranteedFund?: string;
  // 保底商品个数（按量付费），订单销售数量超过保底部分需按量付费
  guaranteedGoodsAmount?: number;
  // 保底商品销售金额（销售抽佣），订单销售额超过保底部分需按比例抽拥
  guaranteedSales?: string;
  // 0 IP交易，1 增值服务交易
  goodsType?: number;
  // 增值服务交易绑定的ip授权交易订单，增值服务交易必填
  relatedOrderId?: string;
  // 支付完成后的回调地址。如果为空，默认跳转到https://ipforce.cloud.alipay.com/
  payReturnUrl?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      accountId: 'account_id',
      ipId: 'ip_id',
      chargeType: 'charge_type',
      authRate: 'auth_rate',
      authPrice: 'auth_price',
      authBeginTime: 'auth_begin_time',
      authEndTime: 'auth_end_time',
      contract: 'contract',
      designDraft: 'design_draft',
      authProductScope: 'auth_product_scope',
      authAreaScope: 'auth_area_scope',
      salesChannel: 'sales_channel',
      memo: 'memo',
      guaranteed: 'guaranteed',
      guaranteedFund: 'guaranteed_fund',
      guaranteedGoodsAmount: 'guaranteed_goods_amount',
      guaranteedSales: 'guaranteed_sales',
      goodsType: 'goods_type',
      relatedOrderId: 'related_order_id',
      payReturnUrl: 'pay_return_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      accountId: 'string',
      ipId: 'string',
      chargeType: 'number',
      authRate: 'string',
      authPrice: 'string',
      authBeginTime: 'number',
      authEndTime: 'number',
      contract: 'string',
      designDraft: 'string',
      authProductScope: 'string',
      authAreaScope: 'string',
      salesChannel: 'string',
      memo: 'string',
      guaranteed: 'boolean',
      guaranteedFund: 'string',
      guaranteedGoodsAmount: 'number',
      guaranteedSales: 'string',
      goodsType: 'number',
      relatedOrderId: 'string',
      payReturnUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyIpAuthtradeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单ID
  ipOrderId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      ipOrderId: 'ip_order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      ipOrderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIpCodeinfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础请求参数
  baseRequest: BaseRequestInfo;
  // 账户链上ID
  accountId: string;
  // 订单ID
  orderId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      accountId: 'account_id',
      orderId: 'order_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      accountId: 'string',
      orderId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryIpCodeinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 订单ID
  orderId?: string;
  // 正版码商品信息配置列表
  goodsInfoList?: IPCodeGoodsInfo[];
  // 正版码资源位配置信息列表
  adInfoList?: IPCodeAdvertisingInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      orderId: 'order_id',
      goodsInfoList: 'goods_info_list',
      adInfoList: 'ad_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      orderId: 'string',
      goodsInfoList: { 'type': 'array', 'itemType': IPCodeGoodsInfo },
      adInfoList: { 'type': 'array', 'itemType': IPCodeAdvertisingInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryIpApprovalwithupdateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 基础字段
  baseRequest: BaseRequestInfo;
  // ip名称
  ipName?: string;
  // ip的id
  ipId?: string;
  // ip审批状态 0待审批，1 审批通过，2 审批拒绝
  approvalStatus?: number;
  // 分页
  pageSize: number;
  // 分页
  pageIndex: number;
  // ip类型
  ipType?: string;
  // 受众人群
  audienceGroup?: string;
  // 开始时间
  createBeginTime: string;
  // 结束时间
  createEndTime: string;
  // 商品的链上租户id	
  accountId?: string;
  // 是否需要按照创建时间倒序排序
  // 
  isCreateTimeSortDesc: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      baseRequest: 'base_request',
      ipName: 'ip_name',
      ipId: 'ip_id',
      approvalStatus: 'approval_status',
      pageSize: 'page_size',
      pageIndex: 'page_index',
      ipType: 'ip_type',
      audienceGroup: 'audience_group',
      createBeginTime: 'create_begin_time',
      createEndTime: 'create_end_time',
      accountId: 'account_id',
      isCreateTimeSortDesc: 'is_create_time_sort_desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      baseRequest: BaseRequestInfo,
      ipName: 'string',
      ipId: 'string',
      approvalStatus: 'number',
      pageSize: 'number',
      pageIndex: 'number',
      ipType: 'string',
      audienceGroup: 'string',
      createBeginTime: 'string',
      createEndTime: 'string',
      accountId: 'string',
      isCreateTimeSortDesc: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryIpApprovalwithupdateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 带上更新信息
  ipList?: IpBasicInfoWithUpdate[];
  // 总数
  allCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      ipList: 'ip_list',
      allCount: 'all_count',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      ipList: { 'type': 'array', 'itemType': IpBasicInfoWithUpdate },
      allCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBlockanalysisBlockRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 区块高度
  blockNumber: number;
  // 链ID
  chainId: string;
  // 代理查询区块信息，传入代理租户需有代理权限。接口会返回调用者和被代理租户能查看的所有交易信息。
  delegatedTenantIds?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      blockNumber: 'block_number',
      chainId: 'chain_id',
      delegatedTenantIds: 'delegated_tenant_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      blockNumber: 'number',
      chainId: 'string',
      delegatedTenantIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBlockanalysisBlockResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class QueryBlockanalysisLastblocknumberRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBlockanalysisLastblocknumberResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class QueryBlockanalysisOpenedequitiesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 每页数据量
  count?: number;
  // 页数
  page?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      count: 'count',
      page: 'page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      count: 'number',
      page: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBlockanalysisOpenedequitiesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class QueryBlockanalysisUserpriceupdatedequitiesRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 每页数量
  count?: number;
  // 页码
  page?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      count: 'count',
      page: 'page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      count: 'number',
      page: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBlockanalysisUserpriceupdatedequitiesResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class QueryBlockanalysisUnwriteoffvalueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资产ID
  assetId: string;
  // 链ID
  chainId: string;
  // 要查询的租户ID
  optTenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      assetId: 'asset_id',
      chainId: 'chain_id',
      optTenantId: 'opt_tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      assetId: 'string',
      chainId: 'string',
      optTenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBlockanalysisUnwriteoffvalueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class UpdateBlockanalysisDelegaterelationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 被代理的租户ID
  delegatedTenantId: string;
  // 代理租户ID
  optTenantId: string;
  // 操作类型，ADD表示添加，SUB表示撤销
  optType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      delegatedTenantId: 'delegated_tenant_id',
      optTenantId: 'opt_tenant_id',
      optType: 'opt_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      delegatedTenantId: 'string',
      optTenantId: 'string',
      optType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBlockanalysisDelegaterelationResponse extends $tea.Model {
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

export class UpdateBlockanalysisWhitelistRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 租户ID
  optTenantId: string;
  // 操作类型
  optType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      optTenantId: 'opt_tenant_id',
      optType: 'opt_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      optTenantId: 'string',
      optType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBlockanalysisWhitelistResponse extends $tea.Model {
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

export class QueryBlockanalysisDelegaterelationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 被代理的租户ID
  delegatedTenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      delegatedTenantId: 'delegated_tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      delegatedTenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBlockanalysisDelegaterelationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class QueryBlockanalysisWhitelistRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 查询该租户的白名单信息
  tenantId?: string;
  // 查询链的白名单信息
  chainId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tenantId: 'tenant_id',
      chainId: 'chain_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tenantId: 'string',
      chainId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBlockanalysisWhitelistResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class QueryBlockanalysisTransactionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 交易hash
  txHash: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBlockanalysisTransactionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class QueryBlockanalysisEquityauthlistRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 分页查询每页数量
  count: number;
  // 商品ID
  equityId: string;
  // 分页查询页码
  page: number;
  // 代理租户ID
  delegatedTenantId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      count: 'count',
      equityId: 'equity_id',
      page: 'page',
      delegatedTenantId: 'delegated_tenant_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      count: 'number',
      equityId: 'string',
      page: 'number',
      delegatedTenantId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBlockanalysisEquityauthlistResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 商品授权信息（一客一价信息）列表
  equityAuthList?: EquityAuthInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      equityAuthList: 'equity_auth_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      equityAuthList: { 'type': 'array', 'itemType': EquityAuthInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBlockanalysisNextblockRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 区块高度
  blockNumber: number;
  // 链ID
  chainId: string;
  // 代理查询区块信息，传入代理租户需有代理权限。接口会返回调用者和被代理租户能查看的所有交易信息。
  delegatedTenantIds?: string[];
  // 查询区块超时时间，单位s，范围小于6s
  timeout: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      blockNumber: 'block_number',
      chainId: 'chain_id',
      delegatedTenantIds: 'delegated_tenant_ids',
      timeout: 'timeout',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      blockNumber: 'number',
      chainId: 'string',
      delegatedTenantIds: { 'type': 'array', 'itemType': 'string' },
      timeout: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBlockanalysisNextblockResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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
  // 下一个需要检查的高度
  nextBlockNumber?: number;
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
      nextBlockNumber: 'next_block_number',
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
      nextBlockNumber: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMypointsSkuRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 区块链ID
  chainId: string;
  // 环境标识
  env: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      env: 'env',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      env: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMypointsSkuResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class QueryMypointsMerchantbalanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 环境标识
  env: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      chainId: 'chain_id',
      env: 'env',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      chainId: 'string',
      env: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryMypointsMerchantbalanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class ExecMypointsPreorderskuRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 预下单数量
  count: number;
  // 环境标识
  env: string;
  // 备注
  memo?: string;
  // 业务幂等号，商户需要保证每笔订单号唯一
  orderNo: string;
  // 商品ID
  skuId: string;
  // 总花费花费(询价接口结果) 
  totalCost: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class ExecMypointsPreorderskuResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数量
  count?: number;
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
  // 是否需要重试
  needRetry?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      count: 'count',
      orderNo: 'order_no',
      preOrderId: 'pre_order_id',
      skuId: 'sku_id',
      totalAmount: 'total_amount',
      totalCost: 'total_cost',
      needRetry: 'need_retry',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      count: 'number',
      orderNo: 'string',
      preOrderId: 'string',
      skuId: 'string',
      totalAmount: 'number',
      totalCost: 'string',
      needRetry: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ExecMypointsOrderskuRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 环境标识
  env: string;
  // 业务幂等号
  orderNo: string;
  // 手机号
  phoneNumber: string;
  // 预下单号
  preOrderId: string;
  // 商品ID
  skuId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class ExecMypointsOrderskuResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class QueryMypointsSkufeeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 预下单数量
  count: number;
  // 环境标识(sandbox/prod)
  env: string;
  // 备注信息
  memo?: string;
  // 业务幂等号
  orderNo: string;
  // 商品ID
  skuId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class QueryMypointsSkufeeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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

export class QueryMypointsPreorderinstructionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 环境标识
  env: string;
  // 业务幂等ID
  orderNo: string;
  // 商品ID
  skuId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class QueryMypointsPreorderinstructionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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
  // 集分宝产品码
  productCode?: string;
  // 集分宝SKU预下单ID
  preOrderId?: string;
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
      productCode: 'product_code',
      preOrderId: 'pre_order_id',
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
      productCode: 'string',
      preOrderId: 'string',
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

export class QueryMypointsOrderinstructionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链ID
  chainId: string;
  // 环境标识
  env: string;
  // 业务幂等号
  orderNo: string;
  // SKU ID
  skuId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
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

export class QueryMypointsOrderinstructionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
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
          sdk_version: "1.2.54",
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
   * Description: 创建卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-电子券卡密服务-创建卡密
   */
  async execCardCreate(request: ExecCardCreateRequest): Promise<ExecCardCreateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execCardCreateEx(request, headers, runtime);
  }

  /**
   * Description: 创建卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-电子券卡密服务-创建卡密
   */
  async execCardCreateEx(request: ExecCardCreateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecCardCreateResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecCardCreateResponse>(await this.doRequest("1.0", "baas.antdao.card.create.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecCardCreateResponse({}));
  }

  /**
   * Description: 查询卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-电子券卡密服务-查询卡密
   */
  async execCardQuery(request: ExecCardQueryRequest): Promise<ExecCardQueryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execCardQueryEx(request, headers, runtime);
  }

  /**
   * Description: 查询卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-电子券卡密服务-查询卡密
   */
  async execCardQueryEx(request: ExecCardQueryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecCardQueryResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecCardQueryResponse>(await this.doRequest("1.0", "baas.antdao.card.query.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecCardQueryResponse({}));
  }

  /**
   * Description: 记名卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-电子券卡密服务-记名卡发行
   */
  async execCardBindname(request: ExecCardBindnameRequest): Promise<ExecCardBindnameResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execCardBindnameEx(request, headers, runtime);
  }

  /**
   * Description: 记名卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-电子券卡密服务-记名卡发行
   */
  async execCardBindnameEx(request: ExecCardBindnameRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecCardBindnameResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecCardBindnameResponse>(await this.doRequest("1.0", "baas.antdao.card.bindname.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecCardBindnameResponse({}));
  }

  /**
   * Description: 充值卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-电子券卡密服务-充值卡密
   */
  async execCardCharge(request: ExecCardChargeRequest): Promise<ExecCardChargeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execCardChargeEx(request, headers, runtime);
  }

  /**
   * Description: 充值卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-电子券卡密服务-充值卡密
   */
  async execCardChargeEx(request: ExecCardChargeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecCardChargeResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecCardChargeResponse>(await this.doRequest("1.0", "baas.antdao.card.charge.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecCardChargeResponse({}));
  }

  /**
   * Description: 核销卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-电子券卡密服务-核销卡密
   */
  async execCardWriteoff(request: ExecCardWriteoffRequest): Promise<ExecCardWriteoffResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execCardWriteoffEx(request, headers, runtime);
  }

  /**
   * Description: 核销卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-电子券卡密服务-核销卡密
   */
  async execCardWriteoffEx(request: ExecCardWriteoffRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecCardWriteoffResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecCardWriteoffResponse>(await this.doRequest("1.0", "baas.antdao.card.writeoff.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecCardWriteoffResponse({}));
  }

  /**
   * Description: 过期卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-电子券卡密服务-过期卡密
   */
  async execCardExpired(request: ExecCardExpiredRequest): Promise<ExecCardExpiredResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execCardExpiredEx(request, headers, runtime);
  }

  /**
   * Description: 过期卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-电子券卡密服务-过期卡密
   */
  async execCardExpiredEx(request: ExecCardExpiredRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecCardExpiredResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecCardExpiredResponse>(await this.doRequest("1.0", "baas.antdao.card.expired.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecCardExpiredResponse({}));
  }

  /**
   * Description: 风控禁用卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-电子券卡密服务-风控禁用
   */
  async execCardForbidden(request: ExecCardForbiddenRequest): Promise<ExecCardForbiddenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execCardForbiddenEx(request, headers, runtime);
  }

  /**
   * Description: 风控禁用卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-电子券卡密服务-风控禁用
   */
  async execCardForbiddenEx(request: ExecCardForbiddenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecCardForbiddenResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecCardForbiddenResponse>(await this.doRequest("1.0", "baas.antdao.card.forbidden.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecCardForbiddenResponse({}));
  }

  /**
   * Description: 充值重置卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-电子券卡密服务-充值重置
   */
  async execCardChargereset(request: ExecCardChargeresetRequest): Promise<ExecCardChargeresetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execCardChargeresetEx(request, headers, runtime);
  }

  /**
   * Description: 充值重置卡密，卡密托管服务调用，需要传入交易的签名
   * Summary: 数字商品服务-电子券卡密服务-充值重置
   */
  async execCardChargeresetEx(request: ExecCardChargeresetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecCardChargeresetResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecCardChargeresetResponse>(await this.doRequest("1.0", "baas.antdao.card.chargereset.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecCardChargeresetResponse({}));
  }

  /**
   * Description: 个人或机构账户注册
   * Summary: 数字商品服务-消费卡服务-个人/机构注册
   */
  async createConsumecardAccount(request: CreateConsumecardAccountRequest): Promise<CreateConsumecardAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createConsumecardAccountEx(request, headers, runtime);
  }

  /**
   * Description: 个人或机构账户注册
   * Summary: 数字商品服务-消费卡服务-个人/机构注册
   */
  async createConsumecardAccountEx(request: CreateConsumecardAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateConsumecardAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateConsumecardAccountResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.account.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateConsumecardAccountResponse({}));
  }

  /**
   * Description: 个人/机构账户注销
   * Summary: 数字商品服务-消费卡服务-个人/机构注销
   */
  async offlineConsumecardAccount(request: OfflineConsumecardAccountRequest): Promise<OfflineConsumecardAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.offlineConsumecardAccountEx(request, headers, runtime);
  }

  /**
   * Description: 个人/机构账户注销
   * Summary: 数字商品服务-消费卡服务-个人/机构注销
   */
  async offlineConsumecardAccountEx(request: OfflineConsumecardAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OfflineConsumecardAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<OfflineConsumecardAccountResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.account.offline", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OfflineConsumecardAccountResponse({}));
  }

  /**
   * Description: 企业消费卡余额回退
   * Summary: 数字商品服务-消费卡服务-企业消费卡回退
   */
  async reclaimConsumecardWallet(request: ReclaimConsumecardWalletRequest): Promise<ReclaimConsumecardWalletResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.reclaimConsumecardWalletEx(request, headers, runtime);
  }

  /**
   * Description: 企业消费卡余额回退
   * Summary: 数字商品服务-消费卡服务-企业消费卡回退
   */
  async reclaimConsumecardWalletEx(request: ReclaimConsumecardWalletRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReclaimConsumecardWalletResponse> {
    Util.validateModel(request);
    return $tea.cast<ReclaimConsumecardWalletResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.wallet.reclaim", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReclaimConsumecardWalletResponse({}));
  }

  /**
   * Description: 个人/机构账户禁用
   * Summary: 数字商品服务-消费卡服务-账户禁用
   */
  async freezeConsumecardAccount(request: FreezeConsumecardAccountRequest): Promise<FreezeConsumecardAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.freezeConsumecardAccountEx(request, headers, runtime);
  }

  /**
   * Description: 个人/机构账户禁用
   * Summary: 数字商品服务-消费卡服务-账户禁用
   */
  async freezeConsumecardAccountEx(request: FreezeConsumecardAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<FreezeConsumecardAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<FreezeConsumecardAccountResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.account.freeze", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new FreezeConsumecardAccountResponse({}));
  }

  /**
   * Description: 个人/机构账户解禁
   * Summary: 数字商品服务-消费卡服务-账户解禁
   */
  async unfreezeConsumecardAccount(request: UnfreezeConsumecardAccountRequest): Promise<UnfreezeConsumecardAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.unfreezeConsumecardAccountEx(request, headers, runtime);
  }

  /**
   * Description: 个人/机构账户解禁
   * Summary: 数字商品服务-消费卡服务-账户解禁
   */
  async unfreezeConsumecardAccountEx(request: UnfreezeConsumecardAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UnfreezeConsumecardAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<UnfreezeConsumecardAccountResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.account.unfreeze", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UnfreezeConsumecardAccountResponse({}));
  }

  /**
   * Description: 消费卡风控调整(特殊权限,暂不开放)
   * Summary: 数字商品服务-消费卡服务-消费卡风控调整
   */
  async updateConsumecardRiskcontrol(request: UpdateConsumecardRiskcontrolRequest): Promise<UpdateConsumecardRiskcontrolResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateConsumecardRiskcontrolEx(request, headers, runtime);
  }

  /**
   * Description: 消费卡风控调整(特殊权限,暂不开放)
   * Summary: 数字商品服务-消费卡服务-消费卡风控调整
   */
  async updateConsumecardRiskcontrolEx(request: UpdateConsumecardRiskcontrolRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateConsumecardRiskcontrolResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateConsumecardRiskcontrolResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.riskcontrol.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateConsumecardRiskcontrolResponse({}));
  }

  /**
   * Description: 账单查询
   * Summary: 数字商品服务-消费卡服务-账单查询
   */
  async queryConsumecardBill(request: QueryConsumecardBillRequest): Promise<QueryConsumecardBillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryConsumecardBillEx(request, headers, runtime);
  }

  /**
   * Description: 账单查询
   * Summary: 数字商品服务-消费卡服务-账单查询
   */
  async queryConsumecardBillEx(request: QueryConsumecardBillRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryConsumecardBillResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryConsumecardBillResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.bill.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryConsumecardBillResponse({}));
  }

  /**
   * Description: 企业消费卡充值冻结
   * Summary: 数字商品服务-消费卡服务-消费卡充值冻结
   */
  async chargeConsumecardWallet(request: ChargeConsumecardWalletRequest): Promise<ChargeConsumecardWalletResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.chargeConsumecardWalletEx(request, headers, runtime);
  }

  /**
   * Description: 企业消费卡充值冻结
   * Summary: 数字商品服务-消费卡服务-消费卡充值冻结
   */
  async chargeConsumecardWalletEx(request: ChargeConsumecardWalletRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ChargeConsumecardWalletResponse> {
    Util.validateModel(request);
    return $tea.cast<ChargeConsumecardWalletResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.wallet.charge", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ChargeConsumecardWalletResponse({}));
  }

  /**
   * Description: 更账户信息
   * Summary: 数字商品服务-消费卡服务-更新账户
   */
  async updateConsumecardAccount(request: UpdateConsumecardAccountRequest): Promise<UpdateConsumecardAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateConsumecardAccountEx(request, headers, runtime);
  }

  /**
   * Description: 更账户信息
   * Summary: 数字商品服务-消费卡服务-更新账户
   */
  async updateConsumecardAccountEx(request: UpdateConsumecardAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateConsumecardAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateConsumecardAccountResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.account.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateConsumecardAccountResponse({}));
  }

  /**
   * Description: 账单创建
   * Summary: 数字商品服务-消费卡服务-账单创建
   */
  async createConsumecardBill(request: CreateConsumecardBillRequest): Promise<CreateConsumecardBillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createConsumecardBillEx(request, headers, runtime);
  }

  /**
   * Description: 账单创建
   * Summary: 数字商品服务-消费卡服务-账单创建
   */
  async createConsumecardBillEx(request: CreateConsumecardBillRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateConsumecardBillResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateConsumecardBillResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.bill.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateConsumecardBillResponse({}));
  }

  /**
   * Description: 账单创建确认成功或失败
   * Summary: 数字商品服务-消费卡服务-账单创建确认
   */
  async confirmConsumecardBillcreate(request: ConfirmConsumecardBillcreateRequest): Promise<ConfirmConsumecardBillcreateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmConsumecardBillcreateEx(request, headers, runtime);
  }

  /**
   * Description: 账单创建确认成功或失败
   * Summary: 数字商品服务-消费卡服务-账单创建确认
   */
  async confirmConsumecardBillcreateEx(request: ConfirmConsumecardBillcreateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmConsumecardBillcreateResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmConsumecardBillcreateResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.billcreate.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmConsumecardBillcreateResponse({}));
  }

  /**
   * Description: 账单取消
   * Summary: 数字商品服务-消费卡服务-取消账单
   */
  async cancelConsumecardBill(request: CancelConsumecardBillRequest): Promise<CancelConsumecardBillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelConsumecardBillEx(request, headers, runtime);
  }

  /**
   * Description: 账单取消
   * Summary: 数字商品服务-消费卡服务-取消账单
   */
  async cancelConsumecardBillEx(request: CancelConsumecardBillRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelConsumecardBillResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelConsumecardBillResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.bill.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelConsumecardBillResponse({}));
  }

  /**
   * Description: 账单支付
   * Summary: 数字商品服务-消费卡服务-账单支付
   */
  async execConsumecardBillpay(request: ExecConsumecardBillpayRequest): Promise<ExecConsumecardBillpayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execConsumecardBillpayEx(request, headers, runtime);
  }

  /**
   * Description: 账单支付
   * Summary: 数字商品服务-消费卡服务-账单支付
   */
  async execConsumecardBillpayEx(request: ExecConsumecardBillpayRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecConsumecardBillpayResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecConsumecardBillpayResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.billpay.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecConsumecardBillpayResponse({}));
  }

  /**
   * Description: 账单核销和交易核销，传入交易类型和订单Id
   * Summary: 数字商品服务-消费卡服务-账单和交易核销
   */
  async execConsumecardOrderwriteoff(request: ExecConsumecardOrderwriteoffRequest): Promise<ExecConsumecardOrderwriteoffResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execConsumecardOrderwriteoffEx(request, headers, runtime);
  }

  /**
   * Description: 账单核销和交易核销，传入交易类型和订单Id
   * Summary: 数字商品服务-消费卡服务-账单和交易核销
   */
  async execConsumecardOrderwriteoffEx(request: ExecConsumecardOrderwriteoffRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecConsumecardOrderwriteoffResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecConsumecardOrderwriteoffResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.orderwriteoff.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecConsumecardOrderwriteoffResponse({}));
  }

  /**
   * Description: 处理买家的退款申请，接受退款或者拒绝退款
   * Summary: 数字商品服务-消费卡服务-账单退款处理
   */
  async confirmConsumecardBillrefund(request: ConfirmConsumecardBillrefundRequest): Promise<ConfirmConsumecardBillrefundResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmConsumecardBillrefundEx(request, headers, runtime);
  }

  /**
   * Description: 处理买家的退款申请，接受退款或者拒绝退款
   * Summary: 数字商品服务-消费卡服务-账单退款处理
   */
  async confirmConsumecardBillrefundEx(request: ConfirmConsumecardBillrefundRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmConsumecardBillrefundResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmConsumecardBillrefundResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.billrefund.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmConsumecardBillrefundResponse({}));
  }

  /**
   * Description: 查询账户信息
   * Summary: 数字商品服务-消费卡服务-查询账户信息
   */
  async queryConsumecardAccount(request: QueryConsumecardAccountRequest): Promise<QueryConsumecardAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryConsumecardAccountEx(request, headers, runtime);
  }

  /**
   * Description: 查询账户信息
   * Summary: 数字商品服务-消费卡服务-查询账户信息
   */
  async queryConsumecardAccountEx(request: QueryConsumecardAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryConsumecardAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryConsumecardAccountResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.account.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryConsumecardAccountResponse({}));
  }

  /**
   * Description: 开通钱包
   * Summary: 数字商品服务-消费卡服务-开通钱包
   */
  async openConsumecardWallet(request: OpenConsumecardWalletRequest): Promise<OpenConsumecardWalletResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.openConsumecardWalletEx(request, headers, runtime);
  }

  /**
   * Description: 开通钱包
   * Summary: 数字商品服务-消费卡服务-开通钱包
   */
  async openConsumecardWalletEx(request: OpenConsumecardWalletRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OpenConsumecardWalletResponse> {
    Util.validateModel(request);
    return $tea.cast<OpenConsumecardWalletResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.wallet.open", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OpenConsumecardWalletResponse({}));
  }

  /**
   * Description: 查询钱包信息
   * Summary: 数字商品服务-消费卡服务-查询钱包
   */
  async queryConsumecardWallet(request: QueryConsumecardWalletRequest): Promise<QueryConsumecardWalletResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryConsumecardWalletEx(request, headers, runtime);
  }

  /**
   * Description: 查询钱包信息
   * Summary: 数字商品服务-消费卡服务-查询钱包
   */
  async queryConsumecardWalletEx(request: QueryConsumecardWalletRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryConsumecardWalletResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryConsumecardWalletResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.wallet.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryConsumecardWalletResponse({}));
  }

  /**
   * Description: 充值并兑换token,资金托管员权限,运营平台无权限。
   * Summary: 数字商品服务-消费卡服务-充值并兑换资产
   */
  async execConsumecardWalletchargetotoken(request: ExecConsumecardWalletchargetotokenRequest): Promise<ExecConsumecardWalletchargetotokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execConsumecardWalletchargetotokenEx(request, headers, runtime);
  }

  /**
   * Description: 充值并兑换token,资金托管员权限,运营平台无权限。
   * Summary: 数字商品服务-消费卡服务-充值并兑换资产
   */
  async execConsumecardWalletchargetotokenEx(request: ExecConsumecardWalletchargetotokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecConsumecardWalletchargetotokenResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecConsumecardWalletchargetotokenResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.walletchargetotoken.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecConsumecardWalletchargetotokenResponse({}));
  }

  /**
   * Description: 湮灭自己发行的token并提现
   * Summary: 数字商品服务-消费卡服务-湮灭资产并提现
   */
  async execConsumecardWalletredeemtoken(request: ExecConsumecardWalletredeemtokenRequest): Promise<ExecConsumecardWalletredeemtokenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execConsumecardWalletredeemtokenEx(request, headers, runtime);
  }

  /**
   * Description: 湮灭自己发行的token并提现
   * Summary: 数字商品服务-消费卡服务-湮灭资产并提现
   */
  async execConsumecardWalletredeemtokenEx(request: ExecConsumecardWalletredeemtokenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecConsumecardWalletredeemtokenResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecConsumecardWalletredeemtokenResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.walletredeemtoken.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecConsumecardWalletredeemtokenResponse({}));
  }

  /**
   * Description: 买家发起交易
   * Summary: 数字商品服务-消费卡服务-买家发起交易
   */
  async startConsumecardPurchase(request: StartConsumecardPurchaseRequest): Promise<StartConsumecardPurchaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startConsumecardPurchaseEx(request, headers, runtime);
  }

  /**
   * Description: 买家发起交易
   * Summary: 数字商品服务-消费卡服务-买家发起交易
   */
  async startConsumecardPurchaseEx(request: StartConsumecardPurchaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartConsumecardPurchaseResponse> {
    Util.validateModel(request);
    return $tea.cast<StartConsumecardPurchaseResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.purchase.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartConsumecardPurchaseResponse({}));
  }

  /**
   * Description: 取消交易，买家发起
   * Summary: 数字商品服务-消费卡服务-买家取消交易
   */
  async cancelConsumecardBuyerpurchase(request: CancelConsumecardBuyerpurchaseRequest): Promise<CancelConsumecardBuyerpurchaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelConsumecardBuyerpurchaseEx(request, headers, runtime);
  }

  /**
   * Description: 取消交易，买家发起
   * Summary: 数字商品服务-消费卡服务-买家取消交易
   */
  async cancelConsumecardBuyerpurchaseEx(request: CancelConsumecardBuyerpurchaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelConsumecardBuyerpurchaseResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelConsumecardBuyerpurchaseResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.buyerpurchase.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelConsumecardBuyerpurchaseResponse({}));
  }

  /**
   * Description: 买家申请退款
   * Summary: 数字商品服务-消费卡服务-买家申请退款
   */
  async applyConsumecardPurchaserefund(request: ApplyConsumecardPurchaserefundRequest): Promise<ApplyConsumecardPurchaserefundResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyConsumecardPurchaserefundEx(request, headers, runtime);
  }

  /**
   * Description: 买家申请退款
   * Summary: 数字商品服务-消费卡服务-买家申请退款
   */
  async applyConsumecardPurchaserefundEx(request: ApplyConsumecardPurchaserefundRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyConsumecardPurchaserefundResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyConsumecardPurchaserefundResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.purchaserefund.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyConsumecardPurchaserefundResponse({}));
  }

  /**
   * Description: 买家申请售后
   * Summary: 数字商品服务-消费卡服务-买家申请售后
   */
  async applyConsumecardPurchasereplace(request: ApplyConsumecardPurchasereplaceRequest): Promise<ApplyConsumecardPurchasereplaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyConsumecardPurchasereplaceEx(request, headers, runtime);
  }

  /**
   * Description: 买家申请售后
   * Summary: 数字商品服务-消费卡服务-买家申请售后
   */
  async applyConsumecardPurchasereplaceEx(request: ApplyConsumecardPurchasereplaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyConsumecardPurchasereplaceResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyConsumecardPurchasereplaceResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.purchasereplace.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyConsumecardPurchasereplaceResponse({}));
  }

  /**
   * Description: 买家确认收货
   * Summary: 数字商品服务-消费卡服务-买家确认收货
   */
  async execConsumecardPurchasereceive(request: ExecConsumecardPurchasereceiveRequest): Promise<ExecConsumecardPurchasereceiveResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execConsumecardPurchasereceiveEx(request, headers, runtime);
  }

  /**
   * Description: 买家确认收货
   * Summary: 数字商品服务-消费卡服务-买家确认收货
   */
  async execConsumecardPurchasereceiveEx(request: ExecConsumecardPurchasereceiveRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecConsumecardPurchasereceiveResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecConsumecardPurchasereceiveResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.purchasereceive.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecConsumecardPurchasereceiveResponse({}));
  }

  /**
   * Description: 卖家拒绝交易
   * Summary: 数字商品服务-消费卡服务-卖家拒绝交易
   */
  async refuseConsumecardPurchase(request: RefuseConsumecardPurchaseRequest): Promise<RefuseConsumecardPurchaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.refuseConsumecardPurchaseEx(request, headers, runtime);
  }

  /**
   * Description: 卖家拒绝交易
   * Summary: 数字商品服务-消费卡服务-卖家拒绝交易
   */
  async refuseConsumecardPurchaseEx(request: RefuseConsumecardPurchaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RefuseConsumecardPurchaseResponse> {
    Util.validateModel(request);
    return $tea.cast<RefuseConsumecardPurchaseResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.purchase.refuse", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RefuseConsumecardPurchaseResponse({}));
  }

  /**
   * Description: 卖家退款操作。可以同意退款和拒绝退款。
   * Summary: 数字商品服务-消费卡服务-卖家退款操作
   */
  async setConsumecardPurchaserefund(request: SetConsumecardPurchaserefundRequest): Promise<SetConsumecardPurchaserefundResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setConsumecardPurchaserefundEx(request, headers, runtime);
  }

  /**
   * Description: 卖家退款操作。可以同意退款和拒绝退款。
   * Summary: 数字商品服务-消费卡服务-卖家退款操作
   */
  async setConsumecardPurchaserefundEx(request: SetConsumecardPurchaserefundRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetConsumecardPurchaserefundResponse> {
    Util.validateModel(request);
    return $tea.cast<SetConsumecardPurchaserefundResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.purchaserefund.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetConsumecardPurchaserefundResponse({}));
  }

  /**
   * Description: 卖家换货操作。可以同意换货，拒绝换货
   * Summary: 数字商品服务-消费卡服务-卖家换货操作
   */
  async setConsumecardPurchasereplace(request: SetConsumecardPurchasereplaceRequest): Promise<SetConsumecardPurchasereplaceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setConsumecardPurchasereplaceEx(request, headers, runtime);
  }

  /**
   * Description: 卖家换货操作。可以同意换货，拒绝换货
   * Summary: 数字商品服务-消费卡服务-卖家换货操作
   */
  async setConsumecardPurchasereplaceEx(request: SetConsumecardPurchasereplaceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetConsumecardPurchasereplaceResponse> {
    Util.validateModel(request);
    return $tea.cast<SetConsumecardPurchasereplaceResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.purchasereplace.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetConsumecardPurchasereplaceResponse({}));
  }

  /**
   * Description: 卖家接单
   * Summary: 数字商品服务-消费卡服务-卖家接单
   */
  async confirmConsumecardPurchase(request: ConfirmConsumecardPurchaseRequest): Promise<ConfirmConsumecardPurchaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmConsumecardPurchaseEx(request, headers, runtime);
  }

  /**
   * Description: 卖家接单
   * Summary: 数字商品服务-消费卡服务-卖家接单
   */
  async confirmConsumecardPurchaseEx(request: ConfirmConsumecardPurchaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmConsumecardPurchaseResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmConsumecardPurchaseResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.purchase.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmConsumecardPurchaseResponse({}));
  }

  /**
   * Description: 卖家发货
   * Summary: 数字商品服务-消费卡服务-卖家发货
   */
  async sendConsumecardPurchase(request: SendConsumecardPurchaseRequest): Promise<SendConsumecardPurchaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendConsumecardPurchaseEx(request, headers, runtime);
  }

  /**
   * Description: 卖家发货
   * Summary: 数字商品服务-消费卡服务-卖家发货
   */
  async sendConsumecardPurchaseEx(request: SendConsumecardPurchaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendConsumecardPurchaseResponse> {
    Util.validateModel(request);
    return $tea.cast<SendConsumecardPurchaseResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.purchase.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendConsumecardPurchaseResponse({}));
  }

  /**
   * Description: 卖家售后补发货
   * Summary: 数字商品服务-消费卡服务-卖家售后补发货
   */
  async replaceConsumecardPurchase(request: ReplaceConsumecardPurchaseRequest): Promise<ReplaceConsumecardPurchaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.replaceConsumecardPurchaseEx(request, headers, runtime);
  }

  /**
   * Description: 卖家售后补发货
   * Summary: 数字商品服务-消费卡服务-卖家售后补发货
   */
  async replaceConsumecardPurchaseEx(request: ReplaceConsumecardPurchaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReplaceConsumecardPurchaseResponse> {
    Util.validateModel(request);
    return $tea.cast<ReplaceConsumecardPurchaseResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.purchase.replace", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReplaceConsumecardPurchaseResponse({}));
  }

  /**
   * Description: 发布商品
   * Summary: 数字商品服务-消费卡服务-发布商品
   */
  async createConsumecardGoods(request: CreateConsumecardGoodsRequest): Promise<CreateConsumecardGoodsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createConsumecardGoodsEx(request, headers, runtime);
  }

  /**
   * Description: 发布商品
   * Summary: 数字商品服务-消费卡服务-发布商品
   */
  async createConsumecardGoodsEx(request: CreateConsumecardGoodsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateConsumecardGoodsResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateConsumecardGoodsResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.goods.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateConsumecardGoodsResponse({}));
  }

  /**
   * Description: 更新商品信息
   * Summary: 数字商品服务-消费卡服务-更新商品信息
   */
  async updateConsumecardGoods(request: UpdateConsumecardGoodsRequest): Promise<UpdateConsumecardGoodsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateConsumecardGoodsEx(request, headers, runtime);
  }

  /**
   * Description: 更新商品信息
   * Summary: 数字商品服务-消费卡服务-更新商品信息
   */
  async updateConsumecardGoodsEx(request: UpdateConsumecardGoodsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateConsumecardGoodsResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateConsumecardGoodsResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.goods.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateConsumecardGoodsResponse({}));
  }

  /**
   * Description: 商品开放购买权限给指定账户
   * Summary: 数字商品服务-消费卡服务-开放购买权限
   */
  async openConsumecardGoodstocustom(request: OpenConsumecardGoodstocustomRequest): Promise<OpenConsumecardGoodstocustomResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.openConsumecardGoodstocustomEx(request, headers, runtime);
  }

  /**
   * Description: 商品开放购买权限给指定账户
   * Summary: 数字商品服务-消费卡服务-开放购买权限
   */
  async openConsumecardGoodstocustomEx(request: OpenConsumecardGoodstocustomRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OpenConsumecardGoodstocustomResponse> {
    Util.validateModel(request);
    return $tea.cast<OpenConsumecardGoodstocustomResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.goodstocustom.open", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OpenConsumecardGoodstocustomResponse({}));
  }

  /**
   * Description: 新增商品类别
   * Summary: 数字商品服务-消费卡服务-新增商品类别
   */
  async createConsumecardGoodscategory(request: CreateConsumecardGoodscategoryRequest): Promise<CreateConsumecardGoodscategoryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createConsumecardGoodscategoryEx(request, headers, runtime);
  }

  /**
   * Description: 新增商品类别
   * Summary: 数字商品服务-消费卡服务-新增商品类别
   */
  async createConsumecardGoodscategoryEx(request: CreateConsumecardGoodscategoryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateConsumecardGoodscategoryResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateConsumecardGoodscategoryResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.goodscategory.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateConsumecardGoodscategoryResponse({}));
  }

  /**
   * Description: 设置商品一客一价
   * Summary: 数字商品服务-消费卡服务-设置一客一价
   */
  async setConsumecardGoodscustomprice(request: SetConsumecardGoodscustompriceRequest): Promise<SetConsumecardGoodscustompriceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setConsumecardGoodscustompriceEx(request, headers, runtime);
  }

  /**
   * Description: 设置商品一客一价
   * Summary: 数字商品服务-消费卡服务-设置一客一价
   */
  async setConsumecardGoodscustompriceEx(request: SetConsumecardGoodscustompriceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetConsumecardGoodscustompriceResponse> {
    Util.validateModel(request);
    return $tea.cast<SetConsumecardGoodscustompriceResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.goodscustomprice.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetConsumecardGoodscustompriceResponse({}));
  }

  /**
   * Description: 上传图片获取URL
   * Summary: 数字商品服务-消费卡服务-上传图片
   */
  async uploadConsumecardGoodsimage(request: UploadConsumecardGoodsimageRequest): Promise<UploadConsumecardGoodsimageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadConsumecardGoodsimageEx(request, headers, runtime);
  }

  /**
   * Description: 上传图片获取URL
   * Summary: 数字商品服务-消费卡服务-上传图片
   */
  async uploadConsumecardGoodsimageEx(request: UploadConsumecardGoodsimageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadConsumecardGoodsimageResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadConsumecardGoodsimageResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.goodsimage.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadConsumecardGoodsimageResponse({}));
  }

  /**
   * Description: 机构订单提现试算
   * Summary: 数字商品服务-消费卡服务-企业提现试算
   */
  async execConsumecardOrdertrywithdraw(request: ExecConsumecardOrdertrywithdrawRequest): Promise<ExecConsumecardOrdertrywithdrawResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execConsumecardOrdertrywithdrawEx(request, headers, runtime);
  }

  /**
   * Description: 机构订单提现试算
   * Summary: 数字商品服务-消费卡服务-企业提现试算
   */
  async execConsumecardOrdertrywithdrawEx(request: ExecConsumecardOrdertrywithdrawRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecConsumecardOrdertrywithdrawResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecConsumecardOrdertrywithdrawResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.ordertrywithdraw.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecConsumecardOrdertrywithdrawResponse({}));
  }

  /**
   * Description: 机构订单提现(区块区间模式)，传入要提现的区块区间，提现该区间的交易
   * Summary: 数字商品服务-消费卡服务-根据区块提现
   */
  async execConsumecardOrderwithdrawbyblocknum(request: ExecConsumecardOrderwithdrawbyblocknumRequest): Promise<ExecConsumecardOrderwithdrawbyblocknumResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execConsumecardOrderwithdrawbyblocknumEx(request, headers, runtime);
  }

  /**
   * Description: 机构订单提现(区块区间模式)，传入要提现的区块区间，提现该区间的交易
   * Summary: 数字商品服务-消费卡服务-根据区块提现
   */
  async execConsumecardOrderwithdrawbyblocknumEx(request: ExecConsumecardOrderwithdrawbyblocknumRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecConsumecardOrderwithdrawbyblocknumResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecConsumecardOrderwithdrawbyblocknumResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.orderwithdrawbyblocknum.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecConsumecardOrderwithdrawbyblocknumResponse({}));
  }

  /**
   * Description: 机构订单提现(订单列表模式)，传入要提现的订单ID列表
   * Summary: 数字商品服务-消费卡服务-根据订单表提现
   */
  async execConsumecardOrderwithdrawbyids(request: ExecConsumecardOrderwithdrawbyidsRequest): Promise<ExecConsumecardOrderwithdrawbyidsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execConsumecardOrderwithdrawbyidsEx(request, headers, runtime);
  }

  /**
   * Description: 机构订单提现(订单列表模式)，传入要提现的订单ID列表
   * Summary: 数字商品服务-消费卡服务-根据订单表提现
   */
  async execConsumecardOrderwithdrawbyidsEx(request: ExecConsumecardOrderwithdrawbyidsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecConsumecardOrderwithdrawbyidsResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecConsumecardOrderwithdrawbyidsResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.orderwithdrawbyids.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecConsumecardOrderwithdrawbyidsResponse({}));
  }

  /**
   * Description: 根据提现单号获取提现结果
   * Summary: 数字商品服务-消费卡服务-获取提现结果
   */
  async getConsumecardOrderwithdrawresult(request: GetConsumecardOrderwithdrawresultRequest): Promise<GetConsumecardOrderwithdrawresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getConsumecardOrderwithdrawresultEx(request, headers, runtime);
  }

  /**
   * Description: 根据提现单号获取提现结果
   * Summary: 数字商品服务-消费卡服务-获取提现结果
   */
  async getConsumecardOrderwithdrawresultEx(request: GetConsumecardOrderwithdrawresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetConsumecardOrderwithdrawresultResponse> {
    Util.validateModel(request);
    return $tea.cast<GetConsumecardOrderwithdrawresultResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.orderwithdrawresult.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetConsumecardOrderwithdrawresultResponse({}));
  }

  /**
   * Description: 注销前需要回退资金,查询账户可回退金额
   * Summary: 数字商品服务-消费卡服务-查询可回退金额
   */
  async queryConsumecardWalletredeemable(request: QueryConsumecardWalletredeemableRequest): Promise<QueryConsumecardWalletredeemableResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryConsumecardWalletredeemableEx(request, headers, runtime);
  }

  /**
   * Description: 注销前需要回退资金,查询账户可回退金额
   * Summary: 数字商品服务-消费卡服务-查询可回退金额
   */
  async queryConsumecardWalletredeemableEx(request: QueryConsumecardWalletredeemableRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryConsumecardWalletredeemableResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryConsumecardWalletredeemableResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.walletredeemable.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryConsumecardWalletredeemableResponse({}));
  }

  /**
   * Description: 发布商品是异步流程，根据requestId查询商品发布结果
   * Summary: 数字商品服务-消费卡服务-查询商品发布
   */
  async queryConsumecardGoodscreateresult(request: QueryConsumecardGoodscreateresultRequest): Promise<QueryConsumecardGoodscreateresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryConsumecardGoodscreateresultEx(request, headers, runtime);
  }

  /**
   * Description: 发布商品是异步流程，根据requestId查询商品发布结果
   * Summary: 数字商品服务-消费卡服务-查询商品发布
   */
  async queryConsumecardGoodscreateresultEx(request: QueryConsumecardGoodscreateresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryConsumecardGoodscreateresultResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryConsumecardGoodscreateresultResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.goodscreateresult.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryConsumecardGoodscreateresultResponse({}));
  }

  /**
   * Description: 查询消费卡商品信息
   * Summary: 数字商品服务-消费卡服务-查询商品信息
   */
  async queryConsumecardGoods(request: QueryConsumecardGoodsRequest): Promise<QueryConsumecardGoodsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryConsumecardGoodsEx(request, headers, runtime);
  }

  /**
   * Description: 查询消费卡商品信息
   * Summary: 数字商品服务-消费卡服务-查询商品信息
   */
  async queryConsumecardGoodsEx(request: QueryConsumecardGoodsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryConsumecardGoodsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryConsumecardGoodsResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.goods.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryConsumecardGoodsResponse({}));
  }

  /**
   * Description: 账单退款申请
   * Summary: 数字商品服务-消费卡服务-账单退款申请
   */
  async applyConsumecardBillrefund(request: ApplyConsumecardBillrefundRequest): Promise<ApplyConsumecardBillrefundResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyConsumecardBillrefundEx(request, headers, runtime);
  }

  /**
   * Description: 账单退款申请
   * Summary: 数字商品服务-消费卡服务-账单退款申请
   */
  async applyConsumecardBillrefundEx(request: ApplyConsumecardBillrefundRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyConsumecardBillrefundResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyConsumecardBillrefundResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.billrefund.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyConsumecardBillrefundResponse({}));
  }

  /**
   * Description: 查询交易信息
   * Summary: 数字商品服务-消费卡服务-交易查询
   */
  async queryConsumecardPurchase(request: QueryConsumecardPurchaseRequest): Promise<QueryConsumecardPurchaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryConsumecardPurchaseEx(request, headers, runtime);
  }

  /**
   * Description: 查询交易信息
   * Summary: 数字商品服务-消费卡服务-交易查询
   */
  async queryConsumecardPurchaseEx(request: QueryConsumecardPurchaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryConsumecardPurchaseResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryConsumecardPurchaseResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.purchase.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryConsumecardPurchaseResponse({}));
  }

  /**
   * Description: 获取特定高度的区块信息
   * Summary: 数字商品服务-消费卡服务-获取区块
   */
  async queryConsumecardBlock(request: QueryConsumecardBlockRequest): Promise<QueryConsumecardBlockResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryConsumecardBlockEx(request, headers, runtime);
  }

  /**
   * Description: 获取特定高度的区块信息
   * Summary: 数字商品服务-消费卡服务-获取区块
   */
  async queryConsumecardBlockEx(request: QueryConsumecardBlockRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryConsumecardBlockResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryConsumecardBlockResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.block.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryConsumecardBlockResponse({}));
  }

  /**
   * Description: 查询最新区块高度
   * Summary: 数字商品服务-消费卡服务-查最新区块高度
   */
  async queryConsumecardLastblocknumber(request: QueryConsumecardLastblocknumberRequest): Promise<QueryConsumecardLastblocknumberResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryConsumecardLastblocknumberEx(request, headers, runtime);
  }

  /**
   * Description: 查询最新区块高度
   * Summary: 数字商品服务-消费卡服务-查最新区块高度
   */
  async queryConsumecardLastblocknumberEx(request: QueryConsumecardLastblocknumberRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryConsumecardLastblocknumberResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryConsumecardLastblocknumberResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.lastblocknumber.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryConsumecardLastblocknumberResponse({}));
  }

  /**
   * Description: 更新商品信息是异步流程，根据requestId查询商品更新结果
   * Summary: 数字商品服务-消费卡服务-更新结果查询
   */
  async queryConsumecardGoodsupdateresult(request: QueryConsumecardGoodsupdateresultRequest): Promise<QueryConsumecardGoodsupdateresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryConsumecardGoodsupdateresultEx(request, headers, runtime);
  }

  /**
   * Description: 更新商品信息是异步流程，根据requestId查询商品更新结果
   * Summary: 数字商品服务-消费卡服务-更新结果查询
   */
  async queryConsumecardGoodsupdateresultEx(request: QueryConsumecardGoodsupdateresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryConsumecardGoodsupdateresultResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryConsumecardGoodsupdateresultResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.goodsupdateresult.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryConsumecardGoodsupdateresultResponse({}));
  }

  /**
   * Description: 卖家取消交易
   * Summary: 数字商品服务--消费卡服务-卖家取消交易
   */
  async cancelConsumecardSellerpurchase(request: CancelConsumecardSellerpurchaseRequest): Promise<CancelConsumecardSellerpurchaseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelConsumecardSellerpurchaseEx(request, headers, runtime);
  }

  /**
   * Description: 卖家取消交易
   * Summary: 数字商品服务--消费卡服务-卖家取消交易
   */
  async cancelConsumecardSellerpurchaseEx(request: CancelConsumecardSellerpurchaseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelConsumecardSellerpurchaseResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelConsumecardSellerpurchaseResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.sellerpurchase.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelConsumecardSellerpurchaseResponse({}));
  }

  /**
   * Description: 配置商品和账单的手续费信息
   * Summary: 数字商品服务-消费卡服务-配置手续费
   */
  async setConsumecardCommission(request: SetConsumecardCommissionRequest): Promise<SetConsumecardCommissionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setConsumecardCommissionEx(request, headers, runtime);
  }

  /**
   * Description: 配置商品和账单的手续费信息
   * Summary: 数字商品服务-消费卡服务-配置手续费
   */
  async setConsumecardCommissionEx(request: SetConsumecardCommissionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetConsumecardCommissionResponse> {
    Util.validateModel(request);
    return $tea.cast<SetConsumecardCommissionResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.commission.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetConsumecardCommissionResponse({}));
  }

  /**
   * Description: 删除手续费配置
   * Summary: 数字商品服务-消费卡服务-删除手续费配置
   */
  async removeConsumecardCommission(request: RemoveConsumecardCommissionRequest): Promise<RemoveConsumecardCommissionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.removeConsumecardCommissionEx(request, headers, runtime);
  }

  /**
   * Description: 删除手续费配置
   * Summary: 数字商品服务-消费卡服务-删除手续费配置
   */
  async removeConsumecardCommissionEx(request: RemoveConsumecardCommissionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RemoveConsumecardCommissionResponse> {
    Util.validateModel(request);
    return $tea.cast<RemoveConsumecardCommissionResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.commission.remove", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RemoveConsumecardCommissionResponse({}));
  }

  /**
   * Description: 查询手续费信息
   * Summary: 数字商品服务-消费卡服务-查询手续费信息
   */
  async queryConsumecardCommission(request: QueryConsumecardCommissionRequest): Promise<QueryConsumecardCommissionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryConsumecardCommissionEx(request, headers, runtime);
  }

  /**
   * Description: 查询手续费信息
   * Summary: 数字商品服务-消费卡服务-查询手续费信息
   */
  async queryConsumecardCommissionEx(request: QueryConsumecardCommissionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryConsumecardCommissionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryConsumecardCommissionResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.commission.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryConsumecardCommissionResponse({}));
  }

  /**
   * Description: 设置手续费管理员，手续费的增删改查需要由手续费管理员操作。平台管理员可以设置手续费管理员。
   * Summary: 数字商品服务-消费卡服务-设置手续费管理
   */
  async setConsumecardCommissionmanager(request: SetConsumecardCommissionmanagerRequest): Promise<SetConsumecardCommissionmanagerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setConsumecardCommissionmanagerEx(request, headers, runtime);
  }

  /**
   * Description: 设置手续费管理员，手续费的增删改查需要由手续费管理员操作。平台管理员可以设置手续费管理员。
   * Summary: 数字商品服务-消费卡服务-设置手续费管理
   */
  async setConsumecardCommissionmanagerEx(request: SetConsumecardCommissionmanagerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetConsumecardCommissionmanagerResponse> {
    Util.validateModel(request);
    return $tea.cast<SetConsumecardCommissionmanagerResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.commissionmanager.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetConsumecardCommissionmanagerResponse({}));
  }

  /**
   * Description: 设置商品状态，可以设置为上线或下线
   * Summary: 数字商品服务-消费卡服务-设置商品状态
   */
  async setConsumecardGoodsstatus(request: SetConsumecardGoodsstatusRequest): Promise<SetConsumecardGoodsstatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setConsumecardGoodsstatusEx(request, headers, runtime);
  }

  /**
   * Description: 设置商品状态，可以设置为上线或下线
   * Summary: 数字商品服务-消费卡服务-设置商品状态
   */
  async setConsumecardGoodsstatusEx(request: SetConsumecardGoodsstatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetConsumecardGoodsstatusResponse> {
    Util.validateModel(request);
    return $tea.cast<SetConsumecardGoodsstatusResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.goodsstatus.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetConsumecardGoodsstatusResponse({}));
  }

  /**
   * Description: 个人用户来账付款协议签约
   * Summary: 数字商品-消费卡服务-个人用户签约
   */
  async createConsumecardReceiptcontract(request: CreateConsumecardReceiptcontractRequest): Promise<CreateConsumecardReceiptcontractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createConsumecardReceiptcontractEx(request, headers, runtime);
  }

  /**
   * Description: 个人用户来账付款协议签约
   * Summary: 数字商品-消费卡服务-个人用户签约
   */
  async createConsumecardReceiptcontractEx(request: CreateConsumecardReceiptcontractRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateConsumecardReceiptcontractResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateConsumecardReceiptcontractResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.receiptcontract.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateConsumecardReceiptcontractResponse({}));
  }

  /**
   * Description: 来账协议解约接口
   * Summary: 数字商品-消费卡服务-个人协议解约
   */
  async removeConsumecardReceiptcontract(request: RemoveConsumecardReceiptcontractRequest): Promise<RemoveConsumecardReceiptcontractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.removeConsumecardReceiptcontractEx(request, headers, runtime);
  }

  /**
   * Description: 来账协议解约接口
   * Summary: 数字商品-消费卡服务-个人协议解约
   */
  async removeConsumecardReceiptcontractEx(request: RemoveConsumecardReceiptcontractRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RemoveConsumecardReceiptcontractResponse> {
    Util.validateModel(request);
    return $tea.cast<RemoveConsumecardReceiptcontractResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.receiptcontract.remove", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RemoveConsumecardReceiptcontractResponse({}));
  }

  /**
   * Description: 来账协议查询接口
   * Summary: 数字商品-消费卡服务-个人协议查询
   */
  async queryConsumecardReceiptcontract(request: QueryConsumecardReceiptcontractRequest): Promise<QueryConsumecardReceiptcontractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryConsumecardReceiptcontractEx(request, headers, runtime);
  }

  /**
   * Description: 来账协议查询接口
   * Summary: 数字商品-消费卡服务-个人协议查询
   */
  async queryConsumecardReceiptcontractEx(request: QueryConsumecardReceiptcontractRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryConsumecardReceiptcontractResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryConsumecardReceiptcontractResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.receiptcontract.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryConsumecardReceiptcontractResponse({}));
  }

  /**
   * Description: 收单协议签约
   * Summary: 数字商品-消费卡服务-商家用户签约
   */
  async createConsumecardBillingcontract(request: CreateConsumecardBillingcontractRequest): Promise<CreateConsumecardBillingcontractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createConsumecardBillingcontractEx(request, headers, runtime);
  }

  /**
   * Description: 收单协议签约
   * Summary: 数字商品-消费卡服务-商家用户签约
   */
  async createConsumecardBillingcontractEx(request: CreateConsumecardBillingcontractRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateConsumecardBillingcontractResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateConsumecardBillingcontractResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.billingcontract.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateConsumecardBillingcontractResponse({}));
  }

  /**
   * Description: 收单协议解约
   * Summary: 数字商品-消费卡服务-商家协议解约
   */
  async removeConsumecardBillingcontract(request: RemoveConsumecardBillingcontractRequest): Promise<RemoveConsumecardBillingcontractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.removeConsumecardBillingcontractEx(request, headers, runtime);
  }

  /**
   * Description: 收单协议解约
   * Summary: 数字商品-消费卡服务-商家协议解约
   */
  async removeConsumecardBillingcontractEx(request: RemoveConsumecardBillingcontractRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RemoveConsumecardBillingcontractResponse> {
    Util.validateModel(request);
    return $tea.cast<RemoveConsumecardBillingcontractResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.billingcontract.remove", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RemoveConsumecardBillingcontractResponse({}));
  }

  /**
   * Description: 收单协议签约查询
   * Summary: 数字商品-消费卡服务-商家协议查询
   */
  async queryConsumecardBillingcontract(request: QueryConsumecardBillingcontractRequest): Promise<QueryConsumecardBillingcontractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryConsumecardBillingcontractEx(request, headers, runtime);
  }

  /**
   * Description: 收单协议签约查询
   * Summary: 数字商品-消费卡服务-商家协议查询
   */
  async queryConsumecardBillingcontractEx(request: QueryConsumecardBillingcontractRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryConsumecardBillingcontractResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryConsumecardBillingcontractResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.billingcontract.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryConsumecardBillingcontractResponse({}));
  }

  /**
   * Description: 增加一级分账方
   * Summary: 数字商品服务-消费卡服务-增加一级分账方
   */
  async addConsumecardCommissionparty(request: AddConsumecardCommissionpartyRequest): Promise<AddConsumecardCommissionpartyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addConsumecardCommissionpartyEx(request, headers, runtime);
  }

  /**
   * Description: 增加一级分账方
   * Summary: 数字商品服务-消费卡服务-增加一级分账方
   */
  async addConsumecardCommissionpartyEx(request: AddConsumecardCommissionpartyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddConsumecardCommissionpartyResponse> {
    Util.validateModel(request);
    return $tea.cast<AddConsumecardCommissionpartyResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.commissionparty.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddConsumecardCommissionpartyResponse({}));
  }

  /**
   * Description: 删除一级分账方
   * Summary: 数字商品服务-消费卡服务-删除一级分账方
   */
  async removeConsumecardCommissionparty(request: RemoveConsumecardCommissionpartyRequest): Promise<RemoveConsumecardCommissionpartyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.removeConsumecardCommissionpartyEx(request, headers, runtime);
  }

  /**
   * Description: 删除一级分账方
   * Summary: 数字商品服务-消费卡服务-删除一级分账方
   */
  async removeConsumecardCommissionpartyEx(request: RemoveConsumecardCommissionpartyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RemoveConsumecardCommissionpartyResponse> {
    Util.validateModel(request);
    return $tea.cast<RemoveConsumecardCommissionpartyResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.commissionparty.remove", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RemoveConsumecardCommissionpartyResponse({}));
  }

  /**
   * Description: 增加手续费周期
   * Summary: 数字商品服务-消费卡服务-增加手续费周期
   */
  async addConsumecardCommissionperiod(request: AddConsumecardCommissionperiodRequest): Promise<AddConsumecardCommissionperiodResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addConsumecardCommissionperiodEx(request, headers, runtime);
  }

  /**
   * Description: 增加手续费周期
   * Summary: 数字商品服务-消费卡服务-增加手续费周期
   */
  async addConsumecardCommissionperiodEx(request: AddConsumecardCommissionperiodRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddConsumecardCommissionperiodResponse> {
    Util.validateModel(request);
    return $tea.cast<AddConsumecardCommissionperiodResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.commissionperiod.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddConsumecardCommissionperiodResponse({}));
  }

  /**
   * Description: 删除手续费周期
   * Summary: 数字商品服务-消费卡服务-删除手续费周期
   */
  async removeConsumecardCommissionperiod(request: RemoveConsumecardCommissionperiodRequest): Promise<RemoveConsumecardCommissionperiodResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.removeConsumecardCommissionperiodEx(request, headers, runtime);
  }

  /**
   * Description: 删除手续费周期
   * Summary: 数字商品服务-消费卡服务-删除手续费周期
   */
  async removeConsumecardCommissionperiodEx(request: RemoveConsumecardCommissionperiodRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RemoveConsumecardCommissionperiodResponse> {
    Util.validateModel(request);
    return $tea.cast<RemoveConsumecardCommissionperiodResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.commissionperiod.remove", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RemoveConsumecardCommissionperiodResponse({}));
  }

  /**
   * Description: 查询统计信息
   * Summary: 数字商品服务-消费卡服务-查询统计信息
   */
  async queryConsumecardCounter(request: QueryConsumecardCounterRequest): Promise<QueryConsumecardCounterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryConsumecardCounterEx(request, headers, runtime);
  }

  /**
   * Description: 查询统计信息
   * Summary: 数字商品服务-消费卡服务-查询统计信息
   */
  async queryConsumecardCounterEx(request: QueryConsumecardCounterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryConsumecardCounterResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryConsumecardCounterResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.counter.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryConsumecardCounterResponse({}));
  }

  /**
   * Description: 管理接口：配置场景码权限信息
   * Summary: 数字商品服务-消费卡服务-场景码配置
   */
  async setConsumecardProductcode(request: SetConsumecardProductcodeRequest): Promise<SetConsumecardProductcodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setConsumecardProductcodeEx(request, headers, runtime);
  }

  /**
   * Description: 管理接口：配置场景码权限信息
   * Summary: 数字商品服务-消费卡服务-场景码配置
   */
  async setConsumecardProductcodeEx(request: SetConsumecardProductcodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetConsumecardProductcodeResponse> {
    Util.validateModel(request);
    return $tea.cast<SetConsumecardProductcodeResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.productcode.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetConsumecardProductcodeResponse({}));
  }

  /**
   * Description: 查询已配置的场景码信息
   * Summary: 数字商品服务-消费卡服务-查询场景码配置
   */
  async queryConsumecardProductcode(request: QueryConsumecardProductcodeRequest): Promise<QueryConsumecardProductcodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryConsumecardProductcodeEx(request, headers, runtime);
  }

  /**
   * Description: 查询已配置的场景码信息
   * Summary: 数字商品服务-消费卡服务-查询场景码配置
   */
  async queryConsumecardProductcodeEx(request: QueryConsumecardProductcodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryConsumecardProductcodeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryConsumecardProductcodeResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.productcode.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryConsumecardProductcodeResponse({}));
  }

  /**
   * Description: 删除场景码配置
   * Summary: 数字商品服务-消费卡服务-删除场景码配置
   */
  async removeConsumecardProductcode(request: RemoveConsumecardProductcodeRequest): Promise<RemoveConsumecardProductcodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.removeConsumecardProductcodeEx(request, headers, runtime);
  }

  /**
   * Description: 删除场景码配置
   * Summary: 数字商品服务-消费卡服务-删除场景码配置
   */
  async removeConsumecardProductcodeEx(request: RemoveConsumecardProductcodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RemoveConsumecardProductcodeResponse> {
    Util.validateModel(request);
    return $tea.cast<RemoveConsumecardProductcodeResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.productcode.remove", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RemoveConsumecardProductcodeResponse({}));
  }

  /**
   * Description: 根据图片不可访问URl 获取可以访问的临时URL
   * Summary: 数字商品服务-消费卡服务-查询图片URL
   */
  async queryConsumecardGoodsimage(request: QueryConsumecardGoodsimageRequest): Promise<QueryConsumecardGoodsimageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryConsumecardGoodsimageEx(request, headers, runtime);
  }

  /**
   * Description: 根据图片不可访问URl 获取可以访问的临时URL
   * Summary: 数字商品服务-消费卡服务-查询图片URL
   */
  async queryConsumecardGoodsimageEx(request: QueryConsumecardGoodsimageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryConsumecardGoodsimageResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryConsumecardGoodsimageResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.goodsimage.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryConsumecardGoodsimageResponse({}));
  }

  /**
   * Description: 文件API，上传文件
   * Summary: 数字商品服务-文件服务-上传文件
   */
  async uploadConsumecardFile(request: UploadConsumecardFileRequest): Promise<UploadConsumecardFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadConsumecardFileEx(request, headers, runtime);
  }

  /**
   * Description: 文件API，上传文件
   * Summary: 数字商品服务-文件服务-上传文件
   */
  async uploadConsumecardFileEx(request: UploadConsumecardFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadConsumecardFileResponse> {
    if (!Util.isUnset(request.fileObject)) {
      let uploadReq = new CreateAntcloudGatewayxFileUploadRequest({
        authToken: request.authToken,
        apiCode: "baas.antdao.consumecard.file.upload",
        fileName: request.fileObjectName,
      });
      let uploadResp = await this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
      if (!AntchainUtil.isSuccess(uploadResp.resultCode, "ok")) {
        let uploadConsumecardFileResponse = new UploadConsumecardFileResponse({
          reqMsgId: uploadResp.reqMsgId,
          resultCode: uploadResp.resultCode,
          resultMsg: uploadResp.resultMsg,
        });
        return uploadConsumecardFileResponse;
      }

      let uploadHeaders = AntchainUtil.parseUploadHeaders(uploadResp.uploadHeaders);
      await AntchainUtil.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
      request.fileId = uploadResp.fileId;
    }

    Util.validateModel(request);
    return $tea.cast<UploadConsumecardFileResponse>(await this.doRequest("1.0", "baas.antdao.consumecard.file.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadConsumecardFileResponse({}));
  }

  /**
   * Description: 查询电子券详细信息。只有批次管理员，过期观察员可以查看，其他商户没有查看权限。
   * Summary: 数字商品服务-电子券服务-查询电子券
   */
  async queryCoupon(request: QueryCouponRequest): Promise<QueryCouponResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCouponEx(request, headers, runtime);
  }

  /**
   * Description: 查询电子券详细信息。只有批次管理员，过期观察员可以查看，其他商户没有查看权限。
   * Summary: 数字商品服务-电子券服务-查询电子券
   */
  async queryCouponEx(request: QueryCouponRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCouponResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCouponResponse>(await this.doRequest("1.0", "baas.antdao.coupon.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCouponResponse({}));
  }

  /**
   * Description: 创建单个电子券接口
   * Summary: 数字商品服务-电子券服务-创建单个电子券
   */
  async createCoupon(request: CreateCouponRequest): Promise<CreateCouponResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCouponEx(request, headers, runtime);
  }

  /**
   * Description: 创建单个电子券接口
   * Summary: 数字商品服务-电子券服务-创建单个电子券
   */
  async createCouponEx(request: CreateCouponRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCouponResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCouponResponse>(await this.doRequest("1.0", "baas.antdao.coupon.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCouponResponse({}));
  }

  /**
   * Description: 将电子券更新为禁用状态，不能再进行其他状态更新
   * Summary: 数字商品服务-电子券服务-电子券风控禁用
   */
  async execCouponForbidden(request: ExecCouponForbiddenRequest): Promise<ExecCouponForbiddenResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execCouponForbiddenEx(request, headers, runtime);
  }

  /**
   * Description: 将电子券更新为禁用状态，不能再进行其他状态更新
   * Summary: 数字商品服务-电子券服务-电子券风控禁用
   */
  async execCouponForbiddenEx(request: ExecCouponForbiddenRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecCouponForbiddenResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecCouponForbiddenResponse>(await this.doRequest("1.0", "baas.antdao.coupon.forbidden.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecCouponForbiddenResponse({}));
  }

  /**
   * Description: 将电子券更新为可用状态
   * Summary: 数字商品服务-电子券服务-电子券风控启用
   */
  async execCouponEnable(request: ExecCouponEnableRequest): Promise<ExecCouponEnableResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execCouponEnableEx(request, headers, runtime);
  }

  /**
   * Description: 将电子券更新为可用状态
   * Summary: 数字商品服务-电子券服务-电子券风控启用
   */
  async execCouponEnableEx(request: ExecCouponEnableRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecCouponEnableResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecCouponEnableResponse>(await this.doRequest("1.0", "baas.antdao.coupon.enable.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecCouponEnableResponse({}));
  }

  /**
   * Description: 将电子券状态更新为过期
   * Summary: 数字商品服务-电子券服务-电子券过期
   */
  async execCouponExpire(request: ExecCouponExpireRequest): Promise<ExecCouponExpireResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execCouponExpireEx(request, headers, runtime);
  }

  /**
   * Description: 将电子券状态更新为过期
   * Summary: 数字商品服务-电子券服务-电子券过期
   */
  async execCouponExpireEx(request: ExecCouponExpireRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecCouponExpireResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecCouponExpireResponse>(await this.doRequest("1.0", "baas.antdao.coupon.expire.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecCouponExpireResponse({}));
  }

  /**
   * Description: 将电子券状态更新为核销
   * Summary: 数字商品服务-电子券服务-电子券核销
   */
  async execCouponWriteoff(request: ExecCouponWriteoffRequest): Promise<ExecCouponWriteoffResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execCouponWriteoffEx(request, headers, runtime);
  }

  /**
   * Description: 将电子券状态更新为核销
   * Summary: 数字商品服务-电子券服务-电子券核销
   */
  async execCouponWriteoffEx(request: ExecCouponWriteoffRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecCouponWriteoffResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecCouponWriteoffResponse>(await this.doRequest("1.0", "baas.antdao.coupon.writeoff.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecCouponWriteoffResponse({}));
  }

  /**
   * Description: 更新电子券的激活码状态为已超时
   * Summary: 数字商品服务-电子券服务-券激活码超时
   */
  async execCouponTimeout(request: ExecCouponTimeoutRequest): Promise<ExecCouponTimeoutResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execCouponTimeoutEx(request, headers, runtime);
  }

  /**
   * Description: 更新电子券的激活码状态为已超时
   * Summary: 数字商品服务-电子券服务-券激活码超时
   */
  async execCouponTimeoutEx(request: ExecCouponTimeoutRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecCouponTimeoutResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecCouponTimeoutResponse>(await this.doRequest("1.0", "baas.antdao.coupon.timeout.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecCouponTimeoutResponse({}));
  }

  /**
   * Description: 商户上传激活码，激活电子券
   * Summary: 数字商品服务-电子券服务-激活电子券
   */
  async execCouponActivate(request: ExecCouponActivateRequest): Promise<ExecCouponActivateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execCouponActivateEx(request, headers, runtime);
  }

  /**
   * Description: 商户上传激活码，激活电子券
   * Summary: 数字商品服务-电子券服务-激活电子券
   */
  async execCouponActivateEx(request: ExecCouponActivateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecCouponActivateResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecCouponActivateResponse>(await this.doRequest("1.0", "baas.antdao.coupon.activate.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecCouponActivateResponse({}));
  }

  /**
   * Description: 将电子券转让给其他用户
   * Summary: 数字商品服务-电子券服务-电子券转让
   */
  async execCouponTransfer(request: ExecCouponTransferRequest): Promise<ExecCouponTransferResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execCouponTransferEx(request, headers, runtime);
  }

  /**
   * Description: 将电子券转让给其他用户
   * Summary: 数字商品服务-电子券服务-电子券转让
   */
  async execCouponTransferEx(request: ExecCouponTransferRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecCouponTransferResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecCouponTransferResponse>(await this.doRequest("1.0", "baas.antdao.coupon.transfer.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecCouponTransferResponse({}));
  }

  /**
   * Description: 记名电子券创建时没有记录用户信息，可以调用本接口将用户信息更新到电子券上。记名电子券若没有用户信息，则无法进行绑定激活。
   * Summary: 数字商品服务-电子券服务-电子券记名
   */
  async execCouponSign(request: ExecCouponSignRequest): Promise<ExecCouponSignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execCouponSignEx(request, headers, runtime);
  }

  /**
   * Description: 记名电子券创建时没有记录用户信息，可以调用本接口将用户信息更新到电子券上。记名电子券若没有用户信息，则无法进行绑定激活。
   * Summary: 数字商品服务-电子券服务-电子券记名
   */
  async execCouponSignEx(request: ExecCouponSignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecCouponSignResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecCouponSignResponse>(await this.doRequest("1.0", "baas.antdao.coupon.sign.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecCouponSignResponse({}));
  }

  /**
   * Description: 绑定电子券，更新为“绑定”状态
   * Summary: 数字商品服务-电子券服务-绑定电子券
   */
  async execCouponBind(request: ExecCouponBindRequest): Promise<ExecCouponBindResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execCouponBindEx(request, headers, runtime);
  }

  /**
   * Description: 绑定电子券，更新为“绑定”状态
   * Summary: 数字商品服务-电子券服务-绑定电子券
   */
  async execCouponBindEx(request: ExecCouponBindRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecCouponBindResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecCouponBindResponse>(await this.doRequest("1.0", "baas.antdao.coupon.bind.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecCouponBindResponse({}));
  }

  /**
   * Description: 传入数量一次性创建多张电子券，支持不记名电子券或同名电子券创建。每次最多创建100张电子券
   * Summary: 数字商品服务-电子券服务-电子券批量创建
   */
  async batchcreateCoupon(request: BatchcreateCouponRequest): Promise<BatchcreateCouponResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateCouponEx(request, headers, runtime);
  }

  /**
   * Description: 传入数量一次性创建多张电子券，支持不记名电子券或同名电子券创建。每次最多创建100张电子券
   * Summary: 数字商品服务-电子券服务-电子券批量创建
   */
  async batchcreateCouponEx(request: BatchcreateCouponRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateCouponResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateCouponResponse>(await this.doRequest("1.0", "baas.antdao.coupon.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateCouponResponse({}));
  }

  /**
   * Description: 电子券列表创建 支持传入不同的电子券信息列表，列表中每个电子券信息可以不相同
   * Summary: 数字商品服务-电子券服务-电子券列表创建
   */
  async createCouponList(request: CreateCouponListRequest): Promise<CreateCouponListResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCouponListEx(request, headers, runtime);
  }

  /**
   * Description: 电子券列表创建 支持传入不同的电子券信息列表，列表中每个电子券信息可以不相同
   * Summary: 数字商品服务-电子券服务-电子券列表创建
   */
  async createCouponListEx(request: CreateCouponListRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCouponListResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCouponListResponse>(await this.doRequest("1.0", "baas.antdao.coupon.list.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCouponListResponse({}));
  }

  /**
   * Description: 创建电子券批次，定义该批次的信息和是否记名，创建批次的商户自动成为批次管理员。
   * Summary: 数字商品服务-电子券服务-创建电子券批次
   */
  async createCouponCollection(request: CreateCouponCollectionRequest): Promise<CreateCouponCollectionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCouponCollectionEx(request, headers, runtime);
  }

  /**
   * Description: 创建电子券批次，定义该批次的信息和是否记名，创建批次的商户自动成为批次管理员。
   * Summary: 数字商品服务-电子券服务-创建电子券批次
   */
  async createCouponCollectionEx(request: CreateCouponCollectionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCouponCollectionResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCouponCollectionResponse>(await this.doRequest("1.0", "baas.antdao.coupon.collection.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCouponCollectionResponse({}));
  }

  /**
   * Description: 输入批次ID，查询批次详情。只有批次管理员，过期观察员可以查看，其他商户没有查看权限。
   * Summary: 数字商品服务-电子券服务-电子券批次查询
   */
  async queryCouponCollection(request: QueryCouponCollectionRequest): Promise<QueryCouponCollectionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCouponCollectionEx(request, headers, runtime);
  }

  /**
   * Description: 输入批次ID，查询批次详情。只有批次管理员，过期观察员可以查看，其他商户没有查看权限。
   * Summary: 数字商品服务-电子券服务-电子券批次查询
   */
  async queryCouponCollectionEx(request: QueryCouponCollectionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCouponCollectionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCouponCollectionResponse>(await this.doRequest("1.0", "baas.antdao.coupon.collection.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCouponCollectionResponse({}));
  }

  /**
   * Description: 查询调用商户下的用户信息
   * Summary: 数字商品服务-商户管理-查询用户信息
   */
  async queryMerchantUser(request: QueryMerchantUserRequest): Promise<QueryMerchantUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMerchantUserEx(request, headers, runtime);
  }

  /**
   * Description: 查询调用商户下的用户信息
   * Summary: 数字商品服务-商户管理-查询用户信息
   */
  async queryMerchantUserEx(request: QueryMerchantUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMerchantUserResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMerchantUserResponse>(await this.doRequest("1.0", "baas.antdao.merchant.user.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMerchantUserResponse({}));
  }

  /**
   * Description: 创建商户管理下的用户
   * Summary: 数字商品服务-商户管理-商户创建用户
   */
  async createMerchantUser(request: CreateMerchantUserRequest): Promise<CreateMerchantUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createMerchantUserEx(request, headers, runtime);
  }

  /**
   * Description: 创建商户管理下的用户
   * Summary: 数字商品服务-商户管理-商户创建用户
   */
  async createMerchantUserEx(request: CreateMerchantUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateMerchantUserResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateMerchantUserResponse>(await this.doRequest("1.0", "baas.antdao.merchant.user.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateMerchantUserResponse({}));
  }

  /**
   * Description: 查询管理员创建的商户信息（可查询自身的商户信息）
   * Summary: 数字商品服务-商户管理-查询商户信息
   */
  async queryMerchant(request: QueryMerchantRequest): Promise<QueryMerchantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMerchantEx(request, headers, runtime);
  }

  /**
   * Description: 查询管理员创建的商户信息（可查询自身的商户信息）
   * Summary: 数字商品服务-商户管理-查询商户信息
   */
  async queryMerchantEx(request: QueryMerchantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMerchantResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMerchantResponse>(await this.doRequest("1.0", "baas.antdao.merchant.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMerchantResponse({}));
  }

  /**
   * Description: 上传图片到OSS，以备风控检查。仅权益发行方可使用，采购方不可使用。上传的图片单张不超过1M。
   * Summary: 数字商品服务-OSS服务-上传图片
   */
  async uploadImage(request: UploadImageRequest): Promise<UploadImageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadImageEx(request, headers, runtime);
  }

  /**
   * Description: 上传图片到OSS，以备风控检查。仅权益发行方可使用，采购方不可使用。上传的图片单张不超过1M。
   * Summary: 数字商品服务-OSS服务-上传图片
   */
  async uploadImageEx(request: UploadImageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadImageResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadImageResponse>(await this.doRequest("1.0", "baas.antdao.image.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadImageResponse({}));
  }

  /**
   * Description: 获取kms中对应用户的公钥
   * Summary: 数字商品服务-密钥管理-获取用户公钥
   */
  async getPkiPublickey(request: GetPkiPublickeyRequest): Promise<GetPkiPublickeyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getPkiPublickeyEx(request, headers, runtime);
  }

  /**
   * Description: 获取kms中对应用户的公钥
   * Summary: 数字商品服务-密钥管理-获取用户公钥
   */
  async getPkiPublickeyEx(request: GetPkiPublickeyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetPkiPublickeyResponse> {
    Util.validateModel(request);
    return $tea.cast<GetPkiPublickeyResponse>(await this.doRequest("1.0", "baas.antdao.pki.publickey.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetPkiPublickeyResponse({}));
  }

  /**
   * Description: ECC公钥加密接口
   * Summary: 数字商品服务-密钥管理-公钥加密
   */
  async execPkiEncrypt(request: ExecPkiEncryptRequest): Promise<ExecPkiEncryptResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execPkiEncryptEx(request, headers, runtime);
  }

  /**
   * Description: ECC公钥加密接口
   * Summary: 数字商品服务-密钥管理-公钥加密
   */
  async execPkiEncryptEx(request: ExecPkiEncryptRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecPkiEncryptResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecPkiEncryptResponse>(await this.doRequest("1.0", "baas.antdao.pki.encrypt.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecPkiEncryptResponse({}));
  }

  /**
   * Description: ECC解密算法接口
   * Summary: 数字商品服务-密钥管理-私钥解密
   */
  async execPkiDecrypt(request: ExecPkiDecryptRequest): Promise<ExecPkiDecryptResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execPkiDecryptEx(request, headers, runtime);
  }

  /**
   * Description: ECC解密算法接口
   * Summary: 数字商品服务-密钥管理-私钥解密
   */
  async execPkiDecryptEx(request: ExecPkiDecryptRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecPkiDecryptResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecPkiDecryptResponse>(await this.doRequest("1.0", "baas.antdao.pki.decrypt.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecPkiDecryptResponse({}));
  }

  /**
   * Description: 更新商户的友商信息
   * Summary: 数字商品服务-商户管理-更新商户友商
   */
  async updateMerchantFriend(request: UpdateMerchantFriendRequest): Promise<UpdateMerchantFriendResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateMerchantFriendEx(request, headers, runtime);
  }

  /**
   * Description: 更新商户的友商信息
   * Summary: 数字商品服务-商户管理-更新商户友商
   */
  async updateMerchantFriendEx(request: UpdateMerchantFriendRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateMerchantFriendResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateMerchantFriendResponse>(await this.doRequest("1.0", "baas.antdao.merchant.friend.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateMerchantFriendResponse({}));
  }

  /**
   * Description: 商品供应商户发布一个商品
   * Summary: 数字商品服务-商品服务-创建商品
   */
  async createEquity(request: CreateEquityRequest): Promise<CreateEquityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createEquityEx(request, headers, runtime);
  }

  /**
   * Description: 商品供应商户发布一个商品
   * Summary: 数字商品服务-商品服务-创建商品
   */
  async createEquityEx(request: CreateEquityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateEquityResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateEquityResponse>(await this.doRequest("1.0", "baas.antdao.equity.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateEquityResponse({}));
  }

  /**
   * Description: 该接口不使用，合并至 baas.antdao.equity.status.update
  下线商品
   * Summary: 数字商品服务-商品服务-下线商品
   */
  async offlineEquity(request: OfflineEquityRequest): Promise<OfflineEquityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.offlineEquityEx(request, headers, runtime);
  }

  /**
   * Description: 该接口不使用，合并至 baas.antdao.equity.status.update
  下线商品
   * Summary: 数字商品服务-商品服务-下线商品
   */
  async offlineEquityEx(request: OfflineEquityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OfflineEquityResponse> {
    Util.validateModel(request);
    return $tea.cast<OfflineEquityResponse>(await this.doRequest("1.0", "baas.antdao.equity.offline", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OfflineEquityResponse({}));
  }

  /**
   * Description: 该接口不使用，合并至baas.antdao.equity.status.update
  冻结权益
   * Summary: 数字商品服务-商品服务-冻结商品
   */
  async freezeEquity(request: FreezeEquityRequest): Promise<FreezeEquityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.freezeEquityEx(request, headers, runtime);
  }

  /**
   * Description: 该接口不使用，合并至baas.antdao.equity.status.update
  冻结权益
   * Summary: 数字商品服务-商品服务-冻结商品
   */
  async freezeEquityEx(request: FreezeEquityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<FreezeEquityResponse> {
    Util.validateModel(request);
    return $tea.cast<FreezeEquityResponse>(await this.doRequest("1.0", "baas.antdao.equity.freeze", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new FreezeEquityResponse({}));
  }

  /**
   * Description: 授权兑换—非公开商品商户配置
   * Summary: 数字商品服务-商品服务-授权兑换
   */
  async openEquityMerchant(request: OpenEquityMerchantRequest): Promise<OpenEquityMerchantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.openEquityMerchantEx(request, headers, runtime);
  }

  /**
   * Description: 授权兑换—非公开商品商户配置
   * Summary: 数字商品服务-商品服务-授权兑换
   */
  async openEquityMerchantEx(request: OpenEquityMerchantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OpenEquityMerchantResponse> {
    Util.validateModel(request);
    return $tea.cast<OpenEquityMerchantResponse>(await this.doRequest("1.0", "baas.antdao.equity.merchant.open", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OpenEquityMerchantResponse({}));
  }

  /**
   * Description: 用户兑换价格设置
   * Summary: 数字商品服务-商品服务-用户兑换价格设置
   */
  async authEquityMerchantuserprice(request: AuthEquityMerchantuserpriceRequest): Promise<AuthEquityMerchantuserpriceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authEquityMerchantuserpriceEx(request, headers, runtime);
  }

  /**
   * Description: 用户兑换价格设置
   * Summary: 数字商品服务-商品服务-用户兑换价格设置
   */
  async authEquityMerchantuserpriceEx(request: AuthEquityMerchantuserpriceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthEquityMerchantuserpriceResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthEquityMerchantuserpriceResponse>(await this.doRequest("1.0", "baas.antdao.equity.merchantuserprice.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthEquityMerchantuserpriceResponse({}));
  }

  /**
   * Description: 该接口不使用，合并至 baas.antdao.equity.update 
  更新商品价格
   * Summary: 数字商品服务-商品服务-更新商品价格
   */
  async updateEquityDefaultprice(request: UpdateEquityDefaultpriceRequest): Promise<UpdateEquityDefaultpriceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateEquityDefaultpriceEx(request, headers, runtime);
  }

  /**
   * Description: 该接口不使用，合并至 baas.antdao.equity.update 
  更新商品价格
   * Summary: 数字商品服务-商品服务-更新商品价格
   */
  async updateEquityDefaultpriceEx(request: UpdateEquityDefaultpriceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateEquityDefaultpriceResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateEquityDefaultpriceResponse>(await this.doRequest("1.0", "baas.antdao.equity.defaultprice.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateEquityDefaultpriceResponse({}));
  }

  /**
   * Description: 更新商品自定义定价
   * Summary: 数字商品服务-商品服务-更新自定义定价
   */
  async updateEquityTenantprice(request: UpdateEquityTenantpriceRequest): Promise<UpdateEquityTenantpriceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateEquityTenantpriceEx(request, headers, runtime);
  }

  /**
   * Description: 更新商品自定义定价
   * Summary: 数字商品服务-商品服务-更新自定义定价
   */
  async updateEquityTenantpriceEx(request: UpdateEquityTenantpriceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateEquityTenantpriceResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateEquityTenantpriceResponse>(await this.doRequest("1.0", "baas.antdao.equity.tenantprice.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateEquityTenantpriceResponse({}));
  }

  /**
   * Description: 该接口不使用，合并至 baas.antdao.equity.update
  增加权益库存
   * Summary: 数字商品服务-商品服务-增加权益库存
   */
  async addEquityCount(request: AddEquityCountRequest): Promise<AddEquityCountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addEquityCountEx(request, headers, runtime);
  }

  /**
   * Description: 该接口不使用，合并至 baas.antdao.equity.update
  增加权益库存
   * Summary: 数字商品服务-商品服务-增加权益库存
   */
  async addEquityCountEx(request: AddEquityCountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddEquityCountResponse> {
    Util.validateModel(request);
    return $tea.cast<AddEquityCountResponse>(await this.doRequest("1.0", "baas.antdao.equity.count.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddEquityCountResponse({}));
  }

  /**
   * Description: 该接口不使用，合并至 baas.antdao.equity.update
  更新兑换限制规则
   * Summary: 数字商品服务-商品服务-更新兑换限制规则
   */
  async updateEquityExchangelimit(request: UpdateEquityExchangelimitRequest): Promise<UpdateEquityExchangelimitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateEquityExchangelimitEx(request, headers, runtime);
  }

  /**
   * Description: 该接口不使用，合并至 baas.antdao.equity.update
  更新兑换限制规则
   * Summary: 数字商品服务-商品服务-更新兑换限制规则
   */
  async updateEquityExchangelimitEx(request: UpdateEquityExchangelimitRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateEquityExchangelimitResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateEquityExchangelimitResponse>(await this.doRequest("1.0", "baas.antdao.equity.exchangelimit.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateEquityExchangelimitResponse({}));
  }

  /**
   * Description: 该接口不使用，合并至 baas.antdao.equity.update
  更新商品有效期
   * Summary: 数字商品服务-商品服务-更新有效期
   */
  async updateEquityValidtime(request: UpdateEquityValidtimeRequest): Promise<UpdateEquityValidtimeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateEquityValidtimeEx(request, headers, runtime);
  }

  /**
   * Description: 该接口不使用，合并至 baas.antdao.equity.update
  更新商品有效期
   * Summary: 数字商品服务-商品服务-更新有效期
   */
  async updateEquityValidtimeEx(request: UpdateEquityValidtimeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateEquityValidtimeResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateEquityValidtimeResponse>(await this.doRequest("1.0", "baas.antdao.equity.validtime.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateEquityValidtimeResponse({}));
  }

  /**
   * Description: 查询商品信息
   * Summary: 数字商品服务-商品服务-查询商品信息
   */
  async queryEquity(request: QueryEquityRequest): Promise<QueryEquityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEquityEx(request, headers, runtime);
  }

  /**
   * Description: 查询商品信息
   * Summary: 数字商品服务-商品服务-查询商品信息
   */
  async queryEquityEx(request: QueryEquityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEquityResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEquityResponse>(await this.doRequest("1.0", "baas.antdao.equity.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEquityResponse({}));
  }

  /**
   * Description: 用户身份发起兑换
   * Summary: 数字商品服务-兑换服务-用户身份发起兑换
   */
  async execExchangeByuser(request: ExecExchangeByuserRequest): Promise<ExecExchangeByuserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execExchangeByuserEx(request, headers, runtime);
  }

  /**
   * Description: 用户身份发起兑换
   * Summary: 数字商品服务-兑换服务-用户身份发起兑换
   */
  async execExchangeByuserEx(request: ExecExchangeByuserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecExchangeByuserResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecExchangeByuserResponse>(await this.doRequest("1.0", "baas.antdao.exchange.byuser.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecExchangeByuserResponse({}));
  }

  /**
   * Description: 商户身份发起兑换
   * Summary: 数字商品服务-兑换服务-商户身份发起兑换
   */
  async execExchangeBymerchant(request: ExecExchangeBymerchantRequest): Promise<ExecExchangeBymerchantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execExchangeBymerchantEx(request, headers, runtime);
  }

  /**
   * Description: 商户身份发起兑换
   * Summary: 数字商品服务-兑换服务-商户身份发起兑换
   */
  async execExchangeBymerchantEx(request: ExecExchangeBymerchantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecExchangeBymerchantResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecExchangeBymerchantResponse>(await this.doRequest("1.0", "baas.antdao.exchange.bymerchant.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecExchangeBymerchantResponse({}));
  }

  /**
   * Description: 确认接单接口。注意：若确认接单则必须发货！如果不能确保发货则直接调用缺货接口。
   * Summary: 数字商品服务-兑换服务-确认接单
   */
  async confirmExchange(request: ConfirmExchangeRequest): Promise<ConfirmExchangeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmExchangeEx(request, headers, runtime);
  }

  /**
   * Description: 确认接单接口。注意：若确认接单则必须发货！如果不能确保发货则直接调用缺货接口。
   * Summary: 数字商品服务-兑换服务-确认接单
   */
  async confirmExchangeEx(request: ConfirmExchangeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmExchangeResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmExchangeResponse>(await this.doRequest("1.0", "baas.antdao.exchange.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmExchangeResponse({}));
  }

  /**
   * Description: 拒绝发货。供应商可由于缺货，商品不满足发货条件，意外状态下使用。
   * Summary: 数字商品服务-兑换服务-拒绝发货
   */
  async execExchangeOutofstore(request: ExecExchangeOutofstoreRequest): Promise<ExecExchangeOutofstoreResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execExchangeOutofstoreEx(request, headers, runtime);
  }

  /**
   * Description: 拒绝发货。供应商可由于缺货，商品不满足发货条件，意外状态下使用。
   * Summary: 数字商品服务-兑换服务-拒绝发货
   */
  async execExchangeOutofstoreEx(request: ExecExchangeOutofstoreRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecExchangeOutofstoreResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecExchangeOutofstoreResponse>(await this.doRequest("1.0", "baas.antdao.exchange.outofstore.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecExchangeOutofstoreResponse({}));
  }

  /**
   * Description: 兑换发货
   * Summary: 数字商品服务-兑换服务-兑换发货
   */
  async sendExchange(request: SendExchangeRequest): Promise<SendExchangeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendExchangeEx(request, headers, runtime);
  }

  /**
   * Description: 兑换发货
   * Summary: 数字商品服务-兑换服务-兑换发货
   */
  async sendExchangeEx(request: SendExchangeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendExchangeResponse> {
    Util.validateModel(request);
    return $tea.cast<SendExchangeResponse>(await this.doRequest("1.0", "baas.antdao.exchange.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendExchangeResponse({}));
  }

  /**
   * Description: 用户身份确认收货
   * Summary: 数字商品服务-兑换服务-用户身份确认收货
   */
  async execExchangeReceivebyuser(request: ExecExchangeReceivebyuserRequest): Promise<ExecExchangeReceivebyuserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execExchangeReceivebyuserEx(request, headers, runtime);
  }

  /**
   * Description: 用户身份确认收货
   * Summary: 数字商品服务-兑换服务-用户身份确认收货
   */
  async execExchangeReceivebyuserEx(request: ExecExchangeReceivebyuserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecExchangeReceivebyuserResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecExchangeReceivebyuserResponse>(await this.doRequest("1.0", "baas.antdao.exchange.receivebyuser.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecExchangeReceivebyuserResponse({}));
  }

  /**
   * Description: 资产过期
   * Summary: 数字商品服务-资产服务-资产过期
   */
  async execAssetExpire(request: ExecAssetExpireRequest): Promise<ExecAssetExpireResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execAssetExpireEx(request, headers, runtime);
  }

  /**
   * Description: 资产过期
   * Summary: 数字商品服务-资产服务-资产过期
   */
  async execAssetExpireEx(request: ExecAssetExpireRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecAssetExpireResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecAssetExpireResponse>(await this.doRequest("1.0", "baas.antdao.asset.expire.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecAssetExpireResponse({}));
  }

  /**
   * Description: 检索资产流转流水
   * Summary: 数字商品服务-资产服务-查询资产流转流水
   */
  async queryAssetInstruction(request: QueryAssetInstructionRequest): Promise<QueryAssetInstructionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAssetInstructionEx(request, headers, runtime);
  }

  /**
   * Description: 检索资产流转流水
   * Summary: 数字商品服务-资产服务-查询资产流转流水
   */
  async queryAssetInstructionEx(request: QueryAssetInstructionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAssetInstructionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAssetInstructionResponse>(await this.doRequest("1.0", "baas.antdao.asset.instruction.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAssetInstructionResponse({}));
  }

  /**
   * Description: 该接口废弃不用！！！
  查询商品兑换流水
   * Summary: 数字商品服务-兑换服务-查询商品兑换流水
   */
  async queryExchangeInstruction(request: QueryExchangeInstructionRequest): Promise<QueryExchangeInstructionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryExchangeInstructionEx(request, headers, runtime);
  }

  /**
   * Description: 该接口废弃不用！！！
  查询商品兑换流水
   * Summary: 数字商品服务-兑换服务-查询商品兑换流水
   */
  async queryExchangeInstructionEx(request: QueryExchangeInstructionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryExchangeInstructionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryExchangeInstructionResponse>(await this.doRequest("1.0", "baas.antdao.exchange.instruction.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryExchangeInstructionResponse({}));
  }

  /**
   * Description: 资产初始化发行
   * Summary: 数字商品服务-资产服务-资产初始化发行
   */
  async execAssetIssue(request: ExecAssetIssueRequest): Promise<ExecAssetIssueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execAssetIssueEx(request, headers, runtime);
  }

  /**
   * Description: 资产初始化发行
   * Summary: 数字商品服务-资产服务-资产初始化发行
   */
  async execAssetIssueEx(request: ExecAssetIssueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecAssetIssueResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecAssetIssueResponse>(await this.doRequest("1.0", "baas.antdao.asset.issue.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecAssetIssueResponse({}));
  }

  /**
   * Description: 赎回资产
   * Summary: 数字商品服务-资产服务-赎回资产
   */
  async execAssetRedeem(request: ExecAssetRedeemRequest): Promise<ExecAssetRedeemResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execAssetRedeemEx(request, headers, runtime);
  }

  /**
   * Description: 赎回资产
   * Summary: 数字商品服务-资产服务-赎回资产
   */
  async execAssetRedeemEx(request: ExecAssetRedeemRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecAssetRedeemResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecAssetRedeemResponse>(await this.doRequest("1.0", "baas.antdao.asset.redeem.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecAssetRedeemResponse({}));
  }

  /**
   * Description: 发放资产
   * Summary: 数字商品服务-资产服务-发放资产
   */
  async execAssetGrant(request: ExecAssetGrantRequest): Promise<ExecAssetGrantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execAssetGrantEx(request, headers, runtime);
  }

  /**
   * Description: 发放资产
   * Summary: 数字商品服务-资产服务-发放资产
   */
  async execAssetGrantEx(request: ExecAssetGrantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecAssetGrantResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecAssetGrantResponse>(await this.doRequest("1.0", "baas.antdao.asset.grant.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecAssetGrantResponse({}));
  }

  /**
   * Description: 发放回退资产
   * Summary: 数字商品服务-资产服务-发放回退资产
   */
  async execAssetGrantrefund(request: ExecAssetGrantrefundRequest): Promise<ExecAssetGrantrefundResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execAssetGrantrefundEx(request, headers, runtime);
  }

  /**
   * Description: 发放回退资产
   * Summary: 数字商品服务-资产服务-发放回退资产
   */
  async execAssetGrantrefundEx(request: ExecAssetGrantrefundRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecAssetGrantrefundResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecAssetGrantrefundResponse>(await this.doRequest("1.0", "baas.antdao.asset.grantrefund.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecAssetGrantrefundResponse({}));
  }

  /**
   * Description: 风控调整资产
   * Summary: 数字商品服务-资产服务-风控调整资产
   */
  async execAssetAdjust(request: ExecAssetAdjustRequest): Promise<ExecAssetAdjustResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execAssetAdjustEx(request, headers, runtime);
  }

  /**
   * Description: 风控调整资产
   * Summary: 数字商品服务-资产服务-风控调整资产
   */
  async execAssetAdjustEx(request: ExecAssetAdjustRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecAssetAdjustResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecAssetAdjustResponse>(await this.doRequest("1.0", "baas.antdao.asset.adjust.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecAssetAdjustResponse({}));
  }

  /**
   * Description: 资产查询
   * Summary: 数字商品服务-资产服务-资产查询
   */
  async queryAsset(request: QueryAssetRequest): Promise<QueryAssetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryAssetEx(request, headers, runtime);
  }

  /**
   * Description: 资产查询
   * Summary: 数字商品服务-资产服务-资产查询
   */
  async queryAssetEx(request: QueryAssetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryAssetResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryAssetResponse>(await this.doRequest("1.0", "baas.antdao.asset.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryAssetResponse({}));
  }

  /**
   * Description: 商户身份确认收货
   * Summary: 数字商品服务-兑换服务-商户身份确认收货
   */
  async execExchangeReceivebymerchant(request: ExecExchangeReceivebymerchantRequest): Promise<ExecExchangeReceivebymerchantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execExchangeReceivebymerchantEx(request, headers, runtime);
  }

  /**
   * Description: 商户身份确认收货
   * Summary: 数字商品服务-兑换服务-商户身份确认收货
   */
  async execExchangeReceivebymerchantEx(request: ExecExchangeReceivebymerchantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecExchangeReceivebymerchantResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecExchangeReceivebymerchantResponse>(await this.doRequest("1.0", "baas.antdao.exchange.receivebymerchant.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecExchangeReceivebymerchantResponse({}));
  }

  /**
   * Description: 获取特定高度的区块信息
   * Summary: 数字商品服务-拉块服务-获取区块信息
   */
  async queryBlock(request: QueryBlockRequest): Promise<QueryBlockResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBlockEx(request, headers, runtime);
  }

  /**
   * Description: 获取特定高度的区块信息
   * Summary: 数字商品服务-拉块服务-获取区块信息
   */
  async queryBlockEx(request: QueryBlockRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBlockResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBlockResponse>(await this.doRequest("1.0", "baas.antdao.block.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBlockResponse({}));
  }

  /**
   * Description: 获取区块链最新区块高度
   * Summary: 数字商品服务-拉块服务-获取最新区块高度
   */
  async queryBlockLastblocknumber(request: QueryBlockLastblocknumberRequest): Promise<QueryBlockLastblocknumberResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBlockLastblocknumberEx(request, headers, runtime);
  }

  /**
   * Description: 获取区块链最新区块高度
   * Summary: 数字商品服务-拉块服务-获取最新区块高度
   */
  async queryBlockLastblocknumberEx(request: QueryBlockLastblocknumberRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBlockLastblocknumberResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBlockLastblocknumberResponse>(await this.doRequest("1.0", "baas.antdao.block.lastblocknumber.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBlockLastblocknumberResponse({}));
  }

  /**
   * Description: 更新商品信息
   * Summary: 数字商品服务-商品服务-更新商品属性信息
   */
  async updateEquity(request: UpdateEquityRequest): Promise<UpdateEquityResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateEquityEx(request, headers, runtime);
  }

  /**
   * Description: 更新商品信息
   * Summary: 数字商品服务-商品服务-更新商品属性信息
   */
  async updateEquityEx(request: UpdateEquityRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateEquityResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateEquityResponse>(await this.doRequest("1.0", "baas.antdao.equity.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateEquityResponse({}));
  }

  /**
   * Description: 配合异步发布权益接口，查询发布权益商品结果。如查询无结果，判断错误类型，用户需要轮询。
   * Summary: 数字商品服务-商品服务-发布商品结果查询
   */
  async queryEquityCreateresult(request: QueryEquityCreateresultRequest): Promise<QueryEquityCreateresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEquityCreateresultEx(request, headers, runtime);
  }

  /**
   * Description: 配合异步发布权益接口，查询发布权益商品结果。如查询无结果，判断错误类型，用户需要轮询。
   * Summary: 数字商品服务-商品服务-发布商品结果查询
   */
  async queryEquityCreateresultEx(request: QueryEquityCreateresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEquityCreateresultResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEquityCreateresultResponse>(await this.doRequest("1.0", "baas.antdao.equity.createresult.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEquityCreateresultResponse({}));
  }

  /**
   * Description: 根据商品兑换流水交易号查询商品兑换流水详情
   * Summary: 数字商品服务-商品服务-查询商品兑换流水
   */
  async queryEquityInstruction(request: QueryEquityInstructionRequest): Promise<QueryEquityInstructionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryEquityInstructionEx(request, headers, runtime);
  }

  /**
   * Description: 根据商品兑换流水交易号查询商品兑换流水详情
   * Summary: 数字商品服务-商品服务-查询商品兑换流水
   */
  async queryEquityInstructionEx(request: QueryEquityInstructionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryEquityInstructionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryEquityInstructionResponse>(await this.doRequest("1.0", "baas.antdao.equity.instruction.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryEquityInstructionResponse({}));
  }

  /**
   * Description: 传入图片的不可访问URL，获取图片的临时可访问URL（支持批量查询）
   * Summary: 数字商品服务-OSS服务-获取图片URL
   */
  async queryImage(request: QueryImageRequest): Promise<QueryImageResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryImageEx(request, headers, runtime);
  }

  /**
   * Description: 传入图片的不可访问URL，获取图片的临时可访问URL（支持批量查询）
   * Summary: 数字商品服务-OSS服务-获取图片URL
   */
  async queryImageEx(request: QueryImageRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryImageResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryImageResponse>(await this.doRequest("1.0", "baas.antdao.image.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryImageResponse({}));
  }

  /**
   * Description: 更新商品状态（可用，冻结，下线）
   * Summary: 数字商品服务-商品服务-更新商品状态
   */
  async updateEquityStatus(request: UpdateEquityStatusRequest): Promise<UpdateEquityStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateEquityStatusEx(request, headers, runtime);
  }

  /**
   * Description: 更新商品状态（可用，冻结，下线）
   * Summary: 数字商品服务-商品服务-更新商品状态
   */
  async updateEquityStatusEx(request: UpdateEquityStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateEquityStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateEquityStatusResponse>(await this.doRequest("1.0", "baas.antdao.equity.status.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateEquityStatusResponse({}));
  }

  /**
   * Description: 设置备付金金额（CAS接口）
   * Summary: 数字商品服务-商户管理-设置备付金金额
   */
  async setMerchantProvision(request: SetMerchantProvisionRequest): Promise<SetMerchantProvisionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setMerchantProvisionEx(request, headers, runtime);
  }

  /**
   * Description: 设置备付金金额（CAS接口）
   * Summary: 数字商品服务-商户管理-设置备付金金额
   */
  async setMerchantProvisionEx(request: SetMerchantProvisionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetMerchantProvisionResponse> {
    Util.validateModel(request);
    return $tea.cast<SetMerchantProvisionResponse>(await this.doRequest("1.0", "baas.antdao.merchant.provision.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetMerchantProvisionResponse({}));
  }

  /**
   * Description: 更新商户的备付金金额，由资金管理员操作
   * Summary: 数字商品服务-商户管理-更新备付金金额
   */
  async updateMerchantProvision(request: UpdateMerchantProvisionRequest): Promise<UpdateMerchantProvisionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateMerchantProvisionEx(request, headers, runtime);
  }

  /**
   * Description: 更新商户的备付金金额，由资金管理员操作
   * Summary: 数字商品服务-商户管理-更新备付金金额
   */
  async updateMerchantProvisionEx(request: UpdateMerchantProvisionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateMerchantProvisionResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateMerchantProvisionResponse>(await this.doRequest("1.0", "baas.antdao.merchant.provision.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateMerchantProvisionResponse({}));
  }

  /**
   * Description: 核销商品兑换交易，由资金管理员操作
   * Summary: 数字商品服务-商品服务-核销商品兑换交易
   */
  async execEquityInstructionwriteoff(request: ExecEquityInstructionwriteoffRequest): Promise<ExecEquityInstructionwriteoffResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execEquityInstructionwriteoffEx(request, headers, runtime);
  }

  /**
   * Description: 核销商品兑换交易，由资金管理员操作
   * Summary: 数字商品服务-商品服务-核销商品兑换交易
   */
  async execEquityInstructionwriteoffEx(request: ExecEquityInstructionwriteoffRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecEquityInstructionwriteoffResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecEquityInstructionwriteoffResponse>(await this.doRequest("1.0", "baas.antdao.equity.instructionwriteoff.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecEquityInstructionwriteoffResponse({}));
  }

  /**
   * Description: 查询租户的备付金列表
   * Summary: 数字商品服务-商户管理-查租户备付金列表
   */
  async queryMerchantProvisions(request: QueryMerchantProvisionsRequest): Promise<QueryMerchantProvisionsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMerchantProvisionsEx(request, headers, runtime);
  }

  /**
   * Description: 查询租户的备付金列表
   * Summary: 数字商品服务-商户管理-查租户备付金列表
   */
  async queryMerchantProvisionsEx(request: QueryMerchantProvisionsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMerchantProvisionsResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMerchantProvisionsResponse>(await this.doRequest("1.0", "baas.antdao.merchant.provisions.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMerchantProvisionsResponse({}));
  }

  /**
   * Description: 只有特定的商户才能调用，代理到数字商品管理自营后台的商户才能查询到信息。查询商户可兑换商品列表
   * Summary: 数字商品服务-商户管理-查询可兑换商品
   */
  async queryMerchantExchangeableequitylist(request: QueryMerchantExchangeableequitylistRequest): Promise<QueryMerchantExchangeableequitylistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMerchantExchangeableequitylistEx(request, headers, runtime);
  }

  /**
   * Description: 只有特定的商户才能调用，代理到数字商品管理自营后台的商户才能查询到信息。查询商户可兑换商品列表
   * Summary: 数字商品服务-商户管理-查询可兑换商品
   */
  async queryMerchantExchangeableequitylistEx(request: QueryMerchantExchangeableequitylistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMerchantExchangeableequitylistResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMerchantExchangeableequitylistResponse>(await this.doRequest("1.0", "baas.antdao.merchant.exchangeableequitylist.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMerchantExchangeableequitylistResponse({}));
  }

  /**
   * Description: 只有特定的商户才能调用，代理到数字商品管理自营后台的商户才能查询到信息。查询商户可兑换的商品明细信息
   * Summary: 数字商品服务-商户管理-查询可兑商品明细
   */
  async queryMerchantExchangeableequitydetail(request: QueryMerchantExchangeableequitydetailRequest): Promise<QueryMerchantExchangeableequitydetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMerchantExchangeableequitydetailEx(request, headers, runtime);
  }

  /**
   * Description: 只有特定的商户才能调用，代理到数字商品管理自营后台的商户才能查询到信息。查询商户可兑换的商品明细信息
   * Summary: 数字商品服务-商户管理-查询可兑商品明细
   */
  async queryMerchantExchangeableequitydetailEx(request: QueryMerchantExchangeableequitydetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMerchantExchangeableequitydetailResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMerchantExchangeableequitydetailResponse>(await this.doRequest("1.0", "baas.antdao.merchant.exchangeableequitydetail.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMerchantExchangeableequitydetailResponse({}));
  }

  /**
   * Description: 创建新资产
   * Summary: 数字商品服务-资产服务-创建资产
   */
  async execAssetCreate(request: ExecAssetCreateRequest): Promise<ExecAssetCreateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execAssetCreateEx(request, headers, runtime);
  }

  /**
   * Description: 创建新资产
   * Summary: 数字商品服务-资产服务-创建资产
   */
  async execAssetCreateEx(request: ExecAssetCreateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecAssetCreateResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecAssetCreateResponse>(await this.doRequest("1.0", "baas.antdao.asset.create.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecAssetCreateResponse({}));
  }

  /**
   * Description: 资产铸币(不扣减备付金)，合约管理员操作
   * Summary: 数字商品服务-资产服务-资产铸币
   */
  async execAssetGenerate(request: ExecAssetGenerateRequest): Promise<ExecAssetGenerateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execAssetGenerateEx(request, headers, runtime);
  }

  /**
   * Description: 资产铸币(不扣减备付金)，合约管理员操作
   * Summary: 数字商品服务-资产服务-资产铸币
   */
  async execAssetGenerateEx(request: ExecAssetGenerateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecAssetGenerateResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecAssetGenerateResponse>(await this.doRequest("1.0", "baas.antdao.asset.generate.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecAssetGenerateResponse({}));
  }

  /**
   * Description: 创建商户（合约管理员权限）
   * Summary: 数字商品服务-商户管理-创建商户
   */
  async createMerchant(request: CreateMerchantRequest): Promise<CreateMerchantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createMerchantEx(request, headers, runtime);
  }

  /**
   * Description: 创建商户（合约管理员权限）
   * Summary: 数字商品服务-商户管理-创建商户
   */
  async createMerchantEx(request: CreateMerchantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateMerchantResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateMerchantResponse>(await this.doRequest("1.0", "baas.antdao.merchant.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateMerchantResponse({}));
  }

  /**
   * Description: 设置商户的资金管理员，重要权限，谨慎操作！
   * Summary: 数字商品服务-商户管理-设置资金管理员
   */
  async setMerchantFundmanager(request: SetMerchantFundmanagerRequest): Promise<SetMerchantFundmanagerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setMerchantFundmanagerEx(request, headers, runtime);
  }

  /**
   * Description: 设置商户的资金管理员，重要权限，谨慎操作！
   * Summary: 数字商品服务-商户管理-设置资金管理员
   */
  async setMerchantFundmanagerEx(request: SetMerchantFundmanagerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetMerchantFundmanagerResponse> {
    Util.validateModel(request);
    return $tea.cast<SetMerchantFundmanagerResponse>(await this.doRequest("1.0", "baas.antdao.merchant.fundmanager.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetMerchantFundmanagerResponse({}));
  }

  /**
   * Description: 创建备付金账户，合约管理员权限
   * Summary: 数字商品服务-商户管理-创建备付金账户
   */
  async createMerchantProvision(request: CreateMerchantProvisionRequest): Promise<CreateMerchantProvisionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createMerchantProvisionEx(request, headers, runtime);
  }

  /**
   * Description: 创建备付金账户，合约管理员权限
   * Summary: 数字商品服务-商户管理-创建备付金账户
   */
  async createMerchantProvisionEx(request: CreateMerchantProvisionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateMerchantProvisionResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateMerchantProvisionResponse>(await this.doRequest("1.0", "baas.antdao.merchant.provision.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateMerchantProvisionResponse({}));
  }

  /**
   * Description: 查询租户的授权代理权限
   * Summary: 数字商品服务-管理服务-代理权限查询
   */
  async queryConfigDelegaterelation(request: QueryConfigDelegaterelationRequest): Promise<QueryConfigDelegaterelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryConfigDelegaterelationEx(request, headers, runtime);
  }

  /**
   * Description: 查询租户的授权代理权限
   * Summary: 数字商品服务-管理服务-代理权限查询
   */
  async queryConfigDelegaterelationEx(request: QueryConfigDelegaterelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryConfigDelegaterelationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryConfigDelegaterelationResponse>(await this.doRequest("1.0", "baas.antdao.config.delegaterelation.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryConfigDelegaterelationResponse({}));
  }

  /**
   * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
   * Summary: 数字商品服务-管理服务-设置代理权限
   */
  async updateConfigDelegaterelation(request: UpdateConfigDelegaterelationRequest): Promise<UpdateConfigDelegaterelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateConfigDelegaterelationEx(request, headers, runtime);
  }

  /**
   * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
   * Summary: 数字商品服务-管理服务-设置代理权限
   */
  async updateConfigDelegaterelationEx(request: UpdateConfigDelegaterelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateConfigDelegaterelationResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateConfigDelegaterelationResponse>(await this.doRequest("1.0", "baas.antdao.config.delegaterelation.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateConfigDelegaterelationResponse({}));
  }

  /**
   * Description: 查询接口访问白名单信息
   * Summary: 数字商品服务-拉块服务-查询接口白名单
   */
  async queryConfigWhitelist(request: QueryConfigWhitelistRequest): Promise<QueryConfigWhitelistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryConfigWhitelistEx(request, headers, runtime);
  }

  /**
   * Description: 查询接口访问白名单信息
   * Summary: 数字商品服务-拉块服务-查询接口白名单
   */
  async queryConfigWhitelistEx(request: QueryConfigWhitelistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryConfigWhitelistResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryConfigWhitelistResponse>(await this.doRequest("1.0", "baas.antdao.config.whitelist.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryConfigWhitelistResponse({}));
  }

  /**
   * Description: 设置接口访问白名单
   * Summary: 数字商品服务-管理服务-设置访问白名单
   */
  async updateConfigWhitelist(request: UpdateConfigWhitelistRequest): Promise<UpdateConfigWhitelistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateConfigWhitelistEx(request, headers, runtime);
  }

  /**
   * Description: 设置接口访问白名单
   * Summary: 数字商品服务-管理服务-设置访问白名单
   */
  async updateConfigWhitelistEx(request: UpdateConfigWhitelistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateConfigWhitelistResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateConfigWhitelistResponse>(await this.doRequest("1.0", "baas.antdao.config.whitelist.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateConfigWhitelistResponse({}));
  }

  /**
   * Description: 兑换单申请售后（采购商）
   * Summary: 数字商品服务-兑换服务-申请售后(商家)
   */
  async applyExchangeAftersale(request: ApplyExchangeAftersaleRequest): Promise<ApplyExchangeAftersaleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyExchangeAftersaleEx(request, headers, runtime);
  }

  /**
   * Description: 兑换单申请售后（采购商）
   * Summary: 数字商品服务-兑换服务-申请售后(商家)
   */
  async applyExchangeAftersaleEx(request: ApplyExchangeAftersaleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyExchangeAftersaleResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyExchangeAftersaleResponse>(await this.doRequest("1.0", "baas.antdao.exchange.aftersale.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyExchangeAftersaleResponse({}));
  }

  /**
   * Description: 同意售后（供应商）
   * Summary: 数字商品服务-兑换服务-同意售后
   */
  async execExchangeAgreeaftersale(request: ExecExchangeAgreeaftersaleRequest): Promise<ExecExchangeAgreeaftersaleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execExchangeAgreeaftersaleEx(request, headers, runtime);
  }

  /**
   * Description: 同意售后（供应商）
   * Summary: 数字商品服务-兑换服务-同意售后
   */
  async execExchangeAgreeaftersaleEx(request: ExecExchangeAgreeaftersaleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecExchangeAgreeaftersaleResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecExchangeAgreeaftersaleResponse>(await this.doRequest("1.0", "baas.antdao.exchange.agreeaftersale.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecExchangeAgreeaftersaleResponse({}));
  }

  /**
   * Description: 拒绝售后（供应商）
   * Summary: 数字商品服务-兑换服务-拒绝售后
   */
  async refuseExchangeAftersale(request: RefuseExchangeAftersaleRequest): Promise<RefuseExchangeAftersaleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.refuseExchangeAftersaleEx(request, headers, runtime);
  }

  /**
   * Description: 拒绝售后（供应商）
   * Summary: 数字商品服务-兑换服务-拒绝售后
   */
  async refuseExchangeAftersaleEx(request: RefuseExchangeAftersaleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RefuseExchangeAftersaleResponse> {
    Util.validateModel(request);
    return $tea.cast<RefuseExchangeAftersaleResponse>(await this.doRequest("1.0", "baas.antdao.exchange.aftersale.refuse", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RefuseExchangeAftersaleResponse({}));
  }

  /**
   * Description: 重新发货（供应商）
   * Summary: 数字商品服务-兑换服务-重新发货
   */
  async sendExchangeAftersale(request: SendExchangeAftersaleRequest): Promise<SendExchangeAftersaleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendExchangeAftersaleEx(request, headers, runtime);
  }

  /**
   * Description: 重新发货（供应商）
   * Summary: 数字商品服务-兑换服务-重新发货
   */
  async sendExchangeAftersaleEx(request: SendExchangeAftersaleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendExchangeAftersaleResponse> {
    Util.validateModel(request);
    return $tea.cast<SendExchangeAftersaleResponse>(await this.doRequest("1.0", "baas.antdao.exchange.aftersale.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendExchangeAftersaleResponse({}));
  }

  /**
   * Description: 商户确认售后（供应商）comfirmaftersale
   * Summary:  数字商品服务-兑换服务-商户确认售后
   */
  async confirmExchangeAftersale(request: ConfirmExchangeAftersaleRequest): Promise<ConfirmExchangeAftersaleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmExchangeAftersaleEx(request, headers, runtime);
  }

  /**
   * Description: 商户确认售后（供应商）comfirmaftersale
   * Summary:  数字商品服务-兑换服务-商户确认售后
   */
  async confirmExchangeAftersaleEx(request: ConfirmExchangeAftersaleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmExchangeAftersaleResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmExchangeAftersaleResponse>(await this.doRequest("1.0", "baas.antdao.exchange.aftersale.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmExchangeAftersaleResponse({}));
  }

  /**
   * Description: 数字消费卡链上发布
   * Summary: 数字商品服务-存证服务-消费卡链上发布
   */
  async execDataDeposit(request: ExecDataDepositRequest): Promise<ExecDataDepositResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execDataDepositEx(request, headers, runtime);
  }

  /**
   * Description: 数字消费卡链上发布
   * Summary: 数字商品服务-存证服务-消费卡链上发布
   */
  async execDataDepositEx(request: ExecDataDepositRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecDataDepositResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecDataDepositResponse>(await this.doRequest("1.0", "baas.antdao.data.deposit.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecDataDepositResponse({}));
  }

  /**
   * Description: 设置商品兑换手续费
   * Summary: 数字商品服务-商品服务-设置商品手续费
   */
  async setCommission(request: SetCommissionRequest): Promise<SetCommissionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setCommissionEx(request, headers, runtime);
  }

  /**
   * Description: 设置商品兑换手续费
   * Summary: 数字商品服务-商品服务-设置商品手续费
   */
  async setCommissionEx(request: SetCommissionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetCommissionResponse> {
    Util.validateModel(request);
    return $tea.cast<SetCommissionResponse>(await this.doRequest("1.0", "baas.antdao.commission.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetCommissionResponse({}));
  }

  /**
   * Description: 查询商品手续费（可查询 当前生效 和 全部 的手续费信息）
   * Summary: 数字商品服务-商品服务-查询商品手续费
   */
  async queryCommission(request: QueryCommissionRequest): Promise<QueryCommissionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCommissionEx(request, headers, runtime);
  }

  /**
   * Description: 查询商品手续费（可查询 当前生效 和 全部 的手续费信息）
   * Summary: 数字商品服务-商品服务-查询商品手续费
   */
  async queryCommissionEx(request: QueryCommissionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCommissionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCommissionResponse>(await this.doRequest("1.0", "baas.antdao.commission.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCommissionResponse({}));
  }

  /**
   * Description: 设置收取手续费的商户信息（合约管理员权限）
   * Summary: 数字商品服务-商品服务-设置收手续费商户
   */
  async setCommissionMerchant(request: SetCommissionMerchantRequest): Promise<SetCommissionMerchantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setCommissionMerchantEx(request, headers, runtime);
  }

  /**
   * Description: 设置收取手续费的商户信息（合约管理员权限）
   * Summary: 数字商品服务-商品服务-设置收手续费商户
   */
  async setCommissionMerchantEx(request: SetCommissionMerchantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetCommissionMerchantResponse> {
    Util.validateModel(request);
    return $tea.cast<SetCommissionMerchantResponse>(await this.doRequest("1.0", "baas.antdao.commission.merchant.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetCommissionMerchantResponse({}));
  }

  /**
   * Description: 查询收取手续费的商户信息
   * Summary: 数字商品服务-商品服务-查询收手续费商户
   */
  async queryCommissionMerchant(request: QueryCommissionMerchantRequest): Promise<QueryCommissionMerchantResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCommissionMerchantEx(request, headers, runtime);
  }

  /**
   * Description: 查询收取手续费的商户信息
   * Summary: 数字商品服务-商品服务-查询收手续费商户
   */
  async queryCommissionMerchantEx(request: QueryCommissionMerchantRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCommissionMerchantResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCommissionMerchantResponse>(await this.doRequest("1.0", "baas.antdao.commission.merchant.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCommissionMerchantResponse({}));
  }

  /**
   * Description: 单独创建对应的链ID的链上账户
   * Summary: 数字商品服务-管理服务-创建链上账户
   */
  async createConfigChainaccount(request: CreateConfigChainaccountRequest): Promise<CreateConfigChainaccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createConfigChainaccountEx(request, headers, runtime);
  }

  /**
   * Description: 单独创建对应的链ID的链上账户
   * Summary: 数字商品服务-管理服务-创建链上账户
   */
  async createConfigChainaccountEx(request: CreateConfigChainaccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateConfigChainaccountResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateConfigChainaccountResponse>(await this.doRequest("1.0", "baas.antdao.config.chainaccount.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateConfigChainaccountResponse({}));
  }

  /**
   * Description: 买家发起套餐交易
   * Summary: 数字商品服务-IP授权服务-发起套餐交易
   */
  async startIpPackagetrade(request: StartIpPackagetradeRequest): Promise<StartIpPackagetradeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startIpPackagetradeEx(request, headers, runtime);
  }

  /**
   * Description: 买家发起套餐交易
   * Summary: 数字商品服务-IP授权服务-发起套餐交易
   */
  async startIpPackagetradeEx(request: StartIpPackagetradeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartIpPackagetradeResponse> {
    Util.validateModel(request);
    return $tea.cast<StartIpPackagetradeResponse>(await this.doRequest("1.0", "baas.antdao.ip.packagetrade.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartIpPackagetradeResponse({}));
  }

  /**
   * Description: 交易发起方取消交易，包括套餐交易和定向授权
   * Summary: 数字商品服务-IP授权服务-取消交易
   */
  async cancelIpPackagetrade(request: CancelIpPackagetradeRequest): Promise<CancelIpPackagetradeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelIpPackagetradeEx(request, headers, runtime);
  }

  /**
   * Description: 交易发起方取消交易，包括套餐交易和定向授权
   * Summary: 数字商品服务-IP授权服务-取消交易
   */
  async cancelIpPackagetradeEx(request: CancelIpPackagetradeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelIpPackagetradeResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelIpPackagetradeResponse>(await this.doRequest("1.0", "baas.antdao.ip.packagetrade.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelIpPackagetradeResponse({}));
  }

  /**
   * Description: 上传套餐交易销售数据
   * Summary: 数字商品服务-IP授权服务-上传套餐数据
   */
  async uploadIpPackagetradesales(request: UploadIpPackagetradesalesRequest): Promise<UploadIpPackagetradesalesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadIpPackagetradesalesEx(request, headers, runtime);
  }

  /**
   * Description: 上传套餐交易销售数据
   * Summary: 数字商品服务-IP授权服务-上传套餐数据
   */
  async uploadIpPackagetradesalesEx(request: UploadIpPackagetradesalesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadIpPackagetradesalesResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadIpPackagetradesalesResponse>(await this.doRequest("1.0", "baas.antdao.ip.packagetradesales.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadIpPackagetradesalesResponse({}));
  }

  /**
   * Description: 发起授权交易
   * Summary: 数字商品服务-IP授权服务-发起授权交易
   */
  async startIpAuthtrade(request: StartIpAuthtradeRequest): Promise<StartIpAuthtradeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startIpAuthtradeEx(request, headers, runtime);
  }

  /**
   * Description: 发起授权交易
   * Summary: 数字商品服务-IP授权服务-发起授权交易
   */
  async startIpAuthtradeEx(request: StartIpAuthtradeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartIpAuthtradeResponse> {
    Util.validateModel(request);
    return $tea.cast<StartIpAuthtradeResponse>(await this.doRequest("1.0", "baas.antdao.ip.authtrade.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartIpAuthtradeResponse({}));
  }

  /**
   * Description: 上传授权模式交易的销售数据
   * Summary: 数字商品服务-IP授权服务-上传销售数据
   */
  async uploadIpAuthtradesales(request: UploadIpAuthtradesalesRequest): Promise<UploadIpAuthtradesalesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadIpAuthtradesalesEx(request, headers, runtime);
  }

  /**
   * Description: 上传授权模式交易的销售数据
   * Summary: 数字商品服务-IP授权服务-上传销售数据
   */
  async uploadIpAuthtradesalesEx(request: UploadIpAuthtradesalesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadIpAuthtradesalesResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadIpAuthtradesalesResponse>(await this.doRequest("1.0", "baas.antdao.ip.authtradesales.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadIpAuthtradesalesResponse({}));
  }

  /**
   * Description: 取消授权模式下销售数据账单
   * Summary: 数字商品服务-IP授权服务-取消授权账单
   */
  async cancelIpAuthtradebill(request: CancelIpAuthtradebillRequest): Promise<CancelIpAuthtradebillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelIpAuthtradebillEx(request, headers, runtime);
  }

  /**
   * Description: 取消授权模式下销售数据账单
   * Summary: 数字商品服务-IP授权服务-取消授权账单
   */
  async cancelIpAuthtradebillEx(request: CancelIpAuthtradebillRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelIpAuthtradebillResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelIpAuthtradebillResponse>(await this.doRequest("1.0", "baas.antdao.ip.authtradebill.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelIpAuthtradebillResponse({}));
  }

  /**
   * Description: 查询账单支付状态
   * Summary: 数字商品服务-IP授权服务-查询账单状态
   */
  async queryIpBillstatus(request: QueryIpBillstatusRequest): Promise<QueryIpBillstatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIpBillstatusEx(request, headers, runtime);
  }

  /**
   * Description: 查询账单支付状态
   * Summary: 数字商品服务-IP授权服务-查询账单状态
   */
  async queryIpBillstatusEx(request: QueryIpBillstatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIpBillstatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIpBillstatusResponse>(await this.doRequest("1.0", "baas.antdao.ip.billstatus.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIpBillstatusResponse({}));
  }

  /**
   * Description: 查询订单信息，模糊查询和分页查询
   * Summary: 数字商品服务-IP授权服务-查询订单列表
   */
  async queryIpOrderlist(request: QueryIpOrderlistRequest): Promise<QueryIpOrderlistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIpOrderlistEx(request, headers, runtime);
  }

  /**
   * Description: 查询订单信息，模糊查询和分页查询
   * Summary: 数字商品服务-IP授权服务-查询订单列表
   */
  async queryIpOrderlistEx(request: QueryIpOrderlistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIpOrderlistResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIpOrderlistResponse>(await this.doRequest("1.0", "baas.antdao.ip.orderlist.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIpOrderlistResponse({}));
  }

  /**
   * Description: ip商品创建
   * Summary: 数字商品服务-IP授权服务-ip创建
   */
  async createIpGoods(request: CreateIpGoodsRequest): Promise<CreateIpGoodsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createIpGoodsEx(request, headers, runtime);
  }

  /**
   * Description: ip商品创建
   * Summary: 数字商品服务-IP授权服务-ip创建
   */
  async createIpGoodsEx(request: CreateIpGoodsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateIpGoodsResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateIpGoodsResponse>(await this.doRequest("1.0", "baas.antdao.ip.goods.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateIpGoodsResponse({}));
  }

  /**
   * Description: ip的渠道信息添加
   * Summary: 数字商品服务-IP授权服务-渠道信息添加
   */
  async addIpChannel(request: AddIpChannelRequest): Promise<AddIpChannelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addIpChannelEx(request, headers, runtime);
  }

  /**
   * Description: ip的渠道信息添加
   * Summary: 数字商品服务-IP授权服务-渠道信息添加
   */
  async addIpChannelEx(request: AddIpChannelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddIpChannelResponse> {
    Util.validateModel(request);
    return $tea.cast<AddIpChannelResponse>(await this.doRequest("1.0", "baas.antdao.ip.channel.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddIpChannelResponse({}));
  }

  /**
   * Description: 查询订单详情，包含销售数据
   * Summary: 数字商品服务-IP授权服务-查询订单详情
   */
  async queryIpOrderinfo(request: QueryIpOrderinfoRequest): Promise<QueryIpOrderinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIpOrderinfoEx(request, headers, runtime);
  }

  /**
   * Description: 查询订单详情，包含销售数据
   * Summary: 数字商品服务-IP授权服务-查询订单详情
   */
  async queryIpOrderinfoEx(request: QueryIpOrderinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIpOrderinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIpOrderinfoResponse>(await this.doRequest("1.0", "baas.antdao.ip.orderinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIpOrderinfoResponse({}));
  }

  /**
   * Description: 批量查询ip简略信息
   * Summary: 数字商品服务-IP授权服务-批量查询
   */
  async batchqueryIpGoods(request: BatchqueryIpGoodsRequest): Promise<BatchqueryIpGoodsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryIpGoodsEx(request, headers, runtime);
  }

  /**
   * Description: 批量查询ip简略信息
   * Summary: 数字商品服务-IP授权服务-批量查询
   */
  async batchqueryIpGoodsEx(request: BatchqueryIpGoodsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryIpGoodsResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryIpGoodsResponse>(await this.doRequest("1.0", "baas.antdao.ip.goods.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryIpGoodsResponse({}));
  }

  /**
   * Description: 根据渠道查询详细的信息
   * Summary: 数字商品服务-IP授权服务-查询渠道详细
   */
  async queryIpGoodsdetailwithchannel(request: QueryIpGoodsdetailwithchannelRequest): Promise<QueryIpGoodsdetailwithchannelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIpGoodsdetailwithchannelEx(request, headers, runtime);
  }

  /**
   * Description: 根据渠道查询详细的信息
   * Summary: 数字商品服务-IP授权服务-查询渠道详细
   */
  async queryIpGoodsdetailwithchannelEx(request: QueryIpGoodsdetailwithchannelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIpGoodsdetailwithchannelResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIpGoodsdetailwithchannelResponse>(await this.doRequest("1.0", "baas.antdao.ip.goodsdetailwithchannel.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIpGoodsdetailwithchannelResponse({}));
  }

  /**
   * Description: ip的所有信息 包括渠道和sku
   * Summary: 数字商品服务-IP授权服务-IP详情查询
   */
  async queryIpDetail(request: QueryIpDetailRequest): Promise<QueryIpDetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIpDetailEx(request, headers, runtime);
  }

  /**
   * Description: ip的所有信息 包括渠道和sku
   * Summary: 数字商品服务-IP授权服务-IP详情查询
   */
  async queryIpDetailEx(request: QueryIpDetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIpDetailResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIpDetailResponse>(await this.doRequest("1.0", "baas.antdao.ip.detail.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIpDetailResponse({}));
  }

  /**
   * Description: ip商品创建
   * Summary: 数字商品服务-IP授权服务-ip更新
   */
  async updateIpGoods(request: UpdateIpGoodsRequest): Promise<UpdateIpGoodsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateIpGoodsEx(request, headers, runtime);
  }

  /**
   * Description: ip商品创建
   * Summary: 数字商品服务-IP授权服务-ip更新
   */
  async updateIpGoodsEx(request: UpdateIpGoodsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateIpGoodsResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateIpGoodsResponse>(await this.doRequest("1.0", "baas.antdao.ip.goods.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateIpGoodsResponse({}));
  }

  /**
   * Description: ip的渠道信息修改
   * Summary: 数字商品服务-IP授权服务-渠道信息更新
   */
  async updateIpChannel(request: UpdateIpChannelRequest): Promise<UpdateIpChannelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateIpChannelEx(request, headers, runtime);
  }

  /**
   * Description: ip的渠道信息修改
   * Summary: 数字商品服务-IP授权服务-渠道信息更新
   */
  async updateIpChannelEx(request: UpdateIpChannelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateIpChannelResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateIpChannelResponse>(await this.doRequest("1.0", "baas.antdao.ip.channel.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateIpChannelResponse({}));
  }

  /**
   * Description: ip上线
   * Summary: 数字商品服务-IP授权服务-上架
   */
  async onlineIp(request: OnlineIpRequest): Promise<OnlineIpResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.onlineIpEx(request, headers, runtime);
  }

  /**
   * Description: ip上线
   * Summary: 数字商品服务-IP授权服务-上架
   */
  async onlineIpEx(request: OnlineIpRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OnlineIpResponse> {
    Util.validateModel(request);
    return $tea.cast<OnlineIpResponse>(await this.doRequest("1.0", "baas.antdao.ip.online", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OnlineIpResponse({}));
  }

  /**
   * Description: ip下线
   * Summary: 数字商品服务-IP授权服务-下架
   */
  async offlineIp(request: OfflineIpRequest): Promise<OfflineIpResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.offlineIpEx(request, headers, runtime);
  }

  /**
   * Description: ip下线
   * Summary: 数字商品服务-IP授权服务-下架
   */
  async offlineIpEx(request: OfflineIpRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OfflineIpResponse> {
    Util.validateModel(request);
    return $tea.cast<OfflineIpResponse>(await this.doRequest("1.0", "baas.antdao.ip.offline", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OfflineIpResponse({}));
  }

  /**
   * Description: IP授权交易服务: IP采购商和版权方的账户注册, 采购商注册账户完成即可以参与IP授权交易服务, 版权方需要根据具体需要完成二级商户创建操作后再参与IP授权交易服务。
   * Summary: 数字商品服务-IP授权服务-账户创建
   */
  async createIpAccount(request: CreateIpAccountRequest): Promise<CreateIpAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createIpAccountEx(request, headers, runtime);
  }

  /**
   * Description: IP授权交易服务: IP采购商和版权方的账户注册, 采购商注册账户完成即可以参与IP授权交易服务, 版权方需要根据具体需要完成二级商户创建操作后再参与IP授权交易服务。
   * Summary: 数字商品服务-IP授权服务-账户创建
   */
  async createIpAccountEx(request: CreateIpAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateIpAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateIpAccountResponse>(await this.doRequest("1.0", "baas.antdao.ip.account.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateIpAccountResponse({}));
  }

  /**
   * Description: IP授权交易服务: IP采购商和版权方的账户冻结, 账户冻结后无法参与IP授权交易活动。
   * Summary: 数字商品服务-IP授权服务-账户冻结
   */
  async freezeIpAccount(request: FreezeIpAccountRequest): Promise<FreezeIpAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.freezeIpAccountEx(request, headers, runtime);
  }

  /**
   * Description: IP授权交易服务: IP采购商和版权方的账户冻结, 账户冻结后无法参与IP授权交易活动。
   * Summary: 数字商品服务-IP授权服务-账户冻结
   */
  async freezeIpAccountEx(request: FreezeIpAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<FreezeIpAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<FreezeIpAccountResponse>(await this.doRequest("1.0", "baas.antdao.ip.account.freeze", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new FreezeIpAccountResponse({}));
  }

  /**
   * Description: IP授权交易服务: IP采购商和版权方的账户解冻, 对于已经被冻结的账户, 账户解冻后才可以参与IP授权交易活动。
   * Summary: 数字商品服务-IP授权服务-账户解冻
   */
  async unfreezeIpAccount(request: UnfreezeIpAccountRequest): Promise<UnfreezeIpAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.unfreezeIpAccountEx(request, headers, runtime);
  }

  /**
   * Description: IP授权交易服务: IP采购商和版权方的账户解冻, 对于已经被冻结的账户, 账户解冻后才可以参与IP授权交易活动。
   * Summary: 数字商品服务-IP授权服务-账户解冻
   */
  async unfreezeIpAccountEx(request: UnfreezeIpAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UnfreezeIpAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<UnfreezeIpAccountResponse>(await this.doRequest("1.0", "baas.antdao.ip.account.unfreeze", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UnfreezeIpAccountResponse({}));
  }

  /**
   * Description: IP授权交易服务: IP采购商和版权方的账户查询。
   * Summary: 数字商品服务-IP授权服务-账户查询
   */
  async queryIpAccount(request: QueryIpAccountRequest): Promise<QueryIpAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIpAccountEx(request, headers, runtime);
  }

  /**
   * Description: IP授权交易服务: IP采购商和版权方的账户查询。
   * Summary: 数字商品服务-IP授权服务-账户查询
   */
  async queryIpAccountEx(request: QueryIpAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIpAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIpAccountResponse>(await this.doRequest("1.0", "baas.antdao.ip.account.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIpAccountResponse({}));
  }

  /**
   * Description: 数字商品-IP授权交易服务-版权方申请: 版权方完成账户注册后需要完成版权方申请,异步流程需要查询申请结果。
   * Summary: 数字商品服务-IP授权服务-版权方申请
   */
  async applyIpAccount(request: ApplyIpAccountRequest): Promise<ApplyIpAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyIpAccountEx(request, headers, runtime);
  }

  /**
   * Description: 数字商品-IP授权交易服务-版权方申请: 版权方完成账户注册后需要完成版权方申请,异步流程需要查询申请结果。
   * Summary: 数字商品服务-IP授权服务-版权方申请
   */
  async applyIpAccountEx(request: ApplyIpAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyIpAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyIpAccountResponse>(await this.doRequest("1.0", "baas.antdao.ip.account.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyIpAccountResponse({}));
  }

  /**
   * Description: 数字商品-IP授权交易-版权方申请进度查询: 版权方申请流程需要人工审核和支付宝审核。
   * Summary: 数字商品服务-IP授权服务-查申请进度
   */
  async checkIpAccount(request: CheckIpAccountRequest): Promise<CheckIpAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkIpAccountEx(request, headers, runtime);
  }

  /**
   * Description: 数字商品-IP授权交易-版权方申请进度查询: 版权方申请流程需要人工审核和支付宝审核。
   * Summary: 数字商品服务-IP授权服务-查申请进度
   */
  async checkIpAccountEx(request: CheckIpAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckIpAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckIpAccountResponse>(await this.doRequest("1.0", "baas.antdao.ip.account.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckIpAccountResponse({}));
  }

  /**
   * Description: ip商品审批
   * Summary: 数字商品服务-IP授权服务-ip创建审批
   */
  async confirmIpGoods(request: ConfirmIpGoodsRequest): Promise<ConfirmIpGoodsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmIpGoodsEx(request, headers, runtime);
  }

  /**
   * Description: ip商品审批
   * Summary: 数字商品服务-IP授权服务-ip创建审批
   */
  async confirmIpGoodsEx(request: ConfirmIpGoodsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmIpGoodsResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmIpGoodsResponse>(await this.doRequest("1.0", "baas.antdao.ip.goods.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmIpGoodsResponse({}));
  }

  /**
   * Description: ip信息批量查询--给运营使用
  查询审批信息
   * Summary: 数字商品服务-IP授权服务-审批信息查询
   */
  async batchqueryIpApproval(request: BatchqueryIpApprovalRequest): Promise<BatchqueryIpApprovalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryIpApprovalEx(request, headers, runtime);
  }

  /**
   * Description: ip信息批量查询--给运营使用
  查询审批信息
   * Summary: 数字商品服务-IP授权服务-审批信息查询
   */
  async batchqueryIpApprovalEx(request: BatchqueryIpApprovalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryIpApprovalResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryIpApprovalResponse>(await this.doRequest("1.0", "baas.antdao.ip.approval.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryIpApprovalResponse({}));
  }

  /**
   * Description: 数字商品服务-IP授权服务-运营审核确认
   * Summary: 数字商品服务-IP授权服务-运营审核确认
   */
  async confirmIpAccount(request: ConfirmIpAccountRequest): Promise<ConfirmIpAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmIpAccountEx(request, headers, runtime);
  }

  /**
   * Description: 数字商品服务-IP授权服务-运营审核确认
   * Summary: 数字商品服务-IP授权服务-运营审核确认
   */
  async confirmIpAccountEx(request: ConfirmIpAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmIpAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmIpAccountResponse>(await this.doRequest("1.0", "baas.antdao.ip.account.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmIpAccountResponse({}));
  }

  /**
   * Description: 数字商品服务-IP授权服务-运营审核拒绝
   * Summary: 数字商品服务-IP授权服务-运营审核拒绝
   */
  async refuseIpAccount(request: RefuseIpAccountRequest): Promise<RefuseIpAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.refuseIpAccountEx(request, headers, runtime);
  }

  /**
   * Description: 数字商品服务-IP授权服务-运营审核拒绝
   * Summary: 数字商品服务-IP授权服务-运营审核拒绝
   */
  async refuseIpAccountEx(request: RefuseIpAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RefuseIpAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<RefuseIpAccountResponse>(await this.doRequest("1.0", "baas.antdao.ip.account.refuse", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RefuseIpAccountResponse({}));
  }

  /**
   * Description: 版权方进件信息的单个查询
   * Summary: 数字商品服务-IP授权服务-申请信息查询
   */
  async pullIpAccount(request: PullIpAccountRequest): Promise<PullIpAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pullIpAccountEx(request, headers, runtime);
  }

  /**
   * Description: 版权方进件信息的单个查询
   * Summary: 数字商品服务-IP授权服务-申请信息查询
   */
  async pullIpAccountEx(request: PullIpAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PullIpAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<PullIpAccountResponse>(await this.doRequest("1.0", "baas.antdao.ip.account.pull", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PullIpAccountResponse({}));
  }

  /**
   * Description: 数字商品服务-IP授权服务-MCC列表查询
   * Summary: 数字商品服务-IP授权服务-MCC查询
   */
  async queryIpMcc(request: QueryIpMccRequest): Promise<QueryIpMccResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIpMccEx(request, headers, runtime);
  }

  /**
   * Description: 数字商品服务-IP授权服务-MCC列表查询
   * Summary: 数字商品服务-IP授权服务-MCC查询
   */
  async queryIpMccEx(request: QueryIpMccRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIpMccResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIpMccResponse>(await this.doRequest("1.0", "baas.antdao.ip.mcc.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIpMccResponse({}));
  }

  /**
   * Description: 查询ip type和受众人群
   * Summary: 数字商品服务-IP授权服务-IP标签查询
   */
  async queryIpType(request: QueryIpTypeRequest): Promise<QueryIpTypeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIpTypeEx(request, headers, runtime);
  }

  /**
   * Description: 查询ip type和受众人群
   * Summary: 数字商品服务-IP授权服务-IP标签查询
   */
  async queryIpTypeEx(request: QueryIpTypeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIpTypeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIpTypeResponse>(await this.doRequest("1.0", "baas.antdao.ip.type.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIpTypeResponse({}));
  }

  /**
   * Description: ip审批信息批量查询（带上渠道信息）
   * Summary: 数字商品服务-IP授权服务-审批批量查询
   */
  async batchqueryIpApprovalandchannel(request: BatchqueryIpApprovalandchannelRequest): Promise<BatchqueryIpApprovalandchannelResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryIpApprovalandchannelEx(request, headers, runtime);
  }

  /**
   * Description: ip审批信息批量查询（带上渠道信息）
   * Summary: 数字商品服务-IP授权服务-审批批量查询
   */
  async batchqueryIpApprovalandchannelEx(request: BatchqueryIpApprovalandchannelRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryIpApprovalandchannelResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryIpApprovalandchannelResponse>(await this.doRequest("1.0", "baas.antdao.ip.approvalandchannel.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryIpApprovalandchannelResponse({}));
  }

  /**
   * Description: 版权方进件信息的批量查询
   * Summary: 数字商品服务-IP授权服务-查询商家信息
   */
  async batchqueryIpAccount(request: BatchqueryIpAccountRequest): Promise<BatchqueryIpAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryIpAccountEx(request, headers, runtime);
  }

  /**
   * Description: 版权方进件信息的批量查询
   * Summary: 数字商品服务-IP授权服务-查询商家信息
   */
  async batchqueryIpAccountEx(request: BatchqueryIpAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryIpAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryIpAccountResponse>(await this.doRequest("1.0", "baas.antdao.ip.account.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryIpAccountResponse({}));
  }

  /**
   * Description: 版权方待审批的批量查询
   * Summary: 数字商品服务-IP授权服务-查版权方申请
   */
  async batchqueryIpSeller(request: BatchqueryIpSellerRequest): Promise<BatchqueryIpSellerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryIpSellerEx(request, headers, runtime);
  }

  /**
   * Description: 版权方待审批的批量查询
   * Summary: 数字商品服务-IP授权服务-查版权方申请
   */
  async batchqueryIpSellerEx(request: BatchqueryIpSellerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryIpSellerResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryIpSellerResponse>(await this.doRequest("1.0", "baas.antdao.ip.seller.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryIpSellerResponse({}));
  }

  /**
   * Description: 数字商品服务-IP授权服务-正版码申请
   * Summary: 数字商品服务-IP授权服务-正版码申请
   */
  async applyIpCode(request: ApplyIpCodeRequest): Promise<ApplyIpCodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyIpCodeEx(request, headers, runtime);
  }

  /**
   * Description: 数字商品服务-IP授权服务-正版码申请
   * Summary: 数字商品服务-IP授权服务-正版码申请
   */
  async applyIpCodeEx(request: ApplyIpCodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyIpCodeResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyIpCodeResponse>(await this.doRequest("1.0", "baas.antdao.ip.code.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyIpCodeResponse({}));
  }

  /**
   * Description: 数字商品服务-IP授权服务-正版码分页查询
   * Summary: 数字商品服务-IP授权服务-正版码查询
   */
  async pagequeryIpCode(request: PagequeryIpCodeRequest): Promise<PagequeryIpCodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryIpCodeEx(request, headers, runtime);
  }

  /**
   * Description: 数字商品服务-IP授权服务-正版码分页查询
   * Summary: 数字商品服务-IP授权服务-正版码查询
   */
  async pagequeryIpCodeEx(request: PagequeryIpCodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryIpCodeResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryIpCodeResponse>(await this.doRequest("1.0", "baas.antdao.ip.code.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryIpCodeResponse({}));
  }

  /**
   * Description: 数字商品服务-IP授权服务-正版码校验
   * Summary: 数字商品服务-IP授权服务-正版码校验
   */
  async checkIpCode(request: CheckIpCodeRequest): Promise<CheckIpCodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkIpCodeEx(request, headers, runtime);
  }

  /**
   * Description: 数字商品服务-IP授权服务-正版码校验
   * Summary: 数字商品服务-IP授权服务-正版码校验
   */
  async checkIpCodeEx(request: CheckIpCodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckIpCodeResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckIpCodeResponse>(await this.doRequest("1.0", "baas.antdao.ip.code.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckIpCodeResponse({}));
  }

  /**
   * Description: 对商品的更新进行审核
   * Summary: 数字商品服务-IP授权服务-IP更新审核
   */
  async confirmIpUpdateapproval(request: ConfirmIpUpdateapprovalRequest): Promise<ConfirmIpUpdateapprovalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmIpUpdateapprovalEx(request, headers, runtime);
  }

  /**
   * Description: 对商品的更新进行审核
   * Summary: 数字商品服务-IP授权服务-IP更新审核
   */
  async confirmIpUpdateapprovalEx(request: ConfirmIpUpdateapprovalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmIpUpdateapprovalResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmIpUpdateapprovalResponse>(await this.doRequest("1.0", "baas.antdao.ip.updateapproval.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmIpUpdateapprovalResponse({}));
  }

  /**
   * Description: ip商品sku信息设置
   * Summary: 数字商品服务-IP授权服务-sku设置
   */
  async setIpSku(request: SetIpSkuRequest): Promise<SetIpSkuResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setIpSkuEx(request, headers, runtime);
  }

  /**
   * Description: ip商品sku信息设置
   * Summary: 数字商品服务-IP授权服务-sku设置
   */
  async setIpSkuEx(request: SetIpSkuRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetIpSkuResponse> {
    Util.validateModel(request);
    return $tea.cast<SetIpSkuResponse>(await this.doRequest("1.0", "baas.antdao.ip.sku.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetIpSkuResponse({}));
  }

  /**
   * Description: 查询商品基础信息的更新数据
   * Summary: 数字商品服务-IP授权服务-查询更新数据
   */
  async queryIpGoodsupdate(request: QueryIpGoodsupdateRequest): Promise<QueryIpGoodsupdateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIpGoodsupdateEx(request, headers, runtime);
  }

  /**
   * Description: 查询商品基础信息的更新数据
   * Summary: 数字商品服务-IP授权服务-查询更新数据
   */
  async queryIpGoodsupdateEx(request: QueryIpGoodsupdateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIpGoodsupdateResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIpGoodsupdateResponse>(await this.doRequest("1.0", "baas.antdao.ip.goodsupdate.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIpGoodsupdateResponse({}));
  }

  /**
   * Description: 查询账单信息，分页查询
   * Summary: 数字商品服务-IP授权服务-查询账单列表
   */
  async pagequeryIpBill(request: PagequeryIpBillRequest): Promise<PagequeryIpBillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryIpBillEx(request, headers, runtime);
  }

  /**
   * Description: 查询账单信息，分页查询
   * Summary: 数字商品服务-IP授权服务-查询账单列表
   */
  async pagequeryIpBillEx(request: PagequeryIpBillRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryIpBillResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryIpBillResponse>(await this.doRequest("1.0", "baas.antdao.ip.bill.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryIpBillResponse({}));
  }

  /**
   * Description: ip商品某个渠道默认sku查询
   * Summary: 数字商品服务-IP授权服务-sku查询
   */
  async queryIpSkuconfig(request: QueryIpSkuconfigRequest): Promise<QueryIpSkuconfigResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIpSkuconfigEx(request, headers, runtime);
  }

  /**
   * Description: ip商品某个渠道默认sku查询
   * Summary: 数字商品服务-IP授权服务-sku查询
   */
  async queryIpSkuconfigEx(request: QueryIpSkuconfigRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIpSkuconfigResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIpSkuconfigResponse>(await this.doRequest("1.0", "baas.antdao.ip.skuconfig.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIpSkuconfigResponse({}));
  }

  /**
   * Description: 数字商品服务-IP授权交易-版权方导入: 一链多端版权方互通
   * Summary: 数字商品服务-IP授权服务-版权方导入
   */
  async importIpAccount(request: ImportIpAccountRequest): Promise<ImportIpAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importIpAccountEx(request, headers, runtime);
  }

  /**
   * Description: 数字商品服务-IP授权交易-版权方导入: 一链多端版权方互通
   * Summary: 数字商品服务-IP授权服务-版权方导入
   */
  async importIpAccountEx(request: ImportIpAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportIpAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportIpAccountResponse>(await this.doRequest("1.0", "baas.antdao.ip.account.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportIpAccountResponse({}));
  }

  /**
   * Description: 商品特定渠道的sku信息清空
   * Summary: 数字商品服务-IP授权服务-sku清空
   */
  async removeIpSku(request: RemoveIpSkuRequest): Promise<RemoveIpSkuResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.removeIpSkuEx(request, headers, runtime);
  }

  /**
   * Description: 商品特定渠道的sku信息清空
   * Summary: 数字商品服务-IP授权服务-sku清空
   */
  async removeIpSkuEx(request: RemoveIpSkuRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RemoveIpSkuResponse> {
    Util.validateModel(request);
    return $tea.cast<RemoveIpSkuResponse>(await this.doRequest("1.0", "baas.antdao.ip.sku.remove", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RemoveIpSkuResponse({}));
  }

  /**
   * Description: 创建监修报审
   * Summary: 数字商品服务-IP授权服务-创建监修报审
   */
  async createIpSuperviseapprove(request: CreateIpSuperviseapproveRequest): Promise<CreateIpSuperviseapproveResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createIpSuperviseapproveEx(request, headers, runtime);
  }

  /**
   * Description: 创建监修报审
   * Summary: 数字商品服务-IP授权服务-创建监修报审
   */
  async createIpSuperviseapproveEx(request: CreateIpSuperviseapproveRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateIpSuperviseapproveResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateIpSuperviseapproveResponse>(await this.doRequest("1.0", "baas.antdao.ip.superviseapprove.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateIpSuperviseapproveResponse({}));
  }

  /**
   * Description: 监修报审审批
   * Summary: 数字商品服务-IP授权服务-监修报审审批
   */
  async confirmIpSuperviseapprove(request: ConfirmIpSuperviseapproveRequest): Promise<ConfirmIpSuperviseapproveResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmIpSuperviseapproveEx(request, headers, runtime);
  }

  /**
   * Description: 监修报审审批
   * Summary: 数字商品服务-IP授权服务-监修报审审批
   */
  async confirmIpSuperviseapproveEx(request: ConfirmIpSuperviseapproveRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmIpSuperviseapproveResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmIpSuperviseapproveResponse>(await this.doRequest("1.0", "baas.antdao.ip.superviseapprove.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmIpSuperviseapproveResponse({}));
  }

  /**
   * Description: 监修报审进度推进/重置
   * Summary: 数字商品服务-IP授权服务-推进监修报审
   */
  async pushIpSuperviseapprove(request: PushIpSuperviseapproveRequest): Promise<PushIpSuperviseapproveResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushIpSuperviseapproveEx(request, headers, runtime);
  }

  /**
   * Description: 监修报审进度推进/重置
   * Summary: 数字商品服务-IP授权服务-推进监修报审
   */
  async pushIpSuperviseapproveEx(request: PushIpSuperviseapproveRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushIpSuperviseapproveResponse> {
    Util.validateModel(request);
    return $tea.cast<PushIpSuperviseapproveResponse>(await this.doRequest("1.0", "baas.antdao.ip.superviseapprove.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushIpSuperviseapproveResponse({}));
  }

  /**
   * Description: 数字商品-IP授权交易-查询监修报审详情
   * Summary: 数字商品服务-IP授权服务-查询监修报审
   */
  async queryIpSuperviseapprove(request: QueryIpSuperviseapproveRequest): Promise<QueryIpSuperviseapproveResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIpSuperviseapproveEx(request, headers, runtime);
  }

  /**
   * Description: 数字商品-IP授权交易-查询监修报审详情
   * Summary: 数字商品服务-IP授权服务-查询监修报审
   */
  async queryIpSuperviseapproveEx(request: QueryIpSuperviseapproveRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIpSuperviseapproveResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIpSuperviseapproveResponse>(await this.doRequest("1.0", "baas.antdao.ip.superviseapprove.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIpSuperviseapproveResponse({}));
  }

  /**
   * Description: 领取正版码，如已被领取则返回被领取人昵称信息
   * Summary: 数字商品服务-IP授权服务-正版码领取
   */
  async receiveIpCode(request: ReceiveIpCodeRequest): Promise<ReceiveIpCodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.receiveIpCodeEx(request, headers, runtime);
  }

  /**
   * Description: 领取正版码，如已被领取则返回被领取人昵称信息
   * Summary: 数字商品服务-IP授权服务-正版码领取
   */
  async receiveIpCodeEx(request: ReceiveIpCodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReceiveIpCodeResponse> {
    Util.validateModel(request);
    return $tea.cast<ReceiveIpCodeResponse>(await this.doRequest("1.0", "baas.antdao.ip.code.receive", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReceiveIpCodeResponse({}));
  }

  /**
   * Description: 已领取或以扫描过的正版码列表，分页查询
   * Summary: 数字商品服务-IP授权服务-正版码列表
   */
  async pagequeryIpCodeinfo(request: PagequeryIpCodeinfoRequest): Promise<PagequeryIpCodeinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryIpCodeinfoEx(request, headers, runtime);
  }

  /**
   * Description: 已领取或以扫描过的正版码列表，分页查询
   * Summary: 数字商品服务-IP授权服务-正版码列表
   */
  async pagequeryIpCodeinfoEx(request: PagequeryIpCodeinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryIpCodeinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryIpCodeinfoResponse>(await this.doRequest("1.0", "baas.antdao.ip.codeinfo.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryIpCodeinfoResponse({}));
  }

  /**
   * Description: 创建增值服务
   * Summary: 数字商品服务-IP授权服务-创建增值服务
   */
  async createIpValueadd(request: CreateIpValueaddRequest): Promise<CreateIpValueaddResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createIpValueaddEx(request, headers, runtime);
  }

  /**
   * Description: 创建增值服务
   * Summary: 数字商品服务-IP授权服务-创建增值服务
   */
  async createIpValueaddEx(request: CreateIpValueaddRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateIpValueaddResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateIpValueaddResponse>(await this.doRequest("1.0", "baas.antdao.ip.valueadd.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateIpValueaddResponse({}));
  }

  /**
   * Description: 数字商品服务-IP授权服务-更新增值服务
   * Summary: 数字商品服务-IP授权服务-更新增值服务
   */
  async updateIpValueadd(request: UpdateIpValueaddRequest): Promise<UpdateIpValueaddResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateIpValueaddEx(request, headers, runtime);
  }

  /**
   * Description: 数字商品服务-IP授权服务-更新增值服务
   * Summary: 数字商品服务-IP授权服务-更新增值服务
   */
  async updateIpValueaddEx(request: UpdateIpValueaddRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateIpValueaddResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateIpValueaddResponse>(await this.doRequest("1.0", "baas.antdao.ip.valueadd.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateIpValueaddResponse({}));
  }

  /**
   * Description: 数字商品-IP授权-设置增值服务sku
   * Summary: 数字商品服务-IP授权服务-设置增值服务
   */
  async setIpValueaddsku(request: SetIpValueaddskuRequest): Promise<SetIpValueaddskuResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setIpValueaddskuEx(request, headers, runtime);
  }

  /**
   * Description: 数字商品-IP授权-设置增值服务sku
   * Summary: 数字商品服务-IP授权服务-设置增值服务
   */
  async setIpValueaddskuEx(request: SetIpValueaddskuRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetIpValueaddskuResponse> {
    Util.validateModel(request);
    return $tea.cast<SetIpValueaddskuResponse>(await this.doRequest("1.0", "baas.antdao.ip.valueaddsku.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetIpValueaddskuResponse({}));
  }

  /**
   * Description: 数字商品服务-IP授权服务-增值服务上下架操作
   * Summary: 数字商品服务-IP授权服务-服务上下架
   */
  async onlineIpValueadd(request: OnlineIpValueaddRequest): Promise<OnlineIpValueaddResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.onlineIpValueaddEx(request, headers, runtime);
  }

  /**
   * Description: 数字商品服务-IP授权服务-增值服务上下架操作
   * Summary: 数字商品服务-IP授权服务-服务上下架
   */
  async onlineIpValueaddEx(request: OnlineIpValueaddRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OnlineIpValueaddResponse> {
    Util.validateModel(request);
    return $tea.cast<OnlineIpValueaddResponse>(await this.doRequest("1.0", "baas.antdao.ip.valueadd.online", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OnlineIpValueaddResponse({}));
  }

  /**
   * Description: 数字商品-IP授权交易-增值服务查询
   * Summary: 数字商品服务-IP授权服务-增值服务查询
   */
  async queryIpValueadd(request: QueryIpValueaddRequest): Promise<QueryIpValueaddResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIpValueaddEx(request, headers, runtime);
  }

  /**
   * Description: 数字商品-IP授权交易-增值服务查询
   * Summary: 数字商品服务-IP授权服务-增值服务查询
   */
  async queryIpValueaddEx(request: QueryIpValueaddRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIpValueaddResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIpValueaddResponse>(await this.doRequest("1.0", "baas.antdao.ip.valueadd.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIpValueaddResponse({}));
  }

  /**
   * Description: 增值服务批量查询
   * Summary: 数字商品服务-IP授权服务-增值服务查询
   */
  async pagequeryIpValueadd(request: PagequeryIpValueaddRequest): Promise<PagequeryIpValueaddResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryIpValueaddEx(request, headers, runtime);
  }

  /**
   * Description: 增值服务批量查询
   * Summary: 数字商品服务-IP授权服务-增值服务查询
   */
  async pagequeryIpValueaddEx(request: PagequeryIpValueaddRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryIpValueaddResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryIpValueaddResponse>(await this.doRequest("1.0", "baas.antdao.ip.valueadd.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryIpValueaddResponse({}));
  }

  /**
   * Description: 批量上传授权交易的销售数据
   * Summary: 数字商品服务-IP授权服务-上传销售数据
   */
  async uploadIpTradesales(request: UploadIpTradesalesRequest): Promise<UploadIpTradesalesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadIpTradesalesEx(request, headers, runtime);
  }

  /**
   * Description: 批量上传授权交易的销售数据
   * Summary: 数字商品服务-IP授权服务-上传销售数据
   */
  async uploadIpTradesalesEx(request: UploadIpTradesalesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadIpTradesalesResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadIpTradesalesResponse>(await this.doRequest("1.0", "baas.antdao.ip.tradesales.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadIpTradesalesResponse({}));
  }

  /**
   * Description: C端用户授权信息
   * Summary: 数字商品服务-IP授权服务-C用户授权
   */
  async authIpUser(request: AuthIpUserRequest): Promise<AuthIpUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authIpUserEx(request, headers, runtime);
  }

  /**
   * Description: C端用户授权信息
   * Summary: 数字商品服务-IP授权服务-C用户授权
   */
  async authIpUserEx(request: AuthIpUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthIpUserResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthIpUserResponse>(await this.doRequest("1.0", "baas.antdao.ip.user.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthIpUserResponse({}));
  }

  /**
   * Description: 数字商品服务-IP授权服务-删除ip商品
   * Summary: 数字商品服务-IP授权服务-IP删除
   */
  async removeIpGoods(request: RemoveIpGoodsRequest): Promise<RemoveIpGoodsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.removeIpGoodsEx(request, headers, runtime);
  }

  /**
   * Description: 数字商品服务-IP授权服务-删除ip商品
   * Summary: 数字商品服务-IP授权服务-IP删除
   */
  async removeIpGoodsEx(request: RemoveIpGoodsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RemoveIpGoodsResponse> {
    Util.validateModel(request);
    return $tea.cast<RemoveIpGoodsResponse>(await this.doRequest("1.0", "baas.antdao.ip.goods.remove", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RemoveIpGoodsResponse({}));
  }

  /**
   * Description: 数字商品服务-IP授权服务-ip数量统计
   * Summary: 数字商品服务-IP授权服务-ip数量统计
   */
  async countIpNum(request: CountIpNumRequest): Promise<CountIpNumResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.countIpNumEx(request, headers, runtime);
  }

  /**
   * Description: 数字商品服务-IP授权服务-ip数量统计
   * Summary: 数字商品服务-IP授权服务-ip数量统计
   */
  async countIpNumEx(request: CountIpNumRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CountIpNumResponse> {
    Util.validateModel(request);
    return $tea.cast<CountIpNumResponse>(await this.doRequest("1.0", "baas.antdao.ip.num.count", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CountIpNumResponse({}));
  }

  /**
   * Description: 数字商品服务-IP授权服务-pv统计
   * Summary: 数字商品服务-IP授权服务-pv统计
   */
  async countIpPv(request: CountIpPvRequest): Promise<CountIpPvResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.countIpPvEx(request, headers, runtime);
  }

  /**
   * Description: 数字商品服务-IP授权服务-pv统计
   * Summary: 数字商品服务-IP授权服务-pv统计
   */
  async countIpPvEx(request: CountIpPvRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CountIpPvResponse> {
    Util.validateModel(request);
    return $tea.cast<CountIpPvResponse>(await this.doRequest("1.0", "baas.antdao.ip.pv.count", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CountIpPvResponse({}));
  }

  /**
   * Description: 查询正版码信息
   * Summary: 数字商品服务-IP授权服务-正版码查询
   */
  async queryIpCode(request: QueryIpCodeRequest): Promise<QueryIpCodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIpCodeEx(request, headers, runtime);
  }

  /**
   * Description: 查询正版码信息
   * Summary: 数字商品服务-IP授权服务-正版码查询
   */
  async queryIpCodeEx(request: QueryIpCodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIpCodeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIpCodeResponse>(await this.doRequest("1.0", "baas.antdao.ip.code.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIpCodeResponse({}));
  }

  /**
   * Description: 数字商品服务-IP授权服务-账户统计
   * Summary: 数字商品服务-IP授权服务-账户统计
   */
  async countIpAccount(request: CountIpAccountRequest): Promise<CountIpAccountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.countIpAccountEx(request, headers, runtime);
  }

  /**
   * Description: 数字商品服务-IP授权服务-账户统计
   * Summary: 数字商品服务-IP授权服务-账户统计
   */
  async countIpAccountEx(request: CountIpAccountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CountIpAccountResponse> {
    Util.validateModel(request);
    return $tea.cast<CountIpAccountResponse>(await this.doRequest("1.0", "baas.antdao.ip.account.count", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CountIpAccountResponse({}));
  }

  /**
   * Description: 查询渠道订单统计值
   * Summary: 数字商品服务-IP授权服务-查询订单统计
   */
  async queryIpOrderstatistic(request: QueryIpOrderstatisticRequest): Promise<QueryIpOrderstatisticResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIpOrderstatisticEx(request, headers, runtime);
  }

  /**
   * Description: 查询渠道订单统计值
   * Summary: 数字商品服务-IP授权服务-查询订单统计
   */
  async queryIpOrderstatisticEx(request: QueryIpOrderstatisticRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIpOrderstatisticResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIpOrderstatisticResponse>(await this.doRequest("1.0", "baas.antdao.ip.orderstatistic.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIpOrderstatisticResponse({}));
  }

  /**
   * Description: 版权方更新IP图库
   * Summary: 数字商品服务-IP授权服务-ip更新图库
   */
  async updateIpGoodsgallery(request: UpdateIpGoodsgalleryRequest): Promise<UpdateIpGoodsgalleryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateIpGoodsgalleryEx(request, headers, runtime);
  }

  /**
   * Description: 版权方更新IP图库
   * Summary: 数字商品服务-IP授权服务-ip更新图库
   */
  async updateIpGoodsgalleryEx(request: UpdateIpGoodsgalleryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateIpGoodsgalleryResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateIpGoodsgalleryResponse>(await this.doRequest("1.0", "baas.antdao.ip.goodsgallery.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateIpGoodsgalleryResponse({}));
  }

  /**
   * Description: 版权方根据IPID查询图库，商家根据订单ID查询图库
   * Summary: 数字商品服务-IP授权服务-查询ip图库
   */
  async queryIpGoodsgallery(request: QueryIpGoodsgalleryRequest): Promise<QueryIpGoodsgalleryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIpGoodsgalleryEx(request, headers, runtime);
  }

  /**
   * Description: 版权方根据IPID查询图库，商家根据订单ID查询图库
   * Summary: 数字商品服务-IP授权服务-查询ip图库
   */
  async queryIpGoodsgalleryEx(request: QueryIpGoodsgalleryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIpGoodsgalleryResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIpGoodsgalleryResponse>(await this.doRequest("1.0", "baas.antdao.ip.goodsgallery.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIpGoodsgalleryResponse({}));
  }

  /**
   * Description: 配置正版码的商品信息和资源位信息
   * Summary: 数字商品服务-IP授权服务-正版码配置
   */
  async setIpCodeinfo(request: SetIpCodeinfoRequest): Promise<SetIpCodeinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.setIpCodeinfoEx(request, headers, runtime);
  }

  /**
   * Description: 配置正版码的商品信息和资源位信息
   * Summary: 数字商品服务-IP授权服务-正版码配置
   */
  async setIpCodeinfoEx(request: SetIpCodeinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SetIpCodeinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<SetIpCodeinfoResponse>(await this.doRequest("1.0", "baas.antdao.ip.codeinfo.set", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SetIpCodeinfoResponse({}));
  }

  /**
   * Description: 查询订单的图库下载记录
   * Summary: 数字商品服务-IP授权服务-查询图库记录
   */
  async pagequeryIpGalleryinstruction(request: PagequeryIpGalleryinstructionRequest): Promise<PagequeryIpGalleryinstructionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pagequeryIpGalleryinstructionEx(request, headers, runtime);
  }

  /**
   * Description: 查询订单的图库下载记录
   * Summary: 数字商品服务-IP授权服务-查询图库记录
   */
  async pagequeryIpGalleryinstructionEx(request: PagequeryIpGalleryinstructionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PagequeryIpGalleryinstructionResponse> {
    Util.validateModel(request);
    return $tea.cast<PagequeryIpGalleryinstructionResponse>(await this.doRequest("1.0", "baas.antdao.ip.galleryinstruction.pagequery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PagequeryIpGalleryinstructionResponse({}));
  }

  /**
   * Description: 版权方确认订单图库信息
   * Summary: 数字商品服务-IP授权服务-订单图库确认
   */
  async confirmIpOrdergallery(request: ConfirmIpOrdergalleryRequest): Promise<ConfirmIpOrdergalleryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmIpOrdergalleryEx(request, headers, runtime);
  }

  /**
   * Description: 版权方确认订单图库信息
   * Summary: 数字商品服务-IP授权服务-订单图库确认
   */
  async confirmIpOrdergalleryEx(request: ConfirmIpOrdergalleryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmIpOrdergalleryResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmIpOrdergalleryResponse>(await this.doRequest("1.0", "baas.antdao.ip.ordergallery.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmIpOrdergalleryResponse({}));
  }

  /**
   * Description: 审批IP定向授权交易
   * Summary: 数字商品服务-IP授权服务-审批定向授权
   */
  async confirmIpAuthtrade(request: ConfirmIpAuthtradeRequest): Promise<ConfirmIpAuthtradeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmIpAuthtradeEx(request, headers, runtime);
  }

  /**
   * Description: 审批IP定向授权交易
   * Summary: 数字商品服务-IP授权服务-审批定向授权
   */
  async confirmIpAuthtradeEx(request: ConfirmIpAuthtradeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmIpAuthtradeResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmIpAuthtradeResponse>(await this.doRequest("1.0", "baas.antdao.ip.authtrade.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmIpAuthtradeResponse({}));
  }

  /**
   * Description: 审核套餐授权申请
   * Summary: 数字商品服务-IP授权服务-审批套餐授权
   */
  async confirmIpPackagetrade(request: ConfirmIpPackagetradeRequest): Promise<ConfirmIpPackagetradeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmIpPackagetradeEx(request, headers, runtime);
  }

  /**
   * Description: 审核套餐授权申请
   * Summary: 数字商品服务-IP授权服务-审批套餐授权
   */
  async confirmIpPackagetradeEx(request: ConfirmIpPackagetradeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmIpPackagetradeResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmIpPackagetradeResponse>(await this.doRequest("1.0", "baas.antdao.ip.packagetrade.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmIpPackagetradeResponse({}));
  }

  /**
   * Description: 商家申请套餐交易
   * Summary: 数字商品服务-IP授权服务-申请套餐交易
   */
  async applyIpPackagetrade(request: ApplyIpPackagetradeRequest): Promise<ApplyIpPackagetradeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyIpPackagetradeEx(request, headers, runtime);
  }

  /**
   * Description: 商家申请套餐交易
   * Summary: 数字商品服务-IP授权服务-申请套餐交易
   */
  async applyIpPackagetradeEx(request: ApplyIpPackagetradeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyIpPackagetradeResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyIpPackagetradeResponse>(await this.doRequest("1.0", "baas.antdao.ip.packagetrade.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyIpPackagetradeResponse({}));
  }

  /**
   * Description: 版权方申请授权交易
   * Summary: 数字商品服务-IP授权服务-申请授权交易
   */
  async applyIpAuthtrade(request: ApplyIpAuthtradeRequest): Promise<ApplyIpAuthtradeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyIpAuthtradeEx(request, headers, runtime);
  }

  /**
   * Description: 版权方申请授权交易
   * Summary: 数字商品服务-IP授权服务-申请授权交易
   */
  async applyIpAuthtradeEx(request: ApplyIpAuthtradeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyIpAuthtradeResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyIpAuthtradeResponse>(await this.doRequest("1.0", "baas.antdao.ip.authtrade.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyIpAuthtradeResponse({}));
  }

  /**
   * Description: 查询正版码的配置信息
   * Summary: 数字商品服务-IP授权服务-查正版码配置
   */
  async queryIpCodeinfo(request: QueryIpCodeinfoRequest): Promise<QueryIpCodeinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryIpCodeinfoEx(request, headers, runtime);
  }

  /**
   * Description: 查询正版码的配置信息
   * Summary: 数字商品服务-IP授权服务-查正版码配置
   */
  async queryIpCodeinfoEx(request: QueryIpCodeinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryIpCodeinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryIpCodeinfoResponse>(await this.doRequest("1.0", "baas.antdao.ip.codeinfo.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryIpCodeinfoResponse({}));
  }

  /**
   * Description: ip审批信息批量查询（带上更新信息，供天猫测使用）
   * Summary: ip审批信息批量查询（带上更新信息）
   */
  async batchqueryIpApprovalwithupdate(request: BatchqueryIpApprovalwithupdateRequest): Promise<BatchqueryIpApprovalwithupdateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryIpApprovalwithupdateEx(request, headers, runtime);
  }

  /**
   * Description: ip审批信息批量查询（带上更新信息，供天猫测使用）
   * Summary: ip审批信息批量查询（带上更新信息）
   */
  async batchqueryIpApprovalwithupdateEx(request: BatchqueryIpApprovalwithupdateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryIpApprovalwithupdateResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryIpApprovalwithupdateResponse>(await this.doRequest("1.0", "baas.antdao.ip.approvalwithupdate.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryIpApprovalwithupdateResponse({}));
  }

  /**
   * Description: 获取特定高度的区块信息
   * Summary: 数字商品服务-拉块服务-获取区块信息
   */
  async queryBlockanalysisBlock(request: QueryBlockanalysisBlockRequest): Promise<QueryBlockanalysisBlockResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBlockanalysisBlockEx(request, headers, runtime);
  }

  /**
   * Description: 获取特定高度的区块信息
   * Summary: 数字商品服务-拉块服务-获取区块信息
   */
  async queryBlockanalysisBlockEx(request: QueryBlockanalysisBlockRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBlockanalysisBlockResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBlockanalysisBlockResponse>(await this.doRequest("1.0", "baas.antdao.blockanalysis.block.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBlockanalysisBlockResponse({}));
  }

  /**
   * Description: 获取最新区块高度
   * Summary: 数字商品服务-拉块服务-获取最新区块高度
   */
  async queryBlockanalysisLastblocknumber(request: QueryBlockanalysisLastblocknumberRequest): Promise<QueryBlockanalysisLastblocknumberResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBlockanalysisLastblocknumberEx(request, headers, runtime);
  }

  /**
   * Description: 获取最新区块高度
   * Summary: 数字商品服务-拉块服务-获取最新区块高度
   */
  async queryBlockanalysisLastblocknumberEx(request: QueryBlockanalysisLastblocknumberRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBlockanalysisLastblocknumberResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBlockanalysisLastblocknumberResponse>(await this.doRequest("1.0", "baas.antdao.blockanalysis.lastblocknumber.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBlockanalysisLastblocknumberResponse({}));
  }

  /**
   * Description: 获取公开的或者已授权的权益商品信息
   * Summary: 数字商品服务-拉块服务-获取已授权商品
   */
  async queryBlockanalysisOpenedequities(request: QueryBlockanalysisOpenedequitiesRequest): Promise<QueryBlockanalysisOpenedequitiesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBlockanalysisOpenedequitiesEx(request, headers, runtime);
  }

  /**
   * Description: 获取公开的或者已授权的权益商品信息
   * Summary: 数字商品服务-拉块服务-获取已授权商品
   */
  async queryBlockanalysisOpenedequitiesEx(request: QueryBlockanalysisOpenedequitiesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBlockanalysisOpenedequitiesResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBlockanalysisOpenedequitiesResponse>(await this.doRequest("1.0", "baas.antdao.blockanalysis.openedequities.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBlockanalysisOpenedequitiesResponse({}));
  }

  /**
   * Description: 查询已设置过用户价格的有效权益商品信息
   * Summary: 数字商品服务-拉块服务-已设用户价格商品
   */
  async queryBlockanalysisUserpriceupdatedequities(request: QueryBlockanalysisUserpriceupdatedequitiesRequest): Promise<QueryBlockanalysisUserpriceupdatedequitiesResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBlockanalysisUserpriceupdatedequitiesEx(request, headers, runtime);
  }

  /**
   * Description: 查询已设置过用户价格的有效权益商品信息
   * Summary: 数字商品服务-拉块服务-已设用户价格商品
   */
  async queryBlockanalysisUserpriceupdatedequitiesEx(request: QueryBlockanalysisUserpriceupdatedequitiesRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBlockanalysisUserpriceupdatedequitiesResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBlockanalysisUserpriceupdatedequitiesResponse>(await this.doRequest("1.0", "baas.antdao.blockanalysis.userpriceupdatedequities.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBlockanalysisUserpriceupdatedequitiesResponse({}));
  }

  /**
   * Description: 查询商户的可提现资产价值(单位:分)
   * Summary: 数字商品服务-拉块服务-查询可提现资产
   */
  async queryBlockanalysisUnwriteoffvalue(request: QueryBlockanalysisUnwriteoffvalueRequest): Promise<QueryBlockanalysisUnwriteoffvalueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBlockanalysisUnwriteoffvalueEx(request, headers, runtime);
  }

  /**
   * Description: 查询商户的可提现资产价值(单位:分)
   * Summary: 数字商品服务-拉块服务-查询可提现资产
   */
  async queryBlockanalysisUnwriteoffvalueEx(request: QueryBlockanalysisUnwriteoffvalueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBlockanalysisUnwriteoffvalueResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBlockanalysisUnwriteoffvalueResponse>(await this.doRequest("1.0", "baas.antdao.blockanalysis.unwriteoffvalue.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBlockanalysisUnwriteoffvalueResponse({}));
  }

  /**
   * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
   * Summary: 数字商品服务-拉块服务-设置代理权限
   */
  async updateBlockanalysisDelegaterelation(request: UpdateBlockanalysisDelegaterelationRequest): Promise<UpdateBlockanalysisDelegaterelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateBlockanalysisDelegaterelationEx(request, headers, runtime);
  }

  /**
   * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
   * Summary: 数字商品服务-拉块服务-设置代理权限
   */
  async updateBlockanalysisDelegaterelationEx(request: UpdateBlockanalysisDelegaterelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateBlockanalysisDelegaterelationResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBlockanalysisDelegaterelationResponse>(await this.doRequest("1.0", "baas.antdao.blockanalysis.delegaterelation.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateBlockanalysisDelegaterelationResponse({}));
  }

  /**
   * Description: 设置接口访问白名单。
   * Summary: 数字商品服务-拉块服务-设置访问白名单
   */
  async updateBlockanalysisWhitelist(request: UpdateBlockanalysisWhitelistRequest): Promise<UpdateBlockanalysisWhitelistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateBlockanalysisWhitelistEx(request, headers, runtime);
  }

  /**
   * Description: 设置接口访问白名单。
   * Summary: 数字商品服务-拉块服务-设置访问白名单
   */
  async updateBlockanalysisWhitelistEx(request: UpdateBlockanalysisWhitelistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateBlockanalysisWhitelistResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBlockanalysisWhitelistResponse>(await this.doRequest("1.0", "baas.antdao.blockanalysis.whitelist.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateBlockanalysisWhitelistResponse({}));
  }

  /**
   * Description: 查询租户的授权代理权限
   * Summary: 数字商品服务-拉块服务-代理权限查询
   */
  async queryBlockanalysisDelegaterelation(request: QueryBlockanalysisDelegaterelationRequest): Promise<QueryBlockanalysisDelegaterelationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBlockanalysisDelegaterelationEx(request, headers, runtime);
  }

  /**
   * Description: 查询租户的授权代理权限
   * Summary: 数字商品服务-拉块服务-代理权限查询
   */
  async queryBlockanalysisDelegaterelationEx(request: QueryBlockanalysisDelegaterelationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBlockanalysisDelegaterelationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBlockanalysisDelegaterelationResponse>(await this.doRequest("1.0", "baas.antdao.blockanalysis.delegaterelation.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBlockanalysisDelegaterelationResponse({}));
  }

  /**
   * Description: 查询接口访问白名单信息
   * Summary: 数字商品服务-拉块服务-查询接口白名单
   */
  async queryBlockanalysisWhitelist(request: QueryBlockanalysisWhitelistRequest): Promise<QueryBlockanalysisWhitelistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBlockanalysisWhitelistEx(request, headers, runtime);
  }

  /**
   * Description: 查询接口访问白名单信息
   * Summary: 数字商品服务-拉块服务-查询接口白名单
   */
  async queryBlockanalysisWhitelistEx(request: QueryBlockanalysisWhitelistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBlockanalysisWhitelistResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBlockanalysisWhitelistResponse>(await this.doRequest("1.0", "baas.antdao.blockanalysis.whitelist.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBlockanalysisWhitelistResponse({}));
  }

  /**
   * Description: 根据交易hash获取交易信息
   * Summary: 数字商品服务-拉块服务-获取交易信息
   */
  async queryBlockanalysisTransaction(request: QueryBlockanalysisTransactionRequest): Promise<QueryBlockanalysisTransactionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBlockanalysisTransactionEx(request, headers, runtime);
  }

  /**
   * Description: 根据交易hash获取交易信息
   * Summary: 数字商品服务-拉块服务-获取交易信息
   */
  async queryBlockanalysisTransactionEx(request: QueryBlockanalysisTransactionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBlockanalysisTransactionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBlockanalysisTransactionResponse>(await this.doRequest("1.0", "baas.antdao.blockanalysis.transaction.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBlockanalysisTransactionResponse({}));
  }

  /**
   * Description: 获取商品的授权信息列表(一客一价信息)
   * Summary: 数字商品服务-拉块服务-获取商品授权信息
   */
  async queryBlockanalysisEquityauthlist(request: QueryBlockanalysisEquityauthlistRequest): Promise<QueryBlockanalysisEquityauthlistResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBlockanalysisEquityauthlistEx(request, headers, runtime);
  }

  /**
   * Description: 获取商品的授权信息列表(一客一价信息)
   * Summary: 数字商品服务-拉块服务-获取商品授权信息
   */
  async queryBlockanalysisEquityauthlistEx(request: QueryBlockanalysisEquityauthlistRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBlockanalysisEquityauthlistResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBlockanalysisEquityauthlistResponse>(await this.doRequest("1.0", "baas.antdao.blockanalysis.equityauthlist.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBlockanalysisEquityauthlistResponse({}));
  }

  /**
   * Description: 获取下一个与用户有关联交易的区块。需要传入超时时间，如果已到超时时间，则返回当前过滤的最高区块信息。
   * Summary: 数字商品服务-拉块服务-获取下个相关区块
   */
  async queryBlockanalysisNextblock(request: QueryBlockanalysisNextblockRequest): Promise<QueryBlockanalysisNextblockResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBlockanalysisNextblockEx(request, headers, runtime);
  }

  /**
   * Description: 获取下一个与用户有关联交易的区块。需要传入超时时间，如果已到超时时间，则返回当前过滤的最高区块信息。
   * Summary: 数字商品服务-拉块服务-获取下个相关区块
   */
  async queryBlockanalysisNextblockEx(request: QueryBlockanalysisNextblockRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBlockanalysisNextblockResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBlockanalysisNextblockResponse>(await this.doRequest("1.0", "baas.antdao.blockanalysis.nextblock.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBlockanalysisNextblockResponse({}));
  }

  /**
   * Description: 可订购的SKU列表查询
   * Summary: 数字商品服务-商品服务-商品列表查询
   */
  async queryMypointsSku(request: QueryMypointsSkuRequest): Promise<QueryMypointsSkuResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMypointsSkuEx(request, headers, runtime);
  }

  /**
   * Description: 可订购的SKU列表查询
   * Summary: 数字商品服务-商品服务-商品列表查询
   */
  async queryMypointsSkuEx(request: QueryMypointsSkuRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMypointsSkuResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMypointsSkuResponse>(await this.doRequest("1.0", "baas.antdao.mypoints.sku.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMypointsSkuResponse({}));
  }

  /**
   * Description: 查询商户的积分库和预算库
   * Summary: 数字商品服务-商品服务-积分预算库查询
   */
  async queryMypointsMerchantbalance(request: QueryMypointsMerchantbalanceRequest): Promise<QueryMypointsMerchantbalanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMypointsMerchantbalanceEx(request, headers, runtime);
  }

  /**
   * Description: 查询商户的积分库和预算库
   * Summary: 数字商品服务-商品服务-积分预算库查询
   */
  async queryMypointsMerchantbalanceEx(request: QueryMypointsMerchantbalanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMypointsMerchantbalanceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMypointsMerchantbalanceResponse>(await this.doRequest("1.0", "baas.antdao.mypoints.merchantbalance.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMypointsMerchantbalanceResponse({}));
  }

  /**
   * Description: 预下单商品
   * Summary: 数字商品服务-商品服务-商品预下单
   */
  async execMypointsPreordersku(request: ExecMypointsPreorderskuRequest): Promise<ExecMypointsPreorderskuResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execMypointsPreorderskuEx(request, headers, runtime);
  }

  /**
   * Description: 预下单商品
   * Summary: 数字商品服务-商品服务-商品预下单
   */
  async execMypointsPreorderskuEx(request: ExecMypointsPreorderskuRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecMypointsPreorderskuResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecMypointsPreorderskuResponse>(await this.doRequest("1.0", "baas.antdao.mypoints.preordersku.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecMypointsPreorderskuResponse({}));
  }

  /**
   * Description: 商品下单
   * Summary: 数字商品服务-商品服务-商品下单
   */
  async execMypointsOrdersku(request: ExecMypointsOrderskuRequest): Promise<ExecMypointsOrderskuResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.execMypointsOrderskuEx(request, headers, runtime);
  }

  /**
   * Description: 商品下单
   * Summary: 数字商品服务-商品服务-商品下单
   */
  async execMypointsOrderskuEx(request: ExecMypointsOrderskuRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ExecMypointsOrderskuResponse> {
    Util.validateModel(request);
    return $tea.cast<ExecMypointsOrderskuResponse>(await this.doRequest("1.0", "baas.antdao.mypoints.ordersku.exec", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ExecMypointsOrderskuResponse({}));
  }

  /**
   * Description: 根据商品ID，查询批量购买的费率
   * Summary: 数字商品服务-商品服务-商品费率查询
   */
  async queryMypointsSkufee(request: QueryMypointsSkufeeRequest): Promise<QueryMypointsSkufeeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMypointsSkufeeEx(request, headers, runtime);
  }

  /**
   * Description: 根据商品ID，查询批量购买的费率
   * Summary: 数字商品服务-商品服务-商品费率查询
   */
  async queryMypointsSkufeeEx(request: QueryMypointsSkufeeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMypointsSkufeeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMypointsSkufeeResponse>(await this.doRequest("1.0", "baas.antdao.mypoints.skufee.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMypointsSkufeeResponse({}));
  }

  /**
   * Description: 查询集分宝SKU的预下单流水记录
   * Summary: 数字商品服务-商品服务-预下单流水查询
   */
  async queryMypointsPreorderinstruction(request: QueryMypointsPreorderinstructionRequest): Promise<QueryMypointsPreorderinstructionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMypointsPreorderinstructionEx(request, headers, runtime);
  }

  /**
   * Description: 查询集分宝SKU的预下单流水记录
   * Summary: 数字商品服务-商品服务-预下单流水查询
   */
  async queryMypointsPreorderinstructionEx(request: QueryMypointsPreorderinstructionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMypointsPreorderinstructionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMypointsPreorderinstructionResponse>(await this.doRequest("1.0", "baas.antdao.mypoints.preorderinstruction.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMypointsPreorderinstructionResponse({}));
  }

  /**
   * Description: 查询下单流水信息
   * Summary: 数字商品服务-商品服务-商品下单流水查询
   */
  async queryMypointsOrderinstruction(request: QueryMypointsOrderinstructionRequest): Promise<QueryMypointsOrderinstructionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryMypointsOrderinstructionEx(request, headers, runtime);
  }

  /**
   * Description: 查询下单流水信息
   * Summary: 数字商品服务-商品服务-商品下单流水查询
   */
  async queryMypointsOrderinstructionEx(request: QueryMypointsOrderinstructionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryMypointsOrderinstructionResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryMypointsOrderinstructionResponse>(await this.doRequest("1.0", "baas.antdao.mypoints.orderinstruction.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryMypointsOrderinstructionResponse({}));
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
