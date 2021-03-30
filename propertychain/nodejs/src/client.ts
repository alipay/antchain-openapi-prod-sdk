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

// 无分组设备
export class DeviceInfoNoGroup extends $tea.Model {
  // 物模型Id
  aliyunModelId?: string;
  // 三元组
  deviceMeta?: string;
  // 设备拥有者Id
  deviceOwnerId?: string;
  // 设备安装信息
  deviceSetupInfo?: string;
  // 设备类型【ALIDEV：阿里云设备，CHAINMACDEV：链机设备，M2MDEV：M2M设备，OTHERDEV：其他设备】
  // 
  deviceType?: string;
  // 设备使用者Id
  deviceUserIdList?: string[];
  // 设备虚拟id
  deviceVirtualId?: string;
  // 智能版本
  smartVersion?: string;
  // 设备状态 【READY：未启用，STARTED：已启用，LOADING：信息待完善，DELETED：已注销， ALL：全部】
  status?: string;
  // 库位Id
  stockPositionIdList?: string[];
  // 库位名称
  stockPositionNameList?: string[];
  // 设备id
  thingsDid?: string;
  // 设备名称
  thingsName?: string;
  // 视频流地址
  videoUrl?: string;
  // 仓库Id
  warehouseId?: string;
  // 仓库名称
  warehouseName?: string;
  static names(): { [key: string]: string } {
    return {
      aliyunModelId: 'aliyun_model_id',
      deviceMeta: 'device_meta',
      deviceOwnerId: 'device_owner_id',
      deviceSetupInfo: 'device_setup_info',
      deviceType: 'device_type',
      deviceUserIdList: 'device_user_id_list',
      deviceVirtualId: 'device_virtual_id',
      smartVersion: 'smart_version',
      status: 'status',
      stockPositionIdList: 'stock_position_id_list',
      stockPositionNameList: 'stock_position_name_list',
      thingsDid: 'things_did',
      thingsName: 'things_name',
      videoUrl: 'video_url',
      warehouseId: 'warehouse_id',
      warehouseName: 'warehouse_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      aliyunModelId: 'string',
      deviceMeta: 'string',
      deviceOwnerId: 'string',
      deviceSetupInfo: 'string',
      deviceType: 'string',
      deviceUserIdList: { 'type': 'array', 'itemType': 'string' },
      deviceVirtualId: 'string',
      smartVersion: 'string',
      status: 'string',
      stockPositionIdList: { 'type': 'array', 'itemType': 'string' },
      stockPositionNameList: { 'type': 'array', 'itemType': 'string' },
      thingsDid: 'string',
      thingsName: 'string',
      videoUrl: 'string',
      warehouseId: 'string',
      warehouseName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 船运箱子详情结构体
export class CargoTank extends $tea.Model {
  // 箱号
  boxNo: string;
  // 铅封号	
  // 
  leadSealingNo: string;
  // 箱型	
  boxType: string;
  // 重量	
  boxWeight: string;
  static names(): { [key: string]: string } {
    return {
      boxNo: 'box_no',
      leadSealingNo: 'lead_sealing_no',
      boxType: 'box_type',
      boxWeight: 'box_weight',
    };
  }

  static types(): { [key: string]: any } {
    return {
      boxNo: 'string',
      leadSealingNo: 'string',
      boxType: 'string',
      boxWeight: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 操作信息
export class FlowNode extends $tea.Model {
  // 序号
  index?: number;
  // 操作类型【CREATE：创建入库申请，AUDIT：保管人审核，ALLOCATE：审核拒绝，STORAGE：入库，COMPLETE：完成】
  //  
  //    
  //     
  type?: string;
  // 流程节点状态【 PASS：成功，FAIL：失败，ACTIVE：激活，INACTIVE：未激活】
  state?: string;
  // 操作时间，单位：ms
  operateTime?: number;
  // 备注
  comment?: string;
  static names(): { [key: string]: string } {
    return {
      index: 'index',
      type: 'type',
      state: 'state',
      operateTime: 'operate_time',
      comment: 'comment',
    };
  }

  static types(): { [key: string]: any } {
    return {
      index: 'number',
      type: 'string',
      state: 'string',
      operateTime: 'number',
      comment: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 区块链信息
export class BlockchainInfo extends $tea.Model {
  // hash值
  txHash?: string;
  // 时间戳
  txTime?: number;
  static names(): { [key: string]: string } {
    return {
      txHash: 'tx_hash',
      txTime: 'tx_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      txHash: 'string',
      txTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 流程信息
export class FlowInfo extends $tea.Model {
  // 备注
  comment?: string;
  // 操作时间
  operateTime?: string;
  // 操作人
  operator?: string;
  // 操作状态【NONE,WAITING,AGREED,REJECTED,CANCELED,ALL】
  status?: string;
  static names(): { [key: string]: string } {
    return {
      comment: 'comment',
      operateTime: 'operate_time',
      operator: 'operator',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      comment: 'string',
      operateTime: 'string',
      operator: 'string',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 字典信息
export class TemplateDataConverter extends $tea.Model {
  // 货物品类
  commodityCategory: string;
  // 仓单的生成时间
  createTime?: number;
  // 仓储方名称或ID，提交的时候使用ID，展示使用名称
  custodianCorp?: string;
  // 存货人名称或ID，提交的时候使用ID，展示使用名称
  customerCorp?: string;
  // 其他字典定制信息
  customData?: string;
  // 是否补仓
  isSupplement: boolean;
  // 联盟ID
  leagueId: string;
  // 联盟名称
  leagueName: string;
  // 资金方名称或ID，提交的时候使用ID，展示使用名称
  lenderCorp?: string;
  // 仓位ID列表
  position?: string[];
  // 预分配仓位ID列表
  prePosition?: string[];
  // 预分配仓库名称或ID，提交的时候使用ID，展示使用名称
  preWarehouseName?: string;
  // 数量
  quantity: number;
  // 数量单位
  quantityUnit: string;
  // 物权方
  realRightName?: string;
  // 仓单状态
  state?: string;
  // 补仓仓单ID
  supplementWarehouseReceiptId?: string;
  // 仓单更新时间
  updateTime?: number;
  // 仓库名称或ID，提交的时候使用ID，展示使用名称
  warehouseName?: string;
  // 仓单ID
  warehouseReceiptId?: string;
  // 重量
  weight: string;
  // 重量单位
  weightUnit: string;
  static names(): { [key: string]: string } {
    return {
      commodityCategory: 'commodity_category',
      createTime: 'create_time',
      custodianCorp: 'custodian_corp',
      customerCorp: 'customer_corp',
      customData: 'custom_data',
      isSupplement: 'is_supplement',
      leagueId: 'league_id',
      leagueName: 'league_name',
      lenderCorp: 'lender_corp',
      position: 'position',
      prePosition: 'pre_position',
      preWarehouseName: 'pre_warehouse_name',
      quantity: 'quantity',
      quantityUnit: 'quantity_unit',
      realRightName: 'real_right_name',
      state: 'state',
      supplementWarehouseReceiptId: 'supplement_warehouse_receipt_id',
      updateTime: 'update_time',
      warehouseName: 'warehouse_name',
      warehouseReceiptId: 'warehouse_receipt_id',
      weight: 'weight',
      weightUnit: 'weight_unit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      commodityCategory: 'string',
      createTime: 'number',
      custodianCorp: 'string',
      customerCorp: 'string',
      customData: 'string',
      isSupplement: 'boolean',
      leagueId: 'string',
      leagueName: 'string',
      lenderCorp: 'string',
      position: { 'type': 'array', 'itemType': 'string' },
      prePosition: { 'type': 'array', 'itemType': 'string' },
      preWarehouseName: 'string',
      quantity: 'number',
      quantityUnit: 'string',
      realRightName: 'string',
      state: 'string',
      supplementWarehouseReceiptId: 'string',
      updateTime: 'number',
      warehouseName: 'string',
      warehouseReceiptId: 'string',
      weight: 'string',
      weightUnit: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 联盟信息
export class LeagueInfo extends $tea.Model {
  // 时间
  createTime?: number;
  // 联盟id
  leagueId?: string;
  // 联盟名称
  leagueName?: string;
  // 联盟描述
  leagueDesc?: string;
  // 联盟对应的物权平台产品
  productVersion?: string;
  static names(): { [key: string]: string } {
    return {
      createTime: 'create_time',
      leagueId: 'league_id',
      leagueName: 'league_name',
      leagueDesc: 'league_desc',
      productVersion: 'product_version',
    };
  }

  static types(): { [key: string]: any } {
    return {
      createTime: 'number',
      leagueId: 'string',
      leagueName: 'string',
      leagueDesc: 'string',
      productVersion: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 设备组
export class DeviceGroup extends $tea.Model {
  // 设备组id
  groupId?: string;
  // 设备组名称
  groupName?: string;
  // 设备id
  thingsDidList?: string[];
  // 设备其他信息
  thingsInfoList?: DeviceInfoNoGroup[];
  static names(): { [key: string]: string } {
    return {
      groupId: 'group_id',
      groupName: 'group_name',
      thingsDidList: 'things_did_list',
      thingsInfoList: 'things_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      groupId: 'string',
      groupName: 'string',
      thingsDidList: { 'type': 'array', 'itemType': 'string' },
      thingsInfoList: { 'type': 'array', 'itemType': DeviceInfoNoGroup },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 物证信息
export class EvidenceInfo extends $tea.Model {
  // 自定义序列
  bizId: number;
  // 资产id
  assetId?: string;
  // 请求信息
  message?: string;
  // 创建是否成功
  success: boolean;
  // 短码
  qrCode?: string;
  static names(): { [key: string]: string } {
    return {
      bizId: 'biz_id',
      assetId: 'asset_id',
      message: 'message',
      success: 'success',
      qrCode: 'qr_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      bizId: 'number',
      assetId: 'string',
      message: 'string',
      success: 'boolean',
      qrCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 融资利率结构体
export class FinancialRateInfo extends $tea.Model {
  // 融资利率
  rate: string;
  // 起始-天
  startDay: number;
  // 终止-天
  endDay: number;
  static names(): { [key: string]: string } {
    return {
      rate: 'rate',
      startDay: 'start_day',
      endDay: 'end_day',
    };
  }

  static types(): { [key: string]: any } {
    return {
      rate: 'string',
      startDay: 'number',
      endDay: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 仓库信息
export class WarehouseInfo extends $tea.Model {
  // 地址
  address: string;
  // 平面图
  blueprintUrl: string;
  // 所在国家
  country: string;
  // 设备数量
  deviceNum: number;
  // 其他信息
  extraInfo?: string;
  // 纬度
  latitude: string;
  // 经度
  longitude: string;
  // 智能版本
  smartLevel: string;
  // 仓库状态
  status: string;
  // 仓位数量
  stockPositionNum: number;
  // 版本信息
  version: string;
  // 仓库面积
  warehouseArea: string;
  // 仓库高度
  warehouseHeight: string;
  // 仓库Id
  warehouseId: string;
  // 仓库名称
  warehouseName: string;
  static names(): { [key: string]: string } {
    return {
      address: 'address',
      blueprintUrl: 'blueprint_url',
      country: 'country',
      deviceNum: 'device_num',
      extraInfo: 'extra_info',
      latitude: 'latitude',
      longitude: 'longitude',
      smartLevel: 'smart_level',
      status: 'status',
      stockPositionNum: 'stock_position_num',
      version: 'version',
      warehouseArea: 'warehouse_area',
      warehouseHeight: 'warehouse_height',
      warehouseId: 'warehouse_id',
      warehouseName: 'warehouse_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      address: 'string',
      blueprintUrl: 'string',
      country: 'string',
      deviceNum: 'number',
      extraInfo: 'string',
      latitude: 'string',
      longitude: 'string',
      smartLevel: 'string',
      status: 'string',
      stockPositionNum: 'number',
      version: 'string',
      warehouseArea: 'string',
      warehouseHeight: 'string',
      warehouseId: 'string',
      warehouseName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 角色
export class Role extends $tea.Model {
  // 企业名称
  firmName?: string;
  // 蚂蚁金融科技租户ID
  openTenant?: string;
  // 角色类型【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
  roleType?: string;
  static names(): { [key: string]: string } {
    return {
      firmName: 'firm_name',
      openTenant: 'open_tenant',
      roleType: 'role_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      firmName: 'string',
      openTenant: 'string',
      roleType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 物流运单信息详情结构体
export class OrderInfo extends $tea.Model {
  // 运单号
  orderNo: string;
  // 船名
  shipName: string;
  // 航次
  voyageNo: string;
  // 起始地
  originalPlace: string;
  // 目的地
  destPlace: string;
  // 离港时间
  leaveDate: string;
  // 预计到港时间
  estArriDate?: string;
  // 实际到港时间
  actualArriDate?: string;
  // 运单重量
  waybillWeight: string;
  // 船运箱子详情列表
  cargoTankList: CargoTank[];
  // 委托人信息
  grantorInfo: string[];
  // 收货人信息
  consigneeInfo: string[];
  // 运单附件
  attachment: string;
  // 物流状态:
  // 1-->已离开港口;
  // 2-->已到达港口;
  logisticsStatus: number;
  static names(): { [key: string]: string } {
    return {
      orderNo: 'order_no',
      shipName: 'ship_name',
      voyageNo: 'voyage_no',
      originalPlace: 'original_place',
      destPlace: 'dest_place',
      leaveDate: 'leave_date',
      estArriDate: 'est_arri_date',
      actualArriDate: 'actual_arri_date',
      waybillWeight: 'waybill_weight',
      cargoTankList: 'cargo_tank_list',
      grantorInfo: 'grantor_info',
      consigneeInfo: 'consignee_info',
      attachment: 'attachment',
      logisticsStatus: 'logistics_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      orderNo: 'string',
      shipName: 'string',
      voyageNo: 'string',
      originalPlace: 'string',
      destPlace: 'string',
      leaveDate: 'string',
      estArriDate: 'string',
      actualArriDate: 'string',
      waybillWeight: 'string',
      cargoTankList: { 'type': 'array', 'itemType': CargoTank },
      grantorInfo: { 'type': 'array', 'itemType': 'string' },
      consigneeInfo: { 'type': 'array', 'itemType': 'string' },
      attachment: 'string',
      logisticsStatus: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户明细清单
export class UserDetail extends $tea.Model {
  // 融资编号
  financingNo: string;
  // 分润金额，乘过分润比例，到记账日的累计值
  dividedAmount: number;
  // 分润比例，保留两位小数
  dividedRate: string;
  // 罚息金额
  penaltyAmount: number;
  // 角色编码
  roleCode: string;
  // 记账日期 yyyy-mm-dd
  accountDate: string;
  // 当日还款金额
  payment: number;
  // 其他利润(操作费还款日时写到各方记录)
  otherProfit: number;
  static names(): { [key: string]: string } {
    return {
      financingNo: 'financing_no',
      dividedAmount: 'divided_amount',
      dividedRate: 'divided_rate',
      penaltyAmount: 'penalty_amount',
      roleCode: 'role_code',
      accountDate: 'account_date',
      payment: 'payment',
      otherProfit: 'other_profit',
    };
  }

  static types(): { [key: string]: any } {
    return {
      financingNo: 'string',
      dividedAmount: 'number',
      dividedRate: 'string',
      penaltyAmount: 'number',
      roleCode: 'string',
      accountDate: 'string',
      payment: 'number',
      otherProfit: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 物权信息
export class AssetInfo extends $tea.Model {
  // 资产Id
  assetId?: string;
  // 数据字典Id
  templateId?: string;
  // 资产内容
  content?: string;
  // 链信息
  blockchainInfo?: BlockchainInfo;
  // 短码
  qrCode?: string;
  static names(): { [key: string]: string } {
    return {
      assetId: 'asset_id',
      templateId: 'template_id',
      content: 'content',
      blockchainInfo: 'blockchain_info',
      qrCode: 'qr_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      assetId: 'string',
      templateId: 'string',
      content: 'string',
      blockchainInfo: BlockchainInfo,
      qrCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 错误信息提示
export class ErrorMessage extends $tea.Model {
  // 错误码
  errorCode?: string;
  // 错误信息描述
  errorMsg?: string;
  static names(): { [key: string]: string } {
    return {
      errorCode: 'error_code',
      errorMsg: 'error_msg',
    };
  }

  static types(): { [key: string]: any } {
    return {
      errorCode: 'string',
      errorMsg: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 角色对应分润比例
export class RoleRatio extends $tea.Model {
  // 角色编号
  // 角色编号类型
  // 风险承担方：RISK_TAKER
  // 货物监管方：CARGO_SUPERVISION
  // 资金推荐方：CAPITAL_RECOMMEND
  // 融资推荐方：FUNDER_RECOMMEND
  // 运营管理方：MANAGEMENT
  // 技术支持方：TECHNICAL
  roleCode: string;
  // 分润比例，保留两位小数的百分比
  ratio: string;
  static names(): { [key: string]: string } {
    return {
      roleCode: 'role_code',
      ratio: 'ratio',
    };
  }

  static types(): { [key: string]: any } {
    return {
      roleCode: 'string',
      ratio: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户对账单
export class UserStatement extends $tea.Model {
  // 融资编号
  financingNo: string;
  // 产品编号，有的话返回
  productNo: string;
  // 融资金额
  financialAmount: number;
  // 分润比例，保留两位小数的百分比
  profitRate: string;
  // 总分润金额，乘过分润比例
  totalAmount: number;
  // 角色名称，按上述角色名称约定
  roleCode: string;
  // 角色对应的企业
  companyNo: string;
  // 记账日期 yyyy-MM-dd
  accountDate: string;
  static names(): { [key: string]: string } {
    return {
      financingNo: 'financing_no',
      productNo: 'product_no',
      financialAmount: 'financial_amount',
      profitRate: 'profit_rate',
      totalAmount: 'total_amount',
      roleCode: 'role_code',
      companyNo: 'company_no',
      accountDate: 'account_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      financingNo: 'string',
      productNo: 'string',
      financialAmount: 'number',
      profitRate: 'string',
      totalAmount: 'number',
      roleCode: 'string',
      companyNo: 'string',
      accountDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 文件信息
export class DocumentInfo extends $tea.Model {
  // 文档Id
  documentId?: string;
  // 类型【CONTRACT 合同, NOTE 票据, DOCUMENT 文件, UNKNOWN 未知】
  fileType?: string;
  // 文档名
  name?: string;
  // 存证哈希
  txHash?: string;
  // 存证时间
  txTime?: number;
  // 文件Url
  url?: string;
  static names(): { [key: string]: string } {
    return {
      documentId: 'document_id',
      fileType: 'file_type',
      name: 'name',
      txHash: 'tx_hash',
      txTime: 'tx_time',
      url: 'url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      documentId: 'string',
      fileType: 'string',
      name: 'string',
      txHash: 'string',
      txTime: 'number',
      url: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户
export class AssetChainUser extends $tea.Model {
  // 申请Id
  applyId?: string;
  // 联盟申请类型【NONE,JOIN,CREATE,ALL】
  applyType?: string;
  // 当前联盟信息
  currentLeagueInfo?: LeagueInfo;
  // 企业名称
  firmName?: string;
  // 申请流程状态【NONE,WAITING,AGREED,REJECTED,CANCELED,ALL】
  leagueApplyStatus?: string;
  // 是否是盟主
  leagueLeader?: boolean;
  // 登录名
  loginName?: string;
  // 蚂蚁金融科技租户ID
  openTenant?: string;
  // 角色类型【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
  roleType?: string;
  static names(): { [key: string]: string } {
    return {
      applyId: 'apply_id',
      applyType: 'apply_type',
      currentLeagueInfo: 'current_league_info',
      firmName: 'firm_name',
      leagueApplyStatus: 'league_apply_status',
      leagueLeader: 'league_leader',
      loginName: 'login_name',
      openTenant: 'open_tenant',
      roleType: 'role_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      applyId: 'string',
      applyType: 'string',
      currentLeagueInfo: LeagueInfo,
      firmName: 'string',
      leagueApplyStatus: 'string',
      leagueLeader: 'boolean',
      loginName: 'string',
      openTenant: 'string',
      roleType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 分配的仓位
export class AllocLocationInfo extends $tea.Model {
  // 仓位ID
  locationId?: string;
  // 仓位名称
  locationName?: string;
  // 仓位容量
  capacity?: number;
  // 已用容量
  usedCapacity?: string;
  // 监控等级【VIDEOREGULATORY：视频监控】
  monitorCapacity?: string;
  // 监控水平【STANDARD：标准版，UPGRADED：升级版】
  monitorLevel?: string;
  static names(): { [key: string]: string } {
    return {
      locationId: 'location_id',
      locationName: 'location_name',
      capacity: 'capacity',
      usedCapacity: 'used_capacity',
      monitorCapacity: 'monitor_capacity',
      monitorLevel: 'monitor_level',
    };
  }

  static types(): { [key: string]: any } {
    return {
      locationId: 'string',
      locationName: 'string',
      capacity: 'number',
      usedCapacity: 'string',
      monitorCapacity: 'string',
      monitorLevel: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 阿里云模型
export class AliyunModel extends $tea.Model {
  // 物模型类目名
  name?: string;
  // 物模型类目Id
  id?: string;
  static names(): { [key: string]: string } {
    return {
      name: 'name',
      id: 'id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      name: 'string',
      id: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据字典
export class AssetTemplate extends $tea.Model {
  // 模板类型id
  categoryId?: string;
  // 模板内容
  content?: string;
  // 模板id
  templateId?: string;
  // 模板名称
  templateName?: string;
  // 是否生效
  valid?: boolean;
  // 是否使用
  used?: boolean;
  // 版本号
  version?: string;
  // 联盟Id
  leagueUid?: string;
  // 标准数据字典
  standard?: boolean;
  static names(): { [key: string]: string } {
    return {
      categoryId: 'category_id',
      content: 'content',
      templateId: 'template_id',
      templateName: 'template_name',
      valid: 'valid',
      used: 'used',
      version: 'version',
      leagueUid: 'league_uid',
      standard: 'standard',
    };
  }

  static types(): { [key: string]: any } {
    return {
      categoryId: 'string',
      content: 'string',
      templateId: 'string',
      templateName: 'string',
      valid: 'boolean',
      used: 'boolean',
      version: 'string',
      leagueUid: 'string',
      standard: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 设备信息
export class DeviceInfo extends $tea.Model {
  // 物模型Id
  aliyunModelId?: string;
  // 设备组
  deviceGroupList?: DeviceGroup[];
  // 三元组
  deviceMeta?: string;
  // 设备拥有者Id
  deviceOwnerId?: string;
  // 设备安装信息
  deviceSetupInfo?: string;
  // 设备类型【ALIDEV：阿里云设备，CHAINMACDEV：链机设备，M2MDEV：M2M设备，OTHERDEV：其他设备】
  deviceType?: string;
  // 设备使用者Id
  deviceUserIdList?: string[];
  // 设备虚拟id
  deviceVirtualId?: string;
  // 智能版本
  smartVersion?: string;
  // 设备状态
  //     【READY：未启用，STARTED：已启用，LOADING：信息待完善，DELETED：已注销， ALL：全部】
  status?: string;
  // 库位Id
  stockPositionIdList?: string[];
  // 库位名称
  stockPositionNameList?: string[];
  // thingsDid
  thingsDid?: string;
  // 设备名称
  thingsName?: string;
  // 视频流地址
  videoUrl?: string;
  // 仓库Id
  warehouseId?: string;
  // 仓库名称
  warehouseName?: string;
  static names(): { [key: string]: string } {
    return {
      aliyunModelId: 'aliyun_model_id',
      deviceGroupList: 'device_group_list',
      deviceMeta: 'device_meta',
      deviceOwnerId: 'device_owner_id',
      deviceSetupInfo: 'device_setup_info',
      deviceType: 'device_type',
      deviceUserIdList: 'device_user_id_list',
      deviceVirtualId: 'device_virtual_id',
      smartVersion: 'smart_version',
      status: 'status',
      stockPositionIdList: 'stock_position_id_list',
      stockPositionNameList: 'stock_position_name_list',
      thingsDid: 'things_did',
      thingsName: 'things_name',
      videoUrl: 'video_url',
      warehouseId: 'warehouse_id',
      warehouseName: 'warehouse_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      aliyunModelId: 'string',
      deviceGroupList: { 'type': 'array', 'itemType': DeviceGroup },
      deviceMeta: 'string',
      deviceOwnerId: 'string',
      deviceSetupInfo: 'string',
      deviceType: 'string',
      deviceUserIdList: { 'type': 'array', 'itemType': 'string' },
      deviceVirtualId: 'string',
      smartVersion: 'string',
      status: 'string',
      stockPositionIdList: { 'type': 'array', 'itemType': 'string' },
      stockPositionNameList: { 'type': 'array', 'itemType': 'string' },
      thingsDid: 'string',
      thingsName: 'string',
      videoUrl: 'string',
      warehouseId: 'string',
      warehouseName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 联盟申请信息
export class LeagueApplyInfo extends $tea.Model {
  // 申请账号
  applyAccount?: string;
  // 申请企业
  applyCorp?: string;
  // 申请Id
  applyId?: string;
  // 申请人手机
  applyMobileNum?: string;
  // 申请时间
  applyTime?: string;
  // 申请类型【NONE,JOIN,CREATE,ALL】
  applyType?: string;
  // 当前流程状态【NONE,WAITING,AGREED,REJECTED,CANCELED,ALL】
  currentStatus?: string;
  // 流程历史
  flowHistory?: FlowInfo[];
  // 角色【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
  roleType?: string;
  static names(): { [key: string]: string } {
    return {
      applyAccount: 'apply_account',
      applyCorp: 'apply_corp',
      applyId: 'apply_id',
      applyMobileNum: 'apply_mobile_num',
      applyTime: 'apply_time',
      applyType: 'apply_type',
      currentStatus: 'current_status',
      flowHistory: 'flow_history',
      roleType: 'role_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      applyAccount: 'string',
      applyCorp: 'string',
      applyId: 'string',
      applyMobileNum: 'string',
      applyTime: 'string',
      applyType: 'string',
      currentStatus: 'string',
      flowHistory: { 'type': 'array', 'itemType': FlowInfo },
      roleType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 注册仓单申请单
export class RegisterWhReceiptSummary extends $tea.Model {
  // 注册仓单申请单ID
  registerWhReceiptId?: string;
  // 仓单ID
  warehouseReceiptId?: string;
  // 注册仓单申请单状态【 NONE：无效状态，WAITING：待审核，AGREED：审核同意，REJECTED：审核拒绝，CANCELED：已取消，WAITING_PRE_ALLOC_POSITION：待预分配仓位，WAITING_TRANSACTION_IN：待入库，TRANSACTION_IN：入库中，FINISHED_TRANSACTION_IN：已入库/待确认，CONFIRMED_TRANSACTION_IN：完成入库，INTERRUPTION：已中断，ALL：所有状态】
  status?: string;
  // 申请时间，单位：ms
  applyTime?: number;
  // 货物品类
  commodityCategory?: string;
  // 数量 + 单位
  quantity?: string;
  // 重量 + 单位
  weight?: string;
  // 存货人名称
  customerName?: string;
  // 保管人名称
  custodianName?: string;
  static names(): { [key: string]: string } {
    return {
      registerWhReceiptId: 'register_wh_receipt_id',
      warehouseReceiptId: 'warehouse_receipt_id',
      status: 'status',
      applyTime: 'apply_time',
      commodityCategory: 'commodity_category',
      quantity: 'quantity',
      weight: 'weight',
      customerName: 'customer_name',
      custodianName: 'custodian_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      registerWhReceiptId: 'string',
      warehouseReceiptId: 'string',
      status: 'string',
      applyTime: 'number',
      commodityCategory: 'string',
      quantity: 'string',
      weight: 'string',
      customerName: 'string',
      custodianName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 仓位使用情况
export class StockPositionUsed extends $tea.Model {
  // 库位ID
  positionId: string;
  // 已用容量，百分比的数值，如50%，则为50
  usedCapacity: number;
  static names(): { [key: string]: string } {
    return {
      positionId: 'position_id',
      usedCapacity: 'used_capacity',
    };
  }

  static types(): { [key: string]: any } {
    return {
      positionId: 'string',
      usedCapacity: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 设备用户
export class DeviceUser extends $tea.Model {
  // 用户id
  deviceUserId?: string;
  // 用户名称
  deviceUserName?: string;
  // 角色类型【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
  roleType?: string;
  // 权限(仅有设备所有权和设备使用权两种权限)
  authority?: string;
  static names(): { [key: string]: string } {
    return {
      deviceUserId: 'device_user_id',
      deviceUserName: 'device_user_name',
      roleType: 'role_type',
      authority: 'authority',
    };
  }

  static types(): { [key: string]: any } {
    return {
      deviceUserId: 'string',
      deviceUserName: 'string',
      roleType: 'string',
      authority: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 角色企业Map信息
export class RoleOrganization extends $tea.Model {
  // 企业编号
  companyNo: string;
  // 企业名称
  companyName: string;
  // 角色编码
  // 角色编码类型
  // 风险承担方：RISK_TAKER
  // 货物监管方：CARGO_SUPERVISION
  // 资金推荐方：CAPITAL_RECOMMEND
  // 融资推荐方：FUNDER_RECOMMEND
  // 运营管理方：MANAGEMENT
  // 技术支持方：TECHNICAL
  roleCode: string;
  static names(): { [key: string]: string } {
    return {
      companyNo: 'company_no',
      companyName: 'company_name',
      roleCode: 'role_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      companyNo: 'string',
      companyName: 'string',
      roleCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 溯源信息
export class WarehouseReceiptTraceInfo extends $tea.Model {
  // string (enum: PICK_UP, WEAK_ASSET, WEAK_ASSET_TRANSFER, WAREHOUSE_RECEIPT_TRANSFER, WAREHOUSE_RECEIPT_REGISTER, PLEDGE_APPLICATION, PLEDGE_RELEASE, WAREHOUSE_RECEIPT_CANCEL, WAREHOUSE_RECEIPT_UPDATE)
  operateType?: string;
  // 操作标识
  operateTypeDesc?: string;
  // 操作时间
  operateTime?: number;
  // 区块链信息
  blockchainInfo?: BlockchainInfo;
  // 操作主体
  operatorName?: string;
  // string (enum: COMMIT, AGREE, REJECT, CREATE, START, PRE_ALLOC, ALLOC, UPLOAD, UPDATE, COMPLETE, CONFIRM, CONFIRM_COMMIT, CONFIRM_RECALL, TRIGGER, SPLIT, RECALL)
  actionType?: string;
  // 动作描述
  actionDesc?: string;
  // 操作对象
  operateObject?: string;
  static names(): { [key: string]: string } {
    return {
      operateType: 'operate_type',
      operateTypeDesc: 'operate_type_desc',
      operateTime: 'operate_time',
      blockchainInfo: 'blockchain_info',
      operatorName: 'operator_name',
      actionType: 'action_type',
      actionDesc: 'action_desc',
      operateObject: 'operate_object',
    };
  }

  static types(): { [key: string]: any } {
    return {
      operateType: 'string',
      operateTypeDesc: 'string',
      operateTime: 'number',
      blockchainInfo: BlockchainInfo,
      operatorName: 'string',
      actionType: 'string',
      actionDesc: 'string',
      operateObject: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 快照
export class ScreenShot extends $tea.Model {
  // id
  fileId?: string;
  // url
  fileUrl?: string;
  // 时间
  screenshotTime?: number;
  // 上链txHash
  txHash?: string;
  // 设备名称
  deviceName?: string;
  // 关联仓位名称列表
  locationNameList?: string[];
  static names(): { [key: string]: string } {
    return {
      fileId: 'file_id',
      fileUrl: 'file_url',
      screenshotTime: 'screenshot_time',
      txHash: 'tx_hash',
      deviceName: 'device_name',
      locationNameList: 'location_name_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      fileId: 'string',
      fileUrl: 'string',
      screenshotTime: 'number',
      txHash: 'string',
      deviceName: 'string',
      locationNameList: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 罚息利率结构体
export class PenaltyRateInfo extends $tea.Model {
  // 罚息
  rate: string;
  // 起始-天
  startDay: number;
  // 终止-天
  endDay: number;
  static names(): { [key: string]: string } {
    return {
      rate: 'rate',
      startDay: 'start_day',
      endDay: 'end_day',
    };
  }

  static types(): { [key: string]: any } {
    return {
      rate: 'string',
      startDay: 'number',
      endDay: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 库位信息
export class StorageLocation extends $tea.Model {
  // 仓位容量
  capacity?: string;
  // 设备id
  deviceIdList?: string[];
  // 其他信息
  extraInfo?: string;
  // 库位id
  id?: string;
  // 监控等级【VIDEOREGULATORY：视频监控】
  monitorCapacity?: string;
  // 监控水平【STANDARD：标准版，UPGRADED：升级版】
  monitorLevel?: string;
  // 库位名称
  name?: string;
  // 货物类型【DANGER：危险品，NON_DANGER：非危险品，FOOD：食品】	
  // 
  productType?: string;
  // 状态【AVAILABLE：可用，IN_USE：使用中，IN_CONFIG：配置中，DELETED：已删除】
  status?: string;
  // 仓位面积
  storageLocationArea?: string;
  // 仓位高度
  storageLocationHeight?: string;
  // 库位类型【CHILL：冷藏，FREEZE：冷冻，PASSAGE：通道，FLAT：平面， STEREO：立体】
  type?: string;
  // 已用容量
  usedCapacity?: string;
  // 库位虚拟id
  virtualId?: string;
  // 仓库Id
  warehouseId?: string;
  // 关联仓单Id
  warehouseReceiptId?: string;
  static names(): { [key: string]: string } {
    return {
      capacity: 'capacity',
      deviceIdList: 'device_id_list',
      extraInfo: 'extra_info',
      id: 'id',
      monitorCapacity: 'monitor_capacity',
      monitorLevel: 'monitor_level',
      name: 'name',
      productType: 'product_type',
      status: 'status',
      storageLocationArea: 'storage_location_area',
      storageLocationHeight: 'storage_location_height',
      type: 'type',
      usedCapacity: 'used_capacity',
      virtualId: 'virtual_id',
      warehouseId: 'warehouse_id',
      warehouseReceiptId: 'warehouse_receipt_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      capacity: 'string',
      deviceIdList: { 'type': 'array', 'itemType': 'string' },
      extraInfo: 'string',
      id: 'string',
      monitorCapacity: 'string',
      monitorLevel: 'string',
      name: 'string',
      productType: 'string',
      status: 'string',
      storageLocationArea: 'string',
      storageLocationHeight: 'string',
      type: 'string',
      usedCapacity: 'string',
      virtualId: 'string',
      warehouseId: 'string',
      warehouseReceiptId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 用户信息
export class ThirdPartyUser extends $tea.Model {
  // 用户id
  userId?: string;
  // 用户名
  userName?: string;
  // 联盟id
  leagueUid?: string;
  // 创建时间
  createTime?: string;
  static names(): { [key: string]: string } {
    return {
      userId: 'user_id',
      userName: 'user_name',
      leagueUid: 'league_uid',
      createTime: 'create_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      userId: 'string',
      userName: 'string',
      leagueUid: 'string',
      createTime: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 资产操作结果
export class AssetResult extends $tea.Model {
  // 资产id
  assetId: string;
  // 是否成功
  success: boolean;
  // 信息
  message?: string;
  static names(): { [key: string]: string } {
    return {
      assetId: 'asset_id',
      success: 'success',
      message: 'message',
    };
  }

  static types(): { [key: string]: any } {
    return {
      assetId: 'string',
      success: 'boolean',
      message: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 操作费单价结构体
export class OpeUnitPriceInfo extends $tea.Model {
  // 操作费单价 （分）
  unitPrice: number;
  // 起始-天 （-999 表示无日期限制）
  startDay: number;
  // 终止-天 （-999 表示无日期限制）
  endDay: number;
  static names(): { [key: string]: string } {
    return {
      unitPrice: 'unit_price',
      startDay: 'start_day',
      endDay: 'end_day',
    };
  }

  static types(): { [key: string]: any } {
    return {
      unitPrice: 'number',
      startDay: 'number',
      endDay: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数据字典信息
export class TemplateInfo extends $tea.Model {
  // 数据字id
  templateId?: string;
  // 数据字典名称
  templateName?: string;
  // 数据字典内容
  template?: string;
  static names(): { [key: string]: string } {
    return {
      templateId: 'template_id',
      templateName: 'template_name',
      template: 'template',
    };
  }

  static types(): { [key: string]: any } {
    return {
      templateId: 'string',
      templateName: 'string',
      template: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 总对账单
export class TotalStatement extends $tea.Model {
  // 企业编号
  companyNo: string;
  // 记账日期 yyyy-mm-dd
  accountDate: string;
  // 总分润金额
  amount: number;
  // 风险承担方金额
  riskTaker: number;
  // 货物监管方金额
  cargoSupervision: number;
  // 资金推荐方金额
  capitalRecommend: number;
  // 融资推荐方金额
  funderRecommend: number;
  // 运营管理方金额
  management: number;
  // 技术支持方金额
  technical: number;
  static names(): { [key: string]: string } {
    return {
      companyNo: 'company_no',
      accountDate: 'account_date',
      amount: 'amount',
      riskTaker: 'risk_taker',
      cargoSupervision: 'cargo_supervision',
      capitalRecommend: 'capital_recommend',
      funderRecommend: 'funder_recommend',
      management: 'management',
      technical: 'technical',
    };
  }

  static types(): { [key: string]: any } {
    return {
      companyNo: 'string',
      accountDate: 'string',
      amount: 'number',
      riskTaker: 'number',
      cargoSupervision: 'number',
      capitalRecommend: 'number',
      funderRecommend: 'number',
      management: 'number',
      technical: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 物权信息
export class CertificateInfo extends $tea.Model {
  // 模板id
  templateId: string;
  // 字典模板定义的数据，key-value的json对象
  content: string;
  // 自定义序列（不能重复）
  bizId: number;
  static names(): { [key: string]: string } {
    return {
      templateId: 'template_id',
      content: 'content',
      bizId: 'biz_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      templateId: 'string',
      content: 'string',
      bizId: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 数字字典内容
export class TemplateData extends $tea.Model {
  // 字典类型ID
  templateUid?: string;
  // 数字字典内容
  formData?: TemplateDataConverter;
  static names(): { [key: string]: string } {
    return {
      templateUid: 'template_uid',
      formData: 'form_data',
    };
  }

  static types(): { [key: string]: any } {
    return {
      templateUid: 'string',
      formData: TemplateDataConverter,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 入库信息
export class TransactionInInfo extends $tea.Model {
  // 入库信息表ID
  id?: number;
  // 仓库Did
  warehouseDid?: string;
  // 仓库名称
  warehouseName?: string;
  // 库位Did
  locationDid?: string;
  // 库位名称
  locationName?: string;
  // 设备Did
  deviceDid?: string;
  // 设备名称
  deviceName?: string;
  // 开始时间，单位：s
  startTime?: number;
  // 结束时间, 单位：s
  endTime?: number;
  // 入库视频信息url
  videoUrl?: string;
  // 存证交易hash
  txHash?: string;
  static names(): { [key: string]: string } {
    return {
      id: 'id',
      warehouseDid: 'warehouse_did',
      warehouseName: 'warehouse_name',
      locationDid: 'location_did',
      locationName: 'location_name',
      deviceDid: 'device_did',
      deviceName: 'device_name',
      startTime: 'start_time',
      endTime: 'end_time',
      videoUrl: 'video_url',
      txHash: 'tx_hash',
    };
  }

  static types(): { [key: string]: any } {
    return {
      id: 'number',
      warehouseDid: 'string',
      warehouseName: 'string',
      locationDid: 'string',
      locationName: 'string',
      deviceDid: 'string',
      deviceName: 'string',
      startTime: 'number',
      endTime: 'number',
      videoUrl: 'string',
      txHash: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 组织信息
export class Organization extends $tea.Model {
  // 企业编号
  roleCompanyNo: string;
  // 企业名称
  roleCompanyName: string;
  static names(): { [key: string]: string } {
    return {
      roleCompanyNo: 'role_company_no',
      roleCompanyName: 'role_company_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      roleCompanyNo: 'string',
      roleCompanyName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 还款利息
export class BankFee extends $tea.Model {
  // 融资编号
  financialNo: string;
  // 产品编号
  productNo: string;
  // 应付银行本金
  capitalAmount: number;
  // 应付银行利息
  interestAmount: number;
  // 应付总金额
  totalAmount: number;
  // 记账日期 yyyy-MM-dd
  accountDate: string;
  static names(): { [key: string]: string } {
    return {
      financialNo: 'financial_no',
      productNo: 'product_no',
      capitalAmount: 'capital_amount',
      interestAmount: 'interest_amount',
      totalAmount: 'total_amount',
      accountDate: 'account_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      financialNo: 'string',
      productNo: 'string',
      capitalAmount: 'number',
      interestAmount: 'number',
      totalAmount: 'number',
      accountDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// key和value均为String的entry
export class StringStringEntry extends $tea.Model {
  // 键
  key?: string;
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

// 申请信息
export class RegisterWhReceiptHeader extends $tea.Model {
  // 注册申请单ID
  registerWhReceiptId?: string;
  // 注册仓单状态【 NONE：无效状态，WAITING：待审核，AGREED：审核同意，REJECTED：审核拒绝，CANCELED：已取消，WAITING_PRE_ALLOC_POSITION：待预分配仓位，WAITING_TRANSACTION_IN：待入库，TRANSACTION_IN：入库中，FINISHED_TRANSACTION_IN：已入库/待确认，CONFIRMED_TRANSACTION_IN：完成入库，INTERRUPTION：已中断，ALL：所有状态】
  status?: string;
  // 入库中时的子状态，只有入库中才有值【ALLOCATED_LOCATION：已调用分配仓位信息接口，TRANSACTION_IN_INFO：已调用添加入库信息接口，LOCATION_INFO：已调用补充仓位占用信息接口】
  inStoringStatus?: string;
  // 更新时间
  updateTime?: number;
  static names(): { [key: string]: string } {
    return {
      registerWhReceiptId: 'register_wh_receipt_id',
      status: 'status',
      inStoringStatus: 'in_storing_status',
      updateTime: 'update_time',
    };
  }

  static types(): { [key: string]: any } {
    return {
      registerWhReceiptId: 'string',
      status: 'string',
      inStoringStatus: 'string',
      updateTime: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

// 历史操作信息
export class FlowHistory extends $tea.Model {
  // 操作信息
  flowNodeList?: FlowNode[];
  static names(): { [key: string]: string } {
    return {
      flowNodeList: 'flow_node_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      flowNodeList: { 'type': 'array', 'itemType': FlowNode },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户名
  userName: string;
  // 11位的合法手机号
  phone: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userName: 'user_name',
      phone: 'phone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userName: 'string',
      phone: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateUserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求时间
  date?: number;
  // 请求id
  requestId?: string;
  // 用户id
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      date: 'date',
      requestId: 'request_id',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      date: 'number',
      requestId: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTransferRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资产id
  assetId: string;
  // 被转让的对象
  transferee: string;
  // 转让金额
  monetaryAmount: string;
  // 用户的标识
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      assetId: 'asset_id',
      transferee: 'transferee',
      monetaryAmount: 'monetary_amount',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      assetId: 'string',
      transferee: 'string',
      monetaryAmount: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTransferResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求id
  requestId?: string;
  // long类型时间戳
  date?: number;
  // 实体类中包含两个变量
  blockchainInfo?: BlockchainInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      requestId: 'request_id',
      date: 'date',
      blockchainInfo: 'blockchain_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      requestId: 'string',
      date: 'number',
      blockchainInfo: BlockchainInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreatePickupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资产id
  assetId: string;
  // 用户标识
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      assetId: 'asset_id',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      assetId: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreatePickupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 提取码
  pickupId?: string;
  // 区块链信息
  info?: BlockchainInfo;
  // 请求标识
  requestId?: string;
  // 时间
  date?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pickupId: 'pickup_id',
      info: 'info',
      requestId: 'request_id',
      date: 'date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pickupId: 'string',
      info: BlockchainInfo,
      requestId: 'string',
      date: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelPickupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 提取码
  pickupId: string;
  // 用户标识
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pickupId: 'pickup_id',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pickupId: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelPickupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 提取码
  pickupId?: string;
  // 区块链信息
  info?: BlockchainInfo;
  // 请求标识
  requestId?: string;
  // 时间
  date?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pickupId: 'pickup_id',
      info: 'info',
      requestId: 'request_id',
      date: 'date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pickupId: 'string',
      info: BlockchainInfo,
      requestId: 'string',
      date: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DisablePickupRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资产id
  assetId: string;
  // 用户标识
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      assetId: 'asset_id',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      assetId: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DisablePickupResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 区块链信息
  info?: BlockchainInfo;
  // 提取码
  pickupId?: string;
  // 请求标识
  requestId?: string;
  // 时间
  date?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      info: 'info',
      pickupId: 'pickup_id',
      requestId: 'request_id',
      date: 'date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      info: BlockchainInfo,
      pickupId: 'string',
      requestId: 'string',
      date: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeagueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 区块链标识
  blockchainD: string;
  // 评论
  comment?: string;
  // 联盟名称
  leagueName: string;
  // 用户标识
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      blockchainD: 'blockchain_d',
      comment: 'comment',
      leagueName: 'league_name',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      blockchainD: 'string',
      comment: 'string',
      leagueName: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeagueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 时间
  date?: number;
  // 联盟id
  leagueId?: string;
  // 请求标识
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      date: 'date',
      leagueId: 'league_id',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      date: 'number',
      leagueId: 'string',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddLeagueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联盟id
  leagueId: string;
  // 用户标识
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      leagueId: 'league_id',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      leagueId: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AddLeagueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 时间
  date?: number;
  // 请求标识
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      date: 'date',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      date: 'number',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmLeagueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联盟id
  leagueId: string;
  // 用户标识
  userId: string;
  // 加入用户的标识
  joinUserId: string;
  // 审核结果
  pass: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      leagueId: 'league_id',
      userId: 'user_id',
      joinUserId: 'join_user_id',
      pass: 'pass',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      leagueId: 'string',
      userId: 'string',
      joinUserId: 'string',
      pass: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ConfirmLeagueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 时间
  date?: number;
  // 请求标识
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      date: 'date',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      date: 'number',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeagueRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户标识
  userId: string;
  // 联盟id
  leagueId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      leagueId: 'league_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      leagueId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryLeagueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 联盟信息
  league?: LeagueInfo;
  // 时间
  date?: number;
  // 请求标识
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      league: 'league',
      date: 'date',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      league: LeagueInfo,
      date: 'number',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateImportassetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 字典id
  templateId: string;
  // 数据字典内容
  content: string;
  // 用户标识
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      templateId: 'template_id',
      content: 'content',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      templateId: 'string',
      content: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateImportassetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 资产id
  assetId?: string;
  // 区块链信息
  info?: BlockchainInfo;
  // 时间
  date?: number;
  // 请求标识
  requestId?: string;
  // 短码
  qrCode?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      assetId: 'asset_id',
      info: 'info',
      date: 'date',
      requestId: 'request_id',
      qrCode: 'qr_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      assetId: 'string',
      info: BlockchainInfo,
      date: 'number',
      requestId: 'string',
      qrCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateImportassetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 物权id
  assetId: string;
  // 数据字典内容
  content: string;
  // 用户标识
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      assetId: 'asset_id',
      content: 'content',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      assetId: 'string',
      content: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateImportassetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 区块链信息
  blockchainInfo?: BlockchainInfo;
  // 请求时间
  date?: number;
  // 请求标识
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      blockchainInfo: 'blockchain_info',
      date: 'date',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      blockchainInfo: BlockchainInfo,
      date: 'number',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelImportassetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 物权id
  assetId: string;
  // 用户id
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      assetId: 'asset_id',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      assetId: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelImportassetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 区块链信息
  blockchainInfo?: BlockchainInfo;
  // 时间
  date?: number;
  // 请求标识
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      blockchainInfo: 'blockchain_info',
      date: 'date',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      blockchainInfo: BlockchainInfo,
      date: 'number',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FreezeImportassetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 物权id
  assetId: string;
  // 用户id
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      assetId: 'asset_id',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      assetId: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class FreezeImportassetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 区块链信息
  blockchainInfo?: BlockchainInfo;
  // 时间
  date?: number;
  // 请求标识
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      blockchainInfo: 'blockchain_info',
      date: 'date',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      blockchainInfo: BlockchainInfo,
      date: 'number',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnfreezeImportassetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 物权id
  assetId: string;
  // 用户id
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      assetId: 'asset_id',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      assetId: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UnfreezeImportassetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 区块链信息
  blockchainInfo?: BlockchainInfo;
  // 时间
  date?: number;
  // 请求标识
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      blockchainInfo: 'blockchain_info',
      date: 'date',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      blockchainInfo: BlockchainInfo,
      date: 'number',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryImportassetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 物权id
  assetId: string;
  // 用户id
  userId?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      assetId: 'asset_id',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      assetId: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryImportassetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 物权信息
  asset?: AssetInfo;
  // 时间
  date?: number;
  // 请求id
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      asset: 'asset',
      date: 'date',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      asset: AssetInfo,
      date: 'number',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllImportassetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前页
  currentPage: number;
  // 页面容量
  pageSize: number;
  // 用户标识
  userId?: string;
  // 小程序是加密后的字符串
  phone: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      currentPage: 'current_page',
      pageSize: 'page_size',
      userId: 'user_id',
      phone: 'phone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      currentPage: 'number',
      pageSize: 'number',
      userId: 'string',
      phone: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllImportassetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 物权信息
  assets?: AssetInfo[];
  // 当前页码
  currentPage?: number;
  // 时间
  date?: number;
  // 请求id
  requestId?: string;
  // 总数
  totalCount?: number;
  // 总页数
  totalPage?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      assets: 'assets',
      currentPage: 'current_page',
      date: 'date',
      requestId: 'request_id',
      totalCount: 'total_count',
      totalPage: 'total_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      assets: { 'type': 'array', 'itemType': AssetInfo },
      currentPage: 'number',
      date: 'number',
      requestId: 'string',
      totalCount: 'number',
      totalPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryImportassetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前页
  currentPage: number;
  // 页面大小
  pageSize: number;
  // string (enum: PICK_UP, WEAK_ASSET, WEAK_ASSET_TRANSFER, WAREHOUSE_RECEIPT_TRANSFER, WAREHOUSE_RECEIPT_REGISTER, PLEDGE_APPLICATION, PLEDGE_RELEASE, WAREHOUSE_RECEIPT_CANCEL, WAREHOUSE_RECEIPT_UPDATE) 
  type: string;
  // 用户id
  userId?: string;
  // 资产id
  assetId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      currentPage: 'current_page',
      pageSize: 'page_size',
      type: 'type',
      userId: 'user_id',
      assetId: 'asset_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      currentPage: 'number',
      pageSize: 'number',
      type: 'string',
      userId: 'string',
      assetId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryImportassetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 当前页码
  currentPage?: number;
  // 时间
  date?: number;
  // 请求标识
  requestId?: string;
  // 总条目
  totalCount?: number;
  // 总页数
  totalPage?: number;
  // 溯源信息
  traceInfoList?: WarehouseReceiptTraceInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      currentPage: 'current_page',
      date: 'date',
      requestId: 'request_id',
      totalCount: 'total_count',
      totalPage: 'total_page',
      traceInfoList: 'trace_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      currentPage: 'number',
      date: 'number',
      requestId: 'string',
      totalCount: 'number',
      totalPage: 'number',
      traceInfoList: { 'type': 'array', 'itemType': WarehouseReceiptTraceInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 名称
  name: string;
  // 数据字典
  template?: string;
  // 用户id
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      name: 'name',
      template: 'template',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      name: 'string',
      template: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 时间
  date?: number;
  // 请求标识
  requestId?: string;
  // 数据字典id
  templateId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      date: 'date',
      requestId: 'request_id',
      templateId: 'template_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      date: 'number',
      requestId: 'string',
      templateId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据字典id
  templateId: string;
  // 数据字典内容
  template?: string;
  // 用户id
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      templateId: 'template_id',
      template: 'template',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      templateId: 'string',
      template: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 时间
  date?: number;
  // 请求id
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      date: 'date',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      date: 'number',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据字典id
  templateId: string;
  // 用户id
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      templateId: 'template_id',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      templateId: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 时间
  date?: number;
  // 请求id
  requestId?: string;
  // 数据字典信息
  templateInfo?: TemplateInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      date: 'date',
      requestId: 'request_id',
      templateInfo: 'template_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      date: 'number',
      requestId: 'string',
      templateInfo: TemplateInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllTemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前页
  currentPage: number;
  // 一页的大小
  pageSize: number;
  // 用户id
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      currentPage: 'current_page',
      pageSize: 'page_size',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      currentPage: 'number',
      pageSize: 'number',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AllTemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 时间
  date?: number;
  // 请求id
  requestId?: string;
  // 数据字典信息
  templateInfoList?: TemplateInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      date: 'date',
      requestId: 'request_id',
      templateInfoList: 'template_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      date: 'number',
      requestId: 'string',
      templateInfoList: { 'type': 'array', 'itemType': TemplateInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCheckcodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 物权码
  assetId: string;
  // 创建验权码的用户
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      assetId: 'asset_id',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      assetId: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCheckcodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 验权码
  checkCode?: string;
  // 请求标识
  requestId?: string;
  // 时间戳
  date?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      checkCode: 'check_code',
      requestId: 'request_id',
      date: 'date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      checkCode: 'string',
      requestId: 'string',
      date: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckCheckcodeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 物权码
  assetId: string;
  // 验权码
  checkCode: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      assetId: 'asset_id',
      checkCode: 'check_code',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      assetId: 'string',
      checkCode: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CheckCheckcodeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 校验通过与否
  audit?: boolean;
  // 请求标识
  requestId?: string;
  // 时间戳
  date?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      audit: 'audit',
      requestId: 'request_id',
      date: 'date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      audit: 'boolean',
      requestId: 'string',
      date: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAssetpledgeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 物权id
  assetId: string;
  // 资金方的id
  lenderId: string;
  // 申请方的id
  userId: string;
  // 融资协议
  financialProtocolId?: string;
  // 质押金额
  value: number;
  // 质押时长
  duration: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      assetId: 'asset_id',
      lenderId: 'lender_id',
      userId: 'user_id',
      financialProtocolId: 'financial_protocol_id',
      value: 'value',
      duration: 'duration',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      assetId: 'string',
      lenderId: 'string',
      userId: 'string',
      financialProtocolId: 'string',
      value: 'number',
      duration: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAssetpledgeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 质押申请id
  pledgeId?: string;
  // 区块链信息
  info?: BlockchainInfo;
  // 时间戳
  date?: number;
  // 请求标识
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pledgeId: 'pledge_id',
      info: 'info',
      date: 'date',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pledgeId: 'string',
      info: BlockchainInfo,
      date: 'number',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReleaseAssetpledgeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资金方的id
  userId: string;
  // 质押Id
  pledgeId: string;
  // 放款时间
  lendDate: number;
  // 放款金额
  value: number;
  // 收款方名称
  borrowerName: string;
  // 收款方账号
  borrowerAccount: string;
  // 收款方银行
  borrowerBankInfo: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      pledgeId: 'pledge_id',
      lendDate: 'lend_date',
      value: 'value',
      borrowerName: 'borrower_name',
      borrowerAccount: 'borrower_account',
      borrowerBankInfo: 'borrower_bank_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      pledgeId: 'string',
      lendDate: 'number',
      value: 'number',
      borrowerName: 'string',
      borrowerAccount: 'string',
      borrowerBankInfo: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ReleaseAssetpledgeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 链信息
  info?: BlockchainInfo;
  // 时间戳
  date?: number;
  // 请求标识
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      info: 'info',
      date: 'date',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      info: BlockchainInfo,
      date: 'number',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RepayAssetpledgeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 申请方
  userId: string;
  // 质押id
  pledgeId: string;
  // 收款方银行
  recipientBank: string;
  // 收款方账号
  recipientAccount: string;
  // 金额
  value: number;
  // 还款时间
  repayDate: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      pledgeId: 'pledge_id',
      recipientBank: 'recipient_bank',
      recipientAccount: 'recipient_account',
      value: 'value',
      repayDate: 'repay_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      pledgeId: 'string',
      recipientBank: 'string',
      recipientAccount: 'string',
      value: 'number',
      repayDate: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class RepayAssetpledgeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 还款id
  repayId?: string;
  // 链信息
  info?: BlockchainInfo;
  // 请求标识
  requestId?: string;
  // 时间戳
  date?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      repayId: 'repay_id',
      info: 'info',
      requestId: 'request_id',
      date: 'date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      repayId: 'string',
      info: BlockchainInfo,
      requestId: 'string',
      date: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetLeagueAccountinfoRequest extends $tea.Model {
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

export class GetLeagueAccountinfoResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户信息
  role?: AssetChainUser;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      role: 'role',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      role: AssetChainUser,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateWarehouseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 地址
  address: string;
  // 平面图
  blueprintId?: string;
  // 所在国家
  country: string;
  // 其他信息
  extraInfo?: string;
  // 纬度
  latitude: string;
  // 经度
  longitude: string;
  // 仓库面积
  warehouseArea: string;
  // 仓库高度
  warehouseHeight?: string;
  // 仓库id
  warehouseId: string;
  // 仓库名称
  warehouseName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      address: 'address',
      blueprintId: 'blueprint_id',
      country: 'country',
      extraInfo: 'extra_info',
      latitude: 'latitude',
      longitude: 'longitude',
      warehouseArea: 'warehouse_area',
      warehouseHeight: 'warehouse_height',
      warehouseId: 'warehouse_id',
      warehouseName: 'warehouse_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      address: 'string',
      blueprintId: 'string',
      country: 'string',
      extraInfo: 'string',
      latitude: 'string',
      longitude: 'string',
      warehouseArea: 'string',
      warehouseHeight: 'string',
      warehouseId: 'string',
      warehouseName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateWarehouseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 仓库id
  warehouseId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      warehouseId: 'warehouse_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      warehouseId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListLeagueRoleRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 角色类型集合【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
  roleTypes: string[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      roleTypes: 'role_types',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      roleTypes: { 'type': 'array', 'itemType': 'string' },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListLeagueRoleResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 角色列表
  roleList?: Role[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      roleList: 'role_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      roleList: { 'type': 'array', 'itemType': Role },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetWarehouseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 仓库id
  warehouseId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      warehouseId: 'warehouse_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      warehouseId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetWarehouseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 地址
  address?: string;
  // 平面图
  blueprintUrl?: string;
  // 所在国家
  country?: string;
  // 设备数量
  deviceNum?: number;
  // 其他信息
  extraInfo?: string;
  // 纬度
  latitude?: string;
  // 经度
  longitude?: string;
  // 智能版本
  smartLevel?: string;
  // 仓位数量
  stockPositionNum?: number;
  // version
  version?: string;
  // 仓库面积
  warehouseArea?: string;
  // 仓库高度
  warehouseHeight?: string;
  // 仓库id
  warehouseId?: string;
  // 仓库名称
  warehouseName?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      address: 'address',
      blueprintUrl: 'blueprint_url',
      country: 'country',
      deviceNum: 'device_num',
      extraInfo: 'extra_info',
      latitude: 'latitude',
      longitude: 'longitude',
      smartLevel: 'smart_level',
      stockPositionNum: 'stock_position_num',
      version: 'version',
      warehouseArea: 'warehouse_area',
      warehouseHeight: 'warehouse_height',
      warehouseId: 'warehouse_id',
      warehouseName: 'warehouse_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      address: 'string',
      blueprintUrl: 'string',
      country: 'string',
      deviceNum: 'number',
      extraInfo: 'string',
      latitude: 'string',
      longitude: 'string',
      smartLevel: 'string',
      stockPositionNum: 'number',
      version: 'string',
      warehouseArea: 'string',
      warehouseHeight: 'string',
      warehouseId: 'string',
      warehouseName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateWarehouseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 地址（传原值，不可修改此项）
  address: string;
  // 平面图
  blueprintId?: string;
  // 所在国家（传原值，不可修改此项）
  country: string;
  // 其他信息
  extraInfo?: string;
  // 仓库面积
  warehouseArea: string;
  // 仓库id
  warehouseId: string;
  // 仓库名称（传原值，不可修改此项）
  warehouseName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      address: 'address',
      blueprintId: 'blueprint_id',
      country: 'country',
      extraInfo: 'extra_info',
      warehouseArea: 'warehouse_area',
      warehouseId: 'warehouse_id',
      warehouseName: 'warehouse_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      address: 'string',
      blueprintId: 'string',
      country: 'string',
      extraInfo: 'string',
      warehouseArea: 'string',
      warehouseId: 'string',
      warehouseName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateWarehouseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 地址
  address?: string;
  // 平面图
  blueprintId?: string;
  // 所在国家
  country?: string;
  // 其他信息
  extraInfo?: string;
  // 经纬度
  location?: string;
  // 仓库面积
  warehouseArea?: string;
  // 仓库id
  warehouseId?: string;
  // 仓库名称
  warehouseName?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      address: 'address',
      blueprintId: 'blueprint_id',
      country: 'country',
      extraInfo: 'extra_info',
      location: 'location',
      warehouseArea: 'warehouse_area',
      warehouseId: 'warehouse_id',
      warehouseName: 'warehouse_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      address: 'string',
      blueprintId: 'string',
      country: 'string',
      extraInfo: 'string',
      location: 'string',
      warehouseArea: 'string',
      warehouseId: 'string',
      warehouseName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListWarehouseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前页
  currentPage: number;
  // 页面大小
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      currentPage: 'current_page',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      currentPage: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListWarehouseResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 仓位总数
  locationTotal?: number;
  // 总条目
  totalCount?: number;
  // 总页数
  totalPage?: number;
  // 仓库信息
  warehouseList?: WarehouseInfo[];
  // 设备总数
  deviceTotal?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      locationTotal: 'location_total',
      totalCount: 'total_count',
      totalPage: 'total_page',
      warehouseList: 'warehouse_list',
      deviceTotal: 'device_total',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      locationTotal: 'number',
      totalCount: 'number',
      totalPage: 'number',
      warehouseList: { 'type': 'array', 'itemType': WarehouseInfo },
      deviceTotal: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListLeagueRequest extends $tea.Model {
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

export class ListLeagueResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 联盟详情列表
  leagueInfoList?: LeagueInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      leagueInfoList: 'league_info_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      leagueInfoList: { 'type': 'array', 'itemType': LeagueInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWarehouseDeviceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 设备状态[READY：未启用，STARTED：已启用，LOADING：信息待完善，DELETED：已注销，ALL：全部]
  deviceFilter?: string;
  // 仓位id
  storageLocationId?: string;
  // 仓库id
  warehouseId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      deviceFilter: 'device_filter',
      storageLocationId: 'storage_location_id',
      warehouseId: 'warehouse_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      deviceFilter: 'string',
      storageLocationId: 'string',
      warehouseId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWarehouseDeviceResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 设备信息
  deviceList?: DeviceInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      deviceList: 'device_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      deviceList: { 'type': 'array', 'itemType': DeviceInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeagueApplyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 联盟描述
  leagueDesc?: string;
  // 联盟名称
  leagueName: string;
  // 费率
  rate?: number;
  // 角色类型【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
  roleType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      leagueDesc: 'league_desc',
      leagueName: 'league_name',
      rate: 'rate',
      roleType: 'role_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      leagueDesc: 'string',
      leagueName: 'string',
      rate: 'number',
      roleType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeagueApplyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 联盟id
  applyId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      applyId: 'apply_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      applyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeagueJoinapplyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 备注
  comment?: string;
  // 联盟Id
  leagueId: string;
  // 角色【NONE 无，MEMBER 存货方，CUSTODIAN 保管方，LENDER 资金方，OPERATOR 运营方，WARRANTY 担保方 ALL 所有】
  roleType: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      comment: 'comment',
      leagueId: 'league_id',
      roleType: 'role_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      comment: 'string',
      leagueId: 'string',
      roleType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateLeagueJoinapplyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 申请id
  applyId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      applyId: 'apply_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      applyId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelLeagueApplyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 申请Id
  applyId: string;
  // 申请类型【NONE,JOIN,CREATE,ALL】
  applyType: string;
  // 备注
  comment?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applyId: 'apply_id',
      applyType: 'apply_type',
      comment: 'comment',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applyId: 'string',
      applyType: 'string',
      comment: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelLeagueApplyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 申请类型【NONE,JOIN,CREATE,ALL】
  applyType?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      applyType: 'apply_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      applyType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWarehouseStoragelocationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 仓库id
  warehouseId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      warehouseId: 'warehouse_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      warehouseId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryWarehouseStoragelocationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 库位信息
  storageLocationList?: StorageLocation[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      storageLocationList: 'storage_location_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      storageLocationList: { 'type': 'array', 'itemType': StorageLocation },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthLeagueApplyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 申请Id
  applyId: string;
  // 申请类型【NONE,JOIN,CREATE,ALL】
  applyType: string;
  // 备注
  comment?: string;
  // 审核结果
  pass: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applyId: 'apply_id',
      applyType: 'apply_type',
      comment: 'comment',
      pass: 'pass',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applyId: 'string',
      applyType: 'string',
      comment: 'string',
      pass: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class AuthLeagueApplyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 申请类型【NONE,JOIN,CREATE,ALL】
  applyType?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      applyType: 'apply_type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      applyType: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteWarehouseRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 仓库id
  warehouseId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      warehouseId: 'warehouse_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      warehouseId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteWarehouseResponse extends $tea.Model {
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

export class ListLeagueApplyRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 申请类型【NONE,JOIN,CREATE,ALL】
  applyType: string;
  // 当前页
  currentPage: number;
  // 页大小
  pageSize: number;
  // 入盟申请状态【NONE,WAITING,AGREED,REJECTED,CANCELED,ALL】
  status: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      applyType: 'apply_type',
      currentPage: 'current_page',
      pageSize: 'page_size',
      status: 'status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      applyType: 'string',
      currentPage: 'number',
      pageSize: 'number',
      status: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListLeagueApplyResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 申请类型【NONE,JOIN,CREATE,ALL】
  applyType?: string;
  // 申请内容
  leagueApplyInfoList?: LeagueApplyInfo[];
  // 总条目
  totalCount?: number;
  // 总页数
  totalPage?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      applyType: 'apply_type',
      leagueApplyInfoList: 'league_apply_info_list',
      totalCount: 'total_count',
      totalPage: 'total_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      applyType: 'string',
      leagueApplyInfoList: { 'type': 'array', 'itemType': LeagueApplyInfo },
      totalCount: 'number',
      totalPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateWarehouseStoraglocationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 是否禁用智能监管
  disableSurv?: boolean;
  // 其他信息
  extraInfo?: string;
  // 库位名称
  name: string;
  // 货物类型【DANGER：危险品，NON_DANGER：非危险品，FOOD：食品】
  productType: string;
  // 状态【AVAILABLE：可用，IN_USE：使用中，IN_CONFIG：配置中，DELETED：已删除】
  status: string;
  // 仓位面积
  storageLocationArea: string;
  // 仓位高度
  storageLocationHeight: string;
  // 库位类型【CHILL：冷藏，FREEZE：冷冻，PASSAGE：通道，FLAT：平面， STEREO：立体】
  type: string;
  // 仓位虚拟id
  virtualStorageLocationId: string;
  // 仓库id
  warehouseId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      disableSurv: 'disable_surv',
      extraInfo: 'extra_info',
      name: 'name',
      productType: 'product_type',
      status: 'status',
      storageLocationArea: 'storage_location_area',
      storageLocationHeight: 'storage_location_height',
      type: 'type',
      virtualStorageLocationId: 'virtual_storage_location_id',
      warehouseId: 'warehouse_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      disableSurv: 'boolean',
      extraInfo: 'string',
      name: 'string',
      productType: 'string',
      status: 'string',
      storageLocationArea: 'string',
      storageLocationHeight: 'string',
      type: 'string',
      virtualStorageLocationId: 'string',
      warehouseId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateWarehouseStoraglocationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 库位id
  storageLocationId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      storageLocationId: 'storage_location_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      storageLocationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetWarehouseStoragelocationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 库位id
  locationId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      locationId: 'location_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      locationId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetWarehouseStoragelocationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 库位信息
  storageLocation?: StorageLocation;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      storageLocation: 'storage_location',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      storageLocation: StorageLocation,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateWarehouseStoragelocationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 其他信息
  extraInfo?: string;
  // 仓位id
  id: string;
  // 货物类型【DANGER：危险品，NON_DANGER：非危险品，FOOD：食品】
  productType: string;
  // 状态【AVAILABLE：可用，IN_USE：使用中，IN_CONFIG：配置中，DELETED：已删除】
  status: string;
  // 仓位面积
  storageLocationArea: string;
  // 仓位高度
  storageLocationHeight: string;
  // 库位类型【CHILL：冷藏，FREEZE：冷冻，PASSAGE：通道，FLAT：平面， STEREO：立体】
  type: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      extraInfo: 'extra_info',
      id: 'id',
      productType: 'product_type',
      status: 'status',
      storageLocationArea: 'storage_location_area',
      storageLocationHeight: 'storage_location_height',
      type: 'type',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      extraInfo: 'string',
      id: 'string',
      productType: 'string',
      status: 'string',
      storageLocationArea: 'string',
      storageLocationHeight: 'string',
      type: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateWarehouseStoragelocationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 库位信息
  storageLocation?: StorageLocation;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      storageLocation: 'storage_location',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      storageLocation: StorageLocation,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchqueryWarehouseStoragelocationRequest extends $tea.Model {
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

export class BatchqueryWarehouseStoragelocationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 库位信息
  storageLocationList?: StorageLocation[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      storageLocationList: 'storage_location_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      storageLocationList: { 'type': 'array', 'itemType': StorageLocation },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListWarehouseStoragelocationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前页
  currentPage: number;
  // 页大小
  pageSize: number;
  // 库位状态【AVAILABLE：可用，IN_USE：使用中，IN_CONFIG：配置中，DELETED：已删除】
  status?: string;
  // 仓库id
  warehouseId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      currentPage: 'current_page',
      pageSize: 'page_size',
      status: 'status',
      warehouseId: 'warehouse_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      currentPage: 'number',
      pageSize: 'number',
      status: 'string',
      warehouseId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListWarehouseStoragelocationResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 库位信息
  storageLocationList?: StorageLocation[];
  // 总条目
  totalCount?: number;
  // 总页数
  totalPage?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      storageLocationList: 'storage_location_list',
      totalCount: 'total_count',
      totalPage: 'total_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      storageLocationList: { 'type': 'array', 'itemType': StorageLocation },
      totalCount: 'number',
      totalPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteWarehouseStoragelocationRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 仓位id
  locationId: string;
  // 仓库id
  warehouseId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      locationId: 'location_id',
      warehouseId: 'warehouse_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      locationId: 'string',
      warehouseId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteWarehouseStoragelocationResponse extends $tea.Model {
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

export class CreateAssettemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 模板类型id
  categoryId: string;
  // 模板JSON内容
  content: string;
  // 模板名称
  name: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      categoryId: 'category_id',
      content: 'content',
      name: 'name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      categoryId: 'string',
      content: 'string',
      name: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateAssettemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据字典id
  templateId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      templateId: 'template_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      templateId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAssettemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 模板类型Id
  categoryId?: string;
  // 模板JSON内容
  content?: string;
  // 数据字典id
  templateId: string;
  // 名称
  templateName?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      categoryId: 'category_id',
      content: 'content',
      templateId: 'template_id',
      templateName: 'template_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      categoryId: 'string',
      content: 'string',
      templateId: 'string',
      templateName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateAssettemplateResponse extends $tea.Model {
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

export class GetAssettemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 数据字典id
  templateId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      templateId: 'template_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      templateId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetAssettemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据字典信息
  templateInfo?: AssetTemplate;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      templateInfo: 'template_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      templateInfo: AssetTemplate,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAssettemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 当前页
  currentPage: number;
  // 页大小
  pageSize: number;
  // 模板状态【ALL：全部，INVALID：无效，VALID：有效】
  templateStatus?: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      currentPage: 'current_page',
      pageSize: 'page_size',
      templateStatus: 'template_status',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      currentPage: 'number',
      pageSize: 'number',
      templateStatus: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListAssettemplateResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 数据字典信息
  templateInfoList?: AssetTemplate[];
  // 总条目
  totalCount?: number;
  // 总页数
  totalPage?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      templateInfoList: 'template_info_list',
      totalCount: 'total_count',
      totalPage: 'total_page',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      templateInfoList: { 'type': 'array', 'itemType': AssetTemplate },
      totalCount: 'number',
      totalPage: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAssettemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 模板id
  templateId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      templateId: 'template_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      templateId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DeleteAssettemplateResponse extends $tea.Model {
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

export class EnableAssettemplateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 模板id
  templateId: string;
  // 是否生效
  valid: boolean;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      templateId: 'template_id',
      valid: 'valid',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      templateId: 'string',
      valid: 'boolean',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class EnableAssettemplateResponse extends $tea.Model {
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

export class UpdateDocumentFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 原文件md5
  fileMd5: string;
  // 文件名称
  fileName: string;
  // 原文件大小
  fileSize: number;
  // 文件类型【CONTRACT 合同, NOTE 票据, DOCUMENT 文件, UNKNOWN 未知】
  fileType: string;
  // 原文件url
  fileUrl: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileMd5: 'file_md5',
      fileName: 'file_name',
      fileSize: 'file_size',
      fileType: 'file_type',
      fileUrl: 'file_url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileMd5: 'string',
      fileName: 'string',
      fileSize: 'number',
      fileType: 'string',
      fileUrl: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateDocumentFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文件信息
  documentInfo?: DocumentInfo;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      documentInfo: 'document_info',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      documentInfo: DocumentInfo,
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDocumentFileRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 文件Id
  fileId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      fileId: 'file_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      fileId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class GetDocumentFileResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 文档Id
  documentId?: string;
  // 类型【CONTRACT 合同, NOTE 票据, DOCUMENT 文件, UNKNOWN 未知】
  fileType?: string;
  // 文档名
  name?: string;
  // 存证哈希
  txHash?: string;
  // 存证时间
  txTime?: number;
  // 文件Url
  url?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      documentId: 'document_id',
      fileType: 'file_type',
      name: 'name',
      txHash: 'tx_hash',
      txTime: 'tx_time',
      url: 'url',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      documentId: 'string',
      fileType: 'string',
      name: 'string',
      txHash: 'string',
      txTime: 'number',
      url: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户ID
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelUserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求时间
  date?: number;
  // 请求ID
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      date: 'date',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      date: 'number',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户ID
  userId: string;
  // 11位的合法手机号
  phone: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      phone: 'phone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      phone: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class UpdateUserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 请求时间
  date?: number;
  // 请求ID
  requestId?: string;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      date: 'date',
      requestId: 'request_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      date: 'number',
      requestId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 手机号
  phone: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      phone: 'phone',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      phone: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListUserResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 用户信息列表
  userList?: ThirdPartyUser[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      userList: 'user_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      userList: { 'type': 'array', 'itemType': ThirdPartyUser },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class MountUserRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 物证平台用户id
  userId: string;
  // 平台类别
  platform: string;
  // 外部平台id
  openId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      platform: 'platform',
      openId: 'open_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      platform: 'string',
      openId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class MountUserResponse extends $tea.Model {
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

export class BatchcreateImportassetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 用户id
  userId: string;
  // 物权信息列表
  certificates: CertificateInfo[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      userId: 'user_id',
      certificates: 'certificates',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      userId: 'string',
      certificates: { 'type': 'array', 'itemType': CertificateInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateImportassetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 物证信息
  evidences?: EvidenceInfo[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      evidences: 'evidences',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      evidences: { 'type': 'array', 'itemType': EvidenceInfo },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeImportassetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 物权凭证id
  assetId: string;
  // 信息内容JSON格式
  content: string;
  // 用户id
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      assetId: 'asset_id',
      content: 'content',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      assetId: 'string',
      content: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class DescribeImportassetResponse extends $tea.Model {
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

export class BatchfreezeImportassetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资产id列表
  assetIdList: string[];
  // 用户id
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      assetIdList: 'asset_id_list',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      assetIdList: { 'type': 'array', 'itemType': 'string' },
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchfreezeImportassetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 批量操作返回信息
  resultList?: AssetResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultList: 'result_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultList: { 'type': 'array', 'itemType': AssetResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchunfreezeImportassetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 批量操作信息列表
  assetIdList: string[];
  // 用户id
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      assetIdList: 'asset_id_list',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      assetIdList: { 'type': 'array', 'itemType': 'string' },
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchunfreezeImportassetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 批量返回信息列表
  resultList?: AssetResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultList: 'result_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultList: { 'type': 'array', 'itemType': AssetResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcancelImportassetRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资产id列表
  assetIdList: string[];
  // 用户id
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      assetIdList: 'asset_id_list',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      assetIdList: { 'type': 'array', 'itemType': 'string' },
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcancelImportassetResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 批量返回信息列表
  resultList?: AssetResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultList: 'result_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultList: { 'type': 'array', 'itemType': AssetResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateTransferRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 资产id列表
  assetIdList: string[];
  // 接收人id
  transferee: string;
  // 转让金额
  monetaryAmount: string;
  // 用户id
  userId: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      assetIdList: 'asset_id_list',
      transferee: 'transferee',
      monetaryAmount: 'monetary_amount',
      userId: 'user_id',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      assetIdList: { 'type': 'array', 'itemType': 'string' },
      transferee: 'string',
      monetaryAmount: 'string',
      userId: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class BatchcreateTransferResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 批量操作返回信息列表
  resultList?: AssetResult[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      resultList: 'result_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      resultList: { 'type': 'array', 'itemType': AssetResult },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCmportProfitrateRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 产品编号
  productNo: string;
  // 产品类型
  productType: string;
  // 产品名称
  productName: string;
  // 金融机构编号
  financialNo: string;
  // 金融机构名称
  financialName: string;
  // 各方分润比例
  // 对应角色编码类型：
  // 风险承担方：RISK_TAKER
  // 货物监管方：CARGO_SUPERVISION
  // 资金推荐方：CAPITAL_RECOMMEND
  // 融资推荐方：FUNDER_RECOMMEND
  // 运营管理方：MANAGEMENT
  // 技术支持方：TECHNICAL
  roleRatio: RoleRatio[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      productNo: 'product_no',
      productType: 'product_type',
      productName: 'product_name',
      financialNo: 'financial_no',
      financialName: 'financial_name',
      roleRatio: 'role_ratio',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      productNo: 'string',
      productType: 'string',
      productName: 'string',
      financialNo: 'string',
      financialName: 'string',
      roleRatio: { 'type': 'array', 'itemType': RoleRatio },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCmportProfitrateResponse extends $tea.Model {
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

export class ApplyCmportFinanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 来源方
  source: string;
  // 融资编号（粮达生成）
  financialNo: string;
  // 融资编号（粮达生成）
  merchantFinancialNo: string;
  // 交易编号（粮达生成）
  tradeNo: string;
  // 融资企业名称
  companyName: string;
  // 融资企业编码
  companyCode: string;
  // 统一信用代码
  uniCreditCode: string;
  // 法人名称
  legalPerson: string;
  // 法人身份号码
  legalPersonIdNo: string;
  // 融资企业联系人
  companyContactPerson: string;
  // 融资企业联系号码
  companyContactPhone: string;
  // 企业办公地址
  companyAddr: string;
  // 对手编号
  buyerCode: string;
  // 对手企业名称
  buyerName: string;
  // 对手统一信用代码
  buyerUniCreditCode: string;
  // 对手法人
  buyerLegalPerson?: string;
  // 对手法人身份证号码
  buyerLegalPersonIdNo?: string;
  // 对手联系人
  buyerContactPerson?: string;
  // 对手联系人手机
  buyerContactPhone?: string;
  // 融资标的（采购合同关联的货权编号: 多个编号，隔开）
  financingTarget: string;
  // 融资金额（分）
  financialAmount: number;
  // 融资周期（天）
  financialPeriod: number;
  // 融资利率列表
  financialRateList: FinancialRateInfo[];
  // 罚息利率列表
  penaltyRateList: PenaltyRateInfo[];
  // 操作费类型 1->标准收费; 2->阶梯收费
  opeFeeType: number;
  // 操作费单价列表
  opeUnitPriceList: OpeUnitPriceInfo[];
  // 货物品种
  cargoType: string;
  // 货物吨数 (单位 t)
  cargoWeight: string;
  // 货物单价（分）
  cargoUnitPrice: number;
  // 货物单价类型
  cargoUnitPriceType: string;
  // 货物总价
  cargoTotalPrice: number;
  // 融资申请日期
  applyDate?: string;
  // 产品编号
  productNo: string;
  // 产品名称
  productName: string;
  // 产品类别：1->买方保理;2->卖方保理;3->仓单融资
  productType: number;
  // 确权方编码
  authenticRightCode: string;
  // 确权方名称
  authenticRightName: string;
  // 确权状态 1->已确权; 2->未确权。粮达网默认是 1
  authenticRightStatus: number;
  // 确权时间
  authenticRightTime: string;
  // 仓储服务商/物流服务商
  storageServiceProvider: string;
  // 仓储地址/物流地址
  warehouseAddr: string;
  // 仓储联系方式/物流联系方式
  storageContactPhone: string;
  // 金融机构编码
  bankInstiCode: string;
  // 金融机构名称
  bankInstiName: string;
  // 是否缴纳保证金 1->缴纳;2->不缴纳
  isPaySecurityDeposit: number;
  // 保证金缴纳金额
  securityDepositAmount: number;
  // 保证金缴纳比例
  securityDepositRate: string;
  // 融资额度协议编号
  financingLimitAgreeNo: string;
  // 电子章认证机构
  elecCertInsti: string;
  // 签署日期
  signDate: string;
  // 保理协议编号
  factoringAgreementNo: string;
  // 卖方保理专户（回款账户）
  sellerFactoringAccount: string;
  // 服务类型: 1->应收账款保理
  serviceType: string;
  // 业务类型: 1-> 买断循环后收息
  businessType: string;
  // 费用收取方式: 1-> 融资时收取
  feeCollectType: string;
  // 利息收取方式: 1-> 预扣
  interestCollectType: string;
  // 电子凭证编号
  elecCertNo: string;
  // 电子凭证开立日
  elecCertSetUpDate: string;
  // 电子凭证付款到期日
  elecCertExpireDate: string;
  // 转让电子凭证金额
  elecCertAmount: number;
  // 交易合同发票编号
  tradeContractInvoNo: string;
  // 交易合同发票金额
  tradeContractInvoAmount: number;
  // 交易合同名称
  tradeContractName: string;
  // 交易合同编号
  tradeContractNo: string;
  // 交易合同买方名称
  tradeContractBuyerName: string;
  // 磅单凭证（多个的话-分号分割）
  poundProofs?: string;
  // 入库凭证（多个的话-分号分割）
  storageProofs: string;
  // 借款合同（多个的话-分号分割）
  loanContract: string;
  // 采购合同（多个的话-分号分割）
  purchaseContract: string;
  // 销售合同（多个的话-分号分割）
  sellContract: string;
  // 寄售合同（多个的话-分号分割）
  consignmentContract?: string;
  // 融资方营业执照
  bussLicense?: string;
  // 法人身份证（正）
  legalPersonFront?: string;
  // 法人身份证（反）
  legalPersonReverse?: string;
  // 银行侧融资利率
  bankFinancialRate: string;
  // 银行侧罚息
  bankPenaltyRate: string;
  // 融资状态:
  // 10->待确权;20->待审核;30->待签署;40->待放款;50->待还款;51->还款撤销;52->还款中;60->已还款;70->审核不通过;80->已融资撤销
  financialStatus: number;
  // 撤销申请日期
  cancelApplyDate?: string;
  // 撤销申请描述
  cancelApplyDesc?: string;
  // 审核人
  auditor?: string;
  // 审核时间
  auditDate?: string;
  // 审核评论
  auditComment?: string;
  // 确认放款日期
  confirmLoanDate?: string;
  // 确认放款评论
  confirmLoanComment?: string;
  // 流程标记：
  // 1->流程通过;2->流程打回到上一级;3->直接拒绝
  confirmLoanFlag?: number;
  // Date
  contractSignTime?: string;
  // 待签署评论
  contractSignComment?: string;
  // 流程标记：
  // 1->流程通过;2->流程打回到上一级;3->直接拒绝
  contractSignFlag?: number;
  // 上链账户
  userDid: string;
  // 联盟id
  unionId: number;
  // Channel 名称
  channelName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      source: 'source',
      financialNo: 'financial_no',
      merchantFinancialNo: 'merchant_financial_no',
      tradeNo: 'trade_no',
      companyName: 'company_name',
      companyCode: 'company_code',
      uniCreditCode: 'uni_credit_code',
      legalPerson: 'legal_person',
      legalPersonIdNo: 'legal_person_id_no',
      companyContactPerson: 'company_contact_person',
      companyContactPhone: 'company_contact_phone',
      companyAddr: 'company_addr',
      buyerCode: 'buyer_code',
      buyerName: 'buyer_name',
      buyerUniCreditCode: 'buyer_uni_credit_code',
      buyerLegalPerson: 'buyer_legal_person',
      buyerLegalPersonIdNo: 'buyer_legal_person_id_no',
      buyerContactPerson: 'buyer_contact_person',
      buyerContactPhone: 'buyer_contact_phone',
      financingTarget: 'financing_target',
      financialAmount: 'financial_amount',
      financialPeriod: 'financial_period',
      financialRateList: 'financial_rate_list',
      penaltyRateList: 'penalty_rate_list',
      opeFeeType: 'ope_fee_type',
      opeUnitPriceList: 'ope_unit_price_list',
      cargoType: 'cargo_type',
      cargoWeight: 'cargo_weight',
      cargoUnitPrice: 'cargo_unit_price',
      cargoUnitPriceType: 'cargo_unit_price_type',
      cargoTotalPrice: 'cargo_total_price',
      applyDate: 'apply_date',
      productNo: 'product_no',
      productName: 'product_name',
      productType: 'product_type',
      authenticRightCode: 'authentic_right_code',
      authenticRightName: 'authentic_right_name',
      authenticRightStatus: 'authentic_right_status',
      authenticRightTime: 'authentic_right_time',
      storageServiceProvider: 'storage_service_provider',
      warehouseAddr: 'warehouse_addr',
      storageContactPhone: 'storage_contact_phone',
      bankInstiCode: 'bank_insti_code',
      bankInstiName: 'bank_insti_name',
      isPaySecurityDeposit: 'is_pay_security_deposit',
      securityDepositAmount: 'security_deposit_amount',
      securityDepositRate: 'security_deposit_rate',
      financingLimitAgreeNo: 'financing_limit_agree_no',
      elecCertInsti: 'elec_cert_insti',
      signDate: 'sign_date',
      factoringAgreementNo: 'factoring_agreement_no',
      sellerFactoringAccount: 'seller_factoring_account',
      serviceType: 'service_type',
      businessType: 'business_type',
      feeCollectType: 'fee_collect_type',
      interestCollectType: 'interest_collect_type',
      elecCertNo: 'elec_cert_no',
      elecCertSetUpDate: 'elec_cert_set_up_date',
      elecCertExpireDate: 'elec_cert_expire_date',
      elecCertAmount: 'elec_cert_amount',
      tradeContractInvoNo: 'trade_contract_invo_no',
      tradeContractInvoAmount: 'trade_contract_invo_amount',
      tradeContractName: 'trade_contract_name',
      tradeContractNo: 'trade_contract_no',
      tradeContractBuyerName: 'trade_contract_buyer_name',
      poundProofs: 'pound_proofs',
      storageProofs: 'storage_proofs',
      loanContract: 'loan_contract',
      purchaseContract: 'purchase_contract',
      sellContract: 'sell_contract',
      consignmentContract: 'consignment_contract',
      bussLicense: 'buss_license',
      legalPersonFront: 'legal_person_front',
      legalPersonReverse: 'legal_person_reverse',
      bankFinancialRate: 'bank_financial_rate',
      bankPenaltyRate: 'bank_penalty_rate',
      financialStatus: 'financial_status',
      cancelApplyDate: 'cancel_apply_date',
      cancelApplyDesc: 'cancel_apply_desc',
      auditor: 'auditor',
      auditDate: 'audit_date',
      auditComment: 'audit_comment',
      confirmLoanDate: 'confirm_loan_date',
      confirmLoanComment: 'confirm_loan_comment',
      confirmLoanFlag: 'confirm_loan_flag',
      contractSignTime: 'contract_sign_time',
      contractSignComment: 'contract_sign_comment',
      contractSignFlag: 'contract_sign_flag',
      userDid: 'user_did',
      unionId: 'union_id',
      channelName: 'channel_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      source: 'string',
      financialNo: 'string',
      merchantFinancialNo: 'string',
      tradeNo: 'string',
      companyName: 'string',
      companyCode: 'string',
      uniCreditCode: 'string',
      legalPerson: 'string',
      legalPersonIdNo: 'string',
      companyContactPerson: 'string',
      companyContactPhone: 'string',
      companyAddr: 'string',
      buyerCode: 'string',
      buyerName: 'string',
      buyerUniCreditCode: 'string',
      buyerLegalPerson: 'string',
      buyerLegalPersonIdNo: 'string',
      buyerContactPerson: 'string',
      buyerContactPhone: 'string',
      financingTarget: 'string',
      financialAmount: 'number',
      financialPeriod: 'number',
      financialRateList: { 'type': 'array', 'itemType': FinancialRateInfo },
      penaltyRateList: { 'type': 'array', 'itemType': PenaltyRateInfo },
      opeFeeType: 'number',
      opeUnitPriceList: { 'type': 'array', 'itemType': OpeUnitPriceInfo },
      cargoType: 'string',
      cargoWeight: 'string',
      cargoUnitPrice: 'number',
      cargoUnitPriceType: 'string',
      cargoTotalPrice: 'number',
      applyDate: 'string',
      productNo: 'string',
      productName: 'string',
      productType: 'number',
      authenticRightCode: 'string',
      authenticRightName: 'string',
      authenticRightStatus: 'number',
      authenticRightTime: 'string',
      storageServiceProvider: 'string',
      warehouseAddr: 'string',
      storageContactPhone: 'string',
      bankInstiCode: 'string',
      bankInstiName: 'string',
      isPaySecurityDeposit: 'number',
      securityDepositAmount: 'number',
      securityDepositRate: 'string',
      financingLimitAgreeNo: 'string',
      elecCertInsti: 'string',
      signDate: 'string',
      factoringAgreementNo: 'string',
      sellerFactoringAccount: 'string',
      serviceType: 'string',
      businessType: 'string',
      feeCollectType: 'string',
      interestCollectType: 'string',
      elecCertNo: 'string',
      elecCertSetUpDate: 'string',
      elecCertExpireDate: 'string',
      elecCertAmount: 'number',
      tradeContractInvoNo: 'string',
      tradeContractInvoAmount: 'number',
      tradeContractName: 'string',
      tradeContractNo: 'string',
      tradeContractBuyerName: 'string',
      poundProofs: 'string',
      storageProofs: 'string',
      loanContract: 'string',
      purchaseContract: 'string',
      sellContract: 'string',
      consignmentContract: 'string',
      bussLicense: 'string',
      legalPersonFront: 'string',
      legalPersonReverse: 'string',
      bankFinancialRate: 'string',
      bankPenaltyRate: 'string',
      financialStatus: 'number',
      cancelApplyDate: 'string',
      cancelApplyDesc: 'string',
      auditor: 'string',
      auditDate: 'string',
      auditComment: 'string',
      confirmLoanDate: 'string',
      confirmLoanComment: 'string',
      confirmLoanFlag: 'number',
      contractSignTime: 'string',
      contractSignComment: 'string',
      contractSignFlag: 'number',
      userDid: 'string',
      unionId: 'number',
      channelName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ApplyCmportFinanceResponse extends $tea.Model {
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

export class ListCmportEnterprisestatementRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // accountingDate
  accountDate: string;
  // 页码，从1开始
  pageNum: number;
  // 页大小，最大100
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountDate: 'account_date',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountDate: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCmportEnterprisestatementResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 页码
  pageNum?: number;
  // 页大小
  pageSize?: number;
  // 总页数
  totalPage?: number;
  // 总对账单
  totalStatementList?: TotalStatement[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalPage: 'total_page',
      totalStatementList: 'total_statement_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pageNum: 'number',
      pageSize: 'number',
      totalPage: 'number',
      totalStatementList: { 'type': 'array', 'itemType': TotalStatement },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCmportUserstatementRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 页码
  pageNum: number;
  // 页大小
  pageSize: number;
  // 记账日期   yyyy-mm-dd
  accountingDate: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
      accountingDate: 'accounting_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageNum: 'number',
      pageSize: 'number',
      accountingDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCmportUserstatementResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 页码
  pageNum?: number;
  // 页大小
  pageSize?: number;
  // 总页数
  totalPage?: number;
  // 用户对账单
  userStatementList?: UserStatement[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalPage: 'total_page',
      userStatementList: 'user_statement_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pageNum: 'number',
      pageSize: 'number',
      totalPage: 'number',
      userStatementList: { 'type': 'array', 'itemType': UserStatement },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCmportUserprofitRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 页码
  pageNum: number;
  // 页大小
  pageSize: number;
  // 记账日期 yyyy-mm-dd
  accountingDate: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      pageNum: 'page_num',
      pageSize: 'page_size',
      accountingDate: 'accounting_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      pageNum: 'number',
      pageSize: 'number',
      accountingDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCmportUserprofitResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 页码
  pageNum?: number;
  // 页大小
  pageSize?: number;
  // 总页数
  totalPage?: number;
  // 用户明细清单
  userBillList?: UserDetail[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalPage: 'total_page',
      userBillList: 'user_bill_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pageNum: 'number',
      pageSize: 'number',
      totalPage: 'number',
      userBillList: { 'type': 'array', 'itemType': UserDetail },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCmportBankfeeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 融资编号
  financialNo: string;
  // 记账日期 yyyy-mm-dd
  accountDate: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      financialNo: 'financial_no',
      accountDate: 'account_date',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      financialNo: 'string',
      accountDate: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class QueryCmportBankfeeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 应付银行本金
  capitalAmount?: number;
  // 应付银行利息
  interestAmount?: number;
  // 应付总金额
  totalAmount?: number;
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      capitalAmount: 'capital_amount',
      interestAmount: 'interest_amount',
      totalAmount: 'total_amount',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      capitalAmount: 'number',
      interestAmount: 'number',
      totalAmount: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCmportProfitpartnerRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 企业编号
  companyNo: string;
  // 企业名称
  companyName: string;
  // 组织类别
  organizationCategory: string;
  // 角色编号对应组织信息
  // 组织对应角色编码：
  // 风险承担方：RISK_TAKER
  // 货物监管方：CARGO_SUPERVISION
  // 资金推荐方：CAPITAL_RECOMMEND
  // 融资推荐方：FUNDER_RECOMMEND
  // 运营管理方：MANAGEMENT
  // 技术支持方：TECHNICAL
  roleOrganizationList: RoleOrganization[];
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      companyNo: 'company_no',
      companyName: 'company_name',
      organizationCategory: 'organization_category',
      roleOrganizationList: 'role_organization_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      companyNo: 'string',
      companyName: 'string',
      organizationCategory: 'string',
      roleOrganizationList: { 'type': 'array', 'itemType': RoleOrganization },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CreateCmportProfitpartnerResponse extends $tea.Model {
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

export class CancelCmportFinanceRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 平台融资编号
  financialNo: string;
  // 融资企业编码
  companyCode: string;
  // 融资企业名称
  companyName: string;
  // 撤销申请日期
  cancelApplyDate: string;
  // 撤销申请描述
  cancelApplyDesc: string;
  //  融资状态:
  // 10->待确权;20->待审核;30->待签署;40->待放款;50->待还款;51->还款撤销;52->还款中;60->已还款;70->审核不通过;80->已融资撤销
  financialStatus: number;
  // 上链账户
  userDid: string;
  // 联盟id
  unionId: number;
  // Channel 名称
  channelName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      financialNo: 'financial_no',
      companyCode: 'company_code',
      companyName: 'company_name',
      cancelApplyDate: 'cancel_apply_date',
      cancelApplyDesc: 'cancel_apply_desc',
      financialStatus: 'financial_status',
      userDid: 'user_did',
      unionId: 'union_id',
      channelName: 'channel_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      financialNo: 'string',
      companyCode: 'string',
      companyName: 'string',
      cancelApplyDate: 'string',
      cancelApplyDesc: 'string',
      financialStatus: 'number',
      userDid: 'string',
      unionId: 'number',
      channelName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class CancelCmportFinanceResponse extends $tea.Model {
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

export class NotifyCmportBankRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 平台融资编号
  financialNo: string;
  // 审核人
  auditor: string;
  // 审核时间
  auditDate: string;
  // 审核评论
  auditComment: string;
  // 融资状态:
  // 10->待确权;20->待审核;30->待签署;40->待放款;50->待还款;51->还款撤销;52->还款中;60->已还款;70->审核不通过;80->已融资撤销
  financialStatus: number;
  // 上链账户
  userDid: string;
  // 联盟id
  unionId: number;
  // Channel 名称
  channelName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      financialNo: 'financial_no',
      auditor: 'auditor',
      auditDate: 'audit_date',
      auditComment: 'audit_comment',
      financialStatus: 'financial_status',
      userDid: 'user_did',
      unionId: 'union_id',
      channelName: 'channel_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      financialNo: 'string',
      auditor: 'string',
      auditDate: 'string',
      auditComment: 'string',
      financialStatus: 'number',
      userDid: 'string',
      unionId: 'number',
      channelName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyCmportBankResponse extends $tea.Model {
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

export class NotifyCmportLoanRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 平台融资编号
  financialNo: string;
  // 确认放款日期
  confirmLoanDate: string;
  // 放款描述
  confirmLoanComment: string;
  // 流程标记： 1->流程通过;2->流程打回到上一级;3->直接拒绝
  confirmLoanFlag: number;
  //  融资状态:
  // 10->待确权;20->待审核;30->待签署;40->待放款;50->待还款;51->还款撤销;52->还款中;60->已还款;70->审核不通过;80->已融资撤销
  financialStatus: number;
  // 上链账户
  userDid: string;
  // 联盟id
  unionId: number;
  // Channel 名称
  channelName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      financialNo: 'financial_no',
      confirmLoanDate: 'confirm_loan_date',
      confirmLoanComment: 'confirm_loan_comment',
      confirmLoanFlag: 'confirm_loan_flag',
      financialStatus: 'financial_status',
      userDid: 'user_did',
      unionId: 'union_id',
      channelName: 'channel_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      financialNo: 'string',
      confirmLoanDate: 'string',
      confirmLoanComment: 'string',
      confirmLoanFlag: 'number',
      financialStatus: 'number',
      userDid: 'string',
      unionId: 'number',
      channelName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyCmportLoanResponse extends $tea.Model {
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

export class NotifyCmportRepayRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 平台融资编号
  financialNo: string;
  // 还款编号
  repayNo: string;
  // 融资企业名称
  companyName: string;
  // 融资企业编码
  companyCode: string;
  // 产品编号
  productNo: string;
  // 产品名称
  productName: string;
  // 还款金额，一期一次性全部还款，加上利息
  totalAmount: number;
  // 还款银行
  repayBank: string;
  // 还款银行账号
  repayBankAccount: string;
  //  融资状态:
  // 10->待确权;20->待审核;30->待签署;40->待放款;50->待还款;51->还款撤销;52->还款中;60->已还款;70->审核不通过;80->已融资撤销
  financialStatus: number;
  // 还款日期
  repayDate: string;
  // 上链账户
  userDid: string;
  // 联盟id
  unionId: number;
  // Channel 名称
  channelName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      financialNo: 'financial_no',
      repayNo: 'repay_no',
      companyName: 'company_name',
      companyCode: 'company_code',
      productNo: 'product_no',
      productName: 'product_name',
      totalAmount: 'total_amount',
      repayBank: 'repay_bank',
      repayBankAccount: 'repay_bank_account',
      financialStatus: 'financial_status',
      repayDate: 'repay_date',
      userDid: 'user_did',
      unionId: 'union_id',
      channelName: 'channel_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      financialNo: 'string',
      repayNo: 'string',
      companyName: 'string',
      companyCode: 'string',
      productNo: 'string',
      productName: 'string',
      totalAmount: 'number',
      repayBank: 'string',
      repayBankAccount: 'string',
      financialStatus: 'number',
      repayDate: 'string',
      userDid: 'string',
      unionId: 'number',
      channelName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyCmportRepayResponse extends $tea.Model {
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

export class ListCmportBankfeeRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // accountingDate
  accountDate: string;
  // 页码，从1开始
  pageNum: number;
  // 页大小，最大100
  pageSize: number;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      accountDate: 'account_date',
      pageNum: 'page_num',
      pageSize: 'page_size',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      accountDate: 'string',
      pageNum: 'number',
      pageSize: 'number',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class ListCmportBankfeeResponse extends $tea.Model {
  // 请求唯一ID，用于链路跟踪和问题排查
  reqMsgId?: string;
  // 结果码，一般OK表示调用成功
  resultCode?: string;
  // 异常信息的文本描述
  resultMsg?: string;
  // 页码
  pageNum?: number;
  // 页大小
  pageSize?: number;
  // 总页数
  totalPage?: number;
  // 返回还款利息列表
  bankFeeList?: BankFee[];
  static names(): { [key: string]: string } {
    return {
      reqMsgId: 'req_msg_id',
      resultCode: 'result_code',
      resultMsg: 'result_msg',
      pageNum: 'page_num',
      pageSize: 'page_size',
      totalPage: 'total_page',
      bankFeeList: 'bank_fee_list',
    };
  }

  static types(): { [key: string]: any } {
    return {
      reqMsgId: 'string',
      resultCode: 'string',
      resultMsg: 'string',
      pageNum: 'number',
      pageSize: 'number',
      totalPage: 'number',
      bankFeeList: { 'type': 'array', 'itemType': BankFee },
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyCmportLogisticsRequest extends $tea.Model {
  // OAuth模式下的授权token
  authToken?: string;
  productInstanceId?: string;
  // 融资编号 	
  // 
  financialNo: string;
  // 货权编号	
  // 
  cargoRightNo: string;
  // 获物品名	
  // 
  goodsTypeName: string;
  // 运输条款	
  // 
  transitClause: string;
  // 箱子数量	
  // 
  boxNum: number;
  // 箱型	
  // 
  boxType?: string;
  // 运单信息详情列表	
  orderInfoList: OrderInfo[];
  // 上链账户
  userDid: string;
  // 联盟id
  unionId: number;
  // 渠道名称
  channelName: string;
  static names(): { [key: string]: string } {
    return {
      authToken: 'auth_token',
      productInstanceId: 'product_instance_id',
      financialNo: 'financial_no',
      cargoRightNo: 'cargo_right_no',
      goodsTypeName: 'goods_type_name',
      transitClause: 'transit_clause',
      boxNum: 'box_num',
      boxType: 'box_type',
      orderInfoList: 'order_info_list',
      userDid: 'user_did',
      unionId: 'union_id',
      channelName: 'channel_name',
    };
  }

  static types(): { [key: string]: any } {
    return {
      authToken: 'string',
      productInstanceId: 'string',
      financialNo: 'string',
      cargoRightNo: 'string',
      goodsTypeName: 'string',
      transitClause: 'string',
      boxNum: 'number',
      boxType: 'string',
      orderInfoList: { 'type': 'array', 'itemType': OrderInfo },
      userDid: 'string',
      unionId: 'number',
      channelName: 'string',
    };
  }

  constructor(map?: { [key: string]: any }) {
    super(map);
  }
}

export class NotifyCmportLogisticsResponse extends $tea.Model {
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
          sdk_version: "1.0.44",
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
   * Description: 用户注册
   * Summary: 用户注册
   */
  async createUser(request: CreateUserRequest): Promise<CreateUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createUserEx(request, headers, runtime);
  }

  /**
   * Description: 用户注册
   * Summary: 用户注册
   */
  async createUserEx(request: CreateUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateUserResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateUserResponse>(await this.doRequest("1.0", "blockchain.propertychain.user.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateUserResponse({}));
  }

  /**
   * Description: 物权凭证转让/赠送
   * Summary: 物权凭证转让/赠送
   */
  async createTransfer(request: CreateTransferRequest): Promise<CreateTransferResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createTransferEx(request, headers, runtime);
  }

  /**
   * Description: 物权凭证转让/赠送
   * Summary: 物权凭证转让/赠送
   */
  async createTransferEx(request: CreateTransferRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateTransferResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTransferResponse>(await this.doRequest("1.0", "blockchain.propertychain.transfer.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateTransferResponse({}));
  }

  /**
   * Description: 创建提取码
   * Summary: 创建提取码
   */
  async createPickup(request: CreatePickupRequest): Promise<CreatePickupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createPickupEx(request, headers, runtime);
  }

  /**
   * Description: 创建提取码
   * Summary: 创建提取码
   */
  async createPickupEx(request: CreatePickupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreatePickupResponse> {
    Util.validateModel(request);
    return $tea.cast<CreatePickupResponse>(await this.doRequest("1.0", "blockchain.propertychain.pickup.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreatePickupResponse({}));
  }

  /**
   * Description: 销毁提取码
   * Summary: 销毁提取码
   */
  async cancelPickup(request: CancelPickupRequest): Promise<CancelPickupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelPickupEx(request, headers, runtime);
  }

  /**
   * Description: 销毁提取码
   * Summary: 销毁提取码
   */
  async cancelPickupEx(request: CancelPickupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelPickupResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelPickupResponse>(await this.doRequest("1.0", "blockchain.propertychain.pickup.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelPickupResponse({}));
  }

  /**
   * Description: 核销提取码
   * Summary: 核销提取码
   */
  async disablePickup(request: DisablePickupRequest): Promise<DisablePickupResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.disablePickupEx(request, headers, runtime);
  }

  /**
   * Description: 核销提取码
   * Summary: 核销提取码
   */
  async disablePickupEx(request: DisablePickupRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DisablePickupResponse> {
    Util.validateModel(request);
    return $tea.cast<DisablePickupResponse>(await this.doRequest("1.0", "blockchain.propertychain.pickup.disable", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DisablePickupResponse({}));
  }

  /**
   * Description: 创建联盟
   * Summary: 创建联盟
   */
  async createLeague(request: CreateLeagueRequest): Promise<CreateLeagueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeagueEx(request, headers, runtime);
  }

  /**
   * Description: 创建联盟
   * Summary: 创建联盟
   */
  async createLeagueEx(request: CreateLeagueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeagueResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeagueResponse>(await this.doRequest("1.0", "blockchain.propertychain.league.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeagueResponse({}));
  }

  /**
   * Description: 加入联盟
   * Summary: 加入联盟
   */
  async addLeague(request: AddLeagueRequest): Promise<AddLeagueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.addLeagueEx(request, headers, runtime);
  }

  /**
   * Description: 加入联盟
   * Summary: 加入联盟
   */
  async addLeagueEx(request: AddLeagueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AddLeagueResponse> {
    Util.validateModel(request);
    return $tea.cast<AddLeagueResponse>(await this.doRequest("1.0", "blockchain.propertychain.league.add", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AddLeagueResponse({}));
  }

  /**
   * Description: 审核加入联盟
   * Summary: 审核加入联盟
   */
  async confirmLeague(request: ConfirmLeagueRequest): Promise<ConfirmLeagueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.confirmLeagueEx(request, headers, runtime);
  }

  /**
   * Description: 审核加入联盟
   * Summary: 审核加入联盟
   */
  async confirmLeagueEx(request: ConfirmLeagueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ConfirmLeagueResponse> {
    Util.validateModel(request);
    return $tea.cast<ConfirmLeagueResponse>(await this.doRequest("1.0", "blockchain.propertychain.league.confirm", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ConfirmLeagueResponse({}));
  }

  /**
   * Description: 查询联盟
   * Summary: 查询联盟
   */
  async queryLeague(request: QueryLeagueRequest): Promise<QueryLeagueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryLeagueEx(request, headers, runtime);
  }

  /**
   * Description: 查询联盟
   * Summary: 查询联盟
   */
  async queryLeagueEx(request: QueryLeagueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryLeagueResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryLeagueResponse>(await this.doRequest("1.0", "blockchain.propertychain.league.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryLeagueResponse({}));
  }

  /**
   * Description: 创建资产信息
   * Summary: 创建资产信息
   */
  async createImportasset(request: CreateImportassetRequest): Promise<CreateImportassetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createImportassetEx(request, headers, runtime);
  }

  /**
   * Description: 创建资产信息
   * Summary: 创建资产信息
   */
  async createImportassetEx(request: CreateImportassetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateImportassetResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateImportassetResponse>(await this.doRequest("1.0", "blockchain.propertychain.importasset.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateImportassetResponse({}));
  }

  /**
   * Description: 更新物权
   * Summary: 更新物权
   */
  async updateImportasset(request: UpdateImportassetRequest): Promise<UpdateImportassetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateImportassetEx(request, headers, runtime);
  }

  /**
   * Description: 更新物权
   * Summary: 更新物权
   */
  async updateImportassetEx(request: UpdateImportassetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateImportassetResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateImportassetResponse>(await this.doRequest("1.0", "blockchain.propertychain.importasset.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateImportassetResponse({}));
  }

  /**
   * Description: 注销物权
   * Summary: 注销物权
   */
  async cancelImportasset(request: CancelImportassetRequest): Promise<CancelImportassetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelImportassetEx(request, headers, runtime);
  }

  /**
   * Description: 注销物权
   * Summary: 注销物权
   */
  async cancelImportassetEx(request: CancelImportassetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelImportassetResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelImportassetResponse>(await this.doRequest("1.0", "blockchain.propertychain.importasset.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelImportassetResponse({}));
  }

  /**
   * Description: 冻结物权
   * Summary: 冻结物权
   */
  async freezeImportasset(request: FreezeImportassetRequest): Promise<FreezeImportassetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.freezeImportassetEx(request, headers, runtime);
  }

  /**
   * Description: 冻结物权
   * Summary: 冻结物权
   */
  async freezeImportassetEx(request: FreezeImportassetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<FreezeImportassetResponse> {
    Util.validateModel(request);
    return $tea.cast<FreezeImportassetResponse>(await this.doRequest("1.0", "blockchain.propertychain.importasset.freeze", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new FreezeImportassetResponse({}));
  }

  /**
   * Description: 解冻物权
   * Summary: 解冻物权
   */
  async unfreezeImportasset(request: UnfreezeImportassetRequest): Promise<UnfreezeImportassetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.unfreezeImportassetEx(request, headers, runtime);
  }

  /**
   * Description: 解冻物权
   * Summary: 解冻物权
   */
  async unfreezeImportassetEx(request: UnfreezeImportassetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UnfreezeImportassetResponse> {
    Util.validateModel(request);
    return $tea.cast<UnfreezeImportassetResponse>(await this.doRequest("1.0", "blockchain.propertychain.importasset.unfreeze", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UnfreezeImportassetResponse({}));
  }

  /**
   * Description: 查询物权
   * Summary: 查询物权
   */
  async queryImportasset(request: QueryImportassetRequest): Promise<QueryImportassetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryImportassetEx(request, headers, runtime);
  }

  /**
   * Description: 查询物权
   * Summary: 查询物权
   */
  async queryImportassetEx(request: QueryImportassetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryImportassetResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryImportassetResponse>(await this.doRequest("1.0", "blockchain.propertychain.importasset.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryImportassetResponse({}));
  }

  /**
   * Description: 物权列表
   * Summary: 物权列表
   */
  async allImportasset(request: AllImportassetRequest): Promise<AllImportassetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allImportassetEx(request, headers, runtime);
  }

  /**
   * Description: 物权列表
   * Summary: 物权列表
   */
  async allImportassetEx(request: AllImportassetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllImportassetResponse> {
    Util.validateModel(request);
    return $tea.cast<AllImportassetResponse>(await this.doRequest("1.0", "blockchain.propertychain.importasset.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllImportassetResponse({}));
  }

  /**
   * Description: 批量查询溯源信息
   * Summary: 批量查询溯源信息
   */
  async batchqueryImportasset(request: BatchqueryImportassetRequest): Promise<BatchqueryImportassetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryImportassetEx(request, headers, runtime);
  }

  /**
   * Description: 批量查询溯源信息
   * Summary: 批量查询溯源信息
   */
  async batchqueryImportassetEx(request: BatchqueryImportassetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryImportassetResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryImportassetResponse>(await this.doRequest("1.0", "blockchain.propertychain.importasset.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryImportassetResponse({}));
  }

  /**
   * Description: 创建数据字典
   * Summary: 创建数据字典
   */
  async createTemplate(request: CreateTemplateRequest): Promise<CreateTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 创建数据字典
   * Summary: 创建数据字典
   */
  async createTemplateEx(request: CreateTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateTemplateResponse>(await this.doRequest("1.0", "blockchain.propertychain.template.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateTemplateResponse({}));
  }

  /**
   * Description: 更新数据字典
   * Summary: 更新数据字典
   */
  async updateTemplate(request: UpdateTemplateRequest): Promise<UpdateTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 更新数据字典
   * Summary: 更新数据字典
   */
  async updateTemplateEx(request: UpdateTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateTemplateResponse>(await this.doRequest("1.0", "blockchain.propertychain.template.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateTemplateResponse({}));
  }

  /**
   * Description: 查询数据字典
   * Summary: 查询数据字典
   */
  async queryTemplate(request: QueryTemplateRequest): Promise<QueryTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 查询数据字典
   * Summary: 查询数据字典
   */
  async queryTemplateEx(request: QueryTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryTemplateResponse>(await this.doRequest("1.0", "blockchain.propertychain.template.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryTemplateResponse({}));
  }

  /**
   * Description: 数据字典列表信息
   * Summary: 数据字典列表信息
   */
  async allTemplate(request: AllTemplateRequest): Promise<AllTemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.allTemplateEx(request, headers, runtime);
  }

  /**
   * Description: 数据字典列表信息
   * Summary: 数据字典列表信息
   */
  async allTemplateEx(request: AllTemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AllTemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<AllTemplateResponse>(await this.doRequest("1.0", "blockchain.propertychain.template.all", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AllTemplateResponse({}));
  }

  /**
   * Description: 创建验权码
   * Summary: 创建验权码
   */
  async createCheckcode(request: CreateCheckcodeRequest): Promise<CreateCheckcodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCheckcodeEx(request, headers, runtime);
  }

  /**
   * Description: 创建验权码
   * Summary: 创建验权码
   */
  async createCheckcodeEx(request: CreateCheckcodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCheckcodeResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCheckcodeResponse>(await this.doRequest("1.0", "blockchain.propertychain.checkcode.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCheckcodeResponse({}));
  }

  /**
   * Description: 校验验权码
   * Summary: 校验验权码
   */
  async checkCheckcode(request: CheckCheckcodeRequest): Promise<CheckCheckcodeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.checkCheckcodeEx(request, headers, runtime);
  }

  /**
   * Description: 校验验权码
   * Summary: 校验验权码
   */
  async checkCheckcodeEx(request: CheckCheckcodeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CheckCheckcodeResponse> {
    Util.validateModel(request);
    return $tea.cast<CheckCheckcodeResponse>(await this.doRequest("1.0", "blockchain.propertychain.checkcode.check", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CheckCheckcodeResponse({}));
  }

  /**
   * Description: 创建质押申请
   * Summary: 创建质押申请
   */
  async createAssetpledge(request: CreateAssetpledgeRequest): Promise<CreateAssetpledgeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAssetpledgeEx(request, headers, runtime);
  }

  /**
   * Description: 创建质押申请
   * Summary: 创建质押申请
   */
  async createAssetpledgeEx(request: CreateAssetpledgeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAssetpledgeResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAssetpledgeResponse>(await this.doRequest("1.0", "blockchain.propertychain.assetpledge.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAssetpledgeResponse({}));
  }

  /**
   * Description: 质押放款
   * Summary: 质押放款
   */
  async releaseAssetpledge(request: ReleaseAssetpledgeRequest): Promise<ReleaseAssetpledgeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.releaseAssetpledgeEx(request, headers, runtime);
  }

  /**
   * Description: 质押放款
   * Summary: 质押放款
   */
  async releaseAssetpledgeEx(request: ReleaseAssetpledgeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ReleaseAssetpledgeResponse> {
    Util.validateModel(request);
    return $tea.cast<ReleaseAssetpledgeResponse>(await this.doRequest("1.0", "blockchain.propertychain.assetpledge.release", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ReleaseAssetpledgeResponse({}));
  }

  /**
   * Description: 质押还款
   * Summary: 质押还款
   */
  async repayAssetpledge(request: RepayAssetpledgeRequest): Promise<RepayAssetpledgeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.repayAssetpledgeEx(request, headers, runtime);
  }

  /**
   * Description: 质押还款
   * Summary: 质押还款
   */
  async repayAssetpledgeEx(request: RepayAssetpledgeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<RepayAssetpledgeResponse> {
    Util.validateModel(request);
    return $tea.cast<RepayAssetpledgeResponse>(await this.doRequest("1.0", "blockchain.propertychain.assetpledge.repay", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new RepayAssetpledgeResponse({}));
  }

  /**
   * Description: 查询账户信息
   * Summary: 查询账户信息
   */
  async getLeagueAccountinfo(request: GetLeagueAccountinfoRequest): Promise<GetLeagueAccountinfoResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getLeagueAccountinfoEx(request, headers, runtime);
  }

  /**
   * Description: 查询账户信息
   * Summary: 查询账户信息
   */
  async getLeagueAccountinfoEx(request: GetLeagueAccountinfoRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetLeagueAccountinfoResponse> {
    Util.validateModel(request);
    return $tea.cast<GetLeagueAccountinfoResponse>(await this.doRequest("1.0", "blockchain.propertychain.league.accountinfo.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetLeagueAccountinfoResponse({}));
  }

  /**
   * Description: 登记仓库
   * Summary: 登记仓库
   */
  async createWarehouse(request: CreateWarehouseRequest): Promise<CreateWarehouseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createWarehouseEx(request, headers, runtime);
  }

  /**
   * Description: 登记仓库
   * Summary: 登记仓库
   */
  async createWarehouseEx(request: CreateWarehouseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateWarehouseResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateWarehouseResponse>(await this.doRequest("1.0", "blockchain.propertychain.warehouse.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateWarehouseResponse({}));
  }

  /**
   * Description: 例举角色类型
   * Summary: 例举角色类型
   */
  async listLeagueRole(request: ListLeagueRoleRequest): Promise<ListLeagueRoleResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listLeagueRoleEx(request, headers, runtime);
  }

  /**
   * Description: 例举角色类型
   * Summary: 例举角色类型
   */
  async listLeagueRoleEx(request: ListLeagueRoleRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListLeagueRoleResponse> {
    Util.validateModel(request);
    return $tea.cast<ListLeagueRoleResponse>(await this.doRequest("1.0", "blockchain.propertychain.league.role.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListLeagueRoleResponse({}));
  }

  /**
   * Description: 查询仓库详细信息
   * Summary: 查询仓库详细信息
   */
  async getWarehouse(request: GetWarehouseRequest): Promise<GetWarehouseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getWarehouseEx(request, headers, runtime);
  }

  /**
   * Description: 查询仓库详细信息
   * Summary: 查询仓库详细信息
   */
  async getWarehouseEx(request: GetWarehouseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetWarehouseResponse> {
    Util.validateModel(request);
    return $tea.cast<GetWarehouseResponse>(await this.doRequest("1.0", "blockchain.propertychain.warehouse.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetWarehouseResponse({}));
  }

  /**
   * Description: 更新库存信息
   * Summary: 更新库存信息
   */
  async updateWarehouse(request: UpdateWarehouseRequest): Promise<UpdateWarehouseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateWarehouseEx(request, headers, runtime);
  }

  /**
   * Description: 更新库存信息
   * Summary: 更新库存信息
   */
  async updateWarehouseEx(request: UpdateWarehouseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateWarehouseResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateWarehouseResponse>(await this.doRequest("1.0", "blockchain.propertychain.warehouse.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateWarehouseResponse({}));
  }

  /**
   * Description: 列举用户仓库列表
   * Summary: 列举用户仓库列表
   */
  async listWarehouse(request: ListWarehouseRequest): Promise<ListWarehouseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listWarehouseEx(request, headers, runtime);
  }

  /**
   * Description: 列举用户仓库列表
   * Summary: 列举用户仓库列表
   */
  async listWarehouseEx(request: ListWarehouseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListWarehouseResponse> {
    Util.validateModel(request);
    return $tea.cast<ListWarehouseResponse>(await this.doRequest("1.0", "blockchain.propertychain.warehouse.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListWarehouseResponse({}));
  }

  /**
   * Description: 例举联盟
   * Summary: 例举联盟
   */
  async listLeague(request: ListLeagueRequest): Promise<ListLeagueResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listLeagueEx(request, headers, runtime);
  }

  /**
   * Description: 例举联盟
   * Summary: 例举联盟
   */
  async listLeagueEx(request: ListLeagueRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListLeagueResponse> {
    Util.validateModel(request);
    return $tea.cast<ListLeagueResponse>(await this.doRequest("1.0", "blockchain.propertychain.league.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListLeagueResponse({}));
  }

  /**
   * Description: 列举某个仓库/仓位下的设备信息
   * Summary: 列举某个仓库/仓位下的设备信息
   */
  async queryWarehouseDevice(request: QueryWarehouseDeviceRequest): Promise<QueryWarehouseDeviceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryWarehouseDeviceEx(request, headers, runtime);
  }

  /**
   * Description: 列举某个仓库/仓位下的设备信息
   * Summary: 列举某个仓库/仓位下的设备信息
   */
  async queryWarehouseDeviceEx(request: QueryWarehouseDeviceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryWarehouseDeviceResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryWarehouseDeviceResponse>(await this.doRequest("1.0", "blockchain.propertychain.warehouse.device.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryWarehouseDeviceResponse({}));
  }

  /**
   * Description: 创建联盟申请
   * Summary: 创建联盟申请
   */
  async createLeagueApply(request: CreateLeagueApplyRequest): Promise<CreateLeagueApplyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeagueApplyEx(request, headers, runtime);
  }

  /**
   * Description: 创建联盟申请
   * Summary: 创建联盟申请
   */
  async createLeagueApplyEx(request: CreateLeagueApplyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeagueApplyResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeagueApplyResponse>(await this.doRequest("1.0", "blockchain.propertychain.league.apply.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeagueApplyResponse({}));
  }

  /**
   * Description: 提交入盟申请
   * Summary: 提交入盟申请
   */
  async createLeagueJoinapply(request: CreateLeagueJoinapplyRequest): Promise<CreateLeagueJoinapplyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createLeagueJoinapplyEx(request, headers, runtime);
  }

  /**
   * Description: 提交入盟申请
   * Summary: 提交入盟申请
   */
  async createLeagueJoinapplyEx(request: CreateLeagueJoinapplyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateLeagueJoinapplyResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateLeagueJoinapplyResponse>(await this.doRequest("1.0", "blockchain.propertychain.league.joinapply.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateLeagueJoinapplyResponse({}));
  }

  /**
   * Description: 撤销入盟申请
   * Summary: 撤销入盟申请
   */
  async cancelLeagueApply(request: CancelLeagueApplyRequest): Promise<CancelLeagueApplyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelLeagueApplyEx(request, headers, runtime);
  }

  /**
   * Description: 撤销入盟申请
   * Summary: 撤销入盟申请
   */
  async cancelLeagueApplyEx(request: CancelLeagueApplyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelLeagueApplyResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelLeagueApplyResponse>(await this.doRequest("1.0", "blockchain.propertychain.league.apply.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelLeagueApplyResponse({}));
  }

  /**
   * Description: 列举仓库下的库位列表
   * Summary: 列举仓库下的库位列表
   */
  async queryWarehouseStoragelocation(request: QueryWarehouseStoragelocationRequest): Promise<QueryWarehouseStoragelocationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryWarehouseStoragelocationEx(request, headers, runtime);
  }

  /**
   * Description: 列举仓库下的库位列表
   * Summary: 列举仓库下的库位列表
   */
  async queryWarehouseStoragelocationEx(request: QueryWarehouseStoragelocationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryWarehouseStoragelocationResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryWarehouseStoragelocationResponse>(await this.doRequest("1.0", "blockchain.propertychain.warehouse.storagelocation.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryWarehouseStoragelocationResponse({}));
  }

  /**
   * Description: 盟主审核入盟申请
   * Summary: 盟主审核入盟申请
   */
  async authLeagueApply(request: AuthLeagueApplyRequest): Promise<AuthLeagueApplyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.authLeagueApplyEx(request, headers, runtime);
  }

  /**
   * Description: 盟主审核入盟申请
   * Summary: 盟主审核入盟申请
   */
  async authLeagueApplyEx(request: AuthLeagueApplyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<AuthLeagueApplyResponse> {
    Util.validateModel(request);
    return $tea.cast<AuthLeagueApplyResponse>(await this.doRequest("1.0", "blockchain.propertychain.league.apply.auth", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new AuthLeagueApplyResponse({}));
  }

  /**
   * Description: 删除仓库
   * Summary: 删除仓库
   */
  async deleteWarehouse(request: DeleteWarehouseRequest): Promise<DeleteWarehouseResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteWarehouseEx(request, headers, runtime);
  }

  /**
   * Description: 删除仓库
   * Summary: 删除仓库
   */
  async deleteWarehouseEx(request: DeleteWarehouseRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteWarehouseResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteWarehouseResponse>(await this.doRequest("1.0", "blockchain.propertychain.warehouse.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteWarehouseResponse({}));
  }

  /**
   * Description: 例举入盟申请
   * Summary: 例举入盟申请
   */
  async listLeagueApply(request: ListLeagueApplyRequest): Promise<ListLeagueApplyResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listLeagueApplyEx(request, headers, runtime);
  }

  /**
   * Description: 例举入盟申请
   * Summary: 例举入盟申请
   */
  async listLeagueApplyEx(request: ListLeagueApplyRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListLeagueApplyResponse> {
    Util.validateModel(request);
    return $tea.cast<ListLeagueApplyResponse>(await this.doRequest("1.0", "blockchain.propertychain.league.apply.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListLeagueApplyResponse({}));
  }

  /**
   * Description: 登记库位信息
   * Summary: 登记库位信息
   */
  async createWarehouseStoraglocation(request: CreateWarehouseStoraglocationRequest): Promise<CreateWarehouseStoraglocationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createWarehouseStoraglocationEx(request, headers, runtime);
  }

  /**
   * Description: 登记库位信息
   * Summary: 登记库位信息
   */
  async createWarehouseStoraglocationEx(request: CreateWarehouseStoraglocationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateWarehouseStoraglocationResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateWarehouseStoraglocationResponse>(await this.doRequest("1.0", "blockchain.propertychain.warehouse.storaglocation.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateWarehouseStoraglocationResponse({}));
  }

  /**
   * Description: 查询库位详细信息
   * Summary: 查询库位详细信息
   */
  async getWarehouseStoragelocation(request: GetWarehouseStoragelocationRequest): Promise<GetWarehouseStoragelocationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getWarehouseStoragelocationEx(request, headers, runtime);
  }

  /**
   * Description: 查询库位详细信息
   * Summary: 查询库位详细信息
   */
  async getWarehouseStoragelocationEx(request: GetWarehouseStoragelocationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetWarehouseStoragelocationResponse> {
    Util.validateModel(request);
    return $tea.cast<GetWarehouseStoragelocationResponse>(await this.doRequest("1.0", "blockchain.propertychain.warehouse.storagelocation.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetWarehouseStoragelocationResponse({}));
  }

  /**
   * Description:  更新库位信息
   * Summary:  更新库位信息
   */
  async updateWarehouseStoragelocation(request: UpdateWarehouseStoragelocationRequest): Promise<UpdateWarehouseStoragelocationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateWarehouseStoragelocationEx(request, headers, runtime);
  }

  /**
   * Description:  更新库位信息
   * Summary:  更新库位信息
   */
  async updateWarehouseStoragelocationEx(request: UpdateWarehouseStoragelocationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateWarehouseStoragelocationResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateWarehouseStoragelocationResponse>(await this.doRequest("1.0", "blockchain.propertychain.warehouse.storagelocation.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateWarehouseStoragelocationResponse({}));
  }

  /**
   * Description: 列举用户库位列表
   * Summary: 列举用户库位列表
   */
  async batchqueryWarehouseStoragelocation(request: BatchqueryWarehouseStoragelocationRequest): Promise<BatchqueryWarehouseStoragelocationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchqueryWarehouseStoragelocationEx(request, headers, runtime);
  }

  /**
   * Description: 列举用户库位列表
   * Summary: 列举用户库位列表
   */
  async batchqueryWarehouseStoragelocationEx(request: BatchqueryWarehouseStoragelocationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchqueryWarehouseStoragelocationResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchqueryWarehouseStoragelocationResponse>(await this.doRequest("1.0", "blockchain.propertychain.warehouse.storagelocation.batchquery", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchqueryWarehouseStoragelocationResponse({}));
  }

  /**
   * Description: 列举仓库下某状态的库位列表
   * Summary: 列举仓库下某状态的库位列表
   */
  async listWarehouseStoragelocation(request: ListWarehouseStoragelocationRequest): Promise<ListWarehouseStoragelocationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listWarehouseStoragelocationEx(request, headers, runtime);
  }

  /**
   * Description: 列举仓库下某状态的库位列表
   * Summary: 列举仓库下某状态的库位列表
   */
  async listWarehouseStoragelocationEx(request: ListWarehouseStoragelocationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListWarehouseStoragelocationResponse> {
    Util.validateModel(request);
    return $tea.cast<ListWarehouseStoragelocationResponse>(await this.doRequest("1.0", "blockchain.propertychain.warehouse.storagelocation.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListWarehouseStoragelocationResponse({}));
  }

  /**
   * Description: 删除库位
   * Summary: 删除库位
   */
  async deleteWarehouseStoragelocation(request: DeleteWarehouseStoragelocationRequest): Promise<DeleteWarehouseStoragelocationResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteWarehouseStoragelocationEx(request, headers, runtime);
  }

  /**
   * Description: 删除库位
   * Summary: 删除库位
   */
  async deleteWarehouseStoragelocationEx(request: DeleteWarehouseStoragelocationRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteWarehouseStoragelocationResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteWarehouseStoragelocationResponse>(await this.doRequest("1.0", "blockchain.propertychain.warehouse.storagelocation.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteWarehouseStoragelocationResponse({}));
  }

  /**
   * Description: 创建数据字典
   * Summary: 创建数据字典
   */
  async createAssettemplate(request: CreateAssettemplateRequest): Promise<CreateAssettemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createAssettemplateEx(request, headers, runtime);
  }

  /**
   * Description: 创建数据字典
   * Summary: 创建数据字典
   */
  async createAssettemplateEx(request: CreateAssettemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateAssettemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateAssettemplateResponse>(await this.doRequest("1.0", "blockchain.propertychain.assettemplate.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateAssettemplateResponse({}));
  }

  /**
   * Description: 更新数据字典
   * Summary: 更新数据字典
   */
  async updateAssettemplate(request: UpdateAssettemplateRequest): Promise<UpdateAssettemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateAssettemplateEx(request, headers, runtime);
  }

  /**
   * Description: 更新数据字典
   * Summary: 更新数据字典
   */
  async updateAssettemplateEx(request: UpdateAssettemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateAssettemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateAssettemplateResponse>(await this.doRequest("1.0", "blockchain.propertychain.assettemplate.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateAssettemplateResponse({}));
  }

  /**
   * Description: 查询数据字典
   * Summary: 查询数据字典
   */
  async getAssettemplate(request: GetAssettemplateRequest): Promise<GetAssettemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getAssettemplateEx(request, headers, runtime);
  }

  /**
   * Description: 查询数据字典
   * Summary: 查询数据字典
   */
  async getAssettemplateEx(request: GetAssettemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetAssettemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<GetAssettemplateResponse>(await this.doRequest("1.0", "blockchain.propertychain.assettemplate.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetAssettemplateResponse({}));
  }

  /**
   * Description: 列举数据字典
   * Summary: 列举数据字典
   */
  async listAssettemplate(request: ListAssettemplateRequest): Promise<ListAssettemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listAssettemplateEx(request, headers, runtime);
  }

  /**
   * Description: 列举数据字典
   * Summary: 列举数据字典
   */
  async listAssettemplateEx(request: ListAssettemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListAssettemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<ListAssettemplateResponse>(await this.doRequest("1.0", "blockchain.propertychain.assettemplate.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListAssettemplateResponse({}));
  }

  /**
   * Description: 删除数据字典
   * Summary: 删除数据字典
   */
  async deleteAssettemplate(request: DeleteAssettemplateRequest): Promise<DeleteAssettemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.deleteAssettemplateEx(request, headers, runtime);
  }

  /**
   * Description: 删除数据字典
   * Summary: 删除数据字典
   */
  async deleteAssettemplateEx(request: DeleteAssettemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DeleteAssettemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<DeleteAssettemplateResponse>(await this.doRequest("1.0", "blockchain.propertychain.assettemplate.delete", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DeleteAssettemplateResponse({}));
  }

  /**
   * Description: 生效/失效数据字典
   * Summary: 生效/失效数据字典
   */
  async enableAssettemplate(request: EnableAssettemplateRequest): Promise<EnableAssettemplateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.enableAssettemplateEx(request, headers, runtime);
  }

  /**
   * Description: 生效/失效数据字典
   * Summary: 生效/失效数据字典
   */
  async enableAssettemplateEx(request: EnableAssettemplateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<EnableAssettemplateResponse> {
    Util.validateModel(request);
    return $tea.cast<EnableAssettemplateResponse>(await this.doRequest("1.0", "blockchain.propertychain.assettemplate.enable", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new EnableAssettemplateResponse({}));
  }

  /**
   * Description: 上传文件
   * Summary: 上传文件
   */
  async updateDocumentFile(request: UpdateDocumentFileRequest): Promise<UpdateDocumentFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateDocumentFileEx(request, headers, runtime);
  }

  /**
   * Description: 上传文件
   * Summary: 上传文件
   */
  async updateDocumentFileEx(request: UpdateDocumentFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateDocumentFileResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateDocumentFileResponse>(await this.doRequest("1.0", "blockchain.propertychain.document.file.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateDocumentFileResponse({}));
  }

  /**
   * Description: 根据文件id查找文件
   * Summary: 根据文件id查找文件
   */
  async getDocumentFile(request: GetDocumentFileRequest): Promise<GetDocumentFileResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.getDocumentFileEx(request, headers, runtime);
  }

  /**
   * Description: 根据文件id查找文件
   * Summary: 根据文件id查找文件
   */
  async getDocumentFileEx(request: GetDocumentFileRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<GetDocumentFileResponse> {
    Util.validateModel(request);
    return $tea.cast<GetDocumentFileResponse>(await this.doRequest("1.0", "blockchain.propertychain.document.file.get", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new GetDocumentFileResponse({}));
  }

  /**
   * Description: 用户注销
   * Summary: 用户注销
   */
  async cancelUser(request: CancelUserRequest): Promise<CancelUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelUserEx(request, headers, runtime);
  }

  /**
   * Description: 用户注销
   * Summary: 用户注销
   */
  async cancelUserEx(request: CancelUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelUserResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelUserResponse>(await this.doRequest("1.0", "blockchain.propertychain.user.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelUserResponse({}));
  }

  /**
   * Description: 更新用户信息
   * Summary: 更新用户信息
   */
  async updateUser(request: UpdateUserRequest): Promise<UpdateUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.updateUserEx(request, headers, runtime);
  }

  /**
   * Description: 更新用户信息
   * Summary: 更新用户信息
   */
  async updateUserEx(request: UpdateUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<UpdateUserResponse> {
    Util.validateModel(request);
    return $tea.cast<UpdateUserResponse>(await this.doRequest("1.0", "blockchain.propertychain.user.update", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new UpdateUserResponse({}));
  }

  /**
   * Description: 查询用户信息列表
   * Summary: 查询用户信息列表
   */
  async listUser(request: ListUserRequest): Promise<ListUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listUserEx(request, headers, runtime);
  }

  /**
   * Description: 查询用户信息列表
   * Summary: 查询用户信息列表
   */
  async listUserEx(request: ListUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListUserResponse> {
    Util.validateModel(request);
    return $tea.cast<ListUserResponse>(await this.doRequest("1.0", "blockchain.propertychain.user.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListUserResponse({}));
  }

  /**
   * Description: 映射用户信息
   * Summary: 映射用户信息
   */
  async mountUser(request: MountUserRequest): Promise<MountUserResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.mountUserEx(request, headers, runtime);
  }

  /**
   * Description: 映射用户信息
   * Summary: 映射用户信息
   */
  async mountUserEx(request: MountUserRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<MountUserResponse> {
    Util.validateModel(request);
    return $tea.cast<MountUserResponse>(await this.doRequest("1.0", "blockchain.propertychain.user.mount", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new MountUserResponse({}));
  }

  /**
   * Description: 批量创建物权
   * Summary: 批量创建物权
   */
  async batchcreateImportasset(request: BatchcreateImportassetRequest): Promise<BatchcreateImportassetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateImportassetEx(request, headers, runtime);
  }

  /**
   * Description: 批量创建物权
   * Summary: 批量创建物权
   */
  async batchcreateImportassetEx(request: BatchcreateImportassetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateImportassetResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateImportassetResponse>(await this.doRequest("1.0", "blockchain.propertychain.importasset.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateImportassetResponse({}));
  }

  /**
   * Description: 添加物权描述信息
   * Summary: 添加物权描述信息
   */
  async describeImportasset(request: DescribeImportassetRequest): Promise<DescribeImportassetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.describeImportassetEx(request, headers, runtime);
  }

  /**
   * Description: 添加物权描述信息
   * Summary: 添加物权描述信息
   */
  async describeImportassetEx(request: DescribeImportassetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<DescribeImportassetResponse> {
    Util.validateModel(request);
    return $tea.cast<DescribeImportassetResponse>(await this.doRequest("1.0", "blockchain.propertychain.importasset.describe", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new DescribeImportassetResponse({}));
  }

  /**
   * Description: 批量冻结
   * Summary: 批量冻结
   */
  async batchfreezeImportasset(request: BatchfreezeImportassetRequest): Promise<BatchfreezeImportassetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchfreezeImportassetEx(request, headers, runtime);
  }

  /**
   * Description: 批量冻结
   * Summary: 批量冻结
   */
  async batchfreezeImportassetEx(request: BatchfreezeImportassetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchfreezeImportassetResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchfreezeImportassetResponse>(await this.doRequest("1.0", "blockchain.propertychain.importasset.batchfreeze", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchfreezeImportassetResponse({}));
  }

  /**
   * Description: 物权批量解冻
   * Summary: 物权批量解冻
   */
  async batchunfreezeImportasset(request: BatchunfreezeImportassetRequest): Promise<BatchunfreezeImportassetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchunfreezeImportassetEx(request, headers, runtime);
  }

  /**
   * Description: 物权批量解冻
   * Summary: 物权批量解冻
   */
  async batchunfreezeImportassetEx(request: BatchunfreezeImportassetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchunfreezeImportassetResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchunfreezeImportassetResponse>(await this.doRequest("1.0", "blockchain.propertychain.importasset.batchunfreeze", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchunfreezeImportassetResponse({}));
  }

  /**
   * Description: 物权批量撤销
   * Summary: 物权批量撤销
   */
  async batchcancelImportasset(request: BatchcancelImportassetRequest): Promise<BatchcancelImportassetResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcancelImportassetEx(request, headers, runtime);
  }

  /**
   * Description: 物权批量撤销
   * Summary: 物权批量撤销
   */
  async batchcancelImportassetEx(request: BatchcancelImportassetRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcancelImportassetResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcancelImportassetResponse>(await this.doRequest("1.0", "blockchain.propertychain.importasset.batchcancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcancelImportassetResponse({}));
  }

  /**
   * Description: 批量创建转让申请
   * Summary: 批量创建转让申请
   */
  async batchcreateTransfer(request: BatchcreateTransferRequest): Promise<BatchcreateTransferResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.batchcreateTransferEx(request, headers, runtime);
  }

  /**
   * Description: 批量创建转让申请
   * Summary: 批量创建转让申请
   */
  async batchcreateTransferEx(request: BatchcreateTransferRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<BatchcreateTransferResponse> {
    Util.validateModel(request);
    return $tea.cast<BatchcreateTransferResponse>(await this.doRequest("1.0", "blockchain.propertychain.transfer.batchcreate", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new BatchcreateTransferResponse({}));
  }

  /**
   * Description: 创建分润比例配置
   * Summary: 创建分润比例配置
   */
  async createCmportProfitrate(request: CreateCmportProfitrateRequest): Promise<CreateCmportProfitrateResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCmportProfitrateEx(request, headers, runtime);
  }

  /**
   * Description: 创建分润比例配置
   * Summary: 创建分润比例配置
   */
  async createCmportProfitrateEx(request: CreateCmportProfitrateRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCmportProfitrateResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCmportProfitrateResponse>(await this.doRequest("1.0", "blockchain.propertychain.cmport.profitrate.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCmportProfitrateResponse({}));
  }

  /**
   * Description: 粮达网发起融资申请，经过金融平台，然后金融平台再全量同步给区块链应用。
   * Summary: 融资申请信息落地到区块链
   */
  async applyCmportFinance(request: ApplyCmportFinanceRequest): Promise<ApplyCmportFinanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.applyCmportFinanceEx(request, headers, runtime);
  }

  /**
   * Description: 粮达网发起融资申请，经过金融平台，然后金融平台再全量同步给区块链应用。
   * Summary: 融资申请信息落地到区块链
   */
  async applyCmportFinanceEx(request: ApplyCmportFinanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ApplyCmportFinanceResponse> {
    Util.validateModel(request);
    return $tea.cast<ApplyCmportFinanceResponse>(await this.doRequest("1.0", "blockchain.propertychain.cmport.finance.apply", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ApplyCmportFinanceResponse({}));
  }

  /**
   * Description: 分润对账，企业到当前记账日期的累计利润信息
   * Summary: 企业分润对账单
   */
  async listCmportEnterprisestatement(request: ListCmportEnterprisestatementRequest): Promise<ListCmportEnterprisestatementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listCmportEnterprisestatementEx(request, headers, runtime);
  }

  /**
   * Description: 分润对账，企业到当前记账日期的累计利润信息
   * Summary: 企业分润对账单
   */
  async listCmportEnterprisestatementEx(request: ListCmportEnterprisestatementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListCmportEnterprisestatementResponse> {
    Util.validateModel(request);
    return $tea.cast<ListCmportEnterprisestatementResponse>(await this.doRequest("1.0", "blockchain.propertychain.cmport.enterprisestatement.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListCmportEnterprisestatementResponse({}));
  }

  /**
   * Description: 用户对账单
   * Summary: 用户对账单
   */
  async listCmportUserstatement(request: ListCmportUserstatementRequest): Promise<ListCmportUserstatementResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listCmportUserstatementEx(request, headers, runtime);
  }

  /**
   * Description: 用户对账单
   * Summary: 用户对账单
   */
  async listCmportUserstatementEx(request: ListCmportUserstatementRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListCmportUserstatementResponse> {
    Util.validateModel(request);
    return $tea.cast<ListCmportUserstatementResponse>(await this.doRequest("1.0", "blockchain.propertychain.cmport.userstatement.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListCmportUserstatementResponse({}));
  }

  /**
   * Description: 用户明细清单
   * Summary: 用户明细清单
   */
  async listCmportUserprofit(request: ListCmportUserprofitRequest): Promise<ListCmportUserprofitResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listCmportUserprofitEx(request, headers, runtime);
  }

  /**
   * Description: 用户明细清单
   * Summary: 用户明细清单
   */
  async listCmportUserprofitEx(request: ListCmportUserprofitRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListCmportUserprofitResponse> {
    Util.validateModel(request);
    return $tea.cast<ListCmportUserprofitResponse>(await this.doRequest("1.0", "blockchain.propertychain.cmport.userprofit.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListCmportUserprofitResponse({}));
  }

  /**
   * Description: 还款本息查询
   * Summary: 还款本息查询
   */
  async queryCmportBankfee(request: QueryCmportBankfeeRequest): Promise<QueryCmportBankfeeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.queryCmportBankfeeEx(request, headers, runtime);
  }

  /**
   * Description: 还款本息查询
   * Summary: 还款本息查询
   */
  async queryCmportBankfeeEx(request: QueryCmportBankfeeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<QueryCmportBankfeeResponse> {
    Util.validateModel(request);
    return $tea.cast<QueryCmportBankfeeResponse>(await this.doRequest("1.0", "blockchain.propertychain.cmport.bankfee.query", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new QueryCmportBankfeeResponse({}));
  }

  /**
   * Description: 创建分润归属配置
   * Summary: 创建分润归属配置
   */
  async createCmportProfitpartner(request: CreateCmportProfitpartnerRequest): Promise<CreateCmportProfitpartnerResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.createCmportProfitpartnerEx(request, headers, runtime);
  }

  /**
   * Description: 创建分润归属配置
   * Summary: 创建分润归属配置
   */
  async createCmportProfitpartnerEx(request: CreateCmportProfitpartnerRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CreateCmportProfitpartnerResponse> {
    Util.validateModel(request);
    return $tea.cast<CreateCmportProfitpartnerResponse>(await this.doRequest("1.0", "blockchain.propertychain.cmport.profitpartner.create", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CreateCmportProfitpartnerResponse({}));
  }

  /**
   * Description: 监管方（粮达网）撤销融资申请
   * Summary: 撤销融资申请
   */
  async cancelCmportFinance(request: CancelCmportFinanceRequest): Promise<CancelCmportFinanceResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.cancelCmportFinanceEx(request, headers, runtime);
  }

  /**
   * Description: 监管方（粮达网）撤销融资申请
   * Summary: 撤销融资申请
   */
  async cancelCmportFinanceEx(request: CancelCmportFinanceRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<CancelCmportFinanceResponse> {
    Util.validateModel(request);
    return $tea.cast<CancelCmportFinanceResponse>(await this.doRequest("1.0", "blockchain.propertychain.cmport.finance.cancel", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new CancelCmportFinanceResponse({}));
  }

  /**
   * Description: 银行融资审核结果同步
   * Summary: 银行融资审核结果同步
   */
  async notifyCmportBank(request: NotifyCmportBankRequest): Promise<NotifyCmportBankResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.notifyCmportBankEx(request, headers, runtime);
  }

  /**
   * Description: 银行融资审核结果同步
   * Summary: 银行融资审核结果同步
   */
  async notifyCmportBankEx(request: NotifyCmportBankRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<NotifyCmportBankResponse> {
    Util.validateModel(request);
    return $tea.cast<NotifyCmportBankResponse>(await this.doRequest("1.0", "blockchain.propertychain.cmport.bank.notify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new NotifyCmportBankResponse({}));
  }

  /**
   * Description: 银行放款结果同步给区块链
   * Summary: 银行放款结果同步给区块链
   */
  async notifyCmportLoan(request: NotifyCmportLoanRequest): Promise<NotifyCmportLoanResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.notifyCmportLoanEx(request, headers, runtime);
  }

  /**
   * Description: 银行放款结果同步给区块链
   * Summary: 银行放款结果同步给区块链
   */
  async notifyCmportLoanEx(request: NotifyCmportLoanRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<NotifyCmportLoanResponse> {
    Util.validateModel(request);
    return $tea.cast<NotifyCmportLoanResponse>(await this.doRequest("1.0", "blockchain.propertychain.cmport.loan.notify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new NotifyCmportLoanResponse({}));
  }

  /**
   * Description: 还款结果同步给区块链
   * Summary: 还款结果同步给区块链
   */
  async notifyCmportRepay(request: NotifyCmportRepayRequest): Promise<NotifyCmportRepayResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.notifyCmportRepayEx(request, headers, runtime);
  }

  /**
   * Description: 还款结果同步给区块链
   * Summary: 还款结果同步给区块链
   */
  async notifyCmportRepayEx(request: NotifyCmportRepayRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<NotifyCmportRepayResponse> {
    Util.validateModel(request);
    return $tea.cast<NotifyCmportRepayResponse>(await this.doRequest("1.0", "blockchain.propertychain.cmport.repay.notify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new NotifyCmportRepayResponse({}));
  }

  /**
   * Description: 还款本息查询-分页
   * Summary: 还款本息查询-分页
   */
  async listCmportBankfee(request: ListCmportBankfeeRequest): Promise<ListCmportBankfeeResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.listCmportBankfeeEx(request, headers, runtime);
  }

  /**
   * Description: 还款本息查询-分页
   * Summary: 还款本息查询-分页
   */
  async listCmportBankfeeEx(request: ListCmportBankfeeRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<ListCmportBankfeeResponse> {
    Util.validateModel(request);
    return $tea.cast<ListCmportBankfeeResponse>(await this.doRequest("1.0", "blockchain.propertychain.cmport.bankfee.list", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new ListCmportBankfeeResponse({}));
  }

  /**
   * Description: 物流轨迹同步给区块链
   * Summary: 物流轨迹同步给区块链
   */
  async notifyCmportLogistics(request: NotifyCmportLogisticsRequest): Promise<NotifyCmportLogisticsResponse> {
    let runtime = new $Util.RuntimeOptions({ });
    let headers : {[key: string ]: string} = { };
    return await this.notifyCmportLogisticsEx(request, headers, runtime);
  }

  /**
   * Description: 物流轨迹同步给区块链
   * Summary: 物流轨迹同步给区块链
   */
  async notifyCmportLogisticsEx(request: NotifyCmportLogisticsRequest, headers: {[key: string ]: string}, runtime: $Util.RuntimeOptions): Promise<NotifyCmportLogisticsResponse> {
    Util.validateModel(request);
    return $tea.cast<NotifyCmportLogisticsResponse>(await this.doRequest("1.0", "blockchain.propertychain.cmport.logistics.notify", "HTTPS", "POST", `/gateway.do`, $tea.toMap(request), headers, runtime), new NotifyCmportLogisticsResponse({}));
  }

}
