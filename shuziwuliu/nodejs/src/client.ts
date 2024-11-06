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

// 创建凭证One
export class VoucherTestOne extends $tea.Model {
  // 测试Long
  voucherTestOneLong: number;
  // 测试String
  voucherTestOneString: string;
  // 测试Int
  voucherTestOneInt: number;
  // 测试Date
  voucherTestOneDate: string;
  // 测试Integer
  voucherTestOneInteger: number;
  // 测试Boolean
  voucherTestOneBoolean: boolean;
  static names(): { [key: string]: string } {
    return {
      voucherTestOneLong: 'voucher_test_one_long',
      voucherTestOneString: 'voucher_test_one_string',
      voucherTestOneInt: 'voucher_test_one_int',
      voucherTestOneDate: 'voucher_test_one_date',
      voucherTestOneInteger: 'voucher_test_one_integer',
      voucherTestOneBoolean: 'voucher_test_one_boolean',
    };
  }

  static types(): { [key: string]: any } {
    return {
      voucherTestOneLong: 'number',
      voucherTestOneString: 'string',
      voucherTestOneInt: 'number',
      voucherTestOneDate: 'string',
      voucherTestOneInteger: 'number',
      voucherTestOneBoolean: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应付资费项
export class PayTariffInfo extends $tea.Model {
  // 托运单号 [业务必填]
  orderNo?: string;
  // 应付资费项code [业务必填]
  // 
  // 
  payTariffCode?: string;
  // 应付资费项项目 [业务必填]
  // 
  // 
  payTariffProject?: string;
  // 资费项中文描述 [业务必填]
  // 
  // 
  payTariffDesc?: string;
  // 币种 [业务必填]
  currency?: string;
  // 资费项含税价 [业务必填]
  // 
  // 
  priceIncludingTax?: string;
  // 订舱单唯一性标识 [业务必填]
  bookingNo?: string;
  // 订舱单 [业务必填]
  bkgNo?: string;
  static names(): { [key: string]: string } {
    return {
      orderNo: 'order_no',
      payTariffCode: 'pay_tariff_code',
      payTariffProject: 'pay_tariff_project',
      payTariffDesc: 'pay_tariff_desc',
      currency: 'currency',
      priceIncludingTax: 'price_including_tax',
      bookingNo: 'booking_no',
      bkgNo: 'bkg_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderNo: 'string',
      payTariffCode: 'string',
      payTariffProject: 'string',
      payTariffDesc: 'string',
      currency: 'string',
      priceIncludingTax: 'string',
      bookingNo: 'string',
      bkgNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 人员伤残情况
export class PersonLoss extends $tea.Model {
  // 伤情，HOSPITALIZE-住院，CLINIC-门诊，DEATH-死亡，ALLOWANCE-津贴
  personInjuredCondition: string;
  // 伤者姓名
  personInjuredName: string;
  // 损失预估，单位（元），最多支持2位小数
  personLossEstimateAmount?: string;
  static names(): { [key: string]: string } {
    return {
      personInjuredCondition: 'person_injured_condition',
      personInjuredName: 'person_injured_name',
      personLossEstimateAmount: 'person_loss_estimate_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      personInjuredCondition: 'string',
      personInjuredName: 'string',
      personLossEstimateAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 集装箱信息
export class ContainerInfo extends $tea.Model {
  // 订舱单唯一标识
  bookingNo?: string;
  // 集装箱唯一标识
  containerId?: string;
  // 箱号
  containerNo?: string;
  // 箱型
  containerType?: string;
  static names(): { [key: string]: string } {
    return {
      bookingNo: 'booking_no',
      containerId: 'container_id',
      containerNo: 'container_no',
      containerType: 'container_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bookingNo: 'string',
      containerId: 'string',
      containerNo: 'string',
      containerType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 集装箱列表
export class MasterBlContainerParam extends $tea.Model {
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 集装箱ID
  containerId: string;
  // 箱号
  containerNo?: string;
  static names(): { [key: string]: string } {
    return {
      action: 'action',
      containerId: 'container_id',
      containerNo: 'container_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      action: 'string',
      containerId: 'string',
      containerNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 电子回单查询，具体凭证数据
export class ScpTicketIssueData extends $tea.Model {
  // 凭证对应的司机/货主的did
  did: string;
  // 	
  // 凭证id
  issueId: string;
  static names(): { [key: string]: string } {
    return {
      did: 'did',
      issueId: 'issue_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      did: 'string',
      issueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订舱单号
export class CustomsOrderBookingParam extends $tea.Model {
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 订舱单号
  bookingNo: string;
  static names(): { [key: string]: string } {
    return {
      action: 'action',
      bookingNo: 'booking_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      action: 'string',
      bookingNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 电子提单变更状态明细（无效）
export class EblStatusDeatil extends $tea.Model {
  // 当前提单状态
  currentEblStatus: string;
  // 电子提单编号
  eblNo: string;
  // 下一个提单状态
  nextEblStatus: string;
  static names(): { [key: string]: string } {
    return {
      currentEblStatus: 'current_ebl_status',
      eblNo: 'ebl_no',
      nextEblStatus: 'next_ebl_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      currentEblStatus: 'string',
      eblNo: 'string',
      nextEblStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 凭证id发行信息
export class IssueIdInfo extends $tea.Model {
  // 信用流转凭证
  issueId: string;
  // 全局唯一业务号
  outBizNo: string;
  // 合同号（预留）
  contractId?: string;
  // 发行信用流转的运单号
  waybillId: string;
  // 支付订单
  payOrder: string;
  // 凭证金额
  ticketAmt: string;
  // 信用凭证发起时间
  issueDate: string;
  // 信用凭证到期时间
  expireDate: string;
  // 发行结果状态 -1:发行失败状态， 0:未完成状态， 1:已发行状态
  status: number;
  // 失败原因信息
  errMsg: string;
  static names(): { [key: string]: string } {
    return {
      issueId: 'issue_id',
      outBizNo: 'out_biz_no',
      contractId: 'contract_id',
      waybillId: 'waybill_id',
      payOrder: 'pay_order',
      ticketAmt: 'ticket_amt',
      issueDate: 'issue_date',
      expireDate: 'expire_date',
      status: 'status',
      errMsg: 'err_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      issueId: 'string',
      outBizNo: 'string',
      contractId: 'string',
      waybillId: 'string',
      payOrder: 'string',
      ticketAmt: 'string',
      issueDate: 'string',
      expireDate: 'string',
      status: 'number',
      errMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 资费项发票
export class PayTariffInvoiceParam extends $tea.Model {
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 发票金额 业务必填
  invoiceAmount?: string;
  // 资费项金额 业务必填
  payTariffAmount?: string;
  // 资费单据编号 业务必填
  payTariffCode?: string;
  // 资费项发票code
  payTariffInvoiceCode: string;
  static names(): { [key: string]: string } {
    return {
      action: 'action',
      invoiceAmount: 'invoice_amount',
      payTariffAmount: 'pay_tariff_amount',
      payTariffCode: 'pay_tariff_code',
      payTariffInvoiceCode: 'pay_tariff_invoice_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      action: 'string',
      invoiceAmount: 'string',
      payTariffAmount: 'string',
      payTariffCode: 'string',
      payTariffInvoiceCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 航运订舱单号信息
export class BookingNoInfo extends $tea.Model {
  // 订舱单唯一标识
  bookingNo?: string;
  // 订舱号
  bkgNo?: string;
  static names(): { [key: string]: string } {
    return {
      bookingNo: 'booking_no',
      bkgNo: 'bkg_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bookingNo: 'string',
      bkgNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应收资费项
export class ReceiptTariffInfo extends $tea.Model {
  // 托运单号 [业务必填]
  orderNo?: string;
  // 应收资费项code [业务必填]
  // 
  // 
  receiptTariffCode?: string;
  // 应收资费项项目 [业务必填]
  receiptTariffProject?: string;
  // 资费项中文描述 [业务必填]
  // 
  // 
  receiptTariffDesc?: string;
  // 币种 [业务必填]
  currency?: string;
  // 资费项含税价 [业务必填]
  // 
  // 
  priceIncludingTax?: string;
  // 订舱单唯一标识 [业务必填]
  bookingNo?: string;
  // 订舱号 [业务必填]
  bkgNo?: string;
  static names(): { [key: string]: string } {
    return {
      orderNo: 'order_no',
      receiptTariffCode: 'receipt_tariff_code',
      receiptTariffProject: 'receipt_tariff_project',
      receiptTariffDesc: 'receipt_tariff_desc',
      currency: 'currency',
      priceIncludingTax: 'price_including_tax',
      bookingNo: 'booking_no',
      bkgNo: 'bkg_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderNo: 'string',
      receiptTariffCode: 'string',
      receiptTariffProject: 'string',
      receiptTariffDesc: 'string',
      currency: 'string',
      priceIncludingTax: 'string',
      bookingNo: 'string',
      bkgNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订舱单
export class HouseBlBookingParam extends $tea.Model {
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 订舱单号
  bookingNo: string;
  static names(): { [key: string]: string } {
    return {
      action: 'action',
      bookingNo: 'booking_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      action: 'string',
      bookingNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 库存货物
export class InventoryCargo extends $tea.Model {
  // 序号，在同一次库存申报请求中，序号保持不重复，不能小于等于0
  inventoryIndex: number;
  // sku品名
  sku: string;
  // 商品名称
  // 
  cargoName?: string;
  // 商品单品重量(kg)
  cargoWeight?: string;
  // 商品外扩长宽高(cm)
  cargoDimensions?: string;
  // 商品单品货物价值(元),最多支持2位小数
  cargoWorth?: string;
  // 当前库存货物数量
  currentInventoryCargoNum: number;
  // 客户代码
  // 
  customerCode: string;
  // 关联保单号,需要仓储CP做拆分计算
  policyNo?: string;
  // 入库时间, yyyy-MM-dd HH:mm:ss，需要仓储CP做拆分计算
  // 
  stockinDate?: string;
  // 时区,仓储CP上报入库时间所属的时区
  timezone?: string;
  static names(): { [key: string]: string } {
    return {
      inventoryIndex: 'inventory_index',
      sku: 'sku',
      cargoName: 'cargo_name',
      cargoWeight: 'cargo_weight',
      cargoDimensions: 'cargo_dimensions',
      cargoWorth: 'cargo_worth',
      currentInventoryCargoNum: 'current_inventory_cargo_num',
      customerCode: 'customer_code',
      policyNo: 'policy_no',
      stockinDate: 'stockin_date',
      timezone: 'timezone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      inventoryIndex: 'number',
      sku: 'string',
      cargoName: 'string',
      cargoWeight: 'string',
      cargoDimensions: 'string',
      cargoWorth: 'string',
      currentInventoryCargoNum: 'number',
      customerCode: 'string',
      policyNo: 'string',
      stockinDate: 'string',
      timezone: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// so通知关联的订舱单
export class SoNotifyBookingParam extends $tea.Model {
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 订舱单号
  bookingNo: string;
  // 船公司  业务必填 
  carrier?: string;
  // 箱型箱量 json格式 业务必填
  // [{"containerVolume":"33","containerType":"22"}]
  // containerVolume--箱量 业务必填
  // containerType--箱型 业务必填
  containerParams?: string;
  // 截关时间
  customsClearance?: number;
  // 场站
  cy?: string;
  // 截港时间
  cyClosing?: number;
  // 预计船期
  etd?: number;
  // 港口
  port?: string;
  // 截单时间
  siClosing?: number;
  // 船名  业务必填
  vessel?: string;
  // 航次 业务必填
  voyage?: string;
  static names(): { [key: string]: string } {
    return {
      action: 'action',
      bookingNo: 'booking_no',
      carrier: 'carrier',
      containerParams: 'container_params',
      customsClearance: 'customs_clearance',
      cy: 'cy',
      cyClosing: 'cy_closing',
      etd: 'etd',
      port: 'port',
      siClosing: 'si_closing',
      vessel: 'vessel',
      voyage: 'voyage',
    };
  }

  static types(): { [key: string]: any } {
    return {
      action: 'string',
      bookingNo: 'string',
      carrier: 'string',
      containerParams: 'string',
      customsClearance: 'number',
      cy: 'string',
      cyClosing: 'number',
      etd: 'number',
      port: 'string',
      siClosing: 'number',
      vessel: 'string',
      voyage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 签署方
export class AuthParty extends $tea.Model {
  // 签署方名称
  signPartyName: string;
  // 签署方证件类型，可以填写的枚举类：IDENTIFICATION_CARD，表示身份证
  signPartyCertType: string;
  // 签署方证件号码
  signPartyCertNum: string;
  // 签署结果（必填，FINISH,FAIL,REFUSE三者选一，分别表示签署完成、失败和拒签）
  signResult: string;
  // 签署失败或拒签原因（失败或拒签时必填）
  signFailReason?: string;
  // 签署时间(13位毫秒时间戳)
  signTime: string;
  static names(): { [key: string]: string } {
    return {
      signPartyName: 'sign_party_name',
      signPartyCertType: 'sign_party_cert_type',
      signPartyCertNum: 'sign_party_cert_num',
      signResult: 'sign_result',
      signFailReason: 'sign_fail_reason',
      signTime: 'sign_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      signPartyName: 'string',
      signPartyCertType: 'string',
      signPartyCertNum: 'string',
      signResult: 'string',
      signFailReason: 'string',
      signTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 电子提单变更状态明细
export class EblStatusDetail extends $tea.Model {
  // 当前提单状态
  currentEblStatus: string;
  // 电子提单编号
  eblNo: string;
  // 下一个提单状态
  nextEblStatus: string;
  static names(): { [key: string]: string } {
    return {
      currentEblStatus: 'current_ebl_status',
      eblNo: 'ebl_no',
      nextEblStatus: 'next_ebl_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      currentEblStatus: 'string',
      eblNo: 'string',
      nextEblStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 投保基本信息
export class InsureBaseInfo extends $tea.Model {
  // 投保人姓名
  tbrName: string;
  // 投保人证件号
  tbrIdNo: string;
  // 投保人证件类型
  tbrIdType: string;
  // 投保人联系电话
  tbrTel: string;
  // 投保人地址
  tbrAddr?: string;
  // 投保人邮箱
  tbrEmail: string;
  // 被保险人姓名
  bbrName: string;
  // 被保险人证件类型
  bbrIdType: string;
  // 被保险人证件号码
  bbrIdNo: string;
  // 被保险人联系电话
  bbrTel: string;
  // 被保险人地址
  bbrAddr?: string;
  // 含税保费(元)，小数点两位
  preMium: string;
  // 保险起期
  effDate: string;
  // 保险止期
  termDate: string;
  // 投保人证件类型有效起期
  idenrifyPeriodStart?: string;
  // 投保人证件类型有效止期
  identifyPeriodEnd?: string;
  static names(): { [key: string]: string } {
    return {
      tbrName: 'tbr_name',
      tbrIdNo: 'tbr_id_no',
      tbrIdType: 'tbr_id_type',
      tbrTel: 'tbr_tel',
      tbrAddr: 'tbr_addr',
      tbrEmail: 'tbr_email',
      bbrName: 'bbr_name',
      bbrIdType: 'bbr_id_type',
      bbrIdNo: 'bbr_id_no',
      bbrTel: 'bbr_tel',
      bbrAddr: 'bbr_addr',
      preMium: 'pre_mium',
      effDate: 'eff_date',
      termDate: 'term_date',
      idenrifyPeriodStart: 'idenrify_period_start',
      identifyPeriodEnd: 'identify_period_end',
    };
  }

  static types(): { [key: string]: any } {
    return {
      tbrName: 'string',
      tbrIdNo: 'string',
      tbrIdType: 'string',
      tbrTel: 'string',
      tbrAddr: 'string',
      tbrEmail: 'string',
      bbrName: 'string',
      bbrIdType: 'string',
      bbrIdNo: 'string',
      bbrTel: 'string',
      bbrAddr: 'string',
      preMium: 'string',
      effDate: 'string',
      termDate: 'string',
      idenrifyPeriodStart: 'string',
      identifyPeriodEnd: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 池融资凭证核验查询结果
export class PfVoucherCheckResult extends $tea.Model {
  // 凭证id
  voucherId: string;
  // 凭证类型
  voucherCategory: string;
  // 状态；PASS:通过，NO_PASS 未通过
  status: string;
  static names(): { [key: string]: string } {
    return {
      voucherId: 'voucher_id',
      voucherCategory: 'voucher_category',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      voucherId: 'string',
      voucherCategory: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 历史数据
export class UploadFinancingParam extends $tea.Model {
  // 订舱单量（票）
  bookingCount: number;
  // 唯一标识
  code: string;
  // 结束日期
  endDate: string;
  // 货代did
  forwarderDid: string;
  // 开始日期
  startDate: string;
  // 箱量【数量，不区分箱型，20GP是1TEU，40GP是2TEU】
  teu: number;
  // 运输总额
  amounts: string;
  static names(): { [key: string]: string } {
    return {
      bookingCount: 'booking_count',
      code: 'code',
      endDate: 'end_date',
      forwarderDid: 'forwarder_did',
      startDate: 'start_date',
      teu: 'teu',
      amounts: 'amounts',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bookingCount: 'number',
      code: 'string',
      endDate: 'string',
      forwarderDid: 'string',
      startDate: 'string',
      teu: 'number',
      amounts: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 链上hash
export class TxDto extends $tea.Model {
  // 链上凭证
  txCode: string;
  // 链上存储结构对应类型
  dataType: string;
  static names(): { [key: string]: string } {
    return {
      txCode: 'tx_code',
      dataType: 'data_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      txCode: 'string',
      dataType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 物流轨迹位置
export class LogisticLocation extends $tea.Model {
  // 结构化地址信息,规则遵循：国家、省份、城市、区县、城镇、乡村、街道、门牌号码、屋邨、大厦
  address?: string;
  // 行政区划代码
  cityCode?: string;
  // 纬度
  // 
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

// 用户凭证信息
export class UserIssueId extends $tea.Model {
  // 凭证id
  issueId: string;
  // 凭证余额
  balanceAmt: string;
  static names(): { [key: string]: string } {
    return {
      issueId: 'issue_id',
      balanceAmt: 'balance_amt',
    };
  }

  static types(): { [key: string]: any } {
    return {
      issueId: 'string',
      balanceAmt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 电子提单批次下提单明细（无效）
export class EblDeatil extends $tea.Model {
  // 电子提单copy文件hash
  eblCopyPdfFileHash: string;
  // 电子提单copy文件id
  eblCopyPdfFileId: string;
  // 电子提单编号
  eblNo: string;
  static names(): { [key: string]: string } {
    return {
      eblCopyPdfFileHash: 'ebl_copy_pdf_file_hash',
      eblCopyPdfFileId: 'ebl_copy_pdf_file_id',
      eblNo: 'ebl_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      eblCopyPdfFileHash: 'string',
      eblCopyPdfFileId: 'string',
      eblNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 入库货物
export class StockinCargo extends $tea.Model {
  // 入库序号，在同一次入库请求中，入库序号保持不重复，不能小于0
  stockinIndex: number;
  // sku品名
  // 
  sku: string;
  // 商品名称
  cargoName?: string;
  // 商品单品重量(kg)
  cargoWeight?: string;
  // 商品外扩长宽高(cm)
  cargoDimensions?: string;
  // 商品单品货物价值(元),，最多支持2位小数
  cargoWorth?: string;
  // 箱号
  containerNo?: string;
  // 实际入库件数
  actualStockinNum: number;
  static names(): { [key: string]: string } {
    return {
      stockinIndex: 'stockin_index',
      sku: 'sku',
      cargoName: 'cargo_name',
      cargoWeight: 'cargo_weight',
      cargoDimensions: 'cargo_dimensions',
      cargoWorth: 'cargo_worth',
      containerNo: 'container_no',
      actualStockinNum: 'actual_stockin_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      stockinIndex: 'number',
      sku: 'string',
      cargoName: 'string',
      cargoWeight: 'string',
      cargoDimensions: 'string',
      cargoWorth: 'string',
      containerNo: 'string',
      actualStockinNum: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 车辆损失详情 
export class CarLoss extends $tea.Model {
  // 车牌号，车牌号和车架号至少填一个
  carMark?: string;
  // 车主姓名 
  carOwnerName?: string;
  // 车主联系方式
  carOwnerContact?: string;
  // 车架号，车牌号和车架号至少填一个
  carVinNo?: string;
  // 损失预估，单位（元），最多支持2位小数
  carLossEstimateAmount: string;
  static names(): { [key: string]: string } {
    return {
      carMark: 'car_mark',
      carOwnerName: 'car_owner_name',
      carOwnerContact: 'car_owner_contact',
      carVinNo: 'car_vin_no',
      carLossEstimateAmount: 'car_loss_estimate_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      carMark: 'string',
      carOwnerName: 'string',
      carOwnerContact: 'string',
      carVinNo: 'string',
      carLossEstimateAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 物流金融信用流转流水信息
export class StatementInfo extends $tea.Model {
  // 信用流转批次号
  batchId: string;
  // 全局唯一业务号
  outBizNo: string;
  // 信用流转凭证
  issueId: string;
  // 合同号（预留）
  contractId?: string;
  // 发行信用流转的运单号
  waybillId: string;
  // 发行信用流转的支付单号
  payOrder: string;
  // 金额信息
  creditLimit: string;
  // 流水类型
  stateType: string;
  // 流水类型说明
  stateMsg: string;
  // 凭证来源方did
  fromDid: string;
  // 凭证流转方did
  toDid: string;
  // 信用凭证发起时间
  issueDate: string;
  // 信用凭证到期时间
  expireDate: string;
  static names(): { [key: string]: string } {
    return {
      batchId: 'batch_id',
      outBizNo: 'out_biz_no',
      issueId: 'issue_id',
      contractId: 'contract_id',
      waybillId: 'waybill_id',
      payOrder: 'pay_order',
      creditLimit: 'credit_limit',
      stateType: 'state_type',
      stateMsg: 'state_msg',
      fromDid: 'from_did',
      toDid: 'to_did',
      issueDate: 'issue_date',
      expireDate: 'expire_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      batchId: 'string',
      outBizNo: 'string',
      issueId: 'string',
      contractId: 'string',
      waybillId: 'string',
      payOrder: 'string',
      creditLimit: 'string',
      stateType: 'string',
      stateMsg: 'string',
      fromDid: 'string',
      toDid: 'string',
      issueDate: 'string',
      expireDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 附加条款
export class MainItemAdd extends $tea.Model {
  // 附加条款代码-参考保司提供样例
  mainItemAddCode?: string;
  // 附加条款内容-参考保司提供样例
  mainItemAddContent?: string;
  static names(): { [key: string]: string } {
    return {
      mainItemAddCode: 'main_item_add_code',
      mainItemAddContent: 'main_item_add_content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      mainItemAddCode: 'string',
      mainItemAddContent: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 订舱单
export class MasterBlBookingParam extends $tea.Model {
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 订舱单号
  bookingNo: string;
  static names(): { [key: string]: string } {
    return {
      action: 'action',
      bookingNo: 'booking_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      action: 'string',
      bookingNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// FinishWaybillOrderReq
export class FinishWaybillOrderReq extends $tea.Model {
  // 运费
  allFreight?: string;
  // 回单押金
  backFee?: string;
  // 货主支付运费金额
  consignorFreightAmount?: string;
  // 运费增项
  freightIncr?: string;
  // 运费扣减
  lossFee?: string;
  // 平台did
  platformDid: string;
  // 运单id
  taxWaybillId: string;
  static names(): { [key: string]: string } {
    return {
      allFreight: 'all_freight',
      backFee: 'back_fee',
      consignorFreightAmount: 'consignor_freight_amount',
      freightIncr: 'freight_incr',
      lossFee: 'loss_fee',
      platformDid: 'platform_did',
      taxWaybillId: 'tax_waybill_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      allFreight: 'string',
      backFee: 'string',
      consignorFreightAmount: 'string',
      freightIncr: 'string',
      lossFee: 'string',
      platformDid: 'string',
      taxWaybillId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// saas模式发行信息
export class SaasIssueApplyInfo extends $tea.Model {
  // 货源订单
  cargoOrder?: string;
  // 合同号
  contractId?: string;
  // 全局唯一业务单号
  outBizNo: string;
  // 支付单号
  payOrder: string;
  // 运单号
  waybillId: string;
  // 司机did
  driverDid: string;
  // 发行费
  freight: string;
  // 到期时间戳
  expireDate: string;
  static names(): { [key: string]: string } {
    return {
      cargoOrder: 'cargo_order',
      contractId: 'contract_id',
      outBizNo: 'out_biz_no',
      payOrder: 'pay_order',
      waybillId: 'waybill_id',
      driverDid: 'driver_did',
      freight: 'freight',
      expireDate: 'expire_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cargoOrder: 'string',
      contractId: 'string',
      outBizNo: 'string',
      payOrder: 'string',
      waybillId: 'string',
      driverDid: 'string',
      freight: 'string',
      expireDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 箱子信息
export class VehicleContainerParam extends $tea.Model {
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 集装箱ID
  containerId: string;
  // 箱号
  containerNo?: string;
  // 封号
  sealNo?: string;
  static names(): { [key: string]: string } {
    return {
      action: 'action',
      containerId: 'container_id',
      containerNo: 'container_no',
      sealNo: 'seal_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      action: 'string',
      containerId: 'string',
      containerNo: 'string',
      sealNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// A+模式发行信息
export class IssueApplyInfoPlus extends $tea.Model {
  // 订单中的BookingNo，以英文逗号分割
  bookingNo: string;
  // 船公司did
  carrierDid: string;
  // BookingNo中的箱号，以英文逗号分割
  containerNo: string;
  // 到期时间戳
  expireDate: string;
  // 发行金额，精确到小数点后2位
  issueAmt: string;
  // 全局唯一业务号
  outBizNo: string;
  // 支付单号
  outOrderNo: string;
  // 运单订单id
  waybillId: string;
  static names(): { [key: string]: string } {
    return {
      bookingNo: 'booking_no',
      carrierDid: 'carrier_did',
      containerNo: 'container_no',
      expireDate: 'expire_date',
      issueAmt: 'issue_amt',
      outBizNo: 'out_biz_no',
      outOrderNo: 'out_order_no',
      waybillId: 'waybill_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bookingNo: 'string',
      carrierDid: 'string',
      containerNo: 'string',
      expireDate: 'string',
      issueAmt: 'string',
      outBizNo: 'string',
      outOrderNo: 'string',
      waybillId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 货物列表
export class HouseBlGoodsParam extends $tea.Model {
  // 预计备货时间
  cargoReadyDate?: number;
  // 危险品页号
  dgPageNo?: string;
  // 危险品级别
  dgType?: string;
  // 危险品闪点
  flashPoint?: string;
  // 货物名称 业务必填
  goods?: string;
  // 货物中文名
  goodsCn?: string;
  // 货物类型 业务必填
  goodsType?: string;
  // HS CODE
  hsCodes?: string[];
  // 唛头
  marks?: string;
  // 件数 业务必填
  number?: string;
  // 包装类型
  packageType?: string;
  // 实际件数
  realNumber?: string;
  // 实际体积
  realVolume?: string;
  // 实际重量
  realWeight?: string;
  // 危险品联合国编号
  unNo?: string;
  // 委托体积 业务必填
  volume?: string;
  // 委托重量 业务必填
  weight?: string;
  static names(): { [key: string]: string } {
    return {
      cargoReadyDate: 'cargo_ready_date',
      dgPageNo: 'dg_page_no',
      dgType: 'dg_type',
      flashPoint: 'flash_point',
      goods: 'goods',
      goodsCn: 'goods_cn',
      goodsType: 'goods_type',
      hsCodes: 'hs_codes',
      marks: 'marks',
      number: 'number',
      packageType: 'package_type',
      realNumber: 'real_number',
      realVolume: 'real_volume',
      realWeight: 'real_weight',
      unNo: 'un_no',
      volume: 'volume',
      weight: 'weight',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cargoReadyDate: 'number',
      dgPageNo: 'string',
      dgType: 'string',
      flashPoint: 'string',
      goods: 'string',
      goodsCn: 'string',
      goodsType: 'string',
      hsCodes: { 'type': 'array', 'itemType': 'string' },
      marks: 'string',
      number: 'string',
      packageType: 'string',
      realNumber: 'string',
      realVolume: 'string',
      realWeight: 'string',
      unNo: 'string',
      volume: 'string',
      weight: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 上传booking信息
export class UploadOrderBooking extends $tea.Model {
  // 订舱单号
  bookingNo: string;
  // 集装箱号  json字符串上传
  containerNos: string;
  static names(): { [key: string]: string } {
    return {
      bookingNo: 'booking_no',
      containerNos: 'container_nos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bookingNo: 'string',
      containerNos: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 航运集装箱类型信息
export class ContainerTypeInfo extends $tea.Model {
  // 箱型
  containerType?: string;
  // 箱量
  containerVolume?: string;
  static names(): { [key: string]: string } {
    return {
      containerType: 'container_type',
      containerVolume: 'container_volume',
    };
  }

  static types(): { [key: string]: any } {
    return {
      containerType: 'string',
      containerVolume: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 平台报案赔款支付信息
export class ReparationsInfo extends $tea.Model {
  // 平台赔款支付流水号
  paymentNo?: string;
  // 平台赔款支付金额
  paymentAmount?: string;
  // 平台是否放弃货物所有权。Y:是，N:否
  relinquishGoods?: string;
  // 退货本身是否高于货物本身价值。Y:是，N:否
  returnOverValue?: string;
  static names(): { [key: string]: string } {
    return {
      paymentNo: 'payment_no',
      paymentAmount: 'payment_amount',
      relinquishGoods: 'relinquish_goods',
      returnOverValue: 'return_over_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      paymentNo: 'string',
      paymentAmount: 'string',
      relinquishGoods: 'string',
      returnOverValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 凭证返回值
export class VoucherResp extends $tea.Model {
  // 消息
  msg: string;
  static names(): { [key: string]: string } {
    return {
      msg: 'msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      msg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 货物
export class ContainerGoodsParam extends $tea.Model {
  // 预计备货时间
  cargoReadyDate?: number;
  // 危险品页号
  dgPageNo?: string;
  // 危险品级别
  dgType?: string;
  // 危险品闪点
  flashPoint?: string;
  // 货物
  goods?: string;
  // 货物中文名
  goodsCn?: string;
  // 货物类型 业务必填
  goodsType?: string;
  // HS CODE
  hsCodes?: string[];
  // 唛头
  marks?: string;
  // 件数 业务必填
  number?: string;
  // 包装类型
  packageType?: string;
  // 实际件数
  realNumber?: string;
  // 实际体积
  realVolume?: string;
  // 实际重量
  realWeight?: string;
  // 危险品联合国编号
  unNo?: string;
  // 体积 业务必填
  volume?: string;
  // 毛重 业务必填
  weight?: string;
  static names(): { [key: string]: string } {
    return {
      cargoReadyDate: 'cargo_ready_date',
      dgPageNo: 'dg_page_no',
      dgType: 'dg_type',
      flashPoint: 'flash_point',
      goods: 'goods',
      goodsCn: 'goods_cn',
      goodsType: 'goods_type',
      hsCodes: 'hs_codes',
      marks: 'marks',
      number: 'number',
      packageType: 'package_type',
      realNumber: 'real_number',
      realVolume: 'real_volume',
      realWeight: 'real_weight',
      unNo: 'un_no',
      volume: 'volume',
      weight: 'weight',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cargoReadyDate: 'number',
      dgPageNo: 'string',
      dgType: 'string',
      flashPoint: 'string',
      goods: 'string',
      goodsCn: 'string',
      goodsType: 'string',
      hsCodes: { 'type': 'array', 'itemType': 'string' },
      marks: 'string',
      number: 'string',
      packageType: 'string',
      realNumber: 'string',
      realVolume: 'string',
      realWeight: 'string',
      unNo: 'string',
      volume: 'string',
      weight: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 货物标的列表
export class CargoInfo extends $tea.Model {
  // 货物类型，货物类型的大类
  cargoType: string;
  // 货物名称，实际的货物名称
  cargoName: string;
  // 货物数量
  cargoQuantity: string;
  // 货物申报价值，单位（元），最多支持2位小数，超过2位拒绝
  cargoWorth: string;
  static names(): { [key: string]: string } {
    return {
      cargoType: 'cargo_type',
      cargoName: 'cargo_name',
      cargoQuantity: 'cargo_quantity',
      cargoWorth: 'cargo_worth',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cargoType: 'string',
      cargoName: 'string',
      cargoQuantity: 'string',
      cargoWorth: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 应付账单发票关联项
export class PayBillInvoiceParam extends $tea.Model {
  // 账单发票code
  payBillInvoiceCode: string;
  // 账单编号
  payBillOrderCode: string;
  // 账单金额
  payBillAmount: string;
  // 发票金额
  invoiceAmount: string;
  // 操作动作
  action?: string;
  static names(): { [key: string]: string } {
    return {
      payBillInvoiceCode: 'pay_bill_invoice_code',
      payBillOrderCode: 'pay_bill_order_code',
      payBillAmount: 'pay_bill_amount',
      invoiceAmount: 'invoice_amount',
      action: 'action',
    };
  }

  static types(): { [key: string]: any } {
    return {
      payBillInvoiceCode: 'string',
      payBillOrderCode: 'string',
      payBillAmount: 'string',
      invoiceAmount: 'string',
      action: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 货主支付方式
export class PayAmount extends $tea.Model {
  // 支付金额（2位小数）
  amount: string;
  // 支付方式
  payType: string;
  static names(): { [key: string]: string } {
    return {
      amount: 'amount',
      payType: 'pay_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      amount: 'string',
      payType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 资费项账单
export class PayBillTariffParam extends $tea.Model {
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 账单金额 业务必填
  billAmount?: string;
  // 应付账单、应付资费项 多对多code
  payBillTariffCode: string;
  //  资费项金额 业务必填
  payTariffAmount?: string;
  // 应付资费项编号 业务必填
  payTariffCode?: string;
  static names(): { [key: string]: string } {
    return {
      action: 'action',
      billAmount: 'bill_amount',
      payBillTariffCode: 'pay_bill_tariff_code',
      payTariffAmount: 'pay_tariff_amount',
      payTariffCode: 'pay_tariff_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      action: 'string',
      billAmount: 'string',
      payBillTariffCode: 'string',
      payTariffAmount: 'string',
      payTariffCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 轨迹核验结果
export class TrackCheckResult extends $tea.Model {
  // 轨迹核验状态code
  trackCheckStatus?: string;
  // 轨迹核验结果描述
  trackCheckStatusMsg?: string;
  static names(): { [key: string]: string } {
    return {
      trackCheckStatus: 'track_check_status',
      trackCheckStatusMsg: 'track_check_status_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      trackCheckStatus: 'string',
      trackCheckStatusMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 集装箱列表
export class HouseBlContainerParam extends $tea.Model {
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 集装箱ID
  containerId: string;
  // 箱号
  containerNo?: string;
  static names(): { [key: string]: string } {
    return {
      action: 'action',
      containerId: 'container_id',
      containerNo: 'container_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      action: 'string',
      containerId: 'string',
      containerNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 货物列表
export class MasterBlGoodsParam extends $tea.Model {
  // 预计备货时间
  cargoReadyDate?: number;
  // 危险品页号
  dgPageNo?: string;
  // 危险品级别
  dgType?: string;
  // 危险品闪点
  flashPoint?: string;
  // 货物名称 业务必填
  goods?: string;
  // 货物中文名
  goodsCn?: string;
  // 货物类型 业务必填
  goodsType?: string;
  // 毛重 业务必填
  grossWeight?: string;
  // HS CODE
  hsCodes?: string[];
  // 唛头
  marks?: string;
  // 件数 业务必填
  number?: string;
  // 包装类型
  packageType?: string;
  // 实际件数
  realNumber?: string;
  // 实际体积
  realVolume?: string;
  // 实际重量
  realWeight?: string;
  // 危险品联合国编号
  unNo?: string;
  // 委托体积 业务必填
  volume?: string;
  // 委托重量 业务必填
  weight?: string;
  static names(): { [key: string]: string } {
    return {
      cargoReadyDate: 'cargo_ready_date',
      dgPageNo: 'dg_page_no',
      dgType: 'dg_type',
      flashPoint: 'flash_point',
      goods: 'goods',
      goodsCn: 'goods_cn',
      goodsType: 'goods_type',
      grossWeight: 'gross_weight',
      hsCodes: 'hs_codes',
      marks: 'marks',
      number: 'number',
      packageType: 'package_type',
      realNumber: 'real_number',
      realVolume: 'real_volume',
      realWeight: 'real_weight',
      unNo: 'un_no',
      volume: 'volume',
      weight: 'weight',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cargoReadyDate: 'number',
      dgPageNo: 'string',
      dgType: 'string',
      flashPoint: 'string',
      goods: 'string',
      goodsCn: 'string',
      goodsType: 'string',
      grossWeight: 'string',
      hsCodes: { 'type': 'array', 'itemType': 'string' },
      marks: 'string',
      number: 'string',
      packageType: 'string',
      realNumber: 'string',
      realVolume: 'string',
      realWeight: 'string',
      unNo: 'string',
      volume: 'string',
      weight: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 支付信息
export class PaymentInfo extends $tea.Model {
  // 收款账户名称
  receiverAccountName: string;
  // 收款账户，支付宝账号
  receiverAccount: string;
  // 收款账户类型 ,1-个人账号，0-公司账号
  receiverAccountType: string;
  // 收款人证件号码 ，账户类型为个人时，非空
  receiverCertificateNo?: string;
  // 收款人证件类型，01-身份证，02-护照，03-军官证，04-港澳通行证，05-驾驶证，06-港澳回乡证或台胞证，07-临时身份证，99-其他
  receiverCertificateType: string;
  static names(): { [key: string]: string } {
    return {
      receiverAccountName: 'receiver_account_name',
      receiverAccount: 'receiver_account',
      receiverAccountType: 'receiver_account_type',
      receiverCertificateNo: 'receiver_certificate_no',
      receiverCertificateType: 'receiver_certificate_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      receiverAccountName: 'string',
      receiverAccount: 'string',
      receiverAccountType: 'string',
      receiverCertificateNo: 'string',
      receiverCertificateType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 货源单号-货主运费
export class CargoAmount extends $tea.Model {
  // 货运单对应金额（2位小数）
  amount: string;
  // 货源单号
  cargoOrder: string;
  static names(): { [key: string]: string } {
    return {
      amount: 'amount',
      cargoOrder: 'cargo_order',
    };
  }

  static types(): { [key: string]: any } {
    return {
      amount: 'string',
      cargoOrder: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 凭证开立申请信息
export class IssueApplyInfo extends $tea.Model {
  // 货源订单
  cargoOrder?: string;
  // 合同号（预留）
  contractId?: string;
  // 凭证到期时间
  expireDate: string;
  // 支付单运费，运费最多精确到小数点后2位
  freight: string;
  // 全局唯一业务号
  outBizNo: string;
  // 支付订单
  payOrder: string;
  // 运单id
  waybillId: string;
  // 司机did
  driverDid?: string;
  static names(): { [key: string]: string } {
    return {
      cargoOrder: 'cargo_order',
      contractId: 'contract_id',
      expireDate: 'expire_date',
      freight: 'freight',
      outBizNo: 'out_biz_no',
      payOrder: 'pay_order',
      waybillId: 'waybill_id',
      driverDid: 'driver_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cargoOrder: 'string',
      contractId: 'string',
      expireDate: 'string',
      freight: 'string',
      outBizNo: 'string',
      payOrder: 'string',
      waybillId: 'string',
      driverDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 授权上链文件
export class AuthChainFile extends $tea.Model {
  // 签署文件的hash值
  signFileHash: string;
  // 上链事务唯一标识
  uploadChainTxCode: string;
  // 蚂蚁区块链统一证据编号
  baasUniqCode: string;
  // 上链时间(13位毫秒级时间戳)
  uploadChainTime: string;
  // 上链文件下载链接
  fileUrl: string;
  // 上链文件名称，要求包含扩展名。文件格式允许: pdf, txt, doc, docx
  fileName: string;
  static names(): { [key: string]: string } {
    return {
      signFileHash: 'sign_file_hash',
      uploadChainTxCode: 'upload_chain_tx_code',
      baasUniqCode: 'baas_uniq_code',
      uploadChainTime: 'upload_chain_time',
      fileUrl: 'file_url',
      fileName: 'file_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      signFileHash: 'string',
      uploadChainTxCode: 'string',
      baasUniqCode: 'string',
      uploadChainTime: 'string',
      fileUrl: 'string',
      fileName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 电子回单查询凭证数据
export class ScpTicketIssueDataParam extends $tea.Model {
  // 凭证id
  issueId: string;
  // 凭证对应的司机/货主的did
  did: string;
  static names(): { [key: string]: string } {
    return {
      issueId: 'issue_id',
      did: 'did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      issueId: 'string',
      did: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 货物损失详情
export class CargoLoss extends $tea.Model {
  // 物品类型
  cargoType?: string;
  // 物品名称
  cargoName: string;
  // 物品所有人
  cargoOwner?: string;
  // 物品损失描述 
  cargoLossDesc?: string;
  // 损失预估，单位（元），最多支持2位小数
  cargoLossEstimateAmount: string;
  static names(): { [key: string]: string } {
    return {
      cargoType: 'cargo_type',
      cargoName: 'cargo_name',
      cargoOwner: 'cargo_owner',
      cargoLossDesc: 'cargo_loss_desc',
      cargoLossEstimateAmount: 'cargo_loss_estimate_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cargoType: 'string',
      cargoName: 'string',
      cargoOwner: 'string',
      cargoLossDesc: 'string',
      cargoLossEstimateAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 资费项账单
export class ReceiptBillTariffParam extends $tea.Model {
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  //  账单金额 业务必填
  billAmount?: string;
  // 应收账单 、应收资费项 多对多关联code 
  receiptBillTariffCode: string;
  // 资费项金额 业务必填
  receiptTariffAmount?: string;
  // 应收资费项编号 业务必填
  receiptTariffCode?: string;
  static names(): { [key: string]: string } {
    return {
      action: 'action',
      billAmount: 'bill_amount',
      receiptBillTariffCode: 'receipt_bill_tariff_code',
      receiptTariffAmount: 'receipt_tariff_amount',
      receiptTariffCode: 'receipt_tariff_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      action: 'string',
      billAmount: 'string',
      receiptBillTariffCode: 'string',
      receiptTariffAmount: 'string',
      receiptTariffCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 上传订单总金额
export class UploadOrderAmount extends $tea.Model {
  // 币种
  currency: string;
  // 总金额
  totalAmount: string;
  static names(): { [key: string]: string } {
    return {
      currency: 'currency',
      totalAmount: 'total_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      currency: 'string',
      totalAmount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 索赔资料附件
export class ClaimInformation extends $tea.Model {
  // 索赔资料地址url
  fileUrl: string;
  // 文件名	
  fileName: string;
  static names(): { [key: string]: string } {
    return {
      fileUrl: 'file_url',
      fileName: 'file_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fileUrl: 'string',
      fileName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 信用凭证数据集合
export class IssueTransferData extends $tea.Model {
  // 凭证id
  issueId: string;
  // 转出方did
  payerDid: string;
  // 接收方did
  rcvDid: string;
  static names(): { [key: string]: string } {
    return {
      issueId: 'issue_id',
      payerDid: 'payer_did',
      rcvDid: 'rcv_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      issueId: 'string',
      payerDid: 'string',
      rcvDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 电子提单批次下提单明细
export class EblDetail extends $tea.Model {
  // 电子提单copy文件hash
  eblCopyPdfFileHash: string;
  // 电子提单copy文件id
  eblCopyPdfFileId: string;
  // 电子提单编号
  eblNo: string;
  static names(): { [key: string]: string } {
    return {
      eblCopyPdfFileHash: 'ebl_copy_pdf_file_hash',
      eblCopyPdfFileId: 'ebl_copy_pdf_file_id',
      eblNo: 'ebl_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      eblCopyPdfFileHash: 'string',
      eblCopyPdfFileId: 'string',
      eblNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 包含文件id、文件hash信息
export class UploadFileInfo extends $tea.Model {
  // 文件id
  fileId: string;
  // 文件hash
  fileHash: string;
  static names(): { [key: string]: string } {
    return {
      fileId: 'file_id',
      fileHash: 'file_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fileId: 'string',
      fileHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 提单货物数据
export class MasterBlGoodsDto extends $tea.Model {
  // 唛头
  marks?: string;
  // 货物
  goods: string;
  // 货物类型
  goodsType: string;
  // 包装类型
  packageType?: string;
  // 委托件数
  number: string;
  // 委托重量
  weight: string;
  // 委托体积
  volume: string;
  static names(): { [key: string]: string } {
    return {
      marks: 'marks',
      goods: 'goods',
      goodsType: 'goods_type',
      packageType: 'package_type',
      number: 'number',
      weight: 'weight',
      volume: 'volume',
    };
  }

  static types(): { [key: string]: any } {
    return {
      marks: 'string',
      goods: 'string',
      goodsType: 'string',
      packageType: 'string',
      number: 'string',
      weight: 'string',
      volume: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 运单号-司机运费
export class WaybillAmount extends $tea.Model {
  // 运单金额（2位小数）
  amount: string;
  // 运单号
  waybillId: string;
  static names(): { [key: string]: string } {
    return {
      amount: 'amount',
      waybillId: 'waybill_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      amount: 'string',
      waybillId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 承运人责任险保险标的信息
export class InsureCarrierObjectInfo extends $tea.Model {
  // 厂牌型号
  cpModel: string;
  // 车架号
  frameNo: string;
  // 车牌号码
  licenseNo: string;
  // 吨位
  tonNage: string;
  // 行驶证车主
  drivPer: string;
  // 运营证号
  runNo: string;
  // 运输货物
  tsCarGo: string;
  static names(): { [key: string]: string } {
    return {
      cpModel: 'cp_model',
      frameNo: 'frame_no',
      licenseNo: 'license_no',
      tonNage: 'ton_nage',
      drivPer: 'driv_per',
      runNo: 'run_no',
      tsCarGo: 'ts_car_go',
    };
  }

  static types(): { [key: string]: any } {
    return {
      cpModel: 'string',
      frameNo: 'string',
      licenseNo: 'string',
      tonNage: 'string',
      drivPer: 'string',
      runNo: 'string',
      tsCarGo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 创建凭证Two
export class VoucherTestTwo extends $tea.Model {
  // 测试Boolean
  voucherTestTwoBoolean: boolean;
  // 凭证列表_apiTestList
  voucherTestTwoApiTestList: VoucherTestOne[];
  // 测试Int
  voucherTestTwoInt: number;
  // 测试Integer
  voucherTestTwoInteger: number;
  // 凭证列表_dateList
  voucherTestTwoDateList: string[];
  // 测试String
  voucherTestTwoString: string;
  // 测试Date
  voucherTestTwoDate: string;
  // 凭证列表_integerList
  voucherTestTwoIntegerList: number[];
  // 测试Long
  voucherTestTwoLong: number;
  // 凭证列表_longList
  voucherTestTwoLongList: number[];
  // 凭证列表_stringList
  voucherTestTwoStringList: string[];
  // 测试apiTestInfo
  voucherTestTwoApiTestInfo: VoucherTestOne;
  // 凭证列表_booleanList
  voucherTestTwoBooleanList: boolean[];
  static names(): { [key: string]: string } {
    return {
      voucherTestTwoBoolean: 'voucher_test_two_boolean',
      voucherTestTwoApiTestList: 'voucher_test_two_api_test_list',
      voucherTestTwoInt: 'voucher_test_two_int',
      voucherTestTwoInteger: 'voucher_test_two_integer',
      voucherTestTwoDateList: 'voucher_test_two_date_list',
      voucherTestTwoString: 'voucher_test_two_string',
      voucherTestTwoDate: 'voucher_test_two_date',
      voucherTestTwoIntegerList: 'voucher_test_two_integer_list',
      voucherTestTwoLong: 'voucher_test_two_long',
      voucherTestTwoLongList: 'voucher_test_two_long_list',
      voucherTestTwoStringList: 'voucher_test_two_string_list',
      voucherTestTwoApiTestInfo: 'voucher_test_two_api_test_info',
      voucherTestTwoBooleanList: 'voucher_test_two_boolean_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      voucherTestTwoBoolean: 'boolean',
      voucherTestTwoApiTestList: { 'type': 'array', 'itemType': VoucherTestOne },
      voucherTestTwoInt: 'number',
      voucherTestTwoInteger: 'number',
      voucherTestTwoDateList: { 'type': 'array', 'itemType': 'string' },
      voucherTestTwoString: 'string',
      voucherTestTwoDate: 'string',
      voucherTestTwoIntegerList: { 'type': 'array', 'itemType': 'number' },
      voucherTestTwoLong: 'number',
      voucherTestTwoLongList: { 'type': 'array', 'itemType': 'number' },
      voucherTestTwoStringList: { 'type': 'array', 'itemType': 'string' },
      voucherTestTwoApiTestInfo: VoucherTestOne,
      voucherTestTwoBooleanList: { 'type': 'array', 'itemType': 'boolean' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 资费项发票
export class ReceiptTariffInvoiceParam extends $tea.Model {
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 发票金额 业务必填
  invoiceAmount?: string;
  // 资费项金额 业务必填
  receiptTariffAmount?: string;
  // 资费单据编号 业务必填
  receiptTariffCode?: string;
  // 资费项发票code
  receiptTariffInvoiceCode: string;
  static names(): { [key: string]: string } {
    return {
      action: 'action',
      invoiceAmount: 'invoice_amount',
      receiptTariffAmount: 'receipt_tariff_amount',
      receiptTariffCode: 'receipt_tariff_code',
      receiptTariffInvoiceCode: 'receipt_tariff_invoice_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      action: 'string',
      invoiceAmount: 'string',
      receiptTariffAmount: 'string',
      receiptTariffCode: 'string',
      receiptTariffInvoiceCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 航运集装箱ID信息
export class ContainerIdInfo extends $tea.Model {
  // 箱子唯一标识
  containerId?: string;
  // 箱号
  containerNo?: string;
  static names(): { [key: string]: string } {
    return {
      containerId: 'container_id',
      containerNo: 'container_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      containerId: 'string',
      containerNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 文档信息
export class Document extends $tea.Model {
  // 文档url
  documentUrl: string;
  // 文档名称 
  documentName: string;
  static names(): { [key: string]: string } {
    return {
      documentUrl: 'document_url',
      documentName: 'document_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      documentUrl: 'string',
      documentName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 货物信息
export class GoodsInfo extends $tea.Model {
  // 货物ID [业务必填]
  goodsId?: string;
  // 唛头
  // 
  // 
  marks?: string;
  // 货物名称
  goods?: string;
  // 货物类型
  goodsType?: string;
  // 货物重量
  weight?: string;
  // 件数
  number?: string;
  static names(): { [key: string]: string } {
    return {
      goodsId: 'goods_id',
      marks: 'marks',
      goods: 'goods',
      goodsType: 'goods_type',
      weight: 'weight',
      number: 'number',
    };
  }

  static types(): { [key: string]: any } {
    return {
      goodsId: 'string',
      marks: 'string',
      goods: 'string',
      goodsType: 'string',
      weight: 'string',
      number: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 池融资授信额度信息
export class PfCreditQuotaInfo extends $tea.Model {
  // 证件号
  certNo: string;
  // 证件类型
  certType: string;
  // 授信到期日期
  creditEnd: string;
  // 授信起始日期
  creditStart: string;
  // 额度编号
  quotaNo: string;
  // 剩余额度
  remainingQuota: string;
  // SON:放款账号loanAccNo
  // 还款账号repayAcctNo
  remark: string;
  // 额度状态：
  // 0、停用 / 1、启用  /  2、冻结
  status: string;
  // 授信额度
  totalQuota: string;
  // 数据更新时间
  updateTime: string;
  // 总质押额度
  totalPledgeQuota: string;
  // 剩余质押额度
  remainPledgeQuota: string;
  static names(): { [key: string]: string } {
    return {
      certNo: 'cert_no',
      certType: 'cert_type',
      creditEnd: 'credit_end',
      creditStart: 'credit_start',
      quotaNo: 'quota_no',
      remainingQuota: 'remaining_quota',
      remark: 'remark',
      status: 'status',
      totalQuota: 'total_quota',
      updateTime: 'update_time',
      totalPledgeQuota: 'total_pledge_quota',
      remainPledgeQuota: 'remain_pledge_quota',
    };
  }

  static types(): { [key: string]: any } {
    return {
      certNo: 'string',
      certType: 'string',
      creditEnd: 'string',
      creditStart: 'string',
      quotaNo: 'string',
      remainingQuota: 'string',
      remark: 'string',
      status: 'string',
      totalQuota: 'string',
      updateTime: 'string',
      totalPledgeQuota: 'string',
      remainPledgeQuota: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateReceivableBillRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 测试
  test?: AuthParty;
  // 的撒
  status: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      test: 'test',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      test: AuthParty,
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateReceivableBillResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回结果
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateStandardVoucherRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 账户是否存在
  exist: boolean;
  // 签署方
  voucherTestOne: VoucherTestTwo;
  // 数据标识
  businessCode: string;
  // 凭证列表_apiTestList
  voucherTestThree: VoucherTestTwo[];
  // 发行时间
  issueTime: string;
  // 凭证列表_voucherList
  voucherList: string[];
  // 发行金额_Long
  amountLong: number;
  // 发行金额_Integer
  amountInt: number;
  // 签署方
  voucherTestTwo: VoucherTestTwo;
  // 凭证列表_booleanList
  booleanList: boolean[];
  // 凭证列表_dateList
  dateList: string[];
  // 资产类型
  assetType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      exist: 'exist',
      voucherTestOne: 'voucher_test_one',
      businessCode: 'business_code',
      voucherTestThree: 'voucher_test_three',
      issueTime: 'issue_time',
      voucherList: 'voucher_list',
      amountLong: 'amount_long',
      amountInt: 'amount_int',
      voucherTestTwo: 'voucher_test_two',
      booleanList: 'boolean_list',
      dateList: 'date_list',
      assetType: 'asset_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      exist: 'boolean',
      voucherTestOne: VoucherTestTwo,
      businessCode: 'string',
      voucherTestThree: { 'type': 'array', 'itemType': VoucherTestTwo },
      issueTime: 'string',
      voucherList: { 'type': 'array', 'itemType': 'string' },
      amountLong: 'number',
      amountInt: 'number',
      voucherTestTwo: VoucherTestTwo,
      booleanList: { 'type': 'array', 'itemType': 'boolean' },
      dateList: { 'type': 'array', 'itemType': 'string' },
      assetType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateStandardVoucherResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 凭证返回值_voucherResp
  voucherResp: VoucherResp;
  // 编码
  code: string;
  // 凭证返回值_voucherRespList
  voucherRespList: VoucherResp[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      voucherResp: 'voucher_resp',
      code: 'code',
      voucherRespList: 'voucher_resp_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      voucherResp: VoucherResp,
      code: 'string',
      voucherRespList: { 'type': 'array', 'itemType': VoucherResp },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreatePlatformDidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业名称
  epCertName: string;
  // 企业信用号码
  epCertNo: string;
  // 企业法人姓名
  legalPersonCertName: string;
  // 企业法人身份证号码
  legalPersonCertNo: string;
  // 扩展字段
  extensionInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
      legalPersonCertName: 'legal_person_cert_name',
      legalPersonCertNo: 'legal_person_cert_no',
      extensionInfo: 'extension_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      epCertName: 'string',
      epCertNo: 'string',
      legalPersonCertName: 'string',
      legalPersonCertNo: 'string',
      extensionInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreatePlatformDidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 无车承运平台DIS
  did?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      did: 'did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      did: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAgentDidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 创建did的代理did
  agentDid: string;
  // 企业名称
  epCertName: string;
  // 企业信用号码
  epCertNo: string;
  // 扩展字段
  extensionInfo?: string;
  // 企业法人姓名
  legalPersonCertName: string;
  // 企业法人身份证号码
  legalPersonCertNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      agentDid: 'agent_did',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
      extensionInfo: 'extension_info',
      legalPersonCertName: 'legal_person_cert_name',
      legalPersonCertNo: 'legal_person_cert_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      agentDid: 'string',
      epCertName: 'string',
      epCertNo: 'string',
      extensionInfo: 'string',
      legalPersonCertName: 'string',
      legalPersonCertNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAgentDidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 无车承运平台did
  did?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      did: 'did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      did: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateConsignorDisRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业名称
  epCertName: string;
  // 企业信用号码
  epCertNo: string;
  // 扩展字段
  extensionInfo?: string;
  // 企业法人姓名
  legalPersonCertName?: string;
  // 企业法人身份证号码
  legalPersonCertNo?: string;
  // 所属承运平台did
  platformDid: string;
  // 是否核验货主四要素，如果为true  法人姓名和法人身份证号为必填
  checkAll: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
      extensionInfo: 'extension_info',
      legalPersonCertName: 'legal_person_cert_name',
      legalPersonCertNo: 'legal_person_cert_no',
      platformDid: 'platform_did',
      checkAll: 'check_all',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      epCertName: 'string',
      epCertNo: 'string',
      extensionInfo: 'string',
      legalPersonCertName: 'string',
      legalPersonCertNo: 'string',
      platformDid: 'string',
      checkAll: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateConsignorDisResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 货主did信息
  did?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      did: 'did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      did: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDriverDisRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 司机身份证号码
  certNo: string;
  // 扩展字段
  extensionInfo?: string;
  // 司机手机号码
  mobile: string;
  // 司机姓名
  name: string;
  // 所属承运平台did
  platformDid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certNo: 'cert_no',
      extensionInfo: 'extension_info',
      mobile: 'mobile',
      name: 'name',
      platformDid: 'platform_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certNo: 'string',
      extensionInfo: 'string',
      mobile: 'string',
      name: 'string',
      platformDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDriverDisResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 司机did
  did?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      did: 'did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      did: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCargoOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 运费
  allFreight: string;
  // 货物行业编码
  cargoBusinessCode?: string;
  // 货物商品编码
  cargoCode?: string;
  // 货运险金额
  cargoInsuranceMoney?: string;
  // 货物名称
  cargoName: string;
  // 货源单号
  cargoOrder: string;
  // 货物类型
  cargoType: string;
  // 货物单位
  cargoUnit?: string;
  // 货物体积，单位（方）
  cargoVolume?: string;
  // 货主did
  consignorDid: string;
  // 卸货地，XX省-XX市-XX区
  deliveryPlace: string;
  // 装货地，XX省-XX市-XX区
  loadingPlace: string;
  // 所属承运平台did
  platformDid: string;
  // 货源单创建时间
  startTime: number;
  // 联系人电话
  userPhone?: string;
  // 货物重量，单位（吨）
  weight: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      allFreight: 'all_freight',
      cargoBusinessCode: 'cargo_business_code',
      cargoCode: 'cargo_code',
      cargoInsuranceMoney: 'cargo_insurance_money',
      cargoName: 'cargo_name',
      cargoOrder: 'cargo_order',
      cargoType: 'cargo_type',
      cargoUnit: 'cargo_unit',
      cargoVolume: 'cargo_volume',
      consignorDid: 'consignor_did',
      deliveryPlace: 'delivery_place',
      loadingPlace: 'loading_place',
      platformDid: 'platform_did',
      startTime: 'start_time',
      userPhone: 'user_phone',
      weight: 'weight',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      allFreight: 'string',
      cargoBusinessCode: 'string',
      cargoCode: 'string',
      cargoInsuranceMoney: 'string',
      cargoName: 'string',
      cargoOrder: 'string',
      cargoType: 'string',
      cargoUnit: 'string',
      cargoVolume: 'string',
      consignorDid: 'string',
      deliveryPlace: 'string',
      loadingPlace: 'string',
      platformDid: 'string',
      startTime: 'number',
      userPhone: 'string',
      weight: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCargoOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 货源链上凭证
  txCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCode: 'tx_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCargoPayRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  //  收款方银行账号
  bankAccountOfPayee?: string;
  // 付款方银行账号,货主付款的开户银行账号
  bankAccountOfPayer?: string;
  // 银行流水号
  bankNo: string;
  // 收款方开户行（平台收款）
  // 取值：
  // MYBank_CloudCapital_2,  ## 云资金2.0
  bankOfPayee?: string;
  // MYBank_CloudCapital_2,  ## 云资金2.0
  bankOfPayer?: string;
  // 货源单号
  cargoOrder: string;
  // 核验渠道，请按取值约束值填入。
  // 
  // YBank_CloudCapital_2,  ## 云资金2.0
  checkChannel?: string;
  // CNY、USD
  // 币种
  currency?: string;
  // 费用类型 (运费、调度费、服务费)
  expenseType: string;
  // 收款方名称
  payee?: string;
  // 付款方名称
  payer?: string;
  // 费用金额
  payment: string;
  // 是否核验
  payCheck?: boolean;
  // 付款方did
  payDid: string;
  // 平台支付单号
  payId: string;
  // 支付备注
  payNote?: string;
  // 支付时间
  payTime: number;
  // 支付类型
  payType?: string;
  // 收款方did
  recvDid: string;
  // 支持关联单个运单和多个运单
  taxWaybillIds: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bankAccountOfPayee: 'bank_account_of_payee',
      bankAccountOfPayer: 'bank_account_of_payer',
      bankNo: 'bank_no',
      bankOfPayee: 'bank_of_payee',
      bankOfPayer: 'bank_of_payer',
      cargoOrder: 'cargo_order',
      checkChannel: 'check_channel',
      currency: 'currency',
      expenseType: 'expense_type',
      payee: 'payee',
      payer: 'payer',
      payment: 'payment',
      payCheck: 'pay_check',
      payDid: 'pay_did',
      payId: 'pay_id',
      payNote: 'pay_note',
      payTime: 'pay_time',
      payType: 'pay_type',
      recvDid: 'recv_did',
      taxWaybillIds: 'tax_waybill_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bankAccountOfPayee: 'string',
      bankAccountOfPayer: 'string',
      bankNo: 'string',
      bankOfPayee: 'string',
      bankOfPayer: 'string',
      cargoOrder: 'string',
      checkChannel: 'string',
      currency: 'string',
      expenseType: 'string',
      payee: 'string',
      payer: 'string',
      payment: 'string',
      payCheck: 'boolean',
      payDid: 'string',
      payId: 'string',
      payNote: 'string',
      payTime: 'number',
      payType: 'string',
      recvDid: 'string',
      taxWaybillIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCargoPayResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 货源支付链上凭证
  txCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCode: 'tx_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateWaybillOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户链上账户 与司机did 二选一填写
  accountId?: string;
  // 运费，单位（元），平台支付给司机的运费金额
  allFreight?: string;
  // 回单押金
  backFee?: string;
  // 业务类型
  businessType?: string;
  // 货物行业编码
  cargoBusinessCode?: string;
  // 货物商品编码
  cargoCode?: string;
  // 货运险金额
  cargoInsuranceMoney?: string;
  // 货源单号，关联货主订单
  cargoOrder?: string;
  // 货源单号数组
  cargoOrders?: string[];
  // 货物单位
  cargoUnit?: string;
  // 货物体积，单位（方）
  cargoVolume?: string;
  // 货物重量，单位（吨）
  cargoWeight?: string;
  // 车牌颜色，黄色、蓝色、绿色
  cartBadgeColor: string;
  // 车牌号
  // 
  cartBadgeNo: string;
  // 承运商did
  carCaptainDid?: string;
  // 货主运费金额，单位（元），货主支付给平台的运费金额
  consignorFreightAmount?: string;
  // 建单时间，13位毫秒级时间戳
  // 
  createdTime: number;
  // 到达门点时间，13位毫秒级时间戳
  destDoorsEndTime?: number;
  // 门点城市CODE，6位区域行政编码
  doorsCityCode?: string;
  // 门点城市名称
  doorsCityName?: string;
  // 门点区县CODE，6位区域行政编码
  doorsCountyCode?: string;
  // 门点区县名称
  doorsCountyName?: string;
  // 门点行政区划代码
  doorsDivisionCode?: string;
  // 门点省份CODE，6位区域行政编码
  doorsProvinceCode?: string;
  // 门点省份名称
  doorsProvinceName?: string;
  // 发货方名称
  // 
  drawee: string;
  // 发货方纳税人识别号
  // 
  draweeTaxNo: string;
  // 司机分布式身份
  driverDid: string;
  // 司机姓名 已填司机分布式身份的情况下可不填
  // 
  driverName?: string;
  // 目的地详细地址
  endAddress?: string;
  // 目的地城市CODE，6位区域行政编码
  // 
  endCityCode: string;
  // 目的地城市名称
  // 
  endCityName: string;
  // 目的地区县CODE，6位区域行政编码
  endCountyCode?: string;
  // 目的地区县名称
  // 
  endCountyName?: string;
  // 结束行政区划代码，12位区域行政编码，（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
  // 
  endDivisionCode: string;
  // 目的地省份CODE，6位区域行政编码
  // 
  endProvinceCode: string;
  // 目的地省份名称
  // 
  endProvinceName: string;
  // 目的地街道CODE，12区域行政编码
  endStreetCode?: string;
  // 目的地街道名称
  endStreetName?: string;
  // 运费增项
  // 
  freightIncr?: string;
  // 货物数量
  // 
  goodsAmount?: number;
  // 货物数量单位类型
  // 
  goodsAmountType?: string;
  // 货物名称
  // 
  goodsName: string;
  // 司机身份证号 已填司机分布式身份的情况下可不填
  idCard?: string;
  // 运费扣减
  // 
  lossFee?: string;
  // 司机手机号 已填司机分布式身份的情况下可不填
  // 
  mobileNo?: string;
  // 系统识别id 网商识别号
  // 
  partnerId?: string;
  // 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
  // 
  platformDid: string;
  // 预付款金额
  // 
  prepayments?: string;
  // 线下预付ETC
  // 
  prepaymentsBuyEtc?: string;
  // 线下气款金额
  // 
  prepaymentsBuyGas?: string;
  // 运单id
  // 
  taxWaybillId: string;
  // 线下油款预付
  // 
  prepaymentsBuyOil?: string;
  // 预付ETC卡金额
  // 
  prepaymentsEtccard?: string;
  // 预付油卡金额
  // 
  prepaymentsOilcard?: string;
  // 油卡赠送金额
  // 
  presentAmountOil?: string;
  // 起始地详细地址
  startAddress?: string;
  // 起始地城市CODE，6位区域行政编码
  startCityCode: string;
  // 起始地城市名称
  // 
  startCityName: string;
  // 起始地区县CODE，6位区域行政编码
  startCountyCode?: string;
  // 起始地区县名称
  // 
  startCountyName?: string;
  // 起始行政区划代码，12位区域行政编码（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
  // 
  startDivisionCode: string;
  // 起始地省份CODE，6位区域行政编码
  startProvinceCode: string;
  // 起始地省份名称
  // 
  startProvinceName: string;
  // 起始地街道CODE，12区域行政编码
  startStreetCode?: string;
  // 起始地街道名称
  startStreetName?: string;
  // 起运时间戳，13位毫秒级时间戳
  startTime?: number;
  // 车长，可以填：不限车长或者1.8，2.7，3.8，4.2，5，6.2，6.8，7.7，8.2，8.7，9.6，11.7，12.5，13，13.7，15，16，17.5等不超过2位小数的数字
  truckLength?: string;
  // 可以填：不限车型，平板，高栏，厢式，集装箱，自卸，冷藏，保温，高低板，面包车，棉被车，爬梯车，飞翼车
  truckType?: string;
  // 运输单价
  // 
  unitPrice?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountId: 'account_id',
      allFreight: 'all_freight',
      backFee: 'back_fee',
      businessType: 'business_type',
      cargoBusinessCode: 'cargo_business_code',
      cargoCode: 'cargo_code',
      cargoInsuranceMoney: 'cargo_insurance_money',
      cargoOrder: 'cargo_order',
      cargoOrders: 'cargo_orders',
      cargoUnit: 'cargo_unit',
      cargoVolume: 'cargo_volume',
      cargoWeight: 'cargo_weight',
      cartBadgeColor: 'cart_badge_color',
      cartBadgeNo: 'cart_badge_no',
      carCaptainDid: 'car_captain_did',
      consignorFreightAmount: 'consignor_freight_amount',
      createdTime: 'created_time',
      destDoorsEndTime: 'dest_doors_end_time',
      doorsCityCode: 'doors_city_code',
      doorsCityName: 'doors_city_name',
      doorsCountyCode: 'doors_county_code',
      doorsCountyName: 'doors_county_name',
      doorsDivisionCode: 'doors_division_code',
      doorsProvinceCode: 'doors_province_code',
      doorsProvinceName: 'doors_province_name',
      drawee: 'drawee',
      draweeTaxNo: 'drawee_tax_no',
      driverDid: 'driver_did',
      driverName: 'driver_name',
      endAddress: 'end_address',
      endCityCode: 'end_city_code',
      endCityName: 'end_city_name',
      endCountyCode: 'end_county_code',
      endCountyName: 'end_county_name',
      endDivisionCode: 'end_division_code',
      endProvinceCode: 'end_province_code',
      endProvinceName: 'end_province_name',
      endStreetCode: 'end_street_code',
      endStreetName: 'end_street_name',
      freightIncr: 'freight_incr',
      goodsAmount: 'goods_amount',
      goodsAmountType: 'goods_amount_type',
      goodsName: 'goods_name',
      idCard: 'id_card',
      lossFee: 'loss_fee',
      mobileNo: 'mobile_no',
      partnerId: 'partner_id',
      platformDid: 'platform_did',
      prepayments: 'prepayments',
      prepaymentsBuyEtc: 'prepayments_buy_etc',
      prepaymentsBuyGas: 'prepayments_buy_gas',
      taxWaybillId: 'tax_waybill_id',
      prepaymentsBuyOil: 'prepayments_buy_oil',
      prepaymentsEtccard: 'prepayments_etccard',
      prepaymentsOilcard: 'prepayments_oilcard',
      presentAmountOil: 'present_amount_oil',
      startAddress: 'start_address',
      startCityCode: 'start_city_code',
      startCityName: 'start_city_name',
      startCountyCode: 'start_county_code',
      startCountyName: 'start_county_name',
      startDivisionCode: 'start_division_code',
      startProvinceCode: 'start_province_code',
      startProvinceName: 'start_province_name',
      startStreetCode: 'start_street_code',
      startStreetName: 'start_street_name',
      startTime: 'start_time',
      truckLength: 'truck_length',
      truckType: 'truck_type',
      unitPrice: 'unit_price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountId: 'string',
      allFreight: 'string',
      backFee: 'string',
      businessType: 'string',
      cargoBusinessCode: 'string',
      cargoCode: 'string',
      cargoInsuranceMoney: 'string',
      cargoOrder: 'string',
      cargoOrders: { 'type': 'array', 'itemType': 'string' },
      cargoUnit: 'string',
      cargoVolume: 'string',
      cargoWeight: 'string',
      cartBadgeColor: 'string',
      cartBadgeNo: 'string',
      carCaptainDid: 'string',
      consignorFreightAmount: 'string',
      createdTime: 'number',
      destDoorsEndTime: 'number',
      doorsCityCode: 'string',
      doorsCityName: 'string',
      doorsCountyCode: 'string',
      doorsCountyName: 'string',
      doorsDivisionCode: 'string',
      doorsProvinceCode: 'string',
      doorsProvinceName: 'string',
      drawee: 'string',
      draweeTaxNo: 'string',
      driverDid: 'string',
      driverName: 'string',
      endAddress: 'string',
      endCityCode: 'string',
      endCityName: 'string',
      endCountyCode: 'string',
      endCountyName: 'string',
      endDivisionCode: 'string',
      endProvinceCode: 'string',
      endProvinceName: 'string',
      endStreetCode: 'string',
      endStreetName: 'string',
      freightIncr: 'string',
      goodsAmount: 'number',
      goodsAmountType: 'string',
      goodsName: 'string',
      idCard: 'string',
      lossFee: 'string',
      mobileNo: 'string',
      partnerId: 'string',
      platformDid: 'string',
      prepayments: 'string',
      prepaymentsBuyEtc: 'string',
      prepaymentsBuyGas: 'string',
      taxWaybillId: 'string',
      prepaymentsBuyOil: 'string',
      prepaymentsEtccard: 'string',
      prepaymentsOilcard: 'string',
      presentAmountOil: 'string',
      startAddress: 'string',
      startCityCode: 'string',
      startCityName: 'string',
      startCountyCode: 'string',
      startCountyName: 'string',
      startDivisionCode: 'string',
      startProvinceCode: 'string',
      startProvinceName: 'string',
      startStreetCode: 'string',
      startStreetName: 'string',
      startTime: 'number',
      truckLength: 'string',
      truckType: 'string',
      unitPrice: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateWaybillOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCode: 'tx_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateWaybillPayRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 确认到账时间
  // 
  arriveTime: number;
  // 关联银行流水号
  // 
  bankSn: string;
  // 付款金额
  // 
  payAmount: string;
  // 付款方银行账号
  // 
  payBankCardNo: string;
  // 付款方开户行
  // 
  payBankName: string;
  // 是否核验
  payCheck?: boolean;
  // 付款方did
  // 
  payDid: string;
  // 付款方名称
  // 
  payName: string;
  // 付款时间戳
  // 
  payTime: number;
  // 支付类型
  // 
  payTypeNew: string;
  // 支付方式
  // 
  payWay: string;
  // 无车承运平台分布式数字身份，缺省为自己的分布式数字身份
  // 
  platformDid: string;
  // 支付订单ID
  // 
  posInfoId: string;
  // 实际付款方开户行
  // 
  realPayBank: string;
  // 实际付款方银行账号
  // 
  realPayBankCardNo: string;
  // 实际付款方名称
  // 
  realPayName: string;
  // 收款方银行账号
  // 
  recvBankCardNo: string;
  // 收款方开户行
  // 
  recvBankName: string;
  // 收款方did
  // 
  recvDid: string;
  // 收款方名称
  // 
  recvName: string;
  // 关联的运单ID
  // 
  waybillId: string;
  // MYBank_CloudCapital_1,  ## 云资金1.0
  // MYBank_CloudCapital_2,  ## 云资金2.0
  checkChannel?: string;
  // CNY, USD
  currency?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      arriveTime: 'arrive_time',
      bankSn: 'bank_sn',
      payAmount: 'pay_amount',
      payBankCardNo: 'pay_bank_card_no',
      payBankName: 'pay_bank_name',
      payCheck: 'pay_check',
      payDid: 'pay_did',
      payName: 'pay_name',
      payTime: 'pay_time',
      payTypeNew: 'pay_type_new',
      payWay: 'pay_way',
      platformDid: 'platform_did',
      posInfoId: 'pos_info_id',
      realPayBank: 'real_pay_bank',
      realPayBankCardNo: 'real_pay_bank_card_no',
      realPayName: 'real_pay_name',
      recvBankCardNo: 'recv_bank_card_no',
      recvBankName: 'recv_bank_name',
      recvDid: 'recv_did',
      recvName: 'recv_name',
      waybillId: 'waybill_id',
      checkChannel: 'check_channel',
      currency: 'currency',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      arriveTime: 'number',
      bankSn: 'string',
      payAmount: 'string',
      payBankCardNo: 'string',
      payBankName: 'string',
      payCheck: 'boolean',
      payDid: 'string',
      payName: 'string',
      payTime: 'number',
      payTypeNew: 'string',
      payWay: 'string',
      platformDid: 'string',
      posInfoId: 'string',
      realPayBank: 'string',
      realPayBankCardNo: 'string',
      realPayName: 'string',
      recvBankCardNo: 'string',
      recvBankName: 'string',
      recvDid: 'string',
      recvName: 'string',
      waybillId: 'string',
      checkChannel: 'string',
      currency: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateWaybillPayResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  // 
  txCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCode: 'tx_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportWaybillLocationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 描述信息
  // 
  desc?: string;
  // 运单轨迹信息
  location: LogisticLocation[];
  // 所属平台分布式数字身份，缺省时为自己的分布式数字身份
  // 
  platformDid: string;
  // 运单id
  // 
  taxWaybillId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      desc: 'desc',
      location: 'location',
      platformDid: 'platform_did',
      taxWaybillId: 'tax_waybill_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      desc: 'string',
      location: { 'type': 'array', 'itemType': LogisticLocation },
      platformDid: 'string',
      taxWaybillId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ImportWaybillLocationResponse extends $tea.Model {
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

export class CreateWaybillBillRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 受票方名称
  // 
  drawee: string;
  // 受票方纳税人识别号
  // 
  draweeTaxNo: string;
  // 发票代码
  // 
  lzfpdm?: string;
  // 发票号码
  // 
  lzfphm?: string;
  // 开票时间戳
  // 
  openTime: number;
  // 所属平台的分布式数字身份，缺省时为自己的分布式数字身份
  // 
  platformDid: string;
  // 关联的运单ID
  // 
  waybillId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      drawee: 'drawee',
      draweeTaxNo: 'drawee_tax_no',
      lzfpdm: 'lzfpdm',
      lzfphm: 'lzfphm',
      openTime: 'open_time',
      platformDid: 'platform_did',
      waybillId: 'waybill_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      drawee: 'string',
      draweeTaxNo: 'string',
      lzfpdm: 'string',
      lzfphm: 'string',
      openTime: 'number',
      platformDid: 'string',
      waybillId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateWaybillBillResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  // 
  txCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCode: 'tx_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWaybillStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
  // 
  platformDid?: string;
  // 运单ID
  // 
  taxWaybillId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      platformDid: 'platform_did',
      taxWaybillId: 'tax_waybill_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      platformDid: 'string',
      taxWaybillId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWaybillStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 运单状态
  // 
  status?: string;
  // 轨迹核验结果
  trackCheckResult?: TrackCheckResult;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      trackCheckResult: 'track_check_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      trackCheckResult: TrackCheckResult,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FinishWaybillOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链上账号 与司机did 二选一填写
  // 
  accountId?: string;
  // 运费，单位（元），平台支付给司机的运费
  allFreight: string;
  // 回单押金
  // 
  backFee?: string;
  // 业务类型
  businessType?: string;
  // 货物行业编码
  cargoBusinessCode?: string;
  // 货物商品编码
  cargoCode?: string;
  // 货物运费险
  cargoInsuranceMoney?: string;
  // 货源单号
  // 
  cargoOrder?: string;
  // 货物单位
  cargoUnit?: string;
  // 货物体积，单位（方）
  cargoVolume?: string;
  // 货物重量，单位（吨）
  cargoWeight?: string;
  // 车牌颜色，黄色、蓝色、绿色
  cartBadgeColor: string;
  // 车牌号
  // 
  cartBadgeNo: string;
  // 承运商did
  carCaptainDid?: string;
  // 货主运费金额，货主支付给平台的运费金额
  consignorFreightAmount: string;
  // 建单时间，13位毫秒级时间戳
  createdTime: number;
  // 到达门点时间，13位毫秒级时间戳
  destDoorsEndTime?: number;
  // 门点城市CODE，6位区域行政编码
  doorsCityCode?: string;
  // 门点城市名称
  doorsCityName?: string;
  // 门点区县CODE，6位区域行政编码
  doorsCountyCode?: string;
  // 门点区县名称
  doorsCountyName?: string;
  // 门点行政区划代码，12位区域行政编码，（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
  doorsDivisionCode?: string;
  // 门点省份CODE，6位区域行政编
  doorsProvinceCode?: string;
  // 门点省份名称
  doorsProvinceName?: string;
  // 发货方名称
  // 
  drawee: string;
  // 发货方纳税人识别号
  // 
  draweeTaxNo: string;
  // 司机分布式数字身份
  // 
  driverDid: string;
  // 司机姓名 已填司机分布式身份的情况下可不填
  // 
  driverName?: string;
  // 目的地详细地址
  endAddress?: string;
  // 目的地城市CODE，6位区域行政编
  endCityCode: string;
  // 目的地城市名称
  // 
  endCityName: string;
  // 目的地区县CODE，6位区域行政编
  endCountyCode?: string;
  // 目的地区县名称
  // 
  endCountyName?: string;
  // 结束行政区划代码 ，12位区域行政编，（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
  // 
  endDivisionCode: string;
  // 目的地省份CODE，6位区域行政编
  // 
  endProvinceCode: string;
  // 目的地省份名称
  // 
  endProvinceName: string;
  // 目的地街道CODE，12位行政区域编码
  endStreetCode?: string;
  // 目的地街道名称
  endStreetName?: string;
  // 终结时间，13位毫秒级时间戳
  endTime: number;
  // 运费增项
  // 
  freightIncr?: string;
  // 货物数量
  // 
  goodsAmount?: number;
  // 货物数量单位类型
  // 
  goodsAmountType?: string;
  // 货物名称
  // 
  goodsName: string;
  // 司机身份证号 已填司机分布式身份的情况下可不填
  // 
  idCard?: string;
  // 运费扣减
  // 
  lossFee?: string;
  // 司机手机号 已填司机分布式身份的情况下可不填
  // 
  mobileNo?: string;
  // 系统识别id 网商识别号
  // 
  partnerId?: string;
  // 是否进行资金验证
  // 
  payCheck?: boolean;
  // 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
  // 
  platformDid: string;
  // 预付款金额
  // 
  prepayments?: string;
  // 线下预付ETC
  // 
  prepaymentsBuyEtc?: string;
  // 线下气款金额
  // 
  prepaymentsBuyGas?: string;
  // 线下油款预付
  // 
  prepaymentsBuyOil?: string;
  // 预付ETC卡金额
  // 
  prepaymentsEtccard?: string;
  // 预付油卡金额
  // 
  prepaymentsOilcard?: string;
  // 油卡赠送金额
  // 
  presentAmountOil?: string;
  // 起始地详细地址
  startAddress?: string;
  // 起始地CODE
  // ，6位区域行政编
  startCityCode: string;
  // 起始地城市名称
  // 
  startCityName: string;
  // 起始地区县CODE
  // ，6位区域行政编
  startCountyCode?: string;
  // 起始地区县名称
  // 
  startCountyName?: string;
  // 起始行政区划代码，12位区域行政编，（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
  // 
  startDivisionCode: string;
  // 起始地省份CODE
  // ，6位区域行政编
  startProvinceCode: string;
  // 起始地省份名称
  // 
  startProvinceName: string;
  // 起始地街道CODE，12位区域行政编
  startStreetCode?: string;
  // 起始地街道名称
  startStreetName?: string;
  // 起运时间，13位毫秒级时间戳
  // 
  startTime: number;
  // 运单ID
  // 
  taxWaybillId: string;
  // 车长，可以填：不限车长或者1.8，2.7，3.8，4.2，5，6.2，6.8，7.7，8.2，8.7，9.6，11.7，12.5，13，13.7，15，16，17.5等不超过2位小数的数字
  truckLength?: string;
  // 车型，可以填写：不限车型，平板，高栏，厢式，集装箱，自卸，冷藏，保温，高低板，面包车，棉被车，爬梯车，飞翼车
  truckType?: string;
  // 运输单价
  // 
  unitPrice?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountId: 'account_id',
      allFreight: 'all_freight',
      backFee: 'back_fee',
      businessType: 'business_type',
      cargoBusinessCode: 'cargo_business_code',
      cargoCode: 'cargo_code',
      cargoInsuranceMoney: 'cargo_insurance_money',
      cargoOrder: 'cargo_order',
      cargoUnit: 'cargo_unit',
      cargoVolume: 'cargo_volume',
      cargoWeight: 'cargo_weight',
      cartBadgeColor: 'cart_badge_color',
      cartBadgeNo: 'cart_badge_no',
      carCaptainDid: 'car_captain_did',
      consignorFreightAmount: 'consignor_freight_amount',
      createdTime: 'created_time',
      destDoorsEndTime: 'dest_doors_end_time',
      doorsCityCode: 'doors_city_code',
      doorsCityName: 'doors_city_name',
      doorsCountyCode: 'doors_county_code',
      doorsCountyName: 'doors_county_name',
      doorsDivisionCode: 'doors_division_code',
      doorsProvinceCode: 'doors_province_code',
      doorsProvinceName: 'doors_province_name',
      drawee: 'drawee',
      draweeTaxNo: 'drawee_tax_no',
      driverDid: 'driver_did',
      driverName: 'driver_name',
      endAddress: 'end_address',
      endCityCode: 'end_city_code',
      endCityName: 'end_city_name',
      endCountyCode: 'end_county_code',
      endCountyName: 'end_county_name',
      endDivisionCode: 'end_division_code',
      endProvinceCode: 'end_province_code',
      endProvinceName: 'end_province_name',
      endStreetCode: 'end_street_code',
      endStreetName: 'end_street_name',
      endTime: 'end_time',
      freightIncr: 'freight_incr',
      goodsAmount: 'goods_amount',
      goodsAmountType: 'goods_amount_type',
      goodsName: 'goods_name',
      idCard: 'id_card',
      lossFee: 'loss_fee',
      mobileNo: 'mobile_no',
      partnerId: 'partner_id',
      payCheck: 'pay_check',
      platformDid: 'platform_did',
      prepayments: 'prepayments',
      prepaymentsBuyEtc: 'prepayments_buy_etc',
      prepaymentsBuyGas: 'prepayments_buy_gas',
      prepaymentsBuyOil: 'prepayments_buy_oil',
      prepaymentsEtccard: 'prepayments_etccard',
      prepaymentsOilcard: 'prepayments_oilcard',
      presentAmountOil: 'present_amount_oil',
      startAddress: 'start_address',
      startCityCode: 'start_city_code',
      startCityName: 'start_city_name',
      startCountyCode: 'start_county_code',
      startCountyName: 'start_county_name',
      startDivisionCode: 'start_division_code',
      startProvinceCode: 'start_province_code',
      startProvinceName: 'start_province_name',
      startStreetCode: 'start_street_code',
      startStreetName: 'start_street_name',
      startTime: 'start_time',
      taxWaybillId: 'tax_waybill_id',
      truckLength: 'truck_length',
      truckType: 'truck_type',
      unitPrice: 'unit_price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountId: 'string',
      allFreight: 'string',
      backFee: 'string',
      businessType: 'string',
      cargoBusinessCode: 'string',
      cargoCode: 'string',
      cargoInsuranceMoney: 'string',
      cargoOrder: 'string',
      cargoUnit: 'string',
      cargoVolume: 'string',
      cargoWeight: 'string',
      cartBadgeColor: 'string',
      cartBadgeNo: 'string',
      carCaptainDid: 'string',
      consignorFreightAmount: 'string',
      createdTime: 'number',
      destDoorsEndTime: 'number',
      doorsCityCode: 'string',
      doorsCityName: 'string',
      doorsCountyCode: 'string',
      doorsCountyName: 'string',
      doorsDivisionCode: 'string',
      doorsProvinceCode: 'string',
      doorsProvinceName: 'string',
      drawee: 'string',
      draweeTaxNo: 'string',
      driverDid: 'string',
      driverName: 'string',
      endAddress: 'string',
      endCityCode: 'string',
      endCityName: 'string',
      endCountyCode: 'string',
      endCountyName: 'string',
      endDivisionCode: 'string',
      endProvinceCode: 'string',
      endProvinceName: 'string',
      endStreetCode: 'string',
      endStreetName: 'string',
      endTime: 'number',
      freightIncr: 'string',
      goodsAmount: 'number',
      goodsAmountType: 'string',
      goodsName: 'string',
      idCard: 'string',
      lossFee: 'string',
      mobileNo: 'string',
      partnerId: 'string',
      payCheck: 'boolean',
      platformDid: 'string',
      prepayments: 'string',
      prepaymentsBuyEtc: 'string',
      prepaymentsBuyGas: 'string',
      prepaymentsBuyOil: 'string',
      prepaymentsEtccard: 'string',
      prepaymentsOilcard: 'string',
      presentAmountOil: 'string',
      startAddress: 'string',
      startCityCode: 'string',
      startCityName: 'string',
      startCountyCode: 'string',
      startCountyName: 'string',
      startDivisionCode: 'string',
      startProvinceCode: 'string',
      startProvinceName: 'string',
      startStreetCode: 'string',
      startStreetName: 'string',
      startTime: 'number',
      taxWaybillId: 'string',
      truckLength: 'string',
      truckType: 'string',
      unitPrice: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FinishWaybillOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  // 
  // 
  txCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCode: 'tx_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCargoPayorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 收款方银行账号
  bankAccountOfPayee?: string;
  // 付款方银行账号,货主付款的开户银行账号
  bankAccountOfPayer?: string;
  // 银行流水号，云资金校验时 必传；
  // 
  bankNo?: string;
  // 收款方开户行（平台收款）
  // 
  // MYBank_CloudCapital_2,  ## 云资金2.0
  // 
  // 
  bankOfPayee?: string;
  // 付款方开户行(货主付款)  取值
  // 
  // MYBank_CloudCapital_2,  ## 云资金2.0
  bankOfPayer?: string;
  // 账单编号
  billId?: string;
  // 货源单号
  // 
  cargoOrder: string;
  // 核验渠道，请按取值约束值填入
  // MYBank_CloudCapital_2,  ## 云资金2.0
  checkChannel?: string;
  // 币种  
  // 按下列取值：
  // CNY、USD
  // 
  // 
  currency?: string;
  // 费用类型 (运费、调度费、服务费)
  // 
  expenseType: string;
  // 收款方名称
  payee?: string;
  // 付款方名称
  payer?: string;
  // 费用金额（运单维度）
  // 
  payment: string;
  // 是否核验
  payCheck?: boolean;
  // 付款方did
  // 
  payDid: string;
  // 支付单号
  // 
  payId: string;
  // 支付备注
  // 
  payNote?: string;
  // 支付时间
  // 
  payTime: number;
  // 支付类型
  // 
  payType?: string;
  // 所属平台did
  platformDid: string;
  // 收款方did
  recvDid: string;
  // 请求唯一标识
  requestId: string;
  // 运单号
  taxWaybillId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bankAccountOfPayee: 'bank_account_of_payee',
      bankAccountOfPayer: 'bank_account_of_payer',
      bankNo: 'bank_no',
      bankOfPayee: 'bank_of_payee',
      bankOfPayer: 'bank_of_payer',
      billId: 'bill_id',
      cargoOrder: 'cargo_order',
      checkChannel: 'check_channel',
      currency: 'currency',
      expenseType: 'expense_type',
      payee: 'payee',
      payer: 'payer',
      payment: 'payment',
      payCheck: 'pay_check',
      payDid: 'pay_did',
      payId: 'pay_id',
      payNote: 'pay_note',
      payTime: 'pay_time',
      payType: 'pay_type',
      platformDid: 'platform_did',
      recvDid: 'recv_did',
      requestId: 'request_id',
      taxWaybillId: 'tax_waybill_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bankAccountOfPayee: 'string',
      bankAccountOfPayer: 'string',
      bankNo: 'string',
      bankOfPayee: 'string',
      bankOfPayer: 'string',
      billId: 'string',
      cargoOrder: 'string',
      checkChannel: 'string',
      currency: 'string',
      expenseType: 'string',
      payee: 'string',
      payer: 'string',
      payment: 'string',
      payCheck: 'boolean',
      payDid: 'string',
      payId: 'string',
      payNote: 'string',
      payTime: 'number',
      payType: 'string',
      platformDid: 'string',
      recvDid: 'string',
      requestId: 'string',
      taxWaybillId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCargoPayorderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 货源支付链上凭证
  // 
  txCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCode: 'tx_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveWaybillOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 链上账号 与司机did 二选一填写
  // 
  accountId?: string;
  // 运费，单位（元），平台支付给司机的运费
  allFreight: string;
  // 回单押金
  // 
  backFee?: string;
  // 业务类型
  businessType?: string;
  // 货物行业编码
  // 
  cargoBusinessCode?: string;
  // 货物商品编码
  // 
  cargoCode?: string;
  // 货物运费险
  // 
  cargoInsuranceMoney?: string;
  // 货源单号
  // 
  cargoOrder?: string;
  // 货物单位
  // 
  cargoUnit?: string;
  // 货物体积，单位（方）
  // 
  cargoVolume?: string;
  // 货物重量，单位（吨）
  cargoWeight?: string;
  // 车牌颜色，黄色、蓝色、绿色
  cartBadgeColor: string;
  // 车牌号
  // 
  cartBadgeNo: string;
  // 承运商did
  carCaptainDid?: string;
  // 货主运费金额，货主支付给平台的运费
  // 
  consignorFreightAmount: string;
  // 建单时间，13位毫秒级时间戳
  createdTime: number;
  // 到达门点时间，13位毫秒级时间戳
  destDoorsEndTime?: number;
  // 门点城市CODE，6位区域行政编码
  doorsCityCode?: string;
  // 门点城市名称
  doorsCityName?: string;
  // 门点区县CODE，6位区域行政编码
  doorsCountyCode?: string;
  // 门点区县名称
  doorsCountyName?: string;
  // 门点行政区划代码，12位区域行政编码（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
  doorsDivisionCode?: string;
  // 门点省份CODE，6位区域行政编码
  doorsProvinceCode?: string;
  // 门点省份名称
  doorsProvinceName?: string;
  // 发货方名称
  // 
  drawee: string;
  // 发货方纳税人识别号
  // 
  draweeTaxNo: string;
  // 司机分布式数字身份
  // 
  driverDid: string;
  // 司机姓名 已填司机分布式身份的情况下可不填
  // 
  driverName?: string;
  // 目的地详细地址
  endAddress?: string;
  // 目的地城市CODE，6位区域行政编码
  // 
  endCityCode: string;
  // 目的地城市名称
  // 
  endCityName: string;
  // 目的地区县CODE，6位区域行政编码
  endCountyCode?: string;
  // 目的地区县名称
  // 
  endCountyName?: string;
  // 结束行政区划代码（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
  // 
  endDivisionCode: string;
  // 目的地省份CODE，6位区域行政编码
  endProvinceCode: string;
  // 目的地省份名称
  // 
  endProvinceName: string;
  // 目的地街道CODE，12位区域行政编码
  endStreetCode?: string;
  // 目的地街道名称
  endStreetName?: string;
  // 运达时间，13位毫秒级时间戳
  endTime: number;
  // 运费增项
  // 
  freightIncr?: string;
  // 货物数量
  // 
  goodsAmount?: string;
  // 货物数量单位类型
  // 
  goodsAmountType?: string;
  // 货物名称
  // 
  goodsName: string;
  // 司机身份证号 已填司机分布式身份的情况下可不填
  // 
  idCard?: string;
  // 运费扣减
  // 
  lossFee?: string;
  // 司机手机号 已填司机分布式身份的情况下可不填
  // 
  mobileNo?: string;
  // 系统识别id 网商识别号
  // 
  partnerId?: string;
  // 是否进行资金验证
  // 
  payCheck?: boolean;
  // 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
  // 
  platformDid: string;
  // 预付款金额
  // 
  prepayments?: string;
  // 线下预付ETC
  // 
  prepaymentsBuyEtc?: string;
  // 线下气款金额
  // 
  prepaymentsBuyGas?: string;
  // 线下油款预付
  // 
  prepaymentsBuyOil?: string;
  // 预付ETC卡金额
  // 
  prepaymentsEtccard?: string;
  // 预付油卡金额
  // 
  prepaymentsOilcard?: string;
  // 油卡赠送金额
  // 
  presentAmountOil?: string;
  // 起始地详细地址
  startAddress?: string;
  // 起始地城市CODE，6位区域行政编码
  // 
  startCityCode: string;
  // 起始地城市名称
  // 
  startCityName: string;
  // 起始地区县CODE，6位区域行政编码
  // 
  // 
  startCountyCode?: string;
  // 起始地区县名称
  // 
  startCountyName?: string;
  // 起始行政区划代码（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
  // 
  startDivisionCode: string;
  // 起始地省份CODE，6位区域行政编码
  // 
  // 
  startProvinceCode: string;
  // 起始地省份名称
  // 
  startProvinceName: string;
  // 起始地街道CODE，12位区域行政编码
  startStreetCode?: string;
  // 起始地街道名称
  startStreetName?: string;
  // 起运时间，13位毫秒级时间戳
  startTime: number;
  // 运单ID
  // 
  taxWaybillId: string;
  // 车长，可以填：不限车长或者1.8，2.7，3.8，4.2，5，6.2，6.8，7.7，8.2，8.7，9.6，11.7，12.5，13，13.7，15，16，17.5等不超过2位小数的数字
  truckLength?: string;
  // 车型
  truckType?: string;
  // 运输单价
  // 
  unitPrice?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountId: 'account_id',
      allFreight: 'all_freight',
      backFee: 'back_fee',
      businessType: 'business_type',
      cargoBusinessCode: 'cargo_business_code',
      cargoCode: 'cargo_code',
      cargoInsuranceMoney: 'cargo_insurance_money',
      cargoOrder: 'cargo_order',
      cargoUnit: 'cargo_unit',
      cargoVolume: 'cargo_volume',
      cargoWeight: 'cargo_weight',
      cartBadgeColor: 'cart_badge_color',
      cartBadgeNo: 'cart_badge_no',
      carCaptainDid: 'car_captain_did',
      consignorFreightAmount: 'consignor_freight_amount',
      createdTime: 'created_time',
      destDoorsEndTime: 'dest_doors_end_time',
      doorsCityCode: 'doors_city_code',
      doorsCityName: 'doors_city_name',
      doorsCountyCode: 'doors_county_code',
      doorsCountyName: 'doors_county_name',
      doorsDivisionCode: 'doors_division_code',
      doorsProvinceCode: 'doors_province_code',
      doorsProvinceName: 'doors_province_name',
      drawee: 'drawee',
      draweeTaxNo: 'drawee_tax_no',
      driverDid: 'driver_did',
      driverName: 'driver_name',
      endAddress: 'end_address',
      endCityCode: 'end_city_code',
      endCityName: 'end_city_name',
      endCountyCode: 'end_county_code',
      endCountyName: 'end_county_name',
      endDivisionCode: 'end_division_code',
      endProvinceCode: 'end_province_code',
      endProvinceName: 'end_province_name',
      endStreetCode: 'end_street_code',
      endStreetName: 'end_street_name',
      endTime: 'end_time',
      freightIncr: 'freight_incr',
      goodsAmount: 'goods_amount',
      goodsAmountType: 'goods_amount_type',
      goodsName: 'goods_name',
      idCard: 'id_card',
      lossFee: 'loss_fee',
      mobileNo: 'mobile_no',
      partnerId: 'partner_id',
      payCheck: 'pay_check',
      platformDid: 'platform_did',
      prepayments: 'prepayments',
      prepaymentsBuyEtc: 'prepayments_buy_etc',
      prepaymentsBuyGas: 'prepayments_buy_gas',
      prepaymentsBuyOil: 'prepayments_buy_oil',
      prepaymentsEtccard: 'prepayments_etccard',
      prepaymentsOilcard: 'prepayments_oilcard',
      presentAmountOil: 'present_amount_oil',
      startAddress: 'start_address',
      startCityCode: 'start_city_code',
      startCityName: 'start_city_name',
      startCountyCode: 'start_county_code',
      startCountyName: 'start_county_name',
      startDivisionCode: 'start_division_code',
      startProvinceCode: 'start_province_code',
      startProvinceName: 'start_province_name',
      startStreetCode: 'start_street_code',
      startStreetName: 'start_street_name',
      startTime: 'start_time',
      taxWaybillId: 'tax_waybill_id',
      truckLength: 'truck_length',
      truckType: 'truck_type',
      unitPrice: 'unit_price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountId: 'string',
      allFreight: 'string',
      backFee: 'string',
      businessType: 'string',
      cargoBusinessCode: 'string',
      cargoCode: 'string',
      cargoInsuranceMoney: 'string',
      cargoOrder: 'string',
      cargoUnit: 'string',
      cargoVolume: 'string',
      cargoWeight: 'string',
      cartBadgeColor: 'string',
      cartBadgeNo: 'string',
      carCaptainDid: 'string',
      consignorFreightAmount: 'string',
      createdTime: 'number',
      destDoorsEndTime: 'number',
      doorsCityCode: 'string',
      doorsCityName: 'string',
      doorsCountyCode: 'string',
      doorsCountyName: 'string',
      doorsDivisionCode: 'string',
      doorsProvinceCode: 'string',
      doorsProvinceName: 'string',
      drawee: 'string',
      draweeTaxNo: 'string',
      driverDid: 'string',
      driverName: 'string',
      endAddress: 'string',
      endCityCode: 'string',
      endCityName: 'string',
      endCountyCode: 'string',
      endCountyName: 'string',
      endDivisionCode: 'string',
      endProvinceCode: 'string',
      endProvinceName: 'string',
      endStreetCode: 'string',
      endStreetName: 'string',
      endTime: 'number',
      freightIncr: 'string',
      goodsAmount: 'string',
      goodsAmountType: 'string',
      goodsName: 'string',
      idCard: 'string',
      lossFee: 'string',
      mobileNo: 'string',
      partnerId: 'string',
      payCheck: 'boolean',
      platformDid: 'string',
      prepayments: 'string',
      prepaymentsBuyEtc: 'string',
      prepaymentsBuyGas: 'string',
      prepaymentsBuyOil: 'string',
      prepaymentsEtccard: 'string',
      prepaymentsOilcard: 'string',
      presentAmountOil: 'string',
      startAddress: 'string',
      startCityCode: 'string',
      startCityName: 'string',
      startCountyCode: 'string',
      startCountyName: 'string',
      startDivisionCode: 'string',
      startProvinceCode: 'string',
      startProvinceName: 'string',
      startStreetCode: 'string',
      startStreetName: 'string',
      startTime: 'number',
      taxWaybillId: 'string',
      truckLength: 'string',
      truckType: 'string',
      unitPrice: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveWaybillOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  // 
  txCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCode: 'tx_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CloseWaybillOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 无车承运平台分布式数字身份
  platformDid: string;
  // 运单ID
  // 
  taxWaybillId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      platformDid: 'platform_did',
      taxWaybillId: 'tax_waybill_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      platformDid: 'string',
      taxWaybillId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CloseWaybillOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  // 
  txCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCode: 'tx_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FinishFinanceWaybillRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 运费
  allFreight?: string;
  // 回单押金
  backFee?: string;
  // 货主支付运费金额
  consignorFreightAmount: string;
  // 运费增项
  freightIncr?: string;
  // 运费扣减
  lossFee?: string;
  // 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
  platformDid: string;
  // 运单id
  taxWaybillId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      allFreight: 'all_freight',
      backFee: 'back_fee',
      consignorFreightAmount: 'consignor_freight_amount',
      freightIncr: 'freight_incr',
      lossFee: 'loss_fee',
      platformDid: 'platform_did',
      taxWaybillId: 'tax_waybill_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      allFreight: 'string',
      backFee: 'string',
      consignorFreightAmount: 'string',
      freightIncr: 'string',
      lossFee: 'string',
      platformDid: 'string',
      taxWaybillId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FinishFinanceWaybillResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCode: 'tx_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FinishFinanceTransportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 运费
  allFreight?: string;
  // 回单押金
  backFee?: string;
  // 货主支付运费金额
  consignorFreightAmount: string;
  // 到达门点时间
  destDoorsEndTime?: number;
  // 终结时间
  endTime: number;
  // 运费增项
  freightIncr?: string;
  // 运费扣减
  lossFee?: string;
  // 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
  platformDid: string;
  // 运单id
  taxWaybillId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      allFreight: 'all_freight',
      backFee: 'back_fee',
      consignorFreightAmount: 'consignor_freight_amount',
      destDoorsEndTime: 'dest_doors_end_time',
      endTime: 'end_time',
      freightIncr: 'freight_incr',
      lossFee: 'loss_fee',
      platformDid: 'platform_did',
      taxWaybillId: 'tax_waybill_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      allFreight: 'string',
      backFee: 'string',
      consignorFreightAmount: 'string',
      destDoorsEndTime: 'number',
      endTime: 'number',
      freightIncr: 'string',
      lossFee: 'string',
      platformDid: 'string',
      taxWaybillId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FinishFinanceTransportResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 货源支付链上凭证
  // 
  txCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCode: 'tx_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateFinanceWaybillRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 运费，单位（元），平台支付给司机的运费
  allFreight?: string;
  // 回单押金
  backFee?: string;
  // 业务类型
  businessType?: string;
  // 货物行业编码
  cargoBusinessCode?: string;
  // 货物商品编码
  cargoCode?: string;
  // 货物运费险
  cargoInsuranceMoney?: string;
  // 货源单号
  cargoOrder?: string;
  // 货物单位
  cargoUnit?: string;
  // 货物体积，单位（方）
  cargoVolume?: string;
  // 货物重量，单位（吨）
  cargoWeight?: string;
  // 车牌颜色，黄色、蓝色、绿色
  cartBadgeColor?: string;
  // 车牌号
  cartBadgeNo?: string;
  // 承运商did
  carCaptainDid?: string;
  // 货主支付运费金额，货主支付给平台的运费金额
  consignorFreightAmount?: string;
  // 建单时间，13位毫秒级时间戳
  createdTime?: number;
  // 到达门点时间，13位毫秒级时间戳
  destDoorsEndTime?: string;
  // 门点城市CODE，6位区域行政编码
  doorsCityCode?: string;
  // 门点城市名称
  doorsCityName?: string;
  // 门点区县CODE，6位区域行政编码
  doorsCountyCode?: string;
  // 门点区县名称
  doorsCountyName?: string;
  // 门点行政区划代码，12位区域行政编码，（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
  doorsDivisionCode?: string;
  // 门点省份CODE，6位行政区域编码
  doorsProvinceCode?: string;
  // 门点省份名称
  doorsProvinceName?: string;
  // 发货方名称
  drawee?: string;
  // 发货方纳税人识别号
  draweeTaxNo?: string;
  // 司机分布式数字身份
  driverDid?: string;
  // 目的地详细地址
  endAddress?: string;
  // 目的地城市CODE，6位区域行政编码
  endCityCode?: string;
  // 目的地城市名称
  endCityName?: string;
  // 目的地区县CODE
  endCountyCode?: string;
  // 目的地区县名称，6位区域行政编码
  endCountyName?: string;
  // 结束行政区划代码，12位区域行政编码，（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
  endDivisionCode?: string;
  // 目的地省份CODE，6位区域行政编码
  endProvinceCode?: string;
  // 目的地省份名称
  endProvinceName?: string;
  // 目的地街道CODE，12位区域行政编码
  endStreetCode?: string;
  // 目的地街道名称
  endStreetName?: string;
  // 终结时间，13位毫秒级时间戳
  endTime?: number;
  // 运费增项
  freightIncr?: string;
  // 货物数量
  goodsAmount?: number;
  // 货物数量单位类型
  goodsAmountType?: string;
  // 货物名称
  goodsName?: string;
  // 运费扣减
  lossFee?: string;
  // 网商识别号
  partnerId?: string;
  // 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
  // 
  platformDid: string;
  // 预付款金额
  prepayments?: string;
  // 线下预付ETC
  prepaymentsBuyEtc?: string;
  // 线下气款金额
  prepaymentsBuyGas?: string;
  // 线下油款预付
  prepaymentsBuyOil?: string;
  // 预付ETC卡金额
  prepaymentsEtccard?: string;
  // 预付油卡金额
  prepaymentsOilcard?: string;
  // 油卡赠送金额
  presentAmountOil?: string;
  // 起始地详细地址
  startAddress?: string;
  // 起始地CODE，6位区域行政编码
  startCityCode?: string;
  // 起始地城市名称
  startCityName?: string;
  // 起始地区县CODE，6位区域行政编码
  startCountyCode?: string;
  // 起始地区县名称
  startCountyName?: string;
  // 起始行政区划代码，12位区域行政编码（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
  startDivisionCode?: string;
  // 起始地省份CODE，6位区域行政编码
  startProvinceCode?: string;
  // 起始地省份名称
  startProvinceName?: string;
  // 起始地街道CODE，12位区域行政编码
  startStreetCode?: string;
  // 起始地街道名称
  startStreetName?: string;
  // 起运时间戳，13位毫秒级时间戳
  startTime?: number;
  // 运单id
  taxWaybillId: string;
  // 车长，可以填：不限车长或者1.8，2.7，3.8，4.2，5，6.2，6.8，7.7，8.2，8.7，9.6，11.7，12.5，13，13.7，15，16，17.5等不超过2位小数的数字
  truckLength?: string;
  // 车型，可以填写：不限车型，平板，高栏，厢式，集装箱，自卸，冷藏，保温，高低板，面包车，棉被车，爬梯车，飞翼车
  truckType?: string;
  // 运输单价
  unitPrice?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      allFreight: 'all_freight',
      backFee: 'back_fee',
      businessType: 'business_type',
      cargoBusinessCode: 'cargo_business_code',
      cargoCode: 'cargo_code',
      cargoInsuranceMoney: 'cargo_insurance_money',
      cargoOrder: 'cargo_order',
      cargoUnit: 'cargo_unit',
      cargoVolume: 'cargo_volume',
      cargoWeight: 'cargo_weight',
      cartBadgeColor: 'cart_badge_color',
      cartBadgeNo: 'cart_badge_no',
      carCaptainDid: 'car_captain_did',
      consignorFreightAmount: 'consignor_freight_amount',
      createdTime: 'created_time',
      destDoorsEndTime: 'dest_doors_end_time',
      doorsCityCode: 'doors_city_code',
      doorsCityName: 'doors_city_name',
      doorsCountyCode: 'doors_county_code',
      doorsCountyName: 'doors_county_name',
      doorsDivisionCode: 'doors_division_code',
      doorsProvinceCode: 'doors_province_code',
      doorsProvinceName: 'doors_province_name',
      drawee: 'drawee',
      draweeTaxNo: 'drawee_tax_no',
      driverDid: 'driver_did',
      endAddress: 'end_address',
      endCityCode: 'end_city_code',
      endCityName: 'end_city_name',
      endCountyCode: 'end_county_code',
      endCountyName: 'end_county_name',
      endDivisionCode: 'end_division_code',
      endProvinceCode: 'end_province_code',
      endProvinceName: 'end_province_name',
      endStreetCode: 'end_street_code',
      endStreetName: 'end_street_name',
      endTime: 'end_time',
      freightIncr: 'freight_incr',
      goodsAmount: 'goods_amount',
      goodsAmountType: 'goods_amount_type',
      goodsName: 'goods_name',
      lossFee: 'loss_fee',
      partnerId: 'partner_id',
      platformDid: 'platform_did',
      prepayments: 'prepayments',
      prepaymentsBuyEtc: 'prepayments_buy_etc',
      prepaymentsBuyGas: 'prepayments_buy_gas',
      prepaymentsBuyOil: 'prepayments_buy_oil',
      prepaymentsEtccard: 'prepayments_etccard',
      prepaymentsOilcard: 'prepayments_oilcard',
      presentAmountOil: 'present_amount_oil',
      startAddress: 'start_address',
      startCityCode: 'start_city_code',
      startCityName: 'start_city_name',
      startCountyCode: 'start_county_code',
      startCountyName: 'start_county_name',
      startDivisionCode: 'start_division_code',
      startProvinceCode: 'start_province_code',
      startProvinceName: 'start_province_name',
      startStreetCode: 'start_street_code',
      startStreetName: 'start_street_name',
      startTime: 'start_time',
      taxWaybillId: 'tax_waybill_id',
      truckLength: 'truck_length',
      truckType: 'truck_type',
      unitPrice: 'unit_price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      allFreight: 'string',
      backFee: 'string',
      businessType: 'string',
      cargoBusinessCode: 'string',
      cargoCode: 'string',
      cargoInsuranceMoney: 'string',
      cargoOrder: 'string',
      cargoUnit: 'string',
      cargoVolume: 'string',
      cargoWeight: 'string',
      cartBadgeColor: 'string',
      cartBadgeNo: 'string',
      carCaptainDid: 'string',
      consignorFreightAmount: 'string',
      createdTime: 'number',
      destDoorsEndTime: 'string',
      doorsCityCode: 'string',
      doorsCityName: 'string',
      doorsCountyCode: 'string',
      doorsCountyName: 'string',
      doorsDivisionCode: 'string',
      doorsProvinceCode: 'string',
      doorsProvinceName: 'string',
      drawee: 'string',
      draweeTaxNo: 'string',
      driverDid: 'string',
      endAddress: 'string',
      endCityCode: 'string',
      endCityName: 'string',
      endCountyCode: 'string',
      endCountyName: 'string',
      endDivisionCode: 'string',
      endProvinceCode: 'string',
      endProvinceName: 'string',
      endStreetCode: 'string',
      endStreetName: 'string',
      endTime: 'number',
      freightIncr: 'string',
      goodsAmount: 'number',
      goodsAmountType: 'string',
      goodsName: 'string',
      lossFee: 'string',
      partnerId: 'string',
      platformDid: 'string',
      prepayments: 'string',
      prepaymentsBuyEtc: 'string',
      prepaymentsBuyGas: 'string',
      prepaymentsBuyOil: 'string',
      prepaymentsEtccard: 'string',
      prepaymentsOilcard: 'string',
      presentAmountOil: 'string',
      startAddress: 'string',
      startCityCode: 'string',
      startCityName: 'string',
      startCountyCode: 'string',
      startCountyName: 'string',
      startDivisionCode: 'string',
      startProvinceCode: 'string',
      startProvinceName: 'string',
      startStreetCode: 'string',
      startStreetName: 'string',
      startTime: 'number',
      taxWaybillId: 'string',
      truckLength: 'string',
      truckType: 'string',
      unitPrice: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateFinanceWaybillResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 货源支付链上凭证
  // 
  txCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCode: 'tx_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartFinanceWaybillRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 货物运费险
  cargoInsuranceMoney?: string;
  // 车牌颜色
  cartBadgeColor: string;
  // 车牌号
  cartBadgeNo: string;
  // 承运商did
  carCaptainDid?: string;
  // 司机分布式数字身份
  driverDid: string;
  // 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
  platformDid: string;
  // 起运时间，13位毫秒级时间戳
  startTime: number;
  // 运单id
  taxWaybillId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      cargoInsuranceMoney: 'cargo_insurance_money',
      cartBadgeColor: 'cart_badge_color',
      cartBadgeNo: 'cart_badge_no',
      carCaptainDid: 'car_captain_did',
      driverDid: 'driver_did',
      platformDid: 'platform_did',
      startTime: 'start_time',
      taxWaybillId: 'tax_waybill_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      cargoInsuranceMoney: 'string',
      cartBadgeColor: 'string',
      cartBadgeNo: 'string',
      carCaptainDid: 'string',
      driverDid: 'string',
      platformDid: 'string',
      startTime: 'number',
      taxWaybillId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class StartFinanceWaybillResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 货源支付链上凭证
  // 
  txCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCode: 'tx_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCaptainDisRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 身份证号码
  certNo: string;
  // 扩展字段
  extensionInfo?: string;
  // 手机号码
  mobile: string;
  // 姓名
  name: string;
  // 所属平台did
  platformDid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certNo: 'cert_no',
      extensionInfo: 'extension_info',
      mobile: 'mobile',
      name: 'name',
      platformDid: 'platform_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certNo: 'string',
      extensionInfo: 'string',
      mobile: 'string',
      name: 'string',
      platformDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCaptainDisResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 车队长did
  did?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      did: 'did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      did: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCargowaybillBillRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 货主账单总额（两位小数）
  billAmount: string;
  // 账单code（唯一标识）
  billCode: string;
  // 账单生成时间(毫秒)
  billCreateTime: number;
  // 账单期限，单位（天），需填写1到360之间的整数
  billDeadline: string;
  // 付款方did
  billPayerDid: string;
  // 货源单号-货主运费列表
  cargoAmounts: CargoAmount[];
  // 币种
  currency: string;
  // 货主支付方式-支付金额列表
  payAmounts: PayAmount[];
  // 平台did
  platformDid: string;
  // 预计货主付款日期
  preConsignorPayDate: number;
  // 运单号-司机运费列表
  waybillAmounts: WaybillAmount[];
  // 账单到期日期
  deadline: number;
  // 运单上传状态，可填写：已完成、未完成
  waybillUploadStatus: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      billAmount: 'bill_amount',
      billCode: 'bill_code',
      billCreateTime: 'bill_create_time',
      billDeadline: 'bill_deadline',
      billPayerDid: 'bill_payer_did',
      cargoAmounts: 'cargo_amounts',
      currency: 'currency',
      payAmounts: 'pay_amounts',
      platformDid: 'platform_did',
      preConsignorPayDate: 'pre_consignor_pay_date',
      waybillAmounts: 'waybill_amounts',
      deadline: 'deadline',
      waybillUploadStatus: 'waybill_upload_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      billAmount: 'string',
      billCode: 'string',
      billCreateTime: 'number',
      billDeadline: 'string',
      billPayerDid: 'string',
      cargoAmounts: { 'type': 'array', 'itemType': CargoAmount },
      currency: 'string',
      payAmounts: { 'type': 'array', 'itemType': PayAmount },
      platformDid: 'string',
      preConsignorPayDate: 'number',
      waybillAmounts: { 'type': 'array', 'itemType': WaybillAmount },
      deadline: 'number',
      waybillUploadStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCargowaybillBillResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCode: 'tx_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmCargowaybillBillRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 账单金额（两位小数）
  billAmount: string;
  // 账单code（账单唯一标识）
  billCode: string;
  // 账单确认货主did
  billConsignorDid: string;
  // 账单确认日期（毫秒）
  billSureDate?: number;
  // 是否结算
  whetherSettle: boolean;
  // 平台did
  platformDid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      billAmount: 'bill_amount',
      billCode: 'bill_code',
      billConsignorDid: 'bill_consignor_did',
      billSureDate: 'bill_sure_date',
      whetherSettle: 'whether_settle',
      platformDid: 'platform_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      billAmount: 'string',
      billCode: 'string',
      billConsignorDid: 'string',
      billSureDate: 'number',
      whetherSettle: 'boolean',
      platformDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmCargowaybillBillResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCode: 'tx_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCargowaybillBillsettleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 平台did
  platformDid: string;
  // 账单code（账单唯一标识）
  billCode: string;
  // 结算金额（2位小数）
  settleAmount: string;
  // 结算状态（只有2种状态：部分结算、已结清）
  settleStatus: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      platformDid: 'platform_did',
      billCode: 'bill_code',
      settleAmount: 'settle_amount',
      settleStatus: 'settle_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      platformDid: 'string',
      billCode: 'string',
      settleAmount: 'string',
      settleStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCargowaybillBillsettleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCode: 'tx_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateWaybillorderPlatformdidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 新平台diid
  newPlatformDid: string;
  // 老平台did
  oldPlatformDid: string;
  // 运单号
  taxWaybillId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      newPlatformDid: 'new_platform_did',
      oldPlatformDid: 'old_platform_did',
      taxWaybillId: 'tax_waybill_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      newPlatformDid: 'string',
      oldPlatformDid: 'string',
      taxWaybillId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateWaybillorderPlatformdidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCode: 'tx_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateCargowaybillBillRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 货主账单总额（两位小数）
  billAmount: string;
  // 账单code（唯一标识）
  billCode: string;
  // 账单生成时间(毫秒)
  billCreateTime: number;
  // 账单期限，单位（天），需填写1到360之间的整数
  billDeadline: string;
  // 付款方did
  billPayerDid: string;
  // 货源单号-货主运费列表
  cargoAmounts: CargoAmount[];
  // 币种
  currency: string;
  // 账单到期日期
  deadline: number;
  // 货主支付方式-支付金额列表
  payAmounts: PayAmount[];
  // 平台did
  platformDid: string;
  // 预计货主付款日期
  preConsignorPayDate: number;
  // 运单号-司机运费列表
  waybillAmounts?: WaybillAmount[];
  // 运单上传状态，可填写：已完成、未完成
  waybillUploadStatus: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      billAmount: 'bill_amount',
      billCode: 'bill_code',
      billCreateTime: 'bill_create_time',
      billDeadline: 'bill_deadline',
      billPayerDid: 'bill_payer_did',
      cargoAmounts: 'cargo_amounts',
      currency: 'currency',
      deadline: 'deadline',
      payAmounts: 'pay_amounts',
      platformDid: 'platform_did',
      preConsignorPayDate: 'pre_consignor_pay_date',
      waybillAmounts: 'waybill_amounts',
      waybillUploadStatus: 'waybill_upload_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      billAmount: 'string',
      billCode: 'string',
      billCreateTime: 'number',
      billDeadline: 'string',
      billPayerDid: 'string',
      cargoAmounts: { 'type': 'array', 'itemType': CargoAmount },
      currency: 'string',
      deadline: 'number',
      payAmounts: { 'type': 'array', 'itemType': PayAmount },
      platformDid: 'string',
      preConsignorPayDate: 'number',
      waybillAmounts: { 'type': 'array', 'itemType': WaybillAmount },
      waybillUploadStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateCargowaybillBillResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCode: 'tx_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDisDidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 个人身份证号。当组织类型为个人时，此字段为必填项
  certNo?: string;
  // 企业名称。当组织类型为企业时，此字段为必填项
  epCertName?: string;
  // 企业信用号码。当组织类型为企业时，此字段为必填项
  epCertNo?: string;
  // 扩展字段
  extensionInfo?: string;
  // 企业法人姓名。当申请企业类型网络货运平台或者子平台时，此字段为必填项
  legalPersonCertName?: string;
  // 企业法人身份证号码。当申请企业类型网络货运平台或者子平台时，此字段为必填项
  legalPersonCertNo?: string;
  // 个人手机号码。当组织类型为个人时，此字段为必填项
  mobile?: string;
  // 个人姓名。当组织类型为个人时，此字段为必填项
  name?: string;
  // 组织类型。企业或者个人，二选一填入
  organizationType: string;
  // 所属平台did。如果为空时，表示创建根平台，允许申请网络货运平台或者3pl角色。创建除根平台外的其他身份时，所属平台did必须填写。
  platformDid?: string;
  // 角色类型。
  // 当组织类型为个人时，可填角色：货主、司机、承运商；
  // 当组织类型为企业时，可填角色：网络货运平台、道路运输企业/3pl、货主、子平台、承运商、托盘方
  roleType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      certNo: 'cert_no',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
      extensionInfo: 'extension_info',
      legalPersonCertName: 'legal_person_cert_name',
      legalPersonCertNo: 'legal_person_cert_no',
      mobile: 'mobile',
      name: 'name',
      organizationType: 'organization_type',
      platformDid: 'platform_did',
      roleType: 'role_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      certNo: 'string',
      epCertName: 'string',
      epCertNo: 'string',
      extensionInfo: 'string',
      legalPersonCertName: 'string',
      legalPersonCertNo: 'string',
      mobile: 'string',
      name: 'string',
      organizationType: 'string',
      platformDid: 'string',
      roleType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDisDidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 分布式数字身份did
  did?: string;
  // 组织类型
  organizationType?: string;
  // 现阶段此did下的所有授予的角色
  roleTypes?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      did: 'did',
      organizationType: 'organization_type',
      roleTypes: 'role_types',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      did: 'string',
      organizationType: 'string',
      roleTypes: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadTransportContractRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 合同甲方did，一般为合同甲方的链上数字身份
  partyADid: string;
  // 运输合同生效日期，格式要求yyyy-MM-dd
  contractEffectiveDate: string;
  // 运输合同到期日期，要求格式yyyy-MM-dd
  contractExpiresDate: string;
  // 影像件文件信息列表，可以包含多个文件，每个文件需要有文件id和文件hash  (请求蚂蚁影像上传接口获取的文件id和文件hash)。影像文件格式要求：bmp,jpg,jpeg,gif,psd,png,tiff,tga,eps,pdf
  fileInfos: UploadFileInfo[];
  // 合同乙方Did，一般为合同乙方的链上数字身份
  partyBDid: string;
  // 运输合同编号
  transportContractCode: string;
  // 所属平台did
  platformDid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      partyADid: 'party_a_did',
      contractEffectiveDate: 'contract_effective_date',
      contractExpiresDate: 'contract_expires_date',
      fileInfos: 'file_infos',
      partyBDid: 'party_b_did',
      transportContractCode: 'transport_contract_code',
      platformDid: 'platform_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      partyADid: 'string',
      contractEffectiveDate: 'string',
      contractExpiresDate: 'string',
      fileInfos: { 'type': 'array', 'itemType': UploadFileInfo },
      partyBDid: 'string',
      transportContractCode: 'string',
      platformDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadTransportContractResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCode: 'tx_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadTransportRouteRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 目的地省市区，要求格式 XX省-XX市-XX区，比如四川省-成都市-青白江区。当线路类型为STOCK_IN（即入库物流）时，此字段必填
  endAddress?: string;
  // 目的地详细地址，街道村社区道路楼宇门牌号。当线路类型为STOCK_IN（即入库物流）时，此字段必填
  endDetailedAddress?: string;
  // 起始地省市区，要求格式 XX省-XX市-XX区。比如浙江省-杭州市-余杭区。当线路类型为STOCK_OUT（即出库物流）时，此字段必填
  startAddress?: string;
  // 起始地详细地址，街道村社区道路楼宇门牌号。当线路类型为STOCK_OUT（即出库物流）时，此字段必填
  startDetailedAddress?: string;
  // 3plDid
  thirdPartyLogisticsDid: string;
  // 运输合同编号
  transportContractCode: string;
  // 运输线路编码
  transportRouteCode: string;
  // 线路类型，以下二选一填写（可填STOCK_OUT、STOCK_IN）。注：以上分别表示出库物流、入库物流
  routeType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      endAddress: 'end_address',
      endDetailedAddress: 'end_detailed_address',
      startAddress: 'start_address',
      startDetailedAddress: 'start_detailed_address',
      thirdPartyLogisticsDid: 'third_party_logistics_did',
      transportContractCode: 'transport_contract_code',
      transportRouteCode: 'transport_route_code',
      routeType: 'route_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      endAddress: 'string',
      endDetailedAddress: 'string',
      startAddress: 'string',
      startDetailedAddress: 'string',
      thirdPartyLogisticsDid: 'string',
      transportContractCode: 'string',
      transportRouteCode: 'string',
      routeType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadTransportRouteResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCode: 'tx_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTransportWaybillRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 运费，3pl支付给下承运商的运费金额，单位（元），要求格式为不超过二位小数
  allFreight: string;
  // 货物名称
  cargoName: string;
  // 货物体积，单位（方）。货物重量、货物体积二选一填写
  cargoVolume?: string;
  // 货物重量，单位（吨）。货物重量、货物体积二选一填写
  cargoWeight?: string;
  // 下游承运商did，一般为下一级承运商数字身份
  carrierDid: string;
  // 车牌颜色，需填写黄色、蓝色、绿色中的一种
  carBadgeColor: string;
  // 车牌号，承运车牌号
  carBadgeNo: string;
  // 货主did，一般为合同甲方的链上数字身份
  consignorDid: string;
  // 创建时间，13位毫秒级时间戳
  createTime: number;
  // 实际承运司机did，实际承运司机的链上数字身份
  driverDid: string;
  // 目的地省市区，要求格式 XX省-XX市-XX区，比如四川省-成都市-青白江区
  endAddress: string;
  // 目的地详细地址，街道村社区道路楼宇门牌号
  endDetailedAddress: string;
  // 货物数量
  goodsAmount?: number;
  // 货物数量单位类型
  goodsAmountType?: string;
  // 起始地省市区，要求格式 XX省-XX市-XX区。比如浙江省-杭州市-余杭区
  startAddress: string;
  // 起始地详细地址，街道村社区道路楼宇门牌号
  startDetailedAddress: string;
  // 客户系统内运单编号
  taxWaybillId: string;
  // 3plDid，一般为合同乙方的链上数字身份
  thirdPartyLogisticsDid: string;
  // 所属合同编号
  transportContractCode?: string;
  // 所属运输线路编码
  transportRouteCode?: string;
  // 托盘方did
  palletDid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      allFreight: 'all_freight',
      cargoName: 'cargo_name',
      cargoVolume: 'cargo_volume',
      cargoWeight: 'cargo_weight',
      carrierDid: 'carrier_did',
      carBadgeColor: 'car_badge_color',
      carBadgeNo: 'car_badge_no',
      consignorDid: 'consignor_did',
      createTime: 'create_time',
      driverDid: 'driver_did',
      endAddress: 'end_address',
      endDetailedAddress: 'end_detailed_address',
      goodsAmount: 'goods_amount',
      goodsAmountType: 'goods_amount_type',
      startAddress: 'start_address',
      startDetailedAddress: 'start_detailed_address',
      taxWaybillId: 'tax_waybill_id',
      thirdPartyLogisticsDid: 'third_party_logistics_did',
      transportContractCode: 'transport_contract_code',
      transportRouteCode: 'transport_route_code',
      palletDid: 'pallet_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      allFreight: 'string',
      cargoName: 'string',
      cargoVolume: 'string',
      cargoWeight: 'string',
      carrierDid: 'string',
      carBadgeColor: 'string',
      carBadgeNo: 'string',
      consignorDid: 'string',
      createTime: 'number',
      driverDid: 'string',
      endAddress: 'string',
      endDetailedAddress: 'string',
      goodsAmount: 'number',
      goodsAmountType: 'string',
      startAddress: 'string',
      startDetailedAddress: 'string',
      taxWaybillId: 'string',
      thirdPartyLogisticsDid: 'string',
      transportContractCode: 'string',
      transportRouteCode: 'string',
      palletDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTransportWaybillResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCode: 'tx_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateWaybillActionRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 操作类型，以下二选一填写：运单起运、运输完成
  operateAction: string;
  // 运单起运或运输完成的时间，要求为13位毫秒级时间戳
  operateActionTime: number;
  // 客户系统内运单编号
  taxWaybillId: string;
  // 3plDid，一般为合同乙方的链上数字身份
  thirdPartyLogisticsDid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      operateAction: 'operate_action',
      operateActionTime: 'operate_action_time',
      taxWaybillId: 'tax_waybill_id',
      thirdPartyLogisticsDid: 'third_party_logistics_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      operateAction: 'string',
      operateActionTime: 'number',
      taxWaybillId: 'string',
      thirdPartyLogisticsDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateWaybillActionResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCode: 'tx_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTransportWaybillRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 运费，3pl支付给下承运商的运费金额，单位（元），要求格式为不超过二位小数
  allFreight?: string;
  // 货物名称
  cargoName?: string;
  // 单位（方），货物体积
  cargoVolume?: string;
  // 单位（吨），货物重量
  cargoWeight?: string;
  // 下游承运商did，一般为下一级承运商数字身份
  carrierDid?: string;
  // 车牌颜色，需填写黄色、蓝色、绿色中的一种
  carBadgeColor?: string;
  // 车牌号，承运车牌号
  carBadgeNo?: string;
  // 货主did，一般为合同甲方的链上数字身份
  consignorDid?: string;
  // 创建时间，13位毫秒级时间戳
  createTime?: number;
  // 实际承运司机did，实际承运司机的链上数字身份
  driverDid?: string;
  // 目的地省市区，要求格式 XX省-XX市-XX区，比如四川省-成都市-青白江区
  endAddress?: string;
  // 目的地详细地址，街道村社区道路楼宇门牌号
  endDetailedAddress?: string;
  // 到达时间，13位毫秒级时间戳
  endTime?: number;
  // 货物数量
  goodsAmount?: number;
  // 货物数量单位类型
  goodsAmountType?: string;
  // 起始地省市区，要求格式 XX省-XX市-XX区。比如浙江省-杭州市-余杭区
  startAddress?: string;
  // 起始地详细地址，街道村社区道路楼宇门牌号
  startDetailedAddress?: string;
  // 起运时间，13位毫秒级时间戳
  startTime?: number;
  // 客户系统内运单编号
  taxWaybillId: string;
  // 3plDid，一般为合同乙方的链上数字身份
  thirdPartyLogisticsDid: string;
  // 所属合同编号
  transportContractCode?: string;
  // 所属运输线路编码
  transportRouteCode?: string;
  // 托盘方did
  palletDid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      allFreight: 'all_freight',
      cargoName: 'cargo_name',
      cargoVolume: 'cargo_volume',
      cargoWeight: 'cargo_weight',
      carrierDid: 'carrier_did',
      carBadgeColor: 'car_badge_color',
      carBadgeNo: 'car_badge_no',
      consignorDid: 'consignor_did',
      createTime: 'create_time',
      driverDid: 'driver_did',
      endAddress: 'end_address',
      endDetailedAddress: 'end_detailed_address',
      endTime: 'end_time',
      goodsAmount: 'goods_amount',
      goodsAmountType: 'goods_amount_type',
      startAddress: 'start_address',
      startDetailedAddress: 'start_detailed_address',
      startTime: 'start_time',
      taxWaybillId: 'tax_waybill_id',
      thirdPartyLogisticsDid: 'third_party_logistics_did',
      transportContractCode: 'transport_contract_code',
      transportRouteCode: 'transport_route_code',
      palletDid: 'pallet_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      allFreight: 'string',
      cargoName: 'string',
      cargoVolume: 'string',
      cargoWeight: 'string',
      carrierDid: 'string',
      carBadgeColor: 'string',
      carBadgeNo: 'string',
      consignorDid: 'string',
      createTime: 'number',
      driverDid: 'string',
      endAddress: 'string',
      endDetailedAddress: 'string',
      endTime: 'number',
      goodsAmount: 'number',
      goodsAmountType: 'string',
      startAddress: 'string',
      startDetailedAddress: 'string',
      startTime: 'number',
      taxWaybillId: 'string',
      thirdPartyLogisticsDid: 'string',
      transportContractCode: 'string',
      transportRouteCode: 'string',
      palletDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTransportWaybillResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCode: 'tx_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadTransportReceiptRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 货主did，一般为合同甲方的链上数字身份
  consignorDid: string;
  // 请求蚂蚁影像上传接口上传文件获取的文件id和文件hash信息。影像文件格式：bmp,jpg,jpeg,gif,psd,png,tiff,tga,eps,pdf
  fileInfo: UploadFileInfo;
  // 回单id，客户编辑的唯一回单编码
  receiptId: string;
  // 客户系统内运单编号
  taxWaybillId: string;
  // 3plDid，一般为合同乙方的链上数字身份
  thirdPartyLogisticsDid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      consignorDid: 'consignor_did',
      fileInfo: 'file_info',
      receiptId: 'receipt_id',
      taxWaybillId: 'tax_waybill_id',
      thirdPartyLogisticsDid: 'third_party_logistics_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      consignorDid: 'string',
      fileInfo: UploadFileInfo,
      receiptId: 'string',
      taxWaybillId: 'string',
      thirdPartyLogisticsDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadTransportReceiptResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCode: 'tx_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBillReceivablebillRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 账单总金额，单位（元），周期内应向发货方收取的运费总金额，不超过2位小数的数字
  billAmount: string;
  // 账单生成时间，13位毫秒级时间戳
  billCreateTime: number;
  // 账单期限，单位（天），合同约定的结算周期，需填写1到360的整数
  billDeadline: number;
  // 账单id，客户生成的账单唯一编号
  billId: string;
  // 收款方did，账单的收款方数字身份
  billPayeeDid: string;
  // 付款方did，账单的付款方数字身份
  billPayerDid: string;
  // 账单起始日期，13位毫秒级时间戳
  billStartTime: number;
  // 关联合同编号，账单关联的合同编号，如为合同物流请填写
  // 
  contractCode?: string;
  // 账单到期日期，13位毫秒级时间戳
  deadline: number;
  // 账单关联运单号数组，元素个数不能超过1000个
  waybillIds: string[];
  // 所属平台did
  platformDid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      billAmount: 'bill_amount',
      billCreateTime: 'bill_create_time',
      billDeadline: 'bill_deadline',
      billId: 'bill_id',
      billPayeeDid: 'bill_payee_did',
      billPayerDid: 'bill_payer_did',
      billStartTime: 'bill_start_time',
      contractCode: 'contract_code',
      deadline: 'deadline',
      waybillIds: 'waybill_ids',
      platformDid: 'platform_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      billAmount: 'string',
      billCreateTime: 'number',
      billDeadline: 'number',
      billId: 'string',
      billPayeeDid: 'string',
      billPayerDid: 'string',
      billStartTime: 'number',
      contractCode: 'string',
      deadline: 'number',
      waybillIds: { 'type': 'array', 'itemType': 'string' },
      platformDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBillReceivablebillResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCode: 'tx_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateReceivablebillStatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 账单id，客户生成的账单唯一编号
  billId: string;
  // 收款方did，账单的收款方数字身份
  billPayeeDid: string;
  // 账单后续所可能产生的状态，以下三选一填写：账单确认、部分结算、已结清
  // 
  // 
  updateStatus: string;
  // 更新状态时间，13位毫秒级时间戳
  updateStatusTime: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      billId: 'bill_id',
      billPayeeDid: 'bill_payee_did',
      updateStatus: 'update_status',
      updateStatusTime: 'update_status_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      billId: 'string',
      billPayeeDid: 'string',
      updateStatus: 'string',
      updateStatusTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateReceivablebillStatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCode: 'tx_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBillReceivablebillRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 账单总金额，单位（元），周期内应向发货方收取的运费总金额，不超过2位小数的数字
  billAmount?: string;
  // 账单生成时间，13位毫秒级时间戳
  billCreateTime?: number;
  // 账单期限，单位（天），合同约定的结算周期，需填写1到360的整数
  billDeadline?: number;
  // 账单id，客户生成的账单唯一编号
  billId: string;
  // 收款方did，账单的收款方数字身份
  billPayeeDid: string;
  // 付款方did，账单的付款方数字身份
  billPayerDid?: string;
  // 账单起始日期，13位毫秒级时间戳
  billStartTime?: number;
  // 关联合同编号，账单关联的合同编号，如为合同物流请填写
  contractCode?: string;
  // 账单到期日期，13位毫秒级时间戳
  deadline?: number;
  // 账单关联运单号数组，元素个数不能超过1000个
  waybillIds?: string[];
  // 所属平台did
  platformDid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      billAmount: 'bill_amount',
      billCreateTime: 'bill_create_time',
      billDeadline: 'bill_deadline',
      billId: 'bill_id',
      billPayeeDid: 'bill_payee_did',
      billPayerDid: 'bill_payer_did',
      billStartTime: 'bill_start_time',
      contractCode: 'contract_code',
      deadline: 'deadline',
      waybillIds: 'waybill_ids',
      platformDid: 'platform_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      billAmount: 'string',
      billCreateTime: 'number',
      billDeadline: 'number',
      billId: 'string',
      billPayeeDid: 'string',
      billPayerDid: 'string',
      billStartTime: 'number',
      contractCode: 'string',
      deadline: 'number',
      waybillIds: { 'type': 'array', 'itemType': 'string' },
      platformDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBillReceivablebillResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCode: 'tx_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateHighwayInvoiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 发票号码，8位发票号码
  invoiceNo: string;
  // 发票代码，10位或者12位发票代码
  invoiceCode: string;
  // 发票校验码后6位
  verifyCode?: string;
  // 收款方did，出票方，需要出票收钱的
  payeeDid: string;
  // 付款方did，收票方，需要收票付钱的
  payerDid: string;
  // 发票含税金额， 不超过2位小数的数字
  invoiceContainsTax: string;
  // 发票不含税金额，不超过2位小数的数字
  invoiceWithoutTax: string;
  // 开票日期，格式为yyyy-mm-dd
  invoiceDate: string;
  // 发票类型，以下二选一填写：应收发票、应付发票
  invoiceType: string;
  // 影像件ID，发票上传蚂蚁oss的文件ID。注意：影像件id和影像件hash，必须都填写或都不填，不可只填其中一项
  fileId?: string;
  // 影像件hash，上传蚂蚁oss的文件hash。注意：影像件id和影像件hash，必须都填写或都不填，不可只填其中一项
  fileHash?: string;
  // 发票归属平台did，用以区分是哪家平台/企业的发票
  platformDid: string;
  // 发票种类，以下四选一填写（可填VAT_SPECIAL_INVOICE、VAT_NORMAL_INVOICE、VAT_ROLL_INVOICE、ELECTRONIC_INVOICE）。注：以上分别表示增值税专票、增值税普票、增值税卷票、电子发票
  type: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      invoiceNo: 'invoice_no',
      invoiceCode: 'invoice_code',
      verifyCode: 'verify_code',
      payeeDid: 'payee_did',
      payerDid: 'payer_did',
      invoiceContainsTax: 'invoice_contains_tax',
      invoiceWithoutTax: 'invoice_without_tax',
      invoiceDate: 'invoice_date',
      invoiceType: 'invoice_type',
      fileId: 'file_id',
      fileHash: 'file_hash',
      platformDid: 'platform_did',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      invoiceNo: 'string',
      invoiceCode: 'string',
      verifyCode: 'string',
      payeeDid: 'string',
      payerDid: 'string',
      invoiceContainsTax: 'string',
      invoiceWithoutTax: 'string',
      invoiceDate: 'string',
      invoiceType: 'string',
      fileId: 'string',
      fileHash: 'string',
      platformDid: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateHighwayInvoiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCode: 'tx_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWaybillInfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 运单id
  taxWaybillId: string;
  // 填写无车承运平台did或者3plDid
  did: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      taxWaybillId: 'tax_waybill_id',
      did: 'did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      taxWaybillId: 'string',
      did: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWaybillInfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // json串形式的运单信息
  waybill?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      waybill: 'waybill',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      waybill: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBillReceivablebillnodetailRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 账单总金额，单位（元），周期内应向发货方收取的运费总金额，不超过2位小数的数字
  billAmount: string;
  // 账单生成时间，13位毫秒级时间戳
  billCreateTime: number;
  // 账单期限，单位（天），合同约定的结算周期
  billDeadline: number;
  // 账单id，客户生成的账单唯一编号
  billId: string;
  // 收款方did，账单的收款方数字身份
  billPayeeDid: string;
  // 付款方did，账单的付款方数字身份
  billPayerDid: string;
  // 账单起始日期，13位毫秒级时间戳
  billStartTime: number;
  // 关联合同编号，账单关联的合同编号，如为合同物流请填写
  contractCode?: string;
  // 账单到期日期，13位毫秒级时间戳
  deadline: number;
  // 所属平台did
  platformDid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      billAmount: 'bill_amount',
      billCreateTime: 'bill_create_time',
      billDeadline: 'bill_deadline',
      billId: 'bill_id',
      billPayeeDid: 'bill_payee_did',
      billPayerDid: 'bill_payer_did',
      billStartTime: 'bill_start_time',
      contractCode: 'contract_code',
      deadline: 'deadline',
      platformDid: 'platform_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      billAmount: 'string',
      billCreateTime: 'number',
      billDeadline: 'number',
      billId: 'string',
      billPayeeDid: 'string',
      billPayerDid: 'string',
      billStartTime: 'number',
      contractCode: 'string',
      deadline: 'number',
      platformDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBillReceivablebillnodetailResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCode: 'tx_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveTrailerCorpRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业名称
  companyName: string;
  // 企业统一社会信用代码
  socialCreditCode: string;
  // 渠道企业名称
  channelCompanyName: string;
  // 渠道企业信用代码
  channelSocialCreditCode: string;
  // 企业入驻渠道日期
  entryDate: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyName: 'company_name',
      socialCreditCode: 'social_credit_code',
      channelCompanyName: 'channel_company_name',
      channelSocialCreditCode: 'channel_social_credit_code',
      entryDate: 'entry_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyName: 'string',
      socialCreditCode: 'string',
      channelCompanyName: 'string',
      channelSocialCreditCode: 'string',
      entryDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveTrailerCorpResponse extends $tea.Model {
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

export class SaveTrailerTransportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业名称
  companyName: string;
  // 企业统一社会信用代码
  socialCreditCode: string;
  // 运营数据.月份
  transportMonth: string;
  // 运营数据.运输箱量
  transportContainerQuantity?: number;
  // 运营数据.运费总额
  freightTotalAmount: string;
  // 运营数据.运输司机量
  transportDriverQuantity?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyName: 'company_name',
      socialCreditCode: 'social_credit_code',
      transportMonth: 'transport_month',
      transportContainerQuantity: 'transport_container_quantity',
      freightTotalAmount: 'freight_total_amount',
      transportDriverQuantity: 'transport_driver_quantity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyName: 'string',
      socialCreditCode: 'string',
      transportMonth: 'string',
      transportContainerQuantity: 'number',
      freightTotalAmount: 'string',
      transportDriverQuantity: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveTrailerTransportResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 上传结果 
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

export class QueryBusinessInstancestatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实例id
  instanceId: string;
  // 实例对应的租户id
  instanceTenant: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      instanceId: 'instance_id',
      instanceTenant: 'instance_tenant',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      instanceId: 'string',
      instanceTenant: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBusinessInstancestatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 实例id
  instanceId?: string;
  // 实例对应的租户id
  instanceTenant?: string;
  // STARTED---运行中
  // STOPPED--已停服
  // RELEASED--已释放
  instanceStatus?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      instanceId: 'instance_id',
      instanceTenant: 'instance_tenant',
      instanceStatus: 'instance_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      instanceId: 'string',
      instanceTenant: 'string',
      instanceStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OpenCreditDriverRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 司机云资金商户ID
  accountId: string;
  // 开通结果回调url
  callbackUrl: string;
  // 司机分布式数字身份
  driverDid: string;
  // 集团平台方分布式数字身份
  groupPlatformDid: string;
  // 产品id 目前填写 PRODUCT_MYBANK
  productId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountId: 'account_id',
      callbackUrl: 'callback_url',
      driverDid: 'driver_did',
      groupPlatformDid: 'group_platform_did',
      productId: 'product_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountId: 'string',
      callbackUrl: 'string',
      driverDid: 'string',
      groupPlatformDid: 'string',
      productId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class OpenCreditDriverResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签署开通申请id
  applyId?: string;
  // 协议签署开通url
  signUrl?: string;
  // 签署状态
  // -1:签署开通失败, 0:未签署开通, 1:已签署开通
  status?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      applyId: 'apply_id',
      signUrl: 'sign_url',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      applyId: 'string',
      signUrl: 'string',
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditDriverRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 申请id
  applyId?: string;
  // 司机分布式数字身份
  did: string;
  // 集团平台方分布式数字身份
  groupPlatformDid: string;
  // 产品id  目前填写PRODUCT_MYBANK
  productId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applyId: 'apply_id',
      did: 'did',
      groupPlatformDid: 'group_platform_did',
      productId: 'product_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applyId: 'string',
      did: 'string',
      groupPlatformDid: 'string',
      productId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditDriverResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 开通失败信息
  queryMsg?: string;
  // 开通状态
  // -1:失败状态， 0:未完成状态， 1:已完成状态
  status?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      queryMsg: 'query_msg',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      queryMsg: 'string',
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditConsignorRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 申请id
  applyId?: string;
  // 货主分布式数字身份
  did: string;
  // 集团平台方分布式数字身份
  groupPlatformDid: string;
  // 产品id
  // A模式： PRODUCT_MYBANK, 
  // A+模式： PRODUCT_MYBANK_A_PLUS, 
  // B模式： PRODUCT_MYBANK_B, 
  productId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applyId: 'apply_id',
      did: 'did',
      groupPlatformDid: 'group_platform_did',
      productId: 'product_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applyId: 'string',
      did: 'string',
      groupPlatformDid: 'string',
      productId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditConsignorResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 开通失败信息
  queryMsg?: string;
  // 开通状态
  // -1:失败状态， 0:未完成状态， 1:已完成状态
  status?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      queryMsg: 'query_msg',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      queryMsg: 'string',
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditBalanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 货主分布式数字身份
  consignorDid: string;
  // 支付单运费，运费最多精确到小数点后2位
  freight: string;
  // 集团平台方分布式数字身份
  groupPlatformDid: string;
  // 业务发起方分布式数字身份
  platformDid: string;
  // 产品id 
  // A模式：PRODUCT_MYBANK,  
  // A+模式：PRODUCT_MYBANK_A_PLUS,  
  // B模式：PRODUCT_MYBANK_B,
  // 
  productId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      consignorDid: 'consignor_did',
      freight: 'freight',
      groupPlatformDid: 'group_platform_did',
      platformDid: 'platform_did',
      productId: 'product_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      consignorDid: 'string',
      freight: 'string',
      groupPlatformDid: 'string',
      platformDid: 'string',
      productId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditBalanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否有信用流转额度
  hasBalance?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      hasBalance: 'has_balance',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      hasBalance: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadCreditIssueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 批次号
  batchId: string;
  // 发行结果回调url
  callbackUrl: string;
  // 货主分布式数字身份
  consignorDid: string;
  // 集团平台方分布式数字身份
  groupPlatformDid: string;
  // 发行信用流转信息列表
  issueApplyInfos: IssueApplyInfo[];
  // 业务发起方分布式数字身份
  platformDid: string;
  // 产品id 目前填PRODUCT_MYBANK
  productId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      batchId: 'batch_id',
      callbackUrl: 'callback_url',
      consignorDid: 'consignor_did',
      groupPlatformDid: 'group_platform_did',
      issueApplyInfos: 'issue_apply_infos',
      platformDid: 'platform_did',
      productId: 'product_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      batchId: 'string',
      callbackUrl: 'string',
      consignorDid: 'string',
      groupPlatformDid: 'string',
      issueApplyInfos: { 'type': 'array', 'itemType': IssueApplyInfo },
      platformDid: 'string',
      productId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadCreditIssueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 批次号
  batchId?: string;
  // 批次状态
  batchIdStatus?: number;
  // 发行url
  issueUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      batchId: 'batch_id',
      batchIdStatus: 'batch_id_status',
      issueUrl: 'issue_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      batchId: 'string',
      batchIdStatus: 'number',
      issueUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditIssuebatchstatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 批次号
  batchId: string;
  // 集团平台方分布式数字身份
  groupPlatformDid: string;
  // 业务发起方分布式数字身份
  platformDid: string;
  // 产品id 
  // A模式：PRODUCT_MYBANK， 
  // A+模式：PRODUCT_MYBANK_A_PLUS， 
  // A模式：PRODUCT_MYBANK_B， 
  productId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      batchId: 'batch_id',
      groupPlatformDid: 'group_platform_did',
      platformDid: 'platform_did',
      productId: 'product_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      batchId: 'string',
      groupPlatformDid: 'string',
      platformDid: 'string',
      productId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditIssuebatchstatusResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 批次号
  batchId?: string;
  // 批次状态
  batchStatus?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      batchId: 'batch_id',
      batchStatus: 'batch_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      batchId: 'string',
      batchStatus: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelCreditIssuebatchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 批次号
  batchId: string;
  // 货主分布式数字身份
  consignorDid: string;
  // 集团平台方分布式数字身份
  groupPlatformDid: string;
  // 业务发起方分布式数字身份
  platformDid: string;
  // 产品id 
  // A模式：PRODUCT_MYBANK，
  // A+模式：PRODUCT_MYBANK_A_PLUS，
  // B模式：PRODUCT_MYBANK_B
  productId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      batchId: 'batch_id',
      consignorDid: 'consignor_did',
      groupPlatformDid: 'group_platform_did',
      platformDid: 'platform_did',
      productId: 'product_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      batchId: 'string',
      consignorDid: 'string',
      groupPlatformDid: 'string',
      platformDid: 'string',
      productId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelCreditIssuebatchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 批次号
  batchId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      batchId: 'batch_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      batchId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditIssuebyidRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 信用流转发行批次号
  batchId: string;
  // 集团平台方分布式数字身份
  groupPlatformDid: string;
  // 是否只返回已发行凭证信息
  issuedOnly: boolean;
  // 信用流转发行凭证Id
  issueId?: string;
  // 页数 从1开始
  pageNum: number;
  // 每页显示数量 不超过100
  pageSize: number;
  // 业务发起方分布式数字身份
  platformDid: string;
  // 产品id 
  // A模式：PRODUCT_MYBANK，
  // A+模式：PRODUCT_MYBANK_A_PLUS，
  // B模式：PRODUCT_MYBANK_B
  productId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      batchId: 'batch_id',
      groupPlatformDid: 'group_platform_did',
      issuedOnly: 'issued_only',
      issueId: 'issue_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
      platformDid: 'platform_did',
      productId: 'product_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      batchId: 'string',
      groupPlatformDid: 'string',
      issuedOnly: 'boolean',
      issueId: 'string',
      pageNum: 'number',
      pageSize: 'number',
      platformDid: 'string',
      productId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditIssuebyidResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 信用流转批次号
  batchId?: string;
  // 批次状态
  batchIdStatus?: string;
  // 凭证发行者did
  did?: string;
  // 发行凭证列表
  issueIds?: IssueIdInfo[];
  // 页数 从1开始
  pageNum?: number;
  // 每页显示数量
  pageSize?: number;
  // 数据总量
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      batchId: 'batch_id',
      batchIdStatus: 'batch_id_status',
      did: 'did',
      issueIds: 'issue_ids',
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
      batchId: 'string',
      batchIdStatus: 'string',
      did: 'string',
      issueIds: { 'type': 'array', 'itemType': IssueIdInfo },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditIssuebytimeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 指定查询者分布式数字身份
  did: string;
  // 查询截止时间
  endDate: string;
  // 集团平台方分布式数字身份
  groupPlatformDid: string;
  // 是否只返回已发行凭证信息
  issuedOnly: boolean;
  // 页数 从1开始
  pageNum: number;
  // 每页显示数量 不超过100
  pageSize: number;
  // 业务发起方分布式数字身份
  platformDid: string;
  // 产品id 目前填PRODUCT_MYBANK
  productId: string;
  // 查询起始时间
  startDate: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      did: 'did',
      endDate: 'end_date',
      groupPlatformDid: 'group_platform_did',
      issuedOnly: 'issued_only',
      pageNum: 'page_num',
      pageSize: 'page_size',
      platformDid: 'platform_did',
      productId: 'product_id',
      startDate: 'start_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      did: 'string',
      endDate: 'string',
      groupPlatformDid: 'string',
      issuedOnly: 'boolean',
      pageNum: 'number',
      pageSize: 'number',
      platformDid: 'string',
      productId: 'string',
      startDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditIssuebytimeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 信用流转批次号
  batchId?: string;
  // 批次状态
  batchIdStatus?: number;
  // 凭证发行者did
  did?: string;
  // 凭证列表
  issueIds?: IssueIdInfo[];
  // 页数 从1开始
  pageNum?: number;
  // 每页显示数量
  pageSize?: number;
  // 数据总量
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      batchId: 'batch_id',
      batchIdStatus: 'batch_id_status',
      did: 'did',
      issueIds: 'issue_ids',
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
      batchId: 'string',
      batchIdStatus: 'number',
      did: 'string',
      issueIds: { 'type': 'array', 'itemType': IssueIdInfo },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditUserissueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 被查询方分布式数字身份
  did: string;
  // 集团平台方分布式数字身份
  groupPlatformDid: string;
  // 页数
  pageNum: number;
  // 每页显示的最大条数
  pageSize: number;
  // 业务发起方分布式数字身份
  platformDid: string;
  // 产品id 
  // A模式：PRODUCT_MYBANK， A+模式：PRODUCT_MYBANK_A_PLUS， B模式：PRODUCT_MYBANK_B
  productId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      did: 'did',
      groupPlatformDid: 'group_platform_did',
      pageNum: 'page_num',
      pageSize: 'page_size',
      platformDid: 'platform_did',
      productId: 'product_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      did: 'string',
      groupPlatformDid: 'string',
      pageNum: 'number',
      pageSize: 'number',
      platformDid: 'string',
      productId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditUserissueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 凭证所有者分布式数字身份
  did?: string;
  // 信用流转凭证列表
  issueIds?: UserIssueId[];
  // 页数
  pageNum?: number;
  // 每页显示最大条数
  pageSize?: number;
  // 总数
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      did: 'did',
      issueIds: 'issue_ids',
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
      did: 'string',
      issueIds: { 'type': 'array', 'itemType': UserIssueId },
      pageNum: 'number',
      pageSize: 'number',
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditStatementRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 需查询对象分布式数字身份不能为空
  did: string;
  // 查询截止时间
  endDate: string;
  // 集团平台方分布式数字身份
  groupPlatformDid: string;
  // 页数 从1开始
  pageNum: number;
  // 每页显示数量 最多100
  pageSize: number;
  // 业务发起方分布式数字身份
  platformDid: string;
  // 产品id 
  // A模式：PRODUCT_MYBANK， A+模式：PRODUCT_MYBANK_A_PLUS， B模式：PRODUCT_MYBANK_B
  productId: string;
  // 查询起始时间
  startDate: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      did: 'did',
      endDate: 'end_date',
      groupPlatformDid: 'group_platform_did',
      pageNum: 'page_num',
      pageSize: 'page_size',
      platformDid: 'platform_did',
      productId: 'product_id',
      startDate: 'start_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      did: 'string',
      endDate: 'string',
      groupPlatformDid: 'string',
      pageNum: 'number',
      pageSize: 'number',
      platformDid: 'string',
      productId: 'string',
      startDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditStatementResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 页数 从1开始
  pageNum?: number;
  // 每页显示数量
  pageSize?: number;
  // 流水列表
  statementInfos?: StatementInfo[];
  // 数据总量
  totalCount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageNum: 'page_num',
      pageSize: 'page_size',
      statementInfos: 'statement_infos',
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
      statementInfos: { 'type': 'array', 'itemType': StatementInfo },
      totalCount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCreditIssuetransferRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 转让结果回调url
  callbackUrl: string;
  // 集团平台方分布式数字身份
  groupPlatformDid: string;
  // 信用流转凭证
  issueId: string;
  // 全局业务号，保证唯一性，如拆分转让业务单号
  outBizNo: string;
  // 转入方分布式数字身份
  payeeDid: string;
  // 转出方分布式数字身份
  payerDid: string;
  // 业务发起方分布式数字身份
  platformDid: string;
  // 产品id 目前使用PRODUCT_MYBANK
  productId: string;
  // 转让金额
  txAmt: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      callbackUrl: 'callback_url',
      groupPlatformDid: 'group_platform_did',
      issueId: 'issue_id',
      outBizNo: 'out_biz_no',
      payeeDid: 'payee_did',
      payerDid: 'payer_did',
      platformDid: 'platform_did',
      productId: 'product_id',
      txAmt: 'tx_amt',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      callbackUrl: 'string',
      groupPlatformDid: 'string',
      issueId: 'string',
      outBizNo: 'string',
      payeeDid: 'string',
      payerDid: 'string',
      platformDid: 'string',
      productId: 'string',
      txAmt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCreditIssuetransferResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 转让申请成功金额
  successApplyAmt?: string;
  // 请求时传入的全局业务号
  outBizNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      successApplyAmt: 'success_apply_amt',
      outBizNo: 'out_biz_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      successApplyAmt: 'string',
      outBizNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditIssuetransferRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 集团平台方分布式数字身份
  groupPlatformDid: string;
  // 全局业务号，保证唯一性，如拆分转让业务单号
  outBizNo: string;
  // 业务发起方分布式数字身份
  platformDid: string;
  // 产品id 目前使用PRODUCT_MYBANK
  productId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      groupPlatformDid: 'group_platform_did',
      outBizNo: 'out_biz_no',
      platformDid: 'platform_did',
      productId: 'product_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      groupPlatformDid: 'string',
      outBizNo: 'string',
      platformDid: 'string',
      productId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditIssuetransferResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误信息
  errMsg?: string;
  // 转让失败金额
  failAmt?: string;
  // 信用凭证号
  issueId?: string;
  // 请求时传入的全局业务号
  outBizNo?: string;
  // 转入方分布式数字身份
  payeeDid?: string;
  // 转出方分布式数字身份
  payerDid?: string;
  // 产品id
  productId?: string;
  // 转让结果状态 -1:转让失败状态， 0:转让未完成状态， 1:转让部分成功状态，2:转让成功状态
  status?: number;
  // 转让成功金额
  successAmt?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      errMsg: 'err_msg',
      failAmt: 'fail_amt',
      issueId: 'issue_id',
      outBizNo: 'out_biz_no',
      payeeDid: 'payee_did',
      payerDid: 'payer_did',
      productId: 'product_id',
      status: 'status',
      successAmt: 'success_amt',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      errMsg: 'string',
      failAmt: 'string',
      issueId: 'string',
      outBizNo: 'string',
      payeeDid: 'string',
      payerDid: 'string',
      productId: 'string',
      status: 'number',
      successAmt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCreditIssuefinanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 转让结果回调url
  callbackUrl: string;
  // 集团平台方分布式数字身份
  groupPlatformDid: string;
  // 信用流转凭证
  issueId: string;
  // 融资申请方分布式数字身份
  loanerDid: string;
  // 全局业务号，保证唯一性，如融资业务单号
  outBizNo: string;
  // 业务发起方分布式数字身份
  platformDid: string;
  // 产品id 
  // A模式：PRODUCT_MYBANK， A+模式：PRODUCT_MYBANK_A_PLUS， B模式：PRODUCT_MYBANK_B
  productId: string;
  // 融资金额
  txAmt: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      callbackUrl: 'callback_url',
      groupPlatformDid: 'group_platform_did',
      issueId: 'issue_id',
      loanerDid: 'loaner_did',
      outBizNo: 'out_biz_no',
      platformDid: 'platform_did',
      productId: 'product_id',
      txAmt: 'tx_amt',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      callbackUrl: 'string',
      groupPlatformDid: 'string',
      issueId: 'string',
      loanerDid: 'string',
      outBizNo: 'string',
      platformDid: 'string',
      productId: 'string',
      txAmt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCreditIssuefinanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 融资申请失败，回转至无车承运平台金额
  failApplyAmt?: string;
  // 请求时传入的全局业务号
  outBizNo?: string;
  // 融资申请成功金额
  successApplyAmt?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      failApplyAmt: 'fail_apply_amt',
      outBizNo: 'out_biz_no',
      successApplyAmt: 'success_apply_amt',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      failApplyAmt: 'string',
      outBizNo: 'string',
      successApplyAmt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditIssuefinanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 集团平台方分布式数字身份
  groupPlatformDid: string;
  // 融资申请方分布式数字身份
  loanerDid: string;
  // 全局业务号，保证唯一性，如融资业务单号
  outBizNo: string;
  // 业务发起方分布式数字身份
  platformDid: string;
  // 产品id 
  // A模式：PRODUCT_MYBANK， A+模式：PRODUCT_MYBANK_A_PLUS， B模式：PRODUCT_MYBANK_B
  productId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      groupPlatformDid: 'group_platform_did',
      loanerDid: 'loaner_did',
      outBizNo: 'out_biz_no',
      platformDid: 'platform_did',
      productId: 'product_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      groupPlatformDid: 'string',
      loanerDid: 'string',
      outBizNo: 'string',
      platformDid: 'string',
      productId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditIssuefinanceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 错误信息
  errMsg?: string;
  // 融资失败，回转至无车承运平台失败金额
  failAmt?: string;
  // 融资失败，回转至无车承运平台成功金额
  failTransferAmt?: string;
  // 请求时传入的全局业务号
  outBizNo?: string;
  // 融资结果状态 -1:融资未完成， 0:融资完成， 1:融资全部失败，逆流转回平台全部成功，2:融资部分成功，逆流转回平台全部成功，3:逆流转回平台发生失败，需人工介入 
  status?: number;
  // 融资成功金额
  successAmt?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      errMsg: 'err_msg',
      failAmt: 'fail_amt',
      failTransferAmt: 'fail_transfer_amt',
      outBizNo: 'out_biz_no',
      status: 'status',
      successAmt: 'success_amt',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      errMsg: 'string',
      failAmt: 'string',
      failTransferAmt: 'string',
      outBizNo: 'string',
      status: 'number',
      successAmt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditIssuereceivableRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 集团平台方分布式数字身份
  groupPlatformDid: string;
  // 信用凭证id
  issueId: string;
  // 业务发起方分布式数字身份
  platformDid: string;
  // PRODUCT_MYBANK  、PRODUCT_MYBANK_B
  productId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      groupPlatformDid: 'group_platform_did',
      issueId: 'issue_id',
      platformDid: 'platform_did',
      productId: 'product_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      groupPlatformDid: 'string',
      issueId: 'string',
      platformDid: 'string',
      productId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditIssuereceivableResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 已清分金额
  clearAmt?: string;
  // 代偿金额
  compensateAmt?: string;
  // 错误信息
  errMsg?: string;
  // 完成日期 long类型字符串
  finishDate?: string;
  // 是否代偿,true为代偿，false为不代偿
  hasCompensate?: boolean;
  // 信用凭证id
  issueId?: string;
  // 全局唯一业务号
  outBizNo?: string;
  // 外部订单号，也就是凭证发行时传递的支付订单
  outOrderNo?: string;
  // 产品id--PRODUCT_MYBANK 、PRODUCT_MYBANK_B;
  productId?: string;
  // 清分结果状态--- 0：未清分， 1：清分完成
  status?: number;
  // 凭证总金额
  totalAmt?: string;
  // 清分类型--主动清分 、 到期清分
  type?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      clearAmt: 'clear_amt',
      compensateAmt: 'compensate_amt',
      errMsg: 'err_msg',
      finishDate: 'finish_date',
      hasCompensate: 'has_compensate',
      issueId: 'issue_id',
      outBizNo: 'out_biz_no',
      outOrderNo: 'out_order_no',
      productId: 'product_id',
      status: 'status',
      totalAmt: 'total_amt',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      clearAmt: 'string',
      compensateAmt: 'string',
      errMsg: 'string',
      finishDate: 'string',
      hasCompensate: 'boolean',
      issueId: 'string',
      outBizNo: 'string',
      outOrderNo: 'string',
      productId: 'string',
      status: 'number',
      totalAmt: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditIssueamountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 指定查询者分布式数字身份
  did: string;
  // 集团平台方分布式数字身份
  groupPlatformDid: string;
  // 信用凭证id
  issueId: string;
  // 业务发起方分布式数字身份
  platformDid: string;
  // 产品id 目前填写PRODUCT_MYBANK
  productId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      did: 'did',
      groupPlatformDid: 'group_platform_did',
      issueId: 'issue_id',
      platformDid: 'platform_did',
      productId: 'product_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      did: 'string',
      groupPlatformDid: 'string',
      issueId: 'string',
      platformDid: 'string',
      productId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditIssueamountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 剩余金额
  balanceAmt?: string;
  // 已清分金额
  cashAmt?: string;
  // 欠的滞纳金金额
  debtIntAmt?: string;
  // 欠款本金金额
  debtPrinAmt?: string;
  // 该凭证下的总欠款金额
  debtTotalAmt?: string;
  // 信用凭证到期时间
  expireDate?: string;
  // 冻结的金额
  freezeAmt?: string;
  // 信用凭证id
  issueId?: string;
  // 累计已还滞纳金金额
  paidIntAmt?: string;
  // 凭证总金额
  ticketAmt?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      balanceAmt: 'balance_amt',
      cashAmt: 'cash_amt',
      debtIntAmt: 'debt_int_amt',
      debtPrinAmt: 'debt_prin_amt',
      debtTotalAmt: 'debt_total_amt',
      expireDate: 'expire_date',
      freezeAmt: 'freeze_amt',
      issueId: 'issue_id',
      paidIntAmt: 'paid_int_amt',
      ticketAmt: 'ticket_amt',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      balanceAmt: 'string',
      cashAmt: 'string',
      debtIntAmt: 'string',
      debtPrinAmt: 'string',
      debtTotalAmt: 'string',
      expireDate: 'string',
      freezeAmt: 'string',
      issueId: 'string',
      paidIntAmt: 'string',
      ticketAmt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackCreditCommonRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 回调数据，根据不同msg_method 返回不同结构
  msgData: string;
  // 回调方法类型
  msgMethod: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      msgData: 'msg_data',
      msgMethod: 'msg_method',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      msgData: 'string',
      msgMethod: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackCreditCommonResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否已接收
  received?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      received: 'received',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      received: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyCreditIssueclearRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 申请日期，不输入则是当前时间
  applyDate?: number;
  // 清分金额，当前只支持全额清分，不填就是默认全额清分
  clearAmt?: string;
  // 主动清分方分布式数字身份
  clearDid: string;
  // 扩展字段
  extInfo?: string;
  // 集团平台方分布式数字身份
  groupPlatformDid: string;
  // 凭证id
  issueId: string;
  // 全局唯一业务流水号
  outBizNo: string;
  // 外部订单号，此为支付单号
  outOrderNo: string;
  // 业务发起方分布式数字身份
  platformDid: string;
  // 产品id
  // A模式：PRODUCT_MYBANK， A+模式：PRODUCT_MYBANK_A_PLUS， B模式：PRODUCT_MYBANK_B
  productId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applyDate: 'apply_date',
      clearAmt: 'clear_amt',
      clearDid: 'clear_did',
      extInfo: 'ext_info',
      groupPlatformDid: 'group_platform_did',
      issueId: 'issue_id',
      outBizNo: 'out_biz_no',
      outOrderNo: 'out_order_no',
      platformDid: 'platform_did',
      productId: 'product_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applyDate: 'number',
      clearAmt: 'string',
      clearDid: 'string',
      extInfo: 'string',
      groupPlatformDid: 'string',
      issueId: 'string',
      outBizNo: 'string',
      outOrderNo: 'string',
      platformDid: 'string',
      productId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyCreditIssueclearResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 全局唯一业务流水号
  outBizNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      outBizNo: 'out_biz_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      outBizNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendCreditProxyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 代理请求方法名
  applyMethod: string;
  // 代理请求数据
  applyData: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applyMethod: 'apply_method',
      applyData: 'apply_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applyMethod: 'string',
      applyData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendCreditProxyResponse extends $tea.Model {
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

export class CheckCreditWaybillRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 集团平台方分布式数字身份
  groupPlatformDid: string;
  // 业务发起方分布式数字身
  platformDid: string;
  // 产品id
  // A模式：PRODUCT_MYBANK， A+模式：PRODUCT_MYBANK_A_PLUS， B模式：PRODUCT_MYBANK_B
  productId: string;
  // 运单列表
  waybillList: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      groupPlatformDid: 'group_platform_did',
      platformDid: 'platform_did',
      productId: 'product_id',
      waybillList: 'waybill_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      groupPlatformDid: 'string',
      platformDid: 'string',
      productId: 'string',
      waybillList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckCreditWaybillResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 核验结果列表,  格式为 运单号:核验状态， 核验状态包含  0:运单未知状态   1:通过   2:不通过   3:未核验   4:没有指定信息
  checkResult?: string[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      checkResult: 'check_result',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      checkResult: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReopenCreditDriverRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 产品id
  productId: string;
  // 集团平台did
  groupPlatformDid: string;
  // 司机did
  driverDid: string;
  // 云资金商户id
  accountId: string;
  // 回调地址
  callbackUrl: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productId: 'product_id',
      groupPlatformDid: 'group_platform_did',
      driverDid: 'driver_did',
      accountId: 'account_id',
      callbackUrl: 'callback_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productId: 'string',
      groupPlatformDid: 'string',
      driverDid: 'string',
      accountId: 'string',
      callbackUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReopenCreditDriverResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 申请id
  applyId?: string;
  // 会员注册状态
  status?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      applyId: 'apply_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      applyId: 'string',
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadCreditAuthorizationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 签署货主统一社会信用代码
  consignorCertNo: string;
  // 签署货主did
  consignorDid: string;
  // 签署货主企业名称
  consignorName: string;
  // 授权的货主平台账号
  consignorPlatformAccount: string;
  // 协议到期日
  expireDate: string;
  // 集团平台did
  groupPlatformDid: string;
  // 是否包含账号授权条款
  hasAuthorizationClause: boolean;
  // 签署子公司统一社会信用代码
  platformCertNo: string;
  // 签署子公司did
  platformDid: string;
  // 签署子公司企业名称
  // 
  platformName: string;
  // 线下协议影像件id与文件哈希, 多id以逗号分隔, 最多支持10个
  protocolImgId: string;
  // 协议名称
  protocolName: string;
  // 线下协议编号
  protocolNo: string;
  // 签署时间
  signDate: string;
  // 产品id
  productId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      consignorCertNo: 'consignor_cert_no',
      consignorDid: 'consignor_did',
      consignorName: 'consignor_name',
      consignorPlatformAccount: 'consignor_platform_account',
      expireDate: 'expire_date',
      groupPlatformDid: 'group_platform_did',
      hasAuthorizationClause: 'has_authorization_clause',
      platformCertNo: 'platform_cert_no',
      platformDid: 'platform_did',
      platformName: 'platform_name',
      protocolImgId: 'protocol_img_id',
      protocolName: 'protocol_name',
      protocolNo: 'protocol_no',
      signDate: 'sign_date',
      productId: 'product_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      consignorCertNo: 'string',
      consignorDid: 'string',
      consignorName: 'string',
      consignorPlatformAccount: 'string',
      expireDate: 'string',
      groupPlatformDid: 'string',
      hasAuthorizationClause: 'boolean',
      platformCertNo: 'string',
      platformDid: 'string',
      platformName: 'string',
      protocolImgId: 'string',
      protocolName: 'string',
      protocolNo: 'string',
      signDate: 'string',
      productId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadCreditAuthorizationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 协议链上地址
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

export class UploadCreditConfirmRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 货主云资金商户id
  accountId: string;
  // 确认时间
  confirmDate: string;
  // 应收转让通知编号
  confirmNo: string;
  // 签署货主did
  consignorDid: string;
  // 签署的货主平台账号
  consignorPlatformAccount: string;
  // 协议到期日
  expireDate: string;
  // 集团平台did
  groupPlatformDid: string;
  // 签署子公司did
  platformDid: string;
  // 协议名称
  protocolName: string;
  // 协议PDF文件, 多个文件可用逗号分隔, 最多10个
  protocolPdfId: string;
  // 产品id
  productId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountId: 'account_id',
      confirmDate: 'confirm_date',
      confirmNo: 'confirm_no',
      consignorDid: 'consignor_did',
      consignorPlatformAccount: 'consignor_platform_account',
      expireDate: 'expire_date',
      groupPlatformDid: 'group_platform_did',
      platformDid: 'platform_did',
      protocolName: 'protocol_name',
      protocolPdfId: 'protocol_pdf_id',
      productId: 'product_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountId: 'string',
      confirmDate: 'string',
      confirmNo: 'string',
      consignorDid: 'string',
      consignorPlatformAccount: 'string',
      expireDate: 'string',
      groupPlatformDid: 'string',
      platformDid: 'string',
      protocolName: 'string',
      protocolPdfId: 'string',
      productId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadCreditConfirmResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 协议链上地址
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

export class BatchcreateCreditmodeIssueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 批次id
  batchId: string;
  // 回调地址
  callbackUrl: string;
  // 集团平台分布式数字身份
  groupPlatformDid: string;
  // 发行列表
  issueApplyInfos: IssueApplyInfo[];
  // 业务平台方分布式数字身份
  platformDid: string;
  // 产品id
  productId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      batchId: 'batch_id',
      callbackUrl: 'callback_url',
      groupPlatformDid: 'group_platform_did',
      issueApplyInfos: 'issue_apply_infos',
      platformDid: 'platform_did',
      productId: 'product_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      batchId: 'string',
      callbackUrl: 'string',
      groupPlatformDid: 'string',
      issueApplyInfos: { 'type': 'array', 'itemType': IssueApplyInfo },
      platformDid: 'string',
      productId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateCreditmodeIssueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 批次id
  batchId?: string;
  // 批次状态
  batchStatus?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      batchId: 'batch_id',
      batchStatus: 'batch_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      batchId: 'string',
      batchStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyCreditmodeIssueclearRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 产品id
  productId: string;
  // 集团平台方分布式数字身份
  groupPlatformDid: string;
  // 业务平台方分布式数字身份
  platformDid: string;
  // 主动清分方分布式数字身份
  clearDid: string;
  // 凭证id
  issueId: string;
  // 全局业务号
  outBizNo: string;
  // 支付单号
  outOrderNo: string;
  // 清分金额
  clearAmt?: string;
  // 模式  B:b模式
  modeType: string;
  // 申请日期
  applyDate?: string;
  // 扩展字段
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productId: 'product_id',
      groupPlatformDid: 'group_platform_did',
      platformDid: 'platform_did',
      clearDid: 'clear_did',
      issueId: 'issue_id',
      outBizNo: 'out_biz_no',
      outOrderNo: 'out_order_no',
      clearAmt: 'clear_amt',
      modeType: 'mode_type',
      applyDate: 'apply_date',
      extInfo: 'ext_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productId: 'string',
      groupPlatformDid: 'string',
      platformDid: 'string',
      clearDid: 'string',
      issueId: 'string',
      outBizNo: 'string',
      outOrderNo: 'string',
      clearAmt: 'string',
      modeType: 'string',
      applyDate: 'string',
      extInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyCreditmodeIssueclearResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 全局业务号
  outBizNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      outBizNo: 'out_biz_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      outBizNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadCreditIssuebysaasRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 批次id
  batchId: string;
  // 发行结果回调地址
  callbackUrl: string;
  // 集团平台did
  groupPlatformDid: string;
  // 发行信息
  issueApplyInfos: SaasIssueApplyInfo[];
  // 凭证发行方did
  platformDid: string;
  // 产品id
  productId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      batchId: 'batch_id',
      callbackUrl: 'callback_url',
      groupPlatformDid: 'group_platform_did',
      issueApplyInfos: 'issue_apply_infos',
      platformDid: 'platform_did',
      productId: 'product_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      batchId: 'string',
      callbackUrl: 'string',
      groupPlatformDid: 'string',
      issueApplyInfos: { 'type': 'array', 'itemType': SaasIssueApplyInfo },
      platformDid: 'string',
      productId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadCreditIssuebysaasResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 批次id
  batchId?: string;
  // 批次状态
  batchStatus?: number;
  // 发行url
  issueUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      batchId: 'batch_id',
      batchStatus: 'batch_status',
      issueUrl: 'issue_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      batchId: 'string',
      batchStatus: 'number',
      issueUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelCreditIssuebatchbysaasRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 批次号
  batchId: string;
  // 集团平台did
  groupPlatformDid: string;
  // 凭证发行方did
  platformDid: string;
  // 产品id
  productId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      batchId: 'batch_id',
      groupPlatformDid: 'group_platform_did',
      platformDid: 'platform_did',
      productId: 'product_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      batchId: 'string',
      groupPlatformDid: 'string',
      platformDid: 'string',
      productId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelCreditIssuebatchbysaasResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 批次id
  batchId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      batchId: 'batch_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      batchId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditBalancebysaasRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 产品id
  productId: string;
  // 集团平台did
  groupPlatformDid: string;
  // 查询者did
  platformDid: string;
  // 发行金额
  freight: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productId: 'product_id',
      groupPlatformDid: 'group_platform_did',
      platformDid: 'platform_did',
      freight: 'freight',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productId: 'string',
      groupPlatformDid: 'string',
      platformDid: 'string',
      freight: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditBalancebysaasResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否有信用流转额度
  hasBalance?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      hasBalance: 'has_balance',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      hasBalance: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCreditIssuescpticketRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 申请唯一流水号
  applyId: string;
  // 回调地址
  callbackUrl: string;
  // 集团平台方分布式数字身份
  groupPlatformDid: string;
  // 业务发起方分布式数字身
  platformDid: string;
  // 产品id	
  productId: string;
  // 电子回单查询凭证数据
  scpTicketIssueData: ScpTicketIssueData[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applyId: 'apply_id',
      callbackUrl: 'callback_url',
      groupPlatformDid: 'group_platform_did',
      platformDid: 'platform_did',
      productId: 'product_id',
      scpTicketIssueData: 'scp_ticket_issue_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applyId: 'string',
      callbackUrl: 'string',
      groupPlatformDid: 'string',
      platformDid: 'string',
      productId: 'string',
      scpTicketIssueData: { 'type': 'array', 'itemType': ScpTicketIssueData },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetCreditIssuescpticketResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 申请唯一流水号
  applyId?: string;
  // 集团平台方分布式数字身份
  groupPlatformDid?: string;
  // 业务发起方分布式数字身
  platformDid?: string;
  // 产品id
  productId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      applyId: 'apply_id',
      groupPlatformDid: 'group_platform_did',
      platformDid: 'platform_did',
      productId: 'product_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      applyId: 'string',
      groupPlatformDid: 'string',
      platformDid: 'string',
      productId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditIssuescpticketresultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 申请唯一流水号
  applyId: string;
  // 集团平台方分布式数字身份
  groupPlatformDid: string;
  // 业务发起方分布式数字身
  platformDid: string;
  // 产品id
  productId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applyId: 'apply_id',
      groupPlatformDid: 'group_platform_did',
      platformDid: 'platform_did',
      productId: 'product_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applyId: 'string',
      groupPlatformDid: 'string',
      platformDid: 'string',
      productId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditIssuescpticketresultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 申请唯一流水号
  applyId?: string;
  // 电子回单下载地址,链接有有效期
  fileDownloadUrl?: string;
  // 集团平台方分布式数字身份
  // 
  groupPlatformDid?: string;
  // 业务发起方分布式数字身
  platformDid?: string;
  // 产品id
  // 
  productId?: string;
  // 状态
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      applyId: 'apply_id',
      fileDownloadUrl: 'file_download_url',
      groupPlatformDid: 'group_platform_did',
      platformDid: 'platform_did',
      productId: 'product_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      applyId: 'string',
      fileDownloadUrl: 'string',
      groupPlatformDid: 'string',
      platformDid: 'string',
      productId: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadCreditAplusissueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 批次id
  batchId: string;
  // 发行结果信息回调地址
  callbackUrl: string;
  // 货代did
  consignorDid: string;
  // 发行时直接进行快速提现：true ，
  // 发行后自主触发提现：false （默认）
  easyFinance?: boolean;
  // 集团平台did
  groupPlatformDid: string;
  // 发行信息列表
  issueApplyInfos: IssueApplyInfoPlus[];
  // 业务承接方did
  platformDid: string;
  // 产品id
  productId: string;
  // 登录模式，返回的发行url指定使用何种模式登录。ORG:企业支付宝登录（缺省时默认ORG模式），USER_ACCOUNT:个人支付宝登录。
  loginType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      batchId: 'batch_id',
      callbackUrl: 'callback_url',
      consignorDid: 'consignor_did',
      easyFinance: 'easy_finance',
      groupPlatformDid: 'group_platform_did',
      issueApplyInfos: 'issue_apply_infos',
      platformDid: 'platform_did',
      productId: 'product_id',
      loginType: 'login_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      batchId: 'string',
      callbackUrl: 'string',
      consignorDid: 'string',
      easyFinance: 'boolean',
      groupPlatformDid: 'string',
      issueApplyInfos: { 'type': 'array', 'itemType': IssueApplyInfoPlus },
      platformDid: 'string',
      productId: 'string',
      loginType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadCreditAplusissueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 批次id
  batchId?: string;
  // 批次状态 -1:失效， 0:初始化完成，1:进行中，2:部分成功，3:成功
  batchIdStatus?: number;
  // 凭证发行跳转url
  issueUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      batchId: 'batch_id',
      batchIdStatus: 'batch_id_status',
      issueUrl: 'issue_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      batchId: 'string',
      batchIdStatus: 'number',
      issueUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditCreditamountRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 集团平台did
  groupPlatformDid: string;
  // 平台did
  platformDid: string;
  // 产品ID
  productId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      groupPlatformDid: 'group_platform_did',
      platformDid: 'platform_did',
      productId: 'product_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      groupPlatformDid: 'string',
      platformDid: 'string',
      productId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditCreditamountResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 可用额度
  creditAmount?: string;
  // 集团平台did
  groupPlatformDid?: string;
  // 平台did
  platformDid?: string;
  // 产品ID
  productId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      creditAmount: 'credit_amount',
      groupPlatformDid: 'group_platform_did',
      platformDid: 'platform_did',
      productId: 'product_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      creditAmount: 'string',
      groupPlatformDid: 'string',
      platformDid: 'string',
      productId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCreditCommonsignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 账户号，account_type=ACCOUNT_BANK_NO时填写外部银行卡号， account_type=ACCOUNT_CLOUD_FUND时填写云资金商户ID
  accountId: string;
  // 账户类型，ACCOUNT_BANK_NO:外部银行卡，ACCOUNT_CLOUD_FUND:云资金商户ID
  accountType: string;
  // 开户行联行号，当帐户类型为ACCOUNT_BANK_NO时必填
  bankCnaps?: string;
  // 开户行名称，当帐户类型为ACCOUNT_BANK_NO时必填
  bankName?: string;
  // 签约结果回调地址
  callbackUrl: string;
  // 驾驶证号码，当帐户类型为ACCOUNT_BANK_NO且签约方sign_did类型为个人时必填
  drivingLicense?: string;
  // 驾驶证影像件ID，当帐户类型为ACCOUNT_BANK_NO且签约方sign_did类型为个人时必填
  drivingLicenseFileId?: string;
  // 集团平台did
  groupPlatformDid: string;
  // 法定代表人名称，签约方sign_did类型为企业时必填
  legalName?: string;
  // 产品id
  productId: string;
  // 签约方did
  signDid: string;
  // 行驶证号码，当帐户类型为ACCOUNT_BANK_NO且签约方sign_did类型为个人时必填
  vehicleLicense?: string;
  // 行驶证影像件ID，当帐户类型为ACCOUNT_BANK_NO且签约方sign_did类型为个人时必填
  vehicleLicenseFileId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountId: 'account_id',
      accountType: 'account_type',
      bankCnaps: 'bank_cnaps',
      bankName: 'bank_name',
      callbackUrl: 'callback_url',
      drivingLicense: 'driving_license',
      drivingLicenseFileId: 'driving_license_file_id',
      groupPlatformDid: 'group_platform_did',
      legalName: 'legal_name',
      productId: 'product_id',
      signDid: 'sign_did',
      vehicleLicense: 'vehicle_license',
      vehicleLicenseFileId: 'vehicle_license_file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountId: 'string',
      accountType: 'string',
      bankCnaps: 'string',
      bankName: 'string',
      callbackUrl: 'string',
      drivingLicense: 'string',
      drivingLicenseFileId: 'string',
      groupPlatformDid: 'string',
      legalName: 'string',
      productId: 'string',
      signDid: 'string',
      vehicleLicense: 'string',
      vehicleLicenseFileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCreditCommonsignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 申请id
  applyId?: string;
  // 签约状态，-1:签约失败，0:未签约，1:已签约，2:签约中
  status?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      applyId: 'apply_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      applyId: 'string',
      status: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditCommonsignRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 产品id
  productId: string;
  // 集团平台did
  groupPlatformDid: string;
  // 签约方did
  signDid: string;
  // 申请id，不填则查询当前签约状态，填写则查询apply_id对应的签约申请结果
  applyId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productId: 'product_id',
      groupPlatformDid: 'group_platform_did',
      signDid: 'sign_did',
      applyId: 'apply_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productId: 'string',
      groupPlatformDid: 'string',
      signDid: 'string',
      applyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCreditCommonsignResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 签约结果，-1:签约失败，0:未签约，1:已签约，2:签约中
  status?: number;
  // 查询信息
  queryMsg?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      queryMsg: 'query_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'number',
      queryMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateCreditIssueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 产品id
  productId: string;
  // 集团平台did
  groupPlatformDid: string;
  // 凭证发行方分布式身份
  createDid: string;
  // 凭证接收方分布式身份
  receiveDid: string;
  // 批次id
  batchId: string;
  // 全局业务唯一号
  outBizNo: string;
  // 支付订单号
  payOrder: string;
  // 支付单运费总额，运费最多精确到小数点后2位
  freight: string;
  // 发行后自动贴现，true: 自动贴现，false: 不自动贴现 （默认）
  easyFinance?: boolean;
  // 凭证到期时间
  expireDate: string;
  // 发行结果回调地址
  callbackUrl: string;
  // 需合并发行的运单id列表
  waybillIds: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productId: 'product_id',
      groupPlatformDid: 'group_platform_did',
      createDid: 'create_did',
      receiveDid: 'receive_did',
      batchId: 'batch_id',
      outBizNo: 'out_biz_no',
      payOrder: 'pay_order',
      freight: 'freight',
      easyFinance: 'easy_finance',
      expireDate: 'expire_date',
      callbackUrl: 'callback_url',
      waybillIds: 'waybill_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productId: 'string',
      groupPlatformDid: 'string',
      createDid: 'string',
      receiveDid: 'string',
      batchId: 'string',
      outBizNo: 'string',
      payOrder: 'string',
      freight: 'string',
      easyFinance: 'boolean',
      expireDate: 'string',
      callbackUrl: 'string',
      waybillIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateCreditIssueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 批次id
  batchId?: string;
  // 批次状态
  batchStatus?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      batchId: 'batch_id',
      batchStatus: 'batch_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      batchId: 'string',
      batchStatus: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadCreditIssuebatchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 批次id
  batchId: string;
  // 回调地址
  callbackUrl: string;
  // 凭证发行方did
  createDid: string;
  // 发行后自动贴现，true: 自动贴现，false: 不自动贴现 （默认）
  easyFinance?: boolean;
  // 凭证到期时间
  expireDate: string;
  // 支付单运费总额，运费最多精确到小数点后2位
  freight: string;
  // 集团平台did
  groupPlatformDid: string;
  // 全局业务唯一编号
  outBizNo: string;
  // 支付订单号
  payOrder: string;
  // 产品id
  productId: string;
  // 凭证接收方did
  receiveDid: string;
  // 运单合并列表
  waybillIds: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      batchId: 'batch_id',
      callbackUrl: 'callback_url',
      createDid: 'create_did',
      easyFinance: 'easy_finance',
      expireDate: 'expire_date',
      freight: 'freight',
      groupPlatformDid: 'group_platform_did',
      outBizNo: 'out_biz_no',
      payOrder: 'pay_order',
      productId: 'product_id',
      receiveDid: 'receive_did',
      waybillIds: 'waybill_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      batchId: 'string',
      callbackUrl: 'string',
      createDid: 'string',
      easyFinance: 'boolean',
      expireDate: 'string',
      freight: 'string',
      groupPlatformDid: 'string',
      outBizNo: 'string',
      payOrder: 'string',
      productId: 'string',
      receiveDid: 'string',
      waybillIds: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadCreditIssuebatchResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 批次id
  batchId?: string;
  // 批次状态
  batchStatus?: number;
  // 发行链接
  issueUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      batchId: 'batch_id',
      batchStatus: 'batch_status',
      issueUrl: 'issue_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      batchId: 'string',
      batchStatus: 'number',
      issueUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetIssueTransferfileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 申请唯一流水号
  applyId: string;
  // 回调地址
  // 
  callbackUrl: string;
  // 集团平台方分布式数字身份
  groupPlatformDid: string;
  // 信用流转凭证集合，最大长度支持30
  issueTransferDatas: IssueTransferData[];
  // 业务发起方分布式数字身份
  platformDid: string;
  // 产品id
  // 
  productId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applyId: 'apply_id',
      callbackUrl: 'callback_url',
      groupPlatformDid: 'group_platform_did',
      issueTransferDatas: 'issue_transfer_datas',
      platformDid: 'platform_did',
      productId: 'product_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applyId: 'string',
      callbackUrl: 'string',
      groupPlatformDid: 'string',
      issueTransferDatas: { 'type': 'array', 'itemType': IssueTransferData },
      platformDid: 'string',
      productId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetIssueTransferfileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 申请唯一流水号
  applyId?: string;
  // 集团平台方分布式数字身份
  groupPlatformDid?: string;
  // 业务发起方分布式数字身
  platformDid?: string;
  // 产品id
  productId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      applyId: 'apply_id',
      groupPlatformDid: 'group_platform_did',
      platformDid: 'platform_did',
      productId: 'product_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      applyId: 'string',
      groupPlatformDid: 'string',
      platformDid: 'string',
      productId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsurancepolicyZhonghuacaixianRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 被保险人地址
  bbrAddr?: string;
  // 被保险人证件号码
  bbrIdNo: string;
  // 被保险人证件类型。按照如下值填写
  // 464001	身份证
  // 464002	护照
  // 464003	其他
  // 464004	组织机构代码
  // 464005	军人证
  // 464006	工商注册号码
  // 464007	统一社会信用代码
  // 464008	临时身份证
  // 464009	外国护照
  // 464010	中国人民武装警察身份证件
  // 464011	军官证
  // 464012	企业营业执照号码
  // 464013	统一社会信用代码（五证合一号码）
  // 464014	个体工商户营业执照号码
  // 464015	户口本
  // 464016	其他类境内个人身份有效证件
  // 464017	其他类境外个人身份有效证件
  // 464018	税务登记证
  // 464019	金融许可证号码
  // 464020	国家主管部门颁外国驻华机构批文号码
  // 464021	其他类境外机构代码
  bbrIdType: string;
  // 被保险人姓名
  bbrName: string;
  // 被保险人联系电话
  bbrTel: string;
  // 运费,四舍五入精确到小数点两位。系统将根据运费和费率计算含税保费，计算的保费结果为四舍五入，精确到两位小数
  carriage: string;
  // 货物名称
  carGo: string;
  // 厂牌型号
  cpModel: string;
  // 目的地
  destination?: string;
  // 行驶证车主
  drivPer: string;
  // 保险起期，精确到天；最短起保时间为次日0点，最长延时起保时间为次日0点后24h
  effDate: string;
  // 发动机编号
  engineNo: string;
  // 车架号
  frameNo: string;
  // 运单所属集团分布式身份标识
  groupPlatformDid: string;
  // 投保人证件类型有效止期
  identifyPeriodEnd?: string;
  // 投保人证件类型有效起期
  identifyPeriodStart?: string;
  // 车牌号码
  licenseNo: string;
  // 运单所属平台分布式身份标识
  platformDid: string;
  // 运营证号
  runNo: string;
  // 起运地
  startPlace?: string;
  // 投保人地址
  tbrAddr?: string;
  // 投保人邮箱
  tbrEmail?: string;
  // 投保人证件号
  tbrIdNo: string;
  // 投保人证件类型，按照如下状态进行填写 
  // 464001	身份证
  // 464002	护照
  // 464003	其他
  // 464004	组织机构代码
  // 464005	军人证
  // 464006	工商注册号码
  // 464007	统一社会信用代码
  // 464008	临时身份证
  // 464009	外国护照
  // 464010	中国人民武装警察身份证件
  // 464011	军官证
  // 464012	企业营业执照号码
  // 464013	统一社会信用代码（五证合一号码）
  // 464014	个体工商户营业执照号码
  // 464015	户口本
  // 464016	其他类境内个人身份有效证件
  // 464017	其他类境外个人身份有效证件
  // 464018	税务登记证
  // 464019	金融许可证号码
  // 464020	国家主管部门颁外国驻华机构批文号码
  // 464021	其他类境外机构代码
  tbrIdType: string;
  // 投保人姓名
  tbrName: string;
  // 投保人联系电话
  tbrTel: string;
  // 保险止期，保期时间间隔为1-30天。
  termDate: string;
  // 吨位
  tonNage: string;
  // 交易流水号,全局唯一；格式为 yyyyMMdd+身份标识+其他编码。系统会根据该流水号做防重、幂等判断逻辑。当极端场景中，系统会返回处理中状态，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果
  tradeNo: string;
  // 运输货物
  tsCarGo: string;
  // 运单id。通过运单创建接口上传运单时指定的运单标识。系统会根据该标识查询运单相关信息做投保业务校验
  waybillId: string;
  // 重量
  weight?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bbrAddr: 'bbr_addr',
      bbrIdNo: 'bbr_id_no',
      bbrIdType: 'bbr_id_type',
      bbrName: 'bbr_name',
      bbrTel: 'bbr_tel',
      carriage: 'carriage',
      carGo: 'car_go',
      cpModel: 'cp_model',
      destination: 'destination',
      drivPer: 'driv_per',
      effDate: 'eff_date',
      engineNo: 'engine_no',
      frameNo: 'frame_no',
      groupPlatformDid: 'group_platform_did',
      identifyPeriodEnd: 'identify_period_end',
      identifyPeriodStart: 'identify_period_start',
      licenseNo: 'license_no',
      platformDid: 'platform_did',
      runNo: 'run_no',
      startPlace: 'start_place',
      tbrAddr: 'tbr_addr',
      tbrEmail: 'tbr_email',
      tbrIdNo: 'tbr_id_no',
      tbrIdType: 'tbr_id_type',
      tbrName: 'tbr_name',
      tbrTel: 'tbr_tel',
      termDate: 'term_date',
      tonNage: 'ton_nage',
      tradeNo: 'trade_no',
      tsCarGo: 'ts_car_go',
      waybillId: 'waybill_id',
      weight: 'weight',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bbrAddr: 'string',
      bbrIdNo: 'string',
      bbrIdType: 'string',
      bbrName: 'string',
      bbrTel: 'string',
      carriage: 'string',
      carGo: 'string',
      cpModel: 'string',
      destination: 'string',
      drivPer: 'string',
      effDate: 'string',
      engineNo: 'string',
      frameNo: 'string',
      groupPlatformDid: 'string',
      identifyPeriodEnd: 'string',
      identifyPeriodStart: 'string',
      licenseNo: 'string',
      platformDid: 'string',
      runNo: 'string',
      startPlace: 'string',
      tbrAddr: 'string',
      tbrEmail: 'string',
      tbrIdNo: 'string',
      tbrIdType: 'string',
      tbrName: 'string',
      tbrTel: 'string',
      termDate: 'string',
      tonNage: 'string',
      tradeNo: 'string',
      tsCarGo: 'string',
      waybillId: 'string',
      weight: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsurancepolicyZhonghuacaixianResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 保单号
  polNo?: string;
  // 电子保单下载地址
  polUrl?: string;
  // 含税保费
  preMium?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      polNo: 'pol_no',
      polUrl: 'pol_url',
      preMium: 'pre_mium',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      polNo: 'string',
      polUrl: 'string',
      preMium: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelInsurancepolicyZhonghuacaixianRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 保单号，投保成功后返回的
  polNo: string;
  // 含税保费，精确到小数点后两位
  preMium: string;
  // 全局唯一交易流水号
  tradeNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      polNo: 'pol_no',
      preMium: 'pre_mium',
      tradeNo: 'trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      polNo: 'string',
      preMium: 'string',
      tradeNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelInsurancepolicyZhonghuacaixianResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 退保成功的对应的保单号
  polNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      polNo: 'pol_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      polNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushInsurancenotifyClaimRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 通知类型：
  // claims_pay:理赔支付信息
  // claims_info: 理赔信息
  category: string;
  // 通知内容
  content: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      category: 'category',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      category: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushInsurancenotifyClaimResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 业务返回报文
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

export class ApplyInsuranceFileurlRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 上传的文件名，要求文件名后缀必须以 _yyyyMMdd结尾
  fileName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileName: 'file_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsuranceFileurlResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用于上传文件的连接
  fileUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      fileUrl: 'file_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      fileUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsurancepolicyUniversalRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 投保人开户银行，当打印发票选择为“1”时，必填
  accountBankName?: string;
  // 投保人银行账户，当打印发票选择为“1”时，必填
  bankAccountInformation?: string;
  // 被保人地址
  bbrAddr?: string;
  // 被保人did（被保人所在链上分布式数字身份）
  bbrDid?: string;
  // 被保人证件号
  bbrIdNo: string;
  // 被保人证件类型，01-居民身份证, 02-驾驶执照, 03-营业执照, 99-其他	
  // 
  bbrIdType: string;
  // 被保人姓名
  bbrName: string;
  // 被保人电话号
  bbrTel: string;
  // 被保人类型, 1-个人 2-团队
  bbrType: string;
  // 货物名称
  cargoName?: string;
  // 货物数量
  cargoQuantity: string;
  // 货物数量单位
  cargoQuantityUnit: string;
  // 货物吨位
  cargoTonnage?: string;
  // 货物类型，普货，手机/电子产品/家用电器，精密仪器，家具，易碎品，大宗散货，生鲜（瓜果蔬菜），棉纱
  cargoType: string;
  // 货物体积
  cargoVolume?: string;
  // 货值
  cargoWorth: string;
  // 车长
  carLength?: string;
  // 车型
  carModel?: string;
  // 目的地，格式为"省-市-区"
  destination: string;
  // 司机姓名
  driverName: string;
  // 司机联系方式
  driverTel: string;
  // 保险起始时间, 时间格式 "yyyy-MM-dd HH:mm:ss", 预计起运日期
  effDate: string;
  // 保司, 01-华泰, 02-平安, 03-亚太
  externalChannelCode: string;
  // 险种, 01-承运人平台责任险
  // 
  externalProductCode: string;
  // 车架号
  frameNo?: string;
  // 投保额，整数以元为单位
  // 
  insuredAmount: string;
  // 车牌号
  licenseNo: string;
  // 车牌颜色，01-黄牌，02-蓝牌
  licensePlateColor?: string;
  // 税务登记证/纳税人识别号，当打印发票选择为“1”时，必填
  nsrIdentifier?: string;
  // 接单时间, 时间格式 "yyyy-MM-dd HH:mm:ss"
  orderTime: string;
  // 包装方式, 01-箱装、02-袋装、03-包装、04-桶装、05-捆扎包装、06-裸装、07-散装、08-其他包装
  packing?: string;
  // 是否打印发票，默认0-不开票  1-专票 2-电子发票
  printInvoice: string;
  // 费率，按实际业务商讨费率执行, 但最终结果以保司计算结果为准，0到1之间，最多6位小数
  rate: string;
  // 起运地，格式为"省-市-区"
  startPlace: string;
  // 投保人地址，当打印发票选择为“1”时，必填
  tbrAddr?: string;
  // 投保人-企业联系人联系方式
  tbrCorporateContract?: string;
  // 投保人did（投保人所在链上分布式数字身份）
  tbrDid?: string;
  // 投保人邮箱，用以接受电子发票的邮箱地址
  tbrEmail?: string;
  // 投保人证件号
  tbrIdNo: string;
  // 投保人证件类型，01-居民身份证, 02-驾驶执照, 03-营业执照, 99-其他
  tbrIdType: string;
  // 投保人名称
  tbrName: string;
  // 投保人电话号
  tbrTel: string;
  // 投保人类型, 1-个人 2-团队
  tbrType: string;
  // 保险截止时间, 时间格式 "yyyy-MM-dd HH:mm:ss", 预计到达日期，保险止期间隔为1-30天
  termDate: string;
  // 专票邮寄地址
  ticketAddr?: string;
  // 订单号, 年月日+唯一字符ID
  tradeNo: string;
  // 中转地，格式为"省-市-区"
  transitPoint?: string;
  // 运单id（平台方运单id）
  waybillId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountBankName: 'account_bank_name',
      bankAccountInformation: 'bank_account_information',
      bbrAddr: 'bbr_addr',
      bbrDid: 'bbr_did',
      bbrIdNo: 'bbr_id_no',
      bbrIdType: 'bbr_id_type',
      bbrName: 'bbr_name',
      bbrTel: 'bbr_tel',
      bbrType: 'bbr_type',
      cargoName: 'cargo_name',
      cargoQuantity: 'cargo_quantity',
      cargoQuantityUnit: 'cargo_quantity_unit',
      cargoTonnage: 'cargo_tonnage',
      cargoType: 'cargo_type',
      cargoVolume: 'cargo_volume',
      cargoWorth: 'cargo_worth',
      carLength: 'car_length',
      carModel: 'car_model',
      destination: 'destination',
      driverName: 'driver_name',
      driverTel: 'driver_tel',
      effDate: 'eff_date',
      externalChannelCode: 'external_channel_code',
      externalProductCode: 'external_product_code',
      frameNo: 'frame_no',
      insuredAmount: 'insured_amount',
      licenseNo: 'license_no',
      licensePlateColor: 'license_plate_color',
      nsrIdentifier: 'nsr_identifier',
      orderTime: 'order_time',
      packing: 'packing',
      printInvoice: 'print_invoice',
      rate: 'rate',
      startPlace: 'start_place',
      tbrAddr: 'tbr_addr',
      tbrCorporateContract: 'tbr_corporate_contract',
      tbrDid: 'tbr_did',
      tbrEmail: 'tbr_email',
      tbrIdNo: 'tbr_id_no',
      tbrIdType: 'tbr_id_type',
      tbrName: 'tbr_name',
      tbrTel: 'tbr_tel',
      tbrType: 'tbr_type',
      termDate: 'term_date',
      ticketAddr: 'ticket_addr',
      tradeNo: 'trade_no',
      transitPoint: 'transit_point',
      waybillId: 'waybill_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountBankName: 'string',
      bankAccountInformation: 'string',
      bbrAddr: 'string',
      bbrDid: 'string',
      bbrIdNo: 'string',
      bbrIdType: 'string',
      bbrName: 'string',
      bbrTel: 'string',
      bbrType: 'string',
      cargoName: 'string',
      cargoQuantity: 'string',
      cargoQuantityUnit: 'string',
      cargoTonnage: 'string',
      cargoType: 'string',
      cargoVolume: 'string',
      cargoWorth: 'string',
      carLength: 'string',
      carModel: 'string',
      destination: 'string',
      driverName: 'string',
      driverTel: 'string',
      effDate: 'string',
      externalChannelCode: 'string',
      externalProductCode: 'string',
      frameNo: 'string',
      insuredAmount: 'string',
      licenseNo: 'string',
      licensePlateColor: 'string',
      nsrIdentifier: 'string',
      orderTime: 'string',
      packing: 'string',
      printInvoice: 'string',
      rate: 'string',
      startPlace: 'string',
      tbrAddr: 'string',
      tbrCorporateContract: 'string',
      tbrDid: 'string',
      tbrEmail: 'string',
      tbrIdNo: 'string',
      tbrIdType: 'string',
      tbrName: 'string',
      tbrTel: 'string',
      tbrType: 'string',
      termDate: 'string',
      ticketAddr: 'string',
      tradeNo: 'string',
      transitPoint: 'string',
      waybillId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsurancepolicyUniversalResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 保单号
  polNo?: string;
  // 电子保单下载地址
  polUrl?: string;
  // 总保费
  totalPremium?: string;
  // 订单号
  tradeNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      polNo: 'pol_no',
      polUrl: 'pol_url',
      totalPremium: 'total_premium',
      tradeNo: 'trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      polNo: 'string',
      polUrl: 'string',
      totalPremium: 'string',
      tradeNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelInsurancepolicyUniversalRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 投保订单号
  applyTradeNo: string;
  // 保司, 01-华泰, 03-亚太
  externalChannelCode: string;
  // 险种, 01-承运人平台责任险
  // 
  externalProductCode: string;
  // 保单号
  polNo: string;
  // 退保全局唯一流水号
  tradeNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applyTradeNo: 'apply_trade_no',
      externalChannelCode: 'external_channel_code',
      externalProductCode: 'external_product_code',
      polNo: 'pol_no',
      tradeNo: 'trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applyTradeNo: 'string',
      externalChannelCode: 'string',
      externalProductCode: 'string',
      polNo: 'string',
      tradeNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelInsurancepolicyUniversalResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 投保订单号
  applyTradeNo?: string;
  // 保单号
  polNo?: string;
  // 退还保费
  sendBackPremium?: string;
  // 成功退保时间, 时间格式 "yyyy-MM-dd HH:mm:ss"
  successSurrenderTime?: string;
  // 退保生效时间, 时间格式 "yyyy-MM-dd HH:mm:ss"
  surrenderEffectiveTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      applyTradeNo: 'apply_trade_no',
      polNo: 'pol_no',
      sendBackPremium: 'send_back_premium',
      successSurrenderTime: 'success_surrender_time',
      surrenderEffectiveTime: 'surrender_effective_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      applyTradeNo: 'string',
      polNo: 'string',
      sendBackPremium: 'string',
      successSurrenderTime: 'string',
      surrenderEffectiveTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushInsuranceOlpRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 被保人证件号
  bbrIdNo: string;
  // 被保人名称
  bbrName: string;
  // 被保人类型, 1-个人 2-企业	
  // 
  bbrType: string;
  // 保险公司编码
  channelCode: string;
  // 保险公司名称
  channelName: string;
  // 理赔单状态，ALREADY_RISK: 已出险，NOT_RISK: 未出险，CLAIMED: 已理赔
  claimStatus: string;
  // 投保时间	
  insureDate: string;
  // 保险止期
  insureEnd?: string;
  // 保险起期
  insureStart?: string;
  // 存证平台编码
  platformConsumerCode: string;
  // 存证平台名称
  platformConsumerName: string;
  // 保单文件id，可支持多个，逗号隔开
  polFileIds?: string;
  // 保单号
  polNo: string;
  // 保单状态，INSURED: 已投保，SURRENDERED: 已退保,	
  polStatus: string;
  // 电子保单url地址
  polUrl?: string;
  // 保费
  premium: string;
  // 险种代码
  productCode: string;
  // 险种名称
  productName: string;
  // 退保时间
  surrenderTime?: string;
  // 投保人证件号
  tbrIdNo: string;
  // 投保人名称
  tbrName: string;
  // 投保人类型, 1-个人 2-企业
  tbrType: string;
  // 交易流水号
  tradeNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bbrIdNo: 'bbr_id_no',
      bbrName: 'bbr_name',
      bbrType: 'bbr_type',
      channelCode: 'channel_code',
      channelName: 'channel_name',
      claimStatus: 'claim_status',
      insureDate: 'insure_date',
      insureEnd: 'insure_end',
      insureStart: 'insure_start',
      platformConsumerCode: 'platform_consumer_code',
      platformConsumerName: 'platform_consumer_name',
      polFileIds: 'pol_file_ids',
      polNo: 'pol_no',
      polStatus: 'pol_status',
      polUrl: 'pol_url',
      premium: 'premium',
      productCode: 'product_code',
      productName: 'product_name',
      surrenderTime: 'surrender_time',
      tbrIdNo: 'tbr_id_no',
      tbrName: 'tbr_name',
      tbrType: 'tbr_type',
      tradeNo: 'trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bbrIdNo: 'string',
      bbrName: 'string',
      bbrType: 'string',
      channelCode: 'string',
      channelName: 'string',
      claimStatus: 'string',
      insureDate: 'string',
      insureEnd: 'string',
      insureStart: 'string',
      platformConsumerCode: 'string',
      platformConsumerName: 'string',
      polFileIds: 'string',
      polNo: 'string',
      polStatus: 'string',
      polUrl: 'string',
      premium: 'string',
      productCode: 'string',
      productName: 'string',
      surrenderTime: 'string',
      tbrIdNo: 'string',
      tbrName: 'string',
      tbrType: 'string',
      tradeNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushInsuranceOlpResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回状态
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

export class UpdateInsuranceOlpRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 被保人证件号
  bbrIdNo?: string;
  // 被保人名称
  bbrName?: string;
  // 被保人类型, 1-个人 2-企业
  bbrType?: string;
  // 保险公司编码
  channelCode?: string;
  // 保险公司名称
  channelName?: string;
  // 理赔单状态，ALREADY_RISK: 已出险，NOT_RISK: 未出险，CLAIMED: 已理赔
  claimStatus?: string;
  // 投保时间
  insureDate?: string;
  // 保险止期
  insureEnd?: string;
  // 保险起期
  insureStart?: string;
  // 存证平台编码
  platformConsumerCode: string;
  // 存证平台名称
  platformConsumerName?: string;
  // 保单文件id，可支持多个，逗号隔开
  polFileIds?: string;
  // 保单号
  polNo: string;
  // 保单状态，INSURED: 已投保，SURRENDERED: 已退保,
  polStatus?: string;
  // 电子保单url地址	
  polUrl?: string;
  // 保费
  // 
  premium?: string;
  // 险种代码
  // 
  productCode?: string;
  // 险种名称
  // 
  productName?: string;
  // 退保时间
  surrenderTime?: string;
  // 投保人证件号
  tbrIdNo?: string;
  // 投保人名称
  tbrName?: string;
  // 投保人类型, 1-个人 2-企业
  tbrType?: string;
  // 交易流水号
  tradeNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bbrIdNo: 'bbr_id_no',
      bbrName: 'bbr_name',
      bbrType: 'bbr_type',
      channelCode: 'channel_code',
      channelName: 'channel_name',
      claimStatus: 'claim_status',
      insureDate: 'insure_date',
      insureEnd: 'insure_end',
      insureStart: 'insure_start',
      platformConsumerCode: 'platform_consumer_code',
      platformConsumerName: 'platform_consumer_name',
      polFileIds: 'pol_file_ids',
      polNo: 'pol_no',
      polStatus: 'pol_status',
      polUrl: 'pol_url',
      premium: 'premium',
      productCode: 'product_code',
      productName: 'product_name',
      surrenderTime: 'surrender_time',
      tbrIdNo: 'tbr_id_no',
      tbrName: 'tbr_name',
      tbrType: 'tbr_type',
      tradeNo: 'trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bbrIdNo: 'string',
      bbrName: 'string',
      bbrType: 'string',
      channelCode: 'string',
      channelName: 'string',
      claimStatus: 'string',
      insureDate: 'string',
      insureEnd: 'string',
      insureStart: 'string',
      platformConsumerCode: 'string',
      platformConsumerName: 'string',
      polFileIds: 'string',
      polNo: 'string',
      polStatus: 'string',
      polUrl: 'string',
      premium: 'string',
      productCode: 'string',
      productName: 'string',
      surrenderTime: 'string',
      tbrIdNo: 'string',
      tbrName: 'string',
      tbrType: 'string',
      tradeNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateInsuranceOlpResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回状态
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

export class PushInsuranceReppolicyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 直保人租户ID
  platformCode: string;
  // 直保人
  directInsurerName: string;
  // 保单号
  polNo: string;
  // 共保标志，1:是 0:否
  jointInsuranceLogo?: string;
  // 共保比例（%）
  jointInsuranceRate?: string;
  // 险种代码
  productCode: string;
  // 险种名称
  productName: string;
  // 被保险人
  bbrName: string;
  // 保险起期
  insureStart: string;
  // 保险止期
  insureEnd: string;
  // 币种，CNY:人民币, USD:美元，JPY:日元，HKD:港元，EUR:欧元，GBP英镑
  currency: string;
  // 保费
  premium: string;
  // 保额
  insuranceAmount?: string;
  // 固定保额分出比例（%）
  fixedInsuranceAmountSplitRate?: string;
  // 固定保费分出比例（%）
  fixedPremiumSplitRate: string;
  // 临分保额分出比例（%）
  facultativeInsuranceAmountSplitRate?: string;
  // 临分保费分出比例（%）
  facultativePremiumSplitRate: string;
  // 分出保费
  splitPremium: string;
  // 再保人
  reinsurer: string;
  // 摊回手续费比例（%）
  amortizeFeeRate: string;
  // 摊回手续费
  amortizeFee: string;
  // 再保合同名称
  reinsuranceContractName?: string;
  // 是否有超赔临分，1:是 0:否
  overPayFacultative?: string;
  // 项目名称
  projectName?: string;
  // 接收方租户id
  receiverPlatformId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      platformCode: 'platform_code',
      directInsurerName: 'direct_insurer_name',
      polNo: 'pol_no',
      jointInsuranceLogo: 'joint_insurance_logo',
      jointInsuranceRate: 'joint_insurance_rate',
      productCode: 'product_code',
      productName: 'product_name',
      bbrName: 'bbr_name',
      insureStart: 'insure_start',
      insureEnd: 'insure_end',
      currency: 'currency',
      premium: 'premium',
      insuranceAmount: 'insurance_amount',
      fixedInsuranceAmountSplitRate: 'fixed_insurance_amount_split_rate',
      fixedPremiumSplitRate: 'fixed_premium_split_rate',
      facultativeInsuranceAmountSplitRate: 'facultative_insurance_amount_split_rate',
      facultativePremiumSplitRate: 'facultative_premium_split_rate',
      splitPremium: 'split_premium',
      reinsurer: 'reinsurer',
      amortizeFeeRate: 'amortize_fee_rate',
      amortizeFee: 'amortize_fee',
      reinsuranceContractName: 'reinsurance_contract_name',
      overPayFacultative: 'over_pay_facultative',
      projectName: 'project_name',
      receiverPlatformId: 'receiver_platform_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      platformCode: 'string',
      directInsurerName: 'string',
      polNo: 'string',
      jointInsuranceLogo: 'string',
      jointInsuranceRate: 'string',
      productCode: 'string',
      productName: 'string',
      bbrName: 'string',
      insureStart: 'string',
      insureEnd: 'string',
      currency: 'string',
      premium: 'string',
      insuranceAmount: 'string',
      fixedInsuranceAmountSplitRate: 'string',
      fixedPremiumSplitRate: 'string',
      facultativeInsuranceAmountSplitRate: 'string',
      facultativePremiumSplitRate: 'string',
      splitPremium: 'string',
      reinsurer: 'string',
      amortizeFeeRate: 'string',
      amortizeFee: 'string',
      reinsuranceContractName: 'string',
      overPayFacultative: 'string',
      projectName: 'string',
      receiverPlatformId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushInsuranceReppolicyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回状态
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

export class PushInsuranceRepcorrectRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 直保人租户ID
  platformCode: string;
  // 直保人
  directInsurerName: string;
  // 批单类型 1:批增 2: 批减
  approvalType: string;
  // 批单号
  approvalNo: string;
  // 保单号
  polNo: string;
  // 共保标志，1:是 0:否
  // 
  jointInsuranceLogo?: string;
  // 共保比例（%）
  jointInsuranceRate?: string;
  // 险种代码
  productCode: string;
  // 险种名称
  // 
  productName: string;
  // 被保险人
  bbrName: string;
  // 保险起期
  insureStart: string;
  // 保险止期
  // 
  insureEnd: string;
  // 币种，CNY:人民币, USD:美元，JPY:日元，HKD:港元，EUR:欧元，GBP英镑
  currency: string;
  // 保额
  insuranceAmount?: string;
  // 批改保费
  correctPremium: string;
  // 固定保额分出比例（%）
  fixedInsuranceAmountSplitRate?: string;
  // 固定保费分出比例（%）
  fixedPremiumSplitRate: string;
  // 临分保额分出比例（%）
  facultativeInsuranceAmountSplitRate?: string;
  // 临分保费分出比例（%）
  facultativePremiumSplitRate: string;
  // 分出保费
  splitPremium: string;
  // 再保人
  // 
  reinsurer: string;
  // 摊回手续费比例（%）
  amortizeFeeRate: string;
  // 摊回手续费
  // 
  amortizeFee: string;
  // 再保合同名称
  reinsuranceContractName?: string;
  // 是否有超赔临分，1:是 0:否
  overPayFacultative?: string;
  // 批改原因
  // 
  correctReason?: string;
  // 项目名称
  projectName?: string;
  // 接收方租户id
  // 
  receiverPlatformId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      platformCode: 'platform_code',
      directInsurerName: 'direct_insurer_name',
      approvalType: 'approval_type',
      approvalNo: 'approval_no',
      polNo: 'pol_no',
      jointInsuranceLogo: 'joint_insurance_logo',
      jointInsuranceRate: 'joint_insurance_rate',
      productCode: 'product_code',
      productName: 'product_name',
      bbrName: 'bbr_name',
      insureStart: 'insure_start',
      insureEnd: 'insure_end',
      currency: 'currency',
      insuranceAmount: 'insurance_amount',
      correctPremium: 'correct_premium',
      fixedInsuranceAmountSplitRate: 'fixed_insurance_amount_split_rate',
      fixedPremiumSplitRate: 'fixed_premium_split_rate',
      facultativeInsuranceAmountSplitRate: 'facultative_insurance_amount_split_rate',
      facultativePremiumSplitRate: 'facultative_premium_split_rate',
      splitPremium: 'split_premium',
      reinsurer: 'reinsurer',
      amortizeFeeRate: 'amortize_fee_rate',
      amortizeFee: 'amortize_fee',
      reinsuranceContractName: 'reinsurance_contract_name',
      overPayFacultative: 'over_pay_facultative',
      correctReason: 'correct_reason',
      projectName: 'project_name',
      receiverPlatformId: 'receiver_platform_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      platformCode: 'string',
      directInsurerName: 'string',
      approvalType: 'string',
      approvalNo: 'string',
      polNo: 'string',
      jointInsuranceLogo: 'string',
      jointInsuranceRate: 'string',
      productCode: 'string',
      productName: 'string',
      bbrName: 'string',
      insureStart: 'string',
      insureEnd: 'string',
      currency: 'string',
      insuranceAmount: 'string',
      correctPremium: 'string',
      fixedInsuranceAmountSplitRate: 'string',
      fixedPremiumSplitRate: 'string',
      facultativeInsuranceAmountSplitRate: 'string',
      facultativePremiumSplitRate: 'string',
      splitPremium: 'string',
      reinsurer: 'string',
      amortizeFeeRate: 'string',
      amortizeFee: 'string',
      reinsuranceContractName: 'string',
      overPayFacultative: 'string',
      correctReason: 'string',
      projectName: 'string',
      receiverPlatformId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushInsuranceRepcorrectResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 返回状态
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

export class ApplyInsuranceCbrfRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 物流公司业务线的简称
  businessId?: string;
  // 保司编码
  insuranceCode: string;
  // 险种编码
  productCode: string;
  // 起保时间
  insuranceStart: string;
  // 交付航司确认时间
  deliveryTime: string;
  // 客户订单编号
  relatedOderNo: string;
  // 目的国，2位iso缩写
  destCountry: string;
  // 商家唯一脱敏的编码
  businessMerchantId?: string;
  // 货物的揽收时间
  collectionTime?: string;
  // 货物名称
  goodName?: string;
  // 货值(美金)，货物的美金商品价值
  goodValue?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      businessId: 'business_id',
      insuranceCode: 'insurance_code',
      productCode: 'product_code',
      insuranceStart: 'insurance_start',
      deliveryTime: 'delivery_time',
      relatedOderNo: 'related_oder_no',
      destCountry: 'dest_country',
      businessMerchantId: 'business_merchant_id',
      collectionTime: 'collection_time',
      goodName: 'good_name',
      goodValue: 'good_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      businessId: 'string',
      insuranceCode: 'string',
      productCode: 'string',
      insuranceStart: 'string',
      deliveryTime: 'string',
      relatedOderNo: 'string',
      destCountry: 'string',
      businessMerchantId: 'string',
      collectionTime: 'string',
      goodName: 'string',
      goodValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsuranceCbrfResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 投保响应编码
  insuredReceiptNo?: string;
  // 投保时的标的订单号
  relatedOrderNo?: string;
  // 保司出具的保单编号
  policyNo?: string;
  // 返回时间
  responseTime?: string;
  // 幂等标识；true:幂等结果；false: 非幂等结果
  idemFlag?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      insuredReceiptNo: 'insured_receipt_no',
      relatedOrderNo: 'related_order_no',
      policyNo: 'policy_no',
      responseTime: 'response_time',
      idemFlag: 'idem_flag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      insuredReceiptNo: 'string',
      relatedOrderNo: 'string',
      policyNo: 'string',
      responseTime: 'string',
      idemFlag: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RepayInsuranceCbrfRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 物流公司业务线的简称
  businessId?: string;
  // 保司编码
  insuranceCode: string;
  //  险种
  productCode: string;
  // 客户的订单编号
  relatedOrderNo: string;
  // 保单号
  policyNo: string;
  // 投保响应编码
  insuredReceiptNo: string;
  // 2位ISO国家编码
  destCountry: string;
  // 理赔时间
  claimTime: string;
  // 理赔金额，单位为元，依据实际情况计算的理赔金额，最多小数点后2位
  claimAmount: string;
  // 达到国内仓库时间
  dwaTime?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      businessId: 'business_id',
      insuranceCode: 'insurance_code',
      productCode: 'product_code',
      relatedOrderNo: 'related_order_no',
      policyNo: 'policy_no',
      insuredReceiptNo: 'insured_receipt_no',
      destCountry: 'dest_country',
      claimTime: 'claim_time',
      claimAmount: 'claim_amount',
      dwaTime: 'dwa_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      businessId: 'string',
      insuranceCode: 'string',
      productCode: 'string',
      relatedOrderNo: 'string',
      policyNo: 'string',
      insuredReceiptNo: 'string',
      destCountry: 'string',
      claimTime: 'string',
      claimAmount: 'string',
      dwaTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RepayInsuranceCbrfResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 赔案号
  claimNo?: string;
  // 客户投保时的标的订单号
  relatedOrderNo?: string;
  // 保单号
  policyNo?: string;
  // 幂等标识。true：幂等结果;false：非幂等结果
  idemFlag?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      claimNo: 'claim_no',
      relatedOrderNo: 'related_order_no',
      policyNo: 'policy_no',
      idemFlag: 'idem_flag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      claimNo: 'string',
      relatedOrderNo: 'string',
      policyNo: 'string',
      idemFlag: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsuranceCbecRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 调用方生成的唯一编码，格式为 yyyyMMdd_身份标识_其他编码，系统会根据该流水号做防重、幂等判断逻辑。
  // yyyyMMdd请传递当前时间。 
  // 身份标识可自定义。
  // 其他编码建议为随机值。
  // 当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；	
  tradeNo: string;
  // 保司编码，CPIC---太保
  externalChannelCode: string;
  // 险种编码，03--跨境出口货运险
  externalProductCode: string;
  // 投保人名称
  tbrName: string;
  // 投保人证件类型，03--营业执照
  tbrIdType?: string;
  // 投保人证件号码
  tbrIdNo?: string;
  // 被保人名称
  bbrName: string;
  // 被保人证件类型，01--居民身份证，03--营业执照
  bbrIdType?: string;
  // 被保人证件号码
  bbrIdNo?: string;
  // 出库单号/航次号/运单号
  relatedOrderNo: string;
  // 包装及数量
  cargoQuantity: string;
  // 货物名称
  cargoName: string;
  // 包装代码,参考保司提供样例-包装代码
  packingCode: string;
  // 货物类型代码,参考保司提供样例-货物类型代码
  cargoTypeCode: string;
  // 航行区域代码,参考保司提供样例-航行区域代码
  flightAreaCode: string;
  // 运输方式代码,参考保司提供样例-运输方式
  transportTypeCode: string;
  // 运输工具名称
  transportMeansName: string;
  // 航次号
  voyage?: string;
  // 出发地
  startPlace: string;
  // 中转地
  transitPoint?: string;
  // 目的地
  destination: string;
  // 理赔代理地代码，参考保司提供样例-理赔代理地
  claimAgentCode: string;
  // 主险条款代码--参考保司提供样例
  mainItemCode: string;
  // 主险条款内容--参考保司提供样例
  mainItemContent: string;
  // 附加条款集合
  mainItemAdds?: MainItemAdd[];
  // 特别约定--填写协议中的特别约定
  specialize?: string;
  // 申报货物价值,，最多兼容2位小数，单位（元）
  cargoWorth: string;
  // 费率，最多兼容9位小数
  rate: string;
  // 保费，最多兼容2位小数，单位（元）
  premium: string;
  // 保险起期，日期格式yyyy-mm-dd
  insureStart: string;
  // 起运日期，日期格式yyyy-mm-dd
  saleDate: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tradeNo: 'trade_no',
      externalChannelCode: 'external_channel_code',
      externalProductCode: 'external_product_code',
      tbrName: 'tbr_name',
      tbrIdType: 'tbr_id_type',
      tbrIdNo: 'tbr_id_no',
      bbrName: 'bbr_name',
      bbrIdType: 'bbr_id_type',
      bbrIdNo: 'bbr_id_no',
      relatedOrderNo: 'related_order_no',
      cargoQuantity: 'cargo_quantity',
      cargoName: 'cargo_name',
      packingCode: 'packing_code',
      cargoTypeCode: 'cargo_type_code',
      flightAreaCode: 'flight_area_code',
      transportTypeCode: 'transport_type_code',
      transportMeansName: 'transport_means_name',
      voyage: 'voyage',
      startPlace: 'start_place',
      transitPoint: 'transit_point',
      destination: 'destination',
      claimAgentCode: 'claim_agent_code',
      mainItemCode: 'main_item_code',
      mainItemContent: 'main_item_content',
      mainItemAdds: 'main_item_adds',
      specialize: 'specialize',
      cargoWorth: 'cargo_worth',
      rate: 'rate',
      premium: 'premium',
      insureStart: 'insure_start',
      saleDate: 'sale_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tradeNo: 'string',
      externalChannelCode: 'string',
      externalProductCode: 'string',
      tbrName: 'string',
      tbrIdType: 'string',
      tbrIdNo: 'string',
      bbrName: 'string',
      bbrIdType: 'string',
      bbrIdNo: 'string',
      relatedOrderNo: 'string',
      cargoQuantity: 'string',
      cargoName: 'string',
      packingCode: 'string',
      cargoTypeCode: 'string',
      flightAreaCode: 'string',
      transportTypeCode: 'string',
      transportMeansName: 'string',
      voyage: 'string',
      startPlace: 'string',
      transitPoint: 'string',
      destination: 'string',
      claimAgentCode: 'string',
      mainItemCode: 'string',
      mainItemContent: 'string',
      mainItemAdds: { 'type': 'array', 'itemType': MainItemAdd },
      specialize: 'string',
      cargoWorth: 'string',
      rate: 'string',
      premium: 'string',
      insureStart: 'string',
      saleDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsuranceCbecResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 投保交易号
  tradeNo?: string;
  // 保单号，保司生成的投保业务号
  policyNo?: string;
  // 保费
  premium?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tradeNo: 'trade_no',
      policyNo: 'policy_no',
      premium: 'premium',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tradeNo: 'string',
      policyNo: 'string',
      premium: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsuranceStockinRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 入库交易流水号，保持唯一；
  // 格式为 yyyyMMdd_身份标识_其他编码。
  // 系统会根据该流水号做防重、幂等判断逻辑。
  // 当极端场景中（接口超时），客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
  tradeNo: string;
  // 入库单号，可参考格式：年月日+唯一字符
  stockinNo: string;
  // 入库时间，格式：yyyy-MM-dd HH:mm:ss
  stockinDate: string;
  // 时区	
  timezone: string;
  // 仓库代码
  repositoryCode: string;
  // 客户代码
  customerCode: string;
  // 保单号,国内起运时投保产生的保单号
  policyNo?: string;
  // 入库货物列表
  stockinCargos: StockinCargo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tradeNo: 'trade_no',
      stockinNo: 'stockin_no',
      stockinDate: 'stockin_date',
      timezone: 'timezone',
      repositoryCode: 'repository_code',
      customerCode: 'customer_code',
      policyNo: 'policy_no',
      stockinCargos: 'stockin_cargos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tradeNo: 'string',
      stockinNo: 'string',
      stockinDate: 'string',
      timezone: 'string',
      repositoryCode: 'string',
      customerCode: 'string',
      policyNo: 'string',
      stockinCargos: { 'type': 'array', 'itemType': StockinCargo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsuranceStockinResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 入库交易流水号
  tradeNo?: string;
  // 入库单号
  // 
  // 
  stockinNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tradeNo: 'trade_no',
      stockinNo: 'stockin_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tradeNo: 'string',
      stockinNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsuranceInventoryRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 库存申报交易号，调用方生成的唯一编码；
  // 格式为 yyyyMMdd_身份标识_其他编码，yyyyMMdd请传递当前时间。
  // 系统会根据该流水号做防重、幂等判断逻辑。
  // 当极端场景中（接口超时），客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
  tradeNo: string;
  // 库存申报编号
  inventoryNo: string;
  // 库存查询时间，yyyy-mm-dd，精确到（天）
  inventoryQueryDate: string;
  // 仓库代码
  // 
  // 
  repositoryCode: string;
  // 库存货物列表
  inventoryCargos: InventoryCargo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tradeNo: 'trade_no',
      inventoryNo: 'inventory_no',
      inventoryQueryDate: 'inventory_query_date',
      repositoryCode: 'repository_code',
      inventoryCargos: 'inventory_cargos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tradeNo: 'string',
      inventoryNo: 'string',
      inventoryQueryDate: 'string',
      repositoryCode: 'string',
      inventoryCargos: { 'type': 'array', 'itemType': InventoryCargo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsuranceInventoryResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 库存申报编号
  inventoryNo?: string;
  // 库存申报交易流水号
  tradeNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      inventoryNo: 'inventory_no',
      tradeNo: 'trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      inventoryNo: 'string',
      tradeNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsuranceOspiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 调用方生成的唯一编码，格式为 yyyyMMdd_身份标识_其他编码，系统会根据该流水号做防重、幂等判断逻辑。
  // yyyyMMdd请传递当前时间。 
  // 身份标识可自定义。
  // 其他编码建议为随机值。
  // 当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；	
  tradeNo: string;
  // 保司编码.，PAIC---平安，CICP-中华财险
  externalChannelCode: string;
  // 险种编码，04--海外邮包险
  // 
  externalProductCode: string;
  // 投保人姓名，保险协议中的投保人全称
  tbrName: string;
  // 投保人证件类型，03--营业执照
  tbrIdType: string;
  // 投保人证件号码
  tbrIdNo: string;
  // 被保人姓名，实际的保险被保人名称
  bbrName: string;
  // 被保人证件类型，01--居民身份证、03--营业执照
  bbrIdType: string;
  // 被保人证件号码
  bbrIdNo: string;
  // 受益人名称，实际的保险受益人名称
  beneficiaryName: string;
  // 受益人证件类型，01--居民身份证、03--营业执照
  beneficiaryIdType: string;
  // 受益人证件号码
  beneficiaryNo: string;
  // 保险起期，日期格式yyyy-MM-dd HH:mm:ss
  insureStart: string;
  // 保险金额，单位（元），最多支持2位小数，超过2位拒绝；
  insuredAmount: string;
  // 方案名，海外邮包险--OWFP
  schemeName: string;
  // 项目名称,海外邮包险：OWFP-对应国别，例OWFP-RU
  projectName: string;
  // 订单号,物流平台用以区分业务的唯一码
  relaOrderNo: string;
  // 寄件时间，日期格式yyyy-MM-dd HH:mm:ss
  pickUpTime: string;
  // 快递公司名称，实际的派送公司全称
  courierCompany: string;
  // 快递单号，实际的派送快递单号
  courierNumber: string;
  // 货物类型，货物类型的大类
  cargoType: string;
  // 货物名称，实际的货物名称
  cargoName: string;
  // 货物数量
  cargoQuantity: string;
  // 买家ID，买家的脱敏唯一标识
  buyId: string;
  // 卖家ID，卖家的脱敏唯一标识
  sellId: string;
  // 站点/仓储ID，站点/仓储的脱敏唯一标识
  siteId: string;
  // 出发地地址，包裹的实际发件地地址
  startPlace: string;
  // 目的地地址，包裹的实际收件地地址
  destination: string;
  // ISO到达国别，包裹业务实际发生的国家
  isoCountry: string;
  // 货物申报价值，单位（元），最多支持2位小数，超过2位拒绝
  cargoWorth: string;
  // 收货人名称
  consigneeName?: string;
  // 询价code
  quoteMark?: string;
  // 标的列表
  cargoInfo?: CargoInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tradeNo: 'trade_no',
      externalChannelCode: 'external_channel_code',
      externalProductCode: 'external_product_code',
      tbrName: 'tbr_name',
      tbrIdType: 'tbr_id_type',
      tbrIdNo: 'tbr_id_no',
      bbrName: 'bbr_name',
      bbrIdType: 'bbr_id_type',
      bbrIdNo: 'bbr_id_no',
      beneficiaryName: 'beneficiary_name',
      beneficiaryIdType: 'beneficiary_id_type',
      beneficiaryNo: 'beneficiary_no',
      insureStart: 'insure_start',
      insuredAmount: 'insured_amount',
      schemeName: 'scheme_name',
      projectName: 'project_name',
      relaOrderNo: 'rela_order_no',
      pickUpTime: 'pick_up_time',
      courierCompany: 'courier_company',
      courierNumber: 'courier_number',
      cargoType: 'cargo_type',
      cargoName: 'cargo_name',
      cargoQuantity: 'cargo_quantity',
      buyId: 'buy_id',
      sellId: 'sell_id',
      siteId: 'site_id',
      startPlace: 'start_place',
      destination: 'destination',
      isoCountry: 'iso_country',
      cargoWorth: 'cargo_worth',
      consigneeName: 'consignee_name',
      quoteMark: 'quote_mark',
      cargoInfo: 'cargo_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tradeNo: 'string',
      externalChannelCode: 'string',
      externalProductCode: 'string',
      tbrName: 'string',
      tbrIdType: 'string',
      tbrIdNo: 'string',
      bbrName: 'string',
      bbrIdType: 'string',
      bbrIdNo: 'string',
      beneficiaryName: 'string',
      beneficiaryIdType: 'string',
      beneficiaryNo: 'string',
      insureStart: 'string',
      insuredAmount: 'string',
      schemeName: 'string',
      projectName: 'string',
      relaOrderNo: 'string',
      pickUpTime: 'string',
      courierCompany: 'string',
      courierNumber: 'string',
      cargoType: 'string',
      cargoName: 'string',
      cargoQuantity: 'string',
      buyId: 'string',
      sellId: 'string',
      siteId: 'string',
      startPlace: 'string',
      destination: 'string',
      isoCountry: 'string',
      cargoWorth: 'string',
      consigneeName: 'string',
      quoteMark: 'string',
      cargoInfo: { 'type': 'array', 'itemType': CargoInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsuranceOspiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 投保唯一码
  tradeNo?: string;
  // 保单号
  policyNo?: string;
  // 保费
  premium?: string;
  // 保额
  insuredAmount?: string;
  // 保险起期
  insureStart?: string;
  // 保险止期
  insureEnd?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tradeNo: 'trade_no',
      policyNo: 'policy_no',
      premium: 'premium',
      insuredAmount: 'insured_amount',
      insureStart: 'insure_start',
      insureEnd: 'insure_end',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tradeNo: 'string',
      policyNo: 'string',
      premium: 'string',
      insuredAmount: 'string',
      insureStart: 'string',
      insureEnd: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsuranceOspireportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 调用方生成的唯一编码，格式为 yyyyMMdd_身份标识_其他编码，系统会根据该流水号做防重、幂等判断逻辑。
  // yyyyMMdd请传递当前时间。 
  // 身份标识可自定义。
  // 其他编码建议为随机值。
  // 当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；	
  tradeNo: string;
  // 保司编码，PAIC---平安，CICP-中华财险，CPIC--太保，PICC_SHENZHEN--人保深圳
  externalChannelCode: string;
  // 险种编码
  // 04--海外邮包险
  // 06--跨境邮包险
  // 07--平台责任险
  externalProductCode: string;
  // 保单号，申请理赔的保单号
  policyNo: string;
  // 订单号，申请理赔所关联的订单号
  relaOrderNo: string;
  // 出险时间，发生损失的时间，yyyy-MM-dd HH:mm:ss
  accidentTime: string;
  // 报案人名称，申请报案人的名称
  reporterName: string;
  // 报案人联系方式，申请报案人的联系方式
  reporterContact: string;
  // 索赔金额，单位（元），最多支持2位小数，超2位小数拒绝
  claimAmount: string;
  // 物流揽收时间，yyyy-MM-dd HH:mm:ss。平台责任险可不填
  collectDate?: string;
  // 工单号，平台客服判责的工单号。
  jobNo: string;
  // 快递公司名称，实际的派送公司全称。平台责任险可不填
  courierCompany?: string;
  // 快递单号，实际的派送快递单号。平台责任险可不填
  courierNumber?: string;
  // 买家ID，买家的脱敏唯一标识
  buyId: string;
  // 卖家ID，卖家的脱敏唯一标识 
  sellId: string;
  // 站点/仓储ID，站点/仓储的脱敏唯一标识
  siteId?: string;
  // 货物名称，实际的货物名称
  cargoName: string;
  // 货物的重量，单位(kg)，最多支持6位小数。平台责任险可不填
  cargoWeight?: string;
  // 出发地地址，货物的出发地地址
  startPlace: string;
  // 目的地地址，货物的目的地地址
  destination: string;
  // ISO到达国别，包裹业务实际发生的国家
  isoCountry: string;
  // 出险地址，货物发生实际损失的最近的一次地址记录。平台责任险选填
  accidentAddress?: string;
  // 平台赔款支付时间，平台先行赔付的时间，yyyy-MM-dd HH:mm:ss
  paymentTime: string;
  // 赔付项目类型，01-运费，02-货值，03-货值2
  paymentItem: string;
  // 出险类型，赔付的出险类型，届时保司和平台方商定
  accidentType: string;
  // 索赔资料附件，最多10个。平台责任险可不填
  claimInformations?: ClaimInformation[];
  // 客户或物流CP商，针对此票货物的出发仓ID
  despatchWarehouseId?: string;
  // 平台赔款支付信息。平台责任险需填
  reparationsInfo?: ReparationsInfo;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tradeNo: 'trade_no',
      externalChannelCode: 'external_channel_code',
      externalProductCode: 'external_product_code',
      policyNo: 'policy_no',
      relaOrderNo: 'rela_order_no',
      accidentTime: 'accident_time',
      reporterName: 'reporter_name',
      reporterContact: 'reporter_contact',
      claimAmount: 'claim_amount',
      collectDate: 'collect_date',
      jobNo: 'job_no',
      courierCompany: 'courier_company',
      courierNumber: 'courier_number',
      buyId: 'buy_id',
      sellId: 'sell_id',
      siteId: 'site_id',
      cargoName: 'cargo_name',
      cargoWeight: 'cargo_weight',
      startPlace: 'start_place',
      destination: 'destination',
      isoCountry: 'iso_country',
      accidentAddress: 'accident_address',
      paymentTime: 'payment_time',
      paymentItem: 'payment_item',
      accidentType: 'accident_type',
      claimInformations: 'claim_informations',
      despatchWarehouseId: 'despatch_warehouse_id',
      reparationsInfo: 'reparations_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tradeNo: 'string',
      externalChannelCode: 'string',
      externalProductCode: 'string',
      policyNo: 'string',
      relaOrderNo: 'string',
      accidentTime: 'string',
      reporterName: 'string',
      reporterContact: 'string',
      claimAmount: 'string',
      collectDate: 'string',
      jobNo: 'string',
      courierCompany: 'string',
      courierNumber: 'string',
      buyId: 'string',
      sellId: 'string',
      siteId: 'string',
      cargoName: 'string',
      cargoWeight: 'string',
      startPlace: 'string',
      destination: 'string',
      isoCountry: 'string',
      accidentAddress: 'string',
      paymentTime: 'string',
      paymentItem: 'string',
      accidentType: 'string',
      claimInformations: { 'type': 'array', 'itemType': ClaimInformation },
      despatchWarehouseId: 'string',
      reparationsInfo: ReparationsInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsuranceOspireportResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 报案唯一码
  tradeNo?: string;
  // 报案号
  reportNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tradeNo: 'trade_no',
      reportNo: 'report_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tradeNo: 'string',
      reportNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyInsuranceOspireportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 案件同步唯一码，调用方生成的唯一编码； 格式为 yyyyMMdd_身份标识_其他编码，yyyyMMdd请传递当前时间。
  // 系统会根据该流水号做防重、幂等判断逻辑。
  tradeNo: string;
  // 报案号，关联的报案案件号
  reportNo: string;
  // 订单号
  relaOrderNo: string;
  // 理赔金额(元)，实际的理赔金额，最多支持2位小数，超2位小数拒绝请求
  claimAmount: string;
  // 支付时间，实际的保司打款时间，格式：yyyy-MM-dd HH:mm:ss
  paymentTime: string;
  // 银行流水，打款的银行流水号
  bankSerialNum: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tradeNo: 'trade_no',
      reportNo: 'report_no',
      relaOrderNo: 'rela_order_no',
      claimAmount: 'claim_amount',
      paymentTime: 'payment_time',
      bankSerialNum: 'bank_serial_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tradeNo: 'string',
      reportNo: 'string',
      relaOrderNo: 'string',
      claimAmount: 'string',
      paymentTime: 'string',
      bankSerialNum: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyInsuranceOspireportResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 案件同步唯一码
  tradeNo?: string;
  // 案件通知状态--SUCCESS、FAIL
  reportNotifyStatus?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tradeNo: 'trade_no',
      reportNotifyStatus: 'report_notify_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tradeNo: 'string',
      reportNotifyStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsuranceYzbRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 调用方生成的唯一编码，格式为 yyyyMMdd_身份标识_其他编码，系统会根据该流水号做防重、幂等判断逻辑。
  // yyyyMMdd请传递当前时间。 
  // 身份标识可自定义。
  // 其他编码建议为随机值。
  // 当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；	
  tradeNo: string;
  // 保司编码，PAIC---平安、CPIC---太保
  externalChannelCode: string;
  // 险种编码，05-驿站宝
  externalProductCode: string;
  // 投保人姓名，保险协议中的投保人全称
  tbrName: string;
  // 投保人证件类型，01-居民身份证,03--统一社会信用代码
  tbrIdType: string;
  // 投保人证件号码
  tbrIdNo: string;
  // 被保人姓名，实际的保险被保人名称
  bbrName: string;
  // 被保人证件类型，01--居民身份证、03--统一社会信用代码
  bbrIdType: string;
  // 被保人证件号码
  bbrIdNo: string;
  // 被保人联系方式
  bbrContact: string;
  // 受益人名称，实际的保险受益人名称
  beneficiaryName: string;
  // 受益人证件类型，01--居民身份证、03--统一社会信用代码
  beneficiaryIdType: string;
  // 受益人证件号码
  beneficiaryNo: string;
  // 保险起期，格式：yyyy-MM-dd HH:mm:ss
  insureStart: string;
  // 套餐编码，
  // 平安（PK00053022、PK00053025、PK00053026、PK00125463、PK00125467）
  // 太保（xjbdbnd01、pssmyd02、xnfayd03、xnfayd04、xnfayd05）
  productPackageType: string;
  // 站点ID，站点的唯一标识
  siteId: string;
  // 站点名称
  siteName: string;
  // 总资产，单位（元），最多2位小数，超过拒绝请求
  totalAssets: string;
  // 雇员人数，站点的雇佣人员数
  employeeNum: string;
  // 省编码，站点位于的省份编码
  provinceCode: string;
  // 市编码，站点位于的市区编码
  cityCode: string;
  // 区编码,站点位于的区县编码
  districtCode: string;
  // 完整地址，站点的详细地址
  wholeAddress: string;
  // 方案名称，菜鸟驿站宝、菜鸟校园驿站宝、溪鸟公共服务站保障，上门人员综合险-30万保额，上门人员综合险-50万保额
  schemeName: string;
  // 意健险被保人姓名
  acplBbrName: string;
  // 意健险被保人身份证号
  acplBbrIdNo: string;
  // 产品市场编码，平安---保司端险种编码、太保--与套餐编码保持一致
  pdtMktCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tradeNo: 'trade_no',
      externalChannelCode: 'external_channel_code',
      externalProductCode: 'external_product_code',
      tbrName: 'tbr_name',
      tbrIdType: 'tbr_id_type',
      tbrIdNo: 'tbr_id_no',
      bbrName: 'bbr_name',
      bbrIdType: 'bbr_id_type',
      bbrIdNo: 'bbr_id_no',
      bbrContact: 'bbr_contact',
      beneficiaryName: 'beneficiary_name',
      beneficiaryIdType: 'beneficiary_id_type',
      beneficiaryNo: 'beneficiary_no',
      insureStart: 'insure_start',
      productPackageType: 'product_package_type',
      siteId: 'site_id',
      siteName: 'site_name',
      totalAssets: 'total_assets',
      employeeNum: 'employee_num',
      provinceCode: 'province_code',
      cityCode: 'city_code',
      districtCode: 'district_code',
      wholeAddress: 'whole_address',
      schemeName: 'scheme_name',
      acplBbrName: 'acpl_bbr_name',
      acplBbrIdNo: 'acpl_bbr_id_no',
      pdtMktCode: 'pdt_mkt_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tradeNo: 'string',
      externalChannelCode: 'string',
      externalProductCode: 'string',
      tbrName: 'string',
      tbrIdType: 'string',
      tbrIdNo: 'string',
      bbrName: 'string',
      bbrIdType: 'string',
      bbrIdNo: 'string',
      bbrContact: 'string',
      beneficiaryName: 'string',
      beneficiaryIdType: 'string',
      beneficiaryNo: 'string',
      insureStart: 'string',
      productPackageType: 'string',
      siteId: 'string',
      siteName: 'string',
      totalAssets: 'string',
      employeeNum: 'string',
      provinceCode: 'string',
      cityCode: 'string',
      districtCode: 'string',
      wholeAddress: 'string',
      schemeName: 'string',
      acplBbrName: 'string',
      acplBbrIdNo: 'string',
      pdtMktCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsuranceYzbResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 投保唯一码
  tradeNo?: string;
  // 保单号
  policyNo?: string;
  // 电子保单链接
  policyUrl?: string;
  // 保费
  premium?: string;
  // 保额
  insuredAmount?: string;
  // 保险起期
  insureStart?: string;
  // 保险止期
  insureEnd?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tradeNo: 'trade_no',
      policyNo: 'policy_no',
      policyUrl: 'policy_url',
      premium: 'premium',
      insuredAmount: 'insured_amount',
      insureStart: 'insure_start',
      insureEnd: 'insure_end',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tradeNo: 'string',
      policyNo: 'string',
      policyUrl: 'string',
      premium: 'string',
      insuredAmount: 'string',
      insureStart: 'string',
      insureEnd: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsuranceCbpiRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 调用方生成的唯一编码，格式为 yyyyMMdd_身份标识_其他编码，系统会根据该流水号做防重、幂等判断逻辑。
  // yyyyMMdd请传递当前时间。 
  // 身份标识可自定义。
  // 其他编码建议为随机值。
  // 当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；	
  tradeNo: string;
  // 保司编码.，PAIC---平安，PICC-人保，CPIC--太保，PICC_SHENZHEN--人保深圳
  externalChannelCode: string;
  // 险种编码，06--跨境邮包险，07--平台责任险
  externalProductCode: string;
  // 保险协议中的投保人全称
  tbrName: string;
  // 投保人证件类型，03--营业执照
  // 
  tbrIdType: string;
  // 投保人证件号码
  tbrIdNo: string;
  // 被保人姓名，实际的保险被保人名称
  bbrName: string;
  // 被保人证件类型，01--居民身份证、03--营业执照
  bbrIdType: string;
  // 被保人证件号码
  // 
  bbrIdNo: string;
  // 受益人名称，实际的保险受益人名称
  // 
  beneficiaryName: string;
  // 受益人证件类型，01--居民身份证、03--营业执照
  beneficiaryIdType: string;
  // 受益人证件号码
  beneficiaryNo: string;
  // 保险起期，日期格式yyyy-MM-dd HH:mm:ss
  // 
  insureStart: string;
  // 保险金额，单位（元），最多支持2位小数，超过2位拒绝；
  // 
  insuredAmount: string;
  // 方案名，XBDP—跨境邮包险
  schemeName: string;
  // 项目名称，命名规范“方案种类+物流业务种类+国别”
  projectName: string;
  // 订单号,物流平台用以区分业务的唯一码
  relatedOrderNo: string;
  // 寄件时间，日期格式yyyy-MM-dd HH:mm:ss
  pickUpTime: string;
  // 快递公司名称，实际的派送公司全称
  courierCompany: string;
  // 快递单号，实际的派送快递单号
  // 
  courierNumber: string;
  // 货物类型,货物类型的大类
  cargoType: string;
  // 货物名称,实际的货物名称
  cargoName: string;
  // 货物数量
  cargoQuantity: string;
  // 买家ID,买家的脱敏唯一标识
  buyId: string;
  // 卖家ID,卖家的脱敏唯一标识
  sellId: string;
  // 出发地地址,包裹的实际发件地地址
  startPlace: string;
  // 目的地地址,包裹的实际收件地地址
  destination: string;
  // ISO到达国别,包裹业务实际发生的国家
  isoCountry: string;
  // 货物申报价值，单位（元），最多支持2位小数，超过2位拒绝
  cargoWorth: string;
  // 收货人名称
  consigneeName?: string;
  // 平安询价code,当客户向平安进行保险投递时，请填写上平安询价code字段
  quoteMark?: string;
  // 标的列表
  cargoInfo?: CargoInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tradeNo: 'trade_no',
      externalChannelCode: 'external_channel_code',
      externalProductCode: 'external_product_code',
      tbrName: 'tbr_name',
      tbrIdType: 'tbr_id_type',
      tbrIdNo: 'tbr_id_no',
      bbrName: 'bbr_name',
      bbrIdType: 'bbr_id_type',
      bbrIdNo: 'bbr_id_no',
      beneficiaryName: 'beneficiary_name',
      beneficiaryIdType: 'beneficiary_id_type',
      beneficiaryNo: 'beneficiary_no',
      insureStart: 'insure_start',
      insuredAmount: 'insured_amount',
      schemeName: 'scheme_name',
      projectName: 'project_name',
      relatedOrderNo: 'related_order_no',
      pickUpTime: 'pick_up_time',
      courierCompany: 'courier_company',
      courierNumber: 'courier_number',
      cargoType: 'cargo_type',
      cargoName: 'cargo_name',
      cargoQuantity: 'cargo_quantity',
      buyId: 'buy_id',
      sellId: 'sell_id',
      startPlace: 'start_place',
      destination: 'destination',
      isoCountry: 'iso_country',
      cargoWorth: 'cargo_worth',
      consigneeName: 'consignee_name',
      quoteMark: 'quote_mark',
      cargoInfo: 'cargo_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tradeNo: 'string',
      externalChannelCode: 'string',
      externalProductCode: 'string',
      tbrName: 'string',
      tbrIdType: 'string',
      tbrIdNo: 'string',
      bbrName: 'string',
      bbrIdType: 'string',
      bbrIdNo: 'string',
      beneficiaryName: 'string',
      beneficiaryIdType: 'string',
      beneficiaryNo: 'string',
      insureStart: 'string',
      insuredAmount: 'string',
      schemeName: 'string',
      projectName: 'string',
      relatedOrderNo: 'string',
      pickUpTime: 'string',
      courierCompany: 'string',
      courierNumber: 'string',
      cargoType: 'string',
      cargoName: 'string',
      cargoQuantity: 'string',
      buyId: 'string',
      sellId: 'string',
      startPlace: 'string',
      destination: 'string',
      isoCountry: 'string',
      cargoWorth: 'string',
      consigneeName: 'string',
      quoteMark: 'string',
      cargoInfo: { 'type': 'array', 'itemType': CargoInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsuranceCbpiResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 投保唯一码
  // 
  tradeNo?: string;
  // 保单号
  // 
  policyNo?: string;
  // 保费
  // 
  premium?: string;
  // 保额
  // 
  insuredAmount?: string;
  // 保险起期
  // 
  insureStart?: string;
  // 保险止期
  // 
  insureEnd?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tradeNo: 'trade_no',
      policyNo: 'policy_no',
      premium: 'premium',
      insuredAmount: 'insured_amount',
      insureStart: 'insure_start',
      insureEnd: 'insure_end',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tradeNo: 'string',
      policyNo: 'string',
      premium: 'string',
      insuredAmount: 'string',
      insureStart: 'string',
      insureEnd: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsuranceYzbreportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 调用方生成的唯一编码，格式为 yyyyMMdd_身份标识_其他编码，系统会根据该流水号做防重、幂等判断逻辑。
  // yyyyMMdd请传递当前时间。 
  // 身份标识可自定义。
  // 其他编码建议为随机值。
  // 当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；	
  tradeNo: string;
  // 保司编码，PAIC---平安、CPIC---太保
  externalChannelCode: string;
  // 险种编码，05-驿站宝
  externalProductCode: string;
  // 保单号，申请理赔的保单号
  policyNo: string;
  // 报案号，用于报案材料更新
  reportNo?: string;
  // 报案唯一标识，申请理赔所关联的订单号，如一个订单会存在多次理赔，请用唯一标识
  reportUniqueKey: string;
  // 理赔申请人
  claimApplyPerson: string;
  // 报案人名称
  reporterName: string;
  // 报案人联系方式
  reporterContact: string;
  // 出险时间，发生损失的时间 yyyy-mm-dd hh:mm:ss
  accidentTime: string;
  // 出险城市编码，国家地理位置编码6位城市编码
  accidentCityCode: string;
  // 出险区县编码，国家地理位置编码6位城市编码
  accidentDistrictCode: string;
  // 出险详细地址，事发出险地的详细地址
  accidentAddress: string;
  // 出险原因代码，包裹破损丢失-R3028，火灾-R3025，爆炸-R3026，水湿-R3036，自燃-R3038，其他意外-R3039
  accidentCauseCode: string;
  // 出险详细经过
  accidentDetail: string;
  // 损失预估总金额，单位（元），最多支持2位小数
  lossEstimateTotalAmount: string;
  // 损失类型，1-人伤，2-车损,，3-物损，6-其它损失，多种损失以英文逗号分隔
  lossType: string;
  // 快递公司，申请理赔所关联的快递公司名称，包裹出险可填
  courierCompany?: string;
  // 投诉工单号，申请理赔所关联的投诉工单号，包裹出险可填
  complaintJobNo?: string;
  // 运单号，申请理赔所关联的运单号，包裹出险可填
  wayBillNo?: string;
  // 支付信息
  paymentInfo?: PaymentInfo;
  // 人员伤残情况
  personLoss?: PersonLoss;
  // 车辆损失详情
  carLoss?: CarLoss;
  // 货物损失详情
  cargoLoss?: CargoLoss;
  // 文档信息
  documents?: Document[];
  // 判责工单号
  dutyWorkNo?: string;
  // 快递或包裹进入驿站仓储时间，yyyy-mm-dd hh:mm:ss
  pkgInDate?: string;
  // 驿站针对快递或包裹的出库时间（配送上门传送待签收时间），yyyy-mm-dd hh:mm:ss
  pkgOutDate?: string;
  // 发票工单投诉时间，yyyy-mm-dd hh:mm:ss
  genWorkDate?: string;
  // 工单类型
  workType?: string;
  // 是否星级站点，0是，1否
  isStarStation?: string;
  // 被保人姓名，实际的保险被保人名称
  bbrName?: string;
  // 被保人证件类型，01--居民身份证、03--营业执照
  bbrIdType?: string;
  // 被保人证件号码
  bbrIdNo?: string;
  // 保险起期，格式：yyyy-MM-dd HH:mm:ss
  insureStart?: string;
  // 保险止期，格式：yyyy-MM-dd HH:mm:ss
  insureEnd?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tradeNo: 'trade_no',
      externalChannelCode: 'external_channel_code',
      externalProductCode: 'external_product_code',
      policyNo: 'policy_no',
      reportNo: 'report_no',
      reportUniqueKey: 'report_unique_key',
      claimApplyPerson: 'claim_apply_person',
      reporterName: 'reporter_name',
      reporterContact: 'reporter_contact',
      accidentTime: 'accident_time',
      accidentCityCode: 'accident_city_code',
      accidentDistrictCode: 'accident_district_code',
      accidentAddress: 'accident_address',
      accidentCauseCode: 'accident_cause_code',
      accidentDetail: 'accident_detail',
      lossEstimateTotalAmount: 'loss_estimate_total_amount',
      lossType: 'loss_type',
      courierCompany: 'courier_company',
      complaintJobNo: 'complaint_job_no',
      wayBillNo: 'way_bill_no',
      paymentInfo: 'payment_info',
      personLoss: 'person_loss',
      carLoss: 'car_loss',
      cargoLoss: 'cargo_loss',
      documents: 'documents',
      dutyWorkNo: 'duty_work_no',
      pkgInDate: 'pkg_in_date',
      pkgOutDate: 'pkg_out_date',
      genWorkDate: 'gen_work_date',
      workType: 'work_type',
      isStarStation: 'is_star_station',
      bbrName: 'bbr_name',
      bbrIdType: 'bbr_id_type',
      bbrIdNo: 'bbr_id_no',
      insureStart: 'insure_start',
      insureEnd: 'insure_end',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tradeNo: 'string',
      externalChannelCode: 'string',
      externalProductCode: 'string',
      policyNo: 'string',
      reportNo: 'string',
      reportUniqueKey: 'string',
      claimApplyPerson: 'string',
      reporterName: 'string',
      reporterContact: 'string',
      accidentTime: 'string',
      accidentCityCode: 'string',
      accidentDistrictCode: 'string',
      accidentAddress: 'string',
      accidentCauseCode: 'string',
      accidentDetail: 'string',
      lossEstimateTotalAmount: 'string',
      lossType: 'string',
      courierCompany: 'string',
      complaintJobNo: 'string',
      wayBillNo: 'string',
      paymentInfo: PaymentInfo,
      personLoss: PersonLoss,
      carLoss: CarLoss,
      cargoLoss: CargoLoss,
      documents: { 'type': 'array', 'itemType': Document },
      dutyWorkNo: 'string',
      pkgInDate: 'string',
      pkgOutDate: 'string',
      genWorkDate: 'string',
      workType: 'string',
      isStarStation: 'string',
      bbrName: 'string',
      bbrIdType: 'string',
      bbrIdNo: 'string',
      insureStart: 'string',
      insureEnd: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsuranceYzbreportResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 报案唯一码
  tradeNo?: string;
  // 报案号
  reportNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tradeNo: 'trade_no',
      reportNo: 'report_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tradeNo: 'string',
      reportNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInsuranceYzbreportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 保司编码，PAIC---平安、CPIC---太保
  // 
  externalChannelCode: string;
  // 保单号
  policyNo: string;
  // 报案号
  reportNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      externalChannelCode: 'external_channel_code',
      policyNo: 'policy_no',
      reportNo: 'report_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      externalChannelCode: 'string',
      policyNo: 'string',
      reportNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInsuranceYzbreportResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 报案号
  reportNo?: string;
  // 保单号
  policyNo?: string;
  // 赔案号
  claimNo?: string;
  // 报案时间，格式yyyy-mm-dd hh:mm:ss
  reportReqTime?: string;
  // 案件状态，已报案，已结案，已赔付
  reportStatus?: string;
  // 案件赔付金额，单位元，两位小数;
  reportPaidAmount?: string;
  // 险种名称
  externalProductName?: string;
  // 结案时间，格式yyyy-mm-dd hh:mm:ss
  reportEndTime?: string;
  // 案件赔付结论，1-赔付 2-零结 3-商业险拒赔 4-整案拒赔 5-注销
  reportPaidDesc?: string;
  // 案件赔付时间，格式yyyy-mm-dd hh:mm:ss
  // 
  reportPaidTime?: string;
  // 案件结论描述
  reportVerdictDesc?: string;
  // 收款账户名称
  receiverAccountName?: string;
  // 收款账户类型 ,1-支付宝，2-银行卡
  receiverAccountType?: string;
  // 收款人账户
  receiverAccount?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      reportNo: 'report_no',
      policyNo: 'policy_no',
      claimNo: 'claim_no',
      reportReqTime: 'report_req_time',
      reportStatus: 'report_status',
      reportPaidAmount: 'report_paid_amount',
      externalProductName: 'external_product_name',
      reportEndTime: 'report_end_time',
      reportPaidDesc: 'report_paid_desc',
      reportPaidTime: 'report_paid_time',
      reportVerdictDesc: 'report_verdict_desc',
      receiverAccountName: 'receiver_account_name',
      receiverAccountType: 'receiver_account_type',
      receiverAccount: 'receiver_account',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      reportNo: 'string',
      policyNo: 'string',
      claimNo: 'string',
      reportReqTime: 'string',
      reportStatus: 'string',
      reportPaidAmount: 'string',
      externalProductName: 'string',
      reportEndTime: 'string',
      reportPaidDesc: 'string',
      reportPaidTime: 'string',
      reportVerdictDesc: 'string',
      receiverAccountName: 'string',
      receiverAccountType: 'string',
      receiverAccount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveInsuranceWaybillRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 调用方生成的唯一编码，格式为 yyyyMMdd_身份标识_其他编码，系统会根据该流水号做防重、幂等判断逻辑。
  // yyyyMMdd请传递当前时间。 
  // 身份标识可自定义。
  // 其他编码建议为随机值。
  // 当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；	
  // 
  tradeNo: string;
  // 运单号，客户侧系统的运单唯一识别号
  waybillNo: string;
  // 发货单位，客户唯一识别码或脱敏标识
  deliveryCompany?: string;
  // 发货人，客户唯一识别码或脱敏标识
  consignor: string;
  // 发货地址，地址可脱敏，不需要精确到门牌号
  deliveryAddress?: string;
  // 货物名称
  cargoName: string;
  // 货物数量，单位（件）
  cargoQuantity: string;
  // 货物重量，单位（kg）
  cargoWeight?: string;
  // 货物体积，单位（方）
  cargoDimensions?: string;
  // 揽件网点，货物出发地的揽件网点
  pickupOutlets?: string;
  // 出发站，专线出发站点
  departureStation: string;
  // 到达站，专线到达站点
  destinationStation: string;
  // 派件网点，货物目的地的派件网点
  dispatchOutlets?: string;
  // 收货人，客户唯一识别码或脱敏标识
  consignee?: string;
  // 收货地址，地址可脱敏，不需要精确到门牌号
  receivingAddress?: string;
  // 干线承运商
  trunkLineCarrier?: string;
  // 干线车牌号
  trunkLineCarNumber?: string;
  // 司机姓名
  driverName?: string;
  // 司机联系方式
  driverContact?: string;
  // 运单创建时间，格式：yyyy-mm-dd hh:mm:ss
  waybillCreateTime: string;
  // 干线运输发车时间，格式要求：yyyy-mm-dd hh:mm:ss
  trunkLineDepartureTime?: string;
  // 干线运输到达时间，格式要求：yyyy-mm-dd hh:mm:ss
  trunkLineArrivalTime?: string;
  // 运费总金额，单位（元），最多2位小数
  freight: string;
  // 运单状态，客户系统中实际的当前运单状态
  waybillStatus: string;
  // 提货车牌号
  takeCargoCarNumber?: string;
  // 短驳车牌号
  shortBargeCarNumber?: string;
  // 送货车牌号
  deliveryCarNumber?: string;
  // 运单操作类型，CREATE -创建，UPDATE-更新
  waybillActionType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tradeNo: 'trade_no',
      waybillNo: 'waybill_no',
      deliveryCompany: 'delivery_company',
      consignor: 'consignor',
      deliveryAddress: 'delivery_address',
      cargoName: 'cargo_name',
      cargoQuantity: 'cargo_quantity',
      cargoWeight: 'cargo_weight',
      cargoDimensions: 'cargo_dimensions',
      pickupOutlets: 'pickup_outlets',
      departureStation: 'departure_station',
      destinationStation: 'destination_station',
      dispatchOutlets: 'dispatch_outlets',
      consignee: 'consignee',
      receivingAddress: 'receiving_address',
      trunkLineCarrier: 'trunk_line_carrier',
      trunkLineCarNumber: 'trunk_line_car_number',
      driverName: 'driver_name',
      driverContact: 'driver_contact',
      waybillCreateTime: 'waybill_create_time',
      trunkLineDepartureTime: 'trunk_line_departure_time',
      trunkLineArrivalTime: 'trunk_line_arrival_time',
      freight: 'freight',
      waybillStatus: 'waybill_status',
      takeCargoCarNumber: 'take_cargo_car_number',
      shortBargeCarNumber: 'short_barge_car_number',
      deliveryCarNumber: 'delivery_car_number',
      waybillActionType: 'waybill_action_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tradeNo: 'string',
      waybillNo: 'string',
      deliveryCompany: 'string',
      consignor: 'string',
      deliveryAddress: 'string',
      cargoName: 'string',
      cargoQuantity: 'string',
      cargoWeight: 'string',
      cargoDimensions: 'string',
      pickupOutlets: 'string',
      departureStation: 'string',
      destinationStation: 'string',
      dispatchOutlets: 'string',
      consignee: 'string',
      receivingAddress: 'string',
      trunkLineCarrier: 'string',
      trunkLineCarNumber: 'string',
      driverName: 'string',
      driverContact: 'string',
      waybillCreateTime: 'string',
      trunkLineDepartureTime: 'string',
      trunkLineArrivalTime: 'string',
      freight: 'string',
      waybillStatus: 'string',
      takeCargoCarNumber: 'string',
      shortBargeCarNumber: 'string',
      deliveryCarNumber: 'string',
      waybillActionType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveInsuranceWaybillResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 运单操作类型，与请求参数中一致
  waybillActionType?: string;
  // 交易流水号，与请求参数中一致
  tradeNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      waybillActionType: 'waybill_action_type',
      tradeNo: 'trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      waybillActionType: 'string',
      tradeNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInsuranceEpolicyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 投保返回的交易流水号
  applyTradeNo: string;
  // 保单号
  policyNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applyTradeNo: 'apply_trade_no',
      policyNo: 'policy_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applyTradeNo: 'string',
      policyNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInsuranceEpolicyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 电子保单url地址
  policyUrl?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      policyUrl: 'policy_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      policyUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyInsuranceReportresultRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 案件同步唯一码，调用方生成的唯一编码； 格式为 yyyyMMdd_身份标识_其他编码，yyyyMMdd请传递当前时间。 系统会根据该流水号做防重、幂等判断逻辑。	
  // 
  tradeNo: string;
  // 渠道简称code
  channelSimpleCode: string;
  // 报案号，关联的报案案件号	
  // 
  reportNo: string;
  // 订单号	
  // 
  relaOrderNo: string;
  // 理赔金额(元)，实际的理赔金额，最多支持2位小数，超2位小数拒绝请求	
  // 
  claimAmount: string;
  // 支付时间，实际的保司打款时间，格式：yyyy-MM-dd HH:mm:ss	
  // 
  paymentTime: string;
  // 银行流水，打款的银行流水号	
  // 
  bankSerialNum: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tradeNo: 'trade_no',
      channelSimpleCode: 'channel_simple_code',
      reportNo: 'report_no',
      relaOrderNo: 'rela_order_no',
      claimAmount: 'claim_amount',
      paymentTime: 'payment_time',
      bankSerialNum: 'bank_serial_num',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tradeNo: 'string',
      channelSimpleCode: 'string',
      reportNo: 'string',
      relaOrderNo: 'string',
      claimAmount: 'string',
      paymentTime: 'string',
      bankSerialNum: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyInsuranceReportresultResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 案件同步唯一码	
  // 
  tradeNo?: string;
  // 案件通知状态--SUCCESS、FAIL	
  // 
  reportNotifyStatus?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tradeNo: 'trade_no',
      reportNotifyStatus: 'report_notify_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tradeNo: 'string',
      reportNotifyStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyCbrfInsureRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 保司编码
  insuranceCode: string;
  // 险种编码
  // 
  productCode: string;
  // 保险协议中的投保人全称
  policyholderName: string;
  // 投保人证件类型，01--居民身份证、03--营业执照
  policyholderIdType: string;
  // 投保人证件号码
  policyholderIdNo: string;
  // 被保人姓名，实际的保险被保人名称
  insuredName: string;
  // 被保人证件类型，01--居民身份证、03--营业执照
  insuredIdType: string;
  // 被保人证件号码
  insuredIdNo: string;
  // 受益人名称，实际的保险受益人名称
  beneficiaryName?: string;
  // 受益人证件类型，01--居民身份证、03--营业执照
  beneficiaryIdType?: string;
  // 受益人证件号码
  beneficiaryIdNo?: string;
  // 保司针对当前的项目所给的方案名
  schemeName: string;
  // 保司针对当前的项目所给的项目名
  projectName?: string;
  // 保险金额，单位（元），最多支持2位小数，超过2位拒绝
  insuranceAmount?: string;
  // 保险起期,yyyy-MM-dd HH:mm:ss
  insureStart: string;
  // 客户的订单编号
  relatedOrderNo: string;
  // 此包裹的成交撮合的电商平台名称
  ecommercePlatformName: string;
  // 承运此包裹的物流CP商名称
  logisticsProvider: string;
  // 货物的揽收时间
  collectionTime?: string;
  // yyyy-MM-dd HH:mm:ss 交付航司确认的时间
  deliveryTime: string;
  // 2位ISO缩写
  destCountry: string;
  // 商家唯一脱敏的编码
  merchantId: string;
  // 买家唯一脱敏的编码
  buyerId: string;
  // 货物重量，单位（kg）
  cargoWeight: string;
  // 货物类型的大类
  cargoType: string;
  // 实际的货物名称
  cargoName: string;
  // 货物的美金商品价值
  cargoValue: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      insuranceCode: 'insurance_code',
      productCode: 'product_code',
      policyholderName: 'policyholder_name',
      policyholderIdType: 'policyholder_id_type',
      policyholderIdNo: 'policyholder_id_no',
      insuredName: 'insured_name',
      insuredIdType: 'insured_id_type',
      insuredIdNo: 'insured_id_no',
      beneficiaryName: 'beneficiary_name',
      beneficiaryIdType: 'beneficiary_id_type',
      beneficiaryIdNo: 'beneficiary_id_no',
      schemeName: 'scheme_name',
      projectName: 'project_name',
      insuranceAmount: 'insurance_amount',
      insureStart: 'insure_start',
      relatedOrderNo: 'related_order_no',
      ecommercePlatformName: 'ecommerce_platform_name',
      logisticsProvider: 'logistics_provider',
      collectionTime: 'collection_time',
      deliveryTime: 'delivery_time',
      destCountry: 'dest_country',
      merchantId: 'merchant_id',
      buyerId: 'buyer_id',
      cargoWeight: 'cargo_weight',
      cargoType: 'cargo_type',
      cargoName: 'cargo_name',
      cargoValue: 'cargo_value',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      insuranceCode: 'string',
      productCode: 'string',
      policyholderName: 'string',
      policyholderIdType: 'string',
      policyholderIdNo: 'string',
      insuredName: 'string',
      insuredIdType: 'string',
      insuredIdNo: 'string',
      beneficiaryName: 'string',
      beneficiaryIdType: 'string',
      beneficiaryIdNo: 'string',
      schemeName: 'string',
      projectName: 'string',
      insuranceAmount: 'string',
      insureStart: 'string',
      relatedOrderNo: 'string',
      ecommercePlatformName: 'string',
      logisticsProvider: 'string',
      collectionTime: 'string',
      deliveryTime: 'string',
      destCountry: 'string',
      merchantId: 'string',
      buyerId: 'string',
      cargoWeight: 'string',
      cargoType: 'string',
      cargoName: 'string',
      cargoValue: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyCbrfInsureResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 投保响应编码
  // 
  insuredReceiptNo?: string;
  // 投保时的标的订单号
  relatedOrderNo?: string;
  // 保司出具的保单编号
  // 
  policyNo?: string;
  // 返回时间
  // 
  responseTime?: string;
  // 幂等标识；true:幂等结果；false: 非幂等结果
  // 
  idemFlag?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      insuredReceiptNo: 'insured_receipt_no',
      relatedOrderNo: 'related_order_no',
      policyNo: 'policy_no',
      responseTime: 'response_time',
      idemFlag: 'idem_flag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      insuredReceiptNo: 'string',
      relatedOrderNo: 'string',
      policyNo: 'string',
      responseTime: 'string',
      idemFlag: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RepayCbrfClaimRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 申请报案人的名称
  reporterName?: string;
  // 申请报案人的联系方式
  reporterPhoneNum?: string;
  // 理赔时间，yyyy-MM-dd HH:mm:ss
  claimTime: string;
  // 依据实际情况计算的理赔金额，单位元
  claimAmount: string;
  // 部分保司所需关联的投保响应编码
  insuredReceiptNo: string;
  // PICC-人保
  insuranceCode: string;
  // 02-跨境退货运费险
  productCode: string;
  // 保司出具的保单编号
  policyNo: string;
  // 客户的订单编号
  relatedOrderNo: string;
  // 此包裹的成交撮合的电商平台名称
  ecommercePlatformName: string;
  // 承运此包裹的物流CP商名称
  logisticsProvider: string;
  // 商家唯一脱敏的编码
  merchantId: string;
  // 买家唯一脱敏的编码
  buyerId: string;
  // 货物重量，单位（kg）
  cargoWeight: string;
  // 货物类型的大类
  cargoType: string;
  // 实际的货物名称
  cargoName: string;
  // 到达国内仓时间 yyyy-MM-dd HH:mm:ss
  dwaTime?: string;
  // 2位ISO缩写
  destCountry: string;
  // 索赔材料信息
  // 数组内最多10项，url长度限制最大500，name长度限制最大200
  claimInformations?: ClaimInformation[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      reporterName: 'reporter_name',
      reporterPhoneNum: 'reporter_phone_num',
      claimTime: 'claim_time',
      claimAmount: 'claim_amount',
      insuredReceiptNo: 'insured_receipt_no',
      insuranceCode: 'insurance_code',
      productCode: 'product_code',
      policyNo: 'policy_no',
      relatedOrderNo: 'related_order_no',
      ecommercePlatformName: 'ecommerce_platform_name',
      logisticsProvider: 'logistics_provider',
      merchantId: 'merchant_id',
      buyerId: 'buyer_id',
      cargoWeight: 'cargo_weight',
      cargoType: 'cargo_type',
      cargoName: 'cargo_name',
      dwaTime: 'dwa_time',
      destCountry: 'dest_country',
      claimInformations: 'claim_informations',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      reporterName: 'string',
      reporterPhoneNum: 'string',
      claimTime: 'string',
      claimAmount: 'string',
      insuredReceiptNo: 'string',
      insuranceCode: 'string',
      productCode: 'string',
      policyNo: 'string',
      relatedOrderNo: 'string',
      ecommercePlatformName: 'string',
      logisticsProvider: 'string',
      merchantId: 'string',
      buyerId: 'string',
      cargoWeight: 'string',
      cargoType: 'string',
      cargoName: 'string',
      dwaTime: 'string',
      destCountry: 'string',
      claimInformations: { 'type': 'array', 'itemType': ClaimInformation },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RepayCbrfClaimResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 赔案号
  claimNo?: string;
  // 客户投保时的标的订单号
  // 
  relatedOrderNo?: string;
  // 保单号
  policyNo?: string;
  // 幂等标识。true：幂等结果;false：非幂等结果
  // 
  idemFlag?: boolean;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      claimNo: 'claim_no',
      relatedOrderNo: 'related_order_no',
      policyNo: 'policy_no',
      idemFlag: 'idem_flag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      claimNo: 'string',
      relatedOrderNo: 'string',
      policyNo: 'string',
      idemFlag: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsuranceEndorsementRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 批单申请号
  endorsementApplyNo: string;
  // 申请时间
  endorsementApplyDate: string;
  // 保单号
  insuranceNumber: string;
  // 保司编码
  insuranceCode: string;
  // 批单保额，单位：元，最多两位小数
  endorsementApplyAmount: string;
  // [{"contentType":"INSURED_OBJECT","operateType":"ADD","content":{"insuranceObjectCode":"md00000003(标的类型:包裹)","objNo":"标的编号","logisticsNo":"物流单号","sellerID":"卖家ID","objName":"货物名称","objType":"货物类型","objAmount":"货物金额(元)","buyerID":"买家ID"}},{"contentType":"INSURED_OBJECT","operateType":"ADD","content":{"insuranceObjectCode":"md00000002(标的类型:入库单)","objNo":"标的编号","pkgInNo":"入库编号","merchantName":"商家","objName":"货物","objType":"货物类型","objCount":"货物数量","objAmount":"货物金额(元)","buyerID":""}}]
  endorsementApplyContents: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      endorsementApplyNo: 'endorsement_apply_no',
      endorsementApplyDate: 'endorsement_apply_date',
      insuranceNumber: 'insurance_number',
      insuranceCode: 'insurance_code',
      endorsementApplyAmount: 'endorsement_apply_amount',
      endorsementApplyContents: 'endorsement_apply_contents',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      endorsementApplyNo: 'string',
      endorsementApplyDate: 'string',
      insuranceNumber: 'string',
      insuranceCode: 'string',
      endorsementApplyAmount: 'string',
      endorsementApplyContents: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsuranceEndorsementResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 批单申请号
  endorsementApplyNo?: string;
  // 批单申请编码
  endorsementApplyCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      endorsementApplyNo: 'endorsement_apply_no',
      endorsementApplyCode: 'endorsement_apply_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      endorsementApplyNo: 'string',
      endorsementApplyCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInsuranceEndorsementRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 批单申请号
  endorsementApplyNo: string;
  // 批单申请编码
  endorsementApplyCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      endorsementApplyNo: 'endorsement_apply_no',
      endorsementApplyCode: 'endorsement_apply_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      endorsementApplyNo: 'string',
      endorsementApplyCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryInsuranceEndorsementResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 批单申请号
  endorsementApplyNo?: string;
  // 批单状态
  endorsementApplyStatus?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      endorsementApplyNo: 'endorsement_apply_no',
      endorsementApplyStatus: 'endorsement_apply_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      endorsementApplyNo: 'string',
      endorsementApplyStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsurancePiprereportRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 调用方生成的唯一编码，格式为 yyyyMMdd_身份标识_其他编码，系统会根据该流水号做防重、幂等判断逻辑。 yyyyMMdd请传递当前时间。 身份标识可自定义。 其他编码建议为随机值。 当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
  tradeNo: string;
  // 保司编码，海外邮包险（CICP--中华财险、PAIC--平安）、跨境邮包险（PAIC--平安、PICC--人保、CPIC--太保）
  externalChannelCode: string;
  // 险种编码 04--海外邮包险 06--跨境邮包险
  // 
  externalProductCode: string;
  // 保单号，申请理赔的保单号
  policyNo: string;
  // 订单号，申请理赔所关联的订单号
  relaOrderNo: string;
  // 出险时间，发生损失的时间，yyyy-MM-dd HH:mm:ss
  accidentTime: string;
  // 报案人名称，申请报案人的名称
  reporterName: string;
  // 报案人联系方式，申请报案人的联系方式
  reporterContact: string;
  // 索赔金额，单位（元），最多支持2位小数，超2位小数拒绝
  claimAmount?: string;
  // 物流揽收时间，yyyy-MM-dd HH:mm:ss
  collectDate: string;
  // 工单号，平台客服判责的工单号
  // 
  jobNo: string;
  // 快递公司名称，实际的派送公司全称
  // 
  courierCompany?: string;
  // 快递单号，实际的派送快递单号
  courierNumber?: string;
  // 买家ID，买家的脱敏唯一标识
  buyId: string;
  // 卖家ID，卖家的脱敏唯一标识
  sellId: string;
  // 站点/仓储ID，站点/仓储的脱敏唯一标识
  // 
  siteId: string;
  // 货物名称，实际的货物名称
  cargoName: string;
  // 货物的重量，单位(kg)，最多支持6位小数
  cargoWeight: string;
  // 出发地地址，货物的出发地地址
  // 
  startPlace: string;
  // 目的地地址，货物的目的地地址
  // 
  destination: string;
  // ISO到达国别，包裹业务实际发生的国家
  isoCountry: string;
  // 出险地址，货物发生实际损失的最近的一次地址记录
  accidentAddress?: string;
  // 赔付项目类型，01-运费，02-货值，03-货值2
  // 
  paymentItem?: string;
  // 出险类型，赔付的出险类型，届时保司和平台方商定
  accidentType?: string;
  // 索赔资料附件，最多10个
  claimInformations: ClaimInformation[];
  // 客户或物流CP商，针对此票货物的出发仓ID
  despatchWarehouseId?: string;
  // 投诉时间，yyyy-MM-dd HH:mm:ss
  complaintTime: string;
  // 判责时间，yyyy-MM-dd HH:mm:ss
  judgmentTime?: string;
  // 判责完成时间，yyyy-MM-dd HH:mm:ss
  judgmentFinishTime?: string;
  // 判责是否成立
  judgmentIsTenable?: boolean;
  // 预报案操作类型, 01.创建预报  02.更新预报案信息 03.撤销预报案信息
  actionType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      tradeNo: 'trade_no',
      externalChannelCode: 'external_channel_code',
      externalProductCode: 'external_product_code',
      policyNo: 'policy_no',
      relaOrderNo: 'rela_order_no',
      accidentTime: 'accident_time',
      reporterName: 'reporter_name',
      reporterContact: 'reporter_contact',
      claimAmount: 'claim_amount',
      collectDate: 'collect_date',
      jobNo: 'job_no',
      courierCompany: 'courier_company',
      courierNumber: 'courier_number',
      buyId: 'buy_id',
      sellId: 'sell_id',
      siteId: 'site_id',
      cargoName: 'cargo_name',
      cargoWeight: 'cargo_weight',
      startPlace: 'start_place',
      destination: 'destination',
      isoCountry: 'iso_country',
      accidentAddress: 'accident_address',
      paymentItem: 'payment_item',
      accidentType: 'accident_type',
      claimInformations: 'claim_informations',
      despatchWarehouseId: 'despatch_warehouse_id',
      complaintTime: 'complaint_time',
      judgmentTime: 'judgment_time',
      judgmentFinishTime: 'judgment_finish_time',
      judgmentIsTenable: 'judgment_is_tenable',
      actionType: 'action_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      tradeNo: 'string',
      externalChannelCode: 'string',
      externalProductCode: 'string',
      policyNo: 'string',
      relaOrderNo: 'string',
      accidentTime: 'string',
      reporterName: 'string',
      reporterContact: 'string',
      claimAmount: 'string',
      collectDate: 'string',
      jobNo: 'string',
      courierCompany: 'string',
      courierNumber: 'string',
      buyId: 'string',
      sellId: 'string',
      siteId: 'string',
      cargoName: 'string',
      cargoWeight: 'string',
      startPlace: 'string',
      destination: 'string',
      isoCountry: 'string',
      accidentAddress: 'string',
      paymentItem: 'string',
      accidentType: 'string',
      claimInformations: { 'type': 'array', 'itemType': ClaimInformation },
      despatchWarehouseId: 'string',
      complaintTime: 'string',
      judgmentTime: 'string',
      judgmentFinishTime: 'string',
      judgmentIsTenable: 'boolean',
      actionType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyInsurancePiprereportResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 预报案唯一码
  tradeNo?: string;
  // 预报案编号
  preReportNo?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      tradeNo: 'trade_no',
      preReportNo: 'pre_report_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      tradeNo: 'string',
      preReportNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushAuthSigninfoRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 签署流程id
  signProcessId: string;
  // 授权关系类型id
  authRelTypeId: string;
  // 某某主题
  signTheme?: string;
  // 发起方名称
  initiatorName: string;
  // 发起方证件类型，可以填写的枚举类型：UNIFIED_SOCIAL_CREDIT_CODE,  BUSINESS_LICENSE_NUMBER。分别表示统一社会信用代码和工商注册号
  initiatorCertType: string;
  // 发起方证件号码
  initiatorCertNum: string;
  // 合同模板hash
  contTmplHash: string;
  // 签署方信息列表
  authPartys: AuthParty[];
  // 上链文件信息列表
  authChainFiles: AuthChainFile[];
  // 动态字段1
  dynaField1?: string;
  // 动态字段2
  dynaField2?: string;
  // 动态字段3
  dynaField3?: string;
  // 动态字段4
  dynaField4?: string;
  // 动态字段5
  dynaField5?: string;
  // 动态字段6
  dynaField6?: string;
  // 动态字段7
  dynaField7?: string;
  // 动态字段8
  dynaField8?: string;
  // 动态字段9
  dynaField9?: string;
  // 动态字段10
  dynaField10?: string;
  // 动态字段11
  dynaField11?: string;
  // 动态字段12
  dynaField12?: string;
  // 动态字段13
  dynaField13?: string;
  // 动态字段14
  dynaField14?: string;
  // 动态字段15
  dynaField15?: string;
  // 动态字段16
  dynaField16?: string;
  // 动态字段17
  dynaField17?: string;
  // 动态字段18
  dynaField18?: string;
  // 动态字段19
  dynaField19?: string;
  // 动态字段20
  dynaField20?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      signProcessId: 'sign_process_id',
      authRelTypeId: 'auth_rel_type_id',
      signTheme: 'sign_theme',
      initiatorName: 'initiator_name',
      initiatorCertType: 'initiator_cert_type',
      initiatorCertNum: 'initiator_cert_num',
      contTmplHash: 'cont_tmpl_hash',
      authPartys: 'auth_partys',
      authChainFiles: 'auth_chain_files',
      dynaField1: 'dyna_field1',
      dynaField2: 'dyna_field2',
      dynaField3: 'dyna_field3',
      dynaField4: 'dyna_field4',
      dynaField5: 'dyna_field5',
      dynaField6: 'dyna_field6',
      dynaField7: 'dyna_field7',
      dynaField8: 'dyna_field8',
      dynaField9: 'dyna_field9',
      dynaField10: 'dyna_field10',
      dynaField11: 'dyna_field11',
      dynaField12: 'dyna_field12',
      dynaField13: 'dyna_field13',
      dynaField14: 'dyna_field14',
      dynaField15: 'dyna_field15',
      dynaField16: 'dyna_field16',
      dynaField17: 'dyna_field17',
      dynaField18: 'dyna_field18',
      dynaField19: 'dyna_field19',
      dynaField20: 'dyna_field20',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      signProcessId: 'string',
      authRelTypeId: 'string',
      signTheme: 'string',
      initiatorName: 'string',
      initiatorCertType: 'string',
      initiatorCertNum: 'string',
      contTmplHash: 'string',
      authPartys: { 'type': 'array', 'itemType': AuthParty },
      authChainFiles: { 'type': 'array', 'itemType': AuthChainFile },
      dynaField1: 'string',
      dynaField2: 'string',
      dynaField3: 'string',
      dynaField4: 'string',
      dynaField5: 'string',
      dynaField6: 'string',
      dynaField7: 'string',
      dynaField8: 'string',
      dynaField9: 'string',
      dynaField10: 'string',
      dynaField11: 'string',
      dynaField12: 'string',
      dynaField13: 'string',
      dynaField14: 'string',
      dynaField15: 'string',
      dynaField16: 'string',
      dynaField17: 'string',
      dynaField18: 'string',
      dynaField19: 'string',
      dynaField20: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushAuthSigninfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 推送成功
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

export class QueryPfPaymentRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务参考号
  bussRefrNo: string;
  // 支用id
  financingId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bussRefrNo: 'buss_refr_no',
      financingId: 'financing_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bussRefrNo: 'string',
      financingId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPfPaymentResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 入账状态: 10-受理 20-在途 00-成功 99-失败
  accountinStatus?: string;
  // 交易时间
  tradeTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      accountinStatus: 'accountin_status',
      tradeTime: 'trade_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      accountinStatus: 'string',
      tradeTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPfIouRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目id
  projectId: string;
  // 融资主体Did
  financingSubjectDid: string;
  // 支用Id
  financingId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
      financingSubjectDid: 'financing_subject_did',
      financingId: 'financing_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
      financingSubjectDid: 'string',
      financingId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPfIouResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 执行年利率
  annualInterestRate?: string;
  // 借据Id
  creditId?: string;
  // 借据到期日
  interestBearingEnd?: string;
  // 借据起息日
  interestBearingStart?: string;
  // 应还本金，即放款金额
  issuedAmount?: string;
  // 还款银行名称
  repayBankName?: string;
  // 还款账号名称
  repayAcctName?: string;
  // 还款账号
  repayAccount?: string;
  // 实际已还本金
  repayAmt?: string;
  // 实际已还利息
  repayInterest?: string;
  // 实际已还总额
  repayTotalAmt?: string;
  // 借据状态
  creditStatus?: string;
  // 是否逾期,0是,1否
  isOverdue?: string;
  // 项目id
  projectId?: string;
  // 支用id
  financingId?: string;
  // 融资主体DID
  financingSubjectDid?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      annualInterestRate: 'annual_interest_rate',
      creditId: 'credit_id',
      interestBearingEnd: 'interest_bearing_end',
      interestBearingStart: 'interest_bearing_start',
      issuedAmount: 'issued_amount',
      repayBankName: 'repay_bank_name',
      repayAcctName: 'repay_acct_name',
      repayAccount: 'repay_account',
      repayAmt: 'repay_amt',
      repayInterest: 'repay_interest',
      repayTotalAmt: 'repay_total_amt',
      creditStatus: 'credit_status',
      isOverdue: 'is_overdue',
      projectId: 'project_id',
      financingId: 'financing_id',
      financingSubjectDid: 'financing_subject_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      annualInterestRate: 'string',
      creditId: 'string',
      interestBearingEnd: 'string',
      interestBearingStart: 'string',
      issuedAmount: 'string',
      repayBankName: 'string',
      repayAcctName: 'string',
      repayAccount: 'string',
      repayAmt: 'string',
      repayInterest: 'string',
      repayTotalAmt: 'string',
      creditStatus: 'string',
      isOverdue: 'string',
      projectId: 'string',
      financingId: 'string',
      financingSubjectDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPfQuotaRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目标识
  projectId: string;
  // 证件号
  certNo: string;
  // 证件类型;050 统一社会信用证代码
  certType: string;
  // 银行端客户号
  customerNo: string;
  // 融资主体did
  financingSubjectDid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
      certNo: 'cert_no',
      certType: 'cert_type',
      customerNo: 'customer_no',
      financingSubjectDid: 'financing_subject_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
      certNo: 'string',
      certType: 'string',
      customerNo: 'string',
      financingSubjectDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPfQuotaResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 授信额度信息
  quotaInfo?: PfCreditQuotaInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      quotaInfo: 'quota_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      quotaInfo: { 'type': 'array', 'itemType': PfCreditQuotaInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyPfWaybillfinancingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求号，以时间串yyyyMMdd 开头，要求该请求号在请求方系统内唯一；同时该字段也是幂等字段
  requestNo: string;
  // 项目标识；与对接同学确认对应的标识值
  projectId: string;
  // 承运商did
  carrierDid: string;
  // 融资支用金额；总长度最长20位，保留2位小数，四舍五入
  financingAmount: string;
  // 支用币种，支持 CNY,USD
  financingCurrency: string;
  // 融资授信主体公司分布式数字身份
  financingSubjectDid: string;
  // 贷款期限，值为2~6，单位为月
  loanTerm: string;
  // 收款方开户行总行联行号
  payeeBankNumber: string;
  // 收款方开户行名称
  payeeBcb: string;
  // 收款方开户行银行卡号
  payeeBcbCardNo: string;
  // 收款方证件号
  // 
  // 
  payeeIdNumber: string;
  // 收款方证件类型
  payeeIdType: string;
  // 收款方名称
  payeeName: string;
  // 0政府投标 1经营周转 2支付货款 3采购机票，一般默认填 2 
  purpose: string;
  // 银行端的Ukey签名；使用方调用接口前使用银行Ukey做签名，并将签名后的结果填入该字段；一期，该字段可不传，使用方通过登录网上银行使用网银进行确认
  signature?: string;
  // 转账附言
  // 1: 工资、奖金收入
  // 2：稿费、演出费等劳务收入
  // 3：债券、期货、信托等投资的本金和收益
  // 4：个人债券或产权转让收益
  // 该字段建议填写 2
  transferPostscript: string;
  // 凭证类型，支持 WAYBILL,PAYABLE
  voucherCategory: string;
  // 支用凭证ids，支持多个，逗号隔开；
  voucherIds: string;
  // 8位发票号，支持多个，逗号分隔
  voucherInvoiceCodes?: string;
  // 提款确认书hash
  confirmationHash?: string;
  // 提款确认书 osskey
  confirmationOssKey?: string;
  // 签名公钥
  signaturePubKey?: string;
  // 网银操作员账号
  // 
  // 
  onlineBankOperatorAccount?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      requestNo: 'request_no',
      projectId: 'project_id',
      carrierDid: 'carrier_did',
      financingAmount: 'financing_amount',
      financingCurrency: 'financing_currency',
      financingSubjectDid: 'financing_subject_did',
      loanTerm: 'loan_term',
      payeeBankNumber: 'payee_bank_number',
      payeeBcb: 'payee_bcb',
      payeeBcbCardNo: 'payee_bcb_card_no',
      payeeIdNumber: 'payee_id_number',
      payeeIdType: 'payee_id_type',
      payeeName: 'payee_name',
      purpose: 'purpose',
      signature: 'signature',
      transferPostscript: 'transfer_postscript',
      voucherCategory: 'voucher_category',
      voucherIds: 'voucher_ids',
      voucherInvoiceCodes: 'voucher_invoice_codes',
      confirmationHash: 'confirmation_hash',
      confirmationOssKey: 'confirmation_oss_key',
      signaturePubKey: 'signature_pub_key',
      onlineBankOperatorAccount: 'online_bank_operator_account',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      requestNo: 'string',
      projectId: 'string',
      carrierDid: 'string',
      financingAmount: 'string',
      financingCurrency: 'string',
      financingSubjectDid: 'string',
      loanTerm: 'string',
      payeeBankNumber: 'string',
      payeeBcb: 'string',
      payeeBcbCardNo: 'string',
      payeeIdNumber: 'string',
      payeeIdType: 'string',
      payeeName: 'string',
      purpose: 'string',
      signature: 'string',
      transferPostscript: 'string',
      voucherCategory: 'string',
      voucherIds: 'string',
      voucherInvoiceCodes: 'string',
      confirmationHash: 'string',
      confirmationOssKey: 'string',
      signaturePubKey: 'string',
      onlineBankOperatorAccount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyPfWaybillfinancingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 融资支用Id
  financingId?: string;
  // 申请状态，
  // 融资申请失败 IN_VALID
  // 融资申请失败 F_APPLY_FAIL
  // 融资申请成功 F_APPLY_SUC
  // 融资申请成功 COMMIT
  // 融资核验中 VERIFYING
  // 融资核验失败 VERIFY_FAILURE
  // 融资订单生成成功 P_WITHDRAW
  // 融资成功 A_WITHDRAW
  // 融资失败 EXPIRED
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      financingId: 'financing_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      financingId: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushPfPledgeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目标识，可联系对接同学提供
  projectId: string;
  // 账单标识
  billId: string;
  // 融资主体did
  financingSubjectDid: string;
  // 请求号；以yyyyMMdd 时间串开头的32位字符串；该字符串需要保持请求系统内唯一，系统会以该请求号作为幂等处理
  requestNo: string;
  // 质押发票号码列表
  invoiceNos?: string[];
  // 托盘账单金额
  palletBillAmount?: string;
  // 托盘账单关联发票号列表
  palletInvoiceNos?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
      billId: 'bill_id',
      financingSubjectDid: 'financing_subject_did',
      requestNo: 'request_no',
      invoiceNos: 'invoice_nos',
      palletBillAmount: 'pallet_bill_amount',
      palletInvoiceNos: 'pallet_invoice_nos',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
      billId: 'string',
      financingSubjectDid: 'string',
      requestNo: 'string',
      invoiceNos: { 'type': 'array', 'itemType': 'string' },
      palletBillAmount: 'string',
      palletInvoiceNos: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushPfPledgeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 质押标识，用于账单质押推送状态查询
  pledgeId?: string;
  // 已提交  COMMIT
  // 推送中 PUSHING
  // 推送成功 PUSH_SUC
  // 推送失败 PUSH_FAIL
  status?: string;
  // 描述
  desc?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pledgeId: 'pledge_id',
      status: 'status',
      desc: 'desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pledgeId: 'string',
      status: 'string',
      desc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPfPledgeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 质押id
  pledgeId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pledgeId: 'pledge_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pledgeId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPfPledgeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 账单id
  billId?: string;
  // 融资主体did
  financingSubjectDid?: string;
  // 已提交  COMMIT
  // 推送中 PUSHING
  // 推送成功 PUSH_SUC
  // 推送失败 PUSH_FAIL
  status?: string;
  // 状态描述
  desc?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      billId: 'bill_id',
      financingSubjectDid: 'financing_subject_did',
      status: 'status',
      desc: 'desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      billId: 'string',
      financingSubjectDid: 'string',
      status: 'string',
      desc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPfFinancingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 支用Id
  financingId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      financingId: 'financing_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      financingId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPfFinancingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 支用Id
  financingId?: string;
  // 状态，说明如下：
  // 融资申请失败 IN_VALID;
  // 融资申请失败 F_APPLY_FAIL;
  // 融资申请成功 F_APPLY_SUC;
  // 融资申请成功 COMMIT;
  // 融资核验中 VERIFYING;
  // 融资核验失败 VERIFY_FAILURE;
  // 融资订单生成成功 P_WITHDRAW;
  // 融资成功 A_WITHDRAW;
  // 融资失败 EXPIRED
  status?: string;
  // 描述
  desc?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      financingId: 'financing_id',
      status: 'status',
      desc: 'desc',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      financingId: 'string',
      status: 'string',
      desc: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckPfVoucherRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 融资主体did
  financingSubjectDid: string;
  // 运单所属平台did
  platformDid: string;
  // 凭证类型，支持 WAYBILL(运单)
  voucherCategory: string;
  // 支持多个，逗号隔开
  voucherIds: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      financingSubjectDid: 'financing_subject_did',
      platformDid: 'platform_did',
      voucherCategory: 'voucher_category',
      voucherIds: 'voucher_ids',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      financingSubjectDid: 'string',
      platformDid: 'string',
      voucherCategory: 'string',
      voucherIds: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckPfVoucherResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 核验结果
  checkResults?: PfVoucherCheckResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      checkResults: 'check_results',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      checkResults: { 'type': 'array', 'itemType': PfVoucherCheckResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyPfConfirmationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 请求号
  requestNo: string;
  // 项目标识，可联系对接同学获取
  projectId: string;
  // 客户号
  clientNo: string;
  // 融资主体did
  financingSubjectDid: string;
  // 借款人证件类型
  borrowerCardType: string;
  // 借款人证件号码
  // 
  // 
  borrowerCardNo: string;
  // 融资金额
  // 
  // 
  financingAmount: string;
  // 支用币种
  // 
  // 
  currency: string;
  // 贷款期限（月）
  loanTerm: string;
  // 收款方开户行总行联行号
  // 
  // 
  payeeBankUnionNumber: string;
  // 收款方开户行名称
  // 
  // 
  payeeBankName: string;
  // 收款方户名
  // 
  // 
  payeeName: string;
  // 收款方银行卡账号
  // 
  // 
  payeeBankNo: string;
  // 收款人证件类型
  // 
  // 
  payeeCardType?: string;
  // 收款人证件号码
  // 
  // 
  payeeCardNo?: string;
  // 贷款用途
  // 
  // 
  purpose: string;
  // 附言
  postscript?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      requestNo: 'request_no',
      projectId: 'project_id',
      clientNo: 'client_no',
      financingSubjectDid: 'financing_subject_did',
      borrowerCardType: 'borrower_card_type',
      borrowerCardNo: 'borrower_card_no',
      financingAmount: 'financing_amount',
      currency: 'currency',
      loanTerm: 'loan_term',
      payeeBankUnionNumber: 'payee_bank_union_number',
      payeeBankName: 'payee_bank_name',
      payeeName: 'payee_name',
      payeeBankNo: 'payee_bank_no',
      payeeCardType: 'payee_card_type',
      payeeCardNo: 'payee_card_no',
      purpose: 'purpose',
      postscript: 'postscript',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      requestNo: 'string',
      projectId: 'string',
      clientNo: 'string',
      financingSubjectDid: 'string',
      borrowerCardType: 'string',
      borrowerCardNo: 'string',
      financingAmount: 'string',
      currency: 'string',
      loanTerm: 'string',
      payeeBankUnionNumber: 'string',
      payeeBankName: 'string',
      payeeName: 'string',
      payeeBankNo: 'string',
      payeeCardType: 'string',
      payeeCardNo: 'string',
      purpose: 'string',
      postscript: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyPfConfirmationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 融资提款确认书 hash	
  // 
  confirmationHash?: string;
  // 融资提款确认书 OSSkey
  // 
  // 
  confirmationOssKey?: string;
  // 贷款起始日期，格式：yyyyMMdd	
  // 
  // 
  loanStartTime?: string;
  // 贷款到期日期，格式：yyyyMMdd	
  // 
  // 
  loanEndTime?: string;
  // 还款方式
  // 
  // 
  repayment?: string;
  // 贷款利率
  etrdLnIntRt?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      confirmationHash: 'confirmation_hash',
      confirmationOssKey: 'confirmation_oss_key',
      loanStartTime: 'loan_start_time',
      loanEndTime: 'loan_end_time',
      repayment: 'repayment',
      etrdLnIntRt: 'etrd_ln_int_rt',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      confirmationHash: 'string',
      confirmationOssKey: 'string',
      loanStartTime: 'string',
      loanEndTime: 'string',
      repayment: 'string',
      etrdLnIntRt: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyPfFinancingqualificationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目标识，可联系对接同学获取
  projectId: string;
  // 客户号
  clientNo: string;
  // 融资主体did
  financingSubjectDid: string;
  // 借款人证件类型
  borrowerCardType: string;
  // 借款人证件号码
  // 
  // 
  borrowerCardNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
      clientNo: 'client_no',
      financingSubjectDid: 'financing_subject_did',
      borrowerCardType: 'borrower_card_type',
      borrowerCardNo: 'borrower_card_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
      clientNo: 'string',
      financingSubjectDid: 'string',
      borrowerCardType: 'string',
      borrowerCardNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyPfFinancingqualificationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 申请流水号
  aplSeqNo?: string;
  // 受理标志
  // 0-受理失败
  // 1-受理成功
  acceptanceFlag?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      aplSeqNo: 'apl_seq_no',
      acceptanceFlag: 'acceptance_flag',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      aplSeqNo: 'string',
      acceptanceFlag: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPfFinancingqualificationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 项目标识，可联系对接同学获取
  projectId: string;
  // 客户号
  clientNo: string;
  // 融资主体did
  financingSubjectDid: string;
  // 借款人证件类型
  borrowerCardType: string;
  // 借款人证件号码
  // 
  // 
  borrowerCardNo: string;
  // 申请流水号
  aplSeqNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      projectId: 'project_id',
      clientNo: 'client_no',
      financingSubjectDid: 'financing_subject_did',
      borrowerCardType: 'borrower_card_type',
      borrowerCardNo: 'borrower_card_no',
      aplSeqNo: 'apl_seq_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      projectId: 'string',
      clientNo: 'string',
      financingSubjectDid: 'string',
      borrowerCardType: 'string',
      borrowerCardNo: 'string',
      aplSeqNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPfFinancingqualificationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求号
  aplSeqNo?: string;
  // 申请日期
  appDate?: string;
  // 审批通过时间
  // 
  // 
  approveDate?: string;
  // 额度协议文件编号
  // 
  // 
  amntAgrmntFn?: string;
  // 处理状态
  // A01-审批中
  // A02-审批失败
  // A03-审批通过
  // A04-审批作废
  proceStatus?: string;
  // 失败原因
  failRslt?: string;
  // 错误码
  genReason?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      aplSeqNo: 'apl_seq_no',
      appDate: 'app_date',
      approveDate: 'approve_date',
      amntAgrmntFn: 'amnt_agrmnt_fn',
      proceStatus: 'proce_status',
      failRslt: 'fail_rslt',
      genReason: 'gen_reason',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      aplSeqNo: 'string',
      appDate: 'string',
      approveDate: 'string',
      amntAgrmntFn: 'string',
      proceStatus: 'string',
      failRslt: 'string',
      genReason: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackPfDefinpfRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 业务类型
  bizType: string;
  // 回调内容
  contentInfo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      bizType: 'biz_type',
      contentInfo: 'content_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      bizType: 'string',
      contentInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackPfDefinpfResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 是否成功
  result?: boolean;
  // 错误信息
  errorMsg?: string;
  // 返回结果
  response?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      result: 'result',
      errorMsg: 'error_msg',
      response: 'response',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      result: 'boolean',
      errorMsg: 'string',
      response: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPfWithdrawRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 银行端客户号
  customerNo: string;
  // 证件类型;050 统一社会信用证代码
  certType: string;
  // 证件号码
  certNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      customerNo: 'customer_no',
      certType: 'cert_type',
      certNo: 'cert_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      customerNo: 'string',
      certType: 'string',
      certNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryPfWithdrawResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 银行端客户号
  // 
  customerNo?: string;
  // 证件类型;050 统一社会信用证代码
  // 
  certType?: string;
  // 证件号码
  certNo?: string;
  // 客户完成账单融资申请放款至账户中待提款的金额，保留两位小数（单位：元）
  withdrawalAmount?: string;
  // 数据更新时间
  updateTime?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      customerNo: 'customer_no',
      certType: 'cert_type',
      certNo: 'cert_no',
      withdrawalAmount: 'withdrawal_amount',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      customerNo: 'string',
      certType: 'string',
      certNo: 'string',
      withdrawalAmount: 'string',
      updateTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDidForwarderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 代理did
  agentDid: string;
  // 企业名称
  epCertName: string;
  // 企业证件号
  epCertNo: string;
  // 扩展字段
  extensionInfo?: string;
  // 法人姓名
  legalPersonCertName?: string;
  // 法人身份证号
  legalPersonCertNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      agentDid: 'agent_did',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
      extensionInfo: 'extension_info',
      legalPersonCertName: 'legal_person_cert_name',
      legalPersonCertNo: 'legal_person_cert_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      agentDid: 'string',
      epCertName: 'string',
      epCertNo: 'string',
      extensionInfo: 'string',
      legalPersonCertName: 'string',
      legalPersonCertNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDidForwarderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 货代did
  did?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      did: 'did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      did: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDidSaasplatformRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业名称
  // 
  epCertName: string;
  // 企业证件号
  epCertNo: string;
  // 扩展字段
  extensionInfo?: string;
  // 法人姓名
  legalPersonCertName: string;
  // 法人身份证
  legalPersonCertNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
      extensionInfo: 'extension_info',
      legalPersonCertName: 'legal_person_cert_name',
      legalPersonCertNo: 'legal_person_cert_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      epCertName: 'string',
      epCertNo: 'string',
      extensionInfo: 'string',
      legalPersonCertName: 'string',
      legalPersonCertNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDidSaasplatformResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // saas平台did
  did?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      did: 'did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      did: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDidClientRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 代理did
  agentDid: string;
  // 企业名称
  epCertName: string;
  // 企业证件号
  epCertNo: string;
  // 扩展字段
  extensionInfo?: string;
  // 法人姓名
  legalPersonCertName?: string;
  // 法人身份证号
  legalPersonCertNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      agentDid: 'agent_did',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
      extensionInfo: 'extension_info',
      legalPersonCertName: 'legal_person_cert_name',
      legalPersonCertNo: 'legal_person_cert_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      agentDid: 'string',
      epCertName: 'string',
      epCertNo: 'string',
      extensionInfo: 'string',
      legalPersonCertName: 'string',
      legalPersonCertNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDidClientResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 直客did
  did?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      did: 'did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      did: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBizOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 提单要求
  blRequest?: string;
  // 订舱单号
  bookingNo?: string;
  // 船公司
  carrier?: string;
  // 客户did  业务必填
  clientDid?: string;
  // 收货人
  consignee?: string;
  // 约号
  contract?: string;
  // 报关
  customsClearance?: string;
  // 目的地 业务必填	
  // 
  deliveryPlace?: string;
  // 运输条款
  deliveryTerms?: string;
  // 卸货港. 业务必填	
  // 
  dischargePort?: string;
  // 货代did
  forwarderDid: string;
  // 运费
  freight?: string;
  // 保险
  insurance?: string;
  // 放单地点
  issuePlace?: string;
  // 起运港. 业务必填	
  // 
  loadingPort?: string;
  // 裝卸方式
  movement?: string;
  // 通知方
  notifyParty?: string;
  // 订单号
  orderNo: string;
  // 付费方式 业务必填	
  // 
  paymentTerms?: string;
  // 拖车
  pickUp?: string;
  // 收货地点
  receiptPlace?: string;
  // 备注
  remark?: string;
  // 发货人
  shipper?: string;
  // 任务单号
  taskOrder?: string;
  // 运输方式
  transportation?: string;
  // 船名
  vessel?: string;
  // 航次
  voyage?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      action: 'action',
      blRequest: 'bl_request',
      bookingNo: 'booking_no',
      carrier: 'carrier',
      clientDid: 'client_did',
      consignee: 'consignee',
      contract: 'contract',
      customsClearance: 'customs_clearance',
      deliveryPlace: 'delivery_place',
      deliveryTerms: 'delivery_terms',
      dischargePort: 'discharge_port',
      forwarderDid: 'forwarder_did',
      freight: 'freight',
      insurance: 'insurance',
      issuePlace: 'issue_place',
      loadingPort: 'loading_port',
      movement: 'movement',
      notifyParty: 'notify_party',
      orderNo: 'order_no',
      paymentTerms: 'payment_terms',
      pickUp: 'pick_up',
      receiptPlace: 'receipt_place',
      remark: 'remark',
      shipper: 'shipper',
      taskOrder: 'task_order',
      transportation: 'transportation',
      vessel: 'vessel',
      voyage: 'voyage',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      action: 'string',
      blRequest: 'string',
      bookingNo: 'string',
      carrier: 'string',
      clientDid: 'string',
      consignee: 'string',
      contract: 'string',
      customsClearance: 'string',
      deliveryPlace: 'string',
      deliveryTerms: 'string',
      dischargePort: 'string',
      forwarderDid: 'string',
      freight: 'string',
      insurance: 'string',
      issuePlace: 'string',
      loadingPort: 'string',
      movement: 'string',
      notifyParty: 'string',
      orderNo: 'string',
      paymentTerms: 'string',
      pickUp: 'string',
      receiptPlace: 'string',
      remark: 'string',
      shipper: 'string',
      taskOrder: 'string',
      transportation: 'string',
      vessel: 'string',
      voyage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBizOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBizConsignorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 托单code
  consignOrderCode: string;
  // 托单文件hash  业务必填
  fileHash?: string;
  // 托单文件id  业务必填
  fileId?: string;
  // 货代did
  forwarderDid: string;
  // 订单号
  orderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      action: 'action',
      consignOrderCode: 'consign_order_code',
      fileHash: 'file_hash',
      fileId: 'file_id',
      forwarderDid: 'forwarder_did',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      action: 'string',
      consignOrderCode: 'string',
      fileHash: 'string',
      fileId: 'string',
      forwarderDid: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBizConsignorderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBizGoodsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 预计备货时间 毫秒值单位
  cargoReadyDate?: number;
  // 危险品页号
  dgPageNo?: string;
  // 危险品级别
  dgType?: string;
  // 危险品闪点
  flashPoint?: string;
  // 货代did
  forwarderDid: string;
  // 货物 业务必填	
  // 
  goods?: string;
  // 中文品名
  goodsCn?: string;
  // 货物ID
  goodsId: string;
  // 货物类型（业务必填）
  goodsType?: string;
  // HS CODE
  hsCodes?: string[];
  // 唛头
  marks?: string;
  // 委托件数 业务必填	
  // 
  number?: string;
  // 订单号
  orderNo: string;
  // 包装类型
  packageType?: string;
  // 实际件数
  realNumber?: string;
  // 实际体积
  realVolume?: string;
  // 实际重量
  realWeight?: string;
  // 危险品联合国编号
  unNo?: string;
  // 委托体积（业务必填）
  volume?: string;
  // 委托重量（业务必填）
  weight?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      action: 'action',
      cargoReadyDate: 'cargo_ready_date',
      dgPageNo: 'dg_page_no',
      dgType: 'dg_type',
      flashPoint: 'flash_point',
      forwarderDid: 'forwarder_did',
      goods: 'goods',
      goodsCn: 'goods_cn',
      goodsId: 'goods_id',
      goodsType: 'goods_type',
      hsCodes: 'hs_codes',
      marks: 'marks',
      number: 'number',
      orderNo: 'order_no',
      packageType: 'package_type',
      realNumber: 'real_number',
      realVolume: 'real_volume',
      realWeight: 'real_weight',
      unNo: 'un_no',
      volume: 'volume',
      weight: 'weight',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      action: 'string',
      cargoReadyDate: 'number',
      dgPageNo: 'string',
      dgType: 'string',
      flashPoint: 'string',
      forwarderDid: 'string',
      goods: 'string',
      goodsCn: 'string',
      goodsId: 'string',
      goodsType: 'string',
      hsCodes: { 'type': 'array', 'itemType': 'string' },
      marks: 'string',
      number: 'string',
      orderNo: 'string',
      packageType: 'string',
      realNumber: 'string',
      realVolume: 'string',
      realWeight: 'string',
      unNo: 'string',
      volume: 'string',
      weight: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBizGoodsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBizSonotifyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // so通知关联的订舱单 (业务必填)
  bookingParams?: SoNotifyBookingParam[];
  // 联系人
  contactName?: string;
  // 联系方式
  contactType?: string;
  // 卸货港 业务必填	
  // 
  dischargePort?: string;
  // 货代did
  forwarderDid: string;
  // 起运港 业务必填	
  // 
  loadingPort?: string;
  // 	
  // 订单号
  orderNo: string;
  // soNotify 唯一标识code
  soNotifyCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      action: 'action',
      bookingParams: 'booking_params',
      contactName: 'contact_name',
      contactType: 'contact_type',
      dischargePort: 'discharge_port',
      forwarderDid: 'forwarder_did',
      loadingPort: 'loading_port',
      orderNo: 'order_no',
      soNotifyCode: 'so_notify_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      action: 'string',
      bookingParams: { 'type': 'array', 'itemType': SoNotifyBookingParam },
      contactName: 'string',
      contactType: 'string',
      dischargePort: 'string',
      forwarderDid: 'string',
      loadingPort: 'string',
      orderNo: 'string',
      soNotifyCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBizSonotifyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBizBookingorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 订舱单号
  bookingNo: string;
  // 船公司 业务必填
  carrier?: string;
  // 截关时间
  customsClearance?: number;
  // 场站 业务必填
  cy?: string;
  // 截港时间 毫秒值单位
  cyClosing?: number;
  // 目的地
  deliveryPlace?: string;
  // 卸货港
  dischargePort?: string;
  // 预计船期 毫秒值单位
  etd?: number;
  // 货代did
  forwarderDid: string;
  // 起运港
  loadingPort?: string;
  // 订单号
  orderNo: string;
  // 截单时间  毫秒值单位
  siClosing?: number;
  // 特殊字段无要求非必填
  source?: string;
  // 船名 业务必填
  vessel?: string;
  // 航次 业务必填
  voyage?: string;
  // 订舱号
  bkgNo: string;
  // 确认时间
  confirmTime?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      action: 'action',
      bookingNo: 'booking_no',
      carrier: 'carrier',
      customsClearance: 'customs_clearance',
      cy: 'cy',
      cyClosing: 'cy_closing',
      deliveryPlace: 'delivery_place',
      dischargePort: 'discharge_port',
      etd: 'etd',
      forwarderDid: 'forwarder_did',
      loadingPort: 'loading_port',
      orderNo: 'order_no',
      siClosing: 'si_closing',
      source: 'source',
      vessel: 'vessel',
      voyage: 'voyage',
      bkgNo: 'bkg_no',
      confirmTime: 'confirm_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      action: 'string',
      bookingNo: 'string',
      carrier: 'string',
      customsClearance: 'number',
      cy: 'string',
      cyClosing: 'number',
      deliveryPlace: 'string',
      dischargePort: 'string',
      etd: 'number',
      forwarderDid: 'string',
      loadingPort: 'string',
      orderNo: 'string',
      siClosing: 'number',
      source: 'string',
      vessel: 'string',
      voyage: 'string',
      bkgNo: 'string',
      confirmTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBizBookingorderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBizContainerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 订舱单号
  // 
  bookingNo: string;
  // 集装箱ID
  containerId: string;
  // 箱号 业务必填
  containerNo?: string;
  //  箱型  业务必填
  containerType?: string;
  // 货代did
  forwarderDid: string;
  // 货物列表
  goodsList?: ContainerGoodsParam[];
  // 订单号
  orderNo: string;
  // 备注
  remark?: string;
  // 封铅号
  sealNo?: string;
  // 是否SOC
  socFlag?: string;
  // 特殊字段无要求非必填
  source?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      action: 'action',
      bookingNo: 'booking_no',
      containerId: 'container_id',
      containerNo: 'container_no',
      containerType: 'container_type',
      forwarderDid: 'forwarder_did',
      goodsList: 'goods_list',
      orderNo: 'order_no',
      remark: 'remark',
      sealNo: 'seal_no',
      socFlag: 'soc_flag',
      source: 'source',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      action: 'string',
      bookingNo: 'string',
      containerId: 'string',
      containerNo: 'string',
      containerType: 'string',
      forwarderDid: 'string',
      goodsList: { 'type': 'array', 'itemType': ContainerGoodsParam },
      orderNo: 'string',
      remark: 'string',
      sealNo: 'string',
      socFlag: 'string',
      source: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBizContainerResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBizCustomsorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 订舱单号
  bookingParams?: CustomsOrderBookingParam[];
  // 报关代理
  broker?: string;
  // 集装箱ID
  containerId?: string;
  // 箱号
  containerNo?: string;
  // 报关单号
  customsCode: string;
  //  出口人
  exporter?: string;
  // 货代did
  // 
  forwarderDid: string;
  // 货物名称
  goods?: string;
  // 毛重 
  grossWeight?: string;
  // 订单号
  // 
  orderNo: string;
  // 件数
  packagesNo?: string;
  // 报关状态  APPROVED--通关，UNAPPROVED-未通关
  status?: string;
  // 航名 业务必填
  vessel: string;
  // 航次 业务必填
  voyage?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      action: 'action',
      bookingParams: 'booking_params',
      broker: 'broker',
      containerId: 'container_id',
      containerNo: 'container_no',
      customsCode: 'customs_code',
      exporter: 'exporter',
      forwarderDid: 'forwarder_did',
      goods: 'goods',
      grossWeight: 'gross_weight',
      orderNo: 'order_no',
      packagesNo: 'packages_no',
      status: 'status',
      vessel: 'vessel',
      voyage: 'voyage',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      action: 'string',
      bookingParams: { 'type': 'array', 'itemType': CustomsOrderBookingParam },
      broker: 'string',
      containerId: 'string',
      containerNo: 'string',
      customsCode: 'string',
      exporter: 'string',
      forwarderDid: 'string',
      goods: 'string',
      grossWeight: 'string',
      orderNo: 'string',
      packagesNo: 'string',
      status: 'string',
      vessel: 'string',
      voyage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBizCustomsorderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBizVehicleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 箱子信息 业务必填
  containerParams?: VehicleContainerParam[];
  // 货代did
  forwarderDid: string;
  // 订单号
  orderNo: string;
  // 拖车单号
  vehicleCode: string;
  // 车牌号 
  vehicleNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      action: 'action',
      containerParams: 'container_params',
      forwarderDid: 'forwarder_did',
      orderNo: 'order_no',
      vehicleCode: 'vehicle_code',
      vehicleNo: 'vehicle_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      action: 'string',
      containerParams: { 'type': 'array', 'itemType': VehicleContainerParam },
      forwarderDid: 'string',
      orderNo: 'string',
      vehicleCode: 'string',
      vehicleNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBizVehicleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBizMasterblRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 订舱单
  blBookingParams?: MasterBlBookingParam[];
  // 提单要求 
  blRequest?: string;
  // 提单类型
  blType?: string;
  // 船公司 业务必填
  carrier?: string;
  // 收货人 业务必填	
  // 
  consignee?: string;
  // 集装箱列表 业务必填	
  // 
  containerParams?: MasterBlContainerParam[];
  // 约号
  contract?: string;
  // 目的地. 业务必填	
  // 
  deliveryPlace?: string;
  // 运输条款
  deliveryTerms?: string;
  // 卸货港. 业务必填	
  // 
  dischargePort?: string;
  // 	
  // 货代did
  forwarderDid: string;
  // 运费/约号
  freight?: string;
  // 货物列表. 业务必填	
  // 
  goodsParams?: MasterBlGoodsParam[];
  // 出单日期
  issueDate?: number;
  // 放单地点
  issuePlace?: string;
  // 起运港  业务必填	
  // 
  loadingPort?: string;
  // master提单号
  masterBlNo: string;
  // 裝卸方式
  movement?: string;
  // 通知方 
  notifyParty?: string;
  // 开船日期
  onBoardDate?: number;
  // 船状态
  onBoardStatus?: string;
  // 	
  // 订单号
  orderNo: string;
  // 付费方式  业务必填	
  // 
  paymentTerms?: string;
  // 前程运输
  prCarriage?: string;
  // 其他
  remark?: string;
  //  发货人. 业务必填	
  // 
  shipper?: string;
  // 特殊字段无要求非必填
  source?: string;
  // 运输方式
  transportation?: string;
  // 航名 业务必填
  vessel?: string;
  // 航次 业务必填
  voyage?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      action: 'action',
      blBookingParams: 'bl_booking_params',
      blRequest: 'bl_request',
      blType: 'bl_type',
      carrier: 'carrier',
      consignee: 'consignee',
      containerParams: 'container_params',
      contract: 'contract',
      deliveryPlace: 'delivery_place',
      deliveryTerms: 'delivery_terms',
      dischargePort: 'discharge_port',
      forwarderDid: 'forwarder_did',
      freight: 'freight',
      goodsParams: 'goods_params',
      issueDate: 'issue_date',
      issuePlace: 'issue_place',
      loadingPort: 'loading_port',
      masterBlNo: 'master_bl_no',
      movement: 'movement',
      notifyParty: 'notify_party',
      onBoardDate: 'on_board_date',
      onBoardStatus: 'on_board_status',
      orderNo: 'order_no',
      paymentTerms: 'payment_terms',
      prCarriage: 'pr_carriage',
      remark: 'remark',
      shipper: 'shipper',
      source: 'source',
      transportation: 'transportation',
      vessel: 'vessel',
      voyage: 'voyage',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      action: 'string',
      blBookingParams: { 'type': 'array', 'itemType': MasterBlBookingParam },
      blRequest: 'string',
      blType: 'string',
      carrier: 'string',
      consignee: 'string',
      containerParams: { 'type': 'array', 'itemType': MasterBlContainerParam },
      contract: 'string',
      deliveryPlace: 'string',
      deliveryTerms: 'string',
      dischargePort: 'string',
      forwarderDid: 'string',
      freight: 'string',
      goodsParams: { 'type': 'array', 'itemType': MasterBlGoodsParam },
      issueDate: 'number',
      issuePlace: 'string',
      loadingPort: 'string',
      masterBlNo: 'string',
      movement: 'string',
      notifyParty: 'string',
      onBoardDate: 'number',
      onBoardStatus: 'string',
      orderNo: 'string',
      paymentTerms: 'string',
      prCarriage: 'string',
      remark: 'string',
      shipper: 'string',
      source: 'string',
      transportation: 'string',
      vessel: 'string',
      voyage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBizMasterblResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FinishBizAuditRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 	
  // 货代did
  forwarderDid: string;
  // 	
  // 订单号
  orderNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      forwarderDid: 'forwarder_did',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      forwarderDid: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FinishBizAuditResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBizHouseblRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 订舱单
  blBookingParams?: HouseBlBookingParam[];
  // 提单签发单位
  blIssuingAgency?: string;
  // 提单要求
  blRequest?: string;
  // 提单类型
  blType?: string;
  // 船公司 业务必填
  carrier?: string;
  // 收货人 业务必填	
  // 
  consignee?: string;
  // 集装箱列表 业务必填	
  // 
  containerParams?: HouseBlContainerParam[];
  // 约号
  contract?: string;
  // 目的地  业务必填	
  // 
  deliveryPlace?: string;
  // 运输条款
  deliveryTerms?: string;
  // 卸货港 业务必填	
  // 
  dischargePort?: string;
  // 货代did
  forwarderDid: string;
  // 运费
  freight?: string;
  // 货物列表 业务必填	
  // 
  goodsParams?: HouseBlGoodsParam[];
  // house提单号
  houseBlNo: string;
  // 出单日期 
  issueDate?: number;
  // 放单地点
  issuePlace?: string;
  // 起运港 业务必填	
  // 
  loadingPort?: string;
  // master提单号
  masterBlNo?: string;
  // 裝卸方式 
  movement?: string;
  // 通知方
  notifyParty?: string;
  // 开船日期
  onBoardDate?: number;
  // 订单号
  orderNo: string;
  // 付费方式 业务必填	
  // 
  paymentTerms?: string;
  // 其他
  remark?: string;
  // 发货人 业务必填	
  // 
  shipper?: string;
  // 运输方式
  transportation?: string;
  // 航名 业务必填
  vessel?: string;
  // 航次 业务必填
  voyage?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      action: 'action',
      blBookingParams: 'bl_booking_params',
      blIssuingAgency: 'bl_issuing_agency',
      blRequest: 'bl_request',
      blType: 'bl_type',
      carrier: 'carrier',
      consignee: 'consignee',
      containerParams: 'container_params',
      contract: 'contract',
      deliveryPlace: 'delivery_place',
      deliveryTerms: 'delivery_terms',
      dischargePort: 'discharge_port',
      forwarderDid: 'forwarder_did',
      freight: 'freight',
      goodsParams: 'goods_params',
      houseBlNo: 'house_bl_no',
      issueDate: 'issue_date',
      issuePlace: 'issue_place',
      loadingPort: 'loading_port',
      masterBlNo: 'master_bl_no',
      movement: 'movement',
      notifyParty: 'notify_party',
      onBoardDate: 'on_board_date',
      orderNo: 'order_no',
      paymentTerms: 'payment_terms',
      remark: 'remark',
      shipper: 'shipper',
      transportation: 'transportation',
      vessel: 'vessel',
      voyage: 'voyage',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      action: 'string',
      blBookingParams: { 'type': 'array', 'itemType': HouseBlBookingParam },
      blIssuingAgency: 'string',
      blRequest: 'string',
      blType: 'string',
      carrier: 'string',
      consignee: 'string',
      containerParams: { 'type': 'array', 'itemType': HouseBlContainerParam },
      contract: 'string',
      deliveryPlace: 'string',
      deliveryTerms: 'string',
      dischargePort: 'string',
      forwarderDid: 'string',
      freight: 'string',
      goodsParams: { 'type': 'array', 'itemType': HouseBlGoodsParam },
      houseBlNo: 'string',
      issueDate: 'number',
      issuePlace: 'string',
      loadingPort: 'string',
      masterBlNo: 'string',
      movement: 'string',
      notifyParty: 'string',
      onBoardDate: 'number',
      orderNo: 'string',
      paymentTerms: 'string',
      remark: 'string',
      shipper: 'string',
      transportation: 'string',
      vessel: 'string',
      voyage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBizHouseblResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBillPaybillorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 申请时间
  applyDate?: number;
  // 银行收款账户
  bankReceiptAccount?: string;
  // 币种
  currency?: string;
  // 开户行
  depositBank?: string;
  // 货代did
  forwarderDid: string;
  // 应付总额
  payAmount?: string;
  // 付款单编号
  payBillOrderCode: string;
  // 应付账单资费项 业务必填
  payBillTariffParams?: PayBillTariffParam[];
  // 付款公司
  payCompany?: string;
  // 付款公司企业信用号
  // 
  payCompanyCertNo?: string;
  // 付款公司did
  payCompanyDid?: string;
  // 付款期限
  payDeadline?: string;
  // 收款客户
  receiptClient?: string;
  // 收款客户企业信用号
  // 
  receiptClientCertNo?: string;
  // 收款客户did
  receiptClientDid?: string;
  // 对应应收资费项code
  receiptTariffCodes?: string[];
  // 结算公司
  settleCompany?: string;
  // 结算公司企业信用号
  // 
  settleCompanyCertNo?: string;
  // 结算公司did
  settleCompanyDid?: string;
  // 账单结算周期
  settleCycle?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applyDate: 'apply_date',
      bankReceiptAccount: 'bank_receipt_account',
      currency: 'currency',
      depositBank: 'deposit_bank',
      forwarderDid: 'forwarder_did',
      payAmount: 'pay_amount',
      payBillOrderCode: 'pay_bill_order_code',
      payBillTariffParams: 'pay_bill_tariff_params',
      payCompany: 'pay_company',
      payCompanyCertNo: 'pay_company_cert_no',
      payCompanyDid: 'pay_company_did',
      payDeadline: 'pay_deadline',
      receiptClient: 'receipt_client',
      receiptClientCertNo: 'receipt_client_cert_no',
      receiptClientDid: 'receipt_client_did',
      receiptTariffCodes: 'receipt_tariff_codes',
      settleCompany: 'settle_company',
      settleCompanyCertNo: 'settle_company_cert_no',
      settleCompanyDid: 'settle_company_did',
      settleCycle: 'settle_cycle',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applyDate: 'number',
      bankReceiptAccount: 'string',
      currency: 'string',
      depositBank: 'string',
      forwarderDid: 'string',
      payAmount: 'string',
      payBillOrderCode: 'string',
      payBillTariffParams: { 'type': 'array', 'itemType': PayBillTariffParam },
      payCompany: 'string',
      payCompanyCertNo: 'string',
      payCompanyDid: 'string',
      payDeadline: 'string',
      receiptClient: 'string',
      receiptClientCertNo: 'string',
      receiptClientDid: 'string',
      receiptTariffCodes: { 'type': 'array', 'itemType': 'string' },
      settleCompany: 'string',
      settleCompanyCertNo: 'string',
      settleCompanyDid: 'string',
      settleCycle: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBillPaybillorderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证hash
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBillReceiptbillorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 实际收款结算公司
  actualSettleCompany?: string;
  // 实际收款结算公司企业信用号
  actualSettleCompanyCertNo?: string;
  // 实际收款结算公司did
  actualSettleCompanyDid?: string;
  // 确认时间  业务必填
  applyDate?: number;
  // 揽货类型
  clientType?: string;
  // 币种 业务必填
  currency?: string;
  // 货代did
  forwarderDid: string;
  // 开票抬头
  invoiceTitle?: string;
  // 含税价
  priceIncludingTax?: string;
  // 收款账号
  receiptAccount?: string;
  // 收款总额 业务必填
  receiptAmount?: string;
  // 收款账单编号
  receiptBillOrderCode: string;
  // 应收资费项账单 业务必填
  receiptBillTariffParams?: ReceiptBillTariffParam[];
  // 结算客户名称
  settleClient?: string;
  // 结算客户企业信用号
  settleClientCertNo?: string;
  // 结算客户名称did
  settleClientDid?: string;
  // 结算公司
  settleCompany?: string;
  // 结算公司企业信用号
  settleCompanyCertNo?: string;
  // 结算公司did
  settleCompanyDid?: string;
  // 账单结算周期
  settleCycle?: string;
  // 税金
  taxes?: string;
  // 未税价
  untaxedPrice?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      actualSettleCompany: 'actual_settle_company',
      actualSettleCompanyCertNo: 'actual_settle_company_cert_no',
      actualSettleCompanyDid: 'actual_settle_company_did',
      applyDate: 'apply_date',
      clientType: 'client_type',
      currency: 'currency',
      forwarderDid: 'forwarder_did',
      invoiceTitle: 'invoice_title',
      priceIncludingTax: 'price_including_tax',
      receiptAccount: 'receipt_account',
      receiptAmount: 'receipt_amount',
      receiptBillOrderCode: 'receipt_bill_order_code',
      receiptBillTariffParams: 'receipt_bill_tariff_params',
      settleClient: 'settle_client',
      settleClientCertNo: 'settle_client_cert_no',
      settleClientDid: 'settle_client_did',
      settleCompany: 'settle_company',
      settleCompanyCertNo: 'settle_company_cert_no',
      settleCompanyDid: 'settle_company_did',
      settleCycle: 'settle_cycle',
      taxes: 'taxes',
      untaxedPrice: 'untaxed_price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      actualSettleCompany: 'string',
      actualSettleCompanyCertNo: 'string',
      actualSettleCompanyDid: 'string',
      applyDate: 'number',
      clientType: 'string',
      currency: 'string',
      forwarderDid: 'string',
      invoiceTitle: 'string',
      priceIncludingTax: 'string',
      receiptAccount: 'string',
      receiptAmount: 'string',
      receiptBillOrderCode: 'string',
      receiptBillTariffParams: { 'type': 'array', 'itemType': ReceiptBillTariffParam },
      settleClient: 'string',
      settleClientCertNo: 'string',
      settleClientDid: 'string',
      settleCompany: 'string',
      settleCompanyCertNo: 'string',
      settleCompanyDid: 'string',
      settleCycle: 'string',
      taxes: 'string',
      untaxedPrice: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateBillReceiptbillorderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBillPaybilltariffRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 计费数量 业务必填
  billingNumber?: string;
  // 计费类型 业务必填
  billingType?: string;
  // 航运订舱号[业务必填]
  bkgNo?: string;
  // 订舱单号[业务必填]
  bookingNo?: string;
  // 币种 业务必填
  currency?: string;
  // 货代did
  forwarderDid: string;
  // 收支  INCOME--收入， EXPENSES--支出
  // 业务必填
  incomeOrExpenses?: string;
  // 电子发票网址
  invoiceUrl?: string;
  // 工作单号 业务必填
  orderNo?: string;
  // 资费单据编号
  payTariffCode: string;
  // 资费项中文描述 业务必填
  payTariffDesc?: string;
  // 资费项目 业务必填
  payTariffProject?: string;
  // 含税价 业务必填
  priceIncludingTax?: string;
  // 结算客户名称
  settleClient?: string;
  // 结算客户企业信用号
  settleClientCertNo?: string;
  // 结算客户did
  settleClientDid?: string;
  // 税金
  taxes?: string;
  // 未税价 业务必填
  untaxedPrice?: string;
  // 确认时间
  confirmTime?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      action: 'action',
      billingNumber: 'billing_number',
      billingType: 'billing_type',
      bkgNo: 'bkg_no',
      bookingNo: 'booking_no',
      currency: 'currency',
      forwarderDid: 'forwarder_did',
      incomeOrExpenses: 'income_or_expenses',
      invoiceUrl: 'invoice_url',
      orderNo: 'order_no',
      payTariffCode: 'pay_tariff_code',
      payTariffDesc: 'pay_tariff_desc',
      payTariffProject: 'pay_tariff_project',
      priceIncludingTax: 'price_including_tax',
      settleClient: 'settle_client',
      settleClientCertNo: 'settle_client_cert_no',
      settleClientDid: 'settle_client_did',
      taxes: 'taxes',
      untaxedPrice: 'untaxed_price',
      confirmTime: 'confirm_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      action: 'string',
      billingNumber: 'string',
      billingType: 'string',
      bkgNo: 'string',
      bookingNo: 'string',
      currency: 'string',
      forwarderDid: 'string',
      incomeOrExpenses: 'string',
      invoiceUrl: 'string',
      orderNo: 'string',
      payTariffCode: 'string',
      payTariffDesc: 'string',
      payTariffProject: 'string',
      priceIncludingTax: 'string',
      settleClient: 'string',
      settleClientCertNo: 'string',
      settleClientDid: 'string',
      taxes: 'string',
      untaxedPrice: 'string',
      confirmTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBillPaybilltariffResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBillReceiptbilltariffRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 计费数量  业务必填
  billingNumber?: string;
  // 计费类型 业务必填
  billingType?: string;
  // 航运订舱号[业务必填]
  bkgNo?: string;
  // 订舱单号[业务必填]
  bookingNo?: string;
  // 币种 [业务必填]
  currency?: string;
  // 货代did
  forwarderDid: string;
  // 收支  INCOME--收入， EXPENSES--支出
  // 业务必填
  incomeOrExpenses?: string;
  // 电子发票网址
  invoiceUrl?: string;
  // 工作单号 业务必填
  orderNo?: string;
  // 含税价 业务必填
  priceIncludingTax?: string;
  // 资费单据编号
  receiptTariffCode: string;
  // 中文描述 业务必填
  receiptTariffDesc?: string;
  // 资费项目 业务必填
  receiptTariffProject?: string;
  // 结算客户名称
  settleClient?: string;
  // 结算客户企业信用号
  settleClientCertNo?: string;
  // 结算客户did
  settleClientDid?: string;
  // 税金
  taxes?: string;
  // 未税价 业务必填
  untaxedPrice?: string;
  // 确认时间
  confirmTime?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      action: 'action',
      billingNumber: 'billing_number',
      billingType: 'billing_type',
      bkgNo: 'bkg_no',
      bookingNo: 'booking_no',
      currency: 'currency',
      forwarderDid: 'forwarder_did',
      incomeOrExpenses: 'income_or_expenses',
      invoiceUrl: 'invoice_url',
      orderNo: 'order_no',
      priceIncludingTax: 'price_including_tax',
      receiptTariffCode: 'receipt_tariff_code',
      receiptTariffDesc: 'receipt_tariff_desc',
      receiptTariffProject: 'receipt_tariff_project',
      settleClient: 'settle_client',
      settleClientCertNo: 'settle_client_cert_no',
      settleClientDid: 'settle_client_did',
      taxes: 'taxes',
      untaxedPrice: 'untaxed_price',
      confirmTime: 'confirm_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      action: 'string',
      billingNumber: 'string',
      billingType: 'string',
      bkgNo: 'string',
      bookingNo: 'string',
      currency: 'string',
      forwarderDid: 'string',
      incomeOrExpenses: 'string',
      invoiceUrl: 'string',
      orderNo: 'string',
      priceIncludingTax: 'string',
      receiptTariffCode: 'string',
      receiptTariffDesc: 'string',
      receiptTariffProject: 'string',
      settleClient: 'string',
      settleClientCertNo: 'string',
      settleClientDid: 'string',
      taxes: 'string',
      untaxedPrice: 'string',
      confirmTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBillReceiptbilltariffResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyBillPaybillRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 货代did
  forwarderDid: string;
  // 应付资费项编号
  payTariffCode: string;
  // 核销金额 业务必填
  verifyAmount?: string;
  // 核销应付资费项编号
  verifyPayTariffCode: string;
  // 核销状态 WAIT_VERIFY-待核销，PART_VERIFY-部分核销，COMPLETE_VERIFY-完成核销 
  // 业务必填
  verifyStatus?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      action: 'action',
      forwarderDid: 'forwarder_did',
      payTariffCode: 'pay_tariff_code',
      verifyAmount: 'verify_amount',
      verifyPayTariffCode: 'verify_pay_tariff_code',
      verifyStatus: 'verify_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      action: 'string',
      forwarderDid: 'string',
      payTariffCode: 'string',
      verifyAmount: 'string',
      verifyPayTariffCode: 'string',
      verifyStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyBillPaybillResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyBillReceiptbillorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 货代did
  forwarderDid: string;
  // 应收资费项编号
  receiptTariffCode: string;
  // 核销金额 业务必填
  verifyAmount?: string;
  // 核销应收资费项编号
  verifyReceiptTariffCode: string;
  // 核销状态 WAIT_VERIFY-待核销，PART_VERIFY-部分核销，COMPLETE_VERIFY-完成核销 业务必填
  verifyStatus?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      action: 'action',
      forwarderDid: 'forwarder_did',
      receiptTariffCode: 'receipt_tariff_code',
      verifyAmount: 'verify_amount',
      verifyReceiptTariffCode: 'verify_receipt_tariff_code',
      verifyStatus: 'verify_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      action: 'string',
      forwarderDid: 'string',
      receiptTariffCode: 'string',
      verifyAmount: 'string',
      verifyReceiptTariffCode: 'string',
      verifyStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class VerifyBillReceiptbillorderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBillPaybillorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除	
  // 
  action?: string;
  // 申请时间 毫秒值 业务必填
  applyDate?: number;
  // 银行收款账户
  bankReceiptAccount?: string;
  // 币种 业务必填
  currency?: string;
  // 开户行
  depositBank?: string;
  // 账单到期日
  expireDate?: number;
  // 货代did
  forwarderDid: string;
  // 应付总额 业务必填
  payAmount?: string;
  // 付款单编号
  payBillOrderCode: string;
  // 应付账单资费项 业务必填
  payBillTariffParams?: PayBillTariffParam[];
  // 付款公司
  payCompany?: string;
  // 付款公司企业信用号
  payCompanyCertNo?: string;
  // 付款公司did
  payCompanyDid?: string;
  // 付款期限
  payDeadline?: string;
  // 收款客户[业务必填]
  receiptClient?: string;
  // 收款客户企业信用号[业务必填]
  receiptClientCertNo?: string;
  // 收款客户did[业务必填]
  receiptClientDid?: string;
  // 对应应收资费项code
  receiptTariffCodes?: string[];
  // 结算公司
  settleCompany?: string;
  // 结算公司企业信用号
  settleCompanyCertNo?: string;
  // 结算公司did [业务必填]
  settleCompanyDid?: string;
  // 账单结算周期
  settleCycle?: string;
  // 结算状态 ：  SETTLED(已结算) ,  UNSETTLE（未结算）[业务必填]
  settleStatus?: string;
  // 确认时间
  confirmTime?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      action: 'action',
      applyDate: 'apply_date',
      bankReceiptAccount: 'bank_receipt_account',
      currency: 'currency',
      depositBank: 'deposit_bank',
      expireDate: 'expire_date',
      forwarderDid: 'forwarder_did',
      payAmount: 'pay_amount',
      payBillOrderCode: 'pay_bill_order_code',
      payBillTariffParams: 'pay_bill_tariff_params',
      payCompany: 'pay_company',
      payCompanyCertNo: 'pay_company_cert_no',
      payCompanyDid: 'pay_company_did',
      payDeadline: 'pay_deadline',
      receiptClient: 'receipt_client',
      receiptClientCertNo: 'receipt_client_cert_no',
      receiptClientDid: 'receipt_client_did',
      receiptTariffCodes: 'receipt_tariff_codes',
      settleCompany: 'settle_company',
      settleCompanyCertNo: 'settle_company_cert_no',
      settleCompanyDid: 'settle_company_did',
      settleCycle: 'settle_cycle',
      settleStatus: 'settle_status',
      confirmTime: 'confirm_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      action: 'string',
      applyDate: 'number',
      bankReceiptAccount: 'string',
      currency: 'string',
      depositBank: 'string',
      expireDate: 'number',
      forwarderDid: 'string',
      payAmount: 'string',
      payBillOrderCode: 'string',
      payBillTariffParams: { 'type': 'array', 'itemType': PayBillTariffParam },
      payCompany: 'string',
      payCompanyCertNo: 'string',
      payCompanyDid: 'string',
      payDeadline: 'string',
      receiptClient: 'string',
      receiptClientCertNo: 'string',
      receiptClientDid: 'string',
      receiptTariffCodes: { 'type': 'array', 'itemType': 'string' },
      settleCompany: 'string',
      settleCompanyCertNo: 'string',
      settleCompanyDid: 'string',
      settleCycle: 'string',
      settleStatus: 'string',
      confirmTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBillPaybillorderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBillReceiptbillorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除	
  action?: string;
  // 实际收款结算公司
  actualSettleCompany?: string;
  // 实际收款结算公司企业信用号
  actualSettleCompanyCertNo?: string;
  // 实际收款结算公司did [业务必填]
  actualSettleCompanyDid?: string;
  // 确认时间
  applyDate?: number;
  // 揽货类型
  clientType?: string;
  // 币种
  currency?: string;
  // 账单到期日
  expireDate?: number;
  // 货代did
  forwarderDid: string;
  // 开票抬头
  invoiceTitle?: string;
  // 含税价
  priceIncludingTax?: string;
  // 收款账号
  receiptAccount?: string;
  // 收款总额
  receiptAmount?: string;
  // 收款账单编号
  receiptBillOrderCode: string;
  // 应收资费项账单 业务必填
  receiptBillTariffParams?: ReceiptBillTariffParam[];
  // 结算客户名称
  settleClient?: string;
  // 结算客户名称企业信用号
  settleClientCertNo?: string;
  // 结算客户did
  settleClientDid?: string;
  // 结算公司 [业务必填]
  settleCompany?: string;
  // 结算公司企业信用号[业务必填]
  settleCompanyCertNo?: string;
  // 结算公司did[业务必填]
  settleCompanyDid?: string;
  // 账单结算周期
  settleCycle?: string;
  // SETTLED(已结算) UNSETTLE（未结算）[业务必填]
  settleStatus?: string;
  // 税金
  taxes?: string;
  // 未税价
  untaxedPrice?: string;
  // 确认时间
  confirmTime?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      action: 'action',
      actualSettleCompany: 'actual_settle_company',
      actualSettleCompanyCertNo: 'actual_settle_company_cert_no',
      actualSettleCompanyDid: 'actual_settle_company_did',
      applyDate: 'apply_date',
      clientType: 'client_type',
      currency: 'currency',
      expireDate: 'expire_date',
      forwarderDid: 'forwarder_did',
      invoiceTitle: 'invoice_title',
      priceIncludingTax: 'price_including_tax',
      receiptAccount: 'receipt_account',
      receiptAmount: 'receipt_amount',
      receiptBillOrderCode: 'receipt_bill_order_code',
      receiptBillTariffParams: 'receipt_bill_tariff_params',
      settleClient: 'settle_client',
      settleClientCertNo: 'settle_client_cert_no',
      settleClientDid: 'settle_client_did',
      settleCompany: 'settle_company',
      settleCompanyCertNo: 'settle_company_cert_no',
      settleCompanyDid: 'settle_company_did',
      settleCycle: 'settle_cycle',
      settleStatus: 'settle_status',
      taxes: 'taxes',
      untaxedPrice: 'untaxed_price',
      confirmTime: 'confirm_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      action: 'string',
      actualSettleCompany: 'string',
      actualSettleCompanyCertNo: 'string',
      actualSettleCompanyDid: 'string',
      applyDate: 'number',
      clientType: 'string',
      currency: 'string',
      expireDate: 'number',
      forwarderDid: 'string',
      invoiceTitle: 'string',
      priceIncludingTax: 'string',
      receiptAccount: 'string',
      receiptAmount: 'string',
      receiptBillOrderCode: 'string',
      receiptBillTariffParams: { 'type': 'array', 'itemType': ReceiptBillTariffParam },
      settleClient: 'string',
      settleClientCertNo: 'string',
      settleClientDid: 'string',
      settleCompany: 'string',
      settleCompanyCertNo: 'string',
      settleCompanyDid: 'string',
      settleCycle: 'string',
      settleStatus: 'string',
      taxes: 'string',
      untaxedPrice: 'string',
      confirmTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateBillReceiptbillorderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBillPayinvoiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 总金额 业务必填
  amount?: string;
  // 校验码后六位
  checkCode?: string;
  // 币种 CNY/USD [业务必填]
  currency?: string;
  // 美元金额
  dollarAmount?: string;
  // 开票方名称  业务必填
  drawerName?: string;
  // 开票纳税人识别号 业务必填
  drawerTaxpayerCode?: string;
  // 货代did
  forwarderDid: string;
  // 发票唯一标识
  invoiceCode: string;
  // 发票抬头did[业务必填]
  invoiceHeaderDid?: string;
  // 发票抬头企业名称[业务必填]
  invoiceHeaderName?: string;
  // 发票抬头企业信用代码[业务必填]
  invoiceHeaderSocialNo?: string;
  // 发票号码 业务必填
  invoiceNumber?: string;
  // 发票税务号
  invoiceTaxCode?: string;
  // 开票类型 业务必填
  invoiceType?: string;
  // 开票日期 业务必填
  makeInvoiceDate?: number;
  // 账单关联项目
  payBillInvoiceParams?: PayBillInvoiceParam[];
  // 资费项发票 业务必填
  payTariffInvoiceParams?: PayTariffInvoiceParam[];
  // 不含税金额 业务必填
  untaxedPrice?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      action: 'action',
      amount: 'amount',
      checkCode: 'check_code',
      currency: 'currency',
      dollarAmount: 'dollar_amount',
      drawerName: 'drawer_name',
      drawerTaxpayerCode: 'drawer_taxpayer_code',
      forwarderDid: 'forwarder_did',
      invoiceCode: 'invoice_code',
      invoiceHeaderDid: 'invoice_header_did',
      invoiceHeaderName: 'invoice_header_name',
      invoiceHeaderSocialNo: 'invoice_header_social_no',
      invoiceNumber: 'invoice_number',
      invoiceTaxCode: 'invoice_tax_code',
      invoiceType: 'invoice_type',
      makeInvoiceDate: 'make_invoice_date',
      payBillInvoiceParams: 'pay_bill_invoice_params',
      payTariffInvoiceParams: 'pay_tariff_invoice_params',
      untaxedPrice: 'untaxed_price',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      action: 'string',
      amount: 'string',
      checkCode: 'string',
      currency: 'string',
      dollarAmount: 'string',
      drawerName: 'string',
      drawerTaxpayerCode: 'string',
      forwarderDid: 'string',
      invoiceCode: 'string',
      invoiceHeaderDid: 'string',
      invoiceHeaderName: 'string',
      invoiceHeaderSocialNo: 'string',
      invoiceNumber: 'string',
      invoiceTaxCode: 'string',
      invoiceType: 'string',
      makeInvoiceDate: 'number',
      payBillInvoiceParams: { 'type': 'array', 'itemType': PayBillInvoiceParam },
      payTariffInvoiceParams: { 'type': 'array', 'itemType': PayTariffInvoiceParam },
      untaxedPrice: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBillPayinvoiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBillReceiptinvoiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 总金额 业务必填
  amount?: string;
  // 校验码后六位
  checkCode?: string;
  // 开票方名称 业务必填
  drawerName?: string;
  // 开票纳税人识别号 业务必填
  drawerTaxpayerCode?: string;
  // 货代did
  forwarderDid: string;
  // 应收发票唯一标识
  invoiceCode: string;
  // 发票号码 业务必填
  invoiceNumber?: string;
  // 开票类型 业务必填
  invoiceType?: string;
  // 开票日期 毫秒值 业务必填
  makeInvoiceDate?: number;
  // 资费项发票 业务必填
  receiptTariffInvoiceParams?: ReceiptTariffInvoiceParam[];
  // 不含税金额 业务必填
  untaxedPrice?: string;
  // 发票税务号
  invoiceTaxCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      action: 'action',
      amount: 'amount',
      checkCode: 'check_code',
      drawerName: 'drawer_name',
      drawerTaxpayerCode: 'drawer_taxpayer_code',
      forwarderDid: 'forwarder_did',
      invoiceCode: 'invoice_code',
      invoiceNumber: 'invoice_number',
      invoiceType: 'invoice_type',
      makeInvoiceDate: 'make_invoice_date',
      receiptTariffInvoiceParams: 'receipt_tariff_invoice_params',
      untaxedPrice: 'untaxed_price',
      invoiceTaxCode: 'invoice_tax_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      action: 'string',
      amount: 'string',
      checkCode: 'string',
      drawerName: 'string',
      drawerTaxpayerCode: 'string',
      forwarderDid: 'string',
      invoiceCode: 'string',
      invoiceNumber: 'string',
      invoiceType: 'string',
      makeInvoiceDate: 'number',
      receiptTariffInvoiceParams: { 'type': 'array', 'itemType': ReceiptTariffInvoiceParam },
      untaxedPrice: 'string',
      invoiceTaxCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBillReceiptinvoiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadBizFinancingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 融资数据
  financingData: UploadFinancingParam[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      financingData: 'financing_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      financingData: { 'type': 'array', 'itemType': UploadFinancingParam },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadBizFinancingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 上链hash
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadBizOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 船公司did
  carrierDid: string;
  // 尾款金额
  deadlineAmount: string;
  // 货代did
  forwarderDid: string;
  // 订单总额
  orderAmounts: UploadOrderAmount[];
  // 订单booking信息
  orderBookings: UploadOrderBooking[];
  // 订单号
  orderNo: string;
  // 结算did
  settleDid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      carrierDid: 'carrier_did',
      deadlineAmount: 'deadline_amount',
      forwarderDid: 'forwarder_did',
      orderAmounts: 'order_amounts',
      orderBookings: 'order_bookings',
      orderNo: 'order_no',
      settleDid: 'settle_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      carrierDid: 'string',
      deadlineAmount: 'string',
      forwarderDid: 'string',
      orderAmounts: { 'type': 'array', 'itemType': UploadOrderAmount },
      orderBookings: { 'type': 'array', 'itemType': UploadOrderBooking },
      orderNo: 'string',
      settleDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadBizOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 上链hash
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDidCarrierRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 代理did
  agentDid: string;
  // 企业名称
  epCertName: string;
  // 企业证件号
  epCertNo: string;
  // 扩展字段
  extensionInfo?: string;
  // 法人姓名
  legalPersonCertName?: string;
  // 法人身份证
  legalPersonCertNo?: string;
  // 船公司编号
  scac?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      agentDid: 'agent_did',
      epCertName: 'ep_cert_name',
      epCertNo: 'ep_cert_no',
      extensionInfo: 'extension_info',
      legalPersonCertName: 'legal_person_cert_name',
      legalPersonCertNo: 'legal_person_cert_no',
      scac: 'scac',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      agentDid: 'string',
      epCertName: 'string',
      epCertNo: 'string',
      extensionInfo: 'string',
      legalPersonCertName: 'string',
      legalPersonCertNo: 'string',
      scac: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDidCarrierResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 船公司did
  did?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      did: 'did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      did: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthSysForwarderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 客户端id
  clientId: string;
  // 密钥
  clientSecret: string;
  // 货代did
  intRefId: string;
  // For HOME application internal
  tenantId: string;
  // 渠道source
  source: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      clientId: 'client_id',
      clientSecret: 'client_secret',
      intRefId: 'int_ref_id',
      tenantId: 'tenant_id',
      source: 'source',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      clientId: 'string',
      clientSecret: 'string',
      intRefId: 'string',
      tenantId: 'string',
      source: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthSysForwarderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 推送结果
  result?: boolean;
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
      result: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBizMasterblRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 货代did
  forwarderDid: string;
  // master提单号
  masterBlNo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      forwarderDid: 'forwarder_did',
      masterBlNo: 'master_bl_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      forwarderDid: 'string',
      masterBlNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryBizMasterblResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 船公司
  carrier?: string;
  // 收货人
  consignee?: string;
  // 目的地
  deliveryPlace?: string;
  // 卸货港
  dischargePort?: string;
  // 货代did
  forwarderDid?: string;
  // 运费
  freight?: string;
  // 提单货物数据列表
  goodsDtos?: MasterBlGoodsDto[];
  // 起运港
  loadingPort?: string;
  // master提单号
  masterBlNo?: string;
  // 通知方
  notifyParty?: string;
  // 前程运输
  prCarriage?: string;
  // 发货人
  shipper?: string;
  // 航名
  vessel?: string;
  // 航次
  voyage?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      carrier: 'carrier',
      consignee: 'consignee',
      deliveryPlace: 'delivery_place',
      dischargePort: 'discharge_port',
      forwarderDid: 'forwarder_did',
      freight: 'freight',
      goodsDtos: 'goods_dtos',
      loadingPort: 'loading_port',
      masterBlNo: 'master_bl_no',
      notifyParty: 'notify_party',
      prCarriage: 'pr_carriage',
      shipper: 'shipper',
      vessel: 'vessel',
      voyage: 'voyage',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      carrier: 'string',
      consignee: 'string',
      deliveryPlace: 'string',
      dischargePort: 'string',
      forwarderDid: 'string',
      freight: 'string',
      goodsDtos: { 'type': 'array', 'itemType': MasterBlGoodsDto },
      loadingPort: 'string',
      masterBlNo: 'string',
      notifyParty: 'string',
      prCarriage: 'string',
      shipper: 'string',
      vessel: 'string',
      voyage: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBizPayinvoicefileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除，INSERT为新增
  action?: string;
  // 发票文件hash [业务必填]
  fileHash?: string;
  // 发票文件ID [业务必填]
  fileId?: string;
  // 货代DID
  forwarderDid: string;
  // 应付发票code
  invoiceCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      action: 'action',
      fileHash: 'file_hash',
      fileId: 'file_id',
      forwarderDid: 'forwarder_did',
      invoiceCode: 'invoice_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      action: 'string',
      fileHash: 'string',
      fileId: 'string',
      forwarderDid: 'string',
      invoiceCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBizPayinvoicefileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBiznewOrderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 托运订单号
  orderNo: string;
  // 托运人did [业务必填]
  consignorDid?: string;
  // 承运人did [业务必填]
  carrierDid?: string;
  // 订舱单号列表
  bookingInfoList?: BookingNoInfo[];
  // 拖车单号
  vehicleCodeList?: string[];
  // 报关单号
  customsCodeList?: string[];
  // 订单确认 CREATE/FINISH (创建/确认)  [业务必填]
  status?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      consignorDid: 'consignor_did',
      carrierDid: 'carrier_did',
      bookingInfoList: 'booking_info_list',
      vehicleCodeList: 'vehicle_code_list',
      customsCodeList: 'customs_code_list',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      consignorDid: 'string',
      carrierDid: 'string',
      bookingInfoList: { 'type': 'array', 'itemType': BookingNoInfo },
      vehicleCodeList: { 'type': 'array', 'itemType': 'string' },
      customsCodeList: { 'type': 'array', 'itemType': 'string' },
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBiznewOrderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上凭证
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBiznewBookingRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 托运订单号
  // 
  // 
  orderNo: string;
  // 订舱单唯一标识
  bookingNo: string;
  // 订舱号 [业务必填]
  bkgNo?: string;
  // 货代did
  forwarderDid: string;
  // 收货人
  consignee?: string;
  // 船公司 [业务必填]
  carrier?: string;
  // 船名 [业务必填]
  vessel?: string;
  // 航次 [业务必填]
  voyage?: string;
  // 起运港 [业务必填]
  loadingPort?: string;
  // 卸货港 [业务必填]
  dischargePort?: string;
  // 箱型箱量 [业务必填]
  containerTypeInfoList?: ContainerTypeInfo[];
  // 截关时间（秒时间戳）
  customsClearance?: number;
  // 截港时间（秒时间戳）
  cyClosing?: number;
  // 截单时间 (秒时间戳)
  siClosing?: number;
  // 预计船期（秒时间戳）
  etd?: number;
  // 订舱费总金额 [业务必填]
  bkgTotalAmount?: string;
  // 订舱费金额 [业务必填]
  bkgAmount?: string;
  // 港杂费金额 [业务必填]
  portCharges?: string;
  // 币种 CNY/USD [业务必填]
  // 
  // 
  currency?: string;
  // 订单确认 CREATE/FINISH (创建/确认) [业务必填]
  status?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      bookingNo: 'booking_no',
      bkgNo: 'bkg_no',
      forwarderDid: 'forwarder_did',
      consignee: 'consignee',
      carrier: 'carrier',
      vessel: 'vessel',
      voyage: 'voyage',
      loadingPort: 'loading_port',
      dischargePort: 'discharge_port',
      containerTypeInfoList: 'container_type_info_list',
      customsClearance: 'customs_clearance',
      cyClosing: 'cy_closing',
      siClosing: 'si_closing',
      etd: 'etd',
      bkgTotalAmount: 'bkg_total_amount',
      bkgAmount: 'bkg_amount',
      portCharges: 'port_charges',
      currency: 'currency',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      bookingNo: 'string',
      bkgNo: 'string',
      forwarderDid: 'string',
      consignee: 'string',
      carrier: 'string',
      vessel: 'string',
      voyage: 'string',
      loadingPort: 'string',
      dischargePort: 'string',
      containerTypeInfoList: { 'type': 'array', 'itemType': ContainerTypeInfo },
      customsClearance: 'number',
      cyClosing: 'number',
      siClosing: 'number',
      etd: 'number',
      bkgTotalAmount: 'string',
      bkgAmount: 'string',
      portCharges: 'string',
      currency: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBiznewBookingResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上存证
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBiznewVehicleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 托运订单号
  // 
  // 
  orderNo: string;
  // 拖车单号
  // 
  // 
  vehicleCode: string;
  // 货代did
  forwarderDid: string;
  // 拖车总金额 [业务必填]
  vehicleTotalAmount?: string;
  // 拖车运费金额 [业务必填]
  vehicleAmount?: string;
  // 拖车杂费金额 [业务必填]
  vehicleCharges?: string;
  // 币种 [业务必填]
  currency?: string;
  // 箱号箱ID
  // 
  // 
  containerIdInfoList?: ContainerIdInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      vehicleCode: 'vehicle_code',
      forwarderDid: 'forwarder_did',
      vehicleTotalAmount: 'vehicle_total_amount',
      vehicleAmount: 'vehicle_amount',
      vehicleCharges: 'vehicle_charges',
      currency: 'currency',
      containerIdInfoList: 'container_id_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      vehicleCode: 'string',
      forwarderDid: 'string',
      vehicleTotalAmount: 'string',
      vehicleAmount: 'string',
      vehicleCharges: 'string',
      currency: 'string',
      containerIdInfoList: { 'type': 'array', 'itemType': ContainerIdInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBiznewVehicleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上存证
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBiznewCustomsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 托运订单号
  orderNo: string;
  // 报关单号
  // 
  // 
  customsCode: string;
  // 货代did
  forwarderDid: string;
  // 报关代理
  // 
  // 
  broker?: string;
  // 出口人
  exporter?: string;
  // 船名 [业务必填]
  vessel?: string;
  // 航次 [业务必填]
  voyage?: string;
  // 报关状态
  // APPROVED--通关，UNAPPROVED-未通关
  status?: string;
  // 集装箱唯一标识
  containerId?: string;
  // 箱号
  containerNo?: string;
  // 货物名称
  goods?: string;
  // 毛重
  grossWeight?: string;
  // 件数
  packagesNo?: string;
  // 报关总金额 [业务必填]
  customsTotalAmount?: string;
  // 报关运费金额 [业务必填]
  customsAmount?: string;
  // 报关杂费金额 [业务必填]
  customsCharges?: string;
  // 币种 [业务必填]
  currency?: string;
  // 订舱单号列表 [业务必填]
  bookingInfoList?: BookingNoInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      customsCode: 'customs_code',
      forwarderDid: 'forwarder_did',
      broker: 'broker',
      exporter: 'exporter',
      vessel: 'vessel',
      voyage: 'voyage',
      status: 'status',
      containerId: 'container_id',
      containerNo: 'container_no',
      goods: 'goods',
      grossWeight: 'gross_weight',
      packagesNo: 'packages_no',
      customsTotalAmount: 'customs_total_amount',
      customsAmount: 'customs_amount',
      customsCharges: 'customs_charges',
      currency: 'currency',
      bookingInfoList: 'booking_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      customsCode: 'string',
      forwarderDid: 'string',
      broker: 'string',
      exporter: 'string',
      vessel: 'string',
      voyage: 'string',
      status: 'string',
      containerId: 'string',
      containerNo: 'string',
      goods: 'string',
      grossWeight: 'string',
      packagesNo: 'string',
      customsTotalAmount: 'string',
      customsAmount: 'string',
      customsCharges: 'string',
      currency: 'string',
      bookingInfoList: { 'type': 'array', 'itemType': BookingNoInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBiznewCustomsResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上存证
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBiznewMasterRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 托运订单号
  orderNo: string;
  // master提单号或House提单号
  masterBlNo: string;
  // 提单类型  master/house  
  // 
  // 
  type: string;
  // 提单签发单位 [业务必填]
  // 
  // 
  signUnitName?: string;
  // 货代did
  forwarderDid: string;
  // 发货人 [业务必填]
  shipper?: string;
  // 出口人 [业务必填]
  // 
  // 
  consignee?: string;
  // 船公司 [业务必填]
  carrier?: string;
  // 船名 [业务必填]
  vessel?: string;
  // 航次 [业务必填]
  voyage?: string;
  // 起运港 [业务必填]
  loadingPort?: string;
  // 卸货港 [业务必填]
  dischargePort?: string;
  // 目的地 [业务必填]
  deliveryPlace?: string;
  // 开船时间 (秒时间戳)
  onBoardDate?: number;
  // 船状态 ATA （已到港） ，ATD （已离港 ），UNATD （未离港）
  onBoardStatus?: string;
  // 订舱单号列表 [业务必填]
  bookingInfoList?: BookingNoInfo[];
  // 集装箱信息 [业务必填]
  containerInfoList?: ContainerInfo[];
  // 货物列表
  // 
  // 
  goodsInfoList?: GoodsInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      orderNo: 'order_no',
      masterBlNo: 'master_bl_no',
      type: 'type',
      signUnitName: 'sign_unit_name',
      forwarderDid: 'forwarder_did',
      shipper: 'shipper',
      consignee: 'consignee',
      carrier: 'carrier',
      vessel: 'vessel',
      voyage: 'voyage',
      loadingPort: 'loading_port',
      dischargePort: 'discharge_port',
      deliveryPlace: 'delivery_place',
      onBoardDate: 'on_board_date',
      onBoardStatus: 'on_board_status',
      bookingInfoList: 'booking_info_list',
      containerInfoList: 'container_info_list',
      goodsInfoList: 'goods_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      orderNo: 'string',
      masterBlNo: 'string',
      type: 'string',
      signUnitName: 'string',
      forwarderDid: 'string',
      shipper: 'string',
      consignee: 'string',
      carrier: 'string',
      vessel: 'string',
      voyage: 'string',
      loadingPort: 'string',
      dischargePort: 'string',
      deliveryPlace: 'string',
      onBoardDate: 'number',
      onBoardStatus: 'string',
      bookingInfoList: { 'type': 'array', 'itemType': BookingNoInfo },
      containerInfoList: { 'type': 'array', 'itemType': ContainerInfo },
      goodsInfoList: { 'type': 'array', 'itemType': GoodsInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBiznewMasterResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上存证
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBiznewPaybillorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应付账单号
  // 
  // 
  payBillOrderCode: string;
  // 货代did
  forwarderDid: string;
  // 应付方did [业务必填]
  // 
  // 
  settleCompanyDid?: string;
  // 收款方did [业务必填]
  // 
  // 
  receiptClientDid?: string;
  // 付款金额 [业务必填]
  // 
  // 
  payAmount?: string;
  // 申请时间 （秒时间戳） [业务必填]
  // 
  // 
  applyDate?: number;
  // 账单到期时间（秒时间戳） [业务必填]
  expireDate?: number;
  // 账单状态  SETTLED 已结算 UNSETTLE 未结算 (业务必填)
  settleStatus?: string;
  // 应付资费项 (业务必填)
  payTariffList?: PayTariffInfo[];
  // 币种 [业务必填]
  currency?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      payBillOrderCode: 'pay_bill_order_code',
      forwarderDid: 'forwarder_did',
      settleCompanyDid: 'settle_company_did',
      receiptClientDid: 'receipt_client_did',
      payAmount: 'pay_amount',
      applyDate: 'apply_date',
      expireDate: 'expire_date',
      settleStatus: 'settle_status',
      payTariffList: 'pay_tariff_list',
      currency: 'currency',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      payBillOrderCode: 'string',
      forwarderDid: 'string',
      settleCompanyDid: 'string',
      receiptClientDid: 'string',
      payAmount: 'string',
      applyDate: 'number',
      expireDate: 'number',
      settleStatus: 'string',
      payTariffList: { 'type': 'array', 'itemType': PayTariffInfo },
      currency: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBiznewPaybillorderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上存证
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBiznewReceiptbillorderRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 应收账单号
  // 
  // 
  receiptBillOrderCode: string;
  // 货代did
  forwarderDid: string;
  // 应付方did [业务必填]
  // 
  // 
  settleCompanyDid?: string;
  // 收款方did [业务必填]
  // 
  // 
  receiptClientDid?: string;
  // 收款金额 [业务必填]
  // 
  // 
  receiptAmount?: string;
  // 申请时间 (秒时间戳) [业务必填]
  applyDate?: number;
  // 账单到期日 (秒时间戳) [业务必填]
  // 
  // 
  expireDate?: number;
  // 账单状态  SETTLED 已结算 UNSETTLE 未结算  [业务必填]
  settleStatus?: string;
  // 应收资费项 [业务必填]
  // 
  // 
  receiptTariffList?: ReceiptTariffInfo[];
  // 币种 [业务必填]
  currency?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      receiptBillOrderCode: 'receipt_bill_order_code',
      forwarderDid: 'forwarder_did',
      settleCompanyDid: 'settle_company_did',
      receiptClientDid: 'receipt_client_did',
      receiptAmount: 'receipt_amount',
      applyDate: 'apply_date',
      expireDate: 'expire_date',
      settleStatus: 'settle_status',
      receiptTariffList: 'receipt_tariff_list',
      currency: 'currency',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      receiptBillOrderCode: 'string',
      forwarderDid: 'string',
      settleCompanyDid: 'string',
      receiptClientDid: 'string',
      receiptAmount: 'string',
      applyDate: 'number',
      expireDate: 'number',
      settleStatus: 'string',
      receiptTariffList: { 'type': 'array', 'itemType': ReceiptTariffInfo },
      currency: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBiznewReceiptbillorderResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上存证
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBiznewInvoiceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 货代did
  forwarderDid: string;
  // 发票唯一标识
  invoiceCode: string;
  // 发票税务号 [业务必填]
  invoiceTaxCode?: string;
  // 发票号 [业务必填]
  invoiceNumber?: string;
  // 发票类型 [业务必填]
  invoiceType?: string;
  // 开票类型 pay/receipt (应付/应收) [业务必填]
  // 
  // 
  type?: string;
  // 校验码
  // 
  // 
  checkCode?: string;
  // 开票方名称 [业务必填]
  // 
  // 
  drawerName?: string;
  // 开票纳税人识别号 [业务必填]
  // 
  // 
  drawerTaxpayerCode?: string;
  // 受票方企业名称 [业务必填]
  // 
  // 
  invoiceHeaderName?: string;
  // 受票方企业信用证代码 [业务必填]
  // 
  // 
  invoiceHeaderSocialNo?: string;
  // 开票时间 [业务必填]
  // 
  // 
  makeInvoiceDate?: number;
  // 发票金额 [业务必填]
  // 
  // 
  amount?: string;
  // 币种 [业务必填]
  currency?: string;
  // 美元 
  dollarAmount?: string;
  // 不含税金额 [业务必填]
  untaxedPrice?: string;
  // 发票文件ID [业务必填]
  fileId?: string;
  // 发票文件hash [业务必填]
  fileHash?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      forwarderDid: 'forwarder_did',
      invoiceCode: 'invoice_code',
      invoiceTaxCode: 'invoice_tax_code',
      invoiceNumber: 'invoice_number',
      invoiceType: 'invoice_type',
      type: 'type',
      checkCode: 'check_code',
      drawerName: 'drawer_name',
      drawerTaxpayerCode: 'drawer_taxpayer_code',
      invoiceHeaderName: 'invoice_header_name',
      invoiceHeaderSocialNo: 'invoice_header_social_no',
      makeInvoiceDate: 'make_invoice_date',
      amount: 'amount',
      currency: 'currency',
      dollarAmount: 'dollar_amount',
      untaxedPrice: 'untaxed_price',
      fileId: 'file_id',
      fileHash: 'file_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      forwarderDid: 'string',
      invoiceCode: 'string',
      invoiceTaxCode: 'string',
      invoiceNumber: 'string',
      invoiceType: 'string',
      type: 'string',
      checkCode: 'string',
      drawerName: 'string',
      drawerTaxpayerCode: 'string',
      invoiceHeaderName: 'string',
      invoiceHeaderSocialNo: 'string',
      makeInvoiceDate: 'number',
      amount: 'string',
      currency: 'string',
      dollarAmount: 'string',
      untaxedPrice: 'string',
      fileId: 'string',
      fileHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveBiznewInvoiceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链上存证
  txCodes?: TxDto[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      txCodes: 'tx_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      txCodes: { 'type': 'array', 'itemType': TxDto },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadShippingEblRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 船公司名称
  carrierName: string;
  // 收货人did
  consigneeDid: string;
  // 电子提单类型
  eblCategory: string;
  // 电子提单copy文件hash
  eblCopyPdfFileHash: string;
  // copy电子提单pdf文件id
  eblCopyPdfFileId: string;
  // 电子提单编号
  eblNo: string;
  // 电子甜的原文件hash
  eblOriginalPdfFileHash?: string;
  // 原电子提单pdf文件id
  eblOriginalPdfFileId?: string;
  // 议付行did
  negotiatingBankDid: string;
  // 托运人did
  shipperDid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      carrierName: 'carrier_name',
      consigneeDid: 'consignee_did',
      eblCategory: 'ebl_category',
      eblCopyPdfFileHash: 'ebl_copy_pdf_file_hash',
      eblCopyPdfFileId: 'ebl_copy_pdf_file_id',
      eblNo: 'ebl_no',
      eblOriginalPdfFileHash: 'ebl_original_pdf_file_hash',
      eblOriginalPdfFileId: 'ebl_original_pdf_file_id',
      negotiatingBankDid: 'negotiating_bank_did',
      shipperDid: 'shipper_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      carrierName: 'string',
      consigneeDid: 'string',
      eblCategory: 'string',
      eblCopyPdfFileHash: 'string',
      eblCopyPdfFileId: 'string',
      eblNo: 'string',
      eblOriginalPdfFileHash: 'string',
      eblOriginalPdfFileId: 'string',
      negotiatingBankDid: 'string',
      shipperDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadShippingEblResponse extends $tea.Model {
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

export class UploadShippingEblbatchRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 代理人did
  agentDid?: string;
  // 是否为代理操作
  agentFlag: boolean;
  // 格式：carrierName_yyyyMMddHHmmss_5位随机数字；全局唯一
  batchNo: string;
  // 船公司名称
  carrierName: string;
  // 收货人did
  consigneeDid: string;
  // 电子提单类型
  eblCategory: string;
  // 批次下的提单明细
  // 
  // 
  eblDetails: EblDetail[];
  // 议付行did
  negotiatingBankDid: string;
  // 托运人did
  shipperDid: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      agentDid: 'agent_did',
      agentFlag: 'agent_flag',
      batchNo: 'batch_no',
      carrierName: 'carrier_name',
      consigneeDid: 'consignee_did',
      eblCategory: 'ebl_category',
      eblDetails: 'ebl_details',
      negotiatingBankDid: 'negotiating_bank_did',
      shipperDid: 'shipper_did',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      agentDid: 'string',
      agentFlag: 'boolean',
      batchNo: 'string',
      carrierName: 'string',
      consigneeDid: 'string',
      eblCategory: 'string',
      eblDetails: { 'type': 'array', 'itemType': EblDetail },
      negotiatingBankDid: 'string',
      shipperDid: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadShippingEblbatchResponse extends $tea.Model {
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

export class UpdateShippingEblbatchstatusRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 电子提单批次号
  batchNo: string;
  // 批次下的提单状态变更明细
  eblStatusDetails: EblStatusDetail[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      batchNo: 'batch_no',
      eblStatusDetails: 'ebl_status_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      batchNo: 'string',
      eblStatusDetails: { 'type': 'array', 'itemType': EblStatusDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateShippingEblbatchstatusResponse extends $tea.Model {
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
          sdk_version: "1.7.7",
          _prod_code: "SHUZIWULIU",
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
   * Description: 标准化应收账单
   * Summary: 标准化应收账单
   */
  async createReceivableBill(request: CreateReceivableBillRequest): Promise<CreateReceivableBillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createReceivableBillEx(request, headers, runtime);
  }

  /**
   * Description: 标准化应收账单
   * Summary: 标准化应收账单
   */
  async createReceivableBillEx(request: CreateReceivableBillRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateReceivableBillResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateReceivableBillResponse>(await this.doRequest("1.0", "digital.logistic.receivable.bill.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateReceivableBillResponse({}));
  }

  /**
   * Description: 创建凭证
   * Summary: 创建凭证
   */
  async createStandardVoucher(request: CreateStandardVoucherRequest): Promise<CreateStandardVoucherResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createStandardVoucherEx(request, headers, runtime);
  }

  /**
   * Description: 创建凭证
   * Summary: 创建凭证
   */
  async createStandardVoucherEx(request: CreateStandardVoucherRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateStandardVoucherResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateStandardVoucherResponse>(await this.doRequest("1.0", "digital.logistic.standard.voucher.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateStandardVoucherResponse({}));
  }

  /**
   * Description: 无车承运平台为自身申请DIS分布式数字身份
   * Summary: 无车承运平台DIS分布式数字身份申请
   */
  async createPlatformDid(request: CreatePlatformDidRequest): Promise<CreatePlatformDidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createPlatformDidEx(request, headers, runtime);
  }

  /**
   * Description: 无车承运平台为自身申请DIS分布式数字身份
   * Summary: 无车承运平台DIS分布式数字身份申请
   */
  async createPlatformDidEx(request: CreatePlatformDidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreatePlatformDidResponse> {
    Util.validateModel(request);
    return $tea.cast<CreatePlatformDidResponse>(await this.doRequest("1.0", "digital.logistic.platform.did.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreatePlatformDidResponse({}));
  }

  /**
   * Description: 代理申请无车承运平台的DIS分布式数字身份。无车saas平台需要为平台中的各个无车承运平台创建dis时需要使用代理创建的模式为其创建分布式数字身份。代理申请分布式数字身份的前置条件为自身需已有分布式数字身份。
   * Summary: 无车承运平台DIS分布式数字身份代理申请
   */
  async createAgentDid(request: CreateAgentDidRequest): Promise<CreateAgentDidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAgentDidEx(request, headers, runtime);
  }

  /**
   * Description: 代理申请无车承运平台的DIS分布式数字身份。无车saas平台需要为平台中的各个无车承运平台创建dis时需要使用代理创建的模式为其创建分布式数字身份。代理申请分布式数字身份的前置条件为自身需已有分布式数字身份。
   * Summary: 无车承运平台DIS分布式数字身份代理申请
   */
  async createAgentDidEx(request: CreateAgentDidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAgentDidResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAgentDidResponse>(await this.doRequest("1.0", "digital.logistic.agent.did.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAgentDidResponse({}));
  }

  /**
   * Description: 无车承运平台为货主申请联盟中唯一标识货主的DIS分布式数字身份,会对企业信息做核验，同一个企业多次申请dis将会返回相同的分布式数字身份。为货主申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
   * Summary: 货主DIS分布式数字身份申请
   */
  async createConsignorDis(request: CreateConsignorDisRequest): Promise<CreateConsignorDisResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createConsignorDisEx(request, headers, runtime);
  }

  /**
   * Description: 无车承运平台为货主申请联盟中唯一标识货主的DIS分布式数字身份,会对企业信息做核验，同一个企业多次申请dis将会返回相同的分布式数字身份。为货主申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
   * Summary: 货主DIS分布式数字身份申请
   */
  async createConsignorDisEx(request: CreateConsignorDisRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateConsignorDisResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateConsignorDisResponse>(await this.doRequest("1.0", "digital.logistic.consignor.dis.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateConsignorDisResponse({}));
  }

  /**
   * Description: 无车承运平台为司机申请DIS分布式数字身份,会对司机做实人认证，同一个司机多次申请dis会返回相同的分布式数字身份。为司机申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
   * Summary: 司机DIS分布式数字身份申请
   */
  async createDriverDis(request: CreateDriverDisRequest): Promise<CreateDriverDisResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDriverDisEx(request, headers, runtime);
  }

  /**
   * Description: 无车承运平台为司机申请DIS分布式数字身份,会对司机做实人认证，同一个司机多次申请dis会返回相同的分布式数字身份。为司机申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
   * Summary: 司机DIS分布式数字身份申请
   */
  async createDriverDisEx(request: CreateDriverDisRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDriverDisResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDriverDisResponse>(await this.doRequest("1.0", "digital.logistic.driver.dis.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDriverDisResponse({}));
  }

  /**
   * Description: 货源订单创建，货主发货给平台时的订单信息
   * Summary: 货源订单创建
   */
  async createCargoOrder(request: CreateCargoOrderRequest): Promise<CreateCargoOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCargoOrderEx(request, headers, runtime);
  }

  /**
   * Description: 货源订单创建，货主发货给平台时的订单信息
   * Summary: 货源订单创建
   */
  async createCargoOrderEx(request: CreateCargoOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCargoOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCargoOrderResponse>(await this.doRequest("1.0", "digital.logistic.cargo.order.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCargoOrderResponse({}));
  }

  /**
   * Description: 货源支付订单创建,货源订单需存在。
   * Summary: 货源支付订单创建
   */
  async createCargoPay(request: CreateCargoPayRequest): Promise<CreateCargoPayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCargoPayEx(request, headers, runtime);
  }

  /**
   * Description: 货源支付订单创建,货源订单需存在。
   * Summary: 货源支付订单创建
   */
  async createCargoPayEx(request: CreateCargoPayRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCargoPayResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCargoPayResponse>(await this.doRequest("1.0", "digital.logistic.cargo.pay.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCargoPayResponse({}));
  }

  /**
   * Description: 物流平台将运单指派给下游（承运商、司机）时产生
   * Summary: 运单创建
   */
  async createWaybillOrder(request: CreateWaybillOrderRequest): Promise<CreateWaybillOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createWaybillOrderEx(request, headers, runtime);
  }

  /**
   * Description: 物流平台将运单指派给下游（承运商、司机）时产生
   * Summary: 运单创建
   */
  async createWaybillOrderEx(request: CreateWaybillOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateWaybillOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateWaybillOrderResponse>(await this.doRequest("1.0", "digital.logistic.waybill.order.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateWaybillOrderResponse({}));
  }

  /**
   * Description: 创建物流支付订单，运单需已存在并且未结束
   * Summary: 运单支付订单创建
   */
  async createWaybillPay(request: CreateWaybillPayRequest): Promise<CreateWaybillPayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createWaybillPayEx(request, headers, runtime);
  }

  /**
   * Description: 创建物流支付订单，运单需已存在并且未结束
   * Summary: 运单支付订单创建
   */
  async createWaybillPayEx(request: CreateWaybillPayRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateWaybillPayResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateWaybillPayResponse>(await this.doRequest("1.0", "digital.logistic.waybill.pay.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateWaybillPayResponse({}));
  }

  /**
   * Description: 用于上报第三方的轨迹位置信息，运单需已存在并且未结束
   * Summary: 第三方位置信息上报
   */
  async importWaybillLocation(request: ImportWaybillLocationRequest): Promise<ImportWaybillLocationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.importWaybillLocationEx(request, headers, runtime);
  }

  /**
   * Description: 用于上报第三方的轨迹位置信息，运单需已存在并且未结束
   * Summary: 第三方位置信息上报
   */
  async importWaybillLocationEx(request: ImportWaybillLocationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ImportWaybillLocationResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportWaybillLocationResponse>(await this.doRequest("1.0", "digital.logistic.waybill.location.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ImportWaybillLocationResponse({}));
  }

  /**
   * Description: 发票订单创建
   * Summary: 发票订单创建
   */
  async createWaybillBill(request: CreateWaybillBillRequest): Promise<CreateWaybillBillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createWaybillBillEx(request, headers, runtime);
  }

  /**
   * Description: 发票订单创建
   * Summary: 发票订单创建
   */
  async createWaybillBillEx(request: CreateWaybillBillRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateWaybillBillResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateWaybillBillResponse>(await this.doRequest("1.0", "digital.logistic.waybill.bill.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateWaybillBillResponse({}));
  }

  /**
   * Description: 查询物流运单状态
   * Summary: 查询运单状态
   */
  async queryWaybillStatus(request: QueryWaybillStatusRequest): Promise<QueryWaybillStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryWaybillStatusEx(request, headers, runtime);
  }

  /**
   * Description: 查询物流运单状态
   * Summary: 查询运单状态
   */
  async queryWaybillStatusEx(request: QueryWaybillStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryWaybillStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryWaybillStatusResponse>(await this.doRequest("1.0", "digital.logistic.waybill.status.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryWaybillStatusResponse({}));
  }

  /**
   * Description: 运单完成表示整个运单的生命周期结束的最终状态，一般为和司机已进行确认结算后调用
  完成后的运单无法再调用支付订单与轨迹位置上传接口。
   * Summary: 运单完成
   */
  async finishWaybillOrder(request: FinishWaybillOrderRequest): Promise<FinishWaybillOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.finishWaybillOrderEx(request, headers, runtime);
  }

  /**
   * Description: 运单完成表示整个运单的生命周期结束的最终状态，一般为和司机已进行确认结算后调用
  完成后的运单无法再调用支付订单与轨迹位置上传接口。
   * Summary: 运单完成
   */
  async finishWaybillOrderEx(request: FinishWaybillOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<FinishWaybillOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<FinishWaybillOrderResponse>(await this.doRequest("1.0", "digital.logistic.waybill.order.finish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new FinishWaybillOrderResponse({}));
  }

  /**
   * Description: 货源支付订单创建,货源订单需存在。
   * Summary: 货源支付订单创建
   */
  async createCargoPayorder(request: CreateCargoPayorderRequest): Promise<CreateCargoPayorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCargoPayorderEx(request, headers, runtime);
  }

  /**
   * Description: 货源支付订单创建,货源订单需存在。
   * Summary: 货源支付订单创建
   */
  async createCargoPayorderEx(request: CreateCargoPayorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCargoPayorderResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCargoPayorderResponse>(await this.doRequest("1.0", "digital.logistic.cargo.payorder.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCargoPayorderResponse({}));
  }

  /**
   * Description: 当货物到达目的地时，调用此接口
   * Summary: 运单运输完成
   */
  async saveWaybillOrder(request: SaveWaybillOrderRequest): Promise<SaveWaybillOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveWaybillOrderEx(request, headers, runtime);
  }

  /**
   * Description: 当货物到达目的地时，调用此接口
   * Summary: 运单运输完成
   */
  async saveWaybillOrderEx(request: SaveWaybillOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveWaybillOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveWaybillOrderResponse>(await this.doRequest("1.0", "digital.logistic.waybill.order.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveWaybillOrderResponse({}));
  }

  /**
   * Description: 运单关闭
   * Summary: 运单关闭
   */
  async closeWaybillOrder(request: CloseWaybillOrderRequest): Promise<CloseWaybillOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.closeWaybillOrderEx(request, headers, runtime);
  }

  /**
   * Description: 运单关闭
   * Summary: 运单关闭
   */
  async closeWaybillOrderEx(request: CloseWaybillOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CloseWaybillOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<CloseWaybillOrderResponse>(await this.doRequest("1.0", "digital.logistic.waybill.order.close", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CloseWaybillOrderResponse({}));
  }

  /**
   * Description: 完成物流运单
   * Summary: 完成物流运单
   */
  async finishFinanceWaybill(request: FinishFinanceWaybillRequest): Promise<FinishFinanceWaybillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.finishFinanceWaybillEx(request, headers, runtime);
  }

  /**
   * Description: 完成物流运单
   * Summary: 完成物流运单
   */
  async finishFinanceWaybillEx(request: FinishFinanceWaybillRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<FinishFinanceWaybillResponse> {
    Util.validateModel(request);
    return $tea.cast<FinishFinanceWaybillResponse>(await this.doRequest("1.0", "digital.logistic.finance.waybill.finish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new FinishFinanceWaybillResponse({}));
  }

  /**
   * Description: 运输完成
   * Summary: 运输完成
   */
  async finishFinanceTransport(request: FinishFinanceTransportRequest): Promise<FinishFinanceTransportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.finishFinanceTransportEx(request, headers, runtime);
  }

  /**
   * Description: 运输完成
   * Summary: 运输完成
   */
  async finishFinanceTransportEx(request: FinishFinanceTransportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<FinishFinanceTransportResponse> {
    Util.validateModel(request);
    return $tea.cast<FinishFinanceTransportResponse>(await this.doRequest("1.0", "digital.logistic.finance.transport.finish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new FinishFinanceTransportResponse({}));
  }

  /**
   * Description: 对运单信息项需更新时调用
   * Summary: 更新运单
   */
  async updateFinanceWaybill(request: UpdateFinanceWaybillRequest): Promise<UpdateFinanceWaybillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateFinanceWaybillEx(request, headers, runtime);
  }

  /**
   * Description: 对运单信息项需更新时调用
   * Summary: 更新运单
   */
  async updateFinanceWaybillEx(request: UpdateFinanceWaybillRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateFinanceWaybillResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateFinanceWaybillResponse>(await this.doRequest("1.0", "digital.logistic.finance.waybill.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateFinanceWaybillResponse({}));
  }

  /**
   * Description: 当司机到达货主装货地后，调用此接口
   * Summary: 起运运单
   */
  async startFinanceWaybill(request: StartFinanceWaybillRequest): Promise<StartFinanceWaybillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.startFinanceWaybillEx(request, headers, runtime);
  }

  /**
   * Description: 当司机到达货主装货地后，调用此接口
   * Summary: 起运运单
   */
  async startFinanceWaybillEx(request: StartFinanceWaybillRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<StartFinanceWaybillResponse> {
    Util.validateModel(request);
    return $tea.cast<StartFinanceWaybillResponse>(await this.doRequest("1.0", "digital.logistic.finance.waybill.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new StartFinanceWaybillResponse({}));
  }

  /**
   * Description: 创建承运商账户
   * Summary: 创建承运商账户
   */
  async createCaptainDis(request: CreateCaptainDisRequest): Promise<CreateCaptainDisResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCaptainDisEx(request, headers, runtime);
  }

  /**
   * Description: 创建承运商账户
   * Summary: 创建承运商账户
   */
  async createCaptainDisEx(request: CreateCaptainDisRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCaptainDisResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCaptainDisResponse>(await this.doRequest("1.0", "digital.logistic.captain.dis.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCaptainDisResponse({}));
  }

  /**
   * Description: 创建货主账单
   * Summary: 货主账单创建
   */
  async createCargowaybillBill(request: CreateCargowaybillBillRequest): Promise<CreateCargowaybillBillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCargowaybillBillEx(request, headers, runtime);
  }

  /**
   * Description: 创建货主账单
   * Summary: 货主账单创建
   */
  async createCargowaybillBillEx(request: CreateCargowaybillBillRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCargowaybillBillResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCargowaybillBillResponse>(await this.doRequest("1.0", "digital.logistic.cargowaybill.bill.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCargowaybillBillResponse({}));
  }

  /**
   * Description: 确认货主账单
   * Summary: 货主账单确认
   */
  async confirmCargowaybillBill(request: ConfirmCargowaybillBillRequest): Promise<ConfirmCargowaybillBillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmCargowaybillBillEx(request, headers, runtime);
  }

  /**
   * Description: 确认货主账单
   * Summary: 货主账单确认
   */
  async confirmCargowaybillBillEx(request: ConfirmCargowaybillBillRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmCargowaybillBillResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmCargowaybillBillResponse>(await this.doRequest("1.0", "digital.logistic.cargowaybill.bill.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmCargowaybillBillResponse({}));
  }

  /**
   * Description: 结算货主账单
   * Summary: 货主账单结算
   */
  async createCargowaybillBillsettle(request: CreateCargowaybillBillsettleRequest): Promise<CreateCargowaybillBillsettleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCargowaybillBillsettleEx(request, headers, runtime);
  }

  /**
   * Description: 结算货主账单
   * Summary: 货主账单结算
   */
  async createCargowaybillBillsettleEx(request: CreateCargowaybillBillsettleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCargowaybillBillsettleResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCargowaybillBillsettleResponse>(await this.doRequest("1.0", "digital.logistic.cargowaybill.billsettle.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCargowaybillBillsettleResponse({}));
  }

  /**
   * Description: 运单平台did更新
   * Summary: 运单平台did更新
   */
  async updateWaybillorderPlatformdid(request: UpdateWaybillorderPlatformdidRequest): Promise<UpdateWaybillorderPlatformdidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateWaybillorderPlatformdidEx(request, headers, runtime);
  }

  /**
   * Description: 运单平台did更新
   * Summary: 运单平台did更新
   */
  async updateWaybillorderPlatformdidEx(request: UpdateWaybillorderPlatformdidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateWaybillorderPlatformdidResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateWaybillorderPlatformdidResponse>(await this.doRequest("1.0", "digital.logistic.waybillorder.platformdid.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateWaybillorderPlatformdidResponse({}));
  }

  /**
   * Description: 更新货主账单
   * Summary: 货主账单更新
   */
  async updateCargowaybillBill(request: UpdateCargowaybillBillRequest): Promise<UpdateCargowaybillBillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateCargowaybillBillEx(request, headers, runtime);
  }

  /**
   * Description: 更新货主账单
   * Summary: 货主账单更新
   */
  async updateCargowaybillBillEx(request: UpdateCargowaybillBillRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateCargowaybillBillResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateCargowaybillBillResponse>(await this.doRequest("1.0", "digital.logistic.cargowaybill.bill.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateCargowaybillBillResponse({}));
  }

  /**
   * Description: 分布式申请did账户集合，可通过此接口申请个人类型角色为货主、承运商、司机的分布式数字身份did；可申请企业类型角色为货主、网络货运平台、道路运输企业/3pl、承运商、子平台的分布式数字身份did。注：接口可允许多次调用，但每次调用只允许申请一个角色，不允许一次调用申请多个角色
   * Summary: 分布式数字身份申请did集合
   */
  async createDisDid(request: CreateDisDidRequest): Promise<CreateDisDidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDisDidEx(request, headers, runtime);
  }

  /**
   * Description: 分布式申请did账户集合，可通过此接口申请个人类型角色为货主、承运商、司机的分布式数字身份did；可申请企业类型角色为货主、网络货运平台、道路运输企业/3pl、承运商、子平台的分布式数字身份did。注：接口可允许多次调用，但每次调用只允许申请一个角色，不允许一次调用申请多个角色
   * Summary: 分布式数字身份申请did集合
   */
  async createDisDidEx(request: CreateDisDidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDisDidResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDisDidResponse>(await this.doRequest("1.0", "digital.logistic.dis.did.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDisDidResponse({}));
  }

  /**
   * Description: 3PL运输合同上传
   * Summary: 3PL运输合同上传
   */
  async uploadTransportContract(request: UploadTransportContractRequest): Promise<UploadTransportContractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadTransportContractEx(request, headers, runtime);
  }

  /**
   * Description: 3PL运输合同上传
   * Summary: 3PL运输合同上传
   */
  async uploadTransportContractEx(request: UploadTransportContractRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadTransportContractResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadTransportContractResponse>(await this.doRequest("1.0", "digital.logistic.transport.contract.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadTransportContractResponse({}));
  }

  /**
   * Description: 3PL运输线路上传
   * Summary: 3PL运输线路上传
   */
  async uploadTransportRoute(request: UploadTransportRouteRequest): Promise<UploadTransportRouteResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadTransportRouteEx(request, headers, runtime);
  }

  /**
   * Description: 3PL运输线路上传
   * Summary: 3PL运输线路上传
   */
  async uploadTransportRouteEx(request: UploadTransportRouteRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadTransportRouteResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadTransportRouteResponse>(await this.doRequest("1.0", "digital.logistic.transport.route.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadTransportRouteResponse({}));
  }

  /**
   * Description: 3PL运单创建
   * Summary: 3PL运单创建
   */
  async createTransportWaybill(request: CreateTransportWaybillRequest): Promise<CreateTransportWaybillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createTransportWaybillEx(request, headers, runtime);
  }

  /**
   * Description: 3PL运单创建
   * Summary: 3PL运单创建
   */
  async createTransportWaybillEx(request: CreateTransportWaybillRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateTransportWaybillResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTransportWaybillResponse>(await this.doRequest("1.0", "digital.logistic.transport.waybill.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateTransportWaybillResponse({}));
  }

  /**
   * Description: 3PL运单状态更新
   * Summary: 3PL运单状态更新
   */
  async updateWaybillAction(request: UpdateWaybillActionRequest): Promise<UpdateWaybillActionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateWaybillActionEx(request, headers, runtime);
  }

  /**
   * Description: 3PL运单状态更新
   * Summary: 3PL运单状态更新
   */
  async updateWaybillActionEx(request: UpdateWaybillActionRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateWaybillActionResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateWaybillActionResponse>(await this.doRequest("1.0", "digital.logistic.waybill.action.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateWaybillActionResponse({}));
  }

  /**
   * Description: 3PL运单修改
   * Summary: 3PL运单修改
   */
  async updateTransportWaybill(request: UpdateTransportWaybillRequest): Promise<UpdateTransportWaybillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateTransportWaybillEx(request, headers, runtime);
  }

  /**
   * Description: 3PL运单修改
   * Summary: 3PL运单修改
   */
  async updateTransportWaybillEx(request: UpdateTransportWaybillRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateTransportWaybillResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateTransportWaybillResponse>(await this.doRequest("1.0", "digital.logistic.transport.waybill.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateTransportWaybillResponse({}));
  }

  /**
   * Description: 3PL回单上传
   * Summary: 3PL回单上传
   */
  async uploadTransportReceipt(request: UploadTransportReceiptRequest): Promise<UploadTransportReceiptResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadTransportReceiptEx(request, headers, runtime);
  }

  /**
   * Description: 3PL回单上传
   * Summary: 3PL回单上传
   */
  async uploadTransportReceiptEx(request: UploadTransportReceiptRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadTransportReceiptResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadTransportReceiptResponse>(await this.doRequest("1.0", "digital.logistic.transport.receipt.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadTransportReceiptResponse({}));
  }

  /**
   * Description: 应收账单创建
   * Summary: 应收账单创建
   */
  async createBillReceivablebill(request: CreateBillReceivablebillRequest): Promise<CreateBillReceivablebillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBillReceivablebillEx(request, headers, runtime);
  }

  /**
   * Description: 应收账单创建
   * Summary: 应收账单创建
   */
  async createBillReceivablebillEx(request: CreateBillReceivablebillRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBillReceivablebillResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBillReceivablebillResponse>(await this.doRequest("1.0", "digital.logistic.bill.receivablebill.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBillReceivablebillResponse({}));
  }

  /**
   * Description: 应收账单状态更新
   * Summary: 应收账单状态更新
   */
  async updateReceivablebillStatus(request: UpdateReceivablebillStatusRequest): Promise<UpdateReceivablebillStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateReceivablebillStatusEx(request, headers, runtime);
  }

  /**
   * Description: 应收账单状态更新
   * Summary: 应收账单状态更新
   */
  async updateReceivablebillStatusEx(request: UpdateReceivablebillStatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateReceivablebillStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateReceivablebillStatusResponse>(await this.doRequest("1.0", "digital.logistic.receivablebill.status.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateReceivablebillStatusResponse({}));
  }

  /**
   * Description: 应收账单修改
   * Summary: 应收账单修改
   */
  async updateBillReceivablebill(request: UpdateBillReceivablebillRequest): Promise<UpdateBillReceivablebillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateBillReceivablebillEx(request, headers, runtime);
  }

  /**
   * Description: 应收账单修改
   * Summary: 应收账单修改
   */
  async updateBillReceivablebillEx(request: UpdateBillReceivablebillRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateBillReceivablebillResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBillReceivablebillResponse>(await this.doRequest("1.0", "digital.logistic.bill.receivablebill.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateBillReceivablebillResponse({}));
  }

  /**
   * Description: 路运发票创建
   * Summary: 路运发票创建
   */
  async createHighwayInvoice(request: CreateHighwayInvoiceRequest): Promise<CreateHighwayInvoiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createHighwayInvoiceEx(request, headers, runtime);
  }

  /**
   * Description: 路运发票创建
   * Summary: 路运发票创建
   */
  async createHighwayInvoiceEx(request: CreateHighwayInvoiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateHighwayInvoiceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateHighwayInvoiceResponse>(await this.doRequest("1.0", "digital.logistic.highway.invoice.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateHighwayInvoiceResponse({}));
  }

  /**
   * Description: 查询运单信息
   * Summary: 运单信息查询
   */
  async queryWaybillInfo(request: QueryWaybillInfoRequest): Promise<QueryWaybillInfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryWaybillInfoEx(request, headers, runtime);
  }

  /**
   * Description: 查询运单信息
   * Summary: 运单信息查询
   */
  async queryWaybillInfoEx(request: QueryWaybillInfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryWaybillInfoResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryWaybillInfoResponse>(await this.doRequest("1.0", "digital.logistic.waybill.info.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryWaybillInfoResponse({}));
  }

  /**
   * Description: 应收账单创建无明细版
   * Summary: 应收账单创建无明细版
   */
  async createBillReceivablebillnodetail(request: CreateBillReceivablebillnodetailRequest): Promise<CreateBillReceivablebillnodetailResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBillReceivablebillnodetailEx(request, headers, runtime);
  }

  /**
   * Description: 应收账单创建无明细版
   * Summary: 应收账单创建无明细版
   */
  async createBillReceivablebillnodetailEx(request: CreateBillReceivablebillnodetailRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBillReceivablebillnodetailResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBillReceivablebillnodetailResponse>(await this.doRequest("1.0", "digital.logistic.bill.receivablebillnodetail.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBillReceivablebillnodetailResponse({}));
  }

  /**
   * Description: 企业信息上传/更新
   * Summary: 企业信息上传/更新
   */
  async saveTrailerCorp(request: SaveTrailerCorpRequest): Promise<SaveTrailerCorpResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveTrailerCorpEx(request, headers, runtime);
  }

  /**
   * Description: 企业信息上传/更新
   * Summary: 企业信息上传/更新
   */
  async saveTrailerCorpEx(request: SaveTrailerCorpRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveTrailerCorpResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveTrailerCorpResponse>(await this.doRequest("1.0", "digital.logistic.trailer.corp.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveTrailerCorpResponse({}));
  }

  /**
   * Description: 企业运营数据上传/更新
   * Summary: 企业运营数据上传/更新
   */
  async saveTrailerTransport(request: SaveTrailerTransportRequest): Promise<SaveTrailerTransportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveTrailerTransportEx(request, headers, runtime);
  }

  /**
   * Description: 企业运营数据上传/更新
   * Summary: 企业运营数据上传/更新
   */
  async saveTrailerTransportEx(request: SaveTrailerTransportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveTrailerTransportResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveTrailerTransportResponse>(await this.doRequest("1.0", "digital.logistic.trailer.transport.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveTrailerTransportResponse({}));
  }

  /**
   * Description: 根据实例id，查询实例状态
   * Summary: 实例状态查询
   */
  async queryBusinessInstancestatus(request: QueryBusinessInstancestatusRequest): Promise<QueryBusinessInstancestatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBusinessInstancestatusEx(request, headers, runtime);
  }

  /**
   * Description: 根据实例id，查询实例状态
   * Summary: 实例状态查询
   */
  async queryBusinessInstancestatusEx(request: QueryBusinessInstancestatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBusinessInstancestatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBusinessInstancestatusResponse>(await this.doRequest("1.0", "digital.logistic.business.instancestatus.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBusinessInstancestatusResponse({}));
  }

  /**
   * Description: 司机信用流转协议签署并开通流转能力
   * Summary: 司机信用流转协议签署并开通流转能力
   */
  async openCreditDriver(request: OpenCreditDriverRequest): Promise<OpenCreditDriverResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.openCreditDriverEx(request, headers, runtime);
  }

  /**
   * Description: 司机信用流转协议签署并开通流转能力
   * Summary: 司机信用流转协议签署并开通流转能力
   */
  async openCreditDriverEx(request: OpenCreditDriverRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<OpenCreditDriverResponse> {
    Util.validateModel(request);
    return $tea.cast<OpenCreditDriverResponse>(await this.doRequest("1.0", "digital.logistic.credit.driver.open", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new OpenCreditDriverResponse({}));
  }

  /**
   * Description: 查询司机信用流转能力开通情况
   * Summary: 查询司机信用流转能力开通情况
   */
  async queryCreditDriver(request: QueryCreditDriverRequest): Promise<QueryCreditDriverResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCreditDriverEx(request, headers, runtime);
  }

  /**
   * Description: 查询司机信用流转能力开通情况
   * Summary: 查询司机信用流转能力开通情况
   */
  async queryCreditDriverEx(request: QueryCreditDriverRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCreditDriverResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCreditDriverResponse>(await this.doRequest("1.0", "digital.logistic.credit.driver.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCreditDriverResponse({}));
  }

  /**
   * Description: 查询货主信用流转能力开通情况
   * Summary: 查询货主信用流转能力开通情况
   */
  async queryCreditConsignor(request: QueryCreditConsignorRequest): Promise<QueryCreditConsignorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCreditConsignorEx(request, headers, runtime);
  }

  /**
   * Description: 查询货主信用流转能力开通情况
   * Summary: 查询货主信用流转能力开通情况
   */
  async queryCreditConsignorEx(request: QueryCreditConsignorRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCreditConsignorResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCreditConsignorResponse>(await this.doRequest("1.0", "digital.logistic.credit.consignor.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCreditConsignorResponse({}));
  }

  /**
   * Description: 查询货主信用流转额度
   * Summary: 查询货主信用流转额度
   */
  async queryCreditBalance(request: QueryCreditBalanceRequest): Promise<QueryCreditBalanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCreditBalanceEx(request, headers, runtime);
  }

  /**
   * Description: 查询货主信用流转额度
   * Summary: 查询货主信用流转额度
   */
  async queryCreditBalanceEx(request: QueryCreditBalanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCreditBalanceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCreditBalanceResponse>(await this.doRequest("1.0", "digital.logistic.credit.balance.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCreditBalanceResponse({}));
  }

  /**
   * Description: 发行信用流转批次信息上传（只做信息上传，供真正web端发行时使用）
   * Summary: 发行信用流转批次信息上传
   */
  async uploadCreditIssue(request: UploadCreditIssueRequest): Promise<UploadCreditIssueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadCreditIssueEx(request, headers, runtime);
  }

  /**
   * Description: 发行信用流转批次信息上传（只做信息上传，供真正web端发行时使用）
   * Summary: 发行信用流转批次信息上传
   */
  async uploadCreditIssueEx(request: UploadCreditIssueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadCreditIssueResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadCreditIssueResponse>(await this.doRequest("1.0", "digital.logistic.credit.issue.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadCreditIssueResponse({}));
  }

  /**
   * Description: 信用流转批次状态查询
   * Summary: 信用流转批次状态查询
   */
  async queryCreditIssuebatchstatus(request: QueryCreditIssuebatchstatusRequest): Promise<QueryCreditIssuebatchstatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCreditIssuebatchstatusEx(request, headers, runtime);
  }

  /**
   * Description: 信用流转批次状态查询
   * Summary: 信用流转批次状态查询
   */
  async queryCreditIssuebatchstatusEx(request: QueryCreditIssuebatchstatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCreditIssuebatchstatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCreditIssuebatchstatusResponse>(await this.doRequest("1.0", "digital.logistic.credit.issuebatchstatus.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCreditIssuebatchstatusResponse({}));
  }

  /**
   * Description: 支付批次撤销
   * Summary: 支付批次撤销
   */
  async cancelCreditIssuebatch(request: CancelCreditIssuebatchRequest): Promise<CancelCreditIssuebatchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelCreditIssuebatchEx(request, headers, runtime);
  }

  /**
   * Description: 支付批次撤销
   * Summary: 支付批次撤销
   */
  async cancelCreditIssuebatchEx(request: CancelCreditIssuebatchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelCreditIssuebatchResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelCreditIssuebatchResponse>(await this.doRequest("1.0", "digital.logistic.credit.issuebatch.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelCreditIssuebatchResponse({}));
  }

  /**
   * Description: 根据id查询信用凭证信息
   * Summary: 根据id查询信用凭证信息
   */
  async queryCreditIssuebyid(request: QueryCreditIssuebyidRequest): Promise<QueryCreditIssuebyidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCreditIssuebyidEx(request, headers, runtime);
  }

  /**
   * Description: 根据id查询信用凭证信息
   * Summary: 根据id查询信用凭证信息
   */
  async queryCreditIssuebyidEx(request: QueryCreditIssuebyidRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCreditIssuebyidResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCreditIssuebyidResponse>(await this.doRequest("1.0", "digital.logistic.credit.issuebyid.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCreditIssuebyidResponse({}));
  }

  /**
   * Description: 根据时间查询信用凭证信息
   * Summary: 根据时间查询信用凭证信息
   */
  async queryCreditIssuebytime(request: QueryCreditIssuebytimeRequest): Promise<QueryCreditIssuebytimeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCreditIssuebytimeEx(request, headers, runtime);
  }

  /**
   * Description: 根据时间查询信用凭证信息
   * Summary: 根据时间查询信用凭证信息
   */
  async queryCreditIssuebytimeEx(request: QueryCreditIssuebytimeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCreditIssuebytimeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCreditIssuebytimeResponse>(await this.doRequest("1.0", "digital.logistic.credit.issuebytime.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCreditIssuebytimeResponse({}));
  }

  /**
   * Description: 查询用户持有的信用凭证信息
   * Summary: 查询用户持有的信用凭证信息
   */
  async queryCreditUserissue(request: QueryCreditUserissueRequest): Promise<QueryCreditUserissueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCreditUserissueEx(request, headers, runtime);
  }

  /**
   * Description: 查询用户持有的信用凭证信息
   * Summary: 查询用户持有的信用凭证信息
   */
  async queryCreditUserissueEx(request: QueryCreditUserissueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCreditUserissueResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCreditUserissueResponse>(await this.doRequest("1.0", "digital.logistic.credit.userissue.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCreditUserissueResponse({}));
  }

  /**
   * Description: 查询用户信用流转流水记录
   * Summary: 查询用户信用流转流水记录
   */
  async queryCreditStatement(request: QueryCreditStatementRequest): Promise<QueryCreditStatementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCreditStatementEx(request, headers, runtime);
  }

  /**
   * Description: 查询用户信用流转流水记录
   * Summary: 查询用户信用流转流水记录
   */
  async queryCreditStatementEx(request: QueryCreditStatementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCreditStatementResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCreditStatementResponse>(await this.doRequest("1.0", "digital.logistic.credit.statement.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCreditStatementResponse({}));
  }

  /**
   * Description: 信用凭证拆分转让申请
   * Summary: 信用凭证拆分转让申请
   */
  async createCreditIssuetransfer(request: CreateCreditIssuetransferRequest): Promise<CreateCreditIssuetransferResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCreditIssuetransferEx(request, headers, runtime);
  }

  /**
   * Description: 信用凭证拆分转让申请
   * Summary: 信用凭证拆分转让申请
   */
  async createCreditIssuetransferEx(request: CreateCreditIssuetransferRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCreditIssuetransferResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCreditIssuetransferResponse>(await this.doRequest("1.0", "digital.logistic.credit.issuetransfer.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCreditIssuetransferResponse({}));
  }

  /**
   * Description: 信用凭证拆分转让结果查询
   * Summary: 信用凭证拆分转让结果查询
   */
  async queryCreditIssuetransfer(request: QueryCreditIssuetransferRequest): Promise<QueryCreditIssuetransferResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCreditIssuetransferEx(request, headers, runtime);
  }

  /**
   * Description: 信用凭证拆分转让结果查询
   * Summary: 信用凭证拆分转让结果查询
   */
  async queryCreditIssuetransferEx(request: QueryCreditIssuetransferRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCreditIssuetransferResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCreditIssuetransferResponse>(await this.doRequest("1.0", "digital.logistic.credit.issuetransfer.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCreditIssuetransferResponse({}));
  }

  /**
   * Description: 信用凭证融资申请
   * Summary: 信用凭证融资申请
   */
  async createCreditIssuefinance(request: CreateCreditIssuefinanceRequest): Promise<CreateCreditIssuefinanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCreditIssuefinanceEx(request, headers, runtime);
  }

  /**
   * Description: 信用凭证融资申请
   * Summary: 信用凭证融资申请
   */
  async createCreditIssuefinanceEx(request: CreateCreditIssuefinanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCreditIssuefinanceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCreditIssuefinanceResponse>(await this.doRequest("1.0", "digital.logistic.credit.issuefinance.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCreditIssuefinanceResponse({}));
  }

  /**
   * Description: 信用凭证融资结果查询
   * Summary: 信用凭证融资结果查询
   */
  async queryCreditIssuefinance(request: QueryCreditIssuefinanceRequest): Promise<QueryCreditIssuefinanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCreditIssuefinanceEx(request, headers, runtime);
  }

  /**
   * Description: 信用凭证融资结果查询
   * Summary: 信用凭证融资结果查询
   */
  async queryCreditIssuefinanceEx(request: QueryCreditIssuefinanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCreditIssuefinanceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCreditIssuefinanceResponse>(await this.doRequest("1.0", "digital.logistic.credit.issuefinance.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCreditIssuefinanceResponse({}));
  }

  /**
   * Description: 信用凭证清分信息查询
   * Summary: 信用凭证清分信息查询
   */
  async queryCreditIssuereceivable(request: QueryCreditIssuereceivableRequest): Promise<QueryCreditIssuereceivableResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCreditIssuereceivableEx(request, headers, runtime);
  }

  /**
   * Description: 信用凭证清分信息查询
   * Summary: 信用凭证清分信息查询
   */
  async queryCreditIssuereceivableEx(request: QueryCreditIssuereceivableRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCreditIssuereceivableResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCreditIssuereceivableResponse>(await this.doRequest("1.0", "digital.logistic.credit.issuereceivable.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCreditIssuereceivableResponse({}));
  }

  /**
   * Description: 信用凭证资产查询
   * Summary: 信用凭证资产查询
   */
  async queryCreditIssueamount(request: QueryCreditIssueamountRequest): Promise<QueryCreditIssueamountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCreditIssueamountEx(request, headers, runtime);
  }

  /**
   * Description: 信用凭证资产查询
   * Summary: 信用凭证资产查询
   */
  async queryCreditIssueamountEx(request: QueryCreditIssueamountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCreditIssueamountResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCreditIssueamountResponse>(await this.doRequest("1.0", "digital.logistic.credit.issueamount.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCreditIssueamountResponse({}));
  }

  /**
   * Description: 物流金融统一回调接口
   * Summary: 物流金融统一回调接口
   */
  async callbackCreditCommon(request: CallbackCreditCommonRequest): Promise<CallbackCreditCommonResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackCreditCommonEx(request, headers, runtime);
  }

  /**
   * Description: 物流金融统一回调接口
   * Summary: 物流金融统一回调接口
   */
  async callbackCreditCommonEx(request: CallbackCreditCommonRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackCreditCommonResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackCreditCommonResponse>(await this.doRequest("1.0", "digital.logistic.credit.common.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackCreditCommonResponse({}));
  }

  /**
   * Description: 信用凭证主动清分
   * Summary: 信用凭证主动清分
   */
  async applyCreditIssueclear(request: ApplyCreditIssueclearRequest): Promise<ApplyCreditIssueclearResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyCreditIssueclearEx(request, headers, runtime);
  }

  /**
   * Description: 信用凭证主动清分
   * Summary: 信用凭证主动清分
   */
  async applyCreditIssueclearEx(request: ApplyCreditIssueclearRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyCreditIssueclearResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyCreditIssueclearResponse>(await this.doRequest("1.0", "digital.logistic.credit.issueclear.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyCreditIssueclearResponse({}));
  }

  /**
   * Description: 物流金融代理消息
   * Summary: 物流金融代理消息
   */
  async sendCreditProxy(request: SendCreditProxyRequest): Promise<SendCreditProxyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.sendCreditProxyEx(request, headers, runtime);
  }

  /**
   * Description: 物流金融代理消息
   * Summary: 物流金融代理消息
   */
  async sendCreditProxyEx(request: SendCreditProxyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SendCreditProxyResponse> {
    Util.validateModel(request);
    return $tea.cast<SendCreditProxyResponse>(await this.doRequest("1.0", "digital.logistic.credit.proxy.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SendCreditProxyResponse({}));
  }

  /**
   * Description: 运单信用流转核验结果查询
   * Summary: 运单信用流转核验结果查询
   */
  async checkCreditWaybill(request: CheckCreditWaybillRequest): Promise<CheckCreditWaybillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkCreditWaybillEx(request, headers, runtime);
  }

  /**
   * Description: 运单信用流转核验结果查询
   * Summary: 运单信用流转核验结果查询
   */
  async checkCreditWaybillEx(request: CheckCreditWaybillRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckCreditWaybillResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckCreditWaybillResponse>(await this.doRequest("1.0", "digital.logistic.credit.waybill.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckCreditWaybillResponse({}));
  }

  /**
   * Description: 物流金融信用流转司机换绑
   * Summary: 物流金融信用流转司机换绑
   */
  async reopenCreditDriver(request: ReopenCreditDriverRequest): Promise<ReopenCreditDriverResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.reopenCreditDriverEx(request, headers, runtime);
  }

  /**
   * Description: 物流金融信用流转司机换绑
   * Summary: 物流金融信用流转司机换绑
   */
  async reopenCreditDriverEx(request: ReopenCreditDriverRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReopenCreditDriverResponse> {
    Util.validateModel(request);
    return $tea.cast<ReopenCreditDriverResponse>(await this.doRequest("1.0", "digital.logistic.credit.driver.reopen", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReopenCreditDriverResponse({}));
  }

  /**
   * Description: 线下协议授权关系上传
   * Summary: 线下协议授权关系上传
   */
  async uploadCreditAuthorization(request: UploadCreditAuthorizationRequest): Promise<UploadCreditAuthorizationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadCreditAuthorizationEx(request, headers, runtime);
  }

  /**
   * Description: 线下协议授权关系上传
   * Summary: 线下协议授权关系上传
   */
  async uploadCreditAuthorizationEx(request: UploadCreditAuthorizationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadCreditAuthorizationResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadCreditAuthorizationResponse>(await this.doRequest("1.0", "digital.logistic.credit.authorization.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadCreditAuthorizationResponse({}));
  }

  /**
   * Description: 线上应收转让确认关系
   * Summary: 线上应收转让确认关系
   */
  async uploadCreditConfirm(request: UploadCreditConfirmRequest): Promise<UploadCreditConfirmResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadCreditConfirmEx(request, headers, runtime);
  }

  /**
   * Description: 线上应收转让确认关系
   * Summary: 线上应收转让确认关系
   */
  async uploadCreditConfirmEx(request: UploadCreditConfirmRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadCreditConfirmResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadCreditConfirmResponse>(await this.doRequest("1.0", "digital.logistic.credit.confirm.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadCreditConfirmResponse({}));
  }

  /**
   * Description: 物流信用流转凭证批量发行
   * Summary: 物流信用流转凭证批量发行
   */
  async batchcreateCreditmodeIssue(request: BatchcreateCreditmodeIssueRequest): Promise<BatchcreateCreditmodeIssueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateCreditmodeIssueEx(request, headers, runtime);
  }

  /**
   * Description: 物流信用流转凭证批量发行
   * Summary: 物流信用流转凭证批量发行
   */
  async batchcreateCreditmodeIssueEx(request: BatchcreateCreditmodeIssueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateCreditmodeIssueResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateCreditmodeIssueResponse>(await this.doRequest("1.0", "digital.logistic.creditmode.issue.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateCreditmodeIssueResponse({}));
  }

  /**
   * Description: 物流信用流转按模式主动清分
   * Summary: 物流信用流转按模式主动清分
   */
  async applyCreditmodeIssueclear(request: ApplyCreditmodeIssueclearRequest): Promise<ApplyCreditmodeIssueclearResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyCreditmodeIssueclearEx(request, headers, runtime);
  }

  /**
   * Description: 物流信用流转按模式主动清分
   * Summary: 物流信用流转按模式主动清分
   */
  async applyCreditmodeIssueclearEx(request: ApplyCreditmodeIssueclearRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyCreditmodeIssueclearResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyCreditmodeIssueclearResponse>(await this.doRequest("1.0", "digital.logistic.creditmode.issueclear.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyCreditmodeIssueclearResponse({}));
  }

  /**
   * Description: 信用流转发行信息上传SAAS版
   * Summary: 信用流转发行信息上传SAAS版
   */
  async uploadCreditIssuebysaas(request: UploadCreditIssuebysaasRequest): Promise<UploadCreditIssuebysaasResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadCreditIssuebysaasEx(request, headers, runtime);
  }

  /**
   * Description: 信用流转发行信息上传SAAS版
   * Summary: 信用流转发行信息上传SAAS版
   */
  async uploadCreditIssuebysaasEx(request: UploadCreditIssuebysaasRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadCreditIssuebysaasResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadCreditIssuebysaasResponse>(await this.doRequest("1.0", "digital.logistic.credit.issuebysaas.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadCreditIssuebysaasResponse({}));
  }

  /**
   * Description: 信用流转B模式发行批次撤销SAAS版
   * Summary: 信用流转B模式发行批次撤销SAAS版
   */
  async cancelCreditIssuebatchbysaas(request: CancelCreditIssuebatchbysaasRequest): Promise<CancelCreditIssuebatchbysaasResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelCreditIssuebatchbysaasEx(request, headers, runtime);
  }

  /**
   * Description: 信用流转B模式发行批次撤销SAAS版
   * Summary: 信用流转B模式发行批次撤销SAAS版
   */
  async cancelCreditIssuebatchbysaasEx(request: CancelCreditIssuebatchbysaasRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelCreditIssuebatchbysaasResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelCreditIssuebatchbysaasResponse>(await this.doRequest("1.0", "digital.logistic.credit.issuebatchbysaas.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelCreditIssuebatchbysaasResponse({}));
  }

  /**
   * Description: 信用流转可用额度查询SAAS版
   * Summary: 信用流转可用额度查询SAAS版
   */
  async queryCreditBalancebysaas(request: QueryCreditBalancebysaasRequest): Promise<QueryCreditBalancebysaasResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCreditBalancebysaasEx(request, headers, runtime);
  }

  /**
   * Description: 信用流转可用额度查询SAAS版
   * Summary: 信用流转可用额度查询SAAS版
   */
  async queryCreditBalancebysaasEx(request: QueryCreditBalancebysaasRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCreditBalancebysaasResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCreditBalancebysaasResponse>(await this.doRequest("1.0", "digital.logistic.credit.balancebysaas.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCreditBalancebysaasResponse({}));
  }

  /**
   * Description: 信用凭证电子回单获取
   * Summary: 信用凭证电子回单获取
   */
  async getCreditIssuescpticket(request: GetCreditIssuescpticketRequest): Promise<GetCreditIssuescpticketResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getCreditIssuescpticketEx(request, headers, runtime);
  }

  /**
   * Description: 信用凭证电子回单获取
   * Summary: 信用凭证电子回单获取
   */
  async getCreditIssuescpticketEx(request: GetCreditIssuescpticketRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetCreditIssuescpticketResponse> {
    Util.validateModel(request);
    return $tea.cast<GetCreditIssuescpticketResponse>(await this.doRequest("1.0", "digital.logistic.credit.issuescpticket.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetCreditIssuescpticketResponse({}));
  }

  /**
   * Description: 信用凭证电子回单获取结果查询接口
   * Summary: 信用凭证电子回单获取结果查询接口
   */
  async queryCreditIssuescpticketresult(request: QueryCreditIssuescpticketresultRequest): Promise<QueryCreditIssuescpticketresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCreditIssuescpticketresultEx(request, headers, runtime);
  }

  /**
   * Description: 信用凭证电子回单获取结果查询接口
   * Summary: 信用凭证电子回单获取结果查询接口
   */
  async queryCreditIssuescpticketresultEx(request: QueryCreditIssuescpticketresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCreditIssuescpticketresultResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCreditIssuescpticketresultResponse>(await this.doRequest("1.0", "digital.logistic.credit.issuescpticketresult.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCreditIssuescpticketresultResponse({}));
  }

  /**
   * Description: 信用流转A+模式发行信息上传
   * Summary: 信用流转A+模式发行信息上传
   */
  async uploadCreditAplusissue(request: UploadCreditAplusissueRequest): Promise<UploadCreditAplusissueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadCreditAplusissueEx(request, headers, runtime);
  }

  /**
   * Description: 信用流转A+模式发行信息上传
   * Summary: 信用流转A+模式发行信息上传
   */
  async uploadCreditAplusissueEx(request: UploadCreditAplusissueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadCreditAplusissueResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadCreditAplusissueResponse>(await this.doRequest("1.0", "digital.logistic.credit.aplusissue.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadCreditAplusissueResponse({}));
  }

  /**
   * Description: 信用流转可用额度查询接口
   * Summary: 信用流转可用额度查询接口
   */
  async queryCreditCreditamount(request: QueryCreditCreditamountRequest): Promise<QueryCreditCreditamountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCreditCreditamountEx(request, headers, runtime);
  }

  /**
   * Description: 信用流转可用额度查询接口
   * Summary: 信用流转可用额度查询接口
   */
  async queryCreditCreditamountEx(request: QueryCreditCreditamountRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCreditCreditamountResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCreditCreditamountResponse>(await this.doRequest("1.0", "digital.logistic.credit.creditamount.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCreditCreditamountResponse({}));
  }

  /**
   * Description: 信用流转非授信通用签约接口
   * Summary: 信用流转非授信通用签约接口
   */
  async createCreditCommonsign(request: CreateCreditCommonsignRequest): Promise<CreateCreditCommonsignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCreditCommonsignEx(request, headers, runtime);
  }

  /**
   * Description: 信用流转非授信通用签约接口
   * Summary: 信用流转非授信通用签约接口
   */
  async createCreditCommonsignEx(request: CreateCreditCommonsignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCreditCommonsignResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCreditCommonsignResponse>(await this.doRequest("1.0", "digital.logistic.credit.commonsign.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCreditCommonsignResponse({}));
  }

  /**
   * Description: 信用流转非授信通用签约查询接口
   * Summary: 信用流转非授信通用签约查询接口
   */
  async queryCreditCommonsign(request: QueryCreditCommonsignRequest): Promise<QueryCreditCommonsignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCreditCommonsignEx(request, headers, runtime);
  }

  /**
   * Description: 信用流转非授信通用签约查询接口
   * Summary: 信用流转非授信通用签约查询接口
   */
  async queryCreditCommonsignEx(request: QueryCreditCommonsignRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCreditCommonsignResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCreditCommonsignResponse>(await this.doRequest("1.0", "digital.logistic.credit.commonsign.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCreditCommonsignResponse({}));
  }

  /**
   * Description: 信用流转凭证合并发行接口
   * Summary: 信用流转凭证合并发行接口
   */
  async batchcreateCreditIssue(request: BatchcreateCreditIssueRequest): Promise<BatchcreateCreditIssueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateCreditIssueEx(request, headers, runtime);
  }

  /**
   * Description: 信用流转凭证合并发行接口
   * Summary: 信用流转凭证合并发行接口
   */
  async batchcreateCreditIssueEx(request: BatchcreateCreditIssueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateCreditIssueResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateCreditIssueResponse>(await this.doRequest("1.0", "digital.logistic.credit.issue.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateCreditIssueResponse({}));
  }

  /**
   * Description: 信用流转凭证合并发行信息上传接口
   * Summary: 信用流转凭证合并发行信息上传接口
   */
  async uploadCreditIssuebatch(request: UploadCreditIssuebatchRequest): Promise<UploadCreditIssuebatchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadCreditIssuebatchEx(request, headers, runtime);
  }

  /**
   * Description: 信用流转凭证合并发行信息上传接口
   * Summary: 信用流转凭证合并发行信息上传接口
   */
  async uploadCreditIssuebatchEx(request: UploadCreditIssuebatchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadCreditIssuebatchResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadCreditIssuebatchResponse>(await this.doRequest("1.0", "digital.logistic.credit.issuebatch.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadCreditIssuebatchResponse({}));
  }

  /**
   * Description: 信用凭证电子回单获取(新)，明确了凭证的转出方did和转入方did
   * Summary: 信用凭证电子回单获取(新)
   */
  async getIssueTransferfile(request: GetIssueTransferfileRequest): Promise<GetIssueTransferfileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getIssueTransferfileEx(request, headers, runtime);
  }

  /**
   * Description: 信用凭证电子回单获取(新)，明确了凭证的转出方did和转入方did
   * Summary: 信用凭证电子回单获取(新)
   */
  async getIssueTransferfileEx(request: GetIssueTransferfileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetIssueTransferfileResponse> {
    Util.validateModel(request);
    return $tea.cast<GetIssueTransferfileResponse>(await this.doRequest("1.0", "digital.logistic.issue.transferfile.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetIssueTransferfileResponse({}));
  }

  /**
   * Description: 保险服务，投保接口。接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
   * Summary: 投保接口-中华财险-承运人责任险
   */
  async applyInsurancepolicyZhonghuacaixian(request: ApplyInsurancepolicyZhonghuacaixianRequest): Promise<ApplyInsurancepolicyZhonghuacaixianResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyInsurancepolicyZhonghuacaixianEx(request, headers, runtime);
  }

  /**
   * Description: 保险服务，投保接口。接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
   * Summary: 投保接口-中华财险-承运人责任险
   */
  async applyInsurancepolicyZhonghuacaixianEx(request: ApplyInsurancepolicyZhonghuacaixianRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyInsurancepolicyZhonghuacaixianResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyInsurancepolicyZhonghuacaixianResponse>(await this.doRequest("1.0", "digital.logistic.insurancepolicy.zhonghuacaixian.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyInsurancepolicyZhonghuacaixianResponse({}));
  }

  /**
   * Description: 数字物流保险，退保接口
   * Summary: 退保接口-中华财险-承运人责任险
   */
  async cancelInsurancepolicyZhonghuacaixian(request: CancelInsurancepolicyZhonghuacaixianRequest): Promise<CancelInsurancepolicyZhonghuacaixianResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelInsurancepolicyZhonghuacaixianEx(request, headers, runtime);
  }

  /**
   * Description: 数字物流保险，退保接口
   * Summary: 退保接口-中华财险-承运人责任险
   */
  async cancelInsurancepolicyZhonghuacaixianEx(request: CancelInsurancepolicyZhonghuacaixianRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelInsurancepolicyZhonghuacaixianResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelInsurancepolicyZhonghuacaixianResponse>(await this.doRequest("1.0", "digital.logistic.insurancepolicy.zhonghuacaixian.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelInsurancepolicyZhonghuacaixianResponse({}));
  }

  /**
   * Description: 保险理赔通知
   * Summary: 保险理赔通知
   */
  async pushInsurancenotifyClaim(request: PushInsurancenotifyClaimRequest): Promise<PushInsurancenotifyClaimResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushInsurancenotifyClaimEx(request, headers, runtime);
  }

  /**
   * Description: 保险理赔通知
   * Summary: 保险理赔通知
   */
  async pushInsurancenotifyClaimEx(request: PushInsurancenotifyClaimRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushInsurancenotifyClaimResponse> {
    Util.validateModel(request);
    return $tea.cast<PushInsurancenotifyClaimResponse>(await this.doRequest("1.0", "digital.logistic.insurancenotify.claim.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushInsurancenotifyClaimResponse({}));
  }

  /**
   * Description: 系统会生成上传文件的连接，使用方使用该链接进行文件上传。该链接具有一定的时效性，因此建议按需按时申请使用
   * Summary: 上传文件链接申请
   */
  async applyInsuranceFileurl(request: ApplyInsuranceFileurlRequest): Promise<ApplyInsuranceFileurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyInsuranceFileurlEx(request, headers, runtime);
  }

  /**
   * Description: 系统会生成上传文件的连接，使用方使用该链接进行文件上传。该链接具有一定的时效性，因此建议按需按时申请使用
   * Summary: 上传文件链接申请
   */
  async applyInsuranceFileurlEx(request: ApplyInsuranceFileurlRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyInsuranceFileurlResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyInsuranceFileurlResponse>(await this.doRequest("1.0", "digital.logistic.insurance.fileurl.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyInsuranceFileurlResponse({}));
  }

  /**
   * Description: 保险服务-平台责任险投保接口。根据运输货物货值生成相应的保费。
  接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
   * Summary: 投保接口-承运人平台责任险
   */
  async applyInsurancepolicyUniversal(request: ApplyInsurancepolicyUniversalRequest): Promise<ApplyInsurancepolicyUniversalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyInsurancepolicyUniversalEx(request, headers, runtime);
  }

  /**
   * Description: 保险服务-平台责任险投保接口。根据运输货物货值生成相应的保费。
  接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
   * Summary: 投保接口-承运人平台责任险
   */
  async applyInsurancepolicyUniversalEx(request: ApplyInsurancepolicyUniversalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyInsurancepolicyUniversalResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyInsurancepolicyUniversalResponse>(await this.doRequest("1.0", "digital.logistic.insurancepolicy.universal.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyInsurancepolicyUniversalResponse({}));
  }

  /**
   * Description: 数字物流保险，退保接口
   * Summary: 退保接口-承运人平台责任险
   */
  async cancelInsurancepolicyUniversal(request: CancelInsurancepolicyUniversalRequest): Promise<CancelInsurancepolicyUniversalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelInsurancepolicyUniversalEx(request, headers, runtime);
  }

  /**
   * Description: 数字物流保险，退保接口
   * Summary: 退保接口-承运人平台责任险
   */
  async cancelInsurancepolicyUniversalEx(request: CancelInsurancepolicyUniversalRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelInsurancepolicyUniversalResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelInsurancepolicyUniversalResponse>(await this.doRequest("1.0", "digital.logistic.insurancepolicy.universal.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelInsurancepolicyUniversalResponse({}));
  }

  /**
   * Description: 利用区块链智能合约进行离线保单存证
   * Summary: 离线保单存证推送
   */
  async pushInsuranceOlp(request: PushInsuranceOlpRequest): Promise<PushInsuranceOlpResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushInsuranceOlpEx(request, headers, runtime);
  }

  /**
   * Description: 利用区块链智能合约进行离线保单存证
   * Summary: 离线保单存证推送
   */
  async pushInsuranceOlpEx(request: PushInsuranceOlpRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushInsuranceOlpResponse> {
    Util.validateModel(request);
    return $tea.cast<PushInsuranceOlpResponse>(await this.doRequest("1.0", "digital.logistic.insurance.olp.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushInsuranceOlpResponse({}));
  }

  /**
   * Description: 利用区块链智能合约进行离线保单信息更新追踪
   * Summary: 离线保单更新
   */
  async updateInsuranceOlp(request: UpdateInsuranceOlpRequest): Promise<UpdateInsuranceOlpResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateInsuranceOlpEx(request, headers, runtime);
  }

  /**
   * Description: 利用区块链智能合约进行离线保单信息更新追踪
   * Summary: 离线保单更新
   */
  async updateInsuranceOlpEx(request: UpdateInsuranceOlpRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateInsuranceOlpResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateInsuranceOlpResponse>(await this.doRequest("1.0", "digital.logistic.insurance.olp.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateInsuranceOlpResponse({}));
  }

  /**
   * Description: 再保分保单推送接口
   * Summary: 再保分保单推送
   */
  async pushInsuranceReppolicy(request: PushInsuranceReppolicyRequest): Promise<PushInsuranceReppolicyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushInsuranceReppolicyEx(request, headers, runtime);
  }

  /**
   * Description: 再保分保单推送接口
   * Summary: 再保分保单推送
   */
  async pushInsuranceReppolicyEx(request: PushInsuranceReppolicyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushInsuranceReppolicyResponse> {
    Util.validateModel(request);
    return $tea.cast<PushInsuranceReppolicyResponse>(await this.doRequest("1.0", "digital.logistic.insurance.reppolicy.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushInsuranceReppolicyResponse({}));
  }

  /**
   * Description: 再保批改单推送
   * Summary: 再保批改单推送
   */
  async pushInsuranceRepcorrect(request: PushInsuranceRepcorrectRequest): Promise<PushInsuranceRepcorrectResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushInsuranceRepcorrectEx(request, headers, runtime);
  }

  /**
   * Description: 再保批改单推送
   * Summary: 再保批改单推送
   */
  async pushInsuranceRepcorrectEx(request: PushInsuranceRepcorrectRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushInsuranceRepcorrectResponse> {
    Util.validateModel(request);
    return $tea.cast<PushInsuranceRepcorrectResponse>(await this.doRequest("1.0", "digital.logistic.insurance.repcorrect.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushInsuranceRepcorrectResponse({}));
  }

  /**
   * Description: 跨境运费险投保申请
   * Summary: 跨境运费险投保
   */
  async applyInsuranceCbrf(request: ApplyInsuranceCbrfRequest): Promise<ApplyInsuranceCbrfResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyInsuranceCbrfEx(request, headers, runtime);
  }

  /**
   * Description: 跨境运费险投保申请
   * Summary: 跨境运费险投保
   */
  async applyInsuranceCbrfEx(request: ApplyInsuranceCbrfRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyInsuranceCbrfResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyInsuranceCbrfResponse>(await this.doRequest("1.0", "digital.logistic.insurance.cbrf.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyInsuranceCbrfResponse({}));
  }

  /**
   * Description: 跨境运费险理赔
   * Summary: 跨境运费险理赔
   */
  async repayInsuranceCbrf(request: RepayInsuranceCbrfRequest): Promise<RepayInsuranceCbrfResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.repayInsuranceCbrfEx(request, headers, runtime);
  }

  /**
   * Description: 跨境运费险理赔
   * Summary: 跨境运费险理赔
   */
  async repayInsuranceCbrfEx(request: RepayInsuranceCbrfRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RepayInsuranceCbrfResponse> {
    Util.validateModel(request);
    return $tea.cast<RepayInsuranceCbrfResponse>(await this.doRequest("1.0", "digital.logistic.insurance.cbrf.repay", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RepayInsuranceCbrfResponse({}));
  }

  /**
   * Description: 跨境出口货运险投保
   * Summary: 跨境出口货运险投保
   */
  async applyInsuranceCbec(request: ApplyInsuranceCbecRequest): Promise<ApplyInsuranceCbecResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyInsuranceCbecEx(request, headers, runtime);
  }

  /**
   * Description: 跨境出口货运险投保
   * Summary: 跨境出口货运险投保
   */
  async applyInsuranceCbecEx(request: ApplyInsuranceCbecRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyInsuranceCbecResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyInsuranceCbecResponse>(await this.doRequest("1.0", "digital.logistic.insurance.cbec.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyInsuranceCbecResponse({}));
  }

  /**
   * Description: 货物入库申报
   * Summary: 货物入库申报
   */
  async applyInsuranceStockin(request: ApplyInsuranceStockinRequest): Promise<ApplyInsuranceStockinResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyInsuranceStockinEx(request, headers, runtime);
  }

  /**
   * Description: 货物入库申报
   * Summary: 货物入库申报
   */
  async applyInsuranceStockinEx(request: ApplyInsuranceStockinRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyInsuranceStockinResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyInsuranceStockinResponse>(await this.doRequest("1.0", "digital.logistic.insurance.stockin.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyInsuranceStockinResponse({}));
  }

  /**
   * Description: 货物库存申报
   * Summary: 货物库存申报
   */
  async applyInsuranceInventory(request: ApplyInsuranceInventoryRequest): Promise<ApplyInsuranceInventoryResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyInsuranceInventoryEx(request, headers, runtime);
  }

  /**
   * Description: 货物库存申报
   * Summary: 货物库存申报
   */
  async applyInsuranceInventoryEx(request: ApplyInsuranceInventoryRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyInsuranceInventoryResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyInsuranceInventoryResponse>(await this.doRequest("1.0", "digital.logistic.insurance.inventory.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyInsuranceInventoryResponse({}));
  }

  /**
   * Description: 海外邮包险投保api
   * Summary: 海外邮包险投保
   */
  async applyInsuranceOspi(request: ApplyInsuranceOspiRequest): Promise<ApplyInsuranceOspiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyInsuranceOspiEx(request, headers, runtime);
  }

  /**
   * Description: 海外邮包险投保api
   * Summary: 海外邮包险投保
   */
  async applyInsuranceOspiEx(request: ApplyInsuranceOspiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyInsuranceOspiResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyInsuranceOspiResponse>(await this.doRequest("1.0", "digital.logistic.insurance.ospi.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyInsuranceOspiResponse({}));
  }

  /**
   * Description: 海外、跨境邮包险、平台责任险的理赔报案
   * Summary: 海外、跨境邮包险、平台责任险报案
   */
  async applyInsuranceOspireport(request: ApplyInsuranceOspireportRequest): Promise<ApplyInsuranceOspireportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyInsuranceOspireportEx(request, headers, runtime);
  }

  /**
   * Description: 海外、跨境邮包险、平台责任险的理赔报案
   * Summary: 海外、跨境邮包险、平台责任险报案
   */
  async applyInsuranceOspireportEx(request: ApplyInsuranceOspireportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyInsuranceOspireportResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyInsuranceOspireportResponse>(await this.doRequest("1.0", "digital.logistic.insurance.ospireport.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyInsuranceOspireportResponse({}));
  }

  /**
   * Description: 海外、跨境邮包险、平台责任险案件结果通知
   * Summary: 海外、跨境邮包险、平台责任险案件结果通知
   */
  async notifyInsuranceOspireport(request: NotifyInsuranceOspireportRequest): Promise<NotifyInsuranceOspireportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.notifyInsuranceOspireportEx(request, headers, runtime);
  }

  /**
   * Description: 海外、跨境邮包险、平台责任险案件结果通知
   * Summary: 海外、跨境邮包险、平台责任险案件结果通知
   */
  async notifyInsuranceOspireportEx(request: NotifyInsuranceOspireportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<NotifyInsuranceOspireportResponse> {
    Util.validateModel(request);
    return $tea.cast<NotifyInsuranceOspireportResponse>(await this.doRequest("1.0", "digital.logistic.insurance.ospireport.notify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new NotifyInsuranceOspireportResponse({}));
  }

  /**
   * Description: 驿站宝投保
   * Summary: 驿站宝投保
   */
  async applyInsuranceYzb(request: ApplyInsuranceYzbRequest): Promise<ApplyInsuranceYzbResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyInsuranceYzbEx(request, headers, runtime);
  }

  /**
   * Description: 驿站宝投保
   * Summary: 驿站宝投保
   */
  async applyInsuranceYzbEx(request: ApplyInsuranceYzbRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyInsuranceYzbResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyInsuranceYzbResponse>(await this.doRequest("1.0", "digital.logistic.insurance.yzb.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyInsuranceYzbResponse({}));
  }

  /**
   * Description: 跨境邮包险、平台责任险投保
   * Summary: 跨境邮包险、平台责任险投保
   */
  async applyInsuranceCbpi(request: ApplyInsuranceCbpiRequest): Promise<ApplyInsuranceCbpiResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyInsuranceCbpiEx(request, headers, runtime);
  }

  /**
   * Description: 跨境邮包险、平台责任险投保
   * Summary: 跨境邮包险、平台责任险投保
   */
  async applyInsuranceCbpiEx(request: ApplyInsuranceCbpiRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyInsuranceCbpiResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyInsuranceCbpiResponse>(await this.doRequest("1.0", "digital.logistic.insurance.cbpi.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyInsuranceCbpiResponse({}));
  }

  /**
   * Description: 驿站宝报案
   * Summary: 驿站宝报案
   */
  async applyInsuranceYzbreport(request: ApplyInsuranceYzbreportRequest): Promise<ApplyInsuranceYzbreportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyInsuranceYzbreportEx(request, headers, runtime);
  }

  /**
   * Description: 驿站宝报案
   * Summary: 驿站宝报案
   */
  async applyInsuranceYzbreportEx(request: ApplyInsuranceYzbreportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyInsuranceYzbreportResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyInsuranceYzbreportResponse>(await this.doRequest("1.0", "digital.logistic.insurance.yzbreport.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyInsuranceYzbreportResponse({}));
  }

  /**
   * Description: 驿站宝案件进度查询
   * Summary: 驿站宝案件进度查询
   */
  async queryInsuranceYzbreport(request: QueryInsuranceYzbreportRequest): Promise<QueryInsuranceYzbreportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInsuranceYzbreportEx(request, headers, runtime);
  }

  /**
   * Description: 驿站宝案件进度查询
   * Summary: 驿站宝案件进度查询
   */
  async queryInsuranceYzbreportEx(request: QueryInsuranceYzbreportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInsuranceYzbreportResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInsuranceYzbreportResponse>(await this.doRequest("1.0", "digital.logistic.insurance.yzbreport.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInsuranceYzbreportResponse({}));
  }

  /**
   * Description: 零担快运运单上链存证接口
   * Summary: 零担快运运单上链存证接口
   */
  async saveInsuranceWaybill(request: SaveInsuranceWaybillRequest): Promise<SaveInsuranceWaybillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveInsuranceWaybillEx(request, headers, runtime);
  }

  /**
   * Description: 零担快运运单上链存证接口
   * Summary: 零担快运运单上链存证接口
   */
  async saveInsuranceWaybillEx(request: SaveInsuranceWaybillRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveInsuranceWaybillResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveInsuranceWaybillResponse>(await this.doRequest("1.0", "digital.logistic.insurance.waybill.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveInsuranceWaybillResponse({}));
  }

  /**
   * Description: 保险电子保单查询
   * Summary: 保险电子保单查询
   */
  async queryInsuranceEpolicy(request: QueryInsuranceEpolicyRequest): Promise<QueryInsuranceEpolicyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInsuranceEpolicyEx(request, headers, runtime);
  }

  /**
   * Description: 保险电子保单查询
   * Summary: 保险电子保单查询
   */
  async queryInsuranceEpolicyEx(request: QueryInsuranceEpolicyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInsuranceEpolicyResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInsuranceEpolicyResponse>(await this.doRequest("1.0", "digital.logistic.insurance.epolicy.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInsuranceEpolicyResponse({}));
  }

  /**
   * Description: 报案案件结果通知（内部）
   * Summary: 报案案件结果通知（内部）
   */
  async notifyInsuranceReportresult(request: NotifyInsuranceReportresultRequest): Promise<NotifyInsuranceReportresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.notifyInsuranceReportresultEx(request, headers, runtime);
  }

  /**
   * Description: 报案案件结果通知（内部）
   * Summary: 报案案件结果通知（内部）
   */
  async notifyInsuranceReportresultEx(request: NotifyInsuranceReportresultRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<NotifyInsuranceReportresultResponse> {
    Util.validateModel(request);
    return $tea.cast<NotifyInsuranceReportresultResponse>(await this.doRequest("1.0", "digital.logistic.insurance.reportresult.notify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new NotifyInsuranceReportresultResponse({}));
  }

  /**
   * Description: 不可达项目投保接口
   * Summary: 跨境退货运费险-不可达项目投保接口
   */
  async applyCbrfInsure(request: ApplyCbrfInsureRequest): Promise<ApplyCbrfInsureResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyCbrfInsureEx(request, headers, runtime);
  }

  /**
   * Description: 不可达项目投保接口
   * Summary: 跨境退货运费险-不可达项目投保接口
   */
  async applyCbrfInsureEx(request: ApplyCbrfInsureRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyCbrfInsureResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyCbrfInsureResponse>(await this.doRequest("1.0", "digital.logistic.cbrf.insure.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyCbrfInsureResponse({}));
  }

  /**
   * Description: 不可达项目理赔接口
   * Summary: 跨境退货运费险-不可达项目理赔接口
   */
  async repayCbrfClaim(request: RepayCbrfClaimRequest): Promise<RepayCbrfClaimResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.repayCbrfClaimEx(request, headers, runtime);
  }

  /**
   * Description: 不可达项目理赔接口
   * Summary: 跨境退货运费险-不可达项目理赔接口
   */
  async repayCbrfClaimEx(request: RepayCbrfClaimRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RepayCbrfClaimResponse> {
    Util.validateModel(request);
    return $tea.cast<RepayCbrfClaimResponse>(await this.doRequest("1.0", "digital.logistic.cbrf.claim.repay", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RepayCbrfClaimResponse({}));
  }

  /**
   * Description: 大保单批单
   * Summary: 大保单批单申请接口
   */
  async applyInsuranceEndorsement(request: ApplyInsuranceEndorsementRequest): Promise<ApplyInsuranceEndorsementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyInsuranceEndorsementEx(request, headers, runtime);
  }

  /**
   * Description: 大保单批单
   * Summary: 大保单批单申请接口
   */
  async applyInsuranceEndorsementEx(request: ApplyInsuranceEndorsementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyInsuranceEndorsementResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyInsuranceEndorsementResponse>(await this.doRequest("1.0", "digital.logistic.insurance.endorsement.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyInsuranceEndorsementResponse({}));
  }

  /**
   * Description: 大保单批单查询接口
   * Summary: 大保单批单查询接口
   */
  async queryInsuranceEndorsement(request: QueryInsuranceEndorsementRequest): Promise<QueryInsuranceEndorsementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryInsuranceEndorsementEx(request, headers, runtime);
  }

  /**
   * Description: 大保单批单查询接口
   * Summary: 大保单批单查询接口
   */
  async queryInsuranceEndorsementEx(request: QueryInsuranceEndorsementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryInsuranceEndorsementResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryInsuranceEndorsementResponse>(await this.doRequest("1.0", "digital.logistic.insurance.endorsement.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryInsuranceEndorsementResponse({}));
  }

  /**
   * Description: 海外、跨境邮包险预报案
   * Summary: 海外、跨境邮包险预报案
   */
  async applyInsurancePiprereport(request: ApplyInsurancePiprereportRequest): Promise<ApplyInsurancePiprereportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyInsurancePiprereportEx(request, headers, runtime);
  }

  /**
   * Description: 海外、跨境邮包险预报案
   * Summary: 海外、跨境邮包险预报案
   */
  async applyInsurancePiprereportEx(request: ApplyInsurancePiprereportRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyInsurancePiprereportResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyInsurancePiprereportResponse>(await this.doRequest("1.0", "digital.logistic.insurance.piprereport.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyInsurancePiprereportResponse({}));
  }

  /**
   * Description: 授权签署信息推送
   * Summary: 授权签署信息推送
   */
  async pushAuthSigninfo(request: PushAuthSigninfoRequest): Promise<PushAuthSigninfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushAuthSigninfoEx(request, headers, runtime);
  }

  /**
   * Description: 授权签署信息推送
   * Summary: 授权签署信息推送
   */
  async pushAuthSigninfoEx(request: PushAuthSigninfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushAuthSigninfoResponse> {
    Util.validateModel(request);
    return $tea.cast<PushAuthSigninfoResponse>(await this.doRequest("1.0", "digital.logistic.auth.signinfo.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushAuthSigninfoResponse({}));
  }

  /**
   * Description: 池融资委托支付入账查询
   * Summary: 委托支付入账查询
   */
  async queryPfPayment(request: QueryPfPaymentRequest): Promise<QueryPfPaymentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPfPaymentEx(request, headers, runtime);
  }

  /**
   * Description: 池融资委托支付入账查询
   * Summary: 委托支付入账查询
   */
  async queryPfPaymentEx(request: QueryPfPaymentRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPfPaymentResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPfPaymentResponse>(await this.doRequest("1.0", "digital.logistic.pf.payment.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPfPaymentResponse({}));
  }

  /**
   * Description: 池融资借据信息查询
   * Summary: 借据信息查询
   */
  async queryPfIou(request: QueryPfIouRequest): Promise<QueryPfIouResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPfIouEx(request, headers, runtime);
  }

  /**
   * Description: 池融资借据信息查询
   * Summary: 借据信息查询
   */
  async queryPfIouEx(request: QueryPfIouRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPfIouResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPfIouResponse>(await this.doRequest("1.0", "digital.logistic.pf.iou.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPfIouResponse({}));
  }

  /**
   * Description: 池融资授信额度查询
   * Summary: 授信额度查询
   */
  async queryPfQuota(request: QueryPfQuotaRequest): Promise<QueryPfQuotaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPfQuotaEx(request, headers, runtime);
  }

  /**
   * Description: 池融资授信额度查询
   * Summary: 授信额度查询
   */
  async queryPfQuotaEx(request: QueryPfQuotaRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPfQuotaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPfQuotaResponse>(await this.doRequest("1.0", "digital.logistic.pf.quota.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPfQuotaResponse({}));
  }

  /**
   * Description: 池融资支用申请
   * Summary: 池融资支用申请
   */
  async applyPfWaybillfinancing(request: ApplyPfWaybillfinancingRequest): Promise<ApplyPfWaybillfinancingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyPfWaybillfinancingEx(request, headers, runtime);
  }

  /**
   * Description: 池融资支用申请
   * Summary: 池融资支用申请
   */
  async applyPfWaybillfinancingEx(request: ApplyPfWaybillfinancingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyPfWaybillfinancingResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyPfWaybillfinancingResponse>(await this.doRequest("1.0", "digital.logistic.pf.waybillfinancing.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyPfWaybillfinancingResponse({}));
  }

  /**
   * Description: 池融资账单质押，用于入池
   * Summary: 池融资账单质押
   */
  async pushPfPledge(request: PushPfPledgeRequest): Promise<PushPfPledgeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.pushPfPledgeEx(request, headers, runtime);
  }

  /**
   * Description: 池融资账单质押，用于入池
   * Summary: 池融资账单质押
   */
  async pushPfPledgeEx(request: PushPfPledgeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<PushPfPledgeResponse> {
    Util.validateModel(request);
    return $tea.cast<PushPfPledgeResponse>(await this.doRequest("1.0", "digital.logistic.pf.pledge.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new PushPfPledgeResponse({}));
  }

  /**
   * Description: 入池账单质押状态查询
   * Summary: 质押状态查询
   */
  async queryPfPledge(request: QueryPfPledgeRequest): Promise<QueryPfPledgeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPfPledgeEx(request, headers, runtime);
  }

  /**
   * Description: 入池账单质押状态查询
   * Summary: 质押状态查询
   */
  async queryPfPledgeEx(request: QueryPfPledgeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPfPledgeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPfPledgeResponse>(await this.doRequest("1.0", "digital.logistic.pf.pledge.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPfPledgeResponse({}));
  }

  /**
   * Description: 池融资融资支用状态查询
   * Summary: 池融资融资支用状态查询
   */
  async queryPfFinancing(request: QueryPfFinancingRequest): Promise<QueryPfFinancingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPfFinancingEx(request, headers, runtime);
  }

  /**
   * Description: 池融资融资支用状态查询
   * Summary: 池融资融资支用状态查询
   */
  async queryPfFinancingEx(request: QueryPfFinancingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPfFinancingResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPfFinancingResponse>(await this.doRequest("1.0", "digital.logistic.pf.financing.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPfFinancingResponse({}));
  }

  /**
   * Description: 池融资凭证核验结果查询
   * Summary: 池融资凭证核验结果查询
   */
  async checkPfVoucher(request: CheckPfVoucherRequest): Promise<CheckPfVoucherResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkPfVoucherEx(request, headers, runtime);
  }

  /**
   * Description: 池融资凭证核验结果查询
   * Summary: 池融资凭证核验结果查询
   */
  async checkPfVoucherEx(request: CheckPfVoucherRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckPfVoucherResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckPfVoucherResponse>(await this.doRequest("1.0", "digital.logistic.pf.voucher.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckPfVoucherResponse({}));
  }

  /**
   * Description: 池融资提款确认书申请
   * Summary: 提款确认书申请
   */
  async applyPfConfirmation(request: ApplyPfConfirmationRequest): Promise<ApplyPfConfirmationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyPfConfirmationEx(request, headers, runtime);
  }

  /**
   * Description: 池融资提款确认书申请
   * Summary: 提款确认书申请
   */
  async applyPfConfirmationEx(request: ApplyPfConfirmationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyPfConfirmationResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyPfConfirmationResponse>(await this.doRequest("1.0", "digital.logistic.pf.confirmation.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyPfConfirmationResponse({}));
  }

  /**
   * Description: 池融资融资资格申请
   * Summary: 池融资融资资格申请
   */
  async applyPfFinancingqualification(request: ApplyPfFinancingqualificationRequest): Promise<ApplyPfFinancingqualificationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyPfFinancingqualificationEx(request, headers, runtime);
  }

  /**
   * Description: 池融资融资资格申请
   * Summary: 池融资融资资格申请
   */
  async applyPfFinancingqualificationEx(request: ApplyPfFinancingqualificationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyPfFinancingqualificationResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyPfFinancingqualificationResponse>(await this.doRequest("1.0", "digital.logistic.pf.financingqualification.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyPfFinancingqualificationResponse({}));
  }

  /**
   * Description: 池融资融资资格申请结果查询
   * Summary: 池融资融资资格申请结果查询
   */
  async queryPfFinancingqualification(request: QueryPfFinancingqualificationRequest): Promise<QueryPfFinancingqualificationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPfFinancingqualificationEx(request, headers, runtime);
  }

  /**
   * Description: 池融资融资资格申请结果查询
   * Summary: 池融资融资资格申请结果查询
   */
  async queryPfFinancingqualificationEx(request: QueryPfFinancingqualificationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPfFinancingqualificationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPfFinancingqualificationResponse>(await this.doRequest("1.0", "digital.logistic.pf.financingqualification.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPfFinancingqualificationResponse({}));
  }

  /**
   * Description: 池融资主站回调金融云接口
   * Summary: 池融资主站回调金融云接口
   */
  async callbackPfDefinpf(request: CallbackPfDefinpfRequest): Promise<CallbackPfDefinpfResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.callbackPfDefinpfEx(request, headers, runtime);
  }

  /**
   * Description: 池融资主站回调金融云接口
   * Summary: 池融资主站回调金融云接口
   */
  async callbackPfDefinpfEx(request: CallbackPfDefinpfRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CallbackPfDefinpfResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackPfDefinpfResponse>(await this.doRequest("1.0", "digital.logistic.pf.definpf.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CallbackPfDefinpfResponse({}));
  }

  /**
   * Description: 用于查询可提款额度
   * Summary: 可提款额度查询
   */
  async queryPfWithdraw(request: QueryPfWithdrawRequest): Promise<QueryPfWithdrawResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryPfWithdrawEx(request, headers, runtime);
  }

  /**
   * Description: 用于查询可提款额度
   * Summary: 可提款额度查询
   */
  async queryPfWithdrawEx(request: QueryPfWithdrawRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryPfWithdrawResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryPfWithdrawResponse>(await this.doRequest("1.0", "digital.logistic.pf.withdraw.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryPfWithdrawResponse({}));
  }

  /**
   * Description: 创建货代did
   * Summary: 创建货代did
   */
  async createDidForwarder(request: CreateDidForwarderRequest): Promise<CreateDidForwarderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDidForwarderEx(request, headers, runtime);
  }

  /**
   * Description: 创建货代did
   * Summary: 创建货代did
   */
  async createDidForwarderEx(request: CreateDidForwarderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDidForwarderResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDidForwarderResponse>(await this.doRequest("1.0", "digital.logistic.did.forwarder.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDidForwarderResponse({}));
  }

  /**
   * Description: 创建saas平台did
   * Summary: 创建saas平台did
   */
  async createDidSaasplatform(request: CreateDidSaasplatformRequest): Promise<CreateDidSaasplatformResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDidSaasplatformEx(request, headers, runtime);
  }

  /**
   * Description: 创建saas平台did
   * Summary: 创建saas平台did
   */
  async createDidSaasplatformEx(request: CreateDidSaasplatformRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDidSaasplatformResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDidSaasplatformResponse>(await this.doRequest("1.0", "digital.logistic.did.saasplatform.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDidSaasplatformResponse({}));
  }

  /**
   * Description: 创建直客did
   * Summary: 创建直客did
   */
  async createDidClient(request: CreateDidClientRequest): Promise<CreateDidClientResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDidClientEx(request, headers, runtime);
  }

  /**
   * Description: 创建直客did
   * Summary: 创建直客did
   */
  async createDidClientEx(request: CreateDidClientRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDidClientResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDidClientResponse>(await this.doRequest("1.0", "digital.logistic.did.client.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDidClientResponse({}));
  }

  /**
   * Description: 保存订单
   * Summary: 保存订单
   */
  async saveBizOrder(request: SaveBizOrderRequest): Promise<SaveBizOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveBizOrderEx(request, headers, runtime);
  }

  /**
   * Description: 保存订单
   * Summary: 保存订单
   */
  async saveBizOrderEx(request: SaveBizOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveBizOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveBizOrderResponse>(await this.doRequest("1.0", "digital.logistic.biz.order.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveBizOrderResponse({}));
  }

  /**
   * Description: 保存托单文件
   * Summary: 保存托单文件
   */
  async saveBizConsignorder(request: SaveBizConsignorderRequest): Promise<SaveBizConsignorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveBizConsignorderEx(request, headers, runtime);
  }

  /**
   * Description: 保存托单文件
   * Summary: 保存托单文件
   */
  async saveBizConsignorderEx(request: SaveBizConsignorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveBizConsignorderResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveBizConsignorderResponse>(await this.doRequest("1.0", "digital.logistic.biz.consignorder.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveBizConsignorderResponse({}));
  }

  /**
   * Description: 保存货物
   * Summary: 保存货物
   */
  async saveBizGoods(request: SaveBizGoodsRequest): Promise<SaveBizGoodsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveBizGoodsEx(request, headers, runtime);
  }

  /**
   * Description: 保存货物
   * Summary: 保存货物
   */
  async saveBizGoodsEx(request: SaveBizGoodsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveBizGoodsResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveBizGoodsResponse>(await this.doRequest("1.0", "digital.logistic.biz.goods.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveBizGoodsResponse({}));
  }

  /**
   * Description: 保存SO入货通知
   * Summary: 保存SO入货通知
   */
  async saveBizSonotify(request: SaveBizSonotifyRequest): Promise<SaveBizSonotifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveBizSonotifyEx(request, headers, runtime);
  }

  /**
   * Description: 保存SO入货通知
   * Summary: 保存SO入货通知
   */
  async saveBizSonotifyEx(request: SaveBizSonotifyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveBizSonotifyResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveBizSonotifyResponse>(await this.doRequest("1.0", "digital.logistic.biz.sonotify.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveBizSonotifyResponse({}));
  }

  /**
   * Description: 保存订舱单
   * Summary: 保存订舱单
   */
  async saveBizBookingorder(request: SaveBizBookingorderRequest): Promise<SaveBizBookingorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveBizBookingorderEx(request, headers, runtime);
  }

  /**
   * Description: 保存订舱单
   * Summary: 保存订舱单
   */
  async saveBizBookingorderEx(request: SaveBizBookingorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveBizBookingorderResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveBizBookingorderResponse>(await this.doRequest("1.0", "digital.logistic.biz.bookingorder.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveBizBookingorderResponse({}));
  }

  /**
   * Description: 保存集装箱
   * Summary: 保存集装箱
   */
  async saveBizContainer(request: SaveBizContainerRequest): Promise<SaveBizContainerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveBizContainerEx(request, headers, runtime);
  }

  /**
   * Description: 保存集装箱
   * Summary: 保存集装箱
   */
  async saveBizContainerEx(request: SaveBizContainerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveBizContainerResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveBizContainerResponse>(await this.doRequest("1.0", "digital.logistic.biz.container.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveBizContainerResponse({}));
  }

  /**
   * Description: 保存报关单
   * Summary: 保存报关单
   */
  async saveBizCustomsorder(request: SaveBizCustomsorderRequest): Promise<SaveBizCustomsorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveBizCustomsorderEx(request, headers, runtime);
  }

  /**
   * Description: 保存报关单
   * Summary: 保存报关单
   */
  async saveBizCustomsorderEx(request: SaveBizCustomsorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveBizCustomsorderResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveBizCustomsorderResponse>(await this.doRequest("1.0", "digital.logistic.biz.customsorder.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveBizCustomsorderResponse({}));
  }

  /**
   * Description: 保存拖车单
   * Summary: 保存拖车单
   */
  async saveBizVehicle(request: SaveBizVehicleRequest): Promise<SaveBizVehicleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveBizVehicleEx(request, headers, runtime);
  }

  /**
   * Description: 保存拖车单
   * Summary: 保存拖车单
   */
  async saveBizVehicleEx(request: SaveBizVehicleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveBizVehicleResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveBizVehicleResponse>(await this.doRequest("1.0", "digital.logistic.biz.vehicle.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveBizVehicleResponse({}));
  }

  /**
   * Description: 保存master提单
   * Summary: 保存master提单
   */
  async saveBizMasterbl(request: SaveBizMasterblRequest): Promise<SaveBizMasterblResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveBizMasterblEx(request, headers, runtime);
  }

  /**
   * Description: 保存master提单
   * Summary: 保存master提单
   */
  async saveBizMasterblEx(request: SaveBizMasterblRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveBizMasterblResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveBizMasterblResponse>(await this.doRequest("1.0", "digital.logistic.biz.masterbl.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveBizMasterblResponse({}));
  }

  /**
   * Description: 内审完成
   * Summary: 内审完成
   */
  async finishBizAudit(request: FinishBizAuditRequest): Promise<FinishBizAuditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.finishBizAuditEx(request, headers, runtime);
  }

  /**
   * Description: 内审完成
   * Summary: 内审完成
   */
  async finishBizAuditEx(request: FinishBizAuditRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<FinishBizAuditResponse> {
    Util.validateModel(request);
    return $tea.cast<FinishBizAuditResponse>(await this.doRequest("1.0", "digital.logistic.biz.audit.finish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new FinishBizAuditResponse({}));
  }

  /**
   * Description: 保存house提单
   * Summary: 保存house提单
   */
  async saveBizHousebl(request: SaveBizHouseblRequest): Promise<SaveBizHouseblResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveBizHouseblEx(request, headers, runtime);
  }

  /**
   * Description: 保存house提单
   * Summary: 保存house提单
   */
  async saveBizHouseblEx(request: SaveBizHouseblRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveBizHouseblResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveBizHouseblResponse>(await this.doRequest("1.0", "digital.logistic.biz.housebl.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveBizHouseblResponse({}));
  }

  /**
   * Description: 创建应付账单
   * Summary: 创建应付账单(已下)
   */
  async createBillPaybillorder(request: CreateBillPaybillorderRequest): Promise<CreateBillPaybillorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBillPaybillorderEx(request, headers, runtime);
  }

  /**
   * Description: 创建应付账单
   * Summary: 创建应付账单(已下)
   */
  async createBillPaybillorderEx(request: CreateBillPaybillorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBillPaybillorderResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBillPaybillorderResponse>(await this.doRequest("1.0", "digital.logistic.bill.paybillorder.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBillPaybillorderResponse({}));
  }

  /**
   * Description: 创建应收账单
   * Summary: 创建应收账单(已下)
   */
  async createBillReceiptbillorder(request: CreateBillReceiptbillorderRequest): Promise<CreateBillReceiptbillorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createBillReceiptbillorderEx(request, headers, runtime);
  }

  /**
   * Description: 创建应收账单
   * Summary: 创建应收账单(已下)
   */
  async createBillReceiptbillorderEx(request: CreateBillReceiptbillorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateBillReceiptbillorderResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateBillReceiptbillorderResponse>(await this.doRequest("1.0", "digital.logistic.bill.receiptbillorder.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateBillReceiptbillorderResponse({}));
  }

  /**
   * Description: 保存应付资费项
   * Summary: 保存应付资费项
   */
  async saveBillPaybilltariff(request: SaveBillPaybilltariffRequest): Promise<SaveBillPaybilltariffResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveBillPaybilltariffEx(request, headers, runtime);
  }

  /**
   * Description: 保存应付资费项
   * Summary: 保存应付资费项
   */
  async saveBillPaybilltariffEx(request: SaveBillPaybilltariffRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveBillPaybilltariffResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveBillPaybilltariffResponse>(await this.doRequest("1.0", "digital.logistic.bill.paybilltariff.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveBillPaybilltariffResponse({}));
  }

  /**
   * Description: 保存应收资费项
   * Summary: 保存应收资费项
   */
  async saveBillReceiptbilltariff(request: SaveBillReceiptbilltariffRequest): Promise<SaveBillReceiptbilltariffResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveBillReceiptbilltariffEx(request, headers, runtime);
  }

  /**
   * Description: 保存应收资费项
   * Summary: 保存应收资费项
   */
  async saveBillReceiptbilltariffEx(request: SaveBillReceiptbilltariffRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveBillReceiptbilltariffResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveBillReceiptbilltariffResponse>(await this.doRequest("1.0", "digital.logistic.bill.receiptbilltariff.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveBillReceiptbilltariffResponse({}));
  }

  /**
   * Description: 核销应付资费项
   * Summary: 核销应付资费项
   */
  async verifyBillPaybill(request: VerifyBillPaybillRequest): Promise<VerifyBillPaybillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyBillPaybillEx(request, headers, runtime);
  }

  /**
   * Description: 核销应付资费项
   * Summary: 核销应付资费项
   */
  async verifyBillPaybillEx(request: VerifyBillPaybillRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyBillPaybillResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyBillPaybillResponse>(await this.doRequest("1.0", "digital.logistic.bill.paybill.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyBillPaybillResponse({}));
  }

  /**
   * Description: 核销应收资费项
   * Summary: 核销应收资费项
   */
  async verifyBillReceiptbillorder(request: VerifyBillReceiptbillorderRequest): Promise<VerifyBillReceiptbillorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.verifyBillReceiptbillorderEx(request, headers, runtime);
  }

  /**
   * Description: 核销应收资费项
   * Summary: 核销应收资费项
   */
  async verifyBillReceiptbillorderEx(request: VerifyBillReceiptbillorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<VerifyBillReceiptbillorderResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyBillReceiptbillorderResponse>(await this.doRequest("1.0", "digital.logistic.bill.receiptbillorder.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new VerifyBillReceiptbillorderResponse({}));
  }

  /**
   * Description: 更新应付账单
   * Summary: 更新应付账单
   */
  async updateBillPaybillorder(request: UpdateBillPaybillorderRequest): Promise<UpdateBillPaybillorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateBillPaybillorderEx(request, headers, runtime);
  }

  /**
   * Description: 更新应付账单
   * Summary: 更新应付账单
   */
  async updateBillPaybillorderEx(request: UpdateBillPaybillorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateBillPaybillorderResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBillPaybillorderResponse>(await this.doRequest("1.0", "digital.logistic.bill.paybillorder.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateBillPaybillorderResponse({}));
  }

  /**
   * Description: 更新应收账单
   * Summary: 更新应收账单
   */
  async updateBillReceiptbillorder(request: UpdateBillReceiptbillorderRequest): Promise<UpdateBillReceiptbillorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateBillReceiptbillorderEx(request, headers, runtime);
  }

  /**
   * Description: 更新应收账单
   * Summary: 更新应收账单
   */
  async updateBillReceiptbillorderEx(request: UpdateBillReceiptbillorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateBillReceiptbillorderResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateBillReceiptbillorderResponse>(await this.doRequest("1.0", "digital.logistic.bill.receiptbillorder.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateBillReceiptbillorderResponse({}));
  }

  /**
   * Description: 保存应付发票
   * Summary: 保存应付发票
   */
  async saveBillPayinvoice(request: SaveBillPayinvoiceRequest): Promise<SaveBillPayinvoiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveBillPayinvoiceEx(request, headers, runtime);
  }

  /**
   * Description: 保存应付发票
   * Summary: 保存应付发票
   */
  async saveBillPayinvoiceEx(request: SaveBillPayinvoiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveBillPayinvoiceResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveBillPayinvoiceResponse>(await this.doRequest("1.0", "digital.logistic.bill.payinvoice.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveBillPayinvoiceResponse({}));
  }

  /**
   * Description: 保存应收发票
   * Summary: 保存应收发票
   */
  async saveBillReceiptinvoice(request: SaveBillReceiptinvoiceRequest): Promise<SaveBillReceiptinvoiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveBillReceiptinvoiceEx(request, headers, runtime);
  }

  /**
   * Description: 保存应收发票
   * Summary: 保存应收发票
   */
  async saveBillReceiptinvoiceEx(request: SaveBillReceiptinvoiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveBillReceiptinvoiceResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveBillReceiptinvoiceResponse>(await this.doRequest("1.0", "digital.logistic.bill.receiptinvoice.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveBillReceiptinvoiceResponse({}));
  }

  /**
   * Description: 上传历史数据
   * Summary: 上传历史数据
   */
  async uploadBizFinancing(request: UploadBizFinancingRequest): Promise<UploadBizFinancingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadBizFinancingEx(request, headers, runtime);
  }

  /**
   * Description: 上传历史数据
   * Summary: 上传历史数据
   */
  async uploadBizFinancingEx(request: UploadBizFinancingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadBizFinancingResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadBizFinancingResponse>(await this.doRequest("1.0", "digital.logistic.biz.financing.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadBizFinancingResponse({}));
  }

  /**
   * Description: 上传订单
   * Summary: 上传订单
   */
  async uploadBizOrder(request: UploadBizOrderRequest): Promise<UploadBizOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadBizOrderEx(request, headers, runtime);
  }

  /**
   * Description: 上传订单
   * Summary: 上传订单
   */
  async uploadBizOrderEx(request: UploadBizOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadBizOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadBizOrderResponse>(await this.doRequest("1.0", "digital.logistic.biz.order.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadBizOrderResponse({}));
  }

  /**
   * Description: 创建船公司did账户
   * Summary: 创建船公司did账户
   */
  async createDidCarrier(request: CreateDidCarrierRequest): Promise<CreateDidCarrierResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createDidCarrierEx(request, headers, runtime);
  }

  /**
   * Description: 创建船公司did账户
   * Summary: 创建船公司did账户
   */
  async createDidCarrierEx(request: CreateDidCarrierRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateDidCarrierResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDidCarrierResponse>(await this.doRequest("1.0", "digital.logistic.did.carrier.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateDidCarrierResponse({}));
  }

  /**
   * Description:  货代授权
   * Summary:  货代授权
   */
  async authSysForwarder(request: AuthSysForwarderRequest): Promise<AuthSysForwarderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authSysForwarderEx(request, headers, runtime);
  }

  /**
   * Description:  货代授权
   * Summary:  货代授权
   */
  async authSysForwarderEx(request: AuthSysForwarderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthSysForwarderResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthSysForwarderResponse>(await this.doRequest("1.0", "digital.logistic.sys.forwarder.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthSysForwarderResponse({}));
  }

  /**
   * Description: master提单信息查询
   * Summary: master提单信息查询
   */
  async queryBizMasterbl(request: QueryBizMasterblRequest): Promise<QueryBizMasterblResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryBizMasterblEx(request, headers, runtime);
  }

  /**
   * Description: master提单信息查询
   * Summary: master提单信息查询
   */
  async queryBizMasterblEx(request: QueryBizMasterblRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryBizMasterblResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryBizMasterblResponse>(await this.doRequest("1.0", "digital.logistic.biz.masterbl.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryBizMasterblResponse({}));
  }

  /**
   * Description: 应付发票文件上传接口
   * Summary: 应付发票文件上传接口
   */
  async saveBizPayinvoicefile(request: SaveBizPayinvoicefileRequest): Promise<SaveBizPayinvoicefileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveBizPayinvoicefileEx(request, headers, runtime);
  }

  /**
   * Description: 应付发票文件上传接口
   * Summary: 应付发票文件上传接口
   */
  async saveBizPayinvoicefileEx(request: SaveBizPayinvoicefileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveBizPayinvoicefileResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveBizPayinvoicefileResponse>(await this.doRequest("1.0", "digital.logistic.biz.payinvoicefile.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveBizPayinvoicefileResponse({}));
  }

  /**
   * Description: 托运订单保存接口
   * Summary: 托运订单保存接口
   */
  async saveBiznewOrder(request: SaveBiznewOrderRequest): Promise<SaveBiznewOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveBiznewOrderEx(request, headers, runtime);
  }

  /**
   * Description: 托运订单保存接口
   * Summary: 托运订单保存接口
   */
  async saveBiznewOrderEx(request: SaveBiznewOrderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveBiznewOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveBiznewOrderResponse>(await this.doRequest("1.0", "digital.logistic.biznew.order.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveBiznewOrderResponse({}));
  }

  /**
   * Description: 订舱单创建接口
   * Summary: 订舱单创建接口
   */
  async saveBiznewBooking(request: SaveBiznewBookingRequest): Promise<SaveBiznewBookingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveBiznewBookingEx(request, headers, runtime);
  }

  /**
   * Description: 订舱单创建接口
   * Summary: 订舱单创建接口
   */
  async saveBiznewBookingEx(request: SaveBiznewBookingRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveBiznewBookingResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveBiznewBookingResponse>(await this.doRequest("1.0", "digital.logistic.biznew.booking.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveBiznewBookingResponse({}));
  }

  /**
   * Description: 拖车单保存接口
   * Summary: 拖车单保存接口
   */
  async saveBiznewVehicle(request: SaveBiznewVehicleRequest): Promise<SaveBiznewVehicleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveBiznewVehicleEx(request, headers, runtime);
  }

  /**
   * Description: 拖车单保存接口
   * Summary: 拖车单保存接口
   */
  async saveBiznewVehicleEx(request: SaveBiznewVehicleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveBiznewVehicleResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveBiznewVehicleResponse>(await this.doRequest("1.0", "digital.logistic.biznew.vehicle.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveBiznewVehicleResponse({}));
  }

  /**
   * Description: 报关单保存接口
   * Summary: 报关单保存接口
   */
  async saveBiznewCustoms(request: SaveBiznewCustomsRequest): Promise<SaveBiznewCustomsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveBiznewCustomsEx(request, headers, runtime);
  }

  /**
   * Description: 报关单保存接口
   * Summary: 报关单保存接口
   */
  async saveBiznewCustomsEx(request: SaveBiznewCustomsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveBiznewCustomsResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveBiznewCustomsResponse>(await this.doRequest("1.0", "digital.logistic.biznew.customs.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveBiznewCustomsResponse({}));
  }

  /**
   * Description: 航运提单保存接口
   * Summary: 航运提单保存接口
   */
  async saveBiznewMaster(request: SaveBiznewMasterRequest): Promise<SaveBiznewMasterResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveBiznewMasterEx(request, headers, runtime);
  }

  /**
   * Description: 航运提单保存接口
   * Summary: 航运提单保存接口
   */
  async saveBiznewMasterEx(request: SaveBiznewMasterRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveBiznewMasterResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveBiznewMasterResponse>(await this.doRequest("1.0", "digital.logistic.biznew.master.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveBiznewMasterResponse({}));
  }

  /**
   * Description: 应付账单保存接口
   * Summary: 应付账单保存接口
   */
  async saveBiznewPaybillorder(request: SaveBiznewPaybillorderRequest): Promise<SaveBiznewPaybillorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveBiznewPaybillorderEx(request, headers, runtime);
  }

  /**
   * Description: 应付账单保存接口
   * Summary: 应付账单保存接口
   */
  async saveBiznewPaybillorderEx(request: SaveBiznewPaybillorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveBiznewPaybillorderResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveBiznewPaybillorderResponse>(await this.doRequest("1.0", "digital.logistic.biznew.paybillorder.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveBiznewPaybillorderResponse({}));
  }

  /**
   * Description: 应收账单保存接口
   * Summary: 应收账单保存接口
   */
  async saveBiznewReceiptbillorder(request: SaveBiznewReceiptbillorderRequest): Promise<SaveBiznewReceiptbillorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveBiznewReceiptbillorderEx(request, headers, runtime);
  }

  /**
   * Description: 应收账单保存接口
   * Summary: 应收账单保存接口
   */
  async saveBiznewReceiptbillorderEx(request: SaveBiznewReceiptbillorderRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveBiznewReceiptbillorderResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveBiznewReceiptbillorderResponse>(await this.doRequest("1.0", "digital.logistic.biznew.receiptbillorder.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveBiznewReceiptbillorderResponse({}));
  }

  /**
   * Description: 航运发票保存接口
   * Summary: 航运发票保存接口
   */
  async saveBiznewInvoice(request: SaveBiznewInvoiceRequest): Promise<SaveBiznewInvoiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.saveBiznewInvoiceEx(request, headers, runtime);
  }

  /**
   * Description: 航运发票保存接口
   * Summary: 航运发票保存接口
   */
  async saveBiznewInvoiceEx(request: SaveBiznewInvoiceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<SaveBiznewInvoiceResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveBiznewInvoiceResponse>(await this.doRequest("1.0", "digital.logistic.biznew.invoice.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new SaveBiznewInvoiceResponse({}));
  }

  /**
   * Description: 上传电子提单
   * Summary: 上传电子提单
   */
  async uploadShippingEbl(request: UploadShippingEblRequest): Promise<UploadShippingEblResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadShippingEblEx(request, headers, runtime);
  }

  /**
   * Description: 上传电子提单
   * Summary: 上传电子提单
   */
  async uploadShippingEblEx(request: UploadShippingEblRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadShippingEblResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadShippingEblResponse>(await this.doRequest("1.0", "digital.logistic.shipping.ebl.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadShippingEblResponse({}));
  }

  /**
   * Description: 电子提单批次上传，一个I批次下传递多个提单
   * Summary: 电子提单批次上传
   */
  async uploadShippingEblbatch(request: UploadShippingEblbatchRequest): Promise<UploadShippingEblbatchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.uploadShippingEblbatchEx(request, headers, runtime);
  }

  /**
   * Description: 电子提单批次上传，一个I批次下传递多个提单
   * Summary: 电子提单批次上传
   */
  async uploadShippingEblbatchEx(request: UploadShippingEblbatchRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UploadShippingEblbatchResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadShippingEblbatchResponse>(await this.doRequest("1.0", "digital.logistic.shipping.eblbatch.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UploadShippingEblbatchResponse({}));
  }

  /**
   * Description: 感知收货人提单状态的变更
   * Summary: 电子提单批次状态变更
   */
  async updateShippingEblbatchstatus(request: UpdateShippingEblbatchstatusRequest): Promise<UpdateShippingEblbatchstatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateShippingEblbatchstatusEx(request, headers, runtime);
  }

  /**
   * Description: 感知收货人提单状态的变更
   * Summary: 电子提单批次状态变更
   */
  async updateShippingEblbatchstatusEx(request: UpdateShippingEblbatchstatusRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateShippingEblbatchstatusResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateShippingEblbatchstatusResponse>(await this.doRequest("1.0", "digital.logistic.shipping.eblbatchstatus.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateShippingEblbatchstatusResponse({}));
  }

}
