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

// 承运人责任险保险标的信息
export class InsureCarrierObjectInfo extends $tea.Model {
  // 厂牌型号
  cpModel?: string;
  // 车架号
  frameNo?: string;
  // 车牌号码
  licenseNo?: string;
  // 吨位
  tonNage?: string;
  // 行驶证车主
  drivPer?: string;
  // 运营证号
  runNo?: string;
  // 运输货物
  tsCarGo?: string;
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

// 货主支付方式
export class PayAmount extends $tea.Model {
  // 支付金额（2位小数）
  amount?: string;
  // 支付方式
  payType?: string;
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

// 提单货物数据
export class MasterBlGoodsDto extends $tea.Model {
  // 唛头
  marks?: string;
  // 货物
  goods?: string;
  // 货物类型
  goodsType?: string;
  // 包装类型
  packageType?: string;
  // 委托件数
  number?: string;
  // 委托重量
  weight?: string;
  // 委托体积
  volume?: string;
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

// 电子提单批次下提单明细（无效）
export class EblDeatil extends $tea.Model {
  // 电子提单copy文件hash
  eblCopyPdfFileHash?: string;
  // 电子提单copy文件id
  eblCopyPdfFileId?: string;
  // 电子提单编号
  eblNo?: string;
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
  receiptTariffInvoiceCode?: string;
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

// 集装箱列表
export class HouseBlContainerParam extends $tea.Model {
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 集装箱ID
  containerId?: string;
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

// 订舱单
export class MasterBlBookingParam extends $tea.Model {
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 订舱单号
  bookingNo?: string;
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

// 上传booking信息
export class UploadOrderBooking extends $tea.Model {
  // 订舱单号
  bookingNo?: string;
  // 集装箱号  json字符串上传
  containerNos?: string;
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

// 资费项账单
export class PayBillTariffParam extends $tea.Model {
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 账单金额 业务必填
  billAmount?: string;
  // 应付账单、应付资费项 多对多code
  payBillTariffCode?: string;
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

// 箱子信息
export class VehicleContainerParam extends $tea.Model {
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 集装箱ID
  containerId?: string;
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

// 包含文件id、文件hash信息
export class UploadFileInfo extends $tea.Model {
  // 文件id
  fileId?: string;
  // 文件hash
  fileHash?: string;
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

// 物流金融信用流转流水信息
export class StatementInfo extends $tea.Model {
  // 信用流转批次号
  batchId?: string;
  // 全局唯一业务号
  outBizNo?: string;
  // 信用流转凭证
  issueId?: string;
  // 合同号（预留）
  contractId?: string;
  // 发行信用流转的运单号
  waybillId?: string;
  // 发行信用流转的支付单号
  payOrder?: string;
  // 金额信息
  creditLimit?: string;
  // 流水类型
  stateType?: string;
  // 流水类型说明
  stateMsg?: string;
  // 凭证来源方did
  fromDid?: string;
  // 凭证流转方did
  toDid?: string;
  // 信用凭证发起时间
  issueDate?: string;
  // 信用凭证到期时间
  expireDate?: string;
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

// 订舱单号
export class CustomsOrderBookingParam extends $tea.Model {
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 订舱单号
  bookingNo?: string;
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

// 信用凭证数据集合
export class IssueTransferData extends $tea.Model {
  // 凭证id
  issueId?: string;
  // 转出方did
  payerDid?: string;
  // 接收方did
  rcvDid?: string;
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

// 电子提单变更状态明细
export class EblStatusDetail extends $tea.Model {
  // 当前提单状态
  currentEblStatus?: string;
  // 电子提单编号
  eblNo?: string;
  // 下一个提单状态
  nextEblStatus?: string;
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
  platformDid?: string;
  // 运单id
  taxWaybillId?: string;
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

// 凭证id发行信息
export class IssueIdInfo extends $tea.Model {
  // 信用流转凭证
  issueId?: string;
  // 全局唯一业务号
  outBizNo?: string;
  // 合同号（预留）
  contractId?: string;
  // 发行信用流转的运单号
  waybillId?: string;
  // 支付订单
  payOrder?: string;
  // 凭证金额
  ticketAmt?: string;
  // 信用凭证发起时间
  issueDate?: string;
  // 信用凭证到期时间
  expireDate?: string;
  // 发行结果状态 -1:发行失败状态， 0:未完成状态， 1:已发行状态
  status?: number;
  // 失败原因信息
  errMsg?: string;
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

// 运单号-司机运费
export class WaybillAmount extends $tea.Model {
  // 运单金额（2位小数）
  amount?: string;
  // 运单号
  waybillId?: string;
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

// so通知关联的订舱单
export class SoNotifyBookingParam extends $tea.Model {
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 订舱单号
  bookingNo?: string;
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

// 电子回单查询凭证数据
export class ScpTicketIssueDataParam extends $tea.Model {
  // 凭证id
  issueId?: string;
  // 凭证对应的司机/货主的did
  did?: string;
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

// saas模式发行信息
export class SaasIssueApplyInfo extends $tea.Model {
  // 货源订单
  cargoOrder?: string;
  // 合同号
  contractId?: string;
  // 全局唯一业务单号
  outBizNo?: string;
  // 支付单号
  payOrder?: string;
  // 运单号
  waybillId?: string;
  // 司机did
  driverDid?: string;
  // 发行费
  freight?: string;
  // 到期时间戳
  expireDate?: string;
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

// 资费项账单
export class ReceiptBillTariffParam extends $tea.Model {
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  //  账单金额 业务必填
  billAmount?: string;
  // 应收账单 、应收资费项 多对多关联code 
  receiptBillTariffCode?: string;
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

// 凭证开立申请信息
export class IssueApplyInfo extends $tea.Model {
  // 货源订单
  cargoOrder?: string;
  // 合同号（预留）
  contractId?: string;
  // 凭证到期时间
  expireDate?: string;
  // 支付单运费，运费最多精确到小数点后2位
  freight?: string;
  // 全局唯一业务号
  outBizNo?: string;
  // 支付订单
  payOrder?: string;
  // 运单id
  waybillId?: string;
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

// 货源单号-货主运费
export class CargoAmount extends $tea.Model {
  // 货运单对应金额（2位小数）
  amount?: string;
  // 货源单号
  cargoOrder?: string;
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

// 集装箱列表
export class MasterBlContainerParam extends $tea.Model {
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 集装箱ID
  containerId?: string;
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

// 物流轨迹位置
export class LogisticLocation extends $tea.Model {
  // 结构化地址信息,规则遵循：国家、省份、城市、区县、城镇、乡村、街道、门牌号码、屋邨、大厦
  address?: string;
  // 行政区划代码
  cityCode?: string;
  // 纬度
  // 
  lat?: string;
  // 经度
  lon?: string;
  // 轨迹时间戳
  trackTime?: number;
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

// 订舱单
export class HouseBlBookingParam extends $tea.Model {
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 订舱单号
  bookingNo?: string;
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

// 池融资授信额度信息
export class PfCreditQuotaInfo extends $tea.Model {
  // 证件号
  certNo?: string;
  // 证件类型
  certType?: string;
  // 授信到期日期
  creditEnd?: string;
  // 授信起始日期
  creditStart?: string;
  // 额度编号
  quotaNo?: string;
  // 剩余额度
  remainingQuota?: string;
  // SON:放款账号loanAccNo
  // 还款账号repayAcctNo
  remark?: string;
  // 额度状态：
  // 0、停用 / 1、启用  /  2、冻结
  status?: string;
  // 授信额度
  totalQuota?: string;
  // 数据更新时间
  updateTime?: string;
  // 总质押额度
  totalPledgeQuota?: string;
  // 剩余质押额度
  remainPledgeQuota?: string;
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
  payTariffInvoiceCode?: string;
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

// 应付账单发票关联项
export class PayBillInvoiceParam extends $tea.Model {
  // 账单发票code
  payBillInvoiceCode?: string;
  // 账单编号
  payBillOrderCode?: string;
  // 账单金额
  payBillAmount?: string;
  // 发票金额
  invoiceAmount?: string;
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

// 投保基本信息
export class InsureBaseInfo extends $tea.Model {
  // 投保人姓名
  tbrName?: string;
  // 投保人证件号
  tbrIdNo?: string;
  // 投保人证件类型
  tbrIdType?: string;
  // 投保人联系电话
  tbrTel?: string;
  // 投保人地址
  tbrAddr?: string;
  // 投保人邮箱
  tbrEmail?: string;
  // 被保险人姓名
  bbrName?: string;
  // 被保险人证件类型
  bbrIdType?: string;
  // 被保险人证件号码
  bbrIdNo?: string;
  // 被保险人联系电话
  bbrTel?: string;
  // 被保险人地址
  bbrAddr?: string;
  // 含税保费(元)，小数点两位
  preMium?: string;
  // 保险起期
  effDate?: string;
  // 保险止期
  termDate?: string;
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

// 电子回单查询，具体凭证数据
export class ScpTicketIssueData extends $tea.Model {
  // 凭证对应的司机/货主的did
  did?: string;
  // 	
  // 凭证id
  issueId?: string;
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

// 上传订单总金额
export class UploadOrderAmount extends $tea.Model {
  // 币种
  currency?: string;
  // 总金额
  totalAmount?: string;
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

// 电子提单批次下提单明细
export class EblDetail extends $tea.Model {
  // 电子提单copy文件hash
  eblCopyPdfFileHash?: string;
  // 电子提单copy文件id
  eblCopyPdfFileId?: string;
  // 电子提单编号
  eblNo?: string;
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

// A+模式发行信息
export class IssueApplyInfoPlus extends $tea.Model {
  // 订单中的BookingNo，以英文逗号分割
  bookingNo?: string;
  // 船公司did
  carrierDid?: string;
  // BookingNo中的箱号，以英文逗号分割
  containerNo?: string;
  // 到期时间戳
  expireDate?: string;
  // 发行金额，精确到小数点后2位
  issueAmt?: string;
  // 全局唯一业务号
  outBizNo?: string;
  // 支付单号
  outOrderNo?: string;
  // 运单订单id
  waybillId?: string;
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

// 历史数据
export class UploadFinancingParam extends $tea.Model {
  // 订舱单量（票）
  bookingCount?: number;
  // 唯一标识
  code?: string;
  // 结束日期
  endDate?: string;
  // 货代did
  forwarderDid?: string;
  // 开始日期
  startDate?: string;
  // 箱量【数量，不区分箱型，20GP是1TEU，40GP是2TEU】
  teu?: number;
  // 运输总额
  amounts?: string;
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
  txCode?: string;
  // 链上存储结构对应类型
  dataType?: string;
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

// 用户凭证信息
export class UserIssueId extends $tea.Model {
  // 凭证id
  issueId?: string;
  // 凭证余额
  balanceAmt?: string;
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

// 电子提单变更状态明细（无效）
export class EblStatusDeatil extends $tea.Model {
  // 当前提单状态
  currentEblStatus?: string;
  // 电子提单编号
  eblNo?: string;
  // 下一个提单状态
  nextEblStatus?: string;
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

export class CreateDigitalLogisticPlatformDidRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 企业名称
  epCertName?: string;
  // 企业信用号码
  epCertNo?: string;
  // 企业法人姓名
  legalPersonCertName?: string;
  // 企业法人身份证号码
  legalPersonCertNo?: string;
  // 扩展字段
  extensionInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateDigitalLogisticPlatformDidResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateDigitalLogisticAgentDidRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 创建did的代理did
  agentDid?: string;
  // 企业名称
  epCertName?: string;
  // 企业信用号码
  epCertNo?: string;
  // 扩展字段
  extensionInfo?: string;
  // 企业法人姓名
  legalPersonCertName?: string;
  // 企业法人身份证号码
  legalPersonCertNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateDigitalLogisticAgentDidResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateDigitalLogisticConsignorDisRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 企业名称
  epCertName?: string;
  // 企业信用号码
  epCertNo?: string;
  // 扩展字段
  extensionInfo?: string;
  // 企业法人姓名
  legalPersonCertName?: string;
  // 企业法人身份证号码
  legalPersonCertNo?: string;
  // 所属承运平台did
  platformDid?: string;
  // 是否核验货主四要素，如果为true  法人姓名和法人身份证号为必填
  checkAll?: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateDigitalLogisticConsignorDisResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateDigitalLogisticDriverDisRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 司机身份证号码
  certNo?: string;
  // 扩展字段
  extensionInfo?: string;
  // 司机手机号码
  mobile?: string;
  // 司机姓名
  name?: string;
  // 所属承运平台did
  platformDid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateDigitalLogisticDriverDisResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateDigitalLogisticCargoOrderRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 运费
  allFreight?: string;
  // 货物行业编码
  cargoBusinessCode?: string;
  // 货物商品编码
  cargoCode?: string;
  // 货运险金额
  cargoInsuranceMoney?: string;
  // 货物名称
  cargoName?: string;
  // 货源单号
  cargoOrder?: string;
  // 货物类型
  cargoType?: string;
  // 货物单位
  cargoUnit?: string;
  // 货物体积，单位（方）
  cargoVolume?: string;
  // 货主did
  consignorDid?: string;
  // 卸货地，XX省-XX市-XX区
  deliveryPlace?: string;
  // 装货地，XX省-XX市-XX区
  loadingPlace?: string;
  // 所属承运平台did
  platformDid?: string;
  // 货源单创建时间
  startTime?: number;
  // 联系人电话
  userPhone?: string;
  // 货物重量，单位（吨）
  weight?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateDigitalLogisticCargoOrderResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateDigitalLogisticCargoPayRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  //  收款方银行账号
  bankAccountOfPayee?: string;
  // 付款方银行账号,货主付款的开户银行账号
  bankAccountOfPayer?: string;
  // 银行流水号
  bankNo?: string;
  // 收款方开户行（平台收款）
  // 取值：
  // MYBank_CloudCapital_2,  ## 云资金2.0
  bankOfPayee?: string;
  // MYBank_CloudCapital_2,  ## 云资金2.0
  bankOfPayer?: string;
  // 货源单号
  cargoOrder?: string;
  // 核验渠道，请按取值约束值填入。
  // 
  // YBank_CloudCapital_2,  ## 云资金2.0
  checkChannel?: string;
  // CNY、USD
  // 币种
  currency?: string;
  // 费用类型 (运费、调度费、服务费)
  expenseType?: string;
  // 收款方名称
  payee?: string;
  // 付款方名称
  payer?: string;
  // 费用金额
  payment?: string;
  // 是否核验
  payCheck?: boolean;
  // 付款方did
  payDid?: string;
  // 平台支付单号
  payId?: string;
  // 支付备注
  payNote?: string;
  // 支付时间
  payTime?: number;
  // 支付类型
  payType?: string;
  // 收款方did
  recvDid?: string;
  // 支持关联单个运单和多个运单
  taxWaybillIds?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateDigitalLogisticCargoPayResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateDigitalLogisticWaybillOrderRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
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
  cartBadgeColor?: string;
  // 车牌号
  // 
  cartBadgeNo?: string;
  // 承运商did
  carCaptainDid?: string;
  // 货主运费金额，单位（元），货主支付给平台的运费金额
  consignorFreightAmount?: string;
  // 建单时间，13位毫秒级时间戳
  // 
  createdTime?: number;
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
  drawee?: string;
  // 发货方纳税人识别号
  // 
  draweeTaxNo?: string;
  // 司机分布式身份
  driverDid?: string;
  // 司机姓名 已填司机分布式身份的情况下可不填
  // 
  driverName?: string;
  // 目的地详细地址
  endAddress?: string;
  // 目的地城市CODE，6位区域行政编码
  // 
  endCityCode?: string;
  // 目的地城市名称
  // 
  endCityName?: string;
  // 目的地区县CODE，6位区域行政编码
  endCountyCode?: string;
  // 目的地区县名称
  // 
  endCountyName?: string;
  // 结束行政区划代码，12位区域行政编码，（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
  // 
  endDivisionCode?: string;
  // 目的地省份CODE，6位区域行政编码
  // 
  endProvinceCode?: string;
  // 目的地省份名称
  // 
  endProvinceName?: string;
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
  goodsName?: string;
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
  platformDid?: string;
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
  startCityCode?: string;
  // 起始地城市名称
  // 
  startCityName?: string;
  // 起始地区县CODE，6位区域行政编码
  startCountyCode?: string;
  // 起始地区县名称
  // 
  startCountyName?: string;
  // 起始行政区划代码，12位区域行政编码（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
  // 
  startDivisionCode?: string;
  // 起始地省份CODE，6位区域行政编码
  startProvinceCode?: string;
  // 起始地省份名称
  // 
  startProvinceName?: string;
  // 起始地街道CODE，12区域行政编码
  startStreetCode?: string;
  // 起始地街道名称
  startStreetName?: string;
  // 起运时间戳，13位毫秒级时间戳
  startTime?: number;
  // 运单id
  // 
  taxWaybillId?: string;
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
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateDigitalLogisticWaybillOrderResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateDigitalLogisticWaybillPayRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 确认到账时间
  // 
  arriveTime?: number;
  // 关联银行流水号
  // 
  bankSn?: string;
  // 付款金额
  // 
  payAmount?: string;
  // 付款方银行账号
  // 
  payBankCardNo?: string;
  // 付款方开户行
  // 
  payBankName?: string;
  // 是否核验
  payCheck?: boolean;
  // 付款方did
  // 
  payDid?: string;
  // 付款方名称
  // 
  payName?: string;
  // 付款时间戳
  // 
  payTime?: number;
  // 支付类型
  // 
  payTypeNew?: string;
  // 支付方式
  // 
  payWay?: string;
  // 无车承运平台分布式数字身份，缺省为自己的分布式数字身份
  // 
  platformDid?: string;
  // 支付订单ID
  // 
  posInfoId?: string;
  // 实际付款方开户行
  // 
  realPayBank?: string;
  // 实际付款方银行账号
  // 
  realPayBankCardNo?: string;
  // 实际付款方名称
  // 
  realPayName?: string;
  // 收款方银行账号
  // 
  recvBankCardNo?: string;
  // 收款方开户行
  // 
  recvBankName?: string;
  // 收款方did
  // 
  recvDid?: string;
  // 收款方名称
  // 
  recvName?: string;
  // 关联的运单ID
  // 
  waybillId?: string;
  // MYBank_CloudCapital_1,  ## 云资金1.0
  // MYBank_CloudCapital_2,  ## 云资金2.0
  checkChannel?: string;
  // CNY, USD
  currency?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateDigitalLogisticWaybillPayResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ImportDigitalLogisticWaybillLocationRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 描述信息
  // 
  desc?: string;
  // 运单轨迹信息
  location?: LogisticLocation[];
  // 所属平台分布式数字身份，缺省时为自己的分布式数字身份
  // 
  platformDid?: string;
  // 运单id
  // 
  taxWaybillId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class ImportDigitalLogisticWaybillLocationResponse extends $tea.Model {
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

export class CreateDigitalLogisticWaybillBillRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 受票方名称
  // 
  drawee?: string;
  // 受票方纳税人识别号
  // 
  draweeTaxNo?: string;
  // 发票代码
  // 
  lzfpdm?: string;
  // 发票号码
  // 
  lzfphm?: string;
  // 开票时间戳
  // 
  openTime?: number;
  // 所属平台的分布式数字身份，缺省时为自己的分布式数字身份
  // 
  platformDid?: string;
  // 关联的运单ID
  // 
  waybillId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateDigitalLogisticWaybillBillResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryDigitalLogisticWaybillStatusRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
  // 
  platformDid?: string;
  // 运单ID
  // 
  taxWaybillId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      platformDid: 'platform_did',
      taxWaybillId: 'tax_waybill_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      platformDid: 'string',
      taxWaybillId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDigitalLogisticWaybillStatusResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class FinishDigitalLogisticWaybillOrderRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链上账号 与司机did 二选一填写
  // 
  accountId?: string;
  // 运费，单位（元），平台支付给司机的运费
  allFreight?: string;
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
  cartBadgeColor?: string;
  // 车牌号
  // 
  cartBadgeNo?: string;
  // 承运商did
  carCaptainDid?: string;
  // 货主运费金额，货主支付给平台的运费金额
  consignorFreightAmount?: string;
  // 建单时间，13位毫秒级时间戳
  createdTime?: number;
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
  drawee?: string;
  // 发货方纳税人识别号
  // 
  draweeTaxNo?: string;
  // 司机分布式数字身份
  // 
  driverDid?: string;
  // 司机姓名 已填司机分布式身份的情况下可不填
  // 
  driverName?: string;
  // 目的地详细地址
  endAddress?: string;
  // 目的地城市CODE，6位区域行政编
  endCityCode?: string;
  // 目的地城市名称
  // 
  endCityName?: string;
  // 目的地区县CODE，6位区域行政编
  endCountyCode?: string;
  // 目的地区县名称
  // 
  endCountyName?: string;
  // 结束行政区划代码 ，12位区域行政编，（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
  // 
  endDivisionCode?: string;
  // 目的地省份CODE，6位区域行政编
  // 
  endProvinceCode?: string;
  // 目的地省份名称
  // 
  endProvinceName?: string;
  // 目的地街道CODE，12位行政区域编码
  endStreetCode?: string;
  // 目的地街道名称
  endStreetName?: string;
  // 终结时间，13位毫秒级时间戳
  endTime?: number;
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
  goodsName?: string;
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
  platformDid?: string;
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
  startCityCode?: string;
  // 起始地城市名称
  // 
  startCityName?: string;
  // 起始地区县CODE
  // ，6位区域行政编
  startCountyCode?: string;
  // 起始地区县名称
  // 
  startCountyName?: string;
  // 起始行政区划代码，12位区域行政编，（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
  // 
  startDivisionCode?: string;
  // 起始地省份CODE
  // ，6位区域行政编
  startProvinceCode?: string;
  // 起始地省份名称
  // 
  startProvinceName?: string;
  // 起始地街道CODE，12位区域行政编
  startStreetCode?: string;
  // 起始地街道名称
  startStreetName?: string;
  // 起运时间，13位毫秒级时间戳
  // 
  startTime?: number;
  // 运单ID
  // 
  taxWaybillId?: string;
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
      regionName: 'region_name',
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
      regionName: 'string',
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

export class FinishDigitalLogisticWaybillOrderResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateDigitalLogisticCargoPayorderRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
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
  cargoOrder?: string;
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
  expenseType?: string;
  // 收款方名称
  payee?: string;
  // 付款方名称
  payer?: string;
  // 费用金额（运单维度）
  // 
  payment?: string;
  // 是否核验
  payCheck?: boolean;
  // 付款方did
  // 
  payDid?: string;
  // 支付单号
  // 
  payId?: string;
  // 支付备注
  // 
  payNote?: string;
  // 支付时间
  // 
  payTime?: number;
  // 支付类型
  // 
  payType?: string;
  // 所属平台did
  platformDid?: string;
  // 收款方did
  recvDid?: string;
  // 请求唯一标识
  requestId?: string;
  // 运单号
  taxWaybillId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateDigitalLogisticCargoPayorderResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class SaveDigitalLogisticWaybillOrderRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 链上账号 与司机did 二选一填写
  // 
  accountId?: string;
  // 运费，单位（元），平台支付给司机的运费
  allFreight?: string;
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
  cartBadgeColor?: string;
  // 车牌号
  // 
  cartBadgeNo?: string;
  // 承运商did
  carCaptainDid?: string;
  // 货主运费金额，货主支付给平台的运费
  // 
  consignorFreightAmount?: string;
  // 建单时间，13位毫秒级时间戳
  createdTime?: number;
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
  drawee?: string;
  // 发货方纳税人识别号
  // 
  draweeTaxNo?: string;
  // 司机分布式数字身份
  // 
  driverDid?: string;
  // 司机姓名 已填司机分布式身份的情况下可不填
  // 
  driverName?: string;
  // 目的地详细地址
  endAddress?: string;
  // 目的地城市CODE，6位区域行政编码
  // 
  endCityCode?: string;
  // 目的地城市名称
  // 
  endCityName?: string;
  // 目的地区县CODE，6位区域行政编码
  endCountyCode?: string;
  // 目的地区县名称
  // 
  endCountyName?: string;
  // 结束行政区划代码（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
  // 
  endDivisionCode?: string;
  // 目的地省份CODE，6位区域行政编码
  endProvinceCode?: string;
  // 目的地省份名称
  // 
  endProvinceName?: string;
  // 目的地街道CODE，12位区域行政编码
  endStreetCode?: string;
  // 目的地街道名称
  endStreetName?: string;
  // 运达时间，13位毫秒级时间戳
  endTime?: number;
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
  goodsName?: string;
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
  platformDid?: string;
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
  startCityCode?: string;
  // 起始地城市名称
  // 
  startCityName?: string;
  // 起始地区县CODE，6位区域行政编码
  // 
  // 
  startCountyCode?: string;
  // 起始地区县名称
  // 
  startCountyName?: string;
  // 起始行政区划代码（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
  // 
  startDivisionCode?: string;
  // 起始地省份CODE，6位区域行政编码
  // 
  // 
  startProvinceCode?: string;
  // 起始地省份名称
  // 
  startProvinceName?: string;
  // 起始地街道CODE，12位区域行政编码
  startStreetCode?: string;
  // 起始地街道名称
  startStreetName?: string;
  // 起运时间，13位毫秒级时间戳
  startTime?: number;
  // 运单ID
  // 
  taxWaybillId?: string;
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
      regionName: 'region_name',
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
      regionName: 'string',
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

export class SaveDigitalLogisticWaybillOrderResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CloseDigitalLogisticWaybillOrderRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 无车承运平台分布式数字身份
  platformDid?: string;
  // 运单ID
  // 
  taxWaybillId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      platformDid: 'platform_did',
      taxWaybillId: 'tax_waybill_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      platformDid: 'string',
      taxWaybillId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CloseDigitalLogisticWaybillOrderResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class FinishDigitalLogisticFinanceWaybillRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
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
  // 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
  platformDid?: string;
  // 运单id
  taxWaybillId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class FinishDigitalLogisticFinanceWaybillResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class FinishDigitalLogisticFinanceTransportRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 运费
  allFreight?: string;
  // 回单押金
  backFee?: string;
  // 货主支付运费金额
  consignorFreightAmount?: string;
  // 到达门点时间
  destDoorsEndTime?: number;
  // 终结时间
  endTime?: number;
  // 运费增项
  freightIncr?: string;
  // 运费扣减
  lossFee?: string;
  // 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
  platformDid?: string;
  // 运单id
  taxWaybillId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class FinishDigitalLogisticFinanceTransportResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UpdateDigitalLogisticFinanceWaybillRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
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
  platformDid?: string;
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
  taxWaybillId?: string;
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
      regionName: 'region_name',
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
      regionName: 'string',
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

export class UpdateDigitalLogisticFinanceWaybillResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class StartDigitalLogisticFinanceWaybillRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 货物运费险
  cargoInsuranceMoney?: string;
  // 车牌颜色
  cartBadgeColor?: string;
  // 车牌号
  cartBadgeNo?: string;
  // 承运商did
  carCaptainDid?: string;
  // 司机分布式数字身份
  driverDid?: string;
  // 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
  platformDid?: string;
  // 起运时间，13位毫秒级时间戳
  startTime?: number;
  // 运单id
  taxWaybillId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class StartDigitalLogisticFinanceWaybillResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateDigitalLogisticCaptainDisRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 身份证号码
  certNo?: string;
  // 扩展字段
  extensionInfo?: string;
  // 手机号码
  mobile?: string;
  // 姓名
  name?: string;
  // 所属平台did
  platformDid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateDigitalLogisticCaptainDisResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateDigitalLogisticCargowaybillBillRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 货主账单总额（两位小数）
  billAmount?: string;
  // 账单code（唯一标识）
  billCode?: string;
  // 账单生成时间(毫秒)
  billCreateTime?: number;
  // 账单期限
  billDeadline?: string;
  // 付款方did
  billPayerDid?: string;
  // 货源单号-货主运费列表
  cargoAmounts?: CargoAmount[];
  // 币种
  currency?: string;
  // 货主支付方式-支付金额列表
  payAmounts?: PayAmount[];
  // 平台did
  platformDid?: string;
  // 预计货主付款日期
  preConsignorPayDate?: number;
  // 运单号-司机运费列表
  waybillAmounts?: WaybillAmount[];
  // 账单到期日期
  deadline?: number;
  // 运单上传状态，可填写：已完成、未完成
  waybillUploadStatus?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateDigitalLogisticCargowaybillBillResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ConfirmDigitalLogisticCargowaybillBillRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 账单金额（两位小数）
  billAmount?: string;
  // 账单code（账单唯一标识）
  billCode?: string;
  // 账单确认货主did
  billConsignorDid?: string;
  // 账单确认日期（毫秒）
  billSureDate?: number;
  // 是否结算
  whetherSettle?: boolean;
  // 平台did
  platformDid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class ConfirmDigitalLogisticCargowaybillBillResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateDigitalLogisticCargowaybillBillsettleRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 平台did
  platformDid?: string;
  // 账单code（账单唯一标识）
  billCode?: string;
  // 结算金额（2位小数）
  settleAmount?: string;
  // 结算状态（只有2种状态：部分结算、已结清）
  settleStatus?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateDigitalLogisticCargowaybillBillsettleResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UpdateDigitalLogisticWaybillorderPlatformdidRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 新平台diid
  newPlatformDid?: string;
  // 老平台did
  oldPlatformDid?: string;
  // 运单号
  taxWaybillId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      newPlatformDid: 'new_platform_did',
      oldPlatformDid: 'old_platform_did',
      taxWaybillId: 'tax_waybill_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      newPlatformDid: 'string',
      oldPlatformDid: 'string',
      taxWaybillId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDigitalLogisticWaybillorderPlatformdidResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UpdateDigitalLogisticCargowaybillBillRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 货主账单总额（两位小数）
  billAmount?: string;
  // 账单code（唯一标识）
  billCode?: string;
  // 账单生成时间(毫秒)
  billCreateTime?: number;
  // 账单期限
  billDeadline?: string;
  // 付款方did
  billPayerDid?: string;
  // 货源单号-货主运费列表
  cargoAmounts?: CargoAmount[];
  // 币种
  currency?: string;
  // 账单到期日期
  deadline?: number;
  // 货主支付方式-支付金额列表
  payAmounts?: PayAmount[];
  // 平台did
  platformDid?: string;
  // 预计货主付款日期
  preConsignorPayDate?: number;
  // 运单号-司机运费列表
  waybillAmounts?: WaybillAmount[];
  // 运单上传状态，可填写：已完成、未完成
  waybillUploadStatus?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class UpdateDigitalLogisticCargowaybillBillResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateDigitalLogisticDisDidRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
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
  organizationType?: string;
  // 所属承运平台did。在申请“网络货运平台”角色的时候，这个字段非必填；申请其他角色类型时，此字段必填
  platformDid?: string;
  // 角色类型。
  // 当组织类型为个人时，可填角色：货主、司机、承运商；
  // 当组织类型为企业时，可填角色：网络货运平台、道路运输企业/3pl、货主、子平台、承运商
  roleType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateDigitalLogisticDisDidResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UploadDigitalLogisticTransportContractRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 货主did，一般为合同甲方的链上数字身份
  consignorDid?: string;
  // 运输合同生效日期，格式要求yyyy-MM-dd
  contractEffectiveDate?: string;
  // 运输合同到期日期，要求格式yyyy-MM-dd
  contractExpiresDate?: string;
  // 影像件文件信息列表，可以包含多个文件，每个文件需要有文件id和文件hash  (请求蚂蚁影像上传接口获取的文件id和文件hash)。影像文件格式要求：bmp,jpg,jpeg,gif,psd,png,tiff,tga,eps,pdf
  fileInfos?: UploadFileInfo[];
  // 3plDid，一般为合同乙方的链上数字身份
  thirdPartyLogisticsDid?: string;
  // 运输合同编号
  transportContractCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      consignorDid: 'consignor_did',
      contractEffectiveDate: 'contract_effective_date',
      contractExpiresDate: 'contract_expires_date',
      fileInfos: 'file_infos',
      thirdPartyLogisticsDid: 'third_party_logistics_did',
      transportContractCode: 'transport_contract_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      consignorDid: 'string',
      contractEffectiveDate: 'string',
      contractExpiresDate: 'string',
      fileInfos: { 'type': 'array', 'itemType': UploadFileInfo },
      thirdPartyLogisticsDid: 'string',
      transportContractCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadDigitalLogisticTransportContractResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UploadDigitalLogisticTransportRouteRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 目的地省市区，要求格式 XX省-XX市-XX区，比如四川省-成都市-青白江区
  endAddress?: string;
  // 目的地详细地址，街道村社区道路楼宇门牌号
  endDetailedAddress?: string;
  // 起始地省市区，要求格式  XX省-XX市-XX区。比如浙江省-杭州市-余杭区
  startAddress?: string;
  // 起始地详细地址，街道村社区道路楼宇门牌号
  startDetailedAddress?: string;
  // 3plDid
  thirdPartyLogisticsDid?: string;
  // 运输合同编号
  transportContractCode?: string;
  // 运输线路编码
  transportRouteCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      endAddress: 'end_address',
      endDetailedAddress: 'end_detailed_address',
      startAddress: 'start_address',
      startDetailedAddress: 'start_detailed_address',
      thirdPartyLogisticsDid: 'third_party_logistics_did',
      transportContractCode: 'transport_contract_code',
      transportRouteCode: 'transport_route_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      endAddress: 'string',
      endDetailedAddress: 'string',
      startAddress: 'string',
      startDetailedAddress: 'string',
      thirdPartyLogisticsDid: 'string',
      transportContractCode: 'string',
      transportRouteCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadDigitalLogisticTransportRouteResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateDigitalLogisticTransportWaybillRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 运费，3pl支付给下承运商的运费金额，单位（元），要求格式为不超过二位小数
  allFreight?: string;
  // 货物名称
  cargoName?: string;
  // 货物体积，单位（方）。货物重量、货物体积二选一填写
  cargoVolume?: string;
  // 货物重量，单位（吨）。货物重量、货物体积二选一填写
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
  // 货物数量
  goodsAmount?: number;
  // 货物数量单位类型
  goodsAmountType?: string;
  // 起始地省市区，要求格式 XX省-XX市-XX区。比如浙江省-杭州市-余杭区
  startAddress?: string;
  // 起始地详细地址，街道村社区道路楼宇门牌号
  startDetailedAddress?: string;
  // 客户系统内运单编号
  taxWaybillId?: string;
  // 3plDid，一般为合同乙方的链上数字身份
  thirdPartyLogisticsDid?: string;
  // 所属合同编号
  transportContractCode?: string;
  // 所属运输线路编码
  transportRouteCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDigitalLogisticTransportWaybillResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UpdateDigitalLogisticWaybillActionRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 操作类型，以下二选一填写：运单起运、运输完成
  operateAction?: string;
  // 运单起运或运输完成的时间，要求为13位毫秒级时间戳
  operateActionTime?: number;
  // 客户系统内运单编号
  taxWaybillId?: string;
  // 3plDid，一般为合同乙方的链上数字身份
  thirdPartyLogisticsDid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class UpdateDigitalLogisticWaybillActionResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UpdateDigitalLogisticTransportWaybillRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
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
  taxWaybillId?: string;
  // 3plDid，一般为合同乙方的链上数字身份
  thirdPartyLogisticsDid?: string;
  // 所属合同编号
  transportContractCode?: string;
  // 所属运输线路编码
  transportRouteCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDigitalLogisticTransportWaybillResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UploadDigitalLogisticTransportReceiptRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 货主did，一般为合同甲方的链上数字身份
  consignorDid?: string;
  // 请求蚂蚁影像上传接口上传文件获取的文件id和文件hash信息。影像文件格式：bmp,jpg,jpeg,gif,psd,png,tiff,tga,eps,pdf
  fileInfo?: UploadFileInfo;
  // 回单id，客户编辑的唯一回单编码
  receiptId?: string;
  // 客户系统内运单编号
  taxWaybillId?: string;
  // 3plDid，一般为合同乙方的链上数字身份
  thirdPartyLogisticsDid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class UploadDigitalLogisticTransportReceiptResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateDigitalLogisticBillReceivablebillRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 账单总金额，单位（元），周期内应向发货方收取的运费总金额，不超过2位小数的数字
  billAmount?: string;
  // 账单生成时间，13位毫秒级时间戳
  billCreateTime?: number;
  // 账单期限，单位（天），合同约定的结算周期
  billDeadline?: number;
  // 账单id，客户生成的账单唯一编号
  billId?: string;
  // 收款方did，账单的收款方数字身份
  billPayeeDid?: string;
  // 付款方did，账单的付款方数字身份
  billPayerDid?: string;
  // 账单起始日期，13位毫秒级时间戳
  billStartTime?: number;
  // 关联合同编号，账单关联的合同编号，如为合同物流请填写
  // 
  contractCode?: string;
  // 账单到期日期，13位毫秒级时间戳
  deadline?: number;
  // 账单关联运单号数组，元素个数不能超过1000个
  waybillIds?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDigitalLogisticBillReceivablebillResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UpdateDigitalLogisticReceivablebillStatusRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 账单id，客户生成的账单唯一编号
  billId?: string;
  // 收款方did，账单的收款方数字身份
  billPayeeDid?: string;
  // 账单后续所可能产生的状态，以下三选一填写：账单确认、部分结算、已结清
  // 
  // 
  updateStatus?: string;
  // 更新状态时间，13位毫秒级时间戳
  updateStatusTime?: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class UpdateDigitalLogisticReceivablebillStatusResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UpdateDigitalLogisticBillReceivablebillRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 账单总金额，单位（元），周期内应向发货方收取的运费总金额，不超过2位小数的数字
  billAmount?: string;
  // 账单生成时间，13位毫秒级时间戳
  billCreateTime?: number;
  // 账单期限，单位（天），合同约定的结算周期
  billDeadline?: number;
  // 账单id，客户生成的账单唯一编号
  billId?: string;
  // 收款方did，账单的收款方数字身份
  billPayeeDid?: string;
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
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDigitalLogisticBillReceivablebillResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateDigitalLogisticHighwayInvoiceRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 发票号码，8位发票号码
  invoiceNo?: string;
  // 发票代码，12位发票代码
  invoiceCode?: string;
  // 发票校验码后6位
  verifyCode?: string;
  // 收款方did，出票方，需要出票收钱的
  payeeDid?: string;
  // 付款方did，收票方，需要收票付钱的
  payerDid?: string;
  // 发票含税金额， 不超过2位小数的数字
  invoiceContainsTax?: string;
  // 发票不含税金额，不超过2位小数的数字
  invoiceWithoutTax?: string;
  // 开票日期，格式为yyyy-mm-dd
  invoiceDate?: string;
  // 发票类型，以下二选一填写：应收发票、应付发票
  invoiceType?: string;
  // 影像件ID，发票上传蚂蚁oss的文件ID。注意：影像件id和影像件hash，必须都填写或都不填，不可只填其中一项
  fileId?: string;
  // 影像件hash，上传蚂蚁oss的文件hash。注意：影像件id和影像件hash，必须都填写或都不填，不可只填其中一项
  fileHash?: string;
  // 发票归属平台did，用以区分是哪家平台/企业的发票
  platformDid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDigitalLogisticHighwayInvoiceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class OpenDigitalLogisticCreditDriverRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 司机云资金商户ID
  accountId?: string;
  // 开通结果回调url
  callbackUrl?: string;
  // 司机分布式数字身份
  driverDid?: string;
  // 集团平台方分布式数字身份
  groupPlatformDid?: string;
  // 产品id 目前填写 PRODUCT_MYBANK
  productId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class OpenDigitalLogisticCreditDriverResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryDigitalLogisticCreditDriverRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 申请id
  applyId?: string;
  // 司机分布式数字身份
  did?: string;
  // 集团平台方分布式数字身份
  groupPlatformDid?: string;
  // 产品id  目前填写PRODUCT_MYBANK
  productId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class QueryDigitalLogisticCreditDriverResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryDigitalLogisticCreditConsignorRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 申请id
  applyId?: string;
  // 货主分布式数字身份
  did?: string;
  // 集团平台方分布式数字身份
  groupPlatformDid?: string;
  // 产品id
  // A模式： PRODUCT_MYBANK, 
  // A+模式： PRODUCT_MYBANK_A_PLUS, 
  // B模式： PRODUCT_MYBANK_B, 
  productId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class QueryDigitalLogisticCreditConsignorResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryDigitalLogisticCreditBalanceRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 货主分布式数字身份
  consignorDid?: string;
  // 支付单运费，运费最多精确到小数点后2位
  freight?: string;
  // 集团平台方分布式数字身份
  groupPlatformDid?: string;
  // 业务发起方分布式数字身份
  platformDid?: string;
  // 产品id 
  // A模式：PRODUCT_MYBANK,  
  // A+模式：PRODUCT_MYBANK_A_PLUS,  
  // B模式：PRODUCT_MYBANK_B,
  // 
  productId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class QueryDigitalLogisticCreditBalanceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UploadDigitalLogisticCreditIssueRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 批次号
  batchId?: string;
  // 发行结果回调url
  callbackUrl?: string;
  // 货主分布式数字身份
  consignorDid?: string;
  // 集团平台方分布式数字身份
  groupPlatformDid?: string;
  // 发行信用流转信息列表
  issueApplyInfos?: IssueApplyInfo[];
  // 业务发起方分布式数字身份
  platformDid?: string;
  // 产品id 目前填PRODUCT_MYBANK
  productId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class UploadDigitalLogisticCreditIssueResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryDigitalLogisticCreditIssuebatchstatusRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 批次号
  batchId?: string;
  // 集团平台方分布式数字身份
  groupPlatformDid?: string;
  // 业务发起方分布式数字身份
  platformDid?: string;
  // 产品id 
  // A模式：PRODUCT_MYBANK， 
  // A+模式：PRODUCT_MYBANK_A_PLUS， 
  // A模式：PRODUCT_MYBANK_B， 
  productId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class QueryDigitalLogisticCreditIssuebatchstatusResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CancelDigitalLogisticCreditIssuebatchRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 批次号
  batchId?: string;
  // 货主分布式数字身份
  consignorDid?: string;
  // 集团平台方分布式数字身份
  groupPlatformDid?: string;
  // 业务发起方分布式数字身份
  platformDid?: string;
  // 产品id 
  // A模式：PRODUCT_MYBANK，
  // A+模式：PRODUCT_MYBANK_A_PLUS，
  // B模式：PRODUCT_MYBANK_B
  productId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CancelDigitalLogisticCreditIssuebatchResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryDigitalLogisticCreditIssuebyidRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 信用流转发行批次号
  batchId?: string;
  // 集团平台方分布式数字身份
  groupPlatformDid?: string;
  // 是否只返回已发行凭证信息
  issuedOnly?: boolean;
  // 信用流转发行凭证Id
  issueId?: string;
  // 页数 从1开始
  pageNum?: number;
  // 每页显示数量 不超过100
  pageSize?: number;
  // 业务发起方分布式数字身份
  platformDid?: string;
  // 产品id 
  // A模式：PRODUCT_MYBANK，
  // A+模式：PRODUCT_MYBANK_A_PLUS，
  // B模式：PRODUCT_MYBANK_B
  productId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class QueryDigitalLogisticCreditIssuebyidResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryDigitalLogisticCreditIssuebytimeRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 指定查询者分布式数字身份
  did?: string;
  // 查询截止时间
  endDate?: string;
  // 集团平台方分布式数字身份
  groupPlatformDid?: string;
  // 是否只返回已发行凭证信息
  issuedOnly?: boolean;
  // 页数 从1开始
  pageNum?: number;
  // 每页显示数量 不超过100
  pageSize?: number;
  // 业务发起方分布式数字身份
  platformDid?: string;
  // 产品id 目前填PRODUCT_MYBANK
  productId?: string;
  // 查询起始时间
  startDate?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class QueryDigitalLogisticCreditIssuebytimeResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryDigitalLogisticCreditUserissueRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 被查询方分布式数字身份
  did?: string;
  // 集团平台方分布式数字身份
  groupPlatformDid?: string;
  // 页数
  pageNum?: number;
  // 每页显示的最大条数
  pageSize?: number;
  // 业务发起方分布式数字身份
  platformDid?: string;
  // 产品id 
  // A模式：PRODUCT_MYBANK， A+模式：PRODUCT_MYBANK_A_PLUS， B模式：PRODUCT_MYBANK_B
  productId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class QueryDigitalLogisticCreditUserissueResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryDigitalLogisticCreditStatementRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 需查询对象分布式数字身份不能为空
  did?: string;
  // 查询截止时间
  endDate?: string;
  // 集团平台方分布式数字身份
  groupPlatformDid?: string;
  // 页数 从1开始
  pageNum?: number;
  // 每页显示数量 最多100
  pageSize?: number;
  // 业务发起方分布式数字身份
  platformDid?: string;
  // 产品id 
  // A模式：PRODUCT_MYBANK， A+模式：PRODUCT_MYBANK_A_PLUS， B模式：PRODUCT_MYBANK_B
  productId?: string;
  // 查询起始时间
  startDate?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class QueryDigitalLogisticCreditStatementResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateDigitalLogisticCreditIssuetransferRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 转让结果回调url
  callbackUrl?: string;
  // 集团平台方分布式数字身份
  groupPlatformDid?: string;
  // 信用流转凭证
  issueId?: string;
  // 全局业务号，保证唯一性，如拆分转让业务单号
  outBizNo?: string;
  // 转入方分布式数字身份
  payeeDid?: string;
  // 转出方分布式数字身份
  payerDid?: string;
  // 业务发起方分布式数字身份
  platformDid?: string;
  // 产品id 目前使用PRODUCT_MYBANK
  productId?: string;
  // 转让金额
  txAmt?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateDigitalLogisticCreditIssuetransferResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryDigitalLogisticCreditIssuetransferRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 集团平台方分布式数字身份
  groupPlatformDid?: string;
  // 全局业务号，保证唯一性，如拆分转让业务单号
  outBizNo?: string;
  // 业务发起方分布式数字身份
  platformDid?: string;
  // 产品id 目前使用PRODUCT_MYBANK
  productId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class QueryDigitalLogisticCreditIssuetransferResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateDigitalLogisticCreditIssuefinanceRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 转让结果回调url
  callbackUrl?: string;
  // 集团平台方分布式数字身份
  groupPlatformDid?: string;
  // 信用流转凭证
  issueId?: string;
  // 融资申请方分布式数字身份
  loanerDid?: string;
  // 全局业务号，保证唯一性，如融资业务单号
  outBizNo?: string;
  // 业务发起方分布式数字身份
  platformDid?: string;
  // 产品id 
  // A模式：PRODUCT_MYBANK， A+模式：PRODUCT_MYBANK_A_PLUS， B模式：PRODUCT_MYBANK_B
  productId?: string;
  // 融资金额
  txAmt?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateDigitalLogisticCreditIssuefinanceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryDigitalLogisticCreditIssuefinanceRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 集团平台方分布式数字身份
  groupPlatformDid?: string;
  // 融资申请方分布式数字身份
  loanerDid?: string;
  // 全局业务号，保证唯一性，如融资业务单号
  outBizNo?: string;
  // 业务发起方分布式数字身份
  platformDid?: string;
  // 产品id 
  // A模式：PRODUCT_MYBANK， A+模式：PRODUCT_MYBANK_A_PLUS， B模式：PRODUCT_MYBANK_B
  productId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class QueryDigitalLogisticCreditIssuefinanceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryDigitalLogisticCreditIssuereceivableRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 集团平台方分布式数字身份
  groupPlatformDid?: string;
  // 信用凭证id
  issueId?: string;
  // 业务发起方分布式数字身份
  platformDid?: string;
  // PRODUCT_MYBANK  、PRODUCT_MYBANK_B
  productId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class QueryDigitalLogisticCreditIssuereceivableResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryDigitalLogisticCreditIssueamountRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 指定查询者分布式数字身份
  did?: string;
  // 集团平台方分布式数字身份
  groupPlatformDid?: string;
  // 信用凭证id
  issueId?: string;
  // 业务发起方分布式数字身份
  platformDid?: string;
  // 产品id 目前填写PRODUCT_MYBANK
  productId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class QueryDigitalLogisticCreditIssueamountResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 剩余金额
  balanceAmt?: string;
  // 已经提现的金额
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

export class CallbackDigitalLogisticCreditCommonRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 回调数据，根据不同msg_method 返回不同结构
  msgData?: string;
  // 回调方法类型
  msgMethod?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      msgData: 'msg_data',
      msgMethod: 'msg_method',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      msgData: 'string',
      msgMethod: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CallbackDigitalLogisticCreditCommonResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ApplyDigitalLogisticCreditIssueclearRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 申请日期，不输入则是当前时间
  applyDate?: number;
  // 清分金额，当前只支持全额清分，不填就是默认全额清分
  clearAmt?: string;
  // 主动清分方分布式数字身份
  clearDid?: string;
  // 扩展字段
  extInfo?: string;
  // 集团平台方分布式数字身份
  groupPlatformDid?: string;
  // 凭证id
  issueId?: string;
  // 全局唯一业务流水号
  outBizNo?: string;
  // 外部订单号，此为支付单号
  outOrderNo?: string;
  // 业务发起方分布式数字身份
  platformDid?: string;
  // 产品id
  // A模式：PRODUCT_MYBANK， A+模式：PRODUCT_MYBANK_A_PLUS， B模式：PRODUCT_MYBANK_B
  productId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class ApplyDigitalLogisticCreditIssueclearResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class SendDigitalLogisticCreditProxyRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 代理请求方法名
  applyMethod?: string;
  // 代理请求数据
  applyData?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      applyMethod: 'apply_method',
      applyData: 'apply_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      applyMethod: 'string',
      applyData: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SendDigitalLogisticCreditProxyResponse extends $tea.Model {
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

export class CheckDigitalLogisticCreditWaybillRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 集团平台方分布式数字身份
  groupPlatformDid?: string;
  // 业务发起方分布式数字身
  platformDid?: string;
  // 产品id
  // A模式：PRODUCT_MYBANK， A+模式：PRODUCT_MYBANK_A_PLUS， B模式：PRODUCT_MYBANK_B
  productId?: string;
  // 运单列表
  waybillList?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CheckDigitalLogisticCreditWaybillResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ReopenDigitalLogisticCreditDriverRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 产品id
  productId?: string;
  // 集团平台did
  groupPlatformDid?: string;
  // 司机did
  driverDid?: string;
  // 云资金商户id
  accountId?: string;
  // 回调地址
  callbackUrl?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class ReopenDigitalLogisticCreditDriverResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UploadDigitalLogisticCreditAuthorizationRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 签署货主统一社会信用代码
  consignorCertNo?: string;
  // 签署货主did
  consignorDid?: string;
  // 签署货主企业名称
  consignorName?: string;
  // 授权的货主平台账号
  consignorPlatformAccount?: string;
  // 协议到期日
  expireDate?: string;
  // 集团平台did
  groupPlatformDid?: string;
  // 是否包含账号授权条款
  hasAuthorizationClause?: boolean;
  // 签署子公司统一社会信用代码
  platformCertNo?: string;
  // 签署子公司did
  platformDid?: string;
  // 签署子公司企业名称
  // 
  platformName?: string;
  // 线下协议影像件id与文件哈希, 多id以逗号分隔, 最多支持10个
  protocolImgId?: string;
  // 协议名称
  protocolName?: string;
  // 线下协议编号
  protocolNo?: string;
  // 签署时间
  signDate?: string;
  // 产品id
  productId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class UploadDigitalLogisticCreditAuthorizationResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UploadDigitalLogisticCreditConfirmRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 货主云资金商户id
  accountId?: string;
  // 确认时间
  confirmDate?: string;
  // 应收转让通知编号
  confirmNo?: string;
  // 签署货主did
  consignorDid?: string;
  // 签署的货主平台账号
  consignorPlatformAccount?: string;
  // 协议到期日
  expireDate?: string;
  // 集团平台did
  groupPlatformDid?: string;
  // 签署子公司did
  platformDid?: string;
  // 协议名称
  protocolName?: string;
  // 协议PDF文件, 多个文件可用逗号分隔, 最多10个
  protocolPdfId?: string;
  // 产品id
  productId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class UploadDigitalLogisticCreditConfirmResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class BatchcreateDigitalLogisticCreditmodeIssueRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 批次id
  batchId?: string;
  // 回调地址
  callbackUrl?: string;
  // 集团平台分布式数字身份
  groupPlatformDid?: string;
  // 发行列表
  issueApplyInfos?: IssueApplyInfo[];
  // 业务平台方分布式数字身份
  platformDid?: string;
  // 产品id
  productId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class BatchcreateDigitalLogisticCreditmodeIssueResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ApplyDigitalLogisticCreditmodeIssueclearRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 产品id
  productId?: string;
  // 集团平台方分布式数字身份
  groupPlatformDid?: string;
  // 业务平台方分布式数字身份
  platformDid?: string;
  // 主动清分方分布式数字身份
  clearDid?: string;
  // 凭证id
  issueId?: string;
  // 全局业务号
  outBizNo?: string;
  // 支付单号
  outOrderNo?: string;
  // 清分金额
  clearAmt?: string;
  // 模式  B:b模式
  modeType?: string;
  // 申请日期
  applyDate?: string;
  // 扩展字段
  extInfo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class ApplyDigitalLogisticCreditmodeIssueclearResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UploadDigitalLogisticCreditIssuebysaasRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 批次id
  batchId?: string;
  // 发行结果回调地址
  callbackUrl?: string;
  // 集团平台did
  groupPlatformDid?: string;
  // 发行信息
  issueApplyInfos?: SaasIssueApplyInfo[];
  // 凭证发行方did
  platformDid?: string;
  // 产品id
  productId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class UploadDigitalLogisticCreditIssuebysaasResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CancelDigitalLogisticCreditIssuebatchbysaasRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 批次号
  batchId?: string;
  // 集团平台did
  groupPlatformDid?: string;
  // 凭证发行方did
  platformDid?: string;
  // 产品id
  productId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CancelDigitalLogisticCreditIssuebatchbysaasResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryDigitalLogisticCreditBalancebysaasRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 产品id
  productId?: string;
  // 集团平台did
  groupPlatformDid?: string;
  // 查询者did
  platformDid?: string;
  // 发行金额
  freight?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class QueryDigitalLogisticCreditBalancebysaasResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class GetDigitalLogisticCreditIssuescpticketRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 申请唯一流水号
  applyId?: string;
  // 回调地址
  callbackUrl?: string;
  // 集团平台方分布式数字身份
  groupPlatformDid?: string;
  // 业务发起方分布式数字身
  platformDid?: string;
  // 产品id	
  productId?: string;
  // 电子回单查询凭证数据
  scpTicketIssueData?: ScpTicketIssueData[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class GetDigitalLogisticCreditIssuescpticketResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryDigitalLogisticCreditIssuescpticketresultRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
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
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class QueryDigitalLogisticCreditIssuescpticketresultResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UploadDigitalLogisticCreditAplusissueRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 批次id
  batchId?: string;
  // 发行结果信息回调地址
  callbackUrl?: string;
  // 货代did
  consignorDid?: string;
  // 发行时直接进行快速提现：true ，
  // 发行后自主触发提现：false （默认）
  easyFinance?: boolean;
  // 集团平台did
  groupPlatformDid?: string;
  // 发行信息列表
  issueApplyInfos?: IssueApplyInfoPlus[];
  // 业务承接方did
  platformDid?: string;
  // 产品id
  productId?: string;
  // 登录模式，返回的发行url指定使用何种模式登录。ORG:企业支付宝登录（缺省时默认ORG模式），USER_ACCOUNT:个人支付宝登录。
  loginType?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class UploadDigitalLogisticCreditAplusissueResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryDigitalLogisticCreditCreditamountRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 集团平台did
  groupPlatformDid?: string;
  // 平台did
  platformDid?: string;
  // 产品ID
  productId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      groupPlatformDid: 'group_platform_did',
      platformDid: 'platform_did',
      productId: 'product_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      groupPlatformDid: 'string',
      platformDid: 'string',
      productId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDigitalLogisticCreditCreditamountResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateDigitalLogisticCreditCommonsignRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 账户号，account_type=ACCOUNT_BANK_NO时填写外部银行卡号， account_type=ACCOUNT_CLOUD_FUND时填写云资金商户ID
  accountId?: string;
  // 账户类型，ACCOUNT_BANK_NO:外部银行卡，ACCOUNT_CLOUD_FUND:云资金商户ID
  accountType?: string;
  // 开户行联行号，当帐户类型为ACCOUNT_BANK_NO时必填
  bankCnaps?: string;
  // 开户行名称，当帐户类型为ACCOUNT_BANK_NO时必填
  bankName?: string;
  // 签约结果回调地址
  callbackUrl?: string;
  // 驾驶证号码，当帐户类型为ACCOUNT_BANK_NO且签约方sign_did类型为个人时必填
  drivingLicense?: string;
  // 驾驶证影像件ID，当帐户类型为ACCOUNT_BANK_NO且签约方sign_did类型为个人时必填
  drivingLicenseFileId?: string;
  // 集团平台did
  groupPlatformDid?: string;
  // 法定代表人名称，签约方sign_did类型为企业时必填
  legalName?: string;
  // 产品id
  productId?: string;
  // 签约方did
  signDid?: string;
  // 行驶证号码，当帐户类型为ACCOUNT_BANK_NO且签约方sign_did类型为个人时必填
  vehicleLicense?: string;
  // 行驶证影像件ID，当帐户类型为ACCOUNT_BANK_NO且签约方sign_did类型为个人时必填
  vehicleLicenseFileId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateDigitalLogisticCreditCommonsignResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryDigitalLogisticCreditCommonsignRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 产品id
  productId?: string;
  // 集团平台did
  groupPlatformDid?: string;
  // 签约方did
  signDid?: string;
  // 申请id，不填则查询当前签约状态，填写则查询apply_id对应的签约申请结果
  applyId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class QueryDigitalLogisticCreditCommonsignResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class BatchcreateDigitalLogisticCreditIssueRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 产品id
  productId?: string;
  // 集团平台did
  groupPlatformDid?: string;
  // 凭证发行方分布式身份
  createDid?: string;
  // 凭证接收方分布式身份
  receiveDid?: string;
  // 批次id
  batchId?: string;
  // 全局业务唯一号
  outBizNo?: string;
  // 支付订单号
  payOrder?: string;
  // 支付单运费总额，运费最多精确到小数点后2位
  freight?: string;
  // 发行后自动贴现，true: 自动贴现，false: 不自动贴现 （默认）
  easyFinance?: boolean;
  // 凭证到期时间
  expireDate?: string;
  // 发行结果回调地址
  callbackUrl?: string;
  // 需合并发行的运单id列表
  waybillIds?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class BatchcreateDigitalLogisticCreditIssueResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UploadDigitalLogisticCreditIssuebatchRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 批次id
  batchId?: string;
  // 回调地址
  callbackUrl?: string;
  // 凭证发行方did
  createDid?: string;
  // 发行后自动贴现，true: 自动贴现，false: 不自动贴现 （默认）
  easyFinance?: boolean;
  // 凭证到期时间
  expireDate?: string;
  // 支付单运费总额，运费最多精确到小数点后2位
  freight?: string;
  // 集团平台did
  groupPlatformDid?: string;
  // 全局业务唯一编号
  outBizNo?: string;
  // 支付订单号
  payOrder?: string;
  // 产品id
  productId?: string;
  // 凭证接收方did
  receiveDid?: string;
  // 运单合并列表
  waybillIds?: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class UploadDigitalLogisticCreditIssuebatchResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class GetDigitalLogisticIssueTransferfileRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 申请唯一流水号
  applyId?: string;
  // 回调地址
  // 
  callbackUrl?: string;
  // 集团平台方分布式数字身份
  groupPlatformDid?: string;
  // 信用流转凭证集合，最大长度支持30
  issueTransferDatas?: IssueTransferData[];
  // 业务发起方分布式数字身份
  platformDid?: string;
  // 产品id
  // 
  productId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class GetDigitalLogisticIssueTransferfileResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 被保险人地址
  bbrAddr?: string;
  // 被保险人证件号码
  bbrIdNo?: string;
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
  bbrIdType?: string;
  // 被保险人姓名
  bbrName?: string;
  // 被保险人联系电话
  bbrTel?: string;
  // 运费,四舍五入精确到小数点两位。系统将根据运费和费率计算含税保费，计算的保费结果为四舍五入，精确到两位小数
  carriage?: string;
  // 货物名称
  carGo?: string;
  // 厂牌型号
  cpModel?: string;
  // 目的地
  destination?: string;
  // 行驶证车主
  drivPer?: string;
  // 保险起期，精确到天；最短起保时间为次日0点，最长延时起保时间为次日0点后24h
  effDate?: string;
  // 发动机编号
  engineNo?: string;
  // 车架号
  frameNo?: string;
  // 运单所属集团分布式身份标识
  groupPlatformDid?: string;
  // 投保人证件类型有效止期
  identifyPeriodEnd?: string;
  // 投保人证件类型有效起期
  identifyPeriodStart?: string;
  // 车牌号码
  licenseNo?: string;
  // 运单所属平台分布式身份标识
  platformDid?: string;
  // 运营证号
  runNo?: string;
  // 起运地
  startPlace?: string;
  // 投保人地址
  tbrAddr?: string;
  // 投保人邮箱
  tbrEmail?: string;
  // 投保人证件号
  tbrIdNo?: string;
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
  tbrIdType?: string;
  // 投保人姓名
  tbrName?: string;
  // 投保人联系电话
  tbrTel?: string;
  // 保险止期，保期时间间隔为1-30天。
  termDate?: string;
  // 吨位
  tonNage?: string;
  // 交易流水号,全局唯一；格式为 yyyyMMdd+身份标识+其他编码。系统会根据该流水号做防重、幂等判断逻辑。当极端场景中，系统会返回处理中状态，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果
  tradeNo?: string;
  // 运输货物
  tsCarGo?: string;
  // 运单id。通过运单创建接口上传运单时指定的运单标识。系统会根据该标识查询运单相关信息做投保业务校验
  waybillId?: string;
  // 重量
  weight?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class ApplyDigitalLogisticInsurancepolicyZhonghuacaixianResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CancelDigitalLogisticInsurancepolicyZhonghuacaixianRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 保单号，投保成功后返回的
  polNo?: string;
  // 含税保费，精确到小数点后两位
  preMium?: string;
  // 全局唯一交易流水号
  tradeNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      polNo: 'pol_no',
      preMium: 'pre_mium',
      tradeNo: 'trade_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      polNo: 'string',
      preMium: 'string',
      tradeNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelDigitalLogisticInsurancepolicyZhonghuacaixianResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class PushDigitalLogisticInsurancenotifyClaimRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 通知类型：
  // claims_pay:理赔支付信息
  // claims_info: 理赔信息
  category?: string;
  // 通知内容
  content?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      category: 'category',
      content: 'content',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      category: 'string',
      content: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushDigitalLogisticInsurancenotifyClaimResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ApplyDigitalLogisticInsuranceFileurlRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 上传的文件名，要求文件名后缀必须以 _yyyyMMdd结尾
  fileName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      fileName: 'file_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      fileName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyDigitalLogisticInsuranceFileurlResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ApplyDigitalLogisticInsurancepolicyUniversalRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 投保人开户银行，当打印发票选择为“1”时，必填
  accountBankName?: string;
  // 投保人银行账户，当打印发票选择为“1”时，必填
  bankAccountInformation?: string;
  // 被保人地址
  bbrAddr?: string;
  // 被保人did（被保人所在链上分布式数字身份）
  bbrDid?: string;
  // 被保人证件号
  bbrIdNo?: string;
  // 被保人证件类型，01-居民身份证, 02-驾驶执照, 03-营业执照, 99-其他	
  // 
  bbrIdType?: string;
  // 被保人姓名
  bbrName?: string;
  // 被保人电话号
  bbrTel?: string;
  // 被保人类型, 1-个人 2-团队
  bbrType?: string;
  // 货物名称
  cargoName?: string;
  // 货物数量
  cargoQuantity?: string;
  // 货物数量单位
  cargoQuantityUnit?: string;
  // 货物吨位
  cargoTonnage?: string;
  // 货物类型，普货，手机/电子产品/家用电器，精密仪器，家具，易碎品，大宗散货，生鲜（瓜果蔬菜），棉纱
  cargoType?: string;
  // 货物体积
  cargoVolume?: string;
  // 货值
  cargoWorth?: string;
  // 车长
  carLength?: string;
  // 车型
  carModel?: string;
  // 目的地，格式为"省-市-区"
  destination?: string;
  // 司机姓名
  driverName?: string;
  // 司机联系方式
  driverTel?: string;
  // 保险起始时间, 时间格式 "yyyy-MM-dd HH:mm:ss", 预计起运日期
  effDate?: string;
  // 保司, 01-华泰, 02-平安, 03-亚太
  externalChannelCode?: string;
  // 险种, 01-承运人平台责任险
  // 
  externalProductCode?: string;
  // 车架号
  frameNo?: string;
  // 投保额，整数以元为单位
  // 
  insuredAmount?: string;
  // 车牌号
  licenseNo?: string;
  // 车牌颜色，01-黄牌，02-蓝牌
  licensePlateColor?: string;
  // 税务登记证/纳税人识别号，当打印发票选择为“1”时，必填
  nsrIdentifier?: string;
  // 接单时间, 时间格式 "yyyy-MM-dd HH:mm:ss"
  orderTime?: string;
  // 包装方式, 01-箱装、02-袋装、03-包装、04-桶装、05-捆扎包装、06-裸装、07-散装、08-其他包装
  packing?: string;
  // 是否打印发票，默认0-不开票  1-专票 2-电子发票
  printInvoice?: string;
  // 费率，按实际业务商讨费率执行, 但最终结果以保司计算结果为准，0到1之间，最多6位小数
  rate?: string;
  // 起运地，格式为"省-市-区"
  startPlace?: string;
  // 投保人地址，当打印发票选择为“1”时，必填
  tbrAddr?: string;
  // 投保人-企业联系人联系方式
  tbrCorporateContract?: string;
  // 投保人did（投保人所在链上分布式数字身份）
  tbrDid?: string;
  // 投保人邮箱，用以接受电子发票的邮箱地址
  tbrEmail?: string;
  // 投保人证件号
  tbrIdNo?: string;
  // 投保人证件类型，01-居民身份证, 02-驾驶执照, 03-营业执照, 99-其他
  tbrIdType?: string;
  // 投保人名称
  tbrName?: string;
  // 投保人电话号
  tbrTel?: string;
  // 投保人类型, 1-个人 2-团队
  tbrType?: string;
  // 保险截止时间, 时间格式 "yyyy-MM-dd HH:mm:ss", 预计到达日期，保险止期间隔为1-30天
  termDate?: string;
  // 专票邮寄地址
  ticketAddr?: string;
  // 订单号, 年月日+唯一字符ID
  tradeNo?: string;
  // 中转地，格式为"省-市-区"
  transitPoint?: string;
  // 运单id（平台方运单id）
  waybillId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class ApplyDigitalLogisticInsurancepolicyUniversalResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CancelDigitalLogisticInsurancepolicyUniversalRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 投保订单号
  applyTradeNo?: string;
  // 保司, 01-华泰, 03-亚太
  externalChannelCode?: string;
  // 险种, 01-承运人平台责任险
  // 
  externalProductCode?: string;
  // 保单号
  polNo?: string;
  // 退保全局唯一流水号
  tradeNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CancelDigitalLogisticInsurancepolicyUniversalResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class PushDigitalLogisticInsuranceOlpRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 被保人证件号
  bbrIdNo?: string;
  // 被保人名称
  bbrName?: string;
  // 被保人类型, 1-个人 2-企业	
  // 
  bbrType?: string;
  // 保险公司编码
  channelCode?: string;
  // 保险公司名称
  channelName?: string;
  // 理赔单状态，ALREADY_RISK: 已出险，NOT_RISK: 未出险，NOT_CLAIM: 未理赔
  claimStatus?: string;
  // 投保时间	
  insureDate?: string;
  // 保险止期
  insureEnd?: string;
  // 保险起期
  insureStart?: string;
  // 存证平台编码
  platformConsumerCode?: string;
  // 存证平台名称
  platformConsumerName?: string;
  // 保单文件id，可支持多个，逗号隔开
  polFileIds?: string;
  // 保单号
  polNo?: string;
  // 保单状态，INSURED: 已投保，SURRENDERED: 已退保,	
  polStatus?: string;
  // 电子保单url地址
  polUrl?: string;
  // 保费
  premium?: string;
  // 险种代码
  productCode?: string;
  // 险种名称
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
      regionName: 'region_name',
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
      regionName: 'string',
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

export class PushDigitalLogisticInsuranceOlpResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UpdateDigitalLogisticInsuranceOlpRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
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
  // 理赔单状态，ALREADY_RISK: 已出险，NOT_RISK: 未出险，NOT_CLAIM: 未理赔
  claimStatus?: string;
  // 投保时间
  insureDate?: string;
  // 保险止期
  insureEnd?: string;
  // 保险起期
  insureStart?: string;
  // 存证平台编码
  platformConsumerCode?: string;
  // 存证平台名称
  platformConsumerName?: string;
  // 保单文件id，可支持多个，逗号隔开
  polFileIds?: string;
  // 保单号
  polNo?: string;
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
      regionName: 'region_name',
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
      regionName: 'string',
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

export class UpdateDigitalLogisticInsuranceOlpResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryDigitalLogisticPfPaymentRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 业务参考号
  bussRefrNo?: string;
  // 支用id
  financingId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      bussRefrNo: 'buss_refr_no',
      financingId: 'financing_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      bussRefrNo: 'string',
      financingId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDigitalLogisticPfPaymentResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryDigitalLogisticPfIouRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 客户号
  customerNo?: string;
  // 借据Id
  debitId?: string;
  // 支用Id
  financingId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      customerNo: 'customer_no',
      debitId: 'debit_id',
      financingId: 'financing_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      customerNo: 'string',
      debitId: 'string',
      financingId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDigitalLogisticPfIouResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 执行年利率
  annualInterestRate?: string;
  // 借据Id
  creditId?: string;
  // 借据到期日
  interestBearingEnd?: string;
  // 借据起息日
  interestBearingStart?: string;
  // 发放金额
  issuedAmount?: string;
  // 贷款性质 0-正常 1-展期 2-一类逾期 3-二类逾期 4-呆滞 5-呆帐
  loanNature?: string;
  // 贷款状态 销户=结清 0-正常 1-销户 5-已发放未复核入账
  loanStatus?: string;
  // 下次结息日期
  nextParsingDate?: string;
  // 逾期计息方式 0-逾期利率 1-逾期罚息比例 2-协议违约利率
  odiCalType?: string;
  // 逾期罚息浮动比率
  opiFloatingRatio?: string;
  // 贷款入账账号
  payAccount?: string;
  // 本金余额
  principalBalance?: string;
  // 还款账号
  repayAccount?: string;
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
      loanNature: 'loan_nature',
      loanStatus: 'loan_status',
      nextParsingDate: 'next_parsing_date',
      odiCalType: 'odi_cal_type',
      opiFloatingRatio: 'opi_floating_ratio',
      payAccount: 'pay_account',
      principalBalance: 'principal_balance',
      repayAccount: 'repay_account',
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
      loanNature: 'string',
      loanStatus: 'string',
      nextParsingDate: 'string',
      odiCalType: 'string',
      opiFloatingRatio: 'string',
      payAccount: 'string',
      principalBalance: 'string',
      repayAccount: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDigitalLogisticPfQuotaRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 证件号
  certNo?: string;
  // 证件类型;050 统一社会信用证代码
  certType?: string;
  // 银行端客户号
  customerNo?: string;
  // 融资主体did
  financingSubjectDid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class QueryDigitalLogisticPfQuotaResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class ApplyDigitalLogisticPfWaybillfinancingRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 承运商did
  carrierDid?: string;
  // 融资支用金额；总长度最长15位，保留2位小数，四舍五入
  financingAmount?: string;
  // 支用币种，支持 CNY,USD
  financingCurrency?: string;
  // 融资授信主体公司分布式数字身份
  financingSubjectDid?: string;
  // 贷款期限，值为2~6，单位为月
  loanTerm?: string;
  // 收款方开户行总行联行号
  payeeBankNumber?: string;
  // 收款方开户行名称
  payeeBcb?: string;
  // 收款方开户行银行卡号
  payeeBcbCardNo?: string;
  // 收款方证件号
  // 
  // 
  payeeIdNumber?: string;
  // 收款方证件类型
  payeeIdType?: string;
  // 收款方名称
  payeeName?: string;
  // 0政府投标 1经营周转 2支付货款 3采购机票，一般默认填 2 
  purpose?: string;
  // 请求号，以时间串yyyyMMdd 开头，要求该请求号在请求方系统内唯一；同时该字段也是幂等字段
  requestNo?: string;
  // 银行端的Ukey签名；使用方调用接口前使用银行Ukey做签名，并将签名后的结果填入该字段；一期，该字段可不传，使用方通过登录网上银行使用网银进行确认
  signature?: string;
  // 转账附言
  // 1: 工资、奖金收入
  // 2：稿费、演出费等劳务收入
  // 3：债券、期货、信托等投资的本金和收益
  // 4：个人债券或产权转让收益
  // 该字段建议填写 2
  transferPostscript?: string;
  // 凭证类型，支持 WAYBILL,PAYABLE
  voucherCategory?: string;
  // 支用凭证ids，支持多个，逗号隔开；
  voucherIds?: string;
  // 8位发票号，支持多个，逗号分隔
  voucherInvoiceCodes?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      requestNo: 'request_no',
      signature: 'signature',
      transferPostscript: 'transfer_postscript',
      voucherCategory: 'voucher_category',
      voucherIds: 'voucher_ids',
      voucherInvoiceCodes: 'voucher_invoice_codes',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
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
      requestNo: 'string',
      signature: 'string',
      transferPostscript: 'string',
      voucherCategory: 'string',
      voucherIds: 'string',
      voucherInvoiceCodes: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyDigitalLogisticPfWaybillfinancingResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 融资支用Id
  financingId?: string;
  // 申请状态
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

export class PushDigitalLogisticPfPledgeRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 账单标识
  billId?: string;
  // 融资主体did
  financingSubjectDid?: string;
  // 请求号；以yyyyMMdd 时间串开头的32位字符串；该字符串需要保持请求系统内唯一，系统会以该请求号作为幂等处理
  requestNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      billId: 'bill_id',
      financingSubjectDid: 'financing_subject_did',
      requestNo: 'request_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      billId: 'string',
      financingSubjectDid: 'string',
      requestNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class PushDigitalLogisticPfPledgeResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 描述
  desc?: string;
  // 质押标识，用于账单质押推送状态查询
  pledgeId?: string;
  // 质押推送状态；applied：已申请；failure：失败；由于质押推送过程为异步，若通过了前期的业务校验，将返回已申请状态；后续可使用质押Id查询质押推送终态
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      desc: 'desc',
      pledgeId: 'pledge_id',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      desc: 'string',
      pledgeId: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDigitalLogisticPfPledgeRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 质押id
  pledgeId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      pledgeId: 'pledge_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      pledgeId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDigitalLogisticPfPledgeResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 账单id
  billId?: string;
  // 状态描述
  desc?: string;
  // 融资主体did
  financingSubjectDid?: string;
  // 推送状态
  status?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      billId: 'bill_id',
      desc: 'desc',
      financingSubjectDid: 'financing_subject_did',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      billId: 'string',
      desc: 'string',
      financingSubjectDid: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDigitalLogisticPfFinancingRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 支用Id
  financingId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      financingId: 'financing_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      financingId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDigitalLogisticPfFinancingResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
  resultMsg?: string;
  // 状态
  status?: string;
  // 描述
  desc?: string;
  // 支用Id
  financingId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      status: 'status',
      desc: 'desc',
      financingId: 'financing_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      status: 'string',
      desc: 'string',
      financingId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateDigitalLogisticDidForwarderRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 代理did
  agentDid?: string;
  // 企业名称
  epCertName?: string;
  // 企业证件号
  epCertNo?: string;
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
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateDigitalLogisticDidForwarderResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateDigitalLogisticDidSaasplatformRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 企业名称
  // 
  epCertName?: string;
  // 企业证件号
  epCertNo?: string;
  // 扩展字段
  extensionInfo?: string;
  // 法人姓名
  legalPersonCertName?: string;
  // 法人身份证
  legalPersonCertNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateDigitalLogisticDidSaasplatformResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateDigitalLogisticDidClientRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 代理did
  agentDid?: string;
  // 企业名称
  epCertName?: string;
  // 企业证件号
  epCertNo?: string;
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
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateDigitalLogisticDidClientResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class SaveDigitalLogisticBizOrderRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
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
  forwarderDid?: string;
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
  orderNo?: string;
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
      regionName: 'region_name',
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
      regionName: 'string',
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

export class SaveDigitalLogisticBizOrderResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class SaveDigitalLogisticBizConsignorderRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 托单code
  consignOrderCode?: string;
  // 托单文件hash  业务必填
  fileHash?: string;
  // 托单文件id  业务必填
  fileId?: string;
  // 货代did
  forwarderDid?: string;
  // 订单号
  orderNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class SaveDigitalLogisticBizConsignorderResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class SaveDigitalLogisticBizGoodsRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
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
  forwarderDid?: string;
  // 货物 业务必填	
  // 
  goods?: string;
  // 中文品名
  goodsCn?: string;
  // 货物ID
  goodsId?: string;
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
  orderNo?: string;
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
      regionName: 'region_name',
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
      regionName: 'string',
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

export class SaveDigitalLogisticBizGoodsResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class SaveDigitalLogisticBizSonotifyRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
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
  forwarderDid?: string;
  // 起运港 业务必填	
  // 
  loadingPort?: string;
  // 	
  // 订单号
  orderNo?: string;
  // soNotify 唯一标识code
  soNotifyCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class SaveDigitalLogisticBizSonotifyResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class SaveDigitalLogisticBizBookingorderRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 订舱单号
  bookingNo?: string;
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
  forwarderDid?: string;
  // 起运港
  loadingPort?: string;
  // 订单号
  orderNo?: string;
  // 截单时间  毫秒值单位
  siClosing?: number;
  // 特殊字段无要求非必填
  source?: string;
  // 船名 业务必填
  vessel?: string;
  // 航次 业务必填
  voyage?: string;
  // 订舱号
  bkgNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveDigitalLogisticBizBookingorderResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class SaveDigitalLogisticBizContainerRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 订舱单号
  // 
  bookingNo?: string;
  // 集装箱ID
  containerId?: string;
  // 箱号 业务必填
  containerNo?: string;
  //  箱型  业务必填
  containerType?: string;
  // 货代did
  forwarderDid?: string;
  // 货物列表
  goodsList?: ContainerGoodsParam[];
  // 订单号
  orderNo?: string;
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
      regionName: 'region_name',
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
      regionName: 'string',
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

export class SaveDigitalLogisticBizContainerResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class SaveDigitalLogisticBizCustomsorderRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
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
  customsCode?: string;
  //  出口人
  exporter?: string;
  // 货代did
  // 
  forwarderDid?: string;
  // 货物名称
  goods?: string;
  // 毛重 
  grossWeight?: string;
  // 订单号
  // 
  orderNo?: string;
  // 件数
  packagesNo?: string;
  // 报关状态  APPROVED--通关，UNAPPROVED-未通关
  status?: string;
  // 航名 业务必填
  vessel?: string;
  // 航次 业务必填
  voyage?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class SaveDigitalLogisticBizCustomsorderResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class SaveDigitalLogisticBizVehicleRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 箱子信息 业务必填
  containerParams?: VehicleContainerParam[];
  // 货代did
  forwarderDid?: string;
  // 订单号
  orderNo?: string;
  // 拖车单号
  vehicleCode?: string;
  // 车牌号 
  vehicleNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class SaveDigitalLogisticBizVehicleResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class SaveDigitalLogisticBizMasterblRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
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
  forwarderDid?: string;
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
  masterBlNo?: string;
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
  orderNo?: string;
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
      regionName: 'region_name',
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
      regionName: 'string',
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

export class SaveDigitalLogisticBizMasterblResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class FinishDigitalLogisticBizAuditRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 	
  // 货代did
  forwarderDid?: string;
  // 	
  // 订单号
  orderNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      forwarderDid: 'forwarder_did',
      orderNo: 'order_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      forwarderDid: 'string',
      orderNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FinishDigitalLogisticBizAuditResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class SaveDigitalLogisticBizHouseblRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
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
  forwarderDid?: string;
  // 运费
  freight?: string;
  // 货物列表 业务必填	
  // 
  goodsParams?: HouseBlGoodsParam[];
  // house提单号
  houseBlNo?: string;
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
  orderNo?: string;
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
      regionName: 'region_name',
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
      regionName: 'string',
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

export class SaveDigitalLogisticBizHouseblResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateDigitalLogisticBillPaybillorderRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 申请时间
  applyDate?: number;
  // 银行收款账户
  bankReceiptAccount?: string;
  // 币种
  currency?: string;
  // 开户行
  depositBank?: string;
  // 货代did
  forwarderDid?: string;
  // 应付总额
  payAmount?: string;
  // 付款单编号
  payBillOrderCode?: string;
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
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateDigitalLogisticBillPaybillorderResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateDigitalLogisticBillReceiptbillorderRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
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
  forwarderDid?: string;
  // 开票抬头
  invoiceTitle?: string;
  // 含税价
  priceIncludingTax?: string;
  // 收款账号
  receiptAccount?: string;
  // 收款总额 业务必填
  receiptAmount?: string;
  // 收款账单编号
  receiptBillOrderCode?: string;
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
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateDigitalLogisticBillReceiptbillorderResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class SaveDigitalLogisticBillPaybilltariffRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
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
  forwarderDid?: string;
  // 收支  INCOME--收入， EXPENSES--支出
  // 业务必填
  incomeOrExpenses?: string;
  // 电子发票网址
  invoiceUrl?: string;
  // 工作单号 业务必填
  orderNo?: string;
  // 资费单据编号
  payTariffCode?: string;
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
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveDigitalLogisticBillPaybilltariffResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class SaveDigitalLogisticBillReceiptbilltariffRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
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
  forwarderDid?: string;
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
  receiptTariffCode?: string;
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
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class SaveDigitalLogisticBillReceiptbilltariffResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class VerifyDigitalLogisticBillPaybillRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 货代did
  forwarderDid?: string;
  // 应付资费项编号
  payTariffCode?: string;
  // 核销金额 业务必填
  verifyAmount?: string;
  // 核销应付资费项编号
  verifyPayTariffCode?: string;
  // 核销状态 WAIT_VERIFY-待核销，PART_VERIFY-部分核销，COMPLETE_VERIFY-完成核销 
  // 业务必填
  verifyStatus?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class VerifyDigitalLogisticBillPaybillResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class VerifyDigitalLogisticBillReceiptbillorderRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
  action?: string;
  // 货代did
  forwarderDid?: string;
  // 应收资费项编号
  receiptTariffCode?: string;
  // 核销金额 业务必填
  verifyAmount?: string;
  // 核销应收资费项编号
  verifyReceiptTariffCode?: string;
  // 核销状态 WAIT_VERIFY-待核销，PART_VERIFY-部分核销，COMPLETE_VERIFY-完成核销 业务必填
  verifyStatus?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class VerifyDigitalLogisticBillReceiptbillorderResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UpdateDigitalLogisticBillPaybillorderRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
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
  forwarderDid?: string;
  // 应付总额 业务必填
  payAmount?: string;
  // 付款单编号
  payBillOrderCode?: string;
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
  // 结算公司did
  settleCompanyDid?: string;
  // 账单结算周期
  settleCycle?: string;
  // 结算状态 ：  SETTLED(已结算) ,  UNSETTLE（未结算）[业务必填]
  settleStatus?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDigitalLogisticBillPaybillorderResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UpdateDigitalLogisticBillReceiptbillorderRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除	
  action?: string;
  // 实际收款结算公司
  actualSettleCompany?: string;
  // 实际收款结算公司企业信用号
  actualSettleCompanyCertNo?: string;
  // 实际收款结算公司did
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
  forwarderDid?: string;
  // 开票抬头
  invoiceTitle?: string;
  // 含税价
  priceIncludingTax?: string;
  // 收款账号
  receiptAccount?: string;
  // 收款总额
  receiptAmount?: string;
  // 收款账单编号
  receiptBillOrderCode?: string;
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
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
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
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDigitalLogisticBillReceiptbillorderResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class SaveDigitalLogisticBillPayinvoiceRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
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
  forwarderDid?: string;
  // 发票唯一标识
  invoiceCode?: string;
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
      regionName: 'region_name',
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
      regionName: 'string',
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

export class SaveDigitalLogisticBillPayinvoiceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class SaveDigitalLogisticBillReceiptinvoiceRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
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
  forwarderDid?: string;
  // 应收发票唯一标识
  invoiceCode?: string;
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
      regionName: 'region_name',
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
      regionName: 'string',
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

export class SaveDigitalLogisticBillReceiptinvoiceResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UploadDigitalLogisticBizFinancingRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 融资数据
  financingData?: UploadFinancingParam[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      financingData: 'financing_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      financingData: { 'type': 'array', 'itemType': UploadFinancingParam },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UploadDigitalLogisticBizFinancingResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UploadDigitalLogisticBizOrderRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 船公司did
  carrierDid?: string;
  // 尾款金额
  deadlineAmount?: string;
  // 货代did
  forwarderDid?: string;
  // 订单总额
  orderAmounts?: UploadOrderAmount[];
  // 订单booking信息
  orderBookings?: UploadOrderBooking[];
  // 订单号
  orderNo?: string;
  // 结算did
  settleDid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class UploadDigitalLogisticBizOrderResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class CreateDigitalLogisticDidCarrierRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 代理did
  agentDid?: string;
  // 企业名称
  epCertName?: string;
  // 企业证件号
  epCertNo?: string;
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
      regionName: 'region_name',
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
      regionName: 'string',
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

export class CreateDigitalLogisticDidCarrierResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class AuthDigitalLogisticSysForwarderRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 客户端id
  clientId?: string;
  // 密钥
  clientSecret?: string;
  // 货代did
  intRefId?: string;
  // For HOME application internal
  tenantId?: string;
  // 渠道source
  source?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class AuthDigitalLogisticSysForwarderResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class QueryDigitalLogisticBizMasterblRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 货代did
  forwarderDid?: string;
  // master提单号
  masterBlNo?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      forwarderDid: 'forwarder_did',
      masterBlNo: 'master_bl_no',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      forwarderDid: 'string',
      masterBlNo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryDigitalLogisticBizMasterblResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class SaveDigitalLogisticBizPayinvoicefileRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除，INSERT为新增
  action?: string;
  // 发票文件hash [业务必填]
  fileHash?: string;
  // 发票文件ID [业务必填]
  fileId?: string;
  // 货代DID
  forwarderDid?: string;
  // 应付发票code
  invoiceCode?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class SaveDigitalLogisticBizPayinvoicefileResponse extends $tea.Model {
  reqMsgId?: string;
  resultCode?: string;
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

export class UploadDigitalLogisticShippingEblRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 船公司名称
  carrierName?: string;
  // 收货人did
  consigneeDid?: string;
  // 电子提单类型
  eblCategory?: string;
  // 电子提单copy文件hash
  eblCopyPdfFileHash?: string;
  // copy电子提单pdf文件id
  eblCopyPdfFileId?: string;
  // 电子提单编号
  eblNo?: string;
  // 电子甜的原文件hash
  eblOriginalPdfFileHash?: string;
  // 原电子提单pdf文件id
  eblOriginalPdfFileId?: string;
  // 议付行did
  negotiatingBankDid?: string;
  // 托运人did
  shipperDid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class UploadDigitalLogisticShippingEblResponse extends $tea.Model {
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

export class UploadDigitalLogisticShippingEblbatchRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 代理人did
  agentDid?: string;
  // 是否为代理操作
  agentFlag?: boolean;
  // 格式：carrierName_yyyyMMddHHmmss_5位随机数字；全局唯一
  batchNo?: string;
  // 船公司名称
  carrierName?: string;
  // 收货人did
  consigneeDid?: string;
  // 电子提单类型
  eblCategory?: string;
  // 批次下的提单明细
  // 
  // 
  eblDetails?: EblDetail[];
  // 议付行did
  negotiatingBankDid?: string;
  // 托运人did
  shipperDid?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
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
      regionName: 'string',
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

export class UploadDigitalLogisticShippingEblbatchResponse extends $tea.Model {
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

export class UpdateDigitalLogisticShippingEblbatchstatusRequest extends $tea.Model {
  authToken?: string;
  productInstanceId?: string;
  regionName?: string;
  // 电子提单批次号
  batchNo?: string;
  // 批次下的提单状态变更明细
  eblStatusDetails?: EblStatusDetail[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      regionName: 'region_name',
      batchNo: 'batch_no',
      eblStatusDetails: 'ebl_status_details',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      regionName: 'string',
      batchNo: 'string',
      eblStatusDetails: { 'type': 'array', 'itemType': EblStatusDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDigitalLogisticShippingEblbatchstatusResponse extends $tea.Model {
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
          sdkVersion: "Tea-SDK-20201209",
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
   * Description: 无车承运平台为自身申请DIS分布式数字身份
   * Summary: 无车承运平台DIS分布式数字身份申请
   */
  async createDigitalLogisticPlatformDid(request: CreateDigitalLogisticPlatformDidRequest): Promise<CreateDigitalLogisticPlatformDidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createDigitalLogisticPlatformDidEx(request, runtime);
  }

  /**
   * Description: 无车承运平台为自身申请DIS分布式数字身份
   * Summary: 无车承运平台DIS分布式数字身份申请
   */
  async createDigitalLogisticPlatformDidEx(request: CreateDigitalLogisticPlatformDidRequest, runtime: $Util.RuntimeOptions): Promise<CreateDigitalLogisticPlatformDidResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDigitalLogisticPlatformDidResponse>(await this.doRequest("1.0", "digital.logistic.platform.did.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateDigitalLogisticPlatformDidResponse({}));
  }

  /**
   * Description: 代理申请无车承运平台的DIS分布式数字身份。无车saas平台需要为平台中的各个无车承运平台创建dis时需要使用代理创建的模式为其创建分布式数字身份。代理申请分布式数字身份的前置条件为自身需已有分布式数字身份。
   * Summary: 无车承运平台DIS分布式数字身份代理申请
   */
  async createDigitalLogisticAgentDid(request: CreateDigitalLogisticAgentDidRequest): Promise<CreateDigitalLogisticAgentDidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createDigitalLogisticAgentDidEx(request, runtime);
  }

  /**
   * Description: 代理申请无车承运平台的DIS分布式数字身份。无车saas平台需要为平台中的各个无车承运平台创建dis时需要使用代理创建的模式为其创建分布式数字身份。代理申请分布式数字身份的前置条件为自身需已有分布式数字身份。
   * Summary: 无车承运平台DIS分布式数字身份代理申请
   */
  async createDigitalLogisticAgentDidEx(request: CreateDigitalLogisticAgentDidRequest, runtime: $Util.RuntimeOptions): Promise<CreateDigitalLogisticAgentDidResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDigitalLogisticAgentDidResponse>(await this.doRequest("1.0", "digital.logistic.agent.did.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateDigitalLogisticAgentDidResponse({}));
  }

  /**
   * Description: 无车承运平台为货主申请联盟中唯一标识货主的DIS分布式数字身份,会对企业信息做核验，同一个企业多次申请dis将会返回相同的分布式数字身份。为货主申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
   * Summary: 货主DIS分布式数字身份申请
   */
  async createDigitalLogisticConsignorDis(request: CreateDigitalLogisticConsignorDisRequest): Promise<CreateDigitalLogisticConsignorDisResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createDigitalLogisticConsignorDisEx(request, runtime);
  }

  /**
   * Description: 无车承运平台为货主申请联盟中唯一标识货主的DIS分布式数字身份,会对企业信息做核验，同一个企业多次申请dis将会返回相同的分布式数字身份。为货主申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
   * Summary: 货主DIS分布式数字身份申请
   */
  async createDigitalLogisticConsignorDisEx(request: CreateDigitalLogisticConsignorDisRequest, runtime: $Util.RuntimeOptions): Promise<CreateDigitalLogisticConsignorDisResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDigitalLogisticConsignorDisResponse>(await this.doRequest("1.0", "digital.logistic.consignor.dis.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateDigitalLogisticConsignorDisResponse({}));
  }

  /**
   * Description: 无车承运平台为司机申请DIS分布式数字身份,会对司机做实人认证，同一个司机多次申请dis会返回相同的分布式数字身份。为司机申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
   * Summary: 司机DIS分布式数字身份申请
   */
  async createDigitalLogisticDriverDis(request: CreateDigitalLogisticDriverDisRequest): Promise<CreateDigitalLogisticDriverDisResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createDigitalLogisticDriverDisEx(request, runtime);
  }

  /**
   * Description: 无车承运平台为司机申请DIS分布式数字身份,会对司机做实人认证，同一个司机多次申请dis会返回相同的分布式数字身份。为司机申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
   * Summary: 司机DIS分布式数字身份申请
   */
  async createDigitalLogisticDriverDisEx(request: CreateDigitalLogisticDriverDisRequest, runtime: $Util.RuntimeOptions): Promise<CreateDigitalLogisticDriverDisResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDigitalLogisticDriverDisResponse>(await this.doRequest("1.0", "digital.logistic.driver.dis.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateDigitalLogisticDriverDisResponse({}));
  }

  /**
   * Description: 货源订单创建，货主发货给平台时的订单信息
   * Summary: 货源订单创建
   */
  async createDigitalLogisticCargoOrder(request: CreateDigitalLogisticCargoOrderRequest): Promise<CreateDigitalLogisticCargoOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createDigitalLogisticCargoOrderEx(request, runtime);
  }

  /**
   * Description: 货源订单创建，货主发货给平台时的订单信息
   * Summary: 货源订单创建
   */
  async createDigitalLogisticCargoOrderEx(request: CreateDigitalLogisticCargoOrderRequest, runtime: $Util.RuntimeOptions): Promise<CreateDigitalLogisticCargoOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDigitalLogisticCargoOrderResponse>(await this.doRequest("1.0", "digital.logistic.cargo.order.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateDigitalLogisticCargoOrderResponse({}));
  }

  /**
   * Description: 货源支付订单创建,货源订单需存在。
   * Summary: 货源支付订单创建
   */
  async createDigitalLogisticCargoPay(request: CreateDigitalLogisticCargoPayRequest): Promise<CreateDigitalLogisticCargoPayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createDigitalLogisticCargoPayEx(request, runtime);
  }

  /**
   * Description: 货源支付订单创建,货源订单需存在。
   * Summary: 货源支付订单创建
   */
  async createDigitalLogisticCargoPayEx(request: CreateDigitalLogisticCargoPayRequest, runtime: $Util.RuntimeOptions): Promise<CreateDigitalLogisticCargoPayResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDigitalLogisticCargoPayResponse>(await this.doRequest("1.0", "digital.logistic.cargo.pay.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateDigitalLogisticCargoPayResponse({}));
  }

  /**
   * Description: 物流平台将运单指派给下游（承运商、司机）时产生
   * Summary: 运单创建
   */
  async createDigitalLogisticWaybillOrder(request: CreateDigitalLogisticWaybillOrderRequest): Promise<CreateDigitalLogisticWaybillOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createDigitalLogisticWaybillOrderEx(request, runtime);
  }

  /**
   * Description: 物流平台将运单指派给下游（承运商、司机）时产生
   * Summary: 运单创建
   */
  async createDigitalLogisticWaybillOrderEx(request: CreateDigitalLogisticWaybillOrderRequest, runtime: $Util.RuntimeOptions): Promise<CreateDigitalLogisticWaybillOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDigitalLogisticWaybillOrderResponse>(await this.doRequest("1.0", "digital.logistic.waybill.order.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateDigitalLogisticWaybillOrderResponse({}));
  }

  /**
   * Description: 创建物流支付订单，运单需已存在并且未结束
   * Summary: 运单支付订单创建
   */
  async createDigitalLogisticWaybillPay(request: CreateDigitalLogisticWaybillPayRequest): Promise<CreateDigitalLogisticWaybillPayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createDigitalLogisticWaybillPayEx(request, runtime);
  }

  /**
   * Description: 创建物流支付订单，运单需已存在并且未结束
   * Summary: 运单支付订单创建
   */
  async createDigitalLogisticWaybillPayEx(request: CreateDigitalLogisticWaybillPayRequest, runtime: $Util.RuntimeOptions): Promise<CreateDigitalLogisticWaybillPayResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDigitalLogisticWaybillPayResponse>(await this.doRequest("1.0", "digital.logistic.waybill.pay.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateDigitalLogisticWaybillPayResponse({}));
  }

  /**
   * Description: 用于上报第三方的轨迹位置信息，运单需已存在并且未结束
   * Summary: 第三方位置信息上报
   */
  async importDigitalLogisticWaybillLocation(request: ImportDigitalLogisticWaybillLocationRequest): Promise<ImportDigitalLogisticWaybillLocationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.importDigitalLogisticWaybillLocationEx(request, runtime);
  }

  /**
   * Description: 用于上报第三方的轨迹位置信息，运单需已存在并且未结束
   * Summary: 第三方位置信息上报
   */
  async importDigitalLogisticWaybillLocationEx(request: ImportDigitalLogisticWaybillLocationRequest, runtime: $Util.RuntimeOptions): Promise<ImportDigitalLogisticWaybillLocationResponse> {
    Util.validateModel(request);
    return $tea.cast<ImportDigitalLogisticWaybillLocationResponse>(await this.doRequest("1.0", "digital.logistic.waybill.location.import", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ImportDigitalLogisticWaybillLocationResponse({}));
  }

  /**
   * Description: 发票订单创建
   * Summary: 发票订单创建
   */
  async createDigitalLogisticWaybillBill(request: CreateDigitalLogisticWaybillBillRequest): Promise<CreateDigitalLogisticWaybillBillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createDigitalLogisticWaybillBillEx(request, runtime);
  }

  /**
   * Description: 发票订单创建
   * Summary: 发票订单创建
   */
  async createDigitalLogisticWaybillBillEx(request: CreateDigitalLogisticWaybillBillRequest, runtime: $Util.RuntimeOptions): Promise<CreateDigitalLogisticWaybillBillResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDigitalLogisticWaybillBillResponse>(await this.doRequest("1.0", "digital.logistic.waybill.bill.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateDigitalLogisticWaybillBillResponse({}));
  }

  /**
   * Description: 查询物流运单状态
   * Summary: 查询运单状态
   */
  async queryDigitalLogisticWaybillStatus(request: QueryDigitalLogisticWaybillStatusRequest): Promise<QueryDigitalLogisticWaybillStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryDigitalLogisticWaybillStatusEx(request, runtime);
  }

  /**
   * Description: 查询物流运单状态
   * Summary: 查询运单状态
   */
  async queryDigitalLogisticWaybillStatusEx(request: QueryDigitalLogisticWaybillStatusRequest, runtime: $Util.RuntimeOptions): Promise<QueryDigitalLogisticWaybillStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDigitalLogisticWaybillStatusResponse>(await this.doRequest("1.0", "digital.logistic.waybill.status.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryDigitalLogisticWaybillStatusResponse({}));
  }

  /**
   * Description: 运单完成表示整个运单的生命周期结束的最终状态，一般为和司机已进行确认结算后调用
  完成后的运单无法再调用支付订单与轨迹位置上传接口。
   * Summary: 运单完成
   */
  async finishDigitalLogisticWaybillOrder(request: FinishDigitalLogisticWaybillOrderRequest): Promise<FinishDigitalLogisticWaybillOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.finishDigitalLogisticWaybillOrderEx(request, runtime);
  }

  /**
   * Description: 运单完成表示整个运单的生命周期结束的最终状态，一般为和司机已进行确认结算后调用
  完成后的运单无法再调用支付订单与轨迹位置上传接口。
   * Summary: 运单完成
   */
  async finishDigitalLogisticWaybillOrderEx(request: FinishDigitalLogisticWaybillOrderRequest, runtime: $Util.RuntimeOptions): Promise<FinishDigitalLogisticWaybillOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<FinishDigitalLogisticWaybillOrderResponse>(await this.doRequest("1.0", "digital.logistic.waybill.order.finish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new FinishDigitalLogisticWaybillOrderResponse({}));
  }

  /**
   * Description: 货源支付订单创建,货源订单需存在。
   * Summary: 货源支付订单创建
   */
  async createDigitalLogisticCargoPayorder(request: CreateDigitalLogisticCargoPayorderRequest): Promise<CreateDigitalLogisticCargoPayorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createDigitalLogisticCargoPayorderEx(request, runtime);
  }

  /**
   * Description: 货源支付订单创建,货源订单需存在。
   * Summary: 货源支付订单创建
   */
  async createDigitalLogisticCargoPayorderEx(request: CreateDigitalLogisticCargoPayorderRequest, runtime: $Util.RuntimeOptions): Promise<CreateDigitalLogisticCargoPayorderResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDigitalLogisticCargoPayorderResponse>(await this.doRequest("1.0", "digital.logistic.cargo.payorder.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateDigitalLogisticCargoPayorderResponse({}));
  }

  /**
   * Description: 当货物到达目的地时，调用此接口
   * Summary: 运单运输完成
   */
  async saveDigitalLogisticWaybillOrder(request: SaveDigitalLogisticWaybillOrderRequest): Promise<SaveDigitalLogisticWaybillOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.saveDigitalLogisticWaybillOrderEx(request, runtime);
  }

  /**
   * Description: 当货物到达目的地时，调用此接口
   * Summary: 运单运输完成
   */
  async saveDigitalLogisticWaybillOrderEx(request: SaveDigitalLogisticWaybillOrderRequest, runtime: $Util.RuntimeOptions): Promise<SaveDigitalLogisticWaybillOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveDigitalLogisticWaybillOrderResponse>(await this.doRequest("1.0", "digital.logistic.waybill.order.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new SaveDigitalLogisticWaybillOrderResponse({}));
  }

  /**
   * Description: 运单关闭
   * Summary: 运单关闭
   */
  async closeDigitalLogisticWaybillOrder(request: CloseDigitalLogisticWaybillOrderRequest): Promise<CloseDigitalLogisticWaybillOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.closeDigitalLogisticWaybillOrderEx(request, runtime);
  }

  /**
   * Description: 运单关闭
   * Summary: 运单关闭
   */
  async closeDigitalLogisticWaybillOrderEx(request: CloseDigitalLogisticWaybillOrderRequest, runtime: $Util.RuntimeOptions): Promise<CloseDigitalLogisticWaybillOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<CloseDigitalLogisticWaybillOrderResponse>(await this.doRequest("1.0", "digital.logistic.waybill.order.close", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CloseDigitalLogisticWaybillOrderResponse({}));
  }

  /**
   * Description: 完成物流运单
   * Summary: 完成物流运单
   */
  async finishDigitalLogisticFinanceWaybill(request: FinishDigitalLogisticFinanceWaybillRequest): Promise<FinishDigitalLogisticFinanceWaybillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.finishDigitalLogisticFinanceWaybillEx(request, runtime);
  }

  /**
   * Description: 完成物流运单
   * Summary: 完成物流运单
   */
  async finishDigitalLogisticFinanceWaybillEx(request: FinishDigitalLogisticFinanceWaybillRequest, runtime: $Util.RuntimeOptions): Promise<FinishDigitalLogisticFinanceWaybillResponse> {
    Util.validateModel(request);
    return $tea.cast<FinishDigitalLogisticFinanceWaybillResponse>(await this.doRequest("1.0", "digital.logistic.finance.waybill.finish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new FinishDigitalLogisticFinanceWaybillResponse({}));
  }

  /**
   * Description: 运输完成
   * Summary: 运输完成
   */
  async finishDigitalLogisticFinanceTransport(request: FinishDigitalLogisticFinanceTransportRequest): Promise<FinishDigitalLogisticFinanceTransportResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.finishDigitalLogisticFinanceTransportEx(request, runtime);
  }

  /**
   * Description: 运输完成
   * Summary: 运输完成
   */
  async finishDigitalLogisticFinanceTransportEx(request: FinishDigitalLogisticFinanceTransportRequest, runtime: $Util.RuntimeOptions): Promise<FinishDigitalLogisticFinanceTransportResponse> {
    Util.validateModel(request);
    return $tea.cast<FinishDigitalLogisticFinanceTransportResponse>(await this.doRequest("1.0", "digital.logistic.finance.transport.finish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new FinishDigitalLogisticFinanceTransportResponse({}));
  }

  /**
   * Description: 对运单信息项需更新时调用
   * Summary: 更新运单
   */
  async updateDigitalLogisticFinanceWaybill(request: UpdateDigitalLogisticFinanceWaybillRequest): Promise<UpdateDigitalLogisticFinanceWaybillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateDigitalLogisticFinanceWaybillEx(request, runtime);
  }

  /**
   * Description: 对运单信息项需更新时调用
   * Summary: 更新运单
   */
  async updateDigitalLogisticFinanceWaybillEx(request: UpdateDigitalLogisticFinanceWaybillRequest, runtime: $Util.RuntimeOptions): Promise<UpdateDigitalLogisticFinanceWaybillResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDigitalLogisticFinanceWaybillResponse>(await this.doRequest("1.0", "digital.logistic.finance.waybill.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateDigitalLogisticFinanceWaybillResponse({}));
  }

  /**
   * Description: 当司机到达货主装货地后，调用此接口
   * Summary: 起运运单
   */
  async startDigitalLogisticFinanceWaybill(request: StartDigitalLogisticFinanceWaybillRequest): Promise<StartDigitalLogisticFinanceWaybillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.startDigitalLogisticFinanceWaybillEx(request, runtime);
  }

  /**
   * Description: 当司机到达货主装货地后，调用此接口
   * Summary: 起运运单
   */
  async startDigitalLogisticFinanceWaybillEx(request: StartDigitalLogisticFinanceWaybillRequest, runtime: $Util.RuntimeOptions): Promise<StartDigitalLogisticFinanceWaybillResponse> {
    Util.validateModel(request);
    return $tea.cast<StartDigitalLogisticFinanceWaybillResponse>(await this.doRequest("1.0", "digital.logistic.finance.waybill.start", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new StartDigitalLogisticFinanceWaybillResponse({}));
  }

  /**
   * Description: 创建承运商账户
   * Summary: 创建承运商账户
   */
  async createDigitalLogisticCaptainDis(request: CreateDigitalLogisticCaptainDisRequest): Promise<CreateDigitalLogisticCaptainDisResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createDigitalLogisticCaptainDisEx(request, runtime);
  }

  /**
   * Description: 创建承运商账户
   * Summary: 创建承运商账户
   */
  async createDigitalLogisticCaptainDisEx(request: CreateDigitalLogisticCaptainDisRequest, runtime: $Util.RuntimeOptions): Promise<CreateDigitalLogisticCaptainDisResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDigitalLogisticCaptainDisResponse>(await this.doRequest("1.0", "digital.logistic.captain.dis.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateDigitalLogisticCaptainDisResponse({}));
  }

  /**
   * Description: 创建货主账单
   * Summary: 货主账单创建
   */
  async createDigitalLogisticCargowaybillBill(request: CreateDigitalLogisticCargowaybillBillRequest): Promise<CreateDigitalLogisticCargowaybillBillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createDigitalLogisticCargowaybillBillEx(request, runtime);
  }

  /**
   * Description: 创建货主账单
   * Summary: 货主账单创建
   */
  async createDigitalLogisticCargowaybillBillEx(request: CreateDigitalLogisticCargowaybillBillRequest, runtime: $Util.RuntimeOptions): Promise<CreateDigitalLogisticCargowaybillBillResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDigitalLogisticCargowaybillBillResponse>(await this.doRequest("1.0", "digital.logistic.cargowaybill.bill.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateDigitalLogisticCargowaybillBillResponse({}));
  }

  /**
   * Description: 确认货主账单
   * Summary: 货主账单确认
   */
  async confirmDigitalLogisticCargowaybillBill(request: ConfirmDigitalLogisticCargowaybillBillRequest): Promise<ConfirmDigitalLogisticCargowaybillBillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.confirmDigitalLogisticCargowaybillBillEx(request, runtime);
  }

  /**
   * Description: 确认货主账单
   * Summary: 货主账单确认
   */
  async confirmDigitalLogisticCargowaybillBillEx(request: ConfirmDigitalLogisticCargowaybillBillRequest, runtime: $Util.RuntimeOptions): Promise<ConfirmDigitalLogisticCargowaybillBillResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmDigitalLogisticCargowaybillBillResponse>(await this.doRequest("1.0", "digital.logistic.cargowaybill.bill.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ConfirmDigitalLogisticCargowaybillBillResponse({}));
  }

  /**
   * Description: 结算货主账单
   * Summary: 货主账单结算
   */
  async createDigitalLogisticCargowaybillBillsettle(request: CreateDigitalLogisticCargowaybillBillsettleRequest): Promise<CreateDigitalLogisticCargowaybillBillsettleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createDigitalLogisticCargowaybillBillsettleEx(request, runtime);
  }

  /**
   * Description: 结算货主账单
   * Summary: 货主账单结算
   */
  async createDigitalLogisticCargowaybillBillsettleEx(request: CreateDigitalLogisticCargowaybillBillsettleRequest, runtime: $Util.RuntimeOptions): Promise<CreateDigitalLogisticCargowaybillBillsettleResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDigitalLogisticCargowaybillBillsettleResponse>(await this.doRequest("1.0", "digital.logistic.cargowaybill.billsettle.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateDigitalLogisticCargowaybillBillsettleResponse({}));
  }

  /**
   * Description: 运单平台did更新
   * Summary: 运单平台did更新
   */
  async updateDigitalLogisticWaybillorderPlatformdid(request: UpdateDigitalLogisticWaybillorderPlatformdidRequest): Promise<UpdateDigitalLogisticWaybillorderPlatformdidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateDigitalLogisticWaybillorderPlatformdidEx(request, runtime);
  }

  /**
   * Description: 运单平台did更新
   * Summary: 运单平台did更新
   */
  async updateDigitalLogisticWaybillorderPlatformdidEx(request: UpdateDigitalLogisticWaybillorderPlatformdidRequest, runtime: $Util.RuntimeOptions): Promise<UpdateDigitalLogisticWaybillorderPlatformdidResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDigitalLogisticWaybillorderPlatformdidResponse>(await this.doRequest("1.0", "digital.logistic.waybillorder.platformdid.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateDigitalLogisticWaybillorderPlatformdidResponse({}));
  }

  /**
   * Description: 更新货主账单
   * Summary: 货主账单更新
   */
  async updateDigitalLogisticCargowaybillBill(request: UpdateDigitalLogisticCargowaybillBillRequest): Promise<UpdateDigitalLogisticCargowaybillBillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateDigitalLogisticCargowaybillBillEx(request, runtime);
  }

  /**
   * Description: 更新货主账单
   * Summary: 货主账单更新
   */
  async updateDigitalLogisticCargowaybillBillEx(request: UpdateDigitalLogisticCargowaybillBillRequest, runtime: $Util.RuntimeOptions): Promise<UpdateDigitalLogisticCargowaybillBillResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDigitalLogisticCargowaybillBillResponse>(await this.doRequest("1.0", "digital.logistic.cargowaybill.bill.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateDigitalLogisticCargowaybillBillResponse({}));
  }

  /**
   * Description: 分布式申请did账户集合，可通过此接口申请个人类型角色为货主、承运商、司机的分布式数字身份did；可申请企业类型角色为货主、网络货运平台、道路运输企业/3pl、承运商、子平台的分布式数字身份did。注：接口可允许多次调用，但每次调用只允许申请一个角色，不允许一次调用申请多个角色
   * Summary: 分布式数字身份申请did集合
   */
  async createDigitalLogisticDisDid(request: CreateDigitalLogisticDisDidRequest): Promise<CreateDigitalLogisticDisDidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createDigitalLogisticDisDidEx(request, runtime);
  }

  /**
   * Description: 分布式申请did账户集合，可通过此接口申请个人类型角色为货主、承运商、司机的分布式数字身份did；可申请企业类型角色为货主、网络货运平台、道路运输企业/3pl、承运商、子平台的分布式数字身份did。注：接口可允许多次调用，但每次调用只允许申请一个角色，不允许一次调用申请多个角色
   * Summary: 分布式数字身份申请did集合
   */
  async createDigitalLogisticDisDidEx(request: CreateDigitalLogisticDisDidRequest, runtime: $Util.RuntimeOptions): Promise<CreateDigitalLogisticDisDidResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDigitalLogisticDisDidResponse>(await this.doRequest("1.0", "digital.logistic.dis.did.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateDigitalLogisticDisDidResponse({}));
  }

  /**
   * Description: 3PL运输合同上传
   * Summary: 3PL运输合同上传
   */
  async uploadDigitalLogisticTransportContract(request: UploadDigitalLogisticTransportContractRequest): Promise<UploadDigitalLogisticTransportContractResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.uploadDigitalLogisticTransportContractEx(request, runtime);
  }

  /**
   * Description: 3PL运输合同上传
   * Summary: 3PL运输合同上传
   */
  async uploadDigitalLogisticTransportContractEx(request: UploadDigitalLogisticTransportContractRequest, runtime: $Util.RuntimeOptions): Promise<UploadDigitalLogisticTransportContractResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadDigitalLogisticTransportContractResponse>(await this.doRequest("1.0", "digital.logistic.transport.contract.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UploadDigitalLogisticTransportContractResponse({}));
  }

  /**
   * Description: 3PL运输线路上传
   * Summary: 3PL运输线路上传
   */
  async uploadDigitalLogisticTransportRoute(request: UploadDigitalLogisticTransportRouteRequest): Promise<UploadDigitalLogisticTransportRouteResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.uploadDigitalLogisticTransportRouteEx(request, runtime);
  }

  /**
   * Description: 3PL运输线路上传
   * Summary: 3PL运输线路上传
   */
  async uploadDigitalLogisticTransportRouteEx(request: UploadDigitalLogisticTransportRouteRequest, runtime: $Util.RuntimeOptions): Promise<UploadDigitalLogisticTransportRouteResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadDigitalLogisticTransportRouteResponse>(await this.doRequest("1.0", "digital.logistic.transport.route.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UploadDigitalLogisticTransportRouteResponse({}));
  }

  /**
   * Description: 3PL运单创建
   * Summary: 3PL运单创建
   */
  async createDigitalLogisticTransportWaybill(request: CreateDigitalLogisticTransportWaybillRequest): Promise<CreateDigitalLogisticTransportWaybillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createDigitalLogisticTransportWaybillEx(request, runtime);
  }

  /**
   * Description: 3PL运单创建
   * Summary: 3PL运单创建
   */
  async createDigitalLogisticTransportWaybillEx(request: CreateDigitalLogisticTransportWaybillRequest, runtime: $Util.RuntimeOptions): Promise<CreateDigitalLogisticTransportWaybillResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDigitalLogisticTransportWaybillResponse>(await this.doRequest("1.0", "digital.logistic.transport.waybill.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateDigitalLogisticTransportWaybillResponse({}));
  }

  /**
   * Description: 3PL运单状态更新
   * Summary: 3PL运单状态更新
   */
  async updateDigitalLogisticWaybillAction(request: UpdateDigitalLogisticWaybillActionRequest): Promise<UpdateDigitalLogisticWaybillActionResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateDigitalLogisticWaybillActionEx(request, runtime);
  }

  /**
   * Description: 3PL运单状态更新
   * Summary: 3PL运单状态更新
   */
  async updateDigitalLogisticWaybillActionEx(request: UpdateDigitalLogisticWaybillActionRequest, runtime: $Util.RuntimeOptions): Promise<UpdateDigitalLogisticWaybillActionResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDigitalLogisticWaybillActionResponse>(await this.doRequest("1.0", "digital.logistic.waybill.action.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateDigitalLogisticWaybillActionResponse({}));
  }

  /**
   * Description: 3PL运单修改
   * Summary: 3PL运单修改
   */
  async updateDigitalLogisticTransportWaybill(request: UpdateDigitalLogisticTransportWaybillRequest): Promise<UpdateDigitalLogisticTransportWaybillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateDigitalLogisticTransportWaybillEx(request, runtime);
  }

  /**
   * Description: 3PL运单修改
   * Summary: 3PL运单修改
   */
  async updateDigitalLogisticTransportWaybillEx(request: UpdateDigitalLogisticTransportWaybillRequest, runtime: $Util.RuntimeOptions): Promise<UpdateDigitalLogisticTransportWaybillResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDigitalLogisticTransportWaybillResponse>(await this.doRequest("1.0", "digital.logistic.transport.waybill.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateDigitalLogisticTransportWaybillResponse({}));
  }

  /**
   * Description: 3PL回单上传
   * Summary: 3PL回单上传
   */
  async uploadDigitalLogisticTransportReceipt(request: UploadDigitalLogisticTransportReceiptRequest): Promise<UploadDigitalLogisticTransportReceiptResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.uploadDigitalLogisticTransportReceiptEx(request, runtime);
  }

  /**
   * Description: 3PL回单上传
   * Summary: 3PL回单上传
   */
  async uploadDigitalLogisticTransportReceiptEx(request: UploadDigitalLogisticTransportReceiptRequest, runtime: $Util.RuntimeOptions): Promise<UploadDigitalLogisticTransportReceiptResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadDigitalLogisticTransportReceiptResponse>(await this.doRequest("1.0", "digital.logistic.transport.receipt.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UploadDigitalLogisticTransportReceiptResponse({}));
  }

  /**
   * Description: 应收账单创建
   * Summary: 应收账单创建
   */
  async createDigitalLogisticBillReceivablebill(request: CreateDigitalLogisticBillReceivablebillRequest): Promise<CreateDigitalLogisticBillReceivablebillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createDigitalLogisticBillReceivablebillEx(request, runtime);
  }

  /**
   * Description: 应收账单创建
   * Summary: 应收账单创建
   */
  async createDigitalLogisticBillReceivablebillEx(request: CreateDigitalLogisticBillReceivablebillRequest, runtime: $Util.RuntimeOptions): Promise<CreateDigitalLogisticBillReceivablebillResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDigitalLogisticBillReceivablebillResponse>(await this.doRequest("1.0", "digital.logistic.bill.receivablebill.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateDigitalLogisticBillReceivablebillResponse({}));
  }

  /**
   * Description: 应收账单状态更新
   * Summary: 应收账单状态更新
   */
  async updateDigitalLogisticReceivablebillStatus(request: UpdateDigitalLogisticReceivablebillStatusRequest): Promise<UpdateDigitalLogisticReceivablebillStatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateDigitalLogisticReceivablebillStatusEx(request, runtime);
  }

  /**
   * Description: 应收账单状态更新
   * Summary: 应收账单状态更新
   */
  async updateDigitalLogisticReceivablebillStatusEx(request: UpdateDigitalLogisticReceivablebillStatusRequest, runtime: $Util.RuntimeOptions): Promise<UpdateDigitalLogisticReceivablebillStatusResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDigitalLogisticReceivablebillStatusResponse>(await this.doRequest("1.0", "digital.logistic.receivablebill.status.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateDigitalLogisticReceivablebillStatusResponse({}));
  }

  /**
   * Description: 应收账单修改
   * Summary: 应收账单修改
   */
  async updateDigitalLogisticBillReceivablebill(request: UpdateDigitalLogisticBillReceivablebillRequest): Promise<UpdateDigitalLogisticBillReceivablebillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateDigitalLogisticBillReceivablebillEx(request, runtime);
  }

  /**
   * Description: 应收账单修改
   * Summary: 应收账单修改
   */
  async updateDigitalLogisticBillReceivablebillEx(request: UpdateDigitalLogisticBillReceivablebillRequest, runtime: $Util.RuntimeOptions): Promise<UpdateDigitalLogisticBillReceivablebillResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDigitalLogisticBillReceivablebillResponse>(await this.doRequest("1.0", "digital.logistic.bill.receivablebill.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateDigitalLogisticBillReceivablebillResponse({}));
  }

  /**
   * Description: 路运发票创建
   * Summary: 路运发票创建
   */
  async createDigitalLogisticHighwayInvoice(request: CreateDigitalLogisticHighwayInvoiceRequest): Promise<CreateDigitalLogisticHighwayInvoiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createDigitalLogisticHighwayInvoiceEx(request, runtime);
  }

  /**
   * Description: 路运发票创建
   * Summary: 路运发票创建
   */
  async createDigitalLogisticHighwayInvoiceEx(request: CreateDigitalLogisticHighwayInvoiceRequest, runtime: $Util.RuntimeOptions): Promise<CreateDigitalLogisticHighwayInvoiceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDigitalLogisticHighwayInvoiceResponse>(await this.doRequest("1.0", "digital.logistic.highway.invoice.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateDigitalLogisticHighwayInvoiceResponse({}));
  }

  /**
   * Description: 司机信用流转协议签署并开通流转能力
   * Summary: 司机信用流转协议签署并开通流转能力
   */
  async openDigitalLogisticCreditDriver(request: OpenDigitalLogisticCreditDriverRequest): Promise<OpenDigitalLogisticCreditDriverResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.openDigitalLogisticCreditDriverEx(request, runtime);
  }

  /**
   * Description: 司机信用流转协议签署并开通流转能力
   * Summary: 司机信用流转协议签署并开通流转能力
   */
  async openDigitalLogisticCreditDriverEx(request: OpenDigitalLogisticCreditDriverRequest, runtime: $Util.RuntimeOptions): Promise<OpenDigitalLogisticCreditDriverResponse> {
    Util.validateModel(request);
    return $tea.cast<OpenDigitalLogisticCreditDriverResponse>(await this.doRequest("1.0", "digital.logistic.credit.driver.open", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new OpenDigitalLogisticCreditDriverResponse({}));
  }

  /**
   * Description: 查询司机信用流转能力开通情况
   * Summary: 查询司机信用流转能力开通情况
   */
  async queryDigitalLogisticCreditDriver(request: QueryDigitalLogisticCreditDriverRequest): Promise<QueryDigitalLogisticCreditDriverResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryDigitalLogisticCreditDriverEx(request, runtime);
  }

  /**
   * Description: 查询司机信用流转能力开通情况
   * Summary: 查询司机信用流转能力开通情况
   */
  async queryDigitalLogisticCreditDriverEx(request: QueryDigitalLogisticCreditDriverRequest, runtime: $Util.RuntimeOptions): Promise<QueryDigitalLogisticCreditDriverResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDigitalLogisticCreditDriverResponse>(await this.doRequest("1.0", "digital.logistic.credit.driver.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryDigitalLogisticCreditDriverResponse({}));
  }

  /**
   * Description: 查询货主信用流转能力开通情况
   * Summary: 查询货主信用流转能力开通情况
   */
  async queryDigitalLogisticCreditConsignor(request: QueryDigitalLogisticCreditConsignorRequest): Promise<QueryDigitalLogisticCreditConsignorResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryDigitalLogisticCreditConsignorEx(request, runtime);
  }

  /**
   * Description: 查询货主信用流转能力开通情况
   * Summary: 查询货主信用流转能力开通情况
   */
  async queryDigitalLogisticCreditConsignorEx(request: QueryDigitalLogisticCreditConsignorRequest, runtime: $Util.RuntimeOptions): Promise<QueryDigitalLogisticCreditConsignorResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDigitalLogisticCreditConsignorResponse>(await this.doRequest("1.0", "digital.logistic.credit.consignor.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryDigitalLogisticCreditConsignorResponse({}));
  }

  /**
   * Description: 查询货主信用流转额度
   * Summary: 查询货主信用流转额度
   */
  async queryDigitalLogisticCreditBalance(request: QueryDigitalLogisticCreditBalanceRequest): Promise<QueryDigitalLogisticCreditBalanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryDigitalLogisticCreditBalanceEx(request, runtime);
  }

  /**
   * Description: 查询货主信用流转额度
   * Summary: 查询货主信用流转额度
   */
  async queryDigitalLogisticCreditBalanceEx(request: QueryDigitalLogisticCreditBalanceRequest, runtime: $Util.RuntimeOptions): Promise<QueryDigitalLogisticCreditBalanceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDigitalLogisticCreditBalanceResponse>(await this.doRequest("1.0", "digital.logistic.credit.balance.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryDigitalLogisticCreditBalanceResponse({}));
  }

  /**
   * Description: 发行信用流转批次信息上传（只做信息上传，供真正web端发行时使用）
   * Summary: 发行信用流转批次信息上传
   */
  async uploadDigitalLogisticCreditIssue(request: UploadDigitalLogisticCreditIssueRequest): Promise<UploadDigitalLogisticCreditIssueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.uploadDigitalLogisticCreditIssueEx(request, runtime);
  }

  /**
   * Description: 发行信用流转批次信息上传（只做信息上传，供真正web端发行时使用）
   * Summary: 发行信用流转批次信息上传
   */
  async uploadDigitalLogisticCreditIssueEx(request: UploadDigitalLogisticCreditIssueRequest, runtime: $Util.RuntimeOptions): Promise<UploadDigitalLogisticCreditIssueResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadDigitalLogisticCreditIssueResponse>(await this.doRequest("1.0", "digital.logistic.credit.issue.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UploadDigitalLogisticCreditIssueResponse({}));
  }

  /**
   * Description: 信用流转批次状态查询
   * Summary: 信用流转批次状态查询
   */
  async queryDigitalLogisticCreditIssuebatchstatus(request: QueryDigitalLogisticCreditIssuebatchstatusRequest): Promise<QueryDigitalLogisticCreditIssuebatchstatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryDigitalLogisticCreditIssuebatchstatusEx(request, runtime);
  }

  /**
   * Description: 信用流转批次状态查询
   * Summary: 信用流转批次状态查询
   */
  async queryDigitalLogisticCreditIssuebatchstatusEx(request: QueryDigitalLogisticCreditIssuebatchstatusRequest, runtime: $Util.RuntimeOptions): Promise<QueryDigitalLogisticCreditIssuebatchstatusResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDigitalLogisticCreditIssuebatchstatusResponse>(await this.doRequest("1.0", "digital.logistic.credit.issuebatchstatus.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryDigitalLogisticCreditIssuebatchstatusResponse({}));
  }

  /**
   * Description: 支付批次撤销
   * Summary: 支付批次撤销
   */
  async cancelDigitalLogisticCreditIssuebatch(request: CancelDigitalLogisticCreditIssuebatchRequest): Promise<CancelDigitalLogisticCreditIssuebatchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.cancelDigitalLogisticCreditIssuebatchEx(request, runtime);
  }

  /**
   * Description: 支付批次撤销
   * Summary: 支付批次撤销
   */
  async cancelDigitalLogisticCreditIssuebatchEx(request: CancelDigitalLogisticCreditIssuebatchRequest, runtime: $Util.RuntimeOptions): Promise<CancelDigitalLogisticCreditIssuebatchResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelDigitalLogisticCreditIssuebatchResponse>(await this.doRequest("1.0", "digital.logistic.credit.issuebatch.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CancelDigitalLogisticCreditIssuebatchResponse({}));
  }

  /**
   * Description: 根据id查询信用凭证信息
   * Summary: 根据id查询信用凭证信息
   */
  async queryDigitalLogisticCreditIssuebyid(request: QueryDigitalLogisticCreditIssuebyidRequest): Promise<QueryDigitalLogisticCreditIssuebyidResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryDigitalLogisticCreditIssuebyidEx(request, runtime);
  }

  /**
   * Description: 根据id查询信用凭证信息
   * Summary: 根据id查询信用凭证信息
   */
  async queryDigitalLogisticCreditIssuebyidEx(request: QueryDigitalLogisticCreditIssuebyidRequest, runtime: $Util.RuntimeOptions): Promise<QueryDigitalLogisticCreditIssuebyidResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDigitalLogisticCreditIssuebyidResponse>(await this.doRequest("1.0", "digital.logistic.credit.issuebyid.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryDigitalLogisticCreditIssuebyidResponse({}));
  }

  /**
   * Description: 根据时间查询信用凭证信息
   * Summary: 根据时间查询信用凭证信息
   */
  async queryDigitalLogisticCreditIssuebytime(request: QueryDigitalLogisticCreditIssuebytimeRequest): Promise<QueryDigitalLogisticCreditIssuebytimeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryDigitalLogisticCreditIssuebytimeEx(request, runtime);
  }

  /**
   * Description: 根据时间查询信用凭证信息
   * Summary: 根据时间查询信用凭证信息
   */
  async queryDigitalLogisticCreditIssuebytimeEx(request: QueryDigitalLogisticCreditIssuebytimeRequest, runtime: $Util.RuntimeOptions): Promise<QueryDigitalLogisticCreditIssuebytimeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDigitalLogisticCreditIssuebytimeResponse>(await this.doRequest("1.0", "digital.logistic.credit.issuebytime.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryDigitalLogisticCreditIssuebytimeResponse({}));
  }

  /**
   * Description: 查询用户持有的信用凭证信息
   * Summary: 查询用户持有的信用凭证信息
   */
  async queryDigitalLogisticCreditUserissue(request: QueryDigitalLogisticCreditUserissueRequest): Promise<QueryDigitalLogisticCreditUserissueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryDigitalLogisticCreditUserissueEx(request, runtime);
  }

  /**
   * Description: 查询用户持有的信用凭证信息
   * Summary: 查询用户持有的信用凭证信息
   */
  async queryDigitalLogisticCreditUserissueEx(request: QueryDigitalLogisticCreditUserissueRequest, runtime: $Util.RuntimeOptions): Promise<QueryDigitalLogisticCreditUserissueResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDigitalLogisticCreditUserissueResponse>(await this.doRequest("1.0", "digital.logistic.credit.userissue.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryDigitalLogisticCreditUserissueResponse({}));
  }

  /**
   * Description: 查询用户信用流转流水记录
   * Summary: 查询用户信用流转流水记录
   */
  async queryDigitalLogisticCreditStatement(request: QueryDigitalLogisticCreditStatementRequest): Promise<QueryDigitalLogisticCreditStatementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryDigitalLogisticCreditStatementEx(request, runtime);
  }

  /**
   * Description: 查询用户信用流转流水记录
   * Summary: 查询用户信用流转流水记录
   */
  async queryDigitalLogisticCreditStatementEx(request: QueryDigitalLogisticCreditStatementRequest, runtime: $Util.RuntimeOptions): Promise<QueryDigitalLogisticCreditStatementResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDigitalLogisticCreditStatementResponse>(await this.doRequest("1.0", "digital.logistic.credit.statement.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryDigitalLogisticCreditStatementResponse({}));
  }

  /**
   * Description: 信用凭证拆分转让申请
   * Summary: 信用凭证拆分转让申请
   */
  async createDigitalLogisticCreditIssuetransfer(request: CreateDigitalLogisticCreditIssuetransferRequest): Promise<CreateDigitalLogisticCreditIssuetransferResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createDigitalLogisticCreditIssuetransferEx(request, runtime);
  }

  /**
   * Description: 信用凭证拆分转让申请
   * Summary: 信用凭证拆分转让申请
   */
  async createDigitalLogisticCreditIssuetransferEx(request: CreateDigitalLogisticCreditIssuetransferRequest, runtime: $Util.RuntimeOptions): Promise<CreateDigitalLogisticCreditIssuetransferResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDigitalLogisticCreditIssuetransferResponse>(await this.doRequest("1.0", "digital.logistic.credit.issuetransfer.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateDigitalLogisticCreditIssuetransferResponse({}));
  }

  /**
   * Description: 信用凭证拆分转让结果查询
   * Summary: 信用凭证拆分转让结果查询
   */
  async queryDigitalLogisticCreditIssuetransfer(request: QueryDigitalLogisticCreditIssuetransferRequest): Promise<QueryDigitalLogisticCreditIssuetransferResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryDigitalLogisticCreditIssuetransferEx(request, runtime);
  }

  /**
   * Description: 信用凭证拆分转让结果查询
   * Summary: 信用凭证拆分转让结果查询
   */
  async queryDigitalLogisticCreditIssuetransferEx(request: QueryDigitalLogisticCreditIssuetransferRequest, runtime: $Util.RuntimeOptions): Promise<QueryDigitalLogisticCreditIssuetransferResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDigitalLogisticCreditIssuetransferResponse>(await this.doRequest("1.0", "digital.logistic.credit.issuetransfer.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryDigitalLogisticCreditIssuetransferResponse({}));
  }

  /**
   * Description: 信用凭证融资申请
   * Summary: 信用凭证融资申请
   */
  async createDigitalLogisticCreditIssuefinance(request: CreateDigitalLogisticCreditIssuefinanceRequest): Promise<CreateDigitalLogisticCreditIssuefinanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createDigitalLogisticCreditIssuefinanceEx(request, runtime);
  }

  /**
   * Description: 信用凭证融资申请
   * Summary: 信用凭证融资申请
   */
  async createDigitalLogisticCreditIssuefinanceEx(request: CreateDigitalLogisticCreditIssuefinanceRequest, runtime: $Util.RuntimeOptions): Promise<CreateDigitalLogisticCreditIssuefinanceResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDigitalLogisticCreditIssuefinanceResponse>(await this.doRequest("1.0", "digital.logistic.credit.issuefinance.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateDigitalLogisticCreditIssuefinanceResponse({}));
  }

  /**
   * Description: 信用凭证融资结果查询
   * Summary: 信用凭证融资结果查询
   */
  async queryDigitalLogisticCreditIssuefinance(request: QueryDigitalLogisticCreditIssuefinanceRequest): Promise<QueryDigitalLogisticCreditIssuefinanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryDigitalLogisticCreditIssuefinanceEx(request, runtime);
  }

  /**
   * Description: 信用凭证融资结果查询
   * Summary: 信用凭证融资结果查询
   */
  async queryDigitalLogisticCreditIssuefinanceEx(request: QueryDigitalLogisticCreditIssuefinanceRequest, runtime: $Util.RuntimeOptions): Promise<QueryDigitalLogisticCreditIssuefinanceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDigitalLogisticCreditIssuefinanceResponse>(await this.doRequest("1.0", "digital.logistic.credit.issuefinance.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryDigitalLogisticCreditIssuefinanceResponse({}));
  }

  /**
   * Description: 信用凭证清分信息查询
   * Summary: 信用凭证清分信息查询
   */
  async queryDigitalLogisticCreditIssuereceivable(request: QueryDigitalLogisticCreditIssuereceivableRequest): Promise<QueryDigitalLogisticCreditIssuereceivableResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryDigitalLogisticCreditIssuereceivableEx(request, runtime);
  }

  /**
   * Description: 信用凭证清分信息查询
   * Summary: 信用凭证清分信息查询
   */
  async queryDigitalLogisticCreditIssuereceivableEx(request: QueryDigitalLogisticCreditIssuereceivableRequest, runtime: $Util.RuntimeOptions): Promise<QueryDigitalLogisticCreditIssuereceivableResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDigitalLogisticCreditIssuereceivableResponse>(await this.doRequest("1.0", "digital.logistic.credit.issuereceivable.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryDigitalLogisticCreditIssuereceivableResponse({}));
  }

  /**
   * Description: 信用凭证资产查询
   * Summary: 信用凭证资产查询
   */
  async queryDigitalLogisticCreditIssueamount(request: QueryDigitalLogisticCreditIssueamountRequest): Promise<QueryDigitalLogisticCreditIssueamountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryDigitalLogisticCreditIssueamountEx(request, runtime);
  }

  /**
   * Description: 信用凭证资产查询
   * Summary: 信用凭证资产查询
   */
  async queryDigitalLogisticCreditIssueamountEx(request: QueryDigitalLogisticCreditIssueamountRequest, runtime: $Util.RuntimeOptions): Promise<QueryDigitalLogisticCreditIssueamountResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDigitalLogisticCreditIssueamountResponse>(await this.doRequest("1.0", "digital.logistic.credit.issueamount.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryDigitalLogisticCreditIssueamountResponse({}));
  }

  /**
   * Description: 物流金融统一回调接口
   * Summary: 物流金融统一回调接口
   */
  async callbackDigitalLogisticCreditCommon(request: CallbackDigitalLogisticCreditCommonRequest): Promise<CallbackDigitalLogisticCreditCommonResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.callbackDigitalLogisticCreditCommonEx(request, runtime);
  }

  /**
   * Description: 物流金融统一回调接口
   * Summary: 物流金融统一回调接口
   */
  async callbackDigitalLogisticCreditCommonEx(request: CallbackDigitalLogisticCreditCommonRequest, runtime: $Util.RuntimeOptions): Promise<CallbackDigitalLogisticCreditCommonResponse> {
    Util.validateModel(request);
    return $tea.cast<CallbackDigitalLogisticCreditCommonResponse>(await this.doRequest("1.0", "digital.logistic.credit.common.callback", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CallbackDigitalLogisticCreditCommonResponse({}));
  }

  /**
   * Description: 信用凭证主动清分
   * Summary: 信用凭证主动清分
   */
  async applyDigitalLogisticCreditIssueclear(request: ApplyDigitalLogisticCreditIssueclearRequest): Promise<ApplyDigitalLogisticCreditIssueclearResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.applyDigitalLogisticCreditIssueclearEx(request, runtime);
  }

  /**
   * Description: 信用凭证主动清分
   * Summary: 信用凭证主动清分
   */
  async applyDigitalLogisticCreditIssueclearEx(request: ApplyDigitalLogisticCreditIssueclearRequest, runtime: $Util.RuntimeOptions): Promise<ApplyDigitalLogisticCreditIssueclearResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyDigitalLogisticCreditIssueclearResponse>(await this.doRequest("1.0", "digital.logistic.credit.issueclear.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ApplyDigitalLogisticCreditIssueclearResponse({}));
  }

  /**
   * Description: 物流金融代理消息
   * Summary: 物流金融代理消息
   */
  async sendDigitalLogisticCreditProxy(request: SendDigitalLogisticCreditProxyRequest): Promise<SendDigitalLogisticCreditProxyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.sendDigitalLogisticCreditProxyEx(request, runtime);
  }

  /**
   * Description: 物流金融代理消息
   * Summary: 物流金融代理消息
   */
  async sendDigitalLogisticCreditProxyEx(request: SendDigitalLogisticCreditProxyRequest, runtime: $Util.RuntimeOptions): Promise<SendDigitalLogisticCreditProxyResponse> {
    Util.validateModel(request);
    return $tea.cast<SendDigitalLogisticCreditProxyResponse>(await this.doRequest("1.0", "digital.logistic.credit.proxy.send", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new SendDigitalLogisticCreditProxyResponse({}));
  }

  /**
   * Description: 运单信用流转核验结果查询
   * Summary: 运单信用流转核验结果查询
   */
  async checkDigitalLogisticCreditWaybill(request: CheckDigitalLogisticCreditWaybillRequest): Promise<CheckDigitalLogisticCreditWaybillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.checkDigitalLogisticCreditWaybillEx(request, runtime);
  }

  /**
   * Description: 运单信用流转核验结果查询
   * Summary: 运单信用流转核验结果查询
   */
  async checkDigitalLogisticCreditWaybillEx(request: CheckDigitalLogisticCreditWaybillRequest, runtime: $Util.RuntimeOptions): Promise<CheckDigitalLogisticCreditWaybillResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckDigitalLogisticCreditWaybillResponse>(await this.doRequest("1.0", "digital.logistic.credit.waybill.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CheckDigitalLogisticCreditWaybillResponse({}));
  }

  /**
   * Description: 物流金融信用流转司机换绑
   * Summary: 物流金融信用流转司机换绑
   */
  async reopenDigitalLogisticCreditDriver(request: ReopenDigitalLogisticCreditDriverRequest): Promise<ReopenDigitalLogisticCreditDriverResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.reopenDigitalLogisticCreditDriverEx(request, runtime);
  }

  /**
   * Description: 物流金融信用流转司机换绑
   * Summary: 物流金融信用流转司机换绑
   */
  async reopenDigitalLogisticCreditDriverEx(request: ReopenDigitalLogisticCreditDriverRequest, runtime: $Util.RuntimeOptions): Promise<ReopenDigitalLogisticCreditDriverResponse> {
    Util.validateModel(request);
    return $tea.cast<ReopenDigitalLogisticCreditDriverResponse>(await this.doRequest("1.0", "digital.logistic.credit.driver.reopen", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ReopenDigitalLogisticCreditDriverResponse({}));
  }

  /**
   * Description: 线下协议授权关系上传
   * Summary: 线下协议授权关系上传
   */
  async uploadDigitalLogisticCreditAuthorization(request: UploadDigitalLogisticCreditAuthorizationRequest): Promise<UploadDigitalLogisticCreditAuthorizationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.uploadDigitalLogisticCreditAuthorizationEx(request, runtime);
  }

  /**
   * Description: 线下协议授权关系上传
   * Summary: 线下协议授权关系上传
   */
  async uploadDigitalLogisticCreditAuthorizationEx(request: UploadDigitalLogisticCreditAuthorizationRequest, runtime: $Util.RuntimeOptions): Promise<UploadDigitalLogisticCreditAuthorizationResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadDigitalLogisticCreditAuthorizationResponse>(await this.doRequest("1.0", "digital.logistic.credit.authorization.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UploadDigitalLogisticCreditAuthorizationResponse({}));
  }

  /**
   * Description: 线上应收转让确认关系
   * Summary: 线上应收转让确认关系
   */
  async uploadDigitalLogisticCreditConfirm(request: UploadDigitalLogisticCreditConfirmRequest): Promise<UploadDigitalLogisticCreditConfirmResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.uploadDigitalLogisticCreditConfirmEx(request, runtime);
  }

  /**
   * Description: 线上应收转让确认关系
   * Summary: 线上应收转让确认关系
   */
  async uploadDigitalLogisticCreditConfirmEx(request: UploadDigitalLogisticCreditConfirmRequest, runtime: $Util.RuntimeOptions): Promise<UploadDigitalLogisticCreditConfirmResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadDigitalLogisticCreditConfirmResponse>(await this.doRequest("1.0", "digital.logistic.credit.confirm.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UploadDigitalLogisticCreditConfirmResponse({}));
  }

  /**
   * Description: 物流信用流转凭证批量发行
   * Summary: 物流信用流转凭证批量发行
   */
  async batchcreateDigitalLogisticCreditmodeIssue(request: BatchcreateDigitalLogisticCreditmodeIssueRequest): Promise<BatchcreateDigitalLogisticCreditmodeIssueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.batchcreateDigitalLogisticCreditmodeIssueEx(request, runtime);
  }

  /**
   * Description: 物流信用流转凭证批量发行
   * Summary: 物流信用流转凭证批量发行
   */
  async batchcreateDigitalLogisticCreditmodeIssueEx(request: BatchcreateDigitalLogisticCreditmodeIssueRequest, runtime: $Util.RuntimeOptions): Promise<BatchcreateDigitalLogisticCreditmodeIssueResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateDigitalLogisticCreditmodeIssueResponse>(await this.doRequest("1.0", "digital.logistic.creditmode.issue.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new BatchcreateDigitalLogisticCreditmodeIssueResponse({}));
  }

  /**
   * Description: 物流信用流转按模式主动清分
   * Summary: 物流信用流转按模式主动清分
   */
  async applyDigitalLogisticCreditmodeIssueclear(request: ApplyDigitalLogisticCreditmodeIssueclearRequest): Promise<ApplyDigitalLogisticCreditmodeIssueclearResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.applyDigitalLogisticCreditmodeIssueclearEx(request, runtime);
  }

  /**
   * Description: 物流信用流转按模式主动清分
   * Summary: 物流信用流转按模式主动清分
   */
  async applyDigitalLogisticCreditmodeIssueclearEx(request: ApplyDigitalLogisticCreditmodeIssueclearRequest, runtime: $Util.RuntimeOptions): Promise<ApplyDigitalLogisticCreditmodeIssueclearResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyDigitalLogisticCreditmodeIssueclearResponse>(await this.doRequest("1.0", "digital.logistic.creditmode.issueclear.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ApplyDigitalLogisticCreditmodeIssueclearResponse({}));
  }

  /**
   * Description: 信用流转发行信息上传SAAS版
   * Summary: 信用流转发行信息上传SAAS版
   */
  async uploadDigitalLogisticCreditIssuebysaas(request: UploadDigitalLogisticCreditIssuebysaasRequest): Promise<UploadDigitalLogisticCreditIssuebysaasResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.uploadDigitalLogisticCreditIssuebysaasEx(request, runtime);
  }

  /**
   * Description: 信用流转发行信息上传SAAS版
   * Summary: 信用流转发行信息上传SAAS版
   */
  async uploadDigitalLogisticCreditIssuebysaasEx(request: UploadDigitalLogisticCreditIssuebysaasRequest, runtime: $Util.RuntimeOptions): Promise<UploadDigitalLogisticCreditIssuebysaasResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadDigitalLogisticCreditIssuebysaasResponse>(await this.doRequest("1.0", "digital.logistic.credit.issuebysaas.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UploadDigitalLogisticCreditIssuebysaasResponse({}));
  }

  /**
   * Description: 信用流转B模式发行批次撤销SAAS版
   * Summary: 信用流转B模式发行批次撤销SAAS版
   */
  async cancelDigitalLogisticCreditIssuebatchbysaas(request: CancelDigitalLogisticCreditIssuebatchbysaasRequest): Promise<CancelDigitalLogisticCreditIssuebatchbysaasResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.cancelDigitalLogisticCreditIssuebatchbysaasEx(request, runtime);
  }

  /**
   * Description: 信用流转B模式发行批次撤销SAAS版
   * Summary: 信用流转B模式发行批次撤销SAAS版
   */
  async cancelDigitalLogisticCreditIssuebatchbysaasEx(request: CancelDigitalLogisticCreditIssuebatchbysaasRequest, runtime: $Util.RuntimeOptions): Promise<CancelDigitalLogisticCreditIssuebatchbysaasResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelDigitalLogisticCreditIssuebatchbysaasResponse>(await this.doRequest("1.0", "digital.logistic.credit.issuebatchbysaas.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CancelDigitalLogisticCreditIssuebatchbysaasResponse({}));
  }

  /**
   * Description: 信用流转可用额度查询SAAS版
   * Summary: 信用流转可用额度查询SAAS版
   */
  async queryDigitalLogisticCreditBalancebysaas(request: QueryDigitalLogisticCreditBalancebysaasRequest): Promise<QueryDigitalLogisticCreditBalancebysaasResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryDigitalLogisticCreditBalancebysaasEx(request, runtime);
  }

  /**
   * Description: 信用流转可用额度查询SAAS版
   * Summary: 信用流转可用额度查询SAAS版
   */
  async queryDigitalLogisticCreditBalancebysaasEx(request: QueryDigitalLogisticCreditBalancebysaasRequest, runtime: $Util.RuntimeOptions): Promise<QueryDigitalLogisticCreditBalancebysaasResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDigitalLogisticCreditBalancebysaasResponse>(await this.doRequest("1.0", "digital.logistic.credit.balancebysaas.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryDigitalLogisticCreditBalancebysaasResponse({}));
  }

  /**
   * Description: 信用凭证电子回单获取
   * Summary: 信用凭证电子回单获取
   */
  async getDigitalLogisticCreditIssuescpticket(request: GetDigitalLogisticCreditIssuescpticketRequest): Promise<GetDigitalLogisticCreditIssuescpticketResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.getDigitalLogisticCreditIssuescpticketEx(request, runtime);
  }

  /**
   * Description: 信用凭证电子回单获取
   * Summary: 信用凭证电子回单获取
   */
  async getDigitalLogisticCreditIssuescpticketEx(request: GetDigitalLogisticCreditIssuescpticketRequest, runtime: $Util.RuntimeOptions): Promise<GetDigitalLogisticCreditIssuescpticketResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDigitalLogisticCreditIssuescpticketResponse>(await this.doRequest("1.0", "digital.logistic.credit.issuescpticket.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new GetDigitalLogisticCreditIssuescpticketResponse({}));
  }

  /**
   * Description: 信用凭证电子回单获取结果查询接口
   * Summary: 信用凭证电子回单获取结果查询接口
   */
  async queryDigitalLogisticCreditIssuescpticketresult(request: QueryDigitalLogisticCreditIssuescpticketresultRequest): Promise<QueryDigitalLogisticCreditIssuescpticketresultResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryDigitalLogisticCreditIssuescpticketresultEx(request, runtime);
  }

  /**
   * Description: 信用凭证电子回单获取结果查询接口
   * Summary: 信用凭证电子回单获取结果查询接口
   */
  async queryDigitalLogisticCreditIssuescpticketresultEx(request: QueryDigitalLogisticCreditIssuescpticketresultRequest, runtime: $Util.RuntimeOptions): Promise<QueryDigitalLogisticCreditIssuescpticketresultResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDigitalLogisticCreditIssuescpticketresultResponse>(await this.doRequest("1.0", "digital.logistic.credit.issuescpticketresult.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryDigitalLogisticCreditIssuescpticketresultResponse({}));
  }

  /**
   * Description: 信用流转A+模式发行信息上传
   * Summary: 信用流转A+模式发行信息上传
   */
  async uploadDigitalLogisticCreditAplusissue(request: UploadDigitalLogisticCreditAplusissueRequest): Promise<UploadDigitalLogisticCreditAplusissueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.uploadDigitalLogisticCreditAplusissueEx(request, runtime);
  }

  /**
   * Description: 信用流转A+模式发行信息上传
   * Summary: 信用流转A+模式发行信息上传
   */
  async uploadDigitalLogisticCreditAplusissueEx(request: UploadDigitalLogisticCreditAplusissueRequest, runtime: $Util.RuntimeOptions): Promise<UploadDigitalLogisticCreditAplusissueResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadDigitalLogisticCreditAplusissueResponse>(await this.doRequest("1.0", "digital.logistic.credit.aplusissue.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UploadDigitalLogisticCreditAplusissueResponse({}));
  }

  /**
   * Description: 信用流转可用额度查询接口
   * Summary: 信用流转可用额度查询接口
   */
  async queryDigitalLogisticCreditCreditamount(request: QueryDigitalLogisticCreditCreditamountRequest): Promise<QueryDigitalLogisticCreditCreditamountResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryDigitalLogisticCreditCreditamountEx(request, runtime);
  }

  /**
   * Description: 信用流转可用额度查询接口
   * Summary: 信用流转可用额度查询接口
   */
  async queryDigitalLogisticCreditCreditamountEx(request: QueryDigitalLogisticCreditCreditamountRequest, runtime: $Util.RuntimeOptions): Promise<QueryDigitalLogisticCreditCreditamountResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDigitalLogisticCreditCreditamountResponse>(await this.doRequest("1.0", "digital.logistic.credit.creditamount.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryDigitalLogisticCreditCreditamountResponse({}));
  }

  /**
   * Description: 信用流转非授信通用签约接口
   * Summary: 信用流转非授信通用签约接口
   */
  async createDigitalLogisticCreditCommonsign(request: CreateDigitalLogisticCreditCommonsignRequest): Promise<CreateDigitalLogisticCreditCommonsignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createDigitalLogisticCreditCommonsignEx(request, runtime);
  }

  /**
   * Description: 信用流转非授信通用签约接口
   * Summary: 信用流转非授信通用签约接口
   */
  async createDigitalLogisticCreditCommonsignEx(request: CreateDigitalLogisticCreditCommonsignRequest, runtime: $Util.RuntimeOptions): Promise<CreateDigitalLogisticCreditCommonsignResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDigitalLogisticCreditCommonsignResponse>(await this.doRequest("1.0", "digital.logistic.credit.commonsign.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateDigitalLogisticCreditCommonsignResponse({}));
  }

  /**
   * Description: 信用流转非授信通用签约查询接口
   * Summary: 信用流转非授信通用签约查询接口
   */
  async queryDigitalLogisticCreditCommonsign(request: QueryDigitalLogisticCreditCommonsignRequest): Promise<QueryDigitalLogisticCreditCommonsignResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryDigitalLogisticCreditCommonsignEx(request, runtime);
  }

  /**
   * Description: 信用流转非授信通用签约查询接口
   * Summary: 信用流转非授信通用签约查询接口
   */
  async queryDigitalLogisticCreditCommonsignEx(request: QueryDigitalLogisticCreditCommonsignRequest, runtime: $Util.RuntimeOptions): Promise<QueryDigitalLogisticCreditCommonsignResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDigitalLogisticCreditCommonsignResponse>(await this.doRequest("1.0", "digital.logistic.credit.commonsign.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryDigitalLogisticCreditCommonsignResponse({}));
  }

  /**
   * Description: 信用流转凭证合并发行接口
   * Summary: 信用流转凭证合并发行接口
   */
  async batchcreateDigitalLogisticCreditIssue(request: BatchcreateDigitalLogisticCreditIssueRequest): Promise<BatchcreateDigitalLogisticCreditIssueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.batchcreateDigitalLogisticCreditIssueEx(request, runtime);
  }

  /**
   * Description: 信用流转凭证合并发行接口
   * Summary: 信用流转凭证合并发行接口
   */
  async batchcreateDigitalLogisticCreditIssueEx(request: BatchcreateDigitalLogisticCreditIssueRequest, runtime: $Util.RuntimeOptions): Promise<BatchcreateDigitalLogisticCreditIssueResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateDigitalLogisticCreditIssueResponse>(await this.doRequest("1.0", "digital.logistic.credit.issue.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new BatchcreateDigitalLogisticCreditIssueResponse({}));
  }

  /**
   * Description: 信用流转凭证合并发行信息上传接口
   * Summary: 信用流转凭证合并发行信息上传接口
   */
  async uploadDigitalLogisticCreditIssuebatch(request: UploadDigitalLogisticCreditIssuebatchRequest): Promise<UploadDigitalLogisticCreditIssuebatchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.uploadDigitalLogisticCreditIssuebatchEx(request, runtime);
  }

  /**
   * Description: 信用流转凭证合并发行信息上传接口
   * Summary: 信用流转凭证合并发行信息上传接口
   */
  async uploadDigitalLogisticCreditIssuebatchEx(request: UploadDigitalLogisticCreditIssuebatchRequest, runtime: $Util.RuntimeOptions): Promise<UploadDigitalLogisticCreditIssuebatchResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadDigitalLogisticCreditIssuebatchResponse>(await this.doRequest("1.0", "digital.logistic.credit.issuebatch.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UploadDigitalLogisticCreditIssuebatchResponse({}));
  }

  /**
   * Description: 信用凭证电子回单获取(新)，明确了凭证的转出方did和转入方did
   * Summary: 信用凭证电子回单获取(新)
   */
  async getDigitalLogisticIssueTransferfile(request: GetDigitalLogisticIssueTransferfileRequest): Promise<GetDigitalLogisticIssueTransferfileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.getDigitalLogisticIssueTransferfileEx(request, runtime);
  }

  /**
   * Description: 信用凭证电子回单获取(新)，明确了凭证的转出方did和转入方did
   * Summary: 信用凭证电子回单获取(新)
   */
  async getDigitalLogisticIssueTransferfileEx(request: GetDigitalLogisticIssueTransferfileRequest, runtime: $Util.RuntimeOptions): Promise<GetDigitalLogisticIssueTransferfileResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDigitalLogisticIssueTransferfileResponse>(await this.doRequest("1.0", "digital.logistic.issue.transferfile.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new GetDigitalLogisticIssueTransferfileResponse({}));
  }

  /**
   * Description: 保险服务，投保接口。接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
   * Summary: 投保接口-中华财险-承运人责任险
   */
  async applyDigitalLogisticInsurancepolicyZhonghuacaixian(request: ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest): Promise<ApplyDigitalLogisticInsurancepolicyZhonghuacaixianResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.applyDigitalLogisticInsurancepolicyZhonghuacaixianEx(request, runtime);
  }

  /**
   * Description: 保险服务，投保接口。接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
   * Summary: 投保接口-中华财险-承运人责任险
   */
  async applyDigitalLogisticInsurancepolicyZhonghuacaixianEx(request: ApplyDigitalLogisticInsurancepolicyZhonghuacaixianRequest, runtime: $Util.RuntimeOptions): Promise<ApplyDigitalLogisticInsurancepolicyZhonghuacaixianResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyDigitalLogisticInsurancepolicyZhonghuacaixianResponse>(await this.doRequest("1.0", "digital.logistic.insurancepolicy.zhonghuacaixian.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ApplyDigitalLogisticInsurancepolicyZhonghuacaixianResponse({}));
  }

  /**
   * Description: 数字物流保险，退保接口
   * Summary: 退保接口-中华财险-承运人责任险
   */
  async cancelDigitalLogisticInsurancepolicyZhonghuacaixian(request: CancelDigitalLogisticInsurancepolicyZhonghuacaixianRequest): Promise<CancelDigitalLogisticInsurancepolicyZhonghuacaixianResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.cancelDigitalLogisticInsurancepolicyZhonghuacaixianEx(request, runtime);
  }

  /**
   * Description: 数字物流保险，退保接口
   * Summary: 退保接口-中华财险-承运人责任险
   */
  async cancelDigitalLogisticInsurancepolicyZhonghuacaixianEx(request: CancelDigitalLogisticInsurancepolicyZhonghuacaixianRequest, runtime: $Util.RuntimeOptions): Promise<CancelDigitalLogisticInsurancepolicyZhonghuacaixianResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelDigitalLogisticInsurancepolicyZhonghuacaixianResponse>(await this.doRequest("1.0", "digital.logistic.insurancepolicy.zhonghuacaixian.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CancelDigitalLogisticInsurancepolicyZhonghuacaixianResponse({}));
  }

  /**
   * Description: 保险理赔通知
   * Summary: 保险理赔通知
   */
  async pushDigitalLogisticInsurancenotifyClaim(request: PushDigitalLogisticInsurancenotifyClaimRequest): Promise<PushDigitalLogisticInsurancenotifyClaimResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.pushDigitalLogisticInsurancenotifyClaimEx(request, runtime);
  }

  /**
   * Description: 保险理赔通知
   * Summary: 保险理赔通知
   */
  async pushDigitalLogisticInsurancenotifyClaimEx(request: PushDigitalLogisticInsurancenotifyClaimRequest, runtime: $Util.RuntimeOptions): Promise<PushDigitalLogisticInsurancenotifyClaimResponse> {
    Util.validateModel(request);
    return $tea.cast<PushDigitalLogisticInsurancenotifyClaimResponse>(await this.doRequest("1.0", "digital.logistic.insurancenotify.claim.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new PushDigitalLogisticInsurancenotifyClaimResponse({}));
  }

  /**
   * Description: 系统会生成上传文件的连接，使用方使用该链接进行文件上传。该链接具有一定的时效性，因此建议按需按时申请使用
   * Summary: 上传文件链接申请
   */
  async applyDigitalLogisticInsuranceFileurl(request: ApplyDigitalLogisticInsuranceFileurlRequest): Promise<ApplyDigitalLogisticInsuranceFileurlResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.applyDigitalLogisticInsuranceFileurlEx(request, runtime);
  }

  /**
   * Description: 系统会生成上传文件的连接，使用方使用该链接进行文件上传。该链接具有一定的时效性，因此建议按需按时申请使用
   * Summary: 上传文件链接申请
   */
  async applyDigitalLogisticInsuranceFileurlEx(request: ApplyDigitalLogisticInsuranceFileurlRequest, runtime: $Util.RuntimeOptions): Promise<ApplyDigitalLogisticInsuranceFileurlResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyDigitalLogisticInsuranceFileurlResponse>(await this.doRequest("1.0", "digital.logistic.insurance.fileurl.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ApplyDigitalLogisticInsuranceFileurlResponse({}));
  }

  /**
   * Description: 保险服务-平台责任险投保接口。根据运输货物货值生成相应的保费。
  接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
   * Summary: 投保接口-承运人平台责任险
   */
  async applyDigitalLogisticInsurancepolicyUniversal(request: ApplyDigitalLogisticInsurancepolicyUniversalRequest): Promise<ApplyDigitalLogisticInsurancepolicyUniversalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.applyDigitalLogisticInsurancepolicyUniversalEx(request, runtime);
  }

  /**
   * Description: 保险服务-平台责任险投保接口。根据运输货物货值生成相应的保费。
  接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
   * Summary: 投保接口-承运人平台责任险
   */
  async applyDigitalLogisticInsurancepolicyUniversalEx(request: ApplyDigitalLogisticInsurancepolicyUniversalRequest, runtime: $Util.RuntimeOptions): Promise<ApplyDigitalLogisticInsurancepolicyUniversalResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyDigitalLogisticInsurancepolicyUniversalResponse>(await this.doRequest("1.0", "digital.logistic.insurancepolicy.universal.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ApplyDigitalLogisticInsurancepolicyUniversalResponse({}));
  }

  /**
   * Description: 数字物流保险，退保接口
   * Summary: 退保接口-承运人平台责任险
   */
  async cancelDigitalLogisticInsurancepolicyUniversal(request: CancelDigitalLogisticInsurancepolicyUniversalRequest): Promise<CancelDigitalLogisticInsurancepolicyUniversalResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.cancelDigitalLogisticInsurancepolicyUniversalEx(request, runtime);
  }

  /**
   * Description: 数字物流保险，退保接口
   * Summary: 退保接口-承运人平台责任险
   */
  async cancelDigitalLogisticInsurancepolicyUniversalEx(request: CancelDigitalLogisticInsurancepolicyUniversalRequest, runtime: $Util.RuntimeOptions): Promise<CancelDigitalLogisticInsurancepolicyUniversalResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelDigitalLogisticInsurancepolicyUniversalResponse>(await this.doRequest("1.0", "digital.logistic.insurancepolicy.universal.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CancelDigitalLogisticInsurancepolicyUniversalResponse({}));
  }

  /**
   * Description: 利用区块链智能合约进行离线保单存证
   * Summary: 离线保单存证推送
   */
  async pushDigitalLogisticInsuranceOlp(request: PushDigitalLogisticInsuranceOlpRequest): Promise<PushDigitalLogisticInsuranceOlpResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.pushDigitalLogisticInsuranceOlpEx(request, runtime);
  }

  /**
   * Description: 利用区块链智能合约进行离线保单存证
   * Summary: 离线保单存证推送
   */
  async pushDigitalLogisticInsuranceOlpEx(request: PushDigitalLogisticInsuranceOlpRequest, runtime: $Util.RuntimeOptions): Promise<PushDigitalLogisticInsuranceOlpResponse> {
    Util.validateModel(request);
    return $tea.cast<PushDigitalLogisticInsuranceOlpResponse>(await this.doRequest("1.0", "digital.logistic.insurance.olp.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new PushDigitalLogisticInsuranceOlpResponse({}));
  }

  /**
   * Description: 利用区块链智能合约进行离线保单信息更新追踪
   * Summary: 离线保单更新
   */
  async updateDigitalLogisticInsuranceOlp(request: UpdateDigitalLogisticInsuranceOlpRequest): Promise<UpdateDigitalLogisticInsuranceOlpResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateDigitalLogisticInsuranceOlpEx(request, runtime);
  }

  /**
   * Description: 利用区块链智能合约进行离线保单信息更新追踪
   * Summary: 离线保单更新
   */
  async updateDigitalLogisticInsuranceOlpEx(request: UpdateDigitalLogisticInsuranceOlpRequest, runtime: $Util.RuntimeOptions): Promise<UpdateDigitalLogisticInsuranceOlpResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDigitalLogisticInsuranceOlpResponse>(await this.doRequest("1.0", "digital.logistic.insurance.olp.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateDigitalLogisticInsuranceOlpResponse({}));
  }

  /**
   * Description: 池融资委托支付入账查询
   * Summary: 委托支付入账查询
   */
  async queryDigitalLogisticPfPayment(request: QueryDigitalLogisticPfPaymentRequest): Promise<QueryDigitalLogisticPfPaymentResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryDigitalLogisticPfPaymentEx(request, runtime);
  }

  /**
   * Description: 池融资委托支付入账查询
   * Summary: 委托支付入账查询
   */
  async queryDigitalLogisticPfPaymentEx(request: QueryDigitalLogisticPfPaymentRequest, runtime: $Util.RuntimeOptions): Promise<QueryDigitalLogisticPfPaymentResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDigitalLogisticPfPaymentResponse>(await this.doRequest("1.0", "digital.logistic.pf.payment.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryDigitalLogisticPfPaymentResponse({}));
  }

  /**
   * Description: 池融资借据信息查询
   * Summary: 借据信息查询
   */
  async queryDigitalLogisticPfIou(request: QueryDigitalLogisticPfIouRequest): Promise<QueryDigitalLogisticPfIouResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryDigitalLogisticPfIouEx(request, runtime);
  }

  /**
   * Description: 池融资借据信息查询
   * Summary: 借据信息查询
   */
  async queryDigitalLogisticPfIouEx(request: QueryDigitalLogisticPfIouRequest, runtime: $Util.RuntimeOptions): Promise<QueryDigitalLogisticPfIouResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDigitalLogisticPfIouResponse>(await this.doRequest("1.0", "digital.logistic.pf.iou.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryDigitalLogisticPfIouResponse({}));
  }

  /**
   * Description: 池融资授信额度查询
   * Summary: 授信额度查询
   */
  async queryDigitalLogisticPfQuota(request: QueryDigitalLogisticPfQuotaRequest): Promise<QueryDigitalLogisticPfQuotaResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryDigitalLogisticPfQuotaEx(request, runtime);
  }

  /**
   * Description: 池融资授信额度查询
   * Summary: 授信额度查询
   */
  async queryDigitalLogisticPfQuotaEx(request: QueryDigitalLogisticPfQuotaRequest, runtime: $Util.RuntimeOptions): Promise<QueryDigitalLogisticPfQuotaResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDigitalLogisticPfQuotaResponse>(await this.doRequest("1.0", "digital.logistic.pf.quota.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryDigitalLogisticPfQuotaResponse({}));
  }

  /**
   * Description: 基于运单的融资申请
   * Summary: 运单融资申请
   */
  async applyDigitalLogisticPfWaybillfinancing(request: ApplyDigitalLogisticPfWaybillfinancingRequest): Promise<ApplyDigitalLogisticPfWaybillfinancingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.applyDigitalLogisticPfWaybillfinancingEx(request, runtime);
  }

  /**
   * Description: 基于运单的融资申请
   * Summary: 运单融资申请
   */
  async applyDigitalLogisticPfWaybillfinancingEx(request: ApplyDigitalLogisticPfWaybillfinancingRequest, runtime: $Util.RuntimeOptions): Promise<ApplyDigitalLogisticPfWaybillfinancingResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyDigitalLogisticPfWaybillfinancingResponse>(await this.doRequest("1.0", "digital.logistic.pf.waybillfinancing.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new ApplyDigitalLogisticPfWaybillfinancingResponse({}));
  }

  /**
   * Description: 池融资账单质押，用于入池
   * Summary: 池融资账单质押
   */
  async pushDigitalLogisticPfPledge(request: PushDigitalLogisticPfPledgeRequest): Promise<PushDigitalLogisticPfPledgeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.pushDigitalLogisticPfPledgeEx(request, runtime);
  }

  /**
   * Description: 池融资账单质押，用于入池
   * Summary: 池融资账单质押
   */
  async pushDigitalLogisticPfPledgeEx(request: PushDigitalLogisticPfPledgeRequest, runtime: $Util.RuntimeOptions): Promise<PushDigitalLogisticPfPledgeResponse> {
    Util.validateModel(request);
    return $tea.cast<PushDigitalLogisticPfPledgeResponse>(await this.doRequest("1.0", "digital.logistic.pf.pledge.push", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new PushDigitalLogisticPfPledgeResponse({}));
  }

  /**
   * Description: 入池账单质押状态查询
   * Summary: 质押状态查询
   */
  async queryDigitalLogisticPfPledge(request: QueryDigitalLogisticPfPledgeRequest): Promise<QueryDigitalLogisticPfPledgeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryDigitalLogisticPfPledgeEx(request, runtime);
  }

  /**
   * Description: 入池账单质押状态查询
   * Summary: 质押状态查询
   */
  async queryDigitalLogisticPfPledgeEx(request: QueryDigitalLogisticPfPledgeRequest, runtime: $Util.RuntimeOptions): Promise<QueryDigitalLogisticPfPledgeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDigitalLogisticPfPledgeResponse>(await this.doRequest("1.0", "digital.logistic.pf.pledge.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryDigitalLogisticPfPledgeResponse({}));
  }

  /**
   * Description: 池融资融资支用状态查询
   * Summary: 池融资融资支用状态查询
   */
  async queryDigitalLogisticPfFinancing(request: QueryDigitalLogisticPfFinancingRequest): Promise<QueryDigitalLogisticPfFinancingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryDigitalLogisticPfFinancingEx(request, runtime);
  }

  /**
   * Description: 池融资融资支用状态查询
   * Summary: 池融资融资支用状态查询
   */
  async queryDigitalLogisticPfFinancingEx(request: QueryDigitalLogisticPfFinancingRequest, runtime: $Util.RuntimeOptions): Promise<QueryDigitalLogisticPfFinancingResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDigitalLogisticPfFinancingResponse>(await this.doRequest("1.0", "digital.logistic.pf.financing.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryDigitalLogisticPfFinancingResponse({}));
  }

  /**
   * Description: 创建货代did
   * Summary: 创建货代did
   */
  async createDigitalLogisticDidForwarder(request: CreateDigitalLogisticDidForwarderRequest): Promise<CreateDigitalLogisticDidForwarderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createDigitalLogisticDidForwarderEx(request, runtime);
  }

  /**
   * Description: 创建货代did
   * Summary: 创建货代did
   */
  async createDigitalLogisticDidForwarderEx(request: CreateDigitalLogisticDidForwarderRequest, runtime: $Util.RuntimeOptions): Promise<CreateDigitalLogisticDidForwarderResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDigitalLogisticDidForwarderResponse>(await this.doRequest("1.0", "digital.logistic.did.forwarder.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateDigitalLogisticDidForwarderResponse({}));
  }

  /**
   * Description: 创建saas平台did
   * Summary: 创建saas平台did
   */
  async createDigitalLogisticDidSaasplatform(request: CreateDigitalLogisticDidSaasplatformRequest): Promise<CreateDigitalLogisticDidSaasplatformResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createDigitalLogisticDidSaasplatformEx(request, runtime);
  }

  /**
   * Description: 创建saas平台did
   * Summary: 创建saas平台did
   */
  async createDigitalLogisticDidSaasplatformEx(request: CreateDigitalLogisticDidSaasplatformRequest, runtime: $Util.RuntimeOptions): Promise<CreateDigitalLogisticDidSaasplatformResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDigitalLogisticDidSaasplatformResponse>(await this.doRequest("1.0", "digital.logistic.did.saasplatform.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateDigitalLogisticDidSaasplatformResponse({}));
  }

  /**
   * Description: 创建直客did
   * Summary: 创建直客did
   */
  async createDigitalLogisticDidClient(request: CreateDigitalLogisticDidClientRequest): Promise<CreateDigitalLogisticDidClientResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createDigitalLogisticDidClientEx(request, runtime);
  }

  /**
   * Description: 创建直客did
   * Summary: 创建直客did
   */
  async createDigitalLogisticDidClientEx(request: CreateDigitalLogisticDidClientRequest, runtime: $Util.RuntimeOptions): Promise<CreateDigitalLogisticDidClientResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDigitalLogisticDidClientResponse>(await this.doRequest("1.0", "digital.logistic.did.client.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateDigitalLogisticDidClientResponse({}));
  }

  /**
   * Description: 保存订单
   * Summary: 保存订单
   */
  async saveDigitalLogisticBizOrder(request: SaveDigitalLogisticBizOrderRequest): Promise<SaveDigitalLogisticBizOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.saveDigitalLogisticBizOrderEx(request, runtime);
  }

  /**
   * Description: 保存订单
   * Summary: 保存订单
   */
  async saveDigitalLogisticBizOrderEx(request: SaveDigitalLogisticBizOrderRequest, runtime: $Util.RuntimeOptions): Promise<SaveDigitalLogisticBizOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveDigitalLogisticBizOrderResponse>(await this.doRequest("1.0", "digital.logistic.biz.order.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new SaveDigitalLogisticBizOrderResponse({}));
  }

  /**
   * Description: 保存托单文件
   * Summary: 保存托单文件
   */
  async saveDigitalLogisticBizConsignorder(request: SaveDigitalLogisticBizConsignorderRequest): Promise<SaveDigitalLogisticBizConsignorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.saveDigitalLogisticBizConsignorderEx(request, runtime);
  }

  /**
   * Description: 保存托单文件
   * Summary: 保存托单文件
   */
  async saveDigitalLogisticBizConsignorderEx(request: SaveDigitalLogisticBizConsignorderRequest, runtime: $Util.RuntimeOptions): Promise<SaveDigitalLogisticBizConsignorderResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveDigitalLogisticBizConsignorderResponse>(await this.doRequest("1.0", "digital.logistic.biz.consignorder.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new SaveDigitalLogisticBizConsignorderResponse({}));
  }

  /**
   * Description: 保存货物
   * Summary: 保存货物
   */
  async saveDigitalLogisticBizGoods(request: SaveDigitalLogisticBizGoodsRequest): Promise<SaveDigitalLogisticBizGoodsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.saveDigitalLogisticBizGoodsEx(request, runtime);
  }

  /**
   * Description: 保存货物
   * Summary: 保存货物
   */
  async saveDigitalLogisticBizGoodsEx(request: SaveDigitalLogisticBizGoodsRequest, runtime: $Util.RuntimeOptions): Promise<SaveDigitalLogisticBizGoodsResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveDigitalLogisticBizGoodsResponse>(await this.doRequest("1.0", "digital.logistic.biz.goods.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new SaveDigitalLogisticBizGoodsResponse({}));
  }

  /**
   * Description: 保存SO入货通知
   * Summary: 保存SO入货通知
   */
  async saveDigitalLogisticBizSonotify(request: SaveDigitalLogisticBizSonotifyRequest): Promise<SaveDigitalLogisticBizSonotifyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.saveDigitalLogisticBizSonotifyEx(request, runtime);
  }

  /**
   * Description: 保存SO入货通知
   * Summary: 保存SO入货通知
   */
  async saveDigitalLogisticBizSonotifyEx(request: SaveDigitalLogisticBizSonotifyRequest, runtime: $Util.RuntimeOptions): Promise<SaveDigitalLogisticBizSonotifyResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveDigitalLogisticBizSonotifyResponse>(await this.doRequest("1.0", "digital.logistic.biz.sonotify.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new SaveDigitalLogisticBizSonotifyResponse({}));
  }

  /**
   * Description: 保存订舱单
   * Summary: 保存订舱单
   */
  async saveDigitalLogisticBizBookingorder(request: SaveDigitalLogisticBizBookingorderRequest): Promise<SaveDigitalLogisticBizBookingorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.saveDigitalLogisticBizBookingorderEx(request, runtime);
  }

  /**
   * Description: 保存订舱单
   * Summary: 保存订舱单
   */
  async saveDigitalLogisticBizBookingorderEx(request: SaveDigitalLogisticBizBookingorderRequest, runtime: $Util.RuntimeOptions): Promise<SaveDigitalLogisticBizBookingorderResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveDigitalLogisticBizBookingorderResponse>(await this.doRequest("1.0", "digital.logistic.biz.bookingorder.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new SaveDigitalLogisticBizBookingorderResponse({}));
  }

  /**
   * Description: 保存集装箱
   * Summary: 保存集装箱
   */
  async saveDigitalLogisticBizContainer(request: SaveDigitalLogisticBizContainerRequest): Promise<SaveDigitalLogisticBizContainerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.saveDigitalLogisticBizContainerEx(request, runtime);
  }

  /**
   * Description: 保存集装箱
   * Summary: 保存集装箱
   */
  async saveDigitalLogisticBizContainerEx(request: SaveDigitalLogisticBizContainerRequest, runtime: $Util.RuntimeOptions): Promise<SaveDigitalLogisticBizContainerResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveDigitalLogisticBizContainerResponse>(await this.doRequest("1.0", "digital.logistic.biz.container.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new SaveDigitalLogisticBizContainerResponse({}));
  }

  /**
   * Description: 保存报关单
   * Summary: 保存报关单
   */
  async saveDigitalLogisticBizCustomsorder(request: SaveDigitalLogisticBizCustomsorderRequest): Promise<SaveDigitalLogisticBizCustomsorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.saveDigitalLogisticBizCustomsorderEx(request, runtime);
  }

  /**
   * Description: 保存报关单
   * Summary: 保存报关单
   */
  async saveDigitalLogisticBizCustomsorderEx(request: SaveDigitalLogisticBizCustomsorderRequest, runtime: $Util.RuntimeOptions): Promise<SaveDigitalLogisticBizCustomsorderResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveDigitalLogisticBizCustomsorderResponse>(await this.doRequest("1.0", "digital.logistic.biz.customsorder.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new SaveDigitalLogisticBizCustomsorderResponse({}));
  }

  /**
   * Description: 保存拖车单
   * Summary: 保存拖车单
   */
  async saveDigitalLogisticBizVehicle(request: SaveDigitalLogisticBizVehicleRequest): Promise<SaveDigitalLogisticBizVehicleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.saveDigitalLogisticBizVehicleEx(request, runtime);
  }

  /**
   * Description: 保存拖车单
   * Summary: 保存拖车单
   */
  async saveDigitalLogisticBizVehicleEx(request: SaveDigitalLogisticBizVehicleRequest, runtime: $Util.RuntimeOptions): Promise<SaveDigitalLogisticBizVehicleResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveDigitalLogisticBizVehicleResponse>(await this.doRequest("1.0", "digital.logistic.biz.vehicle.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new SaveDigitalLogisticBizVehicleResponse({}));
  }

  /**
   * Description: 保存master提单
   * Summary: 保存master提单
   */
  async saveDigitalLogisticBizMasterbl(request: SaveDigitalLogisticBizMasterblRequest): Promise<SaveDigitalLogisticBizMasterblResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.saveDigitalLogisticBizMasterblEx(request, runtime);
  }

  /**
   * Description: 保存master提单
   * Summary: 保存master提单
   */
  async saveDigitalLogisticBizMasterblEx(request: SaveDigitalLogisticBizMasterblRequest, runtime: $Util.RuntimeOptions): Promise<SaveDigitalLogisticBizMasterblResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveDigitalLogisticBizMasterblResponse>(await this.doRequest("1.0", "digital.logistic.biz.masterbl.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new SaveDigitalLogisticBizMasterblResponse({}));
  }

  /**
   * Description: 内审完成
   * Summary: 内审完成
   */
  async finishDigitalLogisticBizAudit(request: FinishDigitalLogisticBizAuditRequest): Promise<FinishDigitalLogisticBizAuditResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.finishDigitalLogisticBizAuditEx(request, runtime);
  }

  /**
   * Description: 内审完成
   * Summary: 内审完成
   */
  async finishDigitalLogisticBizAuditEx(request: FinishDigitalLogisticBizAuditRequest, runtime: $Util.RuntimeOptions): Promise<FinishDigitalLogisticBizAuditResponse> {
    Util.validateModel(request);
    return $tea.cast<FinishDigitalLogisticBizAuditResponse>(await this.doRequest("1.0", "digital.logistic.biz.audit.finish", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new FinishDigitalLogisticBizAuditResponse({}));
  }

  /**
   * Description: 保存house提单
   * Summary: 保存house提单
   */
  async saveDigitalLogisticBizHousebl(request: SaveDigitalLogisticBizHouseblRequest): Promise<SaveDigitalLogisticBizHouseblResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.saveDigitalLogisticBizHouseblEx(request, runtime);
  }

  /**
   * Description: 保存house提单
   * Summary: 保存house提单
   */
  async saveDigitalLogisticBizHouseblEx(request: SaveDigitalLogisticBizHouseblRequest, runtime: $Util.RuntimeOptions): Promise<SaveDigitalLogisticBizHouseblResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveDigitalLogisticBizHouseblResponse>(await this.doRequest("1.0", "digital.logistic.biz.housebl.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new SaveDigitalLogisticBizHouseblResponse({}));
  }

  /**
   * Description: 创建应付账单
   * Summary: 创建应付账单(已下)
   */
  async createDigitalLogisticBillPaybillorder(request: CreateDigitalLogisticBillPaybillorderRequest): Promise<CreateDigitalLogisticBillPaybillorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createDigitalLogisticBillPaybillorderEx(request, runtime);
  }

  /**
   * Description: 创建应付账单
   * Summary: 创建应付账单(已下)
   */
  async createDigitalLogisticBillPaybillorderEx(request: CreateDigitalLogisticBillPaybillorderRequest, runtime: $Util.RuntimeOptions): Promise<CreateDigitalLogisticBillPaybillorderResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDigitalLogisticBillPaybillorderResponse>(await this.doRequest("1.0", "digital.logistic.bill.paybillorder.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateDigitalLogisticBillPaybillorderResponse({}));
  }

  /**
   * Description: 创建应收账单
   * Summary: 创建应收账单(已下)
   */
  async createDigitalLogisticBillReceiptbillorder(request: CreateDigitalLogisticBillReceiptbillorderRequest): Promise<CreateDigitalLogisticBillReceiptbillorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createDigitalLogisticBillReceiptbillorderEx(request, runtime);
  }

  /**
   * Description: 创建应收账单
   * Summary: 创建应收账单(已下)
   */
  async createDigitalLogisticBillReceiptbillorderEx(request: CreateDigitalLogisticBillReceiptbillorderRequest, runtime: $Util.RuntimeOptions): Promise<CreateDigitalLogisticBillReceiptbillorderResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDigitalLogisticBillReceiptbillorderResponse>(await this.doRequest("1.0", "digital.logistic.bill.receiptbillorder.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateDigitalLogisticBillReceiptbillorderResponse({}));
  }

  /**
   * Description: 保存应付资费项
   * Summary: 保存应付资费项
   */
  async saveDigitalLogisticBillPaybilltariff(request: SaveDigitalLogisticBillPaybilltariffRequest): Promise<SaveDigitalLogisticBillPaybilltariffResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.saveDigitalLogisticBillPaybilltariffEx(request, runtime);
  }

  /**
   * Description: 保存应付资费项
   * Summary: 保存应付资费项
   */
  async saveDigitalLogisticBillPaybilltariffEx(request: SaveDigitalLogisticBillPaybilltariffRequest, runtime: $Util.RuntimeOptions): Promise<SaveDigitalLogisticBillPaybilltariffResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveDigitalLogisticBillPaybilltariffResponse>(await this.doRequest("1.0", "digital.logistic.bill.paybilltariff.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new SaveDigitalLogisticBillPaybilltariffResponse({}));
  }

  /**
   * Description: 保存应收资费项
   * Summary: 保存应收资费项
   */
  async saveDigitalLogisticBillReceiptbilltariff(request: SaveDigitalLogisticBillReceiptbilltariffRequest): Promise<SaveDigitalLogisticBillReceiptbilltariffResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.saveDigitalLogisticBillReceiptbilltariffEx(request, runtime);
  }

  /**
   * Description: 保存应收资费项
   * Summary: 保存应收资费项
   */
  async saveDigitalLogisticBillReceiptbilltariffEx(request: SaveDigitalLogisticBillReceiptbilltariffRequest, runtime: $Util.RuntimeOptions): Promise<SaveDigitalLogisticBillReceiptbilltariffResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveDigitalLogisticBillReceiptbilltariffResponse>(await this.doRequest("1.0", "digital.logistic.bill.receiptbilltariff.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new SaveDigitalLogisticBillReceiptbilltariffResponse({}));
  }

  /**
   * Description: 核销应付资费项
   * Summary: 核销应付资费项
   */
  async verifyDigitalLogisticBillPaybill(request: VerifyDigitalLogisticBillPaybillRequest): Promise<VerifyDigitalLogisticBillPaybillResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.verifyDigitalLogisticBillPaybillEx(request, runtime);
  }

  /**
   * Description: 核销应付资费项
   * Summary: 核销应付资费项
   */
  async verifyDigitalLogisticBillPaybillEx(request: VerifyDigitalLogisticBillPaybillRequest, runtime: $Util.RuntimeOptions): Promise<VerifyDigitalLogisticBillPaybillResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyDigitalLogisticBillPaybillResponse>(await this.doRequest("1.0", "digital.logistic.bill.paybill.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new VerifyDigitalLogisticBillPaybillResponse({}));
  }

  /**
   * Description: 核销应收资费项
   * Summary: 核销应收资费项
   */
  async verifyDigitalLogisticBillReceiptbillorder(request: VerifyDigitalLogisticBillReceiptbillorderRequest): Promise<VerifyDigitalLogisticBillReceiptbillorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.verifyDigitalLogisticBillReceiptbillorderEx(request, runtime);
  }

  /**
   * Description: 核销应收资费项
   * Summary: 核销应收资费项
   */
  async verifyDigitalLogisticBillReceiptbillorderEx(request: VerifyDigitalLogisticBillReceiptbillorderRequest, runtime: $Util.RuntimeOptions): Promise<VerifyDigitalLogisticBillReceiptbillorderResponse> {
    Util.validateModel(request);
    return $tea.cast<VerifyDigitalLogisticBillReceiptbillorderResponse>(await this.doRequest("1.0", "digital.logistic.bill.receiptbillorder.verify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new VerifyDigitalLogisticBillReceiptbillorderResponse({}));
  }

  /**
   * Description: 更新应付账单
   * Summary: 更新应付账单
   */
  async updateDigitalLogisticBillPaybillorder(request: UpdateDigitalLogisticBillPaybillorderRequest): Promise<UpdateDigitalLogisticBillPaybillorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateDigitalLogisticBillPaybillorderEx(request, runtime);
  }

  /**
   * Description: 更新应付账单
   * Summary: 更新应付账单
   */
  async updateDigitalLogisticBillPaybillorderEx(request: UpdateDigitalLogisticBillPaybillorderRequest, runtime: $Util.RuntimeOptions): Promise<UpdateDigitalLogisticBillPaybillorderResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDigitalLogisticBillPaybillorderResponse>(await this.doRequest("1.0", "digital.logistic.bill.paybillorder.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateDigitalLogisticBillPaybillorderResponse({}));
  }

  /**
   * Description: 更新应收账单
   * Summary: 更新应收账单
   */
  async updateDigitalLogisticBillReceiptbillorder(request: UpdateDigitalLogisticBillReceiptbillorderRequest): Promise<UpdateDigitalLogisticBillReceiptbillorderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateDigitalLogisticBillReceiptbillorderEx(request, runtime);
  }

  /**
   * Description: 更新应收账单
   * Summary: 更新应收账单
   */
  async updateDigitalLogisticBillReceiptbillorderEx(request: UpdateDigitalLogisticBillReceiptbillorderRequest, runtime: $Util.RuntimeOptions): Promise<UpdateDigitalLogisticBillReceiptbillorderResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDigitalLogisticBillReceiptbillorderResponse>(await this.doRequest("1.0", "digital.logistic.bill.receiptbillorder.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateDigitalLogisticBillReceiptbillorderResponse({}));
  }

  /**
   * Description: 保存应付发票
   * Summary: 保存应付发票
   */
  async saveDigitalLogisticBillPayinvoice(request: SaveDigitalLogisticBillPayinvoiceRequest): Promise<SaveDigitalLogisticBillPayinvoiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.saveDigitalLogisticBillPayinvoiceEx(request, runtime);
  }

  /**
   * Description: 保存应付发票
   * Summary: 保存应付发票
   */
  async saveDigitalLogisticBillPayinvoiceEx(request: SaveDigitalLogisticBillPayinvoiceRequest, runtime: $Util.RuntimeOptions): Promise<SaveDigitalLogisticBillPayinvoiceResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveDigitalLogisticBillPayinvoiceResponse>(await this.doRequest("1.0", "digital.logistic.bill.payinvoice.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new SaveDigitalLogisticBillPayinvoiceResponse({}));
  }

  /**
   * Description: 保存应收发票
   * Summary: 保存应收发票
   */
  async saveDigitalLogisticBillReceiptinvoice(request: SaveDigitalLogisticBillReceiptinvoiceRequest): Promise<SaveDigitalLogisticBillReceiptinvoiceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.saveDigitalLogisticBillReceiptinvoiceEx(request, runtime);
  }

  /**
   * Description: 保存应收发票
   * Summary: 保存应收发票
   */
  async saveDigitalLogisticBillReceiptinvoiceEx(request: SaveDigitalLogisticBillReceiptinvoiceRequest, runtime: $Util.RuntimeOptions): Promise<SaveDigitalLogisticBillReceiptinvoiceResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveDigitalLogisticBillReceiptinvoiceResponse>(await this.doRequest("1.0", "digital.logistic.bill.receiptinvoice.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new SaveDigitalLogisticBillReceiptinvoiceResponse({}));
  }

  /**
   * Description: 上传历史数据
   * Summary: 上传历史数据
   */
  async uploadDigitalLogisticBizFinancing(request: UploadDigitalLogisticBizFinancingRequest): Promise<UploadDigitalLogisticBizFinancingResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.uploadDigitalLogisticBizFinancingEx(request, runtime);
  }

  /**
   * Description: 上传历史数据
   * Summary: 上传历史数据
   */
  async uploadDigitalLogisticBizFinancingEx(request: UploadDigitalLogisticBizFinancingRequest, runtime: $Util.RuntimeOptions): Promise<UploadDigitalLogisticBizFinancingResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadDigitalLogisticBizFinancingResponse>(await this.doRequest("1.0", "digital.logistic.biz.financing.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UploadDigitalLogisticBizFinancingResponse({}));
  }

  /**
   * Description: 上传订单
   * Summary: 上传订单
   */
  async uploadDigitalLogisticBizOrder(request: UploadDigitalLogisticBizOrderRequest): Promise<UploadDigitalLogisticBizOrderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.uploadDigitalLogisticBizOrderEx(request, runtime);
  }

  /**
   * Description: 上传订单
   * Summary: 上传订单
   */
  async uploadDigitalLogisticBizOrderEx(request: UploadDigitalLogisticBizOrderRequest, runtime: $Util.RuntimeOptions): Promise<UploadDigitalLogisticBizOrderResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadDigitalLogisticBizOrderResponse>(await this.doRequest("1.0", "digital.logistic.biz.order.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UploadDigitalLogisticBizOrderResponse({}));
  }

  /**
   * Description: 创建船公司did账户
   * Summary: 创建船公司did账户
   */
  async createDigitalLogisticDidCarrier(request: CreateDigitalLogisticDidCarrierRequest): Promise<CreateDigitalLogisticDidCarrierResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.createDigitalLogisticDidCarrierEx(request, runtime);
  }

  /**
   * Description: 创建船公司did账户
   * Summary: 创建船公司did账户
   */
  async createDigitalLogisticDidCarrierEx(request: CreateDigitalLogisticDidCarrierRequest, runtime: $Util.RuntimeOptions): Promise<CreateDigitalLogisticDidCarrierResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateDigitalLogisticDidCarrierResponse>(await this.doRequest("1.0", "digital.logistic.did.carrier.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new CreateDigitalLogisticDidCarrierResponse({}));
  }

  /**
   * Description:  货代授权
   * Summary:  货代授权
   */
  async authDigitalLogisticSysForwarder(request: AuthDigitalLogisticSysForwarderRequest): Promise<AuthDigitalLogisticSysForwarderResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.authDigitalLogisticSysForwarderEx(request, runtime);
  }

  /**
   * Description:  货代授权
   * Summary:  货代授权
   */
  async authDigitalLogisticSysForwarderEx(request: AuthDigitalLogisticSysForwarderRequest, runtime: $Util.RuntimeOptions): Promise<AuthDigitalLogisticSysForwarderResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthDigitalLogisticSysForwarderResponse>(await this.doRequest("1.0", "digital.logistic.sys.forwarder.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new AuthDigitalLogisticSysForwarderResponse({}));
  }

  /**
   * Description: master提单信息查询
   * Summary: master提单信息查询
   */
  async queryDigitalLogisticBizMasterbl(request: QueryDigitalLogisticBizMasterblRequest): Promise<QueryDigitalLogisticBizMasterblResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.queryDigitalLogisticBizMasterblEx(request, runtime);
  }

  /**
   * Description: master提单信息查询
   * Summary: master提单信息查询
   */
  async queryDigitalLogisticBizMasterblEx(request: QueryDigitalLogisticBizMasterblRequest, runtime: $Util.RuntimeOptions): Promise<QueryDigitalLogisticBizMasterblResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryDigitalLogisticBizMasterblResponse>(await this.doRequest("1.0", "digital.logistic.biz.masterbl.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new QueryDigitalLogisticBizMasterblResponse({}));
  }

  /**
   * Description: 应付发票文件上传接口
   * Summary: 应付发票文件上传接口
   */
  async saveDigitalLogisticBizPayinvoicefile(request: SaveDigitalLogisticBizPayinvoicefileRequest): Promise<SaveDigitalLogisticBizPayinvoicefileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.saveDigitalLogisticBizPayinvoicefileEx(request, runtime);
  }

  /**
   * Description: 应付发票文件上传接口
   * Summary: 应付发票文件上传接口
   */
  async saveDigitalLogisticBizPayinvoicefileEx(request: SaveDigitalLogisticBizPayinvoicefileRequest, runtime: $Util.RuntimeOptions): Promise<SaveDigitalLogisticBizPayinvoicefileResponse> {
    Util.validateModel(request);
    return $tea.cast<SaveDigitalLogisticBizPayinvoicefileResponse>(await this.doRequest("1.0", "digital.logistic.biz.payinvoicefile.save", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new SaveDigitalLogisticBizPayinvoicefileResponse({}));
  }

  /**
   * Description: 上传电子提单
   * Summary: 上传电子提单
   */
  async uploadDigitalLogisticShippingEbl(request: UploadDigitalLogisticShippingEblRequest): Promise<UploadDigitalLogisticShippingEblResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.uploadDigitalLogisticShippingEblEx(request, runtime);
  }

  /**
   * Description: 上传电子提单
   * Summary: 上传电子提单
   */
  async uploadDigitalLogisticShippingEblEx(request: UploadDigitalLogisticShippingEblRequest, runtime: $Util.RuntimeOptions): Promise<UploadDigitalLogisticShippingEblResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadDigitalLogisticShippingEblResponse>(await this.doRequest("1.0", "digital.logistic.shipping.ebl.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UploadDigitalLogisticShippingEblResponse({}));
  }

  /**
   * Description: 电子提单批次上传，一个I批次下传递多个提单
   * Summary: 电子提单批次上传
   */
  async uploadDigitalLogisticShippingEblbatch(request: UploadDigitalLogisticShippingEblbatchRequest): Promise<UploadDigitalLogisticShippingEblbatchResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.uploadDigitalLogisticShippingEblbatchEx(request, runtime);
  }

  /**
   * Description: 电子提单批次上传，一个I批次下传递多个提单
   * Summary: 电子提单批次上传
   */
  async uploadDigitalLogisticShippingEblbatchEx(request: UploadDigitalLogisticShippingEblbatchRequest, runtime: $Util.RuntimeOptions): Promise<UploadDigitalLogisticShippingEblbatchResponse> {
    Util.validateModel(request);
    return $tea.cast<UploadDigitalLogisticShippingEblbatchResponse>(await this.doRequest("1.0", "digital.logistic.shipping.eblbatch.upload", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UploadDigitalLogisticShippingEblbatchResponse({}));
  }

  /**
   * Description: 感知收货人提单状态的变更
   * Summary: 电子提单批次状态变更
   */
  async updateDigitalLogisticShippingEblbatchstatus(request: UpdateDigitalLogisticShippingEblbatchstatusRequest): Promise<UpdateDigitalLogisticShippingEblbatchstatusResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    return await this.updateDigitalLogisticShippingEblbatchstatusEx(request, runtime);
  }

  /**
   * Description: 感知收货人提单状态的变更
   * Summary: 电子提单批次状态变更
   */
  async updateDigitalLogisticShippingEblbatchstatusEx(request: UpdateDigitalLogisticShippingEblbatchstatusRequest, runtime: $Util.RuntimeOptions): Promise<UpdateDigitalLogisticShippingEblbatchstatusResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDigitalLogisticShippingEblbatchstatusResponse>(await this.doRequest("1.0", "digital.logistic.shipping.eblbatchstatus.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), runtime), new UpdateDigitalLogisticShippingEblbatchstatusResponse({}));
  }

}
